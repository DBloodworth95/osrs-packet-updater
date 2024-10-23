public class jw {
   static final ji ar;
   static int[] ae = new int[512];
   static int[] ag = new int[2048];
   public static int[] ac = new int[65536];
   public static int[] ax = new int[2048];
   public static kr af;
   public static int[] am = new int[2048];
   static ji at;
   static final ji au;
   static double aq;

   static void am(double var0, int var2, int var3) {
      int var4 = var2 * 128;

      for(int var5 = var2; var5 < var3; ++var5) {
         double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
         double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

         for(int var10 = 0; var10 < 128; ++var10) {
            double var11 = (double)var10 / 128.0D;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0D) {
               double var19;
               if (var11 < 0.5D) {
                  var19 = var11 * (1.0D + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0D * var11 - var19;
               double var23 = var6 + 0.3333333333333333D;
               if (var23 > 1.0D) {
                  --var23;
               }

               double var27 = var6 - 0.3333333333333333D;
               if (var27 < 0.0D) {
                  ++var27;
               }

               if (6.0D * var23 < 1.0D) {
                  var13 = var21 + (var19 - var21) * 6.0D * var23;
               } else if (2.0D * var23 < 1.0D) {
                  var13 = var19;
               } else if (3.0D * var23 < 2.0D) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
               } else {
                  var13 = var21;
               }

               if (6.0D * var6 < 1.0D) {
                  var15 = var21 + (var19 - var21) * 6.0D * var6;
               } else if (2.0D * var6 < 1.0D) {
                  var15 = var19;
               } else if (3.0D * var6 < 2.0D) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
               } else {
                  var15 = var21;
               }

               if (6.0D * var27 < 1.0D) {
                  var17 = var21 + (var19 - var21) * 6.0D * var27;
               } else if (2.0D * var27 < 1.0D) {
                  var17 = var19;
               } else if (3.0D * var27 < 2.0D) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
               } else {
                  var17 = var21;
               }
            }

            int var30 = (int)(var13 * 256.0D);
            int var20 = (int)(var15 * 256.0D);
            int var29 = (int)(var17 * 256.0D);
            int var22 = (var30 << 16) + (var20 << 8) + var29;
            var22 = ax(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            ac[var4++] = var22;
         }
      }

   }

   public static void ci(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && at == ar) {
         at = au;
      }

      at.ac(var0, var1, var2, var3);
   }

   public static void ae(kn var0) {
      af.af = var0;
   }

   public static void ag(double var0) {
      am(var0, 0, 512);
   }

   public static int cu() {
      return af.aq;
   }

   static int cf() {
      return af.ao;
   }

   public static double aq() {
      return aq;
   }

   public static void bd(boolean var0) {
      if (var0 && vr.bn != null) {
         at = ar;
      } else {
         at = au;
      }

   }

   public static void bf(kn var0) {
      af.af = var0;
   }

   static int au() {
      return af.aa;
   }

   static void dt(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      at.at(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void ay(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      at.aq(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   static int ad() {
      return af.ao;
   }

   public static int ah() {
      return af.aq;
   }

   static void cd(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      at.aq(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   static int at() {
      return af.ap;
   }

   public static void ab(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && at == ar) {
         at = au;
      }

      at.ac(var0, var1, var2, var3);
   }

   static void aa(int var0, int var1, int var2, int var3) {
      af.ab = var2 - var0;
      af.az = var3 - var1;
      ai();
      if (af.ay.length < af.az) {
         af.ay = new int[at.ax(af.az, 2081171372)];
      }

      int var4 = var1 * vr.an + var0;

      for(int var5 = 0; var5 < af.az; ++var5) {
         af.ay[var5] = var4;
         var4 += vr.an;
      }

   }

   public static void ai() {
      af.ac();
   }

   public static void ao(int var0, int var1) {
      int var2 = af.ay[0];
      int var3 = var2 / vr.an;
      int var4 = var2 - var3 * vr.an;
      af.ae(var0, var4, var1, var3);
   }

   public static void as(int var0, int var1, int var2) {
      af.ag(var0, var1, var2);
   }

   static int bb(int var0, double var1) {
      aq = var1;
      double var3 = (double)(var0 >> 16) / 256.0D;
      double var5 = (double)(var0 >> 8 & 255) / 256.0D;
      double var7 = (double)(var0 & 255) / 256.0D;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0D);
      int var10 = (int)(var5 * 256.0D);
      int var11 = (int)(var7 * 256.0D);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   public static void aj(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      at.af(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   static void av(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      at.at(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void bp(double var0, int var2, int var3) {
      int var4 = var2 * 128;

      for(int var5 = var2; var5 < var3; ++var5) {
         double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
         double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

         for(int var10 = 0; var10 < 1458821937; ++var10) {
            double var11 = (double)var10 / 128.0D;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0D) {
               double var19;
               if (var11 < 0.5D) {
                  var19 = var11 * (1.0D + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0D * var11 - var19;
               double var23 = var6 + 0.3333333333333333D;
               if (var23 > 1.0D) {
                  --var23;
               }

               double var27 = var6 - 0.3333333333333333D;
               if (var27 < 0.0D) {
                  ++var27;
               }

               if (6.0D * var23 < 1.0D) {
                  var13 = var21 + (var19 - var21) * 6.0D * var23;
               } else if (2.0D * var23 < 1.0D) {
                  var13 = var19;
               } else if (3.0D * var23 < 2.0D) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
               } else {
                  var13 = var21;
               }

               if (6.0D * var6 < 1.0D) {
                  var15 = var21 + (var19 - var21) * 6.0D * var6;
               } else if (2.0D * var6 < 1.0D) {
                  var15 = var19;
               } else if (3.0D * var6 < 2.0D) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
               } else {
                  var15 = var21;
               }

               if (6.0D * var27 < 1.0D) {
                  var17 = var21 + (var19 - var21) * 6.0D * var27;
               } else if (2.0D * var27 < 1.0D) {
                  var17 = var19;
               } else if (3.0D * var27 < 2.0D) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
               } else {
                  var17 = var21;
               }
            }

            int var30 = (int)(var13 * 256.0D);
            int var20 = (int)(var15 * 256.0D);
            int var29 = (int)(var17 * 256.0D);
            int var22 = (var30 << 16) + (var20 << 8) + var29;
            var22 = ax(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            ac[var4++] = var22;
         }
      }

   }

   static void an(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
      at.am(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   static void ak(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
      at.ax(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   static int cx() {
      return af.ab;
   }

   public static void bn(boolean var0) {
      if (var0 && vr.bn != null) {
         at = ar;
      } else {
         at = au;
      }

   }

   public static void bh(boolean var0) {
      if (var0 && vr.bn != null) {
         at = ar;
      } else {
         at = au;
      }

   }

   static void df(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      at.at(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   public static void bx(kn var0) {
      af.af = var0;
   }

   static int al() {
      return af.as;
   }

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         ae[var0] = '耀' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         ag[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         am[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
         ax[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
      }

      af = new kr();
      au = new jd(af);
      ar = new km(af);
      at = au;
   }

   public static void bs(kn var0) {
      af.af = var0;
   }

   public static void bw(double var0) {
      am(var0, 0, 512);
   }

   static void ba(double var0, int var2, int var3) {
      int var4 = var2 * 893886560;

      for(int var5 = var2; var5 < var3; ++var5) {
         double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
         double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

         for(int var10 = 0; var10 < -1644804923; ++var10) {
            double var11 = (double)var10 / 128.0D;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0D) {
               double var19;
               if (var11 < 0.5D) {
                  var19 = var11 * (1.0D + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0D * var11 - var19;
               double var23 = var6 + 0.3333333333333333D;
               if (var23 > 1.0D) {
                  --var23;
               }

               double var27 = var6 - 0.3333333333333333D;
               if (var27 < 0.0D) {
                  ++var27;
               }

               if (6.0D * var23 < 1.0D) {
                  var13 = var21 + (var19 - var21) * 6.0D * var23;
               } else if (2.0D * var23 < 1.0D) {
                  var13 = var19;
               } else if (3.0D * var23 < 2.0D) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
               } else {
                  var13 = var21;
               }

               if (6.0D * var6 < 1.0D) {
                  var15 = var21 + (var19 - var21) * 6.0D * var6;
               } else if (2.0D * var6 < 1.0D) {
                  var15 = var19;
               } else if (3.0D * var6 < 2.0D) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
               } else {
                  var15 = var21;
               }

               if (6.0D * var27 < 1.0D) {
                  var17 = var21 + (var19 - var21) * 6.0D * var27;
               } else if (2.0D * var27 < 1.0D) {
                  var17 = var19;
               } else if (3.0D * var27 < 2.0D) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
               } else {
                  var17 = var21;
               }
            }

            int var30 = (int)(var13 * 256.0D);
            int var20 = (int)(var15 * 256.0D);
            int var29 = (int)(var17 * 256.0D);
            int var22 = (var30 << 16) + (var20 << 8) + var29;
            var22 = ax(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            ac[var4++] = var22;
         }
      }

   }

   static void bj(double var0, int var2, int var3) {
      int var4 = var2 * 128;

      for(int var5 = var2; var5 < var3; ++var5) {
         double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
         double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

         for(int var10 = 0; var10 < 128; ++var10) {
            double var11 = (double)var10 / 128.0D;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0D) {
               double var19;
               if (var11 < 0.5D) {
                  var19 = var11 * (1.0D + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0D * var11 - var19;
               double var23 = var6 + 0.3333333333333333D;
               if (var23 > 1.0D) {
                  --var23;
               }

               double var27 = var6 - 0.3333333333333333D;
               if (var27 < 0.0D) {
                  ++var27;
               }

               if (6.0D * var23 < 1.0D) {
                  var13 = var21 + (var19 - var21) * 6.0D * var23;
               } else if (2.0D * var23 < 1.0D) {
                  var13 = var19;
               } else if (3.0D * var23 < 2.0D) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
               } else {
                  var13 = var21;
               }

               if (6.0D * var6 < 1.0D) {
                  var15 = var21 + (var19 - var21) * 6.0D * var6;
               } else if (2.0D * var6 < 1.0D) {
                  var15 = var19;
               } else if (3.0D * var6 < 2.0D) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
               } else {
                  var15 = var21;
               }

               if (6.0D * var27 < 1.0D) {
                  var17 = var21 + (var19 - var21) * 6.0D * var27;
               } else if (2.0D * var27 < 1.0D) {
                  var17 = var19;
               } else if (3.0D * var27 < 2.0D) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
               } else {
                  var17 = var21;
               }
            }

            int var30 = (int)(var13 * 256.0D);
            int var20 = (int)(var15 * 256.0D);
            int var29 = (int)(var17 * 256.0D);
            int var22 = (var30 << 16) + (var20 << 8) + var29;
            var22 = ax(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            ac[var4++] = var22;
         }
      }

   }

   static int bq() {
      return af.aa;
   }

   static int by(int var0, double var1) {
      aq = var1;
      double var3 = (double)(var0 >> 16) / 256.0D;
      double var5 = (double)(var0 >> 8 & 255) / 256.0D;
      double var7 = (double)(var0 & 255) / 256.0D;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0D);
      int var10 = (int)(var5 * 256.0D);
      int var11 = (int)(var7 * 256.0D);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   static void ce(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      at.aq(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   static int bi(int var0, double var1) {
      aq = var1;
      double var3 = (double)(var0 >> 16) / 256.0D;
      double var5 = (double)(var0 >> 8 & -1836852362) / 256.0D;
      double var7 = (double)(var0 & -1213962092) / 256.0D;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0D);
      int var10 = (int)(var5 * 256.0D);
      int var11 = (int)(var7 * 256.0D);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   static int cn() {
      return af.as;
   }

   public static double bl() {
      return aq;
   }

   static int bz() {
      return af.ah;
   }

   static int bu() {
      return af.ah;
   }

   static int br() {
      return af.ap;
   }

   static int bo() {
      return af.ap;
   }

   static int bv() {
      return af.ap;
   }

   public static void cs(int var0, int var1, int var2) {
      af.ag(var0, var1, var2);
   }

   public static double bg() {
      return aq;
   }

   static int bk() {
      return af.ai;
   }

   static int be() {
      return af.as;
   }

   static int bc() {
      return af.as;
   }

   public static void cr(int var0, int var1, int var2) {
      af.ag(var0, var1, var2);
   }

   static int ch() {
      return af.as;
   }

   static void dl(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      at.au(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void ct(int var0, int var1, int var2, int var3) {
      af.ab = var2 - var0;
      af.az = var3 - var1;
      ai();
      if (af.ay.length < af.az) {
         af.ay = new int[at.ax(af.az, 2087296330)];
      }

      int var4 = var1 * vr.an + var0;

      for(int var5 = 0; var5 < af.az; ++var5) {
         af.ay[var5] = var4;
         var4 += vr.an;
      }

   }

   public static void bm(kn var0) {
      af.af = var0;
   }

   public static int cj() {
      return af.aq;
   }

   static void dj(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
      at.ax(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   public static void az() {
      aa(vr.bf, vr.bd, vr.bm, vr.bx);
   }

   public static void cy(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && at == ar) {
         at = au;
      }

      at.ac(var0, var1, var2, var3);
   }

   public static void co(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && at == ar) {
         at = au;
      }

      at.ac(var0, var1, var2, var3);
   }

   public static void cv(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && at == ar) {
         at = au;
      }

      at.ac(var0, var1, var2, var3);
   }

   static int ar() {
      return af.ai;
   }

   static int af() {
      return af.ah;
   }

   public static void cq() {
      af.ac();
   }

   public static void cc() {
      af.ac();
   }

   public static void cz(int var0, int var1) {
      int var2 = af.ay[0];
      int var3 = var2 / vr.an;
      int var4 = var2 - var3 * vr.an;
      af.ae(var0, var4, var1, var3);
   }

   public static void cw(int var0, int var1) {
      int var2 = af.ay[0];
      int var3 = var2 / vr.an;
      int var4 = var2 - var3 * vr.an;
      af.ae(var0, var4, var1, var3);
   }

   static int bt() {
      return af.aa;
   }

   public static void cl(int var0, int var1, int var2) {
      af.ag(var0, var1, var2);
   }

   public static void ca(int var0, int var1, int var2) {
      af.ag(var0, var1, var2);
   }

   static void aw(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      at.au(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void cp(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      at.aq(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   static void cb(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      at.aq(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   jw() throws Throwable {
      throw new Error();
   }

   static int ax(int var0, double var1) {
      aq = var1;
      double var3 = (double)(var0 >> 16) / 256.0D;
      double var5 = (double)(var0 >> 8 & 255) / 256.0D;
      double var7 = (double)(var0 & 255) / 256.0D;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0D);
      int var10 = (int)(var5 * 256.0D);
      int var11 = (int)(var7 * 256.0D);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   public static void ck(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      at.af(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static void dp(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      at.af(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   static void dw(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
      at.am(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   static void dv(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      at.at(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   public static void ac(boolean var0) {
      if (var0 && vr.bn != null) {
         at = ar;
      } else {
         at = au;
      }

   }

   static void dk(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      at.au(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   public static void cg() {
      aa(vr.bf, vr.bd, vr.bm, vr.bx);
   }

   static void db(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
      at.am(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   static int ap() {
      return af.ab;
   }

   static void dc(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
      at.am(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   static void de(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
      at.am(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   static void dx(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
      at.ax(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   public static int cm() {
      return af.aq;
   }

   static void do(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
      at.ax(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }
}
