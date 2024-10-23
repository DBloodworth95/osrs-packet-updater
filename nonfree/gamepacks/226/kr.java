import java.util.Arrays;

public class kr implements bx {
   int[] ak = new int[128];
   int[] ay = new int[128];
   char[] aw = new char[128];
   public int[] aj = new int[128];
   int at = 0;
   public int ar;
   int ae = 0;
   public int ai = 0;
   int am = 0;
   static final int ap = 128;
   int as = 0;
   boolean[] an = new boolean[112];
   boolean[] ao = new boolean[112];
   public char af;
   boolean[] au = new boolean[112];
   public static final int bv = 1024;

   public void aa() {
      this.ae = this.at * -88259091;
      this.at = this.am * 1553575372;
      this.ai = 0;
      this.as = 0;
      Arrays.fill(this.an, false);
      Arrays.fill(this.ao, false);
   }

   public boolean ap(int var1, byte var2) {
      try {
         this.af(var1, (byte)1);
         this.au[var1] = true;
         this.an[var1] = true;
         this.ao[var1] = false;
         if (1180857575 * this.ai < 128) {
            if (var2 != 3) {
               throw new IllegalStateException();
            }

            this.aj[(this.ai += -1859821865) * 1180857575 - 1] = var1;
         }

         return true;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "kr.ap(" + ')');
      }
   }

   public boolean an(int var1) {
      this.af(var1, (byte)1);
      this.au[var1] = true;
      this.an[var1] = true;
      this.ao[var1] = false;
      if (1180857575 * this.ai < 128) {
         this.aj[(this.ai += -1859821865) * 1180857575 - 1] = var1;
      }

      return true;
   }

   public boolean ak(char var1, int var2) {
      try {
         int var3 = 1 + 224355877 * this.am & 127;
         if (this.ae * 928475053 != var3) {
            this.ak[this.am * 224355877] = -1;
            this.aw[224355877 * this.am] = var1;
            this.am = var3 * 1073759661;
         }

         return false;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "kr.ak(" + ')');
      }
   }

   void af(int var1, byte var2) {
      try {
         int var3 = 1 + this.am * 224355877 & 127;
         if (var3 != 928475053 * this.ae) {
            if (var2 != 1) {
               throw new IllegalStateException();
            }

            this.ak[224355877 * this.am] = var1;
            this.aw[this.am * 224355877] = 0;
            this.am = 1073759661 * var3;
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "kr.af(" + ')');
      }
   }

   public boolean am(boolean var1) {
      return false;
   }

   public void ar(int var1) {
      try {
         this.ae = this.at * -88259091;
         this.at = this.am * -1690453603;
         this.ai = 0;
         this.as = 0;
         Arrays.fill(this.an, false);
         Arrays.fill(this.ao, false);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "kr.ar(" + ')');
      }
   }

   public final boolean ab(int var1) {
      try {
         if (1200987177 * this.at == 928475053 * this.ae) {
            if (var1 <= -1852636956) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            this.ar = this.ak[this.ae * 928475053] * -225902435;
            this.af = this.aw[928475053 * this.ae];
            this.ae = (1 + 928475053 * this.ae & 127) * -1666011;
            return true;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "kr.ab(" + ')');
      }
   }

   public boolean az(int var1, byte var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 20) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return this.an[var1];
            }

            if (var2 <= 20) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "kr.az(" + ')');
      }
   }

   public boolean at(int var1) {
      this.af(var1, (byte)1);
      this.au[var1] = true;
      this.an[var1] = true;
      this.ao[var1] = false;
      if (1180857575 * this.ai < 128) {
         this.aj[(this.ai += -1859821865) * 1180857575 - 1] = var1;
      }

      return true;
   }

   public boolean ad(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < 112) {
               return this.ao[var1];
            }

            if (var2 != -1137813711) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "kr.ad(" + ')');
      }
   }

   public int[] ac(byte var1) {
      try {
         int[] var2 = new int[1180857575 * this.ai];

         for(int var3 = 0; var3 < 1180857575 * this.ai; ++var3) {
            if (var1 != 9) {
               throw new IllegalStateException();
            }

            var2[var3] = this.aj[var3];
         }

         return var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "kr.ac(" + ')');
      }
   }

   public int[] av(int var1) {
      try {
         int[] var2 = new int[-2128229175 * this.as];

         for(int var3 = 0; var3 < -2128229175 * this.as; ++var3) {
            if (var1 >= -1444993357) {
               throw new IllegalStateException();
            }

            var2[var3] = this.ay[var3];
         }

         return var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "kr.av(" + ')');
      }
   }

   public boolean ai(int var1) {
      this.au[var1] = false;
      this.an[var1] = false;
      this.ao[var1] = true;
      if (this.as * -2128229175 < 128) {
         this.ay[(this.as += 635178361) * -2128229175 - 1] = var1;
      }

      return true;
   }

   public boolean ay(char var1) {
      int var2 = 1 + 224355877 * this.am & -659871261;
      if (this.ae * 928475053 != var2) {
         this.ak[this.am * 224355877] = -1;
         this.aw[-1518939878 * this.am] = var1;
         this.am = var2 * 1073759661;
      }

      return false;
   }

   public boolean as(char var1) {
      int var2 = 1 + 224355877 * this.am & 127;
      if (this.ae * 928475053 != var2) {
         this.ak[this.am * 224355877] = -1;
         this.aw[224355877 * this.am] = var1;
         this.am = var2 * 1073759661;
      }

      return false;
   }

   public static int ai(int var0, int var1, short var2) {
      try {
         int var3 = var1 - var0 & 2047;
         return var3 > 1024 ? -(2048 - var3) : var3;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "kr.ai(" + ')');
      }
   }

   public int[] br() {
      int[] var1 = new int[-2128229175 * this.as];

      for(int var2 = 0; var2 < -2128229175 * this.as; ++var2) {
         var1[var2] = this.ay[var2];
      }

      return var1;
   }

   public boolean ag(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= 1496758933) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return this.au[var1];
            }

            if (var2 >= 1496758933) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "kr.ag(" + ')');
      }
   }

   public boolean au(int var1) {
      this.af(var1, (byte)1);
      this.au[var1] = true;
      this.an[var1] = true;
      this.ao[var1] = false;
      if (1180857575 * this.ai < 128) {
         this.aj[(this.ai += -1859821865) * 1180857575 - 1] = var1;
      }

      return true;
   }

   public void bh() {
      this.ae = this.at * -88259091;
      this.at = this.am * -1690453603;
      this.ai = 0;
      this.as = 0;
      Arrays.fill(this.an, false);
      Arrays.fill(this.ao, false);
   }

   public boolean ao(int var1) {
      this.af(var1, (byte)1);
      this.au[var1] = true;
      this.an[var1] = true;
      this.ao[var1] = false;
      if (1180857575 * this.ai < 128) {
         this.aj[(this.ai += -1859821865) * 1180857575 - 1] = var1;
      }

      return true;
   }

   public final boolean bx() {
      if (1200987177 * this.at == 928475053 * this.ae) {
         return false;
      } else {
         this.ar = this.ak[this.ae * 928475053] * -225902435;
         this.af = this.aw[928475053 * this.ae];
         this.ae = (1 + 928475053 * this.ae & 127) * -1666011;
         return true;
      }
   }

   void aq(int var1) {
      int var2 = 1 + this.am * 224355877 & 127;
      if (var2 != 928475053 * this.ae) {
         this.ak[224355877 * this.am] = var1;
         this.aw[this.am * 224355877] = 0;
         this.am = 1073759661 * var2;
      }

   }

   void al(int var1) {
      int var2 = 1 + this.am * 224355877 & 127;
      if (var2 != 928475053 * this.ae) {
         this.ak[224355877 * this.am] = var1;
         this.aw[this.am * 224355877] = 0;
         this.am = 1073759661 * var2;
      }

   }

   public boolean aw(int var1, byte var2) {
      try {
         this.au[var1] = false;
         this.an[var1] = false;
         this.ao[var1] = true;
         if (this.as * -2128229175 < 128) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            this.ay[(this.as += 635178361) * -2128229175 - 1] = var1;
         }

         return true;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "kr.aw(" + ')');
      }
   }

   public void ah() {
      this.ae = this.at * -1363826102;
      this.at = this.am * -1690453603;
      this.ai = 0;
      this.as = 0;
      Arrays.fill(this.an, false);
      Arrays.fill(this.ao, false);
   }

   void ax(int var1) {
      int var2 = 1 + this.am * 224355877 & 127;
      if (var2 != 928475053 * this.ae) {
         this.ak[224355877 * this.am] = var1;
         this.aw[this.am * 224355877] = 0;
         this.am = 1073759661 * var2;
      }

   }

   public void bj() {
      this.ae = this.at * -88259091;
      this.at = this.am * -1690453603;
      this.ai = 0;
      this.as = 0;
      Arrays.fill(this.an, false);
      Arrays.fill(this.ao, false);
   }

   public final boolean bv() {
      if (1200987177 * this.at == 928475053 * this.ae) {
         return false;
      } else {
         this.ar = this.ak[this.ae * 928475053] * -225902435;
         this.af = this.aw[928475053 * this.ae];
         this.ae = (1 + 928475053 * this.ae & 127) * -1666011;
         return true;
      }
   }

   public int[] bz() {
      int[] var1 = new int[1180857575 * this.ai];

      for(int var2 = 0; var2 < 1180857575 * this.ai; ++var2) {
         var1[var2] = this.aj[var2];
      }

      return var1;
   }

   public boolean bk(int var1) {
      return var1 >= 0 && var1 < 112 ? this.an[var1] : false;
   }

   public boolean bq(int var1) {
      return var1 >= 0 && var1 < -1453697984 ? this.au[var1] : false;
   }

   public boolean bp(int var1) {
      return var1 >= 0 && var1 < 112 ? this.au[var1] : false;
   }

   public boolean ae(boolean var1) {
      return false;
   }

   public int[] bc() {
      int[] var1 = new int[1180857575 * this.ai];

      for(int var2 = 0; var2 < 1180857575 * this.ai; ++var2) {
         var1[var2] = this.aj[var2];
      }

      return var1;
   }

   public int[] by() {
      int[] var1 = new int[1180857575 * this.ai];

      for(int var2 = 0; var2 < 1180857575 * this.ai; ++var2) {
         var1[var2] = this.aj[var2];
      }

      return var1;
   }

   public boolean bb(int var1) {
      return var1 >= 0 && var1 < 112 ? this.an[var1] : false;
   }

   public boolean aj(boolean var1, byte var2) {
      try {
         return false;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "kr.aj(" + ')');
      }
   }

   public int[] bu() {
      int[] var1 = new int[-2128229175 * this.as];

      for(int var2 = 0; var2 < 1413717253 * this.as; ++var2) {
         var1[var2] = this.ay[var2];
      }

      return var1;
   }

   public int[] bn() {
      int[] var1 = new int[-2128229175 * this.as];

      for(int var2 = 0; var2 < -2128229175 * this.as; ++var2) {
         var1[var2] = this.ay[var2];
      }

      return var1;
   }
}
