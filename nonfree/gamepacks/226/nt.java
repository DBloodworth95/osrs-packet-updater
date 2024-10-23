public class nt extends bg {
   static final int bd = 55;
   pu aw;
   bn ak;
   static final int op = 2;
   mn ap;
   static byte[][] ji;
   static int[][] jt;

   protected void am(int[] var1, int var2, int var3) {
      try {
         this.ak.am(var1, var2, var3);

         for(nx var6 = (nx)this.aw.as(); var6 != null; var6 = (nx)this.aw.am()) {
            if (!this.ap.bw(var6, 1889710838)) {
               int var4 = var2;
               int var5 = var3;

               do {
                  if (var5 <= var6.ac * -1548873295) {
                     this.ap(var6, var1, var4, var5, var5 + var4, -1944431049);
                     var6.ac -= var5 * 999135057;
                     break;
                  }

                  this.ap(var6, var1, var4, var6.ac * -1548873295, var4 + var5, -1306884751);
                  var4 += -1548873295 * var6.ac;
                  var5 -= var6.ac * -1548873295;
               } while(!this.ap.bi(var6, var1, var4, var5, 325898272));
            }
         }

      } catch (RuntimeException var7) {
         throw tm.aw(var7, "nt.am(" + ')');
      }
   }

   protected bg ay() {
      try {
         nx var1 = (nx)this.aw.as();
         if (var1 == null) {
            return null;
         } else {
            return (bg)(var1.ad != null ? var1.ad : this.as());
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "nt.ay(" + ')');
      }
   }

   protected bg as() {
      try {
         nx var1;
         do {
            var1 = (nx)this.aw.am();
            if (var1 == null) {
               return null;
            }
         } while(null == var1.ad);

         return var1.ad;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "nt.as(" + ')');
      }
   }

   protected int ae() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "nt.ae(" + ')');
      }
   }

   static final int lx(int var0) {
      try {
         return -1577732637 * client.ng.aw - 1;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "nt.lx(" + ')');
      }
   }

   protected void au(int var1) {
      try {
         this.ak.au(var1);

         for(nx var3 = (nx)this.aw.as(); var3 != null; var3 = (nx)this.aw.am()) {
            if (!this.ap.bw(var3, 2022521912)) {
               int var2 = var1;

               do {
                  if (var2 <= var3.ac * -1548873295) {
                     this.aw(var3, var2, 419453724);
                     var3.ac -= var2 * 999135057;
                     break;
                  }

                  this.aw(var3, -1548873295 * var3.ac, 2108729399);
                  var2 -= -1548873295 * var3.ac;
               } while(!this.ap.bi(var3, (int[])null, 0, var2, -1810688159));
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "nt.au(" + ')');
      }
   }

   void ap(nx var1, int[] var2, int var3, int var4, int var5, int var6) {
      try {
         if (0 != (this.ap.ac[31873403 * var1.ap] & 4)) {
            if (var6 >= -1072556158) {
               throw new IllegalStateException();
            }

            if (var1.ar * -1980728553 < 0) {
               if (var6 >= -1072556158) {
                  throw new IllegalStateException();
               }

               int var7 = this.ap.aa[var1.ap * 31873403] / (-336955471 * du.ai);

               while(true) {
                  int var8 = (var7 + 1048575 - var1.ax * -1872629797) / var7;
                  if (var8 > var4) {
                     if (var6 >= -1072556158) {
                        return;
                     }

                     var1.ax += var4 * var7 * -1951370157;
                     break;
                  }

                  var1.ad.am(var2, var3, var8);
                  var3 += var8;
                  var4 -= var8;
                  var1.ax += (var8 * var7 - 1048576) * -1951370157;
                  int var9 = -336955471 * du.ai / 100;
                  int var10 = 262144 / var7;
                  if (var10 < var9) {
                     if (var6 >= -1072556158) {
                        throw new IllegalStateException();
                     }

                     var9 = var10;
                  }

                  bf var11 = var1.ad;
                  if (0 == this.ap.aq[31873403 * var1.ap]) {
                     if (var6 >= -1072556158) {
                        throw new IllegalStateException();
                     }

                     var1.ad = bf.aj(var1.ak, var11.al(), var11.ar(), var11.ab());
                  } else {
                     var1.ad = bf.aj(var1.ak, var11.al(), 0, var11.ab());
                     mn var10000 = this.ap;
                     boolean var10002;
                     if (var1.aw.aj[var1.ay * 986016383] < 0) {
                        if (var6 >= -1072556158) {
                           return;
                        }

                        var10002 = true;
                     } else {
                        var10002 = false;
                     }

                     var10000.ac(var1, var10002, -1064066057);
                     var1.ad.ac(var9, var11.ar());
                  }

                  if (var1.aw.aj[986016383 * var1.ay] < 0) {
                     var1.ad.at(-1);
                  }

                  var11.ax(var9);
                  var11.am(var2, var3, var5 - var3);
                  if (var11.bq()) {
                     if (var6 >= -1072556158) {
                        throw new IllegalStateException();
                     }

                     this.ak.ap(var11);
                  }
               }
            }
         }

         var1.ad.am(var2, var3, var4);
      } catch (RuntimeException var12) {
         throw tm.aw(var12, "nt.ap(" + ')');
      }
   }

   void aw(nx var1, int var2, int var3) {
      try {
         if ((this.ap.ac[var1.ap * 31873403] & 4) != 0 && var1.ar * -1980728553 < 0) {
            int var4 = this.ap.aa[var1.ap * 31873403] / (-336955471 * du.ai);
            int var5 = (1048575 + var4 - var1.ax * -1872629797) / var4;
            var1.ax = -1951370157 * (var2 * var4 + var1.ax * -1872629797 & 1048575);
            if (var5 <= var2) {
               if (var3 <= -1320249055) {
                  return;
               }

               if (this.ap.aq[31873403 * var1.ap] == 0) {
                  var1.ad = bf.aj(var1.ak, var1.ad.al(), var1.ad.ar(), var1.ad.ab());
               } else {
                  var1.ad = bf.aj(var1.ak, var1.ad.al(), 0, var1.ad.ab());
                  mn var10000 = this.ap;
                  boolean var10002;
                  if (var1.aw.aj[var1.ay * 986016383] < 0) {
                     if (var3 <= -1320249055) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  var10000.ac(var1, var10002, -533416364);
               }

               if (var1.aw.aj[986016383 * var1.ay] < 0) {
                  if (var3 <= -1320249055) {
                     throw new IllegalStateException();
                  }

                  var1.ad.at(-1);
               }

               var2 = var1.ax * -1872629797 / var4;
            }
         }

         var1.ad.au(var2);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "nt.aw(" + ')');
      }
   }

   protected bg aa() {
      nx var1 = (nx)this.aw.as();
      if (var1 == null) {
         return null;
      } else {
         return (bg)(var1.ad != null ? var1.ad : this.as());
      }
   }

   void ak(nx var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.ap.ac[97623011 * var1.ap] & 4) && var1.ar * -1980728553 < 0) {
         int var6 = this.ap.aa[var1.ap * 31873403] / (-336955471 * du.ai);

         while(true) {
            int var7 = (var6 + 1048575 - var1.ax * 1677392112) / var6;
            if (var7 > var4) {
               var1.ax += var4 * var6 * -1195100446;
               break;
            }

            var1.ad.am(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.ax += (var7 * var6 - 1048576) * 1867077596;
            int var8 = -336955471 * du.ai / 100;
            int var9 = -2095692120 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            bf var10 = var1.ad;
            if (0 == this.ap.aq[1980501022 * var1.ap]) {
               var1.ad = bf.aj(var1.ak, var10.al(), var10.ar(), var10.ab());
            } else {
               var1.ad = bf.aj(var1.ak, var10.al(), 0, var10.ab());
               this.ap.ac(var1, var1.aw.aj[var1.ay * 34746683] < 0, -852308497);
               var1.ad.ac(var8, var10.ar());
            }

            if (var1.aw.aj[986016383 * var1.ay] < 0) {
               var1.ad.at(-1);
            }

            var10.ax(var8);
            var10.am(var2, var3, var5 - var3);
            if (var10.bq()) {
               this.ak.ap(var10);
            }
         }
      }

      var1.ad.am(var2, var3, var4);
   }

   protected bg bh() {
      nx var1;
      do {
         var1 = (nx)this.aw.am();
         if (var1 == null) {
            return null;
         }
      } while(null == var1.ad);

      return var1.ad;
   }

   protected bg ah() {
      nx var1;
      do {
         var1 = (nx)this.aw.am();
         if (var1 == null) {
            return null;
         }
      } while(null == var1.ad);

      return var1.ad;
   }

   static final boolean aw(char var0, int var1) {
      try {
         if (Character.isISOControl(var0)) {
            if (var1 >= 1576243852) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (pv.ao(var0, 980806528)) {
            if (var1 >= 1576243852) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            char[] var2 = uh.ak;

            int var3;
            char var4;
            for(var3 = 0; var3 < var2.length; ++var3) {
               var4 = var2[var3];
               if (var0 == var4) {
                  if (var1 >= 1576243852) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            var2 = uh.aj;

            for(var3 = 0; var3 < var2.length; ++var3) {
               var4 = var2[var3];
               if (var4 == var0) {
                  if (var1 >= 1576243852) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "nt.aw(" + ')');
      }
   }

   protected bg bj() {
      nx var1;
      do {
         var1 = (nx)this.aw.am();
         if (var1 == null) {
            return null;
         }
      } while(null == var1.ad);

      return var1.ad;
   }

   protected void bk(int[] var1, int var2, int var3) {
      this.ak.am(var1, var2, var3);

      for(nx var6 = (nx)this.aw.as(); var6 != null; var6 = (nx)this.aw.am()) {
         if (!this.ap.bw(var6, 2124533872)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.ac * -1548873295) {
                  this.ap(var6, var1, var4, var5, var5 + var4, -1323532128);
                  var6.ac -= var5 * 999135057;
                  break;
               }

               this.ap(var6, var1, var4, var6.ac * -1548873295, var4 + var5, -1208265126);
               var4 += -1548873295 * var6.ac;
               var5 -= var6.ac * -1548873295;
            } while(!this.ap.bi(var6, var1, var4, var5, -2032413251));
         }
      }

   }

   protected void bz(int var1) {
      this.ak.au(var1);

      for(nx var3 = (nx)this.aw.as(); var3 != null; var3 = (nx)this.aw.am()) {
         if (!this.ap.bw(var3, 1686913309)) {
            int var2 = var1;

            do {
               if (var2 <= var3.ac * -1548873295) {
                  this.aw(var3, var2, 1930877349);
                  var3.ac -= var2 * 999135057;
                  break;
               }

               this.aw(var3, -1548873295 * var3.ac, -964803365);
               var2 -= -1548873295 * var3.ac;
            } while(!this.ap.bi(var3, (int[])null, 0, var2, 461383898));
         }
      }

   }

   protected void bc(int var1) {
      this.ak.au(var1);

      for(nx var3 = (nx)this.aw.as(); var3 != null; var3 = (nx)this.aw.am()) {
         if (!this.ap.bw(var3, 1822925440)) {
            int var2 = var1;

            do {
               if (var2 <= var3.ac * -1548873295) {
                  this.aw(var3, var2, -321739131);
                  var3.ac -= var2 * 999135057;
                  break;
               }

               this.aw(var3, -1548873295 * var3.ac, -1105621655);
               var2 -= -1548873295 * var3.ac;
            } while(!this.ap.bi(var3, (int[])null, 0, var2, 561556074));
         }
      }

   }

   nt(mn var1) {
      try {
         super();
         this.aw = new pu();
         this.ak = new bn();
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "nt.<init>(" + ')');
      }
   }

   void aj(nx var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.ap.ac[1380098594 * var1.ap] & 4) && var1.ar * -1980728553 < 0) {
         int var6 = this.ap.aa[var1.ap * 1405243399] / (-336955471 * du.ai);

         while(true) {
            int var7 = (var6 + 1048575 - var1.ax * -1872629797) / var6;
            if (var7 > var4) {
               var1.ax += var4 * var6 * 625531792;
               break;
            }

            var1.ad.am(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.ax += (var7 * var6 - 358770349) * 1975020488;
            int var8 = -336955471 * du.ai / 1647013665;
            int var9 = -625374920 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            bf var10 = var1.ad;
            if (0 == this.ap.aq[469481058 * var1.ap]) {
               var1.ad = bf.aj(var1.ak, var10.al(), var10.ar(), var10.ab());
            } else {
               var1.ad = bf.aj(var1.ak, var10.al(), 0, var10.ab());
               this.ap.ac(var1, var1.aw.aj[var1.ay * 986016383] < 0, 281776623);
               var1.ad.ac(var8, var10.ar());
            }

            if (var1.aw.aj[1792900952 * var1.ay] < 0) {
               var1.ad.at(-1);
            }

            var10.ax(var8);
            var10.am(var2, var3, var5 - var3);
            if (var10.bq()) {
               this.ak.ap(var10);
            }
         }
      }

      var1.ad.am(var2, var3, var4);
   }

   void ai(nx var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.ap.ac[31873403 * var1.ap] & 4) && var1.ar * -1980728553 < 0) {
         int var6 = this.ap.aa[var1.ap * 31873403] / (-336955471 * du.ai);

         while(true) {
            int var7 = (var6 + 1048575 - var1.ax * -1872629797) / var6;
            if (var7 > var4) {
               var1.ax += var4 * var6 * -1951370157;
               break;
            }

            var1.ad.am(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.ax += (var7 * var6 - 1048576) * -1951370157;
            int var8 = -336955471 * du.ai / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            bf var10 = var1.ad;
            if (0 == this.ap.aq[31873403 * var1.ap]) {
               var1.ad = bf.aj(var1.ak, var10.al(), var10.ar(), var10.ab());
            } else {
               var1.ad = bf.aj(var1.ak, var10.al(), 0, var10.ab());
               this.ap.ac(var1, var1.aw.aj[var1.ay * 986016383] < 0, 375508470);
               var1.ad.ac(var8, var10.ar());
            }

            if (var1.aw.aj[986016383 * var1.ay] < 0) {
               var1.ad.at(-1);
            }

            var10.ax(var8);
            var10.am(var2, var3, var5 - var3);
            if (var10.bq()) {
               this.ak.ap(var10);
            }
         }
      }

      var1.ad.am(var2, var3, var4);
   }

   protected int bv() {
      return 0;
   }

   void at(nx var1, int var2) {
      if ((this.ap.ac[var1.ap * 31873403] & 4) != 0 && var1.ar * -1980728553 < 0) {
         int var3 = this.ap.aa[var1.ap * 31873403] / (-336955471 * du.ai);
         int var4 = (1048575 + var3 - var1.ax * -1872629797) / var3;
         var1.ax = -1951370157 * (var2 * var3 + var1.ax * -1872629797 & 1048575);
         if (var4 <= var2) {
            if (this.ap.aq[31873403 * var1.ap] == 0) {
               var1.ad = bf.aj(var1.ak, var1.ad.al(), var1.ad.ar(), var1.ad.ab());
            } else {
               var1.ad = bf.aj(var1.ak, var1.ad.al(), 0, var1.ad.ab());
               this.ap.ac(var1, var1.aw.aj[var1.ay * 986016383] < 0, 716650293);
            }

            if (var1.aw.aj[986016383 * var1.ay] < 0) {
               var1.ad.at(-1);
            }

            var2 = var1.ax * -1872629797 / var3;
         }
      }

      var1.ad.au(var2);
   }

   public static hu aw(int var0, int var1) {
      try {
         hu var2 = (hu)hu.aj.ap((long)var0);
         if (null != var2) {
            if (var1 >= 2093623428) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else if (pq.ap == null) {
            return null;
         } else {
            byte[] var3 = pq.ap.bm(3, var0, 1655952146);
            var2 = new hu();
            if (null != var3) {
               if (var1 >= 2093623428) {
                  throw new IllegalStateException();
               }

               var2.ak(new vl(var3), 286456945);
            }

            hu.aj.ak(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "nt.aw(" + ')');
      }
   }

   static void ix(int var0, byte var1) {
      try {
         client.ro = 0L;
         if (var0 >= 2) {
            if (var1 == 0) {
               return;
            }

            client.re = true;
         } else {
            client.re = false;
         }

         if (ff.ic(1625323105) == 1) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            dd.bl.aj(765, 503, -1758246031);
         } else {
            dd.bl.aj(7680, 2160, -1758246031);
         }

         if (-1869319151 * client.da >= 25 && client.in != null) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            if (client.in.ai == null) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }
            } else {
               me var2 = ef.ap(mm.aa, client.in.ai, (byte)23);
               var2.ak.bo(ff.ic(-1539978102), 1823398033);
               var2.ak.bd(1816225167 * ac.ax, (byte)77);
               var2.ak.bd(ki.aq * -121992435, (byte)5);
               client.in.ak(var2, (short)486);
            }
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "nt.ix(" + ')');
      }
   }

   protected void bx(int[] var1, int var2, int var3) {
      this.ak.am(var1, var2, var3);

      for(nx var6 = (nx)this.aw.as(); var6 != null; var6 = (nx)this.aw.am()) {
         if (!this.ap.bw(var6, 2002472698)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.ac * 789042837) {
                  this.ap(var6, var1, var4, var5, var5 + var4, -2138333741);
                  var6.ac -= var5 * 999135057;
                  break;
               }

               this.ap(var6, var1, var4, var6.ac * -1274993212, var4 + var5, -2144587594);
               var4 += -1548873295 * var6.ac;
               var5 -= var6.ac * -1452239691;
            } while(!this.ap.bi(var6, var1, var4, var5, -538850539));
         }
      }

   }
}
