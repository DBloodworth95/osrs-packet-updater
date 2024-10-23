import java.util.Random;

public class cv {
   int an = 0;
   bo aw;
   bo ak;
   static int[] ac;
   bo ai;
   bo ap;
   bo as;
   bo ae;
   int[] am = new int[]{0, 0, 0, 0, 0};
   int ao = 100;
   int[] au = new int[]{0, 0, 0, 0, 0};
   int az = 0;
   int[] at = new int[]{0, 0, 0, 0, 0};
   static int[] al;
   bo ar;
   int ab = 500;
   cf af;
   static int[] ag;
   static int[] ad = new int['耀'];
   bo aj;
   bo ay;
   static int[] ax;
   static int[] aq;
   static final double av = 1.0057929410678534D;
   static int[] aa;
   static int[] ah;

   final int[] ap(int var1, int var2) {
      rb.at(ag, 0, var1);
      if (var2 < 10) {
         return ag;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.ap.ak();
         this.aw.ak();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.ak != null) {
            this.ak.ak();
            this.aj.ak();
            var5 = (int)((double)(this.ak.ai - this.ak.aj) * 32.768D / var3);
            var6 = (int)((double)this.ak.aj * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.ai != null) {
            this.ai.ak();
            this.ay.ak();
            var8 = (int)((double)(this.ai.ai - this.ai.aj) * 32.768D / var3);
            var9 = (int)((double)this.ai.aj * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.am[var11] != 0) {
               ax[var11] = 0;
               aq[var11] = (int)((double)this.au[var11] * var3);
               al[var11] = (this.am[var11] << 14) / 100;
               aa[var11] = (int)((double)(this.ap.ai - this.ap.aj) * 32.768D * Math.pow(1.0057929410678534D, (double)this.at[var11]) / var3);
               ah[var11] = (int)((double)this.ap.aj * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.ap.aj(var1);
            var13 = this.aw.aj(var1);
            if (this.ak != null) {
               var14 = this.ak.aj(var1);
               var15 = this.aj.aj(var1);
               var12 += this.aw(var7, var15, this.ak.ay) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.ai != null) {
               var14 = this.ai.aj(var1);
               var15 = this.ay.aj(var1);
               var13 = var13 * ((this.aw(var10, var15, this.ai.ay) >> 1) + '耀') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.am[var14] != 0) {
                  var15 = var11 + aq[var14];
                  if (var15 < var1) {
                     var10000 = ag;
                     var10000[var15] += this.aw(ax[var14], var13 * al[var14] >> 15, this.ap.ay);
                     var10000 = ax;
                     var10000[var14] += (var12 * aa[var14] >> 16) + ah[var14];
                  }
               }
            }
         }

         int var16;
         if (this.as != null) {
            this.as.ak();
            this.ae.ak();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.as.aj(var1);
               var16 = this.ae.aj(var1);
               if (var20) {
                  var12 = this.as.aj + ((this.as.ai - this.as.aj) * var15 >> 8);
               } else {
                  var12 = this.as.aj + ((this.as.ai - this.as.aj) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  ag[var14] = 0;
               }
            }
         }

         if (this.an > 0 && this.ao > 0) {
            var11 = (int)((double)this.an * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = ag;
               var10000[var12] += ag[var12 - var11] * this.ao / 100;
            }
         }

         if (this.af.ap[0] > 0 || this.af.ap[1] > 0) {
            this.ar.ak();
            var11 = this.ar.aj(var1 + 1);
            var12 = this.af.aj(0, (float)var11 / 65536.0F);
            var13 = this.af.aj(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)ag[var14 + var12] * (long)cf.am >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)ag[var14 + var12 - 1 - var17] * (long)cf.as[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)ag[var14 - 1 - var17] * (long)cf.as[1][var17] >> 16);
                  }

                  ag[var14] = var16;
                  var11 = this.ar.aj(var1 + 1);
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
                     var17 = (int)((long)ag[var14 + var12] * (long)cf.am >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)ag[var14 + var12 - 1 - var18] * (long)cf.as[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)ag[var14 - 1 - var18] * (long)cf.as[1][var18] >> 16);
                     }

                     ag[var14] = var17;
                     var11 = this.ar.aj(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)ag[var14 + var12 - 1 - var18] * (long)cf.as[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)ag[var14 - 1 - var18] * (long)cf.as[1][var18] >> 16);
                        }

                        ag[var14] = var17;
                        this.ar.aj(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.af.aj(0, (float)var11 / 65536.0F);
                  var13 = this.af.aj(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (ag[var11] < -32768) {
               ag[var11] = -32768;
            }

            if (ag[var11] > 32767) {
               ag[var11] = 32767;
            }
         }

         return ag;
      }
   }

   final void ak(vl var1) {
      this.ap = new bo();
      this.ap.ap(var1);
      this.aw = new bo();
      this.aw.ap(var1);
      int var2 = var1.cy((short)-4480);
      if (var2 != 0) {
         var1.am -= -725588083;
         this.ak = new bo();
         this.ak.ap(var1);
         this.aj = new bo();
         this.aj.ap(var1);
      }

      var2 = var1.cy((short)-14321);
      if (var2 != 0) {
         var1.am -= -725588083;
         this.ai = new bo();
         this.ai.ap(var1);
         this.ay = new bo();
         this.ay.ap(var1);
      }

      var2 = var1.cy((short)-27335);
      if (var2 != 0) {
         var1.am -= -725588083;
         this.as = new bo();
         this.as.ap(var1);
         this.ae = new bo();
         this.ae.ap(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.dq(-300057553);
         if (var4 == 0) {
            break;
         }

         this.am[var3] = var4;
         this.at[var3] = var1.ck((byte)1);
         this.au[var3] = var1.dq(-213718790);
      }

      this.an = var1.dq(892599837);
      this.ao = var1.dq(-1757892599);
      this.ab = var1.ce(1497102672);
      this.az = var1.ce(1187045760);
      this.af = new cf();
      this.ar = new bo();
      this.af.ai(var1, this.ar);
   }

   final int aw(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return ac[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? ad[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   cv() {
   }

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         ad[var1] = (var0.nextInt() & 2) - 1;
      }

      ac = new int['耀'];

      for(var1 = 0; var1 < 32768; ++var1) {
         ac[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      ag = new int[220500];
      ax = new int[5];
      aq = new int[5];
      al = new int[5];
      aa = new int[5];
      ah = new int[5];
   }

   final int[] aj(int var1, int var2) {
      rb.at(ag, 0, var1);
      if (var2 < 10) {
         return ag;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.ap.ak();
         this.aw.ak();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.ak != null) {
            this.ak.ak();
            this.aj.ak();
            var5 = (int)((double)(this.ak.ai - this.ak.aj) * 32.768D / var3);
            var6 = (int)((double)this.ak.aj * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.ai != null) {
            this.ai.ak();
            this.ay.ak();
            var8 = (int)((double)(this.ai.ai - this.ai.aj) * 32.768D / var3);
            var9 = (int)((double)this.ai.aj * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.am[var11] != 0) {
               ax[var11] = 0;
               aq[var11] = (int)((double)this.au[var11] * var3);
               al[var11] = (this.am[var11] << 14) / 100;
               aa[var11] = (int)((double)(this.ap.ai - this.ap.aj) * 32.768D * Math.pow(1.0057929410678534D, (double)this.at[var11]) / var3);
               ah[var11] = (int)((double)this.ap.aj * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.ap.aj(var1);
            var13 = this.aw.aj(var1);
            if (this.ak != null) {
               var14 = this.ak.aj(var1);
               var15 = this.aj.aj(var1);
               var12 += this.aw(var7, var15, this.ak.ay) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.ai != null) {
               var14 = this.ai.aj(var1);
               var15 = this.ay.aj(var1);
               var13 = var13 * ((this.aw(var10, var15, this.ai.ay) >> 1) + 2067579668) >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.am[var14] != 0) {
                  var15 = var11 + aq[var14];
                  if (var15 < var1) {
                     var10000 = ag;
                     var10000[var15] += this.aw(ax[var14], var13 * al[var14] >> 15, this.ap.ay);
                     var10000 = ax;
                     var10000[var14] += (var12 * aa[var14] >> 16) + ah[var14];
                  }
               }
            }
         }

         int var16;
         if (this.as != null) {
            this.as.ak();
            this.ae.ak();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.as.aj(var1);
               var16 = this.ae.aj(var1);
               if (var20) {
                  var12 = this.as.aj + ((this.as.ai - this.as.aj) * var15 >> 8);
               } else {
                  var12 = this.as.aj + ((this.as.ai - this.as.aj) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  ag[var14] = 0;
               }
            }
         }

         if (this.an > 0 && this.ao > 0) {
            var11 = (int)((double)this.an * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = ag;
               var10000[var12] += ag[var12 - var11] * this.ao / -1753765669;
            }
         }

         if (this.af.ap[0] > 0 || this.af.ap[1] > 0) {
            this.ar.ak();
            var11 = this.ar.aj(var1 + 1);
            var12 = this.af.aj(0, (float)var11 / 65536.0F);
            var13 = this.af.aj(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)ag[var14 + var12] * (long)cf.am >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)ag[var14 + var12 - 1 - var17] * (long)cf.as[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)ag[var14 - 1 - var17] * (long)cf.as[1][var17] >> 16);
                  }

                  ag[var14] = var16;
                  var11 = this.ar.aj(var1 + 1);
                  ++var14;
               }

               var16 = 203107022;
               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)ag[var14 + var12] * (long)cf.am >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)ag[var14 + var12 - 1 - var18] * (long)cf.as[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)ag[var14 - 1 - var18] * (long)cf.as[1][var18] >> 16);
                     }

                     ag[var14] = var17;
                     var11 = this.ar.aj(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)ag[var14 + var12 - 1 - var18] * (long)cf.as[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)ag[var14 - 1 - var18] * (long)cf.as[1][var18] >> 16);
                        }

                        ag[var14] = var17;
                        this.ar.aj(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.af.aj(0, (float)var11 / 65536.0F);
                  var13 = this.af.aj(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (ag[var11] < 1641881707) {
               ag[var11] = -32768;
            }

            if (ag[var11] > 32767) {
               ag[var11] = 32767;
            }
         }

         return ag;
      }
   }

   final int am(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return ac[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? ad[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final int[] ay(int var1, int var2) {
      rb.at(ag, 0, var1);
      if (var2 < 10) {
         return ag;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.ap.ak();
         this.aw.ak();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.ak != null) {
            this.ak.ak();
            this.aj.ak();
            var5 = (int)((double)(this.ak.ai - this.ak.aj) * 32.768D / var3);
            var6 = (int)((double)this.ak.aj * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.ai != null) {
            this.ai.ak();
            this.ay.ak();
            var8 = (int)((double)(this.ai.ai - this.ai.aj) * 32.768D / var3);
            var9 = (int)((double)this.ai.aj * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.am[var11] != 0) {
               ax[var11] = 0;
               aq[var11] = (int)((double)this.au[var11] * var3);
               al[var11] = (this.am[var11] << 14) / 1253306678;
               aa[var11] = (int)((double)(this.ap.ai - this.ap.aj) * 32.768D * Math.pow(1.0057929410678534D, (double)this.at[var11]) / var3);
               ah[var11] = (int)((double)this.ap.aj * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.ap.aj(var1);
            var13 = this.aw.aj(var1);
            if (this.ak != null) {
               var14 = this.ak.aj(var1);
               var15 = this.aj.aj(var1);
               var12 += this.aw(var7, var15, this.ak.ay) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.ai != null) {
               var14 = this.ai.aj(var1);
               var15 = this.ay.aj(var1);
               var13 = var13 * ((this.aw(var10, var15, this.ai.ay) >> 1) + -413276180) >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.am[var14] != 0) {
                  var15 = var11 + aq[var14];
                  if (var15 < var1) {
                     var10000 = ag;
                     var10000[var15] += this.aw(ax[var14], var13 * al[var14] >> 15, this.ap.ay);
                     var10000 = ax;
                     var10000[var14] += (var12 * aa[var14] >> 16) + ah[var14];
                  }
               }
            }
         }

         int var16;
         if (this.as != null) {
            this.as.ak();
            this.ae.ak();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.as.aj(var1);
               var16 = this.ae.aj(var1);
               if (var20) {
                  var12 = this.as.aj + ((this.as.ai - this.as.aj) * var15 >> 8);
               } else {
                  var12 = this.as.aj + ((this.as.ai - this.as.aj) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  ag[var14] = 0;
               }
            }
         }

         if (this.an > 0 && this.ao > 0) {
            var11 = (int)((double)this.an * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = ag;
               var10000[var12] += ag[var12 - var11] * this.ao / 873928553;
            }
         }

         if (this.af.ap[0] > 0 || this.af.ap[1] > 0) {
            this.ar.ak();
            var11 = this.ar.aj(var1 + 1);
            var12 = this.af.aj(0, (float)var11 / 65536.0F);
            var13 = this.af.aj(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)ag[var14 + var12] * (long)cf.am >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)ag[var14 + var12 - 1 - var17] * (long)cf.as[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)ag[var14 - 1 - var17] * (long)cf.as[1][var17] >> 16);
                  }

                  ag[var14] = var16;
                  var11 = this.ar.aj(var1 + 1);
                  ++var14;
               }

               boolean var21 = true;
               var15 = 373430982;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)ag[var14 + var12] * (long)cf.am >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)ag[var14 + var12 - 1 - var18] * (long)cf.as[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)ag[var14 - 1 - var18] * (long)cf.as[1][var18] >> 16);
                     }

                     ag[var14] = var17;
                     var11 = this.ar.aj(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)ag[var14 + var12 - 1 - var18] * (long)cf.as[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)ag[var14 - 1 - var18] * (long)cf.as[1][var18] >> 16);
                        }

                        ag[var14] = var17;
                        this.ar.aj(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.af.aj(0, (float)var11 / 65536.0F);
                  var13 = this.af.aj(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (ag[var11] < -32768) {
               ag[var11] = -32768;
            }

            if (ag[var11] > -1754950512) {
               ag[var11] = 32767;
            }
         }

         return ag;
      }
   }

   final int ae(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 1619200317) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return ac[var1 & 812870665] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? ad[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final void at(vl var1) {
      this.ap = new bo();
      this.ap.ap(var1);
      this.aw = new bo();
      this.aw.ap(var1);
      int var2 = var1.cy((short)-4626);
      if (var2 != 0) {
         var1.am -= -725588083;
         this.ak = new bo();
         this.ak.ap(var1);
         this.aj = new bo();
         this.aj.ap(var1);
      }

      var2 = var1.cy((short)-20205);
      if (var2 != 0) {
         var1.am -= -725588083;
         this.ai = new bo();
         this.ai.ap(var1);
         this.ay = new bo();
         this.ay.ap(var1);
      }

      var2 = var1.cy((short)-24380);
      if (var2 != 0) {
         var1.am -= -725588083;
         this.as = new bo();
         this.as.ap(var1);
         this.ae = new bo();
         this.ae.ap(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.dq(772392699);
         if (var4 == 0) {
            break;
         }

         this.am[var3] = var4;
         this.at[var3] = var1.ck((byte)1);
         this.au[var3] = var1.dq(1151693964);
      }

      this.an = var1.dq(-1841256752);
      this.ao = var1.dq(-2051472581);
      this.ab = var1.ce(254364387);
      this.az = var1.ce(1948873870);
      this.af = new cf();
      this.ar = new bo();
      this.af.ai(var1, this.ar);
   }

   final int as(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < -100700127 ? var2 : -var2;
      } else if (var3 == 2) {
         return ac[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? ad[var1 / -1130128408 & 32767] * var2 : 0;
      }
   }

   final int[] ai(int var1, int var2) {
      rb.at(ag, 0, var1);
      if (var2 < 10) {
         return ag;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.ap.ak();
         this.aw.ak();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.ak != null) {
            this.ak.ak();
            this.aj.ak();
            var5 = (int)((double)(this.ak.ai - this.ak.aj) * 32.768D / var3);
            var6 = (int)((double)this.ak.aj * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.ai != null) {
            this.ai.ak();
            this.ay.ak();
            var8 = (int)((double)(this.ai.ai - this.ai.aj) * 32.768D / var3);
            var9 = (int)((double)this.ai.aj * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.am[var11] != 0) {
               ax[var11] = 0;
               aq[var11] = (int)((double)this.au[var11] * var3);
               al[var11] = (this.am[var11] << 14) / 100;
               aa[var11] = (int)((double)(this.ap.ai - this.ap.aj) * 32.768D * Math.pow(1.0057929410678534D, (double)this.at[var11]) / var3);
               ah[var11] = (int)((double)this.ap.aj * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.ap.aj(var1);
            var13 = this.aw.aj(var1);
            if (this.ak != null) {
               var14 = this.ak.aj(var1);
               var15 = this.aj.aj(var1);
               var12 += this.aw(var7, var15, this.ak.ay) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.ai != null) {
               var14 = this.ai.aj(var1);
               var15 = this.ay.aj(var1);
               var13 = var13 * ((this.aw(var10, var15, this.ai.ay) >> 1) + '耀') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.am[var14] != 0) {
                  var15 = var11 + aq[var14];
                  if (var15 < var1) {
                     var10000 = ag;
                     var10000[var15] += this.aw(ax[var14], var13 * al[var14] >> 15, this.ap.ay);
                     var10000 = ax;
                     var10000[var14] += (var12 * aa[var14] >> 16) + ah[var14];
                  }
               }
            }
         }

         int var16;
         if (this.as != null) {
            this.as.ak();
            this.ae.ak();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.as.aj(var1);
               var16 = this.ae.aj(var1);
               if (var20) {
                  var12 = this.as.aj + ((this.as.ai - this.as.aj) * var15 >> 8);
               } else {
                  var12 = this.as.aj + ((this.as.ai - this.as.aj) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  ag[var14] = 0;
               }
            }
         }

         if (this.an > 0 && this.ao > 0) {
            var11 = (int)((double)this.an * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = ag;
               var10000[var12] += ag[var12 - var11] * this.ao / 100;
            }
         }

         if (this.af.ap[0] > 0 || this.af.ap[1] > 0) {
            this.ar.ak();
            var11 = this.ar.aj(var1 + 1);
            var12 = this.af.aj(0, (float)var11 / 65536.0F);
            var13 = this.af.aj(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)ag[var14 + var12] * (long)cf.am >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)ag[var14 + var12 - 1 - var17] * (long)cf.as[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)ag[var14 - 1 - var17] * (long)cf.as[1][var17] >> 16);
                  }

                  ag[var14] = var16;
                  var11 = this.ar.aj(var1 + 1);
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
                     var17 = (int)((long)ag[var14 + var12] * (long)cf.am >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)ag[var14 + var12 - 1 - var18] * (long)cf.as[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)ag[var14 - 1 - var18] * (long)cf.as[1][var18] >> 16);
                     }

                     ag[var14] = var17;
                     var11 = this.ar.aj(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)ag[var14 + var12 - 1 - var18] * (long)cf.as[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)ag[var14 - 1 - var18] * (long)cf.as[1][var18] >> 16);
                        }

                        ag[var14] = var17;
                        this.ar.aj(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.af.aj(0, (float)var11 / 65536.0F);
                  var13 = this.af.aj(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (ag[var11] < -32768) {
               ag[var11] = -32768;
            }

            if (ag[var11] > 32767) {
               ag[var11] = 32767;
            }
         }

         return ag;
      }
   }

   final void au(vl var1) {
      this.ap = new bo();
      this.ap.ap(var1);
      this.aw = new bo();
      this.aw.ap(var1);
      int var2 = var1.cy((short)-14828);
      if (var2 != 0) {
         var1.am -= -725588083;
         this.ak = new bo();
         this.ak.ap(var1);
         this.aj = new bo();
         this.aj.ap(var1);
      }

      var2 = var1.cy((short)-17602);
      if (var2 != 0) {
         var1.am -= -725588083;
         this.ai = new bo();
         this.ai.ap(var1);
         this.ay = new bo();
         this.ay.ap(var1);
      }

      var2 = var1.cy((short)-5475);
      if (var2 != 0) {
         var1.am -= -725588083;
         this.as = new bo();
         this.as.ap(var1);
         this.ae = new bo();
         this.ae.ap(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.dq(-827389425);
         if (var4 == 0) {
            break;
         }

         this.am[var3] = var4;
         this.at[var3] = var1.ck((byte)1);
         this.au[var3] = var1.dq(1039189770);
      }

      this.an = var1.dq(1390540495);
      this.ao = var1.dq(-139920397);
      this.ab = var1.ce(48581425);
      this.az = var1.ce(2029293677);
      this.af = new cf();
      this.ar = new bo();
      this.af.ai(var1, this.ar);
   }

   final void an(vl var1) {
      this.ap = new bo();
      this.ap.ap(var1);
      this.aw = new bo();
      this.aw.ap(var1);
      int var2 = var1.cy((short)-5756);
      if (var2 != 0) {
         var1.am -= -725588083;
         this.ak = new bo();
         this.ak.ap(var1);
         this.aj = new bo();
         this.aj.ap(var1);
      }

      var2 = var1.cy((short)-1492);
      if (var2 != 0) {
         var1.am -= -725588083;
         this.ai = new bo();
         this.ai.ap(var1);
         this.ay = new bo();
         this.ay.ap(var1);
      }

      var2 = var1.cy((short)-16557);
      if (var2 != 0) {
         var1.am -= -725588083;
         this.as = new bo();
         this.as.ap(var1);
         this.ae = new bo();
         this.ae.ap(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.dq(982549);
         if (var4 == 0) {
            break;
         }

         this.am[var3] = var4;
         this.at[var3] = var1.ck((byte)1);
         this.au[var3] = var1.dq(-215422002);
      }

      this.an = var1.dq(1213523499);
      this.ao = var1.dq(309500623);
      this.ab = var1.ce(1891782059);
      this.az = var1.ce(53577156);
      this.af = new cf();
      this.ar = new bo();
      this.af.ai(var1, this.ar);
   }
}
