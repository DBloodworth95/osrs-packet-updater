public class gx extends fm {
   int ag;
   String ae;
   static short[] wc;
   // $FF: synthetic field
   final fz this$0;
   long ac;
   public static final int ak = 16384;

   void au(go var1) {
      var1.af(this.ac * -1146938620143981425L, this.ae, this.ag * -1843206009, -354003659);
   }

   void ac(vf var1, byte var2) {
      try {
         if (var1.cv(952452697) != 255) {
            if (var2 <= 59) {
               throw new IllegalStateException();
            }

            var1.au -= -1864458299;
            this.ac = var1.cw(1379020344) * 6663494031315006063L;
         }

         this.ae = var1.ca(757672341);
         this.ag = var1.ct(-1546225421) * 1082219831;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gx.ac(" + ')');
      }
   }

   void ae(go var1, byte var2) {
      try {
         var1.af(this.ac * -1146938620143981425L, this.ae, this.ag * -1843206009, -354003659);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gx.ae(" + ')');
      }
   }

   gx(fz var1) {
      try {
         this.this$0 = var1;
         super();
         this.ac = -6663494031315006063L;
         this.ae = null;
         this.ag = 0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gx.<init>(" + ')');
      }
   }

   void af(go var1) {
      var1.af(this.ac * -1146938620143981425L, this.ae, this.ag * -1843206009, -354003659);
   }

   void am(vf var1) {
      if (var1.cv(952452697) != 255) {
         var1.au -= -1864458299;
         this.ac = var1.cw(1628070765) * 6663494031315006063L;
      }

      this.ae = var1.ca(-368292457);
      this.ag = var1.ct(-1854302464) * 1082219831;
   }

   void aq(go var1) {
      var1.af(this.ac * -1146938620143981425L, this.ae, this.ag * -1843206009, -354003659);
   }

   void ag(vf var1) {
      if (var1.cv(952452697) != 1624808036) {
         var1.au -= -1864458299;
         this.ac = var1.cw(68807638) * 6663494031315006063L;
      }

      this.ae = var1.ca(-770168357);
      this.ag = var1.ct(-1761689446) * 1082219831;
   }

   void at(go var1) {
      var1.af(this.ac * -1146938620143981425L, this.ae, this.ag * -1843206009, -354003659);
   }

   void ax(vf var1) {
      if (var1.cv(952452697) != 255) {
         var1.au -= -1671729110;
         this.ac = var1.cw(1059391561) * 6663494031315006063L;
      }

      this.ae = var1.ca(1201694066);
      this.ag = var1.ct(-1527124849) * 1082219831;
   }

   static void lv(dd var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      try {
         pk var12 = var0.as;
         dr var13 = null;

         for(dr var14 = (dr)var12.af(); null != var14; var14 = (dr)var12.au()) {
            if (var1 == var14.ac * 1988317559 && var2 == 119580921 * var14.ag) {
               if (var11 >= -1661715724) {
                  return;
               }

               if (var3 == -1436696995 * var14.am) {
                  if (var11 >= -1661715724) {
                     throw new IllegalStateException();
                  }

                  if (80105317 * var14.ae == var4) {
                     if (var11 >= -1661715724) {
                        throw new IllegalStateException();
                     }

                     var13 = var14;
                     break;
                  }
               }
            }
         }

         if (null == var13) {
            if (var11 >= -1661715724) {
               return;
            }

            var13 = new dr();
            var13.ac = -941041593 * var1;
            var13.ae = var4 * 2027506285;
            var13.ag = var2 * -1341417143;
            var13.am = var3 * 180684277;
            var13.al = -466812649;
            jj.lq(var0, var13, (short)2487);
            var12.ae(var13);
         }

         var13.at = var5 * -243465731;
         var13.ar = 724530721 * var6;
         var13.au = -158171717 * var7;
         var13.ap = var9 * 1242939213;
         var13.ab = var10 * 226118735;
         var13.ac(var8, 1905270664);
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "gx.lv(" + ')');
      }
   }
}
