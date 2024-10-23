public class va extends vf {
   vd ac;
   static final int[] ae = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   int ag;

   public int aq(int var1) {
      try {
         int var2 = this.at[(this.au += -1864458299) * -1027766515 - 1] - this.ac.ac(1621822912) & 255;
         if (var2 < 128) {
            if (var1 >= 816799219) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            return (var2 - 128 << 8) + (this.at[(this.au += -1864458299) * -1027766515 - 1] - this.ac.ac(-1375540270) & 255);
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "va.aq(" + ')');
      }
   }

   public void ac(int[] var1, int var2) {
      try {
         this.ac = new vd(var1);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "va.ac(" + ')');
      }
   }

   public void ae(vd var1, int var2) {
      try {
         this.ac = var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "va.ae(" + ')');
      }
   }

   public void ag(int var1, byte var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 + this.ac.ac(-630092389));
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "va.ag(" + ')');
      }
   }

   public int am(int var1) {
      try {
         return this.at[(this.au += -1864458299) * -1027766515 - 1] - this.ac.ac(-261335108) & 255;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "va.am(" + ')');
      }
   }

   public void ab(vd var1) {
      this.ac = var1;
   }

   public int bp(int var1) {
      return var1 * 8 - this.ag * 945441671;
   }

   public void af(byte[] var1, int var2, int var3, int var4) {
      try {
         for(int var5 = 0; var5 < var3; ++var5) {
            if (var4 == -954618206) {
               throw new IllegalStateException();
            }

            var1[var2 + var5] = (byte)(this.at[(this.au += -1864458299) * -1027766515 - 1] - this.ac.ac(-1718359085));
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "va.af(" + ')');
      }
   }

   public void at(int var1) {
      try {
         this.ag = 204484184 * this.au;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "va.at(" + ')');
      }
   }

   public int au(int var1, byte var2) {
      try {
         int var3 = this.ag * 945441671 >> 3;
         int var4 = 8 - (945441671 * this.ag & 7);
         int var5 = 0;

         for(this.ag += var1 * 1606781495; var1 > var4; var4 = 8) {
            if (var2 == 93) {
               throw new IllegalStateException();
            }

            var5 += (this.at[var3++] & ae[var4]) << var1 - var4;
            var1 -= var4;
         }

         if (var4 == var1) {
            if (var2 == 93) {
               throw new IllegalStateException();
            }

            var5 += this.at[var3] & ae[var4];
         } else {
            var5 += this.at[var3] >> var4 - var1 & ae[var1];
         }

         return var5;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "va.au(" + ')');
      }
   }

   public void ar(int var1) {
      try {
         this.au = (7 + this.ag * 945441671) / 8 * -1864458299;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "va.ar(" + ')');
      }
   }

   public void az(vd var1) {
      this.ac = var1;
   }

   public int ad(int var1, int var2) {
      try {
         return var1 - -1027766515 * this.au;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "va.ad(" + ')');
      }
   }

   public void bn(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var2 + var4] = (byte)(this.at[(this.au += -1864458299) * -1027766515 - 1] - this.ac.ac(-1596813894));
      }

   }

   public void ah(int[] var1) {
      this.ac = new vd(var1);
   }

   public void aa(vd var1) {
      this.ac = var1;
   }

   public void bj() {
      this.au = (7 + this.ag * 1967176224) / 8 * -1864458299;
   }

   public void ap(vd var1) {
      this.ac = var1;
   }

   public int bm(int var1) {
      int var2 = this.ag * 945441671 >> 3;
      int var3 = 8 - (945441671 * this.ag & 7);
      int var4 = 0;

      for(this.ag += var1 * 1606781495; var1 > var3; var3 = 8) {
         var4 += (this.at[var2++] & ae[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += this.at[var2] & ae[var3];
      } else {
         var4 += this.at[var2] >> var3 - var1 & ae[var1];
      }

      return var4;
   }

   public va(int var1) {
      try {
         super(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "va.<init>(" + ')');
      }
   }

   public int as() {
      return this.at[(this.au += -457920174) * -1027766515 - 1] - this.ac.ac(1938316481) & -771569321;
   }

   public int ay() {
      return this.at[(this.au += -1864458299) * -1027766515 - 1] - this.ac.ac(-1632891258) & 255;
   }

   public boolean aj() {
      int var1 = this.at[this.au * -1027766515] - this.ac.ae(1996537218) & 255;
      return var1 >= 128;
   }

   public boolean av() {
      int var1 = this.at[this.au * -2007931407] - this.ac.ae(1798194999) & 1645384624;
      return var1 >= -863640117;
   }

   public int aw() {
      int var1 = this.at[(this.au += -1864458299) * -1693396981 - 1] - this.ac.ac(101204886) & 255;
      return var1 < 312687325 ? var1 : (var1 - 128 << 8) + (this.at[(this.au += 1881938798) * -1027766515 - 1] - this.ac.ac(141573421) & 255);
   }

   public int an() {
      int var1 = this.at[(this.au += -1864458299) * -1027766515 - 1] - this.ac.ac(-913648053) & 255;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.at[(this.au += -1864458299) * -1027766515 - 1] - this.ac.ac(1522044043) & 255);
   }

   public int ak() {
      int var1 = this.at[(this.au += -1864458299) * -1027766515 - 1] - this.ac.ac(-629817449) & 255;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.at[(this.au += -1864458299) * -1027766515 - 1] - this.ac.ac(240196430) & 255);
   }

   public int al(int var1, int var2) {
      try {
         return var1 * 8 - this.ag * 945441671;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "va.al(" + ')');
      }
   }

   public void bh(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var2 + var4] = (byte)(this.at[(this.au += -1142354268) * -1116125245 - 1] - this.ac.ac(-2113806593));
      }

   }

   public boolean ax(int var1) {
      try {
         int var2 = this.at[this.au * -1027766515] - this.ac.ae(1122151381) & 255;
         return var2 >= 128;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "va.ax(" + ')');
      }
   }

   public void bx() {
      this.ag = -519132528 * this.au;
   }

   public int bf(int var1) {
      int var2 = this.ag * -1339604826 >> 3;
      int var3 = 8 - (162468105 * this.ag & 7);
      int var4 = 0;

      for(this.ag += var1 * 1606781495; var1 > var3; var3 = 8) {
         var4 += (this.at[var2++] & ae[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += this.at[var2] & ae[var3];
      } else {
         var4 += this.at[var2] >> var3 - var1 & ae[var1];
      }

      return var4;
   }

   public void ai(vd var1) {
      this.ac = var1;
   }

   public void bs() {
      this.au = (7 + this.ag * -551143036) / 8 * -573637725;
   }

   public void bw() {
      this.au = (7 + this.ag * 945441671) / 8 * -1864458299;
   }

   public void ba() {
      this.au = (7 + this.ag * 1518427475) / 8 * -58144169;
   }

   public int bb(int var1) {
      return var1 - -1027766515 * this.au;
   }

   public void ao(int var1) {
      this.at[(this.au += -1864458299) * -1278686456 - 1] = (byte)(var1 + this.ac.ac(-589486748));
   }

   public int by(int var1) {
      return var1 * 8 - this.ag * 945441671;
   }

   public void bd(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var2 + var4] = (byte)(this.at[(this.au += -1864458299) * -1027766515 - 1] - this.ac.ac(54148695));
      }

   }

   public int bi(int var1) {
      return var1 - -1027766515 * this.au;
   }

   public int bg(int var1) {
      return var1 - -1027766515 * this.au;
   }
}
