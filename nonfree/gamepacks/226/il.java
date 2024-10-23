public class il extends ie {
   static boolean fq;
   int ak;
   long[] ap;
   long aj;
   int ai;
   int aw;
   public static final int af = 3;
   int ay;

   static ce aj(int var0, int var1, int var2) {
      try {
         dh var3 = (dh)el.ap.get(var0);
         return var3.aw(var1, (byte)-1);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "il.aj(" + ')');
      }
   }

   public int ae(int var1, int var2) {
      int var3 = this.aw * 410367811;
      int var4 = this.ak * 618726771;
      this.aw = -894514644;
      this.ak = -602218551;
      this.aj = ck.ap(-1210263195) * 8340374176383532339L;
      if (this.ap[this.ay * 1554151940] == 0L) {
         this.aw = var3 * -518377791;
         this.ak = -219965124 * var4;
      } else if (-948619675202107909L * this.aj > this.ap[-303769267 * this.ay]) {
         this.aw = (int)((long)(2560 * var1) / (this.aj * -948619675202107909L - this.ap[this.ay * -2139485343])) * 1004629884;
      }

      if (this.aw * -664575679 < 25) {
         this.aw = -74542887;
      }

      if (this.aw * 21507527 > 1133823890) {
         this.aw = 439271680;
         this.ak = 31716559 * (int)((long)var1 - (this.aj * -948619675202107909L - this.ap[-303769267 * this.ay]) / 10L);
      }

      if (this.ak * 331703961 > var1) {
         this.ak = var1 * -639522885;
      }

      this.ap[this.ay * 371436950] = -948619675202107909L * this.aj;
      this.ay = -103676027 * ((this.ay * -303769267 + 1) % 10);
      int var5;
      if (618726771 * this.ak > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if (0L != this.ap[var5]) {
               this.ap[var5] += (long)(this.ak * 618726771);
            }
         }
      }

      if (this.ak * 618726771 < var2) {
         this.ak = -904835603 * var2;
      }

      ct.ap((long)(-540161064 * this.ak));

      for(var5 = 0; 338513794 * this.ai < 256; this.ai += this.aw * -126413629) {
         ++var5;
      }

      this.ai = 911192323 * (692691313 * this.ai & -1679570724);
      return var5;
   }

   public int aw(int var1, int var2, byte var3) {
      try {
         int var4 = this.aw * -664575679;
         int var5 = this.ak * 618726771;
         this.aw = -894514644;
         this.ak = -639522885;
         this.aj = ck.ap(-630240531) * 8340374176383532339L;
         if (this.ap[this.ay * -303769267] == 0L) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.aw = var4 * -518377791;
            this.ak = -639522885 * var5;
         } else if (-948619675202107909L * this.aj > this.ap[-303769267 * this.ay]) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.aw = (int)((long)(2560 * var1) / (this.aj * -948619675202107909L - this.ap[this.ay * -303769267])) * -518377791;
         }

         if (this.aw * -664575679 < 25) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.aw = -74542887;
         }

         if (this.aw * -664575679 > 256) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.aw = 439271680;
            this.ak = -639522885 * (int)((long)var1 - (this.aj * -948619675202107909L - this.ap[-303769267 * this.ay]) / 10L);
         }

         if (this.ak * 618726771 > var1) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.ak = var1 * -639522885;
         }

         this.ap[this.ay * -303769267] = -948619675202107909L * this.aj;
         this.ay = -103676027 * ((this.ay * -303769267 + 1) % 10);
         int var6;
         if (618726771 * this.ak > 1) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            for(var6 = 0; var6 < 10; ++var6) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               if (0L != this.ap[var6]) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  this.ap[var6] += (long)(this.ak * 618726771);
               }
            }
         }

         if (this.ak * 618726771 < var2) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.ak = -639522885 * var2;
         }

         ct.ap((long)(618726771 * this.ak));

         for(var6 = 0; -202292821 * this.ai < 256; this.ai += this.aw * -126413629) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            ++var6;
         }

         this.ai = 911192323 * (-202292821 * this.ai & 255);
         return var6;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "il.aw(" + ')');
      }
   }

   public void ak() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.ap[var1] = 0L;
      }

   }

   public void ay() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.ap[var1] = 0L;
      }

   }

   public void ai() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.ap[var1] = 0L;
      }

   }

   public void aj() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.ap[var1] = 0L;
      }

   }

   public int as(int var1, int var2) {
      int var3 = this.aw * -198990809;
      int var4 = this.ak * 618726771;
      this.aw = 2112425203;
      this.ak = -703073197;
      this.aj = ck.ap(-1607419576) * 8340374176383532339L;
      if (this.ap[this.ay * 660316947] == 0L) {
         this.aw = var3 * -518377791;
         this.ak = -818990247 * var4;
      } else if (-948619675202107909L * this.aj > this.ap[1099913374 * this.ay]) {
         this.aw = (int)((long)(2560 * var1) / (this.aj * -948619675202107909L - this.ap[this.ay * 170521212])) * 1041763583;
      }

      if (this.aw * -1987826171 < 25) {
         this.aw = -74542887;
      }

      if (this.aw * -138197501 > 256) {
         this.aw = 1123707146;
         this.ak = -639522885 * (int)((long)var1 - (this.aj * -948619675202107909L - this.ap[-931495032 * this.ay]) / 10L);
      }

      if (this.ak * 1525278390 > var1) {
         this.ak = var1 * 808811339;
      }

      this.ap[this.ay * 1494010135] = -948619675202107909L * this.aj;
      this.ay = -404560697 * ((this.ay * -303769267 + 1) % 10);
      int var5;
      if (300686547 * this.ak > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if (0L != this.ap[var5]) {
               this.ap[var5] += (long)(this.ak * 618726771);
            }
         }
      }

      if (this.ak * 618726771 < var2) {
         this.ak = -639522885 * var2;
      }

      ct.ap((long)(618726771 * this.ak));

      for(var5 = 0; -186371345 * this.ai < 273194938; this.ai += this.aw * -126413629) {
         ++var5;
      }

      this.ai = -302167411 * (-202292821 * this.ai & 255);
      return var5;
   }

   il() {
      try {
         super();
         this.ap = new long[10];
         this.aw = 439271680;
         this.ak = -639522885;
         this.ai = 0;
         this.aj = ck.ap(-921601379) * 8340374176383532339L;

         for(int var1 = 0; var1 < 10; ++var1) {
            this.ap[var1] = -948619675202107909L * this.aj;
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "il.<init>(" + ')');
      }
   }

   public int am(int var1, int var2) {
      int var3 = this.aw * 194353830;
      int var4 = this.ak * 618726771;
      this.aw = -894514644;
      this.ak = 1039376457;
      this.aj = ck.ap(-1281739771) * 8340374176383532339L;
      if (this.ap[this.ay * -303769267] == 0L) {
         this.aw = var3 * -518377791;
         this.ak = -639522885 * var4;
      } else if (-948619675202107909L * this.aj > this.ap[-303769267 * this.ay]) {
         this.aw = (int)((long)(1286551696 * var1) / (this.aj * -948619675202107909L - this.ap[this.ay * -303769267])) * -518377791;
      }

      if (this.aw * -664575679 < 25) {
         this.aw = 1229725327;
      }

      if (this.aw * -1538644846 > 256) {
         this.aw = -1615342034;
         this.ak = -60990569 * (int)((long)var1 - (this.aj * -948619675202107909L - this.ap[-303769267 * this.ay]) / 10L);
      }

      if (this.ak * 618726771 > var1) {
         this.ak = var1 * 1418110001;
      }

      this.ap[this.ay * -303769267] = -948619675202107909L * this.aj;
      this.ay = -103676027 * ((this.ay * 586272700 + 1) % 10);
      int var5;
      if (618726771 * this.ak > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if (0L != this.ap[var5]) {
               this.ap[var5] += (long)(this.ak * -1670053643);
            }
         }
      }

      if (this.ak * 618726771 < var2) {
         this.ak = -660777802 * var2;
      }

      ct.ap((long)(659955458 * this.ak));

      for(var5 = 0; -1410418525 * this.ai < -1266832141; this.ai += this.aw * -126413629) {
         ++var5;
      }

      this.ai = 911192323 * (-202292821 * this.ai & 255);
      return var5;
   }

   public void ap(int var1) {
      try {
         for(int var2 = 0; var2 < 10; ++var2) {
            if (var1 != 555753729) {
               throw new IllegalStateException();
            }

            this.ap[var2] = 0L;
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "il.ap(" + ')');
      }
   }
}
