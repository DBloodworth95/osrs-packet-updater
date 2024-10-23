public class ty {
   static final int[] af = new int[2048];
   public static final int ai = 256;
   public static final double ak = 325.94932345220167D;
   static final int[] ao = new int[2048];
   public static final int ap = 2048;
   public static final int aw = 2047;

   public static float ae(int var0) {
      var0 &= 2047;
      return (float)((double)((float)var0 / 2048.0F) * 6.283185307179586D);
   }

   static {
      double var0 = 0.0030679615757712823D;

      for(int var2 = 0; var2 < 2048; ++var2) {
         ao[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
         af[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
      }

   }

   public static double az(int var0) {
      int var1 = af[var0 & 2047];
      return (double)var1 / 65536.0D;
   }

   public static float as(int var0) {
      var0 &= 2047;
      return (float)((double)((float)var0 / 2048.0F) * 6.283185307179586D);
   }

   public static float ay(int var0) {
      var0 &= 2047;
      return (float)((double)((float)var0 / 2048.0F) * 6.283185307179586D);
   }

   public static int am(float var0) {
      return (int)(2048.0D * ((double)var0 / 6.283185307179586D)) & 2047;
   }

   public static int at(float var0) {
      return (int)(2048.0D * ((double)var0 / 6.283185307179586D)) & -561000684;
   }

   public static int ad(int var0, int var1) {
      int var2 = var1 - var0 & 2047;
      return var2 > 1024 ? -(2048 - var2) : var2;
   }

   public static int an(float var0) {
      return (int)(2048.0D * ((double)var0 / 6.283185307179586D)) & 2047;
   }

   public static int ao(int var0) {
      return ao[var0 & -337698188];
   }

   ty() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ty.<init>(" + ')');
      }
   }

   public static double ar(int var0) {
      int var1 = af[var0 & 2047];
      return (double)var1 / 65536.0D;
   }

   public static double ab(int var0) {
      int var1 = af[var0 & 2047];
      return (double)var1 / 65536.0D;
   }

   public static int af(int var0) {
      return ao[var0 & -1292959050];
   }

   public static double ag(int var0) {
      int var1 = af[var0 & 764616370];
      return (double)var1 / 65536.0D;
   }

   public static int au(float var0) {
      return (int)(2048.0D * ((double)var0 / 6.283185307179586D)) & 2047;
   }
}
