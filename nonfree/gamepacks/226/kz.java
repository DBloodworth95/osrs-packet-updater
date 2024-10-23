import java.util.ArrayList;

public class kz extends lx {
   final int ap;
   final kb aw;
   lp aj;
   int ay;
   int ai;
   int ak;
   public static final int an = 1;
   static int nf;
   static final int bv = 3;
   static final int bi = 2;

   public int as() {
      return this.ak * -1983110681;
   }

   void ap(byte var1) {
      try {
         this.ak = ei.aw(964069103 * this.ap, 888461382).an((byte)62).bx * -1858365395;
         this.aj = this.aw.bz(ar.aw(-1983110681 * this.ak, 1610330659), -382540329);
         hc var2 = ar.aw(this.aw(-2139050153), 1966523701);
         vv var3 = var2.ay(false, -1151133755);
         if (var3 != null) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            this.ai = 632375571 * var3.aw;
            this.ay = 2017508901 * var3.ak;
         } else {
            this.ai = 0;
            this.ay = 0;
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "kz.ap(" + ')');
      }
   }

   lp au() {
      return this.aj;
   }

   lp at() {
      return this.aj;
   }

   int aj(int var1) {
      try {
         return -966137573 * this.ai;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "kz.aj(" + ')');
      }
   }

   int ai(int var1) {
      try {
         return this.ay * 2006396333;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "kz.ai(" + ')');
      }
   }

   void ay() {
      this.ak = ei.aw(964069103 * this.ap, 888461382).an((byte)42).bx * -1858365395;
      this.aj = this.aw.bz(ar.aw(-1983110681 * this.ak, 2106434457), -1583781918);
      hc var1 = ar.aw(this.aw(2058048302), 1980510704);
      vv var2 = var1.ay(false, -1046756185);
      if (var2 != null) {
         this.ai = 632375571 * var2.aw;
         this.ay = 2017508901 * var2.ak;
      } else {
         this.ai = 0;
         this.ay = 0;
      }

   }

   static void gi(int var0) {
      try {
         if (dj.aw == client.ei) {
            if (var0 == 16777215) {
               ir.fu = lu.gu(-1308770465 * oz.ay.al, false, true, true, false, 367182018);
               bc.fa = lu.gu(oz.ae.al * -1308770465, true, true, true, false, 30085277);
               rc.fw = lu.gu(oz.at.al * -1308770465, false, true, true, false, 1039300163);
               aw.fh = lu.gu(oz.an.al * -1308770465, false, true, true, false, 971813640);
               dq.fn = lu.gu(-1308770465 * oz.ar.al, true, false, true, false, 448144941);
               fg.fd = lu.gu(-1308770465 * oz.ab.al, false, true, true, false, 558700023);
               mb.fm = lu.gu(oz.az.al * -1308770465, false, true, true, false, 823904609);
               kv.bj(20, og.ag, -1712679396);
               qr.gq(dj.aj, (byte)-29);
            }
         } else {
            int var15;
            byte var31;
            if (client.ei == dj.aj) {
               if (var0 != 16777215) {
                  throw new IllegalStateException();
               } else {
                  var31 = 0;
                  var15 = var31 + ir.fu.aw(-1637863264) * 53 / 100;
                  var15 += bc.fa.aw(-1624099450) * 5 / 100;
                  var15 += rc.fw.aw(-1915323937) * 36 / 100;
                  var15 += aw.fh.aw(-2051486614) * 1 / 100;
                  var15 += dq.fn.aw(-1678289487) * 1 / 100;
                  var15 += fg.fd.aw(-1632899637) * 3 / 100;
                  var15 += mb.fm.aw(-1732577097) * 1 / 100;
                  if (100 != var15) {
                     if (var0 != 16777215) {
                        throw new IllegalStateException();
                     } else {
                        if (var15 != 0) {
                           if (var0 != 16777215) {
                              throw new IllegalStateException();
                           }

                           kv.bj(30, og.ad + var15 + "%", -1712679396);
                        }

                     }
                  } else {
                     ar.gw(ir.fu, "Sound FX", -834096757);
                     ar.gw(bc.fa, "Music Tracks", -433046856);
                     ar.gw(rc.fw, "Sprites", -1061060807);
                     ar.gw(fg.fd, "Music Samples", -923339768);
                     ar.gw(mb.fm, "Music Patches", -2042297736);
                     kv.bj(40, og.ac, -1712679396);
                     qr.gq(dj.ay, (byte)20);
                  }
               }
            } else {
               int var4;
               if (client.ei == dj.ay) {
                  if (var0 == 16777215) {
                     boolean var33 = !client.cl;
                     du.ai = -1873395006;
                     vi.ay = var33;
                     rd.am = 1411646226;
                     ArrayList var26 = new ArrayList(3);
                     dr.te = jb.ax(client.ap, 0, 2048, 1978096240);
                     ng.ts = new bn();
                     bn var25 = new bn();
                     var25.ap(ng.ts);

                     for(var4 = 0; var4 < 3; ++var4) {
                        if (var0 != 16777215) {
                           throw new IllegalStateException();
                        }

                        mn var24 = new mn(dr.te);
                        var24.ab(9, 128, 2030320918);
                        var25.ap(var24);
                        var26.add(var24);
                     }

                     dr.te.aq(var25, (byte)62);
                     fe.ap(mb.fm, fg.fd, ir.fu, var26, 1084939555);
                     mp.tw = new co(22050, du.ai * -336955471);
                     kv.bj(60, og.av, -1712679396);
                     qr.gq(dj.as, (byte)-21);
                  }
               } else {
                  int var18;
                  if (client.ei == dj.as) {
                     if (var0 != 16777215) {
                        throw new IllegalStateException();
                     } else {
                        if (ac.io == null) {
                           if (var0 != 16777215) {
                              throw new IllegalStateException();
                           }

                           ac.io = new ul(rc.fw, dq.fn);
                        }

                        us[] var32 = new us[]{us.aj, us.ai, us.ap, us.aw, us.ay, us.ak};
                        var18 = var32.length;
                        ul var22 = ac.io;
                        us[] var23 = new us[]{us.aj, us.ai, us.ap, us.aw, us.ay, us.ak};
                        client.if = var22.ap(var23, (short)5572);
                        if (client.if.size() < var18) {
                           if (var0 != 16777215) {
                              throw new IllegalStateException();
                           } else {
                              kv.bj(80, og.ax + client.if.size() * 100 / var18 + "%", -1712679396);
                           }
                        } else {
                           iy.id = (qi)client.if.get(us.ap);
                           et.iq = (qi)client.if.get(us.aw);
                           ox.iv = (qi)client.if.get(us.ak);
                           fu.ve = client.vg.ap(-1456357206);
                           kv.bj(80, og.aq, -1712679396);
                           qr.gq(dj.ae, (byte)4);
                        }
                     }
                  } else if (dj.ae == client.ei) {
                     var15 = ib.ap(aw.fh, rc.fw, -493309570);
                     var18 = ka.aw(rc.fw, (byte)-69);
                     if (var15 < var18) {
                        if (var0 != 16777215) {
                           throw new IllegalStateException();
                        } else {
                           kv.bj(90, og.al + var15 * 100 / var18 + "%", -1712679396);
                        }
                     } else {
                        kv.bj(100, og.aa, -1712679396);
                        if (client.dg) {
                           if (var0 != 16777215) {
                              return;
                           }

                           ea.gv(5, 2027013533);
                           qr.gq(dj.az, (byte)45);
                        } else {
                           qr.gq(dj.ak, (byte)-14);
                        }

                     }
                  } else if (dj.az == client.ei) {
                     if (var0 == 16777215) {
                        ea.gv(10, 2027013533);
                     }
                  } else {
                     or var30;
                     if (client.ei == dj.ak) {
                        if (var0 == 16777215) {
                           if.eo = lu.gu(oz.aw.al * -1308770465, false, true, true, false, -760351102);
                           gr.ee = lu.gu(oz.ak.al * -1308770465, false, true, true, false, 1981478600);
                           cl.ea = lu.gu(-1308770465 * oz.aj.al, true, false, true, false, 634349339);
                           kb.et = lu.gu(oz.ai.al * -1308770465, false, true, true, false, 372348714);
                           he.fo = lu.gu(oz.as.al * -1308770465, true, true, true, false, 245084116);
                           gp.fj = lu.gu(-1308770465 * oz.am.al, false, true, true, false, -1826224645);
                           pa.fp = lu.gu(oz.au.al * -1308770465, false, true, true, false, -183573576);
                           ne.fv = lu.gu(oz.ao.al * -1308770465, false, true, true, false, 467169071);
                           aw.fl = lu.gu(-1308770465 * oz.af.al, false, true, true, false, 1438677780);
                           hk.fr = lu.gu(oz.ag.al * -1308770465, true, true, true, false, -491111933);
                           gl.fc = lu.gu(oz.ad.al * -1308770465, false, true, true, false, 822756044);
                           ex.fg = lu.gu(-1308770465 * oz.ac.al, false, true, true, false, 941576403);
                           ie.fb = lu.gu(oz.av.al * -1308770465, false, true, true, false, 825028776);
                           gd.fe = lu.gu(-1308770465 * oz.ax.al, false, true, true, false, 2064258537);
                           var18 = -1308770465 * oz.aq.al;
                           sl var17 = null;
                           if (null != iq.ao) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              }

                              var17 = new sl(var18, iq.ao, et.ar[var18], 1000000);
                           }

                           var30 = new or(var17, hc.vp, oc.vv, var18, false, true, true, true, true);
                           pn.ft = var30;
                           kv.bj(20, og.ag, -1712679396);
                           qr.gq(dj.ai, (byte)63);
                        }
                     } else if (dj.ai == client.ei) {
                        byte var10001;
                        label632: {
                           var31 = 0;
                           var15 = var31 + if.eo.aw(-1661695932) * 5 / 100;
                           var15 += gr.ee.aw(-2035664159) * 2 / 100;
                           var15 += cl.ea.aw(-2110774040) * 1 / 100;
                           var15 += kb.et.aw(-1729144803) * 1 / 100;
                           var15 += he.fo.aw(-1614319032) * 10 / 100;
                           var15 += gp.fj.aw(-1779424893) * 65 / 100;
                           var15 += pa.fp.aw(-1558102408) * 1 / 100;
                           var15 += ne.fv.aw(-1931194042) * 1 / 100;
                           var15 += aw.fl.aw(-1773675043) * 6 / 100;
                           var15 += ex.fg.aw(-1598194141) * 1 / 100;
                           var15 += gl.fc.aw(-2081546317) * 2 / 100;
                           var15 += ie.fb.aw(-1718712002) * 2 / 100;
                           var15 += gd.fe.aw(-1791637387) * 1 / 100;
                           var15 += pn.ft.aw(-1577070806) * 1 / 100;
                           if (hk.fr.ap(781078990)) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              }

                              if (hk.fr.bi((byte)26)) {
                                 if (var0 != 16777215) {
                                    throw new IllegalStateException();
                                 }

                                 var10001 = 1;
                                 break label632;
                              }
                           }

                           var10001 = 0;
                        }

                        var15 += var10001;
                        if (var15 != 100) {
                           if (var15 != 0) {
                              kv.bj(30, og.ad + var15 + "%", -1712679396);
                           }

                        } else {
                           ar.gw(if.eo, "Animations", -907150858);
                           ar.gw(gr.ee, "Skeletons", -595581893);
                           ar.gw(he.fo, "Maps", -708529301);
                           ar.gw(gp.fj, "Models", 176159922);
                           ar.gw(ne.fv, "Music Jingles", -683847120);
                           ar.gw(ex.fg, "World Map", -2131036295);
                           ar.gw(gl.fc, "World Map Geography", -327459513);
                           ar.gw(ie.fb, "World Map Ground", -1329445642);
                           gf.fx = new tt();
                           gf.fx.ap(hk.fr, (byte)-104);
                           kv.bj(30, og.ac, -1712679396);
                           qr.gq(dj.ap, (byte)38);
                        }
                     } else if (client.ei == dj.ap) {
                        if (var0 != 16777215) {
                           throw new IllegalStateException();
                        } else {
                           hx.jf = client.jv.ap(104, 104, io.vx.bp((byte)-70), -316680284);
                           nq.jn = hx.jf;
                           co.tj = new vv(512, 512);
                           kv.bj(30, og.az, -1712679396);
                           qr.gq(dj.am, (byte)-32);
                        }
                     } else {
                        or var3;
                        if (client.ei == dj.am) {
                           if (var0 != 16777215) {
                              throw new IllegalStateException();
                           } else if (!cl.ea.bi((byte)50)) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              } else {
                                 kv.bj(40, og.ah + cl.ea.ao(331389624) + "%", -1712679396);
                              }
                           } else if (!gd.fe.bi((byte)9)) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              } else {
                                 kv.bj(40, og.ah + (80 + aw.fl.ao(319411552) / 6) + "%", -1712679396);
                              }
                           } else {
                              hi.ap(cl.ea, 2121332038);
                              cg.ap(cl.ea, 258656331);
                              ly.ap(cl.ea, gp.fj, (byte)1);
                              mw.ap(cl.ea, gp.fj, client.cl, -397578660);
                              var30 = cl.ea;
                              or var19 = gp.fj;
                              hy.aw = var30;
                              pw.ak = var19;
                              ac.ap(cl.ea, -374364079);
                              fb.ap(cl.ea, gp.fj, client.cf, iy.id, 1720170461);
                              var3 = cl.ea;
                              or var20 = if.eo;
                              or var21 = gr.ee;
                              uq.ai = var3;
                              id.ay = var20;
                              id.as = var21;
                              or var27 = cl.ea;
                              or var28 = gp.fj;
                              hj.ap = var27;
                              hj.aw = var28;
                              fw.ap(cl.ea, (byte)116);
                              oh.ap(cl.ea, -33460072);
                              qk.ek = new nm(kb.et, gp.fj, rc.fw, dq.fn, pn.ft);
                              or var29 = cl.ea;
                              gq.ap = var29;
                              or var9 = cl.ea;
                              he.ap = var9;
                              bm.ap(cl.ea, -1865596444);
                              dq.ap(cl.ea, (byte)31);
                              or var10 = cl.ea;
                              hh.ap = var10;
                              ne.ap(cl.ea, 1968718707);
                              jd.ap(cl.ea, -1863076827);
                              ad.qr = new ue(lu.cn, 54, lc.cp, cl.ea);
                              cl.qi = new ue(lu.cn, 47, lc.cp, cl.ea);
                              tm.qz = new em();
                              gd.ap(cl.ea, rc.fw, dq.fn, -789872343);
                              or var11 = cl.ea;
                              or var12 = rc.fw;
                              ha.ap = var11;
                              cb.aw = var12;
                              aw.ap(cl.ea, rc.fw, 1856505173);
                              kv.bj(50, og.bh, -1712679396);
                              qr.gq(dj.at, (byte)1);
                           }
                        } else if (dj.at == client.ei) {
                           var15 = 0;
                           if (null == at.ky) {
                              at.ky = tk.aw((pe)rc.fw, (int)(503417565 * gf.fx.ap), 0, (byte)111);
                           } else {
                              ++var15;
                           }

                           if (qv.kh == null) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              }

                              qv.kh = tk.aw((pe)rc.fw, (int)(-1977446041 * gf.fx.aw), 0, (byte)79);
                           } else {
                              ++var15;
                           }

                           vc[] var2;
                           vc[] var6;
                           int var7;
                           vc var8;
                           if (qq.kg == null) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              }

                              var3 = rc.fw;
                              var4 = gf.fx.ak * -1772993219;
                              if (!cb.am(var3, var4, 0, 1265120400)) {
                                 if (var0 != 16777215) {
                                    throw new IllegalStateException();
                                 }

                                 var2 = null;
                              } else {
                                 var6 = new vc[1934102439 * wk.ap];

                                 for(var7 = 0; var7 < wk.ap * 1934102439; ++var7) {
                                    if (var0 != 16777215) {
                                       throw new IllegalStateException();
                                    }

                                    var8 = var6[var7] = new vc();
                                    var8.as = -1147402861 * wk.aw;
                                    var8.ae = wk.ak * -201283629;
                                    var8.ai = wk.aj[var7];
                                    var8.ay = tl.ai[var7];
                                    var8.ak = ae.ay[var7];
                                    var8.aj = wk.as[var7];
                                    var8.aw = wk.ae;
                                    var8.ap = ks.am[var7];
                                 }

                                 wk.aj = null;
                                 tl.ai = null;
                                 ae.ay = null;
                                 wk.as = null;
                                 wk.ae = null;
                                 ks.am = (byte[][])null;
                                 var2 = var6;
                              }

                              qq.kg = var2;
                           } else {
                              ++var15;
                           }

                           if (null == mh.ka) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              }

                              mh.ka = ex.ap(rc.fw, gf.fx.aj * 1949030099, 0, 806885260);
                           } else {
                              ++var15;
                           }

                           if (null == ue.kn) {
                              ue.kn = ex.ap(rc.fw, 1954160561 * gf.fx.ai, 0, 806885260);
                           } else {
                              ++var15;
                           }

                           if (ch.ku == null) {
                              if (var0 != 16777215) {
                                 return;
                              }

                              ch.ku = ex.ap(rc.fw, 186764659 * gf.fx.ay, 0, 806885260);
                           } else {
                              ++var15;
                           }

                           if (fh.kf == null) {
                              if (var0 != 16777215) {
                                 return;
                              }

                              fh.kf = ex.ap(rc.fw, gf.fx.as * -352944179, 0, 806885260);
                           } else {
                              ++var15;
                           }

                           if (null == kd.km) {
                              kd.km = ex.ap(rc.fw, 1654505333 * gf.fx.ae, 0, 806885260);
                           } else {
                              ++var15;
                           }

                           if (ca.ki == null) {
                              ca.ki = ex.ap(rc.fw, -285352093 * gf.fx.am, 0, 806885260);
                           } else {
                              ++var15;
                           }

                           if (ft.kr == null) {
                              var3 = rc.fw;
                              var4 = gf.fx.at * 811617695;
                              if (!cb.am(var3, var4, 0, 1505618875)) {
                                 if (var0 != 16777215) {
                                    return;
                                 }

                                 var2 = null;
                              } else {
                                 var6 = new vc[wk.ap * 1934102439];

                                 for(var7 = 0; var7 < wk.ap * 1934102439; ++var7) {
                                    if (var0 != 16777215) {
                                       throw new IllegalStateException();
                                    }

                                    var8 = var6[var7] = new vc();
                                    var8.as = -1147402861 * wk.aw;
                                    var8.ae = wk.ak * -201283629;
                                    var8.ai = wk.aj[var7];
                                    var8.ay = tl.ai[var7];
                                    var8.ak = ae.ay[var7];
                                    var8.aj = wk.as[var7];
                                    var8.aw = wk.ae;
                                    var8.ap = ks.am[var7];
                                 }

                                 wk.aj = null;
                                 tl.ai = null;
                                 ae.ay = null;
                                 wk.as = null;
                                 wk.ae = null;
                                 ks.am = (byte[][])null;
                                 var2 = var6;
                              }

                              ft.kr = var2;
                           } else {
                              ++var15;
                           }

                           if (null == sf.ko) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              }

                              var3 = rc.fw;
                              var4 = gf.fx.au * -1494415031;
                              if (!cb.am(var3, var4, 0, 1210361065)) {
                                 if (var0 != 16777215) {
                                    throw new IllegalStateException();
                                 }

                                 var2 = null;
                              } else {
                                 var6 = new vc[wk.ap * 1934102439];

                                 for(var7 = 0; var7 < wk.ap * 1934102439; ++var7) {
                                    if (var0 != 16777215) {
                                       return;
                                    }

                                    var8 = var6[var7] = new vc();
                                    var8.as = wk.aw * -1147402861;
                                    var8.ae = -201283629 * wk.ak;
                                    var8.ai = wk.aj[var7];
                                    var8.ay = tl.ai[var7];
                                    var8.ak = ae.ay[var7];
                                    var8.aj = wk.as[var7];
                                    var8.aw = wk.ae;
                                    var8.ap = ks.am[var7];
                                 }

                                 wk.aj = null;
                                 tl.ai = null;
                                 ae.ay = null;
                                 wk.as = null;
                                 wk.ae = null;
                                 ks.am = (byte[][])null;
                                 var2 = var6;
                              }

                              sf.ko = var2;
                           } else {
                              ++var15;
                           }

                           if (var15 < 11) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              } else {
                                 kv.bj(70, og.bj + 100 * var15 / 12 + "%", -1712679396);
                              }
                           } else {
                              qa.au = sf.ko;
                              qv.kh.ai();
                              var18 = (int)(Math.random() * 21.0D) - 10;
                              int var16 = (int)(Math.random() * 21.0D) - 10;
                              var4 = (int)(Math.random() * 21.0D) - 10;
                              int var5 = (int)(Math.random() * 41.0D) - 20;
                              qq.kg[0].aw(var5 + var18, var5 + var16, var4 + var5);
                              kv.bj(60, og.bv, -1712679396);
                              qr.gq(dj.au, (byte)16);
                           }
                        } else if (dj.au == client.ei) {
                           if (var0 != 16777215) {
                              throw new IllegalStateException();
                           } else if (!pa.fp.bi((byte)102)) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              } else {
                                 kv.bj(70, og.bx + "0%", -1712679396);
                              }
                           } else {
                              jk var10000 = new jk;
                              or var10002 = pa.fp;
                              or var10003 = rc.fw;
                              double var10005 = io.vx.ab((byte)-62);
                              short var10006;
                              if (client.cl) {
                                 if (var0 != 16777215) {
                                    return;
                                 }

                                 var10006 = 64;
                              } else {
                                 var10006 = 128;
                              }

                              var10000.<init>(var10002, var10003, 20, var10005, var10006);
                              hp.mw = var10000;
                              jm.aw(hp.mw);
                              jm.ak(io.vx.ab((byte)-52));
                              qr.gq(dj.an, (byte)91);
                           }
                        } else if (client.ei == dj.an) {
                           if (var0 != 16777215) {
                              throw new IllegalStateException();
                           } else {
                              var15 = hp.mw.ap(1526154328);
                              if (var15 < 100) {
                                 if (var0 != 16777215) {
                                    throw new IllegalStateException();
                                 } else {
                                    kv.bj(80, og.bx + var15 + "%", -1712679396);
                                 }
                              } else {
                                 kv.bj(90, og.bk, -1712679396);
                                 qr.gq(dj.ao, (byte)-67);
                              }
                           }
                        } else if (dj.ao == client.ei) {
                           if (var0 != 16777215) {
                              throw new IllegalStateException();
                           } else {
                              rr.db = new dx();
                              client.ap.aj(rr.db, 10, -725588083);
                              kv.bj(92, og.bb, -1712679396);
                              qr.gq(dj.af, (byte)53);
                           }
                        } else if (dj.af == client.ei) {
                           if (var0 != 16777215) {
                              throw new IllegalStateException();
                           } else if (!aw.fh.cy("huffman", "", -1403176653)) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              } else {
                                 kv.bj(94, og.bq + 0 + "%", -1712679396);
                              }
                           } else {
                              nu var14 = new nu(aw.fh.cv("huffman", "", 1197864797));
                              lk.ap(var14, (byte)14);
                              kv.bj(94, og.bp, -1712679396);
                              qr.gq(dj.ar, (byte)87);
                           }
                        } else if (client.ei == dj.ar) {
                           if (var0 != 16777215) {
                              throw new IllegalStateException();
                           } else if (!kb.et.bi((byte)105)) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              } else {
                                 kv.bj(96, og.bz + kb.et.ao(1464910531) * 4 / 5 + "%", -1712679396);
                              }
                           } else if (!pn.ft.bi((byte)127)) {
                              if (var0 == 16777215) {
                                 kv.bj(96, og.bz + pn.ft.ao(-1534108154) * 4 / 5 + "%", -1712679396);
                              }
                           } else if (!aw.fl.bi((byte)62)) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              } else {
                                 kv.bj(96, og.bz + (80 + aw.fl.ao(-2050561688) / 6) + "%", -1712679396);
                              }
                           } else if (!dq.fn.bi((byte)46)) {
                              if (var0 != 16777215) {
                                 throw new IllegalStateException();
                              } else {
                                 kv.bj(96, og.bz + (96 + dq.fn.ao(1597097436) / 50) + "%", -1712679396);
                              }
                           } else {
                              kv.bj(98, og.bc, -1712679396);
                              if (aw.fl.cp("version.dat", "", -637561867)) {
                                 if (var0 != 16777215) {
                                    throw new IllegalStateException();
                                 }

                                 vl var1 = new vl(aw.fl.cv("version.dat", "", 1197864797));
                                 var1.ce(606279205);
                              }

                              qr.gq(dj.ab, (byte)19);
                           }
                        } else if (client.ei == dj.ab) {
                           if (var0 == 16777215) {
                              if (ex.fg.cb(570123671) > 0) {
                                 if (var0 != 16777215) {
                                    throw new IllegalStateException();
                                 }

                                 if (!ex.fg.cu(lc.ap.ay, (short)257)) {
                                    if (var0 != 16777215) {
                                       throw new IllegalStateException();
                                    }

                                    kv.bj(100, og.by + ex.fg.cg(lc.ap.ay, 1956654391) / 10 + "%", -1712679396);
                                    return;
                                 }
                              }

                              if (null == ch.wx) {
                                 if (var0 != 16777215) {
                                    throw new IllegalStateException();
                                 }

                                 ch.wx = new uc();
                                 ch.wx.ap(ex.fg, gl.fc, ie.fb, ox.iv, client.if, qq.kg, 459258047);
                              }

                              kv.bj(100, og.br, -1712679396);
                              if (client.dg) {
                                 if (var0 != 16777215) {
                                    throw new IllegalStateException();
                                 }

                                 qr.gq(dj.ag, (byte)-58);
                              } else {
                                 qr.gq(dj.az, (byte)-77);
                              }

                              client.dh = false;
                           }
                        } else {
                           if (client.ei == dj.ag) {
                              if (var0 != 16777215) {
                                 return;
                              }

                              il.fq = false;
                              ea.gv(20, 2027013533);
                              fz.ol(ch.aa, (byte)-105);
                           }

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "kz.gi(" + ')');
      }
   }

   public int ae() {
      return this.ak * -1983110681;
   }

   lp am() {
      return this.aj;
   }

   public int aw(int var1) {
      try {
         return this.ak * -1983110681;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "kz.aw(" + ')');
      }
   }

   int an() {
      return -966137573 * this.ai;
   }

   kz(nn var1, nn var2, int var3, kb var4) {
      try {
         super(var1, var2);
         this.ap = var3 * 9660431;
         this.aw = var4;
         this.ap((byte)0);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "kz.<init>(" + ')');
      }
   }

   int ao() {
      return this.ay * 2006396333;
   }

   int af() {
      return this.ay * 2006396333;
   }

   lp ak(short var1) {
      try {
         return this.aj;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "kz.ak(" + ')');
      }
   }
}
