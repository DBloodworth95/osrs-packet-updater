public class oy implements ph {
   public static final oy ay = new oy("oldscape", "RuneScape 2007", 5);
   static final oy aw = new oy("stellardawn", "Stellar Dawn", 1);
   static final oy ak = new oy("game3", "Game 3", 2);
   static final oy aj = new oy("game4", "Game 4", 3);
   static final int bb = 5;
   static final oy ap = new oy("runescape", "RuneScape", 0);
   public final String as;
   public static final int ao = 15;
   static byte[][] jw;
   final int ae;
   static final oy ai = new oy("game5", "Game 5", 4);
   static String gk;

   static final int ac(int var0, int var1, int var2, byte var3) {
      try {
         if (var2 > 179) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 192) {
            var1 /= 2;
         }

         if (var2 > 217) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 243) {
            var1 /= 2;
         }

         int var4 = var2 / 2 + (var0 / 4 << 10) + (var1 / 32 << 7);
         return var4;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "oy.ac(" + ')');
      }
   }

   public int aw(int var1) {
      try {
         return this.ae * -110286917;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "oy.aw(" + ')');
      }
   }

   public int as() {
      return this.ae * -537376115;
   }

   public static oy[] ak() {
      return new oy[]{aj, ap, ak, ai, aw, ay};
   }

   public static oy[] aj() {
      return new oy[]{aj, ap, ak, ai, aw, ay};
   }

   public static oy[] ai() {
      return new oy[]{aj, ap, ak, ai, aw, ay};
   }

   oy(String var1, String var2, int var3) {
      try {
         super();
         this.as = var1;
         this.ae = var3 * 508134771;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "oy.<init>(" + ')');
      }
   }

   static void jh(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         pu var6 = nq.jn.ad[var0][var1][var2];
         if (null != var6) {
            if (var5 != 7992000) {
               throw new IllegalStateException();
            }

            for(ec var7 = (ec)var6.as(); var7 != null; var7 = (ec)var6.am()) {
               if (var5 != 7992000) {
                  throw new IllegalStateException();
               }

               if ((var3 & 32767) == var7.ap * 1119456901) {
                  if (var5 != 7992000) {
                     throw new IllegalStateException();
                  }

                  if (-1423952523 * var7.aw == var4) {
                     if (var5 != 7992000) {
                        throw new IllegalStateException();
                     }

                     var7.ai(-204046417);
                     break;
                  }
               }
            }

            pl.ke(var0, var1, var2, 171121967);
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "oy.jh(" + ')');
      }
   }
}
