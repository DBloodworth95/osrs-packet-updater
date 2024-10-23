public class rn {
   public static final int ak = 1;
   static final int dq = 100;
   public static final int ap = 128;
   public static final int ab = 65536;
   public static final int ay = 32;

   public static String ai(String var0, int var1) {
      try {
         if (var0 != null) {
            if (var1 >= -37762675) {
               throw new IllegalStateException();
            }

            if (!var0.isEmpty()) {
               if (var1 >= -37762675) {
                  throw new IllegalStateException();
               }

               if (var0.charAt(0) != '#') {
                  return var0;
               }

               if (var1 >= -37762675) {
                  throw new IllegalStateException();
               }
            }
         }

         return "";
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rn.ai(" + ')');
      }
   }

   public static double aj(int var0, int var1) {
      try {
         int var2 = ty.af[var0 & 2047];
         return (double)var2 / 65536.0D;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rn.aj(" + ')');
      }
   }

   rn() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "rn.<init>(" + ')');
      }
   }
}
