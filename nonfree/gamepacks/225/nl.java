public class nl extends tr {
   public final int ac;
   public final int[] ag;
   public final int ae;
   public final int[] am;

   nl(int var1, int var2, int[] var3, int[] var4, int var5) {
      try {
         super();
         this.ac = var1 * 991813353;
         this.ae = var2 * -2033059841;
         this.ag = var3;
         this.am = var4;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "nl.<init>(" + ')');
      }
   }

   public boolean ae(int var1, int var2) {
      if (var2 >= 0 && var2 < this.am.length) {
         int var3 = this.am[var2];
         if (var1 >= var3 && var1 <= this.ag[var2] + var3) {
            return true;
         }
      }

      return false;
   }

   public boolean ac(int var1, int var2, int var3) {
      try {
         if (var2 >= 0 && var2 < this.am.length) {
            if (var3 <= -1936407690) {
               throw new IllegalStateException();
            }

            int var4 = this.am[var2];
            if (var1 >= var4) {
               if (var3 <= -1936407690) {
                  throw new IllegalStateException();
               }

               if (var1 <= this.ag[var2] + var4) {
                  if (var3 <= -1936407690) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "nl.ac(" + ')');
      }
   }

   public boolean ag(int var1, int var2) {
      if (var2 >= 0 && var2 < this.am.length) {
         int var3 = this.am[var2];
         if (var1 >= var3 && var1 <= this.ag[var2] + var3) {
            return true;
         }
      }

      return false;
   }
}
