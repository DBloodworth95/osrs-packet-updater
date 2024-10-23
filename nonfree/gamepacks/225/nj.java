public class nj {
   public static final int ap = 16;
   static final int ac = 22;

   nj() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "nj.<init>(" + ')');
      }
   }

   public static boolean at(char var0, byte var1) {
      try {
         boolean var10000;
         label35: {
            if (var0 >= 'A') {
               if (var1 != 8) {
                  throw new IllegalStateException();
               }

               if (var0 <= 'Z') {
                  break label35;
               }

               if (var1 != 8) {
                  throw new IllegalStateException();
               }
            }

            if (var0 < 'a' || var0 > 'z') {
               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nj.at(" + ')');
      }
   }
}
