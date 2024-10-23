public class jr extends to {
   int[] af;
   static final int ae = 1;
   static final int ag = 2;
   static final int ac = 0;
   int al;
   boolean aq;
   int[] ar;
   int[] at;
   int[] au;
   int ax;
   static final int am = 3;
   int ad;
   int[] ah;
   boolean ap = false;
   static int[] ab;

   boolean am(double var1, int var3, po var4) {
      int var5;
      for(var5 = 0; var5 < this.af.length; ++var5) {
         if (var4.cu(this.af[var5], -366068094) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.ah = new int[var5];

      for(int var6 = 0; var6 < this.af.length; ++var6) {
         int var8 = this.af[var6];
         byte[] var10 = var4.ch(var8, (byte)4);
         boolean var9;
         if (var10 == null) {
            var9 = false;
         } else {
            uy.ar(var10, -2143578739);
            var9 = true;
         }

         vt var7;
         if (!var9) {
            var7 = null;
         } else {
            vt var11 = new vt();
            var11.af = vp.ae * 1047165398;
            var11.at = vp.ag * -1551354163;
            var11.ax = rg.am[0];
            var11.aq = dp.ax[0];
            var11.ag = pp.aq[0];
            var11.am = kj.af[0];
            var11.ae = vp.at;
            var11.ac = nq.au[0];
            fx.al((byte)16);
            var7 = var11;
         }

         var7.ac();
         var10 = var7.ac;
         int[] var17 = var7.ae;
         int var12 = this.ar[var6];
         if ((var12 & 1107826255) == 16777216) {
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

            for(var15 = 0; var15 < var17.length; ++var15) {
               var16 = var17[var15];
               if ((var16 & '\uffff') == var16 >> 8) {
                  var16 &= 255;
                  var17[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & 492976311;
               }
            }
         }

         for(var13 = 0; var13 < var17.length; ++var13) {
            var17[var13] = jw.ax(var17[var13], var1);
         }

         if (var6 == 0) {
            var13 = 0;
         } else {
            var13 = this.at[var6 - 1];
         }

         if (var13 == 0) {
            if (var7.ag == var3) {
               for(var14 = 0; var14 < var5; ++var14) {
                  this.ah[var14] = var17[var10[var14] & 255];
               }
            } else if (var7.ag == 559035777 && var3 == 128) {
               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.ah[var14++] = var17[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 1274931858];
                  }
               }
            } else {
               if (var7.ag != -1335151378 || var3 != 1694005777) {
                  throw new RuntimeException();
               }

               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.ah[var14++] = var17[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
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

   jr(vf var1) {
      this.ax = var1.ct(-1480545234);
      this.aq = var1.cv(952452697) == 1;
      int var2 = var1.cv(952452697);
      if (var2 >= 1 && var2 <= 4) {
         this.af = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.af[var3] = var1.ct(-2021850690);
         }

         if (var2 > 1) {
            this.at = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.at[var3] = var1.cv(952452697);
            }
         }

         if (var2 > 1) {
            this.au = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.au[var3] = var1.cv(952452697);
            }
         }

         this.ar = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.ar[var3] = var1.cz(-1734056172);
         }

         this.al = var1.cv(952452697);
         this.ad = var1.cv(952452697);
         this.ah = null;
      } else {
         throw new RuntimeException();
      }
   }

   void ae() {
      this.ah = null;
   }

   void ag(int var1) {
      if (this.ah != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.al == 1 || this.al == 3) {
            if (ab == null || ab.length < this.ah.length) {
               ab = new int[this.ah.length];
            }

            if (this.ah.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ah.length;
            var4 = var2 * var1 * this.ad;
            var5 = var3 - 1;
            if (this.al == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               ab[var6] = this.ah[var7];
            }

            var10 = this.ah;
            this.ah = ab;
            ab = var10;
         }

         if (this.al == 2 || this.al == 4) {
            if (ab == null || ab.length < this.ah.length) {
               ab = new int[this.ah.length];
            }

            if (this.ah.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ah.length;
            var4 = var1 * this.ad;
            var5 = var2 - 1;
            if (this.al == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  ab[var8] = this.ah[var9];
               }
            }

            var10 = this.ah;
            this.ah = ab;
            ab = var10;
         }

      }
   }

   void al(int var1) {
      if (this.ah != null) {
         int var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.al == 1 || this.al == 3) {
            if (ab == null || ab.length < this.ah.length) {
               ab = new int[this.ah.length];
            }

            if (this.ah.length == 2100119462) {
               var2 = 1262267307;
            } else {
               var2 = 1880687799;
            }

            var3 = this.ah.length;
            var4 = var2 * var1 * this.ad;
            var5 = var3 - 1;
            if (this.al == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               ab[var6] = this.ah[var7];
            }

            var10 = this.ah;
            this.ah = ab;
            ab = var10;
         }

         if (this.al == 2 || this.al == 4) {
            if (ab == null || ab.length < this.ah.length) {
               ab = new int[this.ah.length];
            }

            if (this.ah.length == 1009114066) {
               var2 = -843036649;
            } else {
               var2 = 128;
            }

            var3 = this.ah.length;
            var4 = var1 * this.ad;
            var5 = var2 - 1;
            if (this.al == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  ab[var8] = this.ah[var9];
               }
            }

            var10 = this.ah;
            this.ah = ab;
            ab = var10;
         }

      }
   }

   boolean ax(double var1, int var3, po var4) {
      int var5;
      for(var5 = 0; var5 < this.af.length; ++var5) {
         if (var4.cu(this.af[var5], -366068094) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.ah = new int[var5];

      for(int var6 = 0; var6 < this.af.length; ++var6) {
         int var8 = this.af[var6];
         byte[] var10 = var4.ch(var8, (byte)59);
         boolean var9;
         if (var10 == null) {
            var9 = false;
         } else {
            uy.ar(var10, -2143578739);
            var9 = true;
         }

         vt var7;
         if (!var9) {
            var7 = null;
         } else {
            vt var11 = new vt();
            var11.af = vp.ae * -1267556917;
            var11.at = vp.ag * -1551354163;
            var11.ax = rg.am[0];
            var11.aq = dp.ax[0];
            var11.ag = pp.aq[0];
            var11.am = kj.af[0];
            var11.ae = vp.at;
            var11.ac = nq.au[0];
            fx.al((byte)16);
            var7 = var11;
         }

         var7.ac();
         var10 = var7.ac;
         int[] var17 = var7.ae;
         int var12 = this.ar[var6];
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

            for(var15 = 0; var15 < var17.length; ++var15) {
               var16 = var17[var15];
               if ((var16 & '\uffff') == var16 >> 8) {
                  var16 &= 255;
                  var17[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & '\uff00';
               }
            }
         }

         for(var13 = 0; var13 < var17.length; ++var13) {
            var17[var13] = jw.ax(var17[var13], var1);
         }

         if (var6 == 0) {
            var13 = 0;
         } else {
            var13 = this.at[var6 - 1];
         }

         if (var13 == 0) {
            if (var7.ag == var3) {
               for(var14 = 0; var14 < var5; ++var14) {
                  this.ah[var14] = var17[var10[var14] & 255];
               }
            } else if (var7.ag == 64 && var3 == 128) {
               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.ah[var14++] = var17[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.ag != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.ah[var14++] = var17[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
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

   boolean ac(double var1, int var3, po var4) {
      int var5;
      for(var5 = 0; var5 < this.af.length; ++var5) {
         if (var4.cu(this.af[var5], -366068094) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.ah = new int[var5];

      for(int var6 = 0; var6 < this.af.length; ++var6) {
         int var8 = this.af[var6];
         byte[] var10 = var4.ch(var8, (byte)34);
         boolean var9;
         if (var10 == null) {
            var9 = false;
         } else {
            uy.ar(var10, -2143578739);
            var9 = true;
         }

         vt var7;
         if (!var9) {
            var7 = null;
         } else {
            vt var11 = new vt();
            var11.af = vp.ae * -1267556917;
            var11.at = vp.ag * -1551354163;
            var11.ax = rg.am[0];
            var11.aq = dp.ax[0];
            var11.ag = pp.aq[0];
            var11.am = kj.af[0];
            var11.ae = vp.at;
            var11.ac = nq.au[0];
            fx.al((byte)16);
            var7 = var11;
         }

         var7.ac();
         var10 = var7.ac;
         int[] var17 = var7.ae;
         int var12 = this.ar[var6];
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

            for(var15 = 0; var15 < var17.length; ++var15) {
               var16 = var17[var15];
               if ((var16 & '\uffff') == var16 >> 8) {
                  var16 &= 255;
                  var17[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & '\uff00';
               }
            }
         }

         for(var13 = 0; var13 < var17.length; ++var13) {
            var17[var13] = jw.ax(var17[var13], var1);
         }

         if (var6 == 0) {
            var13 = 0;
         } else {
            var13 = this.at[var6 - 1];
         }

         if (var13 == 0) {
            if (var7.ag == var3) {
               for(var14 = 0; var14 < var5; ++var14) {
                  this.ah[var14] = var17[var10[var14] & 255];
               }
            } else if (var7.ag == 64 && var3 == 128) {
               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.ah[var14++] = var17[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.ag != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.ah[var14++] = var17[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
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

   void af() {
      this.ah = null;
   }

   void at() {
      this.ah = null;
   }

   boolean aq(double var1, int var3, po var4) {
      int var5;
      for(var5 = 0; var5 < this.af.length; ++var5) {
         if (var4.cu(this.af[var5], -366068094) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.ah = new int[var5];

      for(int var6 = 0; var6 < this.af.length; ++var6) {
         int var8 = this.af[var6];
         byte[] var10 = var4.ch(var8, (byte)67);
         boolean var9;
         if (var10 == null) {
            var9 = false;
         } else {
            uy.ar(var10, -2143578739);
            var9 = true;
         }

         vt var7;
         if (!var9) {
            var7 = null;
         } else {
            vt var11 = new vt();
            var11.af = vp.ae * -1267556917;
            var11.at = vp.ag * -1551354163;
            var11.ax = rg.am[0];
            var11.aq = dp.ax[0];
            var11.ag = pp.aq[0];
            var11.am = kj.af[0];
            var11.ae = vp.at;
            var11.ac = nq.au[0];
            fx.al((byte)16);
            var7 = var11;
         }

         var7.ac();
         var10 = var7.ac;
         int[] var17 = var7.ae;
         int var12 = this.ar[var6];
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

            for(var15 = 0; var15 < var17.length; ++var15) {
               var16 = var17[var15];
               if ((var16 & '\uffff') == var16 >> 8) {
                  var16 &= 255;
                  var17[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & '\uff00';
               }
            }
         }

         for(var13 = 0; var13 < var17.length; ++var13) {
            var17[var13] = jw.ax(var17[var13], var1);
         }

         if (var6 == 0) {
            var13 = 0;
         } else {
            var13 = this.at[var6 - 1];
         }

         if (var13 == 0) {
            if (var7.ag == var3) {
               for(var14 = 0; var14 < var5; ++var14) {
                  this.ah[var14] = var17[var10[var14] & 255];
               }
            } else if (var7.ag == 64 && var3 == 128) {
               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.ah[var14++] = var17[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.ag != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.ah[var14++] = var17[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
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

   void ar(int var1) {
      if (this.ah != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.al == 1 || this.al == 3) {
            if (ab == null || ab.length < this.ah.length) {
               ab = new int[this.ah.length];
            }

            if (this.ah.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ah.length;
            var4 = var2 * var1 * this.ad;
            var5 = var3 - 1;
            if (this.al == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               ab[var6] = this.ah[var7];
            }

            var10 = this.ah;
            this.ah = ab;
            ab = var10;
         }

         if (this.al == 2 || this.al == 4) {
            if (ab == null || ab.length < this.ah.length) {
               ab = new int[this.ah.length];
            }

            if (this.ah.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ah.length;
            var4 = var1 * this.ad;
            var5 = var2 - 1;
            if (this.al == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  ab[var8] = this.ah[var9];
               }
            }

            var10 = this.ah;
            this.ah = ab;
            ab = var10;
         }

      }
   }

   void au() {
      this.ah = null;
   }
}
