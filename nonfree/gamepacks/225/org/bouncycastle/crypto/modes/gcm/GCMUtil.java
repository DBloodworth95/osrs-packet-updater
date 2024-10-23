package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.util.Pack;

public abstract class GCMUtil {
   static final int[] LOOKUP = generateLookup();
   static final long E1L = -2233785415175766016L;
   static final int E1 = -520093696;

   static int shiftRight(int[] var0) {
      int var1 = var0[0];
      var0[0] = var1 >>> 1;
      int var2 = var1 << 31;
      var1 = var0[1];
      var0[1] = var1 >>> 1 | var2;
      var2 = var1 << 31;
      var1 = var0[2];
      var0[2] = var1 >>> 1 | var2;
      var2 = var1 << 31;
      var1 = var0[3];
      var0[3] = var1 >>> 1 | var2;
      return var1 << 31;
   }

   public static void xor(byte[] var0, byte[] var1) {
      int var2 = 0;

      do {
         var0[var2] ^= var1[var2];
         ++var2;
         var0[var2] ^= var1[var2];
         ++var2;
         var0[var2] ^= var1[var2];
         ++var2;
         var0[var2] ^= var1[var2];
         ++var2;
      } while(var2 < 16);

   }

   public static byte[] oneAsBytes() {
      byte[] var0 = new byte[16];
      var0[0] = -128;
      return var0;
   }

   public static int[] oneAsInts() {
      int[] var0 = new int[4];
      var0[0] = Integer.MIN_VALUE;
      return var0;
   }

   public static void asBytes(int[] var0, byte[] var1) {
      Pack.intToBigEndian(var0, var1, 0);
   }

   public static void multiplyP(int[] var0, int[] var1) {
      int var2 = shiftRight(var0, var1) >> 8;
      var1[0] ^= var2 & -520093696;
   }

   static int[] generateLookup() {
      int[] var0 = new int[256];

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = 0;

         for(int var3 = 7; var3 >= 0; --var3) {
            if ((var1 & 1 << var3) != 0) {
               var2 ^= -520093696 >>> 7 - var3;
            }
         }

         var0[var1] = var2;
      }

