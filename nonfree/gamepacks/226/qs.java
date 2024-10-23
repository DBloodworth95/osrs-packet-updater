import java.util.Arrays;

public final class qs {
   static int ak;
   static qs[] aw = new qs[0];
   static final float ap = 1.0E-4F;
   public float[] ai;
   public static final qs ay;
   static pe ae;

   public String toString() {
      try {
         StringBuilder var1 = new StringBuilder();
         this.ay((byte)-114);
         this.ai(1073429274);

         for(int var2 = 0; var2 < 4; ++var2) {
            for(int var3 = 0; var3 < 4; ++var3) {
               if (var3 > 0) {
                  var1.append("\t");
               }

               float var4 = this.ai[4 * var2 + var3];
               if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
                  var4 = 0.0F;
               }

               var1.append(var4);
            }

            var1.append("\n");
         }

         return var1.toString();
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qs.toString(" + ')');
      }
   }

   public void ci(qp var1) {
      float var2 = var1.as * var1.as;
      float var3 = var1.as * var1.aj;
      float var4 = var1.ai * var1.as;
      float var5 = var1.as * var1.ay;
      float var6 = var1.aj * var1.aj;
      float var7 = var1.aj * var1.ai;
      float var8 = var1.aj * var1.ay;
      float var9 = var1.ai * var1.ai;
      float var10 = var1.ai * var1.ay;
      float var11 = var1.ay * var1.ay;
      this.ai[0] = var2 + var6 - var11 - var9;
      this.ai[1] = var7 + var5 + var7 + var5;
      this.ai[2] = var8 + (var8 - var4 - var4);
      this.ai[4] = var7 - var5 - var5 + var7;
      this.ai[5] = var2 + var9 - var6 - var11;
      this.ai[6] = var3 + var10 + var3 + var10;
      this.ai[8] = var4 + var4 + var8 + var8;
      this.ai[9] = var10 + (var10 - var3 - var3);
      this.ai[10] = var11 + var2 - var9 - var6;
   }

   public qs(qs var1) {
      try {
         super();
         this.ai = new float[16];
         this.am(var1, -1650103875);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qs.<init>(" + ')');
      }
   }

   public qs(vl var1, boolean var2) {
      try {
         super();
         this.ai = new float[16];
         this.aj(var1, var2, -935615738);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qs.<init>(" + ')');
      }
   }

   void aj(vl var1, boolean var2, int var3) {
      try {
         if (var2) {
            if (var3 != -935615738) {
               throw new IllegalStateException();
            }

            qh var4 = new qh();
            int var7 = var1.cg(1666979295);
            var7 &= 16383;
            float var6 = (float)(3.834951969714103E-4D * (double)((float)var7));
            var4.aw(var6, 222329578);
            int var10 = var1.cg(1783423377);
            var10 &= 16383;
            float var9 = (float)(3.834951969714103E-4D * (double)((float)var10));
            var4.ak(var9, 309319879);
            int var13 = var1.cg(-655259528);
            var13 &= 16383;
            float var12 = (float)(3.834951969714103E-4D * (double)((float)var13));
            var4.aj(var12, 1177991842);
            var4.ai((float)var1.cg(1482752564), (float)var1.cg(1526913353), (float)var1.cg(-1729241177), -1031779477);
            this.ab(var4, -1239548164);
         } else {
            for(int var15 = 0; var15 < 16; ++var15) {
               if (var3 != -935615738) {
                  throw new IllegalStateException();
               }

               this.ai[var15] = var1.cc(121369628);
            }
         }

      } catch (RuntimeException var14) {
         throw tm.aw(var14, "qs.aj(" + ')');
      }
   }

   public qt cc(float var1, float var2, float var3) {
      float var4 = 1.0F / (var1 * this.ai[3] + this.ai[7] * var2 + var3 * this.ai[11] + this.ai[15]);
      return new qt((var1 * this.ai[0] + var2 * this.ai[4] + var3 * this.ai[8] + this.ai[12]) * var4, var4 * (this.ai[13] + var3 * this.ai[9] + this.ai[1] * var1 + var2 * this.ai[5]), var4 * (var2 * this.ai[6] + var1 * this.ai[2] + this.ai[10] * var3 + this.ai[14]));
   }

   public float[] ay(byte var1) {
      try {
         float[] var2 = new float[]{(float)(-Math.asin((double)this.ai[6])), 0.0F, 0.0F};
         double var3 = Math.cos((double)var2[0]);
         double var5;
         double var7;
         if (Math.abs(var3) > 0.005D) {
            var5 = (double)this.ai[2];
            var7 = (double)this.ai[10];
            double var9 = (double)this.ai[4];
            double var11 = (double)this.ai[5];
            var2[1] = (float)Math.atan2(var5, var7);
            var2[2] = (float)Math.atan2(var9, var11);
         } else {
            var5 = (double)this.ai[1];
            var7 = (double)this.ai[0];
            if (this.ai[6] < 0.0F) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var2[1] = (float)Math.atan2(var5, var7);
            } else {
               var2[1] = (float)(-Math.atan2(var5, var7));
            }

            var2[2] = 0.0F;
         }

         return var2;
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "qs.ay(" + ')');
      }
   }

