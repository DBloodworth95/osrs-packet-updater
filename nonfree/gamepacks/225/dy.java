import java.util.Date;
import netscape.javascript.JSObject;

public abstract class dy extends ju implements cz {
   int cu;
   int bm;
   int bs;
   boolean an;
   int bw;
   int ba;
   int bj;
   int bp;
   int dc;
   int[] ci;
   int de;
   int bg;
   int bl;
   boolean cc;
   int bu;
   int br;
   int ez;
   int bt;
   int bq;
   int dg;
   int bk;
   String be;
   int by;
   int dw;
   int ch;
   int db;
   int dr;
   int[] cm;
   byte cx;
   int cq;
   int[] cy;
   int[] co;
   int[] cv;
   int[] cg;
   int dk;
   int dm;
   byte dq;
   int cz;
   int cw;
   int cr;
   boolean cl;
   int ca;
   int cs;
   pr ct;
   int cb;
   int cd;
   int ce;
   int ck;
   int bb;
   int df;
   ui dv;
   int dt;
   boolean cn;
   int dl;
   int bz;
   int bi;
   boolean bc;
   int bo;
   int dp;
   int dj;
   int do;
   int dh;
   byte dz;
   int bv;
   byte di;
   byte da;
   kk[] dd;
   int eg;
   int dx;
   int dy;
   int ds;
   int[] dn;
   int[] du;
   int cp;
   int cf;
   int ea;
   int bf;

   void ea() {
      this.cl = false;
      this.cz = 202849701;
      this.cw = 1207764915;
      this.cr = -95433363;
   }

