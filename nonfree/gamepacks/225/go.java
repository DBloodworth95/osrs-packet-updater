public class go {
   int[] az;
   boolean ae;
   boolean ag;
   long[] av;
   public int ax;
   public String aq;
   int af;
   public boolean at;
   public byte au;
   public byte ar;
   public byte al;
   public byte ad;
   public int ah;
   long[] ap;
   public byte[] ab;
   static final int bm = 38;
   long am;
   public int[] ai;
   public boolean[] ao;
   public int as;
   public int ay;
   public int aj;
   static final int ac = 6;
   int[] aa;
   static vv km;
   ui ak;
   static final byte bh = 126;
   public String[] aw;
   public String[] an;
   static cz my;
   static final byte bx = 0;

   int bk(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == -661187552 ? -1 : (1 << 1 + var4) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = this.aa[var1];
      if (var2 == (var8 & var7)) {
         return -1;
      } else {
         var8 &= ~var7;
         this.aa[var1] = var8 | var2;
         return var1;
      }
   }

   void ac(int var1, byte var2) {
      try {
         if (this.ae) {
            if (this.ap != null) {
               if (var2 >= 8) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.ap, 0, this.ap = new long[var1], 0, 1736396441 * this.ah);
            } else {
               this.ap = new long[var1];
            }
         }

         if (this.ag) {
            if (var2 >= 8) {
               throw new IllegalStateException();
            }

            if (null != this.aw) {
               System.arraycopy(this.aw, 0, this.aw = new String[var1], 0, this.ah * 1736396441);
            } else {
               this.aw = new String[var1];
            }
         }

         if (null != this.ab) {
            if (var2 >= 8) {
               return;
            }

            System.arraycopy(this.ab, 0, this.ab = new byte[var1], 0, 1736396441 * this.ah);
         } else {
            this.ab = new byte[var1];
         }

         if (null != this.aa) {
            if (var2 >= 8) {
               return;
            }

            System.arraycopy(this.aa, 0, this.aa = new int[var1], 0, this.ah * 1736396441);
         } else {
            this.aa = new int[var1];
         }

         if (null != this.ai) {
            if (var2 >= 8) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.ai, 0, this.ai = new int[var1], 0, this.ah * 1736396441);
         } else {
            this.ai = new int[var1];
         }

         if (this.ao != null) {
            if (var2 >= 8) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.ao, 0, this.ao = new boolean[var1], 0, this.ah * 1736396441);
         } else {
            this.ao = new boolean[var1];
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "go.ac(" + ')');
      }
   }

   void cy(vf var1) {
      int var2 = var1.cv(952452697);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.cv(952452697);
         if ((var3 & 1) != 0) {
            this.ae = true;
         }

         if (0 != (var3 & 2)) {
            this.ag = true;
         }

         if (!this.ae) {
            this.ap = null;
            this.av = null;
         }

         if (!this.ag) {
            this.aw = null;
            this.an = null;
         }

         this.ax = var1.cz(-1734056172) * -747236235;
         this.af = var1.cz(-1734056172) * 416027496;
         if (var2 <= 3 && 0 != this.af * 820717211) {
            this.af += 2062552711;
         }

         this.ah = var1.ct(-1688656702) * -437222155;
         this.aj = var1.cv(952452697) * 1414955935;
         this.aq = var1.cs(-1168881182);
         if (var2 >= 4) {
            var1.cz(-1734056172);
         }

         this.at = var1.cv(952452697) == 1;
         this.au = var1.cg((short)-12120);
         this.ar = var1.cg((short)19548);
         this.al = var1.cg((short)-402);
         this.ad = var1.cg((short)-14505);
         int var4;
         if (-531505132 * this.ah > 0) {
            if (this.ae && (null == this.ap || this.ap.length < this.ah * 366831559)) {
               this.ap = new long[85311877 * this.ah];
            }

            if (this.ag && (null == this.aw || this.aw.length < this.ah * -77800907)) {
               this.aw = new String[258560481 * this.ah];
            }

            if (null == this.ab || this.ab.length < 1736396441 * this.ah) {
               this.ab = new byte[this.ah * 1736396441];
            }

            if (null == this.aa || this.aa.length < 513717859 * this.ah) {
               this.aa = new int[this.ah * 1131292755];
            }

            if (this.ai == null || this.ai.length < this.ah * -719949168) {
               this.ai = new int[1736396441 * this.ah];
            }

            if (null == this.ao || this.ao.length < this.ah * -1201782481) {
               this.ao = new boolean[1024611936 * this.ah];
            }

            for(var4 = 0; var4 < 1460127757 * this.ah; ++var4) {
               if (this.ae) {
                  this.ap[var4] = var1.cw(1695589009);
               }

               if (this.ag) {
                  this.aw[var4] = var1.ca(211634176);
               }

               this.ab[var4] = var1.cg((short)-18626);
               if (var2 >= 2) {
                  this.aa[var4] = var1.cz(-1734056172);
               }

               if (var2 >= 5) {
                  this.ai[var4] = var1.ct(-1434804324);
               } else {
                  this.ai[var4] = 0;
               }

               if (var2 >= 6) {
                  this.ao[var4] = var1.cv(952452697) == 1;
               } else {
                  this.ao[var4] = false;
               }
            }

            this.au((short)3566);
         }

         if (this.aj * 1121871845 > 0) {
            if (this.ae && (this.av == null || this.av.length < this.aj * 1121871845)) {
               this.av = new long[1121871845 * this.aj];
            }

            if (this.ag && (null == this.an || this.an.length < 1121871845 * this.aj)) {
               this.an = new String[1759317903 * this.aj];
            }

            for(var4 = 0; var4 < -1067984733 * this.aj; ++var4) {
               if (this.ae) {
                  this.av[var4] = var1.cw(1959618829);
               }

               if (this.ag) {
                  this.an[var4] = var1.ca(803123919);
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.ct(-1405224684);
            if (var4 > 0) {
               this.ak = new ui(var4 < 16 ? at.ax(var4, 1329904683) : 16);

               while(var4-- > 0) {
                  int var5 = var1.cz(-1734056172);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (0 == var7) {
                     int var8 = var1.cz(-1734056172);
                     this.ak.ae(new th(var8), (long)var6);
                  } else if (1 == var7) {
                     long var10 = var1.cw(1928207332);
                     this.ak.ae(new tv(var10), (long)var6);
                  } else if (var7 == 2) {
                     String var11 = var1.cs(-1815026941);
                     this.ak.ae(new ts(var11), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   public int[] bx() {
      if (this.az == null) {
         String[] var1 = new String[this.ah * -1450930994];
         this.az = new int[this.ah * 1750540676];

         for(int var2 = 0; var2 < 1111685357 * this.ah; this.az[var2] = var2++) {
            var1[var2] = this.aw[var2];
            if (null != var1[var2]) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         fn.ae(var1, this.az, (byte)26);
      }

      return this.az;
   }

   public int am(int var1, int var2, int var3, int var4) {
      try {
         int var10000;
         if (31 == var3) {
            if (var4 != 1989739566) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << 1 + var3) - 1;
         }

         int var5 = var10000;
         return (this.aa[var1] & var5) >>> var2;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "go.am(" + ')');
      }
   }

   public int[] bf() {
      if (this.az == null) {
         String[] var1 = new String[this.ah * 1736396441];
         this.az = new int[this.ah * 1736396441];

         for(int var2 = 0; var2 < 1736396441 * this.ah; this.az[var2] = var2++) {
            var1[var2] = this.aw[var2];
            if (null != var1[var2]) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         fn.ae(var1, this.az, (byte)38);
      }

      return this.az;
   }

   public int[] aq(byte var1) {
      try {
         if (this.az == null) {
            if (var1 >= 8) {
               throw new IllegalStateException();
            }

            String[] var2 = new String[this.ah * 1736396441];
            this.az = new int[this.ah * 1736396441];

            for(int var3 = 0; var3 < 1736396441 * this.ah; this.az[var3] = var3++) {
               if (var1 >= 8) {
                  throw new IllegalStateException();
               }

               var2[var3] = this.aw[var3];
               if (null != var2[var3]) {
                  if (var1 >= 8) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = var2[var3].toLowerCase();
               }
            }

            fn.ae(var2, this.az, (byte)-20);
         }

         return this.az;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "go.aq(" + ')');
      }
   }

   boolean az(int var1, int var2, int var3) {
      try {
         if (this.ak != null) {
            if (var3 == 1444846889) {
               throw new IllegalStateException();
            }

            to var4 = this.ak.ac((long)var1);
            if (null != var4) {
               if (var3 == 1444846889) {
                  throw new IllegalStateException();
               }

               if (var4 instanceof th) {
                  if (var3 == 1444846889) {
                     throw new IllegalStateException();
                  }

                  th var5 = (th)var4;
                  if (var2 == var5.ac) {
                     if (var3 == 1444846889) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var5.ac = var2;
                  return true;
               }

               var4.jb();
            }
         } else {
            this.ak = new ui(4);
         }

         this.ak.ae(new th(var2), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "go.az(" + ')');
      }
   }

   void at(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 != -620477369) {
               throw new IllegalStateException();
            }

            if (var1 < this.ah * 1736396441) {
               this.ah -= -1207884375;
               this.az = null;
               if (0 == 1736396441 * this.ah) {
                  this.ap = null;
                  this.aw = null;
                  this.ab = null;
                  this.aa = null;
                  this.ai = null;
                  this.ao = null;
                  this.as = -174920065;
                  this.ay = -324572389;
               } else {
                  System.arraycopy(this.ab, var1 + 1, this.ab, var1, this.ah * 1736396441 - var1);
                  System.arraycopy(this.aa, var1 + 1, this.aa, var1, 1736396441 * this.ah - var1);
                  System.arraycopy(this.ai, 1 + var1, this.ai, var1, 1736396441 * this.ah - var1);
                  System.arraycopy(this.ao, var1 + 1, this.ao, var1, this.ah * 1736396441 - var1);
                  if (this.ap != null) {
                     if (var2 != -620477369) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(this.ap, 1 + var1, this.ap, var1, 1736396441 * this.ah - var1);
                  }

                  if (null != this.aw) {
                     System.arraycopy(this.aw, 1 + var1, this.aw, var1, 1736396441 * this.ah - var1);
                  }

                  this.au((short)19661);
               }

               return;
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "go.at(" + ')');
      }
   }

   void aj(int var1) {
      if (this.ae) {
         if (this.ap != null) {
            System.arraycopy(this.ap, 0, this.ap = new long[var1], 0, 1736396441 * this.ah);
         } else {
            this.ap = new long[var1];
         }
      }

      if (this.ag) {
         if (null != this.aw) {
            System.arraycopy(this.aw, 0, this.aw = new String[var1], 0, this.ah * 1736396441);
         } else {
            this.aw = new String[var1];
         }
      }

      if (null != this.ab) {
         System.arraycopy(this.ab, 0, this.ab = new byte[var1], 0, 1736396441 * this.ah);
      } else {
         this.ab = new byte[var1];
      }

      if (null != this.aa) {
         System.arraycopy(this.aa, 0, this.aa = new int[var1], 0, this.ah * 1736396441);
      } else {
         this.aa = new int[var1];
      }

      if (null != this.ai) {
         System.arraycopy(this.ai, 0, this.ai = new int[var1], 0, this.ah * 1736396441);
      } else {
         this.ai = new int[var1];
      }

      if (this.ao != null) {
         System.arraycopy(this.ao, 0, this.ao = new boolean[var1], 0, this.ah * 1736396441);
      } else {
         this.ao = new boolean[var1];
      }

   }

   void ar(long var1, String var3, int var4) {
      try {
         if (var3 != null) {
            if (var4 <= -1652195437) {
               throw new IllegalStateException();
            }

            if (var3.length() == 0) {
               var3 = null;
            }
         }

         boolean var10000;
         if (var1 > 0L) {
            if (var4 <= -1652195437) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         if (var10000 != this.ae) {
            if (var4 > -1652195437) {
               throw new RuntimeException("");
            }
         } else {
            var10000 = this.ag;
            boolean var10001;
            if (null != var3) {
               if (var4 <= -1652195437) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if (var10000 != var10001) {
               if (var4 > -1652195437) {
                  throw new RuntimeException("");
               }
            } else {
               label100: {
                  label110: {
                     if (var1 > 0L) {
                        if (var4 <= -1652195437) {
                           throw new IllegalStateException();
                        }

                        if (this.av == null) {
                           break label110;
                        }

                        if (var4 <= -1652195437) {
                           return;
                        }

                        if (this.aj * 1121871845 >= this.av.length) {
                           break label110;
                        }

                        if (var4 <= -1652195437) {
                           throw new IllegalStateException();
                        }
                     }

                     if (null == var3) {
                        break label100;
                     }

                     if (var4 <= -1652195437) {
                        throw new IllegalStateException();
                     }

                     if (null != this.an) {
                        if (this.aj * 1121871845 < this.an.length) {
                           break label100;
                        }

                        if (var4 <= -1652195437) {
                           return;
                        }
                     }
                  }

                  this.ae(this.aj * 1121871845 + 5, -2131781669);
               }

               if (this.av != null) {
                  this.av[this.aj * 1121871845] = var1;
               }

               if (this.an != null) {
                  if (var4 <= -1652195437) {
                     throw new IllegalStateException();
                  }

                  this.an[1121871845 * this.aj] = var3;
               }

               this.aj += 1307803117;
            }
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "go.ar(" + ')');
      }
   }

   static final void kx(int var0, int var1, boolean var2, short var3) {
      try {
         if (var2) {
            if (var3 != 289) {
               throw new IllegalStateException();
            }

            if (1630795209 * da.iy == var0) {
               if (var3 != 289) {
                  throw new IllegalStateException();
               }

               if (ct.ih * -937355973 == var1) {
                  return;
               }
            }
         }

         da.iy = var0 * -1906035591;
         ct.ih = var1 * 500759539;
         ry.hp(25, 1635374227);
         client.df = true;
         me.jg(ok.ap, true, (byte)-103);
         int var4 = du.js.af * 2072219689;
         int var5 = 1001606641 * du.js.at;
         du.js.af = (var0 - 6) * 384327880;
         du.js.at = (var1 - 6) * 1617959048;
         int var6 = du.js.af * 2072219689 - var4;
         int var7 = 1001606641 * du.js.at - var5;
         var4 = du.js.af * 2072219689;
         var5 = du.js.at * 1001606641;

         int var8;
         int var10;
         int[] var10000;
         for(var8 = 0; var8 < 65536; ++var8) {
            if (var3 != 289) {
               throw new IllegalStateException();
            }

            ea var9 = du.js.ah[var8];
            if (var9 != null) {
               if (var3 != 289) {
                  throw new IllegalStateException();
               }

               for(var10 = 0; var10 < 10; ++var10) {
                  if (var3 != 289) {
                     throw new IllegalStateException();
                  }

                  var10000 = var9.dn;
                  var10000[var10] -= var6;
                  var10000 = var9.du;
                  var10000[var10] -= var7;
               }

               var9.bf -= 1488690560 * var6;
               var9.bm -= 387719552 * var7;
               var9.dk -= var6 * 209662491;
               var9.db -= var7 * -1634105351;
               var9.dl -= -1288512121 * var6;
               var9.dc -= 1981249885 * var7;
            }
         }

         for(var8 = 0; var8 < 2048; ++var8) {
            di var20 = du.js.ad[var8];
            if (null != var20) {
               for(var10 = 0; var10 < 10; ++var10) {
                  if (var3 != 289) {
                     throw new IllegalStateException();
                  }

                  var10000 = var20.dn;
                  var10000[var10] -= var6;
                  var10000 = var20.du;
                  var10000[var10] -= var7;
               }

               var20.bf -= 1488690560 * var6;
               var20.bm -= 387719552 * var7;
               var20.dk -= var6 * 209662491;
               var20.db -= var7 * -1634105351;
               var20.dl -= -1288512121 * var6;
               var20.dc -= 1981249885 * var7;
            }
         }

         for(var8 = 0; var8 < 2048; ++var8) {
            if (var3 != 289) {
               throw new IllegalStateException();
            }

            su var21 = du.js.az[var8];
            if (null != var21) {
               for(var10 = 0; var10 < 10; ++var10) {
                  if (var3 != 289) {
                     throw new IllegalStateException();
                  }

                  var10000 = var21.ad;
                  var10000[var10] -= var6;
                  var10000 = var21.ah;
                  var10000[var10] -= var7;
               }

               var21.aq -= 1056765312 * var6;
               var21.at -= var7 * 1343943808;
            }
         }

         byte var22 = 0;
         byte var23 = 104;
         byte var24 = 1;
         if (var6 < 0) {
            if (var3 != 289) {
               throw new IllegalStateException();
            }

            var22 = 103;
            var23 = -1;
            var24 = -1;
         }

         byte var11 = 0;
         byte var12 = 104;
         byte var13 = 1;
         if (var7 < 0) {
            if (var3 != 289) {
               throw new IllegalStateException();
            }

            var11 = 103;
            var12 = -1;
            var13 = -1;
         }

         int var15;
         for(int var14 = var22; var14 != var23; var14 += var24) {
            if (var3 != 289) {
               throw new IllegalStateException();
            }

            for(var15 = var11; var15 != var12; var15 += var13) {
               if (var3 != 289) {
                  return;
               }

               int var16 = var14 + var6;
               int var17 = var7 + var15;

               for(int var18 = 0; var18 < 4; ++var18) {
                  if (var3 != 289) {
                     throw new IllegalStateException();
                  }

                  if (0 <= var16) {
                     if (var3 != 289) {
                        return;
                     }

                     if (var16 < 104) {
                        if (var3 != 289) {
                           throw new IllegalStateException();
                        }

                        if (0 <= var17) {
                           if (var3 != 289) {
                              throw new IllegalStateException();
                           }

                           if (var17 < 104) {
                              du.js.ao[var18][var14][var15] = du.js.ao[var18][var16][var17];
                              continue;
                           }
                        }
                     }
                  }

                  du.js.ao[var18][var14][var15] = null;
               }
            }
         }

         for(dr var25 = (dr)du.js.as.af(); var25 != null; var25 = (dr)du.js.as.au()) {
            if (var3 != 289) {
               throw new IllegalStateException();
            }

            var25.ag -= var6 * -1341417143;
            var25.am -= var7 * 180684277;
            if (var25.ag * 119580921 >= 0) {
               if (var3 != 289) {
                  throw new IllegalStateException();
               }

               if (104 > 119580921 * var25.ag) {
                  if (var3 != 289) {
                     throw new IllegalStateException();
                  }

                  if (-1436696995 * var25.am >= 0) {
                     if (var3 != 289) {
                        throw new IllegalStateException();
                     }

                     if (104 > var25.am * -1436696995) {
                        continue;
                     }

                     if (var3 != 289) {
                        return;
                     }
                  }
               }
            }

            var25.jb();
         }

         if (1311031545 * client.sz != 0) {
            if (var3 != 289) {
               return;
            }

            client.sz -= var6 * -1646001847;
            client.si -= -95203169 * var7;
         }

         client.th = 0;
         client.tt = false;
         lm.kl -= 1055016687 * (var6 << 7);
         bw.ke -= (var7 << 7) * -2055248033;
         et.lq -= (var6 << 7) * -1531309273;
         ao.la -= 1729926581 * (var7 << 7);
         client.sn = 1400076551;
         du.js.aj.ac();
         du.js.ay.ac();

         for(var15 = 0; var15 < 4; ++var15) {
            if (var3 != 289) {
               throw new IllegalStateException();
            }

            du.js.ag[var15].ac(-509407491);
         }

      } catch (RuntimeException var19) {
         throw vk.ae(var19, "go.kx(" + ')');
      }
   }

   int ad(int var1, byte var2, byte var3) {
      try {
         if (126 != var2) {
            if (var2 != 127) {
               if (this.as * 1046818433 == var1) {
                  if (-225769235 * this.ay == -1) {
                     return -1;
                  }

                  if (this.ab[-225769235 * this.ay] < 125) {
                     if (var3 != 7) {
                        throw new IllegalStateException();
                     }

                     return -1;
                  }
               }

               if (this.ab[var1] == var2) {
                  if (var3 != 7) {
                     throw new IllegalStateException();
                  }

                  return -1;
               }

               this.ab[var1] = var2;
               this.au((short)16693);
               return var1;
            }

            if (var3 != 7) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "go.ad(" + ')');
      }
   }

   boolean ah(int var1, int var2) {
      try {
         if (this.as * 1046818433 != var1) {
            if (126 != this.ab[var1]) {
               this.ab[1046818433 * this.as] = 125;
               this.ay = -558027419 * this.as;
               this.ab[var1] = 126;
               this.as = var1 * 174920065;
               return true;
            }

            if (var2 >= 295205324) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "go.ah(" + ')');
      }
   }

   int ap(int var1, boolean var2, int var3) {
      try {
         if (var2 == this.ao[var1]) {
            if (var3 >= -1852566139) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            this.ao[var1] = var2;
            return var1;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "go.ap(" + ')');
      }
   }

   public int[] bm() {
      if (this.az == null) {
         String[] var1 = new String[this.ah * -482021278];
         this.az = new int[this.ah * -1800691862];

         for(int var2 = 0; var2 < 1736396441 * this.ah; this.az[var2] = var2++) {
            var1[var2] = this.aw[var2];
            if (null != var1[var2]) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         fn.ae(var1, this.az, (byte)-33);
      }

      return this.az;
   }

   public Integer bd(int var1) {
      if (this.ak == null) {
         return null;
      } else {
         to var2 = this.ak.ac((long)var1);
         return null != var2 && var2 instanceof th ? new Integer(((th)var2).ac) : null;
      }
   }

   boolean aa(int var1, int var2, int var3, int var4, byte var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var10000;
         if (var4 == 31) {
            if (var5 != 8) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << var4 + 1) - 1;
         }

         int var7 = var10000;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         if (null != this.ak) {
            to var9 = this.ak.ac((long)var1);
            if (var9 != null) {
               if (var9 instanceof th) {
                  if (var5 != 8) {
                     throw new IllegalStateException();
                  }

                  th var10 = (th)var9;
                  if (var2 == (var10.ac & var8)) {
                     if (var5 != 8) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var10.ac &= ~var8;
                  var10.ac |= var2;
                  return true;
               }

               var9.jb();
            }
         } else {
            this.ak = new ui(4);
         }

         this.ak.ae(new th(var2), (long)var1);
         return true;
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "go.aa(" + ')');
      }
   }

   boolean ai(int var1, long var2) {
      try {
         if (null != this.ak) {
            to var4 = this.ak.ac((long)var1);
            if (null != var4) {
               if (var4 instanceof tv) {
                  tv var5 = (tv)var4;
                  if (var2 == var5.ac) {
                     return false;
                  }

                  var5.ac = var2;
                  return true;
               }

               var4.jb();
            }
         } else {
            this.ak = new ui(4);
         }

         this.ak.ae(new tv(var2), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "go.ai(" + ')');
      }
   }

   boolean ao(int var1, String var2, int var3) {
      try {
         if (null == var2) {
            var2 = "";
         } else if (var2.length() > 80) {
            var2 = var2.substring(0, 80);
         }

         if (this.ak != null) {
            if (var3 != 1360347130) {
               throw new IllegalStateException();
            }

            to var4 = this.ak.ac((long)var1);
            if (null != var4) {
               if (var3 != 1360347130) {
                  throw new IllegalStateException();
               }

               if (var4 instanceof ts) {
                  if (var3 != 1360347130) {
                     throw new IllegalStateException();
                  }

                  ts var5 = (ts)var4;
                  if (var5.ac instanceof String) {
                     if (var2.equals(var5.ac)) {
                        if (var3 != 1360347130) {
                           throw new IllegalStateException();
                        }

                        return false;
                     }

                     var5.jb();
                     this.ak.ae(new ts(var2), var5.hk);
                     return true;
                  }
               }

               var4.jb();
            }
         } else {
            this.ak = new ui(4);
         }

         this.ak.ae(new ts(var2), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "go.ao(" + ')');
      }
   }

   void as(vf var1, int var2) {
      try {
         int var3 = var1.cv(952452697);
         if (var3 >= 1) {
            if (var3 <= 6) {
               int var4 = var1.cv(952452697);
               if ((var4 & 1) != 0) {
                  if (var2 == -413580831) {
                     throw new IllegalStateException();
                  }

                  this.ae = true;
               }

               if (0 != (var4 & 2)) {
                  if (var2 == -413580831) {
                     return;
                  }

                  this.ag = true;
               }

               if (!this.ae) {
                  if (var2 == -413580831) {
                     throw new IllegalStateException();
                  }

                  this.ap = null;
                  this.av = null;
               }

               if (!this.ag) {
                  if (var2 == -413580831) {
                     throw new IllegalStateException();
                  }

                  this.aw = null;
                  this.an = null;
               }

               this.ax = var1.cz(-1734056172) * -747236235;
               this.af = var1.cz(-1734056172) * 832393107;
               if (var3 <= 3) {
                  if (var2 == -413580831) {
                     throw new IllegalStateException();
                  }

                  if (0 != this.af * 820717211) {
                     if (var2 == -413580831) {
                        throw new IllegalStateException();
                     }

                     this.af += -1497334048;
                  }
               }

               this.ah = var1.ct(-1635245126) * -1207884375;
               this.aj = var1.cv(952452697) * 1307803117;
               this.aq = var1.cs(10034839);
               if (var3 >= 4) {
                  if (var2 == -413580831) {
                     throw new IllegalStateException();
                  }

                  var1.cz(-1734056172);
               }

               boolean var10001;
               if (var1.cv(952452697) == 1) {
                  if (var2 == -413580831) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               this.at = var10001;
               this.au = var1.cg((short)15093);
               this.ar = var1.cg((short)19102);
               this.al = var1.cg((short)4765);
               this.ad = var1.cg((short)2453);
               int var5;
               if (1736396441 * this.ah > 0) {
                  if (var2 == -413580831) {
                     return;
                  }

                  if (this.ae) {
                     label397: {
                        if (var2 == -413580831) {
                           throw new IllegalStateException();
                        }

                        if (null != this.ap) {
                           if (var2 == -413580831) {
                              return;
                           }

                           if (this.ap.length >= this.ah * 1736396441) {
                              break label397;
                           }

                           if (var2 == -413580831) {
                              throw new IllegalStateException();
                           }
                        }

                        this.ap = new long[1736396441 * this.ah];
                     }
                  }

                  if (this.ag) {
                     label398: {
                        if (var2 == -413580831) {
                           return;
                        }

                        if (null != this.aw) {
                           if (this.aw.length >= this.ah * 1736396441) {
                              break label398;
                           }

                           if (var2 == -413580831) {
                              throw new IllegalStateException();
                           }
                        }

                        this.aw = new String[1736396441 * this.ah];
                     }
                  }

                  label341: {
                     if (null != this.ab) {
                        if (var2 == -413580831) {
                           throw new IllegalStateException();
                        }

                        if (this.ab.length >= 1736396441 * this.ah) {
                           break label341;
                        }

                        if (var2 == -413580831) {
                           throw new IllegalStateException();
                        }
                     }

                     this.ab = new byte[this.ah * 1736396441];
                  }

                  label334: {
                     if (null != this.aa) {
                        if (var2 == -413580831) {
                           return;
                        }

                        if (this.aa.length >= 1736396441 * this.ah) {
                           break label334;
                        }

                        if (var2 == -413580831) {
                           throw new IllegalStateException();
                        }
                     }

                     this.aa = new int[this.ah * 1736396441];
                  }

                  label327: {
                     if (this.ai != null) {
                        if (this.ai.length >= this.ah * 1736396441) {
                           break label327;
                        }

                        if (var2 == -413580831) {
                           throw new IllegalStateException();
                        }
                     }

                     this.ai = new int[1736396441 * this.ah];
                  }

                  label321: {
                     if (null != this.ao) {
                        if (var2 == -413580831) {
                           throw new IllegalStateException();
                        }

                        if (this.ao.length >= this.ah * 1736396441) {
                           break label321;
                        }

                        if (var2 == -413580831) {
                           throw new IllegalStateException();
                        }
                     }

                     this.ao = new boolean[1736396441 * this.ah];
                  }

                  for(var5 = 0; var5 < 1736396441 * this.ah; ++var5) {
                     if (var2 == -413580831) {
                        throw new IllegalStateException();
                     }

                     if (this.ae) {
                        if (var2 == -413580831) {
                           throw new IllegalStateException();
                        }

                        this.ap[var5] = var1.cw(1756652972);
                     }

                     if (this.ag) {
                        this.aw[var5] = var1.ca(-1852584585);
                     }

                     this.ab[var5] = var1.cg((short)-4181);
                     if (var3 >= 2) {
                        if (var2 == -413580831) {
                           throw new IllegalStateException();
                        }

                        this.aa[var5] = var1.cz(-1734056172);
                     }

                     if (var3 >= 5) {
                        if (var2 == -413580831) {
                           throw new IllegalStateException();
                        }

                        this.ai[var5] = var1.ct(-1431222084);
                     } else {
                        this.ai[var5] = 0;
                     }

                     if (var3 >= 6) {
                        if (var2 == -413580831) {
                           throw new IllegalStateException();
                        }

                        boolean[] var10000 = this.ao;
                        boolean var10002;
                        if (var1.cv(952452697) == 1) {
                           if (var2 == -413580831) {
                              throw new IllegalStateException();
                           }

                           var10002 = true;
                        } else {
                           var10002 = false;
                        }

                        var10000[var5] = var10002;
                     } else {
                        this.ao[var5] = false;
                     }
                  }

                  this.au((short)2933);
               }

               if (this.aj * 1121871845 > 0) {
                  if (this.ae) {
                     label399: {
                        if (this.av != null) {
                           if (var2 == -413580831) {
                              return;
                           }

                           if (this.av.length >= this.aj * 1121871845) {
                              break label399;
                           }

                           if (var2 == -413580831) {
                              throw new IllegalStateException();
                           }
                        }

                        this.av = new long[1121871845 * this.aj];
                     }
                  }

                  if (this.ag) {
                     label400: {
                        if (var2 == -413580831) {
                           throw new IllegalStateException();
                        }

                        if (null != this.an) {
                           if (var2 == -413580831) {
                              return;
                           }

                           if (this.an.length >= 1121871845 * this.aj) {
                              break label400;
                           }

                           if (var2 == -413580831) {
                              return;
                           }
                        }

                        this.an = new String[1121871845 * this.aj];
                     }
                  }

                  for(var5 = 0; var5 < 1121871845 * this.aj; ++var5) {
                     if (var2 == -413580831) {
                        return;
                     }

                     if (this.ae) {
                        if (var2 == -413580831) {
                           throw new IllegalStateException();
                        }

                        this.av[var5] = var1.cw(411840848);
                     }

                     if (this.ag) {
                        if (var2 == -413580831) {
                           return;
                        }

                        this.an[var5] = var1.ca(989357732);
                     }
                  }
               }

               if (var3 >= 3) {
                  var5 = var1.ct(-1744843202);
                  if (var5 > 0) {
                     this.ak = new ui(var5 < 16 ? at.ax(var5, 1553286212) : 16);

                     while(var5-- > 0) {
                        int var6 = var1.cz(-1734056172);
                        int var7 = var6 & 1073741823;
                        int var8 = var6 >>> 30;
                        if (0 == var8) {
                           int var9 = var1.cz(-1734056172);
                           this.ak.ae(new th(var9), (long)var7);
                        } else if (1 == var8) {
                           if (var2 == -413580831) {
                              return;
                           }

                           long var12 = var1.cw(1188232215);
                           this.ak.ae(new tv(var12), (long)var7);
                        } else if (var8 == 2) {
                           if (var2 == -413580831) {
                              throw new IllegalStateException();
                           }

                           String var13 = var1.cs(1912778832);
                           this.ak.ae(new ts(var13), (long)var7);
                        }
                     }
                  }
               }

               return;
            }

            if (var2 == -413580831) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("" + var3);
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "go.as(" + ')');
      }
   }

   void ay(int var1) {
      if (this.ae) {
         if (this.ap != null) {
            System.arraycopy(this.ap, 0, this.ap = new long[var1], 0, -1516378981 * this.ah);
         } else {
            this.ap = new long[var1];
         }
      }

      if (this.ag) {
         if (null != this.aw) {
            System.arraycopy(this.aw, 0, this.aw = new String[var1], 0, this.ah * 1736396441);
         } else {
            this.aw = new String[var1];
         }
      }

      if (null != this.ab) {
         System.arraycopy(this.ab, 0, this.ab = new byte[var1], 0, 1157526619 * this.ah);
      } else {
         this.ab = new byte[var1];
      }

      if (null != this.aa) {
         System.arraycopy(this.aa, 0, this.aa = new int[var1], 0, this.ah * 1736396441);
      } else {
         this.aa = new int[var1];
      }

      if (null != this.ai) {
         System.arraycopy(this.ai, 0, this.ai = new int[var1], 0, this.ah * 1736396441);
      } else {
         this.ai = new int[var1];
      }

      if (this.ao != null) {
         System.arraycopy(this.ao, 0, this.ao = new boolean[var1], 0, this.ah * -1588041087);
      } else {
         this.ao = new boolean[var1];
      }

   }

   public Integer ax(int var1, int var2) {
      try {
         if (this.ak == null) {
            return null;
         } else {
            to var3 = this.ak.ac((long)var1);
            if (null != var3) {
               if (var2 != 477199739) {
                  throw new IllegalStateException();
               }

               if (var3 instanceof th) {
                  return new Integer(((th)var3).ac);
               }
            }

            return null;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "go.ax(" + ')');
      }
   }

   void av(int var1) {
      if (this.ae) {
         if (this.av != null) {
            System.arraycopy(this.av, 0, this.av = new long[var1], 0, 1121871845 * this.aj);
         } else {
            this.av = new long[var1];
         }
      }

      if (this.ag) {
         if (null != this.an) {
            System.arraycopy(this.an, 0, this.an = new String[var1], 0, 1121871845 * this.aj);
         } else {
            this.an = new String[var1];
         }
      }

   }

   void aw(int var1) {
      if (this.ae) {
         if (this.av != null) {
            System.arraycopy(this.av, 0, this.av = new long[var1], 0, 1121871845 * this.aj);
         } else {
            this.av = new long[var1];
         }
      }

      if (this.ag) {
         if (null != this.an) {
            System.arraycopy(this.an, 0, this.an = new String[var1], 0, 1121871845 * this.aj);
         } else {
            this.an = new String[var1];
         }
      }

   }

   void an(int var1) {
      if (this.ae) {
         if (this.av != null) {
            System.arraycopy(this.av, 0, this.av = new long[var1], 0, 1121871845 * this.aj);
         } else {
            this.av = new long[var1];
         }
      }

      if (this.ag) {
         if (null != this.an) {
            System.arraycopy(this.an, 0, this.an = new String[var1], 0, 1132510405 * this.aj);
         } else {
            this.an = new String[var1];
         }
      }

   }

   public int ak(String var1) {
      if (var1 != null && var1.length() != 0) {
         for(int var2 = 0; var2 < 1217002236 * this.ah; ++var2) {
            if (this.aw[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   void cv(vf var1) {
      int var2 = var1.cv(952452697);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.cv(952452697);
         if ((var3 & 1) != 0) {
            this.ae = true;
         }

         if (0 != (var3 & 2)) {
            this.ag = true;
         }

         if (!this.ae) {
            this.ap = null;
            this.av = null;
         }

         if (!this.ag) {
            this.aw = null;
            this.an = null;
         }

         this.ax = var1.cz(-1734056172) * -747236235;
         this.af = var1.cz(-1734056172) * 832393107;
         if (var2 <= 3 && 0 != this.af * 820717211) {
            this.af += -1497334048;
         }

         this.ah = var1.ct(-1970417182) * -1207884375;
         this.aj = var1.cv(952452697) * 1307803117;
         this.aq = var1.cs(1229055677);
         if (var2 >= 4) {
            var1.cz(-1734056172);
         }

         this.at = var1.cv(952452697) == 1;
         this.au = var1.cg((short)-1481);
         this.ar = var1.cg((short)18306);
         this.al = var1.cg((short)-9478);
         this.ad = var1.cg((short)2218);
         int var4;
         if (1736396441 * this.ah > 0) {
            if (this.ae && (null == this.ap || this.ap.length < this.ah * 1736396441)) {
               this.ap = new long[1736396441 * this.ah];
            }

            if (this.ag && (null == this.aw || this.aw.length < this.ah * 1736396441)) {
               this.aw = new String[1736396441 * this.ah];
            }

            if (null == this.ab || this.ab.length < 1736396441 * this.ah) {
               this.ab = new byte[this.ah * 1736396441];
            }

            if (null == this.aa || this.aa.length < 1736396441 * this.ah) {
               this.aa = new int[this.ah * 1736396441];
            }

            if (this.ai == null || this.ai.length < this.ah * 1736396441) {
               this.ai = new int[1736396441 * this.ah];
            }

            if (null == this.ao || this.ao.length < this.ah * 1736396441) {
               this.ao = new boolean[1736396441 * this.ah];
            }

            for(var4 = 0; var4 < 1736396441 * this.ah; ++var4) {
               if (this.ae) {
                  this.ap[var4] = var1.cw(122884345);
               }

               if (this.ag) {
                  this.aw[var4] = var1.ca(-160208343);
               }

               this.ab[var4] = var1.cg((short)-8741);
               if (var2 >= 2) {
                  this.aa[var4] = var1.cz(-1734056172);
               }

               if (var2 >= 5) {
                  this.ai[var4] = var1.ct(-1639160812);
               } else {
                  this.ai[var4] = 0;
               }

               if (var2 >= 6) {
                  this.ao[var4] = var1.cv(952452697) == 1;
               } else {
                  this.ao[var4] = false;
               }
            }

            this.au((short)12290);
         }

         if (this.aj * 1121871845 > 0) {
            if (this.ae && (this.av == null || this.av.length < this.aj * 1121871845)) {
               this.av = new long[1121871845 * this.aj];
            }

            if (this.ag && (null == this.an || this.an.length < 1121871845 * this.aj)) {
               this.an = new String[1121871845 * this.aj];
            }

            for(var4 = 0; var4 < 1121871845 * this.aj; ++var4) {
               if (this.ae) {
                  this.av[var4] = var1.cw(2012746478);
               }

               if (this.ag) {
                  this.an[var4] = var1.ca(-702841797);
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.ct(-1725458815);
            if (var4 > 0) {
               this.ak = new ui(var4 < 16 ? at.ax(var4, 873039295) : 16);

               while(var4-- > 0) {
                  int var5 = var1.cz(-1734056172);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (0 == var7) {
                     int var8 = var1.cz(-1734056172);
                     this.ak.ae(new th(var8), (long)var6);
                  } else if (1 == var7) {
                     long var10 = var1.cw(351304055);
                     this.ak.ae(new tv(var10), (long)var6);
                  } else if (var7 == 2) {
                     String var11 = var1.cs(-1949123514);
                     this.ak.ae(new ts(var11), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   public int bh(int var1, int var2, int var3) {
      int var4 = 31 == var3 ? -1 : (1 << 1 + var3) - 1;
      return (this.aa[var1] & var4) >>> var2;
   }

   void af(long var1, String var3, int var4, int var5) {
      try {
         if (var3 != null) {
            if (var5 != -354003659) {
               throw new IllegalStateException();
            }

            if (var3.length() == 0) {
               if (var5 != -354003659) {
                  throw new IllegalStateException();
               }

               var3 = null;
            }
         }

         if (this.ae != var1 > 0L) {
            if (var5 == -354003659) {
               throw new RuntimeException("");
            }
         } else {
            boolean var10000 = this.ag;
            boolean var10001;
            if (null != var3) {
               if (var5 != -354003659) {
                  return;
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if (var10000 != var10001) {
               throw new RuntimeException("");
            } else {
               label113: {
                  label123: {
                     if (var1 > 0L) {
                        if (var5 != -354003659) {
                           throw new IllegalStateException();
                        }

                        if (this.ap == null) {
                           break label123;
                        }

                        if (var5 != -354003659) {
                           throw new IllegalStateException();
                        }

                        if (1736396441 * this.ah >= this.ap.length) {
                           break label123;
                        }

                        if (var5 != -354003659) {
                           throw new IllegalStateException();
                        }
                     }

                     if (null == var3) {
                        break label113;
                     }

                     if (var5 != -354003659) {
                        throw new IllegalStateException();
                     }

                     if (null != this.aw) {
                        if (var5 != -354003659) {
                           throw new IllegalStateException();
                        }

                        if (this.ah * 1736396441 < this.aw.length) {
                           break label113;
                        }

                        if (var5 != -354003659) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  this.ac(this.ah * 1736396441 + 5, (byte)-76);
               }

               if (null != this.ap) {
                  this.ap[this.ah * 1736396441] = var1;
               }

               if (null != this.aw) {
                  if (var5 != -354003659) {
                     return;
                  }

                  this.aw[this.ah * 1736396441] = var3;
               }

               if (this.as * 1046818433 == -1) {
                  if (var5 != -354003659) {
                     return;
                  }

                  this.as = this.ah * 209962009;
                  this.ab[this.ah * 1736396441] = 126;
               } else {
                  this.ab[this.ah * 1736396441] = 0;
               }

               this.aa[1736396441 * this.ah] = 0;
               this.ai[1736396441 * this.ah] = var4;
               this.ao[this.ah * 1736396441] = false;
               this.ah += -1207884375;
               this.az = null;
            }
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "go.af(" + ')');
      }
   }

   public static hk ac(int var0, int var1) {
      try {
         hk var2 = (hk)hk.ag.ac((long)var0);
         if (var2 != null) {
            if (var1 != -44299623) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = hk.ac.bt(33, var0, (byte)-16);
            var2 = new hk();
            var2.ax = var0 * 188552253;
            if (null != var3) {
               if (var1 != -44299623) {
                  throw new IllegalStateException();
               }

               var2.ae(new vf(var3), (byte)10);
            }

            hk.ag.ag(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "go.ac(" + ')');
      }
   }

   public int ag(String var1, int var2) {
      try {
         if (var1 != null) {
            if (var1.length() != 0) {
               for(int var3 = 0; var3 < 1736396441 * this.ah; ++var3) {
                  if (var2 <= 1909929974) {
                     throw new IllegalStateException();
                  }

                  if (this.aw[var3].equals(var1)) {
                     if (var2 <= 1909929974) {
                        throw new IllegalStateException();
                     }

                     return var3;
                  }
               }

               return -1;
            }

            if (var2 <= 1909929974) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "go.ag(" + ')');
      }
   }

   boolean cx(int var1, long var2) {
      if (null != this.ak) {
         to var4 = this.ak.ac((long)var1);
         if (null != var4) {
            if (var4 instanceof tv) {
               tv var5 = (tv)var4;
               if (var2 == var5.ac) {
                  return false;
               }

               var5.ac = var2;
               return true;
            }

            var4.jb();
         }
      } else {
         this.ak = new ui(4);
      }

      this.ak.ae(new tv(var2), (long)var1);
      return true;
   }

   void bs(long var1, String var3, int var4) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (this.ae != var1 > 0L) {
         throw new RuntimeException("");
      } else if (this.ag != (null != var3)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.ap == null || 1736396441 * this.ah >= this.ap.length) || null != var3 && (null == this.aw || this.ah * 1736396441 >= this.aw.length)) {
            this.ac(this.ah * 1736396441 + 5, (byte)-73);
         }

         if (null != this.ap) {
            this.ap[this.ah * 1736396441] = var1;
         }

         if (null != this.aw) {
            this.aw[this.ah * 1736396441] = var3;
         }

         if (this.as * 1046818433 == -1) {
            this.as = this.ah * 209962009;
            this.ab[this.ah * 1736396441] = 126;
         } else {
            this.ab[this.ah * 1736396441] = 0;
         }

         this.aa[1736396441 * this.ah] = 0;
         this.ai[1736396441 * this.ah] = var4;
         this.ao[this.ah * 1736396441] = false;
         this.ah += -1207884375;
         this.az = null;
      }
   }

   void bw(long var1, String var3, int var4) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (this.ae != var1 > 0L) {
         throw new RuntimeException("");
      } else if (this.ag != (null != var3)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.ap == null || 1736396441 * this.ah >= this.ap.length) || null != var3 && (null == this.aw || this.ah * 1736396441 >= this.aw.length)) {
            this.ac(this.ah * 1736396441 + 5, (byte)-23);
         }

         if (null != this.ap) {
            this.ap[this.ah * 1736396441] = var1;
         }

         if (null != this.aw) {
            this.aw[this.ah * 1736396441] = var3;
         }

         if (this.as * 1046818433 == -1) {
            this.as = this.ah * 209962009;
            this.ab[this.ah * 1736396441] = 126;
         } else {
            this.ab[this.ah * 1736396441] = 0;
         }

         this.aa[1736396441 * this.ah] = 0;
         this.ai[1736396441 * this.ah] = var4;
         this.ao[this.ah * 1736396441] = false;
         this.ah += -1207884375;
         this.az = null;
      }
   }

   void ba(long var1, String var3, int var4) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (this.ae != var1 > 0L) {
         throw new RuntimeException("");
      } else if (this.ag != (null != var3)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.ap == null || 1736396441 * this.ah >= this.ap.length) || null != var3 && (null == this.aw || this.ah * 1736396441 >= this.aw.length)) {
            this.ac(this.ah * 1736396441 + 5, (byte)-13);
         }

         if (null != this.ap) {
            this.ap[this.ah * 1736396441] = var1;
         }

         if (null != this.aw) {
            this.aw[this.ah * 1736396441] = var3;
         }

         if (this.as * 1046818433 == -1) {
            this.as = this.ah * 209962009;
            this.ab[this.ah * 1736396441] = 126;
         } else {
            this.ab[this.ah * 1736396441] = 0;
         }

         this.aa[1736396441 * this.ah] = 0;
         this.ai[1736396441 * this.ah] = var4;
         this.ao[this.ah * 1736396441] = false;
         this.ah += -1207884375;
         this.az = null;
      }
   }

   void bj(int var1) {
      if (var1 >= 0 && var1 < this.ah * 1736396441) {
         this.ah -= -1962948463;
         this.az = null;
         if (0 == 557161041 * this.ah) {
            this.ap = null;
            this.aw = null;
            this.ab = null;
            this.aa = null;
            this.ai = null;
            this.ao = null;
            this.as = -174920065;
            this.ay = -933253422;
         } else {
            System.arraycopy(this.ab, var1 + 1, this.ab, var1, this.ah * 230343532 - var1);
            System.arraycopy(this.aa, var1 + 1, this.aa, var1, -212132972 * this.ah - var1);
            System.arraycopy(this.ai, 1 + var1, this.ai, var1, -1192666713 * this.ah - var1);
            System.arraycopy(this.ao, var1 + 1, this.ao, var1, this.ah * -669098540 - var1);
            if (this.ap != null) {
               System.arraycopy(this.ap, 1 + var1, this.ap, var1, -377690701 * this.ah - var1);
            }

            if (null != this.aw) {
               System.arraycopy(this.aw, 1 + var1, this.aw, var1, 1736396441 * this.ah - var1);
            }

            this.au((short)8834);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void bp(int var1) {
      if (var1 >= 0 && var1 < this.ah * 1736396441) {
         this.ah -= -1207884375;
         this.az = null;
         if (0 == 1736396441 * this.ah) {
            this.ap = null;
            this.aw = null;
            this.ab = null;
            this.aa = null;
            this.ai = null;
            this.ao = null;
            this.as = -174920065;
            this.ay = -324572389;
         } else {
            System.arraycopy(this.ab, var1 + 1, this.ab, var1, this.ah * 1736396441 - var1);
            System.arraycopy(this.aa, var1 + 1, this.aa, var1, 1736396441 * this.ah - var1);
            System.arraycopy(this.ai, 1 + var1, this.ai, var1, 1736396441 * this.ah - var1);
            System.arraycopy(this.ao, var1 + 1, this.ao, var1, this.ah * 1736396441 - var1);
            if (this.ap != null) {
               System.arraycopy(this.ap, 1 + var1, this.ap, var1, 1736396441 * this.ah - var1);
            }

            if (null != this.aw) {
               System.arraycopy(this.aw, 1 + var1, this.aw, var1, 1736396441 * this.ah - var1);
            }

            this.au((short)12574);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void ae(int var1, int var2) {
      try {
         if (this.ae) {
            if (var2 == -1254241829) {
               throw new IllegalStateException();
            }

            if (this.av != null) {
               if (var2 == -1254241829) {
                  return;
               }

               System.arraycopy(this.av, 0, this.av = new long[var1], 0, 1121871845 * this.aj);
            } else {
               this.av = new long[var1];
            }
         }

         if (this.ag) {
            if (var2 == -1254241829) {
               return;
            }

            if (null != this.an) {
               if (var2 == -1254241829) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.an, 0, this.an = new String[var1], 0, 1121871845 * this.aj);
            } else {
               this.an = new String[var1];
            }
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "go.ae(" + ')');
      }
   }

   void bb(long var1, String var3) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.ae) {
         throw new RuntimeException("");
      } else if (this.ag != (null != var3)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.av == null || this.aj * 1121871845 >= this.av.length) || null != var3 && (null == this.an || this.aj * 1121871845 >= this.an.length)) {
            this.ae(this.aj * 2005454829 + 5, 703824334);
         }

         if (this.av != null) {
            this.av[this.aj * 1121871845] = var1;
         }

         if (this.an != null) {
            this.an[-822554458 * this.aj] = var3;
         }

         this.aj += 1104202492;
      }
   }

   void bi(long var1, String var3) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.ae) {
         throw new RuntimeException("");
      } else if (this.ag != (null != var3)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.av == null || this.aj * 1121871845 >= this.av.length) || null != var3 && (null == this.an || this.aj * 1121871845 >= this.an.length)) {
            this.ae(this.aj * 7106423 + 5, 167279631);
         }

         if (this.av != null) {
            this.av[this.aj * 1121871845] = var1;
         }

         if (this.an != null) {
            this.an[993563519 * this.aj] = var3;
         }

         this.aj += -869304394;
      }
   }

   void bg(int var1) {
      this.aj -= 1621506017;
      if (0 == this.aj * 1121871845) {
         this.av = null;
         this.an = null;
      } else {
         if (this.av != null) {
            System.arraycopy(this.av, 1 + var1, this.av, var1, -1487987722 * this.aj - var1);
         }

         if (null != this.an) {
            System.arraycopy(this.an, var1 + 1, this.an, var1, 1121871845 * this.aj - var1);
         }
      }

   }

   int bl(int var1, byte var2) {
      if (126 != var2 && var2 != 127) {
         if (this.as * -336620383 == var1 && (-225769235 * this.ay == -1 || this.ab[-225769235 * this.ay] < 125)) {
            return -1;
         } else if (this.ab[var1] == var2) {
            return -1;
         } else {
            this.ab[var1] = var2;
            this.au((short)14515);
            return var1;
         }
      } else {
         return -1;
      }
   }

   public int bn(int var1, int var2, int var3) {
      int var4 = -284609801 == var3 ? -1 : (1 << 1 + var3) - 1;
      return (this.aa[var1] & var4) >>> var2;
   }

   int bu(int var1, byte var2) {
      if (126 != var2 && var2 != 127) {
         if (this.as * 1046818433 == var1 && (-225769235 * this.ay == -1 || this.ab[-225769235 * this.ay] < 125)) {
            return -1;
         } else if (this.ab[var1] == var2) {
            return -1;
         } else {
            this.ab[var1] = var2;
            this.au((short)24528);
            return var1;
         }
      } else {
         return -1;
      }
   }

   public static String aq(int var0, boolean var1, int var2) {
      try {
         if (var1) {
            if (var2 >= 582051378) {
               throw new IllegalStateException();
            }

            if (var0 >= 0) {
               int var4 = var0;
               String var3;
               if (var1) {
                  if (var2 >= 582051378) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 0) {
                     int var5 = 2;

                     for(int var6 = var0 / 10; var6 != 0; ++var5) {
                        if (var2 >= 582051378) {
                           throw new IllegalStateException();
                        }

                        var6 /= 10;
                     }

                     char[] var7 = new char[var5];
                     var7[0] = '+';

                     for(int var8 = var5 - 1; var8 > 0; --var8) {
                        if (var2 >= 582051378) {
                           throw new IllegalStateException();
                        }

                        int var9 = var4;
                        var4 /= 10;
                        int var10 = var9 - var4 * 10;
                        if (var10 >= 10) {
                           if (var2 >= 582051378) {
                              throw new IllegalStateException();
                           }

                           var7[var8] = (char)(87 + var10);
                        } else {
                           var7[var8] = (char)(48 + var10);
                        }
                     }

                     var3 = new String(var7);
                     return var3;
                  }

                  if (var2 >= 582051378) {
                     throw new IllegalStateException();
                  }
               }

               var3 = Integer.toString(var0, 10);
               return var3;
            }

            if (var2 >= 582051378) {
               throw new IllegalStateException();
            }
         }

         return Integer.toString(var0);
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "go.aq(" + ')');
      }
   }

   boolean bo(int var1) {
      if (this.as * 1046818433 != var1 && 126 != this.ab[var1]) {
         this.ab[1046818433 * this.as] = 125;
         this.ay = -558027419 * this.as;
         this.ab[var1] = 126;
         this.as = var1 * 174920065;
         return true;
      } else {
         return false;
      }
   }

   boolean bv(int var1) {
      if (this.as * 1046818433 != var1 && 126 != this.ab[var1]) {
         this.ab[1046818433 * this.as] = 125;
         this.ay = -647520547 * this.as;
         this.ab[var1] = (byte)-1721169832;
         this.as = var1 * 1064198804;
         return true;
      } else {
         return false;
      }
   }

   int ab(int var1, int var2, int var3, int var4, byte var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var10000;
         if (var4 == 31) {
            if (var5 >= 1) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << 1 + var4) - 1;
         }

         int var7 = var10000;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         int var9 = this.aa[var1];
         if (var2 == (var9 & var8)) {
            if (var5 >= 1) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            var9 &= ~var8;
            this.aa[var1] = var9 | var2;
            return var1;
         }
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "go.ab(" + ')');
      }
   }

   int bq(int var1, boolean var2) {
      if (var2 == this.ao[var1]) {
         return -1;
      } else {
         this.ao[var1] = var2;
         return var1;
      }
   }

   void by() {
      if (1736396441 * this.ah == 0) {
         this.as = -174920065;
         this.ay = -324572389;
      } else {
         this.as = -174920065;
         this.ay = -324572389;
         int var1 = 0;
         byte var2 = this.ab[0];

         for(int var3 = 1; var3 < this.ah * 1736396441; ++var3) {
            if (this.ab[var3] > var2) {
               if (125 == var2) {
                  this.ay = 324572389 * var1;
               }

               var1 = var3;
               var2 = this.ab[var3];
            } else if (-1 == -225769235 * this.ay && this.ab[var3] == 125) {
               this.ay = 324572389 * var3;
            }
         }

         this.as = var1 * 174920065;
         if (this.as * 1046818433 != -1) {
            this.ab[this.as * 1046818433] = 126;
         }

      }
   }

   int be(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == -663712778 ? -1 : (1 << 1 + var4) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = this.aa[var1];
      if (var2 == (var8 & var7)) {
         return -1;
      } else {
         var8 &= ~var7;
         this.aa[var1] = var8 | var2;
         return var1;
      }
   }

   boolean bc(int var1, int var2) {
      if (this.ak != null) {
         to var3 = this.ak.ac((long)var1);
         if (null != var3) {
            if (var3 instanceof th) {
               th var4 = (th)var3;
               if (var2 == var4.ac) {
                  return false;
               }

               var4.ac = var2;
               return true;
            }

            var3.jb();
         }
      } else {
         this.ak = new ui(4);
      }

      this.ak.ae(new th(var2), (long)var1);
      return true;
   }

   boolean br(int var1) {
      if (this.as * 783568416 != var1 && 128044319 != this.ab[var1]) {
         this.ab[1401203613 * this.as] = 125;
         this.ay = 799174837 * this.as;
         this.ab[var1] = (byte)54055567;
         this.as = var1 * -754326898;
         return true;
      } else {
         return false;
      }
   }

   public go(vf var1) {
      try {
         super();
         this.ax = 0;
         this.aq = null;
         this.af = 0;
         this.as = -174920065;
         this.ay = -324572389;
         this.as(var1, -118508045);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "go.<init>(" + ')');
      }
   }

   boolean cf(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (null != this.ak) {
         to var8 = this.ak.ac((long)var1);
         if (var8 != null) {
            if (var8 instanceof th) {
               th var9 = (th)var8;
               if (var2 == (var9.ac & var7)) {
                  return false;
               }

               var9.ac &= ~var7;
               var9.ac |= var2;
               return true;
            }

            var8.jb();
         }
      } else {
         this.ak = new ui(4);
      }

      this.ak.ae(new th(var2), (long)var1);
      return true;
   }

   void al(int var1, int var2) {
      try {
         this.aj -= 1307803117;
         if (0 == this.aj * 1121871845) {
            if (var2 <= 886033725) {
               return;
            }

            this.av = null;
            this.an = null;
         } else {
            if (this.av != null) {
               System.arraycopy(this.av, 1 + var1, this.av, var1, 1121871845 * this.aj - var1);
            }

            if (null != this.an) {
               System.arraycopy(this.an, var1 + 1, this.an, var1, 1121871845 * this.aj - var1);
            }
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "go.al(" + ')');
      }
   }

   int bt(int var1, boolean var2) {
      if (var2 == this.ao[var1]) {
         return -1;
      } else {
         this.ao[var1] = var2;
         return var1;
      }
   }

   boolean cj(int var1, long var2) {
      if (null != this.ak) {
         to var4 = this.ak.ac((long)var1);
         if (null != var4) {
            if (var4 instanceof tv) {
               tv var5 = (tv)var4;
               if (var2 == var5.ac) {
                  return false;
               }

               var5.ac = var2;
               return true;
            }

            var4.jb();
         }
      } else {
         this.ak = new ui(4);
      }

      this.ak.ae(new tv(var2), (long)var1);
      return true;
   }

   boolean cm(int var1, long var2) {
      if (null != this.ak) {
         to var4 = this.ak.ac((long)var1);
         if (null != var4) {
            if (var4 instanceof tv) {
               tv var5 = (tv)var4;
               if (var2 == var5.ac) {
                  return false;
               }

               var5.ac = var2;
               return true;
            }

            var4.jb();
         }
      } else {
         this.ak = new ui(4);
      }

      this.ak.ae(new tv(var2), (long)var1);
      return true;
   }

   void ci(vf var1) {
      int var2 = var1.cv(952452697);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.cv(952452697);
         if ((var3 & 1) != 0) {
            this.ae = true;
         }

         if (0 != (var3 & 2)) {
            this.ag = true;
         }

         if (!this.ae) {
            this.ap = null;
            this.av = null;
         }

         if (!this.ag) {
            this.aw = null;
            this.an = null;
         }

         this.ax = var1.cz(-1734056172) * -2041459864;
         this.af = var1.cz(-1734056172) * 832393107;
         if (var2 <= 3 && 0 != this.af * -1032922665) {
            this.af += -1497334048;
         }

         this.ah = var1.ct(-1945206090) * -1836197045;
         this.aj = var1.cv(952452697) * -584226257;
         this.aq = var1.cs(-1952620920);
         if (var2 >= 4) {
            var1.cz(-1734056172);
         }

         this.at = var1.cv(952452697) == 1;
         this.au = var1.cg((short)-16886);
         this.ar = var1.cg((short)15577);
         this.al = var1.cg((short)854);
         this.ad = var1.cg((short)13959);
         int var4;
         if (-257406715 * this.ah > 0) {
            if (this.ae && (null == this.ap || this.ap.length < this.ah * 1736396441)) {
               this.ap = new long[1736396441 * this.ah];
            }

            if (this.ag && (null == this.aw || this.aw.length < this.ah * -599972353)) {
               this.aw = new String[1736396441 * this.ah];
            }

            if (null == this.ab || this.ab.length < 898087866 * this.ah) {
               this.ab = new byte[this.ah * 1736396441];
            }

            if (null == this.aa || this.aa.length < 1736396441 * this.ah) {
               this.aa = new int[this.ah * 1736396441];
            }

            if (this.ai == null || this.ai.length < this.ah * 1106855858) {
               this.ai = new int[1736396441 * this.ah];
            }

            if (null == this.ao || this.ao.length < this.ah * 1736396441) {
               this.ao = new boolean[1736396441 * this.ah];
            }

            for(var4 = 0; var4 < 1375954812 * this.ah; ++var4) {
               if (this.ae) {
                  this.ap[var4] = var1.cw(1378841670);
               }

               if (this.ag) {
                  this.aw[var4] = var1.ca(-823178189);
               }

               this.ab[var4] = var1.cg((short)-38);
               if (var2 >= 2) {
                  this.aa[var4] = var1.cz(-1734056172);
               }

               if (var2 >= 5) {
                  this.ai[var4] = var1.ct(-1803379555);
               } else {
                  this.ai[var4] = 0;
               }

               if (var2 >= 6) {
                  this.ao[var4] = var1.cv(952452697) == 1;
               } else {
                  this.ao[var4] = false;
               }
            }

            this.au((short)14307);
         }

         if (this.aj * 1121871845 > 0) {
            if (this.ae && (this.av == null || this.av.length < this.aj * -432000139)) {
               this.av = new long[1506219774 * this.aj];
            }

            if (this.ag && (null == this.an || this.an.length < -1226410017 * this.aj)) {
               this.an = new String[1121871845 * this.aj];
            }

            for(var4 = 0; var4 < 1121871845 * this.aj; ++var4) {
               if (this.ae) {
                  this.av[var4] = var1.cw(1106932711);
               }

               if (this.ag) {
                  this.an[var4] = var1.ca(-1896135895);
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.ct(-1758726629);
            if (var4 > 0) {
               this.ak = new ui(var4 < 16 ? at.ax(var4, 1980371913) : 16);

               while(var4-- > 0) {
                  int var5 = var1.cz(-1734056172);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (0 == var7) {
                     int var8 = var1.cz(-1734056172);
                     this.ak.ae(new th(var8), (long)var6);
                  } else if (1 == var7) {
                     long var10 = var1.cw(86506381);
                     this.ak.ae(new tv(var10), (long)var6);
                  } else if (var7 == 2) {
                     String var11 = var1.cs(-1832047399);
                     this.ak.ae(new ts(var11), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   void au(short var1) {
      try {
         if (1736396441 * this.ah == 0) {
            if (var1 <= 255) {
               throw new IllegalStateException();
            } else {
               this.as = -174920065;
               this.ay = -324572389;
            }
         } else {
            this.as = -174920065;
            this.ay = -324572389;
            int var2 = 0;
            byte var3 = this.ab[0];

            for(int var4 = 1; var4 < this.ah * 1736396441; ++var4) {
               if (var1 <= 255) {
                  return;
               }

               if (this.ab[var4] > var3) {
                  if (var1 <= 255) {
                     return;
                  }

                  if (125 == var3) {
                     if (var1 <= 255) {
                        return;
                     }

                     this.ay = 324572389 * var2;
                  }

                  var2 = var4;
                  var3 = this.ab[var4];
               } else if (-1 == -225769235 * this.ay) {
                  if (var1 <= 255) {
                     throw new IllegalStateException();
                  }

                  if (this.ab[var4] == 125) {
                     if (var1 <= 255) {
                        throw new IllegalStateException();
                     }

                     this.ay = 324572389 * var4;
                  }
               }
            }

            this.as = var2 * 174920065;
            if (this.as * 1046818433 != -1) {
               if (var1 <= 255) {
                  throw new IllegalStateException();
               }

               this.ab[this.as * 1046818433] = 126;
            }

         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "go.au(" + ')');
      }
   }

   void co(vf var1) {
      int var2 = var1.cv(952452697);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.cv(952452697);
         if ((var3 & 1) != 0) {
            this.ae = true;
         }

         if (0 != (var3 & 2)) {
            this.ag = true;
         }

         if (!this.ae) {
            this.ap = null;
            this.av = null;
         }

         if (!this.ag) {
            this.aw = null;
            this.an = null;
         }

         this.ax = var1.cz(-1734056172) * -747236235;
         this.af = var1.cz(-1734056172) * 832393107;
         if (var2 <= 3 && 0 != this.af * 820717211) {
            this.af += -1497334048;
         }

         this.ah = var1.ct(-1810189249) * -1207884375;
         this.aj = var1.cv(952452697) * 1307803117;
         this.aq = var1.cs(-733084064);
         if (var2 >= 4) {
            var1.cz(-1734056172);
         }

         this.at = var1.cv(952452697) == 1;
         this.au = var1.cg((short)6369);
         this.ar = var1.cg((short)7109);
         this.al = var1.cg((short)29681);
         this.ad = var1.cg((short)30978);
         int var4;
         if (1736396441 * this.ah > 0) {
            if (this.ae && (null == this.ap || this.ap.length < this.ah * 1736396441)) {
               this.ap = new long[1736396441 * this.ah];
            }

            if (this.ag && (null == this.aw || this.aw.length < this.ah * 1736396441)) {
               this.aw = new String[1736396441 * this.ah];
            }

            if (null == this.ab || this.ab.length < 1736396441 * this.ah) {
               this.ab = new byte[this.ah * 1736396441];
            }

            if (null == this.aa || this.aa.length < 1736396441 * this.ah) {
               this.aa = new int[this.ah * 1736396441];
            }

            if (this.ai == null || this.ai.length < this.ah * 1736396441) {
               this.ai = new int[1736396441 * this.ah];
            }

            if (null == this.ao || this.ao.length < this.ah * 1736396441) {
               this.ao = new boolean[1736396441 * this.ah];
            }

            for(var4 = 0; var4 < 1736396441 * this.ah; ++var4) {
               if (this.ae) {
                  this.ap[var4] = var1.cw(228820183);
               }

               if (this.ag) {
                  this.aw[var4] = var1.ca(760155716);
               }

               this.ab[var4] = var1.cg((short)13462);
               if (var2 >= 2) {
                  this.aa[var4] = var1.cz(-1734056172);
               }

               if (var2 >= 5) {
                  this.ai[var4] = var1.ct(-1798766327);
               } else {
                  this.ai[var4] = 0;
               }

               if (var2 >= 6) {
                  this.ao[var4] = var1.cv(952452697) == 1;
               } else {
                  this.ao[var4] = false;
               }
            }

            this.au((short)5725);
         }

         if (this.aj * 1121871845 > 0) {
            if (this.ae && (this.av == null || this.av.length < this.aj * 1121871845)) {
               this.av = new long[1121871845 * this.aj];
            }

            if (this.ag && (null == this.an || this.an.length < 1121871845 * this.aj)) {
               this.an = new String[1121871845 * this.aj];
            }

            for(var4 = 0; var4 < 1121871845 * this.aj; ++var4) {
               if (this.ae) {
                  this.av[var4] = var1.cw(60498166);
               }

               if (this.ag) {
                  this.an[var4] = var1.ca(-830887344);
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.ct(-1947497670);
            if (var4 > 0) {
               this.ak = new ui(var4 < 16 ? at.ax(var4, 2040996289) : 16);

               while(var4-- > 0) {
                  int var5 = var1.cz(-1734056172);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (0 == var7) {
                     int var8 = var1.cz(-1734056172);
                     this.ak.ae(new th(var8), (long)var6);
                  } else if (1 == var7) {
                     long var10 = var1.cw(21758185);
                     this.ak.ae(new tv(var10), (long)var6);
                  } else if (var7 == 2) {
                     String var11 = var1.cs(1505013088);
                     this.ak.ae(new ts(var11), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   boolean cu(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 853852876 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (null != this.ak) {
         to var8 = this.ak.ac((long)var1);
         if (var8 != null) {
            if (var8 instanceof th) {
               th var9 = (th)var8;
               if (var2 == (var9.ac & var7)) {
                  return false;
               }

               var9.ac &= ~var7;
               var9.ac |= var2;
               return true;
            }

            var8.jb();
         }
      } else {
         this.ak = new ui(4);
      }

      this.ak.ae(new th(var2), (long)var1);
      return true;
   }

   boolean cn(int var1, int var2) {
      if (this.ak != null) {
         to var3 = this.ak.ac((long)var1);
         if (null != var3) {
            if (var3 instanceof th) {
               th var4 = (th)var3;
               if (var2 == var4.ac) {
                  return false;
               }

               var4.ac = var2;
               return true;
            }

            var3.jb();
         }
      } else {
         this.ak = new ui(4);
      }

      this.ak.ae(new th(var2), (long)var1);
      return true;
   }

   boolean ch(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (null != this.ak) {
         to var8 = this.ak.ac((long)var1);
         if (var8 != null) {
            if (var8 instanceof th) {
               th var9 = (th)var8;
               if (var2 == (var9.ac & var7)) {
                  return false;
               }

               var9.ac &= ~var7;
               var9.ac |= var2;
               return true;
            }

            var8.jb();
         }
      } else {
         this.ak = new ui(4);
      }

      this.ak.ae(new th(var2), (long)var1);
      return true;
   }

   int bz(int var1, byte var2) {
      if (126 != var2 && var2 != -558687821) {
         if (this.as * 1046818433 == var1 && (-225769235 * this.ay == -1 || this.ab[-225769235 * this.ay] < 597421572)) {
            return -1;
         } else if (this.ab[var1] == var2) {
            return -1;
         } else {
            this.ab[var1] = var2;
            this.au((short)7569);
            return var1;
         }
      } else {
         return -1;
      }
   }

   static int au(int var0, byte var1) {
      try {
         ct var2 = (ct)eo.ae.ac((long)var0);
         if (var2 == null) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return eo.ag.ac == var2.ew ? -1 : -1313413877 * ((ct)var2.ew).ac;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "go.au(" + ')');
      }
   }
}
