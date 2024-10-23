import java.util.Iterator;

public class fp implements ph {
   static final fp ap = new fp(0, 0);
   static final fp aw = new fp(1, 1);
   static final int bp = 40;
   static final fp aj = new fp(3, 3);
   static final fp ai = new fp(4, 4);
   final int ay;
   public static final int ae = 10;
   static final fp ak = new fp(2, 2);
   public static final int cl = 81;
   static final int au = 30;
   final int as;

   static fp ak(int var0) {
      fp[] var1 = new fp[]{ap, aw, ak, aj, ai};
      fp var2 = (fp)gu.ap(var1, var0, -1875781163);
      if (null == var2) {
         var2 = ap;
      }

      return var2;
   }

   fp(int var1, int var2) {
      try {
         super();
         this.ay = 1367299107 * var1;
         this.as = var2 * -255233495;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fp.<init>(" + ')');
      }
   }

   public int as() {
      return -1456190951 * this.as;
   }

   public static boolean ot(int var0) {
      try {
         return client.pw * 1797447449 >= 2;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "fp.ot(" + ')');
      }
   }

   static fp aj(int var0) {
      fp[] var1 = new fp[]{ap, aw, ak, aj, ai};
      fp var2 = (fp)gu.ap(var1, var0, -1875781163);
      if (null == var2) {
         var2 = ap;
      }

      return var2;
   }

   public int aw(int var1) {
      try {
         return -1456190951 * this.as;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fp.aw(" + ')');
      }
   }

   static long hu(byte var0) {
      try {
         return client.mq * 2981942304363012013L;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "fp.hu(" + ')');
      }
   }

   static final void hv(byte var0) {
      try {
         int[] var1 = client.jp.am;
         Iterator var2 = client.jv.iterator();

         while(var2.hasNext()) {
            if (var0 != 1) {
               throw new IllegalStateException();
            }

            dn var3 = (dn)var2.next();

            int var4;
            for(var4 = 0; var4 < -562349667 * client.jp.ae; ++var4) {
               if (var0 != 1) {
                  return;
               }

               dv var5 = var3.an[var1[var4]];
               if (null != var5) {
                  if (var0 != 1) {
                     throw new IllegalStateException();
                  }

                  if (var5.cb * -965596719 > 0) {
                     var5.cb -= 242667313;
                     if (0 == -965596719 * var5.cb) {
                        var5.bl = null;
                     }
                  }
               }
            }

            for(var4 = 0; var4 < 2099244795 * var3.af; ++var4) {
               if (var0 != 1) {
                  throw new IllegalStateException();
               }

               int var8 = var3.ar[var4];
               ev var6 = var3.ao[var8];
               if (null != var6) {
                  if (var0 != 1) {
                     throw new IllegalStateException();
                  }

                  if (-965596719 * var6.cb > 0) {
                     if (var0 != 1) {
                        throw new IllegalStateException();
                     }

                     var6.cb -= 242667313;
                     if (-965596719 * var6.cb == 0) {
                        if (var0 != 1) {
                           throw new IllegalStateException();
                        }

                        var6.bl = null;
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw tm.aw(var7, "fp.hv(" + ')');
      }
   }
}
