package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat256;

public class SecT239Field {
   static final long M60 = 1152921504606846975L;
   static final long M47 = 140737488355327L;

   public static long[] fromBigInteger(BigInteger var0) {
      long[] var1 = Nat256.fromBigInteger64(var0);
      reduce17(var1, 0);
      return var1;
   }

   public static int trace(long[] var0) {
      return (int)(var0[0] ^ var0[1] >>> 17 ^ var0[2] >>> 34) & 1;
   }

   public static void addExt(long[] var0, long[] var1, long[] var2) {
      var2[0] = var0[0] ^ var1[0];
      var2[1] = var0[1] ^ var1[1];
      var2[2] = var0[2] ^ var1[2];
      var2[3] = var0[3] ^ var1[3];
      var2[4] = var0[4] ^ var1[4];
      var2[5] = var0[5] ^ var1[5];
      var2[6] = var0[6] ^ var1[6];
      var2[7] = var0[7] ^ var1[7];
   }

   public static void addOne(long[] var0, long[] var1) {
      var1[0] = var0[0] ^ 1L;
      var1[1] = var0[1];
      var1[2] = var0[2];
      var1[3] = var0[3];
   }

   public static void multiplyAddToExt(long[] var0, long[] var1, long[] var2) {
      long[] var3 = Nat256.createExt64();
      implMultiply(var0, var1, var3);
      addExt(var2, var3, var2);
   }

   public static void invert(long[] var0, long[] var1) {
      if (Nat256.isZero64(var0)) {
         throw new IllegalStateException();
      } else {
         long[] var2 = Nat256.create64();
         long[] var3 = Nat256.create64();
         square(var0, var2);
         multiply(var2, var0, var2);
         square(var2, var2);
         multiply(var2, var0, var2);
         squareN(var2, 3, var3);
         multiply(var3, var2, var3);
         square(var3, var3);
         multiply(var3, var0, var3);
         squareN(var3, 7, var2);
         multiply(var2, var3, var2);
         squareN(var2, 14, var3);
         multiply(var3, var2, var3);
         square(var3, var3);
         multiply(var3, var0, var3);
         squareN(var3, 29, var2);
         multiply(var2, var3, var2);
         square(var2, var2);
         multiply(var2, var0, var2);
         squareN(var2, 59, var3);
         multiply(var3, var2, var3);
         square(var3, var3);
         multiply(var3, var0, var3);
         squareN(var3, 119, var2);
         multiply(var2, var3, var2);
         square(var2, var1);
      }
   }

   public static void multiply(long[] var0, long[] var1, long[] var2) {
      long[] var3 = Nat256.createExt64();
      implMultiply(var0, var1, var3);
      reduce(var3, var2);
   }

   public static void add(long[] var0, long[] var1, long[] var2) {
      var2[0] = var0[0] ^ var1[0];
      var2[1] = var0[1] ^ var1[1];
      var2[2] = var0[2] ^ var1[2];
      var2[3] = var0[3] ^ var1[3];
   }

   public static void reduce(long[] var0, long[] var1) {
      long var2 = var0[0];
      long var4 = var0[1];
      long var6 = var0[2];
      long var8 = var0[3];
      long var10 = var0[4];
      long var12 = var0[5];
      long var14 = var0[6];
      long var16 = var0[7];
      var8 ^= var16 << 17;
      var10 ^= var16 >>> 47;
      var12 ^= var16 << 47;
      var14 ^= var16 >>> 17;
      var6 ^= var14 << 17;
      var8 ^= var14 >>> 47;
      var10 ^= var14 << 47;
      var12 ^= var14 >>> 17;
      var4 ^= var12 << 17;
      var6 ^= var12 >>> 47;
      var8 ^= var12 << 47;
      var10 ^= var12 >>> 17;
      var2 ^= var10 << 17;
      var4 ^= var10 >>> 47;
      var6 ^= var10 << 47;
      var8 ^= var10 >>> 17;
      long var18 = var8 >>> 47;
      var1[0] = var2 ^ var18;
      var1[1] = var4;
      var1[2] = var6 ^ var18 << 30;
      var1[3] = var8 & 140737488355327L;
   }

   public static void reduce17(long[] var0, int var1) {
      long var2 = var0[var1 + 3];
      long var4 = var2 >>> 47;
      var0[var1] ^= var4;
      var0[var1 + 2] ^= var4 << 30;
      var0[var1 + 3] = var2 & 140737488355327L;
   }

   public static void sqrt(long[] var0, long[] var1) {
      long var2 = Interleave.unshuffle(var0[0]);
      long var4 = Interleave.unshuffle(var0[1]);
      long var6 = var2 & 4294967295L | var4 << 32;
      long var8 = var2 >>> 32 | var4 & -4294967296L;
      var2 = Interleave.unshuffle(var0[2]);
      var4 = Interleave.unshuffle(var0[3]);
      long var10 = var2 & 4294967295L | var4 << 32;
      long var12 = var2 >>> 32 | var4 & -4294967296L;
      long var16 = var12 >>> 49;
      long var14 = var8 >>> 49 | var12 << 15;
      var12 ^= var8 << 15;
      long[] var18 = Nat256.createExt64();
      int[] var19 = new int[]{39, 120};

      for(int var20 = 0; var20 < var19.length; ++var20) {
         int var21 = var19[var20] >>> 6;
         int var22 = var19[var20] & 63;
         var18[var21] ^= var8 << var22;
         var18[var21 + 1] ^= var12 << var22 | var8 >>> -var22;
         var18[var21 + 2] ^= var14 << var22 | var12 >>> -var22;
         var18[var21 + 3] ^= var16 << var22 | var14 >>> -var22;
         var18[var21 + 4] ^= var16 >>> -var22;
      }

      reduce(var18, var1);
      var1[0] ^= var6;
      var1[1] ^= var10;
   }

