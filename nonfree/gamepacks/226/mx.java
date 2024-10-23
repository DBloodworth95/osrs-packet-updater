public class mx {
   cb aw;
   int ap;
   public static final int aj = 2;
   public static final int bg = 65;
   public static final int bv = 35;

   public static boolean aw(int var0) {
      try {
         br var1 = (br)by.ap.ai();
         if (null == var1) {
            if (var0 >= 10092992) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "mx.aw(" + ')');
      }
   }

   public static float ap(int var0, int var1) {
      try {
         var0 &= 2047;
         return (float)((double)((float)var0 / 2048.0F) * 6.283185307179586D);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "mx.ap(" + ')');
      }
   }

   mx(int var1, cb var2) {
      try {
         super();
         this.ap = var1 * -424807065;
         this.aw = var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "mx.<init>(" + ')');
      }
   }
}
