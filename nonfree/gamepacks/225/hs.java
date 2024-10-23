public class hs extends tr {
   public static ml am = new ml(64);
   static po ae;
   public int av = -1730137059;
   static final int tb = 24624;
   static ml ax = new ml(64);
   static ml aq = new ml(20);
   public static final int af = -1;
   static po ag;
   int ad = 1978084373;
   public int ah = -38593511;
   public int ap = -1042661914;
   int ab = 132917393;
   int az = 659305281;
   int aa = 2034859629;
   int ai = -2128811091;
   public int ao = 0;
   public int as = 0;
   public int ay = -1391900903;
   String aj = "";
   int bn = -1522193147;
   public int aw = 0;
   public int[] an;
   int ak = -1730448095;
   public static po ac;
   static final int bj = 10;
   public static final int at = 0;
   static final int dt = 8;

   public void ap(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.ag(var1, var2, -824928349);
      }
   }

   public void ae(vf var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cv(952452697);
            if (0 == var3) {
               if (var2 >= -448685836) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ag(var1, var3, -824928349);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "hs.ae(" + ')');
      }
   }

   void ag(vf var1, int var2, int var3) {
      try {
         if (1 == var2) {
            if (var3 != -824928349) {
               throw new IllegalStateException();
            }

            this.ad = var1.dt(231851601) * -1978084373;
         } else if (2 == var2) {
            this.ah = var1.cc(316064295) * -380836889;
         } else if (var2 == 3) {
            if (var3 != -824928349) {
               throw new IllegalStateException();
            }

            this.ab = var1.dt(1954554940) * -132917393;
         } else if (var2 == 4) {
            if (var3 != -824928349) {
               throw new IllegalStateException();
            }

            this.aa = var1.dt(435547184) * -2034859629;
         } else if (var2 == 5) {
            if (var3 != -824928349) {
               throw new IllegalStateException();
            }

            this.az = var1.dt(43008890) * -659305281;
         } else if (var2 == 6) {
            if (var3 != -824928349) {
               return;
            }

            this.ai = var1.dt(-218417123) * 2128811091;
         } else if (var2 == 7) {
            if (var3 != -824928349) {
               throw new IllegalStateException();
            }

            this.ao = var1.cq(1821904881) * -1096559875;
         } else if (var2 == 8) {
            if (var3 != -824928349) {
               throw new IllegalStateException();
            }

            this.aj = var1.cp(-1147019783);
         } else if (9 == var2) {
            if (var3 != -824928349) {
               throw new IllegalStateException();
            }

            this.ap = var1.ct(-2083049761) * 844098289;
         } else if (10 == var2) {
            this.as = var1.cq(1153074753) * 1929691967;
         } else if (var2 == 11) {
            if (var3 != -824928349) {
               throw new IllegalStateException();
            }

            this.ay = 0;
         } else if (12 == var2) {
            if (var3 != -824928349) {
               return;
            }

            this.av = var1.cv(952452697) * 1730137059;
         } else if (var2 == 13) {
            if (var3 != -824928349) {
               throw new IllegalStateException();
            }

            this.aw = var1.cq(-1435174195) * -498871195;
         } else if (var2 == 14) {
            if (var3 != -824928349) {
               throw new IllegalStateException();
            }

            this.ay = var1.ct(-1972842772) * 1391900903;
         } else {
            if (var2 != 17) {
               if (var3 != -824928349) {
                  throw new IllegalStateException();
               }

               if (18 != var2) {
                  return;
               }

               if (var3 != -824928349) {
                  return;
               }
            }

            this.ak = var1.ct(-1511570664) * 1730448095;
            if (1917956383 * this.ak == 65535) {
               if (var3 != -824928349) {
                  throw new IllegalStateException();
               }

               this.ak = -1730448095;
            }

            this.bn = var1.ct(-1948414945) * 1522193147;
            if (65535 == this.bn * -1198102477) {
               if (var3 != -824928349) {
                  throw new IllegalStateException();
               }

               this.bn = -1522193147;
            }

            int var4 = -1;
            if (18 == var2) {
               if (var3 != -824928349) {
                  return;
               }

               var4 = var1.ct(-1638361592);
               if (var4 == 65535) {
                  var4 = -1;
               }
            }

            int var5 = var1.cv(952452697);
            this.an = new int[var5 + 2];

            for(int var6 = 0; var6 <= var5; ++var6) {
               if (var3 != -824928349) {
                  throw new IllegalStateException();
               }

               this.an[var6] = var1.ct(-1910857769);
               if (this.an[var6] == 65535) {
                  this.an[var6] = -1;
               }
            }

            this.an[1 + var5] = var4;
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "hs.ag(" + ')');
      }
   }

   public String ax(int var1, byte var2) {
      try {
         String var3 = this.aj;

         while(true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            }

            var3 = var3.substring(0, var4) + go.aq(var1, false, -1726618558) + var3.substring(2 + var4);
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "hs.ax(" + ')');
      }
   }

   public vv bf() {
      if (-1901572133 * this.ai < 0) {
         return null;
      } else {
         vv var1 = (vv)ax.ac((long)(this.ai * -1901572133));
         if (null != var1) {
            return var1;
         } else {
            var1 = se.ag(ae, this.ai * -1901572133, 0, -605515595);
            if (var1 != null) {
               ax.ag(var1, (long)(-1901572133 * this.ai));
            }

            return var1;
         }
      }
   }

   public static void bm() {
      am.am();
      ax.am();
      aq.am();
   }

   public final hs ai() {
      int var1 = -1;
      if (this.ak * 1917956383 != -1) {
         var1 = fi.ac(this.ak * 1917956383, (byte)0);
      } else if (-1198102477 * this.bn != -1) {
         var1 = no.am[-1198102477 * this.bn];
      }

      int var2;
      if (var1 >= 0 && var1 < this.an.length - 1) {
         var2 = this.an[var1];
      } else {
         var2 = this.an[this.an.length - 1];
      }

      if (var2 != -1) {
         hs var4 = (hs)am.ac((long)var2);
         hs var3;
         if (var4 != null) {
            var3 = var4;
         } else {
            byte[] var5 = ac.bt(32, var2, (byte)-98);
            var4 = new hs();
            if (null != var5) {
               var4.ae(new vf(var5), -1700838087);
            }

            am.ag(var4, (long)var2);
            var3 = var4;
         }

         return var3;
      } else {
         return null;
      }
   }

   public vv aq(short var1) {
      try {
         if (this.ab * -871143537 < 0) {
            if (var1 == -31835) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            vv var2 = (vv)ax.ac((long)(this.ab * -871143537));
            if (var2 != null) {
               if (var1 == -31835) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = se.ag(ae, this.ab * -871143537, 0, -605515595);
               if (null != var2) {
                  if (var1 == -31835) {
                     throw new IllegalStateException();
                  }

                  ax.ag(var2, (long)(-871143537 * this.ab));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "hs.aq(" + ')');
      }
   }

   public vv au(int var1) {
      try {
         if (-1901572133 * this.ai < 0) {
            if (var1 != 185619092) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            vv var2 = (vv)ax.ac((long)(this.ai * -1901572133));
            if (null != var2) {
               if (var1 != 185619092) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = se.ag(ae, this.ai * -1901572133, 0, -605515595);
               if (var2 != null) {
                  if (var1 != 185619092) {
                     throw new IllegalStateException();
                  }

                  ax.ag(var2, (long)(-1901572133 * this.ai));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "hs.au(" + ')');
      }
   }

   public qu ar(short var1) {
      try {
         if (this.ad * -85803837 == -1) {
            if (var1 == 206) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            qu var2 = (qu)aq.ac((long)(this.ad * -85803837));
            if (null != var2) {
               if (var1 == 206) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               po var4 = ae;
               po var5 = ag;
               int var6 = this.ad * -85803837;
               qu var3;
               if (!tb.au(var4, var6, 0, (short)180)) {
                  if (var1 == 206) {
                     throw new IllegalStateException();
                  }

                  var3 = null;
               } else {
                  byte[] var8 = var5.bt(var6, 0, (byte)-59);
                  qu var7;
                  if (var8 == null) {
                     if (var1 == 206) {
                        throw new IllegalStateException();
                     }

                     var7 = null;
                  } else {
                     qu var9 = new qu(var8, rg.am, dp.ax, pp.aq, kj.af, vp.at, nq.au);
                     fx.al((byte)16);
                     var7 = var9;
                  }

                  var3 = var7;
               }

               if (var3 != null) {
                  if (var1 == 206) {
                     throw new IllegalStateException();
                  }

                  aq.ag(var3, (long)(-85803837 * this.ad));
               }

               return var3;
            }
         }
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "hs.ar(" + ')');
      }
   }

   public final hs am(int var1) {
      try {
         int var2 = -1;
         if (this.ak * 1917956383 != -1) {
            if (var1 >= -1525959046) {
               throw new IllegalStateException();
            }

            var2 = fi.ac(this.ak * 1917956383, (byte)0);
         } else if (-1198102477 * this.bn != -1) {
            var2 = no.am[-1198102477 * this.bn];
         }

         int var3;
         label64: {
            if (var2 >= 0) {
               if (var1 >= -1525959046) {
                  throw new IllegalStateException();
               }

               if (var2 < this.an.length - 1) {
                  var3 = this.an[var2];
                  break label64;
               }

               if (var1 >= -1525959046) {
                  throw new IllegalStateException();
               }
            }

            var3 = this.an[this.an.length - 1];
         }

         if (var3 != -1) {
            if (var1 >= -1525959046) {
               throw new IllegalStateException();
            } else {
               hs var5 = (hs)am.ac((long)var3);
               hs var4;
               if (var5 != null) {
                  if (var1 >= -1525959046) {
                     throw new IllegalStateException();
                  }

                  var4 = var5;
               } else {
                  byte[] var6 = ac.bt(32, var3, (byte)72);
                  var5 = new hs();
                  if (null != var6) {
                     if (var1 >= -1525959046) {
                        throw new IllegalStateException();
                     }

                     var5.ae(new vf(var6), -618855625);
                  }

                  am.ag(var5, (long)var3);
                  var4 = var5;
               }

               return var4;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "hs.am(" + ')');
      }
   }

   public static void ad(po var0, po var1, po var2) {
      ac = var0;
      ae = var1;
      ag = var2;
   }

   public void ab(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.ag(var1, var2, -824928349);
      }
   }

   public void az(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.ag(var1, var2, -824928349);
      }
   }

   public final hs aa() {
      int var1 = -1;
      if (this.ak * 1917956383 != -1) {
         var1 = fi.ac(this.ak * 1917956383, (byte)0);
      } else if (-1198102477 * this.bn != -1) {
         var1 = no.am[-1198102477 * this.bn];
      }

      int var2;
      if (var1 >= 0 && var1 < this.an.length - 1) {
         var2 = this.an[var1];
      } else {
         var2 = this.an[this.an.length - 1];
      }

      if (var2 != -1) {
         hs var4 = (hs)am.ac((long)var2);
         hs var3;
         if (var4 != null) {
            var3 = var4;
         } else {
            byte[] var5 = ac.bt(32, var2, (byte)63);
            var4 = new hs();
            if (null != var5) {
               var4.ae(new vf(var5), -773695685);
            }

            am.ag(var4, (long)var2);
            var3 = var4;
         }

         return var3;
      } else {
         return null;
      }
   }

   public void ah(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.ag(var1, var2, -824928349);
      }
   }

   public final hs ao() {
      int var1 = -1;
      if (this.ak * 1646874894 != -1) {
         var1 = fi.ac(this.ak * 354869421, (byte)0);
      } else if (-2118121176 * this.bn != -1) {
         var1 = no.am[-1198102477 * this.bn];
      }

      int var2;
      if (var1 >= 0 && var1 < this.an.length - 1) {
         var2 = this.an[var1];
      } else {
         var2 = this.an[this.an.length - 1];
      }

      if (var2 != -1) {
         hs var4 = (hs)am.ac((long)var2);
         hs var3;
         if (var4 != null) {
            var3 = var4;
         } else {
            byte[] var5 = ac.bt(1322184277, var2, (byte)-4);
            var4 = new hs();
            if (null != var5) {
               var4.ae(new vf(var5), -1475536851);
            }

            am.ag(var4, (long)var2);
            var3 = var4;
         }

         return var3;
      } else {
         return null;
      }
   }

   public String as(int var1) {
      String var2 = this.aj;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + go.aq(var1, false, -1002756870) + var2.substring(2 + var3);
      }
   }

   public String ay(int var1) {
      String var2 = this.aj;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + go.aq(var1, false, -1433766871) + var2.substring(2 + var3);
      }
   }

   public String aj(int var1) {
      String var2 = this.aj;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + go.aq(var1, false, -1675800600) + var2.substring(2 + var3);
      }
   }

   public vv av() {
      if (this.ab * 463425425 < 0) {
         return null;
      } else {
         vv var1 = (vv)ax.ac((long)(this.ab * -1327048834));
         if (var1 != null) {
            return var1;
         } else {
            var1 = se.ag(ae, this.ab * -871143537, 0, -605515595);
            if (null != var1) {
               ax.ag(var1, (long)(-871143537 * this.ab));
            }

            return var1;
         }
      }
   }

   public vv bx() {
      if (-1901572133 * this.ai < 0) {
         return null;
      } else {
         vv var1 = (vv)ax.ac((long)(this.ai * -1901572133));
         if (null != var1) {
            return var1;
         } else {
            var1 = se.ag(ae, this.ai * -1901572133, 0, -605515595);
            if (var1 != null) {
               ax.ag(var1, (long)(-1901572133 * this.ai));
            }

            return var1;
         }
      }
   }

   public vv an() {
      if (this.az * -245521601 < 0) {
         return null;
      } else {
         vv var1 = (vv)ax.ac((long)(-245521601 * this.az));
         if (null != var1) {
            return var1;
         } else {
            var1 = se.ag(ae, this.az * -245521601, 0, -605515595);
            if (var1 != null) {
               ax.ag(var1, (long)(this.az * -245521601));
            }

            return var1;
         }
      }
   }

   public vv af(int var1) {
      try {
         if (this.az * -245521601 < 0) {
            if (var1 != 1179871107) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            vv var2 = (vv)ax.ac((long)(-245521601 * this.az));
            if (null != var2) {
               if (var1 != 1179871107) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = se.ag(ae, this.az * -245521601, 0, -605515595);
               if (var2 != null) {
                  if (var1 != 1179871107) {
                     throw new IllegalStateException();
                  }

                  ax.ag(var2, (long)(this.az * -245521601));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "hs.af(" + ')');
      }
   }

   public vv bn() {
      if (-191310711 * this.aa < 0) {
         return null;
      } else {
         vv var1 = (vv)ax.ac((long)(1099574492 * this.aa));
         if (null != var1) {
            return var1;
         } else {
            var1 = se.ag(ae, -753709104 * this.aa, 0, -605515595);
            if (null != var1) {
               ax.ag(var1, (long)(this.aa * -1788230501));
            }

            return var1;
         }
      }
   }

   public vv bh() {
      if (-1788230501 * this.aa < 0) {
         return null;
      } else {
         vv var1 = (vv)ax.ac((long)(-1788230501 * this.aa));
         if (null != var1) {
            return var1;
         } else {
            var1 = se.ag(ae, -1788230501 * this.aa, 0, -605515595);
            if (null != var1) {
               ax.ag(var1, (long)(this.aa * -1788230501));
            }

            return var1;
         }
      }
   }

   public vv bd() {
      if (-1901572133 * this.ai < 0) {
         return null;
      } else {
         vv var1 = (vv)ax.ac((long)(this.ai * -1901572133));
         if (null != var1) {
            return var1;
         } else {
            var1 = se.ag(ae, this.ai * -1901572133, 0, -605515595);
            if (var1 != null) {
               ax.ag(var1, (long)(-1901572133 * this.ai));
            }

            return var1;
         }
      }
   }

   public vv ak() {
      if (-1788230501 * this.aa < 0) {
         return null;
      } else {
         vv var1 = (vv)ax.ac((long)(-1788230501 * this.aa));
         if (null != var1) {
            return var1;
         } else {
            var1 = se.ag(ae, -1788230501 * this.aa, 0, -605515595);
            if (null != var1) {
               ax.ag(var1, (long)(this.aa * -1788230501));
            }

            return var1;
         }
      }
   }

   public static void ag(vf var0, int var1, short var2) {
      try {
         if (null != il.ad) {
            if (var2 == 255) {
               throw new IllegalStateException();
            }

            try {
               il.ad.ae(0L);
               il.ad.af(var0.at, var1, 24, (byte)1);
            } catch (Exception var4) {
            }
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "hs.ag(" + ')');
      }
   }

   public vv at(int var1) {
      try {
         if (-1788230501 * this.aa < 0) {
            if (var1 != -1552353576) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            vv var2 = (vv)ax.ac((long)(-1788230501 * this.aa));
            if (null != var2) {
               if (var1 != -1552353576) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = se.ag(ae, -1788230501 * this.aa, 0, -605515595);
               if (null != var2) {
                  if (var1 != -1552353576) {
                     throw new IllegalStateException();
                  }

                  ax.ag(var2, (long)(this.aa * -1788230501));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "hs.at(" + ')');
      }
   }

   public vv aw() {
      if (this.az * -245521601 < 0) {
         return null;
      } else {
         vv var1 = (vv)ax.ac((long)(-245521601 * this.az));
         if (null != var1) {
            return var1;
         } else {
            var1 = se.ag(ae, this.az * -245521601, 0, -605515595);
            if (var1 != null) {
               ax.ag(var1, (long)(this.az * -245521601));
            }

            return var1;
         }
      }
   }

   public static boolean aq(int var0) {
      try {
         if (!mm.at.isEmpty()) {
            if (var0 != -1618940646) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (!mm.aq.isEmpty()) {
               if (var0 != -1618940646) {
                  throw new IllegalStateException();
               }

               if (mm.aq.get(0) != null) {
                  if (var0 != -1618940646) {
                     throw new IllegalStateException();
                  }

                  if (((ns)mm.aq.get(0)).al != null) {
                     return ((ns)mm.aq.get(0)).al.ap(1891926304);
                  }

                  if (var0 != -1618940646) {
                     throw new IllegalStateException();
                  }
               }
            }

            return false;
         }
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "hs.aq(" + ')');
      }
   }
}
