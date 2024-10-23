public class jm {
   static jl ae;
   public static ky as;
   static int[] ak = new int[2048];
   public static int[] aj = new int[2048];
   public static int[] ai = new int[2048];
   static int[] aw = new int[512];
   static final jl am;
   public static int[] ap = new int[65536];
   static double ay;
   static final jl at;

   public static double bd() {
      return ay;
   }

   static void bc(double var0, int var2, int var3) {
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
            var22 = ai(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            ap[var4++] = var22;
         }
      }

   }

   public static void aw(kn var0) {
      as.as = var0;
   }

   public static void ak(double var0) {
      aj(var0, 0, 512);
   }

   static void aj(double var0, int var2, int var3) {
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
            var22 = ai(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            ap[var4++] = var22;
         }
      }

   }

   static int ai(int var0, double var1) {
      ay = var1;
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

   public static double ay() {
      return ay;
   }

   static int as() {
      return as.ao;
   }

   static int ae() {
      return as.af;
   }

   static int am() {
      return as.az;
   }

   static void dl(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
      ae.aj(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   static int bu(int var0, double var1) {
      ay = var1;
      double var3 = (double)(var0 >> 16) / 256.0D;
      double var5 = (double)(var0 >> 8 & 255) / 256.0D;
      double var7 = (double)(var0 & -1883987813) / 256.0D;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0D);
      int var10 = (int)(var5 * 256.0D);
      int var11 = (int)(var7 * 256.0D);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   static int an() {
      return as.ad;
   }

   public static int ao() {
      return as.ay;
   }

   public static double bo() {
      return ay;
   }

   public static void ar(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && ae == at) {
         ae = am;
      }

      ae.ap(var0, var1, var2, var3);
   }

   jm() throws Throwable {
      throw new Error();
   }

   static int bn(int var0, double var1) {
      ay = var1;
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

   public static void ag() {
      as.ap();
   }

   static void ah(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
      ae.ai(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   public static void ac(int var0, int var1, int var2) {
      as.ak(var0, var1, var2);
   }

   static void av(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      ae.ay(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public static void ax(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      ae.as(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   static void aq(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      ae.ae(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void al(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      ae.am(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void aa(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
      ae.aj(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   public static void ad(int var0, int var1) {
      int var2 = as.av[0];
      int var3 = var2 / vz.aa;
      int var4 = var2 - var3 * vz.aa;
      as.aw(var0, var4, var1, var3);
   }

   static int cd() {
      return as.az;
   }

   public static void bh(boolean var0) {
      if (var0 && vz.bh != null) {
         ae = at;
      } else {
         ae = am;
      }

   }

   public static void bj(boolean var0) {
      if (var0 && vz.bh != null) {
         ae = at;
      } else {
         ae = am;
      }

   }

   public static void bv(boolean var0) {
      if (var0 && vz.bh != null) {
         ae = at;
      } else {
         ae = am;
      }

   }

   public static void bx(boolean var0) {
      if (var0 && vz.bh != null) {
         ae = at;
      } else {
         ae = am;
      }

   }

   public static void bk(kn var0) {
      as.as = var0;
   }

   static void br(double var0, int var2, int var3) {
      int var4 = var2 * 2136951398;

      for(int var5 = var2; var5 < var3; ++var5) {
         double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
         double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

         for(int var10 = 0; var10 < 893615286; ++var10) {
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
            var22 = ai(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            ap[var4++] = var22;
         }
      }

   }

   public static void bq(double var0) {
      aj(var0, 0, 1453586006);
   }

   static void by(double var0, int var2, int var3) {
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
            var22 = ai(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            ap[var4++] = var22;
         }
      }

   }

   static void bz(double var0, int var2, int var3) {
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
            var22 = ai(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            ap[var4++] = var22;
         }
      }

   }

   static void df(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      ae.am(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static int co() {
      return as.ag;
   }

   static int be() {
      return as.af;
   }

   static void dq(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      ae.ay(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   static int cu() {
      return as.ad;
   }

   static int bt(int var0, double var1) {
      ay = var1;
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

   static int af() {
      return as.ar;
   }

   public static double bm() {
      return ay;
   }

   public static void cs(int var0, int var1) {
      int var2 = as.av[0];
      int var3 = var2 / vz.aa;
      int var4 = var2 - var3 * vz.aa;
      as.aw(var0, var4, var1, var3);
   }

   public static double bs() {
      return ay;
   }

   public static double ba() {
      return ay;
   }

   static int bw() {
      return as.ao;
   }

   static int bi() {
      return as.ao;
   }

   static int cy() {
      return as.ad;
   }

   static int bg() {
      return as.af;
   }

   static int cf() {
      return as.ag;
   }

   static int au() {
      return as.ac;
   }

   static int cq() {
      return as.az;
   }

   static int cb() {
      return as.az;
   }

   static int bf() {
      return as.ao;
   }

   static int ci() {
      return as.ag;
   }

   static int cn() {
      return as.ag;
   }

   public static void ap(boolean var0) {
      if (var0 && vz.bh != null) {
         ae = at;
      } else {
         ae = am;
      }

   }

   static void az(int var0, int var1, int var2, int var3) {
      as.ar = var2 - var0;
      as.ab = var3 - var1;
      ag();
      if (as.av.length < as.ab) {
         as.av = new int[di.ay(as.ab, -1596264956)];
      }

      int var4 = var1 * vz.aa + var0;

      for(int var5 = 0; var5 < as.ab; ++var5) {
         as.av[var5] = var4;
         var4 += vz.aa;
      }

   }

   static void dg(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      ae.ae(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static int cp() {
      return as.ac;
   }

   static void dt(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
      ae.ai(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   static int cg() {
      return as.ar;
   }

   static int bl() {
      return as.af;
   }

   public static int ce() {
      return as.ay;
   }

   static int at() {
      return as.ag;
   }

   public static void cx(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && ae == at) {
         ae = am;
      }

      ae.ap(var0, var1, var2, var3);
   }

   public static void cz(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && ae == at) {
         ae = am;
      }

      ae.ap(var0, var1, var2, var3);
   }

   public static void ch(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && ae == at) {
         ae = am;
      }

      ae.ap(var0, var1, var2, var3);
   }

   public static void ct() {
      az(vz.bk, vz.bv, vz.bb, vz.bx);
   }

   public static void cc() {
      az(vz.bk, vz.bv, vz.bb, vz.bx);
   }

   static void cj(int var0, int var1, int var2, int var3) {
      as.ar = var2 - var0;
      as.ab = var3 - var1;
      ag();
      if (as.av.length < as.ab) {
         as.av = new int[di.ay(as.ab, -1817699221)];
      }

      int var4 = var1 * vz.aa + var0;

      for(int var5 = 0; var5 < as.ab; ++var5) {
         as.av[var5] = var4;
         var4 += vz.aa;
      }

   }

   static void cm(int var0, int var1, int var2, int var3) {
      as.ar = var2 - var0;
      as.ab = var3 - var1;
      ag();
      if (as.av.length < as.ab) {
         as.av = new int[di.ay(as.ab, -1458930786)];
      }

      int var4 = var1 * vz.aa + var0;

      for(int var5 = 0; var5 < as.ab; ++var5) {
         as.av[var5] = var4;
         var4 += vz.aa;
      }

   }

   public static void da(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      ae.as(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static void ca(int var0, int var1) {
      int var2 = as.av[0];
      int var3 = var2 / vz.aa;
      int var4 = var2 - var3 * vz.aa;
      as.aw(var0, var4, var1, var3);
   }

   static void dm(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
      ae.aj(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   static void cw(int var0, int var1, int var2, int var3) {
      as.ar = var2 - var0;
      as.ab = var3 - var1;
      ag();
      if (as.av.length < as.ab) {
         as.av = new int[di.ay(as.ab, -1859077280)];
      }

      int var4 = var1 * vz.aa + var0;

      for(int var5 = 0; var5 < as.ab; ++var5) {
         as.av[var5] = var4;
         var4 += vz.aa;
      }

   }

   public static void ck(int var0, int var1, int var2) {
      as.ak(var0, var1, var2);
   }

   public static void cr(int var0, int var1) {
      int var2 = as.av[0];
      int var3 = var2 / vz.aa;
      int var4 = var2 - var3 * vz.aa;
      as.aw(var0, var4, var1, var3);
   }

   static void dd(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      ae.ay(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public static void dc(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      ae.as(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   static int cl() {
      return as.ag;
   }

   static void dr(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      ae.ae(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void dh(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      ae.ae(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   public static void bb(double var0) {
      aj(var0, 0, 512);
   }

   public static void bp(double var0) {
      aj(var0, 0, 512);
   }

   static void du(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      ae.am(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void dk(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
      ae.aj(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   public static void ab() {
      az(vz.bk, vz.bv, vz.bb, vz.bx);
   }

   static int cv() {
      return as.ad;
   }

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         aw[var0] = '耀' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         ak[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         aj[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
         ai[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
      }

      as = new ky();
      am = new jh(as);
      at = new kh(as);
      ae = am;
   }

   static void dx(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
      ae.ai(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   static void ds(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
      ae.ai(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   static void db(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
      ae.ai(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }
}
