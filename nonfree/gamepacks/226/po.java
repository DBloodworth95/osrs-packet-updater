import java.util.HashMap;

public class po {
   static final int ar = 9;
   qg aw;
   int[] ak;
   int[] aj;
   final HashMap ap;
   static final int ay = 256;
   static int ab;
   static int[] am;
   static final float as = 3.0F;
   int ai;

   void ac(vv var1, vv var2, qg var3) {
      if (0 != var3.ak * 998816498 && var3.aj * -615213727 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (-12263868 * var3.ap == 0) {
            var4 = var1.aw - var3.ak * 1187820279;
         }

         if (0 == 1283333019 * var3.aw) {
            var5 = var1.ak - var3.aj * 1503704440;
         }

         int var6 = var4 + var1.aw * var5;
         int var7 = var2.aw * 860789119 * var3.aw + -1212502861 * var3.ap;

         for(int var8 = 0; var8 < -615213727 * var3.aj; ++var8) {
            for(int var9 = 0; var9 < var3.ak * 1187820279; ++var9) {
               int[] var10000 = var2.ap;
               int var10001 = var7++;
               var10000[var10001] += var1.ap[var6++];
            }

            var6 += var1.aw - 1187820279 * var3.ak;
            var7 += var2.aw - 1187820279 * var3.ak;
         }

      }
   }

   public po() {
      try {
         super();
         this.ap = new HashMap();
         this.aw = new qg(0, 0);
         this.ak = new int[2048];
         this.aj = new int[2048];
         this.ai = 0;
         am = new int[2000];
         int var1 = 0;
         int var2 = 240;

         int var4;
         for(byte var3 = 12; var1 < 16; var2 -= var3) {
            var4 = io.ap((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var1 / 16.0F + 0.075F));
            am[var1] = var4;
            ++var1;
         }

         var2 = 48;

         for(int var7 = var2 / 6; var1 < am.length; var2 -= var7) {
            var4 = var1 * 2;

            for(int var5 = io.ap((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < am.length; ++var1) {
               am[var1] = var5;
            }
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "po.<init>(" + ')');
      }
   }

   vv aw(int var1, int var2) {
      try {
         if (!this.ap.containsKey(var1)) {
            if (var2 <= -1462175434) {
               throw new IllegalStateException();
            }

            this.ap(var1, (byte)0);
         }

         return (vv)this.ap.get(var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "po.aw(" + ')');
      }
   }

   public final void ak(int var1, int var2, byte var3) {
      try {
         if (this.ai * -1220810763 < this.ak.length) {
            this.ak[-1220810763 * this.ai] = var1;
            this.aj[-1220810763 * this.ai] = var2;
            this.ai += -253735843;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "po.ak(" + ')');
      }
   }

   public final void aj(byte var1) {
      try {
         this.ai = 0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "po.aj(" + ')');
      }
   }

   public final void ai(int var1, int var2, vv var3, float var4, byte var5) {
      try {
         int var6 = (int)(18.0F * var4);
         vv var7 = this.aw(var6, 943299871);
         int var8 = 2 * var6 + 1;
         qg var9 = new qg(0, 0, var3.aw, var3.ak);
         qg var10 = new qg(0, 0);
         this.aw.aw(var8, var8, 1567521813);
         System.nanoTime();

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < -1220810763 * this.ai; ++var11) {
            if (var5 <= 8) {
               return;
            }

            var12 = this.ak[var11];
            var13 = this.aj[var11];
            int var14 = (int)((float)(var12 - var1) * var4) - var6;
            int var15 = (int)((float)var3.ak - (float)(var13 - var2) * var4) - var6;
            this.aw.ap(var14, var15, -2127357527);
            this.aw.aj(var9, var10, 298921472);
            this.ay(var7, var3, var10, 2122924856);
         }

         System.nanoTime();
         System.nanoTime();

         for(var11 = 0; var11 < var3.ap.length; ++var11) {
            if (var3.ap[var11] == 0) {
               if (var5 <= 8) {
                  throw new IllegalStateException();
               }

               var3.ap[var11] = -16777216;
            } else {
               var12 = (64 + var3.ap[var11] - 1) / 256;
               if (var12 <= 0) {
                  if (var5 <= 8) {
                     throw new IllegalStateException();
                  }

                  var3.ap[var11] = -16777216;
               } else {
                  if (var12 > am.length) {
                     if (var5 <= 8) {
                        throw new IllegalStateException();
                     }

                     var12 = am.length;
                  }

                  var13 = am[var12 - 1];
                  var3.ap[var11] = -16777216 | var13;
               }
            }
         }

         System.nanoTime();
      } catch (RuntimeException var16) {
         throw tm.aw(var16, "po.ai(" + ')');
      }
   }

