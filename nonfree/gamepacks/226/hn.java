public class hn {
   static final int ao = 2;
   int[] aw;
   short[] ak;
   public long ap;
   public boolean ai;
   short[] aj;

   public hn(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
      try {
         super();
         this.ai = false;
         this.ap = var1 * 6495146896435223933L;
         this.aw = var3;
         this.ak = var4;
         this.aj = var5;
         this.ai = var6;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "hn.<init>(" + ')');
      }
   }

   public static int az(int var0, int var1) {
      try {
         if (var0 > 0) {
            if (var1 != -1170097408) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (var0 < 0) {
            if (var1 != -1170097408) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "hn.az(" + ')');
      }
   }
}
