import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class ej extends ex {
   static final int bm = 0;
   final boolean ai;
   static final int bz = 49;

   static int br(int var0, da var1, boolean var2, int var3) {
      try {
         if (5306 == var0) {
            if (var3 <= 257404452) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = ff.ic(659563216);
               return 1;
            }
         } else {
            int var4;
            if (5307 == var0) {
               if (var3 <= 257404452) {
                  throw new IllegalStateException();
               } else {
                  var4 = cm.ae[(dp.am -= -1450976103) * -158156887];
                  if (1 != var4) {
                     if (var3 <= 257404452) {
                        throw new IllegalStateException();
                     }

                     if (var4 != 2) {
                        return 1;
                     }

                     if (var3 <= 257404452) {
                        throw new IllegalStateException();
                     }
                  }

                  nt.ix(var4, (byte)-48);
                  return 1;
               }
            } else if (5308 == var0) {
               if (var3 <= 257404452) {
                  throw new IllegalStateException();
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = io.vx.bj(-3583288);
                  return 1;
               }
            } else if (var0 == 5309) {
               if (var3 <= 257404452) {
                  throw new IllegalStateException();
               } else {
                  var4 = cm.ae[(dp.am -= -1450976103) * -158156887];
                  if (var4 != 1) {
                     if (var3 <= 257404452) {
                        throw new IllegalStateException();
                     }

                     if (var4 != 2) {
                        return 1;
                     }

                     if (var3 <= 257404452) {
                        throw new IllegalStateException();
                     }
                  }

                  io.vx.bh(var4, (byte)-79);
                  return 1;
               }
            } else if (var0 == 5310) {
               if (var3 <= 257404452) {
                  throw new IllegalStateException();
               } else {
                  dp.am -= -1450976103;
                  return 1;
               }
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ej.br(" + ')');
      }
   }

   URLConnection ah(ei var1) throws IOException {
      HttpsURLConnection var2 = (HttpsURLConnection)var1.ap.openConnection();
      if (!this.ai) {
         if (null == ab.aw) {
            ab.aw = new ab();
         }

         ab var4 = ab.aw;
         var2.setSSLSocketFactory(var4);
      }

      this.ak(var2, (byte)119);
      return var2;
   }

   URLConnection ax(ei var1, int var2) throws IOException {
      try {
         URLConnection var3 = var1.ap.openConnection();
         this.ak(var3, (byte)16);
         return var3;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ej.ax(" + ')');
      }
   }

   static final int az(int var0, int var1, int var2) {
      try {
         int var3 = var0 + 57 * var1;
         var3 ^= var3 << 13;
         int var4 = var3 * (789221 + 15731 * var3 * var3) + 1376312589 & Integer.MAX_VALUE;
         return var4 >> 19 & 255;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ej.az(" + ')');
      }
   }

   public ej(boolean var1, int var2) {
      try {
         super(var2);
         this.ai = var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ej.<init>(" + ')');
      }
   }

   void ae(ei var1) throws IOException {
      URLConnection var2 = null;
      boolean var9 = false;

      label124: {
         HttpURLConnection var12;
         label125: {
            try {
               var9 = true;
               String var3 = var1.ap.getProtocol();
               if (var3.equals("http")) {
                  var2 = this.ax(var1, -428943696);
               } else {
                  if (!var3.equals("https")) {
                     var1.aj = 957455567 * ei.ak;
                     var9 = false;
                     break label124;
                  }

                  var2 = this.aq(var1, 457015582);
               }

               this.aj(var2, var1, (byte)-96);
               var9 = false;
               break label125;
            } catch (IOException var10) {
               var1.aj = 957455567 * ei.ak;
               var9 = false;
            } finally {
               if (var9) {
                  if (null != var2 && var2 instanceof HttpURLConnection) {
                     HttpURLConnection var6 = (HttpURLConnection)var2;
                     var6.disconnect();
                  }

               }
            }

            if (null != var2 && var2 instanceof HttpURLConnection) {
               var12 = (HttpURLConnection)var2;
               var12.disconnect();
            }

            return;
         }

         if (null != var2 && var2 instanceof HttpURLConnection) {
            var12 = (HttpURLConnection)var2;
            var12.disconnect();
         }

         return;
      }

      if (null != var2 && var2 instanceof HttpURLConnection) {
         HttpURLConnection var4 = (HttpURLConnection)var2;
         var4.disconnect();
      }

   }

   void am(ei var1) throws IOException {
      URLConnection var2 = null;
      boolean var9 = false;

      label124: {
         HttpURLConnection var12;
         label125: {
            try {
               var9 = true;
               String var3 = var1.ap.getProtocol();
               if (var3.equals("http")) {
                  var2 = this.ax(var1, 820712939);
               } else {
                  if (!var3.equals("https")) {
                     var1.aj = 957455567 * ei.ak;
                     var9 = false;
                     break label124;
                  }

                  var2 = this.aq(var1, 1665430367);
               }

               this.aj(var2, var1, (byte)-66);
               var9 = false;
               break label125;
            } catch (IOException var10) {
               var1.aj = 957455567 * ei.ak;
               var9 = false;
            } finally {
               if (var9) {
                  if (null != var2 && var2 instanceof HttpURLConnection) {
                     HttpURLConnection var6 = (HttpURLConnection)var2;
                     var6.disconnect();
                  }

               }
            }

            if (null != var2 && var2 instanceof HttpURLConnection) {
               var12 = (HttpURLConnection)var2;
               var12.disconnect();
            }

            return;
         }

         if (null != var2 && var2 instanceof HttpURLConnection) {
            var12 = (HttpURLConnection)var2;
            var12.disconnect();
         }

         return;
      }

      if (null != var2 && var2 instanceof HttpURLConnection) {
         HttpURLConnection var4 = (HttpURLConnection)var2;
         var4.disconnect();
      }

   }

   URLConnection al(ei var1) throws IOException {
      URLConnection var2 = var1.ap.openConnection();
      this.ak(var2, (byte)40);
      return var2;
   }

   URLConnection aa(ei var1) throws IOException {
      HttpsURLConnection var2 = (HttpsURLConnection)var1.ap.openConnection();
      if (!this.ai) {
         if (null == ab.aw) {
            ab.aw = new ab();
         }

         ab var4 = ab.aw;
         var2.setSSLSocketFactory(var4);
      }

      this.ak(var2, (byte)16);
      return var2;
   }

   URLConnection aq(ei var1, int var2) throws IOException {
      try {
         HttpsURLConnection var3 = (HttpsURLConnection)var1.ap.openConnection();
         if (!this.ai) {
            if (null == ab.aw) {
               if (var2 >= 1683192377) {
                  throw new IllegalStateException();
               }

               ab.aw = new ab();
            }

            ab var5 = ab.aw;
            var3.setSSLSocketFactory(var5);
         }

         this.ak(var3, (byte)65);
         return var3;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ej.aq(" + ')');
      }
   }

   static void hr(int var0, int var1) {
      try {
         label361: {
            int var2 = et.ah((byte)-19);
            if (-3 == var0) {
               if (var1 == -1815404045) {
                  return;
               }

               fa.ad(og.bi, og.bf, og.bg, -1059127340);
            } else if (-2 == var0) {
               if (var1 == -1815404045) {
                  throw new IllegalStateException();
               }

               fa.ad(og.bl, og.be, og.cq, -1059127340);
            } else if (var0 == -1) {
               if (var1 == -1815404045) {
                  return;
               }

               fa.ad(og.cb, og.cd, og.ci, -1059127340);
            } else if (3 == var0) {
               if (var1 == -1815404045) {
                  throw new IllegalStateException();
               }

               as.aa(3, (byte)1);
               dq.bf = -80322897;
            } else if (var0 == 4) {
               if (var1 == -1815404045) {
                  return;
               }

               cm.aq(0, -2039454866);
            } else if (var0 == 5) {
               if (var1 == -1815404045) {
                  return;
               }

               dq.bf = -160645794;
               fa.ad(og.cl, og.cp, og.cv, -1059127340);
            } else if (var0 == 68) {
               if (var1 == -1815404045) {
                  throw new IllegalStateException();
               }

               if (!client.dr) {
                  client.dr = true;
                  bm.ga(1369773461);
                  return;
               }

               fa.ad(og.cy, og.cu, og.ce, -1059127340);
            } else {
               label360: {
                  if (!client.cz) {
                     if (var1 == -1815404045) {
                        return;
                     }

                     if (var0 == 6) {
                        if (var1 == -1815404045) {
                           return;
                        }

                        fa.ad(og.cy, og.cu, og.ce, -1059127340);
                        break label360;
                     }
                  }

                  if (7 == var0) {
                     if (var1 == -1815404045) {
                        throw new IllegalStateException();
                     }

                     fa.ad(og.cg, og.cx, og.cz, -1059127340);
                  } else if (var0 == 8) {
                     if (var1 == -1815404045) {
                        throw new IllegalStateException();
                     }

                     fa.ad(og.ch, og.ct, og.cc, -1059127340);
                  } else if (9 == var0) {
                     fa.ad(og.cj, og.cm, og.cw, -1059127340);
                  } else if (var0 == 10) {
                     if (var1 == -1815404045) {
                        return;
                     }

                     fa.ad(og.ca, og.cs, og.cr, -1059127340);
                  } else if (11 == var0) {
                     if (var1 == -1815404045) {
                        throw new IllegalStateException();
                     }

                     fa.ad(og.ck, og.dq, og.dd, -1059127340);
                  } else if (var0 == 12) {
                     if (var1 == -1815404045) {
                        return;
                     }

                     fa.ad(og.dc, og.da, og.dr, -1059127340);
                  } else if (13 == var0) {
                     if (var1 == -1815404045) {
                        throw new IllegalStateException();
                     }

                     fa.ad(og.dh, og.dg, og.df, -1059127340);
                  } else if (14 == var0) {
                     if (var1 == -1815404045) {
                        throw new IllegalStateException();
                     }

                     fa.ad(og.du, og.dk, og.dl, -1059127340);
                  } else if (16 == var0) {
                     if (var1 == -1815404045) {
                        return;
                     }

                     fa.ad(og.dm, og.dt, og.dx, -1059127340);
                     as.aa(33, (byte)1);
                  } else if (17 == var0) {
                     if (var1 == -1815404045) {
                        throw new IllegalStateException();
                     }

                     fa.ad(og.ds, og.db, og.dv, -1059127340);
                  } else if (var0 == 18) {
                     as.aa(14, (byte)1);
                     dq.ba = 518580299;
                  } else if (var0 == 19) {
                     fa.ad(og.do, og.dw, og.de, -1059127340);
                  } else if (var0 == 20) {
                     if (var1 == -1815404045) {
                        return;
                     }

                     fa.ad(og.dz, og.di, og.dn, -1059127340);
                  } else if (var0 == 22) {
                     fa.ad(og.eg, og.ev, og.eh, -1059127340);
                  } else if (var0 == 23) {
                     fa.ad(og.ez, og.ey, og.ec, -1059127340);
                  } else if (24 == var0) {
                     if (var1 == -1815404045) {
                        throw new IllegalStateException();
                     }

                     fa.ad(og.ek, og.er, og.en, -1059127340);
                  } else if (var0 == 25) {
                     if (var1 == -1815404045) {
                        return;
                     }

                     fa.ad(og.ef, og.em, og.el, -1059127340);
                  } else if (26 == var0) {
                     if (var1 == -1815404045) {
                        throw new IllegalStateException();
                     }

                     fa.ad(og.ed, og.ep, og.ex, -1059127340);
                  } else if (27 == var0) {
                     if (var1 == -1815404045) {
                        throw new IllegalStateException();
                     }

                     fa.ad(og.ej, og.ei, og.ew, -1059127340);
                  } else if (31 == var0) {
                     if (var1 == -1815404045) {
                        throw new IllegalStateException();
                     }

                     fa.ad(og.ea, og.et, og.fu, -1059127340);
                  } else if (32 == var0) {
                     as.aa(14, (byte)1);
                     dq.ba = 1037160598;
                  } else if (var0 == 37) {
                     fa.ad(og.fw, og.fp, og.fh, -1059127340);
                  } else if (38 == var0) {
                     if (var1 == -1815404045) {
                        throw new IllegalStateException();
                     }

                     fa.ad(og.fv, og.fl, og.fn, -1059127340);
                  } else if (var0 == 74) {
                     if (var1 == -1815404045) {
                        return;
                     }

                     fa.ad(og.fd, og.fm, og.fg, -1059127340);
                  } else if (55 == var0) {
                     as.aa(8, (byte)1);
                  } else {
                     if (var0 == 56) {
                        if (var1 == -1815404045) {
                           return;
                        }

                        fa.ad(og.ft, og.ff, og.fx, -1059127340);
                        ea.gv(11, 2027013533);
                        return;
                     }

                     if (var0 == 57) {
                        if (var1 == -1815404045) {
                           throw new IllegalStateException();
                        }

                        fa.ad(og.fq, og.fk, og.fs, -1059127340);
                        ea.gv(11, 2027013533);
                        return;
                     }

                     if (61 == var0) {
                        if (var1 == -1815404045) {
                           throw new IllegalStateException();
                        }

                        fa.ad("", "Please enter your date of birth (DD/MM/YYYY)", "", -1059127340);
                        as.aa(7, (byte)1);
                     } else {
                        if (62 == var0) {
                           if (var1 == -1815404045) {
                              throw new IllegalStateException();
                           }

                           ea.gv(10, 2027013533);
                           as.aa(9, (byte)1);
                           fa.ad(og.fz, og.fy, og.fi, -1059127340);
                           return;
                        }

                        if (var0 == 63) {
                           if (var1 == -1815404045) {
                              throw new IllegalStateException();
                           }

                           ea.gv(10, 2027013533);
                           as.aa(9, (byte)1);
                           fa.ad(og.gp, og.gl, og.gb, -1059127340);
                           return;
                        }

                        if (65 == var0) {
                           break label361;
                        }

                        if (var1 == -1815404045) {
                           throw new IllegalStateException();
                        }

                        if (var0 == 67) {
                           if (var1 == -1815404045) {
                              throw new IllegalStateException();
                           }
                           break label361;
                        }

                        if (71 == var0) {
                           if (var1 == -1815404045) {
                              throw new IllegalStateException();
                           }

                           ea.gv(10, 2027013533);
                           as.aa(7, (byte)1);
                           fa.ad("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.", -1059127340);
                        } else if (73 == var0) {
                           if (var1 == -1815404045) {
                              return;
                           }

                           ea.gv(10, 2027013533);
                           as.aa(6, (byte)1);
                           fa.ad(og.ll, og.lj, og.lz, -1059127340);
                        } else if (var0 == 72) {
                           if (var1 == -1815404045) {
                              throw new IllegalStateException();
                           }

                           ea.gv(10, 2027013533);
                           as.aa(32, (byte)1);
                        } else {
                           fa.ad(og.gc, og.ga, og.gf, -1059127340);
                        }
                     }
                  }
               }
            }

            ea.gv(10, 2027013533);
            boolean var10000;
            if (var2 != et.ah((byte)-9)) {
               if (var1 == -1815404045) {
                  return;
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var3 = var10000;
            if (!var3) {
               if (var1 == -1815404045) {
                  throw new IllegalStateException();
               }

               if (client.gp.ap((byte)-98)) {
                  if (var1 == -1815404045) {
                     throw new IllegalStateException();
                  }

                  as.aa(9, (byte)1);
               }
            }

            return;
         }

         ea.gv(10, 2027013533);
         as.aa(9, (byte)1);
         fa.ad(og.gn, og.gd, og.gy, -1059127340);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ej.hr(" + ')');
      }
   }

   static boolean ak(String var0, int var1) {
      try {
         if (null == var0) {
            if (var1 >= -1771984194) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            try {
               new URL(var0);
               return true;
            } catch (MalformedURLException var3) {
               return false;
            }
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ej.ak(" + ')');
      }
   }

   public static final vv ao(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         if (-1 == var1) {
            if (var6 != 197552337) {
               throw new IllegalStateException();
            }

            var4 = 0;
         } else if (var4 == 2) {
            if (var6 != 197552337) {
               throw new IllegalStateException();
            }

            if (var1 != 1) {
               if (var6 != 197552337) {
                  throw new IllegalStateException();
               }

               var4 = 1;
            }
         }

         long var7 = ((long)var3 << 42) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40);
         vv var9;
         if (!var5) {
            if (var6 != 197552337) {
               throw new IllegalStateException();
            }

            var9 = (vv)ip.ao.ap(var7);
            if (var9 != null) {
               if (var6 != 197552337) {
                  throw new IllegalStateException();
               }

               return var9;
            }
         }

         ip var10 = qg.aw(var0, 649869579);
         if (var1 > 1) {
            if (var6 != 197552337) {
               throw new IllegalStateException();
            }

            if (null != var10.cb) {
               if (var6 != 197552337) {
                  throw new IllegalStateException();
               }

               int var11 = -1;

               for(int var12 = 0; var12 < 10; ++var12) {
                  if (var6 != 197552337) {
                     throw new IllegalStateException();
                  }

                  if (var1 >= var10.cd[var12]) {
                     if (var6 != 197552337) {
                        throw new IllegalStateException();
                     }

                     if (var10.cd[var12] != 0) {
                        if (var6 != 197552337) {
                           throw new IllegalStateException();
                        }

                        var11 = var10.cb[var12];
                     }
                  }
               }

               if (var11 != -1) {
                  var10 = qg.aw(var11, 649869579);
               }
            }
         }

         jy var24 = var10.at(1, 1409228859);
         if (var24 == null) {
            if (var6 != 197552337) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            vv var25 = null;
            if (-1 != -1338868597 * var10.cn) {
               if (var6 != 197552337) {
                  throw new IllegalStateException();
               }

               var25 = ao(1645774315 * var10.ci, 10, 1, 0, 0, true, 197552337);
               if (null == var25) {
                  if (var6 != 197552337) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            } else if (var10.cz * 1376159487 != -1) {
               var25 = ao(-1533877969 * var10.cx, var1, var2, var3, 0, false, 197552337);
               if (null == var25) {
                  if (var6 != 197552337) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            } else if (-1 != var10.ct * -1610839045) {
               var25 = ao(-1191328669 * var10.ch, var1, 0, 0, 0, false, 197552337);
               if (var25 == null) {
                  if (var6 != 197552337) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            }

            int[] var13 = vz.al;
            int var14 = vz.aa;
            int var15 = vz.ah;
            float[] var16 = vz.bh;
            int[] var17 = new int[4];
            vz.ez(var17);
            var9 = new vv(36, 32);
            jm.ar(var9.ap, 36, 32, (float[])null);
            vz.ec();
            jm.ab();
            jm.ad(16, 16);
            jm.as.aw = false;
            if (-1610839045 * var10.ct != -1) {
               if (var6 != 197552337) {
                  throw new IllegalStateException();
               }

               var25.ao(0, 0);
            }

            int var18 = var10.aq * 231578805;
            if (var5) {
               if (var6 != 197552337) {
                  throw new IllegalStateException();
               }

               var18 = (int)((double)var18 * 1.5D);
            } else if (var2 == 2) {
               if (var6 != 197552337) {
                  throw new IllegalStateException();
               }

               var18 = (int)((double)var18 * 1.04D);
            }

            int var19 = var18 * jm.aj[-1039968077 * var10.al] >> 16;
            int var20 = var18 * jm.ai[var10.al * -1039968077] >> 16;
            var24.am();
            var24.bx(0, var10.aa * -1204826743, -1304292829 * var10.ah, -1039968077 * var10.al, var10.bh * 1322677663, -274986519 * var24.ez / 2 + var19 + -357889571 * var10.bj, var10.bj * -357889571 + var20);
            if (-1 != 1376159487 * var10.cz) {
               if (var6 != 197552337) {
                  throw new IllegalStateException();
               }

               var25.ao(0, 0);
            }

            if (var2 >= 1) {
               if (var6 != 197552337) {
                  throw new IllegalStateException();
               }

               var9.am(1);
            }

            if (var2 >= 2) {
               var9.am(16777215);
            }

            if (0 != var3) {
               if (var6 != 197552337) {
                  throw new IllegalStateException();
               }

               var9.at(var3);
            }

            jm.ar(var9.ap, 36, 32, (float[])null);
            if (-1 != -1338868597 * var10.cn) {
               if (var6 != 197552337) {
                  throw new IllegalStateException();
               }

               var25.ao(0, 0);
            }

            label252: {
               if (1 != var4) {
                  if (var6 != 197552337) {
                     throw new IllegalStateException();
                  }

                  if (var4 != 2 || 1 != var10.bk * 1382901153) {
                     break label252;
                  }

                  if (var6 != 197552337) {
                     throw new IllegalStateException();
                  }
               }

               qi var21 = ht.af;
               String var22;
               if (var1 < 100000) {
                  if (var6 != 197552337) {
                     throw new IllegalStateException();
                  }

                  var22 = "<col=ffff00>" + var1 + "</col>";
               } else if (var1 < 10000000) {
                  var22 = "<col=ffffff>" + var1 / 1000 + og.hc + "</col>";
               } else {
                  var22 = "<col=00ff80>" + var1 / 1000000 + og.gk + "</col>";
               }

               var21.ab(var22, 0, 9, 16776960, 1);
            }

            if (!var5) {
               ip.ao.ak(var9, var7);
            }

            jm.ar(var13, var14, var15, var16);
            vz.ey(var17);
            jm.ab();
            jm.as.aw = true;
            return var9;
         }
      } catch (RuntimeException var23) {
         throw tm.aw(var23, "ej.ao(" + ')');
      }
   }

   void ap(ei var1, int var2) throws IOException {
      try {
         URLConnection var3 = null;
         boolean var11 = false;

         label192: {
            HttpURLConnection var15;
            label188: {
               try {
                  var11 = true;
                  String var4 = var1.ap.getProtocol();
                  if (var4.equals("http")) {
                     if (var2 == 671134578) {
                        return;
                     }

                     var3 = this.ax(var1, -1116746550);
                  } else {
                     if (!var4.equals("https")) {
                        var1.aj = 957455567 * ei.ak;
                        var11 = false;
                        break label192;
                     }

                     var3 = this.aq(var1, -1589599376);
                  }

                  this.aj(var3, var1, (byte)-98);
                  var11 = false;
                  break label188;
               } catch (IOException var12) {
                  var1.aj = 957455567 * ei.ak;
                  var11 = false;
               } finally {
                  if (var11) {
                     if (null != var3) {
                        if (var2 == 671134578) {
                           throw new IllegalStateException();
                        }

                        if (var3 instanceof HttpURLConnection) {
                           if (var2 == 671134578) {
                              throw new IllegalStateException();
                           }

                           HttpURLConnection var7 = (HttpURLConnection)var3;
                           var7.disconnect();
                        }
                     }

                  }
               }

               if (null != var3) {
                  if (var2 == 671134578) {
                     throw new IllegalStateException();
                  }

                  if (var3 instanceof HttpURLConnection) {
                     if (var2 == 671134578) {
                        throw new IllegalStateException();
                     }

                     var15 = (HttpURLConnection)var3;
                     var15.disconnect();
                     return;
                  }
               }

               return;
            }

            if (null != var3) {
               if (var2 == 671134578) {
                  throw new IllegalStateException();
               }

               if (var3 instanceof HttpURLConnection) {
                  var15 = (HttpURLConnection)var3;
                  var15.disconnect();
               }
            }

            return;
         }

         if (null != var3) {
            if (var2 == 671134578) {
               return;
            }

            if (var3 instanceof HttpURLConnection) {
               HttpURLConnection var5 = (HttpURLConnection)var3;
               var5.disconnect();
            }
         }

      } catch (RuntimeException var14) {
         throw tm.aw(var14, "ej.ap(" + ')');
      }
   }

   void as(ei var1) throws IOException {
      URLConnection var2 = null;
      boolean var9 = false;

      label124: {
         HttpURLConnection var12;
         label125: {
            try {
               var9 = true;
               String var3 = var1.ap.getProtocol();
               if (var3.equals("http")) {
                  var2 = this.ax(var1, -1196093975);
               } else {
                  if (!var3.equals("https")) {
                     var1.aj = 957455567 * ei.ak;
                     var9 = false;
                     break label124;
                  }

                  var2 = this.aq(var1, -983889145);
               }

               this.aj(var2, var1, (byte)-7);
               var9 = false;
               break label125;
            } catch (IOException var10) {
               var1.aj = 957455567 * ei.ak;
               var9 = false;
            } finally {
               if (var9) {
                  if (null != var2 && var2 instanceof HttpURLConnection) {
                     HttpURLConnection var6 = (HttpURLConnection)var2;
                     var6.disconnect();
                  }

               }
            }

            if (null != var2 && var2 instanceof HttpURLConnection) {
               var12 = (HttpURLConnection)var2;
               var12.disconnect();
            }

            return;
         }

         if (null != var2 && var2 instanceof HttpURLConnection) {
            var12 = (HttpURLConnection)var2;
            var12.disconnect();
         }

         return;
      }

      if (null != var2 && var2 instanceof HttpURLConnection) {
         HttpURLConnection var4 = (HttpURLConnection)var2;
         var4.disconnect();
      }

   }
}
