public abstract class jx {
   public static short[][] ad;

   jx() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "jx.<init>(" + ')');
      }
   }

   abstract void ac(ju var1, int var2, int var3, int var4, int var5, long var6);

   void ap(jh var1, jb var2, int var3, int var4) {
      jw.af.ag = 0;
      int var5 = var2.af.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.af[var6];
         int var8 = var2.at[var6];
         int var9 = var2.au[var6];
         int var10 = jb.az[var7];
         int var11 = jb.az[var8];
         int var12 = jb.az[var9];
         int var13 = jb.aa[var7];
         int var14 = jb.aa[var8];
         int var15 = jb.aa[var9];
         float var16 = jb.ai[var7];
         float var17 = jb.ai[var8];
         float var18 = jb.ai[var9];
         if ((var15 - var14) * (var10 - var11) - (var13 - var14) * (var12 - var11) > 0) {
            jw.af.ac = false;
            int var19 = jw.ap();
            if (var10 < 0 || var11 < 0 || var12 < 0 || var10 > var19 || var11 > var19 || var12 > var19) {
               jw.af.ac = true;
            }

            if (var1.bb && jh.cw(var1.bg, var1.bl, var13, var14, var15, var10, var11, var12)) {
               var1.bz = var3;
               var1.bu = var4;
            }

            if (null != var2.ar && -1 != var2.ar[var6]) {
               if (!jh.ae) {
                  if (var2.al) {
                     jw.aw(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.am[var6], var2.ax[var6], var2.aq[var6], jb.ao[0], jb.ao[1], jb.ao[3], jb.as[0], jb.as[1], jb.as[3], jb.ay[0], jb.ay[1], jb.ay[3], var2.ar[var6]);
                  } else {
                     jw.aw(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.am[var6], var2.ax[var6], var2.aq[var6], jb.ao[var7], jb.ao[var8], jb.ao[var9], jb.as[var7], jb.as[var8], jb.as[var9], jb.ay[var7], jb.ay[var8], jb.ay[var9], var2.ar[var6]);
                  }
               } else {
                  int var20 = jw.af.af.am(var2.ar[var6], -2041542857);
                  jw.ay(var13, var14, var15, var10, var11, var12, var16, var17, var18, jh.cz(var20, var2.am[var6]), jh.cz(var20, var2.ax[var6]), jh.cz(var20, var2.aq[var6]));
               }
            } else if (12345678 != var2.am[var6]) {
               jw.ay(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.am[var6], var2.ax[var6], var2.aq[var6]);
            }
         }
      }

   }

   abstract void ag(jh var1, jb var2, int var3, int var4, int var5);

   void au(jh var1, jl var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17) {
      try {
         int var18 = jw.af() + var5 * jw.ah() / var13;
         int var19 = jw.at() + var9 * jw.ah() / var13;
         int var20 = jw.af() + var6 * jw.ah() / var14;
         int var21 = jw.at() + var10 * jw.ah() / var14;
         int var22 = jw.af() + var7 * jw.ah() / var15;
         int var23 = jw.at() + var11 * jw.ah() / var15;
         int var24 = jw.af() + var8 * jw.ah() / var16;
         int var25 = jw.at() + var12 * jw.ah() / var16;
         float var26 = fq.aq(var13, 1288899395);
         float var27 = fq.aq(var14, 702903791);
         float var28 = fq.aq(var15, 948411684);
         float var29 = fq.aq(var16, 827219484);
         jw.af.ag = 0;
         int var30;
         int var31;
         if ((var22 - var24) * (var21 - var25) - (var20 - var24) * (var23 - var25) > 0) {
            if (var17 == -943429689) {
               throw new IllegalStateException();
            }

            label157: {
               jw.af.ac = false;
               var30 = jw.ap();
               if (var22 >= 0) {
                  if (var17 == -943429689) {
                     throw new IllegalStateException();
                  }

                  if (var24 >= 0) {
                     if (var17 == -943429689) {
                        throw new IllegalStateException();
                     }

                     if (var20 >= 0) {
                        if (var17 == -943429689) {
                           throw new IllegalStateException();
                        }

                        if (var22 <= var30) {
                           if (var17 == -943429689) {
                              return;
                           }

                           if (var24 <= var30 && var20 <= var30) {
                              break label157;
                           }
                        }
                     }
                  }
               }

               jw.af.ac = true;
            }

            if (var1.bb && jh.cw(var1.bg, var1.bl, var23, var25, var21, var22, var24, var20)) {
               if (var17 == -943429689) {
                  throw new IllegalStateException();
               }

               var1.bz = var3;
               var1.bu = var4;
            }

            if (var2.ax * 1870095485 == -1) {
               if (var17 == -943429689) {
                  throw new IllegalStateException();
               }

               if (var2.ag * -1447020527 != 12345678) {
                  if (var17 == -943429689) {
                     return;
                  }

                  jw.ay(var23, var25, var21, var22, var24, var20, var28, var29, var27, var2.ag * -1447020527, -1755662469 * var2.am, 1385793473 * var2.ae);
               }
            } else if (!jh.ae) {
               if (var17 == -943429689) {
                  throw new IllegalStateException();
               }

               if (var2.aq) {
                  jw.aw(var23, var25, var21, var22, var24, var20, var28, var29, var27, -1447020527 * var2.ag, -1755662469 * var2.am, var2.ae * 1385793473, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.ax * 1870095485);
               } else {
                  jw.aw(var23, var25, var21, var22, var24, var20, var28, var29, var27, var2.ag * -1447020527, -1755662469 * var2.am, 1385793473 * var2.ae, var7, var8, var6, var11, var12, var10, var15, var16, var14, var2.ax * 1870095485);
               }
            } else {
               var31 = jw.af.af.am(var2.ax * 1870095485, -2008295842);
               jw.ay(var23, var25, var21, var22, var24, var20, var28, var29, var27, jh.cz(var31, -1447020527 * var2.ag), jh.cz(var31, -1755662469 * var2.am), jh.cz(var31, 1385793473 * var2.ae));
            }
         }

         if ((var18 - var20) * (var25 - var21) - (var24 - var20) * (var19 - var21) > 0) {
            label142: {
               jw.af.ac = false;
               var30 = jw.ap();
               if (var18 >= 0) {
                  if (var17 == -943429689) {
                     throw new IllegalStateException();
                  }

                  if (var20 >= 0 && var24 >= 0) {
                     if (var17 == -943429689) {
                        return;
                     }

                     if (var18 <= var30) {
                        if (var17 == -943429689) {
                           throw new IllegalStateException();
                        }

                        if (var20 <= var30) {
                           if (var17 == -943429689) {
                              throw new IllegalStateException();
                           }

                           if (var24 <= var30) {
                              break label142;
                           }

                           if (var17 == -943429689) {
                              throw new IllegalStateException();
                           }
                        }
                     }
                  }
               }

               jw.af.ac = true;
            }

            if (var1.bb) {
               if (var17 == -943429689) {
                  return;
               }

               if (jh.cw(var1.bg, var1.bl, var19, var21, var25, var18, var20, var24)) {
                  var1.bz = var3;
                  var1.bu = var4;
               }
            }

            if (-1 == 1870095485 * var2.ax) {
               if (12345678 != -1682983483 * var2.ac) {
                  if (var17 == -943429689) {
                     throw new IllegalStateException();
                  }

                  jw.ay(var19, var21, var25, var18, var20, var24, var26, var27, var29, -1682983483 * var2.ac, 1385793473 * var2.ae, -1755662469 * var2.am);
               }
            } else if (!jh.ae) {
               if (var17 == -943429689) {
                  throw new IllegalStateException();
               }

               jw.aw(var19, var21, var25, var18, var20, var24, var26, var27, var29, var2.ac * -1682983483, var2.ae * 1385793473, var2.am * -1755662469, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.ax * 1870095485);
            } else {
               var31 = jw.af.af.am(1870095485 * var2.ax, -1949689119);
               jw.ay(var19, var21, var25, var18, var20, var24, var26, var27, var29, jh.cz(var31, var2.ac * -1682983483), jh.cz(var31, var2.ae * 1385793473), jh.cz(var31, -1755662469 * var2.am));
            }
         }

      } catch (RuntimeException var32) {
         throw vk.ae(var32, "jx.au(" + ')');
      }
   }

   void ar(jh var1, jb var2, int var3, int var4, byte var5) {
      try {
         jw.af.ag = 0;
         int var6 = var2.af.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            if (var5 <= 1) {
               return;
            }

            int var8 = var2.af[var7];
            int var9 = var2.at[var7];
            int var10 = var2.au[var7];
            int var11 = jb.az[var8];
            int var12 = jb.az[var9];
            int var13 = jb.az[var10];
            int var14 = jb.aa[var8];
            int var15 = jb.aa[var9];
            int var16 = jb.aa[var10];
            float var17 = jb.ai[var8];
            float var18 = jb.ai[var9];
            float var19 = jb.ai[var10];
            if ((var16 - var15) * (var11 - var12) - (var14 - var15) * (var13 - var12) > 0) {
               label112: {
                  jw.af.ac = false;
                  int var20 = jw.ap();
                  if (var11 >= 0) {
                     if (var5 <= 1) {
                        return;
                     }

                     if (var12 >= 0) {
                        if (var5 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (var13 >= 0) {
                           if (var5 <= 1) {
                              return;
                           }

                           if (var11 <= var20) {
                              if (var5 <= 1) {
                                 throw new IllegalStateException();
                              }

                              if (var12 <= var20) {
                                 if (var13 <= var20) {
                                    break label112;
                                 }

                                 if (var5 <= 1) {
                                    throw new IllegalStateException();
                                 }
                              }
                           }
                        }
                     }
                  }

                  jw.af.ac = true;
               }

               if (var1.bb) {
                  if (var5 <= 1) {
                     return;
                  }

                  if (jh.cw(var1.bg, var1.bl, var14, var15, var16, var11, var12, var13)) {
                     if (var5 <= 1) {
                        throw new IllegalStateException();
                     }

                     var1.bz = var3;
                     var1.bu = var4;
                  }
               }

               if (null != var2.ar) {
                  if (-1 != var2.ar[var7]) {
                     if (!jh.ae) {
                        if (var5 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (var2.al) {
                           if (var5 <= 1) {
                              throw new IllegalStateException();
                           }

                           jw.aw(var14, var15, var16, var11, var12, var13, var17, var18, var19, var2.am[var7], var2.ax[var7], var2.aq[var7], jb.ao[0], jb.ao[1], jb.ao[3], jb.as[0], jb.as[1], jb.as[3], jb.ay[0], jb.ay[1], jb.ay[3], var2.ar[var7]);
                        } else {
                           jw.aw(var14, var15, var16, var11, var12, var13, var17, var18, var19, var2.am[var7], var2.ax[var7], var2.aq[var7], jb.ao[var8], jb.ao[var9], jb.ao[var10], jb.as[var8], jb.as[var9], jb.as[var10], jb.ay[var8], jb.ay[var9], jb.ay[var10], var2.ar[var7]);
                        }
                     } else {
                        int var21 = jw.af.af.am(var2.ar[var7], -2009012327);
                        jw.ay(var14, var15, var16, var11, var12, var13, var17, var18, var19, jh.cz(var21, var2.am[var7]), jh.cz(var21, var2.ax[var7]), jh.cz(var21, var2.aq[var7]));
                     }
                     continue;
                  }

                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }
               }

               if (12345678 != var2.am[var7]) {
                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }

                  jw.ay(var14, var15, var16, var11, var12, var13, var17, var18, var19, var2.am[var7], var2.ax[var7], var2.aq[var7]);
               }
            }
         }

      } catch (RuntimeException var22) {
         throw vk.ae(var22, "jx.ar(" + ')');
      }
   }

   void ad(jh var1, jl var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      int var17 = jw.af() + var5 * jw.ah() / var13;
      int var18 = jw.at() + var9 * jw.ah() / var13;
      int var19 = jw.af() + var6 * jw.ah() / var14;
      int var20 = jw.at() + var10 * jw.ah() / var14;
      int var21 = jw.af() + var7 * jw.ah() / var15;
      int var22 = jw.at() + var11 * jw.ah() / var15;
      int var23 = jw.af() + var8 * jw.ah() / var16;
      int var24 = jw.at() + var12 * jw.ah() / var16;
      float var25 = fq.aq(var13, 1834295757);
      float var26 = fq.aq(var14, 998445233);
      float var27 = fq.aq(var15, 1556334861);
      float var28 = fq.aq(var16, 821735925);
      jw.af.ag = 0;
      int var29;
      int var30;
      if ((var21 - var23) * (var20 - var24) - (var19 - var23) * (var22 - var24) > 0) {
         jw.af.ac = false;
         var29 = jw.ap();
         if (var21 < 0 || var23 < 0 || var19 < 0 || var21 > var29 || var23 > var29 || var19 > var29) {
            jw.af.ac = true;
         }

         if (var1.bb && jh.cw(var1.bg, var1.bl, var22, var24, var20, var21, var23, var19)) {
            var1.bz = var3;
            var1.bu = var4;
         }

         if (var2.ax * -1520494524 == -1) {
            if (var2.ag * 1803730106 != 12345678) {
               jw.ay(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.ag * -1447020527, 695315093 * var2.am, 1385793473 * var2.ae);
            }
         } else if (!jh.ae) {
            if (var2.aq) {
               jw.aw(var22, var24, var20, var21, var23, var19, var27, var28, var26, 370387781 * var2.ag, -1755662469 * var2.am, var2.ae * -433273660, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.ax * -1227159638);
            } else {
               jw.aw(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.ag * -1447020527, -1755662469 * var2.am, 773610953 * var2.ae, var7, var8, var6, var11, var12, var10, var15, var16, var14, var2.ax * -707866115);
            }
         } else {
            var30 = jw.af.af.am(var2.ax * 1870095485, -2078021865);
            jw.ay(var22, var24, var20, var21, var23, var19, var27, var28, var26, jh.cz(var30, -1447020527 * var2.ag), jh.cz(var30, -1755662469 * var2.am), jh.cz(var30, 1385793473 * var2.ae));
         }
      }

      if ((var17 - var19) * (var24 - var20) - (var23 - var19) * (var18 - var20) > 0) {
         jw.af.ac = false;
         var29 = jw.ap();
         if (var17 < 0 || var19 < 0 || var23 < 0 || var17 > var29 || var19 > var29 || var23 > var29) {
            jw.af.ac = true;
         }

         if (var1.bb && jh.cw(var1.bg, var1.bl, var18, var20, var24, var17, var19, var23)) {
            var1.bz = var3;
            var1.bu = var4;
         }

         if (-1 == 1556081185 * var2.ax) {
            if (12345678 != 795538661 * var2.ac) {
               jw.ay(var18, var20, var24, var17, var19, var23, var25, var26, var28, -1682983483 * var2.ac, -214948094 * var2.ae, -2036146922 * var2.am);
            }
         } else if (!jh.ae) {
            jw.aw(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.ac * -1682983483, var2.ae * 265759117, var2.am * -1755662469, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.ax * 1526242826);
         } else {
            var30 = jw.af.af.am(1870095485 * var2.ax, -2075890423);
            jw.ay(var18, var20, var24, var17, var19, var23, var25, var26, var28, jh.cz(var30, var2.ac * 517737473), jh.cz(var30, var2.ae * -1558292139), jh.cz(var30, -1310263046 * var2.am));
         }
      }

   }

   abstract void ax(ju var1, int var2, int var3, int var4, int var5, long var6);

   abstract void aq(ju var1, int var2, int var3, int var4, int var5, long var6);

   abstract void af(jh var1, jl var2, int var3, int var4, int var5);

   abstract void am(ju var1, int var2, int var3, int var4, int var5, long var6);

   void al(jh var1, jl var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      int var17 = jw.af() + var5 * jw.ah() / var13;
      int var18 = jw.at() + var9 * jw.ah() / var13;
      int var19 = jw.af() + var6 * jw.ah() / var14;
      int var20 = jw.at() + var10 * jw.ah() / var14;
      int var21 = jw.af() + var7 * jw.ah() / var15;
      int var22 = jw.at() + var11 * jw.ah() / var15;
      int var23 = jw.af() + var8 * jw.ah() / var16;
      int var24 = jw.at() + var12 * jw.ah() / var16;
      float var25 = fq.aq(var13, 1681942474);
      float var26 = fq.aq(var14, 850397505);
      float var27 = fq.aq(var15, 651772701);
      float var28 = fq.aq(var16, 633696959);
      jw.af.ag = 0;
      int var29;
      int var30;
      if ((var21 - var23) * (var20 - var24) - (var19 - var23) * (var22 - var24) > 0) {
         jw.af.ac = false;
         var29 = jw.ap();
         if (var21 < 0 || var23 < 0 || var19 < 0 || var21 > var29 || var23 > var29 || var19 > var29) {
            jw.af.ac = true;
         }

         if (var1.bb && jh.cw(var1.bg, var1.bl, var22, var24, var20, var21, var23, var19)) {
            var1.bz = var3;
            var1.bu = var4;
         }

         if (var2.ax * 1870095485 == -1) {
            if (var2.ag * -1447020527 != -437214458) {
               jw.ay(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.ag * -865715691, 1839502527 * var2.am, 1871714757 * var2.ae);
            }
         } else if (!jh.ae) {
            if (var2.aq) {
               jw.aw(var22, var24, var20, var21, var23, var19, var27, var28, var26, -886628277 * var2.ag, -1755662469 * var2.am, var2.ae * -19461504, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.ax * 1870095485);
            } else {
               jw.aw(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.ag * -1731337756, -1755662469 * var2.am, 2039318036 * var2.ae, var7, var8, var6, var11, var12, var10, var15, var16, var14, var2.ax * -1863222651);
            }
         } else {
            var30 = jw.af.af.am(var2.ax * 1870095485, -2142979421);
            jw.ay(var22, var24, var20, var21, var23, var19, var27, var28, var26, jh.cz(var30, -488419004 * var2.ag), jh.cz(var30, -1620610198 * var2.am), jh.cz(var30, -653665227 * var2.ae));
         }
      }

      if ((var17 - var19) * (var24 - var20) - (var23 - var19) * (var18 - var20) > 0) {
         jw.af.ac = false;
         var29 = jw.ap();
         if (var17 < 0 || var19 < 0 || var23 < 0 || var17 > var29 || var19 > var29 || var23 > var29) {
            jw.af.ac = true;
         }

         if (var1.bb && jh.cw(var1.bg, var1.bl, var18, var20, var24, var17, var19, var23)) {
            var1.bz = var3;
            var1.bu = var4;
         }

         if (-1 == 1870095485 * var2.ax) {
            if (12345678 != -263125697 * var2.ac) {
               jw.ay(var18, var20, var24, var17, var19, var23, var25, var26, var28, 1477492659 * var2.ac, 1385793473 * var2.ae, -940056754 * var2.am);
            }
         } else if (!jh.ae) {
            jw.aw(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.ac * -1682983483, var2.ae * 1385793473, var2.am * -1755662469, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.ax * 1236656764);
         } else {
            var30 = jw.af.af.am(1870095485 * var2.ax, -2125391348);
            jw.ay(var18, var20, var24, var17, var19, var23, var25, var26, var28, jh.cz(var30, var2.ac * 745026976), jh.cz(var30, var2.ae * 1385793473), jh.cz(var30, -1589265697 * var2.am));
         }
      }

   }

   abstract void at(jh var1, jb var2, int var3, int var4);

   void ah(jh var1, jb var2, int var3, int var4) {
      jw.af.ag = 0;
      int var5 = var2.af.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.af[var6];
         int var8 = var2.at[var6];
         int var9 = var2.au[var6];
         int var10 = jb.az[var7];
         int var11 = jb.az[var8];
         int var12 = jb.az[var9];
         int var13 = jb.aa[var7];
         int var14 = jb.aa[var8];
         int var15 = jb.aa[var9];
         float var16 = jb.ai[var7];
         float var17 = jb.ai[var8];
         float var18 = jb.ai[var9];
         if ((var15 - var14) * (var10 - var11) - (var13 - var14) * (var12 - var11) > 0) {
            jw.af.ac = false;
            int var19 = jw.ap();
            if (var10 < 0 || var11 < 0 || var12 < 0 || var10 > var19 || var11 > var19 || var12 > var19) {
               jw.af.ac = true;
            }

            if (var1.bb && jh.cw(var1.bg, var1.bl, var13, var14, var15, var10, var11, var12)) {
               var1.bz = var3;
               var1.bu = var4;
            }

            if (null != var2.ar && -1 != var2.ar[var6]) {
               if (!jh.ae) {
                  if (var2.al) {
                     jw.aw(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.am[var6], var2.ax[var6], var2.aq[var6], jb.ao[0], jb.ao[1], jb.ao[3], jb.as[0], jb.as[1], jb.as[3], jb.ay[0], jb.ay[1], jb.ay[3], var2.ar[var6]);
                  } else {
                     jw.aw(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.am[var6], var2.ax[var6], var2.aq[var6], jb.ao[var7], jb.ao[var8], jb.ao[var9], jb.as[var7], jb.as[var8], jb.as[var9], jb.ay[var7], jb.ay[var8], jb.ay[var9], var2.ar[var6]);
                  }
               } else {
                  int var20 = jw.af.af.am(var2.ar[var6], -2037346431);
                  jw.ay(var13, var14, var15, var10, var11, var12, var16, var17, var18, jh.cz(var20, var2.am[var6]), jh.cz(var20, var2.ax[var6]), jh.cz(var20, var2.aq[var6]));
               }
            } else if (12345678 != var2.am[var6]) {
               jw.ay(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.am[var6], var2.ax[var6], var2.aq[var6]);
            }
         }
      }

   }

   void ab(jh var1, jb var2, int var3, int var4) {
      jw.af.ag = 0;
      int var5 = var2.af.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.af[var6];
         int var8 = var2.at[var6];
         int var9 = var2.au[var6];
         int var10 = jb.az[var7];
         int var11 = jb.az[var8];
         int var12 = jb.az[var9];
         int var13 = jb.aa[var7];
         int var14 = jb.aa[var8];
         int var15 = jb.aa[var9];
         float var16 = jb.ai[var7];
         float var17 = jb.ai[var8];
         float var18 = jb.ai[var9];
         if ((var15 - var14) * (var10 - var11) - (var13 - var14) * (var12 - var11) > 0) {
            jw.af.ac = false;
            int var19 = jw.ap();
            if (var10 < 0 || var11 < 0 || var12 < 0 || var10 > var19 || var11 > var19 || var12 > var19) {
               jw.af.ac = true;
            }

            if (var1.bb && jh.cw(var1.bg, var1.bl, var13, var14, var15, var10, var11, var12)) {
               var1.bz = var3;
               var1.bu = var4;
            }

            if (null != var2.ar && -1 != var2.ar[var6]) {
               if (!jh.ae) {
                  if (var2.al) {
                     jw.aw(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.am[var6], var2.ax[var6], var2.aq[var6], jb.ao[0], jb.ao[1], jb.ao[3], jb.as[0], jb.as[1], jb.as[3], jb.ay[0], jb.ay[1], jb.ay[3], var2.ar[var6]);
                  } else {
                     jw.aw(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.am[var6], var2.ax[var6], var2.aq[var6], jb.ao[var7], jb.ao[var8], jb.ao[var9], jb.as[var7], jb.as[var8], jb.as[var9], jb.ay[var7], jb.ay[var8], jb.ay[var9], var2.ar[var6]);
                  }
               } else {
                  int var20 = jw.af.af.am(var2.ar[var6], -1973111472);
                  jw.ay(var13, var14, var15, var10, var11, var12, var16, var17, var18, jh.cz(var20, var2.am[var6]), jh.cz(var20, var2.ax[var6]), jh.cz(var20, var2.aq[var6]));
               }
            } else if (12345678 != var2.am[var6]) {
               jw.ay(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.am[var6], var2.ax[var6], var2.aq[var6]);
            }
         }
      }

   }

   abstract void ae(jh var1, jl var2, int var3, int var4, int var5, int var6);

   public static final int mg(String var0, String var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         return bo.mp(var0, var1, var2, var3, var4, var5, -1, false, -1, 990761555);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "jx.mg(" + ')');
      }
   }
}
