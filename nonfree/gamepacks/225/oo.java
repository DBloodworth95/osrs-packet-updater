public class oo implements Runnable {
   static final Object am = new Object();
   public static pk ae = new pk();
   static int ag = 0;
   static final int wb = 4;
   static Thread ax;
   static final int af = 100;
   public static final pk ac = new pk();

   public void dz() {
      try {
         while(true) {
            ox var1;
            synchronized(ac) {
               var1 = (ox)ac.af();
            }

            if (var1 != null) {
               if (var1.ac * -138543647 == 0) {
                  var1.ag.ae((int)var1.hk, var1.ae, var1.ae.length, -1153394345);
                  synchronized(ac) {
                     var1.jb();
                  }
               } else if (1 == -138543647 * var1.ac) {
                  var1.ae = var1.ag.ac((int)var1.hk, (short)4522);
                  synchronized(ac) {
                     ae.ae(var1);
                  }
               }

               synchronized(am) {
                  if (ag * -758269509 <= 1) {
                     ag = 0;
                     am.notifyAll();
                     return;
                  }

                  ag = 123409800;
               }
            } else {
               iv.ac(100L);
               synchronized(am) {
                  if (ag * -2125307640 <= 1) {
                     ag = 0;
                     am.notifyAll();
                     return;
                  }

                  ag -= 1338275710;
               }
            }
         }
      } catch (Exception var13) {
         gc.ac((String)null, var13, (byte)-17);
      }
   }

   public void run() {
      try {
         try {
            while(true) {
               ox var1;
               synchronized(ac) {
                  var1 = (ox)ac.af();
               }

               if (var1 != null) {
                  if (var1.ac * -138543647 == 0) {
                     var1.ag.ae((int)var1.hk, var1.ae, var1.ae.length, -312454047);
                     synchronized(ac) {
                        var1.jb();
                     }
                  } else if (1 == -138543647 * var1.ac) {
                     var1.ae = var1.ag.ac((int)var1.hk, (short)8794);
                     synchronized(ac) {
                        ae.ae(var1);
                     }
                  }

                  synchronized(am) {
                     if (ag * -758269509 <= 1) {
                        ag = 0;
                        am.notifyAll();
                        return;
                     }

                     ag = 123409800;
                  }
               } else {
                  iv.ac(100L);
                  synchronized(am) {
                     if (ag * -758269509 <= 1) {
                        ag = 0;
                        am.notifyAll();
                        return;
                     }

                     ag -= 205683;
                  }
               }
            }
         } catch (Exception var13) {
            gc.ac((String)null, var13, (byte)-23);
         }
      } catch (RuntimeException var14) {
         throw vk.ae(var14, "oo.run(" + ')');
      }
   }

   public void da() {
      try {
         while(true) {
            ox var1;
            synchronized(ac) {
               var1 = (ox)ac.af();
            }

            if (var1 != null) {
               if (var1.ac * -138543647 == 0) {
                  var1.ag.ae((int)var1.hk, var1.ae, var1.ae.length, -1888707952);
                  synchronized(ac) {
                     var1.jb();
                  }
               } else if (1 == -138543647 * var1.ac) {
                  var1.ae = var1.ag.ac((int)var1.hk, (short)3517);
                  synchronized(ac) {
                     ae.ae(var1);
                  }
               }

               synchronized(am) {
                  if (ag * -758269509 <= 1) {
                     ag = 0;
                     am.notifyAll();
                     return;
                  }

                  ag = 123409800;
               }
            } else {
               iv.ac(100L);
               synchronized(am) {
                  if (ag * -758269509 <= 1) {
                     ag = 0;
                     am.notifyAll();
                     return;
                  }

                  ag -= 205683;
               }
            }
         }
      } catch (Exception var13) {
         gc.ac((String)null, var13, (byte)-33);
      }
   }

   static void au(int var0, sl var1, of var2) {
      byte[] var3 = null;
      synchronized(ac) {
         for(ox var5 = (ox)ac.af(); null != var5; var5 = (ox)ac.au()) {
            if ((long)var0 == var5.hk && var1 == var5.ag && 0 == var5.ac * -138543647) {
               var3 = var5.ae;
               break;
            }
         }
      }

      if (var3 != null) {
         var2.at(var1, var0, var3, true, 1779832793);
      } else {
         byte[] var4 = var1.ac(var0, (short)-10025);
         var2.at(var1, var0, var4, true, 1658390321);
      }
   }

   static void ax(int var0, byte[] var1, sl var2) {
      ox var3 = new ox();
      var3.ac = 0;
      var3.hk = (long)var0;
      var3.ae = var1;
      var3.ag = var2;
      synchronized(ac) {
         ac.ae(var3);
      }

      synchronized(am) {
         if (ag * 1159023596 == 0) {
            ax = new Thread(new oo());
            ax.setDaemon(true);
            ax.start();
            ax.setPriority(5);
         }

         ag = 123409800;
      }
   }

   oo() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "oo.<init>(" + ')');
      }
   }

   static void af(int var0, byte[] var1, sl var2) {
      ox var3 = new ox();
      var3.ac = 0;
      var3.hk = (long)var0;
      var3.ae = var1;
      var3.ag = var2;
      synchronized(ac) {
         ac.ae(var3);
      }

      synchronized(am) {
         if (ag * -758269509 == 0) {
            ax = new Thread(new oo());
            ax.setDaemon(true);
            ax.start();
            ax.setPriority(5);
         }

         ag = 1870961849;
      }
   }

   static void at(int var0, sl var1, of var2) {
      byte[] var3 = null;
      synchronized(ac) {
         for(ox var5 = (ox)ac.af(); null != var5; var5 = (ox)ac.au()) {
            if ((long)var0 == var5.hk && var1 == var5.ag && 0 == var5.ac * -138543647) {
               var3 = var5.ae;
               break;
            }
         }
      }

      if (var3 != null) {
         var2.at(var1, var0, var3, true, 1619710496);
      } else {
         byte[] var4 = var1.ac(var0, (short)17368);
         var2.at(var1, var0, var4, true, 1635967448);
      }
   }

   static void aq(int var0, byte[] var1, sl var2) {
      ox var3 = new ox();
      var3.ac = 0;
      var3.hk = (long)var0;
      var3.ae = var1;
      var3.ag = var2;
      synchronized(ac) {
         ac.ae(var3);
      }

      synchronized(am) {
         if (ag * -758269509 == 0) {
            ax = new Thread(new oo());
            ax.setDaemon(true);
            ax.start();
            ax.setPriority(5);
         }

         ag = -159968902;
      }
   }

   static void ar(int var0, sl var1, of var2) {
      byte[] var3 = null;
      synchronized(ac) {
         for(ox var5 = (ox)ac.af(); null != var5; var5 = (ox)ac.au()) {
            if ((long)var0 == var5.hk && var1 == var5.ag && 0 == var5.ac * -138543647) {
               var3 = var5.ae;
               break;
            }
         }
      }

      if (var3 != null) {
         var2.at(var1, var0, var3, true, 1913963196);
      } else {
         byte[] var4 = var1.ac(var0, (short)21738);
         var2.at(var1, var0, var4, true, 2112325613);
      }
   }

   public static void al() {
      synchronized(am) {
         if (0 != ag * -758269509) {
            ag = 205683;

            try {
               am.wait();
            } catch (InterruptedException var5) {
            }
         }
      }

      synchronized(ac) {
         ac.ac();
         ae.ac();
      }
   }
}