   void ay(vv var1, vv var2, qg var3, int var4) {
      try {
         if (0 != var3.ak * 1187820279) {
            if (var4 <= -1499940165) {
               throw new IllegalStateException();
            }

            if (var3.aj * -615213727 != 0) {
               int var5 = 0;
               int var6 = 0;
               if (-1212502861 * var3.ap == 0) {
                  if (var4 <= -1499940165) {
                     throw new IllegalStateException();
                  }

                  var5 = var1.aw - var3.ak * 1187820279;
               }

               if (0 == 860789119 * var3.aw) {
                  if (var4 <= -1499940165) {
                     return;
                  }

                  var6 = var1.ak - var3.aj * -615213727;
               }

               int var7 = var5 + var1.aw * var6;
               int var8 = var2.aw * 860789119 * var3.aw + -1212502861 * var3.ap;

               for(int var9 = 0; var9 < -615213727 * var3.aj; ++var9) {
                  for(int var10 = 0; var10 < var3.ak * 1187820279; ++var10) {
                     if (var4 <= -1499940165) {
                        throw new IllegalStateException();
                     }

                     int[] var10000 = var2.ap;
                     int var10001 = var8++;
                     var10000[var10001] += var1.ap[var7++];
                  }

                  var7 += var1.aw - 1187820279 * var3.ak;
                  var8 += var2.aw - 1187820279 * var3.ak;
               }

               return;
            }

            if (var4 <= -1499940165) {
               return;
            }
         }

      } catch (RuntimeException var11) {
         throw tm.aw(var11, "po.ay(" + ')');
      }
   }

