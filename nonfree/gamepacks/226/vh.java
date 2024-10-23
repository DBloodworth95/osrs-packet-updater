public final class vh {
   static final int ai = 1;
   static final int aw = 16;
   static final int ak = 23;
   static vk ae = new vk();
   static final int aj = 0;
   static final int ay = 6;
   static final int as = 50;
   static final int ap = 4096;

   public static int ap(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized(ae) {
         ae.as = var2;
         ae.ae = var4 * 993137861;
         ae.at = var0;
         ae.au = 0;
         ae.an = var1 * -17188833;
         ae.az = 0;
         ae.ab = 0;
         ae.am = 0;
         ae.ao = 0;
         ak(ae);
         var1 -= ae.an * 1336394719;
         ae.as = null;
         ae.at = null;
         return var1;
      }
   }

   static void ad(vk var0) {
      var0.ah = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.bh[var1]) {
            var0.bv[var0.ah * 683982757] = (byte)var1;
            var0.ah += 777743607;
         }
      }

   }

   static void ae(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
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

   static int ay(int var0, vk var1) {
      while(var1.az * -1641847111 < var0) {
         var1.ab = (var1.ab * 561692771 << 8 | var1.as[var1.ae * 1105480205] & 255) * -524959413;
         var1.az += 1574304840;
         var1.ae += 993137861;
         var1.am += 1548575093;
         if (var1.am * -1159878947 == 0) {
         }
      }

      int var2 = var1.ab * 561692771 >> var1.az * -1641847111 - var0 & (1 << var0) - 1;
      var1.az -= var0 * 1807400841;
      return var2;
   }

   static byte ai(vk var0) {
      return (byte)ay(1, var0);
   }

   static void ak(vk var0) {
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
      var0.ag = -1742876201;
      if (fn.aa == null) {
         fn.aa = new int[var0.ag * -466281888];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = aj(var0);
            if (var1 == 23) {
               return;
            }

            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = ai(var0);
            if (var1 != 0) {
            }

            var0.ad = 0;
            var1 = aj(var0);
            var0.ad = (var0.ad * 1223097369 << 8 | var1 & 255) * -1891459031;
            var1 = aj(var0);
            var0.ad = (var0.ad * 1223097369 << 8 | var1 & 255) * -1891459031;
            var1 = aj(var0);
            var0.ad = (var0.ad * 1223097369 << 8 | var1 & 255) * -1891459031;

            int var35;
            for(var35 = 0; var35 < 16; ++var35) {
               var1 = ai(var0);
               if (var1 == 1) {
                  var0.bj[var35] = true;
               } else {
                  var0.bj[var35] = false;
               }
            }

            for(var35 = 0; var35 < 256; ++var35) {
               var0.bh[var35] = false;
            }

            int var36;
            for(var35 = 0; var35 < 16; ++var35) {
               if (var0.bj[var35]) {
                  for(var36 = 0; var36 < 16; ++var36) {
                     var1 = ai(var0);
                     if (var1 == 1) {
                        var0.bh[var35 * 16 + var36] = true;
                     }
                  }
               }
            }

            as(var0);
            int var38 = var0.ah * -315812665 + 2;
            int var39 = ay(3, var0);
            int var40 = ay(15, var0);

            for(var35 = 0; var35 < var40; ++var35) {
               var36 = 0;

               while(true) {
                  var1 = ai(var0);
                  if (var1 == 0) {
                     var0.bq[var35] = (byte)var36;
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
               var29 = var0.bq[var35];

               byte var28;
               for(var28 = var27[var29]; var29 > 0; --var29) {
                  var27[var29] = var27[var29 - 1];
               }

               var27[0] = var28;
               var0.bb[var35] = var28;
            }

            int var37;
            for(var37 = 0; var37 < var39; ++var37) {
               int var49 = ay(5, var0);

               for(var35 = 0; var35 < var38; ++var35) {
                  while(true) {
                     var1 = ai(var0);
                     if (var1 == 0) {
                        var0.bp[var37][var35] = (byte)var49;
                        break;
                     }

                     var1 = ai(var0);
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
                  if (var0.bp[var37][var35] > var3) {
                     var3 = var0.bp[var37][var35];
                  }

                  if (var0.bp[var37][var35] < var2) {
                     var2 = var0.bp[var37][var35];
                  }
               }

               ae(var0.bz[var37], var0.bc[var37], var0.by[var37], var0.bp[var37], var2, var3, var38);
               var0.br[var37] = var2;
            }

            int var41 = var0.ah * -315812665 + 1;
            int var42 = -1;
            byte var43 = 0;

            for(var35 = 0; var35 <= 255; ++var35) {
               var0.ax[var35] = 0;
            }

            int var56 = 4095;

            int var54;
            int var55;
            for(var54 = 15; var54 >= 0; --var54) {
               for(var55 = 15; var55 >= 0; --var55) {
                  var0.bx[var56] = (byte)(var54 * 16 + var55);
                  --var56;
               }

               var0.bk[var54] = var56 + 1;
            }

            int var46 = 0;
            byte var53;
            if (var43 == 0) {
               ++var42;
               var43 = 50;
               var53 = var0.bb[var42];
               var22 = var0.br[var53];
               var23 = var0.bz[var53];
               var25 = var0.by[var53];
               var24 = var0.bc[var53];
            }

            int var44 = var43 - 1;
            int var50 = var22;

            int var51;
            byte var52;
            for(var51 = ay(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
               ++var50;
               var52 = ai(var0);
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
                        var30 = var0.bk[0];

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
                        var30 = var0.bk[var31] + var32;

                        for(var1 = var0.bx[var30]; var30 > var0.bk[var31]; --var30) {
                           var0.bx[var30] = var0.bx[var30 - 1];
                        }

                        for(var10002 = var0.bk[var31]++; var31 > 0; --var31) {
                           var10002 = var0.bk[var31]--;
                           var0.bx[var0.bk[var31]] = var0.bx[var0.bk[var31 - 1] + 16 - 1];
                        }

                        var10002 = var0.bk[0]--;
                        var0.bx[var0.bk[0]] = var1;
                        if (var0.bk[0] == 0) {
                           var56 = 4095;

                           for(var54 = 15; var54 >= 0; --var54) {
                              for(var55 = 15; var55 >= 0; --var55) {
                                 var0.bx[var56] = var0.bx[var0.bk[var54] + var55];
                                 --var56;
                              }

                              var0.bk[var54] = var56 + 1;
                           }
                        }
                     }

                     var10002 = var0.ax[var0.bv[var1 & 255] & 255]++;
                     fn.aa[var46] = var0.bv[var1 & 255] & 255;
                     ++var46;
                     if (var44 == 0) {
                        ++var42;
                        var44 = 50;
                        var53 = var0.bb[var42];
                        var22 = var0.br[var53];
                        var23 = var0.bz[var53];
                        var25 = var0.by[var53];
                        var24 = var0.bc[var53];
                     }

                     --var44;
                     var50 = var22;

                     for(var51 = ay(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                        ++var50;
                        var52 = ai(var0);
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
                           var53 = var0.bb[var42];
                           var22 = var0.br[var53];
                           var23 = var0.bz[var53];
                           var25 = var0.by[var53];
                           var24 = var0.bc[var53];
                        }

                        --var44;
                        var50 = var22;

                        for(var51 = ay(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                           ++var50;
                           var52 = ai(var0);
                        }

                        var45 = var25[var51 - var24[var50]];
                     } while(var45 == 0 || var45 == 1);

                     ++var47;
                     var1 = var0.bv[var0.bx[var0.bk[0]] & 255];
                     var10000 = var0.ax;

                     for(var10000[var1 & 255] += var47; var47 > 0; --var47) {
                        fn.aa[var46] = var1 & 255;
                        ++var46;
                     }
                  }
               }

               var0.ar = 0;
               var0.af = 0;
               var0.al[0] = 0;

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.al[var35] = var0.ax[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; ++var35) {
                  var10000 = var0.al;
                  var10000[var35] += var0.al[var35 - 1];
               }

               for(var35 = 0; var35 < var46; ++var35) {
                  var1 = (byte)(fn.aa[var35] & 255);
                  var10000 = fn.aa;
                  int var10001 = var0.al[var1 & 255];
                  var10000[var10001] |= var35 << 8;
                  var10002 = var0.al[var1 & 255]++;
               }

               var0.ac = (fn.aa[var0.ad * 1223097369] >> 8) * 605778137;
               var0.aq = 0;
               var0.ac = fn.aa[var0.ac * 686952297] * 605778137;
               var0.av = (byte)(var0.ac * 686952297 & 255) * -1176819735;
               var0.ac = (var0.ac * 686952297 >> 8) * 605778137;
               var0.aq += 285947357;
               var0.bn = var46 * 1678800793;
               aw(var0);
               if (var0.aq * 1826671221 == var0.bn * 635497641 + 1 && var0.ar * -2035058081 == 0) {
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

   static void as(vk var0) {
      var0.ah = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.bh[var1]) {
            var0.bv[var0.ah * -315812665] = (byte)var1;
            var0.ah += 777743607;
         }
      }

   }

   static void aw(vk var0) {
      byte var2 = var0.af;
      int var3 = var0.ar * -2035058081;
      int var4 = var0.aq * 1826671221;
      int var5 = var0.av * 2114068569;
      int[] var6 = fn.aa;
      int var7 = var0.ac * 686952297;
      byte[] var8 = var0.at;
      int var9 = var0.au * -52477679;
      int var10 = var0.an * 1336394719;
      int var12 = var0.bn * 635497641 + 1;

      label113:
      while(true) {
         if (var3 > 0) {
            while(true) {
               if (var10 == 0) {
                  break label113;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label113;
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
                  break label113;
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
                  continue label113;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label113;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.ao * -1018743397;
      var0.ao += (var10 - var10) * 1391732883;
      if (var0.ao * -1018743397 < var13) {
      }

      var0.af = var2;
      var0.ar = var3 * 1836540319;
      var0.aq = var4 * 285947357;
      var0.av = var5 * -1176819735;
      fn.aa = var6;
      var0.ac = var7 * 605778137;
      var0.at = var8;
      var0.au = var9 * 1489489905;
      var0.an = var10 * -17188833;
   }

   static void au(vk var0) {
      byte var2 = var0.af;
      int var3 = var0.ar * -2035058081;
      int var4 = var0.aq * 1826671221;
      int var5 = var0.av * 2114068569;
      int[] var6 = fn.aa;
      int var7 = var0.ac * 686952297;
      byte[] var8 = var0.at;
      int var9 = var0.au * -52477679;
      int var10 = var0.an * 1336394719;
      int var12 = var0.bn * 635497641 + 1;

      label111:
      while(true) {
         if (var3 > 0) {
            while(true) {
               if (var10 == 0) {
                  break label111;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label111;
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
                  break label111;
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
                  continue label111;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label111;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.ao * -1018743397;
      var0.ao += (var10 - var10) * 1391732883;
      if (var0.ao * -1018743397 < var13) {
      }

      var0.af = var2;
      var0.ar = var3 * 1836540319;
      var0.aq = var4 * 285947357;
      var0.av = var5 * -1176819735;
      fn.aa = var6;
      var0.ac = var7 * 605778137;
      var0.at = var8;
      var0.au = var9 * 1489489905;
      var0.an = var10 * -17188833;
   }

   public static int am(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized(ae) {
         ae.as = var2;
         ae.ae = var4 * 993137861;
         ae.at = var0;
         ae.au = 0;
         ae.an = var1 * -17188833;
         ae.az = 0;
         ae.ab = 0;
         ae.am = 0;
         ae.ao = 0;
         ak(ae);
         var1 -= ae.an * 1234745957;
         ae.as = null;
         ae.at = null;
         return var1;
      }
   }

   vh() throws Throwable {
      throw new Error();
   }

   static void av(vk var0) {
      var0.ah = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.bh[var1]) {
            var0.bv[var0.ah * -315812665] = (byte)var1;
            var0.ah += 777743607;
         }
      }

   }

   static void an(vk var0) {
      byte var2 = var0.af;
      int var3 = var0.ar * -2035058081;
      int var4 = var0.aq * 1826671221;
      int var5 = var0.av * 2114068569;
      int[] var6 = fn.aa;
      int var7 = var0.ac * 686952297;
      byte[] var8 = var0.at;
      int var9 = var0.au * -52477679;
      int var10 = var0.an * 1336394719;
      int var12 = var0.bn * 635497641 + 1;

      label111:
      while(true) {
         if (var3 > 0) {
            while(true) {
               if (var10 == 0) {
                  break label111;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label111;
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
                  break label111;
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
                  continue label111;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label111;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.ao * -1018743397;
      var0.ao += (var10 - var10) * 1391732883;
      if (var0.ao * -1018743397 < var13) {
      }

      var0.af = var2;
      var0.ar = var3 * 1836540319;
      var0.aq = var4 * 285947357;
      var0.av = var5 * -1176819735;
      fn.aa = var6;
      var0.ac = var7 * 605778137;
      var0.at = var8;
      var0.au = var9 * 1489489905;
      var0.an = var10 * -17188833;
   }

   static void ao(vk var0) {
      byte var2 = var0.af;
      int var3 = var0.ar * -2035058081;
      int var4 = var0.aq * 1826671221;
      int var5 = var0.av * 2114068569;
      int[] var6 = fn.aa;
      int var7 = var0.ac * 686952297;
      byte[] var8 = var0.at;
      int var9 = var0.au * -52477679;
      int var10 = var0.an * 1336394719;
      int var12 = var0.bn * 635497641 + 1;

      label113:
      while(true) {
         if (var3 > 0) {
            while(true) {
               if (var10 == 0) {
                  break label113;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label113;
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
                  break label113;
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
                  continue label113;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label113;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.ao * -1018743397;
      var0.ao += (var10 - var10) * 1391732883;
      if (var0.ao * -1018743397 < var13) {
      }

      var0.af = var2;
      var0.ar = var3 * 1836540319;
      var0.aq = var4 * 285947357;
      var0.av = var5 * -1176819735;
      fn.aa = var6;
      var0.ac = var7 * 605778137;
      var0.at = var8;
      var0.au = var9 * 1489489905;
      var0.an = var10 * -17188833;
   }

   static void af(vk var0) {
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
      var0.ag = -1742876201;
      if (fn.aa == null) {
         fn.aa = new int[var0.ag * -1468135453];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = aj(var0);
            if (var1 == 23) {
               return;
            }

            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = aj(var0);
            var1 = ai(var0);
            if (var1 != 0) {
            }

            var0.ad = 0;
            var1 = aj(var0);
            var0.ad = (var0.ad * -1851081902 << 8 | var1 & 255) * -1891459031;
            var1 = aj(var0);
            var0.ad = (var0.ad * 1223097369 << 8 | var1 & 225688681) * 445687735;
            var1 = aj(var0);
            var0.ad = (var0.ad * -804735132 << 8 | var1 & -773700453) * -1891459031;

            int var35;
            for(var35 = 0; var35 < 16; ++var35) {
               var1 = ai(var0);
               if (var1 == 1) {
                  var0.bj[var35] = true;
               } else {
                  var0.bj[var35] = false;
               }
            }

            for(var35 = 0; var35 < 823232346; ++var35) {
               var0.bh[var35] = false;
            }

            int var36;
            for(var35 = 0; var35 < 16; ++var35) {
               if (var0.bj[var35]) {
                  for(var36 = 0; var36 < 16; ++var36) {
                     var1 = ai(var0);
                     if (var1 == 1) {
                        var0.bh[var35 * 16 + var36] = true;
                     }
                  }
               }
            }

            as(var0);
            int var38 = var0.ah * -315812665 + 2;
            int var39 = ay(3, var0);
            int var40 = ay(15, var0);

            for(var35 = 0; var35 < var40; ++var35) {
               var36 = 0;

               while(true) {
                  var1 = ai(var0);
                  if (var1 == 0) {
                     var0.bq[var35] = (byte)var36;
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
               var29 = var0.bq[var35];

               byte var28;
               for(var28 = var27[var29]; var29 > 0; --var29) {
                  var27[var29] = var27[var29 - 1];
               }

               var27[0] = var28;
               var0.bb[var35] = var28;
            }

            int var37;
            for(var37 = 0; var37 < var39; ++var37) {
               int var49 = ay(5, var0);

               for(var35 = 0; var35 < var38; ++var35) {
                  while(true) {
                     var1 = ai(var0);
                     if (var1 == 0) {
                        var0.bp[var37][var35] = (byte)var49;
                        break;
                     }

                     var1 = ai(var0);
                     if (var1 == 0) {
                        ++var49;
                     } else {
                        --var49;
                     }
                  }
               }
            }

            for(var37 = 0; var37 < var39; ++var37) {
               int var2 = 1698336863;
               byte var3 = 0;

               for(var35 = 0; var35 < var38; ++var35) {
                  if (var0.bp[var37][var35] > var3) {
                     var3 = var0.bp[var37][var35];
                  }

                  if (var0.bp[var37][var35] < var2) {
                     var2 = var0.bp[var37][var35];
                  }
               }

               ae(var0.bz[var37], var0.bc[var37], var0.by[var37], var0.bp[var37], var2, var3, var38);
               var0.br[var37] = var2;
            }

            int var41 = var0.ah * -315812665 + 1;
            int var42 = -1;
            byte var43 = 0;

            for(var35 = 0; var35 <= 255; ++var35) {
               var0.ax[var35] = 0;
            }

            int var56 = 1616174457;

            int var54;
            int var55;
            for(var54 = 15; var54 >= 0; --var54) {
               for(var55 = 15; var55 >= 0; --var55) {
                  var0.bx[var56] = (byte)(var54 * 16 + var55);
                  --var56;
               }

               var0.bk[var54] = var56 + 1;
            }

            int var46 = 0;
            byte var53;
            if (var43 == 0) {
               ++var42;
               var43 = 50;
               var53 = var0.bb[var42];
               var22 = var0.br[var53];
               var23 = var0.bz[var53];
               var25 = var0.by[var53];
               var24 = var0.bc[var53];
            }

            int var44 = var43 - 1;
            int var50 = var22;

            int var51;
            byte var52;
            for(var51 = ay(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
               ++var50;
               var52 = ai(var0);
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
                        var30 = var0.bk[0];

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
                        var30 = var0.bk[var31] + var32;

                        for(var1 = var0.bx[var30]; var30 > var0.bk[var31]; --var30) {
                           var0.bx[var30] = var0.bx[var30 - 1];
                        }

                        for(var10002 = var0.bk[var31]++; var31 > 0; --var31) {
                           var10002 = var0.bk[var31]--;
                           var0.bx[var0.bk[var31]] = var0.bx[var0.bk[var31 - 1] + 16 - 1];
                        }

                        var10002 = var0.bk[0]--;
                        var0.bx[var0.bk[0]] = var1;
                        if (var0.bk[0] == 0) {
                           var56 = -791989954;

                           for(var54 = 15; var54 >= 0; --var54) {
                              for(var55 = 15; var55 >= 0; --var55) {
                                 var0.bx[var56] = var0.bx[var0.bk[var54] + var55];
                                 --var56;
                              }

                              var0.bk[var54] = var56 + 1;
                           }
                        }
                     }

                     var10002 = var0.ax[var0.bv[var1 & 1056452299] & 255]++;
                     fn.aa[var46] = var0.bv[var1 & 255] & 255;
                     ++var46;
                     if (var44 == 0) {
                        ++var42;
                        var44 = -1108413605;
                        var53 = var0.bb[var42];
                        var22 = var0.br[var53];
                        var23 = var0.bz[var53];
                        var25 = var0.by[var53];
                        var24 = var0.bc[var53];
                     }

                     --var44;
                     var50 = var22;

                     for(var51 = ay(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                        ++var50;
                        var52 = ai(var0);
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
                           var44 = 1840265054;
                           var53 = var0.bb[var42];
                           var22 = var0.br[var53];
                           var23 = var0.bz[var53];
                           var25 = var0.by[var53];
                           var24 = var0.bc[var53];
                        }

                        --var44;
                        var50 = var22;

                        for(var51 = ay(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                           ++var50;
                           var52 = ai(var0);
                        }

                        var45 = var25[var51 - var24[var50]];
                     } while(var45 == 0 || var45 == 1);

                     ++var47;
                     var1 = var0.bv[var0.bx[var0.bk[0]] & 255];
                     var10000 = var0.ax;

                     for(var10000[var1 & 255] += var47; var47 > 0; --var47) {
                        fn.aa[var46] = var1 & 1417868742;
                        ++var46;
                     }
                  }
               }

               var0.ar = 0;
               var0.af = 0;
               var0.al[0] = 0;

               for(var35 = 1; var35 <= 221710980; ++var35) {
                  var0.al[var35] = var0.ax[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; ++var35) {
                  var10000 = var0.al;
                  var10000[var35] += var0.al[var35 - 1];
               }

               for(var35 = 0; var35 < var46; ++var35) {
                  var1 = (byte)(fn.aa[var35] & 138280832);
                  var10000 = fn.aa;
                  int var10001 = var0.al[var1 & 255];
                  var10000[var10001] |= var35 << 8;
                  var10002 = var0.al[var1 & -235508254]++;
               }

               var0.ac = (fn.aa[var0.ad * 1223097369] >> 8) * 1487706323;
               var0.aq = 0;
               var0.ac = fn.aa[var0.ac * -358311338] * 605778137;
               var0.av = (byte)(var0.ac * 686952297 & 1851310696) * -286745720;
               var0.ac = (var0.ac * 686952297 >> 8) * 605778137;
               var0.aq += -2086129231;
               var0.bn = var46 * -405039997;
               aw(var0);
               if (var0.aq * 1826671221 == var0.bn * -1306962203 + 1 && var0.ar * -513207566 == 0) {
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

   static byte ar(vk var0) {
      return (byte)ay(1, var0);
   }

   public static int at(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized(ae) {
         ae.as = var2;
         ae.ae = var4 * 993137861;
         ae.at = var0;
         ae.au = 0;
         ae.an = var1 * -17188833;
         ae.az = 0;
         ae.ab = 0;
         ae.am = 0;
         ae.ao = 0;
         ak(ae);
         var1 -= ae.an * 1336394719;
         ae.as = null;
         ae.at = null;
         return var1;
      }
   }

   static int az(int var0, vk var1) {
      while(var1.az * -1641847111 < var0) {
         var1.ab = (var1.ab * 561692771 << 8 | var1.as[var1.ae * 1105480205] & 255) * -524959413;
         var1.az += 1574304840;
         var1.ae += 993137861;
         var1.am += 1548575093;
         if (var1.am * -1159878947 == 0) {
         }
      }

      int var2 = var1.ab * 561692771 >> var1.az * -1641847111 - var0 & (1 << var0) - 1;
      var1.az -= var0 * 1807400841;
      return var2;
   }

   static int ag(int var0, vk var1) {
      while(var1.az * -178054457 < var0) {
         var1.ab = (var1.ab * 635619153 << 8 | var1.as[var1.ae * 1105480205] & 959323921) * 1296684899;
         var1.az += 1574304840;
         var1.ae += -1160279811;
         var1.am += 1548575093;
         if (var1.am * 1087534276 == 0) {
         }
      }

      int var2 = var1.ab * 2092960862 >> var1.az * -1641847111 - var0 & (1 << var0) - 1;
      var1.az -= var0 * -1971299375;
      return var2;
   }

   static byte ab(vk var0) {
      return (byte)ay(1, var0);
   }

   static void ac(vk var0) {
      var0.ah = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.bh[var1]) {
            var0.bv[var0.ah * -315812665] = (byte)var1;
            var0.ah += 777743607;
         }
      }

   }

   static byte aj(vk var0) {
      return (byte)ay(8, var0);
   }

   static void ax(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
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

   static void aq(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
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
