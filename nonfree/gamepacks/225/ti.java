public class ti {
   public static final int am = 65536;
   public static final int ax = 128;
   public static final int aq = 256;
   static final int[] ap = new int[2048];
   static final int[] ab = new int[2048];

   static {
      double var0 = 0.0030679615757712823D;

      for(int var2 = 0; var2 < 2048; ++var2) {
         ap[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
         ab[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
      }

   }

   ti() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ti.<init>(" + ')');
      }
   }
}
