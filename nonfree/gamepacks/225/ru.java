import java.util.ArrayList;

public class ru extends ri {
   ArrayList ac;
   public static br ar;
   static final int av = 25;

   public ru(ri var1, ArrayList var2) {
      try {
         super(var1);
         this.ac = var2;
         this.ax = "ConcurrentMidiTask";
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ru.<init>(" + ')');
      }
   }

   public boolean ac(int var1) {
      try {
         for(int var2 = 0; var2 < this.ac.size(); ++var2) {
            if (var1 != -1411718299) {
               throw new IllegalStateException();
            }

            ri var3 = (ri)this.ac.get(var2);
            if (null == var3) {
               if (var1 != -1411718299) {
                  throw new IllegalStateException();
               }

               this.ac.remove(var2);
               --var2;
            } else if (var3.ac(-1411718299)) {
               if (var1 != -1411718299) {
                  throw new IllegalStateException();
               }

               if (var3.af((short)21406)) {
                  if (var1 != -1411718299) {
                     throw new IllegalStateException();
                  }

                  this.al(var3.au((byte)35), -65735155);
                  this.ac.clear();
                  return true;
               }

               if (var3.ar(2019867397) != null) {
                  if (var1 != -1411718299) {
                     throw new IllegalStateException();
                  }

                  this.ac.add(var3.ar(-979531187));
               }

               this.af = var3.af;
               this.ac.remove(var2);
               --var2;
            }
         }

         if (this.ac.isEmpty()) {
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ru.ac(" + ')');
      }
   }

   public boolean ag() {
      for(int var1 = 0; var1 < this.ac.size(); ++var1) {
         ri var2 = (ri)this.ac.get(var1);
         if (null == var2) {
            this.ac.remove(var1);
            --var1;
         } else if (var2.ac(-1411718299)) {
            if (var2.af((short)32129)) {
               this.al(var2.au((byte)82), -65735155);
               this.ac.clear();
               return true;
            }

            if (var2.ar(1962143948) != null) {
               this.ac.add(var2.ar(128628009));
            }

            this.af = var2.af;
            this.ac.remove(var1);
            --var1;
         }
      }

      if (this.ac.isEmpty()) {
         return true;
      } else {
         return false;
      }
   }
}
