public class wk {
   public static int aw;
   static int[] at;
   public static int ak;
   public static int[] aj;
   public static int[] as;
   public static int ap;
   public static int[] ae;

   public static vc[] aq(pe var0, String var1, String var2) {
      if (!var0.cp(var1, var2, -637561867)) {
         return null;
      } else {
         int var3 = var0.cf(var1, (byte)90);
         int var4 = var0.cl(var3, var2, (short)-6340);
         vc[] var5;
         if (!cb.am(var0, var3, var4, 255562733)) {
            var5 = null;
         } else {
            vc[] var7 = new vc[1934102439 * ap];

            for(int var8 = 0; var8 < ap * 1934102439; ++var8) {
               vc var9 = var7[var8] = new vc();
               var9.as = aw * -1147402861;
               var9.ae = -201283629 * ak;
               var9.ai = aj[var8];
               var9.ay = tl.ai[var8];
               var9.ak = ae.ay[var8];
               var9.aj = as[var8];
               var9.aw = ae;
               var9.ap = ks.am[var8];
            }

            aj = null;
            tl.ai = null;
            ae.ay = null;
            as = null;
            ae = null;
            ks.am = (byte[][])null;
            var5 = var7;
         }

         return var5;
      }
   }

   public static vv[] an(pe var0, int var1, int var2) {
      if (!cb.am(var0, var1, var2, 312034509)) {
         return null;
      } else {
         vv[] var4 = new vv[ap * 1934102439];

         for(int var5 = 0; var5 < 1934102439 * ap; ++var5) {
            vv var6 = var4[var5] = new vv();
            var6.ay = -1147402861 * aw;
            var6.as = -615191719 * ak;
            var6.aj = aj[var5];
            var6.ai = tl.ai[var5];
            var6.aw = ae.ay[var5];
            var6.ak = as[var5];
            int var7 = var6.ak * var6.aw;
            byte[] var8 = ks.am[var5];
            var6.ap = new int[var7];

            for(int var9 = 0; var9 < var7; ++var9) {
               var6.ap[var9] = ae[var8[var9] & -644031170];
            }
         }

         aj = null;
         tl.ai = null;
         ae.ay = null;
         as = null;
         ae = null;
         ks.am = (byte[][])null;
         return var4;
      }
   }

   public static vv[] ao(pe var0, int var1, int var2) {
      if (!cb.am(var0, var1, var2, -40244794)) {
         return null;
      } else {
         vv[] var4 = new vv[ap * 1934102439];

         for(int var5 = 0; var5 < 1934102439 * ap; ++var5) {
            vv var6 = var4[var5] = new vv();
            var6.ay = 512218662 * aw;
            var6.as = -201283629 * ak;
            var6.aj = aj[var5];
            var6.ai = tl.ai[var5];
            var6.aw = ae.ay[var5];
            var6.ak = as[var5];
            int var7 = var6.ak * var6.aw;
            byte[] var8 = ks.am[var5];
            var6.ap = new int[var7];

            for(int var9 = 0; var9 < var7; ++var9) {
               var6.ap[var9] = ae[var8[var9] & 255];
            }
         }

         aj = null;
         tl.ai = null;
         ae.ay = null;
         as = null;
         ae = null;
         ks.am = (byte[][])null;
         return var4;
      }
   }

