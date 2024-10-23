package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat320;

public class SecT283Field {
   static final long M57 = 144115188075855871L;
   static final long M27 = 134217727L;
   static final long[] ROOT_Z = new long[]{878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042L};

   public static void sqrt(long[] var0, long[] var1) {
      long[] var2 = Nat320.create64();
      long var3 = Interleave.unshuffle(var0[0]);
      long var5 = Interleave.unshuffle(var0[1]);
      long var7 = var3 & 4294967295L | var5 << 32;
      var2[0] = var3 >>> 32 | var5 & -4294967296L;
      var3 = Interleave.unshuffle(var0[2]);
      var5 = Interleave.unshuffle(var0[3]);
      long var9 = var3 & 4294967295L | var5 << 32;
      var2[1] = var3 >>> 32 | var5 & -4294967296L;
      var3 = Interleave.unshuffle(var0[4]);
      long var11 = var3 & 4294967295L;
      var2[2] = var3 >>> 32;
      multiply(var2, ROOT_Z, var1);
      var1[0] ^= var7;
      var1[1] ^= var9;
      var1[2] ^= var11;
   }

   public static void add(long[] var0, long[] var1, long[] var2) {
      var2[0] = var0[0] ^ var1[0];
      var2[1] = var0[1] ^ var1[1];
      var2[2] = var0[2] ^ var1[2];
      var2[3] = var0[3] ^ var1[3];
      var2[4] = var0[4] ^ var1[4];
   }

   public static void reduce37(long[] var0, int var1) {
      long var2 = var0[var1 + 4];
      long var4 = var2 >>> 27;
      var0[var1] ^= var4 ^ var4 << 5 ^ var4 << 7 ^ var4 << 12;
      var0[var1 + 4] = var2 & 134217727L;
   }

   public static void addOne(long[] var0, long[] var1) {
      var1[0] = var0[0] ^ 1L;
      var1[1] = var0[1];
      var1[2] = var0[2];
      var1[3] = var0[3];
      var1[4] = var0[4];
   }

   public static long[] fromBigInteger(BigInteger var0) {
      long[] var1 = Nat320.fromBigInteger64(var0);
      reduce37(var1, 0);
      return var1;
   }

   public static void invert(long[] var0, long[] var1) {
      if (Nat320.isZero64(var0)) {
         throw new IllegalStateException();
      } else {
         long[] var2 = Nat320.create64();
         long[] var3 = Nat320.create64();
         square(var0, var2);
         multiply(var2, var0, var2);
         squareN(var2, 2, var3);
         multiply(var3, var2, var3);
         squareN(var3, 4, var2);
         multiply(var2, var3, var2);
         squareN(var2, 8, var3);
         multiply(var3, var2, var3);
         square(var3, var3);
         multiply(var3, var0, var3);
         squareN(var3, 17, var2);
         multiply(var2, var3, var2);
         square(var2, var2);
         multiply(var2, var0, var2);
         squareN(var2, 35, var3);
         multiply(var3, var2, var3);
         squareN(var3, 70, var2);
         multiply(var2, var3, var2);
         square(var2, var2);
         multiply(var2, var0, var2);
         squareN(var2, 141, var3);
         multiply(var3, var2, var3);
         square(var3, var1);
      }
   }

   public static void multiply(long[] var0, long[] var1, long[] var2) {
      long[] var3 = Nat320.createExt64();
      implMultiply(var0, var1, var3);
      reduce(var3, var2);
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
      var2[8] = var0[8] ^ var1[8];
   }

