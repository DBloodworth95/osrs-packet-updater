import java.util.Iterator;

public abstract class dw extends jv implements cz {
   int cj;
   um dc;
   int bq;
   boolean an;
   int bp;
   int bz;
   int bc;
   int dl;
   int bi;
   int bn;
   int bu;
   int bt;
   int dg;
   kk[] dn;
   int cb;
   int bd;
   int ba;
   int[] di;
   int dq;
   int cm;
   int bg;
   int dd;
   boolean be;
   boolean cq;
   int cg;
   int cd;
   int ci;
   int[] cn;
   byte cf;
   int[] cl;
   int bk;
   int[] cv;
   int[] cy;
   int[] cu;
   ps ce;
   String bl;
   boolean cx;
   int cz;
   int ch;
   int de;
   boolean cc;
   int bf;
   int ct;
   int cw;
   int ca;
   static final int kx = 334;
   int cr;
   int eg;
   int bs;
   int bm;
   int by;
   int da;
   int dr;
   int bb;
   int du;
   int df;
   int[] cp;
   int dk;
   int cs;
   int dm;
   byte db;
   int dx;
   int ds;
   int br;
   byte dv;
   byte dj;
   byte dp;
   int dy;
   int do;
   int dw;
   int dh;
   int[] dz;
   int bw;
   int ck;
   int bo;
   int ev;
   int eh;
   int dt;

   public int ay() {
      return -1517174943 * this.bk;
   }

   final void ca(byte var1) {
      try {
         this.de = 0;
         this.ev = 0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dw.ca(" + ')');
      }
   }

   final void dp(int var1) {
      ha var2 = id.ap(var1, (short)-11108);

      for(eg var3 = (eg)this.ce.ai(); var3 != null; var3 = (eg)this.ce.as()) {
         if (var2 == var3.ak) {
            var3.kf();
            return;
         }
      }

   }

   final void cs(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         boolean var8 = true;
         boolean var9 = true;

         int var10;
         for(var10 = 0; var10 < 4; ++var10) {
            if (var7 >= 1) {
               throw new IllegalStateException();
            }

            if (this.cv[var10] > var5) {
               var8 = false;
            } else {
               var9 = false;
            }
         }

         var10 = -1;
         int var11 = -1;
         int var12 = 0;
         if (var1 >= 0) {
            if (var7 >= 1) {
               throw new IllegalStateException();
            }

            hw var13 = vy.aw(var1, -1469570931);
            var11 = var13.aq * -2120711329;
            var12 = -202531067 * var13.af;
         }

         int var16;
         if (var9) {
            if (var7 >= 1) {
               return;
            }

            if (-1 == var11) {
               return;
            }

            var10 = 0;
            var16 = 0;
            if (var11 == 0) {
               if (var7 >= 1) {
                  return;
               }

               var16 = this.cv[0];
            } else if (var11 == 1) {
               if (var7 >= 1) {
                  return;
               }

               var16 = this.cp[0];
            }

            for(int var14 = 1; var14 < 4; ++var14) {
               if (var7 >= 1) {
                  throw new IllegalStateException();
               }

               if (var11 == 0) {
                  if (this.cv[var14] < var16) {
                     if (var7 >= 1) {
                        throw new IllegalStateException();
                     }

                     var10 = var14;
                     var16 = this.cv[var14];
                  }
               } else if (var11 == 1 && this.cp[var14] < var16) {
                  if (var7 >= 1) {
                     throw new IllegalStateException();
                  }

                  var10 = var14;
                  var16 = this.cp[var14];
               }
            }

            if (var11 == 1) {
               if (var7 >= 1) {
                  throw new IllegalStateException();
               }

               if (var16 >= var2) {
                  return;
               }
            }
         } else {
            if (var8) {
               if (var7 >= 1) {
                  return;
               }

               this.cf = 0;
            }

            for(var16 = 0; var16 < 4; ++var16) {
               if (var7 >= 1) {
                  throw new IllegalStateException();
               }

               byte var17 = this.cf;
               this.cf = (byte)((1 + this.cf) % 4);
               if (this.cv[var17] <= var5) {
                  if (var7 >= 1) {
                     return;
                  }

                  var10 = var17;
                  break;
               }
            }
         }

         if (var10 < 0) {
            if (var7 >= 1) {
               throw new IllegalStateException();
            }
         } else {
            this.cl[var10] = var1;
            this.cp[var10] = var2;
            this.cy[var10] = var3;
            this.cu[var10] = var4;
            this.cv[var10] = var6 + var5 + var12;
         }
      } catch (RuntimeException var15) {
         throw tm.aw(var15, "dw.cs(" + ')');
      }
   }

