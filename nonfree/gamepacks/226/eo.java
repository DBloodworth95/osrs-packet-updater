public class eo extends si {
   static int gf;
   public static final int ae = 0;
   final boolean ap;
   public static final int ai = 1401;
   public static final String jh = "persists, please contact Jagex Support.";

   public int am(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)0);
   }

   int ap(sv var1, sv var2, byte var3) {
      try {
         if (1511931945 * var1.ai == 769068277 * client.cq && 769068277 * client.cq == var2.ai * 1511931945) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               int var10000;
               if (this.ap) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var10000 = var1.aa(1174306348).aj(var2.aa(1043511854), 310328696);
               } else {
                  var10000 = var2.aa(963777590).aj(var1.aa(1558582381), 639529222);
               }

               return var10000;
            }
         } else {
            return this.an(var1, var2, 1255277363);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "eo.ap(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((sv)var1, (sv)var2, (byte)0);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "eo.compare(" + ')');
      }
   }

   static final void jy(mj var0, int var1) {
      try {
         vm var2 = client.in.ay;
         int var5;
         int var7;
         int var9;
         int var10000;
         int var21;
         int var22;
         int var23;
         int var25;
         if (var0 == mj.aw) {
            if (var1 == -1765624481) {
               throw new IllegalStateException();
            } else {
               var21 = var2.ew(1697900975);
               var22 = var2.ev(-1073284666);
               var5 = var2.cy((short)-1098);
               var23 = -1361011875 * is.jz + (var5 >> 4 & 7);
               var7 = 576765921 * fw.js + (var5 & 7);
               var25 = var2.ch(1203709469);
               if (var23 >= 0) {
                  if (var1 == -1765624481) {
                     throw new IllegalStateException();
                  }

                  if (var7 >= 0) {
                     if (var1 == -1765624481) {
                        return;
                     }

                     if (var23 < nq.jn.ai * 1587254913) {
                        if (var1 == -1765624481) {
                           throw new IllegalStateException();
                        }

                        if (var7 < -1000264093 * nq.jn.ay) {
                           if (var1 == -1765624481) {
                              throw new IllegalStateException();
                           }

                           if (-1 == client.je * -1246805187) {
                              if (var1 == -1765624481) {
                                 throw new IllegalStateException();
                              }

                              var10000 = 86027145 * nq.jn.aj;
                           } else {
                              var10000 = client.je * -1246805187;
                           }

                           var9 = var10000;
                           ds.je(var9, var23, var7, var22, var21, var25, 1601399073);
                        }
                     }
                  }
               }

            }
         } else {
            int var10;
            int var11;
            if (var0 == mj.au) {
               if (var1 == -1765624481) {
                  throw new IllegalStateException();
               } else {
                  var21 = var2.eg(437755571);
                  var22 = var2.dj((byte)-88);
                  var5 = var2.cy((short)-5553) & 31;
                  var23 = var2.dp((short)-28145);
                  var7 = var2.cy((short)-16598);
                  var25 = var2.dp((short)-31490);
                  var9 = (var25 >> 4 & 7) + is.jz * -1361011875;
                  var10 = (var25 & 7) + 576765921 * fw.js;
                  if (var9 >= 0 && var10 >= 0 && var9 < nq.jn.ai * 1587254913) {
                     if (var1 == -1765624481) {
                        throw new IllegalStateException();
                     }

                     if (var10 < -1000264093 * nq.jn.ay) {
                        if (var1 == -1765624481) {
                           return;
                        }

                        var11 = var5 + 1;
                        if (nw.mc.dz[0] >= var9 - var11) {
                           if (var1 == -1765624481) {
                              throw new IllegalStateException();
                           }

                           if (nw.mc.dz[0] <= var9 + var11) {
                              if (var1 == -1765624481) {
                                 throw new IllegalStateException();
                              }

                              if (nw.mc.di[0] >= var10 - var11 && nw.mc.di[0] <= var11 + var10) {
                                 if (var1 == -1765624481) {
                                    throw new IllegalStateException();
                                 }

                                 if (io.vx.ax(321977799) != 0 && var22 > 0) {
                                    if (var1 == -1765624481) {
                                       throw new IllegalStateException();
                                    }

                                    if (client.ty * -230015913 < 50) {
                                       if (var1 == -1765624481) {
                                          throw new IllegalStateException();
                                       }

                                       client.tm[client.ty * -230015913] = var21;
                                       client.tb[-230015913 * client.ty] = null;
                                       client.tc[client.ty * -230015913] = var5 + (var9 << 16) + (var10 << 8);
                                       client.tn[client.ty * -230015913] = var22;
                                       client.tp[-230015913 * client.ty] = var7;
                                       client.td[client.ty * -230015913] = var23;
                                       client.ty += 1355312999;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

               }
            } else if (mj.am == var0) {
               if (var1 == -1765624481) {
                  throw new IllegalStateException();
               } else {
                  var21 = var2.dy((byte)-117);
                  var22 = (var21 >> 4 & 7) + is.jz * -1361011875;
                  var5 = (var21 & 7) + fw.js * 576765921;
                  var23 = var2.ev(-1679344918);
                  var7 = var2.ej((short)204);
                  var25 = 86027145 * nq.jn.aj;
                  if (0 <= var22) {
                     if (var1 == -1765624481) {
                        throw new IllegalStateException();
                     }

                     if (var22 < 104) {
                        if (var1 == -1765624481) {
                           throw new IllegalStateException();
                        }

                        if (0 <= var5) {
                           if (var1 == -1765624481) {
                              throw new IllegalStateException();
                           }

                           if (var5 < 104) {
                              if (var1 == -1765624481) {
                                 throw new IllegalStateException();
                              }

                              if (-1 == client.je * -1246805187) {
                                 if (var1 == -1765624481) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = var25;
                              } else {
                                 var10000 = -1246805187 * client.je;
                              }

                              var9 = var10000;
                              fh.kg(var9, var22, var5, var23, var7, (byte)74);
                           }
                        }
                     }
                  }

               }
            } else {
               int var12;
               if (var0 == mj.ai) {
                  if (var1 == -1765624481) {
                     throw new IllegalStateException();
                  } else {
                     var21 = var2.dy((byte)-13);
                     var22 = var21 >> 2;
                     var5 = var21 & 3;
                     var23 = client.jk[var22];
                     var7 = var2.dy((byte)39);
                     var25 = var2.eg(2029661947);
                     var9 = var2.dj((byte)-6);
                     var10 = -1361011875 * is.jz + (var9 >> 4 & 7);
                     var11 = (var9 & 7) + 576765921 * fw.js;
                     if (var10 >= 0 && var11 >= 0) {
                        if (var1 == -1765624481) {
                           throw new IllegalStateException();
                        }

                        if (var10 < nq.jn.ai * 1587254913) {
                           if (var1 == -1765624481) {
                              throw new IllegalStateException();
                           }

                           if (var11 < -1000264093 * nq.jn.ay) {
                              if (var1 == -1765624481) {
                                 return;
                              }

                              if (client.je * -1246805187 == -1) {
                                 if (var1 == -1765624481) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = nq.jn.aj * 86027145;
                              } else {
                                 var10000 = -1246805187 * client.je;
                              }

                              var12 = var10000;
                              ix.kf(nq.jn, var12, var10, var11, var23, var25, var22, var5, var7, 0, -1, (byte)20);
                           }
                        }
                     }

                  }
               } else if (mj.ap == var0) {
                  if (var1 == -1765624481) {
                     throw new IllegalStateException();
                  } else {
                     var21 = var2.dp((short)-32040);
                     var22 = (var21 >> 4 & 7) + -1361011875 * is.jz;
                     var5 = (var21 & 7) + fw.js * 576765921;
                     var23 = var2.eg(1582841952);
                     var7 = var2.ch(1203709469);
                     if (var22 >= 0) {
                        if (var1 == -1765624481) {
                           throw new IllegalStateException();
                        }

                        if (var5 >= 0) {
                           if (var1 == -1765624481) {
                              throw new IllegalStateException();
                           }

                           if (var22 < 104) {
                              if (var1 == -1765624481) {
                                 return;
                              }

                              if (var5 < 104) {
                                 if (var1 == -1765624481) {
                                    return;
                                 }

                                 if (-1 == client.je * -1246805187) {
                                    if (var1 == -1765624481) {
                                       throw new IllegalStateException();
                                    }

                                    var10000 = 86027145 * nq.jn.aj;
                                 } else {
                                    var10000 = -1246805187 * client.je;
                                 }

                                 var25 = var10000;
                                 oy.jh(var25, var22, var5, var23, var7, 7992000);
                              }
                           }
                        }
                     }

                  }
               } else {
                  int var13;
                  int var14;
                  int var15;
                  int var16;
                  int var17;
                  if (mj.aj == var0) {
                     byte var3 = var2.dw(-1663400227);
                     byte var4 = var2.dw(-1663400227);
                     var5 = var2.eh(-1894769147);
                     byte var6 = var2.dw(-1663400227);
                     var7 = var2.ce(909087903);
                     byte var8 = var2.do(-368470699);
                     var9 = var2.dj((byte)89);
                     var10 = (var9 >> 4 & 7) + is.jz * -1361011875;
                     var11 = (var9 & 7) + fw.js * 576765921;
                     var12 = var2.ev(878652987);
                     var13 = var2.dp((short)-17749);
                     var14 = var13 >> 2;
                     var15 = var13 & 3;
                     var16 = client.jk[var14];
                     var17 = var2.eg(701003621);
                     dv var18;
                     if (client.ma * -190079873 == var17) {
                        var18 = nw.mc;
                     } else {
                        var18 = nq.jn.an[var17];
                     }

                     if (null != var18) {
                        if (var1 == -1765624481) {
                           throw new IllegalStateException();
                        }

                        if (-1246805187 * client.je == -1) {
                           if (var1 == -1765624481) {
                              return;
                           }

                           var10000 = nq.jn.aj * 86027145;
                        } else {
                           var10000 = client.je * -1246805187;
                        }

                        int var19 = var10000;
                        oc.ky(var19, var10, var11, var14, var15, var16, var7, var5, var12, var6, var3, var8, var4, var18, 431802639);
                     }
                  }

                  if (mj.ae == var0) {
                     if (var1 == -1765624481) {
                        throw new IllegalStateException();
                     } else {
                        var21 = var2.cy((short)-17497);
                        var22 = var21 >> 2;
                        var5 = var21 & 3;
                        var23 = client.jk[var22];
                        var7 = var2.eh(-1570238512);
                        var25 = var2.cy((short)-26571);
                        var9 = (var25 >> 4 & 7) + is.jz * -1361011875;
                        var10 = 576765921 * fw.js + (var25 & 7);
                        if (0 <= var9) {
                           if (var1 == -1765624481) {
                              throw new IllegalStateException();
                           }

                           if (var9 < 103) {
                              if (var1 == -1765624481) {
                                 return;
                              }

                              if (0 <= var10) {
                                 if (var1 == -1765624481) {
                                    throw new IllegalStateException();
                                 }

                                 if (var10 < 103) {
                                    if (var1 == -1765624481) {
                                       return;
                                    }

                                    if (-1 == client.je * -1246805187) {
                                       if (var1 == -1765624481) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = nq.jn.aj * 86027145;
                                    } else {
                                       var10000 = -1246805187 * client.je;
                                    }

                                    var11 = var10000;
                                    do var31 = hp.km(nq.jn, var11, var9, var10, var23, 1181991581);
                                    if (null != var31) {
                                       if (var1 == -1765624481) {
                                          throw new IllegalStateException();
                                       }

                                       ir var33 = ei.aw(var31.ae * 451987923, 888461382);
                                       if (var33.cq) {
                                          if (var1 == -1765624481) {
                                             throw new IllegalStateException();
                                          }

                                          var31.au = var7 * -633192667;
                                          return;
                                       }
                                    }

                                    boolean var34 = eg.ku(var11, var9, var10, var22, var5, var23, var7, 49866601);
                                    if (var34) {
                                       return;
                                    }

                                    if (null != var31) {
                                       if (var1 == -1765624481) {
                                          throw new IllegalStateException();
                                       }

                                       var31.au = -633192667 * var7;
                                    }
                                 }
                              }
                           }
                        }

                     }
                  } else if (var0 == mj.as) {
                     if (var1 != -1765624481) {
                        var21 = var2.ev(-1501045012);
                        var22 = var2.cz((byte)71);
                        var5 = var2.ev(-1917824999);
                        var23 = var2.eh(-1960126841);
                        var7 = var2.em(-1969202644);
                        var25 = var2.cy((short)-2690) * 4;
                        var9 = var2.dy((byte)-39);
                        var10 = -1361011875 * is.jz + (var9 >> 4 & 7);
                        var11 = 576765921 * fw.js + (var9 & 7);
                        var12 = var2.dj((byte)55) * 4;
                        var13 = var2.ev(350444616);
                        byte var32 = var2.dw(-1663400227);
                        var15 = var2.dp((short)-18330);
                        byte var35 = var2.do(-819628768);
                        var16 = var35 + var10;
                        var14 = var32 + var11;
                        if (var10 >= 0) {
                           if (var1 == -1765624481) {
                              throw new IllegalStateException();
                           }

                           if (var11 >= 0) {
                              if (var1 == -1765624481) {
                                 throw new IllegalStateException();
                              }

                              if (var10 < nq.jn.ai * 1587254913) {
                                 if (var1 == -1765624481) {
                                    return;
                                 }

                                 if (var11 < nq.jn.ay * -1000264093) {
                                    if (var1 == -1765624481) {
                                       throw new IllegalStateException();
                                    }

                                    if (var16 >= 0) {
                                       if (var1 == -1765624481) {
                                          throw new IllegalStateException();
                                       }

                                       if (var14 >= 0) {
                                          if (var1 == -1765624481) {
                                             return;
                                          }

                                          if (var16 < nq.jn.ai * 1587254913 && var14 < -1000264093 * nq.jn.ay) {
                                             if (var1 == -1765624481) {
                                                return;
                                             }

                                             if (65535 != var13) {
                                                if (var1 == -1765624481) {
                                                   return;
                                                }

                                                if (-1246805187 * client.je == -1) {
                                                   if (var1 == -1765624481) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var10000 = nq.jn.aj * 86027145;
                                                } else {
                                                   var10000 = -1246805187 * client.je;
                                                }

                                                var17 = var10000;
                                                fz.kh(var17, var10, var11, var16, var14, var7, var13, var25, var12, var5, var21, var15, var23, var22, -2089746484);
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                     }
                  } else if (var0 == mj.an) {
                     if (var1 == -1765624481) {
                        throw new IllegalStateException();
                     } else {
                        var21 = var2.cy((short)-19291);
                        var22 = var21 >> 2;
                        var5 = var21 & 3;
                        var23 = client.jk[var22];
                        var7 = var2.dy((byte)-19);
                        var25 = is.jz * -1361011875 + (var7 >> 4 & 7);
                        var9 = (var7 & 7) + fw.js * 576765921;
                        if (var25 >= 0) {
                           if (var1 == -1765624481) {
                              throw new IllegalStateException();
                           }

                           if (var9 >= 0 && var25 < 1587254913 * nq.jn.ai) {
                              if (var1 == -1765624481) {
                                 return;
                              }

                              if (var9 < nq.jn.ay * -1000264093) {
                                 if (var1 == -1765624481) {
                                    throw new IllegalStateException();
                                 }

                                 if (-1 == -1246805187 * client.je) {
                                    if (var1 == -1765624481) {
                                       throw new IllegalStateException();
                                    }

                                    var10000 = 86027145 * nq.jn.aj;
                                 } else {
                                    var10000 = client.je * -1246805187;
                                 }

                                 var10 = var10000;
                                 ix.kf(nq.jn, var10, var25, var9, var23, -1, var22, var5, 31, 0, -1, (byte)18);
                              }
                           }
                        }

                     }
                  } else if (mj.ao == var0) {
                     if (var1 == -1765624481) {
                        throw new IllegalStateException();
                     } else {
                        var21 = var2.cy((short)-29871);
                        var22 = (var21 >> 4 & 7) + is.jz * -1361011875;
                        var5 = (var21 & 7) + 576765921 * fw.js;
                        var23 = var2.ce(1269108235);
                        short var26 = (short)var2.ez(2077353631);
                        var25 = var2.ej((short)204);
                        var9 = var2.ev(107209305);
                        short var30 = (short)var2.cg(216847141);
                        var11 = var2.ec((byte)86);
                        var12 = var2.ez(1334614979);
                        if (var22 >= 0) {
                           if (var1 == -1765624481) {
                              throw new IllegalStateException();
                           }

                           if (var5 >= 0) {
                              if (var1 == -1765624481) {
                                 throw new IllegalStateException();
                              }

                              if (var22 < 104) {
                                 if (var1 == -1765624481) {
                                    throw new IllegalStateException();
                                 }

                                 if (var5 < 104) {
                                    if (var1 == -1765624481) {
                                       return;
                                    }

                                    if (-1246805187 * client.je == -1) {
                                       if (var1 == -1765624481) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = nq.jn.aj * 86027145;
                                    } else {
                                       var10000 = -1246805187 * client.je;
                                    }

                                    var13 = var10000;
                                    me.jp(var13, var22, var5, var9, var25, var30, var12, var26, var11, var23, -2139560932);
                                 }
                              }
                           }
                        }

                     }
                  } else if (var0 == mj.ay) {
                     if (var1 == -1765624481) {
                        throw new IllegalStateException();
                     } else {
                        var21 = var2.eg(1074012770);
                        var22 = var2.eh(-2060054524);
                        var5 = var2.dp((short)-8339);
                        var23 = is.jz * -1361011875 + (var5 >> 4 & 7);
                        var7 = (var5 & 7) + fw.js * 576765921;
                        var25 = var2.cy((short)-4260);
                        if (var23 >= 0) {
                           if (var1 == -1765624481) {
                              return;
                           }

                           if (var7 >= 0) {
                              if (var1 == -1765624481) {
                                 throw new IllegalStateException();
                              }

                              if (var23 < nq.jn.ai * 1587254913) {
                                 if (var1 == -1765624481) {
                                    throw new IllegalStateException();
                                 }

                                 if (var7 < -1000264093 * nq.jn.ay) {
                                    if (var1 == -1765624481) {
                                       throw new IllegalStateException();
                                    }

                                    var23 = nn.ao(var23, 775790836);
                                    var7 = nn.ao(var7, -586737395);
                                    if (-1 == client.je * -1246805187) {
                                       if (var1 == -1765624481) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = 86027145 * nq.jn.aj;
                                    } else {
                                       var10000 = client.je * -1246805187;
                                    }

                                    var9 = var10000;
                                    ca var29 = new ca(var21, var9, var23, var7, cu.jl(nq.jn, var23, var7, var9, 1514144988) - var25, var22, -330508271 * client.dt);
                                    nq.jn.ax.aw(var29);
                                 }
                              }
                           }
                        }

                     }
                  } else {
                     if (mj.at == var0) {
                        var21 = var2.dy((byte)-19);
                        var22 = var2.ce(918590557);
                        var5 = var2.dy((byte)-59);
                        var23 = -1361011875 * is.jz + (var5 >> 4 & 7);
                        var7 = (var5 & 7) + fw.js * 576765921;
                        var25 = nq.jn.aj * 86027145;
                        if (var23 >= 0) {
                           if (var1 == -1765624481) {
                              throw new IllegalStateException();
                           }

                           if (var7 >= 0) {
                              if (var1 == -1765624481) {
                                 throw new IllegalStateException();
                              }

                              if (var23 < 1587254913 * nq.jn.ai) {
                                 if (var1 == -1765624481) {
                                    throw new IllegalStateException();
                                 }

                                 if (var7 < nq.jn.ay * -1000264093) {
                                    if (var1 == -1765624481) {
                                       throw new IllegalStateException();
                                    }

                                    pu var27 = nq.jn.ad[var25][var23][var7];
                                    if (null != var27) {
                                       if (var1 == -1765624481) {
                                          throw new IllegalStateException();
                                       }

                                       for(ec var28 = (ec)var27.as(); var28 != null; var28 = (ec)var27.am()) {
                                          if (var1 == -1765624481) {
                                             return;
                                          }

                                          if (var28.ap * 1119456901 == (var22 & 32767)) {
                                             if (var1 == -1765624481) {
                                                throw new IllegalStateException();
                                             }

                                             var28.ap(var21, 35877037);
                                             break;
                                          }
                                       }
                                    }

                                    if (var23 >= 0) {
                                       if (var1 == -1765624481) {
                                          throw new IllegalStateException();
                                       }

                                       if (var7 >= 0) {
                                          if (var1 == -1765624481) {
                                             return;
                                          }

                                          if (var23 < 1587254913 * nq.jn.ai) {
                                             if (var1 == -1765624481) {
                                                throw new IllegalStateException();
                                             }

                                             if (var7 < nq.jn.ay * -1000264093) {
                                                if (var1 == -1765624481) {
                                                   return;
                                                }

                                                if (-1 == -1246805187 * client.je) {
                                                   if (var1 == -1765624481) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var10000 = nq.jn.aj * 86027145;
                                                } else {
                                                   var10000 = -1246805187 * client.je;
                                                }

                                                var10 = var10000;
                                                es.jr(var10, var23, var7, var22, var21, 2040296208);
                                             }
                                          }
                                       }
                                    }

                                    return;
                                 }
                              }
                           }
                        }
                     }

                     if (mj.ak == var0) {
                        var21 = var2.dy((byte)97);
                        var22 = is.jz * -1361011875 + (var21 >> 4 & 7);
                        var5 = (var21 & 7) + fw.js * 576765921;
                        var23 = var2.cy((short)-5956);
                        boolean var24 = var2.cy((short)-31867) == 1;
                        var25 = var2.ch(1203709469);
                        var9 = var2.eh(-1971505772);
                        var10 = var2.dj((byte)63);
                        var11 = var2.eg(743582564);
                        var12 = var2.eg(1319979762);
                        if (var22 >= 0) {
                           if (var1 == -1765624481) {
                              return;
                           }

                           if (var5 >= 0) {
                              if (var1 == -1765624481) {
                                 throw new IllegalStateException();
                              }

                              if (var22 < nq.jn.ai * 1587254913) {
                                 if (var1 == -1765624481) {
                                    throw new IllegalStateException();
                                 }

                                 if (var5 < -1000264093 * nq.jn.ay) {
                                    if (var1 == -1765624481) {
                                       throw new IllegalStateException();
                                    }

                                    var13 = -1 == -1246805187 * client.je ? nq.jn.aj * 86027145 : -1246805187 * client.je;
                                    lg.ka(var13, var22, var5, var9, var25, var23, var12, var11, var10, var24, 1487261076);
                                 }
                              }
                           }
                        }

                     }
                  }
               }
            }
         }
      } catch (RuntimeException var20) {
         throw tm.aw(var20, "eo.jy(" + ')');
      }
   }

   public int ay(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)0);
   }

   public int as(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)0);
   }

   public eo(boolean var1) {
      try {
         super();
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "eo.<init>(" + ')');
      }
   }

   public int at(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)0);
   }

   int aw(sv var1, sv var2) {
      if (1511931945 * var1.ai == -830732064 * client.cq && -568711761 * client.cq == var2.ai * 1511931945) {
         return this.ap ? var1.aa(1185385570).aj(var2.aa(1989688205), 614129495) : var2.aa(1520810318).aj(var1.aa(1572292024), 1138228468);
      } else {
         return this.an(var1, var2, 1255277363);
      }
   }

   public int ae(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)0);
   }
}
