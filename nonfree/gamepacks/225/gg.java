import java.util.ArrayList;
import java.util.Iterator;

public class gg extends tr {
   static ml ac = new ml(64);
   static final int ag = 2;
   public static final int ar = 1280;

   public static void am(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5, byte var6) {
      try {
         if (var0.isEmpty()) {
            if (var6 == 0) {
               throw new IllegalStateException();
            }
         } else {
            mm.ax.clear();
            mm.at.clear();
            fx.az(var5, -4045494);
            ae.ad(var0, var5, 408900827);
            if (!mm.ax.isEmpty()) {
               qg.ah(var1, var2, var3, var4, 266743041);
               mm.at.add(new qm((ri)null));
               mm.at.add(new ra((ri)null, mm.ac, mm.ae, rw.ag));
               ArrayList var7 = new ArrayList();
               var7.add(new rb(new rj((ri)null, 0, true, 94191071 * mm.ah)));
               if (!mm.aq.isEmpty()) {
                  if (var6 == 0) {
                     throw new IllegalStateException();
                  }

                  ArrayList var8 = new ArrayList();
                  var8.add(new rh(new ru((ri)null, var7), mm.ad * -1026592873));
                  ArrayList var10 = new ArrayList();
                  Iterator var11 = mm.aq.iterator();

                  while(var11.hasNext()) {
                     if (var6 == 0) {
                        return;
                     }

                     ns var12 = (ns)var11.next();
                     var10.add(var12);
                  }

                  var8.add(new rh(new rc(new rl((ri)null, var10), 0, false, mm.al * -161512225), mm.ar * -1049602065));
                  mm.at.add(new ru((ri)null, var8));
               } else {
                  mm.at.add(new rh((ri)null, -1026592873 * mm.ad));
                  mm.at.add(new ru((ri)null, var7));
               }

            }
         }
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "gg.am(" + ')');
      }
   }

   public static int ac(int var0, int var1, int var2, byte var3) {
      try {
         var2 &= 3;
         if (0 == var2) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               return var0;
            }
         } else if (var2 == 1) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else if (2 == var2) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               return 7 - var0;
            }
         } else {
            return 7 - var1;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "gg.ac(" + ')');
      }
   }

   public static void ae() {
      ac.am();
   }

   static void ax(float[] var0, int var1) {
      try {
         if (ft.am + var0[0] < 1.3333334F) {
            if (var1 >= -1816105437) {
               throw new IllegalStateException();
            }

            float var2 = var0[0] - 2.0F;
            float var3 = var0[0] - 1.0F;
            float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * 4.0F * var3));
            float var5 = 0.5F * (var4 + -var2);
            if (ft.am + var0[1] > var5) {
               var0[1] = var5 - ft.am;
            } else {
               var5 = (-var2 - var4) * 0.5F;
               if (var0[1] < var5 + ft.am) {
                  var0[1] = ft.am + var5;
               }
            }
         } else {
            var0[0] = 1.3333334F - ft.am;
            var0[1] = 0.33333334F - ft.am;
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "gg.ax(" + ')');
      }
   }

   public static void af(int var0) {
      try {
         hx.ae.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "gg.af(" + ')');
      }
   }

   gg() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "gg.<init>(" + ')');
      }
   }

   public static void ag() {
      ac.am();
   }
}
