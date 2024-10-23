package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.endo.GLVTypeBEndomorphism;
import org.bouncycastle.math.ec.endo.GLVTypeBParameters;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

public class SECNamedCurves {
   static X9ECParametersHolder secp160r1 = new SECNamedCurves$6();
   static X9ECParametersHolder sect193r2 = new SECNamedCurves$24();
   static X9ECParametersHolder sect233k1 = new SECNamedCurves$25();
   static X9ECParametersHolder secp112r2 = new SECNamedCurves$2();
   static X9ECParametersHolder secp160k1 = new SECNamedCurves$5();
   static X9ECParametersHolder secp384r1 = new SECNamedCurves$14();
   static X9ECParametersHolder secp160r2 = new SECNamedCurves$7();
   static X9ECParametersHolder secp192k1 = new SECNamedCurves$8();
   static X9ECParametersHolder sect131r2 = new SECNamedCurves$19();
   static X9ECParametersHolder secp224k1 = new SECNamedCurves$10();
   static X9ECParametersHolder secp224r1 = new SECNamedCurves$11();
   static X9ECParametersHolder secp256k1 = new SECNamedCurves$12();
   static X9ECParametersHolder secp256r1 = new SECNamedCurves$13();
   static X9ECParametersHolder sect113r2 = new SECNamedCurves$17();
   static X9ECParametersHolder secp521r1 = new SECNamedCurves$15();
   static X9ECParametersHolder sect409k1 = new SECNamedCurves$30();
   static X9ECParametersHolder secp128r1 = new SECNamedCurves$3();
   static X9ECParametersHolder sect131r1 = new SECNamedCurves$18();
   static final Hashtable names = new Hashtable();
   static X9ECParametersHolder sect163k1 = new SECNamedCurves$20();
   static X9ECParametersHolder secp112r1 = new SECNamedCurves$1();
   static X9ECParametersHolder sect163r2 = new SECNamedCurves$22();
   static X9ECParametersHolder sect193r1 = new SECNamedCurves$23();
   static X9ECParametersHolder sect163r1 = new SECNamedCurves$21();
   static X9ECParametersHolder sect239k1 = new SECNamedCurves$27();
   static X9ECParametersHolder sect233r1 = new SECNamedCurves$26();
   static X9ECParametersHolder secp128r2 = new SECNamedCurves$4();
   static X9ECParametersHolder sect283k1 = new SECNamedCurves$28();
   static X9ECParametersHolder sect283r1 = new SECNamedCurves$29();
   static final Hashtable objIds = new Hashtable();
   static X9ECParametersHolder sect409r1 = new SECNamedCurves$31();
   static X9ECParametersHolder sect571k1 = new SECNamedCurves$32();
   static X9ECParametersHolder sect571r1 = new SECNamedCurves$33();
   static X9ECParametersHolder secp192r1 = new SECNamedCurves$9();
   static final Hashtable curves = new Hashtable();
   static X9ECParametersHolder sect113r1 = new SECNamedCurves$16();

