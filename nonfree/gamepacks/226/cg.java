public class cg extends ke {
   static final int an = 11;
   static final int cu = 20;

   static final void lj(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (!qk.ek.ak(var0, -1613246732)) {
            if (var8 == 151752464) {
               throw new IllegalStateException();
            } else {
               if (-1 != var7) {
                  if (var8 == 151752464) {
                     throw new IllegalStateException();
                  }

                  client.ra[var7] = true;
               } else {
                  for(int var9 = 0; var9 < 100; ++var9) {
                     if (var8 == 151752464) {
                        throw new IllegalStateException();
                     }

                     client.ra[var9] = true;
                  }
               }

            }
         } else {
            au.pz = null;
            gj.lz(qk.ek.ay[var0], -1, var1, var2, var3, var4, var5, var6, var7, 971313647);
            if (au.pz != null) {
               if (var8 == 151752464) {
                  throw new IllegalStateException();
               }

               gj.lz(au.pz, -1412584499, var1, var2, var3, var4, -1974293395 * su.ps, ij.py * 1194114743, var7, -1655159650);
               au.pz = null;
            }

         }
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "cg.lj(" + ')');
      }
   }

   protected boolean ap(int var1, int var2, int var3, ko var4, int var5) {
      try {
         boolean var10000;
         if (var2 == -362162455 * this.ap && this.aw * -1731708745 == var3) {
            if (var5 != 1947951630) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "cg.ap(" + ')');
      }
   }

   protected boolean aw(int var1, int var2, int var3, ko var4) {
      return var2 == -362162455 * this.ap && this.aw * -1731708745 == var3;
   }

   static final void lm(cr var0, int var1, int var2, int var3) {
      try {
         if (var0 != null) {
            if (var3 >= -2003619700) {
               throw new IllegalStateException();
            }

            kq.lh(var0.ap * -1934004387, var0.aw * -252591159, -219372949 * var0.ak, var0.aj * 788373853, var0.ai * -1324440213, -750470663 * var0.ay, var0.as, var0.ae, var1, var2, -1323930124);
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "cg.lm(" + ')');
      }
   }

   static void aj(int var0, int var1, int var2, int var3, int var4) {
      try {
         dk var5 = (dk)dk.ap.ap((long)var0);
         if (var5 == null) {
            if (var4 != 290577893) {
               return;
            }

            var5 = new dk();
            dk.ap.ak(var5, (long)var0);
         }

         if (var5.aw.length <= var1) {
            if (var4 != 290577893) {
               throw new IllegalStateException();
            }

            int[] var6 = new int[1 + var1];
            int[] var7 = new int[var1 + 1];

            int var8;
            for(var8 = 0; var8 < var5.aw.length; ++var8) {
               if (var4 != 290577893) {
                  return;
               }

               var6[var8] = var5.aw[var8];
               var7[var8] = var5.ak[var8];
            }

            for(var8 = var5.aw.length; var8 < var1; ++var8) {
               if (var4 != 290577893) {
                  return;
               }

               var6[var8] = -1;
               var7[var8] = 0;
            }

            var5.aw = var6;
            var5.ak = var7;
         }

         var5.aw[var1] = var2;
         var5.ak[var1] = var3;
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "cg.aj(" + ')');
      }
   }

   static final void nu(short var0) {
      try {
         me var1 = ef.ap(mm.cy, client.in.ai, (byte)36);
         var1.ak.bo(0, 976503056);
         client.in.ak(var1, (short)486);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "cg.nu(" + ')');
      }
   }

   public static int as(int var0, int var1) {
      try {
         int var2;
         label59: {
            var2 = 0;
            if (var0 >= 0) {
               if (var1 == -1211441845) {
                  throw new IllegalStateException();
               }

               if (var0 < 65536) {
                  break label59;
               }

               if (var1 == -1211441845) {
                  throw new IllegalStateException();
               }
            }

            var0 >>>= 16;
            var2 += 16;
         }

         if (var0 >= 256) {
            if (var1 == -1211441845) {
               throw new IllegalStateException();
            }

            var0 >>>= 8;
            var2 += 8;
         }

         if (var0 >= 16) {
            if (var1 == -1211441845) {
               throw new IllegalStateException();
            }

            var0 >>>= 4;
            var2 += 4;
         }

         if (var0 >= 4) {
            if (var1 == -1211441845) {
               throw new IllegalStateException();
            }

            var0 >>>= 2;
            var2 += 2;
         }

         if (var0 >= 1) {
            if (var1 == -1211441845) {
               throw new IllegalStateException();
            }

            var0 >>>= 1;
            ++var2;
         }

         return var2 + var0;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "cg.as(" + ')');
      }
   }

   public static void ap(pe var0, int var1) {
      try {
         hv.ap = var0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "cg.ap(" + ')');
      }
   }

   protected boolean ak(int var1, int var2, int var3, ko var4) {
      return var2 == -362162455 * this.ap && this.aw * -1731708745 == var3;
   }

   cg() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "cg.<init>(" + ')');
      }
   }

   public static qi as(pe var0, pe var1, String var2, String var3, int var4) {
      try {
         if (!var0.cp(var2, var3, -637561867)) {
            if (var4 >= 509853095) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var5 = var0.cf(var2, (byte)49);
            int var6 = var0.cl(var5, var3, (short)-3338);
            return dc.ak(var0, var1, var5, var6, 194974548);
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "cg.as(" + ')');
      }
   }
}
