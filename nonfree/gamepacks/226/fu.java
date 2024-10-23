public class fu implements ph {
   public static final fu ap = new fu(1, 0);
   public static final fu aw = new fu(2, 1);
   public static final fu ai = new fu(0, 4);
   public static final fu aj = new fu(4, 3);
   final int as;
   public final int ay;
   static ta ve;
   public static final fu ak = new fu(3, 2);

   public int as() {
      return this.as * -2048248869;
   }

   public int aw(int var1) {
      try {
         return this.as * -2048248869;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fu.aw(" + ')');
      }
   }

   fu(int var1, int var2) {
      try {
         super();
         this.ay = 1631933491 * var1;
         this.as = 1603440723 * var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fu.<init>(" + ')');
      }
   }

   public static int aj(long var0) {
      try {
         return (int)(var0 >>> 0 & 127L);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fu.aj(" + ')');
      }
   }

   public static int af(int var0, byte var1) {
      try {
         fr var3 = (fr)iu.at.ap((long)var0);
         fr var2;
         if (null != var3) {
            if (var1 != 4) {
               throw new IllegalStateException();
            }

            var2 = var3;
         } else {
            var3 = lt.ap(id.ay, id.as, var0, false, (byte)0);
            if (var3 != null) {
               if (var1 != 4) {
                  throw new IllegalStateException();
               }

               iu.at.ak(var3, (long)var0);
            }

            var2 = var3;
         }

         if (null == var2) {
            if (var1 != 4) {
               throw new IllegalStateException();
            } else {
               return 2;
            }
         } else {
            byte var10000;
            if (var2.ak(-1795320228)) {
               if (var1 != 4) {
                  throw new IllegalStateException();
               }

               var10000 = 0;
            } else {
               var10000 = 1;
            }

            return var10000;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "fu.af(" + ')');
      }
   }
}
