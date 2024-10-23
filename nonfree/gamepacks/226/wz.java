public class wz {
   int an;
   static final float ap = 0.9F;
   int ak;
   int aj;
   int aw;
   int ay;
   int as;
   int ae = 0;
   int am = 0;
   boolean at;
   int ai;
   int au;
   int ao;
   int af;

   public void ap(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int var10) {
      try {
         this.aw = 2087884249 * var1;
         this.ak = 1616003907 * var2;
         this.aj = -1395507529 * var3;
         this.ai = var4 * -912023829;
         this.ay = var5 * 149662583;
         this.as = var6 * -2001060281;
         this.ae = -1346256047 * var7;
         this.am = -578247457 * var8;
         this.at = var9;
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "wz.ap(" + ')');
      }
   }

   public void ay(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.aw = 2087884249 * var1;
      this.ak = 1616003907 * var2;
      this.aj = -1395507529 * var3;
      this.ai = var4 * -912023829;
      this.ay = var5 * 149662583;
      this.as = var6 * -2001060281;
      this.ae = -1346256047 * var7;
      this.am = -578247457 * var8;
      this.at = var9;
   }

   public void aw(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.au = 1510294197 * var1;
         this.an = 1555692749 * var2;
         this.ao = var3 * 41741967;
         this.af = 502252961 * var4;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "wz.aw(" + ')');
      }
   }

   public void ai(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.aw = 2087884249 * var1;
      this.ak = 1616003907 * var2;
      this.aj = 818429806 * var3;
      this.ai = var4 * -912023829;
      this.ay = var5 * 149662583;
      this.as = var6 * -2001060281;
      this.ae = -1346256047 * var7;
      this.am = -578247457 * var8;
      this.at = var9;
   }

   public void aj(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.aw = 1517363821 * var1;
      this.ak = -539280790 * var2;
      this.aj = -1395507529 * var3;
      this.ai = var4 * 1902542643;
      this.ay = var5 * -708139507;
      this.as = var6 * -1807331499;
      this.ae = -1787074964 * var7;
      this.am = -1805439661 * var8;
      this.at = var9;
   }

   public void ak(ql var1, qi var2, byte var3) {
      try {
         if (var2 != null) {
            int var4 = var2.ae;
            int var5 = Math.min(-582280765 * this.ai, (int)((float)var4 * 0.9F));
            int var6 = var1.bq(746127111 * this.aj, 2004204390);
            int var7 = var1.bp(this.ai * -582280765, 1966299909);
            int var8 = var6 + (675060329 * this.aw - this.ay * -1750032825);
            int var9 = var4 + this.ak * -2055151253 - this.as * -1455420553 + var7;
            vz.ev(this.aw * 675060329, this.ak * -2055151253, 675060329 * this.aw + 746127111 * this.aj, -2055151253 * this.ak + -582280765 * this.ai);
            int var10 = this.am * -1965287649;
            int var11 = 1898538417 * this.ae;
            if (var10 > var11) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               int var12 = var10;
               var10 = var11;
               var11 = var12;
            }

            qb var23 = var1.af(0, var10, (byte)-74);
            qb var13 = var1.af(var10, var11, (byte)-17);
            qb var14 = var1.af(var11, var1.ai((short)-15775), (byte)-65);
            qb var15 = var1.af(0, 1898538417 * this.ae, (byte)-100);
            int var17;
            int var19;
            if (!var13.ak((byte)1)) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               int var16 = var2.am + var2.at;

               for(var17 = 0; var17 < var13.aj((byte)0); ++var17) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  qm var18 = var13.ae(var17, (byte)-93);
                  var19 = 217408337 * var18.aw + var8;
                  int var20 = var2.am(var18.ap);
                  int var21 = 1818523521 * var18.ak + var9 - var4;
                  vz.ef(var19, var21, var20, var16, this.af * 1802853985);
               }
            }

            if (!var23.ak((byte)1)) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               var2.ax(var23, var8, var9, this.au * 787028893, this.an * -1227468795, -1);
            }

            if (!var13.ak((byte)1)) {
               if (var3 == 0) {
                  return;
               }

               var2.ax(var13, var8, var9, -534089617 * this.ao, this.an * -1227468795, -1);
            }

            if (!var14.ak((byte)1)) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               var2.ax(var14, var8, var9, 787028893 * this.au, -1227468795 * this.an, -1);
            }

            if (this.at) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               uy var24 = var15.as((byte)39);
               var17 = var8 + (Integer)var24.ap;
               int var25 = var9 + (Integer)var24.aw;
               var19 = var25 - var5;
               vz.eq(var17, var25, var17, var19, this.au * 787028893);
               if (-1227468795 * this.an != -1) {
                  if (var3 == 0) {
                     return;
                  }

                  vz.eq(1 + var17, 1 + var25, var17 + 1, var19 + 1, this.an * -1227468795);
               }
            }

         }
      } catch (RuntimeException var22) {
         throw tm.aw(var22, "wz.ak(" + ')');
      }
   }

   public void at(ql var1, qi var2) {
      if (var2 != null) {
         int var3 = var2.ae;
         int var4 = Math.min(-582280765 * this.ai, (int)((float)var3 * 0.9F));
         int var5 = var1.bq(-1406425414 * this.aj, 1698127396);
         int var6 = var1.bp(this.ai * -582280765, 1353143139);
         int var7 = var5 + (675060329 * this.aw - this.ay * -1750032825);
         int var8 = var3 + this.ak * -2055151253 - this.as * -1455420553 + var6;
         vz.ev(this.aw * -692299725, this.ak * -2055151253, 624588177 * this.aw + 746127111 * this.aj, -2101455852 * this.ak + -582280765 * this.ai);
         int var9 = this.am * -1965287649;
         int var10 = 1898538417 * this.ae;
         if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
         }

         qb var21 = var1.af(0, var9, (byte)-62);
         qb var12 = var1.af(var9, var10, (byte)-38);
         qb var13 = var1.af(var10, var1.ai((short)-22475), (byte)-19);
         qb var14 = var1.af(0, 1898538417 * this.ae, (byte)-111);
         int var16;
         int var18;
         if (!var12.ak((byte)1)) {
            int var15 = var2.am + var2.at;

            for(var16 = 0; var16 < var12.aj((byte)0); ++var16) {
               qm var17 = var12.ae(var16, (byte)-19);
               var18 = -1564049860 * var17.aw + var7;
               int var19 = var2.am(var17.ap);
               int var20 = -575171581 * var17.ak + var8 - var3;
               vz.ef(var18, var20, var19, var15, this.af * 1428288846);
            }
         }

         if (!var21.ak((byte)1)) {
            var2.ax(var21, var7, var8, this.au * 787028893, this.an * -1901916176, -1);
         }

         if (!var12.ak((byte)1)) {
            var2.ax(var12, var7, var8, -534089617 * this.ao, this.an * -1227468795, -1);
         }

         if (!var13.ak((byte)1)) {
            var2.ax(var13, var7, var8, 787028893 * this.au, -1970863832 * this.an, -1);
         }

         if (this.at) {
            uy var22 = var14.as((byte)37);
            var16 = var7 + (Integer)var22.ap;
            int var23 = var8 + (Integer)var22.aw;
            var18 = var23 - var4;
            vz.eq(var16, var23, var16, var18, this.au * -1309681673);
            if (-1227468795 * this.an != -1) {
               vz.eq(1 + var16, 1 + var23, var16 + 1, var18 + 1, this.an * -1227468795);
            }
         }

      }
   }

   public void as(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.aw = 2087884249 * var1;
      this.ak = 1616003907 * var2;
      this.aj = -1395507529 * var3;
      this.ai = var4 * -912023829;
      this.ay = var5 * 149662583;
      this.as = var6 * -2001060281;
      this.ae = -1346256047 * var7;
      this.am = -578247457 * var8;
      this.at = var9;
   }

   public void ae(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.aw = 2087884249 * var1;
      this.ak = 1616003907 * var2;
      this.aj = -1395507529 * var3;
      this.ai = var4 * -912023829;
      this.ay = var5 * 149662583;
      this.as = var6 * -2001060281;
      this.ae = -1346256047 * var7;
      this.am = -578247457 * var8;
      this.at = var9;
   }

   public void am(int var1, int var2, int var3, int var4) {
      this.au = 1510294197 * var1;
      this.an = -559586893 * var2;
      this.ao = var3 * 41741967;
      this.af = -1788230271 * var4;
   }
}
