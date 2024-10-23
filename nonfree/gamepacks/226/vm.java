public class vm extends vl {
   wh ap;
   static final int[] aw = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   int ak;

   public int an(int var1, int var2) {
      try {
         return var1 - this.am * -1689308347;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vm.an(" + ')');
      }
   }

   public void ap(int[] var1, int var2) {
      try {
         this.ap = new wh(var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vm.ap(" + ')');
      }
   }

   public int ax() {
      return this.ae[(this.am += -864150019) * -1689308347 - 1] - this.ap.ap((byte)-58) & -887402929;
   }

   public void ak(int var1, int var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + this.ap.ap((byte)-67));
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vm.ak(" + ')');
      }
   }

   public int bp(int var1) {
      int var2 = this.ak * -202763409 >> 3;
      int var3 = 8 - (this.ak * -210123293 & 7);
      int var4 = 0;

      for(this.ak += -574118623 * var1; var1 > var3; var3 = 8) {
         var4 += (this.ae[var2++] & aw[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += this.ae[var2] & aw[var3];
      } else {
         var4 += this.ae[var2] >> var3 - var1 & aw[var1];
      }

      return var4;
   }

   public boolean ai(int var1) {
      try {
         int var2 = this.ae[this.am * -1689308347] - this.ap.aw((byte)122) & 255;
         return var2 >= 128;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vm.ai(" + ')');
      }
   }

   public int ah() {
      int var1 = this.ae[(this.am += -725588083) * -192017915 - 1] - this.ap.ap((byte)-58) & 1416415254;
      return var1 < -1499704560 ? var1 : (var1 - -1070190617 << 8) + (this.ae[(this.am += -725588083) * -1689308347 - 1] - this.ap.ap((byte)-97) & 255);
   }

   public void as(byte[] var1, int var2, int var3, byte var4) {
      try {
         for(int var5 = 0; var5 < var3; ++var5) {
            if (var4 == 3) {
               throw new IllegalStateException();
            }

            var1[var2 + var5] = (byte)(this.ae[(this.am += -725588083) * -1689308347 - 1] - this.ap.ap((byte)-19));
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "vm.as(" + ')');
      }
   }

   public void ae(int var1) {
      try {
         this.ak = this.am * -417290456;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vm.ae(" + ')');
      }
   }

   public int am(int var1, int var2) {
      try {
         int var3 = this.ak * 2054037217 >> 3;
         int var4 = 8 - (this.ak * 2054037217 & 7);
         int var5 = 0;

         for(this.ak += -574118623 * var1; var1 > var4; var4 = 8) {
            if (var2 >= -1432321793) {
               throw new IllegalStateException();
            }

            var5 += (this.ae[var3++] & aw[var4]) << var1 - var4;
            var1 -= var4;
         }

         if (var4 == var1) {
            var5 += this.ae[var3] & aw[var4];
         } else {
            var5 += this.ae[var3] >> var4 - var1 & aw[var1];
         }

         return var5;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "vm.am(" + ')');
      }
   }

   public void at(int var1) {
      try {
         this.am = -725588083 * ((7 + this.ak * 2054037217) / 8);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vm.at(" + ')');
      }
   }

   public int au(int var1, int var2) {
      try {
         return var1 * 8 - this.ak * 2054037217;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vm.au(" + ')');
      }
   }

   public vm(int var1) {
      try {
         super(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vm.<init>(" + ')');
      }
   }

   public void ag(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + this.ap.ap((byte)-20));
   }

   public void ao(int[] var1) {
      this.ap = new wh(var1);
   }

   public void af(int[] var1) {
      this.ap = new wh(var1);
   }

   public void ar(wh var1) {
      this.ap = var1;
   }

   public int bh() {
      int var1 = this.ae[(this.am += 1696638362) * 1220174571 - 1] - this.ap.ap((byte)-44) & 255;
      return var1 < -1144407647 ? var1 : (var1 - -1066628956 << 8) + (this.ae[(this.am += -725588083) * -1689308347 - 1] - this.ap.ap((byte)-40) & 1872930855);
   }

   public void aw(wh var1, int var2) {
      try {
         this.ap = var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vm.aw(" + ')');
      }
   }

   public void ab(wh var1) {
      this.ap = var1;
   }

   public void ad(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + this.ap.ap((byte)-84));
   }

   public int ac() {
      return this.ae[(this.am += -725588083) * -1689308347 - 1] - this.ap.ap((byte)-58) & 112954051;
   }

   public int av() {
      return this.ae[(this.am += -591643420) * -2129740304 - 1] - this.ap.ap((byte)-29) & 255;
   }

   public void bc() {
      this.am = -725588083 * ((7 + this.ak * 2054037217) / 8);
   }

   public int ay(byte var1) {
      try {
         int var2 = this.ae[(this.am += -725588083) * -1689308347 - 1] - this.ap.ap((byte)-43) & 255;
         if (var2 < 128) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            return (var2 - 128 << 8) + (this.ae[(this.am += -725588083) * -1689308347 - 1] - this.ap.ap((byte)-70) & 255);
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vm.ay(" + ')');
      }
   }

   public int aj(int var1) {
      try {
         return this.ae[(this.am += -725588083) * -1689308347 - 1] - this.ap.ap((byte)-109) & 255;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vm.aj(" + ')');
      }
   }

   public int aa() {
      int var1 = this.ae[(this.am += 503310237) * 994885917 - 1] - this.ap.ap((byte)-75) & 255;
      return var1 < -1803739685 ? var1 : (var1 - 1784914258 << 8) + (this.ae[(this.am += -751409230) * -1689308347 - 1] - this.ap.ap((byte)-116) & -1664979710);
   }

   public void bv(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var2 + var4] = (byte)(this.ae[(this.am += -725588083) * -1689308347 - 1] - this.ap.ap((byte)-16));
      }

   }

   public void az(int var1) {
      this.ae[(this.am += -725588083) * -396941057 - 1] = (byte)(var1 + this.ap.ap((byte)-14));
   }

   public void bj(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var2 + var4] = (byte)(this.ae[(this.am += -1119668335) * 150381532 - 1] - this.ap.ap((byte)-117));
      }

   }

   public boolean al() {
      int var1 = this.ae[this.am * -1689308347] - this.ap.aw((byte)106) & 255;
      return var1 >= 128;
   }

   public void bx(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var2 + var4] = (byte)(this.ae[(this.am += -725588083) * -1689308347 - 1] - this.ap.ap((byte)-47));
      }

   }

   public void bk() {
      this.ak = this.am * 302308645;
   }

   public void bb() {
      this.ak = this.am * -417290456;
   }

   public int bq(int var1) {
      int var2 = this.ak * 671341138 >> 3;
      int var3 = 8 - (this.ak * 2054037217 & 7);
      int var4 = 0;

      for(this.ak += -574118623 * var1; var1 > var3; var3 = 8) {
         var4 += (this.ae[var2++] & aw[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += this.ae[var2] & aw[var3];
      } else {
         var4 += this.ae[var2] >> var3 - var1 & aw[var1];
      }

      return var4;
   }

   public void bz() {
      this.am = -838994282 * ((7 + this.ak * 2054037217) / 8);
   }

   public int bt(int var1) {
      return var1 - this.am * -1689308347;
   }

   public int by(int var1) {
      return var1 * 8 - this.ak * 2054037217;
   }

   public int br(int var1) {
      return var1 - this.am * 1915625327;
   }

   public boolean aq() {
      int var1 = this.ae[this.am * -1689308347] - this.ap.aw((byte)20) & 255;
      return var1 >= 128;
   }

   public int bu(int var1) {
      return var1 - this.am * -1689308347;
   }

   public int bn(int var1) {
      return var1 - this.am * 298852399;
   }
}
