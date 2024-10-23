import java.util.BitSet;

public class jh extends ju {
   int be;
   int aj;
   public int ag;
   int am;
   int bg;
   int aq;
   int[][][] af;
   je[][][] at;
   int au = 0;
   int ar = 0;
   int bl;
   int[][][] ad;
   static final int ah = 128;
   static final int ap = 64;
   static final int ab = 25;
   boolean br;
   int bj;
   int ai = 0;
   int dj;
   int bp;
   int ay;
   static final int az = 90;
   public int av;
   final int ac;
   int an;
   int ak;
   int bn;
   int bh;
   static final int bo = 32;
   static final int[] cj = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
   int bf;
   int bm;
   BitSet cs;
   int bw;
   int ba;
   static final int bv = 128;
   int bd;
   kc[] al = new kc[5000];
   boolean bb;
   int[] bq;
   in ao;
   final int dk;
   static final int aa = 50;
   public int bu;
   public static boolean ae = false;
   public static final int co = 383;
   static final int[] cf = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   int bt;
   public static final int cv = 32;
   jz[][] bk;
   static final int[] ch = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   jz[] bc;
   pk cn;
   int cl;
   int bs;
   static final int[] cu = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
   static final int[] cm = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
   int ax;
   static final int[] cx = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
   kc[] by;
   static final int[] ci = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
   BitSet cp;
   int cz;
   public static final int cg = 9;
   int[][] ct;
   int[][] cq;
   int[] cc;
   int bi;
   int cw;
   int cr;
   int aw;
   final int ca;
   int as;
   public static final int cy = 128;
   int bx;
   final int cd;
   final int ce;
   final int ck;
   BitSet dp;
   BitSet df;
   final int dv;
   final int dt;
   final int cb;
   int dl;
   int db;
   int dc;
   int dw;
   int de;
   int dx;
   public int bz;
   int do;

   public void am(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      jz var9 = new jz();
      var9.ac = var3 / 128 * 1891095351;
      var9.ae = var4 / 128 * 1064420549;
      var9.ag = var5 / 128 * -788570875;
      var9.am = var6 / 128 * 1806099511;
      var9.ax = var2 * -151437817;
      var9.aq = var3 * 2120924117;
      var9.af = var4 * 1271147915;
      var9.at = var5 * 1419189313;
      var9.au = var6 * 1199603535;
      var9.ar = var7 * 2093171565;
      var9.al = var8 * 1711109395;
      this.bk[var1][this.bq[var1]++] = var9;
   }

