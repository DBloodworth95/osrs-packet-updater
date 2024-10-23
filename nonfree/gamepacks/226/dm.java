public class dm extends tw {
   int ap;
   int aw;
   static final int ax = 7;
   static final byte bx = 0;
   static final int bh = 127;
   static long ir;
   boolean ak;
   static int pu;

   static da aj(byte[] var0, int var1) {
      try {
         da var2 = new da();
         vl var3 = new vl(var0);
         var3.am = -725588083 * (var3.ae.length - 2);
         int var4 = var3.ce(1990822367);
         int var5 = var3.ae.length - 2 - var4 - 12;
         var3.am = var5 * -725588083;
         int var6 = var3.ch(1203709469);
         var2.ay = var3.ce(656169242) * -218672893;
         var2.as = var3.ce(991591745) * -886398039;
         var2.ae = var3.ce(477319893) * -1151324501;
         var2.am = var3.ce(130459842) * 427624333;
         int var7 = var3.cy((short)-20566);
         int var8;
         int var9;
         if (var7 > 0) {
            if (var1 <= 1532461933) {
               throw new IllegalStateException();
            }

            var2.at = var2.ai(var7, (short)17760);

            for(var8 = 0; var8 < var7; ++var8) {
               var9 = var3.ce(1724216631);
               um var10000 = new um;
               int var10002;
               if (var9 > 0) {
                  if (var1 <= 1532461933) {
                     throw new IllegalStateException();
                  }

                  var10002 = di.ay(var9, -1461388461);
               } else {
                  var10002 = 1;
               }

               var10000.<init>(var10002);
               um var10 = var10000;
               var2.at[var8] = var10;

               while(var9-- > 0) {
                  if (var1 <= 1532461933) {
                     throw new IllegalStateException();
                  }

                  int var11 = var3.ch(1203709469);
                  int var12 = var3.ch(1203709469);
                  var10.aw(new tb(var12), (long)var11);
               }
            }
         }

         var3.am = 0;
         var2.aw = var3.cm(-299421734);
         var2.ak = new int[var6];
         var2.aj = new int[var6];
         var2.ai = new String[var6];

         for(var8 = 0; -1689308347 * var3.am < var5; var2.ak[var8++] = var9) {
            if (var1 <= 1532461933) {
               throw new IllegalStateException();
            }

            var9 = var3.ce(903616746);
            if (3 == var9) {
               var2.ai[var8] = var3.cw(2074461337);
            } else {
               if (var9 < 100 && 21 != var9) {
                  if (var1 <= 1532461933) {
                     throw new IllegalStateException();
                  }

                  if (var9 != 38 && 39 != var9) {
                     if (var1 <= 1532461933) {
                        throw new IllegalStateException();
                     }

                     var2.aj[var8] = var3.ch(1203709469);
                     continue;
                  }
               }

               var2.aj[var8] = var3.cy((short)-18496);
            }
         }

         return var2;
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "dm.aj(" + ')');
      }
   }

   dm() {
      try {
         super();
         this.ak = false;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "dm.<init>(" + ')');
      }
   }

   static float aw(float[] var0, int var1, float var2, int var3) {
      try {
         float var4 = var0[var1];

         for(int var5 = var1 - 1; var5 >= 0; --var5) {
            if (var3 >= 2134024028) {
               throw new IllegalStateException();
            }

            var4 = var0[var5] + var2 * var4;
         }

         return var4;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "dm.aw(" + ')');
      }
   }
}
