public final class ku {
   int am;
   int ag;
   public ju aq;
   int ae;
   int ax;
   int ac;
   public ju af;
   public long at;
   int au;
   public static final String jq = "Please enter your date of birth (DD/MM/YYYY)";

   static final int ao(int var0, int var1, int var2, int var3) {
      try {
         if (var2 > 179) {
            if (var3 != -16711936) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 192) {
            if (var3 != -16711936) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 217) {
            if (var3 != -16711936) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 243) {
            if (var3 != -16711936) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         int var4 = var2 / 2 + (var0 / 4 << 10) + (var1 / 32 << 7);
         return var4;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ku.ao(" + ')');
      }
   }

   ku() {
      try {
         super();
         this.at = 0L;
         this.au = 0;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ku.<init>(" + ')');
      }
   }
}
