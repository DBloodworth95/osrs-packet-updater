import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@nh
public final class mf {
   static final int ca = 11;
   public static final long ae = 86400000L;
   static final HashMap ag = new HashMap();
   static final int oq = 1;
   public static final int ac = 11745;
   public static final int ba = 55;

   public static void ae(ne var0, int var1) {
      try {
         if (!mm.au.contains(var0)) {
            if (var1 == 1648655925) {
               return;
            }

            mm.au.add(var0);
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "mf.ae(" + ')');
      }
   }

   mf() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "mf.<init>(" + ')');
      }
   }

   static {
      TimeZone var0;
      synchronized(ag) {
         TimeZone var2 = (TimeZone)ag.get("Europe/London");
         if (null == var2) {
            var2 = TimeZone.getTimeZone("Europe/London");
            ag.put("Europe/London", var2);
         }

         var0 = var2;
      }

      Calendar.getInstance(var0);
   }

   static void hu(int var0) {
      try {
         if (da.ae == client.ek) {
            cy.fv = dm.hh(1664878975 * oy.aq.aw, false, true, true, false, 2028635179);
            hg.fe = dm.hh(1664878975 * oy.at.aw, true, true, true, false, 2029526808);
            cq.fb = dm.hh(oy.ar.aw * 1664878975, false, true, true, false, 2097662838);
            ip.fp = dm.hh(1664878975 * oy.ad.aw, false, true, true, false, 1988946373);
            ec.fu = dm.hh(1664878975 * oy.ab.aw, true, false, true, false, 1711994765);
            fb.fj = dm.hh(oy.az.aw * 1664878975, false, true, true, false, 1808490972);
            ak.fs = dm.hh(oy.aa.aw * 1664878975, false, true, true, false, 2040482212);
            fm.as(20, ok.ai, (byte)84);
            mx.ht(da.am, 1906690256);
         } else {
            int var25;
            byte var43;
            if (client.ek == da.am) {
               if (var0 == 844691753) {
                  throw new IllegalStateException();
               } else {
                  var43 = 0;
                  var25 = var43 + cy.fv.ae(825679276) * 53 / 100;
                  var25 += hg.fe.ae(825679276) * 5 / 100;
                  var25 += cq.fb.ae(825679276) * 36 / 100;
                  var25 += ip.fp.ae(825679276) * 1 / 100;
                  var25 += ec.fu.ae(825679276) * 1 / 100;
                  var25 += fb.fj.ae(825679276) * 3 / 100;
                  var25 += ak.fs.ae(825679276) * 1 / 100;
                  if (100 != var25) {
                     if (var0 == 844691753) {
                        throw new IllegalStateException();
                     } else {
                        if (var25 != 0) {
                           if (var0 == 844691753) {
                              return;
                           }

                           fm.as(30, ok.ao + var25 + "%", (byte)-53);
                        }

                     }
                  } else {
                     ns.hm(cy.fv, "Sound FX", (byte)-72);
                     ns.hm(hg.fe, "Music Tracks", (byte)-13);
                     ns.hm(cq.fb, "Sprites", (byte)56);
                     ns.hm(fb.fj, "Music Samples", (byte)-18);
                     ns.hm(ak.fs, "Music Patches", (byte)63);
                     fm.as(40, ok.as, (byte)-15);
                     mx.ht(da.aq, 1791739134);
                  }
               }
            } else {
               int var34;
               if (da.aq == client.ek) {
                  if (var0 == 844691753) {
                     throw new IllegalStateException();
                  } else {
                     boolean var46;
                     if (!client.ci) {
                        if (var0 == 844691753) {
                           throw new IllegalStateException();
                        }

                        var46 = true;
                     } else {
                        var46 = false;
                     }

                     gf.as(22050, var46, 2, 1217335396);
                     ArrayList var45 = new ArrayList(3);
                     ir var29 = ba.ac;
                     short var38 = 2048;
                     if (0 == -1578400357 * bz.ax) {
                        if (var0 != 844691753) {
                           throw new IllegalStateException();
                        }
                     } else {
                        if (var38 < 256) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           }

                           var38 = 256;
                        }

                        bz var35;
                        try {
                           bz var37 = bz.ah.ac(-1996119587);
                           byte var47;
                           if (bz.aq) {
                              if (var0 == 844691753) {
                                 throw new IllegalStateException();
                              }

                              var47 = 2;
                           } else {
                              var47 = 1;
                           }

                           var37.ap = new int[256 * var47];
                           var37.ao = 843626729 * var38;
                           var37.ac(553204875);
                           var37.ai = (1024 + (var38 & -1024)) * -1296823899;
                           if (var37.ai * -346835411 > 16384) {
                              if (var0 == 844691753) {
                                 return;
                              }

                              var37.ai = 40452096;
                           }

                           var37.ae(var37.ai * -346835411, -210498075);
                           if (wc.au * -541487827 > 0 && null == ru.ar) {
                              if (var0 == 844691753) {
                                 return;
                              }

                              ru.ar = new br();
                              bz.at = Executors.newScheduledThreadPool(1);
                              bz.at.scheduleAtFixedRate(ru.ar, 0L, 10L, TimeUnit.MILLISECONDS);
                           }

                           if (ru.ar != null) {
                              if (var0 == 844691753) {
                                 return;
                              }

                              if (ru.ar.ac[0] != null) {
                                 if (var0 == 844691753) {
                                    return;
                                 }

                                 throw new IllegalArgumentException();
                              }

                              ru.ar.ac[0] = var37;
                           }

                           var35 = var37;
                        } catch (Throwable var22) {
                           var35 = new bz();
                        }

                        eg.ts = var35;
                        ba.tr = new bb();
                        bb var39 = new bb();
                        var39.ac(ba.tr);

                        for(var34 = 0; var34 < 3; ++var34) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           }

                           ms var41 = new ms(eg.ts);
                           var41.az(9, 128, -1708391853);
                           var39.ac(var41);
                           var45.add(var41);
                        }

                        eg.ts.ay(var39, -486249466);
                        ow.ac(ak.fs, fb.fj, cy.fv, var45, -1382538174);
                        av.ty = new cj(22050, -1578400357 * bz.ax);
                        fm.as(60, ok.ay, (byte)18);
                        mx.ht(da.af, 2078729340);
                     }
                  }
               } else {
                  int var28;
                  if (da.af == client.ek) {
                     if (var0 == 844691753) {
                        throw new IllegalStateException();
                     } else {
                        if (null == oi.il) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           }

                           oi.il = new tc(cq.fb, ec.fu);
                        }

                        tw[] var44 = new tw[]{tw.ac, tw.ae, tw.am, tw.ax, tw.aq, tw.ag};
                        var28 = var44.length;
                        tc var27 = oi.il;
                        tw[] var36 = new tw[]{tw.ac, tw.ae, tw.am, tw.ax, tw.aq, tw.ag};
                        client.ik = var27.ac(var36, (byte)1);
                        if (client.ik.size() < var28) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           } else {
                              fm.as(80, ok.aj + client.ik.size() * 100 / var28 + "%", (byte)93);
                           }
                        } else {
                           gz.iw = (qu)client.ik.get(tw.ac);
                           eq.iv = (qu)client.ik.get(tw.ae);
                           bw.io = (qu)client.ik.get(tw.ag);
                           kd.vw = client.vo.ac(-1592150599);
                           fm.as(80, ok.av, (byte)-14);
                           mx.ht(da.at, 2142679506);
                        }
                     }
                  } else {
                     of var3;
                     int var4;
                     int var5;
                     of var30;
                     if (client.ek == da.at) {
                        if (var0 == 844691753) {
                           throw new IllegalStateException();
                        } else {
                           var30 = ip.fp;
                           var3 = cq.fb;
                           var4 = 0;
                           String[] var33 = dp.dz;

                           String var40;
                           for(var34 = 0; var34 < var33.length; ++var34) {
                              if (var0 == 844691753) {
                                 throw new IllegalStateException();
                              }

                              var40 = var33[var34];
                              if (var30.cz(var40, "", 108388502)) {
                                 if (var0 == 844691753) {
                                    throw new IllegalStateException();
                                 }

                                 ++var4;
                              }
                           }

                           var33 = dp.dg;

                           for(var34 = 0; var34 < var33.length; ++var34) {
                              if (var0 == 844691753) {
                                 throw new IllegalStateException();
                              }

                              var40 = var33[var34];
                              if (var3.cz(var40, "", -934965141)) {
                                 ++var4;
                              }
                           }

                           var33 = dp.dr;

                           for(var34 = 0; var34 < var33.length; ++var34) {
                              if (var0 == 844691753) {
                                 return;
                              }

                              var40 = var33[var34];
                              if (var3.cg(var40, (short)-1784) != -1) {
                                 if (var0 == 844691753) {
                                    return;
                                 }

                                 if (var3.cz(var40, "", -485699758)) {
                                    if (var0 == 844691753) {
                                       throw new IllegalStateException();
                                    }

                                    ++var4;
                                 }
                              }
                           }

                           var5 = bj.ac(cq.fb, 663894630);
                           if (var4 < var5) {
                              if (var0 == 844691753) {
                                 throw new IllegalStateException();
                              } else {
                                 fm.as(90, ok.aw + var4 * 100 / var5 + "%", (byte)-6);
                              }
                           } else {
                              fm.as(100, ok.an, (byte)-77);
                              if (sz.db) {
                                 if (var0 == 844691753) {
                                    throw new IllegalStateException();
                                 }

                                 ry.hp(5, 1168340381);
                                 mx.ht(da.aa, 1834533419);
                              } else {
                                 mx.ht(da.ag, 1758846489);
                              }

                           }
                        }
                     } else if (client.ek == da.aa) {
                        ry.hp(10, 1481143961);
                     } else if (da.ag == client.ek) {
                        if (var0 == 844691753) {
                           throw new IllegalStateException();
                        } else {
                           ak.eq = dm.hh(oy.ae.aw * 1664878975, false, true, true, false, 1910279262);
                           jc.ej = dm.hh(oy.ag.aw * 1664878975, false, true, true, false, 2111727129);
                           ch.ec = dm.hh(oy.am.aw * 1664878975, true, false, true, false, 1936326022);
                           mk.et = dm.hh(1664878975 * oy.ax.aw, false, true, true, false, 1960915222);
                           qy.ff = dm.hh(oy.af.aw * 1664878975, true, true, true, false, 1699107041);
                           nu.ft = dm.hh(1664878975 * oy.au.aw, false, true, true, false, 1495730328);
                           dr.fk = dm.hh(oy.al.aw * 1664878975, false, true, true, false, 1817905643);
                           nc.fr = dm.hh(oy.ah.aw * 1664878975, false, true, true, false, 2115446153);
                           hi.fg = dm.hh(oy.ap.aw * 1664878975, false, true, true, false, 1468901603);
                           cg.fo = dm.hh(1664878975 * oy.ai.aw, true, true, true, false, 1464180114);
                           dp.fn = dm.hh(1664878975 * oy.ao.aw, false, true, true, false, 1657550486);
                           nv.fq = dm.hh(1664878975 * oy.as.aw, false, true, true, false, 1489277492);
                           ry.fh = dm.hh(oy.ay.aw * 1664878975, false, true, true, false, 1506496030);
                           ga.fw = dm.hh(oy.aj.aw * 1664878975, false, true, true, false, 1786749268);
                           eq.fd = oe.hv(oy.av.aw * 1664878975, false, true, true, true, true, 1918811219);
                           fm.as(20, ok.ai, (byte)-12);
                           mx.ht(da.ax, 1957291636);
                        }
                     } else if (da.ax == client.ek) {
                        if (var0 != 844691753) {
                           byte var10001;
                           label586: {
                              var43 = 0;
                              var25 = var43 + ak.eq.ae(825679276) * 5 / 100;
                              var25 += jc.ej.ae(825679276) * 2 / 100;
                              var25 += ch.ec.ae(825679276) * 1 / 100;
                              var25 += mk.et.ae(825679276) * 1 / 100;
                              var25 += qy.ff.ae(825679276) * 10 / 100;
                              var25 += nu.ft.ae(825679276) * 65 / 100;
                              var25 += dr.fk.ae(825679276) * 1 / 100;
                              var25 += nc.fr.ae(825679276) * 1 / 100;
                              var25 += hi.fg.ae(825679276) * 6 / 100;
                              var25 += nv.fq.ae(825679276) * 1 / 100;
                              var25 += dp.fn.ae(825679276) * 2 / 100;
                              var25 += ry.fh.ae(825679276) * 2 / 100;
                              var25 += ga.fw.ae(825679276) * 1 / 100;
                              var25 += eq.fd.ae(825679276) * 1 / 100;
                              if (cg.fo.ac((byte)0)) {
                                 if (var0 == 844691753) {
                                    return;
                                 }

                                 if (cg.fo.cn(2106376019)) {
                                    if (var0 == 844691753) {
                                       return;
                                    }

                                    var10001 = 1;
                                    break label586;
                                 }
                              }

                              var10001 = 0;
                           }

                           var25 += var10001;
                           if (100 != var25) {
                              if (var0 == 844691753) {
                                 throw new IllegalStateException();
                              } else {
                                 if (var25 != 0) {
                                    if (var0 == 844691753) {
                                       throw new IllegalStateException();
                                    }

                                    fm.as(30, ok.ao + var25 + "%", (byte)86);
                                 }

                              }
                           } else {
                              ns.hm(ak.eq, "Animations", (byte)43);
                              ns.hm(jc.ej, "Skeletons", (byte)116);
                              ns.hm(qy.ff, "Maps", (byte)24);
                              ns.hm(nu.ft, "Models", (byte)-76);
                              ns.hm(nc.fr, "Music Jingles", (byte)-2);
                              ns.hm(nv.fq, "World Map", (byte)53);
                              ns.hm(dp.fn, "World Map Geography", (byte)66);
                              ns.hm(ry.fh, "World Map Ground", (byte)-23);
                              fl.fc = new sn();
                              fl.fc.ac(cg.fo, 1177389662);
                              fm.as(30, ok.as, (byte)0);
                              mx.ht(da.ac, 2114855857);
                           }
                        }
                     } else if (da.ac == client.ek) {
                        du.js = client.ju.ac(104, 104, re.vt.ba((byte)10), 766479740);
                        gs.jj = du.js;
                        db.tj = new vv(512, 512);
                        fm.as(30, ok.aa, (byte)-5);
                        mx.ht(da.au, 2088305508);
                     } else if (da.au == client.ek) {
                        if (var0 == 844691753) {
                           throw new IllegalStateException();
                        } else if (!ch.ec.cn(-551413440)) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           } else {
                              fm.as(40, ok.ak + ch.ec.ah(1712367457) + "%", (byte)-12);
                           }
                        } else if (!ga.fw.cn(1860567305)) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           } else {
                              fm.as(40, ok.ak + (80 + hi.fg.ah(1712367457) / 6) + "%", (byte)76);
                           }
                        } else {
                           of var42 = ch.ec;
                           ia.ac = var42;
                           hr.ac(ch.ec, 438379091);
                           var30 = ch.ec;
                           var3 = nu.ft;
                           hr.ac = var30;
                           hr.ae = var3;
                           hr.ag = hr.ac.cj(3, (byte)79) * 95173751;
                           fl.ac(ch.ec, nu.ft, client.ci, (short)24475);
                           of var31 = ch.ec;
                           of var32 = nu.ft;
                           hn.ae = var31;
                           hn.ag = var32;
                           of var6 = ch.ec;
                           ho.ac = var6;
                           of var7 = ch.ec;
                           of var8 = nu.ft;
                           boolean var9 = client.cx;
                           qu var10 = gz.iw;
                           nw.af = var7;
                           is.at = var8;
                           hw.au = var9;
                           gj.ar = nw.af.cj(10, (byte)92) * -1140259141;
                           nt.ap = var10;
                           kl.ac(ch.ec, ak.eq, jc.ej, (byte)61);
                           hg.ac(ch.ec, nu.ft, 227743359);
                           he.ac(ch.ec, -2102809336);
                           tm.ac(ch.ec, (byte)75);
                           ir.ep = new na(mk.et, nu.ft, cq.fb, ec.fu, eq.fd);
                           of var11 = ch.ec;
                           gi.ac = var11;
                           of var12 = ch.ec;
                           hd.ac = var12;
                           il.ac(ch.ec, -1172895408);
                           of var13 = ch.ec;
                           ly.ac(ch.ec, 1919190771);
                           of var14 = ch.ec;
                           un.ac = var14;
                           of var15 = ch.ec;
                           uj.ac = var15;
                           cl.qg = new uf(mw.cm, 54, dn.cy, ch.ec);
                           cq.qu = new uf(mw.cm, 47, dn.cy, ch.ec);
                           iu.qz = new ei();
                           dx.ac(ch.ec, cq.fb, ec.fu, 1642724731);
                           of var16 = ch.ec;
                           of var17 = cq.fb;
                           hk.ac = var16;
                           hk.ae = var17;
                           of var18 = ch.ec;
                           of var19 = cq.fb;
                           fq.ac = var19;
                           if (!var18.cn(1961285468)) {
                              if (var0 == 844691753) {
                                 return;
                              }
                           } else {
                              rp.ag = var18.cj(35, (byte)60) * 1034963965;
                              hf.ae = new hf[-566466219 * rp.ag];

                              for(int var20 = 0; var20 < rp.ag * -566466219; ++var20) {
                                 if (var0 == 844691753) {
                                    throw new IllegalStateException();
                                 }

                                 byte[] var21 = var18.bt(35, var20, (byte)50);
                                 hf.ae[var20] = new hf(var20);
                                 if (var21 != null) {
                                    if (var0 == 844691753) {
                                       throw new IllegalStateException();
                                    }

                                    hf.ae[var20].ae(new vf(var21), -481475058);
                                    hf.ae[var20].am(505668555);
                                 }
                              }
                           }

                           fm.as(50, ok.bn, (byte)-109);
                           mx.ht(da.ar, 1809080649);
                        }
                     } else if (client.ek == da.ar) {
                        var25 = 0;
                        if (null == ek.kr) {
                           if (var0 == 844691753) {
                              return;
                           }

                           ek.kr = se.ag(cq.fb, fl.fc.ac * 1983818083, 0, -605515595);
                        } else {
                           ++var25;
                        }

                        if (null == go.km) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           }

                           go.km = se.ag(cq.fb, fl.fc.ae * -1599649279, 0, -605515595);
                        } else {
                           ++var25;
                        }

                        vt[] var2;
                        if (ke.kj == null) {
                           if (var0 == 844691753) {
                              return;
                           }

                           var3 = cq.fb;
                           var4 = fl.fc.ag * 906048063;
                           if (!tb.au(var3, var4, 0, (short)180)) {
                              if (var0 == 844691753) {
                                 return;
                              }

                              var2 = null;
                           } else {
                              var2 = ew.af(-1474620512);
                           }

                           ke.kj = var2;
                        } else {
                           ++var25;
                        }

                        if (null == ul.ku) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           }

                           ul.ku = ec.ae(cq.fb, fl.fc.am * -853870695, 0, -558925023);
                        } else {
                           ++var25;
                        }

                        if (null == ee.kn) {
                           if (var0 == 844691753) {
                              return;
                           }

                           ee.kn = ec.ae(cq.fb, fl.fc.ax * 1304017327, 0, 1257863534);
                        } else {
                           ++var25;
                        }

                        if (null == lm.kg) {
                           if (var0 == 844691753) {
                              return;
                           }

                           lm.kg = ec.ae(cq.fb, fl.fc.aq * -322214647, 0, -1894699375);
                        } else {
                           ++var25;
                        }

                        if (null == gb.kc) {
                           gb.kc = ec.ae(cq.fb, fl.fc.af * -1250002863, 0, -426362378);
                        } else {
                           ++var25;
                        }

                        if (null == kv.ki) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           }

                           kv.ki = ec.ae(cq.fb, 95516609 * fl.fc.at, 0, -415374870);
                        } else {
                           ++var25;
                        }

                        if (null == fk.kp) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           }

                           fk.kp = ec.ae(cq.fb, fl.fc.au * -489611797, 0, 1336116277);
                        } else {
                           ++var25;
                        }

                        if (il.kh == null) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           }

                           var3 = cq.fb;
                           var4 = -1078464317 * fl.fc.ar;
                           if (!tb.au(var3, var4, 0, (short)180)) {
                              if (var0 == 844691753) {
                                 throw new IllegalStateException();
                              }

                              var2 = null;
                           } else {
                              var2 = ew.af(-1994389116);
                           }

                           il.kh = var2;
                        } else {
                           ++var25;
                        }

                        if (null == pc.kd) {
                           var3 = cq.fb;
                           var4 = fl.fc.al * 1457705109;
                           if (!tb.au(var3, var4, 0, (short)180)) {
                              if (var0 == 844691753) {
                                 throw new IllegalStateException();
                              }

                              var2 = null;
                           } else {
                              var2 = ew.af(-1352256670);
                           }

                           pc.kd = var2;
                        } else {
                           ++var25;
                        }

                        if (var25 < 11) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           } else {
                              fm.as(70, ok.bh + 100 * var25 / 12 + "%", (byte)-38);
                           }
                        } else {
                           qk.al = pc.kd;
                           go.km.ax();
                           var28 = (int)(Math.random() * 21.0D) - 10;
                           int var26 = (int)(Math.random() * 21.0D) - 10;
                           var4 = (int)(Math.random() * 21.0D) - 10;
                           var5 = (int)(Math.random() * 41.0D) - 20;
                           ke.kj[0].ae(var28 + var5, var26 + var5, var4 + var5);
                           fm.as(60, ok.bd, (byte)-6);
                           mx.ht(da.al, 2137936975);
                        }
                     } else if (client.ek == da.al) {
                        if (var0 == 844691753) {
                           throw new IllegalStateException();
                        } else if (!dr.fk.cn(173716482)) {
                           fm.as(70, ok.bx + "0%", (byte)-59);
                        } else {
                           jq var10000 = new jq;
                           of var10002 = dr.fk;
                           of var10003 = cq.fb;
                           double var10005 = re.vt.aa(1940605885);
                           short var10006;
                           if (client.ci) {
                              if (var0 == 844691753) {
                                 throw new IllegalStateException();
                              }

                              var10006 = 64;
                           } else {
                              var10006 = 128;
                           }

                           var10000.<init>(var10002, var10003, 20, var10005, var10006);
                           ce.mj = var10000;
                           jw.ae(ce.mj);
                           jw.ag(re.vt.aa(1940605885));
                           mx.ht(da.ad, 2087474042);
                        }
                     } else if (da.ad == client.ek) {
                        if (var0 != 844691753) {
                           var25 = ce.mj.ac(221996999);
                           if (var25 < 100) {
                              if (var0 == 844691753) {
                                 throw new IllegalStateException();
                              } else {
                                 fm.as(80, ok.bx + var25 + "%", (byte)-81);
                              }
                           } else {
                              fm.as(90, ok.bf, (byte)-25);
                              mx.ht(da.ah, 2114001797);
                           }
                        }
                     } else if (client.ek == da.ah) {
                        if (var0 == 844691753) {
                           throw new IllegalStateException();
                        } else {
                           dn.dq = new dh();
                           client.ac.am(dn.dq, 10, -420069836);
                           fm.as(92, ok.bm, (byte)-55);
                           mx.ht(da.ap, 1783647714);
                        }
                     } else if (da.ap == client.ek) {
                        if (var0 == 844691753) {
                           throw new IllegalStateException();
                        } else if (!ip.fp.cz("huffman", "", -891106014)) {
                           fm.as(94, ok.bs + 0 + "%", (byte)-9);
                        } else {
                           oc var24 = new oc(ip.fp.cc("huffman", "", -164224592));
                           ra.ac(var24, (byte)0);
                           fm.as(94, ok.bw, (byte)7);
                           mx.ht(da.ab, 1771398045);
                        }
                     } else if (client.ek == da.ab) {
                        if (var0 != 844691753) {
                           if (!mk.et.cn(811536581)) {
                              fm.as(96, ok.ba + mk.et.ah(1712367457) * 4 / 5 + "%", (byte)20);
                           } else if (!eq.fd.cn(1429366275)) {
                              if (var0 == 844691753) {
                                 throw new IllegalStateException();
                              } else {
                                 fm.as(96, ok.ba + eq.fd.ah(1712367457) * 4 / 5 + "%", (byte)28);
                              }
                           } else if (!hi.fg.cn(1717803195)) {
                              if (var0 == 844691753) {
                                 throw new IllegalStateException();
                              } else {
                                 fm.as(96, ok.ba + (80 + hi.fg.ah(1712367457) / 6) + "%", (byte)-29);
                              }
                           } else if (!ec.fu.cn(595735179)) {
                              if (var0 == 844691753) {
                                 throw new IllegalStateException();
                              } else {
                                 fm.as(96, ok.ba + (96 + ec.fu.ah(1712367457) / 50) + "%", (byte)1);
                              }
                           } else {
                              fm.as(98, ok.bj, (byte)-75);
                              if (hi.fg.cq("version.dat", "", 906306002)) {
                                 vf var1 = new vf(hi.fg.cc("version.dat", "", -164224592));
                                 var1.ct(-2053754911);
                              }

                              mx.ht(da.az, 1939658100);
                           }
                        }
                     } else if (client.ek == da.az) {
                        if (nv.fq.cx(1546240869) > 0) {
                           if (var0 == 844691753) {
                              return;
                           }

                           if (!nv.fq.cw(lg.ac.aq, (byte)0)) {
                              if (var0 == 844691753) {
                                 return;
                              }

                              fm.as(100, ok.bp + nv.fq.cl(lg.ac.aq, (byte)0) / 10 + "%", (byte)-79);
                              return;
                           }
                        }

                        if (ey.wv == null) {
                           if (var0 == 844691753) {
                              return;
                           }

                           ey.wv = new tu();
                           ey.wv.ac(nv.fq, dp.fn, ry.fh, bw.io, client.ik, ke.kj, (byte)-12);
                        }

                        fm.as(100, ok.by, (byte)39);
                        if (sz.db) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           }

                           mx.ht(da.ai, 1771342186);
                        } else {
                           mx.ht(da.aa, 1742017111);
                        }

                        client.dl = false;
                     } else {
                        if (client.ek == da.ai) {
                           if (var0 == 844691753) {
                              throw new IllegalStateException();
                           }

                           br.fm = false;
                           ry.hp(20, 2112263182);
                           gu.pg(cw.an, -2021507668);
                        }

                     }
                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw vk.ae(var23, "mf.hu(" + ')');
      }
   }

   static final void nt(ny var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         if (client.kt) {
            client.kk = 610530336;
         } else {
            client.kk = 0;
         }

         int var8;
         label146: {
            client.kt = false;
            if (1 != -440323227 * bj.ar) {
               if (ei.ev || bj.ar * -440323227 != 4) {
                  break label146;
               }

               if (var7 <= 44) {
                  throw new IllegalStateException();
               }
            }

            if (var5 >= var1 && var5 < var1 + 16) {
               if (var7 <= 44) {
                  throw new IllegalStateException();
               }

               if (var6 >= var2) {
                  if (var7 <= 44) {
                     return;
                  }

                  if (var6 < 16 + var2) {
                     if (var7 <= 44) {
                        throw new IllegalStateException();
                     }

                     var0.be -= -797745132;
                     dc.ni(var0, 667850230);
                     break label146;
                  }
               }
            }

            if (var5 >= var1) {
               if (var7 <= 44) {
                  throw new IllegalStateException();
               }

               if (var5 < var1 + 16) {
                  if (var7 <= 44) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= var2 + var3 - 16) {
                     if (var7 <= 44) {
                        throw new IllegalStateException();
                     }

                     if (var6 < var2 + var3) {
                        if (var7 <= 44) {
                           throw new IllegalStateException();
                        }

                        var0.be += -797745132;
                        dc.ni(var0, 667850230);
                        break label146;
                     }
                  }
               }
            }

            if (var5 >= var1 - client.kk * 1914864737 && var5 < var1 + 16 + client.kk * 1914864737) {
               if (var7 <= 44) {
                  throw new IllegalStateException();
               }

               if (var6 >= 16 + var2) {
                  if (var7 <= 44) {
                     throw new IllegalStateException();
                  }

                  if (var6 < var2 + var3 - 16) {
                     if (var7 <= 44) {
                        return;
                     }

                     var8 = (var3 - 32) * var3 / var4;
                     if (var8 < 8) {
                        var8 = 8;
                     }

                     int var9 = var6 - var2 - 16 - var8 / 2;
                     int var10 = var3 - 32 - var8;
                     var0.be = var9 * (var4 - var3) / var10 * 874305541;
                     dc.ni(var0, 667850230);
                     client.kt = true;
                  }
               }
            }
         }

         if (0 != 581621369 * client.qe) {
            if (var7 <= 44) {
               throw new IllegalStateException();
            }

            var8 = -1339552805 * var0.bu;
            if (var5 >= var1 - var8) {
               if (var7 <= 44) {
                  return;
               }

               if (var6 >= var2) {
                  if (var7 <= 44) {
                     return;
                  }

                  if (var5 < var1 + 16) {
                     if (var7 <= 44) {
                        throw new IllegalStateException();
                     }

                     if (var6 <= var3 + var2) {
                        var0.be += client.qe * -1762346919;
                        dc.ni(var0, 667850230);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var11) {
         throw vk.ae(var11, "mf.nt(" + ')');
      }
   }
}
