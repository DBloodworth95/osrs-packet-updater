import java.util.concurrent.locks.ReentrantLock;

public class bt {
   ReentrantLock ag;
   cf ac;
   bg ae;

   static cr au(int var0) {
      try {
         if (-1618840033 * cr.af < cr.aq * -571562711) {
            if (var0 != -1090907831) {
               throw new IllegalStateException();
            } else {
               return br.ax[(cr.af += 1751352799) * -1618840033 - 1];
            }
         } else {
            return null;
         }
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bt.au(" + ')');
      }
   }

   public static void ac(int var0) {
      try {
         hm.ac.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bt.ac(" + ')');
      }
   }

   bt(cf var1, bg var2) {
      try {
         super();
         this.ac = var1;
         this.ae = var2;
         this.ag = new ReentrantLock();
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "bt.<init>(" + ')');
      }
   }

   static kx[] ac(int var0) {
      try {
         return new kx[]{kx.am, kx.ac, kx.ag, kx.aq, kx.ax, kx.af, kx.ae};
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bt.ac(" + ')');
      }
   }

   public static final int ac(double var0, double var2, double var4) {
      try {
         double var6 = var4;
         double var8 = var4;
         double var10 = var4;
         if (var2 != 0.0D) {
            double var12;
            if (var4 < 0.5D) {
               var12 = var4 * (var2 + 1.0D);
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

            if (var16 * 6.0D < 1.0D) {
               var6 = var16 * (var12 - var14) * 6.0D + var14;
            } else if (var16 * 2.0D < 1.0D) {
               var6 = var12;
            } else if (var16 * 3.0D < 2.0D) {
               var6 = var14 + (0.6666666666666666D - var16) * (var12 - var14) * 6.0D;
            } else {
               var6 = var14;
            }

            if (var0 * 6.0D < 1.0D) {
               var8 = var0 * 6.0D * (var12 - var14) + var14;
            } else if (var0 * 2.0D < 1.0D) {
               var8 = var12;
            } else if (var0 * 3.0D < 2.0D) {
               var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D;
            } else {
               var8 = var14;
            }

            if (var20 * 6.0D < 1.0D) {
               var10 = var14 + var20 * 6.0D * (var12 - var14);
            } else if (2.0D * var20 < 1.0D) {
               var10 = var12;
            } else if (var20 * 3.0D < 2.0D) {
               var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
            } else {
               var10 = var14;
            }
         }

         int var23 = (int)(var6 * 256.0D);
         int var13 = (int)(256.0D * var8);
         int var24 = (int)(var10 * 256.0D);
         int var15 = var24 + (var13 << 8) + (var23 << 16);
         return var15;
      } catch (RuntimeException var22) {
         throw vk.ae(var22, "bt.ac(" + ')');
      }
   }
}
