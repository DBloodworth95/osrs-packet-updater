public class sd extends tw {
   public int ak;
   public int aw;
   public int ap;
   public int aj;
   public int ai;

   public static hy ap(int var0, int var1) {
      try {
         hy var2 = (hy)hy.aj.ap((long)var0);
         if (var2 != null) {
            if (var1 == -1404181299) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = hy.aw.bm(9, var0, 669997491);
            var2 = new hy();
            var2.ay = 509413365 * var0;
            if (null != var3) {
               var2.ak(new vl(var3), (byte)41);
            }

            var2.aw((byte)73);
            hy.aj.ak(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "sd.ap(" + ')');
      }
   }

   public sd(int var1, int var2, int var3, int var4) {
      try {
         super();
         this.ap = 1134843685;
         this.aw = 0;
         this.ak = 0;
         this.aj = 0;
         this.ai = 0;
         this.ap = -1134843685 * var1;
         this.ai = 1037032873 * var2;
         this.aj = -773140343 * var3;
         this.aw = 499358123 * var4;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "sd.<init>(" + ')');
      }
   }
}
