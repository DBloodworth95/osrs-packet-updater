public class cd extends tw {
   int bk;
   byte[] bx;
   int ai;
   static cq[] at;
   static float[] ax;
   boolean ay;
   static cp as = new cp();
   static int ae;
   static int am;
   int aw;
   static bs[] au;
   static bw[] an;
   float[] az;
   static boolean[] af;
   boolean ac;
   static boolean ab = false;
   static float[] aa;
   int ag;
   int ad;
   static int[] ar;
   float[] av;
   int aj;
   static float[] aq;
   static int[] bj;
   static bl[] ao;
   static float[] ah;
   static float[] bh;
   int ak;
   static int[] bv;
   byte[][] ap;
   static float[] al;
   int bb;

   bt aq(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.bx == null) {
            this.ag = 0;
            this.az = new float[am];
            this.bx = new byte[this.ak];
            this.bk = 0;
            this.bb = 0;
         }

         for(; this.bb < this.ap.length; ++this.bb) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.aj(this.bb);
            if (var2 != null) {
               int var3 = this.bk;
               int var4 = var2.length;
               if (var4 > this.ak - var3) {
                  var4 = this.ak - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> -1404680107;
                  }

                  this.bx[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.bk;
               }

               this.bk = var3;
            }
         }

         this.az = null;
         byte[] var7 = this.bx;
         this.bx = null;
         return new bt(this.aw, var7, this.aj, this.ai, this.ay);
      }
   }

   void aw(byte[] var1) {
      vl var2 = new vl(var1);
      this.aw = var2.ch(1203709469);
      this.ak = var2.ch(1203709469);
      this.aj = var2.ch(1203709469);
      this.ai = var2.ch(1203709469);
      if (this.ai < 0) {
         this.ai = ~this.ai;
         this.ay = true;
      }

      int var3 = var2.ch(1203709469);
      this.ap = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.cy((short)-3883);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.cr(var7, 0, var5, (byte)59);
         this.ap[var4] = var7;
      }

   }

   static float ae(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   static boolean ad(pe var0) {
      if (!ab) {
         byte[] var1 = var0.bm(0, 0, 1744614516);
         if (var1 == null) {
            return false;
         }

         ak(var1);
         ab = true;
      }

      return true;
   }

   static boolean ai(pe var0) {
      if (!ab) {
         byte[] var1 = var0.bm(0, 0, 2088775503);
         if (var1 == null) {
            return false;
         }

         ak(var1);
         ab = true;
      }

      return true;
   }

   static cd ay(pe var0, int var1, int var2) {
      if (!ai(var0)) {
         var0.bd(var1, var2, -2094056493);
         return null;
      } else {
         byte[] var3 = var0.bm(var1, var2, 1087584204);
         return var3 == null ? null : new cd(var3);
      }
   }

   cd(byte[] var1) {
      this.aw(var1);
   }

   bt as(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.bx == null) {
            this.ag = 0;
            this.az = new float[am];
            this.bx = new byte[this.ak];
            this.bk = 0;
            this.bb = 0;
         }

         for(; this.bb < this.ap.length; ++this.bb) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.aj(this.bb);
            if (var2 != null) {
               int var3 = this.bk;
               int var4 = var2.length;
               if (var4 > this.ak - var3) {
                  var4 = this.ak - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.bx[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.bk;
               }

               this.bk = var3;
            }
         }

         this.az = null;
         byte[] var7 = this.bx;
         this.bx = null;
         return new bt(this.aw, var7, this.aj, this.ai, this.ay);
      }
   }

   bt al(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.bx == null) {
            this.ag = 0;
            this.az = new float[am];
            this.bx = new byte[this.ak];
            this.bk = 0;
            this.bb = 0;
         }

         for(; this.bb < this.ap.length; ++this.bb) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.aj(this.bb);
            if (var2 != null) {
               int var3 = this.bk;
               int var4 = var2.length;
               if (var4 > this.ak - var3) {
                  var4 = this.ak - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.bx[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.bk;
               }

               this.bk = var3;
            }
         }

         this.az = null;
         byte[] var7 = this.bx;
         this.bx = null;
         return new bt(this.aw, var7, this.aj, this.ai, this.ay);
      }
   }

   static float ap(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   static float am(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   float[] aj(int var1) {
      cp var2 = new cp();
      var2.ak(this.ap[var1], 0, 191564857);
      this.av = new float[am];
      var2.aw(-257091693);
      int var3 = var2.ap(cg.as(ar.length - 1, 1670529351), (byte)15);
      boolean var4 = af[var3];
      int var5 = var4 ? am : ae;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = var2.aw(1169183465) != 0;
         var7 = var2.aw(-346928409) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (ae >> 2);
         var10 = (var5 >> 2) + (ae >> 2);
         var11 = ae >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (ae >> 2);
         var13 = var5 - (var5 >> 2) + (ae >> 2);
         var14 = ae >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      bl var15 = ao[ar[var3]];
      int var16 = var15.aw;
      int var17 = var15.ak[var16];
      cl var18 = au[var17].ai(var2);
      boolean var19 = !var18.aw(-347110081);

      int var20;
      for(var20 = 0; var20 < var15.ap; ++var20) {
         bw var21 = an[var15.aj[var20]];
         float[] var22 = this.av;
         var21.ap(var22, var5 >> 1, var19, var2);
      }

      if (var18.aw(-347110081)) {
         var16 = var15.aw;
         int var10000 = var15.ak[var16];
         var18.ap(this.av, var5 >> 1, -636837515);
      }

      int var43;
      int var46;
      if (!var18.aw(-347110081)) {
         for(var20 = var5 >> 1; var20 < var5; ++var20) {
            this.av[var20] = 0.0F;
         }
      } else {
         var20 = var5 >> 1;
         var43 = var5 >> 2;
         var46 = var5 >> 3;
         float[] var23 = this.av;

         int var24;
         for(var24 = 0; var24 < var20; ++var24) {
            var23[var24] *= 0.5F;
         }

         for(var24 = var20; var24 < var5; ++var24) {
            var23[var24] = -var23[var5 - var24 - 1];
         }

         float[] var48 = var4 ? aa : ax;
         float[] var25 = var4 ? ah : aq;
         float[] var26 = var4 ? bh : al;
         int[] var27 = var4 ? bv : bj;

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

         var28 = cg.as(var5 - 1, -741740402);

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
            var57 = this.av;
            var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
         }

         for(var49 = var12; var49 < var13; ++var49) {
            var30 = (float)Math.sin(((double)(var49 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            var57 = this.av;
            var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
         }
      }

      float[] var44 = null;
      if (this.ag > 0) {
         var43 = this.ag + var5 >> 2;
         var44 = new float[var43];
         int var47;
         if (!this.ac) {
            for(var46 = 0; var46 < this.ad; ++var46) {
               var47 = (this.ag >> 1) + var46;
               var44[var46] += this.az[var47];
            }
         }

         if (var18.aw(-347110081)) {
            for(var46 = var9; var46 < var5 >> 1; ++var46) {
               var47 = var44.length - (var5 >> 1) + var46;
               var44[var47] += this.av[var46];
            }
         }
      }

      float[] var45 = this.az;
      this.az = this.av;
      this.av = var45;
      this.ag = var5;
      this.ad = var13 - (var5 >> 1);
      this.ac = !var18.aw(-347110081);
      return var44;
   }

   void au(byte[] var1) {
      vl var2 = new vl(var1);
      this.aw = var2.ch(1203709469);
      this.ak = var2.ch(1203709469);
      this.aj = var2.ch(1203709469);
      this.ai = var2.ch(1203709469);
      if (this.ai < 0) {
         this.ai = ~this.ai;
         this.ay = true;
      }

      int var3 = var2.ch(1203709469);
      this.ap = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.cy((short)-1988);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.cr(var7, 0, var5, (byte)48);
         this.ap[var4] = var7;
      }

   }

   void an(byte[] var1) {
      vl var2 = new vl(var1);
      this.aw = var2.ch(1203709469);
      this.ak = var2.ch(1203709469);
      this.aj = var2.ch(1203709469);
      this.ai = var2.ch(1203709469);
      if (this.ai < 0) {
         this.ai = ~this.ai;
         this.ay = true;
      }

      int var3 = var2.ch(1203709469);
      this.ap = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.cy((short)-31832);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.cr(var7, 0, var5, (byte)23);
         this.ap[var4] = var7;
      }

   }

   void ao(byte[] var1) {
      vl var2 = new vl(var1);
      this.aw = var2.ch(1203709469);
      this.ak = var2.ch(1203709469);
      this.aj = var2.ch(1203709469);
      this.ai = var2.ch(1203709469);
      if (this.ai < 0) {
         this.ai = ~this.ai;
         this.ay = true;
      }

      int var3 = var2.ch(1203709469);
      this.ap = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.cy((short)-10544);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.cr(var7, 0, var5, (byte)113);
         this.ap[var4] = var7;
      }

   }

   static void af(byte[] var0) {
      cp var1 = as;
      var1.ak(var0, 0, 130465479);
      ae = 1 << var1.ap(4, (byte)-22);
      am = 1 << var1.ap(4, (byte)93);

      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      for(var2 = 0; var2 < 2; ++var2) {
         var3 = var2 != 0 ? am : ae;
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
         int var11 = cg.as(var6 - 1, 1765806973);

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
            aa = var7;
            ah = var20;
            bh = var21;
            bv = var22;
         } else {
            ax = var7;
            aq = var20;
            al = var21;
            bj = var22;
         }
      }

      var2 = var1.ap(8, (byte)-102) + 1;
      at = new cq[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         at[var3] = new cq();
      }

      var3 = var1.ap(6, (byte)31) + 1;

      for(var4 = 0; var4 < var3; ++var4) {
         var1.ap(16, (byte)-115);
      }

      var3 = var1.ap(6, (byte)-11) + 1;
      au = new bs[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         au[var4] = new bs();
      }

      var4 = var1.ap(6, (byte)54) + 1;
      an = new bw[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         an[var5] = new bw();
      }

      var5 = var1.ap(6, (byte)-88) + 1;
      ao = new bl[var5];

      for(var6 = 0; var6 < var5; ++var6) {
         ao[var6] = new bl();
      }

      var6 = var1.ap(6, (byte)34) + 1;
      af = new boolean[var6];
      ar = new int[var6];

      for(int var19 = 0; var19 < var6; ++var19) {
         af[var19] = var1.aw(823722945) != 0;
         var1.ap(16, (byte)-12);
         var1.ap(16, (byte)28);
         ar[var19] = var1.ap(8, (byte)-68);
      }

   }

   static void ar(byte[] var0) {
      cp var1 = as;
      var1.ak(var0, 0, 1473351653);
      ae = 1 << var1.ap(4, (byte)51);
      am = 1 << var1.ap(4, (byte)11);

      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      for(var2 = 0; var2 < 2; ++var2) {
         var3 = var2 != 0 ? am : ae;
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
         int var11 = cg.as(var6 - 1, 1330133153);

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
            aa = var7;
            ah = var20;
            bh = var21;
            bv = var22;
         } else {
            ax = var7;
            aq = var20;
            al = var21;
            bj = var22;
         }
      }

      var2 = var1.ap(8, (byte)51) + 1;
      at = new cq[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         at[var3] = new cq();
      }

      var3 = var1.ap(6, (byte)106) + 1;

      for(var4 = 0; var4 < var3; ++var4) {
         var1.ap(16, (byte)-6);
      }

      var3 = var1.ap(6, (byte)-108) + 1;
      au = new bs[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         au[var4] = new bs();
      }

      var4 = var1.ap(6, (byte)30) + 1;
      an = new bw[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         an[var5] = new bw();
      }

      var5 = var1.ap(6, (byte)-41) + 1;
      ao = new bl[var5];

      for(var6 = 0; var6 < var5; ++var6) {
         ao[var6] = new bl();
      }

      var6 = var1.ap(6, (byte)-27) + 1;
      af = new boolean[var6];
      ar = new int[var6];

      for(int var19 = 0; var19 < var6; ++var19) {
         af[var19] = var1.aw(-620882605) != 0;
         var1.ap(16, (byte)34);
         var1.ap(16, (byte)19);
         ar[var19] = var1.ap(8, (byte)-21);
      }

   }

   static void ab(byte[] var0) {
      cp var1 = as;
      var1.ak(var0, 0, -606336945);
      ae = 1 << var1.ap(4, (byte)-44);
      am = 1 << var1.ap(4, (byte)84);

      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      for(var2 = 0; var2 < 2; ++var2) {
         var3 = var2 != 0 ? am : ae;
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
         int var11 = cg.as(var6 - 1, 1139149049);

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
            aa = var7;
            ah = var20;
            bh = var21;
            bv = var22;
         } else {
            ax = var7;
            aq = var20;
            al = var21;
            bj = var22;
         }
      }

      var2 = var1.ap(8, (byte)-16) + 1;
      at = new cq[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         at[var3] = new cq();
      }

      var3 = var1.ap(6, (byte)0) + 1;

      for(var4 = 0; var4 < var3; ++var4) {
         var1.ap(16, (byte)118);
      }

      var3 = var1.ap(6, (byte)-9) + 1;
      au = new bs[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         au[var4] = new bs();
      }

      var4 = var1.ap(6, (byte)-16) + 1;
      an = new bw[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         an[var5] = new bw();
      }

      var5 = var1.ap(6, (byte)-31) + 1;
      ao = new bl[var5];

      for(var6 = 0; var6 < var5; ++var6) {
         ao[var6] = new bl();
      }

      var6 = var1.ap(6, (byte)-43) + 1;
      af = new boolean[var6];
      ar = new int[var6];

      for(int var19 = 0; var19 < var6; ++var19) {
         af[var19] = var1.aw(1632442574) != 0;
         var1.ap(16, (byte)97);
         var1.ap(16, (byte)28);
         ar[var19] = var1.ap(8, (byte)0);
      }

   }

   float[] az(int var1) {
      cp var2 = new cp();
      var2.ak(this.ap[var1], 0, -1867102159);
      this.av = new float[am];
      var2.aw(-1500023227);
      int var3 = var2.ap(cg.as(ar.length - 1, 1779338532), (byte)67);
      boolean var4 = af[var3];
      int var5 = var4 ? am : ae;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = var2.aw(933981898) != 0;
         var7 = var2.aw(-927194972) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (ae >> 2);
         var10 = (var5 >> 2) + (ae >> 2);
         var11 = ae >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (ae >> 2);
         var13 = var5 - (var5 >> 2) + (ae >> 2);
         var14 = ae >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      bl var15 = ao[ar[var3]];
      int var16 = var15.aw;
      int var17 = var15.ak[var16];
      cl var18 = au[var17].ai(var2);
      boolean var19 = !var18.aw(-347110081);

      int var20;
      for(var20 = 0; var20 < var15.ap; ++var20) {
         bw var21 = an[var15.aj[var20]];
         float[] var22 = this.av;
         var21.ap(var22, var5 >> 1, var19, var2);
      }

      if (var18.aw(-347110081)) {
         var16 = var15.aw;
         int var10000 = var15.ak[var16];
         var18.ap(this.av, var5 >> 1, 1274217824);
      }

      int var43;
      int var46;
      if (!var18.aw(-347110081)) {
         for(var20 = var5 >> 1; var20 < var5; ++var20) {
            this.av[var20] = 0.0F;
         }
      } else {
         var20 = var5 >> 1;
         var43 = var5 >> 2;
         var46 = var5 >> 3;
         float[] var23 = this.av;

         int var24;
         for(var24 = 0; var24 < var20; ++var24) {
            var23[var24] *= 0.5F;
         }

         for(var24 = var20; var24 < var5; ++var24) {
            var23[var24] = -var23[var5 - var24 - 1];
         }

         float[] var48 = var4 ? aa : ax;
         float[] var25 = var4 ? ah : aq;
         float[] var26 = var4 ? bh : al;
         int[] var27 = var4 ? bv : bj;

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

         var28 = cg.as(var5 - 1, 1305561506);

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
            var57 = this.av;
            var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
         }

         for(var49 = var12; var49 < var13; ++var49) {
            var30 = (float)Math.sin(((double)(var49 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            var57 = this.av;
            var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
         }
      }

      float[] var44 = null;
      if (this.ag > 0) {
         var43 = this.ag + var5 >> 2;
         var44 = new float[var43];
         int var47;
         if (!this.ac) {
            for(var46 = 0; var46 < this.ad; ++var46) {
               var47 = (this.ag >> 1) + var46;
               var44[var46] += this.az[var47];
            }
         }

         if (var18.aw(-347110081)) {
            for(var46 = var9; var46 < var5 >> 1; ++var46) {
               var47 = var44.length - (var5 >> 1) + var46;
               var44[var47] += this.av[var46];
            }
         }
      }

      float[] var45 = this.az;
      this.az = this.av;
      this.av = var45;
      this.ag = var5;
      this.ad = var13 - (var5 >> 1);
      this.ac = !var18.aw(-347110081);
      return var44;
   }

   float[] ag(int var1) {
      cp var2 = new cp();
      var2.ak(this.ap[var1], 0, -1531049485);
      this.av = new float[am];
      var2.aw(-756708269);
      int var3 = var2.ap(cg.as(ar.length - 1, 645880393), (byte)51);
      boolean var4 = af[var3];
      int var5 = var4 ? am : ae;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = var2.aw(687116780) != 0;
         var7 = var2.aw(339982212) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (ae >> 2);
         var10 = (var5 >> 2) + (ae >> 2);
         var11 = ae >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (ae >> 2);
         var13 = var5 - (var5 >> 2) + (ae >> 2);
         var14 = ae >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      bl var15 = ao[ar[var3]];
      int var16 = var15.aw;
      int var17 = var15.ak[var16];
      cl var18 = au[var17].ai(var2);
      boolean var19 = !var18.aw(-347110081);

      int var20;
      for(var20 = 0; var20 < var15.ap; ++var20) {
         bw var21 = an[var15.aj[var20]];
         float[] var22 = this.av;
         var21.ap(var22, var5 >> 1, var19, var2);
      }

      if (var18.aw(-347110081)) {
         var16 = var15.aw;
         int var10000 = var15.ak[var16];
         var18.ap(this.av, var5 >> 1, -477347354);
      }

      int var43;
      int var46;
      if (!var18.aw(-347110081)) {
         for(var20 = var5 >> 1; var20 < var5; ++var20) {
            this.av[var20] = 0.0F;
         }
      } else {
         var20 = var5 >> 1;
         var43 = var5 >> 2;
         var46 = var5 >> 3;
         float[] var23 = this.av;

         int var24;
         for(var24 = 0; var24 < var20; ++var24) {
            var23[var24] *= 0.5F;
         }

         for(var24 = var20; var24 < var5; ++var24) {
            var23[var24] = -var23[var5 - var24 - 1];
         }

         float[] var48 = var4 ? aa : ax;
         float[] var25 = var4 ? ah : aq;
         float[] var26 = var4 ? bh : al;
         int[] var27 = var4 ? bv : bj;

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

         var28 = cg.as(var5 - 1, -1250409971);

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
            var57 = this.av;
            var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
         }

         for(var49 = var12; var49 < var13; ++var49) {
            var30 = (float)Math.sin(((double)(var49 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            var57 = this.av;
            var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
         }
      }

      float[] var44 = null;
      if (this.ag > 0) {
         var43 = this.ag + var5 >> 2;
         var44 = new float[var43];
         int var47;
         if (!this.ac) {
            for(var46 = 0; var46 < this.ad; ++var46) {
               var47 = (this.ag >> 1) + var46;
               var44[var46] += this.az[var47];
            }
         }

         if (var18.aw(-347110081)) {
            for(var46 = var9; var46 < var5 >> 1; ++var46) {
               var47 = var44.length - (var5 >> 1) + var46;
               var44[var47] += this.av[var46];
            }
         }
      }

      float[] var45 = this.az;
      this.az = this.av;
      this.av = var45;
      this.ag = var5;
      this.ad = var13 - (var5 >> 1);
      this.ac = !var18.aw(-347110081);
      return var44;
   }

   static boolean ac(pe var0) {
      if (!ab) {
         byte[] var1 = var0.bm(0, 0, 897945389);
         if (var1 == null) {
            return false;
         }

         ak(var1);
         ab = true;
      }

      return true;
   }

   static boolean av(pe var0) {
      if (!ab) {
         byte[] var1 = var0.bm(0, 0, 2032189142);
         if (var1 == null) {
            return false;
         }

         ak(var1);
         ab = true;
      }

      return true;
   }

   static cd ax(pe var0, int var1, int var2) {
      if (!ai(var0)) {
         var0.bd(var1, var2, -2094056493);
         return null;
      } else {
         byte[] var3 = var0.bm(var1, var2, 1138467149);
         return var3 == null ? null : new cd(var3);
      }
   }

   static float at(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & -1371855863) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   static void ak(byte[] var0) {
      cp var1 = as;
      var1.ak(var0, 0, 666617828);
      ae = 1 << var1.ap(4, (byte)72);
      am = 1 << var1.ap(4, (byte)-67);

      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      for(var2 = 0; var2 < 2; ++var2) {
         var3 = var2 != 0 ? am : ae;
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
         int var11 = cg.as(var6 - 1, 1212645464);

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
            aa = var7;
            ah = var20;
            bh = var21;
            bv = var22;
         } else {
            ax = var7;
            aq = var20;
            al = var21;
            bj = var22;
         }
      }

      var2 = var1.ap(8, (byte)84) + 1;
      at = new cq[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         at[var3] = new cq();
      }

      var3 = var1.ap(6, (byte)-109) + 1;

      for(var4 = 0; var4 < var3; ++var4) {
         var1.ap(16, (byte)12);
      }

      var3 = var1.ap(6, (byte)17) + 1;
      au = new bs[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         au[var4] = new bs();
      }

      var4 = var1.ap(6, (byte)-84) + 1;
      an = new bw[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         an[var5] = new bw();
      }

      var5 = var1.ap(6, (byte)42) + 1;
      ao = new bl[var5];

      for(var6 = 0; var6 < var5; ++var6) {
         ao[var6] = new bl();
      }

      var6 = var1.ap(6, (byte)-3) + 1;
      af = new boolean[var6];
      ar = new int[var6];

      for(int var19 = 0; var19 < var6; ++var19) {
         af[var19] = var1.aw(1378481897) != 0;
         var1.ap(16, (byte)-4);
         var1.ap(16, (byte)-8);
         ar[var19] = var1.ap(8, (byte)-27);
      }

   }
}
