public class cf extends to {
   float[] aa;
   int ae;
   int ag;
   int am;
   static int[] bh;
   static int[] ab;
   static cy af = new cy();
   byte[][] ac;
   static int au;
   static cn[] ar;
   static bl[] al;
   static bv[] ad;
   static int at;
   static boolean[] ap;
   static float[] bn;
   float[] ay;
   static boolean az = false;
   byte[] bx;
   boolean aq;
   boolean as;
   static be[] ah;
   static float[] aj;
   static float[] av;
   static float[] aw;
   static float[] an;
   static float[] ak;
   int ai;
   int ax;
   static int[] bd;
   int bf;
   int ao;
   int bm;

   cf(byte[] var1) {
      this.ae(var1);
   }

   bg aj(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.bx == null) {
            this.ai = 0;
            this.aa = new float[au];
            this.bx = new byte[this.ag];
            this.bf = 0;
            this.bm = 0;
         }

         for(; this.bm < this.ac.length; ++this.bm) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.am(this.bm);
            if (var2 != null) {
               int var3 = this.bf;
               int var4 = var2.length;
               if (var4 > this.ag - var3) {
                  var4 = this.ag - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.bx[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.bf;
               }

               this.bf = var3;
            }
         }

         this.aa = null;
         byte[] var7 = this.bx;
         this.bx = null;
         return new bg(this.ae, var7, this.am, this.ax, this.aq);
      }
   }

   static void ag(byte[] var0) {
      cy var1 = af;
      var1.ag(var0, 0, (byte)-91);
      at = 1 << var1.ac(4, -1662612285);
      au = 1 << var1.ac(4, 1883994626);

      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      for(var2 = 0; var2 < 2; ++var2) {
         var3 = var2 != 0 ? au : at;
         var4 = var3 >> 1;
         var5 = var3 >> 2;
         var6 = var3 >> 3;
         float[] var7 = new float[var4];

         for(int var8 = 0; var8 < var5; ++var8) {
            var7[2 * var8] = (float)Math.cos((double)(4 * var8) * 3.141592653589793D / (double)var3);
            var7[2 * var8 + 1] = -((float)Math.sin((double)(4 * var8) * 3.141592653589793D / (double)var3));
         }

         float[] var20 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var20[2 * var9] = (float)Math.cos((double)(2 * var9 + 1) * 3.141592653589793D / (double)(2 * var3));
            var20[2 * var9 + 1] = (float)Math.sin((double)(2 * var9 + 1) * 3.141592653589793D / (double)(2 * var3));
         }

         float[] var21 = new float[var5];

         for(int var10 = 0; var10 < var6; ++var10) {
            var21[2 * var10] = (float)Math.cos((double)(4 * var10 + 2) * 3.141592653589793D / (double)var3);
            var21[2 * var10 + 1] = -((float)Math.sin((double)(4 * var10 + 2) * 3.141592653589793D / (double)var3));
         }

         int[] var22 = new int[var6];
         int var11 = client.aq(var6 - 1, (byte)-55);

         for(int var12 = 0; var12 < var6; ++var12) {
            int var16 = var12;
            int var17 = var11;

            int var18;
            for(var18 = 0; var17 > 0; --var17) {
               var18 = var18 << 1 | var16 & 1;
               var16 >>>= 1;
            }

            var22[var12] = var18;
         }

         if (var2 != 0) {
            an = var7;
            ak = var20;
            bn = var21;
            bd = var22;
         } else {
            aj = var7;
            av = var20;
            aw = var21;
            bh = var22;
         }
      }

      var2 = var1.ac(8, 191346563) + 1;
      ar = new cn[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         ar[var3] = new cn();
      }

      var3 = var1.ac(6, -1996699454) + 1;

      for(var4 = 0; var4 < var3; ++var4) {
         var1.ac(16, 412107016);
      }

      var3 = var1.ac(6, 364253725) + 1;
      al = new bl[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         al[var4] = new bl();
      }

      var4 = var1.ac(6, 1393423907) + 1;
      ad = new bv[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         ad[var5] = new bv();
      }

      var5 = var1.ac(6, 373711670) + 1;
      ah = new be[var5];

      for(var6 = 0; var6 < var5; ++var6) {
         ah[var6] = new be();
      }

      var6 = var1.ac(6, 1615243375) + 1;
      ap = new boolean[var6];
      ab = new int[var6];

      for(int var19 = 0; var19 < var6; ++var19) {
         ap[var19] = var1.ae(840284806) != 0;
         var1.ac(16, -830018325);
         var1.ac(16, -1399977361);
         ab[var19] = var1.ac(8, -318052766);
      }

   }

   float[] am(int var1) {
      cy var2 = new cy();
      var2.ag(this.ac[var1], 0, (byte)-34);
      this.ay = new float[au];
      var2.ae(2141673982);
      int var3 = var2.ac(client.aq(ab.length - 1, (byte)-31), 1579367572);
      boolean var4 = ap[var3];
      int var5 = var4 ? au : at;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = var2.ae(-641433813) != 0;
         var7 = var2.ae(886920801) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (at >> 2);
         var10 = (var5 >> 2) + (at >> 2);
         var11 = at >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (at >> 2);
         var13 = var5 - (var5 >> 2) + (at >> 2);
         var14 = at >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      be var15 = ah[ab[var3]];
      int var16 = var15.ae;
      int var17 = var15.ag[var16];
      ci var18 = al[var17].ax(var2);
      boolean var19 = !var18.ae(1679475031);

      int var20;
      for(var20 = 0; var20 < var15.ac; ++var20) {
         bv var21 = ad[var15.am[var20]];
         float[] var22 = this.ay;
         var21.ac(var22, var5 >> 1, var19, var2);
      }

      if (var18.ae(1679475031)) {
         var16 = var15.ae;
         int var10000 = var15.ag[var16];
         var18.ac(this.ay, var5 >> 1, -1689790489);
      }

      int var43;
      int var46;
      if (!var18.ae(1679475031)) {
         for(var20 = var5 >> 1; var20 < var5; ++var20) {
            this.ay[var20] = 0.0F;
         }
      } else {
         var20 = var5 >> 1;
         var43 = var5 >> 2;
         var46 = var5 >> 3;
         float[] var23 = this.ay;

         int var24;
         for(var24 = 0; var24 < var20; ++var24) {
            var23[var24] *= 0.5F;
         }

         for(var24 = var20; var24 < var5; ++var24) {
            var23[var24] = -var23[var5 - var24 - 1];
         }

         float[] var48 = var4 ? an : aj;
         float[] var25 = var4 ? ak : av;
         float[] var26 = var4 ? bn : aw;
         int[] var27 = var4 ? bd : bh;

         int var28;
         float var29;
         float var30;
         float var31;
         float var32;
         for(var28 = 0; var28 < var43; ++var28) {
            var29 = var23[4 * var28] - var23[var5 - 4 * var28 - 1];
            var30 = var23[4 * var28 + 2] - var23[var5 - 4 * var28 - 3];
            var31 = var48[2 * var28];
            var32 = var48[2 * var28 + 1];
            var23[var5 - 4 * var28 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - 4 * var28 - 3] = var29 * var32 + var30 * var31;
         }

         float var33;
         float var34;
         for(var28 = 0; var28 < var46; ++var28) {
            var29 = var23[var20 + 3 + 4 * var28];
            var30 = var23[var20 + 1 + 4 * var28];
            var31 = var23[4 * var28 + 3];
            var32 = var23[4 * var28 + 1];
            var23[var20 + 3 + 4 * var28] = var29 + var31;
            var23[var20 + 1 + 4 * var28] = var30 + var32;
            var33 = var48[var20 - 4 - 4 * var28];
            var34 = var48[var20 - 3 - 4 * var28];
            var23[4 * var28 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
            var23[4 * var28 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
         }

         var28 = client.aq(var5 - 1, (byte)14);

         int var49;
         int var50;
         int var51;
         int var52;
         for(var49 = 0; var49 < var28 - 3; ++var49) {
            var50 = var5 >> var49 + 2;
            var51 = 8 << var49;

            for(var52 = 0; var52 < 2 << var49; ++var52) {
               int var53 = var5 - var50 * 2 * var52;
               int var54 = var5 - var50 * (2 * var52 + 1);

               for(int var35 = 0; var35 < var5 >> var49 + 4; ++var35) {
                  int var36 = 4 * var35;
                  float var37 = var23[var53 - 1 - var36];
                  float var38 = var23[var53 - 3 - var36];
                  float var39 = var23[var54 - 1 - var36];
                  float var40 = var23[var54 - 3 - var36];
                  var23[var53 - 1 - var36] = var37 + var39;
                  var23[var53 - 3 - var36] = var38 + var40;
                  float var41 = var48[var35 * var51];
                  float var42 = var48[var35 * var51 + 1];
                  var23[var54 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
                  var23[var54 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
               }
            }
         }

         for(var49 = 1; var49 < var46 - 1; ++var49) {
            var50 = var27[var49];
            if (var49 < var50) {
               var51 = 8 * var49;
               var52 = 8 * var50;
               var33 = var23[var51 + 1];
               var23[var51 + 1] = var23[var52 + 1];
               var23[var52 + 1] = var33;
               var33 = var23[var51 + 3];
               var23[var51 + 3] = var23[var52 + 3];
               var23[var52 + 3] = var33;
               var33 = var23[var51 + 5];
               var23[var51 + 5] = var23[var52 + 5];
               var23[var52 + 5] = var33;
               var33 = var23[var51 + 7];
               var23[var51 + 7] = var23[var52 + 7];
               var23[var52 + 7] = var33;
            }
         }

         for(var49 = 0; var49 < var20; ++var49) {
            var23[var49] = var23[2 * var49 + 1];
         }

         for(var49 = 0; var49 < var46; ++var49) {
            var23[var5 - 1 - 2 * var49] = var23[4 * var49];
            var23[var5 - 2 - 2 * var49] = var23[4 * var49 + 1];
            var23[var5 - var43 - 1 - 2 * var49] = var23[4 * var49 + 2];
            var23[var5 - var43 - 2 - 2 * var49] = var23[4 * var49 + 3];
         }

         for(var49 = 0; var49 < var46; ++var49) {
            var30 = var26[2 * var49];
            var31 = var26[2 * var49 + 1];
            var32 = var23[var20 + 2 * var49];
            var33 = var23[var20 + 2 * var49 + 1];
            var34 = var23[var5 - 2 - 2 * var49];
            float var55 = var23[var5 - 1 - 2 * var49];
            float var56 = var31 * (var32 - var34) + var30 * (var33 + var55);
            var23[var20 + 2 * var49] = (var32 + var34 + var56) * 0.5F;
            var23[var5 - 2 - 2 * var49] = (var32 + var34 - var56) * 0.5F;
            var56 = var31 * (var33 + var55) - var30 * (var32 - var34);
            var23[var20 + 2 * var49 + 1] = (var33 - var55 + var56) * 0.5F;
            var23[var5 - 1 - 2 * var49] = (-var33 + var55 + var56) * 0.5F;
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var49] = var23[2 * var49 + var20] * var25[2 * var49] + var23[2 * var49 + 1 + var20] * var25[2 * var49 + 1];
            var23[var20 - 1 - var49] = var23[2 * var49 + var20] * var25[2 * var49 + 1] - var23[2 * var49 + 1 + var20] * var25[2 * var49];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var5 - var43 + var49] = -var23[var49];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var49] = var23[var43 + var49];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var43 + var49] = -var23[var43 - var49 - 1];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var20 + var49] = var23[var5 - var49 - 1];
         }

         float[] var57;
         for(var49 = var9; var49 < var10; ++var49) {
            var30 = (float)Math.sin(((double)(var49 - var9) + 0.5D) / (double)var11 * 0.5D * 3.141592653589793D);
            var57 = this.ay;
            var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
         }

         for(var49 = var12; var49 < var13; ++var49) {
            var30 = (float)Math.sin(((double)(var49 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            var57 = this.ay;
            var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
         }
      }

      float[] var44 = null;
      if (this.ai > 0) {
         var43 = this.ai + var5 >> 2;
         var44 = new float[var43];
         int var47;
         if (!this.as) {
            for(var46 = 0; var46 < this.ao; ++var46) {
               var47 = (this.ai >> 1) + var46;
               var44[var46] += this.aa[var47];
            }
         }

         if (var18.ae(1679475031)) {
            for(var46 = var9; var46 < var5 >> 1; ++var46) {
               var47 = var44.length - (var5 >> 1) + var46;
               var44[var47] += this.ay[var46];
            }
         }
      }

      float[] var45 = this.aa;
      this.aa = this.ay;
      this.ay = var45;
      this.ai = var5;
      this.ao = var13 - (var5 >> 1);
      this.as = !var18.ae(1679475031);
      return var44;
   }

   static boolean ax(po var0) {
      if (!az) {
         byte[] var1 = var0.bt(0, 0, (byte)-61);
         if (var1 == null) {
            return false;
         }

         ag(var1);
         az = true;
      }

      return true;
   }

   static cf aq(po var0, int var1, int var2) {
      if (!ax(var0)) {
         var0.bk(var1, var2, (byte)1);
         return null;
      } else {
         byte[] var3 = var0.bt(var1, var2, (byte)20);
         return var3 == null ? null : new cf(var3);
      }
   }

   bg af(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.bx == null) {
            this.ai = 0;
            this.aa = new float[au];
            this.bx = new byte[this.ag];
            this.bf = 0;
            this.bm = 0;
         }

         for(; this.bm < this.ac.length; ++this.bm) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.am(this.bm);
            if (var2 != null) {
               int var3 = this.bf;
               int var4 = var2.length;
               if (var4 > this.ag - var3) {
                  var4 = this.ag - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.bx[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.bf;
               }

               this.bf = var3;
            }
         }

         this.aa = null;
         byte[] var7 = this.bx;
         this.bx = null;
         return new bg(this.ae, var7, this.am, this.ax, this.aq);
      }
   }

   static float ac(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   static float at(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & -910644546;
      int var3 = (var0 & 1082917682) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - -492885805)));
   }

   void au(byte[] var1) {
      vf var2 = new vf(var1);
      this.ae = var2.cz(-1734056172);
      this.ag = var2.cz(-1734056172);
      this.am = var2.cz(-1734056172);
      this.ax = var2.cz(-1734056172);
      if (this.ax < 0) {
         this.ax = ~this.ax;
         this.aq = true;
      }

      int var3 = var2.cz(-1734056172);
      this.ac = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.cv(952452697);
            var5 += var6;
         } while(var6 >= -757650688);

         byte[] var7 = new byte[var5];
         var2.cd(var7, 0, var5, (byte)-114);
         this.ac[var4] = var7;
      }

   }

   void ar(byte[] var1) {
      vf var2 = new vf(var1);
      this.ae = var2.cz(-1734056172);
      this.ag = var2.cz(-1734056172);
      this.am = var2.cz(-1734056172);
      this.ax = var2.cz(-1734056172);
      if (this.ax < 0) {
         this.ax = ~this.ax;
         this.aq = true;
      }

      int var3 = var2.cz(-1734056172);
      this.ac = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.cv(952452697);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.cd(var7, 0, var5, (byte)-50);
         this.ac[var4] = var7;
      }

   }

   float[] al(int var1) {
      cy var2 = new cy();
      var2.ag(this.ac[var1], 0, (byte)-15);
      this.ay = new float[au];
      var2.ae(79114705);
      int var3 = var2.ac(client.aq(ab.length - 1, (byte)-96), 1117849756);
      boolean var4 = ap[var3];
      int var5 = var4 ? au : at;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = var2.ae(455369810) != 0;
         var7 = var2.ae(1869156630) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (at >> 2);
         var10 = (var5 >> 2) + (at >> 2);
         var11 = at >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (at >> 2);
         var13 = var5 - (var5 >> 2) + (at >> 2);
         var14 = at >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      be var15 = ah[ab[var3]];
      int var16 = var15.ae;
      int var17 = var15.ag[var16];
      ci var18 = al[var17].ax(var2);
      boolean var19 = !var18.ae(1679475031);

      int var20;
      for(var20 = 0; var20 < var15.ac; ++var20) {
         bv var21 = ad[var15.am[var20]];
         float[] var22 = this.ay;
         var21.ac(var22, var5 >> 1, var19, var2);
      }

      if (var18.ae(1679475031)) {
         var16 = var15.ae;
         int var10000 = var15.ag[var16];
         var18.ac(this.ay, var5 >> 1, -1689790489);
      }

      int var43;
      int var46;
      if (!var18.ae(1679475031)) {
         for(var20 = var5 >> 1; var20 < var5; ++var20) {
            this.ay[var20] = 0.0F;
         }
      } else {
         var20 = var5 >> 1;
         var43 = var5 >> 2;
         var46 = var5 >> 3;
         float[] var23 = this.ay;

         int var24;
         for(var24 = 0; var24 < var20; ++var24) {
            var23[var24] *= 0.5F;
         }

         for(var24 = var20; var24 < var5; ++var24) {
            var23[var24] = -var23[var5 - var24 - 1];
         }

         float[] var48 = var4 ? an : aj;
         float[] var25 = var4 ? ak : av;
         float[] var26 = var4 ? bn : aw;
         int[] var27 = var4 ? bd : bh;

         int var28;
         float var29;
         float var30;
         float var31;
         float var32;
         for(var28 = 0; var28 < var43; ++var28) {
            var29 = var23[4 * var28] - var23[var5 - 4 * var28 - 1];
            var30 = var23[4 * var28 + 2] - var23[var5 - 4 * var28 - 3];
            var31 = var48[2 * var28];
            var32 = var48[2 * var28 + 1];
            var23[var5 - 4 * var28 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - 4 * var28 - 3] = var29 * var32 + var30 * var31;
         }

         float var33;
         float var34;
         for(var28 = 0; var28 < var46; ++var28) {
            var29 = var23[var20 + 3 + 4 * var28];
            var30 = var23[var20 + 1 + 4 * var28];
            var31 = var23[4 * var28 + 3];
            var32 = var23[4 * var28 + 1];
            var23[var20 + 3 + 4 * var28] = var29 + var31;
            var23[var20 + 1 + 4 * var28] = var30 + var32;
            var33 = var48[var20 - 4 - 4 * var28];
            var34 = var48[var20 - 3 - 4 * var28];
            var23[4 * var28 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
            var23[4 * var28 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
         }

         var28 = client.aq(var5 - 1, (byte)-67);

         int var49;
         int var50;
         int var51;
         int var52;
         for(var49 = 0; var49 < var28 - 3; ++var49) {
            var50 = var5 >> var49 + 2;
            var51 = 8 << var49;

            for(var52 = 0; var52 < 2 << var49; ++var52) {
               int var53 = var5 - var50 * 2 * var52;
               int var54 = var5 - var50 * (2 * var52 + 1);

               for(int var35 = 0; var35 < var5 >> var49 + 4; ++var35) {
                  int var36 = 4 * var35;
                  float var37 = var23[var53 - 1 - var36];
                  float var38 = var23[var53 - 3 - var36];
                  float var39 = var23[var54 - 1 - var36];
                  float var40 = var23[var54 - 3 - var36];
                  var23[var53 - 1 - var36] = var37 + var39;
                  var23[var53 - 3 - var36] = var38 + var40;
                  float var41 = var48[var35 * var51];
                  float var42 = var48[var35 * var51 + 1];
                  var23[var54 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
                  var23[var54 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
               }
            }
         }

         for(var49 = 1; var49 < var46 - 1; ++var49) {
            var50 = var27[var49];
            if (var49 < var50) {
               var51 = 8 * var49;
               var52 = 8 * var50;
               var33 = var23[var51 + 1];
               var23[var51 + 1] = var23[var52 + 1];
               var23[var52 + 1] = var33;
               var33 = var23[var51 + 3];
               var23[var51 + 3] = var23[var52 + 3];
               var23[var52 + 3] = var33;
               var33 = var23[var51 + 5];
               var23[var51 + 5] = var23[var52 + 5];
               var23[var52 + 5] = var33;
               var33 = var23[var51 + 7];
               var23[var51 + 7] = var23[var52 + 7];
               var23[var52 + 7] = var33;
            }
         }

         for(var49 = 0; var49 < var20; ++var49) {
            var23[var49] = var23[2 * var49 + 1];
         }

         for(var49 = 0; var49 < var46; ++var49) {
            var23[var5 - 1 - 2 * var49] = var23[4 * var49];
            var23[var5 - 2 - 2 * var49] = var23[4 * var49 + 1];
            var23[var5 - var43 - 1 - 2 * var49] = var23[4 * var49 + 2];
            var23[var5 - var43 - 2 - 2 * var49] = var23[4 * var49 + 3];
         }

         for(var49 = 0; var49 < var46; ++var49) {
            var30 = var26[2 * var49];
            var31 = var26[2 * var49 + 1];
            var32 = var23[var20 + 2 * var49];
            var33 = var23[var20 + 2 * var49 + 1];
            var34 = var23[var5 - 2 - 2 * var49];
            float var55 = var23[var5 - 1 - 2 * var49];
            float var56 = var31 * (var32 - var34) + var30 * (var33 + var55);
            var23[var20 + 2 * var49] = (var32 + var34 + var56) * 0.5F;
            var23[var5 - 2 - 2 * var49] = (var32 + var34 - var56) * 0.5F;
            var56 = var31 * (var33 + var55) - var30 * (var32 - var34);
            var23[var20 + 2 * var49 + 1] = (var33 - var55 + var56) * 0.5F;
            var23[var5 - 1 - 2 * var49] = (-var33 + var55 + var56) * 0.5F;
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var49] = var23[2 * var49 + var20] * var25[2 * var49] + var23[2 * var49 + 1 + var20] * var25[2 * var49 + 1];
            var23[var20 - 1 - var49] = var23[2 * var49 + var20] * var25[2 * var49 + 1] - var23[2 * var49 + 1 + var20] * var25[2 * var49];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var5 - var43 + var49] = -var23[var49];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var49] = var23[var43 + var49];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var43 + var49] = -var23[var43 - var49 - 1];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var20 + var49] = var23[var5 - var49 - 1];
         }

         float[] var57;
         for(var49 = var9; var49 < var10; ++var49) {
            var30 = (float)Math.sin(((double)(var49 - var9) + 0.5D) / (double)var11 * 0.5D * 3.141592653589793D);
            var57 = this.ay;
            var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
         }

         for(var49 = var12; var49 < var13; ++var49) {
            var30 = (float)Math.sin(((double)(var49 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            var57 = this.ay;
            var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
         }
      }

      float[] var44 = null;
      if (this.ai > 0) {
         var43 = this.ai + var5 >> 2;
         var44 = new float[var43];
         int var47;
         if (!this.as) {
            for(var46 = 0; var46 < this.ao; ++var46) {
               var47 = (this.ai >> 1) + var46;
               var44[var46] += this.aa[var47];
            }
         }

         if (var18.ae(1679475031)) {
            for(var46 = var9; var46 < var5 >> 1; ++var46) {
               var47 = var44.length - (var5 >> 1) + var46;
               var44[var47] += this.ay[var46];
            }
         }
      }

      float[] var45 = this.aa;
      this.aa = this.ay;
      this.ay = var45;
      this.ai = var5;
      this.ao = var13 - (var5 >> 1);
      this.as = !var18.ae(1679475031);
      return var44;
   }

   static boolean ab(po var0) {
      if (!az) {
         byte[] var1 = var0.bt(0, 0, (byte)-87);
         if (var1 == null) {
            return false;
         }

         ag(var1);
         az = true;
      }

      return true;
   }

   static boolean ah(po var0) {
      if (!az) {
         byte[] var1 = var0.bt(0, 0, (byte)-4);
         if (var1 == null) {
            return false;
         }

         ag(var1);
         az = true;
      }

      return true;
   }

   void ae(byte[] var1) {
      vf var2 = new vf(var1);
      this.ae = var2.cz(-1734056172);
      this.ag = var2.cz(-1734056172);
      this.am = var2.cz(-1734056172);
      this.ax = var2.cz(-1734056172);
      if (this.ax < 0) {
         this.ax = ~this.ax;
         this.aq = true;
      }

      int var3 = var2.cz(-1734056172);
      this.ac = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.cv(952452697);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.cd(var7, 0, var5, (byte)-25);
         this.ac[var4] = var7;
      }

   }

   float[] ad(int var1) {
      cy var2 = new cy();
      var2.ag(this.ac[var1], 0, (byte)-117);
      this.ay = new float[au];
      var2.ae(1000428767);
      int var3 = var2.ac(client.aq(ab.length - 1, (byte)-44), 1042291535);
      boolean var4 = ap[var3];
      int var5 = var4 ? au : at;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = var2.ae(-810267047) != 0;
         var7 = var2.ae(1497764923) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (at >> 2);
         var10 = (var5 >> 2) + (at >> 2);
         var11 = at >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (at >> 2);
         var13 = var5 - (var5 >> 2) + (at >> 2);
         var14 = at >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      be var15 = ah[ab[var3]];
      int var16 = var15.ae;
      int var17 = var15.ag[var16];
      ci var18 = al[var17].ax(var2);
      boolean var19 = !var18.ae(1679475031);

      int var20;
      for(var20 = 0; var20 < var15.ac; ++var20) {
         bv var21 = ad[var15.am[var20]];
         float[] var22 = this.ay;
         var21.ac(var22, var5 >> 1, var19, var2);
      }

      if (var18.ae(1679475031)) {
         var16 = var15.ae;
         int var10000 = var15.ag[var16];
         var18.ac(this.ay, var5 >> 1, -1689790489);
      }

      int var43;
      int var46;
      if (!var18.ae(1679475031)) {
         for(var20 = var5 >> 1; var20 < var5; ++var20) {
            this.ay[var20] = 0.0F;
         }
      } else {
         var20 = var5 >> 1;
         var43 = var5 >> 2;
         var46 = var5 >> 3;
         float[] var23 = this.ay;

         int var24;
         for(var24 = 0; var24 < var20; ++var24) {
            var23[var24] *= 0.5F;
         }

         for(var24 = var20; var24 < var5; ++var24) {
            var23[var24] = -var23[var5 - var24 - 1];
         }

         float[] var48 = var4 ? an : aj;
         float[] var25 = var4 ? ak : av;
         float[] var26 = var4 ? bn : aw;
         int[] var27 = var4 ? bd : bh;

         int var28;
         float var29;
         float var30;
         float var31;
         float var32;
         for(var28 = 0; var28 < var43; ++var28) {
            var29 = var23[4 * var28] - var23[var5 - 4 * var28 - 1];
            var30 = var23[4 * var28 + 2] - var23[var5 - 4 * var28 - 3];
            var31 = var48[2 * var28];
            var32 = var48[2 * var28 + 1];
            var23[var5 - 4 * var28 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - 4 * var28 - 3] = var29 * var32 + var30 * var31;
         }

         float var33;
         float var34;
         for(var28 = 0; var28 < var46; ++var28) {
            var29 = var23[var20 + 3 + 4 * var28];
            var30 = var23[var20 + 1 + 4 * var28];
            var31 = var23[4 * var28 + 3];
            var32 = var23[4 * var28 + 1];
            var23[var20 + 3 + 4 * var28] = var29 + var31;
            var23[var20 + 1 + 4 * var28] = var30 + var32;
            var33 = var48[var20 - 4 - 4 * var28];
            var34 = var48[var20 - 3 - 4 * var28];
            var23[4 * var28 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
            var23[4 * var28 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
         }

         var28 = client.aq(var5 - 1, (byte)111);

         int var49;
         int var50;
         int var51;
         int var52;
         for(var49 = 0; var49 < var28 - 3; ++var49) {
            var50 = var5 >> var49 + 2;
            var51 = 8 << var49;

            for(var52 = 0; var52 < 2 << var49; ++var52) {
               int var53 = var5 - var50 * 2 * var52;
               int var54 = var5 - var50 * (2 * var52 + 1);

               for(int var35 = 0; var35 < var5 >> var49 + 4; ++var35) {
                  int var36 = 4 * var35;
                  float var37 = var23[var53 - 1 - var36];
                  float var38 = var23[var53 - 3 - var36];
                  float var39 = var23[var54 - 1 - var36];
                  float var40 = var23[var54 - 3 - var36];
                  var23[var53 - 1 - var36] = var37 + var39;
                  var23[var53 - 3 - var36] = var38 + var40;
                  float var41 = var48[var35 * var51];
                  float var42 = var48[var35 * var51 + 1];
                  var23[var54 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
                  var23[var54 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
               }
            }
         }

         for(var49 = 1; var49 < var46 - 1; ++var49) {
            var50 = var27[var49];
            if (var49 < var50) {
               var51 = 8 * var49;
               var52 = 8 * var50;
               var33 = var23[var51 + 1];
               var23[var51 + 1] = var23[var52 + 1];
               var23[var52 + 1] = var33;
               var33 = var23[var51 + 3];
               var23[var51 + 3] = var23[var52 + 3];
               var23[var52 + 3] = var33;
               var33 = var23[var51 + 5];
               var23[var51 + 5] = var23[var52 + 5];
               var23[var52 + 5] = var33;
               var33 = var23[var51 + 7];
               var23[var51 + 7] = var23[var52 + 7];
               var23[var52 + 7] = var33;
            }
         }

         for(var49 = 0; var49 < var20; ++var49) {
            var23[var49] = var23[2 * var49 + 1];
         }

         for(var49 = 0; var49 < var46; ++var49) {
            var23[var5 - 1 - 2 * var49] = var23[4 * var49];
            var23[var5 - 2 - 2 * var49] = var23[4 * var49 + 1];
            var23[var5 - var43 - 1 - 2 * var49] = var23[4 * var49 + 2];
            var23[var5 - var43 - 2 - 2 * var49] = var23[4 * var49 + 3];
         }

         for(var49 = 0; var49 < var46; ++var49) {
            var30 = var26[2 * var49];
            var31 = var26[2 * var49 + 1];
            var32 = var23[var20 + 2 * var49];
            var33 = var23[var20 + 2 * var49 + 1];
            var34 = var23[var5 - 2 - 2 * var49];
            float var55 = var23[var5 - 1 - 2 * var49];
            float var56 = var31 * (var32 - var34) + var30 * (var33 + var55);
            var23[var20 + 2 * var49] = (var32 + var34 + var56) * 0.5F;
            var23[var5 - 2 - 2 * var49] = (var32 + var34 - var56) * 0.5F;
            var56 = var31 * (var33 + var55) - var30 * (var32 - var34);
            var23[var20 + 2 * var49 + 1] = (var33 - var55 + var56) * 0.5F;
            var23[var5 - 1 - 2 * var49] = (-var33 + var55 + var56) * 0.5F;
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var49] = var23[2 * var49 + var20] * var25[2 * var49] + var23[2 * var49 + 1 + var20] * var25[2 * var49 + 1];
            var23[var20 - 1 - var49] = var23[2 * var49 + var20] * var25[2 * var49 + 1] - var23[2 * var49 + 1 + var20] * var25[2 * var49];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var5 - var43 + var49] = -var23[var49];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var49] = var23[var43 + var49];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var43 + var49] = -var23[var43 - var49 - 1];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var20 + var49] = var23[var5 - var49 - 1];
         }

         float[] var57;
         for(var49 = var9; var49 < var10; ++var49) {
            var30 = (float)Math.sin(((double)(var49 - var9) + 0.5D) / (double)var11 * 0.5D * 3.141592653589793D);
            var57 = this.ay;
            var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
         }

         for(var49 = var12; var49 < var13; ++var49) {
            var30 = (float)Math.sin(((double)(var49 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            var57 = this.ay;
            var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
         }
      }

      float[] var44 = null;
      if (this.ai > 0) {
         var43 = this.ai + var5 >> 2;
         var44 = new float[var43];
         int var47;
         if (!this.as) {
            for(var46 = 0; var46 < this.ao; ++var46) {
               var47 = (this.ai >> 1) + var46;
               var44[var46] += this.aa[var47];
            }
         }

         if (var18.ae(1679475031)) {
            for(var46 = var9; var46 < var5 >> 1; ++var46) {
               var47 = var44.length - (var5 >> 1) + var46;
               var44[var47] += this.ay[var46];
            }
         }
      }

      float[] var45 = this.aa;
      this.aa = this.ay;
      this.ay = var45;
      this.ai = var5;
      this.ao = var13 - (var5 >> 1);
      this.as = !var18.ae(1679475031);
      return var44;
   }

   static boolean az(po var0) {
      if (!az) {
         byte[] var1 = var0.bt(0, 0, (byte)-5);
         if (var1 == null) {
            return false;
         }

         ag(var1);
         az = true;
      }

      return true;
   }

   static boolean aa(po var0) {
      if (!az) {
         byte[] var1 = var0.bt(0, 0, (byte)19);
         if (var1 == null) {
            return false;
         }

         ag(var1);
         az = true;
      }

      return true;
   }

   static cf ai(po var0, int var1, int var2) {
      if (!ax(var0)) {
         var0.bk(var1, var2, (byte)62);
         return null;
      } else {
         byte[] var3 = var0.bt(var1, var2, (byte)-43);
         return var3 == null ? null : new cf(var3);
      }
   }

   static cf ao(po var0, int var1, int var2) {
      if (!ax(var0)) {
         var0.bk(var1, var2, (byte)67);
         return null;
      } else {
         byte[] var3 = var0.bt(var1, var2, (byte)-35);
         return var3 == null ? null : new cf(var3);
      }
   }

   static cf as(po var0, int var1, int var2) {
      if (!ax(var0)) {
         var0.bk(var1, var2, (byte)99);
         return null;
      } else {
         byte[] var3 = var0.bt(var1, var2, (byte)98);
         return var3 == null ? null : new cf(var3);
      }
   }

   static cf ay(po var0, int var1, int var2) {
      if (!ax(var0)) {
         var0.bk(var1, var2, (byte)12);
         return null;
      } else {
         byte[] var3 = var0.bt(var1, var2, (byte)-66);
         return var3 == null ? null : new cf(var3);
      }
   }

   static boolean ap(po var0) {
      if (!az) {
         byte[] var1 = var0.bt(0, 0, (byte)-18);
         if (var1 == null) {
            return false;
         }

         ag(var1);
         az = true;
      }

      return true;
   }

   bg av(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.bx == null) {
            this.ai = 0;
            this.aa = new float[au];
            this.bx = new byte[this.ag];
            this.bf = 0;
            this.bm = 0;
         }

         for(; this.bm < this.ac.length; ++this.bm) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.am(this.bm);
            if (var2 != null) {
               int var3 = this.bf;
               int var4 = var2.length;
               if (var4 > this.ag - var3) {
                  var4 = this.ag - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & 600031478) != 0) {
                     var6 = ~var6 >> -418856450;
                  }

                  this.bx[var3++] = (byte)(var6 - -613669929);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.bf;
               }

               this.bf = var3;
            }
         }

         this.aa = null;
         byte[] var7 = this.bx;
         this.bx = null;
         return new bg(this.ae, var7, this.am, this.ax, this.aq);
      }
   }
}
