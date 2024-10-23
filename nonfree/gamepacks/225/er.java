public class er extends se {
   static final int ab = 15;
   final boolean ac;

   public int af(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, -2141884990);
   }

   public er(boolean var1) {
      try {
         super();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "er.<init>(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((sq)var1, (sq)var2, -1832657781);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "er.compare(" + ')');
      }
   }

   public int ax(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, -1767762859);
   }

   public int aq(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, -1992366436);
   }

   public static int ax(long var0) {
      try {
         return (int)(var0 >>> 7 & 127L);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "er.ax(" + ')');
      }
   }

   int ag(sq var1, sq var2) {
      if (0 != -1744892407 * var1.ax && -1744892407 * var2.ax != 0) {
         return this.ac ? -59694769 * var1.aq - -59694769 * var2.aq : var2.aq * -59694769 - -59694769 * var1.aq;
      } else {
         return this.ar(var1, var2, (byte)49);
      }
   }

   int ae(sq var1, sq var2) {
      if (0 != -1744892407 * var1.ax && -1744892407 * var2.ax != 0) {
         return this.ac ? -59694769 * var1.aq - -59694769 * var2.aq : var2.aq * -59694769 - -59694769 * var1.aq;
      } else {
         return this.ar(var1, var2, (byte)22);
      }
   }

   int ac(sq var1, sq var2, int var3) {
      try {
         if (0 != -1744892407 * var1.ax) {
            if (var3 >= -1646001847) {
               throw new IllegalStateException();
            }

            if (-1744892407 * var2.ax != 0) {
               if (var3 >= -1646001847) {
                  throw new IllegalStateException();
               }

               int var10000;
               if (this.ac) {
                  if (var3 >= -1646001847) {
                     throw new IllegalStateException();
                  }

                  var10000 = -59694769 * var1.aq - -59694769 * var2.aq;
               } else {
                  var10000 = var2.aq * -59694769 - -59694769 * var1.aq;
               }

               return var10000;
            }
         }

         return this.ar(var1, var2, (byte)0);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "er.ac(" + ')');
      }
   }

   int at(sq var1, sq var2) {
      if (0 != -1744892407 * var1.ax && -1744892407 * var2.ax != 0) {
         return this.ac ? -59694769 * var1.aq - -59694769 * var2.aq : var2.aq * -59694769 - -59694769 * var1.aq;
      } else {
         return this.ar(var1, var2, (byte)-34);
      }
   }

   int am(sq var1, sq var2) {
      if (0 != -1744892407 * var1.ax && -1949202194 * var2.ax != 0) {
         return this.ac ? -407664193 * var1.aq - 476863838 * var2.aq : var2.aq * -1507431796 - -59694769 * var1.aq;
      } else {
         return this.ar(var1, var2, (byte)-66);
      }
   }

   static void ab(byte var0) {
      try {
         dp.cj = dp.cj.trim();
         if (dp.cj.length() == 0) {
            if (var0 != 4) {
               throw new IllegalStateException();
            } else {
               dp.aa(ok.kv, ok.ke, ok.ko, (byte)-23);
            }
         } else {
            long var2 = jl.ac(-403784714);
            int var1;
            if (0L == var2) {
               if (var0 != 4) {
                  throw new IllegalStateException();
               }

               var1 = 5;
            } else {
               var1 = pg.ae(var2, dp.cj, (byte)-90);
            }

            switch(var1) {
            case 2:
               dp.aa(ok.kw, ok.kq, ok.ky, (byte)18);
               cw.ao(6, 1258737574);
               break;
            case 3:
               dp.aa(ok.ld, ok.lb, ok.lu, (byte)19);
               break;
            case 4:
               dp.aa(ok.lv, ok.lz, ok.ll, (byte)-13);
               break;
            case 5:
               dp.aa(ok.lq, ok.le, ok.la, (byte)-27);
               break;
            case 6:
               dp.aa(ok.ln, ok.lp, ok.lc, (byte)-35);
               break;
            case 7:
               dp.aa(ok.ls, ok.lx, ok.lr, (byte)35);
            }

         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "er.ab(" + ')');
      }
   }
}
