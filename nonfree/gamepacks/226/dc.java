import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class dc {
   ExecutorService ap;
   Future aw;
   static final int ac = 2097152;
   static final int ba = 56;
   public static final int ab = 14;
   public static final int ao = 11;

   public static void aw(String[] var0, int[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            if (var4 == 725523174) {
               throw new IllegalStateException();
            }

            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for(int var9 = var2; var9 < var3; ++var9) {
               if (var4 == 725523174) {
                  throw new IllegalStateException();
               }

               if (null != var7) {
                  if (var4 == 725523174) {
                     throw new IllegalStateException();
                  }

                  if (var0[var9] == null) {
                     continue;
                  }

                  if (var4 == 725523174) {
                     throw new IllegalStateException();
                  }

                  if (var0[var9].compareTo(var7) >= (var9 & 1)) {
                     continue;
                  }
               }

               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            aw(var0, var1, var2, var6 - 1, 283773426);
            aw(var0, var1, 1 + var6, var3, -2005052521);
         }

      } catch (RuntimeException var12) {
         throw tm.aw(var12, "dc.aw(" + ')');
      }
   }

   void ap(byte var1) {
      try {
         this.ap.shutdown();
         this.ap = null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dc.ap(" + ')');
      }
   }

   SecureRandom ay() {
      try {
         return (SecureRandom)this.aw.get();
      } catch (Exception var2) {
         return mv.ai(1833321880);
      }
   }

   SecureRandom ak(int var1) {
      try {
         try {
            return (SecureRandom)this.aw.get();
         } catch (Exception var3) {
            return mv.ai(-908205463);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "dc.ak(" + ')');
      }
   }

   SecureRandom ae() {
      try {
         return (SecureRandom)this.aw.get();
      } catch (Exception var2) {
         return mv.ai(1038582339);
      }
   }

   boolean ai() {
      return this.aw.isDone();
   }

   boolean aj() {
      return this.aw.isDone();
   }

   SecureRandom as() {
      try {
         return (SecureRandom)this.aw.get();
      } catch (Exception var2) {
         return mv.ai(8134455);
      }
   }

   static boolean od(ng var0, int var1) {
      try {
         return var0.bf;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dc.od(" + ')');
      }
   }

   public static hv aw(int var0, byte var1) {
      try {
         hv var2 = (hv)hv.aw.ap((long)var0);
         if (null != var2) {
            if (var1 != 1) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = hv.ap.bm(1, var0, 1934999639);
            var2 = new hv();
            if (var3 != null) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               var2.aj(new vl(var3), var0, -1828361255);
            }

            var2.ak(156525056);
            hv.aw.ak(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "dc.aw(" + ')');
      }
   }

   dc() {
      try {
         super();
         this.ap = Executors.newSingleThreadExecutor();
         this.aw = this.ap.submit(new df());
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "dc.<init>(" + ')');
      }
   }

   boolean aw(int var1) {
      try {
         return this.aw.isDone();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dc.aw(" + ')');
      }
   }

   public static qi ak(pe var0, pe var1, int var2, int var3, int var4) {
      try {
         if (!cb.am(var0, var2, var3, 1493212349)) {
            if (var4 >= 320159240) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            byte[] var6 = var1.bm(var2, var3, 965960375);
            qi var5;
            if (null == var6) {
               var5 = null;
            } else {
               qi var7 = new qi(var6, wk.aj, tl.ai, ae.ay, wk.as, wk.ae, ks.am);
               wk.aj = null;
               tl.ai = null;
               ae.ay = null;
               wk.as = null;
               wk.ae = null;
               ks.am = (byte[][])null;
               var5 = var7;
            }

            return var5;
         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "dc.ak(" + ')');
      }
   }
}
