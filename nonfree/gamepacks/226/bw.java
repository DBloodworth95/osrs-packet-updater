public class bw {
   int ak;
   int ap;
   int aj;
   int ai;
   int aw;
   int ay;
   int[] as;

   void aw(float[] var1, int var2, boolean var3, cp var4) {
      int var5;
      for(var5 = 0; var5 < var2; ++var5) {
         var1[var5] = 0.0F;
      }

      if (!var3) {
         var5 = cd.at[this.ay].ap;
         int var6 = this.ak - this.aw;
         int var7 = var6 / this.aj;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               int var11;
               int var12;
               if (var9 == 0) {
                  var11 = cd.at[this.ay].ak(var4);

                  for(var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.ai;
                     }

                     var11 /= this.ai;
                  }
               }

               for(var11 = 0; var11 < var5; ++var11) {
                  var12 = var8[var10];
                  int var13 = this.as[var12 * 8 + var9];
                  if (var13 >= 0) {
                     int var14 = this.aw + var10 * this.aj;
                     cq var15 = cd.at[var13];
                     int var16;
                     if (this.ap == 0) {
                        var16 = this.aj / var15.ap;

                        for(int var20 = 0; var20 < var16; ++var20) {
                           float[] var21 = var15.aj(var4);

                           for(int var19 = 0; var19 < var15.ap; ++var19) {
                              var1[var14 + var20 + var19 * var16] += var21[var19];
                           }
                        }
                     } else {
                        var16 = 0;

                        while(var16 < this.aj) {
                           float[] var17 = var15.aj(var4);

                           for(int var18 = 0; var18 < var15.ap; ++var18) {
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

   void ap(float[] var1, int var2, boolean var3, cp var4) {
      int var5;
      for(var5 = 0; var5 < var2; ++var5) {
         var1[var5] = 0.0F;
      }

      if (!var3) {
         var5 = cd.at[this.ay].ap;
         int var6 = this.ak - this.aw;
         int var7 = var6 / this.aj;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               int var11;
               int var12;
               if (var9 == 0) {
                  var11 = cd.at[this.ay].ak(var4);

                  for(var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.ai;
                     }

                     var11 /= this.ai;
                  }
               }

               for(var11 = 0; var11 < var5; ++var11) {
                  var12 = var8[var10];
                  int var13 = this.as[var12 * 8 + var9];
                  if (var13 >= 0) {
                     int var14 = this.aw + var10 * this.aj;
                     cq var15 = cd.at[var13];
                     int var16;
                     if (this.ap == 0) {
                        var16 = this.aj / var15.ap;

                        for(int var20 = 0; var20 < var16; ++var20) {
                           float[] var21 = var15.aj(var4);

                           for(int var19 = 0; var19 < var15.ap; ++var19) {
                              var1[var14 + var20 + var19 * var16] += var21[var19];
                           }
                        }
                     } else {
                        var16 = 0;

                        while(var16 < this.aj) {
                           float[] var17 = var15.aj(var4);

                           for(int var18 = 0; var18 < var15.ap; ++var18) {
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

   bw() {
      cp var1 = cd.as;
      this.ap = var1.ap(16, (byte)-57);
      this.aw = var1.ap(24, (byte)51);
      this.ak = var1.ap(24, (byte)39);
      this.aj = var1.ap(24, (byte)63) + 1;
      this.ai = var1.ap(6, (byte)51) + 1;
      this.ay = var1.ap(8, (byte)84);
      int[] var2 = new int[this.ai];

      int var3;
      for(var3 = 0; var3 < this.ai; ++var3) {
         int var4 = 0;
         int var5 = var1.ap(3, (byte)7);
         boolean var6 = var1.aw(-754803309) != 0;
         if (var6) {
            var4 = var1.ap(5, (byte)-95);
         }

         var2[var3] = var4 << 3 | var5;
      }

      this.as = new int[this.ai * 8];

      for(var3 = 0; var3 < this.ai * 8; ++var3) {
         this.as[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.ap(8, (byte)30) : -1;
      }

   }
}
