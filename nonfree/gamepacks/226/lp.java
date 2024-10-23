import java.util.ArrayList;

public class lp {
   String ap;
   int aw;
   kv aj;
   int ak;
   static final int ab = 2340;

   lp(String var1, int var2, int var3, kv var4) {
      try {
         super();
         this.ap = var1;
         this.aw = var2 * 1927981023;
         this.ak = var3 * 1123413387;
         this.aj = var4;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "lp.<init>(" + ')');
      }
   }

   public static void ay(int var0, int var1, int var2, int var3, byte var4) {
      try {
         if (mp.ay.size() > 1) {
            if (var4 >= 1) {
               return;
            }

            if (mp.ay.get(0) != null) {
               if (var4 >= 1) {
                  throw new IllegalStateException();
               }

               if (((no)mp.ay.get(0)).au.af(529311379)) {
                  if (var4 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (mp.ay.get(1) != null) {
                     if (var4 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (((no)mp.ay.get(1)).au.af(-152541098)) {
                        if (var4 >= 1) {
                           throw new IllegalStateException();
                        }

                        mp.at = var0 * -259069503;
                        mp.au = 660415353 * var1;
                        mp.an = var2 * 1443316973;
                        mp.ao = var3 * 1273416733;
                        mp.ae.add(new rj((ra)null));
                        ArrayList var5 = new ArrayList();
                        var5.add(new ry(new ri((ra)null, 1, false, mp.ao * -1503766987), -399918875 * mp.an));
                        var5.add(new ry(new rt((ra)null, 0, false, mp.au * 402183881), -1912330687 * mp.at));
                        mp.ae.add(new rd((ra)null, var5));
                        if (mp.as.get(0) != null) {
                           if (var4 >= 1) {
                              throw new IllegalStateException();
                           }

                           if (mp.as.get(1) != null) {
                              if (var4 >= 1) {
                                 throw new IllegalStateException();
                              }

                              no var6 = (no)mp.as.get(0);
                              mp.as.set(0, mp.ay.get(1));
                              mp.as.set(1, var6);
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw tm.aw(var7, "lp.ay(" + ')');
      }
   }
}
