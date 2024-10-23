public abstract class gu extends to {
   static gm sm;

   abstract void ac(vf var1, byte var2);

   static void lx(dd var0, va var1, byte var2) {
      try {
         int var3 = var1.ct(-1557870526);
         su var4 = var0.az[var3];
         dd var5 = var4.ar;
         var5.af = var1.ct(-1441983245) * 48040985;
         var5.at = var1.ct(-1744927568) * 1812857617;
         int var6 = 754660757 * var5.ax / 8;
         int var7 = var5.aq * -1090907831 / 8;
         int var8 = var1.ct(-1719883471);
         var1.at(-753401335);

         int var9;
         int var10;
         int var11;
         int var12;
         for(var9 = 0; var9 < 4; ++var9) {
            for(var10 = 0; var10 < var6; ++var10) {
               for(var11 = 0; var11 < var7; ++var11) {
                  if (var2 <= 32) {
                     throw new IllegalStateException();
                  }

                  var12 = var1.au(1, (byte)-115);
                  if (1 == var12) {
                     if (var2 <= 32) {
                        throw new IllegalStateException();
                     }

                     client.jn[var9][var10][var11] = var1.au(26, (byte)-35);
                  } else {
                     client.jn[var9][var10][var11] = -1;
                  }
               }
            }
         }

         var1.ar(-1480783365);
         cb.jg = new int[var8][4];

         for(var9 = 0; var9 < var8; ++var9) {
            if (var2 <= 32) {
               throw new IllegalStateException();
            }

            for(var10 = 0; var10 < 4; ++var10) {
               if (var2 <= 32) {
                  throw new IllegalStateException();
               }

               cb.jg[var9][var10] = var1.cz(-1734056172);
            }
         }

         fq.jo = new int[var8];
         ex.jp = new int[var8];
         rd.ji = new int[var8];
         al.jh = new byte[var8][];
         ey.ja = new byte[var8][];
         var8 = 0;

         for(var9 = 0; var9 < 4; ++var9) {
            if (var2 <= 32) {
               throw new IllegalStateException();
            }

            for(var10 = 0; var10 < var6; ++var10) {
               if (var2 <= 32) {
                  return;
               }

               for(var11 = 0; var11 < var7; ++var11) {
                  if (var2 <= 32) {
                     throw new IllegalStateException();
                  }

                  var12 = client.jn[var9][var10][var11];
                  if (var12 != -1) {
                     if (var2 <= 32) {
                        throw new IllegalStateException();
                     }

                     int var13 = var12 >> 14 & 1023;
                     int var14 = var12 >> 3 & 2047;
                     int var15 = var14 / 8 + (var13 / 8 << 8);

                     int var16;
                     for(var16 = 0; var16 < var8; ++var16) {
                        if (var2 <= 32) {
                           throw new IllegalStateException();
                        }

                        if (fq.jo[var16] == var15) {
                           if (var2 <= 32) {
                              throw new IllegalStateException();
                           }

                           var15 = -1;
                           break;
                        }
                     }

                     if (var15 != -1) {
                        if (var2 <= 32) {
                           throw new IllegalStateException();
                        }

                        fq.jo[var8] = var15;
                        var16 = var15 >> 8 & 255;
                        int var17 = var15 & 255;
                        ex.jp[var8] = qy.ff.cg("m" + var16 + "_" + var17, (short)11547);
                        rd.ji[var8] = qy.ff.cg("l" + var16 + "_" + var17, (short)2943);
                        ++var8;
                     }
                  }
               }
            }
         }

         ry.hp(25, 1331535810);
         client.dv = true;
         ol.jy = var5;
         hl.ks(var5, 2114085767);
      } catch (RuntimeException var18) {
         throw vk.ae(var18, "gu.lx(" + ')');
      }
   }

   abstract void ae(gm var1, int var2);

   abstract void ax(gm var1);

   gu() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "gu.<init>(" + ')');
      }
   }

   abstract void ag(gm var1);

   abstract void aq(gm var1);

   abstract void af(gm var1);

   abstract void at(vf var1);

   static void pg(cw var0, int var1) {
      try {
         if (var0 == as.fx) {
            if (var1 >= -1856457959) {
               throw new IllegalStateException();
            }
         } else {
            as.fx = var0;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gu.pg(" + ')');
      }
   }

   static final ui ac(vf var0, ui var1, int var2) {
      try {
         int var3 = var0.cv(952452697);
         int var4;
         if (var1 == null) {
            if (var2 <= 2051538777) {
               throw new IllegalStateException();
            }

            var4 = at.ax(var3, 936678382);
            var1 = new ui(var4);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            if (var2 <= 2051538777) {
               throw new IllegalStateException();
            }

            boolean var10000;
            if (var0.cv(952452697) == 1) {
               if (var2 <= 2051538777) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var5 = var10000;
            int var6 = var0.cc(-218393352);
            Object var7;
            if (var5) {
               var7 = new ts(var0.cs(330243454));
            } else {
               var7 = new th(var0.cz(-1734056172));
            }

            var1.ae((to)var7, (long)var6);
         }

         return var1;
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "gu.ac(" + ')');
      }
   }

   abstract void am(gm var1);

   static void kq(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      try {
         var1 = 64 + var1 * 128;
         var2 = var2 * 128 + 64;
         var3 = 128 * var3 + 64;
         var4 = var4 * 128 + 64;
         df var15 = new df(var6, var0, var1, var2, he.ki(gs.jj, var1, var2, var0, 1364598893) - var7, var9 + 1472813913 * client.do, 1472813913 * client.do + var10, var11, var12, var13, var5, var8);
         var15.ac(var3, var4, he.ki(gs.jj, var3, var4, var0, 1364598893) - var8, var9 + 1472813913 * client.do, 1731049561);
         gs.jj.ay.ae(var15);
      } catch (RuntimeException var16) {
         throw vk.ae(var16, "gu.kq(" + ')');
      }
   }
}
