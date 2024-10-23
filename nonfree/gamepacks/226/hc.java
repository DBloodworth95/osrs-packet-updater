import java.util.ArrayList;

public class hc extends tp {
   public boolean an;
   static hc[] aw;
   int[] ab;
   public final int ai;
   public int ay;
   int as;
   public String ae;
   public int am;
   public static mi aj = new mi(256);
   public boolean ao;
   public String ar;
   public String[] af;
   static sl vp;
   static pe ap;
   public int at;
   int ag;
   int ad;
   int ac;
   int az;
   public hm ax;
   int[] aq;
   byte[] al;
   public int aa;
   static final int ch = 24;
   public hi av;

   vv bh(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         vv var2 = (vv)aj.ap((long)var1);
         if (var2 != null) {
            return var2;
         } else {
            var2 = tk.aw((pe)ap, (int)var1, 0, (byte)85);
            if (null != var2) {
               aj.ak(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   void ad() {
      if (this.ab != null) {
         for(int var1 = 0; var1 < this.ab.length; var1 += 2) {
            if (this.ab[var1] < this.az * 1618005437) {
               this.az = this.ab[var1] * -915221099;
            } else if (this.ab[var1] > 1050741551 * this.ad) {
               this.ad = this.ab[var1] * -1954145329;
            }

            if (this.ab[1 + var1] < this.ag * -1425936225) {
               this.ag = this.ab[1 + var1] * 2063805279;
            } else if (this.ab[1 + var1] > this.ac * -1769685375) {
               this.ac = this.ab[var1 + 1] * 1855816065;
            }
         }
      }

   }

   void aj(vl var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            if (var3 <= 1096127575) {
               throw new IllegalStateException();
            }

            this.ay = var1.dr(502659) * -479293309;
         } else if (var2 == 2) {
            if (var3 <= 1096127575) {
               return;
            }

            this.as = var1.dr(502659) * -983907227;
         } else if (var2 == 3) {
            if (var3 <= 1096127575) {
               throw new IllegalStateException();
            }

            this.ae = var1.cw(2093755242);
         } else if (var2 == 4) {
            if (var3 <= 1096127575) {
               throw new IllegalStateException();
            }

            this.am = var1.cx((byte)-13) * 1067736661;
         } else if (var2 == 5) {
            if (var3 <= 1096127575) {
               throw new IllegalStateException();
            }

            var1.cx((byte)-77);
         } else if (6 == var2) {
            if (var3 <= 1096127575) {
               throw new IllegalStateException();
            }

            this.at = var1.cy((short)-25985) * 1816198873;
         } else {
            int var4;
            if (7 == var2) {
               if (var3 <= 1096127575) {
                  throw new IllegalStateException();
               }

               var4 = var1.cy((short)-4135);
               if (0 == (var4 & 1)) {
                  this.an = false;
               }

               if (2 == (var4 & 2)) {
                  if (var3 <= 1096127575) {
                     throw new IllegalStateException();
                  }

                  this.ao = true;
               }
            } else if (var2 == 8) {
               if (var3 <= 1096127575) {
                  throw new IllegalStateException();
               }

               var1.cy((short)-3759);
            } else if (var2 >= 10 && var2 <= 14) {
               if (var3 <= 1096127575) {
                  throw new IllegalStateException();
               }

               this.af[var2 - 10] = var1.cw(2098394244);
            } else if (var2 == 15) {
               var4 = var1.cy((short)-15508);
               this.ab = new int[var4 * 2];

               int var5;
               for(var5 = 0; var5 < 2 * var4; ++var5) {
                  if (var3 <= 1096127575) {
                     throw new IllegalStateException();
                  }

                  this.ab[var5] = var1.cg(-1480250286);
               }

               var1.ch(1203709469);
               var5 = var1.cy((short)-16517);
               this.aq = new int[var5];

               int var6;
               for(var6 = 0; var6 < this.aq.length; ++var6) {
                  if (var3 <= 1096127575) {
                     throw new IllegalStateException();
                  }

                  this.aq[var6] = var1.ch(1203709469);
               }

               this.al = new byte[var4];

               for(var6 = 0; var6 < var4; ++var6) {
                  this.al[var6] = var1.cu((byte)13);
               }
            } else if (var2 == 16) {
               if (var3 <= 1096127575) {
                  return;
               }
            } else if (17 == var2) {
               if (var3 <= 1096127575) {
                  throw new IllegalStateException();
               }

               this.ar = var1.cw(1977177272);
            } else if (var2 == 18) {
               if (var3 <= 1096127575) {
                  throw new IllegalStateException();
               }

               var1.dr(502659);
            } else if (19 == var2) {
               this.aa = var1.ce(1124546125) * 1413607497;
            } else if (21 == var2) {
               var1.ch(1203709469);
            } else if (var2 == 22) {
               if (var3 <= 1096127575) {
                  throw new IllegalStateException();
               }

               var1.ch(1203709469);
            } else if (23 == var2) {
               if (var3 <= 1096127575) {
                  throw new IllegalStateException();
               }

               var1.cy((short)-24484);
               var1.cy((short)-14197);
               var1.cy((short)-30228);
            } else if (24 == var2) {
               var1.cg(736155105);
               var1.cg(1886538129);
            } else if (var2 == 25) {
               if (var3 <= 1096127575) {
                  return;
               }

               var1.dr(502659);
            } else if (var2 == 28) {
               if (var3 <= 1096127575) {
                  return;
               }

               var1.cy((short)-66);
            } else if (29 == var2) {
               if (var3 <= 1096127575) {
                  throw new IllegalStateException();
               }

               hi[] var8 = new hi[]{hi.ak, hi.ap, hi.aw};
               this.av = (hi)gu.ap(var8, var1.cy((short)-15601), -1875781163);
            } else if (30 == var2) {
               if (var3 <= 1096127575) {
                  throw new IllegalStateException();
               }

               this.ax = (hm)gu.ap(rh.ap(-1890190480), var1.cy((short)-24146), -1875781163);
            }
         }

      } catch (RuntimeException var7) {
         throw tm.aw(var7, "hc.aj(" + ')');
      }
   }

   void ac() {
      if (this.ab != null) {
         for(int var1 = 0; var1 < this.ab.length; var1 += 2) {
            if (this.ab[var1] < this.az * 1618005437) {
               this.az = this.ab[var1] * -915221099;
            } else if (this.ab[var1] > 1050741551 * this.ad) {
               this.ad = this.ab[var1] * -1954145329;
            }

            if (this.ab[1 + var1] < this.ag * -1425936225) {
               this.ag = this.ab[1 + var1] * 2063805279;
            } else if (this.ab[1 + var1] > this.ac * -1769685375) {
               this.ac = this.ab[var1 + 1] * 1855816065;
            }
         }
      }

   }

   public vv ay(boolean var1, int var2) {
      try {
         int var10000;
         if (var1) {
            if (var2 <= -1589572431) {
               throw new IllegalStateException();
            }

            var10000 = this.as * -1784132243;
         } else {
            var10000 = this.ay * -1921368533;
         }

         int var3 = var10000;
         return this.as(var3, 1841171800);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "hc.ay(" + ')');
      }
   }

   vv as(int var1, int var2) {
      try {
         if (var1 < 0) {
            if (var2 <= -175300883) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            vv var3 = (vv)aj.ap((long)var1);
            if (var3 != null) {
               if (var2 <= -175300883) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            } else {
               var3 = tk.aw((pe)ap, (int)var1, 0, (byte)88);
               if (null != var3) {
                  if (var2 <= -175300883) {
                     throw new IllegalStateException();
                  }

                  aj.ak(var3, (long)var1);
               }

               return var3;
            }
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "hc.as(" + ')');
      }
   }

   static final void mw(ng[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      try {
         for(int var9 = 0; var9 < var0.length; ++var9) {
            if (var8 == 10) {
               throw new IllegalStateException();
            }

            ng var10 = var0[var9];
            if (var10 == null) {
               if (var8 == 10) {
                  throw new IllegalStateException();
               }
            } else if (var1 != var10.bi * 53502319) {
               if (var8 == 10) {
                  return;
               }
            } else {
               if (!var10.ag((byte)-52)) {
                  if (var8 == 10) {
                     return;
                  }

                  if (gr.oa(var10, 447709581) == 0) {
                     if (var8 == 10) {
                        return;
                     }

                     if (client.pv != var10) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }
               }

               if (var10.bh) {
                  if (var8 == 10) {
                     throw new IllegalStateException();
                  }

                  if (dc.od(var10, -1292187209)) {
                     continue;
                  }
               } else if (0 == var10.bk * -1973680119) {
                  if (var8 == 10) {
                     throw new IllegalStateException();
                  }

                  if (var10 != bm.od) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     if (dc.od(var10, -2072579823)) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }
               }

               if (11 == -1973680119 * var10.bk) {
                  if (var8 == 10) {
                     throw new IllegalStateException();
                  }

                  if (var10.bz(qk.ek, kd.ic, -1291697899)) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     if (var10.bh(944618679)) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        ek.mp(var10, 1738508759);
                        ba.mo(var10.gu, var10, true, (byte)74);
                        var10.bp(-486208838).ap(2117249106).aw(3, var10.bp(-1612646171).af(-577772826), (byte)-21);
                     }

                     if (null != var10.gf) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        dt var11 = new dt();
                        var11.ak = var10;
                        var11.ap = var10.gf;
                        client.qb.aw(var11);
                     }
                  }
               } else if (var10.bk * -1973680119 == 12) {
                  if (var8 == 10) {
                     throw new IllegalStateException();
                  }

                  if (var10.bo(qk.ek, 1237307425)) {
                     if (var8 == 10) {
                        return;
                     }

                     ek.mp(var10, 2000875015);
                  }
               }

               int var28 = var10.bs * -1305260519 + var6;
               int var12 = var7 + 2100532037 * var10.bm;
               int var13;
               int var14;
               int var15;
               int var10000;
               int var16;
               int var17;
               int var18;
               int var19;
               if (9 == -1973680119 * var10.bk) {
                  if (var8 == 10) {
                     return;
                  }

                  var17 = var28;
                  var18 = var12;
                  var19 = var10.bo * 2013768333 + var28;
                  int var20 = var12 + var10.bd * -1662542495;
                  if (var19 < var28) {
                     if (var8 == 10) {
                        return;
                     }

                     var17 = var19;
                     var19 = var28;
                  }

                  if (var20 < var12) {
                     if (var8 == 10) {
                        return;
                     }

                     var18 = var20;
                     var20 = var12;
                  }

                  ++var19;
                  ++var20;
                  var13 = var17 > var2 ? var17 : var2;
                  if (var18 > var3) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     var10000 = var18;
                  } else {
                     var10000 = var3;
                  }

                  var14 = var10000;
                  if (var19 < var4) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     var10000 = var19;
                  } else {
                     var10000 = var4;
                  }

                  var15 = var10000;
                  if (var20 < var5) {
                     if (var8 == 10) {
                        return;
                     }

                     var10000 = var20;
                  } else {
                     var10000 = var5;
                  }

                  var16 = var10000;
               } else {
                  var17 = var28 + 2013768333 * var10.bo;
                  var18 = -1662542495 * var10.bd + var12;
                  var13 = var28 > var2 ? var28 : var2;
                  if (var12 > var3) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     var10000 = var12;
                  } else {
                     var10000 = var3;
                  }

