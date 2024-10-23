import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class ex implements Runnable {
   final Thread ap;
   volatile boolean aw;
   Queue ak;
   static final int qk = 31;
   public static final int ae = 2;
   int aj;
   static or fg;

   public void dk() {
      while(!this.aw) {
         try {
            ei var1;
            synchronized(this) {
               var1 = (ei)this.ak.poll();
               if (null == var1) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.ap(var1, -1335936587);
         } catch (Exception var7) {
            rl.ap((String)null, var7, (byte)-125);
         }
      }

   }

   void ao(URLConnection var1) {
      var1.setConnectTimeout(-2016880734);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.aj * -1512141121);
   }

   abstract void ap(ei var1, int var2) throws IOException;

   public void run() {
      try {
         while(!this.aw) {
            try {
               ei var1;
               synchronized(this) {
                  var1 = (ei)this.ak.poll();
                  if (null == var1) {
                     try {
                        this.wait();
                     } catch (InterruptedException var5) {
                     }
                     continue;
                  }
               }

               this.ap(var1, 1770877701);
            } catch (Exception var7) {
               rl.ap((String)null, var7, (byte)-105);
            }
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "ex.run(" + ')');
      }
   }

   void ak(URLConnection var1, byte var2) {
      try {
         var1.setConnectTimeout(5000);
         var1.setReadTimeout(5000);
         var1.setUseCaches(false);
         var1.setRequestProperty("Connection", "close");
         var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.aj * -1512141121);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ex.ak(" + ')');
      }
   }

   void aj(URLConnection var1, ei var2, byte var3) {
      try {
         DataInputStream var4 = null;
         boolean var16 = false;

         label101: {
            label100: {
               try {
                  var16 = true;
                  int var6 = var1.getContentLength();
                  var4 = new DataInputStream(var1.getInputStream());
                  byte[] var5;
                  if (var6 >= 0) {
                     var5 = new byte[var6];
                     var4.readFully(var5);
                  } else {
                     var5 = new byte[0];
                     byte[] var7 = rt.aw(5000, false, 1257068437);
                     byte[] var8 = var7;

                     for(int var9 = var4.read(var7); var9 > -1; var9 = var4.read(var8)) {
                        byte[] var10 = new byte[var9 + var5.length];
                        System.arraycopy(var5, 0, var10, 0, var5.length);
                        System.arraycopy(var8, 0, var10, var5.length, var9);
                        var5 = var10;
                     }

                     op.ak(var8, 1084716332);
                  }

                  var2.ai = var5;
                  var16 = false;
                  break label100;
               } catch (IOException var18) {
                  var2.ai = null;
                  var16 = false;
               } finally {
                  if (var16) {
                     var2.aj = this.aw(var1, 990688246) * -1995180647;
                  }
               }

               var2.aj = this.aw(var1, 1015039003) * -1995180647;
               break label101;
            }

            var2.aj = this.aw(var1, -18096714) * -1995180647;
         }

         if (null != var4) {
            if (var3 >= 14) {
               return;
            }

            try {
               var4.close();
            } catch (IOException var17) {
            }
         }

      } catch (RuntimeException var20) {
         throw tm.aw(var20, "ex.aj(" + ')');
      }
   }

   public ei ai(URL var1, short var2) {
      try {
         ei var3 = new ei(var1);
         synchronized(this) {
            this.ak.add(var3);
            this.notify();
            return var3;
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "ex.ai(" + ')');
      }
   }

   public void ay(byte var1) {
      try {
         this.aw = true;

         try {
            synchronized(this) {
               this.notify();
            }

            this.ap.join();
         } catch (InterruptedException var5) {
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ex.ay(" + ')');
      }
   }

   abstract void as(ei var1) throws IOException;

   abstract void am(ei var1) throws IOException;

   abstract void ae(ei var1) throws IOException;

   public ei az(URL var1) {
      ei var2 = new ei(var1);
      synchronized(this) {
         this.ak.add(var2);
         this.notify();
         return var2;
      }
   }

   int at(URLConnection var1) {
      int var2 = 1304647335 * ei.ak;
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

   int au(URLConnection var1) {
      int var2 = 1315473110 * ei.ak;
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

   int an(URLConnection var1) {
      int var2 = 1304647335 * ei.ak;
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

   public ei ag(URL var1) {
      ei var2 = new ei(var1);
      synchronized(this) {
         this.ak.add(var2);
         this.notify();
         return var2;
      }
   }

   void af(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.aj * -1512141121);
   }

   void ar(URLConnection var1, ei var2) {
      DataInputStream var3 = null;
      boolean var14 = false;

      label89: {
         label88: {
            try {
               var14 = true;
               int var5 = var1.getContentLength();
               var3 = new DataInputStream(var1.getInputStream());
               byte[] var4;
               if (var5 >= 0) {
                  var4 = new byte[var5];
                  var3.readFully(var4);
               } else {
                  var4 = new byte[0];
                  byte[] var6 = rt.aw(5000, false, -792063112);
                  byte[] var7 = var6;

                  for(int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) {
                     byte[] var9 = new byte[var8 + var4.length];
                     System.arraycopy(var4, 0, var9, 0, var4.length);
                     System.arraycopy(var7, 0, var9, var4.length, var8);
                     var4 = var9;
                  }

                  op.ak(var7, 1084716332);
               }

               var2.ai = var4;
               var14 = false;
               break label88;
            } catch (IOException var16) {
               var2.ai = null;
               var14 = false;
            } finally {
               if (var14) {
                  var2.aj = this.aw(var1, -361019313) * -579228433;
               }
            }

            var2.aj = this.aw(var1, -647201542) * -1995180647;
            break label89;
         }

         var2.aj = this.aw(var1, 725435315) * -1054113418;
      }

      if (null != var3) {
         try {
            var3.close();
         } catch (IOException var15) {
         }
      }

   }

   public ei ab(URL var1) {
      ei var2 = new ei(var1);
      synchronized(this) {
         this.ak.add(var2);
         this.notify();
         return var2;
      }
   }

   static final void af(int var0, int var1, int var2, int var3, byte var4) {
      try {
         if (jr.aj) {
            if (var4 == -1) {
               throw new IllegalStateException();
            }
         } else {
            byte var9 = 50;
            int var10 = jl.at();
            int var11 = (1947001953 * jr.aw - jm.as()) * var9 / jm.ao();
            int var12 = (253742759 * jr.ak - jm.ae()) * var9 / jm.ao();
            int var13 = (jr.aw * 1947001953 - jm.as()) * var10 / jm.ao();
            int var14 = (jr.ak * 253742759 - jm.ae()) * var10 / jm.ao();
            int var15 = gj.aw(var12, var9, var1, var0, (byte)4);
            int var16 = var1 * var9 - var0 * var12 >> 16;
            var12 = var15;
            var15 = gj.aw(var14, var10, var1, var0, (byte)4);
            int var17 = var1 * var10 - var14 * var0 >> 16;
            int var18 = var3 * var11 - var2 * var16 >> 16;
            int var19 = var11 * var2 + var3 * var16 >> 16;
            int var20 = var13 * var3 - var17 * var2 >> 16;
            int var21 = var17 * var3 + var13 * var2 >> 16;
            jr.ai = -749721067 * ((var20 + var18) / 2);
            jr.ay = 988795425 * ((var15 + var12) / 2);
            jr.as = -251474719 * ((var21 + var19) / 2);
            ae = -1444571807 * ((var20 - var18) / 2);
            jf.am = (var15 - var12) / 2 * 1216782417;
            qw.at = 1609140495 * ((var21 - var19) / 2);
            jr.au = Math.abs(jr.ae * 671731361) * 141767613;
            gu.an = Math.abs(jf.am * 517384369) * -2137753923;
            us.ao = Math.abs(qw.at * 2088257007) * -2082183117;
            jr.af.aj((float)(var20 - var18), (float)(var15 - var12), (float)(var21 - var19), -1603121434);
            jr.af.ae(1066170556);
            jr.aj = true;
         }
      } catch (RuntimeException var22) {
         throw tm.aw(var22, "ex.af(" + ')');
      }
   }

   int aw(URLConnection var1, int var2) {
      try {
         int var3 = 1304647335 * ei.ak;
         if (null != var1) {
            if (var2 <= -675862191) {
               throw new IllegalStateException();
            }

            try {
               if (var1 instanceof HttpURLConnection) {
                  if (var2 <= -675862191) {
                     throw new IllegalStateException();
                  }

                  var3 = ((HttpURLConnection)var1).getResponseCode();
               }
            } catch (IOException var5) {
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ex.aw(" + ')');
      }
   }

   public ei ad(URL var1) {
      ei var2 = new ei(var1);
      synchronized(this) {
         this.ak.add(var2);
         this.notify();
         return var2;
      }
   }

   public void ac() {
      this.aw = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.ap.join();
      } catch (InterruptedException var4) {
      }

   }

   public void av() {
      this.aw = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.ap.join();
      } catch (InterruptedException var4) {
      }

   }

   ex(int var1) {
      try {
         super();
         this.ak = new LinkedList();
         this.ap = new Thread(this);
         this.ap.setPriority(1);
         this.ap.start();
         this.aj = 1132192063 * var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ex.<init>(" + ')');
      }
   }

   public static int ak(int var0, int var1) {
      try {
         return var0 >> 17 & 7;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ex.ak(" + ')');
      }
   }

   public static as[] ap(byte var0) {
      try {
         return new as[]{as.ap};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ex.ap(" + ')');
      }
   }

   public static vv[] ap(pe var0, int var1, int var2, int var3) {
      try {
         if (!cb.am(var0, var1, var2, 1592084349)) {
            if (var3 != 806885260) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            vv[] var5 = new vv[wk.ap * 1934102439];

            for(int var6 = 0; var6 < 1934102439 * wk.ap; ++var6) {
               if (var3 != 806885260) {
                  throw new IllegalStateException();
               }

               vv var7 = var5[var6] = new vv();
               var7.ay = -1147402861 * wk.aw;
               var7.as = -201283629 * wk.ak;
               var7.aj = wk.aj[var6];
               var7.ai = tl.ai[var6];
               var7.aw = ae.ay[var6];
               var7.ak = wk.as[var6];
               int var8 = var7.ak * var7.aw;
               byte[] var9 = ks.am[var6];
               var7.ap = new int[var8];

               for(int var10 = 0; var10 < var8; ++var10) {
                  if (var3 != 806885260) {
                     throw new IllegalStateException();
                  }

                  var7.ap[var10] = wk.ae[var9[var10] & 255];
               }
            }

            wk.aj = null;
            tl.ai = null;
            ae.ay = null;
            wk.as = null;
            wk.ae = null;
            ks.am = (byte[][])null;
            return var5;
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "ex.ap(" + ')');
      }
   }
}
