public class dr extends jv {
   public static final int bb = 32;
   final int aw;
   final int ak;
   final dn ap;
   final int ai;
   final int aj;
   final int as;
   iu ae;
   final int ay;
   int at;
   public static final int bx = 1;
   static final int bq = 0;
   static bm te;
   public static final int au = 9;
   static final int bv = 1076101600;
   int am;

   static final void ak(dn var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         int[][][] var6 = var0.at;
         int var7 = 1587254913 * var0.ai - 1;
         int var8 = var0.ay * -1000264093 - 1;

         for(int var9 = var2; var9 <= var2 + var4; ++var9) {
            if (var5 <= 1904463222) {
               return;
            }

            for(int var10 = var1; var10 <= var1 + var3; ++var10) {
               if (var5 <= 1904463222) {
                  throw new IllegalStateException();
               }

               if (var10 >= 0) {
                  if (var5 <= 1904463222) {
                     throw new IllegalStateException();
                  }

                  if (var10 < var6[0].length - 1) {
                     if (var5 <= 1904463222) {
                        return;
                     }

                     if (var9 >= 0 && var9 < var6[0][0].length - 1) {
                        if (var5 <= 1904463222) {
                           throw new IllegalStateException();
                        }

                        dg.ay[0][var10][var9] = 127;
                        if (var1 == var10) {
                           if (var5 <= 1904463222) {
                              throw new IllegalStateException();
                           }

                           if (var10 > 0) {
                              if (var5 <= 1904463222) {
                                 throw new IllegalStateException();
                              }

                              var6[0][var10][var9] = var6[0][var10 - 1][var9];
                           }
                        }

                        if (var3 + var1 == var10) {
                           if (var5 <= 1904463222) {
                              throw new IllegalStateException();
                           }

                           if (var10 < var7) {
                              if (var5 <= 1904463222) {
                                 throw new IllegalStateException();
                              }

                              var6[0][var10][var9] = var6[0][1 + var10][var9];
                           }
                        }

                        if (var2 == var9) {
                           if (var5 <= 1904463222) {
                              throw new IllegalStateException();
                           }

                           if (var9 > 0) {
                              if (var5 <= 1904463222) {
                                 throw new IllegalStateException();
                              }

                              var6[0][var10][var9] = var6[0][var10][var9 - 1];
                           }
                        }

                        if (var4 + var2 == var9) {
                           if (var5 <= 1904463222) {
                              throw new IllegalStateException();
                           }

                           if (var9 < var8) {
                              if (var5 <= 1904463222) {
                                 throw new IllegalStateException();
                              }

                              var6[0][var10][var9] = var6[0][var10][1 + var9];
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var11) {
         throw tm.aw(var11, "dr.ak(" + ')');
      }
   }

   protected final jy au(int var1) {
      try {
         ir var2 = ei.aw(this.aw * 2044875447, 888461382);
         if (var2.bm != null) {
            if (var1 != 1885718735) {
               throw new IllegalStateException();
            }

            var2 = var2.an((byte)3);
         }

         if (var2 == null) {
            if (var1 != 1885718735) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var3;
            int var4;
            label134: {
               if (1790019807 * this.aj != 1) {
                  if (var1 != 1885718735) {
                     throw new IllegalStateException();
                  }

                  if (3 != this.aj * 1790019807) {
                     var3 = var2.az * -347110081;
                     var4 = -109800991 * var2.ag;
                     break label134;
                  }

                  if (var1 != 1885718735) {
                     throw new IllegalStateException();
                  }
               }

               var3 = var2.ag * -109800991;
               var4 = -347110081 * var2.az;
            }

            int var5 = (var3 >> 1) + 2057600999 * this.ay;
            int var6 = this.ay * 2057600999 + (1 + var3 >> 1);
            int var7 = -1834683989 * this.as + (var4 >> 1);
            int var8 = -1834683989 * this.as + (1 + var4 >> 1);
            int[][] var9 = this.ap.at[this.ai * -1816491519];
            int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
            int var11 = (2057600999 * this.ay << 7) + (var3 << 6);
            int var12 = (var4 << 6) + (-1834683989 * this.as << 7);
            if (this.ae != null) {
               if (var1 != 1885718735) {
                  throw new IllegalStateException();
               }

               int var13 = -330508271 * client.dt - this.at * -1010418003;
               if (var13 > 100 && -333115385 * this.ae.ag > 0) {
                  if (var1 != 1885718735) {
                     throw new IllegalStateException();
                  }

                  var13 = 100;
               }

               if (!this.ae.au((byte)40)) {
                  label113: {
                     label112:
                     while(true) {
                        while(true) {
                           if (var13 <= this.ae.az[this.am * -97130721]) {
                              break label113;
                           }

                           if (var1 != 1885718735) {
                              throw new IllegalStateException();
                           }

                           var13 -= this.ae.az[-97130721 * this.am];
                           this.am += -1046817569;
                           if (this.am * -97130721 >= this.ae.ar.length) {
                              if (var1 != 1885718735) {
                                 throw new IllegalStateException();
                              }

                              this.am -= this.ae.ag * 1355072025;
                              if (this.am * -97130721 < 0) {
                                 break label112;
                              }

                              if (var1 != 1885718735) {
                                 throw new IllegalStateException();
                              }

                              if (this.am * -97130721 >= this.ae.ar.length) {
                                 if (var1 != 1885718735) {
                                    throw new IllegalStateException();
                                 }
                                 break label112;
                              }
                           } else {
                              lw.hi(this.ae, this.am * -97130721, var11, var12, false, (byte)1);
                           }
                        }
                     }

                     this.ae = null;
                  }
               } else {
                  int var14 = this.ae.an((byte)120);
                  this.am += -1046817569 * var13;
                  var13 = 0;
                  if (this.am * -97130721 >= var14) {
                     label119: {
                        this.am = -1046817569 * (var14 - this.ae.ag * -333115385);
                        if (this.am * -97130721 >= 0) {
                           if (this.am * -97130721 <= var14) {
                              break label119;
                           }

                           if (var1 != 1885718735) {
                              throw new IllegalStateException();
                           }
                        }

                        this.ae = null;
                     }
                  }

                  if (this.ae != null) {
                     if (var1 != 1885718735) {
                        throw new IllegalStateException();
                     }

                     lw.hi(this.ae, -97130721 * this.am, var11, var12, false, (byte)1);
                  }
               }

               this.at = (-330508271 * client.dt - var13) * -2141203163;
            }

            return var2.at(this.ak * -1565534601, 1790019807 * this.aj, var9, var11, var10, var12, this.ae, this.am * -97130721, 52686273);
         }
      } catch (RuntimeException var15) {
         throw tm.aw(var15, "dr.au(" + ')');
      }
   }

   protected final jy an() {
      ir var1 = ei.aw(this.aw * 2044875447, 888461382);
      if (var1.bm != null) {
         var1 = var1.an((byte)86);
      }

      if (var1 == null) {
         return null;
      } else {
         int var2;
         int var3;
         if (1790019807 * this.aj != 1 && 3 != this.aj * 1790019807) {
            var2 = var1.az * -347110081;
            var3 = -109800991 * var1.ag;
         } else {
            var2 = var1.ag * -109800991;
            var3 = -347110081 * var1.az;
         }

         int var4 = (var2 >> 1) + 2057600999 * this.ay;
         int var5 = this.ay * 2057600999 + (1 + var2 >> 1);
         int var6 = -1834683989 * this.as + (var3 >> 1);
         int var7 = -1834683989 * this.as + (1 + var3 >> 1);
         int[][] var8 = this.ap.at[this.ai * -1816491519];
         int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
         int var10 = (2057600999 * this.ay << 7) + (var2 << 6);
         int var11 = (var3 << 6) + (-1834683989 * this.as << 7);
         if (this.ae != null) {
            int var12 = -330508271 * client.dt - this.at * -1010418003;
            if (var12 > 100 && -333115385 * this.ae.ag > 0) {
               var12 = 100;
            }

            if (!this.ae.au((byte)48)) {
               label71: {
                  do {
                     while(true) {
                        if (var12 <= this.ae.az[this.am * -97130721]) {
                           break label71;
                        }

                        var12 -= this.ae.az[-97130721 * this.am];
                        this.am += -1046817569;
                        if (this.am * -97130721 >= this.ae.ar.length) {
                           this.am -= this.ae.ag * 1355072025;
                           break;
                        }

                        lw.hi(this.ae, this.am * -97130721, var10, var11, false, (byte)1);
                     }
                  } while(this.am * -97130721 >= 0 && this.am * -97130721 < this.ae.ar.length);

                  this.ae = null;
               }
            } else {
               int var13 = this.ae.an((byte)127);
               this.am += -1046817569 * var12;
               var12 = 0;
               if (this.am * -97130721 >= var13) {
                  this.am = -1046817569 * (var13 - this.ae.ag * -333115385);
                  if (this.am * -97130721 < 0 || this.am * -97130721 > var13) {
                     this.ae = null;
                  }
               }

               if (this.ae != null) {
                  lw.hi(this.ae, -97130721 * this.am, var10, var11, false, (byte)1);
               }
            }

            this.at = (-330508271 * client.dt - var12) * -2141203163;
         }

         return var1.at(this.ak * -1565534601, 1790019807 * this.aj, var8, var10, var9, var11, this.ae, this.am * -97130721, 52686273);
      }
   }

   protected final jy ao() {
      ir var1 = ei.aw(this.aw * 2044875447, 888461382);
      if (var1.bm != null) {
         var1 = var1.an((byte)35);
      }

      if (var1 == null) {
         return null;
      } else {
         int var2;
         int var3;
         if (1790019807 * this.aj != 1 && 3 != this.aj * 1790019807) {
            var2 = var1.az * -347110081;
            var3 = -109800991 * var1.ag;
         } else {
            var2 = var1.ag * -109800991;
            var3 = -347110081 * var1.az;
         }

         int var4 = (var2 >> 1) + 2057600999 * this.ay;
         int var5 = this.ay * 2057600999 + (1 + var2 >> 1);
         int var6 = -1834683989 * this.as + (var3 >> 1);
         int var7 = -1834683989 * this.as + (1 + var3 >> 1);
         int[][] var8 = this.ap.at[this.ai * -1816491519];
         int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
         int var10 = (2057600999 * this.ay << 7) + (var2 << 6);
         int var11 = (var3 << 6) + (-1834683989 * this.as << 7);
         if (this.ae != null) {
            int var12 = -330508271 * client.dt - this.at * -1010418003;
            if (var12 > 100 && -333115385 * this.ae.ag > 0) {
               var12 = 100;
            }

            if (!this.ae.au((byte)69)) {
               label72: {
                  do {
                     while(true) {
                        if (var12 <= this.ae.az[this.am * -97130721]) {
                           break label72;
                        }

                        var12 -= this.ae.az[-97130721 * this.am];
                        this.am += -1046817569;
                        if (this.am * -97130721 >= this.ae.ar.length) {
                           this.am -= this.ae.ag * 1355072025;
                           break;
                        }

                        lw.hi(this.ae, this.am * -97130721, var10, var11, false, (byte)1);
                     }
                  } while(this.am * -97130721 >= 0 && this.am * -97130721 < this.ae.ar.length);

                  this.ae = null;
               }
            } else {
               int var13 = this.ae.an((byte)31);
               this.am += -1046817569 * var12;
               var12 = 0;
               if (this.am * -97130721 >= var13) {
                  this.am = -1046817569 * (var13 - this.ae.ag * -333115385);
                  if (this.am * -97130721 < 0 || this.am * -97130721 > var13) {
                     this.ae = null;
                  }
               }

               if (this.ae != null) {
                  lw.hi(this.ae, -97130721 * this.am, var10, var11, false, (byte)1);
               }
            }

            this.at = (-330508271 * client.dt - var12) * -2141203163;
         }

         return var1.at(this.ak * -1565534601, 1790019807 * this.aj, var8, var10, var9, var11, this.ae, this.am * -97130721, 52686273);
      }
   }

   dr(dn var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, jv var10) {
      try {
         super();
         this.ap = var1;
         this.aw = 158149383 * var2;
         this.ak = var3 * 1852891975;
         this.aj = var4 * 88355615;
         this.ai = 1453946369 * var5;
         this.ay = var6 * 256123863;
         this.as = -924942077 * var7;
         if (-1 != var8) {
            this.ae = ng.ap(var8, (short)-21234);
            this.am = 0;
            this.at = client.dt * -986685579 - -2141203163;
            if (0 == this.ae.bv * -1713937817 && var10 instanceof dr) {
               dr var11 = (dr)var10;
               if (this.ae == var11.ae) {
                  this.am = var11.am * 1;
                  this.at = var11.at * 1;
                  return;
               }
            }

            if (var9 && this.ae.ag * -333115385 != -1) {
               if (!this.ae.au((byte)34)) {
                  this.am = (int)(Math.random() * (double)this.ae.ar.length) * -1046817569;
                  this.at -= (int)(Math.random() * (double)this.ae.az[-97130721 * this.am]) * -2141203163;
               } else {
                  this.am = (int)(Math.random() * (double)this.ae.an((byte)48)) * -1046817569;
               }
            }
         }

      } catch (RuntimeException var12) {
         throw tm.aw(var12, "dr.<init>(" + ')');
      }
   }

   static final um ap(vl var0, um var1, int var2) {
      try {
         int var3 = var0.cy((short)-9011);
         int var4;
         if (var1 == null) {
            if (var2 == -1802630390) {
               throw new IllegalStateException();
            }

            var4 = di.ay(var3, -1716885551);
            var1 = new um(var4);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            if (var2 == -1802630390) {
               throw new IllegalStateException();
            }

            boolean var10000;
            if (var0.cy((short)-30245) == 1) {
               if (var2 == -1802630390) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var5 = var10000;
            int var6 = var0.cx((byte)-60);
            Object var7;
            if (var5) {
               if (var2 == -1802630390) {
                  throw new IllegalStateException();
               }

               var7 = new tc(var0.cw(2067326298));
            } else {
               var7 = new tb(var0.ch(1203709469));
            }

            var1.aw((tw)var7, (long)var6);
         }

         return var1;
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "dr.ap(" + ')');
      }
   }

   static void ag(qi var0, qi var1, qi var2, int var3) {
      try {
         ak = (1816225167 * ac.ax - 765) / 2 * -1320578673;
         dq.ax = dq.ak * 2135985343 + -1172025942;
         aq.aq = 616970932 + dq.ax * 1061149649;
         if (dq.dr) {
            if (var3 != -508354921) {
               throw new IllegalStateException();
            } else {
               hw.ac(var0, var1, (byte)0);
            }
         } else {
            int var5;
            label699: {
               we.am.au(dq.ak * -2069137, 0);
               ui.at.au(-2069137 * dq.ak + 382, 0);
               sg.au.ak(dq.ak * -2069137 + 382 - sg.au.ak / 2, 18);
               if (0 != -1869319151 * client.da) {
                  if (var3 != -508354921) {
                     throw new IllegalStateException();
                  }

                  if (5 != -1869319151 * client.da) {
                     break label699;
                  }

                  if (var3 != -508354921) {
                     throw new IllegalStateException();
                  }
               }

               byte var4 = 20;
               var0.ad(og.ia, dq.ax * -710649007 + 180, 245 - var4, 16777215, -1);
               var5 = 253 - var4;
               vz.ep(180 + dq.ax * -710649007 - 152, var5, 304, 34, 9179409);
               vz.ep(-710649007 * dq.ax + 180 - 151, 1 + var5, 302, 32, 0);
               vz.ef(-710649007 * dq.ax + 180 - 150, 2 + var5, 448975751 * dq.al, 30, 9179409);
               vz.ef(180 + dq.ax * -710649007 - 150 + dq.al * 448975751, var5 + 2, 300 - 448975751 * dq.al, 30, 0);
               var0.ad(dq.aa, 180 + dq.ax * -710649007, 276 - var4, 16777215, -1);
            }

            String var6;
            String var7;
            String var8;
            short var14;
            int var15;
            short var16;
            String var10000;
            if (20 == -1869319151 * client.da) {
               if (var3 != -508354921) {
                  throw new IllegalStateException();
               }

               ij.ai.ak(180 + -710649007 * dq.ax - ij.ai.ak / 2, 271 - ij.ai.aj / 2);
               var14 = 201;
               var0.ad(dq.cd, 180 + -710649007 * dq.ax, var14, 16776960, 0);
               var15 = var14 + 15;
               var0.ad(dq.ci, dq.ax * -710649007 + 180, var15, 16776960, 0);
               var15 += 15;
               var0.ad(dq.cn, 180 + -710649007 * dq.ax, var15, 16776960, 0);
               var15 += 15;
               var15 += 7;
               if (-1064901707 * dq.cq != 4) {
                  if (var3 != -508354921) {
                     return;
                  }

                  if (-1064901707 * dq.cq != 10) {
                     if (var3 != -508354921) {
                        return;
                     }

                     var0.ab(og.jx, 180 + -710649007 * dq.ax - 110, var15, 16777215, 0);
                     var16 = 200;
                     if (io.vx.as(2118514865)) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }

                        var10000 = jr.ar(dq.co, 2128422475);
                     } else {
                        var10000 = dq.co;
                     }

                     var6 = var10000;

                     for(var7 = var6; var0.at(var7) > var16; var7 = var7.substring(0, var7.length() - 1)) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }
                     }

                     var0.ab(qa.af(var7), dq.ax * -710649007 + 180 - 70, var15, 16777215, 0);
                     var15 += 15;

                     for(var8 = jr.ar(dq.cf, 614712350); var0.at(var8) > var16; var8 = var8.substring(1)) {
                     }

                     var0.ab(og.jl + var8, 180 + -710649007 * dq.ax - 108, var15, 16777215, 0);
                     var15 += 15;
                  }
               }
            }

            label708: {
               if (-1869319151 * client.da != 10) {
                  if (var3 != -508354921) {
                     throw new IllegalStateException();
                  }

                  if (11 != client.da * -1869319151 && 50 != client.da * -1869319151) {
                     break label708;
                  }
               }

               ij.ai.ak(-710649007 * dq.ax, 171);
               short var17;
               if (dq.cq * -1064901707 == 0) {
                  if (var3 != -508354921) {
                     throw new IllegalStateException();
                  }

                  var14 = 251;
                  var0.ad(og.ji, -710649007 * dq.ax + 180, var14, 16776960, 0);
                  var15 = var14 + 30;
                  var5 = -710649007 * dq.ax + 180 - 80;
                  var17 = 291;
                  bd.ay.ak(var5 - 73, var17 - 20);
                  var0.ac(og.jc, var5 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                  var5 = 180 + dq.ax * -710649007 + 80;
                  bd.ay.ak(var5 - 73, var17 - 20);
                  var0.ac(og.jb, var5 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               } else if (1 == -1064901707 * dq.cq) {
                  var0.ad(dq.cb, 180 + dq.ax * -710649007, 201, 16776960, 0);
                  var14 = 236;
                  var0.ad(dq.cd, 180 + -710649007 * dq.ax, var14, 16777215, 0);
                  var15 = var14 + 15;
                  var0.ad(dq.ci, dq.ax * -710649007 + 180, var15, 16777215, 0);
                  var15 += 15;
                  var0.ad(dq.cn, 180 + -710649007 * dq.ax, var15, 16777215, 0);
                  var15 += 15;
                  var5 = dq.ax * -710649007 + 180 - 80;
                  var17 = 321;
                  bd.ay.ak(var5 - 73, var17 - 20);
                  var0.ad(og.am, var5, var17 + 5, 16777215, 0);
                  var5 = 80 + -710649007 * dq.ax + 180;
                  bd.ay.ak(var5 - 73, var17 - 20);
                  var0.ad(og.jf, var5, var17 + 5, 16777215, 0);
               } else {
                  StringBuilder var10001;
                  String var10002;
                  if (-1064901707 * dq.cq == 2) {
                     var14 = 201;
                     var0.ad(dq.cd, aq.aq * 898492289, var14, 16776960, 0);
                     var15 = var14 + 15;
                     var0.ad(dq.ci, 898492289 * aq.aq, var15, 16776960, 0);
                     var15 += 15;
                     var0.ad(dq.cn, 898492289 * aq.aq, var15, 16776960, 0);
                     var15 += 15;
                     var15 += 7;
                     var0.ab(og.jx, aq.aq * 898492289 - 110, var15, 16777215, 0);
                     var16 = 200;
                     var6 = io.vx.as(2127654043) ? jr.ar(dq.co, 1202900152) : dq.co;

                     for(var7 = var6; var0.at(var7) > var16; var7 = var7.substring(1)) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }
                     }

                     var10001 = (new StringBuilder()).append(qa.af(var7));
                     boolean var31;
                     if (dq.dq * -1298053951 == 0) {
                        if (var3 != -508354921) {
                           return;
                        }

                        var31 = true;
                     } else {
                        var31 = false;
                     }

                     boolean var10003;
                     if (-330508271 * client.dt % 40 < 20) {
                        if (var3 != -508354921) {
                           return;
                        }

                        var10003 = true;
                     } else {
                        var10003 = false;
                     }

                     if (var31 & var10003) {
                        if (var3 != -508354921) {
                           return;
                        }

                        var10002 = hs.aw(16776960, (byte)19) + eh.ak;
                     } else {
                        var10002 = "";
                     }

                     var0.ab(var10001.append(var10002).toString(), aq.aq * 898492289 - 70, var15, 16777215, 0);
                     var15 += 15;

                     for(var8 = jr.ar(dq.cf, 180607017); var0.at(var8) > var16; var8 = var8.substring(1)) {
                        if (var3 != -508354921) {
                           return;
                        }
                     }

                     var10001 = (new StringBuilder()).append(og.jl).append(var8);
                     if (dq.dq * -1298053951 == 1) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }

                        var31 = true;
                     } else {
                        var31 = false;
                     }

                     if (-330508271 * client.dt % 40 < 20) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }

                        var10003 = true;
                     } else {
                        var10003 = false;
                     }

                     if (var31 & var10003) {
                        if (var3 != -508354921) {
                           return;
                        }

                        var10002 = hs.aw(16776960, (byte)-27) + eh.ak;
                     } else {
                        var10002 = "";
                     }

                     var0.ab(var10001.append(var10002).toString(), aq.aq * 898492289 - 108, var15, 16777215, 0);
                     var15 += 15;
                     var14 = 277;
                     int var24 = 898492289 * aq.aq + -117;
                     vc var10 = gi.aj(client.hy, dq.cw, -1311335863);
                     var10.ak(var24, var14);
                     var24 += 5 + var10.ak;
                     var1.ab(og.ja, var24, 13 + var14, 16776960, 0);
                     var24 = 898492289 * aq.aq + 24;
                     var10 = gi.aj(io.vx.as(2111440712), dq.ca, -1311335863);
                     var10.ak(var24, var14);
                     var24 += var10.ak + 5;
                     var1.ab(og.jo, var24, var14 + 13, 16776960, 0);
                     var15 = var14 + 15;
                     int var11 = aq.aq * 898492289 - 80;
                     short var12 = 321;
                     bd.ay.ak(var11 - 73, var12 - 20);
                     var0.ad(og.jv, var11, 5 + var12, 16777215, 0);
                     var11 = 898492289 * aq.aq + 80;
                     bd.ay.ak(var11 - 73, var12 - 20);
                     var0.ad(og.jf, var11, var12 + 5, 16777215, 0);
                     var14 = 357;
                     switch(dq.bf * 1866840143) {
                     case 2:
                        jw.bg = og.kx;
                        break;
                     default:
                        jw.bg = og.kk;
                     }

                     cu.bl = new qg(898492289 * aq.aq, var14, var1.at(jw.bg), 11);
                     ii.be = new qg(aq.aq * 898492289, var14, var1.at(og.kq), 11);
                     var1.ad(jw.bg, 898492289 * aq.aq, var14, 16777215, 0);
                  } else if (3 == -1064901707 * dq.cq) {
                     if (var3 != -508354921) {
                        return;
                     }

                     var14 = 201;
                     var0.ad(og.kf, dq.ax * -710649007 + 180, var14, 16776960, 0);
                     var15 = var14 + 20;
                     var1.ad(og.km, 180 + dq.ax * -710649007, var15, 16776960, 0);
                     var15 += 20;
                     var1.ad(og.ki, dq.ax * -710649007 + 180, var15, 16776960, 0);
                     var15 += 15;
                     var5 = 180 + -710649007 * dq.ax;
                     var17 = 276;
                     bd.ay.ak(var5 - 73, var17 - 20);
                     var2.ad(og.kr, var5, var17 + 5, 16777215, 0);
                     var5 = dq.ax * -710649007 + 180;
                     var17 = 326;
                     bd.ay.ak(var5 - 73, var17 - 20);
                     var2.ad(og.ko, var5, var17 + 5, 16777215, 0);
                  } else {
                     short var9;
                     int var18;
                     int var22;
                     if (-1064901707 * dq.cq == 4) {
                        var0.ad(og.ie, -710649007 * dq.ax + 180, 201, 16776960, 0);
                        var14 = 236;
                        var0.ad(dq.cd, dq.ax * -710649007 + 180, var14, 16777215, 0);
                        var15 = var14 + 15;
                        var0.ad(dq.ci, -710649007 * dq.ax + 180, var15, 16777215, 0);
                        var15 += 15;
                        var0.ad(dq.cn, 180 + -710649007 * dq.ax, var15, 16777215, 0);
                        var15 += 15;
                        var10001 = (new StringBuilder()).append(og.jt).append(jr.ar(nu.cr, -90723099));
                        if (client.dt * -330508271 % 40 < 20) {
                           if (var3 != -508354921) {
                              return;
                           }

                           var10002 = hs.aw(16776960, (byte)-11) + eh.ak;
                        } else {
                           var10002 = "";
                        }

                        var0.ab(var10001.append(var10002).toString(), 180 + dq.ax * -710649007 - 108, var15, 16777215, 0);
                        var15 -= 8;
                        var0.ab(og.an, -710649007 * dq.ax + 180 - 9, var15, 16776960, 0);
                        var15 += 15;
                        var0.ab(og.ao, dq.ax * -710649007 + 180 - 9, var15, 16776960, 0);
                        var5 = -710649007 * dq.ax + 180 - 9 + var0.at(og.ao) + 15;
                        var22 = var15 - var0.ae;
                        vc var23;
                        if (dq.ck) {
                           if (var3 != -508354921) {
                              throw new IllegalStateException();
                           }

                           var23 = sz.ar;
                        } else {
                           var23 = bp.ao;
                        }

                        var23.ak(var5, var22);
                        var15 += 15;
                        var18 = dq.ax * -710649007 + 180 - 80;
                        var9 = 321;
                        bd.ay.ak(var18 - 73, var9 - 20);
                        var0.ad(og.am, var18, 5 + var9, 16777215, 0);
                        var18 = 80 + 180 + dq.ax * -710649007;
                        bd.ay.ak(var18 - 73, var9 - 20);
                        var0.ad(og.jf, var18, var9 + 5, 16777215, 0);
                        var1.ad(og.kk, 180 + dq.ax * -710649007, 36 + var9, 16777215, 0);
                     } else if (-1064901707 * dq.cq == 5) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }

                        var0.ad(og.kl, dq.ax * -710649007 + 180, 201, 16776960, 0);
                        var14 = 221;
                        var2.ad(dq.cd, dq.ax * -710649007 + 180, var14, 16776960, 0);
                        var15 = var14 + 15;
                        var2.ad(dq.ci, 180 + -710649007 * dq.ax, var15, 16776960, 0);
                        var15 += 15;
                        var2.ad(dq.cn, 180 + dq.ax * -710649007, var15, 16776960, 0);
                        var15 += 15;
                        var15 += 14;
                        var0.ab(og.ke, 180 + dq.ax * -710649007 - 145, var15, 16777215, 0);
                        var16 = 174;
                        if (io.vx.as(2027422300)) {
                           if (var3 != -508354921) {
                              throw new IllegalStateException();
                           }

                           var10000 = jr.ar(dq.co, 1207890949);
                        } else {
                           var10000 = dq.co;
                        }

                        var6 = var10000;

                        for(var7 = var6; var0.at(var7) > var16; var7 = var7.substring(1)) {
                           if (var3 != -508354921) {
                              throw new IllegalStateException();
                           }
                        }

                        var10001 = (new StringBuilder()).append(qa.af(var7));
                        if (-330508271 * client.dt % 40 < 20) {
                           if (var3 != -508354921) {
                              return;
                           }

                           var10002 = hs.aw(16776960, (byte)-25) + eh.ak;
                        } else {
                           var10002 = "";
                        }

                        var0.ab(var10001.append(var10002).toString(), 180 + -710649007 * dq.ax - 34, var15, 16777215, 0);
                        var15 += 15;
                        var18 = 180 + dq.ax * -710649007 - 80;
                        var9 = 321;
                        bd.ay.ak(var18 - 73, var9 - 20);
                        var0.ad(og.kj, var18, var9 + 5, 16777215, 0);
                        var18 = 80 + 180 + dq.ax * -710649007;
                        bd.ay.ak(var18 - 73, var9 - 20);
                        var0.ad(og.kt, var18, 5 + var9, 16777215, 0);
                        var9 = 356;
                        var1.ad(og.kq, aq.aq * 898492289, var9, 268435455, 0);
                     } else if (-1064901707 * dq.cq == 6) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }

                        var14 = 201;
                        var0.ad(dq.cd, 180 + -710649007 * dq.ax, var14, 16776960, 0);
                        var15 = var14 + 15;
                        var0.ad(dq.ci, dq.ax * -710649007 + 180, var15, 16776960, 0);
                        var15 += 15;
                        var0.ad(dq.cn, -710649007 * dq.ax + 180, var15, 16776960, 0);
                        var15 += 15;
                        var5 = 180 + -710649007 * dq.ax;
                        var17 = 321;
                        bd.ay.ak(var5 - 73, var17 - 20);
                        var0.ad(og.kt, var5, 5 + var17, 16777215, 0);
                     } else if (7 == dq.cq * -1064901707) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }

                        if (qf.dl && !client.cz) {
                           if (var3 != -508354921) {
                              throw new IllegalStateException();
                           }

                           var14 = 201;
                           var0.ad(dq.cd, 898492289 * aq.aq, var14, 16776960, 0);
                           var15 = var14 + 15;
                           var0.ad(dq.ci, aq.aq * 898492289, var15, 16776960, 0);
                           var15 += 15;
                           var0.ad(dq.cn, 898492289 * aq.aq, var15, 16776960, 0);
                           var5 = aq.aq * 898492289 - 150;
                           var15 += 10;
                           var22 = 0;

                           while(true) {
                              if (var22 >= 8) {
                                 var22 = 898492289 * aq.aq - 80;
                                 short var21 = 321;
                                 bd.ay.ak(var22 - 73, var21 - 20);
                                 var0.ad("Submit", var22, 5 + var21, 16777215, 0);
                                 var22 = 898492289 * aq.aq + 80;
                                 bd.ay.ak(var22 - 73, var21 - 20);
                                 var0.ad(og.jf, var22, 5 + var21, 16777215, 0);
                                 break;
                              }

                              if (var3 != -508354921) {
                                 throw new IllegalStateException();
                              }

                              bd.ay.ai(var5, var15, 30, 40);
                              boolean var28;
                              if (-518849387 * dq.cp == var22) {
                                 if (var3 != -508354921) {
                                    throw new IllegalStateException();
                                 }

                                 var28 = true;
                              } else {
                                 var28 = false;
                              }

                              boolean var19 = var28 & client.dt * -330508271 % 40 < 20;
                              var10001 = new StringBuilder();
                              if (dq.cv[var22] == null) {
                                 if (var3 != -508354921) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = "";
                              } else {
                                 var10002 = dq.cv[var22];
                              }

                              var10001 = var10001.append(var10002);
                              if (var19) {
                                 if (var3 != -508354921) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = hs.aw(16776960, (byte)89) + eh.ak;
                              } else {
                                 var10002 = "";
                              }

                              label649: {
                                 var0.ab(var10001.append(var10002).toString(), var5 + 10, 27 + var15, 16777215, 0);
                                 if (var22 != 1) {
                                    if (var3 != -508354921) {
                                       throw new IllegalStateException();
                                    }

                                    if (var22 != 3) {
                                       var5 += 35;
                                       break label649;
                                    }

                                    if (var3 != -508354921) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 var5 += 50;
                                 var0.ab(qa.af("/"), var5 - 13, 27 + var15, 16777215, 0);
                              }

                              ++var22;
                           }
                        } else {
                           var14 = 216;
                           var0.ad(og.lx, dq.ax * -710649007 + 180, var14, 16776960, 0);
                           var15 = var14 + 15;
                           var2.ad(og.lc, 180 + dq.ax * -710649007, var15, 16776960, 0);
                           var15 += 15;
                           var2.ad(og.lv, -710649007 * dq.ax + 180, var15, 16776960, 0);
                           var15 += 15;
                           var5 = 180 + -710649007 * dq.ax - 80;
                           var17 = 321;
                           bd.ay.ak(var5 - 73, var17 - 20);
                           var0.ad(og.lq, var5, var17 + 5, 16777215, 0);
                           var5 = -710649007 * dq.ax + 180 + 80;
                           bd.ay.ak(var5 - 73, var17 - 20);
                           var0.ad(og.kt, var5, var17 + 5, 16777215, 0);
                        }
                     } else if (dq.cq * -1064901707 == 8) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }

                        var14 = 216;
                        var0.ad(og.fc, 180 + dq.ax * -710649007, var14, 16776960, 0);
                        var15 = var14 + 15;
                        var2.ad(og.fb, -710649007 * dq.ax + 180, var15, 16776960, 0);
                        var15 += 15;
                        var2.ad(og.fr, 180 + dq.ax * -710649007, var15, 16776960, 0);
                        var15 += 15;
                        var5 = 180 + -710649007 * dq.ax - 80;
                        var17 = 321;
                        bd.ay.ak(var5 - 73, var17 - 20);
                        var0.ad(og.fe, var5, var17 + 5, 16777215, 0);
                        var5 = 80 + dq.ax * -710649007 + 180;
                        bd.ay.ak(var5 - 73, var17 - 20);
                        var0.ad(og.kt, var5, var17 + 5, 16777215, 0);
                     } else if (9 == -1064901707 * dq.cq) {
                        if (var3 != -508354921) {
                           return;
                        }

                        var14 = 221;
                        var0.ad(dq.cd, 180 + dq.ax * -710649007, var14, 16776960, 0);
                        var15 = var14 + 25;
                        var0.ad(dq.ci, -710649007 * dq.ax + 180, var15, 16776960, 0);
                        var15 += 25;
                        var0.ad(dq.cn, -710649007 * dq.ax + 180, var15, 16776960, 0);
                        var5 = dq.ax * -710649007 + 180;
                        var17 = 311;
                        bd.ay.ak(var5 - 73, var17 - 20);
                        var0.ad(og.kr, var5, 5 + var17, 16777215, 0);
                     } else if (-1064901707 * dq.cq == 10) {
                        var15 = -710649007 * dq.ax + 180;
                        var16 = 209;
                        var0.ad(og.ji, dq.ax * -710649007 + 180, var16, 16776960, 0);
                        var5 = var16 + 20;
                        ki.as.ak(var15 - 109, var5);
                        if (dq.cx.isEmpty()) {
                           if (var3 != -508354921) {
                              throw new IllegalStateException();
                           }

                           dq.ae.ak(var15 - 48, var5 + 18);
                        } else {
                           dq.ae.ak(var15 - 48, 5 + var5);
                           var0.ad(dq.cx, var15, 68 + var5 - 15, 16776960, 0);
                        }
                     } else if (dq.cq * -1064901707 == 12) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }

                        var15 = 898492289 * aq.aq;
                        var16 = 216;
                        var2.ad(og.la, var15, var16, 16777215, 0);
                        var5 = var16 + 17;
                        var2.ad(og.ln, var15, var5, 16777215, 0);
                        var5 += 17;
                        var2.ad(og.le, var15, var5, 16777215, 0);
                        var5 += 17;
                        var2.ad(og.mg, var15, var5, 16777215, 0);
                        var15 = 898492289 * aq.aq - 80;
                        var16 = 311;
                        bd.ay.ak(var15 - 73, var16 - 20);
                        var0.ad(og.mi, var15, 5 + var16, 16777215, 0);
                        var15 = 80 + aq.aq * 898492289;
                        bd.ay.ak(var15 - 73, var16 - 20);
                        var0.ad(og.mu, var15, 5 + var16, 16777215, 0);
                     } else if (dq.cq * -1064901707 == 13) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }

                        var14 = 231;
                        var2.ad(og.ml, dq.ax * -710649007 + 180, var14, 16777215, 0);
                        var15 = var14 + 20;
                        var2.ad(og.mo, 180 + dq.ax * -710649007, var15, 16777215, 0);
                        var5 = dq.ax * -710649007 + 180;
                        var14 = 311;
                        bd.ay.ak(var5 - 73, var14 - 20);
                        var0.ad(og.kt, var5, var14 + 5, 16777215, 0);
                     } else if (-1064901707 * dq.cq == 14) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }

                        var14 = 201;
                        String var20 = "";
                        var6 = "";
                        var7 = "";
                        switch(-1658478237 * dq.ba) {
                        case 0:
                           var20 = og.cn;
                           var6 = og.co;
                           var7 = og.cf;
                           break;
                        case 1:
                           var20 = og.dj;
                           var6 = og.dp;
                           var7 = og.dy;
                           break;
                        case 2:
                           var20 = og.fo;
                           var6 = og.fa;
                           var7 = og.fj;
                           break;
                        default:
                           us.ar(false, -7998461);
                        }

                        var0.ad(var20, -710649007 * dq.ax + 180, var14, 16776960, 0);
                        var15 = var14 + 20;
                        var0.ad(var6, -710649007 * dq.ax + 180, var15, 16776960, 0);
                        var15 += 20;
                        var0.ad(var7, dq.ax * -710649007 + 180, var15, 16776960, 0);
                        var18 = 180 + -710649007 * dq.ax;
                        var9 = 276;
                        bd.ay.ak(var18 - 73, var9 - 20);
                        if (-1658478237 * dq.ba == 1) {
                           if (var3 != -508354921) {
                              throw new IllegalStateException();
                           }

                           var0.ad(og.bt, var18, var9 + 5, 16777215, 0);
                        } else {
                           var0.ad(og.bu, var18, 5 + var9, 16777215, 0);
                        }

                        var18 = 180 + -710649007 * dq.ax;
                        var9 = 326;
                        bd.ay.ak(var18 - 73, var9 - 20);
                        var0.ad(og.kt, var18, 5 + var9, 16777215, 0);
                     } else if (24 == -1064901707 * dq.cq) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }

                        var14 = 221;
                        var0.ad(dq.cd, 180 + -710649007 * dq.ax, var14, 16777215, 0);
                        var15 = var14 + 15;
                        var0.ad(dq.ci, dq.ax * -710649007 + 180, var15, 16777215, 0);
                        var15 += 15;
                        var0.ad(dq.cn, dq.ax * -710649007 + 180, var15, 16777215, 0);
                        var15 += 15;
                        var5 = -710649007 * dq.ax + 180;
                        var17 = 301;
                        bd.ay.ak(var5 - 73, var17 - 20);
                        var0.ad(og.as, var5, 5 + var17, 16777215, 0);
                     } else if (-1064901707 * dq.cq == 32) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }

                        var14 = 216;
                        var0.ad(og.lx, dq.ax * -710649007 + 180, var14, 16776960, 0);
                        var15 = var14 + 15;
                        var2.ad(og.lc, 180 + dq.ax * -710649007, var15, 16776960, 0);
                        var15 += 15;
                        var2.ad(og.lv, 180 + -710649007 * dq.ax, var15, 16776960, 0);
                        var15 += 15;
                        var5 = 180 + dq.ax * -710649007 - 80;
                        var17 = 321;
                        bd.ay.ak(var5 - 73, var17 - 20);
                        var0.ad(og.lq, var5, 5 + var17, 16777215, 0);
                        var5 = 80 + 180 + dq.ax * -710649007;
                        bd.ay.ak(var5 - 73, var17 - 20);
                        var0.ad(og.kt, var5, 5 + var17, 16777215, 0);
                     } else if (33 == dq.cq * -1064901707) {
                        if (var3 != -508354921) {
                           throw new IllegalStateException();
                        }

                        var14 = 201;
                        var0.ad(dq.cd, dq.ax * -710649007 + 180, var14, 16776960, 0);
                        var15 = var14 + 20;
                        var1.ad(dq.ci, 180 + dq.ax * -710649007, var15, 16776960, 0);
                        var15 += 20;
                        var1.ad(dq.cn, dq.ax * -710649007 + 180, var15, 16776960, 0);
                        var15 += 15;
                        var5 = -710649007 * dq.ax + 180;
                        var17 = 276;
                        bd.ay.ak(var5 - 73, var17 - 20);
                        var2.ad(og.mz, var5, 5 + var17, 16777215, 0);
                        var5 = 180 + dq.ax * -710649007;
                        var17 = 326;
                        bd.ay.ak(var5 - 73, var17 - 20);
                        var2.ad(og.kt, var5, var17 + 5, 16777215, 0);
                     }
                  }
               }
            }

            if (client.da * -1869319151 >= 10) {
               if (var3 != -508354921) {
                  return;
               }

               int[] var27 = new int[4];
               vz.ez(var27);
               vz.ev(-2069137 * dq.ak, 0, 765 + -2069137 * dq.ak, ki.aq * -121992435);
               rf.az.ai(dq.ak * -2069137 - 22, client.dt * -330508271, (byte)-23);
               rf.az.ai(22 + -2069137 * dq.ak + 765 - 128, -330508271 * client.dt, (byte)-113);
               vz.ey(var27);
            }

            vc[] var29 = vn.an;
            byte var30;
            if (io.vx.am(1541468896)) {
               if (var3 != -508354921) {
                  throw new IllegalStateException();
               }

               var30 = 1;
            } else {
               var30 = 0;
            }

            var29[var30].ak(765 + dq.ak * -2069137 - 40, 463);
            if (-1869319151 * client.da > 5 && lc.cp == pn.ap) {
               if (ge.dk != null) {
                  var15 = -2069137 * dq.ak + 5;
                  var16 = 463;
                  byte var26 = 100;
                  byte var25 = 35;
                  ge.dk.ak(var15, var16);
                  var0.ad(og.hq + " " + client.cq * 769068277, var26 / 2 + var15, var25 / 2 + var16 - 2, 16777215, 0);
                  if (null != sk.at) {
                     if (var3 != -508354921) {
                        return;
                     }

                     var1.ad(og.mv, var26 / 2 + var15, var16 + var25 / 2 + 12, 16777215, 0);
                  } else {
                     var1.ad(og.mw, var15 + var26 / 2, 12 + var25 / 2 + var16, 16777215, 0);
                  }
               } else {
                  ge.dk = ey.ai(rc.fw, "sl_button", "", -1770095722);
               }
            }

         }
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "dr.ag(" + ')');
      }
   }

   static int az(ng var0, int var1) {
      try {
         if (-1973680119 * var0.bk != 11) {
            au -= 746573637;
            cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1;
            return 1;
         } else {
            String var2 = cm.at[(au -= 746573637) * -114988147];
            cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var0.bj(var2, -1295022560);
            return 1;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "dr.az(" + ')');
      }
   }
}
