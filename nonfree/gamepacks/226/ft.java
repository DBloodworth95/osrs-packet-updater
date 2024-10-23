public class ft extends fq {
   static vc[] kr;
   int aj;
   int ak;
   int ap;
   // $FF: synthetic field
   final fz this$0;
   static String hc;
   int aw;
   public static final int az = 15;

   void ai(gy var1) {
      var1.ar(this.ap * -1730636379, -1397888641 * this.aw, 564937003 * this.ak, -1263814509 * this.aj, 773003423);
   }

   void ap(vl var1, int var2) {
      try {
         this.ap = var1.ce(1278360075) * 1681672749;
         this.aw = var1.ch(1203709469) * -705177985;
         this.ak = var1.cy((short)-9951) * -466193021;
         this.aj = var1.cy((short)-14204) * -2038553189;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ft.ap(" + ')');
      }
   }

   void aw(gy var1, int var2) {
      try {
         var1.ar(this.ap * -1730636379, -1397888641 * this.aw, 564937003 * this.ak, -1263814509 * this.aj, -318423016);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ft.aw(" + ')');
      }
   }

   static final boolean mt(ng var0, byte var1) {
      try {
         if (null == var0.gj) {
            if (var1 >= 20) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            for(int var2 = 0; var2 < var0.gj.length; ++var2) {
               if (var1 >= 20) {
                  throw new IllegalStateException();
               }

               int var3 = fz.mm(var0, var2, -1729391053);
               int var4 = var0.gg[var2];
               if (2 == var0.gj[var2]) {
                  if (var1 >= 20) {
                     throw new IllegalStateException();
                  }

                  if (var3 >= var4) {
                     if (var1 >= 20) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               } else if (3 == var0.gj[var2]) {
                  if (var1 >= 20) {
                     throw new IllegalStateException();
                  }

                  if (var3 <= var4) {
                     if (var1 >= 20) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               } else if (var0.gj[var2] == 4) {
                  if (var1 >= 20) {
                     throw new IllegalStateException();
                  }

                  if (var3 == var4) {
                     if (var1 >= 20) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               } else if (var4 != var3) {
                  if (var1 >= 20) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ft.mt(" + ')');
      }
   }

   void aj(vl var1) {
      this.ap = var1.ce(1971834284) * 927581754;
      this.aw = var1.ch(1203709469) * -714677978;
      this.ak = var1.cy((short)-16695) * -466193021;
      this.aj = var1.cy((short)-27508) * -2038553189;
   }

   ft(fz var1) {
      try {
         this.this$0 = var1;
         super();
         this.ap = -1681672749;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ft.<init>(" + ')');
      }
   }

   void ay(gy var1) {
      var1.ar(this.ap * -1730636379, -1397888641 * this.aw, 564937003 * this.ak, 614869714 * this.aj, 1301222647);
   }

   void ak(vl var1) {
      this.ap = var1.ce(1782537633) * 1681672749;
      this.aw = var1.ch(1203709469) * -705177985;
      this.ak = var1.cy((short)-18662) * -466193021;
      this.aj = var1.cy((short)-31260) * -2038553189;
   }

   static final void hd(byte var0) {
      try {
         pq.ap = null;
         pw.aw = null;
         hu.ak = 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ft.hd(" + ')');
      }
   }
}
