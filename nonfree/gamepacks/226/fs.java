import java.util.Iterator;

public class fs {
   static final byte bh = 127;
   public int aw;
   public wx ak;
   public static final int aj = 2;
   public byte ap;

   fs() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "fs.<init>(" + ')');
      }
   }

   static final void ji(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         var5 = qt.jt(var5, var6, (byte)22);
         int var8 = 2048 - var3 & 2047;
         int var9 = 2048 - var4 & 2047;
         int var10 = 0;
         int var11 = 0;
         int var12 = var5;
         int var13;
         int var14;
         int var15;
         if (0 != var8) {
            var13 = jm.aj[var8];
            var14 = jm.ai[var8];
            var15 = var14 * var11 - var5 * var13 >> 16;
            var12 = var13 * var11 + var14 * var5 >> 16;
            var11 = var15;
         }

         if (var9 != 0) {
            if (var7 == -158156887) {
               throw new IllegalStateException();
            }

            var13 = jm.aj[var9];
            var14 = jm.ai[var9];
            var15 = var12 * var13 + var10 * var14 >> 16;
            var12 = var12 * var14 - var13 * var10 >> 16;
            var10 = var15;
         }

         if (client.to) {
            if (var7 == -158156887) {
               throw new IllegalStateException();
            }

            ee.uu = (var0 - var10) * 1906421959;
            at.ur = -388509759 * (var1 - var11);
            rr.uh = (var2 - var12) * -243081581;
            di.uj = var3 * -1230587839;
            pc.un = -1045984521 * var4;
         } else {
            ad.kw = -2128937647 * (var0 - var10);
            in.ks = (var1 - var11) * 801770983;
            oo.kv = -2068675377 * (var2 - var12);
            mj.kz = 1819843435 * var3;
            pg.kc = -583425379 * var4;
         }

         if (-870579019 * client.lh == 1) {
            if (var7 == -158156887) {
               throw new IllegalStateException();
            }

            if (1797447449 * client.pw >= 2) {
               if (var7 == -158156887) {
                  throw new IllegalStateException();
               }

               if (-330508271 * client.dt % 50 == 0) {
                  if (var7 == -158156887) {
                     throw new IllegalStateException();
                  }

                  if (-1076386691 * sl.lg >> 7 == -1517174943 * nw.mc.bk >> 7) {
                     if (var7 == -158156887) {
                        throw new IllegalStateException();
                     }

                     if (669935203 * nw.mc.bb >> 7 == 683212995 * ly.ls >> 7) {
                        return;
                     }

                     if (var7 == -158156887) {
                        throw new IllegalStateException();
                     }
                  }

                  var13 = 901808959 * nw.mc.al;
                  var14 = (sl.lg * -1076386691 >> 7) + hx.jf.as * -2014668603;
                  var15 = (ly.ls * 683212995 >> 7) + 1601580509 * hx.jf.ae;
                  me var16 = ef.ap(mm.dx, client.in.ai, (byte)80);
                  var16.ak.db(var13, (byte)-109);
                  var16.ak.ep(client.lt * -1033247015, 665584655);
                  var16.ak.dz(var15, -649654676);
                  var16.ak.dz(var14, -497590412);
                  client.in.ak(var16, (short)486);
               }
            }
         }

      } catch (RuntimeException var17) {
         throw tm.aw(var17, "fs.ji(" + ')');
      }
   }

   static int ba(int var0, da var1, boolean var2, int var3) {
      try {
         int var10001;
         if (var0 == 6754) {
            if (var3 != -283615403) {
               throw new IllegalStateException();
            } else {
               int var7 = cm.ae[(dp.am -= -1450976103) * -158156887];
               hy var8 = sd.ap(var7, -1655158979);
               String[] var9 = cm.at;
               var10001 = (ih.au += 746573637) * -114988147 - 1;
               String var10;
               if (null != var8) {
                  if (var3 != -283615403) {
                     throw new IllegalStateException();
                  }

                  var10 = var8.as;
               } else {
                  var10 = "";
               }

               var9[var10001] = var10;
               return 1;
            }
         } else {
            hy var4;
            if (6764 == var0) {
               if (var3 != -283615403) {
                  throw new IllegalStateException();
               } else {
                  dp.am -= 1393015090;
                  var4 = sd.ap(cm.ae[-158156887 * dp.am], 782637683);
                  int var5 = cm.ae[dp.am * -158156887 + 1];
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.ar(var5, 1339276061);
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.az(var5, (byte)6);
                  return 1;
               }
            } else if (var0 == 6765) {
               if (var3 != -283615403) {
                  throw new IllegalStateException();
               } else {
                  var4 = sd.ap(cm.ae[(dp.am -= -1450976103) * -158156887], -1089094324);
                  int[] var10000 = cm.ae;
                  var10001 = (dp.am += -1450976103) * -158156887 - 1;
                  int var10002;
                  if (null != var4) {
                     if (var3 != -283615403) {
                        throw new IllegalStateException();
                     }

                     var10002 = var4.bb * -1201504359;
                  } else {
                     var10002 = 0;
                  }

                  var10000[var10001] = var10002;
                  return 1;
               }
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "fs.ba(" + ')');
      }
   }

   public static int ap(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         int var3 = 0;

         for(int var4 = 0; var4 < var2; ++var4) {
            if (var1 <= -2011146207) {
               throw new IllegalStateException();
            }

            char var5 = var0.charAt(var4);
            if (var5 <= 127) {
               if (var1 <= -2011146207) {
                  throw new IllegalStateException();
               }

               ++var3;
            } else if (var5 <= 2047) {
               if (var1 <= -2011146207) {
                  throw new IllegalStateException();
               }

               var3 += 2;
            } else {
               var3 += 3;
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "fs.ap(" + ')');
      }
   }

   static final void iv(int var0, int var1, int var2, int var3, byte var4) {
      try {
         client.mf += 1562354665;
         hx.jf.aw.ak = client.dt * -330508271;
         if (client.sa * 1767526859 == nw.mc.bk * -1517174943 >> 7) {
            if (var4 >= 2) {
               return;
            }

            if (669935203 * nw.mc.bb >> 7 == client.tt * -1693485265) {
               if (var4 >= 2) {
                  throw new IllegalStateException();
               }

               client.sa = 0;
            }
         }

         dn var5 = hx.jf;
         int var6 = nt.lx(614997679);
         int var9;
         int var10;
         int var13;
         int var14;
         int var15;
         if (hx.jf == var5) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            if (var6 >= 0 && 60 == client.ng.ai[var6]) {
               if (var4 >= 2) {
                  throw new IllegalStateException();
               }

               int var7 = 128 * client.ng.ay[var6];
               boolean var8 = true;
               var9 = Math.max(384, 2000 - client.vl * -882582342);
               var10 = bz.mx.ap((byte)115);
               double var11 = (double)kd.ak(var7, 314070210) / 65536.0D;
               var13 = var10 - (int)(var11 * (double)var9);
               var14 = bz.mx.aw(-1113981979) - (int)(rn.aj(var7, -1467308353) * (double)var9);
               var15 = cu.jl(var5, bz.mx.ap((byte)60), bz.mx.aw(-1095335935), bz.mx.ak((byte)-67), -779851187);
               var5.aw.ar(86027145 * var5.aj, var13, var14, var15, 60, kf.me, var7, 0L, false);
            }
         }

         sg.il(hx.jf, (byte)45);
         dn var26 = hx.jf;
         if (client.nk * 1564407135 >= 0) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            if (null != var26.an[client.nk * 1564407135]) {
               if (var4 >= 2) {
                  throw new IllegalStateException();
               }

               sk.it(var26, client.nk * 1564407135, false, (short)227);
            }
         }

         ll.iz(hx.jf, true, (byte)-86);
         bd.iy(hx.jf, (byte)7);
         ll.iz(hx.jf, false, (byte)-31);
         dn var27 = hx.jf;
         int var28 = 0;

         int var16;
         for(var9 = 0; var9 < var27.az * -1234749921; ++var9) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            so var29 = var27.ab[var27.ag[var9]];
            if (null != var29) {
               if (var4 >= 2) {
                  throw new IllegalStateException();
               }

               boolean var10000;
               if (ib.mk * 718657319 == var29.ak.ap * -1948824391) {
                  if (var4 >= 2) {
                     return;
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var30 = var10000;
               if (!var30) {
                  if (var28 < client.wg * 680565095) {
                     if (var4 >= 2) {
                        return;
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var12 = var10000;
                  if (!var12) {
                     continue;
                  }

                  ++var28;
               }

               var29.aj.au(cu.jl(var27, var29.ap((byte)92), var29.aw(1196324564), 86027145 * var27.aj, -688346971), 1077216664);
               var29.ak.aw.ak = -330508271 * client.dt;
               var29.au(-1334638951);
               var27.aw.ar(86027145 * var27.aj, var29.ap((byte)99), var29.aw(-279504200), var29.an(818730252), var29.af(-1217058965) / 2, var29.ak.aw, var29.ao(327814629), 0L, false);
               sg.il(var29.ak, (byte)68);
               dn var32 = var29.ak;
               if (client.nk * 1564407135 >= 0) {
                  if (var4 >= 2) {
                     throw new IllegalStateException();
                  }

                  if (var32.an[1564407135 * client.nk] != null) {
                     if (var4 >= 2) {
                        throw new IllegalStateException();
                     }

                     sk.it(var32, client.nk * 1564407135, false, (short)227);
                  }
               }

               ll.iz(var29.ak, true, (byte)30);
               dn var34 = var29.ak;
               var14 = -562349667 * client.jp.ae;
               int[] var35 = client.jp.am;

               for(var16 = 0; var16 < var14; ++var16) {
                  if (var4 >= 2) {
                     throw new IllegalStateException();
                  }

                  if (client.nk * 1564407135 != var35[var16]) {
                     if (var4 >= 2) {
                        return;
                     }

                     if (-190079873 * client.ma == var35[var16]) {
                        if (var4 >= 2) {
                           throw new IllegalStateException();
                        }
                     } else {
                        sk.it(var34, var35[var16], true, (short)227);
                     }
                  }
               }

               ll.iz(var29.ak, false, (byte)-15);
               ds.ik(var29.ak, (byte)64);
               ar.ig(var29.ak, (byte)88);
            }
         }

         ds.ik(hx.jf, (byte)35);
         ar.ig(hx.jf, (byte)44);
         eq.if(var0, var1, var2, var3, true, 65280);
         var0 = -353471513 * client.vu;
         var1 = client.vr * 745799495;
         var2 = -1725432169 * client.vw;
         var3 = client.vm * -1477308191;
         vz.ev(var0, var1, var0 + var2, var1 + var3);
         jm.ab();
         vz.eo();
         var28 = 1882572927 * client.kp;
         if (-1340003411 * client.lq / 256 > var28) {
            var28 = -1340003411 * client.lq / 256;
         }

         if (client.uo[4]) {
            if (var4 >= 2) {
               return;
            }

            if (client.uz[4] + 128 > var28) {
               if (var4 >= 2) {
                  throw new IllegalStateException();
               }

               var28 = 128 + client.uz[4];
            }
         }

         var9 = 1833510775 * client.kb & 2047;
         ji(sl.lg * -1076386691, dd.lk * 85219055, 683212995 * ly.ls, var28, var9, ih.go(var28, 1483745131), var3, 1159737027);
         if (!client.to) {
            var10 = fm.ib(1377737696);
         } else {
            var10 = nk.ij(558881100);
         }

         int var31 = -678007887 * ad.kw;
         int var33 = 2138486231 * in.ks;
         var13 = oo.kv * -892337617;
         var14 = -887244477 * mj.kz;
         var15 = 1625945013 * pg.kc;

         int var17;
         for(var16 = 0; var16 < 5; ++var16) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            if (client.uo[var16]) {
               if (var4 >= 2) {
                  return;
               }

               var17 = (int)(Math.random() * (double)(1 + 2 * client.uf[var16]) - (double)client.uf[var16] + Math.sin((double)client.ua[var16] / 100.0D * (double)client.ui[var16]) * (double)client.uz[var16]);
               if (var16 == 0) {
                  if (var4 >= 2) {
                     throw new IllegalStateException();
                  }

                  ad.kw += -2128937647 * var17;
               }

               if (var16 == 1) {
                  if (var4 >= 2) {
                     return;
                  }

                  in.ks += var17 * 801770983;
               }

               if (var16 == 2) {
                  if (var4 >= 2) {
                     throw new IllegalStateException();
                  }

                  oo.kv += var17 * -2068675377;
               }

               if (var16 == 3) {
                  if (var4 >= 2) {
                     throw new IllegalStateException();
                  }

                  pg.kc = -583425379 * (1625945013 * pg.kc + var17 & 2047);
               }

               if (4 == var16) {
                  if (var4 >= 2) {
                     throw new IllegalStateException();
                  }

                  mj.kz += var17 * 1819843435;
                  if (mj.kz * -887244477 < 128) {
                     mj.kz = 1011725696;
                  }

                  if (mj.kz * -887244477 > 383) {
                     if (var4 >= 2) {
                        return;
                     }

                     mj.kz = 1215333653;
                  }
               }
            }
         }

         var16 = 56923103 * bc.au;
         var17 = -1159272925 * bc.an;
         if (-88156479 * bc.ag != 0) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var16 = bc.ad * -208904825;
            var17 = bc.ac * 1503556707;
         }

         int var18;
         int var19;
         label402: {
            if (var16 >= var0 && var16 < var0 + var2) {
               if (var4 >= 2) {
                  throw new IllegalStateException();
               }

               if (var17 >= var1) {
                  if (var4 >= 2) {
                     throw new IllegalStateException();
                  }

                  if (var17 < var1 + var3) {
                     if (var4 >= 2) {
                        return;
                     }

                     var18 = var16 - var0;
                     var19 = var17 - var1;
                     jr.aw = var18 * 1434501025;
                     jr.ak = var19 * 859633943;
                     jr.ap = true;
                     jr.ar = 0;
                     jr.aj = false;
                     Iterator var20 = client.jv.iterator();

                     while(true) {
                        if (!var20.hasNext()) {
                           break label402;
                        }

                        if (var4 >= 2) {
                           return;
                        }

                        dn var21 = (dn)var20.next();
                        var21.aw.cp(86027145 * var21.aj, var16, var17);
                     }
                  }
               }
            }

            jr.ap = false;
            jr.ar = 0;
         }

         fx.hf(-273914623);
         vz.ef(var0, var1, var2, var3, 0);
         fx.hf(655828590);
         var18 = jm.ao();
         jm.ap(dd.bl.bj);
         jm.as.ay = client.vl * 1706192477;
         var19 = bz.mx.ap((byte)5);
         int var36 = bz.mx.aw(-79327476);
         im var40;
         if (-1 == 718657319 * ib.mk) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var40 = im.ap;
         } else {
            var40 = im.aw;
         }

         im var37 = var40;
         hx.jf.aw.bs(var37);
         hx.jf.aw.cg(ad.kw * -678007887, in.ks * 2138486231, -892337617 * oo.kv, mj.kz * -887244477, pg.kc * 1625945013, var10, var19, var36, client.to);
         jm.ap(false);
         if (client.er) {
            if (var4 >= 2) {
               return;
            }

            vz.ee();
         }

         jm.as.ay = var18;
         fx.hf(55212297);
         hx.jf.aw.ag();

         int var22;
         so var23;
         for(var22 = 0; var22 < -1234749921 * hx.jf.az; ++var22) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var23 = hx.jf.ab[hx.jf.ag[var22]];
            if (var23 != null) {
               if (var4 >= 2) {
                  throw new IllegalStateException();
               }

               var23.ak.aw.ag();
            }
         }

         client.jg(hx.jf, var0, var1, var2, var3, -1747837942);

         for(var22 = 0; var22 < -1234749921 * hx.jf.az; ++var22) {
            if (var4 >= 2) {
               return;
            }

            var23 = hx.jf.ab[hx.jf.ag[var22]];
            if (var23 != null) {
               client.jg(var23.ak, var0, var1, var2, var3, -1277151642);
            }
         }

         dn var38 = hx.jf;
         if (2 == -139275429 * client.dw) {
            int var39 = (client.di * 522991519 - -2014668603 * var38.as << 7) + 1349476023 * client.ev;
            int var24 = (1115458161 * client.dn - 1601580509 * var38.ae << 7) + 75801999 * client.eh;
            fq.jx(var38, var39, var24, var39, var24, -1967951446 * client.eg, 229971609);
            if (client.mr * -806605719 > -1) {
               if (var4 >= 2) {
                  throw new IllegalStateException();
               }

               if (-330508271 * client.dt % 20 < 10) {
                  if (var4 >= 2) {
                     throw new IllegalStateException();
                  }

                  ch.ku[0].ao(-806605719 * client.mr + var0 - 12, var1 + client.mb * 1454210871 - 28);
               }
            }
         }

         ((jk)jm.as.as).ae(-1815114593 * client.jh, (byte)62);
         lw.jm(var0, var1, var2, var3, 2108574366);
         ad.kw = var31 * -2128937647;
         in.ks = var33 * 801770983;
         oo.kv = -2068675377 * var13;
         mj.kz = var14 * 1819843435;
         pg.kc = var15 * -583425379;
         if (client.dm) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            if (oc.vv.am(true, false, (byte)1) == 0) {
               if (var4 >= 2) {
                  return;
               }

               client.dm = false;
            }
         }

         if (client.dm) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            vz.ef(var0, var1, var2, var3, 0);
            ir.iq(og.af, false, (byte)-79);
         }

      } catch (RuntimeException var25) {
         throw tm.aw(var25, "fs.iv(" + ')');
      }
   }
}
