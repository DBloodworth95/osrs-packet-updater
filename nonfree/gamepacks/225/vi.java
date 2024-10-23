public final class vi {
   static vz at = new vz();
   static final int ax = 1;
   static final int ag = 23;
   static final int ac = 4096;
   static final int am = 0;
   static final int aq = 6;
   static final int af = 50;
   static final int ae = 16;

   static byte ap(vz var0) {
      return (byte)aq(8, var0);
   }

   static void at(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   static void ae(vz var0) {
      byte var2 = var0.ap;
      int var3 = var0.ab * -1112508069;
      int var4 = var0.av * 1900190883;
      int var5 = var0.ay * 1867063413;
      int[] var6 = ci.an;
      int var7 = var0.as * 301199527;
      byte[] var8 = var0.ar;
      int var9 = var0.al * 673297239;
      int var10 = var0.ad * -974107413;
      int var12 = var0.bb * -866973593 + 1;

      label106:
      while(true) {
         if (var3 > 0) {
            while(true) {
               if (var10 == 0) {
                  break label106;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label106;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         while(var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            ++var4;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label106;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            } else {
               if (var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  ++var4;
                  if (var4 != var12) {
                     if (var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        ++var4;
                        if (var4 != var12) {
                           if (var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                           }
                        }
                     }
                  }
                  continue label106;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label106;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.ah * -1167906823;
      var0.ah += (var10 - var10) * -1666127287;
      if (var0.ah * -1167906823 < var13) {
      }

      var0.ap = var2;
      var0.ab = var3 * 2114653907;
      var0.av = var4 * 1830221579;
      var0.ay = var5 * 1746120669;
      ci.an = var6;
      var0.as = var7 * 826455831;
      var0.ar = var8;
      var0.al = var9 * 925296743;
      var0.ad = var10 * 216136643;
   }

   static void ag(vz var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.ai = -481316817;
      if (ci.an == null) {
         ci.an = new int[var0.ai * -587359392];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = am(var0);
            if (var1 == 23) {
               return;
            }

            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = ax(var0);
            if (var1 != 0) {
            }

            var0.ao = 0;
            var1 = am(var0);
            var0.ao = (var0.ao * 1675403187 << 8 | var1 & 255) * 1462314875;
            var1 = am(var0);
            var0.ao = (var0.ao * 1675403187 << 8 | var1 & 255) * 1462314875;
            var1 = am(var0);
            var0.ao = (var0.ao * 1675403187 << 8 | var1 & 255) * 1462314875;

            int var35;
            for(var35 = 0; var35 < 16; ++var35) {
               var1 = ax(var0);
               if (var1 == 1) {
                  var0.bh[var35] = true;
               } else {
                  var0.bh[var35] = false;
               }
            }

            for(var35 = 0; var35 < 256; ++var35) {
               var0.bn[var35] = false;
            }

            int var36;
            for(var35 = 0; var35 < 16; ++var35) {
               if (var0.bh[var35]) {
                  for(var36 = 0; var36 < 16; ++var36) {
                     var1 = ax(var0);
                     if (var1 == 1) {
                        var0.bn[var35 * 16 + var36] = true;
                     }
                  }
               }
            }

            af(var0);
            int var38 = var0.ak * 1281993917 + 2;
            int var39 = aq(3, var0);
            int var40 = aq(15, var0);

            for(var35 = 0; var35 < var40; ++var35) {
               var36 = 0;

               while(true) {
                  var1 = ax(var0);
                  if (var1 == 0) {
                     var0.bs[var35] = (byte)var36;
                     break;
                  }

                  ++var36;
               }
            }

            byte[] var27 = new byte[6];

            byte var29;
            for(var29 = 0; var29 < var39; var27[var29] = var29++) {
            }

            for(var35 = 0; var35 < var40; ++var35) {
               var29 = var0.bs[var35];

               byte var28;
               for(var28 = var27[var29]; var29 > 0; --var29) {
                  var27[var29] = var27[var29 - 1];
               }

               var27[0] = var28;
               var0.bm[var35] = var28;
            }

            int var37;
            for(var37 = 0; var37 < var39; ++var37) {
               int var49 = aq(5, var0);

               for(var35 = 0; var35 < var38; ++var35) {
                  while(true) {
                     var1 = ax(var0);
                     if (var1 == 0) {
                        var0.bw[var37][var35] = (byte)var49;
                        break;
                     }

                     var1 = ax(var0);
                     if (var1 == 0) {
                        ++var49;
                     } else {
                        --var49;
                     }
                  }
               }
            }

            for(var37 = 0; var37 < var39; ++var37) {
               byte var2 = 32;
               byte var3 = 0;

               for(var35 = 0; var35 < var38; ++var35) {
                  if (var0.bw[var37][var35] > var3) {
                     var3 = var0.bw[var37][var35];
                  }

                  if (var0.bw[var37][var35] < var2) {
                     var2 = var0.bw[var37][var35];
                  }
               }

               at(var0.ba[var37], var0.bj[var37], var0.bp[var37], var0.bw[var37], var2, var3, var38);
               var0.by[var37] = var2;
            }

            int var41 = var0.ak * 1281993917 + 1;
            int var42 = -1;
            byte var43 = 0;

            for(var35 = 0; var35 <= 255; ++var35) {
               var0.aj[var35] = 0;
            }

            int var56 = 4095;

            int var54;
            int var55;
            for(var54 = 15; var54 >= 0; --var54) {
               for(var55 = 15; var55 >= 0; --var55) {
                  var0.bx[var56] = (byte)(var54 * 16 + var55);
                  --var56;
               }

               var0.bf[var54] = var56 + 1;
            }

            int var46 = 0;
            byte var53;
            if (var43 == 0) {
               ++var42;
               var43 = 50;
               var53 = var0.bm[var42];
               var22 = var0.by[var53];
               var23 = var0.ba[var53];
               var25 = var0.bp[var53];
               var24 = var0.bj[var53];
            }

            int var44 = var43 - 1;
            int var50 = var22;

            int var51;
            byte var52;
            for(var51 = aq(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
               ++var50;
               var52 = ax(var0);
            }

            int var45 = var25[var51 - var24[var50]];

            while(true) {
               int[] var10000;
               int var10002;
               while(var45 != var41) {
                  if (var45 != 0 && var45 != 1) {
                     int var33 = var45 - 1;
                     int var30;
                     if (var33 < 16) {
                        var30 = var0.bf[0];

                        for(var1 = var0.bx[var30 + var33]; var33 > 3; var33 -= 4) {
                           int var34 = var30 + var33;
                           var0.bx[var34] = var0.bx[var34 - 1];
                           var0.bx[var34 - 1] = var0.bx[var34 - 2];
                           var0.bx[var34 - 2] = var0.bx[var34 - 3];
                           var0.bx[var34 - 3] = var0.bx[var34 - 4];
                        }

                        while(var33 > 0) {
                           var0.bx[var30 + var33] = var0.bx[var30 + var33 - 1];
                           --var33;
                        }

                        var0.bx[var30] = var1;
                     } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = var0.bf[var31] + var32;

                        for(var1 = var0.bx[var30]; var30 > var0.bf[var31]; --var30) {
                           var0.bx[var30] = var0.bx[var30 - 1];
                        }

                        for(var10002 = var0.bf[var31]++; var31 > 0; --var31) {
                           var10002 = var0.bf[var31]--;
                           var0.bx[var0.bf[var31]] = var0.bx[var0.bf[var31 - 1] + 16 - 1];
                        }

                        var10002 = var0.bf[0]--;
                        var0.bx[var0.bf[0]] = var1;
                        if (var0.bf[0] == 0) {
                           var56 = 4095;

                           for(var54 = 15; var54 >= 0; --var54) {
                              for(var55 = 15; var55 >= 0; --var55) {
                                 var0.bx[var56] = var0.bx[var0.bf[var54] + var55];
                                 --var56;
                              }

                              var0.bf[var54] = var56 + 1;
                           }
                        }
                     }

                     var10002 = var0.aj[var0.bd[var1 & 255] & 255]++;
                     ci.an[var46] = var0.bd[var1 & 255] & 255;
                     ++var46;
                     if (var44 == 0) {
                        ++var42;
                        var44 = 50;
                        var53 = var0.bm[var42];
                        var22 = var0.by[var53];
                        var23 = var0.ba[var53];
                        var25 = var0.bp[var53];
                        var24 = var0.bj[var53];
                     }

                     --var44;
                     var50 = var22;

                     for(var51 = aq(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                        ++var50;
                        var52 = ax(var0);
                     }

                     var45 = var25[var51 - var24[var50]];
                  } else {
                     int var47 = -1;
                     int var48 = 1;

                     do {
                        if (var45 == 0) {
                           var47 += 1 * var48;
                        } else if (var45 == 1) {
                           var47 += 2 * var48;
                        }

                        var48 *= 2;
                        if (var44 == 0) {
                           ++var42;
                           var44 = 50;
                           var53 = var0.bm[var42];
                           var22 = var0.by[var53];
                           var23 = var0.ba[var53];
                           var25 = var0.bp[var53];
                           var24 = var0.bj[var53];
                        }

                        --var44;
                        var50 = var22;

                        for(var51 = aq(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                           ++var50;
                           var52 = ax(var0);
                        }

                        var45 = var25[var51 - var24[var50]];
                     } while(var45 == 0 || var45 == 1);

                     ++var47;
                     var1 = var0.bd[var0.bx[var0.bf[0]] & 255];
                     var10000 = var0.aj;

                     for(var10000[var1 & 255] += var47; var47 > 0; --var47) {
                        ci.an[var46] = var1 & 255;
                        ++var46;
                     }
                  }
               }

               var0.ab = 0;
               var0.ap = 0;
               var0.aw[0] = 0;

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.aw[var35] = var0.aj[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; ++var35) {
                  var10000 = var0.aw;
                  var10000[var35] += var0.aw[var35 - 1];
               }

               for(var35 = 0; var35 < var46; ++var35) {
                  var1 = (byte)(ci.an[var35] & 255);
                  var10000 = ci.an;
                  int var10001 = var0.aw[var1 & 255];
                  var10000[var10001] |= var35 << 8;
                  var10002 = var0.aw[var1 & 255]++;
               }

               var0.as = (ci.an[var0.ao * 1675403187] >> 8) * 826455831;
               var0.av = 0;
               var0.as = ci.an[var0.as * 301199527] * 826455831;
               var0.ay = (byte)(var0.as * 301199527 & 255) * 1746120669;
               var0.as = (var0.as * 301199527 >> 8) * 826455831;
               var0.av += 1830221579;
               var0.bb = var46 * 2034471767;
               ae(var0);
               if (var0.av * 1900190883 == var0.bb * -866973593 + 1 && var0.ab * -1112508069 == 0) {
                  var26 = true;
                  break;
               }

               var26 = false;
               break;
            }
         }

         return;
      }
   }

   static byte az(vz var0) {
      return (byte)aq(1, var0);
   }

   static byte aa(vz var0) {
      return (byte)aq(1, var0);
   }

   public static int au(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized(at) {
         at.af = var2;
         at.at = var4 * 1710919955;
         at.ar = var0;
         at.al = 0;
         at.ad = var1 * 216136643;
         at.aa = 0;
         at.az = 0;
         at.au = 0;
         at.ah = 0;
         ag(at);
         var1 -= at.ad * -974107413;
         at.af = null;
         at.ar = null;
         return var1;
      }
   }

   static void af(vz var0) {
      var0.ak = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.bn[var1]) {
            var0.bd[var0.ak * 1281993917] = (byte)var1;
            var0.ak += 802074261;
         }
      }

   }

   static void al(vz var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.ai = -481316817;
      if (ci.an == null) {
         ci.an = new int[var0.ai * -587359392];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = am(var0);
            if (var1 == 23) {
               return;
            }

            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = ax(var0);
            if (var1 != 0) {
            }

            var0.ao = 0;
            var1 = am(var0);
            var0.ao = (var0.ao * 1675403187 << 8 | var1 & 255) * 1462314875;
            var1 = am(var0);
            var0.ao = (var0.ao * 1675403187 << 8 | var1 & 255) * 1462314875;
            var1 = am(var0);
            var0.ao = (var0.ao * 1675403187 << 8 | var1 & 255) * 1462314875;

            int var35;
            for(var35 = 0; var35 < 16; ++var35) {
               var1 = ax(var0);
               if (var1 == 1) {
                  var0.bh[var35] = true;
               } else {
                  var0.bh[var35] = false;
               }
            }

            for(var35 = 0; var35 < 256; ++var35) {
               var0.bn[var35] = false;
            }

            int var36;
            for(var35 = 0; var35 < 16; ++var35) {
               if (var0.bh[var35]) {
                  for(var36 = 0; var36 < 16; ++var36) {
                     var1 = ax(var0);
                     if (var1 == 1) {
                        var0.bn[var35 * 16 + var36] = true;
                     }
                  }
               }
            }

            af(var0);
            int var38 = var0.ak * 1281993917 + 2;
            int var39 = aq(3, var0);
            int var40 = aq(15, var0);

            for(var35 = 0; var35 < var40; ++var35) {
               var36 = 0;

               while(true) {
                  var1 = ax(var0);
                  if (var1 == 0) {
                     var0.bs[var35] = (byte)var36;
                     break;
                  }

                  ++var36;
               }
            }

            byte[] var27 = new byte[6];

            byte var29;
            for(var29 = 0; var29 < var39; var27[var29] = var29++) {
            }

            for(var35 = 0; var35 < var40; ++var35) {
               var29 = var0.bs[var35];

               byte var28;
               for(var28 = var27[var29]; var29 > 0; --var29) {
                  var27[var29] = var27[var29 - 1];
               }

               var27[0] = var28;
               var0.bm[var35] = var28;
            }

            int var37;
            for(var37 = 0; var37 < var39; ++var37) {
               int var49 = aq(5, var0);

               for(var35 = 0; var35 < var38; ++var35) {
                  while(true) {
                     var1 = ax(var0);
                     if (var1 == 0) {
                        var0.bw[var37][var35] = (byte)var49;
                        break;
                     }

                     var1 = ax(var0);
                     if (var1 == 0) {
                        ++var49;
                     } else {
                        --var49;
                     }
                  }
               }
            }

            for(var37 = 0; var37 < var39; ++var37) {
               byte var2 = 32;
               byte var3 = 0;

               for(var35 = 0; var35 < var38; ++var35) {
                  if (var0.bw[var37][var35] > var3) {
                     var3 = var0.bw[var37][var35];
                  }

                  if (var0.bw[var37][var35] < var2) {
                     var2 = var0.bw[var37][var35];
                  }
               }

               at(var0.ba[var37], var0.bj[var37], var0.bp[var37], var0.bw[var37], var2, var3, var38);
               var0.by[var37] = var2;
            }

            int var41 = var0.ak * 1281993917 + 1;
            int var42 = -1;
            byte var43 = 0;

            for(var35 = 0; var35 <= 255; ++var35) {
               var0.aj[var35] = 0;
            }

            int var56 = 4095;

            int var54;
            int var55;
            for(var54 = 15; var54 >= 0; --var54) {
               for(var55 = 15; var55 >= 0; --var55) {
                  var0.bx[var56] = (byte)(var54 * 16 + var55);
                  --var56;
               }

               var0.bf[var54] = var56 + 1;
            }

            int var46 = 0;
            byte var53;
            if (var43 == 0) {
               ++var42;
               var43 = 50;
               var53 = var0.bm[var42];
               var22 = var0.by[var53];
               var23 = var0.ba[var53];
               var25 = var0.bp[var53];
               var24 = var0.bj[var53];
            }

            int var44 = var43 - 1;
            int var50 = var22;

            int var51;
            byte var52;
            for(var51 = aq(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
               ++var50;
               var52 = ax(var0);
            }

            int var45 = var25[var51 - var24[var50]];

            while(true) {
               int[] var10000;
               int var10002;
               while(var45 != var41) {
                  if (var45 != 0 && var45 != 1) {
                     int var33 = var45 - 1;
                     int var30;
                     if (var33 < 16) {
                        var30 = var0.bf[0];

                        for(var1 = var0.bx[var30 + var33]; var33 > 3; var33 -= 4) {
                           int var34 = var30 + var33;
                           var0.bx[var34] = var0.bx[var34 - 1];
                           var0.bx[var34 - 1] = var0.bx[var34 - 2];
                           var0.bx[var34 - 2] = var0.bx[var34 - 3];
                           var0.bx[var34 - 3] = var0.bx[var34 - 4];
                        }

                        while(var33 > 0) {
                           var0.bx[var30 + var33] = var0.bx[var30 + var33 - 1];
                           --var33;
                        }

                        var0.bx[var30] = var1;
                     } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = var0.bf[var31] + var32;

                        for(var1 = var0.bx[var30]; var30 > var0.bf[var31]; --var30) {
                           var0.bx[var30] = var0.bx[var30 - 1];
                        }

                        for(var10002 = var0.bf[var31]++; var31 > 0; --var31) {
                           var10002 = var0.bf[var31]--;
                           var0.bx[var0.bf[var31]] = var0.bx[var0.bf[var31 - 1] + 16 - 1];
                        }

                        var10002 = var0.bf[0]--;
                        var0.bx[var0.bf[0]] = var1;
                        if (var0.bf[0] == 0) {
                           var56 = 4095;

                           for(var54 = 15; var54 >= 0; --var54) {
                              for(var55 = 15; var55 >= 0; --var55) {
                                 var0.bx[var56] = var0.bx[var0.bf[var54] + var55];
                                 --var56;
                              }

                              var0.bf[var54] = var56 + 1;
                           }
                        }
                     }

                     var10002 = var0.aj[var0.bd[var1 & 255] & 255]++;
                     ci.an[var46] = var0.bd[var1 & 255] & 255;
                     ++var46;
                     if (var44 == 0) {
                        ++var42;
                        var44 = 50;
                        var53 = var0.bm[var42];
                        var22 = var0.by[var53];
                        var23 = var0.ba[var53];
                        var25 = var0.bp[var53];
                        var24 = var0.bj[var53];
                     }

                     --var44;
                     var50 = var22;

                     for(var51 = aq(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                        ++var50;
                        var52 = ax(var0);
                     }

                     var45 = var25[var51 - var24[var50]];
                  } else {
                     int var47 = -1;
                     int var48 = 1;

                     do {
                        if (var45 == 0) {
                           var47 += 1 * var48;
                        } else if (var45 == 1) {
                           var47 += 2 * var48;
                        }

                        var48 *= 2;
                        if (var44 == 0) {
                           ++var42;
                           var44 = 50;
                           var53 = var0.bm[var42];
                           var22 = var0.by[var53];
                           var23 = var0.ba[var53];
                           var25 = var0.bp[var53];
                           var24 = var0.bj[var53];
                        }

                        --var44;
                        var50 = var22;

                        for(var51 = aq(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                           ++var50;
                           var52 = ax(var0);
                        }

                        var45 = var25[var51 - var24[var50]];
                     } while(var45 == 0 || var45 == 1);

                     ++var47;
                     var1 = var0.bd[var0.bx[var0.bf[0]] & 255];
                     var10000 = var0.aj;

                     for(var10000[var1 & 255] += var47; var47 > 0; --var47) {
                        ci.an[var46] = var1 & 255;
                        ++var46;
                     }
                  }
               }

               var0.ab = 0;
               var0.ap = 0;
               var0.aw[0] = 0;

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.aw[var35] = var0.aj[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; ++var35) {
                  var10000 = var0.aw;
                  var10000[var35] += var0.aw[var35 - 1];
               }

               for(var35 = 0; var35 < var46; ++var35) {
                  var1 = (byte)(ci.an[var35] & 255);
                  var10000 = ci.an;
                  int var10001 = var0.aw[var1 & 255];
                  var10000[var10001] |= var35 << 8;
                  var10002 = var0.aw[var1 & 255]++;
               }

               var0.as = (ci.an[var0.ao * 1675403187] >> 8) * 826455831;
               var0.av = 0;
               var0.as = ci.an[var0.as * 301199527] * 826455831;
               var0.ay = (byte)(var0.as * 301199527 & 255) * 1746120669;
               var0.as = (var0.as * 301199527 >> 8) * 826455831;
               var0.av += 1830221579;
               var0.bb = var46 * 2034471767;
               ae(var0);
               if (var0.av * 1900190883 == var0.bb * -866973593 + 1 && var0.ab * -1112508069 == 0) {
                  var26 = true;
                  break;
               }

               var26 = false;
               break;
            }
         }

         return;
      }
   }

   public static int ar(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized(at) {
         at.af = var2;
         at.at = var4 * 1710919955;
         at.ar = var0;
         at.al = 0;
         at.ad = var1 * 216136643;
         at.aa = 0;
         at.az = 0;
         at.au = 0;
         at.ah = 0;
         ag(at);
         var1 -= at.ad * -974107413;
         at.af = null;
         at.ar = null;
         return var1;
      }
   }

   static byte am(vz var0) {
      return (byte)aq(8, var0);
   }

   static byte ax(vz var0) {
      return (byte)aq(1, var0);
   }

   static void ad(vz var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.ai = -481316817;
      if (ci.an == null) {
         ci.an = new int[var0.ai * -587359392];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = am(var0);
            if (var1 == 23) {
               return;
            }

            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = am(var0);
            var1 = ax(var0);
            if (var1 != 0) {
            }

            var0.ao = 0;
            var1 = am(var0);
            var0.ao = (var0.ao * 1675403187 << 8 | var1 & 255) * 1462314875;
            var1 = am(var0);
            var0.ao = (var0.ao * 1675403187 << 8 | var1 & 255) * 1462314875;
            var1 = am(var0);
            var0.ao = (var0.ao * 1675403187 << 8 | var1 & 255) * 1462314875;

            int var35;
            for(var35 = 0; var35 < 16; ++var35) {
               var1 = ax(var0);
               if (var1 == 1) {
                  var0.bh[var35] = true;
               } else {
                  var0.bh[var35] = false;
               }
            }

            for(var35 = 0; var35 < 256; ++var35) {
               var0.bn[var35] = false;
            }

            int var36;
            for(var35 = 0; var35 < 16; ++var35) {
               if (var0.bh[var35]) {
                  for(var36 = 0; var36 < 16; ++var36) {
                     var1 = ax(var0);
                     if (var1 == 1) {
                        var0.bn[var35 * 16 + var36] = true;
                     }
                  }
               }
            }

            af(var0);
            int var38 = var0.ak * 1281993917 + 2;
            int var39 = aq(3, var0);
            int var40 = aq(15, var0);

            for(var35 = 0; var35 < var40; ++var35) {
               var36 = 0;

               while(true) {
                  var1 = ax(var0);
                  if (var1 == 0) {
                     var0.bs[var35] = (byte)var36;
                     break;
                  }

                  ++var36;
               }
            }

            byte[] var27 = new byte[6];

            byte var29;
            for(var29 = 0; var29 < var39; var27[var29] = var29++) {
            }

            for(var35 = 0; var35 < var40; ++var35) {
               var29 = var0.bs[var35];

               byte var28;
               for(var28 = var27[var29]; var29 > 0; --var29) {
                  var27[var29] = var27[var29 - 1];
               }

               var27[0] = var28;
               var0.bm[var35] = var28;
            }

            int var37;
            for(var37 = 0; var37 < var39; ++var37) {
               int var49 = aq(5, var0);

               for(var35 = 0; var35 < var38; ++var35) {
                  while(true) {
                     var1 = ax(var0);
                     if (var1 == 0) {
                        var0.bw[var37][var35] = (byte)var49;
                        break;
                     }

                     var1 = ax(var0);
                     if (var1 == 0) {
                        ++var49;
                     } else {
                        --var49;
                     }
                  }
               }
            }

            for(var37 = 0; var37 < var39; ++var37) {
               byte var2 = 32;
               byte var3 = 0;

               for(var35 = 0; var35 < var38; ++var35) {
                  if (var0.bw[var37][var35] > var3) {
                     var3 = var0.bw[var37][var35];
                  }

                  if (var0.bw[var37][var35] < var2) {
                     var2 = var0.bw[var37][var35];
                  }
               }

               at(var0.ba[var37], var0.bj[var37], var0.bp[var37], var0.bw[var37], var2, var3, var38);
               var0.by[var37] = var2;
            }

            int var41 = var0.ak * 1281993917 + 1;
            int var42 = -1;
            byte var43 = 0;

            for(var35 = 0; var35 <= 255; ++var35) {
               var0.aj[var35] = 0;
            }

            int var56 = 4095;

            int var54;
            int var55;
            for(var54 = 15; var54 >= 0; --var54) {
               for(var55 = 15; var55 >= 0; --var55) {
                  var0.bx[var56] = (byte)(var54 * 16 + var55);
                  --var56;
               }

               var0.bf[var54] = var56 + 1;
            }

            int var46 = 0;
            byte var53;
            if (var43 == 0) {
               ++var42;
               var43 = 50;
               var53 = var0.bm[var42];
               var22 = var0.by[var53];
               var23 = var0.ba[var53];
               var25 = var0.bp[var53];
               var24 = var0.bj[var53];
            }

            int var44 = var43 - 1;
            int var50 = var22;

            int var51;
            byte var52;
            for(var51 = aq(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
               ++var50;
               var52 = ax(var0);
            }

            int var45 = var25[var51 - var24[var50]];

            while(true) {
               int[] var10000;
               int var10002;
               while(var45 != var41) {
                  if (var45 != 0 && var45 != 1) {
                     int var33 = var45 - 1;
                     int var30;
                     if (var33 < 16) {
                        var30 = var0.bf[0];

                        for(var1 = var0.bx[var30 + var33]; var33 > 3; var33 -= 4) {
                           int var34 = var30 + var33;
                           var0.bx[var34] = var0.bx[var34 - 1];
                           var0.bx[var34 - 1] = var0.bx[var34 - 2];
                           var0.bx[var34 - 2] = var0.bx[var34 - 3];
                           var0.bx[var34 - 3] = var0.bx[var34 - 4];
                        }

                        while(var33 > 0) {
                           var0.bx[var30 + var33] = var0.bx[var30 + var33 - 1];
                           --var33;
                        }

                        var0.bx[var30] = var1;
                     } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = var0.bf[var31] + var32;

                        for(var1 = var0.bx[var30]; var30 > var0.bf[var31]; --var30) {
                           var0.bx[var30] = var0.bx[var30 - 1];
                        }

                        for(var10002 = var0.bf[var31]++; var31 > 0; --var31) {
                           var10002 = var0.bf[var31]--;
                           var0.bx[var0.bf[var31]] = var0.bx[var0.bf[var31 - 1] + 16 - 1];
                        }

                        var10002 = var0.bf[0]--;
                        var0.bx[var0.bf[0]] = var1;
                        if (var0.bf[0] == 0) {
                           var56 = 4095;

                           for(var54 = 15; var54 >= 0; --var54) {
                              for(var55 = 15; var55 >= 0; --var55) {
                                 var0.bx[var56] = var0.bx[var0.bf[var54] + var55];
                                 --var56;
                              }

                              var0.bf[var54] = var56 + 1;
                           }
                        }
                     }

                     var10002 = var0.aj[var0.bd[var1 & 255] & 255]++;
                     ci.an[var46] = var0.bd[var1 & 255] & 255;
                     ++var46;
                     if (var44 == 0) {
                        ++var42;
                        var44 = 50;
                        var53 = var0.bm[var42];
                        var22 = var0.by[var53];
                        var23 = var0.ba[var53];
                        var25 = var0.bp[var53];
                        var24 = var0.bj[var53];
                     }

                     --var44;
                     var50 = var22;

                     for(var51 = aq(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                        ++var50;
                        var52 = ax(var0);
                     }

                     var45 = var25[var51 - var24[var50]];
                  } else {
                     int var47 = -1;
                     int var48 = 1;

                     do {
                        if (var45 == 0) {
                           var47 += 1 * var48;
                        } else if (var45 == 1) {
                           var47 += 2 * var48;
                        }

                        var48 *= 2;
                        if (var44 == 0) {
                           ++var42;
                           var44 = 50;
                           var53 = var0.bm[var42];
                           var22 = var0.by[var53];
                           var23 = var0.ba[var53];
                           var25 = var0.bp[var53];
                           var24 = var0.bj[var53];
                        }

                        --var44;
                        var50 = var22;

                        for(var51 = aq(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                           ++var50;
                           var52 = ax(var0);
                        }

                        var45 = var25[var51 - var24[var50]];
                     } while(var45 == 0 || var45 == 1);

                     ++var47;
                     var1 = var0.bd[var0.bx[var0.bf[0]] & 255];
                     var10000 = var0.aj;

                     for(var10000[var1 & 255] += var47; var47 > 0; --var47) {
                        ci.an[var46] = var1 & 255;
                        ++var46;
                     }
                  }
               }

               var0.ab = 0;
               var0.ap = 0;
               var0.aw[0] = 0;

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.aw[var35] = var0.aj[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; ++var35) {
                  var10000 = var0.aw;
                  var10000[var35] += var0.aw[var35 - 1];
               }

               for(var35 = 0; var35 < var46; ++var35) {
                  var1 = (byte)(ci.an[var35] & 255);
                  var10000 = ci.an;
                  int var10001 = var0.aw[var1 & 255];
                  var10000[var10001] |= var35 << 8;
                  var10002 = var0.aw[var1 & 255]++;
               }

               var0.as = (ci.an[var0.ao * 1675403187] >> 8) * 826455831;
               var0.av = 0;
               var0.as = ci.an[var0.as * 301199527] * 826455831;
               var0.ay = (byte)(var0.as * 301199527 & 255) * 1746120669;
               var0.as = (var0.as * 301199527 >> 8) * 826455831;
               var0.av += 1830221579;
               var0.bb = var46 * 2034471767;
               ae(var0);
               if (var0.av * 1900190883 == var0.bb * -866973593 + 1 && var0.ab * -1112508069 == 0) {
                  var26 = true;
                  break;
               }

               var26 = false;
               break;
            }
         }

         return;
      }
   }

   static byte ah(vz var0) {
      return (byte)aq(8, var0);
   }

   vi() throws Throwable {
      throw new Error();
   }

   static int aq(int var0, vz var1) {
      while(var1.aa * 147872273 < var0) {
         var1.az = (var1.az * -1099476119 << 8 | var1.af[var1.at * 2043404571] & 255) * 890924249;
         var1.aa += 873379720;
         var1.at += 1710919955;
         var1.au += 1923431569;
         if (var1.au * 1430127729 == 0) {
         }
      }

      int var2 = var1.az * -1099476119 >> var1.aa * 147872273 - var0 & (1 << var0) - 1;
      var1.aa -= var0 * -964569359;
      return var2;
   }

   static byte ab(vz var0) {
      return (byte)aq(1, var0);
   }

   public static int ac(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized(at) {
         at.af = var2;
         at.at = var4 * 1710919955;
         at.ar = var0;
         at.al = 0;
         at.ad = var1 * 216136643;
         at.aa = 0;
         at.az = 0;
         at.au = 0;
         at.ah = 0;
         ag(at);
         var1 -= at.ad * -974107413;
         at.af = null;
         at.ar = null;
         return var1;
      }
   }

   static byte ai(vz var0) {
      return (byte)aq(1, var0);
   }

   static byte ao(vz var0) {
      return (byte)aq(1, var0);
   }

   static int as(int var0, vz var1) {
      while(var1.aa * 147872273 < var0) {
         var1.az = (var1.az * -1099476119 << 8 | var1.af[var1.at * 2043404571] & 255) * 890924249;
         var1.aa += 873379720;
         var1.at += 1710919955;
         var1.au += 1923431569;
         if (var1.au * 1430127729 == 0) {
         }
      }

      int var2 = var1.az * -1099476119 >> var1.aa * 147872273 - var0 & (1 << var0) - 1;
      var1.aa -= var0 * -964569359;
      return var2;
   }

   static int ay(int var0, vz var1) {
      while(var1.aa * 147872273 < var0) {
         var1.az = (var1.az * -1099476119 << 8 | var1.af[var1.at * 2043404571] & 255) * 890924249;
         var1.aa += 873379720;
         var1.at += 1710919955;
         var1.au += 1923431569;
         if (var1.au * 1430127729 == 0) {
         }
      }

      int var2 = var1.az * -1099476119 >> var1.aa * 147872273 - var0 & (1 << var0) - 1;
      var1.aa -= var0 * -964569359;
      return var2;
   }

   static int aj(int var0, vz var1) {
      while(var1.aa * 1927331875 < var0) {
         var1.az = (var1.az * -1099476119 << 8 | var1.af[var1.at * -1911739544] & 255) * 890924249;
         var1.aa += 1611150172;
         var1.at += 1710919955;
         var1.au += 1923431569;
         if (var1.au * 1430127729 == 0) {
         }
      }

      int var2 = var1.az * -1099476119 >> var1.aa * 147872273 - var0 & (1 << var0) - 1;
      var1.aa -= var0 * -964569359;
      return var2;
   }

   static void av(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   static void aw(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }
}
