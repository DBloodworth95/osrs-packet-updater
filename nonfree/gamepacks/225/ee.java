public class ee extends se {
   public static final int ap = 3;
   static final int au = 7;
   final boolean ac;
   static vv[] kn;

   public ee(boolean var1) {
      try {
         super();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ee.<init>(" + ')');
      }
   }

   int ae(sq var1, sq var2) {
      if (var2.ax * -1744892407 != -2108805731 * var1.ax) {
         return this.ac ? -355801416 * var1.ax - var2.ax * -1744892407 : 982886167 * var2.ax - var1.ax * 139455657;
      } else {
         return this.ar(var1, var2, (byte)74);
      }
   }

   public int ax(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, -1557770649);
   }

   public int af(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, -1557770649);
   }

   public int aq(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, -1557770649);
   }

   int ac(sq var1, sq var2, int var3) {
      try {
         if (var2.ax * -1744892407 != -1744892407 * var1.ax) {
            int var10000;
            if (this.ac) {
               if (var3 != -1557770649) {
                  throw new IllegalStateException();
               }

               var10000 = -1744892407 * var1.ax - var2.ax * -1744892407;
            } else {
               var10000 = -1744892407 * var2.ax - var1.ax * -1744892407;
            }

            return var10000;
         } else {
            return this.ar(var1, var2, (byte)14);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ee.ac(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((sq)var1, (sq)var2, -1557770649);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ee.compare(" + ')');
      }
   }

   int ag(sq var1, sq var2) {
      if (var2.ax * -1744892407 != -1744892407 * var1.ax) {
         return this.ac ? -2026821587 * var1.ax - var2.ax * 1387106906 : -1744892407 * var2.ax - var1.ax * -1744892407;
      } else {
         return this.ar(var1, var2, (byte)-64);
      }
   }

   int am(sq var1, sq var2) {
      if (var2.ax * -1744892407 != -1744892407 * var1.ax) {
         return this.ac ? -1744892407 * var1.ax - var2.ax * -1744892407 : -1744892407 * var2.ax - var1.ax * -1744892407;
      } else {
         return this.ar(var1, var2, (byte)-94);
      }
   }

   static String oo(ny var0, int var1) {
      try {
         if (tw.ac(lj.oq(var0, (byte)33), 1575031074) == 0) {
            if (var1 <= 406958567) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            if (null != var0.ey) {
               if (var1 <= 406958567) {
                  throw new IllegalStateException();
               }

               if (var0.ey.trim().length() != 0) {
                  return var0.ey;
               }

               if (var1 <= 406958567) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ee.oo(" + ')');
      }
   }
}