   public static void square(long[] var0, long[] var1) {
      long[] var2 = Nat256.createExt64();
      implSquare(var0, var2);
      reduce(var2, var1);
   }

   public static void squareAddToExt(long[] var0, long[] var1) {
      long[] var2 = Nat256.createExt64();
      implSquare(var0, var2);
      addExt(var1, var2, var1);
   }

   public static void squareN(long[] var0, int var1, long[] var2) {
      long[] var3 = Nat256.createExt64();
      implSquare(var0, var3);
      reduce(var3, var2);

      while(true) {
         --var1;
         if (var1 <= 0) {
            return;
         }

         implSquare(var2, var3);
         reduce(var3, var2);
      }
   }

   public static void implMulwAcc(long var0, long var2, long[] var4, int var5) {
      long[] var6 = new long[8];
      var6[1] = var2;
      var6[2] = var6[1] << 1;
      var6[3] = var6[2] ^ var2;
      var6[4] = var6[2] << 1;
      var6[5] = var6[4] ^ var2;
      var6[6] = var6[3] << 1;
      var6[7] = var6[6] ^ var2;
      int var7 = (int)var0;
      long var10 = 0L;
      long var12 = var6[var7 & 7] ^ var6[var7 >>> 3 & 7] << 3;
      int var14 = 54;

      do {
         var7 = (int)(var0 >>> var14);
         long var8 = var6[var7 & 7] ^ var6[var7 >>> 3 & 7] << 3;
         var12 ^= var8 << var14;
         var10 ^= var8 >>> -var14;
         var14 -= 6;
      } while(var14 > 0);

      var10 ^= (var0 & 585610922974906400L & var2 << 4 >> 63) >>> 5;
      var4[var5] ^= var12 & 1152921504606846975L;
      var4[var5 + 1] ^= var12 >>> 60 ^ var10 << 4;
   }

   public static void implMultiply(long[] var0, long[] var1, long[] var2) {
      long[] var3 = new long[4];
      long[] var4 = new long[4];
      implExpand(var0, var3);
      implExpand(var1, var4);
      implMulwAcc(var3[0], var4[0], var2, 0);
      implMulwAcc(var3[1], var4[1], var2, 1);
      implMulwAcc(var3[2], var4[2], var2, 2);
      implMulwAcc(var3[3], var4[3], var2, 3);

      int var5;
      for(var5 = 5; var5 > 0; --var5) {
         var2[var5] ^= var2[var5 - 1];
      }

      implMulwAcc(var3[0] ^ var3[1], var4[0] ^ var4[1], var2, 1);
      implMulwAcc(var3[2] ^ var3[3], var4[2] ^ var4[3], var2, 3);

      for(var5 = 7; var5 > 1; --var5) {
         var2[var5] ^= var2[var5 - 2];
      }

      long var20 = var3[0] ^ var3[2];
      long var7 = var3[1] ^ var3[3];
      long var9 = var4[0] ^ var4[2];
      long var11 = var4[1] ^ var4[3];
      implMulwAcc(var20 ^ var7, var9 ^ var11, var2, 3);
      long[] var13 = new long[3];
      implMulwAcc(var20, var9, var13, 0);
      implMulwAcc(var7, var11, var13, 1);
      long var14 = var13[0];
      long var16 = var13[1];
      long var18 = var13[2];
      var2[2] ^= var14;
      var2[3] ^= var14 ^ var16;
      var2[4] ^= var18 ^ var16;
      var2[5] ^= var18;
      implCompactExt(var2);
   }

   public static void implCompactExt(long[] var0) {
      long var1 = var0[0];
      long var3 = var0[1];
      long var5 = var0[2];
      long var7 = var0[3];
      long var9 = var0[4];
      long var11 = var0[5];
      long var13 = var0[6];
      long var15 = var0[7];
      var0[0] = var1 ^ var3 << 60;
      var0[1] = var3 >>> 4 ^ var5 << 56;
      var0[2] = var5 >>> 8 ^ var7 << 52;
      var0[3] = var7 >>> 12 ^ var9 << 48;
      var0[4] = var9 >>> 16 ^ var11 << 44;
      var0[5] = var11 >>> 20 ^ var13 << 40;
      var0[6] = var13 >>> 24 ^ var15 << 36;
      var0[7] = var15 >>> 28;
   }

   public static void implExpand(long[] var0, long[] var1) {
      long var2 = var0[0];
      long var4 = var0[1];
      long var6 = var0[2];
      long var8 = var0[3];
      var1[0] = var2 & 1152921504606846975L;
      var1[1] = (var2 >>> 60 ^ var4 << 4) & 1152921504606846975L;
      var1[2] = (var4 >>> 56 ^ var6 << 8) & 1152921504606846975L;
      var1[3] = var6 >>> 52 ^ var8 << 12;
   }

   public static void implSquare(long[] var0, long[] var1) {
      Interleave.expand64To128(var0[0], var1, 0);
      Interleave.expand64To128(var0[1], var1, 2);
      Interleave.expand64To128(var0[2], var1, 4);
      long var2 = var0[3];
      var1[6] = Interleave.expand32to64((int)var2);
      var1[7] = (long)Interleave.expand16to32((int)(var2 >>> 32)) & 4294967295L;
   }
}
