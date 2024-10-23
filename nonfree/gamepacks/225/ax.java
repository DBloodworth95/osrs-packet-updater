public final class ax {
   static long vy;

   ax() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ax.<init>(" + ')');
      }
   }

   public static void ag(int var0) {
      try {
         ld.ax.aq(5);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ax.ag(" + ')');
      }
   }

   public static final vv al(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         if (var1 == -1) {
            if (var6 <= -969500446) {
               throw new IllegalStateException();
            }

            var4 = 0;
         } else if (2 == var4 && 1 != var1) {
            if (var6 <= -969500446) {
               throw new IllegalStateException();
            }

            var4 = 1;
         }

         long var7 = ((long)var3 << 42) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40);
         vv var9;
         if (!var5) {
            if (var6 <= -969500446) {
               throw new IllegalStateException();
            }

            var9 = (vv)is.ah.ac(var7);
            if (null != var9) {
               return var9;
            }
         }

         is var10 = dh.ac(var0, 2132655121);
         if (var1 > 1) {
            if (var6 <= -969500446) {
               throw new IllegalStateException();
            }

            if (null != var10.ch) {
               if (var6 <= -969500446) {
                  throw new IllegalStateException();
               }

               int var11 = -1;

               for(int var12 = 0; var12 < 10; ++var12) {
                  if (var6 <= -969500446) {
                     throw new IllegalStateException();
                  }

                  if (var1 >= var10.cf[var12]) {
                     if (var6 <= -969500446) {
                        throw new IllegalStateException();
                     }

                     if (var10.cf[var12] != 0) {
                        var11 = var10.ch[var12];
                     }
                  }
               }

               if (var11 != -1) {
                  if (var6 <= -969500446) {
                     throw new IllegalStateException();
                  }

                  var10 = dh.ac(var11, 2123659116);
               }
            }
         }

         jm var24 = var10.au(1, -353658106);
         if (null == var24) {
            if (var6 <= -969500446) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            vv var25 = null;
            if (var10.cm * 1789641365 != -1) {
               if (var6 <= -969500446) {
                  throw new IllegalStateException();
               }

               var25 = al(var10.cu * 404832843, 10, 1, 0, 0, true, 1334262529);
               if (null == var25) {
                  return null;
               }
            } else if (-1 != var10.cz * 427861615) {
               var25 = al(var10.cc * 158178209, var1, var2, var3, 0, false, 688586517);
               if (null == var25) {
                  if (var6 <= -969500446) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            } else if (-250423299 * var10.cr != -1) {
               if (var6 <= -969500446) {
                  throw new IllegalStateException();
               }

               var25 = al(2096386953 * var10.cw, var1, 0, 0, 0, false, -89380705);
               if (var25 == null) {
                  if (var6 <= -969500446) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            }

            int[] var13 = vr.aw;
            int var14 = vr.an;
            int var15 = vr.ak;
            float[] var16 = vr.bn;
            int[] var17 = new int[4];
            vr.ff(var17);
            var9 = new vv(36, 32);
            jw.ab(var9.ac, 36, 32, (float[])null);
            vr.ft();
            jw.az();
            jw.ao(16, 16);
            jw.af.ae = false;
            if (-1 != var10.cr * -250423299) {
               if (var6 <= -969500446) {
                  throw new IllegalStateException();
               }

               var25.ah(0, 0);
            }

            int var18 = var10.av * -324495311;
            if (var5) {
               if (var6 <= -969500446) {
                  throw new IllegalStateException();
               }

               var18 = (int)(1.5D * (double)var18);
            } else if (2 == var2) {
               if (var6 <= -969500446) {
                  throw new IllegalStateException();
               }

               var18 = (int)((double)var18 * 1.04D);
            }

            int var19 = var18 * jw.am[var10.aw * 1361945459] >> 16;
            int var20 = jw.ax[1361945459 * var10.aw] * var18 >> 16;
            var24.au();
            var24.bf(0, 386446141 * var10.an, var10.ak * -2002872145, var10.aw * 1361945459, var10.bn * 146221969, var19 + -1141910865 * var24.ev / 2 + -777644377 * var10.bh, -777644377 * var10.bh + var20);
            if (var10.cz * 427861615 != -1) {
               if (var6 <= -969500446) {
                  throw new IllegalStateException();
               }

               var25.ah(0, 0);
            }

            if (var2 >= 1) {
               if (var6 <= -969500446) {
                  throw new IllegalStateException();
               }

               var9.au(1);
            }

            if (var2 >= 2) {
               if (var6 <= -969500446) {
                  throw new IllegalStateException();
               }

               var9.au(16777215);
            }

            if (0 != var3) {
               var9.ar(var3);
            }

            jw.ab(var9.ac, 36, 32, (float[])null);
            if (-1 != var10.cm * 1789641365) {
               var25.ah(0, 0);
            }

            label249: {
               if (var4 != 1) {
                  if (var6 <= -969500446) {
                     throw new IllegalStateException();
                  }

                  if (var4 != 2) {
                     break label249;
                  }

                  if (var6 <= -969500446) {
                     throw new IllegalStateException();
                  }

                  if (1 != var10.bf * -8414531) {
                     break label249;
                  }

                  if (var6 <= -969500446) {
                     throw new IllegalStateException();
                  }
               }

               qu var21 = nt.ap;
               String var22;
               if (var1 < 100000) {
                  if (var6 <= -969500446) {
                     throw new IllegalStateException();
                  }

                  var22 = "<col=ffff00>" + var1 + "</col>";
               } else if (var1 < 10000000) {
                  var22 = "<col=ffffff>" + var1 / 1000 + ok.hc + "</col>";
               } else {
                  var22 = "<col=00ff80>" + var1 / 1000000 + ok.gg + "</col>";
               }

               var21.ai(var22, 0, 9, 16776960, 1);
            }

            if (!var5) {
               if (var6 <= -969500446) {
                  throw new IllegalStateException();
               }

               is.ah.ag(var9, var7);
            }

            jw.ab(var13, var14, var15, var16);
            vr.fe(var17);
            jw.az();
            jw.af.ae = true;
            return var9;
         }
      } catch (RuntimeException var23) {
         throw vk.ae(var23, "ax.al(" + ')');
      }
   }
}
