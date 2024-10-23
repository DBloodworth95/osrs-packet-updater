import java.util.Iterator;

public final class qk {
   public static final int ap = 0;
   public static final int aj = 6;
   static nm ek;

   public static String ak(vl var0, int var1) {
      try {
         return gg.aj(var0, 32767, (byte)-53);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qk.ak(" + ')');
      }
   }

   static final void md(ng var0, int var1, int var2, int var3) {
      try {
         if (client.pr == null && !client.nr) {
            if (var0 != null) {
               if (var3 <= 1182903620) {
                  throw new IllegalStateException();
               }

               if (cu.mc(var0, 880828421) != null) {
                  client.pr = var0;
                  client.pv = cu.mc(var0, -808615215);
                  client.pj = var1 * 1923851011;
                  client.pp = 1627057455 * var2;
                  dm.pu = 0;
                  client.pm = false;
                  int var4 = nt.lx(614997679);
                  if (-1 != var4) {
                     gs.on = new cr();
                     gs.on.ap = client.ng.ak[var4] * 392125685;
                     gs.on.aw = client.ng.aj[var4] * -765081991;
                     gs.on.ak = -1616905661 * client.ng.ai[var4];
                     gs.on.aj = client.ng.ay[var4] * -592200971;
                     gs.on.ai = client.ng.as[var4] * 1465409347;
                     gs.on.as = client.ng.am[var4];
                     gs.on.ae = client.ng.at[var4];
                     gs.on.ay = client.ng.ae[var4] * 1218230345;
                     gs.on.am = client.ng.an[var4];
                  }

                  return;
               }
            }

         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qk.md(" + ')');
      }
   }

   qk() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qk.<init>(" + ')');
      }
   }

   public static dn aw(int var0, dy var1, int var2) {
      try {
         Iterator var3 = var1.iterator();

         dn var4;
         do {
            if (!var3.hasNext()) {
               return var1.aj(-1634950082);
            }

            if (var2 >= -1948555769) {
               throw new IllegalStateException();
            }

            var4 = (dn)var3.next();
         } while(null == var4.ao[var0]);

         if (var2 >= -1948555769) {
            throw new IllegalStateException();
         } else {
            return var4;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qk.aw(" + ')');
      }
   }

   static int[] aw(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         int[] var6 = new int[256];

         int var7;
         for(var7 = 0; var7 < 64; ++var7) {
            if (var5 >= 648118623) {
               throw new IllegalStateException();
            }

            var6[var7] = lj.ak(var0, var1, var7, 1206437042);
         }

         for(var7 = 0; var7 < 64; ++var7) {
            if (var5 >= 648118623) {
               throw new IllegalStateException();
            }

            var6[var7 + 64] = lj.ak(var1, var2, var7, 1206437042);
         }

         for(var7 = 0; var7 < 64; ++var7) {
            if (var5 >= 648118623) {
               throw new IllegalStateException();
            }

            var6[128 + var7] = lj.ak(var2, var3, var7, 1206437042);
         }

         for(var7 = 0; var7 < 64; ++var7) {
            if (var5 >= 648118623) {
               throw new IllegalStateException();
            }

            var6[var7 + 192] = lj.ak(var3, var4, var7, 1206437042);
         }

         return var6;
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "qk.aw(" + ')');
      }
   }

   public static int ap(int var0, short var1) {
      try {
         if (0 != var0) {
            if (var1 == 141) {
               throw new IllegalStateException();
            }

            if (var0 != 1) {
               return -1;
            }
         }

         return 0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qk.ap(" + ')');
      }
   }
}