      return var0;
   }

   public static long[] asLongs(byte[] var0) {
      long[] var1 = new long[2];
      Pack.bigEndianToLong(var0, 0, var1);
      return var1;
   }

   public static void multiplyP8(int[] var0) {
      int var1 = shiftRightN(var0, 8);
      var0[0] ^= LOOKUP[var1 >>> 24];
   }

   public static int[] asInts(byte[] var0) {
      int[] var1 = new int[4];
      Pack.bigEndianToInt(var0, 0, var1);
      return var1;
   }

   public static void asInts(byte[] var0, int[] var1) {
      Pack.bigEndianToInt(var0, 0, var1);
   }

   public static void asBytes(long[] var0, byte[] var1) {
      Pack.longToBigEndian(var0, var1, 0);
   }

   public static void asLongs(byte[] var0, long[] var1) {
      Pack.bigEndianToLong(var0, 0, var1);
   }

   public static void multiply(byte[] var0, byte[] var1) {
      int[] var2 = asInts(var0);
      int[] var3 = asInts(var1);
      multiply(var2, var3);
      asBytes(var2, var0);
   }

   public static void multiply(int[] var0, int[] var1) {
      int var2 = var0[0];
      int var3 = var0[1];
      int var4 = var0[2];
      int var5 = var0[3];
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      for(int var10 = 0; var10 < 4; ++var10) {
         int var11 = var1[var10];

         for(int var12 = 0; var12 < 32; ++var12) {
            int var13 = var11 >> 31;
            var11 <<= 1;
            var6 ^= var2 & var13;
            var7 ^= var3 & var13;
            var8 ^= var4 & var13;
            var9 ^= var5 & var13;
            int var14 = var5 << 31 >> 8;
            var5 = var5 >>> 1 | var4 << 31;
            var4 = var4 >>> 1 | var3 << 31;
            var3 = var3 >>> 1 | var2 << 31;
            var2 = var2 >>> 1 ^ var14 & -520093696;
         }
      }

      var0[0] = var6;
      var0[1] = var7;
      var0[2] = var8;
      var0[3] = var9;
   }

   public static void multiply(long[] var0, long[] var1) {
      long var2 = var0[0];
      long var4 = var0[1];
      long var6 = 0L;
      long var8 = 0L;

      for(int var10 = 0; var10 < 2; ++var10) {
         long var11 = var1[var10];

         for(int var13 = 0; var13 < 64; ++var13) {
            long var14 = var11 >> 63;
            var11 <<= 1;
            var6 ^= var2 & var14;
            var8 ^= var4 & var14;
            long var16 = var4 << 63 >> 8;
            var4 = var4 >>> 1 | var2 << 63;
            var2 = var2 >>> 1 ^ var16 & -2233785415175766016L;
         }
      }

      var0[0] = var6;
      var0[1] = var8;
   }

   public static void multiplyP(int[] var0) {
      int var1 = shiftRight(var0) >> 8;
      var0[0] ^= var1 & -520093696;
   }

   public static byte[] asBytes(int[] var0) {
      byte[] var1 = new byte[16];
      Pack.intToBigEndian(var0, var1, 0);
      return var1;
   }

   public static void multiplyP8(int[] var0, int[] var1) {
      int var2 = shiftRightN(var0, 8, var1);
      var1[0] ^= LOOKUP[var2 >>> 24];
   }

   public static void xor(long[] var0, long[] var1) {
      var0[0] ^= var1[0];
      var0[1] ^= var1[1];
   }

   static int shiftRight(int[] var0, int[] var1) {
      int var2 = var0[0];
      var1[0] = var2 >>> 1;
      int var3 = var2 << 31;
      var2 = var0[1];
      var1[1] = var2 >>> 1 | var3;
      var3 = var2 << 31;
      var2 = var0[2];
      var1[2] = var2 >>> 1 | var3;
      var3 = var2 << 31;
      var2 = var0[3];
      var1[3] = var2 >>> 1 | var3;
      return var2 << 31;
   }

   static long shiftRight(long[] var0) {
      long var1 = var0[0];
      var0[0] = var1 >>> 1;
      long var3 = var1 << 63;
      var1 = var0[1];
      var0[1] = var1 >>> 1 | var3;
      return var1 << 63;
   }

   static long shiftRight(long[] var0, long[] var1) {
      long var2 = var0[0];
      var1[0] = var2 >>> 1;
      long var4 = var2 << 63;
      var2 = var0[1];
      var1[1] = var2 >>> 1 | var4;
      return var2 << 63;
   }

   public static void xor(byte[] var0, byte[] var1, int var2, int var3) {
      while(true) {
         --var3;
         if (var3 < 0) {
            return;
         }

         var0[var3] ^= var1[var2 + var3];
      }
   }

   static int shiftRightN(int[] var0, int var1, int[] var2) {
      int var3 = var0[0];
      int var4 = 32 - var1;
      var2[0] = var3 >>> var1;
      int var5 = var3 << var4;
      var3 = var0[1];
      var2[1] = var3 >>> var1 | var5;
      var5 = var3 << var4;
      var3 = var0[2];
      var2[2] = var3 >>> var1 | var5;
      var5 = var3 << var4;
      var3 = var0[3];
      var2[3] = var3 >>> var1 | var5;
      return var3 << var4;
   }

   static int shiftRightN(int[] var0, int var1) {
      int var2 = var0[0];
      int var3 = 32 - var1;
      var0[0] = var2 >>> var1;
      int var4 = var2 << var3;
      var2 = var0[1];
      var0[1] = var2 >>> var1 | var4;
      var4 = var2 << var3;
      var2 = var0[2];
      var0[2] = var2 >>> var1 | var4;
      var4 = var2 << var3;
      var2 = var0[3];
      var0[3] = var2 >>> var1 | var4;
      return var2 << var3;
   }

   public static byte[] asBytes(long[] var0) {
      byte[] var1 = new byte[16];
      Pack.longToBigEndian(var0, var1, 0);
      return var1;
   }

   public static void xor(byte[] var0, byte[] var1, byte[] var2) {
      int var3 = 0;

      do {
         var2[var3] = (byte)(var0[var3] ^ var1[var3]);
         ++var3;
         var2[var3] = (byte)(var0[var3] ^ var1[var3]);
         ++var3;
         var2[var3] = (byte)(var0[var3] ^ var1[var3]);
         ++var3;
         var2[var3] = (byte)(var0[var3] ^ var1[var3]);
         ++var3;
      } while(var3 < 16);

   }

   public static void xor(int[] var0, int[] var1) {
      var0[0] ^= var1[0];
      var0[1] ^= var1[1];
      var0[2] ^= var1[2];
      var0[3] ^= var1[3];
   }

   public static void xor(int[] var0, int[] var1, int[] var2) {
      var2[0] = var0[0] ^ var1[0];
      var2[1] = var0[1] ^ var1[1];
      var2[2] = var0[2] ^ var1[2];
      var2[3] = var0[3] ^ var1[3];
   }

   public static long[] oneAsLongs() {
      long[] var0 = new long[]{Long.MIN_VALUE, 0L};
      return var0;
   }

   public static void xor(long[] var0, long[] var1, long[] var2) {
      var2[0] = var0[0] ^ var1[0];
      var2[1] = var0[1] ^ var1[1];
   }
}
