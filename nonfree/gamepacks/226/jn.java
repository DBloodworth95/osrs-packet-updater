import java.util.ArrayList;

public class jn {
   public static final int aw = 64;
   static final int cg = 512;
   public static final int ao = 0;
   protected static final boolean az = false;

   public static void au(ArrayList var0, int var1, int var2, int var3, int var4, short var5) {
      try {
         mp.as.clear();
         mp.as.addAll(var0);
         mp.at = -259069503 * var1;
         mp.au = 660415353 * var2;
         mp.an = var3 * 1443316973;
         ao = var4 * 1273416733;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "jn.au(" + ')');
      }
   }

   jn() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "jn.<init>(" + ')');
      }
   }

   static final int ai(int var0, int var1, int var2, int var3) {
      return var2 * var0 + var1 * var3 >> 16;
   }

   public static void ae(byte var0) {
      try {
         hb.aw.aj();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "jn.ae(" + ')');
      }
   }

   static final int as(int var0, int var1, int var2, int var3) {
      return var3 * var1 + var0 * var2 >> 16;
   }

   static final float ae(int var0) {
      float var1 = 10075.0F - (float)var0;
      return (var1 * 1.0075567F - 75.56675F) / var1;
   }

   static final int aj(int var0, int var1, int var2, int var3) {
      return var2 * var0 + var1 * var3 >> 16;
   }

   static final int ay(int var0, int var1, int var2, int var3) {
      return var2 * var0 + var1 * var3 >> 16;
   }
}
