public class vk {
   public static final int at = 17;
   static final int ak = 32;
   public static final int ag = 12;
   public static final int ae = 11;
   public static final int ax = 14;
   public static final int aq = 15;
   public static final int am = 13;
   public static final int ac = 10;

   public static boolean ag(int var0) {
      return 10 == var0 || var0 == 11 || 12 == var0 || 13 == var0 || var0 == 14 || var0 == 15 || 16 == var0 || 17 == var0;
   }

   public static boolean ae(int var0) {
      return 10 == var0 || var0 == 11 || 12 == var0 || 13 == var0 || var0 == 14 || var0 == 15 || 16 == var0 || 17 == var0;
   }

   public static wc ae(Throwable var0, String var1) {
      try {
         wc var2;
         if (var0 instanceof wc) {
            var2 = (wc)var0;
            var2.aq = var2.aq + ' ' + var1;
         } else {
            var2 = new wc(var0, var1);
         }

         return var2;
      } catch (RuntimeException var3) {
         throw ae(var3, "vk.ae(" + ')');
      }
   }

   vk() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw ae(var1, "vk.<init>(" + ')');
      }
   }
}
