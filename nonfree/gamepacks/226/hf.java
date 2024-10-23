public class hf extends tp {
   static final int az = 65536;
   static sw eu;
   static final int wd = 4;
   static mi ap = new mi(64);

   hf() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "hf.<init>(" + ')');
      }
   }

   public static void aw() {
      ap.aj();
   }

   public static int ap(int var0, double var1) {
      try {
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
      } catch (RuntimeException var12) {
         throw tm.aw(var12, "hf.ap(" + ')');
      }
   }
}
