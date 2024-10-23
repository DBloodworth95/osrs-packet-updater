import java.util.Arrays;
import java.util.HashMap;

public class jy extends jv {
   static int[] bi = new int[6500];
   static qs as = new qs();
   static jy ak = new jy();
   static byte[] aj = new byte[1];
   static char[] bg = new char[6000];
   static qs ay = new qs();
   int[][] bk;
   int[] ah;
   static int[] ci = new int[12];
   int[] at;
   int[] au;
   public int an = 0;
   int[] ao;
   public int al = 0;
   int[] ar;
   int bq;
   int[] az;
   public byte ca;
   byte[] ad;
   int[] am;
   static byte[] aw = new byte[1];
   short[] ax;
   public byte aq = 0;
   public byte cw;
   int[] aa;
   static float[] cl = new float[10];
   int[] bh;
   int[][] bj;
   int[][] bv;
   int[][] bx;
   static int[] ba = new int[6500];
   public boolean bb = false;
   int[] ag;
   int bp;
   int bz;
   static qs ai = new qs();
   int by;
   static int[][] cq = new int[12][2000];
   static final int bn = 6500;
   public byte cs;
   static boolean[] bt = new boolean[6500];
   int bc;
   static int[] bm = new int[6500];
   static float[] bo = new float[6500];
   static int[] bd = new int[6500];
   static int cv;
   static int[] bw = new int[6500];
   int[] af;
   static final int bf = 6000;
   static boolean[] bu = new boolean[6500];
   static char[][] bl = new char[6000][512];
   static int[] be = new int[12];
   static int[] bs = new int[6500];
   static int[] cb = new int[2000];
   static int[] cn = new int[10];
   int[] ab;
   HashMap br = new HashMap();
   static int[] co = new int[10];
   static int[] cf = new int[10];
   byte[] av;
   static int cp;
   byte[] ac;
   static int cy;
   static boolean cu = true;
   public int ae = 0;
   static final int ce = 5;
   static int[] cx;
   static int[] cz;
   static int[] ch;
   static int[] ct;
   static final int cc = 50;
   static final float cj;
   public byte cm;
   static jy ap = new jy();
   static final int cg = 20;
   static int[] cd = new int[2000];
   public short cr;
   static float[] ck;

