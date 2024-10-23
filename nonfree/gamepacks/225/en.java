import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class en implements Runnable {
   Queue ag;
   final Thread ac;
   volatile boolean ae;
   int am;
   static final int aq = 20;
   public static int av;

   public ek az(URL var1) {
      ek var2 = new ek(var1);
      synchronized(this) {
         this.ag.add(var2);
         this.notify();
         return var2;
      }
   }

   int ar(URLConnection var1) {
      int var2 = -1818166195 * ek.ag;
      if (null != var1) {
         try {
            if (var1 instanceof HttpURLConnection) {
               var2 = ((HttpURLConnection)var1).getResponseCode();
            }
         } catch (IOException var4) {
         }
      }

      return var2;
   }

   en(int var1) {
      try {
         super();
         this.ag = new LinkedList();
         this.ac = new Thread(this);
         this.ac.setPriority(1);
         this.ac.start();
         this.am = -1105668501 * var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "en.<init>(" + ')');
      }
   }

   int ae(URLConnection var1, int var2) {
      try {
         int var3 = -1818166195 * ek.ag;
         if (null != var1) {
            if (var2 != -1837690890) {
               throw new IllegalStateException();
            }

            try {
               if (var1 instanceof HttpURLConnection) {
                  var3 = ((HttpURLConnection)var1).getResponseCode();
               }
            } catch (IOException var5) {
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "en.ae(" + ')');
      }
   }

   void ag(URLConnection var1, int var2) {
      try {
         var1.setConnectTimeout(5000);
         var1.setReadTimeout(5000);
         var1.setUseCaches(false);
         var1.setRequestProperty("Connection", "close");
         var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.am * 570697283);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "en.ag(" + ')');
      }
   }

   void am(URLConnection var1, ek var2, int var3) {
      try {
         DataInputStream var4 = null;

         try {
            int var6 = var1.getContentLength();
            var4 = new DataInputStream(var1.getInputStream());
            byte[] var5;
            if (var6 >= 0) {
               if (var3 == -353040011) {
                  throw new IllegalStateException();
               }

               var5 = new byte[var6];
               var4.readFully(var5);
            } else {
               var5 = new byte[0];
               byte[] var7 = pd.ae(5000, -2129547212);

               for(int var8 = var4.read(var7); var8 > -1; var8 = var4.read(var7)) {
                  if (var3 == -353040011) {
                     throw new IllegalStateException();
                  }

                  byte[] var9 = new byte[var8 + var5.length];
                  System.arraycopy(var5, 0, var9, 0, var5.length);
                  System.arraycopy(var7, 0, var9, var5.length, var8);
                  var5 = var9;
               }

               dq.ag(var7, -1688652712);
            }

            var2.ax = var5;
         } catch (IOException var16) {
            var2.ax = null;
         } finally {
            var2.am = this.ae(var1, -1837690890) * 1960853289;
         }

         if (var4 != null) {
            if (var3 == -353040011) {
               throw new IllegalStateException();
            }

            try {
               var4.close();
            } catch (IOException var15) {
            }
         }

      } catch (RuntimeException var18) {
         throw vk.ae(var18, "en.am(" + ')');
      }
   }

   public ek ax(URL var1, int var2) {
      try {
         ek var3 = new ek(var1);
         synchronized(this) {
            this.ag.add(var3);
            this.notify();
            return var3;
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "en.ax(" + ')');
      }
   }

   void ah(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.am * 570697283);
   }

   public void aq(byte var1) {
      try {
         this.ae = true;

         try {
            synchronized(this) {
               this.notify();
            }

            this.ac.join();
         } catch (InterruptedException var5) {
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "en.aq(" + ')');
      }
   }

   public void dz() {
      while(!this.ae) {
         try {
            ek var1;
            synchronized(this) {
               var1 = (ek)this.ag.poll();
               if (null == var1) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.ac(var1, 2137706399);
         } catch (Exception var7) {
            gc.ac((String)null, var7, (byte)-101);
         }
      }

   }

   void ad(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.am * 570697283);
   }

   int at(URLConnection var1) {
      int var2 = -1818166195 * ek.ag;
      if (null != var1) {
         try {
            if (var1 instanceof HttpURLConnection) {
               var2 = ((HttpURLConnection)var1).getResponseCode();
            }
         } catch (IOException var4) {
         }
      }

      return var2;
   }

   static int kp(int var0, int var1, int var2) {
      try {
         int var3 = var1 - 334;
         if (var3 < 0) {
            if (var2 == -1027766515) {
               throw new IllegalStateException();
            }

            var3 = 0;
         } else if (var3 > 100) {
            var3 = 100;
         }

         int var4 = (client.vk - client.vm) * var3 / 100 + client.vm;
         return var4 * var0 / 256;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "en.kp(" + ')');
      }
   }

   public void da() {
      while(!this.ae) {
         try {
            ek var1;
            synchronized(this) {
               var1 = (ek)this.ag.poll();
               if (null == var1) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.ac(var1, 2141571989);
         } catch (Exception var7) {
            gc.ac((String)null, var7, (byte)-1);
         }
      }

   }

   void al(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.am * 570697283);
   }

   int au(URLConnection var1) {
      int var2 = -1818166195 * ek.ag;
      if (null != var1) {
         try {
            if (var1 instanceof HttpURLConnection) {
               var2 = ((HttpURLConnection)var1).getResponseCode();
            }
         } catch (IOException var4) {
         }
      }

      return var2;
   }

   public void run() {
      try {
         while(!this.ae) {
            try {
               ek var1;
               synchronized(this) {
                  var1 = (ek)this.ag.poll();
                  if (null == var1) {
                     try {
                        this.wait();
                     } catch (InterruptedException var5) {
                     }
                     continue;
                  }
               }

               this.ac(var1, 2145007281);
            } catch (Exception var7) {
               gc.ac((String)null, var7, (byte)-23);
            }
         }

      } catch (RuntimeException var8) {
         throw vk.ae(var8, "en.run(" + ')');
      }
   }

   void ap(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.am * 570697283);
   }

   void ab(URLConnection var1, ek var2) {
      DataInputStream var3 = null;

      try {
         int var5 = var1.getContentLength();
         var3 = new DataInputStream(var1.getInputStream());
         byte[] var4;
         if (var5 >= 0) {
            var4 = new byte[var5];
            var3.readFully(var4);
         } else {
            var4 = new byte[0];
            byte[] var6 = pd.ae(5000, -2129547212);

            for(int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
               byte[] var8 = new byte[var7 + var4.length];
               System.arraycopy(var4, 0, var8, 0, var4.length);
               System.arraycopy(var6, 0, var8, var4.length, var7);
               var4 = var8;
            }

            dq.ag(var6, -503432913);
         }

         var2.ax = var4;
      } catch (IOException var14) {
         var2.ax = null;
      } finally {
         var2.am = this.ae(var1, -1837690890) * 1960853289;
      }

      if (var3 != null) {
         try {
            var3.close();
         } catch (IOException var13) {
         }
      }

   }

   abstract void ac(ek var1, int var2) throws IOException;

   public ek aa(URL var1) {
      ek var2 = new ek(var1);
      synchronized(this) {
         this.ag.add(var2);
         this.notify();
         return var2;
      }
   }

   public ek ai(URL var1) {
      ek var2 = new ek(var1);
      synchronized(this) {
         this.ag.add(var2);
         this.notify();
         return var2;
      }
   }

   public void as() {
      this.ae = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.ac.join();
      } catch (InterruptedException var4) {
      }

   }

   abstract void af(ek var1) throws IOException;

   public void ay() {
      this.ae = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.ac.join();
      } catch (InterruptedException var4) {
      }

   }

   public void aj() {
      this.ae = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.ac.join();
      } catch (InterruptedException var4) {
      }

   }

   public void av() {
      this.ae = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.ac.join();
      } catch (InterruptedException var4) {
      }

   }

   public void ao() {
      this.ae = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.ac.join();
      } catch (InterruptedException var4) {
      }

   }
}
