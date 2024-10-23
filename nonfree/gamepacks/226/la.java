public abstract class la implements le {
   protected int ap;
   static final int as = 10;

   public static int am(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         int var3 = 0;

         for(int var4 = 0; var4 < var2; ++var4) {
            if (var1 != 242602398) {
               throw new IllegalStateException();
            }

            var3 = (var3 << 5) - var3 + bm.ap(var0.charAt(var4), (byte)90);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "la.am(" + ')');
      }
   }

   protected la(oy var1, pn var2, int var3) {
      try {
         super();
         this.ap = -107670057 * var3;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "la.<init>(" + ')');
      }
   }

   public static int ae(long var0) {
      try {
         return (int)(var0 >>> 17 & 4294967295L);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "la.ae(" + ')');
      }
   }
}
