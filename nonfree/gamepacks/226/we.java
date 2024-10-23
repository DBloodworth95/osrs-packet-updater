public class we {
   static vv am;
   static vc ab;
   int[] ap;
   public static final int ak = 4;

   public we(int[] var1) {
      try {
         super();

         int var2;
         for(var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) {
         }

         this.ap = new int[var2 + var2];

         int var3;
         for(var3 = 0; var3 < var2 + var2; ++var3) {
            this.ap[var3] = -1;
         }

         int var4;
         for(var3 = 0; var3 < var1.length; this.ap[var4 + var4 + 1] = var3++) {
            for(var4 = var1[var3] & var2 - 1; this.ap[1 + var4 + var4] != -1; var4 = var4 + 1 & var2 - 1) {
            }

            this.ap[var4 + var4] = var1[var3];
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "we.<init>(" + ')');
      }
   }

   public int ap(int var1, byte var2) {
      try {
         int var3 = (this.ap.length >> 1) - 1;
         int var4 = var1 & var3;

         while(true) {
            int var5 = this.ap[var4 + var4 + 1];
            if (var5 == -1) {
               if (var2 != 103) {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            }

            if (this.ap[var4 + var4] == var1) {
               if (var2 != 103) {
                  throw new IllegalStateException();
               }

               return var5;
            }

            var4 = var4 + 1 & var3;
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "we.ap(" + ')');
      }
   }
}
