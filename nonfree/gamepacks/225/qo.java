public class qo {
   public static final int df = 101;
   int ae;
   float[] ac;

   static float at(qo var0, float var1, float var2, float var3) {
      float var4 = oy.ae(var0.ac, 492698401 * var0.ae, var1, (byte)-26);
      if (Math.abs(var4) < ft.am) {
         return var1;
      } else {
         float var5 = oy.ae(var0.ac, var0.ae * 492698401, var2, (byte)99);
         if (Math.abs(var5) < ft.am) {
            return var2;
         } else {
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;
            float var13 = 0.0F;
            boolean var14 = true;
            boolean var15 = false;

            do {
               var15 = false;
               if (var14) {
                  var6 = var1;
                  var13 = var4;
                  var7 = var2 - var1;
                  var8 = var7;
                  var14 = false;
               }

               if (Math.abs(var13) < Math.abs(var5)) {
                  var1 = var2;
                  var2 = var6;
                  var6 = var1;
                  var4 = var5;
                  var5 = var13;
                  var13 = var4;
               }

               float var16 = ft.ax * Math.abs(var2) + var3 * 0.5F;
               float var17 = 0.5F * (var6 - var2);
               boolean var18 = Math.abs(var17) > var16 && 0.0F != var5;
               if (var18) {
                  if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
                     float var12 = var5 / var4;
                     float var9;
                     float var10;
                     if (var6 == var1) {
                        var9 = var12 * 2.0F * var17;
                        var10 = 1.0F - var12;
                     } else {
                        var10 = var4 / var13;
                        float var11 = var5 / var13;
                        var9 = var12 * (2.0F * var17 * var10 * (var10 - var11) - (var11 - 1.0F) * (var2 - var1));
                        var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
                     }

                     if ((double)var9 > 0.0D) {
                        var10 = -var10;
                     } else {
                        var9 = -var9;
                     }

                     var12 = var8;
                     var8 = var7;
                     if (2.0F * var9 < var10 * var17 * 3.0F - Math.abs(var16 * var10) && var9 < Math.abs(0.5F * var12 * var10)) {
                        var7 = var9 / var10;
                     } else {
                        var7 = var17;
                        var8 = var17;
                     }
                  } else {
                     var7 = var17;
                     var8 = var17;
                  }

                  var1 = var2;
                  var4 = var5;
                  if (Math.abs(var7) > var16) {
                     var2 += var7;
                  } else if ((double)var17 > 0.0D) {
                     var2 += var16;
                  } else {
                     var2 -= var16;
                  }

                  var5 = oy.ae(var0.ac, 492698401 * var0.ae, var2, (byte)-29);
                  if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) {
                     var14 = true;
                     var15 = true;
                  } else {
                     var15 = true;
                  }
               }
            } while(var15);

            return var2;
         }
      }
   }

   qo(float[] var1, int var2) {
      try {
         super();
         this.ac = var1;
         this.ae = var2 * -1239070495;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qo.<init>(" + ')');
      }
   }

   static float ax(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var3 = var0[var4] + var2 * var3;
      }

      return var3;
   }

   public static int am(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for(int var8 = 0; var8 < 1 + var1; ++var8) {
         var7 += Math.abs(var0[var8]);
      }

      float var21 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * ft.am;
      if (var7 <= var21) {
         return -1;
      } else {
         float[] var9 = new float[1 + var1];

         int var10;
         for(var10 = 0; var10 < 1 + var1; ++var10) {
            var9[var10] = 1.0F / var7 * var0[var10];
         }

         while(Math.abs(var9[var1]) < var21) {
            --var1;
         }

         var10 = 0;
         if (0 == var1) {
            return var10;
         } else if (var1 == 1) {
            var6[0] = -var9[0] / var9[1];
            boolean var22 = var3 ? var2 < var21 + var6[0] : var2 < var6[0] - var21;
            boolean var23 = var5 ? var4 > var6[0] - var21 : var4 > var21 + var6[0];
            var10 = var22 && var23 ? 1 : 0;
            if (var10 > 0) {
               if (var3 && var6[0] < var2) {
                  var6[0] = var2;
               } else if (var5 && var6[0] > var4) {
                  var6[0] = var4;
               }
            }

            return var10;
         } else {
            qo var11 = new qo(var9, var1);
            float[] var12 = new float[var1 + 1];

            for(int var13 = 1; var13 <= var1; ++var13) {
               var12[var13 - 1] = (float)var13 * var9[var13];
            }

            float[] var24 = new float[var1 + 1];
            int var14 = of.ac(var12, var1 - 1, var2, false, var4, false, var24, (byte)-31);
            if (var14 == -1) {
               return 0;
            } else {
               boolean var15 = false;
               float var17 = 0.0F;
               float var18 = 0.0F;
               float var19 = 0.0F;

               for(int var20 = 0; var20 <= var14; ++var20) {
                  if (var10 > var1) {
                     return var10;
                  }

                  float var16;
                  if (0 == var20) {
                     var16 = var2;
                     var18 = oy.ae(var9, var1, var2, (byte)49);
                     if (Math.abs(var18) <= var21 && var3) {
                        var6[var10++] = var2;
                     }
                  } else {
                     var16 = var19;
                     var18 = var17;
                  }

                  if (var20 == var14) {
                     var19 = var4;
                     var15 = false;
                  } else {
                     var19 = var24[var20];
                  }

                  var17 = oy.ae(var9, var1, var19, (byte)22);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var21) {
                     if (var20 != var14 || var5) {
                        var6[var10++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     var6[var10++] = lp.ag(var11, var16, var19, 0.0F, (byte)116);
                     if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var21) {
                        var6[var10 - 2] = (var6[var10 - 2] + var6[var10 - 1]) * 0.5F;
                        --var10;
                     }
                  }
               }

               return var10;
            }
         }
      }
   }

   static float af(qo var0, float var1, float var2, float var3) {
      float var4 = oy.ae(var0.ac, 492698401 * var0.ae, var1, (byte)10);
      if (Math.abs(var4) < ft.am) {
         return var1;
      } else {
         float var5 = oy.ae(var0.ac, var0.ae * 492698401, var2, (byte)19);
         if (Math.abs(var5) < ft.am) {
            return var2;
         } else {
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;
            float var13 = 0.0F;
            boolean var14 = true;
            boolean var15 = false;

            do {
               var15 = false;
               if (var14) {
                  var6 = var1;
                  var13 = var4;
                  var7 = var2 - var1;
                  var8 = var7;
                  var14 = false;
               }

               if (Math.abs(var13) < Math.abs(var5)) {
                  var1 = var2;
                  var2 = var6;
                  var6 = var1;
                  var4 = var5;
                  var5 = var13;
                  var13 = var4;
               }

               float var16 = ft.ax * Math.abs(var2) + var3 * 0.5F;
               float var17 = 0.5F * (var6 - var2);
               boolean var18 = Math.abs(var17) > var16 && 0.0F != var5;
               if (var18) {
                  if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
                     float var12 = var5 / var4;
                     float var9;
                     float var10;
                     if (var6 == var1) {
                        var9 = var12 * 2.0F * var17;
                        var10 = 1.0F - var12;
                     } else {
                        var10 = var4 / var13;
                        float var11 = var5 / var13;
                        var9 = var12 * (2.0F * var17 * var10 * (var10 - var11) - (var11 - 1.0F) * (var2 - var1));
                        var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
                     }

                     if ((double)var9 > 0.0D) {
                        var10 = -var10;
                     } else {
                        var9 = -var9;
                     }

                     var12 = var8;
                     var8 = var7;
                     if (2.0F * var9 < var10 * var17 * 3.0F - Math.abs(var16 * var10) && var9 < Math.abs(0.5F * var12 * var10)) {
                        var7 = var9 / var10;
                     } else {
                        var7 = var17;
                        var8 = var17;
                     }
                  } else {
                     var7 = var17;
                     var8 = var17;
                  }

                  var1 = var2;
                  var4 = var5;
                  if (Math.abs(var7) > var16) {
                     var2 += var7;
                  } else if ((double)var17 > 0.0D) {
                     var2 += var16;
                  } else {
                     var2 -= var16;
                  }

                  var5 = oy.ae(var0.ac, 492698401 * var0.ae, var2, (byte)-34);
                  if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) {
                     var14 = true;
                     var15 = true;
                  } else {
                     var15 = true;
                  }
               }
            } while(var15);

            return var2;
         }
      }
   }

   static float aq(qo var0, float var1, float var2, float var3) {
      float var4 = oy.ae(var0.ac, 527944699 * var0.ae, var1, (byte)88);
      if (Math.abs(var4) < ft.am) {
         return var1;
      } else {
         float var5 = oy.ae(var0.ac, var0.ae * 684450186, var2, (byte)-4);
         if (Math.abs(var5) < ft.am) {
            return var2;
         } else {
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;
            float var13 = 0.0F;
            boolean var14 = true;
            boolean var15 = false;

            do {
               var15 = false;
               if (var14) {
                  var6 = var1;
                  var13 = var4;
                  var7 = var2 - var1;
                  var8 = var7;
                  var14 = false;
               }

               if (Math.abs(var13) < Math.abs(var5)) {
                  var1 = var2;
                  var2 = var6;
                  var6 = var1;
                  var4 = var5;
                  var5 = var13;
                  var13 = var4;
               }

               float var16 = ft.ax * Math.abs(var2) + var3 * 0.5F;
               float var17 = 0.5F * (var6 - var2);
               boolean var18 = Math.abs(var17) > var16 && 0.0F != var5;
               if (var18) {
                  if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
                     float var12 = var5 / var4;
                     float var9;
                     float var10;
                     if (var6 == var1) {
                        var9 = var12 * 2.0F * var17;
                        var10 = 1.0F - var12;
                     } else {
                        var10 = var4 / var13;
                        float var11 = var5 / var13;
                        var9 = var12 * (2.0F * var17 * var10 * (var10 - var11) - (var11 - 1.0F) * (var2 - var1));
                        var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
                     }

                     if ((double)var9 > 0.0D) {
                        var10 = -var10;
                     } else {
                        var9 = -var9;
                     }

                     var12 = var8;
                     var8 = var7;
                     if (2.0F * var9 < var10 * var17 * 3.0F - Math.abs(var16 * var10) && var9 < Math.abs(0.5F * var12 * var10)) {
                        var7 = var9 / var10;
                     } else {
                        var7 = var17;
                        var8 = var17;
                     }
                  } else {
                     var7 = var17;
                     var8 = var17;
                  }

                  var1 = var2;
                  var4 = var5;
                  if (Math.abs(var7) > var16) {
                     var2 += var7;
                  } else if ((double)var17 > 0.0D) {
                     var2 += var16;
                  } else {
                     var2 -= var16;
                  }

                  var5 = oy.ae(var0.ac, -1903169925 * var0.ae, var2, (byte)12);
                  if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) {
                     var14 = true;
                     var15 = true;
                  } else {
                     var15 = true;
                  }
               }
            } while(var15);

            return var2;
         }
      }
   }

   static float au(qo var0, float var1, float var2, float var3) {
      float var4 = oy.ae(var0.ac, 492698401 * var0.ae, var1, (byte)-17);
      if (Math.abs(var4) < ft.am) {
         return var1;
      } else {
         float var5 = oy.ae(var0.ac, var0.ae * 492698401, var2, (byte)-7);
         if (Math.abs(var5) < ft.am) {
            return var2;
         } else {
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;
            float var13 = 0.0F;
            boolean var14 = true;
            boolean var15 = false;

            do {
               var15 = false;
               if (var14) {
                  var6 = var1;
                  var13 = var4;
                  var7 = var2 - var1;
                  var8 = var7;
                  var14 = false;
               }

               if (Math.abs(var13) < Math.abs(var5)) {
                  var1 = var2;
                  var2 = var6;
                  var6 = var1;
                  var4 = var5;
                  var5 = var13;
                  var13 = var4;
               }

               float var16 = ft.ax * Math.abs(var2) + var3 * 0.5F;
               float var17 = 0.5F * (var6 - var2);
               boolean var18 = Math.abs(var17) > var16 && 0.0F != var5;
               if (var18) {
                  if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
                     float var12 = var5 / var4;
                     float var9;
                     float var10;
                     if (var6 == var1) {
                        var9 = var12 * 2.0F * var17;
                        var10 = 1.0F - var12;
                     } else {
                        var10 = var4 / var13;
                        float var11 = var5 / var13;
                        var9 = var12 * (2.0F * var17 * var10 * (var10 - var11) - (var11 - 1.0F) * (var2 - var1));
                        var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
                     }

                     if ((double)var9 > 0.0D) {
                        var10 = -var10;
                     } else {
                        var9 = -var9;
                     }

                     var12 = var8;
                     var8 = var7;
                     if (2.0F * var9 < var10 * var17 * 3.0F - Math.abs(var16 * var10) && var9 < Math.abs(0.5F * var12 * var10)) {
                        var7 = var9 / var10;
                     } else {
                        var7 = var17;
                        var8 = var17;
                     }
                  } else {
                     var7 = var17;
                     var8 = var17;
                  }

                  var1 = var2;
                  var4 = var5;
                  if (Math.abs(var7) > var16) {
                     var2 += var7;
                  } else if ((double)var17 > 0.0D) {
                     var2 += var16;
                  } else {
                     var2 -= var16;
                  }

                  var5 = oy.ae(var0.ac, 492698401 * var0.ae, var2, (byte)-64);
                  if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) {
                     var14 = true;
                     var15 = true;
                  } else {
                     var15 = true;
                  }
               }
            } while(var15);

            return var2;
         }
      }
   }

   static float ar(qo var0, float var1, float var2, float var3) {
      float var4 = oy.ae(var0.ac, 492698401 * var0.ae, var1, (byte)-34);
      if (Math.abs(var4) < ft.am) {
         return var1;
      } else {
         float var5 = oy.ae(var0.ac, var0.ae * 492698401, var2, (byte)-40);
         if (Math.abs(var5) < ft.am) {
            return var2;
         } else {
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;
            float var13 = 0.0F;
            boolean var14 = true;
            boolean var15 = false;

            do {
               var15 = false;
               if (var14) {
                  var6 = var1;
                  var13 = var4;
                  var7 = var2 - var1;
                  var8 = var7;
                  var14 = false;
               }

               if (Math.abs(var13) < Math.abs(var5)) {
                  var1 = var2;
                  var2 = var6;
                  var6 = var1;
                  var4 = var5;
                  var5 = var13;
                  var13 = var4;
               }

               float var16 = ft.ax * Math.abs(var2) + var3 * 0.5F;
               float var17 = 0.5F * (var6 - var2);
               boolean var18 = Math.abs(var17) > var16 && 0.0F != var5;
               if (var18) {
                  if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
                     float var12 = var5 / var4;
                     float var9;
                     float var10;
                     if (var6 == var1) {
                        var9 = var12 * 2.0F * var17;
                        var10 = 1.0F - var12;
                     } else {
                        var10 = var4 / var13;
                        float var11 = var5 / var13;
                        var9 = var12 * (2.0F * var17 * var10 * (var10 - var11) - (var11 - 1.0F) * (var2 - var1));
                        var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
                     }

                     if ((double)var9 > 0.0D) {
                        var10 = -var10;
                     } else {
                        var9 = -var9;
                     }

                     var12 = var8;
                     var8 = var7;
                     if (2.0F * var9 < var10 * var17 * 3.0F - Math.abs(var16 * var10) && var9 < Math.abs(0.5F * var12 * var10)) {
                        var7 = var9 / var10;
                     } else {
                        var7 = var17;
                        var8 = var17;
                     }
                  } else {
                     var7 = var17;
                     var8 = var17;
                  }

                  var1 = var2;
                  var4 = var5;
                  if (Math.abs(var7) > var16) {
                     var2 += var7;
                  } else if ((double)var17 > 0.0D) {
                     var2 += var16;
                  } else {
                     var2 -= var16;
                  }

                  var5 = oy.ae(var0.ac, 492698401 * var0.ae, var2, (byte)-32);
                  if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) {
                     var14 = true;
                     var15 = true;
                  } else {
                     var15 = true;
                  }
               }
            } while(var15);

            return var2;
         }
      }
   }
}
