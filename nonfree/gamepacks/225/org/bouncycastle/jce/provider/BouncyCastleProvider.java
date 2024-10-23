package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.config.ConfProvider;
import org.bouncycastle.jcajce.provider.config.ProvConf;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymKeyInfoConverter;

public final class BouncyCastleProvider extends Provider implements ConfProvider {
   static String info = "BouncyCastle Security Provider v1.56";
   static final String[] ASYMMETRIC_GENERIC = new String[]{"X509", "IES"};
   public static final ProvConf CONFIGURATION = new BCProvConf();
   static final String[] SECURE_RANDOMS = new String[]{"DRBG"};
   static final String SYMMETRIC_PACKAGE = "org.bouncycastle.jcajce.provider.symmetric.";
   static final String[] SYMMETRIC_GENERIC = new String[]{"PBEPBKDF2", "PBEPKCS12", "TLSKDF"};
   static final String[] SYMMETRIC_MACS = new String[]{"SipHash", "Poly1305"};
   static final String[] SYMMETRIC_CIPHERS = new String[]{"AES", "ARC4", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF"};
   static final String ASYMMETRIC_PACKAGE = "org.bouncycastle.jcajce.provider.asymmetric.";
   static final String KEYSTORE_PACKAGE = "org.bouncycastle.jcajce.provider.keystore.";
   static final String[] ASYMMETRIC_CIPHERS = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145"};
   static final String DIGEST_PACKAGE = "org.bouncycastle.jcajce.provider.digest.";
   static final String[] DIGESTS = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b"};
   static final Map keyInfoConverters = new HashMap();
   static final String[] KEYSTORES = new String[]{"BC", "BCFKS", "PKCS12"};
   static final String SECURE_RANDOM_PACKAGE = "org.bouncycastle.jcajce.provider.drbg.";
   public static final String PROVIDER_NAME = "BC";

   public void addKeyInfoConverter(ASN1ObjectIdentifier var1, AsymKeyInfoConverter var2) {
      synchronized(keyInfoConverters) {
         keyInfoConverters.put(var1, var2);
      }
   }

   public BouncyCastleProvider() {
      super("BC", 1.56D, info);
      AccessController.doPrivileged(new BouncyCastleProvider$1(this));
   }

   void loadAlgorithms(String var1, String[] var2) {
      for(int var3 = 0; var3 != var2.length; ++var3) {
         Class var4 = null;

         try {
            ClassLoader var5 = this.getClass().getClassLoader();
            if (var5 != null) {
               var4 = var5.loadClass(var1 + var2[var3] + "$Mappings");
            } else {
               var4 = Class.forName(var1 + var2[var3] + "$Mappings");
            }
         } catch (ClassNotFoundException var7) {
         }

         if (var4 != null) {
            try {
               ((AlgorithmProvider)var4.newInstance()).configure(this);
            } catch (Exception var6) {
               throw new InternalError("cannot create instance of " + var1 + var2[var3] + "$Mappings : " + var6);
            }
         }
      }

   }

   public void setParameter(String var1, Object var2) {
      synchronized(CONFIGURATION) {
         ((BCProvConf)CONFIGURATION).setParameter(var1, var2);
      }
   }

   public static PrivateKey getPrivateKey(PrivateKeyInfo var0) throws IOException {
      AsymKeyInfoConverter var1 = getAsymmetricKeyInfoConverter(var0.getPrivateKeyAlgorithm().getAlgorithm());
      return var1 == null ? null : var1.generatePrivate(var0);
   }

   public void addAlgorithm(String var1, String var2) {
      if (this.containsKey(var1)) {
         throw new IllegalStateException("duplicate provider key (" + var1 + ") found");
      } else {
         this.put(var1, var2);
      }
   }

   public void addAlgorithm(String var1, ASN1ObjectIdentifier var2, String var3) {
      this.addAlgorithm(var1 + "." + var2, var3);
      this.addAlgorithm(var1 + ".OID." + var2, var3);
   }

   public boolean hasAlgorithm(String var1, String var2) {
      return this.containsKey(var1 + "." + var2) || this.containsKey("Alg.Alias." + var1 + "." + var2);
   }

   static AsymKeyInfoConverter getAsymmetricKeyInfoConverter(ASN1ObjectIdentifier var0) {
      synchronized(keyInfoConverters) {
         return (AsymKeyInfoConverter)keyInfoConverters.get(var0);
      }
   }

   public static PublicKey getPublicKey(SubjectPublicKeyInfo var0) throws IOException {
      AsymKeyInfoConverter var1 = getAsymmetricKeyInfoConverter(var0.getAlgorithm().getAlgorithm());
      return var1 == null ? null : var1.generatePublic(var0);
   }

   void setup() {
      this.loadAlgorithms("org.bouncycastle.jcajce.provider.digest.", DIGESTS);
      this.loadAlgorithms("org.bouncycastle.jcajce.provider.symmetric.", SYMMETRIC_GENERIC);
      this.loadAlgorithms("org.bouncycastle.jcajce.provider.symmetric.", SYMMETRIC_MACS);
      this.loadAlgorithms("org.bouncycastle.jcajce.provider.symmetric.", SYMMETRIC_CIPHERS);
      this.loadAlgorithms("org.bouncycastle.jcajce.provider.asymmetric.", ASYMMETRIC_GENERIC);
      this.loadAlgorithms("org.bouncycastle.jcajce.provider.asymmetric.", ASYMMETRIC_CIPHERS);
      this.loadAlgorithms("org.bouncycastle.jcajce.provider.keystore.", KEYSTORES);
      this.loadAlgorithms("org.bouncycastle.jcajce.provider.drbg.", SECURE_RANDOMS);
      this.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
      this.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
      this.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
      this.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
      this.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
      this.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
      this.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
      this.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
      this.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
      this.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
      this.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
      this.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
      this.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
      this.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
      this.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
      this.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
      this.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
      this.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
      this.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
      this.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
      this.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
      this.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
      this.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
      this.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
      this.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
   }

   // $FF: synthetic method
   static void access$000(BouncyCastleProvider var0) {
      var0.setup();
   }
}
