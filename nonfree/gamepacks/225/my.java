public class my {
   static final int at = 500000;
   int ae;
   int[] ag;
   int[] am;
   static final int al = 0;
   int[] aq;
   int af;
   long au;
   int[] ax;
   static final byte[] ar = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   vf ac = new vf((byte[])null);
   static final int ad = 1;
   static final int ah = 2;
   static final int ap = 3;

   int bp(int var1) {
      byte var2 = this.ac.at[this.ac.au * -1027766515];
      vf var10000;
      int var5;
      if (var2 < 0) {
         var5 = var2 & 255;
         this.aq[var1] = var5;
         var10000 = this.ac;
         var10000.au += -1864458299;
      } else {
         var5 = this.aq[var1];
      }

      if (var5 != 240 && var5 != 247) {
         return this.al(var1, var5);
      } else {
         int var3 = this.ac.dk((byte)16);
         if (var5 == 247 && var3 > 0) {
            int var4 = this.ac.at[this.ac.au * -1027766515] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               var10000 = this.ac;
               var10000.au += -1864458299;
               this.aq[var1] = var4;
               return this.al(var1, var4);
            }
         }

         var10000 = this.ac;
         var10000.au += var3 * -1864458299;
         return 0;
      }
   }

   int bj(int var1) {
      byte var2 = this.ac.at[this.ac.au * -1027766515];
      vf var10000;
      int var5;
      if (var2 < 0) {
         var5 = var2 & 1923159745;
         this.aq[var1] = var5;
         var10000 = this.ac;
         var10000.au += 10184829;
      } else {
         var5 = this.aq[var1];
      }

      if (var5 != 240 && var5 != -651318440) {
         return this.al(var1, var5);
      } else {
         int var3 = this.ac.dk((byte)16);
         if (var5 == 247 && var3 > 0) {
            int var4 = this.ac.at[this.ac.au * 841077399] & -1351531946;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 905045827 || var4 >= 250 && var4 <= 1187836270 || var4 == -1919256192) {
               var10000 = this.ac;
               var10000.au += -832510967;
               this.aq[var1] = var4;
               return this.al(var1, var4);
            }
         }

         var10000 = this.ac;
         var10000.au += var3 * 1048456196;
         return 0;
      }
   }

   void ae() {
      this.ac.at = null;
      this.ag = null;
      this.am = null;
      this.ax = null;
      this.aq = null;
   }

   int br() {
      int var1 = this.am.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.am[var4] >= 0 && this.ax[var4] < var3) {
            var2 = var4;
            var3 = this.ax[var4];
         }
      }

      return var2;
   }

   int am() {
      return this.am.length;
   }

   void ax(int var1) {
      this.ac.au = this.am[var1] * -1864458299;
   }

   void aq(int var1) {
      this.am[var1] = this.ac.au * -1027766515;
   }

   void af() {
      this.ac.au = 1864458299;
   }

   void at(int var1) {
      int var2 = this.ac.dk((byte)16);
      int[] var10000 = this.ax;
      var10000[var1] += var2;
   }

   int au(int var1) {
      int var2 = this.ar(var1);
      return var2;
   }

   int ar(int var1) {
      byte var2 = this.ac.at[this.ac.au * -1027766515];
      vf var10000;
      int var5;
      if (var2 < 0) {
         var5 = var2 & 255;
         this.aq[var1] = var5;
         var10000 = this.ac;
         var10000.au += -1864458299;
      } else {
         var5 = this.aq[var1];
      }

      if (var5 != 240 && var5 != 247) {
         return this.al(var1, var5);
      } else {
         int var3 = this.ac.dk((byte)16);
         if (var5 == 247 && var3 > 0) {
            int var4 = this.ac.at[this.ac.au * -1027766515] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               var10000 = this.ac;
               var10000.au += -1864458299;
               this.aq[var1] = var4;
               return this.al(var1, var4);
            }
         }

         var10000 = this.ac;
         var10000.au += var3 * -1864458299;
         return 0;
      }
   }

   int al(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.ac.cv(952452697);
         var4 = this.ac.dk((byte)16);
         vf var10000;
         if (var7 == 47) {
            var10000 = this.ac;
            var10000.au += var4 * -1864458299;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.ac.cc(-911019655);
            var4 -= 3;
            int var6 = this.ax[var1];
            this.au += (long)var6 * (long)(this.af - var5);
            this.af = var5;
            var10000 = this.ac;
            var10000.au += var4 * -1864458299;
            return 2;
         } else {
            var10000 = this.ac;
            var10000.au += var4 * -1864458299;
            return 3;
         }
      } else {
         byte var3 = ar[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.ac.cv(952452697) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.ac.cv(952452697) << 16;
         }

         return var4;
      }
   }

   long ad(int var1) {
      return this.au + (long)var1 * (long)this.af;
   }

   void ay() {
      this.ac.at = null;
      this.ag = null;
      this.am = null;
      this.ax = null;
      this.aq = null;
   }

   boolean ap() {
      int var1 = this.am.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.am[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void ab(long var1) {
      this.au = var1;
      int var3 = this.am.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.ax[var4] = 0;
         this.aq[var4] = 0;
         this.ac.au = this.ag[var4] * -1864458299;
         this.at(var4);
         this.am[var4] = this.ac.au * -1027766515;
      }

   }

   int bm(int var1) {
      int var2 = this.ar(var1);
      return var2;
   }

   void bn(int var1) {
      this.ac.au = this.am[var1] * -1864458299;
   }

   void aa(byte[] var1) {
      this.ac.at = var1;
      this.ac.au = -1464713806;
      int var2 = this.ac.ct(-1825596786);
      this.ae = this.ac.ct(-2056169643);
      this.af = 500000;
      this.ag = new int[var2];

      vf var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.au += var5 * -297754080) {
         int var4 = this.ac.cz(-1734056172);
         var5 = this.ac.cz(-1734056172);
         if (var4 == 1297379947) {
            this.ag[var3] = this.ac.au * -1027766515;
            ++var3;
         }

         var10000 = this.ac;
      }

      this.au = 0L;
      this.am = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.am[var3] = this.ag[var3];
      }

      this.ax = new int[var2];
      this.aq = new int[var2];
   }

   void ai(byte[] var1) {
      this.ac.at = var1;
      this.ac.au = -1464713806;
      int var2 = this.ac.ct(-1929860496);
      this.ae = this.ac.ct(-1416098698);
      this.af = 500000;
      this.ag = new int[var2];

      vf var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.au += var5 * -1864458299) {
         int var4 = this.ac.cz(-1734056172);
         var5 = this.ac.cz(-1734056172);
         if (var4 == 1297379947) {
            this.ag[var3] = this.ac.au * -1027766515;
            ++var3;
         }

         var10000 = this.ac;
      }

      this.au = 0L;
      this.am = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.am[var3] = this.ag[var3];
      }

      this.ax = new int[var2];
      this.aq = new int[var2];
   }

   boolean ag() {
      return this.ac.at != null;
   }

   void as() {
      this.ac.at = null;
      this.ag = null;
      this.am = null;
      this.ax = null;
      this.aq = null;
   }

   void ao() {
      this.ac.at = null;
      this.ag = null;
      this.am = null;
      this.ax = null;
      this.aq = null;
   }

   void bd() {
      this.ac.au = 1864458299;
   }

   boolean av() {
      return this.ac.at != null;
   }

   int an() {
      return this.am.length;
   }

   int bu() {
      int var1 = this.am.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.am[var4] >= 0 && this.ax[var4] < var3) {
            var2 = var4;
            var3 = this.ax[var4];
         }
      }

      return var2;
   }

   void az(byte[] var1) {
      this.ac.at = var1;
      this.ac.au = -1464713806;
      int var2 = this.ac.ct(-1677964748);
      this.ae = this.ac.ct(-1510216827);
      this.af = 500000;
      this.ag = new int[var2];

      vf var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.au += var5 * -1864458299) {
         int var4 = this.ac.cz(-1734056172);
         var5 = this.ac.cz(-1734056172);
         if (var4 == 1297379947) {
            this.ag[var3] = this.ac.au * -1027766515;
            ++var3;
         }

         var10000 = this.ac;
      }

      this.au = 0L;
      this.am = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.am[var3] = this.ag[var3];
      }

      this.ax = new int[var2];
      this.aq = new int[var2];
   }

   boolean bk() {
      int var1 = this.am.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.am[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   int ak() {
      return this.am.length;
   }

   void bx() {
      this.ac.au = 1864458299;
   }

   void bf(int var1) {
      int var2 = this.ac.dk((byte)16);
      int[] var10000 = this.ax;
      var10000[var1] += var2;
   }

   my() {
   }

   int bs(int var1) {
      int var2 = this.ar(var1);
      return var2;
   }

   void ac(byte[] var1) {
      this.ac.at = var1;
      this.ac.au = -1464713806;
      int var2 = this.ac.ct(-1465893216);
      this.ae = this.ac.ct(-2132142777);
      this.af = 500000;
      this.ag = new int[var2];

      vf var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.au += var5 * -1864458299) {
         int var4 = this.ac.cz(-1734056172);
         var5 = this.ac.cz(-1734056172);
         if (var4 == 1297379947) {
            this.ag[var3] = this.ac.au * -1027766515;
            ++var3;
         }

         var10000 = this.ac;
      }

      this.au = 0L;
      this.am = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.am[var3] = this.ag[var3];
      }

      this.ax = new int[var2];
      this.aq = new int[var2];
   }

   int ba(int var1) {
      int var2 = this.ar(var1);
      return var2;
   }

   void bh(int var1) {
      this.ac.au = this.am[var1] * -1864458299;
   }

   int ah() {
      int var1 = this.am.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.am[var4] >= 0 && this.ax[var4] < var3) {
            var2 = var4;
            var3 = this.ax[var4];
         }
      }

      return var2;
   }

   int by(int var1) {
      byte var2 = this.ac.at[this.ac.au * -330027544];
      vf var10000;
      int var5;
      if (var2 < 0) {
         var5 = var2 & 563946568;
         this.aq[var1] = var5;
         var10000 = this.ac;
         var10000.au += 59254686;
      } else {
         var5 = this.aq[var1];
      }

      if (var5 != 240 && var5 != 247) {
         return this.al(var1, var5);
      } else {
         int var3 = this.ac.dk((byte)16);
         if (var5 == 247 && var3 > 0) {
            int var4 = this.ac.at[this.ac.au * -385535370] & 255;
            if (var4 >= 241 && var4 <= -747312431 || var4 == -2090891137 || var4 == 248 || var4 >= -1413384034 && var4 <= 252 || var4 == 254) {
               var10000 = this.ac;
               var10000.au += -1864458299;
               this.aq[var1] = var4;
               return this.al(var1, var4);
            }
         }

         var10000 = this.ac;
         var10000.au += var3 * -1864458299;
         return 0;
      }
   }

   int bb(int var1) {
      byte var2 = this.ac.at[this.ac.au * -1785175288];
      vf var10000;
      int var5;
      if (var2 < 0) {
         var5 = var2 & 386696004;
         this.aq[var1] = var5;
         var10000 = this.ac;
         var10000.au += -1864458299;
      } else {
         var5 = this.aq[var1];
      }

      if (var5 != -813034914 && var5 != 247) {
         return this.al(var1, var5);
      } else {
         int var3 = this.ac.dk((byte)16);
         if (var5 == -1989860114 && var3 > 0) {
            int var4 = this.ac.at[this.ac.au * -1027766515] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= -259248728 && var4 <= 1026455519 || var4 == 312159383) {
               var10000 = this.ac;
               var10000.au += -1642769536;
               this.aq[var1] = var4;
               return this.al(var1, var4);
            }
         }

         var10000 = this.ac;
         var10000.au += var3 * -1864458299;
         return 0;
      }
   }

   int bi(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.ac.cv(952452697);
         var4 = this.ac.dk((byte)16);
         vf var10000;
         if (var7 == 47) {
            var10000 = this.ac;
            var10000.au += var4 * -1864458299;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.ac.cc(-901604567);
            var4 -= 3;
            int var6 = this.ax[var1];
            this.au += (long)var6 * (long)(this.af - var5);
            this.af = var5;
            var10000 = this.ac;
            var10000.au += var4 * -1864458299;
            return 2;
         } else {
            var10000 = this.ac;
            var10000.au += var4 * -1864458299;
            return 3;
         }
      } else {
         byte var3 = ar[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.ac.cv(952452697) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.ac.cv(952452697) << 16;
         }

         return var4;
      }
   }

   int bg(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.ac.cv(952452697);
         var4 = this.ac.dk((byte)16);
         vf var10000;
         if (var7 == 1234374460) {
            var10000 = this.ac;
            var10000.au += var4 * -1864458299;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.ac.cc(1033267429);
            var4 -= 3;
            int var6 = this.ax[var1];
            this.au += (long)var6 * (long)(this.af - var5);
            this.af = var5;
            var10000 = this.ac;
            var10000.au += var4 * -1864458299;
            return 2;
         } else {
            var10000 = this.ac;
            var10000.au += var4 * -1864458299;
            return 3;
         }
      } else {
         byte var3 = ar[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.ac.cv(952452697) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.ac.cv(952452697) << 16;
         }

         return var4;
      }
   }

   int bl(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.ac.cv(952452697);
         var4 = this.ac.dk((byte)16);
         vf var10000;
         if (var7 == 1760953663) {
            var10000 = this.ac;
            var10000.au += var4 * -1864458299;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.ac.cc(-1900709025);
            var4 -= 3;
            int var6 = this.ax[var1];
            this.au += (long)var6 * (long)(this.af - var5);
            this.af = var5;
            var10000 = this.ac;
            var10000.au += var4 * -682754684;
            return 2;
         } else {
            var10000 = this.ac;
            var10000.au += var4 * -1864458299;
            return 3;
         }
      } else {
         byte var3 = ar[var2 - -808890469];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.ac.cv(952452697) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.ac.cv(952452697) << 16;
         }

         return var4;
      }
   }

   long bz(int var1) {
      return this.au + (long)var1 * (long)this.af;
   }

   int bw(int var1) {
      int var2 = this.ar(var1);
      return var2;
   }

   boolean aj() {
      return this.ac.at != null;
   }

   int bo() {
      int var1 = this.am.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.am[var4] >= 0 && this.ax[var4] < var3) {
            var2 = var4;
            var3 = this.ax[var4];
         }
      }

      return var2;
   }

   boolean bv() {
      int var1 = this.am.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.am[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   boolean bt() {
      int var1 = this.am.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.am[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   boolean bq() {
      int var1 = this.am.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.am[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   boolean aw() {
      return this.ac.at != null;
   }

   void be(long var1) {
      this.au = var1;
      int var3 = this.am.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.ax[var4] = 0;
         this.aq[var4] = 0;
         this.ac.au = this.ag[var4] * -1864458299;
         this.at(var4);
         this.am[var4] = this.ac.au * -1027766515;
      }

   }

   void bc(long var1) {
      this.au = var1;
      int var3 = this.am.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.ax[var4] = 0;
         this.aq[var4] = 0;
         this.ac.au = this.ag[var4] * -1864458299;
         this.at(var4);
         this.am[var4] = this.ac.au * -1027766515;
      }

   }
}
