package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;

public class SecT131Field {
   static final long M03 = 7L;
   static final long M44 = 17592186044415L;
   static final long[] ROOT_Z = new long[]{2791191049453778211L, 2791191049453778402L, 6L};

   public static void square(long[] var0, long[] var1) {
      long[] var2 = Nat.create64(5);
      implSquare(var0, var2);
      reduce(var2, var1);
   }

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

   public static long[] fromBigInteger(BigInteger var0) {
      long[] var1 = Nat192.fromBigInteger64(var0);
      reduce61(var1, 0);
      return var1;
   }

   public static void addOne(long[] var0, long[] var1) {
      var1[0] = var0[0] ^ 1L;
      var1[1] = var0[1];
      var1[2] = var0[2];
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
      var4 ^= var10 << 61 ^ var10 << 63;
      var6 ^= var10 >>> 3 ^ var10 >>> 1 ^ var10 ^ var10 << 5;
      var8 ^= var10 >>> 59;
      var2 ^= var8 << 61 ^ var8 << 63;
      var4 ^= var8 >>> 3 ^ var8 >>> 1 ^ var8 ^ var8 << 5;
      var6 ^= var8 >>> 59;
      long var12 = var6 >>> 3;
      var1[0] = var2 ^ var12 ^ var12 << 2 ^ var12 << 3 ^ var12 << 8;
      var1[1] = var4 ^ var12 >>> 56;
      var1[2] = var6 & 7L;
   }

   public static void implMultiply(long[] var0, long[] var1, long[] var2) {
      long var3 = var0[0];
      long var5 = var0[1];
      long var7 = var0[2];
      var7 = (var5 >>> 24 ^ var7 << 40) & 17592186044415L;
      var5 = (var3 >>> 44 ^ var5 << 20) & 17592186044415L;
      var3 &= 17592186044415L;
      long var9 = var1[0];
      long var11 = var1[1];
      long var13 = var1[2];
      var13 = (var11 >>> 24 ^ var13 << 40) & 17592186044415L;
      var11 = (var9 >>> 44 ^ var11 << 20) & 17592186044415L;
      var9 &= 17592186044415L;
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
      var42 ^= var40 >>> 44;
      var40 &= 17592186044415L;
      var44 ^= var42 >>> 44;
      var42 &= 17592186044415L;
      var40 = var40 >>> 1 ^ (var42 & 1L) << 43;
      var42 = var42 >>> 1 ^ (var44 & 1L) << 43;
      var44 >>>= 1;
      var40 ^= var40 << 1;
      var40 ^= var40 << 2;
      var40 ^= var40 << 4;
      var40 ^= var40 << 8;
      var40 ^= var40 << 16;
      var40 ^= var40 << 32;
      var40 &= 17592186044415L;
      var42 ^= var40 >>> 43;
      var42 ^= var42 << 1;
      var42 ^= var42 << 2;
      var42 ^= var42 << 4;
      var42 ^= var42 << 8;
      var42 ^= var42 << 16;
      var42 ^= var42 << 32;
      var42 &= 17592186044415L;
      var44 ^= var42 >>> 43;
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

   public static void implCompactExt(long[] var0) {
      long var1 = var0[0];
      long var3 = var0[1];
      long var5 = var0[2];
      long var7 = var0[3];
      long var9 = var0[4];
      long var11 = var0[5];
      var0[0] = var1 ^ var3 << 44;
      var0[1] = var3 >>> 20 ^ var5 << 24;
      var0[2] = var5 >>> 40 ^ var7 << 4 ^ var9 << 48;
      var0[3] = var7 >>> 60 ^ var11 << 28 ^ var9 >>> 16;
      var0[4] = var11 >>> 36;
      var0[5] = 0L;
   }

   public static void squareAddToExt(long[] var0, long[] var1) {
      long[] var2 = Nat.create64(5);
      implSquare(var0, var2);
      addExt(var1, var2, var1);
   }

   public static void squareN(long[] var0, int var1, long[] var2) {
      long[] var3 = Nat.create64(5);
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

   public static int trace(long[] var0) {
      return (int)(var0[0] ^ var0[1] >>> 59 ^ var0[2] >>> 1) & 1;
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
      long var12 = var6[var7 & 7] ^ var6[var7 >>> 3 & 7] << 3 ^ var6[var7 >>> 6 & 7] << 6;
      int var14 = 33;

      do {
         var7 = (int)(var0 >>> var14);
         long var8 = var6[var7 & 7] ^ var6[var7 >>> 3 & 7] << 3 ^ var6[var7 >>> 6 & 7] << 6 ^ var6[var7 >>> 9 & 7] << 9;
         var12 ^= var8 << var14;
         var10 ^= var8 >>> -var14;
         var14 -= 12;
      } while(var14 > 0);

      var4[var5] = var12 & 17592186044415L;
      var4[var5 + 1] = var12 >>> 44 ^ var10 << 20;
   }

   public static void invert(long[] var0, long[] var1) {
      if (Nat192.isZero64(var0)) {
         throw new IllegalStateException();
      } else {
         long[] var2 = Nat192.create64();
         long[] var3 = Nat192.create64();
         square(var0, var2);
         multiply(var2, var0, var2);
         squareN(var2, 2, var3);
         multiply(var3, var2, var3);
         squareN(var3, 4, var2);
         multiply(var2, var3, var2);
         squareN(var2, 8, var3);
         multiply(var3, var2, var3);
         squareN(var3, 16, var2);
         multiply(var2, var3, var2);
         squareN(var2, 32, var3);
         multiply(var3, var2, var3);
         square(var3, var3);
         multiply(var3, var0, var3);
         squareN(var3, 65, var2);
         multiply(var2, var3, var2);
         square(var2, var1);
      }
   }

   public static void reduce61(long[] var0, int var1) {
      long var2 = var0[var1 + 2];
      long var4 = var2 >>> 3;
      var0[var1] ^= var4 ^ var4 << 2 ^ var4 << 3 ^ var4 << 8;
      var0[var1 + 1] ^= var4 >>> 56;
      var0[var1 + 2] = var2 & 7L;
   }

   public static void implSquare(long[] var0, long[] var1) {
      Interleave.expand64To128(var0[0], var1, 0);
      Interleave.expand64To128(var0[1], var1, 2);
      var1[4] = (long)Interleave.expand8to16((int)var0[2]) & 4294967295L;
   }
}
