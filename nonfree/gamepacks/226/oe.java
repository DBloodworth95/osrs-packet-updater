import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;

public abstract class oe {
   static final int aa = 1076101390;
   public static final int by = 57;

   abstract byte[] at();

   abstract byte[] ak(int var1);

   abstract void aj(byte[] var1, int var2);

   public static Object ai(byte[] var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0.length > 136) {
         oa var2 = new oa();
         var2.aj(var0, -682508653);
         return var2;
      } else if (var1) {
         int var3 = var0.length;
         byte[] var4 = new byte[var3];
         System.arraycopy(var0, 0, var4, 0, var3);
         return var4;
      } else {
         return var0;
      }
   }

   abstract void an(byte[] var1);

   public static Object as(byte[] var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0.length > 136) {
         oa var2 = new oa();
         var2.aj(var0, 1700474808);
         return var2;
      } else if (var1) {
         int var3 = var0.length;
         byte[] var4 = new byte[var3];
         System.arraycopy(var0, 0, var4, 0, var3);
         return var4;
      } else {
         return var0;
      }
   }

   abstract byte[] ae();

   public static Object ay(byte[] var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0.length > 136) {
         oa var2 = new oa();
         var2.aj(var0, 929263397);
         return var2;
      } else if (var1) {
         int var3 = var0.length;
         byte[] var4 = new byte[var3];
         System.arraycopy(var0, 0, var4, 0, var3);
         return var4;
      } else {
         return var0;
      }
   }

   oe() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "oe.<init>(" + ')');
      }
   }

   abstract byte[] au();

   abstract void ao(byte[] var1);

   abstract byte[] am();

   abstract void af(byte[] var1);

   abstract void ar(byte[] var1);

   static final void hw(byte var0) {
      try {
         int var1;
         int var2;
         int var3;
         if (!client.uw) {
            if (var0 != 9) {
               throw new IllegalStateException();
            }

            var1 = nn.ao(-527966187 * gw.ta, -2057505022);
            var2 = nn.ao(525324647 * et.tu, 990842781);
            var3 = cu.jl(hx.jf, var1, var2, hx.jf.aj * 86027145, 1408393606) - mb.tr * -816529695;
            in.hh(var1, var3, var2, 1463567568);
         } else if (client.um != null) {
            if (var0 != 9) {
               throw new IllegalStateException();
            }

            ad.kw = client.um.ap(1457830566) * -2128937647;
            oo.kv = client.um.aw((byte)72) * -2068675377;
            if (client.ub) {
               in.ks = client.um.ak(-2006354984) * 801770983;
            } else {
               in.ks = (cu.jl(hx.jf, ad.kw * -678007887, oo.kv * -892337617, 86027145 * hx.jf.aj, 1309321945) - client.um.ak(-2006354984)) * 801770983;
            }

            client.um.at(591801956);
         }

         if (!client.ug) {
            if (var0 != 9) {
               throw new IllegalStateException();
            }

            var1 = nn.ao(cx.uc * 1576804595, 54478632);
            var2 = nn.ao(444748929 * pg.ul, -1781187491);
            var3 = cu.jl(hx.jf, var1, var2, 86027145 * hx.jf.aj, 1487740926) - hi.us * -540479249;
            int var4 = var1 - ad.kw * -678007887;
            int var5 = var3 - 2138486231 * in.ks;
            int var6 = var2 - -892337617 * oo.kv;
            int var7 = (int)Math.sqrt((double)(var4 * var4 + var6 * var6));
            int var8 = (int)(Math.atan2((double)var5, (double)var7) * 325.9490051269531D) & 2047;
            int var9 = (int)(Math.atan2((double)var4, (double)var6) * -325.9490051269531D) & 2047;
            fl.hb(var8, var9, (byte)42);
         } else {
            if (null != client.ut) {
               if (var0 != 9) {
                  throw new IllegalStateException();
               }

               mj.kz = client.ut.ap((byte)-34) * 1819843435;
               mj.kz = Math.min(Math.max(-887244477 * mj.kz, 128), 383) * 1819843435;
               client.ut.at(645652749);
            }

            if (null != client.ud) {
               pg.kc = (client.ud.ap((byte)69) & 2047) * -583425379;
               client.ud.at(-803432465);
            }
         }

      } catch (RuntimeException var10) {
         throw tm.aw(var10, "oe.hw(" + ')');
      }
   }

   static final void hx(int var0) {
      try {
         if (client.sm * 246889749 != hx.jf.aj * 86027145) {
            if (var0 != 636480379) {
               throw new IllegalStateException();
            }

            client.sm = -668837467 * hx.jf.aj;
            bv.jo(hx.jf.aj * 86027145, 1453593363);
         }

      } catch (RuntimeException var1) {
         throw tm.aw(var1, "oe.hx(" + ')');
      }
   }

   static void ae(bz var0, qi var1, qi var2, byte var3) {
      try {
         if (dq.dr) {
            if (var3 == 2) {
               hb.av(var0, 590094442);
            }
         } else {
            di var10000;
            boolean var10001;
            label2156: {
               if (1 != bc.ag * -88156479) {
                  if (fq.ez || 4 != bc.ag * -88156479) {
                     break label2156;
                  }

                  if (var3 != 2) {
                     return;
                  }
               }

               if (-208904825 * bc.ad >= 765 + dq.ak * -2069137 - 50 && bc.ac * 1503556707 >= 453) {
                  if (var3 != 2) {
                     throw new IllegalStateException();
                  }

                  if (-208904825 * bc.ad < -2069137 * dq.ak + 765) {
                     if (var3 != 2) {
                        throw new IllegalStateException();
                     }

                     if (bc.ac * 1503556707 < 503) {
                        if (var3 != 2) {
                           return;
                        }

                        var10000 = io.vx;
                        if (!io.vx.am(387512164)) {
                           if (var3 != 2) {
                              return;
                           }

                           var10001 = true;
                        } else {
                           var10001 = false;
                        }

                        var10000.ae(var10001, 2004617824);
                        if (!io.vx.am(949354721)) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           ArrayList var4 = new ArrayList();
                           var4.add(new no(bc.fa, "scape main", "", 255, false));
                           hh.aw(var4, 0, 0, 0, 100, false, 1791078689);
                        } else {
                           gg.aj(0, 0, 132385369);
                        }

                        hr.ae(-610008942);
                     }
                  }
               }
            }

            if (client.da * -1869319151 == 5) {
               if (var3 != 2) {
                  throw new IllegalStateException();
               }
            } else {
               if (-1L == -8485463411094184791L * dq.dv) {
                  if (var3 != 2) {
                     throw new IllegalStateException();
                  }

                  dq.dv = (ck.ap(-1679522702) + 1000L) * -8782156948466022503L;
               }

               long var25 = ck.ap(-941122284);
               if (ch.gr(1552281144)) {
                  if (var3 != 2) {
                     throw new IllegalStateException();
                  }

                  if (-1L == -7429349422363448111L * dq.dj) {
                     if (var3 != 2) {
                        return;
                     }

                     dq.dj = var25 * 1105612961264561201L;
                     if (dq.dj * -7429349422363448111L > dq.dv * -8485463411094184791L) {
                        dq.dv = -7938466894616690711L * dq.dj;
                     }
                  }
               }

               if (10 != client.da * -1869319151) {
                  if (var3 != 2) {
                     return;
                  }

                  if (11 != client.da * -1869319151) {
                     if (var3 != 2) {
                        throw new IllegalStateException();
                     }

                     return;
                  }
               }

               int var6;
               if (lc.cp == pn.ap) {
                  if (var3 != 2) {
                     return;
                  }

                  label2139: {
                     if (bc.ag * -88156479 != 1) {
                        if (var3 != 2) {
                           return;
                        }

                        if (fq.ez) {
                           break label2139;
                        }

                        if (var3 != 2) {
                           throw new IllegalStateException();
                        }

                        if (-88156479 * bc.ag != 4) {
                           break label2139;
                        }

                        if (var3 != 2) {
                           throw new IllegalStateException();
                        }
                     }

                     var6 = -2069137 * dq.ak + 5;
                     short var7 = 463;
                     byte var8 = 100;
                     byte var9 = 35;
                     if (bc.ad * -208904825 >= var6) {
                        if (var3 != 2) {
                           throw new IllegalStateException();
                        }

                        if (bc.ad * -208904825 <= var6 + var8) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           if (bc.ac * 1503556707 >= var7) {
                              if (var3 != 2) {
                                 return;
                              }

                              if (1503556707 * bc.ac <= var7 + var9) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (ma.ap(-198524027)) {
                                    dq.dr = true;
                                    dq.dx = 0;
                                    dq.ds = 0;
                                 }

                                 return;
                              }
                           }
                        }
                     }
                  }

                  if (sk.at != null) {
                     if (var3 != 2) {
                        return;
                     }

                     if (ma.ap(-198524027)) {
                        if (var3 != 2) {
                           throw new IllegalStateException();
                        }

                        dq.dr = true;
                        dq.dx = 0;
                        dq.ds = 0;
                     }
                  }
               }

               var6 = -88156479 * bc.ag;
               int var26 = bc.ad * -208904825;
               int var27 = bc.ac * 1503556707;
               if (0 == var6) {
                  if (var3 != 2) {
                     throw new IllegalStateException();
                  }

                  var26 = 56923103 * bc.au;
                  var27 = -1159272925 * bc.an;
               }

               if (!fq.ez) {
                  if (var3 != 2) {
                     throw new IllegalStateException();
                  }

                  if (4 == var6) {
                     if (var3 != 2) {
                        throw new IllegalStateException();
                     }

                     var6 = 1;
                  }
               }

               kr var28 = client.se;
               kr var10 = var28;
               int var31;
               short var32;
               if (-1064901707 * dq.cq == 0) {
                  if (var3 != 2) {
                     throw new IllegalStateException();
                  }

                  boolean var47 = false;

                  while(var10.ab(409126671)) {
                     if (var3 != 2) {
                        throw new IllegalStateException();
                     }

                     if (84 == -1413118539 * var10.ar) {
                        if (var3 != 2) {
                           return;
                        }

                        var47 = true;
                     }
                  }

                  var31 = aq.aq * 898492289 - 80;
                  var32 = 291;
                  if (var6 == 1) {
                     if (var3 != 2) {
                        return;
                     }

                     if (var26 >= var31 - 75) {
                        if (var3 != 2) {
                           throw new IllegalStateException();
                        }

                        if (var26 <= var31 + 75) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           if (var27 >= var32 - 20) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (var27 <= var32 + 20) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 pc.ap(el.ov("secure", true, -2144662822) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, (byte)105);
                              }
                           }
                        }
                     }
                  }

                  label2001: {
                     var31 = 80 + 898492289 * aq.aq;
                     if (var6 == 1 && var26 >= var31 - 75) {
                        if (var3 != 2) {
                           return;
                        }

                        if (var26 <= 75 + var31) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           if (var27 >= var32 - 20) {
                              if (var27 <= 20 + var32) {
                                 break label2001;
                              }

                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }

                     if (!var47) {
                        return;
                     }
                  }

                  gn.au(-1450976103);
               } else {
                  int var11;
                  short var12;
                  if (-1064901707 * dq.cq == 1) {
                     if (var3 != 2) {
                        throw new IllegalStateException();
                     }

                     while(var10.ab(1237749425)) {
                        if (var3 != 2) {
                           throw new IllegalStateException();
                        }

                        if (84 == -1413118539 * var10.ar) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           us.ar(false, -7998461);
                        } else if (13 == -1413118539 * var10.ar) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           as.aa(0, (byte)1);
                        }
                     }

                     var11 = 898492289 * aq.aq - 80;
                     var12 = 321;
                     if (var6 == 1) {
                        if (var3 != 2) {
                           return;
                        }

                        if (var26 >= var11 - 75) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           if (var26 <= 75 + var11) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (var27 >= var12 - 20) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var27 <= var12 + 20) {
                                    if (var3 != 2) {
                                       return;
                                    }

                                    us.ar(false, -7998461);
                                 }
                              }
                           }
                        }
                     }

                     var11 = 80 + 898492289 * aq.aq;
                     if (var6 == 1) {
                        if (var3 != 2) {
                           throw new IllegalStateException();
                        }

                        if (var26 >= var11 - 75) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           if (var26 <= var11 + 75) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (var27 >= var12 - 20 && var27 <= var12 + 20) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 as.aa(0, (byte)1);
                              }
                           }
                        }
                     }
                  } else {
                     int var15;
                     int var16;
                     short var29;
                     boolean var33;
                     fu var48;
                     if (-1064901707 * dq.cq == 2) {
                        if (var3 != 2) {
                           throw new IllegalStateException();
                        }

                        var29 = 201;
                        var11 = var29 + 52;
                        if (1 == var6) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           if (var27 >= var11 - 12) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (var27 < var11 + 2) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 dq.dq = 0;
                              }
                           }
                        }

                        var11 += 15;
                        if (1 == var6) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           if (var27 >= var11 - 12 && var27 < 2 + var11) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              dq.dq = 589908801;
                           }
                        }

                        var11 += 15;
                        var29 = 361;
                        if (null != cu.bl) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           var31 = cu.bl.ak * 1187820279 / 2;
                           if (1 == var6) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (var26 >= -1212502861 * cu.bl.ap - var31) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 <= var31 + cu.bl.ap * -1212502861) {
                                    if (var3 != 2) {
                                       return;
                                    }

                                    if (var27 >= var29 - 15) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 < var29) {
                                          if (var3 != 2) {
                                             return;
                                          }

                                          switch(1866840143 * dq.bf) {
                                          case 1:
                                             pc.ap(og.ma, true, false, (byte)54);
                                             return;
                                          case 2:
                                             pc.ap("https://support.runescape.com/hc/en-gb", true, false, (byte)24);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        var31 = aq.aq * 898492289 - 80;
                        var32 = 321;
                        if (1 == var6) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           if (var26 >= var31 - 75) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (var26 <= var31 + 75) {
                                 if (var3 != 2) {
                                    return;
                                 }

                                 if (var27 >= var32 - 20) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var27 <= var32 + 20) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       na.at((byte)-94);
                                       return;
                                    }
                                 }
                              }
                           }
                        }

                        var31 = -710649007 * dq.ax + 180 + 80;
                        if (1 == var6) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           if (var26 >= var31 - 75) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (var26 <= var31 + 75) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var27 >= var32 - 20 && var27 <= 20 + var32) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    as.aa(0, (byte)1);
                                    dq.co = "";
                                    dq.cf = "";
                                    mp.cs = 0;
                                    nu.cr = "";
                                    dq.ck = true;
                                 }
                              }
                           }
                        }

                        boolean var49;
                        label2111: {
                           var31 = -117 + aq.aq * 898492289;
                           var32 = 277;
                           if (var26 >= var31) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (var26 < fw.cj * -1407412519 + var31) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var27 >= var32) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var27 < -1444168173 * ks.cm + var32) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       var49 = true;
                                       break label2111;
                                    }
                                 }
                              }
                           }

                           var49 = false;
                        }

                        dq.cw = var49;
                        if (1 == var6 && dq.cw) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           client.hy = !client.hy;
                           if (!client.hy) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (io.vx.al(-123589811) != null) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 io.vx.aq((String)null, -401766233);
                              }
                           }
                        }

                        label2100: {
                           var31 = 898492289 * aq.aq + 24;
                           var32 = 277;
                           if (var26 >= var31) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (var26 < var31 + fw.cj * -1407412519 && var27 >= var32 && var27 < ks.cm * -1444168173 + var32) {
                                 var49 = true;
                                 break label2100;
                              }
                           }

                           var49 = false;
                        }

                        dq.ca = var49;
                        if (var6 == 1) {
                           if (var3 != 2) {
                              return;
                           }

                           if (dq.ca) {
                              var10000 = io.vx;
                              if (!io.vx.as(2135681614)) {
                                 if (var3 != 2) {
                                    return;
                                 }

                                 var10001 = true;
                              } else {
                                 var10001 = false;
                              }

                              var10000.ay(var10001, -895569796);
                              if (!io.vx.as(2133808005)) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 dq.co = "";
                                 io.vx.aq((String)null, -401766233);
                                 dp.as(1920396728);
                              }
                           }
                        }

                        while(true) {
                           Transferable var45;
                           do {
                              while(true) {
                                 label2048:
                                 do {
                                    while(true) {
                                       while(var10.ab(271361556)) {
                                          if (13 != -1413118539 * var10.ar) {
                                             if (-1298053951 * dq.dq != 0) {
                                                continue label2048;
                                             }

                                             if (var3 != 2) {
                                                throw new IllegalStateException();
                                             }

                                             char var35 = var10.af;

                                             for(var15 = 0; var15 < dq.dd.length(); ++var15) {
                                                if (var35 == dq.dd.charAt(var15)) {
                                                   if (var3 != 2) {
                                                      throw new IllegalStateException();
                                                   }
                                                   break;
                                                }
                                             }

                                             if (-1413118539 * var10.ar == 85) {
                                                if (var3 != 2) {
                                                   throw new IllegalStateException();
                                                }

                                                if (dq.co.length() > 0) {
                                                   if (var3 != 2) {
                                                      throw new IllegalStateException();
                                                   }

                                                   dq.co = dq.co.substring(0, dq.co.length() - 1);
                                                }
                                             }

                                             label2033: {
                                                if (84 != var10.ar * -1413118539) {
                                                   if (var3 != 2) {
                                                      throw new IllegalStateException();
                                                   }

                                                   if (80 != var10.ar * -1413118539) {
                                                      break label2033;
                                                   }

                                                   if (var3 != 2) {
                                                      throw new IllegalStateException();
                                                   }
                                                }

                                                dq.dq = 589908801;
                                             }

                                             char var41 = var10.af;
                                             if (dq.dd.indexOf(var41) != -1) {
                                                if (var3 != 2) {
                                                   throw new IllegalStateException();
                                                }

                                                var49 = true;
                                             } else {
                                                var49 = false;
                                             }

                                             boolean var43 = var49;
                                             if (var43) {
                                                if (var3 != 2) {
                                                   throw new IllegalStateException();
                                                }

                                                if (dq.co.length() < 320) {
                                                   dq.co = dq.co + var10.af;
                                                }
                                             }
                                          } else {
                                             as.aa(0, (byte)1);
                                             dq.co = "";
                                             dq.cf = "";
                                             mp.cs = 0;
                                             nu.cr = "";
                                             dq.ck = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(dq.dq * -1298053951 != 1);

                                 label2180: {
                                    if (var10.ar * -1413118539 == 85) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (dq.cf.length() > 0) {
                                          if (var3 != 2) {
                                             return;
                                          }

                                          dq.cf = dq.cf.substring(0, dq.cf.length() - 1);
                                          break label2180;
                                       }
                                    }

                                    if (84 != var10.ar * -1413118539) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (-1413118539 * var10.ar != 80) {
                                          break label2180;
                                       }

                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    dq.dq = 0;
                                    if (84 == var10.ar * -1413118539) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       dq.co = dq.co.trim();
                                       if (dq.co.length() == 0) {
                                          if (var3 != 2) {
                                             return;
                                          }

                                          fa.ad(og.eu, og.eq, og.eb, -1059127340);
                                       } else if (dq.cf.length() == 0) {
                                          if (var3 != 2) {
                                             return;
                                          }

                                          fa.ad(og.es, og.eo, og.ee, -1059127340);
                                       } else {
                                          fa.ad(og.im, og.is, og.jj, -1059127340);
                                          if (io.vx.bx(dq.co, 1872392903)) {
                                             if (var3 != 2) {
                                                throw new IllegalStateException();
                                             }

                                             var48 = fu.ap;
                                          } else {
                                             var48 = fu.ak;
                                          }

                                          client.fi = var48;
                                          ea.gv(20, 2027013533);
                                       }

                                       return;
                                    }
                                 }

                                 label2067: {
                                    if (!var10.ag(82, -393453780)) {
                                       if (var3 != 2) {
                                          return;
                                       }

                                       if (!var10.ag(87, 1279374926)) {
                                          break label2067;
                                       }

                                       if (var3 != 2) {
                                          return;
                                       }
                                    }

                                    if (-1413118539 * var10.ar == 67) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       Clipboard var37 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                       var45 = var37.getContents(dd.bl);
                                       var16 = 20 - dq.cf.length();
                                       break;
                                    }
                                 }

                                 if (oi.ak(var10.af, 757618401)) {
                                    if (var3 != 2) {
                                       return;
                                    }

                                    char var46 = var10.af;
                                    if (dq.dd.indexOf(var46) != -1) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       var49 = true;
                                    } else {
                                       var49 = false;
                                    }

                                    var33 = var49;
                                    if (var33) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (dq.cf.length() < 20) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          dq.cf = dq.cf + var10.af;
                                       }
                                    }
                                 }
                              }
                           } while(var16 <= 0);

                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           try {
                              String var44 = (String)var45.getTransferData(DataFlavor.stringFlavor);
                              int var18 = Math.min(var16, var44.length());
                              int var19 = 0;

                              while(true) {
                                 if (var19 < var18) {
                                    if (var3 != 2) {
                                       return;
                                    }

                                    if (oi.ak(var44.charAt(var19), -40838497)) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       char var21 = var44.charAt(var19);
                                       if (dq.dd.indexOf(var21) != -1) {
                                          if (var3 != 2) {
                                             return;
                                          }

                                          var49 = true;
                                       } else {
                                          var49 = false;
                                       }

                                       boolean var20 = var49;
                                       if (var20) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          ++var19;
                                          continue;
                                       }
                                    }

                                    as.aa(3, (byte)1);
                                    return;
                                 }

                                 dq.cf = dq.cf + var44.substring(0, var18);
                                 break;
                              }
                           } catch (UnsupportedFlavorException var22) {
                           } catch (IOException var23) {
                           }
                        }
                     } else {
                        qg var13;
                        if (3 == dq.cq * -1064901707) {
                           if (var3 != 2) {
                              throw new IllegalStateException();
                           }

                           var11 = dq.ax * -710649007 + 180;
                           var12 = 241;
                           var13 = var1.ar(25, og.ki.length() - 34, og.ki, var11, var12);
                           if (1 == var6) {
                              if (var3 != 2) {
                                 return;
                              }

                              if (var13.ak(var26, var27, -88156479)) {
                                 pc.ap(og.my, true, false, (byte)100);
                              }
                           }

                           var11 = -710649007 * dq.ax + 180;
                           var12 = 276;
                           if (1 == var6) {
                              if (var3 != 2) {
                                 return;
                              }

                              if (var26 >= var11 - 75) {
                                 if (var3 != 2) {
                                    return;
                                 }

                                 if (var26 <= var11 + 75) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var27 >= var12 - 20) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 <= 20 + var12) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          mm.ab(false, -125923380);
                                       }
                                    }
                                 }
                              }
                           }

                           var11 = dq.ax * -710649007 + 180;
                           var12 = 326;
                           if (var6 == 1) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (var26 >= var11 - 75) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 <= 75 + var11) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var27 >= var12 - 20 && var27 <= 20 + var12) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       pc.ap(og.ma, true, false, (byte)107);
                                       return;
                                    }
                                 }
                              }
                           }
                        } else {
                           int var14;
                           if (dq.cq * -1064901707 == 4) {
                              var11 = 180 + dq.ax * -710649007 - 80;
                              var12 = 321;
                              if (var6 == 1) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 >= var11 - 75 && var26 <= var11 + 75) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var27 >= var12 - 20) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 <= var12 + 20) {
                                          if (var3 != 2) {
                                             return;
                                          }

                                          ck.am(-760693873);
                                          return;
                                       }
                                    }
                                 }
                              }

                              if (var6 == 1) {
                                 if (var3 != 2) {
                                    return;
                                 }

                                 if (var26 >= dq.ax * -710649007 + 180 - 9) {
                                    if (var3 != 2) {
                                       return;
                                    }

                                    if (var26 <= 180 + dq.ax * -710649007 + 130) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 >= 263 && var27 <= 296) {
                                          if (var3 != 2) {
                                             return;
                                          }

                                          dq.ck = !dq.ck;
                                       }
                                    }
                                 }
                              }

                              if (1 == var6) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 >= dq.ax * -710649007 + 180 - 34) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var26 <= 34 + -710649007 * dq.ax + 180) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 >= 351) {
                                          if (var3 != 2) {
                                             return;
                                          }

                                          if (var27 <= 363) {
                                             if (var3 != 2) {
                                                throw new IllegalStateException();
                                             }

                                             pc.ap(og.ma, true, false, (byte)27);
                                          }
                                       }
                                    }
                                 }
                              }

                              var11 = 80 + 180 + -710649007 * dq.ax;
                              if (var6 == 1) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 >= var11 - 75) {
                                    if (var3 != 2) {
                                       return;
                                    }

                                    if (var26 <= var11 + 75 && var27 >= var12 - 20) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 <= var12 + 20) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          as.aa(0, (byte)1);
                                          dq.co = "";
                                          dq.cf = "";
                                          mp.cs = 0;
                                          nu.cr = "";
                                       }
                                    }
                                 }
                              }

                              while(var10.ab(1045356440)) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 boolean var30 = false;

                                 for(var14 = 0; var14 < dq.dc.length(); ++var14) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var10.af == dq.dc.charAt(var14)) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       var30 = true;
                                       break;
                                    }
                                 }

                                 if (-1413118539 * var10.ar == 13) {
                                    as.aa(0, (byte)1);
                                    dq.co = "";
                                    dq.cf = "";
                                    mp.cs = 0;
                                    nu.cr = "";
                                 } else {
                                    if (85 == var10.ar * -1413118539) {
                                       if (var3 != 2) {
                                          return;
                                       }

                                       if (nu.cr.length() > 0) {
                                          if (var3 != 2) {
                                             return;
                                          }

                                          nu.cr = nu.cr.substring(0, nu.cr.length() - 1);
                                       }
                                    }

                                    if (-1413118539 * var10.ar == 84) {
                                       if (var3 != 2) {
                                          return;
                                       }

                                       nu.cr.trim();
                                       if (nu.cr.length() != 6) {
                                          fa.ad(og.bs, og.bm, og.bo, -1059127340);
                                       } else {
                                          mp.cs = Integer.parseInt(nu.cr) * -1131643225;
                                          nu.cr = "";
                                          if (dq.ck) {
                                             if (var3 != 2) {
                                                throw new IllegalStateException();
                                             }

                                             var48 = fu.aw;
                                          } else {
                                             var48 = fu.aj;
                                          }

                                          client.fi = var48;
                                          fa.ad(og.im, og.is, og.jj, -1059127340);
                                          ea.gv(20, 2027013533);
                                       }

                                       return;
                                    }

                                    if (var30 && nu.cr.length() < 6) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       nu.cr = nu.cr + var10.af;
                                    }
                                 }
                              }
                           } else if (-1064901707 * dq.cq == 5) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              var11 = -710649007 * dq.ax + 180 - 80;
                              var12 = 321;
                              if (var6 == 1 && var26 >= var11 - 75 && var26 <= 75 + var11) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var27 >= var12 - 20) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var27 <= 20 + var12) {
                                       lg.az(-115351229);
                                       return;
                                    }
                                 }
                              }

                              var11 = 80 + 180 + dq.ax * -710649007;
                              if (1 == var6) {
                                 if (var3 != 2) {
                                    return;
                                 }

                                 if (var26 >= var11 - 75 && var26 <= var11 + 75 && var27 >= var12 - 20) {
                                    if (var3 != 2) {
                                       return;
                                    }

                                    if (var27 <= var12 + 20) {
                                       if (var3 != 2) {
                                          return;
                                       }

                                       us.ar(true, -7998461);
                                    }
                                 }
                              }

                              var32 = 361;
                              if (null != ii.be) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 var14 = 1187820279 * ii.be.ak / 2;
                                 if (var6 == 1) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var26 >= -1212502861 * ii.be.ap - var14) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var26 <= ii.be.ap * -1212502861 + var14) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          if (var27 >= var32 - 15) {
                                             if (var3 != 2) {
                                                throw new IllegalStateException();
                                             }

                                             if (var27 < var32) {
                                                if (var3 != 2) {
                                                   return;
                                                }

                                                pc.ap(el.ov("secure", true, -2059716143) + "m=weblogin/g=oldscape/cant_log_in", true, false, (byte)58);
                                             }
                                          }
                                       }
                                    }
                                 }
                              }

                              while(var10.ab(-737311407)) {
                                 if (var3 != 2) {
                                    return;
                                 }

                                 var33 = false;

                                 for(var15 = 0; var15 < dq.dd.length(); ++var15) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var10.af == dq.dd.charAt(var15)) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       var33 = true;
                                       break;
                                    }
                                 }

                                 if (-1413118539 * var10.ar == 13) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    us.ar(true, -7998461);
                                 } else {
                                    if (var10.ar * -1413118539 == 85 && dq.co.length() > 0) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       dq.co = dq.co.substring(0, dq.co.length() - 1);
                                    }

                                    if (84 == -1413118539 * var10.ar) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       lg.az(258634643);
                                       return;
                                    }

                                    if (var33) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (dq.co.length() < 320) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          dq.co = dq.co + var10.af;
                                       }
                                    }
                                 }
                              }
                           } else if (6 == dq.cq * -1064901707) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              while(true) {
                                 do {
                                    if (!var10.ab(-693340358)) {
                                       var29 = 321;
                                       if (1 == var6) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          if (var27 >= var29 - 20) {
                                             if (var3 != 2) {
                                                throw new IllegalStateException();
                                             }

                                             if (var27 <= 20 + var29) {
                                                us.ar(true, -7998461);
                                             }

                                             return;
                                          }
                                       }

                                       return;
                                    }

                                    if (var3 != 2) {
                                       return;
                                    }
                                 } while(84 != var10.ar * -1413118539 && 13 != var10.ar * -1413118539);

                                 us.ar(true, -7998461);
                              }
                           } else if (7 == dq.cq * -1064901707) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (qf.dl) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (!client.cz) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    var11 = 898492289 * aq.aq - 150;
                                    var31 = 25 + var11 + 240 + 40;
                                    var32 = 231;
                                    var14 = 40 + var32;
                                    if (1 == var6) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var26 >= var11) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          if (var26 <= var31) {
                                             if (var3 != 2) {
                                                return;
                                             }

                                             if (var27 >= var32) {
                                                if (var3 != 2) {
                                                   return;
                                                }

                                                if (var27 <= var14) {
                                                   if (var3 != 2) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var16 = var11;
                                                   int var17 = 0;

                                                   while(true) {
                                                      if (var17 >= 8) {
                                                         var15 = 0;
                                                         break;
                                                      }

                                                      if (var3 != 2) {
                                                         throw new IllegalStateException();
                                                      }

                                                      if (var26 <= 30 + var16) {
                                                         var15 = var17;
                                                         break;
                                                      }

                                                      byte var50;
                                                      label1941: {
                                                         var16 += 30;
                                                         if (1 != var17) {
                                                            if (var3 != 2) {
                                                               throw new IllegalStateException();
                                                            }

                                                            if (var17 != 3) {
                                                               var50 = 5;
                                                               break label1941;
                                                            }

                                                            if (var3 != 2) {
                                                               return;
                                                            }
                                                         }

                                                         var50 = 20;
                                                      }

                                                      var16 += var50;
                                                      ++var17;
                                                   }

                                                   dq.cp = 843443901 * var15;
                                                }
                                             }
                                          }
                                       }
                                    }

                                    var15 = 180 + -710649007 * dq.ax - 80;
                                    short var36 = 321;
                                    boolean var42;
                                    if (var6 == 1) {
                                       if (var3 != 2) {
                                          return;
                                       }

                                       if (var26 >= var15 - 75) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          if (var26 <= 75 + var15) {
                                             if (var3 != 2) {
                                                throw new IllegalStateException();
                                             }

                                             if (var27 >= var36 - 20 && var27 <= var36 + 20) {
                                                if (var3 != 2) {
                                                   throw new IllegalStateException();
                                                }

                                                var42 = cc.an((byte)-62);
                                                if (var42) {
                                                   if (var3 != 2) {
                                                      throw new IllegalStateException();
                                                   }

                                                   ea.gv(50, 2027013533);
                                                   return;
                                                }
                                             }
                                          }
                                       }
                                    }

                                    var15 = 180 + dq.ax * -710649007 + 80;
                                    if (1 == var6 && var26 >= var15 - 75) {
                                       if (var3 != 2) {
                                          return;
                                       }

                                       if (var26 <= 75 + var15 && var27 >= var36 - 20) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          if (var27 <= 20 + var36) {
                                             if (var3 != 2) {
                                                throw new IllegalStateException();
                                             }

                                             dq.cv = new String[8];
                                             us.ar(true, -7998461);
                                          }
                                       }
                                    }

                                    do {
                                       if (!var10.ab(2104871693)) {
                                          return;
                                       }

                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var10.ar * -1413118539 == 101) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          dq.cv[-518849387 * dq.cp] = null;
                                       }

                                       if (85 == -1413118539 * var10.ar) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          if (null == dq.cv[dq.cp * -518849387]) {
                                             if (var3 != 2) {
                                                throw new IllegalStateException();
                                             }

                                             if (-518849387 * dq.cp > 0) {
                                                if (var3 != 2) {
                                                   throw new IllegalStateException();
                                                }

                                                dq.cp -= 843443901;
                                             }
                                          }

                                          dq.cv[dq.cp * -518849387] = null;
                                       }

                                       if (var10.af >= '0') {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          if (var10.af <= '9') {
                                             dq.cv[dq.cp * -518849387] = "" + var10.af;
                                             if (dq.cp * -518849387 < 7) {
                                                if (var3 != 2) {
                                                   throw new IllegalStateException();
                                                }

                                                dq.cp += 843443901;
                                             }
                                          }
                                       }
                                    } while(84 != -1413118539 * var10.ar);

                                    if (var3 != 2) {
                                       return;
                                    }

                                    var42 = cc.an((byte)-53);
                                    if (var42) {
                                       ea.gv(50, 2027013533);
                                    }

                                    return;
                                 }
                              }

                              var11 = dq.ax * -710649007 + 180 - 80;
                              var12 = 321;
                              if (var6 == 1) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 >= var11 - 75) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var26 <= var11 + 75 && var27 >= var12 - 20) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 <= 20 + var12) {
                                          pc.ap(el.ov("secure", true, -1795651004) + "m=dob/set_dob.ws", true, false, (byte)64);
                                          fa.ad(og.kd, og.kw, og.ks, -1059127340);
                                          as.aa(6, (byte)1);
                                          return;
                                       }
                                    }
                                 }
                              }

                              var11 = 80 + 180 + dq.ax * -710649007;
                              if (1 == var6) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 >= var11 - 75) {
                                    if (var3 != 2) {
                                       return;
                                    }

                                    if (var26 <= 75 + var11) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 >= var12 - 20) {
                                          if (var3 != 2) {
                                             return;
                                          }

                                          if (var27 <= 20 + var12) {
                                             if (var3 != 2) {
                                                throw new IllegalStateException();
                                             }

                                             us.ar(true, -7998461);
                                          }
                                       }
                                    }
                                 }
                              }
                           } else if (dq.cq * -1064901707 == 8) {
                              var11 = 180 + -710649007 * dq.ax - 80;
                              var12 = 321;
                              if (1 == var6) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 >= var11 - 75 && var26 <= 75 + var11) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var27 >= var12 - 20) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 <= 20 + var12) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          pc.ap("https://www.jagex.com/terms/privacy", true, false, (byte)127);
                                          fa.ad(og.kd, og.kw, og.ks, -1059127340);
                                          as.aa(6, (byte)1);
                                          return;
                                       }
                                    }
                                 }
                              }

                              var11 = 80 + 180 + dq.ax * -710649007;
                              if (var6 == 1 && var26 >= var11 - 75) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 <= 75 + var11) {
                                    if (var3 != 2) {
                                       return;
                                    }

                                    if (var27 >= var12 - 20) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 <= var12 + 20) {
                                          us.ar(true, -7998461);
                                       }
                                    }
                                 }
                              }
                           } else if (9 == -1064901707 * dq.cq) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              var11 = 180 + -710649007 * dq.ax;
                              var12 = 311;
                              if (84 != var28.ar * -1413118539 && 13 != var28.ar * -1413118539) {
                                 if (var6 != 1) {
                                    return;
                                 }

                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 < var11 - 75) {
                                    return;
                                 }

                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 > 75 + var11 || var27 < var12 - 20) {
                                    return;
                                 }

                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var27 > var12 + 20) {
                                    return;
                                 }

                                 if (var3 != 2) {
                                    return;
                                 }
                              }

                              mm.ab(false, 1914685533);
                           } else if (10 == dq.cq * -1064901707) {
                              if (var3 != 2) {
                                 return;
                              }

                              var11 = 180 + dq.ax * -710649007;
                              var12 = 209;
                              if (var28.ar * -1413118539 != 84) {
                                 if (var3 != 2) {
                                    return;
                                 }

                                 if (1 != var6) {
                                    return;
                                 }

                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 < var11 - 109 || var26 > 109 + var11 || var27 < var12) {
                                    return;
                                 }

                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var27 > var12 + 68) {
                                    return;
                                 }

                                 if (var3 != 2) {
                                    return;
                                 }
                              }

                              fa.ad(og.im, og.is, og.jj, -1059127340);
                              client.gp = ve.aw;
                              client.fi = io.vx.bx(dq.co, 472063043) ? fu.ap : fu.ak;
                              ea.gv(20, 2027013533);
                           } else if (12 == -1064901707 * dq.cq) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              var11 = 898492289 * aq.aq;
                              var12 = 233;
                              var13 = var2.ar(0, 30, og.ln, var11, var12);
                              qg var34 = var2.ar(32, 32, og.ln, var11, var12);
                              qg var38 = var2.ar(70, 34, og.ln, var11, var12);
                              var31 = var12 + 17;
                              qg var39 = var2.ar(0, 34, og.le, var11, var31);
                              if (1 == var6) {
                                 if (var3 != 2) {
                                    return;
                                 }

                                 if (var13.ak(var26, var27, -88156479)) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    pc.ap("https://www.jagex.com/terms", true, false, (byte)42);
                                 } else if (var34.ak(var26, var27, -88156479)) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    pc.ap("https://www.jagex.com/terms/privacy", true, false, (byte)27);
                                 } else {
                                    label2235: {
                                       if (!var38.ak(var26, var27, -88156479)) {
                                          if (var3 != 2) {
                                             return;
                                          }

                                          if (!var39.ak(var26, var27, -88156479)) {
                                             break label2235;
                                          }

                                          if (var3 != 2) {
                                             return;
                                          }
                                       }

                                       pc.ap("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false, (byte)127);
                                    }
                                 }
                              }

                              var11 = 898492289 * aq.aq - 80;
                              var12 = 311;
                              if (1 == var6) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 >= var11 - 75 && var26 <= var11 + 75) {
                                    if (var3 != 2) {
                                       return;
                                    }

                                    if (var27 >= var12 - 20 && var27 <= var12 + 20) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       gu.op(1357372195);
                                       mm.ab(true, 1261854438);
                                    }
                                 }
                              }

                              var11 = 80 + 898492289 * aq.aq;
                              if (var6 == 1) {
                                 if (var3 != 2) {
                                    return;
                                 }

                                 if (var26 >= var11 - 75) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var26 <= 75 + var11) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 >= var12 - 20) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          if (var27 <= 20 + var12) {
                                             if (var3 != 2) {
                                                throw new IllegalStateException();
                                             }

                                             dq.cq = -664301063;
                                          }
                                       }
                                    }
                                 }
                              }
                           } else if (13 == -1064901707 * dq.cq) {
                              var11 = aq.aq * 898492289;
                              var12 = 321;
                              if (1 == var6) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 >= var11 - 75 && var26 <= var11 + 75) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var27 >= var12 - 20) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 <= 20 + var12) {
                                          if (var3 != 2) {
                                             return;
                                          }

                                          mm.ab(true, 2125865518);
                                       }
                                    }
                                 }
                              }
                           } else if (dq.cq * -1064901707 == 14) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              String var40 = "";
                              switch(-1658478237 * dq.ba) {
                              case 0:
                                 var40 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                 break;
                              case 1:
                                 var40 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                 break;
                              case 2:
                                 var40 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                 break;
                              default:
                                 us.ar(false, -7998461);
                              }

                              var31 = -710649007 * dq.ax + 180;
                              var32 = 276;
                              if (var6 == 1) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 >= var31 - 75) {
                                    if (var3 != 2) {
                                       return;
                                    }

                                    if (var26 <= var31 + 75) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 >= var32 - 20) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          if (var27 <= 20 + var32) {
                                             if (var3 != 2) {
                                                throw new IllegalStateException();
                                             }

                                             pc.ap(var40, true, false, (byte)48);
                                             fa.ad(og.kd, og.kw, og.ks, -1059127340);
                                             as.aa(6, (byte)1);
                                             return;
                                          }
                                       }
                                    }
                                 }
                              }

                              var31 = 180 + -710649007 * dq.ax;
                              var32 = 326;
                              if (var6 == 1) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 >= var31 - 75) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var26 <= 75 + var31) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 >= var32 - 20) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          if (var27 <= var32 + 20) {
                                             us.ar(false, -7998461);
                                          }
                                       }
                                    }
                                 }
                              }
                           } else if (dq.cq * -1064901707 == 24) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              var11 = -710649007 * dq.ax + 180;
                              var12 = 301;
                              if (1 == var6) {
                                 if (var3 != 2) {
                                    return;
                                 }

                                 if (var26 >= var11 - 75) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var26 <= 75 + var11) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 >= var12 - 20) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          if (var27 <= var12 + 20) {
                                             if (var3 != 2) {
                                                throw new IllegalStateException();
                                             }

                                             mm.ab(false, -1964016784);
                                          }
                                       }
                                    }
                                 }
                              }
                           } else if (dq.cq * -1064901707 == 32) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              var11 = 180 + dq.ax * -710649007 - 80;
                              var12 = 321;
                              if (var6 == 1) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 >= var11 - 75) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var26 <= var11 + 75 && var27 >= var12 - 20) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 <= 20 + var12) {
                                          if (var3 != 2) {
                                             return;
                                          }

                                          pc.ap(el.ov("secure", true, -2104612770) + "m=dob/set_dob.ws", true, false, (byte)103);
                                          fa.ad(og.kd, og.kw, og.ks, -1059127340);
                                          as.aa(6, (byte)1);
                                          return;
                                       }
                                    }
                                 }
                              }

                              var11 = -710649007 * dq.ax + 180 + 80;
                              if (var6 == 1) {
                                 if (var3 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var26 >= var11 - 75) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var26 <= var11 + 75 && var27 >= var12 - 20) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 <= 20 + var12) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          us.ar(true, -7998461);
                                       }
                                    }
                                 }
                              }
                           } else if (dq.cq * -1064901707 == 33) {
                              if (var3 != 2) {
                                 throw new IllegalStateException();
                              }

                              var11 = -710649007 * dq.ax + 180;
                              var12 = 276;
                              if (var6 == 1) {
                                 if (var3 != 2) {
                                    return;
                                 }

                                 if (var26 >= var11 - 75) {
                                    if (var3 != 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var26 <= var11 + 75) {
                                       if (var3 != 2) {
                                          return;
                                       }

                                       if (var27 >= var12 - 20) {
                                          if (var3 != 2) {
                                             throw new IllegalStateException();
                                          }

                                          if (var27 <= 20 + var12) {
                                             pc.ap(og.my, true, false, (byte)55);
                                          }
                                       }
                                    }
                                 }
                              }

                              var11 = -710649007 * dq.ax + 180;
                              var12 = 326;
                              if (1 == var6 && var26 >= var11 - 75) {
                                 if (var3 != 2) {
                                    return;
                                 }

                                 if (var26 <= 75 + var11 && var27 >= var12 - 20) {
                                    if (var3 != 2) {
                                       return;
                                    }

                                    if (var27 <= var12 + 20) {
                                       if (var3 != 2) {
                                          throw new IllegalStateException();
                                       }

                                       us.ar(true, -7998461);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      } catch (RuntimeException var24) {
         throw tm.aw(var24, "oe.ae(" + ')');
      }
   }
}
