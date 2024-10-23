public class vz extends tp {
   public static int ah;
   public static int aa;
   public static int[] al;
   public static float[] bh;
   static final float bj = 0.0F;
   public static int bv = 0;
   public static int bx = 0;
   public static int bk = 0;
   public static int bb = 0;

   protected static void et(int[] var0, int var1, int var2, float[] var3) {
      al = var0;
      aa = var1;
      ah = var2;
      bh = var3;
      ev(0, 0, var1, var2);
   }

   static void gi(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= bv && var1 < bx) {
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & -1338528151) * var4;
         int var7 = (var3 >> 8 & -283007211) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * aa;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (al[var12] >> 16 & 255) * var5;
            int var10 = (al[var12] >> 8 & 255) * var5;
            int var11 = (al[var12] & -1001521848) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            al[var12++] = var14;
         }

      }
   }

   public static void eg() {
      bk = 0;
      bv = 0;
      bb = aa;
      bx = ah;
   }

   public static void ev(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > aa) {
         var2 = aa;
      }

      if (var3 > ah) {
         var3 = ah;
      }

      bk = var0;
      bv = var1;
      bb = var2;
      bx = var3;
   }

   public static void ga(int var0, int var1, int var2, int var3, int var4) {
      ej(var0, var1, var2, var4);
      ej(var0, var1 + var3 - 1, var2, var4);
      ew(var0, var1, var3, var4);
      ew(var0 + var2 - 1, var1, var3, var4);
   }

   static void hd(int var0, int var1, int var2) {
      if (var0 >= bk && var1 >= bv && var0 < bb && var1 < bx) {
         al[var0 + var1 * aa] = var2;
      }
   }

   public static void ey(int[] var0) {
      bk = var0[0];
      bv = var0[1];
      bb = var0[2];
      bx = var0[3];
   }

   public static void ec() {
      int var0 = 0;

      int var1;
      for(var1 = aa * ah - 7; var0 < var1; al[var0++] = 0) {
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; al[var0++] = 0) {
      }

      eo();
   }

   static void ek(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         eb(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < bv) {
            var4 = bv;
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
            if (var12 < bk) {
               var12 = bk;
            }

            var13 = var0 + var8;
            if (var13 > bb) {
               var13 = bb;
            }

            var14 = var12 + var6 * aa;

            for(var15 = var12; var15 < var13; ++var15) {
               al[var14++] = var3;
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
            if (var12 < bk) {
               var12 = bk;
            }

            var13 = var0 + var8;
            if (var13 > bb - 1) {
               var13 = bb - 1;
            }

            var14 = var12 + var6 * aa;

            for(var15 = var12; var15 <= var13; ++var15) {
               al[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   public static void er(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            ek(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if (var12 < bv) {
               var12 = bv;
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
               if (var20 < bk) {
                  var20 = bk;
               }

               var21 = var0 + var16;
               if (var21 > bb) {
                  var21 = bb;
               }

               var22 = var20 + var14 * aa;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (al[var22] >> 16 & 255) * var5;
                  var10 = (al[var22] >> 8 & 255) * var5;
                  var11 = (al[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  al[var22++] = var24;
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
               if (var20 < bk) {
                  var20 = bk;
               }

               var21 = var0 + var16;
               if (var21 > bb - 1) {
                  var21 = bb - 1;
               }

               var22 = var20 + var14 * aa;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (al[var22] >> 16 & 255) * var5;
                  var10 = (al[var22] >> 8 & 255) * var5;
                  var11 = (al[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  al[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   public static void en(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < bk) {
         var2 -= bk - var0;
         var0 = bk;
      }

      if (var1 < bv) {
         var3 -= bv - var1;
         var1 = bv;
      }

      if (var0 + var2 > bb) {
         var2 = bb - var0;
      }

      if (var1 + var3 > bx) {
         var3 = bx - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = aa - var2;
      int var8 = var0 + var1 * aa;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = al[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
            al[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   public static void ef(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < bk) {
         var2 -= bk - var0;
         var0 = bk;
      }

      if (var1 < bv) {
         var3 -= bv - var1;
         var1 = bv;
      }

      if (var0 + var2 > bb) {
         var2 = bb - var0;
      }

      if (var1 + var3 > bx) {
         var3 = bx - var1;
      }

      int var5 = aa - var2;
      int var6 = var0 + var1 * aa;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            al[var6++] = var4;
         }

         var6 += var5;
      }

   }

   public static void em(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var1 < bv) {
            var6 += (bv - var1) * var7;
            var3 -= bv - var1;
            var1 = bv;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         if (var1 + var3 > bx) {
            var3 = bx - var1;
         }

         int var8 = aa - var2;
         int var9 = var0 + var1 * aa;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               al[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   public static void el(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var1 < bv) {
            var8 += (bv - var1) * var9;
            var3 -= bv - var1;
            var1 = bv;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         if (var1 + var3 > bx) {
            var3 = bx - var1;
         }

         int var10 = aa - var2;
         int var11 = var0 + var1 * aa;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & '\uff00') >>> 8;
            if (var15 == 0) {
               var11 += aa;
               var8 += var9;
            } else {
               int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & '\uff00') * var13 + (var5 & '\uff00') * var14 & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & '\uff00') * var15 >> 8 & '\uff00');

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = al[var11];
                  if (var20 == 0) {
                     al[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & '\uff00') * var17 >> 8 & '\uff00');
                     al[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   public static void ed(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < aa && var1 < ah) {
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

            if (var0 + var2 > aa) {
               var2 = aa - var0;
            }

            if (var1 + var3 > ah) {
               var3 = ah - var1;
            }

            int var11 = var6.length / var7;
            int var12 = aa - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (!var8 || var13 == 255 && var14 == 255) {
               var15 = (var1 + var10) * aa + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        al[var15++] = var5;
                     } else {
                        al[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * aa + var0 + var9;

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
                     int var23 = al[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & '\uff00') * var22 & 16711680) >> 8;
                     al[var15++] = var24;
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static void ep(int var0, int var1, int var2, int var3, int var4) {
      ej(var0, var1, var2, var4);
      ej(var0, var1 + var3 - 1, var2, var4);
      ew(var0, var1, var3, var4);
      ew(var0 + var2 - 1, var1, var3, var4);
   }

   public static void ex(int var0, int var1, int var2, int var3, int var4, int var5) {
      ei(var0, var1, var2, var4, var5);
      ei(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         eu(var0, var1 + 1, var3 - 2, var4, var5);
         eu(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   public static void ej(int var0, int var1, int var2, int var3) {
      if (var1 >= bv && var1 < bx) {
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         int var4 = var0 + var1 * aa;

         for(int var5 = 0; var5 < var2; ++var5) {
            al[var4 + var5] = var3;
         }

      }
   }

   static void ei(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= bv && var1 < bx) {
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * aa;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (al[var12] >> 16 & 255) * var5;
            int var10 = (al[var12] >> 8 & 255) * var5;
            int var11 = (al[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            al[var12++] = var14;
         }

      }
   }

   public static void ew(int var0, int var1, int var2, int var3) {
      if (var0 >= bk && var0 < bb) {
         if (var1 < bv) {
            var2 -= bv - var1;
            var1 = bv;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var4 = var0 + var1 * aa;

         for(int var5 = 0; var5 < var2; ++var5) {
            al[var4 + var5 * aa] = var3;
         }

      }
   }

   public static void gq(int var0, int var1, int var2, int var3) {
      if (var0 >= bk && var0 < bb) {
         if (var1 < bv) {
            var2 -= bv - var1;
            var1 = bv;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var4 = var0 + var1 * aa;

         for(int var5 = 0; var5 < var2; ++var5) {
            al[var4 + var5 * aa] = var3;
         }

      }
   }

   public static void fc(int[] var0) {
      bk = var0[0];
      bv = var0[1];
      bb = var0[2];
      bx = var0[3];
   }

   static void eb(int var0, int var1, int var2) {
      if (var0 >= bk && var1 >= bv && var0 < bb && var1 < bx) {
         al[var0 + var1 * aa] = var2;
      }
   }

   public static void es(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * aa;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            al[var6++] = var2;
         }

         var5 += aa;
      }

   }

   public static void gc(int var0, int var1, int var2, int var3, int var4) {
      ej(var0, var1, var2, var4);
      ej(var0, var1 + var3 - 1, var2, var4);
      ew(var0, var1, var3, var4);
      ew(var0 + var2 - 1, var1, var3, var4);
   }

   public static void eh(int var0, int var1, int var2, int var3) {
      if (bk < var0) {
         bk = var0;
      }

      if (bv < var1) {
         bv = var1;
      }

      if (bb > var2) {
         bb = var2;
      }

      if (bx > var3) {
         bx = var3;
      }

   }

   public static void hc(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            ej(var0, var1, var2 + 1, var4);
         } else {
            ej(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if (var2 == 0) {
         if (var3 >= 0) {
            ew(var0, var1, var3 + 1, var4);
         } else {
            ew(var0, var1 + var3, -var3 + 1, var4);
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
            if (var0 < bk) {
               var1 += var5 * (bk - var0);
               var0 = bk;
            }

            if (var2 >= bb) {
               var2 = bb - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= bv && var6 < bx) {
                  al[var0 + var6 * aa] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += -1280833561;
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if (var1 < bv) {
               var0 += var5 * (bv - var1);
               var1 = bv;
            }

            if (var3 >= bx) {
               var3 = bx - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= bk && var6 < bb) {
                  al[var6 + var1 * aa] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   public static void fb() {
      int var0 = 0;

      int var1;
      for(var1 = aa * ah - 7; var0 < var1; al[var0++] = 0) {
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; al[var0++] = 0) {
      }

      eo();
   }

   public static void gu(int var0, int var1, int var2, int var3) {
      if (var0 >= bk && var0 < bb) {
         if (var1 < bv) {
            var2 -= bv - var1;
            var1 = bv;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var4 = var0 + var1 * aa;

         for(int var5 = 0; var5 < var2; ++var5) {
            al[var4 + var5 * aa] = var3;
         }

      }
   }

   protected vz() {
   }

   public static void fa() {
      bk = 0;
      bv = 0;
      bb = aa;
      bx = ah;
   }

   public static void fl(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > aa) {
         var2 = aa;
      }

      if (var3 > ah) {
         var3 = ah;
      }

      bk = var0;
      bv = var1;
      bb = var2;
      bx = var3;
   }

   public static void fw() {
      bk = 0;
      bv = 0;
      bb = aa;
      bx = ah;
   }

   public static void fp() {
      bk = 0;
      bv = 0;
      bb = aa;
      bx = ah;
   }

   public static void fh(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > aa) {
         var2 = aa;
      }

      if (var3 > ah) {
         var3 = ah;
      }

      bk = var0;
      bv = var1;
      bb = var2;
      bx = var3;
   }

   public static void fv(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > aa) {
         var2 = aa;
      }

      if (var3 > ah) {
         var3 = ah;
      }

      bk = var0;
      bv = var1;
      bb = var2;
      bx = var3;
   }

   public static void gb(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < aa && var1 < ah) {
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

            if (var0 + var2 > aa) {
               var2 = aa - var0;
            }

            if (var1 + var3 > ah) {
               var3 = ah - var1;
            }

            int var11 = var6.length / var7;
            int var12 = aa - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (!var8 || var13 == 255 && var14 == 255) {
               var15 = (var1 + var10) * aa + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        al[var15++] = var5;
                     } else {
                        al[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * aa + var0 + var9;

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
                     int var23 = al[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & '\uff00') * var22 & 16711680) >> 8;
                     al[var15++] = var24;
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   static void ha(int var0, int var1, int var2) {
      if (var0 >= bk && var1 >= bv && var0 < bb && var1 < bx) {
         al[var0 + var1 * aa] = var2;
      }
   }

   public static void fd(int[] var0) {
      var0[0] = bk;
      var0[1] = bv;
      var0[2] = bb;
      var0[3] = bx;
   }

   public static void hq(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            ej(var0, var1, var2 + 1, var4);
         } else {
            ej(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if (var2 == 0) {
         if (var3 >= 0) {
            ew(var0, var1, var3 + 1, var4);
         } else {
            ew(var0, var1 + var3, -var3 + 1, var4);
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
            if (var0 < bk) {
               var1 += var5 * (bk - var0);
               var0 = bk;
            }

            if (var2 >= bb) {
               var2 = bb - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= bv && var6 < bx) {
                  al[var0 + var6 * aa] = var4;
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
            if (var1 < bv) {
               var0 += var5 * (bv - var1);
               var1 = bv;
            }

            if (var3 >= bx) {
               var3 = bx - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= bk && var6 < bb) {
                  al[var6 + var1 * aa] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   public static void fg(int[] var0) {
      bk = var0[0];
      bv = var0[1];
      bb = var0[2];
      bx = var0[3];
   }

   public static void fn(int var0, int var1, int var2, int var3) {
      if (bk < var0) {
         bk = var0;
      }

      if (bv < var1) {
         bv = var1;
      }

      if (bb > var2) {
         bb = var2;
      }

      if (bx > var3) {
         bx = var3;
      }

   }

   public static void hn() {
      if (bh != null) {
         int var0;
         int var1;
         int var2;
         if (bk == 0 && bb == aa && bv == 0 && bx == ah) {
            var0 = bh.length;
            var1 = var0 - (var0 & 7);

            for(var2 = 0; var2 < var1; bh[var2++] = 0.0F) {
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
            }

            while(var2 < var0) {
               bh[var2++] = 0.0F;
            }
         } else {
            var0 = bb - bk;
            var1 = bx - bv;
            var2 = aa - var0;
            int var3 = bk + bv * aa;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for(int var7 = -var1; var7 < 0; ++var7) {
               int var6;
               if (var4 > 0) {
                  var6 = var4;

                  do {
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               if (var5 > 0) {
                  var6 = var5;

                  do {
                     ++var0;
                     bh[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               var0 += var2;
            }
         }

      }
   }

   public static void fr() {
      int var0 = 0;

      int var1;
      for(var1 = aa * ah - 7; var0 < var1; al[var0++] = 0) {
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; al[var0++] = 0) {
      }

      eo();
   }

   public static void fe() {
      int var0 = 0;

      int var1;
      for(var1 = aa * ah - 7; var0 < var1; al[var0++] = 0) {
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; al[var0++] = 0) {
      }

      eo();
   }

   public static void ee() {
      if (bh != null) {
         int var0 = bh.length;

         for(int var1 = 0; var1 < var0; ++var1) {
            if (var1 % aa < aa / 2 && bh[var1] > 0.0F) {
               float var3 = bh[var1];
               float var4 = 75.0F;
               float var5 = 10000.0F;
               float var6 = 750000.0F / (10000.0F - var3 * 9925.0F);
               float var2 = (var6 - 75.0F) / 9925.0F;
               int var7 = (int)(255.0F * var2);
               al[var1] = var7 << 16 | var7 << 8 | var7;
            }
         }

      }
   }

   static void ff(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         eb(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < bv) {
            var4 = bv;
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
            if (var12 < bk) {
               var12 = bk;
            }

            var13 = var0 + var8;
            if (var13 > bb) {
               var13 = bb;
            }

            var14 = var12 + var6 * aa;

            for(var15 = var12; var15 < var13; ++var15) {
               al[var14++] = var3;
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
            if (var12 < bk) {
               var12 = bk;
            }

            var13 = var0 + var8;
            if (var13 > bb - 1) {
               var13 = bb - 1;
            }

            var14 = var12 + var6 * aa;

            for(var15 = var12; var15 <= var13; ++var15) {
               al[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   public static void fx(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            ek(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if (var12 < bv) {
               var12 = bv;
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
               if (var20 < bk) {
                  var20 = bk;
               }

               var21 = var0 + var16;
               if (var21 > bb) {
                  var21 = bb;
               }

               var22 = var20 + var14 * aa;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (al[var22] >> 16 & 255) * var5;
                  var10 = (al[var22] >> 8 & 255) * var5;
                  var11 = (al[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  al[var22++] = var24;
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
               if (var20 < bk) {
                  var20 = bk;
               }

               var21 = var0 + var16;
               if (var21 > bb - 1) {
                  var21 = bb - 1;
               }

               var22 = var20 + var14 * aa;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (al[var22] >> 16 & 255) * var5;
                  var10 = (al[var22] >> 8 & 255) * var5;
                  var11 = (al[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  al[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   public static void fq(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            ek(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & -446155578) * var4;
            int var12 = var1 - var2;
            if (var12 < bv) {
               var12 = bv;
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
               if (var20 < bk) {
                  var20 = bk;
               }

               var21 = var0 + var16;
               if (var21 > bb) {
                  var21 = bb;
               }

               var22 = var20 + var14 * aa;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (al[var22] >> 16 & 255) * var5;
                  var10 = (al[var22] >> 8 & 255) * var5;
                  var11 = (al[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  al[var22++] = var24;
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
               if (var20 < bk) {
                  var20 = bk;
               }

               var21 = var0 + var16;
               if (var21 > bb - 1) {
                  var21 = bb - 1;
               }

               var22 = var20 + var14 * aa;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (al[var22] >> 16 & 255) * var5;
                  var10 = (al[var22] >> 8 & 1174760130) * var5;
                  var11 = (al[var22] & 894757399) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  al[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   public static void fk(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            ek(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if (var12 < bv) {
               var12 = bv;
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
               if (var20 < bk) {
                  var20 = bk;
               }

               var21 = var0 + var16;
               if (var21 > bb) {
                  var21 = bb;
               }

               var22 = var20 + var14 * aa;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (al[var22] >> 16 & 255) * var5;
                  var10 = (al[var22] >> 8 & 255) * var5;
                  var11 = (al[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  al[var22++] = var24;
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
               if (var20 < bk) {
                  var20 = bk;
               }

               var21 = var0 + var16;
               if (var21 > bb - 1) {
                  var21 = bb - 1;
               }

               var22 = var20 + var14 * aa;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (al[var22] >> 16 & 255) * var5;
                  var10 = (al[var22] >> 8 & 255) * var5;
                  var11 = (al[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  al[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   public static void fs(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            ek(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if (var12 < bv) {
               var12 = bv;
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
               if (var20 < bk) {
                  var20 = bk;
               }

               var21 = var0 + var16;
               if (var21 > bb) {
                  var21 = bb;
               }

               var22 = var20 + var14 * aa;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (al[var22] >> 16 & 255) * var5;
                  var10 = (al[var22] >> 8 & 255) * var5;
                  var11 = (al[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  al[var22++] = var24;
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
               if (var20 < bk) {
                  var20 = bk;
               }

               var21 = var0 + var16;
               if (var21 > bb - 1) {
                  var21 = bb - 1;
               }

               var22 = var20 + var14 * aa;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (al[var22] >> 16 & 255) * var5;
                  var10 = (al[var22] >> 8 & 255) * var5;
                  var11 = (al[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  al[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   public static void fz(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < bk) {
         var2 -= bk - var0;
         var0 = bk;
      }

      if (var1 < bv) {
         var3 -= bv - var1;
         var1 = bv;
      }

      if (var0 + var2 > bb) {
         var2 = bb - var0;
      }

      if (var1 + var3 > bx) {
         var3 = bx - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = aa - var2;
      int var8 = var0 + var1 * aa;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = al[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
            al[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   public static void gm(int var0, int var1, int var2, int var3) {
      if (var1 >= bv && var1 < bx) {
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         int var4 = var0 + var1 * aa;

         for(int var5 = 0; var5 < var2; ++var5) {
            al[var4 + var5] = var3;
         }

      }
   }

   public static void fi(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var1 < bv) {
            var6 += (bv - var1) * var7;
            var3 -= bv - var1;
            var1 = bv;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         if (var1 + var3 > bx) {
            var3 = bx - var1;
         }

         int var8 = aa - var2;
         int var9 = var0 + var1 * aa;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               al[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   public static void gp(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var1 < bv) {
            var8 += (bv - var1) * var9;
            var3 -= bv - var1;
            var1 = bv;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         if (var1 + var3 > bx) {
            var3 = bx - var1;
         }

         int var10 = aa - var2;
         int var11 = var0 + var1 * aa;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & '\uff00') >>> 8;
            if (var15 == 0) {
               var11 += aa;
               var8 += var9;
            } else {
               int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & '\uff00') * var13 + (var5 & '\uff00') * var14 & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & '\uff00') * var15 >> 8 & '\uff00');

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = al[var11];
                  if (var20 == 0) {
                     al[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & '\uff00') * var17 >> 8 & '\uff00');
                     al[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   public static void gl(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var1 < bv) {
            var8 += (bv - var1) * var9;
            var3 -= bv - var1;
            var1 = bv;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         if (var1 + var3 > bx) {
            var3 = bx - var1;
         }

         int var10 = aa - var2;
         int var11 = var0 + var1 * aa;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & '\uff00') >>> 8;
            if (var15 == 0) {
               var11 += aa;
               var8 += var9;
            } else {
               int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & '\uff00') * var13 + (var5 & '\uff00') * var14 & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & '\uff00') * var15 >> 8 & '\uff00');

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = al[var11];
                  if (var20 == 0) {
                     al[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & '\uff00') * var17 >> 8 & '\uff00');
                     al[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   public static void fj() {
      bk = 0;
      bv = 0;
      bb = aa;
      bx = ah;
   }

   public static void gn(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < aa && var1 < ah) {
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

            if (var0 + var2 > aa) {
               var2 = aa - var0;
            }

            if (var1 + var3 > ah) {
               var3 = ah - var1;
            }

            int var11 = var6.length / var7;
            int var12 = aa - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var8 && (var13 != 255 || var14 != 157404126)) {
               var15 = (var1 + var10) * aa + var0 + var9;

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
                     int var23 = al[var15];
                     int var24 = ((var20 & 895277113) * var21 + (var23 & 2050982830) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & -1564218103) * var22 & 16711680) >> 8;
                     al[var15++] = var24;
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * aa + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        al[var15++] = var5;
                     } else {
                        al[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static void gd(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < aa && var1 < ah) {
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

            if (var0 + var2 > aa) {
               var2 = aa - var0;
            }

            if (var1 + var3 > ah) {
               var3 = ah - var1;
            }

            int var11 = var6.length / var7;
            int var12 = aa - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var8 && (var13 != 255 || var14 != 255)) {
               var15 = (var1 + var10) * aa + var0 + var9;

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
                     int var23 = al[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & '\uff00') * var22 & 16711680) >> 8;
                     al[var15++] = var24;
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * aa + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        al[var15++] = var5;
                     } else {
                        al[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static void gy(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < aa && var1 < ah) {
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

            if (var0 + var2 > aa) {
               var2 = aa - var0;
            }

            if (var1 + var3 > ah) {
               var3 = ah - var1;
            }

            int var11 = var6.length / var7;
            int var12 = aa - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (!var8 || var13 == 255 && var14 == 255) {
               var15 = (var1 + var10) * aa + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        al[var15++] = var5;
                     } else {
                        al[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * aa + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 281440612 - var21;
                     int var23 = al[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & -294442116) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & -1855192596) * var22 & -954339394) >> 8;
                     al[var15++] = var24;
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   protected static void dn(int[] var0, int var1, int var2, float[] var3) {
      al = var0;
      aa = var1;
      ah = var2;
      bh = var3;
      ev(0, 0, var1, var2);
   }

   public static void ez(int[] var0) {
      var0[0] = bk;
      var0[1] = bv;
      var0[2] = bb;
      var0[3] = bx;
   }

   public static void gf(int var0, int var1, int var2, int var3, int var4, int var5) {
      ei(var0, var1, var2, var4, var5);
      ei(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         eu(var0, var1 + 1, var3 - 2, var4, var5);
         eu(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   public static void gv(int var0, int var1, int var2, int var3, int var4, int var5) {
      ei(var0, var1, var2, var4, var5);
      ei(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         eu(var0, var1 + 1, var3 - 2, var4, var5);
         eu(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   public static void gg(int var0, int var1, int var2, int var3, int var4, int var5) {
      ei(var0, var1, var2, var4, var5);
      ei(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         eu(var0, var1 + 1, var3 - 2, var4, var5);
         eu(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   public static void gh(int var0, int var1, int var2, int var3) {
      if (var1 >= bv && var1 < bx) {
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         int var4 = var0 + var1 * aa;

         for(int var5 = 0; var5 < var2; ++var5) {
            al[var4 + var5] = var3;
         }

      }
   }

   public static void gx(int var0, int var1, int var2, int var3) {
      if (var1 >= bv && var1 < bx) {
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         int var4 = var0 + var1 * aa;

         for(int var5 = 0; var5 < var2; ++var5) {
            al[var4 + var5] = var3;
         }

      }
   }

   public static void eq(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            ej(var0, var1, var2 + 1, var4);
         } else {
            ej(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if (var2 == 0) {
         if (var3 >= 0) {
            ew(var0, var1, var3 + 1, var4);
         } else {
            ew(var0, var1 + var3, -var3 + 1, var4);
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
            if (var0 < bk) {
               var1 += var5 * (bk - var0);
               var0 = bk;
            }

            if (var2 >= bb) {
               var2 = bb - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= bv && var6 < bx) {
                  al[var0 + var6 * aa] = var4;
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
            if (var1 < bv) {
               var0 += var5 * (bv - var1);
               var1 = bv;
            }

            if (var3 >= bx) {
               var3 = bx - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= bk && var6 < bb) {
                  al[var6 + var1 * aa] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   public static void gr(int var0, int var1, int var2, int var3) {
      if (var1 >= bv && var1 < bx) {
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         int var4 = var0 + var1 * aa;

         for(int var5 = 0; var5 < var2; ++var5) {
            al[var4 + var5] = var3;
         }

      }
   }

   public static void gw(int var0, int var1, int var2, int var3) {
      if (var1 >= bv && var1 < bx) {
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         int var4 = var0 + var1 * aa;

         for(int var5 = 0; var5 < var2; ++var5) {
            al[var4 + var5] = var3;
         }

      }
   }

   static void go(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= bv && var1 < bx) {
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * aa;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (al[var12] >> 16 & 255) * var5;
            int var10 = (al[var12] >> 8 & 255) * var5;
            int var11 = (al[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            al[var12++] = var14;
         }

      }
   }

   public static void fm(int[] var0) {
      bk = var0[0];
      bv = var0[1];
      bb = var0[2];
      bx = var0[3];
   }

   static void gz(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= bv && var1 < bx) {
         if (var0 < bk) {
            var2 -= bk - var0;
            var0 = bk;
         }

         if (var0 + var2 > bb) {
            var2 = bb - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * aa;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (al[var12] >> 16 & 255) * var5;
            int var10 = (al[var12] >> 8 & 255) * var5;
            int var11 = (al[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            al[var12++] = var14;
         }

      }
   }

   static void eu(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= bk && var0 < bb) {
         if (var1 < bv) {
            var2 -= bv - var1;
            var1 = bv;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * aa;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (al[var12] >> 16 & 255) * var5;
            int var10 = (al[var12] >> 8 & 255) * var5;
            int var11 = (al[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            al[var12] = var14;
            var12 += aa;
         }

      }
   }

   protected static void ea(int[] var0, int var1, int var2, float[] var3) {
      al = var0;
      aa = var1;
      ah = var2;
      bh = var3;
      ev(0, 0, var1, var2);
   }

   public static void gt(int var0, int var1, int var2, int var3) {
      if (var0 >= bk && var0 < bb) {
         if (var1 < bv) {
            var2 -= bv - var1;
            var1 = bv;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var4 = var0 + var1 * aa;

         for(int var5 = 0; var5 < var2; ++var5) {
            al[var4 + var5 * aa] = var3;
         }

      }
   }

   static void gs(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= bk && var0 < bb) {
         if (var1 < bv) {
            var2 -= bv - var1;
            var1 = bv;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var5 = 2114070139 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & -339423584) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * aa;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (al[var12] >> 16 & -1104334885) * var5;
            int var10 = (al[var12] >> 8 & 2104443433) * var5;
            int var11 = (al[var12] & -204348253) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            al[var12] = var14;
            var12 += aa;
         }

      }
   }

   static void ge(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= bk && var0 < bb) {
         if (var1 < bv) {
            var2 -= bv - var1;
            var1 = bv;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 703783199) * var4;
         int var8 = (var3 & -931723616) * var4;
         int var12 = var0 + var1 * aa;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (al[var12] >> 16 & -1048034126) * var5;
            int var10 = (al[var12] >> 8 & 255) * var5;
            int var11 = (al[var12] & -1427838858) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            al[var12] = var14;
            var12 += aa;
         }

      }
   }

   public static void eo() {
      if (bh != null) {
         int var0;
         int var1;
         int var2;
         if (bk == 0 && bb == aa && bv == 0 && bx == ah) {
            var0 = bh.length;
            var1 = var0 - (var0 & 7);

            for(var2 = 0; var2 < var1; bh[var2++] = 0.0F) {
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
            }

            while(var2 < var0) {
               bh[var2++] = 0.0F;
            }
         } else {
            var0 = bb - bk;
            var1 = bx - bv;
            var2 = aa - var0;
            int var3 = bk + bv * aa;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for(int var7 = -var1; var7 < 0; ++var7) {
               int var6;
               if (var4 > 0) {
                  var6 = var4;

                  do {
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               if (var5 > 0) {
                  var6 = var5;

                  do {
                     ++var0;
                     bh[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               var0 += var2;
            }
         }

      }
   }

   public static void hr(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            ej(var0, var1, var2 + 1, var4);
         } else {
            ej(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if (var2 == 0) {
         if (var3 >= 0) {
            ew(var0, var1, var3 + 1, var4);
         } else {
            ew(var0, var1 + var3, -var3 + 1, var4);
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
            if (var0 < bk) {
               var1 += var5 * (bk - var0);
               var0 = bk;
            }

            if (var2 >= bb) {
               var2 = bb - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= bv && var6 < bx) {
                  al[var0 + var6 * aa] = var4;
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
            if (var1 < bv) {
               var0 += var5 * (bv - var1);
               var1 = bv;
            }

            if (var3 >= bx) {
               var3 = bx - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= bk && var6 < bb) {
                  al[var6 + var1 * aa] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   public static void ft() {
      int var0 = 0;

      int var1;
      for(var1 = aa * ah - 7; var0 < var1; al[var0++] = 0) {
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
         al[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; al[var0++] = 0) {
      }

      eo();
   }

   protected static void fo(int[] var0, int var1, int var2, float[] var3) {
      al = var0;
      aa = var1;
      ah = var2;
      bh = var3;
      ev(0, 0, var1, var2);
   }

   static void hu(int var0, int var1, int var2) {
      if (var0 >= bk && var1 >= bv && var0 < bb && var1 < bx) {
         al[var0 + var1 * aa] = var2;
      }
   }

   public static void fy(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < bk) {
         var2 -= bk - var0;
         var0 = bk;
      }

      if (var1 < bv) {
         var3 -= bv - var1;
         var1 = bv;
      }

      if (var0 + var2 > bb) {
         var2 = bb - var0;
      }

      if (var1 + var3 > bx) {
         var3 = bx - var1;
      }

      int var5 = aa - var2;
      int var6 = var0 + var1 * aa;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            al[var6++] = var4;
         }

         var6 += var5;
      }

   }

   static void ho(int var0, int var1, int var2) {
      if (var0 >= bk && var1 >= bv && var0 < bb && var1 < bx) {
         al[var0 + var1 * aa] = var2;
      }
   }

   protected static void fu(int[] var0, int var1, int var2, float[] var3) {
      al = var0;
      aa = var1;
      ah = var2;
      bh = var3;
      ev(0, 0, var1, var2);
   }

   public static void he(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * aa;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            al[var6++] = var2;
         }

         var5 += aa;
      }

   }

   public static void ht(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * aa;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            al[var6++] = var2;
         }

         var5 += aa;
      }

   }

   public static void hf(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * aa;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            al[var6++] = var2;
         }

         var5 += aa;
      }

   }

   public static void hi() {
      if (bh != null) {
         int var0;
         int var1;
         int var2;
         if (bk == 0 && bb == aa && bv == 0 && bx == ah) {
            var0 = bh.length;
            var1 = var0 - (var0 & 7);

            for(var2 = 0; var2 < var1; bh[var2++] = 0.0F) {
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
               bh[var2++] = 0.0F;
            }

            while(var2 < var0) {
               bh[var2++] = 0.0F;
            }
         } else {
            var0 = bb - bk;
            var1 = bx - bv;
            var2 = aa - var0;
            int var3 = bk + bv * aa;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for(int var7 = -var1; var7 < 0; ++var7) {
               int var6;
               if (var4 > 0) {
                  var6 = var4;

                  do {
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     ++var0;
                     bh[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               if (var5 > 0) {
                  var6 = var5;

                  do {
                     ++var0;
                     bh[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               var0 += var2;
            }
         }

      }
   }

   static void gk(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= bk && var0 < bb) {
         if (var1 < bv) {
            var2 -= bv - var1;
            var1 = bv;
         }

         if (var1 + var2 > bx) {
            var2 = bx - var1;
         }

         int var5 = -1344610355 - var4;
         int var6 = (var3 >> 16 & -1582331772) * var4;
         int var7 = (var3 >> 8 & 740121941) * var4;
         int var8 = (var3 & -916403699) * var4;
         int var12 = var0 + var1 * aa;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (al[var12] >> 16 & -966077369) * var5;
            int var10 = (al[var12] >> 8 & 255) * var5;
            int var11 = (al[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            al[var12] = var14;
            var12 += aa;
         }

      }
   }

   public static void hy() {
      if (bh != null) {
         int var0 = bh.length;

         for(int var1 = 0; var1 < var0; ++var1) {
            if (var1 % aa < aa / 2 && bh[var1] > 0.0F) {
               float var3 = bh[var1];
               float var4 = 75.0F;
               float var5 = 10000.0F;
               float var6 = 750000.0F / (10000.0F - var3 * 9925.0F);
               float var2 = (var6 - 75.0F) / 9925.0F;
               int var7 = (int)(255.0F * var2);
               al[var1] = var7 << 16 | var7 << 8 | var7;
            }
         }

      }
   }
}
