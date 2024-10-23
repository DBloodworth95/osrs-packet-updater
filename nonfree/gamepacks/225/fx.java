public class fx extends fm {
   public static final int ax = 4;
   boolean ae;
   // $FF: synthetic field
   final fz this$0;
   int ac;
   static final int cj = 4;

   static void az(boolean var0, int var1) {
      try {
         if (var0) {
            if (var1 != -4045494) {
               throw new IllegalStateException();
            }

            cy.ab(1870578311);
         } else {
            for(int var2 = 0; var2 < mm.aq.size(); ++var2) {
               if (var1 != -4045494) {
                  return;
               }

               ns var3 = (ns)mm.aq.get(var2);
               if (null == var3) {
                  if (var1 != -4045494) {
                     throw new IllegalStateException();
                  }

                  mm.aq.remove(var2);
                  --var2;
               } else if (var3.ar) {
                  if (var1 != -4045494) {
                     throw new IllegalStateException();
                  }

                  if (1813270399 * var3.al.bb > 0) {
                     if (var1 != -4045494) {
                        return;
                     }

                     ms var10000 = var3.al;
                     var10000.bb -= 1130066047;
                  }

                  var3.al.ah(2112566380);
                  var3.al.ar((byte)81);
                  var3.al.ac(0, -1915591296);
                  mm.aq.remove(var2);
                  --var2;
               } else {
                  var3.ar = true;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "fx.az(" + ')');
      }
   }

   void au(go var1) {
      var1.ap(636380501 * this.ac, this.ae, -2008435482);
   }

   void ae(go var1, byte var2) {
      try {
         var1.ap(-203536179 * this.ac, this.ae, -1914954160);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fx.ae(" + ')');
      }
   }

   void ag(vf var1) {
      this.ac = var1.ct(-1494187016) * 1528488965;
      this.ae = var1.cv(952452697) == 1;
   }

   void am(vf var1) {
      this.ac = var1.ct(-2057761548) * 1428417437;
      this.ae = var1.cv(952452697) == 1;
   }

   void ac(vf var1, byte var2) {
      try {
         this.ac = var1.ct(-1609162530) * 1528488965;
         boolean var10001;
         if (var1.cv(952452697) == 1) {
            if (var2 <= 59) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.ae = var10001;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fx.ac(" + ')');
      }
   }

   void aq(go var1) {
      var1.ap(-203536179 * this.ac, this.ae, -2022702716);
   }

   fx(fz var1) {
      try {
         this.this$0 = var1;
         super();
         this.ac = -1528488965;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fx.<init>(" + ')');
      }
   }

   void ax(vf var1) {
      this.ac = var1.ct(-1408126445) * -1751071759;
      this.ae = var1.cv(952452697) == 1;
   }

   void at(go var1) {
      var1.ap(-1678169072 * this.ac, this.ae, -1965865145);
   }

   void af(go var1) {
      var1.ap(-203536179 * this.ac, this.ae, -2099236212);
   }

   public static void al(byte var0) {
      try {
         rg.am = null;
         dp.ax = null;
         pp.aq = null;
         kj.af = null;
         vp.at = null;
         nq.au = (byte[][])null;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "fx.al(" + ')');
      }
   }
}
