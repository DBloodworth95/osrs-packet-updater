public class wq {
   int[] ac;
   public static final int ax = 3;

   public int ae(int var1) {
      int var2 = (this.ac.length >> 1) - 1;
      int var3 = var1 & var2;

      while(true) {
         int var4 = this.ac[1 + var3 + var3];
         if (var4 == -1) {
            return -1;
         }

         if (var1 == this.ac[var3 + var3]) {
            return var4;
         }

         var3 = 1 + var3 & var2;
      }
   }

   public wq(int[] var1) {
      try {
         super();

         int var2;
         for(var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) {
         }

         this.ac = new int[var2 + var2];

         int var3;
         for(var3 = 0; var3 < var2 + var2; ++var3) {
            this.ac[var3] = -1;
         }

         int var4;
         for(var3 = 0; var3 < var1.length; this.ac[var4 + var4 + 1] = var3++) {
            for(var4 = var1[var3] & var2 - 1; this.ac[1 + var4 + var4] != -1; var4 = 1 + var4 & var2 - 1) {
            }

            this.ac[var4 + var4] = var1[var3];
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "wq.<init>(" + ')');
      }
   }

   public int ag(int var1) {
      int var2 = (this.ac.length >> 1) - 1;
      int var3 = var1 & var2;

      while(true) {
         int var4 = this.ac[1 + var3 + var3];
         if (var4 == -1) {
            return -1;
         }

         if (var1 == this.ac[var3 + var3]) {
            return var4;
         }

         var3 = 1 + var3 & var2;
      }
   }

   public int ac(int var1, int var2) {
      try {
         int var3 = (this.ac.length >> 1) - 1;
         int var4 = var1 & var3;

         while(true) {
            int var5 = this.ac[1 + var4 + var4];
            if (var5 == -1) {
               if (var2 == 2001221641) {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            }

            if (var1 == this.ac[var4 + var4]) {
               if (var2 == 2001221641) {
                  throw new IllegalStateException();
               }

               return var5;
            }

            var4 = 1 + var4 & var3;
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "wq.ac(" + ')');
      }
   }
}
