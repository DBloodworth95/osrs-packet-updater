public class ir extends tp {
   int bp;
   static mi aj = new mi(4096);
   public static mi ai = new mi(500);
   static mi ay = new mi(30);
   public int ba;
   public int[] bm;
   public int am;
   int[] at;
   public int bg;
   public String an;
   static jj[] ae = new jj[4];
   short[] af;
   boolean bt;
   short[] ab;
   public int az;
   int bc;
   public int ad;
   public boolean ac;
   static mi as = new mi(30);
   int ax;
   boolean aq;
   public int av;
   public int bs;
   public int ah;
   int bh;
   int bj;
   public String[] bv;
   public int bx;
   public int bk;
   boolean bb;
   public boolean bq;
   public int aa;
   int bz;
   int bo;
   public boolean al;
   int br;
   int bn;
   public boolean bu;
   static boolean ap = false;
   int[] au;
   public int bf;
   short[] ao;
   int bd;
   public int ag;
   public int bw;
   public int bi;
   int by;
   short[] ar;
   public int[] bl;
   public boolean be;
   public boolean cq;
   um cb;
   static or fu;

   public String bl(int var1, String var2) {
      return ly.ak(this.cb, var1, var2, 778165013);
   }

   public String be(int var1, String var2) {
      return ly.ak(this.cb, var1, var2, -848112932);
   }

   void aj(vl var1, short var2) {
      try {
         while(true) {
            int var3 = var1.cy((short)-1552);
            if (var3 == 0) {
               if (var2 <= 4032) {
                  return;
               }

               return;
            }

            this.ai(var1, var3, (byte)-21);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ir.aj(" + ')');
      }
   }

   final jj bd(int var1, int var2) {
      jj var3 = null;
      boolean var4;
      int var5;
      int var7;
      if (null == this.au) {
         if (var1 != 10) {
            return null;
         }

         if (this.at == null) {
            return null;
         }

         var4 = this.bb;
         if (2 == var1 && var2 > 3) {
            var4 = !var4;
         }

         var5 = this.at.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            var7 = this.at[var6];
            if (var4) {
               var7 += 65536;
            }

            var3 = (jj)ai.ap((long)var7);
            if (var3 == null) {
               var3 = jj.ap(di.ak, var7 & '\uffff', 0);
               if (var3 == null) {
                  return null;
               }

               if (var4) {
                  var3.ax();
               }

               ai.ak(var3, (long)var7);
            }

            if (var5 > 1) {
               ae[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new jj(ae, var5);
         }
      } else {
         int var8 = -1;

         for(var5 = 0; var5 < this.au.length; ++var5) {
            if (var1 == this.au[var5]) {
               var8 = var5;
               break;
            }
         }

         if (-1 == var8) {
            return null;
         }

         var5 = this.at[var8];
         boolean var9 = this.bb ^ var2 > 3;
         if (var9) {
            var5 += 65536;
         }

         var3 = (jj)ai.ap((long)var5);
         if (var3 == null) {
            var3 = jj.ap(di.ak, var5 & '\uffff', 0);
            if (var3 == null) {
               return null;
            }

            if (var9) {
               var3.ax();
            }

            ai.ak(var3, (long)var5);
         }
      }

      if (this.bp * -2101128755 == 128 && this.bz * 2145271155 == 128 && -1406970629 * this.bc == 128) {
         var4 = false;
      } else {
         var4 = true;
      }

      boolean var10;
      if (597322899 * this.by == 0 && 0 == 1984018163 * this.br && 0 == this.bn * 568623225) {
         var10 = false;
      } else {
         var10 = true;
      }

      jj var11 = new jj(var3, var2 == 0 && !var4 && !var10, this.ao == null, null == this.ar, true);
      if (4 == var1 && var2 > 3) {
         var11.ag(256);
         var11.ad(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var11.ar();
      } else if (var2 == 2) {
         var11.ab();
      } else if (var2 == 3) {
         var11.az();
      }

      if (this.ao != null) {
         for(var7 = 0; var7 < this.ao.length; ++var7) {
            var11.ac(this.ao[var7], this.af[var7]);
         }
      }

      if (null != this.ar) {
         for(var7 = 0; var7 < this.ar.length; ++var7) {
            var11.av(this.ar[var7], this.ab[var7]);
         }
      }

      if (var4) {
         var11.aq(-2101128755 * this.bp, 2145271155 * this.bz, this.bc * -1406970629);
      }

      if (var10) {
         var11.ad(597322899 * this.by, 1984018163 * this.br, 568623225 * this.bn);
      }

      return var11;
   }

   ir() {
      try {
         super();
         this.an = og.au;
         this.az = -400495937;
         this.ag = 627274273;
         this.ad = -1223563090;
         this.ac = true;
         this.av = 1118330783;
         this.ax = 741524357;
         this.aq = false;
         this.al = false;
         this.aa = -324686009;
         this.ah = 1288520976;
         this.bh = 0;
         this.bj = 0;
         this.bv = new String[5];
         this.bx = 1476591469;
         this.bk = -469798057;
         this.bb = false;
         this.bq = true;
         this.bp = -1862172032;
         this.bz = 1838669184;
         this.bc = -926213760;
         this.by = 0;
         this.br = 0;
         this.bn = 0;
         this.bu = false;
         this.bt = false;
         this.bs = 412710629;
         this.bo = -937696251;
         this.bd = -1703945193;
         this.ba = -217194747;
         this.bw = 0;
         this.bi = 0;
         this.bf = 0;
         this.bg = 0;
         this.be = true;
         this.cq = false;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ir.<init>(" + ')');
      }
   }

   public final jy bm(int var1, int var2, int[][] var3, int var4, int var5, int var6, iu var7, int var8) {
      long var9;
      if (this.au == null) {
         var9 = (long)(var2 + (this.am * 1597792305 << 10));
      } else {
         var9 = (long)((var1 << 3) + (1597792305 * this.am << 10) + var2);
      }

      jy var11 = (jy)as.ap(var9);
      if (null == var11) {
         jj var12 = this.au(var1, var2, (byte)36);
         if (var12 == null) {
            return null;
         }

         var11 = var12.bj(1500642117 * this.bh + 64, 768 + this.bj * 55862695, -50, -10, -50);
         as.ak(var11, var9);
      }

      if (var7 == null && -1 == 377832115 * this.ax) {
         return var11;
      } else {
         if (var7 != null) {
            var11 = var7.ay(var11, var8, var2, (byte)-104);
         } else {
            var11 = var11.ai(true);
         }

         if (377832115 * this.ax >= 0) {
            var11 = var11.aj(var3, var4, var5, var6, false, this.ax * 377832115);
         }

         return var11;
      }
   }

   public final jv ae(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
      try {
         long var8;
         if (this.au == null) {
            if (var7 >= -1736739607) {
               throw new IllegalStateException();
            }

            var8 = (long)((this.am * 1597792305 << 10) + var2);
         } else {
            var8 = (long)((1597792305 * this.am << 10) + (var1 << 3) + var2);
         }

         Object var10 = (jv)ay.ap(var8);
         if (var10 == null) {
            if (var7 >= -1736739607) {
               throw new IllegalStateException();
            }

            jj var11 = this.au(var1, var2, (byte)116);
            if (null == var11) {
               if (var7 >= -1736739607) {
                  throw new IllegalStateException();
               }

               return null;
            }

            if (!this.aq) {
               if (var7 >= -1736739607) {
                  throw new IllegalStateException();
               }

               var10 = var11.bj(64 + this.bh * 1500642117, this.bj * 55862695 + 768, -50, -10, -50);
            } else {
               var11.bq = (short)(1500642117 * this.bh + 64);
               var11.bp = (short)(this.bj * 55862695 + 768);
               var11.al();
               var10 = var11;
            }

            ay.ak((tp)var10, var8);
         }

         if (this.aq) {
            var10 = ((jj)var10).as();
         }

         if (this.ax * 377832115 >= 0) {
            if (var7 >= -1736739607) {
               throw new IllegalStateException();
            }

            if (var10 instanceof jy) {
               if (var7 >= -1736739607) {
                  throw new IllegalStateException();
               }

               var10 = ((jy)var10).aj(var3, var4, var5, var6, true, 377832115 * this.ax);
            } else if (var10 instanceof jj) {
               if (var7 >= -1736739607) {
                  throw new IllegalStateException();
               }

               var10 = ((jj)var10).ae(var3, var4, var5, var6, true, 377832115 * this.ax);
            }
         }

         return (jv)var10;
      } catch (RuntimeException var12) {
         throw tm.aw(var12, "ir.ae(" + ')');
      }
   }

   public final jy am(int var1, int var2, int[][] var3, int var4, int var5, int var6, byte var7) {
      try {
         long var8;
         if (null == this.au) {
            var8 = (long)(var2 + (this.am * 1597792305 << 10));
         } else {
            var8 = (long)(var2 + (1597792305 * this.am << 10) + (var1 << 3));
         }

         jy var10 = (jy)as.ap(var8);
         if (null == var10) {
            if (var7 == 1) {
               throw new IllegalStateException();
            }

            jj var11 = this.au(var1, var2, (byte)106);
            if (var11 == null) {
               if (var7 == 1) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var10 = var11.bj(this.bh * 1500642117 + 64, 768 + 55862695 * this.bj, -50, -10, -50);
            as.ak(var10, var8);
         }

         if (377832115 * this.ax >= 0) {
            if (var7 == 1) {
               throw new IllegalStateException();
            }

            var10 = var10.aj(var3, var4, var5, var6, true, 377832115 * this.ax);
         }

         return var10;
      } catch (RuntimeException var12) {
         throw tm.aw(var12, "ir.am(" + ')');
      }
   }

   void ax(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-3278);
         if (var2 == 0) {
            return;
         }

         this.ai(var1, var2, (byte)13);
      }
   }

   final jj au(int var1, int var2, byte var3) {
      try {
         jj var4 = null;
         boolean var5;
         int var6;
         int var8;
         if (null == this.au) {
            if (var3 <= 12) {
               throw new IllegalStateException();
            }

            if (var1 != 10) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               return null;
            }

            if (this.at == null) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var5 = this.bb;
            if (2 == var1) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               if (var2 > 3) {
                  if (var3 <= 12) {
                     throw new IllegalStateException();
                  }

                  var5 = !var5;
               }
            }

            var6 = this.at.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               var8 = this.at[var7];
               if (var5) {
                  if (var3 <= 12) {
                     throw new IllegalStateException();
                  }

                  var8 += 65536;
               }

               var4 = (jj)ai.ap((long)var8);
               if (var4 == null) {
                  if (var3 <= 12) {
                     throw new IllegalStateException();
                  }

                  var4 = jj.ap(di.ak, var8 & '\uffff', 0);
                  if (var4 == null) {
                     return null;
                  }

                  if (var5) {
                     if (var3 <= 12) {
                        throw new IllegalStateException();
                     }

                     var4.ax();
                  }

                  ai.ak(var4, (long)var8);
               }

               if (var6 > 1) {
                  ae[var7] = var4;
               }
            }

            if (var6 > 1) {
               var4 = new jj(ae, var6);
            }
         } else {
            int var10 = -1;

            for(var6 = 0; var6 < this.au.length; ++var6) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               if (var1 == this.au[var6]) {
                  if (var3 <= 12) {
                     throw new IllegalStateException();
                  }

                  var10 = var6;
                  break;
               }
            }

            if (-1 == var10) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var6 = this.at[var10];
            boolean var10000 = this.bb;
            boolean var10001;
            if (var2 > 3) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            boolean var11 = var10000 ^ var10001;
            if (var11) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               var6 += 65536;
            }

            var4 = (jj)ai.ap((long)var6);
            if (var4 == null) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               var4 = jj.ap(di.ak, var6 & '\uffff', 0);
               if (var4 == null) {
                  if (var3 <= 12) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               if (var11) {
                  var4.ax();
               }

               ai.ak(var4, (long)var6);
            }
         }

         label328: {
            if (this.bp * -2101128755 == 128) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               if (this.bz * 2145271155 == 128) {
                  if (var3 <= 12) {
                     throw new IllegalStateException();
                  }

                  if (-1406970629 * this.bc == 128) {
                     var5 = false;
                     break label328;
                  }

                  if (var3 <= 12) {
                     throw new IllegalStateException();
                  }
               }
            }

            var5 = true;
         }

         boolean var12;
         label319: {
            if (597322899 * this.by == 0) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               if (0 == 1984018163 * this.br) {
                  if (var3 <= 12) {
                     throw new IllegalStateException();
                  }

                  if (0 == this.bn * 568623225) {
                     var12 = false;
                     break label319;
                  }

                  if (var3 <= 12) {
                     throw new IllegalStateException();
                  }
               }
            }

            var12 = true;
         }

         jj var14;
         boolean var10003;
         label310: {
            var14 = new jj;
            if (var2 == 0) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               if (!var5) {
                  if (var3 <= 12) {
                     throw new IllegalStateException();
                  }

                  if (!var12) {
                     var10003 = true;
                     break label310;
                  }
               }
            }

            var10003 = false;
         }

         boolean var10004;
         if (this.ao == null) {
            if (var3 <= 12) {
               throw new IllegalStateException();
            }

            var10004 = true;
         } else {
            var10004 = false;
         }

         boolean var10005;
         if (null == this.ar) {
            if (var3 <= 12) {
               throw new IllegalStateException();
            }

            var10005 = true;
         } else {
            var10005 = false;
         }

         var14.<init>(var4, var10003, var10004, var10005, true);
         jj var13 = var14;
         if (4 == var1) {
            if (var3 <= 12) {
               throw new IllegalStateException();
            }

            if (var2 > 3) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               var13.ag(256);
               var13.ad(45, 0, -45);
            }
         }

         var2 &= 3;
         if (var2 == 1) {
            if (var3 <= 12) {
               throw new IllegalStateException();
            }

            var13.ar();
         } else if (var2 == 2) {
            var13.ab();
         } else if (var2 == 3) {
            var13.az();
         }

         if (this.ao != null) {
            if (var3 <= 12) {
               throw new IllegalStateException();
            }

            for(var8 = 0; var8 < this.ao.length; ++var8) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               var13.ac(this.ao[var8], this.af[var8]);
            }
         }

         if (null != this.ar) {
            if (var3 <= 12) {
               throw new IllegalStateException();
            }

            for(var8 = 0; var8 < this.ar.length; ++var8) {
               var13.av(this.ar[var8], this.ab[var8]);
            }
         }

         if (var5) {
            if (var3 <= 12) {
               throw new IllegalStateException();
            }

            var13.aq(-2101128755 * this.bp, 2145271155 * this.bz, this.bc * -1406970629);
         }

         if (var12) {
            if (var3 <= 12) {
               throw new IllegalStateException();
            }

            var13.ad(597322899 * this.by, 1984018163 * this.br, 568623225 * this.bn);
         }

         return var13;
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "ir.au(" + ')');
      }
   }

   public final boolean ay(int var1, int var2) {
      try {
         if (null == this.au) {
            if (var2 >= -1281332479) {
               throw new IllegalStateException();
            } else if (null == this.at) {
               if (var2 >= -1281332479) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else if (10 != var1) {
               if (var2 >= -1281332479) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               boolean var6 = true;

               for(int var4 = 0; var4 < this.at.length; ++var4) {
                  if (var2 >= -1281332479) {
                     throw new IllegalStateException();
                  }

                  var6 &= di.ak.bd(this.at[var4] & '\uffff', 0, -2094056493);
               }

               return var6;
            }
         } else {
            for(int var3 = 0; var3 < this.au.length; ++var3) {
               if (var1 == this.au[var3]) {
                  if (var2 >= -1281332479) {
                     throw new IllegalStateException();
                  }

                  return di.ak.bd(this.at[var3] & '\uffff', 0, -2094056493);
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ir.ay(" + ')');
      }
   }

   public int ao(int var1, int var2, int var3) {
      try {
         return ge.aw(this.cb, var1, var2, 1413610248);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ir.ao(" + ')');
      }
   }

   public String af(int var1, String var2, int var3) {
      try {
         return ly.ak(this.cb, var1, var2, 949172277);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ir.af(" + ')');
      }
   }

   public boolean ab(int var1) {
      try {
         if (null == this.bm) {
            if (var1 != -759597315) {
               throw new IllegalStateException();
            } else {
               boolean var10000;
               if (this.ba * -2038765005 == -1) {
                  if (this.bl == null) {
                     var10000 = false;
                     return var10000;
                  }

                  if (var1 != -759597315) {
                     throw new IllegalStateException();
                  }
               }

               var10000 = true;
               return var10000;
            }
         } else {
            int var2 = 0;

            while(true) {
               if (var2 >= this.bm.length) {
                  return false;
               }

               if (var1 != -759597315) {
                  throw new IllegalStateException();
               }

               if (this.bm[var2] != -1) {
                  if (var1 != -759597315) {
                     throw new IllegalStateException();
                  }

                  ir var3 = ei.aw(this.bm[var2], 888461382);
                  if (var3.ba * -2038765005 != -1) {
                     break;
                  }

                  if (var1 != -759597315) {
                     throw new IllegalStateException();
                  }

                  if (null != var3.bl) {
                     if (var1 != -759597315) {
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
         throw tm.aw(var4, "ir.ab(" + ')');
      }
   }

   void bv(vl var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cy((short)-10400);
         if (var3 > 0) {
            if (null != this.at && !ap) {
               var1.am += 2118203047 * var3;
            } else {
               this.au = new int[var3];
               this.at = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.at[var4] = var1.ce(242693589);
                  this.au[var4] = var1.cy((short)-9830);
               }
            }
         }
      } else if (2 == var2) {
         this.an = var1.cw(1936494179);
      } else if (5 == var2) {
         var3 = var1.cy((short)-1602);
         if (var3 > 0) {
            if (this.at != null && !ap) {
               var1.am += -1451176166 * var3;
            } else {
               this.au = null;
               this.at = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.at[var4] = var1.ce(1936572796);
               }
            }
         }
      } else if (14 == var2) {
         this.az = var1.cy((short)-13543) * -400495937;
      } else if (var2 == 15) {
         this.ag = var1.cy((short)-7742) * 627274273;
      } else if (17 == var2) {
         this.ad = 0;
         this.ac = false;
      } else if (18 == var2) {
         this.ac = false;
      } else if (19 == var2) {
         this.av = var1.cy((short)-31585) * -1118330783;
      } else if (21 == var2) {
         this.ax = 0;
      } else if (22 == var2) {
         this.aq = true;
      } else if (var2 == 23) {
         this.al = true;
      } else if (var2 == 24) {
         this.aa = var1.ce(483185711) * 324686009;
         if (1515763081 * this.aa == 65535) {
            this.aa = -324686009;
         }
      } else if (27 == var2) {
         this.ad = -611781545;
      } else if (28 == var2) {
         this.ah = var1.cy((short)-17500) * 1691145297;
      } else if (29 == var2) {
         this.bh = var1.cu((byte)13) * 1924292493;
      } else if (var2 == 39) {
         this.bj = var1.cu((byte)13) * 361014335;
      } else if (var2 >= 30 && var2 < 35) {
         this.bv[var2 - 30] = var1.cw(2017430572);
         if (this.bv[var2 - 30].equalsIgnoreCase(og.ay)) {
            this.bv[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.cy((short)-26999);
         this.ao = new short[var3];
         this.af = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ao[var4] = (short)var1.ce(56672225);
            this.af[var4] = (short)var1.ce(306137430);
         }
      } else if (41 == var2) {
         var3 = var1.cy((short)-2834);
         this.ar = new short[var3];
         this.ab = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ar[var4] = (short)var1.ce(164284611);
            this.ab[var4] = (short)var1.ce(1401552614);
         }
      } else if (61 == var2) {
         var1.ce(1198501316);
      } else if (var2 == 62) {
         this.bb = true;
      } else if (var2 == 64) {
         this.bq = false;
      } else if (var2 == 65) {
         this.bp = var1.ce(1122136406) * 1998717701;
      } else if (66 == var2) {
         this.bz = var1.ce(820867325) * 1591422907;
      } else if (var2 == 67) {
         this.bc = var1.ce(1500172151) * 1838257715;
      } else if (68 == var2) {
         this.bk = var1.ce(462774491) * 469798057;
      } else if (var2 == 69) {
         var1.cy((short)-4431);
      } else if (70 == var2) {
         this.by = var1.cg(-585368820) * -275017317;
      } else if (var2 == 71) {
         this.br = var1.cg(-350971687) * -419737029;
      } else if (var2 == 72) {
         this.bn = var1.cg(-62325609) * -1884165687;
      } else if (var2 == 73) {
         this.bu = true;
      } else if (74 == var2) {
         this.bt = true;
      } else if (75 == var2) {
         this.bs = var1.cy((short)-10501) * -412710629;
      } else if (77 != var2 && var2 != 92) {
         if (var2 == 78) {
            this.ba = var1.ce(173729426) * 217194747;
            this.bw = var1.cy((short)-4887) * -1275948967;
            this.bi = var1.cy((short)-10686) * -1533175349;
         } else if (var2 == 79) {
            this.bf = var1.ce(2116644674) * -1709145467;
            this.bg = var1.ce(617973078) * 1895100689;
            this.bw = var1.cy((short)-1796) * -1275948967;
            this.bi = var1.cy((short)-30413) * -1533175349;
            var3 = var1.cy((short)-27275);
            this.bl = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.bl[var4] = var1.ce(162994542);
            }
         } else if (81 == var2) {
            var1.cy((short)-12562);
         } else if (var2 == 82) {
            this.bx = var1.ce(694748915) * -1476591469;
         } else if (89 == var2) {
            this.be = false;
         } else if (90 == var2) {
            this.cq = true;
         } else if (249 == var2) {
            this.cb = dr.ap(var1, this.cb, 1980379864);
         }
      } else {
         this.bo = var1.ce(1905324883) * 937696251;
         if (65535 == this.bo * 1967830835) {
            this.bo = -937696251;
         }

         this.bd = var1.ce(1461456529) * 1703945193;
         if (this.bd * -1062673319 == 65535) {
            this.bd = -1703945193;
         }

         var3 = -1;
         if (92 == var2) {
            var3 = var1.ce(896998742);
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.cy((short)-14419);
         this.bm = new int[2 + var4];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.bm[var5] = var1.ce(777784343);
            if (this.bm[var5] == 65535) {
               this.bm[var5] = -1;
            }
         }

         this.bm[var4 + 1] = var3;
      }

   }

   public final boolean as(byte var1) {
      try {
         if (this.at == null) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var2 = true;

            for(int var3 = 0; var3 < this.at.length; ++var3) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               var2 &= di.ak.bd(this.at[var3] & '\uffff', 0, -2094056493);
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ir.as(" + ')');
      }
   }

   void ad() {
      if (1121031797 * this.av == -1) {
         this.av = 0;
         if (null != this.at && (null == this.au || this.au[0] == 10)) {
            this.av = 2105488207;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if (this.bv[var1] != null) {
               this.av = -1118330783;
            }
         }
      }

      if (this.bs * 531867923 == -1) {
         this.bs = 359206868 * (this.ad * -836696248 != 0 ? 1 : 0);
      }

   }

   public final jy bs(int var1, int var2, int[][] var3, int var4, int var5, int var6, iu var7, int var8) {
      long var9;
      if (this.au == null) {
         var9 = (long)(var2 + (this.am * 1597792305 << 10));
      } else {
         var9 = (long)((var1 << 3) + (1597792305 * this.am << 10) + var2);
      }

      jy var11 = (jy)as.ap(var9);
      if (null == var11) {
         jj var12 = this.au(var1, var2, (byte)117);
         if (var12 == null) {
            return null;
         }

         var11 = var12.bj(1500642117 * this.bh + 64, 768 + this.bj * 55862695, -50, -10, -50);
         as.ak(var11, var9);
      }

      if (var7 == null && -1 == 377832115 * this.ax) {
         return var11;
      } else {
         if (var7 != null) {
            var11 = var7.ay(var11, var8, var2, (byte)-57);
         } else {
            var11 = var11.ai(true);
         }

         if (377832115 * this.ax >= 0) {
            var11 = var11.aj(var3, var4, var5, var6, false, this.ax * 377832115);
         }

         return var11;
      }
   }

   void av() {
      if (266535841 * this.av == -1) {
         this.av = 0;
         if (null != this.at && (null == this.au || this.au[0] == 10)) {
            this.av = -1118330783;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if (this.bv[var1] != null) {
               this.av = -1118330783;
            }
         }
      }

      if (this.bs * 531867923 == -1) {
         this.bs = 1848531488 * (this.ad * -1552861337 != 0 ? 1 : 0);
      }

   }

   static final void iq(String var0, boolean var1, byte var2) {
      try {
         if (!client.mz) {
            if (var2 < 1) {
               ;
            }
         } else {
            byte var3 = 4;
            int var4 = var3 + 6;
            int var5 = var3 + 6;
            int var6 = et.iq.an(var0, 250);
            int var7 = et.iq.ao(var0, 250) * 13;
            vz.ef(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var3 + var7, 0);
            vz.ep(var4 - var3, var5 - var3, var3 + var6 + var3, var7 + var3 + var3, 16777215);
            et.iq.ac(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
            int var8 = var4 - var3;
            int var9 = var5 - var3;
            int var10 = var3 + var6 + var3;
            int var11 = var7 + var3 + var3;

            int var12;
            for(var12 = 0; var12 < client.rt * -1121364249; ++var12) {
               if (var2 >= 1) {
                  return;
               }

               if (client.rb[var12] + client.ru[var12] > var8) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (client.rb[var12] < var8 + var10) {
                     if (var2 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (client.rh[var12] + client.rx[var12] > var9 && client.rh[var12] < var9 + var11) {
                        if (var2 >= 1) {
                           throw new IllegalStateException();
                        }

                        client.ra[var12] = true;
                     }
                  }
               }
            }

            if (var1) {
               if (var2 >= 1) {
                  return;
               }

               ii.bu.aw(0, 0, 902730793);
            } else {
               var12 = var4;
               int var13 = var5;
               int var14 = var6;
               int var15 = var7;

               for(int var16 = 0; var16 < client.rt * -1121364249; ++var16) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (client.rb[var16] + client.ru[var16] > var12) {
                     if (var2 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (client.rb[var16] < var14 + var12) {
                        if (var2 >= 1) {
                           return;
                        }

                        if (client.rx[var16] + client.rh[var16] > var13) {
                           if (var2 >= 1) {
                              throw new IllegalStateException();
                           }

                           if (client.rh[var16] < var15 + var13) {
                              if (var2 >= 1) {
                                 throw new IllegalStateException();
                              }

                              client.rd[var16] = true;
                           }
                        }
                     }
                  }
               }
            }

         }
      } catch (RuntimeException var17) {
         throw tm.aw(var17, "ir.iq(" + ')');
      }
   }

   void ai(vl var1, int var2, byte var3) {
      try {
         int var4;
         int var5;
         if (var2 == 1) {
            if (var3 == 24) {
               throw new IllegalStateException();
            }

            var4 = var1.cy((short)-29202);
            if (var4 > 0) {
               if (var3 == 24) {
                  throw new IllegalStateException();
               }

               if (null != this.at) {
                  if (var3 == 24) {
                     throw new IllegalStateException();
                  }

                  if (!ap) {
                     var1.am += 2118203047 * var4;
                     return;
                  }

                  if (var3 == 24) {
                     throw new IllegalStateException();
                  }
               }

               this.au = new int[var4];
               this.at = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 == 24) {
                     throw new IllegalStateException();
                  }

                  this.at[var5] = var1.ce(1977379261);
                  this.au[var5] = var1.cy((short)-30239);
               }
            }
         } else if (2 == var2) {
            this.an = var1.cw(2138664766);
         } else if (5 == var2) {
            var4 = var1.cy((short)-3680);
            if (var4 > 0) {
               if (this.at != null) {
                  if (var3 == 24) {
                     throw new IllegalStateException();
                  }

                  if (!ap) {
                     var1.am += -1451176166 * var4;
                     return;
                  }

                  if (var3 == 24) {
                     throw new IllegalStateException();
                  }
               }

               this.au = null;
               this.at = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 == 24) {
                     throw new IllegalStateException();
                  }

                  this.at[var5] = var1.ce(1872028745);
               }
            }
         } else if (14 == var2) {
            if (var3 == 24) {
               throw new IllegalStateException();
            }

            this.az = var1.cy((short)-6861) * -400495937;
         } else if (var2 == 15) {
            if (var3 == 24) {
               throw new IllegalStateException();
            }

            this.ag = var1.cy((short)-19649) * 627274273;
         } else if (17 == var2) {
            if (var3 == 24) {
               throw new IllegalStateException();
            }

            this.ad = 0;
            this.ac = false;
         } else if (18 == var2) {
            if (var3 == 24) {
               return;
            }

            this.ac = false;
         } else if (19 == var2) {
            if (var3 == 24) {
               return;
            }

            this.av = var1.cy((short)-8605) * -1118330783;
         } else if (21 == var2) {
            if (var3 == 24) {
               throw new IllegalStateException();
            }

            this.ax = 0;
         } else if (22 == var2) {
            if (var3 == 24) {
               throw new IllegalStateException();
            }

            this.aq = true;
         } else if (var2 == 23) {
            if (var3 == 24) {
               throw new IllegalStateException();
            }

            this.al = true;
         } else if (var2 == 24) {
            if (var3 == 24) {
               throw new IllegalStateException();
            }

            this.aa = var1.ce(1359946547) * 324686009;
            if (1515763081 * this.aa == 65535) {
               if (var3 == 24) {
                  return;
               }

               this.aa = -324686009;
            }
         } else if (27 == var2) {
            if (var3 == 24) {
               throw new IllegalStateException();
            }

            this.ad = -611781545;
         } else if (28 == var2) {
            this.ah = var1.cy((short)-32104) * 1691145297;
         } else if (29 == var2) {
            if (var3 == 24) {
               return;
            }

            this.bh = var1.cu((byte)13) * 1924292493;
         } else if (var2 == 39) {
            if (var3 == 24) {
               throw new IllegalStateException();
            }

            this.bj = var1.cu((byte)13) * 361014335;
         } else {
            if (var2 >= 30) {
               if (var3 == 24) {
                  throw new IllegalStateException();
               }

               if (var2 < 35) {
                  if (var3 == 24) {
                     throw new IllegalStateException();
                  }

                  this.bv[var2 - 30] = var1.cw(2049621933);
                  if (this.bv[var2 - 30].equalsIgnoreCase(og.ay)) {
                     if (var3 == 24) {
                        throw new IllegalStateException();
                     }

                     this.bv[var2 - 30] = null;
                  }

                  return;
               }
            }

            if (var2 == 40) {
               var4 = var1.cy((short)-22312);
               this.ao = new short[var4];
               this.af = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.ao[var5] = (short)var1.ce(1947815604);
                  this.af[var5] = (short)var1.ce(218016087);
               }
            } else if (41 == var2) {
               if (var3 == 24) {
                  throw new IllegalStateException();
               }

               var4 = var1.cy((short)-13183);
               this.ar = new short[var4];
               this.ab = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 == 24) {
                     throw new IllegalStateException();
                  }

                  this.ar[var5] = (short)var1.ce(937317391);
                  this.ab[var5] = (short)var1.ce(1632024490);
               }
            } else if (61 == var2) {
               if (var3 == 24) {
                  return;
               }

               var1.ce(918277119);
            } else if (var2 == 62) {
               if (var3 == 24) {
                  return;
               }

               this.bb = true;
            } else if (var2 == 64) {
               if (var3 == 24) {
                  return;
               }

               this.bq = false;
            } else if (var2 == 65) {
               if (var3 == 24) {
                  throw new IllegalStateException();
               }

               this.bp = var1.ce(165529948) * 1998717701;
            } else if (66 == var2) {
               this.bz = var1.ce(1822541054) * 1591422907;
            } else if (var2 == 67) {
               if (var3 == 24) {
                  throw new IllegalStateException();
               }

               this.bc = var1.ce(466444953) * 1838257715;
            } else if (68 == var2) {
               if (var3 == 24) {
                  throw new IllegalStateException();
               }

               this.bk = var1.ce(934412248) * 469798057;
            } else if (var2 == 69) {
               var1.cy((short)-31392);
            } else if (70 == var2) {
               if (var3 == 24) {
                  throw new IllegalStateException();
               }

               this.by = var1.cg(-1116075909) * -275017317;
            } else if (var2 == 71) {
               if (var3 == 24) {
                  throw new IllegalStateException();
               }

               this.br = var1.cg(-82154880) * -419737029;
            } else if (var2 == 72) {
               if (var3 == 24) {
                  throw new IllegalStateException();
               }

               this.bn = var1.cg(-1113709252) * -1884165687;
            } else if (var2 == 73) {
               this.bu = true;
            } else if (74 == var2) {
               if (var3 == 24) {
                  throw new IllegalStateException();
               }

               this.bt = true;
            } else if (75 == var2) {
               this.bs = var1.cy((short)-9827) * -412710629;
            } else {
               if (77 != var2) {
                  if (var3 == 24) {
                     throw new IllegalStateException();
                  }

                  if (var2 != 92) {
                     if (var2 == 78) {
                        this.ba = var1.ce(1876625671) * 217194747;
                        this.bw = var1.cy((short)-16126) * -1275948967;
                        this.bi = var1.cy((short)-17057) * -1533175349;
                        return;
                     } else if (var2 == 79) {
                        if (var3 == 24) {
                           throw new IllegalStateException();
                        }

                        this.bf = var1.ce(1729712802) * -1709145467;
                        this.bg = var1.ce(2121134396) * 1895100689;
                        this.bw = var1.cy((short)-13289) * -1275948967;
                        this.bi = var1.cy((short)-29300) * -1533175349;
                        var4 = var1.cy((short)-30145);
                        this.bl = new int[var4];

                        for(var5 = 0; var5 < var4; ++var5) {
                           if (var3 == 24) {
                              throw new IllegalStateException();
                           }

                           this.bl[var5] = var1.ce(495021313);
                        }

                        return;
                     } else if (81 == var2) {
                        var1.cy((short)-23862);
                        return;
                     } else if (var2 == 82) {
                        if (var3 == 24) {
                           return;
                        }

                        this.bx = var1.ce(1697386285) * -1476591469;
                        return;
                     } else if (89 == var2) {
                        if (var3 == 24) {
                           throw new IllegalStateException();
                        }

                        this.be = false;
                        return;
                     } else {
                        if (90 == var2) {
                           this.cq = true;
                        } else if (249 == var2) {
                           if (var3 == 24) {
                              throw new IllegalStateException();
                           }

                           this.cb = dr.ap(var1, this.cb, -1109744675);
                           return;
                        }

                        return;
                     }
                  }
               }

               this.bo = var1.ce(812665415) * 937696251;
               if (65535 == this.bo * 1967830835) {
                  if (var3 == 24) {
                     throw new IllegalStateException();
                  }

                  this.bo = -937696251;
               }

               this.bd = var1.ce(1857925682) * 1703945193;
               if (this.bd * -1062673319 == 65535) {
                  this.bd = -1703945193;
               }

               var4 = -1;
               if (92 == var2) {
                  if (var3 == 24) {
                     return;
                  }

                  var4 = var1.ce(1997624294);
                  if (var4 == 65535) {
                     if (var3 == 24) {
                        throw new IllegalStateException();
                     }

                     var4 = -1;
                  }
               }

               var5 = var1.cy((short)-9860);
               this.bm = new int[2 + var5];

               for(int var6 = 0; var6 <= var5; ++var6) {
                  this.bm[var6] = var1.ce(1399879590);
                  if (this.bm[var6] == 65535) {
                     this.bm[var6] = -1;
                  }
               }

               this.bm[var5 + 1] = var4;
            }
         }

      } catch (RuntimeException var7) {
         throw tm.aw(var7, "ir.ai(" + ')');
      }
   }

   void al(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-11391);
         if (var2 == 0) {
            return;
         }

         this.ai(var1, var2, (byte)-49);
      }
   }

   public final ir an(byte var1) {
      try {
         int var2 = -1;
         if (-1 != this.bo * 1967830835) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            var2 = dd.ap(1967830835 * this.bo, (byte)-111);
         } else if (-1062673319 * this.bd != -1) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            var2 = nb.aj[this.bd * -1062673319];
         }

         int var3;
         label46: {
            if (var2 >= 0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               if (var2 < this.bm.length - 1) {
                  var3 = this.bm[var2];
                  break label46;
               }

               if (var1 <= 0) {
                  throw new IllegalStateException();
               }
            }

            var3 = this.bm[this.bm.length - 1];
         }

         if (var3 != -1) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            } else {
               return ei.aw(var3, 888461382);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ir.an(" + ')');
      }
   }

   void ah(vl var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cy((short)-14228);
         if (var3 > 0) {
            if (null != this.at && !ap) {
               var1.am += 2118203047 * var3;
            } else {
               this.au = new int[var3];
               this.at = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.at[var4] = var1.ce(649291989);
                  this.au[var4] = var1.cy((short)-17302);
               }
            }
         }
      } else if (2 == var2) {
         this.an = var1.cw(2070486611);
      } else if (5 == var2) {
         var3 = var1.cy((short)-22775);
         if (var3 > 0) {
            if (this.at != null && !ap) {
               var1.am += -1451176166 * var3;
            } else {
               this.au = null;
               this.at = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.at[var4] = var1.ce(817416289);
               }
            }
         }
      } else if (14 == var2) {
         this.az = var1.cy((short)-11680) * -400495937;
      } else if (var2 == 15) {
         this.ag = var1.cy((short)-28564) * 627274273;
      } else if (17 == var2) {
         this.ad = 0;
         this.ac = false;
      } else if (18 == var2) {
         this.ac = false;
      } else if (19 == var2) {
         this.av = var1.cy((short)-31745) * -1118330783;
      } else if (21 == var2) {
         this.ax = 0;
      } else if (22 == var2) {
         this.aq = true;
      } else if (var2 == 23) {
         this.al = true;
      } else if (var2 == 24) {
         this.aa = var1.ce(1365021471) * 324686009;
         if (1515763081 * this.aa == 65535) {
            this.aa = -324686009;
         }
      } else if (27 == var2) {
         this.ad = -611781545;
      } else if (28 == var2) {
         this.ah = var1.cy((short)-2458) * 1691145297;
      } else if (29 == var2) {
         this.bh = var1.cu((byte)13) * 1924292493;
      } else if (var2 == 39) {
         this.bj = var1.cu((byte)13) * 361014335;
      } else if (var2 >= 30 && var2 < 35) {
         this.bv[var2 - 30] = var1.cw(2095788079);
         if (this.bv[var2 - 30].equalsIgnoreCase(og.ay)) {
            this.bv[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.cy((short)-9588);
         this.ao = new short[var3];
         this.af = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ao[var4] = (short)var1.ce(846623989);
            this.af[var4] = (short)var1.ce(1506034528);
         }
      } else if (41 == var2) {
         var3 = var1.cy((short)-23403);
         this.ar = new short[var3];
         this.ab = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ar[var4] = (short)var1.ce(1872754516);
            this.ab[var4] = (short)var1.ce(2060261510);
         }
      } else if (61 == var2) {
         var1.ce(1896520753);
      } else if (var2 == 62) {
         this.bb = true;
      } else if (var2 == 64) {
         this.bq = false;
      } else if (var2 == 65) {
         this.bp = var1.ce(1771830537) * 1998717701;
      } else if (66 == var2) {
         this.bz = var1.ce(213435409) * 1591422907;
      } else if (var2 == 67) {
         this.bc = var1.ce(2079381933) * 1838257715;
      } else if (68 == var2) {
         this.bk = var1.ce(16633236) * 469798057;
      } else if (var2 == 69) {
         var1.cy((short)-1908);
      } else if (70 == var2) {
         this.by = var1.cg(1333054314) * -275017317;
      } else if (var2 == 71) {
         this.br = var1.cg(1696925363) * -419737029;
      } else if (var2 == 72) {
         this.bn = var1.cg(1370673641) * -1884165687;
      } else if (var2 == 73) {
         this.bu = true;
      } else if (74 == var2) {
         this.bt = true;
      } else if (75 == var2) {
         this.bs = var1.cy((short)-10232) * -412710629;
      } else if (77 != var2 && var2 != 92) {
         if (var2 == 78) {
            this.ba = var1.ce(1829783275) * 217194747;
            this.bw = var1.cy((short)-25215) * -1275948967;
            this.bi = var1.cy((short)-32243) * -1533175349;
         } else if (var2 == 79) {
            this.bf = var1.ce(510411592) * -1709145467;
            this.bg = var1.ce(1739123473) * 1895100689;
            this.bw = var1.cy((short)-23186) * -1275948967;
            this.bi = var1.cy((short)-22588) * -1533175349;
            var3 = var1.cy((short)-18875);
            this.bl = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.bl[var4] = var1.ce(531804664);
            }
         } else if (81 == var2) {
            var1.cy((short)-18209);
         } else if (var2 == 82) {
            this.bx = var1.ce(1300216141) * -1476591469;
         } else if (89 == var2) {
            this.be = false;
         } else if (90 == var2) {
            this.cq = true;
         } else if (249 == var2) {
            this.cb = dr.ap(var1, this.cb, 346760667);
         }
      } else {
         this.bo = var1.ce(943957454) * 937696251;
         if (65535 == this.bo * 1967830835) {
            this.bo = -937696251;
         }

         this.bd = var1.ce(810371760) * 1703945193;
         if (this.bd * -1062673319 == 65535) {
            this.bd = -1703945193;
         }

         var3 = -1;
         if (92 == var2) {
            var3 = var1.ce(1944551717);
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.cy((short)-7861);
         this.bm = new int[2 + var4];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.bm[var5] = var1.ce(227319292);
            if (this.bm[var5] == 65535) {
               this.bm[var5] = -1;
            }
         }

         this.bm[var4 + 1] = var3;
      }

   }

   void bh(vl var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cy((short)-31629);
         if (var3 > 0) {
            if (null != this.at && !ap) {
               var1.am += 2118203047 * var3;
            } else {
               this.au = new int[var3];
               this.at = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.at[var4] = var1.ce(1611385191);
                  this.au[var4] = var1.cy((short)-7620);
               }
            }
         }
      } else if (2 == var2) {
         this.an = var1.cw(2018047748);
      } else if (5 == var2) {
         var3 = var1.cy((short)-24602);
         if (var3 > 0) {
            if (this.at != null && !ap) {
               var1.am += 2143015923 * var3;
            } else {
               this.au = null;
               this.at = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.at[var4] = var1.ce(647567496);
               }
            }
         }
      } else if (14 == var2) {
         this.az = var1.cy((short)-1741) * -2026929600;
      } else if (var2 == 15) {
         this.ag = var1.cy((short)-15247) * 627274273;
      } else if (17 == var2) {
         this.ad = 0;
         this.ac = false;
      } else if (18 == var2) {
         this.ac = false;
      } else if (19 == var2) {
         this.av = var1.cy((short)-9615) * -1118330783;
      } else if (21 == var2) {
         this.ax = 0;
      } else if (22 == var2) {
         this.aq = true;
      } else if (var2 == 23) {
         this.al = true;
      } else if (var2 == 24) {
         this.aa = var1.ce(1555446636) * 1793832879;
         if (2050975280 * this.aa == 1608788103) {
            this.aa = -324686009;
         }
      } else if (27 == var2) {
         this.ad = 329006773;
      } else if (28 == var2) {
         this.ah = var1.cy((short)-29908) * 1465249909;
      } else if (29 == var2) {
         this.bh = var1.cu((byte)13) * 103875024;
      } else if (var2 == 39) {
         this.bj = var1.cu((byte)13) * 1099147513;
      } else if (var2 >= 30 && var2 < 1412715361) {
         this.bv[var2 - 30] = var1.cw(2026634448);
         if (this.bv[var2 - 30].equalsIgnoreCase(og.ay)) {
            this.bv[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.cy((short)-28499);
         this.ao = new short[var3];
         this.af = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ao[var4] = (short)var1.ce(1920061467);
            this.af[var4] = (short)var1.ce(899982443);
         }
      } else if (-251412895 == var2) {
         var3 = var1.cy((short)-5950);
         this.ar = new short[var3];
         this.ab = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ar[var4] = (short)var1.ce(756076236);
            this.ab[var4] = (short)var1.ce(205485723);
         }
      } else if (400655254 == var2) {
         var1.ce(328880842);
      } else if (var2 == 432784065) {
         this.bb = true;
      } else if (var2 == 108508868) {
         this.bq = false;
      } else if (var2 == 1865553068) {
         this.bp = var1.ce(172683580) * 1998717701;
      } else if (-907342217 == var2) {
         this.bz = var1.ce(1853654113) * 1591422907;
      } else if (var2 == 1870457933) {
         this.bc = var1.ce(1498755836) * -1427356249;
      } else if (68 == var2) {
         this.bk = var1.ce(797428895) * 469798057;
      } else if (var2 == 1144738724) {
         var1.cy((short)-9910);
      } else if (70 == var2) {
         this.by = var1.cg(939733317) * 690467578;
      } else if (var2 == 71) {
         this.br = var1.cg(-17111817) * -419737029;
      } else if (var2 == 72) {
         this.bn = var1.cg(-687835501) * 888332903;
      } else if (var2 == 180153963) {
         this.bu = true;
      } else if (-541944334 == var2) {
         this.bt = true;
      } else if (75 == var2) {
         this.bs = var1.cy((short)-8615) * -412710629;
      } else if (1115582851 != var2 && var2 != -869530377) {
         if (var2 == -1249868279) {
            this.ba = var1.ce(263727941) * 217194747;
            this.bw = var1.cy((short)-19603) * -1802958830;
            this.bi = var1.cy((short)-15777) * 1368994151;
         } else if (var2 == 79) {
            this.bf = var1.ce(1098824937) * -1709145467;
            this.bg = var1.ce(1601115961) * -436757687;
            this.bw = var1.cy((short)-16332) * -1275948967;
            this.bi = var1.cy((short)-19677) * -1533175349;
            var3 = var1.cy((short)-31353);
            this.bl = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.bl[var4] = var1.ce(1508126866);
            }
         } else if (81 == var2) {
            var1.cy((short)-28924);
         } else if (var2 == 2032311232) {
            this.bx = var1.ce(2088861641) * -1476591469;
         } else if (89 == var2) {
            this.be = false;
         } else if (90 == var2) {
            this.cq = true;
         } else if (249 == var2) {
            this.cb = dr.ap(var1, this.cb, -2119040247);
         }
      } else {
         this.bo = var1.ce(201752770) * 2140328206;
         if (2045401578 == this.bo * 978478253) {
            this.bo = -937696251;
         }

         this.bd = var1.ce(659155563) * 1703945193;
         if (this.bd * -1062673319 == 65535) {
            this.bd = -1703945193;
         }

         var3 = -1;
         if (92 == var2) {
            var3 = var1.ce(1767099090);
            if (var3 == 1169670040) {
               var3 = -1;
            }
         }

         var4 = var1.cy((short)-11309);
         this.bm = new int[2 + var4];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.bm[var5] = var1.ce(1465816536);
            if (this.bm[var5] == 65535) {
               this.bm[var5] = -1;
            }
         }

         this.bm[var4 + 1] = var3;
      }

   }

   public boolean cn() {
      if (null == this.bm) {
         return this.ba * -2038765005 != -1 || this.bl != null;
      } else {
         for(int var1 = 0; var1 < this.bm.length; ++var1) {
            if (this.bm[var1] != -1) {
               ir var2 = ei.aw(this.bm[var1], 888461382);
               if (var2.ba * -2038765005 != -1 || null != var2.bl) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public final boolean bk() {
      if (this.at == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.at.length; ++var2) {
            var1 &= di.ak.bd(this.at[var2] & 750659271, 0, -2094056493);
         }

         return var1;
      }
   }

   public final boolean bx(int var1) {
      if (null != this.au) {
         for(int var4 = 0; var4 < this.au.length; ++var4) {
            if (var1 == this.au[var4]) {
               return di.ak.bd(this.at[var4] & 376287026, 0, -2094056493);
            }
         }

         return true;
      } else if (null == this.at) {
         return true;
      } else if (10 != var1) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.at.length; ++var3) {
            var2 &= di.ak.bd(this.at[var3] & 1203282799, 0, -2094056493);
         }

         return var2;
      }
   }

   public final ir bf() {
      int var1 = -1;
      if (-1 != this.bo * 1967830835) {
         var1 = dd.ap(1967830835 * this.bo, (byte)-67);
      } else if (1273793185 * this.bd != -1) {
         var1 = nb.aj[this.bd * -414272928];
      }

      int var2;
      if (var1 >= 0 && var1 < this.bm.length - 1) {
         var2 = this.bm[var1];
      } else {
         var2 = this.bm[this.bm.length - 1];
      }

      return var2 != -1 ? ei.aw(var2, 888461382) : null;
   }

   public final boolean bb() {
      if (this.at == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.at.length; ++var2) {
            var1 &= di.ak.bd(this.at[var2] & '\uffff', 0, -2094056493);
         }

         return var1;
      }
   }

   public static void cb() {
      aj.aj();
      ai.aj();
      ay.aj();
      as.aj();
   }

   public final jv bp(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.au == null) {
         var7 = (long)((this.am * 1597792305 << 10) + var2);
      } else {
         var7 = (long)((1597792305 * this.am << 10) + (var1 << 3) + var2);
      }

      Object var9 = (jv)ay.ap(var7);
      if (var9 == null) {
         jj var10 = this.au(var1, var2, (byte)66);
         if (null == var10) {
            return null;
         }

         if (!this.aq) {
            var9 = var10.bj(64 + this.bh * 1500642117, this.bj * 55862695 + 768, -50, -10, -50);
         } else {
            var10.bq = (short)(1500642117 * this.bh + 64);
            var10.bp = (short)(this.bj * 55862695 + 768);
            var10.al();
            var9 = var10;
         }

         ay.ak((tp)var9, var7);
      }

      if (this.aq) {
         var9 = ((jj)var9).as();
      }

      if (this.ax * 377832115 >= 0) {
         if (var9 instanceof jy) {
            var9 = ((jy)var9).aj(var3, var4, var5, var6, true, 377832115 * this.ax);
         } else if (var9 instanceof jj) {
            var9 = ((jj)var9).ae(var3, var4, var5, var6, true, 377832115 * this.ax);
         }
      }

      return (jv)var9;
   }

   void aa(vl var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cy((short)-14090);
         if (var3 > 0) {
            if (null != this.at && !ap) {
               var1.am += 625356003 * var3;
            } else {
               this.au = new int[var3];
               this.at = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.at[var4] = var1.ce(1639470816);
                  this.au[var4] = var1.cy((short)-628);
               }
            }
         }
      } else if (2 == var2) {
         this.an = var1.cw(1961406209);
      } else if (5 == var2) {
         var3 = var1.cy((short)-20355);
         if (var3 > 0) {
            if (this.at != null && !ap) {
               var1.am += -1451176166 * var3;
            } else {
               this.au = null;
               this.at = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.at[var4] = var1.ce(480749968);
               }
            }
         }
      } else if (14 == var2) {
         this.az = var1.cy((short)-20758) * -400495937;
      } else if (var2 == 15) {
         this.ag = var1.cy((short)-14637) * -1590098605;
      } else if (17 == var2) {
         this.ad = 0;
         this.ac = false;
      } else if (18 == var2) {
         this.ac = false;
      } else if (19 == var2) {
         this.av = var1.cy((short)-5468) * -1118330783;
      } else if (21 == var2) {
         this.ax = 0;
      } else if (22 == var2) {
         this.aq = true;
      } else if (var2 == 23) {
         this.al = true;
      } else if (var2 == 24) {
         this.aa = var1.ce(659444651) * -544633311;
         if (836171551 * this.aa == 65535) {
            this.aa = -324686009;
         }
      } else if (27 == var2) {
         this.ad = 325324362;
      } else if (28 == var2) {
         this.ah = var1.cy((short)-24074) * 609619137;
      } else if (29 == var2) {
         this.bh = var1.cu((byte)13) * 1924292493;
      } else if (var2 == -2143900791) {
         this.bj = var1.cu((byte)13) * 361014335;
      } else if (var2 >= 30 && var2 < 1879396978) {
         this.bv[var2 - 30] = var1.cw(2010947682);
         if (this.bv[var2 - 30].equalsIgnoreCase(og.ay)) {
            this.bv[var2 - 30] = null;
         }
      } else if (var2 == 2017774451) {
         var3 = var1.cy((short)-10669);
         this.ao = new short[var3];
         this.af = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ao[var4] = (short)var1.ce(1334468445);
            this.af[var4] = (short)var1.ce(440206357);
         }
      } else if (-977038540 == var2) {
         var3 = var1.cy((short)-526);
         this.ar = new short[var3];
         this.ab = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ar[var4] = (short)var1.ce(120439910);
            this.ab[var4] = (short)var1.ce(1189859815);
         }
      } else if (-1967547944 == var2) {
         var1.ce(1855736443);
      } else if (var2 == 1965793091) {
         this.bb = true;
      } else if (var2 == 64) {
         this.bq = false;
      } else if (var2 == 529906593) {
         this.bp = var1.ce(1633439526) * 1998717701;
      } else if (66 == var2) {
         this.bz = var1.ce(1907141673) * 1054986054;
      } else if (var2 == 67) {
         this.bc = var1.ce(414533520) * 2075371662;
      } else if (68 == var2) {
         this.bk = var1.ce(1048519467) * -491238108;
      } else if (var2 == 69) {
         var1.cy((short)-12257);
      } else if (1089109823 == var2) {
         this.by = var1.cg(1100163422) * 1525620164;
      } else if (var2 == -399996794) {
         this.br = var1.cg(-1326455394) * -419737029;
      } else if (var2 == 72) {
         this.bn = var1.cg(2073602918) * -1884165687;
      } else if (var2 == -1518276313) {
         this.bu = true;
      } else if (74 == var2) {
         this.bt = true;
      } else if (1227997474 == var2) {
         this.bs = var1.cy((short)-6963) * -412710629;
      } else if (77 != var2 && var2 != 92) {
         if (var2 == -121713943) {
            this.ba = var1.ce(1340643824) * 217194747;
            this.bw = var1.cy((short)-28973) * -234730010;
            this.bi = var1.cy((short)-1070) * -1403819426;
         } else if (var2 == 79) {
            this.bf = var1.ce(369776167) * -44605205;
            this.bg = var1.ce(105606269) * 1895100689;
            this.bw = var1.cy((short)-27306) * 1197838969;
            this.bi = var1.cy((short)-9965) * -1533175349;
            var3 = var1.cy((short)-10399);
            this.bl = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.bl[var4] = var1.ce(2025594873);
            }
         } else if (81 == var2) {
            var1.cy((short)-24584);
         } else if (var2 == -1550716981) {
            this.bx = var1.ce(1626372970) * -1476591469;
         } else if (-1023042013 == var2) {
            this.be = false;
         } else if (90 == var2) {
            this.cq = true;
         } else if (249 == var2) {
            this.cb = dr.ap(var1, this.cb, -1059084271);
         }
      } else {
         this.bo = var1.ce(242357115) * 699873396;
         if (65535 == this.bo * 1967830835) {
            this.bo = -937696251;
         }

         this.bd = var1.ce(907752348) * -1143916759;
         if (this.bd * -1062673319 == 65535) {
            this.bd = 669589493;
         }

         var3 = -1;
         if (92 == var2) {
            var3 = var1.ce(472863205);
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.cy((short)-26856);
         this.bm = new int[2 + var4];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.bm[var5] = var1.ce(860443749);
            if (this.bm[var5] == -637525843) {
               this.bm[var5] = -1;
            }
         }

         this.bm[var4 + 1] = var3;
      }

   }

   public final jv bc(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.au == null) {
         var7 = (long)((this.am * -1411859458 << 10) + var2);
      } else {
         var7 = (long)((146656432 * this.am << 10) + (var1 << 3) + var2);
      }

      Object var9 = (jv)ay.ap(var7);
      if (var9 == null) {
         jj var10 = this.au(var1, var2, (byte)76);
         if (null == var10) {
            return null;
         }

         if (!this.aq) {
            var9 = var10.bj(52778769 + this.bh * 1500642117, this.bj * 55862695 + 768, -50, 774329222, -50);
         } else {
            var10.bq = (short)(2050983591 * this.bh + 64);
            var10.bp = (short)(this.bj * 762069368 + 468758259);
            var10.al();
            var9 = var10;
         }

         ay.ak((tp)var9, var7);
      }

      if (this.aq) {
         var9 = ((jj)var9).as();
      }

      if (this.ax * -313616190 >= 0) {
         if (var9 instanceof jy) {
            var9 = ((jy)var9).aj(var3, var4, var5, var6, true, 192679957 * this.ax);
         } else if (var9 instanceof jj) {
            var9 = ((jj)var9).ae(var3, var4, var5, var6, true, 377832115 * this.ax);
         }
      }

      return (jv)var9;
   }

   public final jv by(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.au == null) {
         var7 = (long)((this.am * -1033915004 << 10) + var2);
      } else {
         var7 = (long)((1136045601 * this.am << 10) + (var1 << 3) + var2);
      }

      Object var9 = (jv)ay.ap(var7);
      if (var9 == null) {
         jj var10 = this.au(var1, var2, (byte)21);
         if (null == var10) {
            return null;
         }

         if (!this.aq) {
            var9 = var10.bj(64 + this.bh * 1500642117, this.bj * 55862695 + 768, -50, -1092441633, -50);
         } else {
            var10.bq = (short)(1500642117 * this.bh + -2070808936);
            var10.bp = (short)(this.bj * 536718404 + 527747980);
            var10.al();
            var9 = var10;
         }

         ay.ak((tp)var9, var7);
      }

      if (this.aq) {
         var9 = ((jj)var9).as();
      }

      if (this.ax * 377832115 >= 0) {
         if (var9 instanceof jy) {
            var9 = ((jy)var9).aj(var3, var4, var5, var6, true, -809143647 * this.ax);
         } else if (var9 instanceof jj) {
            var9 = ((jj)var9).ae(var3, var4, var5, var6, true, -1354488263 * this.ax);
         }
      }

      return (jv)var9;
   }

   public final jy br(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.au) {
         var7 = (long)(var2 + (this.am * 1597792305 << 10));
      } else {
         var7 = (long)(var2 + (1597792305 * this.am << 10) + (var1 << 3));
      }

      jy var9 = (jy)as.ap(var7);
      if (null == var9) {
         jj var10 = this.au(var1, var2, (byte)34);
         if (var10 == null) {
            return null;
         }

         var9 = var10.bj(this.bh * 1500642117 + 1902184046, 1973833425 + 55862695 * this.bj, -50, -10, -50);
         as.ak(var9, var7);
      }

      if (377832115 * this.ax >= 0) {
         var9 = var9.aj(var3, var4, var5, var6, true, 377832115 * this.ax);
      }

      return var9;
   }

   public final jy bn(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.au) {
         var7 = (long)(var2 + (this.am * 1573191097 << 10));
      } else {
         var7 = (long)(var2 + (-1346749023 * this.am << 10) + (var1 << 3));
      }

      jy var9 = (jy)as.ap(var7);
      if (null == var9) {
         jj var10 = this.au(var1, var2, (byte)53);
         if (var10 == null) {
            return null;
         }

         var9 = var10.bj(this.bh * 1182275911 + -1633645539, 731981143 + -1695312107 * this.bj, 1591959465, -11025206, -50);
         as.ak(var9, var7);
      }

      if (377832115 * this.ax >= 0) {
         var9 = var9.aj(var3, var4, var5, var6, true, 377832115 * this.ax);
      }

      return var9;
   }

   public final jy bu(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.au) {
         var7 = (long)(var2 + (this.am * 1597792305 << 10));
      } else {
         var7 = (long)(var2 + (1597792305 * this.am << 10) + (var1 << 3));
      }

      jy var9 = (jy)as.ap(var7);
      if (null == var9) {
         jj var10 = this.au(var1, var2, (byte)36);
         if (var10 == null) {
            return null;
         }

         var9 = var10.bj(this.bh * 1500642117 + 64, 768 + 55862695 * this.bj, -50, -10, -50);
         as.ak(var9, var7);
      }

      if (377832115 * this.ax >= 0) {
         var9 = var9.aj(var3, var4, var5, var6, true, 377832115 * this.ax);
      }

      return var9;
   }

   public final jy bt(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.au) {
         var7 = (long)(var2 + (this.am * 1597792305 << 10));
      } else {
         var7 = (long)(var2 + (1597792305 * this.am << 10) + (var1 << 3));
      }

      jy var9 = (jy)as.ap(var7);
      if (null == var9) {
         jj var10 = this.au(var1, var2, (byte)64);
         if (var10 == null) {
            return null;
         }

         var9 = var10.bj(this.bh * 663824062 + -875013655, 768 + -1521539579 * this.bj, 1726035232, 1119990301, -488299250);
         as.ak(var9, var7);
      }

      if (377832115 * this.ax >= 0) {
         var9 = var9.aj(var3, var4, var5, var6, true, -28292412 * this.ax);
      }

      return var9;
   }

   void aq(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-32552);
         if (var2 == 0) {
            return;
         }

         this.ai(var1, var2, (byte)34);
      }
   }

   public final jy at(int var1, int var2, int[][] var3, int var4, int var5, int var6, iu var7, int var8, int var9) {
      try {
         long var10;
         if (this.au == null) {
            if (var9 != 52686273) {
               throw new IllegalStateException();
            }

            var10 = (long)(var2 + (this.am * 1597792305 << 10));
         } else {
            var10 = (long)((var1 << 3) + (1597792305 * this.am << 10) + var2);
         }

         jy var12 = (jy)as.ap(var10);
         if (null == var12) {
            if (var9 != 52686273) {
               throw new IllegalStateException();
            }

            jj var13 = this.au(var1, var2, (byte)84);
            if (var13 == null) {
               if (var9 != 52686273) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var12 = var13.bj(1500642117 * this.bh + 64, 768 + this.bj * 55862695, -50, -10, -50);
            as.ak(var12, var10);
         }

         if (var7 == null) {
            if (var9 != 52686273) {
               throw new IllegalStateException();
            }

            if (-1 == 377832115 * this.ax) {
               if (var9 != 52686273) {
                  throw new IllegalStateException();
               }

               return var12;
            }
         }

         if (var7 != null) {
            if (var9 != 52686273) {
               throw new IllegalStateException();
            }

            var12 = var7.ay(var12, var8, var2, (byte)-29);
         } else {
            var12 = var12.ai(true);
         }

         if (377832115 * this.ax >= 0) {
            if (var9 != 52686273) {
               throw new IllegalStateException();
            }

            var12 = var12.aj(var3, var4, var5, var6, false, this.ax * 377832115);
         }

         return var12;
      } catch (RuntimeException var14) {
         throw tm.aw(var14, "ir.at(" + ')');
      }
   }

   public final jy bo(int var1, int var2, int[][] var3, int var4, int var5, int var6, iu var7, int var8) {
      long var9;
      if (this.au == null) {
         var9 = (long)(var2 + (this.am * 1597792305 << 10));
      } else {
         var9 = (long)((var1 << 3) + (1597792305 * this.am << 10) + var2);
      }

      jy var11 = (jy)as.ap(var9);
      if (null == var11) {
         jj var12 = this.au(var1, var2, (byte)54);
         if (var12 == null) {
            return null;
         }

         var11 = var12.bj(1500642117 * this.bh + 64, 768 + this.bj * 55862695, -50, -10, -50);
         as.ak(var11, var9);
      }

      if (var7 == null && -1 == 377832115 * this.ax) {
         return var11;
      } else {
         if (var7 != null) {
            var11 = var7.ay(var11, var8, var2, (byte)-115);
         } else {
            var11 = var11.ai(true);
         }

         if (377832115 * this.ax >= 0) {
            var11 = var11.aj(var3, var4, var5, var6, false, this.ax * 377832115);
         }

         return var11;
      }
   }

   void ac() {
      if (266535841 * this.av == -1) {
         this.av = 0;
         if (null != this.at && (null == this.au || this.au[0] == 10)) {
            this.av = -1118330783;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if (this.bv[var1] != null) {
               this.av = -91752171;
            }
         }
      }

      if (this.bs * 531867923 == -1) {
         this.bs = 889390343 * (this.ad * -2082621937 != 0 ? 1 : 0);
      }

   }

   final jj ba(int var1, int var2) {
      jj var3 = null;
      boolean var4;
      int var5;
      int var7;
      if (null == this.au) {
         if (var1 != 10) {
            return null;
         }

         if (this.at == null) {
            return null;
         }

         var4 = this.bb;
         if (2 == var1 && var2 > 3) {
            var4 = !var4;
         }

         var5 = this.at.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            var7 = this.at[var6];
            if (var4) {
               var7 += -1672718034;
            }

            var3 = (jj)ai.ap((long)var7);
            if (var3 == null) {
               var3 = jj.ap(di.ak, var7 & '\uffff', 0);
               if (var3 == null) {
                  return null;
               }

               if (var4) {
                  var3.ax();
               }

               ai.ak(var3, (long)var7);
            }

            if (var5 > 1) {
               ae[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new jj(ae, var5);
         }
      } else {
         int var8 = -1;

         for(var5 = 0; var5 < this.au.length; ++var5) {
            if (var1 == this.au[var5]) {
               var8 = var5;
               break;
            }
         }

         if (-1 == var8) {
            return null;
         }

         var5 = this.at[var8];
         boolean var9 = this.bb ^ var2 > 3;
         if (var9) {
            var5 += -456795333;
         }

         var3 = (jj)ai.ap((long)var5);
         if (var3 == null) {
            var3 = jj.ap(di.ak, var5 & '\uffff', 0);
            if (var3 == null) {
               return null;
            }

            if (var9) {
               var3.ax();
            }

            ai.ak(var3, (long)var5);
         }
      }

      if (this.bp * -356952836 == 1605021756 && this.bz * 898150424 == -1170200299 && 164693805 * this.bc == -1501243654) {
         var4 = false;
      } else {
         var4 = true;
      }

      boolean var10;
      if (597322899 * this.by == 0 && 0 == 13105500 * this.br && 0 == this.bn * 1372222673) {
         var10 = false;
      } else {
         var10 = true;
      }

      jj var11 = new jj(var3, var2 == 0 && !var4 && !var10, this.ao == null, null == this.ar, true);
      if (4 == var1 && var2 > 3) {
         var11.ag(1433724423);
         var11.ad(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var11.ar();
      } else if (var2 == 2) {
         var11.ab();
      } else if (var2 == 3) {
         var11.az();
      }

      if (this.ao != null) {
         for(var7 = 0; var7 < this.ao.length; ++var7) {
            var11.ac(this.ao[var7], this.af[var7]);
         }
      }

      if (null != this.ar) {
         for(var7 = 0; var7 < this.ar.length; ++var7) {
            var11.av(this.ar[var7], this.ab[var7]);
         }
      }

      if (var4) {
         var11.aq(-847429714 * this.bp, 2145271155 * this.bz, this.bc * -1406970629);
      }

      if (var10) {
         var11.ad(597322899 * this.by, 749753707 * this.br, 568623225 * this.bn);
      }

      return var11;
   }

   final jj bw(int var1, int var2) {
      jj var3 = null;
      boolean var4;
      int var5;
      int var7;
      if (null == this.au) {
         if (var1 != 10) {
            return null;
         }

         if (this.at == null) {
            return null;
         }

         var4 = this.bb;
         if (2 == var1 && var2 > 3) {
            var4 = !var4;
         }

         var5 = this.at.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            var7 = this.at[var6];
            if (var4) {
               var7 += 65536;
            }

            var3 = (jj)ai.ap((long)var7);
            if (var3 == null) {
               var3 = jj.ap(di.ak, var7 & 505358231, 0);
               if (var3 == null) {
                  return null;
               }

               if (var4) {
                  var3.ax();
               }

               ai.ak(var3, (long)var7);
            }

            if (var5 > 1) {
               ae[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new jj(ae, var5);
         }
      } else {
         int var8 = -1;

         for(var5 = 0; var5 < this.au.length; ++var5) {
            if (var1 == this.au[var5]) {
               var8 = var5;
               break;
            }
         }

         if (-1 == var8) {
            return null;
         }

         var5 = this.at[var8];
         boolean var9 = this.bb ^ var2 > 3;
         if (var9) {
            var5 += -1733784272;
         }

         var3 = (jj)ai.ap((long)var5);
         if (var3 == null) {
            var3 = jj.ap(di.ak, var5 & 33644178, 0);
            if (var3 == null) {
               return null;
            }

            if (var9) {
               var3.ax();
            }

            ai.ak(var3, (long)var5);
         }
      }

      if (this.bp * 366085634 == 128 && this.bz * 1184636798 == 1697496022 && -1406970629 * this.bc == 128) {
         var4 = false;
      } else {
         var4 = true;
      }

      boolean var10;
      if (1333042368 * this.by == 0 && 0 == 1241026693 * this.br && 0 == this.bn * 568623225) {
         var10 = false;
      } else {
         var10 = true;
      }

      jj var11 = new jj(var3, var2 == 0 && !var4 && !var10, this.ao == null, null == this.ar, true);
      if (4 == var1 && var2 > 3) {
         var11.ag(-1048301906);
         var11.ad(699776412, 0, -1325434368);
      }

      var2 &= 3;
      if (var2 == 1) {
         var11.ar();
      } else if (var2 == 2) {
         var11.ab();
      } else if (var2 == 3) {
         var11.az();
      }

      if (this.ao != null) {
         for(var7 = 0; var7 < this.ao.length; ++var7) {
            var11.ac(this.ao[var7], this.af[var7]);
         }
      }

      if (null != this.ar) {
         for(var7 = 0; var7 < this.ar.length; ++var7) {
            var11.av(this.ar[var7], this.ab[var7]);
         }
      }

      if (var4) {
         var11.aq(-2101128755 * this.bp, -1493600004 * this.bz, this.bc * 452643686);
      }

      if (var10) {
         var11.ad(-1400998841 * this.by, -336272812 * this.br, 568623225 * this.bn);
      }

      return var11;
   }

   public final ir bi() {
      int var1 = -1;
      if (-1 != this.bo * 1967830835) {
         var1 = dd.ap(-22082064 * this.bo, (byte)-13);
      } else if (-1062673319 * this.bd != -1) {
         var1 = nb.aj[this.bd * -962808];
      }

      int var2;
      if (var1 >= 0 && var1 < this.bm.length - 1) {
         var2 = this.bm[var1];
      } else {
         var2 = this.bm[this.bm.length - 1];
      }

      return var2 != -1 ? ei.aw(var2, 888461382) : null;
   }

   public final jv bz(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.au == null) {
         var7 = (long)((this.am * 1597792305 << 10) + var2);
      } else {
         var7 = (long)((24261824 * this.am << 10) + (var1 << 3) + var2);
      }

      Object var9 = (jv)ay.ap(var7);
      if (var9 == null) {
         jj var10 = this.au(var1, var2, (byte)122);
         if (null == var10) {
            return null;
         }

         if (!this.aq) {
            var9 = var10.bj(-631780805 + this.bh * -213347522, this.bj * 69565682 + 768, 1772804957, 242359996, 276201525);
         } else {
            var10.bq = (short)(846465469 * this.bh + -1737157557);
            var10.bp = (short)(this.bj * 572066974 + -1948755376);
            var10.al();
            var9 = var10;
         }

         ay.ak((tp)var9, var7);
      }

      if (this.aq) {
         var9 = ((jj)var9).as();
      }

      if (this.ax * 1076037329 >= 0) {
         if (var9 instanceof jy) {
            var9 = ((jy)var9).aj(var3, var4, var5, var6, true, 377832115 * this.ax);
         } else if (var9 instanceof jj) {
            var9 = ((jj)var9).ae(var3, var4, var5, var6, true, 377832115 * this.ax);
         }
      }

      return (jv)var9;
   }

   public int bg(int var1, int var2) {
      return ge.aw(this.cb, var1, var2, 1724223366);
   }

   public static ir ag(int var0) {
      ir var1 = (ir)aj.ap((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = gf.aw.bm(6, var0, 1496792249);
         var1 = new ir();
         var1.am = var0 * -1620641583;
         if (null != var2) {
            var1.aj(new vl(var2), (short)24197);
         }

         var1.ak(2051485693);
         if (var1.bt) {
            var1.ad = 0;
            var1.ac = false;
         }

         aj.ak(var1, (long)var0);
         return var1;
      }
   }

   public static void az(pe var0, pe var1, boolean var2) {
      gf.aw = var0;
      di.ak = var1;
      ap = var2;
   }

   public String cq(int var1, String var2) {
      return ly.ak(this.cb, var1, var2, -738599194);
   }

   void ak(int var1) {
      try {
         if (266535841 * this.av == -1) {
            if (var1 <= 1302167748) {
               return;
            }

            this.av = 0;
            if (null != this.at) {
               label67: {
                  if (null != this.au) {
                     if (var1 <= 1302167748) {
                        throw new IllegalStateException();
                     }

                     if (this.au[0] != 10) {
                        break label67;
                     }
                  }

                  this.av = -1118330783;
               }
            }

            for(int var2 = 0; var2 < 5; ++var2) {
               if (var1 <= 1302167748) {
                  throw new IllegalStateException();
               }

               if (this.bv[var2] != null) {
                  this.av = -1118330783;
               }
            }
         }

         if (this.bs * 531867923 == -1) {
            byte var10002;
            if (this.ad * -1552861337 != 0) {
               if (var1 <= 1302167748) {
                  return;
               }

               var10002 = 1;
            } else {
               var10002 = 0;
            }

            this.bs = -412710629 * var10002;
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ir.ak(" + ')');
      }
   }

   public static void cd() {
      aj.aj();
      ai.aj();
      ay.aj();
      as.aj();
   }

   public boolean ci() {
      if (null == this.bm) {
         return this.ba * -2038765005 != -1 || this.bl != null;
      } else {
         for(int var1 = 0; var1 < this.bm.length; ++var1) {
            if (this.bm[var1] != -1) {
               ir var2 = ei.aw(this.bm[var1], 888461382);
               if (var2.ba * -2038765005 != -1 || null != var2.bl) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   void bj(vl var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cy((short)-21670);
         if (var3 > 0) {
            if (null != this.at && !ap) {
               var1.am += 2118203047 * var3;
            } else {
               this.au = new int[var3];
               this.at = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.at[var4] = var1.ce(1971431671);
                  this.au[var4] = var1.cy((short)-17116);
               }
            }
         }
      } else if (2 == var2) {
         this.an = var1.cw(2091579758);
      } else if (5 == var2) {
         var3 = var1.cy((short)-30010);
         if (var3 > 0) {
            if (this.at != null && !ap) {
               var1.am += -1451176166 * var3;
            } else {
               this.au = null;
               this.at = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.at[var4] = var1.ce(857019771);
               }
            }
         }
      } else if (14 == var2) {
         this.az = var1.cy((short)-19353) * -400495937;
      } else if (var2 == 15) {
         this.ag = var1.cy((short)-31620) * 627274273;
      } else if (17 == var2) {
         this.ad = 0;
         this.ac = false;
      } else if (18 == var2) {
         this.ac = false;
      } else if (19 == var2) {
         this.av = var1.cy((short)-30589) * -1118330783;
      } else if (21 == var2) {
         this.ax = 0;
      } else if (22 == var2) {
         this.aq = true;
      } else if (var2 == 23) {
         this.al = true;
      } else if (var2 == 24) {
         this.aa = var1.ce(1915849156) * 324686009;
         if (1515763081 * this.aa == 65535) {
            this.aa = -324686009;
         }
      } else if (27 == var2) {
         this.ad = -611781545;
      } else if (28 == var2) {
         this.ah = var1.cy((short)-9545) * 1691145297;
      } else if (29 == var2) {
         this.bh = var1.cu((byte)13) * 1924292493;
      } else if (var2 == 39) {
         this.bj = var1.cu((byte)13) * 361014335;
      } else if (var2 >= 30 && var2 < 35) {
         this.bv[var2 - 30] = var1.cw(2113459051);
         if (this.bv[var2 - 30].equalsIgnoreCase(og.ay)) {
            this.bv[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.cy((short)-25899);
         this.ao = new short[var3];
         this.af = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ao[var4] = (short)var1.ce(608828158);
            this.af[var4] = (short)var1.ce(589611469);
         }
      } else if (41 == var2) {
         var3 = var1.cy((short)-4970);
         this.ar = new short[var3];
         this.ab = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ar[var4] = (short)var1.ce(1661806202);
            this.ab[var4] = (short)var1.ce(2063096870);
         }
      } else if (61 == var2) {
         var1.ce(747177442);
      } else if (var2 == 62) {
         this.bb = true;
      } else if (var2 == 64) {
         this.bq = false;
      } else if (var2 == 65) {
         this.bp = var1.ce(1706181223) * 1998717701;
      } else if (66 == var2) {
         this.bz = var1.ce(115322101) * 1591422907;
      } else if (var2 == 67) {
         this.bc = var1.ce(2011511167) * 1838257715;
      } else if (68 == var2) {
         this.bk = var1.ce(2084446186) * 469798057;
      } else if (var2 == 69) {
         var1.cy((short)-15236);
      } else if (70 == var2) {
         this.by = var1.cg(692697361) * -275017317;
      } else if (var2 == 71) {
         this.br = var1.cg(731231777) * -419737029;
      } else if (var2 == 72) {
         this.bn = var1.cg(-366734239) * -1884165687;
      } else if (var2 == 73) {
         this.bu = true;
      } else if (74 == var2) {
         this.bt = true;
      } else if (75 == var2) {
         this.bs = var1.cy((short)-1242) * -412710629;
      } else if (77 != var2 && var2 != 92) {
         if (var2 == 78) {
            this.ba = var1.ce(791284317) * 217194747;
            this.bw = var1.cy((short)-2306) * -1275948967;
            this.bi = var1.cy((short)-20844) * -1533175349;
         } else if (var2 == 79) {
            this.bf = var1.ce(149563886) * -1709145467;
            this.bg = var1.ce(653964772) * 1895100689;
            this.bw = var1.cy((short)-29464) * -1275948967;
            this.bi = var1.cy((short)-20677) * -1533175349;
            var3 = var1.cy((short)-12124);
            this.bl = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.bl[var4] = var1.ce(1519807236);
            }
         } else if (81 == var2) {
            var1.cy((short)-12388);
         } else if (var2 == 82) {
            this.bx = var1.ce(176069988) * -1476591469;
         } else if (89 == var2) {
            this.be = false;
         } else if (90 == var2) {
            this.cq = true;
         } else if (249 == var2) {
            this.cb = dr.ap(var1, this.cb, -188338787);
         }
      } else {
         this.bo = var1.ce(543394854) * 937696251;
         if (65535 == this.bo * 1967830835) {
            this.bo = -937696251;
         }

         this.bd = var1.ce(194988652) * 1703945193;
         if (this.bd * -1062673319 == 65535) {
            this.bd = -1703945193;
         }

         var3 = -1;
         if (92 == var2) {
            var3 = var1.ce(189716889);
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.cy((short)-23637);
         this.bm = new int[2 + var4];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.bm[var5] = var1.ce(159062582);
            if (this.bm[var5] == 65535) {
               this.bm[var5] = -1;
            }
         }

         this.bm[var4 + 1] = var3;
      }

   }

   public final boolean bq() {
      if (this.at == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.at.length; ++var2) {
            var1 &= di.ak.bd(this.at[var2] & '\uffff', 0, -2094056493);
         }

         return var1;
      }
   }

   public static he ap(int var0, int var1) {
      try {
         he var2 = (he)he.aw.ap((long)var0);
         if (null != var2) {
            if (var1 != -1700593888) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = he.ap.bm(8, var0, 914965134);
            var2 = new he();
            if (null != var3) {
               if (var1 != -1700593888) {
                  throw new IllegalStateException();
               }

               var2.aw(new vl(var3), 708582628);
            }

            he.aw.ak(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ir.ap(" + ')');
      }
   }
}
