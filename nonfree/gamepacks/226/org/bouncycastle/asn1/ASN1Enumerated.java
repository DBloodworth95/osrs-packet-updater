package org.bouncycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

public class ASN1Enumerated extends ASN1Primitive {
   static ASN1Enumerated[] cache = new ASN1Enumerated[12];
   final byte[] bytes;

   public int amb() {
      return Arrays.hashCode(this.bytes);
   }

   public static ASN1Enumerated getInstance(ASN1TaggedObject var0, boolean var1) {
      ASN1Primitive var2 = var0.getObject();
      return !var1 && !(var2 instanceof ASN1Enumerated) ? fromOctetString(((ASN1OctetString)var2).getOctets()) : getInstance(var2);
   }

   public ASN1Enumerated(int var1) {
      this.bytes = BigInteger.valueOf((long)var1).toByteArray();
   }

   public ASN1Enumerated(BigInteger var1) {
      this.bytes = var1.toByteArray();
   }

   public ASN1Enumerated(byte[] var1) {
      if (var1.length > 1) {
         if (var1[0] == 0 && (var1[1] & 128) == 0) {
            throw new IllegalArgumentException("malformed enumerated");
         }

         if (var1[0] == -1 && (var1[1] & 128) != 0) {
            throw new IllegalArgumentException("malformed enumerated");
         }
      }

      this.bytes = Arrays.clone(var1);
   }

   boolean asn1Equals(ASN1Primitive var1) {
      if (!(var1 instanceof ASN1Enumerated)) {
         return false;
      } else {
         ASN1Enumerated var2 = (ASN1Enumerated)var1;
         return Arrays.areEqual(this.bytes, var2.bytes);
      }
   }

   boolean isConstructed() {
      return false;
   }

   public int aml() {
      return Arrays.hashCode(this.bytes);
   }

   int encodedLength() {
      return 1 + StreamUtil.calculateBodyLength(this.bytes.length) + this.bytes.length;
   }

   public BigInteger getValue() {
      return new BigInteger(this.bytes);
   }

   public int hashCode() {
      return Arrays.hashCode(this.bytes);
   }

   static ASN1Enumerated fromOctetString(byte[] var0) {
      if (var0.length > 1) {
         return new ASN1Enumerated(var0);
      } else if (var0.length == 0) {
         throw new IllegalArgumentException("ENUMERATED has zero length");
      } else {
         int var1 = var0[0] & 255;
         if (var1 >= cache.length) {
            return new ASN1Enumerated(Arrays.clone(var0));
         } else {
            ASN1Enumerated var2 = cache[var1];
            if (var2 == null) {
               var2 = cache[var1] = new ASN1Enumerated(Arrays.clone(var0));
            }

            return var2;
         }
      }
   }

   public int ams() {
      return Arrays.hashCode(this.bytes);
   }

   public int amf() {
      return Arrays.hashCode(this.bytes);
   }

   void encode(ASN1OutputStream var1) throws IOException {
      var1.writeEncoded(10, this.bytes);
   }

   public int amg() {
      return Arrays.hashCode(this.bytes);
   }

   public static ASN1Enumerated getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof ASN1Enumerated)) {
         if (var0 instanceof byte[]) {
            try {
               return (ASN1Enumerated)fromByteArray((byte[])((byte[])var0));
            } catch (Exception var2) {
               throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
         } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (ASN1Enumerated)var0;
      }
   }
}
