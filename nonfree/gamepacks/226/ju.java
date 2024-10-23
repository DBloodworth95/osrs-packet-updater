public class ju extends tw {
   int ai;
   static final int ap = 0;
   static final int aj = 3;
   boolean ay;
   static final int ak = 2;
   static final int aw = 1;
   int[] as;
   int[] ae;
   int[] am;
   int[] at;
   int au;
   int an;
   int[] ao;
   boolean af = false;
   static int[] ar;

   ju(vl var1) {
      this.ai = var1.ce(1506299537);
      this.ay = var1.cy((short)-13028) == 1;
      int var2 = var1.cy((short)-32252);
      if (var2 >= 1 && var2 <= 4) {
         this.as = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.as[var3] = var1.ce(1446417248);
         }

         if (var2 > 1) {
            this.ae = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.ae[var3] = var1.cy((short)-5421);
            }
         }

         if (var2 > 1) {
            this.am = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.am[var3] = var1.cy((short)-185);
            }
         }

         this.at = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.at[var3] = var1.ch(1203709469);
         }

         this.au = var1.cy((short)-31268);
         this.an = var1.cy((short)-3603);
         this.ao = null;
      } else {
         throw new RuntimeException();
      }
   }

   boolean ap(double var1, int var3, pe var4) {
      int var5;
      for(var5 = 0; var5 < this.as.length; ++var5) {
         if (var4.bl(this.as[var5], 1948346911) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.ao = new int[var5];

      for(int var6 = 0; var6 < this.as.length; ++var6) {
         int var8 = this.as[var6];
         vc var7;
         if (!dk.at(var4, var8, -1123070579)) {
            var7 = null;
         } else {
            var7 = client.ae(-2020992224);
         }

         var7.ap();
         byte[] var10 = var7.ap;
         int[] var11 = var7.aw;
         int var12 = this.at[var6];
         if ((var12 & -16777216) == 16777216) {
         }

         if ((var12 & -16777216) == 33554432) {
         }

         int var13;
         int var14;
         int var15;
         int var16;
         if ((var12 & -16777216) == 50331648) {
            var13 = var12 & 16711935;
            var14 = var12 >> 8 & 255;

            for(var15 = 0; var15 < var11.length; ++var15) {
               var16 = var11[var15];
               if ((var16 & '\uffff') == var16 >> 8) {
                  var16 &= 255;
                  var11[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & '\uff00';
               }
            }
         }

         for(var13 = 0; var13 < var11.length; ++var13) {
            var11[var13] = jm.ai(var11[var13], var1);
         }

         if (var6 == 0) {
            var13 = 0;
         } else {
            var13 = this.ae[var6 - 1];
         }

         if (var13 == 0) {
            if (var7.ak == var3) {
               for(var14 = 0; var14 < var5; ++var14) {
                  this.ao[var14] = var11[var10[var14] & 255];
               }
            } else if (var7.ak == 64 && var3 == 128) {
               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.ao[var14++] = var11[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.ak != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.ao[var14++] = var11[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if (var13 == 1) {
         }

         if (var13 == 2) {
         }

         if (var13 == 3) {
         }
      }

      return true;
   }

   void aw() {
      this.ao = null;
   }

   void ak(int var1) {
      if (this.ao != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.au == 1 || this.au == 3) {
            if (ar == null || ar.length < this.ao.length) {
               ar = new int[this.ao.length];
            }

            if (this.ao.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ao.length;
            var4 = var2 * var1 * this.an;
            var5 = var3 - 1;
            if (this.au == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               ar[var6] = this.ao[var7];
            }

            var10 = this.ao;
            this.ao = ar;
            ar = var10;
         }

         if (this.au == 2 || this.au == 4) {
            if (ar == null || ar.length < this.ao.length) {
               ar = new int[this.ao.length];
            }

            if (this.ao.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ao.length;
            var4 = var1 * this.an;
            var5 = var2 - 1;
            if (this.au == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  ar[var8] = this.ao[var9];
               }
            }

            var10 = this.ao;
            this.ao = ar;
            ar = var10;
         }

      }
   }

   boolean aj(double var1, int var3, pe var4) {
      int var5;
      for(var5 = 0; var5 < this.as.length; ++var5) {
         if (var4.bl(this.as[var5], 1948346911) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.ao = new int[var5];

      for(int var6 = 0; var6 < this.as.length; ++var6) {
         int var8 = this.as[var6];
         vc var7;
         if (!dk.at(var4, var8, -1015471766)) {
            var7 = null;
         } else {
            var7 = client.ae(-1531864989);
         }

         var7.ap();
         byte[] var10 = var7.ap;
         int[] var11 = var7.aw;
         int var12 = this.at[var6];
         if ((var12 & -16777216) == 16777216) {
         }

         if ((var12 & 2031115826) == 33554432) {
         }

         int var13;
         int var14;
         int var15;
         int var16;
         if ((var12 & -16777216) == 50331648) {
            var13 = var12 & 1089764174;
            var14 = var12 >> 8 & -880075873;

            for(var15 = 0; var15 < var11.length; ++var15) {
               var16 = var11[var15];
               if ((var16 & 1138292971) == var16 >> 8) {
                  var16 &= 255;
                  var11[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & '\uff00';
               }
            }
         }

         for(var13 = 0; var13 < var11.length; ++var13) {
            var11[var13] = jm.ai(var11[var13], var1);
         }

         if (var6 == 0) {
            var13 = 0;
         } else {
            var13 = this.ae[var6 - 1];
         }

         if (var13 == 0) {
            if (var7.ak == var3) {
               for(var14 = 0; var14 < var5; ++var14) {
                  this.ao[var14] = var11[var10[var14] & 684358387];
               }
            } else if (var7.ak == 64 && var3 == 128) {
               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.ao[var14++] = var11[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 212025276];
                  }
               }
            } else {
               if (var7.ak != 1500099413 || var3 != 1210199353) {
                  throw new RuntimeException();
               }

               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.ao[var14++] = var11[var10[(var16 << 1) + (var15 << 1 << 7)] & -607575698];
                  }
               }
            }
         }

         if (var13 == 1) {
         }

         if (var13 == 2) {
         }

         if (var13 == 3) {
         }
      }

      return true;
   }

   void ai() {
      this.ao = null;
   }

   void ay() {
      this.ao = null;
   }

   void as() {
      this.ao = null;
   }

   void ae(int var1) {
      if (this.ao != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.au == 1 || this.au == 3) {
            if (ar == null || ar.length < this.ao.length) {
               ar = new int[this.ao.length];
            }

            if (this.ao.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ao.length;
            var4 = var2 * var1 * this.an;
            var5 = var3 - 1;
            if (this.au == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               ar[var6] = this.ao[var7];
            }

            var10 = this.ao;
            this.ao = ar;
            ar = var10;
         }

         if (this.au == 2 || this.au == 4) {
            if (ar == null || ar.length < this.ao.length) {
               ar = new int[this.ao.length];
            }

            if (this.ao.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ao.length;
            var4 = var1 * this.an;
            var5 = var2 - 1;
            if (this.au == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  ar[var8] = this.ao[var9];
               }
            }

            var10 = this.ao;
            this.ao = ar;
            ar = var10;
         }

      }
   }
}
