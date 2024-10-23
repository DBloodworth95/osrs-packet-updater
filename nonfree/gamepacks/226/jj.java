public class jj extends jv {
   int[] aa;
   int[] am;
   static final int ak = -1;
   int[][] bh;
   int[] ai;
   static final int ap = -3;
   int[] as;
   byte ag = 0;
   int[] at;
   static int[] bt = new int[10000];
   int[] au;
   byte[] an;
   byte[] ao;
   byte[] af;
   int[][] ah;
   short[] ab;
   short[] az;
   public short bq;
   int br;
   byte[] ac;
   short[] av;
   short[] ax;
   byte[] ar;
   int[] al;
   short[] aq;
   static int[] bs = new int[10000];
   int[] ay;
   int[][] bj;
   int ad;
   jf[] bx;
   je[] bk;
   je[] bb;
   static final int aw = -2;
   public short bp;
   boolean bz = false;
   int bc;
   int by;
   int aj = 0;
   int bn;
   int bu;
   int ae = 0;
   int[][] bv;
   static int bm = 0;
   static int[] bo;
   static int[] bd;

   static final int dn(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > -307911516) {
         var1 = 1267319889;
      }

      return (var0 & 649433193) + var1;
   }

   static final int eg(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   public void ch() {
      for(int var1 = 0; var1 < this.aj; ++var1) {
         int var2 = this.as[var1];
         this.as[var1] = this.ai[var1];
         this.ai[var1] = -var2;
      }

      this.aa();
   }

   void aw(byte[] var1) {
      vl var2 = new vl(var1);
      vl var3 = new vl(var1);
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var2.am = (var1.length - 26) * -725588083;
      int var9 = var2.ce(1536215455);
      int var10 = var2.ce(1631803158);
      int var11 = var2.cy((short)-21675);
      int var12 = var2.cy((short)-7390);
      int var13 = var2.cy((short)-17715);
      int var14 = var2.cy((short)-30708);
      int var15 = var2.cy((short)-31059);
      int var16 = var2.cy((short)-26599);
      int var17 = var2.cy((short)-28970);
      int var18 = var2.cy((short)-32464);
      int var19 = var2.ce(248204493);
      int var20 = var2.ce(206476817);
      int var21 = var2.ce(1269799352);
      int var22 = var2.ce(1280766667);
      int var23 = var2.ce(801154629);
      int var24 = var2.ce(1372527715);
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.ac = new byte[var11];
         var2.am = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.ac[var28] = var2.cu((byte)13);
            if (var29 == 0) {
               ++var25;
            }

            if (var29 >= 1 && var29 <= 3) {
               ++var26;
            }

            if (var29 == 2) {
               ++var27;
            }
         }
      }

      var28 = var11 + var9;
      int var30 = var28;
      if (var12 == 1) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if (var13 == 255) {
         var28 += var10;
      }

      int var33 = var28;
      if (var15 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      var28 += var24;
      int var35 = var28;
      if (var14 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var22;
      int var37 = var28;
      if (var16 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var23;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var19;
      int var41 = var28;
      var28 += var20;
      int var42 = var28;
      var28 += var21;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26 * 2;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 * 2 + var27 * 2;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var17 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
      }

      if (var13 == 255) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      if (var16 == 1) {
         this.az = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ar = new byte[var10];
      }

      if (var18 == 1) {
         this.bj = new int[var9][];
         this.bv = new int[var9][];
      }

      this.ab = new short[var10];
      if (var11 > 0) {
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      var2.am = var11 * -725588083;
      var3.am = var40 * -725588083;
      var4.am = var41 * -725588083;
      var5.am = var42 * -725588083;
      var6.am = var34 * -725588083;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.cy((short)-24630);
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.ck((byte)1);
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.ck((byte)1);
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.ck((byte)1);
         }

         this.ai[var53] = var50 + var55;
         this.ay[var53] = var51 + var56;
         this.as[var53] = var52 + var57;
         var50 = this.ai[var53];
         var51 = this.ay[var53];
         var52 = this.as[var53];
         if (var17 == 1) {
            this.al[var53] = var6.cy((short)-12927);
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.cy((short)-20034);
            this.bj[var53] = new int[var54];
            this.bv[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.bj[var53][var55] = var6.cy((short)-12597);
               this.bv[var53][var55] = var6.cy((short)-29780);
            }
         }
      }

      var2.am = var39 * -725588083;
      var3.am = var30 * -725588083;
      var4.am = var32 * -725588083;
      var5.am = var35 * -725588083;
      var6.am = var33 * -725588083;
      var7.am = var37 * -725588083;
      var8.am = var38 * -725588083;

      for(var53 = 0; var53 < var10; ++var53) {
         this.ab[var53] = (short)var2.ce(1025002496);
         if (var12 == 1) {
            this.an[var53] = var3.cu((byte)13);
         }

         if (var13 == 255) {
            this.ao[var53] = var4.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var53] = var5.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var53] = var6.cy((short)-25255);
         }

         if (var16 == 1) {
            this.az[var53] = (short)(var7.ce(396104312) - 1);
         }

         if (this.ar != null && this.az[var53] != -1) {
            this.ar[var53] = (byte)(var8.cy((short)-25477) - 1);
         }
      }

      var2.am = var36 * -725588083;
      var3.am = var31 * -725588083;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.cy((short)-1521);
         if (var58 == 1) {
            var53 = var2.ck((byte)1) + var56;
            var54 = var2.ck((byte)1) + var53;
            var55 = var2.ck((byte)1) + var54;
            var56 = var55;
            this.am[var57] = var53;
            this.at[var57] = var54;
            this.au[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.ck((byte)1) + var56;
            var56 = var55;
            this.am[var57] = var53;
            this.at[var57] = var54;
            this.au[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.ck((byte)1) + var56;
            var56 = var55;
            this.am[var57] = var53;
            this.at[var57] = var54;
            this.au[var57] = var55;
         }

         if (var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.ck((byte)1) + var56;
            var56 = var55;
            this.am[var57] = var53;
            this.at[var57] = var59;
            this.au[var57] = var55;
         }
      }

      var2.am = var43 * -725588083;
      var3.am = var44 * -725588083;
      var4.am = var45 * -725588083;
      var5.am = var46 * -725588083;
      var6.am = var47 * -725588083;
      var7.am = var48 * -725588083;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.ac[var57] & 255;
         if (var58 == 0) {
            this.av[var57] = (short)var2.ce(1233058950);
            this.ax[var57] = (short)var2.ce(1111356113);
            this.aq[var57] = (short)var2.ce(1407305697);
         }
      }

      var2.am = var28 * -725588083;
      var57 = var2.cy((short)-1446);
      if (var57 != 0) {
         new kg();
         var2.ce(877772791);
         var2.ce(1426323072);
         var2.ce(238777974);
         var2.ch(1203709469);
      }

   }

   jj(byte[] var1) {
      vl var2 = new vl(10);
      var2.bd(-2, (byte)34);
      if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
         this.aw(var1);
      } else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
         this.ak(var1);
      } else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.aj(var1);
      } else {
         this.ai(var1);
      }

   }

   void aj(byte[] var1) {
      vl var2 = new vl(var1);
      vl var3 = new vl(var1);
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var2.am = (var1.length - 23) * -725588083;
      int var9 = var2.ce(1180575512);
      int var10 = var2.ce(971561554);
      int var11 = var2.cy((short)-5397);
      int var12 = var2.cy((short)-7484);
      int var13 = var2.cy((short)-20375);
      int var14 = var2.cy((short)-11384);
      int var15 = var2.cy((short)-8695);
      int var16 = var2.cy((short)-23695);
      int var17 = var2.cy((short)-9668);
      int var18 = var2.ce(1227839648);
      int var19 = var2.ce(1528798251);
      int var20 = var2.ce(787437085);
      int var21 = var2.ce(41909442);
      int var22 = var2.ce(489966495);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.ac = new byte[var11];
         var2.am = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.ac[var26] = var2.cu((byte)13);
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var17 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
      }

      if (var13 == 255) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      if (var16 == 1) {
         this.az = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ar = new byte[var10];
      }

      this.ab = new short[var10];
      if (var11 > 0) {
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      var2.am = var11 * -725588083;
      var3.am = var38 * -725588083;
      var4.am = var39 * -725588083;
      var5.am = var40 * -725588083;
      var6.am = var32 * -725588083;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.cy((short)-17649);
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.ck((byte)1);
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.ck((byte)1);
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.ck((byte)1);
         }

         this.ai[var51] = var48 + var53;
         this.ay[var51] = var49 + var54;
         this.as[var51] = var50 + var55;
         var48 = this.ai[var51];
         var49 = this.ay[var51];
         var50 = this.as[var51];
         if (var17 == 1) {
            this.al[var51] = var6.cy((short)-11463);
         }
      }

      var2.am = var37 * -725588083;
      var3.am = var28 * -725588083;
      var4.am = var30 * -725588083;
      var5.am = var33 * -725588083;
      var6.am = var31 * -725588083;
      var7.am = var35 * -725588083;
      var8.am = var36 * -725588083;

      for(var51 = 0; var51 < var10; ++var51) {
         this.ab[var51] = (short)var2.ce(304132400);
         if (var12 == 1) {
            this.an[var51] = var3.cu((byte)13);
         }

         if (var13 == 255) {
            this.ao[var51] = var4.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var51] = var5.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var51] = var6.cy((short)-1674);
         }

         if (var16 == 1) {
            this.az[var51] = (short)(var7.ce(1192894559) - 1);
         }

         if (this.ar != null && this.az[var51] != -1) {
            this.ar[var51] = (byte)(var8.cy((short)-22692) - 1);
         }
      }

      var2.am = var34 * -725588083;
      var3.am = var29 * -725588083;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.cy((short)-30970);
         if (var56 == 1) {
            var51 = var2.ck((byte)1) + var54;
            var52 = var2.ck((byte)1) + var51;
            var53 = var2.ck((byte)1) + var52;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var57;
            this.au[var55] = var53;
         }
      }

      var2.am = var41 * -725588083;
      var3.am = var42 * -725588083;
      var4.am = var43 * -725588083;
      var5.am = var44 * -725588083;
      var6.am = var45 * -725588083;
      var7.am = var46 * -725588083;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.ac[var55] & 255;
         if (var56 == 0) {
            this.av[var55] = (short)var2.ce(370658397);
            this.ax[var55] = (short)var2.ce(961535261);
            this.aq[var55] = (short)var2.ce(883655678);
         }
      }

      var2.am = var26 * -725588083;
      var55 = var2.cy((short)-19131);
      if (var55 != 0) {
         new kg();
         var2.ce(1644404743);
         var2.ce(2103568701);
         var2.ce(476431555);
         var2.ch(1203709469);
      }

   }

   final int bf(jj var1, int var2) {
      int var3 = -1;
      int var4 = var1.ai[var2];
      int var5 = var1.ay[var2];
      int var6 = var1.as[var2];

      for(int var7 = 0; var7 < this.aj; ++var7) {
         if (var4 == this.ai[var7] && var5 == this.ay[var7] && var6 == this.as[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.ai[this.aj] = var4;
         this.ay[this.aj] = var5;
         this.as[this.aj] = var6;
         if (var1.al != null) {
            this.al[this.aj] = var1.al[var2];
         }

         if (var1.bj != null) {
            this.bj[this.aj] = var1.bj[var2];
            this.bv[this.aj] = var1.bv[var2];
         }

         var3 = this.aj++;
      }

      return var3;
   }

   public jj(int var1, int var2, int var3) {
      this.ai = new int[var1];
      this.ay = new int[var1];
      this.as = new int[var1];
      this.al = new int[var1];
      this.am = new int[var2];
      this.at = new int[var2];
      this.au = new int[var2];
      this.an = new byte[var2];
      this.ao = new byte[var2];
      this.af = new byte[var2];
      this.ab = new short[var2];
      this.az = new short[var2];
      this.ar = new byte[var2];
      this.aa = new int[var2];
      if (var3 > 0) {
         this.ac = new byte[var3];
         this.av = new short[var3];
         this.ax = new short[var3];
         this.aq = new short[var3];
      }

   }

   public jj(jj[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      this.aj = 0;
      this.ae = 0;
      this.ad = 0;
      this.ag = -1;

      int var10;
      jj var11;
      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            this.aj += var11.aj;
            this.ae += var11.ae;
            this.ad += var11.ad;
            if (var11.ao != null) {
               var4 = true;
            } else {
               if (this.ag == -1) {
                  this.ag = var11.ag;
               }

               if (this.ag != var11.ag) {
                  var4 = true;
               }
            }

            var3 |= var11.an != null;
            var5 |= var11.af != null;
            var6 |= var11.aa != null;
            var7 |= var11.az != null;
            var8 |= var11.ar != null;
            var9 |= var11.bj != null;
         }
      }

      this.ai = new int[this.aj];
      this.ay = new int[this.aj];
      this.as = new int[this.aj];
      this.al = new int[this.aj];
      this.am = new int[this.ae];
      this.at = new int[this.ae];
      this.au = new int[this.ae];
      if (var3) {
         this.an = new byte[this.ae];
      }

      if (var4) {
         this.ao = new byte[this.ae];
      }

      if (var5) {
         this.af = new byte[this.ae];
      }

      if (var6) {
         this.aa = new int[this.ae];
      }

      if (var7) {
         this.az = new short[this.ae];
      }

      if (var8) {
         this.ar = new byte[this.ae];
      }

      if (var9) {
         this.bj = new int[this.aj][];
         this.bv = new int[this.aj][];
      }

      this.ab = new short[this.ae];
      if (this.ad > 0) {
         this.ac = new byte[this.ad];
         this.av = new short[this.ad];
         this.ax = new short[this.ad];
         this.aq = new short[this.ad];
      }

      this.aj = 0;
      this.ae = 0;
      this.ad = 0;

      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            int var12;
            for(var12 = 0; var12 < var11.ae; ++var12) {
               if (var3 && var11.an != null) {
                  this.an[this.ae] = var11.an[var12];
               }

               if (var4) {
                  if (var11.ao != null) {
                     this.ao[this.ae] = var11.ao[var12];
                  } else {
                     this.ao[this.ae] = var11.ag;
                  }
               }

               if (var5 && var11.af != null) {
                  this.af[this.ae] = var11.af[var12];
               }

               if (var6 && var11.aa != null) {
                  this.aa[this.ae] = var11.aa[var12];
               }

               if (var7) {
                  if (var11.az != null) {
                     this.az[this.ae] = var11.az[var12];
                  } else {
                     this.az[this.ae] = -1;
                  }
               }

               if (var8) {
                  if (var11.ar != null && var11.ar[var12] != -1) {
                     this.ar[this.ae] = (byte)(var11.ar[var12] + this.ad);
                  } else {
                     this.ar[this.ae] = -1;
                  }
               }

               this.ab[this.ae] = var11.ab[var12];
               this.am[this.ae] = this.ay(var11, var11.am[var12]);
               this.at[this.ae] = this.ay(var11, var11.at[var12]);
               this.au[this.ae] = this.ay(var11, var11.au[var12]);
               ++this.ae;
            }

            for(var12 = 0; var12 < var11.ad; ++var12) {
               byte var13 = this.ac[this.ad] = var11.ac[var12];
               if (var13 == 0) {
                  this.av[this.ad] = (short)this.ay(var11, var11.av[var12]);
                  this.ax[this.ad] = (short)this.ay(var11, var11.ax[var12]);
                  this.aq[this.ad] = (short)this.ay(var11, var11.aq[var12]);
               }

               ++this.ad;
            }
         }
      }

   }

   final int ay(jj var1, int var2) {
      int var3 = -1;
      int var4 = var1.ai[var2];
      int var5 = var1.ay[var2];
      int var6 = var1.as[var2];

      for(int var7 = 0; var7 < this.aj; ++var7) {
         if (var4 == this.ai[var7] && var5 == this.ay[var7] && var6 == this.as[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.ai[this.aj] = var4;
         this.ay[this.aj] = var5;
         this.as[this.aj] = var6;
         if (var1.al != null) {
            this.al[this.aj] = var1.al[var2];
         }

         if (var1.bj != null) {
            this.bj[this.aj] = var1.bj[var2];
            this.bv[this.aj] = var1.bv[var2];
         }

         var3 = this.aj++;
      }

      return var3;
   }

   public jj(jj var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.aj = var1.aj;
      this.ae = var1.ae;
      this.ad = var1.ad;
      int var6;
      if (var2) {
         this.ai = var1.ai;
         this.ay = var1.ay;
         this.as = var1.as;
      } else {
         this.ai = new int[this.aj];
         this.ay = new int[this.aj];
         this.as = new int[this.aj];

         for(var6 = 0; var6 < this.aj; ++var6) {
            this.ai[var6] = var1.ai[var6];
            this.ay[var6] = var1.ay[var6];
            this.as[var6] = var1.as[var6];
         }
      }

      if (var3) {
         this.ab = var1.ab;
      } else {
         this.ab = new short[this.ae];

         for(var6 = 0; var6 < this.ae; ++var6) {
            this.ab[var6] = var1.ab[var6];
         }
      }

      if (!var4 && var1.az != null) {
         this.az = new short[this.ae];

         for(var6 = 0; var6 < this.ae; ++var6) {
            this.az[var6] = var1.az[var6];
         }
      } else {
         this.az = var1.az;
      }

      if (var5) {
         this.af = var1.af;
      } else {
         this.af = new byte[this.ae];
         if (var1.af == null) {
            for(var6 = 0; var6 < this.ae; ++var6) {
               this.af[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.ae; ++var6) {
               this.af[var6] = var1.af[var6];
            }
         }
      }

      this.am = var1.am;
      this.at = var1.at;
      this.au = var1.au;
      this.an = var1.an;
      this.ao = var1.ao;
      this.ar = var1.ar;
      this.ag = var1.ag;
      this.ac = var1.ac;
      this.av = var1.av;
      this.ax = var1.ax;
      this.aq = var1.aq;
      this.al = var1.al;
      this.aa = var1.aa;
      this.ah = var1.ah;
      this.bh = var1.bh;
      this.bk = var1.bk;
      this.bx = var1.bx;
      this.bb = var1.bb;
      this.bj = var1.bj;
      this.bv = var1.bv;
      this.bq = var1.bq;
      this.bp = var1.bp;
   }

   public jj as() {
      jj var1 = new jj();
      if (this.an != null) {
         var1.an = new byte[this.ae];

         for(int var2 = 0; var2 < this.ae; ++var2) {
            var1.an[var2] = this.an[var2];
         }
      }

      var1.aj = this.aj;
      var1.ae = this.ae;
      var1.ad = this.ad;
      var1.ai = this.ai;
      var1.ay = this.ay;
      var1.as = this.as;
      var1.am = this.am;
      var1.at = this.at;
      var1.au = this.au;
      var1.ao = this.ao;
      var1.af = this.af;
      var1.ar = this.ar;
      var1.ab = this.ab;
      var1.az = this.az;
      var1.ag = this.ag;
      var1.ac = this.ac;
      var1.av = this.av;
      var1.ax = this.ax;
      var1.aq = this.aq;
      var1.al = this.al;
      var1.aa = this.aa;
      var1.ah = this.ah;
      var1.bh = this.bh;
      var1.bk = this.bk;
      var1.bx = this.bx;
      var1.bq = this.bq;
      var1.bp = this.bp;
      return var1;
   }

   public jj ae(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.ah();
      int var7 = var2 + this.by;
      int var8 = var2 + this.br;
      int var9 = var4 + this.bu;
      int var10 = var4 + this.bn;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            jj var11;
            if (var5) {
               var11 = new jj();
               var11.aj = this.aj;
               var11.ae = this.ae;
               var11.ad = this.ad;
               var11.ai = this.ai;
               var11.as = this.as;
               var11.am = this.am;
               var11.at = this.at;
               var11.au = this.au;
               var11.an = this.an;
               var11.ao = this.ao;
               var11.af = this.af;
               var11.ar = this.ar;
               var11.ab = this.ab;
               var11.az = this.az;
               var11.ag = this.ag;
               var11.ac = this.ac;
               var11.av = this.av;
               var11.ax = this.ax;
               var11.aq = this.aq;
               var11.al = this.al;
               var11.aa = this.aa;
               var11.ah = this.ah;
               var11.bh = this.bh;
               var11.bq = this.bq;
               var11.bp = this.bp;
               var11.ay = new int[var11.aj];
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
               for(var12 = 0; var12 < var11.aj; ++var12) {
                  var13 = this.ai[var12] + var2;
                  var14 = this.as[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.ay[var12] = this.ay[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.aj; ++var12) {
                  var13 = (-this.ay[var12] << 16) / (this.ez * -274986519);
                  if (var13 < var6) {
                     var14 = this.ai[var12] + var2;
                     var15 = this.as[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.ay[var12] = this.ay[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.aa();
            return var11;
         }
      } else {
         return this;
      }
   }

   public int am(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aj; ++var4) {
         if (this.ai[var4] == var1 && this.ay[var4] == var2 && this.as[var4] == var3) {
            return var4;
         }
      }

      this.ai[this.aj] = var1;
      this.ay[this.aj] = var2;
      this.as[this.aj] = var3;
      return this.aj++;
   }

   public int at(int var1, int var2, int var3, byte var4, byte var5, short var6, short var7) {
      this.am[this.ae] = var1;
      this.at[this.ae] = var2;
      this.au[this.ae] = var3;
      this.an[this.ae] = var4;
      this.ar[this.ae] = var5;
      this.ab[this.ae] = var6;
      this.az[this.ae] = var7;
      return this.ae++;
   }

   void af() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.al != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.aj; ++var3) {
            var4 = this.al[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.ah = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.ah[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.aj; this.ah[var4][var1[var4]++] = var3++) {
            var4 = this.al[var3];
         }

         this.al = null;
      }

      if (this.aa != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.ae; ++var3) {
            var4 = this.aa[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.bh = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.bh[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.ae; this.bh[var4][var1[var4]++] = var3++) {
            var4 = this.aa[var3];
         }

         this.aa = null;
      }

   }

   void ak(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var4.am = (var1.length - 23) * -725588083;
      int var9 = var4.ce(1344095538);
      int var10 = var4.ce(70180488);
      int var11 = var4.cy((short)-32426);
      int var12 = var4.cy((short)-19836);
      int var13 = var4.cy((short)-29871);
      int var14 = var4.cy((short)-26580);
      int var15 = var4.cy((short)-26000);
      int var16 = var4.cy((short)-68);
      int var17 = var4.cy((short)-5470);
      int var18 = var4.ce(370029507);
      int var19 = var4.ce(1740454031);
      int var20 = var4.ce(1635787802);
      int var21 = var4.ce(1365158376);
      int var22 = var4.ce(224069760);
      byte var23 = 0;
      int var47 = var23 + var9;
      int var25 = var47;
      var47 += var10;
      int var26 = var47;
      if (var13 == 255) {
         var47 += var10;
      }

      int var27 = var47;
      if (var15 == 1) {
         var47 += var10;
      }

      int var28 = var47;
      if (var12 == 1) {
         var47 += var10;
      }

      int var29 = var47;
      var47 += var22;
      int var30 = var47;
      if (var14 == 1) {
         var47 += var10;
      }

      int var31 = var47;
      var47 += var21;
      int var32 = var47;
      var47 += var10 * 2;
      int var33 = var47;
      var47 += var11 * 6;
      int var34 = var47;
      var47 += var18;
      int var35 = var47;
      var47 += var19;
      int var10000 = var47 + var20;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var11 > 0) {
         this.ac = new byte[var11];
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      if (var16 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
         this.ar = new byte[var10];
         this.az = new short[var10];
      }

      if (var13 == 255) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      if (var17 == 1) {
         this.bj = new int[var9][];
         this.bv = new int[var9][];
      }

      this.ab = new short[var10];
      var4.am = var23 * -725588083;
      var5.am = var34 * -725588083;
      var6.am = var35 * -725588083;
      var7.am = var47 * -725588083;
      var8.am = var29 * -725588083;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.cy((short)-4687);
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.ck((byte)1);
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.ck((byte)1);
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.ck((byte)1);
         }

         this.ai[var40] = var37 + var42;
         this.ay[var40] = var38 + var43;
         this.as[var40] = var39 + var44;
         var37 = this.ai[var40];
         var38 = this.ay[var40];
         var39 = this.as[var40];
         if (var16 == 1) {
            this.al[var40] = var8.cy((short)-20748);
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.cy((short)-29252);
            this.bj[var40] = new int[var41];
            this.bv[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.bj[var40][var42] = var8.cy((short)-22650);
               this.bv[var40][var42] = var8.cy((short)-24156);
            }
         }
      }

      var4.am = var32 * -725588083;
      var5.am = var28 * -725588083;
      var6.am = var26 * -725588083;
      var7.am = var30 * -725588083;
      var8.am = var27 * -725588083;

      for(var40 = 0; var40 < var10; ++var40) {
         this.ab[var40] = (short)var4.ce(1301658343);
         if (var12 == 1) {
            var41 = var5.cy((short)-19756);
            if ((var41 & 1) == 1) {
               this.an[var40] = 1;
               var2 = true;
            } else {
               this.an[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.ar[var40] = (byte)(var41 >> 2);
               this.az[var40] = this.ab[var40];
               this.ab[var40] = 127;
               if (this.az[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.ar[var40] = -1;
               this.az[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.ao[var40] = var6.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var40] = var7.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var40] = var8.cy((short)-18240);
         }
      }

      var4.am = var31 * -725588083;
      var5.am = var25 * -725588083;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.cy((short)-19497);
         if (var45 == 1) {
            var40 = var4.ck((byte)1) + var43;
            var41 = var4.ck((byte)1) + var40;
            var42 = var4.ck((byte)1) + var41;
            var43 = var42;
            this.am[var44] = var40;
            this.at[var44] = var41;
            this.au[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.ck((byte)1) + var43;
            var43 = var42;
            this.am[var44] = var40;
            this.at[var44] = var41;
            this.au[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.ck((byte)1) + var43;
            var43 = var42;
            this.am[var44] = var40;
            this.at[var44] = var41;
            this.au[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.ck((byte)1) + var43;
            var43 = var42;
            this.am[var44] = var40;
            this.at[var44] = var46;
            this.au[var44] = var42;
         }
      }

      var4.am = var33 * -725588083;

      for(var44 = 0; var44 < var11; ++var44) {
         this.ac[var44] = 0;
         this.av[var44] = (short)var4.ce(82189911);
         this.ax[var44] = (short)var4.ce(622679953);
         this.aq[var44] = (short)var4.ce(598446113);
      }

      if (this.ar != null) {
         boolean var48 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.ar[var45] & 255;
            if (var46 != 255) {
               if ((this.av[var46] & '\uffff') == this.am[var45] && (this.ax[var46] & '\uffff') == this.at[var45] && (this.aq[var46] & '\uffff') == this.au[var45]) {
                  this.ar[var45] = -1;
               } else {
                  var48 = true;
               }
            }
         }

         if (!var48) {
            this.ar = null;
         }
      }

      if (!var3) {
         this.az = null;
      }

      if (!var2) {
         this.an = null;
      }

   }

   void ai(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var4.am = (var1.length - 18) * -725588083;
      int var9 = var4.ce(511269694);
      int var10 = var4.ce(236857759);
      int var11 = var4.cy((short)-4537);
      int var12 = var4.cy((short)-25653);
      int var13 = var4.cy((short)-18292);
      int var14 = var4.cy((short)-21248);
      int var15 = var4.cy((short)-10922);
      int var16 = var4.cy((short)-10610);
      int var17 = var4.ce(1804012542);
      int var18 = var4.ce(1554489438);
      int var19 = var4.ce(1779265255);
      int var20 = var4.ce(727401024);
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var11 > 0) {
         this.ac = new byte[var11];
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      if (var16 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
         this.ar = new byte[var10];
         this.az = new short[var10];
      }

      if (var13 == 255) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      this.ab = new short[var10];
      var4.am = var21 * -725588083;
      var5.am = var32 * -725588083;
      var6.am = var33 * -725588083;
      var7.am = var45 * -725588083;
      var8.am = var27 * -725588083;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.cy((short)-28919);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.ck((byte)1);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.ck((byte)1);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.ck((byte)1);
         }

         this.ai[var38] = var35 + var40;
         this.ay[var38] = var36 + var41;
         this.as[var38] = var37 + var42;
         var35 = this.ai[var38];
         var36 = this.ay[var38];
         var37 = this.as[var38];
         if (var16 == 1) {
            this.al[var38] = var8.cy((short)-4012);
         }
      }

      var4.am = var30 * -725588083;
      var5.am = var26 * -725588083;
      var6.am = var24 * -725588083;
      var7.am = var28 * -725588083;
      var8.am = var25 * -725588083;

      for(var38 = 0; var38 < var10; ++var38) {
         this.ab[var38] = (short)var4.ce(489726498);
         if (var12 == 1) {
            var39 = var5.cy((short)-16210);
            if ((var39 & 1) == 1) {
               this.an[var38] = 1;
               var2 = true;
            } else {
               this.an[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ar[var38] = (byte)(var39 >> 2);
               this.az[var38] = this.ab[var38];
               this.ab[var38] = 127;
               if (this.az[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ar[var38] = -1;
               this.az[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.ao[var38] = var6.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var38] = var7.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var38] = var8.cy((short)-19902);
         }
      }

      var4.am = var29 * -725588083;
      var5.am = var23 * -725588083;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.cy((short)-32077);
         if (var43 == 1) {
            var38 = var4.ck((byte)1) + var41;
            var39 = var4.ck((byte)1) + var38;
            var40 = var4.ck((byte)1) + var39;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var44;
            this.au[var42] = var40;
         }
      }

      var4.am = var31 * -725588083;

      for(var42 = 0; var42 < var11; ++var42) {
         this.ac[var42] = 0;
         this.av[var42] = (short)var4.ce(2112816341);
         this.ax[var42] = (short)var4.ce(1986798459);
         this.aq[var42] = (short)var4.ce(1021062451);
      }

      if (this.ar != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ar[var43] & 255;
            if (var44 != 255) {
               if ((this.av[var44] & '\uffff') == this.am[var43] && (this.ax[var44] & '\uffff') == this.at[var43] && (this.aq[var44] & '\uffff') == this.au[var43]) {
                  this.ar[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.ar = null;
         }
      }

      if (!var3) {
         this.az = null;
      }

      if (!var2) {
         this.an = null;
      }

   }

   public void az() {
      for(int var1 = 0; var1 < this.aj; ++var1) {
         int var2 = this.as[var1];
         this.as[var1] = this.ai[var1];
         this.ai[var1] = -var2;
      }

      this.aa();
   }

   public void ag(int var1) {
      int var2 = bo[var1];
      int var3 = bd[var1];

      for(int var4 = 0; var4 < this.aj; ++var4) {
         int var5 = this.as[var4] * var2 + this.ai[var4] * var3 >> 16;
         this.as[var4] = this.as[var4] * var3 - this.ai[var4] * var2 >> 16;
         this.ai[var4] = var5;
      }

      this.aa();
   }

   public void ad(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aj; ++var4) {
         int[] var10000 = this.ai;
         var10000[var4] += var1;
         var10000 = this.ay;
         var10000[var4] += var2;
         var10000 = this.as;
         var10000[var4] += var3;
      }

      this.aa();
   }

   public void ac(short var1, short var2) {
      for(int var3 = 0; var3 < this.ae; ++var3) {
         if (this.ab[var3] == var1) {
            this.ab[var3] = var2;
         }
      }

   }

   public void av(short var1, short var2) {
      if (this.az != null) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            if (this.az[var3] == var1) {
               this.az[var3] = var2;
            }
         }

      }
   }

   public void dk(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aj; ++var4) {
         this.ai[var4] = this.ai[var4] * var1 / 128;
         this.ay[var4] = this.ay[var4] * var2 / 128;
         this.as[var4] = this.as[var4] * var3 / 128;
      }

      this.aa();
   }

   void bu(byte[] var1) {
      vl var2 = new vl(var1);
      vl var3 = new vl(var1);
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var2.am = (var1.length - 23) * -725588083;
      int var9 = var2.ce(902680047);
      int var10 = var2.ce(1452822976);
      int var11 = var2.cy((short)-30622);
      int var12 = var2.cy((short)-8947);
      int var13 = var2.cy((short)-2809);
      int var14 = var2.cy((short)-11604);
      int var15 = var2.cy((short)-11774);
      int var16 = var2.cy((short)-16643);
      int var17 = var2.cy((short)-25872);
      int var18 = var2.ce(1662765700);
      int var19 = var2.ce(1238828512);
      int var20 = var2.ce(1566284200);
      int var21 = var2.ce(1887106174);
      int var22 = var2.ce(1095272707);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.ac = new byte[var11];
         var2.am = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.ac[var26] = var2.cu((byte)13);
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var17 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
      }

      if (var13 == 255) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      if (var16 == 1) {
         this.az = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ar = new byte[var10];
      }

      this.ab = new short[var10];
      if (var11 > 0) {
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      var2.am = var11 * -725588083;
      var3.am = var38 * -725588083;
      var4.am = var39 * -725588083;
      var5.am = var40 * -725588083;
      var6.am = var32 * -725588083;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.cy((short)-17786);
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.ck((byte)1);
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.ck((byte)1);
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.ck((byte)1);
         }

         this.ai[var51] = var48 + var53;
         this.ay[var51] = var49 + var54;
         this.as[var51] = var50 + var55;
         var48 = this.ai[var51];
         var49 = this.ay[var51];
         var50 = this.as[var51];
         if (var17 == 1) {
            this.al[var51] = var6.cy((short)-9131);
         }
      }

      var2.am = var37 * -725588083;
      var3.am = var28 * -725588083;
      var4.am = var30 * -725588083;
      var5.am = var33 * -725588083;
      var6.am = var31 * -725588083;
      var7.am = var35 * -725588083;
      var8.am = var36 * -725588083;

      for(var51 = 0; var51 < var10; ++var51) {
         this.ab[var51] = (short)var2.ce(1386171152);
         if (var12 == 1) {
            this.an[var51] = var3.cu((byte)13);
         }

         if (var13 == 255) {
            this.ao[var51] = var4.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var51] = var5.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var51] = var6.cy((short)-7736);
         }

         if (var16 == 1) {
            this.az[var51] = (short)(var7.ce(1750770683) - 1);
         }

         if (this.ar != null && this.az[var51] != -1) {
            this.ar[var51] = (byte)(var8.cy((short)-28171) - 1);
         }
      }

      var2.am = var34 * -725588083;
      var3.am = var29 * -725588083;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.cy((short)-974);
         if (var56 == 1) {
            var51 = var2.ck((byte)1) + var54;
            var52 = var2.ck((byte)1) + var51;
            var53 = var2.ck((byte)1) + var52;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var57;
            this.au[var55] = var53;
         }
      }

      var2.am = var41 * -725588083;
      var3.am = var42 * -725588083;
      var4.am = var43 * -725588083;
      var5.am = var44 * -725588083;
      var6.am = var45 * -725588083;
      var7.am = var46 * -725588083;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.ac[var55] & 255;
         if (var56 == 0) {
            this.av[var55] = (short)var2.ce(1965793472);
            this.ax[var55] = (short)var2.ce(136039553);
            this.aq[var55] = (short)var2.ce(953333863);
         }
      }

      var2.am = var26 * -725588083;
      var55 = var2.cy((short)46);
      if (var55 != 0) {
         new kg();
         var2.ce(1754876263);
         var2.ce(1414739498);
         var2.ce(1083568868);
         var2.ch(1203709469);
      }

   }

   public void al() {
      if (this.bk == null) {
         this.bk = new je[this.aj];

         int var1;
         for(var1 = 0; var1 < this.aj; ++var1) {
            this.bk[var1] = new je();
         }

         for(var1 = 0; var1 < this.ae; ++var1) {
            int var2 = this.am[var1];
            int var3 = this.at[var1];
            int var4 = this.au[var1];
            int var5 = this.ai[var3] - this.ai[var2];
            int var6 = this.ay[var3] - this.ay[var2];
            int var7 = this.as[var3] - this.as[var2];
            int var8 = this.ai[var4] - this.ai[var2];
            int var9 = this.ay[var4] - this.ay[var2];
            int var10 = this.as[var4] - this.as[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.an == null) {
               var15 = 0;
            } else {
               var15 = this.an[var1];
            }

            if (var15 == 0) {
               je var16 = this.bk[var2];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 1561144909;
               var16.aj += 999105089;
               var16 = this.bk[var3];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 1561144909;
               var16.aj += 999105089;
               var16 = this.bk[var4];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 1561144909;
               var16.aj += 999105089;
            } else if (var15 == 1) {
               if (this.bx == null) {
                  this.bx = new jf[this.ae];
               }

               jf var17 = this.bx[var1] = new jf();
               var17.ap = var11 * -390908909;
               var17.aw = var12 * 2044340507;
               var17.ak = var13 * -2136825449;
            }
         }

      }
   }

   void cu() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.al != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.aj; ++var3) {
            var4 = this.al[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.ah = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.ah[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.aj; this.ah[var4][var1[var4]++] = var3++) {
            var4 = this.al[var3];
         }

         this.al = null;
      }

      if (this.aa != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.ae; ++var3) {
            var4 = this.aa[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.bh = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.bh[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.ae; this.bh[var4][var1[var4]++] = var3++) {
            var4 = this.aa[var3];
         }

         this.aa = null;
      }

   }

   void ah() {
      if (!this.bz) {
         this.ez = 0;
         this.bc = 0;
         this.by = 999999;
         this.br = -999999;
         this.bn = -99999;
         this.bu = 99999;

         for(int var1 = 0; var1 < this.aj; ++var1) {
            int var2 = this.ai[var1];
            int var3 = this.ay[var1];
            int var4 = this.as[var1];
            if (var2 < this.by) {
               this.by = var2;
            }

            if (var2 > this.br) {
               this.br = var2;
            }

            if (var4 < this.bu) {
               this.bu = var4;
            }

            if (var4 > this.bn) {
               this.bn = var4;
            }

            if (-var3 > this.ez * -274986519) {
               this.ez = -var3 * 2132106841;
            }

            if (var3 > this.bc) {
               this.bc = var3;
            }
         }

         this.bz = true;
      }
   }

   public void dc(short var1, short var2) {
      if (this.az != null) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            if (this.az[var3] == var1) {
               this.az[var3] = var2;
            }
         }

      }
   }

   static final int eh(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 896210166) {
         var0 = 126;
      }

      return var0;
   }

   static final int bv(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   static final int bx(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   static {
      bo = jm.aj;
      bd = jm.ai;
   }

   public static jj bk(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 1687214795);
      return var3 == null ? null : new jj(var3);
   }

   public int cf(int var1, int var2, int var3, byte var4, byte var5, short var6, short var7) {
      this.am[this.ae] = var1;
      this.at[this.ae] = var2;
      this.au[this.ae] = var3;
      this.an[this.ae] = var4;
      this.ar[this.ae] = var5;
      this.ab[this.ae] = var6;
      this.az[this.ae] = var7;
      return this.ae++;
   }

   public void ar() {
      for(int var1 = 0; var1 < this.aj; ++var1) {
         int var2 = this.ai[var1];
         this.ai[var1] = this.as[var1];
         this.as[var1] = -var2;
      }

      this.aa();
   }

   public static jj bp(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 844479043);
      return var3 == null ? null : new jj(var3);
   }

   public static jj ap(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 1302171392);
      return var3 == null ? null : new jj(var3);
   }

   public int cl(int var1, int var2, int var3, byte var4, byte var5, short var6, short var7) {
      this.am[this.ae] = var1;
      this.at[this.ae] = var2;
      this.au[this.ae] = var3;
      this.an[this.ae] = var4;
      this.ar[this.ae] = var5;
      this.ab[this.ae] = var6;
      this.az[this.ae] = var7;
      return this.ae++;
   }

   public jj bg() {
      jj var1 = new jj();
      if (this.an != null) {
         var1.an = new byte[this.ae];

         for(int var2 = 0; var2 < this.ae; ++var2) {
            var1.an[var2] = this.an[var2];
         }
      }

      var1.aj = this.aj;
      var1.ae = this.ae;
      var1.ad = this.ad;
      var1.ai = this.ai;
      var1.ay = this.ay;
      var1.as = this.as;
      var1.am = this.am;
      var1.at = this.at;
      var1.au = this.au;
      var1.ao = this.ao;
      var1.af = this.af;
      var1.ar = this.ar;
      var1.ab = this.ab;
      var1.az = this.az;
      var1.ag = this.ag;
      var1.ac = this.ac;
      var1.av = this.av;
      var1.ax = this.ax;
      var1.aq = this.aq;
      var1.al = this.al;
      var1.aa = this.aa;
      var1.ah = this.ah;
      var1.bh = this.bh;
      var1.bk = this.bk;
      var1.bx = this.bx;
      var1.bq = this.bq;
      var1.bp = this.bp;
      return var1;
   }

   void br(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var4.am = (var1.length - 23) * -725588083;
      int var9 = var4.ce(520159886);
      int var10 = var4.ce(2140068832);
      int var11 = var4.cy((short)-5339);
      int var12 = var4.cy((short)-25502);
      int var13 = var4.cy((short)-12714);
      int var14 = var4.cy((short)-8869);
      int var15 = var4.cy((short)-20557);
      int var16 = var4.cy((short)-30547);
      int var17 = var4.cy((short)-8966);
      int var18 = var4.ce(1588708666);
      int var19 = var4.ce(1200254767);
      int var20 = var4.ce(1921600860);
      int var21 = var4.ce(1982360122);
      int var22 = var4.ce(227884015);
      byte var23 = 0;
      int var47 = var23 + var9;
      int var25 = var47;
      var47 += var10;
      int var26 = var47;
      if (var13 == 255) {
         var47 += var10;
      }

      int var27 = var47;
      if (var15 == 1) {
         var47 += var10;
      }

      int var28 = var47;
      if (var12 == 1) {
         var47 += var10;
      }

      int var29 = var47;
      var47 += var22;
      int var30 = var47;
      if (var14 == 1) {
         var47 += var10;
      }

      int var31 = var47;
      var47 += var21;
      int var32 = var47;
      var47 += var10 * 2;
      int var33 = var47;
      var47 += var11 * 6;
      int var34 = var47;
      var47 += var18;
      int var35 = var47;
      var47 += var19;
      int var10000 = var47 + var20;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var11 > 0) {
         this.ac = new byte[var11];
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      if (var16 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
         this.ar = new byte[var10];
         this.az = new short[var10];
      }

      if (var13 == 255) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      if (var17 == 1) {
         this.bj = new int[var9][];
         this.bv = new int[var9][];
      }

      this.ab = new short[var10];
      var4.am = var23 * -725588083;
      var5.am = var34 * -725588083;
      var6.am = var35 * -725588083;
      var7.am = var47 * -725588083;
      var8.am = var29 * -725588083;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.cy((short)-16511);
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.ck((byte)1);
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.ck((byte)1);
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.ck((byte)1);
         }

         this.ai[var40] = var37 + var42;
         this.ay[var40] = var38 + var43;
         this.as[var40] = var39 + var44;
         var37 = this.ai[var40];
         var38 = this.ay[var40];
         var39 = this.as[var40];
         if (var16 == 1) {
            this.al[var40] = var8.cy((short)-11597);
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.cy((short)-20282);
            this.bj[var40] = new int[var41];
            this.bv[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.bj[var40][var42] = var8.cy((short)-4442);
               this.bv[var40][var42] = var8.cy((short)-7161);
            }
         }
      }

      var4.am = var32 * -725588083;
      var5.am = var28 * -725588083;
      var6.am = var26 * -725588083;
      var7.am = var30 * -725588083;
      var8.am = var27 * -725588083;

      for(var40 = 0; var40 < var10; ++var40) {
         this.ab[var40] = (short)var4.ce(1447417925);
         if (var12 == 1) {
            var41 = var5.cy((short)-29385);
            if ((var41 & 1) == 1) {
               this.an[var40] = 1;
               var2 = true;
            } else {
               this.an[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.ar[var40] = (byte)(var41 >> 2);
               this.az[var40] = this.ab[var40];
               this.ab[var40] = 127;
               if (this.az[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.ar[var40] = -1;
               this.az[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.ao[var40] = var6.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var40] = var7.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var40] = var8.cy((short)-1222);
         }
      }

      var4.am = var31 * -725588083;
      var5.am = var25 * -725588083;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.cy((short)-29460);
         if (var45 == 1) {
            var40 = var4.ck((byte)1) + var43;
            var41 = var4.ck((byte)1) + var40;
            var42 = var4.ck((byte)1) + var41;
            var43 = var42;
            this.am[var44] = var40;
            this.at[var44] = var41;
            this.au[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.ck((byte)1) + var43;
            var43 = var42;
            this.am[var44] = var40;
            this.at[var44] = var41;
            this.au[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.ck((byte)1) + var43;
            var43 = var42;
            this.am[var44] = var40;
            this.at[var44] = var41;
            this.au[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.ck((byte)1) + var43;
            var43 = var42;
            this.am[var44] = var40;
            this.at[var44] = var46;
            this.au[var44] = var42;
         }
      }

      var4.am = var33 * -725588083;

      for(var44 = 0; var44 < var11; ++var44) {
         this.ac[var44] = 0;
         this.av[var44] = (short)var4.ce(286309044);
         this.ax[var44] = (short)var4.ce(482538992);
         this.aq[var44] = (short)var4.ce(1235701367);
      }

      if (this.ar != null) {
         boolean var48 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.ar[var45] & 255;
            if (var46 != 255) {
               if ((this.av[var46] & '\uffff') == this.am[var45] && (this.ax[var46] & '\uffff') == this.at[var45] && (this.aq[var46] & '\uffff') == this.au[var45]) {
                  this.ar[var45] = -1;
               } else {
                  var48 = true;
               }
            }
         }

         if (!var48) {
            this.ar = null;
         }
      }

      if (!var3) {
         this.az = null;
      }

      if (!var2) {
         this.an = null;
      }

   }

   void bn(byte[] var1) {
      vl var2 = new vl(var1);
      vl var3 = new vl(var1);
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var2.am = (var1.length - 23) * -725588083;
      int var9 = var2.ce(2104486296);
      int var10 = var2.ce(2129299367);
      int var11 = var2.cy((short)-6821);
      int var12 = var2.cy((short)-17430);
      int var13 = var2.cy((short)-9633);
      int var14 = var2.cy((short)-974);
      int var15 = var2.cy((short)-8809);
      int var16 = var2.cy((short)-23107);
      int var17 = var2.cy((short)-11349);
      int var18 = var2.ce(597243766);
      int var19 = var2.ce(1469881716);
      int var20 = var2.ce(1891315175);
      int var21 = var2.ce(395498645);
      int var22 = var2.ce(1908862665);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.ac = new byte[var11];
         var2.am = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.ac[var26] = var2.cu((byte)13);
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var17 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
      }

      if (var13 == 255) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      if (var16 == 1) {
         this.az = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ar = new byte[var10];
      }

      this.ab = new short[var10];
      if (var11 > 0) {
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      var2.am = var11 * -725588083;
      var3.am = var38 * -725588083;
      var4.am = var39 * -725588083;
      var5.am = var40 * -725588083;
      var6.am = var32 * -725588083;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.cy((short)-31312);
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.ck((byte)1);
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.ck((byte)1);
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.ck((byte)1);
         }

         this.ai[var51] = var48 + var53;
         this.ay[var51] = var49 + var54;
         this.as[var51] = var50 + var55;
         var48 = this.ai[var51];
         var49 = this.ay[var51];
         var50 = this.as[var51];
         if (var17 == 1) {
            this.al[var51] = var6.cy((short)-2945);
         }
      }

      var2.am = var37 * -725588083;
      var3.am = var28 * -725588083;
      var4.am = var30 * -725588083;
      var5.am = var33 * -725588083;
      var6.am = var31 * -725588083;
      var7.am = var35 * -725588083;
      var8.am = var36 * -725588083;

      for(var51 = 0; var51 < var10; ++var51) {
         this.ab[var51] = (short)var2.ce(841827652);
         if (var12 == 1) {
            this.an[var51] = var3.cu((byte)13);
         }

         if (var13 == 255) {
            this.ao[var51] = var4.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var51] = var5.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var51] = var6.cy((short)-28585);
         }

         if (var16 == 1) {
            this.az[var51] = (short)(var7.ce(84190285) - 1);
         }

         if (this.ar != null && this.az[var51] != -1) {
            this.ar[var51] = (byte)(var8.cy((short)-24966) - 1);
         }
      }

      var2.am = var34 * -725588083;
      var3.am = var29 * -725588083;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.cy((short)-15192);
         if (var56 == 1) {
            var51 = var2.ck((byte)1) + var54;
            var52 = var2.ck((byte)1) + var51;
            var53 = var2.ck((byte)1) + var52;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var57;
            this.au[var55] = var53;
         }
      }

      var2.am = var41 * -725588083;
      var3.am = var42 * -725588083;
      var4.am = var43 * -725588083;
      var5.am = var44 * -725588083;
      var6.am = var45 * -725588083;
      var7.am = var46 * -725588083;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.ac[var55] & 255;
         if (var56 == 0) {
            this.av[var55] = (short)var2.ce(222077039);
            this.ax[var55] = (short)var2.ce(408538004);
            this.aq[var55] = (short)var2.ce(1548819189);
         }
      }

      var2.am = var26 * -725588083;
      var55 = var2.cy((short)-21901);
      if (var55 != 0) {
         new kg();
         var2.ce(2056435765);
         var2.ce(1586759892);
         var2.ce(774593890);
         var2.ch(1203709469);
      }

   }

   public jj be() {
      jj var1 = new jj();
      if (this.an != null) {
         var1.an = new byte[this.ae];

         for(int var2 = 0; var2 < this.ae; ++var2) {
            var1.an[var2] = this.an[var2];
         }
      }

      var1.aj = this.aj;
      var1.ae = this.ae;
      var1.ad = this.ad;
      var1.ai = this.ai;
      var1.ay = this.ay;
      var1.as = this.as;
      var1.am = this.am;
      var1.at = this.at;
      var1.au = this.au;
      var1.ao = this.ao;
      var1.af = this.af;
      var1.ar = this.ar;
      var1.ab = this.ab;
      var1.az = this.az;
      var1.ag = this.ag;
      var1.ac = this.ac;
      var1.av = this.av;
      var1.ax = this.ax;
      var1.aq = this.aq;
      var1.al = this.al;
      var1.aa = this.aa;
      var1.ah = this.ah;
      var1.bh = this.bh;
      var1.bk = this.bk;
      var1.bx = this.bx;
      var1.bq = this.bq;
      var1.bp = this.bp;
      return var1;
   }

   public final jy di(int var1, int var2, int var3, int var4, int var5) {
      this.al();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      jy var8 = new jy();
      var8.ab = new int[this.ae];
      var8.az = new int[this.ae];
      var8.ag = new int[this.ae];
      if (this.ad > 0 && this.ar != null) {
         int[] var9 = new int[this.ad];

         int var10;
         for(var10 = 0; var10 < this.ae; ++var10) {
            if (this.ar[var10] != -1) {
               ++var9[this.ar[var10] & -445215758];
            }
         }

         var8.al = 0;

         for(var10 = 0; var10 < this.ad; ++var10) {
            if (var9[var10] > 0 && this.ac[var10] == 0) {
               ++var8.al;
            }
         }

         var8.aa = new int[var8.al];
         var8.ah = new int[var8.al];
         var8.bh = new int[var8.al];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.ad; ++var11) {
            if (var9[var11] > 0 && this.ac[var11] == 0) {
               var8.aa[var10] = this.av[var11] & '\uffff';
               var8.ah[var10] = this.ax[var11] & 1889203815;
               var8.bh[var10] = this.aq[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.av = new byte[this.ae];

         for(var11 = 0; var11 < this.ae; ++var11) {
            if (this.ar[var11] != -1) {
               var8.av[var11] = (byte)var9[this.ar[var11] & 255];
            } else {
               var8.av[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.ae; ++var16) {
         byte var17;
         if (this.an == null) {
            var17 = 0;
         } else {
            var17 = this.an[var16];
         }

         byte var18;
         if (this.af == null) {
            var18 = 0;
         } else {
            var18 = this.af[var16];
         }

         short var12;
         if (this.az == null) {
            var12 = -1;
         } else {
            var12 = this.az[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         je var13;
         int var14;
         jf var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.bx[var16];
                  var14 = var1 + (var3 * var19.ap * -749321155 + var4 * var19.aw * -1226372845 + var5 * var19.ak * 618262055) / (var7 + var7 / 2);
                  var8.ab[var16] = bv(this.ab[var16] & 711595419, var14);
                  var8.ag[var16] = -1;
               } else if (var17 == 3) {
                  var8.ab[var16] = -782443935;
                  var8.ag[var16] = -1;
               } else {
                  var8.ag[var16] = -1217136773;
               }
            } else {
               int var15 = this.ab[var16] & 28460687;
               if (this.bb != null && this.bb[this.am[var16]] != null) {
                  var13 = this.bb[this.am[var16]];
               } else {
                  var13 = this.bk[this.am[var16]];
               }

               var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 2097863439 + var5 * var13.ak * -1692624336) / (var7 * var13.aj * 52686273);
               var8.ab[var16] = bv(var15, var14);
               if (this.bb != null && this.bb[this.at[var16]] != null) {
                  var13 = this.bb[this.at[var16]];
               } else {
                  var13 = this.bk[this.at[var16]];
               }

               var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 991975417 + var5 * var13.ak * -206970911) / (var7 * var13.aj * 1234688905);
               var8.az[var16] = bv(var15, var14);
               if (this.bb != null && this.bb[this.au[var16]] != null) {
                  var13 = this.bb[this.au[var16]];
               } else {
                  var13 = this.bk[this.au[var16]];
               }

               var14 = var1 + (var3 * var13.ap * -1908035758 + var4 * var13.aw * -1140948585 + var5 * var13.ak * -703612283) / (var7 * var13.aj * 1425338138);
               var8.ag[var16] = bv(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.bx[var16];
               var14 = var1 + (var3 * var19.ap * -1986671509 + var4 * var19.aw * 2085593504 + var5 * var19.ak * -1965001659) / (var7 + var7 / 2);
               var8.ab[var16] = bx(var14);
               var8.ag[var16] = -1;
            } else {
               var8.ag[var16] = 610384722;
            }
         } else {
            if (this.bb != null && this.bb[this.am[var16]] != null) {
               var13 = this.bb[this.am[var16]];
            } else {
               var13 = this.bk[this.am[var16]];
            }

            var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * -678954218 + var5 * var13.ak * 1265992549) / (var7 * var13.aj * 1547403632);
            var8.ab[var16] = bx(var14);
            if (this.bb != null && this.bb[this.at[var16]] != null) {
               var13 = this.bb[this.at[var16]];
            } else {
               var13 = this.bk[this.at[var16]];
            }

            var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 795253090 + var5 * var13.ak * 463637375) / (var7 * var13.aj * 520279422);
            var8.az[var16] = bx(var14);
            if (this.bb != null && this.bb[this.au[var16]] != null) {
               var13 = this.bb[this.au[var16]];
            } else {
               var13 = this.bk[this.au[var16]];
            }

            var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * -892389345 + var5 * var13.ak * -703612283) / (var7 * var13.aj * -1421271665);
            var8.ag[var16] = bx(var14);
         }
      }

      this.af();
      var8.ae = this.aj;
      var8.am = this.ai;
      var8.at = this.ay;
      var8.au = this.as;
      var8.an = this.ae;
      var8.ao = this.am;
      var8.af = this.at;
      var8.ar = this.au;
      var8.ad = this.ao;
      var8.ac = this.af;
      var8.aq = this.ag;
      var8.bj = this.ah;
      var8.bv = this.bh;
      var8.ax = this.az;
      var8.bx = this.bj;
      var8.bk = this.bv;
      return var8;
   }

   public void ca(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aj; ++var4) {
         int[] var10000 = this.ai;
         var10000[var4] += var1;
         var10000 = this.ay;
         var10000[var4] += var2;
         var10000 = this.as;
         var10000[var4] += var3;
      }

      this.aa();
   }

   void bm(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var4.am = (var1.length - 18) * -725588083;
      int var9 = var4.ce(1050713336);
      int var10 = var4.ce(1432276931);
      int var11 = var4.cy((short)-12842);
      int var12 = var4.cy((short)-9439);
      int var13 = var4.cy((short)-6031);
      int var14 = var4.cy((short)-21123);
      int var15 = var4.cy((short)-886);
      int var16 = var4.cy((short)-17258);
      int var17 = var4.ce(1000743789);
      int var18 = var4.ce(1993221194);
      int var19 = var4.ce(1515839806);
      int var20 = var4.ce(539376937);
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == 1121808955) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var11 > 0) {
         this.ac = new byte[var11];
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      if (var16 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
         this.ar = new byte[var10];
         this.az = new short[var10];
      }

      if (var13 == 2057470455) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      this.ab = new short[var10];
      var4.am = var21 * -1636270161;
      var5.am = var32 * -2113703191;
      var6.am = var33 * -725588083;
      var7.am = var45 * 483877234;
      var8.am = var27 * -1641873403;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.cy((short)-7774);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.ck((byte)1);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.ck((byte)1);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.ck((byte)1);
         }

         this.ai[var38] = var35 + var40;
         this.ay[var38] = var36 + var41;
         this.as[var38] = var37 + var42;
         var35 = this.ai[var38];
         var36 = this.ay[var38];
         var37 = this.as[var38];
         if (var16 == 1) {
            this.al[var38] = var8.cy((short)-10278);
         }
      }

      var4.am = var30 * -1806999673;
      var5.am = var26 * -853976269;
      var6.am = var24 * -725588083;
      var7.am = var28 * -725588083;
      var8.am = var25 * 421219484;

      for(var38 = 0; var38 < var10; ++var38) {
         this.ab[var38] = (short)var4.ce(1761304389);
         if (var12 == 1) {
            var39 = var5.cy((short)-9657);
            if ((var39 & 1) == 1) {
               this.an[var38] = 1;
               var2 = true;
            } else {
               this.an[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ar[var38] = (byte)(var39 >> 2);
               this.az[var38] = this.ab[var38];
               this.ab[var38] = 127;
               if (this.az[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ar[var38] = -1;
               this.az[var38] = -1;
            }
         }

         if (var13 == 389995443) {
            this.ao[var38] = var6.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var38] = var7.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var38] = var8.cy((short)-6141);
         }
      }

      var4.am = var29 * 1154620397;
      var5.am = var23 * -725588083;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.cy((short)-17430);
         if (var43 == 1) {
            var38 = var4.ck((byte)1) + var41;
            var39 = var4.ck((byte)1) + var38;
            var40 = var4.ck((byte)1) + var39;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var44;
            this.au[var42] = var40;
         }
      }

      var4.am = var31 * -725588083;

      for(var42 = 0; var42 < var11; ++var42) {
         this.ac[var42] = 0;
         this.av[var42] = (short)var4.ce(1699838722);
         this.ax[var42] = (short)var4.ce(1240890445);
         this.aq[var42] = (short)var4.ce(807088411);
      }

      if (this.ar != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ar[var43] & 58020772;
            if (var44 != 1959835859) {
               if ((this.av[var44] & -1540983165) == this.am[var43] && (this.ax[var44] & '\uffff') == this.at[var43] && (this.aq[var44] & 238315012) == this.au[var43]) {
                  this.ar[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.ar = null;
         }
      }

      if (!var3) {
         this.az = null;
      }

      if (!var2) {
         this.an = null;
      }

   }

   void bo(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var4.am = (var1.length - 18) * -725588083;
      int var9 = var4.ce(1863072301);
      int var10 = var4.ce(2034016348);
      int var11 = var4.cy((short)-13420);
      int var12 = var4.cy((short)-7946);
      int var13 = var4.cy((short)-26657);
      int var14 = var4.cy((short)-28065);
      int var15 = var4.cy((short)-8449);
      int var16 = var4.cy((short)-3409);
      int var17 = var4.ce(1867850905);
      int var18 = var4.ce(49463306);
      int var19 = var4.ce(224461544);
      int var20 = var4.ce(918034259);
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == -1213303075) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var11 > 0) {
         this.ac = new byte[var11];
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      if (var16 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
         this.ar = new byte[var10];
         this.az = new short[var10];
      }

      if (var13 == 805820257) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      this.ab = new short[var10];
      var4.am = var21 * -725588083;
      var5.am = var32 * 460943158;
      var6.am = var33 * -725588083;
      var7.am = var45 * -1530708732;
      var8.am = var27 * 1528272791;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.cy((short)-10357);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.ck((byte)1);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.ck((byte)1);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.ck((byte)1);
         }

         this.ai[var38] = var35 + var40;
         this.ay[var38] = var36 + var41;
         this.as[var38] = var37 + var42;
         var35 = this.ai[var38];
         var36 = this.ay[var38];
         var37 = this.as[var38];
         if (var16 == 1) {
            this.al[var38] = var8.cy((short)-3074);
         }
      }

      var4.am = var30 * -725588083;
      var5.am = var26 * 2041062461;
      var6.am = var24 * -725588083;
      var7.am = var28 * -725588083;
      var8.am = var25 * 1862836841;

      for(var38 = 0; var38 < var10; ++var38) {
         this.ab[var38] = (short)var4.ce(1525362513);
         if (var12 == 1) {
            var39 = var5.cy((short)-32713);
            if ((var39 & 1) == 1) {
               this.an[var38] = 1;
               var2 = true;
            } else {
               this.an[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ar[var38] = (byte)(var39 >> 2);
               this.az[var38] = this.ab[var38];
               this.ab[var38] = (short)1733452179;
               if (this.az[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ar[var38] = -1;
               this.az[var38] = -1;
            }
         }

         if (var13 == 1936006930) {
            this.ao[var38] = var6.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var38] = var7.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var38] = var8.cy((short)-27130);
         }
      }

      var4.am = var29 * -725588083;
      var5.am = var23 * 606649243;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.cy((short)-21971);
         if (var43 == 1) {
            var38 = var4.ck((byte)1) + var41;
            var39 = var4.ck((byte)1) + var38;
            var40 = var4.ck((byte)1) + var39;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var44;
            this.au[var42] = var40;
         }
      }

      var4.am = var31 * -725588083;

      for(var42 = 0; var42 < var11; ++var42) {
         this.ac[var42] = 0;
         this.av[var42] = (short)var4.ce(289917172);
         this.ax[var42] = (short)var4.ce(1958861684);
         this.aq[var42] = (short)var4.ce(263345545);
      }

      if (this.ar != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ar[var43] & 255;
            if (var44 != 293968799) {
               if ((this.av[var44] & 988980590) == this.am[var43] && (this.ax[var44] & 298224915) == this.at[var43] && (this.aq[var44] & 977589589) == this.au[var43]) {
                  this.ar[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.ar = null;
         }
      }

      if (!var3) {
         this.az = null;
      }

      if (!var2) {
         this.an = null;
      }

   }

   static void bh(jj var0, jj var1, int var2, int var3, int var4, boolean var5) {
      var0.ah();
      var0.al();
      var1.ah();
      var1.al();
      ++bm;
      int var6 = 0;
      int[] var7 = var1.ai;
      int var8 = var1.aj;

      int var9;
      for(var9 = 0; var9 < var0.aj; ++var9) {
         je var10 = var0.bk[var9];
         if (var10.aj * 52686273 != 0) {
            int var11 = var0.ay[var9] - var3;
            if (var11 <= var1.bc) {
               int var12 = var0.ai[var9] - var2;
               if (var12 >= var1.by && var12 <= var1.br) {
                  int var13 = var0.as[var9] - var4;
                  if (var13 >= var1.bu && var13 <= var1.bn) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        je var15 = var1.bk[var14];
                        if (var12 == var7[var14] && var13 == var1.as[var14] && var11 == var1.ay[var14] && var15.aj * 52686273 != 0) {
                           if (var0.bb == null) {
                              var0.bb = new je[var0.aj];
                           }

                           if (var1.bb == null) {
                              var1.bb = new je[var8];
                           }

                           je var16 = var0.bb[var9];
                           if (var16 == null) {
                              var16 = var0.bb[var9] = new je(var10);
                           }

                           je var17 = var1.bb[var14];
                           if (var17 == null) {
                              var17 = var1.bb[var14] = new je(var15);
                           }

                           var16.ap += var15.ap * 1;
                           var16.aw += var15.aw * 1;
                           var16.ak += var15.ak * 1;
                           var16.aj += var15.aj * 1;
                           var17.ap += var10.ap * 1;
                           var17.aw += var10.aw * 1;
                           var17.ak += var10.ak * 1;
                           var17.aj += var10.aj * 1;
                           ++var6;
                           bt[var9] = bm;
                           bs[var14] = bm;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.ae; ++var9) {
            if (bt[var0.am[var9]] == bm && bt[var0.at[var9]] == bm && bt[var0.au[var9]] == bm) {
               if (var0.an == null) {
                  var0.an = new byte[var0.ae];
               }

               var0.an[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.ae; ++var9) {
            if (bs[var1.am[var9]] == bm && bs[var1.at[var9]] == bm && bs[var1.au[var9]] == bm) {
               if (var1.an == null) {
                  var1.an = new byte[var1.ae];
               }

               var1.an[var9] = 2;
            }
         }

      }
   }

   public void ax() {
      int var1;
      for(var1 = 0; var1 < this.aj; ++var1) {
         this.as[var1] = -this.as[var1];
      }

      for(var1 = 0; var1 < this.ae; ++var1) {
         int var2 = this.am[var1];
         this.am[var1] = this.au[var1];
         this.au[var1] = var2;
      }

      this.aa();
   }

   final int bw(jj var1, int var2) {
      int var3 = -1;
      int var4 = var1.ai[var2];
      int var5 = var1.ay[var2];
      int var6 = var1.as[var2];

      for(int var7 = 0; var7 < this.aj; ++var7) {
         if (var4 == this.ai[var7] && var5 == this.ay[var7] && var6 == this.as[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.ai[this.aj] = var4;
         this.ay[this.aj] = var5;
         this.as[this.aj] = var6;
         if (var1.al != null) {
            this.al[this.aj] = var1.al[var2];
         }

         if (var1.bj != null) {
            this.bj[this.aj] = var1.bj[var2];
            this.bv[this.aj] = var1.bv[var2];
         }

         var3 = this.aj++;
      }

      return var3;
   }

   final int bi(jj var1, int var2) {
      int var3 = -1;
      int var4 = var1.ai[var2];
      int var5 = var1.ay[var2];
      int var6 = var1.as[var2];

      for(int var7 = 0; var7 < this.aj; ++var7) {
         if (var4 == this.ai[var7] && var5 == this.ay[var7] && var6 == this.as[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.ai[this.aj] = var4;
         this.ay[this.aj] = var5;
         this.as[this.aj] = var6;
         if (var1.al != null) {
            this.al[this.aj] = var1.al[var2];
         }

         if (var1.bj != null) {
            this.bj[this.aj] = var1.bj[var2];
            this.bv[this.aj] = var1.bv[var2];
         }

         var3 = this.aj++;
      }

      return var3;
   }

   public void dm() {
      if (this.bk == null) {
         this.bk = new je[this.aj];

         int var1;
         for(var1 = 0; var1 < this.aj; ++var1) {
            this.bk[var1] = new je();
         }

         for(var1 = 0; var1 < this.ae; ++var1) {
            int var2 = this.am[var1];
            int var3 = this.at[var1];
            int var4 = this.au[var1];
            int var5 = this.ai[var3] - this.ai[var2];
            int var6 = this.ay[var3] - this.ay[var2];
            int var7 = this.as[var3] - this.as[var2];
            int var8 = this.ai[var4] - this.ai[var2];
            int var9 = this.ay[var4] - this.ay[var2];
            int var10 = this.as[var4] - this.as[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.an == null) {
               var15 = 0;
            } else {
               var15 = this.an[var1];
            }

            if (var15 == 0) {
               je var16 = this.bk[var2];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 1561144909;
               var16.aj += 999105089;
               var16 = this.bk[var3];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 1561144909;
               var16.aj += 999105089;
               var16 = this.bk[var4];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 1561144909;
               var16.aj += 999105089;
            } else if (var15 == 1) {
               if (this.bx == null) {
                  this.bx = new jf[this.ae];
               }

               jf var17 = this.bx[var1] = new jf();
               var17.ap = var11 * -390908909;
               var17.aw = var12 * 2044340507;
               var17.ak = var13 * -2136825449;
            }
         }

      }
   }

   jj() {
   }

   public jj bl() {
      jj var1 = new jj();
      if (this.an != null) {
         var1.an = new byte[this.ae];

         for(int var2 = 0; var2 < this.ae; ++var2) {
            var1.an[var2] = this.an[var2];
         }
      }

      var1.aj = this.aj;
      var1.ae = this.ae;
      var1.ad = this.ad;
      var1.ai = this.ai;
      var1.ay = this.ay;
      var1.as = this.as;
      var1.am = this.am;
      var1.at = this.at;
      var1.au = this.au;
      var1.ao = this.ao;
      var1.af = this.af;
      var1.ar = this.ar;
      var1.ab = this.ab;
      var1.az = this.az;
      var1.ag = this.ag;
      var1.ac = this.ac;
      var1.av = this.av;
      var1.ax = this.ax;
      var1.aq = this.aq;
      var1.al = this.al;
      var1.aa = this.aa;
      var1.ah = this.ah;
      var1.bh = this.bh;
      var1.bk = this.bk;
      var1.bx = this.bx;
      var1.bq = this.bq;
      var1.bp = this.bp;
      return var1;
   }

   void bd(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var4.am = (var1.length - 18) * -725588083;
      int var9 = var4.ce(690344736);
      int var10 = var4.ce(1971703711);
      int var11 = var4.cy((short)-1712);
      int var12 = var4.cy((short)-15486);
      int var13 = var4.cy((short)-19806);
      int var14 = var4.cy((short)-9080);
      int var15 = var4.cy((short)-1081);
      int var16 = var4.cy((short)-20322);
      int var17 = var4.ce(217856812);
      int var18 = var4.ce(1857813369);
      int var19 = var4.ce(971951920);
      int var20 = var4.ce(1398922603);
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var11 > 0) {
         this.ac = new byte[var11];
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      if (var16 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
         this.ar = new byte[var10];
         this.az = new short[var10];
      }

      if (var13 == 255) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      this.ab = new short[var10];
      var4.am = var21 * -725588083;
      var5.am = var32 * -725588083;
      var6.am = var33 * -725588083;
      var7.am = var45 * -725588083;
      var8.am = var27 * -725588083;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.cy((short)-28722);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.ck((byte)1);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.ck((byte)1);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.ck((byte)1);
         }

         this.ai[var38] = var35 + var40;
         this.ay[var38] = var36 + var41;
         this.as[var38] = var37 + var42;
         var35 = this.ai[var38];
         var36 = this.ay[var38];
         var37 = this.as[var38];
         if (var16 == 1) {
            this.al[var38] = var8.cy((short)-14158);
         }
      }

      var4.am = var30 * -725588083;
      var5.am = var26 * -725588083;
      var6.am = var24 * -725588083;
      var7.am = var28 * -725588083;
      var8.am = var25 * -725588083;

      for(var38 = 0; var38 < var10; ++var38) {
         this.ab[var38] = (short)var4.ce(1289793597);
         if (var12 == 1) {
            var39 = var5.cy((short)-18876);
            if ((var39 & 1) == 1) {
               this.an[var38] = 1;
               var2 = true;
            } else {
               this.an[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ar[var38] = (byte)(var39 >> 2);
               this.az[var38] = this.ab[var38];
               this.ab[var38] = 127;
               if (this.az[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ar[var38] = -1;
               this.az[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.ao[var38] = var6.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var38] = var7.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var38] = var8.cy((short)-22446);
         }
      }

      var4.am = var29 * -725588083;
      var5.am = var23 * -725588083;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.cy((short)-15901);
         if (var43 == 1) {
            var38 = var4.ck((byte)1) + var41;
            var39 = var4.ck((byte)1) + var38;
            var40 = var4.ck((byte)1) + var39;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var44;
            this.au[var42] = var40;
         }
      }

      var4.am = var31 * -725588083;

      for(var42 = 0; var42 < var11; ++var42) {
         this.ac[var42] = 0;
         this.av[var42] = (short)var4.ce(188663694);
         this.ax[var42] = (short)var4.ce(2122815579);
         this.aq[var42] = (short)var4.ce(1134231632);
      }

      if (this.ar != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ar[var43] & 255;
            if (var44 != 255) {
               if ((this.av[var44] & '\uffff') == this.am[var43] && (this.ax[var44] & '\uffff') == this.at[var43] && (this.aq[var44] & '\uffff') == this.au[var43]) {
                  this.ar[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.ar = null;
         }
      }

      if (!var3) {
         this.az = null;
      }

      if (!var2) {
         this.an = null;
      }

   }

   public jj cq() {
      jj var1 = new jj();
      if (this.an != null) {
         var1.an = new byte[this.ae];

         for(int var2 = 0; var2 < this.ae; ++var2) {
            var1.an[var2] = this.an[var2];
         }
      }

      var1.aj = this.aj;
      var1.ae = this.ae;
      var1.ad = this.ad;
      var1.ai = this.ai;
      var1.ay = this.ay;
      var1.as = this.as;
      var1.am = this.am;
      var1.at = this.at;
      var1.au = this.au;
      var1.ao = this.ao;
      var1.af = this.af;
      var1.ar = this.ar;
      var1.ab = this.ab;
      var1.az = this.az;
      var1.ag = this.ag;
      var1.ac = this.ac;
      var1.av = this.av;
      var1.ax = this.ax;
      var1.aq = this.aq;
      var1.al = this.al;
      var1.aa = this.aa;
      var1.ah = this.ah;
      var1.bh = this.bh;
      var1.bk = this.bk;
      var1.bx = this.bx;
      var1.bq = this.bq;
      var1.bp = this.bp;
      return var1;
   }

   public jj cb(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.ah();
      int var7 = var2 + this.by;
      int var8 = var2 + this.br;
      int var9 = var4 + this.bu;
      int var10 = var4 + this.bn;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            jj var11;
            if (var5) {
               var11 = new jj();
               var11.aj = this.aj;
               var11.ae = this.ae;
               var11.ad = this.ad;
               var11.ai = this.ai;
               var11.as = this.as;
               var11.am = this.am;
               var11.at = this.at;
               var11.au = this.au;
               var11.an = this.an;
               var11.ao = this.ao;
               var11.af = this.af;
               var11.ar = this.ar;
               var11.ab = this.ab;
               var11.az = this.az;
               var11.ag = this.ag;
               var11.ac = this.ac;
               var11.av = this.av;
               var11.ax = this.ax;
               var11.aq = this.aq;
               var11.al = this.al;
               var11.aa = this.aa;
               var11.ah = this.ah;
               var11.bh = this.bh;
               var11.bq = this.bq;
               var11.bp = this.bp;
               var11.ay = new int[var11.aj];
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
               for(var12 = 0; var12 < var11.aj; ++var12) {
                  var13 = this.ai[var12] + var2;
                  var14 = this.as[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.ay[var12] = this.ay[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.aj; ++var12) {
                  var13 = (-this.ay[var12] << 16) / (this.ez * -274986519);
                  if (var13 < var6) {
                     var14 = this.ai[var12] + var2;
                     var15 = this.as[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.ay[var12] = this.ay[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.aa();
            return var11;
         }
      } else {
         return this;
      }
   }

   void cy() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.al != null) {
         var1 = new int[-557444085];
         var2 = 0;

         for(var3 = 0; var3 < this.aj; ++var3) {
            var4 = this.al[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.ah = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.ah[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.aj; this.ah[var4][var1[var4]++] = var3++) {
            var4 = this.al[var3];
         }

         this.al = null;
      }

      if (this.aa != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.ae; ++var3) {
            var4 = this.aa[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.bh = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.bh[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.ae; this.bh[var4][var1[var4]++] = var3++) {
            var4 = this.aa[var3];
         }

         this.aa = null;
      }

   }

   public int ci(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aj; ++var4) {
         if (this.ai[var4] == var1 && this.ay[var4] == var2 && this.as[var4] == var3) {
            return var4;
         }
      }

      this.ai[this.aj] = var1;
      this.ay[this.aj] = var2;
      this.as[this.aj] = var3;
      return this.aj++;
   }

   public int cn(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aj; ++var4) {
         if (this.ai[var4] == var1 && this.ay[var4] == var2 && this.as[var4] == var3) {
            return var4;
         }
      }

      this.ai[this.aj] = var1;
      this.ay[this.aj] = var2;
      this.as[this.aj] = var3;
      return this.aj++;
   }

   public int co(int var1, int var2, int var3, byte var4, byte var5, short var6, short var7) {
      this.am[this.ae] = var1;
      this.at[this.ae] = var2;
      this.au[this.ae] = var3;
      this.an[this.ae] = var4;
      this.ar[this.ae] = var5;
      this.ab[this.ae] = var6;
      this.az[this.ae] = var7;
      return this.ae++;
   }

   public int cd(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aj; ++var4) {
         if (this.ai[var4] == var1 && this.ay[var4] == var2 && this.as[var4] == var3) {
            return var4;
         }
      }

      this.ai[this.aj] = var1;
      this.ay[this.aj] = var2;
      this.as[this.aj] = var3;
      return this.aj++;
   }

   void bt(byte[] var1) {
      vl var2 = new vl(var1);
      vl var3 = new vl(var1);
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var2.am = (var1.length - 23) * -725588083;
      int var9 = var2.ce(1372663976);
      int var10 = var2.ce(1566651476);
      int var11 = var2.cy((short)-19828);
      int var12 = var2.cy((short)-21806);
      int var13 = var2.cy((short)-24222);
      int var14 = var2.cy((short)-25015);
      int var15 = var2.cy((short)-14839);
      int var16 = var2.cy((short)-13468);
      int var17 = var2.cy((short)-5712);
      int var18 = var2.ce(1355861258);
      int var19 = var2.ce(436331079);
      int var20 = var2.ce(326769759);
      int var21 = var2.ce(1167337542);
      int var22 = var2.ce(1201546809);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.ac = new byte[var11];
         var2.am = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.ac[var26] = var2.cu((byte)13);
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var17 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
      }

      if (var13 == 255) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      if (var16 == 1) {
         this.az = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ar = new byte[var10];
      }

      this.ab = new short[var10];
      if (var11 > 0) {
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      var2.am = var11 * -725588083;
      var3.am = var38 * -725588083;
      var4.am = var39 * -725588083;
      var5.am = var40 * -725588083;
      var6.am = var32 * -725588083;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.cy((short)-28985);
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.ck((byte)1);
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.ck((byte)1);
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.ck((byte)1);
         }

         this.ai[var51] = var48 + var53;
         this.ay[var51] = var49 + var54;
         this.as[var51] = var50 + var55;
         var48 = this.ai[var51];
         var49 = this.ay[var51];
         var50 = this.as[var51];
         if (var17 == 1) {
            this.al[var51] = var6.cy((short)-19776);
         }
      }

      var2.am = var37 * -725588083;
      var3.am = var28 * -725588083;
      var4.am = var30 * -725588083;
      var5.am = var33 * -725588083;
      var6.am = var31 * -725588083;
      var7.am = var35 * -725588083;
      var8.am = var36 * -725588083;

      for(var51 = 0; var51 < var10; ++var51) {
         this.ab[var51] = (short)var2.ce(1454161392);
         if (var12 == 1) {
            this.an[var51] = var3.cu((byte)13);
         }

         if (var13 == 255) {
            this.ao[var51] = var4.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var51] = var5.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var51] = var6.cy((short)-4694);
         }

         if (var16 == 1) {
            this.az[var51] = (short)(var7.ce(1046533393) - 1);
         }

         if (this.ar != null && this.az[var51] != -1) {
            this.ar[var51] = (byte)(var8.cy((short)-12192) - 1);
         }
      }

      var2.am = var34 * -725588083;
      var3.am = var29 * -725588083;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.cy((short)134);
         if (var56 == 1) {
            var51 = var2.ck((byte)1) + var54;
            var52 = var2.ck((byte)1) + var51;
            var53 = var2.ck((byte)1) + var52;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var57;
            this.au[var55] = var53;
         }
      }

      var2.am = var41 * -725588083;
      var3.am = var42 * -725588083;
      var4.am = var43 * -725588083;
      var5.am = var44 * -725588083;
      var6.am = var45 * -725588083;
      var7.am = var46 * -725588083;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.ac[var55] & 255;
         if (var56 == 0) {
            this.av[var55] = (short)var2.ce(356950272);
            this.ax[var55] = (short)var2.ce(768355730);
            this.aq[var55] = (short)var2.ce(1431740022);
         }
      }

      var2.am = var26 * -725588083;
      var55 = var2.cy((short)-12492);
      if (var55 != 0) {
         new kg();
         var2.ce(769181054);
         var2.ce(1373904705);
         var2.ce(1206833537);
         var2.ch(1203709469);
      }

   }

   public int cp(int var1, int var2, int var3, byte var4, byte var5, short var6, short var7) {
      this.am[this.ae] = var1;
      this.at[this.ae] = var2;
      this.au[this.ae] = var3;
      this.an[this.ae] = var4;
      this.ar[this.ae] = var5;
      this.ab[this.ae] = var6;
      this.az[this.ae] = var7;
      return this.ae++;
   }

   void cv() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.al != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.aj; ++var3) {
            var4 = this.al[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.ah = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.ah[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.aj; this.ah[var4][var1[var4]++] = var3++) {
            var4 = this.al[var3];
         }

         this.al = null;
      }

      if (this.aa != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.ae; ++var3) {
            var4 = this.aa[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.bh = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.bh[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.ae; this.bh[var4][var1[var4]++] = var3++) {
            var4 = this.aa[var3];
         }

         this.aa = null;
      }

   }

   void bs(byte[] var1) {
      vl var2 = new vl(var1);
      vl var3 = new vl(var1);
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var2.am = (var1.length - 23) * -725588083;
      int var9 = var2.ce(2116573083);
      int var10 = var2.ce(7317313);
      int var11 = var2.cy((short)-29858);
      int var12 = var2.cy((short)-12956);
      int var13 = var2.cy((short)-21265);
      int var14 = var2.cy((short)-1462);
      int var15 = var2.cy((short)-6759);
      int var16 = var2.cy((short)-18060);
      int var17 = var2.cy((short)-5459);
      int var18 = var2.ce(210702850);
      int var19 = var2.ce(854492843);
      int var20 = var2.ce(2025438008);
      int var21 = var2.ce(455484625);
      int var22 = var2.ce(1526539487);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.ac = new byte[var11];
         var2.am = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.ac[var26] = var2.cu((byte)13);
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var17 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
      }

      if (var13 == 255) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      if (var16 == 1) {
         this.az = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ar = new byte[var10];
      }

      this.ab = new short[var10];
      if (var11 > 0) {
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      var2.am = var11 * -725588083;
      var3.am = var38 * -725588083;
      var4.am = var39 * -725588083;
      var5.am = var40 * -725588083;
      var6.am = var32 * -725588083;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.cy((short)-30161);
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.ck((byte)1);
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.ck((byte)1);
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.ck((byte)1);
         }

         this.ai[var51] = var48 + var53;
         this.ay[var51] = var49 + var54;
         this.as[var51] = var50 + var55;
         var48 = this.ai[var51];
         var49 = this.ay[var51];
         var50 = this.as[var51];
         if (var17 == 1) {
            this.al[var51] = var6.cy((short)-25724);
         }
      }

      var2.am = var37 * -725588083;
      var3.am = var28 * -725588083;
      var4.am = var30 * -725588083;
      var5.am = var33 * -725588083;
      var6.am = var31 * -725588083;
      var7.am = var35 * -725588083;
      var8.am = var36 * -725588083;

      for(var51 = 0; var51 < var10; ++var51) {
         this.ab[var51] = (short)var2.ce(2144261879);
         if (var12 == 1) {
            this.an[var51] = var3.cu((byte)13);
         }

         if (var13 == 255) {
            this.ao[var51] = var4.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var51] = var5.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var51] = var6.cy((short)-17534);
         }

         if (var16 == 1) {
            this.az[var51] = (short)(var7.ce(1664778729) - 1);
         }

         if (this.ar != null && this.az[var51] != -1) {
            this.ar[var51] = (byte)(var8.cy((short)-19984) - 1);
         }
      }

      var2.am = var34 * -725588083;
      var3.am = var29 * -725588083;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.cy((short)-1846);
         if (var56 == 1) {
            var51 = var2.ck((byte)1) + var54;
            var52 = var2.ck((byte)1) + var51;
            var53 = var2.ck((byte)1) + var52;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var52;
            this.au[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.ck((byte)1) + var54;
            var54 = var53;
            this.am[var55] = var51;
            this.at[var55] = var57;
            this.au[var55] = var53;
         }
      }

      var2.am = var41 * -725588083;
      var3.am = var42 * -725588083;
      var4.am = var43 * -725588083;
      var5.am = var44 * -725588083;
      var6.am = var45 * -725588083;
      var7.am = var46 * -725588083;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.ac[var55] & 255;
         if (var56 == 0) {
            this.av[var55] = (short)var2.ce(759734585);
            this.ax[var55] = (short)var2.ce(1271956999);
            this.aq[var55] = (short)var2.ce(1638448960);
         }
      }

      var2.am = var26 * -725588083;
      var55 = var2.cy((short)-6183);
      if (var55 != 0) {
         new kg();
         var2.ce(1233255149);
         var2.ce(1382627607);
         var2.ce(602201176);
         var2.ch(1203709469);
      }

   }

   void dy() {
      if (!this.bz) {
         this.ez = 0;
         this.bc = 0;
         this.by = 999999;
         this.br = -999999;
         this.bn = -99999;
         this.bu = 99999;

         for(int var1 = 0; var1 < this.aj; ++var1) {
            int var2 = this.ai[var1];
            int var3 = this.ay[var1];
            int var4 = this.as[var1];
            if (var2 < this.by) {
               this.by = var2;
            }

            if (var2 > this.br) {
               this.br = var2;
            }

            if (var4 < this.bu) {
               this.bu = var4;
            }

            if (var4 > this.bn) {
               this.bn = var4;
            }

            if (-var3 > this.ez * -274986519) {
               this.ez = -var3 * 2132106841;
            }

            if (var3 > this.bc) {
               this.bc = var3;
            }
         }

         this.bz = true;
      }
   }

   public void ce() {
      for(int var1 = 0; var1 < this.aj; ++var1) {
         int var2 = this.ai[var1];
         this.ai[var1] = this.as[var1];
         this.as[var1] = -var2;
      }

      this.aa();
   }

   public void cg() {
      for(int var1 = 0; var1 < this.aj; ++var1) {
         int var2 = this.ai[var1];
         this.ai[var1] = this.as[var1];
         this.as[var1] = -var2;
      }

      this.aa();
   }

   void by(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var4.am = (var1.length - 23) * -725588083;
      int var9 = var4.ce(806350261);
      int var10 = var4.ce(1132315355);
      int var11 = var4.cy((short)-7574);
      int var12 = var4.cy((short)-30599);
      int var13 = var4.cy((short)-21868);
      int var14 = var4.cy((short)-17278);
      int var15 = var4.cy((short)-5636);
      int var16 = var4.cy((short)-23482);
      int var17 = var4.cy((short)-21137);
      int var18 = var4.ce(1910606138);
      int var19 = var4.ce(1954134856);
      int var20 = var4.ce(1300152421);
      int var21 = var4.ce(96541475);
      int var22 = var4.ce(360899080);
      byte var23 = 0;
      int var47 = var23 + var9;
      int var25 = var47;
      var47 += var10;
      int var26 = var47;
      if (var13 == 255) {
         var47 += var10;
      }

      int var27 = var47;
      if (var15 == 1) {
         var47 += var10;
      }

      int var28 = var47;
      if (var12 == 1) {
         var47 += var10;
      }

      int var29 = var47;
      var47 += var22;
      int var30 = var47;
      if (var14 == 1) {
         var47 += var10;
      }

      int var31 = var47;
      var47 += var21;
      int var32 = var47;
      var47 += var10 * 2;
      int var33 = var47;
      var47 += var11 * 6;
      int var34 = var47;
      var47 += var18;
      int var35 = var47;
      var47 += var19;
      int var10000 = var47 + var20;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var11 > 0) {
         this.ac = new byte[var11];
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      if (var16 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
         this.ar = new byte[var10];
         this.az = new short[var10];
      }

      if (var13 == 255) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      if (var17 == 1) {
         this.bj = new int[var9][];
         this.bv = new int[var9][];
      }

      this.ab = new short[var10];
      var4.am = var23 * -725588083;
      var5.am = var34 * -725588083;
      var6.am = var35 * -725588083;
      var7.am = var47 * -725588083;
      var8.am = var29 * -725588083;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.cy((short)-17010);
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.ck((byte)1);
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.ck((byte)1);
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.ck((byte)1);
         }

         this.ai[var40] = var37 + var42;
         this.ay[var40] = var38 + var43;
         this.as[var40] = var39 + var44;
         var37 = this.ai[var40];
         var38 = this.ay[var40];
         var39 = this.as[var40];
         if (var16 == 1) {
            this.al[var40] = var8.cy((short)-6661);
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.cy((short)-26804);
            this.bj[var40] = new int[var41];
            this.bv[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.bj[var40][var42] = var8.cy((short)-9720);
               this.bv[var40][var42] = var8.cy((short)12);
            }
         }
      }

      var4.am = var32 * -725588083;
      var5.am = var28 * -725588083;
      var6.am = var26 * -725588083;
      var7.am = var30 * -725588083;
      var8.am = var27 * -725588083;

      for(var40 = 0; var40 < var10; ++var40) {
         this.ab[var40] = (short)var4.ce(1039523296);
         if (var12 == 1) {
            var41 = var5.cy((short)-2436);
            if ((var41 & 1) == 1) {
               this.an[var40] = 1;
               var2 = true;
            } else {
               this.an[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.ar[var40] = (byte)(var41 >> 2);
               this.az[var40] = this.ab[var40];
               this.ab[var40] = 127;
               if (this.az[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.ar[var40] = -1;
               this.az[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.ao[var40] = var6.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var40] = var7.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var40] = var8.cy((short)-3604);
         }
      }

      var4.am = var31 * -725588083;
      var5.am = var25 * -725588083;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.cy((short)-23412);
         if (var45 == 1) {
            var40 = var4.ck((byte)1) + var43;
            var41 = var4.ck((byte)1) + var40;
            var42 = var4.ck((byte)1) + var41;
            var43 = var42;
            this.am[var44] = var40;
            this.at[var44] = var41;
            this.au[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.ck((byte)1) + var43;
            var43 = var42;
            this.am[var44] = var40;
            this.at[var44] = var41;
            this.au[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.ck((byte)1) + var43;
            var43 = var42;
            this.am[var44] = var40;
            this.at[var44] = var41;
            this.au[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.ck((byte)1) + var43;
            var43 = var42;
            this.am[var44] = var40;
            this.at[var44] = var46;
            this.au[var44] = var42;
         }
      }

      var4.am = var33 * -725588083;

      for(var44 = 0; var44 < var11; ++var44) {
         this.ac[var44] = 0;
         this.av[var44] = (short)var4.ce(800195046);
         this.ax[var44] = (short)var4.ce(464934364);
         this.aq[var44] = (short)var4.ce(1757157345);
      }

      if (this.ar != null) {
         boolean var48 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.ar[var45] & 255;
            if (var46 != 255) {
               if ((this.av[var46] & '\uffff') == this.am[var45] && (this.ax[var46] & '\uffff') == this.at[var45] && (this.aq[var46] & '\uffff') == this.au[var45]) {
                  this.ar[var45] = -1;
               } else {
                  var48 = true;
               }
            }
         }

         if (!var48) {
            this.ar = null;
         }
      }

      if (!var3) {
         this.az = null;
      }

      if (!var2) {
         this.an = null;
      }

   }

   public void cz() {
      for(int var1 = 0; var1 < this.aj; ++var1) {
         int var2 = this.as[var1];
         this.as[var1] = this.ai[var1];
         this.ai[var1] = -var2;
      }

      this.aa();
   }

   void aa() {
      this.bk = null;
      this.bb = null;
      this.bx = null;
      this.bz = false;
   }

   public void ct() {
      for(int var1 = 0; var1 < this.aj; ++var1) {
         int var2 = this.as[var1];
         this.as[var1] = this.ai[var1];
         this.ai[var1] = -var2;
      }

      this.aa();
   }

   public void cc() {
      for(int var1 = 0; var1 < this.aj; ++var1) {
         int var2 = this.as[var1];
         this.as[var1] = this.ai[var1];
         this.ai[var1] = -var2;
      }

      this.aa();
   }

   public void cj(int var1) {
      int var2 = bo[var1];
      int var3 = bd[var1];

      for(int var4 = 0; var4 < this.aj; ++var4) {
         int var5 = this.as[var4] * var2 + this.ai[var4] * var3 >> 16;
         this.as[var4] = this.as[var4] * var3 - this.ai[var4] * var2 >> 16;
         this.ai[var4] = var5;
      }

      this.aa();
   }

   public void cm(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aj; ++var4) {
         int[] var10000 = this.ai;
         var10000[var4] += var1;
         var10000 = this.ay;
         var10000[var4] += var2;
         var10000 = this.as;
         var10000[var4] += var3;
      }

      this.aa();
   }

   public void cw(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aj; ++var4) {
         int[] var10000 = this.ai;
         var10000[var4] += var1;
         var10000 = this.ay;
         var10000[var4] += var2;
         var10000 = this.as;
         var10000[var4] += var3;
      }

      this.aa();
   }

   public static jj bq(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 1974119238);
      return var3 == null ? null : new jj(var3);
   }

   public void cs(short var1, short var2) {
      for(int var3 = 0; var3 < this.ae; ++var3) {
         if (this.ab[var3] == var1) {
            this.ab[var3] = var2;
         }
      }

   }

   public void cr(short var1, short var2) {
      for(int var3 = 0; var3 < this.ae; ++var3) {
         if (this.ab[var3] == var1) {
            this.ab[var3] = var2;
         }
      }

   }

   public void ck(short var1, short var2) {
      for(int var3 = 0; var3 < this.ae; ++var3) {
         if (this.ab[var3] == var1) {
            this.ab[var3] = var2;
         }
      }

   }

   public void dq(short var1, short var2) {
      for(int var3 = 0; var3 < this.ae; ++var3) {
         if (this.ab[var3] == var1) {
            this.ab[var3] = var2;
         }
      }

   }

   public void dd(short var1, short var2) {
      if (this.az != null) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            if (this.az[var3] == var1) {
               this.az[var3] = var2;
            }
         }

      }
   }

   public void ab() {
      for(int var1 = 0; var1 < this.aj; ++var1) {
         this.ai[var1] = -this.ai[var1];
         this.as[var1] = -this.as[var1];
      }

      this.aa();
   }

   public void da(short var1, short var2) {
      if (this.az != null) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            if (this.az[var3] == var1) {
               this.az[var3] = var2;
            }
         }

      }
   }

   public void dr(short var1, short var2) {
      if (this.az != null) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            if (this.az[var3] == var1) {
               this.az[var3] = var2;
            }
         }

      }
   }

   public void dh(short var1, short var2) {
      if (this.az != null) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            if (this.az[var3] == var1) {
               this.az[var3] = var2;
            }
         }

      }
   }

   public void dg() {
      int var1;
      for(var1 = 0; var1 < this.aj; ++var1) {
         this.as[var1] = -this.as[var1];
      }

      for(var1 = 0; var1 < this.ae; ++var1) {
         int var2 = this.am[var1];
         this.am[var1] = this.au[var1];
         this.au[var1] = var2;
      }

      this.aa();
   }

   public void df() {
      int var1;
      for(var1 = 0; var1 < this.aj; ++var1) {
         this.as[var1] = -this.as[var1];
      }

      for(var1 = 0; var1 < this.ae; ++var1) {
         int var2 = this.am[var1];
         this.am[var1] = this.au[var1];
         this.au[var1] = var2;
      }

      this.aa();
   }

   public void du() {
      int var1;
      for(var1 = 0; var1 < this.aj; ++var1) {
         this.as[var1] = -this.as[var1];
      }

      for(var1 = 0; var1 < this.ae; ++var1) {
         int var2 = this.am[var1];
         this.am[var1] = this.au[var1];
         this.au[var1] = var2;
      }

      this.aa();
   }

   public final jy bj(int var1, int var2, int var3, int var4, int var5) {
      this.al();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      jy var8 = new jy();
      var8.ab = new int[this.ae];
      var8.az = new int[this.ae];
      var8.ag = new int[this.ae];
      if (this.ad > 0 && this.ar != null) {
         int[] var9 = new int[this.ad];

         int var10;
         for(var10 = 0; var10 < this.ae; ++var10) {
            if (this.ar[var10] != -1) {
               ++var9[this.ar[var10] & 255];
            }
         }

         var8.al = 0;

         for(var10 = 0; var10 < this.ad; ++var10) {
            if (var9[var10] > 0 && this.ac[var10] == 0) {
               ++var8.al;
            }
         }

         var8.aa = new int[var8.al];
         var8.ah = new int[var8.al];
         var8.bh = new int[var8.al];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.ad; ++var11) {
            if (var9[var11] > 0 && this.ac[var11] == 0) {
               var8.aa[var10] = this.av[var11] & '\uffff';
               var8.ah[var10] = this.ax[var11] & '\uffff';
               var8.bh[var10] = this.aq[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.av = new byte[this.ae];

         for(var11 = 0; var11 < this.ae; ++var11) {
            if (this.ar[var11] != -1) {
               var8.av[var11] = (byte)var9[this.ar[var11] & 255];
            } else {
               var8.av[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.ae; ++var16) {
         byte var17;
         if (this.an == null) {
            var17 = 0;
         } else {
            var17 = this.an[var16];
         }

         byte var18;
         if (this.af == null) {
            var18 = 0;
         } else {
            var18 = this.af[var16];
         }

         short var12;
         if (this.az == null) {
            var12 = -1;
         } else {
            var12 = this.az[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         je var13;
         int var14;
         jf var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.bx[var16];
                  var14 = var1 + (var3 * var19.ap * -1273186789 + var4 * var19.aw * -1226372845 + var5 * var19.ak * 618262055) / (var7 + var7 / 2);
                  var8.ab[var16] = bv(this.ab[var16] & '\uffff', var14);
                  var8.ag[var16] = -1;
               } else if (var17 == 3) {
                  var8.ab[var16] = 128;
                  var8.ag[var16] = -1;
               } else {
                  var8.ag[var16] = -2;
               }
            } else {
               int var15 = this.ab[var16] & '\uffff';
               if (this.bb != null && this.bb[this.am[var16]] != null) {
                  var13 = this.bb[this.am[var16]];
               } else {
                  var13 = this.bk[this.am[var16]];
               }

               var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 991975417 + var5 * var13.ak * -703612283) / (var7 * var13.aj * 52686273);
               var8.ab[var16] = bv(var15, var14);
               if (this.bb != null && this.bb[this.at[var16]] != null) {
                  var13 = this.bb[this.at[var16]];
               } else {
                  var13 = this.bk[this.at[var16]];
               }

               var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 991975417 + var5 * var13.ak * -703612283) / (var7 * var13.aj * 52686273);
               var8.az[var16] = bv(var15, var14);
               if (this.bb != null && this.bb[this.au[var16]] != null) {
                  var13 = this.bb[this.au[var16]];
               } else {
                  var13 = this.bk[this.au[var16]];
               }

               var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 991975417 + var5 * var13.ak * -703612283) / (var7 * var13.aj * 52686273);
               var8.ag[var16] = bv(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.bx[var16];
               var14 = var1 + (var3 * var19.ap * -1273186789 + var4 * var19.aw * -1226372845 + var5 * var19.ak * 618262055) / (var7 + var7 / 2);
               var8.ab[var16] = bx(var14);
               var8.ag[var16] = -1;
            } else {
               var8.ag[var16] = -2;
            }
         } else {
            if (this.bb != null && this.bb[this.am[var16]] != null) {
               var13 = this.bb[this.am[var16]];
            } else {
               var13 = this.bk[this.am[var16]];
            }

            var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 991975417 + var5 * var13.ak * -703612283) / (var7 * var13.aj * 52686273);
            var8.ab[var16] = bx(var14);
            if (this.bb != null && this.bb[this.at[var16]] != null) {
               var13 = this.bb[this.at[var16]];
            } else {
               var13 = this.bk[this.at[var16]];
            }

            var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 991975417 + var5 * var13.ak * -703612283) / (var7 * var13.aj * 52686273);
            var8.az[var16] = bx(var14);
            if (this.bb != null && this.bb[this.au[var16]] != null) {
               var13 = this.bb[this.au[var16]];
            } else {
               var13 = this.bk[this.au[var16]];
            }

            var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 991975417 + var5 * var13.ak * -703612283) / (var7 * var13.aj * 52686273);
            var8.ag[var16] = bx(var14);
         }
      }

      this.af();
      var8.ae = this.aj;
      var8.am = this.ai;
      var8.at = this.ay;
      var8.au = this.as;
      var8.an = this.ae;
      var8.ao = this.am;
      var8.af = this.at;
      var8.ar = this.au;
      var8.ad = this.ao;
      var8.ac = this.af;
      var8.aq = this.ag;
      var8.bj = this.ah;
      var8.bv = this.bh;
      var8.ax = this.az;
      var8.bx = this.bj;
      var8.bk = this.bv;
      return var8;
   }

   public void dl(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aj; ++var4) {
         this.ai[var4] = this.ai[var4] * var1 / 128;
         this.ay[var4] = this.ay[var4] * var2 / 128;
         this.as[var4] = this.as[var4] * var3 / 128;
      }

      this.aa();
   }

   public void cx() {
      for(int var1 = 0; var1 < this.aj; ++var1) {
         int var2 = this.as[var1];
         this.as[var1] = this.ai[var1];
         this.ai[var1] = -var2;
      }

      this.aa();
   }

   public void dt() {
      if (this.bk == null) {
         this.bk = new je[this.aj];

         int var1;
         for(var1 = 0; var1 < this.aj; ++var1) {
            this.bk[var1] = new je();
         }

         for(var1 = 0; var1 < this.ae; ++var1) {
            int var2 = this.am[var1];
            int var3 = this.at[var1];
            int var4 = this.au[var1];
            int var5 = this.ai[var3] - this.ai[var2];
            int var6 = this.ay[var3] - this.ay[var2];
            int var7 = this.as[var3] - this.as[var2];
            int var8 = this.ai[var4] - this.ai[var2];
            int var9 = this.ay[var4] - this.ay[var2];
            int var10 = this.as[var4] - this.as[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.an == null) {
               var15 = 0;
            } else {
               var15 = this.an[var1];
            }

            if (var15 == 0) {
               je var16 = this.bk[var2];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 1561144909;
               var16.aj += 999105089;
               var16 = this.bk[var3];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 1561144909;
               var16.aj += 999105089;
               var16 = this.bk[var4];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 1561144909;
               var16.aj += 999105089;
            } else if (var15 == 1) {
               if (this.bx == null) {
                  this.bx = new jf[this.ae];
               }

               jf var17 = this.bx[var1] = new jf();
               var17.ap = var11 * -390908909;
               var17.aw = var12 * 2044340507;
               var17.ak = var13 * -2136825449;
            }
         }

      }
   }

   public void dx() {
      if (this.bk == null) {
         this.bk = new je[this.aj];

         int var1;
         for(var1 = 0; var1 < this.aj; ++var1) {
            this.bk[var1] = new je();
         }

         for(var1 = 0; var1 < this.ae; ++var1) {
            int var2 = this.am[var1];
            int var3 = this.at[var1];
            int var4 = this.au[var1];
            int var5 = this.ai[var3] - this.ai[var2];
            int var6 = this.ay[var3] - this.ay[var2];
            int var7 = this.as[var3] - this.as[var2];
            int var8 = this.ai[var4] - this.ai[var2];
            int var9 = this.ay[var4] - this.ay[var2];
            int var10 = this.as[var4] - this.as[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > -448395384 || var13 > 85777323 || var11 < -1259043512 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 1560420799 / var14;
            var12 = var12 * -1048062909 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.an == null) {
               var15 = 0;
            } else {
               var15 = this.an[var1];
            }

            if (var15 == 0) {
               je var16 = this.bk[var2];
               var16.ap += var11 * 1098850847;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 185164753;
               var16.aj += 999105089;
               var16 = this.bk[var3];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * 490591872;
               var16.ak += var13 * 1561144909;
               var16.aj += 1921859935;
               var16 = this.bk[var4];
               var16.ap += var11 * 270207233;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 1072273506;
               var16.aj += 999105089;
            } else if (var15 == 1) {
               if (this.bx == null) {
                  this.bx = new jf[this.ae];
               }

               jf var17 = this.bx[var1] = new jf();
               var17.ap = var11 * 2109228177;
               var17.aw = var12 * 2044340507;
               var17.ak = var13 * 398338103;
            }
         }

      }
   }

   public void ds() {
      if (this.bk == null) {
         this.bk = new je[this.aj];

         int var1;
         for(var1 = 0; var1 < this.aj; ++var1) {
            this.bk[var1] = new je();
         }

         for(var1 = 0; var1 < this.ae; ++var1) {
            int var2 = this.am[var1];
            int var3 = this.at[var1];
            int var4 = this.au[var1];
            int var5 = this.ai[var3] - this.ai[var2];
            int var6 = this.ay[var3] - this.ay[var2];
            int var7 = this.as[var3] - this.as[var2];
            int var8 = this.ai[var4] - this.ai[var2];
            int var9 = this.ay[var4] - this.ay[var2];
            int var10 = this.as[var4] - this.as[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 2072246235 || var12 > 8192 || var13 > -1937036076 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 1180410035 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.an == null) {
               var15 = 0;
            } else {
               var15 = this.an[var1];
            }

            if (var15 == 0) {
               je var16 = this.bk[var2];
               var16.ap += var11 * -965248610;
               var16.aw += var12 * 1558326847;
               var16.ak += var13 * 1807149904;
               var16.aj += -86978840;
               var16 = this.bk[var3];
               var16.ap += var11 * 1201115909;
               var16.aw += var12 * -2036717182;
               var16.ak += var13 * -263480952;
               var16.aj += 1857533243;
               var16 = this.bk[var4];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * -1766160247;
               var16.ak += var13 * 1561144909;
               var16.aj += 1906997825;
            } else if (var15 == 1) {
               if (this.bx == null) {
                  this.bx = new jf[this.ae];
               }

               jf var17 = this.bx[var1] = new jf();
               var17.ap = var11 * -390908909;
               var17.aw = var12 * 1429559170;
               var17.ak = var13 * -2136825449;
            }
         }

      }
   }

   public void db() {
      if (this.bk == null) {
         this.bk = new je[this.aj];

         int var1;
         for(var1 = 0; var1 < this.aj; ++var1) {
            this.bk[var1] = new je();
         }

         for(var1 = 0; var1 < this.ae; ++var1) {
            int var2 = this.am[var1];
            int var3 = this.at[var1];
            int var4 = this.au[var1];
            int var5 = this.ai[var3] - this.ai[var2];
            int var6 = this.ay[var3] - this.ay[var2];
            int var7 = this.as[var3] - this.as[var2];
            int var8 = this.ai[var4] - this.ai[var2];
            int var9 = this.ay[var4] - this.ay[var2];
            int var10 = this.as[var4] - this.as[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.an == null) {
               var15 = 0;
            } else {
               var15 = this.an[var1];
            }

            if (var15 == 0) {
               je var16 = this.bk[var2];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 1561144909;
               var16.aj += 999105089;
               var16 = this.bk[var3];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 1561144909;
               var16.aj += 999105089;
               var16 = this.bk[var4];
               var16.ap += var11 * 531665999;
               var16.aw += var12 * -1849902519;
               var16.ak += var13 * 1561144909;
               var16.aj += 999105089;
            } else if (var15 == 1) {
               if (this.bx == null) {
                  this.bx = new jf[this.ae];
               }

               jf var17 = this.bx[var1] = new jf();
               var17.ap = var11 * -390908909;
               var17.aw = var12 * 2044340507;
               var17.ak = var13 * -2136825449;
            }
         }

      }
   }

   void dv() {
      this.bk = null;
      this.bb = null;
      this.bx = null;
      this.bz = false;
   }

   void dj() {
      if (!this.bz) {
         this.ez = 0;
         this.bc = 0;
         this.by = 999999;
         this.br = -999999;
         this.bn = -99999;
         this.bu = 99999;

         for(int var1 = 0; var1 < this.aj; ++var1) {
            int var2 = this.ai[var1];
            int var3 = this.ay[var1];
            int var4 = this.as[var1];
            if (var2 < this.by) {
               this.by = var2;
            }

            if (var2 > this.br) {
               this.br = var2;
            }

            if (var4 < this.bu) {
               this.bu = var4;
            }

            if (var4 > this.bn) {
               this.bn = var4;
            }

            if (-var3 > this.ez * -274986519) {
               this.ez = -var3 * 2132106841;
            }

            if (var3 > this.bc) {
               this.bc = var3;
            }
         }

         this.bz = true;
      }
   }

   void dp() {
      if (!this.bz) {
         this.ez = 0;
         this.bc = 0;
         this.by = 999999;
         this.br = -999999;
         this.bn = -99999;
         this.bu = 1283642005;

         for(int var1 = 0; var1 < this.aj; ++var1) {
            int var2 = this.ai[var1];
            int var3 = this.ay[var1];
            int var4 = this.as[var1];
            if (var2 < this.by) {
               this.by = var2;
            }

            if (var2 > this.br) {
               this.br = var2;
            }

            if (var4 < this.bu) {
               this.bu = var4;
            }

            if (var4 > this.bn) {
               this.bn = var4;
            }

            if (-var3 > this.ez * -1304621249) {
               this.ez = -var3 * 2081020213;
            }

            if (var3 > this.bc) {
               this.bc = var3;
            }
         }

         this.bz = true;
      }
   }

   void bz(byte[] var1) {
      vl var2 = new vl(var1);
      vl var3 = new vl(var1);
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var2.am = (var1.length - 26) * -725588083;
      int var9 = var2.ce(1298887816);
      int var10 = var2.ce(837096274);
      int var11 = var2.cy((short)-19620);
      int var12 = var2.cy((short)-2480);
      int var13 = var2.cy((short)-8354);
      int var14 = var2.cy((short)-22159);
      int var15 = var2.cy((short)-14653);
      int var16 = var2.cy((short)-29710);
      int var17 = var2.cy((short)-20218);
      int var18 = var2.cy((short)-21861);
      int var19 = var2.ce(247658117);
      int var20 = var2.ce(1307622552);
      int var21 = var2.ce(1812600264);
      int var22 = var2.ce(1521095566);
      int var23 = var2.ce(1425894912);
      int var24 = var2.ce(15503348);
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.ac = new byte[var11];
         var2.am = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.ac[var28] = var2.cu((byte)13);
            if (var29 == 0) {
               ++var25;
            }

            if (var29 >= 1 && var29 <= 3) {
               ++var26;
            }

            if (var29 == 2) {
               ++var27;
            }
         }
      }

      var28 = var11 + var9;
      int var30 = var28;
      if (var12 == 1) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if (var13 == 255) {
         var28 += var10;
      }

      int var33 = var28;
      if (var15 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      var28 += var24;
      int var35 = var28;
      if (var14 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var22;
      int var37 = var28;
      if (var16 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var23;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var19;
      int var41 = var28;
      var28 += var20;
      int var42 = var28;
      var28 += var21;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26 * 2;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 * 2 + var27 * 2;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var17 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
      }

      if (var13 == 255) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      if (var16 == 1) {
         this.az = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ar = new byte[var10];
      }

      if (var18 == 1) {
         this.bj = new int[var9][];
         this.bv = new int[var9][];
      }

      this.ab = new short[var10];
      if (var11 > 0) {
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      var2.am = var11 * -725588083;
      var3.am = var40 * -725588083;
      var4.am = var41 * -725588083;
      var5.am = var42 * -725588083;
      var6.am = var34 * -725588083;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.cy((short)-17804);
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.ck((byte)1);
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.ck((byte)1);
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.ck((byte)1);
         }

         this.ai[var53] = var50 + var55;
         this.ay[var53] = var51 + var56;
         this.as[var53] = var52 + var57;
         var50 = this.ai[var53];
         var51 = this.ay[var53];
         var52 = this.as[var53];
         if (var17 == 1) {
            this.al[var53] = var6.cy((short)-20644);
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.cy((short)-8362);
            this.bj[var53] = new int[var54];
            this.bv[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.bj[var53][var55] = var6.cy((short)-8814);
               this.bv[var53][var55] = var6.cy((short)-24156);
            }
         }
      }

      var2.am = var39 * -725588083;
      var3.am = var30 * -725588083;
      var4.am = var32 * -725588083;
      var5.am = var35 * -725588083;
      var6.am = var33 * -725588083;
      var7.am = var37 * -725588083;
      var8.am = var38 * -725588083;

      for(var53 = 0; var53 < var10; ++var53) {
         this.ab[var53] = (short)var2.ce(818194444);
         if (var12 == 1) {
            this.an[var53] = var3.cu((byte)13);
         }

         if (var13 == 255) {
            this.ao[var53] = var4.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var53] = var5.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var53] = var6.cy((short)-11014);
         }

         if (var16 == 1) {
            this.az[var53] = (short)(var7.ce(827294760) - 1);
         }

         if (this.ar != null && this.az[var53] != -1) {
            this.ar[var53] = (byte)(var8.cy((short)-3293) - 1);
         }
      }

      var2.am = var36 * -725588083;
      var3.am = var31 * -725588083;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.cy((short)-8695);
         if (var58 == 1) {
            var53 = var2.ck((byte)1) + var56;
            var54 = var2.ck((byte)1) + var53;
            var55 = var2.ck((byte)1) + var54;
            var56 = var55;
            this.am[var57] = var53;
            this.at[var57] = var54;
            this.au[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.ck((byte)1) + var56;
            var56 = var55;
            this.am[var57] = var53;
            this.at[var57] = var54;
            this.au[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.ck((byte)1) + var56;
            var56 = var55;
            this.am[var57] = var53;
            this.at[var57] = var54;
            this.au[var57] = var55;
         }

         if (var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.ck((byte)1) + var56;
            var56 = var55;
            this.am[var57] = var53;
            this.at[var57] = var59;
            this.au[var57] = var55;
         }
      }

      var2.am = var43 * -725588083;
      var3.am = var44 * -725588083;
      var4.am = var45 * -725588083;
      var5.am = var46 * -725588083;
      var6.am = var47 * -725588083;
      var7.am = var48 * -725588083;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.ac[var57] & 255;
         if (var58 == 0) {
            this.av[var57] = (short)var2.ce(1507947056);
            this.ax[var57] = (short)var2.ce(1357343197);
            this.aq[var57] = (short)var2.ce(1778463784);
         }
      }

      var2.am = var28 * -725588083;
      var57 = var2.cy((short)-31495);
      if (var57 != 0) {
         new kg();
         var2.ce(1845676729);
         var2.ce(718788181);
         var2.ce(909205922);
         var2.ch(1203709469);
      }

   }

   static void do(jj var0, jj var1, int var2, int var3, int var4, boolean var5) {
      var0.ah();
      var0.al();
      var1.ah();
      var1.al();
      ++bm;
      int var6 = 0;
      int[] var7 = var1.ai;
      int var8 = var1.aj;

      int var9;
      for(var9 = 0; var9 < var0.aj; ++var9) {
         je var10 = var0.bk[var9];
         if (var10.aj * 52686273 != 0) {
            int var11 = var0.ay[var9] - var3;
            if (var11 <= var1.bc) {
               int var12 = var0.ai[var9] - var2;
               if (var12 >= var1.by && var12 <= var1.br) {
                  int var13 = var0.as[var9] - var4;
                  if (var13 >= var1.bu && var13 <= var1.bn) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        je var15 = var1.bk[var14];
                        if (var12 == var7[var14] && var13 == var1.as[var14] && var11 == var1.ay[var14] && var15.aj * 52686273 != 0) {
                           if (var0.bb == null) {
                              var0.bb = new je[var0.aj];
                           }

                           if (var1.bb == null) {
                              var1.bb = new je[var8];
                           }

                           je var16 = var0.bb[var9];
                           if (var16 == null) {
                              var16 = var0.bb[var9] = new je(var10);
                           }

                           je var17 = var1.bb[var14];
                           if (var17 == null) {
                              var17 = var1.bb[var14] = new je(var15);
                           }

                           var16.ap += var15.ap * 1;
                           var16.aw += var15.aw * 1;
                           var16.ak += var15.ak * 1;
                           var16.aj += var15.aj * 1;
                           var17.ap += var10.ap * 1;
                           var17.aw += var10.aw * 1;
                           var17.ak += var10.ak * 1;
                           var17.aj += var10.aj * 1;
                           ++var6;
                           bt[var9] = bm;
                           bs[var14] = bm;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.ae; ++var9) {
            if (bt[var0.am[var9]] == bm && bt[var0.at[var9]] == bm && bt[var0.au[var9]] == bm) {
               if (var0.an == null) {
                  var0.an = new byte[var0.ae];
               }

               var0.an[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.ae; ++var9) {
            if (bs[var1.am[var9]] == bm && bs[var1.at[var9]] == bm && bs[var1.au[var9]] == bm) {
               if (var1.an == null) {
                  var1.an = new byte[var1.ae];
               }

               var1.an[var9] = 2;
            }
         }

      }
   }

   static void dw(jj var0, jj var1, int var2, int var3, int var4, boolean var5) {
      var0.ah();
      var0.al();
      var1.ah();
      var1.al();
      ++bm;
      int var6 = 0;
      int[] var7 = var1.ai;
      int var8 = var1.aj;

      int var9;
      for(var9 = 0; var9 < var0.aj; ++var9) {
         je var10 = var0.bk[var9];
         if (var10.aj * 52686273 != 0) {
            int var11 = var0.ay[var9] - var3;
            if (var11 <= var1.bc) {
               int var12 = var0.ai[var9] - var2;
               if (var12 >= var1.by && var12 <= var1.br) {
                  int var13 = var0.as[var9] - var4;
                  if (var13 >= var1.bu && var13 <= var1.bn) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        je var15 = var1.bk[var14];
                        if (var12 == var7[var14] && var13 == var1.as[var14] && var11 == var1.ay[var14] && var15.aj * 255535746 != 0) {
                           if (var0.bb == null) {
                              var0.bb = new je[var0.aj];
                           }

                           if (var1.bb == null) {
                              var1.bb = new je[var8];
                           }

                           je var16 = var0.bb[var9];
                           if (var16 == null) {
                              var16 = var0.bb[var9] = new je(var10);
                           }

                           je var17 = var1.bb[var14];
                           if (var17 == null) {
                              var17 = var1.bb[var14] = new je(var15);
                           }

                           var16.ap += var15.ap * 1;
                           var16.aw += var15.aw * 1;
                           var16.ak += var15.ak * 1;
                           var16.aj += var15.aj * 1;
                           var17.ap += var10.ap * 1;
                           var17.aw += var10.aw * 1;
                           var17.ak += var10.ak * 1;
                           var17.aj += var10.aj * 1;
                           ++var6;
                           bt[var9] = bm;
                           bs[var14] = bm;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.ae; ++var9) {
            if (bt[var0.am[var9]] == bm && bt[var0.at[var9]] == bm && bt[var0.au[var9]] == bm) {
               if (var0.an == null) {
                  var0.an = new byte[var0.ae];
               }

               var0.an[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.ae; ++var9) {
            if (bs[var1.am[var9]] == bm && bs[var1.at[var9]] == bm && bs[var1.au[var9]] == bm) {
               if (var1.an == null) {
                  var1.an = new byte[var1.ae];
               }

               var1.an[var9] = 2;
            }
         }

      }
   }

   public final jy de(int var1, int var2, int var3, int var4, int var5) {
      this.al();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      jy var8 = new jy();
      var8.ab = new int[this.ae];
      var8.az = new int[this.ae];
      var8.ag = new int[this.ae];
      if (this.ad > 0 && this.ar != null) {
         int[] var9 = new int[this.ad];

         int var10;
         for(var10 = 0; var10 < this.ae; ++var10) {
            if (this.ar[var10] != -1) {
               ++var9[this.ar[var10] & 924371058];
            }
         }

         var8.al = 0;

         for(var10 = 0; var10 < this.ad; ++var10) {
            if (var9[var10] > 0 && this.ac[var10] == 0) {
               ++var8.al;
            }
         }

         var8.aa = new int[var8.al];
         var8.ah = new int[var8.al];
         var8.bh = new int[var8.al];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.ad; ++var11) {
            if (var9[var11] > 0 && this.ac[var11] == 0) {
               var8.aa[var10] = this.av[var11] & '\uffff';
               var8.ah[var10] = this.ax[var11] & -300676877;
               var8.bh[var10] = this.aq[var11] & -411037851;
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.av = new byte[this.ae];

         for(var11 = 0; var11 < this.ae; ++var11) {
            if (this.ar[var11] != -1) {
               var8.av[var11] = (byte)var9[this.ar[var11] & 255];
            } else {
               var8.av[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.ae; ++var16) {
         byte var17;
         if (this.an == null) {
            var17 = 0;
         } else {
            var17 = this.an[var16];
         }

         byte var18;
         if (this.af == null) {
            var18 = 0;
         } else {
            var18 = this.af[var16];
         }

         short var12;
         if (this.az == null) {
            var12 = -1;
         } else {
            var12 = this.az[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         je var13;
         int var14;
         jf var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.bx[var16];
                  var14 = var1 + (var3 * var19.ap * -1273186789 + var4 * var19.aw * -1226372845 + var5 * var19.ak * 1269496941) / (var7 + var7 / 2);
                  var8.ab[var16] = bv(this.ab[var16] & 1591233845, var14);
                  var8.ag[var16] = -1;
               } else if (var17 == 3) {
                  var8.ab[var16] = -1085162880;
                  var8.ag[var16] = -1;
               } else {
                  var8.ag[var16] = -2;
               }
            } else {
               int var15 = this.ab[var16] & -313808568;
               if (this.bb != null && this.bb[this.am[var16]] != null) {
                  var13 = this.bb[this.am[var16]];
               } else {
                  var13 = this.bk[this.am[var16]];
               }

               var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 110446944 + var5 * var13.ak * -703612283) / (var7 * var13.aj * -1235962695);
               var8.ab[var16] = bv(var15, var14);
               if (this.bb != null && this.bb[this.at[var16]] != null) {
                  var13 = this.bb[this.at[var16]];
               } else {
                  var13 = this.bk[this.at[var16]];
               }

               var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 991975417 + var5 * var13.ak * -1784712996) / (var7 * var13.aj * 812362279);
               var8.az[var16] = bv(var15, var14);
               if (this.bb != null && this.bb[this.au[var16]] != null) {
                  var13 = this.bb[this.au[var16]];
               } else {
                  var13 = this.bk[this.au[var16]];
               }

               var14 = var1 + (var3 * var13.ap * -2004162778 + var4 * var13.aw * 991975417 + var5 * var13.ak * -703612283) / (var7 * var13.aj * -646680817);
               var8.ag[var16] = bv(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.bx[var16];
               var14 = var1 + (var3 * var19.ap * 1801970435 + var4 * var19.aw * 1689293630 + var5 * var19.ak * 618262055) / (var7 + var7 / 2);
               var8.ab[var16] = bx(var14);
               var8.ag[var16] = -1;
            } else {
               var8.ag[var16] = -2;
            }
         } else {
            if (this.bb != null && this.bb[this.am[var16]] != null) {
               var13 = this.bb[this.am[var16]];
            } else {
               var13 = this.bk[this.am[var16]];
            }

            var14 = var1 + (var3 * var13.ap * 765018092 + var4 * var13.aw * 991975417 + var5 * var13.ak * 1430670608) / (var7 * var13.aj * 52686273);
            var8.ab[var16] = bx(var14);
            if (this.bb != null && this.bb[this.at[var16]] != null) {
               var13 = this.bb[this.at[var16]];
            } else {
               var13 = this.bk[this.at[var16]];
            }

            var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 991975417 + var5 * var13.ak * -703612283) / (var7 * var13.aj * 52686273);
            var8.az[var16] = bx(var14);
            if (this.bb != null && this.bb[this.au[var16]] != null) {
               var13 = this.bb[this.au[var16]];
            } else {
               var13 = this.bk[this.au[var16]];
            }

            var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 1381304724 + var5 * var13.ak * -703612283) / (var7 * var13.aj * 1545382209);
            var8.ag[var16] = bx(var14);
         }
      }

      this.af();
      var8.ae = this.aj;
      var8.am = this.ai;
      var8.at = this.ay;
      var8.au = this.as;
      var8.an = this.ae;
      var8.ao = this.am;
      var8.af = this.at;
      var8.ar = this.au;
      var8.ad = this.ao;
      var8.ac = this.af;
      var8.aq = this.ag;
      var8.bj = this.ah;
      var8.bv = this.bh;
      var8.ax = this.az;
      var8.bx = this.bj;
      var8.bk = this.bv;
      return var8;
   }

   public final jy dz(int var1, int var2, int var3, int var4, int var5) {
      this.al();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      jy var8 = new jy();
      var8.ab = new int[this.ae];
      var8.az = new int[this.ae];
      var8.ag = new int[this.ae];
      if (this.ad > 0 && this.ar != null) {
         int[] var9 = new int[this.ad];

         int var10;
         for(var10 = 0; var10 < this.ae; ++var10) {
            if (this.ar[var10] != -1) {
               ++var9[this.ar[var10] & 948021548];
            }
         }

         var8.al = 0;

         for(var10 = 0; var10 < this.ad; ++var10) {
            if (var9[var10] > 0 && this.ac[var10] == 0) {
               ++var8.al;
            }
         }

         var8.aa = new int[var8.al];
         var8.ah = new int[var8.al];
         var8.bh = new int[var8.al];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.ad; ++var11) {
            if (var9[var11] > 0 && this.ac[var11] == 0) {
               var8.aa[var10] = this.av[var11] & '\uffff';
               var8.ah[var10] = this.ax[var11] & -563247035;
               var8.bh[var10] = this.aq[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.av = new byte[this.ae];

         for(var11 = 0; var11 < this.ae; ++var11) {
            if (this.ar[var11] != -1) {
               var8.av[var11] = (byte)var9[this.ar[var11] & 1541596676];
            } else {
               var8.av[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.ae; ++var16) {
         byte var17;
         if (this.an == null) {
            var17 = 0;
         } else {
            var17 = this.an[var16];
         }

         byte var18;
         if (this.af == null) {
            var18 = 0;
         } else {
            var18 = this.af[var16];
         }

         short var12;
         if (this.az == null) {
            var12 = -1;
         } else {
            var12 = this.az[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         je var13;
         int var14;
         jf var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.bx[var16];
                  var14 = var1 + (var3 * var19.ap * -1273186789 + var4 * var19.aw * -1226372845 + var5 * var19.ak * 618262055) / (var7 + var7 / 2);
                  var8.ab[var16] = bv(this.ab[var16] & -603931202, var14);
                  var8.ag[var16] = -1;
               } else if (var17 == 3) {
                  var8.ab[var16] = 128;
                  var8.ag[var16] = -1;
               } else {
                  var8.ag[var16] = 666596620;
               }
            } else {
               int var15 = this.ab[var16] & '\uffff';
               if (this.bb != null && this.bb[this.am[var16]] != null) {
                  var13 = this.bb[this.am[var16]];
               } else {
                  var13 = this.bk[this.am[var16]];
               }

               var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 767340957 + var5 * var13.ak * -703612283) / (var7 * var13.aj * 52686273);
               var8.ab[var16] = bv(var15, var14);
               if (this.bb != null && this.bb[this.at[var16]] != null) {
                  var13 = this.bb[this.at[var16]];
               } else {
                  var13 = this.bk[this.at[var16]];
               }

               var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 991975417 + var5 * var13.ak * 2089437257) / (var7 * var13.aj * 52686273);
               var8.az[var16] = bv(var15, var14);
               if (this.bb != null && this.bb[this.au[var16]] != null) {
                  var13 = this.bb[this.au[var16]];
               } else {
                  var13 = this.bk[this.au[var16]];
               }

               var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 991975417 + var5 * var13.ak * 2054397740) / (var7 * var13.aj * 436048943);
               var8.ag[var16] = bv(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.bx[var16];
               var14 = var1 + (var3 * var19.ap * -1273186789 + var4 * var19.aw * 1196495435 + var5 * var19.ak * 618262055) / (var7 + var7 / 2);
               var8.ab[var16] = bx(var14);
               var8.ag[var16] = -1;
            } else {
               var8.ag[var16] = -2;
            }
         } else {
            if (this.bb != null && this.bb[this.am[var16]] != null) {
               var13 = this.bb[this.am[var16]];
            } else {
               var13 = this.bk[this.am[var16]];
            }

            var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * -1428064881 + var5 * var13.ak * -703612283) / (var7 * var13.aj * 52686273);
            var8.ab[var16] = bx(var14);
            if (this.bb != null && this.bb[this.at[var16]] != null) {
               var13 = this.bb[this.at[var16]];
            } else {
               var13 = this.bk[this.at[var16]];
            }

            var14 = var1 + (var3 * var13.ap * -700579153 + var4 * var13.aw * 2090738283 + var5 * var13.ak * -703612283) / (var7 * var13.aj * 52686273);
            var8.az[var16] = bx(var14);
            if (this.bb != null && this.bb[this.au[var16]] != null) {
               var13 = this.bb[this.au[var16]];
            } else {
               var13 = this.bk[this.au[var16]];
            }

            var14 = var1 + (var3 * var13.ap * -1675986643 + var4 * var13.aw * 991975417 + var5 * var13.ak * -703612283) / (var7 * var13.aj * -1341131549);
            var8.ag[var16] = bx(var14);
         }
      }

      this.af();
      var8.ae = this.aj;
      var8.am = this.ai;
      var8.at = this.ay;
      var8.au = this.as;
      var8.an = this.ae;
      var8.ao = this.am;
      var8.af = this.at;
      var8.ar = this.au;
      var8.ad = this.ao;
      var8.ac = this.af;
      var8.aq = this.ag;
      var8.bj = this.ah;
      var8.bv = this.bh;
      var8.ax = this.az;
      var8.bx = this.bj;
      var8.bk = this.bv;
      return var8;
   }

   public static jj bb(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 1454625904);
      return var3 == null ? null : new jj(var3);
   }

   public void aq(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aj; ++var4) {
         this.ai[var4] = this.ai[var4] * var1 / 128;
         this.ay[var4] = this.ay[var4] * var2 / 128;
         this.as[var4] = this.as[var4] * var3 / 128;
      }

      this.aa();
   }

   void bc(byte[] var1) {
      vl var2 = new vl(var1);
      vl var3 = new vl(var1);
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var2.am = (var1.length - 26) * -725588083;
      int var9 = var2.ce(2110611328);
      int var10 = var2.ce(1082644996);
      int var11 = var2.cy((short)-8237);
      int var12 = var2.cy((short)-15254);
      int var13 = var2.cy((short)-11835);
      int var14 = var2.cy((short)-3235);
      int var15 = var2.cy((short)-4685);
      int var16 = var2.cy((short)-27445);
      int var17 = var2.cy((short)-21819);
      int var18 = var2.cy((short)-15087);
      int var19 = var2.ce(256214706);
      int var20 = var2.ce(935710573);
      int var21 = var2.ce(2132977527);
      int var22 = var2.ce(1277063713);
      int var23 = var2.ce(887355332);
      int var24 = var2.ce(47013762);
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.ac = new byte[var11];
         var2.am = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.ac[var28] = var2.cu((byte)13);
            if (var29 == 0) {
               ++var25;
            }

            if (var29 >= 1 && var29 <= 3) {
               ++var26;
            }

            if (var29 == 2) {
               ++var27;
            }
         }
      }

      var28 = var11 + var9;
      int var30 = var28;
      if (var12 == 1) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if (var13 == -1712310612) {
         var28 += var10;
      }

      int var33 = var28;
      if (var15 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      var28 += var24;
      int var35 = var28;
      if (var14 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var22;
      int var37 = var28;
      if (var16 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var23;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var19;
      int var41 = var28;
      var28 += var20;
      int var42 = var28;
      var28 += var21;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26 * 2;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 * 2 + var27 * 2;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var17 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
      }

      if (var13 == -928883501) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      if (var16 == 1) {
         this.az = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ar = new byte[var10];
      }

      if (var18 == 1) {
         this.bj = new int[var9][];
         this.bv = new int[var9][];
      }

      this.ab = new short[var10];
      if (var11 > 0) {
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      var2.am = var11 * 80660531;
      var3.am = var40 * -206077361;
      var4.am = var41 * -725588083;
      var5.am = var42 * -725588083;
      var6.am = var34 * 858034199;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.cy((short)-23835);
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.ck((byte)1);
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.ck((byte)1);
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.ck((byte)1);
         }

         this.ai[var53] = var50 + var55;
         this.ay[var53] = var51 + var56;
         this.as[var53] = var52 + var57;
         var50 = this.ai[var53];
         var51 = this.ay[var53];
         var52 = this.as[var53];
         if (var17 == 1) {
            this.al[var53] = var6.cy((short)-25439);
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.cy((short)-30616);
            this.bj[var53] = new int[var54];
            this.bv[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.bj[var53][var55] = var6.cy((short)-19759);
               this.bv[var53][var55] = var6.cy((short)-5448);
            }
         }
      }

      var2.am = var39 * -725588083;
      var3.am = var30 * -725588083;
      var4.am = var32 * -725588083;
      var5.am = var35 * -725588083;
      var6.am = var33 * -725588083;
      var7.am = var37 * -725588083;
      var8.am = var38 * 570815374;

      for(var53 = 0; var53 < var10; ++var53) {
         this.ab[var53] = (short)var2.ce(2034578968);
         if (var12 == 1) {
            this.an[var53] = var3.cu((byte)13);
         }

         if (var13 == 1524610447) {
            this.ao[var53] = var4.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var53] = var5.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var53] = var6.cy((short)-17799);
         }

         if (var16 == 1) {
            this.az[var53] = (short)(var7.ce(850410635) - 1);
         }

         if (this.ar != null && this.az[var53] != -1) {
            this.ar[var53] = (byte)(var8.cy((short)-10335) - 1);
         }
      }

      var2.am = var36 * -725588083;
      var3.am = var31 * 1519896186;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.cy((short)-25021);
         if (var58 == 1) {
            var53 = var2.ck((byte)1) + var56;
            var54 = var2.ck((byte)1) + var53;
            var55 = var2.ck((byte)1) + var54;
            var56 = var55;
            this.am[var57] = var53;
            this.at[var57] = var54;
            this.au[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.ck((byte)1) + var56;
            var56 = var55;
            this.am[var57] = var53;
            this.at[var57] = var54;
            this.au[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.ck((byte)1) + var56;
            var56 = var55;
            this.am[var57] = var53;
            this.at[var57] = var54;
            this.au[var57] = var55;
         }

         if (var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.ck((byte)1) + var56;
            var56 = var55;
            this.am[var57] = var53;
            this.at[var57] = var59;
            this.au[var57] = var55;
         }
      }

      var2.am = var43 * -1787785924;
      var3.am = var44 * 1686510517;
      var4.am = var45 * -725588083;
      var5.am = var46 * -725588083;
      var6.am = var47 * -1514547185;
      var7.am = var48 * -725588083;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.ac[var57] & 255;
         if (var58 == 0) {
            this.av[var57] = (short)var2.ce(607048064);
            this.ax[var57] = (short)var2.ce(1673311441);
            this.aq[var57] = (short)var2.ce(647855575);
         }
      }

      var2.am = var28 * -885904922;
      var57 = var2.cy((short)-23945);
      if (var57 != 0) {
         new kg();
         var2.ce(128363266);
         var2.ce(60344956);
         var2.ce(1935306027);
         var2.ch(1203709469);
      }

   }

   static final int ev(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 202993387) {
         var0 = 126;
      }

      return var0;
   }

   void ba(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vl var4 = new vl(var1);
      vl var5 = new vl(var1);
      vl var6 = new vl(var1);
      vl var7 = new vl(var1);
      vl var8 = new vl(var1);
      var4.am = (var1.length - 18) * -676071025;
      int var9 = var4.ce(1327365347);
      int var10 = var4.ce(697452451);
      int var11 = var4.cy((short)-23857);
      int var12 = var4.cy((short)-9207);
      int var13 = var4.cy((short)-18310);
      int var14 = var4.cy((short)-14927);
      int var15 = var4.cy((short)-3520);
      int var16 = var4.cy((short)-6393);
      int var17 = var4.ce(193923010);
      int var18 = var4.ce(1651147339);
      int var19 = var4.ce(973100199);
      int var20 = var4.ce(1311838642);
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.aj = var9;
      this.ae = var10;
      this.ad = var11;
      this.ai = new int[var9];
      this.ay = new int[var9];
      this.as = new int[var9];
      this.am = new int[var10];
      this.at = new int[var10];
      this.au = new int[var10];
      if (var11 > 0) {
         this.ac = new byte[var11];
         this.av = new short[var11];
         this.ax = new short[var11];
         this.aq = new short[var11];
      }

      if (var16 == 1) {
         this.al = new int[var9];
      }

      if (var12 == 1) {
         this.an = new byte[var10];
         this.ar = new byte[var10];
         this.az = new short[var10];
      }

      if (var13 == 255) {
         this.ao = new byte[var10];
      } else {
         this.ag = (byte)var13;
      }

      if (var14 == 1) {
         this.af = new byte[var10];
      }

      if (var15 == 1) {
         this.aa = new int[var10];
      }

      this.ab = new short[var10];
      var4.am = var21 * -725588083;
      var5.am = var32 * 2096235739;
      var6.am = var33 * -725588083;
      var7.am = var45 * 2072028083;
      var8.am = var27 * -1253513736;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.cy((short)-26296);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.ck((byte)1);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.ck((byte)1);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.ck((byte)1);
         }

         this.ai[var38] = var35 + var40;
         this.ay[var38] = var36 + var41;
         this.as[var38] = var37 + var42;
         var35 = this.ai[var38];
         var36 = this.ay[var38];
         var37 = this.as[var38];
         if (var16 == 1) {
            this.al[var38] = var8.cy((short)-24469);
         }
      }

      var4.am = var30 * -725588083;
      var5.am = var26 * -2043813525;
      var6.am = var24 * -725588083;
      var7.am = var28 * -725588083;
      var8.am = var25 * -1226598705;

      for(var38 = 0; var38 < var10; ++var38) {
         this.ab[var38] = (short)var4.ce(581024277);
         if (var12 == 1) {
            var39 = var5.cy((short)-207);
            if ((var39 & 1) == 1) {
               this.an[var38] = 1;
               var2 = true;
            } else {
               this.an[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ar[var38] = (byte)(var39 >> 2);
               this.az[var38] = this.ab[var38];
               this.ab[var38] = 127;
               if (this.az[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ar[var38] = -1;
               this.az[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.ao[var38] = var6.cu((byte)13);
         }

         if (var14 == 1) {
            this.af[var38] = var7.cu((byte)13);
         }

         if (var15 == 1) {
            this.aa[var38] = var8.cy((short)-13918);
         }
      }

      var4.am = var29 * 1423658944;
      var5.am = var23 * -637284050;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.cy((short)-30582);
         if (var43 == 1) {
            var38 = var4.ck((byte)1) + var41;
            var39 = var4.ck((byte)1) + var38;
            var40 = var4.ck((byte)1) + var39;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var39;
            this.au[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.ck((byte)1) + var41;
            var41 = var40;
            this.am[var42] = var38;
            this.at[var42] = var44;
            this.au[var42] = var40;
         }
      }

      var4.am = var31 * -725588083;

      for(var42 = 0; var42 < var11; ++var42) {
         this.ac[var42] = 0;
         this.av[var42] = (short)var4.ce(764907550);
         this.ax[var42] = (short)var4.ce(1340967423);
         this.aq[var42] = (short)var4.ce(1136991844);
      }

      if (this.ar != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ar[var43] & 255;
            if (var44 != 694784758) {
               if ((this.av[var44] & '\uffff') == this.am[var43] && (this.ax[var44] & -1215418835) == this.at[var43] && (this.aq[var44] & 866855580) == this.au[var43]) {
                  this.ar[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.ar = null;
         }
      }

      if (!var3) {
         this.az = null;
      }

      if (!var2) {
         this.an = null;
      }

   }
}
