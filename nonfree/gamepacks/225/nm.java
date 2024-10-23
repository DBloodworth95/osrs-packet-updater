public class nm {
   public int ae;
   public int ac;
   public int ag;

   public static int ag(int var0, int var1, int var2, byte var3) {
      try {
         return var0 << 28 | var1 << 14 | var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "nm.ag(" + ')');
      }
   }

   public void aa(int var1) {
      if (var1 == -1) {
         this.ac = -1814375251;
      } else {
         this.ac = (var1 >> 28 & 3) * 1814375251;
         this.ae = 2060487407 * (var1 >> 14 & 1759098812);
         this.ag = -1682551355 * (var1 & 16383);
      }

   }

   public nm(nm var1) {
      try {
         super();
         this.ac = var1.ac * 1;
         this.ae = var1.ae * 1;
         this.ag = var1.ag * 1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nm.<init>(" + ')');
      }
   }

   public nm(int var1) {
      try {
         super();
         if (var1 == -1) {
            this.ac = -1814375251;
         } else {
            this.ac = (var1 >> 28 & 3) * 1814375251;
            this.ae = 760352263 * (var1 >> 14 & 16383);
            this.ag = 2126529043 * (var1 & 16383);
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nm.<init>(" + ')');
      }
   }

   public void ac(int var1, byte var2) {
      try {
         if (var1 == -1) {
            if (var2 >= 64) {
               throw new IllegalStateException();
            }

            this.ac = -1814375251;
         } else {
            this.ac = (var1 >> 28 & 3) * 1814375251;
            this.ae = 760352263 * (var1 >> 14 & 16383);
            this.ag = 2126529043 * (var1 & 16383);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "nm.ac(" + ')');
      }
   }

   public int ae(byte var1) {
      try {
         return ag(-1687269157 * this.ac, -1763049545 * this.ae, 1162074139 * this.ag, (byte)62);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nm.ae(" + ')');
      }
   }

   String ba(String var1) {
      return this.ac * -1687269157 + var1 + (-1763049545 * this.ae >> 6) + var1 + (this.ag * 1162074139 >> 6) + var1 + (-1763049545 * this.ae & 63) + var1 + (this.ag * 1162074139 & 63);
   }

   public static int am(int var0, int var1) {
      try {
         return var0 >> 28;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nm.am(" + ')');
      }
   }

   public int bx() {
      return ag(this.ac * -1687269157, -1763049545 * this.ae >> 13, 1162074139 * this.ag >> 13, (byte)61);
   }

   public static int aq(int var0, byte var1) {
      try {
         return var0 & 16383;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nm.aq(" + ')');
      }
   }

   public int af(int var1) {
      try {
         return ag(this.ac * -1687269157, -1763049545 * this.ae >> 13, 1162074139 * this.ag >> 13, (byte)82);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nm.af(" + ')');
      }
   }

   public void at(int var1, int var2, int var3, int var4) {
      try {
         int var5 = var1 >> 14 & 255;
         int var6 = var1 & 255;
         this.ac = (var1 >> 28) * 1814375251;
         this.ae = (var2 + (var5 << 13)) * 760352263;
         this.ag = 2126529043 * ((var6 << 13) + var3);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "nm.at(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         if (this == var1) {
            return true;
         } else {
            return !(var1 instanceof nm) ? false : this.au((nm)var1, (byte)118);
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nm.equals(" + ')');
      }
   }

   boolean au(nm var1, byte var2) {
      try {
         if (var1.ac * -1687269157 != -1687269157 * this.ac) {
            return false;
         } else if (-1763049545 * var1.ae != this.ae * -1763049545) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (1162074139 * this.ag != 1162074139 * var1.ag) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "nm.au(" + ')');
      }
   }

   public int hashCode() {
      try {
         return this.ae((byte)96);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "nm.hashCode(" + ')');
      }
   }

   public static int bz(int var0, int var1) {
      return (var1 << 6) + var0;
   }

   String ar(String var1, int var2) {
      try {
         return this.ac * -1687269157 + var1 + (-1763049545 * this.ae >> 6) + var1 + (this.ag * 1162074139 >> 6) + var1 + (-1763049545 * this.ae & 63) + var1 + (this.ag * 1162074139 & 63);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "nm.ar(" + ')');
      }
   }

   public static int al(int var0, int var1) {
      try {
         return var0 >> 3;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nm.al(" + ')');
      }
   }

   public static int ad(int var0, byte var1) {
      try {
         return var0 << 3;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nm.ad(" + ')');
      }
   }

   public static int ah(int var0, int var1, int var2) {
      try {
         return (var1 << 6) + var0;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "nm.ah(" + ')');
      }
   }

   public static int ap(int var0, int var1) {
      try {
         return 64 + (var0 << 7);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nm.ap(" + ')');
      }
   }

   public static int ak(int var0) {
      return var0 >> 14 & 184803351;
   }

   public void bm(int var1, int var2, int var3) {
      int var4 = var1 >> 14 & 255;
      int var5 = var1 & 255;
      this.ac = (var1 >> 28) * 1814375251;
      this.ae = (var2 + (var4 << 13)) * 760352263;
      this.ag = 2126529043 * ((var5 << 13) + var3);
   }

   public String toString() {
      try {
         return this.ar(",", 1016002029);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "nm.toString(" + ')');
      }
   }

   public int amd() {
      return this.ae((byte)74);
   }

   String bj(String var1) {
      return this.ac * -1687269157 + var1 + (-1911475948 * this.ae >> 6) + var1 + (this.ag * 587439493 >> 6) + var1 + (-1150747214 * this.ae & 63) + var1 + (this.ag * -264973267 & -768045208);
   }

   public void az(int var1) {
      if (var1 == -1) {
         this.ac = -1823682129;
      } else {
         this.ac = (var1 >> 28 & 3) * 1814375251;
         this.ae = 760352263 * (var1 >> 14 & 1426722956);
         this.ag = 2126529043 * (var1 & 16383);
      }

   }

   public static int bu(int var0, int var1) {
      return (var1 << 6) + var0;
   }

   public static int av(int var0) {
      return var0 >> 28;
   }

   public int ao() {
      return ag(-1687269157 * this.ac, -1763049545 * this.ae, 1162074139 * this.ag, (byte)39);
   }

   public int amy() {
      return this.ae((byte)98);
   }

   public static int ay(int var0, int var1, int var2) {
      return var0 << 28 | var1 << 14 | var2;
   }

   public static int aj(int var0, int var1, int var2) {
      return var0 << 28 | var1 << 14 | var2;
   }

   public static int by(int var0) {
      return var0 >> 3;
   }

   public static int aw(int var0) {
      return var0 >> 28;
   }

   public static int an(int var0) {
      return var0 >> 28;
   }

   public nm() {
      try {
         super();
         this.ac = -1814375251;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "nm.<init>(" + ')');
      }
   }

   public static int bn(int var0) {
      return var0 & 16383;
   }

   public static int bh(int var0) {
      return var0 & 16383;
   }

   public int bd() {
      return ag(this.ac * -1687269157, -1763049545 * this.ae >> 13, 1162074139 * this.ag >> 13, (byte)26);
   }

   public void ab(int var1) {
      if (var1 == -1) {
         this.ac = -1814375251;
      } else {
         this.ac = (var1 >> 28 & 3) * 1814375251;
         this.ae = 760352263 * (var1 >> 14 & -1512030924);
         this.ag = 2126529043 * (var1 & 16383);
      }

   }

   public void bf(int var1, int var2, int var3) {
      int var4 = var1 >> 14 & 255;
      int var5 = var1 & 255;
      this.ac = (var1 >> 28) * 1814375251;
      this.ae = (var2 + (var4 << 13)) * 760352263;
      this.ag = 2126529043 * ((var5 << 13) + var3);
   }

   public static int ax(int var0, int var1) {
      try {
         return var0 >> 14 & 16383;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nm.ax(" + ')');
      }
   }

   public void bs(int var1, int var2, int var3) {
      int var4 = var1 >> 14 & 255;
      int var5 = var1 & 255;
      this.ac = (var1 >> 28) * -1518001276;
      this.ae = (var2 + (var4 << 13)) * -425686768;
      this.ag = -46601391 * ((var5 << 13) + var3);
   }

   boolean bw(nm var1) {
      if (var1.ac * -1687269157 != -1687269157 * this.ac) {
         return false;
      } else if (-1763049545 * var1.ae != this.ae * -1763049545) {
         return false;
      } else {
         return 1162074139 * this.ag == 1162074139 * var1.ag;
      }
   }

   public static int br(int var0, int var1) {
      return (var1 << 6) + var0;
   }

   public String amp() {
      return this.ar(",", -1497972826);
   }

   public String ame() {
      return this.ar(",", -903174627);
   }

   public int as() {
      return ag(-1687269157 * this.ac, -1763049545 * this.ae, 1162074139 * this.ag, (byte)122);
   }

   public boolean gg(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof nm) ? false : this.au((nm)var1, (byte)33);
      }
   }

   public static int bp(int var0) {
      return var0 >> 3;
   }

   public nm(int var1, int var2, int var3) {
      try {
         super();
         this.ac = var1 * 1814375251;
         this.ae = 760352263 * var2;
         this.ag = var3 * 2126529043;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "nm.<init>(" + ')');
      }
   }

   public static int bb(int var0) {
      return var0 << 3;
   }

   public static int bi(int var0) {
      return var0 << 3;
   }

   public static int bg(int var0) {
      return var0 << 3;
   }

   public static int bl(int var0) {
      return var0 << 3;
   }

   public int ai() {
      return ag(280488295 * this.ac, 973684230 * this.ae, 1104248548 * this.ag, (byte)78);
   }

   public boolean gn(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof nm) ? false : this.au((nm)var1, (byte)28);
      }
   }

   public String aml() {
      return this.ar(",", 66045206);
   }

   public static int bo(int var0) {
      return 64 + (var0 << 7);
   }

   public static int bv(int var0) {
      return 64 + (var0 << 7);
   }
}
