public class li {
   public nm ae;
   public nm ag;
   static int aq;
   public int ac;
   static final int at = 3;

   static void cu(int var0, int var1) {
      try {
         if (-1 == var0) {
            if (var1 <= 2108426200) {
               throw new IllegalStateException();
            }
         } else if (!ir.ep.ag(var0, (byte)32)) {
            if (var1 <= 2108426200) {
               throw new IllegalStateException();
            }
         } else {
            ny[] var2 = ir.ep.aq[var0];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               if (var1 <= 2108426200) {
                  throw new IllegalStateException();
               }

               ny var4 = var2[var3];
               if (var4.ed != null) {
                  if (var1 <= 2108426200) {
                     throw new IllegalStateException();
                  }

                  do var5 = new do();
                  var5.ag = var4;
                  var5.ac = var4.ed;
                  dj.ae(var5, 5000000, 0, 2077087733);
               }
            }

         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "li.cu(" + ')');
      }
   }

   public li(int var1, nm var2, nm var3) {
      try {
         super();
         this.ac = -1166279379 * var1;
         this.ae = var2;
         this.ag = var3;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "li.<init>(" + ')');
      }
   }
}
