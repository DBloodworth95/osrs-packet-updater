public class tx {
   static final int ai = 16384;
   public static final int aw = 16383;
   static final double ak = 2607.5945876176133D;
   static final int ap = 16384;
   public static final double aj = 3.834951969714103E-4D;
   static final int[] ay = new int[16384];
   static final int[] as = new int[16384];

   public static int ae(int var0) {
      return as[var0 & 16383];
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         ay[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
         as[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
      }

   }

   tx() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "tx.<init>(" + ')');
      }
   }

   public static int aj(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
   }

   public static int ai(int var0) {
      return ay[var0 & 98007347];
   }

   public static int as(int var0) {
      return as[var0 & 16383];
   }

   public static int ay(int var0) {
      return ay[var0 & 16383];
   }
}
