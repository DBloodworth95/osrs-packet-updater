public class id extends tr {
   public int bo;
   public int an;
   public static ml am = new ml(4096);
   public static ml ax = new ml(500);
   public static ml aq = new ml(30);
   public static ml af = new ml(30);
   static po ae;
   public int au;
   public int ao;
   int[] al;
   int bw;
   short[] ah;
   short[] ap;
   short[] ab;
   short[] az;
   public String ad;
   public int ai;
   static jv[] at = new jv[4];
   public int aa;
   int bh;
   static boolean ac = false;
   boolean av;
   public boolean aw;
   public int ay;
   public int ak;
   int bn;
   int bp;
   public String[] bd;
   public int bx;
   public int bf;
   int bu;
   public boolean bs;
   int[] ar;
   int ba;
   int bj;
   int aj;
   int by;
   int bb;
   public boolean bi;
   boolean bg;
   public int bl;
   public int[] bz;
   public boolean as;
   int br;
   static int tc;
   public int bv;
   public int bt;
   public int bq;
   public int bk;
   public int[] be;
   public boolean bc;
   public boolean cn;
   ui ch;
   boolean bm;

   void ag(int var1) {
      try {
         if (this.ay * -1478169491 == -1) {
            if (var1 >= -928823359) {
               return;
            }

            this.ay = 0;
            if (null != this.ar) {
               label76: {
                  if (var1 >= -928823359) {
                     throw new IllegalStateException();
                  }

                  if (this.al != null) {
                     if (10 != this.al[0]) {
                        break label76;
                     }

                     if (var1 >= -928823359) {
                        throw new IllegalStateException();
                     }
                  }

                  this.ay = 1724120421;
               }
            }

            for(int var2 = 0; var2 < 5; ++var2) {
               if (var1 >= -928823359) {
                  throw new IllegalStateException();
               }

               if (this.bd[var2] != null) {
                  if (var1 >= -928823359) {
                     throw new IllegalStateException();
                  }

                  this.ay = 1724120421;
               }
            }
         }

         if (-1 == this.bl * -937149393) {
            if (var1 >= -928823359) {
               throw new IllegalStateException();
            }

            this.bl = -950105393 * (0 != 891389023 * this.ao ? 1 : 0);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "id.ag(" + ')');
      }
   }

   public final boolean aq(int var1, byte var2) {
      try {
         if (null == this.al) {
            if (var2 >= 65) {
               throw new IllegalStateException();
            } else if (this.ar == null) {
               if (var2 >= 65) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else if (var1 != 10) {
               if (var2 >= 65) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               boolean var6 = true;

               for(int var4 = 0; var4 < this.ar.length; ++var4) {
                  if (var2 >= 65) {
                     throw new IllegalStateException();
                  }

                  var6 &= aa.ag.bk(this.ar[var4] & '\uffff', 0, (byte)3);
               }

               return var6;
            }
         } else {
            for(int var3 = 0; var3 < this.al.length; ++var3) {
               if (var2 >= 65) {
                  throw new IllegalStateException();
               }

               if (var1 == this.al[var3]) {
                  if (var2 >= 65) {
                     throw new IllegalStateException();
                  }

                  return aa.ag.bk(this.ar[var3] & '\uffff', 0, (byte)44);
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "id.aq(" + ')');
      }
   }

   public final id bv() {
      int var1 = -1;
      if (-1 != this.bu * 459049337) {
         var1 = fi.ac(this.bu * 459049337, (byte)0);
      } else if (-1 != 181373133 * this.br) {
         var1 = no.am[this.br * -924687435];
      }

      int var2;
      if (var1 >= 0 && var1 < this.bz.length - 1) {
         var2 = this.bz[var1];
      } else {
         var2 = this.bz[this.bz.length - 1];
      }

      return var2 != -1 ? kf.ae(var2, (byte)118) : null;
   }

   void ax(vf var1, int var2, byte var3) {
      try {
         int var4;
         int var5;
         if (var2 == 1) {
            if (var3 <= -2) {
               throw new IllegalStateException();
            }

            var4 = var1.cv(952452697);
            if (var4 > 0) {
               if (var3 <= -2) {
                  throw new IllegalStateException();
               }

               if (null != this.ar) {
                  if (var3 <= -2) {
                     throw new IllegalStateException();
                  }

                  if (!ac) {
                     var1.au += var4 * -1298407601;
                     return;
                  }

                  if (var3 <= -2) {
                     throw new IllegalStateException();
                  }
               }

               this.al = new int[var4];
               this.ar = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 <= -2) {
                     return;
                  }

                  this.ar[var5] = var1.ct(-1969011512);
                  this.al[var5] = var1.cv(952452697);
               }
            }
         } else if (2 == var2) {
            if (var3 <= -2) {
               throw new IllegalStateException();
            }

            this.ad = var1.cs(-1811980589);
         } else if (5 == var2) {
            if (var3 <= -2) {
               return;
            }

            var4 = var1.cv(952452697);
            if (var4 > 0) {
               if (var3 <= -2) {
                  return;
               }

               if (this.ar != null) {
                  if (!ac) {
                     var1.au += var4 * 566050698;
                     return;
                  }

                  if (var3 <= -2) {
                     throw new IllegalStateException();
                  }
               }

               this.al = null;
               this.ar = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.ar[var5] = var1.ct(-2104206255);
               }
            }
         } else if (14 == var2) {
            if (var3 <= -2) {
               throw new IllegalStateException();
            }

            this.aa = var1.cv(952452697) * -1725654441;
         } else if (var2 == 15) {
            if (var3 <= -2) {
               throw new IllegalStateException();
            }

            this.ai = var1.cv(952452697) * -1561781357;
         } else if (var2 == 17) {
            this.ao = 0;
            this.as = false;
         } else if (18 == var2) {
            if (var3 <= -2) {
               throw new IllegalStateException();
            }

            this.as = false;
         } else if (19 == var2) {
            if (var3 <= -2) {
               throw new IllegalStateException();
            }

            this.ay = var1.cv(952452697) * 1724120421;
         } else if (var2 == 21) {
            if (var3 <= -2) {
               return;
            }

            this.aj = 0;
         } else if (var2 == 22) {
            if (var3 <= -2) {
               throw new IllegalStateException();
            }

            this.av = true;
         } else if (23 == var2) {
            if (var3 <= -2) {
               throw new IllegalStateException();
            }

            this.aw = true;
         } else if (var2 == 24) {
            this.an = var1.ct(-1837877076) * -1860273323;
            if (65535 == this.an * 1369549309) {
               this.an = 1860273323;
            }
         } else if (27 == var2) {
            this.ao = -321005665;
         } else if (var2 == 28) {
            if (var3 <= -2) {
               throw new IllegalStateException();
            }

            this.ak = var1.cv(952452697) * -1067101251;
         } else if (29 == var2) {
            this.bn = var1.cg((short)-19205) * 462637931;
         } else if (var2 == 39) {
            if (var3 <= -2) {
               throw new IllegalStateException();
            }

            this.bh = var1.cg((short)-13359) * -12239489;
         } else {
            if (var2 >= 30) {
               if (var3 <= -2) {
                  throw new IllegalStateException();
               }

               if (var2 < 35) {
                  if (var3 <= -2) {
                     return;
                  }

                  this.bd[var2 - 30] = var1.cs(-597625767);
                  if (this.bd[var2 - 30].equalsIgnoreCase(ok.aq)) {
                     if (var3 <= -2) {
                        throw new IllegalStateException();
                     }

                     this.bd[var2 - 30] = null;
                  }

                  return;
               }
            }

            if (var2 == 40) {
               var4 = var1.cv(952452697);
               this.ah = new short[var4];
               this.ap = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 <= -2) {
                     throw new IllegalStateException();
                  }

                  this.ah[var5] = (short)var1.ct(-1560227498);
                  this.ap[var5] = (short)var1.ct(-1554521290);
               }
            } else if (41 == var2) {
               var4 = var1.cv(952452697);
               this.ab = new short[var4];
               this.az = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 <= -2) {
                     throw new IllegalStateException();
                  }

                  this.ab[var5] = (short)var1.ct(-1471021652);
                  this.az[var5] = (short)var1.ct(-1967601317);
               }
            } else if (var2 == 61) {
               if (var3 <= -2) {
                  return;
               }

               var1.ct(-1406330661);
            } else if (var2 == 62) {
               if (var3 <= -2) {
                  throw new IllegalStateException();
               }

               this.bm = true;
            } else if (64 == var2) {
               if (var3 <= -2) {
                  throw new IllegalStateException();
               }

               this.bs = false;
            } else if (var2 == 65) {
               if (var3 <= -2) {
                  throw new IllegalStateException();
               }

               this.bw = var1.ct(-2003186057) * 405464899;
            } else if (var2 == 66) {
               if (var3 <= -2) {
                  return;
               }

               this.ba = var1.ct(-1958915067) * -1861210727;
            } else if (67 == var2) {
               if (var3 <= -2) {
                  return;
               }

               this.bj = var1.ct(-2046315117) * 1960253313;
            } else if (68 == var2) {
               if (var3 <= -2) {
                  throw new IllegalStateException();
               }

               this.bf = var1.ct(-1524514409) * -1071586629;
            } else if (69 == var2) {
               if (var3 <= -2) {
                  throw new IllegalStateException();
               }

               var1.cv(952452697);
            } else if (var2 == 70) {
               if (var3 <= -2) {
                  throw new IllegalStateException();
               }

               this.bp = var1.cq(-577926988) * -1759710193;
            } else if (var2 == 71) {
               if (var3 <= -2) {
                  throw new IllegalStateException();
               }

               this.by = var1.cq(-236988870) * 1394297355;
            } else if (var2 == 72) {
               if (var3 <= -2) {
                  throw new IllegalStateException();
               }

               this.bb = var1.cq(72929454) * 822533157;
            } else if (var2 == 73) {
               if (var3 <= -2) {
                  throw new IllegalStateException();
               }

               this.bi = true;
            } else if (var2 == 74) {
               if (var3 <= -2) {
                  throw new IllegalStateException();
               }

               this.bg = true;
            } else if (var2 == 75) {
               this.bl = var1.cv(952452697) * -950105393;
            } else {
               if (77 != var2) {
                  if (var3 <= -2) {
                     return;
                  }

                  if (92 != var2) {
                     if (var2 == 78) {
                        if (var3 <= -2) {
                           throw new IllegalStateException();
                        }

                        this.bo = var1.ct(-1560012420) * 35301021;
                        this.bv = var1.cv(952452697) * 1844677151;
                        this.bt = var1.cv(952452697) * -144999925;
                        return;
                     } else if (79 == var2) {
                        if (var3 <= -2) {
                           throw new IllegalStateException();
                        }

                        this.bq = var1.ct(-1489644052) * -183523323;
                        this.bk = var1.ct(-1588588336) * 1149131421;
                        this.bv = var1.cv(952452697) * 1844677151;
                        this.bt = var1.cv(952452697) * -144999925;
                        var4 = var1.cv(952452697);
                        this.be = new int[var4];

                        for(var5 = 0; var5 < var4; ++var5) {
                           if (var3 <= -2) {
                              throw new IllegalStateException();
                           }

                           this.be[var5] = var1.ct(-1933852483);
                        }

                        return;
                     } else if (81 == var2) {
                        if (var3 <= -2) {
                           throw new IllegalStateException();
                        }

                        var1.cv(952452697);
                        return;
                     } else if (var2 == 82) {
                        this.bx = var1.ct(-1882917776) * 1337384593;
                        return;
                     } else if (89 == var2) {
                        if (var3 <= -2) {
                           throw new IllegalStateException();
                        }

                        this.bc = false;
                        return;
                     } else {
                        if (90 == var2) {
                           if (var3 <= -2) {
                              throw new IllegalStateException();
                           }

                           this.cn = true;
                        } else if (249 == var2) {
                           this.ch = gu.ac(var1, this.ch, 2129473868);
                           return;
                        }

                        return;
                     }
                  }

                  if (var3 <= -2) {
                     throw new IllegalStateException();
                  }
               }

               this.bu = var1.ct(-1671785224) * -1306226487;
               if (this.bu * 459049337 == 65535) {
                  this.bu = 1306226487;
               }

               this.br = var1.ct(-1776350092) * 1403105949;
               if (65535 == -924687435 * this.br) {
                  if (var3 <= -2) {
                     return;
                  }

                  this.br = -1403105949;
               }

               var4 = -1;
               if (92 == var2) {
                  if (var3 <= -2) {
                     throw new IllegalStateException();
                  }

                  var4 = var1.ct(-2068571397);
                  if (var4 == 65535) {
                     if (var3 <= -2) {
                        return;
                     }

                     var4 = -1;
                  }
               }

               var5 = var1.cv(952452697);
               this.bz = new int[var5 + 2];

               for(int var6 = 0; var6 <= var5; ++var6) {
                  if (var3 <= -2) {
                     throw new IllegalStateException();
                  }

                  this.bz[var6] = var1.ct(-1997585889);
                  if (65535 == this.bz[var6]) {
                     if (var3 <= -2) {
                        throw new IllegalStateException();
                     }

                     this.bz[var6] = -1;
                  }
               }

               this.bz[1 + var5] = var4;
            }
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "id.ax(" + ')');
      }
   }

   public final jm au(int var1, int var2, int[][] var3, int var4, int var5, int var6, byte var7) {
      try {
         long var8;
         if (null == this.al) {
            var8 = (long)(var2 + (this.au * -1484588863 << 10));
         } else {
            var8 = (long)((this.au * -1484588863 << 10) + (var1 << 3) + var2);
         }

         jm var10 = (jm)af.ac(var8);
         if (var10 == null) {
            if (var7 != 1) {
               throw new IllegalStateException();
            }

            jv var11 = this.al(var1, var2, -1476302060);
            if (var11 == null) {
               if (var7 != 1) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var10 = var11.bn(64 + 1946519875 * this.bn, 768 + -662651289 * this.bh, -50, -10, -50);
            af.ag(var10, var8);
         }

         if (1371685171 * this.aj >= 0) {
            if (var7 != 1) {
               throw new IllegalStateException();
            }

            var10 = var10.am(var3, var4, var5, var6, true, 1371685171 * this.aj);
         }

         return var10;
      } catch (RuntimeException var12) {
         throw vk.ae(var12, "id.au(" + ')');
      }
   }

   public final jm bi(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.al) {
         var7 = (long)(var2 + (this.au * -1484588863 << 10));
      } else {
         var7 = (long)((this.au * -1484588863 << 10) + (var1 << 3) + var2);
      }

      jm var9 = (jm)af.ac(var7);
      if (var9 == null) {
         jv var10 = this.al(var1, var2, -1443617429);
         if (var10 == null) {
            return null;
         }

         var9 = var10.bn(64 + 1946519875 * this.bn, 768 + -662651289 * this.bh, -50, -10, -50);
         af.ag(var9, var7);
      }

      if (1371685171 * this.aj >= 0) {
         var9 = var9.am(var3, var4, var5, var6, true, 1371685171 * this.aj);
      }

      return var9;
   }

   public final ju at(int var1, int var2, int[][] var3, int var4, int var5, int var6, byte var7) {
      try {
         long var8;
         if (null == this.al) {
            var8 = (long)((-1484588863 * this.au << 10) + var2);
         } else {
            var8 = (long)(var2 + (var1 << 3) + (-1484588863 * this.au << 10));
         }

         Object var10 = (ju)aq.ac(var8);
         if (null == var10) {
            if (var7 >= 7) {
               throw new IllegalStateException();
            }

            jv var11 = this.al(var1, var2, 1789643888);
            if (var11 == null) {
               if (var7 >= 7) {
                  throw new IllegalStateException();
               }

               return null;
            }

            if (!this.av) {
               var10 = var11.bn(this.bn * 1946519875 + 64, 768 + -662651289 * this.bh, -50, -10, -50);
            } else {
               var11.bs = (short)(1946519875 * this.bn + 64);
               var11.bw = (short)(768 + this.bh * -662651289);
               var11.av();
               var10 = var11;
            }

            aq.ag((tr)var10, var8);
         }

         if (this.av) {
            if (var7 >= 7) {
               throw new IllegalStateException();
            }

            var10 = ((jv)var10).af();
         }

         if (this.aj * 1371685171 >= 0) {
            if (var7 >= 7) {
               throw new IllegalStateException();
            }

            if (var10 instanceof jm) {
               if (var7 >= 7) {
                  throw new IllegalStateException();
               }

               var10 = ((jm)var10).am(var3, var4, var5, var6, true, 1371685171 * this.aj);
            } else if (var10 instanceof jv) {
               if (var7 >= 7) {
                  throw new IllegalStateException();
               }

               var10 = ((jv)var10).at(var3, var4, var5, var6, true, this.aj * 1371685171);
            }
         }

         return (ju)var10;
      } catch (RuntimeException var12) {
         throw vk.ae(var12, "id.at(" + ')');
      }
   }

   public boolean ab(int var1) {
      try {
         if (null == this.bz) {
            if (var1 == -1274012803) {
               throw new IllegalStateException();
            } else {
               boolean var10000;
               if (-1 == 23662517 * this.bo) {
                  if (null == this.be) {
                     var10000 = false;
                     return var10000;
                  }

                  if (var1 == -1274012803) {
                     throw new IllegalStateException();
                  }
               }

               var10000 = true;
               return var10000;
            }
         } else {
            int var2 = 0;

            while(true) {
               if (var2 >= this.bz.length) {
                  return false;
               }

               if (var1 == -1274012803) {
                  throw new IllegalStateException();
               }

               if (-1 != this.bz[var2]) {
                  if (var1 == -1274012803) {
                     throw new IllegalStateException();
                  }

                  id var3 = kf.ae(this.bz[var2], (byte)7);
                  if (var3.bo * 23662517 != -1) {
                     break;
                  }

                  if (var1 == -1274012803) {
                     throw new IllegalStateException();
                  }

                  if (null != var3.be) {
                     if (var1 == -1274012803) {
                        throw new IllegalStateException();
                     }
                     break;
                  }
               }

               ++var2;
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "id.ab(" + ')');
      }
   }

   public final ju by(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.al) {
         var7 = (long)((-1484588863 * this.au << 10) + var2);
      } else {
         var7 = (long)(var2 + (var1 << 3) + (-1484588863 * this.au << 10));
      }

      Object var9 = (ju)aq.ac(var7);
      if (null == var9) {
         jv var10 = this.al(var1, var2, -65688943);
         if (var10 == null) {
            return null;
         }

         if (!this.av) {
            var9 = var10.bn(this.bn * 1946519875 + 64, 768 + -662651289 * this.bh, -50, -10, -50);
         } else {
            var10.bs = (short)(1946519875 * this.bn + 64);
            var10.bw = (short)(768 + this.bh * -662651289);
            var10.av();
            var9 = var10;
         }

         aq.ag((tr)var9, var7);
      }

      if (this.av) {
         var9 = ((jv)var9).af();
      }

      if (this.aj * 1371685171 >= 0) {
         if (var9 instanceof jm) {
            var9 = ((jm)var9).am(var3, var4, var5, var6, true, 1371685171 * this.aj);
         } else if (var9 instanceof jv) {
            var9 = ((jv)var9).at(var3, var4, var5, var6, true, this.aj * 1371685171);
         }
      }

      return (ju)var9;
   }

   final jv al(int var1, int var2, int var3) {
      try {
         jv var4 = null;
         boolean var5;
         int var6;
         int var8;
         boolean var10000;
         if (null == this.al) {
            if (var3 == 1558274167) {
               throw new IllegalStateException();
            }

            if (10 != var1) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               return null;
            }

            if (null == this.ar) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var5 = this.bm;
            if (var1 == 2) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               if (var2 > 3) {
                  if (var3 == 1558274167) {
                     throw new IllegalStateException();
                  }

                  if (!var5) {
                     if (var3 == 1558274167) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  var5 = var10000;
               }
            }

            var6 = this.ar.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               var8 = this.ar[var7];
               if (var5) {
                  if (var3 == 1558274167) {
                     throw new IllegalStateException();
                  }

                  var8 += 65536;
               }

               var4 = (jv)ax.ac((long)var8);
               if (var4 == null) {
                  var4 = jv.ac(aa.ag, var8 & '\uffff', 0);
                  if (null == var4) {
                     if (var3 == 1558274167) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  if (var5) {
                     if (var3 == 1558274167) {
                        throw new IllegalStateException();
                     }

                     var4.ay();
                  }

                  ax.ag(var4, (long)var8);
               }

               if (var6 > 1) {
                  if (var3 == 1558274167) {
                     throw new IllegalStateException();
                  }

                  at[var7] = var4;
               }
            }

            if (var6 > 1) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               var4 = new jv(at, var6);
            }
         } else {
            int var10 = -1;

            for(var6 = 0; var6 < this.al.length; ++var6) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               if (var1 == this.al[var6]) {
                  if (var3 == 1558274167) {
                     throw new IllegalStateException();
                  }

                  var10 = var6;
                  break;
               }
            }

            if (var10 == -1) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var6 = this.ar[var10];
            var10000 = this.bm;
            boolean var10001;
            if (var2 > 3) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            boolean var11 = var10000 ^ var10001;
            if (var11) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               var6 += 65536;
            }

            var4 = (jv)ax.ac((long)var6);
            if (null == var4) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               var4 = jv.ac(aa.ag, var6 & '\uffff', 0);
               if (null == var4) {
                  return null;
               }

               if (var11) {
                  if (var3 == 1558274167) {
                     throw new IllegalStateException();
                  }

                  var4.ay();
               }

               ax.ag(var4, (long)var6);
            }
         }

         label340: {
            if (128 == this.bw * -1948623509) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               if (this.ba * -1068181847 == 128) {
                  if (var3 == 1558274167) {
                     throw new IllegalStateException();
                  }

                  if (611395713 * this.bj == 128) {
                     var5 = false;
                     break label340;
                  }

                  if (var3 == 1558274167) {
                     throw new IllegalStateException();
                  }
               }
            }

            var5 = true;
         }

         boolean var12;
         label331: {
            if (0 == 415726319 * this.bp) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               if (0 == -1250725469 * this.by) {
                  if (var3 == 1558274167) {
                     throw new IllegalStateException();
                  }

                  if (this.bb * -1033510995 == 0) {
                     var12 = false;
                     break label331;
                  }
               }
            }

            var12 = true;
         }

         jv var14;
         boolean var10003;
         label323: {
            var14 = new jv;
            if (var2 == 0) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               if (!var5 && !var12) {
                  if (var3 == 1558274167) {
                     throw new IllegalStateException();
                  }

                  var10003 = true;
                  break label323;
               }
            }

            var10003 = false;
         }

         boolean var10004;
         if (this.ah == null) {
            if (var3 == 1558274167) {
               throw new IllegalStateException();
            }

            var10004 = true;
         } else {
            var10004 = false;
         }

         boolean var10005;
         if (this.ab == null) {
            if (var3 == 1558274167) {
               throw new IllegalStateException();
            }

            var10005 = true;
         } else {
            var10005 = false;
         }

         var14.<init>(var4, var10003, var10004, var10005, true);
         jv var13 = var14;
         if (var1 == 4) {
            if (var3 == 1558274167) {
               throw new IllegalStateException();
            }

            if (var2 > 3) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               var13.aa(256);
               var13.ai(45, 0, -45);
            }
         }

         var2 &= 3;
         if (1 == var2) {
            if (var3 == 1558274167) {
               throw new IllegalStateException();
            }

            var13.ar();
         } else if (2 == var2) {
            if (var3 == 1558274167) {
               throw new IllegalStateException();
            }

            var13.al();
         } else if (var2 == 3) {
            if (var3 == 1558274167) {
               throw new IllegalStateException();
            }

            var13.az();
         }

         if (this.ah != null) {
            if (var3 == 1558274167) {
               throw new IllegalStateException();
            }

            for(var8 = 0; var8 < this.ah.length; ++var8) {
               var13.ao(this.ah[var8], this.ap[var8]);
            }
         }

         if (null != this.ab) {
            if (var3 == 1558274167) {
               throw new IllegalStateException();
            }

            for(var8 = 0; var8 < this.ab.length; ++var8) {
               if (var3 == 1558274167) {
                  throw new IllegalStateException();
               }

               var13.as(this.ab[var8], this.az[var8]);
            }
         }

         if (var5) {
            if (var3 == 1558274167) {
               throw new IllegalStateException();
            }

            var13.aj(-1948623509 * this.bw, -1068181847 * this.ba, 611395713 * this.bj);
         }

         if (var12) {
            if (var3 == 1558274167) {
               throw new IllegalStateException();
            }

            var13.ai(this.bp * 415726319, -1250725469 * this.by, this.bb * -1033510995);
         }

         return var13;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "id.al(" + ')');
      }
   }

   public final id ad(int var1) {
      try {
         int var2 = -1;
         if (-1 != this.bu * 459049337) {
            if (var1 >= 1153722796) {
               throw new IllegalStateException();
            }

            var2 = fi.ac(this.bu * 459049337, (byte)0);
         } else if (-1 != -924687435 * this.br) {
            if (var1 >= 1153722796) {
               throw new IllegalStateException();
            }

            var2 = no.am[this.br * -924687435];
         }

         int var3;
         label47: {
            if (var2 >= 0) {
               if (var1 >= 1153722796) {
                  throw new IllegalStateException();
               }

               if (var2 < this.bz.length - 1) {
                  var3 = this.bz[var2];
                  break label47;
               }

               if (var1 >= 1153722796) {
                  throw new IllegalStateException();
               }
            }

            var3 = this.bz[this.bz.length - 1];
         }

         if (var3 != -1) {
            if (var1 >= 1153722796) {
               throw new IllegalStateException();
            } else {
               return kf.ae(var3, (byte)126);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "id.ad(" + ')');
      }
   }

   public int ah(int var1, int var2, int var3) {
      try {
         return bh.ae(this.ch, var1, var2, -1291913852);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "id.ah(" + ')');
      }
   }

   public String ap(int var1, String var2, byte var3) {
      try {
         ui var5 = this.ch;
         String var4;
         if (null == var5) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var4 = var2;
         } else {
            ts var6 = (ts)var5.ac((long)var1);
            if (null == var6) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               var4 = var2;
            } else {
               var4 = (String)var6.ac;
            }
         }

         return var4;
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "id.ap(" + ')');
      }
   }

   void am(vf var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cv(952452697);
            if (0 == var3) {
               if (var2 <= -1686613382) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ax(var1, var3, (byte)88);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "id.am(" + ')');
      }
   }

   public int bc(int var1, int var2) {
      return bh.ae(this.ch, var1, var2, -210424184);
   }

   public static void aa(po var0, po var1, boolean var2) {
      ae = var0;
      aa.ag = var1;
      ac = var2;
   }

   public static void ai(po var0, po var1, boolean var2) {
      ae = var0;
      aa.ag = var1;
      ac = var2;
   }

   void an() {
      if (this.ay * -1478169491 == -1) {
         this.ay = 0;
         if (null != this.ar && (this.al == null || 10 == this.al[0])) {
            this.ay = 601518019;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if (this.bd[var1] != null) {
               this.ay = 1724120421;
            }
         }
      }

      if (-1 == this.bl * -937149393) {
         this.bl = -774124104 * (0 != 891389023 * this.ao ? 1 : 0);
      }

   }

   public static id as(int var0) {
      id var1 = (id)am.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ae.bt(6, var0, (byte)-26);
         var1 = new id();
         var1.au = var0 * -347760831;
         if (null != var2) {
            var1.am(new vf(var2), 1324772186);
         }

         var1.ag(-1863760631);
         if (var1.bg) {
            var1.ao = 0;
            var1.as = false;
         }

         am.ag(var1, (long)var0);
         return var1;
      }
   }

   public static id ay(int var0) {
      id var1 = (id)am.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ae.bt(6, var0, (byte)-23);
         var1 = new id();
         var1.au = var0 * -347760831;
         if (null != var2) {
            var1.am(new vf(var2), 472777694);
         }

         var1.ag(-1586058910);
         if (var1.bg) {
            var1.ao = 0;
            var1.as = false;
         }

         am.ag(var1, (long)var0);
         return var1;
      }
   }

   public static id aj(int var0) {
      id var1 = (id)am.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ae.bt(6, var0, (byte)26);
         var1 = new id();
         var1.au = var0 * -347760831;
         if (null != var2) {
            var1.am(new vf(var2), 19903589);
         }

         var1.ag(-1888155594);
         if (var1.bg) {
            var1.ao = 0;
            var1.as = false;
         }

         am.ag(var1, (long)var0);
         return var1;
      }
   }

   public int bk(int var1, int var2) {
      return bh.ae(this.ch, var1, var2, 672385064);
   }

   public static id av(int var0) {
      id var1 = (id)am.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ae.bt(6, var0, (byte)-13);
         var1 = new id();
         var1.au = var0 * -347760831;
         if (null != var2) {
            var1.am(new vf(var2), -1048920030);
         }

         var1.ag(-1323891874);
         if (var1.bg) {
            var1.ao = 0;
            var1.as = false;
         }

         am.ag(var1, (long)var0);
         return var1;
      }
   }

   public static void az(po var0, po var1, boolean var2) {
      ae = var0;
      aa.ag = var1;
      ac = var2;
   }

   void ak(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.ax(var1, var2, (byte)43);
      }
   }

   void bn(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.ax(var1, var2, (byte)34);
      }
   }

   void bh(vf var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cv(952452697);
         if (var3 > 0) {
            if (null != this.ar && !ac) {
               var1.au += var3 * -1298407601;
            } else {
               this.al = new int[var3];
               this.ar = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.ar[var4] = var1.ct(-1325385598);
                  this.al[var4] = var1.cv(952452697);
               }
            }
         }
      } else if (2 == var2) {
         this.ad = var1.cs(1967976909);
      } else if (5 == var2) {
         var3 = var1.cv(952452697);
         if (var3 > 0) {
            if (this.ar != null && !ac) {
               var1.au += var3 * 566050698;
            } else {
               this.al = null;
               this.ar = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.ar[var4] = var1.ct(-1834502691);
               }
            }
         }
      } else if (14 == var2) {
         this.aa = var1.cv(952452697) * -1725654441;
      } else if (var2 == 15) {
         this.ai = var1.cv(952452697) * -1561781357;
      } else if (var2 == 17) {
         this.ao = 0;
         this.as = false;
      } else if (18 == var2) {
         this.as = false;
      } else if (19 == var2) {
         this.ay = var1.cv(952452697) * -1478723828;
      } else if (var2 == 21) {
         this.aj = 0;
      } else if (var2 == 22) {
         this.av = true;
      } else if (23 == var2) {
         this.aw = true;
      } else if (var2 == 24) {
         this.an = var1.ct(-1569348581) * -570231007;
         if (-476952463 == this.an * 1240052894) {
            this.an = -54571913;
         }
      } else if (27 == var2) {
         this.ao = 2105961647;
      } else if (var2 == 28) {
         this.ak = var1.cv(952452697) * -1067101251;
      } else if (29 == var2) {
         this.bn = var1.cg((short)-6117) * 462637931;
      } else if (var2 == 39) {
         this.bh = var1.cg((short)-4657) * -12239489;
      } else if (var2 >= 30 && var2 < 35) {
         this.bd[var2 - 30] = var1.cs(1556286182);
         if (this.bd[var2 - 30].equalsIgnoreCase(ok.aq)) {
            this.bd[var2 - 30] = null;
         }
      } else if (var2 == -1208800617) {
         var3 = var1.cv(952452697);
         this.ah = new short[var3];
         this.ap = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ah[var4] = (short)var1.ct(-1594012320);
            this.ap[var4] = (short)var1.ct(-1734019445);
         }
      } else if (41 == var2) {
         var3 = var1.cv(952452697);
         this.ab = new short[var3];
         this.az = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] = (short)var1.ct(-1745902215);
            this.az[var4] = (short)var1.ct(-1965047581);
         }
      } else if (var2 == 61) {
         var1.ct(-1774429267);
      } else if (var2 == -1515265148) {
         this.bm = true;
      } else if (1559331413 == var2) {
         this.bs = false;
      } else if (var2 == 65) {
         this.bw = var1.ct(-1827144183) * 405464899;
      } else if (var2 == -334182813) {
         this.ba = var1.ct(-1816504983) * -1861210727;
      } else if (67 == var2) {
         this.bj = var1.ct(-1650751141) * -1709570929;
      } else if (68 == var2) {
         this.bf = var1.ct(-1982225204) * 1233629063;
      } else if (309778281 == var2) {
         var1.cv(952452697);
      } else if (var2 == 70) {
         this.bp = var1.cq(-1248445717) * -1759710193;
      } else if (var2 == 71) {
         this.by = var1.cq(1583116100) * 93950979;
      } else if (var2 == 72) {
         this.bb = var1.cq(-952276034) * 822533157;
      } else if (var2 == -1353996440) {
         this.bi = true;
      } else if (var2 == 118345504) {
         this.bg = true;
      } else if (var2 == -1363795587) {
         this.bl = var1.cv(952452697) * 266650742;
      } else if (159128805 != var2 && 262665197 != var2) {
         if (var2 == 78) {
            this.bo = var1.ct(-2115777710) * 35301021;
            this.bv = var1.cv(952452697) * 1844677151;
            this.bt = var1.cv(952452697) * -144999925;
         } else if (79 == var2) {
            this.bq = var1.ct(-1463833185) * 153814287;
            this.bk = var1.ct(-1665920791) * 1149131421;
            this.bv = var1.cv(952452697) * 1844677151;
            this.bt = var1.cv(952452697) * -144999925;
            var3 = var1.cv(952452697);
            this.be = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.be[var4] = var1.ct(-1355577964);
            }
         } else if (81 == var2) {
            var1.cv(952452697);
         } else if (var2 == -1196138857) {
            this.bx = var1.ct(-1617520549) * 1337384593;
         } else if (435060692 == var2) {
            this.bc = false;
         } else if (90 == var2) {
            this.cn = true;
         } else if (249 == var2) {
            this.ch = gu.ac(var1, this.ch, 2131315840);
         }
      } else {
         this.bu = var1.ct(-1407314175) * -1306226487;
         if (this.bu * 459049337 == -474039372) {
            this.bu = 1306226487;
         }

         this.br = var1.ct(-1548948271) * -93175347;
         if (65535 == 1113616981 * this.br) {
            this.br = 1884192939;
         }

         var3 = -1;
         if (987665542 == var2) {
            var3 = var1.ct(-1750245685);
            if (var3 == -1080295722) {
               var3 = -1;
            }
         }

         var4 = var1.cv(952452697);
         this.bz = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.bz[var5] = var1.ct(-1365372556);
            if (65535 == this.bz[var5]) {
               this.bz[var5] = -1;
            }
         }

         this.bz[1 + var4] = var3;
      }

   }

   void bd(vf var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cv(952452697);
         if (var3 > 0) {
            if (null != this.ar && !ac) {
               var1.au += var3 * -1298407601;
            } else {
               this.al = new int[var3];
               this.ar = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.ar[var4] = var1.ct(-1818034368);
                  this.al[var4] = var1.cv(952452697);
               }
            }
         }
      } else if (2 == var2) {
         this.ad = var1.cs(-304096814);
      } else if (5 == var2) {
         var3 = var1.cv(952452697);
         if (var3 > 0) {
            if (this.ar != null && !ac) {
               var1.au += var3 * 566050698;
            } else {
               this.al = null;
               this.ar = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.ar[var4] = var1.ct(-1739679377);
               }
            }
         }
      } else if (14 == var2) {
         this.aa = var1.cv(952452697) * -57511599;
      } else if (var2 == 15) {
         this.ai = var1.cv(952452697) * -513426827;
      } else if (var2 == 17) {
         this.ao = 0;
         this.as = false;
      } else if (18 == var2) {
         this.as = false;
      } else if (19 == var2) {
         this.ay = var1.cv(952452697) * 1847059043;
      } else if (var2 == 21) {
         this.aj = 0;
      } else if (var2 == 22) {
         this.av = true;
      } else if (23 == var2) {
         this.aw = true;
      } else if (var2 == 24) {
         this.an = var1.ct(-1398677561) * -492994953;
         if (-975573371 == this.an * -695687458) {
            this.an = 1860273323;
         }
      } else if (27 == var2) {
         this.ao = -321005665;
      } else if (var2 == 28) {
         this.ak = var1.cv(952452697) * 1682647477;
      } else if (29 == var2) {
         this.bn = var1.cg((short)-2167) * 1081248483;
      } else if (var2 == -865161425) {
         this.bh = var1.cg((short)9237) * 106282124;
      } else if (var2 >= 30 && var2 < -787665870) {
         this.bd[var2 - 30] = var1.cs(-1889976924);
         if (this.bd[var2 - 30].equalsIgnoreCase(ok.aq)) {
            this.bd[var2 - 30] = null;
         }
      } else if (var2 == 1523229713) {
         var3 = var1.cv(952452697);
         this.ah = new short[var3];
         this.ap = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ah[var4] = (short)var1.ct(-1648810892);
            this.ap[var4] = (short)var1.ct(-1364872486);
         }
      } else if (41 == var2) {
         var3 = var1.cv(952452697);
         this.ab = new short[var3];
         this.az = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] = (short)var1.ct(-2081713617);
            this.az[var4] = (short)var1.ct(-1705224167);
         }
      } else if (var2 == 1236771583) {
         var1.ct(-1566024156);
      } else if (var2 == -132685867) {
         this.bm = true;
      } else if (-282690889 == var2) {
         this.bs = false;
      } else if (var2 == 618534281) {
         this.bw = var1.ct(-1612059729) * -1725257878;
      } else if (var2 == 66) {
         this.ba = var1.ct(-1743515811) * -1861210727;
      } else if (67 == var2) {
         this.bj = var1.ct(-1874561338) * -594502934;
      } else if (1326193496 == var2) {
         this.bf = var1.ct(-1416856968) * -1071586629;
      } else if (742580583 == var2) {
         var1.cv(952452697);
      } else if (var2 == -1676845370) {
         this.bp = var1.cq(459847141) * -1759710193;
      } else if (var2 == 71) {
         this.by = var1.cq(-243109457) * 1077893618;
      } else if (var2 == 1635824129) {
         this.bb = var1.cq(389212706) * 1745044797;
      } else if (var2 == -1977277060) {
         this.bi = true;
      } else if (var2 == 1466753205) {
         this.bg = true;
      } else if (var2 == 75) {
         this.bl = var1.cv(952452697) * -1398610118;
      } else if (-1607208334 != var2 && 83391559 != var2) {
         if (var2 == -1532769948) {
            this.bo = var1.ct(-2143285528) * 35301021;
            this.bv = var1.cv(952452697) * -1406871102;
            this.bt = var1.cv(952452697) * -144999925;
         } else if (79 == var2) {
            this.bq = var1.ct(-1608296056) * -183523323;
            this.bk = var1.ct(-1585751753) * 1149131421;
            this.bv = var1.cv(952452697) * 1844677151;
            this.bt = var1.cv(952452697) * 1085084040;
            var3 = var1.cv(952452697);
            this.be = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.be[var4] = var1.ct(-1470292320);
            }
         } else if (81 == var2) {
            var1.cv(952452697);
         } else if (var2 == 1387324870) {
            this.bx = var1.ct(-1487005807) * 451560581;
         } else if (89 == var2) {
            this.bc = false;
         } else if (-482828219 == var2) {
            this.cn = true;
         } else if (1138288028 == var2) {
            this.ch = gu.ac(var1, this.ch, 2131989760);
         }
      } else {
         this.bu = var1.ct(-1819298819) * -2057629319;
         if (this.bu * 571545242 == 65535) {
            this.bu = -1527151222;
         }

         this.br = var1.ct(-1492931899) * 1403105949;
         if (-150423487 == -1123873027 * this.br) {
            this.br = -732052068;
         }

         var3 = -1;
         if (553899306 == var2) {
            var3 = var1.ct(-1948055174);
            if (var3 == 1443614355) {
               var3 = -1;
            }
         }

         var4 = var1.cv(952452697);
         this.bz = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.bz[var5] = var1.ct(-1562060767);
            if (1441613057 == this.bz[var5]) {
               this.bz[var5] = -1;
            }
         }

         this.bz[1 + var4] = var3;
      }

   }

   void bx(vf var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cv(952452697);
         if (var3 > 0) {
            if (null != this.ar && !ac) {
               var1.au += var3 * -1298407601;
            } else {
               this.al = new int[var3];
               this.ar = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.ar[var4] = var1.ct(-1534519298);
                  this.al[var4] = var1.cv(952452697);
               }
            }
         }
      } else if (2 == var2) {
         this.ad = var1.cs(23144493);
      } else if (5 == var2) {
         var3 = var1.cv(952452697);
         if (var3 > 0) {
            if (this.ar != null && !ac) {
               var1.au += var3 * 566050698;
            } else {
               this.al = null;
               this.ar = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.ar[var4] = var1.ct(-1786657530);
               }
            }
         }
      } else if (14 == var2) {
         this.aa = var1.cv(952452697) * -1725654441;
      } else if (var2 == 15) {
         this.ai = var1.cv(952452697) * -1561781357;
      } else if (var2 == 17) {
         this.ao = 0;
         this.as = false;
      } else if (18 == var2) {
         this.as = false;
      } else if (19 == var2) {
         this.ay = var1.cv(952452697) * 1724120421;
      } else if (var2 == 21) {
         this.aj = 0;
      } else if (var2 == 22) {
         this.av = true;
      } else if (23 == var2) {
         this.aw = true;
      } else if (var2 == 24) {
         this.an = var1.ct(-2075268371) * -1860273323;
         if (65535 == this.an * 1369549309) {
            this.an = 1860273323;
         }
      } else if (27 == var2) {
         this.ao = -321005665;
      } else if (var2 == 28) {
         this.ak = var1.cv(952452697) * -1067101251;
      } else if (29 == var2) {
         this.bn = var1.cg((short)-7473) * 462637931;
      } else if (var2 == 39) {
         this.bh = var1.cg((short)24798) * -12239489;
      } else if (var2 >= 30 && var2 < 35) {
         this.bd[var2 - 30] = var1.cs(1751558763);
         if (this.bd[var2 - 30].equalsIgnoreCase(ok.aq)) {
            this.bd[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.cv(952452697);
         this.ah = new short[var3];
         this.ap = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ah[var4] = (short)var1.ct(-1460024698);
            this.ap[var4] = (short)var1.ct(-1955142555);
         }
      } else if (41 == var2) {
         var3 = var1.cv(952452697);
         this.ab = new short[var3];
         this.az = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] = (short)var1.ct(-2036907257);
            this.az[var4] = (short)var1.ct(-1532547506);
         }
      } else if (var2 == 61) {
         var1.ct(-2142415735);
      } else if (var2 == 62) {
         this.bm = true;
      } else if (64 == var2) {
         this.bs = false;
      } else if (var2 == 65) {
         this.bw = var1.ct(-1755399998) * 405464899;
      } else if (var2 == 66) {
         this.ba = var1.ct(-2123397612) * -1861210727;
      } else if (67 == var2) {
         this.bj = var1.ct(-1456355451) * 1960253313;
      } else if (68 == var2) {
         this.bf = var1.ct(-2010829943) * -1071586629;
      } else if (69 == var2) {
         var1.cv(952452697);
      } else if (var2 == 70) {
         this.bp = var1.cq(-1773256315) * -1759710193;
      } else if (var2 == 71) {
         this.by = var1.cq(-1455626883) * 1394297355;
      } else if (var2 == 72) {
         this.bb = var1.cq(-1546914079) * 822533157;
      } else if (var2 == 73) {
         this.bi = true;
      } else if (var2 == 74) {
         this.bg = true;
      } else if (var2 == 75) {
         this.bl = var1.cv(952452697) * -950105393;
      } else if (77 != var2 && 92 != var2) {
         if (var2 == 78) {
            this.bo = var1.ct(-2079318427) * 35301021;
            this.bv = var1.cv(952452697) * 1844677151;
            this.bt = var1.cv(952452697) * -144999925;
         } else if (79 == var2) {
            this.bq = var1.ct(-1363832006) * -183523323;
            this.bk = var1.ct(-1389890820) * 1149131421;
            this.bv = var1.cv(952452697) * 1844677151;
            this.bt = var1.cv(952452697) * -144999925;
            var3 = var1.cv(952452697);
            this.be = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.be[var4] = var1.ct(-1524334694);
            }
         } else if (81 == var2) {
            var1.cv(952452697);
         } else if (var2 == 82) {
            this.bx = var1.ct(-1693718591) * 1337384593;
         } else if (89 == var2) {
            this.bc = false;
         } else if (90 == var2) {
            this.cn = true;
         } else if (249 == var2) {
            this.ch = gu.ac(var1, this.ch, 2147028458);
         }
      } else {
         this.bu = var1.ct(-1538979265) * -1306226487;
         if (this.bu * 459049337 == 65535) {
            this.bu = 1306226487;
         }

         this.br = var1.ct(-1489043593) * 1403105949;
         if (65535 == -924687435 * this.br) {
            this.br = -1403105949;
         }

         var3 = -1;
         if (92 == var2) {
            var3 = var1.ct(-1830016151);
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.cv(952452697);
         this.bz = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.bz[var5] = var1.ct(-2109880349);
            if (65535 == this.bz[var5]) {
               this.bz[var5] = -1;
            }
         }

         this.bz[1 + var4] = var3;
      }

   }

   id() {
      try {
         super();
         this.ad = ok.al;
         this.aa = -1725654441;
         this.ai = -1561781357;
         this.ao = -642011330;
         this.as = true;
         this.ay = -1724120421;
         this.aj = -1481875963;
         this.av = false;
         this.aw = false;
         this.an = 1860273323;
         this.ak = 106249168;
         this.bn = 0;
         this.bh = 0;
         this.bd = new String[5];
         this.bx = -1337384593;
         this.bf = 1071586629;
         this.bm = false;
         this.bs = true;
         this.bw = 359899520;
         this.ba = -2011771776;
         this.bj = 1804320896;
         this.bp = 0;
         this.by = 0;
         this.bb = 0;
         this.bi = false;
         this.bg = false;
         this.bl = 950105393;
         this.bu = 1306226487;
         this.br = -1403105949;
         this.bo = -35301021;
         this.bv = 0;
         this.bt = 0;
         this.bq = 0;
         this.bk = 0;
         this.bc = true;
         this.cn = false;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "id.<init>(" + ')');
      }
   }

   void bm(vf var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cv(952452697);
         if (var3 > 0) {
            if (null != this.ar && !ac) {
               var1.au += var3 * -1298407601;
            } else {
               this.al = new int[var3];
               this.ar = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.ar[var4] = var1.ct(-2045808868);
                  this.al[var4] = var1.cv(952452697);
               }
            }
         }
      } else if (2 == var2) {
         this.ad = var1.cs(2012515332);
      } else if (5 == var2) {
         var3 = var1.cv(952452697);
         if (var3 > 0) {
            if (this.ar != null && !ac) {
               var1.au += var3 * 566050698;
            } else {
               this.al = null;
               this.ar = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.ar[var4] = var1.ct(-1826589338);
               }
            }
         }
      } else if (14 == var2) {
         this.aa = var1.cv(952452697) * -1725654441;
      } else if (var2 == 15) {
         this.ai = var1.cv(952452697) * -1561781357;
      } else if (var2 == 17) {
         this.ao = 0;
         this.as = false;
      } else if (18 == var2) {
         this.as = false;
      } else if (19 == var2) {
         this.ay = var1.cv(952452697) * 1724120421;
      } else if (var2 == 21) {
         this.aj = 0;
      } else if (var2 == 22) {
         this.av = true;
      } else if (23 == var2) {
         this.aw = true;
      } else if (var2 == 24) {
         this.an = var1.ct(-1967043517) * -1860273323;
         if (65535 == this.an * 1369549309) {
            this.an = 1860273323;
         }
      } else if (27 == var2) {
         this.ao = -321005665;
      } else if (var2 == 28) {
         this.ak = var1.cv(952452697) * -1067101251;
      } else if (29 == var2) {
         this.bn = var1.cg((short)-10895) * 462637931;
      } else if (var2 == 39) {
         this.bh = var1.cg((short)7625) * -12239489;
      } else if (var2 >= 30 && var2 < 35) {
         this.bd[var2 - 30] = var1.cs(-1793974024);
         if (this.bd[var2 - 30].equalsIgnoreCase(ok.aq)) {
            this.bd[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.cv(952452697);
         this.ah = new short[var3];
         this.ap = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ah[var4] = (short)var1.ct(-1858885498);
            this.ap[var4] = (short)var1.ct(-1605703868);
         }
      } else if (41 == var2) {
         var3 = var1.cv(952452697);
         this.ab = new short[var3];
         this.az = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] = (short)var1.ct(-1959949251);
            this.az[var4] = (short)var1.ct(-1939096023);
         }
      } else if (var2 == 61) {
         var1.ct(-2062663139);
      } else if (var2 == 62) {
         this.bm = true;
      } else if (64 == var2) {
         this.bs = false;
      } else if (var2 == 65) {
         this.bw = var1.ct(-1835508707) * 405464899;
      } else if (var2 == 66) {
         this.ba = var1.ct(-1749174174) * -1861210727;
      } else if (67 == var2) {
         this.bj = var1.ct(-1450122885) * 1960253313;
      } else if (68 == var2) {
         this.bf = var1.ct(-1717536294) * -1071586629;
      } else if (69 == var2) {
         var1.cv(952452697);
      } else if (var2 == 70) {
         this.bp = var1.cq(2058050966) * -1759710193;
      } else if (var2 == 71) {
         this.by = var1.cq(1453463679) * 1394297355;
      } else if (var2 == 72) {
         this.bb = var1.cq(-1155502168) * 822533157;
      } else if (var2 == 73) {
         this.bi = true;
      } else if (var2 == 74) {
         this.bg = true;
      } else if (var2 == 75) {
         this.bl = var1.cv(952452697) * -950105393;
      } else if (77 != var2 && 92 != var2) {
         if (var2 == 78) {
            this.bo = var1.ct(-1668213714) * 35301021;
            this.bv = var1.cv(952452697) * 1844677151;
            this.bt = var1.cv(952452697) * -144999925;
         } else if (79 == var2) {
            this.bq = var1.ct(-1449291795) * -183523323;
            this.bk = var1.ct(-1751867485) * 1149131421;
            this.bv = var1.cv(952452697) * 1844677151;
            this.bt = var1.cv(952452697) * -144999925;
            var3 = var1.cv(952452697);
            this.be = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.be[var4] = var1.ct(-1496561095);
            }
         } else if (81 == var2) {
            var1.cv(952452697);
         } else if (var2 == 82) {
            this.bx = var1.ct(-1373134592) * 1337384593;
         } else if (89 == var2) {
            this.bc = false;
         } else if (90 == var2) {
            this.cn = true;
         } else if (249 == var2) {
            this.ch = gu.ac(var1, this.ch, 2115346059);
         }
      } else {
         this.bu = var1.ct(-1975990993) * -1306226487;
         if (this.bu * 459049337 == 65535) {
            this.bu = 1306226487;
         }

         this.br = var1.ct(-1662993384) * 1403105949;
         if (65535 == -924687435 * this.br) {
            this.br = -1403105949;
         }

         var3 = -1;
         if (92 == var2) {
            var3 = var1.ct(-1376170232);
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.cv(952452697);
         this.bz = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.bz[var5] = var1.ct(-1375322656);
            if (65535 == this.bz[var5]) {
               this.bz[var5] = -1;
            }
         }

         this.bz[1 + var4] = var3;
      }

   }

   public final boolean bs(int var1) {
      if (null != this.al) {
         for(int var4 = 0; var4 < this.al.length; ++var4) {
            if (var1 == this.al[var4]) {
               return aa.ag.bk(this.ar[var4] & '\uffff', 0, (byte)124);
            }
         }

         return true;
      } else if (this.ar == null) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.ar.length; ++var3) {
            var2 &= aa.ag.bk(this.ar[var3] & '\uffff', 0, (byte)107);
         }

         return var2;
      }
   }

   public final boolean bw() {
      if (null == this.ar) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.ar.length; ++var2) {
            var1 &= aa.ag.bk(this.ar[var2] & '\uffff', 0, (byte)55);
         }

         return var1;
      }
   }

   public final boolean ba() {
      if (null == this.ar) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.ar.length; ++var2) {
            var1 &= aa.ag.bk(this.ar[var2] & '\uffff', 0, (byte)39);
         }

         return var1;
      }
   }

   public final boolean bj() {
      if (null == this.ar) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.ar.length; ++var2) {
            var1 &= aa.ag.bk(this.ar[var2] & '\uffff', 0, (byte)110);
         }

         return var1;
      }
   }

   void aw() {
      if (this.ay * -1478169491 == -1) {
         this.ay = 0;
         if (null != this.ar && (this.al == null || 10 == this.al[0])) {
            this.ay = 1724120421;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if (this.bd[var1] != null) {
               this.ay = 1724120421;
            }
         }
      }

      if (-1 == this.bl * 391195762) {
         this.bl = -929444452 * (0 != 891389023 * this.ao ? 1 : 0);
      }

   }

   public static void ao(int var0) {
      try {
         is.al.am();
         is.ad.am();
         is.ah.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "id.ao(" + ')');
      }
   }

   public final ju bb(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.al) {
         var7 = (long)((-1484588863 * this.au << 10) + var2);
      } else {
         var7 = (long)(var2 + (var1 << 3) + (-1484588863 * this.au << 10));
      }

      Object var9 = (ju)aq.ac(var7);
      if (null == var9) {
         jv var10 = this.al(var1, var2, 948398154);
         if (var10 == null) {
            return null;
         }

         if (!this.av) {
            var9 = var10.bn(this.bn * 1946519875 + 64, 768 + -662651289 * this.bh, -50, -10, -50);
         } else {
            var10.bs = (short)(1946519875 * this.bn + 64);
            var10.bw = (short)(768 + this.bh * -662651289);
            var10.av();
            var9 = var10;
         }

         aq.ag((tr)var9, var7);
      }

      if (this.av) {
         var9 = ((jv)var9).af();
      }

      if (this.aj * 1371685171 >= 0) {
         if (var9 instanceof jm) {
            var9 = ((jm)var9).am(var3, var4, var5, var6, true, 1371685171 * this.aj);
         } else if (var9 instanceof jv) {
            var9 = ((jv)var9).at(var3, var4, var5, var6, true, this.aj * 1371685171);
         }
      }

      return (ju)var9;
   }

   public final ju bp(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.al) {
         var7 = (long)((-1484588863 * this.au << 10) + var2);
      } else {
         var7 = (long)(var2 + (var1 << 3) + (-1484588863 * this.au << 10));
      }

      Object var9 = (ju)aq.ac(var7);
      if (null == var9) {
         jv var10 = this.al(var1, var2, 1883508811);
         if (var10 == null) {
            return null;
         }

         if (!this.av) {
            var9 = var10.bn(this.bn * 1946519875 + 64, 768 + -662651289 * this.bh, -50, -10, -50);
         } else {
            var10.bs = (short)(1946519875 * this.bn + 64);
            var10.bw = (short)(768 + this.bh * -662651289);
            var10.av();
            var9 = var10;
         }

         aq.ag((tr)var9, var7);
      }

      if (this.av) {
         var9 = ((jv)var9).af();
      }

      if (this.aj * 1371685171 >= 0) {
         if (var9 instanceof jm) {
            var9 = ((jm)var9).am(var3, var4, var5, var6, true, 1371685171 * this.aj);
         } else if (var9 instanceof jv) {
            var9 = ((jv)var9).at(var3, var4, var5, var6, true, this.aj * 1371685171);
         }
      }

      return (ju)var9;
   }

   public static void ao(po var0, po var1, boolean var2) {
      ae = var0;
      aa.ag = var1;
      ac = var2;
   }

   public final jm bl(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.al) {
         var7 = (long)(var2 + (this.au * -1484588863 << 10));
      } else {
         var7 = (long)((this.au * -197183057 << 10) + (var1 << 3) + var2);
      }

      jm var9 = (jm)af.ac(var7);
      if (var9 == null) {
         jv var10 = this.al(var1, var2, 139823570);
         if (var10 == null) {
            return null;
         }

         var9 = var10.bn(329736595 + 1946519875 * this.bn, 768 + -662651289 * this.bh, 1212098543, 2080422071, -50);
         af.ag(var9, var7);
      }

      if (1371685171 * this.aj >= 0) {
         var9 = var9.am(var3, var4, var5, var6, true, 1371685171 * this.aj);
      }

      return var9;
   }

   public final jm bz(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.al) {
         var7 = (long)(var2 + (this.au * -1484588863 << 10));
      } else {
         var7 = (long)((this.au * -1484588863 << 10) + (var1 << 3) + var2);
      }

      jm var9 = (jm)af.ac(var7);
      if (var9 == null) {
         jv var10 = this.al(var1, var2, -1252612392);
         if (var10 == null) {
            return null;
         }

         var9 = var10.bn(64 + 1946519875 * this.bn, 768 + -662651289 * this.bh, -50, -10, -50);
         af.ag(var9, var7);
      }

      if (1371685171 * this.aj >= 0) {
         var9 = var9.am(var3, var4, var5, var6, true, 1371685171 * this.aj);
      }

      return var9;
   }

   void bf(vf var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cv(952452697);
         if (var3 > 0) {
            if (null != this.ar && !ac) {
               var1.au += var3 * -1298407601;
            } else {
               this.al = new int[var3];
               this.ar = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.ar[var4] = var1.ct(-2020851599);
                  this.al[var4] = var1.cv(952452697);
               }
            }
         }
      } else if (2 == var2) {
         this.ad = var1.cs(82867120);
      } else if (5 == var2) {
         var3 = var1.cv(952452697);
         if (var3 > 0) {
            if (this.ar != null && !ac) {
               var1.au += var3 * 566050698;
            } else {
               this.al = null;
               this.ar = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.ar[var4] = var1.ct(-1891227377);
               }
            }
         }
      } else if (14 == var2) {
         this.aa = var1.cv(952452697) * -1725654441;
      } else if (var2 == 15) {
         this.ai = var1.cv(952452697) * -1561781357;
      } else if (var2 == 17) {
         this.ao = 0;
         this.as = false;
      } else if (18 == var2) {
         this.as = false;
      } else if (19 == var2) {
         this.ay = var1.cv(952452697) * 886774732;
      } else if (var2 == 21) {
         this.aj = 0;
      } else if (var2 == 22) {
         this.av = true;
      } else if (23 == var2) {
         this.aw = true;
      } else if (var2 == 24) {
         this.an = var1.ct(-1427716589) * 814071156;
         if (65535 == this.an * 1369549309) {
            this.an = -1169377706;
         }
      } else if (27 == var2) {
         this.ao = -321005665;
      } else if (var2 == 28) {
         this.ak = var1.cv(952452697) * 85508262;
      } else if (29 == var2) {
         this.bn = var1.cg((short)-2331) * 569660590;
      } else if (var2 == 526446046) {
         this.bh = var1.cg((short)10066) * -862693978;
      } else if (var2 >= 30 && var2 < 35) {
         this.bd[var2 - 30] = var1.cs(2095211676);
         if (this.bd[var2 - 30].equalsIgnoreCase(ok.aq)) {
            this.bd[var2 - 30] = null;
         }
      } else if (var2 == 900959674) {
         var3 = var1.cv(952452697);
         this.ah = new short[var3];
         this.ap = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ah[var4] = (short)var1.ct(-2043974103);
            this.ap[var4] = (short)var1.ct(-1680541631);
         }
      } else if (41 == var2) {
         var3 = var1.cv(952452697);
         this.ab = new short[var3];
         this.az = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] = (short)var1.ct(-1539351287);
            this.az[var4] = (short)var1.ct(-1356103460);
         }
      } else if (var2 == -1936040738) {
         var1.ct(-1554690964);
      } else if (var2 == 62) {
         this.bm = true;
      } else if (64 == var2) {
         this.bs = false;
      } else if (var2 == 65) {
         this.bw = var1.ct(-1649556264) * 405464899;
      } else if (var2 == -195356644) {
         this.ba = var1.ct(-1501911633) * -1532775020;
      } else if (67 == var2) {
         this.bj = var1.ct(-1731678542) * 639899370;
      } else if (471078111 == var2) {
         this.bf = var1.ct(-1575838594) * 831602317;
      } else if (69 == var2) {
         var1.cv(952452697);
      } else if (var2 == -1755126249) {
         this.bp = var1.cq(-1636928795) * -1759710193;
      } else if (var2 == -712086414) {
         this.by = var1.cq(-1791349757) * 1394297355;
      } else if (var2 == 1801219186) {
         this.bb = var1.cq(1560523017) * 822533157;
      } else if (var2 == 73) {
         this.bi = true;
      } else if (var2 == 74) {
         this.bg = true;
      } else if (var2 == -882069038) {
         this.bl = var1.cv(952452697) * -950105393;
      } else if (-820769342 != var2 && 92 != var2) {
         if (var2 == -2040698926) {
            this.bo = var1.ct(-1459829451) * 35301021;
            this.bv = var1.cv(952452697) * -551380337;
            this.bt = var1.cv(952452697) * -144999925;
         } else if (79 == var2) {
            this.bq = var1.ct(-1983701712) * -729223781;
            this.bk = var1.ct(-1905334228) * 1149131421;
            this.bv = var1.cv(952452697) * 1844677151;
            this.bt = var1.cv(952452697) * -144999925;
            var3 = var1.cv(952452697);
            this.be = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.be[var4] = var1.ct(-2039152756);
            }
         } else if (-1192334054 == var2) {
            var1.cv(952452697);
         } else if (var2 == 82) {
            this.bx = var1.ct(-2017592179) * 1375580952;
         } else if (89 == var2) {
            this.bc = false;
         } else if (90 == var2) {
            this.cn = true;
         } else if (249 == var2) {
            this.ch = gu.ac(var1, this.ch, 2082472026);
         }
      } else {
         this.bu = var1.ct(-1742320093) * -1306226487;
         if (this.bu * -860608591 == 1121246095) {
            this.bu = 1306226487;
         }

         this.br = var1.ct(-1995635589) * 1403105949;
         if (65535 == -924687435 * this.br) {
            this.br = 1794578691;
         }

         var3 = -1;
         if (-1031113134 == var2) {
            var3 = var1.ct(-1491358775);
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.cv(952452697);
         this.bz = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.bz[var5] = var1.ct(-1579899154);
            if (65535 == this.bz[var5]) {
               this.bz[var5] = -1;
            }
         }

         this.bz[1 + var4] = var3;
      }

   }

   public final jm bu(int var1, int var2, int[][] var3, int var4, int var5, int var6, if var7, int var8) {
      long var9;
      if (this.al == null) {
         var9 = (long)(var2 + (this.au * -1484588863 << 10));
      } else {
         var9 = (long)(var2 + (-1484588863 * this.au << 10) + (var1 << 3));
      }

      jm var11 = (jm)af.ac(var9);
      if (var11 == null) {
         jv var12 = this.al(var1, var2, 151903801);
         if (var12 == null) {
            return null;
         }

         var11 = var12.bn(64 + 1946519875 * this.bn, 768 + -662651289 * this.bh, -50, -10, -50);
         af.ag(var11, var9);
      }

      if (var7 == null && -1 == 1371685171 * this.aj) {
         return var11;
      } else {
         if (var7 != null) {
            var11 = var7.af(var11, var8, var2, -1924285761);
         } else {
            var11 = var11.ax(true);
         }

         if (this.aj * 1371685171 >= 0) {
            var11 = var11.am(var3, var4, var5, var6, false, 1371685171 * this.aj);
         }

         return var11;
      }
   }

   final jv bo(int var1, int var2) {
      jv var3 = null;
      boolean var4;
      int var5;
      int var7;
      if (null == this.al) {
         if (10 != var1) {
            return null;
         }

         if (null == this.ar) {
            return null;
         }

         var4 = this.bm;
         if (var1 == 2 && var2 > 3) {
            var4 = !var4;
         }

         var5 = this.ar.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            var7 = this.ar[var6];
            if (var4) {
               var7 += 65536;
            }

            var3 = (jv)ax.ac((long)var7);
            if (var3 == null) {
               var3 = jv.ac(aa.ag, var7 & '\uffff', 0);
               if (null == var3) {
                  return null;
               }

               if (var4) {
                  var3.ay();
               }

               ax.ag(var3, (long)var7);
            }

            if (var5 > 1) {
               at[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new jv(at, var5);
         }
      } else {
         int var8 = -1;

         for(var5 = 0; var5 < this.al.length; ++var5) {
            if (var1 == this.al[var5]) {
               var8 = var5;
               break;
            }
         }

         if (var8 == -1) {
            return null;
         }

         var5 = this.ar[var8];
         boolean var9 = this.bm ^ var2 > 3;
         if (var9) {
            var5 += -297007934;
         }

         var3 = (jv)ax.ac((long)var5);
         if (null == var3) {
            var3 = jv.ac(aa.ag, var5 & '\uffff', 0);
            if (null == var3) {
               return null;
            }

            if (var9) {
               var3.ay();
            }

            ax.ag(var3, (long)var5);
         }
      }

      if (-325936398 == this.bw * -1948623509 && this.ba * -1068181847 == 128 && 644543415 * this.bj == 1257415903) {
         var4 = false;
      } else {
         var4 = true;
      }

      boolean var10;
      if (0 == 1258082991 * this.bp && 0 == 2028270741 * this.by && this.bb * -765721269 == 0) {
         var10 = false;
      } else {
         var10 = true;
      }

      jv var11 = new jv(var3, var2 == 0 && !var4 && !var10, this.ah == null, this.ab == null, true);
      if (var1 == 4 && var2 > 3) {
         var11.aa(-8605722);
         var11.ai(-411754423, 0, -45);
      }

      var2 &= 3;
      if (1 == var2) {
         var11.ar();
      } else if (2 == var2) {
         var11.al();
      } else if (var2 == 3) {
         var11.az();
      }

      if (this.ah != null) {
         for(var7 = 0; var7 < this.ah.length; ++var7) {
            var11.ao(this.ah[var7], this.ap[var7]);
         }
      }

      if (null != this.ab) {
         for(var7 = 0; var7 < this.ab.length; ++var7) {
            var11.as(this.ab[var7], this.az[var7]);
         }
      }

      if (var4) {
         var11.aj(899132543 * this.bw, 742262036 * this.ba, -76505768 * this.bj);
      }

      if (var10) {
         var11.ai(this.bp * 415726319, 1867116420 * this.by, this.bb * 505942103);
      }

      return var11;
   }

   public final jm ar(int var1, int var2, int[][] var3, int var4, int var5, int var6, if var7, int var8, byte var9) {
      try {
         long var10;
         if (this.al == null) {
            if (var9 >= 2) {
               throw new IllegalStateException();
            }

            var10 = (long)(var2 + (this.au * -1484588863 << 10));
         } else {
            var10 = (long)(var2 + (-1484588863 * this.au << 10) + (var1 << 3));
         }

         jm var12 = (jm)af.ac(var10);
         if (var12 == null) {
            if (var9 >= 2) {
               throw new IllegalStateException();
            }

            jv var13 = this.al(var1, var2, -881379781);
            if (var13 == null) {
               if (var9 >= 2) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var12 = var13.bn(64 + 1946519875 * this.bn, 768 + -662651289 * this.bh, -50, -10, -50);
            af.ag(var12, var10);
         }

         if (var7 == null) {
            if (var9 >= 2) {
               throw new IllegalStateException();
            }

            if (-1 == 1371685171 * this.aj) {
               if (var9 >= 2) {
                  throw new IllegalStateException();
               }

               return var12;
            }
         }

         if (var7 != null) {
            if (var9 >= 2) {
               throw new IllegalStateException();
            }

            var12 = var7.af(var12, var8, var2, -1511335826);
         } else {
            var12 = var12.ax(true);
         }

         if (this.aj * 1371685171 >= 0) {
            if (var9 >= 2) {
               throw new IllegalStateException();
            }

            var12 = var12.am(var3, var4, var5, var6, false, 1371685171 * this.aj);
         }

         return var12;
      } catch (RuntimeException var14) {
         throw vk.ae(var14, "id.ar(" + ')');
      }
   }

   public final id bt() {
      int var1 = -1;
      if (-1 != this.bu * 459049337) {
         var1 = fi.ac(this.bu * 459049337, (byte)0);
      } else if (-1 != -924687435 * this.br) {
         var1 = no.am[this.br * -924687435];
      }

      int var2;
      if (var1 >= 0 && var1 < this.bz.length - 1) {
         var2 = this.bz[var1];
      } else {
         var2 = this.bz[this.bz.length - 1];
      }

      return var2 != -1 ? kf.ae(var2, (byte)51) : null;
   }

   public int bq(int var1, int var2) {
      return bh.ae(this.ch, var1, var2, -1278224469);
   }

   public final boolean af(int var1) {
      try {
         if (null == this.ar) {
            if (var1 == -1267556917) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var2 = true;

            for(int var3 = 0; var3 < this.ar.length; ++var3) {
               if (var1 == -1267556917) {
                  throw new IllegalStateException();
               }

               var2 &= aa.ag.bk(this.ar[var3] & '\uffff', 0, (byte)25);
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "id.af(" + ')');
      }
   }

   public int be(int var1, int var2) {
      return bh.ae(this.ch, var1, var2, -1290159553);
   }

   public final jm bg(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.al) {
         var7 = (long)(var2 + (this.au * -1484588863 << 10));
      } else {
         var7 = (long)((this.au * -2082773308 << 10) + (var1 << 3) + var2);
      }

      jm var9 = (jm)af.ac(var7);
      if (var9 == null) {
         jv var10 = this.al(var1, var2, 284453432);
         if (var10 == null) {
            return null;
         }

         var9 = var10.bn(64 + 1946519875 * this.bn, 768 + -662651289 * this.bh, -50, -1467903069, 982803382);
         af.ag(var9, var7);
      }

      if (1371685171 * this.aj >= 0) {
         var9 = var9.am(var3, var4, var5, var6, true, -665536378 * this.aj);
      }

      return var9;
   }

   public boolean cn() {
      if (null == this.bz) {
         return -1 != 23662517 * this.bo || null != this.be;
      } else {
         for(int var1 = 0; var1 < this.bz.length; ++var1) {
            if (-1 != this.bz[var1]) {
               id var2 = kf.ae(this.bz[var1], (byte)115);
               if (var2.bo * 23662517 != -1 || null != var2.be) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean ch() {
      if (null == this.bz) {
         return -1 != 23662517 * this.bo || null != this.be;
      } else {
         for(int var1 = 0; var1 < this.bz.length; ++var1) {
            if (-1 != this.bz[var1]) {
               id var2 = kf.ae(this.bz[var1], (byte)113);
               if (var2.bo * 23662517 != -1 || null != var2.be) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean cf() {
      if (null == this.bz) {
         return -1 != 645711391 * this.bo || null != this.be;
      } else {
         for(int var1 = 0; var1 < this.bz.length; ++var1) {
            if (-1 != this.bz[var1]) {
               id var2 = kf.ae(this.bz[var1], (byte)21);
               if (var2.bo * 938649948 != -1 || null != var2.be) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public final jm br(int var1, int var2, int[][] var3, int var4, int var5, int var6, if var7, int var8) {
      long var9;
      if (this.al == null) {
         var9 = (long)(var2 + (this.au * 2046790865 << 10));
      } else {
         var9 = (long)(var2 + (1404778017 * this.au << 10) + (var1 << 3));
      }

      jm var11 = (jm)af.ac(var9);
      if (var11 == null) {
         jv var12 = this.al(var1, var2, 4400477);
         if (var12 == null) {
            return null;
         }

         var11 = var12.bn(2005202626 + 1946519875 * this.bn, -1535341691 + -662651289 * this.bh, 362279788, -1431894781, 747116772);
         af.ag(var11, var9);
      }

      if (var7 == null && -1 == 1371685171 * this.aj) {
         return var11;
      } else {
         if (var7 != null) {
            var11 = var7.af(var11, var8, var2, -1606669049);
         } else {
            var11 = var11.ax(true);
         }

         if (this.aj * 1371685171 >= 0) {
            var11 = var11.am(var3, var4, var5, var6, false, 1371685171 * this.aj);
         }

         return var11;
      }
   }
}
