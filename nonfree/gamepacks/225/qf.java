import java.util.Arrays;

public final class qf {
   public static final qf aq;
   static qf[] ae = new qf[0];
   static int ag;
   static vt ab;
   public float[] ax;
   static int am;
   static final float ac = 1.0E-4F;
   static final int al = 5;

   public void bo(float var1) {
      this.al(var1, var1, var1, 1367488167);
   }

   public void ag(int var1) {
      try {
         synchronized(ae) {
            if (378295407 * am < -661875089 * ag - 1) {
               if (var1 <= 274869123) {
                  return;
               }

               ae[(am += -436761969) * 378295407 - 1] = this;
            }

         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qf.ag(" + ')');
      }
   }

   void bs(vf var1, boolean var2) {
      if (var2) {
         qx var3 = new qx();
         var3.ae(no.ac(var1.cq(1417712808), (short)10492), (byte)-79);
         var3.ag(no.ac(var1.cq(-402572582), (short)1558), -640271193);
         var3.am(no.ac(var1.cq(-1607502894), (short)21778), (byte)-61);
         var3.ax((float)var1.cq(-305496236), (float)var1.cq(-1667864081), (float)var1.cq(-1198594980), -192405633);
         this.az(var3, 209180024);
      } else {
         for(int var4 = 0; var4 < 16; ++var4) {
            this.ax[var4] = var1.cr(-1935627220);
         }
      }

   }

   public qf(vf var1, boolean var2) {
      try {
         super();
         this.ax = new float[16];
         this.am(var1, var2, -1353906288);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qf.<init>(" + ')');
      }
   }

   void am(vf var1, boolean var2, int var3) {
      try {
         if (var2) {
            qx var4 = new qx();
            var4.ae(no.ac(var1.cq(-965049714), (short)10147), (byte)-50);
            var4.ag(no.ac(var1.cq(1410310317), (short)28275), 573597433);
            var4.am(no.ac(var1.cq(-285792306), (short)7373), (byte)-1);
            var4.ax((float)var1.cq(20628564), (float)var1.cq(-399787242), (float)var1.cq(-472674809), -192405633);
            this.az(var4, -2052722525);
         } else {
            for(int var6 = 0; var6 < 16; ++var6) {
               if (var3 == -1886162205) {
                  throw new IllegalStateException();
               }

               this.ax[var6] = var1.cr(-1935627220);
            }
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qf.am(" + ')');
      }
   }

   float[] ax(byte var1) {
      try {
         float[] var2 = new float[3];
         if ((double)this.ax[2] < 0.999D && (double)this.ax[2] > -0.999D) {
            if (var1 != 9) {
               throw new IllegalStateException();
            }

            var2[1] = (float)(-Math.asin((double)this.ax[2]));
            double var3 = Math.cos((double)var2[1]);
            var2[0] = (float)Math.atan2((double)this.ax[6] / var3, (double)this.ax[10] / var3);
            var2[2] = (float)Math.atan2((double)this.ax[1] / var3, (double)this.ax[0] / var3);
         } else {
            var2[0] = 0.0F;
            var2[1] = (float)Math.atan2((double)this.ax[2], 0.0D);
            var2[2] = (float)Math.atan2((double)(-this.ax[9]), (double)this.ax[5]);
         }

         return var2;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qf.ax(" + ')');
      }
   }

   public float[] aq(byte var1) {
      try {
         float[] var2 = new float[]{(float)(-Math.asin((double)this.ax[6])), 0.0F, 0.0F};
         double var3 = Math.cos((double)var2[0]);
         double var5;
         double var7;
         if (Math.abs(var3) > 0.005D) {
            if (var1 == 64) {
               throw new IllegalStateException();
            }

            var5 = (double)this.ax[2];
            var7 = (double)this.ax[10];
            double var9 = (double)this.ax[4];
            double var11 = (double)this.ax[5];
            var2[1] = (float)Math.atan2(var5, var7);
            var2[2] = (float)Math.atan2(var9, var11);
         } else {
            var5 = (double)this.ax[1];
            var7 = (double)this.ax[0];
            if (this.ax[6] < 0.0F) {
               if (var1 == 64) {
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
         throw vk.ae(var13, "qf.aq(" + ')');
      }
   }

   void af(short var1) {
      try {
         this.ax[0] = 1.0F;
         this.ax[1] = 0.0F;
         this.ax[2] = 0.0F;
         this.ax[3] = 0.0F;
         this.ax[4] = 0.0F;
         this.ax[5] = 1.0F;
         this.ax[6] = 0.0F;
         this.ax[7] = 0.0F;
         this.ax[8] = 0.0F;
         this.ax[9] = 0.0F;
         this.ax[10] = 1.0F;
         this.ax[11] = 0.0F;
         this.ax[12] = 0.0F;
         this.ax[13] = 0.0F;
         this.ax[14] = 0.0F;
         this.ax[15] = 1.0F;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qf.af(" + ')');
      }
   }

   public void at(byte var1) {
      try {
         this.ax[0] = 0.0F;
         this.ax[1] = 0.0F;
         this.ax[2] = 0.0F;
         this.ax[3] = 0.0F;
         this.ax[4] = 0.0F;
         this.ax[5] = 0.0F;
         this.ax[6] = 0.0F;
         this.ax[7] = 0.0F;
         this.ax[8] = 0.0F;
         this.ax[9] = 0.0F;
         this.ax[10] = 0.0F;
         this.ax[11] = 0.0F;
         this.ax[12] = 0.0F;
         this.ax[13] = 0.0F;
         this.ax[14] = 0.0F;
         this.ax[15] = 0.0F;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qf.at(" + ')');
      }
   }

   public void au(qf var1, int var2) {
      try {
         System.arraycopy(var1.ax, 0, this.ax, 0, 16);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qf.au(" + ')');
      }
   }

   static {
      if.ac(100, (byte)115);
      aq = new qf();
   }

   public void al(float var1, float var2, float var3, int var4) {
      try {
         this.af((short)17217);
         this.ax[0] = var1;
         this.ax[5] = var2;
         this.ax[10] = var3;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qf.al(" + ')');
      }
   }

   public boolean gn(Object var1) {
      if (!(var1 instanceof qf)) {
         return false;
      } else {
         qf var2 = (qf)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (this.ax[var3] != var2.ax[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public void ah(qf var1, int var2) {
      try {
         float var3 = var1.ax[4] * this.ax[1] + this.ax[0] * var1.ax[0] + var1.ax[8] * this.ax[2] + this.ax[3] * var1.ax[12];
         float var4 = var1.ax[13] * this.ax[3] + this.ax[1] * var1.ax[5] + var1.ax[1] * this.ax[0] + var1.ax[9] * this.ax[2];
         float var5 = var1.ax[6] * this.ax[1] + var1.ax[2] * this.ax[0] + var1.ax[10] * this.ax[2] + this.ax[3] * var1.ax[14];
         float var6 = this.ax[0] * var1.ax[3] + var1.ax[7] * this.ax[1] + var1.ax[11] * this.ax[2] + this.ax[3] * var1.ax[15];
         float var7 = var1.ax[8] * this.ax[6] + this.ax[5] * var1.ax[4] + this.ax[4] * var1.ax[0] + this.ax[7] * var1.ax[12];
         float var8 = var1.ax[13] * this.ax[7] + var1.ax[9] * this.ax[6] + this.ax[5] * var1.ax[5] + var1.ax[1] * this.ax[4];
         float var9 = this.ax[7] * var1.ax[14] + var1.ax[6] * this.ax[5] + this.ax[4] * var1.ax[2] + var1.ax[10] * this.ax[6];
         float var10 = var1.ax[3] * this.ax[4] + this.ax[5] * var1.ax[7] + this.ax[6] * var1.ax[11] + var1.ax[15] * this.ax[7];
         float var11 = this.ax[11] * var1.ax[12] + this.ax[8] * var1.ax[0] + this.ax[9] * var1.ax[4] + this.ax[10] * var1.ax[8];
         float var12 = this.ax[10] * var1.ax[9] + var1.ax[1] * this.ax[8] + this.ax[9] * var1.ax[5] + this.ax[11] * var1.ax[13];
         float var13 = this.ax[10] * var1.ax[10] + this.ax[8] * var1.ax[2] + var1.ax[6] * this.ax[9] + this.ax[11] * var1.ax[14];
         float var14 = this.ax[9] * var1.ax[7] + this.ax[8] * var1.ax[3] + this.ax[10] * var1.ax[11] + var1.ax[15] * this.ax[11];
         float var15 = var1.ax[8] * this.ax[14] + this.ax[12] * var1.ax[0] + this.ax[13] * var1.ax[4] + this.ax[15] * var1.ax[12];
         float var16 = var1.ax[13] * this.ax[15] + this.ax[12] * var1.ax[1] + this.ax[13] * var1.ax[5] + this.ax[14] * var1.ax[9];
         float var17 = var1.ax[14] * this.ax[15] + var1.ax[10] * this.ax[14] + this.ax[12] * var1.ax[2] + var1.ax[6] * this.ax[13];
         float var18 = var1.ax[15] * this.ax[15] + var1.ax[11] * this.ax[14] + var1.ax[7] * this.ax[13] + var1.ax[3] * this.ax[12];
         this.ax[0] = var3;
         this.ax[1] = var4;
         this.ax[2] = var5;
         this.ax[3] = var6;
         this.ax[4] = var7;
         this.ax[5] = var8;
         this.ax[6] = var9;
         this.ax[7] = var10;
         this.ax[8] = var11;
         this.ax[9] = var12;
         this.ax[10] = var13;
         this.ax[11] = var14;
         this.ax[12] = var15;
         this.ax[13] = var16;
         this.ax[14] = var17;
         this.ax[15] = var18;
      } catch (RuntimeException var19) {
         throw vk.ae(var19, "qf.ah(" + ')');
      }
   }

   public void ap(qh var1, int var2) {
      try {
         float var3 = var1.ac.af * var1.ac.af;
         float var4 = var1.ac.af * var1.ac.am;
         float var5 = var1.ac.ax * var1.ac.af;
         float var6 = var1.ac.aq * var1.ac.af;
         float var7 = var1.ac.am * var1.ac.am;
         float var8 = var1.ac.ax * var1.ac.am;
         float var9 = var1.ac.aq * var1.ac.am;
         float var10 = var1.ac.ax * var1.ac.ax;
         float var11 = var1.ac.ax * var1.ac.aq;
         float var12 = var1.ac.aq * var1.ac.aq;
         this.ax[0] = var3 + var7 - var12 - var10;
         this.ax[1] = var8 + var6 + var8 + var6;
         this.ax[2] = var9 + (var9 - var5 - var5);
         this.ax[4] = var8 - var6 - var6 + var8;
         this.ax[5] = var10 + var3 - var7 - var12;
         this.ax[6] = var11 + var4 + var11 + var4;
         this.ax[8] = var9 + var9 + var5 + var5;
         this.ax[9] = var11 + (var11 - var4 - var4);
         this.ax[10] = var12 + var3 - var10 - var7;
         float[] var13 = this.ax;
         float[] var14 = this.ax;
         this.ax[11] = 0.0F;
         var14[7] = 0.0F;
         var13[3] = 0.0F;
         this.ax[12] = var1.ae.am;
         this.ax[13] = var1.ae.ax;
         this.ax[14] = var1.ae.aq;
         this.ax[15] = 1.0F;
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "qf.ap(" + ')');
      }
   }

   public void ab(qd var1, int var2) {
      try {
         float var3 = var1.af * var1.af;
         float var4 = var1.am * var1.af;
         float var5 = var1.af * var1.ax;
         float var6 = var1.af * var1.aq;
         float var7 = var1.am * var1.am;
         float var8 = var1.am * var1.ax;
         float var9 = var1.aq * var1.am;
         float var10 = var1.ax * var1.ax;
         float var11 = var1.ax * var1.aq;
         float var12 = var1.aq * var1.aq;
         this.ax[0] = var3 + var7 - var12 - var10;
         this.ax[1] = var6 + var8 + var8 + var6;
         this.ax[2] = var9 + (var9 - var5 - var5);
         this.ax[4] = var8 + (var8 - var6 - var6);
         this.ax[5] = var10 + var3 - var7 - var12;
         this.ax[6] = var4 + var11 + var11 + var4;
         this.ax[8] = var9 + var5 + var9 + var5;
         this.ax[9] = var11 - var4 - var4 + var11;
         this.ax[10] = var12 + var3 - var10 - var7;
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "qf.ab(" + ')');
      }
   }

   public String toString() {
      try {
         StringBuilder var1 = new StringBuilder();
         this.aq((byte)1);
         this.ax((byte)9);

         for(int var2 = 0; var2 < 4; ++var2) {
            for(int var3 = 0; var3 < 4; ++var3) {
               if (var3 > 0) {
                  var1.append("\t");
               }

               float var4 = this.ax[4 * var2 + var3];
               if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
                  var4 = 0.0F;
               }

               var1.append(var4);
            }

            var1.append("\n");
         }

         return var1.toString();
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qf.toString(" + ')');
      }
   }

   public float ca(float var1, float var2, float var3) {
      return this.ax[8] * var3 + this.ax[4] * var2 + var1 * this.ax[0] + this.ax[12];
   }

   public void ai(byte var1) {
      try {
         float var2 = 1.0F / this.aa(-141188009);
         float var3 = (this.ax[15] * this.ax[10] * this.ax[5] - this.ax[11] * this.ax[5] * this.ax[14] - this.ax[6] * this.ax[9] * this.ax[15] + this.ax[6] * this.ax[11] * this.ax[13] + this.ax[14] * this.ax[9] * this.ax[7] - this.ax[10] * this.ax[7] * this.ax[13]) * var2;
         float var4 = var2 * (this.ax[10] * this.ax[3] * this.ax[13] + (this.ax[1] * this.ax[11] * this.ax[14] + this.ax[10] * -this.ax[1] * this.ax[15] + this.ax[15] * this.ax[2] * this.ax[9] - this.ax[13] * this.ax[11] * this.ax[2] - this.ax[14] * this.ax[9] * this.ax[3]));
         float var5 = (this.ax[2] * this.ax[7] * this.ax[13] + (this.ax[6] * this.ax[1] * this.ax[15] - this.ax[14] * this.ax[1] * this.ax[7] - this.ax[2] * this.ax[5] * this.ax[15]) + this.ax[14] * this.ax[3] * this.ax[5] - this.ax[6] * this.ax[3] * this.ax[13]) * var2;
         float var6 = (this.ax[11] * -this.ax[1] * this.ax[6] + this.ax[7] * this.ax[1] * this.ax[10] + this.ax[2] * this.ax[5] * this.ax[11] - this.ax[2] * this.ax[7] * this.ax[9] - this.ax[5] * this.ax[3] * this.ax[10] + this.ax[9] * this.ax[6] * this.ax[3]) * var2;
         float var7 = (this.ax[15] * this.ax[8] * this.ax[6] + this.ax[11] * this.ax[4] * this.ax[14] + this.ax[10] * -this.ax[4] * this.ax[15] - this.ax[12] * this.ax[11] * this.ax[6] - this.ax[14] * this.ax[8] * this.ax[7] + this.ax[12] * this.ax[7] * this.ax[10]) * var2;
         float var8 = (this.ax[3] * this.ax[8] * this.ax[14] + this.ax[10] * this.ax[0] * this.ax[15] - this.ax[14] * this.ax[0] * this.ax[11] - this.ax[15] * this.ax[2] * this.ax[8] + this.ax[2] * this.ax[11] * this.ax[12] - this.ax[12] * this.ax[10] * this.ax[3]) * var2;
         float var9 = (this.ax[6] * -this.ax[0] * this.ax[15] + this.ax[7] * this.ax[0] * this.ax[14] + this.ax[15] * this.ax[4] * this.ax[2] - this.ax[7] * this.ax[2] * this.ax[12] - this.ax[14] * this.ax[4] * this.ax[3] + this.ax[3] * this.ax[6] * this.ax[12]) * var2;
         float var10 = (this.ax[8] * this.ax[2] * this.ax[7] + (this.ax[11] * this.ax[6] * this.ax[0] - this.ax[10] * this.ax[7] * this.ax[0] - this.ax[11] * this.ax[4] * this.ax[2]) + this.ax[10] * this.ax[3] * this.ax[4] - this.ax[8] * this.ax[6] * this.ax[3]) * var2;
         float var11 = (this.ax[13] * this.ax[8] * this.ax[7] + this.ax[15] * this.ax[9] * this.ax[4] - this.ax[4] * this.ax[11] * this.ax[13] - this.ax[5] * this.ax[8] * this.ax[15] + this.ax[11] * this.ax[5] * this.ax[12] - this.ax[9] * this.ax[7] * this.ax[12]) * var2;
         float var12 = (this.ax[0] * this.ax[11] * this.ax[13] + -this.ax[0] * this.ax[9] * this.ax[15] + this.ax[8] * this.ax[1] * this.ax[15] - this.ax[1] * this.ax[11] * this.ax[12] - this.ax[8] * this.ax[3] * this.ax[13] + this.ax[3] * this.ax[9] * this.ax[12]) * var2;
         float var13 = (this.ax[7] * this.ax[1] * this.ax[12] + (this.ax[15] * this.ax[0] * this.ax[5] - this.ax[13] * this.ax[7] * this.ax[0] - this.ax[1] * this.ax[4] * this.ax[15]) + this.ax[4] * this.ax[3] * this.ax[13] - this.ax[3] * this.ax[5] * this.ax[12]) * var2;
         float var14 = (this.ax[3] * this.ax[5] * this.ax[8] + (this.ax[11] * this.ax[4] * this.ax[1] + this.ax[0] * this.ax[7] * this.ax[9] + this.ax[5] * -this.ax[0] * this.ax[11] - this.ax[8] * this.ax[7] * this.ax[1] - this.ax[9] * this.ax[4] * this.ax[3])) * var2;
         float var15 = (this.ax[12] * this.ax[6] * this.ax[9] + (this.ax[14] * this.ax[8] * this.ax[5] + this.ax[14] * this.ax[9] * -this.ax[4] + this.ax[4] * this.ax[10] * this.ax[13] - this.ax[12] * this.ax[5] * this.ax[10] - this.ax[13] * this.ax[8] * this.ax[6])) * var2;
         float var16 = (this.ax[13] * this.ax[8] * this.ax[2] + this.ax[14] * this.ax[0] * this.ax[9] - this.ax[13] * this.ax[10] * this.ax[0] - this.ax[8] * this.ax[1] * this.ax[14] + this.ax[12] * this.ax[1] * this.ax[10] - this.ax[2] * this.ax[9] * this.ax[12]) * var2;
         float var17 = (this.ax[12] * this.ax[5] * this.ax[2] + (this.ax[14] * -this.ax[0] * this.ax[5] + this.ax[0] * this.ax[6] * this.ax[13] + this.ax[14] * this.ax[4] * this.ax[1] - this.ax[6] * this.ax[1] * this.ax[12] - this.ax[13] * this.ax[4] * this.ax[2])) * var2;
         float var18 = (this.ax[0] * this.ax[5] * this.ax[10] - this.ax[6] * this.ax[0] * this.ax[9] - this.ax[10] * this.ax[4] * this.ax[1] + this.ax[6] * this.ax[1] * this.ax[8] + this.ax[2] * this.ax[4] * this.ax[9] - this.ax[8] * this.ax[2] * this.ax[5]) * var2;
         this.ax[0] = var3;
         this.ax[1] = var4;
         this.ax[2] = var5;
         this.ax[3] = var6;
         this.ax[4] = var7;
         this.ax[5] = var8;
         this.ax[6] = var9;
         this.ax[7] = var10;
         this.ax[8] = var11;
         this.ax[9] = var12;
         this.ax[10] = var13;
         this.ax[11] = var14;
         this.ax[12] = var15;
         this.ax[13] = var16;
         this.ax[14] = var17;
         this.ax[15] = var18;
      } catch (RuntimeException var19) {
         throw vk.ae(var19, "qf.ai(" + ')');
      }
   }

   static void an(int var0) {
      ag = -305952625 * var0;
      ae = new qf[var0];
      am = 0;
   }

   public qf(qf var1) {
      try {
         super();
         this.ax = new float[16];
         this.au(var1, 1218100430);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qf.<init>(" + ')');
      }
   }

   public float ay(float var1, float var2, float var3, int var4) {
      try {
         return this.ax[8] * var3 + this.ax[4] * var2 + var1 * this.ax[0] + this.ax[12];
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qf.ay(" + ')');
      }
   }

   public float aj(float var1, float var2, float var3, int var4) {
      try {
         return this.ax[13] + var1 * this.ax[1] + var2 * this.ax[5] + var3 * this.ax[9];
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qf.aj(" + ')');
      }
   }

   public float av(float var1, float var2, float var3, int var4) {
      try {
         return var3 * this.ax[10] + var2 * this.ax[6] + this.ax[2] * var1 + this.ax[14];
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qf.av(" + ')');
      }
   }

   public void ad(qf var1, int var2) {
      try {
         for(int var3 = 0; var3 < this.ax.length; ++var3) {
            if (var2 <= -1856457959) {
               throw new IllegalStateException();
            }

            float[] var10000 = this.ax;
            var10000[var3] += var1.ax[var3];
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "qf.ad(" + ')');
      }
   }

   public int hashCode() {
      try {
         boolean var1 = true;
         byte var2 = 1;
         int var4 = 31 * var2 + Arrays.hashCode(this.ax);
         return var4;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qf.hashCode(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof qf)) {
            return false;
         } else {
            qf var2 = (qf)var1;

            for(int var3 = 0; var3 < 16; ++var3) {
               if (this.ax[var3] != var2.ax[var3]) {
                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "qf.equals(" + ')');
      }
   }

   public float[] aw(int var1) {
      try {
         float[] var2 = new float[3];
         qv var3 = new qv(this.ax[0], this.ax[1], this.ax[2]);
         qv var4 = new qv(this.ax[4], this.ax[5], this.ax[6]);
         qv var5 = new qv(this.ax[8], this.ax[9], this.ax[10]);
         var2[0] = var3.at((byte)-119);
         var2[1] = var4.at((byte)-101);
         var2[2] = var5.at((byte)-45);
         return var2;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "qf.aw(" + ')');
      }
   }

   public float cd(float var1, float var2, float var3) {
      return var3 * this.ax[10] + var2 * this.ax[6] + this.ax[2] * var1 + this.ax[14];
   }

   void bi() {
      this.ax[0] = 1.0F;
      this.ax[1] = 0.0F;
      this.ax[2] = 0.0F;
      this.ax[3] = 0.0F;
      this.ax[4] = 0.0F;
      this.ax[5] = 1.0F;
      this.ax[6] = 0.0F;
      this.ax[7] = 0.0F;
      this.ax[8] = 0.0F;
      this.ax[9] = 0.0F;
      this.ax[10] = 1.0F;
      this.ax[11] = 0.0F;
      this.ax[12] = 0.0F;
      this.ax[13] = 0.0F;
      this.ax[14] = 0.0F;
      this.ax[15] = 1.0F;
   }

   public void cv() {
      float var1 = 1.0F / this.aa(-876539839);
      float var2 = (this.ax[15] * this.ax[10] * this.ax[5] - this.ax[11] * this.ax[5] * this.ax[14] - this.ax[6] * this.ax[9] * this.ax[15] + this.ax[6] * this.ax[11] * this.ax[13] + this.ax[14] * this.ax[9] * this.ax[7] - this.ax[10] * this.ax[7] * this.ax[13]) * var1;
      float var3 = var1 * (this.ax[10] * this.ax[3] * this.ax[13] + (this.ax[1] * this.ax[11] * this.ax[14] + this.ax[10] * -this.ax[1] * this.ax[15] + this.ax[15] * this.ax[2] * this.ax[9] - this.ax[13] * this.ax[11] * this.ax[2] - this.ax[14] * this.ax[9] * this.ax[3]));
      float var4 = (this.ax[2] * this.ax[7] * this.ax[13] + (this.ax[6] * this.ax[1] * this.ax[15] - this.ax[14] * this.ax[1] * this.ax[7] - this.ax[2] * this.ax[5] * this.ax[15]) + this.ax[14] * this.ax[3] * this.ax[5] - this.ax[6] * this.ax[3] * this.ax[13]) * var1;
      float var5 = (this.ax[11] * -this.ax[1] * this.ax[6] + this.ax[7] * this.ax[1] * this.ax[10] + this.ax[2] * this.ax[5] * this.ax[11] - this.ax[2] * this.ax[7] * this.ax[9] - this.ax[5] * this.ax[3] * this.ax[10] + this.ax[9] * this.ax[6] * this.ax[3]) * var1;
      float var6 = (this.ax[15] * this.ax[8] * this.ax[6] + this.ax[11] * this.ax[4] * this.ax[14] + this.ax[10] * -this.ax[4] * this.ax[15] - this.ax[12] * this.ax[11] * this.ax[6] - this.ax[14] * this.ax[8] * this.ax[7] + this.ax[12] * this.ax[7] * this.ax[10]) * var1;
      float var7 = (this.ax[3] * this.ax[8] * this.ax[14] + this.ax[10] * this.ax[0] * this.ax[15] - this.ax[14] * this.ax[0] * this.ax[11] - this.ax[15] * this.ax[2] * this.ax[8] + this.ax[2] * this.ax[11] * this.ax[12] - this.ax[12] * this.ax[10] * this.ax[3]) * var1;
      float var8 = (this.ax[6] * -this.ax[0] * this.ax[15] + this.ax[7] * this.ax[0] * this.ax[14] + this.ax[15] * this.ax[4] * this.ax[2] - this.ax[7] * this.ax[2] * this.ax[12] - this.ax[14] * this.ax[4] * this.ax[3] + this.ax[3] * this.ax[6] * this.ax[12]) * var1;
      float var9 = (this.ax[8] * this.ax[2] * this.ax[7] + (this.ax[11] * this.ax[6] * this.ax[0] - this.ax[10] * this.ax[7] * this.ax[0] - this.ax[11] * this.ax[4] * this.ax[2]) + this.ax[10] * this.ax[3] * this.ax[4] - this.ax[8] * this.ax[6] * this.ax[3]) * var1;
      float var10 = (this.ax[13] * this.ax[8] * this.ax[7] + this.ax[15] * this.ax[9] * this.ax[4] - this.ax[4] * this.ax[11] * this.ax[13] - this.ax[5] * this.ax[8] * this.ax[15] + this.ax[11] * this.ax[5] * this.ax[12] - this.ax[9] * this.ax[7] * this.ax[12]) * var1;
      float var11 = (this.ax[0] * this.ax[11] * this.ax[13] + -this.ax[0] * this.ax[9] * this.ax[15] + this.ax[8] * this.ax[1] * this.ax[15] - this.ax[1] * this.ax[11] * this.ax[12] - this.ax[8] * this.ax[3] * this.ax[13] + this.ax[3] * this.ax[9] * this.ax[12]) * var1;
      float var12 = (this.ax[7] * this.ax[1] * this.ax[12] + (this.ax[15] * this.ax[0] * this.ax[5] - this.ax[13] * this.ax[7] * this.ax[0] - this.ax[1] * this.ax[4] * this.ax[15]) + this.ax[4] * this.ax[3] * this.ax[13] - this.ax[3] * this.ax[5] * this.ax[12]) * var1;
      float var13 = (this.ax[3] * this.ax[5] * this.ax[8] + (this.ax[11] * this.ax[4] * this.ax[1] + this.ax[0] * this.ax[7] * this.ax[9] + this.ax[5] * -this.ax[0] * this.ax[11] - this.ax[8] * this.ax[7] * this.ax[1] - this.ax[9] * this.ax[4] * this.ax[3])) * var1;
      float var14 = (this.ax[12] * this.ax[6] * this.ax[9] + (this.ax[14] * this.ax[8] * this.ax[5] + this.ax[14] * this.ax[9] * -this.ax[4] + this.ax[4] * this.ax[10] * this.ax[13] - this.ax[12] * this.ax[5] * this.ax[10] - this.ax[13] * this.ax[8] * this.ax[6])) * var1;
      float var15 = (this.ax[13] * this.ax[8] * this.ax[2] + this.ax[14] * this.ax[0] * this.ax[9] - this.ax[13] * this.ax[10] * this.ax[0] - this.ax[8] * this.ax[1] * this.ax[14] + this.ax[12] * this.ax[1] * this.ax[10] - this.ax[2] * this.ax[9] * this.ax[12]) * var1;
      float var16 = (this.ax[12] * this.ax[5] * this.ax[2] + (this.ax[14] * -this.ax[0] * this.ax[5] + this.ax[0] * this.ax[6] * this.ax[13] + this.ax[14] * this.ax[4] * this.ax[1] - this.ax[6] * this.ax[1] * this.ax[12] - this.ax[13] * this.ax[4] * this.ax[2])) * var1;
      float var17 = (this.ax[0] * this.ax[5] * this.ax[10] - this.ax[6] * this.ax[0] * this.ax[9] - this.ax[10] * this.ax[4] * this.ax[1] + this.ax[6] * this.ax[1] * this.ax[8] + this.ax[2] * this.ax[4] * this.ax[9] - this.ax[8] * this.ax[2] * this.ax[5]) * var1;
      this.ax[0] = var2;
      this.ax[1] = var3;
      this.ax[2] = var4;
      this.ax[3] = var5;
      this.ax[4] = var6;
      this.ax[5] = var7;
      this.ax[6] = var8;
      this.ax[7] = var9;
      this.ax[8] = var10;
      this.ax[9] = var11;
      this.ax[10] = var12;
      this.ax[11] = var13;
      this.ax[12] = var14;
      this.ax[13] = var15;
      this.ax[14] = var16;
      this.ax[15] = var17;
   }

   public int amy() {
      boolean var1 = true;
      byte var2 = 1;
      int var3 = 31 * var2 + Arrays.hashCode(this.ax);
      return var3;
   }

   public int amd() {
      boolean var1 = true;
      byte var2 = 1;
      int var3 = 31 * var2 + Arrays.hashCode(this.ax);
      return var3;
   }

   public String aml() {
      StringBuilder var1 = new StringBuilder();
      this.aq((byte)94);
      this.ax((byte)9);

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.ax[4 * var2 + var3];
            if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public void az(qx var1, int var2) {
      try {
         this.ax[0] = var1.ac;
         this.ax[1] = var1.ae;
         this.ax[2] = var1.ag;
         this.ax[3] = 0.0F;
         this.ax[4] = var1.am;
         this.ax[5] = var1.ax;
         this.ax[6] = var1.aq;
         this.ax[7] = 0.0F;
         this.ax[8] = var1.af;
         this.ax[9] = var1.at;
         this.ax[10] = var1.au;
         this.ax[11] = 0.0F;
         this.ax[12] = var1.ar;
         this.ax[13] = var1.al;
         this.ax[14] = var1.ad;
         this.ax[15] = 1.0F;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qf.az(" + ')');
      }
   }

   public float ce(float var1, float var2, float var3) {
      return var3 * this.ax[10] + var2 * this.ax[6] + this.ax[2] * var1 + this.ax[14];
   }

   public static qf bn() {
      synchronized(ae) {
         if (378295407 * am == 0) {
            return new qf();
         } else {
            ae[(am -= -436761969) * -1323408554].af((short)16935);
            return ae[378295407 * am];
         }
      }
   }

   public float cp(float var1, float var2, float var3) {
      return this.ax[13] + var1 * this.ax[1] + var2 * this.ax[5] + var3 * this.ax[9];
   }

   public void ch(qh var1) {
      float var2 = var1.ac.af * var1.ac.af;
      float var3 = var1.ac.af * var1.ac.am;
      float var4 = var1.ac.ax * var1.ac.af;
      float var5 = var1.ac.aq * var1.ac.af;
      float var6 = var1.ac.am * var1.ac.am;
      float var7 = var1.ac.ax * var1.ac.am;
      float var8 = var1.ac.aq * var1.ac.am;
      float var9 = var1.ac.ax * var1.ac.ax;
      float var10 = var1.ac.ax * var1.ac.aq;
      float var11 = var1.ac.aq * var1.ac.aq;
      this.ax[0] = var2 + var6 - var11 - var9;
      this.ax[1] = var7 + var5 + var7 + var5;
      this.ax[2] = var8 + (var8 - var4 - var4);
      this.ax[4] = var7 - var5 - var5 + var7;
      this.ax[5] = var9 + var2 - var6 - var11;
      this.ax[6] = var10 + var3 + var10 + var3;
      this.ax[8] = var8 + var8 + var4 + var4;
      this.ax[9] = var10 + (var10 - var3 - var3);
      this.ax[10] = var11 + var2 - var9 - var6;
      float[] var12 = this.ax;
      float[] var13 = this.ax;
      this.ax[11] = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.ax[12] = var1.ae.am;
      this.ax[13] = var1.ae.ax;
      this.ax[14] = var1.ae.aq;
      this.ax[15] = 1.0F;
   }

   public static qf bh() {
      synchronized(ae) {
         if (378295407 * am == 0) {
            return new qf();
         } else {
            ae[(am -= 465608434) * 378295407].af((short)21118);
            return ae[1072518065 * am];
         }
      }
   }

   float[] by() {
      float[] var1 = new float[3];
      if ((double)this.ax[2] < 0.999D && (double)this.ax[2] > -0.999D) {
         var1[1] = (float)(-Math.asin((double)this.ax[2]));
         double var2 = Math.cos((double)var1[1]);
         var1[0] = (float)Math.atan2((double)this.ax[6] / var2, (double)this.ax[10] / var2);
         var1[2] = (float)Math.atan2((double)this.ax[1] / var2, (double)this.ax[0] / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2((double)this.ax[2], 0.0D);
         var1[2] = (float)Math.atan2((double)(-this.ax[9]), (double)this.ax[5]);
      }

      return var1;
   }

   public void bx() {
      synchronized(ae) {
         if (-1942988053 * am < -661875089 * ag - 1) {
            ae[(am += -436761969) * -1951958506 - 1] = this;
         }

      }
   }

   public void bf() {
      synchronized(ae) {
         if (378295407 * am < -661875089 * ag - 1) {
            ae[(am += -436761969) * 378295407 - 1] = this;
         }

      }
   }

   void bm(vf var1, boolean var2) {
      if (var2) {
         qx var3 = new qx();
         var3.ae(no.ac(var1.cq(-1692355883), (short)2985), (byte)-38);
         var3.ag(no.ac(var1.cq(1188607134), (short)26019), 107735256);
         var3.am(no.ac(var1.cq(182365375), (short)16684), (byte)72);
         var3.ax((float)var1.cq(-830790512), (float)var1.cq(111400228), (float)var1.cq(-436544885), -192405633);
         this.az(var3, 1341931551);
      } else {
         for(int var4 = 0; var4 < 16; ++var4) {
            this.ax[var4] = var1.cr(-1935627220);
         }
      }

   }

   public void bd() {
      synchronized(ae) {
         if (378295407 * am < -160165362 * ag - 1) {
            ae[(am += -436761969) * -2092696552 - 1] = this;
         }

      }
   }

   void bw(vf var1, boolean var2) {
      if (var2) {
         qx var3 = new qx();
         var3.ae(no.ac(var1.cq(1154127361), (short)32083), (byte)-122);
         var3.ag(no.ac(var1.cq(1869058883), (short)3000), -1368193353);
         var3.am(no.ac(var1.cq(-1520633398), (short)18859), (byte)-12);
         var3.ax((float)var1.cq(-1484311114), (float)var1.cq(-468242282), (float)var1.cq(436909351), -192405633);
         this.az(var3, 1911811724);
      } else {
         for(int var4 = 0; var4 < 16; ++var4) {
            this.ax[var4] = var1.cr(-1935627220);
         }
      }

   }

   void ba(vf var1, boolean var2) {
      if (var2) {
         qx var3 = new qx();
         var3.ae(no.ac(var1.cq(54448709), (short)32117), (byte)-123);
         var3.ag(no.ac(var1.cq(118435551), (short)11238), -1672441234);
         var3.am(no.ac(var1.cq(1999866272), (short)30725), (byte)-15);
         var3.ax((float)var1.cq(-768823605), (float)var1.cq(789445051), (float)var1.cq(-699136715), -192405633);
         this.az(var3, 560877653);
      } else {
         for(int var4 = 0; var4 < 16; ++var4) {
            this.ax[var4] = var1.cr(-1935627220);
         }
      }

   }

   void bj(vf var1, boolean var2) {
      if (var2) {
         qx var3 = new qx();
         var3.ae(no.ac(var1.cq(325897937), (short)8845), (byte)-25);
         var3.ag(no.ac(var1.cq(-808951000), (short)3637), -1630499514);
         var3.am(no.ac(var1.cq(-1471058293), (short)29471), (byte)28);
         var3.ax((float)var1.cq(-675650344), (float)var1.cq(-803593147), (float)var1.cq(-47956341), -192405633);
         this.az(var3, 1687375860);
      } else {
         for(int var4 = 0; var4 < 16; ++var4) {
            this.ax[var4] = var1.cr(-1935627220);
         }
      }

   }

   public float[] dp() {
      float[] var1 = new float[3];
      qv var2 = new qv(this.ax[0], this.ax[1], this.ax[2]);
      qv var3 = new qv(this.ax[4], this.ax[5], this.ax[6]);
      qv var4 = new qv(this.ax[8], this.ax[9], this.ax[10]);
      var1[0] = var2.at((byte)-76);
      var1[1] = var3.at((byte)-105);
      var1[2] = var4.at((byte)-46);
      return var1;
   }

   public float cw(float var1, float var2, float var3) {
      return this.ax[8] * var3 + this.ax[4] * var2 + var1 * this.ax[0] + this.ax[12];
   }

   public void ci(qd var1) {
      float var2 = var1.af * var1.af;
      float var3 = var1.am * var1.af;
      float var4 = var1.af * var1.ax;
      float var5 = var1.af * var1.aq;
      float var6 = var1.am * var1.am;
      float var7 = var1.am * var1.ax;
      float var8 = var1.aq * var1.am;
      float var9 = var1.ax * var1.ax;
      float var10 = var1.ax * var1.aq;
      float var11 = var1.aq * var1.aq;
      this.ax[0] = var2 + var6 - var11 - var9;
      this.ax[1] = var5 + var7 + var7 + var5;
      this.ax[2] = var8 + (var8 - var4 - var4);
      this.ax[4] = var7 + (var7 - var5 - var5);
      this.ax[5] = var9 + var2 - var6 - var11;
      this.ax[6] = var3 + var10 + var10 + var3;
      this.ax[8] = var8 + var4 + var8 + var4;
      this.ax[9] = var10 - var3 - var3 + var10;
      this.ax[10] = var11 + var2 - var9 - var6;
   }

   public void cj(qd var1) {
      float var2 = var1.af * var1.af;
      float var3 = var1.am * var1.af;
      float var4 = var1.af * var1.ax;
      float var5 = var1.af * var1.aq;
      float var6 = var1.am * var1.am;
      float var7 = var1.am * var1.ax;
      float var8 = var1.aq * var1.am;
      float var9 = var1.ax * var1.ax;
      float var10 = var1.ax * var1.aq;
      float var11 = var1.aq * var1.aq;
      this.ax[0] = var2 + var6 - var11 - var9;
      this.ax[1] = var5 + var7 + var7 + var5;
      this.ax[2] = var8 + (var8 - var4 - var4);
      this.ax[4] = var7 + (var7 - var5 - var5);
      this.ax[5] = var9 + var2 - var6 - var11;
      this.ax[6] = var3 + var10 + var10 + var3;
      this.ax[8] = var8 + var4 + var8 + var4;
      this.ax[9] = var10 - var3 - var3 + var10;
      this.ax[10] = var11 + var2 - var9 - var6;
   }

   void bg() {
      this.ax[0] = 1.0F;
      this.ax[1] = 0.0F;
      this.ax[2] = 0.0F;
      this.ax[3] = 0.0F;
      this.ax[4] = 0.0F;
      this.ax[5] = 1.0F;
      this.ax[6] = 0.0F;
      this.ax[7] = 0.0F;
      this.ax[8] = 0.0F;
      this.ax[9] = 0.0F;
      this.ax[10] = 1.0F;
      this.ax[11] = 0.0F;
      this.ax[12] = 0.0F;
      this.ax[13] = 0.0F;
      this.ax[14] = 0.0F;
      this.ax[15] = 1.0F;
   }

   public void bl() {
      this.ax[0] = 0.0F;
      this.ax[1] = 0.0F;
      this.ax[2] = 0.0F;
      this.ax[3] = 0.0F;
      this.ax[4] = 0.0F;
      this.ax[5] = 0.0F;
      this.ax[6] = 0.0F;
      this.ax[7] = 0.0F;
      this.ax[8] = 0.0F;
      this.ax[9] = 0.0F;
      this.ax[10] = 0.0F;
      this.ax[11] = 0.0F;
      this.ax[12] = 0.0F;
      this.ax[13] = 0.0F;
      this.ax[14] = 0.0F;
      this.ax[15] = 0.0F;
   }

   public void bz(qf var1) {
      System.arraycopy(var1.ax, 0, this.ax, 0, 16);
   }

   public void bu(qf var1) {
      System.arraycopy(var1.ax, 0, this.ax, 0, 16);
   }

   public void br(qf var1) {
      System.arraycopy(var1.ax, 0, this.ax, 0, 16);
   }

   public void ao(float var1, float var2, float var3, float var4, short var5) {
      try {
         this.ax[0] = var1;
         this.ax[1] = 0.0F;
         this.ax[2] = 0.0F;
         this.ax[3] = 0.0F;
         this.ax[4] = 0.0F;
         this.ax[5] = var2;
         this.ax[6] = 0.0F;
         this.ax[7] = 0.0F;
         this.ax[8] = 0.0F;
         this.ax[9] = 0.0F;
         this.ax[10] = var3;
         this.ax[11] = 0.0F;
         this.ax[12] = 0.0F;
         this.ax[13] = 0.0F;
         this.ax[14] = 0.0F;
         this.ax[15] = var4;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "qf.ao(" + ')');
      }
   }

   public void bv(float var1, float var2, float var3) {
      this.af((short)1373);
      this.ax[0] = var1;
      this.ax[5] = var2;
      this.ax[10] = var3;
   }

   public void bt(qf var1) {
      for(int var2 = 0; var2 < this.ax.length; ++var2) {
         float[] var10000 = this.ax;
         var10000[var2] += var1.ax[var2];
      }

   }

   public void bq(qf var1) {
      for(int var2 = 0; var2 < this.ax.length; ++var2) {
         float[] var10000 = this.ax;
         var10000[var2] += var1.ax[var2];
      }

   }

   public void co(qx var1) {
      this.ax[0] = var1.ac;
      this.ax[1] = var1.ae;
      this.ax[2] = var1.ag;
      this.ax[3] = 0.0F;
      this.ax[4] = var1.am;
      this.ax[5] = var1.ax;
      this.ax[6] = var1.aq;
      this.ax[7] = 0.0F;
      this.ax[8] = var1.af;
      this.ax[9] = var1.at;
      this.ax[10] = var1.au;
      this.ax[11] = 0.0F;
      this.ax[12] = var1.ar;
      this.ax[13] = var1.al;
      this.ax[14] = var1.ad;
      this.ax[15] = 1.0F;
   }

   public void be(qf var1) {
      float var2 = var1.ax[4] * this.ax[1] + this.ax[0] * var1.ax[0] + var1.ax[8] * this.ax[2] + this.ax[3] * var1.ax[12];
      float var3 = var1.ax[13] * this.ax[3] + this.ax[1] * var1.ax[5] + var1.ax[1] * this.ax[0] + var1.ax[9] * this.ax[2];
      float var4 = var1.ax[6] * this.ax[1] + var1.ax[2] * this.ax[0] + var1.ax[10] * this.ax[2] + this.ax[3] * var1.ax[14];
      float var5 = this.ax[0] * var1.ax[3] + var1.ax[7] * this.ax[1] + var1.ax[11] * this.ax[2] + this.ax[3] * var1.ax[15];
      float var6 = var1.ax[8] * this.ax[6] + this.ax[5] * var1.ax[4] + this.ax[4] * var1.ax[0] + this.ax[7] * var1.ax[12];
      float var7 = var1.ax[13] * this.ax[7] + var1.ax[9] * this.ax[6] + this.ax[5] * var1.ax[5] + var1.ax[1] * this.ax[4];
      float var8 = this.ax[7] * var1.ax[14] + var1.ax[6] * this.ax[5] + this.ax[4] * var1.ax[2] + var1.ax[10] * this.ax[6];
      float var9 = var1.ax[3] * this.ax[4] + this.ax[5] * var1.ax[7] + this.ax[6] * var1.ax[11] + var1.ax[15] * this.ax[7];
      float var10 = this.ax[11] * var1.ax[12] + this.ax[8] * var1.ax[0] + this.ax[9] * var1.ax[4] + this.ax[10] * var1.ax[8];
      float var11 = this.ax[10] * var1.ax[9] + var1.ax[1] * this.ax[8] + this.ax[9] * var1.ax[5] + this.ax[11] * var1.ax[13];
      float var12 = this.ax[10] * var1.ax[10] + this.ax[8] * var1.ax[2] + var1.ax[6] * this.ax[9] + this.ax[11] * var1.ax[14];
      float var13 = this.ax[9] * var1.ax[7] + this.ax[8] * var1.ax[3] + this.ax[10] * var1.ax[11] + var1.ax[15] * this.ax[11];
      float var14 = var1.ax[8] * this.ax[14] + this.ax[12] * var1.ax[0] + this.ax[13] * var1.ax[4] + this.ax[15] * var1.ax[12];
      float var15 = var1.ax[13] * this.ax[15] + this.ax[12] * var1.ax[1] + this.ax[13] * var1.ax[5] + this.ax[14] * var1.ax[9];
      float var16 = var1.ax[14] * this.ax[15] + var1.ax[10] * this.ax[14] + this.ax[12] * var1.ax[2] + var1.ax[6] * this.ax[13];
      float var17 = var1.ax[15] * this.ax[15] + var1.ax[11] * this.ax[14] + var1.ax[7] * this.ax[13] + var1.ax[3] * this.ax[12];
      this.ax[0] = var2;
      this.ax[1] = var3;
      this.ax[2] = var4;
      this.ax[3] = var5;
      this.ax[4] = var6;
      this.ax[5] = var7;
      this.ax[6] = var8;
      this.ax[7] = var9;
      this.ax[8] = var10;
      this.ax[9] = var11;
      this.ax[10] = var12;
      this.ax[11] = var13;
      this.ax[12] = var14;
      this.ax[13] = var15;
      this.ax[14] = var16;
      this.ax[15] = var17;
   }

   public void bc(qf var1) {
      float var2 = var1.ax[4] * this.ax[1] + this.ax[0] * var1.ax[0] + var1.ax[8] * this.ax[2] + this.ax[3] * var1.ax[12];
      float var3 = var1.ax[13] * this.ax[3] + this.ax[1] * var1.ax[5] + var1.ax[1] * this.ax[0] + var1.ax[9] * this.ax[2];
      float var4 = var1.ax[6] * this.ax[1] + var1.ax[2] * this.ax[0] + var1.ax[10] * this.ax[2] + this.ax[3] * var1.ax[14];
      float var5 = this.ax[0] * var1.ax[3] + var1.ax[7] * this.ax[1] + var1.ax[11] * this.ax[2] + this.ax[3] * var1.ax[15];
      float var6 = var1.ax[8] * this.ax[6] + this.ax[5] * var1.ax[4] + this.ax[4] * var1.ax[0] + this.ax[7] * var1.ax[12];
      float var7 = var1.ax[13] * this.ax[7] + var1.ax[9] * this.ax[6] + this.ax[5] * var1.ax[5] + var1.ax[1] * this.ax[4];
      float var8 = this.ax[7] * var1.ax[14] + var1.ax[6] * this.ax[5] + this.ax[4] * var1.ax[2] + var1.ax[10] * this.ax[6];
      float var9 = var1.ax[3] * this.ax[4] + this.ax[5] * var1.ax[7] + this.ax[6] * var1.ax[11] + var1.ax[15] * this.ax[7];
      float var10 = this.ax[11] * var1.ax[12] + this.ax[8] * var1.ax[0] + this.ax[9] * var1.ax[4] + this.ax[10] * var1.ax[8];
      float var11 = this.ax[10] * var1.ax[9] + var1.ax[1] * this.ax[8] + this.ax[9] * var1.ax[5] + this.ax[11] * var1.ax[13];
      float var12 = this.ax[10] * var1.ax[10] + this.ax[8] * var1.ax[2] + var1.ax[6] * this.ax[9] + this.ax[11] * var1.ax[14];
      float var13 = this.ax[9] * var1.ax[7] + this.ax[8] * var1.ax[3] + this.ax[10] * var1.ax[11] + var1.ax[15] * this.ax[11];
      float var14 = var1.ax[8] * this.ax[14] + this.ax[12] * var1.ax[0] + this.ax[13] * var1.ax[4] + this.ax[15] * var1.ax[12];
      float var15 = var1.ax[13] * this.ax[15] + this.ax[12] * var1.ax[1] + this.ax[13] * var1.ax[5] + this.ax[14] * var1.ax[9];
      float var16 = var1.ax[14] * this.ax[15] + var1.ax[10] * this.ax[14] + this.ax[12] * var1.ax[2] + var1.ax[6] * this.ax[13];
      float var17 = var1.ax[15] * this.ax[15] + var1.ax[11] * this.ax[14] + var1.ax[7] * this.ax[13] + var1.ax[3] * this.ax[12];
      this.ax[0] = var2;
      this.ax[1] = var3;
      this.ax[2] = var4;
      this.ax[3] = var5;
      this.ax[4] = var6;
      this.ax[5] = var7;
      this.ax[6] = var8;
      this.ax[7] = var9;
      this.ax[8] = var10;
      this.ax[9] = var11;
      this.ax[10] = var12;
      this.ax[11] = var13;
      this.ax[12] = var14;
      this.ax[13] = var15;
      this.ax[14] = var16;
      this.ax[15] = var17;
   }

   public void as(float var1, float var2, float var3, float[] var4, int var5) {
      try {
         var4[0] = this.ax[12] + var1 * this.ax[0] + var2 * this.ax[4] + this.ax[8] * var3;
         var4[1] = this.ax[9] * var3 + this.ax[5] * var2 + this.ax[1] * var1 + this.ax[13];
         var4[2] = this.ax[14] + this.ax[2] * var1 + this.ax[6] * var2 + var3 * this.ax[10];
         if (var4.length > 3) {
            if (var5 == 2044979362) {
               throw new IllegalStateException();
            }

            var4[3] = this.ax[3] * var1 + this.ax[7] * var2 + this.ax[11] * var3 + this.ax[15];
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "qf.as(" + ')');
      }
   }

   float[] bp() {
      float[] var1 = new float[3];
      if ((double)this.ax[2] < 0.999D && (double)this.ax[2] > -0.999D) {
         var1[1] = (float)(-Math.asin((double)this.ax[2]));
         double var2 = Math.cos((double)var1[1]);
         var1[0] = (float)Math.atan2((double)this.ax[6] / var2, (double)this.ax[10] / var2);
         var1[2] = (float)Math.atan2((double)this.ax[1] / var2, (double)this.ax[0] / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2((double)this.ax[2], 0.0D);
         var1[2] = (float)Math.atan2((double)(-this.ax[9]), (double)this.ax[5]);
      }

      return var1;
   }

   public void cf(qh var1) {
      float var2 = var1.ac.af * var1.ac.af;
      float var3 = var1.ac.af * var1.ac.am;
      float var4 = var1.ac.ax * var1.ac.af;
      float var5 = var1.ac.aq * var1.ac.af;
      float var6 = var1.ac.am * var1.ac.am;
      float var7 = var1.ac.ax * var1.ac.am;
      float var8 = var1.ac.aq * var1.ac.am;
      float var9 = var1.ac.ax * var1.ac.ax;
      float var10 = var1.ac.ax * var1.ac.aq;
      float var11 = var1.ac.aq * var1.ac.aq;
      this.ax[0] = var2 + var6 - var11 - var9;
      this.ax[1] = var7 + var5 + var7 + var5;
      this.ax[2] = var8 + (var8 - var4 - var4);
      this.ax[4] = var7 - var5 - var5 + var7;
      this.ax[5] = var9 + var2 - var6 - var11;
      this.ax[6] = var10 + var3 + var10 + var3;
      this.ax[8] = var8 + var8 + var4 + var4;
      this.ax[9] = var10 + (var10 - var3 - var3);
      this.ax[10] = var11 + var2 - var9 - var6;
      float[] var12 = this.ax;
      float[] var13 = this.ax;
      this.ax[11] = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.ax[12] = var1.ae.am;
      this.ax[13] = var1.ae.ax;
      this.ax[14] = var1.ae.aq;
      this.ax[15] = 1.0F;
   }

   float aa(int var1) {
      try {
         return this.ax[9] * this.ax[3] * this.ax[6] * this.ax[12] + (this.ax[3] * this.ax[5] * this.ax[8] * this.ax[14] + this.ax[13] * this.ax[3] * this.ax[4] * this.ax[10] + (this.ax[1] * this.ax[6] * this.ax[8] * this.ax[15] + this.ax[7] * this.ax[0] * this.ax[9] * this.ax[14] + this.ax[10] * this.ax[0] * this.ax[5] * this.ax[15] - this.ax[14] * this.ax[5] * this.ax[0] * this.ax[11] - this.ax[15] * this.ax[9] * this.ax[6] * this.ax[0] + this.ax[11] * this.ax[6] * this.ax[0] * this.ax[13] - this.ax[7] * this.ax[0] * this.ax[10] * this.ax[13] - this.ax[15] * this.ax[1] * this.ax[4] * this.ax[10] + this.ax[1] * this.ax[4] * this.ax[11] * this.ax[14] - this.ax[12] * this.ax[11] * this.ax[6] * this.ax[1] - this.ax[14] * this.ax[8] * this.ax[1] * this.ax[7] + this.ax[12] * this.ax[10] * this.ax[1] * this.ax[7] + this.ax[9] * this.ax[2] * this.ax[4] * this.ax[15] - this.ax[2] * this.ax[4] * this.ax[11] * this.ax[13] - this.ax[8] * this.ax[2] * this.ax[5] * this.ax[15] + this.ax[12] * this.ax[5] * this.ax[2] * this.ax[11] + this.ax[13] * this.ax[7] * this.ax[2] * this.ax[8] - this.ax[12] * this.ax[2] * this.ax[7] * this.ax[9] - this.ax[14] * this.ax[3] * this.ax[4] * this.ax[9]) - this.ax[12] * this.ax[10] * this.ax[5] * this.ax[3] - this.ax[13] * this.ax[6] * this.ax[3] * this.ax[8]);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qf.aa(" + ')');
      }
   }

   public void cm(qd var1) {
      float var2 = var1.af * var1.af;
      float var3 = var1.am * var1.af;
      float var4 = var1.af * var1.ax;
      float var5 = var1.af * var1.aq;
      float var6 = var1.am * var1.am;
      float var7 = var1.am * var1.ax;
      float var8 = var1.aq * var1.am;
      float var9 = var1.ax * var1.ax;
      float var10 = var1.ax * var1.aq;
      float var11 = var1.aq * var1.aq;
      this.ax[0] = var2 + var6 - var11 - var9;
      this.ax[1] = var5 + var7 + var7 + var5;
      this.ax[2] = var8 + (var8 - var4 - var4);
      this.ax[4] = var7 + (var7 - var5 - var5);
      this.ax[5] = var9 + var2 - var6 - var11;
      this.ax[6] = var3 + var10 + var10 + var3;
      this.ax[8] = var8 + var4 + var8 + var4;
      this.ax[9] = var10 - var3 - var3 + var10;
      this.ax[10] = var11 + var2 - var9 - var6;
   }

   public float cl(float var1, float var2, float var3) {
      return this.ax[8] * var3 + this.ax[4] * var2 + var1 * this.ax[0] + this.ax[12];
   }

   public void cx(qd var1) {
      float var2 = var1.af * var1.af;
      float var3 = var1.am * var1.af;
      float var4 = var1.af * var1.ax;
      float var5 = var1.af * var1.aq;
      float var6 = var1.am * var1.am;
      float var7 = var1.am * var1.ax;
      float var8 = var1.aq * var1.am;
      float var9 = var1.ax * var1.ax;
      float var10 = var1.ax * var1.aq;
      float var11 = var1.aq * var1.aq;
      this.ax[0] = var2 + var6 - var11 - var9;
      this.ax[1] = var5 + var7 + var7 + var5;
      this.ax[2] = var8 + (var8 - var4 - var4);
      this.ax[4] = var7 + (var7 - var5 - var5);
      this.ax[5] = var9 + var2 - var6 - var11;
      this.ax[6] = var3 + var10 + var10 + var3;
      this.ax[8] = var8 + var4 + var8 + var4;
      this.ax[9] = var10 - var3 - var3 + var10;
      this.ax[10] = var11 + var2 - var9 - var6;
   }

   public String ame() {
      StringBuilder var1 = new StringBuilder();
      this.aq((byte)-46);
      this.ax((byte)9);

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.ax[4 * var2 + var3];
            if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public void cy(qx var1) {
      this.ax[0] = var1.ac;
      this.ax[1] = var1.ae;
      this.ax[2] = var1.ag;
      this.ax[3] = 0.0F;
      this.ax[4] = var1.am;
      this.ax[5] = var1.ax;
      this.ax[6] = var1.aq;
      this.ax[7] = 0.0F;
      this.ax[8] = var1.af;
      this.ax[9] = var1.at;
      this.ax[10] = var1.au;
      this.ax[11] = 0.0F;
      this.ax[12] = var1.ar;
      this.ax[13] = var1.al;
      this.ax[14] = var1.ad;
      this.ax[15] = 1.0F;
   }

   public boolean gg(Object var1) {
      if (!(var1 instanceof qf)) {
         return false;
      } else {
         qf var2 = (qf)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (this.ax[var3] != var2.ax[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   static void ak(int var0) {
      ag = -305952625 * var0;
      ae = new qf[var0];
      am = 0;
   }

   public void cg(float var1, float var2, float var3, float var4) {
      this.ax[0] = var1;
      this.ax[1] = 0.0F;
      this.ax[2] = 0.0F;
      this.ax[3] = 0.0F;
      this.ax[4] = 0.0F;
      this.ax[5] = var2;
      this.ax[6] = 0.0F;
      this.ax[7] = 0.0F;
      this.ax[8] = 0.0F;
      this.ax[9] = 0.0F;
      this.ax[10] = var3;
      this.ax[11] = 0.0F;
      this.ax[12] = 0.0F;
      this.ax[13] = 0.0F;
      this.ax[14] = 0.0F;
      this.ax[15] = var4;
   }

   public void ct(float var1, float var2, float var3, float var4) {
      this.ax[0] = var1;
      this.ax[1] = 0.0F;
      this.ax[2] = 0.0F;
      this.ax[3] = 0.0F;
      this.ax[4] = 0.0F;
      this.ax[5] = var2;
      this.ax[6] = 0.0F;
      this.ax[7] = 0.0F;
      this.ax[8] = 0.0F;
      this.ax[9] = 0.0F;
      this.ax[10] = var3;
      this.ax[11] = 0.0F;
      this.ax[12] = 0.0F;
      this.ax[13] = 0.0F;
      this.ax[14] = 0.0F;
      this.ax[15] = var4;
   }

   public void cq(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.ax[12] + var1 * this.ax[0] + var2 * this.ax[4] + this.ax[8] * var3;
      var4[1] = this.ax[9] * var3 + this.ax[5] * var2 + this.ax[1] * var1 + this.ax[13];
      var4[2] = this.ax[14] + this.ax[2] * var1 + this.ax[6] * var2 + var3 * this.ax[10];
      if (var4.length > 3) {
         var4[3] = this.ax[3] * var1 + this.ax[7] * var2 + this.ax[11] * var3 + this.ax[15];
      }

   }

   public void cc(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.ax[12] + var1 * this.ax[0] + var2 * this.ax[4] + this.ax[8] * var3;
      var4[1] = this.ax[9] * var3 + this.ax[5] * var2 + this.ax[1] * var1 + this.ax[13];
      var4[2] = this.ax[14] + this.ax[2] * var1 + this.ax[6] * var2 + var3 * this.ax[10];
      if (var4.length > 3) {
         var4[3] = this.ax[3] * var1 + this.ax[7] * var2 + this.ax[11] * var3 + this.ax[15];
      }

   }

   public void cz(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.ax[12] + var1 * this.ax[0] + var2 * this.ax[4] + this.ax[8] * var3;
      var4[1] = this.ax[9] * var3 + this.ax[5] * var2 + this.ax[1] * var1 + this.ax[13];
      var4[2] = this.ax[14] + this.ax[2] * var1 + this.ax[6] * var2 + var3 * this.ax[10];
      if (var4.length > 3) {
         var4[3] = this.ax[3] * var1 + this.ax[7] * var2 + this.ax[11] * var3 + this.ax[15];
      }

   }

   public String amp() {
      StringBuilder var1 = new StringBuilder();
      this.aq((byte)-7);
      this.ax((byte)9);

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.ax[4 * var2 + var3];
            if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public float cr(float var1, float var2, float var3) {
      return this.ax[8] * var3 + this.ax[4] * var2 + var1 * this.ax[0] + this.ax[12];
   }

   public qf() {
      try {
         super();
         this.ax = new float[16];
         this.af((short)10314);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qf.<init>(" + ')');
      }
   }

   public void cu(qd var1) {
      float var2 = var1.af * var1.af;
      float var3 = var1.am * var1.af;
      float var4 = var1.af * var1.ax;
      float var5 = var1.af * var1.aq;
      float var6 = var1.am * var1.am;
      float var7 = var1.am * var1.ax;
      float var8 = var1.aq * var1.am;
      float var9 = var1.ax * var1.ax;
      float var10 = var1.ax * var1.aq;
      float var11 = var1.aq * var1.aq;
      this.ax[0] = var2 + var6 - var11 - var9;
      this.ax[1] = var5 + var7 + var7 + var5;
      this.ax[2] = var8 + (var8 - var4 - var4);
      this.ax[4] = var7 + (var7 - var5 - var5);
      this.ax[5] = var9 + var2 - var6 - var11;
      this.ax[6] = var3 + var10 + var10 + var3;
      this.ax[8] = var8 + var4 + var8 + var4;
      this.ax[9] = var10 - var3 - var3 + var10;
      this.ax[10] = var11 + var2 - var9 - var6;
   }

   public float cs(float var1, float var2, float var3) {
      return this.ax[8] * var3 + this.ax[4] * var2 + var1 * this.ax[0] + this.ax[12];
   }

   public void ar(float var1, byte var2) {
      try {
         this.al(var1, var1, var1, 1139304503);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qf.ar(" + ')');
      }
   }

   public float cb(float var1, float var2, float var3) {
      return this.ax[13] + var1 * this.ax[1] + var2 * this.ax[5] + var3 * this.ax[9];
   }

   public void cn(qh var1) {
      float var2 = var1.ac.af * var1.ac.af;
      float var3 = var1.ac.af * var1.ac.am;
      float var4 = var1.ac.ax * var1.ac.af;
      float var5 = var1.ac.aq * var1.ac.af;
      float var6 = var1.ac.am * var1.ac.am;
      float var7 = var1.ac.ax * var1.ac.am;
      float var8 = var1.ac.aq * var1.ac.am;
      float var9 = var1.ac.ax * var1.ac.ax;
      float var10 = var1.ac.ax * var1.ac.aq;
      float var11 = var1.ac.aq * var1.ac.aq;
      this.ax[0] = var2 + var6 - var11 - var9;
      this.ax[1] = var7 + var5 + var7 + var5;
      this.ax[2] = var8 + (var8 - var4 - var4);
      this.ax[4] = var7 - var5 - var5 + var7;
      this.ax[5] = var9 + var2 - var6 - var11;
      this.ax[6] = var10 + var3 + var10 + var3;
      this.ax[8] = var8 + var8 + var4 + var4;
      this.ax[9] = var10 + (var10 - var3 - var3);
      this.ax[10] = var11 + var2 - var9 - var6;
      float[] var12 = this.ax;
      float[] var13 = this.ax;
      this.ax[11] = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.ax[12] = var1.ae.am;
      this.ax[13] = var1.ae.ax;
      this.ax[14] = var1.ae.aq;
      this.ax[15] = 1.0F;
   }

   public void bk(qf var1) {
      for(int var2 = 0; var2 < this.ax.length; ++var2) {
         float[] var10000 = this.ax;
         var10000[var2] += var1.ax[var2];
      }

   }

   public float[] ck() {
      float[] var1 = new float[3];
      qv var2 = new qv(this.ax[0], this.ax[1], this.ax[2]);
      qv var3 = new qv(this.ax[4], this.ax[5], this.ax[6]);
      qv var4 = new qv(this.ax[8], this.ax[9], this.ax[10]);
      var1[0] = var2.at((byte)-87);
      var1[1] = var3.at((byte)-8);
      var1[2] = var4.at((byte)-82);
      return var1;
   }

   public float[] bb() {
      float[] var1 = new float[]{(float)(-Math.asin((double)this.ax[6])), 0.0F, 0.0F};
      double var2 = Math.cos((double)var1[0]);
      double var4;
      double var6;
      if (Math.abs(var2) > 0.005D) {
         var4 = (double)this.ax[2];
         var6 = (double)this.ax[10];
         double var8 = (double)this.ax[4];
         double var10 = (double)this.ax[5];
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         var4 = (double)this.ax[1];
         var6 = (double)this.ax[0];
         if (this.ax[6] < 0.0F) {
            var1[1] = (float)Math.atan2(var4, var6);
         } else {
            var1[1] = (float)(-Math.atan2(var4, var6));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }
}
