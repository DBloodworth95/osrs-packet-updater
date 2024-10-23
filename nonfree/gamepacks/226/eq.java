public class eq extends si {
   final boolean ap;
   static final int ba = 1007;
   public static final int ad = 28;

   public int ae(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, -2080904015);
   }

   int ap(sv var1, sv var2, int var3) {
      try {
         if (0 != var1.ai * 1511931945) {
            if (var3 != -2080904015) {
               throw new IllegalStateException();
            }

            if (var2.ai * 1511931945 != 0) {
               if (var3 != -2080904015) {
                  throw new IllegalStateException();
               }

               int var10000;
               if (this.ap) {
                  if (var3 != -2080904015) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1071937363 * var1.ay - var2.ay * -1071937363;
               } else {
                  var10000 = -1071937363 * var2.ay - -1071937363 * var1.ay;
               }

               return var10000;
            }
         }

         return this.an(var1, var2, 1255277363);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "eq.ap(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((sv)var1, (sv)var2, -2080904015);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "eq.compare(" + ')');
      }
   }

   public int ay(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, -2080904015);
   }

   public eq(boolean var1) {
      try {
         super();
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "eq.<init>(" + ')');
      }
   }

   static final void if(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      try {
         if (var2 < 1) {
            if (var5 != 65280) {
               throw new IllegalStateException();
            }

            var2 = 1;
         }

         if (var3 < 1) {
            if (var5 != 65280) {
               throw new IllegalStateException();
            }

            var3 = 1;
         }

         int var6 = var3 - 334;
         int var7;
         if (var6 < 0) {
            if (var5 != 65280) {
               throw new IllegalStateException();
            }

            var7 = client.uk;
         } else if (var6 >= 100) {
            var7 = client.vb;
         } else {
            var7 = client.uk + var6 * (client.vb - client.uk) / 100;
         }

         int var8 = 512 * var7 * var3 / (var2 * 334);
         int var9;
         int var10;
         short var18;
         if (var8 < client.vy) {
            if (var5 != 65280) {
               throw new IllegalStateException();
            }

            var18 = client.vy;
            var7 = var2 * var18 * 334 / (512 * var3);
            if (var7 > client.vi) {
               if (var5 != 65280) {
                  throw new IllegalStateException();
               }

               var7 = client.vi;
               var9 = 512 * var3 * var7 / (334 * var18);
               var10 = (var2 - var9) / 2;
               if (var4) {
                  if (var5 != 65280) {
                     throw new IllegalStateException();
                  }

                  vz.eg();
                  vz.ef(var0, var1, var10, var3, -16777216);
                  vz.ef(var0 + var2 - var10, var1, var10, var3, -16777216);
               }

               var0 += var10;
               var2 -= var10 * 2;
            }
         } else if (var8 > client.vo) {
            if (var5 != 65280) {
               throw new IllegalStateException();
            }

            var18 = client.vo;
            var7 = 334 * var2 * var18 / (512 * var3);
            if (var7 < client.vf) {
               var7 = client.vf;
               var9 = var2 * var18 * 334 / (var7 * 512);
               var10 = (var3 - var9) / 2;
               if (var4) {
                  if (var5 != 65280) {
                     throw new IllegalStateException();
                  }

                  vz.eg();
                  vz.ef(var0, var1, var2, var10, -16777216);
                  vz.ef(var0, var1 + var3 - var10, var2, var10, -16777216);
               }

               var1 += var10;
               var3 -= 2 * var10;
            }
         }

         label147: {
            client.vl = 1870517749 * (var3 * var7 / 334);
            if (client.vw * -1725432169 == var2) {
               if (var3 == -1477308191 * client.vm) {
                  break label147;
               }

               if (var5 != 65280) {
                  return;
               }
            }

            int[] var19 = new int[9];

            for(var10 = 0; var10 < var19.length; ++var10) {
               if (var5 != 65280) {
                  throw new IllegalStateException();
               }

               int var11 = var10 * 32 + 128 + 15;
               int var12 = ih.go(var11, 1362845553);
               int var13 = jm.aj[var11];
               int var15 = var3 - 334;
               if (var15 < 0) {
                  if (var5 != 65280) {
                     throw new IllegalStateException();
                  }

                  var15 = 0;
               } else if (var15 > 100) {
                  if (var5 != 65280) {
                     throw new IllegalStateException();
                  }

                  var15 = 100;
               }

               int var16 = client.vn + (client.vd - client.vn) * var15 / 100;
               int var14 = var16 * var12 / 256;
               var19[var10] = var13 * var14 >> 16;
            }

            hx.jf.aw.cd(var19, 500, 800, 334 * var2 / var3, 334);
         }

         client.vu = var0 * 1597566935;
         client.vr = var1 * 695204471;
         client.vw = var2 * -684236505;
         client.vm = 1263481633 * var3;
      } catch (RuntimeException var17) {
         throw tm.aw(var17, "eq.if(" + ')');
      }
   }

   int aj(sv var1, sv var2) {
      if (0 != var1.ai * 27514038 && var2.ai * 1511931945 != 0) {
         return this.ap ? 1912983531 * var1.ay - var2.ay * 748464510 : -1071937363 * var2.ay - -1071937363 * var1.ay;
      } else {
         return this.an(var1, var2, 1255277363);
      }
   }

   public int am(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, -2080904015);
   }

   int aw(sv var1, sv var2) {
      if (0 != var1.ai * 1511931945 && var2.ai * 1511931945 != 0) {
         return this.ap ? -1071937363 * var1.ay - var2.ay * 48910333 : -1992933356 * var2.ay - -1071937363 * var1.ay;
      } else {
         return this.an(var1, var2, 1255277363);
      }
   }

   int ak(sv var1, sv var2) {
      if (0 != var1.ai * -797207503 && var2.ai * 1511931945 != 0) {
         return this.ap ? -1071937363 * var1.ay - var2.ay * -744853661 : 1820894026 * var2.ay - -1071937363 * var1.ay;
      } else {
         return this.an(var1, var2, 1255277363);
      }
   }

   static db[] ap(int var0) {
      try {
         return new db[]{db.ai, db.ak, db.aw, db.ay, db.aj, db.ap};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "eq.ap(" + ')');
      }
   }

   int ai(sv var1, sv var2) {
      if (0 != var1.ai * 1511931945 && var2.ai * 1511931945 != 0) {
         return this.ap ? -1071937363 * var1.ay - var2.ay * -1071937363 : -1071937363 * var2.ay - -1071937363 * var1.ay;
      } else {
         return this.an(var1, var2, 1255277363);
      }
   }

   public static void ak(byte var0) {
      try {
         kb.ai.ay(5);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "eq.ak(" + ')');
      }
   }

   public int as(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, -2080904015);
   }

   public int at(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, -2080904015);
   }
}