   public final void az(int var1, int var2, vv var3, float var4) {
      int var5 = (int)(18.0F * var4);
      vv var6 = this.aw(var5, 1122358477);
      int var7 = 2 * var5 + 1;
      qg var8 = new qg(0, 0, var3.aw, var3.ak);
      qg var9 = new qg(0, 0);
      this.aw.aw(var7, var7, 1117014055);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < -1220810763 * this.ai; ++var10) {
         var11 = this.ak[var10];
         var12 = this.aj[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.ak - (float)(var12 - var2) * var4) - var5;
         this.aw.ap(var13, var14, -2124097364);
         this.aw.aj(var8, var9, -1977644162);
         this.ay(var6, var3, var9, -523624335);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.ap.length; ++var10) {
         if (var3.ap[var10] == 0) {
            var3.ap[var10] = -16777216;
         } else {
            var11 = (64 + var3.ap[var10] - 1) / 256;
            if (var11 <= 0) {
               var3.ap[var10] = -16777216;
            } else {
               if (var11 > am.length) {
                  var11 = am.length;
               }

               var12 = am[var11 - 1];
               var3.ap[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   static int bs(int var0, int var1) {
      try {
         return (int)((Math.log((double)var0) / cm.bv - 7.0D) * 256.0D);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "po.bs(" + ')');
      }
   }

   void ax(vv var1, vv var2, qg var3) {
      if (0 != var3.ak * 1187820279 && var3.aj * 626449572 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (1327738552 * var3.ap == 0) {
            var4 = var1.aw - var3.ak * 1187820279;
         }

         if (0 == 860789119 * var3.aw) {
            var5 = var1.ak - var3.aj * -450090742;
         }

         int var6 = var4 + var1.aw * var5;
         int var7 = var2.aw * 860789119 * var3.aw + -1406433189 * var3.ap;

         for(int var8 = 0; var8 < -615213727 * var3.aj; ++var8) {
            for(int var9 = 0; var9 < var3.ak * 1187820279; ++var9) {
               int[] var10000 = var2.ap;
               int var10001 = var7++;
               var10000[var10001] += var1.ap[var6++];
            }

            var6 += var1.aw - 1082886098 * var3.ak;
            var7 += var2.aw - 1187820279 * var3.ak;
         }

      }
   }

   vv at(int var1) {
      if (!this.ap.containsKey(var1)) {
         this.ap(var1, (byte)0);
      }

      return (vv)this.ap.get(var1);
   }

   void as(int var1) {
      int var2 = var1 * 2 + 1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = 2 * var1 + 1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      for(int var9 = 0; var8 <= var1; ++var9) {
         double var16 = (double)(var8 - 0) / var4;
         double var14 = Math.exp(var16 * -var16 / 2.0D) / Math.sqrt(6.283185307179586D);
         double var12 = var14 / var4;
         var7[var9] = var12;
         ++var8;
      }

      double[] var18 = var7;
      double var19 = var7[var1] * var7[var1];
      int[] var20 = new int[var2 * var2];
      boolean var10 = false;

      for(int var11 = 0; var11 < var2; ++var11) {
         for(int var22 = 0; var22 < var2; ++var22) {
            int var13 = var20[var22 + var11 * var2] = (int)(256.0D * (var18[var22] * var18[var11] / var19));
            if (!var10 && var13 > 0) {
               var10 = true;
            }
         }
      }

      vv var21 = new vv(var20, var2, var2);
      this.ap.put(var1, var21);
   }

   vv am(int var1) {
      if (!this.ap.containsKey(var1)) {
         this.ap(var1, (byte)0);
      }

      return (vv)this.ap.get(var1);
   }

   public final void ao(int var1, int var2) {
      if (this.ai * -1220810763 < this.ak.length) {
         this.ak[-1220810763 * this.ai] = var1;
         this.aj[-1220810763 * this.ai] = var2;
         this.ai += -253735843;
      }
   }

   public final void af() {
      this.ai = 0;
   }

   public final void ar() {
      this.ai = 0;
   }

   public final void ab(int var1, int var2, vv var3, float var4) {
      int var5 = (int)(18.0F * var4);
      vv var6 = this.aw(var5, 2089073898);
      int var7 = 2 * var5 + 1;
      qg var8 = new qg(0, 0, var3.aw, var3.ak);
      qg var9 = new qg(0, 0);
      this.aw.aw(var7, var7, 1471187443);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < 2087788475 * this.ai; ++var10) {
         var11 = this.ak[var10];
         var12 = this.aj[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.ak - (float)(var12 - var2) * var4) - var5;
         this.aw.ap(var13, var14, -1994169745);
         this.aw.aj(var8, var9, -391127885);
         this.ay(var6, var3, var9, -63736534);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.ap.length; ++var10) {
         if (var3.ap[var10] == 0) {
            var3.ap[var10] = -16777216;
         } else {
            var11 = (64 + var3.ap[var10] - 1) / 256;
            if (var11 <= 0) {
               var3.ap[var10] = -16777216;
            } else {
               if (var11 > am.length) {
                  var11 = am.length;
               }

               var12 = am[var11 - 1];
               var3.ap[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   void ae(int var1) {
      int var2 = var1 * 2 + 1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = 2 * var1 + 1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      for(int var9 = 0; var8 <= var1; ++var9) {
         double var16 = (double)(var8 - 0) / var4;
         double var14 = Math.exp(var16 * -var16 / 2.0D) / Math.sqrt(6.283185307179586D);
         double var12 = var14 / var4;
         var7[var9] = var12;
         ++var8;
      }

      double[] var18 = var7;
      double var19 = var7[var1] * var7[var1];
      int[] var20 = new int[var2 * var2];
      boolean var10 = false;

      for(int var11 = 0; var11 < var2; ++var11) {
         for(int var22 = 0; var22 < var2; ++var22) {
            int var13 = var20[var22 + var11 * var2] = (int)(256.0D * (var18[var22] * var18[var11] / var19));
            if (!var10 && var13 > 0) {
               var10 = true;
            }
         }
      }

      vv var21 = new vv(var20, var2, var2);
      this.ap.put(var1, var21);
   }

   public final void ag(int var1, int var2, vv var3, float var4) {
      int var5 = (int)(18.0F * var4);
      vv var6 = this.aw(var5, 1478145757);
      int var7 = 2 * var5 + 1;
      qg var8 = new qg(0, 0, var3.aw, var3.ak);
      qg var9 = new qg(0, 0);
      this.aw.aw(var7, var7, 1072763316);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < 1329942900 * this.ai; ++var10) {
         var11 = this.ak[var10];
         var12 = this.aj[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.ak - (float)(var12 - var2) * var4) - var5;
         this.aw.ap(var13, var14, -1960168725);
         this.aw.aj(var8, var9, -1238758927);
         this.ay(var6, var3, var9, 534338271);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.ap.length; ++var10) {
         if (var3.ap[var10] == 0) {
            var3.ap[var10] = -16777216;
         } else {
            var11 = (2146831808 + var3.ap[var10] - 1) / 256;
            if (var11 <= 0) {
               var3.ap[var10] = -16777216;
            } else {
               if (var11 > am.length) {
                  var11 = am.length;
               }

               var12 = am[var11 - 1];
               var3.ap[var10] = -544529501 | var12;
            }
         }
      }

      System.nanoTime();
   }

   public final void ad(int var1, int var2, vv var3, float var4) {
      int var5 = (int)(18.0F * var4);
      vv var6 = this.aw(var5, -1087211070);
      int var7 = 2 * var5 + 1;
      qg var8 = new qg(0, 0, var3.aw, var3.ak);
      qg var9 = new qg(0, 0);
      this.aw.aw(var7, var7, 1866634707);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < -1220810763 * this.ai; ++var10) {
         var11 = this.ak[var10];
         var12 = this.aj[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.ak - (float)(var12 - var2) * var4) - var5;
         this.aw.ap(var13, var14, -2043577336);
         this.aw.aj(var8, var9, 1622728967);
         this.ay(var6, var3, var9, 1988847808);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.ap.length; ++var10) {
         if (var3.ap[var10] == 0) {
            var3.ap[var10] = -16777216;
         } else {
            var11 = (64 + var3.ap[var10] - 1) / 256;
            if (var11 <= 0) {
               var3.ap[var10] = -16777216;
            } else {
               if (var11 > am.length) {
                  var11 = am.length;
               }

               var12 = am[var11 - 1];
               var3.ap[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   public final void au(int var1, int var2) {
      if (this.ai * 177281963 < this.ak.length) {
         this.ak[-41115851 * this.ai] = var1;
         this.aj[-1220810763 * this.ai] = var2;
         this.ai += -887648858;
      }
   }

   void av(vv var1, vv var2, qg var3) {
      if (0 != var3.ak * 1187820279 && var3.aj * -615213727 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (-1212502861 * var3.ap == 0) {
            var4 = var1.aw - var3.ak * 1187820279;
         }

         if (0 == 860789119 * var3.aw) {
            var5 = var1.ak - var3.aj * -615213727;
         }

         int var6 = var4 + var1.aw * var5;
         int var7 = var2.aw * 860789119 * var3.aw + -1212502861 * var3.ap;

         for(int var8 = 0; var8 < -615213727 * var3.aj; ++var8) {
            for(int var9 = 0; var9 < var3.ak * 1187820279; ++var9) {
               int[] var10000 = var2.ap;
               int var10001 = var7++;
               var10000[var10001] += var1.ap[var6++];
            }

            var6 += var1.aw - 1187820279 * var3.ak;
            var7 += var2.aw - 1187820279 * var3.ak;
         }

      }
   }

   void ap(int var1, byte var2) {
      try {
         int var3 = var1 * 2 + 1;
         double var5 = (double)((float)var1 / 3.0F);
         int var7 = 2 * var1 + 1;
         double[] var8 = new double[var7];
         int var9 = -var1;

         for(int var10 = 0; var9 <= var1; ++var10) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            double var17 = (double)(var9 - 0) / var5;
            double var15 = Math.exp(var17 * -var17 / 2.0D) / Math.sqrt(6.283185307179586D);
            double var13 = var15 / var5;
            var8[var10] = var13;
            ++var9;
         }

         double[] var20 = var8;
         double var21 = var8[var1] * var8[var1];
         int[] var22 = new int[var3 * var3];
         boolean var11 = false;

         for(int var12 = 0; var12 < var3; ++var12) {
            if (var2 != 0) {
               return;
            }

            for(int var24 = 0; var24 < var3; ++var24) {
               if (var2 != 0) {
                  return;
               }

               int var14 = var22[var24 + var12 * var3] = (int)(256.0D * (var20[var24] * var20[var12] / var21));
               if (!var11) {
                  if (var2 != 0) {
                     return;
                  }

                  if (var14 > 0) {
                     if (var2 != 0) {
                        throw new IllegalStateException();
                     }

                     var11 = true;
                  }
               }
            }
         }

         vv var23 = new vv(var22, var3, var3);
         this.ap.put(var1, var23);
      } catch (RuntimeException var19) {
         throw tm.aw(var19, "po.ap(" + ')');
      }
   }

   void aq(vv var1, vv var2, qg var3) {
      if (0 != var3.ak * 1187820279 && var3.aj * -615213727 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (-1212502861 * var3.ap == 0) {
            var4 = var1.aw - var3.ak * 1187820279;
         }

         if (0 == 860789119 * var3.aw) {
            var5 = var1.ak - var3.aj * -615213727;
         }

         int var6 = var4 + var1.aw * var5;
         int var7 = var2.aw * 860789119 * var3.aw + -1212502861 * var3.ap;

         for(int var8 = 0; var8 < -615213727 * var3.aj; ++var8) {
            for(int var9 = 0; var9 < var3.ak * 1187820279; ++var9) {
               int[] var10000 = var2.ap;
               int var10001 = var7++;
               var10000[var10001] += var1.ap[var6++];
            }

            var6 += var1.aw - 1187820279 * var3.ak;
            var7 += var2.aw - 1187820279 * var3.ak;
         }

      }
   }

   static void iw(dv var0, int var1, int var2, int var3) {
      try {
         if (var1 == -1489920319 * var0.cs) {
            if (var3 != -1641914029) {
               throw new IllegalStateException();
            }

            if (var1 != -1) {
               if (var3 != -1641914029) {
                  throw new IllegalStateException();
               }

               int var4 = ng.ap(var1, (short)793).bv * -1713937817;
               if (var4 == 1) {
                  var0.cr = 0;
                  var0.ck = 0;
                  var0.dq = var2 * 421413589;
                  var0.dd = 0;
               }

               if (var4 == 2) {
                  if (var3 != -1641914029) {
                     throw new IllegalStateException();
                  }

                  var0.dd = 0;
               }

               return;
            }
         }

         if (-1 != var1) {
            if (var3 != -1641914029) {
               throw new IllegalStateException();
            }

            if (var0.cs * -1489920319 != -1) {
               if (var3 != -1641914029) {
                  return;
               }

               if (ng.ap(var1, (short)-16076).ax * 759834377 < ng.ap(-1489920319 * var0.cs, (short)-23147).ax * 759834377) {
                  return;
               }

               if (var3 != -1641914029) {
                  throw new IllegalStateException();
               }
            }
         }

         var0.cs = var1 * 364114241;
         var0.cr = 0;
         var0.ck = 0;
         var0.dq = 421413589 * var2;
         var0.dd = 0;
         var0.ev = var0.de * -1673883697;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "po.iw(" + ')');
      }
   }

   public final void an(int var1, int var2) {
      if (this.ai * -1220810763 < this.ak.length) {
         this.ak[-1220810763 * this.ai] = var1;
         this.aj[-1220810763 * this.ai] = var2;
         this.ai += -253735843;
      }
   }
}
