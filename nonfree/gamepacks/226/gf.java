import java.util.HashMap;
import java.util.Iterator;

public class gf extends fq {
   static pe aw;
   // $FF: synthetic field
   final fz this$0;
   public static final int ad = 17;
   int ap;
   static tt fx;

   void ap(vl var1, int var2) {
      try {
         this.ap = var1.ce(1045366498) * -2144658699;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gf.ap(" + ')');
      }
   }

   void aw(gy var1, int var2) {
      try {
         var1.au(this.ap * 857948509, 16711935);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gf.aw(" + ')');
      }
   }

   static final void lc(int var0, int var1, int var2, int var3, int var4) {
      try {
         int var28;
         int var40;
         if (392309539 * client.oq == 0) {
            if (var4 != 2010817320) {
               throw new IllegalStateException();
            }

            if (!client.os) {
               if (var4 != 2010817320) {
                  return;
               }

               int var5 = var0 - var2;
               int var6 = var1 - var3;
               int[] var7 = new int[client.jv.ai(-39814115)];
               float[] var8 = new float[client.jv.ai(1689231789)];
               int var9 = 0;

               for(Iterator var10 = client.jv.iterator(); var10.hasNext(); ++var9) {
                  if (var4 != 2010817320) {
                     throw new IllegalStateException();
                  }

                  dn var11 = (dn)var10.next();
                  var7[var9] = var11.ap * -1948824391;
                  var8[var9] = var11.aw.bd;
               }

               gk.aj(var8, var7, 961902737);
               HashMap var37 = new HashMap();

               for(var9 = var7.length - 1; var9 >= 0; --var9) {
                  if (var4 != 2010817320) {
                     throw new IllegalStateException();
                  }

                  if (var8[var9] > 0.0F) {
                     if (var4 != 2010817320) {
                        throw new IllegalStateException();
                     }

                     sx var39 = client.jv.am(var7[var9], (byte)7);
                     if (!var37.containsKey(var39)) {
                        if (var4 != 2010817320) {
                           throw new IllegalStateException();
                        }

                        var37.put(var39, var7[var9]);
                     }
                  }
               }

               for(var9 = 0; var9 < var7.length; ++var9) {
                  if (var4 != 2010817320) {
                     throw new IllegalStateException();
                  }

                  var40 = var7[var9];
                  sx var12 = client.jv.am(var40, (byte)7);
                  Integer var13 = (Integer)var37.get(var12);
                  if (null != var13) {
                     if (var4 != 2010817320) {
                        throw new IllegalStateException();
                     }

                     if (!var13.equals(var40)) {
                        if (var4 != 2010817320) {
                           return;
                        }
                     } else if (var12 == sx.aw) {
                        ar.lo(og.go, "", 23, 0, var5, var6, 0, false, var40, (byte)1);
                     } else if (sx.ak == var12) {
                        if (var4 != 2010817320) {
                           throw new IllegalStateException();
                        }

                        int var14 = cu.jl(hx.jf, bz.mx.ap((byte)52), bz.mx.aw(-1487886264), bz.mx.ak((byte)1), -698284057);
                        qt var15 = ch.aw((float)bz.mx.ap((byte)124), (float)var14, (float)bz.mx.aw(-1064295365), 630689047);
                        qt var16 = gs.az(var14, -678007887 * ad.kw, 2138486231 * in.ks, -892337617 * oo.kv, (byte)36);
                        if (null != var16) {
                           qt var18;
                           synchronized(qt.ak) {
                              if (qt.ai * 937612641 == 0) {
                                 var18 = new qt(var16);
                              } else {
                                 qt.ak[(qt.ai -= -847475039) * 937612641].ai(var16, -980308502);
                                 var18 = qt.ak[937612641 * qt.ai];
                              }
                           }

                           var18.au(var15, (byte)1);
                           qt var20 = qt.aw;
                           qt var21;
                           synchronized(qt.ak) {
                              if (0 == 937612641 * qt.ai) {
                                 if (var4 != 2010817320) {
                                    throw new IllegalStateException();
                                 }

                                 var21 = new qt(var20);
                              } else {
                                 qt.ak[(qt.ai -= -847475039) * 937612641].ai(var20, 864720693);
                                 var21 = qt.ak[qt.ai * 937612641];
                              }
                           }

                           var21.af(var18, (byte)61);
                           qt var23 = qt.ap;
                           float var22 = var21.an(var23, -1837312681);
                           qt var26 = qt.aw;
                           float var25 = var26.an(var18, -323113053);
                           float var27 = (float)Math.atan2((double)var22, (double)var25);
                           var28 = al.aw(var27, -851094662);
                           var28 += 64;
                           var28 = (var28 & 2047) / 128;
                           ar.lo(og.gi, "", 60, var28, 0, 0, 0, false, var40, (byte)25);
                           var18.ak(16711680);
                           var21.ak(16711680);
                           var16.ak(16711680);
                        }
                     }
                  }
               }
            }
         }

         long var34 = -1L;
         int var35 = 0;
         long var36 = -1L;

         int var38;
         for(var38 = 0; var38 < tm.ap(1355164206); ++var38) {
            if (var4 != 2010817320) {
               throw new IllegalStateException();
            }

            long var41 = jr.ab[var38];
            if (var41 == var36) {
               if (var4 != 2010817320) {
                  throw new IllegalStateException();
               }
            } else {
               var36 = var41;
               int var43 = gt.ak(var38, (byte)62);
               long var44 = jr.ab[var38];
               int var17 = (int)(var44 >>> 7 & 127L);
               var17 = var17;
               int var45 = rj.ai(var38, 158168499);
               int var19 = la.ae(jr.ab[var38]);
               int var46 = var19;
               int var47 = ll.am(var38, 2066947812);
               if (var47 == 2047) {
                  if (var4 != 2010817320) {
                     throw new IllegalStateException();
                  }

                  var47 = -1;
               }

               so var48;
               dn var49;
               label687: {
                  var48 = null;
                  var49 = null;
                  if (var47 >= 0) {
                     if (var4 != 2010817320) {
                        throw new IllegalStateException();
                     }

                     if (null != hx.jf.ab[var47]) {
                        if (var4 != 2010817320) {
                           throw new IllegalStateException();
                        }

                        var48 = hx.jf.ab[var47];
                        var49 = var48.ak;
                        break label687;
                     }
                  }

                  if (-1 == var47) {
                     if (var4 != 2010817320) {
                        throw new IllegalStateException();
                     }

                     var48 = null;
                     var49 = hx.jf;
                  }
               }

               if (null == var49) {
                  if (var4 != 2010817320) {
                     throw new IllegalStateException();
                  }
               } else {
                  int var24 = ha.lv(var47, var48, var49, -1659790827);
                  if (var24 != -1) {
                     if (var45 == 2) {
                        if (var4 != 2010817320) {
                           throw new IllegalStateException();
                        }

                        if (var49.aw.bp(var24, var43, var17, var41) >= 0) {
                           label726: {
                              if (var4 != 2010817320) {
                                 throw new IllegalStateException();
                              }

                              ir var50 = ei.aw(var19, 888461382);
                              if (var50.bm != null) {
                                 if (var4 != 2010817320) {
                                    throw new IllegalStateException();
                                 }

                                 var50 = var50.an((byte)88);
                              }

                              if (null == var50) {
                                 if (var4 != 2010817320) {
                                    throw new IllegalStateException();
                                 }
                                 continue;
                              }

                              do var52 = null;

                              for(do var55 = (do)var49.ac.as(); null != var55; var55 = (do)var49.ac.am()) {
                                 if (var4 != 2010817320) {
                                    return;
                                 }

                                 if (var24 == var55.ap * 1321466283) {
                                    if (var4 != 2010817320) {
                                       throw new IllegalStateException();
                                    }

                                    if (-440355905 * var55.ak == var43) {
                                       if (var4 != 2010817320) {
                                          throw new IllegalStateException();
                                       }

                                       if (var17 == var55.aj * 1462658139 && var46 == var55.ae * 451987923) {
                                          if (var4 != 2010817320) {
                                             throw new IllegalStateException();
                                          }

                                          var52 = var55;
                                          break;
                                       }
                                    }
                                 }
                              }

                              if (!fx.du) {
                                 if (var4 != 2010817320) {
                                    throw new IllegalStateException();
                                 }

                                 if (1 == client.oq * 392309539) {
                                    if (var4 != 2010817320) {
                                       return;
                                    }

                                    ar.lo(og.gh, client.it + " " + eh.ay + " " + hs.aw(65535, (byte)-51) + var50.an, 1, var46, var43, var17, -1, false, var47, (byte)-30);
                                    break label726;
                                 }
                              }

                              if (client.os) {
                                 if (!fx.du) {
                                    if (var4 != 2010817320) {
                                       return;
                                    }

                                    if (4 == (oq.ow * -1340538261 & 4)) {
                                       if (var4 != 2010817320) {
                                          return;
                                       }

                                       ar.lo(client.oj, client.ou + " " + eh.ay + " " + hs.aw(65535, (byte)-43) + var50.an, 2, var46, var43, var17, -1, false, var47, (byte)22);
                                    }
                                 }
                              } else {
                                 String[] var57 = var50.bv;
                                 if (var57 != null) {
                                    if (var4 != 2010817320) {
                                       throw new IllegalStateException();
                                    }

                                    for(var28 = 4; var28 >= 0; --var28) {
                                       if (!fx.du) {
                                          if (var4 != 2010817320) {
                                             throw new IllegalStateException();
                                          }

                                          if (var52 != null) {
                                             if (var4 != 2010817320) {
                                                throw new IllegalStateException();
                                             }

                                             if (!var52.aw(var28, -2894369)) {
                                                if (var4 != 2010817320) {
                                                   throw new IllegalStateException();
                                                }
                                                continue;
                                             }
                                          }

                                          if (var57[var28] != null) {
                                             short var29 = 0;
                                             if (0 == var28) {
                                                var29 = 3;
                                             }

                                             if (var28 == 1) {
                                                if (var4 != 2010817320) {
                                                   return;
                                                }

                                                var29 = 4;
                                             }

                                             if (var28 == 2) {
                                                if (var4 != 2010817320) {
                                                   return;
                                                }

                                                var29 = 5;
                                             }

                                             if (3 == var28) {
                                                if (var4 != 2010817320) {
                                                   throw new IllegalStateException();
                                                }

                                                var29 = 6;
                                             }

                                             if (4 == var28) {
                                                if (var4 != 2010817320) {
                                                   throw new IllegalStateException();
                                                }

                                                var29 = 1001;
                                             }

                                             ar.lo(var57[var28], hs.aw(65535, (byte)55) + var50.an, var29, var46, var43, var17, -1, false, var47, (byte)-119);
                                          }
                                       }
                                    }
                                 }

                                 ar.lo(og.gx, hs.aw(65535, (byte)-65) + var50.an, 1002, var50.am * 1597792305, var43, var17, -1, false, var47, (byte)7);
                              }
                           }
                        }
                     }

                     int var56;
                     ev var58;
                     int[] var59;
                     dv var63;
                     if (var45 == 1) {
                        ev var51 = var49.ao[var46];
                        if (var51 == null) {
                           if (var4 != 2010817320) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }

                        if (1 == 255989129 * var51.ap.ae) {
                           if (var4 != 2010817320) {
                              return;
                           }

                           if (64 == (-1517174943 * var51.bk & 127)) {
                              if (var4 != 2010817320) {
                                 throw new IllegalStateException();
                              }

                              if (64 == (669935203 * var51.bb & 127)) {
                                 if (var4 != 2010817320) {
                                    return;
                                 }

                                 for(var56 = 0; var56 < var49.af * 2099244795; ++var56) {
                                    if (var4 != 2010817320) {
                                       return;
                                    }

                                    var58 = var49.ao[var49.ar[var56]];
                                    if (var58 != null) {
                                       if (var4 != 2010817320) {
                                          throw new IllegalStateException();
                                       }

                                       if (var58 != var51 && var58.ap.ae * 255989129 == 1) {
                                          if (var4 != 2010817320) {
                                             throw new IllegalStateException();
                                          }

                                          if (var58.bk * -1517174943 == -1517174943 * var51.bk) {
                                             if (var4 != 2010817320) {
                                                throw new IllegalStateException();
                                             }

                                             if (669935203 * var58.bb == 669935203 * var51.bb) {
                                                if (var4 != 2010817320) {
                                                   throw new IllegalStateException();
                                                }

                                                hy.lq(var58, var49.ar[var56], var43, var17, var47, (byte)0);
                                             }
                                          }
                                       }
                                    }
                                 }

                                 var56 = -562349667 * client.jp.ae;
                                 var59 = client.jp.am;

                                 for(var28 = 0; var28 < var56; ++var28) {
                                    var63 = var49.an[var59[var28]];
                                    if (var63 != null) {
                                       if (var4 != 2010817320) {
                                          throw new IllegalStateException();
                                       }

                                       if (var63.bk * -1517174943 == var51.bk * -1517174943) {
                                          if (var4 != 2010817320) {
                                             return;
                                          }

                                          if (669935203 * var63.bb == var51.bb * 669935203) {
                                             if (var4 != 2010817320) {
                                                throw new IllegalStateException();
                                             }

                                             et.ll(var63, var59[var28], var43, var17, var47, -1712625091);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        hy.lq(var51, var46, var43, var17, var47, (byte)0);
                     }

                     if (0 == var45) {
                        if (var4 != 2010817320) {
                           return;
                        }

                        dv var53 = var49.an[var46];
                        if (var53 == null) {
                           if (var4 != 2010817320) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }

                        if (64 == (-1517174943 * var53.bk & 127)) {
                           if (var4 != 2010817320) {
                              throw new IllegalStateException();
                           }

                           if ((var53.bb * 669935203 & 127) == 64) {
                              if (var4 != 2010817320) {
                                 throw new IllegalStateException();
                              }

                              for(var56 = 0; var56 < 2099244795 * var49.af; ++var56) {
                                 if (var4 != 2010817320) {
                                    throw new IllegalStateException();
                                 }

                                 var58 = var49.ao[var49.ar[var56]];
                                 if (null != var58 && 1 == 255989129 * var58.ap.ae) {
                                    if (var4 != 2010817320) {
                                       throw new IllegalStateException();
                                    }

                                    if (var53.bk * -1517174943 == var58.bk * -1517174943) {
                                       if (var4 != 2010817320) {
                                          throw new IllegalStateException();
                                       }

                                       if (669935203 * var58.bb == var53.bb * 669935203) {
                                          hy.lq(var58, var49.ar[var56], var43, var17, var47, (byte)0);
                                       }
                                    }
                                 }
                              }

                              var56 = -562349667 * client.jp.ae;
                              var59 = client.jp.am;

                              for(var28 = 0; var28 < var56; ++var28) {
                                 if (var4 != 2010817320) {
                                    throw new IllegalStateException();
                                 }

                                 var63 = var49.an[var59[var28]];
                                 if (var63 != null) {
                                    if (var4 != 2010817320) {
                                       return;
                                    }

                                    if (var53 != var63) {
                                       if (var4 != 2010817320) {
                                          throw new IllegalStateException();
                                       }

                                       if (var63.bk * -1517174943 == -1517174943 * var53.bk) {
                                          if (var4 != 2010817320) {
                                             throw new IllegalStateException();
                                          }

                                          if (var63.bb * 669935203 == var53.bb * 669935203) {
                                             if (var4 != 2010817320) {
                                                throw new IllegalStateException();
                                             }

                                             et.ll(var63, var59[var28], var43, var17, var47, -2047279665);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        if (1564407135 * client.nk != var46) {
                           if (var4 != 2010817320) {
                              return;
                           }

                           et.ll(var53, var46, var43, var17, var47, -1605575703);
                        } else {
                           var34 = var41;
                           var35 = var47;
                        }
                     }

                     if (var45 == 3) {
                        if (var4 != 2010817320) {
                           return;
                        }

                        pu var54 = var49.ad[var24][var43][var17];
                        if (null != var54) {
                           if (var4 != 2010817320) {
                              throw new IllegalStateException();
                           }

                           for(ec var60 = (ec)var54.ae(); null != var60; var60 = (ec)var54.at()) {
                              if (var4 != 2010817320) {
                                 throw new IllegalStateException();
                              }

                              ip var61 = qg.aw(1119456901 * var60.ap, 649869579);
                              if (!lk.dk) {
                                 if (var4 != 2010817320) {
                                    throw new IllegalStateException();
                                 }

                                 if (1 == client.oq * 392309539) {
                                    if (var4 != 2010817320) {
                                       throw new IllegalStateException();
                                    }

                                    ar.lo(og.gh, client.it + " " + eh.ay + " " + hs.aw(16748608, (byte)25) + var61.az, 16, var60.ap * 1119456901, var43, var17, -1, false, var47, (byte)-75);
                                    continue;
                                 }
                              }

                              if (client.os) {
                                 if (!lk.dk) {
                                    if (var4 != 2010817320) {
                                       throw new IllegalStateException();
                                    }

                                    if ((oq.ow * -1340538261 & 1) == 1) {
                                       if (var4 != 2010817320) {
                                          return;
                                       }

                                       ar.lo(client.oj, client.ou + " " + eh.ay + " " + hs.aw(16748608, (byte)-3) + var61.az, 17, 1119456901 * var60.ap, var43, var17, -1, false, var47, (byte)-117);
                                    }
                                 }
                              } else {
                                 String[] var62 = var61.by;

                                 for(int var64 = 4; var64 >= 0; --var64) {
                                    if (var4 != 2010817320) {
                                       throw new IllegalStateException();
                                    }

                                    if (!lk.dk) {
                                       if (var4 != 2010817320) {
                                          throw new IllegalStateException();
                                       }

                                       if (!var60.aw(var64, -1387747084)) {
                                          if (var4 != 2010817320) {
                                             return;
                                          }
                                       } else {
                                          if (null != var62) {
                                             if (var4 != 2010817320) {
                                                throw new IllegalStateException();
                                             }

                                             if (var62[var64] != null) {
                                                if (var4 != 2010817320) {
                                                   throw new IllegalStateException();
                                                }

                                                byte var30 = 0;
                                                if (0 == var64) {
                                                   if (var4 != 2010817320) {
                                                      return;
                                                   }

                                                   var30 = 18;
                                                }

                                                if (var64 == 1) {
                                                   if (var4 != 2010817320) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var30 = 19;
                                                }

                                                if (2 == var64) {
                                                   var30 = 20;
                                                }

                                                if (3 == var64) {
                                                   var30 = 21;
                                                }

                                                if (4 == var64) {
                                                   if (var4 != 2010817320) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var30 = 22;
                                                }

                                                ar.lo(var62[var64], hs.aw(16748608, (byte)13) + var61.az, var30, 1119456901 * var60.ap, var43, var17, -1, false, var47, (byte)-12);
                                                continue;
                                             }
                                          }

                                          if (2 == var64) {
                                             if (var4 != 2010817320) {
                                                throw new IllegalStateException();
                                             }

                                             ar.lo(og.aj, hs.aw(16748608, (byte)9) + var61.az, 20, 1119456901 * var60.ap, var43, var17, -1, false, var47, (byte)73);
                                          }
                                       }
                                    }
                                 }

                                 ar.lo(og.gx, hs.aw(16748608, (byte)29) + var61.az, 1004, 1119456901 * var60.ap, var43, var17, -1, false, var47, (byte)49);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (-1L != var34) {
            if (var4 != 2010817320) {
               throw new IllegalStateException();
            }

            var38 = fu.aj(var34);
            var40 = (int)(var34 >>> 7 & 127L);
            dv var42 = hx.jf.an[1564407135 * client.nk];
            et.ll(var42, client.nk * 1564407135, var38, var40, var35, -874567063);
         }

      } catch (RuntimeException var33) {
         throw tm.aw(var33, "gf.lc(" + ')');
      }
   }

   void ak(vl var1) {
      this.ap = var1.ce(2028907232) * -2144658699;
   }

   void aj(vl var1) {
      this.ap = var1.ce(1177287315) * -2144658699;
   }

   void ai(gy var1) {
      var1.au(this.ap * 857948509, 16711935);
   }

   void ay(gy var1) {
      var1.au(this.ap * 857948509, 16711935);
   }

   gf(fz var1) {
      try {
         this.this$0 = var1;
         super();
         this.ap = 2144658699;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "gf.<init>(" + ')');
      }
   }

   static void aw(int var0, int var1, int var2) {
      try {
         int[] var3 = new int[4];
         int[] var4 = new int[4];
         var3[0] = var0;
         var4[0] = var1;
         int var5 = 1;

         for(int var6 = 0; var6 < 4; ++var6) {
            if (var0 != ct.am[var6]) {
               if (var2 == -1309378159) {
                  throw new IllegalStateException();
               }

               var3[var5] = ct.am[var6];
               var4[var5] = ct.ae[var6];
               ++var5;
            }
         }

         ct.am = var3;
         ct.ae = var4;
         fa.ak(ct.ai, 0, ct.ai.length - 1, ct.am, ct.ae, 2033471635);
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "gf.aw(" + ')');
      }
   }
}
