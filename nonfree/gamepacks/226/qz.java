import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class qz implements Iterator {
   int ak;
   int aw;
   qr ap;
   static final int an = 60;
   public static final int ai = 7;
   public static final String ku = "";

   public void ar() {
      throw new UnsupportedOperationException();
   }

   public boolean hasNext() {
      try {
         return this.aw * 2107197061 < -1757030441 * this.ap.ak;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qz.hasNext(" + ')');
      }
   }

   public Object next() {
      try {
         if (this.ap.ai * -1198880865 != 1657149479 * this.ak) {
            throw new ConcurrentModificationException();
         } else if (this.aw * 2107197061 < this.ap.ak * -1757030441) {
            Object var1 = this.ap.ap[this.aw * 2107197061].ap;
            this.aw += -365837747;
            return var1;
         } else {
            throw new NoSuchElementException();
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qz.next(" + ')');
      }
   }

   qz(qr var1) {
      try {
         super();
         this.aw = 0;
         this.ak = this.ap.ai * 1202948041;
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qz.<init>(" + ')');
      }
   }

   public Object at() {
      if (this.ap.ai * -1198880865 != 1657149479 * this.ak) {
         throw new ConcurrentModificationException();
      } else if (this.aw * 2107197061 < this.ap.ak * -1757030441) {
         Object var1 = this.ap.ap[this.aw * 2107197061].ap;
         this.aw += -365837747;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public Object au() {
      if (this.ap.ai * -1017080248 != -1868382708 * this.ak) {
         throw new ConcurrentModificationException();
      } else if (this.aw * -686389961 < this.ap.ak * -1757030441) {
         Object var1 = this.ap.ap[this.aw * 1508996537].ap;
         this.aw += 2052916281;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public void az() {
      throw new UnsupportedOperationException();
   }

   public boolean ao() {
      return this.aw * 874184682 < -1757030441 * this.ap.ak;
   }

   public void remove() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qz.remove(" + ')');
      }
   }

   public Object an() {
      if (this.ap.ai * -1198880865 != 1657149479 * this.ak) {
         throw new ConcurrentModificationException();
      } else if (this.aw * 2107197061 < this.ap.ak * -1757030441) {
         Object var1 = this.ap.ap[this.aw * 2107197061].ap;
         this.aw += -365837747;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public void ab() {
      throw new UnsupportedOperationException();
   }

   public boolean af() {
      return this.aw * 2107197061 < -1757030441 * this.ap.ak;
   }

   static void ok(String var0, boolean var1, int var2) {
      try {
         var0 = var0.toLowerCase();
         short[] var3 = new short[16];
         int var4 = 0;

         for(int var5 = 0; var5 < ip.at * 1506750069; ++var5) {
            if (var2 != 1102939715) {
               throw new IllegalStateException();
            }

            ip var6 = qg.aw(var5, 649869579);
            if (var1) {
               if (var2 != 1102939715) {
                  throw new IllegalStateException();
               }

               if (!var6.cg) {
                  if (var2 != 1102939715) {
                     throw new IllegalStateException();
                  }
                  continue;
               }
            }

            if (-1 != var6.cn * -1338868597) {
               if (var2 != 1102939715) {
                  throw new IllegalStateException();
               }
            } else if (var6.az.toLowerCase().indexOf(var0) == -1) {
               if (var2 != 1102939715) {
                  throw new IllegalStateException();
               }
            } else {
               if (var4 >= 250) {
                  if (var2 != 1102939715) {
                     throw new IllegalStateException();
                  }

                  gw.we = 1014584689;
                  sr.wl = null;
                  return;
               }

               if (var4 >= var3.length) {
                  short[] var7 = new short[2 * var3.length];

                  for(int var8 = 0; var8 < var4; ++var8) {
                     if (var2 != 1102939715) {
                        return;
                     }

                     var7[var8] = var3[var8];
                  }

                  var3 = var7;
               }

               var3[var4++] = (short)var5;
            }
         }

         sr.wl = var3;
         hx.wq = 0;
         gw.we = -1014584689 * var4;
         String[] var10 = new String[gw.we * 1780036719];

         for(int var11 = 0; var11 < 1780036719 * gw.we; ++var11) {
            if (var2 != 1102939715) {
               return;
            }

            var10[var11] = qg.aw(var3[var11], 649869579).az;
         }

         short[] var12 = sr.wl;
         ed.ap(var10, var12, 0, var10.length - 1, -138188705);
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "qz.ok(" + ')');
      }
   }
}
