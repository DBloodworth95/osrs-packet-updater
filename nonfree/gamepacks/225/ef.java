import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ef implements ps {
   static final ef ae = new ef(1);
   static final int bj = 50;
   static final ef ax = new ef(4);
   static final ef am = new ef(3);
   static final ef ac = new ef(0);
   final int aq;
   static final int bn = 29;
   static final ef ag = new ef(2);

   public static fo ac(po var0, po var1, int var2, boolean var3, int var4) {
      try {
         boolean var5 = true;
         byte[] var6 = var0.cf(var2 >> 16 & '\uffff', var2 & '\uffff', (byte)1);
         if (var6 == null) {
            if (var4 != -1892237793) {
               throw new IllegalStateException();
            } else {
               var5 = false;
               return null;
            }
         } else {
            int var7 = (var6[1] & 255) << 8 | var6[2] & 255;
            byte[] var8;
            if (var3) {
               if (var4 != -1892237793) {
                  throw new IllegalStateException();
               }

               var8 = var1.cf(0, var7, (byte)1);
            } else {
               var8 = var1.cf(var7, 0, (byte)1);
            }

            if (var8 == null) {
               var5 = false;
            }

            if (!var5) {
               if (var4 != -1892237793) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               if (null == tc.at) {
                  if (var4 != -1892237793) {
                     throw new IllegalStateException();
                  }

                  cc.af = Runtime.getRuntime().availableProcessors() * -2051265879;
                  tc.at = new ThreadPoolExecutor(0, cc.af * -77588071, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + 831127492 * cc.af), new fq());
               }

               try {
                  return new fo(var0, var1, var2, var3);
               } catch (Exception var10) {
                  return null;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "ef.ac(" + ')');
      }
   }

   ef(int var1) {
      try {
         super();
         this.aq = -1775311251 * var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ef.<init>(" + ')');
      }
   }

   public int am() {
      return this.aq * 177317108;
   }

   public int ae() {
      return this.aq * 2061046629;
   }

   public int ag() {
      return this.aq * 2061046629;
   }

   public static int at(int var0, int var1, int var2, int var3) {
      try {
         if (var1 < var0) {
            if (var3 != -565314116) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
            }
         } else {
            return Math.max(var0, Math.min(var2, var1));
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ef.at(" + ')');
      }
   }

   public int ac(int var1) {
      try {
         return this.aq * 2061046629;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ef.ac(" + ')');
      }
   }
}
