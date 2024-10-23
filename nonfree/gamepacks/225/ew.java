public final class ew extends ju {
   int ae;
   int ac;
   int at;
   int am;
   int ax;
   boolean aq;
   int ag;

   protected final jm ap() {
      return dh.ac(-2095652891 * this.ac, 2112441319).au(138922953 * this.ae, -200233811);
   }

   void ac(int var1, int var2) {
      try {
         this.at = -847914525 * var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ew.ac(" + ')');
      }
   }

   ew() {
      try {
         super();
         this.at = -515546499;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ew.<init>(" + ')');
      }
   }

   protected final jm ad(byte var1) {
      try {
         return dh.ac(-805118597 * this.ac, 2146830909).au(138922953 * this.ae, -1595459359);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ew.ad(" + ')');
      }
   }

   protected final jm ah() {
      return dh.ac(-1607150939 * this.ac, 2057437682).au(138922953 * this.ae, -1995564691);
   }

   void ag(int var1) {
      this.at = -1867435387 * var1;
   }

   protected final jm ab() {
      return dh.ac(-805118597 * this.ac, 2119551256).au(138922953 * this.ae, -1571444458);
   }

   boolean ae(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= -82134883) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               if (var2 <= -82134883) {
                  throw new IllegalStateException();
               }

               boolean var10000;
               if (0 != (-1685310517 * this.at & 1 << var1)) {
                  if (var2 <= -82134883) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ew.ae(" + ')');
      }
   }

   void am(int var1) {
      this.at = 1728753690 * var1;
   }

   void ax(int var1) {
      this.at = -847914525 * var1;
   }

   public static vt[] af(int var0) {
      try {
         vt[] var1 = new vt[1440067257 * vp.ac];

         for(int var2 = 0; var2 < 1440067257 * vp.ac; ++var2) {
            vt var3 = var1[var2] = new vt();
            var3.af = vp.ae * -1267556917;
            var3.at = vp.ag * -1551354163;
            var3.ax = rg.am[var2];
            var3.aq = dp.ax[var2];
            var3.ag = pp.aq[var2];
            var3.am = kj.af[var2];
            var3.ae = vp.at;
            var3.ac = nq.au[var2];
         }

         fx.al((byte)16);
         return var1;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ew.af(" + ')');
      }
   }
}
