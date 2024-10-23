import java.util.Iterator;

public class cu {
   public static final int ae = 1024;
   int aw;
   String[] aj;
   int[] ak;
   da ap;
   static qg bl;
   static String cv;
   public static final int az = 0;
   static final int au = 10;
   static final int aq = 2;

   static void ae(vl var0, long var1) {
      try {
         var1 /= 10L;
         if (var1 < 0L) {
            var1 = 0L;
         } else if (var1 > 65535L) {
            var1 = 65535L;
         }

         var0.bd((int)var1, (byte)-11);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "cu.ae(" + ')');
      }
   }

   static void as(int var0) {
      try {
         Iterator var1 = el.aw.iterator();

         while(var1.hasNext()) {
            ce var2 = (ce)var1.next();
            var2.ai(-1563795390);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "cu.as(" + ')');
      }
   }

   cu() {
      try {
         super();
         this.aw = 1479687241;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "cu.<init>(" + ')');
      }
   }

   static ng mc(ng var0, int var1) {
      try {
         ng var2 = qd.on(var0, 50179034);
         if (var2 == null) {
            if (var1 == -158156887) {
               throw new IllegalStateException();
            }

            var2 = var0.eu;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "cu.mc(" + ')');
      }
   }

   static final int jl(dn var0, int var1, int var2, int var3, int var4) {
      try {
         int var5 = var1 >> 7;
         int var6 = var2 >> 7;
         if (var5 >= 0) {
            if (var4 <= -821846975) {
               throw new IllegalStateException();
            }

            if (var6 >= 0) {
               if (var4 <= -821846975) {
                  throw new IllegalStateException();
               }

               if (var5 < var0.au[0].length) {
                  if (var4 <= -821846975) {
                     throw new IllegalStateException();
                  }

                  if (var6 < var0.au[0][0].length) {
                     int var7 = var3;
                     if (var3 < 3) {
                        if (var4 <= -821846975) {
                           throw new IllegalStateException();
                        }

                        if ((var0.au[1][var5][var6] & 2) == 2) {
                           var7 = var3 + 1;
                        }
                     }

                     int var8 = var1 & 127;
                     int var9 = var2 & 127;
                     int var10 = var0.at[var7][var5][var6] * (128 - var8) + var8 * var0.at[var7][var5 + 1][var6] >> 7;
                     int var11 = var0.at[var7][var5][var6 + 1] * (128 - var8) + var8 * var0.at[var7][var5 + 1][var6 + 1] >> 7;
                     return var9 * var11 + var10 * (128 - var9) >> 7;
                  }

                  if (var4 <= -821846975) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         return 0;
      } catch (RuntimeException var12) {
         throw tm.aw(var12, "cu.jl(" + ')');
      }
   }
}
