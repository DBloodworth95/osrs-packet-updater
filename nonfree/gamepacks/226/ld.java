public final class ld {
   static final int ar = 7;
   public static final int af = 16;
   final int[] aw;
   static final int ap = 4096;

   final int aw(int var1, int var2) {
      return this.aw[var1 + 64 * var2];
   }

   ld() {
      try {
         super();
         this.aw = new int[4096];
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ld.<init>(" + ')');
      }
   }

   final int ap(int var1, int var2, int var3) {
      try {
         return this.aw[var1 + 64 * var2];
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ld.ap(" + ')');
      }
   }

   ld(int[] var1) {
      try {
         super();
         this.aw = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ld.<init>(" + ')');
      }
   }

   final int ak(int var1, int var2) {
      return this.aw[var1 + -1897079820 * var2];
   }

   public static float at(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, byte var11) {
      try {
         float var12 = (float)((var4 - var3) * (var5 - var7) + (var6 - var7) * (var2 - var4));
         float var13 = (float)((var6 - var7) * (var0 - var4) + (var1 - var7) * (var4 - var3)) / var12;
         float var14 = (float)((var0 - var4) * (var7 - var5) + (var1 - var7) * (var2 - var4)) / var12;
         float var15 = 1.0F - var13 - var14;
         return var15 * var10 + var13 * var8 + var9 * var14;
      } catch (RuntimeException var16) {
         throw tm.aw(var16, "ld.at(" + ')');
      }
   }
}