   final void cr(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         ha var8 = id.ap(var1, (short)-158);
         eg var9 = null;
         eg var10 = null;
         int var11 = var8.am * -1991769501;
         int var12 = 0;

         eg var13;
         for(var13 = (eg)this.ce.ai(); var13 != null; var13 = (eg)this.ce.as()) {
            if (var7 == 16) {
               throw new IllegalStateException();
            }

            ++var12;
            if (var8.ai * 1616135899 == var13.ak.ai * 1616135899) {
               if (var7 == 16) {
                  return;
               }

               var13.ap(var4 + var2, var5, var6, var3, -635912159);
               return;
            }

            if (-492200047 * var13.ak.ae <= -492200047 * var8.ae) {
               if (var7 == 16) {
                  return;
               }

               var9 = var13;
            }

            if (-1991769501 * var13.ak.am > var11) {
               if (var7 == 16) {
                  throw new IllegalStateException();
               }

               var10 = var13;
               var11 = var13.ak.am * -1991769501;
            }
         }

         if (var10 == null) {
            if (var7 == 16) {
               throw new IllegalStateException();
            }

            if (var12 >= 4) {
               if (var7 == 16) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         var13 = new eg(var8);
         if (null == var9) {
            if (var7 == 16) {
               throw new IllegalStateException();
            }

            this.ce.ak(var13);
         } else {
            ps.aj(var13, var9);
         }

         var13.ap(var2 + var4, var5, var6, var3, -1405163067);
         if (var12 >= 4) {
            var10.kf();
         }

      } catch (RuntimeException var14) {
         throw tm.aw(var14, "dw.cr(" + ')');
      }
   }

   public int ai() {
      return 1199487993 * this.bk;
   }

   void dq(int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = client.dt * -330508271 + var4;
         sd var7 = (sd)this.dc.ap((long)var1);
         if (null != var7) {
            if (var5 <= -1573289334) {
               return;
            }

            var7.kf();
            this.da -= 1562335665;
         }

         if (65535 != var2) {
            if (var5 <= -1573289334) {
               throw new IllegalStateException();
            }

            if (var2 != -1) {
               byte var8 = 0;
               if (var4 > 0) {
                  if (var5 <= -1573289334) {
                     throw new IllegalStateException();
                  }

                  var8 = -1;
               }

               this.dc.aw(new sd(var2, var3, var6, var8), (long)var1);
               this.da += 1562335665;
               return;
            }

            if (var5 <= -1573289334) {
               throw new IllegalStateException();
            }
         }

      } catch (RuntimeException var9) {
         throw tm.aw(var9, "dw.dq(" + ')');
      }
   }

