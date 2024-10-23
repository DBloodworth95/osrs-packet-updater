public class ft {
   public static final float am = Math.ulp(1.0F);
   static final int bh = 34;
   static final float ag = 1.3333334F;
   static final float ae = 0.6666667F;
   public static final float ax;
   static final String hr = "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play";
   static final float ac = 0.33333334F;
   public static final int dt = 103;

   ft() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ft.<init>(" + ')');
      }
   }

   static void av(float var0, float var1, float var2, float var3, fr var4) {
      float var5 = var1 - var0;
      float var6 = var2 - var1;
      float var7 = var3 - var2;
      float var8 = var6 - var5;
      var4.az = var7 - var6 - var8;
      var4.ab = var8 + var8 + var8;
      var4.ap = var5 + var5 + var5;
      var4.ah = var0;
   }

   static float az(fr var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var2 = var1 - var0.af;
         return var0.ad + var2 * ((var0.ar + var2 * var0.au) * var2 + var0.al);
      }
   }

   static float ar(fr var0, float var1) {
      if (null != var0 && var0.au((byte)116) != 0) {
         if (var1 < (float)(var0.ax[0].ac * 1050146467)) {
            return var0.ag == fk.ac ? var0.ax[0].ae : et.am(var0, var1, true, (byte)-34);
         } else if (var1 > (float)(var0.ax[var0.au((byte)22) - 1].ac * -1590652747)) {
            return var0.am == fk.ac ? var0.ax[var0.au((byte)56) - 1].ae : et.am(var0, var1, false, (byte)8);
         } else if (var0.ae) {
            return var0.ax[0].ae;
         } else {
            fe var2 = var0.at(var1, -456789020);
            boolean var3 = false;
            boolean var4 = false;
            if (null == var2) {
               return 0.0F;
            } else {
               if (0.0F == var2.ax && 0.0F == var2.aq) {
                  var3 = true;
               } else if (Float.MAX_VALUE == var2.ax && Float.MAX_VALUE == var2.aq) {
                  var4 = true;
               } else if (var2.af != null) {
                  if (var0.aa) {
                     float var5 = (float)(var2.ac * -1487779715);
                     float var9 = var2.ae;
                     float var6 = var5 + var2.ax * 0.33333334F;
                     float var10 = var9 + var2.aq * 0.33333334F;
                     float var8 = (float)(var2.af.ac * -1487779715);
                     float var12 = var2.af.ae;
                     float var7 = var8 - var2.af.ag * 0.33333334F;
                     float var11 = var12 - var2.af.am * 0.33333334F;
                     float var15;
                     float var16;
                     float var17;
                     float var18;
                     float var19;
                     if (var0.ac) {
                        var15 = var10;
                        var16 = var11;
                        if (var0 != null) {
                           var17 = var8 - var5;
                           if (0.0F != var17) {
                              var18 = var6 - var5;
                              var19 = var7 - var5;
                              float[] var23 = new float[]{var18 / var17, var19 / var17};
                              var0.aq = 0.33333334F == var23[0] && 0.6666667F == var23[1];
                              float var21 = var23[0];
                              float var22 = var23[1];
                              if (var23[0] < 0.0F) {
                                 var23[0] = 0.0F;
                              }

                              if (var23[1] > 1.0F) {
                                 var23[1] = 1.0F;
                              }

                              if (var23[0] > 1.0F || var23[1] < -1.0F) {
                                 lj.aq(var23, (byte)1);
                              }

                              float var10000;
                              if (var21 != var23[0]) {
                                 var10000 = var5 + var17 * var23[0];
                                 if (0.0F != var21) {
                                    var15 = var9 + (var10 - var9) * var23[0] / var21;
                                 }
                              }

                              if (var23[1] != var22) {
                                 var10000 = var5 + var23[1] * var17;
                                 if (1.0F != var22) {
                                    var16 = var12 - (1.0F - var23[1]) * (var12 - var11) / (1.0F - var22);
                                 }
                              }

                              var0.af = var5;
                              var0.at = var8;
                              ao.af(0.0F, var23[0], var23[1], 1.0F, var0, 1490678624);
                              fc.at(var9, var15, var16, var12, var0, (short)160);
                           }
                        }
                     } else if (var0 != null) {
                        var0.af = var5;
                        float var13 = var8 - var5;
                        float var14 = var12 - var9;
                        var15 = var6 - var5;
                        var16 = 0.0F;
                        var17 = 0.0F;
                        if (var15 != 0.0F) {
                           var16 = (var10 - var9) / var15;
                        }

                        var15 = var8 - var7;
                        if (var15 != 0.0F) {
                           var17 = (var12 - var11) / var15;
                        }

                        var18 = 1.0F / (var13 * var13);
                        var19 = var16 * var13;
                        float var20 = var17 * var13;
                        var0.au = (var19 + var20 - var14 - var14) * var18 / var13;
                        var0.ar = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
                        var0.al = var16;
                        var0.ad = var9;
                     }

                     var0.aa = false;
                  }
               } else {
                  var3 = true;
               }

               if (var3) {
                  return var2.ae;
               } else if (var4) {
                  return (float)(var2.ac * -1487779715) != var1 && null != var2.af ? var2.af.ae : var2.ae;
               } else {
                  return var0.ac ? nd.ae(var0, var1, (byte)-45) : dl.ag(var0, var1, 658343153);
               }
            }
         }
      } else {
         return 0.0F;
      }
   }

   static float ad(fr var0, float var1) {
      if (null == var0) {
         return 0.0F;
      } else {
         float var2;
         if (var0.af == var1) {
            var2 = 0.0F;
         } else if (var0.at == var1) {
            var2 = 1.0F;
         } else {
            var2 = (var1 - var0.af) / (var0.at - var0.af);
         }

         float var3;
         if (var0.aq) {
            var3 = var2;
         } else {
            float[] var4 = new float[]{var0.au - var2, var0.ar, var0.al, var0.ad};
            float[] var5 = new float[5];
            int var6 = of.ac(var4, 3, 0.0F, true, 1.0F, true, var5, (byte)18);
            if (var6 == 1) {
               var3 = var5[0];
            } else {
               var3 = 0.0F;
            }
         }

         return var0.ah + var3 * ((var0.az * var3 + var0.ab) * var3 + var0.ap);
      }
   }

   static {
      ax = 2.0F * am;
   }

   static float ah(fr var0, float var1) {
      if (null == var0) {
         return 0.0F;
      } else {
         float var2;
         if (var0.af == var1) {
            var2 = 0.0F;
         } else if (var0.at == var1) {
            var2 = 1.0F;
         } else {
            var2 = (var1 - var0.af) / (var0.at - var0.af);
         }

         float var3;
         if (var0.aq) {
            var3 = var2;
         } else {
            float[] var4 = new float[]{var0.au - var2, var0.ar, var0.al, var0.ad};
            float[] var5 = new float[5];
            int var6 = of.ac(var4, 3, 0.0F, true, 1.0F, true, var5, (byte)27);
            if (var6 == 1) {
               var3 = var5[0];
            } else {
               var3 = 0.0F;
            }
         }

         return var0.ah + var3 * ((var0.az * var3 + var0.ab) * var3 + var0.ap);
      }
   }

   static float ap(fr var0, float var1) {
      if (null == var0) {
         return 0.0F;
      } else {
         float var2;
         if (var0.af == var1) {
            var2 = 0.0F;
         } else if (var0.at == var1) {
            var2 = 1.0F;
         } else {
            var2 = (var1 - var0.af) / (var0.at - var0.af);
         }

         float var3;
         if (var0.aq) {
            var3 = var2;
         } else {
            float[] var4 = new float[]{var0.au - var2, var0.ar, var0.al, var0.ad};
            float[] var5 = new float[5];
            int var6 = of.ac(var4, 3, 0.0F, true, 1.0F, true, var5, (byte)10);
            if (var6 == 1) {
               var3 = var5[0];
            } else {
               var3 = 0.0F;
            }
         }

         return var0.ah + var3 * ((var0.az * var3 + var0.ab) * var3 + var0.ap);
      }
   }

   static float ab(fr var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var2 = var1 - var0.af;
         return var0.ad + var2 * ((var0.ar + var2 * var0.au) * var2 + var0.al);
      }
   }

   static float al(fr var0, float var1) {
      if (null == var0) {
         return 0.0F;
      } else {
         float var2;
         if (var0.af == var1) {
            var2 = 0.0F;
         } else if (var0.at == var1) {
            var2 = 1.0F;
         } else {
            var2 = (var1 - var0.af) / (var0.at - var0.af);
         }

         float var3;
         if (var0.aq) {
            var3 = var2;
         } else {
            float[] var4 = new float[]{var0.au - var2, var0.ar, var0.al, var0.ad};
            float[] var5 = new float[5];
            int var6 = of.ac(var4, 3, 0.0F, true, 1.0F, true, var5, (byte)59);
            if (var6 == 1) {
               var3 = var5[0];
            } else {
               var3 = 0.0F;
            }
         }

         return var0.ah + var3 * ((var0.az * var3 + var0.ab) * var3 + var0.ap);
      }
   }

   static float aa(fr var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var2 = var1 - var0.af;
         return var0.ad + var2 * ((var0.ar + var2 * var0.au) * var2 + var0.al);
      }
   }

   static void ai(float[] var0) {
      if (am + var0[0] < 1.3333334F) {
         float var1 = var0[0] - 2.0F;
         float var2 = var0[0] - 1.0F;
         float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * 4.0F * var2));
         float var4 = 0.5F * (var3 + -var1);
         if (am + var0[1] > var4) {
            var0[1] = var4 - am;
         } else {
            var4 = (-var1 - var3) * 0.5F;
            if (var0[1] < var4 + am) {
               var0[1] = am + var4;
            }
         }
      } else {
         var0[0] = 1.3333334F - am;
         var0[1] = 0.33333334F - am;
      }

   }

   static float au(fr var0, float var1) {
      if (null != var0 && var0.au((byte)35) != 0) {
         if (var1 < (float)(var0.ax[0].ac * -1487779715)) {
            return var0.ag == fk.ac ? var0.ax[0].ae : et.am(var0, var1, true, (byte)-5);
         } else if (var1 > (float)(var0.ax[var0.au((byte)41) - 1].ac * 2020671379)) {
            return var0.am == fk.ac ? var0.ax[var0.au((byte)54) - 1].ae : et.am(var0, var1, false, (byte)-30);
         } else if (var0.ae) {
            return var0.ax[0].ae;
         } else {
            fe var2 = var0.at(var1, -1155622664);
            boolean var3 = false;
            boolean var4 = false;
            if (null == var2) {
               return 0.0F;
            } else {
               if (0.0F == var2.ax && 0.0F == var2.aq) {
                  var3 = true;
               } else if (Float.MAX_VALUE == var2.ax && Float.MAX_VALUE == var2.aq) {
                  var4 = true;
               } else if (var2.af != null) {
                  if (var0.aa) {
                     float var5 = (float)(var2.ac * -1118649606);
                     float var9 = var2.ae;
                     float var6 = var5 + var2.ax * 0.33333334F;
                     float var10 = var9 + var2.aq * 0.33333334F;
                     float var8 = (float)(var2.af.ac * -636944321);
                     float var12 = var2.af.ae;
                     float var7 = var8 - var2.af.ag * 0.33333334F;
                     float var11 = var12 - var2.af.am * 0.33333334F;
                     float var15;
                     float var16;
                     float var17;
                     float var18;
                     float var19;
                     if (var0.ac) {
                        var15 = var10;
                        var16 = var11;
                        if (var0 != null) {
                           var17 = var8 - var5;
                           if (0.0F != var17) {
                              var18 = var6 - var5;
                              var19 = var7 - var5;
                              float[] var23 = new float[]{var18 / var17, var19 / var17};
                              var0.aq = 0.33333334F == var23[0] && 0.6666667F == var23[1];
                              float var21 = var23[0];
                              float var22 = var23[1];
                              if (var23[0] < 0.0F) {
                                 var23[0] = 0.0F;
                              }

                              if (var23[1] > 1.0F) {
                                 var23[1] = 1.0F;
                              }

                              if (var23[0] > 1.0F || var23[1] < -1.0F) {
                                 lj.aq(var23, (byte)1);
                              }

                              float var10000;
                              if (var21 != var23[0]) {
                                 var10000 = var5 + var17 * var23[0];
                                 if (0.0F != var21) {
                                    var15 = var9 + (var10 - var9) * var23[0] / var21;
                                 }
                              }

                              if (var23[1] != var22) {
                                 var10000 = var5 + var23[1] * var17;
                                 if (1.0F != var22) {
                                    var16 = var12 - (1.0F - var23[1]) * (var12 - var11) / (1.0F - var22);
                                 }
                              }

                              var0.af = var5;
                              var0.at = var8;
                              ao.af(0.0F, var23[0], var23[1], 1.0F, var0, 1918868303);
                              fc.at(var9, var15, var16, var12, var0, (short)160);
                           }
                        }
                     } else if (var0 != null) {
                        var0.af = var5;
                        float var13 = var8 - var5;
                        float var14 = var12 - var9;
                        var15 = var6 - var5;
                        var16 = 0.0F;
                        var17 = 0.0F;
                        if (var15 != 0.0F) {
                           var16 = (var10 - var9) / var15;
                        }

                        var15 = var8 - var7;
                        if (var15 != 0.0F) {
                           var17 = (var12 - var11) / var15;
                        }

                        var18 = 1.0F / (var13 * var13);
                        var19 = var16 * var13;
                        float var20 = var17 * var13;
                        var0.au = (var19 + var20 - var14 - var14) * var18 / var13;
                        var0.ar = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
                        var0.al = var16;
                        var0.ad = var9;
                     }

                     var0.aa = false;
                  }
               } else {
                  var3 = true;
               }

               if (var3) {
                  return var2.ae;
               } else if (var4) {
                  return (float)(var2.ac * 1970205118) != var1 && null != var2.af ? var2.af.ae : var2.ae;
               } else {
                  return var0.ac ? nd.ae(var0, var1, (byte)-8) : dl.ag(var0, var1, -860218172);
               }
            }
         }
      } else {
         return 0.0F;
      }
   }

   static void as(float[] var0) {
      var0[1] = 1.0F - var0[1];
      if (var0[0] < 0.0F) {
         var0[0] = 0.0F;
      }

      if (var0[1] < 0.0F) {
         var0[1] = 0.0F;
      }

      if (var0[0] > 1.0F || var0[1] > 1.0F) {
         float var1 = var0[0] * (var0[0] - 2.0F + var0[1]) + var0[1] * (var0[1] - 2.0F) + 1.0F;
         if (am + var1 > 0.0F) {
            gg.ax(var0, -1876728077);
         }
      }

      var0[1] = 1.0F - var0[1];
   }

   static void ay(float var0, float var1, float var2, float var3, fr var4) {
      float var5 = var1 - var0;
      float var6 = var2 - var1;
      float var7 = var3 - var2;
      float var8 = var6 - var5;
      var4.ad = var7 - var6 - var8;
      var4.al = var8 + var8 + var8;
      var4.ar = var5 + var5 + var5;
      var4.au = var0;
   }

   static void aj(float var0, float var1, float var2, float var3, fr var4) {
      float var5 = var1 - var0;
      float var6 = var2 - var1;
      float var7 = var3 - var2;
      float var8 = var6 - var5;
      var4.az = var7 - var6 - var8;
      var4.ab = var8 + var8 + var8;
      var4.ap = var5 + var5 + var5;
      var4.ah = var0;
   }

   static void ao(float[] var0) {
      if (am + var0[0] < 1.3333334F) {
         float var1 = var0[0] - 2.0F;
         float var2 = var0[0] - 1.0F;
         float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * 4.0F * var2));
         float var4 = 0.5F * (var3 + -var1);
         if (am + var0[1] > var4) {
            var0[1] = var4 - am;
         } else {
            var4 = (-var1 - var3) * 0.5F;
            if (var0[1] < var4 + am) {
               var0[1] = am + var4;
            }
         }
      } else {
         var0[0] = 1.3333334F - am;
         var0[1] = 0.33333334F - am;
      }

   }

   static fu aq(int var0, byte var1) {
      try {
         fu[] var2 = new fu[]{fu.ac, fu.ae, fu.ag, fu.am, fu.ax, fu.aq, fu.af, fu.at, fu.au, fu.ar, fu.al, fu.ad, fu.ah, fu.ap, fu.ab, fu.az, fu.aa};
         fu var3 = (fu)ox.ac(var2, var0, 1367927432);
         if (var3 == null) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            var3 = fu.ac;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ft.aq(" + ')');
      }
   }

   static int cf(int var0, dt var1, boolean var2, int var3) {
      try {
         int var4;
         int var5;
         if (8000 == var0) {
            if (var3 >= -160555104) {
               throw new IllegalStateException();
            } else {
               mp.au -= -1856457959;
               var4 = cs.at[844691753 * mp.au];
               var5 = cs.aq[var4];
               fe.am(cs.af[var4], new int[var5], 0, var5 - 1, -1486251795);
               return 1;
            }
         } else if (8001 == var0) {
            mp.au -= -1274406581;
            var4 = cs.at[844691753 * mp.au];
            var5 = cs.at[1 + mp.au * 844691753];
            int var6 = cs.at[mp.au * 844691753 + 2];
            int var7 = cs.aq[var4];
            if (var7 <= 1) {
               if (var3 >= -160555104) {
                  throw new IllegalStateException();
               } else {
                  return 1;
               }
            } else {
               rq.al(cs.af[var4], var7, var5, var6);
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ft.cf(" + ')');
      }
   }
}
