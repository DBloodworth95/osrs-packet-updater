package org.bouncycastle.crypto.util;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAPublicKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.DHPublicKey;
import org.bouncycastle.asn1.x9.DomainParameters;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.ValidationParams;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

public class PublicKeyFactory {
   public static AsymmetricKeyParameter createKey(InputStream var0) throws IOException {
      return createKey(SubjectPublicKeyInfo.getInstance((new ASN1InputStream(var0)).readObject()));
   }

   public static AsymmetricKeyParameter createKey(byte[] var0) throws IOException {
      return createKey(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(var0)));
   }

   public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo var0) throws IOException {
      AlgorithmIdentifier var1 = var0.getAlgorithm();
      if (!var1.getAlgorithm().equals(PKCSObjectIdentifiers.rsaEncryption) && !var1.getAlgorithm().equals(X509ObjectIdentifiers.id_ea_rsa)) {
         if (var1.getAlgorithm().equals(X9ObjectIdentifiers.dhpublicnumber)) {
            DHPublicKey var18 = DHPublicKey.getInstance(var0.parsePublicKey());
            BigInteger var22 = var18.getY();
            DomainParameters var26 = DomainParameters.getInstance(var1.getParameters());
            BigInteger var27 = var26.getP();
            BigInteger var29 = var26.getG();
            BigInteger var7 = var26.getQ();
            BigInteger var8 = null;
            if (var26.getJ() != null) {
               var8 = var26.getJ();
            }

            DHValidationParameters var9 = null;
            ValidationParams var10 = var26.getValidationParams();
            if (var10 != null) {
               byte[] var11 = var10.getSeed();
               BigInteger var12 = var10.getPgenCounter();
               var9 = new DHValidationParameters(var11, var12.intValue());
            }

            return new DHPublicKeyParameters(var22, new DHParameters(var27, var29, var7, var8, var9));
         } else {
            ASN1Integer var19;
            if (var1.getAlgorithm().equals(PKCSObjectIdentifiers.dhKeyAgreement)) {
               DHParameter var16 = DHParameter.getInstance(var1.getParameters());
               var19 = (ASN1Integer)var0.parsePublicKey();
               BigInteger var24 = var16.getL();
               int var25 = var24 == null ? 0 : var24.intValue();
               DHParameters var28 = new DHParameters(var16.getP(), var16.getG(), (BigInteger)null, var25);
               return new DHPublicKeyParameters(var19.getValue(), var28);
            } else if (var1.getAlgorithm().equals(OIWObjectIdentifiers.elGamalAlgorithm)) {
               ElGamalParameter var15 = ElGamalParameter.getInstance(var1.getParameters());
               var19 = (ASN1Integer)var0.parsePublicKey();
               return new ElGamalPublicKeyParameters(var19.getValue(), new ElGamalParameters(var15.getP(), var15.getG()));
            } else if (!var1.getAlgorithm().equals(X9ObjectIdentifiers.id_dsa) && !var1.getAlgorithm().equals(OIWObjectIdentifiers.dsaWithSHA1)) {
               if (var1.getAlgorithm().equals(X9ObjectIdentifiers.id_ecPublicKey)) {
                  X962Parameters var14 = X962Parameters.getInstance(var1.getParameters());
                  X9ECParameters var17;
                  Object var20;
                  if (var14.isNamedCurve()) {
                     ASN1ObjectIdentifier var21 = (ASN1ObjectIdentifier)var14.getParameters();
                     var17 = CustomNamedCurves.getByOID(var21);
                     if (var17 == null) {
                        var17 = ECNamedCurveTable.getByOID(var21);
                     }

                     var20 = new ECNamedDomainParameters(var21, var17.getCurve(), var17.getG(), var17.getN(), var17.getH(), var17.getSeed());
                  } else {
                     var17 = X9ECParameters.getInstance(var14.getParameters());
                     var20 = new ECDomainParameters(var17.getCurve(), var17.getG(), var17.getN(), var17.getH(), var17.getSeed());
                  }

                  DEROctetString var23 = new DEROctetString(var0.getPublicKeyData().getBytes());
                  X9ECPoint var6 = new X9ECPoint(var17.getCurve(), var23);
                  return new ECPublicKeyParameters(var6.getPoint(), (ECDomainParameters)var20);
               } else {
                  throw new RuntimeException("algorithm identifier in key not recognised");
               }
            } else {
               ASN1Integer var13 = (ASN1Integer)var0.parsePublicKey();
               ASN1Encodable var3 = var1.getParameters();
               DSAParameters var4 = null;
               if (var3 != null) {
                  DSAParameter var5 = DSAParameter.getInstance(var3.toASN1Primitive());
                  var4 = new DSAParameters(var5.getP(), var5.getQ(), var5.getG());
               }

               return new DSAPublicKeyParameters(var13.getValue(), var4);
            }
         }
      } else {
         RSAPublicKey var2 = RSAPublicKey.getInstance(var0.parsePublicKey());
         return new RSAKeyParameters(false, var2.getModulus(), var2.getPublicExponent());
      }
   }
}
