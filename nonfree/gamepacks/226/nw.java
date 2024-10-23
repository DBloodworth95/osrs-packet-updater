public class nw extends tp {
   public final int ap;
   public static final int af = 9;
   public final int[] ak;
   public final int[] aj;
   public final int aw;
   public static final int bv = 27;
   static dv mc;

   public boolean ap(int var1, int var2, int var3) {
      try {
         if (var2 >= 0) {
            if (var3 != 2007505347) {
               throw new IllegalStateException();
            }

            if (var2 < this.aj.length) {
               if (var3 != 2007505347) {
                  throw new IllegalStateException();
               }

               int var4 = this.aj[var2];
               if (var1 >= var4) {
                  if (var3 != 2007505347) {
                     throw new IllegalStateException();
                  }

                  if (var1 <= var4 + this.ak[var2]) {
                     if (var3 != 2007505347) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "nw.ap(" + ')');
      }
   }

   public boolean aw(int var1, int var2) {
      if (var2 >= 0 && var2 < this.aj.length) {
         int var3 = this.aj[var2];
         if (var1 >= var3 && var1 <= var3 + this.ak[var2]) {
            return true;
         }
      }

      return false;
   }

   nw(int var1, int var2, int[] var3, int[] var4, int var5) {
      try {
         super();
         this.ap = 174913839 * var1;
         this.aw = var2 * 876065219;
         this.ak = var3;
         this.aj = var4;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "nw.<init>(" + ')');
      }
   }

   public boolean ak(int var1, int var2) {
      if (var2 >= 0 && var2 < this.aj.length) {
         int var3 = this.aj[var2];
         if (var1 >= var3 && var1 <= var3 + this.ak[var2]) {
            return true;
         }
      }

      return false;
   }
}
