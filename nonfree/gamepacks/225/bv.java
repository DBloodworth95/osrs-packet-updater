public class bv {
   int ae;
   int am;
   int ag;
   int ac;
   int ax;
   int aq;
   int[] af;

   void ae(float[] var1, int var2, boolean var3, cy var4) {
      int var5;
      for(var5 = 0; var5 < var2; ++var5) {
         var1[var5] = 0.0F;
      }

      if (!var3) {
         var5 = cf.ar[this.aq].ac;
         int var6 = this.ag - this.ae;
         int var7 = var6 / this.am;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               int var11;
               int var12;
               if (var9 == 0) {
                  var11 = cf.ar[this.aq].ag(var4);

                  for(var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.ax;
                     }

                     var11 /= this.ax;
                  }
               }

               for(var11 = 0; var11 < var5; ++var11) {
                  var12 = var8[var10];
                  int var13 = this.af[var12 * 8 + var9];
                  if (var13 >= 0) {
                     int var14 = this.ae + var10 * this.am;
                     cn var15 = cf.ar[var13];
                     int var16;
                     if (this.ac == 0) {
                        var16 = this.am / var15.ac;

                        for(int var20 = 0; var20 < var16; ++var20) {
                           float[] var21 = var15.am(var4);

                           for(int var19 = 0; var19 < var15.ac; ++var19) {
                              var1[var14 + var20 + var19 * var16] += var21[var19];
                           }
                        }
                     } else {
                        var16 = 0;

                        while(var16 < this.am) {
                           float[] var17 = var15.am(var4);

                           for(int var18 = 0; var18 < var15.ac; ++var18) {
                              var1[var14 + var16] += var17[var18];
                              ++var16;
                           }
                        }
                     }
                  }

                  ++var10;
                  if (var10 >= var7) {
                     break;
                  }
               }
            }
         }

      }
   }

   void ac(float[] var1, int var2, boolean var3, cy var4) {
      int var5;
      for(var5 = 0; var5 < var2; ++var5) {
         var1[var5] = 0.0F;
      }

      if (!var3) {
         var5 = cf.ar[this.aq].ac;
         int var6 = this.ag - this.ae;
         int var7 = var6 / this.am;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               int var11;
               int var12;
               if (var9 == 0) {
                  var11 = cf.ar[this.aq].ag(var4);

                  for(var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.ax;
                     }

                     var11 /= this.ax;
                  }
               }

               for(var11 = 0; var11 < var5; ++var11) {
                  var12 = var8[var10];
                  int var13 = this.af[var12 * 8 + var9];
                  if (var13 >= 0) {
                     int var14 = this.ae + var10 * this.am;
                     cn var15 = cf.ar[var13];
                     int var16;
                     if (this.ac == 0) {
                        var16 = this.am / var15.ac;

                        for(int var20 = 0; var20 < var16; ++var20) {
                           float[] var21 = var15.am(var4);

                           for(int var19 = 0; var19 < var15.ac; ++var19) {
                              var1[var14 + var20 + var19 * var16] += var21[var19];
                           }
                        }
                     } else {
                        var16 = 0;

                        while(var16 < this.am) {
                           float[] var17 = var15.am(var4);

                           for(int var18 = 0; var18 < var15.ac; ++var18) {
                              var1[var14 + var16] += var17[var18];
                              ++var16;
                           }
                        }
                     }
                  }

                  ++var10;
                  if (var10 >= var7) {
                     break;
                  }
               }
            }
         }

      }
   }

   bv() {
      cy var1 = cf.af;
      this.ac = var1.ac(16, 249290300);
      this.ae = var1.ac(24, -1402984188);
      this.ag = var1.ac(24, 2022309437);
      this.am = var1.ac(24, -1115464343) + 1;
      this.ax = var1.ac(6, 1685908600) + 1;
      this.aq = var1.ac(8, 916966474);
      int[] var2 = new int[this.ax];

      int var3;
      for(var3 = 0; var3 < this.ax; ++var3) {
         int var4 = 0;
         int var5 = var1.ac(3, -1972697890);
         boolean var6 = var1.ae(-1722722217) != 0;
         if (var6) {
            var4 = var1.ac(5, -696874051);
         }

         var2[var3] = var4 << 3 | var5;
      }

      this.af = new int[this.ax * 8];

      for(var3 = 0; var3 < this.ax * 8; ++var3) {
         this.af[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.ac(8, -566151090) : -1;
      }

   }
}
