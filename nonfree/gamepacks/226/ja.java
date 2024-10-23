public class ja extends tp {
   jg[] ap;
   static final int bk = 4;

   public boolean aj(int var1) {
      return this.ap[var1].au;
   }

   public boolean aw(int var1, int var2) {
      try {
         return this.ap[var1].au;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ja.aw(" + ')');
      }
   }

   public static ja ak(pe var0, pe var1, int var2, boolean var3) {
      boolean var4 = true;
      int[] var5 = var0.be(var2, 982808498);

      for(int var6 = 0; var6 < var5.length; ++var6) {
         byte[] var7 = var0.bg(var2, var5[var6], 75273836);
         if (var7 == null) {
            var4 = false;
         } else {
            int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
            byte[] var9;
            if (var3) {
               var9 = var1.bg(0, var8, -855897863);
            } else {
               var9 = var1.bg(var8, 0, 1414514878);
            }

            if (null == var9) {
               var4 = false;
            }
         }
      }

      if (!var4) {
         return null;
      } else {
         try {
            return new ja(var0, var1, var2, var3);
         } catch (Exception var10) {
            return null;
         }
      }
   }

   ja(pe var1, pe var2, int var3, boolean var4) {
      try {
         super();
         pu var5 = new pu();
         int var6 = var1.cq(var3, 1485620411);
         this.ap = new jg[var6];
         int[] var7 = var1.be(var3, 2049442337);

         for(int var8 = 0; var8 < var7.length; ++var8) {
            byte[] var9 = var1.bm(var3, var7[var8], 1837131165);
            jt var10 = null;
            int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

            for(jt var12 = (jt)var5.as(); null != var12; var12 = (jt)var5.am()) {
               if (var12.ay * -748699669 == var11) {
                  var10 = var12;
                  break;
               }
            }

            if (var10 == null) {
               byte[] var13;
               if (var4) {
                  var13 = var2.bg(0, var11, -674525562);
               } else {
                  var13 = var2.bg(var11, 0, 1211680262);
               }

               var10 = new jt(var11, var13);
               var5.aw(var10);
            }

            this.ap[var7[var8]] = new jg(var9, var10);
         }

      } catch (RuntimeException var14) {
         throw tm.aw(var14, "ja.<init>(" + ')');
      }
   }

   public static boolean as(int var0, int var1) {
      try {
         if (!mp.as.isEmpty()) {
            if (var1 == 63149132) {
               throw new IllegalStateException();
            } else {
               no var2 = (no)mp.as.get(0);
               boolean var10000;
               if (var2 != null) {
                  if (var1 == 63149132) {
                     throw new IllegalStateException();
                  }

                  if (var0 == -893316127 * var2.aw) {
                     var10000 = true;
                     return var10000;
                  }
               }

               var10000 = false;
               return var10000;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ja.as(" + ')');
      }
   }
}
