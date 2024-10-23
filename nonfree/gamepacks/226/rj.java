public class rj extends ra {
   public static final int ap = -1;
   static int gn;

   public boolean aj() {
      if (mp.ay.size() > 1 && mp.ay.get(0) != null && ((no)mp.ay.get(0)).au.af(535953589) && mp.ay.get(1) != null && ((no)mp.ay.get(1)).au.af(80842691)) {
         no var1 = (no)mp.ay.get(0);
         mp.ay.set(0, mp.ay.get(1));
         mp.ay.set(1, var1);
      }

      return true;
   }

   public boolean ap(int var1) {
      try {
         if (mp.ay.size() > 1) {
            if (var1 != 343486624) {
               throw new IllegalStateException();
            }

            if (mp.ay.get(0) != null) {
               if (var1 != 343486624) {
                  throw new IllegalStateException();
               }

               if (((no)mp.ay.get(0)).au.af(-58169751) && mp.ay.get(1) != null) {
                  if (var1 != 343486624) {
                     throw new IllegalStateException();
                  }

                  if (((no)mp.ay.get(1)).au.af(1597448039)) {
                     no var2 = (no)mp.ay.get(0);
                     mp.ay.set(0, mp.ay.get(1));
                     mp.ay.set(1, var2);
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rj.ap(" + ')');
      }
   }

   public boolean ak() {
      if (mp.ay.size() > 1 && mp.ay.get(0) != null && ((no)mp.ay.get(0)).au.af(253268054) && mp.ay.get(1) != null && ((no)mp.ay.get(1)).au.af(1874498834)) {
         no var1 = (no)mp.ay.get(0);
         mp.ay.set(0, mp.ay.get(1));
         mp.ay.set(1, var1);
      }

      return true;
   }

   public static int ai(int var0, int var1) {
      try {
         return pj.ay(jr.ab[var0]);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rj.ai(" + ')');
      }
   }

   public rj(ra var1) {
      try {
         super(var1);
         this.ai = "SwapSongTask";
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rj.<init>(" + ')');
      }
   }
}
