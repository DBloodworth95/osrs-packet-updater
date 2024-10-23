public class mw {
   static int[] ac;
   static final int am = 1;
   static ob cm;

   public static int ak(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 256) {
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

      return var0 + var1;
   }

   static {
      new Object();
      ac = new int[33];
      ac[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         ac[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public static int ay(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int ar(int var0) {
      return ac[var0];
   }

   public static int al(int var0) {
      return ac[var0];
   }

   public static int ad(int var0) {
      return ac[var0];
   }

   public static int ai(int var0, int var1, int var2) {
      int var3 = ng.ac(1 + (var2 - var1), -2012418261);
      var3 <<= var1;
      return var0 & ~var3;
   }

   public static int ap(int var0) {
      var0 = (var0 >>> 1 & 1564550793) + (var0 & 1880247191);
      var0 = (var0 >>> 2 & -1361368454) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & -2144649655;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & -775845127;
   }

   public static int ab(int var0) {
      var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
      var0 = (var0 >>> 2 & -371077466) + (var0 & -203027609);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   public static int az(int var0, int var1, int var2) {
      int var3 = ng.ac(1 + (var2 - var1), -2012418261);
      var3 <<= var1;
      return var0 & ~var3;
   }

   public static int au(int var0) {
      return ac[var0];
   }

   public static int ah(int var0) {
      var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   public static int aa(int var0, int var1, int var2) {
      int var3 = ng.ac(1 + (var2 - var1), -2012418261);
      var3 <<= var1;
      return var0 & ~var3;
   }

   public static int as(int var0, int var1, int var2) {
      int var3 = ng.ac(1 + (var2 - var1), -2012418261);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }

   mw() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "mw.<init>(" + ')');
      }
   }

   public static int aj(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
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

   public static int aw(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int an(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= -533306552) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 256) {
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

      return var0 + var1;
   }

   public static int bn(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= -444130223) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 449999311) {
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

      return var0 + var1;
   }

   public static int bm(int var0, int var1, int var2) {
      if (var1 < var0) {
         throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
      } else {
         return Math.max(var0, Math.min(var2, var1));
      }
   }

   public static int bh(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= -125850471) {
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

      return var0 + var1;
   }

   public static long bd(int var0) {
      if (var0 > 63) {
         throw new qp("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
      } else {
         return (long)Math.pow(2.0D, (double)var0) - 1L;
      }
   }

   public static long bx(int var0) {
      if (var0 > 63) {
         throw new qp("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
      } else {
         return (long)Math.pow(2.0D, (double)var0) - 1L;
      }
   }

   public static int ao(int var0, int var1, int var2) {
      int var3 = ng.ac(1 + (var2 - var1), -2012418261);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }

   public static int bf(int var0, int var1, int var2) {
      if (var1 < var0) {
         throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
      } else {
         return Math.max(var0, Math.min(var2, var1));
      }
   }

   public static int bs(int var0, int var1, int var2) {
      if (var1 < var0) {
         throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
      } else {
         return Math.max(var0, Math.min(var2, var1));
      }
   }

   static void ax(int var0, int var1, int var2, boolean var3, int var4, boolean var5, int var6) {
      try {
         if (var0 < var1) {
            if (var6 != 1674298401) {
               throw new IllegalStateException();
            }

            int var7 = (var1 + var0) / 2;
            int var8 = var0;
            cr var9 = br.ax[var7];
            br.ax[var7] = br.ax[var1];
            br.ax[var1] = var9;

            for(int var10 = var0; var10 < var1; ++var10) {
               if (ip.aq(br.ax[var10], var9, var2, var3, var4, var5, (byte)-1) <= 0) {
                  cr var11 = br.ax[var10];
                  br.ax[var10] = br.ax[var8];
                  br.ax[var8++] = var11;
               }
            }

            br.ax[var1] = br.ax[var8];
            br.ax[var8] = var9;
            ax(var0, var8 - 1, var2, var3, var4, var5, 1674298401);
            ax(var8 + 1, var1, var2, var3, var4, var5, 1674298401);
         }

      } catch (RuntimeException var12) {
         throw vk.ae(var12, "mw.ax(" + ')');
      }
   }
}
