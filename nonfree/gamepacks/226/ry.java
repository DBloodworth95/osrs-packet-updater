public class ry extends ra {
   long ap;
   int aw;

   public boolean ak() {
      if (this.ap * 1009254925672959185L < (long)(this.aw * 1520981465)) {
         this.ap += -5385702173658903503L;
         return false;
      } else {
         return true;
      }
   }

   public boolean ap(int var1) {
      try {
         if (this.ap * 1009254925672959185L < (long)(this.aw * 1520981465)) {
            if (var1 != 343486624) {
               throw new IllegalStateException();
            } else {
               this.ap += -5385702173658903503L;
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ry.ap(" + ')');
      }
   }

   public ry(ra var1, int var2) {
      try {
         super(var1);
         this.aw = var2 * -865412503;
         this.ai = "DelayFadeTask";
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ry.<init>(" + ')');
      }
   }

   public boolean aj() {
      if (this.ap * 1009254925672959185L < (long)(this.aw * 1520981465)) {
         this.ap += -5385702173658903503L;
         return false;
      } else {
         return true;
      }
   }

   static int ak(char var0, pn var1, short var2) {
      try {
         int var3;
         label38: {
            var3 = var0 << 4;
            if (!Character.isUpperCase(var0)) {
               if (var2 <= 3301) {
                  throw new IllegalStateException();
               }

               if (!Character.isTitleCase(var0)) {
                  break label38;
               }

               if (var2 <= 3301) {
                  throw new IllegalStateException();
               }
            }

            var0 = Character.toLowerCase(var0);
            var3 = 1 + (var0 << 4);
         }

         if (241 == var0) {
            if (var2 <= 3301) {
               throw new IllegalStateException();
            }

            if (var1 == pn.ay) {
               if (var2 <= 3301) {
                  throw new IllegalStateException();
               }

               var3 = 1762;
            }
         }

         return var3;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ry.ak(" + ')');
      }
   }
}
