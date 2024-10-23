public final class ku {
   int ay;
   int aw;
   int ap;
   public static final int ac = 2;
   int ai;
   int as;
   int aj;
   public jv ae;
   public jv am;
   public long at;
   int au;
   int ak;

   static final void jc(boolean var0, vm var1, int var2) {
      try {
         client.ja = var0;
         int var3;
         int var4;
         int var6;
         int var7;
         int var8;
         if (!client.ja) {
            if (var2 == 16711935) {
               throw new IllegalStateException();
            }

            var1.ey(-1004339763);
            var3 = var1.ev(755062348);
            var4 = var1.ce(1183026976);
            int var5 = var1.ce(1676701026);
            fj.jg = new int[var5][4];

            for(var6 = 0; var6 < var5; ++var6) {
               if (var2 == 16711935) {
                  return;
               }

               for(var7 = 0; var7 < 4; ++var7) {
                  if (var2 == 16711935) {
                     return;
                  }

                  fj.jg[var6][var7] = var1.ch(1203709469);
               }
            }

            kk.jj = new int[var5];
            gn.jd = new int[var5];
            iw.ju = new int[var5];
            oy.jw = new byte[var5][];
            ai.jm = new byte[var5][];
            var5 = 0;

            for(var6 = (var3 - 6) / 8; var6 <= (6 + var3) / 8; ++var6) {
               if (var2 == 16711935) {
                  return;
               }

               for(var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
                  var8 = var7 + (var6 << 8);
                  kk.jj[var5] = var8;
                  gn.jd[var5] = he.fo.cf("m" + var6 + "_" + var7, (byte)82);
                  iw.ju[var5] = he.fo.cf("l" + var6 + "_" + var7, (byte)58);
                  ++var5;
               }
            }

            dx.jb(var3, var4, true, 1280869037);
         } else {
            var3 = var1.eh(-2111069753);
            var4 = var1.eh(-1754445199);
            boolean var10000;
            if (var1.dp((short)-12471) == 1) {
               if (var2 == 16711935) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var17 = var10000;
            var6 = var1.ce(452589730);
            var1.ae(527445275);

            int var9;
            int var10;
            for(var7 = 0; var7 < 4; ++var7) {
               if (var2 == 16711935) {
                  return;
               }

               for(var8 = 0; var8 < 13; ++var8) {
                  if (var2 == 16711935) {
                     throw new IllegalStateException();
                  }

                  for(var9 = 0; var9 < 13; ++var9) {
                     var10 = var1.am(1, -1812657094);
                     if (var10 == 1) {
                        if (var2 == 16711935) {
                           throw new IllegalStateException();
                        }

                        client.jo[var7][var8][var9] = var1.am(26, -1913900052);
                     } else {
                        client.jo[var7][var8][var9] = -1;
                     }
                  }
               }
            }

            var1.at(-1054331827);
            fj.jg = new int[var6][4];

            for(var7 = 0; var7 < var6; ++var7) {
               if (var2 == 16711935) {
                  throw new IllegalStateException();
               }

               for(var8 = 0; var8 < 4; ++var8) {
                  if (var2 == 16711935) {
                     throw new IllegalStateException();
                  }

                  fj.jg[var7][var8] = var1.ch(1203709469);
               }
            }

            kk.jj = new int[var6];
            gn.jd = new int[var6];
            iw.ju = new int[var6];
            oy.jw = new byte[var6][];
            ai.jm = new byte[var6][];
            var6 = 0;

            for(var7 = 0; var7 < 4; ++var7) {
               if (var2 == 16711935) {
                  throw new IllegalStateException();
               }

               for(var8 = 0; var8 < 13; ++var8) {
                  for(var9 = 0; var9 < 13; ++var9) {
                     if (var2 == 16711935) {
                        throw new IllegalStateException();
                     }

                     var10 = client.jo[var7][var8][var9];
                     if (-1 != var10) {
                        if (var2 == 16711935) {
                           throw new IllegalStateException();
                        }

                        int var11 = var10 >> 14 & 1023;
                        int var12 = var10 >> 3 & 2047;
                        int var13 = var12 / 8 + (var11 / 8 << 8);

                        int var14;
                        for(var14 = 0; var14 < var6; ++var14) {
                           if (var2 == 16711935) {
                              return;
                           }

                           if (kk.jj[var14] == var13) {
                              var13 = -1;
                              break;
                           }
                        }

                        if (var13 != -1) {
                           if (var2 == 16711935) {
                              throw new IllegalStateException();
                           }

                           kk.jj[var6] = var13;
                           var14 = var13 >> 8 & 255;
                           int var15 = var13 & 255;
                           gn.jd[var6] = he.fo.cf("m" + var14 + "_" + var15, (byte)111);
                           iw.ju[var6] = he.fo.cf("l" + var14 + "_" + var15, (byte)48);
                           ++var6;
                        }
                     }
                  }
               }
            }

            boolean var10002;
            if (!var17) {
               if (var2 == 16711935) {
                  throw new IllegalStateException();
               }

               var10002 = true;
            } else {
               var10002 = false;
            }

            dx.jb(var4, var3, var10002, 1531052846);
         }

      } catch (RuntimeException var16) {
         throw tm.aw(var16, "ku.jc(" + ')');
      }
   }

   ku() {
      try {
         super();
         this.at = 0L;
         this.au = 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ku.<init>(" + ')');
      }
   }

   public static boolean ai(byte var0) {
      try {
         if (!mp.ae.isEmpty()) {
            if (var0 <= 0) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (!mp.ay.isEmpty()) {
               if (var0 <= 0) {
                  throw new IllegalStateException();
               }

               if (mp.ay.get(0) != null) {
                  if (((no)mp.ay.get(0)).au != null) {
                     return ((no)mp.ay.get(0)).au.af(607108095);
                  }

                  if (var0 <= 0) {
                     throw new IllegalStateException();
                  }
               }
            }

            return false;
         }
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ku.ai(" + ')');
      }
   }
}