   final void cp(byte var1) {
      try {
         this.ds = 0;
         this.ea = 0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dy.cp(" + ')');
      }
   }

   boolean bx(int var1) {
      try {
         return false;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dy.bx(" + ')');
      }
   }

   final void cb(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         boolean var8 = true;
         boolean var9 = true;

         int var10;
         for(var10 = 0; var10 < 4; ++var10) {
            if (this.co[var10] > var5) {
               if (var7 >= 1) {
                  throw new IllegalStateException();
               }

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

            hs var14 = (hs)hs.am.ac((long)var1);
            hs var13;
            if (null != var14) {
               if (var7 >= 1) {
                  throw new IllegalStateException();
               }

               var13 = var14;
            } else {
               byte[] var15 = hs.ac.bt(32, var1, (byte)26);
               var14 = new hs();
               if (var15 != null) {
                  if (var7 >= 1) {
                     throw new IllegalStateException();
                  }

                  var14.ae(new vf(var15), -1307140675);
               }

               hs.am.ag(var14, (long)var1);
               var13 = var14;
            }

            var11 = -1805135413 * var13.av;
            var12 = -1968454127 * var13.ap;
         }

         int var17;
         if (var9) {
            if (var7 >= 1) {
               throw new IllegalStateException();
            }

            if (var11 == -1) {
               if (var7 >= 1) {
                  throw new IllegalStateException();
               }

               return;
            }

            var10 = 0;
            var17 = 0;
            if (0 == var11) {
               if (var7 >= 1) {
                  throw new IllegalStateException();
               }

               var17 = this.co[0];
            } else if (var11 == 1) {
               if (var7 >= 1) {
                  throw new IllegalStateException();
               }

               var17 = this.cy[0];
            }

            for(int var18 = 1; var18 < 4; ++var18) {
               if (var7 >= 1) {
                  throw new IllegalStateException();
               }

               if (var11 == 0) {
                  if (var7 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (this.co[var18] < var17) {
                     if (var7 >= 1) {
                        throw new IllegalStateException();
                     }

                     var10 = var18;
                     var17 = this.co[var18];
                  }
               } else if (1 == var11) {
                  if (var7 >= 1) {
                     return;
                  }

                  if (this.cy[var18] < var17) {
                     if (var7 >= 1) {
                        return;
                     }

                     var10 = var18;
                     var17 = this.cy[var18];
                  }
               }
            }

            if (1 == var11) {
               if (var7 >= 1) {
                  throw new IllegalStateException();
               }

               if (var17 >= var2) {
                  return;
               }
            }
         } else {
            if (var8) {
               this.cx = 0;
            }

            for(var17 = 0; var17 < 4; ++var17) {
               if (var7 >= 1) {
                  throw new IllegalStateException();
               }

               byte var19 = this.cx;
               this.cx = (byte)((this.cx + 1) % 4);
               if (this.co[var19] <= var5) {
                  if (var7 >= 1) {
                     throw new IllegalStateException();
                  }

                  var10 = var19;
                  break;
               }
            }
         }

         if (var10 >= 0) {
            this.ci[var10] = var1;
            this.cy[var10] = var2;
            this.cv[var10] = var3;
            this.cg[var10] = var4;
            this.co[var10] = var5 + var12 + var6;
         }
      } catch (RuntimeException var16) {
         throw vk.ae(var16, "dy.cb(" + ')');
      }
   }

   public int au() {
      return -1650600853 * this.bm;
   }

   final void ce(int var1, int var2) {
      try {
         hk var3 = go.ac(var1, -44299623);

         for(eg var4 = (eg)this.ct.ax(); var4 != null; var4 = (eg)this.ct.af()) {
            if (var3 == var4.ag) {
               if (var2 != 16777215) {
                  return;
               }

               var4.jb();
               return;
            }
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "dy.ce(" + ')');
      }
   }

   void ck(int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = var4 + client.do * 1472813913;
         sc var7 = (sc)this.dv.ac((long)var1);
         if (var7 != null) {
            if (var5 == 747300388) {
               throw new IllegalStateException();
            }

            var7.jb();
            this.dt -= 484971093;
         }

         if (65535 != var2) {
            if (var2 != -1) {
               byte var8 = 0;
               if (var4 > 0) {
                  if (var5 == 747300388) {
                     throw new IllegalStateException();
                  }

                  var8 = -1;
               }

               this.dv.ae(new sc(var2, var3, var6, var8), (long)var1);
               this.dt += 484971093;
               return;
            }

            if (var5 == 747300388) {
               return;
            }
         }

      } catch (RuntimeException var9) {
         throw vk.ae(var9, "dy.ck(" + ')');
      }
   }

   void ds() {
      us var1 = new us(this.dv);

      for(sc var2 = (sc)var1.ae(); null != var2; var2 = (sc)var1.next()) {
         var2.jb();
      }

      this.dt = 0;
   }

   void df(int var1) {
      try {
         us var2 = new us(this.dv);

         for(sc var3 = (sc)var2.ae(); null != var3; var3 = (sc)var2.next()) {
            if (var1 == 1031828306) {
               throw new IllegalStateException();
            }

            var3.jb();
         }

         this.dt = 0;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "dy.df(" + ')');
      }
   }

   dy() {
      try {
         super();
         this.an = false;
         this.bw = -532003775;
         this.bj = 953874219;
         this.bp = 1612480661;
         this.by = -232026695;
         this.bb = 1108511933;
         this.bi = -47358635;
         this.bg = -1396205657;
         this.bl = -574585207;
         this.bz = 883354811;
         this.bu = 218464175;
         this.br = 1138815753;
         this.bo = 1800515281;
         this.bv = 239175443;
         this.bt = -1088670113;
         this.bq = -1865505437;
         this.bk = 607871129;
         this.be = null;
         this.cn = false;
         this.ch = 2096008572;
         this.cf = 0;
         this.cu = 0;
         this.cm = null;
         this.cx = 0;
         this.ci = new int[4];
         this.cy = new int[4];
         this.co = new int[4];
         this.cv = new int[4];
         this.cg = new int[4];
         this.ct = new pr();
         this.cq = -1905162023;
         this.cc = false;
         this.cz = 202849701;
         this.cw = 1207764915;
         this.cr = -95433363;
         this.ca = -1278306061;
         this.cs = 0;
         this.cp = 0;
         this.cb = 0;
         this.cd = 46082101;
         this.ce = 0;
         this.ck = 0;
         this.dp = 0;
         this.df = 0;
         this.dv = new ui(4);
         this.dt = 0;
         this.dj = 0;
         this.do = -1698302536;
         this.dh = -298686155;
         this.dm = -1841270221;
         this.dr = 0;
         this.dy = -726500000;
         this.ds = 0;
         this.dn = new int[10];
         this.du = new int[10];
         this.dd = new kk[10];
         this.eg = 0;
         this.ea = 0;
         this.ez = 1221071375;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dy.<init>(" + ')');
      }
   }

   public int ax() {
      return this.bf * -1125889549;
   }

   ui dp(int var1) {
      try {
         return this.dv;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dy.dp(" + ')');
      }
   }

   final void cd(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         hk var8 = go.ac(var1, -44299623);
         eg var9 = null;
         eg var10 = null;
         int var11 = -1158830341 * var8.au;
         int var12 = 0;

         eg var13;
         for(var13 = (eg)this.ct.ax(); var13 != null; var13 = (eg)this.ct.af()) {
            ++var12;
            if (296559381 * var8.ax == 296559381 * var13.ag.ax) {
               var13.ac(var4 + var2, var5, var6, var3, -793429886);
               return;
            }

            if (var13.ag.at * -2120019959 <= -2120019959 * var8.at) {
               var9 = var13;
            }

            if (var13.ag.au * -1158830341 > var11) {
               if (var7 >= -2102573495) {
                  throw new IllegalStateException();
               }

               var10 = var13;
               var11 = var13.ag.au * -1158830341;
            }
         }

         if (null == var10) {
            if (var7 >= -2102573495) {
               throw new IllegalStateException();
            }

            if (var12 >= 4) {
               return;
            }
         }

         var13 = new eg(var8);
         if (var9 == null) {
            if (var7 >= -2102573495) {
               throw new IllegalStateException();
            }

            this.ct.ag(var13);
         } else {
            pr.am(var13, var9);
         }

         var13.ac(var4 + var2, var5, var6, var3, -1663193682);
         if (var12 >= 4) {
            if (var7 >= -2102573495) {
               return;
            }

            var10.jb();
         }

      } catch (RuntimeException var14) {
         throw vk.ae(var14, "dy.cd(" + ')');
      }
   }

   nm dk(dd var1, int var2) {
      try {
         if (var1 == du.js) {
            if (var2 <= -568413480) {
               throw new IllegalStateException();
            } else {
               return new nm(this.ag(-43540049), this.ac(2084253353), this.ae((short)16409));
            }
         } else {
            su var3 = du.js.az[var1.ac * 1011931441];
            if (var3 == null) {
               if (var2 <= -568413480) {
                  throw new IllegalStateException();
               } else {
                  return new nm(this.ag(213898584), this.ac(2084253353), this.ae((short)17859));
               }
            } else {
               int var4 = var3.ac(2084253353);
               int var5 = var3.ae((short)25777);
               int var6 = var3.ag(-954794276);
               int var7 = 754660757 * var3.ar.ax / 2 * 128;
               int var8 = -1090907831 * var3.ar.aq / 2 * 128;
               int var9 = this.ac(2084253353) - var7;
               int var10 = this.ae((short)30504) - var8;
               double var11 = (double)(-(1295026153 * var3.au)) * 3.141592653589793D / 1024.0D;
               double var13 = Math.cos(var11);
               double var15 = Math.sin(var11);
               int var17 = (int)(var13 * (double)var9 - var15 * (double)var10) + var4;
               int var18 = (int)(var13 * (double)var10 + (double)var9 * var15) + var5;
               return new nm(var6, var17, var18);
            }
         }
      } catch (RuntimeException var19) {
         throw vk.ae(var19, "dy.dk(" + ')');
      }
   }

   ui dz() {
      return this.dv;
   }

   int dl(int var1) {
      try {
         return 20342703 * this.do;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dy.dl(" + ')');
      }
   }

   jm dv(jm var1, int var2) {
      try {
         if (-211526915 * this.dt == 0) {
            if (var2 == 595132221) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else {
            us var3 = new us(this.dv);
            int var4 = var1.at;
            int var5 = var1.ad;
            int var6 = var1.aw;
            byte var7 = var1.av;

            for(sc var8 = (sc)var3.ae(); var8 != null; var8 = (sc)var3.next()) {
               if (var2 == 595132221) {
                  throw new IllegalStateException();
               }

               if (-1 == 757511083 * var8.ae) {
                  if (var2 == 595132221) {
                     throw new IllegalStateException();
                  }
               } else {
                  jm var9 = he.ae(var8.ac * -1229069603, (byte)-63).aq(-1755596407);
                  if (null == var9) {
                     if (var2 == 595132221) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var4 += var9.at;
                     var5 += var9.ad;
                     var6 += var9.aw;
                  }
               }
            }

            jm var12 = new jm(var4, var5, var6, var7);
            var12.ag(var1);

            for(sc var13 = (sc)var3.ae(); var13 != null; var13 = (sc)var3.next()) {
               if (var2 == 595132221) {
                  throw new IllegalStateException();
               }

               if (-1 == 757511083 * var13.ae) {
                  if (var2 == 595132221) {
                     throw new IllegalStateException();
                  }
               } else {
                  jm var10 = he.ae(var13.ac * -1229069603, (byte)49).ax(757511083 * var13.ae, -528625722);
                  if (null != var10) {
                     var10.bd(0, -(-1150161211 * var13.ax), 0);
                     var12.ag(var10);
                  }
               }
            }

            return var12;
         }
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "dy.dv(" + ')');
      }
   }

   static void oy(String var0, int var1) {
      try {
         tb.cv = var0;

         try {
            String var2 = ae.be.getParameter(Integer.toString(18));
            String var3 = ae.be.getParameter(Integer.toString(13));
            String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
            String var6;
            if (var0.length() == 0) {
               if (var1 >= 83374951) {
                  throw new IllegalStateException();
               }

               var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
               String var5 = var4 + "; Expires=";
               long var7 = hf.ac(-1598214665) + 94608000000L;
               os.ag.setTime(new Date(var7));
               int var9 = os.ag.get(7);
               int var10 = os.ag.get(5);
               int var11 = os.ag.get(2);
               int var12 = os.ag.get(1);
               int var13 = os.ag.get(11);
               int var14 = os.ag.get(12);
               int var15 = os.ag.get(13);
               var6 = os.ae[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + os.ac[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
               var4 = var5 + var6 + "; Max-Age=" + 94608000L;
            }

            client var18 = ae.be;
            var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var18).eval(var6);
         } catch (Throwable var16) {
         }

      } catch (RuntimeException var17) {
         throw vk.ae(var17, "dy.oy(" + ')');
      }
   }

   public int aq() {
      return du.js.am * 97097587;
   }

   public int af() {
      return du.js.am * 97097587;
   }

   boolean cc() {
      return false;
   }

   boolean cz() {
      return false;
   }

   boolean cw() {
      return false;
   }

   ui da() {
      return this.dv;
   }

   final void dc() {
      this.ds = 0;
      this.ea = 0;
   }

   final void dw() {
      this.ds = 0;
      this.ea = 0;
   }

   final void de(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if (this.co[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if (var1 >= 0) {
         hs var13 = (hs)hs.am.ac((long)var1);
         hs var12;
         if (null != var13) {
            var12 = var13;
         } else {
            byte[] var14 = hs.ac.bt(32, var1, (byte)-24);
            var13 = new hs();
            if (var14 != null) {
               var13.ae(new vf(var14), -1758095331);
            }

            hs.am.ag(var13, (long)var1);
            var12 = var13;
         }

         var10 = -1805135413 * var12.av;
         var11 = -1968454127 * var12.ap;
      }

      int var15;
      if (var8) {
         if (var10 == -1) {
            return;
         }

         var9 = 0;
         var15 = 0;
         if (0 == var10) {
            var15 = this.co[0];
         } else if (var10 == 1) {
            var15 = this.cy[0];
         }

         for(int var16 = 1; var16 < 4; ++var16) {
            if (var10 == 0) {
               if (this.co[var16] < var15) {
                  var9 = var16;
                  var15 = this.co[var16];
               }
            } else if (1 == var10 && this.cy[var16] < var15) {
               var9 = var16;
               var15 = this.cy[var16];
            }
         }

         if (1 == var10 && var15 >= var2) {
            return;
         }
      } else {
         if (var7) {
            this.cx = 0;
         }

         for(var15 = 0; var15 < 4; ++var15) {
            byte var17 = this.cx;
            this.cx = (byte)((this.cx + 1) % 4);
            if (this.co[var17] <= var5) {
               var9 = var17;
               break;
            }
         }
      }

      if (var9 >= 0) {
         this.ci[var9] = var1;
         this.cy[var9] = var2;
         this.cv[var9] = var3;
         this.cg[var9] = var4;
         this.co[var9] = var5 + var11 + var6;
      }
   }

   final void dx(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if (this.co[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if (var1 >= 0) {
         hs var13 = (hs)hs.am.ac((long)var1);
         hs var12;
         if (null != var13) {
            var12 = var13;
         } else {
            byte[] var14 = hs.ac.bt(-220245380, var1, (byte)-55);
            var13 = new hs();
            if (var14 != null) {
               var13.ae(new vf(var14), -2012861832);
            }

            hs.am.ag(var13, (long)var1);
            var12 = var13;
         }

         var10 = -199348329 * var12.av;
         var11 = -1968454127 * var12.ap;
      }

      int var15;
      if (var8) {
         if (var10 == -1) {
            return;
         }

         var9 = 0;
         var15 = 0;
         if (0 == var10) {
            var15 = this.co[0];
         } else if (var10 == 1) {
            var15 = this.cy[0];
         }

         for(int var16 = 1; var16 < 4; ++var16) {
            if (var10 == 0) {
               if (this.co[var16] < var15) {
                  var9 = var16;
                  var15 = this.co[var16];
               }
            } else if (1 == var10 && this.cy[var16] < var15) {
               var9 = var16;
               var15 = this.cy[var16];
            }
         }

         if (1 == var10 && var15 >= var2) {
            return;
         }
      } else {
         if (var7) {
            this.cx = 0;
         }

         for(var15 = 0; var15 < 4; ++var15) {
            byte var17 = this.cx;
            this.cx = (byte)((this.cx + 1) % 4);
            if (this.co[var17] <= var5) {
               var9 = var17;
               break;
            }
         }
      }

      if (var9 >= 0) {
         this.ci[var9] = var1;
         this.cy[var9] = var2;
         this.cv[var9] = var3;
         this.cg[var9] = var4;
         this.co[var9] = var5 + var11 + var6;
      }
   }

   final void dj(int var1, int var2, int var3, int var4, int var5, int var6) {
      hk var7 = go.ac(var1, -44299623);
      eg var8 = null;
      eg var9 = null;
      int var10 = 448543872 * var7.au;
      int var11 = 0;

      eg var12;
      for(var12 = (eg)this.ct.ax(); var12 != null; var12 = (eg)this.ct.af()) {
         ++var11;
         if (296559381 * var7.ax == 296559381 * var12.ag.ax) {
            var12.ac(var4 + var2, var5, var6, var3, 809370822);
            return;
         }

         if (var12.ag.at * 458455708 <= -2120019959 * var7.at) {
            var8 = var12;
         }

         if (var12.ag.au * -1158830341 > var10) {
            var9 = var12;
            var10 = var12.ag.au * -1948534227;
         }
      }

      if (null != var9 || var11 < 4) {
         var12 = new eg(var7);
         if (var8 == null) {
            this.ct.ag(var12);
         } else {
            pr.am(var12, var8);
         }

         var12.ac(var4 + var2, var5, var6, var3, 989463850);
         if (var11 >= 4) {
            var9.jb();
         }

      }
   }

   final void do(int var1, int var2, int var3, int var4, int var5, int var6) {
      hk var7 = go.ac(var1, -44299623);
      eg var8 = null;
      eg var9 = null;
      int var10 = -1158830341 * var7.au;
      int var11 = 0;

      eg var12;
      for(var12 = (eg)this.ct.ax(); var12 != null; var12 = (eg)this.ct.af()) {
         ++var11;
         if (1132364026 * var7.ax == -2055144021 * var12.ag.ax) {
            var12.ac(var4 + var2, var5, var6, var3, 296748684);
            return;
         }

         if (var12.ag.at * -1854752355 <= -2120019959 * var7.at) {
            var8 = var12;
         }

         if (var12.ag.au * -1158830341 > var10) {
            var9 = var12;
            var10 = var12.ag.au * -1158830341;
         }
      }

      if (null != var9 || var11 < 4) {
         var12 = new eg(var7);
         if (var8 == null) {
            this.ct.ag(var12);
         } else {
            pr.am(var12, var8);
         }

         var12.ac(var4 + var2, var5, var6, var3, 1720499326);
         if (var11 >= 4) {
            var9.jb();
         }

      }
   }

   final void dh(int var1, int var2, int var3, int var4, int var5, int var6) {
      hk var7 = go.ac(var1, -44299623);
      eg var8 = null;
      eg var9 = null;
      int var10 = 42653028 * var7.au;
      int var11 = 0;

      eg var12;
      for(var12 = (eg)this.ct.ax(); var12 != null; var12 = (eg)this.ct.af()) {
         ++var11;
         if (1684542500 * var7.ax == 1897434913 * var12.ag.ax) {
            var12.ac(var4 + var2, var5, var6, var3, 2144158952);
            return;
         }

         if (var12.ag.at * -999554971 <= -2120019959 * var7.at) {
            var8 = var12;
         }

         if (var12.ag.au * -1158830341 > var10) {
            var9 = var12;
            var10 = var12.ag.au * -1158830341;
         }
      }

      if (null != var9 || var11 < 4) {
         var12 = new eg(var7);
         if (var8 == null) {
            this.ct.ag(var12);
         } else {
            pr.am(var12, var8);
         }

         var12.ac(var4 + var2, var5, var6, var3, -1802007053);
         if (var11 >= 4) {
            var9.jb();
         }

      }
   }

   final void dm(int var1, int var2, int var3, int var4, int var5, int var6) {
      hk var7 = go.ac(var1, -44299623);
      eg var8 = null;
      eg var9 = null;
      int var10 = -1158830341 * var7.au;
      int var11 = 0;

      eg var12;
      for(var12 = (eg)this.ct.ax(); var12 != null; var12 = (eg)this.ct.af()) {
         ++var11;
         if (296559381 * var7.ax == 296559381 * var12.ag.ax) {
            var12.ac(var4 + var2, var5, var6, var3, -467154640);
            return;
         }

         if (var12.ag.at * -2120019959 <= -2120019959 * var7.at) {
            var8 = var12;
         }

         if (var12.ag.au * -1158830341 > var10) {
            var9 = var12;
            var10 = var12.ag.au * -1158830341;
         }
      }

      if (null != var9 || var11 < 4) {
         var12 = new eg(var7);
         if (var8 == null) {
            this.ct.ag(var12);
         } else {
            pr.am(var12, var8);
         }

         var12.ac(var4 + var2, var5, var6, var3, -907826574);
         if (var11 >= 4) {
            var9.jb();
         }

      }
   }

   public int ac(int var1) {
      try {
         return this.bf * -1125889549;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dy.ac(" + ')');
      }
   }

   final void di(int var1) {
      hk var2 = go.ac(var1, -44299623);

      for(eg var3 = (eg)this.ct.ax(); var3 != null; var3 = (eg)this.ct.af()) {
         if (var2 == var3.ag) {
            var3.jb();
            return;
         }
      }

   }

   public int ag(int var1) {
      try {
         return du.js.am * 97097587;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dy.ag(" + ')');
      }
   }

   final void db() {
      this.ds = 0;
      this.ea = 0;
   }

   ui dg() {
      return this.dv;
   }

   void dt(int var1) {
      try {
         this.cl = false;
         this.cz = 202849701;
         this.cw = 1207764915;
         this.cr = -95433363;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dy.dt(" + ')');
      }
   }

   void dy() {
      us var1 = new us(this.dv);

      for(sc var2 = (sc)var1.ae(); null != var2; var2 = (sc)var1.next()) {
         var2.jb();
      }

      this.dt = 0;
   }

   public int am() {
      return this.bf * -188594672;
   }

   jm dn(jm var1) {
      if (-211526915 * this.dt == 0) {
         return var1;
      } else {
         us var2 = new us(this.dv);
         int var3 = var1.at;
         int var4 = var1.ad;
         int var5 = var1.aw;
         byte var6 = var1.av;

         for(sc var7 = (sc)var2.ae(); var7 != null; var7 = (sc)var2.next()) {
            if (-1 != 757511083 * var7.ae) {
               jm var8 = he.ae(var7.ac * -1229069603, (byte)45).aq(-357484105);
               if (null != var8) {
                  var3 += var8.at;
                  var4 += var8.ad;
                  var5 += var8.aw;
               }
            }
         }

         jm var10 = new jm(var3, var4, var5, var6);
         var10.ag(var1);

         for(sc var11 = (sc)var2.ae(); var11 != null; var11 = (sc)var2.next()) {
            if (-1 != 757511083 * var11.ae) {
               jm var9 = he.ae(var11.ac * -1229069603, (byte)-14).ax(757511083 * var11.ae, 224044402);
               if (null != var9) {
                  var9.bd(0, -(-1150161211 * var11.ax), 0);
                  var10.ag(var9);
               }
            }
         }

         return var10;
      }
   }

   jm du(jm var1) {
      if (-211526915 * this.dt == 0) {
         return var1;
      } else {
         us var2 = new us(this.dv);
         int var3 = var1.at;
         int var4 = var1.ad;
         int var5 = var1.aw;
         byte var6 = var1.av;

         for(sc var7 = (sc)var2.ae(); var7 != null; var7 = (sc)var2.next()) {
            if (-1 != 757511083 * var7.ae) {
               jm var8 = he.ae(var7.ac * -1229069603, (byte)28).aq(-1701719633);
               if (null != var8) {
                  var3 += var8.at;
                  var4 += var8.ad;
                  var5 += var8.aw;
               }
            }
         }

         jm var10 = new jm(var3, var4, var5, var6);
         var10.ag(var1);

         for(sc var11 = (sc)var2.ae(); var11 != null; var11 = (sc)var2.next()) {
            if (-1 != 757511083 * var11.ae) {
               jm var9 = he.ae(var11.ac * -1229069603, (byte)-48).ax(757511083 * var11.ae, -1394975542);
               if (null != var9) {
                  var9.bd(0, -(-1150161211 * var11.ax), 0);
                  var10.ag(var9);
               }
            }
         }

         return var10;
      }
   }

   public int ae(short var1) {
      try {
         return -1650600853 * this.bm;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dy.ae(" + ')');
      }
   }

   void eg() {
      this.cl = false;
      this.cz = -437164905;
      this.cw = 323543181;
      this.cr = 835530046;
   }

   ui dr() {
      return this.dv;
   }

   void ez() {
      this.cl = false;
      this.cz = 202849701;
      this.cw = 1207764915;
      this.cr = -95433363;
   }

   public int at() {
      return -1650600853 * this.bm;
   }

   int ew() {
      return -1680109328 * this.do;
   }

   public int ar() {
      return -1650600853 * this.bm;
   }

   public int al() {
      return -1650600853 * this.bm;
   }

   nm ev(dd var1) {
      if (var1 == du.js) {
         return new nm(this.ag(106332880), this.ac(2084253353), this.ae((short)27309));
      } else {
         su var2 = du.js.az[var1.ac * -298933356];
         if (var2 == null) {
            return new nm(this.ag(-1026871170), this.ac(2084253353), this.ae((short)30374));
         } else {
            int var3 = var2.ac(2084253353);
            int var4 = var2.ae((short)26213);
            int var5 = var2.ag(673297889);
            int var6 = -851593929 * var2.ar.ax / 2 * 128;
            int var7 = -255904788 * var2.ar.aq / 2 * 128;
            int var8 = this.ac(2084253353) - var6;
            int var9 = this.ae((short)20783) - var7;
            double var10 = (double)(-(1295026153 * var2.au)) * 3.141592653589793D / 1024.0D;
            double var12 = Math.cos(var10);
            double var14 = Math.sin(var10);
            int var16 = (int)(var12 * (double)var8 - var14 * (double)var9) + var3;
            int var17 = (int)(var12 * (double)var9 + (double)var8 * var14) + var4;
            return new nm(var5, var16, var17);
         }
      }
   }

   int ef() {
      return 20342703 * this.do;
   }

   final void dq(int var1) {
      hk var2 = go.ac(var1, -44299623);

      for(eg var3 = (eg)this.ct.ax(); var3 != null; var3 = (eg)this.ct.af()) {
         if (var2 == var3.ag) {
            var3.jb();
            return;
         }
      }

   }

   jm dd(jm var1) {
      if (-211526915 * this.dt == 0) {
         return var1;
      } else {
         us var2 = new us(this.dv);
         int var3 = var1.at;
         int var4 = var1.ad;
         int var5 = var1.aw;
         byte var6 = var1.av;

         for(sc var7 = (sc)var2.ae(); var7 != null; var7 = (sc)var2.next()) {
            if (-1 != 757511083 * var7.ae) {
               jm var8 = he.ae(var7.ac * -1229069603, (byte)-43).aq(-39752499);
               if (null != var8) {
                  var3 += var8.at;
                  var4 += var8.ad;
                  var5 += var8.aw;
               }
            }
         }

         jm var10 = new jm(var3, var4, var5, var6);
         var10.ag(var1);

         for(sc var11 = (sc)var2.ae(); var11 != null; var11 = (sc)var2.next()) {
            if (-1 != 757511083 * var11.ae) {
               jm var9 = he.ae(var11.ac * -1229069603, (byte)-27).ax(757511083 * var11.ae, 188393695);
               if (null != var9) {
                  var9.bd(0, -(-1150161211 * var11.ax), 0);
                  var10.ag(var9);
               }
            }
         }

         return var10;
      }
   }

   public static boolean ag(char var0, int var1) {
      try {
         if (var0 >= ' ') {
            if (var1 >= -192553282) {
               throw new IllegalStateException();
            }

            if (var0 < 127) {
               return true;
            }

            if (var1 >= -192553282) {
               throw new IllegalStateException();
            }
         }

         if (var0 > 127) {
            if (var1 >= -192553282) {
               throw new IllegalStateException();
            }

            if (var0 < 160) {
               return true;
            }

            if (var1 >= -192553282) {
               throw new IllegalStateException();
            }
         }

         if (var0 > 160) {
            if (var1 >= -192553282) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var1 >= -192553282) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (var0 != 0) {
            if (var1 >= -192553282) {
               throw new IllegalStateException();
            }

            char[] var2 = qt.ac;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               if (var1 >= -192553282) {
                  throw new IllegalStateException();
               }

               char var4 = var2[var3];
               if (var0 == var4) {
                  if (var1 >= -192553282) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "dy.ag(" + ')');
      }
   }

   static void pd(int var0) {
      try {
         if (1 == client.lz * -383889001) {
            if (var0 != -1073560894) {
               throw new IllegalStateException();
            }

            client.lw = true;
         }

      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dy.pd(" + ')');
      }
   }

   static final void al(String var0, int var1) {
      try {
         qa.au(var0 + ok.hr, (byte)15);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dy.al(" + ')');
      }
   }
}
