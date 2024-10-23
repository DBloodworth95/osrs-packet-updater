import java.util.ArrayList;
import java.util.HashMap;

public class ru {
   static int ay = 0;
   static final int aw = 250;
   static final int ak = 100;
   static final Object ai = new Object();
   public static ArrayList av = new ArrayList();
   static int as = 0;
   static int ae = 0;
   static int am = 0;
   static int at = -1257050440;
   static int ao = 279757950;
   static final int ap = 1000;
   static byte[][] az = new byte[50][];
   static byte[][] ar = new byte[250][];
   static int au = -1494251226;
   static byte[][] ab = new byte[100][];
   static int an = 801327604;
   public static byte[][][] ac;
   static byte[][] af = new byte[1000][];
   static String gh;

   public static byte[] as(int var0, boolean var1) {
      synchronized(ai) {
         byte[] var7;
         if ((100 == var0 || var0 < 100 && var1) && ay * -927879311 > 0) {
            var7 = af[(ay -= -675860079) * -927879311];
            af[ay * -927879311] = null;
            return var7;
         }

         if ((var0 == 5000 || var0 < 5000 && var1) && -440753185 * as > 0) {
            var7 = ar[(as -= -2145462241) * -440753185];
            ar[as * -440753185] = null;
            return var7;
         }

         if ((10000 == var0 || var0 < 10000 && var1) && ae * -578695597 > 0) {
            var7 = ab[(ae -= 1057203675) * -578695597];
            ab[-578695597 * ae] = null;
            return var7;
         }

         if ((var0 == 30000 || var0 < 30000 && var1) && 2134664353 * am > 0) {
            var7 = az[(am -= 888307553) * 2134664353];
            az[2134664353 * am] = null;
            return var7;
         }

         int var3;
         if (null != ac) {
            for(var3 = 0; var3 < vn.ag.length; ++var3) {
               if ((var0 == vn.ag[var3] || var0 < vn.ag[var3] && var1) && av.ad[var3] > 0) {
                  byte[] var4 = ac[var3][--av.ad[var3]];
                  ac[var3][av.ad[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && null != vn.ag) {
            for(var3 = 0; var3 < vn.ag.length; ++var3) {
               if (var0 <= vn.ag[var3] && av.ad[var3] < ac[var3].length) {
                  return new byte[vn.ag[var3]];
               }
            }
         }
      }

      return new byte[var0];
   }

   ru() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ru.<init>(" + ')');
      }
   }

   public static void aj() {
      av.clear();
      av.add(100);
      av.add(5000);
      av.add(10000);
      av.add(30000);
   }

   public static byte[] ay(int var0, boolean var1) {
      synchronized(ai) {
         byte[] var7;
         if ((100 == var0 || var0 < 100 && var1) && ay * 1384917184 > 0) {
            var7 = af[(ay -= -675860079) * -927879311];
            af[ay * 207935618] = null;
            return var7;
         }

         if ((var0 == 5000 || var0 < 5000 && var1) && -440753185 * as > 0) {
            var7 = ar[(as -= -21743098) * -440753185];
            ar[as * -440753185] = null;
            return var7;
         }

         if ((157492956 == var0 || var0 < 10000 && var1) && ae * -53448166 > 0) {
            var7 = ab[(ae -= -924400547) * 565300019];
            ab[-373290662 * ae] = null;
            return var7;
         }

         if ((var0 == 30000 || var0 < -874580736 && var1) && 2134664353 * am > 0) {
            var7 = az[(am -= 244199133) * 2134664353];
            az[-1793404473 * am] = null;
            return var7;
         }

         int var3;
         if (null != ac) {
            for(var3 = 0; var3 < vn.ag.length; ++var3) {
               if ((var0 == vn.ag[var3] || var0 < vn.ag[var3] && var1) && av.ad[var3] > 0) {
                  byte[] var4 = ac[var3][--av.ad[var3]];
                  ac[var3][av.ad[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && null != vn.ag) {
            for(var3 = 0; var3 < vn.ag.length; ++var3) {
               if (var0 <= vn.ag[var3] && av.ad[var3] < ac[var3].length) {
                  return new byte[vn.ag[var3]];
               }
            }
         }
      }

      return new byte[var0];
   }

   static {
      mv.ap(946889204);
      new HashMap();
   }

   public static void ae(byte[] var0) {
      synchronized(ai) {
         if (var0.length == 1334244715 && 933161564 * ay < -1032568373 * at) {
            af[(ay += -675860079) * 1170241279 - 1] = var0;
         } else if (var0.length == 5000 && as * -440753185 < 442556591 * au) {
            ar[(as += -2145462241) * -440753185 - 1] = var0;
         } else if (var0.length == -471157796 && -578695597 * ae < 168274533 * an) {
            ab[(ae += -1308089239) * -578695597 - 1] = var0;
         } else if (var0.length == 30000 && am * 2134664353 < 976866188 * ao) {
            az[(am += 888307553) * 1395567137 - 1] = var0;
         } else {
            if (ac != null) {
               for(int var2 = 0; var2 < vn.ag.length; ++var2) {
                  if (vn.ag[var2] == var0.length && av.ad[var2] < ac[var2].length) {
                     ac[var2][av.ad[var2]++] = var0;
                     return;
                  }
               }
            }

         }
      }
   }

   public static byte[] ai(int var0, boolean var1) {
      synchronized(ai) {
         byte[] var7;
         if ((-1721468125 == var0 || var0 < -1577788325 && var1) && ay * -927879311 > 0) {
            var7 = af[(ay -= -675860079) * -927879311];
            af[ay * -331285670] = null;
            return var7;
         }

         if ((var0 == 1446181041 || var0 < 5000 && var1) && -440753185 * as > 0) {
            var7 = ar[(as -= 2045091609) * 1705520455];
            ar[as * 1109845465] = null;
            return var7;
         }

         if ((1505163668 == var0 || var0 < 869697217 && var1) && ae * -578695597 > 0) {
            var7 = ab[(ae -= 1057203675) * -578695597];
            ab[-1126871503 * ae] = null;
            return var7;
         }

         if ((var0 == 100464645 || var0 < 353315511 && var1) && 1005190445 * am > 0) {
            var7 = az[(am -= 888307553) * 2134664353];
            az[614933668 * am] = null;
            return var7;
         }

         int var3;
         if (null != ac) {
            for(var3 = 0; var3 < vn.ag.length; ++var3) {
               if ((var0 == vn.ag[var3] || var0 < vn.ag[var3] && var1) && av.ad[var3] > 0) {
                  byte[] var4 = ac[var3][--av.ad[var3]];
                  ac[var3][av.ad[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && null != vn.ag) {
            for(var3 = 0; var3 < vn.ag.length; ++var3) {
               if (var0 <= vn.ag[var3] && av.ad[var3] < ac[var3].length) {
                  return new byte[vn.ag[var3]];
               }
            }
         }
      }

      return new byte[var0];
   }

   public static void am(byte[] var0) {
      synchronized(ai) {
         if (var0.length == 100 && -927879311 * ay < -1032568373 * at) {
            af[(ay += -675860079) * -927879311 - 1] = var0;
         } else if (var0.length == 5000 && as * -440753185 < 442556591 * au) {
            ar[(as += -2145462241) * -440753185 - 1] = var0;
         } else if (var0.length == 10000 && -578695597 * ae < -1277306163 * an) {
            ab[(ae += 1057203675) * -578695597 - 1] = var0;
         } else if (var0.length == 30000 && am * 2134664353 < -1642211417 * ao) {
            az[(am += 888307553) * 2134664353 - 1] = var0;
         } else {
            if (ac != null) {
               for(int var2 = 0; var2 < vn.ag.length; ++var2) {
                  if (vn.ag[var2] == var0.length && av.ad[var2] < ac[var2].length) {
                     ac[var2][av.ad[var2]++] = var0;
                     return;
                  }
               }
            }

         }
      }
   }
}