   static void bn(byte[] var0) {
      vl var1 = new vl(var0);
      var1.am = (var0.length - 2) * -725588083;
      ap = var1.ce(260182293) * -1009276905;
      aj = new int[ap * 1934102439];
      tl.ai = new int[ap * 1934102439];
      ae.ay = new int[1934102439 * ap];
      as = new int[1934102439 * ap];
      ks.am = new byte[ap * 1934102439][];
      var1.am = -725588083 * (var0.length - 7 - ap * -1707049672);
      aw = var1.ce(700629688) * -692526949;
      ak = var1.ce(106421637) * 395003995;
      int var2 = (var1.cy((short)-27432) & 255) + 1;

      int var3;
      for(var3 = 0; var3 < ap * 1934102439; ++var3) {
         aj[var3] = var1.ce(2116721612);
      }

      for(var3 = 0; var3 < 1934102439 * ap; ++var3) {
         tl.ai[var3] = var1.ce(1960518121);
      }

      for(var3 = 0; var3 < ap * 1934102439; ++var3) {
         ae.ay[var3] = var1.ce(1415210379);
      }

      for(var3 = 0; var3 < 1934102439 * ap; ++var3) {
         as[var3] = var1.ce(956144634);
      }

      var1.am = -725588083 * (var0.length - 7 - ap * -1707049672 - 3 * (var2 - 1));
      ae = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         ae[var3] = var1.cx((byte)-5);
         if (0 == ae[var3]) {
            ae[var3] = 1;
         }
      }

      var1.am = 0;