   public static void multiplyAddToExt(long[] var0, long[] var1, long[] var2) {
      long[] var3 = Nat320.createExt64();
      implMultiply(var0, var1, var3);
      addExt(var2, var3, var2);
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

   public static void squareAddToExt(long[] var0, long[] var1) {
      long[] var2 = Nat.create64(9);
      implSquare(var0, var2);
      addExt(var1, var2, var1);
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
      long var18 = var0[8];
      var8 ^= var18 << 37 ^ var18 << 42 ^ var18 << 44 ^ var18 << 49;
      var10 ^= var18 >>> 27 ^ var18 >>> 22 ^ var18 >>> 20 ^ var18 >>> 15;
      var6 ^= var16 << 37 ^ var16 << 42 ^ var16 << 44 ^ var16 << 49;
      var8 ^= var16 >>> 27 ^ var16 >>> 22 ^ var16 >>> 20 ^ var16 >>> 15;
      var4 ^= var14 << 37 ^ var14 << 42 ^ var14 << 44 ^ var14 << 49;
      var6 ^= var14 >>> 27 ^ var14 >>> 22 ^ var14 >>> 20 ^ var14 >>> 15;
      var2 ^= var12 << 37 ^ var12 << 42 ^ var12 << 44 ^ var12 << 49;
      var4 ^= var12 >>> 27 ^ var12 >>> 22 ^ var12 >>> 20 ^ var12 >>> 15;
      long var20 = var10 >>> 27;
      var1[0] = var2 ^ var20 ^ var20 << 5 ^ var20 << 7 ^ var20 << 12;
      var1[1] = var4;
      var1[2] = var6;
      var1[3] = var8;
      var1[4] = var10 & 134217727L;
   }

   public static void squareN(long[] var0, int var1, long[] var2) {
      long[] var3 = Nat.create64(9);
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
      return (int)(var0[0] ^ var0[4] >>> 15) & 1;
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
      long var17 = var0[8];
      long var19 = var0[9];
      var0[0] = var1 ^ var3 << 57;
      var0[1] = var3 >>> 7 ^ var5 << 50;
      var0[2] = var5 >>> 14 ^ var7 << 43;
      var0[3] = var7 >>> 21 ^ var9 << 36;
      var0[4] = var9 >>> 28 ^ var11 << 29;
      var0[5] = var11 >>> 35 ^ var13 << 22;
      var0[6] = var13 >>> 42 ^ var15 << 15;
      var0[7] = var15 >>> 49 ^ var17 << 8;
      var0[8] = var17 >>> 56 ^ var19 << 1;
      var0[9] = var19 >>> 63;
   }

   public static void implExpand(long[] var0, long[] var1) {
      long var2 = var0[0];
      long var4 = var0[1];
      long var6 = var0[2];
      long var8 = var0[3];
      long var10 = var0[4];
      var1[0] = var2 & 144115188075855871L;
      var1[1] = (var2 >>> 57 ^ var4 << 7) & 144115188075855871L;
      var1[2] = (var4 >>> 50 ^ var6 << 14) & 144115188075855871L;
      var1[3] = (var6 >>> 43 ^ var8 << 21) & 144115188075855871L;
      var1[4] = var8 >>> 36 ^ var10 << 28;
   }

   public static void implMultiply(long[] var0, long[] var1, long[] var2) {
      long[] var3 = new long[5];
      long[] var4 = new long[5];
      implExpand(var0, var3);
      implExpand(var1, var4);
      long[] var5 = new long[26];
      implMulw(var3[0], var4[0], var5, 0);
      implMulw(var3[1], var4[1], var5, 2);
      implMulw(var3[2], var4[2], var5, 4);
      implMulw(var3[3], var4[3], var5, 6);
      implMulw(var3[4], var4[4], var5, 8);
      long var6 = var3[0] ^ var3[1];
      long var8 = var4[0] ^ var4[1];
      long var10 = var3[0] ^ var3[2];
      long var12 = var4[0] ^ var4[2];
      long var14 = var3[2] ^ var3[4];
      long var16 = var4[2] ^ var4[4];
      long var18 = var3[3] ^ var3[4];
      long var20 = var4[3] ^ var4[4];
      implMulw(var10 ^ var3[3], var12 ^ var4[3], var5, 18);
      implMulw(var14 ^ var3[1], var16 ^ var4[1], var5, 20);
      long var22 = var6 ^ var18;
      long var24 = var8 ^ var20;
      long var26 = var22 ^ var3[2];
      long var28 = var24 ^ var4[2];
      implMulw(var22, var24, var5, 22);
      implMulw(var26, var28, var5, 24);
      implMulw(var6, var8, var5, 10);
      implMulw(var10, var12, var5, 12);
      implMulw(var14, var16, var5, 14);
      implMulw(var18, var20, var5, 16);
      var2[0] = var5[0];
      var2[9] = var5[9];
      long var30 = var5[0] ^ var5[1];
      long var32 = var30 ^ var5[2];
      long var34 = var32 ^ var5[10];
      var2[1] = var34;
      long var36 = var5[3] ^ var5[4];
      long var38 = var5[11] ^ var5[12];
      long var40 = var36 ^ var38;
      long var42 = var32 ^ var40;
      var2[2] = var42;
      long var44 = var30 ^ var36;
      long var46 = var5[5] ^ var5[6];
      long var48 = var44 ^ var46;
      long var50 = var48 ^ var5[8];
      long var52 = var5[13] ^ var5[14];
      long var54 = var50 ^ var52;
      long var56 = var5[18] ^ var5[22];
      long var58 = var56 ^ var5[24];
      long var60 = var54 ^ var58;
      var2[3] = var60;
      long var62 = var5[7] ^ var5[8];
      long var64 = var62 ^ var5[9];
      long var66 = var64 ^ var5[17];
      var2[8] = var66;
      long var68 = var64 ^ var46;
      long var70 = var5[15] ^ var5[16];
      long var72 = var68 ^ var70;
      var2[7] = var72;
      long var74 = var72 ^ var34;
      long var76 = var5[19] ^ var5[20];
      long var78 = var5[25] ^ var5[24];
      long var80 = var5[18] ^ var5[23];
      long var82 = var76 ^ var78;
      long var84 = var82 ^ var80;
      long var86 = var84 ^ var74;
      var2[4] = var86;
      long var88 = var42 ^ var66;
      long var90 = var82 ^ var88;
      long var92 = var5[21] ^ var5[22];
      long var94 = var90 ^ var92;
      var2[5] = var94;
      long var96 = var50 ^ var5[0];
      long var98 = var96 ^ var5[9];
      long var100 = var98 ^ var52;
      long var102 = var100 ^ var5[21];
      long var104 = var102 ^ var5[23];
      long var106 = var104 ^ var5[25];
      var2[6] = var106;
      implCompactExt(var2);
   }

   public static void implSquare(long[] var0, long[] var1) {
      for(int var2 = 0; var2 < 4; ++var2) {
         Interleave.expand64To128(var0[var2], var1, var2 << 1);
      }

      var1[8] = Interleave.expand32to64((int)var0[4]);
   }

   public static void square(long[] var0, long[] var1) {
      long[] var2 = Nat.create64(9);
      implSquare(var0, var2);
      reduce(var2, var1);
   }
}
