package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class SICBlockCipher extends StreamBlockCipher implements SkippingStreamCipher {
   int byteCount;
   final int blockSize;
   byte[] counterOut;
   byte[] counter;
   final BlockCipher cipher;
   byte[] IV;

   public int processBlock(byte[] var1, int var2, byte[] var3, int var4) throws DataLengthException, IllegalStateException {
      this.processBytes(var1, var2, this.blockSize, var3, var4);
      return this.blockSize;
   }

   public void init(boolean var1, CipherParameters var2) throws IllegalArgumentException {
      if (var2 instanceof ParametersWithIV) {
         ParametersWithIV var3 = (ParametersWithIV)var2;
         this.IV = Arrays.clone(var3.getIV());
         if (this.blockSize < this.IV.length) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.blockSize + " bytes.");
         } else {
            int var4 = 8 > this.blockSize / 2 ? this.blockSize / 2 : 8;
            if (this.blockSize - this.IV.length > var4) {
               throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.blockSize - var4) + " bytes.");
            } else {
               if (var3.getParameters() != null) {
                  this.cipher.init(true, var3.getParameters());
               }

               this.reset();
            }
         }
      } else {
         throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
      }
   }

   public String getAlgorithmName() {
      return this.cipher.getAlgorithmName() + "/SIC";
   }

   public int getBlockSize() {
      return this.cipher.getBlockSize();
   }

   void adjustCounter(long var1) {
      long var3;
      long var5;
      int var7;
      long var8;
      if (var1 >= 0L) {
         var3 = (var1 + (long)this.byteCount) / (long)this.blockSize;
         var5 = var3;
         if (var3 > 255L) {
            for(var7 = 5; var7 >= 1; --var7) {
               for(var8 = 1L << 8 * var7; var5 >= var8; var5 -= var8) {
                  this.incrementCounterAt(var7);
               }
            }
         }

         this.incrementCounter((int)var5);
         this.byteCount = (int)(var1 + (long)this.byteCount - (long)this.blockSize * var3);
      } else {
         var3 = (-var1 - (long)this.byteCount) / (long)this.blockSize;
         var5 = var3;
         if (var3 > 255L) {
            for(var7 = 5; var7 >= 1; --var7) {
               for(var8 = 1L << 8 * var7; var5 > var8; var5 -= var8) {
                  this.decrementCounterAt(var7);
               }
            }
         }

         for(long var10 = 0L; var10 != var5; ++var10) {
            this.decrementCounterAt(0);
         }

         var7 = (int)((long)this.byteCount + var1 + (long)this.blockSize * var3);
         if (var7 >= 0) {
            this.byteCount = 0;
         } else {
            this.decrementCounterAt(0);
            this.byteCount = this.blockSize + var7;
         }
      }

   }

   public byte calculateByte(byte var1) throws DataLengthException, IllegalStateException {
      if (this.byteCount == 0) {
         this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
         return (byte)(this.counterOut[this.byteCount++] ^ var1);
      } else {
         byte var2 = (byte)(this.counterOut[this.byteCount++] ^ var1);
         if (this.byteCount == this.counter.length) {
            this.byteCount = 0;
            this.incrementCounterAt(0);
            this.checkCounter();
         }

         return var2;
      }
   }

   public void reset() {
      Arrays.fill((byte[])this.counter, (byte)0);
      System.arraycopy(this.IV, 0, this.counter, 0, this.IV.length);
      this.cipher.reset();
      this.byteCount = 0;
   }

   void incrementCounterAt(int var1) {
      int var2 = this.counter.length - var1;

      do {
         --var2;
      } while(var2 >= 0 && ++this.counter[var2] == 0);

   }

   void incrementCounter(int var1) {
      byte var2 = this.counter[this.counter.length - 1];
      byte[] var10000 = this.counter;
      int var10001 = this.counter.length - 1;
      var10000[var10001] = (byte)(var10000[var10001] + var1);
      if (var2 != 0 && this.counter[this.counter.length - 1] < var2) {
         this.incrementCounterAt(1);
      }

   }

   void decrementCounterAt(int var1) {
      int var2 = this.counter.length - var1;

      do {
         --var2;
         if (var2 < 0) {
            return;
         }
      } while(--this.counter[var2] == -1);

   }

   public long getPosition() {
      byte[] var1 = new byte[this.counter.length];
      System.arraycopy(this.counter, 0, var1, 0, var1.length);

      for(int var2 = var1.length - 1; var2 >= 1; --var2) {
         int var3;
         if (var2 < this.IV.length) {
            var3 = (var1[var2] & 255) - (this.IV[var2] & 255);
         } else {
            var3 = var1[var2] & 255;
         }

         if (var3 < 0) {
            --var1[var2 - 1];
            var3 += 256;
         }

         var1[var2] = (byte)var3;
      }

      return Pack.bigEndianToLong(var1, var1.length - 8) * (long)this.blockSize + (long)this.byteCount;
   }

   void checkCounter() {
      if (this.IV.length < this.blockSize) {
         for(int var1 = 0; var1 != this.IV.length; ++var1) {
            if (this.counter[var1] != this.IV[var1]) {
               throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
            }
         }
      }

   }

   public long skip(long var1) {
      this.adjustCounter(var1);
      this.checkCounter();
      this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
      return var1;
   }

   public long seekTo(long var1) {
      this.reset();
      return this.skip(var1);
   }

   public SICBlockCipher(BlockCipher var1) {
      super(var1);
      this.cipher = var1;
      this.blockSize = this.cipher.getBlockSize();
      this.IV = new byte[this.blockSize];
      this.counter = new byte[this.blockSize];
      this.counterOut = new byte[this.blockSize];
      this.byteCount = 0;
   }
}
