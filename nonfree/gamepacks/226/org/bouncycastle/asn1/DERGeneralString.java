package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERGeneralString extends ASN1Primitive implements ASN1String {
   final byte[] string;

   DERGeneralString(byte[] var1) {
      this.string = var1;
   }

   public static DERGeneralString getInstance(ASN1TaggedObject var0, boolean var1) {
      ASN1Primitive var2 = var0.getObject();
      return !var1 && !(var2 instanceof DERGeneralString) ? new DERGeneralString(((ASN1OctetString)var2).getOctets()) : getInstance(var2);
   }

   boolean asn1Equals(ASN1Primitive var1) {
      if (!(var1 instanceof DERGeneralString)) {
         return false;
      } else {
         DERGeneralString var2 = (DERGeneralString)var1;
         return Arrays.areEqual(this.string, var2.string);
      }
   }

   public DERGeneralString(String var1) {
      this.string = Strings.toByteArray(var1);
   }

   public String getString() {
      return Strings.fromByteArray(this.string);
   }

   public String toString() {
      return this.getString();
   }

   public byte[] getOctets() {
      return Arrays.clone(this.string);
   }

   public String amu() {
      return this.getString();
   }

   public static DERGeneralString getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof DERGeneralString)) {
         if (var0 instanceof byte[]) {
            try {
               return (DERGeneralString)fromByteArray((byte[])((byte[])var0));
            } catch (Exception var2) {
               throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
         } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (DERGeneralString)var0;
      }
   }

   void encode(ASN1OutputStream var1) throws IOException {
      var1.writeEncoded(27, this.string);
   }

   public int hashCode() {
      return Arrays.hashCode(this.string);
   }

   public String amw() {
      return this.getString();
   }

   public int ams() {
      return Arrays.hashCode(this.string);
   }

   public int amf() {
      return Arrays.hashCode(this.string);
   }

   public int amb() {
      return Arrays.hashCode(this.string);
   }

   public int amg() {
      return Arrays.hashCode(this.string);
   }

   public int aml() {
      return Arrays.hashCode(this.string);
   }

   boolean isConstructed() {
      return false;
   }

   int encodedLength() {
      return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
   }
}
