import java.util.ArrayList;

public class rd extends ra {
   public static int am;
   ArrayList ap;
   public static final int aw = 200;

   public boolean ap(int var1) {
      try {
         for(int var2 = 0; var2 < this.ap.size(); ++var2) {
            if (var1 != 343486624) {
               throw new IllegalStateException();
            }

            ra var3 = (ra)this.ap.get(var2);
            if (var3 == null) {
               if (var1 != 343486624) {
                  throw new IllegalStateException();
               }

               this.ap.remove(var2);
               --var2;
            } else if (var3.ap(343486624)) {
               if (var1 != 343486624) {
                  throw new IllegalStateException();
               }

               if (var3.as(1816225167)) {
                  if (var1 != 343486624) {
                     throw new IllegalStateException();
                  }

                  this.au(var3.am(-1584658519), 634133961);
                  this.ap.clear();
                  return true;
               }

               if (var3.at(-96438475) != null) {
                  if (var1 != 343486624) {
                     throw new IllegalStateException();
                  }

                  this.ap.add(var3.at(621225135));
               }

               this.as = var3.as;
               this.ap.remove(var2);
               --var2;
            }
         }

         if (this.ap.isEmpty()) {
            if (var1 != 343486624) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "rd.ap(" + ')');
      }
   }

   public rd(ra var1, ArrayList var2) {
      try {
         super(var1);
         this.ap = var2;
         this.ai = "ConcurrentMidiTask";
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rd.<init>(" + ')');
      }
   }

   public boolean ak() {
      for(int var1 = 0; var1 < this.ap.size(); ++var1) {
         ra var2 = (ra)this.ap.get(var1);
         if (var2 == null) {
            this.ap.remove(var1);
            --var1;
         } else if (var2.ap(343486624)) {
            if (var2.as(1816225167)) {
               this.au(var2.am(-1627598979), 634133961);
               this.ap.clear();
               return true;
            }

            if (var2.at(339530288) != null) {
               this.ap.add(var2.at(730984993));
            }

            this.as = var2.as;
            this.ap.remove(var1);
            --var1;
         }
      }

      if (this.ap.isEmpty()) {
         return true;
      } else {
         return false;
      }
   }

   public boolean aj() {
      for(int var1 = 0; var1 < this.ap.size(); ++var1) {
         ra var2 = (ra)this.ap.get(var1);
         if (var2 == null) {
            this.ap.remove(var1);
            --var1;
         } else if (var2.ap(343486624)) {
            if (var2.as(1816225167)) {
               this.au(var2.am(-1269574952), 634133961);
               this.ap.clear();
               return true;
            }

            if (var2.at(658029346) != null) {
               this.ap.add(var2.at(-657125618));
            }

            this.as = var2.as;
            this.ap.remove(var1);
            --var1;
         }
      }

      if (this.ap.isEmpty()) {
         return true;
      } else {
         return false;
      }
   }
}
