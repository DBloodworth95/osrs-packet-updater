package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

public abstract class ASN1ApplicationSpecific extends ASN1Primitive {
   public final int tag;
   public final boolean isConstructed;
   public final byte[] octets;

   public int hashCode() {
      return (this.isConstructed ? 1 : 0) ^ this.tag ^ Arrays.hashCode(this.octets);
   }

   public int amg() {
      return (this.isConstructed ? 1 : 0) ^ this.tag ^ Arrays.hashCode(this.octets);
   }

   public static ASN1ApplicationSpecific getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof ASN1ApplicationSpecific)) {
         if (var0 instanceof byte[]) {
            try {
               return getInstance(ASN1Primitive.fromByteArray((byte[])((byte[])var0)));
            } catch (IOException var2) {
               throw new IllegalArgumentException("Failed to construct object from byte[]: " + var2.getMessage());
            }
         } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (ASN1ApplicationSpecific)var0;
      }
   }

   public boolean isConstructed() {
      return this.isConstructed;
   }

   public byte[] getContents() {
      return Arrays.clone(this.octets);
   }

   public int amb() {
      return (this.isConstructed ? 1 : 0) ^ this.tag ^ Arrays.hashCode(this.octets);
   }

   public int aml() {
      return (this.isConstructed ? 1 : 0) ^ this.tag ^ Arrays.hashCode(this.octets);
   }

   public ASN1Primitive getObject(int var1) throws IOException {
      if (var1 >= 31) {
         throw new IOException("unsupported tag number");
      } else {
         byte[] var2 = this.getEncoded();
         byte[] var3 = this.replaceTagNumber(var1, var2);
         if ((var2[0] & 32) != 0) {
            var3[0] = (byte)(var3[0] | 32);
         }

         return ASN1Primitive.fromByteArray(var3);
      }
   }

   int encodedLength() throws IOException {
      return StreamUtil.calculateTagLength(this.tag) + StreamUtil.calculateBodyLength(this.octets.length) + this.octets.length;
   }

   void encode(ASN1OutputStream var1) throws IOException {
      int var2 = 64;
      if (this.isConstructed) {
         var2 |= 32;
      }

      var1.writeEncoded(var2, this.tag, this.octets);
   }

   public static int getLengthOfHeader(byte[] var0) {
      int var1 = var0[1] & 255;
      if (var1 == 128) {
         return 2;
      } else if (var1 > 127) {
         int var2 = var1 & 127;
         if (var2 > 4) {
            throw new IllegalStateException("DER length more than 4 bytes: " + var2);
         } else {
            return var2 + 2;
         }
      } else {
         return 2;
      }
   }

   byte[] replaceTagNumber(int var1, byte[] var2) throws IOException {
      int var3 = var2[0] & 31;
      int var4 = 1;
      if (var3 == 31) {
         var3 = 0;
         int var5 = var2[var4++] & 255;
         if ((var5 & 127) == 0) {
            throw new ASN1ParsingException("corrupted stream - invalid high tag number found");
         }

         while(var5 >= 0 && (var5 & 128) != 0) {
            var3 |= var5 & 127;
            var3 <<= 7;
            var5 = var2[var4++] & 255;
         }
      }

      byte[] var6 = new byte[var2.length - var4 + 1];
      System.arraycopy(var2, var4, var6, 1, var6.length - 1);
      var6[0] = (byte)var1;
      return var6;
   }

   public ASN1Primitive getObject() throws IOException {
      return ASN1Primitive.fromByteArray(this.getContents());
   }

   public int ams() {
      return (this.isConstructed ? 1 : 0) ^ this.tag ^ Arrays.hashCode(this.octets);
   }

   public int amf() {
      return (this.isConstructed ? 1 : 0) ^ this.tag ^ Arrays.hashCode(this.octets);
   }

   ASN1ApplicationSpecific(boolean var1, int var2, byte[] var3) {
      this.isConstructed = var1;
      this.tag = var2;
      this.octets = Arrays.clone(var3);
   }

   public int getApplicationTag() {
      return this.tag;
   }

   boolean asn1Equals(ASN1Primitive var1) {
      if (!(var1 instanceof ASN1ApplicationSpecific)) {
         return false;
      } else {
         ASN1ApplicationSpecific var2 = (ASN1ApplicationSpecific)var1;
         return this.isConstructed == var2.isConstructed && this.tag == var2.tag && Arrays.areEqual(this.octets, var2.octets);
      }
   }
}
