package org.bouncycastle.crypto.tls;

public class ByteQueue {
   int skipped;
   static final int DEFAULT_CAPACITY = 1024;
   byte[] databuf;
   int available;

   public static int nextTwoPow(int var0) {
      var0 |= var0 >> 1;
      var0 |= var0 >> 2;
      var0 |= var0 >> 4;
      var0 |= var0 >> 8;
      var0 |= var0 >> 16;
      return var0 + 1;
   }

   /** @deprecated */
   public int size() {
      return this.available;
   }

   public ByteQueue(int var1) {
      this.skipped = 0;
      this.available = 0;
      this.databuf = new byte[var1];
   }

   public void removeData(byte[] var1, int var2, int var3, int var4) {
      this.read(var1, var2, var3, var4);
      this.removeData(var4 + var3);
   }

   public void addData(byte[] var1, int var2, int var3) {
      if (this.skipped + this.available + var3 > this.databuf.length) {
         int var4 = nextTwoPow(this.available + var3);
         if (var4 > this.databuf.length) {
            byte[] var5 = new byte[var4];
            System.arraycopy(this.databuf, this.skipped, var5, 0, this.available);
            this.databuf = var5;
         } else {
            System.arraycopy(this.databuf, this.skipped, this.databuf, 0, this.available);
         }

         this.skipped = 0;
      }

      System.arraycopy(var1, var2, this.databuf, this.skipped + this.available, var3);
      this.available += var3;
   }

   public void removeData(int var1) {
      if (var1 > this.available) {
         throw new IllegalStateException("Cannot remove " + var1 + " bytes, only got " + this.available);
      } else {
         this.available -= var1;
         this.skipped += var1;
      }
   }

   public void read(byte[] var1, int var2, int var3, int var4) {
      if (var1.length - var2 < var3) {
         throw new IllegalArgumentException("Buffer size of " + var1.length + " is too small for a read of " + var3 + " bytes");
      } else if (this.available - var4 < var3) {
         throw new IllegalStateException("Not enough data to read");
      } else {
         System.arraycopy(this.databuf, this.skipped + var4, var1, var2, var3);
      }
   }

   public byte[] removeData(int var1, int var2) {
      byte[] var3 = new byte[var1];
      this.removeData(var3, 0, var1, var2);
      return var3;
   }

   public ByteQueue() {
      this(1024);
   }

   public int available() {
      return this.available;
   }
}
