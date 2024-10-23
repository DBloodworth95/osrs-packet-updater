package org.bouncycastle.asn1.x9;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.anssi.ANSSINamedCurves;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;

public class ECNamedCurveTable {
   public static X9ECParameters getByName(String var0) {
      X9ECParameters var1 = X962NamedCurves.getByName(var0);
      if (var1 == null) {
         var1 = SECNamedCurves.getByName(var0);
      }

      if (var1 == null) {
         var1 = NISTNamedCurves.getByName(var0);
      }

      if (var1 == null) {
         var1 = TeleTrusTNamedCurves.getByName(var0);
      }

      if (var1 == null) {
         var1 = ANSSINamedCurves.getByName(var0);
      }

      return var1;
   }

   public static String getName(ASN1ObjectIdentifier var0) {
      String var1 = NISTNamedCurves.getName(var0);
      if (var1 == null) {
         var1 = SECNamedCurves.getName(var0);
      }

      if (var1 == null) {
         var1 = TeleTrusTNamedCurves.getName(var0);
      }

      if (var1 == null) {
         var1 = X962NamedCurves.getName(var0);
      }

      if (var1 == null) {
         var1 = ECGOST3410NamedCurves.getName(var0);
      }

      return var1;
   }

   public static ASN1ObjectIdentifier getOID(String var0) {
      ASN1ObjectIdentifier var1 = X962NamedCurves.getOID(var0);
      if (var1 == null) {
         var1 = SECNamedCurves.getOID(var0);
      }

      if (var1 == null) {
         var1 = NISTNamedCurves.getOID(var0);
      }

      if (var1 == null) {
         var1 = TeleTrusTNamedCurves.getOID(var0);
      }

      if (var1 == null) {
         var1 = ANSSINamedCurves.getOID(var0);
      }

      return var1;
   }

   public static X9ECParameters getByOID(ASN1ObjectIdentifier var0) {
      X9ECParameters var1 = X962NamedCurves.getByOID(var0);
      if (var1 == null) {
         var1 = SECNamedCurves.getByOID(var0);
      }

      if (var1 == null) {
         var1 = TeleTrusTNamedCurves.getByOID(var0);
      }

      if (var1 == null) {
         var1 = ANSSINamedCurves.getByOID(var0);
      }

      return var1;
   }

   public static Enumeration getNames() {
      Vector var0 = new Vector();
      addEnumeration(var0, X962NamedCurves.getNames());
      addEnumeration(var0, SECNamedCurves.getNames());
      addEnumeration(var0, NISTNamedCurves.getNames());
      addEnumeration(var0, TeleTrusTNamedCurves.getNames());
      addEnumeration(var0, ANSSINamedCurves.getNames());
      return var0.elements();
   }

   static void addEnumeration(Vector var0, Enumeration var1) {
      while(var1.hasMoreElements()) {
         var0.addElement(var1.nextElement());
      }

   }
}
