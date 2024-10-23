public class gl extends gu {
   static vt ax;
   // $FF: synthetic field
   final gj this$0;
   int ac;
   static po aq;
   static final int av = 1;
   static final int cc = 59;

   void ae(gm var1, int var2) {
      try {
         var1.ag(this.ac * -361407007, -1598387098);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gl.ae(" + ')');
      }
   }

   void ag(gm var1) {
      var1.ag(this.ac * -361407007, -1482786867);
   }

   void af(gm var1) {
      var1.ag(this.ac * -361407007, -1380449391);
   }

   void ac(vf var1, byte var2) {
      try {
         this.ac = var1.ct(-1898779645) * -2048940511;
         var1.cv(952452697);
         if (var1.cv(952452697) != 255) {
            if (var2 != 0) {
               return;
            }

            var1.au -= -1864458299;
            var1.cw(1790381877);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gl.ac(" + ')');
      }
   }

   gl(gj var1) {
      try {
         this.this$0 = var1;
         super();
         this.ac = 2048940511;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gl.<init>(" + ')');
      }
   }

   void ax(gm var1) {
      var1.ag(this.ac * 1751143937, -1425972346);
   }

   void aq(gm var1) {
      var1.ag(this.ac * -361407007, -584330793);
   }

   void am(gm var1) {
      var1.ag(this.ac * -361407007, -1226445895);
   }

   void at(vf var1) {
      this.ac = var1.ct(-1386664894) * -2048940511;
      var1.cv(952452697);
      if (var1.cv(952452697) != 255) {
         var1.au -= -1864458299;
         var1.cw(948384548);
      }

   }

   static String pj(String var0, int var1) {
      try {
         oq[] var2 = hy.ax(-2133992379);

         for(int var3 = 0; var3 < var2.length; ++var3) {
            oq var4 = var2[var3];
            if (1196051647 * var4.ao != -1) {
               if (var1 == 1068721216) {
                  throw new IllegalStateException();
               }

               if (var0.startsWith(hh.ac(1196051647 * var4.ao, -1081394536))) {
                  if (var1 == 1068721216) {
                     throw new IllegalStateException();
                  }

                  var0 = var0.substring(6 + Integer.toString(var4.ao * 1196051647).length());
                  break;
               }
            }
         }

         return var0;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "gl.pj(" + ')');
      }
   }
}
