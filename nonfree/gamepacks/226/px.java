public class px {
   static final px aj = new px();
   static final px aw = new px();
   static final px ak = new px();
   static final px ap = new px();

   static int ab(int var0, da var1, boolean var2, int var3) {
      try {
         ng var10000;
         if (var2) {
            if (var3 <= -1450976103) {
               throw new IllegalStateException();
            }

            var10000 = vx.ar;
         } else {
            var10000 = ac.af;
         }

         ng var4 = var10000;
         if (1700 == var0) {
            cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.go * -2104795295;
            return 1;
         } else if (1701 == var0) {
            if (var3 <= -1450976103) {
               throw new IllegalStateException();
            } else {
               if (var4.go * -2104795295 != -1) {
                  if (var3 <= -1450976103) {
                     throw new IllegalStateException();
                  }

                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -77256189 * var4.gi;
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 1702) {
            if (var3 <= -1450976103) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 597146807 * var4.bv;
               return 1;
            }
         } else if (1707 == var0) {
            if (var3 <= -1450976103) {
               throw new IllegalStateException();
            } else {
               int[] var6 = cm.ae;
               int var10001 = (dp.am += -1450976103) * -158156887 - 1;
               byte var10002;
               if (var4.bh(992054134)) {
                  if (var3 <= -1450976103) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var6[var10001] = var10002;
               return 1;
            }
         } else if (var0 == 1708) {
            return dr.az(var4, -1674143797);
         } else if (1709 == var0) {
            if (var3 <= -1450976103) {
               throw new IllegalStateException();
            } else {
               return df.ag(var4, 1943486547);
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "px.ab(" + ')');
      }
   }

   px() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "px.<init>(" + ')');
      }
   }
}
