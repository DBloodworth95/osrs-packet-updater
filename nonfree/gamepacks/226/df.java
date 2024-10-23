import java.security.SecureRandom;
import java.util.concurrent.Callable;

public class df implements Callable {
   public static final int ag = 25;
   static final int hw = 11;
   static int aj;

   static int ag(ng var0, int var1) {
      try {
         if (-1973680119 * var0.bk != 11) {
            if (var1 <= 1925078388) {
               throw new IllegalStateException();
            } else {
               cm.at[ih.au * -114988147 - 1] = "";
               return 1;
            }
         } else {
            String var2 = cm.at[(ih.au -= 746573637) * -114988147];
            cm.at[(ih.au += 746573637) * -114988147 - 1] = var0.bv(var2, (byte)1);
            return 1;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "df.ag(" + ')');
      }
   }

   public Object call() {
      try {
         return mv.ai(600868912);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "df.call(" + ')');
      }
   }

   static SecureRandom ae() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   public Object aw() {
      return mv.ai(-877799172);
   }

   df() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "df.<init>(" + ')');
      }
   }

   public Object aj() {
      return mv.ai(-280597905);
   }

   static SecureRandom ay() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   static SecureRandom as() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   public Object ak() {
      return mv.ai(1980173618);
   }

   public Object ap() {
      return mv.ai(708379292);
   }

   public static int ap(int var0, int var1, int var2) {
      try {
         int var3;
         for(var3 = 1; var1 > 1; var1 >>= 1) {
            if (var2 >= -237157773) {
               throw new IllegalStateException();
            }

            if (0 != (var1 & 1)) {
               if (var2 >= -237157773) {
                  throw new IllegalStateException();
               }

               var3 *= var0;
            }

            var0 *= var0;
         }

         if (var1 == 1) {
            return var0 * var3;
         } else {
            return var3;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "df.ap(" + ')');
      }
   }
}
