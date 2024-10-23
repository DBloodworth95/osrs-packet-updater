public class ix {
   // $FF: synthetic field
   final ik this$0;
   public ei ap;
   public float[] aw;
   static final int ak = 320;
   static final int am = 4;
   static final int ay = 3;
   public static final int bp = 7;

   static final void au(long var0) {
      try {
         jr.ab[(jr.ar += 1288544407) * 278912807 - 1] = var0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ix.au(" + ')');
      }
   }

   ix(ik var1) {
      try {
         this.this$0 = var1;
         super();
         this.aw = new float[4];
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ix.<init>(" + ')');
      }
   }

   public static int aw(vl var0, String var1, int var2) {
      try {
         int var3 = var0.am * -1689308347;
         byte[] var4 = do.ai(var1, 1454210871);
         var0.cp(var4.length, -330959391);
         var0.am += oh.ap.ap(var4, 0, var4.length, var0.ae, -1689308347 * var0.am, (byte)1) * -725588083;
         return var0.am * -1689308347 - var3;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ix.aw(" + ')');
      }
   }

   static void kf(dn var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, byte var11) {
      try {
         pu var12 = var0.ac;
         do var13 = null;

         for(do var14 = (do)var12.as(); var14 != null; var14 = (do)var12.am()) {
            if (var11 == 0) {
               return;
            }

            if (1321466283 * var14.ap == var1) {
               if (var11 == 0) {
                  return;
               }

               if (-440355905 * var14.ak == var2) {
                  if (var11 == 0) {
                     throw new IllegalStateException();
                  }

                  if (var3 == 1462658139 * var14.aj) {
                     if (var11 == 0) {
                        throw new IllegalStateException();
                     }

                     if (var14.aw * 1704766835 == var4) {
                        if (var11 == 0) {
                           throw new IllegalStateException();
                        }

                        var13 = var14;
                        break;
                     }
                  }
               }
            }
         }

         if (var13 == null) {
            if (var11 == 0) {
               throw new IllegalStateException();
            }

            var13 = new do();
            var13.ap = -933807869 * var1;
            var13.aw = 1898594235 * var4;
            var13.ak = var2 * -2058535873;
            var13.aj = var3 * 305671123;
            var13.au = 633192667;
            bm.kr(var0, var13, 867500960);
            var12.aw(var13);
         }

         var13.ae = var5 * 1299936859;
         var13.at = var6 * -785573095;
         var13.am = 492150421 * var7;
         var13.af = 1613460731 * var9;
         var13.ar = -1983821095 * var10;
         var13.ap(var8, 1098669309);
      } catch (RuntimeException var15) {
         throw tm.aw(var15, "ix.kf(" + ')');
      }
   }
}