   public void ac() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.am; ++var1) {
         for(var2 = 0; var2 < this.ax; ++var2) {
            for(int var3 = 0; var3 < this.aq; ++var3) {
               this.at[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < this.bt; ++var1) {
         for(var2 = 0; var2 < this.bq[var1]; ++var2) {
            this.bk[var1][var2] = null;
         }

         this.bq[var1] = 0;
      }

      for(var1 = 0; var1 < this.ar; ++var1) {
         this.al[var1] = null;
      }

      this.ar = 0;

      for(var1 = 0; var1 < this.by.length; ++var1) {
         this.by[var1] = null;
      }

   }

   public void ae(int var1) {
      this.au = var1;

      for(int var2 = 0; var2 < this.ax; ++var2) {
         for(int var3 = 0; var3 < this.aq; ++var3) {
            if (this.at[var1][var2][var3] == null) {
               this.at[var1][var2][var3] = new je(var1, var2, var3);
            }
         }
      }

   }

   public void ag(int var1, int var2) {
      je var3 = this.at[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         je var5 = this.at[var4][var1][var2] = this.at[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.ac -= -1716693939;

            for(int var6 = 0; var6 < var5.al * 1838003371; ++var6) {
               kc var7 = var5.ad[var6];
               if (ce.ae(var7.ah * -4657194254713557903L) && var7.af * -2069611541 == var1 && var7.au * 64920415 == var2) {
                  var7.ac -= -547202725;
               }
            }
         }
      }

      if (this.at[0][var1][var2] == null) {
         this.at[0][var1][var2] = new je(0, var1, var2);
      }

      this.at[0][var1][var2].av = var3;
      this.at[3][var1][var2] = null;
   }

   public void em(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         var4.at = null;
      }
   }

   public void ax(int var1, int var2, int var3, int var4) {
      je var5 = this.at[var1][var2][var3];
      if (var5 != null) {
         this.at[var1][var2][var3].ab = var4 * -301602085;
      }
   }

   void fz(jv var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.ax) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.aq && (var9 >= var6 || var10 >= var8)) {
                  je var11 = this.at[var2][var9][var10];
                  if (var11 != null && var11.au != null && var11.au.am instanceof jv) {
                     int var12 = this.bb(var2, var9, var10, var2, var3, var4);
                     jv var13 = (jv)var11.au.am;
                     jv.ak(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }

   }

   int gl(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.bi(var1, var2, var3) - this.bi(var4, var5, var6);
   }

   public void at(int var1, int var2, int var3, int var4, ju var5, long var6, ju var8, ju var9) {
      ic var10 = new ic();
      var10.am = var5;
      var10.ae = var2 * 1658319744 + 829159872;
      var10.ag = var3 * 1312568448 + -1491199424;
      var10.ac = var4 * 239654531;
      var10.af = var6 * 3144815386490952633L;
      var10.ax = var8;
      var10.aq = var9;
      int var11 = 0;
      je var12 = this.at[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.al * 1838003371; ++var13) {
            if ((var12.ad[var13].ap * 876842249 & 256) == 256 && var12.ad[var13].ax instanceof jm) {
               jm var14 = (jm)var12.ad[var13].ax;
               var14.au();
               if (var14.ev * -1141910865 > var11) {
                  var11 = var14.ev * -1141910865;
               }
            }
         }
      }

      var10.at = var11 * 1598695711;
      if (this.at[var1][var2][var3] == null) {
         this.at[var1][var2][var3] = new je(var1, var2, var3);
      }

      this.at[var1][var2][var3].ar = var10;
   }

   public void au(int var1, int var2, int var3, int var4, ju var5, ju var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         ku var12 = new ku();
         var12.at = var9 * 3417452104574177759L;
         var12.au = var11 * 69663131;
         var12.ae = var2 * -586918784 + -293459392;
         var12.ag = var3 * 1962160512 + 981080256;
         var12.ac = var4 * -943036261;
         var12.aq = var5;
         var12.af = var6;
         var12.am = var7 * -1760765615;
         var12.ax = var8 * 2145959199;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.at[var13][var2][var3] == null) {
               this.at[var13][var2][var3] = new je(var13, var2, var3);
            }
         }

         this.at[var1][var2][var3].af = var12;
      }
   }

   public void ar(int var1, int var2, int var3, int var4, ju var5, ju var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         kg var14 = new kg();
         var14.ar = var11 * -1120798631125195889L;
         var14.al = var13 * 1328762619;
         var14.ae = var2 * -971582336 + -485791168;
         var14.ag = var3 * 1387577216 + -1453695040;
         var14.ac = var4 * 535902207;
         var14.at = var5;
         var14.au = var6;
         var14.am = var7 * 201243365;
         var14.ax = var8 * 1699594649;
         var14.aq = var9 * -1722050131;
         var14.af = var10 * 1409690205;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.at[var15][var2][var3] == null) {
               this.at[var15][var2][var3] = new je(var15, var2, var3);
            }
         }

         this.at[var1][var2][var3].at = var14;
      }
   }

   public boolean al(int var1, int var2, int var3, int var4, int var5, int var6, ju var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + 64 * var5;
         int var13 = var3 * 128 + 64 * var6;
         return this.ai(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public boolean az(int var1, int var2, int var3, int var4, int var5, ju var6, int var7, long var8, boolean var10) {
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
         return this.ai(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public boolean aa(int var1, int var2, int var3, int var4, int var5, ju var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.ai(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   boolean ai(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ju var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.ax || var16 >= this.aq) {
               return false;
            }

            je var17 = this.at[var1][var15][var16];
            if (var17 != null && var17.al * 1838003371 >= 5) {
               return false;
            }
         }
      }

      kc var21 = new kc();
      var21.ah = var12 * -5194667785432116079L;
      var21.ap = var14 * 433590585;
      var21.ac = var1 * -547202725;
      var21.ag = var6 * 342381637;
      var21.am = var7 * -231223533;
      var21.ae = var8 * -208494751;
      var21.ax = var9;
      var21.aq = var10 * -1753520005;
      var21.af = var2 * 1890063555;
      var21.au = var3 * -1649246049;
      var21.at = (var2 + var4 - 1) * 357561071;
      var21.ar = (var3 + var5 - 1) * -2070625925;

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
               if (this.at[var19][var16][var22] == null) {
                  this.at[var19][var16][var22] = new je(var19, var16, var22);
               }
            }

            je var23 = this.at[var1][var16][var22];
            var23.ad[var23.al * 1838003371] = var21;
            var23.ah[var23.al * 1838003371] = var18;
            var23.ap = (var23.ap * 1948448495 | var18) * -117114865;
            var23.al += -1668241917;
         }
      }

      if (var11) {
         this.al[this.ar++] = var21;
      }

      return true;
   }

   public void ao() {
      for(int var1 = 0; var1 < this.ar; ++var1) {
         kc var2 = this.al[var1];
         this.as(var2);
         this.al[var1] = null;
      }

      this.ar = 0;
   }

   public void aq(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      jl var21;
      int var22;
      if (var4 == 0) {
         var21 = new jl(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.at[var22][var2][var3] == null) {
               this.at[var22][var2][var3] = new je(var22, var2, var3);
            }
         }

         this.at[var1][var2][var3].ax = var21;
      } else if (var4 != 1) {
         jb var23 = new jb(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.at[var22][var2][var3] == null) {
               this.at[var22][var2][var3] = new je(var22, var2, var3);
            }
         }

         this.at[var1][var2][var3].aq = var23;
      } else {
         var21 = new jl(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.at[var22][var2][var3] == null) {
               this.at[var22][var2][var3] = new je(var22, var2, var3);
            }
         }

         this.at[var1][var2][var3].ax = var21;
      }
   }

   public void af(int var1, int var2, int var3, int var4, ju var5, long var6, int var8) {
      if (var5 != null) {
         jf var9 = new jf();
         var9.am = var5;
         var9.ae = var2 * 2035010176 + -1129978560;
         var9.ag = var3 * 1532065152 + 766032576;
         var9.ac = var4 * 1715334243;
         var9.ax = var6 * 672147525797760035L;
         var9.aq = var8 * -1174138709;
         if (this.at[var1][var2][var3] == null) {
            this.at[var1][var2][var3] = new je(var1, var2, var3);
         }

         this.at[var1][var2][var3].au = var9;
      }
   }

   void ji(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      qx var15 = new qx();
      var15.ae((float)((double)(-var2) * 0.0030679615D), (byte)-83);
      var15.ag((float)((double)(-var3) * 0.0030679615D), 1777903421);
      var15.ax((float)var7, (float)var8, (float)var9, -192405633);
      qf var16 = new qf();
      var16.az(var15, -290197586);
      var16.ai((byte)-20);
      int var17 = this.ag % 300;
      float var18 = (float)var17 / 300.0F * 6.283F;
      float var19 = (float)Math.sin((double)var18);
      float var20 = (float)Math.cos((double)var18);
      float var21 = var19 * 3.14159F / 100.0F;
      float var22 = var20 * 3.14159F / 100.0F;
      qh var23 = new qh();
      qf var24 = new qf();
      var23.ac = new qd((float)((double)var1 * 0.0030679615D), var21, var22);
      var23.ae = new qv((float)var4, (float)var5, (float)var6);
      qf var25 = new qf();
      var25.ap(var23, -1548305694);
      var25.ai((byte)-50);
      qh var26 = new qh();
      var26.ae = new qv((float)(-(this.ax * 64)), 0.0F, (float)(-(this.aq * 64)));
      qf var27 = new qf();
      var27.ap(var26, 317102395);
      var24.ao(1.0F, 1.0F, 1.0F, 1.0F, (short)-4902);
      var27.ah(var24, -2001086421);
      var24.ap(var23, -2098285316);
      var27.ah(var24, -2142754846);
      var27.ah(var16, -2004468100);
      this.bd = (int)var25.ay((float)var7, (float)var8, (float)var9, -2125951925);
      this.bx = (int)var25.aj((float)var7, (float)var8, (float)var9, 844691753);
      this.bf = (int)var25.av((float)var7, (float)var8, (float)var9, -138076238);
      this.bm = this.bd / 128;
      this.bs = this.bf / 128;
      this.bw = (int)var25.ay((float)var12, 0.0F, (float)var13, -2125951925) / 128;
      this.ba = (int)var25.av((float)var12, 0.0F, (float)var13, -760070298) / 128;
      ja var28 = new ja(var27);
      this.cq(var28, var14);
   }

   public void av(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         var4.at = null;
      }
   }

   public void aw(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.al * 1838003371; ++var5) {
            kc var6 = var4.ad[var5];
            if (ce.ae(var6.ah * -4657194254713557903L) && var6.af * -2069611541 == var2 && var6.au * 64920415 == var3) {
               this.as(var6);
               return;
            }
         }

      }
   }

   public void an(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         var4.au = null;
      }
   }

   public void ak(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         var4.ar = null;
      }
   }

   public ku bn(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 == null ? null : var4.af;
   }

   public kg bh(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 == null ? null : var4.at;
   }

   public void en(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.al * 1838003371; ++var5) {
            kc var6 = var4.ad[var5];
            if (ce.ae(var6.ah * -4657194254713557903L) && var6.af * -2069611541 == var2 && var6.au * 64920415 == var3) {
               this.as(var6);
               return;
            }
         }

      }
   }

   public jf bx(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 != null && var4.au != null ? var4.au : null;
   }

   public long bf(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 != null && var4.af != null ? var4.af.at * -8087086773214451169L : 0L;
   }

   int gd(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.bi(var1, var2, var3) - this.bi(var4, var5, var6);
   }

   boolean cn(int var1, int var2, int var3, int var4, boolean var5) {
      return this.be(this.dp, var1, var2, var3, var4, var5);
   }

   public void ay(int var1, int var2, int var3, int var4) {
      je var5 = this.at[var1][var2][var3];
      if (var5 != null) {
         kg var6 = var5.at;
         if (var6 != null) {
            var6.aq = var6.aq * 1050358309 * var4 / 16 * -1722050131;
            var6.af = var6.af * 640285173 * var4 / 16 * 1409690205;
         }
      }
   }

   public void aj(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         var4.af = null;
      }
   }

   public void bj(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.am; ++var4) {
         for(int var5 = 0; var5 < this.ax; ++var5) {
            for(int var6 = 0; var6 < this.aq; ++var6) {
               je var7 = this.at[var4][var5][var6];
               if (var7 != null) {
                  ku var8 = var7.af;
                  jv var10;
                  if (var8 != null && var8.aq instanceof jv) {
                     jv var9 = (jv)var8.aq;
                     this.by(var9, var4, var5, var6, 1, 1);
                     if (var8.af instanceof jv) {
                        var10 = (jv)var8.af;
                        this.by(var10, var4, var5, var6, 1, 1);
                        jv.ak(var9, var10, 0, 0, 0, false);
                        var8.af = var10.bn(var10.bs, var10.bw, var1, var2, var3);
                     }

                     var8.aq = var9.bn(var9.bs, var9.bw, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.al * 1838003371; ++var12) {
                     kc var14 = var7.ad[var12];
                     if (var14 != null && var14.ax instanceof jv) {
                        jv var11 = (jv)var14.ax;
                        this.by(var11, var4, var5, var6, var14.at * 1336638479 - var14.af * -2069611541 + 1, var14.ar * -153684557 - var14.au * 64920415 + 1);
                        var14.ax = var11.bn(var11.bs, var11.bw, var1, var2, var3);
                     }
                  }

                  jf var13 = var7.au;
                  if (var13 != null && var13.am instanceof jv) {
                     var10 = (jv)var13.am;
                     this.bp(var10, var4, var5, var6);
                     var13.am = var10.bn(var10.bs, var10.bw, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   void bp(jv var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.ax) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.aq && (var9 >= var6 || var10 >= var8)) {
                  je var11 = this.at[var2][var9][var10];
                  if (var11 != null && var11.au != null && var11.au.am instanceof jv) {
                     int var12 = this.bb(var2, var9, var10, var2, var3, var4);
                     jv var13 = (jv)var11.au.am;
                     jv.ak(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }

   }

   void by(jv var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.am) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.ax) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.aq && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        je var15 = this.at[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = this.bb(var12, var13, var14, var2, var3, var4);
                           ku var17 = var15.af;
                           if (var17 != null) {
                              jv var18;
                              if (var17.aq instanceof jv) {
                                 var18 = (jv)var17.aq;
                                 jv.ak(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.af instanceof jv) {
                                 var18 = (jv)var17.af;
                                 jv.ak(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.al * 1838003371; ++var23) {
                              kc var19 = var15.ad[var23];
                              if (var19 != null && var19.ax instanceof jv) {
                                 jv var20 = (jv)var19.ax;
                                 int var21 = var19.at * 1336638479 - var19.af * -2069611541 + 1;
                                 int var22 = var19.ar * -153684557 - var19.au * 64920415 + 1;
                                 jv.ak(var1, var20, (var19.af * -2069611541 - var3) * 128 + (var21 - var5) * 64, var16, (var19.au * 64920415 - var4) * 128 + (var22 - var6) * 64, var7);
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

   int bb(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.bi(var1, var2, var3) - this.bi(var4, var5, var6);
   }

   int bi(int var1, int var2, int var3) {
      return (this.af[var1][var2][var3] + this.af[var1][var2 + 1][var3] + this.af[var1][var2][var3 + 1] + this.af[var1][var2 + 1][var3 + 1]) / 4;
   }

   public void bg(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      je var7 = this.at[var4][var5][var6];
      if (var7 != null) {
         jl var8 = var7.ax;
         int var10;
         if (var8 != null) {
            int var18 = var8.af * 1616083007;
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
            jb var9 = var7.aq;
            if (var9 != null) {
               var10 = var9.ad;
               int var11 = var9.ah;
               int var12 = var9.ap;
               int var13 = var9.ab;
               int[] var14 = this.ct[var10];
               int[] var15 = this.cq[var11];
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

   public void bl(int var1) {
      this.ai = ef.at(25, 90, var1, -565314116);
      ji.ad(this.ai);
      if (this.cc != null && this.cc.length > 0) {
         this.cu(this.cc, this.cz, this.cw, this.cr, this.cl);
      }

   }

   public void bz(in var1) {
      if (var1 != this.ao) {
         this.ao = var1;
         this.cu(this.cc, this.cz, this.cw, this.cr, this.cl);
      }

   }

   public kg ec(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 == null ? null : var4.at;
   }

   boolean gh(int var1, int var2, int var3, int var4, boolean var5) {
      return this.br(this.cs, var1, var2, var3, var4, var5);
   }

   public boolean dg(int var1, int var2, int var3, int var4, int var5, int var6, ju var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * -664766505 + 64 * var5;
         int var13 = var3 * 661974230 + -1864074022 * var6;
         return this.ai(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   boolean bv(int var1, int var2, int var3, int var4, boolean var5) {
      return this.br(this.cs, var1, var2, var3, var4, var5);
   }

   boolean bt(int var1, int var2, int var3, int var4) {
      return this.bu(this.cp, var1, var2, var3, var4);
   }

   public void gj(int var1) {
      this.ai = ef.at(25, 90, var1, -565314116);
      ji.ad(this.ai);
      if (this.cc != null && this.cc.length > 0) {
         this.cu(this.cc, this.cz, this.cw, this.cr, this.cl);
      }

   }

   static final int iu(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   boolean be(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.dv + var3 * this.dt + var4 * this.dk + var5, var6);
      return var6;
   }

   boolean bc(int var1, int var2, int var3, int var4) {
      return this.bk(this.dp, var1, var2, var3, var4);
   }

   public boolean dy(int var1, int var2, int var3, int var4, int var5, ju var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.ai(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   boolean ch(int var1, int var2, int var3, int var4) {
      return this.bk(this.df, var1, var2, var3, var4);
   }

   boolean cf(int var1, int var2, int var3, int var4, boolean var5) {
      return this.be(this.df, var1, var2, var3, var4, var5);
   }

   public void cu(int[] var1, int var2, int var3, int var4, int var5) {
      this.cc = var1;
      this.cz = var2;
      this.cw = var3;
      this.cr = var4;
      this.cl = var5;
      this.de = 0;
      this.dx = 0;
      this.dj = var4;
      this.do = var5;
      this.dc = var4 / 2;
      this.dw = var5 / 2;
      this.cp.set(0, this.cp.size());
      this.df.set(0, this.df.size());
   }

   void cm(int var1, int var2) {
      this.dl = var1;
      this.db = var2;
   }

   boolean cj(int var1, int var2) {
      if (!this.bt(this.dl, this.db, var1, var2)) {
         return this.bo(this.dl, this.db, var1, var2);
      } else {
         this.bq(this.dl, this.db, var1, var2, false);
         boolean var3 = false;

         for(int var4 = -1; var4 <= 1; ++var4) {
            for(int var5 = -1; var5 <= 1; ++var5) {
               if (this.cx(this.dl, this.db, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.cx(this.dl, (this.db + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.cx(this.dl + 1, this.db, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.cx(this.dl + 1, (this.db + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return this.bv(this.dl, this.db, var1, var2, var3);
      }
   }

   public void gp(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      je var7 = this.at[var4][var5][var6];
      if (var7 != null) {
         jl var8 = var7.ax;
         int var10;
         if (var8 != null) {
            int var18 = var8.af * 1616083007;
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
            jb var9 = var7.aq;
            if (var9 != null) {
               var10 = var9.ad;
               int var11 = var9.ah;
               int var12 = var9.ap;
               int var13 = var9.ab;
               int[] var14 = this.ct[var10];
               int[] var15 = this.cq[var11];
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

   boolean ci(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = jw.am;
      int[] var7 = jw.ax;
      int var8 = var6[var4];
      int var9 = var7[var4];
      int var10 = var6[var5];
      int var11 = var7[var5];
      int var12 = var3 * var10 + var1 * var11 >> 16;
      int var13 = var3 * var11 - var1 * var10 >> 16;
      int var14 = var2 * var8 + var13 * var9 >> 16;
      int var15 = var2 * var9 - var13 * var8 >> 16;
      if (var14 >= 50 && var14 <= ji.ar()) {
         int var16 = this.dc + var12 * 128 / var14;
         int var17 = this.dw + var15 * 128 / var14;
         return var16 >= this.de && var16 <= this.dj && var17 >= this.dx && var17 <= this.do;
      } else {
         return false;
      }
   }

   public void cy(int var1, int var2, int var3, boolean var4) {
      if (!this.cv() || var4) {
         this.bb = true;
         this.br = var4;
         this.bi = var1;
         this.bg = var2;
         this.bl = var3;
         this.bz = -1;
         this.bu = -1;
      }
   }

   boolean ca(int var1, int var2, int var3, int var4) {
      if (!this.cl(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.af[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > this.bd) {
                  if (!this.cb(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.cb(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cb(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.cb(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cb(var5, var9, var6)) {
                  return false;
               }

               if (!this.cb(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < this.bf) {
                  if (!this.cb(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.cb(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cb(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.cb(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cb(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.cb(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < this.bd) {
                  if (!this.cb(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.cb(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cb(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.cb(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cb(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.cb(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > this.bf) {
                  if (!this.cb(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.cb(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cb(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.cb(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.cb(var5, var9, var6)) {
                  return false;
               }

               if (!this.cb(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.cb(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.cb(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.cb(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.cb(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.cb(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   public boolean cv() {
      return this.br && this.bz != -1;
   }

   public void cg() {
      this.bz = -1;
      this.br = false;
   }

   public void ct(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.ax * 128) {
         var1 = this.ax * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.aq * 128) {
         var3 = this.aq * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      this.cm((var4 - 128) / 32, var5 / 64);
      this.bd = var1;
      this.bx = var2;
      this.bf = var3;
      this.bm = var1 / 128;
      this.bs = var3 / 128;
      this.bw = var7 / 128;
      this.ba = var8 / 128;
      this.av = var6;
      jo var10 = new jo(var1, var2, var3, var4, var5, var7, var8);
      this.cq(var10, var9);
   }

   void cq(jx var1, boolean var2) {
      ++this.aw;
      boolean var3 = this.ac == -1;
      this.bj = !var2 && this.ao != in.ac ? this.bw : this.bm;
      this.bp = !var2 && this.ao != in.ac ? this.ba : this.bs;
      if (var3) {
         this.an = this.bj - this.ai;
         if (this.an < 0) {
            this.an = 0;
         }

         this.bn = this.bp - this.ai;
         if (this.bn < 0) {
            this.bn = 0;
         }

         this.ak = this.bj + this.ai;
         if (this.ak > this.ax) {
            this.ak = this.ax;
         }

         this.bh = this.bp + this.ai;
         if (this.bh > this.aq) {
            this.bh = this.aq;
         }
      } else {
         this.an = 0;
         this.bn = 0;
         this.ak = this.ax;
         this.bh = this.aq;
      }

      this.as = this.bm - this.bj;
      this.ay = this.bs - this.bp;
      if (var3) {
         this.cr();
      }

      this.aj = 0;

      int var4;
      je[][] var5;
      int var6;
      int var7;
      je var8;
      for(var4 = this.au; var4 < this.am; ++var4) {
         var5 = this.at[var4];

         for(var6 = this.an; var6 < this.ak; ++var6) {
            for(var7 = this.bn; var7 < this.bh; ++var7) {
               var8 = var5[var6][var7];
               if (var8 != null) {
                  if (var8.ab * 27132243 > this.av || var3 && !this.cj(var6 - this.bm + this.as + this.ai, var7 - this.bs + this.ay + this.ai) && this.af[var4][var6][var7] - this.bx < 2000) {
                     var8.az = false;
                     var8.aa = false;
                     var8.ao = 0;
                  } else {
                     var8.az = true;
                     var8.aa = true;
                     if (var8.al * 1838003371 > 0) {
                        var8.ai = true;
                     } else {
                        var8.ai = false;
                     }

                     ++this.aj;
                  }
               }
            }
         }
      }

      if (var3) {
         var4 = Math.abs(this.as);
         int var15 = Math.abs(this.ay);

         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         je var14;
         je[][] var16;
         int var17;
         for(var6 = this.au; var6 < this.am; ++var6) {
            var16 = this.at[var6];

            for(var17 = -(this.ai + var4); var17 <= 0; ++var17) {
               var9 = this.bm + var17;
               var10 = this.bm - var17;
               if (var9 >= this.an || var10 < this.ak) {
                  for(var11 = -(this.ai + var15); var11 <= 0; ++var11) {
                     var12 = this.bs + var11;
                     var13 = this.bs - var11;
                     if (var9 >= this.an && var9 < this.ak) {
                        if (var12 >= this.bn && var12 < this.bh) {
                           var14 = var16[var9][var12];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, true);
                           }
                        }

                        if (var13 >= this.bn && var13 < this.bh) {
                           var14 = var16[var9][var13];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, true);
                           }
                        }
                     }

                     if (var10 >= this.an && var10 < this.ak) {
                        if (var12 >= this.bn && var12 < this.bh) {
                           var14 = var16[var10][var12];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, true);
                           }
                        }

                        if (var13 >= this.bn && var13 < this.bh) {
                           var14 = var16[var10][var13];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, true);
                           }
                        }
                     }

                     if (this.aj == 0) {
                        this.bb = false;
                        return;
                     }
                  }
               }
            }
         }

         for(var6 = this.au; var6 < this.am; ++var6) {
            var16 = this.at[var6];

            for(var17 = -this.ai; var17 <= 0; ++var17) {
               var9 = this.bj + var17;
               var10 = this.bj - var17;
               if (var9 >= this.an || var10 < this.ak) {
                  for(var11 = -this.ai; var11 <= 0; ++var11) {
                     var12 = this.bp + var11;
                     var13 = this.bp - var11;
                     if (var9 >= this.an && var9 < this.ak) {
                        if (var12 >= this.bn && var12 < this.bh) {
                           var14 = var16[var9][var12];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, false);
                           }
                        }

                        if (var13 >= this.bn && var13 < this.bh) {
                           var14 = var16[var9][var13];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, false);
                           }
                        }
                     }

                     if (var10 >= this.an && var10 < this.ak) {
                        if (var12 >= this.bn && var12 < this.bh) {
                           var14 = var16[var10][var12];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, false);
                           }
                        }

                        if (var13 >= this.bn && var13 < this.bh) {
                           var14 = var16[var10][var13];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, false);
                           }
                        }
                     }

                     if (this.aj == 0) {
                        this.bb = false;
                        return;
                     }
                  }
               }
            }
         }

         this.bb = false;
      } else {
         for(var4 = this.au; var4 < this.am; ++var4) {
            var5 = this.at[var4];

            for(var6 = this.an; var6 < this.ak; ++var6) {
               for(var7 = this.bn; var7 < this.bh; ++var7) {
                  var8 = var5[var6][var7];
                  if (var8 != null && var8.az) {
                     this.cc(var1, var8, true);
                  }
               }
            }
         }
      }

   }

   void cc(jx var1, je var2, boolean var3) {
      this.cn.ae(var2);

      while(true) {
         je var4;
         int var5;
         int var6;
         int var7;
         int var8;
         je[][] var9;
         je var10;
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
                              ku var11;
                              kc var13;
                              int var17;
                              int var18;
                              int var19;
                              int var21;
                              boolean var22;
                              je var33;
                              while(true) {
                                 do {
                                    var4 = (je)this.cn.ax();
                                    if (var4 == null) {
                                       return;
                                    }
                                 } while(!var4.aa);

                                 var5 = var4.ae * 184593053;
                                 var6 = var4.ag * -1775365173;
                                 var7 = var4.ac * -1691745147;
                                 var8 = var4.am * -1245839573;
                                 var9 = this.at[var7];
                                 if (!var4.az) {
                                    break;
                                 }

                                 if (var3) {
                                    if (var7 > 0) {
                                       var10 = this.at[var7 - 1][var5][var6];
                                       if (var10 != null && var10.aa) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= this.bm && var5 > this.an) {
                                       var10 = var9[var5 - 1][var6];
                                       if (var10 != null && var10.aa && (var10.az || (var4.ap * 1948448495 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= this.bm && var5 < this.ak - 1) {
                                       var10 = var9[var5 + 1][var6];
                                       if (var10 != null && var10.aa && (var10.az || (var4.ap * 1948448495 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 <= this.bs && var6 > this.bn) {
                                       var10 = var9[var5][var6 - 1];
                                       if (var10 != null && var10.aa && (var10.az || (var4.ap * 1948448495 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 >= this.bs && var6 < this.bh - 1) {
                                       var10 = var9[var5][var6 + 1];
                                       if (var10 != null && var10.aa && (var10.az || (var4.ap * 1948448495 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var3 = true;
                                 }

                                 var4.az = false;
                                 if (var4.av != null) {
                                    var10 = var4.av;
                                    if (var10.ax != null) {
                                       if (!this.cl(0, var5, var6)) {
                                          var1.ae(this, var10.ax, 0, var5, var6, 795237467);
                                       }
                                    } else if (var10.aq != null && !this.cl(0, var5, var6)) {
                                       var1.ag(this, var10.aq, var5, var6, -849252545);
                                    }

                                    var11 = var10.af;
                                    if (var11 != null) {
                                       var1.ac(var11.aq, 0, var11.ae * -1659954279, var11.ac * -2103755373, var11.ag * -56633013, var11.at * -8087086773214451169L);
                                    }

                                    for(var12 = 0; var12 < var10.al * 1838003371; ++var12) {
                                       var13 = var10.ad[var12];
                                       if (var13 != null) {
                                          var1.ac(var13.ax, var13.aq * 608450227, var13.ag * 1650171533, var13.ae * -1225505631, var13.am * -1050782949, var13.ah * -4657194254713557903L);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var4.ax != null) {
                                    if (!this.cl(var8, var5, var6)) {
                                       var22 = true;
                                       if (var4.ax.ag * -1447020527 != 12345678 || this.bb && var7 <= this.bi) {
                                          var1.ae(this, var4.ax, var8, var5, var6, 914607565);
                                       }
                                    }
                                 } else if (var4.aq != null && !this.cl(var8, var5, var6)) {
                                    var22 = true;
                                    var1.ag(this, var4.aq, var5, var6, -1423812008);
                                 }

                                 var21 = 0;
                                 var12 = 0;
                                 ku var23 = var4.af;
                                 kg var14 = var4.at;
                                 if (var23 != null || var14 != null) {
                                    if (this.bm == var5) {
                                       ++var21;
                                    } else if (this.bm < var5) {
                                       var21 += 2;
                                    }

                                    if (this.bs == var6) {
                                       var21 += 3;
                                    } else if (this.bs > var6) {
                                       var21 += 6;
                                    }

                                    var12 = ch[var21];
                                    var4.aj = cu[var21] * 327615389;
                                 }

                                 if (var23 != null) {
                                    if ((var23.am * 549588913 & cf[var21]) != 0) {
                                       if (var23.am * 549588913 == 16) {
                                          var4.ao = 122029283;
                                          var4.as = cm[var21] * 1087708845;
                                          var4.ay = -498614215 - var4.as * -763006529;
                                       } else if (var23.am * 549588913 == 32) {
                                          var4.ao = 244058566;
                                          var4.as = cj[var21] * 1087708845;
                                          var4.ay = -997228430 - var4.as * -763006529;
                                       } else if (var23.am * 549588913 == 64) {
                                          var4.ao = 488117132;
                                          var4.as = cx[var21] * 1087708845;
                                          var4.ay = -1994456860 - var4.as * -763006529;
                                       } else {
                                          var4.ao = 366087849;
                                          var4.as = ci[var21] * 1087708845;
                                          var4.ay = -1495842645 - var4.as * -763006529;
                                       }
                                    } else {
                                       var4.ao = 0;
                                    }

                                    if ((var23.am * 549588913 & var12) != 0 && !this.ca(var8, var5, var6, var23.am * 549588913)) {
                                       var1.ac(var23.aq, 0, var23.ae * -1659954279, var23.ac * -2103755373, var23.ag * -56633013, var23.at * -8087086773214451169L);
                                    }

                                    if ((var23.ax * -451772705 & var12) != 0 && !this.ca(var8, var5, var6, var23.ax * -451772705)) {
                                       var1.ac(var23.af, 0, var23.ae * -1659954279, var23.ac * -2103755373, var23.ag * -56633013, var23.at * -8087086773214451169L);
                                    }
                                 }

                                 if (var14 != null && !this.cs(var8, var5, var6, var14.at.ev * -1141910865)) {
                                    if ((var14.am * 1744270061 & var12) != 0) {
                                       var1.ac(var14.at, 0, var14.ae * 1739114137 + var14.aq * 1050358309, var14.ac * 1674495999, var14.ag * -1988077953 + var14.af * 640285173, var14.ar * -4784704960526427281L);
                                    } else if (var14.am * 1744270061 == 256) {
                                       var15 = var14.ae * 1739114137 - this.bd;
                                       var16 = var14.ag * -1988077953 - this.bf;
                                       var17 = var14.ax * -1905786199;
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
                                          var1.ac(var14.at, 0, var14.ae * 1739114137 + var14.aq * 1050358309, var14.ac * 1674495999, var14.ag * -1988077953 + var14.af * 640285173, var14.ar * -4784704960526427281L);
                                       } else if (var14.au != null) {
                                          var1.ac(var14.au, 0, var14.ae * 1739114137, var14.ac * 1674495999, var14.ag * -1988077953, var14.ar * -4784704960526427281L);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    jf var27 = var4.au;
                                    if (var27 != null) {
                                       var1.ac(var27.am, 0, var27.ae * 1097595837, var27.ac * -601098933, var27.ag * 220591555, var27.ax * 3442899470081835915L);
                                    }

                                    ic var31 = var4.ar;
                                    if (var31 != null && var31.at * -297921825 == 0) {
                                       if (var31.ax != null) {
                                          var1.ac(var31.ax, 0, var31.ae * -606604329, var31.ac * 514500651, var31.ag * -661088295, var31.af * -1090932977685382519L);
                                       }

                                       if (var31.aq != null) {
                                          var1.ac(var31.aq, 0, var31.ae * -606604329, var31.ac * 514500651, var31.ag * -661088295, var31.af * -1090932977685382519L);
                                       }

                                       if (var31.am != null) {
                                          var1.ac(var31.am, 0, var31.ae * -606604329, var31.ac * 514500651, var31.ag * -661088295, var31.af * -1090932977685382519L);
                                       }
                                    }
                                 }

                                 var15 = var4.ap * 1948448495;
                                 if (var15 != 0) {
                                    if (var5 < this.bm && var5 >= this.an && var5 < this.ak - 1 && (var15 & 4) != 0) {
                                       var33 = var9[var5 + 1][var6];
                                       if (var33 != null && var33.aa) {
                                          this.cn.ae(var33);
                                       }
                                    }

                                    if (var6 < this.bs && var6 >= this.bn && var6 < this.bh - 1 && (var15 & 2) != 0) {
                                       var33 = var9[var5][var6 + 1];
                                       if (var33 != null && var33.aa) {
                                          this.cn.ae(var33);
                                       }
                                    }

                                    if (var5 > this.bm && var5 > this.an && var5 < this.ak && (var15 & 1) != 0) {
                                       var33 = var9[var5 - 1][var6];
                                       if (var33 != null && var33.aa) {
                                          this.cn.ae(var33);
                                       }
                                    }

                                    if (var6 > this.bs && var6 > this.bn && var6 < this.bh && (var15 & 8) != 0) {
                                       var33 = var9[var5][var6 - 1];
                                       if (var33 != null && var33.aa) {
                                          this.cn.ae(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var4.ao * -2121915807 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var4.al * 1838003371; ++var21) {
                                    if (var4.ad[var21].ad * -1245665253 != this.aw && (var4.ah[var21] & var4.ao * -2121915807) == var4.as * 1947464997) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var11 = var4.af;
                                    if (!this.ca(var8, var5, var6, var11.am * 549588913)) {
                                       var1.ac(var11.aq, 0, var11.ae * -1659954279, var11.ac * -2103755373, var11.ag * -56633013, var11.at * -8087086773214451169L);
                                    }

                                    var4.ao = 0;
                                 }
                              }

                              if (!var4.ai) {
                                 break;
                              }

                              try {
                                 int var25 = var4.al * 1838003371;
                                 var4.ai = false;
                                 var21 = 0;

                                 label595:
                                 for(var12 = 0; var12 < var25; ++var12) {
                                    var13 = var4.ad[var12];
                                    if (var13.ad * -1245665253 != this.aw) {
                                       for(var26 = var13.af * -2069611541; var26 <= var13.at * 1336638479; ++var26) {
                                          for(var15 = var13.au * 64920415; var15 <= var13.ar * -153684557; ++var15) {
                                             var33 = var9[var26][var15];
                                             if (var33.az) {
                                                var4.ai = true;
                                                continue label595;
                                             }

                                             if (var33.ao * -2121915807 != 0) {
                                                var17 = 0;
                                                if (var26 > var13.af * -2069611541) {
                                                   ++var17;
                                                }

                                                if (var26 < var13.at * 1336638479) {
                                                   var17 += 4;
                                                }

                                                if (var15 > var13.au * 64920415) {
                                                   var17 += 8;
                                                }

                                                if (var15 < var13.ar * -153684557) {
                                                   var17 += 2;
                                                }

                                                if ((var17 & var33.ao * -2121915807) == var4.ay * 2068875803) {
                                                   var4.ai = true;
                                                   continue label595;
                                                }
                                             }
                                          }
                                       }

                                       this.by[var21++] = var13;
                                       var26 = this.bm - var13.af * -2069611541;
                                       var15 = var13.at * 1336638479 - this.bm;
                                       if (var15 > var26) {
                                          var26 = var15;
                                       }

                                       var16 = this.bs - var13.au * 64920415;
                                       var17 = var13.ar * -153684557 - this.bs;
                                       if (var17 > var16) {
                                          var13.al = (var26 + var17) * -1207993815;
                                       } else {
                                          var13.al = (var26 + var16) * -1207993815;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var12 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       kc var34 = this.by[var26];
                                       if (var34.ad * -1245665253 != this.aw) {
                                          if (var34.al * 619364889 > var12) {
                                             var12 = var34.al * 619364889;
                                             var24 = var26;
                                          } else if (var34.al * 619364889 == var12) {
                                             var16 = var34.ag * 1650171533 - this.bd;
                                             var17 = var34.am * -1050782949 - this.bf;
                                             var18 = this.by[var24].ag * 1650171533 - this.bd;
                                             var19 = this.by[var24].am * -1050782949 - this.bf;
                                             if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    kc var35 = this.by[var24];
                                    var35.ad = this.aw * 1543434771;
                                    if (!this.cp(var8, var35.af * -2069611541, var35.at * 1336638479, var35.au * 64920415, var35.ar * -153684557, var35.ax.ev * -1141910865)) {
                                       var1.ac(var35.ax, var35.aq * 608450227, var35.ag * 1650171533, var35.ae * -1225505631, var35.am * -1050782949, var35.ah * -4657194254713557903L);
                                    }

                                    for(var15 = var35.af * -2069611541; var15 <= var35.at * 1336638479; ++var15) {
                                       for(var16 = var35.au * 64920415; var16 <= var35.ar * -153684557; ++var16) {
                                          je var36 = var9[var15][var16];
                                          if (var36.ao * -2121915807 != 0) {
                                             this.cn.ae(var36);
                                          } else if ((var15 != var5 || var16 != var6) && var36.aa) {
                                             this.cn.ae(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var4.ai) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var4.ai = false;
                                 break;
                              }
                           }
                        } while(!var4.aa);
                     } while(var4.ao * -2121915807 != 0);

                     if (var5 > this.bm || var5 <= this.an) {
                        break;
                     }

                     var10 = var9[var5 - 1][var6];
                  } while(var10 != null && var10.aa);

                  if (var5 < this.bm || var5 >= this.ak - 1) {
                     break;
                  }

                  var10 = var9[var5 + 1][var6];
               } while(var10 != null && var10.aa);

               if (var6 > this.bs || var6 <= this.bn) {
                  break;
               }

               var10 = var9[var5][var6 - 1];
            } while(var10 != null && var10.aa);

            if (var6 < this.bs || var6 >= this.bh - 1) {
               break;
            }

            var10 = var9[var5][var6 + 1];
         } while(var10 != null && var10.aa);

         var4.aa = false;
         --this.aj;
         ic var29 = var4.ar;
         if (var29 != null && var29.at * -297921825 != 0) {
            if (var29.ax != null) {
               var1.ac(var29.ax, 0, var29.ae * -606604329, var29.ac * 514500651 - var29.at * -297921825, var29.ag * -661088295, var29.af * -1090932977685382519L);
            }

            if (var29.aq != null) {
               var1.ac(var29.aq, 0, var29.ae * -606604329, var29.ac * 514500651 - var29.at * -297921825, var29.ag * -661088295, var29.af * -1090932977685382519L);
            }

            if (var29.am != null) {
               var1.ac(var29.am, 0, var29.ae * -606604329, var29.ac * 514500651 - var29.at * -297921825, var29.ag * -661088295, var29.af * -1090932977685382519L);
            }
         }

         if (var4.aj * -612984139 != 0) {
            kg var30 = var4.at;
            if (var30 != null && !this.cs(var8, var5, var6, var30.at.ev * -1141910865)) {
               if ((var30.am * 1744270061 & var4.aj * -612984139) != 0) {
                  var1.ac(var30.at, 0, var30.ae * 1739114137 + var30.aq * 1050358309, var30.ac * 1674495999, var30.ag * -1988077953 + var30.af * 640285173, var30.ar * -4784704960526427281L);
               } else if (var30.am * 1744270061 == 256) {
                  var12 = var30.ae * 1739114137 - this.bd;
                  var24 = var30.ag * -1988077953 - this.bf;
                  var26 = var30.ax * -1905786199;
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
                     var1.ac(var30.at, 0, var30.ae * 1739114137 + var30.aq * 1050358309, var30.ac * 1674495999, var30.ag * -1988077953 + var30.af * 640285173, var30.ar * -4784704960526427281L);
                  } else if (var30.au != null) {
                     var1.ac(var30.au, 0, var30.ae * 1739114137, var30.ac * 1674495999, var30.ag * -1988077953, var30.ar * -4784704960526427281L);
                  }
               }
            }

            ku var28 = var4.af;
            if (var28 != null) {
               if ((var28.ax * -451772705 & var4.aj * -612984139) != 0 && !this.ca(var8, var5, var6, var28.ax * -451772705)) {
                  var1.ac(var28.af, 0, var28.ae * -1659954279, var28.ac * -2103755373, var28.ag * -56633013, var28.at * -8087086773214451169L);
               }

               if ((var28.am * 549588913 & var4.aj * -612984139) != 0 && !this.ca(var8, var5, var6, var28.am * 549588913)) {
                  var1.ac(var28.aq, 0, var28.ae * -1659954279, var28.ac * -2103755373, var28.ag * -56633013, var28.at * -8087086773214451169L);
               }
            }
         }

         je var32;
         if (var7 < this.am - 1) {
            var32 = this.at[var7 + 1][var5][var6];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }

         if (var5 < this.bm && var5 >= this.an && var5 < this.ak - 1) {
            var32 = var9[var5 + 1][var6];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }

         if (var6 < this.bs && var6 >= this.bn && var6 < this.bh - 1) {
            var32 = var9[var5][var6 + 1];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }

         if (var5 > this.bm && var5 > this.an && var5 < this.ak) {
            var32 = var9[var5 - 1][var6];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }

         if (var6 > this.bs && var6 > this.bn && var6 < this.bh) {
            var32 = var9[var5][var6 - 1];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }
      }
   }

   static final int cz(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   static boolean cw(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
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

   void cr() {
      int var1 = this.bq[this.av];
      jz[] var2 = this.bk[this.av];
      this.be = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         jz var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.ax * -1532244041 == 1) {
            var5 = var4.ac * -1042787705 - this.bm + this.ai;
            if (var5 >= 0 && var5 <= this.ai + this.ai) {
               var6 = var4.ag * 1488447437 - this.bs + this.ai;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.am * 702157191 - this.bs + this.ai;
               if (var7 > this.ai + this.ai) {
                  var7 = this.ai + this.ai;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cj(var5, var6++)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bd - var4.aq * 1384818045;
                  if (var9 > 32) {
                     var4.ad = -16115129;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.ad = -32230258;
                     var9 = -var9;
                  }

                  var4.ab = (var4.at * 566424513 - this.bf << 8) / var9 * -564061233;
                  var4.az = (var4.au * -1820248145 - this.bf << 8) / var9 * -1245050143;
                  var4.aa = (var4.ar * 1743404645 - this.bx << 8) / var9 * -1066215937;
                  var4.ai = (var4.al * 1135123739 - this.bx << 8) / var9 * -601024919;
                  this.bc[this.be++] = var4;
               }
            }
         } else if (var4.ax * -1532244041 == 2) {
            var5 = var4.ag * 1488447437 - this.bs + this.ai;
            if (var5 >= 0 && var5 <= this.ai + this.ai) {
               var6 = var4.ac * -1042787705 - this.bm + this.ai;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.ae * 437852685 - this.bm + this.ai;
               if (var7 > this.ai + this.ai) {
                  var7 = this.ai + this.ai;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cj(var6++, var5)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bf - var4.at * 566424513;
                  if (var9 > 32) {
                     var4.ad = -48345387;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.ad = -64460516;
                     var9 = -var9;
                  }

                  var4.ah = (var4.aq * 1384818045 - this.bd << 8) / var9 * -1997433495;
                  var4.ap = (var4.af * 1043206691 - this.bd << 8) / var9 * 2030705085;
                  var4.aa = (var4.ar * 1743404645 - this.bx << 8) / var9 * -1066215937;
                  var4.ai = (var4.al * 1135123739 - this.bx << 8) / var9 * -601024919;
                  this.bc[this.be++] = var4;
               }
            }
         } else if (var4.ax * -1532244041 == 4) {
            var5 = var4.ar * 1743404645 - this.bx;
            if (var5 > 128) {
               var6 = var4.ag * 1488447437 - this.bs + this.ai;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.am * 702157191 - this.bs + this.ai;
               if (var7 > this.ai + this.ai) {
                  var7 = this.ai + this.ai;
               }

               if (var6 <= var7) {
                  int var8 = var4.ac * -1042787705 - this.bm + this.ai;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.ae * 437852685 - this.bm + this.ai;
                  if (var9 > this.ai + this.ai) {
                     var9 = this.ai + this.ai;
                  }

                  boolean var10 = false;

                  label189:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (this.cj(var11, var12)) {
                           var10 = true;
                           break label189;
                        }
                     }
                  }

                  if (var10) {
                     var4.ad = -80575645;
                     var4.ah = (var4.aq * 1384818045 - this.bd << 8) / var5 * -1997433495;
                     var4.ap = (var4.af * 1043206691 - this.bd << 8) / var5 * 2030705085;
                     var4.ab = (var4.at * 566424513 - this.bf << 8) / var5 * -564061233;
                     var4.az = (var4.au * -1820248145 - this.bf << 8) / var5 * -1245050143;
                     this.bc[this.be++] = var4;
                  }
               }
            }
         }
      }

   }

   boolean cl(int var1, int var2, int var3) {
      int var4 = this.ad[var1][var2][var3];
      if (var4 == -this.aw) {
         return false;
      } else if (var4 == this.aw) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.cb(var5 + 1, this.af[var1][var2][var3], var6 + 1) && this.cb(var5 + 128 - 1, this.af[var1][var2 + 1][var3], var6 + 1) && this.cb(var5 + 128 - 1, this.af[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.cb(var5 + 1, this.af[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.ad[var1][var2][var3] = this.aw;
            return true;
         } else {
            this.ad[var1][var2][var3] = -this.aw;
            return false;
         }
      }
   }

   boolean bq(int var1, int var2, int var3, int var4, boolean var5) {
      return this.br(this.cp, var1, var2, var3, var4, var5);
   }

   boolean cs(int var1, int var2, int var3, int var4) {
      if (!this.cl(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.cb(var5 + 1, this.af[var1][var2][var3] - var4, var6 + 1) && this.cb(var5 + 128 - 1, this.af[var1][var2 + 1][var3] - var4, var6 + 1) && this.cb(var5 + 128 - 1, this.af[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.cb(var5 + 1, this.af[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean cp(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.cl(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.cb(var7 + 1, this.af[var1][var2][var4] - var6, var8 + 1) && this.cb(var7 + 128 - 1, this.af[var1][var2 + 1][var4] - var6, var8 + 1) && this.cb(var7 + 128 - 1, this.af[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.cb(var7 + 1, this.af[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.ad[var1][var7][var8] == -this.aw) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.af[var1][var2][var4] - var6;
         if (!this.cb(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.cb(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.cb(var7, var9, var11)) {
                  return false;
               } else if (!this.cb(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   public jf fb(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 != null && var4.au != null ? var4.au : null;
   }

   public void gt(in var1) {
      if (var1 != this.ao) {
         this.ao = var1;
         this.cu(this.cc, this.cz, this.cw, this.cr, this.cl);
      }

   }

   public void cd() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.am; ++var1) {
         for(var2 = 0; var2 < this.ax; ++var2) {
            for(int var3 = 0; var3 < this.aq; ++var3) {
               this.at[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < this.bt; ++var1) {
         for(var2 = 0; var2 < this.bq[var1]; ++var2) {
            this.bk[var1][var2] = null;
         }

         this.bq[var1] = 0;
      }

      for(var1 = 0; var1 < this.ar; ++var1) {
         this.al[var1] = null;
      }

      this.ar = 0;

      for(var1 = 0; var1 < this.by.length; ++var1) {
         this.by[var1] = null;
      }

   }

   public void ce(int var1) {
      this.au = var1;

      for(int var2 = 0; var2 < this.ax; ++var2) {
         for(int var3 = 0; var3 < this.aq; ++var3) {
            if (this.at[var1][var2][var3] == null) {
               this.at[var1][var2][var3] = new je(var1, var2, var3);
            }
         }
      }

   }

   public void co() {
      this.br = true;
   }

   public void dp(int var1) {
      this.au = var1;

      for(int var2 = 0; var2 < this.ax; ++var2) {
         for(int var3 = 0; var3 < this.aq; ++var3) {
            if (this.at[var1][var2][var3] == null) {
               this.at[var1][var2][var3] = new je(var1, var2, var3);
            }
         }
      }

   }

   public void df(int var1, int var2) {
      je var3 = this.at[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         je var5 = this.at[var4][var1][var2] = this.at[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.ac -= 1615826430;

            for(int var6 = 0; var6 < var5.al * 1838003371; ++var6) {
               kc var7 = var5.ad[var6];
               if (ce.ae(var7.ah * -4657194254713557903L) && var7.af * -2069611541 == var1 && var7.au * 2031295200 == var2) {
                  var7.ac -= -547202725;
               }
            }
         }
      }

      if (this.at[0][var1][var2] == null) {
         this.at[0][var1][var2] = new je(0, var1, var2);
      }

      this.at[0][var1][var2].av = var3;
      this.at[3][var1][var2] = null;
   }

   public void dv(int var1, int var2) {
      je var3 = this.at[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         je var5 = this.at[var4][var1][var2] = this.at[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.ac -= -1716693939;

            for(int var6 = 0; var6 < var5.al * 1838003371; ++var6) {
               kc var7 = var5.ad[var6];
               if (ce.ae(var7.ah * -4657194254713557903L) && var7.af * -2069611541 == var1 && var7.au * 64920415 == var2) {
                  var7.ac -= -547202725;
               }
            }
         }
      }

      if (this.at[0][var1][var2] == null) {
         this.at[0][var1][var2] = new je(0, var1, var2);
      }

      this.at[0][var1][var2].av = var3;
      this.at[3][var1][var2] = null;
   }

   void jp(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      qx var15 = new qx();
      var15.ae((float)((double)(-var2) * 0.0030679615D), (byte)-14);
      var15.ag((float)((double)(-var3) * 0.0030679615D), 1075468203);
      var15.ax((float)var7, (float)var8, (float)var9, -192405633);
      qf var16 = new qf();
      var16.az(var15, -1468645777);
      var16.ai((byte)-89);
      int var17 = this.ag % 300;
      float var18 = (float)var17 / 300.0F * 6.283F;
      float var19 = (float)Math.sin((double)var18);
      float var20 = (float)Math.cos((double)var18);
      float var21 = var19 * 3.14159F / 100.0F;
      float var22 = var20 * 3.14159F / 100.0F;
      qh var23 = new qh();
      qf var24 = new qf();
      var23.ac = new qd((float)((double)var1 * 0.0030679615D), var21, var22);
      var23.ae = new qv((float)var4, (float)var5, (float)var6);
      qf var25 = new qf();
      var25.ap(var23, -850191566);
      var25.ai((byte)46);
      qh var26 = new qh();
      var26.ae = new qv((float)(-(this.ax * 64)), 0.0F, (float)(-(this.aq * 147243235)));
      qf var27 = new qf();
      var27.ap(var26, 6618994);
      var24.ao(1.0F, 1.0F, 1.0F, 1.0F, (short)4488);
      var27.ah(var24, -2032529434);
      var24.ap(var23, -408830568);
      var27.ah(var24, -2050391737);
      var27.ah(var16, -2001057794);
      this.bd = (int)var25.ay((float)var7, (float)var8, (float)var9, -2125951925);
      this.bx = (int)var25.aj((float)var7, (float)var8, (float)var9, 844691753);
      this.bf = (int)var25.av((float)var7, (float)var8, (float)var9, -1627132076);
      this.bm = this.bd / 128;
      this.bs = this.bf / 128;
      this.bw = (int)var25.ay((float)var12, 0.0F, (float)var13, -2125951925) / 128;
      this.ba = (int)var25.av((float)var12, 0.0F, (float)var13, 1368771710) / 128;
      ja var28 = new ja(var27);
      this.cq(var28, var14);
   }

   public void dh(int var1, int var2, int var3, int var4, ju var5, ju var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         ku var12 = new ku();
         var12.at = var9 * 3417452104574177759L;
         var12.au = var11 * 69663131;
         var12.ae = var2 * 1327086869 + -463374623;
         var12.ag = var3 * 1962160512 + 310778569;
         var12.ac = var4 * 904709682;
         var12.aq = var5;
         var12.af = var6;
         var12.am = var7 * -1652515274;
         var12.ax = var8 * 2145959199;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.at[var13][var2][var3] == null) {
               this.at[var13][var2][var3] = new je(var13, var2, var3);
            }
         }

         this.at[var1][var2][var3].af = var12;
      }
   }

   public void dl(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      jl var21;
      int var22;
      if (var4 == 0) {
         var21 = new jl(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.at[var22][var2][var3] == null) {
               this.at[var22][var2][var3] = new je(var22, var2, var3);
            }
         }

         this.at[var1][var2][var3].ax = var21;
      } else if (var4 != 1) {
         jb var23 = new jb(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.at[var22][var2][var3] == null) {
               this.at[var22][var2][var3] = new je(var22, var2, var3);
            }
         }

         this.at[var1][var2][var3].aq = var23;
      } else {
         var21 = new jl(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.at[var22][var2][var3] == null) {
               this.at[var22][var2][var3] = new je(var22, var2, var3);
            }
         }

         this.at[var1][var2][var3].ax = var21;
      }
   }

   public void db(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      jl var21;
      int var22;
      if (var4 == 0) {
         var21 = new jl(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.at[var22][var2][var3] == null) {
               this.at[var22][var2][var3] = new je(var22, var2, var3);
            }
         }

         this.at[var1][var2][var3].ax = var21;
      } else if (var4 != 1) {
         jb var23 = new jb(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.at[var22][var2][var3] == null) {
               this.at[var22][var2][var3] = new je(var22, var2, var3);
            }
         }

         this.at[var1][var2][var3].aq = var23;
      } else {
         var21 = new jl(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.at[var22][var2][var3] == null) {
               this.at[var22][var2][var3] = new je(var22, var2, var3);
            }
         }

         this.at[var1][var2][var3].ax = var21;
      }
   }

   public void dc(int var1, int var2, int var3, int var4, ju var5, long var6, ju var8, ju var9) {
      ic var10 = new ic();
      var10.am = var5;
      var10.ae = var2 * 1658319744 + 829159872;
      var10.ag = var3 * 1312568448 + -1491199424;
      var10.ac = var4 * 239654531;
      var10.af = var6 * 3144815386490952633L;
      var10.ax = var8;
      var10.aq = var9;
      int var11 = 0;
      je var12 = this.at[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.al * 1838003371; ++var13) {
            if ((var12.ad[var13].ap * 876842249 & 256) == 256 && var12.ad[var13].ax instanceof jm) {
               jm var14 = (jm)var12.ad[var13].ax;
               var14.au();
               if (var14.ev * -1141910865 > var11) {
                  var11 = var14.ev * -1141910865;
               }
            }
         }
      }

      var10.at = var11 * 1598695711;
      if (this.at[var1][var2][var3] == null) {
         this.at[var1][var2][var3] = new je(var1, var2, var3);
      }

      this.at[var1][var2][var3].ar = var10;
   }

   boolean je(int var1, int var2, int var3, int var4) {
      if (!this.cl(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.cb(var5 + 1, this.af[var1][var2][var3] - var4, var6 + 1) && this.cb(var5 + 128 - 1, this.af[var1][var2 + 1][var3] - var4, var6 + 1) && this.cb(var5 + 128 - 1, this.af[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.cb(var5 + 1, this.af[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   public void de(int var1, int var2, int var3, int var4, ju var5, long var6, ju var8, ju var9) {
      ic var10 = new ic();
      var10.am = var5;
      var10.ae = var2 * -1279432857 + -544621112;
      var10.ag = var3 * 1873293863 + -1491199424;
      var10.ac = var4 * -151956937;
      var10.af = var6 * 3144815386490952633L;
      var10.ax = var8;
      var10.aq = var9;
      int var11 = 0;
      je var12 = this.at[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.al * -1634586354; ++var13) {
            if ((var12.ad[var13].ap * 24920332 & 256) == 256 && var12.ad[var13].ax instanceof jm) {
               jm var14 = (jm)var12.ad[var13].ax;
               var14.au();
               if (var14.ev * -1060716719 > var11) {
                  var11 = var14.ev * -1141910865;
               }
            }
         }
      }

      var10.at = var11 * -1002611719;
      if (this.at[var1][var2][var3] == null) {
         this.at[var1][var2][var3] = new je(var1, var2, var3);
      }

      this.at[var1][var2][var3].ar = var10;
   }

   public void dx(int var1, int var2, int var3, int var4, ju var5, long var6, ju var8, ju var9) {
      ic var10 = new ic();
      var10.am = var5;
      var10.ae = var2 * 1658319744 + 829159872;
      var10.ag = var3 * 1312568448 + -1491199424;
      var10.ac = var4 * 239654531;
      var10.af = var6 * 3144815386490952633L;
      var10.ax = var8;
      var10.aq = var9;
      int var11 = 0;
      je var12 = this.at[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.al * 1838003371; ++var13) {
            if ((var12.ad[var13].ap * 876842249 & 256) == 256 && var12.ad[var13].ax instanceof jm) {
               jm var14 = (jm)var12.ad[var13].ax;
               var14.au();
               if (var14.ev * -1141910865 > var11) {
                  var11 = var14.ev * -1141910865;
               }
            }
         }
      }

      var10.at = var11 * 1598695711;
      if (this.at[var1][var2][var3] == null) {
         this.at[var1][var2][var3] = new je(var1, var2, var3);
      }

      this.at[var1][var2][var3].ar = var10;
   }

   public void dj(int var1, int var2, int var3, int var4, ju var5, ju var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         ku var12 = new ku();
         var12.at = var9 * 3417452104574177759L;
         var12.au = var11 * 69663131;
         var12.ae = var2 * -586918784 + -363908916;
         var12.ag = var3 * 1962160512 + 981080256;
         var12.ac = var4 * 401892707;
         var12.aq = var5;
         var12.af = var6;
         var12.am = var7 * -1760765615;
         var12.ax = var8 * 2145959199;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.at[var13][var2][var3] == null) {
               this.at[var13][var2][var3] = new je(var13, var2, var3);
            }
         }

         this.at[var1][var2][var3].af = var12;
      }
   }

   public void ex(int var1, int var2, int var3, int var4) {
      je var5 = this.at[var1][var2][var3];
      if (var5 != null) {
         kg var6 = var5.at;
         if (var6 != null) {
            var6.aq = var6.aq * 1050358309 * var4 / 16 * -1722050131;
            var6.af = var6.af * 640285173 * var4 / 16 * 1409690205;
         }
      }
   }

   public long bm(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 != null && var4.at != null ? var4.at.ar * -4784704960526427281L : 0L;
   }

   public void dm(int var1, int var2, int var3, int var4, ju var5, ju var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         kg var14 = new kg();
         var14.ar = var11 * -1120798631125195889L;
         var14.al = var13 * 1328762619;
         var14.ae = var2 * -971582336 + -485791168;
         var14.ag = var3 * 1387577216 + -1453695040;
         var14.ac = var4 * 535902207;
         var14.at = var5;
         var14.au = var6;
         var14.am = var7 * 201243365;
         var14.ax = var8 * 1699594649;
         var14.aq = var9 * -1722050131;
         var14.af = var10 * 1409690205;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.at[var15][var2][var3] == null) {
               this.at[var15][var2][var3] = new je(var15, var2, var3);
            }
         }

         this.at[var1][var2][var3].at = var14;
      }
   }

   public void dq(int var1, int var2, int var3, int var4, ju var5, ju var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         kg var14 = new kg();
         var14.ar = var11 * -1120798631125195889L;
         var14.al = var13 * 1328762619;
         var14.ae = var2 * -971582336 + -485791168;
         var14.ag = var3 * 1387577216 + -1453695040;
         var14.ac = var4 * 535902207;
         var14.at = var5;
         var14.au = var6;
         var14.am = var7 * 201243365;
         var14.ax = var8 * 1699594649;
         var14.aq = var9 * -1722050131;
         var14.af = var10 * 1409690205;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.at[var15][var2][var3] == null) {
               this.at[var15][var2][var3] = new je(var15, var2, var3);
            }
         }

         this.at[var1][var2][var3].at = var14;
      }
   }

   public boolean di(int var1, int var2, int var3, int var4, int var5, int var6, ju var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + 2006867969 * var5;
         int var13 = var3 * 128 + -843735658 * var6;
         return this.ai(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public boolean da(int var1, int var2, int var3, int var4, int var5, int var6, ju var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + -487532713 * var5;
         int var13 = var3 * 128 + -2135197296 * var6;
         return this.ai(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   boolean dd(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ju var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.ax || var16 >= this.aq) {
               return false;
            }

            je var17 = this.at[var1][var15][var16];
            if (var17 != null && var17.al * 1838003371 >= 5) {
               return false;
            }
         }
      }

      kc var21 = new kc();
      var21.ah = var12 * -5194667785432116079L;
      var21.ap = var14 * 1021010143;
      var21.ac = var1 * -547202725;
      var21.ag = var6 * 342381637;
      var21.am = var7 * 546816601;
      var21.ae = var8 * -208494751;
      var21.ax = var9;
      var21.aq = var10 * 1911061198;
      var21.af = var2 * 1890063555;
      var21.au = var3 * -1649246049;
      var21.at = (var2 + var4 - 1) * -59902083;
      var21.ar = (var3 + var5 - 1) * 1972631298;

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
               if (this.at[var19][var16][var22] == null) {
                  this.at[var19][var16][var22] = new je(var19, var16, var22);
               }
            }

            je var23 = this.at[var1][var16][var22];
            var23.ad[var23.al * 1838003371] = var21;
            var23.ah[var23.al * 1838003371] = var18;
            var23.ap = (var23.ap * 1948448495 | var18) * 254972521;
            var23.al += 1127751760;
         }
      }

      if (var11) {
         this.al[this.ar++] = var21;
      }

      return true;
   }

   void fy(jv var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.ax) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.aq && (var9 >= var6 || var10 >= var8)) {
                  je var11 = this.at[var2][var9][var10];
                  if (var11 != null && var11.au != null && var11.au.am instanceof jv) {
                     int var12 = this.bb(var2, var9, var10, var2, var3, var4);
                     jv var13 = (jv)var11.au.am;
                     jv.ak(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }

   }

   public boolean dr(int var1, int var2, int var3, int var4, int var5, ju var6, int var7, long var8, boolean var10) {
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
         return this.ai(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   boolean bo(int var1, int var2, int var3, int var4) {
      return this.bu(this.cs, var1, var2, var3, var4);
   }

   public boolean ds(int var1, int var2, int var3, int var4, int var5, ju var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.ai(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   public long bs(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.al * 1838003371; ++var5) {
            kc var6 = var4.ad[var5];
            if (ce.ae(var6.ah * -4657194254713557903L) && var6.af * -2069611541 == var2 && var6.au * 64920415 == var3) {
               return var6.ah * -4657194254713557903L;
            }
         }

         return 0L;
      }
   }

   boolean du(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ju var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.ax || var16 >= this.aq) {
               return false;
            }

            je var17 = this.at[var1][var15][var16];
            if (var17 != null && var17.al * 1838003371 >= 5) {
               return false;
            }
         }
      }

      kc var21 = new kc();
      var21.ah = var12 * -5194667785432116079L;
      var21.ap = var14 * -306120009;
      var21.ac = var1 * -547202725;
      var21.ag = var6 * -1173188835;
      var21.am = var7 * -2058126716;
      var21.ae = var8 * 719288423;
      var21.ax = var9;
      var21.aq = var10 * -1753520005;
      var21.af = var2 * 314001593;
      var21.au = var3 * -1282343981;
      var21.at = (var2 + var4 - 1) * -151517777;
      var21.ar = (var3 + var5 - 1) * -2070625925;

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
               if (this.at[var19][var16][var22] == null) {
                  this.at[var19][var16][var22] = new je(var19, var16, var22);
               }
            }

            je var23 = this.at[var1][var16][var22];
            var23.ad[var23.al * -1047182373] = var21;
            var23.ah[var23.al * 541987357] = var18;
            var23.ap = (var23.ap * 383221114 | var18) * -1973129406;
            var23.al += -1744039582;
         }
      }

      if (var11) {
         this.al[this.ar++] = var21;
      }

      return true;
   }

   public long fj(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.al * 1838003371; ++var5) {
            kc var6 = var4.ad[var5];
            if (ce.ae(var6.ah * -4657194254713557903L) && var6.af * -2069611541 == var2 && var6.au * 64920415 == var3) {
               return var6.ah * -4657194254713557903L;
            }
         }

         return 0L;
      }
   }

   boolean eg(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ju var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.ax || var16 >= this.aq) {
               return false;
            }

            je var17 = this.at[var1][var15][var16];
            if (var17 != null && var17.al * 1838003371 >= 5) {
               return false;
            }
         }
      }

      kc var21 = new kc();
      var21.ah = var12 * -5194667785432116079L;
      var21.ap = var14 * 433590585;
      var21.ac = var1 * -547202725;
      var21.ag = var6 * 342381637;
      var21.am = var7 * -231223533;
      var21.ae = var8 * -208494751;
      var21.ax = var9;
      var21.aq = var10 * -1753520005;
      var21.af = var2 * 1890063555;
      var21.au = var3 * -1649246049;
      var21.at = (var2 + var4 - 1) * 357561071;
      var21.ar = (var3 + var5 - 1) * -2070625925;

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
               if (this.at[var19][var16][var22] == null) {
                  this.at[var19][var16][var22] = new je(var19, var16, var22);
               }
            }

            je var23 = this.at[var1][var16][var22];
            var23.ad[var23.al * 1838003371] = var21;
            var23.ah[var23.al * 1838003371] = var18;
            var23.ap = (var23.ap * 1948448495 | var18) * -117114865;
            var23.al += -1668241917;
         }
      }

      if (var11) {
         this.al[this.ar++] = var21;
      }

      return true;
   }

   public void ea() {
      for(int var1 = 0; var1 < this.ar; ++var1) {
         kc var2 = this.al[var1];
         this.as(var2);
         this.al[var1] = null;
      }

      this.ar = 0;
   }

   public void hv(int[] var1, int var2, int var3, int var4, int var5) {
      this.cc = var1;
      this.cz = var2;
      this.cw = var3;
      this.cr = var4;
      this.cl = var5;
      this.de = 0;
      this.dx = 0;
      this.dj = var4;
      this.do = var5;
      this.dc = var4 / 2;
      this.dw = var5 / 2;
      this.cp.set(0, this.cp.size());
      this.df.set(0, this.df.size());
   }

   public void iw() {
      this.bz = -1;
      this.br = false;
   }

   void ef(kc var1) {
      for(int var2 = var1.af * -2069611541; var2 <= var1.at * 1891365870; ++var2) {
         for(int var3 = var1.au * -1721537986; var3 <= var1.ar * -153684557; ++var3) {
            je var4 = this.at[var1.ac * 88485587][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.al * 1838003371; ++var5) {
                  if (var4.ad[var5] == var1) {
                     var4.al -= -1668241917;

                     for(int var6 = var5; var6 < var4.al * 1896231028; ++var6) {
                        var4.ad[var6] = var4.ad[var6 + 1];
                        var4.ah[var6] = var4.ah[var6 + 1];
                     }

                     var4.ad[var4.al * 1025052253] = null;
                     break;
                  }
               }

               var4.ap = 0;

               for(var5 = 0; var5 < var4.al * -613104405; ++var5) {
                  var4.ap = (var4.ap * -1240191891 | var4.ah[var5]) * -117114865;
               }
            }
         }
      }

   }

   public void ew(int var1, int var2, int var3, int var4) {
      je var5 = this.at[var1][var2][var3];
      if (var5 != null) {
         kg var6 = var5.at;
         if (var6 != null) {
            var6.aq = var6.aq * 1275267935 * var4 / 16 * -1722050131;
            var6.af = var6.af * 640285173 * var4 / 16 * 1409690205;
         }
      }
   }

   public void ep(int var1, int var2, int var3, int var4) {
      je var5 = this.at[var1][var2][var3];
      if (var5 != null) {
         kg var6 = var5.at;
         if (var6 != null) {
            var6.aq = var6.aq * 1050358309 * var4 / 16 * -1722050131;
            var6.af = var6.af * 640285173 * var4 / 16 * 1409690205;
         }
      }
   }

   void ha(int var1, int var2) {
      this.dl = var1;
      this.db = var2;
   }

   public void eh(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         var4.af = null;
      }
   }

   public void il() {
      this.bz = -1;
      this.br = false;
   }

   public void gs(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      je var7 = this.at[var4][var5][var6];
      if (var7 != null) {
         jl var8 = var7.ax;
         int var10;
         if (var8 != null) {
            int var18 = var8.af * 1616083007;
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
            jb var9 = var7.aq;
            if (var9 != null) {
               var10 = var9.ad;
               int var11 = var9.ah;
               int var12 = var9.ap;
               int var13 = var9.ab;
               int[] var14 = this.ct[var10];
               int[] var15 = this.cq[var11];
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

   public void el(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         var4.af = null;
      }
   }

   public long fq(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 != null && var4.au != null ? var4.au.ax * 3442899470081835915L : 0L;
   }

   boolean hy(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.dv + var3 * this.dt + var4 * this.dk + var5);
   }

   public void eb(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.al * 1838003371; ++var5) {
            kc var6 = var4.ad[var5];
            if (ce.ae(var6.ah * -4657194254713557903L) && var6.af * -2069611541 == var2 && var6.au * 64920415 == var3) {
               this.as(var6);
               return;
            }
         }

      }
   }

   boolean gq(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.cb + var3 * this.cd + var4 * this.ce + var5, var6);
      return var6;
   }

   public void es(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         var4.au = null;
      }
   }

   public void ey(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         var4.ar = null;
      }
   }

   public void er(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         var4.ar = null;
      }
   }

   public void ed(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         var4.ar = null;
      }
   }

   void fa(jv var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.am) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.ax) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.aq && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        je var15 = this.at[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = this.bb(var12, var13, var14, var2, var3, var4);
                           ku var17 = var15.af;
                           if (var17 != null) {
                              jv var18;
                              if (var17.aq instanceof jv) {
                                 var18 = (jv)var17.aq;
                                 jv.ak(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * -157296470 + (1 - var6) * 64, var7);
                              }

                              if (var17.af instanceof jv) {
                                 var18 = (jv)var17.af;
                                 jv.ak(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 420850439, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.al * -1923050268; ++var23) {
                              kc var19 = var15.ad[var23];
                              if (var19 != null && var19.ax instanceof jv) {
                                 jv var20 = (jv)var19.ax;
                                 int var21 = var19.at * -1923112897 - var19.af * -2069611541 + 1;
                                 int var22 = var19.ar * -153684557 - var19.au * 1982709643 + 1;
                                 jv.ak(var1, var20, (var19.af * -2069611541 - var3) * 1887432206 + (var21 - var5) * 64, var16, (var19.au * 64920415 - var4) * 2142021493 + (var22 - var6) * 64, var7);
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

   boolean ht(int var1, int var2, int var3, int var4, boolean var5) {
      return this.be(this.df, var1, var2, var3, var4, var5);
   }

   public kg ej(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 == null ? null : var4.at;
   }

   boolean hq(int var1, int var2, int var3, int var4, boolean var5) {
      return this.be(this.dp, var1, var2, var3, var4, var5);
   }

   public kg et(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 == null ? null : var4.at;
   }

   boolean hi(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.dv + var3 * this.dt + var4 * this.dk + var5);
   }

   public void ez() {
      for(int var1 = 0; var1 < this.ar; ++var1) {
         kc var2 = this.al[var1];
         this.as(var2);
         this.al[var1] = null;
      }

      this.ar = 0;
   }

   public kc fe(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.al * 1838003371; ++var5) {
            kc var6 = var4.ad[var5];
            if (ce.ae(var6.ah * -4657194254713557903L) && var6.af * -2069611541 == var2 && var6.au * 64920415 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public kc ft(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.al * 1838003371; ++var5) {
            kc var6 = var4.ad[var5];
            if (ce.ae(var6.ah * -4657194254713557903L) && var6.af * -2069611541 == var2 && var6.au * 64920415 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public boolean dz(int var1, int var2, int var3, int var4, int var5, int var6, ju var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + -1823814896 * var5;
         int var13 = var3 * -714468050 + 838986754 * var6;
         return this.ai(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   void jg(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      qx var15 = new qx();
      var15.ae((float)((double)(-var2) * 0.0030679615D), (byte)-3);
      var15.ag((float)((double)(-var3) * 0.0030679615D), 173861664);
      var15.ax((float)var7, (float)var8, (float)var9, -192405633);
      qf var16 = new qf();
      var16.az(var15, 168135142);
      var16.ai((byte)-84);
      int var17 = this.ag % 300;
      float var18 = (float)var17 / 300.0F * 6.283F;
      float var19 = (float)Math.sin((double)var18);
      float var20 = (float)Math.cos((double)var18);
      float var21 = var19 * 3.14159F / 100.0F;
      float var22 = var20 * 3.14159F / 100.0F;
      qh var23 = new qh();
      qf var24 = new qf();
      var23.ac = new qd((float)((double)var1 * 0.0030679615D), var21, var22);
      var23.ae = new qv((float)var4, (float)var5, (float)var6);
      qf var25 = new qf();
      var25.ap(var23, -1199494898);
      var25.ai((byte)20);
      qh var26 = new qh();
      var26.ae = new qv((float)(-(this.ax * 64)), 0.0F, (float)(-(this.aq * 64)));
      qf var27 = new qf();
      var27.ap(var26, -1821779439);
      var24.ao(1.0F, 1.0F, 1.0F, 1.0F, (short)30293);
      var27.ah(var24, -2026724300);
      var24.ap(var23, 345999910);
      var27.ah(var24, -2127749806);
      var27.ah(var16, -2031394362);
      this.bd = (int)var25.ay((float)var7, (float)var8, (float)var9, -2125951925);
      this.bx = (int)var25.aj((float)var7, (float)var8, (float)var9, 844691753);
      this.bf = (int)var25.av((float)var7, (float)var8, (float)var9, 1552805161);
      this.bm = this.bd / 128;
      this.bs = this.bf / 128;
      this.bw = (int)var25.ay((float)var12, 0.0F, (float)var13, -2125951925) / 128;
      this.ba = (int)var25.av((float)var12, 0.0F, (float)var13, -735973613) / 128;
      ja var28 = new ja(var27);
      this.cq(var28, var14);
   }

   public long fp(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 != null && var4.af != null ? var4.af.at * -8087086773214451169L : 0L;
   }

   public long fr(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.al * 1838003371; ++var5) {
            kc var6 = var4.ad[var5];
            if (ce.ae(var6.ah * -4657194254713557903L) && var6.af * -2069611541 == var2 && var6.au * 64920415 == var3) {
               return var6.ah * -4657194254713557903L;
            }
         }

         return 0L;
      }
   }

   boolean jo(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.be; ++var4) {
         jz var5 = this.bc[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.ad * -481333385 == 1) {
            var6 = var5.aq * 1384818045 - var1;
            if (var6 > 0) {
               var7 = var5.at * 566424513 + (var5.ab * -1125774545 * var6 >> 8);
               var8 = var5.au * -1820248145 + (var5.az * -904349407 * var6 >> 8);
               var9 = var5.ar * 1743404645 + (var5.aa * 1554590207 * var6 >> 8);
               var10 = var5.al * 1135123739 + (var5.ai * 1751243225 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ad * -481333385 == 2) {
            var6 = var1 - var5.aq * 1384818045;
            if (var6 > 0) {
               var7 = var5.at * 566424513 + (var5.ab * -1125774545 * var6 >> 8);
               var8 = var5.au * -1820248145 + (var5.az * -904349407 * var6 >> 8);
               var9 = var5.ar * 1743404645 + (var5.aa * 1554590207 * var6 >> 8);
               var10 = var5.al * 1135123739 + (var5.ai * 1751243225 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ad * -481333385 == 3) {
            var6 = var5.at * 566424513 - var3;
            if (var6 > 0) {
               var7 = var5.aq * 1384818045 + (var5.ah * -53982503 * var6 >> 8);
               var8 = var5.af * 1043206691 + (var5.ap * 1620765077 * var6 >> 8);
               var9 = var5.ar * 1743404645 + (var5.aa * 1554590207 * var6 >> 8);
               var10 = var5.al * 1135123739 + (var5.ai * 1751243225 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ad * -481333385 == 4) {
            var6 = var3 - var5.at * 566424513;
            if (var6 > 0) {
               var7 = var5.aq * 1384818045 + (var5.ah * -53982503 * var6 >> 8);
               var8 = var5.af * 1043206691 + (var5.ap * 1620765077 * var6 >> 8);
               var9 = var5.ar * 1743404645 + (var5.aa * 1554590207 * var6 >> 8);
               var10 = var5.al * 1135123739 + (var5.ai * 1751243225 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ad * -481333385 == 5) {
            var6 = var2 - var5.ar * 1743404645;
            if (var6 > 0) {
               var7 = var5.aq * 1384818045 + (var5.ah * -53982503 * var6 >> 8);
               var8 = var5.af * 1043206691 + (var5.ap * 1620765077 * var6 >> 8);
               var9 = var5.at * 566424513 + (var5.ab * -1125774545 * var6 >> 8);
               var10 = var5.au * -1820248145 + (var5.az * -904349407 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public long fu(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.al * 1838003371; ++var5) {
            kc var6 = var4.ad[var5];
            if (ce.ae(var6.ah * -4657194254713557903L) && var6.af * -2069611541 == var2 && var6.au * 64920415 == var3) {
               return var6.ah * -4657194254713557903L;
            }
         }

         return 0L;
      }
   }

   void in() {
      int var1 = this.bq[this.av];
      jz[] var2 = this.bk[this.av];
      this.be = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         jz var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.ax * -1532244041 == 1) {
            var5 = var4.ac * -1042787705 - this.bm + this.ai;
            if (var5 >= 0 && var5 <= this.ai + this.ai) {
               var6 = var4.ag * 1488447437 - this.bs + this.ai;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.am * 702157191 - this.bs + this.ai;
               if (var7 > this.ai + this.ai) {
                  var7 = this.ai + this.ai;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cj(var5, var6++)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bd - var4.aq * 1384818045;
                  if (var9 > 32) {
                     var4.ad = -16115129;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.ad = -32230258;
                     var9 = -var9;
                  }

                  var4.ab = (var4.at * 566424513 - this.bf << 8) / var9 * -564061233;
                  var4.az = (var4.au * -1820248145 - this.bf << 8) / var9 * -1245050143;
                  var4.aa = (var4.ar * 1743404645 - this.bx << 8) / var9 * -1066215937;
                  var4.ai = (var4.al * 1135123739 - this.bx << 8) / var9 * -601024919;
                  this.bc[this.be++] = var4;
               }
            }
         } else if (var4.ax * -1532244041 == 2) {
            var5 = var4.ag * 1488447437 - this.bs + this.ai;
            if (var5 >= 0 && var5 <= this.ai + this.ai) {
               var6 = var4.ac * -1042787705 - this.bm + this.ai;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.ae * 437852685 - this.bm + this.ai;
               if (var7 > this.ai + this.ai) {
                  var7 = this.ai + this.ai;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cj(var6++, var5)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bf - var4.at * 566424513;
                  if (var9 > 32) {
                     var4.ad = -48345387;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.ad = -64460516;
                     var9 = -var9;
                  }

                  var4.ah = (var4.aq * 1384818045 - this.bd << 8) / var9 * -1997433495;
                  var4.ap = (var4.af * 1043206691 - this.bd << 8) / var9 * 2030705085;
                  var4.aa = (var4.ar * 1743404645 - this.bx << 8) / var9 * -1066215937;
                  var4.ai = (var4.al * 1135123739 - this.bx << 8) / var9 * -601024919;
                  this.bc[this.be++] = var4;
               }
            }
         } else if (var4.ax * -1532244041 == 4) {
            var5 = var4.ar * 1743404645 - this.bx;
            if (var5 > 128) {
               var6 = var4.ag * 1488447437 - this.bs + this.ai;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.am * 702157191 - this.bs + this.ai;
               if (var7 > this.ai + this.ai) {
                  var7 = this.ai + this.ai;
               }

               if (var6 <= var7) {
                  int var8 = var4.ac * -1042787705 - this.bm + this.ai;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.ae * 437852685 - this.bm + this.ai;
                  if (var9 > this.ai + this.ai) {
                     var9 = this.ai + this.ai;
                  }

                  boolean var10 = false;

                  label190:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (this.cj(var11, var12)) {
                           var10 = true;
                           break label190;
                        }
                     }
                  }

                  if (var10) {
                     var4.ad = -80575645;
                     var4.ah = (var4.aq * 1384818045 - this.bd << 8) / var5 * -1997433495;
                     var4.ap = (var4.af * 1043206691 - this.bd << 8) / var5 * 2030705085;
                     var4.ab = (var4.at * 566424513 - this.bf << 8) / var5 * -564061233;
                     var4.az = (var4.au * -1820248145 - this.bf << 8) / var5 * -1245050143;
                     this.bc[this.be++] = var4;
                  }
               }
            }
         }
      }

   }

   public long fs(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 != null && var4.au != null ? var4.au.ax * 3442899470081835915L : 0L;
   }

   boolean jr(int var1, int var2, int var3, int var4) {
      if (!this.cl(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.af[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > this.bd) {
                  if (!this.cb(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.cb(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cb(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.cb(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cb(var5, var9, var6)) {
                  return false;
               }

               if (!this.cb(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < this.bf) {
                  if (!this.cb(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.cb(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cb(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.cb(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cb(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.cb(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < this.bd) {
                  if (!this.cb(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.cb(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cb(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.cb(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.cb(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.cb(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > this.bf) {
                  if (!this.cb(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.cb(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.cb(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.cb(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.cb(var5, var9, var6)) {
                  return false;
               }

               if (!this.cb(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.cb(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.cb(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.cb(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.cb(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.cb(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   public long fn(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 != null && var4.au != null ? var4.au.ax * 3442899470081835915L : 0L;
   }

   public void fi(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.am; ++var4) {
         for(int var5 = 0; var5 < this.ax; ++var5) {
            for(int var6 = 0; var6 < this.aq; ++var6) {
               je var7 = this.at[var4][var5][var6];
               if (var7 != null) {
                  ku var8 = var7.af;
                  jv var10;
                  if (var8 != null && var8.aq instanceof jv) {
                     jv var9 = (jv)var8.aq;
                     this.by(var9, var4, var5, var6, 1, 1);
                     if (var8.af instanceof jv) {
                        var10 = (jv)var8.af;
                        this.by(var10, var4, var5, var6, 1, 1);
                        jv.ak(var9, var10, 0, 0, 0, false);
                        var8.af = var10.bn(var10.bs, var10.bw, var1, var2, var3);
                     }

                     var8.aq = var9.bn(var9.bs, var9.bw, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.al * 1838003371; ++var12) {
                     kc var14 = var7.ad[var12];
                     if (var14 != null && var14.ax instanceof jv) {
                        jv var11 = (jv)var14.ax;
                        this.by(var11, var4, var5, var6, var14.at * -782257431 - var14.af * -1787963763 + 1, var14.ar * -934216736 - var14.au * 64920415 + 1);
                        var14.ax = var11.bn(var11.bs, var11.bw, var1, var2, var3);
                     }
                  }

                  jf var13 = var7.au;
                  if (var13 != null && var13.am instanceof jv) {
                     var10 = (jv)var13.am;
                     this.bp(var10, var4, var5, var6);
                     var13.am = var10.bn(var10.bs, var10.bw, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   public int fo(int var1, int var2, int var3, long var4) {
      je var6 = this.at[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.af != null && var6.af.at * -8087086773214451169L == var4) {
         return var6.af.au * 231523475 & 255;
      } else if (var6.at != null && var6.at.ar * -4784704960526427281L == var4) {
         return var6.at.al * 1357024307 & 255;
      } else if (var6.au != null && var6.au.ax * 3442899470081835915L == var4) {
         return var6.au.aq * -886609405 & 255;
      } else {
         for(int var7 = 0; var7 < var6.al * 1838003371; ++var7) {
            if (var6.ad[var7].ah * -4657194254713557903L == var4) {
               return var6.ad[var7].ap * 876842249 & 255;
            }
         }

         return -1;
      }
   }

   public int fw(int var1, int var2, int var3, long var4) {
      je var6 = this.at[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.af != null && var6.af.at * -8087086773214451169L == var4) {
         return var6.af.au * 231523475 & 255;
      } else if (var6.at != null && var6.at.ar * -4784704960526427281L == var4) {
         return var6.at.al * 1357024307 & 255;
      } else if (var6.au != null && var6.au.ax * 3442899470081835915L == var4) {
         return var6.au.aq * -886609405 & 255;
      } else {
         for(int var7 = 0; var7 < var6.al * 1838003371; ++var7) {
            if (var6.ad[var7].ah * -4657194254713557903L == var4) {
               return var6.ad[var7].ap * 876842249 & 255;
            }
         }

         return -1;
      }
   }

   public void fd(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.am; ++var4) {
         for(int var5 = 0; var5 < this.ax; ++var5) {
            for(int var6 = 0; var6 < this.aq; ++var6) {
               je var7 = this.at[var4][var5][var6];
               if (var7 != null) {
                  ku var8 = var7.af;
                  jv var10;
                  if (var8 != null && var8.aq instanceof jv) {
                     jv var9 = (jv)var8.aq;
                     this.by(var9, var4, var5, var6, 1, 1);
                     if (var8.af instanceof jv) {
                        var10 = (jv)var8.af;
                        this.by(var10, var4, var5, var6, 1, 1);
                        jv.ak(var9, var10, 0, 0, 0, false);
                        var8.af = var10.bn(var10.bs, var10.bw, var1, var2, var3);
                     }

                     var8.aq = var9.bn(var9.bs, var9.bw, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.al * -2073455937; ++var12) {
                     kc var14 = var7.ad[var12];
                     if (var14 != null && var14.ax instanceof jv) {
                        jv var11 = (jv)var14.ax;
                        this.by(var11, var4, var5, var6, var14.at * 841273881 - var14.af * -2069611541 + 1, var14.ar * -1957480811 - var14.au * 1805430774 + 1);
                        var14.ax = var11.bn(var11.bs, var11.bw, var1, var2, var3);
                     }
                  }

                  jf var13 = var7.au;
                  if (var13 != null && var13.am instanceof jv) {
                     var10 = (jv)var13.am;
                     this.bp(var10, var4, var5, var6);
                     var13.am = var10.bn(var10.bs, var10.bw, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   boolean hz(int var1, int var2, int var3, int var4) {
      return this.bk(this.df, var1, var2, var3, var4);
   }

   public jh(int var1, int var2, int var3, int var4, int var5, in var6, int[][][] var7) {
      this.ao = in.ac;
      this.as = 0;
      this.ay = 0;
      this.aj = 0;
      this.av = 0;
      this.by = new kc[100];
      this.bb = false;
      this.bi = 0;
      this.bg = 0;
      this.bl = 0;
      this.bz = -1;
      this.bu = -1;
      this.br = false;
      this.bt = 4;
      this.bq = new int[this.bt];
      this.bk = new jz[this.bt][500];
      this.be = 0;
      this.bc = new jz[500];
      this.cn = new pk();
      this.ct = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
      this.cq = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
      this.cc = new int[9];
      this.am = var2;
      this.ax = var3;
      this.aq = var4;
      this.at = new je[var2][var3][var4];
      this.ad = new int[var2][var3 + 1][var4 + 1];
      this.af = var7;
      this.ai = var5;
      this.ao = var6;
      this.ac = var1;
      if (var1 != -1) {
         this.ca = 0;
         this.cs = null;
         this.cp = null;
         this.cb = 0;
         this.cd = 0;
         this.ce = 0;
         this.ck = 0;
         this.dp = null;
         this.df = null;
         this.dv = 0;
         this.dt = 0;
         this.dk = 0;
      } else {
         this.ca = 8386816;
         this.cs = new BitSet(this.ca);
         this.cp = new BitSet(this.ca);
         this.cb = 1048352;
         this.cd = 32761;
         this.ce = 181;
         this.ck = 9644832;
         this.dp = new BitSet(this.ck);
         this.df = new BitSet(this.ck);
         this.dv = 1071648;
         this.dt = 33489;
         this.dk = 183;
      }

      ji.ad(var5);
      this.ac();
   }

   void fm(jv var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.ax) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.aq && (var9 >= var6 || var10 >= var8)) {
                  je var11 = this.at[var2][var9][var10];
                  if (var11 != null && var11.au != null && var11.au.am instanceof jv) {
                     int var12 = this.bb(var2, var9, var10, var2, var3, var4);
                     jv var13 = (jv)var11.au.am;
                     jv.ak(var1, var13, (var9 - var3) * -1603867203, var12, (var10 - var4) * 2019664834, true);
                  }
               }
            }
         }
      }

   }

   void fx(jv var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.ax) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.aq && (var9 >= var6 || var10 >= var8)) {
                  je var11 = this.at[var2][var9][var10];
                  if (var11 != null && var11.au != null && var11.au.am instanceof jv) {
                     int var12 = this.bb(var2, var9, var10, var2, var3, var4);
                     jv var13 = (jv)var11.au.am;
                     jv.ak(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }

   }

   boolean gi(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.cb + var3 * this.cd + var4 * this.ce + var5, var6);
      return var6;
   }

   public void ix() {
      this.br = true;
   }

   public void dw(int var1, int var2, int var3, int var4, ju var5, long var6, ju var8, ju var9) {
      ic var10 = new ic();
      var10.am = var5;
      var10.ae = var2 * 1500255594 + 829159872;
      var10.ag = var3 * 1312568448 + -32714236;
      var10.ac = var4 * -1977544343;
      var10.af = var6 * 3144815386490952633L;
      var10.ax = var8;
      var10.aq = var9;
      int var11 = 0;
      je var12 = this.at[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.al * 412245052; ++var13) {
            if ((var12.ad[var13].ap * 876842249 & 617205691) == 256 && var12.ad[var13].ax instanceof jm) {
               jm var14 = (jm)var12.ad[var13].ax;
               var14.au();
               if (var14.ev * -1141910865 > var11) {
                  var11 = var14.ev * -171063932;
               }
            }
         }
      }

      var10.at = var11 * 1487014984;
      if (this.at[var1][var2][var3] == null) {
         this.at[var1][var2][var3] = new je(var1, var2, var3);
      }

      this.at[var1][var2][var3].ar = var10;
   }

   void fl(jv var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.am) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.ax) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.aq && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        je var15 = this.at[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = this.bb(var12, var13, var14, var2, var3, var4);
                           ku var17 = var15.af;
                           if (var17 != null) {
                              jv var18;
                              if (var17.aq instanceof jv) {
                                 var18 = (jv)var17.aq;
                                 jv.ak(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.af instanceof jv) {
                                 var18 = (jv)var17.af;
                                 jv.ak(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.al * 1838003371; ++var23) {
                              kc var19 = var15.ad[var23];
                              if (var19 != null && var19.ax instanceof jv) {
                                 jv var20 = (jv)var19.ax;
                                 int var21 = var19.at * 1336638479 - var19.af * -2069611541 + 1;
                                 int var22 = var19.ar * -153684557 - var19.au * 64920415 + 1;
                                 jv.ak(var1, var20, (var19.af * -2069611541 - var3) * 128 + (var21 - var5) * 64, var16, (var19.au * 64920415 - var4) * 128 + (var22 - var6) * 64, var7);
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

   int ga(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.bi(var1, var2, var3) - this.bi(var4, var5, var6);
   }

   public int fh(int var1, int var2, int var3, long var4) {
      je var6 = this.at[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.af != null && var6.af.at * -8087086773214451169L == var4) {
         return var6.af.au * 231523475 & 1883265094;
      } else if (var6.at != null && var6.at.ar * -4784704960526427281L == var4) {
         return var6.at.al * -102012030 & -1402267770;
      } else if (var6.au != null && var6.au.ax * 3442899470081835915L == var4) {
         return var6.au.aq * 1597755010 & 255;
      } else {
         for(int var7 = 0; var7 < var6.al * 917806788; ++var7) {
            if (var6.ad[var7].ah * -4657194254713557903L == var4) {
               return var6.ad[var7].ap * 876842249 & 255;
            }
         }

         return -1;
      }
   }

   void ev(kc var1) {
      for(int var2 = var1.af * -2069611541; var2 <= var1.at * 1336638479; ++var2) {
         for(int var3 = var1.au * 64920415; var3 <= var1.ar * -153684557; ++var3) {
            je var4 = this.at[var1.ac * 88485587][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.al * 1838003371; ++var5) {
                  if (var4.ad[var5] == var1) {
                     var4.al -= -1668241917;

                     for(int var6 = var5; var6 < var4.al * 1838003371; ++var6) {
                        var4.ad[var6] = var4.ad[var6 + 1];
                        var4.ah[var6] = var4.ah[var6 + 1];
                     }

                     var4.ad[var4.al * 1838003371] = null;
                     break;
                  }
               }

               var4.ap = 0;

               for(var5 = 0; var5 < var4.al * 1838003371; ++var5) {
                  var4.ap = (var4.ap * 1948448495 | var4.ah[var5]) * -117114865;
               }
            }
         }
      }

   }

   int ge(int var1, int var2, int var3) {
      return (this.af[var1][var2][var3] + this.af[var1][var2 + 1][var3] + this.af[var1][var2][var3 + 1] + this.af[var1][var2 + 1][var3 + 1]) / 4;
   }

   boolean gr(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.cb + var3 * this.cd + var4 * this.ce + var5, var6);
      return var6;
   }

   int go(int var1, int var2, int var3) {
      return (this.af[var1][var2][var3] + this.af[var1][var2 + 1][var3] + this.af[var1][var2][var3 + 1] + this.af[var1][var2 + 1][var3 + 1]) / 4;
   }

   boolean cb(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.be; ++var4) {
         jz var5 = this.bc[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.ad * -481333385 == 1) {
            var6 = var5.aq * 1384818045 - var1;
            if (var6 > 0) {
               var7 = var5.at * 566424513 + (var5.ab * -1125774545 * var6 >> 8);
               var8 = var5.au * -1820248145 + (var5.az * -904349407 * var6 >> 8);
               var9 = var5.ar * 1743404645 + (var5.aa * 1554590207 * var6 >> 8);
               var10 = var5.al * 1135123739 + (var5.ai * 1751243225 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ad * -481333385 == 2) {
            var6 = var1 - var5.aq * 1384818045;
            if (var6 > 0) {
               var7 = var5.at * 566424513 + (var5.ab * -1125774545 * var6 >> 8);
               var8 = var5.au * -1820248145 + (var5.az * -904349407 * var6 >> 8);
               var9 = var5.ar * 1743404645 + (var5.aa * 1554590207 * var6 >> 8);
               var10 = var5.al * 1135123739 + (var5.ai * 1751243225 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ad * -481333385 == 3) {
            var6 = var5.at * 566424513 - var3;
            if (var6 > 0) {
               var7 = var5.aq * 1384818045 + (var5.ah * -53982503 * var6 >> 8);
               var8 = var5.af * 1043206691 + (var5.ap * 1620765077 * var6 >> 8);
               var9 = var5.ar * 1743404645 + (var5.aa * 1554590207 * var6 >> 8);
               var10 = var5.al * 1135123739 + (var5.ai * 1751243225 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ad * -481333385 == 4) {
            var6 = var3 - var5.at * 566424513;
            if (var6 > 0) {
               var7 = var5.aq * 1384818045 + (var5.ah * -53982503 * var6 >> 8);
               var8 = var5.af * 1043206691 + (var5.ap * 1620765077 * var6 >> 8);
               var9 = var5.ar * 1743404645 + (var5.aa * 1554590207 * var6 >> 8);
               var10 = var5.al * 1135123739 + (var5.ai * 1751243225 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ad * -481333385 == 5) {
            var6 = var2 - var5.ar * 1743404645;
            if (var6 > 0) {
               var7 = var5.aq * 1384818045 + (var5.ah * -53982503 * var6 >> 8);
               var8 = var5.af * 1043206691 + (var5.ap * 1620765077 * var6 >> 8);
               var9 = var5.at * 566424513 + (var5.ab * -1125774545 * var6 >> 8);
               var10 = var5.au * -1820248145 + (var5.az * -904349407 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   boolean bk(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.dv + var3 * this.dt + var4 * this.dk + var5);
   }

   public void gf(int var1) {
      this.ai = ef.at(25, 90, var1, -565314116);
      ji.ad(this.ai);
      if (this.cc != null && this.cc.length > 0) {
         this.cu(this.cc, this.cz, this.cw, this.cr, this.cl);
      }

   }

   public void gx(int var1) {
      this.ai = ef.at(25, 90, var1, -565314116);
      ji.ad(this.ai);
      if (this.cc != null && this.cc.length > 0) {
         this.cu(this.cc, this.cz, this.cw, this.cr, this.cl);
      }

   }

   public void gu(int var1) {
      this.ai = ef.at(25, 92047380, var1, -565314116);
      ji.ad(this.ai);
      if (this.cc != null && this.cc.length > 0) {
         this.cu(this.cc, this.cz, this.cw, this.cr, this.cl);
      }

   }

   public boolean dn(int var1, int var2, int var3, int var4, int var5, ju var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.ai(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   boolean hn(int var1, int var2, int var3, int var4, boolean var5) {
      return this.be(this.dp, var1, var2, var3, var4, var5);
   }

   boolean gz(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.cb + var3 * this.cd + var4 * this.ce + var5);
   }

   boolean gm(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.cb + var3 * this.cd + var4 * this.ce + var5);
   }

   boolean gc(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.cb + var3 * this.cd + var4 * this.ce + var5);
   }

   boolean gw(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.cb + var3 * this.cd + var4 * this.ce + var5);
   }

   public void dt(int var1, int var2) {
      je var3 = this.at[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         je var5 = this.at[var4][var1][var2] = this.at[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.ac -= -1716693939;

            for(int var6 = 0; var6 < var5.al * 1838003371; ++var6) {
               kc var7 = var5.ad[var6];
               if (ce.ae(var7.ah * -4657194254713557903L) && var7.af * -2069611541 == var1 && var7.au * 64920415 == var2) {
                  var7.ac -= -547202725;
               }
            }
         }
      }

      if (this.at[0][var1][var2] == null) {
         this.at[0][var1][var2] = new je(0, var1, var2);
      }

      this.at[0][var1][var2].av = var3;
      this.at[3][var1][var2] = null;
   }

   int gb(int var1, int var2, int var3) {
      return (this.af[var1][var2][var3] + this.af[var1][var2 + 1][var3] + this.af[var1][var2][var3 + 1] + this.af[var1][var2 + 1][var3 + 1]) / 4;
   }

   boolean gv(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.cb + var3 * this.cd + var4 * this.ce + var5, var6);
      return var6;
   }

   public void ib(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.ax * 128) {
         var1 = this.ax * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.aq * 128) {
         var3 = this.aq * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      this.cm((var4 - 128) / 32, var5 / 64);
      this.bd = var1;
      this.bx = var2;
      this.bf = var3;
      this.bm = var1 / 128;
      this.bs = var3 / 128;
      this.bw = var7 / 128;
      this.ba = var8 / 128;
      this.av = var6;
      jo var10 = new jo(var1, var2, var3, var4, var5, var7, var8);
      this.cq(var10, var9);
   }

   boolean gk(int var1, int var2, int var3, int var4) {
      return this.bu(this.cs, var1, var2, var3, var4);
   }

   public void ei(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         var4.af = null;
      }
   }

   boolean gy(int var1, int var2, int var3, int var4, boolean var5) {
      return this.br(this.cs, var1, var2, var3, var4, var5);
   }

   public jf fk(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 != null && var4.au != null ? var4.au : null;
   }

   boolean hf(int var1, int var2, int var3, int var4) {
      return this.bu(this.cp, var1, var2, var3, var4);
   }

   boolean he(int var1, int var2, int var3, int var4, boolean var5) {
      return this.br(this.cp, var1, var2, var3, var4, var5);
   }

   boolean hr(int var1, int var2, int var3, int var4, boolean var5) {
      return this.br(this.cp, var1, var2, var3, var4, var5);
   }

   boolean hk(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.dv + var3 * this.dt + var4 * this.dk + var5);
   }

   public int ba(int var1, int var2, int var3, long var4) {
      je var6 = this.at[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.af != null && var6.af.at * -8087086773214451169L == var4) {
         return var6.af.au * 231523475 & 255;
      } else if (var6.at != null && var6.at.ar * -4784704960526427281L == var4) {
         return var6.at.al * 1357024307 & 255;
      } else if (var6.au != null && var6.au.ax * 3442899470081835915L == var4) {
         return var6.au.aq * -886609405 & 255;
      } else {
         for(int var7 = 0; var7 < var6.al * 1838003371; ++var7) {
            if (var6.ad[var7].ah * -4657194254713557903L == var4) {
               return var6.ad[var7].ap * 876842249 & 255;
            }
         }

         return -1;
      }
   }

   boolean ia(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = jw.am;
      int[] var7 = jw.ax;
      int var8 = var6[var4];
      int var9 = var7[var4];
      int var10 = var6[var5];
      int var11 = var7[var5];
      int var12 = var3 * var10 + var1 * var11 >> 16;
      int var13 = var3 * var11 - var1 * var10 >> 16;
      int var14 = var2 * var8 + var13 * var9 >> 16;
      int var15 = var2 * var9 - var13 * var8 >> 16;
      if (var14 >= -1561723605 && var14 <= ji.ar()) {
         int var16 = this.dc + var12 * 128 / var14;
         int var17 = this.dw + var15 * -458860759 / var14;
         return var16 >= this.de && var16 <= this.dj && var17 >= this.dx && var17 <= this.do;
      } else {
         return false;
      }
   }

   boolean hd(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.dv + var3 * this.dt + var4 * this.dk + var5);
   }

   boolean hj(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.dv + var3 * this.dt + var4 * this.dk + var5, var6);
      return var6;
   }

   boolean hw(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.dv + var3 * this.dt + var4 * this.dk + var5, var6);
      return var6;
   }

   boolean hg(int var1, int var2, int var3, int var4) {
      return this.bk(this.dp, var1, var2, var3, var4);
   }

   boolean hp(int var1, int var2, int var3, int var4) {
      return this.bk(this.dp, var1, var2, var3, var4);
   }

   public void ek(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.al * 1838003371; ++var5) {
            kc var6 = var4.ad[var5];
            if (ce.ae(var6.ah * -4657194254713557903L) && var6.af * -2069611541 == var2 && var6.au * 64920415 == var3) {
               this.as(var6);
               return;
            }
         }

      }
   }

   boolean hb(int var1, int var2, int var3, int var4, boolean var5) {
      return this.be(this.dp, var1, var2, var3, var4, var5);
   }

   boolean is(int var1, int var2, int var3, int var4) {
      if (!this.ch(var1, var2, var3, var4)) {
         return this.bc(var1, var2, var3, var4);
      } else {
         this.cf(var1, var2, var3, var4, false);
         int var5 = var1 * 32 + 128;
         int var6 = var2 * 64;
         int var7 = (var3 - this.ai - this.as - 1) * 128;
         int var8 = (var4 - this.ai - this.ay - 1) * 128;

         for(int var9 = -this.cz; var9 <= this.cw; var9 += 128) {
            if (this.ci(var7, this.cc[var1] + var9, var8, var5, var6)) {
               return this.cn(var1, var2, var3, var4, true);
            }
         }

         return this.cn(var1, var2, var3, var4, false);
      }
   }

   boolean hm(int var1, int var2, int var3, int var4) {
      return this.bk(this.df, var1, var2, var3, var4);
   }

   public void ij() {
      this.br = true;
   }

   public void ii(int var1, int var2, int var3, boolean var4) {
      if (!this.cv() || var4) {
         this.bb = true;
         this.br = var4;
         this.bi = var1;
         this.bg = var2;
         this.bl = var3;
         this.bz = -1;
         this.bu = -1;
      }
   }

   void eo(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      qx var15 = new qx();
      var15.ae((float)((double)(-var2) * 0.0030679615D), (byte)-124);
      var15.ag((float)((double)(-var3) * 0.0030679615D), -679832232);
      var15.ax((float)var7, (float)var8, (float)var9, -192405633);
      qf var16 = new qf();
      var16.az(var15, 716692522);
      var16.ai((byte)-43);
      int var17 = this.ag % 300;
      float var18 = (float)var17 / 300.0F * 6.283F;
      float var19 = (float)Math.sin((double)var18);
      float var20 = (float)Math.cos((double)var18);
      float var21 = var19 * 3.14159F / 100.0F;
      float var22 = var20 * 3.14159F / 100.0F;
      qh var23 = new qh();
      qf var24 = new qf();
      var23.ac = new qd((float)((double)var1 * 0.0030679615D), var21, var22);
      var23.ae = new qv((float)var4, (float)var5, (float)var6);
      qf var25 = new qf();
      var25.ap(var23, 213992596);
      var25.ai((byte)-26);
      qh var26 = new qh();
      var26.ae = new qv((float)(-(this.ax * 64)), 0.0F, (float)(-(this.aq * 64)));
      qf var27 = new qf();
      var27.ap(var26, 439773479);
      var24.ao(1.0F, 1.0F, 1.0F, 1.0F, (short)-14059);
      var27.ah(var24, -2014557435);
      var24.ap(var23, 77121874);
      var27.ah(var24, -2048451938);
      var27.ah(var16, -2109723882);
      this.bd = (int)var25.ay((float)var7, (float)var8, (float)var9, -2125951925);
      this.bx = (int)var25.aj((float)var7, (float)var8, (float)var9, 844691753);
      this.bf = (int)var25.av((float)var7, (float)var8, (float)var9, 1626167259);
      this.bm = this.bd / 128;
      this.bs = this.bf / 128;
      this.bw = (int)var25.ay((float)var12, 0.0F, (float)var13, -2125951925) / 128;
      this.ba = (int)var25.av((float)var12, 0.0F, (float)var13, 1647173988) / 128;
      ja var28 = new ja(var27);
      this.cq(var28, var14);
   }

   boolean hh(int var1, int var2, int var3, int var4, boolean var5) {
      return this.be(this.df, var1, var2, var3, var4, var5);
   }

   public void fc(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.am; ++var4) {
         for(int var5 = 0; var5 < this.ax; ++var5) {
            for(int var6 = 0; var6 < this.aq; ++var6) {
               je var7 = this.at[var4][var5][var6];
               if (var7 != null) {
                  ku var8 = var7.af;
                  jv var10;
                  if (var8 != null && var8.aq instanceof jv) {
                     jv var9 = (jv)var8.aq;
                     this.by(var9, var4, var5, var6, 1, 1);
                     if (var8.af instanceof jv) {
                        var10 = (jv)var8.af;
                        this.by(var10, var4, var5, var6, 1, 1);
                        jv.ak(var9, var10, 0, 0, 0, false);
                        var8.af = var10.bn(var10.bs, var10.bw, var1, var2, var3);
                     }

                     var8.aq = var9.bn(var9.bs, var9.bw, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.al * 1838003371; ++var12) {
                     kc var14 = var7.ad[var12];
                     if (var14 != null && var14.ax instanceof jv) {
                        jv var11 = (jv)var14.ax;
                        this.by(var11, var4, var5, var6, var14.at * 1336638479 - var14.af * 93905753 + 1, var14.ar * 229420499 - var14.au * 1996898756 + 1);
                        var14.ax = var11.bn(var11.bs, var11.bw, var1, var2, var3);
                     }
                  }

                  jf var13 = var7.au;
                  if (var13 != null && var13.am instanceof jv) {
                     var10 = (jv)var13.am;
                     this.bp(var10, var4, var5, var6);
                     var13.am = var10.bn(var10.bs, var10.bw, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   void hl(int var1, int var2) {
      this.dl = var1;
      this.db = var2;
   }

   void as(kc var1) {
      for(int var2 = var1.af * -2069611541; var2 <= var1.at * 1336638479; ++var2) {
         for(int var3 = var1.au * 64920415; var3 <= var1.ar * -153684557; ++var3) {
            je var4 = this.at[var1.ac * 88485587][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.al * 1838003371; ++var5) {
                  if (var4.ad[var5] == var1) {
                     var4.al -= -1668241917;

                     for(int var6 = var5; var6 < var4.al * 1838003371; ++var6) {
                        var4.ad[var6] = var4.ad[var6 + 1];
                        var4.ah[var6] = var4.ah[var6 + 1];
                     }

                     var4.ad[var4.al * 1838003371] = null;
                     break;
                  }
               }

               var4.ap = 0;

               for(var5 = 0; var5 < var4.al * 1838003371; ++var5) {
                  var4.ap = (var4.ap * 1948448495 | var4.ah[var5]) * -117114865;
               }
            }
         }
      }

   }

   void hx(int var1, int var2) {
      this.dl = var1;
      this.db = var2;
   }

   boolean ho(int var1, int var2) {
      if (!this.bt(this.dl, this.db, var1, var2)) {
         return this.bo(this.dl, this.db, var1, var2);
      } else {
         this.bq(this.dl, this.db, var1, var2, false);
         boolean var3 = false;

         for(int var4 = -1; var4 <= 1; ++var4) {
            for(int var5 = -1; var5 <= 1; ++var5) {
               if (this.cx(this.dl, this.db, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.cx(this.dl, (this.db + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.cx(this.dl + 1, this.db, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.cx(this.dl + 1, (this.db + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return this.bv(this.dl, this.db, var1, var2, var3);
      }
   }

   boolean hs(int var1, int var2) {
      if (!this.bt(this.dl, this.db, var1, var2)) {
         return this.bo(this.dl, this.db, var1, var2);
      } else {
         this.bq(this.dl, this.db, var1, var2, false);
         boolean var3 = false;

         for(int var4 = -1; var4 <= 1; ++var4) {
            for(int var5 = -1; var5 <= 1; ++var5) {
               if (this.cx(this.dl, this.db, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.cx(this.dl, (this.db + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.cx(this.dl + 1, this.db, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.cx(this.dl + 1, (this.db + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return this.bv(this.dl, this.db, var1, var2, var3);
      }
   }

   boolean ie(int var1, int var2) {
      if (!this.bt(this.dl, this.db, var1, var2)) {
         return this.bo(this.dl, this.db, var1, var2);
      } else {
         this.bq(this.dl, this.db, var1, var2, false);
         boolean var3 = false;

         for(int var4 = -1; var4 <= 1; ++var4) {
            for(int var5 = -1; var5 <= 1; ++var5) {
               if (this.cx(this.dl, this.db, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.cx(this.dl, (this.db + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.cx(this.dl + 1, this.db, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.cx(this.dl + 1, (this.db + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return this.bv(this.dl, this.db, var1, var2, var3);
      }
   }

   boolean id(int var1, int var2, int var3, int var4) {
      if (!this.ch(var1, var2, var3, var4)) {
         return this.bc(var1, var2, var3, var4);
      } else {
         this.cf(var1, var2, var3, var4, false);
         int var5 = var1 * 701348149 + -173578394;
         int var6 = var2 * 64;
         int var7 = (var3 - this.ai - this.as - 1) * 128;
         int var8 = (var4 - this.ai - this.ay - 1) * 128;

         for(int var9 = -this.cz; var9 <= this.cw; var9 += 128) {
            if (this.ci(var7, this.cc[var1] + var9, var8, var5, var6)) {
               return this.cn(var1, var2, var3, var4, true);
            }
         }

         return this.cn(var1, var2, var3, var4, false);
      }
   }

   public kc bd(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.al * 1838003371; ++var5) {
            kc var6 = var4.ad[var5];
            if (ce.ae(var6.ah * -4657194254713557903L) && var6.af * -2069611541 == var2 && var6.au * 64920415 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public void iv() {
      this.bz = -1;
      this.br = false;
   }

   boolean if(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = jw.am;
      int[] var7 = jw.ax;
      int var8 = var6[var4];
      int var9 = var7[var4];
      int var10 = var6[var5];
      int var11 = var7[var5];
      int var12 = var3 * var10 + var1 * var11 >> 16;
      int var13 = var3 * var11 - var1 * var10 >> 16;
      int var14 = var2 * var8 + var13 * var9 >> 16;
      int var15 = var2 * var9 - var13 * var8 >> 16;
      if (var14 >= 50 && var14 <= ji.ar()) {
         int var16 = this.dc + var12 * 128 / var14;
         int var17 = this.dw + var15 * 128 / var14;
         return var16 >= this.de && var16 <= this.dj && var17 >= this.dx && var17 <= this.do;
      } else {
         return false;
      }
   }

   public kg fv(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 == null ? null : var4.at;
   }

   public void iz(int var1, int var2, int var3, boolean var4) {
      if (!this.cv() || var4) {
         this.bb = true;
         this.br = var4;
         this.bi = var1;
         this.bg = var2;
         this.bl = var3;
         this.bz = -1;
         this.bu = -1;
      }
   }

   public long fg(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.al * 1838003371; ++var5) {
            kc var6 = var4.ad[var5];
            if (ce.ae(var6.ah * -4657194254713557903L) && var6.af * -2069611541 == var2 && var6.au * 887756472 == var3) {
               return var6.ah * -4657194254713557903L;
            }
         }

         return 0L;
      }
   }

   public void ip() {
      this.br = true;
   }

   public long bw(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 != null && var4.au != null ? var4.au.ax * 3442899470081835915L : 0L;
   }

   public void ir() {
      this.br = true;
   }

   public boolean it() {
      return this.br && this.bz != -1;
   }

   boolean br(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.cb + var3 * this.cd + var4 * this.ce + var5, var6);
      return var6;
   }

   boolean hu(int var1, int var2, int var3, int var4) {
      return this.bk(this.df, var1, var2, var3, var4);
   }

   public void dk(int var1, int var2) {
      je var3 = this.at[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         je var5 = this.at[var4][var1][var2] = this.at[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.ac -= -734066229;

            for(int var6 = 0; var6 < var5.al * -167408139; ++var6) {
               kc var7 = var5.ad[var6];
               if (ce.ae(var7.ah * -4657194254713557903L) && var7.af * -1659132676 == var1 && var7.au * 159231908 == var2) {
                  var7.ac -= -487641568;
               }
            }
         }
      }

      if (this.at[0][var1][var2] == null) {
         this.at[0][var1][var2] = new je(0, var1, var2);
      }

      this.at[0][var1][var2].av = var3;
      this.at[3][var1][var2] = null;
   }

   public void io() {
      this.bz = -1;
      this.br = false;
   }

   public void ik(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.ax * 233360991) {
         var1 = this.ax * -1091869754 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.aq * 128) {
         var3 = this.aq * 128 - 1;
      }

      if (var4 < 2028986068) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      this.cm((var4 - -963635924) / 32, var5 / 64);
      this.bd = var1;
      this.bx = var2;
      this.bf = var3;
      this.bm = var1 / 128;
      this.bs = var3 / 128;
      this.bw = var7 / 128;
      this.ba = var8 / -3582945;
      this.av = var6;
      jo var10 = new jo(var1, var2, var3, var4, var5, var7, var8);
      this.cq(var10, var9);
   }

   boolean hc(int var1, int var2, int var3, int var4) {
      return this.bu(this.cp, var1, var2, var3, var4);
   }

   void ig(jx var1, boolean var2) {
      ++this.aw;
      boolean var3 = this.ac == -1;
      this.bj = !var2 && this.ao != in.ac ? this.bw : this.bm;
      this.bp = !var2 && this.ao != in.ac ? this.ba : this.bs;
      if (var3) {
         this.an = this.bj - this.ai;
         if (this.an < 0) {
            this.an = 0;
         }

         this.bn = this.bp - this.ai;
         if (this.bn < 0) {
            this.bn = 0;
         }

         this.ak = this.bj + this.ai;
         if (this.ak > this.ax) {
            this.ak = this.ax;
         }

         this.bh = this.bp + this.ai;
         if (this.bh > this.aq) {
            this.bh = this.aq;
         }
      } else {
         this.an = 0;
         this.bn = 0;
         this.ak = this.ax;
         this.bh = this.aq;
      }

      this.as = this.bm - this.bj;
      this.ay = this.bs - this.bp;
      if (var3) {
         this.cr();
      }

      this.aj = 0;

      int var4;
      je[][] var5;
      int var6;
      int var7;
      je var8;
      for(var4 = this.au; var4 < this.am; ++var4) {
         var5 = this.at[var4];

         for(var6 = this.an; var6 < this.ak; ++var6) {
            for(var7 = this.bn; var7 < this.bh; ++var7) {
               var8 = var5[var6][var7];
               if (var8 != null) {
                  if (var8.ab * 27132243 <= this.av && (!var3 || this.cj(var6 - this.bm + this.as + this.ai, var7 - this.bs + this.ay + this.ai) || this.af[var4][var6][var7] - this.bx >= -1380545457)) {
                     var8.az = true;
                     var8.aa = true;
                     if (var8.al * 1838003371 > 0) {
                        var8.ai = true;
                     } else {
                        var8.ai = false;
                     }

                     ++this.aj;
                  } else {
                     var8.az = false;
                     var8.aa = false;
                     var8.ao = 0;
                  }
               }
            }
         }
      }

      if (var3) {
         var4 = Math.abs(this.as);
         int var15 = Math.abs(this.ay);

         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         je var14;
         je[][] var16;
         int var17;
         for(var6 = this.au; var6 < this.am; ++var6) {
            var16 = this.at[var6];

            for(var17 = -(this.ai + var4); var17 <= 0; ++var17) {
               var9 = this.bm + var17;
               var10 = this.bm - var17;
               if (var9 >= this.an || var10 < this.ak) {
                  for(var11 = -(this.ai + var15); var11 <= 0; ++var11) {
                     var12 = this.bs + var11;
                     var13 = this.bs - var11;
                     if (var9 >= this.an && var9 < this.ak) {
                        if (var12 >= this.bn && var12 < this.bh) {
                           var14 = var16[var9][var12];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, true);
                           }
                        }

                        if (var13 >= this.bn && var13 < this.bh) {
                           var14 = var16[var9][var13];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, true);
                           }
                        }
                     }

                     if (var10 >= this.an && var10 < this.ak) {
                        if (var12 >= this.bn && var12 < this.bh) {
                           var14 = var16[var10][var12];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, true);
                           }
                        }

                        if (var13 >= this.bn && var13 < this.bh) {
                           var14 = var16[var10][var13];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, true);
                           }
                        }
                     }

                     if (this.aj == 0) {
                        this.bb = false;
                        return;
                     }
                  }
               }
            }
         }

         for(var6 = this.au; var6 < this.am; ++var6) {
            var16 = this.at[var6];

            for(var17 = -this.ai; var17 <= 0; ++var17) {
               var9 = this.bj + var17;
               var10 = this.bj - var17;
               if (var9 >= this.an || var10 < this.ak) {
                  for(var11 = -this.ai; var11 <= 0; ++var11) {
                     var12 = this.bp + var11;
                     var13 = this.bp - var11;
                     if (var9 >= this.an && var9 < this.ak) {
                        if (var12 >= this.bn && var12 < this.bh) {
                           var14 = var16[var9][var12];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, false);
                           }
                        }

                        if (var13 >= this.bn && var13 < this.bh) {
                           var14 = var16[var9][var13];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, false);
                           }
                        }
                     }

                     if (var10 >= this.an && var10 < this.ak) {
                        if (var12 >= this.bn && var12 < this.bh) {
                           var14 = var16[var10][var12];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, false);
                           }
                        }

                        if (var13 >= this.bn && var13 < this.bh) {
                           var14 = var16[var10][var13];
                           if (var14 != null && var14.az) {
                              this.cc(var1, var14, false);
                           }
                        }
                     }

                     if (this.aj == 0) {
                        this.bb = false;
                        return;
                     }
                  }
               }
            }
         }

         this.bb = false;
      } else {
         for(var4 = this.au; var4 < this.am; ++var4) {
            var5 = this.at[var4];

            for(var6 = this.an; var6 < this.ak; ++var6) {
               for(var7 = this.bn; var7 < this.bh; ++var7) {
                  var8 = var5[var6][var7];
                  if (var8 != null && var8.az) {
                     this.cc(var1, var8, true);
                  }
               }
            }
         }
      }

   }

   void iy(jx var1, je var2, boolean var3) {
      this.cn.ae(var2);

      while(true) {
         je var4;
         int var5;
         int var6;
         int var7;
         int var8;
         je[][] var9;
         je var10;
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
                              ku var11;
                              kc var13;
                              int var17;
                              int var18;
                              int var19;
                              int var21;
                              boolean var22;
                              je var33;
                              while(true) {
                                 do {
                                    var4 = (je)this.cn.ax();
                                    if (var4 == null) {
                                       return;
                                    }
                                 } while(!var4.aa);

                                 var5 = var4.ae * 184593053;
                                 var6 = var4.ag * -1775365173;
                                 var7 = var4.ac * -1691745147;
                                 var8 = var4.am * -1260082436;
                                 var9 = this.at[var7];
                                 if (!var4.az) {
                                    break;
                                 }

                                 if (var3) {
                                    if (var7 > 0) {
                                       var10 = this.at[var7 - 1][var5][var6];
                                       if (var10 != null && var10.aa) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= this.bm && var5 > this.an) {
                                       var10 = var9[var5 - 1][var6];
                                       if (var10 != null && var10.aa && (var10.az || (var4.ap * 1948448495 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= this.bm && var5 < this.ak - 1) {
                                       var10 = var9[var5 + 1][var6];
                                       if (var10 != null && var10.aa && (var10.az || (var4.ap * 1948448495 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 <= this.bs && var6 > this.bn) {
                                       var10 = var9[var5][var6 - 1];
                                       if (var10 != null && var10.aa && (var10.az || (var4.ap * 1948448495 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 >= this.bs && var6 < this.bh - 1) {
                                       var10 = var9[var5][var6 + 1];
                                       if (var10 != null && var10.aa && (var10.az || (var4.ap * -1601006570 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var3 = true;
                                 }

                                 var4.az = false;
                                 if (var4.av != null) {
                                    var10 = var4.av;
                                    if (var10.ax != null) {
                                       if (!this.cl(0, var5, var6)) {
                                          var1.ae(this, var10.ax, 0, var5, var6, 1781708036);
                                       }
                                    } else if (var10.aq != null && !this.cl(0, var5, var6)) {
                                       var1.ag(this, var10.aq, var5, var6, -1207408146);
                                    }

                                    var11 = var10.af;
                                    if (var11 != null) {
                                       var1.ac(var11.aq, 0, var11.ae * 1748036443, var11.ac * 2049257958, var11.ag * -1204519845, var11.at * -8087086773214451169L);
                                    }

                                    for(var12 = 0; var12 < var10.al * 278093325; ++var12) {
                                       var13 = var10.ad[var12];
                                       if (var13 != null) {
                                          var1.ac(var13.ax, var13.aq * 1568869686, var13.ag * 1991023744, var13.ae * -1225505631, var13.am * -1050782949, var13.ah * -4657194254713557903L);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var4.ax != null) {
                                    if (!this.cl(var8, var5, var6)) {
                                       var22 = true;
                                       if (var4.ax.ag * -1447020527 != 12345678 || this.bb && var7 <= this.bi) {
                                          var1.ae(this, var4.ax, var8, var5, var6, 1431298460);
                                       }
                                    }
                                 } else if (var4.aq != null && !this.cl(var8, var5, var6)) {
                                    var22 = true;
                                    var1.ag(this, var4.aq, var5, var6, -1380057969);
                                 }

                                 var21 = 0;
                                 var12 = 0;
                                 ku var23 = var4.af;
                                 kg var14 = var4.at;
                                 if (var23 != null || var14 != null) {
                                    if (this.bm == var5) {
                                       ++var21;
                                    } else if (this.bm < var5) {
                                       var21 += 2;
                                    }

                                    if (this.bs == var6) {
                                       var21 += 3;
                                    } else if (this.bs > var6) {
                                       var21 += 6;
                                    }

                                    var12 = ch[var21];
                                    var4.aj = cu[var21] * 327615389;
                                 }

                                 if (var23 != null) {
                                    if ((var23.am * 1493417632 & cf[var21]) != 0) {
                                       if (var23.am * 2126515052 == 16) {
                                          var4.ao = 229810106;
                                          var4.as = cm[var21] * 1087708845;
                                          var4.ay = -1314360425 - var4.as * -615082677;
                                       } else if (var23.am * 549588913 == 795028376) {
                                          var4.ao = 1462472136;
                                          var4.as = cj[var21] * 625981660;
                                          var4.ay = 475381937 - var4.as * -850196374;
                                       } else if (var23.am * 549588913 == -1232302984) {
                                          var4.ao = 488117132;
                                          var4.as = cx[var21] * 1099840622;
                                          var4.ay = 1486524681 - var4.as * -763006529;
                                       } else {
                                          var4.ao = 366087849;
                                          var4.as = ci[var21] * 1087708845;
                                          var4.ay = -1495842645 - var4.as * -1367039612;
                                       }
                                    } else {
                                       var4.ao = 0;
                                    }

                                    if ((var23.am * 1001702973 & var12) != 0 && !this.ca(var8, var5, var6, var23.am * -2025702078)) {
                                       var1.ac(var23.aq, 0, var23.ae * -1659954279, var23.ac * 329718354, var23.ag * -56633013, var23.at * -8087086773214451169L);
                                    }

                                    if ((var23.ax * -451772705 & var12) != 0 && !this.ca(var8, var5, var6, var23.ax * -451772705)) {
                                       var1.ac(var23.af, 0, var23.ae * -356288993, var23.ac * -481120242, var23.ag * 24831100, var23.at * -8087086773214451169L);
                                    }
                                 }

                                 if (var14 != null && !this.cs(var8, var5, var6, var14.at.ev * -1141910865)) {
                                    if ((var14.am * 1744270061 & var12) != 0) {
                                       var1.ac(var14.at, 0, var14.ae * 597854970 + var14.aq * 1050358309, var14.ac * -2067363336, var14.ag * -1397839306 + var14.af * 640285173, var14.ar * -4784704960526427281L);
                                    } else if (var14.am * -663960972 == -1964012088) {
                                       var15 = var14.ae * -430428417 - this.bd;
                                       var16 = var14.ag * -1988077953 - this.bf;
                                       var17 = var14.ax * -1905786199;
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
                                          var1.ac(var14.at, 0, var14.ae * 1739114137 + var14.aq * 1050358309, var14.ac * -468544661, var14.ag * -29839144 + var14.af * 640285173, var14.ar * -4784704960526427281L);
                                       } else if (var14.au != null) {
                                          var1.ac(var14.au, 0, var14.ae * -1168632067, var14.ac * -2063031294, var14.ag * -1988077953, var14.ar * -4784704960526427281L);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    jf var27 = var4.au;
                                    if (var27 != null) {
                                       var1.ac(var27.am, 0, var27.ae * 866554709, var27.ac * -803472558, var27.ag * 220591555, var27.ax * 3442899470081835915L);
                                    }

                                    ic var31 = var4.ar;
                                    if (var31 != null && var31.at * -1702730067 == 0) {
                                       if (var31.ax != null) {
                                          var1.ac(var31.ax, 0, var31.ae * -1330308742, var31.ac * 514500651, var31.ag * 561492919, var31.af * -1090932977685382519L);
                                       }

                                       if (var31.aq != null) {
                                          var1.ac(var31.aq, 0, var31.ae * -687954510, var31.ac * 514500651, var31.ag * -661088295, var31.af * -1090932977685382519L);
                                       }

                                       if (var31.am != null) {
                                          var1.ac(var31.am, 0, var31.ae * -606604329, var31.ac * 514500651, var31.ag * -329636925, var31.af * -1090932977685382519L);
                                       }
                                    }
                                 }

                                 var15 = var4.ap * 1948448495;
                                 if (var15 != 0) {
                                    if (var5 < this.bm && var5 >= this.an && var5 < this.ak - 1 && (var15 & 4) != 0) {
                                       var33 = var9[var5 + 1][var6];
                                       if (var33 != null && var33.aa) {
                                          this.cn.ae(var33);
                                       }
                                    }

                                    if (var6 < this.bs && var6 >= this.bn && var6 < this.bh - 1 && (var15 & 2) != 0) {
                                       var33 = var9[var5][var6 + 1];
                                       if (var33 != null && var33.aa) {
                                          this.cn.ae(var33);
                                       }
                                    }

                                    if (var5 > this.bm && var5 > this.an && var5 < this.ak && (var15 & 1) != 0) {
                                       var33 = var9[var5 - 1][var6];
                                       if (var33 != null && var33.aa) {
                                          this.cn.ae(var33);
                                       }
                                    }

                                    if (var6 > this.bs && var6 > this.bn && var6 < this.bh && (var15 & 8) != 0) {
                                       var33 = var9[var5][var6 - 1];
                                       if (var33 != null && var33.aa) {
                                          this.cn.ae(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var4.ao * -2121915807 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var4.al * 1838003371; ++var21) {
                                    if (var4.ad[var21].ad * -1245665253 != this.aw && (var4.ah[var21] & var4.ao * 1198488040) == var4.as * -1138780337) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var11 = var4.af;
                                    if (!this.ca(var8, var5, var6, var11.am * 549588913)) {
                                       var1.ac(var11.aq, 0, var11.ae * -1418970252, var11.ac * -2103755373, var11.ag * -56633013, var11.at * -8087086773214451169L);
                                    }

                                    var4.ao = 0;
                                 }
                              }

                              if (!var4.ai) {
                                 break;
                              }

                              try {
                                 int var25 = var4.al * 1571462534;
                                 var4.ai = false;
                                 var21 = 0;

                                 label595:
                                 for(var12 = 0; var12 < var25; ++var12) {
                                    var13 = var4.ad[var12];
                                    if (var13.ad * 697063945 != this.aw) {
                                       for(var26 = var13.af * -2069611541; var26 <= var13.at * 1336638479; ++var26) {
                                          for(var15 = var13.au * 64920415; var15 <= var13.ar * -1506076601; ++var15) {
                                             var33 = var9[var26][var15];
                                             if (var33.az) {
                                                var4.ai = true;
                                                continue label595;
                                             }

                                             if (var33.ao * -885660442 != 0) {
                                                var17 = 0;
                                                if (var26 > var13.af * -2069611541) {
                                                   ++var17;
                                                }

                                                if (var26 < var13.at * -1995208328) {
                                                   var17 += 4;
                                                }

                                                if (var15 > var13.au * 64920415) {
                                                   var17 += 8;
                                                }

                                                if (var15 < var13.ar * 1906513147) {
                                                   var17 += 2;
                                                }

                                                if ((var17 & var33.ao * -2121915807) == var4.ay * 1791426956) {
                                                   var4.ai = true;
                                                   continue label595;
                                                }
                                             }
                                          }
                                       }

                                       this.by[var21++] = var13;
                                       var26 = this.bm - var13.af * -741454200;
                                       var15 = var13.at * 1336638479 - this.bm;
                                       if (var15 > var26) {
                                          var26 = var15;
                                       }

                                       var16 = this.bs - var13.au * 64920415;
                                       var17 = var13.ar * -153684557 - this.bs;
                                       if (var17 > var16) {
                                          var13.al = (var26 + var17) * -663001877;
                                       } else {
                                          var13.al = (var26 + var16) * -1207993815;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var12 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       kc var34 = this.by[var26];
                                       if (var34.ad * 1673022489 != this.aw) {
                                          if (var34.al * -662624413 > var12) {
                                             var12 = var34.al * 619364889;
                                             var24 = var26;
                                          } else if (var34.al * 1746264266 == var12) {
                                             var16 = var34.ag * 1650171533 - this.bd;
                                             var17 = var34.am * -1050782949 - this.bf;
                                             var18 = this.by[var24].ag * 1650171533 - this.bd;
                                             var19 = this.by[var24].am * 1020309413 - this.bf;
                                             if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    kc var35 = this.by[var24];
                                    var35.ad = this.aw * 363982758;
                                    if (!this.cp(var8, var35.af * -76656832, var35.at * 1336638479, var35.au * -1608805165, var35.ar * -1750850668, var35.ax.ev * -426501319)) {
                                       var1.ac(var35.ax, var35.aq * 608450227, var35.ag * 1650171533, var35.ae * 1575475093, var35.am * -1050782949, var35.ah * -4657194254713557903L);
                                    }

                                    for(var15 = var35.af * -2069611541; var15 <= var35.at * -444429947; ++var15) {
                                       for(var16 = var35.au * 64920415; var16 <= var35.ar * -1129638446; ++var16) {
                                          je var36 = var9[var15][var16];
                                          if (var36.ao * -103920770 != 0) {
                                             this.cn.ae(var36);
                                          } else if ((var15 != var5 || var16 != var6) && var36.aa) {
                                             this.cn.ae(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var4.ai) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var4.ai = false;
                                 break;
                              }
                           }
                        } while(!var4.aa);
                     } while(var4.ao * -2121915807 != 0);

                     if (var5 > this.bm || var5 <= this.an) {
                        break;
                     }

                     var10 = var9[var5 - 1][var6];
                  } while(var10 != null && var10.aa);

                  if (var5 < this.bm || var5 >= this.ak - 1) {
                     break;
                  }

                  var10 = var9[var5 + 1][var6];
               } while(var10 != null && var10.aa);

               if (var6 > this.bs || var6 <= this.bn) {
                  break;
               }

               var10 = var9[var5][var6 - 1];
            } while(var10 != null && var10.aa);

            if (var6 < this.bs || var6 >= this.bh - 1) {
               break;
            }

            var10 = var9[var5][var6 + 1];
         } while(var10 != null && var10.aa);

         var4.aa = false;
         --this.aj;
         ic var29 = var4.ar;
         if (var29 != null && var29.at * -297921825 != 0) {
            if (var29.ax != null) {
               var1.ac(var29.ax, 0, var29.ae * 1556133601, var29.ac * 514500651 - var29.at * -1705055392, var29.ag * -1796654751, var29.af * -1090932977685382519L);
            }

            if (var29.aq != null) {
               var1.ac(var29.aq, 0, var29.ae * -1631192265, var29.ac * -2128180236 - var29.at * -1897899433, var29.ag * -661088295, var29.af * -1090932977685382519L);
            }

            if (var29.am != null) {
               var1.ac(var29.am, 0, var29.ae * -606604329, var29.ac * 514500651 - var29.at * 1721226074, var29.ag * -661088295, var29.af * -1090932977685382519L);
            }
         }

         if (var4.aj * -612984139 != 0) {
            kg var30 = var4.at;
            if (var30 != null && !this.cs(var8, var5, var6, var30.at.ev * -1141910865)) {
               if ((var30.am * 566523940 & var4.aj * -612984139) != 0) {
                  var1.ac(var30.at, 0, var30.ae * 1739114137 + var30.aq * -508728452, var30.ac * -1438457744, var30.ag * -83925382 + var30.af * 640285173, var30.ar * -4784704960526427281L);
               } else if (var30.am * -451073568 == -361797248) {
                  var12 = var30.ae * 1860566330 - this.bd;
                  var24 = var30.ag * -1988077953 - this.bf;
                  var26 = var30.ax * 1169971481;
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
                     var1.ac(var30.at, 0, var30.ae * -1834365615 + var30.aq * 309366751, var30.ac * 2050765709, var30.ag * -1988077953 + var30.af * -1150471368, var30.ar * -4784704960526427281L);
                  } else if (var30.au != null) {
                     var1.ac(var30.au, 0, var30.ae * 2138801249, var30.ac * -809477598, var30.ag * 2074808337, var30.ar * -4784704960526427281L);
                  }
               }
            }

            ku var28 = var4.af;
            if (var28 != null) {
               if ((var28.ax * 335350524 & var4.aj * -612984139) != 0 && !this.ca(var8, var5, var6, var28.ax * 1364513434)) {
                  var1.ac(var28.af, 0, var28.ae * -980709524, var28.ac * -2103755373, var28.ag * 1148557681, var28.at * -8087086773214451169L);
               }

               if ((var28.am * 549588913 & var4.aj * 921331176) != 0 && !this.ca(var8, var5, var6, var28.am * 549588913)) {
                  var1.ac(var28.aq, 0, var28.ae * -1659954279, var28.ac * -2103755373, var28.ag * -1399326492, var28.at * -8087086773214451169L);
               }
            }
         }

         je var32;
         if (var7 < this.am - 1) {
            var32 = this.at[var7 + 1][var5][var6];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }

         if (var5 < this.bm && var5 >= this.an && var5 < this.ak - 1) {
            var32 = var9[var5 + 1][var6];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }

         if (var6 < this.bs && var6 >= this.bn && var6 < this.bh - 1) {
            var32 = var9[var5][var6 + 1];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }

         if (var5 > this.bm && var5 > this.an && var5 < this.ak) {
            var32 = var9[var5 - 1][var6];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }

         if (var6 > this.bs && var6 > this.bn && var6 < this.bh) {
            var32 = var9[var5][var6 - 1];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }
      }
   }

   void ih(jx var1, je var2, boolean var3) {
      this.cn.ae(var2);

      while(true) {
         je var4;
         int var5;
         int var6;
         int var7;
         int var8;
         je[][] var9;
         je var10;
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
                              ku var11;
                              kc var13;
                              int var17;
                              int var18;
                              int var19;
                              int var21;
                              boolean var22;
                              je var33;
                              while(true) {
                                 do {
                                    var4 = (je)this.cn.ax();
                                    if (var4 == null) {
                                       return;
                                    }
                                 } while(!var4.aa);

                                 var5 = var4.ae * 184593053;
                                 var6 = var4.ag * -1775365173;
                                 var7 = var4.ac * -1691745147;
                                 var8 = var4.am * -1245839573;
                                 var9 = this.at[var7];
                                 if (!var4.az) {
                                    break;
                                 }

                                 if (var3) {
                                    if (var7 > 0) {
                                       var10 = this.at[var7 - 1][var5][var6];
                                       if (var10 != null && var10.aa) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= this.bm && var5 > this.an) {
                                       var10 = var9[var5 - 1][var6];
                                       if (var10 != null && var10.aa && (var10.az || (var4.ap * 923993776 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= this.bm && var5 < this.ak - 1) {
                                       var10 = var9[var5 + 1][var6];
                                       if (var10 != null && var10.aa && (var10.az || (var4.ap * 1948448495 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 <= this.bs && var6 > this.bn) {
                                       var10 = var9[var5][var6 - 1];
                                       if (var10 != null && var10.aa && (var10.az || (var4.ap * 1948448495 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 >= this.bs && var6 < this.bh - 1) {
                                       var10 = var9[var5][var6 + 1];
                                       if (var10 != null && var10.aa && (var10.az || (var4.ap * 1948448495 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var3 = true;
                                 }

                                 var4.az = false;
                                 if (var4.av != null) {
                                    var10 = var4.av;
                                    if (var10.ax != null) {
                                       if (!this.cl(0, var5, var6)) {
                                          var1.ae(this, var10.ax, 0, var5, var6, 1314843590);
                                       }
                                    } else if (var10.aq != null && !this.cl(0, var5, var6)) {
                                       var1.ag(this, var10.aq, var5, var6, -1981402120);
                                    }

                                    var11 = var10.af;
                                    if (var11 != null) {
                                       var1.ac(var11.aq, 0, var11.ae * 2088116760, var11.ac * 434065836, var11.ag * -56633013, var11.at * -8087086773214451169L);
                                    }

                                    for(var12 = 0; var12 < var10.al * -311620196; ++var12) {
                                       var13 = var10.ad[var12];
                                       if (var13 != null) {
                                          var1.ac(var13.ax, var13.aq * 957078328, var13.ag * 1650171533, var13.ae * -1225505631, var13.am * -1050782949, var13.ah * -4657194254713557903L);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var4.ax != null) {
                                    if (!this.cl(var8, var5, var6)) {
                                       var22 = true;
                                       if (var4.ax.ag * -1829485175 != -1869493611 || this.bb && var7 <= this.bi) {
                                          var1.ae(this, var4.ax, var8, var5, var6, 1270663458);
                                       }
                                    }
                                 } else if (var4.aq != null && !this.cl(var8, var5, var6)) {
                                    var22 = true;
                                    var1.ag(this, var4.aq, var5, var6, -956814776);
                                 }

                                 var21 = 0;
                                 var12 = 0;
                                 ku var23 = var4.af;
                                 kg var14 = var4.at;
                                 if (var23 != null || var14 != null) {
                                    if (this.bm == var5) {
                                       ++var21;
                                    } else if (this.bm < var5) {
                                       var21 += 2;
                                    }

                                    if (this.bs == var6) {
                                       var21 += 3;
                                    } else if (this.bs > var6) {
                                       var21 += 6;
                                    }

                                    var12 = ch[var21];
                                    var4.aj = cu[var21] * -2095046477;
                                 }

                                 if (var23 != null) {
                                    if ((var23.am * -1556686539 & cf[var21]) != 0) {
                                       if (var23.am * -1735011407 == 16) {
                                          var4.ao = 122029283;
                                          var4.as = cm[var21] * 1087708845;
                                          var4.ay = -498614215 - var4.as * -244944037;
                                       } else if (var23.am * 549588913 == 2076327940) {
                                          var4.ao = -796266178;
                                          var4.as = cj[var21] * -1477542989;
                                          var4.ay = -997228430 - var4.as * -763006529;
                                       } else if (var23.am * 129199901 == -2120404774) {
                                          var4.ao = -566583020;
                                          var4.as = cx[var21] * 1087708845;
                                          var4.ay = 550326733 - var4.as * -1321176267;
                                       } else {
                                          var4.ao = -958198185;
                                          var4.as = ci[var21] * 866965243;
                                          var4.ay = -1495842645 - var4.as * -763006529;
                                       }
                                    } else {
                                       var4.ao = 0;
                                    }

                                    if ((var23.am * 549588913 & var12) != 0 && !this.ca(var8, var5, var6, var23.am * 549588913)) {
                                       var1.ac(var23.aq, 0, var23.ae * -956703065, var23.ac * -2103755373, var23.ag * -56633013, var23.at * -8087086773214451169L);
                                    }

                                    if ((var23.ax * 555959580 & var12) != 0 && !this.ca(var8, var5, var6, var23.ax * 1560334563)) {
                                       var1.ac(var23.af, 0, var23.ae * -1874146037, var23.ac * -104709062, var23.ag * -442382922, var23.at * -8087086773214451169L);
                                    }
                                 }

                                 if (var14 != null && !this.cs(var8, var5, var6, var14.at.ev * -1141910865)) {
                                    if ((var14.am * 2052191706 & var12) != 0) {
                                       var1.ac(var14.at, 0, var14.ae * -1603698111 + var14.aq * 1050358309, var14.ac * 1674495999, var14.ag * -1225127817 + var14.af * 640285173, var14.ar * -4784704960526427281L);
                                    } else if (var14.am * 1744270061 == 830010856) {
                                       var15 = var14.ae * 1739114137 - this.bd;
                                       var16 = var14.ag * -1988077953 - this.bf;
                                       var17 = var14.ax * -1686670888;
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
                                          var1.ac(var14.at, 0, var14.ae * 840361969 + var14.aq * 1050358309, var14.ac * 1674495999, var14.ag * -2051187683 + var14.af * 640285173, var14.ar * -4784704960526427281L);
                                       } else if (var14.au != null) {
                                          var1.ac(var14.au, 0, var14.ae * 1739114137, var14.ac * 1321290791, var14.ag * -1988077953, var14.ar * -4784704960526427281L);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    jf var27 = var4.au;
                                    if (var27 != null) {
                                       var1.ac(var27.am, 0, var27.ae * -1055034025, var27.ac * -601098933, var27.ag * 220591555, var27.ax * 3442899470081835915L);
                                    }

                                    ic var31 = var4.ar;
                                    if (var31 != null && var31.at * 1576549040 == 0) {
                                       if (var31.ax != null) {
                                          var1.ac(var31.ax, 0, var31.ae * 1636946015, var31.ac * 514500651, var31.ag * -661088295, var31.af * -1090932977685382519L);
                                       }

                                       if (var31.aq != null) {
                                          var1.ac(var31.aq, 0, var31.ae * -606604329, var31.ac * 2043823164, var31.ag * -661088295, var31.af * -1090932977685382519L);
                                       }

                                       if (var31.am != null) {
                                          var1.ac(var31.am, 0, var31.ae * -1870346475, var31.ac * -1859471852, var31.ag * -661088295, var31.af * -1090932977685382519L);
                                       }
                                    }
                                 }

                                 var15 = var4.ap * 1948448495;
                                 if (var15 != 0) {
                                    if (var5 < this.bm && var5 >= this.an && var5 < this.ak - 1 && (var15 & 4) != 0) {
                                       var33 = var9[var5 + 1][var6];
                                       if (var33 != null && var33.aa) {
                                          this.cn.ae(var33);
                                       }
                                    }

                                    if (var6 < this.bs && var6 >= this.bn && var6 < this.bh - 1 && (var15 & 2) != 0) {
                                       var33 = var9[var5][var6 + 1];
                                       if (var33 != null && var33.aa) {
                                          this.cn.ae(var33);
                                       }
                                    }

                                    if (var5 > this.bm && var5 > this.an && var5 < this.ak && (var15 & 1) != 0) {
                                       var33 = var9[var5 - 1][var6];
                                       if (var33 != null && var33.aa) {
                                          this.cn.ae(var33);
                                       }
                                    }

                                    if (var6 > this.bs && var6 > this.bn && var6 < this.bh && (var15 & 8) != 0) {
                                       var33 = var9[var5][var6 - 1];
                                       if (var33 != null && var33.aa) {
                                          this.cn.ae(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var4.ao * -2121915807 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var4.al * 1838003371; ++var21) {
                                    if (var4.ad[var21].ad * -1245665253 != this.aw && (var4.ah[var21] & var4.ao * 11957388) == var4.as * 1239585989) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var11 = var4.af;
                                    if (!this.ca(var8, var5, var6, var11.am * 549588913)) {
                                       var1.ac(var11.aq, 0, var11.ae * 140090059, var11.ac * -2048791422, var11.ag * -56633013, var11.at * -8087086773214451169L);
                                    }

                                    var4.ao = 0;
                                 }
                              }

                              if (!var4.ai) {
                                 break;
                              }

                              try {
                                 int var25 = var4.al * 1270511081;
                                 var4.ai = false;
                                 var21 = 0;

                                 label595:
                                 for(var12 = 0; var12 < var25; ++var12) {
                                    var13 = var4.ad[var12];
                                    if (var13.ad * -1245665253 != this.aw) {
                                       for(var26 = var13.af * -2069611541; var26 <= var13.at * 1336638479; ++var26) {
                                          for(var15 = var13.au * 64920415; var15 <= var13.ar * 228912265; ++var15) {
                                             var33 = var9[var26][var15];
                                             if (var33.az) {
                                                var4.ai = true;
                                                continue label595;
                                             }

                                             if (var33.ao * -2121915807 != 0) {
                                                var17 = 0;
                                                if (var26 > var13.af * -957677469) {
                                                   ++var17;
                                                }

                                                if (var26 < var13.at * -1789508140) {
                                                   var17 += 4;
                                                }

                                                if (var15 > var13.au * 566184083) {
                                                   var17 += 8;
                                                }

                                                if (var15 < var13.ar * -153684557) {
                                                   var17 += 2;
                                                }

                                                if ((var17 & var33.ao * -2121915807) == var4.ay * 2068875803) {
                                                   var4.ai = true;
                                                   continue label595;
                                                }
                                             }
                                          }
                                       }

                                       this.by[var21++] = var13;
                                       var26 = this.bm - var13.af * -1316214485;
                                       var15 = var13.at * -1012122665 - this.bm;
                                       if (var15 > var26) {
                                          var26 = var15;
                                       }

                                       var16 = this.bs - var13.au * 64920415;
                                       var17 = var13.ar * -2133705376 - this.bs;
                                       if (var17 > var16) {
                                          var13.al = (var26 + var17) * -623626235;
                                       } else {
                                          var13.al = (var26 + var16) * -1207993815;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var12 = 1314366105;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       kc var34 = this.by[var26];
                                       if (var34.ad * -1245665253 != this.aw) {
                                          if (var34.al * -250025092 > var12) {
                                             var12 = var34.al * -149659889;
                                             var24 = var26;
                                          } else if (var34.al * 1032622840 == var12) {
                                             var16 = var34.ag * 1043795217 - this.bd;
                                             var17 = var34.am * -1050782949 - this.bf;
                                             var18 = this.by[var24].ag * -1562641811 - this.bd;
                                             var19 = this.by[var24].am * -885520416 - this.bf;
                                             if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    kc var35 = this.by[var24];
                                    var35.ad = this.aw * 1543434771;
                                    if (!this.cp(var8, var35.af * -1389830607, var35.at * 1800055795, var35.au * 64920415, var35.ar * 618718135, var35.ax.ev * -1141910865)) {
                                       var1.ac(var35.ax, var35.aq * 608450227, var35.ag * 1018448311, var35.ae * 1505966426, var35.am * 1439362133, var35.ah * -4657194254713557903L);
                                    }

                                    for(var15 = var35.af * 1735167285; var15 <= var35.at * 1336638479; ++var15) {
                                       for(var16 = var35.au * 1468850719; var16 <= var35.ar * -1930002891; ++var16) {
                                          je var36 = var9[var15][var16];
                                          if (var36.ao * -2121915807 != 0) {
                                             this.cn.ae(var36);
                                          } else if ((var15 != var5 || var16 != var6) && var36.aa) {
                                             this.cn.ae(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var4.ai) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var4.ai = false;
                                 break;
                              }
                           }
                        } while(!var4.aa);
                     } while(var4.ao * -2121915807 != 0);

                     if (var5 > this.bm || var5 <= this.an) {
                        break;
                     }

                     var10 = var9[var5 - 1][var6];
                  } while(var10 != null && var10.aa);

                  if (var5 < this.bm || var5 >= this.ak - 1) {
                     break;
                  }

                  var10 = var9[var5 + 1][var6];
               } while(var10 != null && var10.aa);

               if (var6 > this.bs || var6 <= this.bn) {
                  break;
               }

               var10 = var9[var5][var6 - 1];
            } while(var10 != null && var10.aa);

            if (var6 < this.bs || var6 >= this.bh - 1) {
               break;
            }

            var10 = var9[var5][var6 + 1];
         } while(var10 != null && var10.aa);

         var4.aa = false;
         --this.aj;
         ic var29 = var4.ar;
         if (var29 != null && var29.at * -297921825 != 0) {
            if (var29.ax != null) {
               var1.ac(var29.ax, 0, var29.ae * -606604329, var29.ac * -2055453537 - var29.at * -1666672916, var29.ag * -661088295, var29.af * -1090932977685382519L);
            }

            if (var29.aq != null) {
               var1.ac(var29.aq, 0, var29.ae * -599198976, var29.ac * 514500651 - var29.at * -1481291491, var29.ag * -661088295, var29.af * -1090932977685382519L);
            }

            if (var29.am != null) {
               var1.ac(var29.am, 0, var29.ae * -606604329, var29.ac * 514500651 - var29.at * -297921825, var29.ag * 1920206945, var29.af * -1090932977685382519L);
            }
         }

         if (var4.aj * -1749295443 != 0) {
            kg var30 = var4.at;
            if (var30 != null && !this.cs(var8, var5, var6, var30.at.ev * -1141910865)) {
               if ((var30.am * -171749382 & var4.aj * -1263778150) != 0) {
                  var1.ac(var30.at, 0, var30.ae * 1739114137 + var30.aq * 1050358309, var30.ac * -768870472, var30.ag * -1988077953 + var30.af * 640285173, var30.ar * -4784704960526427281L);
               } else if (var30.am * 1744270061 == 256) {
                  var12 = var30.ae * 1739114137 - this.bd;
                  var24 = var30.ag * 1495164485 - this.bf;
                  var26 = var30.ax * -967843404;
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
                     var1.ac(var30.at, 0, var30.ae * 1067916799 + var30.aq * 1050358309, var30.ac * -541911720, var30.ag * 1274689002 + var30.af * -1080244602, var30.ar * -4784704960526427281L);
                  } else if (var30.au != null) {
                     var1.ac(var30.au, 0, var30.ae * -550947971, var30.ac * 941541578, var30.ag * -1083187902, var30.ar * -4784704960526427281L);
                  }
               }
            }

            ku var28 = var4.af;
            if (var28 != null) {
               if ((var28.ax * -451772705 & var4.aj * -257819619) != 0 && !this.ca(var8, var5, var6, var28.ax * -816490366)) {
                  var1.ac(var28.af, 0, var28.ae * -1659954279, var28.ac * 465371508, var28.ag * -791607238, var28.at * -8087086773214451169L);
               }

               if ((var28.am * -483591130 & var4.aj * -2054260816) != 0 && !this.ca(var8, var5, var6, var28.am * 770058031)) {
                  var1.ac(var28.aq, 0, var28.ae * -2138581997, var28.ac * -2103755373, var28.ag * -1785829668, var28.at * -8087086773214451169L);
               }
            }
         }

         je var32;
         if (var7 < this.am - 1) {
            var32 = this.at[var7 + 1][var5][var6];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }

         if (var5 < this.bm && var5 >= this.an && var5 < this.ak - 1) {
            var32 = var9[var5 + 1][var6];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }

         if (var6 < this.bs && var6 >= this.bn && var6 < this.bh - 1) {
            var32 = var9[var5][var6 + 1];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }

         if (var5 > this.bm && var5 > this.an && var5 < this.ak) {
            var32 = var9[var5 - 1][var6];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }

         if (var6 > this.bs && var6 > this.bn && var6 < this.bh) {
            var32 = var9[var5][var6 - 1];
            if (var32 != null && var32.aa) {
               this.cn.ae(var32);
            }
         }
      }
   }

   public void ck(int var1) {
      this.au = var1;

      for(int var2 = 0; var2 < this.ax; ++var2) {
         for(int var3 = 0; var3 < this.aq; ++var3) {
            if (this.at[var1][var2][var3] == null) {
               this.at[var1][var2][var3] = new je(var1, var2, var3);
            }
         }
      }

   }

   static boolean iq(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
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

   void im() {
      int var1 = this.bq[this.av];
      jz[] var2 = this.bk[this.av];
      this.be = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         jz var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.ax * -117167424 == 1) {
            var5 = var4.ac * -1545549868 - this.bm + this.ai;
            if (var5 >= 0 && var5 <= this.ai + this.ai) {
               var6 = var4.ag * 1933147313 - this.bs + this.ai;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.am * 1582141565 - this.bs + this.ai;
               if (var7 > this.ai + this.ai) {
                  var7 = this.ai + this.ai;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cj(var5, var6++)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bd - var4.aq * 1384818045;
                  if (var9 > 444833919) {
                     var4.ad = -1941030758;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.ad = -32230258;
                     var9 = -var9;
                  }

                  var4.ab = (var4.at * -1159015797 - this.bf << 8) / var9 * -564061233;
                  var4.az = (var4.au * 1815491687 - this.bf << 8) / var9 * 1535753471;
                  var4.aa = (var4.ar * -892532838 - this.bx << 8) / var9 * -1066215937;
                  var4.ai = (var4.al * -1336872276 - this.bx << 8) / var9 * -601024919;
                  this.bc[this.be++] = var4;
               }
            }
         } else if (var4.ax * -546803330 == 2) {
            var5 = var4.ag * 1488447437 - this.bs + this.ai;
            if (var5 >= 0 && var5 <= this.ai + this.ai) {
               var6 = var4.ac * -1042787705 - this.bm + this.ai;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.ae * 437852685 - this.bm + this.ai;
               if (var7 > this.ai + this.ai) {
                  var7 = this.ai + this.ai;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.cj(var6++, var5)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.bf - var4.at * -1237749939;
                  if (var9 > 32) {
                     var4.ad = -339258692;
                  } else {
                     if (var9 >= -760476943) {
                        continue;
                     }

                     var4.ad = 526302006;
                     var9 = -var9;
                  }

                  var4.ah = (var4.aq * 321340803 - this.bd << 8) / var9 * -1929256842;
                  var4.ap = (var4.af * 1043206691 - this.bd << 8) / var9 * 396149969;
                  var4.aa = (var4.ar * 1743404645 - this.bx << 8) / var9 * 1202192138;
                  var4.ai = (var4.al * 1135123739 - this.bx << 8) / var9 * 2050825810;
                  this.bc[this.be++] = var4;
               }
            }
         } else if (var4.ax * -1532244041 == 4) {
            var5 = var4.ar * 1743404645 - this.bx;
            if (var5 > 128) {
               var6 = var4.ag * -1014726280 - this.bs + this.ai;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.am * 702157191 - this.bs + this.ai;
               if (var7 > this.ai + this.ai) {
                  var7 = this.ai + this.ai;
               }

               if (var6 <= var7) {
                  int var8 = var4.ac * -1042787705 - this.bm + this.ai;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.ae * -574261639 - this.bm + this.ai;
                  if (var9 > this.ai + this.ai) {
                     var9 = this.ai + this.ai;
                  }

                  boolean var10 = false;

                  label190:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (this.cj(var11, var12)) {
                           var10 = true;
                           break label190;
                        }
                     }
                  }

                  if (var10) {
                     var4.ad = -1371986001;
                     var4.ah = (var4.aq * 1384818045 - this.bd << 8) / var5 * -1997433495;
                     var4.ap = (var4.af * -486786496 - this.bd << 8) / var5 * -1580174751;
                     var4.ab = (var4.at * 566424513 - this.bf << 8) / var5 * 734096576;
                     var4.az = (var4.au * -1820248145 - this.bf << 8) / var5 * -1245050143;
                     this.bc[this.be++] = var4;
                  }
               }
            }
         }
      }

   }

   boolean cx(int var1, int var2, int var3, int var4) {
      if (!this.ch(var1, var2, var3, var4)) {
         return this.bc(var1, var2, var3, var4);
      } else {
         this.cf(var1, var2, var3, var4, false);
         int var5 = var1 * 32 + 128;
         int var6 = var2 * 64;
         int var7 = (var3 - this.ai - this.as - 1) * 128;
         int var8 = (var4 - this.ai - this.ay - 1) * 128;

         for(int var9 = -this.cz; var9 <= this.cw; var9 += 128) {
            if (this.ci(var7, this.cc[var1] + var9, var8, var5, var6)) {
               return this.cn(var1, var2, var3, var4, true);
            }
         }

         return this.cn(var1, var2, var3, var4, false);
      }
   }

   boolean ic(int var1, int var2, int var3) {
      int var4 = this.ad[var1][var2][var3];
      if (var4 == -this.aw) {
         return false;
      } else if (var4 == this.aw) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.cb(var5 + 1, this.af[var1][var2][var3], var6 + 1) && this.cb(var5 + 128 - 1, this.af[var1][var2 + 1][var3], var6 + 1) && this.cb(var5 + 128 - 1, this.af[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.cb(var5 + 1, this.af[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.ad[var1][var2][var3] = this.aw;
            return true;
         } else {
            this.ad[var1][var2][var3] = -this.aw;
            return false;
         }
      }
   }

   boolean jv(int var1, int var2, int var3) {
      int var4 = this.ad[var1][var2][var3];
      if (var4 == -this.aw) {
         return false;
      } else if (var4 == this.aw) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.cb(var5 + 1, this.af[var1][var2][var3], var6 + 1) && this.cb(var5 + 128 - 1, this.af[var1][var2 + 1][var3], var6 + 1) && this.cb(var5 + -1459733340 - 1, this.af[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.cb(var5 + 1, this.af[var1][var2][var3 + 1], var6 + 310148076 - 1)) {
            this.ad[var1][var2][var3] = this.aw;
            return true;
         } else {
            this.ad[var1][var2][var3] = -this.aw;
            return false;
         }
      }
   }

   boolean jf(int var1, int var2, int var3) {
      int var4 = this.ad[var1][var2][var3];
      if (var4 == -this.aw) {
         return false;
      } else if (var4 == this.aw) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.cb(var5 + 1, this.af[var1][var2][var3], var6 + 1) && this.cb(var5 + 128 - 1, this.af[var1][var2 + 1][var3], var6 + 1) && this.cb(var5 + -903560996 - 1, this.af[var1][var2 + 1][var3 + 1], var6 + 894929982 - 1) && this.cb(var5 + 1, this.af[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.ad[var1][var2][var3] = this.aw;
            return true;
         } else {
            this.ad[var1][var2][var3] = -this.aw;
            return false;
         }
      }
   }

   public kc ff(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.al * -1491643815; ++var5) {
            kc var6 = var4.ad[var5];
            if (ce.ae(var6.ah * -4657194254713557903L) && var6.af * -2069611541 == var2 && var6.au * 524063634 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   boolean jt(int var1, int var2, int var3, int var4) {
      if (!this.cl(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.cb(var5 + 1, this.af[var1][var2][var3] - var4, var6 + 1) && this.cb(var5 + -2108261137 - 1, this.af[var1][var2 + 1][var3] - var4, var6 + 1) && this.cb(var5 + -641281161 - 1, this.af[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.cb(var5 + 1, this.af[var1][var2][var3 + 1] - var4, var6 + 318607604 - 1);
      }
   }

   public void eu(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      if (var4 != null) {
         var4.af = null;
      }
   }

   boolean jw(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.cl(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.cb(var7 + 1, this.af[var1][var2][var4] - var6, var8 + 1) && this.cb(var7 + 128 - 1, this.af[var1][var2 + 1][var4] - var6, var8 + 1) && this.cb(var7 + 128 - 1, this.af[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.cb(var7 + 1, this.af[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.ad[var1][var7][var8] == -this.aw) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.af[var1][var2][var4] - var6;
         if (!this.cb(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.cb(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.cb(var7, var9, var11)) {
                  return false;
               } else if (!this.cb(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   boolean bu(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.cb + var3 * this.cd + var4 * this.ce + var5);
   }

   public void do(int var1, int var2, int var3, int var4, ju var5, ju var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         ku var12 = new ku();
         var12.at = var9 * 3417452104574177759L;
         var12.au = var11 * 69663131;
         var12.ae = var2 * -1036204967 + -1972059803;
         var12.ag = var3 * 2018755715 + 981080256;
         var12.ac = var4 * -943036261;
         var12.aq = var5;
         var12.af = var6;
         var12.am = var7 * 35144715;
         var12.ax = var8 * -692802122;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.at[var13][var2][var3] == null) {
               this.at[var13][var2][var3] = new je(var13, var2, var3);
            }
         }

         this.at[var1][var2][var3].af = var12;
      }
   }

   public ku ee(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 == null ? null : var4.af;
   }

   public ku eq(int var1, int var2, int var3) {
      je var4 = this.at[var1][var2][var3];
      return var4 == null ? null : var4.af;
   }
}
