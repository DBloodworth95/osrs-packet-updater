package org.bouncycastle.asn1.anssi;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

public class ANSSINamedCurves {
   static final Hashtable objIds = new Hashtable();
   static final Hashtable curves = new Hashtable();
   static X9ECParametersHolder FRP256v1 = new ANSSINamedCurves$1();
   static final Hashtable names = new Hashtable();

   public static String getName(ASN1ObjectIdentifier var0) {
      return (String)names.get(var0);
   }

   static ECCurve configureCurve(ECCurve var0) {
      return var0;
   }

   public static Enumeration getNames() {
      return names.elements();
   }

   static void defineCurve(String var0, ASN1ObjectIdentifier var1, X9ECParametersHolder var2) {
      objIds.put(var0.toLowerCase(), var1);
      names.put(var1, var0);
      curves.put(var1, var2);
   }

   public static X9ECParameters getByName(String var0) {
      ASN1ObjectIdentifier var1 = getOID(var0);
      return var1 == null ? null : getByOID(var1);
   }

   static BigInteger fromHex(String var0) {
      return new BigInteger(1, Hex.decode(var0));
   }

   public static X9ECParameters getByOID(ASN1ObjectIdentifier var0) {
      X9ECParametersHolder var1 = (X9ECParametersHolder)curves.get(var0);
      return var1 == null ? null : var1.getParameters();
   }

   public static ASN1ObjectIdentifier getOID(String var0) {
      return (ASN1ObjectIdentifier)objIds.get(Strings.toLowerCase(var0));
   }

   // $FF: synthetic method
   static BigInteger access$000(String var0) {
      return fromHex(var0);
   }

   // $FF: synthetic method
   static ECCurve access$100(ECCurve var0) {
      return configureCurve(var0);
   }

   static {
      defineCurve("FRP256v1", ANSSIObjectIdentifiers.FRP256v1, FRP256v1);
   }
}
