public class fi extends fm {
   // $FF: synthetic field
   final fz this$0;
   String ae;
   long ac;
   public static final int ab = 90;
   public static final int ad = 2048;

   public static boolean ar(char var0, int var1) {
      try {
         boolean var10000;
         label53: {
            if (var0 >= '0') {
               if (var1 != 16711935) {
                  throw new IllegalStateException();
               }

               if (var0 <= '9') {
                  break label53;
               }

               if (var1 != 16711935) {
                  throw new IllegalStateException();
               }
            }

            if (var0 >= 'A') {
               if (var1 != 16711935) {
                  throw new IllegalStateException();
               }

               if (var0 <= 'Z') {
                  break label53;
               }

               if (var1 != 16711935) {
                  throw new IllegalStateException();
               }
            }

            if (var0 < 'a' || var0 > 'z') {
               var10000 = false;
               return var10000;
            }

            if (var1 != 16711935) {
               throw new IllegalStateException();
            }
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fi.ar(" + ')');
      }
   }

   void aq(go var1) {
      var1.af(-6432279982112298727L * this.ac, this.ae, 0, -354003659);
   }

   void ac(vf var1, byte var2) {
      try {
         if (var1.cv(952452697) != 255) {
            var1.au -= -1864458299;
            this.ac = var1.cw(411798246) * -620374307288374487L;
         }

         this.ae = var1.ca(-1344469846);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fi.ac(" + ')');
      }
   }

   void ag(vf var1) {
      if (var1.cv(952452697) != 255) {
         var1.au -= -1864458299;
         this.ac = var1.cw(1364282704) * -620374307288374487L;
      }

      this.ae = var1.ca(-2049190902);
   }

   void af(go var1) {
      var1.af(-6432279982112298727L * this.ac, this.ae, 0, -354003659);
   }

   void ax(vf var1) {
      if (var1.cv(952452697) != 255) {
         var1.au -= -1864458299;
         this.ac = var1.cw(1397060537) * -620374307288374487L;
      }

      this.ae = var1.ca(18049212);
   }

   fi(fz var1) {
      try {
         this.this$0 = var1;
         super();
         this.ac = 620374307288374487L;
         this.ae = null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fi.<init>(" + ')');
      }
   }

   void am(vf var1) {
      if (var1.cv(952452697) != 255) {
         var1.au -= -1864458299;
         this.ac = var1.cw(280666310) * -620374307288374487L;
      }

      this.ae = var1.ca(-1647094235);
   }

   void at(go var1) {
      var1.af(-6432279982112298727L * this.ac, this.ae, 0, -354003659);
   }

   void au(go var1) {
      var1.af(-6432279982112298727L * this.ac, this.ae, 0, -354003659);
   }

   public static void af(int var0) {
      try {
         ho.ae.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "fi.af(" + ')');
      }
   }

   public static int ac(int var0, byte var1) {
      try {
         hl var3 = (hl)hl.ae.ac((long)var0);
         hl var2;
         if (null != var3) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var2 = var3;
         } else {
            byte[] var4 = hl.ac.bt(14, var0, (byte)96);
            var3 = new hl();
            if (null != var4) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               var3.ae(new vf(var4), 2120653875);
            }

            hl.ae.ag(var3, (long)var0);
            var2 = var3;
         }

         int var9 = 143859779 * var2.ag;
         int var5 = var2.am * -1870632745;
         int var6 = var2.ax * -833963677;
         int var7 = no.ac[var6 - var5];
         return no.am[var9] >> var5 & var7;
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "fi.ac(" + ')');
      }
   }

   void ae(go var1, byte var2) {
      try {
         var1.af(-6432279982112298727L * this.ac, this.ae, 0, -354003659);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fi.ae(" + ')');
      }
   }
}
