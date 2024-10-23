package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.jcajce.provider.config.ProvConf;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.Polynomial;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;

public class EC5Util {
   static Map customCurves = new HashMap();

   public static ECField convertField(FiniteField var0) {
      if (ECAlgorithms.isFpField(var0)) {
         return new ECFieldFp(var0.getCharacteristic());
      } else {
         Polynomial var1 = ((PolynomialExtensionField)var0).getMinimalPolynomial();
         int[] var2 = var1.getExponentsPresent();
         int[] var3 = Arrays.reverse(Arrays.copyOfRange((int[])var2, 1, var2.length - 1));
         return new ECFieldF2m(var1.getDegree(), var3);
      }
   }

   public static ECCurve getCurve(ProvConf var0, X962Parameters var1) {
      Set var3 = var0.getAcceptableNamedCurves();
      ECCurve var2;
      if (var1.isNamedCurve()) {
         ASN1ObjectIdentifier var4 = ASN1ObjectIdentifier.getInstance(var1.getParameters());
         if (!var3.isEmpty() && !var3.contains(var4)) {
            throw new IllegalStateException("named curve not acceptable");
         }

         X9ECParameters var5 = ECUtil.getNamedCurveByOid(var4);
         if (var5 == null) {
            var5 = (X9ECParameters)var0.getAdditionalECParameters().get(var4);
         }

         var2 = var5.getCurve();
      } else if (var1.isImplicitlyCA()) {
         var2 = var0.getEcImplicitlyCa().getCurve();
      } else {
         if (!var3.isEmpty()) {
            throw new IllegalStateException("encoded parameters not acceptable");
         }

         X9ECParameters var6 = X9ECParameters.getInstance(var1.getParameters());
         var2 = var6.getCurve();
      }

      return var2;
   }

   public static ECDomainParameters getDomainParameters(ProvConf var0, ECParameterSpec var1) {
      ECDomainParameters var2;
      if (var1 == null) {
         org.bouncycastle.jce.spec.ECParameterSpec var3 = var0.getEcImplicitlyCa();
         var2 = new ECDomainParameters(var3.getCurve(), var3.getG(), var3.getN(), var3.getH(), var3.getSeed());
      } else {
         var2 = ECUtil.getDomainParameters(var0, convertSpec(var1, false));
      }

      return var2;
   }

   public static ECParameterSpec convertSpec(EllipticCurve var0, org.bouncycastle.jce.spec.ECParameterSpec var1) {
      return (ECParameterSpec)(var1 instanceof ECNamedCurveParameterSpec ? new ECNamedCurveSpec(((ECNamedCurveParameterSpec)var1).getName(), var0, new ECPoint(var1.getG().getAffineXCoord().toBigInteger(), var1.getG().getAffineYCoord().toBigInteger()), var1.getN(), var1.getH()) : new ECParameterSpec(var0, new ECPoint(var1.getG().getAffineXCoord().toBigInteger(), var1.getG().getAffineYCoord().toBigInteger()), var1.getN(), var1.getH().intValue()));
   }

   public static ECParameterSpec convertToSpec(X9ECParameters var0) {
      return new ECParameterSpec(convertCurve(var0.getCurve(), (byte[])null), new ECPoint(var0.getG().getAffineXCoord().toBigInteger(), var0.getG().getAffineYCoord().toBigInteger()), var0.getN(), var0.getH().intValue());
   }

   public static EllipticCurve convertCurve(ECCurve var0, byte[] var1) {
      ECField var2 = convertField(var0.getField());
      BigInteger var3 = var0.getA().toBigInteger();
      BigInteger var4 = var0.getB().toBigInteger();
      return new EllipticCurve(var2, var3, var4, (byte[])null);
   }

