public class mc {
   int aw;
   static final int au = 0;
   int[] ak;
   static final int af = 3;
   int[] ai;
   int[] ay;
   int as;
   static final int ae = 500000;
   vl ap = new vl((byte[])null);
   static final byte[] at = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   int[] aj;
   static final int an = 1;
   long am;
   static final int ao = 2;

   long an(int var1) {
      return this.am + (long)var1 * (long)this.as;
   }

   void ap(byte[] var1) {
      this.ap.ae = var1;
      this.ap.am = 1334053762;
      int var2 = this.ap.ce(887711139);
      this.aw = this.ap.ce(14555305);
      this.as = 500000;
      this.ak = new int[var2];

      vl var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.am += var5 * -725588083) {
         int var4 = this.ap.ch(1203709469);
         var5 = this.ap.ch(1203709469);
         if (var4 == 1297379947) {
            this.ak[var3] = this.ap.am * -1689308347;
            ++var3;
         }

         var10000 = this.ap;
      }

      this.am = 0L;
      this.aj = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.aj[var3] = this.ak[var3];
      }

      this.ai = new int[var2];
      this.ay = new int[var2];
   }

   void aw() {
      this.ap.ae = null;
      this.ak = null;
      this.aj = null;
      this.ai = null;
      this.ay = null;
   }

   boolean ak() {
      return this.ap.ae != null;
   }

   void ag(byte[] var1) {
      this.ap.ae = var1;
      this.ap.am = 1334053762;
      int var2 = this.ap.ce(1337251726);
      this.aw = this.ap.ce(2100264339);
      this.as = 500000;
      this.ak = new int[var2];

      vl var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.am += var5 * -725588083) {
         int var4 = this.ap.ch(1203709469);
         var5 = this.ap.ch(1203709469);
         if (var4 == 1297379947) {
            this.ak[var3] = this.ap.am * -1689308347;
            ++var3;
         }

         var10000 = this.ap;
      }

      this.am = 0L;
      this.aj = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.aj[var3] = this.ak[var3];
      }

      this.ai = new int[var2];
      this.ay = new int[var2];
   }

   int bn() {
      int var1 = this.aj.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.aj[var4] >= 0 && this.ai[var4] < var3) {
            var2 = var4;
            var3 = this.ai[var4];
         }
      }

      return var2;
   }

   void ay(int var1) {
      this.aj[var1] = this.ap.am * -1689308347;
   }

   void as() {
      this.ap.am = 725588083;
   }

   void ae(int var1) {
      int var2 = this.ap.dh((byte)1);
      int[] var10000 = this.ai;
      var10000[var1] += var2;
   }

   int am(int var1) {
      int var2 = this.at(var1);
      return var2;
   }

   boolean bt() {
      int var1 = this.aj.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.aj[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   int bb(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.ap.cy((short)-20066);
         var4 = this.ap.dh((byte)28);
         vl var10000;
         if (var7 == 47) {
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.ap.cx((byte)-112);
            var4 -= 3;
            int var6 = this.ai[var1];
            this.am += (long)var6 * (long)(this.as - var5);
            this.as = var5;
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 2;
         } else {
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 3;
         }
      } else {
         byte var3 = at[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.ap.cy((short)-5560) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.ap.cy((short)-2691) << 16;
         }

         return var4;
      }
   }

   int ao() {
      int var1 = this.aj.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.aj[var4] >= 0 && this.ai[var4] < var3) {
            var2 = var4;
            var3 = this.ai[var4];
         }
      }

      return var2;
   }

   int aj() {
      return this.aj.length;
   }

   boolean af() {
      int var1 = this.aj.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.aj[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void av() {
      this.ap.ae = null;
      this.ak = null;
      this.aj = null;
      this.ai = null;
      this.ay = null;
   }

   void ab(byte[] var1) {
      this.ap.ae = var1;
      this.ap.am = -1147381561;
      int var2 = this.ap.ce(1525424850);
      this.aw = this.ap.ce(938435377);
      this.as = -23161116;
      this.ak = new int[var2];

      vl var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.am += var5 * -846540698) {
         int var4 = this.ap.ch(1203709469);
         var5 = this.ap.ch(1203709469);
         if (var4 == 1297379947) {
            this.ak[var3] = this.ap.am * -1689308347;
            ++var3;
         }

         var10000 = this.ap;
      }

      this.am = 0L;
      this.aj = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.aj[var3] = this.ak[var3];
      }

      this.ai = new int[var2];
      this.ay = new int[var2];
   }

   void ah(int var1) {
      this.ap.am = this.aj[var1] * -725588083;
   }

   int au(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.ap.cy((short)-24981);
         var4 = this.ap.dh((byte)-81);
         vl var10000;
         if (var7 == 47) {
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.ap.cx((byte)-1);
            var4 -= 3;
            int var6 = this.ai[var1];
            this.am += (long)var6 * (long)(this.as - var5);
            this.as = var5;
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 2;
         } else {
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 3;
         }
      } else {
         byte var3 = at[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.ap.cy((short)-20463) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.ap.cy((short)-5039) << 16;
         }

         return var4;
      }
   }

   void ad() {
      this.ap.ae = null;
      this.ak = null;
      this.aj = null;
      this.ai = null;
      this.ay = null;
   }

   mc() {
   }

   void az(byte[] var1) {
      this.ap.ae = var1;
      this.ap.am = 1334053762;
      int var2 = this.ap.ce(69950327);
      this.aw = this.ap.ce(1176095110);
      this.as = 500000;
      this.ak = new int[var2];

      vl var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.am += var5 * -725588083) {
         int var4 = this.ap.ch(1203709469);
         var5 = this.ap.ch(1203709469);
         if (var4 == 1297379947) {
            this.ak[var3] = this.ap.am * -1689308347;
            ++var3;
         }

         var10000 = this.ap;
      }

      this.am = 0L;
      this.aj = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.aj[var3] = this.ak[var3];
      }

      this.ai = new int[var2];
      this.ay = new int[var2];
   }

   int bu() {
      int var1 = this.aj.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.aj[var4] >= 0 && this.ai[var4] < var3) {
            var2 = var4;
            var3 = this.ai[var4];
         }
      }

      return var2;
   }

   boolean aq() {
      return this.ap.ae != null;
   }

   boolean al() {
      return this.ap.ae != null;
   }

   int aa() {
      return this.aj.length;
   }

   void ai(int var1) {
      this.ap.am = this.aj[var1] * -725588083;
   }

   void bh(int var1) {
      this.ap.am = this.aj[var1] * 994327939;
   }

   void bj(int var1) {
      this.aj[var1] = this.ap.am * -1689308347;
   }

   void bv(int var1) {
      int var2 = this.ap.dh((byte)53);
      int[] var10000 = this.ai;
      var10000[var1] += var2;
   }

   void bx(int var1) {
      int var2 = this.ap.dh((byte)-68);
      int[] var10000 = this.ai;
      var10000[var1] += var2;
   }

   void ac() {
      this.ap.ae = null;
      this.ak = null;
      this.aj = null;
      this.ai = null;
      this.ay = null;
   }

   int bz(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.ap.cy((short)-14334);
         var4 = this.ap.dh((byte)-2);
         vl var10000;
         if (var7 == 47) {
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.ap.cx((byte)-79);
            var4 -= 3;
            int var6 = this.ai[var1];
            this.am += (long)var6 * (long)(this.as - var5);
            this.as = var5;
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 2;
         } else {
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 3;
         }
      } else {
         byte var3 = at[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.ap.cy((short)-1135) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.ap.cy((short)-4897) << 16;
         }

         return var4;
      }
   }

   int bq(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.ap.cy((short)-11514);
         var4 = this.ap.dh((byte)6);
         vl var10000;
         if (var7 == 47) {
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.ap.cx((byte)-16);
            var4 -= 3;
            int var6 = this.ai[var1];
            this.am += (long)var6 * (long)(this.as - var5);
            this.as = var5;
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 2;
         } else {
            var10000 = this.ap;
            var10000.am += var4 * -182186819;
            return 3;
         }
      } else {
         byte var3 = at[var2 - -592964602];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.ap.cy((short)-10284) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.ap.cy((short)-2022) << 16;
         }

         return var4;
      }
   }

   int bp(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.ap.cy((short)-18110);
         var4 = this.ap.dh((byte)-7);
         vl var10000;
         if (var7 == 47) {
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.ap.cx((byte)-61);
            var4 -= 3;
            int var6 = this.ai[var1];
            this.am += (long)var6 * (long)(this.as - var5);
            this.as = var5;
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 2;
         } else {
            var10000 = this.ap;
            var10000.am += var4 * -725588083;
            return 3;
         }
      } else {
         byte var3 = at[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.ap.cy((short)-24476) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.ap.cy((short)-28099) << 16;
         }

         return var4;
      }
   }

   int at(int var1) {
      byte var2 = this.ap.ae[this.ap.am * -1689308347];
      vl var10000;
      int var5;
      if (var2 < 0) {
         var5 = var2 & 255;
         this.ay[var1] = var5;
         var10000 = this.ap;
         var10000.am += -725588083;
      } else {
         var5 = this.ay[var1];
      }

      if (var5 != 240 && var5 != 247) {
         return this.au(var1, var5);
      } else {
         int var3 = this.ap.dh((byte)-39);
         if (var5 == 247 && var3 > 0) {
            int var4 = this.ap.ae[this.ap.am * -1689308347] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               var10000 = this.ap;
               var10000.am += -725588083;
               this.ay[var1] = var4;
               return this.au(var1, var4);
            }
         }

         var10000 = this.ap;
         var10000.am += var3 * -725588083;
         return 0;
      }
   }

   long bc(int var1) {
      return this.am + (long)var1 * (long)this.as;
   }

   long by(int var1) {
      return this.am + (long)var1 * (long)this.as;
   }

   long br(int var1) {
      return this.am + (long)var1 * (long)this.as;
   }

   boolean ax() {
      return this.ap.ae != null;
   }

   int bk(int var1) {
      int var2 = this.at(var1);
      return var2;
   }

   void ar(long var1) {
      this.am = var1;
      int var3 = this.aj.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.ai[var4] = 0;
         this.ay[var4] = 0;
         this.ap.am = this.ak[var4] * -725588083;
         this.ae(var4);
         this.aj[var4] = this.ap.am * -1689308347;
      }

   }

   boolean bs() {
      int var1 = this.aj.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.aj[var2] >= 0) {
            return false;
         }
      }

      return true;
   }
}
