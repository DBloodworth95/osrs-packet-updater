public class md {
   static int[] ap;
   static final int ad = 21;

   public static int ao(int var0, int var1) {
      int var2;
      for(var2 = 1; var1 > 1; var1 >>= 1) {
         if (0 != (var1 & 1)) {
            var2 *= var0;
         }

         var0 *= var0;
      }

      if (var1 == 1) {
         return var0 * var2;
      } else {
         return var2;
      }
   }

   static {
      new Object();
      ap = new int[33];
      ap[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         ap[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public static int au(int var0, int var1) {
      int var2;
      for(var2 = 1; var1 > 1; var1 >>= 1) {
         if (0 != (var1 & 1)) {
            var2 *= var0;
         }

         var0 *= var0;
      }

      if (var1 == 1) {
         return var0 * var2;
      } else {
         return var2;
      }
   }

   public static int an(int var0, int var1) {
      int var2;
      for(var2 = 1; var1 > 1; var1 >>= 1) {
         if (0 != (var1 & 1)) {
            var2 *= var0;
         }

         var0 *= var0;
      }

      if (var1 == 1) {
         return var0 * var2;
      } else {
         return var2;
      }
   }

   public static int ax(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= -631942443) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 690029539) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var1 + var0;
   }

   public static int af(int var0) {
      return ap[var0];
   }

   public static int ar(int var0) {
      return ap[var0];
   }

   public static int ab(int var0) {
      var0 = (var0 & 1381249608) + (var0 >>> 1 & 1431655765);
      var0 = (var0 & -1628111189) + (var0 >>> 2 & -986594549);
      var0 = (var0 >>> 4) + var0 & -1019446206;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 2105601154;
   }

   md() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "md.<init>(" + ')');
      }
   }

   public static int ag(int var0, int var1, int var2) {
      int var3 = cr.aw(1 + (var2 - var1), 107021418);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }

   public static int aq(int var0, int var1, int var2) {
      if (var1 < var0) {
         throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
      } else {
         return Math.max(var0, Math.min(var2, var1));
      }
   }

   public static int ac(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int ad(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int az(int var0, int var1, int var2) {
      int var3 = cr.aw(var2 - var1 + 1, 107021418);
      var3 <<= var1;
      return var0 & ~var3;
   }

   public static int av(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int al(int var0, int var1, int var2) {
      if (var1 < var0) {
         throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
      } else {
         return Math.max(var0, Math.min(var2, var1));
      }
   }

   public static int aa(int var0, int var1, int var2) {
      if (var1 < var0) {
         throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
      } else {
         return Math.max(var0, Math.min(var2, var1));
      }
   }

   public static float ah(float var0, float var1, float var2) {
      if (var1 < var0) {
         throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
      } else {
         return Math.max(var0, Math.min(var2, var1));
      }
   }

   public static float bh(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      float var11 = (float)((var4 - var3) * (var5 - var7) + (var6 - var7) * (var2 - var4));
      float var12 = (float)((var6 - var7) * (var0 - var4) + (var1 - var7) * (var4 - var3)) / var11;
      float var13 = (float)((var0 - var4) * (var7 - var5) + (var1 - var7) * (var2 - var4)) / var11;
      float var14 = 1.0F - var12 - var13;
      return var14 * var10 + var12 * var8 + var9 * var13;
   }

   public static float bj(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      float var11 = (float)((var4 - var3) * (var5 - var7) + (var6 - var7) * (var2 - var4));
      float var12 = (float)((var6 - var7) * (var0 - var4) + (var1 - var7) * (var4 - var3)) / var11;
      float var13 = (float)((var0 - var4) * (var7 - var5) + (var1 - var7) * (var2 - var4)) / var11;
      float var14 = 1.0F - var12 - var13;
      return var14 * var10 + var12 * var8 + var9 * var13;
   }
}
