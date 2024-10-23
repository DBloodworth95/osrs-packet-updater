public abstract class fm extends to {
   abstract void ae(go var1, byte var2);

   abstract void aq(go var1);

   static void ap(boolean var0, int var1) {
      try {
         byte var2 = 0;
         boolean var10000;
         if (re.vt.bn(-264532147) >= client.ct * -1888871377) {
            if (var1 >= -1388796322) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var3 = var10000;
         if (!var3) {
            if (var1 >= -1388796322) {
               throw new IllegalStateException();
            }

            var2 = 12;
         } else {
            label57: {
               if (!ae.be.hr(245347311)) {
                  if (var1 >= -1388796322) {
                     throw new IllegalStateException();
                  }

                  if (!ae.be.hi(-837596325)) {
                     if (var1 >= -1388796322) {
                        throw new IllegalStateException();
                     }

                     if (!ae.be.hk(1297404830)) {
                        break label57;
                     }

                     if (var1 >= -1388796322) {
                        throw new IllegalStateException();
                     }
                  }
               }

               var2 = 10;
            }
         }

         cw.ao(var2, 1286950614);
         if (var0) {
            if (var1 >= -1388796322) {
               throw new IllegalStateException();
            }

            dp.cj = "";
            dp.cx = "";
            ch.cd = 0;
            px.ce = "";
         }

         nb.ag((byte)107);
         ev.aq((byte)1);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "fm.ap(" + ')');
      }
   }

   abstract void ag(vf var1);

   abstract void am(vf var1);

   abstract void ax(vf var1);

   abstract void ac(vf var1, byte var2);

   abstract void af(go var1);

   abstract void at(go var1);

   abstract void au(go var1);

   static long id(int var0) {
      try {
         return client.ma * -2377611982249716887L;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "fm.id(" + ')');
      }
   }

   fm() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "fm.<init>(" + ')');
      }
   }

   static void as(int var0, String var1, byte var2) {
      try {
         dp.an = var1;
         dp.aw = 1269417315 * var0;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fm.as(" + ')');
      }
   }

   static void ae(int var0, int var1, int var2) {
      try {
         int[] var3 = new int[4];
         int[] var4 = new int[4];
         var3[0] = var0;
         var4[0] = var1;
         int var5 = 1;

         for(int var6 = 0; var6 < 4; ++var6) {
            if (var2 != 234253922) {
               throw new IllegalStateException();
            }

            if (cr.au[var6] != var0) {
               if (var2 != 234253922) {
                  throw new IllegalStateException();
               }

               var3[var5] = cr.au[var6];
               var4[var5] = cr.at[var6];
               ++var5;
            }
         }

         cr.au = var3;
         cr.at = var4;
         client.ag(br.ax, 0, br.ax.length - 1, cr.au, cr.at, -1635008324);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "fm.ae(" + ')');
      }
   }
}
