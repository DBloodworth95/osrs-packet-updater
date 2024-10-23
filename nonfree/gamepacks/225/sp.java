public class sp extends sf {
   int at;
   final ub ae;
   public String ax;
   public String am;
   final rm ag;
   static final int ac = 500;
   public int af;
   public byte aq;

   ss ac(int var1) {
      try {
         return new sh();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "sp.ac(" + ')');
      }
   }

   ss am() {
      return new sh();
   }

   ss[] ae(int var1, int var2) {
      try {
         return new sh[var1];
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sp.ae(" + ')');
      }
   }

   final void ag(String var1, byte var2) {
      try {
         this.am = ur.ag(var1, 738067984);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sp.ag(" + ')');
      }
   }

   final void au(String var1, int var2) {
      try {
         String var4 = mj.ae(fo.ac(var1, 347621045));
         if (null == var4) {
            if (var2 <= -702375940) {
               return;
            }

            var4 = "";
         }

         this.ax = var4;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "sp.au(" + ')');
      }
   }

   public final void ar(vf var1, int var2, byte var3) {
      try {
         String var6;
         int var9;
         label105: {
            this.au(var1.cs(1290624549), 1152965496);
            long var4 = var1.cw(2089041959);
            long var7 = var4;
            if (var4 > 0L) {
               if (var3 <= 1) {
                  return;
               }

               if (var4 < 6582952005840035281L) {
                  if (var4 % 37L == 0L) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     var6 = null;
                  } else {
                     var9 = 0;

                     for(long var10 = var4; 0L != var10; var10 /= 37L) {
                        ++var9;
                     }

                     StringBuilder var12 = new StringBuilder(var9);

                     while(0L != var7) {
                        long var13 = var7;
                        var7 /= 37L;
                        var12.append(qj.ac[(int)(var13 - var7 * 37L)]);
                     }

                     var6 = var12.reverse().toString();
                  }
                  break label105;
               }

               if (var3 <= 1) {
                  return;
               }
            }

            var6 = null;
         }

         this.ag(var6, (byte)-12);
         this.aq = var1.cg((short)15986);
         short var16;
         if (var2 == 1) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            var9 = var1.cv(952452697);
            var16 = 255;
         } else {
            if (var2 != 2) {
               throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
            }

            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            var9 = var1.dp((byte)83);
            var16 = -1;
         }

         if (var16 == var9) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }
         } else {
            int var11 = var9;
            this.bx(841203761);

            for(int var17 = 0; var17 < var11; ++var17) {
               if (var3 <= 1) {
                  return;
               }

               sh var18 = (sh)this.bb(new wf(var1.cs(2062542291), this.ae), (byte)36);
               int var14 = var1.ct(-1958548544);
               var18.bl(var14, (this.at += 2093376743) * 856321751 - 1, (byte)-19);
               var18.af = var1.cg((short)-9612) * 1260124039;
               var1.cs(17453688);
               this.ap(var18, 1389711856);
            }

         }
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "sp.ar(" + ')');
      }
   }

   public final void ay(vf var1) {
      wf var2 = new wf(var1.cs(-1022517082), this.ae);
      int var3 = var1.ct(-1402127432);
      byte var4 = var1.cg((short)11919);
      boolean var5 = false;
      if (var4 == -128) {
         var5 = true;
      }

      sh var6;
      if (var5) {
         if (this.bf(1363647746) == 0) {
            return;
         }

         var6 = (sh)this.ba(var2, 779507487);
         if (var6 != null && var6.bz(1364974980) == var3) {
            this.by(var6, (byte)118);
         }
      } else {
         var1.cs(-801368983);
         var6 = (sh)this.ba(var2, 769407875);
         if (null == var6) {
            if (this.bf(1363647746) > this.au * 1991364691) {
               return;
            }

            var6 = (sh)this.bb(var2, (byte)36);
         }

         var6.bl(var3, (this.at += -674985914) * 856321751 - 1, (byte)-65);
         var6.af = 1260124039 * var4;
         this.ap(var6, 1389711856);
      }

   }

   public final void ad(byte var1) {
      try {
         for(int var2 = 0; var2 < this.bf(1363647746); ++var2) {
            ((sh)this.bg(var2, -448563888)).ac(2129568026);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sp.ad(" + ')');
      }
   }

   public final void ah(byte var1) {
      try {
         for(int var2 = 0; var2 < this.bf(1363647746); ++var2) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            ((sh)this.bg(var2, 1547516718)).aq((byte)1);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sp.ah(" + ')');
      }
   }

   public final void an() {
      for(int var1 = 0; var1 < this.bf(1363647746); ++var1) {
         ((sh)this.bg(var1, -51989371)).aq((byte)1);
      }

   }

   public final void ai(vf var1, int var2) {
      this.au(var1.cs(59036362), 1743780119);
      long var3 = var1.cw(429939853);
      long var6 = var3;
      String var5;
      int var8;
      if (var3 > 0L && var3 < 6582952005840035281L) {
         if (var3 % 37L == 0L) {
            var5 = null;
         } else {
            var8 = 0;

            for(long var9 = var3; 0L != var9; var9 /= 37L) {
               ++var8;
            }

            StringBuilder var11 = new StringBuilder(var8);

            while(0L != var6) {
               long var12 = var6;
               var6 /= 37L;
               var11.append(qj.ac[(int)(var12 - var6 * 37L)]);
            }

            var5 = var11.reverse().toString();
         }
      } else {
         var5 = null;
      }

      this.ag(var5, (byte)-94);
      this.aq = var1.cg((short)-6064);
      short var14;
      if (var2 == 1) {
         var8 = var1.cv(952452697);
         var14 = 255;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var8 = var1.dp((byte)102);
         var14 = -1;
      }

      if (var14 != var8) {
         int var10 = var8;
         this.bx(968486550);

         for(int var15 = 0; var15 < var10; ++var15) {
            sh var16 = (sh)this.bb(new wf(var1.cs(-1572976525), this.ae), (byte)36);
            int var13 = var1.ct(-1356154135);
            var16.bl(var13, (this.at += 2093376743) * 856321751 - 1, (byte)-19);
            var16.af = var1.cg((short)-7439) * 1260124039;
            var1.cs(1963160087);
            this.ap(var16, 1389711856);
         }

      }
   }

   ss[] ax(int var1) {
      return new sh[var1];
   }

   final void ab(String var1) {
      this.am = ur.ag(var1, -909163431);
   }

   final void ap(sh var1, int var2) {
      try {
         if (var1.bh((byte)-95).equals(this.ag.pe(616356373))) {
            if (var2 != 1389711856) {
               return;
            }

            this.af = var1.af * -708994939;
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sp.ap(" + ')');
      }
   }

   public final void al(vf var1, byte var2) {
      try {
         wf var3 = new wf(var1.cs(-145797934), this.ae);
         int var4 = var1.ct(-1549787430);
         byte var5 = var1.cg((short)2339);
         boolean var6 = false;
         if (var5 == -128) {
            if (var2 != 1) {
               throw new IllegalStateException();
            }

            var6 = true;
         }

         sh var7;
         if (var6) {
            if (var2 != 1) {
               throw new IllegalStateException();
            }

            if (this.bf(1363647746) == 0) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               return;
            }

            var7 = (sh)this.ba(var3, 1350922583);
            if (var7 != null) {
               if (var2 != 1) {
                  return;
               }

               if (var7.bz(1364974980) == var4) {
                  if (var2 != 1) {
                     return;
                  }

                  this.by(var7, (byte)115);
               }
            }
         } else {
            var1.cs(-209050120);
            var7 = (sh)this.ba(var3, -847648958);
            if (null == var7) {
               if (this.bf(1363647746) > this.au * 1991364691) {
                  return;
               }

               var7 = (sh)this.bb(var3, (byte)36);
            }

            var7.bl(var4, (this.at += 2093376743) * 856321751 - 1, (byte)-105);
            var7.af = 1260124039 * var5;
            this.ap(var7, 1389711856);
         }

      } catch (RuntimeException var8) {
         throw vk.ae(var8, "sp.al(" + ')');
      }
   }

   ss[] at(int var1) {
      return new sh[var1];
   }

   final void az(String var1) {
      String var3 = mj.ae(fo.ac(var1, -1944651985));
      if (null == var3) {
         var3 = "";
      }

      this.ax = var3;
   }

   final void aa(String var1) {
      String var3 = mj.ae(fo.ac(var1, -793326936));
      if (null == var3) {
         var3 = "";
      }

      this.ax = var3;
   }

   ss[] aq(int var1) {
      return new sh[var1];
   }

   public final void ao(vf var1, int var2) {
      this.au(var1.cs(-504036122), -153534930);
      long var3 = var1.cw(208867443);
      long var6 = var3;
      String var5;
      int var8;
      if (var3 > 0L && var3 < 6582952005840035281L) {
         if (var3 % 37L == 0L) {
            var5 = null;
         } else {
            var8 = 0;

            for(long var9 = var3; 0L != var9; var9 /= 37L) {
               ++var8;
            }

            StringBuilder var11 = new StringBuilder(var8);

            while(0L != var6) {
               long var12 = var6;
               var6 /= 37L;
               var11.append(qj.ac[(int)(var12 - var6 * 37L)]);
            }

            var5 = var11.reverse().toString();
         }
      } else {
         var5 = null;
      }

      this.ag(var5, (byte)-48);
      this.aq = var1.cg((short)-12155);
      short var14;
      if (var2 == 1) {
         var8 = var1.cv(952452697);
         var14 = 255;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var8 = var1.dp((byte)45);
         var14 = -1;
      }

      if (var14 != var8) {
         int var10 = var8;
         this.bx(27514077);

         for(int var15 = 0; var15 < var10; ++var15) {
            sh var16 = (sh)this.bb(new wf(var1.cs(-2073834356), this.ae), (byte)36);
            int var13 = var1.ct(-1875823043);
            var16.bl(var13, (this.at += -1713840116) * -790339866 - 1, (byte)-81);
            var16.af = var1.cg((short)7078) * 1011272412;
            var1.cs(-1168578741);
            this.ap(var16, 1389711856);
         }

      }
   }

   public final void as(vf var1, int var2) {
      this.au(var1.cs(603917757), 479674042);
      long var3 = var1.cw(2137581159);
      long var6 = var3;
      String var5;
      int var8;
      if (var3 > 0L && var3 < 6582952005840035281L) {
         if (var3 % 37L == 0L) {
            var5 = null;
         } else {
            var8 = 0;

            for(long var9 = var3; 0L != var9; var9 /= 37L) {
               ++var8;
            }

            StringBuilder var11 = new StringBuilder(var8);

            while(0L != var6) {
               long var12 = var6;
               var6 /= 37L;
               var11.append(qj.ac[(int)(var12 - var6 * 37L)]);
            }

            var5 = var11.reverse().toString();
         }
      } else {
         var5 = null;
      }

      this.ag(var5, (byte)-75);
      this.aq = var1.cg((short)-8935);
      short var14;
      if (var2 == 1) {
         var8 = var1.cv(952452697);
         var14 = 255;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var8 = var1.dp((byte)50);
         var14 = -1;
      }

      if (var14 != var8) {
         int var10 = var8;
         this.bx(-72542659);

         for(int var15 = 0; var15 < var10; ++var15) {
            sh var16 = (sh)this.bb(new wf(var1.cs(374255466), this.ae), (byte)36);
            int var13 = var1.ct(-1871374678);
            var16.bl(var13, (this.at += -11661620) * 856321751 - 1, (byte)-89);
            var16.af = var1.cg((short)9840) * 1260124039;
            var1.cs(1341366871);
            this.ap(var16, 1389711856);
         }

      }
   }

   ss[] af(int var1) {
      return new sh[var1];
   }

   public final void aj(vf var1) {
      wf var2 = new wf(var1.cs(-837091633), this.ae);
      int var3 = var1.ct(-1448039561);
      byte var4 = var1.cg((short)19996);
      boolean var5 = false;
      if (var4 == -128) {
         var5 = true;
      }

      sh var6;
      if (var5) {
         if (this.bf(1363647746) == 0) {
            return;
         }

         var6 = (sh)this.ba(var2, -458755573);
         if (var6 != null && var6.bz(1364974980) == var3) {
            this.by(var6, (byte)87);
         }
      } else {
         var1.cs(-1514840903);
         var6 = (sh)this.ba(var2, 754696641);
         if (null == var6) {
            if (this.bf(1363647746) > this.au * 1991364691) {
               return;
            }

            var6 = (sh)this.bb(var2, (byte)36);
         }

         var6.bl(var3, (this.at += 2093376743) * 856321751 - 1, (byte)-116);
         var6.af = 1260124039 * var4;
         this.ap(var6, 1389711856);
      }

   }

   public final void bn() {
      for(int var1 = 0; var1 < this.bf(1363647746); ++var1) {
         ((sh)this.bg(var1, 1222520311)).aq((byte)1);
      }

   }

   public final void aw() {
      for(int var1 = 0; var1 < this.bf(1363647746); ++var1) {
         ((sh)this.bg(var1, -1040654002)).ac(2137060969);
      }

   }

   final void bh(sh var1) {
      if (var1.bh((byte)-72).equals(this.ag.pe(616356373))) {
         this.af = var1.af * -708994939;
      }

   }

   public final void ak() {
      for(int var1 = 0; var1 < this.bf(1363647746); ++var1) {
         ((sh)this.bg(var1, 1069414163)).aq((byte)1);
      }

   }

   public sp(ub var1, rm var2) {
      try {
         super(500);
         this.am = null;
         this.ax = null;
         this.at = 2093376743;
         this.ae = var1;
         this.ag = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sp.<init>(" + ')');
      }
   }

   public final void av() {
      for(int var1 = 0; var1 < this.bf(1363647746); ++var1) {
         ((sh)this.bg(var1, 204012888)).ac(2129905792);
      }

   }

   final void bd(sh var1) {
      if (var1.bh((byte)-4).equals(this.ag.pe(616356373))) {
         this.af = var1.af * -708994939;
      }

   }
}
