public class jj {
   static final int ac = 8388607;
   public static final int aq = 10000;

   jj() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "jj.<init>(" + ')');
      }
   }

   static final int at(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var1 * var3 >> 16;
   }

   static final int au(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var1 * var3 >> 16;
   }

   static final int ar(int var0, int var1, int var2, int var3) {
      return var0 * var2 - var1 * var3 >> 16;
   }

   static final int ah(int var0, int var1, int var2, int var3) {
      return var1 * var3 + var2 * var0 >> 16;
   }

   static final int ad(int var0, int var1, int var2, int var3) {
      return var1 * var3 + var2 * var0 >> 16;
   }

   static final int al(int var0, int var1, int var2, int var3) {
      return var1 * var3 + var2 * var0 >> 16;
   }

   static final int ap(int var0, int var1, int var2, int var3) {
      return var1 * var3 + var2 * var0 >> 16;
   }

   static void ac(int var0, byte[] var1, sl var2, int var3) {
      try {
         ox var4 = new ox();
         var4.ac = 0;
         var4.hk = (long)var0;
         var4.ae = var1;
         var4.ag = var2;
         synchronized(oo.ac) {
            oo.ac.ae(var4);
         }

         synchronized(oo.am) {
            if (oo.ag * -758269509 == 0) {
               if (var3 <= 1434309593) {
                  return;
               }

               oo.ax = new Thread(new oo());
               oo.ax.setDaemon(true);
               oo.ax.start();
               oo.ax.setPriority(5);
            }

            oo.ag = 123409800;
         }
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "jj.ac(" + ')');
      }
   }

   static final int ab(int var0, int var1, int var2, int var3) {
      return var1 * var2 - var3 * var0 >> 16;
   }

   static final float aa(int var0) {
      float var1 = 10075.0F - (float)var0;
      return (var1 * 1.0075567F - 75.56675F) / var1;
   }

   public static final float ai(float var0) {
      float var1 = 75.0F;
      float var2 = 10000.0F;
      float var3 = 750000.0F / (10000.0F - 9925.0F * var0);
      return (var3 - 75.0F) / 9925.0F;
   }

   static final float az(int var0) {
      float var1 = 10075.0F - (float)var0;
      return (var1 * 1.0075567F - 75.56675F) / var1;
   }

   public static final float ao(float var0) {
      float var1 = 75.0F;
      float var2 = 10000.0F;
      float var3 = 750000.0F / (10000.0F - 9925.0F * var0);
      return (var3 - 75.0F) / 9925.0F;
   }

   static final void lq(dd var0, dr var1, short var2) {
      try {
         jh var3 = var0.ae;
         long var4 = 0L;
         int var6 = -1;
         int var7 = 0;
         int var8 = 0;
         if (var1.ae * 80105317 == 0) {
            if (var2 == 241) {
               throw new IllegalStateException();
            }

            var4 = var3.bf(var1.ac * 1988317559, 119580921 * var1.ag, -1436696995 * var1.am);
         }

         if (1 == var1.ae * 80105317) {
            if (var2 == 241) {
               throw new IllegalStateException();
            }

            var4 = var3.bm(1988317559 * var1.ac, var1.ag * 119580921, var1.am * -1436696995);
         }

         if (2 == 80105317 * var1.ae) {
            if (var2 == 241) {
               throw new IllegalStateException();
            }

            var4 = var3.bs(1988317559 * var1.ac, var1.ag * 119580921, -1436696995 * var1.am);
         }

         if (var1.ae * 80105317 == 3) {
            if (var2 == 241) {
               throw new IllegalStateException();
            }

            var4 = var3.bw(var1.ac * 1988317559, 119580921 * var1.ag, -1436696995 * var1.am);
         }

         if (0L != var4) {
            if (var2 == 241) {
               throw new IllegalStateException();
            }

            int var9 = var3.ba(var1.ac * 1988317559, var1.ag * 119580921, -1436696995 * var1.am, var4);
            var6 = ii.at(var4);
            var7 = var9 & 31;
            var8 = var9 >> 6 & 3;
         }

         var1.ax = -513930125 * var6;
         var1.af = -483567131 * var7;
         var1.aq = -108075681 * var8;
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "jj.lq(" + ')');
      }
   }
}
