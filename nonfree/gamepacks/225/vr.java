public class vr extends tr {
   public static int bd = 0;
   public static int an;
   public static int ak;
   public static float[] bn;
   public static int bf = 0;
   public static int bm = 0;
   public static int bx = 0;
   public static int[] aw;
   static final float bh = 0.0F;

   public static void fl() {
      bf = 0;
      bd = 0;
      bm = an;
      bx = ak;
   }

   static void fb(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         fi(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < bd) {
            var4 = bd;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > bx) {
            var5 = bx;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if (var12 < bf) {
               var12 = bf;
            }

            var13 = var0 + var8;
            if (var13 > bm) {
               var13 = bm;
            }

            var14 = var12 + var6 * an;

            for(var15 = var12; var15 < var13; ++var15) {
               aw[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if (var12 < bf) {
               var12 = bf;
            }

            var13 = var0 + var8;
            if (var13 > bm - 1) {
               var13 = bm - 1;
            }

            var14 = var12 + var6 * an;

            for(var15 = var12; var15 <= var13; ++var15) {
               aw[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   public static void fe(int[] var0) {
      bf = var0[0];
      bd = var0[1];
      bm = var0[2];
      bx = var0[3];
   }

   public static void et(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > an) {
         var2 = an;
      }

      if (var3 > ak) {
         var3 = ak;
      }

      bf = var0;
      bd = var1;
      bm = var2;
      bx = var3;
   }

   public static void fv(int var0, int var1, int var2, int var3) {
      if (bf < var0) {
         bf = var0;
      }

      if (bd < var1) {
         bd = var1;
      }

      if (bm > var2) {
         bm = var2;
      }

      if (bx > var3) {
         bx = var3;
      }

   }

   public static void ff(int[] var0) {
      var0[0] = bf;
      var0[1] = bd;
      var0[2] = bm;
      var0[3] = bx;
   }

   public static void gz(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 1740487188) {
            fb(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = -80126163 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 1960965998) * var4;
            int var12 = var1 - var2;
            if (var12 < bd) {
               var12 = bd;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > bx) {
               var13 = bx;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if (var20 < bf) {
                  var20 = bf;
               }

               var21 = var0 + var16;
               if (var21 > bm) {
                  var21 = bm;
               }

               var22 = var20 + var14 * an;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (aw[var22] >> 16 & -264119751) * var5;
                  var10 = (aw[var22] >> 8 & 255) * var5;
                  var11 = (aw[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  aw[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if (var20 < bf) {
                  var20 = bf;
               }

               var21 = var0 + var16;
               if (var21 > bm - 1) {
                  var21 = bm - 1;
               }

               var22 = var20 + var14 * an;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (aw[var22] >> 16 & 707791093) * var5;
                  var10 = (aw[var22] >> 8 & 255) * var5;
                  var11 = (aw[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  aw[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   public static void ft() {
      int var0 = 0;

      int var1;
      for(var1 = an * ak - 7; var0 < var1; aw[var0++] = 0) {
         aw[var0++] = 0;
         aw[var0++] = 0;
         aw[var0++] = 0;
         aw[var0++] = 0;
         aw[var0++] = 0;
         aw[var0++] = 0;
         aw[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; aw[var0++] = 0) {
      }

      fm();
   }

   public static void hg(int var0, int var1, int var2, int var3) {
      if (var1 >= bd && var1 < bx) {
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         int var4 = var0 + var1 * an;

         for(int var5 = 0; var5 < var2; ++var5) {
            aw[var4 + var5] = var3;
         }

      }
   }

   static void hh(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= bf && var0 < bm) {
         if (var1 < bd) {
            var2 -= bd - var1;
            var1 = bd;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * an;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (aw[var12] >> 16 & 255) * var5;
            int var10 = (aw[var12] >> 8 & 255) * var5;
            int var11 = (aw[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            aw[var12] = var14;
            var12 += an;
         }

      }
   }

   public static void fp(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < bf) {
         var2 -= bf - var0;
         var0 = bf;
      }

      if (var1 < bd) {
         var3 -= bd - var1;
         var1 = bd;
      }

      if (var0 + var2 > bm) {
         var2 = bm - var0;
      }

      if (var1 + var3 > bx) {
         var3 = bx - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = an - var2;
      int var8 = var0 + var1 * an;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = aw[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
            aw[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   public static void fr(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < bf) {
         var2 -= bf - var0;
         var0 = bf;
      }

      if (var1 < bd) {
         var3 -= bd - var1;
         var1 = bd;
      }

      if (var0 + var2 > bm) {
         var2 = bm - var0;
      }

      if (var1 + var3 > bx) {
         var3 = bx - var1;
      }

      int var5 = an - var2;
      int var6 = var0 + var1 * an;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            aw[var6++] = var4;
         }

         var6 += var5;
      }

   }

   public static void fg(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var1 < bd) {
            var6 += (bd - var1) * var7;
            var3 -= bd - var1;
            var1 = bd;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         if (var1 + var3 > bx) {
            var3 = bx - var1;
         }

         int var8 = an - var2;
         int var9 = var0 + var1 * an;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               aw[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   public static void fu(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var1 < bd) {
            var8 += (bd - var1) * var9;
            var3 -= bd - var1;
            var1 = bd;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         if (var1 + var3 > bx) {
            var3 = bx - var1;
         }

         int var10 = an - var2;
         int var11 = var0 + var1 * an;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & '\uff00') >>> 8;
            if (var15 == 0) {
               var11 += an;
               var8 += var9;
            } else {
               int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & '\uff00') * var13 + (var5 & '\uff00') * var14 & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & '\uff00') * var15 >> 8 & '\uff00');

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = aw[var11];
                  if (var20 == 0) {
                     aw[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & '\uff00') * var17 >> 8 & '\uff00');
                     aw[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   public static void fj(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < an && var1 < ak) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > an) {
               var2 = an - var0;
            }

            if (var1 + var3 > ak) {
               var3 = ak - var1;
            }

            int var11 = var6.length / var7;
            int var12 = an - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var8 && (var13 != 255 || var14 != 255)) {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = aw[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & '\uff00') * var22 & 16711680) >> 8;
                     aw[var15++] = var24;
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        aw[var15++] = var5;
                     } else {
                        aw[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static void fs(int var0, int var1, int var2, int var3, int var4) {
      fn(var0, var1, var2, var4);
      fn(var0, var1 + var3 - 1, var2, var4);
      fo(var0, var1, var3, var4);
      fo(var0 + var2 - 1, var1, var3, var4);
   }

   public static void fq(int var0, int var1, int var2, int var3, int var4, int var5) {
      fh(var0, var1, var2, var4, var5);
      fh(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         fw(var0, var1 + 1, var3 - 2, var4, var5);
         fw(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   public static void if() {
      if (bn != null) {
         int var0;
         int var1;
         int var2;
         if (bf == 0 && bm == an && bd == 0 && bx == ak) {
            var0 = bn.length;
            var1 = var0 - (var0 & 7);

            for(var2 = 0; var2 < var1; bn[var2++] = 0.0F) {
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
            }

            while(var2 < var0) {
               bn[var2++] = 0.0F;
            }
         } else {
            var0 = bm - bf;
            var1 = bx - bd;
            var2 = an - var0;
            int var3 = bf + bd * an;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for(int var7 = -var1; var7 < 0; ++var7) {
               int var6;
               if (var4 > 0) {
                  var6 = var4;

                  do {
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               if (var5 > 0) {
                  var6 = var5;

                  do {
                     ++var0;
                     bn[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               var0 += var2;
            }
         }

      }
   }

   static void fh(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= bd && var1 < bx) {
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * an;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (aw[var12] >> 16 & 255) * var5;
            int var10 = (aw[var12] >> 8 & 255) * var5;
            int var11 = (aw[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            aw[var12++] = var14;
         }

      }
   }

   public static void fo(int var0, int var1, int var2, int var3) {
      if (var0 >= bf && var0 < bm) {
         if (var1 < bd) {
            var2 -= bd - var1;
            var1 = bd;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var4 = var0 + var1 * an;

         for(int var5 = 0; var5 < var2; ++var5) {
            aw[var4 + var5 * an] = var3;
         }

      }
   }

   static void fw(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= bf && var0 < bm) {
         if (var1 < bd) {
            var2 -= bd - var1;
            var1 = bd;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * an;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (aw[var12] >> 16 & 255) * var5;
            int var10 = (aw[var12] >> 8 & 255) * var5;
            int var11 = (aw[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            aw[var12] = var14;
            var12 += an;
         }

      }
   }

   public static void gs(int var0, int var1, int var2, int var3) {
      if (bf < var0) {
         bf = var0;
      }

      if (bd < var1) {
         bd = var1;
      }

      if (bm > var2) {
         bm = var2;
      }

      if (bx > var3) {
         bx = var3;
      }

   }

   public static void gj(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            fb(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if (var12 < bd) {
               var12 = bd;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > bx) {
               var13 = bx;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if (var20 < bf) {
                  var20 = bf;
               }

               var21 = var0 + var16;
               if (var21 > bm) {
                  var21 = bm;
               }

               var22 = var20 + var14 * an;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (aw[var22] >> 16 & 255) * var5;
                  var10 = (aw[var22] >> 8 & 255) * var5;
                  var11 = (aw[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  aw[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if (var20 < bf) {
                  var20 = bf;
               }

               var21 = var0 + var16;
               if (var21 > bm - 1) {
                  var21 = bm - 1;
               }

               var22 = var20 + var14 * an;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (aw[var22] >> 16 & 255) * var5;
                  var10 = (aw[var22] >> 8 & 255) * var5;
                  var11 = (aw[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  aw[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   public static void fc(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * an;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            aw[var6++] = var2;
         }

         var5 += an;
      }

   }

   public static void fm() {
      if (bn != null) {
         int var0;
         int var1;
         int var2;
         if (bf == 0 && bm == an && bd == 0 && bx == ak) {
            var0 = bn.length;
            var1 = var0 - (var0 & 7);

            for(var2 = 0; var2 < var1; bn[var2++] = 0.0F) {
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
            }

            while(var2 < var0) {
               bn[var2++] = 0.0F;
            }
         } else {
            var0 = bm - bf;
            var1 = bx - bd;
            var2 = an - var0;
            int var3 = bf + bd * an;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for(int var7 = -var1; var7 < 0; ++var7) {
               int var6;
               if (var4 > 0) {
                  var6 = var4;

                  do {
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               if (var5 > 0) {
                  var6 = var5;

                  do {
                     ++var0;
                     bn[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               var0 += var2;
            }
         }

      }
   }

   public static void fx() {
      if (bn != null) {
         int var0 = bn.length;

         for(int var1 = 0; var1 < var0; ++var1) {
            if (var1 % an < an / 2 && bn[var1] > 0.0F) {
               int var2 = (int)(255.0F * jk.af(bn[var1], -2037103799));
               aw[var1] = var2 << 16 | var2 << 8 | var2;
            }
         }

      }
   }

   static void fi(int var0, int var1, int var2) {
      if (var0 >= bf && var1 >= bd && var0 < bm && var1 < bx) {
         aw[var0 + var1 * an] = var2;
      }
   }

   protected static void fz(int[] var0, int var1, int var2, float[] var3) {
      aw = var0;
      an = var1;
      ak = var2;
      bn = var3;
      et(0, 0, var1, var2);
   }

   public static void fa() {
      bf = 0;
      bd = 0;
      bm = an;
      bx = ak;
   }

   public static void gb(int var0, int var1, int var2, int var3) {
      if (bf < var0) {
         bf = var0;
      }

      if (bd < var1) {
         bd = var1;
      }

      if (bm > var2) {
         bm = var2;
      }

      if (bx > var3) {
         bx = var3;
      }

   }

   public static void ga() {
      bf = 0;
      bd = 0;
      bm = an;
      bx = ak;
   }

   public static void gd(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > an) {
         var2 = an;
      }

      if (var3 > ak) {
         var3 = ak;
      }

      bf = var0;
      bd = var1;
      bm = var2;
      bx = var3;
   }

   public static void gl(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > an) {
         var2 = an;
      }

      if (var3 > ak) {
         var3 = ak;
      }

      bf = var0;
      bd = var1;
      bm = var2;
      bx = var3;
   }

   public static void ge(int var0, int var1, int var2, int var3) {
      if (bf < var0) {
         bf = var0;
      }

      if (bd < var1) {
         bd = var1;
      }

      if (bm > var2) {
         bm = var2;
      }

      if (bx > var3) {
         bx = var3;
      }

   }

   public static void gc(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < bf) {
         var2 -= bf - var0;
         var0 = bf;
      }

      if (var1 < bd) {
         var3 -= bd - var1;
         var1 = bd;
      }

      if (var0 + var2 > bm) {
         var2 = bm - var0;
      }

      if (var1 + var3 > bx) {
         var3 = bx - var1;
      }

      int var5 = an - var2;
      int var6 = var0 + var1 * an;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            aw[var6++] = var4;
         }

         var6 += var5;
      }

   }

   public static void hw(int var0, int var1, int var2, int var3) {
      if (var1 >= bd && var1 < bx) {
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         int var4 = var0 + var1 * an;

         for(int var5 = 0; var5 < var2; ++var5) {
            aw[var4 + var5] = var3;
         }

      }
   }

   public static void gk(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var1 < bd) {
            var8 += (bd - var1) * var9;
            var3 -= bd - var1;
            var1 = bd;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         if (var1 + var3 > bx) {
            var3 = bx - var1;
         }

         int var10 = an - var2;
         int var11 = var0 + var1 * an;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = -356451020 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & '\uff00') >>> 8;
            if (var15 == 0) {
               var11 += an;
               var8 += var9;
            } else {
               int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -886690375) + ((var4 & '\uff00') * var13 + (var5 & '\uff00') * var14 & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & -2030806618) * var15 >> 8 & -361028968) + ((var16 & '\uff00') * var15 >> 8 & '\uff00');

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = aw[var11];
                  if (var20 == 0) {
                     aw[var11++] = var18;
                  } else {
                     var20 = ((var20 & -1397968807) * var17 >> 8 & 16711935) + ((var20 & '\uff00') * var17 >> 8 & '\uff00');
                     aw[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   public static void gp(int[] var0) {
      bf = var0[0];
      bd = var0[1];
      bm = var0[2];
      bx = var0[3];
   }

   public static void gh(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = -2095796139 / var3;
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var1 < bd) {
            var8 += (bd - var1) * var9;
            var3 -= bd - var1;
            var1 = bd;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         if (var1 + var3 > bx) {
            var3 = bx - var1;
         }

         int var10 = an - var2;
         int var11 = var0 + var1 * an;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = -2134401809 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & '\uff00') >>> 8;
            if (var15 == 0) {
               var11 += an;
               var8 += var9;
            } else {
               int var16 = ((var4 & -106421218) * var13 + (var5 & 16711935) * var14 & -753127563) + ((var4 & -933592811) * var13 + (var5 & -1045304553) * var14 & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & -1319282017) + ((var16 & 1802169171) * var15 >> 8 & '\uff00');

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = aw[var11];
                  if (var20 == 0) {
                     aw[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 842627937) + ((var20 & 2012899920) * var17 >> 8 & 384240567);
                     aw[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   public static void gx() {
      int var0 = 0;

      int var1;
      for(var1 = an * ak - 7; var0 < var1; aw[var0++] = 0) {
         aw[var0++] = 0;
         aw[var0++] = 0;
         aw[var0++] = 0;
         aw[var0++] = 0;
         aw[var0++] = 0;
         aw[var0++] = 0;
         aw[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; aw[var0++] = 0) {
      }

      fm();
   }

   static void gu(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         fi(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < bd) {
            var4 = bd;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > bx) {
            var5 = bx;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if (var12 < bf) {
               var12 = bf;
            }

            var13 = var0 + var8;
            if (var13 > bm) {
               var13 = bm;
            }

            var14 = var12 + var6 * an;

            for(var15 = var12; var15 < var13; ++var15) {
               aw[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if (var12 < bf) {
               var12 = bf;
            }

            var13 = var0 + var8;
            if (var13 > bm - 1) {
               var13 = bm - 1;
            }

            var14 = var12 + var6 * an;

            for(var15 = var12; var15 <= var13; ++var15) {
               aw[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   public static void hs(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * an;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            aw[var6++] = var2;
         }

         var5 += an;
      }

   }

   public static void gt(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 964923007) {
            fb(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if (var12 < bd) {
               var12 = bd;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > bx) {
               var13 = bx;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if (var20 < bf) {
                  var20 = bf;
               }

               var21 = var0 + var16;
               if (var21 > bm) {
                  var21 = bm;
               }

               var22 = var20 + var14 * an;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (aw[var22] >> 16 & -589297201) * var5;
                  var10 = (aw[var22] >> 8 & 1800519883) * var5;
                  var11 = (aw[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  aw[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if (var20 < bf) {
                  var20 = bf;
               }

               var21 = var0 + var16;
               if (var21 > bm - 1) {
                  var21 = bm - 1;
               }

               var22 = var20 + var14 * an;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (aw[var22] >> 16 & 255) * var5;
                  var10 = (aw[var22] >> 8 & -1871598130) * var5;
                  var11 = (aw[var22] & -1170462753) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  aw[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   protected static void fy(int[] var0, int var1, int var2, float[] var3) {
      aw = var0;
      an = var1;
      ak = var2;
      bn = var3;
      et(0, 0, var1, var2);
   }

   public static void gm(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < bf) {
         var2 -= bf - var0;
         var0 = bf;
      }

      if (var1 < bd) {
         var3 -= bd - var1;
         var1 = bd;
      }

      if (var0 + var2 > bm) {
         var2 = bm - var0;
      }

      if (var1 + var3 > bx) {
         var3 = bx - var1;
      }

      var4 = ((var4 & -80528119) * var5 >> 8 & 16711935) + ((var4 & 242556336) * var5 >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = an - var2;
      int var8 = var0 + var1 * an;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = aw[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 300042105) + ((var11 & 689221867) * var6 >> 8 & '\uff00');
            aw[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   public static void go(int var0, int var1, int var2, int var3) {
      if (bf < var0) {
         bf = var0;
      }

      if (bd < var1) {
         bd = var1;
      }

      if (bm > var2) {
         bm = var2;
      }

      if (bx > var3) {
         bx = var3;
      }

   }

   public static void ia() {
      if (bn != null) {
         int var0;
         int var1;
         int var2;
         if (bf == 0 && bm == an && bd == 0 && bx == ak) {
            var0 = bn.length;
            var1 = var0 - (var0 & 7);

            for(var2 = 0; var2 < var1; bn[var2++] = 0.0F) {
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
            }

            while(var2 < var0) {
               bn[var2++] = 0.0F;
            }
         } else {
            var0 = bm - bf;
            var1 = bx - bd;
            var2 = an - var0;
            int var3 = bf + bd * an;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for(int var7 = -var1; var7 < 0; ++var7) {
               int var6;
               if (var4 > 0) {
                  var6 = var4;

                  do {
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               if (var5 > 0) {
                  var6 = var5;

                  do {
                     ++var0;
                     bn[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               var0 += var2;
            }
         }

      }
   }

   public static void gr(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var1 < bd) {
            var6 += (bd - var1) * var7;
            var3 -= bd - var1;
            var1 = bd;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         if (var1 + var3 > bx) {
            var3 = bx - var1;
         }

         int var8 = an - var2;
         int var9 = var0 + var1 * an;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               aw[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   public static void gq(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var1 < bd) {
            var6 += (bd - var1) * var7;
            var3 -= bd - var1;
            var1 = bd;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         if (var1 + var3 > bx) {
            var3 = bx - var1;
         }

         int var8 = an - var2;
         int var9 = var0 + var1 * an;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               aw[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   public static void hv(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            fn(var0, var1, var2 + 1, var4);
         } else {
            fn(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if (var2 == 0) {
         if (var3 >= 0) {
            fo(var0, var1, var3 + 1, var4);
         } else {
            fo(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if (var0 < bf) {
               var1 += var5 * (bf - var0);
               var0 = bf;
            }

            if (var2 >= bm) {
               var2 = bm - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= bd && var6 < bx) {
                  aw[var0 + var6 * an] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if (var1 < bd) {
               var0 += var5 * (bd - var1);
               var1 = bd;
            }

            if (var3 >= bx) {
               var3 = bx - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= bf && var6 < bm) {
                  aw[var6 + var1 * an] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   public static void gi(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = -953639492 / var3;
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var1 < bd) {
            var8 += (bd - var1) * var9;
            var3 -= bd - var1;
            var1 = bd;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         if (var1 + var3 > bx) {
            var3 = bx - var1;
         }

         int var10 = an - var2;
         int var11 = var0 + var1 * an;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = -2109952945 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & 1424495259) >>> 8;
            if (var15 == 0) {
               var11 += an;
               var8 += var9;
            } else {
               int var16 = ((var4 & -1540693010) * var13 + (var5 & 16711935) * var14 & 926752980) + ((var4 & '\uff00') * var13 + (var5 & -347915299) * var14 & 16711680) >>> 8;
               int var17 = 1863915596 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & -312942776) + ((var16 & 1253723232) * var15 >> 8 & -1716122598);

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = aw[var11];
                  if (var20 == 0) {
                     aw[var11++] = var18;
                  } else {
                     var20 = ((var20 & -1175771345) * var17 >> 8 & -928227119) + ((var20 & '\uff00') * var17 >> 8 & '\uff00');
                     aw[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   public static void gv(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 268283702 / var3;
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var1 < bd) {
            var6 += (bd - var1) * var7;
            var3 -= bd - var1;
            var1 = bd;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         if (var1 + var3 > bx) {
            var3 = bx - var1;
         }

         int var8 = an - var2;
         int var9 = var0 + var1 * an;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & -1460811210) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               aw[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   public static void ho(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * an;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            aw[var6++] = var2;
         }

         var5 += an;
      }

   }

   protected static void ej(int[] var0, int var1, int var2, float[] var3) {
      aw = var0;
      an = var1;
      ak = var2;
      bn = var3;
      et(0, 0, var1, var2);
   }

   public static void hc(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < an && var1 < ak) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > an) {
               var2 = an - var0;
            }

            if (var1 + var3 > ak) {
               var3 = ak - var1;
            }

            int var11 = var6.length / var7;
            int var12 = an - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (!var8 || var13 == 255 && var14 == 255) {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        aw[var15++] = var5;
                     } else {
                        aw[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = aw[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & '\uff00') * var22 & 16711680) >> 8;
                     aw[var15++] = var24;
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static void hf(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < an && var1 < ak) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > an) {
               var2 = an - var0;
            }

            if (var1 + var3 > ak) {
               var3 = ak - var1;
            }

            int var11 = var6.length / var7;
            int var12 = an - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (!var8 || var13 == 255 && var14 == 255) {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        aw[var15++] = var5;
                     } else {
                        aw[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = aw[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & '\uff00') * var22 & 16711680) >> 8;
                     aw[var15++] = var24;
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static void he(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < an && var1 < ak) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > an) {
               var2 = an - var0;
            }

            if (var1 + var3 > ak) {
               var3 = ak - var1;
            }

            int var11 = var6.length / var7;
            int var12 = an - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (!var8 || var13 == 255 && var14 == 255) {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        aw[var15++] = var5;
                     } else {
                        aw[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = aw[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & '\uff00') * var22 & 16711680) >> 8;
                     aw[var15++] = var24;
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static void hr(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < an && var1 < ak) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > an) {
               var2 = an - var0;
            }

            if (var1 + var3 > ak) {
               var3 = ak - var1;
            }

            int var11 = var6.length / var7;
            int var12 = an - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var8 && (var13 != 255 || var14 != 1956520725)) {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = aw[var15];
                     int var24 = ((var20 & 15617618) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & -1789329428) * var22 & 16711680) >> 8;
                     aw[var15++] = var24;
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        aw[var15++] = var5;
                     } else {
                        aw[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static void hk(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < an && var1 < ak) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > an) {
               var2 = an - var0;
            }

            if (var1 + var3 > ak) {
               var3 = ak - var1;
            }

            int var11 = var6.length / var7;
            int var12 = an - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var8 && (var13 != 255 || var14 != 1104312699)) {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = -631407715 - var21;
                     int var23 = aw[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & 571408474) + ((var20 & 1099169139) * var21 + (var23 & '\uff00') * var22 & 1543660670) >> 8;
                     aw[var15++] = var24;
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        aw[var15++] = var5;
                     } else {
                        aw[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static void hi(int var0, int var1, int var2, int var3, int var4) {
      fn(var0, var1, var2, var4);
      fn(var0, var1 + var3 - 1, var2, var4);
      fo(var0, var1, var3, var4);
      fo(var0 + var2 - 1, var1, var3, var4);
   }

   public static void hy(int var0, int var1, int var2, int var3, int var4) {
      fn(var0, var1, var2, var4);
      fn(var0, var1 + var3 - 1, var2, var4);
      fo(var0, var1, var3, var4);
      fo(var0 + var2 - 1, var1, var3, var4);
   }

   public static void hd(int var0, int var1, int var2, int var3, int var4, int var5) {
      fh(var0, var1, var2, var4, var5);
      fh(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         fw(var0, var1 + 1, var3 - 2, var4, var5);
         fw(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   public static void hj(int var0, int var1, int var2, int var3, int var4, int var5) {
      fh(var0, var1, var2, var4, var5);
      fh(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         fw(var0, var1 + 1, var3 - 2, var4, var5);
         fw(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   public static void gw(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < bf) {
         var2 -= bf - var0;
         var0 = bf;
      }

      if (var1 < bd) {
         var3 -= bd - var1;
         var1 = bd;
      }

      if (var0 + var2 > bm) {
         var2 = bm - var0;
      }

      if (var1 + var3 > bx) {
         var3 = bx - var1;
      }

      int var5 = an - var2;
      int var6 = var0 + var1 * an;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            aw[var6++] = var4;
         }

         var6 += var5;
      }

   }

   public static void ec() {
      bf = 0;
      bd = 0;
      bm = an;
      bx = ak;
   }

   public static void hp(int var0, int var1, int var2, int var3) {
      if (var1 >= bd && var1 < bx) {
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         int var4 = var0 + var1 * an;

         for(int var5 = 0; var5 < var2; ++var5) {
            aw[var4 + var5] = var3;
         }

      }
   }

   static void hn(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= bd && var1 < bx) {
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * an;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (aw[var12] >> 16 & 255) * var5;
            int var10 = (aw[var12] >> 8 & 255) * var5;
            int var11 = (aw[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            aw[var12++] = var14;
         }

      }
   }

   static void hb(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= bd && var1 < bx) {
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * an;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (aw[var12] >> 16 & 255) * var5;
            int var10 = (aw[var12] >> 8 & 255) * var5;
            int var11 = (aw[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            aw[var12++] = var14;
         }

      }
   }

   public static void hq(int var0, int var1, int var2, int var3) {
      if (var0 >= bf && var0 < bm) {
         if (var1 < bd) {
            var2 -= bd - var1;
            var1 = bd;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var4 = var0 + var1 * an;

         for(int var5 = 0; var5 < var2; ++var5) {
            aw[var4 + var5 * an] = var3;
         }

      }
   }

   public static void hm(int var0, int var1, int var2, int var3) {
      if (var0 >= bf && var0 < bm) {
         if (var1 < bd) {
            var2 -= bd - var1;
            var1 = bd;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var4 = var0 + var1 * an;

         for(int var5 = 0; var5 < var2; ++var5) {
            aw[var4 + var5 * an] = var3;
         }

      }
   }

   public static void hz(int var0, int var1, int var2, int var3) {
      if (var0 >= bf && var0 < bm) {
         if (var1 < bd) {
            var2 -= bd - var1;
            var1 = bd;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var4 = var0 + var1 * an;

         for(int var5 = 0; var5 < var2; ++var5) {
            aw[var4 + var5 * an] = var3;
         }

      }
   }

   public static void hu(int var0, int var1, int var2, int var3) {
      if (var0 >= bf && var0 < bm) {
         if (var1 < bd) {
            var2 -= bd - var1;
            var1 = bd;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var4 = var0 + var1 * an;

         for(int var5 = 0; var5 < var2; ++var5) {
            aw[var4 + var5 * an] = var3;
         }

      }
   }

   public static void fd(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            fn(var0, var1, var2 + 1, var4);
         } else {
            fn(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if (var2 == 0) {
         if (var3 >= 0) {
            fo(var0, var1, var3 + 1, var4);
         } else {
            fo(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if (var0 < bf) {
               var1 += var5 * (bf - var0);
               var0 = bf;
            }

            if (var2 >= bm) {
               var2 = bm - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= bd && var6 < bx) {
                  aw[var0 + var6 * an] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if (var1 < bd) {
               var0 += var5 * (bd - var1);
               var1 = bd;
            }

            if (var3 >= bx) {
               var3 = bx - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= bf && var6 < bm) {
                  aw[var6 + var1 * an] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   public static void gy(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < an && var1 < ak) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > an) {
               var2 = an - var0;
            }

            if (var1 + var3 > ak) {
               var3 = ak - var1;
            }

            int var11 = var6.length / var7;
            int var12 = an - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var8 && (var13 != 1870888577 || var14 != 255)) {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = -1538389712 - var21;
                     int var23 = aw[var15];
                     int var24 = ((var20 & 1273846145) * var21 + (var23 & -1326219539) * var22 & -16711936) + ((var20 & -1238852004) * var21 + (var23 & '\uff00') * var22 & 16711680) >> 8;
                     aw[var15++] = var24;
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * an + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        aw[var15++] = var5;
                     } else {
                        aw[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static void gf(int[] var0) {
      bf = var0[0];
      bd = var0[1];
      bm = var0[2];
      bx = var0[3];
   }

   public static void hl(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            fn(var0, var1, var2 + 1, var4);
         } else {
            fn(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if (var2 == 0) {
         if (var3 >= 0) {
            fo(var0, var1, var3 + 1, var4);
         } else {
            fo(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if (var0 < bf) {
               var1 += var5 * (bf - var0);
               var0 = bf;
            }

            if (var2 >= bm) {
               var2 = bm - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= bd && var6 < bx) {
                  aw[var0 + var6 * an] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += -1664347675;
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if (var1 < bd) {
               var0 += var5 * (bd - var1);
               var1 = bd;
            }

            if (var3 >= bx) {
               var3 = bx - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= bf && var6 < bm) {
                  aw[var6 + var1 * an] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   static void ha(int var0, int var1, int var2) {
      if (var0 >= bf && var1 >= bd && var0 < bm && var1 < bx) {
         aw[var0 + var1 * an] = var2;
      }
   }

   static void hx(int var0, int var1, int var2) {
      if (var0 >= bf && var1 >= bd && var0 < bm && var1 < bx) {
         aw[var0 + var1 * an] = var2;
      }
   }

   public static void id(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * an;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            aw[var6++] = var2;
         }

         var5 += an;
      }

   }

   static void ht(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= bf && var0 < bm) {
         if (var1 < bd) {
            var2 -= bd - var1;
            var1 = bd;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * an;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (aw[var12] >> 16 & 255) * var5;
            int var10 = (aw[var12] >> 8 & 255) * var5;
            int var11 = (aw[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            aw[var12] = var14;
            var12 += an;
         }

      }
   }

   public static void ie(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * an;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            aw[var6++] = var2;
         }

         var5 += an;
      }

   }

   public static void fk(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            fb(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if (var12 < bd) {
               var12 = bd;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > bx) {
               var13 = bx;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if (var20 < bf) {
                  var20 = bf;
               }

               var21 = var0 + var16;
               if (var21 > bm) {
                  var21 = bm;
               }

               var22 = var20 + var14 * an;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (aw[var22] >> 16 & 255) * var5;
                  var10 = (aw[var22] >> 8 & 255) * var5;
                  var11 = (aw[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  aw[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if (var20 < bf) {
                  var20 = bf;
               }

               var21 = var0 + var16;
               if (var21 > bm - 1) {
                  var21 = bm - 1;
               }

               var22 = var20 + var14 * an;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (aw[var22] >> 16 & 255) * var5;
                  var10 = (aw[var22] >> 8 & 255) * var5;
                  var11 = (aw[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  aw[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   public static void is() {
      if (bn != null) {
         int var0;
         int var1;
         int var2;
         if (bf == 0 && bm == an && bd == 0 && bx == ak) {
            var0 = bn.length;
            var1 = var0 - (var0 & 7);

            for(var2 = 0; var2 < var1; bn[var2++] = 0.0F) {
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
               bn[var2++] = 0.0F;
            }

            while(var2 < var0) {
               bn[var2++] = 0.0F;
            }
         } else {
            var0 = bm - bf;
            var1 = bx - bd;
            var2 = an - var0;
            int var3 = bf + bd * an;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for(int var7 = -var1; var7 < 0; ++var7) {
               int var6;
               if (var4 > 0) {
                  var6 = var4;

                  do {
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     ++var0;
                     bn[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               if (var5 > 0) {
                  var6 = var5;

                  do {
                     ++var0;
                     bn[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               var0 += var2;
            }
         }

      }
   }

   protected vr() {
   }

   public static void fn(int var0, int var1, int var2, int var3) {
      if (var1 >= bd && var1 < bx) {
         if (var0 < bf) {
            var2 -= bf - var0;
            var0 = bf;
         }

         if (var0 + var2 > bm) {
            var2 = bm - var0;
         }

         int var4 = var0 + var1 * an;

         for(int var5 = 0; var5 < var2; ++var5) {
            aw[var4 + var5] = var3;
         }

      }
   }
}
