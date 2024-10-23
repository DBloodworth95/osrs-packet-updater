public class nl {
   public static final int ak = 5;
   static final int an = 2048;

   public static hj ap(int var0, int var1) {
      try {
         hj var2 = (hj)hj.ak.ap((long)var0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = hj.ap.bm(13, var0, 1186300926);
            var2 = new hj();
            var2.ai = var0 * -786536545;
            if (var3 != null) {
               if (var1 >= -179084085) {
                  throw new IllegalStateException();
               }

               var2.aw(new vl(var3), 1836147214);
            }

            hj.ak.ak(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "nl.ap(" + ')');
      }
   }

   public static boolean ai(int var0, int var1) {
      return 0 != (var0 >> var1 + 1 & 1);
   }

   public static boolean ay(int var0, int var1) {
      return 0 != (var0 >> var1 + 1 & 1);
   }

   public static int as(int var0) {
      return var0 >> 11 & 63;
   }

   nl() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "nl.<init>(" + ')');
      }
   }

   public static int am(int var0) {
      return var0 >> 11 & 63;
   }

   public static int at(int var0) {
      return var0 >> 17 & 7;
   }

   public static int ae(int var0) {
      return var0 >> 11 & 311005255;
   }

   public static boolean an(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   public static boolean au(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   static void ai(byte var0) {
      try {
         if (dq.co != null) {
            if (var0 == 6) {
               throw new IllegalStateException();
            }

            if (dq.co.length() > 0) {
               if (var0 == 6) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         if (io.vx.al(-123589811) != null) {
            if (var0 == 6) {
               return;
            }

            dq.co = io.vx.al(-123589811);
            client.hy = true;
         } else {
            client.hy = false;
         }

      } catch (RuntimeException var1) {
         throw tm.aw(var1, "nl.ai(" + ')');
      }
   }
}
