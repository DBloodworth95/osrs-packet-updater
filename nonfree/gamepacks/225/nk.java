public class nk extends to {
   byte[] ae;
   uu ac = new uu(16);

   public static nk ag(po var0, int var1, int var2) {
      byte[] var3 = var0.bt(var1, var2, (byte)-27);
      return var3 == null ? null : new nk(new vf(var3));
   }

   nk(vf var1) {
      var1.au = (var1.at.length - 3) * -1864458299;
      int var2 = var1.cv(952452697);
      int var3 = var1.ct(-2125110609);
      int var4 = 14 + var2 * 10;
      var1.au = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;

      int var13;
      int var14;
      int var15;
      for(var13 = 0; var13 < var2; ++var13) {
         var14 = -1;

         while(true) {
            var15 = var1.cv(952452697);
            if (var15 != var14) {
               ++var4;
            }

            var14 = var15 & 15;
            if (var15 == 7) {
               break;
            }

            if (var15 == 23) {
               ++var5;
            } else if (var14 == 0) {
               ++var7;
            } else if (var14 == 1) {
               ++var8;
            } else if (var14 == 2) {
               ++var6;
            } else if (var14 == 3) {
               ++var9;
            } else if (var14 == 4) {
               ++var10;
            } else if (var14 == 5) {
               ++var11;
            } else {
               if (var14 != 6) {
                  throw new RuntimeException();
               }

               ++var12;
            }
         }
      }

      var4 += 5 * var5;
      var4 += 2 * (var7 + var8 + var6 + var9 + var11);
      var4 += var10 + var12;
      var13 = var1.au * -1027766515;
      var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(var15 = 0; var15 < var14; ++var15) {
         var1.dk((byte)16);
      }

      var4 += var1.au * -1027766515 - var13;
      var15 = var1.au * -1027766515;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;

      int var29;
      for(var29 = 0; var29 < var6; ++var29) {
         var28 = var28 + var1.cv(952452697) & 127;
         if (var28 != 0 && var28 != 32) {
            if (var28 == 1) {
               ++var16;
            } else if (var28 == 33) {
               ++var17;
            } else if (var28 == 7) {
               ++var18;
            } else if (var28 == 39) {
               ++var19;
            } else if (var28 == 10) {
               ++var20;
            } else if (var28 == 42) {
               ++var21;
            } else if (var28 == 99) {
               ++var22;
            } else if (var28 == 98) {
               ++var23;
            } else if (var28 == 101) {
               ++var24;
            } else if (var28 == 100) {
               ++var25;
            } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
               ++var27;
            } else {
               ++var26;
            }
         } else {
            ++var12;
         }
      }

      var29 = 0;
      int var30 = var1.au * -1027766515;
      var1.au += var26 * -1864458299;
      int var31 = var1.au * -1027766515;
      var1.au += var11 * -1864458299;
      int var32 = var1.au * -1027766515;
      var1.au += var10 * -1864458299;
      int var33 = var1.au * -1027766515;
      var1.au += var9 * -1864458299;
      int var34 = var1.au * -1027766515;
      var1.au += var16 * -1864458299;
      int var35 = var1.au * -1027766515;
      var1.au += var18 * -1864458299;
      int var36 = var1.au * -1027766515;
      var1.au += var20 * -1864458299;
      int var37 = var1.au * -1027766515;
      var1.au += (var7 + var8 + var11) * -1864458299;
      int var38 = var1.au * -1027766515;
      var1.au += var7 * -1864458299;
      int var39 = var1.au * -1027766515;
      var1.au += var27 * -1864458299;
      int var40 = var1.au * -1027766515;
      var1.au += var8 * -1864458299;
      int var41 = var1.au * -1027766515;
      var1.au += var17 * -1864458299;
      int var42 = var1.au * -1027766515;
      var1.au += var19 * -1864458299;
      int var43 = var1.au * -1027766515;
      var1.au += var21 * -1864458299;
      int var44 = var1.au * -1027766515;
      var1.au += var12 * -1864458299;
      int var45 = var1.au * -1027766515;
      var1.au += var9 * -1864458299;
      int var46 = var1.au * -1027766515;
      var1.au += var22 * -1864458299;
      int var47 = var1.au * -1027766515;
      var1.au += var23 * -1864458299;
      int var48 = var1.au * -1027766515;
      var1.au += var24 * -1864458299;
      int var49 = var1.au * -1027766515;
      var1.au += var25 * -1864458299;
      int var50 = var1.au * -1027766515;
      var1.au += var5 * -1298407601;
      this.ae = new byte[var4];
      vf var51 = new vf(this.ae);
      var51.bv(1297377380, 1812505070);
      var51.bv(6, 1892865131);
      var51.br(var2 > 1 ? 1 : 0, 1625888552);
      var51.br(var2, 1625888552);
      var51.br(var3, 1625888552);
      var1.au = var13 * -1864458299;
      int var52 = 0;
      int var53 = 0;
      int var54 = 0;
      int var55 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;
      int[] var59 = new int[128];
      var28 = 0;
      int[] var60 = new int[16];
      int[] var61 = new int[16];
      var61[9] = 128;
      var60[9] = 128;

      label395:
      for(int var63 = 0; var63 < var2; ++var63) {
         var51.bv(1297379947, 879003941);
         var51.au += 1132101396;
         int var64 = var51.au * -1027766515;
         int var65 = var64;
         int var66 = -1;

         while(true) {
            while(true) {
               int var67 = var1.dk((byte)16);
               var51.co(var67, (byte)90);
               var65 += var67;
               int var68 = var1.at[var29++] & 255;
               boolean var69 = var68 != var66;
               var66 = var68 & 15;
               if (var68 == 7) {
                  if (var69) {
                     var51.bu(255, (byte)62);
                  }

                  var51.bu(47, (byte)-47);
                  var51.bu(0, (byte)37);
                  var51.cj(var51.au * -1027766515 - var64, 806318733);
                  continue label395;
               }

               if (var68 == 23) {
                  if (var69) {
                     var51.bu(255, (byte)59);
                  }

                  var51.bu(81, (byte)96);
                  var51.bu(3, (byte)-68);
                  var51.bu(var1.at[var50++], (byte)-6);
                  var51.bu(var1.at[var50++], (byte)-62);
                  var51.bu(var1.at[var50++], (byte)12);
               } else {
                  var52 ^= var68 >> 4;
                  int var71;
                  int var74;
                  if (var66 == 0) {
                     if (var69) {
                        var51.bu(144 + var52, (byte)-52);
                     }

                     var53 += var1.at[var37++];
                     var54 += var1.at[var38++];
                     var74 = var53 & 127;
                     var71 = var54 & 127;
                     var51.bu(var74, (byte)-84);
                     var51.bu(var71, (byte)-100);
                     if (var71 > 0) {
                        int var72 = var61[var52];
                        nv var73 = (nv)this.ac.ac((long)var72);
                        if (var73 == null) {
                           var73 = new nv(var65);
                           this.ac.ag(var73, (long)var72);
                        }

                        var73.ae.set(var74);
                     }
                  } else if (var66 == 1) {
                     if (var69) {
                        var51.bu(128 + var52, (byte)18);
                     }

                     var53 += var1.at[var37++];
                     var55 += var1.at[var40++];
                     var51.bu(var53 & 127, (byte)42);
                     var51.bu(var55 & 127, (byte)38);
                  } else {
                     byte var70;
                     if (var66 == 2) {
                        if (var69) {
                           var51.bu(176 + var52, (byte)-40);
                        }

                        var28 = var28 + var1.at[var15++] & 127;
                        var51.bu(var28, (byte)-33);
                        if (var28 != 0 && var28 != 32) {
                           if (var28 == 1) {
                              var70 = var1.at[var34++];
                           } else if (var28 == 33) {
                              var70 = var1.at[var41++];
                           } else if (var28 == 7) {
                              var70 = var1.at[var35++];
                           } else if (var28 == 39) {
                              var70 = var1.at[var42++];
                           } else if (var28 == 10) {
                              var70 = var1.at[var36++];
                           } else if (var28 == 42) {
                              var70 = var1.at[var43++];
                           } else if (var28 == 99) {
                              var70 = var1.at[var46++];
                           } else if (var28 == 98) {
                              var70 = var1.at[var47++];
                           } else if (var28 == 101) {
                              var70 = var1.at[var48++];
                           } else if (var28 == 100) {
                              var70 = var1.at[var49++];
                           } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
                              var70 = var1.at[var39++];
                           } else {
                              var70 = var1.at[var30++];
                           }
                        } else {
                           var70 = var1.at[var44++];
                        }

                        var74 = var70 + var59[var28];
                        var59[var28] = var74;
                        var71 = var74 & 127;
                        var51.bu(var71, (byte)88);
                        if (var28 == 0) {
                           var60[var52] = (var60[var52] & -2080769) + (var71 << 14);
                        }

                        if (var28 == 32) {
                           var60[var52] = (var60[var52] & -16257) + (var71 << 7);
                        }
                     } else if (var66 == 3) {
                        if (var69) {
                           var51.bu(224 + var52, (byte)-32);
                        }

                        var56 += var1.at[var45++];
                        var56 += var1.at[var33++] << 7;
                        var51.bu(var56 & 127, (byte)40);
                        var51.bu(var56 >> 7 & 127, (byte)-79);
                     } else if (var66 == 4) {
                        if (var69) {
                           var51.bu(208 + var52, (byte)-103);
                        }

                        var57 += var1.at[var32++];
                        var51.bu(var57 & 127, (byte)8);
                     } else if (var66 == 5) {
                        if (var69) {
                           var51.bu(160 + var52, (byte)84);
                        }

                        var53 += var1.at[var37++];
                        var58 += var1.at[var31++];
                        var51.bu(var53 & 127, (byte)-43);
                        var51.bu(var58 & 127, (byte)-21);
                     } else {
                        if (var66 != 6) {
                           throw new RuntimeException();
                        }

                        if (var69) {
                           var51.bu(192 + var52, (byte)55);
                        }

                        var70 = var1.at[var44++];
                        var61[var52] = var60[var52] + var70;
                        var51.bu(var70, (byte)-51);
                     }
                  }
               }
            }
         }
      }

   }

   public static nk ae(po var0, int var1, int var2) {
      byte[] var3 = var0.bt(var1, var2, (byte)-20);
      return var3 == null ? null : new nk(new vf(var3));
   }

   public static nk ac(po var0, int var1, int var2) {
      byte[] var3 = var0.bt(var1, var2, (byte)76);
      return var3 == null ? null : new nk(new vf(var3));
   }
}
