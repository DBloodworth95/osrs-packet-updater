public class cx {
   static final float al = 8.0F;
   static final int ae = 4;
   static float at;
   int[][][] ag = new int[2][2][4];
   int[] ax = new int[2];
   static float[][] aq = new float[2][8];
   static int[][] af = new int[2][8];
   static final float ar = 100.0F;
   int[][][] am = new int[2][2][4];
   int[] ac = new int[2];
   static int au;
   static final float ad = 32.703197F;

   float ag(int var1, int var2, float var3) {
      float var4 = (float)this.ag[var1][0][var2] + var3 * (float)(this.ag[var1][1][var2] - this.ag[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return ae(var4);
   }

   float ac(int var1, int var2, float var3) {
      float var4 = (float)this.am[var1][0][var2] + var3 * (float)(this.am[var1][1][var2] - this.am[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   static float ae(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   float au(int var1, int var2, float var3) {
      float var4 = (float)this.ag[var1][0][var2] + var3 * (float)(this.ag[var1][1][var2] - this.ag[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return ae(var4);
   }

   int am(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.ax[0] + (float)(this.ax[1] - this.ax[0]) * var2;
         var3 *= 0.0030517578F;
         at = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         au = (int)(at * 65536.0F);
      }

      if (this.ac[var1] == 0) {
         return 0;
      } else {
         var3 = this.ac(var1, 0, var2);
         aq[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.ag(var1, 0, var2));
         aq[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.ac[var1]; ++var4) {
            var3 = this.ac(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.ag(var1, var4, var2));
            float var6 = var3 * var3;
            aq[var1][var4 * 2 + 1] = aq[var1][var4 * 2 - 1] * var6;
            aq[var1][var4 * 2] = aq[var1][var4 * 2 - 1] * var5 + aq[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = aq[var1];
               var10000[var7] += aq[var1][var7 - 1] * var5 + aq[var1][var7 - 2] * var6;
            }

            var10000 = aq[var1];
            var10000[1] += aq[var1][0] * var5 + var6;
            var10000 = aq[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.ac[0] * 2; ++var4) {
               var10000 = aq[0];
               var10000[var4] *= at;
            }
         }

         for(var4 = 0; var4 < this.ac[var1] * 2; ++var4) {
            af[var1][var4] = (int)(aq[var1][var4] * 65536.0F);
         }

         return this.ac[var1] * 2;
      }
   }

   final void ax(vf var1, bu var2) {
      int var3 = var1.cv(952452697);
      this.ac[0] = var3 >> 4;
      this.ac[1] = var3 & 15;
      if (var3 != 0) {
         this.ax[0] = var1.ct(-2107637965);
         this.ax[1] = var1.ct(-1457172961);
         int var4 = var1.cv(952452697);

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.ac[var5]; ++var6) {
               this.ag[var5][0][var6] = var1.ct(-1737157851);
               this.am[var5][0][var6] = var1.ct(-1589519344);
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.ac[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.ag[var5][1][var6] = var1.ct(-1586316196);
                  this.am[var5][1][var6] = var1.ct(-1745870716);
               } else {
                  this.ag[var5][1][var6] = this.ag[var5][0][var6];
                  this.am[var5][1][var6] = this.am[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.ax[1] != this.ax[0]) {
            var2.ae(var1);
         }
      } else {
         int[] var7 = this.ax;
         this.ax[1] = 0;
         var7[0] = 0;
      }

   }

   static float af(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   cx() {
   }

   float at(int var1, int var2, float var3) {
      float var4 = (float)this.ag[var1][0][var2] + var3 * (float)(this.ag[var1][1][var2] - this.ag[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return ae(var4);
   }

   int al(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.ax[0] + (float)(this.ax[1] - this.ax[0]) * var2;
         var3 *= 0.0030517578F;
         at = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         au = (int)(at * 65536.0F);
      }

      if (this.ac[var1] == 0) {
         return 0;
      } else {
         var3 = this.ac(var1, 0, var2);
         aq[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.ag(var1, 0, var2));
         aq[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.ac[var1]; ++var4) {
            var3 = this.ac(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.ag(var1, var4, var2));
            float var6 = var3 * var3;
            aq[var1][var4 * 2 + 1] = aq[var1][var4 * 2 - 1] * var6;
            aq[var1][var4 * 2] = aq[var1][var4 * 2 - 1] * var5 + aq[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = aq[var1];
               var10000[var7] += aq[var1][var7 - 1] * var5 + aq[var1][var7 - 2] * var6;
            }

            var10000 = aq[var1];
            var10000[1] += aq[var1][0] * var5 + var6;
            var10000 = aq[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.ac[0] * 2; ++var4) {
               var10000 = aq[0];
               var10000[var4] *= at;
            }
         }

         for(var4 = 0; var4 < this.ac[var1] * 2; ++var4) {
            af[var1][var4] = (int)(aq[var1][var4] * 65536.0F);
         }

         return this.ac[var1] * 2;
      }
   }

   float ar(int var1, int var2, float var3) {
      float var4 = (float)this.ag[var1][0][var2] + var3 * (float)(this.ag[var1][1][var2] - this.ag[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return ae(var4);
   }

   final void ah(vf var1, bu var2) {
      int var3 = var1.cv(952452697);
      this.ac[0] = var3 >> 4;
      this.ac[1] = var3 & 15;
      if (var3 != 0) {
         this.ax[0] = var1.ct(-1351413206);
         this.ax[1] = var1.ct(-1443527173);
         int var4 = var1.cv(952452697);

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.ac[var5]; ++var6) {
               this.ag[var5][0][var6] = var1.ct(-1386869879);
               this.am[var5][0][var6] = var1.ct(-1502269364);
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.ac[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.ag[var5][1][var6] = var1.ct(-1589390062);
                  this.am[var5][1][var6] = var1.ct(-1515701810);
               } else {
                  this.ag[var5][1][var6] = this.ag[var5][0][var6];
                  this.am[var5][1][var6] = this.am[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.ax[1] != this.ax[0]) {
            var2.ae(var1);
         }
      } else {
         int[] var7 = this.ax;
         this.ax[1] = 0;
         var7[0] = 0;
      }

   }

   int ad(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.ax[0] + (float)(this.ax[1] - this.ax[0]) * var2;
         var3 *= 0.0030517578F;
         at = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         au = (int)(at * 65536.0F);
      }

      if (this.ac[var1] == 0) {
         return 0;
      } else {
         var3 = this.ac(var1, 0, var2);
         aq[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.ag(var1, 0, var2));
         aq[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.ac[var1]; ++var4) {
            var3 = this.ac(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.ag(var1, var4, var2));
            float var6 = var3 * var3;
            aq[var1][var4 * 2 + 1] = aq[var1][var4 * 2 - 1] * var6;
            aq[var1][var4 * 2] = aq[var1][var4 * 2 - 1] * var5 + aq[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = aq[var1];
               var10000[var7] += aq[var1][var7 - 1] * var5 + aq[var1][var7 - 2] * var6;
            }

            var10000 = aq[var1];
            var10000[1] += aq[var1][0] * var5 + var6;
            var10000 = aq[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.ac[0] * 2; ++var4) {
               var10000 = aq[0];
               var10000[var4] *= at;
            }
         }

         for(var4 = 0; var4 < this.ac[var1] * 2; ++var4) {
            af[var1][var4] = (int)(aq[var1][var4] * 65536.0F);
         }

         return this.ac[var1] * 2;
      }
   }

   static float aq(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   final void ap(vf var1, bu var2) {
      int var3 = var1.cv(952452697);
      this.ac[0] = var3 >> 4;
      this.ac[1] = var3 & 15;
      if (var3 != 0) {
         this.ax[0] = var1.ct(-1492929290);
         this.ax[1] = var1.ct(-1344865226);
         int var4 = var1.cv(952452697);

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.ac[var5]; ++var6) {
               this.ag[var5][0][var6] = var1.ct(-1340452333);
               this.am[var5][0][var6] = var1.ct(-1883752434);
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.ac[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.ag[var5][1][var6] = var1.ct(-1925068225);
                  this.am[var5][1][var6] = var1.ct(-1347933018);
               } else {
                  this.ag[var5][1][var6] = this.ag[var5][0][var6];
                  this.am[var5][1][var6] = this.am[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.ax[1] != this.ax[0]) {
            var2.ae(var1);
         }
      } else {
         int[] var7 = this.ax;
         this.ax[1] = 0;
         var7[0] = 0;
      }

   }
}
