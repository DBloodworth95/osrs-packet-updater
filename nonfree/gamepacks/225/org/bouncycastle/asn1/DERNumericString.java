package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERNumericString extends ASN1Primitive implements ASN1String {
   final byte[] string;

   public int amy() {
      return Arrays.hashCode(this.string);
   }

   public static DERNumericString getInstance(ASN1TaggedObject var0, boolean var1) {
      ASN1Primitive var2 = var0.getObject();
      return !var1 && !(var2 instanceof DERNumericString) ? new DERNumericString(ASN1OctetString.getInstance(var2).getOctets()) : getInstance(var2);
   }

   public int hashCode() {
      return Arrays.hashCode(this.string);
   }

   public DERNumericString(String var1) {
      this(var1, false);
   }

   public DERNumericString(String var1, boolean var2) {
      if (var2 && !isNumericString(var1)) {
         throw new IllegalArgumentException("string contains illegal characters");
      } else {
         this.string = Strings.toByteArray(var1);
      }
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

   DERNumericString(byte[] var1) {
      this.string = var1;
   }

   int encodedLength() {
      return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
   }

   void encode(ASN1OutputStream var1) throws IOException {
      var1.writeEncoded(18, this.string);
   }

   public static boolean isNumericString(String var0) {
      for(int var1 = var0.length() - 1; var1 >= 0; --var1) {
         char var2 = var0.charAt(var1);
         if (var2 > 127) {
            return false;
         }

         if (('0' > var2 || var2 > '9') && var2 != ' ') {
            return false;
         }
      }

      return true;
   }

   boolean asn1Equals(ASN1Primitive var1) {
      if (!(var1 instanceof DERNumericString)) {
         return false;
      } else {
         DERNumericString var2 = (DERNumericString)var1;
         return Arrays.areEqual(this.string, var2.string);
      }
   }

   boolean isConstructed() {
      return false;
   }

   public String aml() {
      return this.getString();
   }

   public int amd() {
      return Arrays.hashCode(this.string);
   }

   public String ame() {
      return this.getString();
   }

   public String amp() {
      return this.getString();
   }

   public static DERNumericString getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof DERNumericString)) {
         if (var0 instanceof byte[]) {
            try {
               return (DERNumericString)fromByteArray((byte[])((byte[])var0));
            } catch (Exception var2) {
               throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
         } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (DERNumericString)var0;
      }
   }
}
