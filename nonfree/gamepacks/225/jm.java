import java.util.Arrays;
import java.util.HashMap;

public class jm extends ju {
   static int[] bz = new int[6500];
   public boolean bm = false;
   static jm ag = new jm();
   static boolean[] bi = new boolean[6500];
   static qf af = new qf();
   static byte[] am = new byte[1];
   int[][] bh;
   public int at = 0;
   int[] au;
   int[] ar;
   public byte cd;
   public int ad = 0;
   int[] ah;
   byte[] as;
   int[] ab;
   int[] az;
   int[] aa;
   static int[] cc;
   byte[] ao;
   int[] al;
   byte[] ay;
   short[] aj;
   public byte av = 0;
   public int aw = 0;
   static qf ax = new qf();
   int[] ak;
   int[] bn;
   static final int bq = 6000;
   int[][] bd;
   int[][] bx;
   int[][] bf;
   public byte cb;
   int bs;
   public byte cs;
   static final int cl = 50;
   int bj;
   int bp;
   public byte cp;
   static final int bb = 6500;
   public short ce;
   static int[] bt = new int[6500];
   static int[] bl = new int[6500];
   int[] an;
   static float[] bu = new float[6500];
   static int[] br = new int[6500];
   static int[] bo = new int[6500];
   static int[] bv = new int[6500];
   static byte[] ae = new byte[1];
   static jm ac = new jm();
   static char[] bk = new char[6000];
   static char[][] be = new char[6000][512];
   int bw;
   static int[][] cn = new int[12][2000];
   static int[] ch = new int[2000];
   static int[] cf = new int[2000];
   static int[] cu = new int[12];
   static int[] cm = new int[10];
   int[] ai;
   static int[] cx = new int[10];
   static float[] ci = new float[10];
   static int cy;
   static int co;
   static int cv;
   static boolean cg = true;
   static final int ct = 5;
   static final int cq = 20;
   static int[] bc = new int[12];
   static int[] cz;
   static int[] cw;
   static int[] cr;
   int[] ap;
   static final float ca;
   HashMap by = new HashMap();
   static float[] ck;
   static boolean[] bg = new boolean[6500];
   static qf aq = new qf();
   static int[] cj = new int[10];
   int ba;

   public void ei(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.at; ++var4) {
         this.au[var4] = this.au[var4] * var1 / 128;
         this.ar[var4] = this.ar[var4] * var2 / 128;
         this.al[var4] = this.al[var4] * var3 / 128;
      }

