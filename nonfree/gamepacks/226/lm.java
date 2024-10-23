public class lm {
   lm() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "lm.<init>(" + ')');
      }
   }

   public static final int aw(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (var2 != 0.0D) {
         double var12;
         if (var4 < 0.5D) {
            var12 = (1.0D + var2) * var4;
         } else {
            var12 = var4 + var2 - var4 * var2;
         }

         double var14 = var4 * 2.0D - var12;
         double var16 = 0.3333333333333333D + var0;
         if (var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if (var20 < 0.0D) {
            ++var20;
         }

         if (6.0D * var16 < 1.0D) {
            var6 = var14 + var16 * (var12 - var14) * 6.0D;
         } else if (var16 * 2.0D < 1.0D) {
            var6 = var12;
         } else if (var16 * 3.0D < 2.0D) {
            var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
         } else {
            var6 = var14;
         }

         if (6.0D * var0 < 1.0D) {
            var8 = 6.0D * (var12 - var14) * var0 + var14;
         } else if (2.0D * var0 < 1.0D) {
            var8 = var12;
         } else if (3.0D * var0 < 2.0D) {
            var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D;
         } else {
            var8 = var14;
         }

         if (6.0D * var20 < 1.0D) {
            var10 = var20 * (var12 - var14) * 6.0D + var14;
         } else if (2.0D * var20 < 1.0D) {
            var10 = var12;
         } else if (var20 * 3.0D < 2.0D) {
            var10 = var14 + 6.0D * (0.6666666666666666D - var20) * (var12 - var14);
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0D);
      int var13 = (int)(var8 * 256.0D);
      int var23 = (int)(256.0D * var10);
      int var15 = var23 + (var22 << 16) + (var13 << 8);
      return var15;
   }

   public static final int ak(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (var2 != 0.0D) {
         double var12;
         if (var4 < 0.5D) {
            var12 = (1.0D + var2) * var4;
         } else {
            var12 = var4 + var2 - var4 * var2;
         }

         double var14 = var4 * 2.0D - var12;
         double var16 = 0.3333333333333333D + var0;
         if (var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if (var20 < 0.0D) {
            ++var20;
         }

         if (6.0D * var16 < 1.0D) {
            var6 = var14 + var16 * (var12 - var14) * 6.0D;
         } else if (var16 * 2.0D < 1.0D) {
            var6 = var12;
         } else if (var16 * 3.0D < 2.0D) {
            var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
         } else {
            var6 = var14;
         }

         if (6.0D * var0 < 1.0D) {
            var8 = 6.0D * (var12 - var14) * var0 + var14;
         } else if (2.0D * var0 < 1.0D) {
            var8 = var12;
         } else if (3.0D * var0 < 2.0D) {
            var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D;
         } else {
            var8 = var14;
         }

         if (6.0D * var20 < 1.0D) {
            var10 = var20 * (var12 - var14) * 6.0D + var14;
         } else if (2.0D * var20 < 1.0D) {
            var10 = var12;
         } else if (var20 * 3.0D < 2.0D) {
            var10 = var14 + 6.0D * (0.6666666666666666D - var20) * (var12 - var14);
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0D);
      int var13 = (int)(var8 * 256.0D);
      int var23 = (int)(256.0D * var10);
      int var15 = var23 + (var22 << 16) + (var13 << 8);
      return var15;
   }

   public static final int aj(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (var2 != 0.0D) {
         double var12;
         if (var4 < 0.5D) {
            var12 = (1.0D + var2) * var4;
         } else {
            var12 = var4 + var2 - var4 * var2;
         }

         double var14 = var4 * 2.0D - var12;
         double var16 = 0.3333333333333333D + var0;
         if (var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if (var20 < 0.0D) {
            ++var20;
         }

         if (6.0D * var16 < 1.0D) {
            var6 = var14 + var16 * (var12 - var14) * 6.0D;
         } else if (var16 * 2.0D < 1.0D) {
            var6 = var12;
         } else if (var16 * 3.0D < 2.0D) {
            var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
         } else {
            var6 = var14;
         }

         if (6.0D * var0 < 1.0D) {
            var8 = 6.0D * (var12 - var14) * var0 + var14;
         } else if (2.0D * var0 < 1.0D) {
            var8 = var12;
         } else if (3.0D * var0 < 2.0D) {
            var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D;
         } else {
            var8 = var14;
         }

         if (6.0D * var20 < 1.0D) {
            var10 = var20 * (var12 - var14) * 6.0D + var14;
         } else if (2.0D * var20 < 1.0D) {
            var10 = var12;
         } else if (var20 * 3.0D < 2.0D) {
            var10 = var14 + 6.0D * (0.6666666666666666D - var20) * (var12 - var14);
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0D);
      int var13 = (int)(var8 * 256.0D);
      int var23 = (int)(256.0D * var10);
      int var15 = var23 + (var22 << 16) + (var13 << 8);
      return var15;
   }

   public static final int ai(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (var2 != 0.0D) {
         double var12;
         if (var4 < 0.5D) {
            var12 = (1.0D + var2) * var4;
         } else {
            var12 = var4 + var2 - var4 * var2;
         }

         double var14 = var4 * 2.0D - var12;
         double var16 = 0.3333333333333333D + var0;
         if (var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if (var20 < 0.0D) {
            ++var20;
         }

         if (6.0D * var16 < 1.0D) {
            var6 = var14 + var16 * (var12 - var14) * 6.0D;
         } else if (var16 * 2.0D < 1.0D) {
            var6 = var12;
         } else if (var16 * 3.0D < 2.0D) {
            var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
         } else {
            var6 = var14;
         }

         if (6.0D * var0 < 1.0D) {
            var8 = 6.0D * (var12 - var14) * var0 + var14;
         } else if (2.0D * var0 < 1.0D) {
            var8 = var12;
         } else if (3.0D * var0 < 2.0D) {
            var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D;
         } else {
            var8 = var14;
         }

         if (6.0D * var20 < 1.0D) {
            var10 = var20 * (var12 - var14) * 6.0D + var14;
         } else if (2.0D * var20 < 1.0D) {
            var10 = var12;
         } else if (var20 * 3.0D < 2.0D) {
            var10 = var14 + 6.0D * (0.6666666666666666D - var20) * (var12 - var14);
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0D);
      int var13 = (int)(var8 * 256.0D);
      int var23 = (int)(256.0D * var10);
      int var15 = var23 + (var22 << 16) + (var13 << 8);
      return var15;
   }

   static int aw(int var0, int var1, int var2) {
      try {
         if (var0 == -2) {
            if (var2 <= 1294212457) {
               throw new IllegalStateException();
            } else {
               return 12345678;
            }
         } else if (var0 == -1) {
            if (var2 <= 1294212457) {
               throw new IllegalStateException();
            } else {
               if (var1 < 0) {
                  var1 = 0;
               } else if (var1 > 127) {
                  if (var2 <= 1294212457) {
                     throw new IllegalStateException();
                  }

                  var1 = 127;
               }

               var1 = 127 - var1;
               return var1;
            }
         } else {
            var1 = var1 * (var0 & 127) / 128;
            if (var1 < 2) {
               if (var2 <= 1294212457) {
                  throw new IllegalStateException();
               }

               var1 = 2;
            } else if (var1 > 126) {
               if (var2 <= 1294212457) {
                  throw new IllegalStateException();
               }

               var1 = 126;
            }

            return (var0 & 'ﾀ') + var1;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "lm.aw(" + ')');
      }
   }

   static void ap(int var0) {
      try {
         for(cj var1 = (cj)cj.ap.as(); null != var1; var1 = (cj)cj.ap.am()) {
            if (var0 >= -1727383167) {
               throw new IllegalStateException();
            }

            if (var1.at != null) {
               if (var0 >= -1727383167) {
                  throw new IllegalStateException();
               }

               ng.ts.aw(var1.at);
               var1.at = null;
            }

            if (null != var1.ar) {
               ng.ts.aw(var1.ar);
               var1.ar = null;
            }
         }

         cj.ap.ap();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "lm.ap(" + ')');
      }
   }
}
