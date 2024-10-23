public class dj extends to {
   static final int bl = 1003;
   int ac;
   boolean ag;
   int ae;

   static boolean jc(byte var0) {
      try {
         boolean var10000;
         if ((client.np * 1716697315 & 4) != 0) {
            if (var0 <= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dj.jc(" + ')');
      }
   }

   dj() {
      try {
         super();
         this.ag = false;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dj.<init>(" + ')');
      }
   }

   static void ae(do var0, int var1, int var2, int var3) {
      try {
         Object[] var4 = var0.ac;
         dt var5;
         if (pm.ac(var0.ah * -1136293661, (byte)96)) {
            gs.ay = (li)var4[0];
            hf var6 = fq.ac(gs.ay.ac * -2015077723, 506623786);
            var5 = gv.ae(-1136293661 * var0.ah, 1901462683 * var6.ax, var6.an * -1050328213, (short)-18109);
         } else {
            int var8 = (Integer)var4[0];
            var5 = ay.ac(var8, 1222515241);
         }

         if (null != var5) {
            if (var3 <= -1873634165) {
               throw new IllegalStateException();
            }

            la.ag(var0, var5, var1, var2, 388340503);
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "dj.ae(" + ')');
      }
   }

   static final void mj(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (ir.ep.ag(var0, (byte)32)) {
            mn.pa = null;
            eh.mk(ir.ep.aq[var0], -1, var1, var2, var3, var4, var5, var6, var7, -656530420);
            if (null != mn.pa) {
               eh.mk(mn.pa, -1412584499, var1, var2, var3, var4, 1837970759 * fw.pr, 1043309719 * ok.pw, var7, -656530420);
               mn.pa = null;
            }

         } else {
            if (-1 != var7) {
               client.ri[var7] = true;
            } else {
               for(int var9 = 0; var9 < 100; ++var9) {
                  client.ri[var9] = true;
               }
            }

         }
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "dj.mj(" + ')');
      }
   }

   public static boolean ph(int var0) {
      try {
         boolean var10000;
         if (client.pe * 703902891 >= 2) {
            if (var0 != 1483868129) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dj.ph(" + ')');
      }
   }
}
