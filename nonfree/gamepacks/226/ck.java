import java.math.BigInteger;

public class ck {
   static vc af;
   static final BigInteger ap = new BigInteger("10001", 16);
   static final int cm = 20;
   public static po wo;
   static final int ak = 37748736;
   static final BigInteger aw = new BigInteger("90599d6e45ad3596822d15845d898c97425da5d7400c7ce14b136fe6b57818302e12ca8cb9957a9659faf3ae0c156cefc2d598c8ca7b5a5ed99fdd22e82613468184f0d0b633e4543bd258f4606cefd89cb1c5115b25967803a2d96cf543f830b5199e2f820cf71181f1c9aa70aa86ddbe1e030514df8ed320c14927e6747b39", 16);
   public static final int an = 0;

   public static final synchronized long ap(int var0) {
      try {
         long var1 = System.currentTimeMillis();
         if (var1 < my.ap * 7913224161779004381L) {
            if (var0 >= -502207718) {
               throw new IllegalStateException();
            }

            my.aw += -4214090096246073641L * (7913224161779004381L * my.ap - var1);
         }

         my.ap = var1 * 2680872237914569845L;
         return var1 + 3351958198102818023L * my.aw;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ck.ap(" + ')');
      }
   }

   static boolean ap(int var0, int var1, int var2) {
      try {
         return 4 != var0 || var1 < 8;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ck.ap(" + ')');
      }
   }

   static void am(int var0) {
      try {
         nu.cr.trim();
         if (nu.cr.length() != 6) {
            fa.ad(og.bs, og.bm, og.bo, -1059127340);
         } else {
            mp.cs = Integer.parseInt(nu.cr) * -1131643225;
            nu.cr = "";
            fu var10000;
            if (dq.ck) {
               if (var0 >= -205453564) {
                  throw new IllegalStateException();
               }

               var10000 = fu.aw;
            } else {
               var10000 = fu.aj;
            }

            client.fi = var10000;
            fa.ad(og.im, og.is, og.jj, -1059127340);
            ea.gv(20, 2027013533);
         }
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ck.am(" + ')');
      }
   }

   static final void nm(ng var0, int var1, int var2, int var3, byte var4) {
      try {
         nw var5 = var0.ar(qk.ek, false, 1563130314);
         if (var5 == null) {
            if (var4 >= 63) {
               throw new IllegalStateException();
            }
         } else {
            if (client.tf * -1383895545 < 3) {
               if (var4 >= 63) {
                  return;
               }

               at.ky.bx(var1, var2, var5.ap * -210833969, var5.aw * 736216811, 25, 25, client.kb * 1833510775, 256, var5.aj, var5.ak);
            } else {
               vz.es(var1, var2, 0, var5.aj, var5.ak);
            }

         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ck.nm(" + ')');
      }
   }

   ck() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ck.<init>(" + ')');
      }
   }
}
