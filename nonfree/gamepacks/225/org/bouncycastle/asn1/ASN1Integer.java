package org.bouncycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

public class ASN1Integer extends ASN1Primitive {
   final byte[] bytes;

   public String amp() {
      return this.getValue().toString();
   }

   public static ASN1Integer getInstance(ASN1TaggedObject var0, boolean var1) {
      ASN1Primitive var2 = var0.getObject();
      return !var1 && !(var2 instanceof ASN1Integer) ? new ASN1Integer(ASN1OctetString.getInstance(var0.getObject()).getOctets()) : getInstance(var2);
   }

   public static ASN1Integer getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof ASN1Integer)) {
         if (var0 instanceof byte[]) {
            try {
               return (ASN1Integer)fromByteArray((byte[])((byte[])var0));
            } catch (Exception var2) {
               throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
         } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (ASN1Integer)var0;
      }
   }

   public ASN1Integer(BigInteger var1) {
      this.bytes = var1.toByteArray();
   }

   public ASN1Integer(byte[] var1) {
      this(var1, true);
   }

   public String aml() {
      return this.getValue().toString();
   }

   public ASN1Integer(long var1) {
      this.bytes = BigInteger.valueOf(var1).toByteArray();
   }

   public BigInteger getValue() {
      return new BigInteger(this.bytes);
   }

   boolean isConstructed() {
      return false;
   }

   int encodedLength() {
      return 1 + StreamUtil.calculateBodyLength(this.bytes.length) + this.bytes.length;
   }

   void encode(ASN1OutputStream var1) throws IOException {
      var1.writeEncoded(2, this.bytes);
   }

   public int hashCode() {
      int var1 = 0;

      for(int var2 = 0; var2 != this.bytes.length; ++var2) {
         var1 ^= (this.bytes[var2] & 255) << var2 % 4;
      }

      return var1;
   }

   public BigInteger getPositiveValue() {
      return new BigInteger(1, this.bytes);
   }

   public String toString() {
      return this.getValue().toString();
   }

   public int amy() {
      int var1 = 0;

      for(int var2 = 0; var2 != this.bytes.length; ++var2) {
         var1 ^= (this.bytes[var2] & 255) << var2 % 4;
      }

      return var1;
   }

   public int amd() {
      int var1 = 0;

      for(int var2 = 0; var2 != this.bytes.length; ++var2) {
         var1 ^= (this.bytes[var2] & 255) << var2 % 4;
      }

      return var1;
   }

   ASN1Integer(byte[] var1, boolean var2) {
      if (var1.length > 1) {
         if (var1[0] == 0 && (var1[1] & 128) == 0) {
            throw new IllegalArgumentException("malformed integer");
         }

         if (var1[0] == -1 && (var1[1] & 128) != 0) {
            throw new IllegalArgumentException("malformed integer");
         }
      }

      this.bytes = var2 ? Arrays.clone(var1) : var1;
   }

   boolean asn1Equals(ASN1Primitive var1) {
      if (!(var1 instanceof ASN1Integer)) {
         return false;
      } else {
         ASN1Integer var2 = (ASN1Integer)var1;
         return Arrays.areEqual(this.bytes, var2.bytes);
      }
   }

   public String ame() {
      return this.getValue().toString();
   }
}
