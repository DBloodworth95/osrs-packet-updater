import java.util.BitSet;

public class ji extends jv {
   kf[] br;
   public static boolean aw = false;
   public int ak;
   static final int ar = 25;
   int ai;
   int bp;
   int cb;
   int db;
   int am = 0;
   int at = 0;
   kf[] au = new kf[5000];
   int[][][] an;
   static final int ao = 128;
   int cc;
   int dt;
   static final int ab = 90;
   jo[][] cq;
   int ag = 0;
   im ad;
   int ac;
   int av;
   int ax;
   public int aq;
   int bb;
   int aa;
   int ah;
   int bh;
   int bj;
   int bv;
   int bx;
   int bk;
   int dm;
   int bq;
   public int ba;
   int bz;
   int bc;
   int by;
   int[][][] as;
   static final int bg = 128;
   int ay;
   int bt;
   int bs;
   final int dc;
   int bo;
   static final int az = 50;
   public static final int cx = 9;
   public int bw;
   boolean bi;
   static final int bf = 32;
   public float bd;
   static final int af = 64;
   int[] be;
   static final int[] cy = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
   final int ck;
   jo[] cd;
   pu ci;
   static final int[] cn = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   static final int[] co = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   static final int[] cf = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
   static final int[] cl = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
   static final int[] cp = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
   static final int[] cv = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
   final int df;
   public static final int cu = 128;
   public static final int ce = 383;
   public static final int cg = 32;
   int bm;
   int[][] cz;
   int[][] ch;
   int[] ct;
   BitSet cs;
   int cj;
   int cm;
   int cw;
   final int ca;
   final int dh;
   BitSet cr;
   int aj;
   final int dq;
   final int dd;
   BitSet dr;
   BitSet da;
   jw[][][] ae;
   final int ap;
   final int dg;
   int bu;
   int du;
   int dk;
   int dl;
   boolean bn;
   int al;
   int dx;
   int ds;
   int bl;

