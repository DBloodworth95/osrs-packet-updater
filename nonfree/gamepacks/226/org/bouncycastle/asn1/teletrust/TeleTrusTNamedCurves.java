package org.bouncycastle.asn1.teletrust;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Strings;

public class TeleTrusTNamedCurves {
   static X9ECParametersHolder brainpoolP256r1 = new TeleTrusTNamedCurves$7();
   static X9ECParametersHolder brainpoolP224t1 = new TeleTrusTNamedCurves$6();
   static X9ECParametersHolder brainpoolP192r1 = new TeleTrusTNamedCurves$3();
   static X9ECParametersHolder brainpoolP192t1 = new TeleTrusTNamedCurves$4();
   static X9ECParametersHolder brainpoolP224r1 = new TeleTrusTNamedCurves$5();
   static X9ECParametersHolder brainpoolP320r1 = new TeleTrusTNamedCurves$9();
   static X9ECParametersHolder brainpoolP256t1 = new TeleTrusTNamedCurves$8();
   static X9ECParametersHolder brainpoolP160r1 = new TeleTrusTNamedCurves$1();
   static final Hashtable names = new Hashtable();
   static X9ECParametersHolder brainpoolP320t1 = new TeleTrusTNamedCurves$10();
   static X9ECParametersHolder brainpoolP384r1 = new TeleTrusTNamedCurves$11();
   static X9ECParametersHolder brainpoolP384t1 = new TeleTrusTNamedCurves$12();
   static X9ECParametersHolder brainpoolP512r1 = new TeleTrusTNamedCurves$13();
   static X9ECParametersHolder brainpoolP512t1 = new TeleTrusTNamedCurves$14();
   static final Hashtable objIds = new Hashtable();
   static final Hashtable curves = new Hashtable();
   static X9ECParametersHolder brainpoolP160t1 = new TeleTrusTNamedCurves$2();

   static {
      defineCurve("brainpoolp160r1", TeleTrusTObjectIdentifiers.brainpoolP160r1, brainpoolP160r1);
      defineCurve("brainpoolp160t1", TeleTrusTObjectIdentifiers.brainpoolP160t1, brainpoolP160t1);
      defineCurve("brainpoolp192r1", TeleTrusTObjectIdentifiers.brainpoolP192r1, brainpoolP192r1);
      defineCurve("brainpoolp192t1", TeleTrusTObjectIdentifiers.brainpoolP192t1, brainpoolP192t1);
      defineCurve("brainpoolp224r1", TeleTrusTObjectIdentifiers.brainpoolP224r1, brainpoolP224r1);
      defineCurve("brainpoolp224t1", TeleTrusTObjectIdentifiers.brainpoolP224t1, brainpoolP224t1);
      defineCurve("brainpoolp256r1", TeleTrusTObjectIdentifiers.brainpoolP256r1, brainpoolP256r1);
      defineCurve("brainpoolp256t1", TeleTrusTObjectIdentifiers.brainpoolP256t1, brainpoolP256t1);
      defineCurve("brainpoolp320r1", TeleTrusTObjectIdentifiers.brainpoolP320r1, brainpoolP320r1);
      defineCurve("brainpoolp320t1", TeleTrusTObjectIdentifiers.brainpoolP320t1, brainpoolP320t1);
      defineCurve("brainpoolp384r1", TeleTrusTObjectIdentifiers.brainpoolP384r1, brainpoolP384r1);
      defineCurve("brainpoolp384t1", TeleTrusTObjectIdentifiers.brainpoolP384t1, brainpoolP384t1);
      defineCurve("brainpoolp512r1", TeleTrusTObjectIdentifiers.brainpoolP512r1, brainpoolP512r1);
      defineCurve("brainpoolp512t1", TeleTrusTObjectIdentifiers.brainpoolP512t1, brainpoolP512t1);
   }

   static ECCurve configureCurve(ECCurve var0) {
      return var0;
   }

   static void defineCurve(String var0, ASN1ObjectIdentifier var1, X9ECParametersHolder var2) {
      objIds.put(var0, var1);
      names.put(var1, var0);
      curves.put(var1, var2);
   }

   public static X9ECParameters getByName(String var0) {
      ASN1ObjectIdentifier var1 = (ASN1ObjectIdentifier)objIds.get(Strings.toLowerCase(var0));
      return var1 != null ? getByOID(var1) : null;
   }

   public static ASN1ObjectIdentifier getOID(String var0) {
      return (ASN1ObjectIdentifier)objIds.get(Strings.toLowerCase(var0));
   }

   public static String getName(ASN1ObjectIdentifier var0) {
      return (String)names.get(var0);
   }

   public static Enumeration getNames() {
      return objIds.keys();
   }

   public static ASN1ObjectIdentifier getOID(short var0, boolean var1) {
      return getOID("brainpoolP" + var0 + (var1 ? "t" : "r") + "1");
   }

   // $FF: synthetic method
   static ECCurve access$000(ECCurve var0) {
      return configureCurve(var0);
   }

   public static X9ECParameters getByOID(ASN1ObjectIdentifier var0) {
      X9ECParametersHolder var1 = (X9ECParametersHolder)curves.get(var0);
      return var1 != null ? var1.getParameters() : null;
   }
}
