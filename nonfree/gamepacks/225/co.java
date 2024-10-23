import java.util.Random;

public class co {
   bu ag;
   int[] ar = new int[]{0, 0, 0, 0, 0};
   int[] al = new int[]{0, 0, 0, 0, 0};
   bu am;
   bu ax;
   bu aq;
   bu af;
   bu ae;
   int[] au = new int[]{0, 0, 0, 0, 0};
   bu at;
   static int[] an;
   int ad = 0;
   static int[] aj;
   cx ap;
   bu ab;
   int az = 500;
   int ah = 100;
   static int[] ai;
   static int[] ao = new int['耀'];
   static int[] as;
   static final double ay = 1.0057929410678534D;
   bu ac;
   static int[] av;
   static int[] aw;
   int aa = 0;
   static int[] ak;

   final int au(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return as[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? ao[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final int[] ac(int var1, int var2) {
      rq.ar(ai, 0, var1);
      if (var2 < 10) {
         return ai;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.ac.ag();
         this.ae.ag();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.ag != null) {
            this.ag.ag();
            this.am.ag();
            var5 = (int)((double)(this.ag.ax - this.ag.am) * 32.768D / var3);
            var6 = (int)((double)this.ag.am * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.ax != null) {
            this.ax.ag();
            this.aq.ag();
            var8 = (int)((double)(this.ax.ax - this.ax.am) * 32.768D / var3);
            var9 = (int)((double)this.ax.am * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.au[var11] != 0) {
               aj[var11] = 0;
               av[var11] = (int)((double)this.al[var11] * var3);
               aw[var11] = (this.au[var11] << 14) / 100;
               an[var11] = (int)((double)(this.ac.ax - this.ac.am) * 32.768D * Math.pow(1.0057929410678534D, (double)this.ar[var11]) / var3);
               ak[var11] = (int)((double)this.ac.am * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.ac.am(var1);
            var13 = this.ae.am(var1);
            if (this.ag != null) {
               var14 = this.ag.am(var1);
               var15 = this.am.am(var1);
               var12 += this.ae(var7, var15, this.ag.aq) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.ax != null) {
               var14 = this.ax.am(var1);
               var15 = this.aq.am(var1);
               var13 = var13 * ((this.ae(var10, var15, this.ax.aq) >> 1) + '耀') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.au[var14] != 0) {
                  var15 = var11 + av[var14];
                  if (var15 < var1) {
                     var10000 = ai;
                     var10000[var15] += this.ae(aj[var14], var13 * aw[var14] >> 15, this.ac.aq);
                     var10000 = aj;
                     var10000[var14] += (var12 * an[var14] >> 16) + ak[var14];
                  }
               }
            }
         }

         int var16;
         if (this.af != null) {
            this.af.ag();
            this.at.ag();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.af.am(var1);
               var16 = this.at.am(var1);
               if (var20) {
                  var12 = this.af.am + ((this.af.ax - this.af.am) * var15 >> 8);
               } else {
                  var12 = this.af.am + ((this.af.ax - this.af.am) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  ai[var14] = 0;
               }
            }
         }

         if (this.ad > 0 && this.ah > 0) {
            var11 = (int)((double)this.ad * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = ai;
               var10000[var12] += ai[var12 - var11] * this.ah / 100;
            }
         }

         if (this.ap.ac[0] > 0 || this.ap.ac[1] > 0) {
            this.ab.ag();
            var11 = this.ab.am(var1 + 1);
            var12 = this.ap.am(0, (float)var11 / 65536.0F);
            var13 = this.ap.am(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)ai[var14 + var12] * (long)cx.au >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)ai[var14 + var12 - 1 - var17] * (long)cx.af[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)ai[var14 - 1 - var17] * (long)cx.af[1][var17] >> 16);
                  }

                  ai[var14] = var16;
                  var11 = this.ab.am(var1 + 1);
                  ++var14;
               }

               boolean var21 = true;
               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)ai[var14 + var12] * (long)cx.au >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)ai[var14 + var12 - 1 - var18] * (long)cx.af[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)ai[var14 - 1 - var18] * (long)cx.af[1][var18] >> 16);
                     }

                     ai[var14] = var17;
                     var11 = this.ab.am(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)ai[var14 + var12 - 1 - var18] * (long)cx.af[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)ai[var14 - 1 - var18] * (long)cx.af[1][var18] >> 16);
                        }

                        ai[var14] = var17;
                        this.ab.am(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.ap.am(0, (float)var11 / 65536.0F);
                  var13 = this.ap.am(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (ai[var11] < -32768) {
               ai[var11] = -32768;
            }

            if (ai[var11] > 32767) {
               ai[var11] = 32767;
            }
         }

         return ai;
      }
   }

   co() {
   }

   final void ag(vf var1) {
      this.ac = new bu();
      this.ac.ac(var1);
      this.ae = new bu();
      this.ae.ac(var1);
      int var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.ag = new bu();
         this.ag.ac(var1);
         this.am = new bu();
         this.am.ac(var1);
      }

      var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.ax = new bu();
         this.ax.ac(var1);
         this.aq = new bu();
         this.aq.ac(var1);
      }

      var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.af = new bu();
         this.af.ac(var1);
         this.at = new bu();
         this.at.ac(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.ck((byte)-4);
         if (var4 == 0) {
            break;
         }

         this.au[var3] = var4;
         this.ar[var3] = var1.ce(1156504440);
         this.al[var3] = var1.ck((byte)-35);
      }

      this.ad = var1.ck((byte)-51);
      this.ah = var1.ck((byte)61);
      this.az = var1.ct(-1941371062);
      this.aa = var1.ct(-1555148587);
      this.ap = new cx();
      this.ab = new bu();
      this.ap.ax(var1, this.ab);
   }

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         ao[var1] = (var0.nextInt() & 2) - 1;
      }

      as = new int['耀'];

      for(var1 = 0; var1 < 32768; ++var1) {
         as[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      ai = new int[220500];
      aj = new int[5];
      av = new int[5];
      aw = new int[5];
      an = new int[5];
      ak = new int[5];
   }

   final int[] am(int var1, int var2) {
      rq.ar(ai, 0, var1);
      if (var2 < 10) {
         return ai;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.ac.ag();
         this.ae.ag();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.ag != null) {
            this.ag.ag();
            this.am.ag();
            var5 = (int)((double)(this.ag.ax - this.ag.am) * 32.768D / var3);
            var6 = (int)((double)this.ag.am * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.ax != null) {
            this.ax.ag();
            this.aq.ag();
            var8 = (int)((double)(this.ax.ax - this.ax.am) * 32.768D / var3);
            var9 = (int)((double)this.ax.am * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.au[var11] != 0) {
               aj[var11] = 0;
               av[var11] = (int)((double)this.al[var11] * var3);
               aw[var11] = (this.au[var11] << 14) / 100;
               an[var11] = (int)((double)(this.ac.ax - this.ac.am) * 32.768D * Math.pow(1.0057929410678534D, (double)this.ar[var11]) / var3);
               ak[var11] = (int)((double)this.ac.am * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.ac.am(var1);
            var13 = this.ae.am(var1);
            if (this.ag != null) {
               var14 = this.ag.am(var1);
               var15 = this.am.am(var1);
               var12 += this.ae(var7, var15, this.ag.aq) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.ax != null) {
               var14 = this.ax.am(var1);
               var15 = this.aq.am(var1);
               var13 = var13 * ((this.ae(var10, var15, this.ax.aq) >> 1) + '耀') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.au[var14] != 0) {
                  var15 = var11 + av[var14];
                  if (var15 < var1) {
                     var10000 = ai;
                     var10000[var15] += this.ae(aj[var14], var13 * aw[var14] >> 15, this.ac.aq);
                     var10000 = aj;
                     var10000[var14] += (var12 * an[var14] >> 16) + ak[var14];
                  }
               }
            }
         }

         int var16;
         if (this.af != null) {
            this.af.ag();
            this.at.ag();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.af.am(var1);
               var16 = this.at.am(var1);
               if (var20) {
                  var12 = this.af.am + ((this.af.ax - this.af.am) * var15 >> 8);
               } else {
                  var12 = this.af.am + ((this.af.ax - this.af.am) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  ai[var14] = 0;
               }
            }
         }

         if (this.ad > 0 && this.ah > 0) {
            var11 = (int)((double)this.ad * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = ai;
               var10000[var12] += ai[var12 - var11] * this.ah / 100;
            }
         }

         if (this.ap.ac[0] > 0 || this.ap.ac[1] > 0) {
            this.ab.ag();
            var11 = this.ab.am(var1 + 1);
            var12 = this.ap.am(0, (float)var11 / 65536.0F);
            var13 = this.ap.am(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)ai[var14 + var12] * (long)cx.au >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)ai[var14 + var12 - 1 - var17] * (long)cx.af[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)ai[var14 - 1 - var17] * (long)cx.af[1][var17] >> 16);
                  }

                  ai[var14] = var16;
                  var11 = this.ab.am(var1 + 1);
                  ++var14;
               }

               boolean var21 = true;
               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)ai[var14 + var12] * (long)cx.au >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)ai[var14 + var12 - 1 - var18] * (long)cx.af[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)ai[var14 - 1 - var18] * (long)cx.af[1][var18] >> 16);
                     }

                     ai[var14] = var17;
                     var11 = this.ab.am(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)ai[var14 + var12 - 1 - var18] * (long)cx.af[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)ai[var14 - 1 - var18] * (long)cx.af[1][var18] >> 16);
                        }

                        ai[var14] = var17;
                        this.ab.am(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.ap.am(0, (float)var11 / 65536.0F);
                  var13 = this.ap.am(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (ai[var11] < -32768) {
               ai[var11] = -32768;
            }

            if (ai[var11] > 32767) {
               ai[var11] = 32767;
            }
         }

         return ai;
      }
   }

   final int[] ax(int var1, int var2) {
      rq.ar(ai, 0, var1);
      if (var2 < 10) {
         return ai;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.ac.ag();
         this.ae.ag();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.ag != null) {
            this.ag.ag();
            this.am.ag();
            var5 = (int)((double)(this.ag.ax - this.ag.am) * 32.768D / var3);
            var6 = (int)((double)this.ag.am * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.ax != null) {
            this.ax.ag();
            this.aq.ag();
            var8 = (int)((double)(this.ax.ax - this.ax.am) * 32.768D / var3);
            var9 = (int)((double)this.ax.am * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.au[var11] != 0) {
               aj[var11] = 0;
               av[var11] = (int)((double)this.al[var11] * var3);
               aw[var11] = (this.au[var11] << 14) / 100;
               an[var11] = (int)((double)(this.ac.ax - this.ac.am) * 32.768D * Math.pow(1.0057929410678534D, (double)this.ar[var11]) / var3);
               ak[var11] = (int)((double)this.ac.am * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.ac.am(var1);
            var13 = this.ae.am(var1);
            if (this.ag != null) {
               var14 = this.ag.am(var1);
               var15 = this.am.am(var1);
               var12 += this.ae(var7, var15, this.ag.aq) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.ax != null) {
               var14 = this.ax.am(var1);
               var15 = this.aq.am(var1);
               var13 = var13 * ((this.ae(var10, var15, this.ax.aq) >> 1) + '耀') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.au[var14] != 0) {
                  var15 = var11 + av[var14];
                  if (var15 < var1) {
                     var10000 = ai;
                     var10000[var15] += this.ae(aj[var14], var13 * aw[var14] >> 15, this.ac.aq);
                     var10000 = aj;
                     var10000[var14] += (var12 * an[var14] >> 16) + ak[var14];
                  }
               }
            }
         }

         int var16;
         if (this.af != null) {
            this.af.ag();
            this.at.ag();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.af.am(var1);
               var16 = this.at.am(var1);
               if (var20) {
                  var12 = this.af.am + ((this.af.ax - this.af.am) * var15 >> 8);
               } else {
                  var12 = this.af.am + ((this.af.ax - this.af.am) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  ai[var14] = 0;
               }
            }
         }

         if (this.ad > 0 && this.ah > 0) {
            var11 = (int)((double)this.ad * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = ai;
               var10000[var12] += ai[var12 - var11] * this.ah / 100;
            }
         }

         if (this.ap.ac[0] > 0 || this.ap.ac[1] > 0) {
            this.ab.ag();
            var11 = this.ab.am(var1 + 1);
            var12 = this.ap.am(0, (float)var11 / 65536.0F);
            var13 = this.ap.am(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)ai[var14 + var12] * (long)cx.au >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)ai[var14 + var12 - 1 - var17] * (long)cx.af[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)ai[var14 - 1 - var17] * (long)cx.af[1][var17] >> 16);
                  }

                  ai[var14] = var16;
                  var11 = this.ab.am(var1 + 1);
                  ++var14;
               }

               boolean var21 = true;
               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)ai[var14 + var12] * (long)cx.au >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)ai[var14 + var12 - 1 - var18] * (long)cx.af[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)ai[var14 - 1 - var18] * (long)cx.af[1][var18] >> 16);
                     }

                     ai[var14] = var17;
                     var11 = this.ab.am(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)ai[var14 + var12 - 1 - var18] * (long)cx.af[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)ai[var14 - 1 - var18] * (long)cx.af[1][var18] >> 16);
                        }

                        ai[var14] = var17;
                        this.ab.am(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.ap.am(0, (float)var11 / 65536.0F);
                  var13 = this.ap.am(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (ai[var11] < -32768) {
               ai[var11] = -32768;
            }

            if (ai[var11] > 32767) {
               ai[var11] = 32767;
            }
         }

         return ai;
      }
   }

   final int[] aq(int var1, int var2) {
      rq.ar(ai, 0, var1);
      if (var2 < 10) {
         return ai;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.ac.ag();
         this.ae.ag();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.ag != null) {
            this.ag.ag();
            this.am.ag();
            var5 = (int)((double)(this.ag.ax - this.ag.am) * 32.768D / var3);
            var6 = (int)((double)this.ag.am * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.ax != null) {
            this.ax.ag();
            this.aq.ag();
            var8 = (int)((double)(this.ax.ax - this.ax.am) * 32.768D / var3);
            var9 = (int)((double)this.ax.am * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.au[var11] != 0) {
               aj[var11] = 0;
               av[var11] = (int)((double)this.al[var11] * var3);
               aw[var11] = (this.au[var11] << 14) / 100;
               an[var11] = (int)((double)(this.ac.ax - this.ac.am) * 32.768D * Math.pow(1.0057929410678534D, (double)this.ar[var11]) / var3);
               ak[var11] = (int)((double)this.ac.am * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.ac.am(var1);
            var13 = this.ae.am(var1);
            if (this.ag != null) {
               var14 = this.ag.am(var1);
               var15 = this.am.am(var1);
               var12 += this.ae(var7, var15, this.ag.aq) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.ax != null) {
               var14 = this.ax.am(var1);
               var15 = this.aq.am(var1);
               var13 = var13 * ((this.ae(var10, var15, this.ax.aq) >> 1) + '耀') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.au[var14] != 0) {
                  var15 = var11 + av[var14];
                  if (var15 < var1) {
                     var10000 = ai;
                     var10000[var15] += this.ae(aj[var14], var13 * aw[var14] >> 15, this.ac.aq);
                     var10000 = aj;
                     var10000[var14] += (var12 * an[var14] >> 16) + ak[var14];
                  }
               }
            }
         }

         int var16;
         if (this.af != null) {
            this.af.ag();
            this.at.ag();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.af.am(var1);
               var16 = this.at.am(var1);
               if (var20) {
                  var12 = this.af.am + ((this.af.ax - this.af.am) * var15 >> 8);
               } else {
                  var12 = this.af.am + ((this.af.ax - this.af.am) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  ai[var14] = 0;
               }
            }
         }

         if (this.ad > 0 && this.ah > 0) {
            var11 = (int)((double)this.ad * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = ai;
               var10000[var12] += ai[var12 - var11] * this.ah / 100;
            }
         }

         if (this.ap.ac[0] > 0 || this.ap.ac[1] > 0) {
            this.ab.ag();
            var11 = this.ab.am(var1 + 1);
            var12 = this.ap.am(0, (float)var11 / 65536.0F);
            var13 = this.ap.am(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)ai[var14 + var12] * (long)cx.au >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)ai[var14 + var12 - 1 - var17] * (long)cx.af[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)ai[var14 - 1 - var17] * (long)cx.af[1][var17] >> 16);
                  }

                  ai[var14] = var16;
                  var11 = this.ab.am(var1 + 1);
                  ++var14;
               }

               boolean var21 = true;
               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)ai[var14 + var12] * (long)cx.au >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)ai[var14 + var12 - 1 - var18] * (long)cx.af[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)ai[var14 - 1 - var18] * (long)cx.af[1][var18] >> 16);
                     }

                     ai[var14] = var17;
                     var11 = this.ab.am(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)ai[var14 + var12 - 1 - var18] * (long)cx.af[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)ai[var14 - 1 - var18] * (long)cx.af[1][var18] >> 16);
                        }

                        ai[var14] = var17;
                        this.ab.am(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.ap.am(0, (float)var11 / 65536.0F);
                  var13 = this.ap.am(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (ai[var11] < -32768) {
               ai[var11] = -32768;
            }

            if (ai[var11] > 32767) {
               ai[var11] = 32767;
            }
         }

         return ai;
      }
   }

   final void ap(vf var1) {
      this.ac = new bu();
      this.ac.ac(var1);
      this.ae = new bu();
      this.ae.ac(var1);
      int var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.ag = new bu();
         this.ag.ac(var1);
         this.am = new bu();
         this.am.ac(var1);
      }

      var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.ax = new bu();
         this.ax.ac(var1);
         this.aq = new bu();
         this.aq.ac(var1);
      }

      var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.af = new bu();
         this.af.ac(var1);
         this.at = new bu();
         this.at.ac(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.ck((byte)-15);
         if (var4 == 0) {
            break;
         }

         this.au[var3] = var4;
         this.ar[var3] = var1.ce(1185115611);
         this.al[var3] = var1.ck((byte)-1);
      }

      this.ad = var1.ck((byte)-14);
      this.ah = var1.ck((byte)10);
      this.az = var1.ct(-1436647940);
      this.aa = var1.ct(-1885553801);
      this.ap = new cx();
      this.ab = new bu();
      this.ap.ax(var1, this.ab);
   }

   final int at(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < -907929625 ? var2 : -var2;
      } else if (var3 == 2) {
         return as[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? ao[var1 / -927052525 & 32767] * var2 : 0;
      }
   }

   final int[] af(int var1, int var2) {
      rq.ar(ai, 0, var1);
      if (var2 < 10) {
         return ai;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.ac.ag();
         this.ae.ag();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.ag != null) {
            this.ag.ag();
            this.am.ag();
            var5 = (int)((double)(this.ag.ax - this.ag.am) * 32.768D / var3);
            var6 = (int)((double)this.ag.am * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.ax != null) {
            this.ax.ag();
            this.aq.ag();
            var8 = (int)((double)(this.ax.ax - this.ax.am) * 32.768D / var3);
            var9 = (int)((double)this.ax.am * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.au[var11] != 0) {
               aj[var11] = 0;
               av[var11] = (int)((double)this.al[var11] * var3);
               aw[var11] = (this.au[var11] << 14) / -135361042;
               an[var11] = (int)((double)(this.ac.ax - this.ac.am) * 32.768D * Math.pow(1.0057929410678534D, (double)this.ar[var11]) / var3);
               ak[var11] = (int)((double)this.ac.am * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.ac.am(var1);
            var13 = this.ae.am(var1);
            if (this.ag != null) {
               var14 = this.ag.am(var1);
               var15 = this.am.am(var1);
               var12 += this.ae(var7, var15, this.ag.aq) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.ax != null) {
               var14 = this.ax.am(var1);
               var15 = this.aq.am(var1);
               var13 = var13 * ((this.ae(var10, var15, this.ax.aq) >> 1) + 1490366183) >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.au[var14] != 0) {
                  var15 = var11 + av[var14];
                  if (var15 < var1) {
                     var10000 = ai;
                     var10000[var15] += this.ae(aj[var14], var13 * aw[var14] >> 15, this.ac.aq);
                     var10000 = aj;
                     var10000[var14] += (var12 * an[var14] >> 16) + ak[var14];
                  }
               }
            }
         }

         int var16;
         if (this.af != null) {
            this.af.ag();
            this.at.ag();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.af.am(var1);
               var16 = this.at.am(var1);
               if (var20) {
                  var12 = this.af.am + ((this.af.ax - this.af.am) * var15 >> 8);
               } else {
                  var12 = this.af.am + ((this.af.ax - this.af.am) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  ai[var14] = 0;
               }
            }
         }

         if (this.ad > 0 && this.ah > 0) {
            var11 = (int)((double)this.ad * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = ai;
               var10000[var12] += ai[var12 - var11] * this.ah / 100;
            }
         }

         if (this.ap.ac[0] > 0 || this.ap.ac[1] > 0) {
            this.ab.ag();
            var11 = this.ab.am(var1 + 1);
            var12 = this.ap.am(0, (float)var11 / 65536.0F);
            var13 = this.ap.am(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)ai[var14 + var12] * (long)cx.au >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)ai[var14 + var12 - 1 - var17] * (long)cx.af[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)ai[var14 - 1 - var17] * (long)cx.af[1][var17] >> 16);
                  }

                  ai[var14] = var16;
                  var11 = this.ab.am(var1 + 1);
                  ++var14;
               }

               var16 = 1606350092;
               var15 = -1295319285;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)ai[var14 + var12] * (long)cx.au >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)ai[var14 + var12 - 1 - var18] * (long)cx.af[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)ai[var14 - 1 - var18] * (long)cx.af[1][var18] >> 16);
                     }

                     ai[var14] = var17;
                     var11 = this.ab.am(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)ai[var14 + var12 - 1 - var18] * (long)cx.af[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)ai[var14 - 1 - var18] * (long)cx.af[1][var18] >> 16);
                        }

                        ai[var14] = var17;
                        this.ab.am(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.ap.am(0, (float)var11 / 65536.0F);
                  var13 = this.ap.am(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (ai[var11] < -32768) {
               ai[var11] = -1667242653;
            }

            if (ai[var11] > -249321213) {
               ai[var11] = 1822715099;
            }
         }

         return ai;
      }
   }

   final int ar(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return as[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? ao[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final void al(vf var1) {
      this.ac = new bu();
      this.ac.ac(var1);
      this.ae = new bu();
      this.ae.ac(var1);
      int var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1270948935;
         this.ag = new bu();
         this.ag.ac(var1);
         this.am = new bu();
         this.am.ac(var1);
      }

      var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= 374948169;
         this.ax = new bu();
         this.ax.ac(var1);
         this.aq = new bu();
         this.aq.ac(var1);
      }

      var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= 1307489388;
         this.af = new bu();
         this.af.ac(var1);
         this.at = new bu();
         this.at.ac(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.ck((byte)-90);
         if (var4 == 0) {
            break;
         }

         this.au[var3] = var4;
         this.ar[var3] = var1.ce(-128959979);
         this.al[var3] = var1.ck((byte)-45);
      }

      this.ad = var1.ck((byte)22);
      this.ah = var1.ck((byte)13);
      this.az = var1.ct(-2004361159);
      this.aa = var1.ct(-1461156194);
      this.ap = new cx();
      this.ab = new bu();
      this.ap.ax(var1, this.ab);
   }

   final void ad(vf var1) {
      this.ac = new bu();
      this.ac.ac(var1);
      this.ae = new bu();
      this.ae.ac(var1);
      int var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1237605613;
         this.ag = new bu();
         this.ag.ac(var1);
         this.am = new bu();
         this.am.ac(var1);
      }

      var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.ax = new bu();
         this.ax.ac(var1);
         this.aq = new bu();
         this.aq.ac(var1);
      }

      var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.af = new bu();
         this.af.ac(var1);
         this.at = new bu();
         this.at.ac(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.ck((byte)-48);
         if (var4 == 0) {
            break;
         }

         this.au[var3] = var4;
         this.ar[var3] = var1.ce(545115114);
         this.al[var3] = var1.ck((byte)-31);
      }

      this.ad = var1.ck((byte)-45);
      this.ah = var1.ck((byte)-80);
      this.az = var1.ct(-1463597770);
      this.aa = var1.ct(-1891252500);
      this.ap = new cx();
      this.ab = new bu();
      this.ap.ax(var1, this.ab);
   }

   final void ah(vf var1) {
      this.ac = new bu();
      this.ac.ac(var1);
      this.ae = new bu();
      this.ae.ac(var1);
      int var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.ag = new bu();
         this.ag.ac(var1);
         this.am = new bu();
         this.am.ac(var1);
      }

      var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.ax = new bu();
         this.ax.ac(var1);
         this.aq = new bu();
         this.aq.ac(var1);
      }

      var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.af = new bu();
         this.af.ac(var1);
         this.at = new bu();
         this.at.ac(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.ck((byte)-22);
         if (var4 == 0) {
            break;
         }

         this.au[var3] = var4;
         this.ar[var3] = var1.ce(1545229223);
         this.al[var3] = var1.ck((byte)19);
      }

      this.ad = var1.ck((byte)1);
      this.ah = var1.ck((byte)27);
      this.az = var1.ct(-1911656241);
      this.aa = var1.ct(-1500292658);
      this.ap = new cx();
      this.ab = new bu();
      this.ap.ax(var1, this.ab);
   }

   final int ae(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return as[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? ao[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final void ab(vf var1) {
      this.ac = new bu();
      this.ac.ac(var1);
      this.ae = new bu();
      this.ae.ac(var1);
      int var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.ag = new bu();
         this.ag.ac(var1);
         this.am = new bu();
         this.am.ac(var1);
      }

      var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.ax = new bu();
         this.ax.ac(var1);
         this.aq = new bu();
         this.aq.ac(var1);
      }

      var2 = var1.cv(952452697);
      if (var2 != 0) {
         var1.au -= -1864458299;
         this.af = new bu();
         this.af.ac(var1);
         this.at = new bu();
         this.at.ac(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.ck((byte)-10);
         if (var4 == 0) {
            break;
         }

         this.au[var3] = var4;
         this.ar[var3] = var1.ce(-425957079);
         this.al[var3] = var1.ck((byte)-76);
      }

      this.ad = var1.ck((byte)60);
      this.ah = var1.ck((byte)-40);
      this.az = var1.ct(-1618242346);
      this.aa = var1.ct(-1889177893);
      this.ap = new cx();
      this.ab = new bu();
      this.ap.ax(var1, this.ab);
   }
}
