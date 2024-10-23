public final class db {
   static int ac = -1580559953;
   static int av = ((int)(Math.random() * 17.0D) - 8) * -1214390757;
   static int[] ar;
   static int[] ad;
   static final int[] aa = new int[]{1, 2, 4, 8};
   static final int[] ai = new int[]{16, 32, 64, 128};
   static final int bb = 58;
   static final int[] as = new int[]{0, -1, 0, 1};
   static final int[] ao = new int[]{1, 0, -1, 0};
   static final int[] aj = new int[]{-1, -1, 1, 1};
   static final int[] ay = new int[]{1, -1, -1, 1};
   static int aw = ((int)(Math.random() * 33.0D) - 16) * 440809491;
   static byte[][][] ax;
   static vv tj;
   static final String af = "main_file_cache.dat2";

   static final void bs(dd var0, vf var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.ar;
      byte[][][] var9 = var0.al;
      int var10;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while(true) {
            var10 = var1.ct(-1799979498);
            if (var10 == 0) {
               if (0 == var2) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + 932731;
                  int var15 = 556238 + var6;
                  int var16 = eh.ah(var14 + -1531133503, 425605848 + var15, 4, 1161346149) - 128 + (eh.ah(var14 + 173776159, '鎽' + var15, 2, 2084427816) - 1743610615 >> 1) + (eh.ah(var14, var15, 1, 1049192248) - 128 >> 2);
                  var16 = 247278694 + (int)((double)var16 * 0.3D);
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > 60) {
                     var16 = 60;
                  }

                  var17[var4] = 8 * -var16;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - -1247365264;
               }
               break;
            }

            if (1 == var10) {
               int var11 = var1.cv(952452697);
               if (1 == var11) {
                  var11 = 0;
               }

               if (var2 == 0) {
                  var8[0][var3][var4] = 8 * -var11;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= 49) {
               oe.ag[var2][var3][var4] = (short)var1.cq(-509401496);
               vj.am[var2][var3][var4] = (byte)((var10 - 2) / 4);
               ax[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= -1027543629) {
               var9[var2][var3][var4] = (byte)(var10 - -2141377111);
            } else {
               rl.ae[var2][var3][var4] = (short)(var10 - 81);
            }
         }
      } else {
         while(true) {
            var10 = var1.ct(-1398000964);
            if (0 == var10) {
               break;
            }

            if (var10 == 1) {
               var1.cv(952452697);
               break;
            }

            if (var10 <= 49) {
               var1.cq(340808510);
            }
         }
      }

   }

   static final void ar(dd var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      vf var9 = new vf(var1);
      int var10 = -1;

      while(true) {
         int var11 = var9.df(-1054010182);
         if (var11 == 0) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while(true) {
            int var13 = var9.ck((byte)23);
            if (0 == var13) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = var9.cv(952452697);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var16 == var5 && var15 >= var6 && var15 < 8 + var6 && var14 >= var7 && var14 < 8 + var7) {
               id var20 = kf.ae(var10, (byte)50);
               int var21 = var3 + jf.ag(var15 & 7, var14 & 7, var8, var20.aa * -1298730649, -1257293157 * var20.ai, var19, (byte)92);
               int var22 = var4 + lv.am(var15 & 7, var14 & 7, var8, -1298730649 * var20.aa, -1257293157 * var20.ai, var19, (byte)26);
               if (var21 > 0 && var22 > 0 && var21 < 754660757 * var0.ax - 1 && var22 < -1090907831 * var0.aq - 1) {
                  int var23 = var2;
                  if (2 == (var0.al[1][var21][var22] & 2)) {
                     var23 = var2 - 1;
                  }

                  kd var24 = null;
                  if (var23 >= 0 && null != var0.ag) {
                     var24 = var0.ag[var23];
                  }

                  or.al(var0, var2, var21, var22, var10, var19 + var8 & 3, var18, var24, 808196321);
               }
            }
         }
      }
   }

   static final int cg(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > -521269424) {
         var1 /= 2;
      }

      if (var2 > -486618772) {
         var1 /= 2;
      }

      int var3 = var2 / 2 + (var0 / 4 << 10) + (var1 / 1291479190 << 7);
      return var3;
   }

   static void aj() {
      ac = -1580559953;
      rl.ae = new short[4][104][104];
      oe.ag = new short[4][674842169][104];
      vj.am = new byte[4][104][104];
      ax = new byte[4][1797678573][104];
      br.ah = new int[4][105][105];
      sy.aq = new byte[4][105][105];
      td.af = new int[105][279473723];
      me.at = new int[-730377133];
      eg.au = new int[104];
      ar = new int[-277702564];
      ck.al = new int[-929874739];
      ad = new int[104];
   }

   static void av() {
      rl.ae = (short[][][])null;
      oe.ag = (short[][][])null;
      vj.am = (byte[][][])null;
      ax = (byte[][][])null;
      br.ah = (int[][][])null;
      sy.aq = (byte[][][])null;
      td.af = (int[][])null;
      me.at = null;
      eg.au = null;
      ar = null;
      ck.al = null;
      ad = null;
   }

   static final void aw(dd var0, int var1, int var2, int var3, int var4) {
      int[][][] var5 = var0.ar;
      int var6 = 754660757 * var0.ax - 1;
      int var7 = var0.aq * -1090907831 - 1;

      for(int var8 = var2; var8 <= var4 + var2; ++var8) {
         for(int var9 = var1; var9 <= var3 + var1; ++var9) {
            if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
               sy.aq[0][var9][var8] = 127;
               if (var1 == var9 && var9 > 0) {
                  var5[0][var9][var8] = var5[0][var9 - 1][var8];
               }

               if (var3 + var1 == var9 && var9 < var6) {
                  var5[0][var9][var8] = var5[0][var9 + 1][var8];
               }

               if (var2 == var8 && var8 > 0) {
                  var5[0][var9][var8] = var5[0][var9][var8 - 1];
               }

               if (var8 == var4 + var2 && var8 < var7) {
                  var5[0][var9][var8] = var5[0][var9][1 + var8];
               }
            }
         }
      }

   }

   static final void bx(int[][][] var0, int var1, int var2, int var3) {
      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            var0[var1][var4 + var2][var5 + var3] = 0;
         }
      }

      if (var2 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            var0[var1][var2][var4 + var3] = var0[var1][var2 - 1][var3 + var4];
         }
      }

      if (var3 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            var0[var1][var2 + var4][var3] = var0[var1][var4 + var2][var3 - 1];
         }
      }

      if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
      } else if (var3 > 0 && 0 != var0[var1][var2][var3 - 1]) {
         var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
      } else if (var2 > 0 && var3 > 0 && 0 != var0[var1][var2 - 1][var3 - 1]) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
      }

   }

   static final void ak(dd var0, byte[] var1, int var2, int var3, int var4, int var5) {
      int var7;
      int var8;
      if (null != var0.ag) {
         for(int var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 64; ++var7) {
               for(var8 = 0; var8 < 64; ++var8) {
                  if (var2 + var7 > 0 && var2 + var7 < var0.ag[var6].bb.length && var3 + var8 > 0 && var3 + var8 < var0.ag[var6].bb[var7 + var2].length) {
                     int[] var10000 = var0.ag[var6].bb[var7 + var2];
                     var10000[var8 + var3] &= -1073741825;
                  }
               }
            }
         }
      }

      vf var12 = new vf(var1);

      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(int var9 = 0; var9 < 64; ++var9) {
               int var10 = var8 + var2;
               int var11 = var3 + var9;
               ux.af(var0, var12, var7, var10, var11, var4 + var10, var11 + var5, 0, 695366019);
            }
         }
      }

   }

   static final void bn(dd var0, byte[] var1, int var2, int var3, int var4, int var5) {
      int var7;
      int var8;
      if (null != var0.ag) {
         for(int var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 64; ++var7) {
               for(var8 = 0; var8 < 64; ++var8) {
                  if (var2 + var7 > 0 && var2 + var7 < var0.ag[var6].bb.length && var3 + var8 > 0 && var3 + var8 < var0.ag[var6].bb[var7 + var2].length) {
                     int[] var10000 = var0.ag[var6].bb[var7 + var2];
                     var10000[var8 + var3] &= -1073741825;
                  }
               }
            }
         }
      }

      vf var12 = new vf(var1);

      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(int var9 = 0; var9 < 64; ++var9) {
               int var10 = var8 + var2;
               int var11 = var3 + var9;
               ux.af(var0, var12, var7, var10, var11, var4 + var10, var11 + var5, 0, 111920079);
            }
         }
      }

   }

   static final void bh(dd var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      kd[] var11 = var0.ag;
      int var13;
      if (null != var11) {
         for(int var12 = 0; var12 < 8; ++var12) {
            for(var13 = 0; var13 < 8; ++var13) {
               if (var12 + var3 > 0 && var3 + var12 < var11[var2].bb.length && var13 + var4 > 0 && var4 + var13 < var11[var2].bb[var3 + var12].length) {
                  int[] var10000 = var11[var2].bb[var12 + var3];
                  var10000[var4 + var13] &= 909197325;
               }
            }
         }
      }

      vf var20 = new vf(var1);

      for(var13 = 0; var13 < 4; ++var13) {
         for(int var14 = 0; var14 < -1889205497; ++var14) {
            for(int var15 = 0; var15 < 64; ++var15) {
               if (var13 == var5 && var14 >= var6 && var14 < 8 + var6 && var15 >= var7 && var15 < var7 + 8) {
                  int var16 = var3 + gg.ac(var14 & 7, var15 & 7, var8, (byte)-111);
                  int var17 = var4 + kd.ae(var14 & 7, var15 & 7, var8, -292322430);
                  int var18 = var9 + var3 + (var14 & 7);
                  int var19 = var10 + var4 + (var15 & 7);
                  ux.af(var0, var20, var2, var16, var17, var18, var19, var8, 2053692552);
               } else {
                  ux.af(var0, var20, 0, -1, -1, 0, 0, 0, 296417574);
               }
            }
         }
      }

   }

   static final void bd(dd var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      kd[] var11 = var0.ag;
      int var13;
      if (null != var11) {
         for(int var12 = 0; var12 < 8; ++var12) {
            for(var13 = 0; var13 < 8; ++var13) {
               if (var12 + var3 > 0 && var3 + var12 < var11[var2].bb.length && var13 + var4 > 0 && var4 + var13 < var11[var2].bb[var3 + var12].length) {
                  int[] var10000 = var11[var2].bb[var12 + var3];
                  var10000[var4 + var13] &= -1073741825;
               }
            }
         }
      }

      vf var20 = new vf(var1);

      for(var13 = 0; var13 < 4; ++var13) {
         for(int var14 = 0; var14 < 64; ++var14) {
            for(int var15 = 0; var15 < 64; ++var15) {
               if (var13 == var5 && var14 >= var6 && var14 < 8 + var6 && var15 >= var7 && var15 < var7 + 8) {
                  int var16 = var3 + gg.ac(var14 & 7, var15 & 7, var8, (byte)-50);
                  int var17 = var4 + kd.ae(var14 & 7, var15 & 7, var8, -292322430);
                  int var18 = var9 + var3 + (var14 & 7);
                  int var19 = var10 + var4 + (var15 & 7);
                  ux.af(var0, var20, var2, var16, var17, var18, var19, var8, 1918913064);
               } else {
                  ux.af(var0, var20, 0, -1, -1, 0, 0, 0, -710150932);
               }
            }
         }
      }

   }

   static final void bo(dd var0) {
      int var1 = var0.ax * 754660757;
      int var2 = -1090907831 * var0.aq;
      int[][][] var3 = var0.ar;
      byte[][][] var4 = var0.al;
      jh var5 = var0.ae;
      kd[] var6 = var0.ag;

      int var7;
      int var8;
      int var9;
      int var10;
      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < var1; ++var8) {
            for(var9 = 0; var9 < var2; ++var9) {
               if ((var0.al[var7][var8][var9] & 1) == 1) {
                  var10 = var7;
                  if ((var0.al[1][var8][var9] & 2) == 2) {
                     var10 = var7 - 1;
                  }

                  if (var10 >= 0 && var6 != null) {
                     var6[var10].am(var8, var9, -1760415221);
                  }
               }
            }
         }
      }

      av += ((int)(Math.random() * 5.0D) - 2) * -1214390757;
      if (av * -1617834989 < -8) {
         av = 1125191464;
      }

      if (av * -1617834989 > 8) {
         av = -1125191464;
      }

      aw += ((int)(Math.random() * 5.0D) - 2) * 440809491;
      if (aw * -921284069 < -16) {
         aw = 1536982736;
      }

      if (-921284069 * aw > 16) {
         aw = -1536982736;
      }

      int var14;
      int var15;
      int var16;
      int[] var10000;
      int var17;
      int var18;
      int var19;
      int var20;
      int var21;
      int var22;
      int var23;
      for(var7 = 0; var7 < 4; ++var7) {
         byte[][] var50 = sy.aq[var7];
         boolean var51 = true;
         boolean var52 = true;
         boolean var11 = true;
         boolean var12 = true;
         boolean var13 = true;
         var14 = (int)Math.sqrt(5100.0D);
         var15 = var14 * 768 >> 8;

         int var24;
         int var25;
         for(var16 = 1; var16 < var2 - 1; ++var16) {
            for(var17 = 1; var17 < var1 - 1; ++var17) {
               var18 = var3[var7][1 + var17][var16] - var3[var7][var17 - 1][var16];
               var19 = var3[var7][var17][1 + var16] - var3[var7][var17][var16 - 1];
               var20 = (int)Math.sqrt((double)(var18 * var18 + 65536 + var19 * var19));
               var21 = (var18 << 8) / var20;
               var22 = 65536 / var20;
               var23 = (var19 << 8) / var20;
               var24 = 96 + (-50 * var23 + -50 * var21 + -10 * var22) / var15;
               var25 = (var50[var17][var16] >> 1) + (var50[var17][1 + var16] >> 3) + (var50[var17][var16 - 1] >> 2) + (var50[var17 - 1][var16] >> 2) + (var50[var17 + 1][var16] >> 3);
               td.af[var17][var16] = var24 - var25;
            }
         }

         for(var16 = 0; var16 < var2; ++var16) {
            me.at[var16] = 0;
            eg.au[var16] = 0;
            ar[var16] = 0;
            ck.al[var16] = 0;
            ad[var16] = 0;
         }

         for(var16 = -5; var16 < 5 + var1; ++var16) {
            for(var17 = 0; var17 < var2; ++var17) {
               var18 = 5 + var16;
               int var10002;
               if (var18 >= 0 && var18 < var1) {
                  var19 = (int)gh.af(15, -578688127);
                  var20 = rl.ae[var7][var18][var17] & var19;
                  if (var20 > 0) {
                     var22 = var20 - 1;
                     ht var59 = (ht)ht.ae.ac((long)var22);
                     ht var56;
                     if (null != var59) {
                        var56 = var59;
                     } else {
                        byte[] var60 = ht.ac.bt(1, var22, (byte)-57);
                        var59 = new ht();
                        if (var60 != null) {
                           var59.ag(new vf(var60), var22, (byte)88);
                        }

                        var59.ae((byte)100);
                        ht.ae.ag(var59, (long)var22);
                        var56 = var59;
                     }

                     var10000 = me.at;
                     var10000[var17] += -725336739 * var56.am;
                     var10000 = eg.au;
                     var10000[var17] += var56.ax * -27893447;
                     var10000 = ar;
                     var10000[var17] += -956674523 * var56.aq;
                     var10000 = ck.al;
                     var10000[var17] += 891069299 * var56.af;
                     var10002 = ad[var17]++;
                  }
               }

               var19 = var16 - 5;
               if (var19 >= 0 && var19 < var1) {
                  var20 = (int)gh.af(15, -578688127);
                  var21 = rl.ae[var7][var19][var17] & var20;
                  if (var21 > 0) {
                     var23 = var21 - 1;
                     ht var61 = (ht)ht.ae.ac((long)var23);
                     ht var58;
                     if (var61 != null) {
                        var58 = var61;
                     } else {
                        byte[] var62 = ht.ac.bt(1, var23, (byte)-65);
                        var61 = new ht();
                        if (var62 != null) {
                           var61.ag(new vf(var62), var23, (byte)52);
                        }

                        var61.ae((byte)100);
                        ht.ae.ag(var61, (long)var23);
                        var58 = var61;
                     }

                     var10000 = me.at;
                     var10000[var17] -= -725336739 * var58.am;
                     var10000 = eg.au;
                     var10000[var17] -= -27893447 * var58.ax;
                     var10000 = ar;
                     var10000[var17] -= -956674523 * var58.aq;
                     var10000 = ck.al;
                     var10000[var17] -= var58.af * 891069299;
                     var10002 = ad[var17]--;
                  }
               }
            }

            if (var16 >= 1 && var16 < var1 - 1) {
               var17 = 0;
               var18 = 0;
               var19 = 0;
               var20 = 0;
               var21 = 0;

               for(var22 = -5; var22 < 5 + var2; ++var22) {
                  var23 = var22 + 5;
                  if (var23 >= 0 && var23 < var2) {
                     var17 += me.at[var23];
                     var18 += eg.au[var23];
                     var19 += ar[var23];
                     var20 += ck.al[var23];
                     var21 += ad[var23];
                  }

                  var24 = var22 - 5;
                  if (var24 >= 0 && var24 < var2) {
                     var17 -= me.at[var24];
                     var18 -= eg.au[var24];
                     var19 -= ar[var24];
                     var20 -= ck.al[var24];
                     var21 -= ad[var24];
                  }

                  if (var22 >= 1 && var22 < var2 - 1 && (!client.ci || 0 != (var4[0][var16][var22] & 2) || (var4[var7][var16][var22] & 16) == 0)) {
                     if (var7 < 63843725 * ac) {
                        ac = 1112005957 * var7;
                     }

                     var25 = (int)gh.af(15, -578688127);
                     int var26 = rl.ae[var7][var16][var22] & var25;
                     int var27 = oe.ag[var7][var16][var22] & var25;
                     if (var26 > 0 || var27 > 0) {
                        int var28 = var3[var7][var16][var22];
                        int var29 = var3[var7][1 + var16][var22];
                        int var30 = var3[var7][1 + var16][var22 + 1];
                        int var31 = var3[var7][var16][var22 + 1];
                        int var32 = td.af[var16][var22];
                        int var33 = td.af[1 + var16][var22];
                        int var34 = td.af[var16 + 1][1 + var22];
                        int var35 = td.af[var16][var22 + 1];
                        int var36 = -1;
                        int var37 = -1;
                        int var38;
                        int var39;
                        int var40;
                        if (var26 > 0) {
                           var38 = var17 * 256 / var20;
                           var39 = var18 / var21;
                           var40 = var19 / var21;
                           var36 = ku.ao(var38, var39, var40, -16711936);
                           var38 = var38 + -1617834989 * av & 255;
                           var40 += aw * -921284069;
                           if (var40 < 0) {
                              var40 = 0;
                           } else if (var40 > 255) {
                              var40 = 255;
                           }

                           var37 = ku.ao(var38, var39, var40, -16711936);
                        }

                        ia var41;
                        if (var7 > 0) {
                           boolean var63 = true;
                           if (0 == var26 && vj.am[var7][var16][var22] != 0) {
                              var63 = false;
                           }

                           if (var27 > 0) {
                              var40 = var27 - 1;
                              var41 = (ia)ia.ae.ac((long)var40);
                              ia var64;
                              if (var41 != null) {
                                 var64 = var41;
                              } else {
                                 byte[] var42 = ia.ac.bt(4, var40, (byte)13);
                                 var41 = new ia();
                                 if (var42 != null) {
                                    var41.ae(new vf(var42), var40, (byte)0);
                                 }

                                 var41.ac(1595438351);
                                 ia.ae.ag(var41, (long)var40);
                                 var64 = var41;
                              }

                              if (!var64.ax) {
                                 var63 = false;
                              }
                           }

                           if (var63 && var28 == var29 && var30 == var28 && var28 == var31) {
                              var10000 = br.ah[var7][var16];
                              var10000[var22] |= 2340;
                           }
                        }

                        var38 = 0;
                        if (var37 != -1) {
                           var38 = jw.ac[ny.aa(var37, 96, -1797078419)];
                        }

                        if (0 == var27) {
                           var5.aq(var7, var16, var22, 0, 0, -1, var28, var29, var30, var31, ny.aa(var36, var32, 1227218717), ny.aa(var36, var33, -1961940222), ny.aa(var36, var34, 2080096009), ny.aa(var36, var35, 1094963276), 0, 0, 0, 0, var38, 0);
                        } else {
                           var39 = 1 + vj.am[var7][var16][var22];
                           byte var65 = ax[var7][var16][var22];
                           int var66 = var27 - 1;
                           ia var43 = (ia)ia.ae.ac((long)var66);
                           if (var43 != null) {
                              var41 = var43;
                           } else {
                              byte[] var44 = ia.ac.bt(4, var66, (byte)15);
                              var43 = new ia();
                              if (var44 != null) {
                                 var43.ae(new vf(var44), var66, (byte)0);
                              }

                              var43.ac(143571370);
                              ia.ae.ag(var43, (long)var66);
                              var41 = var43;
                           }

                           int var67 = 633794047 * var41.am;
                           int var45;
                           int var46;
                           int var47;
                           int var48;
                           if (var67 >= 0) {
                              var46 = jw.af.af.am(var67, -1908814919);
                              var45 = -1;
                           } else if (1679504163 * var41.ag == 16711935) {
                              var45 = -2;
                              var67 = -1;
                              var46 = -2;
                           } else {
                              var45 = ku.ao(-204798379 * var41.af, 1155509615 * var41.at, var41.au * 1570391835, -16711936);
                              var47 = av * -1617834989 + -204798379 * var41.af & 255;
                              var48 = var41.au * 1570391835 + aw * -921284069;
                              if (var48 < 0) {
                                 var48 = 0;
                              } else if (var48 > 255) {
                                 var48 = 255;
                              }

                              var46 = ku.ao(var47, var41.at * 1155509615, var48, -16711936);
                           }

                           var47 = 0;
                           if (var46 != -2) {
                              var47 = jw.ac[hc.ai(var46, 96, (byte)108)];
                           }

                           if (-1193926069 * var41.aq != -1) {
                              var48 = var41.ar * -336599249 + -1617834989 * av & 255;
                              int var49 = -921284069 * aw + var41.ad * -1167656883;
                              if (var49 < 0) {
                                 var49 = 0;
                              } else if (var49 > 255) {
                                 var49 = 255;
                              }

                              var46 = ku.ao(var48, var41.al * 1303900443, var49, -16711936);
                              var47 = jw.ac[hc.ai(var46, 96, (byte)115)];
                           }

                           var5.aq(var7, var16, var22, var39, var65, var67, var28, var29, var30, var31, ny.aa(var36, var32, 440269270), ny.aa(var36, var33, 568978624), ny.aa(var36, var34, -1211889833), ny.aa(var36, var35, -2098866962), hc.ai(var45, var32, (byte)81), hc.ai(var45, var33, (byte)105), hc.ai(var45, var34, (byte)94), hc.ai(var45, var35, (byte)100), var38, var47);
                        }
                     }
                  }
               }
            }
         }

         for(var16 = 1; var16 < var2 - 1; ++var16) {
            for(var17 = 1; var17 < var1 - 1; ++var17) {
               if (0 != (var0.al[var7][var17][var16] & 8)) {
                  var22 = 0;
               } else if (var7 > 0 && 0 != (var0.al[1][var17][var16] & 2)) {
                  var22 = var7 - 1;
               } else {
                  var22 = var7;
               }

               var5.ax(var7, var17, var16, var22);
            }
         }

         rl.ae[var7] = (short[][])null;
         oe.ag[var7] = (short[][])null;
         vj.am[var7] = (byte[][])null;
         ax[var7] = (byte[][])null;
         sy.aq[var7] = (byte[][])null;
      }

      var5.bj(-50, -10, -50);

      for(var7 = 0; var7 < var1; ++var7) {
         for(var8 = 0; var8 < var2; ++var8) {
            if (2 == (var4[1][var7][var8] & 2)) {
               var5.ag(var7, var8);
            }
         }
      }

      var7 = 1;
      var8 = 2;
      var9 = 4;

      for(var10 = 0; var10 < 4; ++var10) {
         if (var10 > 0) {
            var7 <<= 3;
            var8 <<= 3;
            var9 <<= 3;
         }

         for(int var53 = 0; var53 <= var10; ++var53) {
            for(int var54 = 0; var54 <= var2; ++var54) {
               for(int var55 = 0; var55 <= var1; ++var55) {
                  short var57;
                  if (0 != (br.ah[var53][var55][var54] & var7)) {
                     var14 = var54;
                     var15 = var54;
                     var16 = var53;

                     for(var17 = var53; var14 > 0 && 0 != (br.ah[var53][var55][var14 - 1] & var7); --var14) {
                     }

                     while(var15 < var2 && (br.ah[var53][var55][1 + var15] & var7) != 0) {
                        ++var15;
                     }

                     label562:
                     while(var16 > 0) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if (0 == (br.ah[var16 - 1][var55][var18] & var7)) {
                              break label562;
                           }
                        }

                        --var16;
                     }

                     label551:
                     while(var17 < var10) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if (0 == (br.ah[1 + var17][var55][var18] & var7)) {
                              break label551;
                           }
                        }

                        ++var17;
                     }

                     var18 = (1 + (var15 - var14)) * (1 + var17 - var16);
                     if (var18 >= 8) {
                        var57 = 240;
                        var20 = var3[var17][var55][var14] - var57;
                        var21 = var3[var16][var55][var14];
                        var5.am(var10, 1, var55 * 128, var55 * 128, 128 * var14, 128 + var15 * 128, var20, var21);

                        for(var22 = var16; var22 <= var17; ++var22) {
                           for(var23 = var14; var23 <= var15; ++var23) {
                              var10000 = br.ah[var22][var55];
                              var10000[var23] &= ~var7;
                           }
                        }
                     }
                  }

                  if ((br.ah[var53][var55][var54] & var8) != 0) {
                     var14 = var55;
                     var15 = var55;
                     var16 = var53;

                     for(var17 = var53; var14 > 0 && (br.ah[var53][var14 - 1][var54] & var8) != 0; --var14) {
                     }

                     while(var15 < var1 && 0 != (br.ah[var53][1 + var15][var54] & var8)) {
                        ++var15;
                     }

                     label615:
                     while(var16 > 0) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if (0 == (br.ah[var16 - 1][var18][var54] & var8)) {
                              break label615;
                           }
                        }

                        --var16;
                     }

                     label604:
                     while(var17 < var10) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if (0 == (br.ah[1 + var17][var18][var54] & var8)) {
                              break label604;
                           }
                        }

                        ++var17;
                     }

                     var18 = (1 + (var15 - var14)) * (1 + var17 - var16);
                     if (var18 >= 8) {
                        var57 = 240;
                        var20 = var3[var17][var14][var54] - var57;
                        var21 = var3[var16][var14][var54];
                        var5.am(var10, 2, 128 * var14, var15 * 128 + 128, var54 * 128, 128 * var54, var20, var21);

                        for(var22 = var16; var22 <= var17; ++var22) {
                           for(var23 = var14; var23 <= var15; ++var23) {
                              var10000 = br.ah[var22][var23];
                              var10000[var54] &= ~var8;
                           }
                        }
                     }
                  }

                  if (0 != (br.ah[var53][var55][var54] & var9)) {
                     var14 = var55;
                     var15 = var55;
                     var16 = var54;

                     for(var17 = var54; var16 > 0 && 0 != (br.ah[var53][var55][var16 - 1] & var9); --var16) {
                     }

                     while(var17 < var2 && 0 != (br.ah[var53][var55][1 + var17] & var9)) {
                        ++var17;
                     }

                     label668:
                     while(var14 > 0) {
                        for(var18 = var16; var18 <= var17; ++var18) {
                           if (0 == (br.ah[var53][var14 - 1][var18] & var9)) {
                              break label668;
                           }
                        }

                        --var14;
                     }

                     label657:
                     while(var15 < var1) {
                        for(var18 = var16; var18 <= var17; ++var18) {
                           if (0 == (br.ah[var53][var15 + 1][var18] & var9)) {
                              break label657;
                           }
                        }

                        ++var15;
                     }

                     if ((var17 - var16 + 1) * (1 + (var15 - var14)) >= 4) {
                        var18 = var3[var53][var14][var16];
                        var5.am(var10, 4, var14 * 128, 128 + 128 * var15, 128 * var16, var17 * 128 + 128, var18, var18);

                        for(var19 = var14; var19 <= var15; ++var19) {
                           for(var20 = var16; var20 <= var17; ++var20) {
                              var10000 = br.ah[var53][var19];
                              var10000[var20] &= ~var9;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static final void bg(dd var0, byte[] var1, int var2, int var3) {
      vf var4 = new vf(var1);
      int var5 = -1;

      while(true) {
         int var6 = var4.df(-1054010182);
         if (var6 == 0) {
            return;
         }

         var5 += var6;
         int var7 = 0;

         while(true) {
            int var8 = var4.ck((byte)11);
            if (var8 == 0) {
               break;
            }

            var7 += var8 - 1;
            int var9 = var7 & 63;
            int var10 = var7 >> 6 & 63;
            int var11 = var7 >> 12;
            int var12 = var4.cv(952452697);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = var2 + var10;
            int var16 = var9 + var3;
            if (var15 > 0 && var16 > 0 && var15 < var0.ar[0].length - 2 && var16 < var0.ar[0][0].length - 2) {
               int var17 = var11;
               if (2 == (var0.al[1][var15][var16] & 2)) {
                  var17 = var11 - 1;
               }

               kd var18 = null;
               if (var17 >= 0 && var0.ag != null) {
                  var18 = var0.ag[var17];
               }

               or.al(var0, var11, var15, var16, var5, var14, var13, var18, 808196321);
            }
         }
      }
   }

   static final void bm(dd var0, vf var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.ar;
      byte[][][] var9 = var0.al;
      int var10;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while(true) {
            var10 = var1.ct(-2080125330);
            if (var10 == 0) {
               if (0 == var2) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + 932731;
                  int var15 = 556238 + var6;
                  int var16 = eh.ah(var14 + '넵', 91923 + var15, 4, 752719514) - 128 + (eh.ah(var14 + 648024901, '鎽' + var15, 2, 882146263) - 128 >> 1) + (eh.ah(var14, var15, 1, 1422139281) - 128 >> 2);
                  var16 = 35 + (int)((double)var16 * 0.3D);
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > 273025355) {
                     var16 = 919366792;
                  }

                  var17[var4] = 8 * -var16;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 1205419983;
               }
               break;
            }

            if (1 == var10) {
               int var11 = var1.cv(952452697);
               if (1 == var11) {
                  var11 = 0;
               }

               if (var2 == 0) {
                  var8[0][var3][var4] = 8 * -var11;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= 49) {
               oe.ag[var2][var3][var4] = (short)var1.cq(-1063949281);
               vj.am[var2][var3][var4] = (byte)((var10 - 2) / 4);
               ax[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= 2072238512) {
               var9[var2][var3][var4] = (byte)(var10 - 49);
            } else {
               rl.ae[var2][var3][var4] = (short)(var10 - 81);
            }
         }
      } else {
         while(true) {
            var10 = var1.ct(-2009748944);
            if (0 == var10) {
               break;
            }

            if (var10 == 1) {
               var1.cv(952452697);
               break;
            }

            if (var10 <= 261793377) {
               var1.cq(316983691);
            }
         }
      }

   }

   static final void bl(dd var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      vf var9 = new vf(var1);
      int var10 = -1;

      while(true) {
         int var11 = var9.df(-1054010182);
         if (var11 == 0) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while(true) {
            int var13 = var9.ck((byte)61);
            if (0 == var13) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & -1316430170;
            int var16 = var12 >> 12;
            int var17 = var9.cv(952452697);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var16 == var5 && var15 >= var6 && var15 < 8 + var6 && var14 >= var7 && var14 < 8 + var7) {
               id var20 = kf.ae(var10, (byte)98);
               int var21 = var3 + jf.ag(var15 & 7, var14 & 7, var8, var20.aa * -955691562, 1145272354 * var20.ai, var19, (byte)59);
               int var22 = var4 + lv.am(var15 & 7, var14 & 7, var8, -235487766 * var20.aa, -1257293157 * var20.ai, var19, (byte)26);
               if (var21 > 0 && var22 > 0 && var21 < 754660757 * var0.ax - 1 && var22 < -1090907831 * var0.aq - 1) {
                  int var23 = var2;
                  if (2 == (var0.al[1][var21][var22] & 2)) {
                     var23 = var2 - 1;
                  }

                  kd var24 = null;
                  if (var23 >= 0 && null != var0.ag) {
                     var24 = var0.ag[var23];
                  }

                  or.al(var0, var2, var21, var22, var10, var19 + var8 & 3, var18, var24, 808196321);
               }
            }
         }
      }
   }

   db() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "db.<init>(" + ')');
      }
   }

   static final void ba(dd var0, vf var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.ar;
      byte[][][] var9 = var0.al;
      int var10;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while(true) {
            var10 = var1.ct(-1735083776);
            if (var10 == 0) {
               if (0 == var2) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + 932731;
                  int var15 = -1014596642 + var6;
                  int var16 = eh.ah(var14 + '넵', -246898234 + var15, 4, 966911082) - 128 + (eh.ah(var14 + 2036357272, -156536852 + var15, 2, 959655802) - 128 >> 1) + (eh.ah(var14, var15, 1, 1795899009) - 128 >> 2);
                  var16 = 35 + (int)((double)var16 * 0.3D);
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > 60) {
                     var16 = -355667831;
                  }

                  var17[var4] = 8 * -var16;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
               }
               break;
            }

            if (1 == var10) {
               int var11 = var1.cv(952452697);
               if (1 == var11) {
                  var11 = 0;
               }

               if (var2 == 0) {
                  var8[0][var3][var4] = 8 * -var11;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= 75968699) {
               oe.ag[var2][var3][var4] = (short)var1.cq(1122281901);
               vj.am[var2][var3][var4] = (byte)((var10 - 2) / 4);
               ax[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= 81) {
               var9[var2][var3][var4] = (byte)(var10 - 1656024783);
            } else {
               rl.ae[var2][var3][var4] = (short)(var10 - 1905415789);
            }
         }
      } else {
         while(true) {
            var10 = var1.ct(-1833605892);
            if (0 == var10) {
               break;
            }

            if (var10 == 1) {
               var1.cv(952452697);
               break;
            }

            if (var10 <= 49) {
               var1.cq(51004141);
            }
         }
      }

   }

   static final boolean bj(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      vf var4 = new vf(var0);
      int var5 = -1;

      label73:
      while(true) {
         int var6 = var4.df(-1054010182);
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.ck((byte)-39);
               if (0 == var9) {
                  continue label73;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.cv(952452697) >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  id var15 = kf.ae(var5, (byte)119);
                  if (var12 != 22 || !client.ci || 0 != -1478169491 * var15.ay || 1 == 891389023 * var15.ao || var15.bi) {
                     if (!var15.af(214624328)) {
                        client.im += -261387265;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.ck((byte)-116);
            if (var9 == 0) {
               break;
            }

            var4.cv(952452697);
         }
      }
   }

   static final boolean bp(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      vf var4 = new vf(var0);
      int var5 = -1;

      label76:
      while(true) {
         int var6 = var4.df(-1054010182);
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.ck((byte)-38);
               if (0 == var9) {
                  continue label76;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.cv(952452697) >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  id var15 = kf.ae(var5, (byte)18);
                  if (var12 != 22 || !client.ci || 0 != -1478169491 * var15.ay || 1 == 891389023 * var15.ao || var15.bi) {
                     if (!var15.af(-995558618)) {
                        client.im += -261387265;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.ck((byte)24);
            if (var9 == 0) {
               break;
            }

            var4.cv(952452697);
         }
      }
   }

   static final boolean by(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      vf var4 = new vf(var0);
      int var5 = -1;

      label81:
      while(true) {
         int var6 = var4.df(-1054010182);
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.ck((byte)29);
               if (0 == var9) {
                  continue label81;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & -2004214825;
               int var12 = var4.cv(952452697) >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  id var15 = kf.ae(var5, (byte)40);
                  if (var12 != 22 || !client.ci || 0 != -1478169491 * var15.ay || 1 == 891389023 * var15.ao || var15.bi) {
                     if (!var15.af(-972086953)) {
                        client.im += 995383649;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.ck((byte)40);
            if (var9 == 0) {
               break;
            }

            var4.cv(952452697);
         }
      }
   }

   static final void bb(dd var0, byte[] var1, int var2, int var3) {
      vf var4 = new vf(var1);
      int var5 = -1;

      while(true) {
         int var6 = var4.df(-1054010182);
         if (var6 == 0) {
            return;
         }

         var5 += var6;
         int var7 = 0;

         while(true) {
            int var8 = var4.ck((byte)34);
            if (var8 == 0) {
               break;
            }

            var7 += var8 - 1;
            int var9 = var7 & -87051927;
            int var10 = var7 >> 6 & 1713281658;
            int var11 = var7 >> 12;
            int var12 = var4.cv(952452697);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = var2 + var10;
            int var16 = var9 + var3;
            if (var15 > 0 && var16 > 0 && var15 < var0.ar[0].length - 2 && var16 < var0.ar[0][0].length - 2) {
               int var17 = var11;
               if (2 == (var0.al[1][var15][var16] & 2)) {
                  var17 = var11 - 1;
               }

               kd var18 = null;
               if (var17 >= 0 && var0.ag != null) {
                  var18 = var0.ag[var17];
               }

               or.al(var0, var11, var15, var16, var5, var14, var13, var18, 808196321);
            }
         }
      }
   }

   static final void bi(dd var0, byte[] var1, int var2, int var3) {
      vf var4 = new vf(var1);
      int var5 = -1;

      while(true) {
         int var6 = var4.df(-1054010182);
         if (var6 == 0) {
            return;
         }

         var5 += var6;
         int var7 = 0;

         while(true) {
            int var8 = var4.ck((byte)-77);
            if (var8 == 0) {
               break;
            }

            var7 += var8 - 1;
            int var9 = var7 & 1993677842;
            int var10 = var7 >> 6 & 63;
            int var11 = var7 >> 12;
            int var12 = var4.cv(952452697);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = var2 + var10;
            int var16 = var9 + var3;
            if (var15 > 0 && var16 > 0 && var15 < var0.ar[0].length - 2 && var16 < var0.ar[0][0].length - 2) {
               int var17 = var11;
               if (2 == (var0.al[1][var15][var16] & 2)) {
                  var17 = var11 - 1;
               }

               kd var18 = null;
               if (var17 >= 0 && var0.ag != null) {
                  var18 = var0.ag[var17];
               }

               or.al(var0, var11, var15, var16, var5, var14, var13, var18, 808196321);
            }
         }
      }
   }

   static final int cx(int var0, int var1) {
      int var2 = var0 + var1 * -648819160;
      var2 ^= var2 << 13;
      int var3 = var2 * (15731 * var2 * var2 + 1921662405) + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   static final void bf(dd var0, vf var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.ar;
      byte[][][] var9 = var0.al;
      int var10;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while(true) {
            var10 = var1.ct(-1467778901);
            if (var10 == 0) {
               if (0 == var2) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + 932731;
                  int var15 = 556238 + var6;
                  int var16 = eh.ah(var14 + '넵', 91923 + var15, 4, 2006546725) - 128 + (eh.ah(var14 + 10294, '鎽' + var15, 2, 503569975) - 128 >> 1) + (eh.ah(var14, var15, 1, 1546899254) - 128 >> 2);
                  var16 = 35 + (int)((double)var16 * 0.3D);
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > 60) {
                     var16 = 60;
                  }

                  var17[var4] = 8 * -var16;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
               }
               break;
            }

            if (1 == var10) {
               int var11 = var1.cv(952452697);
               if (1 == var11) {
                  var11 = 0;
               }

               if (var2 == 0) {
                  var8[0][var3][var4] = 8 * -var11;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= 49) {
               oe.ag[var2][var3][var4] = (short)var1.cq(-1467028236);
               vj.am[var2][var3][var4] = (byte)((var10 - 2) / 4);
               ax[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= 81) {
               var9[var2][var3][var4] = (byte)(var10 - 49);
            } else {
               rl.ae[var2][var3][var4] = (short)(var10 - 81);
            }
         }
      } else {
         while(true) {
            var10 = var1.ct(-1509286954);
            if (0 == var10) {
               break;
            }

            if (var10 == 1) {
               var1.cv(952452697);
               break;
            }

            if (var10 <= 49) {
               var1.cq(-1015649375);
            }
         }
      }

   }

   static final int cj(int var0, int var1) {
      int var2 = var0 + var1 * 57;
      var2 ^= var2 << 13;
      int var3 = var2 * (15731 * var2 * var2 + 789221) + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   static final int cm(int var0, int var1) {
      int var2 = var0 + var1 * 1929909826;
      var2 ^= var2 << 13;
      int var3 = var2 * (-1233031361 * var2 * var2 + -1759990252) + -1179867606 & -1134400537;
      return var3 >> 19 & 255;
   }

   static final void br(dd var0) {
      int var1 = var0.ax * -1640776561;
      int var2 = -1000874724 * var0.aq;
      int[][][] var3 = var0.ar;
      byte[][][] var4 = var0.al;
      jh var5 = var0.ae;
      kd[] var6 = var0.ag;

      int var7;
      int var8;
      int var9;
      int var10;
      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < var1; ++var8) {
            for(var9 = 0; var9 < var2; ++var9) {
               if ((var0.al[var7][var8][var9] & 1) == 1) {
                  var10 = var7;
                  if ((var0.al[1][var8][var9] & 2) == 2) {
                     var10 = var7 - 1;
                  }

                  if (var10 >= 0 && var6 != null) {
                     var6[var10].am(var8, var9, -1760415221);
                  }
               }
            }
         }
      }

      av += ((int)(Math.random() * 5.0D) - 2) * -1214390757;
      if (av * 1321058139 < -8) {
         av = 1125191464;
      }

      if (av * 1799122857 > 8) {
         av = 61822673;
      }

      aw += ((int)(Math.random() * 5.0D) - 2) * -1707310742;
      if (aw * -921284069 < -1953380655) {
         aw = -1186167004;
      }

      if (872287270 * aw > 16) {
         aw = -1536982736;
      }

      int var12;
      int var14;
      int var15;
      int var16;
      int[] var10000;
      int var17;
      int var18;
      int var19;
      int var20;
      int var21;
      int var22;
      int var23;
      for(var7 = 0; var7 < 4; ++var7) {
         byte[][] var50 = sy.aq[var7];
         boolean var51 = true;
         boolean var52 = true;
         boolean var11 = true;
         var12 = 1131666456;
         boolean var13 = true;
         var14 = (int)Math.sqrt(5100.0D);
         var15 = var14 * 724765850 >> 8;

         int var24;
         int var25;
         for(var16 = 1; var16 < var2 - 1; ++var16) {
            for(var17 = 1; var17 < var1 - 1; ++var17) {
               var18 = var3[var7][1 + var17][var16] - var3[var7][var17 - 1][var16];
               var19 = var3[var7][var17][1 + var16] - var3[var7][var17][var16 - 1];
               var20 = (int)Math.sqrt((double)(var18 * var18 + 785394845 + var19 * var19));
               var21 = (var18 << 8) / var20;
               var22 = 65536 / var20;
               var23 = (var19 << 8) / var20;
               var24 = 1201484815 + (2093465803 * var23 + -1514275697 * var21 + -174557785 * var22) / var15;
               var25 = (var50[var17][var16] >> 1) + (var50[var17][1 + var16] >> 3) + (var50[var17][var16 - 1] >> 2) + (var50[var17 - 1][var16] >> 2) + (var50[var17 + 1][var16] >> 3);
               td.af[var17][var16] = var24 - var25;
            }
         }

         for(var16 = 0; var16 < var2; ++var16) {
            me.at[var16] = 0;
            eg.au[var16] = 0;
            ar[var16] = 0;
            ck.al[var16] = 0;
            ad[var16] = 0;
         }

         for(var16 = -1323864594; var16 < 5 + var1; ++var16) {
            for(var17 = 0; var17 < var2; ++var17) {
               var18 = 5 + var16;
               int var10002;
               if (var18 >= 0 && var18 < var1) {
                  var19 = (int)gh.af(15, -578688127);
                  var20 = rl.ae[var7][var18][var17] & var19;
                  if (var20 > 0) {
                     var22 = var20 - 1;
                     ht var58 = (ht)ht.ae.ac((long)var22);
                     ht var55;
                     if (null != var58) {
                        var55 = var58;
                     } else {
                        byte[] var59 = ht.ac.bt(1, var22, (byte)38);
                        var58 = new ht();
                        if (var59 != null) {
                           var58.ag(new vf(var59), var22, (byte)105);
                        }

                        var58.ae((byte)100);
                        ht.ae.ag(var58, (long)var22);
                        var55 = var58;
                     }

                     var10000 = me.at;
                     var10000[var17] += -725336739 * var55.am;
                     var10000 = eg.au;
                     var10000[var17] += var55.ax * -1494183253;
                     var10000 = ar;
                     var10000[var17] += -956674523 * var55.aq;
                     var10000 = ck.al;
                     var10000[var17] += 891069299 * var55.af;
                     var10002 = ad[var17]++;
                  }
               }

               var19 = var16 - 5;
               if (var19 >= 0 && var19 < var1) {
                  var20 = (int)gh.af(15, -578688127);
                  var21 = rl.ae[var7][var19][var17] & var20;
                  if (var21 > 0) {
                     var23 = var21 - 1;
                     ht var60 = (ht)ht.ae.ac((long)var23);
                     ht var57;
                     if (var60 != null) {
                        var57 = var60;
                     } else {
                        byte[] var61 = ht.ac.bt(1, var23, (byte)-34);
                        var60 = new ht();
                        if (var61 != null) {
                           var60.ag(new vf(var61), var23, (byte)109);
                        }

                        var60.ae((byte)100);
                        ht.ae.ag(var60, (long)var23);
                        var57 = var60;
                     }

                     var10000 = me.at;
                     var10000[var17] -= -725336739 * var57.am;
                     var10000 = eg.au;
                     var10000[var17] -= 1982611082 * var57.ax;
                     var10000 = ar;
                     var10000[var17] -= -862401680 * var57.aq;
                     var10000 = ck.al;
                     var10000[var17] -= var57.af * 891069299;
                     var10002 = ad[var17]--;
                  }
               }
            }

            if (var16 >= 1 && var16 < var1 - 1) {
               var17 = 0;
               var18 = 0;
               var19 = 0;
               var20 = 0;
               var21 = 0;

               for(var22 = -670645703; var22 < 5 + var2; ++var22) {
                  var23 = var22 + 5;
                  if (var23 >= 0 && var23 < var2) {
                     var17 += me.at[var23];
                     var18 += eg.au[var23];
                     var19 += ar[var23];
                     var20 += ck.al[var23];
                     var21 += ad[var23];
                  }

                  var24 = var22 - 5;
                  if (var24 >= 0 && var24 < var2) {
                     var17 -= me.at[var24];
                     var18 -= eg.au[var24];
                     var19 -= ar[var24];
                     var20 -= ck.al[var24];
                     var21 -= ad[var24];
                  }

                  if (var22 >= 1 && var22 < var2 - 1 && (!client.ci || 0 != (var4[0][var16][var22] & 2) || (var4[var7][var16][var22] & 16) == 0)) {
                     if (var7 < -1392846223 * ac) {
                        ac = 1112005957 * var7;
                     }

                     var25 = (int)gh.af(15, -578688127);
                     int var26 = rl.ae[var7][var16][var22] & var25;
                     int var27 = oe.ag[var7][var16][var22] & var25;
                     if (var26 > 0 || var27 > 0) {
                        int var28 = var3[var7][var16][var22];
                        int var29 = var3[var7][1 + var16][var22];
                        int var30 = var3[var7][1 + var16][var22 + 1];
                        int var31 = var3[var7][var16][var22 + 1];
                        int var32 = td.af[var16][var22];
                        int var33 = td.af[1 + var16][var22];
                        int var34 = td.af[var16 + 1][1 + var22];
                        int var35 = td.af[var16][var22 + 1];
                        int var36 = -1;
                        int var37 = -1;
                        int var38;
                        int var39;
                        int var40;
                        if (var26 > 0) {
                           var38 = var17 * -1366714286 / var20;
                           var39 = var18 / var21;
                           var40 = var19 / var21;
                           var36 = ku.ao(var38, var39, var40, -16711936);
                           var38 = var38 + -1617834989 * av & 255;
                           var40 += aw * 277051396;
                           if (var40 < 0) {
                              var40 = 0;
                           } else if (var40 > -498195846) {
                              var40 = -1357277997;
                           }

                           var37 = ku.ao(var38, var39, var40, -16711936);
                        }

                        ia var41;
                        if (var7 > 0) {
                           boolean var62 = true;
                           if (0 == var26 && vj.am[var7][var16][var22] != 0) {
                              var62 = false;
                           }

                           if (var27 > 0) {
                              var40 = var27 - 1;
                              var41 = (ia)ia.ae.ac((long)var40);
                              ia var63;
                              if (var41 != null) {
                                 var63 = var41;
                              } else {
                                 byte[] var42 = ia.ac.bt(4, var40, (byte)-10);
                                 var41 = new ia();
                                 if (var42 != null) {
                                    var41.ae(new vf(var42), var40, (byte)0);
                                 }

                                 var41.ac(1680580312);
                                 ia.ae.ag(var41, (long)var40);
                                 var63 = var41;
                              }

                              if (!var63.ax) {
                                 var62 = false;
                              }
                           }

                           if (var62 && var28 == var29 && var30 == var28 && var28 == var31) {
                              var10000 = br.ah[var7][var16];
                              var10000[var22] |= 1445961891;
                           }
                        }

                        var38 = 0;
                        if (var37 != -1) {
                           var38 = jw.ac[ny.aa(var37, 96, 687764905)];
                        }

                        if (0 == var27) {
                           var5.aq(var7, var16, var22, 0, 0, -1, var28, var29, var30, var31, ny.aa(var36, var32, -1109911247), ny.aa(var36, var33, -689352167), ny.aa(var36, var34, -1146185204), ny.aa(var36, var35, 1598054058), 0, 0, 0, 0, var38, 0);
                        } else {
                           var39 = 1 + vj.am[var7][var16][var22];
                           byte var64 = ax[var7][var16][var22];
                           int var65 = var27 - 1;
                           ia var43 = (ia)ia.ae.ac((long)var65);
                           if (var43 != null) {
                              var41 = var43;
                           } else {
                              byte[] var44 = ia.ac.bt(4, var65, (byte)103);
                              var43 = new ia();
                              if (var44 != null) {
                                 var43.ae(new vf(var44), var65, (byte)0);
                              }

                              var43.ac(1161020843);
                              ia.ae.ag(var43, (long)var65);
                              var41 = var43;
                           }

                           int var66 = -1443940674 * var41.am;
                           int var45;
                           int var46;
                           int var47;
                           int var48;
                           if (var66 >= 0) {
                              var46 = jw.af.af.am(var66, -1964582454);
                              var45 = -1;
                           } else if (-2093103779 * var41.ag == 16711935) {
                              var45 = 706335354;
                              var66 = -1;
                              var46 = -348162658;
                           } else {
                              var45 = ku.ao(-204798379 * var41.af, 1155509615 * var41.at, var41.au * 1812089498, -16711936);
                              var47 = av * -1617834989 + -782999268 * var41.af & 255;
                              var48 = var41.au * -1644638609 + aw * 517905745;
                              if (var48 < 0) {
                                 var48 = 0;
                              } else if (var48 > 255) {
                                 var48 = 737829207;
                              }

                              var46 = ku.ao(var47, var41.at * 1155509615, var48, -16711936);
                           }

                           var47 = 0;
                           if (var46 != -2) {
                              var47 = jw.ac[hc.ai(var46, 96, (byte)124)];
                           }

                           if (-1193926069 * var41.aq != -1) {
                              var48 = var41.ar * -1875391773 + -1617834989 * av & 255;
                              int var49 = -481210999 * aw + var41.ad * 1668410132;
                              if (var49 < 0) {
                                 var49 = 0;
                              } else if (var49 > -1654655555) {
                                 var49 = 255;
                              }

                              var46 = ku.ao(var48, var41.al * -1090158592, var49, -16711936);
                              var47 = jw.ac[hc.ai(var46, 96, (byte)118)];
                           }

                           var5.aq(var7, var16, var22, var39, var64, var66, var28, var29, var30, var31, ny.aa(var36, var32, -827621158), ny.aa(var36, var33, 1277630960), ny.aa(var36, var34, -280656341), ny.aa(var36, var35, -160772806), hc.ai(var45, var32, (byte)115), hc.ai(var45, var33, (byte)77), hc.ai(var45, var34, (byte)106), hc.ai(var45, var35, (byte)120), var38, var47);
                        }
                     }
                  }
               }
            }
         }

         for(var16 = 1; var16 < var2 - 1; ++var16) {
            for(var17 = 1; var17 < var1 - 1; ++var17) {
               if (0 != (var0.al[var7][var17][var16] & 8)) {
                  var22 = 0;
               } else if (var7 > 0 && 0 != (var0.al[1][var17][var16] & 2)) {
                  var22 = var7 - 1;
               } else {
                  var22 = var7;
               }

               var5.ax(var7, var17, var16, var22);
            }
         }

         rl.ae[var7] = (short[][])null;
         oe.ag[var7] = (short[][])null;
         vj.am[var7] = (byte[][])null;
         ax[var7] = (byte[][])null;
         sy.aq[var7] = (byte[][])null;
      }

      var5.bj(-50, -1958805880, 283171173);

      for(var7 = 0; var7 < var1; ++var7) {
         for(var8 = 0; var8 < var2; ++var8) {
            if (2 == (var4[1][var7][var8] & 2)) {
               var5.ag(var7, var8);
            }
         }
      }

      var7 = 1;
      var8 = 2;
      var9 = 4;

      for(var10 = 0; var10 < 4; ++var10) {
         if (var10 > 0) {
            var7 <<= 3;
            var8 <<= 3;
            var9 <<= 3;
         }

         for(int var53 = 0; var53 <= var10; ++var53) {
            for(var12 = 0; var12 <= var2; ++var12) {
               for(int var54 = 0; var54 <= var1; ++var54) {
                  short var56;
                  if (0 != (br.ah[var53][var54][var12] & var7)) {
                     var14 = var12;
                     var15 = var12;
                     var16 = var53;

                     for(var17 = var53; var14 > 0 && 0 != (br.ah[var53][var54][var14 - 1] & var7); --var14) {
                     }

                     while(var15 < var2 && (br.ah[var53][var54][1 + var15] & var7) != 0) {
                        ++var15;
                     }

                     label571:
                     while(var16 > 0) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if (0 == (br.ah[var16 - 1][var54][var18] & var7)) {
                              break label571;
                           }
                        }

                        --var16;
                     }

                     label560:
                     while(var17 < var10) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if (0 == (br.ah[1 + var17][var54][var18] & var7)) {
                              break label560;
                           }
                        }

                        ++var17;
                     }

                     var18 = (1 + (var15 - var14)) * (1 + var17 - var16);
                     if (var18 >= 8) {
                        var56 = 240;
                        var20 = var3[var17][var54][var14] - var56;
                        var21 = var3[var16][var54][var14];
                        var5.am(var10, 1, var54 * 128, var54 * -1766411975, 128 * var14, 1915360326 + var15 * 580283404, var20, var21);

                        for(var22 = var16; var22 <= var17; ++var22) {
                           for(var23 = var14; var23 <= var15; ++var23) {
                              var10000 = br.ah[var22][var54];
                              var10000[var23] &= ~var7;
                           }
                        }
                     }
                  }

                  if ((br.ah[var53][var54][var12] & var8) != 0) {
                     var14 = var54;
                     var15 = var54;
                     var16 = var53;

                     for(var17 = var53; var14 > 0 && (br.ah[var53][var14 - 1][var12] & var8) != 0; --var14) {
                     }

                     while(var15 < var1 && 0 != (br.ah[var53][1 + var15][var12] & var8)) {
                        ++var15;
                     }

                     label624:
                     while(var16 > 0) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if (0 == (br.ah[var16 - 1][var18][var12] & var8)) {
                              break label624;
                           }
                        }

                        --var16;
                     }

                     label613:
                     while(var17 < var10) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if (0 == (br.ah[1 + var17][var18][var12] & var8)) {
                              break label613;
                           }
                        }

                        ++var17;
                     }

                     var18 = (1 + (var15 - var14)) * (1 + var17 - var16);
                     if (var18 >= 8) {
                        var56 = 240;
                        var20 = var3[var17][var14][var12] - var56;
                        var21 = var3[var16][var14][var12];
                        var5.am(var10, 2, 42739960 * var14, var15 * 128 + 1487749869, var12 * 128, 128 * var12, var20, var21);

                        for(var22 = var16; var22 <= var17; ++var22) {
                           for(var23 = var14; var23 <= var15; ++var23) {
                              var10000 = br.ah[var22][var23];
                              var10000[var12] &= ~var8;
                           }
                        }
                     }
                  }

                  if (0 != (br.ah[var53][var54][var12] & var9)) {
                     var14 = var54;
                     var15 = var54;
                     var16 = var12;

                     for(var17 = var12; var16 > 0 && 0 != (br.ah[var53][var54][var16 - 1] & var9); --var16) {
                     }

                     while(var17 < var2 && 0 != (br.ah[var53][var54][1 + var17] & var9)) {
                        ++var17;
                     }

                     label677:
                     while(var14 > 0) {
                        for(var18 = var16; var18 <= var17; ++var18) {
                           if (0 == (br.ah[var53][var14 - 1][var18] & var9)) {
                              break label677;
                           }
                        }

                        --var14;
                     }

                     label666:
                     while(var15 < var1) {
                        for(var18 = var16; var18 <= var17; ++var18) {
                           if (0 == (br.ah[var53][var15 + 1][var18] & var9)) {
                              break label666;
                           }
                        }

                        ++var15;
                     }

                     if ((var17 - var16 + 1) * (1 + (var15 - var14)) >= 4) {
                        var18 = var3[var53][var14][var16];
                        var5.am(var10, 4, var14 * -140122054, 128 + 128 * var15, -593934595 * var16, var17 * 128 + 539461028, var18, var18);

                        for(var19 = var14; var19 <= var15; ++var19) {
                           for(var20 = var16; var20 <= var17; ++var20) {
                              var10000 = br.ah[var53][var19];
                              var10000[var20] &= ~var9;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static final void bu(dd var0, int var1, int var2, int var3, int var4, int var5, int var6, kd var7) {
      if (!client.ci || 0 != (var0.al[0][var2][var3] & 2) || 0 == (var0.al[var1][var2][var3] & 16)) {
         if (var1 < 63843725 * ac) {
            ac = var1 * 1112005957;
         }

         id var8 = kf.ae(var4, (byte)111);
         int var9;
         int var10;
         if (var5 != 1 && 3 != var5) {
            var9 = var8.aa * -1298730649;
            var10 = var8.ai * -1257293157;
         } else {
            var9 = -1257293157 * var8.ai;
            var10 = -1298730649 * var8.aa;
         }

         int var11;
         int var12;
         if (var9 + var2 <= var0.ax * 754660757) {
            var11 = (var9 >> 1) + var2;
            var12 = (var9 + 1 >> 1) + var2;
         } else {
            var11 = var2;
            var12 = var2 + 1;
         }

         int var13;
         int var14;
         if (var3 + var10 <= var0.aq * -1090907831) {
            var13 = var3 + (var10 >> 1);
            var14 = var3 + (var10 + 1 >> 1);
         } else {
            var13 = var3;
            var14 = var3 + 1;
         }

         int[][] var15 = var0.ar[var1];
         int var16 = var15[var12][var14] + var15[var12][var13] + var15[var11][var13] + var15[var11][var14] >> 2;
         int var17 = (var9 << 6) + (var2 << 7);
         int var18 = (var10 << 6) + (var3 << 7);
         long var19 = kf.ar(var2, var3, 2, 0 == -1478169491 * var8.ay, var4, 1011931441 * var0.ac, (byte)80);
         int var21 = var6 + (var5 << 6);
         if (-937149393 * var8.bl == 1) {
            var21 += 256;
         }

         if (var8.ab(697207995)) {
            lv.ag(var1, var2, var3, var8, var5, 171358687);
         }

         jh var22 = var0.ae;
         Object var23;
         if (var6 == 22) {
            if (!client.ci || var8.ay * -1478169491 != 0 || 1 == var8.ao * 891389023 || var8.bi) {
               if (-1 == var8.an * 1369549309 && var8.bz == null) {
                  var23 = var8.at(22, var5, var15, var17, var16, var18, (byte)-8);
               } else {
                  var23 = new dk(var0, var4, 22, var5, var1, var2, var3, var8.an * 1369549309, var8.bc, (ju)null);
               }

               var22.af(var1, var2, var3, var16, (ju)var23, var19, var21);
               if (1 == var8.ao * 891389023 && var7 != null) {
                  var7.ax(var2, var3, 1365917569);
               }

            }
         } else {
            int var24;
            if (10 != var6 && 11 != var6) {
               int[] var10000;
               if (var6 >= 12) {
                  if (-1 == 1369549309 * var8.an && null == var8.bz) {
                     var23 = var8.at(var6, var5, var15, var17, var16, var18, (byte)-76);
                  } else {
                     var23 = new dk(var0, var4, var6, var5, var1, var2, var3, 1369549309 * var8.an, var8.bc, (ju)null);
                  }

                  var22.al(var1, var2, var3, var16, 1, 1, (ju)var23, 0, var19, var21);
                  if (var6 >= 12 && var6 <= 17 && 13 != var6 && var1 > 0) {
                     var10000 = br.ah[var1][var2];
                     var10000[var3] |= 2340;
                  }

                  if (0 != var8.ao * 891389023 && var7 != null) {
                     var7.ag(var2, var3, var9, var10, var8.as, (short)-19700);
                  }

               } else if (var6 == 0) {
                  if (-1 == 1369549309 * var8.an && var8.bz == null) {
                     var23 = var8.at(0, var5, var15, var17, var16, var18, (byte)-118);
                  } else {
                     var23 = new dk(var0, var4, 0, var5, var1, var2, var3, 1369549309 * var8.an, var8.bc, (ju)null);
                  }

                  var22.au(var1, var2, var3, var16, (ju)var23, (ju)null, aa[var5], 0, var19, var21);
                  if (var5 == 0) {
                     if (var8.bs) {
                        sy.aq[var1][var2][var3] = 50;
                        sy.aq[var1][var2][var3 + 1] = 50;
                     }

                     if (var8.aw) {
                        var10000 = br.ah[var1][var2];
                        var10000[var3] |= 585;
                     }
                  } else if (var5 == 1) {
                     if (var8.bs) {
                        sy.aq[var1][var2][var3 + 1] = 50;
                        sy.aq[var1][var2 + 1][1 + var3] = 50;
                     }

                     if (var8.aw) {
                        var10000 = br.ah[var1][var2];
                        var10000[1 + var3] |= 1170;
                     }
                  } else if (var5 == 2) {
                     if (var8.bs) {
                        sy.aq[var1][1 + var2][var3] = 50;
                        sy.aq[var1][var2 + 1][1 + var3] = 50;
                     }

                     if (var8.aw) {
                        var10000 = br.ah[var1][var2 + 1];
                        var10000[var3] |= 585;
                     }
                  } else if (3 == var5) {
                     if (var8.bs) {
                        sy.aq[var1][var2][var3] = 50;
                        sy.aq[var1][1 + var2][var3] = 50;
                     }

                     if (var8.aw) {
                        var10000 = br.ah[var1][var2];
                        var10000[var3] |= 1170;
                     }
                  }

                  if (0 != 891389023 * var8.ao && var7 != null) {
                     var7.ae(var2, var3, var6, var5, var8.as, (byte)-65);
                  }

                  if (16 != var8.ak * -1939734635) {
                     var22.ay(var1, var2, var3, -1939734635 * var8.ak);
                  }

               } else if (1 == var6) {
                  if (-1 == 1369549309 * var8.an && null == var8.bz) {
                     var23 = var8.at(1, var5, var15, var17, var16, var18, (byte)-18);
                  } else {
                     var23 = new dk(var0, var4, 1, var5, var1, var2, var3, var8.an * 1369549309, var8.bc, (ju)null);
                  }

                  var22.au(var1, var2, var3, var16, (ju)var23, (ju)null, ai[var5], 0, var19, var21);
                  if (var8.bs) {
                     if (var5 == 0) {
                        sy.aq[var1][var2][var3 + 1] = 50;
                     } else if (var5 == 1) {
                        sy.aq[var1][var2 + 1][1 + var3] = 50;
                     } else if (2 == var5) {
                        sy.aq[var1][1 + var2][var3] = 50;
                     } else if (var5 == 3) {
                        sy.aq[var1][var2][var3] = 50;
                     }
                  }

                  if (891389023 * var8.ao != 0 && var7 != null) {
                     var7.ae(var2, var3, var6, var5, var8.as, (byte)-36);
                  }

               } else {
                  int var29;
                  if (2 == var6) {
                     var29 = var5 + 1 & 3;
                     Object var31;
                     Object var32;
                     if (1369549309 * var8.an == -1 && null == var8.bz) {
                        var32 = var8.at(2, var5 + 4, var15, var17, var16, var18, (byte)-97);
                        var31 = var8.at(2, var29, var15, var17, var16, var18, (byte)-91);
                     } else {
                        var32 = new dk(var0, var4, 2, var5 + 4, var1, var2, var3, 1369549309 * var8.an, var8.bc, (ju)null);
                        var31 = new dk(var0, var4, 2, var29, var1, var2, var3, var8.an * 1369549309, var8.bc, (ju)null);
                     }

                     var22.au(var1, var2, var3, var16, (ju)var32, (ju)var31, aa[var5], aa[var29], var19, var21);
                     if (var8.aw) {
                        if (var5 == 0) {
                           var10000 = br.ah[var1][var2];
                           var10000[var3] |= 585;
                           var10000 = br.ah[var1][var2];
                           var10000[1 + var3] |= 1170;
                        } else if (1 == var5) {
                           var10000 = br.ah[var1][var2];
                           var10000[var3 + 1] |= 1170;
                           var10000 = br.ah[var1][1 + var2];
                           var10000[var3] |= 585;
                        } else if (2 == var5) {
                           var10000 = br.ah[var1][var2 + 1];
                           var10000[var3] |= 585;
                           var10000 = br.ah[var1][var2];
                           var10000[var3] |= 1170;
                        } else if (3 == var5) {
                           var10000 = br.ah[var1][var2];
                           var10000[var3] |= 1170;
                           var10000 = br.ah[var1][var2];
                           var10000[var3] |= 585;
                        }
                     }

                     if (0 != 891389023 * var8.ao && var7 != null) {
                        var7.ae(var2, var3, var6, var5, var8.as, (byte)89);
                     }

                     if (16 != var8.ak * -1939734635) {
                        var22.ay(var1, var2, var3, var8.ak * -1939734635);
                     }

                  } else if (var6 == 3) {
                     if (var8.an * 1369549309 == -1 && null == var8.bz) {
                        var23 = var8.at(3, var5, var15, var17, var16, var18, (byte)-79);
                     } else {
                        var23 = new dk(var0, var4, 3, var5, var1, var2, var3, var8.an * 1369549309, var8.bc, (ju)null);
                     }

                     var22.au(var1, var2, var3, var16, (ju)var23, (ju)null, ai[var5], 0, var19, var21);
                     if (var8.bs) {
                        if (0 == var5) {
                           sy.aq[var1][var2][1 + var3] = 50;
                        } else if (var5 == 1) {
                           sy.aq[var1][1 + var2][var3 + 1] = 50;
                        } else if (2 == var5) {
                           sy.aq[var1][var2 + 1][var3] = 50;
                        } else if (var5 == 3) {
                           sy.aq[var1][var2][var3] = 50;
                        }
                     }

                     if (var8.ao * 891389023 != 0 && null != var7) {
                        var7.ae(var2, var3, var6, var5, var8.as, (byte)-3);
                     }

                  } else if (9 == var6) {
                     if (1369549309 * var8.an == -1 && var8.bz == null) {
                        var23 = var8.at(var6, var5, var15, var17, var16, var18, (byte)-113);
                     } else {
                        var23 = new dk(var0, var4, var6, var5, var1, var2, var3, var8.an * 1369549309, var8.bc, (ju)null);
                     }

                     var22.al(var1, var2, var3, var16, 1, 1, (ju)var23, 0, var19, var21);
                     if (0 != 891389023 * var8.ao && var7 != null) {
                        var7.ag(var2, var3, var9, var10, var8.as, (short)-5631);
                     }

                     if (var8.ak * -1939734635 != 16) {
                        var22.ay(var1, var2, var3, var8.ak * -1939734635);
                     }

                  } else if (4 == var6) {
                     if (-1 == var8.an * 1369549309 && null == var8.bz) {
                        var23 = var8.at(4, var5, var15, var17, var16, var18, (byte)-69);
                     } else {
                        var23 = new dk(var0, var4, 4, var5, var1, var2, var3, 1369549309 * var8.an, var8.bc, (ju)null);
                     }

                     var22.ar(var1, var2, var3, var16, (ju)var23, (ju)null, aa[var5], 0, 0, 0, var19, var21);
                  } else {
                     long var30;
                     Object var33;
                     if (var6 == 5) {
                        var29 = 16;
                        var30 = var22.bf(var1, var2, var3);
                        if (var30 != 0L) {
                           var29 = kf.ae(ii.at(var30), (byte)12).ak * -1939734635;
                        }

                        if (var8.an * 1369549309 == -1 && var8.bz == null) {
                           var33 = var8.at(4, var5, var15, var17, var16, var18, (byte)-60);
                        } else {
                           var33 = new dk(var0, var4, 4, var5, var1, var2, var3, var8.an * 1369549309, var8.bc, (ju)null);
                        }

                        var22.ar(var1, var2, var3, var16, (ju)var33, (ju)null, aa[var5], 0, var29 * ao[var5], var29 * as[var5], var19, var21);
                     } else if (6 == var6) {
                        var29 = 8;
                        var30 = var22.bf(var1, var2, var3);
                        if (var30 != 0L) {
                           var29 = kf.ae(ii.at(var30), (byte)30).ak * -1939734635 / 2;
                        }

                        if (-1 == var8.an * 1369549309 && null == var8.bz) {
                           var33 = var8.at(4, 4 + var5, var15, var17, var16, var18, (byte)-29);
                        } else {
                           var33 = new dk(var0, var4, 4, 4 + var5, var1, var2, var3, var8.an * 1369549309, var8.bc, (ju)null);
                        }

                        var22.ar(var1, var2, var3, var16, (ju)var33, (ju)null, 256, var5, var29 * ay[var5], aj[var5] * var29, var19, var21);
                     } else if (var6 == 7) {
                        var24 = 2 + var5 & 3;
                        if (-1 == var8.an * 1369549309 && var8.bz == null) {
                           var23 = var8.at(4, var24 + 4, var15, var17, var16, var18, (byte)-104);
                        } else {
                           var23 = new dk(var0, var4, 4, var24 + 4, var1, var2, var3, 1369549309 * var8.an, var8.bc, (ju)null);
                        }

                        var22.ar(var1, var2, var3, var16, (ju)var23, (ju)null, 256, var24, 0, 0, var19, var21);
                     } else if (8 == var6) {
                        var29 = 8;
                        var30 = var22.bf(var1, var2, var3);
                        if (0L != var30) {
                           var29 = kf.ae(ii.at(var30), (byte)70).ak * -1939734635 / 2;
                        }

                        int var28 = 2 + var5 & 3;
                        Object var27;
                        if (-1 == 1369549309 * var8.an && var8.bz == null) {
                           var33 = var8.at(4, var5 + 4, var15, var17, var16, var18, (byte)-96);
                           var27 = var8.at(4, var28 + 4, var15, var17, var16, var18, (byte)-12);
                        } else {
                           var33 = new dk(var0, var4, 4, var5 + 4, var1, var2, var3, var8.an * 1369549309, var8.bc, (ju)null);
                           var27 = new dk(var0, var4, 4, var28 + 4, var1, var2, var3, var8.an * 1369549309, var8.bc, (ju)null);
                        }

                        var22.ar(var1, var2, var3, var16, (ju)var33, (ju)var27, 256, var5, var29 * ay[var5], var29 * aj[var5], var19, var21);
                     }
                  }
               }
            } else {
               if (-1 == var8.an * 1369549309 && null == var8.bz) {
                  var23 = var8.at(10, var5, var15, var17, var16, var18, (byte)-72);
               } else {
                  var23 = new dk(var0, var4, 10, var5, var1, var2, var3, 1369549309 * var8.an, var8.bc, (ju)null);
               }

               if (var23 != null && var22.al(var1, var2, var3, var16, var9, var10, (ju)var23, 11 == var6 ? 256 : 0, var19, var21) && var8.bs) {
                  var24 = 15;
                  if (var23 instanceof jm) {
                     var24 = ((jm)var23).al() / 4;
                     if (var24 > 30) {
                        var24 = 30;
                     }
                  }

                  for(int var25 = 0; var25 <= var9; ++var25) {
                     for(int var26 = 0; var26 <= var10; ++var26) {
                        if (var24 > sy.aq[var1][var25 + var2][var3 + var26]) {
                           sy.aq[var1][var25 + var2][var26 + var3] = (byte)var24;
                        }
                     }
                  }
               }

               if (0 != var8.ao * 891389023 && null != var7) {
                  var7.ag(var2, var3, var9, var10, var8.as, (short)-17394);
               }

            }
         }
      }
   }

   static final int bv(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = as.ab(var3, var5, -1498004698);
      int var8 = as.ab(var3 + 1, var5, -1406864925);
      int var9 = as.ab(var3, var5 + 1, -202156046);
      int var10 = as.ab(1 + var3, 1 + var5, 1950252915);
      int var11 = om.ap(var7, var8, var4, var2, (byte)71);
      int var12 = om.ap(var9, var10, var4, var2, (byte)-61);
      return om.ap(var11, var12, var6, var2, (byte)112);
   }

   static final int bt(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = as.ab(var3, var5, -976191409);
      int var8 = as.ab(var3 + 1, var5, -1531046972);
      int var9 = as.ab(var3, var5 + 1, -1120184436);
      int var10 = as.ab(1 + var3, 1 + var5, 275743564);
      int var11 = om.ap(var7, var8, var4, var2, (byte)100);
      int var12 = om.ap(var9, var10, var4, var2, (byte)-52);
      return om.ap(var11, var12, var6, var2, (byte)49);
   }

   static final int bq(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = as.ab(var3, var5, 1339073515);
      int var8 = as.ab(var3 + 1, var5, 738503004);
      int var9 = as.ab(var3, var5 + 1, 2083157163);
      int var10 = as.ab(1 + var3, 1 + var5, -1790157652);
      int var11 = om.ap(var7, var8, var4, var2, (byte)-70);
      int var12 = om.ap(var9, var10, var4, var2, (byte)48);
      return om.ap(var11, var12, var6, var2, (byte)38);
   }

   static final int bk(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - jw.ax[var2 * 1024 / var3] >> 1;
      return (var1 * var4 >> 16) + ((65536 - var4) * var0 >> 16);
   }

   static final int be(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - jw.ax[var2 * 1024 / var3] >> 1;
      return (var1 * var4 >> 16) + ((110479509 - var4) * var0 >> 16);
   }

   static final int bc(int var0, int var1, int var2, int var3) {
      int var4 = -1979136226 - jw.ax[var2 * -224600805 / var3] >> 1;
      return (var1 * var4 >> 16) + ((-1778781794 - var4) * var0 >> 16);
   }

   static final int cn(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - jw.ax[var2 * -174550192 / var3] >> 1;
      return (var1 * var4 >> 16) + ((-252007960 - var4) * var0 >> 16);
   }

   static final int ch(int var0, int var1) {
      int var2 = hb.az(var0 - 1, var1 - 1, 1940018893) + hb.az(var0 + 1, var1 - 1, 1991266014) + hb.az(var0 - 1, var1 + 1, 1867967404) + hb.az(var0 + 1, 1 + var1, 1835881946);
      int var3 = hb.az(var0 - 1, var1, 1628112320) + hb.az(var0 + 1, var1, 1789542044) + hb.az(var0, var1 - 1, 1963436881) + hb.az(var0, var1 + 1, 1814411211);
      int var4 = hb.az(var0, var1, 1992535928);
      return var4 / 4 + var3 / 8 + var2 / 16;
   }

   static final int cf(int var0, int var1) {
      int var2 = hb.az(var0 - 1, var1 - 1, 1666777728) + hb.az(var0 + 1, var1 - 1, 1950933470) + hb.az(var0 - 1, var1 + 1, 1637482036) + hb.az(var0 + 1, 1 + var1, 1819024739);
      int var3 = hb.az(var0 - 1, var1, 1665395351) + hb.az(var0 + 1, var1, 1642056555) + hb.az(var0, var1 - 1, 1775841291) + hb.az(var0, var1 + 1, 1737261489);
      int var4 = hb.az(var0, var1, 1845029866);
      return var4 / 4 + var3 / 8 + var2 / 16;
   }

   static final int cu(int var0, int var1) {
      int var2 = hb.az(var0 - 1, var1 - 1, 1763895313) + hb.az(var0 + 1, var1 - 1, 1967130184) + hb.az(var0 - 1, var1 + 1, 1815404210) + hb.az(var0 + 1, 1 + var1, 2061320011);
      int var3 = hb.az(var0 - 1, var1, 1666417191) + hb.az(var0 + 1, var1, 1688820643) + hb.az(var0, var1 - 1, 1797600669) + hb.az(var0, var1 + 1, 1631075853);
      int var4 = hb.az(var0, var1, 1922394257);
      return var4 / 4 + var3 / 8 + var2 / 16;
   }

   static int bl(int var0, int var1) {
      try {
         return (int)((Math.log((double)var0) / cs.bd - 7.0D) * 256.0D);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "db.bl(" + ')');
      }
   }

   static final int co(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (-1 == var0) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & 'ﾀ');
      }
   }

   static void ay() {
      ac = -1580559953;
      rl.ae = new short[4][104][104];
      oe.ag = new short[4][104][104];
      vj.am = new byte[4][104][104];
      ax = new byte[4][104][104];
      br.ah = new int[4][105][105];
      sy.aq = new byte[4][105][105];
      td.af = new int[105][105];
      me.at = new int[104];
      eg.au = new int[104];
      ar = new int[104];
      ck.al = new int[104];
      ad = new int[104];
   }

   static final int ci(int var0, int var1) {
      if (-1 == var0) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   static final int cy(int var0, int var1) {
      if (-1 == var0) {
         return 1905468908;
      } else {
         var1 = (var0 & -684919031) * var1 / -761691064;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   static final void bw(dd var0, vf var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.ar;
      byte[][][] var9 = var0.al;
      int var10;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while(true) {
            var10 = var1.ct(-1494462856);
            if (var10 == 0) {
               if (0 == var2) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + 1573688316;
                  int var15 = 556238 + var6;
                  int var16 = eh.ah(var14 + '넵', -99967246 + var15, 4, 877019004) - -1210736318 + (eh.ah(var14 + 583621402, '鎽' + var15, 2, 2096760863) - 128 >> 1) + (eh.ah(var14, var15, 1, 703674219) - 128 >> 2);
                  var16 = 35 + (int)((double)var16 * 0.3D);
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > 60) {
                     var16 = 60;
                  }

                  var17[var4] = 8 * -var16;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - -103733376;
               }
               break;
            }

            if (1 == var10) {
               int var11 = var1.cv(952452697);
               if (1 == var11) {
                  var11 = 0;
               }

               if (var2 == 0) {
                  var8[0][var3][var4] = 8 * -var11;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= 49) {
               oe.ag[var2][var3][var4] = (short)var1.cq(-583376244);
               vj.am[var2][var3][var4] = (byte)((var10 - 2) / 4);
               ax[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= 81) {
               var9[var2][var3][var4] = (byte)(var10 - 1382364292);
            } else {
               rl.ae[var2][var3][var4] = (short)(var10 - 81);
            }
         }
      } else {
         while(true) {
            var10 = var1.ct(-1527539838);
            if (0 == var10) {
               break;
            }

            if (var10 == 1) {
               var1.cv(952452697);
               break;
            }

            if (var10 <= 807317419) {
               var1.cq(490715724);
            }
         }
      }

   }

   static final int cv(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (-1 == var0) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & 'ﾀ');
      }
   }

   static final void an(dd var0, byte[] var1, int var2, int var3, int var4, int var5) {
      int var7;
      int var8;
      if (null != var0.ag) {
         for(int var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < -1675536946; ++var7) {
               for(var8 = 0; var8 < 64; ++var8) {
                  if (var2 + var7 > 0 && var2 + var7 < var0.ag[var6].bb.length && var3 + var8 > 0 && var3 + var8 < var0.ag[var6].bb[var7 + var2].length) {
                     int[] var10000 = var0.ag[var6].bb[var7 + var2];
                     var10000[var8 + var3] &= -1073741825;
                  }
               }
            }
         }
      }

      vf var12 = new vf(var1);

      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < -1349386124; ++var8) {
            for(int var9 = 0; var9 < -809148460; ++var9) {
               int var10 = var8 + var2;
               int var11 = var3 + var9;
               ux.af(var0, var12, var7, var10, var11, var4 + var10, var11 + var5, 0, 894526572);
            }
         }
      }

   }

   static final boolean ct(int var0, int var1) {
      id var2 = kf.ae(var0, (byte)88);
      if (11 == var1) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var2.aq(var1, (byte)-70);
   }

   static final boolean cq(int var0, int var1) {
      id var2 = kf.ae(var0, (byte)64);
      if (11 == var1) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var2.aq(var1, (byte)-95);
   }

   static final boolean cc(int var0, int var1) {
      id var2 = kf.ae(var0, (byte)43);
      if (11 == var1) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var2.aq(var1, (byte)-62);
   }

   static final void bz(dd var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      vf var9 = new vf(var1);
      int var10 = -1;

      while(true) {
         int var11 = var9.df(-1054010182);
         if (var11 == 0) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while(true) {
            int var13 = var9.ck((byte)36);
            if (0 == var13) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = var9.cv(952452697);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var16 == var5 && var15 >= var6 && var15 < 8 + var6 && var14 >= var7 && var14 < 8 + var7) {
               id var20 = kf.ae(var10, (byte)117);
               int var21 = var3 + jf.ag(var15 & 7, var14 & 7, var8, var20.aa * -1298730649, -1257293157 * var20.ai, var19, (byte)127);
               int var22 = var4 + lv.am(var15 & 7, var14 & 7, var8, -1298730649 * var20.aa, -1257293157 * var20.ai, var19, (byte)26);
               if (var21 > 0 && var22 > 0 && var21 < 754660757 * var0.ax - 1 && var22 < -1090907831 * var0.aq - 1) {
                  int var23 = var2;
                  if (2 == (var0.al[1][var21][var22] & 2)) {
                     var23 = var2 - 1;
                  }

                  kd var24 = null;
                  if (var23 >= 0 && null != var0.ag) {
                     var24 = var0.ag[var23];
                  }

                  or.al(var0, var2, var21, var22, var10, var19 + var8 & 3, var18, var24, 808196321);
               }
            }
         }
      }
   }

   static final void ar(ny var0, int var1, byte[] var2, byte[] var3, int var4) {
      try {
         if (null == var0.ea) {
            if (var4 != -339220276) {
               throw new IllegalStateException();
            }

            if (var2 == null) {
               return;
            }

            if (var4 != -339220276) {
               throw new IllegalStateException();
            }

            var0.ea = new byte[11][];
            var0.ez = new byte[11][];
            var0.ev = new int[11];
            var0.ef = new int[11];
         }

         var0.ea[var1] = var2;
         if (var2 != null) {
            if (var4 != -339220276) {
               return;
            }

            var0.eg = true;
         } else {
            var0.eg = false;

            for(int var5 = 0; var5 < var0.ea.length; ++var5) {
               if (null != var0.ea[var5]) {
                  var0.eg = true;
                  break;
               }
            }
         }

         var0.ez[var1] = var3;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "db.ar(" + ')');
      }
   }
}
