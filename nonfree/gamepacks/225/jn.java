public class jn {
   int ag;
   int ae;
   int aq;
   int ac;
   int ax;
   int am;
   static final int ad = 60;
   static final int tz = 512;

   jn(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         super();
         this.ac = 997510397 * var1;
         this.ae = var2 * -1144528333;
         this.ag = -1564094191 * var3;
         this.am = var4 * -252725361;
         this.ax = var5 * -2068307457;
         this.aq = var6 * 888604225;
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "jn.<init>(" + ')');
      }
   }

   static int ao(int var0, dt var1, boolean var2, int var3) {
      try {
         ny var10000;
         if (var2) {
            if (var3 == -1319153798) {
               throw new IllegalStateException();
            }

            var10000 = cs.ab;
         } else {
            var10000 = ry.ap;
         }

         ny var4 = var10000;
         if (1800 == var0) {
            if (var3 == -1319153798) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = tw.ac(lj.oq(var4, (byte)108), 1575031074);
               return 1;
            }
         } else if (var0 == 1801) {
            if (var3 == -1319153798) {
               throw new IllegalStateException();
            } else {
               int var5 = cs.at[(mp.au -= -1856457959) * 844691753];
               --var5;
               if (var4.eo != null) {
                  if (var3 == -1319153798) {
                     throw new IllegalStateException();
                  }

                  if (var5 < var4.eo.length) {
                     if (var3 == -1319153798) {
                        throw new IllegalStateException();
                     }

                     if (var4.eo[var5] != null) {
                        cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4.eo[var5];
                        return 1;
                     }

                     if (var3 == -1319153798) {
                        throw new IllegalStateException();
                     }
                  }
               }

               cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
               return 1;
            }
         } else if (1802 == var0) {
            if (var3 == -1319153798) {
               throw new IllegalStateException();
            } else {
               if (var4.ei == null) {
                  if (var3 == -1319153798) {
                     throw new IllegalStateException();
                  }

                  cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
               } else {
                  cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4.ei;
               }

               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "jn.ao(" + ')');
      }
   }
}
