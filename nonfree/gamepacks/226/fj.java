public class fj {
   static int ig;
   public static final float aj = Math.ulp(1.0F);
   static final float ak = 1.3333334F;
   static final float ap = 0.33333334F;
   static final float aw = 0.6666667F;
   static final int bs = 33;
   public static final float ai;
   public static final int as = 0;
   static final int tq = 24624;
   static final int bh = 1;
   static int[][] jg;

   static void ac(fv var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         var0.as = var1;
         float var9 = var4 - var1;
         float var10 = var8 - var5;
         float var11 = var2 - var1;
         float var12 = 0.0F;
         float var13 = 0.0F;
         if (var11 != 0.0F) {
            var12 = (var6 - var5) / var11;
         }

         var11 = var4 - var3;
         if (var11 != 0.0F) {
            var13 = (var8 - var7) / var11;
         }

         float var14 = 1.0F / (var9 * var9);
         float var15 = var9 * var12;
         float var16 = var13 * var9;
         var0.am = (var16 + var15 - var10 - var10) * var14 / var9;
         var0.at = (var10 + var10 + var10 - var15 - var15 - var16) * var14;
         var0.au = var12;
         var0.an = var5;
      }
   }

   static {
      ai = aj * 2.0F;
   }

   static float am(fv var0, float var1) {
      if (null != var0 && var0.am(-1437201509) != 0) {
         if (var1 < (float)(var0.ai[0].ap * 1247746503)) {
            return var0.ak == fp.ap ? var0.ai[0].aw : kw.ak(var0, var1, true, 447962869);
         } else if (var1 > (float)(var0.ai[var0.am(-1852040832) - 1].ap * 1247746503)) {
            return fp.ap == var0.aj ? var0.ai[var0.am(870011426) - 1].aw : kw.ak(var0, var1, false, 1604405268);
         } else if (var0.aw) {
            return var0.ai[0].aw;
         } else {
            fa var2 = var0.ae(var1, 1588318810);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
               return 0.0F;
            } else {
               float var5;
               float var6;
               if (var2.ai == 0.0F && 0.0F == var2.ay) {
                  var3 = true;
               } else if (var2.ai == Float.MAX_VALUE && var2.ay == Float.MAX_VALUE) {
                  var4 = true;
               } else if (null != var2.as) {
                  if (var0.az) {
                     var5 = (float)(var2.ap * 1247746503);
                     float var9 = var2.aw;
                     var6 = var5 + 0.33333334F * var2.ai;
                     float var10 = var9 + 0.33333334F * var2.ay;
                     float var8 = (float)(var2.as.ap * 1247746503);
                     float var12 = var2.as.aw;
                     float var7 = var8 - var2.as.ak * 0.33333334F;
                     float var11 = var12 - 0.33333334F * var2.as.aj;
                     if (var0.ap) {
                        km.aj(var0, var5, var6, var7, var8, var9, var10, var11, var12, (byte)57);
                     } else {
                        ec.ai(var0, var5, var6, var7, var8, var9, var10, var11, var12, -1731705795);
                     }

                     var0.az = false;
                  }
               } else {
                  var3 = true;
               }

               if (var3) {
                  return var2.aw;
               } else if (var4) {
                  return (float)(var2.ap * 1247746503) != var1 && null != var2.as ? var2.as.aw : var2.aw;
               } else if (var0.ap) {
                  return al.aw(var0, var1, (byte)29);
               } else {
                  if (var0 == null) {
                     var5 = 0.0F;
                  } else {
                     var6 = var1 - var0.as;
                     var5 = (var6 * (var0.at + var6 * var0.am) + var0.au) * var6 + var0.an;
                  }

                  return var5;
               }
            }
         }
      } else {
         return 0.0F;
      }
   }

   static float at(fv var0, float var1) {
      if (null != var0 && var0.am(626575129) != 0) {
         if (var1 < (float)(var0.ai[0].ap * 1247746503)) {
            return var0.ak == fp.ap ? var0.ai[0].aw : kw.ak(var0, var1, true, 422695389);
         } else if (var1 > (float)(var0.ai[var0.am(174012782) - 1].ap * 1247746503)) {
            return fp.ap == var0.aj ? var0.ai[var0.am(-1700333976) - 1].aw : kw.ak(var0, var1, false, 1193369691);
         } else if (var0.aw) {
            return var0.ai[0].aw;
         } else {
            fa var2 = var0.ae(var1, 1678791334);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
               return 0.0F;
            } else {
               float var5;
               float var6;
               if (var2.ai == 0.0F && 0.0F == var2.ay) {
                  var3 = true;
               } else if (var2.ai == Float.MAX_VALUE && var2.ay == Float.MAX_VALUE) {
                  var4 = true;
               } else if (null != var2.as) {
                  if (var0.az) {
                     var5 = (float)(var2.ap * -1708996060);
                     float var9 = var2.aw;
                     var6 = var5 + 0.33333334F * var2.ai;
                     float var10 = var9 + 0.33333334F * var2.ay;
                     float var8 = (float)(var2.as.ap * -985376607);
                     float var12 = var2.as.aw;
                     float var7 = var8 - var2.as.ak * 0.33333334F;
                     float var11 = var12 - 0.33333334F * var2.as.aj;
                     if (var0.ap) {
                        km.aj(var0, var5, var6, var7, var8, var9, var10, var11, var12, (byte)118);
                     } else {
                        ec.ai(var0, var5, var6, var7, var8, var9, var10, var11, var12, 1221938774);
                     }

                     var0.az = false;
                  }
               } else {
                  var3 = true;
               }

               if (var3) {
                  return var2.aw;
               } else if (var4) {
                  return (float)(var2.ap * 1247746503) != var1 && null != var2.as ? var2.as.aw : var2.aw;
               } else if (var0.ap) {
                  return al.aw(var0, var1, (byte)73);
               } else {
                  if (var0 == null) {
                     var5 = 0.0F;
                  } else {
                     var6 = var1 - var0.as;
                     var5 = (var6 * (var0.at + var6 * var0.am) + var0.au) * var6 + var0.an;
                  }

                  return var5;
               }
            }
         }
      } else {
         return 0.0F;
      }
   }

   static float au(fv var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var2;
         if (var0.as == var1) {
            var2 = 0.0F;
         } else if (var0.ae == var1) {
            var2 = 1.0F;
         } else {
            var2 = (var1 - var0.as) / (var0.ae - var0.as);
         }

         float var3;
         if (var0.ay) {
            var3 = var2;
         } else {
            float[] var4 = new float[]{var0.am - var2, var0.at, var0.au, var0.an};
            float[] var5 = new float[5];
            int var6 = jq.ap(var4, 3, 0.0F, true, 1.0F, true, var5, 1350563286);
            if (var6 == 1) {
               var3 = var5[0];
            } else {
               var3 = 0.0F;
            }
         }

         return (var3 * (var0.ar + var0.ab * var3) + var0.af) * var3 + var0.ao;
      }
   }

   static float an(fv var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var2;
         if (var0.as == var1) {
            var2 = 0.0F;
         } else if (var0.ae == var1) {
            var2 = 1.0F;
         } else {
            var2 = (var1 - var0.as) / (var0.ae - var0.as);
         }

         float var3;
         if (var0.ay) {
            var3 = var2;
         } else {
            float[] var4 = new float[]{var0.am - var2, var0.at, var0.au, var0.an};
            float[] var5 = new float[5];
            int var6 = jq.ap(var4, 3, 0.0F, true, 1.0F, true, var5, 1350563286);
            if (var6 == 1) {
               var3 = var5[0];
            } else {
               var3 = 0.0F;
            }
         }

         return (var3 * (var0.ar + var0.ab * var3) + var0.af) * var3 + var0.ao;
      }
   }

   static float ao(fv var0, float var1, boolean var2) {
      float var3 = 0.0F;
      if (var0 != null && var0.am(-625001784) != 0) {
         float var4 = (float)(var0.ai[0].ap * 779446939);
         float var5 = (float)(var0.ai[var0.am(-2032647269) - 1].ap * 1247746503);
         float var6 = var5 - var4;
         if (var6 == 0.0F) {
            return var0.ai[0].aw;
         } else {
            float var7 = 0.0F;
            if (var1 > var5) {
               var7 = (var1 - var5) / var6;
            } else {
               var7 = (var1 - var4) / var6;
            }

            float var8 = (float)((int)var7);
            float var9 = Math.abs(var7 - var8);
            float var10 = var6 * var9;
            var8 = Math.abs(1.0F + var8);
            float var11 = var8 / 2.0F;
            float var12 = (float)((int)var11);
            var9 = var11 - var12;
            float var13;
            float var14;
            if (var2) {
               if (var0.ak == fp.ai) {
                  if (0.0F != var9) {
                     var10 += var4;
                  } else {
                     var10 = var5 - var10;
                  }
               } else if (var0.ak != fp.ak && var0.ak != fp.aj) {
                  if (var0.ak == fp.aw) {
                     var10 = var4 - var1;
                     var13 = var0.ai[0].ak;
                     var14 = var0.ai[0].aj;
                     var3 = var0.ai[0].aw;
                     if (0.0F != var13) {
                        var3 -= var14 * var10 / var13;
                     }

                     return var3;
                  }
               } else {
                  var10 = var5 - var10;
               }
            } else if (fp.ai == var0.aj) {
               if (0.0F != var9) {
                  var10 = var5 - var10;
               } else {
                  var10 += var4;
               }
            } else if (fp.ak != var0.aj && fp.aj != var0.aj) {
               if (fp.aw == var0.aj) {
                  var10 = var1 - var5;
                  var13 = var0.ai[var0.am(-1401136962) - 1].ai;
                  var14 = var0.ai[var0.am(227428916) - 1].ay;
                  var3 = var0.ai[var0.am(-423604620) - 1].aw;
                  if (0.0F != var13) {
                     var3 += var10 * var14 / var13;
                  }

                  return var3;
               }
            } else {
               var10 += var4;
            }

            var3 = jo.ap(var0, var10, -23656317);
            float var15;
            if (var2 && fp.aj == var0.ak) {
               var15 = var0.ai[var0.am(565456077) - 1].aw - var0.ai[0].aw;
               var3 -= var8 * var15;
            } else if (!var2 && var0.aj == fp.aj) {
               var15 = var0.ai[var0.am(-469474318) - 1].aw - var0.ai[0].aw;
               var3 += var8 * var15;
            }

            return var3;
         }
      } else {
         return var3;
      }
   }

   static void af(fv var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         float var9 = var4 - var1;
         if (0.0F != var9) {
            float var10 = var2 - var1;
            float var11 = var3 - var1;
            float[] var12 = new float[]{var10 / var9, var11 / var9};
            var0.ay = var12[0] == 0.33333334F && 0.6666667F == var12[1];
            float var13 = var12[0];
            float var14 = var12[1];
            if (var12[0] < 0.0F) {
               var12[0] = 0.0F;
            }

            if (var12[1] > 1.0F) {
               var12[1] = 1.0F;
            }

            if (var12[0] > 1.0F || var12[1] < -1.0F) {
               jq.as(var12, -245371137);
            }

            if (var12[0] != var13) {
               var2 = var9 * var12[0] + var1;
               if (0.0F != var13) {
                  var6 = var5 + var12[0] * (var6 - var5) / var13;
               }
            }

            if (var14 != var12[1]) {
               float var10000 = var1 + var12[1] * var9;
               if (1.0F != var14) {
                  var7 = var8 - (1.0F - var12[1]) * (var8 - var7) / (1.0F - var14);
               }
            }

            var0.as = var1;
            var0.ae = var4;
            float var15 = var12[0];
            float var16 = var12[1];
            float var17 = var15 - 0.0F;
            float var18 = var16 - var15;
            float var19 = 1.0F - var16;
            float var20 = var18 - var17;
            var0.an = var19 - var18 - var20;
            var0.au = var20 + var20 + var20;
            var0.at = var17 + var17 + var17;
            var0.am = 0.0F;
            ee.ae(var5, var6, var7, var8, var0, 2015908957);
         }
      }
   }

   static void al(float[] var0) {
      var0[1] = 1.0F - var0[1];
      if (var0[0] < 0.0F) {
         var0[0] = 0.0F;
      }

      if (var0[1] < 0.0F) {
         var0[1] = 0.0F;
      }

      if (var0[0] > 1.0F || var0[1] > 1.0F) {
         float var1 = var0[0] * (var0[1] + (var0[0] - 2.0F)) + var0[1] * (var0[1] - 2.0F) + 1.0F;
         if (var1 + aj > 0.0F) {
            ac.ay(var0, 586346027);
         }
      }

      var0[1] = 1.0F - var0[1];
   }

   static void ab(fv var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         float var9 = var4 - var1;
         if (0.0F != var9) {
            float var10 = var2 - var1;
            float var11 = var3 - var1;
            float[] var12 = new float[]{var10 / var9, var11 / var9};
            var0.ay = var12[0] == 0.33333334F && 0.6666667F == var12[1];
            float var13 = var12[0];
            float var14 = var12[1];
            if (var12[0] < 0.0F) {
               var12[0] = 0.0F;
            }

            if (var12[1] > 1.0F) {
               var12[1] = 1.0F;
            }

            if (var12[0] > 1.0F || var12[1] < -1.0F) {
               jq.as(var12, -1029474514);
            }

            if (var12[0] != var13) {
               var2 = var9 * var12[0] + var1;
               if (0.0F != var13) {
                  var6 = var5 + var12[0] * (var6 - var5) / var13;
               }
            }

            if (var14 != var12[1]) {
               float var10000 = var1 + var12[1] * var9;
               if (1.0F != var14) {
                  var7 = var8 - (1.0F - var12[1]) * (var8 - var7) / (1.0F - var14);
               }
            }

            var0.as = var1;
            var0.ae = var4;
            float var15 = var12[0];
            float var16 = var12[1];
            float var17 = var15 - 0.0F;
            float var18 = var16 - var15;
            float var19 = 1.0F - var16;
            float var20 = var18 - var17;
            var0.an = var19 - var18 - var20;
            var0.au = var20 + var20 + var20;
            var0.at = var17 + var17 + var17;
            var0.am = 0.0F;
            ee.ae(var5, var6, var7, var8, var0, 717090872);
         }
      }
   }

   fj() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "fj.<init>(" + ')');
      }
   }

   static void ag(fv var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         var0.as = var1;
         float var9 = var4 - var1;
         float var10 = var8 - var5;
         float var11 = var2 - var1;
         float var12 = 0.0F;
         float var13 = 0.0F;
         if (var11 != 0.0F) {
            var12 = (var6 - var5) / var11;
         }

         var11 = var4 - var3;
         if (var11 != 0.0F) {
            var13 = (var8 - var7) / var11;
         }

         float var14 = 1.0F / (var9 * var9);
         float var15 = var9 * var12;
         float var16 = var13 * var9;
         var0.am = (var16 + var15 - var10 - var10) * var14 / var9;
         var0.at = (var10 + var10 + var10 - var15 - var15 - var16) * var14;
         var0.au = var12;
         var0.an = var5;
      }
   }

   static void bv(float var0, float var1, float var2, float var3, fv var4) {
      float var5 = var1 - var0;
      float var6 = var2 - var1;
      float var7 = var3 - var2;
      float var8 = var6 - var5;
      var4.ab = var7 - var6 - var8;
      var4.ar = var8 + var8 + var8;
      var4.af = var5 + var5 + var5;
      var4.ao = var0;
   }

   static void az(fv var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         float var9 = var4 - var1;
         if (0.0F != var9) {
            float var10 = var2 - var1;
            float var11 = var3 - var1;
            float[] var12 = new float[]{var10 / var9, var11 / var9};
            var0.ay = var12[0] == 0.33333334F && 0.6666667F == var12[1];
            float var13 = var12[0];
            float var14 = var12[1];
            if (var12[0] < 0.0F) {
               var12[0] = 0.0F;
            }

            if (var12[1] > 1.0F) {
               var12[1] = 1.0F;
            }

            if (var12[0] > 1.0F || var12[1] < -1.0F) {
               jq.as(var12, -1728427934);
            }

            if (var12[0] != var13) {
               var2 = var9 * var12[0] + var1;
               if (0.0F != var13) {
                  var6 = var5 + var12[0] * (var6 - var5) / var13;
               }
            }

            if (var14 != var12[1]) {
               float var10000 = var1 + var12[1] * var9;
               if (1.0F != var14) {
                  var7 = var8 - (1.0F - var12[1]) * (var8 - var7) / (1.0F - var14);
               }
            }

            var0.as = var1;
            var0.ae = var4;
            float var15 = var12[0];
            float var16 = var12[1];
            float var17 = var15 - 0.0F;
            float var18 = var16 - var15;
            float var19 = 1.0F - var16;
            float var20 = var18 - var17;
            var0.an = var19 - var18 - var20;
            var0.au = var20 + var20 + var20;
            var0.at = var17 + var17 + var17;
            var0.am = 0.0F;
            ee.ae(var5, var6, var7, var8, var0, 1894481470);
         }
      }
   }

   static void av(fv var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         var0.as = var1;
         float var9 = var4 - var1;
         float var10 = var8 - var5;
         float var11 = var2 - var1;
         float var12 = 0.0F;
         float var13 = 0.0F;
         if (var11 != 0.0F) {
            var12 = (var6 - var5) / var11;
         }

         var11 = var4 - var3;
         if (var11 != 0.0F) {
            var13 = (var8 - var7) / var11;
         }

         float var14 = 1.0F / (var9 * var9);
         float var15 = var9 * var12;
         float var16 = var13 * var9;
         var0.am = (var16 + var15 - var10 - var10) * var14 / var9;
         var0.at = (var10 + var10 + var10 - var15 - var15 - var16) * var14;
         var0.au = var12;
         var0.an = var5;
      }
   }

   static void aq(float[] var0) {
      if (aj + var0[0] < 1.3333334F) {
         float var1 = var0[0] - 2.0F;
         float var2 = var0[0] - 1.0F;
         float var3 = (float)Math.sqrt((double)(var1 * var1 - 4.0F * var2 * var2));
         float var4 = (var3 + -var1) * 0.5F;
         if (var0[1] + aj > var4) {
            var0[1] = var4 - aj;
         } else {
            var4 = (-var1 - var3) * 0.5F;
            if (var0[1] < var4 + aj) {
               var0[1] = var4 + aj;
            }
         }
      } else {
         var0[0] = 1.3333334F - aj;
         var0[1] = 0.33333334F - aj;
      }

   }

   static void bj(float var0, float var1, float var2, float var3, fv var4) {
      float var5 = var1 - var0;
      float var6 = var2 - var1;
      float var7 = var3 - var2;
      float var8 = var6 - var5;
      var4.ab = var7 - var6 - var8;
      var4.ar = var8 + var8 + var8;
      var4.af = var5 + var5 + var5;
      var4.ao = var0;
   }

   static void ad(fv var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         var0.as = var1;
         float var9 = var4 - var1;
         float var10 = var8 - var5;
         float var11 = var2 - var1;
         float var12 = 0.0F;
         float var13 = 0.0F;
         if (var11 != 0.0F) {
            var12 = (var6 - var5) / var11;
         }

         var11 = var4 - var3;
         if (var11 != 0.0F) {
            var13 = (var8 - var7) / var11;
         }

         float var14 = 1.0F / (var9 * var9);
         float var15 = var9 * var12;
         float var16 = var13 * var9;
         var0.am = (var16 + var15 - var10 - var10) * var14 / var9;
         var0.at = (var10 + var10 + var10 - var15 - var15 - var16) * var14;
         var0.au = var12;
         var0.an = var5;
      }
   }

   static void aa(float[] var0) {
      var0[1] = 1.0F - var0[1];
      if (var0[0] < 0.0F) {
         var0[0] = 0.0F;
      }

      if (var0[1] < 0.0F) {
         var0[1] = 0.0F;
      }

      if (var0[0] > 1.0F || var0[1] > 1.0F) {
         float var1 = var0[0] * (var0[1] + (var0[0] - 2.0F)) + var0[1] * (var0[1] - 2.0F) + 1.0F;
         if (var1 + aj > 0.0F) {
            ac.ay(var0, 116886287);
         }
      }

      var0[1] = 1.0F - var0[1];
   }

   static void ah(float var0, float var1, float var2, float var3, fv var4) {
      float var5 = var1 - var0;
      float var6 = var2 - var1;
      float var7 = var3 - var2;
      float var8 = var6 - var5;
      var4.ab = var7 - var6 - var8;
      var4.ar = var8 + var8 + var8;
      var4.af = var5 + var5 + var5;
      var4.ao = var0;
   }

   static void bh(float var0, float var1, float var2, float var3, fv var4) {
      float var5 = var1 - var0;
      float var6 = var2 - var1;
      float var7 = var3 - var2;
      float var8 = var6 - var5;
      var4.ab = var7 - var6 - var8;
      var4.ar = var8 + var8 + var8;
      var4.af = var5 + var5 + var5;
      var4.ao = var0;
   }

   static void ar(fv var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         float var9 = var4 - var1;
         if (0.0F != var9) {
            float var10 = var2 - var1;
            float var11 = var3 - var1;
            float[] var12 = new float[]{var10 / var9, var11 / var9};
            var0.ay = var12[0] == 0.33333334F && 0.6666667F == var12[1];
            float var13 = var12[0];
            float var14 = var12[1];
            if (var12[0] < 0.0F) {
               var12[0] = 0.0F;
            }

            if (var12[1] > 1.0F) {
               var12[1] = 1.0F;
            }

            if (var12[0] > 1.0F || var12[1] < -1.0F) {
               jq.as(var12, -2100820861);
            }

            if (var12[0] != var13) {
               var2 = var9 * var12[0] + var1;
               if (0.0F != var13) {
                  var6 = var5 + var12[0] * (var6 - var5) / var13;
               }
            }

            if (var14 != var12[1]) {
               float var10000 = var1 + var12[1] * var9;
               if (1.0F != var14) {
                  var7 = var8 - (1.0F - var12[1]) * (var8 - var7) / (1.0F - var14);
               }
            }

            var0.as = var1;
            var0.ae = var4;
            float var15 = var12[0];
            float var16 = var12[1];
            float var17 = var15 - 0.0F;
            float var18 = var16 - var15;
            float var19 = 1.0F - var16;
            float var20 = var18 - var17;
            var0.an = var19 - var18 - var20;
            var0.au = var20 + var20 + var20;
            var0.at = var17 + var17 + var17;
            var0.am = 0.0F;
            ee.ae(var5, var6, var7, var8, var0, 2022105855);
         }
      }
   }

   static void ax(float[] var0) {
      if (aj + var0[0] < 1.3333334F) {
         float var1 = var0[0] - 2.0F;
         float var2 = var0[0] - 1.0F;
         float var3 = (float)Math.sqrt((double)(var1 * var1 - 4.0F * var2 * var2));
         float var4 = (var3 + -var1) * 0.5F;
         if (var0[1] + aj > var4) {
            var0[1] = var4 - aj;
         } else {
            var4 = (-var1 - var3) * 0.5F;
            if (var0[1] < var4 + aj) {
               var0[1] = var4 + aj;
            }
         }
      } else {
         var0[0] = 1.3333334F - aj;
         var0[1] = 0.33333334F - aj;
      }

   }
}