   boolean bf(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.dh + var3 * this.dg + var4 * this.df + var5);
   }

   public void ap() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.aj; ++var1) {
         for(var2 = 0; var2 < this.ai; ++var2) {
            for(int var3 = 0; var3 < this.ay; ++var3) {
               this.ae[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < this.bl; ++var1) {
         for(var2 = 0; var2 < this.be[var1]; ++var2) {
            this.cq[var1][var2] = null;
         }

         this.be[var1] = 0;
      }

      for(var1 = 0; var1 < this.at; ++var1) {
         this.au[var1] = null;
      }

      this.at = 0;

      for(var1 = 0; var1 < this.br.length; ++var1) {
         this.br[var1] = null;
      }

   }

   public void aw(int var1) {
      this.am = var1;

      for(int var2 = 0; var2 < this.ai; ++var2) {
         for(int var3 = 0; var3 < this.ay; ++var3) {
            if (this.ae[var1][var2][var3] == null) {
               this.ae[var1][var2][var3] = new jw(var1, var2, var3);
            }
         }
      }

   }

   public void ei(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         var4.ae = null;
      }
   }

   public void aj(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      jo var9 = new jo();
      var9.ap = var3 / 128 * 997437779;
      var9.aw = var4 / 128 * 856639217;
      var9.ak = var5 / 128 * 403308667;
      var9.aj = var6 / 128 * -1607499271;
      var9.ai = var2 * 1598209571;
      var9.ay = var3 * -281644085;
      var9.as = var4 * 28997001;
      var9.ae = var5 * 1205278383;
      var9.am = var6 * -1138092401;
      var9.at = var7 * 1219505051;
      var9.au = var8 * -1227230747;
      this.cq[var1][this.be[var1]++] = var9;
   }

   public void ai(int var1, int var2, int var3, int var4) {
      jw var5 = this.ae[var1][var2][var3];
      if (var5 != null) {
         this.ae[var1][var2][var3].ar = var4 * 426055295;
      }
   }

   public void ia(boolean var1) {
      if (!this.cy() || var1) {
         this.bn = true;
         this.bi = var1;
         this.ba = -1;
         this.bw = -1;
      }
   }

   public void as(int var1, int var2, int var3, int var4, jv var5, long var6, int var8) {
      if (var5 != null) {
         jd var9 = new jd();
         var9.aj = var5;
         var9.aw = var2 * 1350693504 + 675346752;
         var9.ak = var3 * 1267240064 + 633620032;
         var9.ap = var4 * 1792325245;
         var9.ai = var6 * -4159210934178270429L;
         var9.ay = var8 * -451409015;
         if (this.ae[var1][var2][var3] == null) {
            this.ae[var1][var2][var3] = new jw(var1, var2, var3);
         }

         this.ae[var1][var2][var3].am = var9;
      }
   }

   public void ae(int var1, int var2, int var3, int var4, jv var5, long var6, jv var8, jv var9) {
      is var10 = new is();
      var10.aj = var5;
      var10.aw = var2 * 1646502016 + 823251008;
      var10.ak = var3 * -1654411648 + -827205824;
      var10.ap = var4 * 649724197;
      var10.as = var6 * 7230106010689641531L;
      var10.ai = var8;
      var10.ay = var9;
      int var11 = 0;
      jw var12 = this.ae[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.au * 2050644103; ++var13) {
            if ((var12.an[var13].af * -1681160537 & 256) == 256 && var12.an[var13].ai instanceof jy) {
               jy var14 = (jy)var12.an[var13].ai;
               var14.am();
               if (var14.ez * -274986519 > var11) {
                  var11 = var14.ez * -274986519;
               }
            }
         }
      }

      var10.ae = var11 * -1725935311;
      if (this.ae[var1][var2][var3] == null) {
         this.ae[var1][var2][var3] = new jw(var1, var2, var3);
      }

      this.ae[var1][var2][var3].at = var10;
   }

   public void ee(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         var4.am = null;
      }
   }

   public void at(int var1, int var2, int var3, int var4, jv var5, jv var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         ku var14 = new ku();
         var14.at = var11 * -6122995212202842357L;
         var14.au = var13 * -39751723;
         var14.aw = var2 * -772798336 + -386399168;
         var14.ak = var3 * -429474688 + 1932746304;
         var14.ap = var4 * -834451365;
         var14.ae = var5;
         var14.am = var6;
         var14.aj = var7 * -1653803049;
         var14.ai = var8 * 428692467;
         var14.ay = var9 * 1249052821;
         var14.as = var10 * -452377629;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.ae[var15][var2][var3] == null) {
               this.ae[var15][var2][var3] = new jw(var15, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ae = var14;
      }
   }

   public void gv(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      jw var7 = this.ae[var4][var5][var6];
      if (var7 != null) {
         jp var8 = var7.ai;
         int var10;
         if (var8 != null) {
            int var18 = var8.as * 1197868651;
            if (var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            js var9 = var7.ay;
            if (var9 != null) {
               var10 = var9.an;
               int var11 = var9.ao;
               int var12 = var9.af;
               int var13 = var9.ar;
               int[] var14 = this.cz[var10];
               int[] var15 = this.ch[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   public boolean ar(int var1, int var2, int var3, int var4, int var5, jv var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.az(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public boolean ab(int var1, int var2, int var3, int var4, int var5, jv var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.az(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   boolean az(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, jv var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.ai || var16 >= this.ay) {
               return false;
            }

            jw var17 = this.ae[var1][var15][var16];
            if (var17 != null && var17.au * 2050644103 >= 5) {
               return false;
            }
         }
      }

      kf var21 = new kf();
      var21.ao = var12 * 8393232564355652341L;
      var21.af = var14 * 1737867543;
      var21.ap = var1 * -1033025699;
      var21.ak = var6 * 1069485131;
      var21.aj = var7 * -1774765273;
      var21.aw = var8 * 1444682335;
      var21.ai = var9;
      var21.ay = var10 * -982896255;
      var21.as = var2 * -2075871637;
      var21.am = var3 * -1767415897;
      var21.ae = (var2 + var4 - 1) * -1805772395;
      var21.at = (var3 + var5 - 1) * -988023995;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var22 > var3) {
               var18 += 8;
            }

            if (var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.ae[var19][var16][var22] == null) {
                  this.ae[var19][var16][var22] = new jw(var19, var16, var22);
               }
            }

            jw var23 = this.ae[var1][var16][var22];
            var23.an[var23.au * 2050644103] = var21;
            var23.ao[var23.au * 2050644103] = var18;
            var23.af = (var23.af * -1999985463 | var18) * 218543481;
            var23.au += 888073527;
         }
      }

      if (var11) {
         this.au[this.at++] = var21;
      }

      return true;
   }

   public void ag() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         kf var2 = this.au[var1];
         this.ad(var2);
         this.au[var1] = null;
      }

      this.at = 0;
   }

   public void eo(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.au * 2050644103; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = var6.ao * -4002139674731118243L;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * 1663649347 == var2 && var6.am * -1679599593 == var3) {
               this.ad(var6);
               return;
            }
         }

      }
   }

   public void ac(int var1, int var2, int var3, int var4) {
      jw var5 = this.ae[var1][var2][var3];
      if (var5 != null) {
         ku var6 = var5.ae;
         if (var6 != null) {
            var6.ay = var6.ay * 454787773 * var4 / 16 * 1249052821;
            var6.as = var6.as * 1489115595 * var4 / 16 * -452377629;
         }
      }
   }

   public void av(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         var4.as = null;
      }
   }

   boolean jx(int var1, int var2, int var3) {
      int var4 = this.an[var1][var2][var3];
      if (var4 == -this.al) {
         return false;
      } else if (var4 == this.al) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.cs(var5 + 1, this.as[var1][var2][var3], var6 + 1) && this.cs(var5 + -1074696960 - 1, this.as[var1][var2 + 1][var3], var6 + 1) && this.cs(var5 + 128 - 1, this.as[var1][var2 + 1][var3 + 1], var6 + 1937620045 - 1) && this.cs(var5 + 1, this.as[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.an[var1][var2][var3] = this.al;
            return true;
         } else {
            this.an[var1][var2][var3] = -this.al;
            return false;
         }
      }
   }

   public void aq(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.au * 2050644103; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = var6.ao * -4002139674731118243L;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * 1663649347 == var2 && var6.am * -1679599593 == var3) {
               this.ad(var6);
               return;
            }
         }

      }
   }

   public void al(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         var4.am = null;
      }
   }

   public boolean ey(int var1, int var2, int var3, int var4, int var5, jv var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.az(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   public void gg(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      jw var7 = this.ae[var4][var5][var6];
      if (var7 != null) {
         jp var8 = var7.ai;
         int var10;
         if (var8 != null) {
            int var18 = var8.as * 1197868651;
            if (var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            js var9 = var7.ay;
            if (var9 != null) {
               var10 = var9.an;
               int var11 = var9.ao;
               int var12 = var9.af;
               int var13 = var9.ar;
               int[] var14 = this.cz[var10];
               int[] var15 = this.ch[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   public long fb(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 != null && var4.ae != null ? var4.ae.at * 7961066021200506019L : 0L;
   }

   public void eb(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.au * 2050644103; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = var6.ao * -4002139674731118243L;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * 1663649347 == var2 && var6.am * -1105046258 == var3) {
               this.ad(var6);
               return;
            }
         }

      }
   }

   public jd bv(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 != null && var4.am != null ? var4.am : null;
   }

   public void ej(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         var4.as = null;
      }
   }

   public long bk(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 != null && var4.ae != null ? var4.ae.at * 7961066021200506019L : 0L;
   }

   public boolean dz(int var1, int var2, int var3, int var4, int var5, int var6, jv var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * -1349564351 + 64 * var5;
         int var13 = var3 * 128 + -213718999 * var6;
         return this.az(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public long bq(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 != null && var4.am != null ? var4.am.ai * -3473567591769140085L : 0L;
   }

   public void dl(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      jp var21;
      int var22;
      if (var4 == 0) {
         var21 = new jp(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ae[var22][var2][var3] == null) {
               this.ae[var22][var2][var3] = new jw(var22, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ai = var21;
      } else if (var4 != 1) {
         js var23 = new js(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ae[var22][var2][var3] == null) {
               this.ae[var22][var2][var3] = new jw(var22, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ay = var23;
      } else {
         var21 = new jp(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ae[var22][var2][var3] == null) {
               this.ae[var22][var2][var3] = new jw(var22, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ai = var21;
      }
   }

   public void bz(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aj; ++var4) {
         for(int var5 = 0; var5 < this.ai; ++var5) {
            for(int var6 = 0; var6 < this.ay; ++var6) {
               jw var7 = this.ae[var4][var5][var6];
               if (var7 != null) {
                  ka var8 = var7.as;
                  jj var10;
                  if (var8 != null && var8.ay instanceof jj) {
                     jj var9 = (jj)var8.ay;
                     this.by(var9, var4, var5, var6, 1, 1);
                     if (var8.as instanceof jj) {
                        var10 = (jj)var8.as;
                        this.by(var10, var4, var5, var6, 1, 1);
                        jj.bh(var9, var10, 0, 0, 0, false);
                        var8.as = var10.bj(var10.bq, var10.bp, var1, var2, var3);
                     }

                     var8.ay = var9.bj(var9.bq, var9.bp, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.au * 2050644103; ++var12) {
                     kf var14 = var7.an[var12];
                     if (var14 != null && var14.ai instanceof jj) {
                        jj var11 = (jj)var14.ai;
                        this.by(var11, var4, var5, var6, var14.ae * -1650103875 - var14.as * 1663649347 + 1, var14.at * -1772771443 - var14.am * -1679599593 + 1);
                        var14.ai = var11.bj(var11.bq, var11.bp, var1, var2, var3);
                     }
                  }

                  jd var13 = var7.am;
                  if (var13 != null && var13.aj instanceof jj) {
                     var10 = (jj)var13.aj;
                     this.bc(var10, var4, var5, var6);
                     var13.aj = var10.bj(var10.bq, var10.bp, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   public void dj(int var1, int var2, int var3, int var4, jv var5, long var6, jv var8, jv var9) {
      is var10 = new is();
      var10.aj = var5;
      var10.aw = var2 * 1646502016 + -1209704213;
      var10.ak = var3 * -1654411648 + -608346065;
      var10.ap = var4 * 649724197;
      var10.as = var6 * 7230106010689641531L;
      var10.ai = var8;
      var10.ay = var9;
      int var11 = 0;
      jw var12 = this.ae[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.au * 876989610; ++var13) {
            if ((var12.an[var13].af * -1681160537 & 256) == 256 && var12.an[var13].ai instanceof jy) {
               jy var14 = (jy)var12.an[var13].ai;
               var14.am();
               if (var14.ez * -274986519 > var11) {
                  var11 = var14.ez * -274986519;
               }
            }
         }
      }

      var10.ae = var11 * -1725935311;
      if (this.ae[var1][var2][var3] == null) {
         this.ae[var1][var2][var3] = new jw(var1, var2, var3);
      }

      this.ae[var1][var2][var3].at = var10;
   }

   void by(jj var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.aj) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.ai) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.ay && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        jw var15 = this.ae[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = this.br(var12, var13, var14, var2, var3, var4);
                           ka var17 = var15.as;
                           if (var17 != null) {
                              jj var18;
                              if (var17.ay instanceof jj) {
                                 var18 = (jj)var17.ay;
                                 jj.bh(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.as instanceof jj) {
                                 var18 = (jj)var17.as;
                                 jj.bh(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.au * 2050644103; ++var23) {
                              kf var19 = var15.an[var23];
                              if (var19 != null && var19.ai instanceof jj) {
                                 jj var20 = (jj)var19.ai;
                                 int var21 = var19.ae * -1650103875 - var19.as * 1663649347 + 1;
                                 int var22 = var19.at * -1772771443 - var19.am * -1679599593 + 1;
                                 jj.bh(var1, var20, (var19.as * 1663649347 - var3) * 128 + (var21 - var5) * 64, var16, (var19.am * -1679599593 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   public void iz() {
      this.ba = -1;
      this.bi = false;
   }

   int bn(int var1, int var2, int var3) {
      return (this.as[var1][var2][var3] + this.as[var1][var2 + 1][var3] + this.as[var1][var2][var3 + 1] + this.as[var1][var2 + 1][var3 + 1]) / 4;
   }

   public void dw(int var1, int var2, int var3, int var4, jv var5, jv var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         ku var14 = new ku();
         var14.at = var11 * -6122995212202842357L;
         var14.au = var13 * -39751723;
         var14.aw = var2 * -772798336 + -386399168;
         var14.ak = var3 * -429474688 + 1932746304;
         var14.ap = var4 * -834451365;
         var14.ae = var5;
         var14.am = var6;
         var14.aj = var7 * -1653803049;
         var14.ai = var8 * 428692467;
         var14.ay = var9 * 1249052821;
         var14.as = var10 * -452377629;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.ae[var15][var2][var3] == null) {
               this.ae[var15][var2][var3] = new jw(var15, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ae = var14;
      }
   }

   public void bt(int var1) {
      this.ag = lb.ae(25, 90, var1, -827524013);
      jl.an(this.ag);
      if (this.ct != null && this.ct.length > 0) {
         this.cd(this.ct, this.cc, this.cj, this.cm, this.cw);
      }

   }

   public boolean ek(int var1, int var2, int var3, int var4, int var5, jv var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.az(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   boolean bm(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.ck + var3 * this.dq + var4 * this.dd + var5);
   }

   boolean bo(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.ck + var3 * this.dq + var4 * this.dd + var5, var6);
      return var6;
   }

   boolean bd(int var1, int var2, int var3, int var4) {
      return this.bm(this.cs, var1, var2, var3, var4);
   }

   boolean ba(int var1, int var2, int var3, int var4, boolean var5) {
      return this.bo(this.cs, var1, var2, var3, var4, var5);
   }

   boolean bw(int var1, int var2, int var3, int var4) {
      return this.bm(this.cr, var1, var2, var3, var4);
   }

   boolean bi(int var1, int var2, int var3, int var4, boolean var5) {
      return this.bo(this.cr, var1, var2, var3, var4, var5);
   }

   boolean hq(int var1, int var2, int var3, int var4) {
      return this.bm(this.cs, var1, var2, var3, var4);
   }

   void gn(jj var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.aj) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.ai) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.ay && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        jw var15 = this.ae[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = this.br(var12, var13, var14, var2, var3, var4);
                           ka var17 = var15.as;
                           if (var17 != null) {
                              jj var18;
                              if (var17.ay instanceof jj) {
                                 var18 = (jj)var17.ay;
                                 jj.bh(var1, var18, (var13 - var3) * 128 + (1 - var5) * 1301748735, var16, (var14 - var4) * -1093789692 + (1 - var6) * 64, var7);
                              }

                              if (var17.as instanceof jj) {
                                 var18 = (jj)var17.as;
                                 jj.bh(var1, var18, (var13 - var3) * 128 + (1 - var5) * 1515204368, var16, (var14 - var4) * 1455545172 + (1 - var6) * -451360433, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.au * 2050644103; ++var23) {
                              kf var19 = var15.an[var23];
                              if (var19 != null && var19.ai instanceof jj) {
                                 jj var20 = (jj)var19.ai;
                                 int var21 = var19.ae * -1650103875 - var19.as * 2041547238 + 1;
                                 int var22 = var19.at * -342749147 - var19.am * -1679599593 + 1;
                                 jj.bh(var1, var20, (var19.as * 1841937723 - var3) * -382710311 + (var21 - var5) * -1429320385, var16, (var19.am * -1679599593 - var4) * 128 + (var22 - var6) * -1059113293, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   boolean bl(int var1, int var2, int var3, int var4) {
      return this.bf(this.da, var1, var2, var3, var4);
   }

   boolean be(int var1, int var2, int var3, int var4, boolean var5) {
      return this.bg(this.da, var1, var2, var3, var4, var5);
   }

   boolean cq(int var1, int var2, int var3, int var4) {
      return this.bf(this.dr, var1, var2, var3, var4);
   }

   public boolean di(int var1, int var2, int var3, int var4, int var5, int var6, jv var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + 64 * var5;
         int var13 = var3 * 128 + 64 * var6;
         return this.az(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public void dm(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      jp var21;
      int var22;
      if (var4 == 0) {
         var21 = new jp(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ae[var22][var2][var3] == null) {
               this.ae[var22][var2][var3] = new jw(var22, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ai = var21;
      } else if (var4 != 1) {
         js var23 = new js(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ae[var22][var2][var3] == null) {
               this.ae[var22][var2][var3] = new jw(var22, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ay = var23;
      } else {
         var21 = new jp(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ae[var22][var2][var3] == null) {
               this.ae[var22][var2][var3] = new jw(var22, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ai = var21;
      }
   }

   void ci(int var1, int var2) {
      this.du = var1;
      this.dk = var2;
   }

   boolean cn(int var1, int var2) {
      if (!this.bw(this.du, this.dk, var1, var2)) {
         return this.bd(this.du, this.dk, var1, var2);
      } else {
         this.bi(this.du, this.dk, var1, var2, false);
         boolean var3 = false;

         for(int var4 = -1; var4 <= 1; ++var4) {
            for(int var5 = -1; var5 <= 1; ++var5) {
               if (this.co(this.du, this.dk, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.co(this.du, (this.dk + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.co(this.du + 1, this.dk, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.co(this.du + 1, (this.dk + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return this.ba(this.du, this.dk, var1, var2, var3);
      }
   }

   boolean co(int var1, int var2, int var3, int var4) {
      if (!this.cq(var1, var2, var3, var4)) {
         return this.bl(var1, var2, var3, var4);
      } else {
         this.cb(var1, var2, var3, var4, false);
         int var5 = var1 * 32 + 128;
         int var6 = var2 * 64;
         int var7 = (var3 - this.ag - this.ac - 1) * 128;
         int var8 = (var4 - this.ag - this.av - 1) * 128;

         for(int var9 = -this.cc; var9 <= this.cj; var9 += 128) {
            if (this.cf(var7, this.ct[var1] + var9, var8, var5, var6)) {
               return this.be(var1, var2, var3, var4, true);
            }
         }

         return this.be(var1, var2, var3, var4, false);
      }
   }

   boolean cf(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = jm.aj;
      int[] var7 = jm.ai;
      int var8 = var6[var4];
      int var9 = var7[var4];
      int var10 = var6[var5];
      int var11 = var7[var5];
      int var12 = var3 * var10 + var1 * var11 >> 16;
      int var13 = var3 * var11 - var1 * var10 >> 16;
      int var14 = var2 * var8 + var13 * var9 >> 16;
      int var15 = var2 * var9 - var13 * var8 >> 16;
      if (var14 >= 50 && var14 <= jl.at()) {
         int var16 = this.dl + var12 * 128 / var14;
         int var17 = this.dm + var15 * 128 / var14;
         return var16 >= this.dt && var16 <= this.ds && var17 >= this.dx && var17 <= this.db;
      } else {
         return false;
      }
   }

   public void cv() {
      this.bi = true;
   }

   public void cp(int var1, int var2, int var3) {
      this.bu = var1;
      this.bt = var2;
      this.bs = var3;
   }

   public void bs(im var1) {
      if (var1 != this.ad) {
         this.ad = var1;
         this.cd(this.ct, this.cc, this.cj, this.cm, this.cw);
      }

   }

   public boolean cy() {
      return this.bi && this.ba != -1;
   }

   void cu() {
      if (this.bn) {
         this.bn = false;
         this.ba = this.bm;
         this.bw = this.bo;
      }

   }

   boolean gt(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.ck + var3 * this.dq + var4 * this.dd + var5);
   }

   void fy(jj var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.ai) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.ay && (var9 >= var6 || var10 >= var8)) {
                  jw var11 = this.ae[var2][var9][var10];
                  if (var11 != null && var11.am != null && var11.am.aj instanceof jj) {
                     int var12 = this.br(var2, var9, var10, var2, var3, var4);
                     jj var13 = (jj)var11.am.aj;
                     jj.bh(var1, var13, (var9 - var3) * -1635677668, var12, (var10 - var4) * 2035082606, true);
                  }
               }
            }
         }
      }

   }

   void cx(jz var1, boolean var2) {
      ++this.al;
      this.bm = -1;
      this.bo = -1;
      this.bd = -1.0F;
      boolean var3 = this.ap == -1;
      this.bc = !var2 && this.ad != im.ap ? this.bp : this.bb;
      this.by = !var2 && this.ad != im.ap ? this.bz : this.bq;
      if (var3) {
         this.aa = this.bc - this.ag;
         if (this.aa < 0) {
            this.aa = 0;
         }

         this.bh = this.by - this.ag;
         if (this.bh < 0) {
            this.bh = 0;
         }

         this.ah = this.bc + this.ag;
         if (this.ah > this.ai) {
            this.ah = this.ai;
         }

         this.bj = this.by + this.ag;
         if (this.bj > this.ay) {
            this.bj = this.ay;
         }
      } else {
         this.aa = 0;
         this.bh = 0;
         this.ah = this.ai;
         this.bj = this.ay;
         this.bc = this.ai / 2;
         this.by = this.ay / 2;
         this.ag = Math.max(this.bc, this.by);
      }

      this.ac = this.bb - this.bc;
      this.av = this.bq - this.by;
      if (var3) {
         this.cc();
      }

      this.ax = 0;

      int var4;
      int var6;
      for(var4 = this.am; var4 < this.aj; ++var4) {
         jw[][] var5 = this.ae[var4];

         for(var6 = this.aa; var6 < this.ah; ++var6) {
            for(int var7 = this.bh; var7 < this.bj; ++var7) {
               jw var8 = var5[var6][var7];
               if (var8 != null) {
                  if (var8.ar * -721376897 <= this.aq && (!var3 || this.cn(var6 - this.bb + this.ac + this.ag, var7 - this.bq + this.av + this.ag) || this.as[var4][var6][var7] - this.bx >= 2000)) {
                     var8.ab = true;
                     var8.az = true;
                     if (var8.au * 2050644103 > 0) {
                        var8.ag = true;
                     } else {
                        var8.ag = false;
                     }

                     ++this.ax;
                  } else {
                     var8.ab = false;
                     var8.az = false;
                     var8.ad = 0;
                  }
               }
            }
         }
      }

      var4 = Math.abs(this.ac);
      int var15 = Math.abs(this.av);

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      jw var14;
      jw[][] var16;
      int var17;
      for(var6 = this.am; var6 < this.aj; ++var6) {
         var16 = this.ae[var6];

         for(var17 = -(this.ag + var4); var17 <= 0; ++var17) {
            var9 = this.bb + var17;
            var10 = this.bb - var17;
            if (var9 >= this.aa || var10 < this.ah) {
               for(var11 = -(this.ag + var15); var11 <= 0; ++var11) {
                  var12 = this.bq + var11;
                  var13 = this.bq - var11;
                  if (var9 >= this.aa && var9 < this.ah) {
                     if (var12 >= this.bh && var12 < this.bj) {
                        var14 = var16[var9][var12];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, true);
                        }
                     }

                     if (var13 >= this.bh && var13 < this.bj) {
                        var14 = var16[var9][var13];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, true);
                        }
                     }
                  }

                  if (var10 >= this.aa && var10 < this.ah) {
                     if (var12 >= this.bh && var12 < this.bj) {
                        var14 = var16[var10][var12];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, true);
                        }
                     }

                     if (var13 >= this.bh && var13 < this.bj) {
                        var14 = var16[var10][var13];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, true);
                        }
                     }
                  }

                  if (this.ax == 0) {
                     this.cu();
                     return;
                  }
               }
            }
         }
      }

      for(var6 = this.am; var6 < this.aj; ++var6) {
         var16 = this.ae[var6];

         for(var17 = -(this.ag + var4); var17 <= 0; ++var17) {
            var9 = this.bc + var17;
            var10 = this.bc - var17;
            if (var9 >= this.aa || var10 < this.ah) {
               for(var11 = -(this.ag + var15); var11 <= 0; ++var11) {
                  var12 = this.by + var11;
                  var13 = this.by - var11;
                  if (var9 >= this.aa && var9 < this.ah) {
                     if (var12 >= this.bh && var12 < this.bj) {
                        var14 = var16[var9][var12];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, false);
                        }
                     }

                     if (var13 >= this.bh && var13 < this.bj) {
                        var14 = var16[var9][var13];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, false);
                        }
                     }
                  }

                  if (var10 >= this.aa && var10 < this.ah) {
                     if (var12 >= this.bh && var12 < this.bj) {
                        var14 = var16[var10][var12];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, false);
                        }
                     }

                     if (var13 >= this.bh && var13 < this.bj) {
                        var14 = var16[var10][var13];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, false);
                        }
                     }
                  }

                  if (this.ax == 0) {
                     this.cu();
                     return;
                  }
               }
            }
         }
      }

      this.cu();
   }

   boolean hg(int var1, int var2, int var3, int var4, boolean var5) {
      return this.bg(this.dr, var1, var2, var3, var4, var5);
   }

   static final int ch(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   static boolean ct(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }

   void cc() {
      int var1 = this.be[this.aq];
      jo[] var2 = this.cq[this.aq];
      this.cb = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         jo var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.ai * 2132992395 == 1) {
            var5 = var4.ap * -1158956325 - this.bb + this.ag;
            if (var5 >= 0 && var5 <= this.ag + this.ag) {
               var6 = var4.ak * -1483350349 - this.bq + this.ag;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.aj * 1276080201 - this.bq + this.ag;
               if (var7 > this.ag + this.ag) {
                  var7 = this.ag + this.ag;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cn(var5, var6++)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bv - var4.ay * -467035677;
                  if (var9 > 32) {
                     var4.an = -925954819;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.an = -1851909638;
                     var9 = -var9;
                  }

                  var4.ar = (var4.ae * -1654652849 - this.bk << 8) / var9 * -1820467529;
                  var4.ab = (var4.am * 706234479 - this.bk << 8) / var9 * -867750803;
                  var4.az = (var4.at * 1054556819 - this.bx << 8) / var9 * -798617017;
                  var4.ag = (var4.au * -2080775187 - this.bx << 8) / var9 * 1095373565;
                  this.cd[this.cb++] = var4;
               }
            }
         } else if (var4.ai * 2132992395 == 2) {
            var5 = var4.ak * -1483350349 - this.bq + this.ag;
            if (var5 >= 0 && var5 <= this.ag + this.ag) {
               var6 = var4.ap * -1158956325 - this.bb + this.ag;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.aw * -547034607 - this.bb + this.ag;
               if (var7 > this.ag + this.ag) {
                  var7 = this.ag + this.ag;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cn(var6++, var5)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bk - var4.ae * -1654652849;
                  if (var9 > 32) {
                     var4.an = 1517102839;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.an = 591148020;
                     var9 = -var9;
                  }

                  var4.ao = (var4.ay * -467035677 - this.bv << 8) / var9 * -637152413;
                  var4.af = (var4.as * -939224903 - this.bv << 8) / var9 * -1824101959;
                  var4.az = (var4.at * 1054556819 - this.bx << 8) / var9 * -798617017;
                  var4.ag = (var4.au * -2080775187 - this.bx << 8) / var9 * 1095373565;
                  this.cd[this.cb++] = var4;
               }
            }
         } else if (var4.ai * 2132992395 == 4) {
            var5 = var4.at * 1054556819 - this.bx;
            if (var5 > 128) {
               var6 = var4.ak * -1483350349 - this.bq + this.ag;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.aj * 1276080201 - this.bq + this.ag;
               if (var7 > this.ag + this.ag) {
                  var7 = this.ag + this.ag;
               }

               if (var6 <= var7) {
                  int var8 = var4.ap * -1158956325 - this.bb + this.ag;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.aw * -547034607 - this.bb + this.ag;
                  if (var9 > this.ag + this.ag) {
                     var9 = this.ag + this.ag;
                  }

                  boolean var10 = false;

                  label194:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (this.cn(var11, var12)) {
                           var10 = true;
                           break label194;
                        }
                     }
                  }

                  if (var10) {
                     var4.an = -334806799;
                     var4.ao = (var4.ay * -467035677 - this.bv << 8) / var5 * -637152413;
                     var4.af = (var4.as * -939224903 - this.bv << 8) / var5 * -1824101959;
                     var4.ar = (var4.ae * -1654652849 - this.bk << 8) / var5 * -1820467529;
                     var4.ab = (var4.am * 706234479 - this.bk << 8) / var5 * -867750803;
                     this.cd[this.cb++] = var4;
                  }
               }
            }
         }
      }

   }

   boolean cj(int var1, int var2, int var3) {
      int var4 = this.an[var1][var2][var3];
      if (var4 == -this.al) {
         return false;
      } else if (var4 == this.al) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.cs(var5 + 1, this.as[var1][var2][var3], var6 + 1) && this.cs(var5 + 128 - 1, this.as[var1][var2 + 1][var3], var6 + 1) && this.cs(var5 + 128 - 1, this.as[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.cs(var5 + 1, this.as[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.an[var1][var2][var3] = this.al;
            return true;
         } else {
            this.an[var1][var2][var3] = -this.al;
            return false;
         }
      }
   }

   public void aa(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         var4.at = null;
      }
   }

   void jw() {
      int var1 = this.be[this.aq];
      jo[] var2 = this.cq[this.aq];
      this.cb = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         jo var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.ai * 2132992395 == 1) {
            var5 = var4.ap * -1158956325 - this.bb + this.ag;
            if (var5 >= 0 && var5 <= this.ag + this.ag) {
               var6 = var4.ak * -1483350349 - this.bq + this.ag;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.aj * 1276080201 - this.bq + this.ag;
               if (var7 > this.ag + this.ag) {
                  var7 = this.ag + this.ag;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cn(var5, var6++)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bv - var4.ay * -467035677;
                  if (var9 > 32) {
                     var4.an = -925954819;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.an = -1851909638;
                     var9 = -var9;
                  }

                  var4.ar = (var4.ae * -1654652849 - this.bk << 8) / var9 * -1820467529;
                  var4.ab = (var4.am * 706234479 - this.bk << 8) / var9 * -867750803;
                  var4.az = (var4.at * 1054556819 - this.bx << 8) / var9 * -798617017;
                  var4.ag = (var4.au * -2080775187 - this.bx << 8) / var9 * 1095373565;
                  this.cd[this.cb++] = var4;
               }
            }
         } else if (var4.ai * 2132992395 == 2) {
            var5 = var4.ak * -1483350349 - this.bq + this.ag;
            if (var5 >= 0 && var5 <= this.ag + this.ag) {
               var6 = var4.ap * -1158956325 - this.bb + this.ag;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.aw * -547034607 - this.bb + this.ag;
               if (var7 > this.ag + this.ag) {
                  var7 = this.ag + this.ag;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cn(var6++, var5)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bk - var4.ae * -1654652849;
                  if (var9 > 32) {
                     var4.an = 1517102839;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.an = 591148020;
                     var9 = -var9;
                  }

                  var4.ao = (var4.ay * -467035677 - this.bv << 8) / var9 * -637152413;
                  var4.af = (var4.as * -939224903 - this.bv << 8) / var9 * -1824101959;
                  var4.az = (var4.at * 1054556819 - this.bx << 8) / var9 * -798617017;
                  var4.ag = (var4.au * -2080775187 - this.bx << 8) / var9 * 1095373565;
                  this.cd[this.cb++] = var4;
               }
            }
         } else if (var4.ai * 2132992395 == 4) {
            var5 = var4.at * 1054556819 - this.bx;
            if (var5 > 128) {
               var6 = var4.ak * -1483350349 - this.bq + this.ag;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.aj * 1276080201 - this.bq + this.ag;
               if (var7 > this.ag + this.ag) {
                  var7 = this.ag + this.ag;
               }

               if (var6 <= var7) {
                  int var8 = var4.ap * -1158956325 - this.bb + this.ag;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.aw * -547034607 - this.bb + this.ag;
                  if (var9 > this.ag + this.ag) {
                     var9 = this.ag + this.ag;
                  }

                  boolean var10 = false;

                  label197:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (this.cn(var11, var12)) {
                           var10 = true;
                           break label197;
                        }
                     }
                  }

                  if (var10) {
                     var4.an = -334806799;
                     var4.ao = (var4.ay * -467035677 - this.bv << 8) / var5 * -637152413;
                     var4.af = (var4.as * -939224903 - this.bv << 8) / var5 * -1824101959;
                     var4.ar = (var4.ae * -1654652849 - this.bk << 8) / var5 * -1820467529;
                     var4.ab = (var4.am * 706234479 - this.bk << 8) / var5 * -867750803;
                     this.cd[this.cb++] = var4;
                  }
               }
            }
         }
      }

   }

   boolean ca(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.cj(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.cs(var7 + 1, this.as[var1][var2][var4] - var6, var8 + 1) && this.cs(var7 + 128 - 1, this.as[var1][var2 + 1][var4] - var6, var8 + 1) && this.cs(var7 + 128 - 1, this.as[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.cs(var7 + 1, this.as[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.an[var1][var7][var8] == -this.al) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.as[var1][var2][var4] - var6;
         if (!this.cs(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.cs(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.cs(var7, var9, var11)) {
                  return false;
               } else if (!this.cs(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   boolean cs(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.cb; ++var4) {
         jo var5 = this.cd[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.an * -780505003 == 1) {
            var6 = var5.ay * -467035677 - var1;
            if (var6 > 0) {
               var7 = var5.ae * -1654652849 + (var5.ar * 1147100935 * var6 >> 8);
               var8 = var5.am * 706234479 + (var5.ab * -1153712795 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -2080775187 + (var5.ag * 1216485973 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 2) {
            var6 = var1 - var5.ay * -467035677;
            if (var6 > 0) {
               var7 = var5.ae * -1654652849 + (var5.ar * 1147100935 * var6 >> 8);
               var8 = var5.am * 706234479 + (var5.ab * -1153712795 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -2080775187 + (var5.ag * 1216485973 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 3) {
            var6 = var5.ae * -1654652849 - var3;
            if (var6 > 0) {
               var7 = var5.ay * -467035677 + (var5.ao * 1894401611 * var6 >> 8);
               var8 = var5.as * -939224903 + (var5.af * -1935487863 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -2080775187 + (var5.ag * 1216485973 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 4) {
            var6 = var3 - var5.ae * -1654652849;
            if (var6 > 0) {
               var7 = var5.ay * -467035677 + (var5.ao * 1894401611 * var6 >> 8);
               var8 = var5.as * -939224903 + (var5.af * -1935487863 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -2080775187 + (var5.ag * 1216485973 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 5) {
            var6 = var2 - var5.at * 1054556819;
            if (var6 > 0) {
               var7 = var5.ay * -467035677 + (var5.ao * 1894401611 * var6 >> 8);
               var8 = var5.as * -939224903 + (var5.af * -1935487863 * var6 >> 8);
               var9 = var5.ae * -1654652849 + (var5.ar * 1147100935 * var6 >> 8);
               var10 = var5.am * 706234479 + (var5.ab * -1153712795 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public void cd(int[] var1, int var2, int var3, int var4, int var5) {
      this.ct = var1;
      this.cc = var2;
      this.cj = var3;
      this.cm = var4;
      this.cw = var5;
      this.dt = 0;
      this.dx = 0;
      this.ds = var4;
      this.db = var5;
      this.dl = var4 / 2;
      this.dm = var5 / 2;
      this.cr.set(0, this.cr.size());
      this.dr.set(0, this.dr.size());
   }

   public void cr() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.aj; ++var1) {
         for(var2 = 0; var2 < this.ai; ++var2) {
            for(int var3 = 0; var3 < this.ay; ++var3) {
               this.ae[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < this.bl; ++var1) {
         for(var2 = 0; var2 < this.be[var1]; ++var2) {
            this.cq[var1][var2] = null;
         }

         this.be[var1] = 0;
      }

      for(var1 = 0; var1 < this.at; ++var1) {
         this.au[var1] = null;
      }

      this.at = 0;

      for(var1 = 0; var1 < this.br.length; ++var1) {
         this.br[var1] = null;
      }

   }

   public void ck() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.aj; ++var1) {
         for(var2 = 0; var2 < this.ai; ++var2) {
            for(int var3 = 0; var3 < this.ay; ++var3) {
               this.ae[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < this.bl; ++var1) {
         for(var2 = 0; var2 < this.be[var1]; ++var2) {
            this.cq[var1][var2] = null;
         }

         this.be[var1] = 0;
      }

      for(var1 = 0; var1 < this.at; ++var1) {
         this.au[var1] = null;
      }

      this.at = 0;

      for(var1 = 0; var1 < this.br.length; ++var1) {
         this.br[var1] = null;
      }

   }

   public void dq(int var1) {
      this.am = var1;

      for(int var2 = 0; var2 < this.ai; ++var2) {
         for(int var3 = 0; var3 < this.ay; ++var3) {
            if (this.ae[var1][var2][var3] == null) {
               this.ae[var1][var2][var3] = new jw(var1, var2, var3);
            }
         }
      }

   }

   public void dd(int var1) {
      this.am = var1;

      for(int var2 = 0; var2 < this.ai; ++var2) {
         for(int var3 = 0; var3 < this.ay; ++var3) {
            if (this.ae[var1][var2][var3] == null) {
               this.ae[var1][var2][var3] = new jw(var1, var2, var3);
            }
         }
      }

   }

   public void dc(int var1, int var2) {
      jw var3 = this.ae[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         jw var5 = this.ae[var4][var1][var2] = this.ae[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.ap -= -1844973347;

            for(int var6 = 0; var6 < var5.au * 1681381620; ++var6) {
               kf var7 = var5.an[var6];
               long var9 = -4002139674731118243L * var7.ao;
               boolean var8 = pj.ay(var9) == 2;
               if (var8 && var7.as * -1894447200 == var1 && var7.am * -1679599593 == var2) {
                  var7.ap -= 462815002;
               }
            }
         }
      }

      if (this.ae[0][var1][var2] == null) {
         this.ae[0][var1][var2] = new jw(0, var1, var2);
      }

      this.ae[0][var1][var2].aq = var3;
      this.ae[3][var1][var2] = null;
   }

   public void da(int var1, int var2) {
      jw var3 = this.ae[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         jw var5 = this.ae[var4][var1][var2] = this.ae[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.ap -= -1844973347;

            for(int var6 = 0; var6 < var5.au * 2050644103; ++var6) {
               kf var7 = var5.an[var6];
               long var9 = -4002139674731118243L * var7.ao;
               boolean var8 = pj.ay(var9) == 2;
               if (var8 && var7.as * 1663649347 == var1 && var7.am * -1679599593 == var2) {
                  var7.ap -= -1033025699;
               }
            }
         }
      }

      if (this.ae[0][var1][var2] == null) {
         this.ae[0][var1][var2] = new jw(0, var1, var2);
      }

      this.ae[0][var1][var2].aq = var3;
      this.ae[3][var1][var2] = null;
   }

   public void dr(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      jo var9 = new jo();
      var9.ap = var3 / 583599345 * 1923177830;
      var9.aw = var4 / -1381126031 * -253134662;
      var9.ak = var5 / 48177822 * 403308667;
      var9.aj = var6 / 128 * -1607499271;
      var9.ai = var2 * -830825686;
      var9.ay = var3 * -281644085;
      var9.as = var4 * 28997001;
      var9.ae = var5 * 1205278383;
      var9.am = var6 * -1138092401;
      var9.at = var7 * 1219505051;
      var9.au = var8 * -1227230747;
      this.cq[var1][this.be[var1]++] = var9;
   }

   boolean gq(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.ck + var3 * this.dq + var4 * this.dd + var5);
   }

   public void dg(int var1, int var2, int var3, int var4) {
      jw var5 = this.ae[var1][var2][var3];
      if (var5 != null) {
         this.ae[var1][var2][var3].ar = var4 * -1140139471;
      }
   }

   public void df(int var1, int var2, int var3, int var4) {
      jw var5 = this.ae[var1][var2][var3];
      if (var5 != null) {
         this.ae[var1][var2][var3].ar = var4 * 426055295;
      }
   }

   public void du(int var1, int var2, int var3, int var4) {
      jw var5 = this.ae[var1][var2][var3];
      if (var5 != null) {
         this.ae[var1][var2][var3].ar = var4 * 426055295;
      }
   }

   public void dk(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      jp var21;
      int var22;
      if (var4 == 0) {
         var21 = new jp(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ae[var22][var2][var3] == null) {
               this.ae[var22][var2][var3] = new jw(var22, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ai = var21;
      } else if (var4 != 1) {
         js var23 = new js(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ae[var22][var2][var3] == null) {
               this.ae[var22][var2][var3] = new jw(var22, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ay = var23;
      } else {
         var21 = new jp(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ae[var22][var2][var3] == null) {
               this.ae[var22][var2][var3] = new jw(var22, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ai = var21;
      }
   }

   public boolean ev(int var1, int var2, int var3, int var4, int var5, jv var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > -797162390 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 2024808210 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1240019151 || var7 < 572115792) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < -1922272259) {
               var11 -= 128;
            }
         }

         var11 /= 970187308;
         var12 /= 128;
         var13 /= 2124126505;
         var14 /= -1333281892;
         return this.az(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   boolean hp(int var1, int var2, int var3, int var4, boolean var5) {
      return this.bg(this.dr, var1, var2, var3, var4, var5);
   }

   public void dt(int var1, int var2, int var3, int var4, jv var5, long var6, int var8) {
      if (var5 != null) {
         jd var9 = new jd();
         var9.aj = var5;
         var9.aw = var2 * 1350693504 + 675346752;
         var9.ak = var3 * 1267240064 + 633620032;
         var9.ap = var4 * 1792325245;
         var9.ai = var6 * -4159210934178270429L;
         var9.ay = var8 * -451409015;
         if (this.ae[var1][var2][var3] == null) {
            this.ae[var1][var2][var3] = new jw(var1, var2, var3);
         }

         this.ae[var1][var2][var3].am = var9;
      }
   }

   public void dx(int var1, int var2, int var3, int var4, jv var5, long var6, int var8) {
      if (var5 != null) {
         jd var9 = new jd();
         var9.aj = var5;
         var9.aw = var2 * 1350693504 + 675346752;
         var9.ak = var3 * 1267240064 + 633620032;
         var9.ap = var4 * 1792325245;
         var9.ai = var6 * -4159210934178270429L;
         var9.ay = var8 * -451409015;
         if (this.ae[var1][var2][var3] == null) {
            this.ae[var1][var2][var3] = new jw(var1, var2, var3);
         }

         this.ae[var1][var2][var3].am = var9;
      }
   }

   boolean jk(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.cj(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.cs(var7 + 1, this.as[var1][var2][var4] - var6, var8 + 1) && this.cs(var7 + -241569320 - 1, this.as[var1][var2 + 1][var4] - var6, var8 + 1) && this.cs(var7 + 128 - 1, this.as[var1][var2 + 1][var4 + 1] - var6, var8 + -1850057511 - 1) && this.cs(var7 + 1, this.as[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.an[var1][var7][var8] == -this.al) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.as[var1][var2][var4] - var6;
         if (!this.cs(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.cs(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.cs(var7, var9, var11)) {
                  return false;
               } else if (!this.cs(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   public void db(int var1, int var2, int var3, int var4, jv var5, long var6, jv var8, jv var9) {
      is var10 = new is();
      var10.aj = var5;
      var10.aw = var2 * 1646502016 + 823251008;
      var10.ak = var3 * 1719392708 + -827205824;
      var10.ap = var4 * 649724197;
      var10.as = var6 * 7230106010689641531L;
      var10.ai = var8;
      var10.ay = var9;
      int var11 = 0;
      jw var12 = this.ae[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.au * 2045136233; ++var13) {
            if ((var12.an[var13].af * 1857357932 & 256) == -1614848693 && var12.an[var13].ai instanceof jy) {
               jy var14 = (jy)var12.an[var13].ai;
               var14.am();
               if (var14.ez * -274986519 > var11) {
                  var11 = var14.ez * -274986519;
               }
            }
         }
      }

      var10.ae = var11 * -1725935311;
      if (this.ae[var1][var2][var3] == null) {
         this.ae[var1][var2][var3] = new jw(var1, var2, var3);
      }

      this.ae[var1][var2][var3].at = var10;
   }

   public void dv(int var1, int var2, int var3, int var4, jv var5, long var6, jv var8, jv var9) {
      is var10 = new is();
      var10.aj = var5;
      var10.aw = var2 * 104876167 + 823251008;
      var10.ak = var3 * 1811480924 + -1624713219;
      var10.ap = var4 * 649724197;
      var10.as = var6 * 7230106010689641531L;
      var10.ai = var8;
      var10.ay = var9;
      int var11 = 0;
      jw var12 = this.ae[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.au * -1187853795; ++var13) {
            if ((var12.an[var13].af * 2075451855 & 1965449255) == 221977539 && var12.an[var13].ai instanceof jy) {
               jy var14 = (jy)var12.an[var13].ai;
               var14.am();
               if (var14.ez * 1733763727 > var11) {
                  var11 = var14.ez * -274986519;
               }
            }
         }
      }

      var10.ae = var11 * -1725935311;
      if (this.ae[var1][var2][var3] == null) {
         this.ae[var1][var2][var3] = new jw(var1, var2, var3);
      }

      this.ae[var1][var2][var3].at = var10;
   }

   public boolean af(int var1, int var2, int var3, int var4, int var5, int var6, jv var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + 64 * var5;
         int var13 = var3 * 128 + 64 * var6;
         return this.az(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public void dp(int var1, int var2, int var3, int var4, jv var5, jv var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         ka var12 = new ka();
         var12.ae = var9 * -7556061363534394949L;
         var12.am = var11 * -759369342;
         var12.aw = var2 * 421655680 + -1936655808;
         var12.ak = var3 * -1835390592 + -917695296;
         var12.ap = var4 * 1544998092;
         var12.ay = var5;
         var12.as = var6;
         var12.aj = var7 * -19302099;
         var12.ai = var8 * -1144608261;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.ae[var13][var2][var3] == null) {
               this.ae[var13][var2][var3] = new jw(var13, var2, var3);
            }
         }

         this.ae[var1][var2][var3].as = var12;
      }
   }

   public void dy(int var1, int var2, int var3, int var4, jv var5, jv var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         ka var12 = new ka();
         var12.ae = var9 * -7556061363534394949L;
         var12.am = var11 * -1361064637;
         var12.aw = var2 * 421655680 + -1936655808;
         var12.ak = var3 * -1835390592 + -917695296;
         var12.ap = var4 * -13849925;
         var12.ay = var5;
         var12.as = var6;
         var12.aj = var7 * -966423057;
         var12.ai = var8 * -1144608261;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.ae[var13][var2][var3] == null) {
               this.ae[var13][var2][var3] = new jw(var13, var2, var3);
            }
         }

         this.ae[var1][var2][var3].as = var12;
      }
   }

   public void do(int var1, int var2, int var3, int var4, jv var5, jv var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         ku var14 = new ku();
         var14.at = var11 * -6122995212202842357L;
         var14.au = var13 * -39751723;
         var14.aw = var2 * -772798336 + -386399168;
         var14.ak = var3 * -429474688 + 1932746304;
         var14.ap = var4 * -834451365;
         var14.ae = var5;
         var14.am = var6;
         var14.aj = var7 * -1653803049;
         var14.ai = var8 * 428692467;
         var14.ay = var9 * 1249052821;
         var14.as = var10 * -452377629;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.ae[var15][var2][var3] == null) {
               this.ae[var15][var2][var3] = new jw(var15, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ae = var14;
      }
   }

   static final int is(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   public void de(int var1, int var2, int var3, int var4, jv var5, jv var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         ku var14 = new ku();
         var14.at = var11 * -6122995212202842357L;
         var14.au = var13 * -39751723;
         var14.aw = var2 * -772798336 + -386399168;
         var14.ak = var3 * -429474688 + 1932746304;
         var14.ap = var4 * -834451365;
         var14.ae = var5;
         var14.am = var6;
         var14.aj = var7 * -1653803049;
         var14.ai = var8 * 428692467;
         var14.ay = var9 * 1249052821;
         var14.as = var10 * -452377629;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.ae[var15][var2][var3] == null) {
               this.ae[var15][var2][var3] = new jw(var15, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ae = var14;
      }
   }

   boolean hz(int var1, int var2, int var3, int var4, boolean var5) {
      return this.bg(this.dr, var1, var2, var3, var4, var5);
   }

   public int bp(int var1, int var2, int var3, long var4) {
      jw var6 = this.ae[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.as != null && var6.as.ae * -1505290071759269005L == var4) {
         return var6.as.am * 1410344811 & 255;
      } else if (var6.ae != null && var6.ae.at * 7961066021200506019L == var4) {
         return var6.ae.au * -1818078851 & 255;
      } else if (var6.am != null && var6.am.ai * -3473567591769140085L == var4) {
         return var6.am.ay * -1524245831 & 255;
      } else {
         for(int var7 = 0; var7 < var6.au * 2050644103; ++var7) {
            if (var6.an[var7].ao * -4002139674731118243L == var4) {
               return var6.an[var7].af * -1681160537 & 255;
            }
         }

         return -1;
      }
   }

   public boolean dn(int var1, int var2, int var3, int var4, int var5, int var6, jv var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + -1784394985 * var5;
         int var13 = var3 * -1437902351 + 2129455661 * var6;
         return this.az(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public boolean eg(int var1, int var2, int var3, int var4, int var5, jv var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > -1381264604 && var7 < -44116111) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 2104837206) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > -1569280310 && var7 < 120956341) {
               var11 -= 128;
            }
         }

         var11 /= 1802058244;
         var12 /= 1496666921;
         var13 /= 582061324;
         var14 /= -1548380071;
         return this.az(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public void ay(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      jp var21;
      int var22;
      if (var4 == 0) {
         var21 = new jp(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ae[var22][var2][var3] == null) {
               this.ae[var22][var2][var3] = new jw(var22, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ai = var21;
      } else if (var4 != 1) {
         js var23 = new js(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ae[var22][var2][var3] == null) {
               this.ae[var22][var2][var3] = new jw(var22, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ay = var23;
      } else {
         var21 = new jp(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ae[var22][var2][var3] == null) {
               this.ae[var22][var2][var3] = new jw(var22, var2, var3);
            }
         }

         this.ae[var1][var2][var3].ai = var21;
      }
   }

   public boolean eh(int var1, int var2, int var3, int var4, int var5, jv var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.az(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public boolean ez(int var1, int var2, int var3, int var4, int var5, jv var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.az(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   void ad(kf var1) {
      for(int var2 = var1.as * 1663649347; var2 <= var1.ae * -1650103875; ++var2) {
         for(int var3 = var1.am * -1679599593; var3 <= var1.at * -1772771443; ++var3) {
            jw var4 = this.ae[var1.ap * -420592395][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.au * 2050644103; ++var5) {
                  if (var4.an[var5] == var1) {
                     var4.au -= 888073527;

                     for(int var6 = var5; var6 < var4.au * 2050644103; ++var6) {
                        var4.an[var6] = var4.an[var6 + 1];
                        var4.ao[var6] = var4.ao[var6 + 1];
                     }

                     var4.an[var4.au * 2050644103] = null;
                     break;
                  }
               }

               var4.af = 0;

               for(var5 = 0; var5 < var4.au * 2050644103; ++var5) {
                  var4.af = (var4.af * -1999985463 | var4.ao[var5]) * 218543481;
               }
            }
         }
      }

   }

   public boolean ec(int var1, int var2, int var3, int var4, int var5, jv var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.az(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   void el(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      qh var15 = new qh();
      var15.aw((float)((double)(-var2) * 0.0030679615D), 870981566);
      var15.ak((float)((double)(-var3) * 0.0030679615D), 309319879);
      var15.ai((float)var7, (float)var8, (float)var9, -1209216541);
      qs var16 = new qs();
      var16.ab(var15, -1473520632);
      var16.ag((byte)100);
      int var17 = this.ak % 300;
      float var18 = (float)var17 / 300.0F * 6.283F;
      float var19 = (float)Math.sin((double)var18);
      float var20 = (float)Math.cos((double)var18);
      float var21 = var19 * 3.14159F / 100.0F;
      float var22 = var20 * 3.14159F / 100.0F;
      qj var23 = new qj();
      qs var24 = new qs();
      var23.ap = new qp((float)((double)var1 * 0.0030679615D), var21, var22);
      var23.aw = new qt((float)(var4 - 64), (float)var5, (float)(var6 - 64));
      qs var25 = new qs();
      var25.af(var23, 1040070323);
      var25.ag((byte)100);
      qj var26 = new qj();
      var26.aw = new qt((float)(-(this.ai * 64)), 0.0F, (float)(-(this.ay * 64)));
      qs var27 = new qs();
      var27.af(var26, 898882263);
      var24.ad(1.0F, 1.0F, 1.0F, 1.0F, -659724977);
      var27.ao(var24, 339159182);
      var24.af(var23, 2138899165);
      var27.ao(var24, 339958208);
      var27.ao(var16, -198848791);
      this.bv = (int)var25.ax((float)var7, (float)var8, (float)var9, (byte)7);
      this.bx = (int)var25.aq((float)var7, (float)var8, (float)var9, 1230594649);
      this.bk = (int)var25.al((float)var7, (float)var8, (float)var9, (byte)-122);
      this.bb = this.bv / 128;
      this.bq = this.bk / 128;
      this.bp = (int)var25.ax((float)var12, 0.0F, (float)var13, (byte)7) / 128;
      this.bz = (int)var25.al((float)var12, 0.0F, (float)var13, (byte)-10) / 128;
      jc var28 = new jc(var27);
      this.cx(var28, var14);
   }

   public void ix(int var1, int var2, int var3) {
      this.bu = var1;
      this.bt = var2;
      this.bs = var3;
   }

   public void en() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         kf var2 = this.au[var1];
         this.ad(var2);
         this.au[var1] = null;
      }

      this.at = 0;
   }

   public void ef() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         kf var2 = this.au[var1];
         this.ad(var2);
         this.au[var1] = null;
      }

      this.at = 0;
   }

   void em(kf var1) {
      for(int var2 = var1.as * 1663649347; var2 <= var1.ae * -1650103875; ++var2) {
         for(int var3 = var1.am * -1287772608; var3 <= var1.at * -1772771443; ++var3) {
            jw var4 = this.ae[var1.ap * -420592395][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.au * 2050644103; ++var5) {
                  if (var4.an[var5] == var1) {
                     var4.au -= 888073527;

                     for(int var6 = var5; var6 < var4.au * -659776197; ++var6) {
                        var4.an[var6] = var4.an[var6 + 1];
                        var4.ao[var6] = var4.ao[var6 + 1];
                     }

                     var4.an[var4.au * -340299702] = null;
                     break;
                  }
               }

               var4.af = 0;

               for(var5 = 0; var5 < var4.au * 2050644103; ++var5) {
                  var4.af = (var4.af * 169329046 | var4.ao[var5]) * 472245508;
               }
            }
         }
      }

   }

   public void ed(int var1, int var2, int var3, int var4) {
      jw var5 = this.ae[var1][var2][var3];
      if (var5 != null) {
         ku var6 = var5.ae;
         if (var6 != null) {
            var6.ay = var6.ay * 454787773 * var4 / 16 * 1249052821;
            var6.as = var6.as * 1866749906 * var4 / 16 * -1615182953;
         }
      }
   }

   public long bx(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 != null && var4.as != null ? var4.as.ae * -1505290071759269005L : 0L;
   }

   public void ex(int var1, int var2, int var3, int var4) {
      jw var5 = this.ae[var1][var2][var3];
      if (var5 != null) {
         ku var6 = var5.ae;
         if (var6 != null) {
            var6.ay = var6.ay * 454787773 * var4 / 16 * 1249052821;
            var6.as = var6.as * 1489115595 * var4 / 16 * -452377629;
         }
      }
   }

   void je(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      qh var15 = new qh();
      var15.aw((float)((double)(-var2) * 0.0030679615D), 1439054045);
      var15.ak((float)((double)(-var3) * 0.0030679615D), 309319879);
      var15.ai((float)var7, (float)var8, (float)var9, -1840908228);
      qs var16 = new qs();
      var16.ab(var15, -1339495453);
      var16.ag((byte)100);
      int var17 = this.ak % -899138328;
      float var18 = (float)var17 / 300.0F * 6.283F;
      float var19 = (float)Math.sin((double)var18);
      float var20 = (float)Math.cos((double)var18);
      float var21 = var19 * 3.14159F / 100.0F;
      float var22 = var20 * 3.14159F / 100.0F;
      qj var23 = new qj();
      qs var24 = new qs();
      var23.ap = new qp((float)((double)var1 * 0.0030679615D), var21, var22);
      var23.aw = new qt((float)(var4 - -1780253114), (float)var5, (float)(var6 - 64));
      qs var25 = new qs();
      var25.af(var23, 2001241036);
      var25.ag((byte)100);
      qj var26 = new qj();
      var26.aw = new qt((float)(-(this.ai * 914677778)), 0.0F, (float)(-(this.ay * 64)));
      qs var27 = new qs();
      var27.af(var26, 2071529429);
      var24.ad(1.0F, 1.0F, 1.0F, 1.0F, -659724977);
      var27.ao(var24, -107821797);
      var24.af(var23, 1605787620);
      var27.ao(var24, 1993962171);
      var27.ao(var16, 1804715599);
      this.bv = (int)var25.ax((float)var7, (float)var8, (float)var9, (byte)7);
      this.bx = (int)var25.aq((float)var7, (float)var8, (float)var9, -1650145338);
      this.bk = (int)var25.al((float)var7, (float)var8, (float)var9, (byte)-24);
      this.bb = this.bv / -373881124;
      this.bq = this.bk / 1771906649;
      this.bp = (int)var25.ax((float)var12, 0.0F, (float)var13, (byte)7) / -1293308329;
      this.bz = (int)var25.al((float)var12, 0.0F, (float)var13, (byte)-95) / 128;
      jc var28 = new jc(var27);
      this.cx(var28, var14);
   }

   public ku fw(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 == null ? null : var4.ae;
   }

   public void ew(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         var4.ae = null;
      }
   }

   public void eu(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         var4.ae = null;
      }
   }

   void ib(jz var1, boolean var2) {
      ++this.al;
      this.bm = -1;
      this.bo = -1;
      this.bd = -1.0F;
      boolean var3 = this.ap == -1;
      this.bc = !var2 && this.ad != im.ap ? this.bp : this.bb;
      this.by = !var2 && this.ad != im.ap ? this.bz : this.bq;
      if (var3) {
         this.aa = this.bc - this.ag;
         if (this.aa < 0) {
            this.aa = 0;
         }

         this.bh = this.by - this.ag;
         if (this.bh < 0) {
            this.bh = 0;
         }

         this.ah = this.bc + this.ag;
         if (this.ah > this.ai) {
            this.ah = this.ai;
         }

         this.bj = this.by + this.ag;
         if (this.bj > this.ay) {
            this.bj = this.ay;
         }
      } else {
         this.aa = 0;
         this.bh = 0;
         this.ah = this.ai;
         this.bj = this.ay;
         this.bc = this.ai / 2;
         this.by = this.ay / 2;
         this.ag = Math.max(this.bc, this.by);
      }

      this.ac = this.bb - this.bc;
      this.av = this.bq - this.by;
      if (var3) {
         this.cc();
      }

      this.ax = 0;

      int var4;
      int var6;
      for(var4 = this.am; var4 < this.aj; ++var4) {
         jw[][] var5 = this.ae[var4];

         for(var6 = this.aa; var6 < this.ah; ++var6) {
            for(int var7 = this.bh; var7 < this.bj; ++var7) {
               jw var8 = var5[var6][var7];
               if (var8 != null) {
                  if (var8.ar * -721376897 <= this.aq && (!var3 || this.cn(var6 - this.bb + this.ac + this.ag, var7 - this.bq + this.av + this.ag) || this.as[var4][var6][var7] - this.bx >= 2000)) {
                     var8.ab = true;
                     var8.az = true;
                     if (var8.au * 2050644103 > 0) {
                        var8.ag = true;
                     } else {
                        var8.ag = false;
                     }

                     ++this.ax;
                  } else {
                     var8.ab = false;
                     var8.az = false;
                     var8.ad = 0;
                  }
               }
            }
         }
      }

      var4 = Math.abs(this.ac);
      int var15 = Math.abs(this.av);

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      jw var14;
      jw[][] var16;
      int var17;
      for(var6 = this.am; var6 < this.aj; ++var6) {
         var16 = this.ae[var6];

         for(var17 = -(this.ag + var4); var17 <= 0; ++var17) {
            var9 = this.bb + var17;
            var10 = this.bb - var17;
            if (var9 >= this.aa || var10 < this.ah) {
               for(var11 = -(this.ag + var15); var11 <= 0; ++var11) {
                  var12 = this.bq + var11;
                  var13 = this.bq - var11;
                  if (var9 >= this.aa && var9 < this.ah) {
                     if (var12 >= this.bh && var12 < this.bj) {
                        var14 = var16[var9][var12];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, true);
                        }
                     }

                     if (var13 >= this.bh && var13 < this.bj) {
                        var14 = var16[var9][var13];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, true);
                        }
                     }
                  }

                  if (var10 >= this.aa && var10 < this.ah) {
                     if (var12 >= this.bh && var12 < this.bj) {
                        var14 = var16[var10][var12];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, true);
                        }
                     }

                     if (var13 >= this.bh && var13 < this.bj) {
                        var14 = var16[var10][var13];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, true);
                        }
                     }
                  }

                  if (this.ax == 0) {
                     this.cu();
                     return;
                  }
               }
            }
         }
      }

      for(var6 = this.am; var6 < this.aj; ++var6) {
         var16 = this.ae[var6];

         for(var17 = -(this.ag + var4); var17 <= 0; ++var17) {
            var9 = this.bc + var17;
            var10 = this.bc - var17;
            if (var9 >= this.aa || var10 < this.ah) {
               for(var11 = -(this.ag + var15); var11 <= 0; ++var11) {
                  var12 = this.by + var11;
                  var13 = this.by - var11;
                  if (var9 >= this.aa && var9 < this.ah) {
                     if (var12 >= this.bh && var12 < this.bj) {
                        var14 = var16[var9][var12];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, false);
                        }
                     }

                     if (var13 >= this.bh && var13 < this.bj) {
                        var14 = var16[var9][var13];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, false);
                        }
                     }
                  }

                  if (var10 >= this.aa && var10 < this.ah) {
                     if (var12 >= this.bh && var12 < this.bj) {
                        var14 = var16[var10][var12];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, false);
                        }
                     }

                     if (var13 >= this.bh && var13 < this.bj) {
                        var14 = var16[var10][var13];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, false);
                        }
                     }
                  }

                  if (this.ax == 0) {
                     this.cu();
                     return;
                  }
               }
            }
         }
      }

      this.cu();
   }

   public void ak(int var1, int var2) {
      jw var3 = this.ae[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         jw var5 = this.ae[var4][var1][var2] = this.ae[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.ap -= -1844973347;

            for(int var6 = 0; var6 < var5.au * 2050644103; ++var6) {
               kf var7 = var5.an[var6];
               long var9 = -4002139674731118243L * var7.ao;
               boolean var8 = pj.ay(var9) == 2;
               if (var8 && var7.as * 1663649347 == var1 && var7.am * -1679599593 == var2) {
                  var7.ap -= -1033025699;
               }
            }
         }
      }

      if (this.ae[0][var1][var2] == null) {
         this.ae[0][var1][var2] = new jw(0, var1, var2);
      }

      this.ae[0][var1][var2].aq = var3;
      this.ae[3][var1][var2] = null;
   }

   public void es(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.au * 2050644103; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = var6.ao * -4002139674731118243L;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * 1663649347 == var2 && var6.am * -1679599593 == var3) {
               this.ad(var6);
               return;
            }
         }

      }
   }

   public void dh(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      jo var9 = new jo();
      var9.ap = var3 / -1971670123 * -1671575384;
      var9.aw = var4 / -1493787968 * 1404503184;
      var9.ak = var5 / 128 * 403308667;
      var9.aj = var6 / -1138501718 * 4027719;
      var9.ai = var2 * 1598209571;
      var9.ay = var3 * -281644085;
      var9.as = var4 * 28997001;
      var9.ae = var5 * 1205278383;
      var9.am = var6 * -290761388;
      var9.at = var7 * 1219505051;
      var9.au = var8 * -1227230747;
      this.cq[var1][this.be[var1]++] = var9;
   }

   boolean bg(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.dh + var3 * this.dg + var4 * this.df + var5, var6);
      return var6;
   }

   public void ea(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         var4.am = null;
      }
   }

   public void et(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         var4.am = null;
      }
   }

   public void fu(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         var4.at = null;
      }
   }

   public void fo(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         var4.at = null;
      }
   }

   boolean js(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.cb; ++var4) {
         jo var5 = this.cd[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.an * -780505003 == 1) {
            var6 = var5.ay * -467035677 - var1;
            if (var6 > 0) {
               var7 = var5.ae * -1654652849 + (var5.ar * 1147100935 * var6 >> 8);
               var8 = var5.am * 706234479 + (var5.ab * -1153712795 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -2080775187 + (var5.ag * 1216485973 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 2) {
            var6 = var1 - var5.ay * -467035677;
            if (var6 > 0) {
               var7 = var5.ae * -1654652849 + (var5.ar * 1147100935 * var6 >> 8);
               var8 = var5.am * 706234479 + (var5.ab * -1153712795 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -2080775187 + (var5.ag * 1216485973 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 3) {
            var6 = var5.ae * -1654652849 - var3;
            if (var6 > 0) {
               var7 = var5.ay * -467035677 + (var5.ao * 1894401611 * var6 >> 8);
               var8 = var5.as * -939224903 + (var5.af * -1935487863 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -2080775187 + (var5.ag * 1216485973 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 4) {
            var6 = var3 - var5.ae * -1654652849;
            if (var6 > 0) {
               var7 = var5.ay * -467035677 + (var5.ao * 1894401611 * var6 >> 8);
               var8 = var5.as * -939224903 + (var5.af * -1935487863 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -2080775187 + (var5.ag * 1216485973 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 5) {
            var6 = var2 - var5.at * 1054556819;
            if (var6 > 0) {
               var7 = var5.ay * -467035677 + (var5.ao * 1894401611 * var6 >> 8);
               var8 = var5.as * -939224903 + (var5.af * -1935487863 * var6 >> 8);
               var9 = var5.ae * -1654652849 + (var5.ar * 1147100935 * var6 >> 8);
               var10 = var5.am * 706234479 + (var5.ab * -1153712795 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public ka fj(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 == null ? null : var4.as;
   }

   boolean hl(int var1, int var2, int var3, int var4) {
      return this.bf(this.da, var1, var2, var3, var4);
   }

   public void eq(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.au * 2050644103; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = var6.ao * -4002139674731118243L;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * -1201452035 == var2 && var6.am * -1679599593 == var3) {
               this.ad(var6);
               return;
            }
         }

      }
   }

   public kf fh(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.au * 2050644103; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = -4002139674731118243L * var6.ao;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * 1663649347 == var2 && var6.am * -1679599593 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public kf fv(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.au * 2050644103; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = -4002139674731118243L * var6.ao;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * 1663649347 == var2 && var6.am * -1679599593 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public kf fl(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.au * 2050644103; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = -4002139674731118243L * var6.ao;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * 1663649347 == var2 && var6.am * -1679599593 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public kf fn(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.au * 639963117; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = -4002139674731118243L * var6.ao;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * -665998847 == var2 && var6.am * -1679599593 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   void hb(int var1, int var2) {
      this.du = var1;
      this.dk = var2;
   }

   void bc(jj var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.ai) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.ay && (var9 >= var6 || var10 >= var8)) {
                  jw var11 = this.ae[var2][var9][var10];
                  if (var11 != null && var11.am != null && var11.am.aj instanceof jj) {
                     int var12 = this.br(var2, var9, var10, var2, var3, var4);
                     jj var13 = (jj)var11.am.aj;
                     jj.bh(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }

   }

   public long fg(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 != null && var4.as != null ? var4.as.ae * -1505290071759269005L : 0L;
   }

   public long fc(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 != null && var4.as != null ? var4.as.ae * -1505290071759269005L : 0L;
   }

   public long bb(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.au * 2050644103; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = var6.ao * -4002139674731118243L;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * 1663649347 == var2 && var6.am * -1679599593 == var3) {
               return var6.ao * -4002139674731118243L;
            }
         }

         return 0L;
      }
   }

   public long fr(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 != null && var4.ae != null ? var4.ae.at * 7961066021200506019L : 0L;
   }

   public long fe(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 != null && var4.ae != null ? var4.ae.at * 7961066021200506019L : 0L;
   }

   public long ft(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.au * -2078403508; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = var6.ao * -4002139674731118243L;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * 592040224 == var2 && var6.am * -14368326 == var3) {
               return var6.ao * -4002139674731118243L;
            }
         }

         return 0L;
      }
   }

   public long ff(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.au * 1918939058; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = var6.ao * -4002139674731118243L;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * -1315787332 == var2 && var6.am * -103160330 == var3) {
               return var6.ao * -4002139674731118243L;
            }
         }

         return 0L;
      }
   }

   boolean er(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, jv var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.ai || var16 >= this.ay) {
               return false;
            }

            jw var17 = this.ae[var1][var15][var16];
            if (var17 != null && var17.au * 2050644103 >= 5) {
               return false;
            }
         }
      }

      kf var21 = new kf();
      var21.ao = var12 * 8393232564355652341L;
      var21.af = var14 * 1737867543;
      var21.ap = var1 * -1033025699;
      var21.ak = var6 * 1069485131;
      var21.aj = var7 * -1774765273;
      var21.aw = var8 * 1444682335;
      var21.ai = var9;
      var21.ay = var10 * -982896255;
      var21.as = var2 * -2075871637;
      var21.am = var3 * -1767415897;
      var21.ae = (var2 + var4 - 1) * -1805772395;
      var21.at = (var3 + var5 - 1) * -988023995;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var22 > var3) {
               var18 += 8;
            }

            if (var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.ae[var19][var16][var22] == null) {
                  this.ae[var19][var16][var22] = new jw(var19, var16, var22);
               }
            }

            jw var23 = this.ae[var1][var16][var22];
            var23.an[var23.au * 2050644103] = var21;
            var23.ao[var23.au * 2050644103] = var18;
            var23.af = (var23.af * -1999985463 | var18) * 218543481;
            var23.au += 888073527;
         }
      }

      if (var11) {
         this.au[this.at++] = var21;
      }

      return true;
   }

   public long fq(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 != null && var4.am != null ? var4.am.ai * -3473567591769140085L : 0L;
   }

   public long fk(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 != null && var4.am != null ? var4.am.ai * -3473567591769140085L : 0L;
   }

   public void cl(boolean var1) {
      if (!this.cy() || var1) {
         this.bn = true;
         this.bi = var1;
         this.ba = -1;
         this.bw = -1;
      }
   }

   public void fz(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aj; ++var4) {
         for(int var5 = 0; var5 < this.ai; ++var5) {
            for(int var6 = 0; var6 < this.ay; ++var6) {
               jw var7 = this.ae[var4][var5][var6];
               if (var7 != null) {
                  ka var8 = var7.as;
                  jj var10;
                  if (var8 != null && var8.ay instanceof jj) {
                     jj var9 = (jj)var8.ay;
                     this.by(var9, var4, var5, var6, 1, 1);
                     if (var8.as instanceof jj) {
                        var10 = (jj)var8.as;
                        this.by(var10, var4, var5, var6, 1, 1);
                        jj.bh(var9, var10, 0, 0, 0, false);
                        var8.as = var10.bj(var10.bq, var10.bp, var1, var2, var3);
                     }

                     var8.ay = var9.bj(var9.bq, var9.bp, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.au * -463174517; ++var12) {
                     kf var14 = var7.an[var12];
                     if (var14 != null && var14.ai instanceof jj) {
                        jj var11 = (jj)var14.ai;
                        this.by(var11, var4, var5, var6, var14.ae * -1650103875 - var14.as * 1513956819 + 1, var14.at * -1772771443 - var14.am * -1328425322 + 1);
                        var14.ai = var11.bj(var11.bq, var11.bp, var1, var2, var3);
                     }
                  }

                  jd var13 = var7.am;
                  if (var13 != null && var13.aj instanceof jj) {
                     var10 = (jj)var13.aj;
                     this.bc(var10, var4, var5, var6);
                     var13.aj = var10.bj(var10.bq, var10.bp, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   boolean ge(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.ck + var3 * this.dq + var4 * this.dd + var5, var6);
      return var6;
   }

   public void cg(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.ai * 128) {
         var1 = this.ai * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.ay * 128) {
         var3 = this.ay * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      this.ci((var4 - 128) / 32, var5 / 64);
      this.bv = var1;
      this.bx = var2;
      this.bk = var3;
      this.bb = var1 / 128;
      this.bq = var3 / 128;
      this.bp = var7 / 128;
      this.bz = var8 / 128;
      this.aq = var6;
      jq var10 = new jq(var1, var2, var3, var4, var5, var7, var8);
      this.cx(var10, var9);
   }

   void ig(jz var1, boolean var2) {
      ++this.al;
      this.bm = -1;
      this.bo = -1;
      this.bd = -1.0F;
      boolean var3 = this.ap == -1;
      this.bc = !var2 && this.ad != im.ap ? this.bp : this.bb;
      this.by = !var2 && this.ad != im.ap ? this.bz : this.bq;
      if (var3) {
         this.aa = this.bc - this.ag;
         if (this.aa < 0) {
            this.aa = 0;
         }

         this.bh = this.by - this.ag;
         if (this.bh < 0) {
            this.bh = 0;
         }

         this.ah = this.bc + this.ag;
         if (this.ah > this.ai) {
            this.ah = this.ai;
         }

         this.bj = this.by + this.ag;
         if (this.bj > this.ay) {
            this.bj = this.ay;
         }
      } else {
         this.aa = 0;
         this.bh = 0;
         this.ah = this.ai;
         this.bj = this.ay;
         this.bc = this.ai / 2;
         this.by = this.ay / 2;
         this.ag = Math.max(this.bc, this.by);
      }

      this.ac = this.bb - this.bc;
      this.av = this.bq - this.by;
      if (var3) {
         this.cc();
      }

      this.ax = 0;

      int var4;
      int var6;
      for(var4 = this.am; var4 < this.aj; ++var4) {
         jw[][] var5 = this.ae[var4];

         for(var6 = this.aa; var6 < this.ah; ++var6) {
            for(int var7 = this.bh; var7 < this.bj; ++var7) {
               jw var8 = var5[var6][var7];
               if (var8 != null) {
                  if (var8.ar * 1696192596 > this.aq || var3 && !this.cn(var6 - this.bb + this.ac + this.ag, var7 - this.bq + this.av + this.ag) && this.as[var4][var6][var7] - this.bx < -752533820) {
                     var8.ab = false;
                     var8.az = false;
                     var8.ad = 0;
                  } else {
                     var8.ab = true;
                     var8.az = true;
                     if (var8.au * 2050644103 > 0) {
                        var8.ag = true;
                     } else {
                        var8.ag = false;
                     }

                     ++this.ax;
                  }
               }
            }
         }
      }

      var4 = Math.abs(this.ac);
      int var15 = Math.abs(this.av);

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      jw var14;
      jw[][] var16;
      int var17;
      for(var6 = this.am; var6 < this.aj; ++var6) {
         var16 = this.ae[var6];

         for(var17 = -(this.ag + var4); var17 <= 0; ++var17) {
            var9 = this.bb + var17;
            var10 = this.bb - var17;
            if (var9 >= this.aa || var10 < this.ah) {
               for(var11 = -(this.ag + var15); var11 <= 0; ++var11) {
                  var12 = this.bq + var11;
                  var13 = this.bq - var11;
                  if (var9 >= this.aa && var9 < this.ah) {
                     if (var12 >= this.bh && var12 < this.bj) {
                        var14 = var16[var9][var12];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, true);
                        }
                     }

                     if (var13 >= this.bh && var13 < this.bj) {
                        var14 = var16[var9][var13];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, true);
                        }
                     }
                  }

                  if (var10 >= this.aa && var10 < this.ah) {
                     if (var12 >= this.bh && var12 < this.bj) {
                        var14 = var16[var10][var12];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, true);
                        }
                     }

                     if (var13 >= this.bh && var13 < this.bj) {
                        var14 = var16[var10][var13];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, true);
                        }
                     }
                  }

                  if (this.ax == 0) {
                     this.cu();
                     return;
                  }
               }
            }
         }
      }

      for(var6 = this.am; var6 < this.aj; ++var6) {
         var16 = this.ae[var6];

         for(var17 = -(this.ag + var4); var17 <= 0; ++var17) {
            var9 = this.bc + var17;
            var10 = this.bc - var17;
            if (var9 >= this.aa || var10 < this.ah) {
               for(var11 = -(this.ag + var15); var11 <= 0; ++var11) {
                  var12 = this.by + var11;
                  var13 = this.by - var11;
                  if (var9 >= this.aa && var9 < this.ah) {
                     if (var12 >= this.bh && var12 < this.bj) {
                        var14 = var16[var9][var12];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, false);
                        }
                     }

                     if (var13 >= this.bh && var13 < this.bj) {
                        var14 = var16[var9][var13];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, false);
                        }
                     }
                  }

                  if (var10 >= this.aa && var10 < this.ah) {
                     if (var12 >= this.bh && var12 < this.bj) {
                        var14 = var16[var10][var12];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, false);
                        }
                     }

                     if (var13 >= this.bh && var13 < this.bj) {
                        var14 = var16[var10][var13];
                        if (var14 != null && var14.ab) {
                           this.cz(var1, var14, false);
                        }
                     }
                  }

                  if (this.ax == 0) {
                     this.cu();
                     return;
                  }
               }
            }
         }
      }

      this.cu();
   }

   boolean hc(int var1, int var2, int var3, int var4) {
      return this.bm(this.cs, var1, var2, var3, var4);
   }

   void gb(jj var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.ai) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.ay && (var9 >= var6 || var10 >= var8)) {
                  jw var11 = this.ae[var2][var9][var10];
                  if (var11 != null && var11.am != null && var11.am.aj instanceof jj) {
                     int var12 = this.br(var2, var9, var10, var2, var3, var4);
                     jj var13 = (jj)var11.am.aj;
                     jj.bh(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }

   }

   boolean ih(int var1, int var2, int var3, int var4) {
      if (!this.cq(var1, var2, var3, var4)) {
         return this.bl(var1, var2, var3, var4);
      } else {
         this.cb(var1, var2, var3, var4, false);
         int var5 = var1 * 1067997143 + 128;
         int var6 = var2 * -483299426;
         int var7 = (var3 - this.ag - this.ac - 1) * -1600667758;
         int var8 = (var4 - this.ag - this.av - 1) * 1499465430;

         for(int var9 = -this.cc; var9 <= this.cj; var9 += 128) {
            if (this.cf(var7, this.ct[var1] + var9, var8, var5, var6)) {
               return this.be(var1, var2, var3, var4, true);
            }
         }

         return this.be(var1, var2, var3, var4, false);
      }
   }

   void gd(jj var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.aj) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.ai) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.ay && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        jw var15 = this.ae[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = this.br(var12, var13, var14, var2, var3, var4);
                           ka var17 = var15.as;
                           if (var17 != null) {
                              jj var18;
                              if (var17.ay instanceof jj) {
                                 var18 = (jj)var17.ay;
                                 jj.bh(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.as instanceof jj) {
                                 var18 = (jj)var17.as;
                                 jj.bh(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.au * 2050644103; ++var23) {
                              kf var19 = var15.an[var23];
                              if (var19 != null && var19.ai instanceof jj) {
                                 jj var20 = (jj)var19.ai;
                                 int var21 = var19.ae * -1650103875 - var19.as * 1663649347 + 1;
                                 int var22 = var19.at * -1772771443 - var19.am * -1679599593 + 1;
                                 jj.bh(var1, var20, (var19.as * 1663649347 - var3) * 128 + (var21 - var5) * 64, var16, (var19.am * -1679599593 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   void gy(jj var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.aj) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.ai) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.ay && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        jw var15 = this.ae[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = this.br(var12, var13, var14, var2, var3, var4);
                           ka var17 = var15.as;
                           if (var17 != null) {
                              jj var18;
                              if (var17.ay instanceof jj) {
                                 var18 = (jj)var17.ay;
                                 jj.bh(var1, var18, (var13 - var3) * -24379683 + (1 - var5) * 64, var16, (var14 - var4) * 2027694548 + (1 - var6) * 64, var7);
                              }

                              if (var17.as instanceof jj) {
                                 var18 = (jj)var17.as;
                                 jj.bh(var1, var18, (var13 - var3) * 128 + (1 - var5) * -26383020, var16, (var14 - var4) * -175881435 + (1 - var6) * 747954537, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.au * 2050644103; ++var23) {
                              kf var19 = var15.an[var23];
                              if (var19 != null && var19.ai instanceof jj) {
                                 jj var20 = (jj)var19.ai;
                                 int var21 = var19.ae * -1650103875 - var19.as * 955503280 + 1;
                                 int var22 = var19.at * -1772771443 - var19.am * -477664295 + 1;
                                 jj.bh(var1, var20, (var19.as * 461011279 - var3) * 1470932885 + (var21 - var5) * 64, var16, (var19.am * 1344117280 - var4) * -1911585129 + (var22 - var6) * -1450267418, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   int gc(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.bn(var1, var2, var3) - this.bn(var4, var5, var6);
   }

   int ga(int var1, int var2, int var3) {
      return (this.as[var1][var2][var3] + this.as[var1][var2 + 1][var3] + this.as[var1][var2][var3 + 1] + this.as[var1][var2 + 1][var3 + 1]) / 4;
   }

   int gf(int var1, int var2, int var3) {
      return (this.as[var1][var2][var3] + this.as[var1][var2 + 1][var3] + this.as[var1][var2][var3 + 1] + this.as[var1][var2 + 1][var3 + 1]) / 4;
   }

   public ku fp(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 == null ? null : var4.ae;
   }

   public ka fa(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 == null ? null : var4.as;
   }

   public ku bh(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 == null ? null : var4.ae;
   }

   public void gx(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      jw var7 = this.ae[var4][var5][var6];
      if (var7 != null) {
         jp var8 = var7.ai;
         int var10;
         if (var8 != null) {
            int var18 = var8.as * 1197868651;
            if (var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            js var9 = var7.ay;
            if (var9 != null) {
               var10 = var9.an;
               int var11 = var9.ao;
               int var12 = var9.af;
               int var13 = var9.ar;
               int[] var14 = this.cz[var10];
               int[] var15 = this.ch[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   void gl(jj var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.ai) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.ay && (var9 >= var6 || var10 >= var8)) {
                  jw var11 = this.ae[var2][var9][var10];
                  if (var11 != null && var11.am != null && var11.am.aj instanceof jj) {
                     int var12 = this.br(var2, var9, var10, var2, var3, var4);
                     jj var13 = (jj)var11.am.aj;
                     jj.bh(var1, var13, (var9 - var3) * -921479552, var12, (var10 - var4) * 1947378798, true);
                  }
               }
            }
         }
      }

   }

   public void gr(int var1) {
      this.ag = lb.ae(25, 90, var1, -1662895824);
      jl.an(this.ag);
      if (this.ct != null && this.ct.length > 0) {
         this.cd(this.ct, this.cc, this.cj, this.cm, this.cw);
      }

   }

   public void gm(int var1) {
      this.ag = lb.ae(25, 90, var1, -1676542195);
      jl.an(this.ag);
      if (this.ct != null && this.ct.length > 0) {
         this.cd(this.ct, this.cc, this.cj, this.cm, this.cw);
      }

   }

   public void go(im var1) {
      if (var1 != this.ad) {
         this.ad = var1;
         this.cd(this.ct, this.cc, this.cj, this.cm, this.cw);
      }

   }

   boolean cw(int var1, int var2, int var3, int var4) {
      if (!this.cj(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.cs(var5 + 1, this.as[var1][var2][var3] - var4, var6 + 1) && this.cs(var5 + 128 - 1, this.as[var1][var2 + 1][var3] - var4, var6 + 1) && this.cs(var5 + 128 - 1, this.as[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.cs(var5 + 1, this.as[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean gz(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.ck + var3 * this.dq + var4 * this.dd + var5);
   }

   public ka ah(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 == null ? null : var4.as;
   }

   boolean gu(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.ck + var3 * this.dq + var4 * this.dd + var5);
   }

   boolean jb(int var1, int var2, int var3, int var4) {
      if (!this.cj(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.as[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > this.bv) {
                  if (!this.cs(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.cs(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.cs(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cs(var5, var9, var6)) {
                  return false;
               }

               if (!this.cs(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < this.bk) {
                  if (!this.cs(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cs(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.cs(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < this.bv) {
                  if (!this.cs(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cs(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.cs(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > this.bk) {
                  if (!this.cs(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.cs(var5, var9, var6)) {
                  return false;
               }

               if (!this.cs(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.cs(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.cs(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.cs(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.cs(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.cs(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean gs(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.ck + var3 * this.dq + var4 * this.dd + var5, var6);
      return var6;
   }

   public void ep(int var1, int var2, int var3, int var4) {
      jw var5 = this.ae[var1][var2][var3];
      if (var5 != null) {
         ku var6 = var5.ae;
         if (var6 != null) {
            var6.ay = var6.ay * 454787773 * var4 / 16 * 1249052821;
            var6.as = var6.as * 1489115595 * var4 / 16 * -452377629;
         }
      }
   }

   boolean gk(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.ck + var3 * this.dq + var4 * this.dd + var5, var6);
      return var6;
   }

   boolean hr(int var1, int var2, int var3, int var4) {
      return this.bm(this.cs, var1, var2, var3, var4);
   }

   boolean cm(int var1, int var2, int var3, int var4) {
      if (!this.cj(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.as[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > this.bv) {
                  if (!this.cs(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.cs(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.cs(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cs(var5, var9, var6)) {
                  return false;
               }

               if (!this.cs(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < this.bk) {
                  if (!this.cs(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cs(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.cs(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < this.bv) {
                  if (!this.cs(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cs(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.cs(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > this.bk) {
                  if (!this.cs(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.cs(var5, var9, var6)) {
                  return false;
               }

               if (!this.cs(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.cs(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.cs(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.cs(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.cs(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.cs(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean hu(int var1, int var2, int var3, int var4, boolean var5) {
      return this.bo(this.cs, var1, var2, var3, var4, var5);
   }

   public void ds(int var1, int var2, int var3, int var4, jv var5, long var6, jv var8, jv var9) {
      is var10 = new is();
      var10.aj = var5;
      var10.aw = var2 * 1646502016 + 823251008;
      var10.ak = var3 * -1654411648 + -827205824;
      var10.ap = var4 * 649724197;
      var10.as = var6 * 7230106010689641531L;
      var10.ai = var8;
      var10.ay = var9;
      int var11 = 0;
      jw var12 = this.ae[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.au * 2050644103; ++var13) {
            if ((var12.an[var13].af * -1681160537 & 256) == 256 && var12.an[var13].ai instanceof jy) {
               jy var14 = (jy)var12.an[var13].ai;
               var14.am();
               if (var14.ez * -274986519 > var11) {
                  var11 = var14.ez * -274986519;
               }
            }
         }
      }

      var10.ae = var11 * -1725935311;
      if (this.ae[var1][var2][var3] == null) {
         this.ae[var1][var2][var3] = new jw(var1, var2, var3);
      }

      this.ae[var1][var2][var3].at = var10;
   }

   boolean ha(int var1, int var2, int var3, int var4) {
      return this.bm(this.cr, var1, var2, var3, var4);
   }

   boolean ho(int var1, int var2, int var3, int var4) {
      return this.bm(this.cr, var1, var2, var3, var4);
   }

   boolean hd(int var1, int var2, int var3, int var4, boolean var5) {
      return this.bo(this.cr, var1, var2, var3, var4, var5);
   }

   public void ic(int var1, int var2, int var3) {
      this.bu = var1;
      this.bt = var2;
      this.bs = var3;
   }

   boolean ht(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.dh + var3 * this.dg + var4 * this.df + var5);
   }

   boolean hf(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.dh + var3 * this.dg + var4 * this.df + var5);
   }

   boolean hi(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.dh + var3 * this.dg + var4 * this.df + var5, var6);
      return var6;
   }

   boolean hn(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.dh + var3 * this.dg + var4 * this.df + var5, var6);
      return var6;
   }

   boolean hy(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.dh + var3 * this.dg + var4 * this.df + var5, var6);
      return var6;
   }

   boolean hk(int var1, int var2, int var3, int var4) {
      return this.bf(this.da, var1, var2, var3, var4);
   }

   boolean cb(int var1, int var2, int var3, int var4, boolean var5) {
      return this.bg(this.dr, var1, var2, var3, var4, var5);
   }

   public void am(int var1, int var2, int var3, int var4, jv var5, jv var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         ka var12 = new ka();
         var12.ae = var9 * -7556061363534394949L;
         var12.am = var11 * -1361064637;
         var12.aw = var2 * 421655680 + -1936655808;
         var12.ak = var3 * -1835390592 + -917695296;
         var12.ap = var4 * -13849925;
         var12.ay = var5;
         var12.as = var6;
         var12.aj = var7 * -966423057;
         var12.ai = var8 * -1144608261;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.ae[var13][var2][var3] == null) {
               this.ae[var13][var2][var3] = new jw(var13, var2, var3);
            }
         }

         this.ae[var1][var2][var3].as = var12;
      }
   }

   boolean hx(int var1, int var2, int var3, int var4) {
      return this.bf(this.da, var1, var2, var3, var4);
   }

   public void ce() {
      this.ba = -1;
      this.bi = false;
   }

   boolean hv(int var1, int var2, int var3, int var4) {
      return this.bf(this.dr, var1, var2, var3, var4);
   }

   public int fs(int var1, int var2, int var3, long var4) {
      jw var6 = this.ae[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.as != null && var6.as.ae * -1505290071759269005L == var4) {
         return var6.as.am * 1410344811 & -1537753183;
      } else if (var6.ae != null && var6.ae.at * 7961066021200506019L == var4) {
         return var6.ae.au * -1560864371 & -1648739917;
      } else if (var6.am != null && var6.am.ai * -3473567591769140085L == var4) {
         return var6.am.ay * -1524245831 & 255;
      } else {
         for(int var7 = 0; var7 < var6.au * 864419078; ++var7) {
            if (var6.an[var7].ao * -4002139674731118243L == var4) {
               return var6.an[var7].af * 1723691804 & -943206600;
            }
         }

         return -1;
      }
   }

   public void ax(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 != null) {
         var4.ae = null;
      }
   }

   public jd fm(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 != null && var4.am != null ? var4.am : null;
   }

   void hs(int var1, int var2) {
      this.du = var1;
      this.dk = var2;
   }

   void hh(int var1, int var2) {
      this.du = var1;
      this.dk = var2;
   }

   public void bu(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      jw var7 = this.ae[var4][var5][var6];
      if (var7 != null) {
         jp var8 = var7.ai;
         int var10;
         if (var8 != null) {
            int var18 = var8.as * 1197868651;
            if (var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            js var9 = var7.ay;
            if (var9 != null) {
               var10 = var9.an;
               int var11 = var9.ao;
               int var12 = var9.af;
               int var13 = var9.ar;
               int[] var14 = this.cz[var10];
               int[] var15 = this.ch[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   boolean hw(int var1, int var2) {
      if (!this.bw(this.du, this.dk, var1, var2)) {
         return this.bd(this.du, this.dk, var1, var2);
      } else {
         this.bi(this.du, this.dk, var1, var2, false);
         boolean var3 = false;

         for(int var4 = -1; var4 <= 1; ++var4) {
            for(int var5 = -1; var5 <= 1; ++var5) {
               if (this.co(this.du, this.dk, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.co(this.du, (this.dk + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.co(this.du + 1, this.dk, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.co(this.du + 1, (this.dk + 1) % 896656410, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return this.ba(this.du, this.dk, var1, var2, var3);
      }
   }

   boolean hm(int var1, int var2, int var3, int var4) {
      return this.bf(this.da, var1, var2, var3, var4);
   }

   public long fx(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.au * 2050644103; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = var6.ao * -4002139674731118243L;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * 1663649347 == var2 && var6.am * -1679599593 == var3) {
               return var6.ao * -4002139674731118243L;
            }
         }

         return 0L;
      }
   }

   boolean ip(int var1, int var2, int var3, int var4) {
      if (!this.cq(var1, var2, var3, var4)) {
         return this.bl(var1, var2, var3, var4);
      } else {
         this.cb(var1, var2, var3, var4, false);
         int var5 = var1 * 32 + 128;
         int var6 = var2 * 64;
         int var7 = (var3 - this.ag - this.ac - 1) * 128;
         int var8 = (var4 - this.ag - this.av - 1) * 128;

         for(int var9 = -this.cc; var9 <= this.cj; var9 += 128) {
            if (this.cf(var7, this.ct[var1] + var9, var8, var5, var6)) {
               return this.be(var1, var2, var3, var4, true);
            }
         }

         return this.be(var1, var2, var3, var4, false);
      }
   }

   boolean in(int var1, int var2, int var3, int var4) {
      if (!this.cq(var1, var2, var3, var4)) {
         return this.bl(var1, var2, var3, var4);
      } else {
         this.cb(var1, var2, var3, var4, false);
         int var5 = var1 * 32 + 128;
         int var6 = var2 * 64;
         int var7 = (var3 - this.ag - this.ac - 1) * 128;
         int var8 = (var4 - this.ag - this.av - 1) * 128;

         for(int var9 = -this.cc; var9 <= this.cj; var9 += 128) {
            if (this.cf(var7, this.ct[var1] + var9, var8, var5, var6)) {
               return this.be(var1, var2, var3, var4, true);
            }
         }

         return this.be(var1, var2, var3, var4, false);
      }
   }

   boolean iu(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = jm.aj;
      int[] var7 = jm.ai;
      int var8 = var6[var4];
      int var9 = var7[var4];
      int var10 = var6[var5];
      int var11 = var7[var5];
      int var12 = var3 * var10 + var1 * var11 >> 16;
      int var13 = var3 * var11 - var1 * var10 >> 16;
      int var14 = var2 * var8 + var13 * var9 >> 16;
      int var15 = var2 * var9 - var13 * var8 >> 16;
      if (var14 >= 1354555593 && var14 <= jl.at()) {
         int var16 = this.dl + var12 * 2058225653 / var14;
         int var17 = this.dm + var15 * 128 / var14;
         return var16 >= this.dt && var16 <= this.ds && var17 >= this.dx && var17 <= this.db;
      } else {
         return false;
      }
   }

   public void ii(boolean var1) {
      if (!this.cy() || var1) {
         this.bn = true;
         this.bi = var1;
         this.ba = -1;
         this.bw = -1;
      }
   }

   public kf bj(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.au * 2050644103; ++var5) {
            kf var6 = var4.an[var5];
            long var8 = -4002139674731118243L * var6.ao;
            boolean var7 = pj.ay(var8) == 2;
            if (var7 && var6.as * 1663649347 == var2 && var6.am * -1679599593 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public void iw(boolean var1) {
      if (!this.cy() || var1) {
         this.bn = true;
         this.bi = var1;
         this.ba = -1;
         this.bw = -1;
      }
   }

   public jd fd(int var1, int var2, int var3) {
      jw var4 = this.ae[var1][var2][var3];
      return var4 != null && var4.am != null ? var4.am : null;
   }

   public boolean il() {
      return this.bi && this.ba != -1;
   }

   public void io(int var1, int var2, int var3) {
      this.bu = var1;
      this.bt = var2;
      this.bs = var3;
   }

   public void id(int var1, int var2, int var3) {
      this.bu = var1;
      this.bt = var2;
      this.bs = var3;
   }

   public void iq() {
      this.bi = true;
   }

   public void iv() {
      this.bi = true;
   }

   public boolean if() {
      return this.bi && this.ba != -1;
   }

   boolean hj(int var1, int var2, int var3, int var4) {
      return this.bf(this.dr, var1, var2, var3, var4);
   }

   void iy() {
      if (this.bn) {
         this.bn = false;
         this.ba = this.bm;
         this.bw = this.bo;
      }

   }

   void it() {
      if (this.bn) {
         this.bn = false;
         this.ba = this.bm;
         this.bw = this.bo;
      }

   }

   void cz(jz var1, jw var2, boolean var3) {
      this.ci.aw(var2);

      while(true) {
         jw var4;
         int var5;
         int var6;
         int var7;
         int var8;
         jw[][] var9;
         jw var10;
         int var12;
         int var15;
         int var16;
         int var24;
         int var26;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              ka var11;
                              kf var13;
                              int var17;
                              int var18;
                              int var19;
                              int var21;
                              boolean var22;
                              jw var33;
                              while(true) {
                                 do {
                                    var4 = (jw)this.ci.ai();
                                    if (var4 == null) {
                                       return;
                                    }
                                 } while(!var4.az);

                                 var5 = var4.aw * 913761943;
                                 var6 = var4.ak * -2130835639;
                                 var7 = var4.ap * -1153163;
                                 var8 = var4.aj * -1013546863;
                                 var9 = this.ae[var7];
                                 if (!var4.ab) {
                                    break;
                                 }

                                 if (var3) {
                                    if (var7 > 0) {
                                       var10 = this.ae[var7 - 1][var5][var6];
                                       if (var10 != null && var10.az) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= this.bb && var5 > this.aa) {
                                       var10 = var9[var5 - 1][var6];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * -1999985463 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= this.bb && var5 < this.ah - 1) {
                                       var10 = var9[var5 + 1][var6];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * -1999985463 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 <= this.bq && var6 > this.bh) {
                                       var10 = var9[var5][var6 - 1];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * -1999985463 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 >= this.bq && var6 < this.bj - 1) {
                                       var10 = var9[var5][var6 + 1];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * -1999985463 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var3 = true;
                                 }

                                 var4.ab = false;
                                 if (var4.aq != null) {
                                    var10 = var4.aq;
                                    if (var10.ai != null) {
                                       if (!this.cj(0, var5, var6)) {
                                          var1.aw(this, var10.ai, 0, var5, var6, 1119299330);
                                       }
                                    } else if (var10.ay != null && !this.cj(0, var5, var6)) {
                                       var1.ak(this, var10.ay, var5, var6, (byte)81);
                                    }

                                    var11 = var10.as;
                                    if (var11 != null) {
                                       var1.ap(var11.ay, 0, var11.aw * 793298009, var11.ap * -1500771725, var11.ak * 420163547, var11.ae * -1505290071759269005L);
                                    }

                                    for(var12 = 0; var12 < var10.au * 2050644103; ++var12) {
                                       var13 = var10.an[var12];
                                       if (var13 != null) {
                                          var1.ap(var13.ai, var13.ay * 180883073, var13.ak * 513105251, var13.aw * -1080639073, var13.aj * 1093960855, var13.ao * -4002139674731118243L);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var4.ai != null) {
                                    if (!this.cj(var8, var5, var6)) {
                                       var22 = true;
                                       if (var4.ai.ak * -1442215975 != 12345678 || var7 <= this.bu) {
                                          var1.aw(this, var4.ai, var8, var5, var6, 418204796);
                                       }
                                    }
                                 } else if (var4.ay != null && !this.cj(var8, var5, var6)) {
                                    var22 = true;
                                    var1.ak(this, var4.ay, var5, var6, (byte)92);
                                 }

                                 var21 = 0;
                                 var12 = 0;
                                 ka var23 = var4.as;
                                 ku var14 = var4.ae;
                                 if (var23 != null || var14 != null) {
                                    if (this.bb == var5) {
                                       ++var21;
                                    } else if (this.bb < var5) {
                                       var21 += 2;
                                    }

                                    if (this.bq == var6) {
                                       var21 += 3;
                                    } else if (this.bq > var6) {
                                       var21 += 6;
                                    }

                                    var12 = cn[var21];
                                    var4.ax = cf[var21] * -1163983431;
                                 }

                                 if (var23 != null) {
                                    if ((var23.aj * -1674755825 & co[var21]) != 0) {
                                       if (var23.aj * -1674755825 == 16) {
                                          var4.ad = -1749390123;
                                          var4.ac = cl[var21] * -611618347;
                                          var4.av = -1577426333 - var4.ac * -924791523;
                                       } else if (var23.aj * -1674755825 == 32) {
                                          var4.ad = 796187050;
                                          var4.ac = cp[var21] * -611618347;
                                          var4.av = 1140114630 - var4.ac * -924791523;
                                       } else if (var23.aj * -1674755825 == 64) {
                                          var4.ad = 1592374100;
                                          var4.ac = cv[var21] * -611618347;
                                          var4.av = -2014738036 - var4.ac * -924791523;
                                       } else {
                                          var4.ad = -953203073;
                                          var4.ac = cy[var21] * -611618347;
                                          var4.av = -437311703 - var4.ac * -924791523;
                                       }
                                    } else {
                                       var4.ad = 0;
                                    }

                                    if ((var23.aj * -1674755825 & var12) != 0 && !this.cm(var8, var5, var6, var23.aj * -1674755825)) {
                                       var1.ap(var23.ay, 0, var23.aw * 793298009, var23.ap * -1500771725, var23.ak * 420163547, var23.ae * -1505290071759269005L);
                                    }

                                    if ((var23.ai * -1214908109 & var12) != 0 && !this.cm(var8, var5, var6, var23.ai * -1214908109)) {
                                       var1.ap(var23.as, 0, var23.aw * 793298009, var23.ap * -1500771725, var23.ak * 420163547, var23.ae * -1505290071759269005L);
                                    }
                                 }

                                 if (var14 != null && !this.cw(var8, var5, var6, var14.ae.ez * -274986519)) {
                                    if ((var14.aj * -1058608153 & var12) != 0) {
                                       var1.ap(var14.ae, 0, var14.aw * 908660977 + var14.ay * 454787773, var14.ap * 512272339, var14.ak * 98110665 + var14.as * 1489115595, var14.at * 7961066021200506019L);
                                    } else if (var14.aj * -1058608153 == 256) {
                                       var15 = var14.aw * 908660977 - this.bv;
                                       var16 = var14.ak * 98110665 - this.bk;
                                       var17 = var14.ai * -942637765;
                                       if (var17 != 1 && var17 != 2) {
                                          var18 = var15;
                                       } else {
                                          var18 = -var15;
                                       }

                                       if (var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if (var19 < var18) {
                                          var1.ap(var14.ae, 0, var14.aw * 908660977 + var14.ay * 454787773, var14.ap * 512272339, var14.ak * 98110665 + var14.as * 1489115595, var14.at * 7961066021200506019L);
                                       } else if (var14.am != null) {
                                          var1.ap(var14.am, 0, var14.aw * 908660977, var14.ap * 512272339, var14.ak * 98110665, var14.at * 7961066021200506019L);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    jd var27 = var4.am;
                                    if (var27 != null) {
                                       var1.ap(var27.aj, 0, var27.aw * 243630573, var27.ap * -131403051, var27.ak * 637123369, var27.ai * -3473567591769140085L);
                                    }

                                    is var31 = var4.at;
                                    if (var31 != null && var31.ae * 1986226129 == 0) {
                                       if (var31.ai != null) {
                                          var1.ap(var31.ai, 0, var31.aw * 83642561, var31.ap * 1971597997, var31.ak * 1187824885, var31.as * -7408577255103144717L);
                                       }

                                       if (var31.ay != null) {
                                          var1.ap(var31.ay, 0, var31.aw * 83642561, var31.ap * 1971597997, var31.ak * 1187824885, var31.as * -7408577255103144717L);
                                       }

                                       if (var31.aj != null) {
                                          var1.ap(var31.aj, 0, var31.aw * 83642561, var31.ap * 1971597997, var31.ak * 1187824885, var31.as * -7408577255103144717L);
                                       }
                                    }
                                 }

                                 var15 = var4.af * -1999985463;
                                 if (var15 != 0) {
                                    if (var5 < this.bb && var5 >= this.aa && var5 < this.ah - 1 && (var15 & 4) != 0) {
                                       var33 = var9[var5 + 1][var6];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }

                                    if (var6 < this.bq && var6 >= this.bh && var6 < this.bj - 1 && (var15 & 2) != 0) {
                                       var33 = var9[var5][var6 + 1];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }

                                    if (var5 > this.bb && var5 > this.aa && var5 < this.ah && (var15 & 1) != 0) {
                                       var33 = var9[var5 - 1][var6];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }

                                    if (var6 > this.bq && var6 > this.bh && var6 < this.bj && (var15 & 8) != 0) {
                                       var33 = var9[var5][var6 - 1];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var4.ad * -1376107145 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var4.au * 2050644103; ++var21) {
                                    if (var4.an[var21].an * -814438507 != this.al && (var4.ao[var21] & var4.ad * -1376107145) == var4.ac * 424558461) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var11 = var4.as;
                                    if (!this.cm(var8, var5, var6, var11.aj * -1674755825)) {
                                       var1.ap(var11.ay, 0, var11.aw * 793298009, var11.ap * -1500771725, var11.ak * 420163547, var11.ae * -1505290071759269005L);
                                    }

                                    var4.ad = 0;
                                 }
                              }

                              if (!var4.ag) {
                                 break;
                              }

                              try {
                                 int var25 = var4.au * 2050644103;
                                 var4.ag = false;
                                 var21 = 0;

                                 label592:
                                 for(var12 = 0; var12 < var25; ++var12) {
                                    var13 = var4.an[var12];
                                    if (var13.an * -814438507 != this.al) {
                                       for(var26 = var13.as * 1663649347; var26 <= var13.ae * -1650103875; ++var26) {
                                          for(var15 = var13.am * -1679599593; var15 <= var13.at * -1772771443; ++var15) {
                                             var33 = var9[var26][var15];
                                             if (var33.ab) {
                                                var4.ag = true;
                                                continue label592;
                                             }

                                             if (var33.ad * -1376107145 != 0) {
                                                var17 = 0;
                                                if (var26 > var13.as * 1663649347) {
                                                   ++var17;
                                                }

                                                if (var26 < var13.ae * -1650103875) {
                                                   var17 += 4;
                                                }

                                                if (var15 > var13.am * -1679599593) {
                                                   var17 += 8;
                                                }

                                                if (var15 < var13.at * -1772771443) {
                                                   var17 += 2;
                                                }

                                                if ((var17 & var33.ad * -1376107145) == var4.av * -956985887) {
                                                   var4.ag = true;
                                                   continue label592;
                                                }
                                             }
                                          }
                                       }

                                       this.br[var21++] = var13;
                                       var26 = this.bb - var13.as * 1663649347;
                                       var15 = var13.ae * -1650103875 - this.bb;
                                       if (var15 > var26) {
                                          var26 = var15;
                                       }

                                       var16 = this.bq - var13.am * -1679599593;
                                       var17 = var13.at * -1772771443 - this.bq;
                                       if (var17 > var16) {
                                          var13.au = (var26 + var17) * 1017141597;
                                       } else {
                                          var13.au = (var26 + var16) * 1017141597;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var12 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       kf var34 = this.br[var26];
                                       if (var34.an * -814438507 != this.al) {
                                          if (var34.au * -621100299 > var12) {
                                             var12 = var34.au * -621100299;
                                             var24 = var26;
                                          } else if (var34.au * -621100299 == var12) {
                                             var16 = var34.ak * 513105251 - this.bv;
                                             var17 = var34.aj * 1093960855 - this.bk;
                                             var18 = this.br[var24].ak * 513105251 - this.bv;
                                             var19 = this.br[var24].aj * 1093960855 - this.bk;
                                             if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    kf var35 = this.br[var24];
                                    var35.an = this.al * 1749117885;
                                    if (!this.ca(var8, var35.as * 1663649347, var35.ae * -1650103875, var35.am * -1679599593, var35.at * -1772771443, var35.ai.ez * -274986519)) {
                                       var1.ap(var35.ai, var35.ay * 180883073, var35.ak * 513105251, var35.aw * -1080639073, var35.aj * 1093960855, var35.ao * -4002139674731118243L);
                                    }

                                    for(var15 = var35.as * 1663649347; var15 <= var35.ae * -1650103875; ++var15) {
                                       for(var16 = var35.am * -1679599593; var16 <= var35.at * -1772771443; ++var16) {
                                          jw var36 = var9[var15][var16];
                                          if (var36.ad * -1376107145 != 0) {
                                             this.ci.aw(var36);
                                          } else if ((var15 != var5 || var16 != var6) && var36.az) {
                                             this.ci.aw(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var4.ag) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var4.ag = false;
                                 break;
                              }
                           }
                        } while(!var4.az);
                     } while(var4.ad * -1376107145 != 0);

                     if (var5 > this.bb || var5 <= this.aa) {
                        break;
                     }

                     var10 = var9[var5 - 1][var6];
                  } while(var10 != null && var10.az);

                  if (var5 < this.bb || var5 >= this.ah - 1) {
                     break;
                  }

                  var10 = var9[var5 + 1][var6];
               } while(var10 != null && var10.az);

               if (var6 > this.bq || var6 <= this.bh) {
                  break;
               }

               var10 = var9[var5][var6 - 1];
            } while(var10 != null && var10.az);

            if (var6 < this.bq || var6 >= this.bj - 1) {
               break;
            }

            var10 = var9[var5][var6 + 1];
         } while(var10 != null && var10.az);

         var4.az = false;
         --this.ax;
         is var29 = var4.at;
         if (var29 != null && var29.ae * 1986226129 != 0) {
            if (var29.ai != null) {
               var1.ap(var29.ai, 0, var29.aw * 83642561, var29.ap * 1971597997 - var29.ae * 1986226129, var29.ak * 1187824885, var29.as * -7408577255103144717L);
            }

            if (var29.ay != null) {
               var1.ap(var29.ay, 0, var29.aw * 83642561, var29.ap * 1971597997 - var29.ae * 1986226129, var29.ak * 1187824885, var29.as * -7408577255103144717L);
            }

            if (var29.aj != null) {
               var1.ap(var29.aj, 0, var29.aw * 83642561, var29.ap * 1971597997 - var29.ae * 1986226129, var29.ak * 1187824885, var29.as * -7408577255103144717L);
            }
         }

         if (var4.ax * 1678602377 != 0) {
            ku var30 = var4.ae;
            if (var30 != null && !this.cw(var8, var5, var6, var30.ae.ez * -274986519)) {
               if ((var30.aj * -1058608153 & var4.ax * 1678602377) != 0) {
                  var1.ap(var30.ae, 0, var30.aw * 908660977 + var30.ay * 454787773, var30.ap * 512272339, var30.ak * 98110665 + var30.as * 1489115595, var30.at * 7961066021200506019L);
               } else if (var30.aj * -1058608153 == 256) {
                  var12 = var30.aw * 908660977 - this.bv;
                  var24 = var30.ak * 98110665 - this.bk;
                  var26 = var30.ai * -942637765;
                  if (var26 != 1 && var26 != 2) {
                     var15 = var12;
                  } else {
                     var15 = -var12;
                  }

                  if (var26 != 2 && var26 != 3) {
                     var16 = var24;
                  } else {
                     var16 = -var24;
                  }

                  if (var16 >= var15) {
                     var1.ap(var30.ae, 0, var30.aw * 908660977 + var30.ay * 454787773, var30.ap * 512272339, var30.ak * 98110665 + var30.as * 1489115595, var30.at * 7961066021200506019L);
                  } else if (var30.am != null) {
                     var1.ap(var30.am, 0, var30.aw * 908660977, var30.ap * 512272339, var30.ak * 98110665, var30.at * 7961066021200506019L);
                  }
               }
            }

            ka var28 = var4.as;
            if (var28 != null) {
               if ((var28.ai * -1214908109 & var4.ax * 1678602377) != 0 && !this.cm(var8, var5, var6, var28.ai * -1214908109)) {
                  var1.ap(var28.as, 0, var28.aw * 793298009, var28.ap * -1500771725, var28.ak * 420163547, var28.ae * -1505290071759269005L);
               }

               if ((var28.aj * -1674755825 & var4.ax * 1678602377) != 0 && !this.cm(var8, var5, var6, var28.aj * -1674755825)) {
                  var1.ap(var28.ay, 0, var28.aw * 793298009, var28.ap * -1500771725, var28.ak * 420163547, var28.ae * -1505290071759269005L);
               }
            }
         }

         jw var32;
         if (var7 < this.aj - 1) {
            var32 = this.ae[var7 + 1][var5][var6];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var5 < this.bb && var5 >= this.aa && var5 < this.ah - 1) {
            var32 = var9[var5 + 1][var6];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var6 < this.bq && var6 >= this.bh && var6 < this.bj - 1) {
            var32 = var9[var5][var6 + 1];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var5 > this.bb && var5 > this.aa && var5 < this.ah) {
            var32 = var9[var5 - 1][var6];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var6 > this.bq && var6 > this.bh && var6 < this.bj) {
            var32 = var9[var5][var6 - 1];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }
      }
   }

   public void ik(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.ai * 128) {
         var1 = this.ai * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.ay * 128) {
         var3 = this.ay * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      this.ci((var4 - 128) / 32, var5 / 64);
      this.bv = var1;
      this.bx = var2;
      this.bk = var3;
      this.bb = var1 / 128;
      this.bq = var3 / 128;
      this.bp = var7 / 128;
      this.bz = var8 / 128;
      this.aq = var6;
      jq var10 = new jq(var1, var2, var3, var4, var5, var7, var8);
      this.cx(var10, var9);
   }

   boolean he(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.dh + var3 * this.dg + var4 * this.df + var5);
   }

   void fi(jj var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.ai) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.ay && (var9 >= var6 || var10 >= var8)) {
                  jw var11 = this.ae[var2][var9][var10];
                  if (var11 != null && var11.am != null && var11.am.aj instanceof jj) {
                     int var12 = this.br(var2, var9, var10, var2, var3, var4);
                     jj var13 = (jj)var11.am.aj;
                     jj.bh(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }

   }

   void ij(jz var1, jw var2, boolean var3) {
      this.ci.aw(var2);

      while(true) {
         jw var4;
         int var5;
         int var6;
         int var7;
         int var8;
         jw[][] var9;
         jw var10;
         int var12;
         int var15;
         int var16;
         int var24;
         int var26;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              ka var11;
                              kf var13;
                              int var17;
                              int var18;
                              int var19;
                              int var21;
                              boolean var22;
                              jw var33;
                              while(true) {
                                 do {
                                    var4 = (jw)this.ci.ai();
                                    if (var4 == null) {
                                       return;
                                    }
                                 } while(!var4.az);

                                 var5 = var4.aw * 1515048497;
                                 var6 = var4.ak * -2130835639;
                                 var7 = var4.ap * -1153163;
                                 var8 = var4.aj * -1013546863;
                                 var9 = this.ae[var7];
                                 if (!var4.ab) {
                                    break;
                                 }

                                 if (var3) {
                                    if (var7 > 0) {
                                       var10 = this.ae[var7 - 1][var5][var6];
                                       if (var10 != null && var10.az) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= this.bb && var5 > this.aa) {
                                       var10 = var9[var5 - 1][var6];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * 1528282104 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= this.bb && var5 < this.ah - 1) {
                                       var10 = var9[var5 + 1][var6];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * 1158959562 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 <= this.bq && var6 > this.bh) {
                                       var10 = var9[var5][var6 - 1];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * 2027628246 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 >= this.bq && var6 < this.bj - 1) {
                                       var10 = var9[var5][var6 + 1];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * -1999985463 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var3 = true;
                                 }

                                 var4.ab = false;
                                 if (var4.aq != null) {
                                    var10 = var4.aq;
                                    if (var10.ai != null) {
                                       if (!this.cj(0, var5, var6)) {
                                          var1.aw(this, var10.ai, 0, var5, var6, 1968773784);
                                       }
                                    } else if (var10.ay != null && !this.cj(0, var5, var6)) {
                                       var1.ak(this, var10.ay, var5, var6, (byte)109);
                                    }

                                    var11 = var10.as;
                                    if (var11 != null) {
                                       var1.ap(var11.ay, 0, var11.aw * 793298009, var11.ap * -1500771725, var11.ak * 38361615, var11.ae * -1505290071759269005L);
                                    }

                                    for(var12 = 0; var12 < var10.au * 2050644103; ++var12) {
                                       var13 = var10.an[var12];
                                       if (var13 != null) {
                                          var1.ap(var13.ai, var13.ay * 180883073, var13.ak * -1132497298, var13.aw * 247188639, var13.aj * 174395096, var13.ao * -4002139674731118243L);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var4.ai != null) {
                                    if (!this.cj(var8, var5, var6)) {
                                       var22 = true;
                                       if (var4.ai.ak * 162493835 != 12345678 || var7 <= this.bu) {
                                          var1.aw(this, var4.ai, var8, var5, var6, -1315999589);
                                       }
                                    }
                                 } else if (var4.ay != null && !this.cj(var8, var5, var6)) {
                                    var22 = true;
                                    var1.ak(this, var4.ay, var5, var6, (byte)110);
                                 }

                                 var21 = 0;
                                 var12 = 0;
                                 ka var23 = var4.as;
                                 ku var14 = var4.ae;
                                 if (var23 != null || var14 != null) {
                                    if (this.bb == var5) {
                                       ++var21;
                                    } else if (this.bb < var5) {
                                       var21 += 2;
                                    }

                                    if (this.bq == var6) {
                                       var21 += 3;
                                    } else if (this.bq > var6) {
                                       var21 += 6;
                                    }

                                    var12 = cn[var21];
                                    var4.ax = cf[var21] * -1163983431;
                                 }

                                 if (var23 != null) {
                                    if ((var23.aj * -1674755825 & co[var21]) != 0) {
                                       if (var23.aj * -1674755825 == 16) {
                                          var4.ad = -1749390123;
                                          var4.ac = cl[var21] * -611618347;
                                          var4.av = 176148625 - var4.ac * -1742345655;
                                       } else if (var23.aj * 1300719885 == 1807937103) {
                                          var4.ad = 796187050;
                                          var4.ac = cp[var21] * 1768243613;
                                          var4.av = 14039741 - var4.ac * -924791523;
                                       } else if (var23.aj * -1674755825 == 64) {
                                          var4.ad = 239909030;
                                          var4.ac = cv[var21] * 1607793537;
                                          var4.av = -1671845789 - var4.ac * -924791523;
                                       } else {
                                          var4.ad = -953203073;
                                          var4.ac = cy[var21] * -611618347;
                                          var4.av = -437311703 - var4.ac * -924791523;
                                       }
                                    } else {
                                       var4.ad = 0;
                                    }

                                    if ((var23.aj * -1674755825 & var12) != 0 && !this.cm(var8, var5, var6, var23.aj * -1674755825)) {
                                       var1.ap(var23.ay, 0, var23.aw * -372629602, var23.ap * -1142749398, var23.ak * 420163547, var23.ae * -1505290071759269005L);
                                    }

                                    if ((var23.ai * -1214908109 & var12) != 0 && !this.cm(var8, var5, var6, var23.ai * -1214908109)) {
                                       var1.ap(var23.as, 0, var23.aw * 1971736427, var23.ap * -1500771725, var23.ak * 420163547, var23.ae * -1505290071759269005L);
                                    }
                                 }

                                 if (var14 != null && !this.cw(var8, var5, var6, var14.ae.ez * 691319387)) {
                                    if ((var14.aj * -1058608153 & var12) != 0) {
                                       var1.ap(var14.ae, 0, var14.aw * 908660977 + var14.ay * 454787773, var14.ap * 1760494280, var14.ak * -548065823 + var14.as * 1489115595, var14.at * 7961066021200506019L);
                                    } else if (var14.aj * -1761687149 == 1999610003) {
                                       var15 = var14.aw * 908660977 - this.bv;
                                       var16 = var14.ak * -131810465 - this.bk;
                                       var17 = var14.ai * -942637765;
                                       if (var17 != 1 && var17 != 2) {
                                          var18 = var15;
                                       } else {
                                          var18 = -var15;
                                       }

                                       if (var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if (var19 < var18) {
                                          var1.ap(var14.ae, 0, var14.aw * 908660977 + var14.ay * 1151612220, var14.ap * 872288307, var14.ak * 1185933704 + var14.as * 1489115595, var14.at * 7961066021200506019L);
                                       } else if (var14.am != null) {
                                          var1.ap(var14.am, 0, var14.aw * 52114005, var14.ap * 512272339, var14.ak * -1701503231, var14.at * 7961066021200506019L);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    jd var27 = var4.am;
                                    if (var27 != null) {
                                       var1.ap(var27.aj, 0, var27.aw * 243630573, var27.ap * -131403051, var27.ak * -867994173, var27.ai * -3473567591769140085L);
                                    }

                                    is var31 = var4.at;
                                    if (var31 != null && var31.ae * 1986226129 == 0) {
                                       if (var31.ai != null) {
                                          var1.ap(var31.ai, 0, var31.aw * 83642561, var31.ap * 1971597997, var31.ak * 1751064926, var31.as * -7408577255103144717L);
                                       }

                                       if (var31.ay != null) {
                                          var1.ap(var31.ay, 0, var31.aw * 83642561, var31.ap * -740025286, var31.ak * -683364687, var31.as * -7408577255103144717L);
                                       }

                                       if (var31.aj != null) {
                                          var1.ap(var31.aj, 0, var31.aw * 83642561, var31.ap * 2084590773, var31.ak * 1676708640, var31.as * -7408577255103144717L);
                                       }
                                    }
                                 }

                                 var15 = var4.af * -1999985463;
                                 if (var15 != 0) {
                                    if (var5 < this.bb && var5 >= this.aa && var5 < this.ah - 1 && (var15 & 4) != 0) {
                                       var33 = var9[var5 + 1][var6];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }

                                    if (var6 < this.bq && var6 >= this.bh && var6 < this.bj - 1 && (var15 & 2) != 0) {
                                       var33 = var9[var5][var6 + 1];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }

                                    if (var5 > this.bb && var5 > this.aa && var5 < this.ah && (var15 & 1) != 0) {
                                       var33 = var9[var5 - 1][var6];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }

                                    if (var6 > this.bq && var6 > this.bh && var6 < this.bj && (var15 & 8) != 0) {
                                       var33 = var9[var5][var6 - 1];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var4.ad * -1376107145 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var4.au * -1672698019; ++var21) {
                                    if (var4.an[var21].an * 994747943 != this.al && (var4.ao[var21] & var4.ad * -1376107145) == var4.ac * 895089627) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var11 = var4.as;
                                    if (!this.cm(var8, var5, var6, var11.aj * -1096575238)) {
                                       var1.ap(var11.ay, 0, var11.aw * -1465529303, var11.ap * -339483214, var11.ak * 2105091557, var11.ae * -1505290071759269005L);
                                    }

                                    var4.ad = 0;
                                 }
                              }

                              if (!var4.ag) {
                                 break;
                              }

                              try {
                                 int var25 = var4.au * -1418309540;
                                 var4.ag = false;
                                 var21 = 0;

                                 label592:
                                 for(var12 = 0; var12 < var25; ++var12) {
                                    var13 = var4.an[var12];
                                    if (var13.an * -848412677 != this.al) {
                                       for(var26 = var13.as * 1663649347; var26 <= var13.ae * -1650103875; ++var26) {
                                          for(var15 = var13.am * -1851253352; var15 <= var13.at * 1477952813; ++var15) {
                                             var33 = var9[var26][var15];
                                             if (var33.ab) {
                                                var4.ag = true;
                                                continue label592;
                                             }

                                             if (var33.ad * -1789025546 != 0) {
                                                var17 = 0;
                                                if (var26 > var13.as * 637763503) {
                                                   ++var17;
                                                }

                                                if (var26 < var13.ae * -1650103875) {
                                                   var17 += 4;
                                                }

                                                if (var15 > var13.am * -1679599593) {
                                                   var17 += 8;
                                                }

                                                if (var15 < var13.at * -1772771443) {
                                                   var17 += 2;
                                                }

                                                if ((var17 & var33.ad * -1376107145) == var4.av * 744008607) {
                                                   var4.ag = true;
                                                   continue label592;
                                                }
                                             }
                                          }
                                       }

                                       this.br[var21++] = var13;
                                       var26 = this.bb - var13.as * 1663649347;
                                       var15 = var13.ae * -1650103875 - this.bb;
                                       if (var15 > var26) {
                                          var26 = var15;
                                       }

                                       var16 = this.bq - var13.am * -1679599593;
                                       var17 = var13.at * 448238624 - this.bq;
                                       if (var17 > var16) {
                                          var13.au = (var26 + var17) * 1017141597;
                                       } else {
                                          var13.au = (var26 + var16) * 1331491770;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var12 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       kf var34 = this.br[var26];
                                       if (var34.an * -1516300650 != this.al) {
                                          if (var34.au * -621100299 > var12) {
                                             var12 = var34.au * 1510667392;
                                             var24 = var26;
                                          } else if (var34.au * -477076126 == var12) {
                                             var16 = var34.ak * 513105251 - this.bv;
                                             var17 = var34.aj * 1093960855 - this.bk;
                                             var18 = this.br[var24].ak * 1605079546 - this.bv;
                                             var19 = this.br[var24].aj * 1429710619 - this.bk;
                                             if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    kf var35 = this.br[var24];
                                    var35.an = this.al * 1440116266;
                                    if (!this.ca(var8, var35.as * 1663649347, var35.ae * -1650103875, var35.am * -1679599593, var35.at * -1772771443, var35.ai.ez * -1166930685)) {
                                       var1.ap(var35.ai, var35.ay * 180883073, var35.ak * -1435834495, var35.aw * 174717786, var35.aj * -1688437371, var35.ao * -4002139674731118243L);
                                    }

                                    for(var15 = var35.as * 1663649347; var15 <= var35.ae * -1616054042; ++var15) {
                                       for(var16 = var35.am * -230168642; var16 <= var35.at * -1772771443; ++var16) {
                                          jw var36 = var9[var15][var16];
                                          if (var36.ad * -1376107145 != 0) {
                                             this.ci.aw(var36);
                                          } else if ((var15 != var5 || var16 != var6) && var36.az) {
                                             this.ci.aw(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var4.ag) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var4.ag = false;
                                 break;
                              }
                           }
                        } while(!var4.az);
                     } while(var4.ad * -1376107145 != 0);

                     if (var5 > this.bb || var5 <= this.aa) {
                        break;
                     }

                     var10 = var9[var5 - 1][var6];
                  } while(var10 != null && var10.az);

                  if (var5 < this.bb || var5 >= this.ah - 1) {
                     break;
                  }

                  var10 = var9[var5 + 1][var6];
               } while(var10 != null && var10.az);

               if (var6 > this.bq || var6 <= this.bh) {
                  break;
               }

               var10 = var9[var5][var6 - 1];
            } while(var10 != null && var10.az);

            if (var6 < this.bq || var6 >= this.bj - 1) {
               break;
            }

            var10 = var9[var5][var6 + 1];
         } while(var10 != null && var10.az);

         var4.az = false;
         --this.ax;
         is var29 = var4.at;
         if (var29 != null && var29.ae * 953256900 != 0) {
            if (var29.ai != null) {
               var1.ap(var29.ai, 0, var29.aw * 83642561, var29.ap * 1971597997 - var29.ae * 1399229462, var29.ak * 716656262, var29.as * -7408577255103144717L);
            }

            if (var29.ay != null) {
               var1.ap(var29.ay, 0, var29.aw * 1349372863, var29.ap * 1971597997 - var29.ae * 1986226129, var29.ak * -966406850, var29.as * -7408577255103144717L);
            }

            if (var29.aj != null) {
               var1.ap(var29.aj, 0, var29.aw * -303440882, var29.ap * -722250871 - var29.ae * -1933648610, var29.ak * 1187824885, var29.as * -7408577255103144717L);
            }
         }

         if (var4.ax * 460016958 != 0) {
            ku var30 = var4.ae;
            if (var30 != null && !this.cw(var8, var5, var6, var30.ae.ez * -274986519)) {
               if ((var30.aj * -87266024 & var4.ax * 80173105) != 0) {
                  var1.ap(var30.ae, 0, var30.aw * 1329023732 + var30.ay * -409919077, var30.ap * 1696594664, var30.ak * -781553030 + var30.as * -441078442, var30.at * 7961066021200506019L);
               } else if (var30.aj * -1058608153 == 256) {
                  var12 = var30.aw * 908660977 - this.bv;
                  var24 = var30.ak * 98982161 - this.bk;
                  var26 = var30.ai * -942637765;
                  if (var26 != 1 && var26 != 2) {
                     var15 = var12;
                  } else {
                     var15 = -var12;
                  }

                  if (var26 != 2 && var26 != 3) {
                     var16 = var24;
                  } else {
                     var16 = -var24;
                  }

                  if (var16 >= var15) {
                     var1.ap(var30.ae, 0, var30.aw * 1219829571 + var30.ay * -1822416883, var30.ap * 512272339, var30.ak * 98110665 + var30.as * 34774286, var30.at * 7961066021200506019L);
                  } else if (var30.am != null) {
                     var1.ap(var30.am, 0, var30.aw * 908660977, var30.ap * 512272339, var30.ak * 98110665, var30.at * 7961066021200506019L);
                  }
               }
            }

            ka var28 = var4.as;
            if (var28 != null) {
               if ((var28.ai * -1214908109 & var4.ax * 1678602377) != 0 && !this.cm(var8, var5, var6, var28.ai * -1214908109)) {
                  var1.ap(var28.as, 0, var28.aw * 156655306, var28.ap * -1500771725, var28.ak * 420163547, var28.ae * -1505290071759269005L);
               }

               if ((var28.aj * -1674755825 & var4.ax * 1678602377) != 0 && !this.cm(var8, var5, var6, var28.aj * -1674755825)) {
                  var1.ap(var28.ay, 0, var28.aw * 793298009, var28.ap * -1500771725, var28.ak * 420163547, var28.ae * -1505290071759269005L);
               }
            }
         }

         jw var32;
         if (var7 < this.aj - 1) {
            var32 = this.ae[var7 + 1][var5][var6];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var5 < this.bb && var5 >= this.aa && var5 < this.ah - 1) {
            var32 = var9[var5 + 1][var6];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var6 < this.bq && var6 >= this.bh && var6 < this.bj - 1) {
            var32 = var9[var5][var6 + 1];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var5 > this.bb && var5 > this.aa && var5 < this.ah) {
            var32 = var9[var5 - 1][var6];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var6 > this.bq && var6 > this.bh && var6 < this.bj) {
            var32 = var9[var5][var6 - 1];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }
      }
   }

   void ie(jz var1, jw var2, boolean var3) {
      this.ci.aw(var2);

      while(true) {
         jw var4;
         int var5;
         int var6;
         int var7;
         int var8;
         jw[][] var9;
         jw var10;
         int var12;
         int var15;
         int var16;
         int var24;
         int var26;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              ka var11;
                              kf var13;
                              int var17;
                              int var18;
                              int var19;
                              int var21;
                              boolean var22;
                              jw var33;
                              while(true) {
                                 do {
                                    var4 = (jw)this.ci.ai();
                                    if (var4 == null) {
                                       return;
                                    }
                                 } while(!var4.az);

                                 var5 = var4.aw * 913761943;
                                 var6 = var4.ak * -1662997057;
                                 var7 = var4.ap * -1546622976;
                                 var8 = var4.aj * -1013546863;
                                 var9 = this.ae[var7];
                                 if (!var4.ab) {
                                    break;
                                 }

                                 if (var3) {
                                    if (var7 > 0) {
                                       var10 = this.ae[var7 - 1][var5][var6];
                                       if (var10 != null && var10.az) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= this.bb && var5 > this.aa) {
                                       var10 = var9[var5 - 1][var6];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * -1999985463 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= this.bb && var5 < this.ah - 1) {
                                       var10 = var9[var5 + 1][var6];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * -1999985463 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 <= this.bq && var6 > this.bh) {
                                       var10 = var9[var5][var6 - 1];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * -1829174050 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 >= this.bq && var6 < this.bj - 1) {
                                       var10 = var9[var5][var6 + 1];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * 1340073223 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var3 = true;
                                 }

                                 var4.ab = false;
                                 if (var4.aq != null) {
                                    var10 = var4.aq;
                                    if (var10.ai != null) {
                                       if (!this.cj(0, var5, var6)) {
                                          var1.aw(this, var10.ai, 0, var5, var6, 1549090246);
                                       }
                                    } else if (var10.ay != null && !this.cj(0, var5, var6)) {
                                       var1.ak(this, var10.ay, var5, var6, (byte)98);
                                    }

                                    var11 = var10.as;
                                    if (var11 != null) {
                                       var1.ap(var11.ay, 0, var11.aw * 544997099, var11.ap * -1500771725, var11.ak * 479136820, var11.ae * -1505290071759269005L);
                                    }

                                    for(var12 = 0; var12 < var10.au * 576629931; ++var12) {
                                       var13 = var10.an[var12];
                                       if (var13 != null) {
                                          var1.ap(var13.ai, var13.ay * 1773061503, var13.ak * -638615745, var13.aw * -1080639073, var13.aj * 2047852750, var13.ao * -4002139674731118243L);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var4.ai != null) {
                                    if (!this.cj(var8, var5, var6)) {
                                       var22 = true;
                                       if (var4.ai.ak * -1138023181 != 12345678 || var7 <= this.bu) {
                                          var1.aw(this, var4.ai, var8, var5, var6, -1812725909);
                                       }
                                    }
                                 } else if (var4.ay != null && !this.cj(var8, var5, var6)) {
                                    var22 = true;
                                    var1.ak(this, var4.ay, var5, var6, (byte)79);
                                 }

                                 var21 = 0;
                                 var12 = 0;
                                 ka var23 = var4.as;
                                 ku var14 = var4.ae;
                                 if (var23 != null || var14 != null) {
                                    if (this.bb == var5) {
                                       ++var21;
                                    } else if (this.bb < var5) {
                                       var21 += 2;
                                    }

                                    if (this.bq == var6) {
                                       var21 += 3;
                                    } else if (this.bq > var6) {
                                       var21 += 6;
                                    }

                                    var12 = cn[var21];
                                    var4.ax = cf[var21] * -1434114181;
                                 }

                                 if (var23 != null) {
                                    if ((var23.aj * -1241097694 & co[var21]) != 0) {
                                       if (var23.aj * -1674755825 == 16) {
                                          var4.ad = -1021766362;
                                          var4.ac = cl[var21] * -611618347;
                                          var4.av = 1879714654 - var4.ac * -282477361;
                                       } else if (var23.aj * -1966248394 == 32) {
                                          var4.ad = 796187050;
                                          var4.ac = cp[var21] * 2090800282;
                                          var4.av = -1730158684 - var4.ac * -244357894;
                                       } else if (var23.aj * 493788886 == 64) {
                                          var4.ad = -1442036957;
                                          var4.ac = cv[var21] * -611618347;
                                          var4.av = -1190576088 - var4.ac * 416545368;
                                       } else {
                                          var4.ad = -953203073;
                                          var4.ac = cy[var21] * -611618347;
                                          var4.av = -437311703 - var4.ac * -924791523;
                                       }
                                    } else {
                                       var4.ad = 0;
                                    }

                                    if ((var23.aj * -1674755825 & var12) != 0 && !this.cm(var8, var5, var6, var23.aj * -1674755825)) {
                                       var1.ap(var23.ay, 0, var23.aw * 793298009, var23.ap * -1500771725, var23.ak * 1272086616, var23.ae * -1505290071759269005L);
                                    }

                                    if ((var23.ai * -1214908109 & var12) != 0 && !this.cm(var8, var5, var6, var23.ai * -1214908109)) {
                                       var1.ap(var23.as, 0, var23.aw * -1996658750, var23.ap * -1723073095, var23.ak * 420163547, var23.ae * -1505290071759269005L);
                                    }
                                 }

                                 if (var14 != null && !this.cw(var8, var5, var6, var14.ae.ez * -274986519)) {
                                    if ((var14.aj * -1058608153 & var12) != 0) {
                                       var1.ap(var14.ae, 0, var14.aw * 908660977 + var14.ay * 454787773, var14.ap * 720390958, var14.ak * 98110665 + var14.as * 1489115595, var14.at * 7961066021200506019L);
                                    } else if (var14.aj * -1058608153 == -1449132214) {
                                       var15 = var14.aw * 908660977 - this.bv;
                                       var16 = var14.ak * 608730057 - this.bk;
                                       var17 = var14.ai * -942637765;
                                       if (var17 != 1 && var17 != 2) {
                                          var18 = var15;
                                       } else {
                                          var18 = -var15;
                                       }

                                       if (var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if (var19 < var18) {
                                          var1.ap(var14.ae, 0, var14.aw * 908660977 + var14.ay * 1453979104, var14.ap * 512272339, var14.ak * -1122278005 + var14.as * -1791890625, var14.at * 7961066021200506019L);
                                       } else if (var14.am != null) {
                                          var1.ap(var14.am, 0, var14.aw * 908660977, var14.ap * 512272339, var14.ak * 1411429411, var14.at * 7961066021200506019L);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    jd var27 = var4.am;
                                    if (var27 != null) {
                                       var1.ap(var27.aj, 0, var27.aw * -1295155272, var27.ap * -1578279525, var27.ak * 637123369, var27.ai * -3473567591769140085L);
                                    }

                                    is var31 = var4.at;
                                    if (var31 != null && var31.ae * 1986226129 == 0) {
                                       if (var31.ai != null) {
                                          var1.ap(var31.ai, 0, var31.aw * -963661729, var31.ap * 590271242, var31.ak * 1187824885, var31.as * -7408577255103144717L);
                                       }

                                       if (var31.ay != null) {
                                          var1.ap(var31.ay, 0, var31.aw * 850000163, var31.ap * 1523754686, var31.ak * 1187824885, var31.as * -7408577255103144717L);
                                       }

                                       if (var31.aj != null) {
                                          var1.ap(var31.aj, 0, var31.aw * 83642561, var31.ap * 1971597997, var31.ak * 1187824885, var31.as * -7408577255103144717L);
                                       }
                                    }
                                 }

                                 var15 = var4.af * -1999985463;
                                 if (var15 != 0) {
                                    if (var5 < this.bb && var5 >= this.aa && var5 < this.ah - 1 && (var15 & 4) != 0) {
                                       var33 = var9[var5 + 1][var6];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }

                                    if (var6 < this.bq && var6 >= this.bh && var6 < this.bj - 1 && (var15 & 2) != 0) {
                                       var33 = var9[var5][var6 + 1];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }

                                    if (var5 > this.bb && var5 > this.aa && var5 < this.ah && (var15 & 1) != 0) {
                                       var33 = var9[var5 - 1][var6];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }

                                    if (var6 > this.bq && var6 > this.bh && var6 < this.bj && (var15 & 8) != 0) {
                                       var33 = var9[var5][var6 - 1];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var4.ad * -1376107145 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var4.au * 1018484303; ++var21) {
                                    if (var4.an[var21].an * -814438507 != this.al && (var4.ao[var21] & var4.ad * -1376107145) == var4.ac * 276250971) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var11 = var4.as;
                                    if (!this.cm(var8, var5, var6, var11.aj * -1253190560)) {
                                       var1.ap(var11.ay, 0, var11.aw * -620803242, var11.ap * -1500771725, var11.ak * 766617496, var11.ae * -1505290071759269005L);
                                    }

                                    var4.ad = 0;
                                 }
                              }

                              if (!var4.ag) {
                                 break;
                              }

                              try {
                                 int var25 = var4.au * 1188216210;
                                 var4.ag = false;
                                 var21 = 0;

                                 label592:
                                 for(var12 = 0; var12 < var25; ++var12) {
                                    var13 = var4.an[var12];
                                    if (var13.an * -814438507 != this.al) {
                                       for(var26 = var13.as * 1663649347; var26 <= var13.ae * -1650103875; ++var26) {
                                          for(var15 = var13.am * -1150017868; var15 <= var13.at * -393174949; ++var15) {
                                             var33 = var9[var26][var15];
                                             if (var33.ab) {
                                                var4.ag = true;
                                                continue label592;
                                             }

                                             if (var33.ad * -1376107145 != 0) {
                                                var17 = 0;
                                                if (var26 > var13.as * -1954117427) {
                                                   ++var17;
                                                }

                                                if (var26 < var13.ae * 1783979154) {
                                                   var17 += 4;
                                                }

                                                if (var15 > var13.am * -679714099) {
                                                   var17 += 8;
                                                }

                                                if (var15 < var13.at * -763013583) {
                                                   var17 += 2;
                                                }

                                                if ((var17 & var33.ad * -1376107145) == var4.av * -1576638113) {
                                                   var4.ag = true;
                                                   continue label592;
                                                }
                                             }
                                          }
                                       }

                                       this.br[var21++] = var13;
                                       var26 = this.bb - var13.as * 1038063253;
                                       var15 = var13.ae * -1650103875 - this.bb;
                                       if (var15 > var26) {
                                          var26 = var15;
                                       }

                                       var16 = this.bq - var13.am * -1679599593;
                                       var17 = var13.at * 2049293790 - this.bq;
                                       if (var17 > var16) {
                                          var13.au = (var26 + var17) * 1017141597;
                                       } else {
                                          var13.au = (var26 + var16) * 1017141597;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var12 = -1466502952;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       kf var34 = this.br[var26];
                                       if (var34.an * -419466032 != this.al) {
                                          if (var34.au * -621100299 > var12) {
                                             var12 = var34.au * -621100299;
                                             var24 = var26;
                                          } else if (var34.au * -621100299 == var12) {
                                             var16 = var34.ak * -1574136472 - this.bv;
                                             var17 = var34.aj * 574183213 - this.bk;
                                             var18 = this.br[var24].ak * 513105251 - this.bv;
                                             var19 = this.br[var24].aj * -510259444 - this.bk;
                                             if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    kf var35 = this.br[var24];
                                    var35.an = this.al * -1950183876;
                                    if (!this.ca(var8, var35.as * 332044399, var35.ae * -1650103875, var35.am * 1308438295, var35.at * -875704305, var35.ai.ez * -380193514)) {
                                       var1.ap(var35.ai, var35.ay * 180883073, var35.ak * 513105251, var35.aw * -1080639073, var35.aj * 1093960855, var35.ao * -4002139674731118243L);
                                    }

                                    for(var15 = var35.as * 1791676535; var15 <= var35.ae * -1650103875; ++var15) {
                                       for(var16 = var35.am * 952868515; var16 <= var35.at * -1772771443; ++var16) {
                                          jw var36 = var9[var15][var16];
                                          if (var36.ad * 976562237 != 0) {
                                             this.ci.aw(var36);
                                          } else if ((var15 != var5 || var16 != var6) && var36.az) {
                                             this.ci.aw(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var4.ag) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var4.ag = false;
                                 break;
                              }
                           }
                        } while(!var4.az);
                     } while(var4.ad * 699872273 != 0);

                     if (var5 > this.bb || var5 <= this.aa) {
                        break;
                     }

                     var10 = var9[var5 - 1][var6];
                  } while(var10 != null && var10.az);

                  if (var5 < this.bb || var5 >= this.ah - 1) {
                     break;
                  }

                  var10 = var9[var5 + 1][var6];
               } while(var10 != null && var10.az);

               if (var6 > this.bq || var6 <= this.bh) {
                  break;
               }

               var10 = var9[var5][var6 - 1];
            } while(var10 != null && var10.az);

            if (var6 < this.bq || var6 >= this.bj - 1) {
               break;
            }

            var10 = var9[var5][var6 + 1];
         } while(var10 != null && var10.az);

         var4.az = false;
         --this.ax;
         is var29 = var4.at;
         if (var29 != null && var29.ae * -1206638681 != 0) {
            if (var29.ai != null) {
               var1.ap(var29.ai, 0, var29.aw * 83642561, var29.ap * -564329914 - var29.ae * -1746171737, var29.ak * 1187824885, var29.as * -7408577255103144717L);
            }

            if (var29.ay != null) {
               var1.ap(var29.ay, 0, var29.aw * 83642561, var29.ap * 870970723 - var29.ae * 1986226129, var29.ak * 1187824885, var29.as * -7408577255103144717L);
            }

            if (var29.aj != null) {
               var1.ap(var29.aj, 0, var29.aw * 83642561, var29.ap * 1971597997 - var29.ae * 1986226129, var29.ak * 1187824885, var29.as * -7408577255103144717L);
            }
         }

         if (var4.ax * 1678602377 != 0) {
            ku var30 = var4.ae;
            if (var30 != null && !this.cw(var8, var5, var6, var30.ae.ez * 2017418073)) {
               if ((var30.aj * -928883379 & var4.ax * 1678602377) != 0) {
                  var1.ap(var30.ae, 0, var30.aw * 908660977 + var30.ay * 28081860, var30.ap * 84846847, var30.ak * -65647436 + var30.as * 1489115595, var30.at * 7961066021200506019L);
               } else if (var30.aj * -1058608153 == 256) {
                  var12 = var30.aw * 908660977 - this.bv;
                  var24 = var30.ak * 1911774325 - this.bk;
                  var26 = var30.ai * -942637765;
                  if (var26 != 1 && var26 != 2) {
                     var15 = var12;
                  } else {
                     var15 = -var12;
                  }

                  if (var26 != 2 && var26 != 3) {
                     var16 = var24;
                  } else {
                     var16 = -var24;
                  }

                  if (var16 >= var15) {
                     var1.ap(var30.ae, 0, var30.aw * 2041210318 + var30.ay * 473772660, var30.ap * 512272339, var30.ak * -378014210 + var30.as * -894689700, var30.at * 7961066021200506019L);
                  } else if (var30.am != null) {
                     var1.ap(var30.am, 0, var30.aw * 908660977, var30.ap * 512272339, var30.ak * 98110665, var30.at * 7961066021200506019L);
                  }
               }
            }

            ka var28 = var4.as;
            if (var28 != null) {
               if ((var28.ai * -1214908109 & var4.ax * 1204395617) != 0 && !this.cm(var8, var5, var6, var28.ai * 934189166)) {
                  var1.ap(var28.as, 0, var28.aw * 793298009, var28.ap * -1500771725, var28.ak * 121970826, var28.ae * -1505290071759269005L);
               }

               if ((var28.aj * -723878597 & var4.ax * -413881356) != 0 && !this.cm(var8, var5, var6, var28.aj * -1674755825)) {
                  var1.ap(var28.ay, 0, var28.aw * 793298009, var28.ap * -235045581, var28.ak * 1283385115, var28.ae * -1505290071759269005L);
               }
            }
         }

         jw var32;
         if (var7 < this.aj - 1) {
            var32 = this.ae[var7 + 1][var5][var6];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var5 < this.bb && var5 >= this.aa && var5 < this.ah - 1) {
            var32 = var9[var5 + 1][var6];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var6 < this.bq && var6 >= this.bh && var6 < this.bj - 1) {
            var32 = var9[var5][var6 + 1];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var5 > this.bb && var5 > this.aa && var5 < this.ah) {
            var32 = var9[var5 - 1][var6];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var6 > this.bq && var6 > this.bh && var6 < this.bj) {
            var32 = var9[var5][var6 - 1];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }
      }
   }

   void im(jz var1, jw var2, boolean var3) {
      this.ci.aw(var2);

      while(true) {
         jw var4;
         int var5;
         int var6;
         int var7;
         int var8;
         jw[][] var9;
         jw var10;
         int var12;
         int var15;
         int var16;
         int var24;
         int var26;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              ka var11;
                              kf var13;
                              int var17;
                              int var18;
                              int var19;
                              int var21;
                              boolean var22;
                              jw var33;
                              while(true) {
                                 do {
                                    var4 = (jw)this.ci.ai();
                                    if (var4 == null) {
                                       return;
                                    }
                                 } while(!var4.az);

                                 var5 = var4.aw * 913761943;
                                 var6 = var4.ak * -2130835639;
                                 var7 = var4.ap * -1153163;
                                 var8 = var4.aj * -1013546863;
                                 var9 = this.ae[var7];
                                 if (!var4.ab) {
                                    break;
                                 }

                                 if (var3) {
                                    if (var7 > 0) {
                                       var10 = this.ae[var7 - 1][var5][var6];
                                       if (var10 != null && var10.az) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= this.bb && var5 > this.aa) {
                                       var10 = var9[var5 - 1][var6];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * -1999985463 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= this.bb && var5 < this.ah - 1) {
                                       var10 = var9[var5 + 1][var6];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * -1999985463 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 <= this.bq && var6 > this.bh) {
                                       var10 = var9[var5][var6 - 1];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * -1999985463 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 >= this.bq && var6 < this.bj - 1) {
                                       var10 = var9[var5][var6 + 1];
                                       if (var10 != null && var10.az && (var10.ab || (var4.af * -1999985463 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var3 = true;
                                 }

                                 var4.ab = false;
                                 if (var4.aq != null) {
                                    var10 = var4.aq;
                                    if (var10.ai != null) {
                                       if (!this.cj(0, var5, var6)) {
                                          var1.aw(this, var10.ai, 0, var5, var6, 1853747459);
                                       }
                                    } else if (var10.ay != null && !this.cj(0, var5, var6)) {
                                       var1.ak(this, var10.ay, var5, var6, (byte)79);
                                    }

                                    var11 = var10.as;
                                    if (var11 != null) {
                                       var1.ap(var11.ay, 0, var11.aw * 793298009, var11.ap * -1500771725, var11.ak * 420163547, var11.ae * -1505290071759269005L);
                                    }

                                    for(var12 = 0; var12 < var10.au * 2050644103; ++var12) {
                                       var13 = var10.an[var12];
                                       if (var13 != null) {
                                          var1.ap(var13.ai, var13.ay * 180883073, var13.ak * 513105251, var13.aw * -1080639073, var13.aj * 1093960855, var13.ao * -4002139674731118243L);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var4.ai != null) {
                                    if (!this.cj(var8, var5, var6)) {
                                       var22 = true;
                                       if (var4.ai.ak * -1442215975 != 12345678 || var7 <= this.bu) {
                                          var1.aw(this, var4.ai, var8, var5, var6, 1305939596);
                                       }
                                    }
                                 } else if (var4.ay != null && !this.cj(var8, var5, var6)) {
                                    var22 = true;
                                    var1.ak(this, var4.ay, var5, var6, (byte)114);
                                 }

                                 var21 = 0;
                                 var12 = 0;
                                 ka var23 = var4.as;
                                 ku var14 = var4.ae;
                                 if (var23 != null || var14 != null) {
                                    if (this.bb == var5) {
                                       ++var21;
                                    } else if (this.bb < var5) {
                                       var21 += 2;
                                    }

                                    if (this.bq == var6) {
                                       var21 += 3;
                                    } else if (this.bq > var6) {
                                       var21 += 6;
                                    }

                                    var12 = cn[var21];
                                    var4.ax = cf[var21] * -1163983431;
                                 }

                                 if (var23 != null) {
                                    if ((var23.aj * -1674755825 & co[var21]) != 0) {
                                       if (var23.aj * -1674755825 == 16) {
                                          var4.ad = -1749390123;
                                          var4.ac = cl[var21] * -611618347;
                                          var4.av = -1577426333 - var4.ac * -924791523;
                                       } else if (var23.aj * -1674755825 == 32) {
                                          var4.ad = 796187050;
                                          var4.ac = cp[var21] * -611618347;
                                          var4.av = 1140114630 - var4.ac * -924791523;
                                       } else if (var23.aj * -1674755825 == 64) {
                                          var4.ad = 1592374100;
                                          var4.ac = cv[var21] * -611618347;
                                          var4.av = -2014738036 - var4.ac * -924791523;
                                       } else {
                                          var4.ad = -953203073;
                                          var4.ac = cy[var21] * -611618347;
                                          var4.av = -437311703 - var4.ac * -924791523;
                                       }
                                    } else {
                                       var4.ad = 0;
                                    }

                                    if ((var23.aj * -1674755825 & var12) != 0 && !this.cm(var8, var5, var6, var23.aj * -1674755825)) {
                                       var1.ap(var23.ay, 0, var23.aw * 793298009, var23.ap * -1500771725, var23.ak * 420163547, var23.ae * -1505290071759269005L);
                                    }

                                    if ((var23.ai * -1214908109 & var12) != 0 && !this.cm(var8, var5, var6, var23.ai * -1214908109)) {
                                       var1.ap(var23.as, 0, var23.aw * 793298009, var23.ap * -1500771725, var23.ak * 420163547, var23.ae * -1505290071759269005L);
                                    }
                                 }

                                 if (var14 != null && !this.cw(var8, var5, var6, var14.ae.ez * -274986519)) {
                                    if ((var14.aj * -1058608153 & var12) != 0) {
                                       var1.ap(var14.ae, 0, var14.aw * 908660977 + var14.ay * 454787773, var14.ap * 512272339, var14.ak * 98110665 + var14.as * 1489115595, var14.at * 7961066021200506019L);
                                    } else if (var14.aj * -1058608153 == 256) {
                                       var15 = var14.aw * 908660977 - this.bv;
                                       var16 = var14.ak * 98110665 - this.bk;
                                       var17 = var14.ai * -942637765;
                                       if (var17 != 1 && var17 != 2) {
                                          var18 = var15;
                                       } else {
                                          var18 = -var15;
                                       }

                                       if (var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if (var19 < var18) {
                                          var1.ap(var14.ae, 0, var14.aw * 908660977 + var14.ay * 454787773, var14.ap * 512272339, var14.ak * 98110665 + var14.as * 1489115595, var14.at * 7961066021200506019L);
                                       } else if (var14.am != null) {
                                          var1.ap(var14.am, 0, var14.aw * 908660977, var14.ap * 512272339, var14.ak * 98110665, var14.at * 7961066021200506019L);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    jd var27 = var4.am;
                                    if (var27 != null) {
                                       var1.ap(var27.aj, 0, var27.aw * 243630573, var27.ap * -131403051, var27.ak * 637123369, var27.ai * -3473567591769140085L);
                                    }

                                    is var31 = var4.at;
                                    if (var31 != null && var31.ae * 1986226129 == 0) {
                                       if (var31.ai != null) {
                                          var1.ap(var31.ai, 0, var31.aw * 83642561, var31.ap * 1971597997, var31.ak * 1187824885, var31.as * -7408577255103144717L);
                                       }

                                       if (var31.ay != null) {
                                          var1.ap(var31.ay, 0, var31.aw * 83642561, var31.ap * 1971597997, var31.ak * 1187824885, var31.as * -7408577255103144717L);
                                       }

                                       if (var31.aj != null) {
                                          var1.ap(var31.aj, 0, var31.aw * 83642561, var31.ap * 1971597997, var31.ak * 1187824885, var31.as * -7408577255103144717L);
                                       }
                                    }
                                 }

                                 var15 = var4.af * -1999985463;
                                 if (var15 != 0) {
                                    if (var5 < this.bb && var5 >= this.aa && var5 < this.ah - 1 && (var15 & 4) != 0) {
                                       var33 = var9[var5 + 1][var6];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }

                                    if (var6 < this.bq && var6 >= this.bh && var6 < this.bj - 1 && (var15 & 2) != 0) {
                                       var33 = var9[var5][var6 + 1];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }

                                    if (var5 > this.bb && var5 > this.aa && var5 < this.ah && (var15 & 1) != 0) {
                                       var33 = var9[var5 - 1][var6];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }

                                    if (var6 > this.bq && var6 > this.bh && var6 < this.bj && (var15 & 8) != 0) {
                                       var33 = var9[var5][var6 - 1];
                                       if (var33 != null && var33.az) {
                                          this.ci.aw(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var4.ad * -1376107145 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var4.au * 2050644103; ++var21) {
                                    if (var4.an[var21].an * -814438507 != this.al && (var4.ao[var21] & var4.ad * -1376107145) == var4.ac * 424558461) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var11 = var4.as;
                                    if (!this.cm(var8, var5, var6, var11.aj * -1674755825)) {
                                       var1.ap(var11.ay, 0, var11.aw * 793298009, var11.ap * -1500771725, var11.ak * 420163547, var11.ae * -1505290071759269005L);
                                    }

                                    var4.ad = 0;
                                 }
                              }

                              if (!var4.ag) {
                                 break;
                              }

                              try {
                                 int var25 = var4.au * 2050644103;
                                 var4.ag = false;
                                 var21 = 0;

                                 label592:
                                 for(var12 = 0; var12 < var25; ++var12) {
                                    var13 = var4.an[var12];
                                    if (var13.an * -814438507 != this.al) {
                                       for(var26 = var13.as * 1663649347; var26 <= var13.ae * -1650103875; ++var26) {
                                          for(var15 = var13.am * -1679599593; var15 <= var13.at * -1772771443; ++var15) {
                                             var33 = var9[var26][var15];
                                             if (var33.ab) {
                                                var4.ag = true;
                                                continue label592;
                                             }

                                             if (var33.ad * -1376107145 != 0) {
                                                var17 = 0;
                                                if (var26 > var13.as * 1663649347) {
                                                   ++var17;
                                                }

                                                if (var26 < var13.ae * -1650103875) {
                                                   var17 += 4;
                                                }

                                                if (var15 > var13.am * -1679599593) {
                                                   var17 += 8;
                                                }

                                                if (var15 < var13.at * -1772771443) {
                                                   var17 += 2;
                                                }

                                                if ((var17 & var33.ad * -1376107145) == var4.av * -956985887) {
                                                   var4.ag = true;
                                                   continue label592;
                                                }
                                             }
                                          }
                                       }

                                       this.br[var21++] = var13;
                                       var26 = this.bb - var13.as * 1663649347;
                                       var15 = var13.ae * -1650103875 - this.bb;
                                       if (var15 > var26) {
                                          var26 = var15;
                                       }

                                       var16 = this.bq - var13.am * -1679599593;
                                       var17 = var13.at * -1772771443 - this.bq;
                                       if (var17 > var16) {
                                          var13.au = (var26 + var17) * 1017141597;
                                       } else {
                                          var13.au = (var26 + var16) * 1017141597;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var12 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       kf var34 = this.br[var26];
                                       if (var34.an * -814438507 != this.al) {
                                          if (var34.au * -621100299 > var12) {
                                             var12 = var34.au * -621100299;
                                             var24 = var26;
                                          } else if (var34.au * -621100299 == var12) {
                                             var16 = var34.ak * 513105251 - this.bv;
                                             var17 = var34.aj * 1093960855 - this.bk;
                                             var18 = this.br[var24].ak * 513105251 - this.bv;
                                             var19 = this.br[var24].aj * 1093960855 - this.bk;
                                             if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    kf var35 = this.br[var24];
                                    var35.an = this.al * 1749117885;
                                    if (!this.ca(var8, var35.as * 1663649347, var35.ae * -1650103875, var35.am * -1679599593, var35.at * -1772771443, var35.ai.ez * -274986519)) {
                                       var1.ap(var35.ai, var35.ay * 180883073, var35.ak * 513105251, var35.aw * -1080639073, var35.aj * 1093960855, var35.ao * -4002139674731118243L);
                                    }

                                    for(var15 = var35.as * 1663649347; var15 <= var35.ae * -1650103875; ++var15) {
                                       for(var16 = var35.am * -1679599593; var16 <= var35.at * -1772771443; ++var16) {
                                          jw var36 = var9[var15][var16];
                                          if (var36.ad * -1376107145 != 0) {
                                             this.ci.aw(var36);
                                          } else if ((var15 != var5 || var16 != var6) && var36.az) {
                                             this.ci.aw(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var4.ag) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var4.ag = false;
                                 break;
                              }
                           }
                        } while(!var4.az);
                     } while(var4.ad * -1376107145 != 0);

                     if (var5 > this.bb || var5 <= this.aa) {
                        break;
                     }

                     var10 = var9[var5 - 1][var6];
                  } while(var10 != null && var10.az);

                  if (var5 < this.bb || var5 >= this.ah - 1) {
                     break;
                  }

                  var10 = var9[var5 + 1][var6];
               } while(var10 != null && var10.az);

               if (var6 > this.bq || var6 <= this.bh) {
                  break;
               }

               var10 = var9[var5][var6 - 1];
            } while(var10 != null && var10.az);

            if (var6 < this.bq || var6 >= this.bj - 1) {
               break;
            }

            var10 = var9[var5][var6 + 1];
         } while(var10 != null && var10.az);

         var4.az = false;
         --this.ax;
         is var29 = var4.at;
         if (var29 != null && var29.ae * 1986226129 != 0) {
            if (var29.ai != null) {
               var1.ap(var29.ai, 0, var29.aw * 83642561, var29.ap * 1971597997 - var29.ae * 1986226129, var29.ak * 1187824885, var29.as * -7408577255103144717L);
            }

            if (var29.ay != null) {
               var1.ap(var29.ay, 0, var29.aw * 83642561, var29.ap * 1971597997 - var29.ae * 1986226129, var29.ak * 1187824885, var29.as * -7408577255103144717L);
            }

            if (var29.aj != null) {
               var1.ap(var29.aj, 0, var29.aw * 83642561, var29.ap * 1971597997 - var29.ae * 1986226129, var29.ak * 1187824885, var29.as * -7408577255103144717L);
            }
         }

         if (var4.ax * 1678602377 != 0) {
            ku var30 = var4.ae;
            if (var30 != null && !this.cw(var8, var5, var6, var30.ae.ez * -274986519)) {
               if ((var30.aj * -1058608153 & var4.ax * 1678602377) != 0) {
                  var1.ap(var30.ae, 0, var30.aw * 908660977 + var30.ay * 454787773, var30.ap * 512272339, var30.ak * 98110665 + var30.as * 1489115595, var30.at * 7961066021200506019L);
               } else if (var30.aj * -1058608153 == 256) {
                  var12 = var30.aw * 908660977 - this.bv;
                  var24 = var30.ak * 98110665 - this.bk;
                  var26 = var30.ai * -942637765;
                  if (var26 != 1 && var26 != 2) {
                     var15 = var12;
                  } else {
                     var15 = -var12;
                  }

                  if (var26 != 2 && var26 != 3) {
                     var16 = var24;
                  } else {
                     var16 = -var24;
                  }

                  if (var16 >= var15) {
                     var1.ap(var30.ae, 0, var30.aw * 908660977 + var30.ay * 454787773, var30.ap * 512272339, var30.ak * 98110665 + var30.as * 1489115595, var30.at * 7961066021200506019L);
                  } else if (var30.am != null) {
                     var1.ap(var30.am, 0, var30.aw * 908660977, var30.ap * 512272339, var30.ak * 98110665, var30.at * 7961066021200506019L);
                  }
               }
            }

            ka var28 = var4.as;
            if (var28 != null) {
               if ((var28.ai * -1214908109 & var4.ax * 1678602377) != 0 && !this.cm(var8, var5, var6, var28.ai * -1214908109)) {
                  var1.ap(var28.as, 0, var28.aw * 793298009, var28.ap * -1500771725, var28.ak * 420163547, var28.ae * -1505290071759269005L);
               }

               if ((var28.aj * -1674755825 & var4.ax * 1678602377) != 0 && !this.cm(var8, var5, var6, var28.aj * -1674755825)) {
                  var1.ap(var28.ay, 0, var28.aw * 793298009, var28.ap * -1500771725, var28.ak * 420163547, var28.ae * -1505290071759269005L);
               }
            }
         }

         jw var32;
         if (var7 < this.aj - 1) {
            var32 = this.ae[var7 + 1][var5][var6];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var5 < this.bb && var5 >= this.aa && var5 < this.ah - 1) {
            var32 = var9[var5 + 1][var6];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var6 < this.bq && var6 >= this.bh && var6 < this.bj - 1) {
            var32 = var9[var5][var6 + 1];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var5 > this.bb && var5 > this.aa && var5 < this.ah) {
            var32 = var9[var5 - 1][var6];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }

         if (var6 > this.bq && var6 > this.bh && var6 < this.bj) {
            var32 = var9[var5][var6 - 1];
            if (var32 != null && var32.az) {
               this.ci.aw(var32);
            }
         }
      }
   }

   public void gh(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      jw var7 = this.ae[var4][var5][var6];
      if (var7 != null) {
         jp var8 = var7.ai;
         int var10;
         if (var8 != null) {
            int var18 = var8.as * -539619730;
            if (var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            js var9 = var7.ay;
            if (var9 != null) {
               var10 = var9.an;
               int var11 = var9.ao;
               int var12 = var9.af;
               int var13 = var9.ar;
               int[] var14 = this.cz[var10];
               int[] var15 = this.ch[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   static final int jj(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   static boolean jd(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }

   static boolean ju(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }

   static boolean jg(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }

   int br(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.bn(var1, var2, var3) - this.bn(var4, var5, var6);
   }

   void jm() {
      int var1 = this.be[this.aq];
      jo[] var2 = this.cq[this.aq];
      this.cb = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         jo var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.ai * 2132992395 == 1) {
            var5 = var4.ap * -1158956325 - this.bb + this.ag;
            if (var5 >= 0 && var5 <= this.ag + this.ag) {
               var6 = var4.ak * -1483350349 - this.bq + this.ag;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.aj * 1276080201 - this.bq + this.ag;
               if (var7 > this.ag + this.ag) {
                  var7 = this.ag + this.ag;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cn(var5, var6++)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bv - var4.ay * -467035677;
                  if (var9 > 32) {
                     var4.an = -925954819;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.an = -1851909638;
                     var9 = -var9;
                  }

                  var4.ar = (var4.ae * -1654652849 - this.bk << 8) / var9 * -1820467529;
                  var4.ab = (var4.am * 706234479 - this.bk << 8) / var9 * -867750803;
                  var4.az = (var4.at * 1054556819 - this.bx << 8) / var9 * -798617017;
                  var4.ag = (var4.au * -2080775187 - this.bx << 8) / var9 * 1095373565;
                  this.cd[this.cb++] = var4;
               }
            }
         } else if (var4.ai * 2132992395 == 2) {
            var5 = var4.ak * -1483350349 - this.bq + this.ag;
            if (var5 >= 0 && var5 <= this.ag + this.ag) {
               var6 = var4.ap * -1158956325 - this.bb + this.ag;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.aw * -547034607 - this.bb + this.ag;
               if (var7 > this.ag + this.ag) {
                  var7 = this.ag + this.ag;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cn(var6++, var5)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bk - var4.ae * -1654652849;
                  if (var9 > 32) {
                     var4.an = 1517102839;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.an = 591148020;
                     var9 = -var9;
                  }

                  var4.ao = (var4.ay * -467035677 - this.bv << 8) / var9 * -637152413;
                  var4.af = (var4.as * -939224903 - this.bv << 8) / var9 * -1824101959;
                  var4.az = (var4.at * 1054556819 - this.bx << 8) / var9 * -798617017;
                  var4.ag = (var4.au * -2080775187 - this.bx << 8) / var9 * 1095373565;
                  this.cd[this.cb++] = var4;
               }
            }
         } else if (var4.ai * 2132992395 == 4) {
            var5 = var4.at * 1054556819 - this.bx;
            if (var5 > 128) {
               var6 = var4.ak * -1483350349 - this.bq + this.ag;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.aj * 1276080201 - this.bq + this.ag;
               if (var7 > this.ag + this.ag) {
                  var7 = this.ag + this.ag;
               }

               if (var6 <= var7) {
                  int var8 = var4.ap * -1158956325 - this.bb + this.ag;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.aw * -547034607 - this.bb + this.ag;
                  if (var9 > this.ag + this.ag) {
                     var9 = this.ag + this.ag;
                  }

                  boolean var10 = false;

                  label189:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (this.cn(var11, var12)) {
                           var10 = true;
                           break label189;
                        }
                     }
                  }

                  if (var10) {
                     var4.an = -334806799;
                     var4.ao = (var4.ay * -467035677 - this.bv << 8) / var5 * -637152413;
                     var4.af = (var4.as * -939224903 - this.bv << 8) / var5 * -1824101959;
                     var4.ar = (var4.ae * -1654652849 - this.bk << 8) / var5 * -1820467529;
                     var4.ab = (var4.am * 706234479 - this.bk << 8) / var5 * -867750803;
                     this.cd[this.cb++] = var4;
                  }
               }
            }
         }
      }

   }

   void jq() {
      int var1 = this.be[this.aq];
      jo[] var2 = this.cq[this.aq];
      this.cb = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         jo var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.ai * 2132992395 == 1) {
            var5 = var4.ap * -1158956325 - this.bb + this.ag;
            if (var5 >= 0 && var5 <= this.ag + this.ag) {
               var6 = var4.ak * -1483350349 - this.bq + this.ag;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.aj * -1303894344 - this.bq + this.ag;
               if (var7 > this.ag + this.ag) {
                  var7 = this.ag + this.ag;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cn(var5, var6++)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bv - var4.ay * -467035677;
                  if (var9 > 2105360239) {
                     var4.an = -84082067;
                  } else {
                     if (var9 >= -867981476) {
                        continue;
                     }

                     var4.an = -1851909638;
                     var9 = -var9;
                  }

                  var4.ar = (var4.ae * -1654652849 - this.bk << 8) / var9 * 1395443154;
                  var4.ab = (var4.am * 706234479 - this.bk << 8) / var9 * -906598782;
                  var4.az = (var4.at * -1549482229 - this.bx << 8) / var9 * -798617017;
                  var4.ag = (var4.au * -504023441 - this.bx << 8) / var9 * -572979701;
                  this.cd[this.cb++] = var4;
               }
            }
         } else if (var4.ai * -2104414503 == 2) {
            var5 = var4.ak * 2036643325 - this.bq + this.ag;
            if (var5 >= 0 && var5 <= this.ag + this.ag) {
               var6 = var4.ap * -1158956325 - this.bb + this.ag;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.aw * -547034607 - this.bb + this.ag;
               if (var7 > this.ag + this.ag) {
                  var7 = this.ag + this.ag;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cn(var6++, var5)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bk - var4.ae * 739815966;
                  if (var9 > 32) {
                     var4.an = 1517102839;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.an = 591148020;
                     var9 = -var9;
                  }

                  var4.ao = (var4.ay * -906312769 - this.bv << 8) / var9 * 1652235668;
                  var4.af = (var4.as * -137799158 - this.bv << 8) / var9 * -1824101959;
                  var4.az = (var4.at * 1969963255 - this.bx << 8) / var9 * -798617017;
                  var4.ag = (var4.au * -2080775187 - this.bx << 8) / var9 * -446052124;
                  this.cd[this.cb++] = var4;
               }
            }
         } else if (var4.ai * 2132992395 == 4) {
            var5 = var4.at * 1054556819 - this.bx;
            if (var5 > 128) {
               var6 = var4.ak * -1951552167 - this.bq + this.ag;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.aj * 1276080201 - this.bq + this.ag;
               if (var7 > this.ag + this.ag) {
                  var7 = this.ag + this.ag;
               }

               if (var6 <= var7) {
                  int var8 = var4.ap * -1158956325 - this.bb + this.ag;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.aw * -547034607 - this.bb + this.ag;
                  if (var9 > this.ag + this.ag) {
                     var9 = this.ag + this.ag;
                  }

                  boolean var10 = false;

                  label191:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (this.cn(var11, var12)) {
                           var10 = true;
                           break label191;
                        }
                     }
                  }

                  if (var10) {
                     var4.an = -334806799;
                     var4.ao = (var4.ay * -467035677 - this.bv << 8) / var5 * 816771608;
                     var4.af = (var4.as * -939224903 - this.bv << 8) / var5 * -1824101959;
                     var4.ar = (var4.ae * -490168459 - this.bk << 8) / var5 * -1573074735;
                     var4.ab = (var4.am * 706234479 - this.bk << 8) / var5 * -822023336;
                     this.cd[this.cb++] = var4;
                  }
               }
            }
         }
      }

   }

   void gp(jj var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.ai) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.ay && (var9 >= var6 || var10 >= var8)) {
                  jw var11 = this.ae[var2][var9][var10];
                  if (var11 != null && var11.am != null && var11.am.aj instanceof jj) {
                     int var12 = this.br(var2, var9, var10, var2, var3, var4);
                     jj var13 = (jj)var11.am.aj;
                     jj.bh(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }

   }

   boolean jl(int var1, int var2, int var3) {
      int var4 = this.an[var1][var2][var3];
      if (var4 == -this.al) {
         return false;
      } else if (var4 == this.al) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.cs(var5 + 1, this.as[var1][var2][var3], var6 + 1) && this.cs(var5 + -614279202 - 1, this.as[var1][var2 + 1][var3], var6 + 1) && this.cs(var5 + -1280064136 - 1, this.as[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.cs(var5 + 1, this.as[var1][var2][var3 + 1], var6 + -843158239 - 1)) {
            this.an[var1][var2][var3] = this.al;
            return true;
         } else {
            this.an[var1][var2][var3] = -this.al;
            return false;
         }
      }
   }

   boolean jt(int var1, int var2, int var3) {
      int var4 = this.an[var1][var2][var3];
      if (var4 == -this.al) {
         return false;
      } else if (var4 == this.al) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.cs(var5 + 1, this.as[var1][var2][var3], var6 + 1) && this.cs(var5 + 1625562372 - 1, this.as[var1][var2 + 1][var3], var6 + 1) && this.cs(var5 + -379484789 - 1, this.as[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.cs(var5 + 1, this.as[var1][var2][var3 + 1], var6 + -1052225521 - 1)) {
            this.an[var1][var2][var3] = this.al;
            return true;
         } else {
            this.an[var1][var2][var3] = -this.al;
            return false;
         }
      }
   }

   boolean ji(int var1, int var2, int var3, int var4) {
      if (!this.cj(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.as[var1][var2][var3] - 1;
         int var8 = var7 - 940530583;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > this.bv) {
                  if (!this.cs(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.cs(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.cs(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cs(var5, var9, var6)) {
                  return false;
               }

               if (!this.cs(var5, var9, var6 + -1862431777)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < this.bk) {
                  if (!this.cs(var5, var7, var6 + 936408310)) {
                     return false;
                  }

                  if (!this.cs(var5 + 1078219674, var7, var6 + -2125976487)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5, var8, var6 + -1832879775)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cs(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.cs(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < this.bv) {
                  if (!this.cs(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var7, var6 + -745962333)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + -503938774, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cs(var5 + -1815024359, var9, var6)) {
                  return false;
               }

               if (!this.cs(var5 + 1078717902, var9, var6 + 128448595)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > this.bk) {
                  if (!this.cs(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + -820434125, var8, var6)) {
                     return false;
                  }
               }

               if (!this.cs(var5, var9, var6)) {
                  return false;
               }

               if (!this.cs(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.cs(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.cs(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.cs(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.cs(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.cs(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean jc(int var1, int var2, int var3, int var4) {
      if (!this.cj(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.as[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - -646957500;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > this.bv) {
                  if (!this.cs(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.cs(var5, var7, var6 + 160011703)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.cs(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cs(var5, var9, var6)) {
                  return false;
               }

               if (!this.cs(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < this.bk) {
                  if (!this.cs(var5, var7, var6 + 1078233601)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var7, var6 + 136888660)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5, var8, var6 + 2050583340)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cs(var5, var9, var6 + 721604951)) {
                  return false;
               }

               if (!this.cs(var5 + 128, var9, var6 + -1988411369)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < this.bv) {
                  if (!this.cs(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + -2012959224, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + -684628478, var8, var6 + 1873738656)) {
                     return false;
                  }
               }

               if (!this.cs(var5 + -571422439, var9, var6)) {
                  return false;
               }

               if (!this.cs(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > this.bk) {
                  if (!this.cs(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cs(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.cs(var5 + 2130324685, var8, var6)) {
                     return false;
                  }
               }

               if (!this.cs(var5, var9, var6)) {
                  return false;
               }

               if (!this.cs(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.cs(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.cs(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.cs(var5 + 128, var9, var6 + 2023195938);
         } else if (var4 == 911802883) {
            return this.cs(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.cs(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   public ji(int var1, int var2, int var3, int var4, int var5, im var6, int[][][] var7) {
      this.ad = im.ap;
      this.ac = 0;
      this.av = 0;
      this.ax = 0;
      this.aq = 0;
      this.br = new kf[100];
      this.bn = false;
      this.bu = 0;
      this.bt = 0;
      this.bs = 0;
      this.bm = -1;
      this.bo = -1;
      this.bd = -1.0F;
      this.ba = -1;
      this.bw = -1;
      this.bi = false;
      this.bl = 4;
      this.be = new int[this.bl];
      this.cq = new jo[this.bl][500];
      this.cb = 0;
      this.cd = new jo[500];
      this.ci = new pu();
      this.cz = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
      this.ch = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
      this.ct = new int[9];
      this.aj = var2;
      this.ai = var3;
      this.ay = var4;
      this.ae = new jw[var2][var3][var4];
      this.an = new int[var2][var3 + 1][var4 + 1];
      this.as = var7;
      this.ag = var5;
      this.ad = var6;
      this.ap = var1;
      if (var1 != -1) {
         this.ca = 0;
         this.cs = null;
         this.cr = null;
         this.ck = 0;
         this.dq = 0;
         this.dd = 0;
         this.dc = 0;
         this.da = null;
         this.dr = null;
         this.dh = 0;
         this.dg = 0;
         this.df = 0;
      } else {
         this.ca = 8386816;
         this.cs = new BitSet(this.ca);
         this.cr = new BitSet(this.ca);
         this.ck = 1048352;
         this.dq = 32761;
         this.dd = 181;
         this.dc = 9644832;
         this.da = new BitSet(this.dc);
         this.dr = new BitSet(this.dc);
         this.dh = 1071648;
         this.dg = 33489;
         this.df = 183;
      }

      jl.an(var5);
      this.ap();
   }

   boolean jv(int var1, int var2, int var3, int var4) {
      if (!this.cj(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.cs(var5 + 1, this.as[var1][var2][var3] - var4, var6 + 1) && this.cs(var5 + -1946526917 - 1, this.as[var1][var2 + 1][var3] - var4, var6 + 1) && this.cs(var5 + 128 - 1, this.as[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.cs(var5 + 1, this.as[var1][var2][var3 + 1] - var4, var6 + -439969505 - 1);
      }
   }

   boolean jf(int var1, int var2, int var3, int var4) {
      if (!this.cj(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.cs(var5 + 1, this.as[var1][var2][var3] - var4, var6 + 1) && this.cs(var5 + 128 - 1, this.as[var1][var2 + 1][var3] - var4, var6 + 1) && this.cs(var5 + 128 - 1, this.as[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.cs(var5 + 1, this.as[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean ja(int var1, int var2, int var3, int var4) {
      if (!this.cj(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.cs(var5 + 1, this.as[var1][var2][var3] - var4, var6 + 1) && this.cs(var5 + 128 - 1, this.as[var1][var2 + 1][var3] - var4, var6 + 1) && this.cs(var5 + 128 - 1, this.as[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.cs(var5 + 1, this.as[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean jo(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.cj(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.cs(var7 + 1, this.as[var1][var2][var4] - var6, var8 + 1) && this.cs(var7 + 128 - 1, this.as[var1][var2 + 1][var4] - var6, var8 + 1) && this.cs(var7 + 128 - 1, this.as[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.cs(var7 + 1, this.as[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.an[var1][var7][var8] == -this.al) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.as[var1][var2][var4] - var6;
         if (!this.cs(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.cs(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.cs(var7, var9, var11)) {
                  return false;
               } else if (!this.cs(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   boolean ir(int var1, int var2, int var3, int var4) {
      if (!this.cq(var1, var2, var3, var4)) {
         return this.bl(var1, var2, var3, var4);
      } else {
         this.cb(var1, var2, var3, var4, false);
         int var5 = var1 * -873680610 + 128;
         int var6 = var2 * 243708486;
         int var7 = (var3 - this.ag - this.ac - 1) * -784473443;
         int var8 = (var4 - this.ag - this.av - 1) * 128;

         for(int var9 = -this.cc; var9 <= this.cj; var9 += 128) {
            if (this.cf(var7, this.ct[var1] + var9, var8, var5, var6)) {
               return this.be(var1, var2, var3, var4, true);
            }
         }

         return this.be(var1, var2, var3, var4, false);
      }
   }

   boolean jz(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.cb; ++var4) {
         jo var5 = this.cd[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.an * -780505003 == 1) {
            var6 = var5.ay * -184713227 - var1;
            if (var6 > 0) {
               var7 = var5.ae * -1654652849 + (var5.ar * 1147100935 * var6 >> 8);
               var8 = var5.am * 706234479 + (var5.ab * -2135585382 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -1161785760 + (var5.ag * 1216485973 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 2) {
            var6 = var1 - var5.ay * -933753393;
            if (var6 > 0) {
               var7 = var5.ae * -1654652849 + (var5.ar * 1147100935 * var6 >> 8);
               var8 = var5.am * 706234479 + (var5.ab * -1153712795 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -1356711683 + (var5.ag * 16717722 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 3) {
            var6 = var5.ae * 706191116 - var3;
            if (var6 > 0) {
               var7 = var5.ay * -467035677 + (var5.ao * 1894401611 * var6 >> 8);
               var8 = var5.as * -939224903 + (var5.af * -1935487863 * var6 >> 8);
               var9 = var5.at * 1330143005 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * 145333246 + (var5.ag * 1216485973 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -1255629962 == 4) {
            var6 = var3 - var5.ae * -1654652849;
            if (var6 > 0) {
               var7 = var5.ay * 322023385 + (var5.ao * -509216378 * var6 >> 8);
               var8 = var5.as * -939224903 + (var5.af * -1935487863 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -2080775187 + (var5.ag * -715398994 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -1218323291 == 5) {
            var6 = var2 - var5.at * -378798343;
            if (var6 > 0) {
               var7 = var5.ay * -1569313716 + (var5.ao * -79381581 * var6 >> 8);
               var8 = var5.as * -177064424 + (var5.af * -822224106 * var6 >> 8);
               var9 = var5.ae * -68068212 + (var5.ar * -1456305891 * var6 >> 8);
               var10 = var5.am * -519579686 + (var5.ab * -1153712795 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   boolean gi(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.ck + var3 * this.dq + var4 * this.dd + var5);
   }

   boolean jn(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.cb; ++var4) {
         jo var5 = this.cd[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.an * -780505003 == 1) {
            var6 = var5.ay * -467035677 - var1;
            if (var6 > 0) {
               var7 = var5.ae * -1654652849 + (var5.ar * 1147100935 * var6 >> 8);
               var8 = var5.am * 706234479 + (var5.ab * -1153712795 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -2080775187 + (var5.ag * 1216485973 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 2) {
            var6 = var1 - var5.ay * -467035677;
            if (var6 > 0) {
               var7 = var5.ae * -1654652849 + (var5.ar * 1147100935 * var6 >> 8);
               var8 = var5.am * 706234479 + (var5.ab * -1153712795 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -2080775187 + (var5.ag * 1216485973 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 3) {
            var6 = var5.ae * -1654652849 - var3;
            if (var6 > 0) {
               var7 = var5.ay * -467035677 + (var5.ao * 1894401611 * var6 >> 8);
               var8 = var5.as * -939224903 + (var5.af * -1935487863 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -2080775187 + (var5.ag * 1216485973 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 4) {
            var6 = var3 - var5.ae * -1654652849;
            if (var6 > 0) {
               var7 = var5.ay * -467035677 + (var5.ao * 1894401611 * var6 >> 8);
               var8 = var5.as * -939224903 + (var5.af * -1935487863 * var6 >> 8);
               var9 = var5.at * 1054556819 + (var5.az * 1715337079 * var6 >> 8);
               var10 = var5.au * -2080775187 + (var5.ag * 1216485973 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.an * -780505003 == 5) {
            var6 = var2 - var5.at * 1054556819;
            if (var6 > 0) {
               var7 = var5.ay * -467035677 + (var5.ao * 1894401611 * var6 >> 8);
               var8 = var5.as * -939224903 + (var5.af * -1935487863 * var6 >> 8);
               var9 = var5.ae * -1654652849 + (var5.ar * 1147100935 * var6 >> 8);
               var10 = var5.am * 706234479 + (var5.ab * -1153712795 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   void jy(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      qh var15 = new qh();
      var15.aw((float)((double)(-var2) * 0.0030679615D), -938784404);
      var15.ak((float)((double)(-var3) * 0.0030679615D), 309319879);
      var15.ai((float)var7, (float)var8, (float)var9, -1766667351);
      qs var16 = new qs();
      var16.ab(var15, -1798014057);
      var16.ag((byte)100);
      int var17 = this.ak % 300;
      float var18 = (float)var17 / 300.0F * 6.283F;
      float var19 = (float)Math.sin((double)var18);
      float var20 = (float)Math.cos((double)var18);
      float var21 = var19 * 3.14159F / 100.0F;
      float var22 = var20 * 3.14159F / 100.0F;
      qj var23 = new qj();
      qs var24 = new qs();
      var23.ap = new qp((float)((double)var1 * 0.0030679615D), var21, var22);
      var23.aw = new qt((float)(var4 - 64), (float)var5, (float)(var6 - 64));
      qs var25 = new qs();
      var25.af(var23, 1235853734);
      var25.ag((byte)100);
      qj var26 = new qj();
      var26.aw = new qt((float)(-(this.ai * 64)), 0.0F, (float)(-(this.ay * 64)));
      qs var27 = new qs();
      var27.af(var26, 1606129646);
      var24.ad(1.0F, 1.0F, 1.0F, 1.0F, -659724977);
      var27.ao(var24, 189814199);
      var24.af(var23, 1539911005);
      var27.ao(var24, 644118205);
      var27.ao(var16, 265859207);
      this.bv = (int)var25.ax((float)var7, (float)var8, (float)var9, (byte)7);
      this.bx = (int)var25.aq((float)var7, (float)var8, (float)var9, -1592696374);
      this.bk = (int)var25.al((float)var7, (float)var8, (float)var9, (byte)-55);
      this.bb = this.bv / 128;
      this.bq = this.bk / 128;
      this.bp = (int)var25.ax((float)var12, 0.0F, (float)var13, (byte)7) / 128;
      this.bz = (int)var25.al((float)var12, 0.0F, (float)var13, (byte)-17) / 128;
      jc var28 = new jc(var27);
      this.cx(var28, var14);
   }

   void jr(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      qh var15 = new qh();
      var15.aw((float)((double)(-var2) * 0.0030679615D), 639224443);
      var15.ak((float)((double)(-var3) * 0.0030679615D), 309319879);
      var15.ai((float)var7, (float)var8, (float)var9, -1766958296);
      qs var16 = new qs();
      var16.ab(var15, -1620709633);
      var16.ag((byte)100);
      int var17 = this.ak % 300;
      float var18 = (float)var17 / 300.0F * 6.283F;
      float var19 = (float)Math.sin((double)var18);
      float var20 = (float)Math.cos((double)var18);
      float var21 = var19 * 3.14159F / 100.0F;
      float var22 = var20 * 3.14159F / 100.0F;
      qj var23 = new qj();
      qs var24 = new qs();
      var23.ap = new qp((float)((double)var1 * 0.0030679615D), var21, var22);
      var23.aw = new qt((float)(var4 - 64), (float)var5, (float)(var6 - 64));
      qs var25 = new qs();
      var25.af(var23, 2056251188);
      var25.ag((byte)100);
      qj var26 = new qj();
      var26.aw = new qt((float)(-(this.ai * 64)), 0.0F, (float)(-(this.ay * 64)));
      qs var27 = new qs();
      var27.af(var26, 1659040346);
      var24.ad(1.0F, 1.0F, 1.0F, 1.0F, -659724977);
      var27.ao(var24, 644708883);
      var24.af(var23, 1371909041);
      var27.ao(var24, 1748137250);
      var27.ao(var16, -429544140);
      this.bv = (int)var25.ax((float)var7, (float)var8, (float)var9, (byte)7);
      this.bx = (int)var25.aq((float)var7, (float)var8, (float)var9, -249891185);
      this.bk = (int)var25.al((float)var7, (float)var8, (float)var9, (byte)-72);
      this.bb = this.bv / 1126164949;
      this.bq = this.bk / 128;
      this.bp = (int)var25.ax((float)var12, 0.0F, (float)var13, (byte)7) / -227980457;
      this.bz = (int)var25.al((float)var12, 0.0F, (float)var13, (byte)-128) / -1935382941;
      jc var28 = new jc(var27);
      this.cx(var28, var14);
   }

   public void gw(int var1) {
      this.ag = lb.ae(25, 90, var1, -595022897);
      jl.an(this.ag);
      if (this.ct != null && this.ct.length > 0) {
         this.cd(this.ct, this.cc, this.cj, this.cm, this.cw);
      }

   }
}
