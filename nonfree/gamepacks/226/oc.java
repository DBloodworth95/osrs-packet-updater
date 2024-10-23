public class oc {
   public static final int ak = 2;
   public static final int aw = 1;
   public static final int ap = 0;
   static pk vv;

   oc() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "oc.<init>(" + ')');
      }
   }

   public static boolean ap(int var0, int var1) {
      try {
         boolean var10000;
         if (of.aq.al * 938087275 == var0) {
            if (var1 <= -1531339007) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "oc.ap(" + ')');
      }
   }

   static void ky(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, dv var13, int var14) {
      try {
         ir var15;
         int var16;
         int var17;
         label64: {
            var15 = ei.aw(var6, 888461382);
            if (var4 != 1) {
               if (var4 != 3) {
                  var16 = var15.az * -347110081;
                  var17 = -109800991 * var15.ag;
                  break label64;
               }

               if (var14 != 431802639) {
                  throw new IllegalStateException();
               }
            }

            var16 = -109800991 * var15.ag;
            var17 = var15.az * -347110081;
         }

         int var18 = (var16 >> 1) + var1;
         int var19 = var1 + (var16 + 1 >> 1);
         int var20 = (var17 >> 1) + var2;
         int var21 = (1 + var17 >> 1) + var2;
         int[][] var22 = nq.jn.at[var0];
         int var23 = var22[var19][var21] + var22[var18][var21] + var22[var19][var20] + var22[var18][var20] >> 2;
         int var24 = (var1 << 7) + (var16 << 6);
         int var25 = (var2 << 7) + (var17 << 6);
         jy var26 = var15.am(var3, var4, var22, var24, var23, var25, (byte)-16);
         if (null != var26) {
            if (var14 != 431802639) {
               throw new IllegalStateException();
            }

            ix.kf(nq.jn, var0, var1, var2, var5, -1, 0, 0, 31, var7 + 1, var8 + 1, (byte)-2);
            var13.at = 1574793879 * (var7 + -330508271 * client.dt);
            var13.au = (-330508271 * client.dt + var8) * 1811810665;
            var13.ab = var26;
            var13.ao = -853134016 * var16 + var1 * -1706268032;
            var13.ar = 2014805184 * var17 + var2 * -265356928;
            var13.af = var23 * -1879531293;
            int var27;
            if (var9 > var11) {
               if (var14 != 431802639) {
                  throw new IllegalStateException();
               }

               var27 = var9;
               var9 = var11;
               var11 = var27;
            }

            if (var10 > var12) {
               if (var14 != 431802639) {
                  throw new IllegalStateException();
               }

               var27 = var10;
               var10 = var12;
               var12 = var27;
            }

            var13.az = (var9 + var1) * -749312097;
            var13.ad = (var1 + var11) * 476766753;
            var13.ag = 407386357 * (var2 + var10);
            var13.ac = (var12 + var2) * 1024731531;
         }

      } catch (RuntimeException var28) {
         throw tm.aw(var28, "oc.ky(" + ')');
      }
   }
}