   um dd(short var1) {
      try {
         return this.dc;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dw.dd(" + ')');
      }
   }

   final void dk() {
      this.de = 0;
      this.ev = 0;
   }

   void do(int var1, int var2, int var3, int var4) {
      int var5 = client.dt * -330508271 + var4;
      sd var6 = (sd)this.dc.ap((long)var1);
      if (null != var6) {
         var6.kf();
         this.da -= 1562335665;
      }

      if (65535 != var2 && var2 != -1) {
         byte var7 = 0;
         if (var4 > 0) {
            var7 = -1;
         }

         this.dc.aw(new sd(var2, var3, var5, var7), (long)var1);
         this.da += 1562335665;
      }
   }

   void dr(int var1) {
      try {
         this.cc = false;
         this.cz = 1149889283;
         this.ch = 1205672835;
         this.ct = 1948029387;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dw.dr(" + ')');
      }
   }

   public int ap(byte var1) {
      try {
         return -1517174943 * this.bk;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dw.ap(" + ')');
      }
   }

   public int aw(int var1) {
      try {
         return this.bb * 669935203;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dw.aw(" + ')');
      }
   }

   nn dh(dn var1, byte var2) {
      try {
         if (var1 == hx.jf) {
            if (var2 != -1) {
               throw new IllegalStateException();
            } else {
               return new nn(this.ak((byte)-13), this.ap((byte)17), this.aw(-1838574498));
            }
         } else {
            so var3 = hx.jf.ab[-1948824391 * var1.ap];
            if (null == var3) {
               return new nn(this.ak((byte)-115), this.ap((byte)124), this.aw(-2046316836));
            } else {
               int var4 = var3.ap((byte)49);
               int var5 = var3.aw(1084666467);
               int var6 = var3.ak((byte)-67);
               int var7 = var3.ak.ai * 1587254913 / 2 * 128;
               int var8 = var3.ak.ay * -1000264093 / 2 * 128;
               int var9 = this.ap((byte)43) - var7;
               int var10 = this.aw(-582946666) - var8;
               double var11 = (double)(-var3.ao(327814629)) * 3.141592653589793D / 1024.0D;
               double var13 = Math.cos(var11);
               double var15 = Math.sin(var11);
               int var17 = (int)(var13 * (double)var9 - var15 * (double)var10) + var4;
               int var18 = var5 + (int)(var13 * (double)var10 + var15 * (double)var9);
               return new nn(var6, var17, var18);
            }
         }
      } catch (RuntimeException var19) {
         throw tm.aw(var19, "dw.dh(" + ')');
      }
   }

   public int ak(byte var1) {
      try {
         return hx.jf.aj * 86027145;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dw.ak(" + ')');
      }
   }

   int dg(int var1) {
      try {
         return -890437199 * this.dt;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dw.dg(" + ')');
      }
   }

   static void an(int var0) {
      try {
         Iterator var1 = mp.ay.iterator();

         while(true) {
            no var2;
            do {
               if (!var1.hasNext()) {
                  mp.ay.clear();
                  return;
               }

               if (var0 == 5155348) {
                  throw new IllegalStateException();
               }

               var2 = (no)var1.next();
            } while(null == var2);

            var2.au.ao(-2072897361);
            var2.au.at(1669929059);
            var2.au.ap(0, (short)-27357);
            var2.au.bn = 0;
            int var3 = var2.aw * -893316127;
            int var4 = 380940733 * var2.ak;
            Iterator var5 = mp.am.iterator();

            while(var5.hasNext()) {
               if (var0 == 5155348) {
                  return;
               }

               nh var6 = (nh)var5.next();
               var6.hl(var3, var4, -1559808935);
            }
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "dw.an(" + ')');
      }
   }

   jy da(jy var1, byte var2) {
      try {
         if (0 == -2053681327 * this.da) {
            return var1;
         } else {
            up var3 = new up(this.dc);
            int var4 = var1.ae;
            int var5 = var1.an;
            int var6 = var1.al;
            byte var7 = var1.aq;

            for(sd var8 = (sd)var3.aw(); null != var8; var8 = (sd)var3.next()) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               if (-308635389 * var8.aw == -1) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }
               } else {
                  jy var9 = nl.ap(-566226093 * var8.ap, -1242290007).ai((byte)1);
                  if (null == var9) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var4 += var9.ae;
                     var5 += var9.an;
                     var6 += var9.al;
                  }
               }
            }

            jy var12 = new jy(var4, var5, var6, var7);
            var12.ak(var1);

            for(sd var13 = (sd)var3.aw(); var13 != null; var13 = (sd)var3.next()) {
               if (var13.aw * -308635389 != -1) {
                  jy var10 = nl.ap(var13.ap * -566226093, -1044009336).aj(var13.aw * -308635389, 1066744365);
                  if (null == var10) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var10.bj(0, -(-2030561639 * var13.ai), 0);
                     var12.ak(var10);
                  }
               }
            }

            return var12;
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "dw.da(" + ')');
      }
   }

   final void du() {
      this.de = 0;
      this.ev = 0;
   }

   public int as() {
      return this.bb * 669935203;
   }

   final void df() {
      this.de = 0;
      this.ev = 0;
   }

   boolean cg() {
      return false;
   }

   boolean cx() {
      return false;
   }

   void dn() {
      up var1 = new up(this.dc);

      for(sd var2 = (sd)var1.aw(); null != var2; var2 = (sd)var1.next()) {
         var2.kf();
      }

      this.da = 0;
   }

   boolean ch() {
      return false;
   }

   void ey() {
      this.cc = false;
      this.cz = -1077209070;
      this.ch = 1516859578;
      this.ct = 1490182484;
   }

   void dc(int var1) {
      try {
         up var2 = new up(this.dc);

         for(sd var3 = (sd)var2.aw(); null != var3; var3 = (sd)var2.next()) {
            if (var1 <= 746573637) {
               return;
            }

            var3.kf();
         }

         this.da = 0;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "dw.dc(" + ')');
      }
   }

