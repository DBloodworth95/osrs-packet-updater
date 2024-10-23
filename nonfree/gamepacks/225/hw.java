public class hw extends tr {
   public static ml ac = new ml(64);
   public static boolean au;
   public static final int ag = 1;
   public static final int al = 5;

   static void au(int var0) {
      try {
         if ((12039691 * client.ch & uk.ak.ac(-350930589)) != 0) {
            if (var0 >= 1736396441) {
               throw new IllegalStateException();
            }

            dp.ch = "";
            dp.cf = ok.iy;
            dp.cu = ok.ih;
            dp.cm = ok.iu;
            cw.ao(1, -440615232);
            ev.aq((byte)1);
         } else if ((client.ch * 12039691 & uk.ag.ac(-350930589)) != 0) {
            if (var0 >= 1736396441) {
               throw new IllegalStateException();
            }

            if ((client.ch * 12039691 & uk.al.ac(-350930589)) != 0) {
               if (var0 >= 1736396441) {
                  throw new IllegalStateException();
               }

               dp.cf = ok.ik;
               dp.cu = ok.ib;
               dp.cm = ok.ig;
            } else {
               dp.cf = ok.ir;
               dp.cu = ok.it;
               dp.cm = ok.il;
            }

            dp.ch = ok.ix;
            cw.ao(1, 1260927165);
            ev.aq((byte)1);
         } else if ((client.ch * 12039691 & uk.al.ac(-350930589)) != 0) {
            if (var0 >= 1736396441) {
               throw new IllegalStateException();
            }

            dp.cf = ok.iw;
            dp.cu = ok.iv;
            dp.cm = ok.io;
            dp.ch = ok.ix;
            cw.ao(1, 1902711656);
            ev.aq((byte)1);
         } else {
            ks.ah(false, -1950515420);
         }

      } catch (RuntimeException var1) {
         throw vk.ae(var1, "hw.au(" + ')');
      }
   }

   static final void ja(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      try {
         if (var2 < 1) {
            if (var5 <= -322519812) {
               throw new IllegalStateException();
            }

            var2 = 1;
         }

         if (var3 < 1) {
            if (var5 <= -322519812) {
               throw new IllegalStateException();
            }

            var3 = 1;
         }

         int var6 = var3 - 334;
         int var7;
         if (var6 < 0) {
            var7 = client.uz;
         } else if (var6 >= 100) {
            if (var5 <= -322519812) {
               throw new IllegalStateException();
            }

            var7 = client.uk;
         } else {
            var7 = client.uz + var6 * (client.uk - client.uz) / 100;
         }

         int var8 = 512 * var7 * var3 / (334 * var2);
         int var9;
         int var10;
         short var16;
         if (var8 < client.vf) {
            if (var5 <= -322519812) {
               throw new IllegalStateException();
            }

            var16 = client.vf;
            var7 = var16 * var2 * 334 / (var3 * 512);
            if (var7 > client.va) {
               var7 = client.va;
               var9 = var7 * var3 * 512 / (334 * var16);
               var10 = (var2 - var9) / 2;
               if (var4) {
                  if (var5 <= -322519812) {
                     throw new IllegalStateException();
                  }

                  vr.ec();
                  vr.fr(var0, var1, var10, var3, -16777216);
                  vr.fr(var0 + var2 - var10, var1, var10, var3, -16777216);
               }

               var0 += var10;
               var2 -= 2 * var10;
            }
         } else if (var8 > client.vh) {
            if (var5 <= -322519812) {
               throw new IllegalStateException();
            }

            var16 = client.vh;
            var7 = var2 * var16 * 334 / (512 * var3);
            if (var7 < client.vc) {
               if (var5 <= -322519812) {
                  throw new IllegalStateException();
               }

               var7 = client.vc;
               var9 = 334 * var2 * var16 / (512 * var7);
               var10 = (var3 - var9) / 2;
               if (var4) {
                  vr.ec();
                  vr.fr(var0, var1, var2, var10, -16777216);
                  vr.fr(var0, var3 + var1 - var10, var2, var10, -16777216);
               }

               var1 += var10;
               var3 -= var10 * 2;
            }
         }

         label129: {
            client.vq = 2058201555 * (var7 * var3 / 334);
            if (var2 == -249064015 * client.vb) {
               if (var5 <= -322519812) {
                  throw new IllegalStateException();
               }

               if (client.vg * -1451243729 == var3) {
                  break label129;
               }

               if (var5 <= -322519812) {
                  throw new IllegalStateException();
               }
            }

            int[] var17 = new int[9];

            for(var10 = 0; var10 < var17.length; ++var10) {
               if (var5 <= -322519812) {
                  return;
               }

               int var11 = 32 * var10 + 128 + 15;
               int var12 = 3 * var11 + 600;
               int var14 = jw.am[var11];
               int var13 = en.kp(var12, var3, -1110995275);
               var17[var10] = var14 * var13 >> 16;
            }

            du.js.ae.cu(var17, 500, 800, var2 * 334 / var3, 334);
         }

         client.vz = var0 * 1963704515;
         client.vi = -97892295 * var1;
         client.vb = var2 * -1340763311;
         client.vg = var3 * 1150607311;
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "hw.ja(" + ')');
      }
   }

   hw() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "hw.<init>(" + ')');
      }
   }
}