      for(var3 = 0; var3 < ap * 1934102439; ++var3) {
         int var4 = ae.ay[var3];
         int var5 = as[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         ks.am[var3] = var7;
         int var8 = var1.cy((short)-24671);
         int var9;
         if (0 == var8) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.cu((byte)13);
            }
         } else if (1 == var8) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var4 * var10] = var1.cu((byte)13);
               }
            }
         }
      }

   }

   public static qi ad(pe var0, pe var1, int var2, int var3) {
      if (!cb.am(var0, var2, var3, 1838672251)) {
         return null;
      } else {
         byte[] var5 = var1.bm(var2, var3, 1032668239);
         qi var4;
         if (null == var5) {
            var4 = null;
         } else {
            qi var6 = new qi(var5, aj, tl.ai, ae.ay, as, ae, ks.am);
            aj = null;
            tl.ai = null;
            ae.ay = null;
            as = null;
            ae = null;
            ks.am = (byte[][])null;
            var4 = var6;
         }

         return var4;
      }
   }

   public static vv[] ab(pe var0, int var1, int var2) {
      if (!cb.am(var0, var1, var2, 933595846)) {
         return null;
      } else {
         vv[] var4 = new vv[ap * 1934102439];

         for(int var5 = 0; var5 < 1934102439 * ap; ++var5) {
            vv var6 = var4[var5] = new vv();
            var6.ay = -1147402861 * aw;
            var6.as = -138006225 * ak;
            var6.aj = aj[var5];
            var6.ai = tl.ai[var5];
            var6.aw = ae.ay[var5];
            var6.ak = as[var5];
            int var7 = var6.ak * var6.aw;
            byte[] var8 = ks.am[var5];
            var6.ap = new int[var7];

            for(int var9 = 0; var9 < var7; ++var9) {
               var6.ap[var9] = ae[var8[var9] & -1275075510];
            }
         }

         aj = null;
         tl.ai = null;
         ae.ay = null;
         as = null;
         ae = null;
         ks.am = (byte[][])null;
         return var4;
      }
   }

   public static vc[] av(pe var0, String var1, String var2) {
      if (!var0.cp(var1, var2, -637561867)) {
         return null;
      } else {
         int var3 = var0.cf(var1, (byte)87);
         int var4 = var0.cl(var3, var2, (short)-26039);
         vc[] var5;
         if (!cb.am(var0, var3, var4, 425659219)) {
            var5 = null;
         } else {
            vc[] var7 = new vc[1934102439 * ap];

            for(int var8 = 0; var8 < ap * 1934102439; ++var8) {
               vc var9 = var7[var8] = new vc();
               var9.as = aw * -1147402861;
               var9.ae = -201283629 * ak;
               var9.ai = aj[var8];
               var9.ay = tl.ai[var8];
               var9.ak = ae.ay[var8];
               var9.aj = as[var8];
               var9.aw = ae;
               var9.ap = ks.am[var8];
            }

            aj = null;
            tl.ai = null;
            ae.ay = null;
            as = null;
            ae = null;
            ks.am = (byte[][])null;
            var5 = var7;
         }

         return var5;
      }
   }

   public static vv ag(pe var0, int var1, int var2) {
      if (!cb.am(var0, var1, var2, 905496530)) {
         return null;
      } else {
         vv var4 = new vv();
         var4.ay = aw * -1147402861;
         var4.as = -201283629 * ak;
         var4.aj = aj[0];
         var4.ai = tl.ai[0];
         var4.aw = ae.ay[0];
         var4.ak = as[0];
         int var5 = var4.aw * var4.ak;
         byte[] var6 = ks.am[0];
         var4.ap = new int[var5];

         for(int var7 = 0; var7 < var5; ++var7) {
            var4.ap[var7] = ae[var6[var7] & 255];
         }

         aj = null;
         tl.ai = null;
         ae.ay = null;
         as = null;
         ae = null;
         ks.am = (byte[][])null;
         return var4;
      }
   }

   public static boolean bc(pe var0, int var1) {
      byte[] var2 = var0.bf(var1, 97528119);
      if (null == var2) {
         return false;
      } else {
         gw.au(var2, 1828478304);
         return true;
      }
   }

   public static qi ac(pe var0, pe var1, int var2, int var3) {
      if (!cb.am(var0, var2, var3, 1148209321)) {
         return null;
      } else {
         byte[] var5 = var1.bm(var2, var3, 1086276731);
         qi var4;
         if (null == var5) {
            var4 = null;
         } else {
            qi var6 = new qi(var5, aj, tl.ai, ae.ay, as, ae, ks.am);
            aj = null;
            tl.ai = null;
            ae.ay = null;
            as = null;
            ae = null;
            ks.am = (byte[][])null;
            var4 = var6;
         }

         return var4;
      }
   }

   wk() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "wk.<init>(" + ')');
      }
   }

   public static vv[] af(pe var0, int var1, int var2) {
      if (!cb.am(var0, var1, var2, 1403906237)) {
         return null;
      } else {
         vv[] var4 = new vv[ap * 1934102439];

         for(int var5 = 0; var5 < 1934102439 * ap; ++var5) {
            vv var6 = var4[var5] = new vv();
            var6.ay = -1147402861 * aw;
            var6.as = -201283629 * ak;
            var6.aj = aj[var5];
            var6.ai = tl.ai[var5];
            var6.aw = ae.ay[var5];
            var6.ak = as[var5];
            int var7 = var6.ak * var6.aw;
            byte[] var8 = ks.am[var5];
            var6.ap = new int[var7];

            for(int var9 = 0; var9 < var7; ++var9) {
               var6.ap[var9] = ae[var8[var9] & 1092777650];
            }
         }

         aj = null;
         tl.ai = null;
         ae.ay = null;
         as = null;
         ae = null;
         ks.am = (byte[][])null;
         return var4;
      }
   }

   public static vv[] bh(pe var0, String var1, String var2) {
      if (!var0.cp(var1, var2, -637561867)) {
         return null;
      } else {
         int var3 = var0.cf(var1, (byte)94);
         int var4 = var0.cl(var3, var2, (short)-11602);
         return ex.ap(var0, var3, var4, 806885260);
      }
   }

   public static vc[] al(pe var0, String var1, String var2) {
      if (!var0.cp(var1, var2, -637561867)) {
         return null;
      } else {
         int var3 = var0.cf(var1, (byte)126);
         int var4 = var0.cl(var3, var2, (short)-3834);
         vc[] var5;
         if (!cb.am(var0, var3, var4, 1910263826)) {
            var5 = null;
         } else {
            vc[] var7 = new vc[1934102439 * ap];

            for(int var8 = 0; var8 < ap * 1934102439; ++var8) {
               vc var9 = var7[var8] = new vc();
               var9.as = aw * -1147402861;
               var9.ae = -201283629 * ak;
               var9.ai = aj[var8];
               var9.ay = tl.ai[var8];
               var9.ak = ae.ay[var8];
               var9.aj = as[var8];
               var9.aw = ae;
               var9.ap = ks.am[var8];
            }

            aj = null;
            tl.ai = null;
            ae.ay = null;
            as = null;
            ae = null;
            ks.am = (byte[][])null;
            var5 = var7;
         }

         return var5;
      }
   }

   public static vc aa(pe var0, String var1, String var2) {
      if (!var0.cp(var1, var2, -637561867)) {
         return null;
      } else {
         int var3 = var0.cf(var1, (byte)98);
         int var4 = var0.cl(var3, var2, (short)32);
         vc var5;
         if (!cb.am(var0, var3, var4, 516398793)) {
            var5 = null;
         } else {
            var5 = client.ae(-1743156069);
         }

         return var5;
      }
   }

   public static vc ah(pe var0, String var1, String var2) {
      if (!var0.cp(var1, var2, -637561867)) {
         return null;
      } else {
         int var3 = var0.cf(var1, (byte)58);
         int var4 = var0.cl(var3, var2, (short)-868);
         vc var5;
         if (!cb.am(var0, var3, var4, 573063268)) {
            var5 = null;
         } else {
            var5 = client.ae(-1259030054);
         }

         return var5;
      }
   }

   public static vv[] bj(pe var0, String var1, String var2) {
      if (!var0.cp(var1, var2, -637561867)) {
         return null;
      } else {
         int var3 = var0.cf(var1, (byte)75);
         int var4 = var0.cl(var3, var2, (short)-8048);
         return ex.ap(var0, var3, var4, 806885260);
      }
   }

   public static boolean bz(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 1412371187);
      if (null == var3) {
         return false;
      } else {
         gw.au(var3, 1914411300);
         return true;
      }
   }

   public static qi bv(pe var0, pe var1, String var2, String var3) {
      if (!var0.cp(var2, var3, -637561867)) {
         return null;
      } else {
         int var4 = var0.cf(var2, (byte)108);
         int var5 = var0.cl(var4, var3, (short)-7842);
         return dc.ak(var0, var1, var4, var5, -1281999566);
      }
   }

   public static qi bx(pe var0, pe var1, String var2, String var3) {
      if (!var0.cp(var2, var3, -637561867)) {
         return null;
      } else {
         int var4 = var0.cf(var2, (byte)65);
         int var5 = var0.cl(var4, var3, (short)-1054);
         return dc.ak(var0, var1, var4, var5, -1490053378);
      }
   }

   public static vc bk() {
      vc var0 = new vc();
      var0.as = -1147402861 * aw;
      var0.ae = -201283629 * ak;
      var0.ai = aj[0];
      var0.ay = tl.ai[0];
      var0.ak = ae.ay[0];
      var0.aj = as[0];
      var0.aw = ae;
      var0.ap = ks.am[0];
      aj = null;
      tl.ai = null;
      ae.ay = null;
      as = null;
      ae = null;
      ks.am = (byte[][])null;
      return var0;
   }

   public static vc bb() {
      vc var0 = new vc();
      var0.as = -1147402861 * aw;
      var0.ae = -299413414 * ak;
      var0.ai = aj[0];
      var0.ay = tl.ai[0];
      var0.ak = ae.ay[0];
      var0.aj = as[0];
      var0.aw = ae;
      var0.ap = ks.am[0];
      aj = null;
      tl.ai = null;
      ae.ay = null;
      as = null;
      ae = null;
      ks.am = (byte[][])null;
      return var0;
   }

   public static vc bq() {
      vc var0 = new vc();
      var0.as = -1147402861 * aw;
      var0.ae = -201283629 * ak;
      var0.ai = aj[0];
      var0.ay = tl.ai[0];
      var0.ak = ae.ay[0];
      var0.aj = as[0];
      var0.aw = ae;
      var0.ap = ks.am[0];
      aj = null;
      tl.ai = null;
      ae.ay = null;
      as = null;
      ae = null;
      ks.am = (byte[][])null;
      return var0;
   }

   public static vc bp() {
      vc var0 = new vc();
      var0.as = -1147402861 * aw;
      var0.ae = -201283629 * ak;
      var0.ai = aj[0];
      var0.ay = tl.ai[0];
      var0.ak = ae.ay[0];
      var0.aj = as[0];
      var0.aw = ae;
      var0.ap = ks.am[0];
      aj = null;
      tl.ai = null;
      ae.ay = null;
      as = null;
      ae = null;
      ks.am = (byte[][])null;
      return var0;
   }

   public static vc[] ax(pe var0, String var1, String var2) {
      if (!var0.cp(var1, var2, -637561867)) {
         return null;
      } else {
         int var3 = var0.cf(var1, (byte)83);
         int var4 = var0.cl(var3, var2, (short)-19310);
         vc[] var5;
         if (!cb.am(var0, var3, var4, -392570204)) {
            var5 = null;
         } else {
            vc[] var7 = new vc[1934102439 * ap];

            for(int var8 = 0; var8 < ap * 1934102439; ++var8) {
               vc var9 = var7[var8] = new vc();
               var9.as = aw * -1147402861;
               var9.ae = -201283629 * ak;
               var9.ai = aj[var8];
               var9.ay = tl.ai[var8];
               var9.ak = ae.ay[var8];
               var9.aj = as[var8];
               var9.aw = ae;
               var9.ap = ks.am[var8];
            }

            aj = null;
            tl.ai = null;
            ae.ay = null;
            as = null;
            ae = null;
            ks.am = (byte[][])null;
            var5 = var7;
         }

         return var5;
      }
   }

   public static vv[] ar(pe var0, int var1, int var2) {
      if (!cb.am(var0, var1, var2, 449876943)) {
         return null;
      } else {
         vv[] var4 = new vv[ap * -74365807];

         for(int var5 = 0; var5 < -1576273359 * ap; ++var5) {
            vv var6 = var4[var5] = new vv();
            var6.ay = -311015796 * aw;
            var6.as = 828619083 * ak;
            var6.aj = aj[var5];
            var6.ai = tl.ai[var5];
            var6.aw = ae.ay[var5];
            var6.ak = as[var5];
            int var7 = var6.ak * var6.aw;
            byte[] var8 = ks.am[var5];
            var6.ap = new int[var7];

            for(int var9 = 0; var9 < var7; ++var9) {
               var6.ap[var9] = ae[var8[var9] & -2072141074];
            }
         }

         aj = null;
         tl.ai = null;
         ae.ay = null;
         as = null;
         ae = null;
         ks.am = (byte[][])null;
         return var4;
      }
   }

   public static boolean by(pe var0, int var1) {
      byte[] var2 = var0.bf(var1, 1644219303);
      if (null == var2) {
         return false;
      } else {
         gw.au(var2, 1566575071);
         return true;
      }
   }

   static void br(byte[] var0) {
      vl var1 = new vl(var0);
      var1.am = (var0.length - 2) * -161227897;
      ap = var1.ce(948728888) * -1009276905;
      aj = new int[ap * 1934102439];
      tl.ai = new int[ap * 1934102439];
      ae.ay = new int[1934102439 * ap];
      as = new int[1934102439 * ap];
      ks.am = new byte[ap * 751337252][];
      var1.am = -1488706405 * (var0.length - 7 - ap * -1707049672);
      aw = var1.ce(1518882567) * 1128033095;
      ak = var1.ce(533852673) * 224978721;
      int var2 = (var1.cy((short)-21711) & -1896855702) + 1;

      int var3;
      for(var3 = 0; var3 < ap * 2130581512; ++var3) {
         aj[var3] = var1.ce(1620354690);
      }

      for(var3 = 0; var3 < 1934102439 * ap; ++var3) {
         tl.ai[var3] = var1.ce(15082809);
      }

      for(var3 = 0; var3 < ap * 1934102439; ++var3) {
         ae.ay[var3] = var1.ce(108705686);
      }

      for(var3 = 0; var3 < 1934102439 * ap; ++var3) {
         as[var3] = var1.ce(177925119);
      }

      var1.am = 1157165168 * (var0.length - 7 - ap * -1707049672 - 3 * (var2 - 1));
      ae = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         ae[var3] = var1.cx((byte)-125);
         if (0 == ae[var3]) {
            ae[var3] = 1;
         }
      }

      var1.am = 0;

      for(var3 = 0; var3 < ap * -581767091; ++var3) {
         int var4 = ae.ay[var3];
         int var5 = as[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         ks.am[var3] = var7;
         int var8 = var1.cy((short)-18575);
         int var9;
         if (0 == var8) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.cu((byte)13);
            }
         } else if (1 == var8) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var4 * var10] = var1.cu((byte)13);
               }
            }
         }
      }

   }

   public static vv az(pe var0, int var1, int var2) {
      if (!cb.am(var0, var1, var2, -240876194)) {
         return null;
      } else {
         vv var4 = new vv();
         var4.ay = aw * -1147402861;
         var4.as = -201283629 * ak;
         var4.aj = aj[0];
         var4.ai = tl.ai[0];
         var4.aw = ae.ay[0];
         var4.ak = as[0];
         int var5 = var4.aw * var4.ak;
         byte[] var6 = ks.am[0];
         var4.ap = new int[var5];

         for(int var7 = 0; var7 < var5; ++var7) {
            var4.ap[var7] = ae[var6[var7] & 255];
         }

         aj = null;
         tl.ai = null;
         ae.ay = null;
         as = null;
         ae = null;
         ks.am = (byte[][])null;
         return var4;
      }
   }

   static void bu(byte[] var0) {
      vl var1 = new vl(var0);
      var1.am = (var0.length - 2) * -725588083;
      ap = var1.ce(1785042347) * 415771954;
      aj = new int[ap * 983053902];
      tl.ai = new int[ap * 1934102439];
      ae.ay = new int[1137671766 * ap];
      as = new int[1900257653 * ap];
      ks.am = new byte[ap * -562075461][];
      var1.am = -725588083 * (var0.length - 7 - ap * -1707049672);
      aw = var1.ce(857009801) * 1467948584;
      ak = var1.ce(1181174369) * 395003995;
      int var2 = (var1.cy((short)-14625) & 255) + 1;

      int var3;
      for(var3 = 0; var3 < ap * -315470250; ++var3) {
         aj[var3] = var1.ce(369900710);
      }

      for(var3 = 0; var3 < -297094460 * ap; ++var3) {
         tl.ai[var3] = var1.ce(649292844);
      }

      for(var3 = 0; var3 < ap * 1934102439; ++var3) {
         ae.ay[var3] = var1.ce(1493826713);
      }

      for(var3 = 0; var3 < 1934102439 * ap; ++var3) {
         as[var3] = var1.ce(559049219);
      }

      var1.am = -725588083 * (var0.length - 7 - ap * -1707049672 - 3 * (var2 - 1));
      ae = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         ae[var3] = var1.cx((byte)-111);
         if (0 == ae[var3]) {
            ae[var3] = 1;
         }
      }

      var1.am = 0;

      for(var3 = 0; var3 < ap * 1934102439; ++var3) {
         int var4 = ae.ay[var3];
         int var5 = as[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         ks.am[var3] = var7;
         int var8 = var1.cy((short)-29652);
         int var9;
         if (0 == var8) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.cu((byte)13);
            }
         } else if (1 == var8) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var4 * var10] = var1.cu((byte)13);
               }
            }
         }
      }

   }

   static void bt(byte[] var0) {
      vl var1 = new vl(var0);
      var1.am = (var0.length - 2) * 1559385321;
      ap = var1.ce(1216416865) * 240107477;
      aj = new int[ap * 1723426670];
      tl.ai = new int[ap * 1934102439];
      ae.ay = new int[1507662851 * ap];
      as = new int[1934102439 * ap];
      ks.am = new byte[ap * 1934102439][];
      var1.am = -725588083 * (var0.length - 7 - ap * -470082861);
      aw = var1.ce(1984465447) * 878767315;
      ak = var1.ce(795353976) * -2054399655;
      int var2 = (var1.cy((short)-11548) & 255) + 1;

      int var3;
      for(var3 = 0; var3 < ap * -1075782708; ++var3) {
         aj[var3] = var1.ce(626714630);
      }

      for(var3 = 0; var3 < 1080717615 * ap; ++var3) {
         tl.ai[var3] = var1.ce(2021724945);
      }

      for(var3 = 0; var3 < ap * -178716309; ++var3) {
         ae.ay[var3] = var1.ce(216462904);
      }

      for(var3 = 0; var3 < 1071238973 * ap; ++var3) {
         as[var3] = var1.ce(1149006053);
      }

      var1.am = -725588083 * (var0.length - 7 - ap * -1707049672 - 3 * (var2 - 1));
      ae = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         ae[var3] = var1.cx((byte)-121);
         if (0 == ae[var3]) {
            ae[var3] = 1;
         }
      }

      var1.am = 0;

      for(var3 = 0; var3 < ap * 406156507; ++var3) {
         int var4 = ae.ay[var3];
         int var5 = as[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         ks.am[var3] = var7;
         int var8 = var1.cy((short)-19448);
         int var9;
         if (0 == var8) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.cu((byte)13);
            }
         } else if (1 == var8) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var4 * var10] = var1.cu((byte)13);
               }
            }
         }
      }

   }

   static void bs(byte[] var0) {
      vl var1 = new vl(var0);
      var1.am = (var0.length - 2) * -725588083;
      ap = var1.ce(651501182) * -1009276905;
      aj = new int[ap * 1934102439];
      tl.ai = new int[ap * 1934102439];
      ae.ay = new int[-1890604757 * ap];
      as = new int[1934102439 * ap];
      ks.am = new byte[ap * 1542608495][];
      var1.am = 1546878730 * (var0.length - 7 - ap * -1707049672);
      aw = var1.ce(137283035) * 995099113;
      ak = var1.ce(1593164557) * -1893187145;
      int var2 = (var1.cy((short)-11046) & 643491127) + 1;

      int var3;
      for(var3 = 0; var3 < ap * 355744960; ++var3) {
         aj[var3] = var1.ce(866443492);
      }

      for(var3 = 0; var3 < 1934102439 * ap; ++var3) {
         tl.ai[var3] = var1.ce(574366437);
      }

      for(var3 = 0; var3 < ap * 1380461201; ++var3) {
         ae.ay[var3] = var1.ce(1058142257);
      }

      for(var3 = 0; var3 < 1934102439 * ap; ++var3) {
         as[var3] = var1.ce(412531767);
      }

      var1.am = 494048651 * (var0.length - 7 - ap * -1695654363 - 3 * (var2 - 1));
      ae = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         ae[var3] = var1.cx((byte)-100);
         if (0 == ae[var3]) {
            ae[var3] = 1;
         }
      }

      var1.am = 0;

      for(var3 = 0; var3 < ap * 1934102439; ++var3) {
         int var4 = ae.ay[var3];
         int var5 = as[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         ks.am[var3] = var7;
         int var8 = var1.cy((short)-32112);
         int var9;
         if (0 == var8) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.cu((byte)13);
            }
         } else if (1 == var8) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var4 * var10] = var1.cu((byte)13);
               }
            }
         }
      }

   }
}
