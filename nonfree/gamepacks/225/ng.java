public class ng {
   static final int bz = 0;
   public int ae;
   public int ag;
   static im al;
   public int ac;

   public static int ac(int var0, int var1) {
      try {
         return mw.ac[var0];
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ng.ac(" + ')');
      }
   }

   ng() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ng.<init>(" + ')');
      }
   }

   static String of(String var0, boolean var1, byte var2) {
      try {
         String var10000;
         if (var1) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            var10000 = "https://";
         } else {
            var10000 = "http://";
         }

         String var3 = var10000;
         if (1 == client.cu * -872183921) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            var0 = var0 + "-wtrc";
         } else if (2 == -872183921 * client.cu) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            var0 = var0 + "-wtqa";
         } else if (3 == client.cu * -872183921) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            var0 = var0 + "-wtwip";
         } else if (client.cu * -872183921 == 5) {
            var0 = var0 + "-wti";
         } else if (4 == client.cu * -872183921) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            var0 = "local";
         }

         String var4 = "";
         if (null != tb.cv) {
            var4 = "/p=" + tb.cv;
         }

         String var5 = "runescape.com";
         return var3 + var0 + "." + var5 + "/l=" + dn.cy + "/a=" + -362540747 * ij.cg + var4 + "/";
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ng.of(" + ')');
      }
   }

   static double ac(double var0) {
      try {
         return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ng.ac(" + ')');
      }
   }
}
