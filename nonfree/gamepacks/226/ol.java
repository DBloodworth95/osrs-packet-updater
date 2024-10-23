public class ol implements Runnable {
   public static final int am = 11;
   public static pu aw = new pu();
   static int ak = 0;
   static final Object aj = new Object();
   public static final pu ap = new pu();
   static Thread ai;
   static final int as = 100;
   public static short[] au;
   static final int ay = 600;

   static void am(int var0, sl var1, or var2) {
      byte[] var3 = null;
      synchronized(ap) {
         for(op var5 = (op)ap.as(); null != var5; var5 = (op)ap.am()) {
            if ((long)var0 == var5.ht && var5.ak == var1 && var5.ap * -29242609 == 0) {
               var3 = var5.aw;
               break;
            }
         }
      }

      if (var3 != null) {
         var2.ae(var1, var0, var3, true, (byte)-70);
      } else {
         byte[] var4 = var1.ap(var0, -1776249852);
         var2.ae(var1, var0, var4, true, (byte)68);
      }
   }

   static void au() {
      synchronized(aj) {
         if (ak * -411214707 == 0) {
            ai = new Thread(new ol());
            ai.setDaemon(true);
            ai.start();
            ai.setPriority(5);
         }

         ak = 1586016696;
      }
   }

   public static void ao() {
      synchronized(aj) {
         if (0 != ak * -411214707) {
            ak = 711312965;

            try {
               aj.wait();
            } catch (InterruptedException var5) {
            }
         }
      }

      synchronized(ap) {
         ap.ap();
         aw.ap();
      }
   }

   public void dk() {
      try {
         while(true) {
            op var1;
            synchronized(ap) {
               var1 = (op)ap.as();
            }

            if (var1 != null) {
               if (var1.ap * -794406021 == 0) {
                  var1.ak.aw((int)var1.ht, var1.aw, var1.aw.length, 15625632);
                  synchronized(ap) {
                     var1.kf();
                  }
               } else if (var1.ap * -29242609 == 1) {
                  var1.aw = var1.ak.ap((int)var1.ht, -1776249852);
                  synchronized(ap) {
                     aw.aw(var1);
                  }
               }

               synchronized(aj) {
                  if (ak * 229711963 <= 1) {
                     ak = 0;
                     aj.notifyAll();
                     return;
                  }

                  ak = -98966319;
               }
            } else {
               ct.ap(100L);
               synchronized(aj) {
                  if (-411214707 * ak <= 1) {
                     ak = 0;
                     aj.notifyAll();
                     return;
                  }

                  ak -= -1219951133;
               }
            }
         }
      } catch (Exception var13) {
         rl.ap((String)null, var13, (byte)-3);
      }
   }

   static void ai(int var0, byte[] var1, sl var2) {
      op var3 = new op();
      var3.ap = 0;
      var3.ht = (long)var0;
      var3.aw = var1;
      var3.ak = var2;
      synchronized(ap) {
         ap.aw(var3);
      }

      ll.ak(872089321);
   }

   static void ay(int var0, byte[] var1, sl var2) {
      op var3 = new op();
      var3.ap = 0;
      var3.ht = (long)var0;
      var3.aw = var1;
      var3.ak = var2;
      synchronized(ap) {
         ap.aw(var3);
      }

      ll.ak(1295620606);
   }

   static void as(int var0, sl var1, or var2) {
      byte[] var3 = null;
      synchronized(ap) {
         for(op var5 = (op)ap.as(); null != var5; var5 = (op)ap.am()) {
            if ((long)var0 == var5.ht && var5.ak == var1 && var5.ap * -29242609 == 0) {
               var3 = var5.aw;
               break;
            }
         }
      }

      if (var3 != null) {
         var2.ae(var1, var0, var3, true, (byte)48);
      } else {
         byte[] var4 = var1.ap(var0, -1776249852);
         var2.ae(var1, var0, var4, true, (byte)72);
      }
   }

   static void ae(int var0, sl var1, or var2) {
      byte[] var3 = null;
      synchronized(ap) {
         for(op var5 = (op)ap.as(); null != var5; var5 = (op)ap.am()) {
            if ((long)var0 == var5.ht && var5.ak == var1 && var5.ap * 178095284 == 0) {
               var3 = var5.aw;
               break;
            }
         }
      }

      if (var3 != null) {
         var2.ae(var1, var0, var3, true, (byte)50);
      } else {
         byte[] var4 = var1.ap(var0, -1776249852);
         var2.ae(var1, var0, var4, true, (byte)-29);
      }
   }

   ol() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ol.<init>(" + ')');
      }
   }

   static void at() {
      synchronized(aj) {
         if (ak * -411214707 == 0) {
            ai = new Thread(new ol());
            ai.setDaemon(true);
            ai.start();
            ai.setPriority(5);
         }

         ak = 161958932;
      }
   }

   static void an() {
      synchronized(aj) {
         if (ak * -411214707 == 0) {
            ai = new Thread(new ol());
            ai.setDaemon(true);
            ai.start();
            ai.setPriority(5);
         }

         ak = -843876192;
      }
   }

   public void run() {
      try {
         try {
            while(true) {
               op var1;
               synchronized(ap) {
                  var1 = (op)ap.as();
               }

               if (var1 != null) {
                  if (var1.ap * -29242609 == 0) {
                     var1.ak.aw((int)var1.ht, var1.aw, var1.aw.length, 15625632);
                     synchronized(ap) {
                        var1.kf();
                     }
                  } else if (var1.ap * -29242609 == 1) {
                     var1.aw = var1.ak.ap((int)var1.ht, -1776249852);
                     synchronized(ap) {
                        aw.aw(var1);
                     }
                  }

                  synchronized(aj) {
                     if (ak * -411214707 <= 1) {
                        ak = 0;
                        aj.notifyAll();
                        return;
                     }

                     ak = 1586016696;
                  }
               } else {
                  ct.ap(100L);
                  synchronized(aj) {
                     if (-411214707 * ak <= 1) {
                        ak = 0;
                        aj.notifyAll();
                        return;
                     }

                     ak -= 711312965;
                  }
               }
            }
         } catch (Exception var13) {
            rl.ap((String)null, var13, (byte)-30);
         }
      } catch (RuntimeException var14) {
         throw tm.aw(var14, "ol.run(" + ')');
      }
   }

   public static void af() {
      synchronized(aj) {
         if (0 != ak * 741851709) {
            ak = -1985052481;

            try {
               aj.wait();
            } catch (InterruptedException var5) {
            }
         }
      }

      synchronized(ap) {
         ap.ap();
         aw.ap();
      }
   }

   public static vc[] aj(pe var0, String var1, String var2, int var3) {
      try {
         if (!var0.cp(var1, var2, -637561867)) {
            if (var3 <= -1875781163) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = var0.cf(var1, (byte)48);
            int var5 = var0.cl(var4, var2, (short)-19519);
            vc[] var6;
            if (!cb.am(var0, var4, var5, 425679671)) {
               if (var3 <= -1875781163) {
                  throw new IllegalStateException();
               }

               var6 = null;
            } else {
               vc[] var8 = new vc[1934102439 * wk.ap];

               for(int var9 = 0; var9 < wk.ap * 1934102439; ++var9) {
                  vc var10 = var8[var9] = new vc();
                  var10.as = wk.aw * -1147402861;
                  var10.ae = -201283629 * wk.ak;
                  var10.ai = wk.aj[var9];
                  var10.ay = tl.ai[var9];
                  var10.ak = ae.ay[var9];
                  var10.aj = wk.as[var9];
                  var10.aw = wk.ae;
                  var10.ap = ks.am[var9];
               }

               wk.aj = null;
               tl.ai = null;
               ae.ay = null;
               wk.as = null;
               wk.ae = null;
               ks.am = (byte[][])null;
               var6 = var8;
            }

            return var6;
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "ol.aj(" + ')');
      }
   }
}
