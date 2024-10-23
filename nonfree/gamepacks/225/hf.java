public class hf extends tr {
   int[] az;
   public String at;
   public final int ax;
   public int aq;
   int af;
   int aa;
   public int au;
   public int ar;
   public boolean ad;
   public int an;
   public String[] ap;
   public boolean ah;
   public static hf[] ae;
   public String ab;
   int ai;
   int ao;
   int as;
   public hg ay;
   public hq aj;
   int[] av;
   byte[] aw;
   public static ml am = new ml(256);
   static final int bg = 32;

   public vv az(boolean var1) {
      int var2 = var1 ? this.af * 1323596015 : this.aq * 1156980651;
      return this.aq(var2, 289911676);
   }

   public void am(int var1) {
      try {
         if (null != this.az) {
            if (var1 != 505668555) {
               throw new IllegalStateException();
            }

            for(int var2 = 0; var2 < this.az.length; var2 += 2) {
               if (var1 != 505668555) {
                  throw new IllegalStateException();
               }

               if (this.az[var2] < 765602613 * this.aa) {
                  if (var1 != 505668555) {
                     throw new IllegalStateException();
                  }

                  this.aa = -36368611 * this.az[var2];
               } else if (this.az[var2] > this.ao * 848582829) {
                  if (var1 != 505668555) {
                     throw new IllegalStateException();
                  }

                  this.ao = 955697957 * this.az[var2];
               }

               if (this.az[var2 + 1] < this.ai * 328277065) {
                  if (var1 != 505668555) {
                     throw new IllegalStateException();
                  }

                  this.ai = -1656908295 * this.az[var2 + 1];
               } else if (this.az[var2 + 1] > this.as * 1365672441) {
                  if (var1 != 505668555) {
                     throw new IllegalStateException();
                  }

                  this.as = this.az[var2 + 1] * 841510985;
               }
            }
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "hf.am(" + ')');
      }
   }

   void ag(vf var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            if (var3 >= 1373688001) {
               throw new IllegalStateException();
            }

            this.aq = var1.dt(-1197676375) * -736369917;
         } else if (var2 == 2) {
            if (var3 >= 1373688001) {
               throw new IllegalStateException();
            }

            this.af = var1.dt(-1212118636) * 428717583;
         } else if (3 == var2) {
            if (var3 >= 1373688001) {
               return;
            }

            this.at = var1.cs(307962292);
         } else if (4 == var2) {
            if (var3 >= 1373688001) {
               throw new IllegalStateException();
            }

            this.au = var1.cc(-2007578926) * -317358725;
         } else if (5 == var2) {
            var1.cc(445908469);
         } else if (var2 == 6) {
            this.ar = var1.cv(952452697) * 848709445;
         } else {
            int var4;
            if (7 == var2) {
               if (var3 >= 1373688001) {
                  return;
               }

               var4 = var1.cv(952452697);
               if ((var4 & 1) == 0) {
                  if (var3 >= 1373688001) {
                     return;
                  }

                  this.ad = false;
               }

               if (2 == (var4 & 2)) {
                  this.ah = true;
               }
            } else if (var2 == 8) {
               if (var3 >= 1373688001) {
                  throw new IllegalStateException();
               }

               var1.cv(952452697);
            } else {
               if (var2 >= 10) {
                  if (var3 >= 1373688001) {
                     return;
                  }

                  if (var2 <= 14) {
                     if (var3 >= 1373688001) {
                        return;
                     }

                     this.ap[var2 - 10] = var1.cs(-1968017224);
                     return;
                  }
               }

               if (var2 == 15) {
                  if (var3 >= 1373688001) {
                     return;
                  }

                  var4 = var1.cv(952452697);
                  this.az = new int[var4 * 2];

                  int var5;
                  for(var5 = 0; var5 < var4 * 2; ++var5) {
                     this.az[var5] = var1.cq(1716285582);
                  }

                  var1.cz(-1734056172);
                  var5 = var1.cv(952452697);
                  this.av = new int[var5];

                  int var6;
                  for(var6 = 0; var6 < this.av.length; ++var6) {
                     if (var3 >= 1373688001) {
                        throw new IllegalStateException();
                     }

                     this.av[var6] = var1.cz(-1734056172);
                  }

                  this.aw = new byte[var4];

                  for(var6 = 0; var6 < var4; ++var6) {
                     if (var3 >= 1373688001) {
                        return;
                     }

                     this.aw[var6] = var1.cg((short)21968);
                  }
               } else if (16 == var2) {
                  if (var3 >= 1373688001) {
                     return;
                  }
               } else if (var2 == 17) {
                  this.ab = var1.cs(-383915247);
               } else if (18 == var2) {
                  var1.dt(369918266);
               } else if (19 == var2) {
                  if (var3 >= 1373688001) {
                     return;
                  }

                  this.an = var1.ct(-1988253189) * 1168101699;
               } else if (21 == var2) {
                  if (var3 >= 1373688001) {
                     return;
                  }

                  var1.cz(-1734056172);
               } else if (22 == var2) {
                  if (var3 >= 1373688001) {
                     throw new IllegalStateException();
                  }

                  var1.cz(-1734056172);
               } else if (var2 == 23) {
                  if (var3 >= 1373688001) {
                     throw new IllegalStateException();
                  }

                  var1.cv(952452697);
                  var1.cv(952452697);
                  var1.cv(952452697);
               } else if (24 == var2) {
                  if (var3 >= 1373688001) {
                     return;
                  }

                  var1.cq(568403077);
                  var1.cq(1314932115);
               } else if (25 == var2) {
                  if (var3 >= 1373688001) {
                     throw new IllegalStateException();
                  }

                  var1.dt(1927486535);
               } else if (28 == var2) {
                  if (var3 >= 1373688001) {
                     throw new IllegalStateException();
                  }

                  var1.cv(952452697);
               } else if (29 == var2) {
                  if (var3 >= 1373688001) {
                     throw new IllegalStateException();
                  }

                  hg[] var8 = new hg[]{hg.ag, hg.ac, hg.ae};
                  this.ay = (hg)ox.ac(var8, var1.cv(952452697), 2015505412);
               } else if (var2 == 30) {
                  if (var3 >= 1373688001) {
                     throw new IllegalStateException();
                  }

                  hq[] var9 = new hq[]{hq.ae, hq.ac, hq.ag};
                  this.aj = (hq)ox.ac(var9, var1.cv(952452697), 1724999738);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "hf.ag(" + ')');
      }
   }

   public hf(int var1) {
      try {
         super();
         this.aq = 736369917;
         this.af = -428717583;
         this.ar = 0;
         this.ad = true;
         this.ah = false;
         this.ap = new String[5];
         this.aa = -2111115037;
         this.ai = -490575353;
         this.ao = Integer.MIN_VALUE;
         this.as = Integer.MIN_VALUE;
         this.ay = hg.ae;
         this.aj = hq.ae;
         this.an = -1168101699;
         this.ax = 743457171 * var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "hf.<init>(" + ')');
      }
   }

   static int aq(int var0, byte var1) {
      try {
         dl var2 = (dl)eo.ac.get(var0);
         if (null == var2) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return var2.ag(-356178290);
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "hf.aq(" + ')');
      }
   }

   vv aq(int var1, int var2) {
      try {
         if (var1 < 0) {
            return null;
         } else {
            vv var3 = (vv)am.ac((long)var1);
            if (var3 != null) {
               if (var2 <= -1403543180) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            } else {
               var3 = se.ag(fq.ac, var1, 0, -605515595);
               if (null != var3) {
                  if (var2 <= -1403543180) {
                     throw new IllegalStateException();
                  }

                  am.ag(var3, (long)var1);
               }

               return var3;
            }
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "hf.aq(" + ')');
      }
   }

   public vv ax(boolean var1, int var2) {
      try {
         int var10000;
         if (var1) {
            if (var2 <= -2037966729) {
               throw new IllegalStateException();
            }

            var10000 = this.af * 1323596015;
         } else {
            var10000 = this.aq * 1156980651;
         }

         int var3 = var10000;
         return this.aq(var3, 1753784711);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "hf.ax(" + ')');
      }
   }

   public static hf at(int var0) {
      return var0 >= 0 && var0 < ae.length && ae[var0] != null ? ae[var0] : new hf(var0);
   }

   public static hf au(int var0) {
      return var0 >= 0 && var0 < ae.length && ae[var0] != null ? ae[var0] : new hf(var0);
   }

   void ar(vf var1, int var2) {
      if (var2 == 1) {
         this.aq = var1.dt(-1861795966) * -1317685619;
      } else if (var2 == 2) {
         this.af = var1.dt(99170715) * -1225560780;
      } else if (3 == var2) {
         this.at = var1.cs(694764766);
      } else if (4 == var2) {
         this.au = var1.cc(911834664) * -317358725;
      } else if (5 == var2) {
         var1.cc(971903848);
      } else if (var2 == 6) {
         this.ar = var1.cv(952452697) * -2117788010;
      } else {
         int var3;
         if (7 == var2) {
            var3 = var1.cv(952452697);
            if ((var3 & 1) == 0) {
               this.ad = false;
            }

            if (2 == (var3 & 2)) {
               this.ah = true;
            }
         } else if (var2 == 8) {
            var1.cv(952452697);
         } else if (var2 >= 10 && var2 <= 14) {
            this.ap[var2 - 10] = var1.cs(619001761);
         } else if (var2 == 15) {
            var3 = var1.cv(952452697);
            this.az = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < var3 * 2; ++var4) {
               this.az[var4] = var1.cq(-396212670);
            }

            var1.cz(-1734056172);
            var4 = var1.cv(952452697);
            this.av = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.av.length; ++var5) {
               this.av[var5] = var1.cz(-1734056172);
            }

            this.aw = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.aw[var5] = var1.cg((short)-7571);
            }
         } else if (16 != var2) {
            if (var2 == 17) {
               this.ab = var1.cs(570804169);
            } else if (18 == var2) {
               var1.dt(1753937585);
            } else if (19 == var2) {
               this.an = var1.ct(-1356963388) * 1168101699;
            } else if (21 == var2) {
               var1.cz(-1734056172);
            } else if (22 == var2) {
               var1.cz(-1734056172);
            } else if (var2 == 23) {
               var1.cv(952452697);
               var1.cv(952452697);
               var1.cv(952452697);
            } else if (24 == var2) {
               var1.cq(2138729571);
               var1.cq(-1811877591);
            } else if (25 == var2) {
               var1.dt(-221491540);
            } else if (28 == var2) {
               var1.cv(952452697);
            } else if (29 == var2) {
               hg[] var6 = new hg[]{hg.ag, hg.ac, hg.ae};
               this.ay = (hg)ox.ac(var6, var1.cv(952452697), 1566766317);
            } else if (var2 == 30) {
               hq[] var7 = new hq[]{hq.ae, hq.ac, hq.ag};
               this.aj = (hq)ox.ac(var7, var1.cv(952452697), 384197914);
            }
         }
      }

   }

   void al(vf var1, int var2) {
      if (var2 == 1) {
         this.aq = var1.dt(1073126537) * -736369917;
      } else if (var2 == 2) {
         this.af = var1.dt(1855375801) * 428717583;
      } else if (3 == var2) {
         this.at = var1.cs(1429457761);
      } else if (4 == var2) {
         this.au = var1.cc(-968752861) * -317358725;
      } else if (5 == var2) {
         var1.cc(472056131);
      } else if (var2 == 6) {
         this.ar = var1.cv(952452697) * 848709445;
      } else {
         int var3;
         if (7 == var2) {
            var3 = var1.cv(952452697);
            if ((var3 & 1) == 0) {
               this.ad = false;
            }

            if (2 == (var3 & 2)) {
               this.ah = true;
            }
         } else if (var2 == 8) {
            var1.cv(952452697);
         } else if (var2 >= 10 && var2 <= 14) {
            this.ap[var2 - 10] = var1.cs(1404057367);
         } else if (var2 == 15) {
            var3 = var1.cv(952452697);
            this.az = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < var3 * 2; ++var4) {
               this.az[var4] = var1.cq(-1018341383);
            }

            var1.cz(-1734056172);
            var4 = var1.cv(952452697);
            this.av = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.av.length; ++var5) {
               this.av[var5] = var1.cz(-1734056172);
            }

            this.aw = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.aw[var5] = var1.cg((short)-18716);
            }
         } else if (16 != var2) {
            if (var2 == 17) {
               this.ab = var1.cs(-251589696);
            } else if (18 == var2) {
               var1.dt(-1517437516);
            } else if (19 == var2) {
               this.an = var1.ct(-1735735178) * 1168101699;
            } else if (21 == var2) {
               var1.cz(-1734056172);
            } else if (22 == var2) {
               var1.cz(-1734056172);
            } else if (var2 == 23) {
               var1.cv(952452697);
               var1.cv(952452697);
               var1.cv(952452697);
            } else if (24 == var2) {
               var1.cq(1261791270);
               var1.cq(2089274909);
            } else if (25 == var2) {
               var1.dt(-1915097368);
            } else if (28 == var2) {
               var1.cv(952452697);
            } else if (29 == var2) {
               hg[] var6 = new hg[]{hg.ag, hg.ac, hg.ae};
               this.ay = (hg)ox.ac(var6, var1.cv(952452697), 1841187873);
            } else if (var2 == 30) {
               hq[] var7 = new hq[]{hq.ae, hq.ac, hq.ag};
               this.aj = (hq)ox.ac(var7, var1.cv(952452697), 630036365);
            }
         }
      }

   }

   public void ad() {
      if (null != this.az) {
         for(int var1 = 0; var1 < this.az.length; var1 += 2) {
            if (this.az[var1] < 1392516818 * this.aa) {
               this.aa = -1088670456 * this.az[var1];
            } else if (this.az[var1] > this.ao * 848582829) {
               this.ao = 955697957 * this.az[var1];
            }

            if (this.az[var1 + 1] < this.ai * 328277065) {
               this.ai = -1656908295 * this.az[var1 + 1];
            } else if (this.az[var1 + 1] > this.as * -167716780) {
               this.as = this.az[var1 + 1] * 841510985;
            }
         }
      }

   }

   public int af(int var1) {
      try {
         return this.ax * 1901462683;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "hf.af(" + ')');
      }
   }

   public void ap() {
      if (null != this.az) {
         for(int var1 = 0; var1 < this.az.length; var1 += 2) {
            if (this.az[var1] < 765602613 * this.aa) {
               this.aa = -36368611 * this.az[var1];
            } else if (this.az[var1] > this.ao * 848582829) {
               this.ao = 955697957 * this.az[var1];
            }

            if (this.az[var1 + 1] < this.ai * 328277065) {
               this.ai = -1656908295 * this.az[var1 + 1];
            } else if (this.az[var1 + 1] > this.as * 1365672441) {
               this.as = this.az[var1 + 1] * 841510985;
            }
         }
      }

   }

   public void ah() {
      if (null != this.az) {
         for(int var1 = 0; var1 < this.az.length; var1 += 2) {
            if (this.az[var1] < 765602613 * this.aa) {
               this.aa = -36368611 * this.az[var1];
            } else if (this.az[var1] > this.ao * 848582829) {
               this.ao = 955697957 * this.az[var1];
            }

            if (this.az[var1 + 1] < this.ai * 328277065) {
               this.ai = -1656908295 * this.az[var1 + 1];
            } else if (this.az[var1 + 1] > this.as * 1365672441) {
               this.as = this.az[var1 + 1] * 841510985;
            }
         }
      }

   }

   public void ae(vf var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cv(952452697);
            if (0 == var3) {
               if (var2 <= -1703344584) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ag(var1, var3, 416203806);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "hf.ae(" + ')');
      }
   }

   public vv aa(boolean var1) {
      int var2 = var1 ? this.af * 1323596015 : this.aq * 1700589035;
      return this.aq(var2, 1759655611);
   }

   vv ai(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         vv var2 = (vv)am.ac((long)var1);
         if (var2 != null) {
            return var2;
         } else {
            var2 = se.ag(fq.ac, var1, 0, -605515595);
            if (null != var2) {
               am.ag(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   public int ao() {
      return this.ax * 1901462683;
   }

   public int as() {
      return this.ax * -341984100;
   }

   public int ay() {
      return this.ax * -1010701184;
   }

   public static final synchronized long ac(int var0) {
      try {
         long var1 = System.currentTimeMillis();
         if (var1 < mi.ac * 8085800780495672759L) {
            if (var0 != -1598214665) {
               throw new IllegalStateException();
            }

            mi.ae += (8085800780495672759L * mi.ac - var1) * 8270228839489505047L;
         }

         mi.ac = 1185967563150628871L * var1;
         return var1 + 4340951857660502183L * mi.ae;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "hf.ac(" + ')');
      }
   }

   public void ab() {
      if (null != this.az) {
         for(int var1 = 0; var1 < this.az.length; var1 += 2) {
            if (this.az[var1] < -1320476143 * this.aa) {
               this.aa = -36368611 * this.az[var1];
            } else if (this.az[var1] > this.ao * 848582829) {
               this.ao = -1322436334 * this.az[var1];
            }

            if (this.az[var1 + 1] < this.ai * -290607482) {
               this.ai = -1656908295 * this.az[var1 + 1];
            } else if (this.az[var1 + 1] > this.as * 370838773) {
               this.as = this.az[var1 + 1] * 841510985;
            }
         }
      }

   }

   static int be(int var0, dt var1, boolean var2, byte var3) {
      try {
         if (var0 == 7463) {
            if (var3 == 25) {
               throw new IllegalStateException();
            } else {
               boolean var10000;
               if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                  if (var3 == 25) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var4 = var10000;
               oy.pu(var4, 1499896585);
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "hf.be(" + ')');
      }
   }
}