   public void dm() {
      for(int var1 = 0; var1 < this.ae; ++var1) {
         int var2 = this.am[var1];
         this.am[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.ar();
   }

   void bw(jy var1) {
      int var2 = this.ao.length;
      if (this.ad == null && (var1.ad != null || this.aq != var1.aq)) {
         this.ad = new byte[var2];
         Arrays.fill(this.ad, this.aq);
      }

      if (this.ac == null && var1.ac != null) {
         this.ac = new byte[var2];
         Arrays.fill(this.ac, (byte)0);
      }

      if (this.ax == null && var1.ax != null) {
         this.ax = new short[var2];
         Arrays.fill(this.ax, (short)-1);
      }

      if (this.av == null && var1.av != null) {
         this.av = new byte[var2];
         Arrays.fill(this.av, (byte)-1);
      }

   }

   public jy(int var1, int var2, int var3, byte var4) {
      this.ap(var1, var2, var3);
      this.aq = var4;
      this.ae = 0;
      this.an = 0;
      this.al = 0;
   }

   jy as(boolean var1, jy var2, byte[] var3) {
      var2.ae = this.ae;
      var2.an = this.an;
      var2.al = this.al;
      if (var2.am == null || var2.am.length < this.ae) {
         var2.am = new int[this.ae + 100];
         var2.at = new int[this.ae + 100];
         var2.au = new int[this.ae + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.ae; ++var4) {
         var2.am[var4] = this.am[var4];
         var2.at[var4] = this.at[var4];
         var2.au[var4] = this.au[var4];
      }

      if (var1) {
         var2.ac = this.ac;
      } else {
         var2.ac = var3;
         if (this.ac == null) {
            for(var4 = 0; var4 < this.an; ++var4) {
               var2.ac[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.an; ++var4) {
               var2.ac[var4] = this.ac[var4];
            }
         }
      }

      var2.ao = this.ao;
      var2.af = this.af;
      var2.ar = this.ar;
      var2.ab = this.ab;
      var2.az = this.az;
      var2.ag = this.ag;
      var2.ad = this.ad;
      var2.av = this.av;
      var2.ax = this.ax;
      var2.aq = this.aq;
      var2.aa = this.aa;
      var2.ah = this.ah;
      var2.bh = this.bh;
      var2.bj = this.bj;
      var2.bv = this.bv;
      var2.bx = this.bx;
      var2.bk = this.bk;
      var2.bb = this.bb;
      var2.ar();
      var2.cs = 0;
      return var2;
   }

   void aw(jy var1) {
      int var2 = this.ao.length;
      if (this.ad == null && (var1.ad != null || this.aq != var1.aq)) {
         this.ad = new byte[var2];
         Arrays.fill(this.ad, this.aq);
      }

      if (this.ac == null && var1.ac != null) {
         this.ac = new byte[var2];
         Arrays.fill(this.ac, (byte)0);
      }

      if (this.ax == null && var1.ax != null) {
         this.ax = new short[var2];
         Arrays.fill(this.ax, (short)-1);
      }

      if (this.av == null && var1.av != null) {
         this.av = new byte[var2];
         Arrays.fill(this.av, (byte)-1);
      }

   }

   public void cg() {
      if (this.bq != 1) {
         this.bq = 1;
         this.ez = 0;
         this.bp = 0;
         this.bz = 0;

         for(int var1 = 0; var1 < this.ae; ++var1) {
            int var2 = this.am[var1];
            int var3 = this.at[var1];
            int var4 = this.au[var1];
            if (-var3 > this.ez * 192604684) {
               this.ez = -var3 * 2132106841;
            }

            if (var3 > this.bp) {
               this.bp = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.bz) {
               this.bz = var5;
            }
         }

         this.bz = (int)(Math.sqrt((double)this.bz) + 0.99D);
         this.by = (int)(Math.sqrt((double)(this.bz * this.bz + this.ez * -274986519 * this.ez * -274986519)) + 0.99D);
         this.bc = this.by + (int)(Math.sqrt((double)(this.bz * this.bz + this.bp * this.bp)) + 0.99D);
      }
   }

   public jy aj(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.am();
      int var7 = var2 - this.bz;
      int var8 = var2 + this.bz;
      int var9 = var4 - this.bz;
      int var10 = var4 + this.bz;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            jy var11;
            if (var5) {
               var11 = new jy();
               var11.ae = this.ae;
               var11.an = this.an;
               var11.al = this.al;
               var11.am = this.am;
               var11.au = this.au;
               var11.ao = this.ao;
               var11.af = this.af;
               var11.ar = this.ar;
               var11.ab = this.ab;
               var11.az = this.az;
               var11.ag = this.ag;
               var11.ad = this.ad;
               var11.ac = this.ac;
               var11.av = this.av;
               var11.ax = this.ax;
               var11.aq = this.aq;
               var11.aa = this.aa;
               var11.ah = this.ah;
               var11.bh = this.bh;
               var11.bj = this.bj;
               var11.bv = this.bv;
               var11.bb = this.bb;
               var11.at = new int[var11.ae];
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
               for(var12 = 0; var12 < var11.ae; ++var12) {
                  var13 = this.am[var12] + var2;
                  var14 = this.au[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.at[var12] = this.at[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.ae; ++var12) {
                  var13 = (-this.at[var12] << 16) / (this.ez * -274986519);
                  if (var13 < var6) {
                     var14 = this.am[var12] + var2;
                     var15 = this.au[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.at[var12] = this.at[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.ar();
            return var11;
         }
      } else {
         return this;
      }
   }

   public jy ai(boolean var1) {
      if (!var1 && aw.length < this.an) {
         aw = new byte[this.an + 100];
      }

      return this.as(var1, ap, aw);
   }

   public jy ay(boolean var1) {
      if (!var1 && aj.length < this.an) {
         aj = new byte[this.an + 100];
      }

      return this.as(var1, ak, aj);
   }

   public void bv(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ae; ++var4) {
         this.am[var4] = this.am[var4] * var1 / 128;
         this.at[var4] = this.at[var4] * var2 / 128;
         this.au[var4] = this.au[var4] * var3 / 128;
      }

      this.ar();
   }

   public void av(jt var1, fr var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      jx var7 = var1.aw(669227290);
      if (var7 != null) {
         var7.ay(var2, var3, var4, var5, -1490826237);
         if (var6) {
            this.ad(var7, var2.aj(-1662542495));
         }
      }

      if (!var5 && var2.ai((byte)-92)) {
         this.ag(var2, var3);
      }

   }

   public void cu() {
      if (this.bq != 1) {
         this.bq = 1;
         this.ez = 0;
         this.bp = 0;
         this.bz = 0;

         for(int var1 = 0; var1 < this.ae; ++var1) {
            int var2 = this.am[var1];
            int var3 = this.at[var1];
            int var4 = this.au[var1];
            if (-var3 > this.ez * -274986519) {
               this.ez = -var3 * 2132106841;
            }

            if (var3 > this.bp) {
               this.bp = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.bz) {
               this.bz = var5;
            }
         }

         this.bz = (int)(Math.sqrt((double)this.bz) + 0.99D);
         this.by = (int)(Math.sqrt((double)(this.bz * this.bz + this.ez * -274986519 * this.ez * 362807459)) + 0.99D);
         this.bc = this.by + (int)(Math.sqrt((double)(this.bz * this.bz + this.bp * this.bp)) + 0.99D);
      }
   }

   public void db(int var1) {
      int var2 = cx[var1];
      int var3 = cz[var1];

      for(int var4 = 0; var4 < this.ae; ++var4) {
         int var5 = this.at[var4] * var3 - this.au[var4] * var2 >> 16;
         this.au[var4] = this.at[var4] * var2 + this.au[var4] * var3 >> 16;
         this.at[var4] = var5;
      }

      this.ar();
   }

   public int af() {
      this.am();
      return this.bz;
   }

   public void ar() {
      this.bq = 0;
      this.br.clear();
   }

   public void ab(ja var1, int var2) {
      if (this.bj != null) {
         if (var2 != -1) {
            jg var3 = var1.ap[var2];
            jt var4 = var3.ai;
            cp = 0;
            cv = 0;
            cy = 0;

            for(int var5 = 0; var5 < var3.ay; ++var5) {
               int var6 = var3.as[var5];
               this.aq(var4.ae[var6], var4.am[var6], var3.ae[var5], var3.am[var5], var3.at[var5]);
            }

            this.ar();
         }
      }
   }

   public void az(fr var1, int var2) {
      jt var3 = var1.aj;
      jx var4 = var3.aw(669227290);
      if (var4 != null) {
         var3.aw(669227290).ai(var1, var2, (byte)91);
         this.ad(var3.aw(669227290), var1.aj(-1662542495));
      }

      if (var1.ai((byte)-13)) {
         this.ag(var1, var2);
      }

      this.ar();
   }

   void ag(fr var1, int var2) {
      jt var3 = var1.aj;

      for(int var4 = 0; var4 < var3.as * -453798821; ++var4) {
         int var5 = var3.ae[var4];
         if (var5 == 5 && var1.aw != null && var1.aw[var4] != null && var1.aw[var4][0] != null && this.bv != null && this.ac != null) {
            fv var6 = var1.aw[var4][0];
            int[] var7 = var3.am[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.bv.length) {
                  int[] var11 = this.bv[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.ac[var13] & 255) + var6.ak(var2, -2075944089) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 255;
                     }

                     this.ac[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   public jy(jy[] var1, int var2) {
      this.ae = 0;
      this.an = 0;
      this.al = 0;
      this.aq = -1;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         jy var4 = var1[var3];
         if (var4 != null) {
            this.ae += var4.ae;
            this.an += var4.an;
            this.al += var4.al;
            if (this.aq == -1) {
               this.aq = var4.aq;
            }
         }
      }

      this.ap(this.ae, this.an, this.al);
      this.ae = 0;
      this.an = 0;
      this.al = 0;

      for(var3 = 0; var3 < var2; ++var3) {
         this.ak(var1[var3]);
      }

   }

   public void ac(ja var1, int var2, ja var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            jg var6 = var1.ap[var2];
            jg var7 = var3.ap[var4];
            jt var8 = var6.ai;
            cp = 0;
            cv = 0;
            cy = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.ay; ++var11) {
               for(var12 = var6.as[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 != var10 || var8.ae[var12] == 0) {
                  this.aq(var8.ae[var12], var8.am[var12], var6.ae[var11], var6.am[var11], var6.at[var11]);
               }
            }

            cp = 0;
            cv = 0;
            cy = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.ay; ++var11) {
               for(var12 = var7.as[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 == var10 || var8.ae[var12] == 0) {
                  this.aq(var8.ae[var12], var8.am[var12], var7.ae[var11], var7.am[var11], var7.at[var11]);
               }
            }

            this.ar();
         } else {
            this.ab(var1, var2);
         }
      }
   }

   final void by(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      if (this.ax != null && this.ax[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.av != null && this.av[var1] != -1) {
            int var17 = this.av[var1] & 255;
            var18 = this.aa[var17];
            var15 = this.ah[var17];
            var16 = this.bh[var17];
         } else {
            var18 = this.ao[var1];
            var15 = this.af[var1];
            var16 = this.ar[var1];
         }

         if (this.ag[var1] == -1) {
            jm.aq(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, ba[var18], ba[var15], ba[var16], bw[var18], bw[var15], bw[var16], bi[var18], bi[var15], bi[var16], this.ax[var1]);
         } else {
            jm.aq(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, ba[var18], ba[var15], ba[var16], bw[var18], bw[var15], bw[var16], bi[var18], bi[var15], bi[var16], this.ax[var1]);
         }
      } else {
         boolean var14 = this.bc(var1);
         if (this.ag[var1] == -1 && var14) {
            jm.ah(var2, var3, var4, var5, var6, var7, var8, var9, var10, ch[this.ab[var1]], this.cm, this.cw, this.ca, this.cs);
         } else if (this.ag[var1] == -1) {
            jm.ax(var2, var3, var4, var5, var6, var7, var8, var9, var10, ch[this.ab[var1]]);
         } else if (var14) {
            jm.aa(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.cm, this.cw, this.ca, this.cs);
         } else {
            jm.av(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }

   }

   void cr(jx var1, int var2) {
      this.bu(var1, var2);
   }

   void aq(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         cp = 0;
         cv = 0;
         cy = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if (var18 < this.bj.length) {
               int[] var19 = this.bj[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  cp += this.am[var12];
                  cv += this.at[var12];
                  cy += this.au[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            cp = cp / var7 + var3;
            cv = cv / var7 + var4;
            cy = cy / var7 + var5;
         } else {
            cp = var3;
            cv = var4;
            cy = var5;
         }

      } else {
         int[] var9;
         int var10;
         int[] var10000;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bj.length) {
                  var9 = this.bj[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.am;
                     var10000[var11] += var3;
                     var10000 = this.at;
                     var10000[var11] += var4;
                     var10000 = this.au;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bj.length) {
                  var9 = this.bj[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.am;
                     var10000[var11] -= cp;
                     var10000 = this.at;
                     var10000[var11] -= cv;
                     var10000 = this.au;
                     var10000[var11] -= cy;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = cx[var14];
                        var16 = cz[var14];
                        var17 = this.at[var11] * var15 + this.am[var11] * var16 >> 16;
                        this.at[var11] = this.at[var11] * var16 - this.am[var11] * var15 >> 16;
                        this.am[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = cx[var12];
                        var16 = cz[var12];
                        var17 = this.at[var11] * var16 - this.au[var11] * var15 >> 16;
                        this.au[var11] = this.at[var11] * var15 + this.au[var11] * var16 >> 16;
                        this.at[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = cx[var13];
                        var16 = cz[var13];
                        var17 = this.au[var11] * var15 + this.am[var11] * var16 >> 16;
                        this.au[var11] = this.au[var11] * var16 - this.am[var11] * var15 >> 16;
                        this.am[var11] = var17;
                     }

                     var10000 = this.am;
                     var10000[var11] += cp;
                     var10000 = this.at;
                     var10000[var11] += cv;
                     var10000 = this.au;
                     var10000[var11] += cy;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bj.length) {
                  var9 = this.bj[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.am;
                     var10000[var11] -= cp;
                     var10000 = this.at;
                     var10000[var11] -= cv;
                     var10000 = this.au;
                     var10000[var11] -= cy;
                     this.am[var11] = this.am[var11] * var3 / 128;
                     this.at[var11] = this.at[var11] * var4 / 128;
                     this.au[var11] = this.au[var11] * var5 / 128;
                     var10000 = this.am;
                     var10000[var11] += cp;
                     var10000 = this.at;
                     var10000[var11] += cv;
                     var10000 = this.au;
                     var10000[var11] += cy;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.bv != null && this.ac != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.bv.length) {
                     var9 = this.bv[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.ac[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > 255) {
                           var12 = 255;
                        }

                        this.ac[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   boolean eg(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      bd[var1] = var4 - var5;
      if (var8) {
         ba[var1] = var2;
         bw[var1] = var3;
         bi[var1] = var4;
      }

      if (var4 >= 50) {
         bs[var1] = var6 + var2 * jm.ao() / var4;
         bm[var1] = var7 + var3 * jm.ao() / var4;
         bo[var1] = hl.ak(var4, 1261288518);
         return false;
      } else {
         bs[var1] = -5000;
         return true;
      }
   }

   public void am() {
      if (this.bq != 1) {
         this.bq = 1;
         this.ez = 0;
         this.bp = 0;
         this.bz = 0;

         for(int var1 = 0; var1 < this.ae; ++var1) {
            int var2 = this.am[var1];
            int var3 = this.at[var1];
            int var4 = this.au[var1];
            if (-var3 > this.ez * -274986519) {
               this.ez = -var3 * 2132106841;
            }

            if (var3 > this.bp) {
               this.bp = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.bz) {
               this.bz = var5;
            }
         }

         this.bz = (int)(Math.sqrt((double)this.bz) + 0.99D);
         this.by = (int)(Math.sqrt((double)(this.bz * this.bz + this.ez * -274986519 * this.ez * -274986519)) + 0.99D);
         this.bc = this.by + (int)(Math.sqrt((double)(this.bz * this.bz + this.bp * this.bp)) + 0.99D);
      }
   }

   public void ah() {
      for(int var1 = 0; var1 < this.ae; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.am[var1];
         this.am[var1] = -var2;
      }

      this.ar();
   }

   public final void dz(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.bq != 2) {
         this.at();
      }

      int var8 = jm.as();
      int var9 = jm.ae();
      int var10 = cx[var1];
      int var11 = cz[var1];
      int var12 = cx[var2];
      int var13 = cz[var2];
      int var14 = cx[var3];
      int var15 = cz[var3];
      int var16 = cx[var4];
      int var17 = cz[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.ae; ++var19) {
         int var20 = this.am[var19];
         int var21 = this.at[var19];
         int var22 = this.au[var19];
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
         bd[var19] = var22 - var18;
         bs[var19] = var8 + var20 * jm.ao() / var22;
         bm[var19] = var9 + var23 * jm.ao() / var22;
         bo[var19] = hl.ak(var22, 1261288518);
         if (this.ax != null) {
            ba[var19] = var20;
            bw[var19] = var23;
            bi[var19] = var22;
         }
      }

      try {
         this.bp(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   public void bj(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ae; ++var4) {
         int[] var10000 = this.am;
         var10000[var4] += var1;
         var10000 = this.at;
         var10000[var4] += var2;
         var10000 = this.au;
         var10000[var4] += var3;
      }

      this.ar();
   }

   public void dp(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ae; ++var4) {
         int[] var10000 = this.am;
         var10000[var4] += var1;
         var10000 = this.at;
         var10000[var4] += var2;
         var10000 = this.au;
         var10000[var4] += var3;
      }

      this.ar();
   }

   public final void bx(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.bq != 2) {
         this.at();
      }

      int var8 = jm.as();
      int var9 = jm.ae();
      int var10 = cx[var1];
      int var11 = cz[var1];
      int var12 = cx[var2];
      int var13 = cz[var2];
      int var14 = cx[var3];
      int var15 = cz[var3];
      int var16 = cx[var4];
      int var17 = cz[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.ae; ++var19) {
         int var20 = this.am[var19];
         int var21 = this.at[var19];
         int var22 = this.au[var19];
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
         bd[var19] = var22 - var18;
         bs[var19] = var8 + var20 * jm.ao() / var22;
         bm[var19] = var9 + var23 * jm.ao() / var22;
         bo[var19] = hl.ak(var22, 1261288518);
         if (this.ax != null) {
            ba[var19] = var20;
            bw[var19] = var23;
            bi[var19] = var22;
         }
      }

      try {
         this.bp(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   public jy bl(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.am();
      int var7 = var2 - this.bz;
      int var8 = var2 + this.bz;
      int var9 = var4 - this.bz;
      int var10 = var4 + this.bz;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            jy var11;
            if (var5) {
               var11 = new jy();
               var11.ae = this.ae;
               var11.an = this.an;
               var11.al = this.al;
               var11.am = this.am;
               var11.au = this.au;
               var11.ao = this.ao;
               var11.af = this.af;
               var11.ar = this.ar;
               var11.ab = this.ab;
               var11.az = this.az;
               var11.ag = this.ag;
               var11.ad = this.ad;
               var11.ac = this.ac;
               var11.av = this.av;
               var11.ax = this.ax;
               var11.aq = this.aq;
               var11.aa = this.aa;
               var11.ah = this.ah;
               var11.bh = this.bh;
               var11.bj = this.bj;
               var11.bv = this.bv;
               var11.bb = this.bb;
               var11.at = new int[var11.ae];
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
               for(var12 = 0; var12 < var11.ae; ++var12) {
                  var13 = this.am[var12] + var2;
                  var14 = this.au[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (-1145935108 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.at[var12] = this.at[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.ae; ++var12) {
                  var13 = (-this.at[var12] << 16) / (this.ez * -1781704727);
                  if (var13 < var6) {
                     var14 = this.am[var12] + var2;
                     var15 = this.au[var12] + var4;
                     var16 = var14 & -181426890;
                     var17 = var15 & -380200591;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (1120799448 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (739627989 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.at[var12] = this.at[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.ar();
            return var11;
         }
      } else {
         return this;
      }
   }

   public void dk() {
      for(int var1 = 0; var1 < this.ae; ++var1) {
         int var2 = this.am[var1];
         this.am[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.ar();
   }

   boolean ev(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      bd[var1] = var4 - var5;
      if (var8) {
         ba[var1] = var2;
         bw[var1] = var3;
         bi[var1] = var4;
      }

      if (var4 >= -226986717) {
         bs[var1] = var6 + var2 * jm.ao() / var4;
         bm[var1] = var7 + var3 * jm.ao() / var4;
         bo[var1] = hl.ak(var4, 1261288518);
         return false;
      } else {
         bs[var1] = -1654790219;
         return true;
      }
   }

   void jp(int var1, qs var2, int var3, int var4, int var5, long var6) {
      if (this.bq != 1) {
         this.am();
      }

      this.ae(var1);
      qj var8 = new qj();
      var8.ap.ay((float)var1 * 0.0030679614F, 0.0F, 0.0F, 522776040);
      var8.ak.aj(1.0F, 1.0F, 1.0F, -1603121434);
      var8.aw.aj((float)var3, (float)var4, (float)var5, -1603121434);
      qs var9 = gu.aw(999274815);
      var9.af(var8, 1408146506);
      var9.ao(var2, 1424179759);
      int var10 = (int)var9.al(0.0F, 0.0F, 0.0F, (byte)-42);
      boolean var11 = false;
      int var12 = var10 - this.by;
      boolean var13 = var12 <= 50 || this.ax != null;
      int var14 = jm.as();
      int var15 = jm.ae();

      for(int var16 = 0; var16 < this.ae; ++var16) {
         int var17 = this.am[var16];
         int var18 = this.at[var16];
         int var19 = this.au[var16];
         var9.ac((float)var17, (float)var18, (float)var19, ck, (byte)105);
         var17 = (int)ck[0];
         var18 = (int)ck[1];
         var19 = (int)ck[2];
         var11 |= this.bq(var16, var17, var18, var19, var10, var14, var15, var13);
      }

      boolean var21 = jr.ap;
      boolean var22 = var21 && pl.aw(var6);
      var8.ap(1663405555);
      var9.ak((byte)-40);

      try {
         this.bp(var11, var22, this.bb, var6);
      } catch (Exception var20) {
      }

   }

   public void bh(int var1) {
      int var2 = cx[var1];
      int var3 = cz[var1];

      for(int var4 = 0; var4 < this.ae; ++var4) {
         int var5 = this.at[var4] * var3 - this.au[var4] * var2 >> 16;
         this.au[var4] = this.at[var4] * var2 + this.au[var4] * var3 >> 16;
         this.at[var4] = var5;
      }

      this.ar();
   }

   final void bp(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.bc < 6000) {
         int var6;
         for(var6 = 0; var6 < this.bc; ++var6) {
            bg[var6] = 0;
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
         for(char var7 = 0; var7 < this.an; ++var7) {
            if (this.ag[var7] != -2) {
               var8 = this.ao[var7];
               var9 = this.af[var7];
               var10 = this.ar[var7];
               var11 = bs[var8];
               var12 = bs[var9];
               var13 = bs[var10];
               int var14;
               if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                  var14 = ba[var8];
                  var15 = ba[var9];
                  var16 = ba[var10];
                  int var17 = bw[var8];
                  var18 = bw[var9];
                  int var19 = bw[var10];
                  int var20 = bi[var8];
                  int var21 = bi[var9];
                  int var22 = bi[var10];
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
                     bt[var7] = true;
                     int var26 = (bd[var8] + bd[var9] + bd[var10]) / 3 + this.by;
                     bl[var26][bg[var26]++] = var7;
                  }
               } else {
                  if (var2 && aq.ab(bm[var8], bm[var9], bm[var10], var11, var12, var13, var6, (byte)121)) {
                     ix.au(var4);
                     var2 = false;
                  }

                  if ((var11 - var12) * (bm[var10] - bm[var9]) - (bm[var8] - bm[var9]) * (var13 - var12) > 0) {
                     bt[var7] = false;
                     var14 = jm.af();
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var14 && var12 <= var14 && var13 <= var14) {
                        bu[var7] = false;
                     } else {
                        bu[var7] = true;
                     }

                     var15 = (bd[var8] + bd[var9] + bd[var10]) / 3 + this.by;
                     bl[var15][bg[var15]++] = var7;
                  }
               }
            }
         }

         int var27;
         char var28;
         char[] var29;
         if (this.ad == null) {
            for(var27 = this.bc - 1; var27 >= 0; --var27) {
               var28 = bg[var27];
               if (var28 > 0) {
                  var29 = bl[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     this.bz(var29[var10]);
                  }
               }
            }

         } else {
            for(var27 = 0; var27 < 12; ++var27) {
               be[var27] = 0;
               ci[var27] = 0;
            }

            for(var27 = this.bc - 1; var27 >= 0; --var27) {
               var28 = bg[var27];
               if (var28 > 0) {
                  var29 = bl[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     char var30 = var29[var10];
                     byte var31 = this.ad[var30];
                     var13 = be[var31]++;
                     cq[var31][var13] = var30;
                     if (var31 < 10) {
                        int[] var34 = ci;
                        var34[var31] += var27;
                     } else if (var31 == 10) {
                        cb[var13] = var27;
                     } else {
                        cd[var13] = var27;
                     }
                  }
               }
            }

            var27 = 0;
            if (be[1] > 0 || be[2] > 0) {
               var27 = (ci[1] + ci[2]) / (be[1] + be[2]);
            }

            var8 = 0;
            if (be[3] > 0 || be[4] > 0) {
               var8 = (ci[3] + ci[4]) / (be[3] + be[4]);
            }

            var9 = 0;
            if (be[6] > 0 || be[8] > 0) {
               var9 = (ci[6] + ci[8]) / (be[6] + be[8]);
            }

            var11 = 0;
            var12 = be[10];
            int[] var32 = cq[10];
            int[] var33 = cb;
            if (var11 == var12) {
               var11 = 0;
               var12 = be[11];
               var32 = cq[11];
               var33 = cd;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var27) {
                  this.bz(var32[var11++]);
                  if (var11 == var12 && var32 != cq[11]) {
                     var11 = 0;
                     var12 = be[11];
                     var32 = cq[11];
                     var33 = cd;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.bz(var32[var11++]);
                  if (var11 == var12 && var32 != cq[11]) {
                     var11 = 0;
                     var12 = be[11];
                     var32 = cq[11];
                     var33 = cd;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.bz(var32[var11++]);
                  if (var11 == var12 && var32 != cq[11]) {
                     var11 = 0;
                     var12 = be[11];
                     var32 = cq[11];
                     var33 = cd;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = be[var15];
               int[] var35 = cq[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.bz(var35[var18]);
               }
            }

            while(var10 != -1000) {
               this.bz(var32[var11++]);
               if (var11 == var12 && var32 != cq[11]) {
                  var11 = 0;
                  var32 = cq[11];
                  var12 = be[11];
                  var33 = cd;
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

   final void bz(int var1) {
      if (bt[var1]) {
         this.br(var1);
      } else {
         int var2 = this.ao[var1];
         int var3 = this.af[var1];
         int var4 = this.ar[var1];
         jm.as.ap = bu[var1];
         if (this.ac == null) {
            jm.as.ak = 0;
         } else {
            jm.as.ak = (this.ac[var1] == -1 ? 253 : this.ac[var1]) & 255;
         }

         this.by(var1, bm[var2], bm[var3], bm[var4], bs[var2], bs[var3], bs[var4], bo[var2], bo[var3], bo[var4], this.ab[var1], this.az[var1], this.ag[var1]);
      }
   }

   boolean bq(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      bd[var1] = var4 - var5;
      if (var8) {
         ba[var1] = var2;
         bw[var1] = var3;
         bi[var1] = var4;
      }

      if (var4 >= 50) {
         bs[var1] = var6 + var2 * jm.ao() / var4;
         bm[var1] = var7 + var3 * jm.ao() / var4;
         bo[var1] = hl.ak(var4, 1261288518);
         return false;
      } else {
         bs[var1] = -5000;
         return true;
      }
   }

   void kh(int var1, qs var2, int var3, int var4, int var5, long var6) {
      if (this.bq != 1) {
         this.am();
      }

      this.ae(var1);
      qj var8 = new qj();
      var8.ap.ay((float)var1 * 0.0030679614F, 0.0F, 0.0F, 78958382);
      var8.ak.aj(1.0F, 1.0F, 1.0F, -1603121434);
      var8.aw.aj((float)var3, (float)var4, (float)var5, -1603121434);
      qs var9 = gu.aw(-850094660);
      var9.af(var8, 1834309526);
      var9.ao(var2, 1648473367);
      int var10 = (int)var9.al(0.0F, 0.0F, 0.0F, (byte)-77);
      boolean var11 = false;
      int var12 = var10 - this.by;
      boolean var13 = var12 <= -452044060 || this.ax != null;
      int var14 = jm.as();
      int var15 = jm.ae();

      for(int var16 = 0; var16 < this.ae; ++var16) {
         int var17 = this.am[var16];
         int var18 = this.at[var16];
         int var19 = this.au[var16];
         var9.ac((float)var17, (float)var18, (float)var19, ck, (byte)119);
         var17 = (int)ck[0];
         var18 = (int)ck[1];
         var19 = (int)ck[2];
         var11 |= this.bq(var16, var17, var18, var19, var10, var14, var15, var13);
      }

      boolean var21 = jr.ap;
      boolean var22 = var21 && pl.aw(var6);
      var8.ap(515706617);
      var9.ak((byte)-33);

      try {
         this.bp(var11, var22, this.bb, var6);
      } catch (Exception var20) {
      }

   }

   final void br(int var1) {
      int var2 = jm.as();
      int var3 = jm.ae();
      int var4 = 0;
      int var5 = this.ao[var1];
      int var6 = this.af[var1];
      int var7 = this.ar[var1];
      int var8 = bi[var5];
      int var9 = bi[var6];
      int var10 = bi[var7];
      if (this.ac == null) {
         jm.as.ak = 0;
      } else {
         jm.as.ak = this.ac[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         cn[var4] = bs[var5];
         co[var4] = bm[var5];
         cl[var4] = bo[var7];
         cf[var4++] = this.ab[var1];
      } else {
         var11 = ba[var5];
         var12 = bw[var5];
         var13 = this.ab[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * ct[var10 - var8];
            cn[var4] = var2 + (var11 + ((ba[var7] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var7] - var12) * var14 >> 16)) * jm.ao() / 50;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.ag[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * ct[var9 - var8];
            cn[var4] = var2 + (var11 + ((ba[var6] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var6] - var12) * var14 >> 16)) * jm.ao() / 50;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         cn[var4] = bs[var6];
         co[var4] = bm[var6];
         cl[var4] = bo[var7];
         cf[var4++] = this.az[var1];
      } else {
         var11 = ba[var6];
         var12 = bw[var6];
         var13 = this.az[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * ct[var8 - var9];
            cn[var4] = var2 + (var11 + ((ba[var5] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var5] - var12) * var14 >> 16)) * jm.ao() / 50;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.ab[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * ct[var10 - var9];
            cn[var4] = var2 + (var11 + ((ba[var7] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var7] - var12) * var14 >> 16)) * jm.ao() / 50;
            cf[var4++] = var13 + ((this.ag[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         cn[var4] = bs[var7];
         co[var4] = bm[var7];
         cl[var4] = bo[var7];
         cf[var4++] = this.ag[var1];
      } else {
         var11 = ba[var7];
         var12 = bw[var7];
         var13 = this.ag[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * ct[var9 - var10];
            cn[var4] = var2 + (var11 + ((ba[var6] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var6] - var12) * var14 >> 16)) * jm.ao() / 50;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * ct[var8 - var10];
            cn[var4] = var2 + (var11 + ((ba[var5] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var5] - var12) * var14 >> 16)) * jm.ao() / 50;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.ab[var1] - var13) * var14 >> 16);
         }
      }

      var11 = cn[0];
      var12 = cn[1];
      var13 = cn[2];
      var14 = co[0];
      int var15 = co[1];
      int var16 = co[2];
      float var17 = cl[0];
      float var18 = cl[1];
      float var19 = cl[2];
      jm.as.ap = false;
      int var20 = jm.af();
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            jm.as.ap = true;
         }

         this.by(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, cf[0], cf[1], cf[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || cn[3] < 0 || cn[3] > var20) {
            jm.as.ap = true;
         }

         int var22;
         if (this.ax != null && this.ax[var1] != -1) {
            int var23;
            int var25;
            if (this.av != null && this.av[var1] != -1) {
               int var24 = this.av[var1] & 255;
               var25 = this.aa[var24];
               var22 = this.ah[var24];
               var23 = this.bh[var24];
            } else {
               var25 = var5;
               var22 = var6;
               var23 = var7;
            }

            short var26 = this.ax[var1];
            if (this.ag[var1] == -1) {
               jm.aq(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.ab[var1], this.ab[var1], this.ab[var1], ba[var25], ba[var22], ba[var23], bw[var25], bw[var22], bw[var23], bi[var25], bi[var22], bi[var23], var26);
               jm.aq(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], this.ab[var1], this.ab[var1], this.ab[var1], ba[var25], ba[var22], ba[var23], bw[var25], bw[var22], bw[var23], bi[var25], bi[var22], bi[var23], var26);
            } else {
               jm.aq(var14, var15, var16, var11, var12, var13, var17, var18, var19, cf[0], cf[1], cf[2], ba[var25], ba[var22], ba[var23], bw[var25], bw[var22], bw[var23], bi[var25], bi[var22], bi[var23], var26);
               jm.aq(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], cf[0], cf[2], cf[3], ba[var25], ba[var22], ba[var23], bw[var25], bw[var22], bw[var23], bi[var25], bi[var22], bi[var23], var26);
            }
         } else {
            boolean var21 = this.bc(var1);
            if (this.ag[var1] == -1 && var21) {
               var22 = ch[this.ab[var1]];
               jm.ah(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.cm, this.cw, this.ca, this.cs);
               jm.ah(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], var22, this.cm, this.cw, this.ca, this.cs);
            } else if (this.ag[var1] == -1) {
               var22 = ch[this.ab[var1]];
               jm.ax(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
               jm.ax(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], var22);
            } else if (var21) {
               jm.aa(var14, var15, var16, var11, var12, var13, var17, var18, var19, cf[0], cf[1], cf[2], this.cm, this.ca, this.cw, this.cs);
               jm.aa(var14, var16, co[3], var11, var13, cn[3], 0.0F, 0.0F, 0.0F, cf[0], cf[2], cf[3], this.cm, this.ca, this.cw, this.cs);
            } else {
               jm.av(var14, var15, var16, var11, var12, var13, var17, var18, var19, cf[0], cf[1], cf[2]);
               jm.av(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], cf[0], cf[2], cf[3]);
            }
         }
      }

   }

   void bn(int var1, qs var2) {
      float var3 = (float)this.am[var1];
      float var4 = (float)(-this.at[var1]);
      float var5 = (float)(-this.au[var1]);
      float var6 = 1.0F;
      this.am[var1] = (int)(var2.ai[0] * var3 + var2.ai[4] * var4 + var2.ai[8] * var5 + var2.ai[12] * var6);
      this.at[var1] = -((int)(var2.ai[1] * var3 + var2.ai[5] * var4 + var2.ai[9] * var5 + var2.ai[13] * var6));
      this.au[var1] = -((int)(var2.ai[2] * var3 + var2.ai[6] * var4 + var2.ai[10] * var5 + var2.ai[14] * var6));
   }

   void bu(jx var1, int var2) {
      if (this.bx != null) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            int[] var4 = this.bx[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.bk[var3];
               ai.ae((byte)71);

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  fw var8 = var1.ak(var7, -335772549);
                  if (var8 != null) {
                     ay.at((float)var5[var6] / 255.0F, 1159775402);
                     as.am(var8.ae(var2, 853655596), -1650103875);
                     as.ao(ay, -386531990);
                     ai.an(as, 61210655);
                  }
               }

               this.bn(var3, ai);
            }
         }

      }
   }

   static {
      cx = jm.aj;
      cz = jm.ai;
      ch = jm.ap;
      ct = jm.ak;
      cj = hl.ak(50, 1261288518);
      ck = new float[3];
   }

   void jy(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      int var15 = jm.aj[var2];
      int var16 = jm.ai[var2];
      int var17 = jm.aj[var3];
      int var18 = jm.ai[var3];
      this.bb(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   void eu(jx var1, int var2) {
      if (this.bx != null) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            int[] var4 = this.bx[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.bk[var3];
               ai.ae((byte)98);

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  fw var8 = var1.ak(var7, 990527461);
                  if (var8 != null) {
                     ay.at((float)var5[var6] / 255.0F, 1356345331);
                     as.am(var8.ae(var2, 2137250505), -1650103875);
                     as.ao(ay, 924117713);
                     ai.an(as, -2097245043);
                  }
               }

               this.bn(var3, ai);
            }
         }

      }
   }

   public void aa() {
      for(int var1 = 0; var1 < this.ae; ++var1) {
         this.am[var1] = -this.am[var1];
         this.au[var1] = -this.au[var1];
      }

      this.ar();
   }

   void jh(int var1, qs var2, int var3, int var4, int var5, long var6) {
      if (this.bq != 1) {
         this.am();
      }

      this.ae(var1);
      qj var8 = new qj();
      var8.ap.ay((float)var1 * 0.0030679614F, 0.0F, 0.0F, 94850975);
      var8.ak.aj(1.0F, 1.0F, 1.0F, -1603121434);
      var8.aw.aj((float)var3, (float)var4, (float)var5, -1603121434);
      qs var9 = gu.aw(67173242);
      var9.af(var8, 1978064596);
      var9.ao(var2, -261814837);
      int var10 = (int)var9.al(0.0F, 0.0F, 0.0F, (byte)-50);
      boolean var11 = false;
      int var12 = var10 - this.by;
      boolean var13 = var12 <= 50 || this.ax != null;
      int var14 = jm.as();
      int var15 = jm.ae();

      for(int var16 = 0; var16 < this.ae; ++var16) {
         int var17 = this.am[var16];
         int var18 = this.at[var16];
         int var19 = this.au[var16];
         var9.ac((float)var17, (float)var18, (float)var19, ck, (byte)35);
         var17 = (int)ck[0];
         var18 = (int)ck[1];
         var19 = (int)ck[2];
         var11 |= this.bq(var16, var17, var18, var19, var10, var14, var15, var13);
      }

      boolean var21 = jr.ap;
      boolean var22 = var21 && pl.aw(var6);
      var8.ap(-352246153);
      var9.ak((byte)-56);

      try {
         this.bp(var11, var22, this.bb, var6);
      } catch (Exception var20) {
      }

   }

   void ky(int var1, qs var2, int var3, int var4, int var5, long var6) {
      if (this.bq != 1) {
         this.am();
      }

      this.ae(var1);
      qj var8 = new qj();
      var8.ap.ay((float)var1 * 0.0030679614F, 0.0F, 0.0F, -1957585189);
      var8.ak.aj(1.0F, 1.0F, 1.0F, -1603121434);
      var8.aw.aj((float)var3, (float)var4, (float)var5, -1603121434);
      qs var9 = gu.aw(2135253910);
      var9.af(var8, 1656685556);
      var9.ao(var2, 1756399847);
      int var10 = (int)var9.al(0.0F, 0.0F, 0.0F, (byte)-23);
      boolean var11 = false;
      int var12 = var10 - this.by;
      boolean var13 = var12 <= -1326593029 || this.ax != null;
      int var14 = jm.as();
      int var15 = jm.ae();

      for(int var16 = 0; var16 < this.ae; ++var16) {
         int var17 = this.am[var16];
         int var18 = this.at[var16];
         int var19 = this.au[var16];
         var9.ac((float)var17, (float)var18, (float)var19, ck, (byte)10);
         var17 = (int)ck[0];
         var18 = (int)ck[1];
         var19 = (int)ck[2];
         var11 |= this.bq(var16, var17, var18, var19, var10, var14, var15, var13);
      }

      boolean var21 = jr.ap;
      boolean var22 = var21 && pl.aw(var6);
      var8.ap(-909011292);
      var9.ak((byte)-114);

      try {
         this.bp(var11, var22, this.bb, var6);
      } catch (Exception var20) {
      }

   }

   void bb(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.bq != 1) {
         this.am();
      }

      this.ae(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.bz * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < jl.at()) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.bz) * jm.ao();
         if (var16 / var14 < jm.at()) {
            int var17 = (var15 + this.bz) * jm.ao();
            if (var17 / var14 > jm.am()) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.bz * var2 >> 16;
               int var20 = var19 + (this.bp * var3 >> 16);
               int var21 = (var18 + var20) * jm.ao();
               if (var21 / var14 > jm.an()) {
                  int var22 = var19 + (this.ez * -274986519 * var3 >> 16);
                  int var23 = (var18 - var22) * jm.ao();
                  if (var23 / var14 < jm.au()) {
                     int var24 = var13 + (this.ez * -274986519 * var2 >> 16);
                     boolean var25 = false;
                     boolean var26 = false;
                     if (var12 - var24 <= 50) {
                        var26 = true;
                     }

                     boolean var27 = var26 || this.ax != null;
                     int var28 = ei.an(-1798476129);
                     int var29 = cw.ao((byte)-109);
                     boolean var30 = jr.ap;
                     ex.af(var2, var3, var4, var5, (byte)-55);
                     boolean var32 = pl.aw(var9);
                     boolean var33 = false;
                     int var35;
                     int var36;
                     int var37;
                     if (var32 && var30) {
                        boolean var34 = false;
                        if (cu) {
                           var34 = du.ar(this, var1, var6, var7, var8, var2, var3, var4, var5, 151326930);
                        } else {
                           var35 = var12 - var13;
                           if (var35 <= 50) {
                              var35 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var35;
                           } else {
                              var17 /= var14;
                              var16 /= var35;
                           }

                           if (var18 > 0) {
                              var23 /= var14;
                              var21 /= var35;
                           } else {
                              var21 /= var14;
                              var23 /= var35;
                           }

                           var36 = var28 - jm.as();
                           var37 = var29 - jm.ae();
                           if (var36 > var16 && var36 < var17 && var37 > var23 && var37 < var21) {
                              var34 = true;
                           }
                        }

                        if (var34) {
                           if (this.bb) {
                              ix.au(var9);
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var44 = jm.as();
                     var35 = jm.ae();
                     var36 = 0;
                     var37 = 0;
                     if (var1 != 0) {
                        var36 = cx[var1];
                        var37 = cz[var1];
                     }

                     for(int var38 = 0; var38 < this.ae; ++var38) {
                        int var39 = this.am[var38];
                        int var40 = this.at[var38];
                        int var41 = this.au[var38];
                        int var42;
                        if (var1 != 0) {
                           var42 = var41 * var36 + var39 * var37 >> 16;
                           var41 = var41 * var37 - var39 * var36 >> 16;
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
                        var25 |= this.bq(var38, var39, var42, var41, var12, var44, var35, var27);
                     }

                     try {
                        this.bp(var25, var33, this.bb, var9);
                     } catch (Exception var43) {
                     }

                  }
               }
            }
         }
      }
   }

   public void cj(ja var1, int var2) {
      if (this.bj != null) {
         if (var2 != -1) {
            jg var3 = var1.ap[var2];
            jt var4 = var3.ai;
            cp = 0;
            cv = 0;
            cy = 0;

            for(int var5 = 0; var5 < var3.ay; ++var5) {
               int var6 = var3.as[var5];
               this.aq(var4.ae[var6], var4.am[var6], var3.ae[var5], var3.am[var5], var3.at[var5]);
            }

            this.ar();
         }
      }
   }

   void je(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      int var15 = jm.aj[var2];
      int var16 = jm.ai[var2];
      int var17 = jm.aj[var3];
      int var18 = jm.ai[var3];
      this.bb(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   void bm(int var1, int var2, int var3) {
      this.am = new int[var1];
      this.at = new int[var1];
      this.au = new int[var1];
      this.ao = new int[var2];
      this.af = new int[var2];
      this.ar = new int[var2];
      this.ab = new int[var2];
      this.az = new int[var2];
      this.ag = new int[var2];
      if (var3 > 0) {
         this.aa = new int[var3];
         this.ah = new int[var3];
         this.bh = new int[var3];
      }

   }

   void bo(jy var1) {
      int var2 = this.ao.length;
      if (this.ad == null && (var1.ad != null || this.aq != var1.aq)) {
         this.ad = new byte[var2];
         Arrays.fill(this.ad, this.aq);
      }

      if (this.ac == null && var1.ac != null) {
         this.ac = new byte[var2];
         Arrays.fill(this.ac, (byte)0);
      }

      if (this.ax == null && var1.ax != null) {
         this.ax = new short[var2];
         Arrays.fill(this.ax, (short)-1);
      }

      if (this.av == null && var1.av != null) {
         this.av = new byte[var2];
         Arrays.fill(this.av, (byte)-1);
      }

   }

   void bd(jy var1) {
      int var2 = this.ao.length;
      if (this.ad == null && (var1.ad != null || this.aq != var1.aq)) {
         this.ad = new byte[var2];
         Arrays.fill(this.ad, this.aq);
      }

      if (this.ac == null && var1.ac != null) {
         this.ac = new byte[var2];
         Arrays.fill(this.ac, (byte)0);
      }

      if (this.ax == null && var1.ax != null) {
         this.ax = new short[var2];
         Arrays.fill(this.ax, (short)-1);
      }

      if (this.av == null && var1.av != null) {
         this.av = new byte[var2];
         Arrays.fill(this.av, (byte)-1);
      }

   }

   void ba(jy var1) {
      int var2 = this.ao.length;
      if (this.ad == null && (var1.ad != null || this.aq != var1.aq)) {
         this.ad = new byte[var2];
         Arrays.fill(this.ad, this.aq);
      }

      if (this.ac == null && var1.ac != null) {
         this.ac = new byte[var2];
         Arrays.fill(this.ac, (byte)0);
      }

      if (this.ax == null && var1.ax != null) {
         this.ax = new short[var2];
         Arrays.fill(this.ax, (short)-1);
      }

      if (this.av == null && var1.av != null) {
         this.av = new byte[var2];
         Arrays.fill(this.av, (byte)-1);
      }

   }

   void el(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      int var15 = jm.aj[var2];
      int var16 = jm.ai[var2];
      int var17 = jm.aj[var3];
      int var18 = jm.ai[var3];
      this.bb(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   public void bi(jy var1) {
      if (var1 != null) {
         this.aw(var1);

         int var2;
         for(var2 = 0; var2 < var1.an; ++var2) {
            this.ao[this.an] = var1.ao[var2] + this.ae;
            this.af[this.an] = var1.af[var2] + this.ae;
            this.ar[this.an] = var1.ar[var2] + this.ae;
            this.ab[this.an] = var1.ab[var2];
            this.az[this.an] = var1.az[var2];
            this.ag[this.an] = var1.ag[var2];
            if (this.ad != null) {
               this.ad[this.an] = var1.ad != null ? var1.ad[var2] : var1.aq;
            }

            if (this.ac != null && var1.ac != null) {
               this.ac[this.an] = var1.ac[var2];
            }

            if (this.ax != null) {
               this.ax[this.an] = var1.ax != null ? var1.ax[var2] : -1;
            }

            if (this.av != null) {
               if (var1.av != null && var1.av[var2] != -1) {
                  this.av[this.an] = (byte)(var1.av[var2] + this.al);
               } else {
                  this.av[this.an] = -1;
               }
            }

            ++this.an;
         }

         for(var2 = 0; var2 < var1.al; ++var2) {
            this.aa[this.al] = var1.aa[var2] + this.ae;
            this.ah[this.al] = var1.ah[var2] + this.ae;
            this.bh[this.al] = var1.bh[var2] + this.ae;
            ++this.al;
         }

         for(var2 = 0; var2 < var1.ae; ++var2) {
            this.am[this.ae] = var1.am[var2];
            this.at[this.ae] = var1.at[var2];
            this.au[this.ae] = var1.au[var2];
            ++this.ae;
         }

      }
   }

   void eb(jx var1, int var2) {
      if (this.bx != null) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            int[] var4 = this.bx[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.bk[var3];
               ai.ae((byte)6);

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  fw var8 = var1.ak(var7, 722445285);
                  if (var8 != null) {
                     ay.at((float)var5[var6] / 255.0F, 1150342851);
                     as.am(var8.ae(var2, 1202776544), -1650103875);
                     as.ao(ay, -402749241);
                     ai.an(as, 415285972);
                  }
               }

               this.bn(var3, ai);
            }
         }

      }
   }

   public void bg(jy var1) {
      if (var1 != null) {
         this.aw(var1);

         int var2;
         for(var2 = 0; var2 < var1.an; ++var2) {
            this.ao[this.an] = var1.ao[var2] + this.ae;
            this.af[this.an] = var1.af[var2] + this.ae;
            this.ar[this.an] = var1.ar[var2] + this.ae;
            this.ab[this.an] = var1.ab[var2];
            this.az[this.an] = var1.az[var2];
            this.ag[this.an] = var1.ag[var2];
            if (this.ad != null) {
               this.ad[this.an] = var1.ad != null ? var1.ad[var2] : var1.aq;
            }

            if (this.ac != null && var1.ac != null) {
               this.ac[this.an] = var1.ac[var2];
            }

            if (this.ax != null) {
               this.ax[this.an] = var1.ax != null ? var1.ax[var2] : -1;
            }

            if (this.av != null) {
               if (var1.av != null && var1.av[var2] != -1) {
                  this.av[this.an] = (byte)(var1.av[var2] + this.al);
               } else {
                  this.av[this.an] = -1;
               }
            }

            ++this.an;
         }

         for(var2 = 0; var2 < var1.al; ++var2) {
            this.aa[this.al] = var1.aa[var2] + this.ae;
            this.ah[this.al] = var1.ah[var2] + this.ae;
            this.bh[this.al] = var1.bh[var2] + this.ae;
            ++this.al;
         }

         for(var2 = 0; var2 < var1.ae; ++var2) {
            this.am[this.ae] = var1.am[var2];
            this.at[this.ae] = var1.at[var2];
            this.au[this.ae] = var1.au[var2];
            ++this.ae;
         }

      }
   }

   public final void bk(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.bq != 2) {
         this.at();
      }

      int var9 = jm.as();
      int var10 = jm.ae();
      int var11 = cx[var1];
      int var12 = cz[var1];
      int var13 = cx[var2];
      int var14 = cz[var2];
      int var15 = cx[var3];
      int var16 = cz[var3];
      int var17 = cx[var4];
      int var18 = cz[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.ae; ++var20) {
         int var21 = this.am[var20];
         int var22 = this.at[var20];
         int var23 = this.au[var20];
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
         bd[var20] = var23 - var19;
         bs[var20] = var9 + var21 * jm.ao() / var8;
         bm[var20] = var10 + var24 * jm.ao() / var8;
         bo[var20] = hl.ak(var8, 1261288518);
         if (this.ax != null) {
            ba[var20] = var21;
            bw[var20] = var24;
            bi[var20] = var23;
         }
      }

      try {
         this.bp(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   public jy be(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.am();
      int var7 = var2 - this.bz;
      int var8 = var2 + this.bz;
      int var9 = var4 - this.bz;
      int var10 = var4 + this.bz;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            jy var11;
            if (var5) {
               var11 = new jy();
               var11.ae = this.ae;
               var11.an = this.an;
               var11.al = this.al;
               var11.am = this.am;
               var11.au = this.au;
               var11.ao = this.ao;
               var11.af = this.af;
               var11.ar = this.ar;
               var11.ab = this.ab;
               var11.az = this.az;
               var11.ag = this.ag;
               var11.ad = this.ad;
               var11.ac = this.ac;
               var11.av = this.av;
               var11.ax = this.ax;
               var11.aq = this.aq;
               var11.aa = this.aa;
               var11.ah = this.ah;
               var11.bh = this.bh;
               var11.bj = this.bj;
               var11.bv = this.bv;
               var11.bb = this.bb;
               var11.at = new int[var11.ae];
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
               for(var12 = 0; var12 < var11.ae; ++var12) {
                  var13 = this.am[var12] + var2;
                  var14 = this.au[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.at[var12] = this.at[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.ae; ++var12) {
                  var13 = (-this.at[var12] << 16) / (this.ez * -274986519);
                  if (var13 < var6) {
                     var14 = this.am[var12] + var2;
                     var15 = this.au[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.at[var12] = this.at[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.ar();
            return var11;
         }
      } else {
         return this;
      }
   }

   public jy cd(boolean var1) {
      if (!var1 && aw.length < this.an) {
         aw = new byte[this.an + 100];
      }

      return this.as(var1, ap, aw);
   }

   public jy cb(boolean var1) {
      if (!var1 && aw.length < this.an) {
         aw = new byte[this.an + 100];
      }

      return this.as(var1, ap, aw);
   }

   public void dd(jt var1, fr var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      jx var7 = var1.aw(669227290);
      if (var7 != null) {
         var7.ay(var2, var3, var4, var5, -1700802081);
         if (var6) {
            this.ad(var7, var2.aj(-1662542495));
         }
      }

      if (!var5 && var2.ai((byte)-91)) {
         this.ag(var2, var3);
      }

   }

   public void bf(jy var1) {
      if (var1 != null) {
         this.aw(var1);

         int var2;
         for(var2 = 0; var2 < var1.an; ++var2) {
            this.ao[this.an] = var1.ao[var2] + this.ae;
            this.af[this.an] = var1.af[var2] + this.ae;
            this.ar[this.an] = var1.ar[var2] + this.ae;
            this.ab[this.an] = var1.ab[var2];
            this.az[this.an] = var1.az[var2];
            this.ag[this.an] = var1.ag[var2];
            if (this.ad != null) {
               this.ad[this.an] = var1.ad != null ? var1.ad[var2] : var1.aq;
            }

            if (this.ac != null && var1.ac != null) {
               this.ac[this.an] = var1.ac[var2];
            }

            if (this.ax != null) {
               this.ax[this.an] = var1.ax != null ? var1.ax[var2] : -1;
            }

            if (this.av != null) {
               if (var1.av != null && var1.av[var2] != -1) {
                  this.av[this.an] = (byte)(var1.av[var2] + this.al);
               } else {
                  this.av[this.an] = -1;
               }
            }

            ++this.an;
         }

         for(var2 = 0; var2 < var1.al; ++var2) {
            this.aa[this.al] = var1.aa[var2] + this.ae;
            this.ah[this.al] = var1.ah[var2] + this.ae;
            this.bh[this.al] = var1.bh[var2] + this.ae;
            ++this.al;
         }

         for(var2 = 0; var2 < var1.ae; ++var2) {
            this.am[this.ae] = var1.am[var2];
            this.at[this.ae] = var1.at[var2];
            this.au[this.ae] = var1.au[var2];
            ++this.ae;
         }

      }
   }

   public jy cn(boolean var1) {
      if (!var1 && aj.length < this.an) {
         aj = new byte[this.an + -1437895851];
      }

      return this.as(var1, ak, aj);
   }

   void ap(int var1, int var2, int var3) {
      this.am = new int[var1];
      this.at = new int[var1];
      this.au = new int[var1];
      this.ao = new int[var2];
      this.af = new int[var2];
      this.ar = new int[var2];
      this.ab = new int[var2];
      this.az = new int[var2];
      this.ag = new int[var2];
      if (var3 > 0) {
         this.aa = new int[var3];
         this.ah = new int[var3];
         this.bh = new int[var3];
      }

   }

   jy cf(boolean var1, jy var2, byte[] var3) {
      var2.ae = this.ae;
      var2.an = this.an;
      var2.al = this.al;
      if (var2.am == null || var2.am.length < this.ae) {
         var2.am = new int[this.ae + 100];
         var2.at = new int[this.ae + 100];
         var2.au = new int[this.ae + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.ae; ++var4) {
         var2.am[var4] = this.am[var4];
         var2.at[var4] = this.at[var4];
         var2.au[var4] = this.au[var4];
      }

      if (var1) {
         var2.ac = this.ac;
      } else {
         var2.ac = var3;
         if (this.ac == null) {
            for(var4 = 0; var4 < this.an; ++var4) {
               var2.ac[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.an; ++var4) {
               var2.ac[var4] = this.ac[var4];
            }
         }
      }

      var2.ao = this.ao;
      var2.af = this.af;
      var2.ar = this.ar;
      var2.ab = this.ab;
      var2.az = this.az;
      var2.ag = this.ag;
      var2.ad = this.ad;
      var2.av = this.av;
      var2.ax = this.ax;
      var2.aq = this.aq;
      var2.aa = this.aa;
      var2.ah = this.ah;
      var2.bh = this.bh;
      var2.bj = this.bj;
      var2.bv = this.bv;
      var2.bx = this.bx;
      var2.bk = this.bk;
      var2.bb = this.bb;
      var2.ar();
      var2.cs = 0;
      return var2;
   }

   jy cl(boolean var1, jy var2, byte[] var3) {
      var2.ae = this.ae;
      var2.an = this.an;
      var2.al = this.al;
      if (var2.am == null || var2.am.length < this.ae) {
         var2.am = new int[this.ae + 100];
         var2.at = new int[this.ae + 100];
         var2.au = new int[this.ae + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.ae; ++var4) {
         var2.am[var4] = this.am[var4];
         var2.at[var4] = this.at[var4];
         var2.au[var4] = this.au[var4];
      }

      if (var1) {
         var2.ac = this.ac;
      } else {
         var2.ac = var3;
         if (this.ac == null) {
            for(var4 = 0; var4 < this.an; ++var4) {
               var2.ac[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.an; ++var4) {
               var2.ac[var4] = this.ac[var4];
            }
         }
      }

      var2.ao = this.ao;
      var2.af = this.af;
      var2.ar = this.ar;
      var2.ab = this.ab;
      var2.az = this.az;
      var2.ag = this.ag;
      var2.ad = this.ad;
      var2.av = this.av;
      var2.ax = this.ax;
      var2.aq = this.aq;
      var2.aa = this.aa;
      var2.ah = this.ah;
      var2.bh = this.bh;
      var2.bj = this.bj;
      var2.bv = this.bv;
      var2.bx = this.bx;
      var2.bk = this.bk;
      var2.bb = this.bb;
      var2.ar();
      var2.cs = 0;
      return var2;
   }

   public void de(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ae; ++var4) {
         this.am[var4] = this.am[var4] * var1 / -1449302563;
         this.at[var4] = this.at[var4] * var2 / -1501712043;
         this.au[var4] = this.au[var4] * var3 / 128;
      }

      this.ar();
   }

   void cv(int var1) {
      if (!this.br.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = cz[var1];
         int var9 = cx[var1];

         int var11;
         for(int var10 = 0; var10 < this.ae; ++var10) {
            var11 = jv.ap(this.am[var10], this.au[var10], var8, var9, 713111635);
            int var12 = this.at[var10];
            int var14 = this.am[var10];
            int var15 = this.au[var10];
            int var13 = var15 * var8 - var14 * var9 >> 16;
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

         jb var17 = new jb((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         var11 = 1699935147;
         if (var17.aj * -449342943 < 32) {
            var17.aj = -1257358304;
         }

         if (var17.ay * 1805439687 < 32) {
            var17.ay = 1623953120;
         }

         if (this.bb) {
            boolean var18 = true;
            var17.aj += -314339576;
            var17.ay += -1311858531;
         }

         this.br.put(var1, var17);
      }
   }

   void cy(int var1) {
      if (!this.br.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = cz[var1];
         int var9 = cx[var1];

         for(int var10 = 0; var10 < this.ae; ++var10) {
            int var11 = jv.ap(this.am[var10], this.au[var10], var8, var9, 1495697420);
            int var12 = this.at[var10];
            int var14 = this.am[var10];
            int var15 = this.au[var10];
            int var13 = var15 * var8 - var14 * var9 >> 16;
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

         jb var17 = new jb((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         boolean var18 = true;
         if (var17.aj * -449342943 < 32) {
            var17.aj = -1257358304;
         }

         if (var17.ay * -2056503993 < 32) {
            var17.ay = 1623953120;
         }

         if (this.bb) {
            boolean var19 = true;
            var17.aj += -314339576;
            var17.ay += -1741495368;
         }

         this.br.put(var1, var17);
      }
   }

   public void ak(jy var1) {
      if (var1 != null) {
         this.aw(var1);

         int var2;
         for(var2 = 0; var2 < var1.an; ++var2) {
            this.ao[this.an] = var1.ao[var2] + this.ae;
            this.af[this.an] = var1.af[var2] + this.ae;
            this.ar[this.an] = var1.ar[var2] + this.ae;
            this.ab[this.an] = var1.ab[var2];
            this.az[this.an] = var1.az[var2];
            this.ag[this.an] = var1.ag[var2];
            if (this.ad != null) {
               this.ad[this.an] = var1.ad != null ? var1.ad[var2] : var1.aq;
            }

            if (this.ac != null && var1.ac != null) {
               this.ac[this.an] = var1.ac[var2];
            }

            if (this.ax != null) {
               this.ax[this.an] = var1.ax != null ? var1.ax[var2] : -1;
            }

            if (this.av != null) {
               if (var1.av != null && var1.av[var2] != -1) {
                  this.av[this.an] = (byte)(var1.av[var2] + this.al);
               } else {
                  this.av[this.an] = -1;
               }
            }

            ++this.an;
         }

         for(var2 = 0; var2 < var1.al; ++var2) {
            this.aa[this.al] = var1.aa[var2] + this.ae;
            this.ah[this.al] = var1.ah[var2] + this.ae;
            this.bh[this.al] = var1.bh[var2] + this.ae;
            ++this.al;
         }

         for(var2 = 0; var2 < var1.ae; ++var2) {
            this.am[this.ae] = var1.am[var2];
            this.at[this.ae] = var1.at[var2];
            this.au[this.ae] = var1.au[var2];
            ++this.ae;
         }

      }
   }

   public void ce() {
      if (this.bq != 1) {
         this.bq = 1;
         this.ez = 0;
         this.bp = 0;
         this.bz = 0;

         for(int var1 = 0; var1 < this.ae; ++var1) {
            int var2 = this.am[var1];
            int var3 = this.at[var1];
            int var4 = this.au[var1];
            if (-var3 > this.ez * -274986519) {
               this.ez = -var3 * 2132106841;
            }

            if (var3 > this.bp) {
               this.bp = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.bz) {
               this.bz = var5;
            }
         }

         this.bz = (int)(Math.sqrt((double)this.bz) + 0.99D);
         this.by = (int)(Math.sqrt((double)(this.bz * this.bz + this.ez * -274986519 * this.ez * -274986519)) + 0.99D);
         this.bc = this.by + (int)(Math.sqrt((double)(this.bz * this.bz + this.bp * this.bp)) + 0.99D);
      }
   }

   void jr(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      int var15 = jm.aj[var2];
      int var16 = jm.ai[var2];
      int var17 = jm.aj[var3];
      int var18 = jm.ai[var3];
      this.bb(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   void cx() {
      if (this.bq != 2) {
         this.bq = 2;
         this.bz = 0;

         for(int var1 = 0; var1 < this.ae; ++var1) {
            int var2 = this.am[var1];
            int var3 = this.at[var1];
            int var4 = this.au[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.bz) {
               this.bz = var5;
            }
         }

         this.bz = (int)(Math.sqrt((double)this.bz) + 0.99D);
         this.by = this.bz;
         this.bc = this.bz + this.bz;
      }
   }

   public jy cq(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.am();
      int var7 = var2 - this.bz;
      int var8 = var2 + this.bz;
      int var9 = var4 - this.bz;
      int var10 = var4 + this.bz;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            jy var11;
            if (var5) {
               var11 = new jy();
               var11.ae = this.ae;
               var11.an = this.an;
               var11.al = this.al;
               var11.am = this.am;
               var11.au = this.au;
               var11.ao = this.ao;
               var11.af = this.af;
               var11.ar = this.ar;
               var11.ab = this.ab;
               var11.az = this.az;
               var11.ag = this.ag;
               var11.ad = this.ad;
               var11.ac = this.ac;
               var11.av = this.av;
               var11.ax = this.ax;
               var11.aq = this.aq;
               var11.aa = this.aa;
               var11.ah = this.ah;
               var11.bh = this.bh;
               var11.bj = this.bj;
               var11.bv = this.bv;
               var11.bb = this.bb;
               var11.at = new int[var11.ae];
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
               for(var12 = 0; var12 < var11.ae; ++var12) {
                  var13 = this.am[var12] + var2;
                  var14 = this.au[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.at[var12] = this.at[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.ae; ++var12) {
                  var13 = (-this.at[var12] << 16) / (this.ez * -274986519);
                  if (var13 < var6) {
                     var14 = this.am[var12] + var2;
                     var15 = this.au[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.at[var12] = this.at[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.ar();
            return var11;
         }
      } else {
         return this;
      }
   }

   public int ch() {
      this.am();
      return this.bz;
   }

   public int ct() {
      this.am();
      return this.bz;
   }

   public void cc() {
      this.bq = 0;
      this.br.clear();
   }

   public void ax(ja var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.ab(var1, var2);
      } else {
         jg var5 = var1.ap[var2];
         jt var6 = var5.ai;
         byte var7 = 0;
         int var11 = var7 + 1;
         int var8 = var3[var7];
         cp = 0;
         cv = 0;
         cy = 0;

         for(int var9 = 0; var9 < var5.ay; ++var9) {
            int var10;
            for(var10 = var5.as[var9]; var10 > var8; var8 = var3[var11++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.ae[var10] == 0) {
                  this.aq(var6.ae[var10], var6.am[var10], var5.ae[var9], var5.am[var9], var5.at[var9]);
               }
            } else if (var10 != var8 || var6.ae[var10] == 0) {
               this.aq(var6.ae[var10], var6.am[var10], var5.ae[var9], var5.am[var9], var5.at[var9]);
            }
         }

      }
   }

   public void cm(fr var1, int var2) {
      jt var3 = var1.aj;
      jx var4 = var3.aw(669227290);
      if (var4 != null) {
         var3.aw(669227290).ai(var1, var2, (byte)30);
         this.ad(var3.aw(669227290), var1.aj(-1662542495));
      }

      if (var1.ai((byte)-88)) {
         this.ag(var1, var2);
      }

      this.ar();
   }

   public void cw(fr var1, int var2) {
      jt var3 = var1.aj;
      jx var4 = var3.aw(669227290);
      if (var4 != null) {
         var3.aw(669227290).ai(var1, var2, (byte)123);
         this.ad(var3.aw(669227290), var1.aj(-1662542495));
      }

      if (var1.ai((byte)-6)) {
         this.ag(var1, var2);
      }

      this.ar();
   }

   void ca(fr var1, int var2) {
      jt var3 = var1.aj;

      for(int var4 = 0; var4 < var3.as * -453798821; ++var4) {
         int var5 = var3.ae[var4];
         if (var5 == 5 && var1.aw != null && var1.aw[var4] != null && var1.aw[var4][0] != null && this.bv != null && this.ac != null) {
            fv var6 = var1.aw[var4][0];
            int[] var7 = var3.am[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.bv.length) {
                  int[] var11 = this.bv[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.ac[var13] & 255) + var6.ak(var2, -1648636108) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 255;
                     }

                     this.ac[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   void cs(jx var1, int var2) {
      this.bu(var1, var2);
   }

   void cz() {
      if (this.bq != 2) {
         this.bq = 2;
         this.bz = 0;

         for(int var1 = 0; var1 < this.ae; ++var1) {
            int var2 = this.am[var1];
            int var3 = this.at[var1];
            int var4 = this.au[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.bz) {
               this.bz = var5;
            }
         }

         this.bz = (int)(Math.sqrt((double)this.bz) + 0.99D);
         this.by = this.bz;
         this.bc = this.bz + this.bz;
      }
   }

   public void ck(ja var1, int var2, ja var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            jg var6 = var1.ap[var2];
            jg var7 = var3.ap[var4];
            jt var8 = var6.ai;
            cp = 0;
            cv = 0;
            cy = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.ay; ++var11) {
               for(var12 = var6.as[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 != var10 || var8.ae[var12] == 0) {
                  this.aq(var8.ae[var12], var8.am[var12], var6.ae[var11], var6.am[var11], var6.at[var11]);
               }
            }

            cp = 0;
            cv = 0;
            cy = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.ay; ++var11) {
               for(var12 = var7.as[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 == var10 || var8.ae[var12] == 0) {
                  this.aq(var8.ae[var12], var8.am[var12], var7.ae[var11], var7.am[var11], var7.at[var11]);
               }
            }

            this.ar();
         } else {
            this.ab(var1, var2);
         }
      }
   }

   public void dw(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ae; ++var4) {
         this.am[var4] = this.am[var4] * var1 / 128;
         this.at[var4] = this.at[var4] * var2 / -249786931;
         this.au[var4] = this.au[var4] * var3 / 128;
      }

      this.ar();
   }

   final void ec(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.bc < 6000) {
         int var6;
         for(var6 = 0; var6 < this.bc; ++var6) {
            bg[var6] = 0;
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
         for(char var7 = 0; var7 < this.an; ++var7) {
            if (this.ag[var7] != -2) {
               var8 = this.ao[var7];
               var9 = this.af[var7];
               var10 = this.ar[var7];
               var11 = bs[var8];
               var12 = bs[var9];
               var13 = bs[var10];
               int var14;
               if (!var1 || var11 != -5000 && var12 != -5000 && var13 != -5000) {
                  if (var2 && aq.ab(bm[var8], bm[var9], bm[var10], var11, var12, var13, var6, (byte)121)) {
                     ix.au(var4);
                     var2 = false;
                  }

                  if ((var11 - var12) * (bm[var10] - bm[var9]) - (bm[var8] - bm[var9]) * (var13 - var12) > 0) {
                     bt[var7] = false;
                     var14 = jm.af();
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var14 && var12 <= var14 && var13 <= var14) {
                        bu[var7] = false;
                     } else {
                        bu[var7] = true;
                     }

                     var15 = (bd[var8] + bd[var9] + bd[var10]) / 3 + this.by;
                     bl[var15][bg[var15]++] = var7;
                  }
               } else {
                  var14 = ba[var8];
                  var15 = ba[var9];
                  var16 = ba[var10];
                  int var17 = bw[var8];
                  var18 = bw[var9];
                  int var19 = bw[var10];
                  int var20 = bi[var8];
                  int var21 = bi[var9];
                  int var22 = bi[var10];
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
                     bt[var7] = true;
                     int var26 = (bd[var8] + bd[var9] + bd[var10]) / 3 + this.by;
                     bl[var26][bg[var26]++] = var7;
                  }
               }
            }
         }

         int var27;
         char var28;
         char[] var29;
         if (this.ad == null) {
            for(var27 = this.bc - 1; var27 >= 0; --var27) {
               var28 = bg[var27];
               if (var28 > 0) {
                  var29 = bl[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     this.bz(var29[var10]);
                  }
               }
            }

         } else {
            for(var27 = 0; var27 < 12; ++var27) {
               be[var27] = 0;
               ci[var27] = 0;
            }

            for(var27 = this.bc - 1; var27 >= 0; --var27) {
               var28 = bg[var27];
               if (var28 > 0) {
                  var29 = bl[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     char var30 = var29[var10];
                     byte var31 = this.ad[var30];
                     var13 = be[var31]++;
                     cq[var31][var13] = var30;
                     if (var31 < 10) {
                        int[] var34 = ci;
                        var34[var31] += var27;
                     } else if (var31 == 10) {
                        cb[var13] = var27;
                     } else {
                        cd[var13] = var27;
                     }
                  }
               }
            }

            var27 = 0;
            if (be[1] > 0 || be[2] > 0) {
               var27 = (ci[1] + ci[2]) / (be[1] + be[2]);
            }

            var8 = 0;
            if (be[3] > 0 || be[4] > 0) {
               var8 = (ci[3] + ci[4]) / (be[3] + be[4]);
            }

            var9 = 0;
            if (be[6] > 0 || be[8] > 0) {
               var9 = (ci[6] + ci[8]) / (be[6] + be[8]);
            }

            var11 = 0;
            var12 = be[10];
            int[] var32 = cq[10];
            int[] var33 = cb;
            if (var11 == var12) {
               var11 = 0;
               var12 = be[11];
               var32 = cq[11];
               var33 = cd;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var27) {
                  this.bz(var32[var11++]);
                  if (var11 == var12 && var32 != cq[11]) {
                     var11 = 0;
                     var12 = be[11];
                     var32 = cq[11];
                     var33 = cd;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.bz(var32[var11++]);
                  if (var11 == var12 && var32 != cq[11]) {
                     var11 = 0;
                     var12 = be[11];
                     var32 = cq[11];
                     var33 = cd;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.bz(var32[var11++]);
                  if (var11 == var12 && var32 != cq[11]) {
                     var11 = 0;
                     var12 = be[11];
                     var32 = cq[11];
                     var33 = cd;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = be[var15];
               int[] var35 = cq[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.bz(var35[var18]);
               }
            }

            while(var10 != -1000) {
               this.bz(var32[var11++]);
               if (var11 == var12 && var32 != cq[11]) {
                  var11 = 0;
                  var32 = cq[11];
                  var12 = be[11];
                  var33 = cd;
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

   public void dc(jt var1, fr var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      jx var7 = var1.aw(669227290);
      if (var7 != null) {
         var7.ay(var2, var3, var4, var5, -1784609498);
         if (var6) {
            this.ad(var7, var2.aj(-1662542495));
         }
      }

      if (!var5 && var2.ai((byte)-115)) {
         this.ag(var2, var3);
      }

   }

   public void da(ja var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.ab(var1, var2);
      } else {
         jg var5 = var1.ap[var2];
         jt var6 = var5.ai;
         byte var7 = 0;
         int var11 = var7 + 1;
         int var8 = var3[var7];
         cp = 0;
         cv = 0;
         cy = 0;

         for(int var9 = 0; var9 < var5.ay; ++var9) {
            int var10;
            for(var10 = var5.as[var9]; var10 > var8; var8 = var3[var11++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.ae[var10] == 0) {
                  this.aq(var6.ae[var10], var6.am[var10], var5.ae[var9], var5.am[var9], var5.at[var9]);
               }
            } else if (var10 != var8 || var6.ae[var10] == 0) {
               this.aq(var6.ae[var10], var6.am[var10], var5.ae[var9], var5.am[var9], var5.at[var9]);
            }
         }

      }
   }

   public void dr(ja var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.ab(var1, var2);
      } else {
         jg var5 = var1.ap[var2];
         jt var6 = var5.ai;
         byte var7 = 0;
         int var11 = var7 + 1;
         int var8 = var3[var7];
         cp = 0;
         cv = 0;
         cy = 0;

         for(int var9 = 0; var9 < var5.ay; ++var9) {
            int var10;
            for(var10 = var5.as[var9]; var10 > var8; var8 = var3[var11++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.ae[var10] == 0) {
                  this.aq(var6.ae[var10], var6.am[var10], var5.ae[var9], var5.am[var9], var5.at[var9]);
               }
            } else if (var10 != var8 || var6.ae[var10] == 0) {
               this.aq(var6.ae[var10], var6.am[var10], var5.ae[var9], var5.am[var9], var5.at[var9]);
            }
         }

      }
   }

   public void ds() {
      for(int var1 = 0; var1 < this.ae; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.am[var1];
         this.am[var1] = -var2;
      }

      this.ar();
   }

   public void al() {
      for(int var1 = 0; var1 < this.ae; ++var1) {
         int var2 = this.am[var1];
         this.am[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.ar();
   }

   public void df() {
      for(int var1 = 0; var1 < this.ae; ++var1) {
         int var2 = this.am[var1];
         this.am[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.ar();
   }

   public void du() {
      for(int var1 = 0; var1 < this.ae; ++var1) {
         int var2 = this.am[var1];
         this.am[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.ar();
   }

   void ae(int var1) {
      if (!this.br.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = cz[var1];
         int var9 = cx[var1];

         for(int var10 = 0; var10 < this.ae; ++var10) {
            int var11 = jv.ap(this.am[var10], this.au[var10], var8, var9, 2070749713);
            int var12 = this.at[var10];
            int var14 = this.am[var10];
            int var15 = this.au[var10];
            int var13 = var15 * var8 - var14 * var9 >> 16;
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

         jb var17 = new jb((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         boolean var18 = true;
         if (var17.aj * -449342943 < 32) {
            var17.aj = -1257358304;
         }

         if (var17.ay * -2056503993 < 32) {
            var17.ay = 1623953120;
         }

         if (this.bb) {
            boolean var19 = true;
            var17.aj += -314339576;
            var17.ay += -1741495368;
         }

         this.br.put(var1, var17);
      }
   }

   public jy co(boolean var1) {
      if (!var1 && aj.length < this.an) {
         aj = new byte[this.an + 100];
      }

      return this.as(var1, ak, aj);
   }

   public jy ci(boolean var1) {
      if (!var1 && aw.length < this.an) {
         aw = new byte[this.an + 100];
      }

      return this.as(var1, ap, aw);
   }

   public void dt() {
      for(int var1 = 0; var1 < this.ae; ++var1) {
         this.am[var1] = -this.am[var1];
         this.au[var1] = -this.au[var1];
      }

      this.ar();
   }

   public void dx() {
      for(int var1 = 0; var1 < this.ae; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.am[var1];
         this.am[var1] = -var2;
      }

      this.ar();
   }

   void dh(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         cp = 0;
         cv = 0;
         cy = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if (var18 < this.bj.length) {
               int[] var19 = this.bj[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  cp += this.am[var12];
                  cv += this.at[var12];
                  cy += this.au[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            cp = cp / var7 + var3;
            cv = cv / var7 + var4;
            cy = cy / var7 + var5;
         } else {
            cp = var3;
            cv = var4;
            cy = var5;
         }

      } else {
         int[] var9;
         int var10;
         int[] var10000;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bj.length) {
                  var9 = this.bj[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.am;
                     var10000[var11] += var3;
                     var10000 = this.at;
                     var10000[var11] += var4;
                     var10000 = this.au;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bj.length) {
                  var9 = this.bj[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.am;
                     var10000[var11] -= cp;
                     var10000 = this.at;
                     var10000[var11] -= cv;
                     var10000 = this.au;
                     var10000[var11] -= cy;
                     var12 = (var3 & -571626152) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & -1690275878) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = cx[var14];
                        var16 = cz[var14];
                        var17 = this.at[var11] * var15 + this.am[var11] * var16 >> 16;
                        this.at[var11] = this.at[var11] * var16 - this.am[var11] * var15 >> 16;
                        this.am[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = cx[var12];
                        var16 = cz[var12];
                        var17 = this.at[var11] * var16 - this.au[var11] * var15 >> 16;
                        this.au[var11] = this.at[var11] * var15 + this.au[var11] * var16 >> 16;
                        this.at[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = cx[var13];
                        var16 = cz[var13];
                        var17 = this.au[var11] * var15 + this.am[var11] * var16 >> 16;
                        this.au[var11] = this.au[var11] * var16 - this.am[var11] * var15 >> 16;
                        this.am[var11] = var17;
                     }

                     var10000 = this.am;
                     var10000[var11] += cp;
                     var10000 = this.at;
                     var10000[var11] += cv;
                     var10000 = this.au;
                     var10000[var11] += cy;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bj.length) {
                  var9 = this.bj[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.am;
                     var10000[var11] -= cp;
                     var10000 = this.at;
                     var10000[var11] -= cv;
                     var10000 = this.au;
                     var10000[var11] -= cy;
                     this.am[var11] = this.am[var11] * var3 / 128;
                     this.at[var11] = this.at[var11] * var4 / 1633065253;
                     this.au[var11] = this.au[var11] * var5 / 128;
                     var10000 = this.am;
                     var10000[var11] += cp;
                     var10000 = this.at;
                     var10000[var11] += cv;
                     var10000 = this.au;
                     var10000[var11] += cy;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.bv != null && this.ac != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.bv.length) {
                     var9 = this.bv[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.ac[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > -1403746708) {
                           var12 = 779380394;
                        }

                        this.ac[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   jy cp(boolean var1, jy var2, byte[] var3) {
      var2.ae = this.ae;
      var2.an = this.an;
      var2.al = this.al;
      if (var2.am == null || var2.am.length < this.ae) {
         var2.am = new int[this.ae + 100];
         var2.at = new int[this.ae + 100];
         var2.au = new int[this.ae + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.ae; ++var4) {
         var2.am[var4] = this.am[var4];
         var2.at[var4] = this.at[var4];
         var2.au[var4] = this.au[var4];
      }

      if (var1) {
         var2.ac = this.ac;
      } else {
         var2.ac = var3;
         if (this.ac == null) {
            for(var4 = 0; var4 < this.an; ++var4) {
               var2.ac[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.an; ++var4) {
               var2.ac[var4] = this.ac[var4];
            }
         }
      }

      var2.ao = this.ao;
      var2.af = this.af;
      var2.ar = this.ar;
      var2.ab = this.ab;
      var2.az = this.az;
      var2.ag = this.ag;
      var2.ad = this.ad;
      var2.av = this.av;
      var2.ax = this.ax;
      var2.aq = this.aq;
      var2.aa = this.aa;
      var2.ah = this.ah;
      var2.bh = this.bh;
      var2.bj = this.bj;
      var2.bv = this.bv;
      var2.bx = this.bx;
      var2.bk = this.bk;
      var2.bb = this.bb;
      var2.ar();
      var2.cs = 0;
      return var2;
   }

   public void dv(int var1) {
      int var2 = cx[var1];
      int var3 = cz[var1];

      for(int var4 = 0; var4 < this.ae; ++var4) {
         int var5 = this.at[var4] * var3 - this.au[var4] * var2 >> 16;
         this.au[var4] = this.at[var4] * var2 + this.au[var4] * var3 >> 16;
         this.at[var4] = var5;
      }

      this.ar();
   }

   public void dj(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ae; ++var4) {
         int[] var10000 = this.am;
         var10000[var4] += var1;
         var10000 = this.at;
         var10000[var4] += var2;
         var10000 = this.au;
         var10000[var4] += var3;
      }

      this.ar();
   }

   void bt(int var1, int var2, int var3) {
      this.am = new int[var1];
      this.at = new int[var1];
      this.au = new int[var1];
      this.ao = new int[var2];
      this.af = new int[var2];
      this.ar = new int[var2];
      this.ab = new int[var2];
      this.az = new int[var2];
      this.ag = new int[var2];
      if (var3 > 0) {
         this.aa = new int[var3];
         this.ah = new int[var3];
         this.bh = new int[var3];
      }

   }

   public void dy(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ae; ++var4) {
         int[] var10000 = this.am;
         var10000[var4] += var1;
         var10000 = this.at;
         var10000[var4] += var2;
         var10000 = this.au;
         var10000[var4] += var3;
      }

      this.ar();
   }

   public void do(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ae; ++var4) {
         this.am[var4] = this.am[var4] * var1 / 943535654;
         this.at[var4] = this.at[var4] * var2 / 1047075929;
         this.au[var4] = this.au[var4] * var3 / 128;
      }

      this.ar();
   }

   void bs(int var1, int var2, int var3) {
      this.am = new int[var1];
      this.at = new int[var1];
      this.au = new int[var1];
      this.ao = new int[var2];
      this.af = new int[var2];
      this.ar = new int[var2];
      this.ab = new int[var2];
      this.az = new int[var2];
      this.ag = new int[var2];
      if (var3 > 0) {
         this.aa = new int[var3];
         this.ah = new int[var3];
         this.bh = new int[var3];
      }

   }

   void ad(jx var1, int var2) {
      this.bu(var1, var2);
   }

   final void er(int var1) {
      if (bt[var1]) {
         this.br(var1);
      } else {
         int var2 = this.ao[var1];
         int var3 = this.af[var1];
         int var4 = this.ar[var1];
         jm.as.ap = bu[var1];
         if (this.ac == null) {
            jm.as.ak = 0;
         } else {
            jm.as.ak = (this.ac[var1] == -1 ? 253 : this.ac[var1]) & 255;
         }

         this.by(var1, bm[var2], bm[var3], bm[var4], bs[var2], bs[var3], bs[var4], bo[var2], bo[var3], bo[var4], this.ab[var1], this.az[var1], this.ag[var1]);
      }
   }

   public final void di(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.bq != 2) {
         this.at();
      }

      int var8 = jm.as();
      int var9 = jm.ae();
      int var10 = cx[var1];
      int var11 = cz[var1];
      int var12 = cx[var2];
      int var13 = cz[var2];
      int var14 = cx[var3];
      int var15 = cz[var3];
      int var16 = cx[var4];
      int var17 = cz[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.ae; ++var19) {
         int var20 = this.am[var19];
         int var21 = this.at[var19];
         int var22 = this.au[var19];
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
         bd[var19] = var22 - var18;
         bs[var19] = var8 + var20 * jm.ao() / var22;
         bm[var19] = var9 + var23 * jm.ao() / var22;
         bo[var19] = hl.ak(var22, 1261288518);
         if (this.ax != null) {
            ba[var19] = var20;
            bw[var19] = var23;
            bi[var19] = var22;
         }
      }

      try {
         this.bp(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   public final void dn(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.bq != 2) {
         this.at();
      }

      int var9 = jm.as();
      int var10 = jm.ae();
      int var11 = cx[var1];
      int var12 = cz[var1];
      int var13 = cx[var2];
      int var14 = cz[var2];
      int var15 = cx[var3];
      int var16 = cz[var3];
      int var17 = cx[var4];
      int var18 = cz[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.ae; ++var20) {
         int var21 = this.am[var20];
         int var22 = this.at[var20];
         int var23 = this.au[var20];
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
         bd[var20] = var23 - var19;
         bs[var20] = var9 + var21 * jm.ao() / var8;
         bm[var20] = var10 + var24 * jm.ao() / var8;
         bo[var20] = hl.ak(var8, 1261288518);
         if (this.ax != null) {
            ba[var20] = var21;
            bw[var20] = var24;
            bi[var20] = var23;
         }
      }

      try {
         this.bp(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   boolean bc(int var1) {
      return this.cs > 0 && var1 < this.cr;
   }

   void dg(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         cp = 0;
         cv = 0;
         cy = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if (var18 < this.bj.length) {
               int[] var19 = this.bj[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  cp += this.am[var12];
                  cv += this.at[var12];
                  cy += this.au[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            cp = cp / var7 + var3;
            cv = cv / var7 + var4;
            cy = cy / var7 + var5;
         } else {
            cp = var3;
            cv = var4;
            cy = var5;
         }

      } else {
         int[] var9;
         int var10;
         int[] var10000;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bj.length) {
                  var9 = this.bj[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.am;
                     var10000[var11] += var3;
                     var10000 = this.at;
                     var10000[var11] += var4;
                     var10000 = this.au;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bj.length) {
                  var9 = this.bj[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.am;
                     var10000[var11] -= cp;
                     var10000 = this.at;
                     var10000[var11] -= cv;
                     var10000 = this.au;
                     var10000[var11] -= cy;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 565222462) * 8;
                     int var14 = (var5 & -1520517728) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = cx[var14];
                        var16 = cz[var14];
                        var17 = this.at[var11] * var15 + this.am[var11] * var16 >> 16;
                        this.at[var11] = this.at[var11] * var16 - this.am[var11] * var15 >> 16;
                        this.am[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = cx[var12];
                        var16 = cz[var12];
                        var17 = this.at[var11] * var16 - this.au[var11] * var15 >> 16;
                        this.au[var11] = this.at[var11] * var15 + this.au[var11] * var16 >> 16;
                        this.at[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = cx[var13];
                        var16 = cz[var13];
                        var17 = this.au[var11] * var15 + this.am[var11] * var16 >> 16;
                        this.au[var11] = this.au[var11] * var16 - this.am[var11] * var15 >> 16;
                        this.am[var11] = var17;
                     }

                     var10000 = this.am;
                     var10000[var11] += cp;
                     var10000 = this.at;
                     var10000[var11] += cv;
                     var10000 = this.au;
                     var10000[var11] += cy;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bj.length) {
                  var9 = this.bj[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.am;
                     var10000[var11] -= cp;
                     var10000 = this.at;
                     var10000[var11] -= cv;
                     var10000 = this.au;
                     var10000[var11] -= cy;
                     this.am[var11] = this.am[var11] * var3 / 128;
                     this.at[var11] = this.at[var11] * var4 / 128;
                     this.au[var11] = this.au[var11] * var5 / 128;
                     var10000 = this.am;
                     var10000[var11] += cp;
                     var10000 = this.at;
                     var10000[var11] += cv;
                     var10000 = this.au;
                     var10000[var11] += cy;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.bv != null && this.ac != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.bv.length) {
                     var9 = this.bv[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.ac[var11] & 1982559666) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > 255) {
                           var12 = 255;
                        }

                        this.ac[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   boolean eh(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      bd[var1] = var4 - var5;
      if (var8) {
         ba[var1] = var2;
         bw[var1] = var3;
         bi[var1] = var4;
      }

      if (var4 >= -1659983008) {
         bs[var1] = var6 + var2 * jm.ao() / var4;
         bm[var1] = var7 + var3 * jm.ao() / var4;
         bo[var1] = hl.ak(var4, 1261288518);
         return false;
      } else {
         bs[var1] = -1208338674;
         return true;
      }
   }

   boolean ez(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      bd[var1] = var4 - var5;
      if (var8) {
         ba[var1] = var2;
         bw[var1] = var3;
         bi[var1] = var4;
      }

      if (var4 >= 50) {
         bs[var1] = var6 + var2 * jm.ao() / var4;
         bm[var1] = var7 + var3 * jm.ao() / var4;
         bo[var1] = hl.ak(var4, 1261288518);
         return false;
      } else {
         bs[var1] = -5000;
         return true;
      }
   }

   final void ey(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.bc < 6000) {
         int var6;
         for(var6 = 0; var6 < this.bc; ++var6) {
            bg[var6] = 0;
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
         for(char var7 = 0; var7 < this.an; ++var7) {
            if (this.ag[var7] != -2) {
               var8 = this.ao[var7];
               var9 = this.af[var7];
               var10 = this.ar[var7];
               var11 = bs[var8];
               var12 = bs[var9];
               var13 = bs[var10];
               int var14;
               if (var1 && (var11 == 359001957 || var12 == -5000 || var13 == -5000)) {
                  var14 = ba[var8];
                  var15 = ba[var9];
                  var16 = ba[var10];
                  int var17 = bw[var8];
                  var18 = bw[var9];
                  int var19 = bw[var10];
                  int var20 = bi[var8];
                  int var21 = bi[var9];
                  int var22 = bi[var10];
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
                     bt[var7] = true;
                     int var26 = (bd[var8] + bd[var9] + bd[var10]) / 3 + this.by;
                     bl[var26][bg[var26]++] = var7;
                  }
               } else {
                  if (var2 && aq.ab(bm[var8], bm[var9], bm[var10], var11, var12, var13, var6, (byte)123)) {
                     ix.au(var4);
                     var2 = false;
                  }

                  if ((var11 - var12) * (bm[var10] - bm[var9]) - (bm[var8] - bm[var9]) * (var13 - var12) > 0) {
                     bt[var7] = false;
                     var14 = jm.af();
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var14 && var12 <= var14 && var13 <= var14) {
                        bu[var7] = false;
                     } else {
                        bu[var7] = true;
                     }

                     var15 = (bd[var8] + bd[var9] + bd[var10]) / 3 + this.by;
                     bl[var15][bg[var15]++] = var7;
                  }
               }
            }
         }

         int var27;
         char var28;
         char[] var29;
         if (this.ad == null) {
            for(var27 = this.bc - 1; var27 >= 0; --var27) {
               var28 = bg[var27];
               if (var28 > 0) {
                  var29 = bl[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     this.bz(var29[var10]);
                  }
               }
            }

         } else {
            for(var27 = 0; var27 < 12; ++var27) {
               be[var27] = 0;
               ci[var27] = 0;
            }

            for(var27 = this.bc - 1; var27 >= 0; --var27) {
               var28 = bg[var27];
               if (var28 > 0) {
                  var29 = bl[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     char var30 = var29[var10];
                     byte var31 = this.ad[var30];
                     var13 = be[var31]++;
                     cq[var31][var13] = var30;
                     if (var31 < 10) {
                        int[] var34 = ci;
                        var34[var31] += var27;
                     } else if (var31 == 10) {
                        cb[var13] = var27;
                     } else {
                        cd[var13] = var27;
                     }
                  }
               }
            }

            var27 = 0;
            if (be[1] > 0 || be[2] > 0) {
               var27 = (ci[1] + ci[2]) / (be[1] + be[2]);
            }

            var8 = 0;
            if (be[3] > 0 || be[4] > 0) {
               var8 = (ci[3] + ci[4]) / (be[3] + be[4]);
            }

            var9 = 0;
            if (be[6] > 0 || be[8] > 0) {
               var9 = (ci[6] + ci[8]) / (be[6] + be[8]);
            }

            var11 = 0;
            var12 = be[10];
            int[] var32 = cq[10];
            int[] var33 = cb;
            if (var11 == var12) {
               var11 = 0;
               var12 = be[11];
               var32 = cq[11];
               var33 = cd;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var27) {
                  this.bz(var32[var11++]);
                  if (var11 == var12 && var32 != cq[11]) {
                     var11 = 0;
                     var12 = be[11];
                     var32 = cq[11];
                     var33 = cd;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = 961376255;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.bz(var32[var11++]);
                  if (var11 == var12 && var32 != cq[11]) {
                     var11 = 0;
                     var12 = be[11];
                     var32 = cq[11];
                     var33 = cd;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = 633607326;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.bz(var32[var11++]);
                  if (var11 == var12 && var32 != cq[11]) {
                     var11 = 0;
                     var12 = be[11];
                     var32 = cq[11];
                     var33 = cd;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = be[var15];
               int[] var35 = cq[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.bz(var35[var18]);
               }
            }

            while(var10 != -1000) {
               this.bz(var32[var11++]);
               if (var11 == var12 && var32 != cq[11]) {
                  var11 = 0;
                  var32 = cq[11];
                  var12 = be[11];
                  var33 = cd;
               }

               if (var11 < var12) {
                  var10 = var33[var11];
               } else {
                  var10 = 565105643;
               }
            }

         }
      }
   }

   public void dq(ja var1, int var2, ja var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            jg var6 = var1.ap[var2];
            jg var7 = var3.ap[var4];
            jt var8 = var6.ai;
            cp = 0;
            cv = 0;
            cy = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.ay; ++var11) {
               for(var12 = var6.as[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 != var10 || var8.ae[var12] == 0) {
                  this.aq(var8.ae[var12], var8.am[var12], var6.ae[var11], var6.am[var11], var6.at[var11]);
               }
            }

            cp = 0;
            cv = 0;
            cy = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.ay; ++var11) {
               for(var12 = var7.as[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 == var10 || var8.ae[var12] == 0) {
                  this.aq(var8.ae[var12], var8.am[var12], var7.ae[var11], var7.am[var11], var7.at[var11]);
               }
            }

            this.ar();
         } else {
            this.ab(var1, var2);
         }
      }
   }

   final void ek(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.bc < -1038614823) {
         int var6;
         for(var6 = 0; var6 < this.bc; ++var6) {
            bg[var6] = 0;
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
         for(char var7 = 0; var7 < this.an; ++var7) {
            if (this.ag[var7] != -2) {
               var8 = this.ao[var7];
               var9 = this.af[var7];
               var10 = this.ar[var7];
               var11 = bs[var8];
               var12 = bs[var9];
               var13 = bs[var10];
               int var14;
               if (var1 && (var11 == -5000 || var12 == 1830623625 || var13 == -5000)) {
                  var14 = ba[var8];
                  var15 = ba[var9];
                  var16 = ba[var10];
                  int var17 = bw[var8];
                  var18 = bw[var9];
                  int var19 = bw[var10];
                  int var20 = bi[var8];
                  int var21 = bi[var9];
                  int var22 = bi[var10];
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
                     bt[var7] = true;
                     int var26 = (bd[var8] + bd[var9] + bd[var10]) / 3 + this.by;
                     bl[var26][bg[var26]++] = var7;
                  }
               } else {
                  if (var2 && aq.ab(bm[var8], bm[var9], bm[var10], var11, var12, var13, var6, (byte)124)) {
                     ix.au(var4);
                     var2 = false;
                  }

                  if ((var11 - var12) * (bm[var10] - bm[var9]) - (bm[var8] - bm[var9]) * (var13 - var12) > 0) {
                     bt[var7] = false;
                     var14 = jm.af();
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var14 && var12 <= var14 && var13 <= var14) {
                        bu[var7] = false;
                     } else {
                        bu[var7] = true;
                     }

                     var15 = (bd[var8] + bd[var9] + bd[var10]) / 3 + this.by;
                     bl[var15][bg[var15]++] = var7;
                  }
               }
            }
         }

         int var27;
         char var28;
         char[] var29;
         if (this.ad == null) {
            for(var27 = this.bc - 1; var27 >= 0; --var27) {
               var28 = bg[var27];
               if (var28 > 0) {
                  var29 = bl[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     this.bz(var29[var10]);
                  }
               }
            }

         } else {
            for(var27 = 0; var27 < 12; ++var27) {
               be[var27] = 0;
               ci[var27] = 0;
            }

            for(var27 = this.bc - 1; var27 >= 0; --var27) {
               var28 = bg[var27];
               if (var28 > 0) {
                  var29 = bl[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     char var30 = var29[var10];
                     byte var31 = this.ad[var30];
                     var13 = be[var31]++;
                     cq[var31][var13] = var30;
                     if (var31 < 10) {
                        int[] var34 = ci;
                        var34[var31] += var27;
                     } else if (var31 == 10) {
                        cb[var13] = var27;
                     } else {
                        cd[var13] = var27;
                     }
                  }
               }
            }

            var27 = 0;
            if (be[1] > 0 || be[2] > 0) {
               var27 = (ci[1] + ci[2]) / (be[1] + be[2]);
            }

            var8 = 0;
            if (be[3] > 0 || be[4] > 0) {
               var8 = (ci[3] + ci[4]) / (be[3] + be[4]);
            }

            var9 = 0;
            if (be[6] > 0 || be[8] > 0) {
               var9 = (ci[6] + ci[8]) / (be[6] + be[8]);
            }

            var11 = 0;
            var12 = be[10];
            int[] var32 = cq[10];
            int[] var33 = cb;
            if (var11 == var12) {
               var11 = 0;
               var12 = be[11];
               var32 = cq[11];
               var33 = cd;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -662204191;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var27) {
                  this.bz(var32[var11++]);
                  if (var11 == var12 && var32 != cq[11]) {
                     var11 = 0;
                     var12 = be[11];
                     var32 = cq[11];
                     var33 = cd;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.bz(var32[var11++]);
                  if (var11 == var12 && var32 != cq[11]) {
                     var11 = 0;
                     var12 = be[11];
                     var32 = cq[11];
                     var33 = cd;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.bz(var32[var11++]);
                  if (var11 == var12 && var32 != cq[11]) {
                     var11 = 0;
                     var12 = be[11];
                     var32 = cq[11];
                     var33 = cd;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = 1625409004;
                  }
               }

               var16 = be[var15];
               int[] var35 = cq[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.bz(var35[var18]);
               }
            }

            while(var10 != -1000) {
               this.bz(var32[var11++]);
               if (var11 == var12 && var32 != cq[11]) {
                  var11 = 0;
                  var32 = cq[11];
                  var12 = be[11];
                  var33 = cd;
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

   void at() {
      if (this.bq != 2) {
         this.bq = 2;
         this.bz = 0;

         for(int var1 = 0; var1 < this.ae; ++var1) {
            int var2 = this.am[var1];
            int var3 = this.at[var1];
            int var4 = this.au[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.bz) {
               this.bz = var5;
            }
         }

         this.bz = (int)(Math.sqrt((double)this.bz) + 0.99D);
         this.by = this.bz;
         this.bc = this.bz + this.bz;
      }
   }

   final void en(int var1) {
      if (bt[var1]) {
         this.br(var1);
      } else {
         int var2 = this.ao[var1];
         int var3 = this.af[var1];
         int var4 = this.ar[var1];
         jm.as.ap = bu[var1];
         if (this.ac == null) {
            jm.as.ak = 0;
         } else {
            jm.as.ak = (this.ac[var1] == -1 ? 253 : this.ac[var1]) & 255;
         }

         this.by(var1, bm[var2], bm[var3], bm[var4], bs[var2], bs[var3], bs[var4], bo[var2], bo[var3], bo[var4], this.ab[var1], this.az[var1], this.ag[var1]);
      }
   }

   boolean ef(int var1) {
      return this.cs > 0 && var1 < this.cr;
   }

   boolean em(int var1) {
      return this.cs > 0 && var1 < this.cr;
   }

   boolean ed(int var1) {
      return this.cs > 0 && var1 < this.cr;
   }

   final void ep(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      if (this.ax != null && this.ax[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.av != null && this.av[var1] != -1) {
            int var17 = this.av[var1] & -1655783742;
            var18 = this.aa[var17];
            var15 = this.ah[var17];
            var16 = this.bh[var17];
         } else {
            var18 = this.ao[var1];
            var15 = this.af[var1];
            var16 = this.ar[var1];
         }

         if (this.ag[var1] == -1) {
            jm.aq(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, ba[var18], ba[var15], ba[var16], bw[var18], bw[var15], bw[var16], bi[var18], bi[var15], bi[var16], this.ax[var1]);
         } else {
            jm.aq(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, ba[var18], ba[var15], ba[var16], bw[var18], bw[var15], bw[var16], bi[var18], bi[var15], bi[var16], this.ax[var1]);
         }
      } else {
         boolean var14 = this.bc(var1);
         if (this.ag[var1] == -1 && var14) {
            jm.ah(var2, var3, var4, var5, var6, var7, var8, var9, var10, ch[this.ab[var1]], this.cm, this.cw, this.ca, this.cs);
         } else if (this.ag[var1] == -1) {
            jm.ax(var2, var3, var4, var5, var6, var7, var8, var9, var10, ch[this.ab[var1]]);
         } else if (var14) {
            jm.aa(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.cm, this.cw, this.ca, this.cs);
         } else {
            jm.av(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }

   }

   final void ex(int var1) {
      int var2 = jm.as();
      int var3 = jm.ae();
      int var4 = 0;
      int var5 = this.ao[var1];
      int var6 = this.af[var1];
      int var7 = this.ar[var1];
      int var8 = bi[var5];
      int var9 = bi[var6];
      int var10 = bi[var7];
      if (this.ac == null) {
         jm.as.ak = 0;
      } else {
         jm.as.ak = this.ac[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         cn[var4] = bs[var5];
         co[var4] = bm[var5];
         cl[var4] = bo[var7];
         cf[var4++] = this.ab[var1];
      } else {
         var11 = ba[var5];
         var12 = bw[var5];
         var13 = this.ab[var1];
         if (var10 >= 501815754) {
            var14 = (1815653901 - var8) * ct[var10 - var8];
            cn[var4] = var2 + (var11 + ((ba[var7] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var7] - var12) * var14 >> 16)) * jm.ao() / 469266143;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.ag[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (-969394582 - var8) * ct[var9 - var8];
            cn[var4] = var2 + (var11 + ((ba[var6] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var6] - var12) * var14 >> 16)) * jm.ao() / 50;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= -1484268595) {
         cn[var4] = bs[var6];
         co[var4] = bm[var6];
         cl[var4] = bo[var7];
         cf[var4++] = this.az[var1];
      } else {
         var11 = ba[var6];
         var12 = bw[var6];
         var13 = this.az[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * ct[var8 - var9];
            cn[var4] = var2 + (var11 + ((ba[var5] - var11) * var14 >> 16)) * jm.ao() / -25514341;
            co[var4] = var3 + (var12 + ((bw[var5] - var12) * var14 >> 16)) * jm.ao() / 50;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.ab[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * ct[var10 - var9];
            cn[var4] = var2 + (var11 + ((ba[var7] - var11) * var14 >> 16)) * jm.ao() / 282023761;
            co[var4] = var3 + (var12 + ((bw[var7] - var12) * var14 >> 16)) * jm.ao() / 50;
            cf[var4++] = var13 + ((this.ag[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 1842265809) {
         cn[var4] = bs[var7];
         co[var4] = bm[var7];
         cl[var4] = bo[var7];
         cf[var4++] = this.ag[var1];
      } else {
         var11 = ba[var7];
         var12 = bw[var7];
         var13 = this.ag[var1];
         if (var9 >= 1637024570) {
            var14 = (50 - var10) * ct[var9 - var10];
            cn[var4] = var2 + (var11 + ((ba[var6] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var6] - var12) * var14 >> 16)) * jm.ao() / -1562554037;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }

         if (var8 >= -1102228680) {
            var14 = (50 - var10) * ct[var8 - var10];
            cn[var4] = var2 + (var11 + ((ba[var5] - var11) * var14 >> 16)) * jm.ao() / 1639189965;
            co[var4] = var3 + (var12 + ((bw[var5] - var12) * var14 >> 16)) * jm.ao() / 50;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.ab[var1] - var13) * var14 >> 16);
         }
      }

      var11 = cn[0];
      var12 = cn[1];
      var13 = cn[2];
      var14 = co[0];
      int var15 = co[1];
      int var16 = co[2];
      float var17 = cl[0];
      float var18 = cl[1];
      float var19 = cl[2];
      jm.as.ap = false;
      int var20 = jm.af();
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            jm.as.ap = true;
         }

         this.by(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, cf[0], cf[1], cf[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || cn[3] < 0 || cn[3] > var20) {
            jm.as.ap = true;
         }

         int var22;
         if (this.ax != null && this.ax[var1] != -1) {
            int var23;
            int var25;
            if (this.av != null && this.av[var1] != -1) {
               int var24 = this.av[var1] & 255;
               var25 = this.aa[var24];
               var22 = this.ah[var24];
               var23 = this.bh[var24];
            } else {
               var25 = var5;
               var22 = var6;
               var23 = var7;
            }

            short var26 = this.ax[var1];
            if (this.ag[var1] == -1) {
               jm.aq(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.ab[var1], this.ab[var1], this.ab[var1], ba[var25], ba[var22], ba[var23], bw[var25], bw[var22], bw[var23], bi[var25], bi[var22], bi[var23], var26);
               jm.aq(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], this.ab[var1], this.ab[var1], this.ab[var1], ba[var25], ba[var22], ba[var23], bw[var25], bw[var22], bw[var23], bi[var25], bi[var22], bi[var23], var26);
            } else {
               jm.aq(var14, var15, var16, var11, var12, var13, var17, var18, var19, cf[0], cf[1], cf[2], ba[var25], ba[var22], ba[var23], bw[var25], bw[var22], bw[var23], bi[var25], bi[var22], bi[var23], var26);
               jm.aq(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], cf[0], cf[2], cf[3], ba[var25], ba[var22], ba[var23], bw[var25], bw[var22], bw[var23], bi[var25], bi[var22], bi[var23], var26);
            }
         } else {
            boolean var21 = this.bc(var1);
            if (this.ag[var1] == -1 && var21) {
               var22 = ch[this.ab[var1]];
               jm.ah(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.cm, this.cw, this.ca, this.cs);
               jm.ah(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], var22, this.cm, this.cw, this.ca, this.cs);
            } else if (this.ag[var1] == -1) {
               var22 = ch[this.ab[var1]];
               jm.ax(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
               jm.ax(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], var22);
            } else if (var21) {
               jm.aa(var14, var15, var16, var11, var12, var13, var17, var18, var19, cf[0], cf[1], cf[2], this.cm, this.ca, this.cw, this.cs);
               jm.aa(var14, var16, co[3], var11, var13, cn[3], 0.0F, 0.0F, 0.0F, cf[0], cf[2], cf[3], this.cm, this.ca, this.cw, this.cs);
            } else {
               jm.av(var14, var15, var16, var11, var12, var13, var17, var18, var19, cf[0], cf[1], cf[2]);
               jm.av(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], cf[0], cf[2], cf[3]);
            }
         }
      }

   }

   final void ej(int var1) {
      int var2 = jm.as();
      int var3 = jm.ae();
      int var4 = 0;
      int var5 = this.ao[var1];
      int var6 = this.af[var1];
      int var7 = this.ar[var1];
      int var8 = bi[var5];
      int var9 = bi[var6];
      int var10 = bi[var7];
      if (this.ac == null) {
         jm.as.ak = 0;
      } else {
         jm.as.ak = this.ac[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         cn[var4] = bs[var5];
         co[var4] = bm[var5];
         cl[var4] = bo[var7];
         cf[var4++] = this.ab[var1];
      } else {
         var11 = ba[var5];
         var12 = bw[var5];
         var13 = this.ab[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * ct[var10 - var8];
            cn[var4] = var2 + (var11 + ((ba[var7] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var7] - var12) * var14 >> 16)) * jm.ao() / 50;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.ag[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * ct[var9 - var8];
            cn[var4] = var2 + (var11 + ((ba[var6] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var6] - var12) * var14 >> 16)) * jm.ao() / 50;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         cn[var4] = bs[var6];
         co[var4] = bm[var6];
         cl[var4] = bo[var7];
         cf[var4++] = this.az[var1];
      } else {
         var11 = ba[var6];
         var12 = bw[var6];
         var13 = this.az[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * ct[var8 - var9];
            cn[var4] = var2 + (var11 + ((ba[var5] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var5] - var12) * var14 >> 16)) * jm.ao() / 50;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.ab[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * ct[var10 - var9];
            cn[var4] = var2 + (var11 + ((ba[var7] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var7] - var12) * var14 >> 16)) * jm.ao() / 50;
            cf[var4++] = var13 + ((this.ag[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         cn[var4] = bs[var7];
         co[var4] = bm[var7];
         cl[var4] = bo[var7];
         cf[var4++] = this.ag[var1];
      } else {
         var11 = ba[var7];
         var12 = bw[var7];
         var13 = this.ag[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * ct[var9 - var10];
            cn[var4] = var2 + (var11 + ((ba[var6] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var6] - var12) * var14 >> 16)) * jm.ao() / 50;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.az[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * ct[var8 - var10];
            cn[var4] = var2 + (var11 + ((ba[var5] - var11) * var14 >> 16)) * jm.ao() / 50;
            co[var4] = var3 + (var12 + ((bw[var5] - var12) * var14 >> 16)) * jm.ao() / 50;
            cl[var4] = cj;
            cf[var4++] = var13 + ((this.ab[var1] - var13) * var14 >> 16);
         }
      }

      var11 = cn[0];
      var12 = cn[1];
      var13 = cn[2];
      var14 = co[0];
      int var15 = co[1];
      int var16 = co[2];
      float var17 = cl[0];
      float var18 = cl[1];
      float var19 = cl[2];
      jm.as.ap = false;
      int var20 = jm.af();
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            jm.as.ap = true;
         }

         this.by(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, cf[0], cf[1], cf[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || cn[3] < 0 || cn[3] > var20) {
            jm.as.ap = true;
         }

         int var22;
         if (this.ax != null && this.ax[var1] != -1) {
            int var23;
            int var25;
            if (this.av != null && this.av[var1] != -1) {
               int var24 = this.av[var1] & 255;
               var25 = this.aa[var24];
               var22 = this.ah[var24];
               var23 = this.bh[var24];
            } else {
               var25 = var5;
               var22 = var6;
               var23 = var7;
            }

            short var26 = this.ax[var1];
            if (this.ag[var1] == -1) {
               jm.aq(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.ab[var1], this.ab[var1], this.ab[var1], ba[var25], ba[var22], ba[var23], bw[var25], bw[var22], bw[var23], bi[var25], bi[var22], bi[var23], var26);
               jm.aq(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], this.ab[var1], this.ab[var1], this.ab[var1], ba[var25], ba[var22], ba[var23], bw[var25], bw[var22], bw[var23], bi[var25], bi[var22], bi[var23], var26);
            } else {
               jm.aq(var14, var15, var16, var11, var12, var13, var17, var18, var19, cf[0], cf[1], cf[2], ba[var25], ba[var22], ba[var23], bw[var25], bw[var22], bw[var23], bi[var25], bi[var22], bi[var23], var26);
               jm.aq(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], cf[0], cf[2], cf[3], ba[var25], ba[var22], ba[var23], bw[var25], bw[var22], bw[var23], bi[var25], bi[var22], bi[var23], var26);
            }
         } else {
            boolean var21 = this.bc(var1);
            if (this.ag[var1] == -1 && var21) {
               var22 = ch[this.ab[var1]];
               jm.ah(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.cm, this.cw, this.ca, this.cs);
               jm.ah(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], var22, this.cm, this.cw, this.ca, this.cs);
            } else if (this.ag[var1] == -1) {
               var22 = ch[this.ab[var1]];
               jm.ax(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
               jm.ax(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], var22);
            } else if (var21) {
               jm.aa(var14, var15, var16, var11, var12, var13, var17, var18, var19, cf[0], cf[1], cf[2], this.cm, this.ca, this.cw, this.cs);
               jm.aa(var14, var16, co[3], var11, var13, cn[3], 0.0F, 0.0F, 0.0F, cf[0], cf[2], cf[3], this.cm, this.ca, this.cw, this.cs);
            } else {
               jm.av(var14, var15, var16, var11, var12, var13, var17, var18, var19, cf[0], cf[1], cf[2]);
               jm.av(var14, var16, co[3], var11, var13, cn[3], var17, var19, cl[3], cf[0], cf[2], cf[3]);
            }
         }
      }

   }

   void ei(int var1, qs var2) {
      float var3 = (float)this.am[var1];
      float var4 = (float)(-this.at[var1]);
      float var5 = (float)(-this.au[var1]);
      float var6 = 1.0F;
      this.am[var1] = (int)(var2.ai[0] * var3 + var2.ai[4] * var4 + var2.ai[8] * var5 + var2.ai[12] * var6);
      this.at[var1] = -((int)(var2.ai[1] * var3 + var2.ai[5] * var4 + var2.ai[9] * var5 + var2.ai[13] * var6));
      this.au[var1] = -((int)(var2.ai[2] * var3 + var2.ai[6] * var4 + var2.ai[10] * var5 + var2.ai[14] * var6));
   }

   void ew(int var1, qs var2) {
      float var3 = (float)this.am[var1];
      float var4 = (float)(-this.at[var1]);
      float var5 = (float)(-this.au[var1]);
      float var6 = 1.0F;
      this.am[var1] = (int)(var2.ai[0] * var3 + var2.ai[4] * var4 + var2.ai[8] * var5 + var2.ai[12] * var6);
      this.at[var1] = -((int)(var2.ai[1] * var3 + var2.ai[5] * var4 + var2.ai[9] * var5 + var2.ai[13] * var6));
      this.au[var1] = -((int)(var2.ai[2] * var3 + var2.ai[6] * var4 + var2.ai[10] * var5 + var2.ai[14] * var6));
   }

   jy() {
   }

   void eq(jx var1, int var2) {
      if (this.bx != null) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            int[] var4 = this.bx[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.bk[var3];
               ai.ae((byte)59);

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  fw var8 = var1.ak(var7, 1241267200);
                  if (var8 != null) {
                     ay.at((float)var5[var6] / 255.0F, -1332999173);
                     as.am(var8.ae(var2, 846400528), -1650103875);
                     as.ao(ay, 1314664374);
                     ai.an(as, -1499118534);
                  }
               }

               this.bn(var3, ai);
            }
         }

      }
   }

   public void dl() {
      for(int var1 = 0; var1 < this.ae; ++var1) {
         int var2 = this.am[var1];
         this.am[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.ar();
   }

   void es(jx var1, int var2) {
      if (this.bx != null) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            int[] var4 = this.bx[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.bk[var3];
               ai.ae((byte)97);

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  fw var8 = var1.ak(var7, 1259788391);
                  if (var8 != null) {
                     ay.at((float)var5[var6] / 255.0F, 1129907259);
                     as.am(var8.ae(var2, 1565113504), -1650103875);
                     as.ao(ay, 827969839);
                     ai.an(as, -1552649240);
                  }
               }

               this.bn(var3, ai);
            }
         }

      }
   }
}
