import java.util.LinkedList;

public abstract class la {
   int af;
   int aq;
   short[][][] ah;
   int at;
   int au;
   int ar;
   int al;
   int ad;
   byte[][][] ab;
   short[][][] ap;
   int ax;
   byte[][][] az;
   lp[][][][] aa;
   boolean ai;
   boolean ao;
   static final int bx = 44;

   int bk() {
      return 396801991 * this.at;
   }

   boolean as(byte var1) {
      try {
         boolean var10000;
         if (this.ai) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            if (this.ao) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "la.as(" + ')');
      }
   }

   void ay(po var1, byte var2) {
      try {
         if (this.as((byte)7)) {
            if (var2 != 14) {
               throw new IllegalStateException();
            }
         } else {
            byte[] var3 = var1.bt(254431501 * this.al, 194517835 * this.ad, (byte)-74);
            if (null != var3) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               this.ae(new vf(var3), 2131625972);
               this.ai = true;
               this.ao = true;
            }

         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "la.ay(" + ')');
      }
   }

   boolean bd() {
      return this.ai && this.ao;
   }

   void av(int var1, int var2, vf var3, int var4) {
      try {
         int var5 = var3.cv(952452697);
         if (var5 == 0) {
            if (var4 <= 1429407159) {
               throw new IllegalStateException();
            }
         } else {
            if ((var5 & 1) != 0) {
               if (var4 <= 1429407159) {
                  throw new IllegalStateException();
               }

               this.aw(var1, var2, var3, var5, 1808722743);
            } else {
               this.an(var1, var2, var3, var5, 955104181);
            }

         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "la.av(" + ')');
      }
   }

   la() {
      try {
         super();
         this.al = 1611930171;
         this.ad = -1398740579;
         new LinkedList();
         this.ai = false;
         this.ao = false;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "la.<init>(" + ')');
      }
   }

   void an(int var1, int var2, vf var3, int var4, int var5) {
      try {
         int var6 = ((var4 & 24) >> 3) + 1;
         boolean var10000;
         if (0 != (var4 & 2)) {
            if (var5 != 955104181) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var7 = var10000;
         if ((var4 & 4) != 0) {
            if (var5 != 955104181) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var8 = var10000;
         this.ah[0][var1][var2] = (short)var3.ct(-2139685547);
         int var9;
         int var10;
         int var12;
         if (var7) {
            if (var5 != 955104181) {
               throw new IllegalStateException();
            }

            var9 = var3.cv(952452697);

            for(var10 = 0; var10 < var9; ++var10) {
               if (var5 != 955104181) {
                  throw new IllegalStateException();
               }

               int var11 = var3.ct(-1946028031);
               if (0 != var11) {
                  if (var5 != 955104181) {
                     throw new IllegalStateException();
                  }

                  this.ap[var10][var1][var2] = (short)var11;
                  var12 = var3.cv(952452697);
                  this.ab[var10][var1][var2] = (byte)(var12 >> 2);
                  this.az[var10][var1][var2] = (byte)(var12 & 3);
               }
            }
         }

         if (var8) {
            if (var5 != 955104181) {
               throw new IllegalStateException();
            }

            for(var9 = 0; var9 < var6; ++var9) {
               var10 = var3.cv(952452697);
               if (0 == var10) {
                  if (var5 != 955104181) {
                     throw new IllegalStateException();
                  }
               } else {
                  lp[] var16 = this.aa[var9][var1][var2] = new lp[var10];

                  for(var12 = 0; var12 < var10; ++var12) {
                     if (var5 != 955104181) {
                        throw new IllegalStateException();
                     }

                     int var13 = var3.dt(1901107238);
                     int var14 = var3.cv(952452697);
                     var16[var12] = new lp(var13, var14 >> 2, var14 & 3);
                  }
               }
            }
         }

      } catch (RuntimeException var15) {
         throw vk.ae(var15, "la.an(" + ')');
      }
   }

   abstract void ae(vf var1, int var2);

   int ak(int var1) {
      try {
         return 1218392023 * this.af;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "la.ak(" + ')');
      }
   }

   void aw(int var1, int var2, vf var3, int var4, int var5) {
      try {
         boolean var6 = 0 != (var4 & 2);
         if (var6) {
            this.ap[0][var1][var2] = (short)var3.ct(-2008920728);
         }

         this.ah[0][var1][var2] = (short)var3.ct(-1397031157);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "la.aw(" + ')');
      }
   }

   abstract void af(vf var1);

   void bg(int var1, int var2, vf var3, int var4) {
      boolean var5 = 0 != (var4 & 2);
      if (var5) {
         this.ap[0][var1][var2] = (short)var3.ct(-1753421953);
      }

      this.ah[0][var1][var2] = (short)var3.ct(-1645463601);
   }

   boolean bh() {
      return this.ai && this.ao;
   }

   void bw() {
      this.ah = (short[][][])null;
      this.ap = (short[][][])null;
      this.ab = (byte[][][])null;
      this.az = (byte[][][])null;
      this.aa = (lp[][][][])null;
      this.ai = false;
      this.ao = false;
   }

   void bx(po var1) {
      if (!this.as((byte)109)) {
         byte[] var2 = var1.bt(254431501 * this.al, 194517835 * this.ad, (byte)-34);
         if (null != var2) {
            this.ae(new vf(var2), 2051265311);
            this.ai = true;
            this.ao = true;
         }

      }
   }

   void bf(po var1) {
      if (!this.as((byte)54)) {
         byte[] var2 = var1.bt(254431501 * this.al, 194517835 * this.ad, (byte)47);
         if (null != var2) {
            this.ae(new vf(var2), 2091747864);
            this.ai = true;
            this.ao = true;
         }

      }
   }

   void bm(po var1) {
      if (!this.as((byte)114)) {
         byte[] var2 = var1.bt(254431501 * this.al, 194517835 * this.ad, (byte)96);
         if (null != var2) {
            this.ae(new vf(var2), 1956416929);
            this.ai = true;
            this.ao = true;
         }

      }
   }

   void bs(po var1) {
      if (!this.as((byte)75)) {
         byte[] var2 = var1.bt(254431501 * this.al, 194517835 * this.ad, (byte)-45);
         if (null != var2) {
            this.ae(new vf(var2), 2012998604);
            this.ai = true;
            this.ao = true;
         }

      }
   }

   int bo() {
      return 1218392023 * this.af;
   }

   abstract void at(vf var1);

   void bj() {
      this.ah = (short[][][])null;
      this.ap = (short[][][])null;
      this.ab = (byte[][][])null;
      this.az = (byte[][][])null;
      this.aa = (lp[][][][])null;
      this.ai = false;
      this.ao = false;
   }

   void bp(int var1, int var2, vf var3) {
      int var4 = var3.cv(952452697);
      if (var4 != 0) {
         if ((var4 & 1) != 0) {
            this.aw(var1, var2, var3, var4, 1808722743);
         } else {
            this.an(var1, var2, var3, var4, 955104181);
         }

      }
   }

   void by(int var1, int var2, vf var3) {
      int var4 = var3.cv(952452697);
      if (var4 != 0) {
         if ((var4 & 1) != 0) {
            this.aw(var1, var2, var3, var4, 1808722743);
         } else {
            this.an(var1, var2, var3, var4, 955104181);
         }

      }
   }

   void bb(int var1, int var2, vf var3) {
      int var4 = var3.cv(952452697);
      if (var4 != 0) {
         if ((var4 & 1) != 0) {
            this.aw(var1, var2, var3, var4, 1808722743);
         } else {
            this.an(var1, var2, var3, var4, 955104181);
         }

      }
   }

   void ba() {
      this.ah = (short[][][])null;
      this.ap = (short[][][])null;
      this.ab = (byte[][][])null;
      this.az = (byte[][][])null;
      this.aa = (lp[][][][])null;
      this.ai = false;
      this.ao = false;
   }

   void aj(int var1) {
      try {
         this.ah = (short[][][])null;
         this.ap = (short[][][])null;
         this.ab = (byte[][][])null;
         this.az = (byte[][][])null;
         this.aa = (lp[][][][])null;
         this.ai = false;
         this.ao = false;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "la.aj(" + ')');
      }
   }

   void bl(int var1, int var2, vf var3, int var4) {
      boolean var5 = 0 != (var4 & 2);
      if (var5) {
         this.ap[0][var1][var2] = (short)var3.ct(-1747356471);
      }

      this.ah[0][var1][var2] = (short)var3.ct(-1333057507);
   }

   void bz(int var1, int var2, vf var3, int var4) {
      boolean var5 = 0 != (var4 & 2);
      if (var5) {
         this.ap[0][var1][var2] = (short)var3.ct(-1427190988);
      }

      this.ah[0][var1][var2] = (short)var3.ct(-1899255958);
   }

   int bn(byte var1) {
      try {
         return 396801991 * this.at;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "la.bn(" + ')');
      }
   }

   void br(int var1, int var2, vf var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = 0 != (var4 & 2);
      boolean var7 = (var4 & 4) != 0;
      this.ah[0][var1][var2] = (short)var3.ct(-1415734245);
      int var8;
      int var9;
      int var11;
      if (var6) {
         var8 = var3.cv(952452697);

         for(var9 = 0; var9 < var8; ++var9) {
            int var10 = var3.ct(-1468188196);
            if (0 != var10) {
               this.ap[var9][var1][var2] = (short)var10;
               var11 = var3.cv(952452697);
               this.ab[var9][var1][var2] = (byte)(var11 >> 2);
               this.az[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if (var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.cv(952452697);
            if (0 != var9) {
               lp[] var14 = this.aa[var8][var1][var2] = new lp[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.dt(-695099718);
                  int var13 = var3.cv(952452697);
                  var14[var11] = new lp(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   int bt() {
      return 1218392023 * this.af;
   }

   int bv() {
      return 1218392023 * this.af;
   }

   void bu(int var1, int var2, vf var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = 0 != (var4 & 2);
      boolean var7 = (var4 & 4) != 0;
      this.ah[0][var1][var2] = (short)var3.ct(-1318512909);
      int var8;
      int var9;
      int var11;
      if (var6) {
         var8 = var3.cv(952452697);

         for(var9 = 0; var9 < var8; ++var9) {
            int var10 = var3.ct(-2141260849);
            if (0 != var10) {
               this.ap[var9][var1][var2] = (short)var10;
               var11 = var3.cv(952452697);
               this.ab[var9][var1][var2] = (byte)(var11 >> 2);
               this.az[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if (var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.cv(952452697);
            if (0 != var9) {
               lp[] var14 = this.aa[var8][var1][var2] = new lp[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.dt(-1025085312);
                  int var13 = var3.cv(952452697);
                  var14[var11] = new lp(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   int bq() {
      return 396801991 * this.at;
   }

   void bi(int var1, int var2, vf var3, int var4) {
      boolean var5 = 0 != (var4 & 2);
      if (var5) {
         this.ap[0][var1][var2] = (short)var3.ct(-1631734565);
      }

      this.ah[0][var1][var2] = (short)var3.ct(-1946935202);
   }

   static void ag(do var0, dt var1, int var2, int var3, int var4) {
      try {
         Object[] var5 = var0.ac;
         mp.au = 0;
         rt.al = 0;
         int var6 = -1;
         int[] var7 = var1.ag;
         int[] var8 = var1.am;
         byte var9 = -1;
         cs.ad = 0;
         cs.aj = false;
         boolean var10 = false;
         int var11 = 0;
         boolean var24 = false;

         label1508: {
            label1509: {
               try {
                  int var14;
                  try {
                     var24 = true;
                     cs.am = new int[220676683 * var1.aq];
                     int var12 = 0;
                     cs.ax = new String[var1.af * 354370245];
                     int var30 = 0;

                     int var15;
                     String var40;
                     for(var14 = 1; var14 < var5.length; ++var14) {
                        if (var5[var14] instanceof Integer) {
                           if (var4 != 388340503) {
                              throw new IllegalStateException();
                           }

                           var15 = (Integer)var5[var14];
                           if (-2147483647 == var15) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              var15 = -626806317 * var0.am;
                           }

                           if (-2147483646 == var15) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              var15 = var0.ax * 1773728275;
                           }

                           int var10000;
                           if (-2147483645 == var15) {
                              if (var0.ag != null) {
                                 if (var4 != 388340503) {
                                    return;
                                 }

                                 var10000 = -1565465557 * var0.ag.bh;
                              } else {
                                 var10000 = -1;
                              }

                              var15 = var10000;
                           }

                           if (var15 == -2147483644) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              var15 = var0.aq * 434880321;
                           }

                           if (-2147483643 == var15) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              if (var0.ag != null) {
                                 if (var4 != 388340503) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = -1614754997 * var0.ag.bd;
                              } else {
                                 var10000 = -1;
                              }

                              var15 = var10000;
                           }

                           if (var15 == -2147483642) {
                              if (var0.at != null) {
                                 if (var4 != 388340503) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = -1565465557 * var0.at.bh;
                              } else {
                                 var10000 = -1;
                              }

                              var15 = var10000;
                           }

                           if (var15 == -2147483641) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              if (var0.at != null) {
                                 if (var4 != 388340503) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = var0.at.bd * -1614754997;
                              } else {
                                 var10000 = -1;
                              }

                              var15 = var10000;
                           }

                           if (-2147483640 == var15) {
                              if (var4 != 388340503) {
                                 return;
                              }

                              var15 = -1780301913 * var0.au;
                           }

                           if (-2147483639 == var15) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              var15 = var0.ar * -2119636903;
                           }

                           if (-2147483638 == var15) {
                              var15 = 1119692151 * var0.af;
                           }

                           cs.am[var12++] = var15;
                        } else if (var5[var14] instanceof String) {
                           if (var4 != 388340503) {
                              throw new IllegalStateException();
                           }

                           var40 = (String)var5[var14];
                           if (var40.equals("event_opbase")) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              var40 = var0.al;
                           }

                           cs.ax[var30++] = var40;
                        }
                     }

                     cs.an = var0.ad * 1938312227;

                     while(true) {
                        ++var11;
                        if (var11 > var2) {
                           throw new RuntimeException();
                        }

                        ++var6;
                        int var28 = var7[var6];
                        if (var28 >= 100) {
                           boolean var39;
                           if (1 == var1.am[var6]) {
                              if (var4 != 388340503) {
                                 return;
                              }

                              var39 = true;
                           } else {
                              var39 = false;
                           }

                           var15 = af.am(var28, var1, var39, 1286083242);
                           switch(var15) {
                           case 0:
                              var24 = false;
                              break label1508;
                           case 1:
                           default:
                              break;
                           case 2:
                              throw new IllegalStateException();
                           }
                        } else {
                           if (var4 != 388340503) {
                              throw new IllegalStateException();
                           }

                           if (var28 == 0) {
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = var8[var6];
                           } else if (var28 == 1) {
                              if (var4 != 388340503) {
                                 return;
                              }

                              var14 = var8[var6];
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = no.am[var14];
                           } else if (var28 == 2) {
                              if (var4 != 388340503) {
                                 return;
                              }

                              var14 = var8[var6];
                              no.am[var14] = cs.at[(mp.au -= -1856457959) * 844691753];
                              fz.nz(var14, -1007464264);
                           } else if (3 == var28) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var1.ax[var6];
                           } else if (6 == var28) {
                              var6 += var8[var6];
                           } else if (var28 == 7) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              mp.au -= 582051378;
                              if (cs.at[1 + mp.au * 844691753] != cs.at[mp.au * 844691753]) {
                                 var6 += var8[var6];
                              }
                           } else if (var28 == 8) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              mp.au -= 582051378;
                              if (cs.at[mp.au * 844691753] == cs.at[mp.au * 844691753 + 1]) {
                                 if (var4 != 388340503) {
                                    throw new IllegalStateException();
                                 }

                                 var6 += var8[var6];
                              }
                           } else if (9 == var28) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              mp.au -= 582051378;
                              if (cs.at[mp.au * 844691753] < cs.at[mp.au * 844691753 + 1]) {
                                 var6 += var8[var6];
                              }
                           } else if (10 == var28) {
                              if (var4 != 388340503) {
                                 return;
                              }

                              mp.au -= 582051378;
                              if (cs.at[mp.au * 844691753] > cs.at[mp.au * 844691753 + 1]) {
                                 if (var4 != 388340503) {
                                    throw new IllegalStateException();
                                 }

                                 var6 += var8[var6];
                              }
                           } else if (21 == var28) {
                              if (-1952627047 * cs.ad == 0) {
                                 if (var4 == 388340503) {
                                    var24 = false;
                                    break label239;
                                 }

                                 throw new IllegalStateException();
                              }

                              cg var38 = cs.ah[(cs.ad -= 630173097) * -1952627047];
                              var1 = var38.ac;
                              var7 = var1.ag;
                              var8 = var1.am;
                              var6 = var38.ae * -2038646995;
                              cs.am = var38.ag;
                              cs.ax = var38.am;
                           } else if (var28 == 25) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              var14 = var8[var6];
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = fi.ac(var14, (byte)0);
                           } else if (27 == var28) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              var14 = var8[var6];
                              ga.ae(var14, cs.at[(mp.au -= -1856457959) * 844691753], (byte)10);
                           } else if (31 == var28) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              mp.au -= 582051378;
                              if (cs.at[mp.au * 844691753] <= cs.at[mp.au * 844691753 + 1]) {
                                 var6 += var8[var6];
                              }
                           } else if (var28 == 32) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              mp.au -= 582051378;
                              if (cs.at[mp.au * 844691753] >= cs.at[1 + mp.au * 844691753]) {
                                 var6 += var8[var6];
                              }
                           } else if (var28 == 33) {
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = cs.am[var8[var6]];
                           } else if (var28 == 34) {
                              if (var4 != 388340503) {
                                 return;
                              }

                              cs.am[var8[var6]] = cs.at[(mp.au -= -1856457959) * 844691753];
                           } else if (35 == var28) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = cs.ax[var8[var6]];
                           } else if (var28 == 36) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              cs.ax[var8[var6]] = cs.ar[(rt.al -= -1975882559) * -515103935];
                           } else if (37 == var28) {
                              var14 = var8[var6];
                              rt.al -= -1975882559 * var14;
                              var40 = gn.ac(cs.ar, rt.al * -515103935, var14, (byte)56);
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var40;
                           } else if (38 == var28) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              mp.au -= -1856457959;
                           } else if (var28 == 39) {
                              if (var4 != 388340503) {
                                 throw new IllegalStateException();
                              }

                              rt.al -= -1975882559;
                           } else {
                              int var18;
                              if (var28 != 40) {
                                 if (42 == var28) {
                                    if (var4 != 388340503) {
                                       throw new IllegalStateException();
                                    }

                                    cs.at[(mp.au += -1856457959) * 844691753 - 1] = iu.qz.ae(var8[var6], (byte)54);
                                 } else if (43 == var28) {
                                    if (var4 != 388340503) {
                                       return;
                                    }

                                    iu.qz.ac(var8[var6], cs.at[(mp.au -= -1856457959) * 844691753], 1732408259);
                                 } else if (44 == var28) {
                                    if (var4 != 388340503) {
                                       throw new IllegalStateException();
                                    }

                                    var14 = var8[var6] >> 16;
                                    var15 = var8[var6] & '\uffff';
                                    int var31 = cs.at[(mp.au -= -1856457959) * 844691753];
                                    if (var31 < 0) {
                                       throw new RuntimeException();
                                    }

                                    if (var4 != 388340503) {
                                       throw new IllegalStateException();
                                    }

                                    if (var31 > 5000) {
                                       if (var4 != 388340503) {
                                          throw new IllegalStateException();
                                       }

                                       throw new RuntimeException();
                                    }

                                    cs.aq[var14] = var31;
                                    byte var34 = -1;
                                    if (var15 == 105) {
                                       if (var4 != 388340503) {
                                          throw new IllegalStateException();
                                       }

                                       var34 = 0;
                                    }

                                    for(var18 = 0; var18 < var31; ++var18) {
                                       if (var4 != 388340503) {
                                          throw new IllegalStateException();
                                       }

                                       cs.af[var14][var18] = var34;
                                    }
                                 } else if (45 == var28) {
                                    if (var4 != 388340503) {
                                       throw new IllegalStateException();
                                    }

                                    var14 = var8[var6];
                                    var15 = cs.at[(mp.au -= -1856457959) * 844691753];
                                    if (var15 < 0) {
                                       throw new RuntimeException();
                                    }

                                    if (var15 >= cs.aq[var14]) {
                                       if (var4 != 388340503) {
                                          throw new IllegalStateException();
                                       }

                                       throw new RuntimeException();
                                    }

                                    cs.at[(mp.au += -1856457959) * 844691753 - 1] = cs.af[var14][var15];
                                 } else if (var28 == 46) {
                                    var14 = var8[var6];
                                    mp.au -= 582051378;
                                    var15 = cs.at[844691753 * mp.au];
                                    if (var15 < 0) {
                                       break;
                                    }

                                    if (var4 != 388340503) {
                                       return;
                                    }

                                    if (var15 >= cs.aq[var14]) {
                                       if (var4 != 388340503) {
                                          throw new IllegalStateException();
                                       }
                                       break;
                                    }

                                    cs.af[var14][var15] = cs.at[mp.au * 844691753 + 1];
                                 } else {
                                    String var32;
                                    if (47 == var28) {
                                       if (var4 != 388340503) {
                                          throw new IllegalStateException();
                                       }

                                       var32 = iu.qz.aq(var8[var6], (byte)103);
                                       if (var32 == null) {
                                          var32 = ok.al;
                                       }

                                       cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var32;
                                    } else if (var28 == 48) {
                                       iu.qz.ax(var8[var6], cs.ar[(rt.al -= -1975882559) * -515103935], (byte)97);
                                    } else if (49 == var28) {
                                       if (var4 != 388340503) {
                                          throw new IllegalStateException();
                                       }

                                       var32 = iu.qz.am(var8[var6], (byte)-1);
                                       cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var32;
                                    } else if (var28 == 50) {
                                       iu.qz.ag(var8[var6], cs.ar[(rt.al -= -1975882559) * -515103935], 2050667786);
                                    } else if (60 == var28) {
                                       if (var4 != 388340503) {
                                          return;
                                       }

                                       ui var35 = var1.ar[var8[var6]];
                                       th var43 = (th)var35.ac((long)cs.at[(mp.au -= -1856457959) * 844691753]);
                                       if (var43 != null) {
                                          if (var4 != 388340503) {
                                             return;
                                          }

                                          var6 += var43.ac;
                                       }
                                    } else {
                                       Integer var36;
                                       if (74 == var28) {
                                          if (var4 != 388340503) {
                                             return;
                                          }

                                          var36 = ov.az.ax(var8[var6], 477199739);
                                          if (var36 == null) {
                                             if (var4 != 388340503) {
                                                throw new IllegalStateException();
                                             }

                                             cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1;
                                          } else {
                                             cs.at[(mp.au += -1856457959) * 844691753 - 1] = var36;
                                          }
                                       } else {
                                          if (76 != var28) {
                                             throw new IllegalStateException();
                                          }

                                          if (var4 != 388340503) {
                                             return;
                                          }

                                          var36 = kv.qn.ac(var8[var6], 754853309);
                                          if (var36 == null) {
                                             if (var4 != 388340503) {
                                                throw new IllegalStateException();
                                             }

                                             cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1;
                                          } else {
                                             cs.at[(mp.au += -1856457959) * 844691753 - 1] = var36;
                                          }
                                       }
                                    }
                                 }
                              } else {
                                 var14 = var8[var6];
                                 dt var42 = ay.ac(var14, 1222515241);
                                 int[] var16 = new int[220676683 * var42.aq];
                                 String[] var17 = new String[354370245 * var42.af];

                                 for(var18 = 0; var18 < var42.at * 250127111; ++var18) {
                                    if (var4 != 388340503) {
                                       return;
                                    }

                                    var16[var18] = cs.at[var18 + (mp.au * 844691753 - 250127111 * var42.at)];
                                 }

                                 for(var18 = 0; var18 < -177872443 * var42.au; ++var18) {
                                    if (var4 != 388340503) {
                                       throw new IllegalStateException();
                                    }

                                    var17[var18] = cs.ar[rt.al * -515103935 - -177872443 * var42.au + var18];
                                 }

                                 mp.au -= 538824879 * var42.at;
                                 rt.al -= 1437618565 * var42.au;
                                 cg var37 = new cg();
                                 var37.ac = var1;
                                 var37.ae = 2144055461 * var6;
                                 var37.ag = cs.am;
                                 var37.am = cs.ax;
                                 cs.ah[(cs.ad += 630173097) * -1952627047 - 1] = var37;
                                 var1 = var42;
                                 var7 = var42.ag;
                                 var8 = var42.am;
                                 var6 = -1;
                                 cs.am = var16;
                                 cs.ax = var17;
                              }
                           }
                        }
                     }

                     throw new RuntimeException();
                  } catch (Exception var25) {
                     var10 = true;
                     StringBuilder var13 = new StringBuilder(30);
                     var13.append("").append(var1.hk).append(" ");

                     for(var14 = cs.ad * -1952627047 - 1; var14 >= 0; --var14) {
                        var13.append("").append(cs.ah[var14].ac.hk).append(" ");
                     }

                     var13.append("").append(var9);
                     gc.ac(var13.toString(), var25, (byte)-124);
                     var24 = false;
                     break label1509;
                  }
               } finally {
                  if (var24) {
                     while(cs.aw.size() > 0) {
                        if (var4 != 388340503) {
                           throw new IllegalStateException();
                        }

                        ev var20 = (ev)cs.aw.remove(0);
                        ip.mb(var20.ac((byte)-41), var20.ae((byte)-60), var20.ag((byte)92), var20.am((byte)-50), "", 1766394039);
                     }

                     if (cs.aj) {
                        if (var4 != 388340503) {
                           return;
                        }

                        cs.aj = false;
                        dn.ot((byte)-103);
                     }

                     if (!var10) {
                        if (var4 != 388340503) {
                           throw new IllegalStateException();
                        }

                        if (var3 > 0) {
                           if (var4 != 388340503) {
                              throw new IllegalStateException();
                           }

                           if (var11 >= var3) {
                              gc.ac("Warning: Script " + var1.ae + " finished at op count " + var11 + " of max " + var2, (Throwable)null, (byte)-38);
                           }
                        }
                     }

                  }
               }

               while(cs.aw.size() > 0) {
                  if (var4 != 388340503) {
                     return;
                  }

                  ev var41 = (ev)cs.aw.remove(0);
                  ip.mb(var41.ac((byte)-66), var41.ae((byte)95), var41.ag((byte)111), var41.am((byte)-52), "", 1157517858);
               }

               if (cs.aj) {
                  if (var4 != 388340503) {
                     throw new IllegalStateException();
                  }

                  cs.aj = false;
                  dn.ot((byte)-102);
               }

               if (!var10) {
                  if (var4 != 388340503) {
                     return;
                  }

                  if (var3 > 0) {
                     if (var4 != 388340503) {
                        throw new IllegalStateException();
                     }

                     if (var11 >= var3) {
                        if (var4 != 388340503) {
                           throw new IllegalStateException();
                        }

                        gc.ac("Warning: Script " + var1.ae + " finished at op count " + var11 + " of max " + var2, (Throwable)null, (byte)-70);
                     }
                  }
               }

               return;
            }

            while(cs.aw.size() > 0) {
               if (var4 != 388340503) {
                  throw new IllegalStateException();
               }

               ev var29 = (ev)cs.aw.remove(0);
               ip.mb(var29.ac((byte)-61), var29.ae((byte)15), var29.ag((byte)45), var29.am((byte)-21), "", 1847385319);
            }

            if (cs.aj) {
               if (var4 != 388340503) {
                  throw new IllegalStateException();
               }

               cs.aj = false;
               dn.ot((byte)53);
            }

            if (!var10) {
               if (var4 != 388340503) {
                  throw new IllegalStateException();
               }

               if (var3 > 0) {
                  if (var4 != 388340503) {
                     throw new IllegalStateException();
                  }

                  if (var11 >= var3) {
                     if (var4 != 388340503) {
                        throw new IllegalStateException();
                     }

                     gc.ac("Warning: Script " + var1.ae + " finished at op count " + var11 + " of max " + var2, (Throwable)null, (byte)-50);
                  }
               }
            }

            return;
         }

         while(cs.aw.size() > 0) {
            if (var4 != 388340503) {
               return;
            }

            ev var33 = (ev)cs.aw.remove(0);
            ip.mb(var33.ac((byte)86), var33.ae((byte)97), var33.ag((byte)47), var33.am((byte)-126), "", 1189019363);
         }

         if (cs.aj) {
            if (var4 != 388340503) {
               return;
            }

            cs.aj = false;
            dn.ot((byte)23);
         }

         if (!var10 && var3 > 0) {
            if (var4 != 388340503) {
               throw new IllegalStateException();
            }

            if (var11 >= var3) {
               if (var4 != 388340503) {
                  return;
               }

               gc.ac("Warning: Script " + var1.ae + " finished at op count " + var11 + " of max " + var2, (Throwable)null, (byte)-61);
            }
         }

      } catch (RuntimeException var27) {
         throw vk.ae(var27, "la.ag(" + ')');
      }
   }

   int bc() {
      return 396801991 * this.at;
   }

   int cn() {
      return 1629983977 * this.at;
   }

   int be() {
      return 396801991 * this.at;
   }

   static int ae(byte var0) {
      try {
         return bd.dw.length;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "la.ae(" + ')');
      }
   }
}
