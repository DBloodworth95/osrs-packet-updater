public class tm {
   static final int ak = 7;
   static final int aw = 7;
   static em qz;
   public static final int aj = 64;
   public static final int ai = 896;
   public static int[] as;
   static int[] ay = new int['耀'];
   public static final int ap = 10;

   public static wa aw(Throwable var0, String var1) {
      try {
         wa var2;
         if (var0 instanceof wa) {
            var2 = (wa)var0;
            var2.ay = var2.ay + ' ' + var1;
         } else {
            var2 = new wa(var0, var1);
         }

         return var2;
      } catch (RuntimeException var3) {
         throw aw(var3, "tm.aw(" + ')');
      }
   }

   public static int ay(int var0) {
      return 255 - (var0 & 255);
   }

   public static int aw(int var0, byte var1) {
      try {
         return 255 - (var0 & 255);
      } catch (RuntimeException var2) {
         throw aw(var2, "tm.aw(" + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 32768; ++var0) {
         ay[var0] = ap(var0, (byte)-117);
      }

      if (as == null) {
         as = new int[65536];
         double var25 = 0.949999988079071D;

         for(int var2 = 0; var2 < 65536; ++var2) {
            double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D;
            double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D;
            double var7 = (double)(var2 & 127) / 128.0D;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if (0.0D != var5) {
               double var15;
               if (var7 < 0.5D) {
                  var15 = var7 * (var5 + 1.0D);
               } else {
                  var15 = var5 + var7 - var7 * var5;
               }

               double var17 = 2.0D * var7 - var15;
               double var19 = 0.3333333333333333D + var3;
               if (var19 > 1.0D) {
                  --var19;
               }

               double var23 = var3 - 0.3333333333333333D;
               if (var23 < 0.0D) {
                  ++var23;
               }

               if (var19 * 6.0D < 1.0D) {
                  var9 = var19 * (var15 - var17) * 6.0D + var17;
               } else if (var19 * 2.0D < 1.0D) {
                  var9 = var15;
               } else if (3.0D * var19 < 2.0D) {
                  var9 = 6.0D * (var15 - var17) * (0.6666666666666666D - var19) + var17;
               } else {
                  var9 = var17;
               }

               if (6.0D * var3 < 1.0D) {
                  var11 = var3 * (var15 - var17) * 6.0D + var17;
               } else if (2.0D * var3 < 1.0D) {
                  var11 = var15;
               } else if (var3 * 3.0D < 2.0D) {
                  var11 = 6.0D * (0.6666666666666666D - var3) * (var15 - var17) + var17;
               } else {
                  var11 = var17;
               }

               if (6.0D * var23 < 1.0D) {
                  var13 = var17 + var23 * 6.0D * (var15 - var17);
               } else if (2.0D * var23 < 1.0D) {
                  var13 = var15;
               } else if (3.0D * var23 < 2.0D) {
                  var13 = var17 + (var15 - var17) * (0.6666666666666666D - var23) * 6.0D;
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var25);
            var11 = Math.pow(var11, var25);
            var13 = Math.pow(var13, var25);
            int var26 = (int)(var9 * 256.0D);
            int var16 = (int)(var11 * 256.0D);
            int var27 = (int)(256.0D * var13);
            int var18 = var27 + (var16 << 8) + (var26 << 16);
            as[var2] = var18 & 16777215;
         }
      }

   }

   static final int aj(int var0) {
      double var1 = (double)(var0 >> 10 & 31) / 31.0D;
      double var3 = (double)(var0 >> 5 & -946400725) / 31.0D;
      double var5 = (double)(var0 & 446493420) / 31.0D;
      double var7 = var1;
      if (var3 < var1) {
         var7 = var3;
      }

      if (var5 < var7) {
         var7 = var5;
      }

      double var9 = var1;
      if (var3 > var1) {
         var9 = var3;
      }

      if (var5 > var9) {
         var9 = var5;
      }

      double var11 = 0.0D;
      double var13 = 0.0D;
      double var15 = (var7 + var9) / 2.0D;
      if (var9 != var7) {
         if (var15 < 0.5D) {
            var13 = (var9 - var7) / (var9 + var7);
         }

         if (var15 >= 0.5D) {
            var13 = (var9 - var7) / (2.0D - var9 - var7);
         }

         if (var1 == var9) {
            var11 = (var3 - var5) / (var9 - var7);
         } else if (var3 == var9) {
            var11 = 2.0D + (var5 - var1) / (var9 - var7);
         } else if (var5 == var9) {
            var11 = (var1 - var3) / (var9 - var7) + 4.0D;
         }
      }

      int var17 = (int)(var11 * 256.0D / 6.0D);
      var17 &= 255;
      double var18 = 256.0D * var13;
      if (var18 < 0.0D) {
         var18 = 0.0D;
      } else if (var18 > 255.0D) {
         var18 = 255.0D;
      }

      if (var15 > 0.7D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.75D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.85D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.95D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.995D) {
         var15 = 0.995D;
      }

      int var20 = (int)((double)(8 * (var17 / 4)) + var18 / 32.0D);
      return (int)(var15 * 128.0D) + (var20 << 7);
   }

   static final int ak(int var0) {
      double var1 = (double)(var0 >> 10 & 31) / 31.0D;
      double var3 = (double)(var0 >> 5 & 31) / 31.0D;
      double var5 = (double)(var0 & 31) / 31.0D;
      double var7 = var1;
      if (var3 < var1) {
         var7 = var3;
      }

      if (var5 < var7) {
         var7 = var5;
      }

      double var9 = var1;
      if (var3 > var1) {
         var9 = var3;
      }

      if (var5 > var9) {
         var9 = var5;
      }

      double var11 = 0.0D;
      double var13 = 0.0D;
      double var15 = (var7 + var9) / 2.0D;
      if (var9 != var7) {
         if (var15 < 0.5D) {
            var13 = (var9 - var7) / (var9 + var7);
         }

         if (var15 >= 0.5D) {
            var13 = (var9 - var7) / (2.0D - var9 - var7);
         }

         if (var1 == var9) {
            var11 = (var3 - var5) / (var9 - var7);
         } else if (var3 == var9) {
            var11 = 2.0D + (var5 - var1) / (var9 - var7);
         } else if (var5 == var9) {
            var11 = (var1 - var3) / (var9 - var7) + 4.0D;
         }
      }

      int var17 = (int)(var11 * 256.0D / 6.0D);
      var17 &= 255;
      double var18 = 256.0D * var13;
      if (var18 < 0.0D) {
         var18 = 0.0D;
      } else if (var18 > 255.0D) {
         var18 = 255.0D;
      }

      if (var15 > 0.7D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.75D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.85D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.95D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.995D) {
         var15 = 0.995D;
      }

      int var20 = (int)((double)(8 * (var17 / 4)) + var18 / 32.0D);
      return (int)(var15 * 128.0D) + (var20 << 7);
   }

   public static int ai(int var0) {
      return 255 - (var0 & 1843234795);
   }

   static final int ap(int var0, byte var1) {
      try {
         double var2 = (double)(var0 >> 10 & 31) / 31.0D;
         double var4 = (double)(var0 >> 5 & 31) / 31.0D;
         double var6 = (double)(var0 & 31) / 31.0D;
         double var8 = var2;
         if (var4 < var2) {
            var8 = var4;
         }

         if (var6 < var8) {
            if (var1 >= 18) {
               throw new IllegalStateException();
            }

            var8 = var6;
         }

         double var10 = var2;
         if (var4 > var2) {
            if (var1 >= 18) {
               throw new IllegalStateException();
            }

            var10 = var4;
         }

         if (var6 > var10) {
            var10 = var6;
         }

         double var12 = 0.0D;
         double var14 = 0.0D;
         double var16 = (var8 + var10) / 2.0D;
         if (var10 != var8) {
            if (var1 >= 18) {
               throw new IllegalStateException();
            }

            if (var16 < 0.5D) {
               var14 = (var10 - var8) / (var10 + var8);
            }

            if (var16 >= 0.5D) {
               if (var1 >= 18) {
                  throw new IllegalStateException();
               }

               var14 = (var10 - var8) / (2.0D - var10 - var8);
            }

            if (var2 == var10) {
               var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
               if (var1 >= 18) {
                  throw new IllegalStateException();
               }

               var12 = 2.0D + (var6 - var2) / (var10 - var8);
            } else if (var6 == var10) {
               if (var1 >= 18) {
                  throw new IllegalStateException();
               }

               var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
         }

         int var18 = (int)(var12 * 256.0D / 6.0D);
         var18 &= 255;
         double var19 = 256.0D * var14;
         if (var19 < 0.0D) {
            if (var1 >= 18) {
               throw new IllegalStateException();
            }

            var19 = 0.0D;
         } else if (var19 > 255.0D) {
            if (var1 >= 18) {
               throw new IllegalStateException();
            }

            var19 = 255.0D;
         }

         if (var16 > 0.7D) {
            if (var1 >= 18) {
               throw new IllegalStateException();
            }

            var19 /= 2.0D;
            var19 = Math.floor(var19);
         }

         if (var16 > 0.75D) {
            var19 /= 2.0D;
            var19 = Math.floor(var19);
         }

         if (var16 > 0.85D) {
            if (var1 >= 18) {
               throw new IllegalStateException();
            }

            var19 /= 2.0D;
            var19 = Math.floor(var19);
         }

         if (var16 > 0.95D) {
            if (var1 >= 18) {
               throw new IllegalStateException();
            }

            var19 /= 2.0D;
            var19 = Math.floor(var19);
         }

         if (var16 > 0.995D) {
            if (var1 >= 18) {
               throw new IllegalStateException();
            }

            var16 = 0.995D;
         }

         int var21 = (int)((double)(8 * (var18 / 4)) + var19 / 32.0D);
         return (int)(var16 * 128.0D) + (var21 << 7);
      } catch (RuntimeException var22) {
         throw aw(var22, "tm.ap(" + ')');
      }
   }

   static fl[] ap(int var0) {
      try {
         return new fl[]{fl.ap, fl.aw, fl.ak, fl.aj, fl.ai, fl.ay};
      } catch (RuntimeException var1) {
         throw aw(var1, "tm.ap(" + ')');
      }
   }

   public static int ap(int var0) {
      try {
         return jr.ar * 278912807;
      } catch (RuntimeException var1) {
         throw aw(var1, "tm.ap(" + ')');
      }
   }

   static final void an(dn var0, byte var1) {
      try {
         int var2 = var0.ai * 1587254913;
         int var3 = var0.ay * -1000264093;
         int[][][] var4 = var0.at;
         byte[][][] var5 = var0.au;
         ji var6 = var0.aw;
         ko[] var7 = var0.ak;

         int var8;
         int var9;
         int var10;
         int var11;
         for(var8 = 0; var8 < 4; ++var8) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            for(var9 = 0; var9 < var2; ++var9) {
               for(var10 = 0; var10 < var3; ++var10) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  if (1 == (var0.au[var8][var9][var10] & 1)) {
                     if (var1 != 1) {
                        return;
                     }

                     var11 = var8;
                     if (2 == (var0.au[1][var9][var10] & 2)) {
                        if (var1 != 1) {
                           return;
                        }

                        var11 = var8 - 1;
                     }

                     if (var11 >= 0) {
                        if (var1 != 1) {
                           throw new IllegalStateException();
                        }

                        if (var7 != null) {
                           if (var1 != 1) {
                              return;
                           }

                           var7[var11].aj(var9, var10, (byte)93);
                        }
                     }
                  }
               }
            }
         }

         dg.aq += ((int)(Math.random() * 5.0D) - 2) * 393163289;
         if (1620838953 * dg.aq < -8) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            dg.aq = 1149660984;
         }

         if (dg.aq * 1620838953 > 8) {
            if (var1 != 1) {
               return;
            }

            dg.aq = -1149660984;
         }

         dg.al += ((int)(Math.random() * 5.0D) - 2) * -316002055;
         if (dg.al * -53243575 < -16) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            dg.al = 761065584;
         }

         if (dg.al * -53243575 > 16) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            dg.al = -761065584;
         }

         int var15;
         int var16;
         int[] var10000;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         for(var8 = 0; var8 < 4; ++var8) {
            byte[][] var54 = dg.ay[var8];
            boolean var55 = true;
            boolean var56 = true;
            boolean var12 = true;
            boolean var13 = true;
            boolean var14 = true;
            var15 = (int)Math.sqrt(5100.0D);
            var16 = 768 * var15 >> 8;

            int var25;
            for(var17 = 1; var17 < var3 - 1; ++var17) {
               if (var1 != 1) {
                  return;
               }

               for(var18 = 1; var18 < var2 - 1; ++var18) {
                  if (var1 != 1) {
                     return;
                  }

                  var19 = var4[var8][1 + var18][var17] - var4[var8][var18 - 1][var17];
                  var20 = var4[var8][var18][var17 + 1] - var4[var8][var18][var17 - 1];
                  var21 = (int)Math.sqrt((double)(var20 * var20 + var19 * var19 + 65536));
                  var22 = (var19 << 8) / var21;
                  var23 = 65536 / var21;
                  var24 = (var20 << 8) / var21;
                  var25 = 96 + (-50 * var22 + -10 * var23 + var24 * -50) / var16;
                  int var26 = (var54[var18][var17] >> 1) + (var54[var18][1 + var17] >> 3) + (var54[var18][var17 - 1] >> 2) + (var54[var18 - 1][var17] >> 2) + (var54[var18 + 1][var17] >> 3);
                  dg.as[var18][var17] = var25 - var26;
               }
            }

            for(var17 = 0; var17 < var3; ++var17) {
               if (var1 != 1) {
                  return;
               }

               dg.ae[var17] = 0;
               dg.am[var17] = 0;
               wk.at[var17] = 0;
               cr.au[var17] = 0;
               dg.an[var17] = 0;
            }

            for(var17 = -5; var17 < 5 + var2; ++var17) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               for(var18 = 0; var18 < var3; ++var18) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  var19 = 5 + var17;
                  int var10002;
                  if (var19 >= 0) {
                     if (var1 != 1) {
                        throw new IllegalStateException();
                     }

                     if (var19 < var2) {
                        if (var1 != 1) {
                           return;
                        }

                        long var60 = (long)Math.pow(2.0D, 15.0D) - 1L;
                        var22 = (int)var60;
                        var23 = dg.aw[var8][var19][var18] & var22;
                        if (var23 > 0) {
                           hv var63 = dc.aw(var23 - 1, (byte)1);
                           var10000 = dg.ae;
                           var10000[var18] += var63.aj * 1467474647;
                           var10000 = dg.am;
                           var10000[var18] += -767557955 * var63.ai;
                           var10000 = wk.at;
                           var10000[var18] += 1473097783 * var63.ay;
                           var10000 = cr.au;
                           var10000[var18] += 613794733 * var63.as;
                           var10002 = dg.an[var18]++;
                        }
                     }
                  }

                  var20 = var17 - 5;
                  if (var20 >= 0) {
                     if (var1 != 1) {
                        throw new IllegalStateException();
                     }

                     if (var20 < var2) {
                        if (var1 != 1) {
                           throw new IllegalStateException();
                        }

                        long var61 = (long)Math.pow(2.0D, 15.0D) - 1L;
                        var23 = (int)var61;
                        var24 = dg.aw[var8][var20][var18] & var23;
                        if (var24 > 0) {
                           if (var1 != 1) {
                              return;
                           }

                           hv var64 = dc.aw(var24 - 1, (byte)1);
                           var10000 = dg.ae;
                           var10000[var18] -= var64.aj * 1467474647;
                           var10000 = dg.am;
                           var10000[var18] -= -767557955 * var64.ai;
                           var10000 = wk.at;
                           var10000[var18] -= var64.ay * 1473097783;
                           var10000 = cr.au;
                           var10000[var18] -= var64.as * 613794733;
                           var10002 = dg.an[var18]--;
                        }
                     }
                  }
               }

               if (var17 >= 1) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  if (var17 < var2 - 1) {
                     var18 = 0;
                     var19 = 0;
                     var20 = 0;
                     var21 = 0;
                     var22 = 0;

                     for(var23 = -5; var23 < 5 + var3; ++var23) {
                        if (var1 != 1) {
                           throw new IllegalStateException();
                        }

                        var24 = 5 + var23;
                        if (var24 >= 0) {
                           if (var1 != 1) {
                              return;
                           }

                           if (var24 < var3) {
                              if (var1 != 1) {
                                 return;
                              }

                              var18 += dg.ae[var24];
                              var19 += dg.am[var24];
                              var20 += wk.at[var24];
                              var21 += cr.au[var24];
                              var22 += dg.an[var24];
                           }
                        }

                        var25 = var23 - 5;
                        if (var25 >= 0 && var25 < var3) {
                           var18 -= dg.ae[var25];
                           var19 -= dg.am[var25];
                           var20 -= wk.at[var25];
                           var21 -= cr.au[var25];
                           var22 -= dg.an[var25];
                        }

                        if (var23 >= 1 && var23 < var3 - 1) {
                           if (client.cl) {
                              if (var1 != 1) {
                                 return;
                              }

                              if (0 == (var5[0][var17][var23] & 2)) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 != (var5[var8][var17][var23] & 16)) {
                                    if (var1 != 1) {
                                       return;
                                    }
                                    continue;
                                 }
                              }
                           }

                           if (var8 < dg.ap * -213423439) {
                              if (var1 != 1) {
                                 throw new IllegalStateException();
                              }

                              ap = 1659805265 * var8;
                           }

                           long var65 = (long)Math.pow(2.0D, 15.0D) - 1L;
                           int var28 = (int)var65;
                           int var29 = dg.aw[var8][var17][var23] & var28;
                           int var30 = dg.ak[var8][var17][var23] & var28;
                           if (var29 <= 0) {
                              if (var1 != 1) {
                                 throw new IllegalStateException();
                              }

                              if (var30 <= 0) {
                                 continue;
                              }
                           }

                           int var31 = var4[var8][var17][var23];
                           int var32 = var4[var8][var17 + 1][var23];
                           int var33 = var4[var8][1 + var17][var23 + 1];
                           int var34 = var4[var8][var17][var23 + 1];
                           int var35 = dg.as[var17][var23];
                           int var36 = dg.as[1 + var17][var23];
                           int var37 = dg.as[var17 + 1][var23 + 1];
                           int var38 = dg.as[var17][1 + var23];
                           int var39 = -1;
                           int var40 = -1;
                           int var41;
                           int var42;
                           int var43;
                           if (var29 > 0) {
                              if (var1 != 1) {
                                 return;
                              }

                              var41 = var18 * 256 / var21;
                              var42 = var19 / var22;
                              var43 = var20 / var22;
                              var39 = oy.ac(var41, var42, var43, (byte)-111);
                              var41 = var41 + 1620838953 * dg.aq & 255;
                              var43 += dg.al * -53243575;
                              if (var43 < 0) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 var43 = 0;
                              } else if (var43 > 255) {
                                 if (var1 != 1) {
                                    return;
                                 }

                                 var43 = 255;
                              }

                              var40 = oy.ac(var41, var42, var43, (byte)-93);
                           }

                           in var44;
                           if (var8 > 0) {
                              if (var1 != 1) {
                                 throw new IllegalStateException();
                              }

                              boolean var66 = true;
                              if (var29 == 0) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 if (dg.aj[var8][var17][var23] != 0) {
                                    if (var1 != 1) {
                                       throw new IllegalStateException();
                                    }

                                    var66 = false;
                                 }
                              }

                              if (var30 > 0) {
                                 var43 = var30 - 1;
                                 var44 = (in)in.aw.ap((long)var43);
                                 in var67;
                                 if (null != var44) {
                                    if (var1 != 1) {
                                       throw new IllegalStateException();
                                    }

                                    var67 = var44;
                                 } else {
                                    byte[] var45 = in.ap.bm(4, var43, 922622425);
                                    var44 = new in();
                                    if (null != var45) {
                                       if (var1 != 1) {
                                          throw new IllegalStateException();
                                       }

                                       var44.ak(new vl(var45), var43, (byte)-105);
                                    }

                                    var44.aw((byte)52);
                                    in.aw.ak(var44, (long)var43);
                                    var67 = var44;
                                 }

                                 if (!var67.ai) {
                                    var66 = false;
                                 }
                              }

                              if (var66) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 if (var32 == var31) {
                                    if (var1 != 1) {
                                       throw new IllegalStateException();
                                    }

                                    if (var33 == var31) {
                                       if (var1 != 1) {
                                          throw new IllegalStateException();
                                       }

                                       if (var34 == var31) {
                                          if (var1 != 1) {
                                             throw new IllegalStateException();
                                          }

                                          var10000 = ua.ao[var8][var17];
                                          var10000[var23] |= 2340;
                                       }
                                    }
                                 }
                              }
                           }

                           var41 = 0;
                           if (var40 != -1) {
                              var41 = jm.ap[dk.ag(var40, 96, -809723661)];
                           }

                           if (0 == var30) {
                              if (var1 != 1) {
                                 return;
                              }

                              var6.ay(var8, var17, var23, 0, 0, -1, var31, var32, var33, var34, dk.ag(var39, var35, -31359343), dk.ag(var39, var36, -1242615633), dk.ag(var39, var37, 1393875227), dk.ag(var39, var38, 93213670), 0, 0, 0, 0, var41, 0);
                           } else {
                              var42 = 1 + dg.aj[var8][var17][var23];
                              byte var68 = dg.ai[var8][var17][var23];
                              int var69 = var30 - 1;
                              in var46 = (in)in.aw.ap((long)var69);
                              if (var46 != null) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 var44 = var46;
                              } else {
                                 byte[] var47 = in.ap.bm(4, var69, 1273651118);
                                 var46 = new in();
                                 if (var47 != null) {
                                    var46.ak(new vl(var47), var69, (byte)-70);
                                 }

                                 var46.aw((byte)-22);
                                 in.aw.ak(var46, (long)var69);
                                 var44 = var46;
                              }

                              int var70 = -1814161031 * var44.aj;
                              int var48;
                              int var49;
                              int var50;
                              int var51;
                              if (var70 >= 0) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 var49 = jm.as.as.aj(var70, (byte)-75);
                                 var48 = -1;
                              } else if (var44.ak * -265762545 == 16711935) {
                                 if (var1 != 1) {
                                    return;
                                 }

                                 var48 = -2;
                                 var70 = -1;
                                 var49 = -2;
                              } else {
                                 var48 = oy.ac(-1283114581 * var44.as, -1450197231 * var44.ae, -1077160877 * var44.am, (byte)-95);
                                 var50 = -1283114581 * var44.as + dg.aq * 1620838953 & 255;
                                 var51 = dg.al * -53243575 + -1077160877 * var44.am;
                                 if (var51 < 0) {
                                    if (var1 != 1) {
                                       return;
                                    }

                                    var51 = 0;
                                 } else if (var51 > 255) {
                                    if (var1 != 1) {
                                       throw new IllegalStateException();
                                    }

                                    var51 = 255;
                                 }

                                 var49 = oy.ac(var50, var44.ae * -1450197231, var51, (byte)-6);
                              }

                              var50 = 0;
                              if (var49 != -2) {
                                 if (var1 != 1) {
                                    return;
                                 }

                                 var50 = jm.ap[hp.ad(var49, 96, (short)-5843)];
                              }

                              if (-1 != var44.ay * -1742760383) {
                                 var51 = var44.at * -1693258293 + dg.aq * 1620838953 & 255;
                                 int var52 = -1789961391 * var44.an + -53243575 * dg.al;
                                 if (var52 < 0) {
                                    if (var1 != 1) {
                                       return;
                                    }

                                    var52 = 0;
                                 } else if (var52 > 255) {
                                    var52 = 255;
                                 }

                                 var49 = oy.ac(var51, var44.au * -42789891, var52, (byte)71);
                                 var50 = jm.ap[hp.ad(var49, 96, (short)-25957)];
                              }

                              var6.ay(var8, var17, var23, var42, var68, var70, var31, var32, var33, var34, dk.ag(var39, var35, -1891153266), dk.ag(var39, var36, -706606532), dk.ag(var39, var37, 209196945), dk.ag(var39, var38, -1479501943), hp.ad(var48, var35, (short)-14954), hp.ad(var48, var36, (short)-14382), hp.ad(var48, var37, (short)-8358), hp.ad(var48, var38, (short)-5600), var41, var50);
                           }
                        }
                     }
                  }
               }
            }

            for(var17 = 1; var17 < var3 - 1; ++var17) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               for(var18 = 1; var18 < var2 - 1; ++var18) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  var6.ai(var8, var18, var17, cj.ao(var0, var8, var18, var17, (byte)-58));
               }
            }

            dg.aw[var8] = (short[][])null;
            dg.ak[var8] = (short[][])null;
            dg.aj[var8] = (byte[][])null;
            dg.ai[var8] = (byte[][])null;
            dg.ay[var8] = (byte[][])null;
         }

         var6.bz(-50, -10, -50);

         for(var8 = 0; var8 < var2; ++var8) {
            if (var1 != 1) {
               return;
            }

            for(var9 = 0; var9 < var3; ++var9) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               if ((var5[1][var8][var9] & 2) == 2) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  var6.ak(var8, var9);
               }
            }
         }

         var8 = 1;
         var9 = 2;
         var10 = 4;

         for(var11 = 0; var11 < 4; ++var11) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            if (var11 > 0) {
               if (var1 != 1) {
                  return;
               }

               var8 <<= 3;
               var9 <<= 3;
               var10 <<= 3;
            }

            for(int var57 = 0; var57 <= var11; ++var57) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               for(int var58 = 0; var58 <= var3; ++var58) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  for(int var59 = 0; var59 <= var2; ++var59) {
                     if (var1 != 1) {
                        throw new IllegalStateException();
                     }

                     short var62;
                     if (0 != (ua.ao[var57][var59][var58] & var8)) {
                        if (var1 != 1) {
                           throw new IllegalStateException();
                        }

                        var15 = var58;
                        var16 = var58;
                        var17 = var57;

                        for(var18 = var57; var15 > 0; --var15) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           if (0 == (ua.ao[var57][var59][var15 - 1] & var8)) {
                              break;
                           }

                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }
                        }

                        while(var16 < var3) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           if (0 == (ua.ao[var57][var59][var16 + 1] & var8)) {
                              break;
                           }

                           if (var1 != 1) {
                              return;
                           }

                           ++var16;
                        }

                        label829:
                        while(var17 > 0) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           for(var19 = var15; var19 <= var16; ++var19) {
                              if (var1 != 1) {
                                 throw new IllegalStateException();
                              }

                              if ((ua.ao[var17 - 1][var59][var19] & var8) == 0) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }
                                 break label829;
                              }
                           }

                           --var17;
                        }

                        label815:
                        while(var18 < var11) {
                           for(var19 = var15; var19 <= var16; ++var19) {
                              if (var1 != 1) {
                                 return;
                              }

                              if (0 == (ua.ao[var18 + 1][var59][var19] & var8)) {
                                 break label815;
                              }
                           }

                           ++var18;
                        }

                        var19 = (var18 + 1 - var17) * (1 + (var16 - var15));
                        if (var19 >= 8) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           var62 = 240;
                           var21 = var4[var18][var59][var15] - var62;
                           var22 = var4[var17][var59][var15];
                           var6.aj(var11, 1, var59 * 128, var59 * 128, 128 * var15, 128 + var16 * 128, var21, var22);

                           for(var23 = var17; var23 <= var18; ++var23) {
                              for(var24 = var15; var24 <= var16; ++var24) {
                                 var10000 = ua.ao[var23][var59];
                                 var10000[var24] &= ~var8;
                              }
                           }
                        }
                     }

                     if ((ua.ao[var57][var59][var58] & var9) != 0) {
                        var15 = var59;
                        var16 = var59;
                        var17 = var57;

                        for(var18 = var57; var15 > 0; --var15) {
                           if (var1 != 1) {
                              return;
                           }

                           if ((ua.ao[var57][var15 - 1][var58] & var9) == 0) {
                              break;
                           }

                           if (var1 != 1) {
                              return;
                           }
                        }

                        while(var16 < var2) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           if (0 == (ua.ao[var57][var16 + 1][var58] & var9)) {
                              break;
                           }

                           if (var1 != 1) {
                              return;
                           }

                           ++var16;
                        }

                        label884:
                        while(var17 > 0) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           for(var19 = var15; var19 <= var16; ++var19) {
                              if ((ua.ao[var17 - 1][var19][var58] & var9) == 0) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }
                                 break label884;
                              }
                           }

                           --var17;
                        }

                        label873:
                        while(var18 < var11) {
                           if (var1 != 1) {
                              return;
                           }

                           for(var19 = var15; var19 <= var16; ++var19) {
                              if (0 == (ua.ao[var18 + 1][var19][var58] & var9)) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }
                                 break label873;
                              }
                           }

                           ++var18;
                        }

                        var19 = (1 + var18 - var17) * (1 + (var16 - var15));
                        if (var19 >= 8) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           var62 = 240;
                           var21 = var4[var18][var15][var58] - var62;
                           var22 = var4[var17][var15][var58];
                           var6.aj(var11, 2, var15 * 128, var16 * 128 + 128, var58 * 128, var58 * 128, var21, var22);

                           for(var23 = var17; var23 <= var18; ++var23) {
                              if (var1 != 1) {
                                 throw new IllegalStateException();
                              }

                              for(var24 = var15; var24 <= var16; ++var24) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = ua.ao[var23][var24];
                                 var10000[var58] &= ~var9;
                              }
                           }
                        }
                     }

                     if ((ua.ao[var57][var59][var58] & var10) != 0) {
                        if (var1 != 1) {
                           throw new IllegalStateException();
                        }

                        var15 = var59;
                        var16 = var59;
                        var17 = var58;

                        for(var18 = var58; var17 > 0; --var17) {
                           if (var1 != 1) {
                              return;
                           }

                           if (0 == (ua.ao[var57][var59][var17 - 1] & var10)) {
                              break;
                           }

                           if (var1 != 1) {
                              return;
                           }
                        }

                        while(var18 < var3) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           if ((ua.ao[var57][var59][1 + var18] & var10) == 0) {
                              break;
                           }

                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           ++var18;
                        }

                        label945:
                        while(var15 > 0) {
                           if (var1 != 1) {
                              return;
                           }

                           for(var19 = var17; var19 <= var18; ++var19) {
                              if (var1 != 1) {
                                 throw new IllegalStateException();
                              }

                              if ((ua.ao[var57][var15 - 1][var19] & var10) == 0) {
                                 break label945;
                              }
                           }

                           --var15;
                        }

                        label931:
                        while(var16 < var2) {
                           if (var1 != 1) {
                              return;
                           }

                           for(var19 = var17; var19 <= var18; ++var19) {
                              if (var1 != 1) {
                                 throw new IllegalStateException();
                              }

                              if (0 == (ua.ao[var57][1 + var16][var19] & var10)) {
                                 if (var1 != 1) {
                                    return;
                                 }
                                 break label931;
                              }
                           }

                           ++var16;
                        }

                        if ((1 + (var16 - var15)) * (1 + (var18 - var17)) >= 4) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           var19 = var4[var57][var15][var17];
                           var6.aj(var11, 4, var15 * 128, 128 + 128 * var16, 128 * var17, 128 + 128 * var18, var19, var19);

                           for(var20 = var15; var20 <= var16; ++var20) {
                              if (var1 != 1) {
                                 return;
                              }

                              for(var21 = var17; var21 <= var18; ++var21) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = ua.ao[var57][var20];
                                 var10000[var21] &= ~var10;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var53) {
         throw aw(var53, "tm.an(" + ')');
      }
   }

   tm() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw aw(var1, "tm.<init>(" + ')');
      }
   }
}
