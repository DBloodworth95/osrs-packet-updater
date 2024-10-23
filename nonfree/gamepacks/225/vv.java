public final class vv extends vr {
   static final int ar = 8;
   int ax;
   public int ag;
   public int am;
   public int[] ac;
   public int aq;
   public int af;
   static final int at = 4;
   static final int au = 15;
   public int ae;
   static final int al = 12;
   static final int ad = 4095;

   public void av(int var1, int var2, int var3) {
      var1 += this.am;
      var2 += this.ax;
      int var4 = var1 + var2 * an;
      int var5 = 0;
      int var6 = this.ag;
      int var7 = this.ae;
      int var8 = an - var7;
      int var9 = 0;
      int var10;
      if (var2 < bd) {
         var10 = bd - var2;
         var6 -= var10;
         var2 = bd;
         var5 += var10 * var7;
         var4 += var10 * an;
      }

      if (var2 + var6 > bx) {
         var6 -= var2 + var6 - bx;
      }

      if (var1 < bf) {
         var10 = bf - var1;
         var7 -= var10;
         var1 = bf;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var1 + var7 > bm) {
         var10 = var1 + var7 - bm;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         if (var3 == 256) {
            aw(0, 0, 0, aw, this.ac, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            an(0, 0, 0, aw, this.ac, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }

      }
   }

   static void cs(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void ah(int var1, int var2) {
      var1 += this.am;
      var2 += this.ax;
      int var3 = var1 + var2 * an;
      int var4 = 0;
      int var5 = this.ag;
      int var6 = this.ae;
      int var7 = an - var6;
      int var8 = 0;
      int var9;
      if (var2 < bd) {
         var9 = bd - var2;
         var5 -= var9;
         var2 = bd;
         var4 += var9 * var6;
         var3 += var9 * an;
      }

      if (var2 + var5 > bx) {
         var5 -= var2 + var5 - bx;
      }

      if (var1 < bf) {
         var9 = bf - var1;
         var6 -= var9;
         var1 = bf;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bm) {
         var9 = var1 + var6 - bm;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         ap(aw, this.ac, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   public vv ac() {
      vv var1 = new vv(this.ae, this.ag);
      var1.aq = this.aq;
      var1.af = this.af;
      var1.am = this.aq - this.ae - this.am;
      var1.ax = this.ax;

      for(int var2 = 0; var2 < this.ag; ++var2) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            var1.ac[var2 * this.ae + var3] = this.ac[var2 * this.ae + this.ae - 1 - var3];
         }
      }

      return var1;
   }

   public void ef(int var1, int var2, int var3, int var4) {
      if (var3 <= this.aq && var4 <= this.af) {
         int var5 = var1 + this.am * var3 / this.aq;
         int var6 = var1 + ((this.am + this.ae) * var3 + this.aq - 1) / this.aq;
         int var7 = var2 + this.ax * var4 / this.af;
         int var8 = var2 + ((this.ax + this.ag) * var4 + this.af - 1) / this.af;
         if (var5 < bf) {
            var5 = bf;
         }

         if (var6 > bm) {
            var6 = bm;
         }

         if (var7 < bd) {
            var7 = bd;
         }

         if (var8 > bx) {
            var8 = bx;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * an + var5;
            int var10 = an - (var6 - var5);
            if (var9 < aw.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.aq / var3 - (this.am << 4);
                     int var16 = (var13 + 16) * this.aq / var3 - (this.am << 4);
                     int var17 = var14 * this.af / var4 - (this.ax << 4);
                     int var18 = (var14 + 16) * this.af / var4 - (this.ax << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.ae << 4) {
                           var16 = this.ae << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.ag << 4) {
                           var18 = this.ag << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.ac[var28 * this.ae + var30];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 255) * var32;
                                 var25 += (var31 >> 8 & 255) * var32;
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if (var28 == 0) {
                              var28 = 1;
                           }

                           aw[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void du(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * an;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.ac[(var18 >> 16) + (var19 >> 16) * this.ae];
               if (var20 != 0) {
                  aw[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += an;
         }
      } catch (Exception var21) {
      }

   }

   public void am() {
      ej(this.ac, this.ae, this.ag, (float[])null);
   }

   static void dj(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = -68808113 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = (var4 >> 16) * var11;

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & 984323681) + ((var2 & '\uff00') * var12 + (var18 & 626726245) * var13 & 16711680) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }

   public void aq(int var1) {
      if (this.ae != this.aq || this.ag != this.af) {
         int var2 = var1;
         if (var1 > this.am) {
            var2 = this.am;
         }

         int var3 = var1;
         if (var1 + this.am + this.ae > this.aq) {
            var3 = this.aq - this.am - this.ae;
         }

         int var4 = var1;
         if (var1 > this.ax) {
            var4 = this.ax;
         }

         int var5 = var1;
         if (var1 + this.ax + this.ag > this.af) {
            var5 = this.af - this.ax - this.ag;
         }

         int var6 = this.ae + var2 + var3;
         int var7 = this.ag + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.ag; ++var9) {
            for(int var10 = 0; var10 < this.ae; ++var10) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.ac[var9 * this.ae + var10];
            }
         }

         this.ac = var8;
         this.ae = var6;
         this.ag = var7;
         this.am -= var2;
         this.ax -= var4;
      }
   }

   public void af() {
      int[] var1 = new int[this.ae * this.ag];
      int var2 = 0;

      for(int var3 = 0; var3 < this.ag; ++var3) {
         for(int var4 = this.ae - 1; var4 >= 0; --var4) {
            var1[var2++] = this.ac[var4 + var3 * this.ae];
         }
      }

      this.ac = var1;
      this.am = this.aq - this.ae - this.am;
   }

   public void ax() {
      if (this.ae != this.aq || this.ag != this.af) {
         int[] var1 = new int[this.aq * this.af];

         for(int var2 = 0; var2 < this.ag; ++var2) {
            for(int var3 = 0; var3 < this.ae; ++var3) {
               var1[(var2 + this.ax) * this.aq + var3 + this.am] = this.ac[var2 * this.ae + var3];
            }
         }

         this.ac = var1;
         this.ae = this.aq;
         this.ag = this.af;
         this.am = 0;
         this.ax = 0;
      }
   }

   public void ci() {
      int[] var1 = new int[this.ae * this.ag];
      int var2 = 0;

      for(int var3 = this.ag - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.ae; ++var4) {
            var1[var2++] = this.ac[var4 + var3 * this.ae];
         }
      }

      this.ac = var1;
      this.ax = this.af - this.ag - this.ax;
   }

   public void au(int var1) {
      int[] var2 = new int[this.ae * this.ag];
      int var3 = 0;

      for(int var4 = 0; var4 < this.ag; ++var4) {
         for(int var5 = 0; var5 < this.ae; ++var5) {
            int var6 = this.ac[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.ac[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.ac[var3 - this.ae] != 0) {
                  var6 = var1;
               } else if (var5 < this.ae - 1 && this.ac[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.ag - 1 && this.ac[var3 + this.ae] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.ac = var2;
   }

   static void dm(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var13;
               var0 = (var1 & -16711936) + (var0 * var13 - var1 & 16711680) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   public void bc() {
      int[] var1 = new int[this.ae * this.ag];
      int var2 = 0;

      for(int var3 = 0; var3 < this.ag; ++var3) {
         for(int var4 = this.ae - 1; var4 >= 0; --var4) {
            var1[var2++] = this.ac[var4 + var3 * this.ae];
         }
      }

      this.ac = var1;
      this.am = this.aq - this.ae - this.am;
   }

   static void cp(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if (var2 != 0) {
               var0[var5++] = var2;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   static void cw(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
         }

         var3 += var6;
         var2 += var7;
      }

   }

   public void bf(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * an;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.ac[(var18 >> 16) + (var19 >> 16) * this.ae];
               if (var20 != 0) {
                  aw[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += an;
         }
      } catch (Exception var21) {
      }

   }

   static void az(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if (var2 != 0) {
               var0[var5++] = var2;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   public vv ag() {
      vv var1 = new vv(this.aq, this.af);

      for(int var2 = 0; var2 < this.ag; ++var2) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            var1.ac[(var2 + this.ax) * this.aq + var3 + this.am] = this.ac[var2 * this.ae + var3];
         }
      }

      return var1;
   }

   public vv by() {
      vv var1 = new vv(this.ae, this.ag);
      var1.aq = this.aq;
      var1.af = this.af;
      var1.am = this.am;
      var1.ax = this.ax;
      int var2 = this.ac.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.ac[var3] = this.ac[var3];
      }

      return var1;
   }

   public vv(int var1, int var2) {
      this(new int[var1 * var2], var1, var2);
   }

   static void as(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void ay(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.ae;
         int var7 = this.ag;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.aq;
         int var11 = this.af;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.am > 0) {
            var14 = ((this.am << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.am << 16);
         }

         if (this.ax > 0) {
            var14 = ((this.ax << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.ax << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * an;
         int var15 = an - var3;
         if (var2 + var4 > bx) {
            var4 -= var2 + var4 - bx;
         }

         int var16;
         if (var2 < bd) {
            var16 = bd - var2;
            var4 -= var16;
            var14 += var16 * an;
            var9 += var13 * var16;
         }

         if (var1 + var3 > bm) {
            var16 = var1 + var3 - bm;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < bf) {
            var16 = bf - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         aj(aw, this.ac, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   static void aj(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = (var4 >> 16) * var11;

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var18 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }

   static void ap(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void bq(int var1) {
      if (this.ae != this.aq || this.ag != this.af) {
         int var2 = var1;
         if (var1 > this.am) {
            var2 = this.am;
         }

         int var3 = var1;
         if (var1 + this.am + this.ae > this.aq) {
            var3 = this.aq - this.am - this.ae;
         }

         int var4 = var1;
         if (var1 > this.ax) {
            var4 = this.ax;
         }

         int var5 = var1;
         if (var1 + this.ax + this.ag > this.af) {
            var5 = this.af - this.ax - this.ag;
         }

         int var6 = this.ae + var2 + var3;
         int var7 = this.ag + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.ag; ++var9) {
            for(int var10 = 0; var10 < this.ae; ++var10) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.ac[var9 * this.ae + var10];
            }
         }

         this.ac = var8;
         this.ae = var6;
         this.ag = var7;
         this.am -= var2;
         this.ax -= var4;
      }
   }

   static void an(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var13;
               var0 = (var1 & -16711936) + (var0 * var13 - var1 & 16711680) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   public void ak(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.ae;
         int var7 = this.ag;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.aq;
         int var11 = this.af;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.am > 0) {
            var14 = ((this.am << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.am << 16);
         }

         if (this.ax > 0) {
            var14 = ((this.ax << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.ax << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * an;
         int var15 = an - var3;
         if (var2 + var4 > bx) {
            var4 -= var2 + var4 - bx;
         }

         int var16;
         if (var2 < bd) {
            var16 = bd - var2;
            var4 -= var16;
            var14 += var16 * an;
            var9 += var13 * var16;
         }

         if (var1 + var3 > bm) {
            var16 = var1 + var3 - bm;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < bf) {
            var16 = bf - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if (var5 == 256) {
            bn(0, 0, 0, var8, this.ac, aw, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            bh(0, 0, 0, var8, this.ac, aw, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   static void bn(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   static void bh(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }

   public void bd(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.ag <= var6 ? this.ag : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      int var10000;
      if (var1 + this.ae <= var5) {
         var10000 = this.ae;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * an;
      int var14 = var2 + var9;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (var1 + this.ae <= var16 + var17) {
            var12 = this.ae;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.ac[var20 + var15 * this.ae];
            if (var21 != 0) {
               aw[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += an;
      }

   }

   static void da(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }

   void ea(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.am << 4;
         var2 -= this.ax << 4;
         double var7 = (double)(var5 & '\uffff') * 9.587379924285257E-5D;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.ae << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.ae << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.ag << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.ag << 4) - var2) * var10;
         int var17 = ((this.ae << 4) - var1) * var10 + ((this.ag << 4) - var2) * var9;
         int var18 = -((this.ae << 4) - var1) * var9 + ((this.ag << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 1267991912 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < bf) {
            var19 = bf;
         }

         if (var20 > bm) {
            var20 = bm;
         }

         if (var21 < bd) {
            var21 = bd;
         }

         if (var22 > bx) {
            var22 = bx;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * an + var19;
               double var24 = 1.6777216E7D / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if (var27 == 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.ae << 12) < 0 && var31 - (this.ag << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }
                           }
                        }

                        ++var33;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.ae << 12) < 0) {
                           if ((var32 = var36 - (this.ag << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.ae << 12) < 0) {
                           if (var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31;
                        var37 = var20;
                        if (var31 >= 0 && var31 - (this.ag << 12) < 0) {
                           if ((var32 = var35 - (this.ae << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.ae << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if ((var32 = var36 - (this.ag << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.ae << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if (var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31;
                     var37 = var20;
                     if (var31 >= 0 && var31 - (this.ag << 12) < 0) {
                        if (var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if ((var32 = var36 - (this.ag << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                        if (var38 != 0) {
                           aw[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if (var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                        if (var38 != 0) {
                           aw[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   public void ao(int var1, int var2, int var3) {
      var1 += this.am;
      var2 += this.ax;
      int var4 = var1 + var2 * an;
      int var5 = 0;
      int var6 = this.ag;
      int var7 = this.ae;
      int var8 = an - var7;
      int var9 = 0;
      int var10;
      if (var2 < bd) {
         var10 = bd - var2;
         var6 -= var10;
         var2 = bd;
         var5 += var10 * var7;
         var4 += var10 * an;
      }

      if (var2 + var6 > bx) {
         var6 -= var2 + var6 - bx;
      }

      if (var1 < bf) {
         var10 = bf - var1;
         var7 -= var10;
         var1 = bf;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var1 + var7 > bm) {
         var10 = var1 + var7 - bm;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         as(aw, this.ac, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   void bs(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.am << 4;
         var2 -= this.ax << 4;
         double var7 = (double)(var5 & '\uffff') * 9.587379924285257E-5D;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.ae << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.ae << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.ag << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.ag << 4) - var2) * var10;
         int var17 = ((this.ae << 4) - var1) * var10 + ((this.ag << 4) - var2) * var9;
         int var18 = -((this.ae << 4) - var1) * var9 + ((this.ag << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < bf) {
            var19 = bf;
         }

         if (var20 > bm) {
            var20 = bm;
         }

         if (var21 < bd) {
            var21 = bd;
         }

         if (var22 > bx) {
            var22 = bx;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * an + var19;
               double var24 = 1.6777216E7D / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if (var27 == 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.ae << 12) < 0 && var31 - (this.ag << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }
                           }
                        }

                        ++var33;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.ae << 12) < 0) {
                           if ((var32 = var36 - (this.ag << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.ae << 12) < 0) {
                           if (var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31;
                        var37 = var20;
                        if (var31 >= 0 && var31 - (this.ag << 12) < 0) {
                           if ((var32 = var35 - (this.ae << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.ae << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if ((var32 = var36 - (this.ag << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.ae << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if (var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31;
                     var37 = var20;
                     if (var31 >= 0 && var31 - (this.ag << 12) < 0) {
                        if (var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if ((var32 = var36 - (this.ag << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                        if (var38 != 0) {
                           aw[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if (var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                        if (var38 != 0) {
                           aw[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   public void bw(int var1, int var2, int var3, int var4) {
      if (var3 <= this.aq && var4 <= this.af) {
         int var5 = var1 + this.am * var3 / this.aq;
         int var6 = var1 + ((this.am + this.ae) * var3 + this.aq - 1) / this.aq;
         int var7 = var2 + this.ax * var4 / this.af;
         int var8 = var2 + ((this.ax + this.ag) * var4 + this.af - 1) / this.af;
         if (var5 < bf) {
            var5 = bf;
         }

         if (var6 > bm) {
            var6 = bm;
         }

         if (var7 < bd) {
            var7 = bd;
         }

         if (var8 > bx) {
            var8 = bx;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * an + var5;
            int var10 = an - (var6 - var5);
            if (var9 < aw.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.aq / var3 - (this.am << 4);
                     int var16 = (var13 + 16) * this.aq / var3 - (this.am << 4);
                     int var17 = var14 * this.af / var4 - (this.ax << 4);
                     int var18 = (var14 + 16) * this.af / var4 - (this.ax << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.ae << 4) {
                           var16 = this.ae << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.ag << 4) {
                           var18 = this.ag << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.ac[var28 * this.ae + var30];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 255) * var32;
                                 var25 += (var31 >> 8 & 255) * var32;
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if (var28 == 0) {
                              var28 = 1;
                           }

                           aw[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public vv ba() {
      vv var1 = new vv(this.ae, this.ag);
      var1.aq = this.aq;
      var1.af = this.af;
      var1.am = this.aq - this.ae - this.am;
      var1.ax = this.ax;

      for(int var2 = 0; var2 < this.ag; ++var2) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            var1.ac[var2 * this.ae + var3] = this.ac[var2 * this.ae + this.ae - 1 - var3];
         }
      }

      return var1;
   }

   public vv bj() {
      vv var1 = new vv(this.ae, this.ag);
      var1.aq = this.aq;
      var1.af = this.af;
      var1.am = this.aq - this.ae - this.am;
      var1.ax = this.ax;

      for(int var2 = 0; var2 < this.ag; ++var2) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            var1.ac[var2 * this.ae + var3] = this.ac[var2 * this.ae + this.ae - 1 - var3];
         }
      }

      return var1;
   }

   public vv bp() {
      vv var1 = new vv(this.ae, this.ag);
      var1.aq = this.aq;
      var1.af = this.af;
      var1.am = this.aq - this.ae - this.am;
      var1.ax = this.ax;

      for(int var2 = 0; var2 < this.ag; ++var2) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            var1.ac[var2 * this.ae + var3] = this.ac[var2 * this.ae + this.ae - 1 - var3];
         }
      }

      return var1;
   }

   static void di(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 904202863) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   public vv bb() {
      vv var1 = new vv(this.ae, this.ag);
      var1.aq = this.aq;
      var1.af = this.af;
      var1.am = this.am;
      var1.ax = this.ax;
      int var2 = this.ac.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.ac[var3] = this.ac[var3];
      }

      return var1;
   }

   public void bm(int var1, int var2, int var3, int var4) {
      this.bs(this.aq << 3, this.af << 3, var1 << 4, var2 << 4, var3, var4);
   }

   public void br() {
      ej(this.ac, this.ae, this.ag, (float[])null);
   }

   public vv bl() {
      vv var1 = new vv(this.aq, this.af);

      for(int var2 = 0; var2 < this.ag; ++var2) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            var1.ac[(var2 + this.ax) * this.aq + var3 + this.am] = this.ac[var2 * this.ae + var3];
         }
      }

      return var1;
   }

   public vv bz() {
      vv var1 = new vv(this.aq, this.af);

      for(int var2 = 0; var2 < this.ag; ++var2) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            var1.ac[(var2 + this.ax) * this.aq + var3 + this.am] = this.ac[var2 * this.ae + var3];
         }
      }

      return var1;
   }

   public void bu() {
      ej(this.ac, this.ae, this.ag, (float[])null);
   }

   public void de(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.ae;
         int var7 = this.ag;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.aq;
         int var11 = this.af;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.am > 0) {
            var14 = ((this.am << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.am << 16);
         }

         if (this.ax > 0) {
            var14 = ((this.ax << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.ax << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * an;
         int var15 = an - var3;
         if (var2 + var4 > bx) {
            var4 -= var2 + var4 - bx;
         }

         int var16;
         if (var2 < bd) {
            var16 = bd - var2;
            var4 -= var16;
            var14 += var16 * an;
            var9 += var13 * var16;
         }

         if (var1 + var3 > bm) {
            var16 = var1 + var3 - bm;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < bf) {
            var16 = bf - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         aj(aw, this.ac, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   public void ab(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.ae;
         int var6 = this.ag;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.aq;
         int var10 = this.af;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if (this.am > 0) {
            var13 = ((this.am << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.am << 16);
         }

         if (this.ax > 0) {
            var13 = ((this.ax << 16) + var12 - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.ax << 16);
         }

         if (var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
         }

         if (var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         var13 = var1 + var2 * an;
         int var14 = an - var3;
         if (var2 + var4 > bx) {
            var4 -= var2 + var4 - bx;
         }

         int var15;
         if (var2 < bd) {
            var15 = bd - var2;
            var4 -= var15;
            var13 += var15 * an;
            var8 += var12 * var15;
         }

         if (var1 + var3 > bm) {
            var15 = var1 + var3 - bm;
            var3 -= var15;
            var14 += var15;
         }

         if (var1 < bf) {
            var15 = bf - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
         }

         az(aw, this.ac, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   public void bv() {
      if (this.ae != this.aq || this.ag != this.af) {
         int[] var1 = new int[this.aq * this.af];

         for(int var2 = 0; var2 < this.ag; ++var2) {
            for(int var3 = 0; var3 < this.ae; ++var3) {
               var1[(var2 + this.ax) * this.aq + var3 + this.am] = this.ac[var2 * this.ae + var3];
            }
         }

         this.ac = var1;
         this.ae = this.aq;
         this.ag = this.af;
         this.am = 0;
         this.ax = 0;
      }
   }

   public vv ae() {
      vv var1 = new vv(this.ae, this.ag);
      var1.aq = this.aq;
      var1.af = this.af;
      var1.am = this.am;
      var1.ax = this.ax;
      int var2 = this.ac.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.ac[var3] = this.ac[var3];
      }

      return var1;
   }

   public void dk(int var1, int var2, int var3) {
      var1 += this.am;
      var2 += this.ax;
      int var4 = var1 + var2 * an;
      int var5 = 0;
      int var6 = this.ag;
      int var7 = this.ae;
      int var8 = an - var7;
      int var9 = 0;
      int var10;
      if (var2 < bd) {
         var10 = bd - var2;
         var6 -= var10;
         var2 = bd;
         var5 += var10 * var7;
         var4 += var10 * an;
      }

      if (var2 + var6 > bx) {
         var6 -= var2 + var6 - bx;
      }

      if (var1 < bf) {
         var10 = bf - var1;
         var7 -= var10;
         var1 = bf;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var1 + var7 > bm) {
         var10 = var1 + var7 - bm;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         as(aw, this.ac, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   public void bk(int var1) {
      if (this.ae != this.aq || this.ag != this.af) {
         int var2 = var1;
         if (var1 > this.am) {
            var2 = this.am;
         }

         int var3 = var1;
         if (var1 + this.am + this.ae > this.aq) {
            var3 = this.aq - this.am - this.ae;
         }

         int var4 = var1;
         if (var1 > this.ax) {
            var4 = this.ax;
         }

         int var5 = var1;
         if (var1 + this.ax + this.ag > this.af) {
            var5 = this.af - this.ax - this.ag;
         }

         int var6 = this.ae + var2 + var3;
         int var7 = this.ag + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.ag; ++var9) {
            for(int var10 = 0; var10 < this.ae; ++var10) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.ac[var9 * this.ae + var10];
            }
         }

         this.ac = var8;
         this.ae = var6;
         this.ag = var7;
         this.am -= var2;
         this.ax -= var4;
      }
   }

   public void be() {
      int[] var1 = new int[this.ae * this.ag];
      int var2 = 0;

      for(int var3 = 0; var3 < this.ag; ++var3) {
         for(int var4 = this.ae - 1; var4 >= 0; --var4) {
            var1[var2++] = this.ac[var4 + var3 * this.ae];
         }
      }

      this.ac = var1;
      this.am = this.aq - this.ae - this.am;
   }

   public void dn(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * an;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.ac[(var18 >> 16) + (var19 >> 16) * this.ae];
               if (var20 != 0) {
                  aw[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += an;
         }
      } catch (Exception var21) {
      }

   }

   public void cn() {
      int[] var1 = new int[this.ae * this.ag];
      int var2 = 0;

      for(int var3 = 0; var3 < this.ag; ++var3) {
         for(int var4 = this.ae - 1; var4 >= 0; --var4) {
            var1[var2++] = this.ac[var4 + var3 * this.ae];
         }
      }

      this.ac = var1;
      this.am = this.aq - this.ae - this.am;
   }

   public void ch() {
      int[] var1 = new int[this.ae * this.ag];
      int var2 = 0;

      for(int var3 = 0; var3 < this.ag; ++var3) {
         for(int var4 = this.ae - 1; var4 >= 0; --var4) {
            var1[var2++] = this.ac[var4 + var3 * this.ae];
         }
      }

      this.ac = var1;
      this.am = this.aq - this.ae - this.am;
   }

   public void cf() {
      int[] var1 = new int[this.ae * this.ag];
      int var2 = 0;

      for(int var3 = 0; var3 < this.ag; ++var3) {
         for(int var4 = this.ae - 1; var4 >= 0; --var4) {
            var1[var2++] = this.ac[var4 + var3 * this.ae];
         }
      }

      this.ac = var1;
      this.am = this.aq - this.ae - this.am;
   }

   public void cu() {
      int[] var1 = new int[this.ae * this.ag];
      int var2 = 0;

      for(int var3 = this.ag - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.ae; ++var4) {
            var1[var2++] = this.ac[var4 + var3 * this.ae];
         }
      }

      this.ac = var1;
      this.ax = this.af - this.ag - this.ax;
   }

   public void cm() {
      int[] var1 = new int[this.ae * this.ag];
      int var2 = 0;

      for(int var3 = this.ag - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.ae; ++var4) {
            var1[var2++] = this.ac[var4 + var3 * this.ae];
         }
      }

      this.ac = var1;
      this.ax = this.af - this.ag - this.ax;
   }

   public void cj() {
      int[] var1 = new int[this.ae * this.ag];
      int var2 = 0;

      for(int var3 = this.ag - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.ae; ++var4) {
            var1[var2++] = this.ac[var4 + var3 * this.ae];
         }
      }

      this.ac = var1;
      this.ax = this.af - this.ag - this.ax;
   }

   public void cx() {
      int[] var1 = new int[this.ae * this.ag];
      int var2 = 0;

      for(int var3 = this.ag - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.ae; ++var4) {
            var1[var2++] = this.ac[var4 + var3 * this.ae];
         }
      }

      this.ac = var1;
      this.ax = this.af - this.ag - this.ax;
   }

   public void dt(int var1, int var2, int var3) {
      var1 += this.am;
      var2 += this.ax;
      int var4 = var1 + var2 * an;
      int var5 = 0;
      int var6 = this.ag;
      int var7 = this.ae;
      int var8 = an - var7;
      int var9 = 0;
      int var10;
      if (var2 < bd) {
         var10 = bd - var2;
         var6 -= var10;
         var2 = bd;
         var5 += var10 * var7;
         var4 += var10 * an;
      }

      if (var2 + var6 > bx) {
         var6 -= var2 + var6 - bx;
      }

      if (var1 < bf) {
         var10 = bf - var1;
         var7 -= var10;
         var1 = bf;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var1 + var7 > bm) {
         var10 = var1 + var7 - bm;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         as(aw, this.ac, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   public void cy(int var1) {
      int[] var2 = new int[this.ae * this.ag];
      int var3 = 0;

      for(int var4 = 0; var4 < this.ag; ++var4) {
         for(int var5 = 0; var5 < this.ae; ++var5) {
            int var6 = this.ac[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.ac[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.ac[var3 - this.ae] != 0) {
                  var6 = var1;
               } else if (var5 < this.ae - 1 && this.ac[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.ag - 1 && this.ac[var3 + this.ae] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.ac = var2;
   }

   public void co(int var1) {
      int[] var2 = new int[this.ae * this.ag];
      int var3 = 0;

      for(int var4 = 0; var4 < this.ag; ++var4) {
         for(int var5 = 0; var5 < this.ae; ++var5) {
            int var6 = this.ac[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.ac[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.ac[var3 - this.ae] != 0) {
                  var6 = var1;
               } else if (var5 < this.ae - 1 && this.ac[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.ag - 1 && this.ac[var3 + this.ae] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.ac = var2;
   }

   public vv(int[] var1, int var2, int var3) {
      this.ac = var1;
      this.ae = this.aq = var2;
      this.ag = this.af = var3;
      this.ax = 0;
      this.am = 0;
   }

   public void at() {
      int[] var1 = new int[this.ae * this.ag];
      int var2 = 0;

      for(int var3 = this.ag - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.ae; ++var4) {
            var1[var2++] = this.ac[var4 + var3 * this.ae];
         }
      }

      this.ac = var1;
      this.ax = this.af - this.ag - this.ax;
   }

   public void bo() {
      if (this.ae != this.aq || this.ag != this.af) {
         int[] var1 = new int[this.aq * this.af];

         for(int var2 = 0; var2 < this.ag; ++var2) {
            for(int var3 = 0; var3 < this.ae; ++var3) {
               var1[(var2 + this.ax) * this.aq + var3 + this.am] = this.ac[var2 * this.ae + var3];
            }
         }

         this.ac = var1;
         this.ae = this.aq;
         this.ag = this.af;
         this.am = 0;
         this.ax = 0;
      }
   }

   public void cq(int var1) {
      for(int var2 = this.ag - 1; var2 > 0; --var2) {
         int var3 = var2 * this.ae;

         for(int var4 = this.ae - 1; var4 > 0; --var4) {
            if (this.ac[var4 + var3] == 0 && this.ac[var4 + var3 - 1 - this.ae] != 0) {
               this.ac[var4 + var3] = var1;
            }
         }
      }

   }

   public void cc(int var1, int var2) {
      var1 += this.am;
      var2 += this.ax;
      int var3 = var1 + var2 * an;
      int var4 = 0;
      int var5 = this.ag;
      int var6 = this.ae;
      int var7 = an - var6;
      int var8 = 0;
      int var9;
      if (var2 < bd) {
         var9 = bd - var2;
         var5 -= var9;
         var2 = bd;
         var4 += var9 * var6;
         var3 += var9 * an;
      }

      if (var2 + var5 > bx) {
         var5 -= var2 + var5 - bx;
      }

      if (var1 < bf) {
         var9 = bf - var1;
         var6 -= var9;
         var1 = bf;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bm) {
         var9 = var1 + var6 - bm;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         ad(aw, this.ac, var4, var3, var6, var5, var7, var8);
      }
   }

   public void ct(int var1) {
      for(int var2 = this.ag - 1; var2 > 0; --var2) {
         int var3 = var2 * this.ae;

         for(int var4 = this.ae - 1; var4 > 0; --var4) {
            if (this.ac[var4 + var3] == 0 && this.ac[var4 + var3 - 1 - this.ae] != 0) {
               this.ac[var4 + var3] = var1;
            }
         }
      }

   }

   static void ad(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
         }

         var3 += var6;
         var2 += var7;
      }

   }

   static void cr(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
         }

         var3 += var6;
         var2 += var7;
      }

   }

   static void cl(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
         }

         var3 += var6;
         var2 += var7;
      }

   }

   public void ca(int var1, int var2) {
      var1 += this.am;
      var2 += this.ax;
      int var3 = var1 + var2 * an;
      int var4 = 0;
      int var5 = this.ag;
      int var6 = this.ae;
      int var7 = an - var6;
      int var8 = 0;
      int var9;
      if (var2 < bd) {
         var9 = bd - var2;
         var5 -= var9;
         var2 = bd;
         var4 += var9 * var6;
         var3 += var9 * an;
      }

      if (var2 + var5 > bx) {
         var5 -= var2 + var5 - bx;
      }

      if (var1 < bf) {
         var9 = bf - var1;
         var6 -= var9;
         var1 = bf;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bm) {
         var9 = var1 + var6 - bm;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         ap(aw, this.ac, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   public void aa(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         this.ah(var1, var2);
      } else {
         var1 += this.am;
         var2 += this.ax;
         int var5 = var1 + var2 * an;
         int var6 = 0;
         int var7 = this.ag;
         int var8 = this.ae;
         int var9 = an - var8;
         int var10 = 0;
         int var11;
         if (var2 < bd) {
            var11 = bd - var2;
            var7 -= var11;
            var2 = bd;
            var6 += var11 * var8;
            var5 += var11 * an;
         }

         if (var2 + var7 > bx) {
            var7 -= var2 + var7 - bx;
         }

         if (var1 < bf) {
            var11 = bf - var1;
            var8 -= var11;
            var1 = bf;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
         }

         if (var1 + var8 > bm) {
            var11 = var1 + var8 - bm;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
         }

         if (var8 > 0 && var7 > 0) {
            ai(aw, this.ac, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   void eg(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.am << 4;
         var2 -= this.ax << 4;
         double var7 = (double)(var5 & '\uffff') * 9.587379924285257E-5D;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.ae << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.ae << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.ag << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.ag << 4) - var2) * var10;
         int var17 = ((this.ae << 4) - var1) * var10 + ((this.ag << 4) - var2) * var9;
         int var18 = -((this.ae << 4) - var1) * var9 + ((this.ag << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < bf) {
            var19 = bf;
         }

         if (var20 > bm) {
            var20 = bm;
         }

         if (var21 < bd) {
            var21 = bd;
         }

         if (var22 > bx) {
            var22 = bx;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * an + var19;
               double var24 = 1.6777216E7D / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if (var27 == 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.ae << 12) < 0 && var31 - (this.ag << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }
                           }
                        }

                        ++var33;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.ae << 12) < 0) {
                           if ((var32 = var36 - (this.ag << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.ae << 12) < 0) {
                           if (var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31;
                        var37 = var20;
                        if (var31 >= 0 && var31 - (this.ag << 12) < 0) {
                           if ((var32 = var35 - (this.ae << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.ae << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if ((var32 = var36 - (this.ag << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.ae << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if (var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31;
                     var37 = var20;
                     if (var31 >= 0 && var31 - (this.ag << 12) < 0) {
                        if (var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if ((var32 = var36 - (this.ag << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                        if (var38 != 0) {
                           aw[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if (var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                        if (var38 != 0) {
                           aw[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   static void cb(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if (var2 != 0) {
               var0[var5++] = var2;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   static void cd(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if (var2 != 0) {
               var0[var5++] = var2;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   public void ce(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         this.ah(var1, var2);
      } else {
         var1 += this.am;
         var2 += this.ax;
         int var5 = var1 + var2 * an;
         int var6 = 0;
         int var7 = this.ag;
         int var8 = this.ae;
         int var9 = an - var8;
         int var10 = 0;
         int var11;
         if (var2 < bd) {
            var11 = bd - var2;
            var7 -= var11;
            var2 = bd;
            var6 += var11 * var8;
            var5 += var11 * an;
         }

         if (var2 + var7 > bx) {
            var7 -= var2 + var7 - bx;
         }

         if (var1 < bf) {
            var11 = bf - var1;
            var8 -= var11;
            var1 = bf;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
         }

         if (var1 + var8 > bm) {
            var11 = var1 + var8 - bm;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
         }

         if (var8 > 0 && var7 > 0) {
            ai(aw, this.ac, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   public void ck(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         this.ah(var1, var2);
      } else {
         var1 += this.am;
         var2 += this.ax;
         int var5 = var1 + var2 * an;
         int var6 = 0;
         int var7 = this.ag;
         int var8 = this.ae;
         int var9 = an - var8;
         int var10 = 0;
         int var11;
         if (var2 < bd) {
            var11 = bd - var2;
            var7 -= var11;
            var2 = bd;
            var6 += var11 * var8;
            var5 += var11 * an;
         }

         if (var2 + var7 > bx) {
            var7 -= var2 + var7 - bx;
         }

         if (var1 < bf) {
            var11 = bf - var1;
            var8 -= var11;
            var1 = bf;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
         }

         if (var1 + var8 > bm) {
            var11 = var1 + var8 - bm;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
         }

         if (var8 > 0 && var7 > 0) {
            ai(aw, this.ac, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   static void dp(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & '\uff00') * var11 & 16711680;
      var10 = (var12 | var13) >>> 8;

      for(int var14 = -var6; var14 < 0; ++var14) {
         for(int var15 = -var5; var15 < 0; ++var15) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var12 = (var2 & 16711935) * var9 & -16711936;
               var13 = (var2 & '\uff00') * var9 & 16711680;
               var0[var4++] = ((var12 | var13) >>> 8) + var10;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void df(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & -1789739909) * var11 & -16711936;
      int var13 = (var10 & -1958227883) * var11 & -1409916424;
      var10 = (var12 | var13) >>> 8;

      for(int var14 = -var6; var14 < 0; ++var14) {
         for(int var15 = -var5; var15 < 0; ++var15) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var12 = (var2 & 2102288362) * var9 & -16711936;
               var13 = (var2 & -176965359) * var9 & 16711680;
               var0[var4++] = ((var12 | var13) >>> 8) + var10;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void dv(int var1, int var2, int var3) {
      var1 += this.am;
      var2 += this.ax;
      int var4 = var1 + var2 * an;
      int var5 = 0;
      int var6 = this.ag;
      int var7 = this.ae;
      int var8 = an - var7;
      int var9 = 0;
      int var10;
      if (var2 < bd) {
         var10 = bd - var2;
         var6 -= var10;
         var2 = bd;
         var5 += var10 * var7;
         var4 += var10 * an;
      }

      if (var2 + var6 > bx) {
         var6 -= var2 + var6 - bx;
      }

      if (var1 < bf) {
         var10 = bf - var1;
         var7 -= var10;
         var1 = bf;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var1 + var7 > bm) {
         var10 = var1 + var7 - bm;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         as(aw, this.ac, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   vv() {
   }

   public void cg(int var1) {
      for(int var2 = this.ag - 1; var2 > 0; --var2) {
         int var3 = var2 * this.ae;

         for(int var4 = this.ae - 1; var4 > 0; --var4) {
            if (this.ac[var4 + var3] == 0 && this.ac[var4 + var3 - 1 - this.ae] != 0) {
               this.ac[var4 + var3] = var1;
            }
         }
      }

   }

   static void dl(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & -891317742) * var9 + (var13 & -925585798) * var10 & -16711936) + ((var2 & -638670476) * var9 + (var13 & -1400345374) * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void db(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void dc(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -1572851269 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & 1913312876) + ((var2 & '\uff00') * var9 + (var13 & -606482835) * var10 & 1182252403) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void dw(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.ae;
         int var7 = this.ag;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.aq;
         int var11 = this.af;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.am > 0) {
            var14 = ((this.am << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.am << 16);
         }

         if (this.ax > 0) {
            var14 = ((this.ax << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.ax << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * an;
         int var15 = an - var3;
         if (var2 + var4 > bx) {
            var4 -= var2 + var4 - bx;
         }

         int var16;
         if (var2 < bd) {
            var16 = bd - var2;
            var4 -= var16;
            var14 += var16 * an;
            var9 += var13 * var16;
         }

         if (var1 + var3 > bm) {
            var16 = var1 + var3 - bm;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < bf) {
            var16 = bf - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         aj(aw, this.ac, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   public vv bg() {
      vv var1 = new vv(this.aq, this.af);

      for(int var2 = 0; var2 < this.ag; ++var2) {
         for(int var3 = 0; var3 < this.ae; ++var3) {
            var1.ac[(var2 + this.ax) * this.aq + var3 + this.am] = this.ac[var2 * this.ae + var3];
         }
      }

      return var1;
   }

   public void dx(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.ae;
         int var7 = this.ag;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.aq;
         int var11 = this.af;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.am > 0) {
            var14 = ((this.am << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.am << 16);
         }

         if (this.ax > 0) {
            var14 = ((this.ax << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.ax << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * an;
         int var15 = an - var3;
         if (var2 + var4 > bx) {
            var4 -= var2 + var4 - bx;
         }

         int var16;
         if (var2 < bd) {
            var16 = bd - var2;
            var4 -= var16;
            var14 += var16 * an;
            var9 += var13 * var16;
         }

         if (var1 + var3 > bm) {
            var16 = var1 + var3 - bm;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < bf) {
            var16 = bf - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         aj(aw, this.ac, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   public void dg(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.ag <= var6 ? this.ag : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      int var10000;
      if (var1 + this.ae <= var5) {
         var10000 = this.ae;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * an;
      int var14 = var2 + var9;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (var1 + this.ae <= var16 + var17) {
            var12 = this.ae;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.ac[var20 + var15 * this.ae];
            if (var21 != 0) {
               aw[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += an;
      }

   }

   static void do(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   static void dh(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var13;
               var0 = (var1 & -16711936) + (var0 * var13 - var1 & 16711680) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   public void bx(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
         int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * an;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               aw[var19++] = this.ac[(var20 >> 16) + (var21 >> 16) * this.ae];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += an;
         }
      } catch (Exception var22) {
      }

   }

   public void dq(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.ae;
         int var7 = this.ag;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.aq;
         int var11 = this.af;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.am > 0) {
            var14 = ((this.am << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.am << 16);
         }

         if (this.ax > 0) {
            var14 = ((this.ax << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.ax << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * an;
         int var15 = an - var3;
         if (var2 + var4 > bx) {
            var4 -= var2 + var4 - bx;
         }

         int var16;
         if (var2 < bd) {
            var16 = bd - var2;
            var4 -= var16;
            var14 += var16 * an;
            var9 += var13 * var16;
         }

         if (var1 + var3 > bm) {
            var16 = var1 + var3 - bm;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < bf) {
            var16 = bf - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if (var5 == 256) {
            bn(0, 0, 0, var8, this.ac, aw, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            bh(0, 0, 0, var8, this.ac, aw, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   static void aw(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   static void ai(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & '\uff00') * var11 & 16711680;
      var10 = (var12 | var13) >>> 8;

      for(int var14 = -var6; var14 < 0; ++var14) {
         for(int var15 = -var5; var15 < 0; ++var15) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var12 = (var2 & 16711935) * var9 & -16711936;
               var13 = (var2 & '\uff00') * var9 & 16711680;
               var0[var4++] = ((var12 | var13) >>> 8) + var10;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void dz(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }

   void ev(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.am << 4;
         var2 -= this.ax << 4;
         double var7 = (double)(var5 & '\uffff') * 9.587379924285257E-5D;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.ae << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.ae << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.ag << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.ag << 4) - var2) * var10;
         int var17 = ((this.ae << 4) - var1) * var10 + ((this.ag << 4) - var2) * var9;
         int var18 = -((this.ae << 4) - var1) * var9 + ((this.ag << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < bf) {
            var19 = bf;
         }

         if (var20 > bm) {
            var20 = bm;
         }

         if (var21 < bd) {
            var21 = bd;
         }

         if (var22 > bx) {
            var22 = bx;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * an + var19;
               double var24 = 1.6777216E7D / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if (var27 == 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.ae << 12) < 0 && var31 - (this.ag << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }
                           }
                        }

                        ++var33;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.ae << 12) < 0) {
                           if ((var32 = var36 - (this.ag << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.ae << 12) < 0) {
                           if (var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31;
                        var37 = var20;
                        if (var31 >= 0 && var31 - (this.ag << 12) < 0) {
                           if ((var32 = var35 - (this.ae << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.ae << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if ((var32 = var36 - (this.ag << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.ae << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if (var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31;
                     var37 = var20;
                     if (var31 >= 0 && var31 - (this.ag << 12) < 0) {
                        if (var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if ((var32 = var36 - (this.ag << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                        if (var38 != 0) {
                           aw[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if (var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                        if (var38 != 0) {
                           aw[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   public void dr(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.ag <= var6 ? this.ag : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      int var10000;
      if (var1 + this.ae <= var5) {
         var10000 = this.ae;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * an;
      int var14 = var2 + var9;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (var1 + this.ae <= var16 + var17) {
            var12 = this.ae;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.ac[var20 + var15 * this.ae];
            if (var21 != 0) {
               aw[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += an;
      }

   }

   public void dy(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.ag <= var6 ? this.ag : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      int var10000;
      if (var1 + this.ae <= var5) {
         var10000 = this.ae;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * an;
      int var14 = var2 + var9;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (var1 + this.ae <= var16 + var17) {
            var12 = this.ae;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.ac[var20 + var15 * this.ae];
            if (var21 != 0) {
               aw[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += an;
      }

   }

   public void ds(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
         int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * an;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               aw[var19++] = this.ac[(var20 >> 16) + (var21 >> 16) * this.ae];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += an;
         }
      } catch (Exception var22) {
      }

   }

   public void cv(int var1) {
      for(int var2 = this.ag - 1; var2 > 0; --var2) {
         int var3 = var2 * this.ae;

         for(int var4 = this.ae - 1; var4 > 0; --var4) {
            if (this.ac[var4 + var3] == 0 && this.ac[var4 + var3 - 1 - this.ae] != 0) {
               this.ac[var4 + var3] = var1;
            }
         }
      }

   }

   public void cz(int var1, int var2) {
      var1 += this.am;
      var2 += this.ax;
      int var3 = var1 + var2 * an;
      int var4 = 0;
      int var5 = this.ag;
      int var6 = this.ae;
      int var7 = an - var6;
      int var8 = 0;
      int var9;
      if (var2 < bd) {
         var9 = bd - var2;
         var5 -= var9;
         var2 = bd;
         var4 += var9 * var6;
         var3 += var9 * an;
      }

      if (var2 + var5 > bx) {
         var5 -= var2 + var5 - bx;
      }

      if (var1 < bf) {
         var9 = bf - var1;
         var6 -= var9;
         var1 = bf;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bm) {
         var9 = var1 + var6 - bm;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         ad(aw, this.ac, var4, var3, var6, var5, var7, var8);
      }
   }

   public void dd(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * an;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.ac[(var18 >> 16) + (var19 >> 16) * this.ae];
               if (var20 != 0) {
                  aw[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += an;
         }
      } catch (Exception var21) {
      }

   }

   public void ar(int var1) {
      for(int var2 = this.ag - 1; var2 > 0; --var2) {
         int var3 = var2 * this.ae;

         for(int var4 = this.ae - 1; var4 > 0; --var4) {
            if (this.ac[var4 + var3] == 0 && this.ac[var4 + var3 - 1 - this.ae] != 0) {
               this.ac[var4 + var3] = var1;
            }
         }
      }

   }

   public void al(int var1, int var2) {
      var1 += this.am;
      var2 += this.ax;
      int var3 = var1 + var2 * an;
      int var4 = 0;
      int var5 = this.ag;
      int var6 = this.ae;
      int var7 = an - var6;
      int var8 = 0;
      int var9;
      if (var2 < bd) {
         var9 = bd - var2;
         var5 -= var9;
         var2 = bd;
         var4 += var9 * var6;
         var3 += var9 * an;
      }

      if (var2 + var5 > bx) {
         var5 -= var2 + var5 - bx;
      }

      if (var1 < bf) {
         var9 = bf - var1;
         var6 -= var9;
         var1 = bf;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bm) {
         var9 = var1 + var6 - bm;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         ad(aw, this.ac, var4, var3, var6, var5, var7, var8);
      }
   }

   void ez(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.am << 4;
         var2 -= this.ax << 4;
         double var7 = (double)(var5 & -1789525424) * 9.587379924285257E-5D;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.ae << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.ae << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.ag << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.ag << 4) - var2) * var10;
         int var17 = ((this.ae << 4) - var1) * var10 + ((this.ag << 4) - var2) * var9;
         int var18 = -((this.ae << 4) - var1) * var9 + ((this.ag << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + -490068842 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < bf) {
            var19 = bf;
         }

         if (var20 > bm) {
            var20 = bm;
         }

         if (var21 < bd) {
            var21 = bd;
         }

         if (var22 > bx) {
            var22 = bx;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * an + var19;
               double var24 = 1.6777216E7D / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if (var27 == 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.ae << 12) < 0 && var31 - (this.ag << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }
                           }
                        }

                        ++var33;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.ae << 12) < 0) {
                           if ((var32 = var36 - (this.ag << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.ae << 12) < 0) {
                           if (var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31;
                        var37 = var20;
                        if (var31 >= 0 && var31 - (this.ag << 12) < 0) {
                           if ((var32 = var35 - (this.ae << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                              if (var38 != 0) {
                                 aw[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.ae << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if ((var32 = var36 - (this.ag << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += an) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.ae << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if (var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31;
                     var37 = var20;
                     if (var31 >= 0 && var31 - (this.ag << 12) < 0) {
                        if (var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                           if (var38 != 0) {
                              aw[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if ((var32 = var36 - (this.ag << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                        if (var38 != 0) {
                           aw[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += an) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.ae << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if (var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (1 + var36 - (this.ag << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.ac[(var36 >> 12) * this.ae + (var35 >> 12)];
                        if (var38 != 0) {
                           aw[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   public void bt(int var1) {
      if (this.ae != this.aq || this.ag != this.af) {
         int var2 = var1;
         if (var1 > this.am) {
            var2 = this.am;
         }

         int var3 = var1;
         if (var1 + this.am + this.ae > this.aq) {
            var3 = this.aq - this.am - this.ae;
         }

         int var4 = var1;
         if (var1 > this.ax) {
            var4 = this.ax;
         }

         int var5 = var1;
         if (var1 + this.ax + this.ag > this.af) {
            var5 = this.af - this.ax - this.ag;
         }

         int var6 = this.ae + var2 + var3;
         int var7 = this.ag + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.ag; ++var9) {
            for(int var10 = 0; var10 < this.ae; ++var10) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.ac[var9 * this.ae + var10];
            }
         }

         this.ac = var8;
         this.ae = var6;
         this.ag = var7;
         this.am -= var2;
         this.ax -= var4;
      }
   }

   public vv bi() {
      vv var1 = new vv(this.ae, this.ag);
      var1.aq = this.aq;
      var1.af = this.af;
      var1.am = this.am;
      var1.ax = this.ax;
      int var2 = this.ac.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.ac[var3] = this.ac[var3];
      }

      return var1;
   }
}
