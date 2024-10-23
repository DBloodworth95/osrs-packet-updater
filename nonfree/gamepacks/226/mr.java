public class mr {
   static final int az = 14;
   static final int ap = 8388607;

   mr() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "mr.<init>(" + ')');
      }
   }

   public static int ai(int var0, int var1, int var2, int var3) {
      try {
         int var4 = cr.aw(1 + (var2 - var1), 107021418);
         var4 <<= var1;
         var0 |= var4;
         return var0;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "mr.ai(" + ')');
      }
   }

   public static int ap(int var0, int var1, int var2) {
      try {
         return (var0 << 8) + var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "mr.ap(" + ')');
      }
   }
}
