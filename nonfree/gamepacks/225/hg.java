public class hg implements ps {
   static vt dj;
   static final hg ac = new hg(1, 0);
   static final hg ag = new hg(0, 2);
   public final int am;
   final int ax;
   static final int ak = 127;
   static int uu;
   static final int bw = 8;
   static final hg ae = new hg(2, 1);
   static of fe;

   static int bk(int var0, dt var1, boolean var2, byte var3) {
      try {
         if (var0 == 7108) {
            if (var3 >= 20) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = ms.li(195544566) ? 1 : 0;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "hg.bk(" + ')');
      }
   }

   hg(int var1, int var2) {
      try {
         super();
         this.am = var1 * 1079017089;
         this.ax = var2 * 311269259;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "hg.<init>(" + ')');
      }
   }

   public int ac(int var1) {
      try {
         return -1120544733 * this.ax;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "hg.ac(" + ')');
      }
   }

   public int ae() {
      return -946079412 * this.ax;
   }

   public int ag() {
      return 1738377336 * this.ax;
   }

   public static void ac(po var0, po var1, int var2) {
      try {
         hu.ac = var0;
         hu.ae = var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "hg.ac(" + ')');
      }
   }

   static final boolean ap(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         int var8 = var6 + jy.ag * -556185469;
         if (var8 < var0) {
            if (var7 >= -1038403064) {
               throw new IllegalStateException();
            }

            if (var8 < var1) {
               if (var7 >= -1038403064) {
                  throw new IllegalStateException();
               }

               if (var8 < var2) {
                  if (var7 >= -1038403064) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }
         }

         var8 = jy.ag * -556185469 - var6;
         if (var8 > var0) {
            if (var7 >= -1038403064) {
               throw new IllegalStateException();
            }

            if (var8 > var1) {
               if (var7 >= -1038403064) {
                  throw new IllegalStateException();
               }

               if (var8 > var2) {
                  return false;
               }
            }
         }

         var8 = var6 + -50258285 * jy.ae;
         if (var8 < var3) {
            if (var7 >= -1038403064) {
               throw new IllegalStateException();
            }

            if (var8 < var4 && var8 < var5) {
               if (var7 >= -1038403064) {
                  throw new IllegalStateException();
               }

               return false;
            }
         }

         var8 = -50258285 * jy.ae - var6;
         if (var8 > var3) {
            if (var7 >= -1038403064) {
               throw new IllegalStateException();
            }

            if (var8 > var4) {
               if (var7 >= -1038403064) {
                  throw new IllegalStateException();
               }

               if (var8 > var5) {
                  if (var7 >= -1038403064) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }
         }

         return true;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "hg.ap(" + ')');
      }
   }

   public int am() {
      return -1120544733 * this.ax;
   }

   static void ax(po var0, int var1, int var2) {
      try {
         if ((var1 & uk.bx.ac(-350930589)) != 0) {
            if (var2 >= -1244668647) {
               throw new IllegalStateException();
            }

            ey.al = sq.ax(var0, "logo_deadman_mode", "", 2009808124);
         } else if ((var1 & uk.bf.ac(-350930589)) != 0) {
            ey.al = sq.ax(var0, "logo_seasonal_mode", "", 963482239);
         } else if ((var1 & uk.au.ac(-350930589)) != 0) {
            if (var2 >= -1244668647) {
               throw new IllegalStateException();
            }

            ey.al = sq.ax(var0, "logo_speedrunning", "", 561084326);
         } else {
            ey.al = sq.ax(var0, "logo", "", 1950941710);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "hg.ax(" + ')');
      }
   }
}
