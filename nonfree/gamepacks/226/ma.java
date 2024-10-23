import java.net.URL;

public class ma {
   public static final int as = 8;
   static final int aj = 4;
   static byte[][] jc;

   ma() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ma.<init>(" + ')');
      }
   }

   public static final void ak(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            al.aw(var0 - 1L);
            al.aw(1L);
         } else {
            al.aw(var0);
         }

      }
   }

   public static final void aj(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            al.aw(var0 - 1L);
            al.aw(1L);
         } else {
            al.aw(var0);
         }

      }
   }

   public static final void ai(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            al.aw(var0 - 1L);
            al.aw(1L);
         } else {
            al.aw(var0);
         }

      }
   }

   public static final void ay(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            al.aw(var0 - 1L);
            al.aw(1L);
         } else {
            al.aw(var0);
         }

      }
   }

   public static final void as(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            al.aw(var0 - 1L);
            al.aw(1L);
         } else {
            al.aw(var0);
         }

      }
   }

   static final void ae(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
      }

   }

   static boolean is(int var0) {
      try {
         boolean var10000;
         if ((-852470597 * client.ni & 2) != 0) {
            if (var0 != 32833) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ma.is(" + ')');
      }
   }

   static boolean ap(int var0) {
      try {
         try {
            if (null == sk.at) {
               if (var0 != -198524027) {
                  throw new IllegalStateException();
               }

               sk.at = kd.ic.ai(new URL(cu.cv), (short)326);
            } else if (sk.at.ap(818421392)) {
               if (var0 != -198524027) {
                  throw new IllegalStateException();
               }

               byte[] var1 = sk.at.aw((byte)12);
               vl var2 = new vl(var1);
               var2.ch(1203709469);
               ct.ay = var2.ce(531011553) * 265695393;
               ct.ai = new ct[24621921 * ct.ay];

               for(int var3 = 0; var3 < 24621921 * ct.ay; ++var3) {
                  if (var0 != -198524027) {
                     throw new IllegalStateException();
                  }

                  ct var4 = ct.ai[var3] = new ct();
                  var4.au = var2.ce(770935990) * -1970792961;
                  var4.an = var2.ch(1203709469) * 1184955001;
                  var4.af = var2.cw(2083569460);
                  var4.ar = var2.cw(2125434235);
                  var4.ab = var2.cy((short)-19485) * -1864667775;
                  var4.ao = var2.cg(-2109876821) * -1116812577;
                  var4.az = var3 * -181287013;
               }

               fa.ak(ct.ai, 0, ct.ai.length - 1, ct.am, ct.ae, 2033471635);
               sk.at = null;
               return true;
            }
         } catch (Exception var5) {
            var5.printStackTrace();
            sk.at = null;
         }

         return false;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ma.ap(" + ')');
      }
   }
}
