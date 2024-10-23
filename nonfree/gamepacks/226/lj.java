public class lj {
   static final int au = 0;
   public nn aw;
   public nn ak;
   protected static boolean bd;
   public int ap;
   static long es;
   public static final int ab = 2048;

   public lj(int var1, nn var2, nn var3) {
      try {
         super();
         this.ap = var1 * -1750193539;
         this.aw = var2;
         this.ak = var3;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "lj.<init>(" + ')');
      }
   }

   static int ak(int var0, int var1, int var2, int var3) {
      try {
         int var4 = var0 >> 16 & 255;
         int var5 = var0 >> 8 & 255;
         int var6 = var0 & 255;
         int var7 = var1 >> 16 & 255;
         int var8 = var1 >> 8 & 255;
         int var9 = var1 & 255;
         int var10 = var2 * (1 + (var7 - var4)) / 64 + var4 & 255;
         int var11 = (var8 - var5 + 1) * var2 / 64 + var5 & 255;
         int var12 = (var9 - var6 + 1) * var2 / 64 + var6 & 255;
         return var10 << 16 | var11 << 8 | var12;
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "lj.ak(" + ')');
      }
   }

   public static oo[] ap(int var0) {
      try {
         return new oo[]{oo.ak, oo.an, oo.at, oo.aw, oo.ao, oo.as, oo.af, oo.au, oo.ab, oo.am, oo.az, oo.ap, oo.ay, oo.ai, oo.aj, oo.ae, oo.ar};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "lj.ap(" + ')');
      }
   }

   public static int ai(CharSequence var0, int var1, byte var2) {
      try {
         return lx.ay(var0, var1, true, -355828519);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "lj.ai(" + ')');
      }
   }
}
