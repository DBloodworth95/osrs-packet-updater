public class it {
   public static final int ac = 0;
   public static final int ae = 5;
   static final int ba = 49;

   public static vt[] am(po var0, String var1, String var2, byte var3) {
      try {
         if (!var0.cq(var1, var2, 1024258177)) {
            if (var3 <= 2) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = var0.cg(var1, (short)-13727);
            int var5 = var0.ct(var4, var2, -1942671058);
            vt[] var6;
            if (!tb.au(var0, var4, var5, (short)180)) {
               var6 = null;
            } else {
               var6 = ew.af(-1925846801);
            }

            return var6;
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "it.am(" + ')');
      }
   }

   public static mx[] ac(int var0) {
      try {
         return new mx[]{mx.ac, mx.ae, mx.ag, mx.am, mx.ax, mx.aq, mx.af, mx.at, mx.au, mx.ar, mx.al};
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "it.ac(" + ')');
      }
   }

   it() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "it.<init>(" + ')');
      }
   }
}
