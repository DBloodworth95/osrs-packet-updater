public class or {
   public static final int ae = -2;
   public static final int am = 2;
   public static final int ag = -3;
   public static final int ai = 16;
   public static final int aq = 4;
   public static final int ac = -1;
   public static final int bg = 64;

   or() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "or.<init>(" + ')');
      }
   }

   static final void al(dd var0, int var1, int var2, int var3, int var4, int var5, int var6, kd var7, int var8) {
      try {
         if (client.ci) {
            if (var8 != 808196321) {
               throw new IllegalStateException();
            }

            if (0 == (var0.al[0][var2][var3] & 2)) {
               if (var8 != 808196321) {
                  return;
               }

               if (0 != (var0.al[var1][var2][var3] & 16)) {
                  if (var8 != 808196321) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }
         }

         if (var1 < 63843725 * db.ac) {
            if (var8 != 808196321) {
               throw new IllegalStateException();
            }

            ac = var1 * 1112005957;
         }

         id var9;
         int var10;
         int var11;
         label846: {
            var9 = kf.ae(var4, (byte)37);
            if (var5 != 1) {
               if (var8 != 808196321) {
                  throw new IllegalStateException();
               }

               if (3 != var5) {
                  var10 = var9.aa * -1298730649;
                  var11 = var9.ai * -1257293157;
                  break label846;
               }

               if (var8 != 808196321) {
                  throw new IllegalStateException();
               }
            }

            var10 = -1257293157 * var9.ai;
            var11 = -1298730649 * var9.aa;
         }

         int var12;
         int var13;
         if (var10 + var2 <= var0.ax * 754660757) {
            if (var8 != 808196321) {
               return;
            }

            var12 = (var10 >> 1) + var2;
            var13 = (var10 + 1 >> 1) + var2;
         } else {
            var12 = var2;
            var13 = var2 + 1;
         }

         int var14;
         int var15;
         if (var3 + var11 <= var0.aq * -1090907831) {
            if (var8 != 808196321) {
               throw new IllegalStateException();
            }

            var14 = var3 + (var11 >> 1);
            var15 = var3 + (var11 + 1 >> 1);
         } else {
            var14 = var3;
            var15 = var3 + 1;
         }

         int[][] var16 = var0.ar[var1];
         int var17 = var16[var13][var15] + var16[var13][var14] + var16[var12][var14] + var16[var12][var15] >> 2;
         int var18 = (var10 << 6) + (var2 << 7);
         int var19 = (var11 << 6) + (var3 << 7);
         boolean var10003;
         if (0 == -1478169491 * var9.ay) {
            if (var8 != 808196321) {
               throw new IllegalStateException();
            }

            var10003 = true;
         } else {
            var10003 = false;
         }

         long var20 = kf.ar(var2, var3, 2, var10003, var4, 1011931441 * var0.ac, (byte)34);
         int var22 = var6 + (var5 << 6);
         if (-937149393 * var9.bl == 1) {
            if (var8 != 808196321) {
               throw new IllegalStateException();
            }

            var22 += 256;
         }

         if (var9.ab(115363152)) {
            if (var8 != 808196321) {
               throw new IllegalStateException();
            }

            lv.ag(var1, var2, var3, var9, var5, 171358687);
         }

         jh var23 = var0.ae;
         Object var24;
         if (var6 == 22) {
            if (client.ci) {
               if (var8 != 808196321) {
                  return;
               }

               if (var9.ay * -1478169491 == 0) {
                  if (var8 != 808196321) {
                     throw new IllegalStateException();
                  }

                  if (1 != var9.ao * 891389023 && !var9.bi) {
                     if (var8 != 808196321) {
                        return;
                     }

                     return;
                  }
               }
            }

            label708: {
               if (-1 == var9.an * 1369549309) {
                  if (var8 != 808196321) {
                     throw new IllegalStateException();
                  }

                  if (var9.bz == null) {
                     if (var8 != 808196321) {
                        throw new IllegalStateException();
                     }

                     var24 = var9.at(22, var5, var16, var18, var17, var19, (byte)-66);
                     break label708;
                  }
               }

               var24 = new dk(var0, var4, 22, var5, var1, var2, var3, var9.an * 1369549309, var9.bc, (ju)null);
            }

            var23.af(var1, var2, var3, var17, (ju)var24, var20, var22);
            if (1 == var9.ao * 891389023 && var7 != null) {
               if (var8 != 808196321) {
                  throw new IllegalStateException();
               }

               var7.ax(var2, var3, 1100536029);
            }

         } else {
            int var25;
            if (10 != var6) {
               if (11 != var6) {
                  int[] var10000;
                  if (var6 >= 12) {
                     label717: {
                        if (-1 == 1369549309 * var9.an) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           if (null == var9.bz) {
                              if (var8 != 808196321) {
                                 return;
                              }

                              var24 = var9.at(var6, var5, var16, var18, var17, var19, (byte)-79);
                              break label717;
                           }
                        }

                        var24 = new dk(var0, var4, var6, var5, var1, var2, var3, 1369549309 * var9.an, var9.bc, (ju)null);
                     }

                     var23.al(var1, var2, var3, var17, 1, 1, (ju)var24, 0, var20, var22);
                     if (var6 >= 12 && var6 <= 17) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        if (13 != var6) {
                           if (var8 != 808196321) {
                              return;
                           }

                           if (var1 > 0) {
                              if (var8 != 808196321) {
                                 throw new IllegalStateException();
                              }

                              var10000 = br.ah[var1][var2];
                              var10000[var3] |= 2340;
                           }
                        }
                     }

                     if (0 != var9.ao * 891389023) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        if (var7 != null) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           var7.ag(var2, var3, var10, var11, var9.as, (short)-6754);
                        }
                     }

                     return;
                  }

                  if (var6 == 0) {
                     label724: {
                        if (-1 == 1369549309 * var9.an) {
                           if (var8 != 808196321) {
                              return;
                           }

                           if (var9.bz == null) {
                              if (var8 != 808196321) {
                                 throw new IllegalStateException();
                              }

                              var24 = var9.at(0, var5, var16, var18, var17, var19, (byte)-90);
                              break label724;
                           }
                        }

                        var24 = new dk(var0, var4, 0, var5, var1, var2, var3, 1369549309 * var9.an, var9.bc, (ju)null);
                     }

                     var23.au(var1, var2, var3, var17, (ju)var24, (ju)null, db.aa[var5], 0, var20, var22);
                     if (var5 == 0) {
                        if (var8 != 808196321) {
                           return;
                        }

                        if (var9.bs) {
                           sy.aq[var1][var2][var3] = 50;
                           sy.aq[var1][var2][var3 + 1] = 50;
                        }

                        if (var9.aw) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           var10000 = br.ah[var1][var2];
                           var10000[var3] |= 585;
                        }
                     } else if (var5 == 1) {
                        if (var8 != 808196321) {
                           return;
                        }

                        if (var9.bs) {
                           sy.aq[var1][var2][var3 + 1] = 50;
                           sy.aq[var1][var2 + 1][1 + var3] = 50;
                        }

                        if (var9.aw) {
                           if (var8 != 808196321) {
                              return;
                           }

                           var10000 = br.ah[var1][var2];
                           var10000[1 + var3] |= 1170;
                        }
                     } else if (var5 == 2) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        if (var9.bs) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           sy.aq[var1][1 + var2][var3] = 50;
                           sy.aq[var1][var2 + 1][1 + var3] = 50;
                        }

                        if (var9.aw) {
                           if (var8 != 808196321) {
                              return;
                           }

                           var10000 = br.ah[var1][var2 + 1];
                           var10000[var3] |= 585;
                        }
                     } else if (3 == var5) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        if (var9.bs) {
                           sy.aq[var1][var2][var3] = 50;
                           sy.aq[var1][1 + var2][var3] = 50;
                        }

                        if (var9.aw) {
                           var10000 = br.ah[var1][var2];
                           var10000[var3] |= 1170;
                        }
                     }

                     if (0 != 891389023 * var9.ao) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        if (var7 != null) {
                           var7.ae(var2, var3, var6, var5, var9.as, (byte)-12);
                        }
                     }

                     if (16 != var9.ak * -1939734635) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        var23.ay(var1, var2, var3, -1939734635 * var9.ak);
                     }

                     return;
                  }

                  if (1 == var6) {
                     if (var8 != 808196321) {
                        throw new IllegalStateException();
                     }

                     label732: {
                        if (-1 == 1369549309 * var9.an) {
                           if (var8 != 808196321) {
                              return;
                           }

                           if (null == var9.bz) {
                              var24 = var9.at(1, var5, var16, var18, var17, var19, (byte)-64);
                              break label732;
                           }
                        }

                        var24 = new dk(var0, var4, 1, var5, var1, var2, var3, var9.an * 1369549309, var9.bc, (ju)null);
                     }

                     var23.au(var1, var2, var3, var17, (ju)var24, (ju)null, db.ai[var5], 0, var20, var22);
                     if (var9.bs) {
                        if (var5 == 0) {
                           if (var8 != 808196321) {
                              return;
                           }

                           sy.aq[var1][var2][var3 + 1] = 50;
                        } else if (var5 == 1) {
                           if (var8 != 808196321) {
                              return;
                           }

                           sy.aq[var1][var2 + 1][1 + var3] = 50;
                        } else if (2 == var5) {
                           if (var8 != 808196321) {
                              return;
                           }

                           sy.aq[var1][1 + var2][var3] = 50;
                        } else if (var5 == 3) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           sy.aq[var1][var2][var3] = 50;
                        }
                     }

                     if (891389023 * var9.ao != 0) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        if (var7 != null) {
                           var7.ae(var2, var3, var6, var5, var9.as, (byte)-31);
                        }
                     }

                     return;
                  }

                  int var31;
                  if (2 == var6) {
                     if (var8 != 808196321) {
                        throw new IllegalStateException();
                     }

                     var31 = var5 + 1 & 3;
                     Object var33;
                     Object var34;
                     if (1369549309 * var9.an == -1 && null == var9.bz) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        var34 = var9.at(2, var5 + 4, var16, var18, var17, var19, (byte)-122);
                        var33 = var9.at(2, var31, var16, var18, var17, var19, (byte)-2);
                     } else {
                        var34 = new dk(var0, var4, 2, var5 + 4, var1, var2, var3, 1369549309 * var9.an, var9.bc, (ju)null);
                        var33 = new dk(var0, var4, 2, var31, var1, var2, var3, var9.an * 1369549309, var9.bc, (ju)null);
                     }

                     var23.au(var1, var2, var3, var17, (ju)var34, (ju)var33, db.aa[var5], db.aa[var31], var20, var22);
                     if (var9.aw) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        if (var5 == 0) {
                           var10000 = br.ah[var1][var2];
                           var10000[var3] |= 585;
                           var10000 = br.ah[var1][var2];
                           var10000[1 + var3] |= 1170;
                        } else if (1 == var5) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           var10000 = br.ah[var1][var2];
                           var10000[var3 + 1] |= 1170;
                           var10000 = br.ah[var1][1 + var2];
                           var10000[var3] |= 585;
                        } else if (2 == var5) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           var10000 = br.ah[var1][var2 + 1];
                           var10000[var3] |= 585;
                           var10000 = br.ah[var1][var2];
                           var10000[var3] |= 1170;
                        } else if (3 == var5) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           var10000 = br.ah[var1][var2];
                           var10000[var3] |= 1170;
                           var10000 = br.ah[var1][var2];
                           var10000[var3] |= 585;
                        }
                     }

                     if (0 != 891389023 * var9.ao && var7 != null) {
                        var7.ae(var2, var3, var6, var5, var9.as, (byte)-7);
                     }

                     if (16 != var9.ak * -1939734635) {
                        if (var8 != 808196321) {
                           return;
                        }

                        var23.ay(var1, var2, var3, var9.ak * -1939734635);
                     }

                     return;
                  }

                  if (var6 == 3) {
                     if (var8 != 808196321) {
                        throw new IllegalStateException();
                     }

                     if (var9.an * 1369549309 == -1 && null == var9.bz) {
                        var24 = var9.at(3, var5, var16, var18, var17, var19, (byte)-13);
                     } else {
                        var24 = new dk(var0, var4, 3, var5, var1, var2, var3, var9.an * 1369549309, var9.bc, (ju)null);
                     }

                     var23.au(var1, var2, var3, var17, (ju)var24, (ju)null, db.ai[var5], 0, var20, var22);
                     if (var9.bs) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        if (0 == var5) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           sy.aq[var1][var2][1 + var3] = 50;
                        } else if (var5 == 1) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           sy.aq[var1][1 + var2][var3 + 1] = 50;
                        } else if (2 == var5) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           sy.aq[var1][var2 + 1][var3] = 50;
                        } else if (var5 == 3) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           sy.aq[var1][var2][var3] = 50;
                        }
                     }

                     if (var9.ao * 891389023 != 0) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        if (null != var7) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           var7.ae(var2, var3, var6, var5, var9.as, (byte)-60);
                        }
                     }

                     return;
                  }

                  if (9 == var6) {
                     if (var8 != 808196321) {
                        throw new IllegalStateException();
                     }

                     label757: {
                        if (1369549309 * var9.an == -1) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           if (var9.bz == null) {
                              if (var8 != 808196321) {
                                 return;
                              }

                              var24 = var9.at(var6, var5, var16, var18, var17, var19, (byte)-1);
                              break label757;
                           }
                        }

                        var24 = new dk(var0, var4, var6, var5, var1, var2, var3, var9.an * 1369549309, var9.bc, (ju)null);
                     }

                     var23.al(var1, var2, var3, var17, 1, 1, (ju)var24, 0, var20, var22);
                     if (0 != 891389023 * var9.ao) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        if (var7 != null) {
                           if (var8 != 808196321) {
                              return;
                           }

                           var7.ag(var2, var3, var10, var11, var9.as, (short)-2537);
                        }
                     }

                     if (var9.ak * -1939734635 != 16) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        var23.ay(var1, var2, var3, var9.ak * -1939734635);
                     }

                     return;
                  }

                  if (4 == var6) {
                     if (var8 != 808196321) {
                        throw new IllegalStateException();
                     }

                     label766: {
                        if (-1 == var9.an * 1369549309) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           if (null == var9.bz) {
                              if (var8 != 808196321) {
                                 return;
                              }

                              var24 = var9.at(4, var5, var16, var18, var17, var19, (byte)-69);
                              break label766;
                           }
                        }

                        var24 = new dk(var0, var4, 4, var5, var1, var2, var3, 1369549309 * var9.an, var9.bc, (ju)null);
                     }

                     var23.ar(var1, var2, var3, var17, (ju)var24, (ju)null, db.aa[var5], 0, 0, 0, var20, var22);
                     return;
                  }

                  long var32;
                  Object var35;
                  if (var6 == 5) {
                     if (var8 != 808196321) {
                        throw new IllegalStateException();
                     }

                     var31 = 16;
                     var32 = var23.bf(var1, var2, var3);
                     if (var32 != 0L) {
                        if (var8 != 808196321) {
                           throw new IllegalStateException();
                        }

                        var31 = kf.ae(ii.at(var32), (byte)35).ak * -1939734635;
                     }

                     if (var9.an * 1369549309 == -1 && var9.bz == null) {
                        if (var8 != 808196321) {
                           return;
                        }

                        var35 = var9.at(4, var5, var16, var18, var17, var19, (byte)-52);
                     } else {
                        var35 = new dk(var0, var4, 4, var5, var1, var2, var3, var9.an * 1369549309, var9.bc, (ju)null);
                     }

                     var23.ar(var1, var2, var3, var17, (ju)var35, (ju)null, db.aa[var5], 0, var31 * db.ao[var5], var31 * db.as[var5], var20, var22);
                     return;
                  }

                  if (6 == var6) {
                     var31 = 8;
                     var32 = var23.bf(var1, var2, var3);
                     if (var32 != 0L) {
                        var31 = kf.ae(ii.at(var32), (byte)18).ak * -1939734635 / 2;
                     }

                     label785: {
                        if (-1 == var9.an * 1369549309) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           if (null == var9.bz) {
                              if (var8 != 808196321) {
                                 throw new IllegalStateException();
                              }

                              var35 = var9.at(4, 4 + var5, var16, var18, var17, var19, (byte)-62);
                              break label785;
                           }
                        }

                        var35 = new dk(var0, var4, 4, 4 + var5, var1, var2, var3, var9.an * 1369549309, var9.bc, (ju)null);
                     }

                     var23.ar(var1, var2, var3, var17, (ju)var35, (ju)null, 256, var5, var31 * db.ay[var5], db.aj[var5] * var31, var20, var22);
                     return;
                  }

                  if (var6 == 7) {
                     if (var8 != 808196321) {
                        throw new IllegalStateException();
                     }

                     label794: {
                        var25 = 2 + var5 & 3;
                        if (-1 == var9.an * 1369549309) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           if (var9.bz == null) {
                              if (var8 != 808196321) {
                                 return;
                              }

                              var24 = var9.at(4, var25 + 4, var16, var18, var17, var19, (byte)-34);
                              break label794;
                           }
                        }

                        var24 = new dk(var0, var4, 4, var25 + 4, var1, var2, var3, 1369549309 * var9.an, var9.bc, (ju)null);
                     }

                     var23.ar(var1, var2, var3, var17, (ju)var24, (ju)null, 256, var25, 0, 0, var20, var22);
                     return;
                  }

                  if (8 != var6) {
                     return;
                  }

                  if (var8 != 808196321) {
                     throw new IllegalStateException();
                  }

                  var31 = 8;
                  var32 = var23.bf(var1, var2, var3);
                  if (0L != var32) {
                     var31 = kf.ae(ii.at(var32), (byte)103).ak * -1939734635 / 2;
                  }

                  Object var28;
                  label801: {
                     int var29 = 2 + var5 & 3;
                     if (-1 == 1369549309 * var9.an) {
                        if (var8 != 808196321) {
                           return;
                        }

                        if (var9.bz == null) {
                           if (var8 != 808196321) {
                              return;
                           }

                           var35 = var9.at(4, var5 + 4, var16, var18, var17, var19, (byte)-83);
                           var28 = var9.at(4, var29 + 4, var16, var18, var17, var19, (byte)-79);
                           break label801;
                        }
                     }

                     var35 = new dk(var0, var4, 4, var5 + 4, var1, var2, var3, var9.an * 1369549309, var9.bc, (ju)null);
                     var28 = new dk(var0, var4, 4, var29 + 4, var1, var2, var3, var9.an * 1369549309, var9.bc, (ju)null);
                  }

                  var23.ar(var1, var2, var3, var17, (ju)var35, (ju)var28, 256, var5, var31 * db.ay[var5], var31 * db.aj[var5], var20, var22);
                  return;
               }

               if (var8 != 808196321) {
                  throw new IllegalStateException();
               }
            }

            if (-1 == var9.an * 1369549309 && null == var9.bz) {
               if (var8 != 808196321) {
                  throw new IllegalStateException();
               }

               var24 = var9.at(10, var5, var16, var18, var17, var19, (byte)-112);
            } else {
               var24 = new dk(var0, var4, 10, var5, var1, var2, var3, 1369549309 * var9.an, var9.bc, (ju)null);
            }

            if (var24 != null) {
               if (var8 != 808196321) {
                  throw new IllegalStateException();
               }

               short var10008;
               if (11 == var6) {
                  if (var8 != 808196321) {
                     throw new IllegalStateException();
                  }

                  var10008 = 256;
               } else {
                  var10008 = 0;
               }

               if (var23.al(var1, var2, var3, var17, var10, var11, (ju)var24, var10008, var20, var22) && var9.bs) {
                  if (var8 != 808196321) {
                     return;
                  }

                  var25 = 15;
                  if (var24 instanceof jm) {
                     if (var8 != 808196321) {
                        throw new IllegalStateException();
                     }

                     var25 = ((jm)var24).al() / 4;
                     if (var25 > 30) {
                        if (var8 != 808196321) {
                           return;
                        }

                        var25 = 30;
                     }
                  }

                  for(int var26 = 0; var26 <= var10; ++var26) {
                     if (var8 != 808196321) {
                        throw new IllegalStateException();
                     }

                     for(int var27 = 0; var27 <= var11; ++var27) {
                        if (var8 != 808196321) {
                           return;
                        }

                        if (var25 > sy.aq[var1][var26 + var2][var3 + var27]) {
                           if (var8 != 808196321) {
                              throw new IllegalStateException();
                           }

                           sy.aq[var1][var26 + var2][var27 + var3] = (byte)var25;
                        }
                     }
                  }
               }
            }

            if (0 != var9.ao * 891389023) {
               if (var8 != 808196321) {
                  throw new IllegalStateException();
               }

               if (null != var7) {
                  if (var8 != 808196321) {
                     throw new IllegalStateException();
                  }

                  var7.ag(var2, var3, var10, var11, var9.as, (short)-23695);
               }
            }

         }
      } catch (RuntimeException var30) {
         throw vk.ae(var30, "or.al(" + ')');
      }
   }
}