                  var14 = var10000;
                  if (var17 < var4) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     var10000 = var17;
                  } else {
                     var10000 = var4;
                  }

                  var15 = var10000;
                  if (var18 < var5) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     var10000 = var18;
                  } else {
                     var10000 = var5;
                  }

                  var16 = var10000;
               }

               if (var10 == client.pr) {
                  if (var8 == 10) {
                     throw new IllegalStateException();
                  }

                  client.pn = true;
                  client.pa = -1151810919 * var28;
                  client.pd = 761749935 * var12;
               }

               boolean var29 = false;
               if (var10.ey) {
                  if (var8 == 10) {
                     return;
                  }

                  switch(client.or * 609619659) {
                  case 0:
                     var29 = true;
                  case 1:
                  default:
                     break;
                  case 2:
                     if (var10.bj * -1736739607 >>> 16 == -1895632781 * client.oz) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        var29 = true;
                     }
                     break;
                  case 3:
                     if (-1895632781 * client.oz == var10.bj * -1736739607) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        var29 = true;
                     }
                  }
               }

               if (!var29) {
                  if (var8 == 10) {
                     throw new IllegalStateException();
                  }

                  if (var10.bh) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     if (var13 >= var15) {
                        continue;
                     }

                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     if (var14 >= var16) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }
               }

               if (var10.bh) {
                  if (var8 == 10) {
                     return;
                  }

                  dt var30;
                  if (var10.ho) {
                     if (56923103 * bc.au >= var13) {
                        if (var8 == 10) {
                           return;
                        }

                        if (bc.an * -1159272925 >= var14) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (bc.au * 56923103 < var15) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              if (-1159272925 * bc.an < var16) {
                                 for(var30 = (dt)client.qb.as(); var30 != null; var30 = (dt)client.qb.am()) {
                                    if (var8 == 10) {
                                       throw new IllegalStateException();
                                    }

                                    if (var30.aw) {
                                       if (var8 == 10) {
                                          throw new IllegalStateException();
                                       }

                                       var30.kf();
                                       var30.ak.gt = false;
                                    }
                                 }

                                 kb.im(383987218);
                                 if (7364829 * dm.pu == 0) {
                                    if (var8 == 10) {
                                       throw new IllegalStateException();
                                    }

                                    client.pr = null;
                                    client.pv = null;
                                 }

                                 if (!client.nr) {
                                    lo.kz(-701793445);
                                 }
                              }
                           }
                        }
                     }
                  } else if (var10.hd) {
                     if (var8 == 10) {
                        return;
                     }

                     if (bc.au * 56923103 >= var13) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        if (-1159272925 * bc.an >= var14) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (bc.au * 56923103 < var15) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              if (bc.an * -1159272925 < var16) {
                                 for(var30 = (dt)client.qb.as(); null != var30; var30 = (dt)client.qb.am()) {
                                    if (var8 == 10) {
                                       throw new IllegalStateException();
                                    }

                                    if (var30.aw) {
                                       if (var8 == 10) {
                                          throw new IllegalStateException();
                                       }

                                       if (var30.ap == var30.ak.fx) {
                                          if (var8 == 10) {
                                             return;
                                          }

                                          var30.kf();
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               var18 = bc.au * 56923103;
               var19 = -1159272925 * bc.an;
               if (bc.ag * -88156479 != 0) {
                  if (var8 == 10) {
                     throw new IllegalStateException();
                  }

                  var18 = -208904825 * bc.ad;
                  var19 = bc.ac * 1503556707;
               }

               boolean var42;
               label1608: {
                  if (var18 >= var13) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     if (var19 >= var14) {
                        if (var8 == 10) {
                           return;
                        }

                        if (var18 < var15) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (var19 < var16) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              var42 = true;
                              break label1608;
                           }
                        }
                     }
                  }

                  var42 = false;
               }

               boolean var31 = var42;
               if (var10.bq * 542190393 == 1337) {
                  if (var8 == 10) {
                     throw new IllegalStateException();
                  }

                  if (!client.dm) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     if (!client.nr) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        if (var31) {
                           gf.lc(var18, var19, var13, var14, 2010817320);
                        }
                     }
                  }
               } else if (1338 == var10.bq * 542190393) {
                  if (var8 == 10) {
                     throw new IllegalStateException();
                  }

                  jd.hj(var10, var28, var12, -945105420);
               } else {
                  if (1400 == 542190393 * var10.bq) {
                     ch.wx.ak(56923103 * bc.au, bc.an * -1159272925, var31, var28, var12, var10.bo * 2013768333, var10.bd * -1662542495, 718368227);
                  }

                  if (!client.nr && var31) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     if (542190393 * var10.bq == 1400) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        ch.wx.ci(var28, var12, 2013768333 * var10.bo, -1662542495 * var10.bd, var18, var19, -482686616);
                     } else {
                        dq.mj(var10, (byte)-34);
                     }
                  }

                  boolean var22;
                  int var24;
                  if (var29) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     for(int var21 = 0; var21 < var10.ec.length; ++var21) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        var22 = false;
                        boolean var23 = false;
                        if (!var22) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (null != var10.ec[var21]) {
                              label1710: {
                                 if (var8 == 10) {
                                    throw new IllegalStateException();
                                 }

                                 var24 = 0;

                                 while(true) {
                                    if (var24 >= var10.ec[var21].length) {
                                       break label1710;
                                    }

                                    if (var8 == 10) {
                                       throw new IllegalStateException();
                                    }

                                    boolean var25 = false;
                                    if (null != var10.ha) {
                                       if (var8 == 10) {
                                          throw new IllegalStateException();
                                       }

                                       var25 = client.se.ag(var10.ec[var21][var24], -1207089100);
                                    }

                                    label1669: {
                                       if (!kv.mz(var10.ec[var21][var24], 1835850188)) {
                                          if (var8 == 10) {
                                             throw new IllegalStateException();
                                          }

                                          if (!var25) {
                                             break label1669;
                                          }

                                          if (var8 == 10) {
                                             throw new IllegalStateException();
                                          }
                                       }

                                       var22 = true;
                                       if (var10.ha != null) {
                                          if (var8 == 10) {
                                             throw new IllegalStateException();
                                          }

                                          if (var10.ha[var21] > -330508271 * client.dt) {
                                             break label1710;
                                          }

                                          if (var8 == 10) {
                                             throw new IllegalStateException();
                                          }
                                       }

                                       byte var26 = var10.ek[var21][var24];
                                       if (var26 == 0) {
                                          break;
                                       }

                                       if (var8 == 10) {
                                          throw new IllegalStateException();
                                       }

                                       if ((var26 & 8) != 0) {
                                          if (var8 == 10) {
                                             throw new IllegalStateException();
                                          }

                                          if (client.se.ag(86, 731993517) || client.se.ag(82, 186880442)) {
                                             break label1669;
                                          }

                                          if (client.se.ag(81, 442035987)) {
                                             if (var8 == 10) {
                                                throw new IllegalStateException();
                                             }
                                             break label1669;
                                          }
                                       }

                                       if (0 != (var26 & 2)) {
                                          if (var8 == 10) {
                                             throw new IllegalStateException();
                                          }

                                          if (!client.se.ag(86, 1011984464)) {
                                             if (var8 == 10) {
                                                return;
                                             }
                                             break label1669;
                                          }
                                       }

                                       if (0 != (var26 & 1)) {
                                          if (var8 == 10) {
                                             return;
                                          }

                                          if (!client.se.ag(82, 391617924)) {
                                             break label1669;
                                          }
                                       }

                                       if (0 == (var26 & 4) || client.se.ag(81, -711354311)) {
                                          break;
                                       }

                                       if (var8 == 10) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    ++var24;
                                 }

                                 var23 = true;
                              }
                           }
                        }

                        if (var23) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (var21 < 10) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              fr.lr(var21 + 1, -1736739607 * var10.bj, var10.bv * 597146807, var10.go * -2104795295, "", (byte)-1);
                           } else if (10 == var21) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              pa.lk(-707051104);
                              db.lg(var10.bj * -1736739607, var10.bv * 597146807, db.aw(gr.oa(var10, 645467118), (byte)2), -2104795295 * var10.go, -710649007);
                              client.oj = ik.oi(var10, -513487987);
                              if (null == client.oj) {
                                 if (var8 == 10) {
                                    throw new IllegalStateException();
                                 }

                                 client.oj = og.au;
                              }

                              client.ou = var10.ex + hs.aw(16777215, (byte)-30);
                           }

                           var24 = var10.er[var21];
                           if (null == var10.ha) {
                              if (var8 == 10) {
                                 return;
                              }

                              var10.ha = new int[var10.ec.length];
                           }

                           if (null == var10.en) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              var10.en = new int[var10.ec.length];
                           }

                           if (0 != var24) {
                              if (var8 == 10) {
                                 return;
                              }

                              if (var10.ha[var21] == 0) {
                                 if (var8 == 10) {
                                    return;
                                 }

                                 var10.ha[var21] = var10.en[var21] + var24 + client.dt * -330508271;
                              } else {
                                 var10.ha[var21] = client.dt * -330508271 + var24;
                              }
                           } else {
                              var10.ha[var21] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var22) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (var10.ha != null) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              var10.ha[var21] = 0;
                           }
                        }
                     }
                  }

                  if (var10.bh) {
                     if (var8 == 10) {
                        return;
                     }

                     label1529: {
                        if (56923103 * bc.au >= var13) {
                           if (var8 == 10) {
                              return;
                           }

                           if (-1159272925 * bc.an >= var14) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              if (bc.au * 56923103 < var15 && bc.an * -1159272925 < var16) {
                                 if (var8 == 10) {
                                    throw new IllegalStateException();
                                 }

                                 var31 = true;
                                 break label1529;
                              }
                           }
                        }

                        var31 = false;
                     }

                     boolean var32;
                     label1520: {
                        var32 = false;
                        if (bc.at * -1161885443 != 1) {
                           if (fq.ez) {
                              break label1520;
                           }

                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (4 != -1161885443 * bc.at) {
                              break label1520;
                           }
                        }

                        if (var31) {
                           if (var8 == 10) {
                              return;
                           }

                           var32 = true;
                        }
                     }

                     label1512: {
                        var22 = false;
                        if (1 != -88156479 * bc.ag) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (fq.ez || -88156479 * bc.ag != 4) {
                              break label1512;
                           }

                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }
                        }

                        if (bc.ad * -208904825 >= var13 && bc.ac * 1503556707 >= var14 && -208904825 * bc.ad < var15) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (bc.ac * 1503556707 < var16) {
                              if (var8 == 10) {
                                 return;
                              }

                              var22 = true;
                           }
                        }
                     }

                     if (var22) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        qk.md(var10, bc.ad * -208904825 - var28, bc.ac * 1503556707 - var12, 2076108392);
                     }

                     if (var10.ad(776888940)) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        if (var22) {
                           client.rk.aw(new ki(0, bc.au * 56923103 - var28, bc.an * -1159272925 - var12, var10));
                        }

                        if (var32) {
                           if (var8 == 10) {
                              return;
                           }

                           client.rk.aw(new ki(1, bc.au * 56923103 - var28, bc.an * -1159272925 - var12, var10));
                        }
                     }

                     if (var10.bq * 542190393 == 1400) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        ch.wx.aj(var18, var19, var31 & var32, var31 & var22, -1971373809);
                     }

                     if (client.pr != null) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        if (var10 != client.pr) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (var31 && hi.aj(gr.oa(var10, 1032484295), (byte)1)) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              client.po = var10;
                           }
                        }
                     }

                     if (client.pv == var10) {
                        client.px = true;
                        client.ph = -1187392975 * var28;
                        client.pi = var12 * 1682901105;
                     }

                     if (var10.ee) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        dt var33;
                        if (var31) {
                           if (var8 == 10) {
                              return;
                           }

                           if (0 != -229300643 * client.qm && null != var10.fx) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              var33 = new dt();
                              var33.aw = true;
                              var33.ak = var10;
                              var33.ai = client.qm * 1660912931;
                              var33.ap = var10.fx;
                              client.qb.aw(var33);
                           }
                        }

                        label1494: {
                           if (client.pr == null) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              if (!client.nr) {
                                 break label1494;
                              }
                           }

                           var22 = false;
                           var32 = false;
                           var31 = false;
                        }

                        if (!var10.gs) {
                           if (var8 == 10) {
                              return;
                           }

                           if (var22) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              var10.gs = true;
                              if (var10.et != null) {
                                 if (var8 == 10) {
                                    throw new IllegalStateException();
                                 }

                                 var33 = new dt();
                                 var33.aw = true;
                                 var33.ak = var10;
                                 var33.aj = -1728964757 * (-208904825 * bc.ad - var28);
                                 var33.ai = -669671041 * (bc.ac * 1503556707 - var12);
                                 var33.ap = var10.et;
                                 client.qb.aw(var33);
                              }
                           }
                        }

                        if (var10.gs && var32) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (var10.fu != null) {
                              var33 = new dt();
                              var33.aw = true;
                              var33.ak = var10;
                              var33.aj = (56923103 * bc.au - var28) * -1728964757;
                              var33.ai = -669671041 * (-1159272925 * bc.an - var12);
                              var33.ap = var10.fu;
                              client.qb.aw(var33);
                           }
                        }

                        if (var10.gs) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (!var32) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              var10.gs = false;
                              if (null != var10.fo) {
                                 if (var8 == 10) {
                                    throw new IllegalStateException();
                                 }

                                 var33 = new dt();
                                 var33.aw = true;
                                 var33.ak = var10;
                                 var33.aj = -1728964757 * (56923103 * bc.au - var28);
                                 var33.ai = (-1159272925 * bc.an - var12) * -669671041;
                                 var33.ap = var10.fo;
                                 client.rj.aw(var33);
                              }
                           }
                        }

                        if (var32 && null != var10.fa) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           var33 = new dt();
                           var33.aw = true;
                           var33.ak = var10;
                           var33.aj = -1728964757 * (bc.au * 56923103 - var28);
                           var33.ai = (bc.an * -1159272925 - var12) * -669671041;
                           var33.ap = var10.fa;
                           client.qb.aw(var33);
                        }

                        if (!var10.gt && var31) {
                           if (var8 == 10) {
                              return;
                           }

                           var10.gt = true;
                           if (null != var10.fj) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              var33 = new dt();
                              var33.aw = true;
                              var33.ak = var10;
                              var33.aj = (56923103 * bc.au - var28) * -1728964757;
                              var33.ai = -669671041 * (-1159272925 * bc.an - var12);
                              var33.ap = var10.fj;
                              client.qb.aw(var33);
                           }
                        }

                        if (var10.gt && var31) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (null != var10.fw) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              var33 = new dt();
                              var33.aw = true;
                              var33.ak = var10;
                              var33.aj = (56923103 * bc.au - var28) * -1728964757;
                              var33.ai = (bc.an * -1159272925 - var12) * -669671041;
                              var33.ap = var10.fw;
                              client.qb.aw(var33);
                           }
                        }

                        if (var10.gt) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (!var31) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              var10.gt = false;
                              if (null != var10.fp) {
                                 if (var8 == 10) {
                                    throw new IllegalStateException();
                                 }

                                 var33 = new dt();
                                 var33.aw = true;
                                 var33.ak = var10;
                                 var33.aj = -1728964757 * (bc.au * 56923103 - var28);
                                 var33.ai = -669671041 * (-1159272925 * bc.an - var12);
                                 var33.ap = var10.fp;
                                 client.rj.aw(var33);
                              }
                           }
                        }

                        if (null != var10.fe) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           var33 = new dt();
                           var33.ak = var10;
                           var33.ap = var10.fe;
                           client.qe.aw(var33);
                        }

                        int var36;
                        dt var38;
                        int var39;
                        if (null != var10.fd) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (client.qn * 764581853 > 1876660907 * var10.gk) {
                              label1474: {
                                 if (var10.fm != null) {
                                    if (var8 == 10) {
                                       return;
                                    }

                                    if (764581853 * client.qn - var10.gk * 1876660907 <= 32) {
                                       var39 = 1876660907 * var10.gk;

                                       while(true) {
                                          if (var39 >= client.qn * 764581853) {
                                             break label1474;
                                          }

                                          var24 = client.qf[var39 & 31];

                                          for(var36 = 0; var36 < var10.fm.length; ++var36) {
                                             if (var8 == 10) {
                                                throw new IllegalStateException();
                                             }

                                             if (var24 == var10.fm[var36]) {
                                                if (var8 == 10) {
                                                   return;
                                                }

                                                var38 = new dt();
                                                var38.ak = var10;
                                                var38.ap = var10.fd;
                                                client.qb.aw(var38);
                                                break label1474;
                                             }
                                          }

                                          ++var39;
                                       }
                                    }

                                    if (var8 == 10) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 var33 = new dt();
                                 var33.ak = var10;
                                 var33.ap = var10.fd;
                                 client.qb.aw(var33);
                              }

                              var10.gk = client.qn * -437960809;
                           }
                        }

                        if (var10.fg != null) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (client.qq * 1064390375 > 1074874915 * var10.hr) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              label1446: {
                                 if (var10.fc != null) {
                                    if (var8 == 10) {
                                       throw new IllegalStateException();
                                    }

                                    if (client.qq * 1064390375 - var10.hr * 1074874915 <= 32) {
                                       var39 = var10.hr * 1074874915;

                                       while(true) {
                                          if (var39 >= 1064390375 * client.qq) {
                                             break label1446;
                                          }

                                          if (var8 == 10) {
                                             throw new IllegalStateException();
                                          }

                                          var24 = client.qu[var39 & 31];

                                          for(var36 = 0; var36 < var10.fc.length; ++var36) {
                                             if (var10.fc[var36] == var24) {
                                                if (var8 == 10) {
                                                   throw new IllegalStateException();
                                                }

                                                var38 = new dt();
                                                var38.ak = var10;
                                                var38.ap = var10.fg;
                                                client.qb.aw(var38);
                                                break label1446;
                                             }
                                          }

                                          ++var39;
                                       }
                                    }

                                    if (var8 == 10) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 var33 = new dt();
                                 var33.ak = var10;
                                 var33.ap = var10.fg;
                                 client.qb.aw(var33);
                              }

                              var10.hr = client.qq * -1852233107;
                           }
                        }

                        if (var10.fb != null) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (2101296443 * client.qj > var10.hc * -1567498573) {
                              if (var8 == 10) {
                                 return;
                              }

                              label1418: {
                                 if (null != var10.fr) {
                                    if (var8 == 10) {
                                       return;
                                    }

                                    if (2101296443 * client.qj - var10.hc * -1567498573 <= 32) {
                                       var39 = -1567498573 * var10.hc;

                                       while(true) {
                                          if (var39 >= client.qj * 2101296443) {
                                             break label1418;
                                          }

                                          var24 = client.qo[var39 & 31];

                                          for(var36 = 0; var36 < var10.fr.length; ++var36) {
                                             if (var8 == 10) {
                                                throw new IllegalStateException();
                                             }

                                             if (var10.fr[var36] == var24) {
                                                if (var8 == 10) {
                                                   throw new IllegalStateException();
                                                }

                                                var38 = new dt();
                                                var38.ak = var10;
                                                var38.ap = var10.fb;
                                                client.qb.aw(var38);
                                                break label1418;
                                             }
                                          }

                                          ++var39;
                                       }
                                    }

                                    if (var8 == 10) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 var33 = new dt();
                                 var33.ak = var10;
                                 var33.ap = var10.fb;
                                 client.qb.aw(var33);
                              }

                              var10.hc = client.qj * 935095129;
                           }
                        }

                        if (client.qw * 1546574133 > var10.ge * -1911102447 && var10.fq != null) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           var33 = new dt();
                           var33.ak = var10;
                           var33.ap = var10.fq;
                           client.qb.aw(var33);
                        }

                        if (client.qt * 1325591999 > -1911102447 * var10.ge && var10.fy != null) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           var33 = new dt();
                           var33.ak = var10;
                           var33.ap = var10.fy;
                           client.qb.aw(var33);
                        }

                        if (client.qp * 850901015 > -1911102447 * var10.ge) {
                           if (var8 == 10) {
                              return;
                           }

                           if (var10.fi != null) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              var33 = new dt();
                              var33.ak = var10;
                              var33.ap = var10.fi;
                              client.qb.aw(var33);
                           }
                        }

                        if (client.qs * 1300266067 > var10.ge * -1911102447 && var10.gp != null) {
                           var33 = new dt();
                           var33.ak = var10;
                           var33.ap = var10.gp;
                           client.qb.aw(var33);
                        }

                        if (client.qh * 1587171207 > -1911102447 * var10.ge && var10.gl != null) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           var33 = new dt();
                           var33.ak = var10;
                           var33.ap = var10.gl;
                           client.qb.aw(var33);
                        }

                        if (-2134887235 * client.qc > -1911102447 * var10.ge && var10.gc != null) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           var33 = new dt();
                           var33.ak = var10;
                           var33.ap = var10.gc;
                           client.qb.aw(var33);
                        }

                        if (-1775964815 * client.qy > var10.ge * -1911102447) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (var10.ga != null) {
                              if (var8 == 10) {
                                 return;
                              }

                              var33 = new dt();
                              var33.ak = var10;
                              var33.ap = var10.ga;
                              client.qb.aw(var33);
                           }
                        }

                        if (1060427977 * client.qx > -1911102447 * var10.ge && var10.gb != null) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           var33 = new dt();
                           var33.ak = var10;
                           var33.ap = var10.gb;
                           client.qb.aw(var33);
                        }

                        var10.ge = client.pb * 158282373;
                        if (var10.fk != null) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           for(var39 = 0; var39 < client.sr * -1805330559; ++var39) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              dt var37 = new dt();
                              var37.ak = var10;
                              var37.am = 1939014191 * client.sg[var39];
                              var37.at = -1610657169 * client.sv[var39];
                              var37.ap = var10.fk;
                              client.qb.aw(var37);
                           }
                        }

                        dt var40;
                        int[] var41;
                        if (null != var10.fs) {
                           var41 = client.se.ac((byte)9);

                           for(var24 = 0; var24 < var41.length; ++var24) {
                              if (var8 == 10) {
                                 return;
                              }

                              var40 = new dt();
                              var40.ak = var10;
                              var40.am = 1939014191 * var41[var24];
                              var40.ap = var10.fs;
                              client.qb.aw(var40);
                           }
                        }

                        if (var10.fz != null) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           var41 = client.se.av(-1639434192);

                           for(var24 = 0; var24 < var41.length; ++var24) {
                              var40 = new dt();
                              var40.ak = var10;
                              var40.am = 1939014191 * var41[var24];
                              var40.ap = var10.fz;
                              client.qb.aw(var40);
                           }
                        }
                     }
                  }

                  if (!var10.bh) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     if (client.pr != null) {
                        continue;
                     }

                     if (var8 == 10) {
                        return;
                     }

                     if (client.nr) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }

                     label1354: {
                        if (var10.gh * 1756145679 < 0) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (0 == 2017721573 * var10.ci) {
                              break label1354;
                           }

                           if (var8 == 10) {
                              return;
                           }
                        }

                        if (56923103 * bc.au >= var13) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (-1159272925 * bc.an >= var14) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              if (bc.au * 56923103 < var15) {
                                 if (var8 == 10) {
                                    throw new IllegalStateException();
                                 }

                                 if (bc.an * -1159272925 < var16) {
                                    if (var8 == 10) {
                                       throw new IllegalStateException();
                                    }

                                    if (var10.gh * 1756145679 >= 0) {
                                       if (var8 == 10) {
                                          throw new IllegalStateException();
                                       }

                                       bm.od = var0[var10.gh * 1756145679];
                                    } else {
                                       bm.od = var10;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if (8 == -1973680119 * var10.bk) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        if (56923103 * bc.au >= var13) {
                           if (var8 == 10) {
                              throw new IllegalStateException();
                           }

                           if (bc.an * -1159272925 >= var14) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              if (bc.au * 56923103 < var15) {
                                 if (var8 == 10) {
                                    throw new IllegalStateException();
                                 }

                                 if (-1159272925 * bc.an < var16) {
                                    if (var8 == 10) {
                                       return;
                                    }

                                    ub.of = var10;
                                 }
                              }
                           }
                        }
                     }

                     if (var10.cq * 1283703355 > -1662542495 * var10.bd) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        lk.mb(var10, var28 + 2013768333 * var10.bo, var12, -1662542495 * var10.bd, 1283703355 * var10.cq, bc.au * 56923103, bc.an * -1159272925, 825121780);
                     }
                  }

                  if (var10.bk * -1973680119 == 0) {
                     if (var8 == 10) {
                        throw new IllegalStateException();
                     }

                     mw(var0, var10.bj * -1736739607, var13, var14, var15, var16, var28 - var10.bg * 336181451, var12 - -291221237 * var10.bl, (byte)53);
                     if (null != var10.gu) {
                        if (var8 == 10) {
                           return;
                        }

                        mw(var10.gu, -1736739607 * var10.bj, var13, var14, var15, var16, var28 - 336181451 * var10.bg, var12 - var10.bl * -291221237, (byte)111);
                     }

                     dm var34 = (dm)client.om.ap((long)(var10.bj * -1736739607));
                     if (var34 != null) {
                        if (var8 == 10) {
                           throw new IllegalStateException();
                        }

                        if (var34.aw * 364421423 == 0 && bc.au * 56923103 >= var13) {
                           if (var8 == 10) {
                              return;
                           }

                           if (bc.an * -1159272925 >= var14) {
                              if (var8 == 10) {
                                 throw new IllegalStateException();
                              }

                              if (bc.au * 56923103 < var15 && bc.an * -1159272925 < var16) {
                                 if (var8 == 10) {
                                    throw new IllegalStateException();
                                 }

                                 if (!client.nr) {
                                    if (var8 == 10) {
                                       return;
                                    }

                                    for(dt var35 = (dt)client.qb.as(); null != var35; var35 = (dt)client.qb.am()) {
                                       if (var8 == 10) {
                                          throw new IllegalStateException();
                                       }

                                       if (var35.aw) {
                                          var35.kf();
                                          var35.ak.gt = false;
                                       }
                                    }

                                    if (dm.pu * 7364829 == 0) {
                                       if (var8 == 10) {
                                          throw new IllegalStateException();
                                       }

                                       client.pr = null;
                                       client.pv = null;
                                    }

                                    if (!client.nr) {
                                       if (var8 == 10) {
                                          throw new IllegalStateException();
                                       }

                                       lo.kz(-1400673401);
                                    }
                                 }
                              }
                           }
                        }

                        gg.mv(var34.ap * -1759747861, var13, var14, var15, var16, var28, var12, (short)8172);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var27) {
         throw tm.aw(var27, "hc.mw(" + ')');
      }
   }

   public static boolean am(pe var0, pe var1) {
      ap = var1;
      if (!var0.bi((byte)95)) {
         return false;
      } else {
         ni.ak = var0.cq(35, 392156694) * -686038829;
         aw = new hc[-1191741605 * ni.ak];

         for(int var2 = 0; var2 < -1191741605 * ni.ak; ++var2) {
            byte[] var3 = var0.bm(35, var2, 1398067408);
            aw[var2] = new hc(var2);
            if (null != var3) {
               aw[var2].ak(new vl(var3), 908264945);
               aw[var2].ai(-1676769191);
            }
         }

         return true;
      }
   }

   public static boolean at(pe var0, pe var1) {
      ap = var1;
      if (!var0.bi((byte)80)) {
         return false;
      } else {
         ni.ak = var0.cq(-1256995769, 1788596145) * 418853362;
         aw = new hc[912680106 * ni.ak];

         for(int var2 = 0; var2 < -644566179 * ni.ak; ++var2) {
            byte[] var3 = var0.bm(1199281889, var2, 733626541);
            aw[var2] = new hc(var2);
            if (null != var3) {
               aw[var2].ak(new vl(var3), 1333402219);
               aw[var2].ai(-764452504);
            }
         }

         return true;
      }
   }

   public static boolean au(pe var0, pe var1) {
      ap = var1;
      if (!var0.bi((byte)61)) {
         return false;
      } else {
         ni.ak = var0.cq(35, 2087117150) * -686038829;
         aw = new hc[-1191741605 * ni.ak];

         for(int var2 = 0; var2 < -1191741605 * ni.ak; ++var2) {
            byte[] var3 = var0.bm(35, var2, 1243975777);
            aw[var2] = new hc(var2);
            if (null != var3) {
               aw[var2].ak(new vl(var3), -964212076);
               aw[var2].ai(-1618318662);
            }
         }

         return true;
      }
   }

   public static boolean an(pe var0, pe var1) {
      ap = var1;
      if (!var0.bi((byte)69)) {
         return false;
      } else {
         ni.ak = var0.cq(35, 1604912944) * 1574288986;
         aw = new hc[-1267038740 * ni.ak];

         for(int var2 = 0; var2 < 638223811 * ni.ak; ++var2) {
            byte[] var3 = var0.bm(-1216108533, var2, 1607154388);
            aw[var2] = new hc(var2);
            if (null != var3) {
               aw[var2].ak(new vl(var3), 1951106698);
               aw[var2].ai(-48801079);
            }
         }

         return true;
      }
   }

   public static hc ao(int var0) {
      return var0 >= 0 && var0 < aw.length && null != aw[var0] ? aw[var0] : new hc(var0);
   }

   public static hc af(int var0) {
      return var0 >= 0 && var0 < aw.length && null != aw[var0] ? aw[var0] : new hc(var0);
   }

   void ab(vl var1, int var2) {
      if (var2 == 1) {
         this.ay = var1.dr(502659) * -479293309;
      } else if (var2 == 2) {
         this.as = var1.dr(502659) * -983907227;
      } else if (var2 == 3) {
         this.ae = var1.cw(1924506352);
      } else if (var2 == 4) {
         this.am = var1.cx((byte)-124) * 1067736661;
      } else if (var2 == 5) {
         var1.cx((byte)-33);
      } else if (6 == var2) {
         this.at = var1.cy((short)-3066) * 1816198873;
      } else {
         int var3;
         if (7 == var2) {
            var3 = var1.cy((short)-6743);
            if (0 == (var3 & 1)) {
               this.an = false;
            }

            if (2 == (var3 & 2)) {
               this.ao = true;
            }
         } else if (var2 == 8) {
            var1.cy((short)-20918);
         } else if (var2 >= 10 && var2 <= 14) {
            this.af[var2 - 10] = var1.cw(2090225996);
         } else if (var2 == 15) {
            var3 = var1.cy((short)-21593);
            this.ab = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < 2 * var3; ++var4) {
               this.ab[var4] = var1.cg(451562393);
            }

            var1.ch(1203709469);
            var4 = var1.cy((short)-10963);
            this.aq = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.aq.length; ++var5) {
               this.aq[var5] = var1.ch(1203709469);
            }

            this.al = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.al[var5] = var1.cu((byte)13);
            }
         } else if (var2 != 16) {
            if (17 == var2) {
               this.ar = var1.cw(2034451948);
            } else if (var2 == 18) {
               var1.dr(502659);
            } else if (19 == var2) {
               this.aa = var1.ce(876682008) * 1413607497;
            } else if (21 == var2) {
               var1.ch(1203709469);
            } else if (var2 == 22) {
               var1.ch(1203709469);
            } else if (23 == var2) {
               var1.cy((short)-2021);
               var1.cy((short)-18350);
               var1.cy((short)-8295);
            } else if (24 == var2) {
               var1.cg(-1683015749);
               var1.cg(-1986786610);
            } else if (var2 == 25) {
               var1.dr(502659);
            } else if (var2 == 28) {
               var1.cy((short)-19066);
            } else if (29 == var2) {
               hi[] var6 = new hi[]{hi.ak, hi.ap, hi.aw};
               this.av = (hi)gu.ap(var6, var1.cy((short)-17900), -1875781163);
            } else if (30 == var2) {
               this.ax = (hm)gu.ap(rh.ap(-2047028269), var1.cy((short)-13182), -1875781163);
            }
         }
      }

   }

   public int ae(byte var1) {
      try {
         return -1268897243 * this.ai;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "hc.ae(" + ')');
      }
   }

   void ai(int var1) {
      try {
         if (this.ab != null) {
            for(int var2 = 0; var2 < this.ab.length; var2 += 2) {
               if (var1 == -1869319151) {
                  throw new IllegalStateException();
               }

               if (this.ab[var2] < this.az * 1618005437) {
                  this.az = this.ab[var2] * -915221099;
               } else if (this.ab[var2] > 1050741551 * this.ad) {
                  if (var1 == -1869319151) {
                     throw new IllegalStateException();
                  }

                  this.ad = this.ab[var2] * -1954145329;
               }

               if (this.ab[1 + var2] < this.ag * -1425936225) {
                  if (var1 == -1869319151) {
                     throw new IllegalStateException();
                  }

                  this.ag = this.ab[1 + var2] * 2063805279;
               } else if (this.ab[1 + var2] > this.ac * -1769685375) {
                  this.ac = this.ab[var2 + 1] * 1855816065;
               }
            }
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "hc.ai(" + ')');
      }
   }

   void ag(vl var1, int var2) {
      if (var2 == 1) {
         this.ay = var1.dr(502659) * -479293309;
      } else if (var2 == 2) {
         this.as = var1.dr(502659) * -983907227;
      } else if (var2 == 3) {
         this.ae = var1.cw(2129128669);
      } else if (var2 == 4) {
         this.am = var1.cx((byte)-106) * 1067736661;
      } else if (var2 == 5) {
         var1.cx((byte)-33);
      } else if (6 == var2) {
         this.at = var1.cy((short)-4400) * 1816198873;
      } else {
         int var3;
         if (7 == var2) {
            var3 = var1.cy((short)-27759);
            if (0 == (var3 & 1)) {
               this.an = false;
            }

            if (2 == (var3 & 2)) {
               this.ao = true;
            }
         } else if (var2 == 8) {
            var1.cy((short)-19454);
         } else if (var2 >= 10 && var2 <= 14) {
            this.af[var2 - 10] = var1.cw(2118427785);
         } else if (var2 == 15) {
            var3 = var1.cy((short)-182);
            this.ab = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < 2 * var3; ++var4) {
               this.ab[var4] = var1.cg(808761698);
            }

            var1.ch(1203709469);
            var4 = var1.cy((short)-10382);
            this.aq = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.aq.length; ++var5) {
               this.aq[var5] = var1.ch(1203709469);
            }

            this.al = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.al[var5] = var1.cu((byte)13);
            }
         } else if (var2 != 16) {
            if (17 == var2) {
               this.ar = var1.cw(2103237693);
            } else if (var2 == 18) {
               var1.dr(502659);
            } else if (19 == var2) {
               this.aa = var1.ce(351563977) * 1413607497;
            } else if (21 == var2) {
               var1.ch(1203709469);
            } else if (var2 == 22) {
               var1.ch(1203709469);
            } else if (23 == var2) {
               var1.cy((short)-31166);
               var1.cy((short)-17254);
               var1.cy((short)-28479);
            } else if (24 == var2) {
               var1.cg(1151843113);
               var1.cg(-163991991);
            } else if (var2 == 25) {
               var1.dr(502659);
            } else if (var2 == 28) {
               var1.cy((short)-17102);
            } else if (29 == var2) {
               hi[] var6 = new hi[]{hi.ak, hi.ap, hi.aw};
               this.av = (hi)gu.ap(var6, var1.cy((short)-2175), -1875781163);
            } else if (30 == var2) {
               this.ax = (hm)gu.ap(rh.ap(-1665552602), var1.cy((short)-14837), -1875781163);
            }
         }
      }

   }

   void ak(vl var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cy((short)-30534);
            if (0 == var3) {
               if (var2 == 1671766692) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.aj(var1, var3, 1549450730);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "hc.ak(" + ')');
      }
   }

   void az(vl var1, int var2) {
      if (var2 == 1) {
         this.ay = var1.dr(502659) * -479293309;
      } else if (var2 == 2) {
         this.as = var1.dr(502659) * -983907227;
      } else if (var2 == 3) {
         this.ae = var1.cw(1965399024);
      } else if (var2 == 4) {
         this.am = var1.cx((byte)-104) * 1067736661;
      } else if (var2 == 5) {
         var1.cx((byte)-90);
      } else if (6 == var2) {
         this.at = var1.cy((short)-25961) * 1816198873;
      } else {
         int var3;
         if (7 == var2) {
            var3 = var1.cy((short)-21441);
            if (0 == (var3 & 1)) {
               this.an = false;
            }

            if (2 == (var3 & 2)) {
               this.ao = true;
            }
         } else if (var2 == 8) {
            var1.cy((short)-6419);
         } else if (var2 >= 10 && var2 <= 14) {
            this.af[var2 - 10] = var1.cw(2128267248);
         } else if (var2 == 15) {
            var3 = var1.cy((short)-25398);
            this.ab = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < 2 * var3; ++var4) {
               this.ab[var4] = var1.cg(-260404254);
            }

            var1.ch(1203709469);
            var4 = var1.cy((short)-3166);
            this.aq = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.aq.length; ++var5) {
               this.aq[var5] = var1.ch(1203709469);
            }

            this.al = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.al[var5] = var1.cu((byte)13);
            }
         } else if (var2 != 16) {
            if (17 == var2) {
               this.ar = var1.cw(1965848890);
            } else if (var2 == 18) {
               var1.dr(502659);
            } else if (19 == var2) {
               this.aa = var1.ce(961151591) * 1413607497;
            } else if (21 == var2) {
               var1.ch(1203709469);
            } else if (var2 == 22) {
               var1.ch(1203709469);
            } else if (23 == var2) {
               var1.cy((short)-9628);
               var1.cy((short)-6897);
               var1.cy((short)-30479);
            } else if (24 == var2) {
               var1.cg(962713526);
               var1.cg(-448798202);
            } else if (var2 == 25) {
               var1.dr(502659);
            } else if (var2 == 28) {
               var1.cy((short)-15166);
            } else if (29 == var2) {
               hi[] var6 = new hi[]{hi.ak, hi.ap, hi.aw};
               this.av = (hi)gu.ap(var6, var1.cy((short)-32212), -1875781163);
            } else if (30 == var2) {
               this.ax = (hm)gu.ap(rh.ap(-1969571238), var1.cy((short)-24933), -1875781163);
            }
         }
      }

   }

   void av() {
      if (this.ab != null) {
         for(int var1 = 0; var1 < this.ab.length; var1 += 2) {
            if (this.ab[var1] < this.az * 1618005437) {
               this.az = this.ab[var1] * -915221099;
            } else if (this.ab[var1] > 1050741551 * this.ad) {
               this.ad = this.ab[var1] * -1954145329;
            }

            if (this.ab[1 + var1] < this.ag * -1425936225) {
               this.ag = this.ab[1 + var1] * 2063805279;
            } else if (this.ab[1 + var1] > this.ac * -1769685375) {
               this.ac = this.ab[var1 + 1] * 1855816065;
            }
         }
      }

   }

   void ar(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-13745);
         if (0 == var2) {
            return;
         }

         this.aj(var1, var2, 1698356922);
      }
   }

   public vv aq(boolean var1) {
      int var2 = var1 ? this.as * -1784132243 : this.ay * 922051392;
      return this.as(var2, 1751318135);
   }

   vv al(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         vv var2 = (vv)aj.ap((long)var1);
         if (var2 != null) {
            return var2;
         } else {
            var2 = tk.aw((pe)ap, (int)var1, 0, (byte)126);
            if (null != var2) {
               aj.ak(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   vv aa(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         vv var2 = (vv)aj.ap((long)var1);
         if (var2 != null) {
            return var2;
         } else {
            var2 = tk.aw((pe)ap, (int)var1, 0, (byte)85);
            if (null != var2) {
               aj.ak(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   vv ah(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         vv var2 = (vv)aj.ap((long)var1);
         if (var2 != null) {
            return var2;
         } else {
            var2 = tk.aw((pe)ap, (int)var1, 0, (byte)115);
            if (null != var2) {
               aj.ak(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   hc(int var1) {
      try {
         super();
         this.ay = 479293309;
         this.as = 983907227;
         this.at = 0;
         this.an = true;
         this.ao = false;
         this.af = new String[5];
         this.az = -1232262549;
         this.ag = 83678369;
         this.ad = Integer.MIN_VALUE;
         this.ac = Integer.MIN_VALUE;
         this.av = hi.aw;
         this.ax = hm.aw;
         this.aa = -1413607497;
         this.ai = 1343742381 * var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "hc.<init>(" + ')');
      }
   }

   public int bj() {
      return -1268897243 * this.ai;
   }

   public int bv() {
      return 673774119 * this.ai;
   }

   public static void ap(int var0) {
      try {
         hs.ap.aj();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "hc.ap(" + ')');
      }
   }

   public vv ax(boolean var1) {
      int var2 = var1 ? this.as * -1784132243 : this.ay * -1921368533;
      return this.as(var2, 1002461611);
   }

   static void ak(pe var0, pe var1, tt var2, boolean var3, int var4, int var5) {
      try {
         if (dq.aw) {
            if (var4 == 4) {
               as.aa(4, (byte)1);
            }

         } else {
            if (var4 == 0) {
               mm.ab(var3, -394209214);
            } else {
               as.aa(var4, (byte)1);
            }

            vz.ec();
            byte[] var6 = var0.cv("title.jpg", "", 1197864797);
            we.am = sp.ap(var6, (byte)86);
            ui.at = we.am.ap();
            ei.ay(var1, client.cb * 1202199295, (byte)-32);
            ij.ai = ey.ai(var1, "titlebox", "", -1770095722);
            bd.ay = ey.ai(var1, "titlebutton", "", -1770095722);
            ki.as = ey.ai(var1, "titlebutton_large", "", -1770095722);
            dq.ae = ey.ai(var1, "play_now_text", "", -1770095722);
            ey.ai(var1, "titlebutton_wide42,1", "", -1770095722);
            dq.aj = ol.aj(var1, "runes", "", -927101622);
            vn.an = ol.aj(var1, "title_mute", "", 520052128);
            bp.ao = ey.ai(var1, "options_radio_buttons,0", "", -1770095722);
            ck.af = ey.ai(var1, "options_radio_buttons,4", "", -1770095722);
            sz.ar = ey.ai(var1, "options_radio_buttons,2", "", -1770095722);
            we.ab = ey.ai(var1, "options_radio_buttons,6", "", -1770095722);
            fw.cj = 946637161 * bp.ao.ak;
            ks.cm = bp.ao.aj * 1457503259;
            rf.az = new dz(dq.aj, var2.az);
            if (var3) {
               if (var5 <= -1670312247) {
                  throw new IllegalStateException();
               }

               dq.co = "";
               dq.cf = "";
               dq.cv = new String[8];
               dq.cp = 0;
            }

            mp.cs = 0;
            nu.cr = "";
            dq.ck = true;
            dq.dr = false;
            if (!io.vx.am(929909239)) {
               if (var5 <= -1670312247) {
                  throw new IllegalStateException();
               }

               ArrayList var7 = new ArrayList();
               var7.add(new no(bc.fa, "scape main", "", 255, false));
               hh.aw(var7, 0, 0, 0, 100, false, 1738605128);
            } else {
               gg.aj(0, 0, 1872686555);
            }

            hr.ae(675329936);
            pk var9 = oc.vv;
            var9.aw(false, 191262911);
            dq.aw = true;
            dq.ak = (1816225167 * ac.ax - 765) / 2 * -1320578673;
            dq.ax = dq.ak * 2135985343 + -1172025942;
            aq.aq = 1061149649 * dq.ax + 616970932;
            we.am.au(dq.ak * -2069137, 0);
            ui.at.au(dq.ak * -2069137 + 382, 0);
            sg.au.ak(dq.ak * -2069137 + 382 - sg.au.ak / 2, 18);
         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "hc.ak(" + ')');
      }
   }
}
