public class oi {
   static final int br = 1;
   public static final boolean[] aw = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
   public static int[] ak = new int[99];
   public static final int af = 1024;
   public static final int ap = 25;

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         ak[var1] = var0 / 4;
      }

   }

   oi() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "oi.<init>(" + ')');
      }
   }

   public static boolean ak(char var0, int var1) {
      try {
         if (var0 >= ' ') {
            if (var0 < 127) {
               return true;
            }

            if (var1 <= -402022968) {
               throw new IllegalStateException();
            }
         }

         if (var0 > 127) {
            if (var1 <= -402022968) {
               throw new IllegalStateException();
            }

            if (var0 < 160) {
               return true;
            }

            if (var1 <= -402022968) {
               throw new IllegalStateException();
            }
         }

         if (var0 <= 160 || var0 > 255) {
            if (0 != var0) {
               if (var1 <= -402022968) {
                  throw new IllegalStateException();
               }

               char[] var2 = qf.ap;

               for(int var3 = 0; var3 < var2.length; ++var3) {
                  if (var1 <= -402022968) {
                     throw new IllegalStateException();
                  }

                  char var4 = var2[var3];
                  if (var0 == var4) {
                     if (var1 <= -402022968) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }

            return false;
         } else if (var1 <= -402022968) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "oi.ak(" + ')');
      }
   }
}
