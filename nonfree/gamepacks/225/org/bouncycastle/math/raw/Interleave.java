package org.bouncycastle.math.raw;

public class Interleave {
   static final long M32 = 1431655765L;
   static final long M64 = 6148914691236517205L;

   public static int expand8to16(int var0) {
      var0 &= 255;
      var0 = (var0 | var0 << 4) & 3855;
      var0 = (var0 | var0 << 2) & 13107;
      var0 = (var0 | var0 << 1) & 21845;
      return var0;
   }

   public static long expand32to64(int var0) {
      int var1 = (var0 ^ var0 >>> 8) & '\uff00';
      var0 ^= var1 ^ var1 << 8;
      var1 = (var0 ^ var0 >>> 4) & 15728880;
      var0 ^= var1 ^ var1 << 4;
      var1 = (var0 ^ var0 >>> 2) & 202116108;
      var0 ^= var1 ^ var1 << 2;
      var1 = (var0 ^ var0 >>> 1) & 572662306;
      var0 ^= var1 ^ var1 << 1;
      return ((long)(var0 >>> 1) & 1431655765L) << 32 | (long)var0 & 1431655765L;
   }

   public static void expand64To128(long var0, long[] var2, int var3) {
      long var4 = (var0 ^ var0 >>> 16) & 4294901760L;
      var0 ^= var4 ^ var4 << 16;
      var4 = (var0 ^ var0 >>> 8) & 280375465148160L;
      var0 ^= var4 ^ var4 << 8;
      var4 = (var0 ^ var0 >>> 4) & 67555025218437360L;
      var0 ^= var4 ^ var4 << 4;
      var4 = (var0 ^ var0 >>> 2) & 868082074056920076L;
      var0 ^= var4 ^ var4 << 2;
      var4 = (var0 ^ var0 >>> 1) & 2459565876494606882L;
      var0 ^= var4 ^ var4 << 1;
      var2[var3] = var0 & 6148914691236517205L;
      var2[var3 + 1] = var0 >>> 1 & 6148914691236517205L;
   }

   public static int expand16to32(int var0) {
      var0 &= 65535;
      var0 = (var0 | var0 << 8) & 16711935;
      var0 = (var0 | var0 << 4) & 252645135;
      var0 = (var0 | var0 << 2) & 858993459;
      var0 = (var0 | var0 << 1) & 1431655765;
      return var0;
   }

   public static long unshuffle(long var0) {
      long var2 = (var0 ^ var0 >>> 1) & 2459565876494606882L;
      var0 ^= var2 ^ var2 << 1;
      var2 = (var0 ^ var0 >>> 2) & 868082074056920076L;
      var0 ^= var2 ^ var2 << 2;
      var2 = (var0 ^ var0 >>> 4) & 67555025218437360L;
      var0 ^= var2 ^ var2 << 4;
      var2 = (var0 ^ var0 >>> 8) & 280375465148160L;
      var0 ^= var2 ^ var2 << 8;
      var2 = (var0 ^ var0 >>> 16) & 4294901760L;
      var0 ^= var2 ^ var2 << 16;
      return var0;
   }
}