      this.az();
   }

   public void an() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.al[var1];
         this.al[var1] = -var2;
      }

      this.az();
   }

   public jm(int var1, int var2, int var3, byte var4) {
      this.ac(var1, var2, var3);
      this.av = var4;
      this.at = 0;
      this.ad = 0;
      this.aw = 0;
   }

   public void ak() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         this.au[var1] = -this.au[var1];
         this.al[var1] = -this.al[var1];
      }

      this.az();
   }

   void ae(jm var1) {
      int var2 = this.ah.length;
      if (this.ao == null && (var1.ao != null || this.av != var1.av)) {
         this.ao = new byte[var2];
         Arrays.fill(this.ao, this.av);
      }

      if (this.as == null && var1.as != null) {
         this.as = new byte[var2];
         Arrays.fill(this.as, (byte)0);
      }

      if (this.aj == null && var1.aj != null) {
         this.aj = new short[var2];
         Arrays.fill(this.aj, (short)-1);
      }

      if (this.ay == null && var1.ay != null) {
         this.ay = new byte[var2];
         Arrays.fill(this.ay, (byte)-1);
      }

   }

   void as(jp var1, int var2) {
      this.bg(var1, var2);
   }

   public jm am(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.au();
      int var7 = var2 - this.ba;
      int var8 = var2 + this.ba;
      int var9 = var4 - this.ba;
      int var10 = var4 + this.ba;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            jm var11;
            if (var5) {
               var11 = new jm();
               var11.at = this.at;
               var11.ad = this.ad;
               var11.aw = this.aw;
               var11.au = this.au;
               var11.al = this.al;
               var11.ah = this.ah;
               var11.ap = this.ap;
               var11.ab = this.ab;
               var11.az = this.az;
               var11.aa = this.aa;
               var11.ai = this.ai;
               var11.ao = this.ao;
               var11.as = this.as;
               var11.ay = this.ay;
               var11.aj = this.aj;
               var11.av = this.av;
               var11.an = this.an;
               var11.ak = this.ak;
               var11.bn = this.bn;
               var11.bh = this.bh;
               var11.bd = this.bd;
               var11.bm = this.bm;
               var11.ar = new int[var11.at];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.at; ++var12) {
                  var13 = this.au[var12] + var2;
                  var14 = this.al[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.ar[var12] = this.ar[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.at; ++var12) {
                  var13 = (-this.ar[var12] << 16) / (this.ev * -1141910865);
                  if (var13 < var6) {
                     var14 = this.au[var12] + var2;
                     var15 = this.al[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.ar[var12] = this.ar[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.az();
            return var11;
         }
      } else {
         return this;
      }
   }

   public jm ax(boolean var1) {
      if (!var1 && ae.length < this.ad) {
         ae = new byte[this.ad + 100];
      }

      return this.af(var1, ac, ae);
   }

   public jm aq(boolean var1) {
      if (!var1 && am.length < this.ad) {
         am = new byte[this.ad + 100];
      }

      return this.af(var1, ag, am);
   }

   jm af(boolean var1, jm var2, byte[] var3) {
      var2.at = this.at;
      var2.ad = this.ad;
      var2.aw = this.aw;
      if (var2.au == null || var2.au.length < this.at) {
         var2.au = new int[this.at + 100];
         var2.ar = new int[this.at + 100];
         var2.al = new int[this.at + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.at; ++var4) {
         var2.au[var4] = this.au[var4];
         var2.ar[var4] = this.ar[var4];
         var2.al[var4] = this.al[var4];
      }

      if (var1) {
         var2.as = this.as;
      } else {
         var2.as = var3;
         if (this.as == null) {
            for(var4 = 0; var4 < this.ad; ++var4) {
               var2.as[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.ad; ++var4) {
               var2.as[var4] = this.as[var4];
            }
         }
      }

      var2.ah = this.ah;
      var2.ap = this.ap;
      var2.ab = this.ab;
      var2.az = this.az;
      var2.aa = this.aa;
      var2.ai = this.ai;
      var2.ao = this.ao;
      var2.ay = this.ay;
      var2.aj = this.aj;
      var2.av = this.av;
      var2.an = this.an;
      var2.ak = this.ak;
      var2.bn = this.bn;
      var2.bh = this.bh;
      var2.bd = this.bd;
      var2.bx = this.bx;
      var2.bf = this.bf;
      var2.bm = this.bm;
      var2.az();
      var2.cd = 0;
      return var2;
   }

   void at(int var1) {
      if (!this.by.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = cz[var1];
         int var9 = cc[var1];

         for(int var10 = 0; var10 < this.at; ++var10) {
            int var11 = ka.ac(this.au[var10], this.al[var10], var8, var9, -1756615865);
            int var12 = this.ar[var10];
            int var14 = this.au[var10];
            int var15 = this.al[var10];
            int var13 = var8 * var15 - var9 * var14 >> 16;
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }
         }

         jn var17 = new jn((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         boolean var18 = true;
         if (var17.am * 1947043695 < 32) {
            var17.am = 502723040;
         }

         if (var17.aq * 931924417 < 32) {
            var17.aq = -1629435872;
         }

         if (this.bm) {
            boolean var19 = true;
            var17.am += -2021802888;
            var17.aq += -1481100792;
         }

         this.by.put(var1, var17);
      }
   }

   public void au() {
      if (this.bs != 1) {
         this.bs = 1;
         this.ev = 0;
         this.bw = 0;
         this.ba = 0;

         for(int var1 = 0; var1 < this.at; ++var1) {
            int var2 = this.au[var1];
            int var3 = this.ar[var1];
            int var4 = this.al[var1];
            if (-var3 > this.ev * -1141910865) {
               this.ev = -var3 * -2091858865;
            }

            if (var3 > this.bw) {
               this.bw = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.ba) {
               this.ba = var5;
            }
         }

         this.ba = (int)(Math.sqrt((double)this.ba) + 0.99D);
         this.bp = (int)(Math.sqrt((double)(this.ba * this.ba + this.ev * -1141910865 * this.ev * -1141910865)) + 0.99D);
         this.bj = this.bp + (int)(Math.sqrt((double)(this.ba * this.ba + this.bw * this.bw)) + 0.99D);
      }
   }

   void ar() {
      if (this.bs != 2) {
         this.bs = 2;
         this.ba = 0;

         for(int var1 = 0; var1 < this.at; ++var1) {
            int var2 = this.au[var1];
            int var3 = this.ar[var1];
            int var4 = this.al[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.ba) {
               this.ba = var5;
            }
         }

         this.ba = (int)(Math.sqrt((double)this.ba) + 0.99D);
         this.bp = this.ba;
         this.bj = this.ba + this.ba;
      }
   }

   public int al() {
      this.au();
      return this.ba;
   }

   public void az() {
      this.bs = 0;
      this.by.clear();
   }

   boolean fv(int var1) {
      return this.cd > 0 && var1 < this.ce;
   }

   public void eg() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.al[var1];
         this.al[var1] = -var2;
      }

      this.az();
   }

   void ao(fo var1, int var2) {
      jg var3 = var1.am;

      for(int var4 = 0; var4 < var3.af * 1213891965; ++var4) {
         int var5 = var3.at[var4];
         if (var5 == 5 && var1.ae != null && var1.ae[var4] != null && var1.ae[var4][0] != null && this.bd != null && this.as != null) {
            fr var6 = var1.ae[var4][0];
            int[] var7 = var3.au[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.bd.length) {
                  int[] var11 = this.bd[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.as[var13] & 255) + var6.ag(var2, -1617719116) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 255;
                     }

                     this.as[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   void eo(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      int var15 = jw.am[var2];
      int var16 = jw.ax[var2];
      int var17 = jw.am[var3];
      int var18 = jw.ax[var3];
      this.bs(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   public void el(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.at; ++var4) {
         this.au[var4] = this.au[var4] * var1 / 128;
         this.ar[var4] = this.ar[var4] * var2 / 128;
         this.al[var4] = this.al[var4] * var3 / -1166800334;
      }

      this.az();
   }

   public void aj(jg var1, fo var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      jp var7 = var1.ae(-1211066895);
      if (var7 != null) {
         var7.aq(var2, var3, var4, var5, 2001180754);
         if (var6) {
            this.as(var7, var2.am((byte)4));
         }
      }

      if (!var5 && var2.ax(1111722067)) {
         this.ao(var2, var3);
      }

   }

   final void by(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      if (this.aj != null && this.aj[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.ay != null && this.ay[var1] != -1) {
            int var17 = this.ay[var1] & 255;
            var18 = this.an[var17];
            var15 = this.ak[var17];
            var16 = this.bn[var17];
         } else {
            var18 = this.ah[var1];
            var15 = this.ap[var1];
            var16 = this.ab[var1];
         }

         if (this.ai[var1] == -1) {
            jw.av(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, bo[var18], bo[var15], bo[var16], bv[var18], bv[var15], bv[var16], bt[var18], bt[var15], bt[var16], this.aj[var1]);
         } else {
            jw.av(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, bo[var18], bo[var15], bo[var16], bv[var18], bv[var15], bv[var16], bt[var18], bt[var15], bt[var16], this.aj[var1]);
         }
      } else {
         boolean var14 = this.bp(var1);
         if (this.ai[var1] == -1 && var14) {
            jw.ak(var2, var3, var4, var5, var6, var7, var8, var9, var10, cw[this.az[var1]], this.cs, this.cp, this.cb, this.cd);
         } else if (this.ai[var1] == -1) {
            jw.aj(var2, var3, var4, var5, var6, var7, var8, var9, var10, cw[this.az[var1]]);
         } else if (var14) {
            jw.an(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.cs, this.cp, this.cb, this.cd);
         } else {
            jw.ay(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }

   }

   void aw(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         cy = 0;
         co = 0;
         cv = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if (var18 < this.bh.length) {
               int[] var19 = this.bh[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  cy += this.au[var12];
                  co += this.ar[var12];
                  cv += this.al[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            cy = cy / var7 + var3;
            co = co / var7 + var4;
            cv = cv / var7 + var5;
         } else {
            cy = var3;
            co = var4;
            cv = var5;
         }

      } else {
         int[] var9;
         int var10;
         int[] var10000;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bh.length) {
                  var9 = this.bh[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.au;
                     var10000[var11] += var3;
                     var10000 = this.ar;
                     var10000[var11] += var4;
                     var10000 = this.al;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bh.length) {
                  var9 = this.bh[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.au;
                     var10000[var11] -= cy;
                     var10000 = this.ar;
                     var10000[var11] -= co;
                     var10000 = this.al;
                     var10000[var11] -= cv;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = cc[var14];
                        var16 = cz[var14];
                        var17 = this.ar[var11] * var15 + this.au[var11] * var16 >> 16;
                        this.ar[var11] = this.ar[var11] * var16 - this.au[var11] * var15 >> 16;
                        this.au[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = cc[var12];
                        var16 = cz[var12];
                        var17 = this.ar[var11] * var16 - this.al[var11] * var15 >> 16;
                        this.al[var11] = this.ar[var11] * var15 + this.al[var11] * var16 >> 16;
                        this.ar[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = cc[var13];
                        var16 = cz[var13];
                        var17 = this.al[var11] * var15 + this.au[var11] * var16 >> 16;
                        this.al[var11] = this.al[var11] * var16 - this.au[var11] * var15 >> 16;
                        this.au[var11] = var17;
                     }

                     var10000 = this.au;
                     var10000[var11] += cy;
                     var10000 = this.ar;
                     var10000[var11] += co;
                     var10000 = this.al;
                     var10000[var11] += cv;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bh.length) {
                  var9 = this.bh[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.au;
                     var10000[var11] -= cy;
                     var10000 = this.ar;
                     var10000[var11] -= co;
                     var10000 = this.al;
                     var10000[var11] -= cv;
                     this.au[var11] = this.au[var11] * var3 / 128;
                     this.ar[var11] = this.ar[var11] * var4 / 128;
                     this.al[var11] = this.al[var11] * var5 / 128;
                     var10000 = this.au;
                     var10000[var11] += cy;
                     var10000 = this.ar;
                     var10000[var11] += co;
                     var10000 = this.al;
                     var10000[var11] += cv;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.bd != null && this.as != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.bd.length) {
                     var9 = this.bd[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.as[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > 255) {
                           var12 = 255;
                        }

                        this.as[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   final void fk(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      if (this.aj != null && this.aj[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.ay != null && this.ay[var1] != -1) {
            int var17 = this.ay[var1] & 255;
            var18 = this.an[var17];
            var15 = this.ak[var17];
            var16 = this.bn[var17];
         } else {
            var18 = this.ah[var1];
            var15 = this.ap[var1];
            var16 = this.ab[var1];
         }

         if (this.ai[var1] == -1) {
            jw.av(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, bo[var18], bo[var15], bo[var16], bv[var18], bv[var15], bv[var16], bt[var18], bt[var15], bt[var16], this.aj[var1]);
         } else {
            jw.av(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, bo[var18], bo[var15], bo[var16], bv[var18], bv[var15], bv[var16], bt[var18], bt[var15], bt[var16], this.aj[var1]);
         }
      } else {
         boolean var14 = this.bp(var1);
         if (this.ai[var1] == -1 && var14) {
            jw.ak(var2, var3, var4, var5, var6, var7, var8, var9, var10, cw[this.az[var1]], this.cs, this.cp, this.cb, this.cd);
         } else if (this.ai[var1] == -1) {
            jw.aj(var2, var3, var4, var5, var6, var7, var8, var9, var10, cw[this.az[var1]]);
         } else if (var14) {
            jw.an(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.cs, this.cp, this.cb, this.cd);
         } else {
            jw.ay(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }

   }

   public final void ey(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.bs != 2) {
         this.ar();
      }

      int var9 = jw.af();
      int var10 = jw.at();
      int var11 = cc[var1];
      int var12 = cz[var1];
      int var13 = cc[var2];
      int var14 = cz[var2];
      int var15 = cc[var3];
      int var16 = cz[var3];
      int var17 = cc[var4];
      int var18 = cz[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.at; ++var20) {
         int var21 = this.au[var20];
         int var22 = this.ar[var20];
         int var23 = this.al[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         br[var20] = var23 - var19;
         bl[var20] = var9 + var21 * jw.ah() / var8;
         bz[var20] = var10 + var24 * jw.ah() / var8;
         bu[var20] = fq.aq(var8, 849197581);
         if (this.aj != null) {
            bo[var20] = var21;
            bv[var20] = var24;
            bt[var20] = var23;
         }
      }

      try {
         this.ba(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   public jm(jm[] var1, int var2) {
      this.at = 0;
      this.ad = 0;
      this.aw = 0;
      this.av = -1;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         jm var4 = var1[var3];
         if (var4 != null) {
            this.at += var4.at;
            this.ad += var4.ad;
            this.aw += var4.aw;
            if (this.av == -1) {
               this.av = var4.av;
            }
         }
      }

      this.ac(this.at, this.ad, this.aw);
      this.at = 0;
      this.ad = 0;
      this.aw = 0;

      for(var3 = 0; var3 < var2; ++var3) {
         this.ag(var1[var3]);
      }

   }

   public void cc() {
      if (this.bs != 1) {
         this.bs = 1;
         this.ev = 0;
         this.bw = 0;
         this.ba = 0;

         for(int var1 = 0; var1 < this.at; ++var1) {
            int var2 = this.au[var1];
            int var3 = this.ar[var1];
            int var4 = this.al[var1];
            if (-var3 > this.ev * -1141910865) {
               this.ev = -var3 * -2091858865;
            }

            if (var3 > this.bw) {
               this.bw = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.ba) {
               this.ba = var5;
            }
         }

         this.ba = (int)(Math.sqrt((double)this.ba) + 0.99D);
         this.bp = (int)(Math.sqrt((double)(this.ba * this.ba + this.ev * -1141910865 * this.ev * -1141910865)) + 0.99D);
         this.bj = this.bp + (int)(Math.sqrt((double)(this.ba * this.ba + this.bw * this.bw)) + 0.99D);
      }
   }

   public void bd(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.at; ++var4) {
         int[] var10000 = this.au;
         var10000[var4] += var1;
         var10000 = this.ar;
         var10000[var4] += var2;
         var10000 = this.al;
         var10000[var4] += var3;
      }

      this.az();
   }

   public void bx(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.at; ++var4) {
         this.au[var4] = this.au[var4] * var1 / 128;
         this.ar[var4] = this.ar[var4] * var2 / 128;
         this.al[var4] = this.al[var4] * var3 / 128;
      }

      this.az();
   }

   public final void bf(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.bs != 2) {
         this.ar();
      }

      int var8 = jw.af();
      int var9 = jw.at();
      int var10 = cc[var1];
      int var11 = cz[var1];
      int var12 = cc[var2];
      int var13 = cz[var2];
      int var14 = cc[var3];
      int var15 = cz[var3];
      int var16 = cc[var4];
      int var17 = cz[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.at; ++var19) {
         int var20 = this.au[var19];
         int var21 = this.ar[var19];
         int var22 = this.al[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         br[var19] = var22 - var18;
         bl[var19] = var8 + var20 * jw.ah() / var22;
         bz[var19] = var9 + var23 * jw.ah() / var22;
         bu[var19] = fq.aq(var22, 1101188286);
         if (this.aj != null) {
            bo[var19] = var20;
            bv[var19] = var23;
            bt[var19] = var22;
         }
      }

      try {
         this.ba(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   static {
      cc = jw.am;
      cz = jw.ax;
      cw = jw.ac;
      cr = jw.ag;
      ca = fq.aq(50, 1226303992);
      ck = new float[3];
   }

   void ca() {
      if (this.bs != 2) {
         this.bs = 2;
         this.ba = 0;

         for(int var1 = 0; var1 < this.at; ++var1) {
            int var2 = this.au[var1];
            int var3 = this.ar[var1];
            int var4 = this.al[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.ba) {
               this.ba = var5;
            }
         }

         this.ba = (int)(Math.sqrt((double)this.ba) + 0.99D);
         this.bp = this.ba;
         this.bj = this.ba + this.ba;
      }
   }

   public void du() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.al[var1];
         this.al[var1] = -var2;
      }

      this.az();
   }

   void jh(int var1, qf var2, int var3, int var4, int var5, long var6) {
      if (this.bs != 1) {
         this.au();
      }

      this.at(var1);
      qh var8 = new qh();
      var8.ac.ax((float)var1 * 0.0030679614F, 0.0F, 0.0F, (byte)2);
      var8.ag.ax(1.0F, 1.0F, 1.0F, -1394689078);
      var8.ae.ax((float)var3, (float)var4, (float)var5, -1394689078);
      qf var9 = gw.ae(499906008);
      var9.ap(var8, 1408950269);
      var9.ah(var2, -1984080601);
      int var10 = (int)var9.av(0.0F, 0.0F, 0.0F, -1601815994);
      boolean var11 = false;
      int var12 = var10 - this.bp;
      boolean var13 = var12 <= 50 || this.aj != null;
      int var14 = jw.af();
      int var15 = jw.at();

      for(int var16 = 0; var16 < this.at; ++var16) {
         int var17 = this.au[var16];
         int var18 = this.ar[var16];
         int var19 = this.al[var16];
         var9.as((float)var17, (float)var18, (float)var19, ck, 1336802821);
         var17 = (int)ck[0];
         var18 = (int)ck[1];
         var19 = (int)ck[2];
         var11 |= this.bw(var16, var17, var18, var19, var10, var14, var15, var13);
      }

      boolean var21 = kx.al(876561148) && ib.ag(var6);
      var8.ac((byte)-27);
      var9.ag(1876821337);

      try {
         this.ba(var11, var21, this.bm, var6);
      } catch (Exception var20) {
      }

   }

   boolean bw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      br[var1] = var4 - var5;
      if (var8) {
         bo[var1] = var2;
         bv[var1] = var3;
         bt[var1] = var4;
      }

      if (var4 >= 50) {
         bl[var1] = var6 + var2 * jw.ah() / var4;
         bz[var1] = var7 + var3 * jw.ah() / var4;
         bu[var1] = fq.aq(var4, 819155806);
         return false;
      } else {
         bl[var1] = -5000;
         return true;
      }
   }

   final void ba(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.bj < 6000) {
         int var6;
         for(var6 = 0; var6 < this.bj; ++var6) {
            bk[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(char var7 = 0; var7 < this.ad; ++var7) {
            if (this.ai[var7] != -2) {
               var8 = this.ah[var7];
               var9 = this.ap[var7];
               var10 = this.ab[var7];
               var11 = bl[var8];
               var12 = bl[var9];
               var13 = bl[var10];
               int var14;
               if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                  var14 = bo[var8];
                  var15 = bo[var9];
                  var16 = bo[var10];
                  int var17 = bv[var8];
                  var18 = bv[var9];
                  int var19 = bv[var10];
                  int var20 = bt[var8];
                  int var21 = bt[var9];
                  int var22 = bt[var10];
                  var14 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var14 * var22;
                  int var25 = var14 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     bg[var7] = true;
                     int var26 = (br[var8] + br[var9] + br[var10]) / 3 + this.bp;
                     be[var26][bk[var26]++] = var7;
                  }
               } else {
                  if (var2 && hg.ap(bz[var8], bz[var9], bz[var10], var11, var12, var13, var6, -1891253869)) {
                     jy.ab[(jy.ap += -1593675843) * -1277639787 - 1] = var4;
                     var2 = false;
                  }

                  if ((var11 - var12) * (bz[var10] - bz[var9]) - (bz[var8] - bz[var9]) * (var13 - var12) > 0) {
                     bg[var7] = false;
                     var14 = jw.ap();
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var14 && var12 <= var14 && var13 <= var14) {
                        bi[var7] = false;
                     } else {
                        bi[var7] = true;
                     }

                     var15 = (br[var8] + br[var9] + br[var10]) / 3 + this.bp;
                     be[var15][bk[var15]++] = var7;
                  }
               }
            }
         }

         int var27;
         char var28;
         char[] var29;
         if (this.ao == null) {
            for(var27 = this.bj - 1; var27 >= 0; --var27) {
               var28 = bk[var27];
               if (var28 > 0) {
                  var29 = be[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     this.bj(var29[var10]);
                  }
               }
            }

         } else {
            for(var27 = 0; var27 < 12; ++var27) {
               bc[var27] = 0;
               cu[var27] = 0;
            }

            for(var27 = this.bj - 1; var27 >= 0; --var27) {
               var28 = bk[var27];
               if (var28 > 0) {
                  var29 = be[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     char var30 = var29[var10];
                     byte var31 = this.ao[var30];
                     var13 = bc[var31]++;
                     cn[var31][var13] = var30;
                     if (var31 < 10) {
                        int[] var34 = cu;
                        var34[var31] += var27;
                     } else if (var31 == 10) {
                        ch[var13] = var27;
                     } else {
                        cf[var13] = var27;
                     }
                  }
               }
            }

            var27 = 0;
            if (bc[1] > 0 || bc[2] > 0) {
               var27 = (cu[1] + cu[2]) / (bc[1] + bc[2]);
            }

            var8 = 0;
            if (bc[3] > 0 || bc[4] > 0) {
               var8 = (cu[3] + cu[4]) / (bc[3] + bc[4]);
            }

            var9 = 0;
            if (bc[6] > 0 || bc[8] > 0) {
               var9 = (cu[6] + cu[8]) / (bc[6] + bc[8]);
            }

            var11 = 0;
            var12 = bc[10];
            int[] var32 = cn[10];
            int[] var33 = ch;
            if (var11 == var12) {
               var11 = 0;
               var12 = bc[11];
               var32 = cn[11];
               var33 = cf;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var27) {
                  this.bj(var32[var11++]);
                  if (var11 == var12 && var32 != cn[11]) {
                     var11 = 0;
                     var12 = bc[11];
                     var32 = cn[11];
                     var33 = cf;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.bj(var32[var11++]);
                  if (var11 == var12 && var32 != cn[11]) {
                     var11 = 0;
                     var12 = bc[11];
                     var32 = cn[11];
                     var33 = cf;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.bj(var32[var11++]);
                  if (var11 == var12 && var32 != cn[11]) {
                     var11 = 0;
                     var12 = bc[11];
                     var32 = cn[11];
                     var33 = cf;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = bc[var15];
               int[] var35 = cn[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.bj(var35[var18]);
               }
            }

            while(var10 != -1000) {
               this.bj(var32[var11++]);
               if (var11 == var12 && var32 != cn[11]) {
                  var11 = 0;
                  var32 = cn[11];
                  var12 = bc[11];
                  var33 = cf;
               }

               if (var11 < var12) {
                  var10 = var33[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   final void bj(int var1) {
      if (bg[var1]) {
         this.bb(var1);
      } else {
         int var2 = this.ah[var1];
         int var3 = this.ap[var1];
         int var4 = this.ab[var1];
         jw.af.ac = bi[var1];
         if (this.as == null) {
            jw.af.ag = 0;
         } else {
            jw.af.ag = (this.as[var1] == -1 ? 253 : this.as[var1]) & 255;
         }

         this.by(var1, bz[var2], bz[var3], bz[var4], bl[var2], bl[var3], bl[var4], bu[var2], bu[var3], bu[var4], this.az[var1], this.aa[var1], this.ai[var1]);
      }
   }

   boolean bp(int var1) {
      return this.cd > 0 && var1 < this.ce;
   }

   void bk(jm var1) {
      int var2 = this.ah.length;
      if (this.ao == null && (var1.ao != null || this.av != var1.av)) {
         this.ao = new byte[var2];
         Arrays.fill(this.ao, this.av);
      }

      if (this.as == null && var1.as != null) {
         this.as = new byte[var2];
         Arrays.fill(this.as, (byte)0);
      }

      if (this.aj == null && var1.aj != null) {
         this.aj = new short[var2];
         Arrays.fill(this.aj, (short)-1);
      }

      if (this.ay == null && var1.ay != null) {
         this.ay = new byte[var2];
         Arrays.fill(this.ay, (byte)-1);
      }

   }

   final void bb(int var1) {
      int var2 = jw.af();
      int var3 = jw.at();
      int var4 = 0;
      int var5 = this.ah[var1];
      int var6 = this.ap[var1];
      int var7 = this.ab[var1];
      int var8 = bt[var5];
      int var9 = bt[var6];
      int var10 = bt[var7];
      if (this.as == null) {
         jw.af.ag = 0;
      } else {
         jw.af.ag = this.as[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         cm[var4] = bl[var5];
         cj[var4] = bz[var5];
         ci[var4] = bu[var7];
         cx[var4++] = this.az[var1];
      } else {
         var11 = bo[var5];
         var12 = bv[var5];
         var13 = this.az[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * cr[var10 - var8];
            cm[var4] = var2 + (var11 + ((bo[var7] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.ai[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * cr[var9 - var8];
            cm[var4] = var2 + (var11 + ((bo[var6] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.aa[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         cm[var4] = bl[var6];
         cj[var4] = bz[var6];
         ci[var4] = bu[var7];
         cx[var4++] = this.aa[var1];
      } else {
         var11 = bo[var6];
         var12 = bv[var6];
         var13 = this.aa[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * cr[var8 - var9];
            cm[var4] = var2 + (var11 + ((bo[var5] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * cr[var10 - var9];
            cm[var4] = var2 + (var11 + ((bo[var7] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * jw.ah() / 50;
            cx[var4++] = var13 + ((this.ai[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         cm[var4] = bl[var7];
         cj[var4] = bz[var7];
         ci[var4] = bu[var7];
         cx[var4++] = this.ai[var1];
      } else {
         var11 = bo[var7];
         var12 = bv[var7];
         var13 = this.ai[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * cr[var9 - var10];
            cm[var4] = var2 + (var11 + ((bo[var6] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.aa[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * cr[var8 - var10];
            cm[var4] = var2 + (var11 + ((bo[var5] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }
      }

      var11 = cm[0];
      var12 = cm[1];
      var13 = cm[2];
      var14 = cj[0];
      int var15 = cj[1];
      int var16 = cj[2];
      float var17 = ci[0];
      float var18 = ci[1];
      float var19 = ci[2];
      jw.af.ac = false;
      int var20 = jw.ap();
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            jw.af.ac = true;
         }

         this.by(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || cm[3] < 0 || cm[3] > var20) {
            jw.af.ac = true;
         }

         int var22;
         if (this.aj != null && this.aj[var1] != -1) {
            int var23;
            int var25;
            if (this.ay != null && this.ay[var1] != -1) {
               int var24 = this.ay[var1] & 255;
               var25 = this.an[var24];
               var22 = this.ak[var24];
               var23 = this.bn[var24];
            } else {
               var25 = var5;
               var22 = var6;
               var23 = var7;
            }

            short var26 = this.aj[var1];
            if (this.ai[var1] == -1) {
               jw.av(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.az[var1], this.az[var1], this.az[var1], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
               jw.av(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], this.az[var1], this.az[var1], this.az[var1], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
            } else {
               jw.av(var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
               jw.av(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], cx[0], cx[2], cx[3], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
            }
         } else {
            boolean var21 = this.bp(var1);
            if (this.ai[var1] == -1 && var21) {
               var22 = cw[this.az[var1]];
               jw.ak(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.cs, this.cp, this.cb, this.cd);
               jw.ak(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], var22, this.cs, this.cp, this.cb, this.cd);
            } else if (this.ai[var1] == -1) {
               var22 = cw[this.az[var1]];
               jw.aj(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
               jw.aj(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], var22);
            } else if (var21) {
               jw.an(var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2], this.cs, this.cb, this.cp, this.cd);
               jw.an(var14, var16, cj[3], var11, var13, cm[3], 0.0F, 0.0F, 0.0F, cx[0], cx[2], cx[3], this.cs, this.cb, this.cp, this.cd);
            } else {
               jw.ay(var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2]);
               jw.ay(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], cx[0], cx[2], cx[3]);
            }
         }
      }

   }

   void bi(int var1, qf var2) {
      float var3 = (float)this.au[var1];
      float var4 = (float)(-this.ar[var1]);
      float var5 = (float)(-this.al[var1]);
      float var6 = 1.0F;
      this.au[var1] = (int)(var2.ax[0] * var3 + var2.ax[4] * var4 + var2.ax[8] * var5 + var2.ax[12] * var6);
      this.ar[var1] = -((int)(var2.ax[1] * var3 + var2.ax[5] * var4 + var2.ax[9] * var5 + var2.ax[13] * var6));
      this.al[var1] = -((int)(var2.ax[2] * var3 + var2.ax[6] * var4 + var2.ax[10] * var5 + var2.ax[14] * var6));
   }

   void bg(jp var1, int var2) {
      if (this.bx != null) {
         for(int var3 = 0; var3 < this.at; ++var3) {
            int[] var4 = this.bx[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.bf[var3];
               ax.at((byte)117);

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  fb var8 = var1.ag(var7, -2112171220);
                  if (var8 != null) {
                     aq.ar((float)var5[var6] / 255.0F, (byte)0);
                     af.au(var8.at(var2, (byte)-67), 1218100430);
                     af.ah(aq, -2089771450);
                     ax.ad(af, 983296089);
                  }
               }

               this.bi(var3, ax);
            }
         }

      }
   }

   void jp(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      int var15 = jw.am[var2];
      int var16 = jw.ax[var2];
      int var17 = jw.am[var3];
      int var18 = jw.ax[var3];
      this.bs(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   public jm cy(boolean var1) {
      if (!var1 && am.length < this.ad) {
         am = new byte[this.ad + 1402806640];
      }

      return this.af(var1, ag, am);
   }

   void ji(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      int var15 = jw.am[var2];
      int var16 = jw.ax[var2];
      int var17 = jw.am[var3];
      int var18 = jw.ax[var3];
      this.bs(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   public void ck() {
      this.bs = 0;
      this.by.clear();
   }

   void ja(int var1, qf var2, int var3, int var4, int var5, long var6) {
      if (this.bs != 1) {
         this.au();
      }

      this.at(var1);
      qh var8 = new qh();
      var8.ac.ax((float)var1 * 0.0030679614F, 0.0F, 0.0F, (byte)62);
      var8.ag.ax(1.0F, 1.0F, 1.0F, -1394689078);
      var8.ae.ax((float)var3, (float)var4, (float)var5, -1394689078);
      qf var9 = gw.ae(1052897251);
      var9.ap(var8, 1174330567);
      var9.ah(var2, -2031036232);
      int var10 = (int)var9.av(0.0F, 0.0F, 0.0F, -1807194462);
      boolean var11 = false;
      int var12 = var10 - this.bp;
      boolean var13 = var12 <= 50 || this.aj != null;
      int var14 = jw.af();
      int var15 = jw.at();

      for(int var16 = 0; var16 < this.at; ++var16) {
         int var17 = this.au[var16];
         int var18 = this.ar[var16];
         int var19 = this.al[var16];
         var9.as((float)var17, (float)var18, (float)var19, ck, -1410275837);
         var17 = (int)ck[0];
         var18 = (int)ck[1];
         var19 = (int)ck[2];
         var11 |= this.bw(var16, var17, var18, var19, var10, var14, var15, var13);
      }

      boolean var21 = kx.al(876561148) && ib.ag(var6);
      var8.ac((byte)55);
      var9.ag(1819711445);

      try {
         this.ba(var11, var21, this.bm, var6);
      } catch (Exception var20) {
      }

   }

   void jn(int var1, qf var2, int var3, int var4, int var5, long var6) {
      if (this.bs != 1) {
         this.au();
      }

      this.at(var1);
      qh var8 = new qh();
      var8.ac.ax((float)var1 * 0.0030679614F, 0.0F, 0.0F, (byte)67);
      var8.ag.ax(1.0F, 1.0F, 1.0F, -1394689078);
      var8.ae.ax((float)var3, (float)var4, (float)var5, -1394689078);
      qf var9 = gw.ae(989054741);
      var9.ap(var8, 1822209457);
      var9.ah(var2, -2086101107);
      int var10 = (int)var9.av(0.0F, 0.0F, 0.0F, 1355755720);
      boolean var11 = false;
      int var12 = var10 - this.bp;
      boolean var13 = var12 <= 50 || this.aj != null;
      int var14 = jw.af();
      int var15 = jw.at();

      for(int var16 = 0; var16 < this.at; ++var16) {
         int var17 = this.au[var16];
         int var18 = this.ar[var16];
         int var19 = this.al[var16];
         var9.as((float)var17, (float)var18, (float)var19, ck, -1961583650);
         var17 = (int)ck[0];
         var18 = (int)ck[1];
         var19 = (int)ck[2];
         var11 |= this.bw(var16, var17, var18, var19, var10, var14, var15, var13);
      }

      boolean var21 = kx.al(876561148) && ib.ag(var6);
      var8.ac((byte)-12);
      var9.ag(1471087103);

      try {
         this.ba(var11, var21, this.bm, var6);
      } catch (Exception var20) {
      }

   }

   void ju(int var1, qf var2, int var3, int var4, int var5, long var6) {
      if (this.bs != 1) {
         this.au();
      }

      this.at(var1);
      qh var8 = new qh();
      var8.ac.ax((float)var1 * 0.0030679614F, 0.0F, 0.0F, (byte)-66);
      var8.ag.ax(1.0F, 1.0F, 1.0F, -1394689078);
      var8.ae.ax((float)var3, (float)var4, (float)var5, -1394689078);
      qf var9 = gw.ae(606267823);
      var9.ap(var8, -596203912);
      var9.ah(var2, -2075852408);
      int var10 = (int)var9.av(0.0F, 0.0F, 0.0F, -1435556702);
      boolean var11 = false;
      int var12 = var10 - this.bp;
      boolean var13 = var12 <= 1800159403 || this.aj != null;
      int var14 = jw.af();
      int var15 = jw.at();

      for(int var16 = 0; var16 < this.at; ++var16) {
         int var17 = this.au[var16];
         int var18 = this.ar[var16];
         int var19 = this.al[var16];
         var9.as((float)var17, (float)var18, (float)var19, ck, -1394107353);
         var17 = (int)ck[0];
         var18 = (int)ck[1];
         var19 = (int)ck[2];
         var11 |= this.bw(var16, var17, var18, var19, var10, var14, var15, var13);
      }

      boolean var21 = kx.al(876561148) && ib.ag(var6);
      var8.ac((byte)-49);
      var9.ag(1372668759);

      try {
         this.ba(var11, var21, this.bm, var6);
      } catch (Exception var20) {
      }

   }

   public void bn() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.al[var1];
         this.al[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.az();
   }

   void js(int var1, qf var2, int var3, int var4, int var5, long var6) {
      if (this.bs != 1) {
         this.au();
      }

      this.at(var1);
      qh var8 = new qh();
      var8.ac.ax((float)var1 * 0.0030679614F, 0.0F, 0.0F, (byte)-95);
      var8.ag.ax(1.0F, 1.0F, 1.0F, -1394689078);
      var8.ae.ax((float)var3, (float)var4, (float)var5, -1394689078);
      qf var9 = gw.ae(1613149139);
      var9.ap(var8, -1653449781);
      var9.ah(var2, -1981953118);
      int var10 = (int)var9.av(0.0F, 0.0F, 0.0F, -63084696);
      boolean var11 = false;
      int var12 = var10 - this.bp;
      boolean var13 = var12 <= -1494051397 || this.aj != null;
      int var14 = jw.af();
      int var15 = jw.at();

      for(int var16 = 0; var16 < this.at; ++var16) {
         int var17 = this.au[var16];
         int var18 = this.ar[var16];
         int var19 = this.al[var16];
         var9.as((float)var17, (float)var18, (float)var19, ck, 1035952450);
         var17 = (int)ck[0];
         var18 = (int)ck[1];
         var19 = (int)ck[2];
         var11 |= this.bw(var16, var17, var18, var19, var10, var14, var15, var13);
      }

      boolean var21 = kx.al(876561148) && ib.ag(var6);
      var8.ac((byte)7);
      var9.ag(921778069);

      try {
         this.ba(var11, var21, this.bm, var6);
      } catch (Exception var20) {
      }

   }

   void bl(int var1, int var2, int var3) {
      this.au = new int[var1];
      this.ar = new int[var1];
      this.al = new int[var1];
      this.ah = new int[var2];
      this.ap = new int[var2];
      this.ab = new int[var2];
      this.az = new int[var2];
      this.aa = new int[var2];
      this.ai = new int[var2];
      if (var3 > 0) {
         this.an = new int[var3];
         this.ak = new int[var3];
         this.bn = new int[var3];
      }

   }

   void bz(int var1, int var2, int var3) {
      this.au = new int[var1];
      this.ar = new int[var1];
      this.al = new int[var1];
      this.ah = new int[var2];
      this.ap = new int[var2];
      this.ab = new int[var2];
      this.az = new int[var2];
      this.aa = new int[var2];
      this.ai = new int[var2];
      if (var3 > 0) {
         this.an = new int[var3];
         this.ak = new int[var3];
         this.bn = new int[var3];
      }

   }

   void bu(int var1, int var2, int var3) {
      this.au = new int[var1];
      this.ar = new int[var1];
      this.al = new int[var1];
      this.ah = new int[var2];
      this.ap = new int[var2];
      this.ab = new int[var2];
      this.az = new int[var2];
      this.aa = new int[var2];
      this.ai = new int[var2];
      if (var3 > 0) {
         this.an = new int[var3];
         this.ak = new int[var3];
         this.bn = new int[var3];
      }

   }

   void br(int var1, int var2, int var3) {
      this.au = new int[var1];
      this.ar = new int[var1];
      this.al = new int[var1];
      this.ah = new int[var2];
      this.ap = new int[var2];
      this.ab = new int[var2];
      this.az = new int[var2];
      this.aa = new int[var2];
      this.ai = new int[var2];
      if (var3 > 0) {
         this.an = new int[var3];
         this.ak = new int[var3];
         this.bn = new int[var3];
      }

   }

   void bo(int var1, int var2, int var3) {
      this.au = new int[var1];
      this.ar = new int[var1];
      this.al = new int[var1];
      this.ah = new int[var2];
      this.ap = new int[var2];
      this.ab = new int[var2];
      this.az = new int[var2];
      this.aa = new int[var2];
      this.ai = new int[var2];
      if (var3 > 0) {
         this.an = new int[var3];
         this.ak = new int[var3];
         this.bn = new int[var3];
      }

   }

   public void dv(jk var1, int var2) {
      if (this.bh != null) {
         if (var2 != -1) {
            jt var3 = var1.ac[var2];
            jg var4 = var3.ax;
            cy = 0;
            co = 0;
            cv = 0;

            for(int var5 = 0; var5 < var3.aq; ++var5) {
               int var6 = var3.af[var5];
               this.aw(var4.at[var6], var4.au[var6], var3.at[var5], var3.au[var5], var3.ar[var5]);
            }

            this.az();
         }
      }
   }

   void jk(int var1, qf var2, int var3, int var4, int var5, long var6) {
      if (this.bs != 1) {
         this.au();
      }

      this.at(var1);
      qh var8 = new qh();
      var8.ac.ax((float)var1 * 0.0030679614F, 0.0F, 0.0F, (byte)-56);
      var8.ag.ax(1.0F, 1.0F, 1.0F, -1394689078);
      var8.ae.ax((float)var3, (float)var4, (float)var5, -1394689078);
      qf var9 = gw.ae(-218899707);
      var9.ap(var8, 1415464207);
      var9.ah(var2, -2086011399);
      int var10 = (int)var9.av(0.0F, 0.0F, 0.0F, 630799724);
      boolean var11 = false;
      int var12 = var10 - this.bp;
      boolean var13 = var12 <= 50 || this.aj != null;
      int var14 = jw.af();
      int var15 = jw.at();

      for(int var16 = 0; var16 < this.at; ++var16) {
         int var17 = this.au[var16];
         int var18 = this.ar[var16];
         int var19 = this.al[var16];
         var9.as((float)var17, (float)var18, (float)var19, ck, 1601689397);
         var17 = (int)ck[0];
         var18 = (int)ck[1];
         var19 = (int)ck[2];
         var11 |= this.bw(var16, var17, var18, var19, var10, var14, var15, var13);
      }

      boolean var21 = kx.al(876561148) && ib.ag(var6);
      var8.ac((byte)8);
      var9.ag(849701183);

      try {
         this.ba(var11, var21, this.bm, var6);
      } catch (Exception var20) {
      }

   }

   void bq(jm var1) {
      int var2 = this.ah.length;
      if (this.ao == null && (var1.ao != null || this.av != var1.av)) {
         this.ao = new byte[var2];
         Arrays.fill(this.ao, this.av);
      }

      if (this.as == null && var1.as != null) {
         this.as = new byte[var2];
         Arrays.fill(this.as, (byte)0);
      }

      if (this.aj == null && var1.aj != null) {
         this.aj = new short[var2];
         Arrays.fill(this.aj, (short)-1);
      }

      if (this.ay == null && var1.ay != null) {
         this.ay = new byte[var2];
         Arrays.fill(this.ay, (byte)-1);
      }

   }

   jm cv(boolean var1, jm var2, byte[] var3) {
      var2.at = this.at;
      var2.ad = this.ad;
      var2.aw = this.aw;
      if (var2.au == null || var2.au.length < this.at) {
         var2.au = new int[this.at + 100];
         var2.ar = new int[this.at + 100];
         var2.al = new int[this.at + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.at; ++var4) {
         var2.au[var4] = this.au[var4];
         var2.ar[var4] = this.ar[var4];
         var2.al[var4] = this.al[var4];
      }

      if (var1) {
         var2.as = this.as;
      } else {
         var2.as = var3;
         if (this.as == null) {
            for(var4 = 0; var4 < this.ad; ++var4) {
               var2.as[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.ad; ++var4) {
               var2.as[var4] = this.as[var4];
            }
         }
      }

      var2.ah = this.ah;
      var2.ap = this.ap;
      var2.ab = this.ab;
      var2.az = this.az;
      var2.aa = this.aa;
      var2.ai = this.ai;
      var2.ao = this.ao;
      var2.ay = this.ay;
      var2.aj = this.aj;
      var2.av = this.av;
      var2.an = this.an;
      var2.ak = this.ak;
      var2.bn = this.bn;
      var2.bh = this.bh;
      var2.bd = this.bd;
      var2.bx = this.bx;
      var2.bf = this.bf;
      var2.bm = this.bm;
      var2.az();
      var2.cd = 0;
      return var2;
   }

   public void be(jm var1) {
      if (var1 != null) {
         this.ae(var1);

         int var2;
         for(var2 = 0; var2 < var1.ad; ++var2) {
            this.ah[this.ad] = var1.ah[var2] + this.at;
            this.ap[this.ad] = var1.ap[var2] + this.at;
            this.ab[this.ad] = var1.ab[var2] + this.at;
            this.az[this.ad] = var1.az[var2];
            this.aa[this.ad] = var1.aa[var2];
            this.ai[this.ad] = var1.ai[var2];
            if (this.ao != null) {
               this.ao[this.ad] = var1.ao != null ? var1.ao[var2] : var1.av;
            }

            if (this.as != null && var1.as != null) {
               this.as[this.ad] = var1.as[var2];
            }

            if (this.aj != null) {
               this.aj[this.ad] = var1.aj != null ? var1.aj[var2] : -1;
            }

            if (this.ay != null) {
               if (var1.ay != null && var1.ay[var2] != -1) {
                  this.ay[this.ad] = (byte)(var1.ay[var2] + this.aw);
               } else {
                  this.ay[this.ad] = -1;
               }
            }

            ++this.ad;
         }

         for(var2 = 0; var2 < var1.aw; ++var2) {
            this.an[this.aw] = var1.an[var2] + this.at;
            this.ak[this.aw] = var1.ak[var2] + this.at;
            this.bn[this.aw] = var1.bn[var2] + this.at;
            ++this.aw;
         }

         for(var2 = 0; var2 < var1.at; ++var2) {
            this.au[this.at] = var1.au[var2];
            this.ar[this.at] = var1.ar[var2];
            this.al[this.at] = var1.al[var2];
            ++this.at;
         }

      }
   }

   public void bc(jm var1) {
      if (var1 != null) {
         this.ae(var1);

         int var2;
         for(var2 = 0; var2 < var1.ad; ++var2) {
            this.ah[this.ad] = var1.ah[var2] + this.at;
            this.ap[this.ad] = var1.ap[var2] + this.at;
            this.ab[this.ad] = var1.ab[var2] + this.at;
            this.az[this.ad] = var1.az[var2];
            this.aa[this.ad] = var1.aa[var2];
            this.ai[this.ad] = var1.ai[var2];
            if (this.ao != null) {
               this.ao[this.ad] = var1.ao != null ? var1.ao[var2] : var1.av;
            }

            if (this.as != null && var1.as != null) {
               this.as[this.ad] = var1.as[var2];
            }

            if (this.aj != null) {
               this.aj[this.ad] = var1.aj != null ? var1.aj[var2] : -1;
            }

            if (this.ay != null) {
               if (var1.ay != null && var1.ay[var2] != -1) {
                  this.ay[this.ad] = (byte)(var1.ay[var2] + this.aw);
               } else {
                  this.ay[this.ad] = -1;
               }
            }

            ++this.ad;
         }

         for(var2 = 0; var2 < var1.aw; ++var2) {
            this.an[this.aw] = var1.an[var2] + this.at;
            this.ak[this.aw] = var1.ak[var2] + this.at;
            this.bn[this.aw] = var1.bn[var2] + this.at;
            ++this.aw;
         }

         for(var2 = 0; var2 < var1.at; ++var2) {
            this.au[this.at] = var1.au[var2];
            this.ar[this.at] = var1.ar[var2];
            this.al[this.at] = var1.al[var2];
            ++this.at;
         }

      }
   }

   public void cn(jm var1) {
      if (var1 != null) {
         this.ae(var1);

         int var2;
         for(var2 = 0; var2 < var1.ad; ++var2) {
            this.ah[this.ad] = var1.ah[var2] + this.at;
            this.ap[this.ad] = var1.ap[var2] + this.at;
            this.ab[this.ad] = var1.ab[var2] + this.at;
            this.az[this.ad] = var1.az[var2];
            this.aa[this.ad] = var1.aa[var2];
            this.ai[this.ad] = var1.ai[var2];
            if (this.ao != null) {
               this.ao[this.ad] = var1.ao != null ? var1.ao[var2] : var1.av;
            }

            if (this.as != null && var1.as != null) {
               this.as[this.ad] = var1.as[var2];
            }

            if (this.aj != null) {
               this.aj[this.ad] = var1.aj != null ? var1.aj[var2] : -1;
            }

            if (this.ay != null) {
               if (var1.ay != null && var1.ay[var2] != -1) {
                  this.ay[this.ad] = (byte)(var1.ay[var2] + this.aw);
               } else {
                  this.ay[this.ad] = -1;
               }
            }

            ++this.ad;
         }

         for(var2 = 0; var2 < var1.aw; ++var2) {
            this.an[this.aw] = var1.an[var2] + this.at;
            this.ak[this.aw] = var1.ak[var2] + this.at;
            this.bn[this.aw] = var1.bn[var2] + this.at;
            ++this.aw;
         }

         for(var2 = 0; var2 < var1.at; ++var2) {
            this.au[this.at] = var1.au[var2];
            this.ar[this.at] = var1.ar[var2];
            this.al[this.at] = var1.al[var2];
            ++this.at;
         }

      }
   }

   public void dl(fo var1, int var2) {
      jg var3 = var1.am;
      jp var4 = var3.ae(-733614745);
      if (var4 != null) {
         var3.ae(-564285735).ax(var1, var2, -1017958061);
         this.as(var3.ae(1261440351), var1.am((byte)4));
      }

      if (var1.ax(-1239151817)) {
         this.ao(var1, var2);
      }

      this.az();
   }

   public jm cf(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.au();
      int var7 = var2 - this.ba;
      int var8 = var2 + this.ba;
      int var9 = var4 - this.ba;
      int var10 = var4 + this.ba;
      if (var7 >= 0 && var8 + 1695841098 >> 7 < var1.length && var9 >= 0 && var10 + -1105480172 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 451137540 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            jm var11;
            if (var5) {
               var11 = new jm();
               var11.at = this.at;
               var11.ad = this.ad;
               var11.aw = this.aw;
               var11.au = this.au;
               var11.al = this.al;
               var11.ah = this.ah;
               var11.ap = this.ap;
               var11.ab = this.ab;
               var11.az = this.az;
               var11.aa = this.aa;
               var11.ai = this.ai;
               var11.ao = this.ao;
               var11.as = this.as;
               var11.ay = this.ay;
               var11.aj = this.aj;
               var11.av = this.av;
               var11.an = this.an;
               var11.ak = this.ak;
               var11.bn = this.bn;
               var11.bh = this.bh;
               var11.bd = this.bd;
               var11.bm = this.bm;
               var11.ar = new int[var11.at];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.at; ++var12) {
                  var13 = this.au[var12] + var2;
                  var14 = this.al[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 589736843;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (1283247746 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (1407056805 - var16) + var20 * var16 >> 7;
                  var11.ar[var12] = this.ar[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.at; ++var12) {
                  var13 = (-this.ar[var12] << 16) / (this.ev * -1141910865);
                  if (var13 < var6) {
                     var14 = this.au[var12] + var2;
                     var15 = this.al[var12] + var4;
                     var16 = var14 & 966170817;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (268163562 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (1336119700 - var17) + var21 * var17 >> 7;
                     var11.ar[var12] = this.ar[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.az();
            return var11;
         }
      } else {
         return this;
      }
   }

   public jm cu(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.au();
      int var7 = var2 - this.ba;
      int var8 = var2 + this.ba;
      int var9 = var4 - this.ba;
      int var10 = var4 + this.ba;
      if (var7 >= 0 && var8 + -1661019744 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + -791444453 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            jm var11;
            if (var5) {
               var11 = new jm();
               var11.at = this.at;
               var11.ad = this.ad;
               var11.aw = this.aw;
               var11.au = this.au;
               var11.al = this.al;
               var11.ah = this.ah;
               var11.ap = this.ap;
               var11.ab = this.ab;
               var11.az = this.az;
               var11.aa = this.aa;
               var11.ai = this.ai;
               var11.ao = this.ao;
               var11.as = this.as;
               var11.ay = this.ay;
               var11.aj = this.aj;
               var11.av = this.av;
               var11.an = this.an;
               var11.ak = this.ak;
               var11.bn = this.bn;
               var11.bh = this.bh;
               var11.bd = this.bd;
               var11.bm = this.bm;
               var11.ar = new int[var11.at];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.at; ++var12) {
                  var13 = this.au[var12] + var2;
                  var14 = this.al[var12] + var4;
                  var15 = var13 & -1905809589;
                  var16 = var14 & 97777101;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (2036276653 - var16) + var20 * var16 >> 7;
                  var11.ar[var12] = this.ar[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.at; ++var12) {
                  var13 = (-this.ar[var12] << 16) / (this.ev * 261258482);
                  if (var13 < var6) {
                     var14 = this.au[var12] + var2;
                     var15 = this.al[var12] + var4;
                     var16 = var14 & 715410393;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (1821311137 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (-848996348 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.ar[var12] = this.ar[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.az();
            return var11;
         }
      } else {
         return this;
      }
   }

   public jm cm(boolean var1) {
      if (!var1 && ae.length < this.ad) {
         ae = new byte[this.ad + -2117383046];
      }

      return this.af(var1, ac, ae);
   }

   public jm cj(boolean var1) {
      if (!var1 && am.length < this.ad) {
         am = new byte[this.ad + -1402344483];
      }

      return this.af(var1, ag, am);
   }

   public jm cx(boolean var1) {
      if (!var1 && am.length < this.ad) {
         am = new byte[this.ad + 1293072199];
      }

      return this.af(var1, ag, am);
   }

   public jm ci(boolean var1) {
      if (!var1 && am.length < this.ad) {
         am = new byte[this.ad + 100];
      }

      return this.af(var1, ag, am);
   }

   void ee(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.bs != 1) {
         this.au();
      }

      this.at(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.ba * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < ji.ar()) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.ba) * jw.ah();
         if (var16 / var14 < jw.ar()) {
            int var17 = (var15 + this.ba) * jw.ah();
            if (var17 / var14 > jw.au()) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.ba * var2 >> 16;
               int var20 = var19 + (this.bw * var3 >> 16);
               int var21 = (var18 + var20) * jw.ah();
               if (var21 / var14 > jw.ad()) {
                  int var22 = var19 + (this.ev * -465560579 * var3 >> 16);
                  int var23 = (var18 - var22) * jw.ah();
                  if (var23 / var14 < jw.al()) {
                     int var24 = var13 + (this.ev * 7443585 * var2 >> 16);
                     boolean var25 = false;
                     boolean var26 = false;
                     if (var12 - var24 <= 1086028144) {
                        var26 = true;
                     }

                     boolean var27 = var26 || this.aj != null;
                     int var28 = gq.ad(943656814);
                     int var29 = 811264169 * jy.ag;
                     boolean var31 = kx.al(876561148);
                     boolean var32 = ib.ag(var9);
                     boolean var33 = false;
                     int var36;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var49;
                     int var50;
                     if (var32 && var31) {
                        boolean var34 = false;
                        if (cg) {
                           boolean var35;
                           if (!kx.al(876561148)) {
                              var35 = false;
                           } else {
                              du.ah(var2, var3, var4, var5, (byte)66);
                              jn var37 = (jn)this.by.get(var1);
                              var38 = 99335566 * var37.ac + var6;
                              var39 = var7 + var37.ae * -1461851909;
                              var40 = var8 + -55226645 * var37.ag;
                              var41 = var37.am * 367346411;
                              var42 = 247717375 * var37.ax;
                              int var43 = var37.aq * 931924417;
                              int var44 = qq.ax * 995345355 - var38;
                              int var45 = li.aq * 1695231584 - var39;
                              int var46 = -1804556313 * jy.af - var40;
                              if (Math.abs(var44) > var41 + qw.al * -958204205) {
                                 var35 = false;
                              } else if (Math.abs(var45) > -1428429996 * sw.ad + var42) {
                                 var35 = false;
                              } else if (Math.abs(var46) > jy.ah * -130333621 + var43) {
                                 var35 = false;
                              } else if (Math.abs(189845045 * sk.au * var46 - -383763557 * dw.ar * var45) > sw.ad * -1172590335 * var43 + var42 * 535816434 * jy.ah) {
                                 var35 = false;
                              } else if (Math.abs(dw.ar * -1608034387 * var44 - 1959336750 * fo.at * var46) > var41 * jy.ah * -130333621 + -542406647 * qw.al * var43) {
                                 var35 = false;
                              } else if (Math.abs(var45 * fo.at * 456957946 - var44 * sk.au * -999578565) > -1172590335 * sw.ad * var41 + qw.al * -958204205 * var42) {
                                 var35 = false;
                              } else {
                                 var35 = true;
                              }
                           }

                           var34 = var35;
                        } else {
                           var50 = var12 - var13;
                           if (var50 <= 1261826420) {
                              var50 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var50;
                           } else {
                              var17 /= var14;
                              var16 /= var50;
                           }

                           if (var18 > 0) {
                              var23 /= var14;
                              var21 /= var50;
                           } else {
                              var21 /= var14;
                              var23 /= var50;
                           }

                           var36 = var28 - jw.af();
                           var49 = var29 - jw.at();
                           if (var36 > var16 && var36 < var17 && var49 > var23 && var49 < var21) {
                              var34 = true;
                           }
                        }

                        if (var34) {
                           if (this.bm) {
                              jy.ab[(jy.ap += 855357969) * -1433842939 - 1] = var9;
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var48 = jw.af();
                     var50 = jw.at();
                     var36 = 0;
                     var49 = 0;
                     if (var1 != 0) {
                        var36 = cc[var1];
                        var49 = cz[var1];
                     }

                     for(var38 = 0; var38 < this.at; ++var38) {
                        var39 = this.au[var38];
                        var40 = this.ar[var38];
                        var41 = this.al[var38];
                        if (var1 != 0) {
                           var42 = var41 * var36 + var39 * var49 >> 16;
                           var41 = var41 * var49 - var39 * var36 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var39 * var5 >> 16;
                        var41 = var41 * var5 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var40 * var3 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var41 * var3 >> 16;
                        var25 |= this.bw(var38, var39, var42, var41, var12, var48, var50, var27);
                     }

                     try {
                        this.ba(var25, var33, this.bm, var9);
                     } catch (Exception var47) {
                     }

                  }
               }
            }
         }
      }
   }

   jm co(boolean var1, jm var2, byte[] var3) {
      var2.at = this.at;
      var2.ad = this.ad;
      var2.aw = this.aw;
      if (var2.au == null || var2.au.length < this.at) {
         var2.au = new int[this.at + 1781774623];
         var2.ar = new int[this.at + -139954028];
         var2.al = new int[this.at + -1070665071];
      }

      int var4;
      for(var4 = 0; var4 < this.at; ++var4) {
         var2.au[var4] = this.au[var4];
         var2.ar[var4] = this.ar[var4];
         var2.al[var4] = this.al[var4];
      }

      if (var1) {
         var2.as = this.as;
      } else {
         var2.as = var3;
         if (this.as == null) {
            for(var4 = 0; var4 < this.ad; ++var4) {
               var2.as[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.ad; ++var4) {
               var2.as[var4] = this.as[var4];
            }
         }
      }

      var2.ah = this.ah;
      var2.ap = this.ap;
      var2.ab = this.ab;
      var2.az = this.az;
      var2.aa = this.aa;
      var2.ai = this.ai;
      var2.ao = this.ao;
      var2.ay = this.ay;
      var2.aj = this.aj;
      var2.av = this.av;
      var2.an = this.an;
      var2.ak = this.ak;
      var2.bn = this.bn;
      var2.bh = this.bh;
      var2.bd = this.bd;
      var2.bx = this.bx;
      var2.bf = this.bf;
      var2.bm = this.bm;
      var2.az();
      var2.cd = 0;
      return var2;
   }

   void ed(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.bs != 1) {
         this.au();
      }

      this.at(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.ba * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < ji.ar()) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.ba) * jw.ah();
         if (var16 / var14 < jw.ar()) {
            int var17 = (var15 + this.ba) * jw.ah();
            if (var17 / var14 > jw.au()) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.ba * var2 >> 16;
               int var20 = var19 + (this.bw * var3 >> 16);
               int var21 = (var18 + var20) * jw.ah();
               if (var21 / var14 > jw.ad()) {
                  int var22 = var19 + (this.ev * 418786998 * var3 >> 16);
                  int var23 = (var18 - var22) * jw.ah();
                  if (var23 / var14 < jw.al()) {
                     int var24 = var13 + (this.ev * -1141910865 * var2 >> 16);
                     boolean var25 = false;
                     boolean var26 = false;
                     if (var12 - var24 <= 50) {
                        var26 = true;
                     }

                     boolean var27 = var26 || this.aj != null;
                     int var28 = gq.ad(-2111587862);
                     int var29 = -556185469 * jy.ag;
                     boolean var31 = kx.al(876561148);
                     boolean var32 = ib.ag(var9);
                     boolean var33 = false;
                     int var36;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var49;
                     int var50;
                     if (var32 && var31) {
                        boolean var34 = false;
                        if (cg) {
                           boolean var35;
                           if (!kx.al(876561148)) {
                              var35 = false;
                           } else {
                              du.ah(var2, var3, var4, var5, (byte)31);
                              jn var37 = (jn)this.by.get(var1);
                              var38 = 1368567893 * var37.ac + var6;
                              var39 = var7 + var37.ae * 1048577262;
                              var40 = var8 + -2145173519 * var37.ag;
                              var41 = var37.am * -1026412444;
                              var42 = 247717375 * var37.ax;
                              int var43 = var37.aq * 252233445;
                              int var44 = qq.ax * 1373242707 - var38;
                              int var45 = li.aq * -1362840817 - var39;
                              int var46 = 1732864229 * jy.af - var40;
                              if (Math.abs(var44) > var41 + qw.al * -958204205) {
                                 var35 = false;
                              } else if (Math.abs(var45) > 2129729465 * sw.ad + var42) {
                                 var35 = false;
                              } else if (Math.abs(var46) > jy.ah * -1903265906 + var43) {
                                 var35 = false;
                              } else if (Math.abs(189845045 * sk.au * var46 - -1608034387 * dw.ar * var45) > sw.ad * -1172590335 * var43 + var42 * -2093661513 * jy.ah) {
                                 var35 = false;
                              } else if (Math.abs(dw.ar * 1883775319 * var44 - -1308585921 * fo.at * var46) > var41 * jy.ah * -130333621 + -228176924 * qw.al * var43) {
                                 var35 = false;
                              } else if (Math.abs(var45 * fo.at * -1308585921 - var44 * sk.au * 813532896) > 2110220772 * sw.ad * var41 + qw.al * -958204205 * var42) {
                                 var35 = false;
                              } else {
                                 var35 = true;
                              }
                           }

                           var34 = var35;
                        } else {
                           var50 = var12 - var13;
                           if (var50 <= 50) {
                              var50 = 1587633915;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var50;
                           } else {
                              var17 /= var14;
                              var16 /= var50;
                           }

                           if (var18 > 0) {
                              var23 /= var14;
                              var21 /= var50;
                           } else {
                              var21 /= var14;
                              var23 /= var50;
                           }

                           var36 = var28 - jw.af();
                           var49 = var29 - jw.at();
                           if (var36 > var16 && var36 < var17 && var49 > var23 && var49 < var21) {
                              var34 = true;
                           }
                        }

                        if (var34) {
                           if (this.bm) {
                              jy.ab[(jy.ap += -569677491) * -1277639787 - 1] = var9;
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var48 = jw.af();
                     var50 = jw.at();
                     var36 = 0;
                     var49 = 0;
                     if (var1 != 0) {
                        var36 = cc[var1];
                        var49 = cz[var1];
                     }

                     for(var38 = 0; var38 < this.at; ++var38) {
                        var39 = this.au[var38];
                        var40 = this.ar[var38];
                        var41 = this.al[var38];
                        if (var1 != 0) {
                           var42 = var41 * var36 + var39 * var49 >> 16;
                           var41 = var41 * var49 - var39 * var36 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var39 * var5 >> 16;
                        var41 = var41 * var5 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var40 * var3 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var41 * var3 >> 16;
                        var25 |= this.bw(var38, var39, var42, var41, var12, var48, var50, var27);
                     }

                     try {
                        this.ba(var25, var33, this.bm, var9);
                     } catch (Exception var47) {
                     }

                  }
               }
            }
         }
      }
   }

   jm cg(boolean var1, jm var2, byte[] var3) {
      var2.at = this.at;
      var2.ad = this.ad;
      var2.aw = this.aw;
      if (var2.au == null || var2.au.length < this.at) {
         var2.au = new int[this.at + 1318782728];
         var2.ar = new int[this.at + -1199052211];
         var2.al = new int[this.at + 1764117921];
      }

      int var4;
      for(var4 = 0; var4 < this.at; ++var4) {
         var2.au[var4] = this.au[var4];
         var2.ar[var4] = this.ar[var4];
         var2.al[var4] = this.al[var4];
      }

      if (var1) {
         var2.as = this.as;
      } else {
         var2.as = var3;
         if (this.as == null) {
            for(var4 = 0; var4 < this.ad; ++var4) {
               var2.as[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.ad; ++var4) {
               var2.as[var4] = this.as[var4];
            }
         }
      }

      var2.ah = this.ah;
      var2.ap = this.ap;
      var2.ab = this.ab;
      var2.az = this.az;
      var2.aa = this.aa;
      var2.ai = this.ai;
      var2.ao = this.ao;
      var2.ay = this.ay;
      var2.aj = this.aj;
      var2.av = this.av;
      var2.an = this.an;
      var2.ak = this.ak;
      var2.bn = this.bn;
      var2.bh = this.bh;
      var2.bd = this.bd;
      var2.bx = this.bx;
      var2.bf = this.bf;
      var2.bm = this.bm;
      var2.az();
      var2.cd = 0;
      return var2;
   }

   public void dy(jk var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.aa(var1, var2);
      } else {
         jt var5 = var1.ac[var2];
         jg var6 = var5.ax;
         byte var7 = 0;
         int var11 = var7 + 1;
         int var8 = var3[var7];
         cy = 0;
         co = 0;
         cv = 0;

         for(int var9 = 0; var9 < var5.aq; ++var9) {
            int var10;
            for(var10 = var5.af[var9]; var10 > var8; var8 = var3[var11++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.at[var10] == 0) {
                  this.aw(var6.at[var10], var6.au[var10], var5.at[var9], var5.au[var9], var5.ar[var9]);
               }
            } else if (var10 != var8 || var6.at[var10] == 0) {
               this.aw(var6.at[var10], var6.au[var10], var5.at[var9], var5.au[var9], var5.ar[var9]);
            }
         }

      }
   }

   void cq(int var1) {
      if (!this.by.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = cz[var1];
         int var9 = cc[var1];

         for(int var10 = 0; var10 < this.at; ++var10) {
            int var11 = ka.ac(this.au[var10], this.al[var10], var8, var9, -1573189626);
            int var12 = this.ar[var10];
            int var14 = this.au[var10];
            int var15 = this.al[var10];
            int var13 = var8 * var15 - var9 * var14 >> 16;
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }
         }

         jn var17 = new jn((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         boolean var18 = true;
         if (var17.am * 271142541 < -835657689) {
            var17.am = 178202024;
         }

         if (var17.aq * -1298692998 < -1900529788) {
            var17.aq = -1629435872;
         }

         if (this.bm) {
            boolean var19 = true;
            var17.am += 1985559188;
            var17.aq += -1481100792;
         }

         this.by.put(var1, var17);
      }
   }

   public void av(jk var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.aa(var1, var2);
      } else {
         jt var5 = var1.ac[var2];
         jg var6 = var5.ax;
         byte var7 = 0;
         int var11 = var7 + 1;
         int var8 = var3[var7];
         cy = 0;
         co = 0;
         cv = 0;

         for(int var9 = 0; var9 < var5.aq; ++var9) {
            int var10;
            for(var10 = var5.af[var9]; var10 > var8; var8 = var3[var11++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.at[var10] == 0) {
                  this.aw(var6.at[var10], var6.au[var10], var5.at[var9], var5.au[var9], var5.ar[var9]);
               }
            } else if (var10 != var8 || var6.at[var10] == 0) {
               this.aw(var6.at[var10], var6.au[var10], var5.at[var9], var5.au[var9], var5.ar[var9]);
            }
         }

      }
   }

   void bv(jm var1) {
      int var2 = this.ah.length;
      if (this.ao == null && (var1.ao != null || this.av != var1.av)) {
         this.ao = new byte[var2];
         Arrays.fill(this.ao, this.av);
      }

      if (this.as == null && var1.as != null) {
         this.as = new byte[var2];
         Arrays.fill(this.as, (byte)0);
      }

      if (this.aj == null && var1.aj != null) {
         this.aj = new short[var2];
         Arrays.fill(this.aj, (short)-1);
      }

      if (this.ay == null && var1.ay != null) {
         this.ay = new byte[var2];
         Arrays.fill(this.ay, (byte)-1);
      }

   }

   public void eh(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.at; ++var4) {
         int[] var10000 = this.au;
         var10000[var4] += var1;
         var10000 = this.ar;
         var10000[var4] += var2;
         var10000 = this.al;
         var10000[var4] += var3;
      }

      this.az();
   }

   public void ef() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.al[var1];
         this.al[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.az();
   }

   void cl() {
      if (this.bs != 2) {
         this.bs = 2;
         this.ba = 0;

         for(int var1 = 0; var1 < this.at; ++var1) {
            int var2 = this.au[var1];
            int var3 = this.ar[var1];
            int var4 = this.al[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.ba) {
               this.ba = var5;
            }
         }

         this.ba = (int)(Math.sqrt((double)this.ba) + 0.99D);
         this.bp = this.ba;
         this.bj = this.ba + this.ba;
      }
   }

   void ac(int var1, int var2, int var3) {
      this.au = new int[var1];
      this.ar = new int[var1];
      this.al = new int[var1];
      this.ah = new int[var2];
      this.ap = new int[var2];
      this.ab = new int[var2];
      this.az = new int[var2];
      this.aa = new int[var2];
      this.ai = new int[var2];
      if (var3 > 0) {
         this.an = new int[var3];
         this.ak = new int[var3];
         this.bn = new int[var3];
      }

   }

   public int cs() {
      this.au();
      return this.ba;
   }

   public int cp() {
      this.au();
      return this.ba;
   }

   public int cb() {
      this.au();
      return this.ba;
   }

   public int cd() {
      this.au();
      return this.ba;
   }

   public void ce() {
      this.bs = 0;
      this.by.clear();
   }

   public void ai(fo var1, int var2) {
      jg var3 = var1.am;
      jp var4 = var3.ae(354025794);
      if (var4 != null) {
         var3.ae(1919152542).ax(var1, var2, -873617787);
         this.as(var3.ae(-1080086890), var1.am((byte)4));
      }

      if (var1.ax(-2036638836)) {
         this.ao(var1, var2);
      }

      this.az();
   }

   final void fu(int var1) {
      int var2 = jw.af();
      int var3 = jw.at();
      int var4 = 0;
      int var5 = this.ah[var1];
      int var6 = this.ap[var1];
      int var7 = this.ab[var1];
      int var8 = bt[var5];
      int var9 = bt[var6];
      int var10 = bt[var7];
      if (this.as == null) {
         jw.af.ag = 0;
      } else {
         jw.af.ag = this.as[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= -634094017) {
         cm[var4] = bl[var5];
         cj[var4] = bz[var5];
         ci[var4] = bu[var7];
         cx[var4++] = this.az[var1];
      } else {
         var11 = bo[var5];
         var12 = bv[var5];
         var13 = this.az[var1];
         if (var10 >= 2003730696) {
            var14 = (50 - var8) * cr[var10 - var8];
            cm[var4] = var2 + (var11 + ((bo[var7] - var11) * var14 >> 16)) * jw.ah() / -1814982754;
            cj[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.ai[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 908519516) {
            var14 = (-821571120 - var8) * cr[var9 - var8];
            cm[var4] = var2 + (var11 + ((bo[var6] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.aa[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         cm[var4] = bl[var6];
         cj[var4] = bz[var6];
         ci[var4] = bu[var7];
         cx[var4++] = this.aa[var1];
      } else {
         var11 = bo[var6];
         var12 = bv[var6];
         var13 = this.aa[var1];
         if (var8 >= 50) {
            var14 = (-1830033976 - var9) * cr[var8 - var9];
            cm[var4] = var2 + (var11 + ((bo[var5] - var11) * var14 >> 16)) * jw.ah() / 1389108213;
            cj[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * jw.ah() / -260986463;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (-76852995 - var9) * cr[var10 - var9];
            cm[var4] = var2 + (var11 + ((bo[var7] - var11) * var14 >> 16)) * jw.ah() / -1913109161;
            cj[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * jw.ah() / 50;
            cx[var4++] = var13 + ((this.ai[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         cm[var4] = bl[var7];
         cj[var4] = bz[var7];
         ci[var4] = bu[var7];
         cx[var4++] = this.ai[var1];
      } else {
         var11 = bo[var7];
         var12 = bv[var7];
         var13 = this.ai[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * cr[var9 - var10];
            cm[var4] = var2 + (var11 + ((bo[var6] - var11) * var14 >> 16)) * jw.ah() / 1093744490;
            cj[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.aa[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 517795841) {
            var14 = (-1688870083 - var10) * cr[var8 - var10];
            cm[var4] = var2 + (var11 + ((bo[var5] - var11) * var14 >> 16)) * jw.ah() / 1770707928;
            cj[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * jw.ah() / -516155043;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }
      }

      var11 = cm[0];
      var12 = cm[1];
      var13 = cm[2];
      var14 = cj[0];
      int var15 = cj[1];
      int var16 = cj[2];
      float var17 = ci[0];
      float var18 = ci[1];
      float var19 = ci[2];
      jw.af.ac = false;
      int var20 = jw.ap();
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            jw.af.ac = true;
         }

         this.by(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || cm[3] < 0 || cm[3] > var20) {
            jw.af.ac = true;
         }

         int var22;
         if (this.aj != null && this.aj[var1] != -1) {
            int var23;
            int var25;
            if (this.ay != null && this.ay[var1] != -1) {
               int var24 = this.ay[var1] & -1802137919;
               var25 = this.an[var24];
               var22 = this.ak[var24];
               var23 = this.bn[var24];
            } else {
               var25 = var5;
               var22 = var6;
               var23 = var7;
            }

            short var26 = this.aj[var1];
            if (this.ai[var1] == -1) {
               jw.av(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.az[var1], this.az[var1], this.az[var1], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
               jw.av(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], this.az[var1], this.az[var1], this.az[var1], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
            } else {
               jw.av(var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
               jw.av(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], cx[0], cx[2], cx[3], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
            }
         } else {
            boolean var21 = this.bp(var1);
            if (this.ai[var1] == -1 && var21) {
               var22 = cw[this.az[var1]];
               jw.ak(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.cs, this.cp, this.cb, this.cd);
               jw.ak(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], var22, this.cs, this.cp, this.cb, this.cd);
            } else if (this.ai[var1] == -1) {
               var22 = cw[this.az[var1]];
               jw.aj(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
               jw.aj(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], var22);
            } else if (var21) {
               jw.an(var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2], this.cs, this.cb, this.cp, this.cd);
               jw.an(var14, var16, cj[3], var11, var13, cm[3], 0.0F, 0.0F, 0.0F, cx[0], cx[2], cx[3], this.cs, this.cb, this.cp, this.cd);
            } else {
               jw.ay(var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2]);
               jw.ay(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], cx[0], cx[2], cx[3]);
            }
         }
      }

   }

   public void df(jk var1, int var2) {
      if (this.bh != null) {
         if (var2 != -1) {
            jt var3 = var1.ac[var2];
            jg var4 = var3.ax;
            cy = 0;
            co = 0;
            cv = 0;

            for(int var5 = 0; var5 < var3.aq; ++var5) {
               int var6 = var3.af[var5];
               this.aw(var4.at[var6], var4.au[var6], var3.at[var5], var3.au[var5], var3.ar[var5]);
            }

            this.az();
         }
      }
   }

   public void dm(jk var1, int var2, jk var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            jt var6 = var1.ac[var2];
            jt var7 = var3.ac[var4];
            jg var8 = var6.ax;
            cy = 0;
            co = 0;
            cv = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.aq; ++var11) {
               for(var12 = var6.af[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 != var10 || var8.at[var12] == 0) {
                  this.aw(var8.at[var12], var8.au[var12], var6.at[var11], var6.au[var11], var6.ar[var11]);
               }
            }

            cy = 0;
            co = 0;
            cv = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.aq; ++var11) {
               for(var12 = var7.af[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 == var10 || var8.at[var12] == 0) {
                  this.aw(var8.at[var12], var8.au[var12], var7.at[var11], var7.au[var11], var7.ar[var11]);
               }
            }

            this.az();
         } else {
            this.aa(var1, var2);
         }
      }
   }

   public void dt(jk var1, int var2) {
      if (this.bh != null) {
         if (var2 != -1) {
            jt var3 = var1.ac[var2];
            jg var4 = var3.ax;
            cy = 0;
            co = 0;
            cv = 0;

            for(int var5 = 0; var5 < var3.aq; ++var5) {
               int var6 = var3.af[var5];
               this.aw(var4.at[var6], var4.au[var6], var3.at[var5], var3.au[var5], var3.ar[var5]);
            }

            this.az();
         }
      }
   }

   public void dk(fo var1, int var2) {
      jg var3 = var1.am;
      jp var4 = var3.ae(-1299310515);
      if (var4 != null) {
         var3.ae(1006081399).ax(var1, var2, -13230176);
         this.as(var3.ae(686789134), var1.am((byte)4));
      }

      if (var1.ax(-1083626433)) {
         this.ao(var1, var2);
      }

      this.az();
   }

   public void cr() {
      if (this.bs != 1) {
         this.bs = 1;
         this.ev = 0;
         this.bw = 0;
         this.ba = 0;

         for(int var1 = 0; var1 < this.at; ++var1) {
            int var2 = this.au[var1];
            int var3 = this.ar[var1];
            int var4 = this.al[var1];
            if (-var3 > this.ev * -2061796621) {
               this.ev = -var3 * -820074369;
            }

            if (var3 > this.bw) {
               this.bw = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.ba) {
               this.ba = var5;
            }
         }

         this.ba = (int)(Math.sqrt((double)this.ba) + 0.99D);
         this.bp = (int)(Math.sqrt((double)(this.ba * this.ba + this.ev * -855382948 * this.ev * -73700109)) + 0.99D);
         this.bj = this.bp + (int)(Math.sqrt((double)(this.ba * this.ba + this.bw * this.bw)) + 0.99D);
      }
   }

   void db(fo var1, int var2) {
      jg var3 = var1.am;

      for(int var4 = 0; var4 < var3.af * 1213891965; ++var4) {
         int var5 = var3.at[var4];
         if (var5 == 5 && var1.ae != null && var1.ae[var4] != null && var1.ae[var4][0] != null && this.bd != null && this.as != null) {
            fr var6 = var1.ae[var4][0];
            int[] var7 = var3.au[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.bd.length) {
                  int[] var11 = this.bd[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.as[var13] & 255) + var6.ag(var2, 190623544) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 255;
                     }

                     this.as[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   final void ej(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.bj < 6000) {
         int var6;
         for(var6 = 0; var6 < this.bj; ++var6) {
            bk[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(char var7 = 0; var7 < this.ad; ++var7) {
            if (this.ai[var7] != -1536881038) {
               var8 = this.ah[var7];
               var9 = this.ap[var7];
               var10 = this.ab[var7];
               var11 = bl[var8];
               var12 = bl[var9];
               var13 = bl[var10];
               int var14;
               if (var1 && (var11 == 1992989867 || var12 == -5000 || var13 == 1987592743)) {
                  var14 = bo[var8];
                  var15 = bo[var9];
                  var16 = bo[var10];
                  int var17 = bv[var8];
                  var18 = bv[var9];
                  int var19 = bv[var10];
                  int var20 = bt[var8];
                  int var21 = bt[var9];
                  int var22 = bt[var10];
                  var14 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var14 * var22;
                  int var25 = var14 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     bg[var7] = true;
                     int var26 = (br[var8] + br[var9] + br[var10]) / 3 + this.bp;
                     be[var26][bk[var26]++] = var7;
                  }
               } else {
                  if (var2 && hg.ap(bz[var8], bz[var9], bz[var10], var11, var12, var13, var6, -1552221073)) {
                     jy.ab[(jy.ap += 1506991528) * -1277639787 - 1] = var4;
                     var2 = false;
                  }

                  if ((var11 - var12) * (bz[var10] - bz[var9]) - (bz[var8] - bz[var9]) * (var13 - var12) > 0) {
                     bg[var7] = false;
                     var14 = jw.ap();
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var14 && var12 <= var14 && var13 <= var14) {
                        bi[var7] = false;
                     } else {
                        bi[var7] = true;
                     }

                     var15 = (br[var8] + br[var9] + br[var10]) / 3 + this.bp;
                     be[var15][bk[var15]++] = var7;
                  }
               }
            }
         }

         int var27;
         char var28;
         char[] var29;
         if (this.ao == null) {
            for(var27 = this.bj - 1; var27 >= 0; --var27) {
               var28 = bk[var27];
               if (var28 > 0) {
                  var29 = be[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     this.bj(var29[var10]);
                  }
               }
            }

         } else {
            for(var27 = 0; var27 < 12; ++var27) {
               bc[var27] = 0;
               cu[var27] = 0;
            }

            for(var27 = this.bj - 1; var27 >= 0; --var27) {
               var28 = bk[var27];
               if (var28 > 0) {
                  var29 = be[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     char var30 = var29[var10];
                     byte var31 = this.ao[var30];
                     var13 = bc[var31]++;
                     cn[var31][var13] = var30;
                     if (var31 < 10) {
                        int[] var34 = cu;
                        var34[var31] += var27;
                     } else if (var31 == 10) {
                        ch[var13] = var27;
                     } else {
                        cf[var13] = var27;
                     }
                  }
               }
            }

            var27 = 0;
            if (bc[1] > 0 || bc[2] > 0) {
               var27 = (cu[1] + cu[2]) / (bc[1] + bc[2]);
            }

            var8 = 0;
            if (bc[3] > 0 || bc[4] > 0) {
               var8 = (cu[3] + cu[4]) / (bc[3] + bc[4]);
            }

            var9 = 0;
            if (bc[6] > 0 || bc[8] > 0) {
               var9 = (cu[6] + cu[8]) / (bc[6] + bc[8]);
            }

            var11 = 0;
            var12 = bc[10];
            int[] var32 = cn[10];
            int[] var33 = ch;
            if (var11 == var12) {
               var11 = 0;
               var12 = bc[11];
               var32 = cn[11];
               var33 = cf;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = 612640178;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var27) {
                  this.bj(var32[var11++]);
                  if (var11 == var12 && var32 != cn[11]) {
                     var11 = 0;
                     var12 = bc[11];
                     var32 = cn[11];
                     var33 = cf;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.bj(var32[var11++]);
                  if (var11 == var12 && var32 != cn[11]) {
                     var11 = 0;
                     var12 = bc[11];
                     var32 = cn[11];
                     var33 = cf;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.bj(var32[var11++]);
                  if (var11 == var12 && var32 != cn[11]) {
                     var11 = 0;
                     var12 = bc[11];
                     var32 = cn[11];
                     var33 = cf;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = bc[var15];
               int[] var35 = cn[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.bj(var35[var18]);
               }
            }

            while(var10 != 977989566) {
               this.bj(var32[var11++]);
               if (var11 == var12 && var32 != cn[11]) {
                  var11 = 0;
                  var32 = cn[11];
                  var12 = bc[11];
                  var33 = cf;
               }

               if (var11 < var12) {
                  var10 = var33[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   void dw(fo var1, int var2) {
      jg var3 = var1.am;

      for(int var4 = 0; var4 < var3.af * -80670947; ++var4) {
         int var5 = var3.at[var4];
         if (var5 == 5 && var1.ae != null && var1.ae[var4] != null && var1.ae[var4][0] != null && this.bd != null && this.as != null) {
            fr var6 = var1.ae[var4][0];
            int[] var7 = var3.au[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.bd.length) {
                  int[] var11 = this.bd[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.as[var13] & 1893186715) + var6.ag(var2, 1864064393) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = -1729564350;
                     }

                     this.as[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   void ct(int var1) {
      if (!this.by.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = cz[var1];
         int var9 = cc[var1];

         for(int var10 = 0; var10 < this.at; ++var10) {
            int var11 = ka.ac(this.au[var10], this.al[var10], var8, var9, -975047083);
            int var12 = this.ar[var10];
            int var14 = this.au[var10];
            int var15 = this.al[var10];
            int var13 = var8 * var15 - var9 * var14 >> 16;
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }
         }

         jn var17 = new jn((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         boolean var18 = true;
         if (var17.am * -164160346 < 32) {
            var17.am = 799337332;
         }

         if (var17.aq * 931924417 < 32) {
            var17.aq = -212679224;
         }

         if (this.bm) {
            boolean var19 = true;
            var17.am += -2021802888;
            var17.aq += -1481100792;
         }

         this.by.put(var1, var17);
      }
   }

   void dx(jp var1, int var2) {
      this.bg(var1, var2);
   }

   void dj(jp var1, int var2) {
      this.bg(var1, var2);
   }

   void do(jp var1, int var2) {
      this.bg(var1, var2);
   }

   public void dh(jk var1, int var2, jk var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            jt var6 = var1.ac[var2];
            jt var7 = var3.ac[var4];
            jg var8 = var6.ax;
            cy = 0;
            co = 0;
            cv = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.aq; ++var11) {
               for(var12 = var6.af[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 != var10 || var8.at[var12] == 0) {
                  this.aw(var8.at[var12], var8.au[var12], var6.at[var11], var6.au[var11], var6.ar[var11]);
               }
            }

            cy = 0;
            co = 0;
            cv = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.aq; ++var11) {
               for(var12 = var7.af[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 == var10 || var8.at[var12] == 0) {
                  this.aw(var8.at[var12], var8.au[var12], var7.at[var11], var7.au[var11], var7.ar[var11]);
               }
            }

            this.az();
         } else {
            this.aa(var1, var2);
         }
      }
   }

   final void fg(int var1) {
      int var2 = jw.af();
      int var3 = jw.at();
      int var4 = 0;
      int var5 = this.ah[var1];
      int var6 = this.ap[var1];
      int var7 = this.ab[var1];
      int var8 = bt[var5];
      int var9 = bt[var6];
      int var10 = bt[var7];
      if (this.as == null) {
         jw.af.ag = 0;
      } else {
         jw.af.ag = this.as[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         cm[var4] = bl[var5];
         cj[var4] = bz[var5];
         ci[var4] = bu[var7];
         cx[var4++] = this.az[var1];
      } else {
         var11 = bo[var5];
         var12 = bv[var5];
         var13 = this.az[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * cr[var10 - var8];
            cm[var4] = var2 + (var11 + ((bo[var7] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.ai[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * cr[var9 - var8];
            cm[var4] = var2 + (var11 + ((bo[var6] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.aa[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         cm[var4] = bl[var6];
         cj[var4] = bz[var6];
         ci[var4] = bu[var7];
         cx[var4++] = this.aa[var1];
      } else {
         var11 = bo[var6];
         var12 = bv[var6];
         var13 = this.aa[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * cr[var8 - var9];
            cm[var4] = var2 + (var11 + ((bo[var5] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * cr[var10 - var9];
            cm[var4] = var2 + (var11 + ((bo[var7] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * jw.ah() / 50;
            cx[var4++] = var13 + ((this.ai[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         cm[var4] = bl[var7];
         cj[var4] = bz[var7];
         ci[var4] = bu[var7];
         cx[var4++] = this.ai[var1];
      } else {
         var11 = bo[var7];
         var12 = bv[var7];
         var13 = this.ai[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * cr[var9 - var10];
            cm[var4] = var2 + (var11 + ((bo[var6] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.aa[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * cr[var8 - var10];
            cm[var4] = var2 + (var11 + ((bo[var5] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }
      }

      var11 = cm[0];
      var12 = cm[1];
      var13 = cm[2];
      var14 = cj[0];
      int var15 = cj[1];
      int var16 = cj[2];
      float var17 = ci[0];
      float var18 = ci[1];
      float var19 = ci[2];
      jw.af.ac = false;
      int var20 = jw.ap();
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            jw.af.ac = true;
         }

         this.by(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || cm[3] < 0 || cm[3] > var20) {
            jw.af.ac = true;
         }

         int var22;
         if (this.aj != null && this.aj[var1] != -1) {
            int var23;
            int var25;
            if (this.ay != null && this.ay[var1] != -1) {
               int var24 = this.ay[var1] & 255;
               var25 = this.an[var24];
               var22 = this.ak[var24];
               var23 = this.bn[var24];
            } else {
               var25 = var5;
               var22 = var6;
               var23 = var7;
            }

            short var26 = this.aj[var1];
            if (this.ai[var1] == -1) {
               jw.av(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.az[var1], this.az[var1], this.az[var1], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
               jw.av(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], this.az[var1], this.az[var1], this.az[var1], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
            } else {
               jw.av(var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
               jw.av(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], cx[0], cx[2], cx[3], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
            }
         } else {
            boolean var21 = this.bp(var1);
            if (this.ai[var1] == -1 && var21) {
               var22 = cw[this.az[var1]];
               jw.ak(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.cs, this.cp, this.cb, this.cd);
               jw.ak(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], var22, this.cs, this.cp, this.cb, this.cd);
            } else if (this.ai[var1] == -1) {
               var22 = cw[this.az[var1]];
               jw.aj(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
               jw.aj(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], var22);
            } else if (var21) {
               jw.an(var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2], this.cs, this.cb, this.cp, this.cd);
               jw.an(var14, var16, cj[3], var11, var13, cm[3], 0.0F, 0.0F, 0.0F, cx[0], cx[2], cx[3], this.cs, this.cb, this.cp, this.cd);
            } else {
               jw.ay(var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2]);
               jw.ay(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], cx[0], cx[2], cx[3]);
            }
         }
      }

   }

   public void dq(jk var1, int var2, jk var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            jt var6 = var1.ac[var2];
            jt var7 = var3.ac[var4];
            jg var8 = var6.ax;
            cy = 0;
            co = 0;
            cv = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.aq; ++var11) {
               for(var12 = var6.af[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 != var10 || var8.at[var12] == 0) {
                  this.aw(var8.at[var12], var8.au[var12], var6.at[var11], var6.au[var11], var6.ar[var11]);
               }
            }

            cy = 0;
            co = 0;
            cv = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.aq; ++var11) {
               for(var12 = var7.af[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 == var10 || var8.at[var12] == 0) {
                  this.aw(var8.at[var12], var8.au[var12], var7.at[var11], var7.au[var11], var7.ar[var11]);
               }
            }

            this.az();
         } else {
            this.aa(var1, var2);
         }
      }
   }

   public void di(jg var1, fo var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      jp var7 = var1.ae(562815490);
      if (var7 != null) {
         var7.aq(var2, var3, var4, var5, 1770407845);
         if (var6) {
            this.as(var7, var2.am((byte)4));
         }
      }

      if (!var5 && var2.ax(1715953097)) {
         this.ao(var2, var3);
      }

   }

   public void da(jg var1, fo var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      jp var7 = var1.ae(-1207067900);
      if (var7 != null) {
         var7.aq(var2, var3, var4, var5, 1362294836);
         if (var6) {
            this.as(var7, var2.am((byte)4));
         }
      }

      if (!var5 && var2.ax(-104490540)) {
         this.ao(var2, var3);
      }

   }

   public void dz(jg var1, fo var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      jp var7 = var1.ae(1886325823);
      if (var7 != null) {
         var7.aq(var2, var3, var4, var5, 715301508);
         if (var6) {
            this.as(var7, var2.am((byte)4));
         }
      }

      if (!var5 && var2.ax(1344568901)) {
         this.ao(var2, var3);
      }

   }

   public void dg(jk var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.aa(var1, var2);
      } else {
         jt var5 = var1.ac[var2];
         jg var6 = var5.ax;
         byte var7 = 0;
         int var11 = var7 + 1;
         int var8 = var3[var7];
         cy = 0;
         co = 0;
         cv = 0;

         for(int var9 = 0; var9 < var5.aq; ++var9) {
            int var10;
            for(var10 = var5.af[var9]; var10 > var8; var8 = var3[var11++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.at[var10] == 0) {
                  this.aw(var6.at[var10], var6.au[var10], var5.at[var9], var5.au[var9], var5.ar[var9]);
               }
            } else if (var10 != var8 || var6.at[var10] == 0) {
               this.aw(var6.at[var10], var6.au[var10], var5.at[var9], var5.au[var9], var5.ar[var9]);
            }
         }

      }
   }

   public void dr(jk var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.aa(var1, var2);
      } else {
         jt var5 = var1.ac[var2];
         jg var6 = var5.ax;
         byte var7 = 0;
         int var11 = var7 + 1;
         int var8 = var3[var7];
         cy = 0;
         co = 0;
         cv = 0;

         for(int var9 = 0; var9 < var5.aq; ++var9) {
            int var10;
            for(var10 = var5.af[var9]; var10 > var8; var8 = var3[var11++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.at[var10] == 0) {
                  this.aw(var6.at[var10], var6.au[var10], var5.at[var9], var5.au[var9], var5.ar[var9]);
               }
            } else if (var10 != var8 || var6.at[var10] == 0) {
               this.aw(var6.at[var10], var6.au[var10], var5.at[var9], var5.au[var9], var5.ar[var9]);
            }
         }

      }
   }

   public final void ek(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.bs != 2) {
         this.ar();
      }

      int var8 = jw.af();
      int var9 = jw.at();
      int var10 = cc[var1];
      int var11 = cz[var1];
      int var12 = cc[var2];
      int var13 = cz[var2];
      int var14 = cc[var3];
      int var15 = cz[var3];
      int var16 = cc[var4];
      int var17 = cz[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.at; ++var19) {
         int var20 = this.au[var19];
         int var21 = this.ar[var19];
         int var22 = this.al[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         br[var19] = var22 - var18;
         bl[var19] = var8 + var20 * jw.ah() / var22;
         bz[var19] = var9 + var23 * jw.ah() / var22;
         bu[var19] = fq.aq(var22, 1654222170);
         if (this.aj != null) {
            bo[var19] = var20;
            bv[var19] = var23;
            bt[var19] = var22;
         }
      }

      try {
         this.ba(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   void ds(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         cy = 0;
         co = 0;
         cv = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if (var18 < this.bh.length) {
               int[] var19 = this.bh[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  cy += this.au[var12];
                  co += this.ar[var12];
                  cv += this.al[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            cy = cy / var7 + var3;
            co = co / var7 + var4;
            cv = cv / var7 + var5;
         } else {
            cy = var3;
            co = var4;
            cv = var5;
         }

      } else {
         int[] var9;
         int var10;
         int[] var10000;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bh.length) {
                  var9 = this.bh[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.au;
                     var10000[var11] += var3;
                     var10000 = this.ar;
                     var10000[var11] += var4;
                     var10000 = this.al;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bh.length) {
                  var9 = this.bh[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.au;
                     var10000[var11] -= cy;
                     var10000 = this.ar;
                     var10000[var11] -= co;
                     var10000 = this.al;
                     var10000[var11] -= cv;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = cc[var14];
                        var16 = cz[var14];
                        var17 = this.ar[var11] * var15 + this.au[var11] * var16 >> 16;
                        this.ar[var11] = this.ar[var11] * var16 - this.au[var11] * var15 >> 16;
                        this.au[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = cc[var12];
                        var16 = cz[var12];
                        var17 = this.ar[var11] * var16 - this.al[var11] * var15 >> 16;
                        this.al[var11] = this.ar[var11] * var15 + this.al[var11] * var16 >> 16;
                        this.ar[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = cc[var13];
                        var16 = cz[var13];
                        var17 = this.al[var11] * var15 + this.au[var11] * var16 >> 16;
                        this.al[var11] = this.al[var11] * var16 - this.au[var11] * var15 >> 16;
                        this.au[var11] = var17;
                     }

                     var10000 = this.au;
                     var10000[var11] += cy;
                     var10000 = this.ar;
                     var10000[var11] += co;
                     var10000 = this.al;
                     var10000[var11] += cv;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bh.length) {
                  var9 = this.bh[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.au;
                     var10000[var11] -= cy;
                     var10000 = this.ar;
                     var10000[var11] -= co;
                     var10000 = this.al;
                     var10000[var11] -= cv;
                     this.au[var11] = this.au[var11] * var3 / -20551415;
                     this.ar[var11] = this.ar[var11] * var4 / 128;
                     this.al[var11] = this.al[var11] * var5 / 128;
                     var10000 = this.au;
                     var10000[var11] += cy;
                     var10000 = this.ar;
                     var10000[var11] += co;
                     var10000 = this.al;
                     var10000[var11] += cv;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.bd != null && this.as != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.bd.length) {
                     var9 = this.bd[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.as[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > -1507658390) {
                           var12 = 255;
                        }

                        this.as[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   public void dn() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.al[var1];
         this.al[var1] = -var2;
      }

      this.az();
   }

   public jm ch(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.au();
      int var7 = var2 - this.ba;
      int var8 = var2 + this.ba;
      int var9 = var4 - this.ba;
      int var10 = var4 + this.ba;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            jm var11;
            if (var5) {
               var11 = new jm();
               var11.at = this.at;
               var11.ad = this.ad;
               var11.aw = this.aw;
               var11.au = this.au;
               var11.al = this.al;
               var11.ah = this.ah;
               var11.ap = this.ap;
               var11.ab = this.ab;
               var11.az = this.az;
               var11.aa = this.aa;
               var11.ai = this.ai;
               var11.ao = this.ao;
               var11.as = this.as;
               var11.ay = this.ay;
               var11.aj = this.aj;
               var11.av = this.av;
               var11.an = this.an;
               var11.ak = this.ak;
               var11.bn = this.bn;
               var11.bh = this.bh;
               var11.bd = this.bd;
               var11.bm = this.bm;
               var11.ar = new int[var11.at];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.at; ++var12) {
                  var13 = this.au[var12] + var2;
                  var14 = this.al[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 1831951029;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (832145610 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.ar[var12] = this.ar[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.at; ++var12) {
                  var13 = (-this.ar[var12] << 16) / (this.ev * -1141910865);
                  if (var13 < var6) {
                     var14 = this.au[var12] + var2;
                     var15 = this.al[var12] + var4;
                     var16 = var14 & 2054353901;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (-849209901 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.ar[var12] = this.ar[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.az();
            return var11;
         }
      } else {
         return this;
      }
   }

   public void dd() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.al[var1];
         this.al[var1] = -var2;
      }

      this.az();
   }

   void dc(fo var1, int var2) {
      jg var3 = var1.am;

      for(int var4 = 0; var4 < var3.af * -820320348; ++var4) {
         int var5 = var3.at[var4];
         if (var5 == 5 && var1.ae != null && var1.ae[var4] != null && var1.ae[var4][0] != null && this.bd != null && this.as != null) {
            fr var6 = var1.ae[var4][0];
            int[] var7 = var3.au[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.bd.length) {
                  int[] var11 = this.bd[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.as[var13] & 255) + var6.ag(var2, -876528768) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 1283683030) {
                        var14 = 255;
                     }

                     this.as[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   public void ea() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.al[var1];
         this.al[var1] = -var2;
      }

      this.az();
   }

   public void ez() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.al[var1];
         this.al[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.az();
   }

   public void ev() {
      for(int var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.al[var1];
         this.al[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.az();
   }

   public void ay(jk var1, int var2, jk var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            jt var6 = var1.ac[var2];
            jt var7 = var3.ac[var4];
            jg var8 = var6.ax;
            cy = 0;
            co = 0;
            cv = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.aq; ++var11) {
               for(var12 = var6.af[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 != var10 || var8.at[var12] == 0) {
                  this.aw(var8.at[var12], var8.au[var12], var6.at[var11], var6.au[var11], var6.ar[var11]);
               }
            }

            cy = 0;
            co = 0;
            cv = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.aq; ++var11) {
               for(var12 = var7.af[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 == var10 || var8.at[var12] == 0) {
                  this.aw(var8.at[var12], var8.au[var12], var7.at[var11], var7.au[var11], var7.ar[var11]);
               }
            }

            this.az();
         } else {
            this.aa(var1, var2);
         }
      }
   }

   public void ew(int var1) {
      int var2 = cc[var1];
      int var3 = cz[var1];

      for(int var4 = 0; var4 < this.at; ++var4) {
         int var5 = this.ar[var4] * var3 - this.al[var4] * var2 >> 16;
         this.al[var4] = this.ar[var4] * var2 + this.al[var4] * var3 >> 16;
         this.ar[var4] = var5;
      }

      this.az();
   }

   public void ep(int var1) {
      int var2 = cc[var1];
      int var3 = cz[var1];

      for(int var4 = 0; var4 < this.at; ++var4) {
         int var5 = this.ar[var4] * var3 - this.al[var4] * var2 >> 16;
         this.al[var4] = this.ar[var4] * var2 + this.al[var4] * var3 >> 16;
         this.ar[var4] = var5;
      }

      this.az();
   }

   public void ex(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.at; ++var4) {
         int[] var10000 = this.au;
         var10000[var4] += var1;
         var10000 = this.ar;
         var10000[var4] += var2;
         var10000 = this.al;
         var10000[var4] += var3;
      }

      this.az();
   }

   void bt(jm var1) {
      int var2 = this.ah.length;
      if (this.ao == null && (var1.ao != null || this.av != var1.av)) {
         this.ao = new byte[var2];
         Arrays.fill(this.ao, this.av);
      }

      if (this.as == null && var1.as != null) {
         this.as = new byte[var2];
         Arrays.fill(this.as, (byte)0);
      }

      if (this.aj == null && var1.aj != null) {
         this.aj = new short[var2];
         Arrays.fill(this.aj, (short)-1);
      }

      if (this.ay == null && var1.ay != null) {
         this.ay = new byte[var2];
         Arrays.fill(this.ay, (byte)-1);
      }

   }

   public void eu(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.at; ++var4) {
         int[] var10000 = this.au;
         var10000[var4] += var1;
         var10000 = this.ar;
         var10000[var4] += var2;
         var10000 = this.al;
         var10000[var4] += var3;
      }

      this.az();
   }

   void bs(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.bs != 1) {
         this.au();
      }

      this.at(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.ba * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < ji.ar()) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.ba) * jw.ah();
         if (var16 / var14 < jw.ar()) {
            int var17 = (var15 + this.ba) * jw.ah();
            if (var17 / var14 > jw.au()) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.ba * var2 >> 16;
               int var20 = var19 + (this.bw * var3 >> 16);
               int var21 = (var18 + var20) * jw.ah();
               if (var21 / var14 > jw.ad()) {
                  int var22 = var19 + (this.ev * -1141910865 * var3 >> 16);
                  int var23 = (var18 - var22) * jw.ah();
                  if (var23 / var14 < jw.al()) {
                     int var24 = var13 + (this.ev * -1141910865 * var2 >> 16);
                     boolean var25 = false;
                     boolean var26 = false;
                     if (var12 - var24 <= 50) {
                        var26 = true;
                     }

                     boolean var27 = var26 || this.aj != null;
                     int var28 = gq.ad(-2030203150);
                     int var29 = -556185469 * jy.ag;
                     boolean var31 = kx.al(876561148);
                     boolean var32 = ib.ag(var9);
                     boolean var33 = false;
                     int var36;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var49;
                     int var50;
                     if (var32 && var31) {
                        boolean var34 = false;
                        if (cg) {
                           boolean var35;
                           if (!kx.al(876561148)) {
                              var35 = false;
                           } else {
                              du.ah(var2, var3, var4, var5, (byte)90);
                              jn var37 = (jn)this.by.get(var1);
                              var38 = 1368567893 * var37.ac + var6;
                              var39 = var7 + var37.ae * -1461851909;
                              var40 = var8 + -2145173519 * var37.ag;
                              var41 = var37.am * 1947043695;
                              var42 = 247717375 * var37.ax;
                              int var43 = var37.aq * 931924417;
                              int var44 = qq.ax * -1067237483 - var38;
                              int var45 = li.aq * -1362840817 - var39;
                              int var46 = -496618377 * jy.af - var40;
                              if (Math.abs(var44) > var41 + qw.al * -958204205) {
                                 var35 = false;
                              } else if (Math.abs(var45) > -1172590335 * sw.ad + var42) {
                                 var35 = false;
                              } else if (Math.abs(var46) > jy.ah * -130333621 + var43) {
                                 var35 = false;
                              } else if (Math.abs(189845045 * sk.au * var46 - -1608034387 * dw.ar * var45) > sw.ad * -1172590335 * var43 + var42 * -130333621 * jy.ah) {
                                 var35 = false;
                              } else if (Math.abs(dw.ar * -1608034387 * var44 - -1308585921 * fo.at * var46) > var41 * jy.ah * -130333621 + -958204205 * qw.al * var43) {
                                 var35 = false;
                              } else if (Math.abs(var45 * fo.at * -1308585921 - var44 * sk.au * 189845045) > -1172590335 * sw.ad * var41 + qw.al * -958204205 * var42) {
                                 var35 = false;
                              } else {
                                 var35 = true;
                              }
                           }

                           var34 = var35;
                        } else {
                           var50 = var12 - var13;
                           if (var50 <= 50) {
                              var50 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var50;
                           } else {
                              var17 /= var14;
                              var16 /= var50;
                           }

                           if (var18 > 0) {
                              var23 /= var14;
                              var21 /= var50;
                           } else {
                              var21 /= var14;
                              var23 /= var50;
                           }

                           var36 = var28 - jw.af();
                           var49 = var29 - jw.at();
                           if (var36 > var16 && var36 < var17 && var49 > var23 && var49 < var21) {
                              var34 = true;
                           }
                        }

                        if (var34) {
                           if (this.bm) {
                              jy.ab[(jy.ap += -1593675843) * -1277639787 - 1] = var9;
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var48 = jw.af();
                     var50 = jw.at();
                     var36 = 0;
                     var49 = 0;
                     if (var1 != 0) {
                        var36 = cc[var1];
                        var49 = cz[var1];
                     }

                     for(var38 = 0; var38 < this.at; ++var38) {
                        var39 = this.au[var38];
                        var40 = this.ar[var38];
                        var41 = this.al[var38];
                        if (var1 != 0) {
                           var42 = var41 * var36 + var39 * var49 >> 16;
                           var41 = var41 * var49 - var39 * var36 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var39 * var5 >> 16;
                        var41 = var41 * var5 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var40 * var3 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var41 * var3 >> 16;
                        var25 |= this.bw(var38, var39, var42, var41, var12, var48, var50, var27);
                     }

                     try {
                        this.ba(var25, var33, this.bm, var9);
                     } catch (Exception var47) {
                     }

                  }
               }
            }
         }
      }
   }

   public void ag(jm var1) {
      if (var1 != null) {
         this.ae(var1);

         int var2;
         for(var2 = 0; var2 < var1.ad; ++var2) {
            this.ah[this.ad] = var1.ah[var2] + this.at;
            this.ap[this.ad] = var1.ap[var2] + this.at;
            this.ab[this.ad] = var1.ab[var2] + this.at;
            this.az[this.ad] = var1.az[var2];
            this.aa[this.ad] = var1.aa[var2];
            this.ai[this.ad] = var1.ai[var2];
            if (this.ao != null) {
               this.ao[this.ad] = var1.ao != null ? var1.ao[var2] : var1.av;
            }

            if (this.as != null && var1.as != null) {
               this.as[this.ad] = var1.as[var2];
            }

            if (this.aj != null) {
               this.aj[this.ad] = var1.aj != null ? var1.aj[var2] : -1;
            }

            if (this.ay != null) {
               if (var1.ay != null && var1.ay[var2] != -1) {
                  this.ay[this.ad] = (byte)(var1.ay[var2] + this.aw);
               } else {
                  this.ay[this.ad] = -1;
               }
            }

            ++this.ad;
         }

         for(var2 = 0; var2 < var1.aw; ++var2) {
            this.an[this.aw] = var1.an[var2] + this.at;
            this.ak[this.aw] = var1.ak[var2] + this.at;
            this.bn[this.aw] = var1.bn[var2] + this.at;
            ++this.aw;
         }

         for(var2 = 0; var2 < var1.at; ++var2) {
            this.au[this.at] = var1.au[var2];
            this.ar[this.at] = var1.ar[var2];
            this.al[this.at] = var1.al[var2];
            ++this.at;
         }

      }
   }

   public void dp() {
      this.bs = 0;
      this.by.clear();
   }

   public void cw() {
      if (this.bs != 1) {
         this.bs = 1;
         this.ev = 0;
         this.bw = 0;
         this.ba = 0;

         for(int var1 = 0; var1 < this.at; ++var1) {
            int var2 = this.au[var1];
            int var3 = this.ar[var1];
            int var4 = this.al[var1];
            if (-var3 > this.ev * -1141910865) {
               this.ev = -var3 * -2091858865;
            }

            if (var3 > this.bw) {
               this.bw = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.ba) {
               this.ba = var5;
            }
         }

         this.ba = (int)(Math.sqrt((double)this.ba) + 0.99D);
         this.bp = (int)(Math.sqrt((double)(this.ba * this.ba + this.ev * -1141910865 * this.ev * -1141910865)) + 0.99D);
         this.bj = this.bp + (int)(Math.sqrt((double)(this.ba * this.ba + this.bw * this.bw)) + 0.99D);
      }
   }

   public final void eb(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.bs != 2) {
         this.ar();
      }

      int var8 = jw.af();
      int var9 = jw.at();
      int var10 = cc[var1];
      int var11 = cz[var1];
      int var12 = cc[var2];
      int var13 = cz[var2];
      int var14 = cc[var3];
      int var15 = cz[var3];
      int var16 = cc[var4];
      int var17 = cz[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.at; ++var19) {
         int var20 = this.au[var19];
         int var21 = this.ar[var19];
         int var22 = this.al[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         br[var19] = var22 - var18;
         bl[var19] = var8 + var20 * jw.ah() / var22;
         bz[var19] = var9 + var23 * jw.ah() / var22;
         bu[var19] = fq.aq(var22, 1051917944);
         if (this.aj != null) {
            bo[var19] = var20;
            bv[var19] = var23;
            bt[var19] = var22;
         }
      }

      try {
         this.ba(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   public final void en(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.bs != 2) {
         this.ar();
      }

      int var8 = jw.af();
      int var9 = jw.at();
      int var10 = cc[var1];
      int var11 = cz[var1];
      int var12 = cc[var2];
      int var13 = cz[var2];
      int var14 = cc[var3];
      int var15 = cz[var3];
      int var16 = cc[var4];
      int var17 = cz[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.at; ++var19) {
         int var20 = this.au[var19];
         int var21 = this.ar[var19];
         int var22 = this.al[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         br[var19] = var22 - var18;
         bl[var19] = var8 + var20 * jw.ah() / var22;
         bz[var19] = var9 + var23 * jw.ah() / var22;
         bu[var19] = fq.aq(var22, 2053252815);
         if (this.aj != null) {
            bo[var19] = var20;
            bv[var19] = var23;
            bt[var19] = var22;
         }
      }

      try {
         this.ba(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   public final void es(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.bs != 2) {
         this.ar();
      }

      int var9 = jw.af();
      int var10 = jw.at();
      int var11 = cc[var1];
      int var12 = cz[var1];
      int var13 = cc[var2];
      int var14 = cz[var2];
      int var15 = cc[var3];
      int var16 = cz[var3];
      int var17 = cc[var4];
      int var18 = cz[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.at; ++var20) {
         int var21 = this.au[var20];
         int var22 = this.ar[var20];
         int var23 = this.al[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         br[var20] = var23 - var19;
         bl[var20] = var9 + var21 * jw.ah() / var8;
         bz[var20] = var10 + var24 * jw.ah() / var8;
         bu[var20] = fq.aq(var8, 708856640);
         if (this.aj != null) {
            bo[var20] = var21;
            bv[var20] = var24;
            bt[var20] = var23;
         }
      }

      try {
         this.ba(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   public void bh(int var1) {
      int var2 = cc[var1];
      int var3 = cz[var1];

      for(int var4 = 0; var4 < this.at; ++var4) {
         int var5 = this.ar[var4] * var3 - this.al[var4] * var2 >> 16;
         this.al[var4] = this.ar[var4] * var2 + this.al[var4] * var3 >> 16;
         this.ar[var4] = var5;
      }

      this.az();
   }

   public final void er(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.bs != 2) {
         this.ar();
      }

      int var9 = jw.af();
      int var10 = jw.at();
      int var11 = cc[var1];
      int var12 = cz[var1];
      int var13 = cc[var2];
      int var14 = cz[var2];
      int var15 = cc[var3];
      int var16 = cz[var3];
      int var17 = cc[var4];
      int var18 = cz[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.at; ++var20) {
         int var21 = this.au[var20];
         int var22 = this.ar[var20];
         int var23 = this.al[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         br[var20] = var23 - var19;
         bl[var20] = var9 + var21 * jw.ah() / var8;
         bz[var20] = var10 + var24 * jw.ah() / var8;
         bu[var20] = fq.aq(var8, 878840962);
         if (this.aj != null) {
            bo[var20] = var21;
            bv[var20] = var24;
            bt[var20] = var23;
         }
      }

      try {
         this.ba(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   public final void bm(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.bs != 2) {
         this.ar();
      }

      int var9 = jw.af();
      int var10 = jw.at();
      int var11 = cc[var1];
      int var12 = cz[var1];
      int var13 = cc[var2];
      int var14 = cz[var2];
      int var15 = cc[var3];
      int var16 = cz[var3];
      int var17 = cc[var4];
      int var18 = cz[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.at; ++var20) {
         int var21 = this.au[var20];
         int var22 = this.ar[var20];
         int var23 = this.al[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         br[var20] = var23 - var19;
         bl[var20] = var9 + var21 * jw.ah() / var8;
         bz[var20] = var10 + var24 * jw.ah() / var8;
         bu[var20] = fq.aq(var8, 856018838);
         if (this.aj != null) {
            bo[var20] = var21;
            bv[var20] = var24;
            bt[var20] = var23;
         }
      }

      try {
         this.ba(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   void de(jp var1, int var2) {
      this.bg(var1, var2);
   }

   void eq(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.bs != 1) {
         this.au();
      }

      this.at(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.ba * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < ji.ar()) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.ba) * jw.ah();
         if (var16 / var14 < jw.ar()) {
            int var17 = (var15 + this.ba) * jw.ah();
            if (var17 / var14 > jw.au()) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.ba * var2 >> 16;
               int var20 = var19 + (this.bw * var3 >> 16);
               int var21 = (var18 + var20) * jw.ah();
               if (var21 / var14 > jw.ad()) {
                  int var22 = var19 + (this.ev * -1141910865 * var3 >> 16);
                  int var23 = (var18 - var22) * jw.ah();
                  if (var23 / var14 < jw.al()) {
                     int var24 = var13 + (this.ev * -1141910865 * var2 >> 16);
                     boolean var25 = false;
                     boolean var26 = false;
                     if (var12 - var24 <= 50) {
                        var26 = true;
                     }

                     boolean var27 = var26 || this.aj != null;
                     int var28 = gq.ad(942257945);
                     int var29 = -556185469 * jy.ag;
                     boolean var31 = kx.al(876561148);
                     boolean var32 = ib.ag(var9);
                     boolean var33 = false;
                     int var36;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var49;
                     int var50;
                     if (var32 && var31) {
                        boolean var34 = false;
                        if (cg) {
                           boolean var35;
                           if (!kx.al(876561148)) {
                              var35 = false;
                           } else {
                              du.ah(var2, var3, var4, var5, (byte)14);
                              jn var37 = (jn)this.by.get(var1);
                              var38 = 1368567893 * var37.ac + var6;
                              var39 = var7 + var37.ae * -1461851909;
                              var40 = var8 + -2145173519 * var37.ag;
                              var41 = var37.am * 1947043695;
                              var42 = 247717375 * var37.ax;
                              int var43 = var37.aq * 931924417;
                              int var44 = qq.ax * -1067237483 - var38;
                              int var45 = li.aq * -1362840817 - var39;
                              int var46 = -496618377 * jy.af - var40;
                              if (Math.abs(var44) > var41 + qw.al * -958204205) {
                                 var35 = false;
                              } else if (Math.abs(var45) > -1172590335 * sw.ad + var42) {
                                 var35 = false;
                              } else if (Math.abs(var46) > jy.ah * -130333621 + var43) {
                                 var35 = false;
                              } else if (Math.abs(189845045 * sk.au * var46 - -1608034387 * dw.ar * var45) > sw.ad * -1172590335 * var43 + var42 * -130333621 * jy.ah) {
                                 var35 = false;
                              } else if (Math.abs(dw.ar * -1608034387 * var44 - -1308585921 * fo.at * var46) > var41 * jy.ah * -130333621 + -958204205 * qw.al * var43) {
                                 var35 = false;
                              } else if (Math.abs(var45 * fo.at * -1308585921 - var44 * sk.au * 189845045) > -1172590335 * sw.ad * var41 + qw.al * -958204205 * var42) {
                                 var35 = false;
                              } else {
                                 var35 = true;
                              }
                           }

                           var34 = var35;
                        } else {
                           var50 = var12 - var13;
                           if (var50 <= 50) {
                              var50 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var50;
                           } else {
                              var17 /= var14;
                              var16 /= var50;
                           }

                           if (var18 > 0) {
                              var23 /= var14;
                              var21 /= var50;
                           } else {
                              var21 /= var14;
                              var23 /= var50;
                           }

                           var36 = var28 - jw.af();
                           var49 = var29 - jw.at();
                           if (var36 > var16 && var36 < var17 && var49 > var23 && var49 < var21) {
                              var34 = true;
                           }
                        }

                        if (var34) {
                           if (this.bm) {
                              jy.ab[(jy.ap += -1593675843) * -1277639787 - 1] = var9;
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var48 = jw.af();
                     var50 = jw.at();
                     var36 = 0;
                     var49 = 0;
                     if (var1 != 0) {
                        var36 = cc[var1];
                        var49 = cz[var1];
                     }

                     for(var38 = 0; var38 < this.at; ++var38) {
                        var39 = this.au[var38];
                        var40 = this.ar[var38];
                        var41 = this.al[var38];
                        if (var1 != 0) {
                           var42 = var41 * var36 + var39 * var49 >> 16;
                           var41 = var41 * var49 - var39 * var36 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var39 * var5 >> 16;
                        var41 = var41 * var5 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var40 * var3 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var41 * var3 >> 16;
                        var25 |= this.bw(var38, var39, var42, var41, var12, var48, var50, var27);
                     }

                     try {
                        this.ba(var25, var33, this.bm, var9);
                     } catch (Exception var47) {
                     }

                  }
               }
            }
         }
      }
   }

   void jg(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      int var15 = jw.am[var2];
      int var16 = jw.ax[var2];
      int var17 = jw.am[var3];
      int var18 = jw.ax[var3];
      this.bs(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   final void ec(int var1) {
      if (bg[var1]) {
         this.bb(var1);
      } else {
         int var2 = this.ah[var1];
         int var3 = this.ap[var1];
         int var4 = this.ab[var1];
         jw.af.ac = bi[var1];
         if (this.as == null) {
            jw.af.ag = 0;
         } else {
            jw.af.ag = (this.as[var1] == -1 ? 253 : this.as[var1]) & 255;
         }

         this.by(var1, bz[var2], bz[var3], bz[var4], bl[var2], bl[var3], bl[var4], bu[var2], bu[var3], bu[var4], this.az[var1], this.aa[var1], this.ai[var1]);
      }
   }

   public final void em(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.bs != 2) {
         this.ar();
      }

      int var8 = jw.af();
      int var9 = jw.at();
      int var10 = cc[var1];
      int var11 = cz[var1];
      int var12 = cc[var2];
      int var13 = cz[var2];
      int var14 = cc[var3];
      int var15 = cz[var3];
      int var16 = cc[var4];
      int var17 = cz[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.at; ++var19) {
         int var20 = this.au[var19];
         int var21 = this.ar[var19];
         int var22 = this.al[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         br[var19] = var22 - var18;
         bl[var19] = var8 + var20 * jw.ah() / var22;
         bz[var19] = var9 + var23 * jw.ah() / var22;
         bu[var19] = fq.aq(var22, 747796417);
         if (this.aj != null) {
            bo[var19] = var20;
            bv[var19] = var23;
            bt[var19] = var22;
         }
      }

      try {
         this.ba(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   boolean fb(int var1) {
      return this.cd > 0 && var1 < this.ce;
   }

   boolean ff(int var1) {
      return this.cd > 0 && var1 < this.ce;
   }

   boolean fe(int var1) {
      return this.cd > 0 && var1 < this.ce;
   }

   boolean ft(int var1) {
      return this.cd > 0 && var1 < this.ce;
   }

   final void et(int var1) {
      if (bg[var1]) {
         this.bb(var1);
      } else {
         int var2 = this.ah[var1];
         int var3 = this.ap[var1];
         int var4 = this.ab[var1];
         jw.af.ac = bi[var1];
         if (this.as == null) {
            jw.af.ag = 0;
         } else {
            jw.af.ag = (this.as[var1] == -1 ? 1516349403 : this.as[var1]) & 255;
         }

         this.by(var1, bz[var2], bz[var3], bz[var4], bl[var2], bl[var3], bl[var4], bu[var2], bu[var3], bu[var4], this.az[var1], this.aa[var1], this.ai[var1]);
      }
   }

   public void aa(jk var1, int var2) {
      if (this.bh != null) {
         if (var2 != -1) {
            jt var3 = var1.ac[var2];
            jg var4 = var3.ax;
            cy = 0;
            co = 0;
            cv = 0;

            for(int var5 = 0; var5 < var3.aq; ++var5) {
               int var6 = var3.af[var5];
               this.aw(var4.at[var6], var4.au[var6], var3.at[var5], var3.au[var5], var3.ar[var5]);
            }

            this.az();
         }
      }
   }

   final void fp(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      if (this.aj != null && this.aj[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.ay != null && this.ay[var1] != -1) {
            int var17 = this.ay[var1] & 255;
            var18 = this.an[var17];
            var15 = this.ak[var17];
            var16 = this.bn[var17];
         } else {
            var18 = this.ah[var1];
            var15 = this.ap[var1];
            var16 = this.ab[var1];
         }

         if (this.ai[var1] == -1) {
            jw.av(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, bo[var18], bo[var15], bo[var16], bv[var18], bv[var15], bv[var16], bt[var18], bt[var15], bt[var16], this.aj[var1]);
         } else {
            jw.av(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, bo[var18], bo[var15], bo[var16], bv[var18], bv[var15], bv[var16], bt[var18], bt[var15], bt[var16], this.aj[var1]);
         }
      } else {
         boolean var14 = this.bp(var1);
         if (this.ai[var1] == -1 && var14) {
            jw.ak(var2, var3, var4, var5, var6, var7, var8, var9, var10, cw[this.az[var1]], this.cs, this.cp, this.cb, this.cd);
         } else if (this.ai[var1] == -1) {
            jw.aj(var2, var3, var4, var5, var6, var7, var8, var9, var10, cw[this.az[var1]]);
         } else if (var14) {
            jw.an(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.cs, this.cp, this.cb, this.cd);
         } else {
            jw.ay(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }

   }

   final void fr(int var1) {
      int var2 = jw.af();
      int var3 = jw.at();
      int var4 = 0;
      int var5 = this.ah[var1];
      int var6 = this.ap[var1];
      int var7 = this.ab[var1];
      int var8 = bt[var5];
      int var9 = bt[var6];
      int var10 = bt[var7];
      if (this.as == null) {
         jw.af.ag = 0;
      } else {
         jw.af.ag = this.as[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         cm[var4] = bl[var5];
         cj[var4] = bz[var5];
         ci[var4] = bu[var7];
         cx[var4++] = this.az[var1];
      } else {
         var11 = bo[var5];
         var12 = bv[var5];
         var13 = this.az[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * cr[var10 - var8];
            cm[var4] = var2 + (var11 + ((bo[var7] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.ai[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * cr[var9 - var8];
            cm[var4] = var2 + (var11 + ((bo[var6] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.aa[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         cm[var4] = bl[var6];
         cj[var4] = bz[var6];
         ci[var4] = bu[var7];
         cx[var4++] = this.aa[var1];
      } else {
         var11 = bo[var6];
         var12 = bv[var6];
         var13 = this.aa[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * cr[var8 - var9];
            cm[var4] = var2 + (var11 + ((bo[var5] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * cr[var10 - var9];
            cm[var4] = var2 + (var11 + ((bo[var7] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * jw.ah() / 50;
            cx[var4++] = var13 + ((this.ai[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         cm[var4] = bl[var7];
         cj[var4] = bz[var7];
         ci[var4] = bu[var7];
         cx[var4++] = this.ai[var1];
      } else {
         var11 = bo[var7];
         var12 = bv[var7];
         var13 = this.ai[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * cr[var9 - var10];
            cm[var4] = var2 + (var11 + ((bo[var6] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.aa[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * cr[var8 - var10];
            cm[var4] = var2 + (var11 + ((bo[var5] - var11) * var14 >> 16)) * jw.ah() / 50;
            cj[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * jw.ah() / 50;
            ci[var4] = ca;
            cx[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }
      }

      var11 = cm[0];
      var12 = cm[1];
      var13 = cm[2];
      var14 = cj[0];
      int var15 = cj[1];
      int var16 = cj[2];
      float var17 = ci[0];
      float var18 = ci[1];
      float var19 = ci[2];
      jw.af.ac = false;
      int var20 = jw.ap();
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            jw.af.ac = true;
         }

         this.by(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || cm[3] < 0 || cm[3] > var20) {
            jw.af.ac = true;
         }

         int var22;
         if (this.aj != null && this.aj[var1] != -1) {
            int var23;
            int var25;
            if (this.ay != null && this.ay[var1] != -1) {
               int var24 = this.ay[var1] & 255;
               var25 = this.an[var24];
               var22 = this.ak[var24];
               var23 = this.bn[var24];
            } else {
               var25 = var5;
               var22 = var6;
               var23 = var7;
            }

            short var26 = this.aj[var1];
            if (this.ai[var1] == -1) {
               jw.av(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.az[var1], this.az[var1], this.az[var1], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
               jw.av(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], this.az[var1], this.az[var1], this.az[var1], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
            } else {
               jw.av(var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
               jw.av(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], cx[0], cx[2], cx[3], bo[var25], bo[var22], bo[var23], bv[var25], bv[var22], bv[var23], bt[var25], bt[var22], bt[var23], var26);
            }
         } else {
            boolean var21 = this.bp(var1);
            if (this.ai[var1] == -1 && var21) {
               var22 = cw[this.az[var1]];
               jw.ak(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.cs, this.cp, this.cb, this.cd);
               jw.ak(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], var22, this.cs, this.cp, this.cb, this.cd);
            } else if (this.ai[var1] == -1) {
               var22 = cw[this.az[var1]];
               jw.aj(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
               jw.aj(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], var22);
            } else if (var21) {
               jw.an(var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2], this.cs, this.cb, this.cp, this.cd);
               jw.an(var14, var16, cj[3], var11, var13, cm[3], 0.0F, 0.0F, 0.0F, cx[0], cx[2], cx[3], this.cs, this.cb, this.cp, this.cd);
            } else {
               jw.ay(var14, var15, var16, var11, var12, var13, var17, var18, var19, cx[0], cx[1], cx[2]);
               jw.ay(var14, var16, cj[3], var11, var13, cm[3], var17, var19, ci[3], cx[0], cx[2], cx[3]);
            }
         }
      }

   }

   jm() {
   }

   public void cz() {
      if (this.bs != 1) {
         this.bs = 1;
         this.ev = 0;
         this.bw = 0;
         this.ba = 0;

         for(int var1 = 0; var1 < this.at; ++var1) {
            int var2 = this.au[var1];
            int var3 = this.ar[var1];
            int var4 = this.al[var1];
            if (-var3 > this.ev * -1141910865) {
               this.ev = -var3 * -2091858865;
            }

            if (var3 > this.bw) {
               this.bw = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.ba) {
               this.ba = var5;
            }
         }

         this.ba = (int)(Math.sqrt((double)this.ba) + 0.99D);
         this.bp = (int)(Math.sqrt((double)(this.ba * this.ba + this.ev * -1141910865 * this.ev * -1141910865)) + 0.99D);
         this.bj = this.bp + (int)(Math.sqrt((double)(this.ba * this.ba + this.bw * this.bw)) + 0.99D);
      }
   }

   void fj(int var1, qf var2) {
      float var3 = (float)this.au[var1];
      float var4 = (float)(-this.ar[var1]);
      float var5 = (float)(-this.al[var1]);
      float var6 = 1.0F;
      this.au[var1] = (int)(var2.ax[0] * var3 + var2.ax[4] * var4 + var2.ax[8] * var5 + var2.ax[12] * var6);
      this.ar[var1] = -((int)(var2.ax[1] * var3 + var2.ax[5] * var4 + var2.ax[9] * var5 + var2.ax[13] * var6));
      this.al[var1] = -((int)(var2.ax[2] * var3 + var2.ax[6] * var4 + var2.ax[10] * var5 + var2.ax[14] * var6));
   }

   void fs(jp var1, int var2) {
      if (this.bx != null) {
         for(int var3 = 0; var3 < this.at; ++var3) {
            int[] var4 = this.bx[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.bf[var3];
               ax.at((byte)26);

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  fb var8 = var1.ag(var7, -2143064246);
                  if (var8 != null) {
                     aq.ar((float)var5[var6] / 255.0F, (byte)0);
                     af.au(var8.at(var2, (byte)7), 1218100430);
                     af.ah(aq, -2009162523);
                     ax.ad(af, -62785624);
                  }
               }

               this.bi(var3, ax);
            }
         }

      }
   }

   void fq(jp var1, int var2) {
      if (this.bx != null) {
         for(int var3 = 0; var3 < this.at; ++var3) {
            int[] var4 = this.bx[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.bf[var3];
               ax.at((byte)91);

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  fb var8 = var1.ag(var7, -2113538158);
                  if (var8 != null) {
                     aq.ar((float)var5[var6] / 255.0F, (byte)0);
                     af.au(var8.at(var2, (byte)-6), 1218100430);
                     af.ah(aq, -2024520933);
                     ax.ad(af, 1601417228);
                  }
               }

               this.bi(var3, ax);
            }
         }

      }
   }
}
