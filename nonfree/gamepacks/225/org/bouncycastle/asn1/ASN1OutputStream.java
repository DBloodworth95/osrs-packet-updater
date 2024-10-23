package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

public class ASN1OutputStream {
   OutputStream os;

   void writeEncoded(int var1, int var2, byte[] var3) throws IOException {
      this.writeTag(var1, var2);
      this.writeLength(var3.length);
      this.write(var3);
   }

   void writeLength(int var1) throws IOException {
      if (var1 > 127) {
         int var2 = 1;

         for(int var3 = var1; (var3 >>>= 8) != 0; ++var2) {
         }

         this.write((byte)(var2 | 128));

         for(int var4 = (var2 - 1) * 8; var4 >= 0; var4 -= 8) {
            this.write((byte)(var1 >> var4));
         }
      } else {
         this.write((byte)var1);
      }

   }

   public void writeObject(ASN1Encodable var1) throws IOException {
      if (var1 != null) {
         var1.toASN1Primitive().encode(this);
      } else {
         throw new IOException("null object detected");
      }
   }

   void write(int var1) throws IOException {
      this.os.write(var1);
   }

   void write(byte[] var1, int var2, int var3) throws IOException {
      this.os.write(var1, var2, var3);
   }

   void writeEncoded(int var1, byte[] var2) throws IOException {
      this.write(var1);
      this.writeLength(var2.length);
      this.write(var2);
   }

   void writeTag(int var1, int var2) throws IOException {
      if (var2 < 31) {
         this.write(var1 | var2);
      } else {
         this.write(var1 | 31);
         if (var2 < 128) {
            this.write(var2);
         } else {
            byte[] var3 = new byte[5];
            int var4 = var3.length;
            --var4;
            var3[var4] = (byte)(var2 & 127);

            do {
               var2 >>= 7;
               --var4;
               var3[var4] = (byte)(var2 & 127 | 128);
            } while(var2 > 127);

            this.write(var3, var4, var3.length - var4);
         }
      }

   }

   ASN1OutputStream getDLSubStream() {
      return new DLOutputStream(this.os);
   }

   void write(byte[] var1) throws IOException {
      this.os.write(var1);
   }

   public void writeNull() throws IOException {
      this.os.write(5);
      this.os.write(0);
   }

   void writeImplicitObject(ASN1Primitive var1) throws IOException {
      if (var1 != null) {
         var1.encode(new ASN1OutputStream$ImplicitOutStream(this, this.os));
      } else {
         throw new IOException("null object detected");
      }
   }

   public void close() throws IOException {
      this.os.close();
   }

   public ASN1OutputStream(OutputStream var1) {
      this.os = var1;
   }

   ASN1OutputStream getDERSubStream() {
      return new DEROutputStream(this.os);
   }

   public void flush() throws IOException {
      this.os.flush();
   }
}
