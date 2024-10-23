package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERVisibleString extends ASN1Primitive implements ASN1String {
   final byte[] string;

   public String toString() {
      return this.getString();
   }

   DERVisibleString(byte[] var1) {
      this.string = var1;
   }

   public static DERVisibleString getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof DERVisibleString)) {
         if (var0 instanceof byte[]) {
            try {
               return (DERVisibleString)fromByteArray((byte[])((byte[])var0));
            } catch (Exception var2) {
               throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
         } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (DERVisibleString)var0;
      }
   }

   public DERVisibleString(String var1) {
      this.string = Strings.toByteArray(var1);
   }

   public String getString() {
      return Strings.fromByteArray(this.string);
   }

   public int amb() {
      return Arrays.hashCode(this.string);
   }

   public byte[] getOctets() {
      return Arrays.clone(this.string);
   }

   boolean isConstructed() {
      return false;
   }

   int encodedLength() {
      return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
   }

   void encode(ASN1OutputStream var1) throws IOException {
      var1.writeEncoded(26, this.string);
   }

   boolean asn1Equals(ASN1Primitive var1) {
      return !(var1 instanceof DERVisibleString) ? false : Arrays.areEqual(this.string, ((DERVisibleString)var1).string);
   }

   public int hashCode() {
      return Arrays.hashCode(this.string);
   }

   public int aml() {
      return Arrays.hashCode(this.string);
   }

   public int amf() {
      return Arrays.hashCode(this.string);
   }

   public int ams() {
      return Arrays.hashCode(this.string);
   }

   public int amg() {
      return Arrays.hashCode(this.string);
   }

   public static DERVisibleString getInstance(ASN1TaggedObject var0, boolean var1) {
      ASN1Primitive var2 = var0.getObject();
      return !var1 && !(var2 instanceof DERVisibleString) ? new DERVisibleString(ASN1OctetString.getInstance(var2).getOctets()) : getInstance(var2);
   }

   public String amw() {
      return this.getString();
   }

   public String amu() {
      return this.getString();
   }
}
