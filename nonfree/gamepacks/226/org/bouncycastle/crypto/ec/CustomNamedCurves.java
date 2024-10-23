package org.bouncycastle.crypto.ec;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.endo.GLVTypeBEndomorphism;
import org.bouncycastle.math.ec.endo.GLVTypeBParameters;
import org.bouncycastle.util.Strings;

public class CustomNamedCurves {
   static X9ECParametersHolder sect113r1 = new CustomNamedCurves$14();
   static final Hashtable nameToOID = new Hashtable();
   static X9ECParametersHolder secp160k1 = new CustomNamedCurves$3();
   static X9ECParametersHolder secp160r1 = new CustomNamedCurves$4();
   static X9ECParametersHolder sect131r1 = new CustomNamedCurves$16();
   static X9ECParametersHolder secp256r1 = new CustomNamedCurves$11();
   static X9ECParametersHolder secp192r1 = new CustomNamedCurves$7();
   static X9ECParametersHolder secp224k1 = new CustomNamedCurves$8();
   static X9ECParametersHolder secp224r1 = new CustomNamedCurves$9();
   static X9ECParametersHolder sect233k1 = new CustomNamedCurves$23();
   static X9ECParametersHolder sect283r1 = new CustomNamedCurves$27();
   static X9ECParametersHolder secp256k1 = new CustomNamedCurves$10();
   static X9ECParametersHolder secp521r1 = new CustomNamedCurves$13();
   static X9ECParametersHolder secp192k1 = new CustomNamedCurves$6();
   static X9ECParametersHolder sect113r2 = new CustomNamedCurves$15();
   static X9ECParametersHolder secp384r1 = new CustomNamedCurves$12();
   static X9ECParametersHolder sect131r2 = new CustomNamedCurves$17();
   static X9ECParametersHolder sect163k1 = new CustomNamedCurves$18();
   static X9ECParametersHolder sect409r1 = new CustomNamedCurves$29();
   static X9ECParametersHolder sect163r2 = new CustomNamedCurves$20();
   static X9ECParametersHolder sect193r1 = new CustomNamedCurves$21();
   static X9ECParametersHolder sect193r2 = new CustomNamedCurves$22();
   static X9ECParametersHolder sect571k1 = new CustomNamedCurves$30();
   static X9ECParametersHolder sect233r1 = new CustomNamedCurves$24();
   static X9ECParametersHolder sect239k1 = new CustomNamedCurves$25();
   static X9ECParametersHolder sect283k1 = new CustomNamedCurves$26();
   static X9ECParametersHolder secp160r2 = new CustomNamedCurves$5();
   static X9ECParametersHolder sect409k1 = new CustomNamedCurves$28();
   static X9ECParametersHolder curve25519 = new CustomNamedCurves$1();
   static X9ECParametersHolder secp128r1 = new CustomNamedCurves$2();
   static X9ECParametersHolder sect571r1 = new CustomNamedCurves$31();
   static final Hashtable nameToCurve = new Hashtable();
   static X9ECParametersHolder sect163r1 = new CustomNamedCurves$19();
   static final Hashtable oidToCurve = new Hashtable();
   static final Hashtable oidToName = new Hashtable();
   static final Vector names = new Vector();

   public static ASN1ObjectIdentifier getOID(String var0) {
      return (ASN1ObjectIdentifier)nameToOID.get(Strings.toLowerCase(var0));
   }

   static ECCurve configureCurveGLV(ECCurve var0, GLVTypeBParameters var1) {
      return var0.configure().setEndomorphism(new GLVTypeBEndomorphism(var0, var1)).create();
   }

   static ECCurve configureCurve(ECCurve var0) {
      return var0;
   }

   static void defineCurve(String var0, X9ECParametersHolder var1) {
      names.addElement(var0);
      var0 = Strings.toLowerCase(var0);
      nameToCurve.put(var0, var1);
   }

   static void defineCurveAlias(String var0, ASN1ObjectIdentifier var1) {
      Object var2 = oidToCurve.get(var1);
      if (var2 == null) {
         throw new IllegalStateException();
      } else {
         var0 = Strings.toLowerCase(var0);
         nameToOID.put(var0, var1);
         nameToCurve.put(var0, var2);
      }
   }

   public static X9ECParameters getByName(String var0) {
      X9ECParametersHolder var1 = (X9ECParametersHolder)nameToCurve.get(Strings.toLowerCase(var0));
      return var1 == null ? null : var1.getParameters();
   }

   public static X9ECParameters getByOID(ASN1ObjectIdentifier var0) {
      X9ECParametersHolder var1 = (X9ECParametersHolder)oidToCurve.get(var0);
      return var1 == null ? null : var1.getParameters();
   }

   static void defineCurveWithOID(String var0, ASN1ObjectIdentifier var1, X9ECParametersHolder var2) {
      names.addElement(var0);
      oidToName.put(var1, var0);
      oidToCurve.put(var1, var2);
      var0 = Strings.toLowerCase(var0);
      nameToOID.put(var0, var1);
      nameToCurve.put(var0, var2);
   }

