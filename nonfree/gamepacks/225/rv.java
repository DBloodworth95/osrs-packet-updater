import java.util.ArrayList;
import java.util.HashMap;

public class rv {
   static final int ac = 1000;
   static final int ae = 250;
   static final int ag = 100;
   static final int am = 50;
   static final Object ax = new Object();
   static int aq = 0;
   static int af = 0;
   static int au = 0;
   static int al = 1613746438;
   static int ar = -881062856;
   static int ad = 1902331180;
   static byte[][] ap = new byte[1000][];
   static int ah = 1714811366;
   static int at = 0;
   static byte[][] ab = new byte[250][];
   static byte[][] az = new byte[100][];
   static byte[][] aa = new byte[50][];
   public static ArrayList ay = new ArrayList();
   static final int bs = 1076101519;

   public static byte[] af(int var0) {
      return gm.ac(var0, false, -1886323809);
   }

   public static byte[] ax(int var0, boolean var1) {
      synchronized(ax) {
         byte[] var7;
         if ((var0 == 100 || var0 < 100 && var1) && aq * -145793157 > 0) {
            var7 = ap[(aq -= 729130931) * -145793157];
            ap[-145793157 * aq] = null;
            return var7;
         }

         if ((5000 == var0 || var0 < 5000 && var1) && af * 616356373 > 0) {
            var7 = ab[(af -= -884005571) * 616356373];
            ab[af * 616356373] = null;
            return var7;
         }

         if ((var0 == 10000 || var0 < 10000 && var1) && at * -1967111483 > 0) {
            var7 = az[(at -= -1696338931) * -1967111483];
            az[at * -1967111483] = null;
            return var7;
         }

         if ((30000 == var0 || var0 < 30000 && var1) && -1928887871 * au > 0) {
            var7 = aa[(au -= 14650945) * -1928887871];
            aa[-1928887871 * au] = null;
            return var7;
         }

         int var3;
         if (null != qt.as) {
            for(var3 = 0; var3 < ns.ai.length; ++var3) {
               if ((var0 == ns.ai[var3] || var0 < ns.ai[var3] && var1) && ge.ao[var3] > 0) {
                  byte[] var4 = qt.as[var3][--ge.ao[var3]];
                  qt.as[var3][ge.ao[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && ns.ai != null) {
            for(var3 = 0; var3 < ns.ai.length; ++var3) {
               if (var0 <= ns.ai[var3] && ge.ao[var3] < qt.as[var3].length) {
                  return new byte[ns.ai[var3]];
               }
            }
         }
      }

      return new byte[var0];
   }

   rv() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "rv.<init>(" + ')');
      }
   }

   public static byte[] am(int var0, boolean var1) {
      synchronized(ax) {
         byte[] var7;
         if ((var0 == 100 || var0 < 100 && var1) && aq * -145793157 > 0) {
            var7 = ap[(aq -= 729130931) * -145793157];
            ap[-145793157 * aq] = null;
            return var7;
         }

         if ((5000 == var0 || var0 < 5000 && var1) && af * 616356373 > 0) {
            var7 = ab[(af -= -884005571) * 616356373];
            ab[af * 616356373] = null;
            return var7;
         }

         if ((var0 == 10000 || var0 < 10000 && var1) && at * -1967111483 > 0) {
            var7 = az[(at -= -1696338931) * -1967111483];
            az[at * -1967111483] = null;
            return var7;
         }

         if ((30000 == var0 || var0 < 30000 && var1) && -1928887871 * au > 0) {
            var7 = aa[(au -= 14650945) * -1928887871];
            aa[-1928887871 * au] = null;
            return var7;
         }

         int var3;
         if (null != qt.as) {
            for(var3 = 0; var3 < ns.ai.length; ++var3) {
               if ((var0 == ns.ai[var3] || var0 < ns.ai[var3] && var1) && ge.ao[var3] > 0) {
                  byte[] var4 = qt.as[var3][--ge.ao[var3]];
                  qt.as[var3][ge.ao[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && ns.ai != null) {
            for(var3 = 0; var3 < ns.ai.length; ++var3) {
               if (var0 <= ns.ai[var3] && ge.ao[var3] < qt.as[var3].length) {
                  return new byte[ns.ai[var3]];
               }
            }
         }
      }

      return new byte[var0];
   }

   public static byte[] aq(int var0) {
      return gm.ac(var0, false, -2102283512);
   }

   static {
      ay.clear();
      ay.add(100);
      ay.add(5000);
      ay.add(10000);
      ay.add(30000);
      new HashMap();
   }

   public static byte[] at(int var0) {
      return gm.ac(var0, false, -1784715246);
   }

   public static void au(byte[] var0) {
      synchronized(ax) {
         if (var0.length == 100 && aq * -145793157 < -1355366693 * ar) {
            ap[(aq += 729130931) * -145793157 - 1] = var0;
         } else if (5000 == var0.length && 616356373 * af < 437920511 * al) {
            ab[(af += -884005571) * 616356373 - 1] = var0;
         } else if (var0.length == 10000 && -1967111483 * at < -1658340949 * ad) {
            az[(at += -1696338931) * -1967111483 - 1] = var0;
         } else if (30000 == var0.length && -1928887871 * au < ah * 1475470787) {
            aa[(au += 14650945) * -1928887871 - 1] = var0;
         } else {
            if (qt.as != null) {
               for(int var2 = 0; var2 < ns.ai.length; ++var2) {
                  if (var0.length == ns.ai[var2] && ge.ao[var2] < qt.as[var2].length) {
                     qt.as[var2][ge.ao[var2]++] = var0;
                     return;
                  }
               }
            }

         }
      }
   }

   public static void ar(byte[] var0) {
      synchronized(ax) {
         if (var0.length == -48607948 && aq * -145793157 < -1355366693 * ar) {
            ap[(aq += 582239178) * -145793157 - 1] = var0;
         } else if (5000 == var0.length && 616356373 * af < -906321835 * al) {
            ab[(af += -884005571) * 616356373 - 1] = var0;
         } else if (var0.length == -2003795821 && -2036301522 * at < -1658340949 * ad) {
            az[(at += -1791412746) * -1967111483 - 1] = var0;
         } else if (30000 == var0.length && -836324026 * au < ah * 1475470787) {
            aa[(au += 14650945) * 981406643 - 1] = var0;
         } else {
            if (qt.as != null) {
               for(int var2 = 0; var2 < ns.ai.length; ++var2) {
                  if (var0.length == ns.ai[var2] && ge.ao[var2] < qt.as[var2].length) {
                     qt.as[var2][ge.ao[var2]++] = var0;
                     return;
                  }
               }
            }

         }
      }
   }
}
