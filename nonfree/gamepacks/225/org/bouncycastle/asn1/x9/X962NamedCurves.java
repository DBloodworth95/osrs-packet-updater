package org.bouncycastle.asn1.x9;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.util.Strings;

public class X962NamedCurves {
   static X9ECParametersHolder prime239v3 = new X962NamedCurves$6();
   static X9ECParametersHolder prime192v2 = new X962NamedCurves$2();
   static X9ECParametersHolder prime192v3 = new X962NamedCurves$3();
   static X9ECParametersHolder c2tnb191v3 = new X962NamedCurves$14();
   static X9ECParametersHolder prime239v2 = new X962NamedCurves$5();
   static X9ECParametersHolder c2tnb239v1 = new X962NamedCurves$16();
   static X9ECParametersHolder prime256v1 = new X962NamedCurves$7();
   static X9ECParametersHolder c2pnb163v1 = new X962NamedCurves$8();
   static X9ECParametersHolder c2pnb163v2 = new X962NamedCurves$9();
   static X9ECParametersHolder c2tnb191v1 = new X962NamedCurves$12();
   static final Hashtable objIds = new Hashtable();
   static X9ECParametersHolder prime239v1 = new X962NamedCurves$4();
   static X9ECParametersHolder c2tnb191v2 = new X962NamedCurves$13();
   static X9ECParametersHolder c2pnb163v3 = new X962NamedCurves$10();
   static X9ECParametersHolder c2pnb208w1 = new X962NamedCurves$15();
   static X9ECParametersHolder prime192v1 = new X962NamedCurves$1();
   static X9ECParametersHolder c2tnb239v2 = new X962NamedCurves$17();
   static X9ECParametersHolder c2pnb176w1 = new X962NamedCurves$11();
   static X9ECParametersHolder c2pnb272w1 = new X962NamedCurves$19();
   static X9ECParametersHolder c2pnb304w1 = new X962NamedCurves$20();
   static X9ECParametersHolder c2tnb359v1 = new X962NamedCurves$21();
   static X9ECParametersHolder c2tnb239v3 = new X962NamedCurves$18();
   static X9ECParametersHolder c2tnb431r1 = new X962NamedCurves$23();
   static X9ECParametersHolder c2pnb368w1 = new X962NamedCurves$22();
   static final Hashtable curves = new Hashtable();
   static final Hashtable names = new Hashtable();

   public static X9ECParameters getByOID(ASN1ObjectIdentifier var0) {
      X9ECParametersHolder var1 = (X9ECParametersHolder)curves.get(var0);
      return var1 != null ? var1.getParameters() : null;
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

   static {
      defineCurve("prime192v1", X9ObjectIdentifiers.prime192v1, prime192v1);
      defineCurve("prime192v2", X9ObjectIdentifiers.prime192v2, prime192v2);
      defineCurve("prime192v3", X9ObjectIdentifiers.prime192v3, prime192v3);
      defineCurve("prime239v1", X9ObjectIdentifiers.prime239v1, prime239v1);
      defineCurve("prime239v2", X9ObjectIdentifiers.prime239v2, prime239v2);
      defineCurve("prime239v3", X9ObjectIdentifiers.prime239v3, prime239v3);
      defineCurve("prime256v1", X9ObjectIdentifiers.prime256v1, prime256v1);
      defineCurve("c2pnb163v1", X9ObjectIdentifiers.c2pnb163v1, c2pnb163v1);
      defineCurve("c2pnb163v2", X9ObjectIdentifiers.c2pnb163v2, c2pnb163v2);
      defineCurve("c2pnb163v3", X9ObjectIdentifiers.c2pnb163v3, c2pnb163v3);
      defineCurve("c2pnb176w1", X9ObjectIdentifiers.c2pnb176w1, c2pnb176w1);
      defineCurve("c2tnb191v1", X9ObjectIdentifiers.c2tnb191v1, c2tnb191v1);
      defineCurve("c2tnb191v2", X9ObjectIdentifiers.c2tnb191v2, c2tnb191v2);
      defineCurve("c2tnb191v3", X9ObjectIdentifiers.c2tnb191v3, c2tnb191v3);
      defineCurve("c2pnb208w1", X9ObjectIdentifiers.c2pnb208w1, c2pnb208w1);
      defineCurve("c2tnb239v1", X9ObjectIdentifiers.c2tnb239v1, c2tnb239v1);
      defineCurve("c2tnb239v2", X9ObjectIdentifiers.c2tnb239v2, c2tnb239v2);
      defineCurve("c2tnb239v3", X9ObjectIdentifiers.c2tnb239v3, c2tnb239v3);
      defineCurve("c2pnb272w1", X9ObjectIdentifiers.c2pnb272w1, c2pnb272w1);
      defineCurve("c2pnb304w1", X9ObjectIdentifiers.c2pnb304w1, c2pnb304w1);
      defineCurve("c2tnb359v1", X9ObjectIdentifiers.c2tnb359v1, c2tnb359v1);
      defineCurve("c2pnb368w1", X9ObjectIdentifiers.c2pnb368w1, c2pnb368w1);
      defineCurve("c2tnb431r1", X9ObjectIdentifiers.c2tnb431r1, c2tnb431r1);
   }
}
