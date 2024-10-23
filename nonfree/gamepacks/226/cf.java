public class cf {
   static final int aw = 4;
   static final float at = 100.0F;
   int[] ap = new int[2];
   int[][][] aj = new int[2][2][4];
   int[] ai = new int[2];
   static float[][] ay = new float[2][8];
   static int[][] as = new int[2][8];
   static float ae;
   static int am;
   int[][][] ak = new int[2][2][4];
   static final float au = 8.0F;
   static final float an = 32.703197F;

   final void ai(vl var1, bo var2) {
      int var3 = var1.cy((short)-16340);
      this.ap[0] = var3 >> 4;
      this.ap[1] = var3 & 15;
      if (var3 != 0) {
         this.ai[0] = var1.ce(1288745560);
         this.ai[1] = var1.ce(136953818);
         int var4 = var1.cy((short)-26804);

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.ap[var5]; ++var6) {
               this.ak[var5][0][var6] = var1.ce(1782056074);
               this.aj[var5][0][var6] = var1.ce(914602619);
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.ap[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.ak[var5][1][var6] = var1.ce(648761297);
                  this.aj[var5][1][var6] = var1.ce(670005334);
               } else {
                  this.ak[var5][1][var6] = this.ak[var5][0][var6];
                  this.aj[var5][1][var6] = this.aj[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.ai[1] != this.ai[0]) {
            var2.aw(var1);
         }
      } else {
         int[] var7 = this.ai;
         this.ai[1] = 0;
         var7[0] = 0;
      }

   }

   float ap(int var1, int var2, float var3) {
      float var4 = (float)this.aj[var1][0][var2] + var3 * (float)(this.aj[var1][1][var2] - this.aj[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   static float aw(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   int aj(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.ai[0] + (float)(this.ai[1] - this.ai[0]) * var2;
         var3 *= 0.0030517578F;
         ae = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         am = (int)(ae * 65536.0F);
      }

      if (this.ap[var1] == 0) {
         return 0;
      } else {
         var3 = this.ap(var1, 0, var2);
         ay[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.ak(var1, 0, var2));
         ay[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.ap[var1]; ++var4) {
            var3 = this.ap(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.ak(var1, var4, var2));
            float var6 = var3 * var3;
            ay[var1][var4 * 2 + 1] = ay[var1][var4 * 2 - 1] * var6;
            ay[var1][var4 * 2] = ay[var1][var4 * 2 - 1] * var5 + ay[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = ay[var1];
               var10000[var7] += ay[var1][var7 - 1] * var5 + ay[var1][var7 - 2] * var6;
            }

            var10000 = ay[var1];
            var10000[1] += ay[var1][0] * var5 + var6;
            var10000 = ay[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.ap[0] * 2; ++var4) {
               var10000 = ay[0];
               var10000[var4] *= ae;
            }
         }

         for(var4 = 0; var4 < this.ap[var1] * 2; ++var4) {
            as[var1][var4] = (int)(ay[var1][var4] * 65536.0F);
         }

         return this.ap[var1] * 2;
      }
   }

   cf() {
   }

   float ar(int var1, int var2, float var3) {
      float var4 = (float)this.ak[var1][0][var2] + var3 * (float)(this.ak[var1][1][var2] - this.ak[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return aw(var4);
   }

   float af(int var1, int var2, float var3) {
      float var4 = (float)this.ak[var1][0][var2] + var3 * (float)(this.ak[var1][1][var2] - this.ak[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return aw(var4);
   }

   float as(int var1, int var2, float var3) {
      float var4 = (float)this.aj[var1][0][var2] + var3 * (float)(this.aj[var1][1][var2] - this.aj[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   float ae(int var1, int var2, float var3) {
      float var4 = (float)this.aj[var1][0][var2] + var3 * (float)(this.aj[var1][1][var2] - this.aj[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   float am(int var1, int var2, float var3) {
      float var4 = (float)this.aj[var1][0][var2] + var3 * (float)(this.aj[var1][1][var2] - this.aj[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   float at(int var1, int var2, float var3) {
      float var4 = (float)this.aj[var1][0][var2] + var3 * (float)(this.aj[var1][1][var2] - this.aj[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   static float au(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   static float an(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   float ao(int var1, int var2, float var3) {
      float var4 = (float)this.ak[var1][0][var2] + var3 * (float)(this.ak[var1][1][var2] - this.ak[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return aw(var4);
   }

   float ay(int var1, int var2, float var3) {
      float var4 = (float)this.aj[var1][0][var2] + var3 * (float)(this.aj[var1][1][var2] - this.aj[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   int az(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.ai[0] + (float)(this.ai[1] - this.ai[0]) * var2;
         var3 *= 0.0030517578F;
         ae = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         am = (int)(ae * 65536.0F);
      }

      if (this.ap[var1] == 0) {
         return 0;
      } else {
         var3 = this.ap(var1, 0, var2);
         ay[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.ak(var1, 0, var2));
         ay[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.ap[var1]; ++var4) {
            var3 = this.ap(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.ak(var1, var4, var2));
            float var6 = var3 * var3;
            ay[var1][var4 * 2 + 1] = ay[var1][var4 * 2 - 1] * var6;
            ay[var1][var4 * 2] = ay[var1][var4 * 2 - 1] * var5 + ay[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = ay[var1];
               var10000[var7] += ay[var1][var7 - 1] * var5 + ay[var1][var7 - 2] * var6;
            }

            var10000 = ay[var1];
            var10000[1] += ay[var1][0] * var5 + var6;
            var10000 = ay[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.ap[0] * 2; ++var4) {
               var10000 = ay[0];
               var10000[var4] *= ae;
            }
         }

         for(var4 = 0; var4 < this.ap[var1] * 2; ++var4) {
            as[var1][var4] = (int)(ay[var1][var4] * 65536.0F);
         }

         return this.ap[var1] * 2;
      }
   }

   int ab(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.ai[0] + (float)(this.ai[1] - this.ai[0]) * var2;
         var3 *= 0.0030517578F;
         ae = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         am = (int)(ae * 65536.0F);
      }

      if (this.ap[var1] == 0) {
         return 0;
      } else {
         var3 = this.ap(var1, 0, var2);
         ay[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.ak(var1, 0, var2));
         ay[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.ap[var1]; ++var4) {
            var3 = this.ap(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.ak(var1, var4, var2));
            float var6 = var3 * var3;
            ay[var1][var4 * 2 + 1] = ay[var1][var4 * 2 - 1] * var6;
            ay[var1][var4 * 2] = ay[var1][var4 * 2 - 1] * var5 + ay[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = ay[var1];
               var10000[var7] += ay[var1][var7 - 1] * var5 + ay[var1][var7 - 2] * var6;
            }

            var10000 = ay[var1];
            var10000[1] += ay[var1][0] * var5 + var6;
            var10000 = ay[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.ap[0] * 2; ++var4) {
               var10000 = ay[0];
               var10000[var4] *= ae;
            }
         }

         for(var4 = 0; var4 < this.ap[var1] * 2; ++var4) {
            as[var1][var4] = (int)(ay[var1][var4] * 65536.0F);
         }

         return this.ap[var1] * 2;
      }
   }

   float ak(int var1, int var2, float var3) {
      float var4 = (float)this.ak[var1][0][var2] + var3 * (float)(this.ak[var1][1][var2] - this.ak[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return aw(var4);
   }

   int ag(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.ai[0] + (float)(this.ai[1] - this.ai[0]) * var2;
         var3 *= 0.0030517578F;
         ae = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         am = (int)(ae * 65536.0F);
      }

      if (this.ap[var1] == 0) {
         return 0;
      } else {
         var3 = this.ap(var1, 0, var2);
         ay[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.ak(var1, 0, var2));
         ay[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.ap[var1]; ++var4) {
            var3 = this.ap(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.ak(var1, var4, var2));
            float var6 = var3 * var3;
            ay[var1][var4 * 2 + 1] = ay[var1][var4 * 2 - 1] * var6;
            ay[var1][var4 * 2] = ay[var1][var4 * 2 - 1] * var5 + ay[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = ay[var1];
               var10000[var7] += ay[var1][var7 - 1] * var5 + ay[var1][var7 - 2] * var6;
            }

            var10000 = ay[var1];
            var10000[1] += ay[var1][0] * var5 + var6;
            var10000 = ay[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.ap[0] * 2; ++var4) {
               var10000 = ay[0];
               var10000[var4] *= ae;
            }
         }

         for(var4 = 0; var4 < this.ap[var1] * 2; ++var4) {
            as[var1][var4] = (int)(ay[var1][var4] * 65536.0F);
         }

         return this.ap[var1] * 2;
      }
   }

   int ad(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.ai[0] + (float)(this.ai[1] - this.ai[0]) * var2;
         var3 *= 0.0030517578F;
         ae = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         am = (int)(ae * 65536.0F);
      }

      if (this.ap[var1] == 0) {
         return 0;
      } else {
         var3 = this.ap(var1, 0, var2);
         ay[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.ak(var1, 0, var2));
         ay[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.ap[var1]; ++var4) {
            var3 = this.ap(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.ak(var1, var4, var2));
            float var6 = var3 * var3;
            ay[var1][var4 * 2 + 1] = ay[var1][var4 * 2 - 1] * var6;
            ay[var1][var4 * 2] = ay[var1][var4 * 2 - 1] * var5 + ay[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = ay[var1];
               var10000[var7] += ay[var1][var7 - 1] * var5 + ay[var1][var7 - 2] * var6;
            }

            var10000 = ay[var1];
            var10000[1] += ay[var1][0] * var5 + var6;
            var10000 = ay[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.ap[0] * 2; ++var4) {
               var10000 = ay[0];
               var10000[var4] *= ae;
            }
         }

         for(var4 = 0; var4 < this.ap[var1] * 2; ++var4) {
            as[var1][var4] = (int)(ay[var1][var4] * 65536.0F);
         }

         return this.ap[var1] * 2;
      }
   }

   final void ac(vl var1, bo var2) {
      int var3 = var1.cy((short)-27781);
      this.ap[0] = var3 >> 4;
      this.ap[1] = var3 & 15;
      if (var3 != 0) {
         this.ai[0] = var1.ce(176041389);
         this.ai[1] = var1.ce(1623230608);
         int var4 = var1.cy((short)-9671);

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.ap[var5]; ++var6) {
               this.ak[var5][0][var6] = var1.ce(1648318966);
               this.aj[var5][0][var6] = var1.ce(1081264964);
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.ap[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.ak[var5][1][var6] = var1.ce(450709114);
                  this.aj[var5][1][var6] = var1.ce(542611977);
               } else {
                  this.ak[var5][1][var6] = this.ak[var5][0][var6];
                  this.aj[var5][1][var6] = this.aj[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.ai[1] != this.ai[0]) {
            var2.aw(var1);
         }
      } else {
         int[] var7 = this.ai;
         this.ai[1] = 0;
         var7[0] = 0;
      }

   }
}
