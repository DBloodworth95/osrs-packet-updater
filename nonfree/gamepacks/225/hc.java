public class hc extends tr {
   static final int rd = 2160;
   static final int am = 4;
   static final int au = 6;
   static final String he = "beta";
   public static ml ac = new ml(64);
   static final int bz = 0;

   hc() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "hc.<init>(" + ')');
      }
   }

   static final int ai(int var0, int var1, byte var2) {
      try {
         if (var0 == -2) {
            return 12345678;
         } else if (-1 == var0) {
            if (var2 <= 45) {
               throw new IllegalStateException();
            } else {
               if (var1 < 2) {
                  var1 = 2;
               } else if (var1 > 126) {
                  if (var2 <= 45) {
                     throw new IllegalStateException();
                  }

                  var1 = 126;
               }

               return var1;
            }
         } else {
            var1 = (var0 & 127) * var1 / 128;
            if (var1 < 2) {
               if (var2 <= 45) {
                  throw new IllegalStateException();
               }

               var1 = 2;
            } else if (var1 > 126) {
               if (var2 <= 45) {
                  throw new IllegalStateException();
               }

               var1 = 126;
            }

            return var1 + (var0 & 'ﾀ');
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "hc.ai(" + ')');
      }
   }
}
