package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat192;

public class SecT163Field {
   static final long M55 = 36028797018963967L;
   static final long M35 = 34359738367L;
   static final long[] ROOT_Z = new long[]{-5270498306774157648L, 5270498306774195053L, 19634136210L};

   public static void add(long[] var0, long[] var1, long[] var2) {
      var2[0] = var0[0] ^ var1[0];
      var2[1] = var0[1] ^ var1[1];
      var2[2] = var0[2] ^ var1[2];
   }

   public static void addExt(long[] var0, long[] var1, long[] var2) {
      var2[0] = var0[0] ^ var1[0];
      var2[1] = var0[1] ^ var1[1];
      var2[2] = var0[2] ^ var1[2];
      var2[3] = var0[3] ^ var1[3];
      var2[4] = var0[4] ^ var1[4];
      var2[5] = var0[5] ^ var1[5];
   }

   public static void squareN(long[] var0, int var1, long[] var2) {
      long[] var3 = Nat192.createExt64();
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

   public static long[] fromBigInteger(BigInteger var0) {
      long[] var1 = Nat192.fromBigInteger64(var0);
      reduce29(var1, 0);
      return var1;
   }

   public static void implMultiply(long[] var0, long[] var1, long[] var2) {
      long var3 = var0[0];
      long var5 = var0[1];
      long var7 = var0[2];
      var7 = var5 >>> 46 ^ var7 << 18;
      var5 = (var3 >>> 55 ^ var5 << 9) & 36028797018963967L;
      var3 &= 36028797018963967L;
      long var9 = var1[0];
      long var11 = var1[1];
      long var13 = var1[2];
      var13 = var11 >>> 46 ^ var13 << 18;
      var11 = (var9 >>> 55 ^ var11 << 9) & 36028797018963967L;
      var9 &= 36028797018963967L;
      long[] var15 = new long[10];
      implMulw(var3, var9, var15, 0);
      implMulw(var7, var13, var15, 2);
      long var16 = var3 ^ var5 ^ var7;
      long var18 = var9 ^ var11 ^ var13;
      implMulw(var16, var18, var15, 4);
      long var20 = var5 << 1 ^ var7 << 2;
      long var22 = var11 << 1 ^ var13 << 2;
      implMulw(var3 ^ var20, var9 ^ var22, var15, 6);
      implMulw(var16 ^ var20, var18 ^ var22, var15, 8);
      long var24 = var15[6] ^ var15[8];
      long var26 = var15[7] ^ var15[9];
      long var28 = var24 << 1 ^ var15[6];
      long var30 = var24 ^ var26 << 1 ^ var15[7];
      long var34 = var15[0];
      long var36 = var15[1] ^ var15[0] ^ var15[4];
      long var38 = var15[1] ^ var15[5];
      long var40 = var34 ^ var28 ^ var15[2] << 4 ^ var15[2] << 1;
      long var42 = var36 ^ var30 ^ var15[3] << 4 ^ var15[3] << 1;
      long var44 = var38 ^ var26;
      var42 ^= var40 >>> 55;
      var40 &= 36028797018963967L;
      var44 ^= var42 >>> 55;
      var42 &= 36028797018963967L;
      var40 = var40 >>> 1 ^ (var42 & 1L) << 54;
      var42 = var42 >>> 1 ^ (var44 & 1L) << 54;
      var44 >>>= 1;
      var40 ^= var40 << 1;
      var40 ^= var40 << 2;
      var40 ^= var40 << 4;
      var40 ^= var40 << 8;
      var40 ^= var40 << 16;
      var40 ^= var40 << 32;
      var40 &= 36028797018963967L;
      var42 ^= var40 >>> 54;
      var42 ^= var42 << 1;
      var42 ^= var42 << 2;
      var42 ^= var42 << 4;
      var42 ^= var42 << 8;
      var42 ^= var42 << 16;
      var42 ^= var42 << 32;
      var42 &= 36028797018963967L;
      var44 ^= var42 >>> 54;
      var44 ^= var44 << 1;
      var44 ^= var44 << 2;
      var44 ^= var44 << 4;
      var44 ^= var44 << 8;
      var44 ^= var44 << 16;
      var44 ^= var44 << 32;
      var2[0] = var34;
      var2[1] = var36 ^ var40 ^ var15[2];
      var2[2] = var38 ^ var42 ^ var40 ^ var15[3];
      var2[3] = var44 ^ var42;
      var2[4] = var44 ^ var15[2];
      var2[5] = var15[3];
      implCompactExt(var2);
   }

   public static void multiply(long[] var0, long[] var1, long[] var2) {
      long[] var3 = Nat192.createExt64();
      implMultiply(var0, var1, var3);
      reduce(var3, var2);
   }

   public static void multiplyAddToExt(long[] var0, long[] var1, long[] var2) {
      long[] var3 = Nat192.createExt64();
      implMultiply(var0, var1, var3);
      addExt(var2, var3, var2);
   }

   public static void reduce(long[] var0, long[] var1) {
      long var2 = var0[0];
      long var4 = var0[1];
      long var6 = var0[2];
      long var8 = var0[3];
      long var10 = var0[4];
      long var12 = var0[5];
      var6 ^= var12 << 29 ^ var12 << 32 ^ var12 << 35 ^ var12 << 36;
      var8 ^= var12 >>> 35 ^ var12 >>> 32 ^ var12 >>> 29 ^ var12 >>> 28;
      var4 ^= var10 << 29 ^ var10 << 32 ^ var10 << 35 ^ var10 << 36;
      var6 ^= var10 >>> 35 ^ var10 >>> 32 ^ var10 >>> 29 ^ var10 >>> 28;
      var2 ^= var8 << 29 ^ var8 << 32 ^ var8 << 35 ^ var8 << 36;
      var4 ^= var8 >>> 35 ^ var8 >>> 32 ^ var8 >>> 29 ^ var8 >>> 28;
      long var14 = var6 >>> 35;
      var1[0] = var2 ^ var14 ^ var14 << 3 ^ var14 << 6 ^ var14 << 7;
      var1[1] = var4;
      var1[2] = var6 & 34359738367L;
   }

   public static void reduce29(long[] var0, int var1) {
      long var2 = var0[var1 + 2];
      long var4 = var2 >>> 35;
      var0[var1] ^= var4 ^ var4 << 3 ^ var4 << 6 ^ var4 << 7;
      var0[var1 + 2] = var2 & 34359738367L;
   }

   public static void sqrt(long[] var0, long[] var1) {
      long[] var2 = Nat192.create64();
      long var3 = Interleave.unshuffle(var0[0]);
      long var5 = Interleave.unshuffle(var0[1]);
      long var7 = var3 & 4294967295L | var5 << 32;
      var2[0] = var3 >>> 32 | var5 & -4294967296L;
      var3 = Interleave.unshuffle(var0[2]);
      long var9 = var3 & 4294967295L;
      var2[1] = var3 >>> 32;
      multiply(var2, ROOT_Z, var1);
      var1[0] ^= var7;
      var1[1] ^= var9;
   }

   public static void addOne(long[] var0, long[] var1) {
      var1[0] = var0[0] ^ 1L;
      var1[1] = var0[1];
      var1[2] = var0[2];
   }

   public static void squareAddToExt(long[] var0, long[] var1) {
      long[] var2 = Nat192.createExt64();
      implSquare(var0, var2);
      addExt(var1, var2, var1);
   }

   public static void invert(long[] var0, long[] var1) {
      if (Nat192.isZero64(var0)) {
         throw new IllegalStateException();
      } else {
         long[] var2 = Nat192.create64();
         long[] var3 = Nat192.create64();
         square(var0, var2);
         squareN(var2, 1, var3);
         multiply(var2, var3, var2);
         squareN(var3, 1, var3);
         multiply(var2, var3, var2);
         squareN(var2, 3, var3);
         multiply(var2, var3, var2);
         squareN(var3, 3, var3);
         multiply(var2, var3, var2);
         squareN(var2, 9, var3);
         multiply(var2, var3, var2);
         squareN(var3, 9, var3);
         multiply(var2, var3, var2);
         squareN(var2, 27, var3);
         multiply(var2, var3, var2);
         squareN(var3, 27, var3);
         multiply(var2, var3, var2);
         squareN(var2, 81, var3);
         multiply(var2, var3, var1);
      }
   }

   public static int trace(long[] var0) {
      return (int)(var0[0] ^ var0[2] >>> 29) & 1;
   }

   public static void implCompactExt(long[] var0) {
      long var1 = var0[0];
      long var3 = var0[1];
      long var5 = var0[2];
      long var7 = var0[3];
      long var9 = var0[4];
      long var11 = var0[5];
      var0[0] = var1 ^ var3 << 55;
      var0[1] = var3 >>> 9 ^ var5 << 46;
      var0[2] = var5 >>> 18 ^ var7 << 37;
      var0[3] = var7 >>> 27 ^ var9 << 28;
      var0[4] = var9 >>> 36 ^ var11 << 19;
      var0[5] = var11 >>> 45;
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
      long var12 = var6[var7 & 3];
      int var14 = 47;

      do {
         var7 = (int)(var0 >>> var14);
         long var8 = var6[var7 & 7] ^ var6[var7 >>> 3 & 7] << 3 ^ var6[var7 >>> 6 & 7] << 6;
         var12 ^= var8 << var14;
         var10 ^= var8 >>> -var14;
         var14 -= 9;
      } while(var14 > 0);

      var4[var5] = var12 & 36028797018963967L;
      var4[var5 + 1] = var12 >>> 55 ^ var10 << 9;
   }

   public static void square(long[] var0, long[] var1) {
      long[] var2 = Nat192.createExt64();
      implSquare(var0, var2);
      reduce(var2, var1);
   }

   public static void implSquare(long[] var0, long[] var1) {
      Interleave.expand64To128(var0[0], var1, 0);
      Interleave.expand64To128(var0[1], var1, 2);
      long var2 = var0[2];
      var1[4] = Interleave.expand32to64((int)var2);
      var1[5] = (long)Interleave.expand8to16((int)(var2 >>> 32)) & 4294967295L;
   }
}
