package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

public class ASN1Boolean extends ASN1Primitive {
   public static final ASN1Boolean FALSE = new ASN1Boolean(false);
   static final byte[] TRUE_VALUE = new byte[]{-1};
   static final byte[] FALSE_VALUE = new byte[]{0};
   final byte[] value;
   public static final ASN1Boolean TRUE = new ASN1Boolean(true);

   public int ams() {
      return this.value[0];
   }

   public static ASN1Boolean getInstance(boolean var0) {
      return var0 ? TRUE : FALSE;
   }

   public static ASN1Boolean getInstance(int var0) {
      return var0 != 0 ? TRUE : FALSE;
   }

   public static ASN1Boolean getInstance(ASN1TaggedObject var0, boolean var1) {
      ASN1Primitive var2 = var0.getObject();
      return !var1 && !(var2 instanceof ASN1Boolean) ? fromOctetString(((ASN1OctetString)var2).getOctets()) : getInstance(var2);
   }

   ASN1Boolean(byte[] var1) {
      if (var1.length != 1) {
         throw new IllegalArgumentException("byte value should have 1 byte in it");
      } else {
         if (var1[0] == 0) {
            this.value = FALSE_VALUE;
         } else if ((var1[0] & 255) == 255) {
            this.value = TRUE_VALUE;
         } else {
            this.value = Arrays.clone(var1);
         }

      }
   }

   /** @deprecated */
   public ASN1Boolean(boolean var1) {
      this.value = var1 ? TRUE_VALUE : FALSE_VALUE;
   }

   public boolean isTrue() {
      return this.value[0] != 0;
   }

   boolean isConstructed() {
      return false;
   }

   public String toString() {
      return this.value[0] != 0 ? "TRUE" : "FALSE";
   }

   void encode(ASN1OutputStream var1) throws IOException {
      var1.writeEncoded(1, this.value);
   }

   public static ASN1Boolean getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof ASN1Boolean)) {
         if (var0 instanceof byte[]) {
            byte[] var1 = (byte[])((byte[])var0);

            try {
               return (ASN1Boolean)fromByteArray(var1);
            } catch (IOException var3) {
               throw new IllegalArgumentException("failed to construct boolean from byte[]: " + var3.getMessage());
            }
         } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (ASN1Boolean)var0;
      }
   }

   public boolean asn1Equals(ASN1Primitive var1) {
      if (var1 instanceof ASN1Boolean) {
         return this.value[0] == ((ASN1Boolean)var1).value[0];
      } else {
         return false;
      }
   }

   public String amu() {
      return this.value[0] != 0 ? "TRUE" : "FALSE";
   }

   static ASN1Boolean fromOctetString(byte[] var0) {
      if (var0.length != 1) {
         throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
      } else if (var0[0] == 0) {
         return FALSE;
      } else {
         return (var0[0] & 255) == 255 ? TRUE : new ASN1Boolean(var0);
      }
   }

   int encodedLength() {
      return 3;
   }

   public int amf() {
      return this.value[0];
   }

   public int amb() {
      return this.value[0];
   }

   public int amg() {
      return this.value[0];
   }

   public int aml() {
      return this.value[0];
   }

   public String amw() {
      return this.value[0] != 0 ? "TRUE" : "FALSE";
   }

   public int hashCode() {
      return this.value[0];
   }
}
