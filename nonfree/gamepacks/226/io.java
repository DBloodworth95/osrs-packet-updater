import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class io implements Runnable {
   iz aj;
   public static String aw;
   iz ak;
   static final int df = 128;
   public static String ap;
   boolean ay;
   static final int ae = 2;
   static di vx;
   Thread ai;
   public static final int au = 1792;

   public final iz ab(String var1, int var2) {
      return this.aw(1, var2, 0, var1, -565041497);
   }

   public final void ap(byte var1) {
      try {
         synchronized(this) {
            this.ay = true;
            this.notifyAll();
         }

         try {
            this.ai.join();
         } catch (InterruptedException var4) {
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "io.ap(" + ')');
      }
   }

   public final void run() {
      try {
         while(true) {
            iz var1;
            synchronized(this) {
               while(true) {
                  if (this.ay) {
                     return;
                  }

                  if (this.ak != null) {
                     var1 = this.ak;
                     this.ak = this.ak.ap;
                     if (this.ak == null) {
                        this.aj = null;
                     }
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var7) {
                  }
               }
            }

            try {
               int var2 = var1.ai * -1800729751;
               if (var2 == 1) {
                  var1.ae = new Socket(InetAddress.getByName((String)var1.as), var1.ay);
               } else if (var2 == 2) {
                  Thread var3 = new Thread((Runnable)var1.as);
                  var3.setDaemon(true);
                  var3.start();
                  var3.setPriority(var1.ay);
                  var1.ae = var3;
               } else if (var2 == 4) {
                  var1.ae = new DataInputStream(((URL)var1.as).openStream());
               }

               var1.aj = 1;
            } catch (ThreadDeath var5) {
               throw var5;
            } catch (Throwable var6) {
               var1.aj = 2;
            }
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "io.run(" + ')');
      }
   }

   final iz aw(int var1, int var2, int var3, Object var4, int var5) {
      try {
         iz var6 = new iz();
         var6.ai = var1 * -1696451367;
         var6.ay = var2;
         var6.as = var4;
         synchronized(this) {
            if (this.aj != null) {
               this.aj.ap = var6;
               this.aj = var6;
            } else {
               this.aj = this.ak = var6;
            }

            this.notify();
            return var6;
         }
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "io.aw(" + ')');
      }
   }

   public final iz ak(String var1, int var2, int var3) {
      try {
         return this.aw(1, var2, 0, var1, -565041497);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "io.ak(" + ')');
      }
   }

   public final iz aj(Runnable var1, int var2, int var3) {
      try {
         return this.aw(2, var2, 0, var1, -565041497);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "io.aj(" + ')');
      }
   }

   public final void ae() {
      synchronized(this) {
         this.ay = true;
         this.notifyAll();
      }

      try {
         this.ai.join();
      } catch (InterruptedException var3) {
      }

   }

   public final void ai() {
      synchronized(this) {
         this.ay = true;
         this.notifyAll();
      }

      try {
         this.ai.join();
      } catch (InterruptedException var3) {
      }

   }

   public final void ay() {
      synchronized(this) {
         this.ay = true;
         this.notifyAll();
      }

      try {
         this.ai.join();
      } catch (InterruptedException var3) {
      }

   }

   public final void as() {
      synchronized(this) {
         this.ay = true;
         this.notifyAll();
      }

      try {
         this.ai.join();
      } catch (InterruptedException var3) {
      }

   }

   public final iz ag(Runnable var1, int var2) {
      return this.aw(2, var2, 0, var1, -565041497);
   }

   public final iz af(String var1, int var2) {
      return this.aw(1, var2, 0, var1, -565041497);
   }

   public final iz ao(String var1, int var2) {
      return this.aw(1, var2, 0, var1, -565041497);
   }

   final iz au(int var1, int var2, int var3, Object var4) {
      iz var5 = new iz();
      var5.ai = var1 * -1696451367;
      var5.ay = var2;
      var5.as = var4;
      synchronized(this) {
         if (this.aj != null) {
            this.aj.ap = var5;
            this.aj = var5;
         } else {
            this.aj = this.ak = var5;
         }

         this.notify();
         return var5;
      }
   }

   public final iz an(String var1, int var2) {
      return this.aw(1, var2, 0, var1, -565041497);
   }

   public final iz az(String var1, int var2) {
      return this.aw(1, var2, 0, var1, -565041497);
   }

   public final void dk() {
      while(true) {
         iz var1;
         synchronized(this) {
            while(true) {
               if (this.ay) {
                  return;
               }

               if (this.ak != null) {
                  var1 = this.ak;
                  this.ak = this.ak.ap;
                  if (this.ak == null) {
                     this.aj = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var7) {
               }
            }
         }

         try {
            int var2 = var1.ai * 1079469137;
            if (var2 == 1) {
               var1.ae = new Socket(InetAddress.getByName((String)var1.as), var1.ay);
            } else if (var2 == 2) {
               Thread var3 = new Thread((Runnable)var1.as);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.ay);
               var1.ae = var3;
            } else if (var2 == 4) {
               var1.ae = new DataInputStream(((URL)var1.as).openStream());
            }

            var1.aj = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.aj = 2;
         }
      }
   }

   public final iz ar(String var1, int var2) {
      return this.aw(1, var2, 0, var1, -565041497);
   }

   final iz at(int var1, int var2, int var3, Object var4) {
      iz var5 = new iz();
      var5.ai = var1 * -1051435301;
      var5.ay = var2;
      var5.as = var4;
      synchronized(this) {
         if (this.aj != null) {
            this.aj.ap = var5;
            this.aj = var5;
         } else {
            this.aj = this.ak = var5;
         }

         this.notify();
         return var5;
      }
   }

   public static final int ap(double var0, double var2, double var4) {
      try {
         double var6 = var4;
         double var8 = var4;
         double var10 = var4;
         if (var2 != 0.0D) {
            double var12;
            if (var4 < 0.5D) {
               var12 = (1.0D + var2) * var4;
            } else {
               var12 = var4 + var2 - var4 * var2;
            }

            double var14 = var4 * 2.0D - var12;
            double var16 = 0.3333333333333333D + var0;
            if (var16 > 1.0D) {
               --var16;
            }

            double var20 = var0 - 0.3333333333333333D;
            if (var20 < 0.0D) {
               ++var20;
            }

            if (6.0D * var16 < 1.0D) {
               var6 = var14 + var16 * (var12 - var14) * 6.0D;
            } else if (var16 * 2.0D < 1.0D) {
               var6 = var12;
            } else if (var16 * 3.0D < 2.0D) {
               var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
            } else {
               var6 = var14;
            }

            if (6.0D * var0 < 1.0D) {
               var8 = 6.0D * (var12 - var14) * var0 + var14;
            } else if (2.0D * var0 < 1.0D) {
               var8 = var12;
            } else if (3.0D * var0 < 2.0D) {
               var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D;
            } else {
               var8 = var14;
            }

            if (6.0D * var20 < 1.0D) {
               var10 = var20 * (var12 - var14) * 6.0D + var14;
            } else if (2.0D * var20 < 1.0D) {
               var10 = var12;
            } else if (var20 * 3.0D < 2.0D) {
               var10 = var14 + 6.0D * (0.6666666666666666D - var20) * (var12 - var14);
            } else {
               var10 = var14;
            }
         }

         int var23 = (int)(var6 * 256.0D);
         int var13 = (int)(var8 * 256.0D);
         int var24 = (int)(256.0D * var10);
         int var15 = var24 + (var23 << 16) + (var13 << 8);
         return var15;
      } catch (RuntimeException var22) {
         throw tm.aw(var22, "io.ap(" + ')');
      }
   }

   final iz am(int var1, int var2, int var3, Object var4) {
      iz var5 = new iz();
      var5.ai = var1 * -1696451367;
      var5.ay = var2;
      var5.as = var4;
      synchronized(this) {
         if (this.aj != null) {
            this.aj.ap = var5;
            this.aj = var5;
         } else {
            this.aj = this.ak = var5;
         }

         this.notify();
         return var5;
      }
   }

   public static final float ao(qt var0, qt var1, int var2) {
      try {
         return var0.an(var1, 926051976);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "io.ao(" + ')');
      }
   }

   public io() {
      try {
         super();
         this.ak = null;
         this.aj = null;
         this.ay = false;
         ap = "Unknown";
         aw = "1.6";

         try {
            ap = System.getProperty("java.vendor");
            aw = System.getProperty("java.version");
         } catch (Exception var2) {
         }

         this.ay = false;
         this.ai = new Thread(this);
         this.ai.setPriority(10);
         this.ai.setDaemon(true);
         this.ai.start();
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "io.<init>(" + ')');
      }
   }
}