   public static String getName(ASN1ObjectIdentifier var0) {
      return (String)oidToName.get(var0);
   }

   public static Enumeration getNames() {
      return names.elements();
   }

   // $FF: synthetic method
   static ECCurve access$000(ECCurve var0) {
      return configureCurve(var0);
   }

   // $FF: synthetic method
   static ECCurve access$100(ECCurve var0, GLVTypeBParameters var1) {
      return configureCurveGLV(var0, var1);
   }

   static {
      defineCurve("curve25519", curve25519);
      defineCurveWithOID("secp128r1", SECObjectIdentifiers.secp128r1, secp128r1);
      defineCurveWithOID("secp160k1", SECObjectIdentifiers.secp160k1, secp160k1);
      defineCurveWithOID("secp160r1", SECObjectIdentifiers.secp160r1, secp160r1);
      defineCurveWithOID("secp160r2", SECObjectIdentifiers.secp160r2, secp160r2);
      defineCurveWithOID("secp192k1", SECObjectIdentifiers.secp192k1, secp192k1);
      defineCurveWithOID("secp192r1", SECObjectIdentifiers.secp192r1, secp192r1);
      defineCurveWithOID("secp224k1", SECObjectIdentifiers.secp224k1, secp224k1);
      defineCurveWithOID("secp224r1", SECObjectIdentifiers.secp224r1, secp224r1);
      defineCurveWithOID("secp256k1", SECObjectIdentifiers.secp256k1, secp256k1);
      defineCurveWithOID("secp256r1", SECObjectIdentifiers.secp256r1, secp256r1);
      defineCurveWithOID("secp384r1", SECObjectIdentifiers.secp384r1, secp384r1);
      defineCurveWithOID("secp521r1", SECObjectIdentifiers.secp521r1, secp521r1);
      defineCurveWithOID("sect113r1", SECObjectIdentifiers.sect113r1, sect113r1);
      defineCurveWithOID("sect113r2", SECObjectIdentifiers.sect113r2, sect113r2);
      defineCurveWithOID("sect131r1", SECObjectIdentifiers.sect131r1, sect131r1);
      defineCurveWithOID("sect131r2", SECObjectIdentifiers.sect131r2, sect131r2);
      defineCurveWithOID("sect163k1", SECObjectIdentifiers.sect163k1, sect163k1);
      defineCurveWithOID("sect163r1", SECObjectIdentifiers.sect163r1, sect163r1);
      defineCurveWithOID("sect163r2", SECObjectIdentifiers.sect163r2, sect163r2);
      defineCurveWithOID("sect193r1", SECObjectIdentifiers.sect193r1, sect193r1);
      defineCurveWithOID("sect193r2", SECObjectIdentifiers.sect193r2, sect193r2);
      defineCurveWithOID("sect233k1", SECObjectIdentifiers.sect233k1, sect233k1);
      defineCurveWithOID("sect233r1", SECObjectIdentifiers.sect233r1, sect233r1);
      defineCurveWithOID("sect239k1", SECObjectIdentifiers.sect239k1, sect239k1);
      defineCurveWithOID("sect283k1", SECObjectIdentifiers.sect283k1, sect283k1);
      defineCurveWithOID("sect283r1", SECObjectIdentifiers.sect283r1, sect283r1);
      defineCurveWithOID("sect409k1", SECObjectIdentifiers.sect409k1, sect409k1);
      defineCurveWithOID("sect409r1", SECObjectIdentifiers.sect409r1, sect409r1);
      defineCurveWithOID("sect571k1", SECObjectIdentifiers.sect571k1, sect571k1);
      defineCurveWithOID("sect571r1", SECObjectIdentifiers.sect571r1, sect571r1);
      defineCurveAlias("B-163", SECObjectIdentifiers.sect163r2);
      defineCurveAlias("B-233", SECObjectIdentifiers.sect233r1);
      defineCurveAlias("B-283", SECObjectIdentifiers.sect283r1);
      defineCurveAlias("B-409", SECObjectIdentifiers.sect409r1);
      defineCurveAlias("B-571", SECObjectIdentifiers.sect571r1);
      defineCurveAlias("K-163", SECObjectIdentifiers.sect163k1);
      defineCurveAlias("K-233", SECObjectIdentifiers.sect233k1);
      defineCurveAlias("K-283", SECObjectIdentifiers.sect283k1);
      defineCurveAlias("K-409", SECObjectIdentifiers.sect409k1);
      defineCurveAlias("K-571", SECObjectIdentifiers.sect571k1);
      defineCurveAlias("P-192", SECObjectIdentifiers.secp192r1);
      defineCurveAlias("P-224", SECObjectIdentifiers.secp224r1);
      defineCurveAlias("P-256", SECObjectIdentifiers.secp256r1);
      defineCurveAlias("P-384", SECObjectIdentifiers.secp384r1);
      defineCurveAlias("P-521", SECObjectIdentifiers.secp521r1);
   }
}
