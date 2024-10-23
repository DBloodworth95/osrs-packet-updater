package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public abstract class GeneralDigest implements ExtendedDigest, Memoable {
   static final int BYTE_LENGTH = 64;
   final byte[] xBuf = new byte[4];
   int xBufOff;
   long byteCount;

   public void update(byte[] var1, int var2, int var3) {
      var3 = Math.max(0, var3);
      int var4 = 0;
      if (this.xBufOff != 0) {
         while(var4 < var3) {
            this.xBuf[this.xBufOff++] = var1[var2 + var4++];
            if (this.xBufOff == 4) {
               this.processWord(this.xBuf, 0);
               this.xBufOff = 0;
               break;
            }
         }
      }

      for(int var5 = (var3 - var4 & -4) + var4; var4 < var5; var4 += 4) {
         this.processWord(var1, var2 + var4);
      }

      while(var4 < var3) {
         this.xBuf[this.xBufOff++] = var1[var2 + var4++];
      }

      this.byteCount += (long)var3;
   }

   public GeneralDigest(GeneralDigest var1) {
      this.copyIn(var1);
   }

   public GeneralDigest(byte[] var1) {
      System.arraycopy(var1, 0, this.xBuf, 0, this.xBuf.length);
      this.xBufOff = Pack.bigEndianToInt(var1, 4);
      this.byteCount = Pack.bigEndianToLong(var1, 8);
   }

   public void copyIn(GeneralDigest var1) {
      System.arraycopy(var1.xBuf, 0, this.xBuf, 0, var1.xBuf.length);
      this.xBufOff = var1.xBufOff;
      this.byteCount = var1.byteCount;
   }

   public GeneralDigest() {
      this.xBufOff = 0;
   }

   public void update(byte var1) {
      this.xBuf[this.xBufOff++] = var1;
      if (this.xBufOff == this.xBuf.length) {
         this.processWord(this.xBuf, 0);
         this.xBufOff = 0;
      }

      ++this.byteCount;
   }

   public void finish() {
      long var1 = this.byteCount << 3;
      this.update((byte)-128);

      while(this.xBufOff != 0) {
         this.update((byte)0);
      }

      this.processLength(var1);
      this.processBlock();
   }

   public void reset() {
      this.byteCount = 0L;
      this.xBufOff = 0;

      for(int var1 = 0; var1 < this.xBuf.length; ++var1) {
         this.xBuf[var1] = 0;
      }

   }

   public void populateState(byte[] var1) {
      System.arraycopy(this.xBuf, 0, var1, 0, this.xBufOff);
      Pack.intToBigEndian(this.xBufOff, var1, 4);
      Pack.longToBigEndian(this.byteCount, var1, 8);
   }

   public int getByteLength() {
      return 64;
   }

   public abstract void processWord(byte[] var1, int var2);

   public abstract void processLength(long var1);

   public abstract void processBlock();
}