   public int hashCode() {
      try {
         boolean var1 = true;
         byte var2 = 1;
         int var4 = 31 * var2 + Arrays.hashCode(this.ai);
         return var4;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qs.hashCode(" + ')');
      }
   }

   public void cb(qj var1) {
      float var2 = var1.ap.as * var1.ap.as;
      float var3 = var1.ap.aj * var1.ap.as;
      float var4 = var1.ap.ai * var1.ap.as;
      float var5 = var1.ap.ay * var1.ap.as;
      float var6 = var1.ap.aj * var1.ap.aj;
      float var7 = var1.ap.ai * var1.ap.aj;
      float var8 = var1.ap.ay * var1.ap.aj;
      float var9 = var1.ap.ai * var1.ap.ai;
      float var10 = var1.ap.ay * var1.ap.ai;
      float var11 = var1.ap.ay * var1.ap.ay;
      this.ai[0] = var2 + var6 - var11 - var9;
      this.ai[1] = var5 + var5 + var7 + var7;
      this.ai[2] = var8 - var4 - var4 + var8;
      this.ai[4] = var7 + (var7 - var5 - var5);
      this.ai[5] = var2 + var9 - var6 - var11;
      this.ai[6] = var10 + var3 + var10 + var3;
      this.ai[8] = var4 + var8 + var4 + var8;
      this.ai[9] = var10 - var3 - var3 + var10;
      this.ai[10] = var2 + var11 - var9 - var6;
      float[] var12 = this.ai;
      float[] var13 = this.ai;
      this.ai[11] = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.ai[12] = var1.aw.ay;
      this.ai[13] = var1.aw.as;
      this.ai[14] = var1.aw.ae;
      this.ai[15] = 1.0F;
   }

   public String amw() {
      StringBuilder var1 = new StringBuilder();
      this.ay((byte)-45);
      this.ai(-535186352);

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.ai[4 * var2 + var3];
            if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public void at(float var1, int var2) {
      try {
         this.au(var1, var1, var1, 423602413);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qs.at(" + ')');
      }
   }

   public void au(float var1, float var2, float var3, int var4) {
      try {
         this.as((byte)113);
         this.ai[0] = var1;
         this.ai[5] = var2;
         this.ai[10] = var3;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qs.au(" + ')');
      }
   }

   public void an(qs var1, int var2) {
      try {
         for(int var3 = 0; var3 < this.ai.length; ++var3) {
            if (var2 == -1099234768) {
               throw new IllegalStateException();
            }

            float[] var10000 = this.ai;
            var10000[var3] += var1.ai[var3];
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "qs.an(" + ')');
      }
   }

   public void bw(qs var1) {
      for(int var2 = 0; var2 < this.ai.length; ++var2) {
         float[] var10000 = this.ai;
         var10000[var2] += var1.ai[var2];
      }

   }

   public void af(qj var1, int var2) {
      try {
         float var3 = var1.ap.as * var1.ap.as;
         float var4 = var1.ap.aj * var1.ap.as;
         float var5 = var1.ap.ai * var1.ap.as;
         float var6 = var1.ap.ay * var1.ap.as;
         float var7 = var1.ap.aj * var1.ap.aj;
         float var8 = var1.ap.ai * var1.ap.aj;
         float var9 = var1.ap.ay * var1.ap.aj;
         float var10 = var1.ap.ai * var1.ap.ai;
         float var11 = var1.ap.ay * var1.ap.ai;
         float var12 = var1.ap.ay * var1.ap.ay;
         this.ai[0] = var3 + var7 - var12 - var10;
         this.ai[1] = var6 + var6 + var8 + var8;
         this.ai[2] = var9 - var5 - var5 + var9;
         this.ai[4] = var8 + (var8 - var6 - var6);
         this.ai[5] = var3 + var10 - var7 - var12;
         this.ai[6] = var11 + var4 + var11 + var4;
         this.ai[8] = var5 + var9 + var5 + var9;
         this.ai[9] = var11 - var4 - var4 + var11;
         this.ai[10] = var3 + var12 - var10 - var7;
         float[] var13 = this.ai;
         float[] var14 = this.ai;
         this.ai[11] = 0.0F;
         var14[7] = 0.0F;
         var13[3] = 0.0F;
         this.ai[12] = var1.aw.ay;
         this.ai[13] = var1.aw.as;
         this.ai[14] = var1.aw.ae;
         this.ai[15] = 1.0F;
      } catch (RuntimeException var15) {
         throw tm.aw(var15, "qs.af(" + ')');
      }
   }

   public void ar(qp var1, int var2) {
      try {
         float var3 = var1.as * var1.as;
         float var4 = var1.as * var1.aj;
         float var5 = var1.ai * var1.as;
         float var6 = var1.as * var1.ay;
         float var7 = var1.aj * var1.aj;
         float var8 = var1.aj * var1.ai;
         float var9 = var1.aj * var1.ay;
         float var10 = var1.ai * var1.ai;
         float var11 = var1.ai * var1.ay;
         float var12 = var1.ay * var1.ay;
         this.ai[0] = var3 + var7 - var12 - var10;
         this.ai[1] = var8 + var6 + var8 + var6;
         this.ai[2] = var9 + (var9 - var5 - var5);
         this.ai[4] = var8 - var6 - var6 + var8;
         this.ai[5] = var3 + var10 - var7 - var12;
         this.ai[6] = var4 + var11 + var4 + var11;
         this.ai[8] = var5 + var5 + var9 + var9;
         this.ai[9] = var11 + (var11 - var4 - var4);
         this.ai[10] = var12 + var3 - var10 - var7;
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "qs.ar(" + ')');
      }
   }

   public void ab(qh var1, int var2) {
      try {
         this.ai[0] = var1.ap;
         this.ai[1] = var1.aw;
         this.ai[2] = var1.ak;
         this.ai[3] = 0.0F;
         this.ai[4] = var1.aj;
         this.ai[5] = var1.ai;
         this.ai[6] = var1.ay;
         this.ai[7] = 0.0F;
         this.ai[8] = var1.as;
         this.ai[9] = var1.ae;
         this.ai[10] = var1.am;
         this.ai[11] = 0.0F;
         this.ai[12] = var1.at;
         this.ai[13] = var1.au;
         this.ai[14] = var1.an;
         this.ai[15] = 1.0F;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qs.ab(" + ')');
      }
   }

   float az(int var1) {
      try {
         return this.ai[3] * this.ai[6] * this.ai[9] * this.ai[12] + (this.ai[3] * this.ai[5] * this.ai[8] * this.ai[14] + this.ai[15] * this.ai[5] * this.ai[0] * this.ai[10] - this.ai[14] * this.ai[11] * this.ai[5] * this.ai[0] - this.ai[15] * this.ai[9] * this.ai[0] * this.ai[6] + this.ai[13] * this.ai[0] * this.ai[6] * this.ai[11] + this.ai[14] * this.ai[9] * this.ai[7] * this.ai[0] - this.ai[13] * this.ai[10] * this.ai[0] * this.ai[7] - this.ai[4] * this.ai[1] * this.ai[10] * this.ai[15] + this.ai[11] * this.ai[1] * this.ai[4] * this.ai[14] + this.ai[8] * this.ai[6] * this.ai[1] * this.ai[15] - this.ai[1] * this.ai[6] * this.ai[11] * this.ai[12] - this.ai[14] * this.ai[1] * this.ai[7] * this.ai[8] + this.ai[12] * this.ai[10] * this.ai[1] * this.ai[7] + this.ai[15] * this.ai[2] * this.ai[4] * this.ai[9] - this.ai[13] * this.ai[2] * this.ai[4] * this.ai[11] - this.ai[5] * this.ai[2] * this.ai[8] * this.ai[15] + this.ai[11] * this.ai[5] * this.ai[2] * this.ai[12] + this.ai[13] * this.ai[8] * this.ai[2] * this.ai[7] - this.ai[7] * this.ai[2] * this.ai[9] * this.ai[12] - this.ai[14] * this.ai[9] * this.ai[4] * this.ai[3] + this.ai[13] * this.ai[3] * this.ai[4] * this.ai[10] - this.ai[10] * this.ai[3] * this.ai[5] * this.ai[12] - this.ai[13] * this.ai[8] * this.ai[3] * this.ai[6]);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qs.az(" + ')');
      }
   }

   public void ag(byte var1) {
      try {
         float var2 = 1.0F / this.az(58198887);
         float var3 = var2 * (this.ai[13] * this.ai[11] * this.ai[6] + (this.ai[5] * this.ai[10] * this.ai[15] - this.ai[14] * this.ai[5] * this.ai[11] - this.ai[6] * this.ai[9] * this.ai[15]) + this.ai[7] * this.ai[9] * this.ai[14] - this.ai[13] * this.ai[10] * this.ai[7]);
         float var4 = var2 * (this.ai[9] * this.ai[2] * this.ai[15] + this.ai[10] * -this.ai[1] * this.ai[15] + this.ai[1] * this.ai[11] * this.ai[14] - this.ai[11] * this.ai[2] * this.ai[13] - this.ai[9] * this.ai[3] * this.ai[14] + this.ai[10] * this.ai[3] * this.ai[13]);
         float var5 = var2 * (this.ai[14] * this.ai[5] * this.ai[3] + this.ai[15] * this.ai[6] * this.ai[1] - this.ai[1] * this.ai[7] * this.ai[14] - this.ai[15] * this.ai[2] * this.ai[5] + this.ai[13] * this.ai[7] * this.ai[2] - this.ai[6] * this.ai[3] * this.ai[13]);
         float var6 = var2 * (this.ai[10] * this.ai[7] * this.ai[1] + this.ai[6] * -this.ai[1] * this.ai[11] + this.ai[5] * this.ai[2] * this.ai[11] - this.ai[9] * this.ai[2] * this.ai[7] - this.ai[3] * this.ai[5] * this.ai[10] + this.ai[6] * this.ai[3] * this.ai[9]);
         float var7 = var2 * (this.ai[12] * this.ai[10] * this.ai[7] + (this.ai[8] * this.ai[6] * this.ai[15] + this.ai[15] * -this.ai[4] * this.ai[10] + this.ai[14] * this.ai[11] * this.ai[4] - this.ai[12] * this.ai[6] * this.ai[11] - this.ai[14] * this.ai[8] * this.ai[7]));
         float var8 = var2 * (this.ai[15] * this.ai[10] * this.ai[0] - this.ai[11] * this.ai[0] * this.ai[14] - this.ai[15] * this.ai[2] * this.ai[8] + this.ai[2] * this.ai[11] * this.ai[12] + this.ai[14] * this.ai[8] * this.ai[3] - this.ai[3] * this.ai[10] * this.ai[12]);
         float var9 = var2 * (this.ai[6] * this.ai[3] * this.ai[12] + (this.ai[6] * -this.ai[0] * this.ai[15] + this.ai[14] * this.ai[7] * this.ai[0] + this.ai[15] * this.ai[2] * this.ai[4] - this.ai[12] * this.ai[7] * this.ai[2] - this.ai[4] * this.ai[3] * this.ai[14]));
         float var10 = (this.ai[6] * this.ai[0] * this.ai[11] - this.ai[10] * this.ai[0] * this.ai[7] - this.ai[4] * this.ai[2] * this.ai[11] + this.ai[7] * this.ai[2] * this.ai[8] + this.ai[3] * this.ai[4] * this.ai[10] - this.ai[8] * this.ai[6] * this.ai[3]) * var2;
         float var11 = var2 * (this.ai[9] * this.ai[4] * this.ai[15] - this.ai[11] * this.ai[4] * this.ai[13] - this.ai[15] * this.ai[5] * this.ai[8] + this.ai[12] * this.ai[11] * this.ai[5] + this.ai[7] * this.ai[8] * this.ai[13] - this.ai[7] * this.ai[9] * this.ai[12]);
         float var12 = var2 * (this.ai[9] * -this.ai[0] * this.ai[15] + this.ai[11] * this.ai[0] * this.ai[13] + this.ai[15] * this.ai[8] * this.ai[1] - this.ai[12] * this.ai[11] * this.ai[1] - this.ai[13] * this.ai[8] * this.ai[3] + this.ai[12] * this.ai[9] * this.ai[3]);
         float var13 = (this.ai[5] * this.ai[0] * this.ai[15] - this.ai[7] * this.ai[0] * this.ai[13] - this.ai[15] * this.ai[1] * this.ai[4] + this.ai[12] * this.ai[7] * this.ai[1] + this.ai[4] * this.ai[3] * this.ai[13] - this.ai[12] * this.ai[3] * this.ai[5]) * var2;
         float var14 = var2 * (this.ai[11] * this.ai[4] * this.ai[1] + this.ai[11] * this.ai[5] * -this.ai[0] + this.ai[9] * this.ai[0] * this.ai[7] - this.ai[1] * this.ai[7] * this.ai[8] - this.ai[4] * this.ai[3] * this.ai[9] + this.ai[8] * this.ai[5] * this.ai[3]);
         float var15 = (this.ai[8] * this.ai[5] * this.ai[14] + this.ai[10] * this.ai[4] * this.ai[13] + this.ai[9] * -this.ai[4] * this.ai[14] - this.ai[12] * this.ai[10] * this.ai[5] - this.ai[8] * this.ai[6] * this.ai[13] + this.ai[6] * this.ai[9] * this.ai[12]) * var2;
         float var16 = (this.ai[8] * this.ai[2] * this.ai[13] + this.ai[9] * this.ai[0] * this.ai[14] - this.ai[0] * this.ai[10] * this.ai[13] - this.ai[8] * this.ai[1] * this.ai[14] + this.ai[1] * this.ai[10] * this.ai[12] - this.ai[12] * this.ai[2] * this.ai[9]) * var2;
         float var17 = var2 * (this.ai[12] * this.ai[5] * this.ai[2] + (this.ai[1] * this.ai[4] * this.ai[14] + this.ai[14] * -this.ai[0] * this.ai[5] + this.ai[13] * this.ai[0] * this.ai[6] - this.ai[6] * this.ai[1] * this.ai[12] - this.ai[13] * this.ai[2] * this.ai[4]));
         float var18 = (this.ai[10] * this.ai[5] * this.ai[0] - this.ai[9] * this.ai[6] * this.ai[0] - this.ai[10] * this.ai[1] * this.ai[4] + this.ai[6] * this.ai[1] * this.ai[8] + this.ai[2] * this.ai[4] * this.ai[9] - this.ai[8] * this.ai[5] * this.ai[2]) * var2;
         this.ai[0] = var3;
         this.ai[1] = var4;
         this.ai[2] = var5;
         this.ai[3] = var6;
         this.ai[4] = var7;
         this.ai[5] = var8;
         this.ai[6] = var9;
         this.ai[7] = var10;
         this.ai[8] = var11;
         this.ai[9] = var12;
         this.ai[10] = var13;
         this.ai[11] = var14;
         this.ai[12] = var15;
         this.ai[13] = var16;
         this.ai[14] = var17;
         this.ai[15] = var18;
      } catch (RuntimeException var19) {
         throw tm.aw(var19, "qs.ag(" + ')');
      }
   }

   public float[] by() {
      float[] var1 = new float[]{(float)(-Math.asin((double)this.ai[6])), 0.0F, 0.0F};
      double var2 = Math.cos((double)var1[0]);
      double var4;
      double var6;
      if (Math.abs(var2) > 0.005D) {
         var4 = (double)this.ai[2];
         var6 = (double)this.ai[10];
         double var8 = (double)this.ai[4];
         double var10 = (double)this.ai[5];
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         var4 = (double)this.ai[1];
         var6 = (double)this.ai[0];
         if (this.ai[6] < 0.0F) {
            var1[1] = (float)Math.atan2(var4, var6);
         } else {
            var1[1] = (float)(-Math.atan2(var4, var6));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   public int amg() {
      boolean var1 = true;
      byte var2 = 1;
      int var3 = 31 * var2 + Arrays.hashCode(this.ai);
      return var3;
   }

   public qt av(float var1, float var2, float var3, int var4) {
      try {
         float var5 = 1.0F / (var1 * this.ai[3] + this.ai[7] * var2 + var3 * this.ai[11] + this.ai[15]);
         return new qt((var1 * this.ai[0] + var2 * this.ai[4] + var3 * this.ai[8] + this.ai[12]) * var5, var5 * (this.ai[13] + var3 * this.ai[9] + this.ai[1] * var1 + var2 * this.ai[5]), var5 * (var2 * this.ai[6] + var1 * this.ai[2] + this.ai[10] * var3 + this.ai[14]));
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "qs.av(" + ')');
      }
   }

   public float ax(float var1, float var2, float var3, byte var4) {
      try {
         return this.ai[12] + this.ai[8] * var3 + var1 * this.ai[0] + var2 * this.ai[4];
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qs.ax(" + ')');
      }
   }

   public float aq(float var1, float var2, float var3, int var4) {
      try {
         return this.ai[5] * var2 + var1 * this.ai[1] + var3 * this.ai[9] + this.ai[13];
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qs.aq(" + ')');
      }
   }

   public float dq(float var1, float var2, float var3) {
      return var3 * this.ai[10] + var1 * this.ai[2] + this.ai[6] * var2 + this.ai[14];
   }

   static {
      ng.ap(100, (int)958975677);
      ay = new qs();
   }

   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof qs)) {
            return false;
         } else {
            qs var2 = (qs)var1;

            for(int var3 = 0; var3 < 16; ++var3) {
               if (this.ai[var3] != var2.ai[var3]) {
                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "qs.equals(" + ')');
      }
   }

   public void be(qs var1) {
      float var2 = this.ai[1] * var1.ai[4] + this.ai[0] * var1.ai[0] + this.ai[2] * var1.ai[8] + this.ai[3] * var1.ai[12];
      float var3 = this.ai[1] * var1.ai[5] + this.ai[0] * var1.ai[1] + var1.ai[9] * this.ai[2] + this.ai[3] * var1.ai[13];
      float var4 = this.ai[0] * var1.ai[2] + this.ai[1] * var1.ai[6] + var1.ai[10] * this.ai[2] + var1.ai[14] * this.ai[3];
      float var5 = this.ai[3] * var1.ai[15] + this.ai[2] * var1.ai[11] + var1.ai[3] * this.ai[0] + var1.ai[7] * this.ai[1];
      float var6 = var1.ai[12] * this.ai[7] + var1.ai[8] * this.ai[6] + this.ai[4] * var1.ai[0] + var1.ai[4] * this.ai[5];
      float var7 = this.ai[7] * var1.ai[13] + var1.ai[5] * this.ai[5] + this.ai[4] * var1.ai[1] + this.ai[6] * var1.ai[9];
      float var8 = this.ai[4] * var1.ai[2] + this.ai[5] * var1.ai[6] + this.ai[6] * var1.ai[10] + var1.ai[14] * this.ai[7];
      float var9 = this.ai[6] * var1.ai[11] + var1.ai[3] * this.ai[4] + var1.ai[7] * this.ai[5] + this.ai[7] * var1.ai[15];
      float var10 = this.ai[10] * var1.ai[8] + this.ai[8] * var1.ai[0] + var1.ai[4] * this.ai[9] + this.ai[11] * var1.ai[12];
      float var11 = this.ai[11] * var1.ai[13] + var1.ai[1] * this.ai[8] + var1.ai[5] * this.ai[9] + var1.ai[9] * this.ai[10];
      float var12 = var1.ai[10] * this.ai[10] + var1.ai[2] * this.ai[8] + var1.ai[6] * this.ai[9] + this.ai[11] * var1.ai[14];
      float var13 = this.ai[8] * var1.ai[3] + this.ai[9] * var1.ai[7] + var1.ai[11] * this.ai[10] + var1.ai[15] * this.ai[11];
      float var14 = this.ai[15] * var1.ai[12] + this.ai[12] * var1.ai[0] + this.ai[13] * var1.ai[4] + this.ai[14] * var1.ai[8];
      float var15 = var1.ai[13] * this.ai[15] + var1.ai[9] * this.ai[14] + var1.ai[1] * this.ai[12] + var1.ai[5] * this.ai[13];
      float var16 = var1.ai[14] * this.ai[15] + this.ai[14] * var1.ai[10] + this.ai[13] * var1.ai[6] + var1.ai[2] * this.ai[12];
      float var17 = this.ai[15] * var1.ai[15] + this.ai[14] * var1.ai[11] + var1.ai[7] * this.ai[13] + this.ai[12] * var1.ai[3];
      this.ai[0] = var2;
      this.ai[1] = var3;
      this.ai[2] = var4;
      this.ai[3] = var5;
      this.ai[4] = var6;
      this.ai[5] = var7;
      this.ai[6] = var8;
      this.ai[7] = var9;
      this.ai[8] = var10;
      this.ai[9] = var11;
      this.ai[10] = var12;
      this.ai[11] = var13;
      this.ai[12] = var14;
      this.ai[13] = var15;
      this.ai[14] = var16;
      this.ai[15] = var17;
   }

   void as(byte var1) {
      try {
         this.ai[0] = 1.0F;
         this.ai[1] = 0.0F;
         this.ai[2] = 0.0F;
         this.ai[3] = 0.0F;
         this.ai[4] = 0.0F;
         this.ai[5] = 1.0F;
         this.ai[6] = 0.0F;
         this.ai[7] = 0.0F;
         this.ai[8] = 0.0F;
         this.ai[9] = 0.0F;
         this.ai[10] = 1.0F;
         this.ai[11] = 0.0F;
         this.ai[12] = 0.0F;
         this.ai[13] = 0.0F;
         this.ai[14] = 0.0F;
         this.ai[15] = 1.0F;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qs.as(" + ')');
      }
   }

   float[] ai(int var1) {
      try {
         float[] var2 = new float[3];
         if ((double)this.ai[2] < 0.999D) {
            if (var1 == -1836849639) {
               throw new IllegalStateException();
            }

            if ((double)this.ai[2] > -0.999D) {
               if (var1 == -1836849639) {
                  throw new IllegalStateException();
               }

               var2[1] = (float)(-Math.asin((double)this.ai[2]));
               double var3 = Math.cos((double)var2[1]);
               var2[0] = (float)Math.atan2((double)this.ai[6] / var3, (double)this.ai[10] / var3);
               var2[2] = (float)Math.atan2((double)this.ai[1] / var3, (double)this.ai[0] / var3);
               return var2;
            }
         }

         var2[0] = 0.0F;
         var2[1] = (float)Math.atan2((double)this.ai[2], 0.0D);
         var2[2] = (float)Math.atan2((double)(-this.ai[9]), (double)this.ai[5]);
         return var2;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qs.ai(" + ')');
      }
   }

   public boolean gj(Object var1) {
      if (!(var1 instanceof qs)) {
         return false;
      } else {
         qs var2 = (qs)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (this.ai[var3] != var2.ai[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public int ams() {
      boolean var1 = true;
      byte var2 = 1;
      int var3 = 31 * var2 + Arrays.hashCode(this.ai);
      return var3;
   }

   public void cf(qh var1) {
      this.ai[0] = var1.ap;
      this.ai[1] = var1.aw;
      this.ai[2] = var1.ak;
      this.ai[3] = 0.0F;
      this.ai[4] = var1.aj;
      this.ai[5] = var1.ai;
      this.ai[6] = var1.ay;
      this.ai[7] = 0.0F;
      this.ai[8] = var1.as;
      this.ai[9] = var1.ae;
      this.ai[10] = var1.am;
      this.ai[11] = 0.0F;
      this.ai[12] = var1.at;
      this.ai[13] = var1.au;
      this.ai[14] = var1.an;
      this.ai[15] = 1.0F;
   }

   public int amb() {
      boolean var1 = true;
      byte var2 = 1;
      int var3 = 1690988131 * var2 + Arrays.hashCode(this.ai);
      return var3;
   }

   public void cl(qh var1) {
      this.ai[0] = var1.ap;
      this.ai[1] = var1.aw;
      this.ai[2] = var1.ak;
      this.ai[3] = 0.0F;
      this.ai[4] = var1.aj;
      this.ai[5] = var1.ai;
      this.ai[6] = var1.ay;
      this.ai[7] = 0.0F;
      this.ai[8] = var1.as;
      this.ai[9] = var1.ae;
      this.ai[10] = var1.am;
      this.ai[11] = 0.0F;
      this.ai[12] = var1.at;
      this.ai[13] = var1.au;
      this.ai[14] = var1.an;
      this.ai[15] = 1.0F;
   }

   public void ao(qs var1, int var2) {
      try {
         float var3 = this.ai[1] * var1.ai[4] + this.ai[0] * var1.ai[0] + this.ai[2] * var1.ai[8] + this.ai[3] * var1.ai[12];
         float var4 = this.ai[1] * var1.ai[5] + this.ai[0] * var1.ai[1] + var1.ai[9] * this.ai[2] + this.ai[3] * var1.ai[13];
         float var5 = this.ai[0] * var1.ai[2] + this.ai[1] * var1.ai[6] + var1.ai[10] * this.ai[2] + var1.ai[14] * this.ai[3];
         float var6 = this.ai[3] * var1.ai[15] + this.ai[2] * var1.ai[11] + var1.ai[3] * this.ai[0] + var1.ai[7] * this.ai[1];
         float var7 = var1.ai[12] * this.ai[7] + var1.ai[8] * this.ai[6] + this.ai[4] * var1.ai[0] + var1.ai[4] * this.ai[5];
         float var8 = this.ai[7] * var1.ai[13] + var1.ai[5] * this.ai[5] + this.ai[4] * var1.ai[1] + this.ai[6] * var1.ai[9];
         float var9 = this.ai[4] * var1.ai[2] + this.ai[5] * var1.ai[6] + this.ai[6] * var1.ai[10] + var1.ai[14] * this.ai[7];
         float var10 = this.ai[6] * var1.ai[11] + var1.ai[3] * this.ai[4] + var1.ai[7] * this.ai[5] + this.ai[7] * var1.ai[15];
         float var11 = this.ai[10] * var1.ai[8] + this.ai[8] * var1.ai[0] + var1.ai[4] * this.ai[9] + this.ai[11] * var1.ai[12];
         float var12 = this.ai[11] * var1.ai[13] + var1.ai[1] * this.ai[8] + var1.ai[5] * this.ai[9] + var1.ai[9] * this.ai[10];
         float var13 = var1.ai[10] * this.ai[10] + var1.ai[2] * this.ai[8] + var1.ai[6] * this.ai[9] + this.ai[11] * var1.ai[14];
         float var14 = this.ai[8] * var1.ai[3] + this.ai[9] * var1.ai[7] + var1.ai[11] * this.ai[10] + var1.ai[15] * this.ai[11];
         float var15 = this.ai[15] * var1.ai[12] + this.ai[12] * var1.ai[0] + this.ai[13] * var1.ai[4] + this.ai[14] * var1.ai[8];
         float var16 = var1.ai[13] * this.ai[15] + var1.ai[9] * this.ai[14] + var1.ai[1] * this.ai[12] + var1.ai[5] * this.ai[13];
         float var17 = var1.ai[14] * this.ai[15] + this.ai[14] * var1.ai[10] + this.ai[13] * var1.ai[6] + var1.ai[2] * this.ai[12];
         float var18 = this.ai[15] * var1.ai[15] + this.ai[14] * var1.ai[11] + var1.ai[7] * this.ai[13] + this.ai[12] * var1.ai[3];
         this.ai[0] = var3;
         this.ai[1] = var4;
         this.ai[2] = var5;
         this.ai[3] = var6;
         this.ai[4] = var7;
         this.ai[5] = var8;
         this.ai[6] = var9;
         this.ai[7] = var10;
         this.ai[8] = var11;
         this.ai[9] = var12;
         this.ai[10] = var13;
         this.ai[11] = var14;
         this.ai[12] = var15;
         this.ai[13] = var16;
         this.ai[14] = var17;
         this.ai[15] = var18;
      } catch (RuntimeException var19) {
         throw tm.aw(var19, "qs.ao(" + ')');
      }
   }

   public void bi(qs var1) {
      for(int var2 = 0; var2 < this.ai.length; ++var2) {
         float[] var10000 = this.ai;
         var10000[var2] += var1.ai[var2];
      }

   }

   public String amu() {
      StringBuilder var1 = new StringBuilder();
      this.ay((byte)-12);
      this.ai(15887689);

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.ai[4 * var2 + var3];
            if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   static void ah(int var0) {
      ak = -2139603775 * var0;
      aw = new qs[var0];
      df.aj = 0;
   }

   public void am(qs var1, int var2) {
      try {
         System.arraycopy(var1.ai, 0, this.ai, 0, 16);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qs.am(" + ')');
      }
   }

   public void cg(float var1, float var2, float var3, float var4) {
      this.ai[0] = var1;
      this.ai[1] = 0.0F;
      this.ai[2] = 0.0F;
      this.ai[3] = 0.0F;
      this.ai[4] = 0.0F;
      this.ai[5] = var2;
      this.ai[6] = 0.0F;
      this.ai[7] = 0.0F;
      this.ai[8] = 0.0F;
      this.ai[9] = 0.0F;
      this.ai[10] = var3;
      this.ai[11] = 0.0F;
      this.ai[12] = 0.0F;
      this.ai[13] = 0.0F;
      this.ai[14] = 0.0F;
      this.ai[15] = var4;
   }

   public void ak(byte var1) {
      try {
         synchronized(aw) {
            if (-883666811 * df.aj < ak * 155603777 - 1) {
               if (var1 >= 1) {
                  return;
               }

               aw[(df.aj += -880596915) * -883666811 - 1] = this;
            }

         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qs.ak(" + ')');
      }
   }

   public static qs bx() {
      synchronized(aw) {
         if (df.aj * 826785082 == 0) {
            return new qs();
         } else {
            aw[(df.aj -= -880596915) * -883666811].as((byte)91);
            return aw[451305158 * df.aj];
         }
      }
   }

   public void bk() {
      synchronized(aw) {
         if (-883666811 * df.aj < ak * 155603777 - 1) {
            aw[(df.aj += -880596915) * -940838506 - 1] = this;
         }

      }
   }

   public void bb() {
      synchronized(aw) {
         if (-883666811 * df.aj < ak * 155603777 - 1) {
            aw[(df.aj += -880596915) * -883666811 - 1] = this;
         }

      }
   }

   void bq(vl var1, boolean var2) {
      if (var2) {
         qh var3 = new qh();
         int var6 = var1.cg(1732061055);
         var6 &= 16383;
         float var5 = (float)(3.834951969714103E-4D * (double)((float)var6));
         var3.aw(var5, 438579054);
         int var9 = var1.cg(1922232630);
         var9 &= 16383;
         float var8 = (float)(3.834951969714103E-4D * (double)((float)var9));
         var3.ak(var8, 309319879);
         int var12 = var1.cg(-1534640155);
         var12 &= -648785238;
         float var11 = (float)(3.834951969714103E-4D * (double)((float)var12));
         var3.aj(var11, 1247023659);
         var3.ai((float)var1.cg(-1514131663), (float)var1.cg(-1934150153), (float)var1.cg(-970163578), -1024552577);
         this.ab(var3, -2145954497);
      } else {
         for(int var13 = 0; var13 < 16; ++var13) {
            this.ai[var13] = var1.cc(2019064677);
         }
      }

   }

   void bp(vl var1, boolean var2) {
      if (var2) {
         qh var3 = new qh();
         int var6 = var1.cg(-735150603);
         var6 &= 16383;
         float var5 = (float)(3.834951969714103E-4D * (double)((float)var6));
         var3.aw(var5, -1619890143);
         int var9 = var1.cg(-656347833);
         var9 &= 16383;
         float var8 = (float)(3.834951969714103E-4D * (double)((float)var9));
         var3.ak(var8, 309319879);
         int var12 = var1.cg(597923820);
         var12 &= 16383;
         float var11 = (float)(3.834951969714103E-4D * (double)((float)var12));
         var3.aj(var11, -1196446245);
         var3.ai((float)var1.cg(-828464060), (float)var1.cg(465656782), (float)var1.cg(-13790830), -1766889292);
         this.ab(var3, -1527353472);
      } else {
         for(int var13 = 0; var13 < 16; ++var13) {
            this.ai[var13] = var1.cc(1725853241);
         }
      }

   }

   float[] bz() {
      float[] var1 = new float[3];
      if ((double)this.ai[2] < 0.999D && (double)this.ai[2] > -0.999D) {
         var1[1] = (float)(-Math.asin((double)this.ai[2]));
         double var2 = Math.cos((double)var1[1]);
         var1[0] = (float)Math.atan2((double)this.ai[6] / var2, (double)this.ai[10] / var2);
         var1[2] = (float)Math.atan2((double)this.ai[1] / var2, (double)this.ai[0] / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2((double)this.ai[2], 0.0D);
         var1[2] = (float)Math.atan2((double)(-this.ai[9]), (double)this.ai[5]);
      }

      return var1;
   }

   float[] bc() {
      float[] var1 = new float[3];
      if ((double)this.ai[2] < 0.999D && (double)this.ai[2] > -0.999D) {
         var1[1] = (float)(-Math.asin((double)this.ai[2]));
         double var2 = Math.cos((double)var1[1]);
         var1[0] = (float)Math.atan2((double)this.ai[6] / var2, (double)this.ai[10] / var2);
         var1[2] = (float)Math.atan2((double)this.ai[1] / var2, (double)this.ai[0] / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2((double)this.ai[2], 0.0D);
         var1[2] = (float)Math.atan2((double)(-this.ai[9]), (double)this.ai[5]);
      }

      return var1;
   }

   float cp() {
      return this.ai[3] * this.ai[6] * this.ai[9] * this.ai[12] + (this.ai[3] * this.ai[5] * this.ai[8] * this.ai[14] + this.ai[15] * this.ai[5] * this.ai[0] * this.ai[10] - this.ai[14] * this.ai[11] * this.ai[5] * this.ai[0] - this.ai[15] * this.ai[9] * this.ai[0] * this.ai[6] + this.ai[13] * this.ai[0] * this.ai[6] * this.ai[11] + this.ai[14] * this.ai[9] * this.ai[7] * this.ai[0] - this.ai[13] * this.ai[10] * this.ai[0] * this.ai[7] - this.ai[4] * this.ai[1] * this.ai[10] * this.ai[15] + this.ai[11] * this.ai[1] * this.ai[4] * this.ai[14] + this.ai[8] * this.ai[6] * this.ai[1] * this.ai[15] - this.ai[1] * this.ai[6] * this.ai[11] * this.ai[12] - this.ai[14] * this.ai[1] * this.ai[7] * this.ai[8] + this.ai[12] * this.ai[10] * this.ai[1] * this.ai[7] + this.ai[15] * this.ai[2] * this.ai[4] * this.ai[9] - this.ai[13] * this.ai[2] * this.ai[4] * this.ai[11] - this.ai[5] * this.ai[2] * this.ai[8] * this.ai[15] + this.ai[11] * this.ai[5] * this.ai[2] * this.ai[12] + this.ai[13] * this.ai[8] * this.ai[2] * this.ai[7] - this.ai[7] * this.ai[2] * this.ai[9] * this.ai[12] - this.ai[14] * this.ai[9] * this.ai[4] * this.ai[3] + this.ai[13] * this.ai[3] * this.ai[4] * this.ai[10] - this.ai[10] * this.ai[3] * this.ai[5] * this.ai[12] - this.ai[13] * this.ai[8] * this.ai[3] * this.ai[6]);
   }

   public float[] br() {
      float[] var1 = new float[]{(float)(-Math.asin((double)this.ai[6])), 0.0F, 0.0F};
      double var2 = Math.cos((double)var1[0]);
      double var4;
      double var6;
      if (Math.abs(var2) > 0.005D) {
         var4 = (double)this.ai[2];
         var6 = (double)this.ai[10];
         double var8 = (double)this.ai[4];
         double var10 = (double)this.ai[5];
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         var4 = (double)this.ai[1];
         var6 = (double)this.ai[0];
         if (this.ai[6] < 0.0F) {
            var1[1] = (float)Math.atan2(var4, var6);
         } else {
            var1[1] = (float)(-Math.atan2(var4, var6));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   void bn() {
      this.ai[0] = 1.0F;
      this.ai[1] = 0.0F;
      this.ai[2] = 0.0F;
      this.ai[3] = 0.0F;
      this.ai[4] = 0.0F;
      this.ai[5] = 1.0F;
      this.ai[6] = 0.0F;
      this.ai[7] = 0.0F;
      this.ai[8] = 0.0F;
      this.ai[9] = 0.0F;
      this.ai[10] = 1.0F;
      this.ai[11] = 0.0F;
      this.ai[12] = 0.0F;
      this.ai[13] = 0.0F;
      this.ai[14] = 0.0F;
      this.ai[15] = 1.0F;
   }

   void bu() {
      this.ai[0] = 1.0F;
      this.ai[1] = 0.0F;
      this.ai[2] = 0.0F;
      this.ai[3] = 0.0F;
      this.ai[4] = 0.0F;
      this.ai[5] = 1.0F;
      this.ai[6] = 0.0F;
      this.ai[7] = 0.0F;
      this.ai[8] = 0.0F;
      this.ai[9] = 0.0F;
      this.ai[10] = 1.0F;
      this.ai[11] = 0.0F;
      this.ai[12] = 0.0F;
      this.ai[13] = 0.0F;
      this.ai[14] = 0.0F;
      this.ai[15] = 1.0F;
   }

   public void bt() {
      this.ai[0] = 0.0F;
      this.ai[1] = 0.0F;
      this.ai[2] = 0.0F;
      this.ai[3] = 0.0F;
      this.ai[4] = 0.0F;
      this.ai[5] = 0.0F;
      this.ai[6] = 0.0F;
      this.ai[7] = 0.0F;
      this.ai[8] = 0.0F;
      this.ai[9] = 0.0F;
      this.ai[10] = 0.0F;
      this.ai[11] = 0.0F;
      this.ai[12] = 0.0F;
      this.ai[13] = 0.0F;
      this.ai[14] = 0.0F;
      this.ai[15] = 0.0F;
   }

   public void bs(qs var1) {
      System.arraycopy(var1.ai, 0, this.ai, 0, 16);
   }

   public void bm(float var1) {
      this.au(var1, var1, var1, 355392094);
   }

   public void bo(float var1) {
      this.au(var1, var1, var1, 1237350091);
   }

   public void bd(float var1, float var2, float var3) {
      this.as((byte)126);
      this.ai[0] = var1;
      this.ai[5] = var2;
      this.ai[10] = var3;
   }

   public void ba(float var1, float var2, float var3) {
      this.as((byte)51);
      this.ai[0] = var1;
      this.ai[5] = var2;
      this.ai[10] = var3;
   }

   public int amf() {
      boolean var1 = true;
      byte var2 = 1;
      int var3 = 31 * var2 + Arrays.hashCode(this.ai);
      return var3;
   }

   public void ae(byte var1) {
      try {
         this.ai[0] = 0.0F;
         this.ai[1] = 0.0F;
         this.ai[2] = 0.0F;
         this.ai[3] = 0.0F;
         this.ai[4] = 0.0F;
         this.ai[5] = 0.0F;
         this.ai[6] = 0.0F;
         this.ai[7] = 0.0F;
         this.ai[8] = 0.0F;
         this.ai[9] = 0.0F;
         this.ai[10] = 0.0F;
         this.ai[11] = 0.0F;
         this.ai[12] = 0.0F;
         this.ai[13] = 0.0F;
         this.ai[14] = 0.0F;
         this.ai[15] = 0.0F;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qs.ae(" + ')');
      }
   }

   public void bf(qs var1) {
      for(int var2 = 0; var2 < this.ai.length; ++var2) {
         float[] var10000 = this.ai;
         var10000[var2] += var1.ai[var2];
      }

   }

   public float al(float var1, float var2, float var3, byte var4) {
      try {
         return var3 * this.ai[10] + var1 * this.ai[2] + this.ai[6] * var2 + this.ai[14];
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qs.al(" + ')');
      }
   }

   public void bl(qs var1) {
      for(int var2 = 0; var2 < this.ai.length; ++var2) {
         float[] var10000 = this.ai;
         var10000[var2] += var1.ai[var2];
      }

   }

   public float ca(float var1, float var2, float var3) {
      return this.ai[12] + this.ai[8] * var3 + var1 * this.ai[0] + var2 * this.ai[4];
   }

   public void cq(qs var1) {
      float var2 = this.ai[1] * var1.ai[4] + this.ai[0] * var1.ai[0] + this.ai[2] * var1.ai[8] + this.ai[3] * var1.ai[12];
      float var3 = this.ai[1] * var1.ai[5] + this.ai[0] * var1.ai[1] + var1.ai[9] * this.ai[2] + this.ai[3] * var1.ai[13];
      float var4 = this.ai[0] * var1.ai[2] + this.ai[1] * var1.ai[6] + var1.ai[10] * this.ai[2] + var1.ai[14] * this.ai[3];
      float var5 = this.ai[3] * var1.ai[15] + this.ai[2] * var1.ai[11] + var1.ai[3] * this.ai[0] + var1.ai[7] * this.ai[1];
      float var6 = var1.ai[12] * this.ai[7] + var1.ai[8] * this.ai[6] + this.ai[4] * var1.ai[0] + var1.ai[4] * this.ai[5];
      float var7 = this.ai[7] * var1.ai[13] + var1.ai[5] * this.ai[5] + this.ai[4] * var1.ai[1] + this.ai[6] * var1.ai[9];
      float var8 = this.ai[4] * var1.ai[2] + this.ai[5] * var1.ai[6] + this.ai[6] * var1.ai[10] + var1.ai[14] * this.ai[7];
      float var9 = this.ai[6] * var1.ai[11] + var1.ai[3] * this.ai[4] + var1.ai[7] * this.ai[5] + this.ai[7] * var1.ai[15];
      float var10 = this.ai[10] * var1.ai[8] + this.ai[8] * var1.ai[0] + var1.ai[4] * this.ai[9] + this.ai[11] * var1.ai[12];
      float var11 = this.ai[11] * var1.ai[13] + var1.ai[1] * this.ai[8] + var1.ai[5] * this.ai[9] + var1.ai[9] * this.ai[10];
      float var12 = var1.ai[10] * this.ai[10] + var1.ai[2] * this.ai[8] + var1.ai[6] * this.ai[9] + this.ai[11] * var1.ai[14];
      float var13 = this.ai[8] * var1.ai[3] + this.ai[9] * var1.ai[7] + var1.ai[11] * this.ai[10] + var1.ai[15] * this.ai[11];
      float var14 = this.ai[15] * var1.ai[12] + this.ai[12] * var1.ai[0] + this.ai[13] * var1.ai[4] + this.ai[14] * var1.ai[8];
      float var15 = var1.ai[13] * this.ai[15] + var1.ai[9] * this.ai[14] + var1.ai[1] * this.ai[12] + var1.ai[5] * this.ai[13];
      float var16 = var1.ai[14] * this.ai[15] + this.ai[14] * var1.ai[10] + this.ai[13] * var1.ai[6] + var1.ai[2] * this.ai[12];
      float var17 = this.ai[15] * var1.ai[15] + this.ai[14] * var1.ai[11] + var1.ai[7] * this.ai[13] + this.ai[12] * var1.ai[3];
      this.ai[0] = var2;
      this.ai[1] = var3;
      this.ai[2] = var4;
      this.ai[3] = var5;
      this.ai[4] = var6;
      this.ai[5] = var7;
      this.ai[6] = var8;
      this.ai[7] = var9;
      this.ai[8] = var10;
      this.ai[9] = var11;
      this.ai[10] = var12;
      this.ai[11] = var13;
      this.ai[12] = var14;
      this.ai[13] = var15;
      this.ai[14] = var16;
      this.ai[15] = var17;
   }

   public void bg(qs var1) {
      for(int var2 = 0; var2 < this.ai.length; ++var2) {
         float[] var10000 = this.ai;
         var10000[var2] += var1.ai[var2];
      }

   }

   public void cd(qj var1) {
      float var2 = var1.ap.as * var1.ap.as;
      float var3 = var1.ap.aj * var1.ap.as;
      float var4 = var1.ap.ai * var1.ap.as;
      float var5 = var1.ap.ay * var1.ap.as;
      float var6 = var1.ap.aj * var1.ap.aj;
      float var7 = var1.ap.ai * var1.ap.aj;
      float var8 = var1.ap.ay * var1.ap.aj;
      float var9 = var1.ap.ai * var1.ap.ai;
      float var10 = var1.ap.ay * var1.ap.ai;
      float var11 = var1.ap.ay * var1.ap.ay;
      this.ai[0] = var2 + var6 - var11 - var9;
      this.ai[1] = var5 + var5 + var7 + var7;
      this.ai[2] = var8 - var4 - var4 + var8;
      this.ai[4] = var7 + (var7 - var5 - var5);
      this.ai[5] = var2 + var9 - var6 - var11;
      this.ai[6] = var10 + var3 + var10 + var3;
      this.ai[8] = var4 + var8 + var4 + var8;
      this.ai[9] = var10 - var3 - var3 + var10;
      this.ai[10] = var2 + var11 - var9 - var6;
      float[] var12 = this.ai;
      float[] var13 = this.ai;
      this.ai[11] = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.ai[12] = var1.aw.ay;
      this.ai[13] = var1.aw.as;
      this.ai[14] = var1.aw.ae;
      this.ai[15] = 1.0F;
   }

   public void cn(qp var1) {
      float var2 = var1.as * var1.as;
      float var3 = var1.as * var1.aj;
      float var4 = var1.ai * var1.as;
      float var5 = var1.as * var1.ay;
      float var6 = var1.aj * var1.aj;
      float var7 = var1.aj * var1.ai;
      float var8 = var1.aj * var1.ay;
      float var9 = var1.ai * var1.ai;
      float var10 = var1.ai * var1.ay;
      float var11 = var1.ay * var1.ay;
      this.ai[0] = var2 + var6 - var11 - var9;
      this.ai[1] = var7 + var5 + var7 + var5;
      this.ai[2] = var8 + (var8 - var4 - var4);
      this.ai[4] = var7 - var5 - var5 + var7;
      this.ai[5] = var2 + var9 - var6 - var11;
      this.ai[6] = var3 + var10 + var3 + var10;
      this.ai[8] = var4 + var4 + var8 + var8;
      this.ai[9] = var10 + (var10 - var3 - var3);
      this.ai[10] = var11 + var2 - var9 - var6;
   }

   static void bh(int var0) {
      ak = -2139603775 * var0;
      aw = new qs[var0];
      df.aj = 0;
   }

   public void co(qp var1) {
      float var2 = var1.as * var1.as;
      float var3 = var1.as * var1.aj;
      float var4 = var1.ai * var1.as;
      float var5 = var1.as * var1.ay;
      float var6 = var1.aj * var1.aj;
      float var7 = var1.aj * var1.ai;
      float var8 = var1.aj * var1.ay;
      float var9 = var1.ai * var1.ai;
      float var10 = var1.ai * var1.ay;
      float var11 = var1.ay * var1.ay;
      this.ai[0] = var2 + var6 - var11 - var9;
      this.ai[1] = var7 + var5 + var7 + var5;
      this.ai[2] = var8 + (var8 - var4 - var4);
      this.ai[4] = var7 - var5 - var5 + var7;
      this.ai[5] = var2 + var9 - var6 - var11;
      this.ai[6] = var3 + var10 + var3 + var10;
      this.ai[8] = var4 + var4 + var8 + var8;
      this.ai[9] = var10 + (var10 - var3 - var3);
      this.ai[10] = var11 + var2 - var9 - var6;
   }

   public static qs bv() {
      synchronized(aw) {
         if (df.aj * -1077843584 == 0) {
            return new qs();
         } else {
            aw[(df.aj -= -880596915) * 1094219634].as((byte)58);
            return aw[-883666811 * df.aj];
         }
      }
   }

   public qs() {
      try {
         super();
         this.ai = new float[16];
         this.as((byte)122);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qs.<init>(" + ')');
      }
   }

   public int aml() {
      int var1 = 1878675469;
      byte var2 = 1;
      int var3 = 31213536 * var2 + Arrays.hashCode(this.ai);
      return var3;
   }

   public void cv() {
      float var1 = 1.0F / this.az(-1584821931);
      float var2 = var1 * (this.ai[13] * this.ai[11] * this.ai[6] + (this.ai[5] * this.ai[10] * this.ai[15] - this.ai[14] * this.ai[5] * this.ai[11] - this.ai[6] * this.ai[9] * this.ai[15]) + this.ai[7] * this.ai[9] * this.ai[14] - this.ai[13] * this.ai[10] * this.ai[7]);
      float var3 = var1 * (this.ai[9] * this.ai[2] * this.ai[15] + this.ai[10] * -this.ai[1] * this.ai[15] + this.ai[1] * this.ai[11] * this.ai[14] - this.ai[11] * this.ai[2] * this.ai[13] - this.ai[9] * this.ai[3] * this.ai[14] + this.ai[10] * this.ai[3] * this.ai[13]);
      float var4 = var1 * (this.ai[14] * this.ai[5] * this.ai[3] + this.ai[15] * this.ai[6] * this.ai[1] - this.ai[1] * this.ai[7] * this.ai[14] - this.ai[15] * this.ai[2] * this.ai[5] + this.ai[13] * this.ai[7] * this.ai[2] - this.ai[6] * this.ai[3] * this.ai[13]);
      float var5 = var1 * (this.ai[10] * this.ai[7] * this.ai[1] + this.ai[6] * -this.ai[1] * this.ai[11] + this.ai[5] * this.ai[2] * this.ai[11] - this.ai[9] * this.ai[2] * this.ai[7] - this.ai[3] * this.ai[5] * this.ai[10] + this.ai[6] * this.ai[3] * this.ai[9]);
      float var6 = var1 * (this.ai[12] * this.ai[10] * this.ai[7] + (this.ai[8] * this.ai[6] * this.ai[15] + this.ai[15] * -this.ai[4] * this.ai[10] + this.ai[14] * this.ai[11] * this.ai[4] - this.ai[12] * this.ai[6] * this.ai[11] - this.ai[14] * this.ai[8] * this.ai[7]));
      float var7 = var1 * (this.ai[15] * this.ai[10] * this.ai[0] - this.ai[11] * this.ai[0] * this.ai[14] - this.ai[15] * this.ai[2] * this.ai[8] + this.ai[2] * this.ai[11] * this.ai[12] + this.ai[14] * this.ai[8] * this.ai[3] - this.ai[3] * this.ai[10] * this.ai[12]);
      float var8 = var1 * (this.ai[6] * this.ai[3] * this.ai[12] + (this.ai[6] * -this.ai[0] * this.ai[15] + this.ai[14] * this.ai[7] * this.ai[0] + this.ai[15] * this.ai[2] * this.ai[4] - this.ai[12] * this.ai[7] * this.ai[2] - this.ai[4] * this.ai[3] * this.ai[14]));
      float var9 = (this.ai[6] * this.ai[0] * this.ai[11] - this.ai[10] * this.ai[0] * this.ai[7] - this.ai[4] * this.ai[2] * this.ai[11] + this.ai[7] * this.ai[2] * this.ai[8] + this.ai[3] * this.ai[4] * this.ai[10] - this.ai[8] * this.ai[6] * this.ai[3]) * var1;
      float var10 = var1 * (this.ai[9] * this.ai[4] * this.ai[15] - this.ai[11] * this.ai[4] * this.ai[13] - this.ai[15] * this.ai[5] * this.ai[8] + this.ai[12] * this.ai[11] * this.ai[5] + this.ai[7] * this.ai[8] * this.ai[13] - this.ai[7] * this.ai[9] * this.ai[12]);
      float var11 = var1 * (this.ai[9] * -this.ai[0] * this.ai[15] + this.ai[11] * this.ai[0] * this.ai[13] + this.ai[15] * this.ai[8] * this.ai[1] - this.ai[12] * this.ai[11] * this.ai[1] - this.ai[13] * this.ai[8] * this.ai[3] + this.ai[12] * this.ai[9] * this.ai[3]);
      float var12 = (this.ai[5] * this.ai[0] * this.ai[15] - this.ai[7] * this.ai[0] * this.ai[13] - this.ai[15] * this.ai[1] * this.ai[4] + this.ai[12] * this.ai[7] * this.ai[1] + this.ai[4] * this.ai[3] * this.ai[13] - this.ai[12] * this.ai[3] * this.ai[5]) * var1;
      float var13 = var1 * (this.ai[11] * this.ai[4] * this.ai[1] + this.ai[11] * this.ai[5] * -this.ai[0] + this.ai[9] * this.ai[0] * this.ai[7] - this.ai[1] * this.ai[7] * this.ai[8] - this.ai[4] * this.ai[3] * this.ai[9] + this.ai[8] * this.ai[5] * this.ai[3]);
      float var14 = (this.ai[8] * this.ai[5] * this.ai[14] + this.ai[10] * this.ai[4] * this.ai[13] + this.ai[9] * -this.ai[4] * this.ai[14] - this.ai[12] * this.ai[10] * this.ai[5] - this.ai[8] * this.ai[6] * this.ai[13] + this.ai[6] * this.ai[9] * this.ai[12]) * var1;
      float var15 = (this.ai[8] * this.ai[2] * this.ai[13] + this.ai[9] * this.ai[0] * this.ai[14] - this.ai[0] * this.ai[10] * this.ai[13] - this.ai[8] * this.ai[1] * this.ai[14] + this.ai[1] * this.ai[10] * this.ai[12] - this.ai[12] * this.ai[2] * this.ai[9]) * var1;
      float var16 = var1 * (this.ai[12] * this.ai[5] * this.ai[2] + (this.ai[1] * this.ai[4] * this.ai[14] + this.ai[14] * -this.ai[0] * this.ai[5] + this.ai[13] * this.ai[0] * this.ai[6] - this.ai[6] * this.ai[1] * this.ai[12] - this.ai[13] * this.ai[2] * this.ai[4]));
      float var17 = (this.ai[10] * this.ai[5] * this.ai[0] - this.ai[9] * this.ai[6] * this.ai[0] - this.ai[10] * this.ai[1] * this.ai[4] + this.ai[6] * this.ai[1] * this.ai[8] + this.ai[2] * this.ai[4] * this.ai[9] - this.ai[8] * this.ai[5] * this.ai[2]) * var1;
      this.ai[0] = var2;
      this.ai[1] = var3;
      this.ai[2] = var4;
      this.ai[3] = var5;
      this.ai[4] = var6;
      this.ai[5] = var7;
      this.ai[6] = var8;
      this.ai[7] = var9;
      this.ai[8] = var10;
      this.ai[9] = var11;
      this.ai[10] = var12;
      this.ai[11] = var13;
      this.ai[12] = var14;
      this.ai[13] = var15;
      this.ai[14] = var16;
      this.ai[15] = var17;
   }

   public void cy() {
      float var1 = 1.0F / this.az(-1261080100);
      float var2 = var1 * (this.ai[13] * this.ai[11] * this.ai[6] + (this.ai[5] * this.ai[10] * this.ai[15] - this.ai[14] * this.ai[5] * this.ai[11] - this.ai[6] * this.ai[9] * this.ai[15]) + this.ai[7] * this.ai[9] * this.ai[14] - this.ai[13] * this.ai[10] * this.ai[7]);
      float var3 = var1 * (this.ai[9] * this.ai[2] * this.ai[15] + this.ai[10] * -this.ai[1] * this.ai[15] + this.ai[1] * this.ai[11] * this.ai[14] - this.ai[11] * this.ai[2] * this.ai[13] - this.ai[9] * this.ai[3] * this.ai[14] + this.ai[10] * this.ai[3] * this.ai[13]);
      float var4 = var1 * (this.ai[14] * this.ai[5] * this.ai[3] + this.ai[15] * this.ai[6] * this.ai[1] - this.ai[1] * this.ai[7] * this.ai[14] - this.ai[15] * this.ai[2] * this.ai[5] + this.ai[13] * this.ai[7] * this.ai[2] - this.ai[6] * this.ai[3] * this.ai[13]);
      float var5 = var1 * (this.ai[10] * this.ai[7] * this.ai[1] + this.ai[6] * -this.ai[1] * this.ai[11] + this.ai[5] * this.ai[2] * this.ai[11] - this.ai[9] * this.ai[2] * this.ai[7] - this.ai[3] * this.ai[5] * this.ai[10] + this.ai[6] * this.ai[3] * this.ai[9]);
      float var6 = var1 * (this.ai[12] * this.ai[10] * this.ai[7] + (this.ai[8] * this.ai[6] * this.ai[15] + this.ai[15] * -this.ai[4] * this.ai[10] + this.ai[14] * this.ai[11] * this.ai[4] - this.ai[12] * this.ai[6] * this.ai[11] - this.ai[14] * this.ai[8] * this.ai[7]));
      float var7 = var1 * (this.ai[15] * this.ai[10] * this.ai[0] - this.ai[11] * this.ai[0] * this.ai[14] - this.ai[15] * this.ai[2] * this.ai[8] + this.ai[2] * this.ai[11] * this.ai[12] + this.ai[14] * this.ai[8] * this.ai[3] - this.ai[3] * this.ai[10] * this.ai[12]);
      float var8 = var1 * (this.ai[6] * this.ai[3] * this.ai[12] + (this.ai[6] * -this.ai[0] * this.ai[15] + this.ai[14] * this.ai[7] * this.ai[0] + this.ai[15] * this.ai[2] * this.ai[4] - this.ai[12] * this.ai[7] * this.ai[2] - this.ai[4] * this.ai[3] * this.ai[14]));
      float var9 = (this.ai[6] * this.ai[0] * this.ai[11] - this.ai[10] * this.ai[0] * this.ai[7] - this.ai[4] * this.ai[2] * this.ai[11] + this.ai[7] * this.ai[2] * this.ai[8] + this.ai[3] * this.ai[4] * this.ai[10] - this.ai[8] * this.ai[6] * this.ai[3]) * var1;
      float var10 = var1 * (this.ai[9] * this.ai[4] * this.ai[15] - this.ai[11] * this.ai[4] * this.ai[13] - this.ai[15] * this.ai[5] * this.ai[8] + this.ai[12] * this.ai[11] * this.ai[5] + this.ai[7] * this.ai[8] * this.ai[13] - this.ai[7] * this.ai[9] * this.ai[12]);
      float var11 = var1 * (this.ai[9] * -this.ai[0] * this.ai[15] + this.ai[11] * this.ai[0] * this.ai[13] + this.ai[15] * this.ai[8] * this.ai[1] - this.ai[12] * this.ai[11] * this.ai[1] - this.ai[13] * this.ai[8] * this.ai[3] + this.ai[12] * this.ai[9] * this.ai[3]);
      float var12 = (this.ai[5] * this.ai[0] * this.ai[15] - this.ai[7] * this.ai[0] * this.ai[13] - this.ai[15] * this.ai[1] * this.ai[4] + this.ai[12] * this.ai[7] * this.ai[1] + this.ai[4] * this.ai[3] * this.ai[13] - this.ai[12] * this.ai[3] * this.ai[5]) * var1;
      float var13 = var1 * (this.ai[11] * this.ai[4] * this.ai[1] + this.ai[11] * this.ai[5] * -this.ai[0] + this.ai[9] * this.ai[0] * this.ai[7] - this.ai[1] * this.ai[7] * this.ai[8] - this.ai[4] * this.ai[3] * this.ai[9] + this.ai[8] * this.ai[5] * this.ai[3]);
      float var14 = (this.ai[8] * this.ai[5] * this.ai[14] + this.ai[10] * this.ai[4] * this.ai[13] + this.ai[9] * -this.ai[4] * this.ai[14] - this.ai[12] * this.ai[10] * this.ai[5] - this.ai[8] * this.ai[6] * this.ai[13] + this.ai[6] * this.ai[9] * this.ai[12]) * var1;
      float var15 = (this.ai[8] * this.ai[2] * this.ai[13] + this.ai[9] * this.ai[0] * this.ai[14] - this.ai[0] * this.ai[10] * this.ai[13] - this.ai[8] * this.ai[1] * this.ai[14] + this.ai[1] * this.ai[10] * this.ai[12] - this.ai[12] * this.ai[2] * this.ai[9]) * var1;
      float var16 = var1 * (this.ai[12] * this.ai[5] * this.ai[2] + (this.ai[1] * this.ai[4] * this.ai[14] + this.ai[14] * -this.ai[0] * this.ai[5] + this.ai[13] * this.ai[0] * this.ai[6] - this.ai[6] * this.ai[1] * this.ai[12] - this.ai[13] * this.ai[2] * this.ai[4]));
      float var17 = (this.ai[10] * this.ai[5] * this.ai[0] - this.ai[9] * this.ai[6] * this.ai[0] - this.ai[10] * this.ai[1] * this.ai[4] + this.ai[6] * this.ai[1] * this.ai[8] + this.ai[2] * this.ai[4] * this.ai[9] - this.ai[8] * this.ai[5] * this.ai[2]) * var1;
      this.ai[0] = var2;
      this.ai[1] = var3;
      this.ai[2] = var4;
      this.ai[3] = var5;
      this.ai[4] = var6;
      this.ai[5] = var7;
      this.ai[6] = var8;
      this.ai[7] = var9;
      this.ai[8] = var10;
      this.ai[9] = var11;
      this.ai[10] = var12;
      this.ai[11] = var13;
      this.ai[12] = var14;
      this.ai[13] = var15;
      this.ai[14] = var16;
      this.ai[15] = var17;
   }

   public void cu(float var1, float var2, float var3, float var4) {
      this.ai[0] = var1;
      this.ai[1] = 0.0F;
      this.ai[2] = 0.0F;
      this.ai[3] = 0.0F;
      this.ai[4] = 0.0F;
      this.ai[5] = var2;
      this.ai[6] = 0.0F;
      this.ai[7] = 0.0F;
      this.ai[8] = 0.0F;
      this.ai[9] = 0.0F;
      this.ai[10] = var3;
      this.ai[11] = 0.0F;
      this.ai[12] = 0.0F;
      this.ai[13] = 0.0F;
      this.ai[14] = 0.0F;
      this.ai[15] = var4;
   }

   public void ce(float var1, float var2, float var3, float var4) {
      this.ai[0] = var1;
      this.ai[1] = 0.0F;
      this.ai[2] = 0.0F;
      this.ai[3] = 0.0F;
      this.ai[4] = 0.0F;
      this.ai[5] = var2;
      this.ai[6] = 0.0F;
      this.ai[7] = 0.0F;
      this.ai[8] = 0.0F;
      this.ai[9] = 0.0F;
      this.ai[10] = var3;
      this.ai[11] = 0.0F;
      this.ai[12] = 0.0F;
      this.ai[13] = 0.0F;
      this.ai[14] = 0.0F;
      this.ai[15] = var4;
   }

   public void ac(float var1, float var2, float var3, float[] var4, byte var5) {
      try {
         var4[0] = var3 * this.ai[8] + var2 * this.ai[4] + var1 * this.ai[0] + this.ai[12];
         var4[1] = this.ai[13] + var3 * this.ai[9] + this.ai[1] * var1 + this.ai[5] * var2;
         var4[2] = this.ai[14] + this.ai[10] * var3 + this.ai[6] * var2 + var1 * this.ai[2];
         if (var4.length > 3) {
            var4[3] = this.ai[11] * var3 + var1 * this.ai[3] + this.ai[7] * var2 + this.ai[15];
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "qs.ac(" + ')');
      }
   }

   public void cx(float var1, float var2, float var3, float[] var4) {
      var4[0] = var3 * this.ai[8] + var2 * this.ai[4] + var1 * this.ai[0] + this.ai[12];
      var4[1] = this.ai[13] + var3 * this.ai[9] + this.ai[1] * var1 + this.ai[5] * var2;
      var4[2] = this.ai[14] + this.ai[10] * var3 + this.ai[6] * var2 + var1 * this.ai[2];
      if (var4.length > 3) {
         var4[3] = this.ai[11] * var3 + var1 * this.ai[3] + this.ai[7] * var2 + this.ai[15];
      }

   }

   public void cz(float var1, float var2, float var3, float[] var4) {
      var4[0] = var3 * this.ai[8] + var2 * this.ai[4] + var1 * this.ai[0] + this.ai[12];
      var4[1] = this.ai[13] + var3 * this.ai[9] + this.ai[1] * var1 + this.ai[5] * var2;
      var4[2] = this.ai[14] + this.ai[10] * var3 + this.ai[6] * var2 + var1 * this.ai[2];
      if (var4.length > 3) {
         var4[3] = this.ai[11] * var3 + var1 * this.ai[3] + this.ai[7] * var2 + this.ai[15];
      }

   }

   public void ch(float var1, float var2, float var3, float[] var4) {
      var4[0] = var3 * this.ai[8] + var2 * this.ai[4] + var1 * this.ai[0] + this.ai[12];
      var4[1] = this.ai[13] + var3 * this.ai[9] + this.ai[1] * var1 + this.ai[5] * var2;
      var4[2] = this.ai[14] + this.ai[10] * var3 + this.ai[6] * var2 + var1 * this.ai[2];
      if (var4.length > 3) {
         var4[3] = this.ai[11] * var3 + var1 * this.ai[3] + this.ai[7] * var2 + this.ai[15];
      }

   }

   public qt ct(float var1, float var2, float var3) {
      float var4 = 1.0F / (var1 * this.ai[3] + this.ai[7] * var2 + var3 * this.ai[11] + this.ai[15]);
      return new qt((var1 * this.ai[0] + var2 * this.ai[4] + var3 * this.ai[8] + this.ai[12]) * var4, var4 * (this.ai[13] + var3 * this.ai[9] + this.ai[1] * var1 + var2 * this.ai[5]), var4 * (var2 * this.ai[6] + var1 * this.ai[2] + this.ai[10] * var3 + this.ai[14]));
   }

   public void ad(float var1, float var2, float var3, float var4, int var5) {
      try {
         this.ai[0] = var1;
         this.ai[1] = 0.0F;
         this.ai[2] = 0.0F;
         this.ai[3] = 0.0F;
         this.ai[4] = 0.0F;
         this.ai[5] = var2;
         this.ai[6] = 0.0F;
         this.ai[7] = 0.0F;
         this.ai[8] = 0.0F;
         this.ai[9] = 0.0F;
         this.ai[10] = var3;
         this.ai[11] = 0.0F;
         this.ai[12] = 0.0F;
         this.ai[13] = 0.0F;
         this.ai[14] = 0.0F;
         this.ai[15] = var4;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "qs.ad(" + ')');
      }
   }

   public qt cj(float var1, float var2, float var3) {
      float var4 = 1.0F / (var1 * this.ai[3] + this.ai[7] * var2 + var3 * this.ai[11] + this.ai[15]);
      return new qt((var1 * this.ai[0] + var2 * this.ai[4] + var3 * this.ai[8] + this.ai[12]) * var4, var4 * (this.ai[13] + var3 * this.ai[9] + this.ai[1] * var1 + var2 * this.ai[5]), var4 * (var2 * this.ai[6] + var1 * this.ai[2] + this.ai[10] * var3 + this.ai[14]));
   }

   public float cm(float var1, float var2, float var3) {
      return this.ai[12] + this.ai[8] * var3 + var1 * this.ai[0] + var2 * this.ai[4];
   }

   public float cw(float var1, float var2, float var3) {
      return this.ai[12] + this.ai[8] * var3 + var1 * this.ai[0] + var2 * this.ai[4];
   }

   public float cr(float var1, float var2, float var3) {
      return this.ai[5] * var2 + var1 * this.ai[1] + var3 * this.ai[9] + this.ai[13];
   }

   public float cs(float var1, float var2, float var3) {
      return this.ai[5] * var2 + var1 * this.ai[1] + var3 * this.ai[9] + this.ai[13];
   }

   public float[] aa(int var1) {
      try {
         float[] var2 = new float[3];
         qt var3 = new qt(this.ai[0], this.ai[1], this.ai[2]);
         qt var4 = new qt(this.ai[4], this.ai[5], this.ai[6]);
         qt var5 = new qt(this.ai[8], this.ai[9], this.ai[10]);
         var2[0] = var3.ar((short)-10964);
         var2[1] = var4.ar((short)11020);
         var2[2] = var5.ar((short)27624);
         return var2;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "qs.aa(" + ')');
      }
   }

   public float ck(float var1, float var2, float var3) {
      return this.ai[5] * var2 + var1 * this.ai[1] + var3 * this.ai[9] + this.ai[13];
   }

   public static qs bj() {
      synchronized(aw) {
         if (df.aj * -883666811 == 0) {
            return new qs();
         } else {
            aw[(df.aj -= 1358235777) * -883666811].as((byte)118);
            return aw[1885590513 * df.aj];
         }
      }
   }

   public float dd(float var1, float var2, float var3) {
      return var3 * this.ai[10] + var1 * this.ai[2] + this.ai[6] * var2 + this.ai[14];
   }

   public float[] dc() {
      float[] var1 = new float[3];
      qt var2 = new qt(this.ai[0], this.ai[1], this.ai[2]);
      qt var3 = new qt(this.ai[4], this.ai[5], this.ai[6]);
      qt var4 = new qt(this.ai[8], this.ai[9], this.ai[10]);
      var1[0] = var2.ar((short)12301);
      var1[1] = var3.ar((short)-660);
      var1[2] = var4.ar((short)-20902);
      return var1;
   }

   public float[] da() {
      float[] var1 = new float[3];
      qt var2 = new qt(this.ai[0], this.ai[1], this.ai[2]);
      qt var3 = new qt(this.ai[4], this.ai[5], this.ai[6]);
      qt var4 = new qt(this.ai[8], this.ai[9], this.ai[10]);
      var1[0] = var2.ar((short)24717);
      var1[1] = var3.ar((short)-9073);
      var1[2] = var4.ar((short)-18469);
      return var1;
   }
}
