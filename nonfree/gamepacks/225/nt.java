public class nt {
   ch ae;
   public static qu ap;
   int ac;

   nt(int var1, ch var2) {
      try {
         super();
         this.ac = -1927985027 * var1;
         this.ae = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "nt.<init>(" + ')');
      }
   }

   static void af(byte var0) {
      try {
         eo.ac.clear();
         eo.ae.ag();
         eo.ag.ac();
         eo.am = 0;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "nt.af(" + ')');
      }
   }

   static final void np(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         if (!ir.ep.ag(var0, (byte)32)) {
            if (var7 >= 0) {
               throw new IllegalStateException();
            }
         } else {
            nx.ns(ir.ep.aq[var0], -1, var1, var2, var3, var4, var5, var6, -2107378340);
         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "nt.np(" + ')');
      }
   }

   static int aw(int var0, dt var1, boolean var2, byte var3) {
      try {
         ny var4 = ir.ep.ac(cs.at[(mp.au -= -1856457959) * 844691753], -1534649749);
         if (2800 == var0) {
            if (var3 >= 4) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = tw.ac(lj.oq(var4, (byte)-40), 1575031074);
               return 1;
            }
         } else if (var0 == 2801) {
            if (var3 >= 4) {
               throw new IllegalStateException();
            } else {
               int var5 = cs.at[(mp.au -= -1856457959) * 844691753];
               --var5;
               if (null != var4.eo) {
                  if (var3 >= 4) {
                     throw new IllegalStateException();
                  }

                  if (var5 < var4.eo.length) {
                     if (null != var4.eo[var5]) {
                        cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4.eo[var5];
                        return 1;
                     }

                     if (var3 >= 4) {
                        throw new IllegalStateException();
                     }
                  }
               }

               cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
               return 1;
            }
         } else if (2802 == var0) {
            if (var3 >= 4) {
               throw new IllegalStateException();
            } else {
               if (null == var4.ei) {
                  if (var3 >= 4) {
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
         throw vk.ae(var6, "nt.aw(" + ')');
      }
   }
}
