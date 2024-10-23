public final class jf {
   public ju am;
   int ae;
   int ac;
   public static final int ao = 1;
   public long ax;
   int aq;
   int ag;

   jf() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "jf.<init>(" + ')');
      }
   }

   public static int ag(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         if ((var5 & 1) == 1) {
            if (var6 <= 1) {
               throw new IllegalStateException();
            }

            int var7 = var3;
            var3 = var4;
            var4 = var7;
         }

         var2 &= 3;
         if (var2 == 0) {
            if (var6 <= 1) {
               throw new IllegalStateException();
            } else {
               return var0;
            }
         } else if (var2 == 1) {
            if (var6 <= 1) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else if (var2 == 2) {
            if (var6 <= 1) {
               throw new IllegalStateException();
            } else {
               return 7 - var0 - (var3 - 1);
            }
         } else {
            return 7 - var1 - (var4 - 1);
         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "jf.ag(" + ')');
      }
   }
}