   public int ae() {
      return this.bb * 669935203;
   }

   final void dl() {
      this.de = 0;
      this.ev = 0;
   }

   final void dm() {
      this.de = 0;
      this.ev = 0;
   }

   final void dt(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if (this.cv[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if (var1 >= 0) {
         hw var12 = vy.aw(var1, 521089576);
         var10 = var12.aq * -2120711329;
         var11 = -202531067 * var12.af;
      }

      int var14;
      if (var8) {
         if (-1 == var10) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if (var10 == 0) {
            var14 = this.cv[0];
         } else if (var10 == 1) {
            var14 = this.cp[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if (var10 == 0) {
               if (this.cv[var13] < var14) {
                  var9 = var13;
                  var14 = this.cv[var13];
               }
            } else if (var10 == 1 && this.cp[var13] < var14) {
               var9 = var13;
               var14 = this.cp[var13];
            }
         }

         if (var10 == 1 && var14 >= var2) {
            return;
         }
      } else {
         if (var7) {
            this.cf = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.cf;
            this.cf = (byte)((1 + this.cf) % 4);
            if (this.cv[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if (var9 >= 0) {
         this.cl[var9] = var1;
         this.cp[var9] = var2;
         this.cy[var9] = var3;
         this.cu[var9] = var4;
         this.cv[var9] = var6 + var5 + var11;
      }
   }

   int ef() {
      return 1696526108 * this.dt;
   }

   final void ds(int var1, int var2, int var3, int var4, int var5, int var6) {
      ha var7 = id.ap(var1, (short)-13293);
      eg var8 = null;
      eg var9 = null;
      int var10 = var7.am * -290352930;
      int var11 = 0;

      eg var12;
      for(var12 = (eg)this.ce.ai(); var12 != null; var12 = (eg)this.ce.as()) {
         ++var11;
         if (var7.ai * 1039189796 == var12.ak.ai * 1616135899) {
            var12.ap(var4 + var2, var5, var6, var3, -1261755224);
            return;
         }

         if (819256025 * var12.ak.ae <= 1581865912 * var7.ae) {
            var8 = var12;
         }

         if (1062218533 * var12.ak.am > var10) {
            var9 = var12;
            var10 = var12.ak.am * 2056226086;
         }
      }

      if (var9 != null || var11 < 4) {
         var12 = new eg(var7);
         if (null == var8) {
            this.ce.ak(var12);
         } else {
            ps.aj(var12, var8);
         }

         var12.ap(var2 + var4, var5, var6, var3, 235683253);
         if (var11 >= 4) {
            var9.kf();
         }

      }
   }

   final void db(int var1, int var2, int var3, int var4, int var5, int var6) {
      ha var7 = id.ap(var1, (short)-6429);
      eg var8 = null;
      eg var9 = null;
      int var10 = var7.am * -1991769501;
      int var11 = 0;

      eg var12;
      for(var12 = (eg)this.ce.ai(); var12 != null; var12 = (eg)this.ce.as()) {
         ++var11;
         if (var7.ai * -1794400682 == var12.ak.ai * 1616135899) {
            var12.ap(var4 + var2, var5, var6, var3, 39132973);
            return;
         }

         if (2123141473 * var12.ak.ae <= -492200047 * var7.ae) {
            var8 = var12;
         }

         if (-1991769501 * var12.ak.am > var10) {
            var9 = var12;
            var10 = var12.ak.am * -1243004676;
         }
      }

      if (var9 != null || var11 < 4) {
         var12 = new eg(var7);
         if (null == var8) {
            this.ce.ak(var12);
         } else {
            ps.aj(var12, var8);
         }

         var12.ap(var2 + var4, var5, var6, var3, 1549826798);
         if (var11 >= 4) {
            var9.kf();
         }

      }
   }

   final void dv(int var1, int var2, int var3, int var4, int var5, int var6) {
      ha var7 = id.ap(var1, (short)-635);
      eg var8 = null;
      eg var9 = null;
      int var10 = var7.am * -518317546;
      int var11 = 0;

      eg var12;
      for(var12 = (eg)this.ce.ai(); var12 != null; var12 = (eg)this.ce.as()) {
         ++var11;
         if (var7.ai * 1616135899 == var12.ak.ai * -250230769) {
            var12.ap(var4 + var2, var5, var6, var3, 2056945780);
            return;
         }

         if (-492200047 * var12.ak.ae <= -1296591824 * var7.ae) {
            var8 = var12;
         }

         if (1543969586 * var12.ak.am > var10) {
            var9 = var12;
            var10 = var12.ak.am * -824875419;
         }
      }

      if (var9 != null || var11 < 4) {
         var12 = new eg(var7);
         if (null == var8) {
            this.ce.ak(var12);
         } else {
            ps.aj(var12, var8);
         }

         var12.ap(var2 + var4, var5, var6, var3, -1438348999);
         if (var11 >= 4) {
            var9.kf();
         }

      }
   }

   final void dj(int var1, int var2, int var3, int var4, int var5, int var6) {
      ha var7 = id.ap(var1, (short)-5807);
      eg var8 = null;
      eg var9 = null;
      int var10 = var7.am * -1991769501;
      int var11 = 0;

      eg var12;
      for(var12 = (eg)this.ce.ai(); var12 != null; var12 = (eg)this.ce.as()) {
         ++var11;
         if (var7.ai * 1616135899 == var12.ak.ai * 1616135899) {
            var12.ap(var4 + var2, var5, var6, var3, 1173578557);
            return;
         }

         if (-492200047 * var12.ak.ae <= -492200047 * var7.ae) {
            var8 = var12;
         }

         if (-1991769501 * var12.ak.am > var10) {
            var9 = var12;
            var10 = var12.ak.am * -1991769501;
         }
      }

      if (var9 != null || var11 < 4) {
         var12 = new eg(var7);
         if (null == var8) {
            this.ce.ak(var12);
         } else {
            ps.aj(var12, var8);
         }

         var12.ap(var2 + var4, var5, var6, var3, -1058213271);
         if (var11 >= 4) {
            var9.kf();
         }

      }
   }

   boolean bj(int var1) {
      try {
         return false;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dw.bj(" + ')');
      }
   }

   final void dy(int var1) {
      ha var2 = id.ap(var1, (short)-3);

      for(eg var3 = (eg)this.ce.ai(); var3 != null; var3 = (eg)this.ce.as()) {
         if (var2 == var3.ak) {
            var3.kf();
            return;
         }
      }

   }

   dw() {
      try {
         super();
         this.an = false;
         this.bp = 704487249;
         this.bc = -879580379;
         this.by = 1379807281;
         this.br = 5424763;
         this.bn = -2018035535;
         this.bu = 1858507535;
         this.bt = 295220955;
         this.bs = -85069143;
         this.bm = -37310571;
         this.bo = -2147330113;
         this.bd = 63976373;
         this.ba = -1803252621;
         this.bw = 1188812127;
         this.bi = 55471425;
         this.bf = -440887519;
         this.bg = -430173297;
         this.bl = null;
         this.cq = false;
         this.cb = -1503072476;
         this.cd = 0;
         this.ci = 0;
         this.cn = null;
         this.cf = 0;
         this.cl = new int[4];
         this.cp = new int[4];
         this.cv = new int[4];
         this.cy = new int[4];
         this.cu = new int[4];
         this.ce = new ps();
         this.cg = 1732965297;
         this.cx = false;
         this.cz = 1149889283;
         this.ch = 1205672835;
         this.ct = 1948029387;
         this.cj = 1070827527;
         this.cm = 0;
         this.cw = 0;
         this.ca = 0;
         this.cs = -364114241;
         this.cr = 0;
         this.ck = 0;
         this.dq = 0;
         this.dd = 0;
         this.dc = new um(4);
         this.da = 0;
         this.dm = 0;
         this.dt = 163755848;
         this.dx = -1610575397;
         this.ds = 1905166629;
         this.do = 0;
         this.dw = -1700593888;
         this.de = 0;
         this.dz = new int[10];
         this.di = new int[10];
         this.dn = new kk[10];
         this.eg = 0;
         this.ev = 0;
         this.eh = -605094987;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "dw.<init>(" + ')');
      }
   }

   void dw(int var1, int var2, int var3, int var4) {
      int var5 = client.dt * -330508271 + var4;
      sd var6 = (sd)this.dc.ap((long)var1);
      if (null != var6) {
         var6.kf();
         this.da -= 1562335665;
      }

      if (65535 != var2 && var2 != -1) {
         byte var7 = 0;
         if (var4 > 0) {
            var7 = -1;
         }

         this.dc.aw(new sd(var2, var3, var5, var7), (long)var1);
         this.da += 1562335665;
      }
   }

   nn ec(dn var1) {
      if (var1 == hx.jf) {
         return new nn(this.ak((byte)-72), this.ap((byte)84), this.aw(-1671371568));
      } else {
         so var2 = hx.jf.ab[-1948824391 * var1.ap];
         if (null == var2) {
            return new nn(this.ak((byte)-53), this.ap((byte)5), this.aw(584153439));
         } else {
            int var3 = var2.ap((byte)90);
            int var4 = var2.aw(-1043423053);
            int var5 = var2.ak((byte)1);
            int var6 = var2.ak.ai * 1587254913 / 2 * 128;
            int var7 = var2.ak.ay * -1000264093 / 2 * 128;
            int var8 = this.ap((byte)40) - var6;
            int var9 = this.aw(-1281366628) - var7;
            double var10 = (double)(-var2.ao(327814629)) * 3.141592653589793D / 1024.0D;
            double var12 = Math.cos(var10);
            double var14 = Math.sin(var10);
            int var16 = (int)(var12 * (double)var8 - var14 * (double)var9) + var3;
            int var17 = var4 + (int)(var12 * (double)var9 + var14 * (double)var8);
            return new nn(var5, var16, var17);
         }
      }
   }

   um dz() {
      return this.dc;
   }

   public int am() {
      return hx.jf.aj * 655269872;
   }

   final void ck(int var1, int var2) {
      try {
         ha var3 = id.ap(var1, (short)-11402);

         for(eg var4 = (eg)this.ce.ai(); var4 != null; var4 = (eg)this.ce.as()) {
            if (var3 == var4.ak) {
               if (var2 <= 40009885) {
                  return;
               }

               var4.kf();
               return;
            }
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "dw.ck(" + ')');
      }
   }

   jy eg(jy var1) {
      if (0 == -2053681327 * this.da) {
         return var1;
      } else {
         up var2 = new up(this.dc);
         int var3 = var1.ae;
         int var4 = var1.an;
         int var5 = var1.al;
         byte var6 = var1.aq;

         for(sd var7 = (sd)var2.aw(); null != var7; var7 = (sd)var2.next()) {
            if (-308635389 * var7.aw != -1) {
               jy var8 = nl.ap(-566226093 * var7.ap, -532338249).ai((byte)1);
               if (null != var8) {
                  var3 += var8.ae;
                  var4 += var8.an;
                  var5 += var8.al;
               }
            }
         }

         jy var10 = new jy(var3, var4, var5, var6);
         var10.ak(var1);

         for(sd var11 = (sd)var2.aw(); var11 != null; var11 = (sd)var2.next()) {
            if (var11.aw * -308635389 != -1) {
               jy var9 = nl.ap(var11.ap * -566226093, -2032161343).aj(var11.aw * -308635389, 1283179317);
               if (null != var9) {
                  var9.bj(0, -(-2030561639 * var11.ai), 0);
                  var10.ak(var9);
               }
            }
         }

         return var10;
      }
   }

   jy ev(jy var1) {
      if (0 == -2053681327 * this.da) {
         return var1;
      } else {
         up var2 = new up(this.dc);
         int var3 = var1.ae;
         int var4 = var1.an;
         int var5 = var1.al;
         byte var6 = var1.aq;

         for(sd var7 = (sd)var2.aw(); null != var7; var7 = (sd)var2.next()) {
            if (-308635389 * var7.aw != -1) {
               jy var8 = nl.ap(-566226093 * var7.ap, -1846214839).ai((byte)1);
               if (null != var8) {
                  var3 += var8.ae;
                  var4 += var8.an;
                  var5 += var8.al;
               }
            }
         }

         jy var10 = new jy(var3, var4, var5, var6);
         var10.ak(var1);

         for(sd var11 = (sd)var2.aw(); var11 != null; var11 = (sd)var2.next()) {
            if (var11.aw * -308635389 != -1) {
               jy var9 = nl.ap(var11.ap * -566226093, -818565269).aj(var11.aw * -308635389, 352528870);
               if (null != var9) {
                  var9.bj(0, -(-2030561639 * var11.ai), 0);
                  var10.ak(var9);
               }
            }
         }

         return var10;
      }
   }

   void eh() {
      this.cc = false;
      this.cz = 1149889283;
      this.ch = -1278624715;
      this.ct = 1948029387;
   }

   void ez() {
      this.cc = false;
      this.cz = 1149889283;
      this.ch = 424748415;
      this.ct = 1948029387;
   }

   void di() {
      up var1 = new up(this.dc);

      for(sd var2 = (sd)var1.aw(); null != var2; var2 = (sd)var1.next()) {
         var2.kf();
      }

      this.da = 0;
   }

   public int aj() {
      return -1517174943 * this.bk;
   }

   nn ek(dn var1) {
      if (var1 == hx.jf) {
         return new nn(this.ak((byte)-5), this.ap((byte)110), this.aw(1926240961));
      } else {
         so var2 = hx.jf.ab[-1948824391 * var1.ap];
         if (null == var2) {
            return new nn(this.ak((byte)-21), this.ap((byte)10), this.aw(1653530211));
         } else {
            int var3 = var2.ap((byte)107);
            int var4 = var2.aw(319126691);
            int var5 = var2.ak((byte)-38);
            int var6 = var2.ak.ai * 1587254913 / 2 * 128;
            int var7 = var2.ak.ay * -1000264093 / 2 * 128;
            int var8 = this.ap((byte)45) - var6;
            int var9 = this.aw(-106031289) - var7;
            double var10 = (double)(-var2.ao(327814629)) * 3.141592653589793D / 1024.0D;
            double var12 = Math.cos(var10);
            double var14 = Math.sin(var10);
            int var16 = (int)(var12 * (double)var8 - var14 * (double)var9) + var3;
            int var17 = var4 + (int)(var12 * (double)var9 + var14 * (double)var8);
            return new nn(var5, var16, var17);
         }
      }
   }

   nn er(dn var1) {
      if (var1 == hx.jf) {
         return new nn(this.ak((byte)-123), this.ap((byte)18), this.aw(-53403832));
      } else {
         so var2 = hx.jf.ab[-1948824391 * var1.ap];
         if (null == var2) {
            return new nn(this.ak((byte)8), this.ap((byte)41), this.aw(1282103589));
         } else {
            int var3 = var2.ap((byte)30);
            int var4 = var2.aw(803281458);
            int var5 = var2.ak((byte)-58);
            int var6 = var2.ak.ai * 1587254913 / 2 * 128;
            int var7 = var2.ak.ay * -1000264093 / 2 * 128;
            int var8 = this.ap((byte)15) - var6;
            int var9 = this.aw(731343353) - var7;
            double var10 = (double)(-var2.ao(327814629)) * 3.141592653589793D / 1024.0D;
            double var12 = Math.cos(var10);
            double var14 = Math.sin(var10);
            int var16 = (int)(var12 * (double)var8 - var14 * (double)var9) + var3;
            int var17 = var4 + (int)(var12 * (double)var9 + var14 * (double)var8);
            return new nn(var5, var16, var17);
         }
      }
   }

   final void dx(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if (this.cv[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if (var1 >= 0) {
         hw var12 = vy.aw(var1, 1059912061);
         var10 = var12.aq * -2120711329;
         var11 = -202531067 * var12.af;
      }

      int var14;
      if (var8) {
         if (-1 == var10) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if (var10 == 0) {
            var14 = this.cv[0];
         } else if (var10 == 1) {
            var14 = this.cp[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if (var10 == 0) {
               if (this.cv[var13] < var14) {
                  var9 = var13;
                  var14 = this.cv[var13];
               }
            } else if (var10 == 1 && this.cp[var13] < var14) {
               var9 = var13;
               var14 = this.cp[var13];
            }
         }

         if (var10 == 1 && var14 >= var2) {
            return;
         }
      } else {
         if (var7) {
            this.cf = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.cf;
            this.cf = (byte)((1 + this.cf) % 4);
            if (this.cv[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if (var9 >= 0) {
         this.cl[var9] = var1;
         this.cp[var9] = var2;
         this.cy[var9] = var3;
         this.cu[var9] = var4;
         this.cv[var9] = var6 + var5 + var11;
      }
   }

   public int at() {
      return hx.jf.aj * 86027145;
   }

   int en() {
      return -890437199 * this.dt;
   }

   um de() {
      return this.dc;
   }

   int em() {
      return -890437199 * this.dt;
   }

   static final void ma(ng[] var0, int var1, int var2) {
      try {
         for(int var3 = 0; var3 < var0.length; ++var3) {
            if (var2 == -780505003) {
               throw new IllegalStateException();
            }

            ng var4 = var0[var3];
            if (var4 == null) {
               if (var2 == -780505003) {
                  throw new IllegalStateException();
               }
            } else {
               if (0 == var4.bk * -1973680119) {
                  if (var2 == -780505003) {
                     throw new IllegalStateException();
                  }

                  if (null != var4.gu) {
                     if (var2 == -780505003) {
                        throw new IllegalStateException();
                     }

                     ma(var4.gu, var1, -1390122647);
                  }

                  dm var5 = (dm)client.om.ap((long)(-1736739607 * var4.bj));
                  if (var5 != null) {
                     if (var2 == -780505003) {
                        throw new IllegalStateException();
                     }

                     si.my(-1759747861 * var5.ap, var1, (short)29710);
                  }
               }

               dt var7;
               if (0 == var1 && var4.gn != null) {
                  if (var2 == -780505003) {
                     return;
                  }

                  var7 = new dt();
                  var7.ak = var4;
                  var7.ap = var4.gn;
                  sr.ap(var7, -858528525);
               }

               if (1 == var1) {
                  if (var2 == -780505003) {
                     throw new IllegalStateException();
                  }

                  if (null != var4.gd) {
                     if (597146807 * var4.bv >= 0) {
                        ng var8 = qk.ek.ap(var4.bj * -1736739607, -1307817056);
                        if (null == var8) {
                           continue;
                        }

                        if (var2 == -780505003) {
                           throw new IllegalStateException();
                        }

                        if (var8.gu == null || var4.bv * 597146807 >= var8.gu.length) {
                           continue;
                        }

                        if (var2 == -780505003) {
                           throw new IllegalStateException();
                        }

                        if (var4 != var8.gu[597146807 * var4.bv]) {
                           if (var2 == -780505003) {
                              return;
                           }
                           continue;
                        }
                     }

                     var7 = new dt();
                     var7.ak = var4;
                     var7.ap = var4.gd;
                     sr.ap(var7, -1875252963);
                  }
               }
            }
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "dw.ma(" + ')');
      }
   }

   static final void ki(int var0) {
      try {
         for(do var1 = (do)hx.jf.ac.as(); null != var1; var1 = (do)hx.jf.ac.am()) {
            if (var0 == -1071434137) {
               throw new IllegalStateException();
            }

            if (-278358679 * var1.ar == -1) {
               if (var0 == -1071434137) {
                  throw new IllegalStateException();
               }

               var1.af = 0;
               bm.kr(hx.jf, var1, -932829615);
            } else {
               var1.kf();
            }
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dw.ki(" + ')');
      }
   }

   boolean cz() {
      return false;
   }
}
