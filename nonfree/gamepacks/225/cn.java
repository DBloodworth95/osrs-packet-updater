public class cn {
   int ae;
   int[] am;
   int ac;
   int[] ag;
   float[][] ax;
   int[] aq;

   int ad(cy var1) {
      int var2;
      for(var2 = 0; this.aq[var2] >= 0; var2 = var1.ae(-954906439) != 0 ? this.aq[var2] : var2 + 1) {
      }

      return ~this.aq[var2];
   }

   static int ax(int var0, int var1) {
      int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

      while(true) {
         int var4 = var2;
         int var5 = var1;

         int var6;
         for(var6 = 1; var5 > 1; var5 >>= 1) {
            if (0 != (var5 & 1)) {
               var6 *= var4;
            }

            var4 *= var4;
         }

         int var3;
         if (var5 == 1) {
            var3 = var6 * var4;
         } else {
            var3 = var6;
         }

         if (var3 <= var0) {
            return var2;
         }

         --var2;
      }
   }

   cn() {
      cy var1 = cf.af;
      var1.ac(24, -854688405);
      this.ac = var1.ac(16, -1400842315);
      this.ae = var1.ac(24, 779024121);
      this.ag = new int[this.ae];
      boolean var2 = var1.ae(-2057951068) != 0;
      int var3;
      int var4;
      int var6;
      if (var2) {
         var3 = 0;

         for(var4 = var1.ac(5, -1598312840) + 1; var3 < this.ae; ++var4) {
            int var5 = var1.ac(client.aq(this.ae - var3, (byte)56), -749598478);

            for(var6 = 0; var6 < var5; ++var6) {
               this.ag[var3++] = var4;
            }
         }
      } else {
         boolean var15 = var1.ae(1631180354) != 0;

         for(var4 = 0; var4 < this.ae; ++var4) {
            if (var15 && var1.ae(1894546303) == 0) {
               this.ag[var4] = 0;
            } else {
               this.ag[var4] = var1.ac(5, 953981961) + 1;
            }
         }
      }

      this.ae();
      var3 = var1.ac(4, -1524045836);
      if (var3 > 0) {
         float var16 = cf.ac(var1.ac(32, -652843247));
         float var17 = cf.ac(var1.ac(32, 388999673));
         var6 = var1.ac(4, 1811922363) + 1;
         boolean var7 = var1.ae(-1873686954) != 0;
         int var8;
         if (var3 == 1) {
            var8 = ac(this.ae, this.ac);
         } else {
            var8 = this.ae * this.ac;
         }

         this.am = new int[var8];

         int var9;
         for(var9 = 0; var9 < var8; ++var9) {
            this.am[var9] = var1.ac(var6, 654795487);
         }

         this.ax = new float[this.ae][this.ac];
         float var10;
         int var11;
         int var12;
         if (var3 == 1) {
            for(var9 = 0; var9 < this.ae; ++var9) {
               var10 = 0.0F;
               var11 = 1;

               for(var12 = 0; var12 < this.ac; ++var12) {
                  int var13 = var9 / var11 % var8;
                  float var14 = (float)this.am[var13] * var17 + var16 + var10;
                  this.ax[var9][var12] = var14;
                  if (var7) {
                     var10 = var14;
                  }

                  var11 *= var8;
               }
            }
         } else {
            for(var9 = 0; var9 < this.ae; ++var9) {
               var10 = 0.0F;
               var11 = var9 * this.ac;

               for(var12 = 0; var12 < this.ac; ++var12) {
                  float var18 = (float)this.am[var11] * var17 + var16 + var10;
                  this.ax[var9][var12] = var18;
                  if (var7) {
                     var10 = var18;
                  }

                  ++var11;
               }
            }
         }
      }

   }

   int ag(cy var1) {
      int var2;
      for(var2 = 0; this.aq[var2] >= 0; var2 = var1.ae(-813505741) != 0 ? this.aq[var2] : var2 + 1) {
      }

      return ~this.aq[var2];
   }

   float[] am(cy var1) {
      return this.ax[this.ag(var1)];
   }

   int ar(cy var1) {
      int var2;
      for(var2 = 0; this.aq[var2] >= 0; var2 = var1.ae(2035490598) != 0 ? this.aq[var2] : var2 + 1) {
      }

      return ~this.aq[var2];
   }

   static int aq(int var0, int var1) {
      int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

      while(true) {
         int var4 = var2;
         int var5 = var1;

         int var6;
         for(var6 = 1; var5 > 1; var5 >>= 1) {
            if (0 != (var5 & 1)) {
               var6 *= var4;
            }

            var4 *= var4;
         }

         int var3;
         if (var5 == 1) {
            var3 = var6 * var4;
         } else {
            var3 = var6;
         }

         if (var3 <= var0) {
            return var2;
         }

         --var2;
      }
   }

   float[] ap(cy var1) {
      return this.ax[this.ag(var1)];
   }

   void at() {
      int[] var1 = new int[this.ae];
      int[] var2 = new int[443251907];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.ae; ++var3) {
         var4 = this.ag[var3];
         if (var4 != 0) {
            var5 = 1 << -1204095683 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << -178349336 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.aq = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.ae; ++var3) {
         var4 = this.ag[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = -1417732439 >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.aq[var6] == 0) {
                     this.aq[var6] = var11;
                  }

                  var6 = this.aq[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.aq.length) {
                  int[] var12 = new int[this.aq.length * 2];

                  for(var10 = 0; var10 < this.aq.length; ++var10) {
                     var12[var10] = this.aq[var10];
                  }

                  this.aq = var12;
               }

               var8 >>>= 1;
            }

            this.aq[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   void af() {
      int[] var1 = new int[this.ae];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.ae; ++var3) {
         var4 = this.ag[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << 907668941 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= -1761434410; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.aq = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.ae; ++var3) {
         var4 = this.ag[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.aq[var6] == 0) {
                     this.aq[var6] = var11;
                  }

                  var6 = this.aq[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.aq.length) {
                  int[] var12 = new int[this.aq.length * 2];

                  for(var10 = 0; var10 < this.aq.length; ++var10) {
                     var12[var10] = this.aq[var10];
                  }

                  this.aq = var12;
               }

               var8 >>>= 1;
            }

            this.aq[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   void ae() {
      int[] var1 = new int[this.ae];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.ae; ++var3) {
         var4 = this.ag[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.aq = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.ae; ++var3) {
         var4 = this.ag[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.aq[var6] == 0) {
                     this.aq[var6] = var11;
                  }

                  var6 = this.aq[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.aq.length) {
                  int[] var12 = new int[this.aq.length * 2];

                  for(var10 = 0; var10 < this.aq.length; ++var10) {
                     var12[var10] = this.aq[var10];
                  }

                  this.aq = var12;
               }

               var8 >>>= 1;
            }

            this.aq[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   void au() {
      int[] var1 = new int[this.ae];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.ae; ++var3) {
         var4 = this.ag[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.aq = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.ae; ++var3) {
         var4 = this.ag[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.aq[var6] == 0) {
                     this.aq[var6] = var11;
                  }

                  var6 = this.aq[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.aq.length) {
                  int[] var12 = new int[this.aq.length * 2];

                  for(var10 = 0; var10 < this.aq.length; ++var10) {
                     var12[var10] = this.aq[var10];
                  }

                  this.aq = var12;
               }

               var8 >>>= 1;
            }

            this.aq[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   int al(cy var1) {
      int var2;
      for(var2 = 0; this.aq[var2] >= 0; var2 = var1.ae(1958567415) != 0 ? this.aq[var2] : var2 + 1) {
      }

      return ~this.aq[var2];
   }

   float[] ah(cy var1) {
      return this.ax[this.ag(var1)];
   }

   static int ac(int var0, int var1) {
      int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

      while(true) {
         int var4 = var2;
         int var5 = var1;

         int var6;
         for(var6 = 1; var5 > 1; var5 >>= 1) {
            if (0 != (var5 & 1)) {
               var6 *= var4;
            }

            var4 *= var4;
         }

         int var3;
         if (var5 == 1) {
            var3 = var6 * var4;
         } else {
            var3 = var6;
         }

         if (var3 <= var0) {
            return var2;
         }

         --var2;
      }
   }

   float[] ab(cy var1) {
      return this.ax[this.ag(var1)];
   }

   float[] az(cy var1) {
      return this.ax[this.ag(var1)];
   }

   float[] aa(cy var1) {
      return this.ax[this.ag(var1)];
   }
}
