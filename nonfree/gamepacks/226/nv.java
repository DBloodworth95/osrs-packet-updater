public class nv extends tw {
   byte[] aw;
   ud ap = new ud(16);

   public static nv ak(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 988742454);
      return var3 == null ? null : new nv(new vl(var3));
   }

   nv(vl var1) {
      var1.am = (var1.ae.length - 3) * -725588083;
      int var2 = var1.cy((short)-32576);
      int var3 = var1.ce(1302904210);
      int var4 = 14 + var2 * 10;
      var1.am = 0;
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
            var15 = var1.cy((short)-13392);
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
      var13 = var1.am * -1689308347;
      var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(var15 = 0; var15 < var14; ++var15) {
         var1.dh((byte)-5);
      }

      var4 += var1.am * -1689308347 - var13;
      var15 = var1.am * -1689308347;
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
         var28 = var28 + var1.cy((short)-2339) & 127;
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
      int var30 = var1.am * -1689308347;
      var1.am += var26 * -725588083;
      int var31 = var1.am * -1689308347;
      var1.am += var11 * -725588083;
      int var32 = var1.am * -1689308347;
      var1.am += var10 * -725588083;
      int var33 = var1.am * -1689308347;
      var1.am += var9 * -725588083;
      int var34 = var1.am * -1689308347;
      var1.am += var16 * -725588083;
      int var35 = var1.am * -1689308347;
      var1.am += var18 * -725588083;
      int var36 = var1.am * -1689308347;
      var1.am += var20 * -725588083;
      int var37 = var1.am * -1689308347;
      var1.am += (var7 + var8 + var11) * -725588083;
      int var38 = var1.am * -1689308347;
      var1.am += var7 * -725588083;
      int var39 = var1.am * -1689308347;
      var1.am += var27 * -725588083;
      int var40 = var1.am * -1689308347;
      var1.am += var8 * -725588083;
      int var41 = var1.am * -1689308347;
      var1.am += var17 * -725588083;
      int var42 = var1.am * -1689308347;
      var1.am += var19 * -725588083;
      int var43 = var1.am * -1689308347;
      var1.am += var21 * -725588083;
      int var44 = var1.am * -1689308347;
      var1.am += var12 * -725588083;
      int var45 = var1.am * -1689308347;
      var1.am += var9 * -725588083;
      int var46 = var1.am * -1689308347;
      var1.am += var22 * -725588083;
      int var47 = var1.am * -1689308347;
      var1.am += var23 * -725588083;
      int var48 = var1.am * -1689308347;
      var1.am += var24 * -725588083;
      int var49 = var1.am * -1689308347;
      var1.am += var25 * -725588083;
      int var50 = var1.am * -1689308347;
      var1.am += var5 * 2118203047;
      this.aw = new byte[var4];
      vl var51 = new vl(this.aw);
      var51.bw(1297377380, (byte)42);
      var51.bw(6, (byte)58);
      var51.bd(var2 > 1 ? 1 : 0, (byte)-69);
      var51.bd(var2, (byte)-87);
      var51.bd(var3, (byte)-86);
      var1.am = var13 * -725588083;
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

      label387:
      for(int var63 = 0; var63 < var2; ++var63) {
         var51.bw(1297379947, (byte)21);
         var51.am += 1392614964;
         int var64 = var51.am * -1689308347;
         int var65 = var64;
         int var66 = -1;

         while(true) {
            while(true) {
               int var67 = var1.dh((byte)35);
               var51.cv(var67, 2053785981);
               var65 += var67;
               int var68 = var1.ae[var29++] & 255;
               boolean var69 = var68 != var66;
               var66 = var68 & 15;
               if (var68 == 7) {
                  if (var69) {
                     var51.bo(255, -257245932);
                  }

                  var51.bo(47, -742191115);
                  var51.bo(0, -1021766436);
                  var51.co(var51.am * -1689308347 - var64, 1875857248);
                  continue label387;
               }

               if (var68 == 23) {
                  if (var69) {
                     var51.bo(255, -629487867);
                  }

                  var51.bo(81, 1677792355);
                  var51.bo(3, -1150217578);
                  var51.bo(var1.ae[var50++], 373868676);
                  var51.bo(var1.ae[var50++], -1185225697);
                  var51.bo(var1.ae[var50++], -2022618640);
               } else {
                  var52 ^= var68 >> 4;
                  int var71;
                  int var74;
                  if (var66 == 0) {
                     if (var69) {
                        var51.bo(144 + var52, -508097938);
                     }

                     var53 += var1.ae[var37++];
                     var54 += var1.ae[var38++];
                     var74 = var53 & 127;
                     var71 = var54 & 127;
                     var51.bo(var74, 1126287595);
                     var51.bo(var71, 668012101);
                     if (var71 > 0) {
                        int var72 = var61[var52];
                        ni var73 = (ni)this.ap.ap((long)var72);
                        if (var73 == null) {
                           var73 = new ni(var65);
                           this.ap.ak(var73, (long)var72);
                        }

                        var73.aw.set(var74);
                     }
                  } else if (var66 == 1) {
                     if (var69) {
                        var51.bo(128 + var52, 946772564);
                     }

                     var53 += var1.ae[var37++];
                     var55 += var1.ae[var40++];
                     var51.bo(var53 & 127, -1135681813);
                     var51.bo(var55 & 127, -2006981100);
                  } else {
                     byte var70;
                     if (var66 == 2) {
                        if (var69) {
                           var51.bo(176 + var52, 134578407);
                        }

                        var28 = var28 + var1.ae[var15++] & 127;
                        var51.bo(var28, -527817726);
                        if (var28 != 0 && var28 != 32) {
                           if (var28 == 1) {
                              var70 = var1.ae[var34++];
                           } else if (var28 == 33) {
                              var70 = var1.ae[var41++];
                           } else if (var28 == 7) {
                              var70 = var1.ae[var35++];
                           } else if (var28 == 39) {
                              var70 = var1.ae[var42++];
                           } else if (var28 == 10) {
                              var70 = var1.ae[var36++];
                           } else if (var28 == 42) {
                              var70 = var1.ae[var43++];
                           } else if (var28 == 99) {
                              var70 = var1.ae[var46++];
                           } else if (var28 == 98) {
                              var70 = var1.ae[var47++];
                           } else if (var28 == 101) {
                              var70 = var1.ae[var48++];
                           } else if (var28 == 100) {
                              var70 = var1.ae[var49++];
                           } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
                              var70 = var1.ae[var39++];
                           } else {
                              var70 = var1.ae[var30++];
                           }
                        } else {
                           var70 = var1.ae[var44++];
                        }

                        var74 = var70 + var59[var28];
                        var59[var28] = var74;
                        var71 = var74 & 127;
                        var51.bo(var71, -1179633885);
                        if (var28 == 0) {
                           var60[var52] = (var60[var52] & -2080769) + (var71 << 14);
                        }

                        if (var28 == 32) {
                           var60[var52] = (var60[var52] & -16257) + (var71 << 7);
                        }
                     } else if (var66 == 3) {
                        if (var69) {
                           var51.bo(224 + var52, 215827467);
                        }

                        var56 += var1.ae[var45++];
                        var56 += var1.ae[var33++] << 7;
                        var51.bo(var56 & 127, -2109564873);
                        var51.bo(var56 >> 7 & 127, -2092523534);
                     } else if (var66 == 4) {
                        if (var69) {
                           var51.bo(208 + var52, -1136941272);
                        }

                        var57 += var1.ae[var32++];
                        var51.bo(var57 & 127, -1378957851);
                     } else if (var66 == 5) {
                        if (var69) {
                           var51.bo(160 + var52, 779993271);
                        }

                        var53 += var1.ae[var37++];
                        var58 += var1.ae[var31++];
                        var51.bo(var53 & 127, 1219892217);
                        var51.bo(var58 & 127, -953341258);
                     } else {
                        if (var66 != 6) {
                           throw new RuntimeException();
                        }

                        if (var69) {
                           var51.bo(192 + var52, -2112777143);
                        }

                        var70 = var1.ae[var44++];
                        var61[var52] = var60[var52] + var70;
                        var51.bo(var70, 1331118770);
                     }
                  }
               }
            }
         }
      }

   }

   public static nv aw(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 1313539718);
      return var3 == null ? null : new nv(new vl(var3));
   }

   public static nv ap(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 827626104);
      return var3 == null ? null : new nv(new vl(var3));
   }
}
