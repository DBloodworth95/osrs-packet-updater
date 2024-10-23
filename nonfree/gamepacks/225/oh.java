import java.io.File;
import java.io.IOException;

public class oh {
   public static final int ag = 2;
   public static final int ae = 1;
   public static final int af = 6;
   public static final int am = 3;
   public static final int ac = 0;
   public static final int aa = 99;

   public static void ac(byte var0) {
      try {
         hj.ac.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "oh.ac(" + ')');
      }
   }

   oh() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "oh.<init>(" + ')');
      }
   }

   public static ud ae(String var0, String var1, boolean var2, byte var3) {
      try {
         File var4 = new File(gk.ax, "preferences" + var0 + ".dat");
         if (var4.exists()) {
            if (var3 <= 40) {
               throw new IllegalStateException();
            }

            try {
               ud var12 = new ud(var4, "rw", 10000L);
               return var12;
            } catch (IOException var10) {
            }
         }

         String var5 = "";
         if (33 == -669571107 * sb.az) {
            if (var3 <= 40) {
               throw new IllegalStateException();
            }

            var5 = "_rc";
         } else if (sb.az * -669571107 == 34) {
            if (var3 <= 40) {
               throw new IllegalStateException();
            }

            var5 = "_wip";
         }

         File var6 = new File(il.av, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
         ud var7;
         if (!var2) {
            if (var3 <= 40) {
               throw new IllegalStateException();
            }

            if (var6.exists()) {
               if (var3 <= 40) {
                  throw new IllegalStateException();
               }

               try {
                  var7 = new ud(var6, "rw", 10000L);
                  return var7;
               } catch (IOException var9) {
               }
            }
         }

         try {
            var7 = new ud(var4, "rw", 10000L);
            return var7;
         } catch (IOException var8) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "oh.ae(" + ')');
      }
   }
}
