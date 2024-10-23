public class hb extends tr {
   public static final int ae = 5000;
   public static final int ap = 9;
   static ml ac = new ml(64);

   public static void ag() {
      ac.am();
   }

   public static void am() {
      ac.am();
   }

   hb() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "hb.<init>(" + ')');
      }
   }

   public static void ae() {
      ac.am();
   }

   public static pk jj(int var0) {
      try {
         return client.qw;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "hb.jj(" + ')');
      }
   }

   static final int az(int var0, int var1, int var2) {
      try {
         int var3 = var0 + var1 * 57;
         var3 ^= var3 << 13;
         int var4 = var3 * (15731 * var3 * var3 + 789221) + 1376312589 & Integer.MAX_VALUE;
         return var4 >> 19 & 255;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "hb.az(" + ')');
      }
   }
}
