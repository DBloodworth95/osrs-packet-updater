public abstract class fq extends tw {
   static int uy;
   static final int tg = 100;
   static boolean ez;
   static final int bm = 1003;

   abstract void ak(vl var1);

   abstract void ai(gy var1);

   abstract void aw(gy var1, int var2);

   abstract void aj(vl var1);

   abstract void ap(vl var1, int var2);

   abstract void ay(gy var1);

   fq() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "fq.<init>(" + ')');
      }
   }

   static void jx(dn var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if (var1 >= 128 && 13056 >= var1) {
            if (var6 != 229971609) {
               throw new IllegalStateException();
            }

            if (var2 >= 128) {
               if (13056 >= var2) {
                  int var7 = cu.jl(var0, var3, var4, 86027145 * var0.aj, 1101377598) - var5;
                  var1 -= -678007887 * ad.kw;
                  var7 -= 2138486231 * in.ks;
                  var2 -= oo.kv * -892337617;
                  int var8 = jm.aj[-887244477 * mj.kz];
                  int var9 = jm.ai[-887244477 * mj.kz];
                  int var10 = jm.aj[pg.kc * 1625945013];
                  int var11 = jm.ai[pg.kc * 1625945013];
                  int var12 = var11 * var1 + var2 * var10 >> 16;
                  var2 = var2 * var11 - var10 * var1 >> 16;
                  var1 = var12;
                  var12 = var9 * var7 - var2 * var8 >> 16;
                  var2 = var9 * var2 + var7 * var8 >> 16;
                  if (var2 >= 50) {
                     if (var6 != 229971609) {
                        throw new IllegalStateException();
                     }

                     client.mr = (var1 * client.vl * 1706192477 / var2 + -1725432169 * client.vw / 2) * 1499210713;
                     client.mb = -1178704249 * (client.vm * -1477308191 / 2 + var12 * client.vl * 1706192477 / var2);
                  } else {
                     client.mr = -1499210713;
                     client.mb = 1178704249;
                  }

                  return;
               }

               if (var6 != 229971609) {
                  throw new IllegalStateException();
               }
            }
         }

         client.mr = -1499210713;
         client.mb = 1178704249;
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "fq.jx(" + ')');
      }
   }
}
