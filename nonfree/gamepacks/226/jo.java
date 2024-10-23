public final class jo {
   int ag;
   int ap;
   int aw;
   int ak;
   int ai;
   int ay;
   int as;
   int ae;
   int am;
   int at;
   int au;
   int af;
   int ao;
   int az;
   int ar;
   int ab;
   int an;
   int aj;
   public static final String kn = "Please ensure all characters are populated.";

   static float ap(fv var0, float var1, int var2) {
      try {
         if (null != var0) {
            if (var2 <= -1936792027) {
               throw new IllegalStateException();
            }

            if (var0.am(2053438204) != 0) {
               if (var1 < (float)(var0.ai[0].ap * 1247746503)) {
                  if (var2 <= -1936792027) {
                     throw new IllegalStateException();
                  }

                  if (var0.ak == fp.ap) {
                     if (var2 <= -1936792027) {
                        throw new IllegalStateException();
                     }

                     return var0.ai[0].aw;
                  }

                  return kw.ak(var0, var1, true, -142044248);
               }

               if (var1 > (float)(var0.ai[var0.am(327726310) - 1].ap * 1247746503)) {
                  if (fp.ap == var0.aj) {
                     if (var2 <= -1936792027) {
                        throw new IllegalStateException();
                     }

                     return var0.ai[var0.am(-1415262617) - 1].aw;
                  }

                  return kw.ak(var0, var1, false, 1867352288);
               }

               if (var0.aw) {
                  return var0.ai[0].aw;
               }

               fa var3 = var0.ae(var1, 1136385562);
               boolean var4 = false;
               boolean var5 = false;
               if (var3 != null) {
                  if (var2 <= -1936792027) {
                     throw new IllegalStateException();
                  }

                  float var6;
                  float var7;
                  label165: {
                     if (var3.ai == 0.0F) {
                        if (var2 <= -1936792027) {
                           throw new IllegalStateException();
                        }

                        if (0.0F == var3.ay) {
                           var4 = true;
                           break label165;
                        }
                     }

                     if (var3.ai == Float.MAX_VALUE && var3.ay == Float.MAX_VALUE) {
                        if (var2 <= -1936792027) {
                           throw new IllegalStateException();
                        }

                        var5 = true;
                     } else if (null != var3.as) {
                        if (var2 <= -1936792027) {
                           throw new IllegalStateException();
                        }

                        if (var0.az) {
                           if (var2 <= -1936792027) {
                              throw new IllegalStateException();
                           }

                           var6 = (float)(var3.ap * 1247746503);
                           float var10 = var3.aw;
                           var7 = var6 + 0.33333334F * var3.ai;
                           float var11 = var10 + 0.33333334F * var3.ay;
                           float var9 = (float)(var3.as.ap * 1247746503);
                           float var13 = var3.as.aw;
                           float var8 = var9 - var3.as.ak * 0.33333334F;
                           float var12 = var13 - 0.33333334F * var3.as.aj;
                           if (var0.ap) {
                              if (var2 <= -1936792027) {
                                 throw new IllegalStateException();
                              }

                              km.aj(var0, var6, var7, var8, var9, var10, var11, var12, var13, (byte)54);
                           } else {
                              ec.ai(var0, var6, var7, var8, var9, var10, var11, var12, var13, -130623416);
                           }

                           var0.az = false;
                        }
                     } else {
                        var4 = true;
                     }
                  }

                  if (var4) {
                     if (var2 <= -1936792027) {
                        throw new IllegalStateException();
                     }

                     return var3.aw;
                  }

                  if (var5) {
                     if (var2 <= -1936792027) {
                        throw new IllegalStateException();
                     }

                     if ((float)(var3.ap * 1247746503) != var1) {
                        if (var2 <= -1936792027) {
                           throw new IllegalStateException();
                        }

                        if (null != var3.as) {
                           return var3.as.aw;
                        }

                        if (var2 <= -1936792027) {
                           throw new IllegalStateException();
                        }
                     }

                     return var3.aw;
                  }

                  if (var0.ap) {
                     return al.aw(var0, var1, (byte)105);
                  }

                  if (var0 == null) {
                     if (var2 <= -1936792027) {
                        throw new IllegalStateException();
                     }

                     var6 = 0.0F;
                  } else {
                     var7 = var1 - var0.as;
                     var6 = (var7 * (var0.at + var7 * var0.am) + var0.au) * var7 + var0.an;
                  }

                  return var6;
               }

               return 0.0F;
            }
         }

         return 0.0F;
      } catch (RuntimeException var14) {
         throw tm.aw(var14, "jo.ap(" + ')');
      }
   }

   jo() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "jo.<init>(" + ')');
      }
   }

   static void ob(int var0) {
      try {
         if (null != ck.wo) {
            client.wp = client.dt * 630705777;
            ck.wo.aj((byte)-116);

            for(int var1 = 0; var1 < hx.jf.an.length; ++var1) {
               if (var0 >= 1441499008) {
                  return;
               }

               if (hx.jf.an[var1] != null) {
                  if (var0 >= 1441499008) {
                     throw new IllegalStateException();
                  }

                  ck.wo.ak((-1517174943 * hx.jf.an[var1].bk >> 7) + -2014668603 * hx.jf.as, (hx.jf.an[var1].bb * 669935203 >> 7) + 1601580509 * hx.jf.ae, (byte)21);
               }
            }
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "jo.ob(" + ')');
      }
   }
}
