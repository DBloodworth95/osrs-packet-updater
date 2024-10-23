public class qc {
   public static final int bt = 64;
   int aw;
   float[] ap;

   qc(float[] var1, int var2) {
      try {
         super();
         this.ap = var1;
         this.aw = var2 * 487223473;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qc.<init>(" + ')');
      }
   }

   public static int ak(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for(int var8 = 0; var8 < 1 + var1; ++var8) {
         var7 += Math.abs(var0[var8]);
      }

      float var41 = (Math.abs(var2) + Math.abs(var4)) * (float)(1 + var1) * fj.aj;
      if (var7 <= var41) {
         return -1;
      } else {
         float[] var9 = new float[var1 + 1];

         int var10;
         for(var10 = 0; var10 < 1 + var1; ++var10) {
            var9[var10] = 1.0F / var7 * var0[var10];
         }

         while(Math.abs(var9[var1]) < var41) {
            --var1;
         }

         var10 = 0;
         if (0 == var1) {
            return var10;
         } else if (1 == var1) {
            var6[0] = -var9[0] / var9[1];
            boolean var42 = var3 ? var2 < var6[0] + var41 : var2 < var6[0] - var41;
            boolean var43 = var5 ? var4 > var6[0] - var41 : var4 > var41 + var6[0];
            var10 = var42 && var43 ? 1 : 0;
            if (var10 > 0) {
               if (var3 && var6[0] < var2) {
                  var6[0] = var2;
               } else if (var5 && var6[0] > var4) {
                  var6[0] = var4;
               }
            }

            return var10;
         } else {
            qc var11 = new qc(var9, var1);
            float[] var12 = new float[1 + var1];

            for(int var13 = 1; var13 <= var1; ++var13) {
               var12[var13 - 1] = (float)var13 * var9[var13];
            }

            float[] var44 = new float[var1 + 1];
            int var14 = jq.ap(var12, var1 - 1, var2, false, var4, false, var44, 1350563286);
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
                     var18 = dm.aw(var9, var1, var2, 2022023570);
                     if (Math.abs(var18) <= var41 && var3) {
                        var6[var10++] = var2;
                     }
                  } else {
                     var16 = var19;
                     var18 = var17;
                  }

                  if (var14 == var20) {
                     var19 = var4;
                     var15 = false;
                  } else {
                     var19 = var44[var20];
                  }

                  var17 = dm.aw(var9, var1, var19, 888708287);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var41) {
                     if (var20 != var14 || var5) {
                        var6[var10++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     int var22 = var10++;
                     float var24 = var16;
                     float var25 = var19;
                     float var26 = dm.aw(var11.ap, var11.aw * -1448224687, var16, 569505513);
                     float var23;
                     if (Math.abs(var26) < fj.aj) {
                        var23 = var16;
                     } else {
                        float var27 = dm.aw(var11.ap, -1448224687 * var11.aw, var19, 1564391072);
                        if (Math.abs(var27) < fj.aj) {
                           var23 = var19;
                        } else {
                           float var28 = 0.0F;
                           float var29 = 0.0F;
                           float var30 = 0.0F;
                           float var35 = 0.0F;
                           boolean var36 = true;
                           boolean var37 = false;

                           do {
                              var37 = false;
                              if (var36) {
                                 var28 = var24;
                                 var35 = var26;
                                 var29 = var25 - var24;
                                 var30 = var29;
                                 var36 = false;
                              }

                              if (Math.abs(var35) < Math.abs(var27)) {
                                 var24 = var25;
                                 var25 = var28;
                                 var28 = var24;
                                 var26 = var27;
                                 var27 = var35;
                                 var35 = var26;
                              }

                              float var38 = fj.ai * Math.abs(var25) + 0.0F;
                              float var39 = 0.5F * (var28 - var25);
                              boolean var40 = Math.abs(var39) > var38 && var27 != 0.0F;
                              if (var40) {
                                 if (!(Math.abs(var30) < var38) && !(Math.abs(var26) <= Math.abs(var27))) {
                                    float var34 = var27 / var26;
                                    float var31;
                                    float var32;
                                    if (var28 == var24) {
                                       var31 = 2.0F * var39 * var34;
                                       var32 = 1.0F - var34;
                                    } else {
                                       var32 = var26 / var35;
                                       float var33 = var27 / var35;
                                       var31 = var34 * ((var32 - var33) * var32 * var39 * 2.0F - (var33 - 1.0F) * (var25 - var24));
                                       var32 = (var33 - 1.0F) * (var32 - 1.0F) * (var34 - 1.0F);
                                    }

                                    if ((double)var31 > 0.0D) {
                                       var32 = -var32;
                                    } else {
                                       var31 = -var31;
                                    }

                                    var34 = var30;
                                    var30 = var29;
                                    if (2.0F * var31 < var32 * 3.0F * var39 - Math.abs(var32 * var38) && var31 < Math.abs(0.5F * var34 * var32)) {
                                       var29 = var31 / var32;
                                    } else {
                                       var29 = var39;
                                       var30 = var39;
                                    }
                                 } else {
                                    var29 = var39;
                                    var30 = var39;
                                 }

                                 var24 = var25;
                                 var26 = var27;
                                 if (Math.abs(var29) > var38) {
                                    var25 += var29;
                                 } else if ((double)var39 > 0.0D) {
                                    var25 += var38;
                                 } else {
                                    var25 -= var38;
                                 }

                                 var27 = dm.aw(var11.ap, var11.aw * -1448224687, var25, 1905125388);
                                 if ((double)(var27 * (var35 / Math.abs(var35))) > 0.0D) {
                                    var36 = true;
                                    var37 = true;
                                 } else {
                                    var37 = true;
                                 }
                              }
                           } while(var37);

                           var23 = var25;
                        }
                     }

                     var6[var22] = var23;
                     if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var41) {
                        var6[var10 - 2] = (var6[var10 - 1] + var6[var10 - 2]) * 0.5F;
                        --var10;
                     }
                  }
               }

               return var10;
            }
         }
      }
   }

   static float aj(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var3 = var0[var4] + var2 * var3;
      }

      return var3;
   }

   static float ai(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var3 = var0[var4] + var2 * var3;
      }

      return var3;
   }

   static void ar(kt var0, kt var1, float var2, kt var3, int var4) {
      try {
         var2 = cx.am(0.0F, 1.0F, var2, -1429368523);
         int var5 = var1.ap(227427987) - var0.ap(227427987);
         int var6 = var1.ak(-488158644) - var0.ak(-488158644);
         var5 = (int)((float)var5 * var2);
         var6 = (int)(var2 * (float)var6);
         var3.ae(var0.ap(227427987) + var5, var0.ak(-488158644) + var6, 1268495425);
         int var7 = kr.ai(var0.ay(2079429358), var1.ay(1743601276), (short)-4407);
         var7 = (int)((float)var7 * var2);
         var3.at(var0.ay(2115013782) + var7, (byte)21);
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "qc.ar(" + ')');
      }
   }

   static void aw(int var0, String var1, String var2, byte var3) {
      try {
         qn.ak(var0, var1, var2, (String)null, -2080490367);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "qc.aw(" + ')');
      }
   }

   static float ay(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var3 = var0[var4] + var2 * var3;
      }

      return var3;
   }
}
