public class rh extends ri {
   int ae;
   long ac;

   public rh(ri var1, int var2) {
      try {
         super(var1);
         this.ae = var2 * -474777721;
         this.ax = "DelayFadeTask";
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "rh.<init>(" + ')');
      }
   }

   public boolean ag() {
      if (this.ac * 2664804138201469369L < (long)(this.ae * 2096406071)) {
         this.ac += 466124637942277257L;
         return false;
      } else {
         return true;
      }
   }

   public boolean ac(int var1) {
      try {
         if (this.ac * 2664804138201469369L < (long)(this.ae * 2096406071)) {
            if (var1 != -1411718299) {
               throw new IllegalStateException();
            } else {
               this.ac += 466124637942277257L;
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "rh.ac(" + ')');
      }
   }

   static int bt(int var0, dt var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "rh.bt(" + ')');
      }
   }
}
