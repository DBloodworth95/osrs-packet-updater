package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Pack;

public class ChaChaEngine extends Salsa20Engine {
   public void resetCounter() {
      this.engineState[12] = this.engineState[13] = 0;
   }

   public ChaChaEngine(int var1) {
      super(var1);
   }

   public String getAlgorithmName() {
      return "ChaCha" + this.rounds;
   }

   public void advanceCounter(long var1) {
      int var3 = (int)(var1 >>> 32);
      int var4 = (int)var1;
      int[] var10000;
      if (var3 > 0) {
         var10000 = this.engineState;
         var10000[13] += var3;
      }

      int var5 = this.engineState[12];
      var10000 = this.engineState;
      var10000[12] += var4;
      if (var5 != 0 && this.engineState[12] < var5) {
         int var10002 = this.engineState[13]++;
      }

   }

   public void advanceCounter() {
      if (++this.engineState[12] == 0) {
         int var10002 = this.engineState[13]++;
      }

   }

   public ChaChaEngine() {
   }

   public void generateKeyStream(byte[] var1) {
      chachaCore(this.rounds, this.engineState, this.x);
      Pack.intToLittleEndian(this.x, var1, 0);
   }

   public void retreatCounter(long var1) {
      int var3 = (int)(var1 >>> 32);
      int var4 = (int)var1;
      int[] var10000;
      if (var3 != 0) {
         if (((long)this.engineState[13] & 4294967295L) < ((long)var3 & 4294967295L)) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
         }

         var10000 = this.engineState;
         var10000[13] -= var3;
      }

      if (((long)this.engineState[12] & 4294967295L) >= ((long)var4 & 4294967295L)) {
         var10000 = this.engineState;
         var10000[12] -= var4;
      } else {
         if (this.engineState[13] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
         }

         int var10002 = this.engineState[13]--;
         var10000 = this.engineState;
         var10000[12] -= var4;
      }

   }

   public void retreatCounter() {
      if (this.engineState[12] == 0 && this.engineState[13] == 0) {
         throw new IllegalStateException("attempt to reduce counter past zero.");
      } else {
         if (--this.engineState[12] == -1) {
            int var10002 = this.engineState[13]--;
         }

      }
   }

   public void setKey(byte[] var1, byte[] var2) {
      if (var1 != null) {
         if (var1.length != 16 && var1.length != 32) {
            throw new IllegalArgumentException(this.getAlgorithmName() + " requires 128 bit or 256 bit key");
         }

         this.packTauOrSigma(var1.length, this.engineState, 0);
         Pack.littleEndianToInt(var1, 0, this.engineState, 4, 4);
         Pack.littleEndianToInt(var1, var1.length - 16, this.engineState, 8, 4);
      }

      Pack.littleEndianToInt(var2, 0, this.engineState, 14, 2);
   }

   public long getCounter() {
      return (long)this.engineState[13] << 32 | (long)this.engineState[12] & 4294967295L;
   }

   public static void chachaCore(int var0, int[] var1, int[] var2) {
      if (var1.length != 16) {
         throw new IllegalArgumentException();
      } else if (var2.length != 16) {
         throw new IllegalArgumentException();
      } else if (var0 % 2 != 0) {
         throw new IllegalArgumentException("Number of rounds must be even");
      } else {
         int var3 = var1[0];
         int var4 = var1[1];
         int var5 = var1[2];
         int var6 = var1[3];
         int var7 = var1[4];
         int var8 = var1[5];
         int var9 = var1[6];
         int var10 = var1[7];
         int var11 = var1[8];
         int var12 = var1[9];
         int var13 = var1[10];
         int var14 = var1[11];
         int var15 = var1[12];
         int var16 = var1[13];
         int var17 = var1[14];
         int var18 = var1[15];

         for(int var19 = var0; var19 > 0; var19 -= 2) {
            var3 += var7;
            var15 = rotl(var15 ^ var3, 16);
            var11 += var15;
            var7 = rotl(var7 ^ var11, 12);
            var3 += var7;
            var15 = rotl(var15 ^ var3, 8);
            var11 += var15;
            var7 = rotl(var7 ^ var11, 7);
            var4 += var8;
            var16 = rotl(var16 ^ var4, 16);
            var12 += var16;
            var8 = rotl(var8 ^ var12, 12);
            var4 += var8;
            var16 = rotl(var16 ^ var4, 8);
            var12 += var16;
            var8 = rotl(var8 ^ var12, 7);
            var5 += var9;
            var17 = rotl(var17 ^ var5, 16);
            var13 += var17;
            var9 = rotl(var9 ^ var13, 12);
            var5 += var9;
            var17 = rotl(var17 ^ var5, 8);
            var13 += var17;
            var9 = rotl(var9 ^ var13, 7);
            var6 += var10;
            var18 = rotl(var18 ^ var6, 16);
            var14 += var18;
            var10 = rotl(var10 ^ var14, 12);
            var6 += var10;
            var18 = rotl(var18 ^ var6, 8);
            var14 += var18;
            var10 = rotl(var10 ^ var14, 7);
            var3 += var8;
            var18 = rotl(var18 ^ var3, 16);
            var13 += var18;
            var8 = rotl(var8 ^ var13, 12);
            var3 += var8;
            var18 = rotl(var18 ^ var3, 8);
            var13 += var18;
            var8 = rotl(var8 ^ var13, 7);
            var4 += var9;
            var15 = rotl(var15 ^ var4, 16);
            var14 += var15;
            var9 = rotl(var9 ^ var14, 12);
            var4 += var9;
            var15 = rotl(var15 ^ var4, 8);
            var14 += var15;
            var9 = rotl(var9 ^ var14, 7);
            var5 += var10;
            var16 = rotl(var16 ^ var5, 16);
            var11 += var16;
            var10 = rotl(var10 ^ var11, 12);
            var5 += var10;
            var16 = rotl(var16 ^ var5, 8);
            var11 += var16;
            var10 = rotl(var10 ^ var11, 7);
            var6 += var7;
            var17 = rotl(var17 ^ var6, 16);
            var12 += var17;
            var7 = rotl(var7 ^ var12, 12);
            var6 += var7;
            var17 = rotl(var17 ^ var6, 8);
            var12 += var17;
            var7 = rotl(var7 ^ var12, 7);
         }

         var2[0] = var3 + var1[0];
         var2[1] = var4 + var1[1];
         var2[2] = var5 + var1[2];
         var2[3] = var6 + var1[3];
         var2[4] = var7 + var1[4];
         var2[5] = var8 + var1[5];
         var2[6] = var9 + var1[6];
         var2[7] = var10 + var1[7];
         var2[8] = var11 + var1[8];
         var2[9] = var12 + var1[9];
         var2[10] = var13 + var1[10];
         var2[11] = var14 + var1[11];
         var2[12] = var15 + var1[12];
         var2[13] = var16 + var1[13];
         var2[14] = var17 + var1[14];
         var2[15] = var18 + var1[15];
      }
   }
}