   public static ECParameterSpec convertToSpec(X962Parameters var0, ECCurve var1) {
      Object var2;
      EllipticCurve var3;
      if (var0.isNamedCurve()) {
         ASN1ObjectIdentifier var4 = (ASN1ObjectIdentifier)var0.getParameters();
         X9ECParameters var5 = ECUtil.getNamedCurveByOid(var4);
         if (var5 == null) {
            Map var6 = BouncyCastleProvider.CONFIGURATION.getAdditionalECParameters();
            if (!var6.isEmpty()) {
               var5 = (X9ECParameters)var6.get(var4);
            }
         }

         var3 = convertCurve(var1, var5.getSeed());
         var2 = new ECNamedCurveSpec(ECUtil.getCurveName(var4), var3, new ECPoint(var5.getG().getAffineXCoord().toBigInteger(), var5.getG().getAffineYCoord().toBigInteger()), var5.getN(), var5.getH());
      } else if (var0.isImplicitlyCA()) {
         var2 = null;
      } else {
         X9ECParameters var7 = X9ECParameters.getInstance(var0.getParameters());
         var3 = convertCurve(var1, var7.getSeed());
         if (var7.getH() != null) {
            var2 = new ECParameterSpec(var3, new ECPoint(var7.getG().getAffineXCoord().toBigInteger(), var7.getG().getAffineYCoord().toBigInteger()), var7.getN(), var7.getH().intValue());
         } else {
            var2 = new ECParameterSpec(var3, new ECPoint(var7.getG().getAffineXCoord().toBigInteger(), var7.getG().getAffineYCoord().toBigInteger()), var7.getN(), 1);
         }
      }

      return (ECParameterSpec)var2;
   }

   public static ECCurve convertCurve(EllipticCurve var0) {
      ECField var1 = var0.getField();
      BigInteger var2 = var0.getA();
      BigInteger var3 = var0.getB();
      if (var1 instanceof ECFieldFp) {
         ECCurve$Fp var7 = new ECCurve$Fp(((ECFieldFp)var1).getP(), var2, var3);
         return (ECCurve)(customCurves.containsKey(var7) ? (ECCurve)customCurves.get(var7) : var7);
      } else {
         ECFieldF2m var4 = (ECFieldF2m)var1;
         int var5 = var4.getM();
         int[] var6 = ECUtil.convertMidTerms(var4.getMidTermsOfReductionPolynomial());
         return new ECCurve$F2m(var5, var6[0], var6[1], var6[2], var2, var3);
      }
   }

   public static org.bouncycastle.jce.spec.ECParameterSpec convertSpec(ECParameterSpec var0, boolean var1) {
      ECCurve var2 = convertCurve(var0.getCurve());
      return new org.bouncycastle.jce.spec.ECParameterSpec(var2, convertPoint(var2, var0.getGenerator(), var1), var0.getOrder(), BigInteger.valueOf((long)var0.getCofactor()), var0.getCurve().getSeed());
   }

   public static org.bouncycastle.math.ec.ECPoint convertPoint(ECParameterSpec var0, ECPoint var1, boolean var2) {
      return convertPoint(convertCurve(var0.getCurve()), var1, var2);
   }

   public static org.bouncycastle.math.ec.ECPoint convertPoint(ECCurve var0, ECPoint var1, boolean var2) {
      return var0.createPoint(var1.getAffineX(), var1.getAffineY());
   }

   static {
      Enumeration var0 = CustomNamedCurves.getNames();

      while(var0.hasMoreElements()) {
         String var1 = (String)var0.nextElement();
         X9ECParameters var2 = ECNamedCurveTable.getByName(var1);
         if (var2 != null) {
            customCurves.put(var2.getCurve(), CustomNamedCurves.getByName(var1).getCurve());
         }
      }

      X9ECParameters var3 = CustomNamedCurves.getByName("Curve25519");
      customCurves.put(new ECCurve$Fp(var3.getCurve().getField().getCharacteristic(), var3.getCurve().getA().toBigInteger(), var3.getCurve().getB().toBigInteger()), var3.getCurve());
   }
}
