import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ar {
   final ThreadFactory ak;
   final String aw;
   static final String hd = "JX_ACCESS_TOKEN";
   final ThreadPoolExecutor aj;
   static final int cj = 89;
   final int ap;
   public static final int am = 3;
   static final int by = 51;
   public static final int ca = 96;

   public final void ak(int var1) {
      try {
         try {
            this.aj.shutdown();
         } catch (Exception var3) {
            System.err.println("Error shutting down RestRequestService\r\n" + var3);
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ar.ak(" + ')');
      }
   }

   final ThreadPoolExecutor ap(int var1, byte var2) {
      try {
         return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.ap * 692917959), this.ak);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ar.ap(" + ')');
      }
   }

   public ad aw(au var1, byte var2) {
      try {
         if (this.aj.getQueue().remainingCapacity() <= 0) {
            if (var2 >= 8) {
               throw new IllegalStateException();
            } else {
               System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.aj.getCorePoolSize() + " Queue capacity " + this.ap * 692917959);
               return new ad("Queue full");
            }
         } else {
            ad var3 = new ad(this.aj.submit(new ac(this, var1)));
            return var3;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ar.aw(" + ')');
      }
   }

   static void pt(byte var0) {
      try {
         for(int var1 = 0; var1 < client.wa.size(); ++var1) {
            if (fu.af((Integer)client.wa.get(var1), (byte)4) != 2) {
               if (var0 <= -1) {
                  throw new IllegalStateException();
               }

               client.wa.remove(var1);
               --var1;
            }
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ar.pt(" + ')');
      }
   }

   public ar(String var1, int var2, int var3) {
      try {
         super();
         this.aw = var1;
         this.ap = -1171600649 * var2;
         this.ak = new az(this);
         this.aj = this.ap(var3, (byte)-118);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ar.<init>(" + ')');
      }
   }

   static final void ig(dn var0, byte var1) {
      try {
         for(ca var2 = (ca)var0.ax.as(); null != var2; var2 = (ca)var0.ax.am()) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            if (-94166123 * var2.ak == var0.aj * 86027145) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               if (!var2.at) {
                  if (-330508271 * client.dt >= var2.aw * 1453685285) {
                     var2.ap(-1815114593 * client.jh, (byte)-27);
                     if (var2.at) {
                        var2.kf();
                     } else {
                        var0.aw.ar(var2.ak * -94166123, 373231719 * var2.aj, var2.ai * 234359759, var2.ay * 866033949, 60, var2, 0, -1L, false);
                     }
                  }
                  continue;
               }

               if (var1 <= 0) {
                  throw new IllegalStateException();
               }
            }

            var2.kf();
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ar.ig(" + ')');
      }
   }

   final ThreadPoolExecutor aj(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.ap * 692917959), this.ak);
   }

   final ThreadPoolExecutor ai(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.ap * 107064474), this.ak);
   }

   public ad ae(au var1) {
      if (this.aj.getQueue().remainingCapacity() <= 0) {
         System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.aj.getCorePoolSize() + " Queue capacity " + this.ap * 692917959);
         return new ad("Queue full");
      } else {
         ad var2 = new ad(this.aj.submit(new ac(this, var1)));
         return var2;
      }
   }

   public final void am() {
      try {
         this.aj.shutdown();
      } catch (Exception var2) {
         System.err.println("Error shutting down RestRequestService\r\n" + var2);
      }

   }

   public final void at() {
      try {
         this.aj.shutdown();
      } catch (Exception var2) {
         System.err.println("Error shutting down RestRequestService\r\n" + var2);
      }

   }

   static final int lo(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8, byte var9) {
      try {
         if (client.nr) {
            if (var9 == 2) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return !co.lt(var8, var2, (byte)-45) ? -1 : client.ng.an(var0, var1, var2, var3, var4, var5, var6, var7, var8, 843542173);
         }
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "ar.lo(" + ')');
      }
   }

   public static hc aw(int var0, int var1) {
      try {
         if (var0 >= 0) {
            if (var1 <= 1525143606) {
               throw new IllegalStateException();
            }

            if (var0 < hc.aw.length) {
               if (var1 <= 1525143606) {
                  throw new IllegalStateException();
               }

               if (null != hc.aw[var0]) {
                  if (var1 <= 1525143606) {
                     throw new IllegalStateException();
                  }

                  return hc.aw[var0];
               }
            }
         }

         return new hc(var0);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ar.aw(" + ')');
      }
   }

   public static void as(int var0) {
      try {
         try {
            iq.ao.ap((byte)92);

            for(int var1 = 0; var1 < iq.ay * -372511661; ++var1) {
               if (var0 <= 1234134587) {
                  throw new IllegalStateException();
               }

               et.ar[var1].ap((byte)76);
            }

            iq.af.ap((byte)-11);
            iq.an.ap((byte)-93);
         } catch (Exception var2) {
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ar.as(" + ')');
      }
   }

   final ThreadPoolExecutor ay(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.ap * 692917959), this.ak);
   }

   static final void ny(int var0, int var1, int var2, int var3, vv var4, nw var5, int var6) {
      try {
         int var7 = var3 * var3 + var2 * var2;
         if (var7 > 4225) {
            if (var6 != -1398773994) {
               return;
            }

            if (var7 < 90000) {
               if (var6 != -1398773994) {
                  throw new IllegalStateException();
               }

               int var8 = 1833510775 * client.kb & 2047;
               int var9 = jm.aj[var8];
               int var10 = jm.ai[var8];
               int var11 = var3 * var9 + var10 * var2 >> 16;
               int var12 = var10 * var3 - var2 * var9 >> 16;
               double var13 = Math.atan2((double)var11, (double)var12);
               int var15 = var5.ap * -210833969 / 2 - 25;
               int var16 = (int)(Math.sin(var13) * (double)var15);
               int var17 = (int)(Math.cos(var13) * (double)var15);
               byte var18 = 20;
               qv.kh.bk(var16 + (var5.ap * -210833969 / 2 + var0 - var18 / 2), var5.aw * 736216811 / 2 + var1 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
               return;
            }
         }

         qo.nk(var0, var1, var2, var3, var4, var5, (short)27112);
      } catch (RuntimeException var19) {
         throw tm.aw(var19, "ar.ny(" + ')');
      }
   }

   public ad as(au var1) {
      if (this.aj.getQueue().remainingCapacity() <= 0) {
         System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.aj.getCorePoolSize() + " Queue capacity " + this.ap * 692917959);
         return new ad("Queue full");
      } else {
         ad var2 = new ad(this.aj.submit(new ac(this, var1)));
         return var2;
      }
   }

   static void gw(or var0, String var1, int var2) {
      try {
         du var3 = new du(var0, var1);
         client.wt.add(var3);
         client.wu += -776051917 * var3.ak;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ar.gw(" + ')');
      }
   }
}
