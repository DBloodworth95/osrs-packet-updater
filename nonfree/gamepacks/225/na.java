import java.util.HashMap;
import java.util.Map;

public class na {
   ml au;
   po ae;
   po ag;
   po am;
   po ax;
   ml ar;
   Map at;
   public ny[][] aq;
   po ac;
   ml al;
   ml ad;
   ry ah;
   ry ap;
   static final int bh = 8;

   public ny ae(int var1, int var2, int var3) {
      try {
         ny var4 = this.ac(var1, -2024574936);
         if (-1 == var2) {
            if (var3 != 1569081104) {
               throw new IllegalStateException();
            } else {
               return var4;
            }
         } else {
            if (null != var4 && var4.gr != null) {
               if (var3 != 1569081104) {
                  throw new IllegalStateException();
               }

               if (var2 < var4.gr.length) {
                  return var4.gr[var2];
               }

               if (var3 != 1569081104) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "na.ae(" + ')');
      }
   }

   public ny ac(int var1, int var2) {
      try {
         int var3 = var1 >> 16;
         int var4 = var1 & '\uffff';
         if (null == this.aq[var3] || null == this.aq[var3][var4]) {
            boolean var5 = this.ag(var3, (byte)32);
            if (!var5) {
               if (var2 >= -1313284403) {
                  throw new IllegalStateException();
               }

               return null;
            }
         }

         return this.aq[var3][var4];
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "na.ac(" + ')');
      }
   }

   public ny au(int var1, int var2) {
      ny var3 = this.ac(var1, -1463498239);
      if (-1 == var2) {
         return var3;
      } else {
         return null != var3 && var3.gr != null && var2 < var3.gr.length ? var3.gr[var2] : null;
      }
   }

   public boolean ad(int var1) {
      if (mt.af[var1]) {
         return true;
      } else if (!this.ac.bc(var1, 794007155)) {
         return false;
      } else {
         int var2 = this.ac.cj(var1, (byte)29);
         if (var2 == 0) {
            mt.af[var1] = true;
            return true;
         } else {
            if (null == this.aq[var1]) {
               this.aq[var1] = new ny[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if (this.aq[var1][var3] == null) {
                  byte[] var4 = this.ac.bt(var1, var3, (byte)18);
                  if (var4 != null) {
                     this.aq[var1][var3] = new ny();
                     this.aq[var1][var3].bh = 1327282819 * (var3 + (var1 << 16));
                     if (-1 == var4[0]) {
                        this.aq[var1][var3].ae(new vf(var4), 1508530714);
                     } else {
                        this.aq[var1][var3].ac(new vf(var4), 516897545);
                     }

                     if (null != this.ae) {
                        byte[] var5 = this.ae.bt(var1, var3, (byte)72);
                        if (var5 != null && var5.length > 0) {
                           this.aq[var1][var3].ag(new vf(var5), 1314938647);
                           this.at.put(this.aq[var1][var3].bx, var1);
                        }
                     }
                  }
               }
            }

            mt.af[var1] = true;
            return true;
         }
      }
   }

   public ny aq(int var1) {
      int var2 = var1 >> 16;
      int var3 = var1 & '\uffff';
      if (null == this.aq[var2] || null == this.aq[var2][var3]) {
         boolean var4 = this.ag(var2, (byte)32);
         if (!var4) {
            return null;
         }
      }

      return this.aq[var2][var3];
   }

   public void ax(byte var1) {
      try {
         this.au.am();
         this.ar.am();
         this.al.am();
         this.ad.am();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "na.ax(" + ')');
      }
   }

