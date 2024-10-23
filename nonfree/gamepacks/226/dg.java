public final class dg {
   static final int[] ac = new int[]{0, -1, 0, 1};
   static int ap = 1111963987;
   static final int[] av = new int[]{1, -1, -1, 1};
   static byte[][][] aj;
   static byte[][][] ai;
   static int[] am;
   static int[][] as;
   static int[] ae;
   static short[][][] aw;
   static int[] an;
   static final int[] az = new int[]{1, 2, 4, 8};
   static final int[] ag = new int[]{16, 32, 64, 128};
   static final int[] ad = new int[]{1, 0, -1, 0};
   static short[][][] ak;
   static final int[] ax = new int[]{-1, -1, 1, 1};
   static int aq = ((int)(Math.random() * 17.0D) - 8) * 393163289;
   static byte[][][] ay;
   static int al = ((int)(Math.random() * 33.0D) - 16) * -316002055;

   static final void cg(dn var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ko var9) {
      ir var10 = ei.aw(var5, 888461382);
      int var11 = var8 >= 0 ? var8 : 151939378 * var10.aa;
      int var12;
      int var13;
      if (var6 != 1 && var6 != 3) {
         var12 = -347110081 * var10.az;
         var13 = -109800991 * var10.ag;
      } else {
         var12 = var10.ag * 1210531790;
         var13 = -347110081 * var10.az;
      }

      int var14;
      int var15;
      if (var3 + var12 <= var0.ai * 1587254913) {
         var14 = var3 + (var12 >> 1);
         var15 = var3 + (var12 + 1 >> 1);
      } else {
         var14 = var3;
         var15 = var3 + 1;
      }

      int var16;
      int var17;
      if (var13 + var4 <= -1000264093 * var0.ay) {
         var16 = (var13 >> 1) + var4;
         var17 = var4 + (var13 + 1 >> 1);
      } else {
         var16 = var4;
         var17 = var4 + 1;
      }

      int[][] var18 = var0.at[var2];
      int var19 = var18[var15][var17] + var18[var14][var16] + var18[var15][var16] + var18[var14][var17] >> 2;
      int var20 = (var3 << 7) + (var12 << 6);
      int var21 = (var4 << 7) + (var13 << 6);
      ji var22 = var0.aw;
      long var23 = fd.at(var3, var4, 2, var10.av * 942838783 == 0, var5, var0.ap * -1948824391, (byte)-31);
      int var25 = (var6 << 6) + var7;
      if (var10.bs * 531867923 == 1) {
         var25 += 256;
      }

      Object var26;
      if (var7 == 22) {
         if (var11 == -1 && null == var10.bm) {
            var26 = var10.am(22, var6, var18, var20, var19, var21, (byte)-74);
         } else {
            var26 = new dr(var0, var5, 22, var6, var2, var3, var4, var11, var10.be, (jv)null);
         }

         var22.as(var1, var3, var4, var19, (jv)var26, var23, var25);
         if (1 == var10.ad * -1552861337 && var9 != null) {
            var9.ai(var3, var4, -2029326888);
         }

      } else if (10 != var7 && 11 != var7) {
         if (var7 >= 12) {
            if (-1 == var11 && var10.bm == null) {
               var26 = var10.am(var7, var6, var18, var20, var19, var21, (byte)4);
            } else {
               var26 = new dr(var0, var5, var7, var6, var2, var3, var4, var11, var10.be, (jv)null);
            }

            var22.af(var1, var3, var4, var19, 1, 1, (jv)var26, 0, var23, var25);
            if (0 != var10.ad * -1552861337 && var9 != null) {
               var9.ak(var3, var4, var12, var13, var10.ac, (byte)63);
            }

         } else if (var7 == 0) {
            if (var11 == -1 && null == var10.bm) {
               var26 = var10.am(0, var6, var18, var20, var19, var21, (byte)-30);
            } else {
               var26 = new dr(var0, var5, 0, var6, var2, var3, var4, var11, var10.be, (jv)null);
            }

            var22.am(var1, var3, var4, var19, (jv)var26, (jv)null, az[var6], 0, var23, var25);
            if (0 != var10.ad * 1348028009 && null != var9) {
               var9.aw(var3, var4, var7, var6, var10.ac, (byte)-81);
            }

         } else if (1 == var7) {
            if (var11 == -1 && null == var10.bm) {
               var26 = var10.am(1, var6, var18, var20, var19, var21, (byte)5);
            } else {
               var26 = new dr(var0, var5, 1, var6, var2, var3, var4, var11, var10.be, (jv)null);
            }

            var22.am(var1, var3, var4, var19, (jv)var26, (jv)null, ag[var6], 0, var23, var25);
            if (0 != -1552861337 * var10.ad && var9 != null) {
               var9.aw(var3, var4, var7, var6, var10.ac, (byte)-40);
            }

         } else {
            int var32;
            if (2 == var7) {
               var32 = 1 + var6 & 3;
               Object var28;
               Object var34;
               if (var11 == -1 && null == var10.bm) {
                  var34 = var10.am(2, 4 + var6, var18, var20, var19, var21, (byte)-81);
                  var28 = var10.am(2, var32, var18, var20, var19, var21, (byte)58);
               } else {
                  var34 = new dr(var0, var5, 2, var6 + 4, var2, var3, var4, var11, var10.be, (jv)null);
                  var28 = new dr(var0, var5, 2, var32, var2, var3, var4, var11, var10.be, (jv)null);
               }

               var22.am(var1, var3, var4, var19, (jv)var34, (jv)var28, az[var6], az[var32], var23, var25);
               if (0 != var10.ad * -1552861337 && var9 != null) {
                  var9.aw(var3, var4, var7, var6, var10.ac, (byte)-91);
               }

            } else if (var7 == 3) {
               if (var11 == -1 && null == var10.bm) {
                  var26 = var10.am(3, var6, var18, var20, var19, var21, (byte)44);
               } else {
                  var26 = new dr(var0, var5, 3, var6, var2, var3, var4, var11, var10.be, (jv)null);
               }

               var22.am(var1, var3, var4, var19, (jv)var26, (jv)null, ag[var6], 0, var23, var25);
               if (-1552861337 * var10.ad != 0 && null != var9) {
                  var9.aw(var3, var4, var7, var6, var10.ac, (byte)-113);
               }

            } else if (var7 == 9) {
               if (var11 == -1 && null == var10.bm) {
                  var26 = var10.am(var7, var6, var18, var20, var19, var21, (byte)49);
               } else {
                  var26 = new dr(var0, var5, var7, var6, var2, var3, var4, var11, var10.be, (jv)null);
               }

               var22.af(var1, var3, var4, var19, 1, 1, (jv)var26, 0, var23, var25);
               if (0 != -1552861337 * var10.ad && null != var9) {
                  var9.ak(var3, var4, var12, var13, var10.ac, (byte)-99);
               }

            } else if (4 == var7) {
               if (-1 == var11 && null == var10.bm) {
                  var26 = var10.am(4, var6, var18, var20, var19, var21, (byte)117);
               } else {
                  var26 = new dr(var0, var5, 4, var6, var2, var3, var4, var11, var10.be, (jv)null);
               }

               var22.at(var1, var3, var4, var19, (jv)var26, (jv)null, az[var6], 0, 0, 0, var23, var25);
            } else {
               long var27;
               Object var29;
               if (5 == var7) {
                  var32 = 16;
                  var27 = var22.bx(var1, var3, var4);
                  if (0L != var27) {
                     var32 = ei.aw(la.ae(var27), 888461382).ah * -1841950163;
                  }

                  if (var11 == -1 && null == var10.bm) {
                     var29 = var10.am(4, var6, var18, var20, var19, var21, (byte)-111);
                  } else {
                     var29 = new dr(var0, var5, 4, var6, var2, var3, var4, var11, var10.be, (jv)null);
                  }

                  var22.at(var1, var3, var4, var19, (jv)var29, (jv)null, az[var6], 0, var32 * ad[var6], var32 * ac[var6], var23, var25);
               } else if (6 == var7) {
                  var32 = 8;
                  var27 = var22.bx(var1, var3, var4);
                  if (0L != var27) {
                     var32 = ei.aw(la.ae(var27), 888461382).ah * -1730228680 / 2;
                  }

                  if (var11 == -1 && var10.bm == null) {
                     var29 = var10.am(4, 4 + var6, var18, var20, var19, var21, (byte)-52);
                  } else {
                     var29 = new dr(var0, var5, 4, 4 + var6, var2, var3, var4, var11, var10.be, (jv)null);
                  }

                  var22.at(var1, var3, var4, var19, (jv)var29, (jv)null, -1072288875, var6, var32 * av[var6], var32 * ax[var6], var23, var25);
               } else if (7 == var7) {
                  int var33 = 2 + var6 & 3;
                  if (-1 == var11 && var10.bm == null) {
                     var26 = var10.am(4, 4 + var33, var18, var20, var19, var21, (byte)-26);
                  } else {
                     var26 = new dr(var0, var5, 4, 4 + var33, var2, var3, var4, var11, var10.be, (jv)null);
                  }

                  var22.at(var1, var3, var4, var19, (jv)var26, (jv)null, 206091565, var33, 0, 0, var23, var25);
               } else if (var7 == 8) {
                  var32 = 8;
                  var27 = var22.bx(var1, var3, var4);
                  if (var27 != 0L) {
                     var32 = ei.aw(la.ae(var27), 888461382).ah * 492344861 / 2;
                  }

                  int var31 = var6 + 2 & 3;
                  Object var30;
                  if (-1 == var11 && null == var10.bm) {
                     var29 = var10.am(4, var6 + 4, var18, var20, var19, var21, (byte)29);
                     var30 = var10.am(4, var31 + 4, var18, var20, var19, var21, (byte)-6);
                  } else {
                     var29 = new dr(var0, var5, 4, var6 + 4, var2, var3, var4, var11, var10.be, (jv)null);
                     var30 = new dr(var0, var5, 4, var31 + 4, var2, var3, var4, var11, var10.be, (jv)null);
                  }

                  var22.at(var1, var3, var4, var19, (jv)var29, (jv)var30, -423689745, var6, var32 * av[var6], var32 * ax[var6], var23, var25);
               }
            }
         }
      } else {
         if (-1 == var11 && null == var10.bm) {
            var26 = var10.am(10, var6, var18, var20, var19, var21, (byte)-2);
         } else {
            var26 = new dr(var0, var5, 10, var6, var2, var3, var4, var11, var10.be, (jv)null);
         }

         if (var26 != null) {
            var22.af(var1, var3, var4, var19, var12, var13, (jv)var26, 11 == var7 ? 256 : 0, var23, var25);
         }

         if (1918791459 * var10.ad != 0 && var9 != null) {
            var9.ak(var3, var4, var12, var13, var10.ac, (byte)-119);
         }

      }
   }

   static final int cy(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = var2 / 2 + (var0 / 4 << 10) + (var1 / 32 << 7);
      return var3;
   }

   static void ax() {
      ap = 1111963987;
      aw = new short[4][104][104];
      ak = new short[4][1937874585][104];
      aj = new byte[4][-370164181][104];
      ai = new byte[4][104][104];
      ua.ao = new int[4][105][1342113817];
      ay = new byte[4][-1616588353][693232254];
      as = new int[-683218793][-2006163760];
      ae = new int[104];
      am = new int[104];
      wk.at = new int[104];
      cr.au = new int[104];
      an = new int[104];
   }

   static void aq() {
      aw = (short[][][])null;
      ak = (short[][][])null;
      aj = (byte[][][])null;
      ai = (byte[][][])null;
      ua.ao = (int[][][])null;
      ay = (byte[][][])null;
      as = (int[][])null;
      ae = null;
      am = null;
      wk.at = null;
      cr.au = null;
      an = null;
   }

   static void al() {
      aw = (short[][][])null;
      ak = (short[][][])null;
      aj = (byte[][][])null;
      ai = (byte[][][])null;
      ua.ao = (int[][][])null;
      ay = (byte[][][])null;
      as = (int[][])null;
      ae = null;
      am = null;
      wk.at = null;
      cr.au = null;
      an = null;
   }

   dg() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "dg.<init>(" + ')');
      }
   }

   static final int cp(int var0, int var1, int var2) {
      if (var2 > 524035942) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = var2 / 2 + (var0 / 4 << 10) + (var1 / 177946215 << 7);
      return var3;
   }

   static void bh() {
      aw = (short[][][])null;
      ak = (short[][][])null;
      aj = (byte[][][])null;
      ai = (byte[][][])null;
      ua.ao = (int[][][])null;
      ay = (byte[][][])null;
      as = (int[][])null;
      ae = null;
      am = null;
      wk.at = null;
      cr.au = null;
      an = null;
   }

   static final void bj(dn var0, int var1, int var2, int var3, int var4) {
      int[][][] var5 = var0.at;
      int var6 = 1587254913 * var0.ai - 1;
      int var7 = var0.ay * -1000264093 - 1;

      for(int var8 = var2; var8 <= var2 + var4; ++var8) {
         for(int var9 = var1; var9 <= var1 + var3; ++var9) {
            if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
               ay[0][var9][var8] = 127;
               if (var1 == var9 && var9 > 0) {
                  var5[0][var9][var8] = var5[0][var9 - 1][var8];
               }

               if (var3 + var1 == var9 && var9 < var6) {
                  var5[0][var9][var8] = var5[0][1 + var9][var8];
               }

               if (var2 == var8 && var8 > 0) {
                  var5[0][var9][var8] = var5[0][var9][var8 - 1];
               }

               if (var4 + var2 == var8 && var8 < var7) {
                  var5[0][var9][var8] = var5[0][var9][1 + var8];
               }
            }
         }
      }

   }

   static final void bf(dn var0) {
      int var1 = var0.ai * 1587254913;
      int var2 = var0.ay * -1000264093;
      int[][][] var3 = var0.at;
      byte[][][] var4 = var0.au;
      ji var5 = var0.aw;
      ko[] var6 = var0.ak;

      int var7;
      int var8;
      int var9;
      int var10;
      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < var1; ++var8) {
            for(var9 = 0; var9 < var2; ++var9) {
               if (1 == (var0.au[var7][var8][var9] & 1)) {
                  var10 = var7;
                  if (2 == (var0.au[1][var8][var9] & 2)) {
                     var10 = var7 - 1;
                  }

                  if (var10 >= 0 && var6 != null) {
                     var6[var10].aj(var8, var9, (byte)25);
                  }
               }
            }
         }
      }

      aq += ((int)(Math.random() * 5.0D) - 2) * 393163289;
      if (1620838953 * aq < -8) {
         aq = 1149660984;
      }

      if (aq * 1620838953 > 8) {
         aq = -1149660984;
      }

      al += ((int)(Math.random() * 5.0D) - 2) * -316002055;
      if (al * -53243575 < -16) {
         al = 761065584;
      }

      if (al * -53243575 > 16) {
         al = -761065584;
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
         byte[][] var52 = ay[var7];
         boolean var53 = true;
         boolean var54 = true;
         boolean var11 = true;
         boolean var12 = true;
         boolean var13 = true;
         var14 = (int)Math.sqrt(5100.0D);
         var15 = 768 * var14 >> 8;

         int var24;
         for(var16 = 1; var16 < var2 - 1; ++var16) {
            for(var17 = 1; var17 < var1 - 1; ++var17) {
               var18 = var3[var7][1 + var17][var16] - var3[var7][var17 - 1][var16];
               var19 = var3[var7][var17][var16 + 1] - var3[var7][var17][var16 - 1];
               var20 = (int)Math.sqrt((double)(var19 * var19 + var18 * var18 + 65536));
               var21 = (var18 << 8) / var20;
               var22 = 65536 / var20;
               var23 = (var19 << 8) / var20;
               var24 = 96 + (-50 * var21 + -10 * var22 + var23 * -50) / var15;
               int var25 = (var52[var17][var16] >> 1) + (var52[var17][1 + var16] >> 3) + (var52[var17][var16 - 1] >> 2) + (var52[var17 - 1][var16] >> 2) + (var52[var17 + 1][var16] >> 3);
               as[var17][var16] = var24 - var25;
            }
         }

         for(var16 = 0; var16 < var2; ++var16) {
            ae[var16] = 0;
            am[var16] = 0;
            wk.at[var16] = 0;
            cr.au[var16] = 0;
            an[var16] = 0;
         }

         for(var16 = -5; var16 < 5 + var1; ++var16) {
            for(var17 = 0; var17 < var2; ++var17) {
               var18 = 5 + var16;
               int var10002;
               if (var18 >= 0 && var18 < var1) {
                  long var58 = (long)Math.pow(2.0D, 15.0D) - 1L;
                  var21 = (int)var58;
                  var22 = aw[var7][var18][var17] & var21;
                  if (var22 > 0) {
                     hv var61 = dc.aw(var22 - 1, (byte)1);
                     var10000 = ae;
                     var10000[var17] += var61.aj * 1467474647;
                     var10000 = am;
                     var10000[var17] += -767557955 * var61.ai;
                     var10000 = wk.at;
                     var10000[var17] += 1473097783 * var61.ay;
                     var10000 = cr.au;
                     var10000[var17] += 613794733 * var61.as;
                     var10002 = an[var17]++;
                  }
               }

               var19 = var16 - 5;
               if (var19 >= 0 && var19 < var1) {
                  long var59 = (long)Math.pow(2.0D, 15.0D) - 1L;
                  var22 = (int)var59;
                  var23 = aw[var7][var19][var17] & var22;
                  if (var23 > 0) {
                     hv var62 = dc.aw(var23 - 1, (byte)1);
                     var10000 = ae;
                     var10000[var17] -= var62.aj * 1467474647;
                     var10000 = am;
                     var10000[var17] -= -767557955 * var62.ai;
                     var10000 = wk.at;
                     var10000[var17] -= var62.ay * 1473097783;
                     var10000 = cr.au;
                     var10000[var17] -= var62.as * 613794733;
                     var10002 = an[var17]--;
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
                  var23 = 5 + var22;
                  if (var23 >= 0 && var23 < var2) {
                     var17 += ae[var23];
                     var18 += am[var23];
                     var19 += wk.at[var23];
                     var20 += cr.au[var23];
                     var21 += an[var23];
                  }

                  var24 = var22 - 5;
                  if (var24 >= 0 && var24 < var2) {
                     var17 -= ae[var24];
                     var18 -= am[var24];
                     var19 -= wk.at[var24];
                     var20 -= cr.au[var24];
                     var21 -= an[var24];
                  }

                  if (var22 >= 1 && var22 < var2 - 1 && (!client.cl || 0 != (var4[0][var16][var22] & 2) || 0 == (var4[var7][var16][var22] & 16))) {
                     if (var7 < ap * -213423439) {
                        ap = 1659805265 * var7;
                     }

                     long var63 = (long)Math.pow(2.0D, 15.0D) - 1L;
                     int var27 = (int)var63;
                     int var28 = aw[var7][var16][var22] & var27;
                     int var29 = ak[var7][var16][var22] & var27;
                     if (var28 > 0 || var29 > 0) {
                        int var30 = var3[var7][var16][var22];
                        int var31 = var3[var7][var16 + 1][var22];
                        int var32 = var3[var7][1 + var16][var22 + 1];
                        int var33 = var3[var7][var16][var22 + 1];
                        int var34 = as[var16][var22];
                        int var35 = as[1 + var16][var22];
                        int var36 = as[var16 + 1][var22 + 1];
                        int var37 = as[var16][1 + var22];
                        int var38 = -1;
                        int var39 = -1;
                        int var40;
                        int var41;
                        int var42;
                        if (var28 > 0) {
                           var40 = var17 * 256 / var20;
                           var41 = var18 / var21;
                           var42 = var19 / var21;
                           var38 = oy.ac(var40, var41, var42, (byte)-82);
                           var40 = var40 + 1620838953 * aq & 255;
                           var42 += al * -53243575;
                           if (var42 < 0) {
                              var42 = 0;
                           } else if (var42 > 255) {
                              var42 = 255;
                           }

                           var39 = oy.ac(var40, var41, var42, (byte)-5);
                        }

                        in var43;
                        if (var7 > 0) {
                           boolean var64 = true;
                           if (var28 == 0 && aj[var7][var16][var22] != 0) {
                              var64 = false;
                           }

                           if (var29 > 0) {
                              var42 = var29 - 1;
                              var43 = (in)in.aw.ap((long)var42);
                              in var65;
                              if (null != var43) {
                                 var65 = var43;
                              } else {
                                 byte[] var44 = in.ap.bm(4, var42, 2122927984);
                                 var43 = new in();
                                 if (null != var44) {
                                    var43.ak(new vl(var44), var42, (byte)-40);
                                 }

                                 var43.aw((byte)8);
                                 in.aw.ak(var43, (long)var42);
                                 var65 = var43;
                              }

                              if (!var65.ai) {
                                 var64 = false;
                              }
                           }

                           if (var64 && var31 == var30 && var32 == var30 && var33 == var30) {
                              var10000 = ua.ao[var7][var16];
                              var10000[var22] |= 2340;
                           }
                        }

                        var40 = 0;
                        if (var39 != -1) {
                           var40 = jm.ap[dk.ag(var39, 96, -1331687886)];
                        }

                        if (0 == var29) {
                           var5.ay(var7, var16, var22, 0, 0, -1, var30, var31, var32, var33, dk.ag(var38, var34, 357544574), dk.ag(var38, var35, 613267358), dk.ag(var38, var36, -1761069989), dk.ag(var38, var37, -200404284), 0, 0, 0, 0, var40, 0);
                        } else {
                           var41 = 1 + aj[var7][var16][var22];
                           byte var66 = ai[var7][var16][var22];
                           int var67 = var29 - 1;
                           in var45 = (in)in.aw.ap((long)var67);
                           if (var45 != null) {
                              var43 = var45;
                           } else {
                              byte[] var46 = in.ap.bm(4, var67, 717349238);
                              var45 = new in();
                              if (var46 != null) {
                                 var45.ak(new vl(var46), var67, (byte)-27);
                              }

                              var45.aw((byte)-7);
                              in.aw.ak(var45, (long)var67);
                              var43 = var45;
                           }

                           int var68 = -1814161031 * var43.aj;
                           int var47;
                           int var48;
                           int var49;
                           int var50;
                           if (var68 >= 0) {
                              var48 = jm.as.as.aj(var68, (byte)-58);
                              var47 = -1;
                           } else if (var43.ak * -265762545 == 16711935) {
                              var47 = -2;
                              var68 = -1;
                              var48 = -2;
                           } else {
                              var47 = oy.ac(-1283114581 * var43.as, -1450197231 * var43.ae, -1077160877 * var43.am, (byte)-67);
                              var49 = -1283114581 * var43.as + aq * 1620838953 & 255;
                              var50 = al * -53243575 + -1077160877 * var43.am;
                              if (var50 < 0) {
                                 var50 = 0;
                              } else if (var50 > 255) {
                                 var50 = 255;
                              }

                              var48 = oy.ac(var49, var43.ae * -1450197231, var50, (byte)-63);
                           }

                           var49 = 0;
                           if (var48 != -2) {
                              var49 = jm.ap[hp.ad(var48, 96, (short)-4659)];
                           }

                           if (-1 != var43.ay * -1742760383) {
                              var50 = var43.at * -1693258293 + aq * 1620838953 & 255;
                              int var51 = -1789961391 * var43.an + -53243575 * al;
                              if (var51 < 0) {
                                 var51 = 0;
                              } else if (var51 > 255) {
                                 var51 = 255;
                              }

                              var48 = oy.ac(var50, var43.au * -42789891, var51, (byte)31);
                              var49 = jm.ap[hp.ad(var48, 96, (short)-16962)];
                           }

                           var5.ay(var7, var16, var22, var41, var66, var68, var30, var31, var32, var33, dk.ag(var38, var34, -1010824099), dk.ag(var38, var35, 1452510704), dk.ag(var38, var36, -2077719040), dk.ag(var38, var37, 442689445), hp.ad(var47, var34, (short)-31997), hp.ad(var47, var35, (short)-23299), hp.ad(var47, var36, (short)-11107), hp.ad(var47, var37, (short)-786), var40, var49);
                        }
                     }
                  }
               }
            }
         }

         for(var16 = 1; var16 < var2 - 1; ++var16) {
            for(var17 = 1; var17 < var1 - 1; ++var17) {
               var5.ai(var7, var17, var16, cj.ao(var0, var7, var17, var16, (byte)-115));
            }
         }

         aw[var7] = (short[][])null;
         ak[var7] = (short[][])null;
         aj[var7] = (byte[][])null;
         ai[var7] = (byte[][])null;
         ay[var7] = (byte[][])null;
      }

      var5.bz(-50, -10, -50);

      for(var7 = 0; var7 < var1; ++var7) {
         for(var8 = 0; var8 < var2; ++var8) {
            if ((var4[1][var7][var8] & 2) == 2) {
               var5.ak(var7, var8);
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

         for(int var55 = 0; var55 <= var10; ++var55) {
            for(int var56 = 0; var56 <= var2; ++var56) {
               for(int var57 = 0; var57 <= var1; ++var57) {
                  short var60;
                  if (0 != (ua.ao[var55][var57][var56] & var7)) {
                     var14 = var56;
                     var15 = var56;
                     var16 = var55;

                     for(var17 = var55; var14 > 0 && 0 != (ua.ao[var55][var57][var14 - 1] & var7); --var14) {
                     }

                     while(var15 < var2 && 0 != (ua.ao[var55][var57][var15 + 1] & var7)) {
                        ++var15;
                     }

                     label532:
                     while(var16 > 0) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if ((ua.ao[var16 - 1][var57][var18] & var7) == 0) {
                              break label532;
                           }
                        }

                        --var16;
                     }

                     label521:
                     while(var17 < var10) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if (0 == (ua.ao[var17 + 1][var57][var18] & var7)) {
                              break label521;
                           }
                        }

                        ++var17;
                     }

                     var18 = (var17 + 1 - var16) * (1 + (var15 - var14));
                     if (var18 >= 8) {
                        var60 = 240;
                        var20 = var3[var17][var57][var14] - var60;
                        var21 = var3[var16][var57][var14];
                        var5.aj(var10, 1, var57 * 128, var57 * 128, 128 * var14, 128 + var15 * 128, var20, var21);

                        for(var22 = var16; var22 <= var17; ++var22) {
                           for(var23 = var14; var23 <= var15; ++var23) {
                              var10000 = ua.ao[var22][var57];
                              var10000[var23] &= ~var7;
                           }
                        }
                     }
                  }

                  if ((ua.ao[var55][var57][var56] & var8) != 0) {
                     var14 = var57;
                     var15 = var57;
                     var16 = var55;

                     for(var17 = var55; var14 > 0 && (ua.ao[var55][var14 - 1][var56] & var8) != 0; --var14) {
                     }

                     while(var15 < var1 && 0 != (ua.ao[var55][var15 + 1][var56] & var8)) {
                        ++var15;
                     }

                     label585:
                     while(var16 > 0) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if ((ua.ao[var16 - 1][var18][var56] & var8) == 0) {
                              break label585;
                           }
                        }

                        --var16;
                     }

                     label574:
                     while(var17 < var10) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if (0 == (ua.ao[var17 + 1][var18][var56] & var8)) {
                              break label574;
                           }
                        }

                        ++var17;
                     }

                     var18 = (1 + var17 - var16) * (1 + (var15 - var14));
                     if (var18 >= 8) {
                        var60 = 240;
                        var20 = var3[var17][var14][var56] - var60;
                        var21 = var3[var16][var14][var56];
                        var5.aj(var10, 2, var14 * 128, var15 * 128 + 128, var56 * 128, var56 * 128, var20, var21);

                        for(var22 = var16; var22 <= var17; ++var22) {
                           for(var23 = var14; var23 <= var15; ++var23) {
                              var10000 = ua.ao[var22][var23];
                              var10000[var56] &= ~var8;
                           }
                        }
                     }
                  }

                  if ((ua.ao[var55][var57][var56] & var9) != 0) {
                     var14 = var57;
                     var15 = var57;
                     var16 = var56;

                     for(var17 = var56; var16 > 0 && 0 != (ua.ao[var55][var57][var16 - 1] & var9); --var16) {
                     }

                     while(var17 < var2 && (ua.ao[var55][var57][1 + var17] & var9) != 0) {
                        ++var17;
                     }

                     label638:
                     while(var14 > 0) {
                        for(var18 = var16; var18 <= var17; ++var18) {
                           if ((ua.ao[var55][var14 - 1][var18] & var9) == 0) {
                              break label638;
                           }
                        }

                        --var14;
                     }

                     label627:
                     while(var15 < var1) {
                        for(var18 = var16; var18 <= var17; ++var18) {
                           if (0 == (ua.ao[var55][1 + var15][var18] & var9)) {
                              break label627;
                           }
                        }

                        ++var15;
                     }

                     if ((1 + (var15 - var14)) * (1 + (var17 - var16)) >= 4) {
                        var18 = var3[var55][var14][var16];
                        var5.aj(var10, 4, var14 * 128, 128 + 128 * var15, 128 * var16, 128 + 128 * var17, var18, var18);

                        for(var19 = var14; var19 <= var15; ++var19) {
                           for(var20 = var16; var20 <= var17; ++var20) {
                              var10000 = ua.ao[var55][var19];
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

   static final boolean bu(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      vl var4 = new vl(var0);
      int var5 = -1;

      label84:
      while(true) {
         int var6 = var4.dc(2003379317);
         if (0 == var6) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.dq(-579291975);
               if (var9 == 0) {
                  continue label84;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.cy((short)-27674) >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  ir var15 = ei.aw(var5, 888461382);
                  if (var12 != 22 || !client.cl || 0 != var15.av * 266535841 || 1 == var15.ad * -1552861337 || var15.bu) {
                     if (!var15.as((byte)-6)) {
                        client.ie += 2075954535;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.dq(-391462859);
            if (var9 == 0) {
               break;
            }

            var4.cy((short)-18697);
         }
      }
   }

   static final int cn(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = var1 * (var0 & 1293852547) / 846826025;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = -1074981077;
         }

         return (var0 & 1722562052) + var1;
      }
   }

   static final void bb(dn var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      ko[] var11 = var0.ak;
      int var13;
      if (null != var11) {
         for(int var12 = 0; var12 < 8; ++var12) {
            for(var13 = 0; var13 < 8; ++var13) {
               if (var12 + var3 > 0 && var12 + var3 < var11[var2].bn.length && var13 + var4 > 0 && var4 + var13 < var11[var2].bn[var3 + var12].length) {
                  int[] var10000 = var11[var2].bn[var3 + var12];
                  var10000[var13 + var4] &= -1073741825;
               }
            }
         }
      }

      vl var25 = new vl(var1);

      for(var13 = 0; var13 < 4; ++var13) {
         for(int var14 = 0; var14 < 64; ++var14) {
            for(int var15 = 0; var15 < 64; ++var15) {
               if (var13 == var5 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
                  int var18 = var14 & 7;
                  int var19 = var15 & 7;
                  int var20 = var8 & 3;
                  int var17;
                  if (0 == var20) {
                     var17 = var18;
                  } else if (1 == var20) {
                     var17 = var19;
                  } else if (2 == var20) {
                     var17 = 7 - var18;
                  } else {
                     var17 = 7 - var19;
                  }

                  int var21 = var17 + var3;
                  int var22 = var4 + hv.ap(var14 & 7, var15 & 7, var8, (byte)0);
                  int var23 = var9 + var3 + (var14 & 7);
                  int var24 = (var15 & 7) + var10 + var4;
                  ed.as(var0, var25, var2, var21, var22, var23, var24, var8, (byte)-31);
               } else {
                  ed.as(var0, var25, 0, -1, -1, 0, 0, 0, (byte)-45);
               }
            }
         }
      }

   }

   static final void bc(dn var0, vl var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.at;
      byte[][][] var9 = var0.au;
      int var10;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while(true) {
            var10 = var1.ce(1489225956);
            if (var10 == 0) {
               if (0 == var2) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + -1891970964;
                  int var15 = var6 + 556238;
                  int var16 = bz.af(var14 + '넵', -810745428 + var15, 4, (short)-5678) - 128 + (bz.af(10294 + var14, -689333546 + var15, 2, (short)-31485) - 128 >> 1) + (bz.af(var14, var15, 1, (short)-10083) - 128 >> 2);
                  var16 = (int)(0.3D * (double)var16) + -412850727;
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > 60) {
                     var16 = 60;
                  }

                  var17[var4] = -var16 * 8;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
               }
               break;
            }

            if (1 == var10) {
               int var11 = var1.cy((short)-13716);
               if (var11 == 1) {
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
               ak[var2][var3][var4] = (short)var1.cg(-1976917779);
               aj[var2][var3][var4] = (byte)((var10 - 2) / 4);
               ai[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= 1183250092) {
               var9[var2][var3][var4] = (byte)(var10 - -1725259059);
            } else {
               aw[var2][var3][var4] = (short)(var10 - 1468738300);
            }
         }
      } else {
         while(true) {
            var10 = var1.ce(88615966);
            if (0 == var10) {
               break;
            }

            if (var10 == 1) {
               var1.cy((short)-17305);
               break;
            }

            if (var10 <= 398643164) {
               var1.cg(594461574);
            }
         }
      }

   }

   static final void bp(dn var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      ko[] var11 = var0.ak;
      int var13;
      if (null != var11) {
         for(int var12 = 0; var12 < 8; ++var12) {
            for(var13 = 0; var13 < 8; ++var13) {
               if (var12 + var3 > 0 && var12 + var3 < var11[var2].bn.length && var13 + var4 > 0 && var4 + var13 < var11[var2].bn[var3 + var12].length) {
                  int[] var10000 = var11[var2].bn[var3 + var12];
                  var10000[var13 + var4] &= -1073741825;
               }
            }
         }
      }

      vl var25 = new vl(var1);

      for(var13 = 0; var13 < 4; ++var13) {
         for(int var14 = 0; var14 < 64; ++var14) {
            for(int var15 = 0; var15 < 64; ++var15) {
               if (var13 == var5 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
                  int var18 = var14 & 7;
                  int var19 = var15 & 7;
                  int var20 = var8 & 3;
                  int var17;
                  if (0 == var20) {
                     var17 = var18;
                  } else if (1 == var20) {
                     var17 = var19;
                  } else if (2 == var20) {
                     var17 = 7 - var18;
                  } else {
                     var17 = 7 - var19;
                  }

                  int var21 = var17 + var3;
                  int var22 = var4 + hv.ap(var14 & 7, var15 & 7, var8, (byte)0);
                  int var23 = var9 + var3 + (var14 & 7);
                  int var24 = (var15 & 7) + var10 + var4;
                  ed.as(var0, var25, var2, var21, var22, var23, var24, var8, (byte)-52);
               } else {
                  ed.as(var0, var25, 0, -1, -1, 0, 0, 0, (byte)50);
               }
            }
         }
      }

   }

   static final void bz(int[][][] var0, int var1, int var2, int var3) {
      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            var0[var1][var4 + var2][var3 + var5] = 0;
         }
      }

      if (var2 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            var0[var1][var2][var4 + var3] = var0[var1][var2 - 1][var4 + var3];
         }
      }

      if (var3 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            var0[var1][var2 + var4][var3] = var0[var1][var2 + var4][var3 - 1];
         }
      }

      if (var2 > 0 && 0 != var0[var1][var2 - 1][var3]) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
      } else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
         var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
      } else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
      }

   }

   static final void bk(dn var0, int var1, int var2, int var3, int var4) {
      int[][][] var5 = var0.at;
      int var6 = 1587254913 * var0.ai - 1;
      int var7 = var0.ay * -1000264093 - 1;

      for(int var8 = var2; var8 <= var2 + var4; ++var8) {
         for(int var9 = var1; var9 <= var1 + var3; ++var9) {
            if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
               ay[0][var9][var8] = 127;
               if (var1 == var9 && var9 > 0) {
                  var5[0][var9][var8] = var5[0][var9 - 1][var8];
               }

               if (var3 + var1 == var9 && var9 < var6) {
                  var5[0][var9][var8] = var5[0][1 + var9][var8];
               }

               if (var2 == var8 && var8 > 0) {
                  var5[0][var9][var8] = var5[0][var9][var8 - 1];
               }

               if (var4 + var2 == var8 && var8 < var7) {
                  var5[0][var9][var8] = var5[0][var9][1 + var8];
               }
            }
         }
      }

   }

   static final void by(dn var0, vl var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.at;
      byte[][][] var9 = var0.au;
      int var10;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while(true) {
            var10 = var1.ce(1771700636);
            if (var10 == 0) {
               if (0 == var2) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + 524798706;
                  int var15 = var6 + 556238;
                  int var16 = bz.af(var14 + -1012332482, 91923 + var15, 4, (short)3758) - 128 + (bz.af(434307980 + var14, -7724073 + var15, 2, (short)-12903) - 128 >> 1) + (bz.af(var14, var15, 1, (short)3023) - 128 >> 2);
                  var16 = (int)(0.3D * (double)var16) + 35;
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > 60) {
                     var16 = 60;
                  }

                  var17[var4] = -var16 * 8;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
               }
               break;
            }

            if (1 == var10) {
               int var11 = var1.cy((short)-1132);
               if (var11 == 1) {
                  var11 = 0;
               }

               if (var2 == 0) {
                  var8[0][var3][var4] = 8 * -var11;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= -979841926) {
               ak[var2][var3][var4] = (short)var1.cg(2034734838);
               aj[var2][var3][var4] = (byte)((var10 - 2) / 4);
               ai[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= 81) {
               var9[var2][var3][var4] = (byte)(var10 - 49);
            } else {
               aw[var2][var3][var4] = (short)(var10 - -1815314074);
            }
         }
      } else {
         while(true) {
            var10 = var1.ce(1147224800);
            if (0 == var10) {
               break;
            }

            if (var10 == 1) {
               var1.cy((short)-20362);
               break;
            }

            if (var10 <= -1496650796) {
               var1.cg(1722756959);
            }
         }
      }

   }

   static final boolean br(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      vl var4 = new vl(var0);
      int var5 = -1;

      label78:
      while(true) {
         int var6 = var4.dc(1393347397);
         if (0 == var6) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.dq(-2036289110);
               if (var9 == 0) {
                  continue label78;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.cy((short)-4900) >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  ir var15 = ei.aw(var5, 888461382);
                  if (var12 != 22 || !client.cl || 0 != var15.av * 266535841 || 1 == var15.ad * -1552861337 || var15.bu) {
                     if (!var15.as((byte)100)) {
                        client.ie += 2075954535;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.dq(-1910310062);
            if (var9 == 0) {
               break;
            }

            var4.cy((short)-29827);
         }
      }
   }

   static final boolean bn(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      vl var4 = new vl(var0);
      int var5 = -1;

      label78:
      while(true) {
         int var6 = var4.dc(1903008751);
         if (0 == var6) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.dq(884529185);
               if (var9 == 0) {
                  continue label78;
               }

               var7 += var9 - 1;
               int var10 = var7 & -144929902;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.cy((short)-1957) >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if (var13 > 0 && var14 > 0 && var13 < -1964408162 && var14 < 103) {
                  ir var15 = ei.aw(var5, 888461382);
                  if (var12 != 22 || !client.cl || 0 != var15.av * 266535841 || 1 == var15.ad * -1552861337 || var15.bu) {
                     if (!var15.as((byte)91)) {
                        client.ie += 2075954535;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.dq(388150032);
            if (var9 == 0) {
               break;
            }

            var4.cy((short)-11374);
         }
      }
   }

   static final int cl(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = var2 / 2 + (var0 / 4 << 10) + (var1 / 32 << 7);
      return var3;
   }

   static final void bv(dn var0, int var1, int var2, int var3, int var4) {
      int[][][] var5 = var0.at;
      int var6 = 1587254913 * var0.ai - 1;
      int var7 = var0.ay * -1000264093 - 1;

      for(int var8 = var2; var8 <= var2 + var4; ++var8) {
         for(int var9 = var1; var9 <= var1 + var3; ++var9) {
            if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
               ay[0][var9][var8] = 127;
               if (var1 == var9 && var9 > 0) {
                  var5[0][var9][var8] = var5[0][var9 - 1][var8];
               }

               if (var3 + var1 == var9 && var9 < var6) {
                  var5[0][var9][var8] = var5[0][1 + var9][var8];
               }

               if (var2 == var8 && var8 > 0) {
                  var5[0][var9][var8] = var5[0][var9][var8 - 1];
               }

               if (var4 + var2 == var8 && var8 < var7) {
                  var5[0][var9][var8] = var5[0][var9][1 + var8];
               }
            }
         }
      }

   }

   static final void bs(dn var0, byte[] var1, int var2, int var3) {
      vl var4 = new vl(var1);
      int var5 = -1;

      while(true) {
         int var6 = var4.dc(1467100146);
         if (var6 == 0) {
            return;
         }

         var5 += var6;
         int var7 = 0;

         while(true) {
            int var8 = var4.dq(1128772961);
            if (0 == var8) {
               break;
            }

            var7 += var8 - 1;
            int var9 = var7 & -1175198087;
            int var10 = var7 >> 6 & -1277494973;
            int var11 = var7 >> 12;
            int var12 = var4.cy((short)-5729);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = var10 + var2;
            int var16 = var3 + var9;
            if (var15 > 0 && var16 > 0 && var15 < var0.at[0].length - 2 && var16 < var0.at[0][0].length - 2) {
               int var17 = var11;
               if (2 == (var0.au[1][var15][var16] & 2)) {
                  var17 = var11 - 1;
               }

               ko var18 = null;
               if (var17 >= 0 && null != var0.ak) {
                  var18 = var0.ak[var17];
               }

               ei.au(var0, var11, var15, var16, var5, var14, var13, var18, 1072501657);
            }
         }
      }
   }

   static final void bm(dn var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      vl var9 = new vl(var1);
      int var10 = -1;

      while(true) {
         int var11 = var9.dc(1756140472);
         if (var11 == 0) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while(true) {
            int var13 = var9.dq(603559812);
            if (0 == var13) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = var9.cy((short)-17346);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var5 == var16 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) {
               ir var20 = ei.aw(var10, 888461382);
               int var23 = var15 & 7;
               int var24 = var14 & 7;
               int var26 = var20.az * -347110081;
               int var27 = -109800991 * var20.ag;
               int var28;
               if ((var19 & 1) == 1) {
                  var28 = var26;
                  var26 = var27;
                  var27 = var28;
               }

               int var25 = var8 & 3;
               int var22;
               if (0 == var25) {
                  var22 = var23;
               } else if (var25 == 1) {
                  var22 = var24;
               } else if (2 == var25) {
                  var22 = 7 - var23 - (var26 - 1);
               } else {
                  var22 = 7 - var24 - (var27 - 1);
               }

               var28 = var22 + var3;
               int var31 = var15 & 7;
               int var32 = var14 & 7;
               int var34 = -347110081 * var20.az;
               int var35 = var20.ag * -109800991;
               int var36;
               if ((var19 & 1) == 1) {
                  var36 = var34;
                  var34 = var35;
                  var35 = var36;
               }

               int var33 = var8 & 3;
               int var30;
               if (var33 == 0) {
                  var30 = var32;
               } else if (var33 == 1) {
                  var30 = 7 - var31 - (var34 - 1);
               } else if (var33 == 2) {
                  var30 = 7 - var32 - (var35 - 1);
               } else {
                  var30 = var31;
               }

               var36 = var4 + var30;
               if (var28 > 0 && var36 > 0 && var28 < var0.ai * 1587254913 - 1 && var36 < -1000264093 * var0.ay - 1) {
                  int var37 = var2;
                  if (2 == (var0.au[1][var28][var36] & 2)) {
                     var37 = var2 - 1;
                  }

                  ko var38 = null;
                  if (var37 >= 0 && null != var0.ak) {
                     var38 = var0.ak[var37];
                  }

                  ei.au(var0, var2, var28, var36, var10, var8 + var19 & 3, var18, var38, 288240146);
               }
            }
         }
      }
   }

   static final void bt(dn var0, byte[] var1, int var2, int var3) {
      vl var4 = new vl(var1);
      int var5 = -1;

      while(true) {
         int var6 = var4.dc(1714014177);
         if (var6 == 0) {
            return;
         }

         var5 += var6;
         int var7 = 0;

         while(true) {
            int var8 = var4.dq(-2002695949);
            if (0 == var8) {
               break;
            }

            var7 += var8 - 1;
            int var9 = var7 & 63;
            int var10 = var7 >> 6 & 1811584807;
            int var11 = var7 >> 12;
            int var12 = var4.cy((short)-30298);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = var10 + var2;
            int var16 = var3 + var9;
            if (var15 > 0 && var16 > 0 && var15 < var0.at[0].length - 2 && var16 < var0.at[0][0].length - 2) {
               int var17 = var11;
               if (2 == (var0.au[1][var15][var16] & 2)) {
                  var17 = var11 - 1;
               }

               ko var18 = null;
               if (var17 >= 0 && null != var0.ak) {
                  var18 = var0.ak[var17];
               }

               ei.au(var0, var11, var15, var16, var5, var14, var13, var18, 1219297278);
            }
         }
      }
   }

   static final void bd(dn var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      vl var9 = new vl(var1);
      int var10 = -1;

      while(true) {
         int var11 = var9.dc(1717989951);
         if (var11 == 0) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while(true) {
            int var13 = var9.dq(-1183676301);
            if (0 == var13) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = var9.cy((short)-26037);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var5 == var16 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) {
               ir var20 = ei.aw(var10, 888461382);
               int var23 = var15 & 7;
               int var24 = var14 & 7;
               int var26 = var20.az * -52756485;
               int var27 = -1661258641 * var20.ag;
               int var28;
               if ((var19 & 1) == 1) {
                  var28 = var26;
                  var26 = var27;
                  var27 = var28;
               }

               int var25 = var8 & 3;
               int var22;
               if (0 == var25) {
                  var22 = var23;
               } else if (var25 == 1) {
                  var22 = var24;
               } else if (2 == var25) {
                  var22 = 7 - var23 - (var26 - 1);
               } else {
                  var22 = 7 - var24 - (var27 - 1);
               }

               var28 = var22 + var3;
               int var31 = var15 & 7;
               int var32 = var14 & 7;
               int var34 = -347110081 * var20.az;
               int var35 = var20.ag * -109800991;
               int var36;
               if ((var19 & 1) == 1) {
                  var36 = var34;
                  var34 = var35;
                  var35 = var36;
               }

               int var33 = var8 & 3;
               int var30;
               if (var33 == 0) {
                  var30 = var32;
               } else if (var33 == 1) {
                  var30 = 7 - var31 - (var34 - 1);
               } else if (var33 == 2) {
                  var30 = 7 - var32 - (var35 - 1);
               } else {
                  var30 = var31;
               }

               var36 = var4 + var30;
               if (var28 > 0 && var36 > 0 && var28 < var0.ai * 1587254913 - 1 && var36 < -1000264093 * var0.ay - 1) {
                  int var37 = var2;
                  if (2 == (var0.au[1][var28][var36] & 2)) {
                     var37 = var2 - 1;
                  }

                  ko var38 = null;
                  if (var37 >= 0 && null != var0.ak) {
                     var38 = var0.ak[var37];
                  }

                  ei.au(var0, var2, var28, var36, var10, var8 + var19 & 3, var18, var38, -155041612);
               }
            }
         }
      }
   }

   static final void ba(dn var0, int var1, int var2, int var3, int var4, int var5, int var6, ko var7) {
      if (!client.cl || 0 != (var0.au[0][var2][var3] & 2) || (var0.au[var1][var2][var3] & 16) == 0) {
         if (var1 < ap * -101103081) {
            ap = 1659805265 * var1;
         }

         ir var8 = ei.aw(var4, 888461382);
         int var9;
         int var10;
         if (1 != var5 && 3 != var5) {
            var9 = -347110081 * var8.az;
            var10 = var8.ag * -405753207;
         } else {
            var9 = -109800991 * var8.ag;
            var10 = -347110081 * var8.az;
         }

         int var11;
         int var12;
         if (var2 + var9 <= 1587254913 * var0.ai) {
            var11 = var2 + (var9 >> 1);
            var12 = (1 + var9 >> 1) + var2;
         } else {
            var11 = var2;
            var12 = 1 + var2;
         }

         int var13;
         int var14;
         if (var3 + var10 <= var0.ay * -1000264093) {
            var13 = var3 + (var10 >> 1);
            var14 = (1 + var10 >> 1) + var3;
         } else {
            var13 = var3;
            var14 = var3 + 1;
         }

         int[][] var15 = var0.at[var1];
         int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
         int var17 = (var2 << 7) + (var9 << 6);
         int var18 = (var10 << 6) + (var3 << 7);
         long var19 = fd.at(var2, var3, 2, var8.av * 266535841 == 0, var4, -1315723050 * var0.ap, (byte)-46);
         int var21 = (var5 << 6) + var6;
         if (1 == 531867923 * var8.bs) {
            var21 += 256;
         }

         if (var8.ab(-759597315)) {
            fl.aj(var1, var2, var3, var8, var5, (byte)64);
         }

         ji var22 = var0.aw;
         Object var23;
         if (var6 == 22) {
            if (!client.cl || 0 != 266535841 * var8.av || var8.ad * 433582715 == 1 || var8.bu) {
               if (-1 == 1515763081 * var8.aa && null == var8.bm) {
                  var23 = var8.ae(22, var5, var15, var17, var16, var18, -1740276329);
               } else {
                  var23 = new dr(var0, var4, 22, var5, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
               }

               var22.as(var1, var2, var3, var16, (jv)var23, var19, var21);
               if (1 == var8.ad * -987403384 && var7 != null) {
                  var7.ai(var2, var3, -1071575856);
               }

            }
         } else {
            int var24;
            if (10 != var6 && 11 != var6) {
               int[] var10000;
               if (var6 >= 12) {
                  if (var8.aa * 1515763081 == -1 && var8.bm == null) {
                     var23 = var8.ae(var6, var5, var15, var17, var16, var18, -1739786442);
                  } else {
                     var23 = new dr(var0, var4, var6, var5, var1, var2, var3, -203525788 * var8.aa, var8.be, (jv)null);
                  }

                  var22.af(var1, var2, var3, var16, 1, 1, (jv)var23, 0, var19, var21);
                  if (var6 >= 12 && var6 <= 17 && 13 != var6 && var1 > 0) {
                     var10000 = ua.ao[var1][var2];
                     var10000[var3] |= 411241975;
                  }

                  if (var8.ad * -1552861337 != 0 && var7 != null) {
                     var7.ak(var2, var3, var9, var10, var8.ac, (byte)55);
                  }

               } else if (0 == var6) {
                  if (-1 == -1455538278 * var8.aa && null == var8.bm) {
                     var23 = var8.ae(0, var5, var15, var17, var16, var18, -2057446948);
                  } else {
                     var23 = new dr(var0, var4, 0, var5, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
                  }

                  var22.am(var1, var2, var3, var16, (jv)var23, (jv)null, az[var5], 0, var19, var21);
                  if (0 == var5) {
                     if (var8.bq) {
                        ay[var1][var2][var3] = (byte)1857220783;
                        ay[var1][var2][var3 + 1] = (byte)-393016986;
                     }

                     if (var8.al) {
                        var10000 = ua.ao[var1][var2];
                        var10000[var3] |= 585;
                     }
                  } else if (var5 == 1) {
                     if (var8.bq) {
                        ay[var1][var2][var3 + 1] = (byte)1276396401;
                        ay[var1][var2 + 1][1 + var3] = 50;
                     }

                     if (var8.al) {
                        var10000 = ua.ao[var1][var2];
                        var10000[1 + var3] |= 1312787137;
                     }
                  } else if (var5 == 2) {
                     if (var8.bq) {
                        ay[var1][var2 + 1][var3] = 50;
                        ay[var1][var2 + 1][var3 + 1] = (byte)-1562489163;
                     }

                     if (var8.al) {
                        var10000 = ua.ao[var1][var2 + 1];
                        var10000[var3] |= 585;
                     }
                  } else if (var5 == 3) {
                     if (var8.bq) {
                        ay[var1][var2][var3] = 50;
                        ay[var1][var2 + 1][var3] = 50;
                     }

                     if (var8.al) {
                        var10000 = ua.ao[var1][var2];
                        var10000[var3] |= 1170;
                     }
                  }

                  if (0 != var8.ad * -1552861337 && null != var7) {
                     var7.aw(var2, var3, var6, var5, var8.ac, (byte)-108);
                  }

                  if (16 != var8.ah * -1191003775) {
                     var22.ac(var1, var2, var3, var8.ah * -1497041743);
                  }

               } else if (1 == var6) {
                  if (-1 == -1157510294 * var8.aa && var8.bm == null) {
                     var23 = var8.ae(1, var5, var15, var17, var16, var18, -1863750344);
                  } else {
                     var23 = new dr(var0, var4, 1, var5, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
                  }

                  var22.am(var1, var2, var3, var16, (jv)var23, (jv)null, ag[var5], 0, var19, var21);
                  if (var8.bq) {
                     if (0 == var5) {
                        ay[var1][var2][1 + var3] = (byte)1297698949;
                     } else if (var5 == 1) {
                        ay[var1][var2 + 1][var3 + 1] = 50;
                     } else if (2 == var5) {
                        ay[var1][1 + var2][var3] = (byte)2032471085;
                     } else if (var5 == 3) {
                        ay[var1][var2][var3] = 50;
                     }
                  }

                  if (0 != -1552861337 * var8.ad && null != var7) {
                     var7.aw(var2, var3, var6, var5, var8.ac, (byte)-17);
                  }

               } else {
                  int var29;
                  if (var6 == 2) {
                     var29 = 1 + var5 & 3;
                     Object var31;
                     Object var32;
                     if (var8.aa * -603403935 == -1 && var8.bm == null) {
                        var32 = var8.ae(2, 4 + var5, var15, var17, var16, var18, -2079136258);
                        var31 = var8.ae(2, var29, var15, var17, var16, var18, -1919828977);
                     } else {
                        var32 = new dr(var0, var4, 2, var5 + 4, var1, var2, var3, var8.aa * 1515763081, var8.be, (jv)null);
                        var31 = new dr(var0, var4, 2, var29, var1, var2, var3, var8.aa * 1515763081, var8.be, (jv)null);
                     }

                     var22.am(var1, var2, var3, var16, (jv)var32, (jv)var31, az[var5], az[var29], var19, var21);
                     if (var8.al) {
                        if (var5 == 0) {
                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 1560749816;
                           var10000 = ua.ao[var1][var2];
                           var10000[var3 + 1] |= 1170;
                        } else if (var5 == 1) {
                           var10000 = ua.ao[var1][var2];
                           var10000[var3 + 1] |= 1170;
                           var10000 = ua.ao[var1][1 + var2];
                           var10000[var3] |= 585;
                        } else if (var5 == 2) {
                           var10000 = ua.ao[var1][var2 + 1];
                           var10000[var3] |= -1110945838;
                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 1170;
                        } else if (3 == var5) {
                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 1664868712;
                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 585;
                        }
                     }

                     if (0 != var8.ad * -1552861337 && null != var7) {
                        var7.aw(var2, var3, var6, var5, var8.ac, (byte)-57);
                     }

                     if (16 != var8.ah * 1887455252) {
                        var22.ac(var1, var2, var3, 866654055 * var8.ah);
                     }

                  } else if (var6 == 3) {
                     if (328204869 * var8.aa == -1 && null == var8.bm) {
                        var23 = var8.ae(3, var5, var15, var17, var16, var18, -1753069714);
                     } else {
                        var23 = new dr(var0, var4, 3, var5, var1, var2, var3, 1426028626 * var8.aa, var8.be, (jv)null);
                     }

                     var22.am(var1, var2, var3, var16, (jv)var23, (jv)null, ag[var5], 0, var19, var21);
                     if (var8.bq) {
                        if (var5 == 0) {
                           ay[var1][var2][1 + var3] = (byte)1297635399;
                        } else if (var5 == 1) {
                           ay[var1][1 + var2][1 + var3] = (byte)-442203246;
                        } else if (var5 == 2) {
                           ay[var1][var2 + 1][var3] = 50;
                        } else if (var5 == 3) {
                           ay[var1][var2][var3] = 50;
                        }
                     }

                     if (58015345 * var8.ad != 0 && null != var7) {
                        var7.aw(var2, var3, var6, var5, var8.ac, (byte)-100);
                     }

                  } else if (9 == var6) {
                     if (var8.aa * 1515763081 == -1 && var8.bm == null) {
                        var23 = var8.ae(var6, var5, var15, var17, var16, var18, -1833359513);
                     } else {
                        var23 = new dr(var0, var4, var6, var5, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
                     }

                     var22.af(var1, var2, var3, var16, 1, 1, (jv)var23, 0, var19, var21);
                     if (0 != -1552861337 * var8.ad && null != var7) {
                        var7.ak(var2, var3, var9, var10, var8.ac, (byte)-95);
                     }

                     if (var8.ah * -871202120 != 16) {
                        var22.ac(var1, var2, var3, var8.ah * -1497041743);
                     }

                  } else if (4 == var6) {
                     if (-1 == var8.aa * 1292185531 && null == var8.bm) {
                        var23 = var8.ae(4, var5, var15, var17, var16, var18, -1770065823);
                     } else {
                        var23 = new dr(var0, var4, 4, var5, var1, var2, var3, 866472311 * var8.aa, var8.be, (jv)null);
                     }

                     var22.at(var1, var2, var3, var16, (jv)var23, (jv)null, az[var5], 0, 0, 0, var19, var21);
                  } else {
                     long var30;
                     Object var33;
                     if (var6 == 5) {
                        var29 = 16;
                        var30 = var22.bx(var1, var2, var3);
                        if (0L != var30) {
                           var29 = ei.aw(la.ae(var30), 888461382).ah * 911502630;
                        }

                        if (1515763081 * var8.aa == -1 && null == var8.bm) {
                           var33 = var8.ae(4, var5, var15, var17, var16, var18, -1805396140);
                        } else {
                           var33 = new dr(var0, var4, 4, var5, var1, var2, var3, var8.aa * -271091012, var8.be, (jv)null);
                        }

                        var22.at(var1, var2, var3, var16, (jv)var33, (jv)null, az[var5], 0, var29 * ad[var5], ac[var5] * var29, var19, var21);
                     } else if (6 == var6) {
                        var29 = 8;
                        var30 = var22.bx(var1, var2, var3);
                        if (var30 != 0L) {
                           var29 = ei.aw(la.ae(var30), 888461382).ah * -1680509805 / 2;
                        }

                        if (1515763081 * var8.aa == -1 && var8.bm == null) {
                           var33 = var8.ae(4, 4 + var5, var15, var17, var16, var18, -1862990254);
                        } else {
                           var33 = new dr(var0, var4, 4, 4 + var5, var1, var2, var3, var8.aa * -460632992, var8.be, (jv)null);
                        }

                        var22.at(var1, var2, var3, var16, (jv)var33, (jv)null, -1463684062, var5, var29 * av[var5], var29 * ax[var5], var19, var21);
                     } else if (7 == var6) {
                        var24 = 2 + var5 & 3;
                        if (var8.aa * 1515763081 == -1 && var8.bm == null) {
                           var23 = var8.ae(4, 4 + var24, var15, var17, var16, var18, -1942520900);
                        } else {
                           var23 = new dr(var0, var4, 4, var24 + 4, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
                        }

                        var22.at(var1, var2, var3, var16, (jv)var23, (jv)null, 256, var24, 0, 0, var19, var21);
                     } else if (8 == var6) {
                        var29 = 8;
                        var30 = var22.bx(var1, var2, var3);
                        if (0L != var30) {
                           var29 = ei.aw(la.ae(var30), 888461382).ah * 732502892 / 2;
                        }

                        int var28 = var5 + 2 & 3;
                        Object var27;
                        if (-1 == 1226255386 * var8.aa && var8.bm == null) {
                           var33 = var8.ae(4, var5 + 4, var15, var17, var16, var18, -1743093025);
                           var27 = var8.ae(4, 4 + var28, var15, var17, var16, var18, -1828872305);
                        } else {
                           var33 = new dr(var0, var4, 4, var5 + 4, var1, var2, var3, -1253773169 * var8.aa, var8.be, (jv)null);
                           var27 = new dr(var0, var4, 4, var28 + 4, var1, var2, var3, -51220140 * var8.aa, var8.be, (jv)null);
                        }

                        var22.at(var1, var2, var3, var16, (jv)var33, (jv)var27, 2056927596, var5, var29 * av[var5], ax[var5] * var29, var19, var21);
                     }
                  }
               }
            } else {
               if (1515763081 * var8.aa == -1 && null == var8.bm) {
                  var23 = var8.ae(10, var5, var15, var17, var16, var18, -2031922552);
               } else {
                  var23 = new dr(var0, var4, 10, var5, var1, var2, var3, var8.aa * -1137529399, var8.be, (jv)null);
               }

               if (var23 != null && var22.af(var1, var2, var3, var16, var9, var10, (jv)var23, var6 == 11 ? 256 : 0, var19, var21) && var8.bq) {
                  var24 = 15;
                  if (var23 instanceof jy) {
                     var24 = ((jy)var23).af() / 4;
                     if (var24 > 30) {
                        var24 = 30;
                     }
                  }

                  for(int var25 = 0; var25 <= var9; ++var25) {
                     for(int var26 = 0; var26 <= var10; ++var26) {
                        if (var24 > ay[var1][var25 + var2][var26 + var3]) {
                           ay[var1][var25 + var2][var26 + var3] = (byte)var24;
                        }
                     }
                  }
               }

               if (var8.ad * -1552861337 != 0 && null != var7) {
                  var7.ak(var2, var3, var9, var10, var8.ac, (byte)-80);
               }

            }
         }
      }
   }

   static final void bw(dn var0, int var1, int var2, int var3, int var4, int var5, int var6, ko var7) {
      if (!client.cl || 0 != (var0.au[0][var2][var3] & 2) || (var0.au[var1][var2][var3] & 16) == 0) {
         if (var1 < ap * -213423439) {
            ap = 1659805265 * var1;
         }

         ir var8 = ei.aw(var4, 888461382);
         int var9;
         int var10;
         if (1 != var5 && 3 != var5) {
            var9 = -347110081 * var8.az;
            var10 = var8.ag * -109800991;
         } else {
            var9 = -109800991 * var8.ag;
            var10 = -347110081 * var8.az;
         }

         int var11;
         int var12;
         if (var2 + var9 <= 1587254913 * var0.ai) {
            var11 = var2 + (var9 >> 1);
            var12 = (1 + var9 >> 1) + var2;
         } else {
            var11 = var2;
            var12 = 1 + var2;
         }

         int var13;
         int var14;
         if (var3 + var10 <= var0.ay * -1000264093) {
            var13 = var3 + (var10 >> 1);
            var14 = (1 + var10 >> 1) + var3;
         } else {
            var13 = var3;
            var14 = var3 + 1;
         }

         int[][] var15 = var0.at[var1];
         int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
         int var17 = (var2 << 7) + (var9 << 6);
         int var18 = (var10 << 6) + (var3 << 7);
         long var19 = fd.at(var2, var3, 2, var8.av * 266535841 == 0, var4, -1948824391 * var0.ap, (byte)-108);
         int var21 = (var5 << 6) + var6;
         if (1 == 531867923 * var8.bs) {
            var21 += 256;
         }

         if (var8.ab(-759597315)) {
            fl.aj(var1, var2, var3, var8, var5, (byte)4);
         }

         ji var22 = var0.aw;
         Object var23;
         if (var6 == 22) {
            if (!client.cl || 0 != 266535841 * var8.av || var8.ad * -1552861337 == 1 || var8.bu) {
               if (-1 == 1515763081 * var8.aa && null == var8.bm) {
                  var23 = var8.ae(22, var5, var15, var17, var16, var18, -2037196468);
               } else {
                  var23 = new dr(var0, var4, 22, var5, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
               }

               var22.as(var1, var2, var3, var16, (jv)var23, var19, var21);
               if (1 == var8.ad * -1552861337 && var7 != null) {
                  var7.ai(var2, var3, -1064032747);
               }

            }
         } else {
            int var24;
            if (10 != var6 && 11 != var6) {
               int[] var10000;
               if (var6 >= 12) {
                  if (var8.aa * 1515763081 == -1 && var8.bm == null) {
                     var23 = var8.ae(var6, var5, var15, var17, var16, var18, -2050327714);
                  } else {
                     var23 = new dr(var0, var4, var6, var5, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
                  }

                  var22.af(var1, var2, var3, var16, 1, 1, (jv)var23, 0, var19, var21);
                  if (var6 >= 12 && var6 <= 17 && 13 != var6 && var1 > 0) {
                     var10000 = ua.ao[var1][var2];
                     var10000[var3] |= 2340;
                  }

                  if (var8.ad * -1552861337 != 0 && var7 != null) {
                     var7.ak(var2, var3, var9, var10, var8.ac, (byte)-2);
                  }

               } else if (0 == var6) {
                  if (-1 == 1515763081 * var8.aa && null == var8.bm) {
                     var23 = var8.ae(0, var5, var15, var17, var16, var18, -2007385980);
                  } else {
                     var23 = new dr(var0, var4, 0, var5, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
                  }

                  var22.am(var1, var2, var3, var16, (jv)var23, (jv)null, az[var5], 0, var19, var21);
                  if (0 == var5) {
                     if (var8.bq) {
                        ay[var1][var2][var3] = 50;
                        ay[var1][var2][var3 + 1] = 50;
                     }

                     if (var8.al) {
                        var10000 = ua.ao[var1][var2];
                        var10000[var3] |= 585;
                     }
                  } else if (var5 == 1) {
                     if (var8.bq) {
                        ay[var1][var2][var3 + 1] = 50;
                        ay[var1][var2 + 1][1 + var3] = 50;
                     }

                     if (var8.al) {
                        var10000 = ua.ao[var1][var2];
                        var10000[1 + var3] |= 1170;
                     }
                  } else if (var5 == 2) {
                     if (var8.bq) {
                        ay[var1][var2 + 1][var3] = 50;
                        ay[var1][var2 + 1][var3 + 1] = 50;
                     }

                     if (var8.al) {
                        var10000 = ua.ao[var1][var2 + 1];
                        var10000[var3] |= 585;
                     }
                  } else if (var5 == 3) {
                     if (var8.bq) {
                        ay[var1][var2][var3] = 50;
                        ay[var1][var2 + 1][var3] = 50;
                     }

                     if (var8.al) {
                        var10000 = ua.ao[var1][var2];
                        var10000[var3] |= 1170;
                     }
                  }

                  if (0 != var8.ad * -1552861337 && null != var7) {
                     var7.aw(var2, var3, var6, var5, var8.ac, (byte)-20);
                  }

                  if (16 != var8.ah * -1497041743) {
                     var22.ac(var1, var2, var3, var8.ah * -1497041743);
                  }

               } else if (1 == var6) {
                  if (-1 == 1515763081 * var8.aa && var8.bm == null) {
                     var23 = var8.ae(1, var5, var15, var17, var16, var18, -2067554831);
                  } else {
                     var23 = new dr(var0, var4, 1, var5, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
                  }

                  var22.am(var1, var2, var3, var16, (jv)var23, (jv)null, ag[var5], 0, var19, var21);
                  if (var8.bq) {
                     if (0 == var5) {
                        ay[var1][var2][1 + var3] = 50;
                     } else if (var5 == 1) {
                        ay[var1][var2 + 1][var3 + 1] = 50;
                     } else if (2 == var5) {
                        ay[var1][1 + var2][var3] = 50;
                     } else if (var5 == 3) {
                        ay[var1][var2][var3] = 50;
                     }
                  }

                  if (0 != -1552861337 * var8.ad && null != var7) {
                     var7.aw(var2, var3, var6, var5, var8.ac, (byte)-69);
                  }

               } else {
                  int var29;
                  if (var6 == 2) {
                     var29 = 1 + var5 & 3;
                     Object var31;
                     Object var32;
                     if (var8.aa * 1515763081 == -1 && var8.bm == null) {
                        var32 = var8.ae(2, 4 + var5, var15, var17, var16, var18, -2115957009);
                        var31 = var8.ae(2, var29, var15, var17, var16, var18, -1917656857);
                     } else {
                        var32 = new dr(var0, var4, 2, var5 + 4, var1, var2, var3, var8.aa * 1515763081, var8.be, (jv)null);
                        var31 = new dr(var0, var4, 2, var29, var1, var2, var3, var8.aa * 1515763081, var8.be, (jv)null);
                     }

                     var22.am(var1, var2, var3, var16, (jv)var32, (jv)var31, az[var5], az[var29], var19, var21);
                     if (var8.al) {
                        if (var5 == 0) {
                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 585;
                           var10000 = ua.ao[var1][var2];
                           var10000[var3 + 1] |= 1170;
                        } else if (var5 == 1) {
                           var10000 = ua.ao[var1][var2];
                           var10000[var3 + 1] |= 1170;
                           var10000 = ua.ao[var1][1 + var2];
                           var10000[var3] |= 585;
                        } else if (var5 == 2) {
                           var10000 = ua.ao[var1][var2 + 1];
                           var10000[var3] |= 585;
                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 1170;
                        } else if (3 == var5) {
                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 1170;
                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 585;
                        }
                     }

                     if (0 != var8.ad * -1552861337 && null != var7) {
                        var7.aw(var2, var3, var6, var5, var8.ac, (byte)-53);
                     }

                     if (16 != var8.ah * -1497041743) {
                        var22.ac(var1, var2, var3, -1497041743 * var8.ah);
                     }

                  } else if (var6 == 3) {
                     if (1515763081 * var8.aa == -1 && null == var8.bm) {
                        var23 = var8.ae(3, var5, var15, var17, var16, var18, -1924952731);
                     } else {
                        var23 = new dr(var0, var4, 3, var5, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
                     }

                     var22.am(var1, var2, var3, var16, (jv)var23, (jv)null, ag[var5], 0, var19, var21);
                     if (var8.bq) {
                        if (var5 == 0) {
                           ay[var1][var2][1 + var3] = 50;
                        } else if (var5 == 1) {
                           ay[var1][1 + var2][1 + var3] = 50;
                        } else if (var5 == 2) {
                           ay[var1][var2 + 1][var3] = 50;
                        } else if (var5 == 3) {
                           ay[var1][var2][var3] = 50;
                        }
                     }

                     if (-1552861337 * var8.ad != 0 && null != var7) {
                        var7.aw(var2, var3, var6, var5, var8.ac, (byte)-98);
                     }

                  } else if (9 == var6) {
                     if (var8.aa * 1515763081 == -1 && var8.bm == null) {
                        var23 = var8.ae(var6, var5, var15, var17, var16, var18, -2073375696);
                     } else {
                        var23 = new dr(var0, var4, var6, var5, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
                     }

                     var22.af(var1, var2, var3, var16, 1, 1, (jv)var23, 0, var19, var21);
                     if (0 != -1552861337 * var8.ad && null != var7) {
                        var7.ak(var2, var3, var9, var10, var8.ac, (byte)66);
                     }

                     if (var8.ah * -1497041743 != 16) {
                        var22.ac(var1, var2, var3, var8.ah * -1497041743);
                     }

                  } else if (4 == var6) {
                     if (-1 == var8.aa * 1515763081 && null == var8.bm) {
                        var23 = var8.ae(4, var5, var15, var17, var16, var18, -2021197943);
                     } else {
                        var23 = new dr(var0, var4, 4, var5, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
                     }

                     var22.at(var1, var2, var3, var16, (jv)var23, (jv)null, az[var5], 0, 0, 0, var19, var21);
                  } else {
                     long var30;
                     Object var33;
                     if (var6 == 5) {
                        var29 = 16;
                        var30 = var22.bx(var1, var2, var3);
                        if (0L != var30) {
                           var29 = ei.aw(la.ae(var30), 888461382).ah * -1497041743;
                        }

                        if (1515763081 * var8.aa == -1 && null == var8.bm) {
                           var33 = var8.ae(4, var5, var15, var17, var16, var18, -1939985280);
                        } else {
                           var33 = new dr(var0, var4, 4, var5, var1, var2, var3, var8.aa * 1515763081, var8.be, (jv)null);
                        }

                        var22.at(var1, var2, var3, var16, (jv)var33, (jv)null, az[var5], 0, var29 * ad[var5], ac[var5] * var29, var19, var21);
                     } else if (6 == var6) {
                        var29 = 8;
                        var30 = var22.bx(var1, var2, var3);
                        if (var30 != 0L) {
                           var29 = ei.aw(la.ae(var30), 888461382).ah * -1497041743 / 2;
                        }

                        if (1515763081 * var8.aa == -1 && var8.bm == null) {
                           var33 = var8.ae(4, 4 + var5, var15, var17, var16, var18, -1976877226);
                        } else {
                           var33 = new dr(var0, var4, 4, 4 + var5, var1, var2, var3, var8.aa * 1515763081, var8.be, (jv)null);
                        }

                        var22.at(var1, var2, var3, var16, (jv)var33, (jv)null, 256, var5, var29 * av[var5], var29 * ax[var5], var19, var21);
                     } else if (7 == var6) {
                        var24 = 2 + var5 & 3;
                        if (var8.aa * 1515763081 == -1 && var8.bm == null) {
                           var23 = var8.ae(4, 4 + var24, var15, var17, var16, var18, -1792339454);
                        } else {
                           var23 = new dr(var0, var4, 4, var24 + 4, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
                        }

                        var22.at(var1, var2, var3, var16, (jv)var23, (jv)null, 256, var24, 0, 0, var19, var21);
                     } else if (8 == var6) {
                        var29 = 8;
                        var30 = var22.bx(var1, var2, var3);
                        if (0L != var30) {
                           var29 = ei.aw(la.ae(var30), 888461382).ah * -1497041743 / 2;
                        }

                        int var28 = var5 + 2 & 3;
                        Object var27;
                        if (-1 == 1515763081 * var8.aa && var8.bm == null) {
                           var33 = var8.ae(4, var5 + 4, var15, var17, var16, var18, -1741148571);
                           var27 = var8.ae(4, 4 + var28, var15, var17, var16, var18, -1749463816);
                        } else {
                           var33 = new dr(var0, var4, 4, var5 + 4, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
                           var27 = new dr(var0, var4, 4, var28 + 4, var1, var2, var3, 1515763081 * var8.aa, var8.be, (jv)null);
                        }

                        var22.at(var1, var2, var3, var16, (jv)var33, (jv)var27, 256, var5, var29 * av[var5], ax[var5] * var29, var19, var21);
                     }
                  }
               }
            } else {
               if (1515763081 * var8.aa == -1 && null == var8.bm) {
                  var23 = var8.ae(10, var5, var15, var17, var16, var18, -2018863163);
               } else {
                  var23 = new dr(var0, var4, 10, var5, var1, var2, var3, var8.aa * 1515763081, var8.be, (jv)null);
               }

               if (var23 != null && var22.af(var1, var2, var3, var16, var9, var10, (jv)var23, var6 == 11 ? 256 : 0, var19, var21) && var8.bq) {
                  var24 = 15;
                  if (var23 instanceof jy) {
                     var24 = ((jy)var23).af() / 4;
                     if (var24 > 30) {
                        var24 = 30;
                     }
                  }

                  for(int var25 = 0; var25 <= var9; ++var25) {
                     for(int var26 = 0; var26 <= var10; ++var26) {
                        if (var24 > ay[var1][var25 + var2][var26 + var3]) {
                           ay[var1][var25 + var2][var26 + var3] = (byte)var24;
                        }
                     }
                  }
               }

               if (var8.ad * -1552861337 != 0 && null != var7) {
                  var7.ak(var2, var3, var9, var10, var8.ac, (byte)-56);
               }

            }
         }
      }
   }

   static final void bi(dn var0) {
      int var1 = var0.ai * 1587254913;
      int var2 = var0.ay * -1000264093;
      int[][][] var3 = var0.at;
      byte[][][] var4 = var0.au;
      ji var5 = var0.aw;
      ko[] var6 = var0.ak;

      int var7;
      int var8;
      int var9;
      int var10;
      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < var1; ++var8) {
            for(var9 = 0; var9 < var2; ++var9) {
               if (1 == (var0.au[var7][var8][var9] & 1)) {
                  var10 = var7;
                  if (2 == (var0.au[1][var8][var9] & 2)) {
                     var10 = var7 - 1;
                  }

                  if (var10 >= 0 && var6 != null) {
                     var6[var10].aj(var8, var9, (byte)32);
                  }
               }
            }
         }
      }

      aq += ((int)(Math.random() * 5.0D) - 2) * 393163289;
      if (1620838953 * aq < -8) {
         aq = 1149660984;
      }

      if (aq * 1620838953 > 8) {
         aq = -1149660984;
      }

      al += ((int)(Math.random() * 5.0D) - 2) * -316002055;
      if (al * -53243575 < -16) {
         al = 761065584;
      }

      if (al * -53243575 > 16) {
         al = -761065584;
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
         byte[][] var52 = ay[var7];
         boolean var53 = true;
         boolean var54 = true;
         boolean var11 = true;
         boolean var12 = true;
         boolean var13 = true;
         var14 = (int)Math.sqrt(5100.0D);
         var15 = 768 * var14 >> 8;

         int var24;
         for(var16 = 1; var16 < var2 - 1; ++var16) {
            for(var17 = 1; var17 < var1 - 1; ++var17) {
               var18 = var3[var7][1 + var17][var16] - var3[var7][var17 - 1][var16];
               var19 = var3[var7][var17][var16 + 1] - var3[var7][var17][var16 - 1];
               var20 = (int)Math.sqrt((double)(var19 * var19 + var18 * var18 + 65536));
               var21 = (var18 << 8) / var20;
               var22 = 65536 / var20;
               var23 = (var19 << 8) / var20;
               var24 = 96 + (-50 * var21 + -10 * var22 + var23 * -50) / var15;
               int var25 = (var52[var17][var16] >> 1) + (var52[var17][1 + var16] >> 3) + (var52[var17][var16 - 1] >> 2) + (var52[var17 - 1][var16] >> 2) + (var52[var17 + 1][var16] >> 3);
               as[var17][var16] = var24 - var25;
            }
         }

         for(var16 = 0; var16 < var2; ++var16) {
            ae[var16] = 0;
            am[var16] = 0;
            wk.at[var16] = 0;
            cr.au[var16] = 0;
            an[var16] = 0;
         }

         for(var16 = -5; var16 < 5 + var1; ++var16) {
            for(var17 = 0; var17 < var2; ++var17) {
               var18 = 5 + var16;
               int var10002;
               if (var18 >= 0 && var18 < var1) {
                  long var58 = (long)Math.pow(2.0D, 15.0D) - 1L;
                  var21 = (int)var58;
                  var22 = aw[var7][var18][var17] & var21;
                  if (var22 > 0) {
                     hv var61 = dc.aw(var22 - 1, (byte)1);
                     var10000 = ae;
                     var10000[var17] += var61.aj * 1467474647;
                     var10000 = am;
                     var10000[var17] += -767557955 * var61.ai;
                     var10000 = wk.at;
                     var10000[var17] += 1473097783 * var61.ay;
                     var10000 = cr.au;
                     var10000[var17] += 613794733 * var61.as;
                     var10002 = an[var17]++;
                  }
               }

               var19 = var16 - 5;
               if (var19 >= 0 && var19 < var1) {
                  long var59 = (long)Math.pow(2.0D, 15.0D) - 1L;
                  var22 = (int)var59;
                  var23 = aw[var7][var19][var17] & var22;
                  if (var23 > 0) {
                     hv var62 = dc.aw(var23 - 1, (byte)1);
                     var10000 = ae;
                     var10000[var17] -= var62.aj * 1467474647;
                     var10000 = am;
                     var10000[var17] -= -767557955 * var62.ai;
                     var10000 = wk.at;
                     var10000[var17] -= var62.ay * 1473097783;
                     var10000 = cr.au;
                     var10000[var17] -= var62.as * 613794733;
                     var10002 = an[var17]--;
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
                  var23 = 5 + var22;
                  if (var23 >= 0 && var23 < var2) {
                     var17 += ae[var23];
                     var18 += am[var23];
                     var19 += wk.at[var23];
                     var20 += cr.au[var23];
                     var21 += an[var23];
                  }

                  var24 = var22 - 5;
                  if (var24 >= 0 && var24 < var2) {
                     var17 -= ae[var24];
                     var18 -= am[var24];
                     var19 -= wk.at[var24];
                     var20 -= cr.au[var24];
                     var21 -= an[var24];
                  }

                  if (var22 >= 1 && var22 < var2 - 1 && (!client.cl || 0 != (var4[0][var16][var22] & 2) || 0 == (var4[var7][var16][var22] & 16))) {
                     if (var7 < ap * -213423439) {
                        ap = 1659805265 * var7;
                     }

                     long var63 = (long)Math.pow(2.0D, 15.0D) - 1L;
                     int var27 = (int)var63;
                     int var28 = aw[var7][var16][var22] & var27;
                     int var29 = ak[var7][var16][var22] & var27;
                     if (var28 > 0 || var29 > 0) {
                        int var30 = var3[var7][var16][var22];
                        int var31 = var3[var7][var16 + 1][var22];
                        int var32 = var3[var7][1 + var16][var22 + 1];
                        int var33 = var3[var7][var16][var22 + 1];
                        int var34 = as[var16][var22];
                        int var35 = as[1 + var16][var22];
                        int var36 = as[var16 + 1][var22 + 1];
                        int var37 = as[var16][1 + var22];
                        int var38 = -1;
                        int var39 = -1;
                        int var40;
                        int var41;
                        int var42;
                        if (var28 > 0) {
                           var40 = var17 * 256 / var20;
                           var41 = var18 / var21;
                           var42 = var19 / var21;
                           var38 = oy.ac(var40, var41, var42, (byte)32);
                           var40 = var40 + 1620838953 * aq & 255;
                           var42 += al * -53243575;
                           if (var42 < 0) {
                              var42 = 0;
                           } else if (var42 > 255) {
                              var42 = 255;
                           }

                           var39 = oy.ac(var40, var41, var42, (byte)1);
                        }

                        in var43;
                        if (var7 > 0) {
                           boolean var64 = true;
                           if (var28 == 0 && aj[var7][var16][var22] != 0) {
                              var64 = false;
                           }

                           if (var29 > 0) {
                              var42 = var29 - 1;
                              var43 = (in)in.aw.ap((long)var42);
                              in var65;
                              if (null != var43) {
                                 var65 = var43;
                              } else {
                                 byte[] var44 = in.ap.bm(4, var42, 1789454838);
                                 var43 = new in();
                                 if (null != var44) {
                                    var43.ak(new vl(var44), var42, (byte)-75);
                                 }

                                 var43.aw((byte)-15);
                                 in.aw.ak(var43, (long)var42);
                                 var65 = var43;
                              }

                              if (!var65.ai) {
                                 var64 = false;
                              }
                           }

                           if (var64 && var31 == var30 && var32 == var30 && var33 == var30) {
                              var10000 = ua.ao[var7][var16];
                              var10000[var22] |= 2340;
                           }
                        }

                        var40 = 0;
                        if (var39 != -1) {
                           var40 = jm.ap[dk.ag(var39, 96, -112421307)];
                        }

                        if (0 == var29) {
                           var5.ay(var7, var16, var22, 0, 0, -1, var30, var31, var32, var33, dk.ag(var38, var34, -45793076), dk.ag(var38, var35, -868138900), dk.ag(var38, var36, 1385708599), dk.ag(var38, var37, 1226546277), 0, 0, 0, 0, var40, 0);
                        } else {
                           var41 = 1 + aj[var7][var16][var22];
                           byte var66 = ai[var7][var16][var22];
                           int var67 = var29 - 1;
                           in var45 = (in)in.aw.ap((long)var67);
                           if (var45 != null) {
                              var43 = var45;
                           } else {
                              byte[] var46 = in.ap.bm(4, var67, 1989150364);
                              var45 = new in();
                              if (var46 != null) {
                                 var45.ak(new vl(var46), var67, (byte)-22);
                              }

                              var45.aw((byte)97);
                              in.aw.ak(var45, (long)var67);
                              var43 = var45;
                           }

                           int var68 = -1814161031 * var43.aj;
                           int var47;
                           int var48;
                           int var49;
                           int var50;
                           if (var68 >= 0) {
                              var48 = jm.as.as.aj(var68, (byte)-79);
                              var47 = -1;
                           } else if (var43.ak * -265762545 == 16711935) {
                              var47 = -2;
                              var68 = -1;
                              var48 = -2;
                           } else {
                              var47 = oy.ac(-1283114581 * var43.as, -1450197231 * var43.ae, -1077160877 * var43.am, (byte)-114);
                              var49 = -1283114581 * var43.as + aq * 1620838953 & 255;
                              var50 = al * -53243575 + -1077160877 * var43.am;
                              if (var50 < 0) {
                                 var50 = 0;
                              } else if (var50 > 255) {
                                 var50 = 255;
                              }

                              var48 = oy.ac(var49, var43.ae * -1450197231, var50, (byte)-25);
                           }

                           var49 = 0;
                           if (var48 != -2) {
                              var49 = jm.ap[hp.ad(var48, 96, (short)-8836)];
                           }

                           if (-1 != var43.ay * -1742760383) {
                              var50 = var43.at * -1693258293 + aq * 1620838953 & 255;
                              int var51 = -1789961391 * var43.an + -53243575 * al;
                              if (var51 < 0) {
                                 var51 = 0;
                              } else if (var51 > 255) {
                                 var51 = 255;
                              }

                              var48 = oy.ac(var50, var43.au * -42789891, var51, (byte)12);
                              var49 = jm.ap[hp.ad(var48, 96, (short)699)];
                           }

                           var5.ay(var7, var16, var22, var41, var66, var68, var30, var31, var32, var33, dk.ag(var38, var34, -259101881), dk.ag(var38, var35, -98043397), dk.ag(var38, var36, -1347535522), dk.ag(var38, var37, -1186151290), hp.ad(var47, var34, (short)-12439), hp.ad(var47, var35, (short)-16439), hp.ad(var47, var36, (short)-2569), hp.ad(var47, var37, (short)-11060), var40, var49);
                        }
                     }
                  }
               }
            }
         }

         for(var16 = 1; var16 < var2 - 1; ++var16) {
            for(var17 = 1; var17 < var1 - 1; ++var17) {
               var5.ai(var7, var17, var16, cj.ao(var0, var7, var17, var16, (byte)-12));
            }
         }

         aw[var7] = (short[][])null;
         ak[var7] = (short[][])null;
         aj[var7] = (byte[][])null;
         ai[var7] = (byte[][])null;
         ay[var7] = (byte[][])null;
      }

      var5.bz(-50, -10, -50);

      for(var7 = 0; var7 < var1; ++var7) {
         for(var8 = 0; var8 < var2; ++var8) {
            if ((var4[1][var7][var8] & 2) == 2) {
               var5.ak(var7, var8);
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

         for(int var55 = 0; var55 <= var10; ++var55) {
            for(int var56 = 0; var56 <= var2; ++var56) {
               for(int var57 = 0; var57 <= var1; ++var57) {
                  short var60;
                  if (0 != (ua.ao[var55][var57][var56] & var7)) {
                     var14 = var56;
                     var15 = var56;
                     var16 = var55;

                     for(var17 = var55; var14 > 0 && 0 != (ua.ao[var55][var57][var14 - 1] & var7); --var14) {
                     }

                     while(var15 < var2 && 0 != (ua.ao[var55][var57][var15 + 1] & var7)) {
                        ++var15;
                     }

                     label525:
                     while(var16 > 0) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if ((ua.ao[var16 - 1][var57][var18] & var7) == 0) {
                              break label525;
                           }
                        }

                        --var16;
                     }

                     label514:
                     while(var17 < var10) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if (0 == (ua.ao[var17 + 1][var57][var18] & var7)) {
                              break label514;
                           }
                        }

                        ++var17;
                     }

                     var18 = (var17 + 1 - var16) * (1 + (var15 - var14));
                     if (var18 >= 8) {
                        var60 = 240;
                        var20 = var3[var17][var57][var14] - var60;
                        var21 = var3[var16][var57][var14];
                        var5.aj(var10, 1, var57 * 128, var57 * 128, 128 * var14, 128 + var15 * 128, var20, var21);

                        for(var22 = var16; var22 <= var17; ++var22) {
                           for(var23 = var14; var23 <= var15; ++var23) {
                              var10000 = ua.ao[var22][var57];
                              var10000[var23] &= ~var7;
                           }
                        }
                     }
                  }

                  if ((ua.ao[var55][var57][var56] & var8) != 0) {
                     var14 = var57;
                     var15 = var57;
                     var16 = var55;

                     for(var17 = var55; var14 > 0 && (ua.ao[var55][var14 - 1][var56] & var8) != 0; --var14) {
                     }

                     while(var15 < var1 && 0 != (ua.ao[var55][var15 + 1][var56] & var8)) {
                        ++var15;
                     }

                     label578:
                     while(var16 > 0) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if ((ua.ao[var16 - 1][var18][var56] & var8) == 0) {
                              break label578;
                           }
                        }

                        --var16;
                     }

                     label567:
                     while(var17 < var10) {
                        for(var18 = var14; var18 <= var15; ++var18) {
                           if (0 == (ua.ao[var17 + 1][var18][var56] & var8)) {
                              break label567;
                           }
                        }

                        ++var17;
                     }

                     var18 = (1 + var17 - var16) * (1 + (var15 - var14));
                     if (var18 >= 8) {
                        var60 = 240;
                        var20 = var3[var17][var14][var56] - var60;
                        var21 = var3[var16][var14][var56];
                        var5.aj(var10, 2, var14 * 128, var15 * 128 + 128, var56 * 128, var56 * 128, var20, var21);

                        for(var22 = var16; var22 <= var17; ++var22) {
                           for(var23 = var14; var23 <= var15; ++var23) {
                              var10000 = ua.ao[var22][var23];
                              var10000[var56] &= ~var8;
                           }
                        }
                     }
                  }

                  if ((ua.ao[var55][var57][var56] & var9) != 0) {
                     var14 = var57;
                     var15 = var57;
                     var16 = var56;

                     for(var17 = var56; var16 > 0 && 0 != (ua.ao[var55][var57][var16 - 1] & var9); --var16) {
                     }

                     while(var17 < var2 && (ua.ao[var55][var57][1 + var17] & var9) != 0) {
                        ++var17;
                     }

                     label631:
                     while(var14 > 0) {
                        for(var18 = var16; var18 <= var17; ++var18) {
                           if ((ua.ao[var55][var14 - 1][var18] & var9) == 0) {
                              break label631;
                           }
                        }

                        --var14;
                     }

                     label620:
                     while(var15 < var1) {
                        for(var18 = var16; var18 <= var17; ++var18) {
                           if (0 == (ua.ao[var55][1 + var15][var18] & var9)) {
                              break label620;
                           }
                        }

                        ++var15;
                     }

                     if ((1 + (var15 - var14)) * (1 + (var17 - var16)) >= 4) {
                        var18 = var3[var55][var14][var16];
                        var5.aj(var10, 4, var14 * 128, 128 + 128 * var15, 128 * var16, 128 + 128 * var17, var18, var18);

                        for(var19 = var14; var19 <= var15; ++var19) {
                           for(var20 = var16; var20 <= var17; ++var20) {
                              var10000 = ua.ao[var55][var19];
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

   static void aa() {
      aw = (short[][][])null;
      ak = (short[][][])null;
      aj = (byte[][][])null;
      ai = (byte[][][])null;
      ua.ao = (int[][][])null;
      ay = (byte[][][])null;
      as = (int[][])null;
      ae = null;
      am = null;
      wk.at = null;
      cr.au = null;
      an = null;
   }

   static final int bg(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = su.ab(var3, var5, (short)18433);
      int var8 = su.ab(var3 + 1, var5, (short)15130);
      int var9 = su.ab(var3, var5 + 1, (short)18506);
      int var10 = su.ab(var3 + 1, var5 + 1, (short)30266);
      int var11 = ic.ar(var7, var8, var4, var2, -126460872);
      int var12 = ic.ar(var9, var10, var4, var2, 1565720033);
      return ic.ar(var11, var12, var6, var2, -1793235968);
   }

   static final int bl(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - jm.ai[var2 * 1024 / var3] >> 1;
      return ((65536 - var4) * var0 >> 16) + (var1 * var4 >> 16);
   }

   static final int be(int var0, int var1, int var2, int var3) {
      int var4 = 816862314 - jm.ai[var2 * 1024 / var3] >> 1;
      return ((1454461337 - var4) * var0 >> 16) + (var1 * var4 >> 16);
   }

   static final int cq(int var0, int var1) {
      int var2 = ej.az(var0 - 1, var1 - 1, 152287784) + ej.az(1 + var0, var1 - 1, -1154514470) + ej.az(var0 - 1, 1 + var1, -2031240072) + ej.az(1 + var0, 1 + var1, 1284660594);
      int var3 = ej.az(var0 - 1, var1, -356686449) + ej.az(var0 + 1, var1, -154597671) + ej.az(var0, var1 - 1, -1413313463) + ej.az(var0, 1 + var1, -1349674430);
      int var4 = ej.az(var0, var1, -1736217751);
      return var4 / 4 + var2 / 16 + var3 / 8;
   }

   static final int cb(int var0, int var1) {
      int var2 = var0 + 296257399 * var1;
      var2 ^= var2 << 13;
      int var3 = var2 * (789221 + 15731 * var2 * var2) + 1376312589 & -1155930466;
      return var3 >> 19 & 255;
   }

   static final int cd(int var0, int var1) {
      int var2 = var0 + 57 * var1;
      var2 ^= var2 << 13;
      int var3 = var2 * (789221 + 15731 * var2 * var2) + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   static final int ci(int var0, int var1) {
      if (var0 == -1) {
         return -835287728;
      } else {
         var1 = var1 * (var0 & -982516946) / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = -1178085977;
         }

         return (var0 & 499732210) + var1;
      }
   }

   static void ah() {
      aw = (short[][][])null;
      ak = (short[][][])null;
      aj = (byte[][][])null;
      ai = (byte[][][])null;
      ua.ao = (int[][][])null;
      ay = (byte[][][])null;
      as = (int[][])null;
      ae = null;
      am = null;
      wk.at = null;
      cr.au = null;
      an = null;
   }

   static final int co(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 219921650) {
            var1 = 1871608322;
         }

         return var1;
      } else {
         var1 = (var0 & -834807159) * var1 / -1257150366;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & -82836746);
      }
   }

   static final int cf(int var0, int var1) {
      if (var0 == -2) {
         return 1424947733;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > -455946306) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 171965156;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & 880306574);
      }
   }

   static final void bo(dn var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      vl var9 = new vl(var1);
      int var10 = -1;

      while(true) {
         int var11 = var9.dc(1335274730);
         if (var11 == 0) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while(true) {
            int var13 = var9.dq(-1727379741);
            if (0 == var13) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = var9.cy((short)-32730);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var5 == var16 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) {
               ir var20 = ei.aw(var10, 888461382);
               int var23 = var15 & 7;
               int var24 = var14 & 7;
               int var26 = var20.az * -1506665107;
               int var27 = 577701029 * var20.ag;
               int var28;
               if ((var19 & 1) == 1) {
                  var28 = var26;
                  var26 = var27;
                  var27 = var28;
               }

               int var25 = var8 & 3;
               int var22;
               if (0 == var25) {
                  var22 = var23;
               } else if (var25 == 1) {
                  var22 = var24;
               } else if (2 == var25) {
                  var22 = 7 - var23 - (var26 - 1);
               } else {
                  var22 = 7 - var24 - (var27 - 1);
               }

               var28 = var22 + var3;
               int var31 = var15 & 7;
               int var32 = var14 & 7;
               int var34 = -347110081 * var20.az;
               int var35 = var20.ag * -109800991;
               int var36;
               if ((var19 & 1) == 1) {
                  var36 = var34;
                  var34 = var35;
                  var35 = var36;
               }

               int var33 = var8 & 3;
               int var30;
               if (var33 == 0) {
                  var30 = var32;
               } else if (var33 == 1) {
                  var30 = 7 - var31 - (var34 - 1);
               } else if (var33 == 2) {
                  var30 = 7 - var32 - (var35 - 1);
               } else {
                  var30 = var31;
               }

               var36 = var4 + var30;
               if (var28 > 0 && var36 > 0 && var28 < var0.ai * 1587254913 - 1 && var36 < 1391735857 * var0.ay - 1) {
                  int var37 = var2;
                  if (2 == (var0.au[1][var28][var36] & 2)) {
                     var37 = var2 - 1;
                  }

                  ko var38 = null;
                  if (var37 >= 0 && null != var0.ak) {
                     var38 = var0.ak[var37];
                  }

                  ei.au(var0, var2, var28, var36, var10, var8 + var19 & 3, var18, var38, 1984333210);
               }
            }
         }
      }
   }

   static final void bq(dn var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      ko[] var11 = var0.ak;
      int var13;
      if (null != var11) {
         for(int var12 = 0; var12 < 8; ++var12) {
            for(var13 = 0; var13 < 8; ++var13) {
               if (var12 + var3 > 0 && var12 + var3 < var11[var2].bn.length && var13 + var4 > 0 && var4 + var13 < var11[var2].bn[var3 + var12].length) {
                  int[] var10000 = var11[var2].bn[var3 + var12];
                  var10000[var13 + var4] &= -1073741825;
               }
            }
         }
      }

      vl var25 = new vl(var1);

      for(var13 = 0; var13 < 4; ++var13) {
         for(int var14 = 0; var14 < 64; ++var14) {
            for(int var15 = 0; var15 < 64; ++var15) {
               if (var13 == var5 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
                  int var18 = var14 & 7;
                  int var19 = var15 & 7;
                  int var20 = var8 & 3;
                  int var17;
                  if (0 == var20) {
                     var17 = var18;
                  } else if (1 == var20) {
                     var17 = var19;
                  } else if (2 == var20) {
                     var17 = 7 - var18;
                  } else {
                     var17 = 7 - var19;
                  }

                  int var21 = var17 + var3;
                  int var22 = var4 + hv.ap(var14 & 7, var15 & 7, var8, (byte)0);
                  int var23 = var9 + var3 + (var14 & 7);
                  int var24 = (var15 & 7) + var10 + var4;
                  ed.as(var0, var25, var2, var21, var22, var23, var24, var8, (byte)-24);
               } else {
                  ed.as(var0, var25, 0, -1, -1, 0, 0, 0, (byte)15);
               }
            }
         }
      }

   }

   static final int cv(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 1684955541) {
         var1 /= 2;
      }

      if (var2 > 945376154) {
         var1 /= 2;
      }

      if (var2 > 866849077) {
         var1 /= 2;
      }

      int var3 = var2 / 2 + (var0 / 4 << 10) + (var1 / 32 << 7);
      return var3;
   }

   static final void at(dn var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      vl var9 = new vl(var1);
      int var10 = -1;

      while(true) {
         int var11 = var9.dc(1330145045);
         if (var11 == 0) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while(true) {
            int var13 = var9.dq(-340937995);
            if (0 == var13) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = var9.cy((short)-17025);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var5 == var16 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) {
               ir var20 = ei.aw(var10, 888461382);
               int var23 = var15 & 7;
               int var24 = var14 & 7;
               int var26 = var20.az * -347110081;
               int var27 = -109800991 * var20.ag;
               int var28;
               if ((var19 & 1) == 1) {
                  var28 = var26;
                  var26 = var27;
                  var27 = var28;
               }

               int var25 = var8 & 3;
               int var22;
               if (0 == var25) {
                  var22 = var23;
               } else if (var25 == 1) {
                  var22 = var24;
               } else if (2 == var25) {
                  var22 = 7 - var23 - (var26 - 1);
               } else {
                  var22 = 7 - var24 - (var27 - 1);
               }

               var28 = var22 + var3;
               int var31 = var15 & 7;
               int var32 = var14 & 7;
               int var34 = -347110081 * var20.az;
               int var35 = var20.ag * -109800991;
               int var36;
               if ((var19 & 1) == 1) {
                  var36 = var34;
                  var34 = var35;
                  var35 = var36;
               }

               int var33 = var8 & 3;
               int var30;
               if (var33 == 0) {
                  var30 = var32;
               } else if (var33 == 1) {
                  var30 = 7 - var31 - (var34 - 1);
               } else if (var33 == 2) {
                  var30 = 7 - var32 - (var35 - 1);
               } else {
                  var30 = var31;
               }

               var36 = var4 + var30;
               if (var28 > 0 && var36 > 0 && var28 < var0.ai * 1587254913 - 1 && var36 < -1000264093 * var0.ay - 1) {
                  int var37 = var2;
                  if (2 == (var0.au[1][var28][var36] & 2)) {
                     var37 = var2 - 1;
                  }

                  ko var38 = null;
                  if (var37 >= 0 && null != var0.ak) {
                     var38 = var0.ak[var37];
                  }

                  ei.au(var0, var2, var28, var36, var10, var8 + var19 & 3, var18, var38, 890967222);
               }
            }
         }
      }
   }

   static final int cu(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = var2 / 2 + (var0 / 4 << 10) + (var1 / 32 << 7);
      return var3;
   }

   static final void ce(dn var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ko var9) {
      ir var10 = ei.aw(var5, 888461382);
      int var11 = var8 >= 0 ? var8 : 1515763081 * var10.aa;
      int var12;
      int var13;
      if (var6 != 1 && var6 != 3) {
         var12 = -347110081 * var10.az;
         var13 = -109800991 * var10.ag;
      } else {
         var12 = var10.ag * -109800991;
         var13 = -347110081 * var10.az;
      }

      int var14;
      int var15;
      if (var3 + var12 <= var0.ai * 1587254913) {
         var14 = var3 + (var12 >> 1);
         var15 = var3 + (var12 + 1 >> 1);
      } else {
         var14 = var3;
         var15 = var3 + 1;
      }

      int var16;
      int var17;
      if (var13 + var4 <= -1000264093 * var0.ay) {
         var16 = (var13 >> 1) + var4;
         var17 = var4 + (var13 + 1 >> 1);
      } else {
         var16 = var4;
         var17 = var4 + 1;
      }

      int[][] var18 = var0.at[var2];
      int var19 = var18[var15][var17] + var18[var14][var16] + var18[var15][var16] + var18[var14][var17] >> 2;
      int var20 = (var3 << 7) + (var12 << 6);
      int var21 = (var4 << 7) + (var13 << 6);
      ji var22 = var0.aw;
      long var23 = fd.at(var3, var4, 2, var10.av * 266535841 == 0, var5, var0.ap * -1948824391, (byte)-47);
      int var25 = (var6 << 6) + var7;
      if (var10.bs * 531867923 == 1) {
         var25 += 256;
      }

      Object var26;
      if (var7 == 22) {
         if (var11 == -1 && null == var10.bm) {
            var26 = var10.am(22, var6, var18, var20, var19, var21, (byte)-15);
         } else {
            var26 = new dr(var0, var5, 22, var6, var2, var3, var4, var11, var10.be, (jv)null);
         }

         var22.as(var1, var3, var4, var19, (jv)var26, var23, var25);
         if (1 == var10.ad * -1552861337 && var9 != null) {
            var9.ai(var3, var4, -387915249);
         }

      } else if (10 != var7 && 11 != var7) {
         if (var7 >= 12) {
            if (-1 == var11 && var10.bm == null) {
               var26 = var10.am(var7, var6, var18, var20, var19, var21, (byte)34);
            } else {
               var26 = new dr(var0, var5, var7, var6, var2, var3, var4, var11, var10.be, (jv)null);
            }

            var22.af(var1, var3, var4, var19, 1, 1, (jv)var26, 0, var23, var25);
            if (0 != var10.ad * -1552861337 && var9 != null) {
               var9.ak(var3, var4, var12, var13, var10.ac, (byte)25);
            }

         } else if (var7 == 0) {
            if (var11 == -1 && null == var10.bm) {
               var26 = var10.am(0, var6, var18, var20, var19, var21, (byte)-71);
            } else {
               var26 = new dr(var0, var5, 0, var6, var2, var3, var4, var11, var10.be, (jv)null);
            }

            var22.am(var1, var3, var4, var19, (jv)var26, (jv)null, az[var6], 0, var23, var25);
            if (0 != var10.ad * -1552861337 && null != var9) {
               var9.aw(var3, var4, var7, var6, var10.ac, (byte)-24);
            }

         } else if (1 == var7) {
            if (var11 == -1 && null == var10.bm) {
               var26 = var10.am(1, var6, var18, var20, var19, var21, (byte)34);
            } else {
               var26 = new dr(var0, var5, 1, var6, var2, var3, var4, var11, var10.be, (jv)null);
            }

            var22.am(var1, var3, var4, var19, (jv)var26, (jv)null, ag[var6], 0, var23, var25);
            if (0 != -1552861337 * var10.ad && var9 != null) {
               var9.aw(var3, var4, var7, var6, var10.ac, (byte)-110);
            }

         } else {
            int var32;
            if (2 == var7) {
               var32 = 1 + var6 & 3;
               Object var28;
               Object var34;
               if (var11 == -1 && null == var10.bm) {
                  var34 = var10.am(2, 4 + var6, var18, var20, var19, var21, (byte)-39);
                  var28 = var10.am(2, var32, var18, var20, var19, var21, (byte)-20);
               } else {
                  var34 = new dr(var0, var5, 2, var6 + 4, var2, var3, var4, var11, var10.be, (jv)null);
                  var28 = new dr(var0, var5, 2, var32, var2, var3, var4, var11, var10.be, (jv)null);
               }

               var22.am(var1, var3, var4, var19, (jv)var34, (jv)var28, az[var6], az[var32], var23, var25);
               if (0 != var10.ad * -1552861337 && var9 != null) {
                  var9.aw(var3, var4, var7, var6, var10.ac, (byte)-21);
               }

            } else if (var7 == 3) {
               if (var11 == -1 && null == var10.bm) {
                  var26 = var10.am(3, var6, var18, var20, var19, var21, (byte)68);
               } else {
                  var26 = new dr(var0, var5, 3, var6, var2, var3, var4, var11, var10.be, (jv)null);
               }

               var22.am(var1, var3, var4, var19, (jv)var26, (jv)null, ag[var6], 0, var23, var25);
               if (-1552861337 * var10.ad != 0 && null != var9) {
                  var9.aw(var3, var4, var7, var6, var10.ac, (byte)-48);
               }

            } else if (var7 == 9) {
               if (var11 == -1 && null == var10.bm) {
                  var26 = var10.am(var7, var6, var18, var20, var19, var21, (byte)-47);
               } else {
                  var26 = new dr(var0, var5, var7, var6, var2, var3, var4, var11, var10.be, (jv)null);
               }

               var22.af(var1, var3, var4, var19, 1, 1, (jv)var26, 0, var23, var25);
               if (0 != -1552861337 * var10.ad && null != var9) {
                  var9.ak(var3, var4, var12, var13, var10.ac, (byte)42);
               }

            } else if (4 == var7) {
               if (-1 == var11 && null == var10.bm) {
                  var26 = var10.am(4, var6, var18, var20, var19, var21, (byte)-75);
               } else {
                  var26 = new dr(var0, var5, 4, var6, var2, var3, var4, var11, var10.be, (jv)null);
               }

               var22.at(var1, var3, var4, var19, (jv)var26, (jv)null, az[var6], 0, 0, 0, var23, var25);
            } else {
               long var27;
               Object var29;
               if (5 == var7) {
                  var32 = 16;
                  var27 = var22.bx(var1, var3, var4);
                  if (0L != var27) {
                     var32 = ei.aw(la.ae(var27), 888461382).ah * -1497041743;
                  }

                  if (var11 == -1 && null == var10.bm) {
                     var29 = var10.am(4, var6, var18, var20, var19, var21, (byte)6);
                  } else {
                     var29 = new dr(var0, var5, 4, var6, var2, var3, var4, var11, var10.be, (jv)null);
                  }

                  var22.at(var1, var3, var4, var19, (jv)var29, (jv)null, az[var6], 0, var32 * ad[var6], var32 * ac[var6], var23, var25);
               } else if (6 == var7) {
                  var32 = 8;
                  var27 = var22.bx(var1, var3, var4);
                  if (0L != var27) {
                     var32 = ei.aw(la.ae(var27), 888461382).ah * -1497041743 / 2;
                  }

                  if (var11 == -1 && var10.bm == null) {
                     var29 = var10.am(4, 4 + var6, var18, var20, var19, var21, (byte)-58);
                  } else {
                     var29 = new dr(var0, var5, 4, 4 + var6, var2, var3, var4, var11, var10.be, (jv)null);
                  }

                  var22.at(var1, var3, var4, var19, (jv)var29, (jv)null, 256, var6, var32 * av[var6], var32 * ax[var6], var23, var25);
               } else if (7 == var7) {
                  int var33 = 2 + var6 & 3;
                  if (-1 == var11 && var10.bm == null) {
                     var26 = var10.am(4, 4 + var33, var18, var20, var19, var21, (byte)27);
                  } else {
                     var26 = new dr(var0, var5, 4, 4 + var33, var2, var3, var4, var11, var10.be, (jv)null);
                  }

                  var22.at(var1, var3, var4, var19, (jv)var26, (jv)null, 256, var33, 0, 0, var23, var25);
               } else if (var7 == 8) {
                  var32 = 8;
                  var27 = var22.bx(var1, var3, var4);
                  if (var27 != 0L) {
                     var32 = ei.aw(la.ae(var27), 888461382).ah * -1497041743 / 2;
                  }

                  int var31 = var6 + 2 & 3;
                  Object var30;
                  if (-1 == var11 && null == var10.bm) {
                     var29 = var10.am(4, var6 + 4, var18, var20, var19, var21, (byte)8);
                     var30 = var10.am(4, var31 + 4, var18, var20, var19, var21, (byte)20);
                  } else {
                     var29 = new dr(var0, var5, 4, var6 + 4, var2, var3, var4, var11, var10.be, (jv)null);
                     var30 = new dr(var0, var5, 4, var31 + 4, var2, var3, var4, var11, var10.be, (jv)null);
                  }

                  var22.at(var1, var3, var4, var19, (jv)var29, (jv)var30, 256, var6, var32 * av[var6], var32 * ax[var6], var23, var25);
               }
            }
         }
      } else {
         if (-1 == var11 && null == var10.bm) {
            var26 = var10.am(10, var6, var18, var20, var19, var21, (byte)23);
         } else {
            var26 = new dr(var0, var5, 10, var6, var2, var3, var4, var11, var10.be, (jv)null);
         }

         if (var26 != null) {
            var22.af(var1, var3, var4, var19, var12, var13, (jv)var26, 11 == var7 ? 256 : 0, var23, var25);
         }

         if (-1552861337 * var10.ad != 0 && var9 != null) {
            var9.ak(var3, var4, var12, var13, var10.ac, (byte)11);
         }

      }
   }

   static final void bx(dn var0, int var1, int var2, int var3, int var4) {
      int[][][] var5 = var0.at;
      int var6 = 1587254913 * var0.ai - 1;
      int var7 = var0.ay * -1000264093 - 1;

      for(int var8 = var2; var8 <= var2 + var4; ++var8) {
         for(int var9 = var1; var9 <= var1 + var3; ++var9) {
            if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
               ay[0][var9][var8] = 127;
               if (var1 == var9 && var9 > 0) {
                  var5[0][var9][var8] = var5[0][var9 - 1][var8];
               }

               if (var3 + var1 == var9 && var9 < var6) {
                  var5[0][var9][var8] = var5[0][1 + var9][var8];
               }

               if (var2 == var8 && var8 > 0) {
                  var5[0][var9][var8] = var5[0][var9][var8 - 1];
               }

               if (var4 + var2 == var8 && var8 < var7) {
                  var5[0][var9][var8] = var5[0][var9][1 + var8];
               }
            }
         }
      }

   }

   static String ap(int var0, byte var1) {
      try {
         return "<img=" + var0 + ">";
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dg.ap(" + ')');
      }
   }

   public static int ak(int var0, int var1) {
      try {
         return -512 + var0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dg.ak(" + ')');
      }
   }
}
