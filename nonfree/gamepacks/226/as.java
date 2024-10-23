import java.util.concurrent.ScheduledExecutorService;

public class as implements ph {
   public static final int at = 4;
   static final as ap = new as(0, 0);
   public final int aw;
   static final String bg = "oldschool";
   final int ak;
   static ScheduledExecutorService ae;

   public static as[] ay() {
      return new as[]{ap};
   }

   public int aw(int var1) {
      try {
         return 1808485659 * this.ak;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "as.aw(" + ')');
      }
   }

   public static as[] ai() {
      return new as[]{ap};
   }

   public static as[] ak() {
      return new as[]{ap};
   }

   public static as[] aj() {
      return new as[]{ap};
   }

   as(int var1, int var2) {
      try {
         super();
         this.aw = 636103917 * var1;
         this.ak = -1015855853 * var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "as.<init>(" + ')');
      }
   }

   public int as() {
      return 1808485659 * this.ak;
   }

   static void aa(int var0, byte var1) {
      try {
         if (var0 == dq.cq * -1064901707) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }
         } else {
            dq.cq = var0 * 1270428317;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "as.aa(" + ')');
      }
   }

   static final void am(dn var0, byte[] var1, int var2, int var3, int var4) {
      try {
         vl var5 = new vl(var1);
         int var6 = -1;

         while(true) {
            int var7 = var5.dc(1920806492);
            if (var7 == 0) {
               if (var4 <= -1338142703) {
                  return;
               }

               return;
            }

            var6 += var7;
            int var8 = 0;

            while(true) {
               int var9 = var5.dq(-1555051611);
               if (0 == var9) {
                  break;
               }

               var8 += var9 - 1;
               int var10 = var8 & 63;
               int var11 = var8 >> 6 & 63;
               int var12 = var8 >> 12;
               int var13 = var5.cy((short)-26992);
               int var14 = var13 >> 2;
               int var15 = var13 & 3;
               int var16 = var11 + var2;
               int var17 = var3 + var10;
               if (var16 > 0 && var17 > 0) {
                  if (var4 <= -1338142703) {
                     return;
                  }

                  if (var16 < var0.at[0].length - 2) {
                     if (var4 <= -1338142703) {
                        return;
                     }

                     if (var17 < var0.at[0][0].length - 2) {
                        if (var4 <= -1338142703) {
                           throw new IllegalStateException();
                        }

                        int var18 = var12;
                        if (2 == (var0.au[1][var16][var17] & 2)) {
                           if (var4 <= -1338142703) {
                              throw new IllegalStateException();
                           }

                           var18 = var12 - 1;
                        }

                        ko var19 = null;
                        if (var18 >= 0) {
                           if (var4 <= -1338142703) {
                              throw new IllegalStateException();
                           }

                           if (null != var0.ak) {
                              if (var4 <= -1338142703) {
                                 throw new IllegalStateException();
                              }

                              var19 = var0.ak[var18];
                           }
                        }

                        ei.au(var0, var12, var16, var17, var6, var15, var14, var19, 1107199204);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var20) {
         throw tm.aw(var20, "as.am(" + ')');
      }
   }
}
