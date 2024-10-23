import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class lu {
   static final long bb = 2047L;
   static final int wr = 14;
   boolean aw;
   vv aj;
   HashMap ai;
   kb[][] ay;
   HashMap as;
   vc[] ae;
   final pe am;
   final pe at;
   lq ak;
   int an;
   public int ab;
   int af;
   int ar;
   boolean ap;
   int ao;
   final HashMap au;
   static oy cn;

   public final void ad(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      ls var14 = this.as(var1, var2, var3, var4, 1530826953);
      float var15 = this.an(var7 - var5, var3 - var1, -1083353722);
      int var16 = (int)(64.0F * var15);
      int var17 = 482041609 * this.an + var1;
      int var18 = var2 + -780575113 * this.ao;

      int var19;
      int var20;
      for(var19 = 527392937 * var14.ak; var19 < var14.ap * 52647512 + var14.ak * 527392937; ++var19) {
         for(var20 = var14.aj * -63485769; var20 < var14.aw * 1775400951 + var14.aj * -63485769; ++var20) {
            if (var13) {
               this.ay[var19][var20].am(-1220865551);
            }

            this.ay[var19][var20].af(var16 * (2055295878 * this.ay[var19][var20].ay - var17) / -1337796200 + var5, var8 - (541820736 * this.ay[var19][var20].as - var18 + 2070754282) * var16 / 64, var16, var9, (byte)-99);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var19 = 527392937 * var14.ak; var19 < 527392937 * var14.ak + 1460416259 * var14.ap; ++var19) {
            for(var20 = var14.aj * -63485769; var20 < var14.aw * 1775400951 + -63485769 * var14.aj; ++var20) {
               this.ay[var19][var20].ar(var10, var11, var12, 1950041465);
            }
         }
      }

   }

   public void ap(pe var1, String var2, boolean var3, int var4) {
      try {
         if (this.aw) {
            if (var4 >= 1182130804) {
               throw new IllegalStateException();
            }
         } else {
            this.ap = false;
            this.aw = true;
            System.nanoTime();
            int var5 = var1.cf(lc.ap.ay, (byte)111);
            int var6 = var1.cl(var5, var2, (short)-26190);
            vl var7 = new vl(var1.cv(lc.ap.ay, var2, 1197864797));
            vl var8 = new vl(var1.cv(lc.aw.ay, var2, 1197864797));
            System.nanoTime();
            System.nanoTime();
            this.ak = new lq();

            try {
               this.ak.ct(var7, var8, var6, var3, (byte)82);
            } catch (IllegalStateException var17) {
               return;
            }

            this.ak.ad(-204817154);
            this.ak.ac(-1999942107);
            this.ak.av(637831648);
            this.an = this.ak.ar((byte)-12) * -772288960;
            this.ao = this.ak.az((byte)0) * -596192832;
            this.af = (this.ak.ab((byte)30) - this.ak.ar((byte)49) + 1) * 1733440960;
            this.ar = (this.ak.ag(1724519510) - this.ak.az((byte)0) + 1) * 694528192;
            int var9 = this.ak.ab((byte)-25) - this.ak.ar((byte)-60) + 1;
            int var10 = this.ak.ag(1422984694) - this.ak.az((byte)0) + 1;
            System.nanoTime();
            System.nanoTime();
            kb.ai.as();
            this.ay = new kb[var9][var10];
            Iterator var11 = this.ak.af.iterator();

            while(var11.hasNext()) {
               kw var12 = (kw)var11.next();
               int var13 = -675862191 * var12.as;
               int var14 = -1304526755 * var12.ae;
               int var15 = var13 - this.ak.ar((byte)-23);
               int var16 = var14 - this.ak.az((byte)0);
               this.ay[var15][var16] = new kb(var13, var14, this.ak.an((byte)-12), this.au);
               this.ay[var15][var16].ai(var12, this.ak.ab, 28362107);
            }

            for(int var19 = 0; var19 < var9; ++var19) {
               if (var4 >= 1182130804) {
                  return;
               }

               for(int var21 = 0; var21 < var10; ++var21) {
                  if (var4 >= 1182130804) {
                     return;
                  }

                  if (this.ay[var19][var21] == null) {
                     if (var4 >= 1182130804) {
                        return;
                     }

                     this.ay[var19][var21] = new kb(this.ak.ar((byte)115) + var19, this.ak.az((byte)0) + var21, this.ak.an((byte)-4), this.au);
                     this.ay[var19][var21].ay(this.ak.ar, this.ak.ab, -728721801);
                  }
               }
            }

            System.nanoTime();
            System.nanoTime();
            if (var1.cp(lc.ak.ay, var2, -637561867)) {
               if (var4 >= 1182130804) {
                  throw new IllegalStateException();
               }

               byte[] var20 = var1.cv(lc.ak.ay, var2, 1197864797);
               this.aj = sp.ap(var20, (byte)124);
            }

            System.nanoTime();
            var1.cd((byte)75);
            var1.cn(1556083218);
            this.ap = true;
         }
      } catch (RuntimeException var18) {
         throw tm.aw(var18, "lu.ap(" + ')');
      }
   }

   ls bj(int var1, int var2, int var3, int var4) {
      ls var5 = new ls(this);
      int var6 = var1 + 482041609 * this.an;
      int var7 = this.ao * -780575113 + var2;
      int var8 = var3 + this.an * 482041609;
      int var9 = this.ao * -780575113 + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.ap = 1893020587 * (1 + (var12 - var10));
      var5.aw = -2137556537 * (var13 - var11 + 1);
      var5.ak = (var10 - this.ak.ar((byte)-38)) * -840219751;
      var5.aj = (var11 - this.ak.az((byte)0)) * -123071225;
      if (527392937 * var5.ak < 0) {
         var5.ap += -1941685277 * var5.ak;
         var5.ak = 0;
      }

      if (var5.ak * 527392937 > this.ay.length - var5.ap * 1460416259) {
         var5.ap = (this.ay.length - 527392937 * var5.ak) * 1893020587;
      }

      if (var5.aj * -63485769 < 0) {
         var5.aw += -1807153855 * var5.aj;
         var5.aj = 0;
      }

      if (-63485769 * var5.aj > this.ay[0].length - var5.aw * 1775400951) {
         var5.aw = (this.ay[0].length - -63485769 * var5.aj) * -2137556537;
      }

      var5.ap = Math.min(var5.ap * 1460416259, this.ay.length) * 1893020587;
      var5.aw = Math.min(1775400951 * var5.aw, this.ay[0].length) * -2137556537;
      return var5;
   }

   public final void aw(byte var1) {
      try {
         this.ai = null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "lu.aw(" + ')');
      }
   }

   public void ax(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.aj) {
         this.aj.ar(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.ai == null) {
               this.au((byte)-9);
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.ai.get(var9);
               } while(null == var10);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  lx var12 = (lx)var11.next();
                  int var13 = var3 * (var12.as.aw * 1601399073 - this.an * 482041609) / (1742744295 * this.af);
                  int var14 = var4 - (-1982010185 * var12.as.ak - this.ao * -780575113) * var4 / (this.ar * 1460503527);
                  vz.er(var1 + var13, var14 + var2, 2, -1143478930, 256);
               }
            }
         }
      }
   }

   public boolean bb() {
      return this.ap;
   }

   public List ay(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      try {
         LinkedList var12 = new LinkedList();
         if (!this.ap) {
            if (var11 >= -1615791526) {
               throw new IllegalStateException();
            } else {
               return var12;
            }
         } else {
            ls var13 = this.as(var1, var2, var3, var4, 1716816192);
            float var14 = this.an(var7, var3 - var1, -1083353722);
            int var15 = (int)(64.0F * var14);
            int var16 = var1 + this.an * 482041609;
            int var17 = this.ao * -780575113 + var2;

            for(int var18 = var13.ak * 527392937; var18 < var13.ap * 1460416259 + var13.ak * 527392937; ++var18) {
               if (var11 >= -1615791526) {
                  throw new IllegalStateException();
               }

               for(int var19 = var13.aj * -63485769; var19 < var13.aj * -63485769 + var13.aw * 1775400951; ++var19) {
                  List var20 = this.ay[var18][var19].bc(var15 * (this.ay[var18][var19].ay * 185591744 - var16) / 64 + var5, var8 + var6 - var15 * (541820736 * this.ay[var18][var19].as - var17 + 64) / 64, var15, var9, var10, -2002078575);
                  if (!var20.isEmpty()) {
                     var12.addAll(var20);
                  }
               }
            }

            return var12;
         }
      } catch (RuntimeException var21) {
         throw tm.aw(var21, "lu.ay(" + ')');
      }
   }

   ls as(int var1, int var2, int var3, int var4, int var5) {
      try {
         ls var6 = new ls(this);
         int var7 = var1 + 482041609 * this.an;
         int var8 = this.ao * -780575113 + var2;
         int var9 = var3 + this.an * 482041609;
         int var10 = this.ao * -780575113 + var4;
         int var11 = var7 / 64;
         int var12 = var8 / 64;
         int var13 = var9 / 64;
         int var14 = var10 / 64;
         var6.ap = 1893020587 * (1 + (var13 - var11));
         var6.aw = -2137556537 * (var14 - var12 + 1);
         var6.ak = (var11 - this.ak.ar((byte)-40)) * -840219751;
         var6.aj = (var12 - this.ak.az((byte)0)) * -123071225;
         if (527392937 * var6.ak < 0) {
            if (var5 <= 1286577357) {
               throw new IllegalStateException();
            }

            var6.ap += -1941685277 * var6.ak;
            var6.ak = 0;
         }

         if (var6.ak * 527392937 > this.ay.length - var6.ap * 1460416259) {
            if (var5 <= 1286577357) {
               throw new IllegalStateException();
            }

            var6.ap = (this.ay.length - 527392937 * var6.ak) * 1893020587;
         }

         if (var6.aj * -63485769 < 0) {
            if (var5 <= 1286577357) {
               throw new IllegalStateException();
            }

            var6.aw += -1807153855 * var6.aj;
            var6.aj = 0;
         }

         if (-63485769 * var6.aj > this.ay[0].length - var6.aw * 1775400951) {
            if (var5 <= 1286577357) {
               throw new IllegalStateException();
            }

            var6.aw = (this.ay[0].length - -63485769 * var6.aj) * -2137556537;
         }

         var6.ap = Math.min(var6.ap * 1460416259, this.ay.length) * 1893020587;
         var6.aw = Math.min(1775400951 * var6.aw, this.ay[0].length) * -2137556537;
         return var6;
      } catch (RuntimeException var15) {
         throw tm.aw(var15, "lu.as(" + ')');
      }
   }

   public boolean ae(int var1) {
      try {
         return this.ap;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "lu.ae(" + ')');
      }
   }

   public int am(int var1) {
      try {
         return this.ak.ao(1339513315);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "lu.am(" + ')');
      }
   }

   public HashMap at(int var1) {
      try {
         this.au((byte)-50);
         return this.ai;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "lu.at(" + ')');
      }
   }

   void au(byte var1) {
      try {
         if (null == this.ai) {
            if (var1 >= 7) {
               throw new IllegalStateException();
            }

            this.ai = new HashMap();
         }

         this.ai.clear();

         for(int var2 = 0; var2 < this.ay.length; ++var2) {
            if (var1 >= 7) {
               throw new IllegalStateException();
            }

            for(int var3 = 0; var3 < this.ay[var2].length; ++var3) {
               if (var1 >= 7) {
                  return;
               }

               List var4 = this.ay[var2][var3].by(1729776116);
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  if (var1 >= 7) {
                     return;
                  }

                  lx var6 = (lx)var5.next();
                  if (!var6.ab((byte)-21)) {
                     if (var1 >= 7) {
                        throw new IllegalStateException();
                     }
                  } else {
                     int var7 = var6.aw(699650203);
                     if (!this.ai.containsKey(var7)) {
                        if (var1 >= 7) {
                           return;
                        }

                        LinkedList var8 = new LinkedList();
                        var8.add(var6);
                        this.ai.put(var7, var8);
                     } else {
                        List var10 = (List)this.ai.get(var7);
                        var10.add(var6);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var9) {
         throw tm.aw(var9, "lu.au(" + ')');
      }
   }

   float an(int var1, int var2, int var3) {
      try {
         float var4 = (float)var1 / (float)var2;
         if (var4 > 8.0F) {
            if (var3 != -1083353722) {
               throw new IllegalStateException();
            } else {
               return 8.0F;
            }
         } else if (var4 < 1.0F) {
            if (var3 != -1083353722) {
               throw new IllegalStateException();
            } else {
               return 1.0F;
            }
         } else {
            int var5 = Math.round(var4);
            return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "lu.an(" + ')');
      }
   }

   public void ao(pe var1, String var2, boolean var3) {
      if (!this.aw) {
         this.ap = false;
         this.aw = true;
         System.nanoTime();
         int var4 = var1.cf(lc.ap.ay, (byte)89);
         int var5 = var1.cl(var4, var2, (short)-17236);
         vl var6 = new vl(var1.cv(lc.ap.ay, var2, 1197864797));
         vl var7 = new vl(var1.cv(lc.aw.ay, var2, 1197864797));
         System.nanoTime();
         System.nanoTime();
         this.ak = new lq();

         try {
            this.ak.ct(var6, var7, var5, var3, (byte)80);
         } catch (IllegalStateException var16) {
            return;
         }

         this.ak.ad(1737909036);
         this.ak.ac(-1595579573);
         this.ak.av(637831648);
         this.an = this.ak.ar((byte)-58) * -772288960;
         this.ao = this.ak.az((byte)0) * -596192832;
         this.af = (this.ak.ab((byte)13) - this.ak.ar((byte)-108) + 1) * 1733440960;
         this.ar = (this.ak.ag(1180877201) - this.ak.az((byte)0) + 1) * 694528192;
         int var8 = this.ak.ab((byte)27) - this.ak.ar((byte)83) + 1;
         int var9 = this.ak.ag(551662626) - this.ak.az((byte)0) + 1;
         System.nanoTime();
         System.nanoTime();
         kb.ai.as();
         this.ay = new kb[var8][var9];
         Iterator var10 = this.ak.af.iterator();

         while(var10.hasNext()) {
            kw var11 = (kw)var10.next();
            int var12 = -675862191 * var11.as;
            int var13 = -1304526755 * var11.ae;
            int var14 = var12 - this.ak.ar((byte)-13);
            int var15 = var13 - this.ak.az((byte)0);
            this.ay[var14][var15] = new kb(var12, var13, this.ak.an((byte)-56), this.au);
            this.ay[var14][var15].ai(var11, this.ak.ab, -186657720);
         }

         for(int var17 = 0; var17 < var8; ++var17) {
            for(int var19 = 0; var19 < var9; ++var19) {
               if (this.ay[var17][var19] == null) {
                  this.ay[var17][var19] = new kb(this.ak.ar((byte)41) + var17, this.ak.az((byte)0) + var19, this.ak.an((byte)0), this.au);
                  this.ay[var17][var19].ay(this.ak.ar, this.ak.ab, -763401896);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.cp(lc.ak.ay, var2, -637561867)) {
            byte[] var18 = var1.cv(lc.ak.ay, var2, 1197864797);
            this.aj = sp.ap(var18, (byte)21);
         }

         System.nanoTime();
         var1.cd((byte)75);
         var1.cn(717927063);
         this.ap = true;
      }
   }

   public void af(pe var1, String var2, boolean var3) {
      if (!this.aw) {
         this.ap = false;
         this.aw = true;
         System.nanoTime();
         int var4 = var1.cf(lc.ap.ay, (byte)98);
         int var5 = var1.cl(var4, var2, (short)-4112);
         vl var6 = new vl(var1.cv(lc.ap.ay, var2, 1197864797));
         vl var7 = new vl(var1.cv(lc.aw.ay, var2, 1197864797));
         System.nanoTime();
         System.nanoTime();
         this.ak = new lq();

         try {
            this.ak.ct(var6, var7, var5, var3, (byte)90);
         } catch (IllegalStateException var16) {
            return;
         }

         this.ak.ad(1421439890);
         this.ak.ac(-1304448946);
         this.ak.av(637831648);
         this.an = this.ak.ar((byte)26) * -772288960;
         this.ao = this.ak.az((byte)0) * 1148102045;
         this.af = (this.ak.ab((byte)-25) - this.ak.ar((byte)7) + 1) * 47454293;
         this.ar = (this.ak.ag(-1552142185) - this.ak.az((byte)0) + 1) * -2085480573;
         int var8 = this.ak.ab((byte)65) - this.ak.ar((byte)24) + 1;
         int var9 = this.ak.ag(-2079116098) - this.ak.az((byte)0) + 1;
         System.nanoTime();
         System.nanoTime();
         kb.ai.as();
         this.ay = new kb[var8][var9];
         Iterator var10 = this.ak.af.iterator();

         while(var10.hasNext()) {
            kw var11 = (kw)var10.next();
            int var12 = -675862191 * var11.as;
            int var13 = -1465868683 * var11.ae;
            int var14 = var12 - this.ak.ar((byte)-41);
            int var15 = var13 - this.ak.az((byte)0);
            this.ay[var14][var15] = new kb(var12, var13, this.ak.an((byte)-92), this.au);
            this.ay[var14][var15].ai(var11, this.ak.ab, 1837712274);
         }

         for(int var17 = 0; var17 < var8; ++var17) {
            for(int var19 = 0; var19 < var9; ++var19) {
               if (this.ay[var17][var19] == null) {
                  this.ay[var17][var19] = new kb(this.ak.ar((byte)9) + var17, this.ak.az((byte)0) + var19, this.ak.an((byte)-12), this.au);
                  this.ay[var17][var19].ay(this.ak.ar, this.ak.ab, -741580513);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.cp(lc.ak.ay, var2, -637561867)) {
            byte[] var18 = var1.cv(lc.ak.ay, var2, 1197864797);
            this.aj = sp.ap(var18, (byte)24);
         }

         System.nanoTime();
         var1.cd((byte)75);
         var1.cn(997498985);
         this.ap = true;
      }
   }

   public lu(vc[] var1, HashMap var2, pe var3, pe var4) {
      try {
         super();
         this.ap = false;
         this.aw = false;
         this.as = new HashMap();
         this.ab = 0;
         this.ae = var1;
         this.au = var2;
         this.am = var3;
         this.at = var4;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "lu.<init>(" + ')');
      }
   }

   public final void ab() {
      this.ai = null;
   }

   float by(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
      }
   }

   public final void ac(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      ls var14 = this.as(var1, var2, var3, var4, 1937951424);
      float var15 = this.an(var7 - var5, var3 - var1, -1083353722);
      int var16 = (int)(64.0F * var15);
      int var17 = 482041609 * this.an + var1;
      int var18 = var2 + -780575113 * this.ao;

      int var19;
      int var20;
      for(var19 = 527392937 * var14.ak; var19 < var14.ap * 1460416259 + var14.ak * 527392937; ++var19) {
         for(var20 = var14.aj * -63485769; var20 < var14.aw * 1775400951 + var14.aj * -63485769; ++var20) {
            if (var13) {
               this.ay[var19][var20].am(1232457516);
            }

            this.ay[var19][var20].af(var16 * (185591744 * this.ay[var19][var20].ay - var17) / 64 + var5, var8 - (541820736 * this.ay[var19][var20].as - var18 + 64) * var16 / 64, var16, var9, (byte)-58);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var19 = 527392937 * var14.ak; var19 < 527392937 * var14.ak + 1460416259 * var14.ap; ++var19) {
            for(var20 = var14.aj * -63485769; var20 < var14.aw * 1775400951 + -63485769 * var14.aj; ++var20) {
               this.ay[var19][var20].ar(var10, var11, var12, 1482652233);
            }
         }
      }

   }

   public final void ak(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         int[] var10 = vz.al;
         int var11 = vz.aa;
         int var12 = vz.ah;
         float[] var13 = vz.bh;
         int[] var14 = new int[4];
         vz.ez(var14);
         ls var15 = this.as(var1, var2, var3, var4, 1790080323);
         float var16 = this.an(var7 - var5, var3 - var1, -1083353722);
         int var17 = (int)Math.ceil((double)var16);
         this.ab = -268413679 * var17;
         if (!this.as.containsKey(var17)) {
            ll var18 = new ll(var17);
            var18.aj(-916365929);
            this.as.put(var17, var18);
         }

         int var26 = 527392937 * var15.ak + var15.ap * 1460416259 - 1;
         int var19 = var15.aw * 1775400951 + var15.aj * -63485769 - 1;

         int var20;
         int var21;
         for(var20 = var15.ak * 527392937; var20 <= var26; ++var20) {
            if (var9 == -981985653) {
               throw new IllegalStateException();
            }

            for(var21 = -63485769 * var15.aj; var21 <= var19; ++var21) {
               if (var9 == -981985653) {
                  throw new IllegalStateException();
               }

               this.ay[var20][var21].ao(var17, (ll)this.as.get(var17), this.ae, this.am, this.at, 0.725D);
            }
         }

         jm.ar(var10, var11, var12, var13);
         vz.ey(var14);
         var20 = (int)(var16 * 64.0F);
         var21 = this.an * 482041609 + var1;
         int var22 = this.ao * -780575113 + var2;

         for(int var23 = 527392937 * var15.ak; var23 < var15.ak * 527392937 + 1460416259 * var15.ap; ++var23) {
            if (var9 == -981985653) {
               throw new IllegalStateException();
            }

            for(int var24 = -63485769 * var15.aj; var24 < 1775400951 * var15.aw + -63485769 * var15.aj; ++var24) {
               if (var9 == -981985653) {
                  throw new IllegalStateException();
               }

               this.ay[var23][var24].aj((185591744 * this.ay[var23][var24].ay - var21) * var20 / 64 + var5, var8 - var20 * (this.ay[var23][var24].as * 541820736 - var22 + 64) / 64, var20, -1731510697);
            }
         }

      } catch (RuntimeException var25) {
         throw tm.aw(var25, "lu.ak(" + ')');
      }
   }

   public void aq(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.aj) {
         this.aj.ar(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.ai == null) {
               this.au((byte)-121);
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.ai.get(var9);
               } while(null == var10);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  lx var12 = (lx)var11.next();
                  int var13 = var3 * (var12.as.aw * 1601399073 - this.an * 482041609) / (1742744295 * this.af);
                  int var14 = var4 - (-1982010185 * var12.as.ak - this.ao * -780575113) * var4 / (this.ar * -1311322869);
                  vz.er(var1 + var13, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public final void av(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      ls var14 = this.as(var1, var2, var3, var4, 1958516195);
      float var15 = this.an(var7 - var5, var3 - var1, -1083353722);
      int var16 = (int)(64.0F * var15);
      int var17 = 482041609 * this.an + var1;
      int var18 = var2 + -780575113 * this.ao;

      int var19;
      int var20;
      for(var19 = 527392937 * var14.ak; var19 < var14.ap * 1460416259 + var14.ak * 527392937; ++var19) {
         for(var20 = var14.aj * -63485769; var20 < var14.aw * 1775400951 + var14.aj * -63485769; ++var20) {
            if (var13) {
               this.ay[var19][var20].am(-495365785);
            }

            this.ay[var19][var20].af(var16 * (185591744 * this.ay[var19][var20].ay - var17) / 64 + var5, var8 - (541820736 * this.ay[var19][var20].as - var18 + 64) * var16 / 64, var16, var9, (byte)-72);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var19 = 527392937 * var14.ak; var19 < 527392937 * var14.ak + 1460416259 * var14.ap; ++var19) {
            for(var20 = var14.aj * -63485769; var20 < var14.aw * 1775400951 + -63485769 * var14.aj; ++var20) {
               this.ay[var19][var20].ar(var10, var11, var12, 1115801753);
            }
         }
      }

   }

   void bz() {
      if (null == this.ai) {
         this.ai = new HashMap();
      }

      this.ai.clear();

      for(int var1 = 0; var1 < this.ay.length; ++var1) {
         for(int var2 = 0; var2 < this.ay[var1].length; ++var2) {
            List var3 = this.ay[var1][var2].by(1650630330);
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               lx var5 = (lx)var4.next();
               if (var5.ab((byte)-7)) {
                  int var6 = var5.aw(1923934957);
                  if (!this.ai.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.ai.put(var6, var7);
                  } else {
                     List var8 = (List)this.ai.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   float br(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
      }
   }

   public void al(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.aj) {
         this.aj.ar(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.ai == null) {
               this.au((byte)-35);
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.ai.get(var9);
               } while(null == var10);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  lx var12 = (lx)var11.next();
                  int var13 = var3 * (var12.as.aw * 2018811485 - this.an * -2013441019) / (143540958 * this.af);
                  int var14 = var4 - (1399570344 * var12.as.ak - this.ao * -780575113) * var4 / (this.ar * -297476030);
                  vz.er(var1 + var13, var14 + var2, 2, -1474472240, 256);
               }
            }
         }
      }
   }

   public List aa(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.ap) {
         return var11;
      } else {
         ls var12 = this.as(var1, var2, var3, var4, 1643516755);
         float var13 = this.an(var7, var3 - var1, -1083353722);
         int var14 = (int)(64.0F * var13);
         int var15 = var1 + this.an * 482041609;
         int var16 = this.ao * -780575113 + var2;

         for(int var17 = var12.ak * -520164598; var17 < var12.ap * 132404034 + var12.ak * 943376506; ++var17) {
            for(int var18 = var12.aj * -63485769; var18 < var12.aj * 552684433 + var12.aw * 349263900; ++var18) {
               List var19 = this.ay[var17][var18].bc(var14 * (this.ay[var17][var18].ay * 185591744 - var15) / 64 + var5, var8 + var6 - var14 * (541820736 * this.ay[var17][var18].as - var16 + 1746585326) / 1075415569, var14, var9, var10, -1531167474);
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   public List ah(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.ap) {
         return var11;
      } else {
         ls var12 = this.as(var1, var2, var3, var4, 1585365071);
         float var13 = this.an(var7, var3 - var1, -1083353722);
         int var14 = (int)(64.0F * var13);
         int var15 = var1 + this.an * 482041609;
         int var16 = this.ao * -780575113 + var2;

         for(int var17 = var12.ak * 527392937; var17 < var12.ap * 1460416259 + var12.ak * 527392937; ++var17) {
            for(int var18 = var12.aj * -63485769; var18 < var12.aj * -63485769 + var12.aw * 1775400951; ++var18) {
               List var19 = this.ay[var17][var18].bc(var14 * (this.ay[var17][var18].ay * 185591744 - var15) / 64 + var5, var8 + var6 - var14 * (541820736 * this.ay[var17][var18].as - var16 + 64) / 64, var14, var9, var10, -2097516769);
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   ls bh(int var1, int var2, int var3, int var4) {
      ls var5 = new ls(this);
      int var6 = var1 + 482041609 * this.an;
      int var7 = this.ao * -780575113 + var2;
      int var8 = var3 + this.an * 482041609;
      int var9 = this.ao * -780575113 + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.ap = 1893020587 * (1 + (var12 - var10));
      var5.aw = -2137556537 * (var13 - var11 + 1);
      var5.ak = (var10 - this.ak.ar((byte)98)) * -840219751;
      var5.aj = (var11 - this.ak.az((byte)0)) * -123071225;
      if (527392937 * var5.ak < 0) {
         var5.ap += -1941685277 * var5.ak;
         var5.ak = 0;
      }

      if (var5.ak * 527392937 > this.ay.length - var5.ap * 1460416259) {
         var5.ap = (this.ay.length - 527392937 * var5.ak) * 1893020587;
      }

      if (var5.aj * -63485769 < 0) {
         var5.aw += -1807153855 * var5.aj;
         var5.aj = 0;
      }

      if (-63485769 * var5.aj > this.ay[0].length - var5.aw * 1775400951) {
         var5.aw = (this.ay[0].length - -63485769 * var5.aj) * -2137556537;
      }

      var5.ap = Math.min(var5.ap * 1460416259, this.ay.length) * 1893020587;
      var5.aw = Math.min(1775400951 * var5.aw, this.ay[0].length) * -2137556537;
      return var5;
   }

   public void ai(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7, int var8) {
      try {
         if (null == this.aj) {
            if (var8 == 1950824464) {
               throw new IllegalStateException();
            }
         } else {
            this.aj.ar(var1, var2, var3, var4);
            if (var6 > 0) {
               if (var8 == 1950824464) {
                  throw new IllegalStateException();
               }

               if (var6 % var7 < var7 / 2) {
                  if (this.ai == null) {
                     this.au((byte)-33);
                  }

                  Iterator var9 = var5.iterator();

                  label58:
                  do {
                     while(var9.hasNext()) {
                        if (var8 == 1950824464) {
                           throw new IllegalStateException();
                        }

                        int var10 = (Integer)var9.next();
                        List var11 = (List)this.ai.get(var10);
                        if (null == var11) {
                           continue label58;
                        }

                        Iterator var12 = var11.iterator();

                        while(var12.hasNext()) {
                           lx var13 = (lx)var12.next();
                           int var14 = var3 * (var13.as.aw * 1601399073 - this.an * 482041609) / (1742744295 * this.af);
                           int var15 = var4 - (-1982010185 * var13.as.ak - this.ao * -780575113) * var4 / (this.ar * -1311322869);
                           vz.er(var1 + var14, var15 + var2, 2, 16776960, 256);
                        }
                     }

                     return;
                  } while(var8 != 1950824464);

                  return;
               }
            }

         }
      } catch (RuntimeException var16) {
         throw tm.aw(var16, "lu.ai(" + ')');
      }
   }

   public boolean bv() {
      return this.ap;
   }

   public boolean bx() {
      return this.ap;
   }

   public boolean bk() {
      return this.ap;
   }

   public final void aj(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13, byte var14) {
      try {
         ls var15 = this.as(var1, var2, var3, var4, 1776308720);
         float var16 = this.an(var7 - var5, var3 - var1, -1083353722);
         int var17 = (int)(64.0F * var16);
         int var18 = 482041609 * this.an + var1;
         int var19 = var2 + -780575113 * this.ao;

         int var20;
         int var21;
         for(var20 = 527392937 * var15.ak; var20 < var15.ap * 1460416259 + var15.ak * 527392937; ++var20) {
            for(var21 = var15.aj * -63485769; var21 < var15.aw * 1775400951 + var15.aj * -63485769; ++var21) {
               if (var14 <= 1) {
                  throw new IllegalStateException();
               }

               if (var13) {
                  this.ay[var20][var21].am(29680771);
               }

               this.ay[var20][var21].af(var17 * (185591744 * this.ay[var20][var21].ay - var18) / 64 + var5, var8 - (541820736 * this.ay[var20][var21].as - var19 + 64) * var17 / 64, var17, var9, (byte)-95);
            }
         }

         if (var10 != null) {
            if (var14 <= 1) {
               return;
            }

            if (var11 > 0) {
               for(var20 = 527392937 * var15.ak; var20 < 527392937 * var15.ak + 1460416259 * var15.ap; ++var20) {
                  if (var14 <= 1) {
                     throw new IllegalStateException();
                  }

                  for(var21 = var15.aj * -63485769; var21 < var15.aw * 1775400951 + -63485769 * var15.aj; ++var21) {
                     if (var14 <= 1) {
                        throw new IllegalStateException();
                     }

                     this.ay[var20][var21].ar(var10, var11, var12, 1785077313);
                  }
               }
            }
         }

      } catch (RuntimeException var22) {
         throw tm.aw(var22, "lu.aj(" + ')');
      }
   }

   public int bq() {
      return this.ak.ao(1339513315);
   }

   void bp() {
      if (null == this.ai) {
         this.ai = new HashMap();
      }

      this.ai.clear();

      for(int var1 = 0; var1 < this.ay.length; ++var1) {
         for(int var2 = 0; var2 < this.ay[var1].length; ++var2) {
            List var3 = this.ay[var1][var2].by(-1160681878);
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               lx var5 = (lx)var4.next();
               if (var5.ab((byte)-73)) {
                  int var6 = var5.aw(-1716980045);
                  if (!this.ai.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.ai.put(var6, var7);
                  } else {
                     List var8 = (List)this.ai.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   public final void az() {
      this.ai = null;
   }

   void bc() {
      if (null == this.ai) {
         this.ai = new HashMap();
      }

      this.ai.clear();

      for(int var1 = 0; var1 < this.ay.length; ++var1) {
         for(int var2 = 0; var2 < this.ay[var1].length; ++var2) {
            List var3 = this.ay[var1][var2].by(-885705782);
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               lx var5 = (lx)var4.next();
               if (var5.ab((byte)-49)) {
                  int var6 = var5.aw(1818687625);
                  if (!this.ai.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.ai.put(var6, var7);
                  } else {
                     List var8 = (List)this.ai.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   public final void ar() {
      this.ai = null;
   }

   public final void ag(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = vz.al;
      int var10 = vz.aa;
      int var11 = vz.ah;
      float[] var12 = vz.bh;
      int[] var13 = new int[4];
      vz.ez(var13);
      ls var14 = this.as(var1, var2, var3, var4, 1300100039);
      float var15 = this.an(var7 - var5, var3 - var1, -1083353722);
      int var16 = (int)Math.ceil((double)var15);
      this.ab = -268413679 * var16;
      if (!this.as.containsKey(var16)) {
         ll var17 = new ll(var16);
         var17.aj(-308280035);
         this.as.put(var16, var17);
      }

      int var24 = 119437615 * var14.ak + var14.ap * 1460416259 - 1;
      int var18 = var14.aw * -1768007846 + var14.aj * -63485769 - 1;

      int var19;
      int var20;
      for(var19 = var14.ak * -996989133; var19 <= var24; ++var19) {
         for(var20 = -63485769 * var14.aj; var20 <= var18; ++var20) {
            this.ay[var19][var20].ao(var16, (ll)this.as.get(var16), this.ae, this.am, this.at, 0.725D);
         }
      }

      jm.ar(var9, var10, var11, var12);
      vz.ey(var13);
      var19 = (int)(var15 * 64.0F);
      var20 = this.an * 482041609 + var1;
      int var21 = this.ao * -780575113 + var2;

      for(int var22 = 2124715878 * var14.ak; var22 < var14.ak * 834343473 + 1460416259 * var14.ap; ++var22) {
         for(int var23 = 575489840 * var14.aj; var23 < 1775400951 * var14.aw + -63485769 * var14.aj; ++var23) {
            this.ay[var22][var23].aj((-475404473 * this.ay[var22][var23].ay - var20) * var19 / 64 + var5, var8 - var19 * (this.ay[var22][var23].as * 541820736 - var21 + 64) / 64, var19, -1731510697);
         }
      }

   }

   static or gu(int var0, boolean var1, boolean var2, boolean var3, boolean var4, int var5) {
      try {
         sl var6 = null;
         if (iq.ao != null) {
            if (var5 == -31287050) {
               throw new IllegalStateException();
            }

            var6 = new sl(var0, iq.ao, et.ar[var0], 1000000);
         }

         return new or(var6, hc.vp, oc.vv, var0, var1, var2, var3, var4, false);
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "lu.gu(" + ')');
      }
   }
}