   public na(po var1, po var2, po var3, po var4, po var5) {
      try {
         super();
         this.at = new HashMap();
         this.au = new ml(200);
         this.ar = new ml(50);
         this.al = new ml(20);
         this.ad = new ml(8);
         this.ah = new ry(10, rd.ac);
         this.ap = new ry(10, rd.ac);
         int var6 = 0;
         if (null != var1) {
            this.ac = var1;
            this.ag = var2;
            this.am = var3;
            this.ax = var4;
            this.ae = var5;
            var6 = this.ac.cx(-100695986);
         }

         this.aq = new ny[var6][];
         mt.af = new boolean[var6];
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "na.<init>(" + ')');
      }
   }

   public ny af(int var1) {
      int var2 = var1 >> 16;
      int var3 = var1 & '\uffff';
      if (null == this.aq[var2] || null == this.aq[var2][var3]) {
         boolean var4 = this.ag(var2, (byte)32);
         if (!var4) {
            return null;
         }
      }

      return this.aq[var2][var3];
   }

   public ny at(int var1) {
      int var2 = var1 >> 16;
      int var3 = var1 & '\uffff';
      if (null == this.aq[var2] || null == this.aq[var2][var3]) {
         boolean var4 = this.ag(var2, (byte)32);
         if (!var4) {
            return null;
         }
      }

      return this.aq[var2][var3];
   }

   public void ap() {
      this.au.am();
      this.ar.am();
      this.al.am();
      this.ad.am();
   }

   public ny ar(int var1, int var2) {
      ny var3 = this.ac(var1, -1752235012);
      if (-1 == var2) {
         return var3;
      } else {
         return null != var3 && var3.gr != null && var2 < var3.gr.length ? var3.gr[var2] : null;
      }
   }

   public ny al(int var1, int var2) {
      ny var3 = this.ac(var1, -1895058247);
      if (-1 == var2) {
         return var3;
      } else {
         return null != var3 && var3.gr != null && var2 < var3.gr.length ? var3.gr[var2] : null;
      }
   }

   static void ko(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         pk var7 = gs.jj.ao[var0][var1][var2];
         if (var7 != null) {
            for(ew var8 = (ew)var7.af(); var8 != null; var8 = (ew)var7.au()) {
               if (var6 != 1366828095) {
                  throw new IllegalStateException();
               }

               if ((var3 & 32767) == -805118597 * var8.ac && 138922953 * var8.ae == var4) {
                  var8.ae = var5 * -1945747847;
                  break;
               }
            }

            ux.lp(var0, var1, var2, 194514812);
         }

      } catch (RuntimeException var9) {
         throw vk.ae(var9, "na.ko(" + ')');
      }
   }

   public boolean ah(int var1) {
      if (mt.af[var1]) {
         return true;
      } else if (!this.ac.bc(var1, -1117548234)) {
         return false;
      } else {
         int var2 = this.ac.cj(var1, (byte)18);
         if (var2 == 0) {
            mt.af[var1] = true;
            return true;
         } else {
            if (null == this.aq[var1]) {
               this.aq[var1] = new ny[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if (this.aq[var1][var3] == null) {
                  byte[] var4 = this.ac.bt(var1, var3, (byte)-34);
                  if (var4 != null) {
                     this.aq[var1][var3] = new ny();
                     this.aq[var1][var3].bh = 1327282819 * (var3 + (var1 << 16));
                     if (-1 == var4[0]) {
                        this.aq[var1][var3].ae(new vf(var4), 1887282562);
                     } else {
                        this.aq[var1][var3].ac(new vf(var4), 171961916);
                     }

                     if (null != this.ae) {
                        byte[] var5 = this.ae.bt(var1, var3, (byte)99);
                        if (var5 != null && var5.length > 0) {
                           this.aq[var1][var3].ag(new vf(var5), 1314938647);
                           this.at.put(this.aq[var1][var3].bx, var1);
                        }
                     }
                  }
               }
            }

            mt.af[var1] = true;
            return true;
         }
      }
   }

   static int ah(int var0, dt var1, boolean var2, byte var3) {
      try {
         ny var4;
         if (var0 >= 2000) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var4 = ir.ep.ac(cs.at[(mp.au -= -1856457959) * 844691753], -1764963668);
         } else {
            ny var10000;
            if (var2) {
               if (var3 >= 10) {
                  throw new IllegalStateException();
               }

               var10000 = cs.ab;
            } else {
               var10000 = ry.ap;
            }

            var4 = var10000;
         }

         String var5 = cs.ar[(rt.al -= -1975882559) * -515103935];
         int[] var6 = null;
         if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            int var7 = cs.at[(mp.au -= -1856457959) * 844691753];
            if (var7 > 0) {
               for(var6 = new int[var7]; var7-- > 0; var6[var7] = cs.at[(mp.au -= -1856457959) * 844691753]) {
                  if (var3 >= 10) {
                     throw new IllegalStateException();
                  }
               }
            }

            var5 = var5.substring(0, var5.length() - 1);
         }

         Object[] var11 = new Object[var5.length() + 1];

         int var8;
         for(var8 = var11.length - 1; var8 >= 1; --var8) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            if (var5.charAt(var8 - 1) == 's') {
               if (var3 >= 10) {
                  throw new IllegalStateException();
               }

               var11[var8] = cs.ar[(rt.al -= -1975882559) * -515103935];
            } else {
               var11[var8] = new Integer(cs.at[(mp.au -= -1856457959) * 844691753]);
            }
         }

         var8 = cs.at[(mp.au -= -1856457959) * 844691753];
         if (-1 != var8) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var11[0] = new Integer(var8);
         } else {
            var11 = null;
         }

         if (var0 == 1400) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.ee = var11;
         } else if (var0 == 1401) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.ec = var11;
         } else if (1402 == var0) {
            var4.ej = var11;
         } else if (var0 == 1403) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.et = var11;
         } else if (1404 == var0) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.ff = var11;
         } else if (var0 == 1405) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fe = var11;
         } else if (1406 == var0) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fk = var11;
         } else if (1407 == var0) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fp = var11;
            var4.fr = var6;
         } else if (1408 == var0) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fq = var11;
         } else if (var0 == 1409) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fn = var11;
         } else if (var0 == 1410) {
            var4.ft = var11;
         } else if (var0 == 1411) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.eq = var11;
         } else if (1412 == var0) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fv = var11;
         } else if (1414 == var0) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fg = var11;
            var4.fu = var6;
         } else if (var0 == 1415) {
            var4.fj = var11;
            var4.fs = var6;
         } else if (1416 == var0) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fb = var11;
         } else if (var0 == 1417) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fo = var11;
         } else if (var0 == 1418) {
            var4.fw = var11;
         } else if (var0 == 1419) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fd = var11;
         } else if (var0 == 1420) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fm = var11;
         } else if (var0 == 1421) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fx = var11;
         } else if (1422 == var0) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fa = var11;
         } else if (var0 == 1423) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fl = var11;
         } else if (var0 == 1424) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.ga = var11;
         } else if (var0 == 1425) {
            var4.gl = var11;
         } else if (1426 == var0) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.ge = var11;
         } else if (var0 == 1427) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.gd = var11;
         } else if (var0 == 1428) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fy = var11;
         } else if (1429 == var0) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fz = var11;
         } else if (1430 == var0) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fi = var11;
         } else if (var0 == 1431) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fc = var11;
         } else if (var0 == 1434) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.gb = var11;
         } else if (var0 == 1435) {
            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            var4.fh = var11;
         } else {
            if (var0 < 1436) {
               return 2;
            }

            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            if (var0 > 1439) {
               return 2;
            }

            if (var3 >= 10) {
               throw new IllegalStateException();
            }

            nu var9 = var4.bi(1406523579);
            if (null != var9) {
               if (var3 >= 10) {
                  throw new IllegalStateException();
               }

               if (var0 == 1436) {
                  if (var3 >= 10) {
                     throw new IllegalStateException();
                  }

                  var9.ax = var11;
               } else if (var0 == 1437) {
                  if (var3 >= 10) {
                     throw new IllegalStateException();
                  }

                  var9.aq = var11;
               } else if (var0 == 1438) {
                  if (var3 >= 10) {
                     throw new IllegalStateException();
                  }

                  var9.af = var11;
               } else if (1439 == var0) {
                  if (var3 >= 10) {
                     throw new IllegalStateException();
                  }

                  var9.am = var11;
               }
            }
         }

         var4.er = true;
         return 1;
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "na.ah(" + ')');
      }
   }

   public void ab() {
      this.au.am();
      this.ar.am();
      this.al.am();
      this.ad.am();
   }

   public void am(int var1, byte var2) {
      try {
         if (var1 == -1) {
            if (var2 <= 6) {
               throw new IllegalStateException();
            }
         } else if (!mt.af[var1]) {
            if (var2 <= 6) {
               throw new IllegalStateException();
            }
         } else {
            this.ac.cy(var1, (byte)16);
            if (this.aq[var1] == null) {
               if (var2 <= 6) {
                  throw new IllegalStateException();
               }
            } else {
               for(int var3 = 0; var3 < this.aq[var1].length; ++var3) {
                  if (var2 <= 6) {
                     throw new IllegalStateException();
                  }

                  if (null != this.aq[var1][var3]) {
                     if (var2 <= 6) {
                        throw new IllegalStateException();
                     }

                     this.aq[var1][var3] = null;
                  }
               }

               this.aq[var1] = null;
               mt.af[var1] = false;
            }
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "na.am(" + ')');
      }
   }

   public boolean ag(int var1, byte var2) {
      try {
         if (mt.af[var1]) {
            return true;
         } else if (!this.ac.bc(var1, 2061423495)) {
            if (var2 != 32) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var3 = this.ac.cj(var1, (byte)63);
            if (var3 == 0) {
               if (var2 != 32) {
                  throw new IllegalStateException();
               } else {
                  mt.af[var1] = true;
                  return true;
               }
            } else {
               if (null == this.aq[var1]) {
                  if (var2 != 32) {
                     throw new IllegalStateException();
                  }

                  this.aq[var1] = new ny[var3];
               }

               for(int var4 = 0; var4 < var3; ++var4) {
                  if (var2 != 32) {
                     throw new IllegalStateException();
                  }

                  if (this.aq[var1][var4] == null) {
                     if (var2 != 32) {
                        throw new IllegalStateException();
                     }

                     byte[] var5 = this.ac.bt(var1, var4, (byte)-81);
                     if (var5 != null) {
                        if (var2 != 32) {
                           throw new IllegalStateException();
                        }

                        this.aq[var1][var4] = new ny();
                        this.aq[var1][var4].bh = 1327282819 * (var4 + (var1 << 16));
                        if (-1 == var5[0]) {
                           if (var2 != 32) {
                              throw new IllegalStateException();
                           }

                           this.aq[var1][var4].ae(new vf(var5), 1684534044);
                        } else {
                           this.aq[var1][var4].ac(new vf(var5), -419725187);
                        }

                        if (null != this.ae) {
                           if (var2 != 32) {
                              throw new IllegalStateException();
                           }

                           byte[] var6 = this.ae.bt(var1, var4, (byte)37);
                           if (var6 != null) {
                              if (var2 != 32) {
                                 throw new IllegalStateException();
                              }

                              if (var6.length > 0) {
                                 if (var2 != 32) {
                                    throw new IllegalStateException();
                                 }

                                 this.aq[var1][var4].ag(new vf(var6), 1314938647);
                                 this.at.put(this.aq[var1][var4].bx, var1);
                              }
                           }
                        }
                     }
                  }
               }

               mt.af[var1] = true;
               return true;
            }
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "na.ag(" + ')');
      }
   }
}
