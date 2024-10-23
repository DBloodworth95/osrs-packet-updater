public class st extends sz {
   static final int ap = 500;
   final ur aw;
   final sj ak;
   public String aj;
   public byte ay;
   public String ai;
   public int as;
   int ae;

   se[] aw(int var1, int var2) {
      try {
         return new sp[var1];
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "st.aw(" + ')');
      }
   }

   public final void ao(byte var1) {
      try {
         for(int var2 = 0; var2 < this.bb((byte)24); ++var2) {
            if (var1 != 14) {
               throw new IllegalStateException();
            }

            ((sp)this.bs(var2, 1886053865)).ap((byte)110);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "st.ao(" + ')');
      }
   }

   final void at(String var1, byte var2) {
      try {
         String var4 = da.ak(lf.ap((CharSequence)var1, 301537351));
         if (null == var4) {
            if (var2 != 7) {
               throw new IllegalStateException();
            }

            var4 = "";
         }

         this.ai = var4;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "st.at(" + ')');
      }
   }

   final void ar(sp var1, int var2) {
      try {
         if (var1.aa(1464280992).equals(this.ak.oy(738744592))) {
            if (var2 <= 328493790) {
               throw new IllegalStateException();
            }

            this.as = 783649413 * var1.as;
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "st.ar(" + ')');
      }
   }

   se aj() {
      return new sp();
   }

   public final void au(vl var1, int var2, int var3) {
      try {
         this.at(var1.cw(2029841583), (byte)7);
         long var4 = var1.ct((byte)-12);
         this.ak(ht.aw(var4), (byte)12);
         this.ay = var1.cu((byte)13);
         int var6;
         short var7;
         if (var2 == 1) {
            if (var3 != -1689308347) {
               throw new IllegalStateException();
            }

            var6 = var1.cy((short)-11804);
            var7 = 255;
         } else {
            if (2 != var2) {
               throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
            }

            var6 = var1.dd((byte)-40);
            var7 = -1;
         }

         if (var6 != var7) {
            int var8 = var6;
            this.bk(1289867061);

            for(int var9 = 0; var9 < var8; ++var9) {
               sp var10 = (sp)this.bu(new wx(var1.cw(1934503999), this.aw), -1008200315);
               int var11 = var1.ce(1727279466);
               var10.br(var11, (this.ae += -1682428589) * 1168678619 - 1, -937756802);
               var10.as = var1.cu((byte)13) * 1781684277;
               var1.cw(2132904743);
               this.ar(var10, 333871552);
            }

         }
      } catch (RuntimeException var12) {
         throw tm.aw(var12, "st.au(" + ')');
      }
   }

   public final void an(vl var1, int var2) {
      try {
         wx var3 = new wx(var1.cw(1960536918), this.aw);
         int var4 = var1.ce(1121719642);
         byte var5 = var1.cu((byte)13);
         boolean var6 = false;
         if (-128 == var5) {
            if (var2 == 426856560) {
               throw new IllegalStateException();
            }

            var6 = true;
         }

         sp var7;
         if (var6) {
            if (this.bb((byte)-95) == 0) {
               return;
            }

            var7 = (sp)this.bc(var3, (byte)-52);
            if (var7 != null) {
               if (var2 == 426856560) {
                  throw new IllegalStateException();
               }

               if (var7.bn(353004786) == var4) {
                  if (var2 == 426856560) {
                     return;
                  }

                  this.bn(var7, -1772065147);
               }
            }
         } else {
            var1.cw(2108203501);
            var7 = (sp)this.bc(var3, (byte)54);
            if (var7 == null) {
               if (var2 == 426856560) {
                  return;
               }

               if (this.bb((byte)16) > -1108690839 * this.am) {
                  return;
               }

               var7 = (sp)this.bu(var3, 1004311794);
            }

            var7.br(var4, (this.ae += -1682428589) * 1168678619 - 1, -937756802);
            var7.as = var5 * 1781684277;
            this.ar(var7, 359005144);
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "st.an(" + ')');
      }
   }

   public st(ur var1, sj var2) {
      try {
         super(500);
         this.aj = null;
         this.ai = null;
         this.ae = -1682428589;
         this.aw = var1;
         this.ak = var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "st.<init>(" + ')');
      }
   }

   final void ak(String var1, byte var2) {
      try {
         String var4 = da.ak(lf.ap((CharSequence)var1, 947303804));
         if (null == var4) {
            if (var2 == 4) {
               throw new IllegalStateException();
            }

            var4 = "";
         }

         this.aj = var4;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "st.ak(" + ')');
      }
   }

   final void ab(String var1) {
      String var3 = da.ak(lf.ap((CharSequence)var1, 354967007));
      if (null == var3) {
         var3 = "";
      }

      this.aj = var3;
   }

   final void az(String var1) {
      String var3 = da.ak(lf.ap((CharSequence)var1, -1214600000));
      if (null == var3) {
         var3 = "";
      }

      this.ai = var3;
   }

   se ai() {
      return new sp();
   }

   se ay() {
      return new sp();
   }

   se as() {
      return new sp();
   }

   se[] ae(int var1) {
      return new sp[var1];
   }

   se[] am(int var1) {
      return new sp[var1];
   }

   public final void ax(vl var1, int var2) {
      this.at(var1.cw(1941844238), (byte)7);
      long var3 = var1.ct((byte)-7);
      this.ak(ht.aw(var3), (byte)-45);
      this.ay = var1.cu((byte)13);
      int var5;
      short var6;
      if (var2 == 1) {
         var5 = var1.cy((short)-10433);
         var6 = 255;
      } else {
         if (2 != var2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var5 = var1.dd((byte)-47);
         var6 = -1;
      }

      if (var5 != var6) {
         int var7 = var5;
         this.bk(1621169776);

         for(int var8 = 0; var8 < var7; ++var8) {
            sp var9 = (sp)this.bu(new wx(var1.cw(1931044954), this.aw), -740542781);
            int var10 = var1.ce(941093157);
            var9.br(var10, (this.ae += -413982767) * -1349642736 - 1, -937756802);
            var9.as = var1.cu((byte)13) * -543838605;
            var1.cw(1909878471);
            this.ar(var9, 1788935786);
         }

      }
   }

   public final void ah() {
      for(int var1 = 0; var1 < this.bb((byte)-52); ++var1) {
         ((sp)this.bs(var1, -1926430927)).ap((byte)95);
      }

   }

   final void ag(String var1) {
      String var3 = da.ak(lf.ap((CharSequence)var1, -450911291));
      if (null == var3) {
         var3 = "";
      }

      this.ai = var3;
   }

   final void ad(String var1) {
      String var3 = da.ak(lf.ap((CharSequence)var1, 168096462));
      if (null == var3) {
         var3 = "";
      }

      this.ai = var3;
   }

   public final void ac(vl var1, int var2) {
      this.at(var1.cw(1950719934), (byte)7);
      long var3 = var1.ct((byte)-95);
      this.ak(ht.aw(var3), (byte)-13);
      this.ay = var1.cu((byte)13);
      int var5;
      short var6;
      if (var2 == 1) {
         var5 = var1.cy((short)-6308);
         var6 = 255;
      } else {
         if (2 != var2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var5 = var1.dd((byte)-88);
         var6 = -1;
      }

      if (var5 != var6) {
         int var7 = var5;
         this.bk(-277935911);

         for(int var8 = 0; var8 < var7; ++var8) {
            sp var9 = (sp)this.bu(new wx(var1.cw(2081081001), this.aw), 973522672);
            int var10 = var1.ce(310210063);
            var9.br(var10, (this.ae += -1682428589) * 1168678619 - 1, -937756802);
            var9.as = var1.cu((byte)13) * 1781684277;
            var1.cw(1902547772);
            this.ar(var9, 1616996288);
         }

      }
   }

   public final void af(int var1) {
      try {
         for(int var2 = 0; var2 < this.bb((byte)-45); ++var2) {
            if (var1 >= -1259269061) {
               throw new IllegalStateException();
            }

            ((sp)this.bs(var2, 716740655)).ai(-2029625737);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "st.af(" + ')');
      }
   }

   final void bv(sp var1) {
      if (var1.aa(1064577292).equals(this.ak.oy(782213391))) {
         this.as = 783649413 * var1.as;
      }

   }

   public final void aq(vl var1) {
      wx var2 = new wx(var1.cw(1985328110), this.aw);
      int var3 = var1.ce(1649990501);
      byte var4 = var1.cu((byte)13);
      boolean var5 = false;
      if (-128 == var4) {
         var5 = true;
      }

      sp var6;
      if (var5) {
         if (this.bb((byte)96) == 0) {
            return;
         }

         var6 = (sp)this.bc(var2, (byte)42);
         if (var6 != null && var6.bn(707972760) == var3) {
            this.bn(var6, -1522272369);
         }
      } else {
         var1.cw(2137112378);
         var6 = (sp)this.bc(var2, (byte)18);
         if (var6 == null) {
            if (this.bb((byte)95) > -1108690839 * this.am) {
               return;
            }

            var6 = (sp)this.bu(var2, 1308174621);
         }

         var6.br(var3, (this.ae += -1682428589) * -1951178530 - 1, -937756802);
         var6.as = var4 * -1187817085;
         this.ar(var6, 459889649);
      }

   }

   public final void al() {
      for(int var1 = 0; var1 < this.bb((byte)9); ++var1) {
         ((sp)this.bs(var1, -902534503)).ap((byte)33);
      }

   }

   public final void aa() {
      for(int var1 = 0; var1 < this.bb((byte)-30); ++var1) {
         ((sp)this.bs(var1, 2980230)).ap((byte)37);
      }

   }

   public final void av(vl var1, int var2) {
      this.at(var1.cw(2028912856), (byte)7);
      long var3 = var1.ct((byte)-105);
      this.ak(ht.aw(var3), (byte)-93);
      this.ay = var1.cu((byte)13);
      int var5;
      int var6;
      if (var2 == 1) {
         var5 = var1.cy((short)-11817);
         var6 = 2120878546;
      } else {
         if (2 != var2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var5 = var1.dd((byte)-97);
         var6 = -1;
      }

      if (var5 != var6) {
         int var7 = var5;
         this.bk(-2009025771);

         for(int var8 = 0; var8 < var7; ++var8) {
            sp var9 = (sp)this.bu(new wx(var1.cw(2109538847), this.aw), 511296807);
            int var10 = var1.ce(150161132);
            var9.br(var10, (this.ae += -1682428589) * -1613328380 - 1, -937756802);
            var9.as = var1.cu((byte)13) * 1781684277;
            var1.cw(1957252708);
            this.ar(var9, 1158960992);
         }

      }
   }

   public final void bh() {
      for(int var1 = 0; var1 < this.bb((byte)-82); ++var1) {
         ((sp)this.bs(var1, -15014224)).ap((byte)87);
      }

   }

   public final void bj() {
      for(int var1 = 0; var1 < this.bb((byte)-92); ++var1) {
         ((sp)this.bs(var1, -1775494111)).ai(-2029625737);
      }

   }

   se ap(int var1) {
      try {
         return new sp();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "st.ap(" + ')');
      }
   }

   final void bx(sp var1) {
      if (var1.aa(1373272666).equals(this.ak.oy(312389914))) {
         this.as = 783649413 * var1.as;
      }

   }
}
