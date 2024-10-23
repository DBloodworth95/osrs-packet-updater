package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Enumeration;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.anssi.ANSSINamedCurves;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X962NamedCurves;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.config.ProvConf;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;

public class ECUtil {
   public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey var0) throws InvalidKeyException {
      ECParameterSpec var6;
      if (var0 instanceof ECPrivateKey) {
         ECPrivateKey var5 = (ECPrivateKey)var0;
         var6 = var5.getParameters();
         if (var6 == null) {
            var6 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
         }

         return new ECPrivateKeyParameters(var5.getD(), new ECDomainParameters(var6.getCurve(), var6.getG(), var6.getN(), var6.getH(), var6.getSeed()));
      } else if (var0 instanceof java.security.interfaces.ECPrivateKey) {
         java.security.interfaces.ECPrivateKey var4 = (java.security.interfaces.ECPrivateKey)var0;
         var6 = EC5Util.convertSpec(var4.getParams(), false);
         return new ECPrivateKeyParameters(var4.getS(), new ECDomainParameters(var6.getCurve(), var6.getG(), var6.getN(), var6.getH(), var6.getSeed()));
      } else {
         try {
            byte[] var1 = var0.getEncoded();
            if (var1 == null) {
               throw new InvalidKeyException("no encoding for EC private key");
            }

            PrivateKey var2 = BouncyCastleProvider.getPrivateKey(PrivateKeyInfo.getInstance(var1));
            if (var2 instanceof java.security.interfaces.ECPrivateKey) {
               return generatePrivateKeyParameter(var2);
            }
         } catch (Exception var3) {
            throw new InvalidKeyException("cannot identify EC private key: " + var3.toString());
         }

         throw new InvalidKeyException("can't identify EC private key.");
      }
   }

   static ASN1ObjectIdentifier lookupOidByName(String var0) {
      ASN1ObjectIdentifier var1 = X962NamedCurves.getOID(var0);
      if (var1 == null) {
         var1 = SECNamedCurves.getOID(var0);
         if (var1 == null) {
            var1 = NISTNamedCurves.getOID(var0);
         }

         if (var1 == null) {
            var1 = TeleTrusTNamedCurves.getOID(var0);
         }

         if (var1 == null) {
            var1 = ECGOST3410NamedCurves.getOID(var0);
         }

         if (var1 == null) {
            var1 = ANSSINamedCurves.getOID(var0);
         }
      }

      return var1;
   }

   public static ECDomainParameters getDomainParameters(ProvConf var0, ECParameterSpec var1) {
      Object var2;
      if (var1 instanceof ECNamedCurveParameterSpec) {
         ECNamedCurveParameterSpec var3 = (ECNamedCurveParameterSpec)var1;
         ASN1ObjectIdentifier var4 = getNamedCurveOid(var3.getName());
         var2 = new ECNamedDomainParameters(var4, var3.getCurve(), var3.getG(), var3.getN(), var3.getH(), var3.getSeed());
      } else if (var1 == null) {
         ECParameterSpec var5 = var0.getEcImplicitlyCa();
         var2 = new ECDomainParameters(var5.getCurve(), var5.getG(), var5.getN(), var5.getH(), var5.getSeed());
      } else {
         var2 = new ECDomainParameters(var1.getCurve(), var1.getG(), var1.getN(), var1.getH(), var1.getSeed());
      }

      return (ECDomainParameters)var2;
   }

   public static ECDomainParameters getDomainParameters(ProvConf var0, X962Parameters var1) {
      Object var2;
      if (var1.isNamedCurve()) {
         ASN1ObjectIdentifier var3 = ASN1ObjectIdentifier.getInstance(var1.getParameters());
         X9ECParameters var4 = getNamedCurveByOid(var3);
         if (var4 == null) {
            Map var5 = var0.getAdditionalECParameters();
            var4 = (X9ECParameters)var5.get(var3);
         }

         var2 = new ECNamedDomainParameters(var3, var4.getCurve(), var4.getG(), var4.getN(), var4.getH(), var4.getSeed());
      } else if (var1.isImplicitlyCA()) {
         ECParameterSpec var6 = var0.getEcImplicitlyCa();
         var2 = new ECDomainParameters(var6.getCurve(), var6.getG(), var6.getN(), var6.getH(), var6.getSeed());
      } else {
         X9ECParameters var7 = X9ECParameters.getInstance(var1.getParameters());
         var2 = new ECDomainParameters(var7.getCurve(), var7.getG(), var7.getN(), var7.getH(), var7.getSeed());
      }

      return (ECDomainParameters)var2;
   }

   public static X9ECParameters getNamedCurveByName(String var0) {
      X9ECParameters var1 = CustomNamedCurves.getByName(var0);
      if (var1 == null) {
         var1 = X962NamedCurves.getByName(var0);
         if (var1 == null) {
            var1 = SECNamedCurves.getByName(var0);
         }

         if (var1 == null) {
            var1 = NISTNamedCurves.getByName(var0);
         }

         if (var1 == null) {
            var1 = TeleTrusTNamedCurves.getByName(var0);
         }
      }

      return var1;
   }

   static int[] convertMidTerms(int[] var0) {
      int[] var1 = new int[3];
      if (var0.length == 1) {
         var1[0] = var0[0];
      } else {
         if (var0.length != 3) {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
         }

         if (var0[0] < var0[1] && var0[0] < var0[2]) {
            var1[0] = var0[0];
            if (var0[1] < var0[2]) {
               var1[1] = var0[1];
               var1[2] = var0[2];
            } else {
               var1[1] = var0[2];
               var1[2] = var0[1];
            }
         } else if (var0[1] < var0[2]) {
            var1[0] = var0[1];
            if (var0[0] < var0[2]) {
               var1[1] = var0[0];
               var1[2] = var0[2];
            } else {
               var1[1] = var0[2];
               var1[2] = var0[0];
            }
         } else {
            var1[0] = var0[2];
            if (var0[0] < var0[1]) {
               var1[1] = var0[0];
               var1[2] = var0[1];
            } else {
               var1[1] = var0[1];
               var1[2] = var0[0];
            }
         }
      }

      return var1;
   }

   public static int getOrderBitLength(ProvConf var0, BigInteger var1, BigInteger var2) {
      if (var1 == null) {
         ECParameterSpec var3 = var0.getEcImplicitlyCa();
         return var3 == null ? var2.bitLength() : var3.getN().bitLength();
      } else {
         return var1.bitLength();
      }
   }

   public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey var0) throws InvalidKeyException {
      ECParameterSpec var6;
      if (var0 instanceof ECPublicKey) {
         ECPublicKey var5 = (ECPublicKey)var0;
         var6 = var5.getParameters();
         return new ECPublicKeyParameters(var5.getQ(), new ECDomainParameters(var6.getCurve(), var6.getG(), var6.getN(), var6.getH(), var6.getSeed()));
      } else if (var0 instanceof java.security.interfaces.ECPublicKey) {
         java.security.interfaces.ECPublicKey var4 = (java.security.interfaces.ECPublicKey)var0;
         var6 = EC5Util.convertSpec(var4.getParams(), false);
         return new ECPublicKeyParameters(EC5Util.convertPoint(var4.getParams(), var4.getW(), false), new ECDomainParameters(var6.getCurve(), var6.getG(), var6.getN(), var6.getH(), var6.getSeed()));
      } else {
         try {
            byte[] var1 = var0.getEncoded();
            if (var1 == null) {
               throw new InvalidKeyException("no encoding for EC public key");
            }

            PublicKey var2 = BouncyCastleProvider.getPublicKey(SubjectPublicKeyInfo.getInstance(var1));
            if (var2 instanceof java.security.interfaces.ECPublicKey) {
               return generatePublicKeyParameter(var2);
            }
         } catch (Exception var3) {
            throw new InvalidKeyException("cannot identify EC public key: " + var3.toString());
         }

         throw new InvalidKeyException("cannot identify EC public key.");
      }
   }

   public static ASN1ObjectIdentifier getNamedCurveOid(String var0) {
      String var1;
      if (var0.indexOf(32) > 0) {
         var1 = var0.substring(var0.indexOf(32) + 1);
      } else {
         var1 = var0;
      }

      try {
         return var1.charAt(0) >= '0' && var1.charAt(0) <= '2' ? new ASN1ObjectIdentifier(var1) : lookupOidByName(var1);
      } catch (IllegalArgumentException var3) {
         return lookupOidByName(var1);
      }
   }

   public static X9ECParameters getNamedCurveByOid(ASN1ObjectIdentifier var0) {
      X9ECParameters var1 = CustomNamedCurves.getByOID(var0);
      if (var1 == null) {
         var1 = X962NamedCurves.getByOID(var0);
         if (var1 == null) {
            var1 = SECNamedCurves.getByOID(var0);
         }

         if (var1 == null) {
            var1 = NISTNamedCurves.getByOID(var0);
         }

         if (var1 == null) {
            var1 = TeleTrusTNamedCurves.getByOID(var0);
         }
      }

      return var1;
   }

   public static ASN1ObjectIdentifier getNamedCurveOid(ECParameterSpec var0) {
      Enumeration var1 = ECNamedCurveTable.getNames();

      String var2;
      X9ECParameters var3;
      do {
         if (!var1.hasMoreElements()) {
            return null;
         }

         var2 = (String)var1.nextElement();
         var3 = ECNamedCurveTable.getByName(var2);
      } while(!var3.getN().equals(var0.getN()) || !var3.getH().equals(var0.getH()) || !var3.getCurve().equals(var0.getCurve()) || !var3.getG().equals(var0.getG()));

      return ECNamedCurveTable.getOID(var2);
   }

   public static String getCurveName(ASN1ObjectIdentifier var0) {
      String var1 = X962NamedCurves.getName(var0);
      if (var1 == null) {
         var1 = SECNamedCurves.getName(var0);
         if (var1 == null) {
            var1 = NISTNamedCurves.getName(var0);
         }

         if (var1 == null) {
            var1 = TeleTrusTNamedCurves.getName(var0);
         }

         if (var1 == null) {
            var1 = ECGOST3410NamedCurves.getName(var0);
         }
      }

      return var1;
   }
}
