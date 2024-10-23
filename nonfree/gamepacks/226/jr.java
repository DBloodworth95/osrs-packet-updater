public class jr {
   public static int ar = 0;
   public static int aw = 0;
   static int as;
   public static boolean aj = false;
   static int ai;
   public static int ak = 0;
   static int ae;
   public static boolean ap = false;
   static int au;
   static qt af = new qt();
   static int ay;
   public static long[] ab = new long[1000];
   static final int at = 512;

   static final int bt() {
      return aw * 1947001953;
   }

   public static int ag() {
      return ar * 795345256;
   }

   public static int ad() {
      return ar * 278912807;
   }

   static final int bu() {
      return aw * 1947001953;
   }

   public static int aa(int var0) {
      return pj.ay(ab[var0]);
   }

   public static int ax(int var0) {
      return fu.aj(ab[var0]);
   }

   public static int aq(long var0) {
      return (int)(var0 >>> 0 & 127L);
   }

   public static boolean av(long var0) {
      return 0L != var0 && !hl.as(var0);
   }

   static final void bo(int var0, int var1, int var2, int var3) {
      if (!aj) {
         byte var8 = 50;
         int var9 = jl.at();
         int var10 = (1352395169 * aw - jm.as()) * var8 / jm.ao();
         int var11 = (253742759 * ak - jm.ae()) * var8 / jm.ao();
         int var12 = (aw * 717181614 - jm.as()) * var9 / jm.ao();
         int var13 = (ak * 253742759 - jm.ae()) * var9 / jm.ao();
         int var14 = gj.aw(var11, var8, var1, var0, (byte)4);
         int var15 = var1 * var8 - var0 * var11 >> 16;
         var11 = var14;
         var14 = gj.aw(var13, var9, var1, var0, (byte)4);
         int var16 = var1 * var9 - var13 * var0 >> 16;
         int var17 = var3 * var10 - var2 * var15 >> 16;
         int var18 = var10 * var2 + var3 * var15 >> 16;
         int var19 = var12 * var3 - var16 * var2 >> 16;
         int var20 = var16 * var3 + var12 * var2 >> 16;
         ai = -749721067 * ((var19 + var17) / 2);
         ay = -1054156381 * ((var14 + var11) / 2);
         as = -775701323 * ((var20 + var18) / 2);
         ae = -1879421933 * ((var19 - var17) / 2);
         jf.am = (var14 - var11) / 2 * 1216782417;
         at = 1331576533 * ((var20 - var18) / 2);
         au = Math.abs(ae * 691229479) * 325837154;
         gu.an = Math.abs(jf.am * 517384369) * -2137753923;
         us.ao = Math.abs(qw.at * -1732693571) * -1269600045;
         af.aj((float)(var19 - var17), (float)(var14 - var11), (float)(var20 - var18), -1603121434);
         af.ae(-277185433);
         aj = true;
      }
   }

   public static int al(long var0) {
      return (int)(var0 >>> 0 & 127L);
   }

   public static int bh(int var0) {
      return pj.ay(ab[var0]);
   }

   static int bj(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }

   public static int bv(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   public static long bz(int var0, int var1, int var2, boolean var3, int var4, int var5) {
      long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17 | ((long)var5 & 2047L) << 49;
      if (var3) {
         var6 |= 65536L;
      }

      return var6;
   }

   public static int bk(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   public static int bb(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   public static int bq(int var0) {
      long var2 = ab[var0];
      int var1 = (int)(var2 >>> 49 & 2047L);
      return var1;
   }

   public static int bp(int var0) {
      long var2 = ab[var0];
      int var1 = (int)(var2 >>> 49 & 2047L);
      return var1;
   }

   jr() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "jr.<init>(" + ')');
      }
   }

   public static int bx(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   static final void by(long var0) {
      ab[(ar += 1288544407) * 278912807 - 1] = var0;
   }

   public static String ar(CharSequence var0, int var1) {
      try {
         int var3 = var0.length();
         char[] var4 = new char[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            if (var1 == -630248333) {
               throw new IllegalStateException();
            }

            var4[var5] = '*';
         }

         String var2 = new String(var4);
         return var2;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "jr.ar(" + ')');
      }
   }

   static final int bn() {
      return aw * 1947001953;
   }

   static final boolean ba(jy var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      boolean var9 = ap;
      if (!var9) {
         return false;
      } else {
         ex.af(var5, var6, var7, var8, (byte)-70);
         jb var10 = (jb)var0.br.get(var1);
         int var11 = var10.ap * -957884077 + var2;
         int var12 = var10.aw * 54225735 + var3;
         int var13 = 423339171 * var10.ak + var4;
         int var14 = -449342943 * var10.aj;
         int var15 = 1050702601 * var10.ai;
         int var16 = var10.ay * -2056503993;
         int var17 = -1803987651 * ai - var11;
         int var18 = ay * -872402463 - var12;
         int var19 = -1354270943 * as - var13;
         if (Math.abs(var17) > var14 + -874831979 * au) {
            return false;
         } else if (Math.abs(var18) > -1792887659 * gu.an + var15) {
            return false;
         } else if (Math.abs(var19) > us.ao * 1679610619 + var16) {
            return false;
         } else if (Math.abs(var19 * jf.am * 517384369 - var18 * qw.at * 2088257007) > gu.an * -1792887659 * var16 + us.ao * 1679610619 * var15) {
            return false;
         } else if (Math.abs(var17 * 2088257007 * qw.at - var19 * ae * 671731361) > var14 * us.ao * 1679610619 + var16 * au * -874831979) {
            return false;
         } else {
            return Math.abs(var18 * ae * 671731361 - var17 * 517384369 * jf.am) <= gu.an * -1792887659 * var14 + var15 * au * -874831979;
         }
      }
   }

   public static final qt bg(int var0, int var1, int var2, int var3) {
      float var4 = 1.0E-5F;
      qt var5 = ch.aw((float)var1, (float)var2, (float)var3, -1614383502);
      qt var6 = ch.aw(0.0F, (float)var0, 0.0F, -520861395);
      qt var7 = ch.aw(0.0F, 1.0F, 0.0F, 121268425);
      qt var9 = af;
      float var8 = var7.an(var9, 2088566116);
      if (Math.abs(var8) < 1.0E-5F) {
         return null;
      } else {
         qt var12;
         synchronized(qt.ak) {
            if (qt.ai * 937612641 == 0) {
               var12 = new qt(var5);
            } else {
               qt.ak[(qt.ai -= -847475039) * 937612641].ai(var5, -1146053228);
               var12 = qt.ak[qt.ai * 937612641];
            }
         }

         var12.au(var6, (byte)1);
         float var13 = -io.ao(var7, var12, -1815119290) / var8;
         if (var13 < 0.0F) {
            return null;
         } else {
            var5.ak(16711680);
            var6.ak(16711680);
            var7.ak(16711680);
            var12.ak(16711680);
            return jf.at(var5, oz.az(af, var13, -1770542040), 1582897591);
         }
      }
   }

   static final int bs() {
      return 1151253507 * ak;
   }

   static final int bm() {
      return -1440766877 * ak;
   }

   public static int ah(int var0) {
      return pj.ay(ab[var0]);
   }

   static final boolean bd(jy var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      boolean var9 = ap;
      if (!var9) {
         return false;
      } else {
         ex.af(var5, var6, var7, var8, (byte)91);
         jb var10 = (jb)var0.br.get(var1);
         int var11 = var10.ap * -957884077 + var2;
         int var12 = var10.aw * 54225735 + var3;
         int var13 = 423339171 * var10.ak + var4;
         int var14 = -449342943 * var10.aj;
         int var15 = 1458644704 * var10.ai;
         int var16 = var10.ay * 1636101700;
         int var17 = 1343684014 * ai - var11;
         int var18 = ay * -872402463 - var12;
         int var19 = -1354270943 * as - var13;
         if (Math.abs(var17) > var14 + 510567604 * au) {
            return false;
         } else if (Math.abs(var18) > -670630507 * gu.an + var15) {
            return false;
         } else if (Math.abs(var19) > us.ao * 1679610619 + var16) {
            return false;
         } else if (Math.abs(var19 * jf.am * 1563469222 - var18 * qw.at * -510456660) > gu.an * -1792887659 * var16 + us.ao * 1907375019 * var15) {
            return false;
         } else if (Math.abs(var17 * 2088257007 * qw.at - var19 * ae * 671731361) > var14 * us.ao * -1754443232 + var16 * au * 820783818) {
            return false;
         } else {
            return Math.abs(var18 * ae * -329855755 - var17 * -680725733 * jf.am) <= gu.an * 1542019894 * var14 + var15 * au * -874831979;
         }
      }
   }

   static final void br(long var0) {
      ab[(ar += 1288544407) * 278912807 - 1] = var0;
   }

   static final boolean bw(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = ak * 253742759 + var6;
      if (var7 < var0 && var7 < var1 && var7 < var2) {
         return false;
      } else {
         var7 = ak * 253742759 - var6;
         if (var7 > var0 && var7 > var1 && var7 > var2) {
            return false;
         } else {
            var7 = var6 + aw * 1947001953;
            if (var7 < var3 && var7 < var4 && var7 < var5) {
               return false;
            } else {
               var7 = 1947001953 * aw - var6;
               return var7 <= var3 || var7 <= var4 || var7 <= var5;
            }
         }
      }
   }

   public static final qt bi(int var0, int var1, int var2, int var3) {
      float var4 = 1.0E-5F;
      qt var5 = ch.aw((float)var1, (float)var2, (float)var3, -1356814659);
      qt var6 = ch.aw(0.0F, (float)var0, 0.0F, 1052724037);
      qt var7 = ch.aw(0.0F, 1.0F, 0.0F, 934883161);
      qt var9 = af;
      float var8 = var7.an(var9, 1884468017);
      if (Math.abs(var8) < 1.0E-5F) {
         return null;
      } else {
         qt var12;
         synchronized(qt.ak) {
            if (qt.ai * 937612641 == 0) {
               var12 = new qt(var5);
            } else {
               qt.ak[(qt.ai -= -847475039) * 937612641].ai(var5, 2127495959);
               var12 = qt.ak[qt.ai * 937612641];
            }
         }

         var12.au(var6, (byte)1);
         float var13 = -io.ao(var7, var12, -474418740) / var8;
         if (var13 < 0.0F) {
            return null;
         } else {
            var5.ak(16711680);
            var6.ak(16711680);
            var7.ak(16711680);
            var12.ak(16711680);
            return jf.at(var5, oz.az(af, var13, -1770542040), -612116168);
         }
      }
   }

   public static final qt bf(int var0, int var1, int var2, int var3) {
      float var4 = 1.0E-5F;
      qt var5 = ch.aw((float)var1, (float)var2, (float)var3, -930941925);
      qt var6 = ch.aw(0.0F, (float)var0, 0.0F, 1957280378);
      qt var7 = ch.aw(0.0F, 1.0F, 0.0F, -720687009);
      qt var9 = af;
      float var8 = var7.an(var9, 1567726405);
      if (Math.abs(var8) < 1.0E-5F) {
         return null;
      } else {
         qt var12;
         synchronized(qt.ak) {
            if (qt.ai * 937612641 == 0) {
               var12 = new qt(var5);
            } else {
               qt.ak[(qt.ai -= -847475039) * 937612641].ai(var5, 20156358);
               var12 = qt.ak[qt.ai * 937612641];
            }
         }

         var12.au(var6, (byte)1);
         float var13 = -io.ao(var7, var12, 659597410) / var8;
         if (var13 < 0.0F) {
            return null;
         } else {
            var5.ak(16711680);
            var6.ak(16711680);
            var7.ak(16711680);
            var12.ak(16711680);
            return jf.at(var5, oz.az(af, var13, -1770542040), 1317886951);
         }
      }
   }

   public static long bc(int var0, int var1, int var2, boolean var3, int var4, int var5) {
      long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17 | ((long)var5 & 2047L) << 49;
      if (var3) {
         var6 |= 65536L;
      }

      return var6;
   }

   public static final qt bl(int var0, int var1, int var2, int var3) {
      float var4 = 1.0E-5F;
      qt var5 = ch.aw((float)var1, (float)var2, (float)var3, 1262531769);
      qt var6 = ch.aw(0.0F, (float)var0, 0.0F, 1346113603);
      qt var7 = ch.aw(0.0F, 1.0F, 0.0F, -976998690);
      qt var9 = af;
      float var8 = var7.an(var9, -677838020);
      if (Math.abs(var8) < 1.0E-5F) {
         return null;
      } else {
         qt var12;
         synchronized(qt.ak) {
            if (qt.ai * -1380226572 == 0) {
               var12 = new qt(var5);
            } else {
               qt.ak[(qt.ai -= -847475039) * 1737130296].ai(var5, -932221698);
               var12 = qt.ak[qt.ai * 532019059];
            }
         }

         var12.au(var6, (byte)1);
         float var13 = -io.ao(var7, var12, -1655240504) / var8;
         if (var13 < 0.0F) {
            return null;
         } else {
            var5.ak(16711680);
            var6.ak(16711680);
            var7.ak(16711680);
            var12.ak(16711680);
            return jf.at(var5, oz.az(af, var13, -1770542040), -310309396);
         }
      }
   }

   public static void ap(vl var0, kt var1, int var2, int var3, int var4) {
      try {
         var1.am(var2, var3, -1760661332);
         var1.au(0, 442691643);
         var1.at(0, (byte)28);
         byte var5 = var0.cu((byte)13);
         if (0 == var5) {
            if (var4 != -638484385) {
               throw new IllegalStateException();
            }
         } else {
            int var6 = tk.aw((vl)var0, (byte)var5, 0, (byte)0);
            int var7 = tk.aw((vl)var0, (byte)var5, 2, (byte)0);
            int var8 = tk.aw((vl)var0, (byte)var5, 4, (byte)0);
            int var9 = tk.aw((vl)var0, (byte)var5, 6, (byte)0);
            var1.ao(var6, var7, var8, var9, 1271978253);
         }

      } catch (RuntimeException var10) {
         throw tm.aw(var10, "jr.ap(" + ')');
      }
   }

   public static boolean ac(long var0) {
      return 0L != var0 && !hl.as(var0);
   }
}
