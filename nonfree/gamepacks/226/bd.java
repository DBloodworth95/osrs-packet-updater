public class bd implements Runnable {
   public static final int bf = 1010;
   static final int bv = 30;
   static vc ay;
   volatile bm[] ap;

   public static void ak(int var0) {
      try {
         if.ak.clear();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "bd.ak(" + ')');
      }
   }

   public void run() {
      try {
         try {
            for(int var1 = 0; var1 < 2; ++var1) {
               bm var2 = this.ap[var1];
               if (null != var2) {
                  var2.al((byte)-38);
               }
            }
         } catch (Exception var3) {
            rl.ap((String)null, var3, (byte)-50);
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bd.run(" + ')');
      }
   }

   public void dk() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            bm var2 = this.ap[var1];
            if (null != var2) {
               var2.al((byte)-98);
            }
         }
      } catch (Exception var3) {
         rl.ap((String)null, var3, (byte)-25);
      }

   }

   static void iy(dn var0, byte var1) {
      try {
         int var2 = -562349667 * client.jp.ae;
         int[] var3 = client.jp.am;

         for(int var4 = 0; var4 < var2; ++var4) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            if (client.nk * 1564407135 != var3[var4]) {
               if (var1 <= -1) {
                  throw new IllegalStateException();
               }

               if (-190079873 * client.ma == var3[var4]) {
                  if (var1 <= -1) {
                     throw new IllegalStateException();
                  }
               } else {
                  sk.it(var0, var3[var4], true, (short)227);
               }
            }
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "bd.iy(" + ')');
      }
   }

   bd() {
      try {
         super();
         this.ap = new bm[2];
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "bd.<init>(" + ')');
      }
   }

   public static kk ap(byte var0, int var1) {
      try {
         kk[] var2 = kk.au;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var1 == -177226227) {
               throw new IllegalStateException();
            }

            kk var4 = var2[var3];
            if (var0 == var4.at) {
               if (var1 == -177226227) {
                  throw new IllegalStateException();
               }

               return var4;
            }
         }

         throw new RuntimeException("Could not find MoveSpeed with ID " + var0);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "bd.ap(" + ')');
      }
   }

   static final void mh(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         ft.kr[0].ak(var0, var1);
         ft.kr[1].ak(var0, var1 + var3 - 16);
         vz.ef(var0, 16 + var1, 16, var3 - 32, -216547713 * client.kl);
         int var6 = var3 * (var3 - 32) / var4;
         if (var6 < 8) {
            if (var5 <= -766620004) {
               throw new IllegalStateException();
            }

            var6 = 8;
         }

         int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
         vz.ef(var0, 16 + var1 + var7, 16, var6, 455773917 * client.ke);
         vz.ew(var0, var7 + var1 + 16, var6, 1374945159 * client.kt);
         vz.ew(var0 + 1, var7 + var1 + 16, var6, 1374945159 * client.kt);
         vz.ej(var0, var7 + 16 + var1, 16, 1374945159 * client.kt);
         vz.ej(var0, var1 + 17 + var7, 16, client.kt * 1374945159);
         vz.ew(15 + var0, 16 + var1 + var7, var6, 415672587 * client.kj);
         vz.ew(var0 + 14, var7 + 17 + var1, var6 - 1, client.kj * 415672587);
         vz.ej(var0, var7 + 15 + var1 + var6, 16, 415672587 * client.kj);
         vz.ej(1 + var0, var6 + var1 + 14 + var7, 15, client.kj * 415672587);
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "bd.mh(" + ')');
      }
   }
}
