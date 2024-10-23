public class nc {
   public static final int ak = 2;
   public static final int bk = 16384;
   static final int ct = 87;

   public static int aw(int var0, double var1) {
      double var3 = (double)(var0 >> 16 & 255) / 256.0D;
      double var5 = (double)(var0 >> 8 & 255) / 256.0D;
      double var7 = (double)(var0 & 255) / 256.0D;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(256.0D * var3);
      int var10 = (int)(256.0D * var5);
      int var11 = (int)(256.0D * var7);
      return (var9 << 16) + -16777216 + (var10 << 8) + var11;
   }

   nc() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "nc.<init>(" + ')');
      }
   }

   static Class ai(String var0, byte var1) throws ClassNotFoundException {
      try {
         if (var0.equals("B")) {
            if (var1 == 16) {
               throw new IllegalStateException();
            } else {
               return Byte.TYPE;
            }
         } else if (var0.equals("I")) {
            if (var1 == 16) {
               throw new IllegalStateException();
            } else {
               return Integer.TYPE;
            }
         } else if (var0.equals("S")) {
            return Short.TYPE;
         } else if (var0.equals("J")) {
            if (var1 == 16) {
               throw new IllegalStateException();
            } else {
               return Long.TYPE;
            }
         } else if (var0.equals("Z")) {
            if (var1 == 16) {
               throw new IllegalStateException();
            } else {
               return Boolean.TYPE;
            }
         } else if (var0.equals("F")) {
            return Float.TYPE;
         } else if (var0.equals("D")) {
            if (var1 == 16) {
               throw new IllegalStateException();
            } else {
               return Double.TYPE;
            }
         } else if (var0.equals("C")) {
            return Character.TYPE;
         } else if (var0.equals("void")) {
            if (var1 == 16) {
               throw new IllegalStateException();
            } else {
               return Void.TYPE;
            }
         } else {
            return Class.forName(var0);
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "nc.ai(" + ')');
      }
   }
}
