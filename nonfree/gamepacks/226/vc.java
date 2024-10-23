public final class vc extends vz {
   public int ak;
   public int[] aw;
   public int aj;
   public byte[] ap;
   public int ai;
   public int ay;
   public int as;
   public int ae;

   public void af(int var1, int var2, int var3, int var4) {
      int var5 = this.ak;
      int var6 = this.aj;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.as;
      int var10 = this.ae;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.ai > 0) {
         var13 = ((this.ai << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.ai << 16);
      }

      if (this.ay > 0) {
         var13 = ((this.ay << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.ay << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      var13 = var1 + var2 * aa;
      int var14 = aa - var3;
      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      int var15;
      if (var2 < bv) {
         var15 = bv - var2;
         var4 -= var15;
         var13 += var15 * aa;
         var8 += var12 * var15;
      }

      if (var1 + var3 > bb) {
         var15 = var1 + var3 - bb;
         var3 -= var15;
         var14 += var15;
      }

      if (var1 < bk) {
         var15 = bk - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      ay(al, this.ap, this.aw, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   public void ap() {
      if (this.ak != this.as || this.aj != this.ae) {
         byte[] var1 = new byte[this.as * this.ae];
         int var2 = 0;

         for(int var3 = 0; var3 < this.aj; ++var3) {
            for(int var4 = 0; var4 < this.ak; ++var4) {
               var1[var4 + this.ai + (var3 + this.ay) * this.as] = this.ap[var2++];
            }
         }

         this.ap = var1;
         this.ak = this.as;
         this.aj = this.ae;
         this.ai = 0;
         this.ay = 0;
      }
   }

   public void aw(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aw.length; ++var4) {
         int var5 = this.aw[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.aw[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.aw[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.aw[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

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

   static void aj(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   public void ai(int var1, int var2, int var3, int var4) {
      int var5 = this.ak;
      int var6 = this.aj;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.as;
      int var10 = this.ae;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.ai > 0) {
         var13 = ((this.ai << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.ai << 16);
      }

      if (this.ay > 0) {
         var13 = ((this.ay << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.ay << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      var13 = var1 + var2 * aa;
      int var14 = aa - var3;
      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      int var15;
      if (var2 < bv) {
         var15 = bv - var2;
         var4 -= var15;
         var13 += var15 * aa;
         var8 += var12 * var15;
      }

      if (var1 + var3 > bb) {
         var15 = var1 + var3 - bb;
         var3 -= var15;
         var14 += var15;
      }

      if (var1 < bk) {
         var15 = bk - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      ay(al, this.ap, this.aw, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   public void au(int var1, int var2) {
      var1 += this.ai;
      var2 += this.ay;
      int var3 = var1 + var2 * aa;
      int var4 = 0;
      int var5 = this.aj;
      int var6 = this.ak;
      int var7 = aa - var6;
      int var8 = 0;
      int var9;
      if (var2 < bv) {
         var9 = bv - var2;
         var5 -= var9;
         var2 = bv;
         var4 += var9 * var6;
         var3 += var9 * aa;
      }

      if (var2 + var5 > bx) {
         var5 -= var2 + var5 - bx;
      }

      if (var1 < bk) {
         var9 = bk - var1;
         var6 -= var9;
         var1 = bk;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bb) {
         var9 = var1 + var6 - bb;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         aj(al, this.ap, this.aw, var4, var3, var6, var5, var7, var8);
      }
   }

   public void as() {
      if (this.ak != this.as || this.aj != this.ae) {
         byte[] var1 = new byte[this.as * this.ae];
         int var2 = 0;

         for(int var3 = 0; var3 < this.aj; ++var3) {
            for(int var4 = 0; var4 < this.ak; ++var4) {
               var1[var4 + this.ai + (var3 + this.ay) * this.as] = this.ap[var2++];
            }
         }

         this.ap = var1;
         this.ak = this.as;
         this.aj = this.ae;
         this.ai = 0;
         this.ay = 0;
      }
   }

   public void am(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aw.length; ++var4) {
         int var5 = this.aw[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.aw[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.aw[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.aw[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   public void at(int var1, int var2) {
      var1 += this.ai;
      var2 += this.ay;
      int var3 = var1 + var2 * aa;
      int var4 = 0;
      int var5 = this.aj;
      int var6 = this.ak;
      int var7 = aa - var6;
      int var8 = 0;
      int var9;
      if (var2 < bv) {
         var9 = bv - var2;
         var5 -= var9;
         var2 = bv;
         var4 += var9 * var6;
         var3 += var9 * aa;
      }

      if (var2 + var5 > bx) {
         var5 -= var2 + var5 - bx;
      }

      if (var1 < bk) {
         var9 = bk - var1;
         var6 -= var9;
         var1 = bk;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bb) {
         var9 = var1 + var6 - bb;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         aj(al, this.ap, this.aw, var4, var3, var6, var5, var7, var8);
      }
   }

   public void ak(int var1, int var2) {
      var1 += this.ai;
      var2 += this.ay;
      int var3 = var1 + var2 * aa;
      int var4 = 0;
      int var5 = this.aj;
      int var6 = this.ak;
      int var7 = aa - var6;
      int var8 = 0;
      int var9;
      if (var2 < bv) {
         var9 = bv - var2;
         var5 -= var9;
         var2 = bv;
         var4 += var9 * var6;
         var3 += var9 * aa;
      }

      if (var2 + var5 > bx) {
         var5 -= var2 + var5 - bx;
      }

      if (var1 < bk) {
         var9 = bk - var1;
         var6 -= var9;
         var1 = bk;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bb) {
         var9 = var1 + var6 - bb;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         aj(al, this.ap, this.aw, var4, var3, var6, var5, var7, var8);
      }
   }

   public void an(int var1, int var2) {
      var1 += this.ai;
      var2 += this.ay;
      int var3 = var1 + var2 * aa;
      int var4 = 0;
      int var5 = this.aj;
      int var6 = this.ak;
      int var7 = aa - var6;
      int var8 = 0;
      int var9;
      if (var2 < bv) {
         var9 = bv - var2;
         var5 -= var9;
         var2 = bv;
         var4 += var9 * var6;
         var3 += var9 * aa;
      }

      if (var2 + var5 > bx) {
         var5 -= var2 + var5 - bx;
      }

      if (var1 < bk) {
         var9 = bk - var1;
         var6 -= var9;
         var1 = bk;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bb) {
         var9 = var1 + var6 - bb;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         aj(al, this.ap, this.aw, var4, var3, var6, var5, var7, var8);
      }
   }

   static void ao(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
               var0[var4++] = var2[var12 & 377647159];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void ag(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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

   public void ar(int var1, int var2, int var3, int var4) {
      int var5 = this.ak;
      int var6 = this.aj;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.as;
      int var10 = this.ae;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.ai > 0) {
         var13 = ((this.ai << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.ai << 16);
      }

      if (this.ay > 0) {
         var13 = ((this.ay << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.ay << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      var13 = var1 + var2 * aa;
      int var14 = aa - var3;
      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      int var15;
      if (var2 < bv) {
         var15 = bv - var2;
         var4 -= var15;
         var13 += var15 * aa;
         var8 += var12 * var15;
      }

      if (var1 + var3 > bb) {
         var15 = var1 + var3 - bb;
         var3 -= var15;
         var14 += var15;
      }

      if (var1 < bk) {
         var15 = bk - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      ay(al, this.ap, this.aw, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   public void ae() {
      if (this.ak != this.as || this.aj != this.ae) {
         byte[] var1 = new byte[this.as * this.ae];
         int var2 = 0;

         for(int var3 = 0; var3 < this.aj; ++var3) {
            for(int var4 = 0; var4 < this.ak; ++var4) {
               var1[var4 + this.ai + (var3 + this.ay) * this.as] = this.ap[var2++];
            }
         }

         this.ap = var1;
         this.ak = this.as;
         this.aj = this.ae;
         this.ai = 0;
         this.ay = 0;
      }
   }

   static void az(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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

   public void ab(int var1, int var2, int var3, int var4) {
      int var5 = this.ak;
      int var6 = this.aj;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.as;
      int var10 = this.ae;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.ai > 0) {
         var13 = ((this.ai << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.ai << 16);
      }

      if (this.ay > 0) {
         var13 = ((this.ay << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.ay << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      var13 = var1 + var2 * aa;
      int var14 = aa - var3;
      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      int var15;
      if (var2 < bv) {
         var15 = bv - var2;
         var4 -= var15;
         var13 += var15 * aa;
         var8 += var12 * var15;
      }

      if (var1 + var3 > bb) {
         var15 = var1 + var3 - bb;
         var3 -= var15;
         var14 += var15;
      }

      if (var1 < bk) {
         var15 = bk - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      ay(al, this.ap, this.aw, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   static void ad(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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
}
