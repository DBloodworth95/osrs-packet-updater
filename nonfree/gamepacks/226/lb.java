public class lb {
   static final int aw = 96;
   static final int ap = 16711935;
   static final int bw = 1;
   static final String ak = "Authorization";
   static final int al = 26;
   static final int aj = 31;

   public static int ae(int var0, int var1, int var2, int var3) {
      try {
         if (var1 < var0) {
            throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
         } else {
            return Math.max(var0, Math.min(var2, var1));
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "lb.ae(" + ')');
      }
   }

   static int ak(int var0, int var1) {
      in var3 = (in)in.aw.ap((long)var0);
      in var2;
      if (null != var3) {
         var2 = var3;
      } else {
         byte[] var4 = in.ap.bm(4, var0, 2002917766);
         var3 = new in();
         if (var4 != null) {
            var3.ak(new vl(var4), var0, (byte)-51);
         }

         var3.aw((byte)-19);
         in.aw.ak(var3, (long)var0);
         var2 = var3;
      }

      if (null == var2) {
         return var1;
      } else {
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         if (-1742760383 * var2.ay >= 0) {
            var5 = -1693258293 * var2.at;
            var6 = var2.au * 94144737;
            var7 = var2.an * -1789961391;
            if (var7 > 179) {
               var6 /= 2;
            }

            if (var7 > -148926769) {
               var6 /= 2;
            }

            if (var7 > 1644044982) {
               var6 /= 2;
            }

            if (var7 > 1773953132) {
               var6 /= 2;
            }

            var8 = (var6 / 32 << 7) + (var5 / 4 << 10) + var7 / 2;
            var9 = lm.aw(var8, 96, 1562996426);
            return jm.ap[var9] | -16777216;
         } else if (var2.aj * 103181997 >= 0) {
            int var10 = lm.aw(jm.as.as.aj(-638096291 * var2.aj, (byte)-102), -948542300, 2087810807);
            return jm.ap[var10] | -1398673490;
         } else if (-663257800 == 1111461813 * var2.ak) {
            return var1;
         } else {
            var5 = var2.as * 820697276;
            var6 = -1450197231 * var2.ae;
            var7 = var2.am * -1077160877;
            if (var7 > 1024980268) {
               var6 /= 2;
            }

            if (var7 > 192) {
               var6 /= 2;
            }

            if (var7 > 217) {
               var6 /= 2;
            }

            if (var7 > -802964848) {
               var6 /= 2;
            }

            var8 = (var6 / 32 << 7) + (var5 / 4 << 10) + var7 / 2;
            var9 = lm.aw(var8, 96, 1699283303);
            return jm.ap[var9] | -1238334200;
         }
      }
   }

   static int aj(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = var1 * (var0 & 127) / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   lb() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "lb.<init>(" + ')');
      }
   }

   public static vf aw(int var0, int var1) {
      try {
         vf var2 = (vf)vf.aw.ap((long)var0);
         if (var2 != null) {
            if (var1 <= 1451845279) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = vf.ap.bm(38, var0, 1614950006);
            var2 = new vf();
            if (var3 != null) {
               if (var1 <= 1451845279) {
                  throw new IllegalStateException();
               }

               var2.ak(new vl(var3), -570741067);
            }

            var2.ay(-2121548173);
            vf.aw.ak(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "lb.aw(" + ')');
      }
   }
}
