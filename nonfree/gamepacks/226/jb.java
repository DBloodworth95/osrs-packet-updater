import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class jb {
   int ak;
   int aw;
   int ay;
   int aj;
   int ai;
   int ap;
   static int as;
   public static final int bl = 66;

   public static final bm ax(io var0, int var1, int var2, int var3) {
      try {
         if (du.ai * -336955471 == 0) {
            if (var3 != 1978096240) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException();
            }
         } else {
            if (var1 >= 0) {
               if (var3 != 1978096240) {
                  throw new IllegalStateException();
               }

               if (var1 < 2) {
                  if (var2 < 256) {
                     if (var3 != 1978096240) {
                        throw new IllegalStateException();
                     }

                     var2 = 256;
                  }

                  try {
                     bm var4 = bm.ao.ap(1809873212);
                     byte var10001;
                     if (vi.ay) {
                        if (var3 != 1978096240) {
                           throw new IllegalStateException();
                        }

                        var10001 = 2;
                     } else {
                        var10001 = 1;
                     }

                     var4.af = new int[var10001 * 256];
                     var4.ad = -2134188395 * var2;
                     var4.ap((byte)7);
                     var4.ag = -1069600489 * (1024 + (var2 & -1024));
                     if (-1085729113 * var4.ag > 16384) {
                        if (var3 != 1978096240) {
                           throw new IllegalStateException();
                        }

                        var4.ag = -867844096;
                     }

                     var4.aw(var4.ag * -1085729113, -1468287036);
                     if (1834009785 * rd.am > 0) {
                        if (var3 != 1978096240) {
                           throw new IllegalStateException();
                        }

                        if (null == un.at) {
                           if (var3 != 1978096240) {
                              throw new IllegalStateException();
                           }

                           un.at = new bd();
                           as.ae = Executors.newScheduledThreadPool(1);
                           as.ae.scheduleAtFixedRate(un.at, 0L, 10L, TimeUnit.MILLISECONDS);
                        }
                     }

                     if (un.at != null) {
                        if (un.at.ap[var1] != null) {
                           throw new IllegalArgumentException();
                        }

                        un.at.ap[var1] = var4;
                     }

                     return var4;
                  } catch (Throwable var5) {
                     return new bm();
                  }
               }

               if (var3 != 1978096240) {
                  throw new IllegalStateException();
               }
            }

            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "jb.ax(" + ')');
      }
   }

   public static qp aw(byte var0) {
      try {
         synchronized(qp.ap) {
            if (qp.ak * -858242687 == 0) {
               if (var0 >= 6) {
                  throw new IllegalStateException();
               } else {
                  return new qp();
               }
            } else {
               qp.ap[(qp.ak -= 680132225) * -858242687].as((byte)-60);
               return qp.ap[qp.ak * -858242687];
            }
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "jb.aw(" + ')');
      }
   }

   public static void ai(int var0) {
      try {
         gk.ak.aj();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "jb.ai(" + ')');
      }
   }

   jb(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         super();
         this.ap = 1739707099 * var1;
         this.aw = var2 * -1551708553;
         this.ak = var3 * -1991102709;
         this.aj = 2108191201 * var4;
         this.ai = -621999303 * var5;
         this.ay = -1291428745 * var6;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "jb.<init>(" + ')');
      }
   }

   public static void ap(byte var0) {
      try {
         ht.ap.aj();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "jb.ap(" + ')');
      }
   }
}
