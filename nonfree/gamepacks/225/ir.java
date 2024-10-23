import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class ir implements Runnable {
   static na ep;
   public static String ae;
   boolean aq;
   ig am;
   Thread ax;
   ig ag;
   static final int af = 1;
   public static String ac;

   public ir() {
      try {
         super();
         this.ag = null;
         this.am = null;
         this.aq = false;
         ac = "Unknown";
         ae = "1.6";

         try {
            ac = System.getProperty("java.vendor");
            ae = System.getProperty("java.version");
         } catch (Exception var2) {
         }

         this.aq = false;
         this.ax = new Thread(this);
         this.ax.setPriority(10);
         this.ax.setDaemon(true);
         this.ax.start();
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ir.<init>(" + ')');
      }
   }

   public static int ag(CharSequence var0, int var1) {
      try {
         return fc.ax(var0, 10, true, (byte)-101);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ir.ag(" + ')');
      }
   }

   public final void run() {
      try {
         while(true) {
            ig var1;
            synchronized(this) {
               while(true) {
                  if (this.aq) {
                     return;
                  }

                  if (null != this.ag) {
                     var1 = this.ag;
                     this.ag = this.ag.ac;
                     if (this.ag == null) {
                        this.am = null;
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
               int var2 = -352730199 * var1.ax;
               if (1 == var2) {
                  var1.at = new Socket(InetAddress.getByName((String)var1.af), var1.aq);
               } else if (2 == var2) {
                  Thread var3 = new Thread((Runnable)var1.af);
                  var3.setDaemon(true);
                  var3.start();
                  var3.setPriority(var1.aq);
                  var1.at = var3;
               } else if (var2 == 4) {
                  var1.at = new DataInputStream(((URL)var1.af).openStream());
               }

               var1.am = 1;
            } catch (ThreadDeath var5) {
               throw var5;
            } catch (Throwable var6) {
               var1.am = 2;
            }
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "ir.run(" + ')');
      }
   }

   final ig ae(int var1, int var2, int var3, Object var4, int var5) {
      try {
         ig var6 = new ig();
         var6.ax = var1 * 1479774361;
         var6.aq = var2;
         var6.af = var4;
         synchronized(this) {
            if (null != this.am) {
               if (var5 >= 387392620) {
                  throw new IllegalStateException();
               }

               this.am.ac = var6;
               this.am = var6;
            } else {
               this.am = this.ag = var6;
            }

            this.notify();
            return var6;
         }
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "ir.ae(" + ')');
      }
   }

   public final ig ag(String var1, int var2, byte var3) {
      try {
         return this.ae(1, var2, 0, var1, -1025680406);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ir.ag(" + ')');
      }
   }

   final ig at(int var1, int var2, int var3, Object var4) {
      ig var5 = new ig();
      var5.ax = var1 * 1479774361;
      var5.aq = var2;
      var5.af = var4;
      synchronized(this) {
         if (null != this.am) {
            this.am.ac = var5;
            this.am = var5;
         } else {
            this.am = this.ag = var5;
         }

         this.notify();
         return var5;
      }
   }

   public final void da() {
      while(true) {
         ig var1;
         synchronized(this) {
            while(true) {
               if (this.aq) {
                  return;
               }

               if (null != this.ag) {
                  var1 = this.ag;
                  this.ag = this.ag.ac;
                  if (this.ag == null) {
                     this.am = null;
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
            int var2 = 1128893806 * var1.ax;
            if (1 == var2) {
               var1.at = new Socket(InetAddress.getByName((String)var1.af), var1.aq);
            } else if (2 == var2) {
               Thread var3 = new Thread((Runnable)var1.af);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.aq);
               var1.at = var3;
            } else if (var2 == 4) {
               var1.at = new DataInputStream(((URL)var1.af).openStream());
            }

            var1.am = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.am = 2;
         }
      }
   }

   public final void dz() {
      while(true) {
         ig var1;
         synchronized(this) {
            while(true) {
               if (this.aq) {
                  return;
               }

               if (null != this.ag) {
                  var1 = this.ag;
                  this.ag = this.ag.ac;
                  if (this.ag == null) {
                     this.am = null;
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
            int var2 = -352730199 * var1.ax;
            if (1 == var2) {
               var1.at = new Socket(InetAddress.getByName((String)var1.af), var1.aq);
            } else if (2 == var2) {
               Thread var3 = new Thread((Runnable)var1.af);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.aq);
               var1.at = var3;
            } else if (var2 == 4) {
               var1.at = new DataInputStream(((URL)var1.af).openStream());
            }

            var1.am = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.am = 2;
         }
      }
   }

   public final ig ah(Runnable var1, int var2) {
      return this.ae(2, var2, 0, var1, -429858480);
   }

   public final void aq() {
      synchronized(this) {
         this.aq = true;
         this.notifyAll();
      }

      try {
         this.ax.join();
      } catch (InterruptedException var3) {
      }

   }

   public final ig al(String var1, int var2) {
      return this.ae(1, var2, 0, var1, -341486919);
   }

   final ig af(int var1, int var2, int var3, Object var4) {
      ig var5 = new ig();
      var5.ax = var1 * 1479774361;
      var5.aq = var2;
      var5.af = var4;
      synchronized(this) {
         if (null != this.am) {
            this.am.ac = var5;
            this.am = var5;
         } else {
            this.am = this.ag = var5;
         }

         this.notify();
         return var5;
      }
   }

   final ig au(int var1, int var2, int var3, Object var4) {
      ig var5 = new ig();
      var5.ax = var1 * 1479774361;
      var5.aq = var2;
      var5.af = var4;
      synchronized(this) {
         if (null != this.am) {
            this.am.ac = var5;
            this.am = var5;
         } else {
            this.am = this.ag = var5;
         }

         this.notify();
         return var5;
      }
   }

   public final ig ar(String var1, int var2) {
      return this.ae(1, var2, 0, var1, -958699493);
   }

   public final void ac(int var1) {
      try {
         synchronized(this) {
            this.aq = true;
            this.notifyAll();
         }

         try {
            this.ax.join();
         } catch (InterruptedException var4) {
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ir.ac(" + ')');
      }
   }

   public final ig am(Runnable var1, int var2, int var3) {
      try {
         return this.ae(2, var2, 0, var1, -1642796188);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ir.am(" + ')');
      }
   }

   public final ig ad(String var1, int var2) {
      return this.ae(1, var2, 0, var1, -1751340971);
   }

   public final ig ap(Runnable var1, int var2) {
      return this.ae(2, var2, 0, var1, -321815244);
   }

   public final void ax() {
      synchronized(this) {
         this.aq = true;
         this.notifyAll();
      }

      try {
         this.ax.join();
      } catch (InterruptedException var3) {
      }

   }
}
