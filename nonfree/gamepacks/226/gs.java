public class gs extends tp {
   static final int ih = 2048;
   static final int ac = 1;
   static cr on;
   static mi ap = new mi(64);
   public static final int ak = 13;

   static final void jk(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         ji var6 = hx.jf.aw;
         long var7 = var6.bx(var0, var1, var2);
         int var9;
         int var10;
         int var11;
         int var12;
         int var14;
         int var15;
         if (var7 != 0L) {
            if (var5 <= -1308770465) {
               throw new IllegalStateException();
            }

            var9 = var6.bp(var0, var1, var2, var7);
            var10 = var9 >> 6 & 3;
            var11 = var9 & 31;
            var12 = var3;
            if (pl.aw(var7)) {
               if (var5 <= -1308770465) {
                  return;
               }

               var12 = var4;
            }

            int[] var13 = co.tj.ap;
            var14 = 4 * var1 + 24624 + (103 - var2) * 2048;
            var15 = la.ae(var7);
            ir var16 = ei.aw(var15, 888461382);
            if (-1 != var16.bk * -1116022887) {
               if (var5 <= -1308770465) {
                  return;
               }

               vc var17 = qq.kg[var16.bk * -1116022887];
               if (var17 != null) {
                  if (var5 <= -1308770465) {
                     throw new IllegalStateException();
                  }

                  int var18 = (var16.az * -1388440324 - var17.ak) / 2;
                  int var19 = (var16.ag * -439203964 - var17.aj) / 2;
                  var17.ak(var18 + 4 * var1 + 48, (104 - var2 - -109800991 * var16.ag) * 4 + 48 + var19);
               }
            } else {
               label240: {
                  if (var11 != 0) {
                     if (var5 <= -1308770465) {
                        throw new IllegalStateException();
                     }

                     if (2 != var11) {
                        break label240;
                     }
                  }

                  if (var10 == 0) {
                     if (var5 <= -1308770465) {
                        throw new IllegalStateException();
                     }

                     var13[var14] = var12;
                     var13[var14 + 512] = var12;
                     var13[1024 + var14] = var12;
                     var13[var14 + 1536] = var12;
                  } else if (var10 == 1) {
                     if (var5 <= -1308770465) {
                        throw new IllegalStateException();
                     }

                     var13[var14] = var12;
                     var13[var14 + 1] = var12;
                     var13[var14 + 2] = var12;
                     var13[3 + var14] = var12;
                  } else if (2 == var10) {
                     if (var5 <= -1308770465) {
                        throw new IllegalStateException();
                     }

                     var13[3 + var14] = var12;
                     var13[var14 + 3 + 512] = var12;
                     var13[1024 + var14 + 3] = var12;
                     var13[3 + var14 + 1536] = var12;
                  } else if (var10 == 3) {
                     if (var5 <= -1308770465) {
                        return;
                     }

                     var13[1536 + var14] = var12;
                     var13[1 + var14 + 1536] = var12;
                     var13[var14 + 1536 + 2] = var12;
                     var13[var14 + 1536 + 3] = var12;
                  }
               }

               if (var11 == 3) {
                  if (var5 <= -1308770465) {
                     return;
                  }

                  if (var10 == 0) {
                     if (var5 <= -1308770465) {
                        return;
                     }

                     var13[var14] = var12;
                  } else if (var10 == 1) {
                     if (var5 <= -1308770465) {
                        throw new IllegalStateException();
                     }

                     var13[var14 + 3] = var12;
                  } else if (var10 == 2) {
                     if (var5 <= -1308770465) {
                        return;
                     }

                     var13[3 + var14 + 1536] = var12;
                  } else if (var10 == 3) {
                     if (var5 <= -1308770465) {
                        throw new IllegalStateException();
                     }

                     var13[1536 + var14] = var12;
                  }
               }

               if (var11 == 2) {
                  if (var5 <= -1308770465) {
                     return;
                  }

                  if (var10 == 3) {
                     var13[var14] = var12;
                     var13[var14 + 512] = var12;
                     var13[var14 + 1024] = var12;
                     var13[1536 + var14] = var12;
                  } else if (0 == var10) {
                     var13[var14] = var12;
                     var13[var14 + 1] = var12;
                     var13[var14 + 2] = var12;
                     var13[var14 + 3] = var12;
                  } else if (1 == var10) {
                     if (var5 <= -1308770465) {
                        throw new IllegalStateException();
                     }

                     var13[3 + var14] = var12;
                     var13[var14 + 3 + 512] = var12;
                     var13[1024 + var14 + 3] = var12;
                     var13[1536 + var14 + 3] = var12;
                  } else if (2 == var10) {
                     if (var5 <= -1308770465) {
                        return;
                     }

                     var13[1536 + var14] = var12;
                     var13[1 + 1536 + var14] = var12;
                     var13[1536 + var14 + 2] = var12;
                     var13[1536 + var14 + 3] = var12;
                  }
               }
            }
         }

         var7 = var6.bb(var0, var1, var2);
         if (var7 != 0L) {
            if (var5 <= -1308770465) {
               return;
            }

            var9 = var6.bp(var0, var1, var2, var7);
            var10 = var9 >> 6 & 3;
            var11 = var9 & 31;
            var12 = la.ae(var7);
            ir var23 = ei.aw(var12, 888461382);
            int var27;
            if (var23.bk * -1116022887 != -1) {
               vc var25 = qq.kg[-1116022887 * var23.bk];
               if (var25 != null) {
                  var15 = (var23.az * -1388440324 - var25.ak) / 2;
                  var27 = (var23.ag * -439203964 - var25.aj) / 2;
                  var25.ak(var15 + 4 * var1 + 48, var27 + 48 + (104 - var2 - -109800991 * var23.ag) * 4);
               }
            } else if (var11 == 9) {
               label252: {
                  if (var5 <= -1308770465) {
                     return;
                  }

                  var14 = 15658734;
                  if (pl.aw(var7)) {
                     if (var5 <= -1308770465) {
                        throw new IllegalStateException();
                     }

                     var14 = 15597568;
                  }

                  int[] var26 = co.tj.ap;
                  var27 = var1 * 4 + 24624 + 2048 * (103 - var2);
                  if (0 != var10) {
                     if (var5 <= -1308770465) {
                        throw new IllegalStateException();
                     }

                     if (2 != var10) {
                        var26[var27] = var14;
                        var26[1 + 512 + var27] = var14;
                        var26[1024 + var27 + 2] = var14;
                        var26[var27 + 1536 + 3] = var14;
                        break label252;
                     }

                     if (var5 <= -1308770465) {
                        return;
                     }
                  }

                  var26[1536 + var27] = var14;
                  var26[1 + 1024 + var27] = var14;
                  var26[var27 + 512 + 2] = var14;
                  var26[var27 + 3] = var14;
               }
            }
         }

         var7 = var6.bq(var0, var1, var2);
         if (0L != var7) {
            if (var5 <= -1308770465) {
               throw new IllegalStateException();
            }

            var9 = la.ae(var7);
            ir var21 = ei.aw(var9, 888461382);
            if (-1 != var21.bk * -1116022887) {
               if (var5 <= -1308770465) {
                  throw new IllegalStateException();
               }

               vc var22 = qq.kg[var21.bk * -1116022887];
               if (var22 != null) {
                  var12 = (var21.az * -1388440324 - var22.ak) / 2;
                  int var24 = (var21.ag * -439203964 - var22.aj) / 2;
                  var22.ak(48 + var1 * 4 + var12, var24 + 48 + 4 * (104 - var2 - -109800991 * var21.ag));
               }
            }
         }

      } catch (RuntimeException var20) {
         throw tm.aw(var20, "gs.jk(" + ')');
      }
   }

   gs() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "gs.<init>(" + ')');
      }
   }

   public static void aw() {
      ap.aj();
   }

   public static final qt az(int var0, int var1, int var2, int var3, byte var4) {
      try {
         float var5 = 1.0E-5F;
         qt var6 = ch.aw((float)var1, (float)var2, (float)var3, 264645786);
         qt var7 = ch.aw(0.0F, (float)var0, 0.0F, -712169358);
         qt var8 = ch.aw(0.0F, 1.0F, 0.0F, -794793395);
         qt var10 = jr.af;
         float var9 = var8.an(var10, -1596443671);
         if (Math.abs(var9) < 1.0E-5F) {
            if (var4 == 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            qt var13;
            synchronized(qt.ak) {
               if (qt.ai * 937612641 == 0) {
                  if (var4 == 1) {
                     throw new IllegalStateException();
                  }

                  var13 = new qt(var6);
               } else {
                  qt.ak[(qt.ai -= -847475039) * 937612641].ai(var6, 1942097543);
                  var13 = qt.ak[qt.ai * 937612641];
               }
            }

            var13.au(var7, (byte)1);
            float var14 = -io.ao(var8, var13, -163434166) / var9;
            if (var14 < 0.0F) {
               if (var4 == 1) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var6.ak(16711680);
               var7.ak(16711680);
               var8.ak(16711680);
               var13.ak(16711680);
               return jf.at(var6, oz.az(jr.af, var14, -1770542040), 608532264);
            }
         }
      } catch (RuntimeException var17) {
         throw tm.aw(var17, "gs.az(" + ')');
      }
   }
}