   static {
      defineCurve("secp112r1", SECObjectIdentifiers.secp112r1, secp112r1);
      defineCurve("secp112r2", SECObjectIdentifiers.secp112r2, secp112r2);
      defineCurve("secp128r1", SECObjectIdentifiers.secp128r1, secp128r1);
      defineCurve("secp128r2", SECObjectIdentifiers.secp128r2, secp128r2);
      defineCurve("secp160k1", SECObjectIdentifiers.secp160k1, secp160k1);
      defineCurve("secp160r1", SECObjectIdentifiers.secp160r1, secp160r1);
      defineCurve("secp160r2", SECObjectIdentifiers.secp160r2, secp160r2);
      defineCurve("secp192k1", SECObjectIdentifiers.secp192k1, secp192k1);
      defineCurve("secp192r1", SECObjectIdentifiers.secp192r1, secp192r1);
      defineCurve("secp224k1", SECObjectIdentifiers.secp224k1, secp224k1);
      defineCurve("secp224r1", SECObjectIdentifiers.secp224r1, secp224r1);
      defineCurve("secp256k1", SECObjectIdentifiers.secp256k1, secp256k1);
      defineCurve("secp256r1", SECObjectIdentifiers.secp256r1, secp256r1);
      defineCurve("secp384r1", SECObjectIdentifiers.secp384r1, secp384r1);
      defineCurve("secp521r1", SECObjectIdentifiers.secp521r1, secp521r1);
      defineCurve("sect113r1", SECObjectIdentifiers.sect113r1, sect113r1);
      defineCurve("sect113r2", SECObjectIdentifiers.sect113r2, sect113r2);
      defineCurve("sect131r1", SECObjectIdentifiers.sect131r1, sect131r1);
      defineCurve("sect131r2", SECObjectIdentifiers.sect131r2, sect131r2);
      defineCurve("sect163k1", SECObjectIdentifiers.sect163k1, sect163k1);
      defineCurve("sect163r1", SECObjectIdentifiers.sect163r1, sect163r1);
      defineCurve("sect163r2", SECObjectIdentifiers.sect163r2, sect163r2);
      defineCurve("sect193r1", SECObjectIdentifiers.sect193r1, sect193r1);
      defineCurve("sect193r2", SECObjectIdentifiers.sect193r2, sect193r2);
      defineCurve("sect233k1", SECObjectIdentifiers.sect233k1, sect233k1);
      defineCurve("sect233r1", SECObjectIdentifiers.sect233r1, sect233r1);
      defineCurve("sect239k1", SECObjectIdentifiers.sect239k1, sect239k1);
      defineCurve("sect283k1", SECObjectIdentifiers.sect283k1, sect283k1);
      defineCurve("sect283r1", SECObjectIdentifiers.sect283r1, sect283r1);
      defineCurve("sect409k1", SECObjectIdentifiers.sect409k1, sect409k1);
      defineCurve("sect409r1", SECObjectIdentifiers.sect409r1, sect409r1);
      defineCurve("sect571k1", SECObjectIdentifiers.sect571k1, sect571k1);
      defineCurve("sect571r1", SECObjectIdentifiers.sect571r1, sect571r1);
   }

   static ECCurve configureCurve(ECCurve var0) {
      return var0;
   }

   static BigInteger fromHex(String var0) {
      return new BigInteger(1, Hex.decode(var0));
   }

   static void defineCurve(String var0, ASN1ObjectIdentifier var1, X9ECParametersHolder var2) {
      objIds.put(var0, var1);
      names.put(var1, var0);
      curves.put(var1, var2);
   }

   public static X9ECParameters getByName(String var0) {
      ASN1ObjectIdentifier var1 = getOID(var0);
      return var1 == null ? null : getByOID(var1);
   }

   // $FF: synthetic method
   static ECCurve access$200(ECCurve var0, GLVTypeBParameters var1) {
      return configureCurveGLV(var0, var1);
   }

   static ECCurve configureCurveGLV(ECCurve var0, GLVTypeBParameters var1) {
      return var0.configure().setEndomorphism(new GLVTypeBEndomorphism(var0, var1)).create();
   }

   public static String getName(ASN1ObjectIdentifier var0) {
      return (String)names.get(var0);
   }

   // $FF: synthetic method
   static BigInteger access$000(String var0) {
      return fromHex(var0);
   }

   public static X9ECParameters getByOID(ASN1ObjectIdentifier var0) {
      X9ECParametersHolder var1 = (X9ECParametersHolder)curves.get(var0);
      return var1 == null ? null : var1.getParameters();
   }

   // $FF: synthetic method
   static ECCurve access$100(ECCurve var0) {
      return configureCurve(var0);
   }

   public static ASN1ObjectIdentifier getOID(String var0) {
      return (ASN1ObjectIdentifier)objIds.get(Strings.toLowerCase(var0));
   }

   public static Enumeration getNames() {
      return names.elements();
   }
}
