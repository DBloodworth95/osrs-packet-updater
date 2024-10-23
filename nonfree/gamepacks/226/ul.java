import java.util.HashMap;

public class ul {
   pe ap;
   pe aw;
   HashMap ak;

   public HashMap aw(us[] var1) {
      HashMap var2 = new HashMap();
      us[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         us var5 = var3[var4];
         if (this.ak.containsKey(var5)) {
            var2.put(var5, this.ak.get(var5));
         } else {
            qi var6 = cg.as(this.ap, this.aw, var5.as, "", -472018450);
            if (var6 != null) {
               this.ak.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   public HashMap ap(us[] var1, short var2) {
      try {
         HashMap var3 = new HashMap();
         us[] var4 = var1;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            if (var2 == 225) {
               throw new IllegalStateException();
            }

            us var6 = var4[var5];
            if (this.ak.containsKey(var6)) {
               if (var2 == 225) {
                  throw new IllegalStateException();
               }

               var3.put(var6, this.ak.get(var6));
            } else {
               qi var7 = cg.as(this.ap, this.aw, var6.as, "", -685706408);
               if (var7 != null) {
                  this.ak.put(var6, var7);
                  var3.put(var6, var7);
               }
            }
         }

         return var3;
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "ul.ap(" + ')');
      }
   }

   public ul(pe var1, pe var2) {
      try {
         super();
         this.ap = var1;
         this.aw = var2;
         this.ak = new HashMap();
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ul.<init>(" + ')');
      }
   }

   public HashMap ak(us[] var1) {
      HashMap var2 = new HashMap();
      us[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         us var5 = var3[var4];
         if (this.ak.containsKey(var5)) {
            var2.put(var5, this.ak.get(var5));
         } else {
            qi var6 = cg.as(this.ap, this.aw, var5.as, "", -993767546);
            if (var6 != null) {
               this.ak.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   public HashMap aj(us[] var1) {
      HashMap var2 = new HashMap();
      us[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         us var5 = var3[var4];
         if (this.ak.containsKey(var5)) {
            var2.put(var5, this.ak.get(var5));
         } else {
            qi var6 = cg.as(this.ap, this.aw, var5.as, "", -1884545592);
            if (var6 != null) {
               this.ak.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   public HashMap ai(us[] var1) {
      HashMap var2 = new HashMap();
      us[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         us var5 = var3[var4];
         if (this.ak.containsKey(var5)) {
            var2.put(var5, this.ak.get(var5));
         } else {
            qi var6 = cg.as(this.ap, this.aw, var5.as, "", -823017354);
            if (var6 != null) {
               this.ak.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   public static int ap(int var0, int var1) {
      try {
         return var0 >>> 12;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ul.ap(" + ')');
      }
   }
}
