package org.bouncycastle.asn1;

import java.util.Enumeration;
import java.util.Vector;

public class ASN1EncodableVector {
   final Vector v = new Vector();

   public int size() {
      return this.v.size();
   }

   public void addAll(ASN1EncodableVector var1) {
      Enumeration var2 = var1.v.elements();

      while(var2.hasMoreElements()) {
         this.v.addElement(var2.nextElement());
      }

   }

   public ASN1Encodable get(int var1) {
      return (ASN1Encodable)this.v.elementAt(var1);
   }

   public void add(ASN1Encodable var1) {
      this.v.addElement(var1);
   }
}
