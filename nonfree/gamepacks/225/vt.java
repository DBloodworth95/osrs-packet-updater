public final class vt extends vr {
   public int at;
   public int[] ae;
   public int ag;
   public int am;
   public int af;
   public int aq;
   public byte[] ac;
   public int ax;

   static void ay(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
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

   public void ah(int var1, int var2) {
      var1 += this.ax;
      var2 += this.aq;
      int var3 = var1 + var2 * an;
      int var4 = 0;
      int var5 = this.am;
      int var6 = this.ag;
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
         am(aw, this.ac, this.ae, var4, var3, var6, var5, var7, var8);
      }
   }

   public void aa(int var1, int var2, int var3, int var4) {
      int var5 = this.ag;
      int var6 = this.am;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.af;
      int var10 = this.at;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.ax > 0) {
         var13 = ((this.ax << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.ax << 16);
      }

      if (this.aq > 0) {
         var13 = ((this.aq << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.aq << 16);
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

      aq(aw, this.ac, this.ae, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   public void ag(int var1, int var2) {
      var1 += this.ax;
      var2 += this.aq;
      int var3 = var1 + var2 * an;
      int var4 = 0;
      int var5 = this.am;
      int var6 = this.ag;
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
         am(aw, this.ac, this.ae, var4, var3, var6, var5, var7, var8);
      }
   }

   public void ar(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ae.length; ++var4) {
         int var5 = this.ae[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.ae[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.ae[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.ae[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   public void ax(int var1, int var2, int var3, int var4) {
      int var5 = this.ag;
      int var6 = this.am;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.af;
      int var10 = this.at;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.ax > 0) {
         var13 = ((this.ax << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.ax << 16);
      }

      if (this.aq > 0) {
         var13 = ((this.aq << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.aq << 16);
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

      aq(aw, this.ac, this.ae, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   static void am(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void af() {
      if (this.ag != this.af || this.am != this.at) {
         byte[] var1 = new byte[this.af * this.at];
         int var2 = 0;

         for(int var3 = 0; var3 < this.am; ++var3) {
            for(int var4 = 0; var4 < this.ag; ++var4) {
               var1[var4 + this.ax + (var3 + this.aq) * this.af] = this.ac[var2++];
            }
         }

         this.ac = var1;
         this.ag = this.af;
         this.am = this.at;
         this.ax = 0;
         this.aq = 0;
      }
   }

   public void at() {
      if (this.ag != this.af || this.am != this.at) {
         byte[] var1 = new byte[this.af * this.at];
         int var2 = 0;

         for(int var3 = 0; var3 < this.am; ++var3) {
            for(int var4 = 0; var4 < this.ag; ++var4) {
               var1[var4 + this.ax + (var3 + this.aq) * this.af] = this.ac[var2++];
            }
         }

         this.ac = var1;
         this.ag = this.af;
         this.am = this.at;
         this.ax = 0;
         this.aq = 0;
      }
   }

   public void au(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ae.length; ++var4) {
         int var5 = this.ae[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.ae[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.ae[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.ae[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   static void aq(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
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

   public void al(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ae.length; ++var4) {
         int var5 = this.ae[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.ae[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.ae[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.ae[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   public void ad(int var1, int var2) {
      var1 += this.ax;
      var2 += this.aq;
      int var3 = var1 + var2 * an;
      int var4 = 0;
      int var5 = this.am;
      int var6 = this.ag;
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
         am(aw, this.ac, this.ae, var4, var3, var6, var5, var7, var8);
      }
   }

   static void aw(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
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

   static void ap(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void ab(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void az(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 212805801];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & -1642590723];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 368760751];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & -649457871];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 1390857002];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void ao(int var1, int var2, int var3, int var4) {
      int var5 = this.ag;
      int var6 = this.am;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.af;
      int var10 = this.at;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.ax > 0) {
         var13 = ((this.ax << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.ax << 16);
      }

      if (this.aq > 0) {
         var13 = ((this.aq << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.aq << 16);
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

      aq(aw, this.ac, this.ae, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   public void ai(int var1, int var2, int var3, int var4) {
      int var5 = this.ag;
      int var6 = this.am;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.af;
      int var10 = this.at;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.ax > 0) {
         var13 = ((this.ax << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.ax << 16);
      }

      if (this.aq > 0) {
         var13 = ((this.aq << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.aq << 16);
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

      aq(aw, this.ac, this.ae, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   public void ac() {
      if (this.ag != this.af || this.am != this.at) {
         byte[] var1 = new byte[this.af * this.at];
         int var2 = 0;

         for(int var3 = 0; var3 < this.am; ++var3) {
            for(int var4 = 0; var4 < this.ag; ++var4) {
               var1[var4 + this.ax + (var3 + this.aq) * this.af] = this.ac[var2++];
            }
         }

         this.ac = var1;
         this.ag = this.af;
         this.am = this.at;
         this.ax = 0;
         this.aq = 0;
      }
   }

   static void as(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
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

   public void ae(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ae.length; ++var4) {
         int var5 = this.ae[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.ae[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.ae[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.ae[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   static void aj(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
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

   static void av(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 1970424847];
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
}
