public final class vd {
   int[] aq;
   static final int ag = 1020;
   int am;
   int[] ax;
   int at;
   static final int ac = 8;
   int af;
   int au;

   public final int ae(int var1) {
      try {
         if (0 == this.am * 1514867605) {
            if (var1 <= 1056495959) {
               throw new IllegalStateException();
            }

            this.ag(885031113);
            this.am = 1374141696;
         }

         return this.ax[this.am * 1514867605 - 1];
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vd.ae(" + ')');
      }
   }

   public final int ac(int var1) {
      try {
         if (this.am * 1514867605 == 0) {
            if (var1 == 1260839772) {
               throw new IllegalStateException();
            }

            this.ag(96257298);
            this.am = 1374141696;
         }

         return this.ax[(this.am -= -514725955) * 1514867605];
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vd.ac(" + ')');
      }
   }

   final void af() {
      this.at += (this.au += -811218545) * 1412698672;

      for(int var1 = 0; var1 < -196479464; ++var1) {
         int var2 = this.aq[var1];
         if (0 == (var1 & 2)) {
            if (0 == (var1 & 1)) {
               this.af = (this.af * -558073356 ^ this.af * -1032096567 << 13) * 1488568506;
            } else {
               this.af = (this.af * -1032096567 ^ this.af * -1032096567 >>> 6) * -1078008455;
            }
         } else if (0 == (var1 & 1)) {
            this.af = -1078008455 * (this.af * -1032096567 ^ -1032096567 * this.af << 2);
         } else {
            this.af = -447714156 * (-1032096567 * this.af ^ -1032096567 * this.af >>> 16);
         }

         this.af += this.aq[-495370403 + var1 & 255] * -170781727;
         int var3;
         this.aq[var1] = var3 = this.aq[(var2 & -1504817238) >> 2] + 815895327 * this.af + this.at * -1739754465;
         this.ax[var1] = (this.at = (this.aq[(var3 >> 8 & -1834045578) >> 2] + var2) * -2089208603) * -1739754465;
      }

   }

   final void ag(int var1) {
      try {
         this.at += (this.au += -811218545) * 386045105;

         for(int var2 = 0; var2 < 256; ++var2) {
            if (var1 <= 16711935) {
               throw new IllegalStateException();
            }

            int var3 = this.aq[var2];
            if (0 == (var2 & 2)) {
               if (var1 <= 16711935) {
                  return;
               }

               if (0 == (var2 & 1)) {
                  if (var1 <= 16711935) {
                     throw new IllegalStateException();
                  }

                  this.af = (this.af * -1032096567 ^ this.af * -1032096567 << 13) * -1078008455;
               } else {
                  this.af = (this.af * -1032096567 ^ this.af * -1032096567 >>> 6) * -1078008455;
               }
            } else if (0 == (var2 & 1)) {
               this.af = -1078008455 * (this.af * -1032096567 ^ -1032096567 * this.af << 2);
            } else {
               this.af = -1078008455 * (-1032096567 * this.af ^ -1032096567 * this.af >>> 16);
            }

            this.af += this.aq[128 + var2 & 255] * -1078008455;
            int var4;
            this.aq[var2] = var4 = this.aq[(var3 & 1020) >> 2] + -1032096567 * this.af + this.at * -1739754465;
            this.ax[var2] = (this.at = (this.aq[(var4 >> 8 & 1020) >> 2] + var3) * -700119073) * -1739754465;
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "vd.ag(" + ')');
      }
   }

   public final int ax() {
      if (this.am * -120423267 == 0) {
         this.ag(336757303);
         this.am = 1376083703;
      }

      return this.ax[(this.am -= -514725955) * 1514867605];
   }

   public final int aq() {
      if (0 == this.am * -1838239529) {
         this.ag(887653941);
         this.am = 1374141696;
      }

      return this.ax[this.am * 1514867605 - 1];
   }

   public vd(int[] var1) {
      try {
         super();
         this.aq = new int[256];
         this.ax = new int[256];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.ax[var2] = var1[var2];
         }

         this.am((byte)24);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vd.<init>(" + ')');
      }
   }

   final void am(byte var1) {
      try {
         int var10 = -1640531527;
         int var9 = -1640531527;
         int var8 = -1640531527;
         int var7 = -1640531527;
         int var6 = -1640531527;
         int var5 = -1640531527;
         int var4 = -1640531527;
         int var3 = -1640531527;

         int var2;
         for(var2 = 0; var2 < 4; ++var2) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var3 ^= var4 << 11;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 << 8;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 << 10;
            var10 += var7;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var3 += var8;
            var9 += var10;
            var9 ^= var10 << 8;
            var4 += var9;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
         }

         for(var2 = 0; var2 < 256; var2 += 8) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var3 += this.ax[var2];
            var4 += this.ax[var2 + 1];
            var5 += this.ax[var2 + 2];
            var6 += this.ax[3 + var2];
            var7 += this.ax[var2 + 4];
            var8 += this.ax[5 + var2];
            var9 += this.ax[var2 + 6];
            var10 += this.ax[7 + var2];
            var3 ^= var4 << 11;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 << 8;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 << 10;
            var10 += var7;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var3 += var8;
            var9 += var10;
            var9 ^= var10 << 8;
            var4 += var9;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
            this.aq[var2] = var3;
            this.aq[var2 + 1] = var4;
            this.aq[2 + var2] = var5;
            this.aq[3 + var2] = var6;
            this.aq[4 + var2] = var7;
            this.aq[var2 + 5] = var8;
            this.aq[6 + var2] = var9;
            this.aq[var2 + 7] = var10;
         }

         for(var2 = 0; var2 < 256; var2 += 8) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var3 += this.aq[var2];
            var4 += this.aq[var2 + 1];
            var5 += this.aq[2 + var2];
            var6 += this.aq[var2 + 3];
            var7 += this.aq[var2 + 4];
            var8 += this.aq[5 + var2];
            var9 += this.aq[6 + var2];
            var10 += this.aq[7 + var2];
            var3 ^= var4 << 11;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 << 8;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 << 10;
            var10 += var7;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var3 += var8;
            var9 += var10;
            var9 ^= var10 << 8;
            var4 += var9;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
            this.aq[var2] = var3;
            this.aq[var2 + 1] = var4;
            this.aq[var2 + 2] = var5;
            this.aq[var2 + 3] = var6;
            this.aq[4 + var2] = var7;
            this.aq[5 + var2] = var8;
            this.aq[6 + var2] = var9;
            this.aq[7 + var2] = var10;
         }

         this.ag(1984230622);
         this.am = 1374141696;
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "vd.am(" + ')');
      }
   }

   final void at() {
      this.at += (this.au += -811218545) * 386045105;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.aq[var1];
         if (0 == (var1 & 2)) {
            if (0 == (var1 & 1)) {
               this.af = (this.af * -1032096567 ^ this.af * -1032096567 << 13) * -1078008455;
            } else {
               this.af = (this.af * -1032096567 ^ this.af * -1032096567 >>> 6) * -1078008455;
            }
         } else if (0 == (var1 & 1)) {
            this.af = -1078008455 * (this.af * -1032096567 ^ -1032096567 * this.af << 2);
         } else {
            this.af = -1078008455 * (-1032096567 * this.af ^ -1032096567 * this.af >>> 16);
         }

         this.af += this.aq[128 + var1 & 255] * -1078008455;
         int var3;
         this.aq[var1] = var3 = this.aq[(var2 & 1020) >> 2] + -1032096567 * this.af + this.at * -1739754465;
         this.ax[var1] = (this.at = (this.aq[(var3 >> 8 & 1020) >> 2] + var2) * -700119073) * -1739754465;
      }

   }

   final void au() {
      this.at += (this.au += -811218545) * 386045105;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.aq[var1];
         if (0 == (var1 & 2)) {
            if (0 == (var1 & 1)) {
               this.af = (this.af * -1032096567 ^ this.af * -1032096567 << 13) * -1078008455;
            } else {
               this.af = (this.af * -1032096567 ^ this.af * -1032096567 >>> 6) * -1078008455;
            }
         } else if (0 == (var1 & 1)) {
            this.af = -1078008455 * (this.af * -1032096567 ^ -1032096567 * this.af << 2);
         } else {
            this.af = -1078008455 * (-1032096567 * this.af ^ -1032096567 * this.af >>> 16);
         }

         this.af += this.aq[128 + var1 & 255] * -1078008455;
         int var3;
         this.aq[var1] = var3 = this.aq[(var2 & 1020) >> 2] + -1032096567 * this.af + this.at * -1739754465;
         this.ax[var1] = (this.at = (this.aq[(var3 >> 8 & 1020) >> 2] + var2) * -700119073) * -1739754465;
      }

   }

   final void ar() {
      this.at += (this.au += -811218545) * 1635027492;

      for(int var1 = 0; var1 < 956653541; ++var1) {
         int var2 = this.aq[var1];
         if (0 == (var1 & 2)) {
            if (0 == (var1 & 1)) {
               this.af = (this.af * -1399777256 ^ this.af * -659528799 << 13) * -1078008455;
            } else {
               this.af = (this.af * -1032096567 ^ this.af * 345454418 >>> 6) * -1078008455;
            }
         } else if (0 == (var1 & 1)) {
            this.af = -1078008455 * (this.af * -1032096567 ^ -1032096567 * this.af << 2);
         } else {
            this.af = 1848082063 * (-1032096567 * this.af ^ -1032096567 * this.af >>> 16);
         }

         this.af += this.aq[69476275 + var1 & -1216967039] * -1078008455;
         int var3;
         this.aq[var1] = var3 = this.aq[(var2 & 1020) >> 2] + 1417488453 * this.af + this.at * 1911895412;
         this.ax[var1] = (this.at = (this.aq[(var3 >> 8 & 1020) >> 2] + var2) * -700119073) * -1739754465;
      }

   }

   final void al() {
      int var9 = -1640531527;
      int var8 = -335979173;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -61738754;
      int var3 = 2034133867;
      int var2 = 2116036630;

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.ax[var1];
         var3 += this.ax[var1 + 1];
         var4 += this.ax[var1 + 2];
         var5 += this.ax[3 + var1];
         var6 += this.ax[var1 + 4];
         var7 += this.ax[5 + var1];
         var8 += this.ax[var1 + 6];
         var9 += this.ax[7 + var1];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.aq[var1] = var2;
         this.aq[var1 + 1] = var3;
         this.aq[2 + var1] = var4;
         this.aq[3 + var1] = var5;
         this.aq[4 + var1] = var6;
         this.aq[var1 + 5] = var7;
         this.aq[6 + var1] = var8;
         this.aq[var1 + 7] = var9;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.aq[var1];
         var3 += this.aq[var1 + 1];
         var4 += this.aq[2 + var1];
         var5 += this.aq[var1 + 3];
         var6 += this.aq[var1 + 4];
         var7 += this.aq[5 + var1];
         var8 += this.aq[6 + var1];
         var9 += this.aq[7 + var1];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.aq[var1] = var2;
         this.aq[var1 + 1] = var3;
         this.aq[var1 + 2] = var4;
         this.aq[var1 + 3] = var5;
         this.aq[4 + var1] = var6;
         this.aq[5 + var1] = var7;
         this.aq[6 + var1] = var8;
         this.aq[7 + var1] = var9;
      }

      this.ag(317635106);
      this.am = 1911935315;
   }
}
