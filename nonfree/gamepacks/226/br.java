import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class br extends tw {
   Method[] as;
   Field[] ai;
   int[] ak;
   int[] aj;
   int ap;
   int[] ay;
   public static final int am = 2048;
   int aw;
   static final int wm = 3;
   byte[][][] ae;
   static final int bu = 24;

   public static void aj(int var0) {
      try {
         hg.aw.aj();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "br.aj(" + ')');
      }
   }

   br() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "br.<init>(" + ')');
      }
   }

   static int gm(int var0) {
      try {
         if (client.wt != null) {
            if (var0 == 17877995) {
               throw new IllegalStateException();
            }

            if (-114882557 * client.wf < client.wt.size()) {
               int var1 = 0;

               for(int var2 = 0; var2 <= -114882557 * client.wf; ++var2) {
                  if (var0 == 17877995) {
                     throw new IllegalStateException();
                  }

                  var1 += ((du)client.wt.get(var2)).aj * -2015281063;
               }

               return var1 * 10000 / (client.wu * 860115079);
            }

            if (var0 == 17877995) {
               throw new IllegalStateException();
            }
         }

         return 10000;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "br.gm(" + ')');
      }
   }

   static void al(int var0) {
      try {
         as.aa(24, (byte)1);
         fa.ad(og.jd, og.ju, og.jg, -1059127340);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "br.al(" + ')');
      }
   }

   public static gk aw(int var0, byte var1) {
      try {
         gk var2 = (gk)gk.ak.ap((long)var0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = gk.ap.bm(16, var0, 1094179871);
            var2 = new gk();
            if (null != var3) {
               var2.ak(new vl(var3), -1405929075);
            }

            gk.ak.ak(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "br.aw(" + ')');
      }
   }
}
