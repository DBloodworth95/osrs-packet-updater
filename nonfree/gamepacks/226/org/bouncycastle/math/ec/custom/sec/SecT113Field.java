package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat128;

public class SecT113Field {
   static final long M49 = 562949953421311L;
   static final long M57 = 144115188075855871L;

   public static void multiply(long[] var0, long[] var1, long[] var2) {
      long[] var3 = Nat128.createExt64();
      implMultiply(var0, var1, var3);
      reduce(var3, var2);
   }

   public static void squareN(long[] var0, int var1, long[] var2) {
      long[] var3 = Nat128.createExt64();
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

   public static void implMulw(long var0, long var2, long[] var4, int var5) {
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
      long var12 = var6[var7 & 7];
      int var14 = 48;

      do {
         var7 = (int)(var0 >>> var14);
         long var8 = var6[var7 & 7] ^ var6[var7 >>> 3 & 7] << 3 ^ var6[var7 >>> 6 & 7] << 6;
         var12 ^= var8 << var14;
         var10 ^= var8 >>> -var14;
         var14 -= 9;
      } while(var14 > 0);

      var10 ^= (var0 & 72198606942111744L & var2 << 7 >> 63) >>> 8;
      var4[var5] = var12 & 144115188075855871L;
      var4[var5 + 1] = var12 >>> 57 ^ var10 << 7;
   }

   public static void addOne(long[] var0, long[] var1) {
      var1[0] = var0[0] ^ 1L;
      var1[1] = var0[1];
   }

   public static void invert(long[] var0, long[] var1) {
      if (Nat128.isZero64(var0)) {
         throw new IllegalStateException();
      } else {
         long[] var2 = Nat128.create64();
         long[] var3 = Nat128.create64();
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
         squareN(var3, 28, var2);
         multiply(var2, var3, var2);
         squareN(var2, 56, var3);
         multiply(var3, var2, var3);
         square(var3, var1);
      }
   }

   public static void addExt(long[] var0, long[] var1, long[] var2) {
      var2[0] = var0[0] ^ var1[0];
      var2[1] = var0[1] ^ var1[1];
      var2[2] = var0[2] ^ var1[2];
      var2[3] = var0[3] ^ var1[3];
   }

   public static long[] fromBigInteger(BigInteger var0) {
      long[] var1 = Nat128.fromBigInteger64(var0);
      reduce15(var1, 0);
      return var1;
   }

   public static void reduce(long[] var0, long[] var1) {
      long var2 = var0[0];
      long var4 = var0[1];
      long var6 = var0[2];
      long var8 = var0[3];
      var4 ^= var8 << 15 ^ var8 << 24;
      var6 ^= var8 >>> 49 ^ var8 >>> 40;
      var2 ^= var6 << 15 ^ var6 << 24;
      var4 ^= var6 >>> 49 ^ var6 >>> 40;
      long var10 = var4 >>> 49;
      var1[0] = var2 ^ var10 ^ var10 << 9;
      var1[1] = var4 & 562949953421311L;
   }

   public static void multiplyAddToExt(long[] var0, long[] var1, long[] var2) {
      long[] var3 = Nat128.createExt64();
      implMultiply(var0, var1, var3);
      addExt(var2, var3, var2);
   }

   public static void sqrt(long[] var0, long[] var1) {
      long var2 = Interleave.unshuffle(var0[0]);
      long var4 = Interleave.unshuffle(var0[1]);
      long var6 = var2 & 4294967295L | var4 << 32;
      long var8 = var2 >>> 32 | var4 & -4294967296L;
      var1[0] = var6 ^ var8 << 57 ^ var8 << 5;
      var1[1] = var8 >>> 7 ^ var8 >>> 59;
   }

   public static void square(long[] var0, long[] var1) {
      long[] var2 = Nat128.createExt64();
      implSquare(var0, var2);
      reduce(var2, var1);
   }

   public static void squareAddToExt(long[] var0, long[] var1) {
      long[] var2 = Nat128.createExt64();
      implSquare(var0, var2);
      addExt(var1, var2, var1);
   }

   public static void reduce15(long[] var0, int var1) {
      long var2 = var0[var1 + 1];
      long var4 = var2 >>> 49;
      var0[var1] ^= var4 ^ var4 << 9;
      var0[var1 + 1] = var2 & 562949953421311L;
   }

   public static int trace(long[] var0) {
      return (int)var0[0] & 1;
   }

   public static void implMultiply(long[] var0, long[] var1, long[] var2) {
      long var3 = var0[0];
      long var5 = var0[1];
      var5 = (var3 >>> 57 ^ var5 << 7) & 144115188075855871L;
      var3 &= 144115188075855871L;
      long var7 = var1[0];
      long var9 = var1[1];
      var9 = (var7 >>> 57 ^ var9 << 7) & 144115188075855871L;
      var7 &= 144115188075855871L;
      long[] var11 = new long[6];
      implMulw(var3, var7, var11, 0);
      implMulw(var5, var9, var11, 2);
      implMulw(var3 ^ var5, var7 ^ var9, var11, 4);
      long var12 = var11[1] ^ var11[2];
      long var14 = var11[0];
      long var16 = var11[3];
      long var18 = var11[4] ^ var14 ^ var12;
      long var20 = var11[5] ^ var16 ^ var12;
      var2[0] = var14 ^ var18 << 57;
      var2[1] = var18 >>> 7 ^ var20 << 50;
      var2[2] = var20 >>> 14 ^ var16 << 43;
      var2[3] = var16 >>> 21;
   }

   public static void add(long[] var0, long[] var1, long[] var2) {
      var2[0] = var0[0] ^ var1[0];
      var2[1] = var0[1] ^ var1[1];
   }

   public static void implSquare(long[] var0, long[] var1) {
      Interleave.expand64To128(var0[0], var1, 0);
      Interleave.expand64To128(var0[1], var1, 2);
   }
}
