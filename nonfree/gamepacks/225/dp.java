import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class dp {
   static vt at;
   static int ag = 0;
   static vt[] am;
   static vt aq;
   static int aw;
   static String cc;
   static int aj;
   static final int bd = 3;
   static String an;
   static long da;
   static int dh;
   static int bo;
   static int bq;
   static int cn;
   static String ch;
   static String cf;
   static String cu;
   static int dp;
   static String cj;
   static String cx;
   static String cm;
   static String df;
   static String[] co;
   static boolean cp;
   static boolean cb;
   static boolean ck;
   static String dv;
   static final int bl = 33;
   static boolean ae;
   static boolean dk;
   static int do;
   static int dm;
   static vt af;
   static long di;
   static int cy;
   static String[] dz;
   static String[] dg;
   static String[] dr;
   static of fn;
   public static int[] ax;

   static void bx() {
      if (ae) {
         gl.ax = null;
         aq = null;
         am = null;
         ma.au = null;
         lg.ar = null;
         ey.al = null;
         fv.ad = null;
         gq.ah = null;
         qf.ab = null;
         af.dl = null;
         as.db = null;
         ll.dc = null;
         eu.dw = null;
         fg.de = null;
         kp.aa.am((byte)-72);
         ly.ax(0, 802032223, (byte)64);
         py var0 = tw.ve;
         var0.ae(true, -1243564029);
         ae = false;
      }
   }

   static {
      aj = ag * -1517185997 + -1947126146;
      aw = -190728738;
      an = "";
      bo = 190769327;
      bq = 1721091403;
      cn = 0;
      ch = "";
      cf = "";
      cu = "";
      cm = "";
      cj = "";
      cx = "";
      cy = 0;
      co = new String[8];
      cc = "";
      cp = false;
      cb = false;
      ck = true;
      dp = 0;
      df = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
      dv = "1234567890";
      dk = false;
      do = 721068009;
      dh = 0;
      dm = 0;
      new DecimalFormat("##0.00");
      new fs();
      di = -7279498726138968329L;
      da = -1080920665870794473L;
      dz = new String[]{"title.jpg"};
      dg = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
      dr = new String[]{"logo_speedrunning"};
   }

   static void bg() {
      if ((12039691 * client.ch & uk.ak.ac(-350930589)) != 0) {
         ch = "";
         cf = ok.iy;
         cu = ok.ih;
         cm = ok.iu;
         cw.ao(1, -11777199);
         ev.aq((byte)1);
      } else if ((client.ch * 12039691 & uk.ag.ac(-350930589)) != 0) {
         if ((client.ch * 12039691 & uk.al.ac(-350930589)) != 0) {
            cf = ok.ik;
            cu = ok.ib;
            cm = ok.ig;
         } else {
            cf = ok.ir;
            cu = ok.it;
            cm = ok.il;
         }

         ch = ok.ix;
         cw.ao(1, 1828540368);
         ev.aq((byte)1);
      } else if ((client.ch * 12039691 & uk.al.ac(-350930589)) != 0) {
         cf = ok.iw;
         cu = ok.iv;
         cm = ok.io;
         ch = ok.ix;
         cw.ao(1, 775927446);
         ev.aq((byte)1);
      } else {
         ks.ah(false, -1875115260);
      }

   }

   static int aj(po var0) {
      int var1 = dg.length + dz.length;
      String[] var2 = dr;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         String var4 = var2[var3];
         if (var0.cg(var4, (short)3094) != -1) {
            ++var1;
         }
      }

      return var1;
   }

   static void av(po var0, po var1, sn var2, boolean var3, int var4) {
      if (ae) {
         if (var4 == 4) {
            cw.ao(4, 516398633);
         }

      } else {
         if (var4 == 0) {
            fm.ap(var3, -1665367114);
         } else {
            cw.ao(var4, 2025953199);
         }

         vr.ft();
         byte[] var5 = var0.cc("title.jpg", "", -164224592);
         ma.au = ez.ac(var5, 35301021);
         lg.ar = ma.au.ac();
         hg.ax(var1, client.ch * 608183189, -1434375231);
         gl.ax = sq.ax(var1, "titlebox", "", 1238559419);
         aq = sq.ax(var1, "titlebutton", "", 1719983547);
         af = sq.ax(var1, "titlebutton_large", "", 707981352);
         at = sq.ax(var1, "play_now_text", "", 231489613);
         sq.ax(var1, "titlebutton_wide42,1", "", 773928895);
         am = it.am(var1, "runes", "", (byte)109);
         fv.ad = it.am(var1, "title_mute", "", (byte)43);
         gq.ah = sq.ax(var1, "options_radio_buttons,0", "", 721012724);
         cc.ap = sq.ax(var1, "options_radio_buttons,4", "", 1161038113);
         qf.ab = sq.ax(var1, "options_radio_buttons,2", "", 1421739935);
         at.az = sq.ax(var1, "options_radio_buttons,6", "", 956000196);
         ci.ca = 503732347 * gq.ah.ag;
         mq.cs = -1016049138 * gq.ah.am;
         kp.aa = new dn(am, var2.aa);
         if (var3) {
            cj = "";
            cx = "";
            co = new String[8];
            cy = 0;
         }

         ch.cd = 0;
         px.ce = "";
         ck = true;
         dk = false;
         if (!re.vt.ar((byte)1)) {
            ArrayList var6 = new ArrayList();
            var6.add(new ns(hg.fe, "scape main", "", 255, false));
            gg.am(var6, 0, 0, 0, 100, false, (byte)-25);
         } else {
            ly.ax(0, 0, (byte)64);
         }

         bo.ar((byte)-63);
         py var7 = tw.ve;
         var7.ae(false, 630952051);
         ae = true;
         ag = (fa.aj * -1677852978 - 765) / 2 * -388041997;
         aj = -1241625413 + -1771433181 * ag;
         oe.av = 1953755884 + 1707252733 * aj;
         ma.au.al(ag * -1776792799, 0);
         lg.ar.al(ag * -1335200433 + 382, 0);
         ey.al.ag(214579267 * ag + 1224161992 - ey.al.ag / 2, 18);
      }
   }

   static boolean bz() {
      Date var0;
      try {
         SimpleDateFormat var2 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
         var2.setLenient(false);
         StringBuilder var3 = new StringBuilder();
         String[] var4 = co;
         int var5 = 0;

         while(true) {
            Date var1;
            if (var5 < var4.length) {
               String var6 = var4[var5];
               if (var6 != null) {
                  var3.append(var6);
                  ++var5;
                  continue;
               }

               cw.ao(7, -305627734);
               aa("Date not valid.", "Please ensure all characters are populated.", "", (byte)-81);
               var1 = null;
            } else {
               var3.append("12");
               var1 = var2.parse(var3.toString());
            }

            var0 = var1;
            break;
         }
      } catch (ParseException var7) {
         cw.ao(7, 1637921545);
         aa("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", (byte)-41);
         return false;
      }

      if (var0 == null) {
         return false;
      } else {
         boolean var8 = hq.ad(var0, (byte)-64);
         Date var10 = ke.al(-1942879846);
         boolean var9 = var0.after(var10);
         if (!var9) {
            cw.ao(7, 600386927);
            aa("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", (byte)27);
            return false;
         } else {
            if (!var8) {
               dt.ci = 1463919121;
            } else {
               dt.ci = (int)(var0.getTime() / 86400000L - 11745L) * -1606525457;
            }

            return true;
         }
      }
   }

   static void an() {
      if (null == cj || cj.length() <= 0) {
         if (re.vt.an(-1102891638) != null) {
            cj = re.vt.an(1595633445);
            client.hn = true;
         } else {
            client.hn = false;
         }

      }
   }

   static void ch(qu var0, qu var1, qu var2) {
      ag = -31524639 * ((-1991951399 * fa.aj - 765) / 2);
      aj = -1517185997 * ag + -1947126146;
      oe.av = 1953755884 + 1707252733 * aj;
      byte var3;
      int var4;
      int var10;
      int var18;
      int var24;
      int var27;
      int var28;
      int var29;
      int var31;
      int var33;
      if (dk) {
         if (af.dl == null) {
            af.dl = kx.aq(cq.fb, "sl_back", "", (short)-6670);
         }

         if (null == as.db) {
            as.db = it.am(cq.fb, "sl_flags", "", (byte)5);
         }

         if (ll.dc == null) {
            ll.dc = it.am(cq.fb, "sl_arrows", "", (byte)8);
         }

         if (null == eu.dw) {
            eu.dw = it.am(cq.fb, "sl_stars", "", (byte)109);
         }

         if (null == gh.dx) {
            gh.dx = sq.ax(cq.fb, "leftarrow", "", 1410609673);
         }

         if (hg.dj == null) {
            hg.dj = sq.ax(cq.fb, "rightarrow", "", 1865872182);
         }

         vr.fr(-1776792799 * ag, 23, 765, 480, 0);
         vr.fg(ag * -1776792799, 0, 125, 23, 12425273, 9135624);
         vr.fg(125 + -1776792799 * ag, 0, 640, 23, 5197647, 2697513);
         var0.ay(ok.ml, 62 + ag * -1776792799, 15, 0, -1);
         if (null != eu.dw) {
            eu.dw[1].ag(140 + ag * -1776792799, 1);
            var1.ai(ok.mc, 152 + -1776792799 * ag, 10, 16777215, -1);
            eu.dw[0].ag(-1776792799 * ag + 140, 12);
            var1.ai(ok.mb, 152 + -1776792799 * ag, 21, 16777215, -1);
         }

         int var42;
         if (null != ll.dc) {
            var24 = -1776792799 * ag + 280;
            if (cr.au[0] == 0 && 0 == cr.at[0]) {
               ll.dc[2].ag(var24, 4);
            } else {
               ll.dc[0].ag(var24, 4);
            }

            if (0 == cr.au[0] && 1 == cr.at[0]) {
               ll.dc[3].ag(var24 + 15, 4);
            } else {
               ll.dc[1].ag(var24 + 15, 4);
            }

            var0.ai(ok.mg, 32 + var24, 17, 16777215, -1);
            var4 = ag * -1776792799 + 390;
            if (1 == cr.au[0] && 0 == cr.at[0]) {
               ll.dc[2].ag(var4, 4);
            } else {
               ll.dc[0].ag(var4, 4);
            }

            if (cr.au[0] == 1 && cr.at[0] == 1) {
               ll.dc[3].ag(var4 + 15, 4);
            } else {
               ll.dc[1].ag(15 + var4, 4);
            }

            var0.ai(ok.mp, 32 + var4, 17, 16777215, -1);
            var27 = ag * -1776792799 + 500;
            if (cr.au[0] == 2 && cr.at[0] == 0) {
               ll.dc[2].ag(var27, 4);
            } else {
               ll.dc[0].ag(var27, 4);
            }

            if (cr.au[0] == 2 && cr.at[0] == 1) {
               ll.dc[3].ag(var27 + 15, 4);
            } else {
               ll.dc[1].ag(var27 + 15, 4);
            }

            var0.ai(ok.mn, 32 + var27, 17, 16777215, -1);
            var42 = ag * -1776792799 + 610;
            if (3 == cr.au[0] && 0 == cr.at[0]) {
               ll.dc[2].ag(var42, 4);
            } else {
               ll.dc[0].ag(var42, 4);
            }

            if (cr.au[0] == 3 && 1 == cr.at[0]) {
               ll.dc[3].ag(15 + var42, 4);
            } else {
               ll.dc[1].ag(var42 + 15, 4);
            }

            var0.ai(ok.mr, var42 + 32, 17, 16777215, -1);
         }

         vr.fr(ag * -1776792799 + 708, 4, 50, 16, 0);
         var1.ay(ok.ju, 25 + -1776792799 * ag + 708, 16, 16777215, -1);
         do = 721068009;
         if (af.dl != null) {
            var3 = 88;
            byte var45 = 19;
            var27 = 765 / (1 + var3) - 1;
            var42 = 480 / (var45 + 1);

            do {
               var28 = var42;
               var29 = var27;
               if (var42 * (var27 - 1) >= -571562711 * cr.aq) {
                  --var27;
               }

               if (var27 * (var42 - 1) >= cr.aq * -571562711) {
                  --var42;
               }

               if (var27 * (var42 - 1) >= -571562711 * cr.aq) {
                  --var42;
               }
            } while(var28 != var42 || var29 != var27);

            var28 = (765 - var3 * var27) / (1 + var27);
            if (var28 > 5) {
               var28 = 5;
            }

            var29 = (480 - var42 * var45) / (var42 + 1);
            if (var29 > 5) {
               var29 = 5;
            }

            var31 = (765 - var27 * var3 - (var27 - 1) * var28) / 2;
            var10 = (480 - var42 * var45 - var29 * (var42 - 1)) / 2;
            var33 = (var42 + -571562711 * cr.aq - 1) / var42;
            dm = -1195908447 * (var33 - var27);
            if (gh.dx != null && -1187465059 * dh > 0) {
               gh.dx.ag(8, en.av * 608173899 / 2 - gh.dx.am / 2);
            }

            if (null != hg.dj && -1187465059 * dh < dm * -450854559) {
               hg.dj.ag(fa.aj * -1991951399 - hg.dj.ag - 8, 608173899 * en.av / 2 - hg.dj.am / 2);
            }

            int var38 = var10 + 23;
            int var40 = var31 + ag * -1776792799;
            int var14 = 0;
            boolean var43 = false;
            int var44 = dh * -1187465059;

            int var46;
            for(var46 = var42 * var44; var46 < -571562711 * cr.aq && var44 - dh * -1187465059 < var27; ++var46) {
               cr var47 = br.ax[var46];
               boolean var48 = true;
               String var20 = Integer.toString(var47.ah * -1508153235);
               if (-1508153235 * var47.ah == -1) {
                  var20 = ok.mz;
                  var48 = false;
               } else if (var47.ah * -1508153235 > 1980) {
                  var20 = ok.mx;
                  var48 = false;
               }

               eu var21 = null;
               int var22 = 0;
               if (var47.az(1508437473)) {
                  var21 = var47.ar((byte)8) ? eu.at : eu.af;
               } else if (var47.al((byte)-72)) {
                  var21 = var47.ar((byte)8) ? eu.az : eu.ab;
               } else if (var47.ab(1114259502)) {
                  var22 = 16711680;
                  var21 = var47.ar((byte)8) ? eu.aq : eu.ax;
               } else if (var47.aa(-222515794)) {
                  var21 = var47.ar((byte)8) ? eu.ar : eu.au;
               } else if (var47.ah(-1352756371)) {
                  var21 = var47.ar((byte)8) ? eu.am : eu.ag;
               } else if (var47.ai(-2082918795)) {
                  var21 = var47.ar((byte)8) ? eu.ad : eu.al;
               } else if (var47.ao((byte)-88)) {
                  var21 = var47.ar((byte)8) ? eu.ap : eu.ah;
               }

               if (var21 == null || -622240461 * var21.aa >= af.dl.length) {
                  var21 = var47.ar((byte)8) ? eu.ae : eu.ac;
               }

               if (bj.al * -840136299 >= var40 && bj.ad * -1213769803 >= var38 && -840136299 * bj.al < var40 + var3 && -1213769803 * bj.ad < var45 + var38 && var48) {
                  do = -721068009 * var46;
                  af.dl[var21.aa * -622240461].aa(var40, var38, 128, 16777215);
                  var43 = true;
               } else {
                  af.dl[-622240461 * var21.aa].al(var40, var38);
               }

               if (null != as.db) {
                  as.db[(var47.ar((byte)8) ? 8 : 0) + -1651324629 * var47.az].ag(var40 + 29, var38);
               }

               var0.ay(Integer.toString(var47.al * -2102573495), var40 + 15, 5 + var38 + var45 / 2, var22, -1);
               var1.ay(var20, var40 + 60, var45 / 2 + var38 + 5, 268435455, -1);
               var38 += var45 + var29;
               ++var14;
               if (var14 >= var42) {
                  var38 = var10 + 23;
                  var40 += var28 + var3;
                  var14 = 0;
                  ++var44;
               }
            }

            if (var43) {
               var46 = var1.ad(br.ax[-999434329 * do].ab) + 6;
               var18 = 8 + var1.at;
               int var49 = bj.ad * -1213769803 + 25;
               if (var18 + var49 > 480) {
                  var49 = -1213769803 * bj.ad - 25 - var18;
               }

               vr.fr(bj.al * -840136299 - var46 / 2, var49, var46, var18, 16777120);
               vr.fs(bj.al * -840136299 - var46 / 2, var49, var46, var18, 0);
               var1.ay(br.ax[-999434329 * do].ab, bj.al * -840136299, 4 + var1.at + var49, 0, -1);
            }
         }

      } else {
         ma.au.al(-1776792799 * ag, 0);
         lg.ar.al(382 + ag * -1776792799, 0);
         ey.al.ag(ag * -1776792799 + 382 - ey.al.ag / 2, 18);
         if (0 == -941305067 * client.dt || client.dt * -941305067 == 5) {
            var3 = 20;
            var0.ay(ok.ii, 180 + aj * 1359998811, 245 - var3, 16777215, -1);
            var4 = 253 - var3;
            vr.fs(180 + 1359998811 * aj - 152, var4, 304, 34, 9179409);
            vr.fs(180 + aj * 1359998811 - 151, var4 + 1, 302, 32, 0);
            vr.fr(1359998811 * aj + 180 - 150, 2 + var4, aw * -577131295, 30, 9179409);
            vr.fr(aw * -577131295 + (1359998811 * aj + 180 - 150), 2 + var4, 300 - -577131295 * aw, 30, 0);
            var0.ay(an, 180 + 1359998811 * aj, 276 - var3, 16777215, -1);
         }

         String var6;
         String var7;
         String var8;
         String var9;
         short var23;
         short var25;
         if (20 == client.dt * -941305067) {
            gl.ax.ag(180 + aj * 1359998811 - gl.ax.ag / 2, 271 - gl.ax.am / 2);
            var23 = 201;
            var0.ay(cf, aj * 1359998811 + 180, var23, 16776960, 0);
            var24 = var23 + 15;
            var0.ay(cu, 180 + aj * 1359998811, var24, 16776960, 0);
            var24 += 15;
            var0.ay(cm, 1359998811 * aj + 180, var24, 16776960, 0);
            var24 += 15;
            var24 += 7;
            if (-1220996517 * cn != 4 && -1220996517 * cn != 10) {
               var0.ai(ok.jo, aj * 1359998811 + 180 - 110, var24, 16777215, 0);
               var25 = 200;
               if (re.vt.at(-1541350011)) {
                  var8 = cj;
                  var7 = gw.ah('*', var8.length(), (byte)127);
                  var6 = var7;
               } else {
                  var6 = cj;
               }

               for(var6 = var6; var0.ad(var6) > var25; var6 = var6.substring(0, var6.length() - 1)) {
               }

               var0.ai(qk.az(var6), 180 + 1359998811 * aj - 70, var24, 16777215, 0);
               var24 += 15;
               var8 = cx;
               var7 = gw.ah('*', var8.length(), (byte)112);

               for(var9 = var7; var0.ad(var9) > var25; var9 = var9.substring(1)) {
               }

               var0.ai(ok.jp + var9, 1359998811 * aj + 180 - 108, var24, 16777215, 0);
               var24 += 15;
            }
         }

         if (10 == client.dt * -941305067 || -941305067 * client.dt == 11 || 50 == -941305067 * client.dt) {
            gl.ax.ag(1359998811 * aj, 171);
            short var5;
            if (cn * -1220996517 == 0) {
               var23 = 251;
               var0.ay(ok.jg, 180 + 1359998811 * aj, var23, 16776960, 0);
               var24 = var23 + 30;
               var4 = 1359998811 * aj + 180 - 80;
               var5 = 291;
               aq.ag(var4 - 73, var5 - 20);
               var0.aj(ok.jh, var4 - 73, var5 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var4 = 1359998811 * aj + 180 + 80;
               aq.ag(var4 - 73, var5 - 20);
               var0.aj(ok.ja, var4 - 73, var5 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (1 == cn * -1220996517) {
               var0.ay(ch, 1359998811 * aj + 180, 201, 16776960, 0);
               var23 = 236;
               var0.ay(cf, 180 + 1359998811 * aj, var23, 16777215, 0);
               var24 = var23 + 15;
               var0.ay(cu, 1359998811 * aj + 180, var24, 16777215, 0);
               var24 += 15;
               var0.ay(cm, 180 + aj * 1359998811, var24, 16777215, 0);
               var24 += 15;
               var4 = 180 + 1359998811 * aj - 80;
               var5 = 321;
               aq.ag(var4 - 73, var5 - 20);
               var0.ay(ok.au, var4, 5 + var5, 16777215, 0);
               var4 = 1359998811 * aj + 180 + 80;
               aq.ag(var4 - 73, var5 - 20);
               var0.ay(ok.ju, var4, 5 + var5, 16777215, 0);
            } else if (-1220996517 * cn == 2) {
               var23 = 201;
               var0.ay(cf, 2045762615 * oe.av, var23, 16776960, 0);
               var24 = var23 + 15;
               var0.ay(cu, 2045762615 * oe.av, var24, 16776960, 0);
               var24 += 15;
               var0.ay(cm, oe.av * 2045762615, var24, 16776960, 0);
               var24 += 15;
               var24 += 7;
               var0.ai(ok.jo, oe.av * 2045762615 - 110, var24, 16777215, 0);
               var25 = 200;
               if (re.vt.at(-1408097313)) {
                  var8 = cj;
                  var7 = gw.ah('*', var8.length(), (byte)122);
                  var6 = var7;
               } else {
                  var6 = cj;
               }

               for(var6 = var6; var0.ad(var6) > var25; var6 = var6.substring(1)) {
               }

               var0.ai(qk.az(var6) + (dp * -1584448409 == 0 & 1472813913 * client.do % 40 < 20 ? ar.ae(16776960, 1125198009) + ez.ag : ""), oe.av * 2045762615 - 70, var24, 16777215, 0);
               var24 += 15;
               var8 = cx;
               var7 = gw.ah('*', var8.length(), (byte)108);

               for(var9 = var7; var0.ad(var9) > var25; var9 = var9.substring(1)) {
               }

               var0.ai(ok.jp + var9 + (-1584448409 * dp == 1 & 1472813913 * client.do % 40 < 20 ? ar.ae(16776960, 837641855) + ez.ag : ""), 2045762615 * oe.av - 108, var24, 16777215, 0);
               var24 += 15;
               var23 = 277;
               var10 = -117 + 2045762615 * oe.av;
               boolean var12 = client.hn;
               boolean var13 = cp;
               vt var11 = var12 ? (var13 ? at.az : qf.ab) : (var13 ? cc.ap : gq.ah);
               var11.ag(var10, var23);
               var10 += var11.ag + 5;
               var1.ai(ok.js, var10, var23 + 13, 16776960, 0);
               var10 = 2045762615 * oe.av + 24;
               boolean var16 = re.vt.at(-1862599168);
               boolean var17 = cb;
               vt var15 = var16 ? (var17 ? at.az : qf.ab) : (var17 ? cc.ap : gq.ah);
               var15.ag(var10, var23);
               var10 += 5 + var15.ag;
               var1.ai(ok.jk, var10, 13 + var23, 16776960, 0);
               var24 = var23 + 15;
               var18 = oe.av * 2045762615 - 80;
               short var19 = 321;
               aq.ag(var18 - 73, var19 - 20);
               var0.ay(ok.jn, var18, 5 + var19, 16777215, 0);
               var18 = 80 + oe.av * 2045762615;
               aq.ag(var18 - 73, var19 - 20);
               var0.ay(ok.ju, var18, var19 + 5, 16777215, 0);
               var23 = 357;
               switch(bq * -1783522205) {
               case 2:
                  il.bk = ok.kk;
                  break;
               default:
                  il.bk = ok.ks;
               }

               ch.be = new qy(oe.av * 2045762615, var23, var1.ad(il.bk), 11);
               cr.bc = new qy(oe.av * 2045762615, var23, var1.ad(ok.kt), 11);
               var1.ay(il.bk, 2045762615 * oe.av, var23, 16777215, 0);
            } else if (cn * -1220996517 == 3) {
               var23 = 201;
               var0.ay(ok.kg, 180 + 1359998811 * aj, var23, 16776960, 0);
               var24 = var23 + 20;
               var1.ay(ok.kc, 180 + aj * 1359998811, var24, 16776960, 0);
               var24 += 20;
               var1.ay(ok.ki, 180 + aj * 1359998811, var24, 16776960, 0);
               var24 += 15;
               var4 = 180 + 1359998811 * aj;
               var5 = 276;
               aq.ag(var4 - 73, var5 - 20);
               var2.ay(ok.kp, var4, var5 + 5, 16777215, 0);
               var4 = 180 + 1359998811 * aj;
               var5 = 326;
               aq.ag(var4 - 73, var5 - 20);
               var2.ay(ok.kh, var4, 5 + var5, 16777215, 0);
            } else {
               String var26;
               if (4 == cn * -1220996517) {
                  var0.ay(ok.iq, 180 + 1359998811 * aj, 201, 16776960, 0);
                  var23 = 236;
                  var0.ay(cf, 180 + aj * 1359998811, var23, 16777215, 0);
                  var24 = var23 + 15;
                  var0.ay(cu, 1359998811 * aj + 180, var24, 16777215, 0);
                  var24 += 15;
                  var0.ay(cm, 1359998811 * aj + 180, var24, 16777215, 0);
                  var24 += 15;
                  var26 = ok.ji;
                  var7 = px.ce;
                  var6 = gw.ah('*', var7.length(), (byte)124);
                  var0.ai(var26 + var6 + (1472813913 * client.do % 40 < 20 ? ar.ae(16776960, 1259934261) + ez.ag : ""), 180 + aj * 1359998811 - 108, var24, 16777215, 0);
                  var24 -= 8;
                  var0.ai(ok.ad, 180 + 1359998811 * aj - 9, var24, 16776960, 0);
                  var24 += 15;
                  var0.ai(ok.ah, 180 + aj * 1359998811 - 9, var24, 16776960, 0);
                  var29 = 1359998811 * aj + 180 - 9 + var0.ad(ok.ah) + 15;
                  var31 = var24 - var0.at;
                  vt var32;
                  if (ck) {
                     var32 = qf.ab;
                  } else {
                     var32 = gq.ah;
                  }

                  var32.ag(var29, var31);
                  var24 += 15;
                  var33 = 1359998811 * aj + 180 - 80;
                  short var37 = 321;
                  aq.ag(var33 - 73, var37 - 20);
                  var0.ay(ok.au, var33, var37 + 5, 16777215, 0);
                  var33 = 180 + aj * 1359998811 + 80;
                  aq.ag(var33 - 73, var37 - 20);
                  var0.ay(ok.ju, var33, var37 + 5, 16777215, 0);
                  var1.ay(ok.ks, 1359998811 * aj + 180, var37 + 36, 16777215, 0);
               } else {
                  short var30;
                  if (5 == cn * -1220996517) {
                     var0.ay(ok.kd, 1359998811 * aj + 180, 201, 16776960, 0);
                     var23 = 221;
                     var2.ay(cf, 180 + aj * 1359998811, var23, 16776960, 0);
                     var24 = var23 + 15;
                     var2.ay(cu, 180 + aj * 1359998811, var24, 16776960, 0);
                     var24 += 15;
                     var2.ay(cm, aj * 1359998811 + 180, var24, 16776960, 0);
                     var24 += 15;
                     var24 += 14;
                     var0.ai(ok.kx, 180 + aj * 1359998811 - 145, var24, 16777215, 0);
                     var25 = 174;
                     if (re.vt.at(1090469889)) {
                        var8 = cj;
                        var7 = gw.ah('*', var8.length(), (byte)125);
                        var6 = var7;
                     } else {
                        var6 = cj;
                     }

                     for(var6 = var6; var0.ad(var6) > var25; var6 = var6.substring(1)) {
                     }

                     var0.ai(qk.az(var6) + (1472813913 * client.do % 40 < 20 ? ar.ae(16776960, 1536795588) + ez.ag : ""), 1359998811 * aj + 180 - 34, var24, 16777215, 0);
                     var24 += 15;
                     var28 = 180 + aj * 1359998811 - 80;
                     var30 = 321;
                     aq.ag(var28 - 73, var30 - 20);
                     var0.ay(ok.ka, var28, var30 + 5, 16777215, 0);
                     var28 = 80 + 1359998811 * aj + 180;
                     aq.ag(var28 - 73, var30 - 20);
                     var0.ay(ok.kf, var28, var30 + 5, 16777215, 0);
                     var30 = 356;
                     var1.ay(ok.kt, 2045762615 * oe.av, var30, 268435455, 0);
                  } else if (cn * -1220996517 == 6) {
                     var23 = 201;
                     var0.ay(cf, 1359998811 * aj + 180, var23, 16776960, 0);
                     var24 = var23 + 15;
                     var0.ay(cu, 1359998811 * aj + 180, var24, 16776960, 0);
                     var24 += 15;
                     var0.ay(cm, 1359998811 * aj + 180, var24, 16776960, 0);
                     var24 += 15;
                     var4 = aj * 1359998811 + 180;
                     var5 = 321;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.kf, var4, 5 + var5, 16777215, 0);
                  } else if (7 == -1220996517 * cn) {
                     if (ak.dx && !client.cz) {
                        var23 = 201;
                        var0.ay(cf, oe.av * 2045762615, var23, 16776960, 0);
                        var24 = var23 + 15;
                        var0.ay(cu, 2045762615 * oe.av, var24, 16776960, 0);
                        var24 += 15;
                        var0.ay(cm, 2045762615 * oe.av, var24, 16776960, 0);
                        var4 = 2045762615 * oe.av - 150;
                        var24 += 10;

                        for(var27 = 0; var27 < 8; ++var27) {
                           aq.ax(var4, var24, 30, 40);
                           boolean var34 = cy * 2016267409 == var27 & client.do * 1472813913 % 40 < 20;
                           var0.ai((co[var27] == null ? "" : co[var27]) + (var34 ? ar.ae(16776960, 893858983) + ez.ag : ""), var4 + 10, var24 + 27, 16777215, 0);
                           if (1 != var27 && 3 != var27) {
                              var4 += 35;
                           } else {
                              var4 += 50;
                              var0.ai(qk.az("/"), var4 - 13, var24 + 27, 16777215, 0);
                           }
                        }

                        var27 = 2045762615 * oe.av - 80;
                        short var35 = 321;
                        aq.ag(var27 - 73, var35 - 20);
                        var0.ay("Submit", var27, 5 + var35, 16777215, 0);
                        var27 = oe.av * 2045762615 + 80;
                        aq.ag(var27 - 73, var35 - 20);
                        var0.ay(ok.ju, var27, 5 + var35, 16777215, 0);
                     } else {
                        var23 = 216;
                        var0.ay(ok.lm, aj * 1359998811 + 180, var23, 16776960, 0);
                        var24 = var23 + 15;
                        var2.ay(ok.lw, aj * 1359998811 + 180, var24, 16776960, 0);
                        var24 += 15;
                        var2.ay(ok.ly, 180 + aj * 1359998811, var24, 16776960, 0);
                        var24 += 15;
                        var4 = 180 + 1359998811 * aj - 80;
                        var5 = 321;
                        aq.ag(var4 - 73, var5 - 20);
                        var0.ay(ok.lg, var4, 5 + var5, 16777215, 0);
                        var4 = 80 + 180 + aj * 1359998811;
                        aq.ag(var4 - 73, var5 - 20);
                        var0.ay(ok.kf, var4, var5 + 5, 16777215, 0);
                     }
                  } else if (8 == cn * -1220996517) {
                     var23 = 216;
                     var0.ay(ok.fn, 180 + aj * 1359998811, var23, 16776960, 0);
                     var24 = var23 + 15;
                     var2.ay(ok.fh, 1359998811 * aj + 180, var24, 16776960, 0);
                     var24 += 15;
                     var2.ay(ok.fo, 180 + aj * 1359998811, var24, 16776960, 0);
                     var24 += 15;
                     var4 = aj * 1359998811 + 180 - 80;
                     var5 = 321;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.fw, var4, var5 + 5, 16777215, 0);
                     var4 = aj * 1359998811 + 180 + 80;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.kf, var4, var5 + 5, 16777215, 0);
                  } else if (cn * -1220996517 == 9) {
                     var23 = 221;
                     var0.ay(cf, 1359998811 * aj + 180, var23, 16776960, 0);
                     var24 = var23 + 25;
                     var0.ay(cu, 180 + 1359998811 * aj, var24, 16776960, 0);
                     var24 += 25;
                     var0.ay(cm, 1359998811 * aj + 180, var24, 16776960, 0);
                     var4 = 180 + aj * 1359998811;
                     var5 = 311;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.kp, var4, 5 + var5, 16777215, 0);
                  } else if (-1220996517 * cn == 10) {
                     var24 = aj * 1359998811 + 180;
                     var25 = 209;
                     var0.ay(ok.jg, 1359998811 * aj + 180, var25, 16776960, 0);
                     var4 = var25 + 20;
                     af.ag(var24 - 109, var4);
                     if (cc.isEmpty()) {
                        at.ag(var24 - 48, var4 + 18);
                     } else {
                        at.ag(var24 - 48, var4 + 5);
                        var0.ay(cc, var24, var4 + 68 - 15, 16776960, 0);
                     }
                  } else if (cn * -1220996517 == 12) {
                     var24 = oe.av * 2045762615;
                     var25 = 216;
                     var2.ay(ok.li, var24, var25, 16777215, 0);
                     var4 = var25 + 17;
                     var2.ay(ok.lt, var24, var4, 16777215, 0);
                     var4 += 17;
                     var2.ay(ok.lj, var24, var4, 16777215, 0);
                     var4 += 17;
                     var2.ay(ok.lk, var24, var4, 16777215, 0);
                     var24 = oe.av * 2045762615 - 80;
                     var25 = 311;
                     aq.ag(var24 - 73, var25 - 20);
                     var0.ay(ok.mh, var24, 5 + var25, 16777215, 0);
                     var24 = 2045762615 * oe.av + 80;
                     aq.ag(var24 - 73, var25 - 20);
                     var0.ay(ok.md, var24, 5 + var25, 16777215, 0);
                  } else if (cn * -1220996517 == 13) {
                     var23 = 231;
                     var2.ay(ok.mu, 180 + 1359998811 * aj, var23, 16777215, 0);
                     var24 = var23 + 20;
                     var2.ay(ok.mo, 180 + aj * 1359998811, var24, 16777215, 0);
                     var4 = aj * 1359998811 + 180;
                     var23 = 311;
                     aq.ag(var4 - 73, var23 - 20);
                     var0.ay(ok.kf, var4, var23 + 5, 16777215, 0);
                  } else if (14 == cn * -1220996517) {
                     var23 = 201;
                     String var39 = "";
                     var26 = "";
                     var6 = "";
                     switch(bo * -1857384015) {
                     case 0:
                        var39 = ok.cm;
                        var26 = ok.cj;
                        var6 = ok.cx;
                        break;
                     case 1:
                        var39 = ok.da;
                        var26 = ok.dz;
                        var6 = ok.dg;
                        break;
                     case 2:
                        var39 = ok.ff;
                        var26 = ok.fe;
                        var6 = ok.ft;
                        break;
                     default:
                        ks.ah(false, -1648004059);
                     }

                     var0.ay(var39, 180 + aj * 1359998811, var23, 16776960, 0);
                     var24 = var23 + 20;
                     var0.ay(var26, 180 + 1359998811 * aj, var24, 16776960, 0);
                     var24 += 20;
                     var0.ay(var6, aj * 1359998811 + 180, var24, 16776960, 0);
                     var28 = 1359998811 * aj + 180;
                     var30 = 276;
                     aq.ag(var28 - 73, var30 - 20);
                     if (bo * -1857384015 == 1) {
                        var0.ay(ok.bg, var28, 5 + var30, 16777215, 0);
                     } else {
                        var0.ay(ok.bi, var28, 5 + var30, 16777215, 0);
                     }

                     var28 = 180 + aj * 1359998811;
                     var30 = 326;
                     aq.ag(var28 - 73, var30 - 20);
                     var0.ay(ok.kf, var28, 5 + var30, 16777215, 0);
                  } else if (cn * -1220996517 == 24) {
                     var23 = 221;
                     var0.ay(cf, 1359998811 * aj + 180, var23, 16777215, 0);
                     var24 = var23 + 15;
                     var0.ay(cu, aj * 1359998811 + 180, var24, 16777215, 0);
                     var24 += 15;
                     var0.ay(cm, 1359998811 * aj + 180, var24, 16777215, 0);
                     var24 += 15;
                     var4 = 180 + aj * 1359998811;
                     var5 = 301;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.af, var4, var5 + 5, 16777215, 0);
                  } else if (cn * -1220996517 == 32) {
                     var23 = 216;
                     var0.ay(ok.lm, 180 + 1359998811 * aj, var23, 16776960, 0);
                     var24 = var23 + 15;
                     var2.ay(ok.lw, 180 + aj * 1359998811, var24, 16776960, 0);
                     var24 += 15;
                     var2.ay(ok.ly, aj * 1359998811 + 180, var24, 16776960, 0);
                     var24 += 15;
                     var4 = 180 + 1359998811 * aj - 80;
                     var5 = 321;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.lg, var4, 5 + var5, 16777215, 0);
                     var4 = 80 + 1359998811 * aj + 180;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.kf, var4, 5 + var5, 16777215, 0);
                  } else if (-1220996517 * cn == 33) {
                     var23 = 201;
                     var0.ay(cf, 180 + aj * 1359998811, var23, 16776960, 0);
                     var24 = var23 + 20;
                     var1.ay(cu, aj * 1359998811 + 180, var24, 16776960, 0);
                     var24 += 20;
                     var1.ay(cm, 1359998811 * aj + 180, var24, 16776960, 0);
                     var24 += 15;
                     var4 = 1359998811 * aj + 180;
                     var5 = 276;
                     aq.ag(var4 - 73, var5 - 20);
                     var2.ay(ok.mk, var4, 5 + var5, 16777215, 0);
                     var4 = 180 + aj * 1359998811;
                     var5 = 326;
                     aq.ag(var4 - 73, var5 - 20);
                     var2.ay(ok.kf, var4, 5 + var5, 16777215, 0);
                  }
               }
            }
         }

         if (-941305067 * client.dt >= 10) {
            int[] var50 = new int[4];
            vr.ff(var50);
            vr.et(-1776792799 * ag, 0, -1776792799 * ag + 765, en.av * 608173899);
            kp.aa.ax(ag * -1776792799 - 22, 1472813913 * client.do, (byte)-58);
            kp.aa.ax(22 + -1776792799 * ag + 765 - 128, 1472813913 * client.do, (byte)42);
            vr.fe(var50);
         }

         fv.ad[re.vt.ar((byte)1) ? 1 : 0].ag(ag * -1776792799 + 765 - 40, 463);
         if (-941305067 * client.dt > 5 && dn.cy == px.ac) {
            if (null != fg.de) {
               var24 = ag * -1776792799 + 5;
               var25 = 463;
               byte var36 = 100;
               byte var41 = 35;
               fg.de.ag(var24, var25);
               var0.ay(ok.hf + " " + client.cn * 914504241, var24 + var36 / 2, var41 / 2 + var25 - 2, 16777215, 0);
               if (null != hl.ar) {
                  var1.ay(ok.mq, var36 / 2 + var24, 12 + var41 / 2 + var25, 16777215, 0);
               } else {
                  var1.ay(ok.mj, var36 / 2 + var24, 12 + var41 / 2 + var25, 16777215, 0);
               }
            } else {
               fg.de = sq.ax(cq.fb, "sl_button", "", 1078863379);
            }
         }

      }
   }

   static void bn() {
      if (null == cj || cj.length() <= 0) {
         if (re.vt.an(873524284) != null) {
            cj = re.vt.an(-1972118892);
            client.hn = true;
         } else {
            client.hn = false;
         }

      }
   }

   static void bh() {
      if (ae) {
         gl.ax = null;
         aq = null;
         am = null;
         ma.au = null;
         lg.ar = null;
         ey.al = null;
         fv.ad = null;
         gq.ah = null;
         qf.ab = null;
         af.dl = null;
         as.db = null;
         ll.dc = null;
         eu.dw = null;
         fg.de = null;
         kp.aa.am((byte)-36);
         ly.ax(0, 100, (byte)64);
         py var0 = tw.ve;
         var0.ae(true, -2014331742);
         ae = false;
      }
   }

   static void bd() {
      if (ae) {
         gl.ax = null;
         aq = null;
         am = null;
         ma.au = null;
         lg.ar = null;
         ey.al = null;
         fv.ad = null;
         gq.ah = null;
         qf.ab = null;
         af.dl = null;
         as.db = null;
         ll.dc = null;
         eu.dw = null;
         fg.de = null;
         kp.aa.am((byte)-36);
         ly.ax(0, 100, (byte)64);
         py var0 = tw.ve;
         var0.ae(true, 1453191960);
         ae = false;
      }
   }

   static void cu(qu var0, qu var1, qu var2) {
      ag = -31524639 * ((-1991951399 * fa.aj - 765) / 2);
      aj = -1517185997 * ag + -1947126146;
      oe.av = 1953755884 + 1707252733 * aj;
      byte var3;
      int var4;
      int var10;
      int var18;
      int var24;
      int var27;
      int var28;
      int var29;
      int var31;
      int var33;
      if (dk) {
         if (af.dl == null) {
            af.dl = kx.aq(cq.fb, "sl_back", "", (short)23852);
         }

         if (null == as.db) {
            as.db = it.am(cq.fb, "sl_flags", "", (byte)5);
         }

         if (ll.dc == null) {
            ll.dc = it.am(cq.fb, "sl_arrows", "", (byte)60);
         }

         if (null == eu.dw) {
            eu.dw = it.am(cq.fb, "sl_stars", "", (byte)65);
         }

         if (null == gh.dx) {
            gh.dx = sq.ax(cq.fb, "leftarrow", "", 1546425263);
         }

         if (hg.dj == null) {
            hg.dj = sq.ax(cq.fb, "rightarrow", "", 1625242070);
         }

         vr.fr(-1776792799 * ag, 23, 765, 480, 0);
         vr.fg(ag * -1776792799, 0, 125, 23, 12425273, 9135624);
         vr.fg(125 + -1776792799 * ag, 0, 640, 23, 5197647, 2697513);
         var0.ay(ok.ml, 62 + ag * -1776792799, 15, 0, -1);
         if (null != eu.dw) {
            eu.dw[1].ag(140 + ag * -1776792799, 1);
            var1.ai(ok.mc, 152 + -1776792799 * ag, 10, 16777215, -1);
            eu.dw[0].ag(-1776792799 * ag + 140, 12);
            var1.ai(ok.mb, 152 + -1776792799 * ag, 21, 16777215, -1);
         }

         int var42;
         if (null != ll.dc) {
            var24 = -1776792799 * ag + 280;
            if (cr.au[0] == 0 && 0 == cr.at[0]) {
               ll.dc[2].ag(var24, 4);
            } else {
               ll.dc[0].ag(var24, 4);
            }

            if (0 == cr.au[0] && 1 == cr.at[0]) {
               ll.dc[3].ag(var24 + 15, 4);
            } else {
               ll.dc[1].ag(var24 + 15, 4);
            }

            var0.ai(ok.mg, 32 + var24, 17, 16777215, -1);
            var4 = ag * -1776792799 + 390;
            if (1 == cr.au[0] && 0 == cr.at[0]) {
               ll.dc[2].ag(var4, 4);
            } else {
               ll.dc[0].ag(var4, 4);
            }

            if (cr.au[0] == 1 && cr.at[0] == 1) {
               ll.dc[3].ag(var4 + 15, 4);
            } else {
               ll.dc[1].ag(15 + var4, 4);
            }

            var0.ai(ok.mp, 32 + var4, 17, 16777215, -1);
            var27 = ag * -1776792799 + 500;
            if (cr.au[0] == 2 && cr.at[0] == 0) {
               ll.dc[2].ag(var27, 4);
            } else {
               ll.dc[0].ag(var27, 4);
            }

            if (cr.au[0] == 2 && cr.at[0] == 1) {
               ll.dc[3].ag(var27 + 15, 4);
            } else {
               ll.dc[1].ag(var27 + 15, 4);
            }

            var0.ai(ok.mn, 32 + var27, 17, 16777215, -1);
            var42 = ag * -1776792799 + 610;
            if (3 == cr.au[0] && 0 == cr.at[0]) {
               ll.dc[2].ag(var42, 4);
            } else {
               ll.dc[0].ag(var42, 4);
            }

            if (cr.au[0] == 3 && 1 == cr.at[0]) {
               ll.dc[3].ag(15 + var42, 4);
            } else {
               ll.dc[1].ag(var42 + 15, 4);
            }

            var0.ai(ok.mr, var42 + 32, 17, 16777215, -1);
         }

         vr.fr(ag * -1776792799 + 708, 4, 50, 16, 0);
         var1.ay(ok.ju, 25 + -1776792799 * ag + 708, 16, 16777215, -1);
         do = 721068009;
         if (af.dl != null) {
            var3 = 88;
            byte var45 = 19;
            var27 = 765 / (1 + var3) - 1;
            var42 = 480 / (var45 + 1);

            do {
               var28 = var42;
               var29 = var27;
               if (var42 * (var27 - 1) >= -571562711 * cr.aq) {
                  --var27;
               }

               if (var27 * (var42 - 1) >= cr.aq * -571562711) {
                  --var42;
               }

               if (var27 * (var42 - 1) >= -571562711 * cr.aq) {
                  --var42;
               }
            } while(var28 != var42 || var29 != var27);

            var28 = (765 - var3 * var27) / (1 + var27);
            if (var28 > 5) {
               var28 = 5;
            }

            var29 = (480 - var42 * var45) / (var42 + 1);
            if (var29 > 5) {
               var29 = 5;
            }

            var31 = (765 - var27 * var3 - (var27 - 1) * var28) / 2;
            var10 = (480 - var42 * var45 - var29 * (var42 - 1)) / 2;
            var33 = (var42 + -571562711 * cr.aq - 1) / var42;
            dm = -1195908447 * (var33 - var27);
            if (gh.dx != null && -1187465059 * dh > 0) {
               gh.dx.ag(8, en.av * 608173899 / 2 - gh.dx.am / 2);
            }

            if (null != hg.dj && -1187465059 * dh < dm * -450854559) {
               hg.dj.ag(fa.aj * -1991951399 - hg.dj.ag - 8, 608173899 * en.av / 2 - hg.dj.am / 2);
            }

            int var38 = var10 + 23;
            int var40 = var31 + ag * -1776792799;
            int var14 = 0;
            boolean var43 = false;
            int var44 = dh * -1187465059;

            int var46;
            for(var46 = var42 * var44; var46 < -571562711 * cr.aq && var44 - dh * -1187465059 < var27; ++var46) {
               cr var47 = br.ax[var46];
               boolean var48 = true;
               String var20 = Integer.toString(var47.ah * -1508153235);
               if (-1508153235 * var47.ah == -1) {
                  var20 = ok.mz;
                  var48 = false;
               } else if (var47.ah * -1508153235 > 1980) {
                  var20 = ok.mx;
                  var48 = false;
               }

               eu var21 = null;
               int var22 = 0;
               if (var47.az(-1457608873)) {
                  var21 = var47.ar((byte)8) ? eu.at : eu.af;
               } else if (var47.al((byte)-80)) {
                  var21 = var47.ar((byte)8) ? eu.az : eu.ab;
               } else if (var47.ab(1114259502)) {
                  var22 = 16711680;
                  var21 = var47.ar((byte)8) ? eu.aq : eu.ax;
               } else if (var47.aa(-821486978)) {
                  var21 = var47.ar((byte)8) ? eu.ar : eu.au;
               } else if (var47.ah(-1749560309)) {
                  var21 = var47.ar((byte)8) ? eu.am : eu.ag;
               } else if (var47.ai(-417129103)) {
                  var21 = var47.ar((byte)8) ? eu.ad : eu.al;
               } else if (var47.ao((byte)-2)) {
                  var21 = var47.ar((byte)8) ? eu.ap : eu.ah;
               }

               if (var21 == null || -622240461 * var21.aa >= af.dl.length) {
                  var21 = var47.ar((byte)8) ? eu.ae : eu.ac;
               }

               if (bj.al * -840136299 >= var40 && bj.ad * -1213769803 >= var38 && -840136299 * bj.al < var40 + var3 && -1213769803 * bj.ad < var45 + var38 && var48) {
                  do = -721068009 * var46;
                  af.dl[var21.aa * -622240461].aa(var40, var38, 128, 16777215);
                  var43 = true;
               } else {
                  af.dl[-622240461 * var21.aa].al(var40, var38);
               }

               if (null != as.db) {
                  as.db[(var47.ar((byte)8) ? 8 : 0) + -1651324629 * var47.az].ag(var40 + 29, var38);
               }

               var0.ay(Integer.toString(var47.al * -2102573495), var40 + 15, 5 + var38 + var45 / 2, var22, -1);
               var1.ay(var20, var40 + 60, var45 / 2 + var38 + 5, 268435455, -1);
               var38 += var45 + var29;
               ++var14;
               if (var14 >= var42) {
                  var38 = var10 + 23;
                  var40 += var28 + var3;
                  var14 = 0;
                  ++var44;
               }
            }

            if (var43) {
               var46 = var1.ad(br.ax[-999434329 * do].ab) + 6;
               var18 = 8 + var1.at;
               int var49 = bj.ad * -1213769803 + 25;
               if (var18 + var49 > 480) {
                  var49 = -1213769803 * bj.ad - 25 - var18;
               }

               vr.fr(bj.al * -840136299 - var46 / 2, var49, var46, var18, 16777120);
               vr.fs(bj.al * -840136299 - var46 / 2, var49, var46, var18, 0);
               var1.ay(br.ax[-999434329 * do].ab, bj.al * -840136299, 4 + var1.at + var49, 0, -1);
            }
         }

      } else {
         ma.au.al(-1776792799 * ag, 0);
         lg.ar.al(382 + ag * -1776792799, 0);
         ey.al.ag(ag * -1776792799 + 382 - ey.al.ag / 2, 18);
         if (0 == -941305067 * client.dt || client.dt * -941305067 == 5) {
            var3 = 20;
            var0.ay(ok.ii, 180 + aj * 1359998811, 245 - var3, 16777215, -1);
            var4 = 253 - var3;
            vr.fs(180 + 1359998811 * aj - 152, var4, 304, 34, 9179409);
            vr.fs(180 + aj * 1359998811 - 151, var4 + 1, 302, 32, 0);
            vr.fr(1359998811 * aj + 180 - 150, 2 + var4, aw * -577131295, 30, 9179409);
            vr.fr(aw * -577131295 + (1359998811 * aj + 180 - 150), 2 + var4, 300 - -577131295 * aw, 30, 0);
            var0.ay(an, 180 + 1359998811 * aj, 276 - var3, 16777215, -1);
         }

         String var6;
         String var7;
         String var8;
         String var9;
         short var23;
         short var25;
         if (20 == client.dt * -941305067) {
            gl.ax.ag(180 + aj * 1359998811 - gl.ax.ag / 2, 271 - gl.ax.am / 2);
            var23 = 201;
            var0.ay(cf, aj * 1359998811 + 180, var23, 16776960, 0);
            var24 = var23 + 15;
            var0.ay(cu, 180 + aj * 1359998811, var24, 16776960, 0);
            var24 += 15;
            var0.ay(cm, 1359998811 * aj + 180, var24, 16776960, 0);
            var24 += 15;
            var24 += 7;
            if (-1220996517 * cn != 4 && -1220996517 * cn != 10) {
               var0.ai(ok.jo, aj * 1359998811 + 180 - 110, var24, 16777215, 0);
               var25 = 200;
               if (re.vt.at(-1949306508)) {
                  var8 = cj;
                  var7 = gw.ah('*', var8.length(), (byte)125);
                  var6 = var7;
               } else {
                  var6 = cj;
               }

               for(var6 = var6; var0.ad(var6) > var25; var6 = var6.substring(0, var6.length() - 1)) {
               }

               var0.ai(qk.az(var6), 180 + 1359998811 * aj - 70, var24, 16777215, 0);
               var24 += 15;
               var8 = cx;
               var7 = gw.ah('*', var8.length(), (byte)110);

               for(var9 = var7; var0.ad(var9) > var25; var9 = var9.substring(1)) {
               }

               var0.ai(ok.jp + var9, 1359998811 * aj + 180 - 108, var24, 16777215, 0);
               var24 += 15;
            }
         }

         if (10 == client.dt * -941305067 || -941305067 * client.dt == 11 || 50 == -941305067 * client.dt) {
            gl.ax.ag(1359998811 * aj, 171);
            short var5;
            if (cn * -1220996517 == 0) {
               var23 = 251;
               var0.ay(ok.jg, 180 + 1359998811 * aj, var23, 16776960, 0);
               var24 = var23 + 30;
               var4 = 1359998811 * aj + 180 - 80;
               var5 = 291;
               aq.ag(var4 - 73, var5 - 20);
               var0.aj(ok.jh, var4 - 73, var5 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var4 = 1359998811 * aj + 180 + 80;
               aq.ag(var4 - 73, var5 - 20);
               var0.aj(ok.ja, var4 - 73, var5 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (1 == cn * -1220996517) {
               var0.ay(ch, 1359998811 * aj + 180, 201, 16776960, 0);
               var23 = 236;
               var0.ay(cf, 180 + 1359998811 * aj, var23, 16777215, 0);
               var24 = var23 + 15;
               var0.ay(cu, 1359998811 * aj + 180, var24, 16777215, 0);
               var24 += 15;
               var0.ay(cm, 180 + aj * 1359998811, var24, 16777215, 0);
               var24 += 15;
               var4 = 180 + 1359998811 * aj - 80;
               var5 = 321;
               aq.ag(var4 - 73, var5 - 20);
               var0.ay(ok.au, var4, 5 + var5, 16777215, 0);
               var4 = 1359998811 * aj + 180 + 80;
               aq.ag(var4 - 73, var5 - 20);
               var0.ay(ok.ju, var4, 5 + var5, 16777215, 0);
            } else if (-1220996517 * cn == 2) {
               var23 = 201;
               var0.ay(cf, 2045762615 * oe.av, var23, 16776960, 0);
               var24 = var23 + 15;
               var0.ay(cu, 2045762615 * oe.av, var24, 16776960, 0);
               var24 += 15;
               var0.ay(cm, oe.av * 2045762615, var24, 16776960, 0);
               var24 += 15;
               var24 += 7;
               var0.ai(ok.jo, oe.av * 2045762615 - 110, var24, 16777215, 0);
               var25 = 200;
               if (re.vt.at(723712906)) {
                  var8 = cj;
                  var7 = gw.ah('*', var8.length(), (byte)124);
                  var6 = var7;
               } else {
                  var6 = cj;
               }

               for(var6 = var6; var0.ad(var6) > var25; var6 = var6.substring(1)) {
               }

               var0.ai(qk.az(var6) + (dp * -1584448409 == 0 & 1472813913 * client.do % 40 < 20 ? ar.ae(16776960, 1578554474) + ez.ag : ""), oe.av * 2045762615 - 70, var24, 16777215, 0);
               var24 += 15;
               var8 = cx;
               var7 = gw.ah('*', var8.length(), (byte)122);

               for(var9 = var7; var0.ad(var9) > var25; var9 = var9.substring(1)) {
               }

               var0.ai(ok.jp + var9 + (-1584448409 * dp == 1 & 1472813913 * client.do % 40 < 20 ? ar.ae(16776960, 1203986245) + ez.ag : ""), 2045762615 * oe.av - 108, var24, 16777215, 0);
               var24 += 15;
               var23 = 277;
               var10 = -117 + 2045762615 * oe.av;
               boolean var12 = client.hn;
               boolean var13 = cp;
               vt var11 = var12 ? (var13 ? at.az : qf.ab) : (var13 ? cc.ap : gq.ah);
               var11.ag(var10, var23);
               var10 += var11.ag + 5;
               var1.ai(ok.js, var10, var23 + 13, 16776960, 0);
               var10 = 2045762615 * oe.av + 24;
               boolean var16 = re.vt.at(-791922861);
               boolean var17 = cb;
               vt var15 = var16 ? (var17 ? at.az : qf.ab) : (var17 ? cc.ap : gq.ah);
               var15.ag(var10, var23);
               var10 += 5 + var15.ag;
               var1.ai(ok.jk, var10, 13 + var23, 16776960, 0);
               var24 = var23 + 15;
               var18 = oe.av * 2045762615 - 80;
               short var19 = 321;
               aq.ag(var18 - 73, var19 - 20);
               var0.ay(ok.jn, var18, 5 + var19, 16777215, 0);
               var18 = 80 + oe.av * 2045762615;
               aq.ag(var18 - 73, var19 - 20);
               var0.ay(ok.ju, var18, var19 + 5, 16777215, 0);
               var23 = 357;
               switch(bq * -1783522205) {
               case 2:
                  il.bk = ok.kk;
                  break;
               default:
                  il.bk = ok.ks;
               }

               ch.be = new qy(oe.av * 2045762615, var23, var1.ad(il.bk), 11);
               cr.bc = new qy(oe.av * 2045762615, var23, var1.ad(ok.kt), 11);
               var1.ay(il.bk, 2045762615 * oe.av, var23, 16777215, 0);
            } else if (cn * -1220996517 == 3) {
               var23 = 201;
               var0.ay(ok.kg, 180 + 1359998811 * aj, var23, 16776960, 0);
               var24 = var23 + 20;
               var1.ay(ok.kc, 180 + aj * 1359998811, var24, 16776960, 0);
               var24 += 20;
               var1.ay(ok.ki, 180 + aj * 1359998811, var24, 16776960, 0);
               var24 += 15;
               var4 = 180 + 1359998811 * aj;
               var5 = 276;
               aq.ag(var4 - 73, var5 - 20);
               var2.ay(ok.kp, var4, var5 + 5, 16777215, 0);
               var4 = 180 + 1359998811 * aj;
               var5 = 326;
               aq.ag(var4 - 73, var5 - 20);
               var2.ay(ok.kh, var4, 5 + var5, 16777215, 0);
            } else {
               String var26;
               if (4 == cn * -1220996517) {
                  var0.ay(ok.iq, 180 + 1359998811 * aj, 201, 16776960, 0);
                  var23 = 236;
                  var0.ay(cf, 180 + aj * 1359998811, var23, 16777215, 0);
                  var24 = var23 + 15;
                  var0.ay(cu, 1359998811 * aj + 180, var24, 16777215, 0);
                  var24 += 15;
                  var0.ay(cm, 1359998811 * aj + 180, var24, 16777215, 0);
                  var24 += 15;
                  var26 = ok.ji;
                  var7 = px.ce;
                  var6 = gw.ah('*', var7.length(), (byte)113);
                  var0.ai(var26 + var6 + (1472813913 * client.do % 40 < 20 ? ar.ae(16776960, 1579039569) + ez.ag : ""), 180 + aj * 1359998811 - 108, var24, 16777215, 0);
                  var24 -= 8;
                  var0.ai(ok.ad, 180 + 1359998811 * aj - 9, var24, 16776960, 0);
                  var24 += 15;
                  var0.ai(ok.ah, 180 + aj * 1359998811 - 9, var24, 16776960, 0);
                  var29 = 1359998811 * aj + 180 - 9 + var0.ad(ok.ah) + 15;
                  var31 = var24 - var0.at;
                  vt var32;
                  if (ck) {
                     var32 = qf.ab;
                  } else {
                     var32 = gq.ah;
                  }

                  var32.ag(var29, var31);
                  var24 += 15;
                  var33 = 1359998811 * aj + 180 - 80;
                  short var37 = 321;
                  aq.ag(var33 - 73, var37 - 20);
                  var0.ay(ok.au, var33, var37 + 5, 16777215, 0);
                  var33 = 180 + aj * 1359998811 + 80;
                  aq.ag(var33 - 73, var37 - 20);
                  var0.ay(ok.ju, var33, var37 + 5, 16777215, 0);
                  var1.ay(ok.ks, 1359998811 * aj + 180, var37 + 36, 16777215, 0);
               } else {
                  short var30;
                  if (5 == cn * -1220996517) {
                     var0.ay(ok.kd, 1359998811 * aj + 180, 201, 16776960, 0);
                     var23 = 221;
                     var2.ay(cf, 180 + aj * 1359998811, var23, 16776960, 0);
                     var24 = var23 + 15;
                     var2.ay(cu, 180 + aj * 1359998811, var24, 16776960, 0);
                     var24 += 15;
                     var2.ay(cm, aj * 1359998811 + 180, var24, 16776960, 0);
                     var24 += 15;
                     var24 += 14;
                     var0.ai(ok.kx, 180 + aj * 1359998811 - 145, var24, 16777215, 0);
                     var25 = 174;
                     if (re.vt.at(-664521768)) {
                        var8 = cj;
                        var7 = gw.ah('*', var8.length(), (byte)109);
                        var6 = var7;
                     } else {
                        var6 = cj;
                     }

                     for(var6 = var6; var0.ad(var6) > var25; var6 = var6.substring(1)) {
                     }

                     var0.ai(qk.az(var6) + (1472813913 * client.do % 40 < 20 ? ar.ae(16776960, 1706954997) + ez.ag : ""), 1359998811 * aj + 180 - 34, var24, 16777215, 0);
                     var24 += 15;
                     var28 = 180 + aj * 1359998811 - 80;
                     var30 = 321;
                     aq.ag(var28 - 73, var30 - 20);
                     var0.ay(ok.ka, var28, var30 + 5, 16777215, 0);
                     var28 = 80 + 1359998811 * aj + 180;
                     aq.ag(var28 - 73, var30 - 20);
                     var0.ay(ok.kf, var28, var30 + 5, 16777215, 0);
                     var30 = 356;
                     var1.ay(ok.kt, 2045762615 * oe.av, var30, 268435455, 0);
                  } else if (cn * -1220996517 == 6) {
                     var23 = 201;
                     var0.ay(cf, 1359998811 * aj + 180, var23, 16776960, 0);
                     var24 = var23 + 15;
                     var0.ay(cu, 1359998811 * aj + 180, var24, 16776960, 0);
                     var24 += 15;
                     var0.ay(cm, 1359998811 * aj + 180, var24, 16776960, 0);
                     var24 += 15;
                     var4 = aj * 1359998811 + 180;
                     var5 = 321;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.kf, var4, 5 + var5, 16777215, 0);
                  } else if (7 == -1220996517 * cn) {
                     if (ak.dx && !client.cz) {
                        var23 = 201;
                        var0.ay(cf, oe.av * 2045762615, var23, 16776960, 0);
                        var24 = var23 + 15;
                        var0.ay(cu, 2045762615 * oe.av, var24, 16776960, 0);
                        var24 += 15;
                        var0.ay(cm, 2045762615 * oe.av, var24, 16776960, 0);
                        var4 = 2045762615 * oe.av - 150;
                        var24 += 10;

                        for(var27 = 0; var27 < 8; ++var27) {
                           aq.ax(var4, var24, 30, 40);
                           boolean var34 = cy * 2016267409 == var27 & client.do * 1472813913 % 40 < 20;
                           var0.ai((co[var27] == null ? "" : co[var27]) + (var34 ? ar.ae(16776960, 1795679959) + ez.ag : ""), var4 + 10, var24 + 27, 16777215, 0);
                           if (1 != var27 && 3 != var27) {
                              var4 += 35;
                           } else {
                              var4 += 50;
                              var0.ai(qk.az("/"), var4 - 13, var24 + 27, 16777215, 0);
                           }
                        }

                        var27 = 2045762615 * oe.av - 80;
                        short var35 = 321;
                        aq.ag(var27 - 73, var35 - 20);
                        var0.ay("Submit", var27, 5 + var35, 16777215, 0);
                        var27 = oe.av * 2045762615 + 80;
                        aq.ag(var27 - 73, var35 - 20);
                        var0.ay(ok.ju, var27, 5 + var35, 16777215, 0);
                     } else {
                        var23 = 216;
                        var0.ay(ok.lm, aj * 1359998811 + 180, var23, 16776960, 0);
                        var24 = var23 + 15;
                        var2.ay(ok.lw, aj * 1359998811 + 180, var24, 16776960, 0);
                        var24 += 15;
                        var2.ay(ok.ly, 180 + aj * 1359998811, var24, 16776960, 0);
                        var24 += 15;
                        var4 = 180 + 1359998811 * aj - 80;
                        var5 = 321;
                        aq.ag(var4 - 73, var5 - 20);
                        var0.ay(ok.lg, var4, 5 + var5, 16777215, 0);
                        var4 = 80 + 180 + aj * 1359998811;
                        aq.ag(var4 - 73, var5 - 20);
                        var0.ay(ok.kf, var4, var5 + 5, 16777215, 0);
                     }
                  } else if (8 == cn * -1220996517) {
                     var23 = 216;
                     var0.ay(ok.fn, 180 + aj * 1359998811, var23, 16776960, 0);
                     var24 = var23 + 15;
                     var2.ay(ok.fh, 1359998811 * aj + 180, var24, 16776960, 0);
                     var24 += 15;
                     var2.ay(ok.fo, 180 + aj * 1359998811, var24, 16776960, 0);
                     var24 += 15;
                     var4 = aj * 1359998811 + 180 - 80;
                     var5 = 321;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.fw, var4, var5 + 5, 16777215, 0);
                     var4 = aj * 1359998811 + 180 + 80;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.kf, var4, var5 + 5, 16777215, 0);
                  } else if (cn * -1220996517 == 9) {
                     var23 = 221;
                     var0.ay(cf, 1359998811 * aj + 180, var23, 16776960, 0);
                     var24 = var23 + 25;
                     var0.ay(cu, 180 + 1359998811 * aj, var24, 16776960, 0);
                     var24 += 25;
                     var0.ay(cm, 1359998811 * aj + 180, var24, 16776960, 0);
                     var4 = 180 + aj * 1359998811;
                     var5 = 311;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.kp, var4, 5 + var5, 16777215, 0);
                  } else if (-1220996517 * cn == 10) {
                     var24 = aj * 1359998811 + 180;
                     var25 = 209;
                     var0.ay(ok.jg, 1359998811 * aj + 180, var25, 16776960, 0);
                     var4 = var25 + 20;
                     af.ag(var24 - 109, var4);
                     if (cc.isEmpty()) {
                        at.ag(var24 - 48, var4 + 18);
                     } else {
                        at.ag(var24 - 48, var4 + 5);
                        var0.ay(cc, var24, var4 + 68 - 15, 16776960, 0);
                     }
                  } else if (cn * -1220996517 == 12) {
                     var24 = oe.av * 2045762615;
                     var25 = 216;
                     var2.ay(ok.li, var24, var25, 16777215, 0);
                     var4 = var25 + 17;
                     var2.ay(ok.lt, var24, var4, 16777215, 0);
                     var4 += 17;
                     var2.ay(ok.lj, var24, var4, 16777215, 0);
                     var4 += 17;
                     var2.ay(ok.lk, var24, var4, 16777215, 0);
                     var24 = oe.av * 2045762615 - 80;
                     var25 = 311;
                     aq.ag(var24 - 73, var25 - 20);
                     var0.ay(ok.mh, var24, 5 + var25, 16777215, 0);
                     var24 = 2045762615 * oe.av + 80;
                     aq.ag(var24 - 73, var25 - 20);
                     var0.ay(ok.md, var24, 5 + var25, 16777215, 0);
                  } else if (cn * -1220996517 == 13) {
                     var23 = 231;
                     var2.ay(ok.mu, 180 + 1359998811 * aj, var23, 16777215, 0);
                     var24 = var23 + 20;
                     var2.ay(ok.mo, 180 + aj * 1359998811, var24, 16777215, 0);
                     var4 = aj * 1359998811 + 180;
                     var23 = 311;
                     aq.ag(var4 - 73, var23 - 20);
                     var0.ay(ok.kf, var4, var23 + 5, 16777215, 0);
                  } else if (14 == cn * -1220996517) {
                     var23 = 201;
                     String var39 = "";
                     var26 = "";
                     var6 = "";
                     switch(bo * -1857384015) {
                     case 0:
                        var39 = ok.cm;
                        var26 = ok.cj;
                        var6 = ok.cx;
                        break;
                     case 1:
                        var39 = ok.da;
                        var26 = ok.dz;
                        var6 = ok.dg;
                        break;
                     case 2:
                        var39 = ok.ff;
                        var26 = ok.fe;
                        var6 = ok.ft;
                        break;
                     default:
                        ks.ah(false, -1188117354);
                     }

                     var0.ay(var39, 180 + aj * 1359998811, var23, 16776960, 0);
                     var24 = var23 + 20;
                     var0.ay(var26, 180 + 1359998811 * aj, var24, 16776960, 0);
                     var24 += 20;
                     var0.ay(var6, aj * 1359998811 + 180, var24, 16776960, 0);
                     var28 = 1359998811 * aj + 180;
                     var30 = 276;
                     aq.ag(var28 - 73, var30 - 20);
                     if (bo * -1857384015 == 1) {
                        var0.ay(ok.bg, var28, 5 + var30, 16777215, 0);
                     } else {
                        var0.ay(ok.bi, var28, 5 + var30, 16777215, 0);
                     }

                     var28 = 180 + aj * 1359998811;
                     var30 = 326;
                     aq.ag(var28 - 73, var30 - 20);
                     var0.ay(ok.kf, var28, 5 + var30, 16777215, 0);
                  } else if (cn * -1220996517 == 24) {
                     var23 = 221;
                     var0.ay(cf, 1359998811 * aj + 180, var23, 16777215, 0);
                     var24 = var23 + 15;
                     var0.ay(cu, aj * 1359998811 + 180, var24, 16777215, 0);
                     var24 += 15;
                     var0.ay(cm, 1359998811 * aj + 180, var24, 16777215, 0);
                     var24 += 15;
                     var4 = 180 + aj * 1359998811;
                     var5 = 301;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.af, var4, var5 + 5, 16777215, 0);
                  } else if (cn * -1220996517 == 32) {
                     var23 = 216;
                     var0.ay(ok.lm, 180 + 1359998811 * aj, var23, 16776960, 0);
                     var24 = var23 + 15;
                     var2.ay(ok.lw, 180 + aj * 1359998811, var24, 16776960, 0);
                     var24 += 15;
                     var2.ay(ok.ly, aj * 1359998811 + 180, var24, 16776960, 0);
                     var24 += 15;
                     var4 = 180 + 1359998811 * aj - 80;
                     var5 = 321;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.lg, var4, 5 + var5, 16777215, 0);
                     var4 = 80 + 1359998811 * aj + 180;
                     aq.ag(var4 - 73, var5 - 20);
                     var0.ay(ok.kf, var4, 5 + var5, 16777215, 0);
                  } else if (-1220996517 * cn == 33) {
                     var23 = 201;
                     var0.ay(cf, 180 + aj * 1359998811, var23, 16776960, 0);
                     var24 = var23 + 20;
                     var1.ay(cu, aj * 1359998811 + 180, var24, 16776960, 0);
                     var24 += 20;
                     var1.ay(cm, 1359998811 * aj + 180, var24, 16776960, 0);
                     var24 += 15;
                     var4 = 1359998811 * aj + 180;
                     var5 = 276;
                     aq.ag(var4 - 73, var5 - 20);
                     var2.ay(ok.mk, var4, 5 + var5, 16777215, 0);
                     var4 = 180 + aj * 1359998811;
                     var5 = 326;
                     aq.ag(var4 - 73, var5 - 20);
                     var2.ay(ok.kf, var4, 5 + var5, 16777215, 0);
                  }
               }
            }
         }

         if (-941305067 * client.dt >= 10) {
            int[] var50 = new int[4];
            vr.ff(var50);
            vr.et(-1776792799 * ag, 0, -1776792799 * ag + 765, en.av * 608173899);
            kp.aa.ax(ag * -1776792799 - 22, 1472813913 * client.do, (byte)-3);
            kp.aa.ax(22 + -1776792799 * ag + 765 - 128, 1472813913 * client.do, (byte)119);
            vr.fe(var50);
         }

         fv.ad[re.vt.ar((byte)1) ? 1 : 0].ag(ag * -1776792799 + 765 - 40, 463);
         if (-941305067 * client.dt > 5 && dn.cy == px.ac) {
            if (null != fg.de) {
               var24 = ag * -1776792799 + 5;
               var25 = 463;
               byte var36 = 100;
               byte var41 = 35;
               fg.de.ag(var24, var25);
               var0.ay(ok.hf + " " + client.cn * 914504241, var24 + var36 / 2, var41 / 2 + var25 - 2, 16777215, 0);
               if (null != hl.ar) {
                  var1.ay(ok.mq, var36 / 2 + var24, 12 + var41 / 2 + var25, 16777215, 0);
               } else {
                  var1.ay(ok.mj, var36 / 2 + var24, 12 + var41 / 2 + var25, 16777215, 0);
               }
            } else {
               fg.de = sq.ax(cq.fb, "sl_button", "", 1465178092);
            }
         }

      }
   }

   static void cf(qu var0, qu var1, qu var2) {
      ag = -31524639 * ((-1991951399 * fa.aj - 1987356501) / 2);
      aj = -1517185997 * ag + 667082085;
      oe.av = 1953755884 + -2109980988 * aj;
      byte var3;
      int var4;
      int var10;
      int var18;
      int var19;
      int var23;
      int var25;
      int var28;
      int var29;
      int var30;
      int var32;
      int var34;
      int var35;
      if (dk) {
         if (af.dl == null) {
            af.dl = kx.aq(cq.fb, "sl_back", "", (short)21731);
         }

         if (null == as.db) {
            as.db = it.am(cq.fb, "sl_flags", "", (byte)82);
         }

         if (ll.dc == null) {
            ll.dc = it.am(cq.fb, "sl_arrows", "", (byte)57);
         }

         if (null == eu.dw) {
            eu.dw = it.am(cq.fb, "sl_stars", "", (byte)50);
         }

         if (null == gh.dx) {
            gh.dx = sq.ax(cq.fb, "leftarrow", "", 738240509);
         }

         if (hg.dj == null) {
            hg.dj = sq.ax(cq.fb, "rightarrow", "", 732625969);
         }

         vr.fr(-1776792799 * ag, 23, 1157429446, 458090082, 0);
         vr.fg(ag * 489115894, 0, 594725354, 23, 12425273, 9135624);
         vr.fg(-1186512814 + -1430724599 * ag, 0, -595554760, 23, 1598396981, 661356200);
         var0.ay(ok.ml, 1379032786 + ag * -1776792799, 15, 0, -1);
         if (null != eu.dw) {
            eu.dw[1].ag(-1845717529 + ag * -1776792799, 1);
            var1.ai(ok.mc, 152 + -1776792799 * ag, 10, 16777215, -1);
            eu.dw[0].ag(-1776792799 * ag + 140, 12);
            var1.ai(ok.mb, -516197480 + -1776792799 * ag, 21, 16777215, -1);
         }

         if (null != ll.dc) {
            var23 = -1873834560 * ag + 280;
            if (cr.au[0] == 0 && 0 == cr.at[0]) {
               ll.dc[2].ag(var23, 4);
            } else {
               ll.dc[0].ag(var23, 4);
            }

            if (0 == cr.au[0] && 1 == cr.at[0]) {
               ll.dc[3].ag(var23 + 15, 4);
            } else {
               ll.dc[1].ag(var23 + 15, 4);
            }

            var0.ai(ok.mg, -163407798 + var23, 17, 16777215, -1);
            var4 = ag * -1776792799 + -2034906919;
            if (1 == cr.au[0] && 0 == cr.at[0]) {
               ll.dc[2].ag(var4, 4);
            } else {
               ll.dc[0].ag(var4, 4);
            }

            if (cr.au[0] == 1 && cr.at[0] == 1) {
               ll.dc[3].ag(var4 + 15, 4);
            } else {
               ll.dc[1].ag(15 + var4, 4);
            }

            var0.ai(ok.mp, 83805152 + var4, 17, 16777215, -1);
            var25 = ag * -1776792799 + 2001641662;
            if (cr.au[0] == 2 && cr.at[0] == 0) {
               ll.dc[2].ag(var25, 4);
            } else {
               ll.dc[0].ag(var25, 4);
            }

            if (cr.au[0] == 2 && cr.at[0] == 1) {
               ll.dc[3].ag(var25 + 15, 4);
            } else {
               ll.dc[1].ag(var25 + 15, 4);
            }

            var0.ai(ok.mn, 32 + var25, 17, 1103261394, -1);
            var34 = ag * -846693713 + 610;
            if (3 == cr.au[0] && 0 == cr.at[0]) {
               ll.dc[2].ag(var34, 4);
            } else {
               ll.dc[0].ag(var34, 4);
            }

            if (cr.au[0] == 3 && 1 == cr.at[0]) {
               ll.dc[3].ag(15 + var34, 4);
            } else {
               ll.dc[1].ag(var34 + 15, 4);
            }

            var0.ai(ok.mr, var34 + -1715449439, 17, -26664174, -1);
         }

         vr.fr(ag * 74107891 + 708, 4, 50, 16, 0);
         var1.ay(ok.ju, 25 + -1776792799 * ag + 708, 16, 16777215, -1);
         do = 721068009;
         if (af.dl != null) {
            var3 = 88;
            byte var40 = 19;
            var25 = 1160106043 / (1 + var3) - 1;
            var34 = -288839581 / (var40 + 1);

            do {
               var28 = var34;
               var29 = var25;
               if (var34 * (var25 - 1) >= -135355266 * cr.aq) {
                  --var25;
               }

               if (var25 * (var34 - 1) >= cr.aq * -571562711) {
                  --var34;
               }

               if (var25 * (var34 - 1) >= 2141988201 * cr.aq) {
                  --var34;
               }
            } while(var28 != var34 || var29 != var25);

            var28 = (765 - var3 * var25) / (1 + var25);
            if (var28 > 5) {
               var28 = 5;
            }

            var29 = (480 - var34 * var40) / (var34 + 1);
            if (var29 > 5) {
               var29 = 5;
            }

            var30 = (-1181018992 - var25 * var3 - (var25 - 1) * var28) / 2;
            var10 = (-125791605 - var34 * var40 - var29 * (var34 - 1)) / 2;
            var32 = (var34 + -635736353 * cr.aq - 1) / var34;
            dm = 879989829 * (var32 - var25);
            if (gh.dx != null && 1859065749 * dh > 0) {
               gh.dx.ag(8, en.av * 820212464 / 2 - gh.dx.am / 2);
            }

            if (null != hg.dj && -1187465059 * dh < dm * 1446231518) {
               hg.dj.ag(fa.aj * -1933071298 - hg.dj.ag - 8, 608173899 * en.av / 2 - hg.dj.am / 2);
            }

            var35 = var10 + 23;
            int var37 = var30 + ag * 1946634623;
            int var14 = 0;
            boolean var38 = false;
            int var39 = dh * 677882197;

            int var41;
            for(var41 = var34 * var39; var41 < -1301280827 * cr.aq && var39 - dh * -1187465059 < var25; ++var41) {
               cr var42 = br.ax[var41];
               boolean var43 = true;
               String var20 = Integer.toString(var42.ah * 470572921);
               if (-1811686698 * var42.ah == -1) {
                  var20 = ok.mz;
                  var43 = false;
               } else if (var42.ah * -1203918209 > -352699253) {
                  var20 = ok.mx;
                  var43 = false;
               }

               eu var21 = null;
               int var22 = 0;
               if (var42.az(-1796523780)) {
                  var21 = var42.ar((byte)8) ? eu.at : eu.af;
               } else if (var42.al((byte)-83)) {
                  var21 = var42.ar((byte)8) ? eu.az : eu.ab;
               } else if (var42.ab(1114259502)) {
                  var22 = 430127395;
                  var21 = var42.ar((byte)8) ? eu.aq : eu.ax;
               } else if (var42.aa(264532893)) {
                  var21 = var42.ar((byte)8) ? eu.ar : eu.au;
               } else if (var42.ah(697341531)) {
                  var21 = var42.ar((byte)8) ? eu.am : eu.ag;
               } else if (var42.ai(-1687798792)) {
                  var21 = var42.ar((byte)8) ? eu.ad : eu.al;
               } else if (var42.ao((byte)-92)) {
                  var21 = var42.ar((byte)8) ? eu.ap : eu.ah;
               }

               if (var21 == null || -622240461 * var21.aa >= af.dl.length) {
                  var21 = var42.ar((byte)8) ? eu.ae : eu.ac;
               }

               if (bj.al * 257531040 >= var37 && bj.ad * 1961428775 >= var35 && -452763927 * bj.al < var37 + var3 && -1213769803 * bj.ad < var40 + var35 && var43) {
                  do = -721068009 * var41;
                  af.dl[var21.aa * -38691193].aa(var37, var35, 128, 16777215);
                  var38 = true;
               } else {
                  af.dl[-2133797432 * var21.aa].al(var37, var35);
               }

               if (null != as.db) {
                  as.db[(var42.ar((byte)8) ? 8 : 0) + -1651324629 * var42.az].ag(var37 + 29, var35);
               }

               var0.ay(Integer.toString(var42.al * -2102573495), var37 + 15, 5 + var35 + var40 / 2, var22, -1);
               var1.ay(var20, var37 + 60, var40 / 2 + var35 + 5, 1454080066, -1);
               var35 += var40 + var29;
               ++var14;
               if (var14 >= var34) {
                  var35 = var10 + 23;
                  var37 += var28 + var3;
                  var14 = 0;
                  ++var39;
               }
            }

            if (var38) {
               var41 = var1.ad(br.ax[-999434329 * do].ab) + 6;
               var18 = 8 + var1.at;
               var19 = bj.ad * -1213769803 + 25;
               if (var18 + var19 > 480) {
                  var19 = -1213769803 * bj.ad - 25 - var18;
               }

               vr.fr(bj.al * -840136299 - var41 / 2, var19, var41, var18, 1588631549);
               vr.fs(bj.al * 1325550071 - var41 / 2, var19, var41, var18, 0);
               var1.ay(br.ax[-999434329 * do].ab, bj.al * 292498127, 4 + var1.at + var19, 0, -1);
            }
         }

      } else {
         ma.au.al(1708028400 * ag, 0);
         lg.ar.al(382 + ag * -1776792799, 0);
         ey.al.ag(ag * -1776792799 + -1080852125 - ey.al.ag / 2, 18);
         if (0 == -941305067 * client.dt || client.dt * -1646974181 == 5) {
            var3 = 20;
            var0.ay(ok.ii, 180 + aj * -794708052, -133879374 - var3, 16777215, -1);
            var4 = 253 - var3;
            vr.fs(180 + -1383010556 * aj - -1252472255, var4, 304, -798396010, 9179409);
            vr.fs(180 + aj * -1540435228 - -196071954, var4 + 1, 302, 1349656705, 0);
            vr.fr(1359998811 * aj + 1986469858 - 326346646, 2 + var4, aw * 372327640, 30, 9179409);
            vr.fr(aw * -577131295 + (-1182851628 * aj + 180 - 150), 2 + var4, -1901480181 - 1103099994 * aw, 30, 0);
            var0.ay(an, 1083241389 + 1359998811 * aj, -1705702803 - var3, 16777215, -1);
         }

         String var6;
         String var7;
         String var8;
         String var9;
         short var24;
         if (20 == client.dt * -941305067) {
            gl.ax.ag(180 + aj * 1748465713 - gl.ax.ag / 2, 271 - gl.ax.am / 2);
            var23 = -526600269;
            var0.ay(cf, aj * 1592007624 + 851902928, var23, 16776960, 0);
            var23 += 15;
            var0.ay(cu, 1690481081 + aj * -1934753327, var23, 1202007531, 0);
            var23 += 15;
            var0.ay(cm, -1081476357 * aj + 180, var23, 16776960, 0);
            var23 += 15;
            var23 += 7;
            if (-1220996517 * cn != 4 && -1772753295 * cn != 10) {
               var0.ai(ok.jo, aj * 1359998811 + 404060915 - -1189433229, var23, -1765962948, 0);
               var24 = 200;
               if (re.vt.at(989944801)) {
                  var8 = cj;
                  var7 = gw.ah((char)-189185493, var8.length(), (byte)115);
                  var6 = var7;
               } else {
                  var6 = cj;
               }

               for(var6 = var6; var0.ad(var6) > var24; var6 = var6.substring(0, var6.length() - 1)) {
               }

               var0.ai(qk.az(var6), -1406620954 + 1359998811 * aj - 1719355784, var23, 16777215, 0);
               var23 += 15;
               var8 = cx;
               var7 = gw.ah('*', var8.length(), (byte)108);

               for(var9 = var7; var0.ad(var9) > var24; var9 = var9.substring(1)) {
               }

               var0.ai(ok.jp + var9, 1359998811 * aj + 180 - 108, var23, 938988804, 0);
               var23 += 15;
            }
         }

         if (10 == client.dt * -1499745151 || -941305067 * client.dt == 11 || 50 == -941305067 * client.dt) {
            gl.ax.ag(1359998811 * aj, -1809085380);
            short var5;
            short var26;
            if (cn * 1617160491 == 0) {
               var26 = 251;
               var0.ay(ok.jg, -839412048 + 1359998811 * aj, var26, 148143589, 0);
               var23 = var26 + 30;
               var4 = 1359998811 * aj + 1273438885 - 318447436;
               var5 = 291;
               aq.ag(var4 - 978231911, var5 - 20);
               var0.aj(ok.jh, var4 - 73, var5 - 20, 144, -1300653619, 1020168029, 0, 1, 1, 0);
               var4 = 1359998811 * aj + 180 + 80;
               aq.ag(var4 - 73, var5 - 20);
               var0.aj(ok.ja, var4 - 73, var5 - 20, 144, -1479313634, 2007186631, 0, 1, 1, 0);
            } else if (1 == cn * -507471675) {
               var0.ay(ch, -614216962 * aj + 1409540058, 201, -38780774, 0);
               var23 = -954399475;
               var0.ay(cf, 1732711199 + -468976703 * aj, var23, -729130572, 0);
               var23 += 15;
               var0.ay(cu, 1359998811 * aj + 77375654, var23, 16777215, 0);
               var23 += 15;
               var0.ay(cm, -1387801221 + aj * 1926052037, var23, -1964878342, 0);
               var23 += 15;
               var4 = 435875579 + 1359998811 * aj - -1530185258;
               var25 = -1603256229;
               aq.ag(var4 - 73, var25 - 20);
               var0.ay(ok.au, var4, 5 + var25, 16777215, 0);
               var4 = 1511562689 * aj + -206397437 + 80;
               aq.ag(var4 - 73, var25 - 20);
               var0.ay(ok.ju, var4, 5 + var25, 16777215, 0);
            } else if (-1220996517 * cn == 2) {
               var26 = 201;
               var0.ay(cf, 2045762615 * oe.av, var26, 16776960, 0);
               var23 = var26 + 15;
               var0.ay(cu, -1251117405 * oe.av, var23, 16776960, 0);
               var23 += 15;
               var0.ay(cm, oe.av * 2045762615, var23, 1238507957, 0);
               var23 += 15;
               var23 += 7;
               var0.ai(ok.jo, oe.av * 2045762615 - 1502765532, var23, -181500328, 0);
               var4 = -1433363091;
               if (re.vt.at(888467324)) {
                  var8 = cj;
                  var7 = gw.ah((char)-832307840, var8.length(), (byte)109);
                  var6 = var7;
               } else {
                  var6 = cj;
               }

               for(var6 = var6; var0.ad(var6) > var4; var6 = var6.substring(1)) {
               }

               var0.ai(qk.az(var6) + (dp * -1151984762 == 0 & 1472813913 * client.do % -1527346915 < 20 ? ar.ae(-86955474, 1936041931) + ez.ag : ""), oe.av * 2045762615 - 70, var23, 16777215, 0);
               var23 += 15;
               var8 = cx;
               var7 = gw.ah('*', var8.length(), (byte)127);

               for(var9 = var7; var0.ad(var9) > var4; var9 = var9.substring(1)) {
               }

               var0.ai(ok.jp + var9 + (-1584448409 * dp == 1 & 1472813913 * client.do % 1452277467 < 20 ? ar.ae(16776960, 1980051739) + ez.ag : ""), 1782161111 * oe.av - 1378860444, var23, -1678011131, 0);
               var23 += 15;
               var23 = 1628936838;
               var10 = -117 + 2045762615 * oe.av;
               boolean var12 = client.hn;
               boolean var13 = cp;
               vt var11 = var12 ? (var13 ? at.az : qf.ab) : (var13 ? cc.ap : gq.ah);
               var11.ag(var10, var23);
               var10 += var11.ag + 5;
               var1.ai(ok.js, var10, var23 + 13, -1093163688, 0);
               var10 = 2045762615 * oe.av + 24;
               boolean var16 = re.vt.at(197109511);
               boolean var17 = cb;
               vt var15 = var16 ? (var17 ? at.az : qf.ab) : (var17 ? cc.ap : gq.ah);
               var15.ag(var10, var23);
               var10 += 5 + var15.ag;
               var1.ai(ok.jk, var10, 13 + var23, 550303836, 0);
               var23 += 15;
               var18 = oe.av * 2045762615 - -1202051052;
               var19 = -110629913;
               aq.ag(var18 - 73, var19 - 20);
               var0.ay(ok.jn, var18, 5 + var19, 16777215, 0);
               var18 = 80 + oe.av * -865245399;
               aq.ag(var18 - 1508064662, var19 - 20);
               var0.ay(ok.ju, var18, var19 + 5, 16777215, 0);
               var26 = 357;
               switch(bq * -1783522205) {
               case 2:
                  il.bk = ok.kk;
                  break;
               default:
                  il.bk = ok.ks;
               }

               ch.be = new qy(oe.av * 2045762615, var26, var1.ad(il.bk), 11);
               cr.bc = new qy(oe.av * -1890560261, var26, var1.ad(ok.kt), 11);
               var1.ay(il.bk, 2045762615 * oe.av, var26, 16777215, 0);
            } else if (cn * -1220996517 == 3) {
               var26 = 201;
               var0.ay(ok.kg, -536253602 + -236344808 * aj, var26, 2143572148, 0);
               var23 = var26 + 20;
               var1.ay(ok.kc, 172395572 + aj * 1359998811, var23, 16776960, 0);
               var23 += 20;
               var1.ay(ok.ki, 180 + aj * 1359998811, var23, 16776960, 0);
               var23 += 15;
               var4 = 764691956 + -505778660 * aj;
               var5 = 276;
               aq.ag(var4 - 73, var5 - 20);
               var2.ay(ok.kp, var4, var5 + 5, 16777215, 0);
               var4 = 180 + 983891402 * aj;
               var25 = -1751298762;
               aq.ag(var4 - -882140331, var25 - 20);
               var2.ay(ok.kh, var4, 5 + var25, 16777215, 0);
            } else {
               String var27;
               if (4 == cn * 456616837) {
                  var0.ay(ok.iq, 316790063 + -1904023249 * aj, -1183499908, -1219629872, 0);
                  var26 = 236;
                  var0.ay(cf, 180 + aj * 1227093315, var26, 973977331, 0);
                  var23 = var26 + 15;
                  var0.ay(cu, 1843345415 * aj + -1676311195, var23, -2092171031, 0);
                  var23 += 15;
                  var0.ay(cm, 1359998811 * aj + 180, var23, 16777215, 0);
                  var23 += 15;
                  var27 = ok.ji;
                  var7 = px.ce;
                  var6 = gw.ah('*', var7.length(), (byte)124);
                  var0.ai(var27 + var6 + (1367154636 * client.do % -46082068 < 20 ? ar.ae(1518519012, 889335190) + ez.ag : ""), 648618902 + aj * 1359998811 - 442726617, var23, -24635730, 0);
                  var23 -= 8;
                  var0.ai(ok.ad, 180 + -322146469 * aj - 9, var23, 16776960, 0);
                  var23 += 15;
                  var0.ai(ok.ah, -1426345248 + aj * -805060007 - 9, var23, 16776960, 0);
                  var29 = 1359998811 * aj + 180 - 9 + var0.ad(ok.ah) + 15;
                  var30 = var23 - var0.at;
                  vt var31;
                  if (ck) {
                     var31 = qf.ab;
                  } else {
                     var31 = gq.ah;
                  }

                  var31.ag(var29, var30);
                  var23 += 15;
                  var32 = 639595954 * aj + 180 - -1733057706;
                  var35 = -1910313306;
                  aq.ag(var32 - 73, var35 - 20);
                  var0.ay(ok.au, var32, var35 + 5, -51642392, 0);
                  var32 = 932521748 + aj * 785383146 + 845451737;
                  aq.ag(var32 - 239684010, var35 - 20);
                  var0.ay(ok.ju, var32, var35 + 5, 1059686525, 0);
                  var1.ay(ok.ks, -422189913 * aj + 180, var35 + -1467757030, 16777215, 0);
               } else if (5 == cn * -1220996517) {
                  var0.ay(ok.kd, 1302180698 * aj + 1898189348, -857538564, 1919667717, 0);
                  var23 = -893198375;
                  var2.ay(cf, -1432299534 + aj * 673045695, var23, 16776960, 0);
                  var23 += 15;
                  var2.ay(cu, 180 + aj * -687081825, var23, -200721875, 0);
                  var23 += 15;
                  var2.ay(cm, aj * -1695981755 + 180, var23, 16776960, 0);
                  var23 += 15;
                  var23 += 14;
                  var0.ai(ok.kx, 206664485 + aj * -657498882 - 699132091, var23, 16777215, 0);
                  var4 = -1306662812;
                  if (re.vt.at(1002755675)) {
                     var8 = cj;
                     var7 = gw.ah((char)-1539116003, var8.length(), (byte)120);
                     var6 = var7;
                  } else {
                     var6 = cj;
                  }

                  for(var6 = var6; var0.ad(var6) > var4; var6 = var6.substring(1)) {
                  }

                  var0.ai(qk.az(var6) + (-2024591372 * client.do % 40 < 20 ? ar.ae(-762291886, 2073055729) + ez.ag : ""), 1359998811 * aj + 1733043229 - 1724022798, var23, 1836586068, 0);
                  var23 += 15;
                  var28 = 180 + aj * 1359998811 - 1703385250;
                  var29 = -1631523939;
                  aq.ag(var28 - 73, var29 - 20);
                  var0.ay(ok.ka, var28, var29 + 5, 16777215, 0);
                  var28 = 898973074 + -2089438161 * aj + 180;
                  aq.ag(var28 - 73, var29 - 20);
                  var0.ay(ok.kf, var28, var29 + 5, -1147922059, 0);
                  var29 = 1603043072;
                  var1.ay(ok.kt, -738307444 * oe.av, var29, 268435455, 0);
               } else if (cn * -1220996517 == 6) {
                  var23 = 1385916977;
                  var0.ay(cf, 1359998811 * aj + -1007065229, var23, 588846146, 0);
                  var23 += 15;
                  var0.ay(cu, 41726987 * aj + 180, var23, -868952006, 0);
                  var23 += 15;
                  var0.ay(cm, -1475662485 * aj + 1957214425, var23, 1085607859, 0);
                  var23 += 15;
                  var4 = aj * 1843879338 + -726133828;
                  var25 = -11182038;
                  aq.ag(var4 - 73, var25 - 20);
                  var0.ay(ok.kf, var4, 5 + var25, 16777215, 0);
               } else if (7 == 328240937 * cn) {
                  if (ak.dx && !client.cz) {
                     var23 = -281860289;
                     var0.ay(cf, oe.av * 2045762615, var23, 552155923, 0);
                     var23 += 15;
                     var0.ay(cu, 269137349 * oe.av, var23, 16776960, 0);
                     var23 += 15;
                     var0.ay(cm, 2045762615 * oe.av, var23, 16776960, 0);
                     var4 = 2045762615 * oe.av - -1885788862;
                     var23 += 10;

                     for(var25 = 0; var25 < 8; ++var25) {
                        aq.ax(var4, var23, 30, -294214360);
                        boolean var33 = cy * 1537745528 == var25 & client.do * -393576692 % 2029390425 < 20;
                        var0.ai((co[var25] == null ? "" : co[var25]) + (var33 ? ar.ae(16776960, 1089419920) + ez.ag : ""), var4 + 10, var23 + 27, 16777215, 0);
                        if (1 != var25 && 3 != var25) {
                           var4 += 35;
                        } else {
                           var4 += 50;
                           var0.ai(qk.az("/"), var4 - 13, var23 + 27, 16777215, 0);
                        }
                     }

                     var25 = 2045762615 * oe.av - 80;
                     var34 = 1513926819;
                     aq.ag(var25 - 73, var34 - 20);
                     var0.ay("Submit", var25, 5 + var34, 1552104939, 0);
                     var25 = oe.av * -675725202 + 80;
                     aq.ag(var25 - -1624978312, var34 - 20);
                     var0.ay(ok.ju, var25, 5 + var34, 16777215, 0);
                  } else {
                     var26 = 216;
                     var0.ay(ok.lm, aj * -1290473075 + -2142986750, var26, -358236725, 0);
                     var23 = var26 + 15;
                     var2.ay(ok.lw, aj * 1359998811 + -485863391, var23, -1285460664, 0);
                     var23 += 15;
                     var2.ay(ok.ly, 1277162940 + aj * 1359998811, var23, 499291099, 0);
                     var23 += 15;
                     var4 = 180 + 1359998811 * aj - -145034895;
                     var25 = -1080164833;
                     aq.ag(var4 - -1925187917, var25 - 20);
                     var0.ay(ok.lg, var4, 5 + var25, 16777215, 0);
                     var4 = 80 + 180 + aj * 1359998811;
                     aq.ag(var4 - -356187669, var25 - 20);
                     var0.ay(ok.kf, var4, var25 + 5, -1609887594, 0);
                  }
               } else if (8 == cn * 608563518) {
                  var23 = -38066241;
                  var0.ay(ok.fn, -1097660131 + aj * 1359998811, var23, 886655136, 0);
                  var23 += 15;
                  var2.ay(ok.fh, -238815802 * aj + 2085980971, var23, 16776960, 0);
                  var23 += 15;
                  var2.ay(ok.fo, 180 + aj * 1359998811, var23, 16776960, 0);
                  var23 += 15;
                  var4 = aj * -1341190284 + -1118698098 - -941591085;
                  var25 = 296580870;
                  aq.ag(var4 - 73, var25 - 20);
                  var0.ay(ok.fw, var4, var25 + 5, -1611337586, 0);
                  var4 = aj * 1359998811 + -1086917426 + 80;
                  aq.ag(var4 - 1105389913, var25 - 20);
                  var0.ay(ok.kf, var4, var25 + 5, 16777215, 0);
               } else if (cn * -1220996517 == 9) {
                  var26 = 221;
                  var0.ay(cf, 1359998811 * aj + 180, var26, -812173184, 0);
                  var23 = var26 + 25;
                  var0.ay(cu, 552494177 + 723170637 * aj, var23, 434453015, 0);
                  var23 += 25;
                  var0.ay(cm, 1359998811 * aj + 180, var23, 2098820588, 0);
                  var4 = 242668952 + aj * 1359998811;
                  var25 = 749801109;
                  aq.ag(var4 - 73, var25 - 20);
                  var0.ay(ok.kp, var4, 5 + var25, -621530776, 0);
               } else if (-1220996517 * cn == 10) {
                  var23 = aj * 1359998811 + 180;
                  var4 = -1437833801;
                  var0.ay(ok.jg, -1583641777 * aj + 180, var4, 564925184, 0);
                  var4 += 20;
                  af.ag(var23 - 109, var4);
                  if (cc.isEmpty()) {
                     at.ag(var23 - 48, var4 + 18);
                  } else {
                     at.ag(var23 - 1468834928, var4 + 5);
                     var0.ay(cc, var23, var4 + -835497096 - 15, 541510553, 0);
                  }
               } else if (cn * -1220996517 == 12) {
                  var23 = oe.av * -1660101413;
                  var4 = 407953399;
                  var2.ay(ok.li, var23, var4, -605840831, 0);
                  var4 += 17;
                  var2.ay(ok.lt, var23, var4, -1331575878, 0);
                  var4 += 17;
                  var2.ay(ok.lj, var23, var4, -1312768276, 0);
                  var4 += 17;
                  var2.ay(ok.lk, var23, var4, 369353498, 0);
                  var23 = oe.av * -986756203 - -1524231259;
                  var24 = 311;
                  aq.ag(var23 - 73, var24 - 20);
                  var0.ay(ok.mh, var23, 5 + var24, 274499171, 0);
                  var23 = 97435955 * oe.av + -1586588878;
                  aq.ag(var23 - 2103285028, var24 - 20);
                  var0.ay(ok.md, var23, 5 + var24, 16777215, 0);
               } else if (cn * -1220996517 == 13) {
                  var26 = 231;
                  var2.ay(ok.mu, 180 + -1858795559 * aj, var26, 2013618915, 0);
                  var23 = var26 + 20;
                  var2.ay(ok.mo, 1290484290 + aj * -1532938351, var23, -966918413, 0);
                  var4 = aj * 1359998811 + 180;
                  var23 = 1319124536;
                  aq.ag(var4 - 73, var23 - 20);
                  var0.ay(ok.kf, var4, var23 + 5, 16777215, 0);
               } else if (14 == cn * -1220996517) {
                  var26 = 201;
                  String var36 = "";
                  var27 = "";
                  var6 = "";
                  switch(bo * 567471522) {
                  case 0:
                     var36 = ok.cm;
                     var27 = ok.cj;
                     var6 = ok.cx;
                     break;
                  case 1:
                     var36 = ok.da;
                     var27 = ok.dz;
                     var6 = ok.dg;
                     break;
                  case 2:
                     var36 = ok.ff;
                     var27 = ok.fe;
                     var6 = ok.ft;
                     break;
                  default:
                     ks.ah(false, -2039893275);
                  }

                  var0.ay(var36, 180 + aj * 1359998811, var26, 1924015456, 0);
                  var23 = var26 + 20;
                  var0.ay(var27, 180 + 1359998811 * aj, var23, 1432225398, 0);
                  var23 += 20;
                  var0.ay(var6, aj * 1359998811 + 865919671, var23, 559998022, 0);
                  var28 = 1359998811 * aj + 180;
                  var29 = -1674703719;
                  aq.ag(var28 - 73, var29 - 20);
                  if (bo * -1857384015 == 1) {
                     var0.ay(ok.bg, var28, 5 + var29, -70910419, 0);
                  } else {
                     var0.ay(ok.bi, var28, 5 + var29, 1263565771, 0);
                  }

                  var28 = 180 + aj * 1359998811;
                  var29 = -1388385902;
                  aq.ag(var28 - 73, var29 - 20);
                  var0.ay(ok.kf, var28, 5 + var29, 16777215, 0);
               } else if (cn * -1220996517 == 24) {
                  var26 = 221;
                  var0.ay(cf, 1359998811 * aj + -1277895149, var26, -1785584644, 0);
                  var23 = var26 + 15;
                  var0.ay(cu, aj * -348018246 + 1803778412, var23, -750591238, 0);
                  var23 += 15;
                  var0.ay(cm, -715415314 * aj + 91859109, var23, 1182464285, 0);
                  var23 += 15;
                  var4 = 180 + aj * -1610608018;
                  var25 = 103506283;
                  aq.ag(var4 - -59208842, var25 - 20);
                  var0.ay(ok.af, var4, var25 + 5, -2139973974, 0);
               } else if (cn * -1220996517 == 32) {
                  var26 = 216;
                  var0.ay(ok.lm, 180 + 1359998811 * aj, var26, -552092899, 0);
                  var23 = var26 + 15;
                  var2.ay(ok.lw, -38712434 + aj * 1359998811, var23, -158812301, 0);
                  var23 += 15;
                  var2.ay(ok.ly, aj * 1776312113 + -1872922096, var23, 16776960, 0);
                  var23 += 15;
                  var4 = 1173834533 + 1654534161 * aj - 913636113;
                  var5 = 321;
                  aq.ag(var4 - 1967538818, var5 - 20);
                  var0.ay(ok.lg, var4, 5 + var5, 16777215, 0);
                  var4 = 80 + -1523176024 * aj + 180;
                  aq.ag(var4 - 73, var5 - 20);
                  var0.ay(ok.kf, var4, 5 + var5, 16777215, 0);
               } else if (1020578878 * cn == 94868689) {
                  var23 = -492761393;
                  var0.ay(cf, 391046220 + aj * 1359998811, var23, 16776960, 0);
                  var23 += 20;
                  var1.ay(cu, aj * 1359998811 + -522265480, var23, 16776960, 0);
                  var23 += 20;
                  var1.ay(cm, -592262719 * aj + -1008778797, var23, -1009038287, 0);
                  var23 += 15;
                  var4 = 2127160362 * aj + 180;
                  var5 = 276;
                  aq.ag(var4 - -1656231234, var5 - 20);
                  var2.ay(ok.mk, var4, 5 + var5, 16777215, 0);
                  var4 = 137776901 + aj * 1359998811;
                  var25 = -1962595504;
                  aq.ag(var4 - 73, var25 - 20);
                  var2.ay(ok.kf, var4, 5 + var25, 16777215, 0);
               }
            }
         }

         if (-941305067 * client.dt >= 10) {
            int[] var44 = new int[4];
            vr.ff(var44);
            vr.et(-1689244324 * ag, 0, -1776792799 * ag + 866914909, en.av * -153404571);
            kp.aa.ax(ag * -1776792799 - 22, -1917808648 * client.do, (byte)52);
            kp.aa.ax(22 + -1776792799 * ag + 480394824 - 128, 1472813913 * client.do, (byte)36);
            vr.fe(var44);
         }

         fv.ad[re.vt.ar((byte)1) ? 1 : 0].ag(ag * -1076869419 + 327356967 - 40, -418178819);
         if (1461502027 * client.dt > 5 && dn.cy == px.ac) {
            if (null != fg.de) {
               var23 = ag * 1599243291 + 5;
               var4 = -979371239;
               var25 = -620799175;
               var34 = 1888140867;
               fg.de.ag(var23, var4);
               var0.ay(ok.hf + " " + client.cn * -2009913870, var23 + var25 / 2, var34 / 2 + var4 - 2, 1009792489, 0);
               if (null != hl.ar) {
                  var1.ay(ok.mq, var25 / 2 + var23, 12 + var34 / 2 + var4, 1195441392, 0);
               } else {
                  var1.ay(ok.mj, var25 / 2 + var23, 12 + var34 / 2 + var4, -656530420, 0);
               }
            } else {
               fg.de = sq.ax(cq.fb, "sl_button", "", 1111639772);
            }
         }

      }
   }

   static void by(ba var0, qu var1, qu var2) {
      int var11;
      int var27;
      int var28;
      int var29;
      boolean var37;
      if (dk) {
         kh var25 = client.ss;
         kh var4 = var25;

         while(true) {
            if (!var4.ab((byte)-98)) {
               if (bj.ai * 2144731811 != 1 && (ei.ev || bj.ai * 2144731811 != 4)) {
                  break;
               }

               int var26 = 280 + -1776792799 * ag;
               if (bj.ao * 1898873515 >= var26 && bj.ao * 1898873515 <= var26 + 14 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(0, 0, 234253922);
                  break;
               }

               if (bj.ao * 1898873515 >= var26 + 15 && 1898873515 * bj.ao <= 80 + var26 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(0, 1, 234253922);
                  break;
               }

               var27 = 390 + ag * -1776792799;
               if (1898873515 * bj.ao >= var27 && 1898873515 * bj.ao <= 14 + var27 && -1909429297 * bj.as >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(1, 0, 234253922);
                  break;
               }

               if (bj.ao * 1898873515 >= 15 + var27 && bj.ao * 1898873515 <= 80 + var27 && bj.as * -1909429297 >= 4 && bj.as * -1909429297 <= 18) {
                  fm.ae(1, 1, 234253922);
                  break;
               }

               var28 = -1776792799 * ag + 500;
               if (1898873515 * bj.ao >= var28 && 1898873515 * bj.ao <= var28 + 14 && bj.as * -1909429297 >= 4 && bj.as * -1909429297 <= 18) {
                  fm.ae(2, 0, 234253922);
                  break;
               }

               if (bj.ao * 1898873515 >= var28 + 15 && bj.ao * 1898873515 <= var28 + 80 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(2, 1, 234253922);
                  break;
               }

               var29 = ag * -1776792799 + 610;
               if (1898873515 * bj.ao >= var29 && 1898873515 * bj.ao <= 14 + var29 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(3, 0, 234253922);
                  break;
               }

               if (1898873515 * bj.ao >= var29 + 15 && 1898873515 * bj.ao <= 80 + var29 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(3, 1, 234253922);
                  break;
               }

               if (bj.ao * 1898873515 >= 708 + -1776792799 * ag && bj.as * -1909429297 >= 4 && bj.ao * 1898873515 <= 50 + 708 + -1776792799 * ag && bj.as * -1909429297 <= 20) {
                  dk = false;
                  ma.au.al(-1776792799 * ag, 0);
                  lg.ar.al(382 + -1776792799 * ag, 0);
                  ey.al.ag(ag * -1776792799 + 382 - ey.al.ag / 2, 18);
                  break;
               }

               if (-1 != do * -999434329) {
                  cr var31 = br.ax[-999434329 * do];
                  var11 = client.ch * 12039691;
                  uk var51 = uk.aa;
                  boolean var32 = (var11 & var51.ac(-350930589)) != 0;
                  var37 = var31.al((byte)-87);
                  sz.db = var37;
                  var31.ai = var37 ? "beta" : var31.ai;
                  qq.ai(var31, 649342289);
                  dk = false;
                  ma.au.al(-1776792799 * ag, 0);
                  lg.ar.al(382 + -1776792799 * ag, 0);
                  ey.al.ag(382 + ag * -1776792799 - ey.al.ag / 2, 18);
                  if (var37 != var32) {
                     mt.hw(1886337145);
                  }
               } else {
                  if (-1187465059 * dh > 0 && gh.dx != null && 1898873515 * bj.ao >= 0 && bj.ao * 1898873515 <= gh.dx.ag && bj.as * -1909429297 >= en.av * 608173899 / 2 - 50 && bj.as * -1909429297 <= 608173899 * en.av / 2 + 50) {
                     dh -= 1659080117;
                  }

                  if (dh * -1187465059 < dm * -450854559 && null != hg.dj && bj.ao * 1898873515 >= fa.aj * -1991951399 - hg.dj.ag - 5 && bj.ao * 1898873515 <= fa.aj * -1991951399 && -1909429297 * bj.as >= 608173899 * en.av / 2 - 50 && -1909429297 * bj.as <= 608173899 * en.av / 2 + 50) {
                     dh += 1659080117;
                  }
               }
               break;
            }

            if (13 == var4.ab * 585229647) {
               dk = false;
               ma.au.al(-1776792799 * ag, 0);
               lg.ar.al(382 + -1776792799 * ag, 0);
               ey.al.ag(-1776792799 * ag + 382 - ey.al.ag / 2, 18);
               break;
            }

            if (96 == 585229647 * var4.ab) {
               if (dh * -1187465059 > 0 && gh.dx != null) {
                  dh -= 1659080117;
               }
            } else if (var4.ab * 585229647 == 97 && dh * -1187465059 < dm * -450854559 && hg.dj != null) {
               dh += 1659080117;
            }
         }

      } else {
         if ((1 == 2144731811 * bj.ai || !ei.ev && 2144731811 * bj.ai == 4) && 1898873515 * bj.ao >= 765 + -1776792799 * ag - 50 && bj.as * -1909429297 >= 453) {
            re.vt.au(!re.vt.ar((byte)1), -29696922);
            if (!re.vt.ar((byte)1)) {
               ArrayList var3 = new ArrayList();
               var3.add(new ns(hg.fe, "scape main", "", 255, false));
               gg.am(var3, 0, 0, 0, 100, false, (byte)-79);
            } else {
               ly.ax(0, 0, (byte)64);
            }

            bo.ar((byte)-54);
         }

         if (5 != -941305067 * client.dt) {
            if (-1L == di * -6098580745384794823L) {
               di = (hf.ac(-1598214665) + 1000L) * 7279498726138968329L;
            }

            long var24 = hf.ac(-1598214665);
            boolean var5;
            if (client.wz != null && client.we * 1275318517 < client.wz.size()) {
               while(true) {
                  if (1275318517 * client.we >= client.wz.size()) {
                     var5 = true;
                     break;
                  }

                  dw var6 = (dw)client.wz.get(client.we * 1275318517);
                  if (!var6.ac(1612027921)) {
                     var5 = false;
                     break;
                  }

                  client.we += 1010719581;
               }
            } else {
               var5 = true;
            }

            if (var5 && -1L == da * -5579989597765027495L) {
               da = 1080920665870794473L * var24;
               if (-5579989597765027495L * da > di * -6098580745384794823L) {
                  di = 7965531057716696353L * da;
               }
            }

            if (-941305067 * client.dt == 10 || -941305067 * client.dt == 11) {
               if (dn.cy == px.ac) {
                  if (1 == bj.ai * 2144731811 || !ei.ev && 2144731811 * bj.ai == 4) {
                     var27 = 5 + ag * -1776792799;
                     short var7 = 463;
                     byte var8 = 100;
                     byte var9 = 35;
                     if (bj.ao * 1898873515 >= var27 && 1898873515 * bj.ao <= var8 + var27 && bj.as * -1909429297 >= var7 && -1909429297 * bj.as <= var7 + var9) {
                        if (gz.ac(875766009)) {
                           dk = true;
                           dh = 0;
                           dm = 0;
                        }

                        return;
                     }
                  }

                  if (null != hl.ar && gz.ac(1172639374)) {
                     dk = true;
                     dh = 0;
                     dm = 0;
                  }
               }

               var27 = bj.ai * 2144731811;
               var28 = 1898873515 * bj.ao;
               var29 = -1909429297 * bj.as;
               if (var27 == 0) {
                  var28 = bj.al * -840136299;
                  var29 = bj.ad * -1213769803;
               }

               if (!ei.ev && 4 == var27) {
                  var27 = 1;
               }

               kh var30 = client.ss;
               kh var10 = var30;
               int var35;
               short var36;
               if (0 == -1220996517 * cn) {
                  boolean var52 = false;

                  while(var10.ab((byte)48)) {
                     if (585229647 * var10.ab == 84) {
                        var52 = true;
                     }
                  }

                  var35 = oe.av * 2045762615 - 80;
                  var36 = 291;
                  if (var27 == 1 && var28 >= var35 - 75 && var28 <= var35 + 75 && var29 >= var36 - 20 && var29 <= var36 + 20) {
                     ia.ac(ng.of("secure", true, (byte)-20) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, -2025316415);
                  }

                  var35 = 2045762615 * oe.av + 80;
                  if (1 == var27 && var28 >= var35 - 75 && var28 <= var35 + 75 && var29 >= var36 - 20 && var29 <= 20 + var36 || var52) {
                     hw.au(-1828915228);
                  }
               } else {
                  short var12;
                  if (cn * -1220996517 == 1) {
                     while(true) {
                        if (!var10.ab((byte)-42)) {
                           var11 = oe.av * 2045762615 - 80;
                           var12 = 321;
                           if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                              ks.ah(false, -1251821839);
                           }

                           var11 = 80 + oe.av * 2045762615;
                           if (1 == var27 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                              cw.ao(0, 1945345310);
                           }
                           break;
                        }

                        if (585229647 * var10.ab == 84) {
                           ks.ah(false, -1390913444);
                        } else if (13 == var10.ab * 585229647) {
                           cw.ao(0, -303434137);
                        }
                     }
                  } else {
                     int var15;
                     int var16;
                     short var33;
                     if (-1220996517 * cn == 2) {
                        var33 = 201;
                        var11 = var33 + 52;
                        if (1 == var27 && var29 >= var11 - 12 && var29 < var11 + 2) {
                           dp = 0;
                        }

                        var11 += 15;
                        if (var27 == 1 && var29 >= var11 - 12 && var29 < var11 + 2) {
                           dp = 2125340503;
                        }

                        var11 += 15;
                        var33 = 361;
                        if (ch.be != null) {
                           var35 = ch.be.ag * 392803297 / 2;
                           if (1 == var27 && var28 >= 1553874907 * ch.be.ac - var35 && var28 <= 1553874907 * ch.be.ac + var35 && var29 >= var33 - 15 && var29 < var33) {
                              switch(-1783522205 * bq) {
                              case 1:
                                 ia.ac(ok.mf, true, false, -1993430867);
                                 return;
                              case 2:
                                 ia.ac("https://support.runescape.com/hc/en-gb", true, false, -1353468605);
                              }
                           }
                        }

                        var35 = oe.av * 2045762615 - 80;
                        var36 = 321;
                        if (1 == var27 && var28 >= var35 - 75 && var28 <= 75 + var35 && var29 >= var36 - 20 && var29 <= 20 + var36) {
                           bf.at(1641843245);
                           return;
                        }

                        var35 = 80 + 1359998811 * aj + 180;
                        if (var27 == 1 && var28 >= var35 - 75 && var28 <= 75 + var35 && var29 >= var36 - 20 && var29 <= 20 + var36) {
                           cw.ao(0, 744683753);
                           cj = "";
                           cx = "";
                           ch.cd = 0;
                           px.ce = "";
                           ck = true;
                        }

                        var35 = -117 + oe.av * 2045762615;
                        var36 = 277;
                        cp = var28 >= var35 && var28 < var35 + ci.ca * 403949235 && var29 >= var36 && var29 < mq.cs * -1837050101 + var36;
                        if (var27 == 1 && cp) {
                           client.hn = !client.hn;
                           if (!client.hn && re.vt.an(-802751186) != null) {
                              re.vt.aw((String)null, -1500207798);
                           }
                        }

                        var35 = 24 + oe.av * 2045762615;
                        var36 = 277;
                        cb = var28 >= var35 && var28 < 403949235 * ci.ca + var35 && var29 >= var36 && var29 < mq.cs * -1837050101 + var36;
                        if (1 == var27 && cb) {
                           re.vt.af(!re.vt.at(736908466), (byte)-2);
                           if (!re.vt.at(-552588455)) {
                              cj = "";
                              re.vt.aw((String)null, -1500207798);
                              ev.aq((byte)1);
                           }
                        }

                        label1171:
                        while(true) {
                           Transferable var50;
                           do {
                              while(true) {
                                 label1135:
                                 do {
                                    while(true) {
                                       while(var10.ab((byte)-85)) {
                                          if (13 != var10.ab * 585229647) {
                                             if (-1584448409 * dp != 0) {
                                                continue label1135;
                                             }

                                             char var39 = var10.ap;

                                             for(var15 = 0; var15 < df.length() && var39 != df.charAt(var15); ++var15) {
                                             }

                                             if (85 == 585229647 * var10.ab && cj.length() > 0) {
                                                cj = cj.substring(0, cj.length() - 1);
                                             }

                                             if (84 == var10.ab * 585229647 || 80 == 585229647 * var10.ab) {
                                                dp = 2125340503;
                                             }

                                             char var46 = var10.ap;
                                             boolean var47 = df.indexOf(var46) != -1;
                                             if (var47 && cj.length() < 320) {
                                                cj = cj + var10.ap;
                                             }
                                          } else {
                                             cw.ao(0, 1764634128);
                                             cj = "";
                                             cx = "";
                                             ch.cd = 0;
                                             px.ce = "";
                                             ck = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(dp * -1584448409 != 1);

                                 if (585229647 * var10.ab == 85 && cx.length() > 0) {
                                    cx = cx.substring(0, cx.length() - 1);
                                 } else if (585229647 * var10.ab == 84 || 80 == var10.ab * 585229647) {
                                    dp = 0;
                                    if (84 == var10.ab * 585229647) {
                                       bf.at(1816112543);
                                       return;
                                    }
                                 }

                                 if ((var10.aa(82, 1770128204) || var10.aa(87, 1770128204)) && var10.ab * 585229647 == 67) {
                                    Clipboard var44 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var50 = var44.getContents(ae.be);
                                    var16 = 20 - cx.length();
                                    break;
                                 }

                                 if (dy.ag(var10.ap, -275791941)) {
                                    char var49 = var10.ap;
                                    var37 = df.indexOf(var49) != -1;
                                    if (var37 && cx.length() < 20) {
                                       cx = cx + var10.ap;
                                    }
                                 }
                              }
                           } while(var16 <= 0);

                           try {
                              String var48 = (String)var50.getTransferData(DataFlavor.stringFlavor);
                              int var18 = Math.min(var16, var48.length());
                              int var19 = 0;

                              while(true) {
                                 if (var19 >= var18) {
                                    cx = cx + var48.substring(0, var18);
                                    continue label1171;
                                 }

                                 if (!dy.ag(var48.charAt(var19), -1496639530)) {
                                    break;
                                 }

                                 char var21 = var48.charAt(var19);
                                 boolean var20 = df.indexOf(var21) != -1;
                                 if (!var20) {
                                    break;
                                 }

                                 ++var19;
                              }

                              cw.ao(3, 407172161);
                              return;
                           } catch (UnsupportedFlavorException var22) {
                           } catch (IOException var23) {
                           }
                        }
                     } else {
                        qy var13;
                        if (-1220996517 * cn == 3) {
                           var11 = aj * 1359998811 + 180;
                           var12 = 241;
                           var13 = var1.aa(25, ok.ki.length() - 34, ok.ki, var11, var12);
                           if (1 == var27 && var13.ag(var28, var29, -2075370177)) {
                              ia.ac(ok.me, true, false, -1657388483);
                           }

                           var11 = aj * 1359998811 + 180;
                           var12 = 276;
                           if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                              fm.ap(false, -1900545487);
                           }

                           var11 = aj * 1359998811 + 180;
                           var12 = 326;
                           if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                              ia.ac(ok.mf, true, false, -1805246854);
                              return;
                           }
                        } else {
                           int var14;
                           if (-1220996517 * cn == 4) {
                              var11 = 1359998811 * aj + 180 - 80;
                              var12 = 321;
                              if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                 px.ce.trim();
                                 if (px.ce.length() != 6) {
                                    aa(ok.bl, ok.bz, ok.bu, (byte)51);
                                 } else {
                                    ch.cd = Integer.parseInt(px.ce) * -103318219;
                                    px.ce = "";
                                    gs.iz(true, (byte)1);
                                    aa(ok.im, ok.in, ok.ic, (byte)-46);
                                    ry.hp(20, 1093205548);
                                 }

                                 return;
                              }

                              if (var27 == 1 && var28 >= aj * 1359998811 + 180 - 9 && var28 <= 130 + aj * 1359998811 + 180 && var29 >= 263 && var29 <= 296) {
                                 ck = !ck;
                              }

                              if (1 == var27 && var28 >= 1359998811 * aj + 180 - 34 && var28 <= 34 + aj * 1359998811 + 180 && var29 >= 351 && var29 <= 363) {
                                 ia.ac(ok.mf, true, false, -1347990116);
                              }

                              var11 = 80 + 180 + aj * 1359998811;
                              if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                 cw.ao(0, 1407126863);
                                 cj = "";
                                 cx = "";
                                 ch.cd = 0;
                                 px.ce = "";
                              }

                              while(var10.ab((byte)-128)) {
                                 boolean var34 = false;

                                 for(var14 = 0; var14 < dv.length(); ++var14) {
                                    if (var10.ap == dv.charAt(var14)) {
                                       var34 = true;
                                       break;
                                    }
                                 }

                                 if (13 == var10.ab * 585229647) {
                                    cw.ao(0, 1867323170);
                                    cj = "";
                                    cx = "";
                                    ch.cd = 0;
                                    px.ce = "";
                                 } else {
                                    if (var10.ab * 585229647 == 85 && px.ce.length() > 0) {
                                       px.ce = px.ce.substring(0, px.ce.length() - 1);
                                    }

                                    if (var10.ab * 585229647 == 84) {
                                       px.ce.trim();
                                       if (px.ce.length() != 6) {
                                          aa(ok.bl, ok.bz, ok.bu, (byte)23);
                                       } else {
                                          ch.cd = Integer.parseInt(px.ce) * -103318219;
                                          px.ce = "";
                                          gs.iz(true, (byte)1);
                                          aa(ok.im, ok.in, ok.ic, (byte)-27);
                                          ry.hp(20, 1717716224);
                                       }

                                       return;
                                    }

                                    if (var34 && px.ce.length() < 6) {
                                       px.ce = px.ce + var10.ap;
                                    }
                                 }
                              }
                           } else if (5 == cn * -1220996517) {
                              var11 = aj * 1359998811 + 180 - 80;
                              var12 = 321;
                              if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                 er.ab((byte)4);
                                 return;
                              }

                              var11 = aj * 1359998811 + 180 + 80;
                              if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                 ks.ah(true, -1949506537);
                              }

                              var36 = 361;
                              if (null != cr.bc) {
                                 var14 = cr.bc.ag * 392803297 / 2;
                                 if (1 == var27 && var28 >= cr.bc.ac * 1553874907 - var14 && var28 <= var14 + cr.bc.ac * 1553874907 && var29 >= var36 - 15 && var29 < var36) {
                                    ia.ac(ng.of("secure", true, (byte)-101) + "m=weblogin/g=oldscape/cant_log_in", true, false, -922003849);
                                 }
                              }

                              while(var10.ab((byte)-33)) {
                                 var37 = false;

                                 for(var15 = 0; var15 < df.length(); ++var15) {
                                    if (var10.ap == df.charAt(var15)) {
                                       var37 = true;
                                       break;
                                    }
                                 }

                                 if (var10.ab * 585229647 == 13) {
                                    ks.ah(true, -2093115495);
                                 } else {
                                    if (85 == 585229647 * var10.ab && cj.length() > 0) {
                                       cj = cj.substring(0, cj.length() - 1);
                                    }

                                    if (585229647 * var10.ab == 84) {
                                       er.ab((byte)4);
                                       return;
                                    }

                                    if (var37 && cj.length() < 320) {
                                       cj = cj + var10.ap;
                                    }
                                 }
                              }
                           } else if (-1220996517 * cn != 6) {
                              if (7 == cn * -1220996517) {
                                 if (ak.dx && !client.cz) {
                                    var11 = 2045762615 * oe.av - 150;
                                    var35 = 40 + 240 + var11 + 25;
                                    var36 = 231;
                                    var14 = var36 + 40;
                                    if (var27 == 1 && var28 >= var11 && var28 <= var35 && var29 >= var36 && var29 <= var14) {
                                       var16 = var11;
                                       int var17 = 0;

                                       while(true) {
                                          if (var17 >= 8) {
                                             var15 = 0;
                                             break;
                                          }

                                          if (var28 <= var16 + 30) {
                                             var15 = var17;
                                             break;
                                          }

                                          var16 += 30;
                                          var16 += var17 != 1 && var17 != 3 ? 5 : 20;
                                          ++var17;
                                       }

                                       cy = -114854799 * var15;
                                    }

                                    var15 = 180 + aj * 1359998811 - 80;
                                    short var40 = 321;
                                    boolean var45;
                                    if (var27 == 1 && var28 >= var15 - 75 && var28 <= 75 + var15 && var29 >= var40 - 20 && var29 <= 20 + var40) {
                                       var45 = fw.ar(670587174);
                                       if (var45) {
                                          ry.hp(50, 1271722502);
                                          return;
                                       }
                                    }

                                    var15 = 80 + 180 + aj * 1359998811;
                                    if (1 == var27 && var28 >= var15 - 75 && var28 <= var15 + 75 && var29 >= var40 - 20 && var29 <= 20 + var40) {
                                       co = new String[8];
                                       ks.ah(true, -1587761560);
                                    }

                                    while(var10.ab((byte)-115)) {
                                       if (var10.ab * 585229647 == 101) {
                                          co[cy * 2016267409] = null;
                                       }

                                       if (585229647 * var10.ab == 85) {
                                          if (co[cy * 2016267409] == null && 2016267409 * cy > 0) {
                                             cy -= -114854799;
                                          }

                                          co[cy * 2016267409] = null;
                                       }

                                       if (var10.ap >= '0' && var10.ap <= '9') {
                                          co[2016267409 * cy] = "" + var10.ap;
                                          if (cy * 2016267409 < 7) {
                                             cy += -114854799;
                                          }
                                       }

                                       if (585229647 * var10.ab == 84) {
                                          var45 = fw.ar(333953773);
                                          if (var45) {
                                             ry.hp(50, 1016887882);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var11 = 1359998811 * aj + 180 - 80;
                                    var12 = 321;
                                    if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                       ia.ac(ng.of("secure", true, (byte)-100) + "m=dob/set_dob.ws", true, false, -879173408);
                                       aa(ok.kb, ok.kz, ok.kl, (byte)-77);
                                       cw.ao(6, 638731883);
                                       return;
                                    }

                                    var11 = 180 + aj * 1359998811 + 80;
                                    if (1 == var27 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                       ks.ah(true, -1013814942);
                                    }
                                 }
                              } else if (cn * -1220996517 == 8) {
                                 var11 = 1359998811 * aj + 180 - 80;
                                 var12 = 321;
                                 if (1 == var27 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    ia.ac("https://www.jagex.com/terms/privacy", true, false, -1363726525);
                                    aa(ok.kb, ok.kz, ok.kl, (byte)47);
                                    cw.ao(6, 1635539947);
                                    return;
                                 }

                                 var11 = 80 + 180 + aj * 1359998811;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ks.ah(true, -1838290636);
                                 }
                              } else if (cn * -1220996517 == 9) {
                                 var11 = 180 + aj * 1359998811;
                                 var12 = 311;
                                 if (84 == var30.ab * 585229647 || 13 == 585229647 * var30.ab || 1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    fm.ap(false, -2125837956);
                                 }
                              } else if (cn * -1220996517 == 10) {
                                 var11 = aj * 1359998811 + 180;
                                 var12 = 209;
                                 if (585229647 * var30.ab == 84 || var27 == 1 && var28 >= var11 - 109 && var28 <= var11 + 109 && var29 >= var12 && var29 <= 68 + var12) {
                                    aa(ok.im, ok.in, ok.ic, (byte)-58);
                                    client.ga = vg.ae;
                                    gs.iz(false, (byte)1);
                                    ry.hp(20, 875646302);
                                 }
                              } else if (cn * -1220996517 == 12) {
                                 var11 = oe.av * 2045762615;
                                 var12 = 233;
                                 var13 = var2.aa(0, 30, ok.lt, var11, var12);
                                 qy var38 = var2.aa(32, 32, ok.lt, var11, var12);
                                 qy var41 = var2.aa(70, 34, ok.lt, var11, var12);
                                 var35 = var12 + 17;
                                 qy var42 = var2.aa(0, 34, ok.lj, var11, var35);
                                 if (var27 == 1) {
                                    if (var13.ag(var28, var29, -1773203597)) {
                                       ia.ac("https://www.jagex.com/terms", true, false, -1371408544);
                                    } else if (var38.ag(var28, var29, -1831050158)) {
                                       ia.ac("https://www.jagex.com/terms/privacy", true, false, -1429671768);
                                    } else if (var41.ag(var28, var29, -1593325126) || var42.ag(var28, var29, -1909370337)) {
                                       ia.ac("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false, -1404198456);
                                    }
                                 }

                                 var11 = oe.av * 2045762615 - 80;
                                 var12 = 311;
                                 if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    dl.pn((byte)0);
                                    fm.ap(true, -1424400166);
                                 }

                                 var11 = 80 + oe.av * 2045762615;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    cn = -1058049097;
                                 }
                              } else if (13 == cn * -1220996517) {
                                 var11 = 2045762615 * oe.av;
                                 var12 = 321;
                                 if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    fm.ap(true, -1822633021);
                                 }
                              } else if (14 == cn * -1220996517) {
                                 String var43 = "";
                                 switch(bo * -1857384015) {
                                 case 0:
                                    var43 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                    break;
                                 case 1:
                                    var43 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                    break;
                                 case 2:
                                    var43 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                    break;
                                 default:
                                    ks.ah(false, -1322792670);
                                 }

                                 var35 = 180 + 1359998811 * aj;
                                 var36 = 276;
                                 if (1 == var27 && var28 >= var35 - 75 && var28 <= var35 + 75 && var29 >= var36 - 20 && var29 <= var36 + 20) {
                                    ia.ac(var43, true, false, -1660207389);
                                    aa(ok.kb, ok.kz, ok.kl, (byte)-70);
                                    cw.ao(6, 569940312);
                                    return;
                                 }

                                 var35 = 180 + aj * 1359998811;
                                 var36 = 326;
                                 if (var27 == 1 && var28 >= var35 - 75 && var28 <= var35 + 75 && var29 >= var36 - 20 && var29 <= 20 + var36) {
                                    ks.ah(false, -1585906476);
                                 }
                              } else if (-1220996517 * cn == 24) {
                                 var11 = 180 + aj * 1359998811;
                                 var12 = 301;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    fm.ap(false, -1503413504);
                                 }
                              } else if (cn * -1220996517 == 32) {
                                 var11 = 180 + aj * 1359998811 - 80;
                                 var12 = 321;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    ia.ac(ng.of("secure", true, (byte)-88) + "m=dob/set_dob.ws", true, false, -1050649147);
                                    aa(ok.kb, ok.kz, ok.kl, (byte)-20);
                                    cw.ao(6, 920788070);
                                    return;
                                 }

                                 var11 = 80 + 180 + aj * 1359998811;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ks.ah(true, -2085067778);
                                 }
                              } else if (cn * -1220996517 == 33) {
                                 var11 = aj * 1359998811 + 180;
                                 var12 = 276;
                                 if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ia.ac(ok.me, true, false, -1930971684);
                                 }

                                 var11 = aj * 1359998811 + 180;
                                 var12 = 326;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ks.ah(true, -2069022070);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var10.ab((byte)-49)) {
                                       var33 = 321;
                                       if (var27 == 1 && var29 >= var33 - 20 && var29 <= var33 + 20) {
                                          ks.ah(true, -859919767);
                                       }

                                       return;
                                    }
                                 } while(var10.ab * 585229647 != 84 && 13 != 585229647 * var10.ab);

                                 ks.ah(true, -1954031024);
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   static void bs() {
      if (client.hn && null != cj && cj.length() > 0) {
         dp = 2125340503;
      } else {
         dp = 0;
      }

   }

   static void bw() {
      if (client.hn && null != cj && cj.length() > 0) {
         dp = 1475374841;
      } else {
         dp = 0;
      }

   }

   static void ba() {
      if (client.hn && null != cj && cj.length() > 0) {
         dp = 2125340503;
      } else {
         dp = 0;
      }

   }

   static void bj(ba var0, qu var1, qu var2) {
      int var11;
      int var27;
      int var28;
      int var29;
      boolean var37;
      if (dk) {
         kh var25 = client.ss;
         kh var4 = var25;

         while(true) {
            if (!var4.ab((byte)-27)) {
               if (bj.ai * 2144731811 != 1 && (ei.ev || bj.ai * 2144731811 != 4)) {
                  break;
               }

               int var26 = 280 + -1776792799 * ag;
               if (bj.ao * 1898873515 >= var26 && bj.ao * 1898873515 <= var26 + 14 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(0, 0, 234253922);
                  break;
               }

               if (bj.ao * 1898873515 >= var26 + 15 && 1898873515 * bj.ao <= 80 + var26 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(0, 1, 234253922);
                  break;
               }

               var27 = 390 + ag * -1776792799;
               if (1898873515 * bj.ao >= var27 && 1898873515 * bj.ao <= 14 + var27 && -1909429297 * bj.as >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(1, 0, 234253922);
                  break;
               }

               if (bj.ao * 1898873515 >= 15 + var27 && bj.ao * 1898873515 <= 80 + var27 && bj.as * -1909429297 >= 4 && bj.as * -1909429297 <= 18) {
                  fm.ae(1, 1, 234253922);
                  break;
               }

               var28 = -1776792799 * ag + 500;
               if (1898873515 * bj.ao >= var28 && 1898873515 * bj.ao <= var28 + 14 && bj.as * -1909429297 >= 4 && bj.as * -1909429297 <= 18) {
                  fm.ae(2, 0, 234253922);
                  break;
               }

               if (bj.ao * 1898873515 >= var28 + 15 && bj.ao * 1898873515 <= var28 + 80 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(2, 1, 234253922);
                  break;
               }

               var29 = ag * -1776792799 + 610;
               if (1898873515 * bj.ao >= var29 && 1898873515 * bj.ao <= 14 + var29 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(3, 0, 234253922);
                  break;
               }

               if (1898873515 * bj.ao >= var29 + 15 && 1898873515 * bj.ao <= 80 + var29 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(3, 1, 234253922);
                  break;
               }

               if (bj.ao * 1898873515 >= 708 + -1776792799 * ag && bj.as * -1909429297 >= 4 && bj.ao * 1898873515 <= 50 + 708 + -1776792799 * ag && bj.as * -1909429297 <= 20) {
                  dk = false;
                  ma.au.al(-1776792799 * ag, 0);
                  lg.ar.al(382 + -1776792799 * ag, 0);
                  ey.al.ag(ag * -1776792799 + 382 - ey.al.ag / 2, 18);
                  break;
               }

               if (-1 != do * -999434329) {
                  cr var31 = br.ax[-999434329 * do];
                  var11 = client.ch * 12039691;
                  uk var51 = uk.aa;
                  boolean var32 = (var11 & var51.ac(-350930589)) != 0;
                  var37 = var31.al((byte)-117);
                  sz.db = var37;
                  var31.ai = var37 ? "beta" : var31.ai;
                  qq.ai(var31, 649572581);
                  dk = false;
                  ma.au.al(-1776792799 * ag, 0);
                  lg.ar.al(382 + -1776792799 * ag, 0);
                  ey.al.ag(382 + ag * -1776792799 - ey.al.ag / 2, 18);
                  if (var37 != var32) {
                     mt.hw(1886337145);
                  }
               } else {
                  if (-1187465059 * dh > 0 && gh.dx != null && 1898873515 * bj.ao >= 0 && bj.ao * 1898873515 <= gh.dx.ag && bj.as * -1909429297 >= en.av * 608173899 / 2 - 50 && bj.as * -1909429297 <= 608173899 * en.av / 2 + 50) {
                     dh -= 1659080117;
                  }

                  if (dh * -1187465059 < dm * -450854559 && null != hg.dj && bj.ao * 1898873515 >= fa.aj * -1991951399 - hg.dj.ag - 5 && bj.ao * 1898873515 <= fa.aj * -1991951399 && -1909429297 * bj.as >= 608173899 * en.av / 2 - 50 && -1909429297 * bj.as <= 608173899 * en.av / 2 + 50) {
                     dh += 1659080117;
                  }
               }
               break;
            }

            if (13 == var4.ab * 585229647) {
               dk = false;
               ma.au.al(-1776792799 * ag, 0);
               lg.ar.al(382 + -1776792799 * ag, 0);
               ey.al.ag(-1776792799 * ag + 382 - ey.al.ag / 2, 18);
               break;
            }

            if (96 == 585229647 * var4.ab) {
               if (dh * -1187465059 > 0 && gh.dx != null) {
                  dh -= 1659080117;
               }
            } else if (var4.ab * 585229647 == 97 && dh * -1187465059 < dm * -450854559 && hg.dj != null) {
               dh += 1659080117;
            }
         }

      } else {
         if ((1 == 2144731811 * bj.ai || !ei.ev && 2144731811 * bj.ai == 4) && 1898873515 * bj.ao >= 765 + -1776792799 * ag - 50 && bj.as * -1909429297 >= 453) {
            re.vt.au(!re.vt.ar((byte)1), 1910800925);
            if (!re.vt.ar((byte)1)) {
               ArrayList var3 = new ArrayList();
               var3.add(new ns(hg.fe, "scape main", "", 255, false));
               gg.am(var3, 0, 0, 0, 100, false, (byte)-21);
            } else {
               ly.ax(0, 0, (byte)64);
            }

            bo.ar((byte)-23);
         }

         if (5 != -941305067 * client.dt) {
            if (-1L == di * -6098580745384794823L) {
               di = (hf.ac(-1598214665) + 1000L) * 7279498726138968329L;
            }

            long var24 = hf.ac(-1598214665);
            boolean var5;
            if (client.wz != null && client.we * 1275318517 < client.wz.size()) {
               while(true) {
                  if (1275318517 * client.we >= client.wz.size()) {
                     var5 = true;
                     break;
                  }

                  dw var6 = (dw)client.wz.get(client.we * 1275318517);
                  if (!var6.ac(2085996045)) {
                     var5 = false;
                     break;
                  }

                  client.we += 1010719581;
               }
            } else {
               var5 = true;
            }

            if (var5 && -1L == da * -5579989597765027495L) {
               da = 1080920665870794473L * var24;
               if (-5579989597765027495L * da > di * -6098580745384794823L) {
                  di = 7965531057716696353L * da;
               }
            }

            if (-941305067 * client.dt == 10 || -941305067 * client.dt == 11) {
               if (dn.cy == px.ac) {
                  if (1 == bj.ai * 2144731811 || !ei.ev && 2144731811 * bj.ai == 4) {
                     var27 = 5 + ag * -1776792799;
                     short var7 = 463;
                     byte var8 = 100;
                     byte var9 = 35;
                     if (bj.ao * 1898873515 >= var27 && 1898873515 * bj.ao <= var8 + var27 && bj.as * -1909429297 >= var7 && -1909429297 * bj.as <= var7 + var9) {
                        if (gz.ac(-300460529)) {
                           dk = true;
                           dh = 0;
                           dm = 0;
                        }

                        return;
                     }
                  }

                  if (null != hl.ar && gz.ac(430104015)) {
                     dk = true;
                     dh = 0;
                     dm = 0;
                  }
               }

               var27 = bj.ai * 2144731811;
               var28 = 1898873515 * bj.ao;
               var29 = -1909429297 * bj.as;
               if (var27 == 0) {
                  var28 = bj.al * -840136299;
                  var29 = bj.ad * -1213769803;
               }

               if (!ei.ev && 4 == var27) {
                  var27 = 1;
               }

               kh var30 = client.ss;
               kh var10 = var30;
               int var35;
               short var36;
               if (0 == -1220996517 * cn) {
                  boolean var52 = false;

                  while(var10.ab((byte)55)) {
                     if (585229647 * var10.ab == 84) {
                        var52 = true;
                     }
                  }

                  var35 = oe.av * 2045762615 - 80;
                  var36 = 291;
                  if (var27 == 1 && var28 >= var35 - 75 && var28 <= var35 + 75 && var29 >= var36 - 20 && var29 <= var36 + 20) {
                     ia.ac(ng.of("secure", true, (byte)-17) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, -895850628);
                  }

                  var35 = 2045762615 * oe.av + 80;
                  if (1 == var27 && var28 >= var35 - 75 && var28 <= var35 + 75 && var29 >= var36 - 20 && var29 <= 20 + var36 || var52) {
                     hw.au(1017511745);
                  }
               } else {
                  short var12;
                  if (cn * -1220996517 == 1) {
                     while(true) {
                        if (!var10.ab((byte)51)) {
                           var11 = oe.av * 2045762615 - 80;
                           var12 = 321;
                           if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                              ks.ah(false, -1433755215);
                           }

                           var11 = 80 + oe.av * 2045762615;
                           if (1 == var27 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                              cw.ao(0, 479230894);
                           }
                           break;
                        }

                        if (585229647 * var10.ab == 84) {
                           ks.ah(false, -994793090);
                        } else if (13 == var10.ab * 585229647) {
                           cw.ao(0, 827838639);
                        }
                     }
                  } else {
                     int var15;
                     int var16;
                     short var33;
                     if (-1220996517 * cn == 2) {
                        var33 = 201;
                        var11 = var33 + 52;
                        if (1 == var27 && var29 >= var11 - 12 && var29 < var11 + 2) {
                           dp = 0;
                        }

                        var11 += 15;
                        if (var27 == 1 && var29 >= var11 - 12 && var29 < var11 + 2) {
                           dp = 2125340503;
                        }

                        var11 += 15;
                        var33 = 361;
                        if (ch.be != null) {
                           var35 = ch.be.ag * 392803297 / 2;
                           if (1 == var27 && var28 >= 1553874907 * ch.be.ac - var35 && var28 <= 1553874907 * ch.be.ac + var35 && var29 >= var33 - 15 && var29 < var33) {
                              switch(-1783522205 * bq) {
                              case 1:
                                 ia.ac(ok.mf, true, false, -1802887662);
                                 return;
                              case 2:
                                 ia.ac("https://support.runescape.com/hc/en-gb", true, false, -1703771593);
                              }
                           }
                        }

                        var35 = oe.av * 2045762615 - 80;
                        var36 = 321;
                        if (1 == var27 && var28 >= var35 - 75 && var28 <= 75 + var35 && var29 >= var36 - 20 && var29 <= 20 + var36) {
                           bf.at(1986166720);
                           return;
                        }

                        var35 = 80 + 1359998811 * aj + 180;
                        if (var27 == 1 && var28 >= var35 - 75 && var28 <= 75 + var35 && var29 >= var36 - 20 && var29 <= 20 + var36) {
                           cw.ao(0, 2108004263);
                           cj = "";
                           cx = "";
                           ch.cd = 0;
                           px.ce = "";
                           ck = true;
                        }

                        var35 = -117 + oe.av * 2045762615;
                        var36 = 277;
                        cp = var28 >= var35 && var28 < var35 + ci.ca * 403949235 && var29 >= var36 && var29 < mq.cs * -1837050101 + var36;
                        if (var27 == 1 && cp) {
                           client.hn = !client.hn;
                           if (!client.hn && re.vt.an(-40587053) != null) {
                              re.vt.aw((String)null, -1500207798);
                           }
                        }

                        var35 = 24 + oe.av * 2045762615;
                        var36 = 277;
                        cb = var28 >= var35 && var28 < 403949235 * ci.ca + var35 && var29 >= var36 && var29 < mq.cs * -1837050101 + var36;
                        if (1 == var27 && cb) {
                           re.vt.af(!re.vt.at(1350311287), (byte)-48);
                           if (!re.vt.at(-1104858129)) {
                              cj = "";
                              re.vt.aw((String)null, -1500207798);
                              ev.aq((byte)1);
                           }
                        }

                        label1171:
                        while(true) {
                           Transferable var50;
                           do {
                              while(true) {
                                 label1135:
                                 do {
                                    while(true) {
                                       while(var10.ab((byte)-75)) {
                                          if (13 != var10.ab * 585229647) {
                                             if (-1584448409 * dp != 0) {
                                                continue label1135;
                                             }

                                             char var39 = var10.ap;

                                             for(var15 = 0; var15 < df.length() && var39 != df.charAt(var15); ++var15) {
                                             }

                                             if (85 == 585229647 * var10.ab && cj.length() > 0) {
                                                cj = cj.substring(0, cj.length() - 1);
                                             }

                                             if (84 == var10.ab * 585229647 || 80 == 585229647 * var10.ab) {
                                                dp = 2125340503;
                                             }

                                             char var46 = var10.ap;
                                             boolean var47 = df.indexOf(var46) != -1;
                                             if (var47 && cj.length() < 320) {
                                                cj = cj + var10.ap;
                                             }
                                          } else {
                                             cw.ao(0, 1187234470);
                                             cj = "";
                                             cx = "";
                                             ch.cd = 0;
                                             px.ce = "";
                                             ck = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(dp * -1584448409 != 1);

                                 if (585229647 * var10.ab == 85 && cx.length() > 0) {
                                    cx = cx.substring(0, cx.length() - 1);
                                 } else if (585229647 * var10.ab == 84 || 80 == var10.ab * 585229647) {
                                    dp = 0;
                                    if (84 == var10.ab * 585229647) {
                                       bf.at(2088314237);
                                       return;
                                    }
                                 }

                                 if ((var10.aa(82, 1770128204) || var10.aa(87, 1770128204)) && var10.ab * 585229647 == 67) {
                                    Clipboard var44 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var50 = var44.getContents(ae.be);
                                    var16 = 20 - cx.length();
                                    break;
                                 }

                                 if (dy.ag(var10.ap, -641248710)) {
                                    char var49 = var10.ap;
                                    var37 = df.indexOf(var49) != -1;
                                    if (var37 && cx.length() < 20) {
                                       cx = cx + var10.ap;
                                    }
                                 }
                              }
                           } while(var16 <= 0);

                           try {
                              String var48 = (String)var50.getTransferData(DataFlavor.stringFlavor);
                              int var18 = Math.min(var16, var48.length());
                              int var19 = 0;

                              while(true) {
                                 if (var19 >= var18) {
                                    cx = cx + var48.substring(0, var18);
                                    continue label1171;
                                 }

                                 if (!dy.ag(var48.charAt(var19), -325823412)) {
                                    break;
                                 }

                                 char var21 = var48.charAt(var19);
                                 boolean var20 = df.indexOf(var21) != -1;
                                 if (!var20) {
                                    break;
                                 }

                                 ++var19;
                              }

                              cw.ao(3, 1944362143);
                              return;
                           } catch (UnsupportedFlavorException var22) {
                           } catch (IOException var23) {
                           }
                        }
                     } else {
                        qy var13;
                        if (-1220996517 * cn == 3) {
                           var11 = aj * 1359998811 + 180;
                           var12 = 241;
                           var13 = var1.aa(25, ok.ki.length() - 34, ok.ki, var11, var12);
                           if (1 == var27 && var13.ag(var28, var29, -1839095396)) {
                              ia.ac(ok.me, true, false, -1809261711);
                           }

                           var11 = aj * 1359998811 + 180;
                           var12 = 276;
                           if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                              fm.ap(false, -1845521908);
                           }

                           var11 = aj * 1359998811 + 180;
                           var12 = 326;
                           if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                              ia.ac(ok.mf, true, false, -1394937975);
                              return;
                           }
                        } else {
                           int var14;
                           if (-1220996517 * cn == 4) {
                              var11 = 1359998811 * aj + 180 - 80;
                              var12 = 321;
                              if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                 px.ce.trim();
                                 if (px.ce.length() != 6) {
                                    aa(ok.bl, ok.bz, ok.bu, (byte)56);
                                 } else {
                                    ch.cd = Integer.parseInt(px.ce) * -103318219;
                                    px.ce = "";
                                    gs.iz(true, (byte)1);
                                    aa(ok.im, ok.in, ok.ic, (byte)102);
                                    ry.hp(20, 1775449005);
                                 }

                                 return;
                              }

                              if (var27 == 1 && var28 >= aj * 1359998811 + 180 - 9 && var28 <= 130 + aj * 1359998811 + 180 && var29 >= 263 && var29 <= 296) {
                                 ck = !ck;
                              }

                              if (1 == var27 && var28 >= 1359998811 * aj + 180 - 34 && var28 <= 34 + aj * 1359998811 + 180 && var29 >= 351 && var29 <= 363) {
                                 ia.ac(ok.mf, true, false, -1069000790);
                              }

                              var11 = 80 + 180 + aj * 1359998811;
                              if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                 cw.ao(0, -162906614);
                                 cj = "";
                                 cx = "";
                                 ch.cd = 0;
                                 px.ce = "";
                              }

                              while(var10.ab((byte)-55)) {
                                 boolean var34 = false;

                                 for(var14 = 0; var14 < dv.length(); ++var14) {
                                    if (var10.ap == dv.charAt(var14)) {
                                       var34 = true;
                                       break;
                                    }
                                 }

                                 if (13 == var10.ab * 585229647) {
                                    cw.ao(0, -203663078);
                                    cj = "";
                                    cx = "";
                                    ch.cd = 0;
                                    px.ce = "";
                                 } else {
                                    if (var10.ab * 585229647 == 85 && px.ce.length() > 0) {
                                       px.ce = px.ce.substring(0, px.ce.length() - 1);
                                    }

                                    if (var10.ab * 585229647 == 84) {
                                       px.ce.trim();
                                       if (px.ce.length() != 6) {
                                          aa(ok.bl, ok.bz, ok.bu, (byte)-71);
                                       } else {
                                          ch.cd = Integer.parseInt(px.ce) * -103318219;
                                          px.ce = "";
                                          gs.iz(true, (byte)1);
                                          aa(ok.im, ok.in, ok.ic, (byte)-1);
                                          ry.hp(20, 1569841725);
                                       }

                                       return;
                                    }

                                    if (var34 && px.ce.length() < 6) {
                                       px.ce = px.ce + var10.ap;
                                    }
                                 }
                              }
                           } else if (5 == cn * -1220996517) {
                              var11 = aj * 1359998811 + 180 - 80;
                              var12 = 321;
                              if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                 er.ab((byte)4);
                                 return;
                              }

                              var11 = aj * 1359998811 + 180 + 80;
                              if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                 ks.ah(true, -1508116018);
                              }

                              var36 = 361;
                              if (null != cr.bc) {
                                 var14 = cr.bc.ag * 392803297 / 2;
                                 if (1 == var27 && var28 >= cr.bc.ac * 1553874907 - var14 && var28 <= var14 + cr.bc.ac * 1553874907 && var29 >= var36 - 15 && var29 < var36) {
                                    ia.ac(ng.of("secure", true, (byte)-48) + "m=weblogin/g=oldscape/cant_log_in", true, false, -866231999);
                                 }
                              }

                              while(var10.ab((byte)-107)) {
                                 var37 = false;

                                 for(var15 = 0; var15 < df.length(); ++var15) {
                                    if (var10.ap == df.charAt(var15)) {
                                       var37 = true;
                                       break;
                                    }
                                 }

                                 if (var10.ab * 585229647 == 13) {
                                    ks.ah(true, -1088937510);
                                 } else {
                                    if (85 == 585229647 * var10.ab && cj.length() > 0) {
                                       cj = cj.substring(0, cj.length() - 1);
                                    }

                                    if (585229647 * var10.ab == 84) {
                                       er.ab((byte)4);
                                       return;
                                    }

                                    if (var37 && cj.length() < 320) {
                                       cj = cj + var10.ap;
                                    }
                                 }
                              }
                           } else if (-1220996517 * cn != 6) {
                              if (7 == cn * -1220996517) {
                                 if (ak.dx && !client.cz) {
                                    var11 = 2045762615 * oe.av - 150;
                                    var35 = 40 + 240 + var11 + 25;
                                    var36 = 231;
                                    var14 = var36 + 40;
                                    if (var27 == 1 && var28 >= var11 && var28 <= var35 && var29 >= var36 && var29 <= var14) {
                                       var16 = var11;
                                       int var17 = 0;

                                       while(true) {
                                          if (var17 >= 8) {
                                             var15 = 0;
                                             break;
                                          }

                                          if (var28 <= var16 + 30) {
                                             var15 = var17;
                                             break;
                                          }

                                          var16 += 30;
                                          var16 += var17 != 1 && var17 != 3 ? 5 : 20;
                                          ++var17;
                                       }

                                       cy = -114854799 * var15;
                                    }

                                    var15 = 180 + aj * 1359998811 - 80;
                                    short var40 = 321;
                                    boolean var45;
                                    if (var27 == 1 && var28 >= var15 - 75 && var28 <= 75 + var15 && var29 >= var40 - 20 && var29 <= 20 + var40) {
                                       var45 = fw.ar(-1532248247);
                                       if (var45) {
                                          ry.hp(50, 1616657582);
                                          return;
                                       }
                                    }

                                    var15 = 80 + 180 + aj * 1359998811;
                                    if (1 == var27 && var28 >= var15 - 75 && var28 <= var15 + 75 && var29 >= var40 - 20 && var29 <= 20 + var40) {
                                       co = new String[8];
                                       ks.ah(true, -1945122644);
                                    }

                                    while(var10.ab((byte)-105)) {
                                       if (var10.ab * 585229647 == 101) {
                                          co[cy * 2016267409] = null;
                                       }

                                       if (585229647 * var10.ab == 85) {
                                          if (co[cy * 2016267409] == null && 2016267409 * cy > 0) {
                                             cy -= -114854799;
                                          }

                                          co[cy * 2016267409] = null;
                                       }

                                       if (var10.ap >= '0' && var10.ap <= '9') {
                                          co[2016267409 * cy] = "" + var10.ap;
                                          if (cy * 2016267409 < 7) {
                                             cy += -114854799;
                                          }
                                       }

                                       if (585229647 * var10.ab == 84) {
                                          var45 = fw.ar(1337982818);
                                          if (var45) {
                                             ry.hp(50, 872683432);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var11 = 1359998811 * aj + 180 - 80;
                                    var12 = 321;
                                    if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                       ia.ac(ng.of("secure", true, (byte)-52) + "m=dob/set_dob.ws", true, false, -983359084);
                                       aa(ok.kb, ok.kz, ok.kl, (byte)74);
                                       cw.ao(6, -71231906);
                                       return;
                                    }

                                    var11 = 180 + aj * 1359998811 + 80;
                                    if (1 == var27 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                       ks.ah(true, -1860081695);
                                    }
                                 }
                              } else if (cn * -1220996517 == 8) {
                                 var11 = 1359998811 * aj + 180 - 80;
                                 var12 = 321;
                                 if (1 == var27 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    ia.ac("https://www.jagex.com/terms/privacy", true, false, -1701317363);
                                    aa(ok.kb, ok.kz, ok.kl, (byte)7);
                                    cw.ao(6, 1370946645);
                                    return;
                                 }

                                 var11 = 80 + 180 + aj * 1359998811;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ks.ah(true, -1080880965);
                                 }
                              } else if (cn * -1220996517 == 9) {
                                 var11 = 180 + aj * 1359998811;
                                 var12 = 311;
                                 if (84 == var30.ab * 585229647 || 13 == 585229647 * var30.ab || 1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    fm.ap(false, -1961968746);
                                 }
                              } else if (cn * -1220996517 == 10) {
                                 var11 = aj * 1359998811 + 180;
                                 var12 = 209;
                                 if (585229647 * var30.ab == 84 || var27 == 1 && var28 >= var11 - 109 && var28 <= var11 + 109 && var29 >= var12 && var29 <= 68 + var12) {
                                    aa(ok.im, ok.in, ok.ic, (byte)122);
                                    client.ga = vg.ae;
                                    gs.iz(false, (byte)1);
                                    ry.hp(20, 965614749);
                                 }
                              } else if (cn * -1220996517 == 12) {
                                 var11 = oe.av * 2045762615;
                                 var12 = 233;
                                 var13 = var2.aa(0, 30, ok.lt, var11, var12);
                                 qy var38 = var2.aa(32, 32, ok.lt, var11, var12);
                                 qy var41 = var2.aa(70, 34, ok.lt, var11, var12);
                                 var35 = var12 + 17;
                                 qy var42 = var2.aa(0, 34, ok.lj, var11, var35);
                                 if (var27 == 1) {
                                    if (var13.ag(var28, var29, -1930149086)) {
                                       ia.ac("https://www.jagex.com/terms", true, false, -1573536390);
                                    } else if (var38.ag(var28, var29, -1535786811)) {
                                       ia.ac("https://www.jagex.com/terms/privacy", true, false, -1999620770);
                                    } else if (var41.ag(var28, var29, -1937228725) || var42.ag(var28, var29, -1738934493)) {
                                       ia.ac("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false, -1486132328);
                                    }
                                 }

                                 var11 = oe.av * 2045762615 - 80;
                                 var12 = 311;
                                 if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    dl.pn((byte)0);
                                    fm.ap(true, -2117916276);
                                 }

                                 var11 = 80 + oe.av * 2045762615;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    cn = -1058049097;
                                 }
                              } else if (13 == cn * -1220996517) {
                                 var11 = 2045762615 * oe.av;
                                 var12 = 321;
                                 if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    fm.ap(true, -1597010937);
                                 }
                              } else if (14 == cn * -1220996517) {
                                 String var43 = "";
                                 switch(bo * -1857384015) {
                                 case 0:
                                    var43 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                    break;
                                 case 1:
                                    var43 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                    break;
                                 case 2:
                                    var43 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                    break;
                                 default:
                                    ks.ah(false, -1362153156);
                                 }

                                 var35 = 180 + 1359998811 * aj;
                                 var36 = 276;
                                 if (1 == var27 && var28 >= var35 - 75 && var28 <= var35 + 75 && var29 >= var36 - 20 && var29 <= var36 + 20) {
                                    ia.ac(var43, true, false, -1275676559);
                                    aa(ok.kb, ok.kz, ok.kl, (byte)-19);
                                    cw.ao(6, 1767172336);
                                    return;
                                 }

                                 var35 = 180 + aj * 1359998811;
                                 var36 = 326;
                                 if (var27 == 1 && var28 >= var35 - 75 && var28 <= var35 + 75 && var29 >= var36 - 20 && var29 <= 20 + var36) {
                                    ks.ah(false, -2126565175);
                                 }
                              } else if (-1220996517 * cn == 24) {
                                 var11 = 180 + aj * 1359998811;
                                 var12 = 301;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    fm.ap(false, -1624832963);
                                 }
                              } else if (cn * -1220996517 == 32) {
                                 var11 = 180 + aj * 1359998811 - 80;
                                 var12 = 321;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    ia.ac(ng.of("secure", true, (byte)-51) + "m=dob/set_dob.ws", true, false, -1098767908);
                                    aa(ok.kb, ok.kz, ok.kl, (byte)-15);
                                    cw.ao(6, -138697925);
                                    return;
                                 }

                                 var11 = 80 + 180 + aj * 1359998811;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ks.ah(true, -1925626665);
                                 }
                              } else if (cn * -1220996517 == 33) {
                                 var11 = aj * 1359998811 + 180;
                                 var12 = 276;
                                 if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ia.ac(ok.me, true, false, -987617860);
                                 }

                                 var11 = aj * 1359998811 + 180;
                                 var12 = 326;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ks.ah(true, -1248925397);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var10.ab((byte)-30)) {
                                       var33 = 321;
                                       if (var27 == 1 && var29 >= var33 - 20 && var29 <= var33 + 20) {
                                          ks.ah(true, -1290381022);
                                       }

                                       return;
                                    }
                                 } while(var10.ab * 585229647 != 84 && 13 != 585229647 * var10.ab);

                                 ks.ah(true, -952689636);
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   static void bp(ba var0, qu var1, qu var2) {
      int var11;
      int var27;
      int var28;
      int var29;
      boolean var37;
      if (dk) {
         kh var25 = client.ss;
         kh var4 = var25;

         while(true) {
            if (!var4.ab((byte)62)) {
               if (bj.ai * 2144731811 != 1 && (ei.ev || bj.ai * 2144731811 != 4)) {
                  break;
               }

               int var26 = 280 + -1776792799 * ag;
               if (bj.ao * 1898873515 >= var26 && bj.ao * 1898873515 <= var26 + 14 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(0, 0, 234253922);
                  break;
               }

               if (bj.ao * 1898873515 >= var26 + 15 && 1898873515 * bj.ao <= 80 + var26 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(0, 1, 234253922);
                  break;
               }

               var27 = 390 + ag * -1776792799;
               if (1898873515 * bj.ao >= var27 && 1898873515 * bj.ao <= 14 + var27 && -1909429297 * bj.as >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(1, 0, 234253922);
                  break;
               }

               if (bj.ao * 1898873515 >= 15 + var27 && bj.ao * 1898873515 <= 80 + var27 && bj.as * -1909429297 >= 4 && bj.as * -1909429297 <= 18) {
                  fm.ae(1, 1, 234253922);
                  break;
               }

               var28 = -1776792799 * ag + 500;
               if (1898873515 * bj.ao >= var28 && 1898873515 * bj.ao <= var28 + 14 && bj.as * -1909429297 >= 4 && bj.as * -1909429297 <= 18) {
                  fm.ae(2, 0, 234253922);
                  break;
               }

               if (bj.ao * 1898873515 >= var28 + 15 && bj.ao * 1898873515 <= var28 + 80 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(2, 1, 234253922);
                  break;
               }

               var29 = ag * -1776792799 + 610;
               if (1898873515 * bj.ao >= var29 && 1898873515 * bj.ao <= 14 + var29 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(3, 0, 234253922);
                  break;
               }

               if (1898873515 * bj.ao >= var29 + 15 && 1898873515 * bj.ao <= 80 + var29 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(3, 1, 234253922);
                  break;
               }

               if (bj.ao * 1898873515 >= 708 + -1776792799 * ag && bj.as * -1909429297 >= 4 && bj.ao * 1898873515 <= 50 + 708 + -1776792799 * ag && bj.as * -1909429297 <= 20) {
                  dk = false;
                  ma.au.al(-1776792799 * ag, 0);
                  lg.ar.al(382 + -1776792799 * ag, 0);
                  ey.al.ag(ag * -1776792799 + 382 - ey.al.ag / 2, 18);
                  break;
               }

               if (-1 != do * -999434329) {
                  cr var31 = br.ax[-999434329 * do];
                  var11 = client.ch * 12039691;
                  uk var51 = uk.aa;
                  boolean var32 = (var11 & var51.ac(-350930589)) != 0;
                  var37 = var31.al((byte)-122);
                  sz.db = var37;
                  var31.ai = var37 ? "beta" : var31.ai;
                  qq.ai(var31, 1129836258);
                  dk = false;
                  ma.au.al(-1776792799 * ag, 0);
                  lg.ar.al(382 + -1776792799 * ag, 0);
                  ey.al.ag(382 + ag * -1776792799 - ey.al.ag / 2, 18);
                  if (var37 != var32) {
                     mt.hw(1886337145);
                  }
               } else {
                  if (-1187465059 * dh > 0 && gh.dx != null && 1898873515 * bj.ao >= 0 && bj.ao * 1898873515 <= gh.dx.ag && bj.as * -1909429297 >= en.av * 608173899 / 2 - 50 && bj.as * -1909429297 <= 608173899 * en.av / 2 + 50) {
                     dh -= 1659080117;
                  }

                  if (dh * -1187465059 < dm * -450854559 && null != hg.dj && bj.ao * 1898873515 >= fa.aj * -1991951399 - hg.dj.ag - 5 && bj.ao * 1898873515 <= fa.aj * -1991951399 && -1909429297 * bj.as >= 608173899 * en.av / 2 - 50 && -1909429297 * bj.as <= 608173899 * en.av / 2 + 50) {
                     dh += 1659080117;
                  }
               }
               break;
            }

            if (13 == var4.ab * 585229647) {
               dk = false;
               ma.au.al(-1776792799 * ag, 0);
               lg.ar.al(382 + -1776792799 * ag, 0);
               ey.al.ag(-1776792799 * ag + 382 - ey.al.ag / 2, 18);
               break;
            }

            if (96 == 585229647 * var4.ab) {
               if (dh * -1187465059 > 0 && gh.dx != null) {
                  dh -= 1659080117;
               }
            } else if (var4.ab * 585229647 == 97 && dh * -1187465059 < dm * -450854559 && hg.dj != null) {
               dh += 1659080117;
            }
         }

      } else {
         if ((1 == 2144731811 * bj.ai || !ei.ev && 2144731811 * bj.ai == 4) && 1898873515 * bj.ao >= 765 + -1776792799 * ag - 50 && bj.as * -1909429297 >= 453) {
            re.vt.au(!re.vt.ar((byte)1), -18221790);
            if (!re.vt.ar((byte)1)) {
               ArrayList var3 = new ArrayList();
               var3.add(new ns(hg.fe, "scape main", "", 255, false));
               gg.am(var3, 0, 0, 0, 100, false, (byte)37);
            } else {
               ly.ax(0, 0, (byte)64);
            }

            bo.ar((byte)-37);
         }

         if (5 != -941305067 * client.dt) {
            if (-1L == di * -6098580745384794823L) {
               di = (hf.ac(-1598214665) + 1000L) * 7279498726138968329L;
            }

            long var24 = hf.ac(-1598214665);
            boolean var5;
            if (client.wz != null && client.we * 1275318517 < client.wz.size()) {
               while(true) {
                  if (1275318517 * client.we >= client.wz.size()) {
                     var5 = true;
                     break;
                  }

                  dw var6 = (dw)client.wz.get(client.we * 1275318517);
                  if (!var6.ac(29187641)) {
                     var5 = false;
                     break;
                  }

                  client.we += 1010719581;
               }
            } else {
               var5 = true;
            }

            if (var5 && -1L == da * -5579989597765027495L) {
               da = 1080920665870794473L * var24;
               if (-5579989597765027495L * da > di * -6098580745384794823L) {
                  di = 7965531057716696353L * da;
               }
            }

            if (-941305067 * client.dt == 10 || -941305067 * client.dt == 11) {
               if (dn.cy == px.ac) {
                  if (1 == bj.ai * 2144731811 || !ei.ev && 2144731811 * bj.ai == 4) {
                     var27 = 5 + ag * -1776792799;
                     short var7 = 463;
                     byte var8 = 100;
                     byte var9 = 35;
                     if (bj.ao * 1898873515 >= var27 && 1898873515 * bj.ao <= var8 + var27 && bj.as * -1909429297 >= var7 && -1909429297 * bj.as <= var7 + var9) {
                        if (gz.ac(-1614407905)) {
                           dk = true;
                           dh = 0;
                           dm = 0;
                        }

                        return;
                     }
                  }

                  if (null != hl.ar && gz.ac(1130746798)) {
                     dk = true;
                     dh = 0;
                     dm = 0;
                  }
               }

               var27 = bj.ai * 2144731811;
               var28 = 1898873515 * bj.ao;
               var29 = -1909429297 * bj.as;
               if (var27 == 0) {
                  var28 = bj.al * -840136299;
                  var29 = bj.ad * -1213769803;
               }

               if (!ei.ev && 4 == var27) {
                  var27 = 1;
               }

               kh var30 = client.ss;
               kh var10 = var30;
               int var35;
               short var36;
               if (0 == -1220996517 * cn) {
                  boolean var52 = false;

                  while(var10.ab((byte)84)) {
                     if (585229647 * var10.ab == 84) {
                        var52 = true;
                     }
                  }

                  var35 = oe.av * 2045762615 - 80;
                  var36 = 291;
                  if (var27 == 1 && var28 >= var35 - 75 && var28 <= var35 + 75 && var29 >= var36 - 20 && var29 <= var36 + 20) {
                     ia.ac(ng.of("secure", true, (byte)-47) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, -1087884688);
                  }

                  var35 = 2045762615 * oe.av + 80;
                  if (1 == var27 && var28 >= var35 - 75 && var28 <= var35 + 75 && var29 >= var36 - 20 && var29 <= 20 + var36 || var52) {
                     hw.au(1134003073);
                  }
               } else {
                  short var12;
                  if (cn * -1220996517 == 1) {
                     while(true) {
                        if (!var10.ab((byte)-101)) {
                           var11 = oe.av * 2045762615 - 80;
                           var12 = 321;
                           if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                              ks.ah(false, -1104688225);
                           }

                           var11 = 80 + oe.av * 2045762615;
                           if (1 == var27 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                              cw.ao(0, 842742876);
                           }
                           break;
                        }

                        if (585229647 * var10.ab == 84) {
                           ks.ah(false, -1170953690);
                        } else if (13 == var10.ab * 585229647) {
                           cw.ao(0, 2031340320);
                        }
                     }
                  } else {
                     int var15;
                     int var16;
                     short var33;
                     if (-1220996517 * cn == 2) {
                        var33 = 201;
                        var11 = var33 + 52;
                        if (1 == var27 && var29 >= var11 - 12 && var29 < var11 + 2) {
                           dp = 0;
                        }

                        var11 += 15;
                        if (var27 == 1 && var29 >= var11 - 12 && var29 < var11 + 2) {
                           dp = 2125340503;
                        }

                        var11 += 15;
                        var33 = 361;
                        if (ch.be != null) {
                           var35 = ch.be.ag * 392803297 / 2;
                           if (1 == var27 && var28 >= 1553874907 * ch.be.ac - var35 && var28 <= 1553874907 * ch.be.ac + var35 && var29 >= var33 - 15 && var29 < var33) {
                              switch(-1783522205 * bq) {
                              case 1:
                                 ia.ac(ok.mf, true, false, -1534880776);
                                 return;
                              case 2:
                                 ia.ac("https://support.runescape.com/hc/en-gb", true, false, -926431377);
                              }
                           }
                        }

                        var35 = oe.av * 2045762615 - 80;
                        var36 = 321;
                        if (1 == var27 && var28 >= var35 - 75 && var28 <= 75 + var35 && var29 >= var36 - 20 && var29 <= 20 + var36) {
                           bf.at(1874685044);
                           return;
                        }

                        var35 = 80 + 1359998811 * aj + 180;
                        if (var27 == 1 && var28 >= var35 - 75 && var28 <= 75 + var35 && var29 >= var36 - 20 && var29 <= 20 + var36) {
                           cw.ao(0, 187096388);
                           cj = "";
                           cx = "";
                           ch.cd = 0;
                           px.ce = "";
                           ck = true;
                        }

                        var35 = -117 + oe.av * 2045762615;
                        var36 = 277;
                        cp = var28 >= var35 && var28 < var35 + ci.ca * 403949235 && var29 >= var36 && var29 < mq.cs * -1837050101 + var36;
                        if (var27 == 1 && cp) {
                           client.hn = !client.hn;
                           if (!client.hn && re.vt.an(-1629013868) != null) {
                              re.vt.aw((String)null, -1500207798);
                           }
                        }

                        var35 = 24 + oe.av * 2045762615;
                        var36 = 277;
                        cb = var28 >= var35 && var28 < 403949235 * ci.ca + var35 && var29 >= var36 && var29 < mq.cs * -1837050101 + var36;
                        if (1 == var27 && cb) {
                           re.vt.af(!re.vt.at(460599089), (byte)-12);
                           if (!re.vt.at(1475492505)) {
                              cj = "";
                              re.vt.aw((String)null, -1500207798);
                              ev.aq((byte)1);
                           }
                        }

                        label1171:
                        while(true) {
                           Transferable var50;
                           do {
                              while(true) {
                                 label1135:
                                 do {
                                    while(true) {
                                       while(var10.ab((byte)-80)) {
                                          if (13 != var10.ab * 585229647) {
                                             if (-1584448409 * dp != 0) {
                                                continue label1135;
                                             }

                                             char var39 = var10.ap;

                                             for(var15 = 0; var15 < df.length() && var39 != df.charAt(var15); ++var15) {
                                             }

                                             if (85 == 585229647 * var10.ab && cj.length() > 0) {
                                                cj = cj.substring(0, cj.length() - 1);
                                             }

                                             if (84 == var10.ab * 585229647 || 80 == 585229647 * var10.ab) {
                                                dp = 2125340503;
                                             }

                                             char var46 = var10.ap;
                                             boolean var47 = df.indexOf(var46) != -1;
                                             if (var47 && cj.length() < 320) {
                                                cj = cj + var10.ap;
                                             }
                                          } else {
                                             cw.ao(0, 387368016);
                                             cj = "";
                                             cx = "";
                                             ch.cd = 0;
                                             px.ce = "";
                                             ck = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(dp * -1584448409 != 1);

                                 if (585229647 * var10.ab == 85 && cx.length() > 0) {
                                    cx = cx.substring(0, cx.length() - 1);
                                 } else if (585229647 * var10.ab == 84 || 80 == var10.ab * 585229647) {
                                    dp = 0;
                                    if (84 == var10.ab * 585229647) {
                                       bf.at(2030172611);
                                       return;
                                    }
                                 }

                                 if ((var10.aa(82, 1770128204) || var10.aa(87, 1770128204)) && var10.ab * 585229647 == 67) {
                                    Clipboard var44 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var50 = var44.getContents(ae.be);
                                    var16 = 20 - cx.length();
                                    break;
                                 }

                                 if (dy.ag(var10.ap, -318379847)) {
                                    char var49 = var10.ap;
                                    var37 = df.indexOf(var49) != -1;
                                    if (var37 && cx.length() < 20) {
                                       cx = cx + var10.ap;
                                    }
                                 }
                              }
                           } while(var16 <= 0);

                           try {
                              String var48 = (String)var50.getTransferData(DataFlavor.stringFlavor);
                              int var18 = Math.min(var16, var48.length());
                              int var19 = 0;

                              while(true) {
                                 if (var19 >= var18) {
                                    cx = cx + var48.substring(0, var18);
                                    continue label1171;
                                 }

                                 if (!dy.ag(var48.charAt(var19), -226325424)) {
                                    break;
                                 }

                                 char var21 = var48.charAt(var19);
                                 boolean var20 = df.indexOf(var21) != -1;
                                 if (!var20) {
                                    break;
                                 }

                                 ++var19;
                              }

                              cw.ao(3, 1195089427);
                              return;
                           } catch (UnsupportedFlavorException var22) {
                           } catch (IOException var23) {
                           }
                        }
                     } else {
                        qy var13;
                        if (-1220996517 * cn == 3) {
                           var11 = aj * 1359998811 + 180;
                           var12 = 241;
                           var13 = var1.aa(25, ok.ki.length() - 34, ok.ki, var11, var12);
                           if (1 == var27 && var13.ag(var28, var29, -1515453811)) {
                              ia.ac(ok.me, true, false, -960427674);
                           }

                           var11 = aj * 1359998811 + 180;
                           var12 = 276;
                           if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                              fm.ap(false, -1574123362);
                           }

                           var11 = aj * 1359998811 + 180;
                           var12 = 326;
                           if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                              ia.ac(ok.mf, true, false, -988078538);
                              return;
                           }
                        } else {
                           int var14;
                           if (-1220996517 * cn == 4) {
                              var11 = 1359998811 * aj + 180 - 80;
                              var12 = 321;
                              if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                 px.ce.trim();
                                 if (px.ce.length() != 6) {
                                    aa(ok.bl, ok.bz, ok.bu, (byte)-63);
                                 } else {
                                    ch.cd = Integer.parseInt(px.ce) * -103318219;
                                    px.ce = "";
                                    gs.iz(true, (byte)1);
                                    aa(ok.im, ok.in, ok.ic, (byte)63);
                                    ry.hp(20, 1394316126);
                                 }

                                 return;
                              }

                              if (var27 == 1 && var28 >= aj * 1359998811 + 180 - 9 && var28 <= 130 + aj * 1359998811 + 180 && var29 >= 263 && var29 <= 296) {
                                 ck = !ck;
                              }

                              if (1 == var27 && var28 >= 1359998811 * aj + 180 - 34 && var28 <= 34 + aj * 1359998811 + 180 && var29 >= 351 && var29 <= 363) {
                                 ia.ac(ok.mf, true, false, -1944957393);
                              }

                              var11 = 80 + 180 + aj * 1359998811;
                              if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                 cw.ao(0, -396104980);
                                 cj = "";
                                 cx = "";
                                 ch.cd = 0;
                                 px.ce = "";
                              }

                              while(var10.ab((byte)-2)) {
                                 boolean var34 = false;

                                 for(var14 = 0; var14 < dv.length(); ++var14) {
                                    if (var10.ap == dv.charAt(var14)) {
                                       var34 = true;
                                       break;
                                    }
                                 }

                                 if (13 == var10.ab * 585229647) {
                                    cw.ao(0, 1310648771);
                                    cj = "";
                                    cx = "";
                                    ch.cd = 0;
                                    px.ce = "";
                                 } else {
                                    if (var10.ab * 585229647 == 85 && px.ce.length() > 0) {
                                       px.ce = px.ce.substring(0, px.ce.length() - 1);
                                    }

                                    if (var10.ab * 585229647 == 84) {
                                       px.ce.trim();
                                       if (px.ce.length() != 6) {
                                          aa(ok.bl, ok.bz, ok.bu, (byte)69);
                                       } else {
                                          ch.cd = Integer.parseInt(px.ce) * -103318219;
                                          px.ce = "";
                                          gs.iz(true, (byte)1);
                                          aa(ok.im, ok.in, ok.ic, (byte)-6);
                                          ry.hp(20, 1105664371);
                                       }

                                       return;
                                    }

                                    if (var34 && px.ce.length() < 6) {
                                       px.ce = px.ce + var10.ap;
                                    }
                                 }
                              }
                           } else if (5 == cn * -1220996517) {
                              var11 = aj * 1359998811 + 180 - 80;
                              var12 = 321;
                              if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                 er.ab((byte)4);
                                 return;
                              }

                              var11 = aj * 1359998811 + 180 + 80;
                              if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                 ks.ah(true, -1540817243);
                              }

                              var36 = 361;
                              if (null != cr.bc) {
                                 var14 = cr.bc.ag * 392803297 / 2;
                                 if (1 == var27 && var28 >= cr.bc.ac * 1553874907 - var14 && var28 <= var14 + cr.bc.ac * 1553874907 && var29 >= var36 - 15 && var29 < var36) {
                                    ia.ac(ng.of("secure", true, (byte)-117) + "m=weblogin/g=oldscape/cant_log_in", true, false, -1247798285);
                                 }
                              }

                              while(var10.ab((byte)87)) {
                                 var37 = false;

                                 for(var15 = 0; var15 < df.length(); ++var15) {
                                    if (var10.ap == df.charAt(var15)) {
                                       var37 = true;
                                       break;
                                    }
                                 }

                                 if (var10.ab * 585229647 == 13) {
                                    ks.ah(true, -1035435249);
                                 } else {
                                    if (85 == 585229647 * var10.ab && cj.length() > 0) {
                                       cj = cj.substring(0, cj.length() - 1);
                                    }

                                    if (585229647 * var10.ab == 84) {
                                       er.ab((byte)4);
                                       return;
                                    }

                                    if (var37 && cj.length() < 320) {
                                       cj = cj + var10.ap;
                                    }
                                 }
                              }
                           } else if (-1220996517 * cn != 6) {
                              if (7 == cn * -1220996517) {
                                 if (ak.dx && !client.cz) {
                                    var11 = 2045762615 * oe.av - 150;
                                    var35 = 40 + 240 + var11 + 25;
                                    var36 = 231;
                                    var14 = var36 + 40;
                                    if (var27 == 1 && var28 >= var11 && var28 <= var35 && var29 >= var36 && var29 <= var14) {
                                       var16 = var11;
                                       int var17 = 0;

                                       while(true) {
                                          if (var17 >= 8) {
                                             var15 = 0;
                                             break;
                                          }

                                          if (var28 <= var16 + 30) {
                                             var15 = var17;
                                             break;
                                          }

                                          var16 += 30;
                                          var16 += var17 != 1 && var17 != 3 ? 5 : 20;
                                          ++var17;
                                       }

                                       cy = -114854799 * var15;
                                    }

                                    var15 = 180 + aj * 1359998811 - 80;
                                    short var40 = 321;
                                    boolean var45;
                                    if (var27 == 1 && var28 >= var15 - 75 && var28 <= 75 + var15 && var29 >= var40 - 20 && var29 <= 20 + var40) {
                                       var45 = fw.ar(551539003);
                                       if (var45) {
                                          ry.hp(50, 1977452617);
                                          return;
                                       }
                                    }

                                    var15 = 80 + 180 + aj * 1359998811;
                                    if (1 == var27 && var28 >= var15 - 75 && var28 <= var15 + 75 && var29 >= var40 - 20 && var29 <= 20 + var40) {
                                       co = new String[8];
                                       ks.ah(true, -2083046763);
                                    }

                                    while(var10.ab((byte)-20)) {
                                       if (var10.ab * 585229647 == 101) {
                                          co[cy * 2016267409] = null;
                                       }

                                       if (585229647 * var10.ab == 85) {
                                          if (co[cy * 2016267409] == null && 2016267409 * cy > 0) {
                                             cy -= -114854799;
                                          }

                                          co[cy * 2016267409] = null;
                                       }

                                       if (var10.ap >= '0' && var10.ap <= '9') {
                                          co[2016267409 * cy] = "" + var10.ap;
                                          if (cy * 2016267409 < 7) {
                                             cy += -114854799;
                                          }
                                       }

                                       if (585229647 * var10.ab == 84) {
                                          var45 = fw.ar(1586913267);
                                          if (var45) {
                                             ry.hp(50, 1102526094);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var11 = 1359998811 * aj + 180 - 80;
                                    var12 = 321;
                                    if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                       ia.ac(ng.of("secure", true, (byte)-23) + "m=dob/set_dob.ws", true, false, -905479337);
                                       aa(ok.kb, ok.kz, ok.kl, (byte)38);
                                       cw.ao(6, -153797969);
                                       return;
                                    }

                                    var11 = 180 + aj * 1359998811 + 80;
                                    if (1 == var27 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                       ks.ah(true, -1164828474);
                                    }
                                 }
                              } else if (cn * -1220996517 == 8) {
                                 var11 = 1359998811 * aj + 180 - 80;
                                 var12 = 321;
                                 if (1 == var27 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    ia.ac("https://www.jagex.com/terms/privacy", true, false, -1310210560);
                                    aa(ok.kb, ok.kz, ok.kl, (byte)83);
                                    cw.ao(6, -32256481);
                                    return;
                                 }

                                 var11 = 80 + 180 + aj * 1359998811;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ks.ah(true, -1102805817);
                                 }
                              } else if (cn * -1220996517 == 9) {
                                 var11 = 180 + aj * 1359998811;
                                 var12 = 311;
                                 if (84 == var30.ab * 585229647 || 13 == 585229647 * var30.ab || 1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    fm.ap(false, -1964065523);
                                 }
                              } else if (cn * -1220996517 == 10) {
                                 var11 = aj * 1359998811 + 180;
                                 var12 = 209;
                                 if (585229647 * var30.ab == 84 || var27 == 1 && var28 >= var11 - 109 && var28 <= var11 + 109 && var29 >= var12 && var29 <= 68 + var12) {
                                    aa(ok.im, ok.in, ok.ic, (byte)40);
                                    client.ga = vg.ae;
                                    gs.iz(false, (byte)1);
                                    ry.hp(20, 2017081413);
                                 }
                              } else if (cn * -1220996517 == 12) {
                                 var11 = oe.av * 2045762615;
                                 var12 = 233;
                                 var13 = var2.aa(0, 30, ok.lt, var11, var12);
                                 qy var38 = var2.aa(32, 32, ok.lt, var11, var12);
                                 qy var41 = var2.aa(70, 34, ok.lt, var11, var12);
                                 var35 = var12 + 17;
                                 qy var42 = var2.aa(0, 34, ok.lj, var11, var35);
                                 if (var27 == 1) {
                                    if (var13.ag(var28, var29, -1594849359)) {
                                       ia.ac("https://www.jagex.com/terms", true, false, -2135836782);
                                    } else if (var38.ag(var28, var29, -1960536917)) {
                                       ia.ac("https://www.jagex.com/terms/privacy", true, false, -1468070876);
                                    } else if (var41.ag(var28, var29, -1514511134) || var42.ag(var28, var29, -1900252526)) {
                                       ia.ac("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false, -1321946495);
                                    }
                                 }

                                 var11 = oe.av * 2045762615 - 80;
                                 var12 = 311;
                                 if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    dl.pn((byte)0);
                                    fm.ap(true, -1471478734);
                                 }

                                 var11 = 80 + oe.av * 2045762615;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    cn = -1058049097;
                                 }
                              } else if (13 == cn * -1220996517) {
                                 var11 = 2045762615 * oe.av;
                                 var12 = 321;
                                 if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    fm.ap(true, -1576405201);
                                 }
                              } else if (14 == cn * -1220996517) {
                                 String var43 = "";
                                 switch(bo * -1857384015) {
                                 case 0:
                                    var43 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                    break;
                                 case 1:
                                    var43 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                    break;
                                 case 2:
                                    var43 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                    break;
                                 default:
                                    ks.ah(false, -1592559956);
                                 }

                                 var35 = 180 + 1359998811 * aj;
                                 var36 = 276;
                                 if (1 == var27 && var28 >= var35 - 75 && var28 <= var35 + 75 && var29 >= var36 - 20 && var29 <= var36 + 20) {
                                    ia.ac(var43, true, false, -908627876);
                                    aa(ok.kb, ok.kz, ok.kl, (byte)-19);
                                    cw.ao(6, 10860942);
                                    return;
                                 }

                                 var35 = 180 + aj * 1359998811;
                                 var36 = 326;
                                 if (var27 == 1 && var28 >= var35 - 75 && var28 <= var35 + 75 && var29 >= var36 - 20 && var29 <= 20 + var36) {
                                    ks.ah(false, -1935988372);
                                 }
                              } else if (-1220996517 * cn == 24) {
                                 var11 = 180 + aj * 1359998811;
                                 var12 = 301;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    fm.ap(false, -1550911473);
                                 }
                              } else if (cn * -1220996517 == 32) {
                                 var11 = 180 + aj * 1359998811 - 80;
                                 var12 = 321;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    ia.ac(ng.of("secure", true, (byte)-19) + "m=dob/set_dob.ws", true, false, -1156093587);
                                    aa(ok.kb, ok.kz, ok.kl, (byte)-66);
                                    cw.ao(6, 1438189646);
                                    return;
                                 }

                                 var11 = 80 + 180 + aj * 1359998811;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ks.ah(true, -1155562458);
                                 }
                              } else if (cn * -1220996517 == 33) {
                                 var11 = aj * 1359998811 + 180;
                                 var12 = 276;
                                 if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ia.ac(ok.me, true, false, -896099377);
                                 }

                                 var11 = aj * 1359998811 + 180;
                                 var12 = 326;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ks.ah(true, -1961530080);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var10.ab((byte)-71)) {
                                       var33 = 321;
                                       if (var27 == 1 && var29 >= var33 - 20 && var29 <= var33 + 20) {
                                          ks.ah(true, -1167714735);
                                       }

                                       return;
                                    }
                                 } while(var10.ab * 585229647 != 84 && 13 != 585229647 * var10.ab);

                                 ks.ah(true, -1730699202);
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   static void bc() {
      cj = cj.trim();
      if (cj.length() == 0) {
         aa(ok.kv, ok.ke, ok.ko, (byte)-58);
      } else {
         long var1 = jl.ac(-403784714);
         int var0;
         if (0L == var1) {
            var0 = 5;
         } else {
            var0 = pg.ae(var1, cj, (byte)-104);
         }

         switch(var0) {
         case 2:
            aa(ok.kw, ok.kq, ok.ky, (byte)23);
            cw.ao(6, 1344648199);
            break;
         case 3:
            aa(ok.ld, ok.lb, ok.lu, (byte)-64);
            break;
         case 4:
            aa(ok.lv, ok.lz, ok.ll, (byte)-13);
            break;
         case 5:
            aa(ok.lq, ok.le, ok.la, (byte)-43);
            break;
         case 6:
            aa(ok.ln, ok.lp, ok.lc, (byte)-24);
            break;
         case 7:
            aa(ok.ls, ok.lx, ok.lr, (byte)-37);
         }

      }
   }

   static void bb(ba var0, qu var1, qu var2) {
      int var11;
      int var27;
      int var28;
      int var29;
      boolean var37;
      if (dk) {
         kh var25 = client.ss;
         kh var4 = var25;

         while(true) {
            if (!var4.ab((byte)-88)) {
               if (bj.ai * 2144731811 != 1 && (ei.ev || bj.ai * -471724219 != 4)) {
                  break;
               }

               int var26 = 280 + -1776792799 * ag;
               if (bj.ao * 1898873515 >= var26 && bj.ao * -1051547583 <= var26 + 14 && bj.as * -28670114 >= 4 && -338754436 * bj.as <= 18) {
                  fm.ae(0, 0, 234253922);
                  break;
               }

               if (bj.ao * 1463262006 >= var26 + 15 && 1898873515 * bj.ao <= 216523144 + var26 && bj.as * 1616881064 >= 4 && 806533920 * bj.as <= 18) {
                  fm.ae(0, 1, 234253922);
                  break;
               }

               var27 = -396193249 + ag * -1776792799;
               if (907655798 * bj.ao >= var27 && 240689839 * bj.ao <= 14 + var27 && 769402425 * bj.as >= 4 && -2050097536 * bj.as <= 18) {
                  fm.ae(1, 0, 234253922);
                  break;
               }

               if (bj.ao * -961519545 >= 15 + var27 && bj.ao * -16649169 <= 25656385 + var27 && bj.as * -1909429297 >= 4 && bj.as * -344507415 <= 18) {
                  fm.ae(1, 1, 234253922);
                  break;
               }

               var28 = -1776792799 * ag + 500;
               if (-1364796968 * bj.ao >= var28 && 638939462 * bj.ao <= var28 + 14 && bj.as * 1892645940 >= 4 && bj.as * 1161237311 <= 18) {
                  fm.ae(2, 0, 234253922);
                  break;
               }

               if (bj.ao * 1898873515 >= var28 + 15 && bj.ao * 1898873515 <= var28 + 80 && bj.as * -1909429297 >= 4 && -1909429297 * bj.as <= 18) {
                  fm.ae(2, 1, 234253922);
                  break;
               }

               var29 = ag * -853422419 + 1193620225;
               if (1898873515 * bj.ao >= var29 && -769856876 * bj.ao <= 14 + var29 && bj.as * -1909429297 >= 4 && 1394654263 * bj.as <= 18) {
                  fm.ae(3, 0, 234253922);
                  break;
               }

               if (1898873515 * bj.ao >= var29 + 15 && 1898873515 * bj.ao <= 1847066421 + var29 && bj.as * 806209697 >= 4 && -194285913 * bj.as <= 18) {
                  fm.ae(3, 1, 234253922);
                  break;
               }

               if (bj.ao * -1315676483 >= 21993976 + -763869336 * ag && bj.as * -1909429297 >= 4 && bj.ao * 1898873515 <= 50 + 708 + -1776792799 * ag && bj.as * -1909429297 <= 20) {
                  dk = false;
                  ma.au.al(-1776792799 * ag, 0);
                  lg.ar.al(382 + -919897489 * ag, 0);
                  ey.al.ag(ag * 2073771191 + 382 - ey.al.ag / 2, 18);
                  break;
               }

               if (-1 != do * -1268280934) {
                  cr var31 = br.ax[-999434329 * do];
                  var11 = client.ch * 2145822265;
                  uk var51 = uk.aa;
                  boolean var32 = (var11 & var51.ac(-350930589)) != 0;
                  var37 = var31.al((byte)-120);
                  sz.db = var37;
                  var31.ai = var37 ? "beta" : var31.ai;
                  qq.ai(var31, 1165443274);
                  dk = false;
                  ma.au.al(885540112 * ag, 0);
                  lg.ar.al(-1149162796 + 867518316 * ag, 0);
                  ey.al.ag(1705131514 + ag * -1776792799 - ey.al.ag / 2, 18);
                  if (var37 != var32) {
                     mt.hw(1886337145);
                  }
               } else {
                  if (-1187465059 * dh > 0 && gh.dx != null && -1363438916 * bj.ao >= 0 && bj.ao * 1691085352 <= gh.dx.ag && bj.as * -1909429297 >= en.av * 608173899 / 2 - -543162928 && bj.as * -1909429297 <= -765879052 * en.av / 2 + -2016923233) {
                     dh -= -1615610806;
                  }

                  if (dh * 730208450 < dm * -450854559 && null != hg.dj && bj.ao * -606798461 >= fa.aj * 965544701 - hg.dj.ag - 5 && bj.ao * 1898873515 <= fa.aj * -1991951399 && -1909429297 * bj.as >= 608173899 * en.av / 2 - -644151623 && -1909429297 * bj.as <= 1555612479 * en.av / 2 + 50) {
                     dh += -1799261845;
                  }
               }
               break;
            }

            if (13 == var4.ab * 1617357043) {
               dk = false;
               ma.au.al(-1776792799 * ag, 0);
               lg.ar.al(485730990 + -1776792799 * ag, 0);
               ey.al.ag(-1378786067 * ag + -199524913 - ey.al.ag / 2, 18);
               break;
            }

            if (96 == 1599628793 * var4.ab) {
               if (dh * -1187465059 > 0 && gh.dx != null) {
                  dh -= 1659080117;
               }
            } else if (var4.ab * -2101669299 == 97 && dh * -1187465059 < dm * -759253391 && hg.dj != null) {
               dh += -710368170;
            }
         }

      } else {
         if ((1 == 2144731811 * bj.ai || !ei.ev && 1839560102 * bj.ai == 4) && 1898873515 * bj.ao >= 765 + 1689990290 * ag - 50 && bj.as * -1909429297 >= -2126730774) {
            re.vt.au(!re.vt.ar((byte)1), 1576061136);
            if (!re.vt.ar((byte)1)) {
               ArrayList var3 = new ArrayList();
               var3.add(new ns(hg.fe, "scape main", "", 255, false));
               gg.am(var3, 0, 0, 0, 100, false, (byte)45);
            } else {
               ly.ax(0, 0, (byte)64);
            }

            bo.ar((byte)-31);
         }

         if (5 != 1827761698 * client.dt) {
            if (-1L == di * -6098580745384794823L) {
               di = (hf.ac(-1598214665) + 1000L) * 7279498726138968329L;
            }

            long var24 = hf.ac(-1598214665);
            boolean var5;
            if (client.wz != null && client.we * 1092421565 < client.wz.size()) {
               while(true) {
                  if (1275318517 * client.we >= client.wz.size()) {
                     var5 = true;
                     break;
                  }

                  dw var6 = (dw)client.wz.get(client.we * 813901060);
                  if (!var6.ac(597152701)) {
                     var5 = false;
                     break;
                  }

                  client.we += 1010719581;
               }
            } else {
               var5 = true;
            }

            if (var5 && -1L == da * -5579989597765027495L) {
               da = 1080920665870794473L * var24;
               if (-5579989597765027495L * da > di * -6098580745384794823L) {
                  di = 7965531057716696353L * da;
               }
            }

            if (-941305067 * client.dt == 10 || 1285953583 * client.dt == 11) {
               if (dn.cy == px.ac) {
                  if (1 == bj.ai * 2144731811 || !ei.ev && -1904924091 * bj.ai == 4) {
                     var27 = 5 + ag * -1776792799;
                     short var7 = 463;
                     byte var8 = 100;
                     byte var9 = 35;
                     if (bj.ao * -1650842800 >= var27 && -1103461225 * bj.ao <= var8 + var27 && bj.as * -1909429297 >= var7 && -1909429297 * bj.as <= var7 + var9) {
                        if (gz.ac(623301568)) {
                           dk = true;
                           dh = 0;
                           dm = 0;
                        }

                        return;
                     }
                  }

                  if (null != hl.ar && gz.ac(-1421093478)) {
                     dk = true;
                     dh = 0;
                     dm = 0;
                  }
               }

               var27 = bj.ai * 1038177466;
               var28 = 1898873515 * bj.ao;
               var29 = -1909429297 * bj.as;
               if (var27 == 0) {
                  var28 = bj.al * -1457507315;
                  var29 = bj.ad * 232410702;
               }

               if (!ei.ev && 4 == var27) {
                  var27 = 1;
               }

               kh var30 = client.ss;
               kh var10 = var30;
               int var33;
               int var36;
               if (0 == -910134755 * cn) {
                  boolean var52 = false;

                  while(var10.ab((byte)-88)) {
                     if (311431283 * var10.ab == 1364479980) {
                        var52 = true;
                     }
                  }

                  var33 = oe.av * 2045762615 - 231238105;
                  var36 = -454282021;
                  if (var27 == 1 && var28 >= var33 - 938117277 && var28 <= var33 + -1790785654 && var29 >= var36 - 20 && var29 <= var36 + 20) {
                     ia.ac(ng.of("secure", true, (byte)-38) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, -1306386822);
                  }

                  var33 = 2045762615 * oe.av + -1059773448;
                  if (1 == var27 && var28 >= var33 - 75 && var28 <= var33 + -944902948 && var29 >= var36 - 20 && var29 <= 20 + var36 || var52) {
                     hw.au(-656920505);
                  }
               } else {
                  short var12;
                  if (cn * -1217057170 == 1) {
                     while(true) {
                        if (!var10.ab((byte)-94)) {
                           var11 = oe.av * 2045762615 - 659849011;
                           var12 = 321;
                           if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                              ks.ah(false, -1265383761);
                           }

                           var11 = 1801457915 + oe.av * -1390833782;
                           if (1 == var27 && var28 >= var11 - 75 && var28 <= 1728727961 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                              cw.ao(0, 1751672178);
                           }
                           break;
                        }

                        if (585229647 * var10.ab == 84) {
                           ks.ah(false, -1050541640);
                        } else if (13 == var10.ab * -1910043507) {
                           cw.ao(0, 121045827);
                        }
                     }
                  } else {
                     int var15;
                     int var16;
                     short var34;
                     if (-201051041 * cn == 2) {
                        var34 = 201;
                        var11 = var34 + 52;
                        if (1 == var27 && var29 >= var11 - 12 && var29 < var11 + 2) {
                           dp = 0;
                        }

                        var11 += 15;
                        if (var27 == 1 && var29 >= var11 - 12 && var29 < var11 + 2) {
                           dp = 1702762160;
                        }

                        var11 += 15;
                        var34 = 361;
                        if (ch.be != null) {
                           var33 = ch.be.ag * 392803297 / 2;
                           if (1 == var27 && var28 >= 1077297717 * ch.be.ac - var33 && var28 <= -713187474 * ch.be.ac + var33 && var29 >= var34 - 15 && var29 < var34) {
                              switch(-1783522205 * bq) {
                              case 1:
                                 ia.ac(ok.mf, true, false, -1288692933);
                                 return;
                              case 2:
                                 ia.ac("https://support.runescape.com/hc/en-gb", true, false, -1750893068);
                              }
                           }
                        }

                        var33 = oe.av * 2045762615 - 80;
                        short var38 = 321;
                        if (1 == var27 && var28 >= var33 - -104684383 && var28 <= 75 + var33 && var29 >= var38 - 20 && var29 <= 20 + var38) {
                           bf.at(1739928553);
                           return;
                        }

                        var33 = 1809402364 + 231032539 * aj + 180;
                        if (var27 == 1 && var28 >= var33 - 75 && var28 <= 75 + var33 && var29 >= var38 - 20 && var29 <= 20 + var38) {
                           cw.ao(0, 572658253);
                           cj = "";
                           cx = "";
                           ch.cd = 0;
                           px.ce = "";
                           ck = true;
                        }

                        var33 = 483317353 + oe.av * 2045762615;
                        var36 = 841860326;
                        cp = var28 >= var33 && var28 < var33 + ci.ca * 1283867662 && var29 >= var36 && var29 < mq.cs * -707494817 + var36;
                        if (var27 == 1 && cp) {
                           client.hn = !client.hn;
                           if (!client.hn && re.vt.an(900027273) != null) {
                              re.vt.aw((String)null, -1500207798);
                           }
                        }

                        var33 = 24 + oe.av * 2045762615;
                        var38 = 277;
                        cb = var28 >= var33 && var28 < 38971359 * ci.ca + var33 && var29 >= var38 && var29 < mq.cs * 196273097 + var38;
                        if (1 == var27 && cb) {
                           re.vt.af(!re.vt.at(-888859913), (byte)-66);
                           if (!re.vt.at(1527999137)) {
                              cj = "";
                              re.vt.aw((String)null, -1500207798);
                              ev.aq((byte)1);
                           }
                        }

                        label1171:
                        while(true) {
                           Transferable var50;
                           do {
                              while(true) {
                                 label1135:
                                 do {
                                    while(true) {
                                       while(var10.ab((byte)-92)) {
                                          if (13 != var10.ab * 585229647) {
                                             if (-1584448409 * dp != 0) {
                                                continue label1135;
                                             }

                                             char var40 = var10.ap;

                                             for(var15 = 0; var15 < df.length() && var40 != df.charAt(var15); ++var15) {
                                             }

                                             if (-1590215608 == 496032823 * var10.ab && cj.length() > 0) {
                                                cj = cj.substring(0, cj.length() - 1);
                                             }

                                             if (1984080882 == var10.ab * 163522329 || -1268873644 == 585229647 * var10.ab) {
                                                dp = -88603519;
                                             }

                                             char var46 = var10.ap;
                                             boolean var47 = df.indexOf(var46) != -1;
                                             if (var47 && cj.length() < -1320493756) {
                                                cj = cj + var10.ap;
                                             }
                                          } else {
                                             cw.ao(0, 503270149);
                                             cj = "";
                                             cx = "";
                                             ch.cd = 0;
                                             px.ce = "";
                                             ck = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(dp * -1584448409 != 1);

                                 if (585229647 * var10.ab == 1450345282 && cx.length() > 0) {
                                    cx = cx.substring(0, cx.length() - 1);
                                 } else if (585229647 * var10.ab == 84 || 1730441944 == var10.ab * -1690043827) {
                                    dp = 0;
                                    if (335146332 == var10.ab * -904469076) {
                                       bf.at(1754836141);
                                       return;
                                    }
                                 }

                                 if ((var10.aa(1949018880, 1770128204) || var10.aa(148895883, 1770128204)) && var10.ab * -2047131097 == -326688448) {
                                    Clipboard var44 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var50 = var44.getContents(ae.be);
                                    var16 = 20 - cx.length();
                                    break;
                                 }

                                 if (dy.ag(var10.ap, -1812529366)) {
                                    char var49 = var10.ap;
                                    var37 = df.indexOf(var49) != -1;
                                    if (var37 && cx.length() < 20) {
                                       cx = cx + var10.ap;
                                    }
                                 }
                              }
                           } while(var16 <= 0);

                           try {
                              String var48 = (String)var50.getTransferData(DataFlavor.stringFlavor);
                              int var18 = Math.min(var16, var48.length());
                              int var19 = 0;

                              while(true) {
                                 if (var19 >= var18) {
                                    cx = cx + var48.substring(0, var18);
                                    continue label1171;
                                 }

                                 if (!dy.ag(var48.charAt(var19), -525230972)) {
                                    break;
                                 }

                                 char var21 = var48.charAt(var19);
                                 boolean var20 = df.indexOf(var21) != -1;
                                 if (!var20) {
                                    break;
                                 }

                                 ++var19;
                              }

                              cw.ao(3, 2116921566);
                              return;
                           } catch (UnsupportedFlavorException var22) {
                           } catch (IOException var23) {
                           }
                        }
                     } else {
                        qy var13;
                        if (446115303 * cn == 3) {
                           var11 = aj * 1359998811 + 180;
                           var12 = 241;
                           var13 = var1.aa(25, ok.ki.length() - 34, ok.ki, var11, var12);
                           if (1 == var27 && var13.ag(var28, var29, -1623346469)) {
                              ia.ac(ok.me, true, false, -1933369410);
                           }

                           var11 = aj * 1214213180 + -2034496929;
                           var12 = 276;
                           if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 1190077566 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                              fm.ap(false, -1861521355);
                           }

                           var11 = aj * 1359998811 + -1396098532;
                           var33 = -442129287;
                           if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var33 - 20 && var29 <= 20 + var33) {
                              ia.ac(ok.mf, true, false, -2009756009);
                              return;
                           }
                        } else {
                           int var14;
                           if (374587944 * cn == 4) {
                              var11 = -1309286025 * aj + 180 - -1060132526;
                              var12 = 321;
                              if (var27 == 1 && var28 >= var11 - 75 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                 px.ce.trim();
                                 if (px.ce.length() != 6) {
                                    aa(ok.bl, ok.bz, ok.bu, (byte)27);
                                 } else {
                                    ch.cd = Integer.parseInt(px.ce) * -103318219;
                                    px.ce = "";
                                    gs.iz(true, (byte)1);
                                    aa(ok.im, ok.in, ok.ic, (byte)67);
                                    ry.hp(20, 2084176787);
                                 }

                                 return;
                              }

                              if (var27 == 1 && var28 >= aj * 1919321190 + 180 - 9 && var28 <= -1580528574 + aj * 1154448188 + 180 && var29 >= 305353562 && var29 <= 296) {
                                 ck = !ck;
                              }

                              if (1 == var27 && var28 >= 1359998811 * aj + 180 - -1355399656 && var28 <= 34 + aj * -1794326929 + 180 && var29 >= 770181487 && var29 <= 365858429) {
                                 ia.ac(ok.mf, true, false, -1969585600);
                              }

                              var11 = -1342591702 + -1561338996 + aj * 1359998811;
                              if (var27 == 1 && var28 >= var11 - -1355336551 && var28 <= 1507806166 + var11 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                 cw.ao(0, 61355604);
                                 cj = "";
                                 cx = "";
                                 ch.cd = 0;
                                 px.ce = "";
                              }

                              while(var10.ab((byte)-99)) {
                                 boolean var35 = false;

                                 for(var14 = 0; var14 < dv.length(); ++var14) {
                                    if (var10.ap == dv.charAt(var14)) {
                                       var35 = true;
                                       break;
                                    }
                                 }

                                 if (13 == var10.ab * 585229647) {
                                    cw.ao(0, 1684744921);
                                    cj = "";
                                    cx = "";
                                    ch.cd = 0;
                                    px.ce = "";
                                 } else {
                                    if (var10.ab * 988408659 == -1315746173 && px.ce.length() > 0) {
                                       px.ce = px.ce.substring(0, px.ce.length() - 1);
                                    }

                                    if (var10.ab * 585229647 == 84) {
                                       px.ce.trim();
                                       if (px.ce.length() != 6) {
                                          aa(ok.bl, ok.bz, ok.bu, (byte)-13);
                                       } else {
                                          ch.cd = Integer.parseInt(px.ce) * -103318219;
                                          px.ce = "";
                                          gs.iz(true, (byte)1);
                                          aa(ok.im, ok.in, ok.ic, (byte)-41);
                                          ry.hp(20, 1071820155);
                                       }

                                       return;
                                    }

                                    if (var35 && px.ce.length() < 6) {
                                       px.ce = px.ce + var10.ap;
                                    }
                                 }
                              }
                           } else if (5 == cn * -1220996517) {
                              var11 = aj * 244335466 + 180 - 80;
                              var33 = -1236273929;
                              if (1 == var27 && var28 >= var11 - 75 && var28 <= var11 + -605060736 && var29 >= var33 - 20 && var29 <= 20 + var33) {
                                 er.ab((byte)4);
                                 return;
                              }

                              var11 = aj * 1359998811 + 180 + 252261220;
                              if (var27 == 1 && var28 >= var11 - -449229977 && var28 <= var11 + 299812060 && var29 >= var33 - 20 && var29 <= var33 + 20) {
                                 ks.ah(true, -1350670458);
                              }

                              var36 = 1448968652;
                              if (null != cr.bc) {
                                 var14 = cr.bc.ag * 392803297 / 2;
                                 if (1 == var27 && var28 >= cr.bc.ac * 1533328313 - var14 && var28 <= var14 + cr.bc.ac * 1538527912 && var29 >= var36 - 15 && var29 < var36) {
                                    ia.ac(ng.of("secure", true, (byte)-85) + "m=weblogin/g=oldscape/cant_log_in", true, false, -1536132080);
                                 }
                              }

                              while(var10.ab((byte)-49)) {
                                 var37 = false;

                                 for(var15 = 0; var15 < df.length(); ++var15) {
                                    if (var10.ap == df.charAt(var15)) {
                                       var37 = true;
                                       break;
                                    }
                                 }

                                 if (var10.ab * -1351513986 == 13) {
                                    ks.ah(true, -1067355737);
                                 } else {
                                    if (-1559738809 == 442548812 * var10.ab && cj.length() > 0) {
                                       cj = cj.substring(0, cj.length() - 1);
                                    }

                                    if (-715172978 * var10.ab == 84) {
                                       er.ab((byte)4);
                                       return;
                                    }

                                    if (var37 && cj.length() < 320) {
                                       cj = cj + var10.ap;
                                    }
                                 }
                              }
                           } else if (-773330847 * cn != 6) {
                              if (7 == cn * -1220996517) {
                                 if (ak.dx && !client.cz) {
                                    var11 = 2045762615 * oe.av - 150;
                                    var33 = 40 + 1651576521 + var11 + 25;
                                    var36 = 922296642;
                                    var14 = var36 + 40;
                                    if (var27 == 1 && var28 >= var11 && var28 <= var33 && var29 >= var36 && var29 <= var14) {
                                       var16 = var11;
                                       int var17 = 0;

                                       while(true) {
                                          if (var17 >= 8) {
                                             var15 = 0;
                                             break;
                                          }

                                          if (var28 <= var16 + 30) {
                                             var15 = var17;
                                             break;
                                          }

                                          var16 += 30;
                                          var16 += var17 != 1 && var17 != 3 ? 5 : 20;
                                          ++var17;
                                       }

                                       cy = 1991403802 * var15;
                                    }

                                    var15 = 180 + aj * 1430226674 - 80;
                                    var16 = 943518577;
                                    boolean var45;
                                    if (var27 == 1 && var28 >= var15 - -2032323409 && var28 <= 196421496 + var15 && var29 >= var16 - 20 && var29 <= 20 + var16) {
                                       var45 = fw.ar(-1784708936);
                                       if (var45) {
                                          ry.hp(-1586339984, 1138644122);
                                          return;
                                       }
                                    }

                                    var15 = 80 + 1109163534 + aj * -509950152;
                                    if (1 == var27 && var28 >= var15 - 75 && var28 <= var15 + 1518509420 && var29 >= var16 - 20 && var29 <= 20 + var16) {
                                       co = new String[8];
                                       ks.ah(true, -1751696538);
                                    }

                                    while(var10.ab((byte)85)) {
                                       if (var10.ab * 585229647 == 101) {
                                          co[cy * 643327318] = null;
                                       }

                                       if (585229647 * var10.ab == 85) {
                                          if (co[cy * 2016267409] == null && 2016267409 * cy > 0) {
                                             cy -= -114854799;
                                          }

                                          co[cy * 2016267409] = null;
                                       }

                                       if (var10.ap >= '0' && var10.ap <= '9') {
                                          co[-413405588 * cy] = "" + var10.ap;
                                          if (cy * 1506853499 < 7) {
                                             cy += -114854799;
                                          }
                                       }

                                       if (585229647 * var10.ab == -1508617044) {
                                          var45 = fw.ar(-1175585504);
                                          if (var45) {
                                             ry.hp(50, 1313084748);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var11 = 938638635 * aj + 180 - 1090551843;
                                    var12 = 321;
                                    if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                       ia.ac(ng.of("secure", true, (byte)-1) + "m=dob/set_dob.ws", true, false, -1948737007);
                                       aa(ok.kb, ok.kz, ok.kl, (byte)-38);
                                       cw.ao(6, -441250039);
                                       return;
                                    }

                                    var11 = 180 + aj * 830839222 + 80;
                                    if (1 == var27 && var28 >= var11 - -866401490 && var28 <= 75 + var11 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                       ks.ah(true, -1354098262);
                                    }
                                 }
                              } else if (cn * -1744467220 == 8) {
                                 var11 = 1359998811 * aj + 751108377 - 80;
                                 var12 = 321;
                                 if (1 == var27 && var28 >= var11 - 186914425 && var28 <= 1168817621 + var11 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    ia.ac("https://www.jagex.com/terms/privacy", true, false, -878964907);
                                    aa(ok.kb, ok.kz, ok.kl, (byte)-79);
                                    cw.ao(6, 51397774);
                                    return;
                                 }

                                 var11 = 80 + 180 + aj * -338794958;
                                 if (var27 == 1 && var28 >= var11 - -1447536323 && var28 <= 236718296 + var11 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ks.ah(true, -2128980701);
                                 }
                              } else if (cn * -1220996517 == 9) {
                                 var11 = -1589687905 + aj * 1359998811;
                                 var12 = 311;
                                 if (1036025420 == var30.ab * 585229647 || 13 == -551584592 * var30.ab || 1 == var27 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= 20 + var12) {
                                    fm.ap(false, -1808678449);
                                 }
                              } else if (cn * 498411399 == 10) {
                                 var11 = aj * 1359998811 + 180;
                                 var33 = 211957915;
                                 if (-1679492809 * var30.ab == 1341737188 || var27 == 1 && var28 >= var11 - 109 && var28 <= var11 + -1829039535 && var29 >= var33 && var29 <= 68 + var33) {
                                    aa(ok.im, ok.in, ok.ic, (byte)73);
                                    client.ga = vg.ae;
                                    gs.iz(false, (byte)1);
                                    ry.hp(20, 1535489873);
                                 }
                              } else if (cn * -583888784 == 12) {
                                 var11 = oe.av * 2045762615;
                                 var12 = 233;
                                 var13 = var2.aa(0, 30, ok.lt, var11, var12);
                                 qy var39 = var2.aa(-1426411922, 456070708, ok.lt, var11, var12);
                                 qy var41 = var2.aa(70, -347665721, ok.lt, var11, var12);
                                 var33 = var12 + 17;
                                 qy var42 = var2.aa(0, 962436969, ok.lj, var11, var33);
                                 if (var27 == 1) {
                                    if (var13.ag(var28, var29, -2127741035)) {
                                       ia.ac("https://www.jagex.com/terms", true, false, -1992119303);
                                    } else if (var39.ag(var28, var29, -1804198646)) {
                                       ia.ac("https://www.jagex.com/terms/privacy", true, false, -1547848152);
                                    } else if (var41.ag(var28, var29, -2141950849) || var42.ag(var28, var29, -1816794324)) {
                                       ia.ac("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false, -1013853825);
                                    }
                                 }

                                 var11 = oe.av * 745526141 - 927731192;
                                 var33 = -1857887031;
                                 if (1 == var27 && var28 >= var11 - -451509950 && var28 <= var11 + 75 && var29 >= var33 - 20 && var29 <= var33 + 20) {
                                    dl.pn((byte)0);
                                    fm.ap(true, -1493471167);
                                 }

                                 var11 = 80 + oe.av * 2045762615;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var33 - 20 && var29 <= 20 + var33) {
                                    cn = 506277383;
                                 }
                              } else if (13 == cn * -2020856734) {
                                 var11 = 2045762615 * oe.av;
                                 var12 = 321;
                                 if (1 == var27 && var28 >= var11 - -9112844 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    fm.ap(true, -1520469629);
                                 }
                              } else if (14 == cn * -1220996517) {
                                 String var43 = "";
                                 switch(bo * -1857384015) {
                                 case 0:
                                    var43 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                    break;
                                 case 1:
                                    var43 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                    break;
                                 case 2:
                                    var43 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                    break;
                                 default:
                                    ks.ah(false, -1564081111);
                                 }

                                 var33 = 180 + 1359998811 * aj;
                                 var36 = 1923889212;
                                 if (1 == var27 && var28 >= var33 - 75 && var28 <= var33 + 75 && var29 >= var36 - 20 && var29 <= var36 + 20) {
                                    ia.ac(var43, true, false, -1095743847);
                                    aa(ok.kb, ok.kz, ok.kl, (byte)-30);
                                    cw.ao(6, -310704830);
                                    return;
                                 }

                                 var33 = 180 + aj * 1996301079;
                                 var36 = 75104114;
                                 if (var27 == 1 && var28 >= var33 - 75 && var28 <= var33 + 75 && var29 >= var36 - 20 && var29 <= 20 + var36) {
                                    ks.ah(false, -1820354397);
                                 }
                              } else if (836004130 * cn == 24) {
                                 var11 = -944062255 + aj * 524493717;
                                 var12 = 301;
                                 if (var27 == 1 && var28 >= var11 - -389131129 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    fm.ap(false, -1983139744);
                                 }
                              } else if (cn * 152067814 == -819072456) {
                                 var11 = 180 + aj * -1291943263 - 80;
                                 var33 = -731016207;
                                 if (var27 == 1 && var28 >= var11 - 62163986 && var28 <= var11 + 75 && var29 >= var33 - 20 && var29 <= 20 + var33) {
                                    ia.ac(ng.of("secure", true, (byte)-68) + "m=dob/set_dob.ws", true, false, -1390720629);
                                    aa(ok.kb, ok.kz, ok.kl, (byte)-57);
                                    cw.ao(6, -401294467);
                                    return;
                                 }

                                 var11 = 80 + 436655277 + aj * 288437514;
                                 if (var27 == 1 && var28 >= var11 - 75 && var28 <= var11 + 75 && var29 >= var33 - 20 && var29 <= var33 + 20) {
                                    ks.ah(true, -1678736417);
                                 }
                              } else if (cn * -1220996517 == 33) {
                                 var11 = aj * -935325600 + 811105349;
                                 var12 = 276;
                                 if (1 == var27 && var28 >= var11 - -947890509 && var28 <= var11 + -153082742 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ia.ac(ok.me, true, false, -1798133288);
                                 }

                                 var11 = aj * 1359998811 + 257895581;
                                 var12 = 326;
                                 if (var27 == 1 && var28 >= var11 - -1445425063 && var28 <= var11 + 75 && var29 >= var12 - 20 && var29 <= var12 + 20) {
                                    ks.ah(true, -1331120060);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var10.ab((byte)-95)) {
                                       var34 = 321;
                                       if (var27 == 1 && var29 >= var34 - 20 && var29 <= var34 + 20) {
                                          ks.ah(true, -1184518867);
                                       }

                                       return;
                                    }
                                 } while(var10.ab * -754739400 != 2004572190 && 13 != 585229647 * var10.ab);

                                 ks.ah(true, -1923340829);
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   static int ay(po var0) {
      int var1 = dg.length + dz.length;
      String[] var2 = dr;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         String var4 = var2[var3];
         if (var0.cg(var4, (short)18310) != -1) {
            ++var1;
         }
      }

      return var1;
   }

   static void bi() {
      cj = cj.trim();
      if (cj.length() == 0) {
         aa(ok.ey, ok.er, ok.ed, (byte)-118);
      } else if (cx.length() == 0) {
         aa(ok.ee, ok.eq, ok.ej, (byte)-60);
      } else {
         aa(ok.im, ok.in, ok.ic, (byte)69);
         gs.iz(false, (byte)1);
         ry.hp(20, 1320789369);
      }
   }

   static void bl() {
      if ((12039691 * client.ch & uk.ak.ac(-350930589)) != 0) {
         ch = "";
         cf = ok.iy;
         cu = ok.ih;
         cm = ok.iu;
         cw.ao(1, 1637903674);
         ev.aq((byte)1);
      } else if ((client.ch * 12039691 & uk.ag.ac(-350930589)) != 0) {
         if ((client.ch * 12039691 & uk.al.ac(-350930589)) != 0) {
            cf = ok.ik;
            cu = ok.ib;
            cm = ok.ig;
         } else {
            cf = ok.ir;
            cu = ok.it;
            cm = ok.il;
         }

         ch = ok.ix;
         cw.ao(1, 845015362);
         ev.aq((byte)1);
      } else if ((client.ch * 12039691 & uk.al.ac(-350930589)) != 0) {
         cf = ok.iw;
         cu = ok.iv;
         cm = ok.io;
         ch = ok.ix;
         cw.ao(1, -404954514);
         ev.aq((byte)1);
      } else {
         ks.ah(false, -1714009799);
      }

   }

   static void cq(int var0, String var1) {
      an = var1;
      aw = -1588523016 * var0;
   }

   static Date bu() {
      Calendar var0 = Calendar.getInstance();
      var0.set(2, 0);
      var0.set(5, 1);
      var0.set(1, 1900);
      return var0.getTime();
   }

   static boolean br(Date var0) {
      Calendar var1 = Calendar.getInstance();
      var1.set(1, var1.get(1) - 13);
      var1.set(5, var1.get(5) + 1);
      var1.set(11, 0);
      var1.set(12, 0);
      var1.set(13, 0);
      var1.set(14, 0);
      Date var2 = var1.getTime();
      return var0.before(var2);
   }

   static boolean bo(Date var0) {
      Calendar var1 = Calendar.getInstance();
      var1.set(1, var1.get(1) - 13);
      var1.set(5, var1.get(5) + 1);
      var1.set(11, 0);
      var1.set(12, 0);
      var1.set(13, 0);
      var1.set(14, 0);
      Date var2 = var1.getTime();
      return var0.before(var2);
   }

   static boolean bv(Date var0) {
      Calendar var1 = Calendar.getInstance();
      var1.set(1, var1.get(1) - 13);
      var1.set(5, var1.get(5) + 1);
      var1.set(11, 0);
      var1.set(12, 0);
      var1.set(13, 0);
      var1.set(14, 0);
      Date var2 = var1.getTime();
      return var0.before(var2);
   }

   static void bt(boolean var0) {
      if (!ae.be.hr(245347311) && !ae.be.hi(-414907503) && !ae.be.hk(796936729)) {
         cf = ok.iz;
         cu = ok.ij;
         cm = ok.ip;
         cw.ao(2, 1188452773);
         if (var0) {
            cx = "";
         }

         nb.ag((byte)107);
         ev.aq((byte)1);
      } else {
         cw.ao(10, 153840199);
      }
   }

   static void bq(boolean var0) {
      byte var1 = 0;
      boolean var2 = re.vt.bn(-834307584) >= client.ct * -1888871377;
      if (!var2) {
         var1 = 12;
      } else if (ae.be.hr(245347311) || ae.be.hi(198546231) || ae.be.hk(1529419636)) {
         var1 = 10;
      }

      cw.ao(var1, 1875632097);
      if (var0) {
         cj = "";
         cx = "";
         ch.cd = 0;
         px.ce = "";
      }

      nb.ag((byte)107);
      ev.aq((byte)1);
   }

   static void bk() {
      cj = cj.trim();
      if (cj.length() == 0) {
         aa(ok.kv, ok.ke, ok.ko, (byte)18);
      } else {
         long var1 = jl.ac(-403784714);
         int var0;
         if (0L == var1) {
            var0 = 5;
         } else {
            var0 = pg.ae(var1, cj, (byte)87);
         }

         switch(var0) {
         case 2:
            aa(ok.kw, ok.kq, ok.ky, (byte)66);
            cw.ao(6, 67136995);
            break;
         case 3:
            aa(ok.ld, ok.lb, ok.lu, (byte)77);
            break;
         case 4:
            aa(ok.lv, ok.lz, ok.ll, (byte)6);
            break;
         case 5:
            aa(ok.lq, ok.le, ok.la, (byte)-12);
            break;
         case 6:
            aa(ok.ln, ok.lp, ok.lc, (byte)-84);
            break;
         case 7:
            aa(ok.ls, ok.lx, ok.lr, (byte)-18);
         }

      }
   }

   static void be() {
      cj = cj.trim();
      if (cj.length() == 0) {
         aa(ok.kv, ok.ke, ok.ko, (byte)-4);
      } else {
         long var1 = jl.ac(-403784714);
         int var0;
         if (0L == var1) {
            var0 = 5;
         } else {
            var0 = pg.ae(var1, cj, (byte)-97);
         }

         switch(var0) {
         case 2:
            aa(ok.kw, ok.kq, ok.ky, (byte)-9);
            cw.ao(6, 1332629356);
            break;
         case 3:
            aa(ok.ld, ok.lb, ok.lu, (byte)21);
            break;
         case 4:
            aa(ok.lv, ok.lz, ok.ll, (byte)-2);
            break;
         case 5:
            aa(ok.lq, ok.le, ok.la, (byte)-4);
            break;
         case 6:
            aa(ok.ln, ok.lp, ok.lc, (byte)-60);
            break;
         case 7:
            aa(ok.ls, ok.lx, ok.lr, (byte)9);
         }

      }
   }

   static void cj(String var0, String var1, String var2) {
      cf = var0;
      cu = var1;
      cm = var2;
   }

   static void ak() {
      if (null == cj || cj.length() <= 0) {
         if (re.vt.an(1125112867) != null) {
            cj = re.vt.an(-1057304581);
            client.hn = true;
         } else {
            client.hn = false;
         }

      }
   }

   static void bf() {
      if (client.hn && null != cj && cj.length() > 0) {
         dp = 1992691516;
      } else {
         dp = 0;
      }

   }

   static void aw() {
      if (null == cj || cj.length() <= 0) {
         if (re.vt.an(-694799570) != null) {
            cj = re.vt.an(1990598998);
            client.hn = true;
         } else {
            client.hn = false;
         }

      }
   }

   dp() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dp.<init>(" + ')');
      }
   }

   static void cm(String var0, String var1, String var2) {
      cf = var0;
      cu = var1;
      cm = var2;
   }

   static void cn() {
      cj = cj.trim();
      if (cj.length() == 0) {
         aa(ok.kv, ok.ke, ok.ko, (byte)13);
      } else {
         long var1 = jl.ac(-403784714);
         int var0;
         if (0L == var1) {
            var0 = 5;
         } else {
            var0 = pg.ae(var1, cj, (byte)-71);
         }

         switch(var0) {
         case 2:
            aa(ok.kw, ok.kq, ok.ky, (byte)30);
            cw.ao(6, 988468841);
            break;
         case 3:
            aa(ok.ld, ok.lb, ok.lu, (byte)16);
            break;
         case 4:
            aa(ok.lv, ok.lz, ok.ll, (byte)81);
            break;
         case 5:
            aa(ok.lq, ok.le, ok.la, (byte)-30);
            break;
         case 6:
            aa(ok.ln, ok.lp, ok.lc, (byte)-101);
            break;
         case 7:
            aa(ok.ls, ok.lx, ok.lr, (byte)-10);
         }

      }
   }

   static void cx(String var0, String var1, String var2) {
      cf = var0;
      cu = var1;
      cm = var2;
   }

   static void ci(cr var0) {
      if (var0.ar((byte)8) != client.cx) {
         client.cx = var0.ar((byte)8);
         hx.ay(var0.ar((byte)8), -379165194);
      }

      if (1582176939 * var0.ad != client.ch * 12039691) {
         hg.ax(cq.fb, -665020988 * var0.ad, -1437048922);
      }

      mx.gd = var0.ap;
      client.cn = var0.al * 81899417;
      client.ch = 1511936949 * var0.ad;
      il.hf = var0.ai;
      bf.gl = 348928395 * (0 == client.cu * -872183921 ? 76110327 : -2102573495 * var0.al + '鱀');
      lb.ge = (client.cu * 1377608198 == 0 ? -1110282169 : -584877310 + var0.al * 1790151440) * -286524173;
      ec.gb = bf.gl * -1212057239;
   }

   static void cy(cr var0) {
      if (var0.ar((byte)8) != client.cx) {
         client.cx = var0.ar((byte)8);
         hx.ay(var0.ar((byte)8), -2002301352);
      }

      if (-1525036740 * var0.ad != client.ch * 12039691) {
         hg.ax(cq.fb, 2030721230 * var0.ad, -1854713073);
      }

      mx.gd = var0.ap;
      client.cn = var0.al * 863670312;
      client.ch = 1511936949 * var0.ad;
      il.hf = var0.ai;
      bf.gl = -2068878147 * (0 == client.cu * -872183921 ? 'ꩊ' : -2102573495 * var0.al + -633886899);
      lb.ge = (client.cu * -984388075 == 0 ? -1180858484 : '썐' + var0.al * 1355154694) * -286524173;
      ec.gb = bf.gl * -1212057239;
   }

   static void co(cr var0) {
      if (var0.ar((byte)8) != client.cx) {
         client.cx = var0.ar((byte)8);
         hx.ay(var0.ar((byte)8), -1747046351);
      }

      if (1160988359 * var0.ad != client.ch * 12039691) {
         hg.ax(cq.fb, 1160988359 * var0.ad, -1445064624);
      }

      mx.gd = var0.ap;
      client.cn = var0.al * 81899417;
      client.ch = 1511936949 * var0.ad;
      il.hf = var0.ai;
      bf.gl = 417532057 * (0 == client.cu * -872183921 ? 'ꩊ' : -2102573495 * var0.al + '鱀');
      lb.ge = (client.cu * -872183921 == 0 ? 443 : '썐' + var0.al * -2102573495) * -286524173;
      ec.gb = bf.gl * -1212057239;
   }

   static void cv(int var0) {
      if (cn * -1836954727 != var0) {
         cn = var0 * 909757907;
      }
   }

   static void cg(int var0) {
      if (cn * -1970900859 != var0) {
         cn = var0 * 909757907;
      }
   }

   static void ct(int var0, String var1) {
      an = var1;
      aw = 1269417315 * var0;
   }

   public static String al(String var0, int var1) {
      try {
         StringBuilder var2 = new StringBuilder(var0.length());
         int var3 = 0;
         int var4 = -1;

         for(int var5 = 0; var5 < var0.length(); ++var5) {
            if (var1 != 1431655680) {
               throw new IllegalStateException();
            }

            char var6 = var0.charAt(var5);
            if (var6 == '<') {
               if (var1 != 1431655680) {
                  throw new IllegalStateException();
               }

               var2.append(var0.substring(var3, var5));
               var4 = var5;
            } else if ('>' == var6) {
               if (var1 != 1431655680) {
                  throw new IllegalStateException();
               }

               if (var4 != -1) {
                  if (var1 != 1431655680) {
                     throw new IllegalStateException();
                  }

                  String var7 = var0.substring(1 + var4, var5);
                  var4 = -1;
                  if (var7.equals("lt")) {
                     if (var1 != 1431655680) {
                        throw new IllegalStateException();
                     }

                     var2.append("<");
                  } else if (var7.equals("gt")) {
                     if (var1 != 1431655680) {
                        throw new IllegalStateException();
                     }

                     var2.append(">");
                  } else if (var7.equals("br")) {
                     var2.append("\n");
                  }

                  var3 = var5 + 1;
               }
            }
         }

         if (var3 < var0.length()) {
            var2.append(var0.substring(var3, var0.length()));
         }

         return var2.toString();
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "dp.al(" + ')');
      }
   }

   static uv px(int var0, int var1) {
      try {
         uv var2 = (uv)client.vs.ac((long)var0);
         if (var2 == null) {
            if (var1 != 106120262) {
               throw new IllegalStateException();
            }

            var2 = new uv(ga.fw, ln.ac(var0, 1872179422), gn.ae(var0, (byte)14));
            client.vs.ag(var2, (long)var0);
         }

         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "dp.px(" + ')');
      }
   }

   static void aa(String var0, String var1, String var2, byte var3) {
      try {
         cf = var0;
         cu = var1;
         cm = var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "dp.aa(" + ')');
      }
   }

   static void bm() {
      if (client.hn && null != cj && cj.length() > 0) {
         dp = -2025581255;
      } else {
         dp = 0;
      }

   }
}
