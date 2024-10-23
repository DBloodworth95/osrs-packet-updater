public class no {
   public pe ap;
   public int aw;
   public int ak;
   public int aj;
   public mn au;
   public boolean ay;
   public float ai;
   public boolean ae;
   public boolean am;
   boolean at;
   public nv ao;
   public ba an;
   public static final int bu = 50;
   static final int ab = 10;
   public boolean as;
   static pt va;
   static final int bv = 2;

   public no(pe var1, int var2, int var3, int var4, boolean var5) {
      try {
         super();
         this.aw = -1370124321;
         this.ak = -2014515605;
         this.aj = 0;
         this.ai = 0.0F;
         this.ay = false;
         this.am = false;
         this.at = false;
         this.ap(var1, var2, var3, var4, var5, (byte)75);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "no.<init>(" + ')');
      }
   }

   public no(pe var1, String var2, String var3, int var4, boolean var5) {
      try {
         super();
         this.aw = -1370124321;
         this.ak = -2014515605;
         this.aj = 0;
         this.ai = 0.0F;
         this.ay = false;
         this.am = false;
         this.at = false;
         this.aw = var1.cf(var2, (byte)56) * 1370124321;
         this.ak = var1.cl(-893316127 * this.aw, var3, (short)-29226) * 2014515605;
         this.ap(var1, -893316127 * this.aw, this.ak * 380940733, var4, var5, (byte)35);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "no.<init>(" + ')');
      }
   }

   void ap(pe var1, int var2, int var3, int var4, boolean var5, byte var6) {
      try {
         this.ap = var1;
         this.aw = 1370124321 * var2;
         this.ak = 2014515605 * var3;
         this.aj = 1205448709 * var4;
         this.ay = var5;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "no.ap(" + ')');
      }
   }

   static final void iu(dw var0, int var1) {
      try {
         boolean var10000;
         label75: {
            if (-330508271 * client.dt != 1654975057 * var0.dk) {
               if (var1 != 440270635) {
                  throw new IllegalStateException();
               }

               if (-1 != -1489920319 * var0.cs) {
                  if (var1 != 440270635) {
                     throw new IllegalStateException();
                  }

                  if (var0.dq * -965286275 == 0) {
                     var10000 = false;
                     break label75;
                  }

                  if (var1 != 440270635) {
                     return;
                  }
               }
            }

            var10000 = true;
         }

         boolean var2 = var10000;
         if (!var2) {
            label80: {
               if (var1 != 440270635) {
                  throw new IllegalStateException();
               }

               iu var3 = ng.ap(-1489920319 * var0.cs, (short)-14532);
               if (var3 != null) {
                  if (var1 != 440270635) {
                     return;
                  }

                  if (!var3.au((byte)92)) {
                     if (224894203 * var0.ck + 1 > var3.az[var0.cr * 860313855]) {
                        if (var1 != 440270635) {
                           return;
                        }

                        var10000 = true;
                     } else {
                        var10000 = false;
                     }

                     var2 = var10000;
                     break label80;
                  }
               }

               var2 = true;
            }
         }

         if (var2) {
            if (var1 != 440270635) {
               return;
            }

            int var10 = 1654975057 * var0.dk - var0.du * -1375768957;
            int var4 = -330508271 * client.dt - -1375768957 * var0.du;
            int var5 = -423465920 * var0.bp + var0.dr * -1977652096;
            int var6 = var0.bp * -423465920 + -592373120 * var0.dg;
            int var7 = 1257607040 * var0.dh + -423465920 * var0.bp;
            int var8 = var0.bp * -423465920 + var0.df * -1964531072;
            var0.bk = -124967775 * ((var5 * (var10 - var4) + var7 * var4) / var10);
            var0.bb = 1443056459 * ((var6 * (var10 - var4) + var4 * var8) / var10);
         }

         var0.eg = 0;
         var0.dy = var0.dl * -880529299;
         var0.bq = var0.dy * 1111238171;
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "no.iu(" + ')');
      }
   }
}
