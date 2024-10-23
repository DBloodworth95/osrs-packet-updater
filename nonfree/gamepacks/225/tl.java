public class tl {
   static final double ag = 2607.5945876176133D;
   static final int ac = 16384;
   static final int ae = 16383;
   static final int[] aq = new int[16384];
   static final int[] af = new int[16384];

   public static float ax(int var0) {
      var0 &= 16383;
      return (float)((double)((float)var0) * 3.834951969714103E-4D);
   }

   tl() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "tl.<init>(" + ')');
      }
   }

   public static int at(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
   }

   public static float aq(int var0) {
      var0 &= 16383;
      return (float)((double)((float)var0) * 3.834951969714103E-4D);
   }

   public static float af(int var0) {
      var0 &= 16383;
      return (float)((double)((float)var0) * 3.834951969714103E-4D);
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         aq[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
         af[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
      }

   }

   public static int au(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 1422578996;
   }

   public static int ar(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 648588165;
   }

   public static int al(int var0) {
      return aq[var0 & -1776692268];
   }

   public static int ad(int var0) {
      return af[var0 & 16383];
   }
}
