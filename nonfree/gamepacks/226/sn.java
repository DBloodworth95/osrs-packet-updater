import java.io.IOException;
import java.io.OutputStream;

public class sn implements Runnable {
   int ak;
   OutputStream aw;
   IOException as;
   int ay;
   int ai;
   byte[] aj;
   Thread ap;
   boolean ae;

   sn(OutputStream var1, int var2) {
      try {
         super();
         this.ai = 0;
         this.ay = 0;
         this.aw = var1;
         this.ak = (1 + var2) * 177105467;
         this.aj = new byte[-755573005 * this.ak];
         this.ap = new Thread(this);
         this.ap.setDaemon(true);
         this.ap.start();
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sn.<init>(" + ')');
      }
   }

   void aw(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if (var3 >= 0) {
            if (var4 <= -1529110845) {
               throw new IllegalStateException();
            }

            if (var2 >= 0) {
               if (var4 <= -1529110845) {
                  throw new IllegalStateException();
               }

               if (var3 + var2 <= var1.length) {
                  synchronized(this) {
                     if (null != this.as) {
                        if (var4 <= -1529110845) {
                           return;
                        }

                        throw new IOException(this.as.toString());
                     }

                     int var6;
                     if (-1422109407 * this.ai <= this.ay * 1953641395) {
                        var6 = this.ai * -1422109407 + (-755573005 * this.ak - 1953641395 * this.ay) - 1;
                     } else {
                        var6 = -1422109407 * this.ai - 1953641395 * this.ay - 1;
                     }

                     if (var6 < var3) {
                        throw new IOException("");
                     }

                     if (this.ay * 1953641395 + var3 <= -755573005 * this.ak) {
                        if (var4 <= -1529110845) {
                           throw new IllegalStateException();
                        }

                        System.arraycopy(var1, var2, this.aj, 1953641395 * this.ay, var3);
                     } else {
                        int var7 = -755573005 * this.ak - this.ay * 1953641395;
                        System.arraycopy(var1, var2, this.aj, this.ay * 1953641395, var7);
                        System.arraycopy(var1, var7 + var2, this.aj, 0, var3 - var7);
                     }

                     this.ay = (var3 + 1953641395 * this.ay) % (this.ak * -755573005) * -6704261;
                     this.notifyAll();
                     return;
                  }
               }

               if (var4 <= -1529110845) {
                  throw new IllegalStateException();
               }
            }
         }

         throw new IOException();
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "sn.aw(" + ')');
      }
   }

   public void run() {
      try {
         do {
            int var1;
            synchronized(this) {
               while(true) {
                  if (this.as != null) {
                     return;
                  }

                  if (this.ai * -1422109407 <= this.ay * 1953641395) {
                     var1 = this.ay * 1953641395 - this.ai * -1422109407;
                  } else {
                     var1 = -755573005 * this.ak - -1422109407 * this.ai + this.ay * 1953641395;
                  }

                  if (var1 > 0) {
                     break;
                  }

                  try {
                     this.aw.flush();
                  } catch (IOException var10) {
                     this.as = var10;
                     return;
                  }

                  if (this.ap((byte)61)) {
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var11) {
                  }
               }
            }

            try {
               if (var1 + -1422109407 * this.ai <= -755573005 * this.ak) {
                  this.aw.write(this.aj, -1422109407 * this.ai, var1);
               } else {
                  int var14 = this.ak * -755573005 - this.ai * -1422109407;
                  this.aw.write(this.aj, this.ai * -1422109407, var14);
                  this.aw.write(this.aj, 0, var1 - var14);
               }
            } catch (IOException var9) {
               IOException var2 = var9;
               synchronized(this) {
                  this.as = var2;
                  return;
               }
            }

            synchronized(this) {
               this.ai = (this.ai * -1422109407 + var1) % (this.ak * -755573005) * -238719263;
            }
         } while(!this.ap((byte)121));

      } catch (RuntimeException var13) {
         throw tm.aw(var13, "sn.run(" + ')');
      }
   }

   void ae() {
      synchronized(this) {
         this.ae = true;
         this.notifyAll();
      }

      try {
         this.ap.join();
      } catch (InterruptedException var3) {
      }

   }

   void ak(int var1) {
      try {
         synchronized(this) {
            this.ae = true;
            this.notifyAll();
         }

         try {
            this.ap.join();
         } catch (InterruptedException var4) {
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "sn.ak(" + ')');
      }
   }

   public void dk() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.as != null) {
                  return;
               }

               if (this.ai * -1422109407 <= this.ay * 406848497) {
                  var1 = this.ay * 1953641395 - this.ai * 1451567118;
               } else {
                  var1 = -755573005 * this.ak - -1422109407 * this.ai + this.ay * 1953641395;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.aw.flush();
               } catch (IOException var10) {
                  this.as = var10;
                  return;
               }

               if (this.ap((byte)50)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (var1 + -1422109407 * this.ai <= 118337731 * this.ak) {
               this.aw.write(this.aj, 37579423 * this.ai, var1);
            } else {
               int var13 = this.ak * 785801910 - this.ai * -1606860026;
               this.aw.write(this.aj, this.ai * -1422109407, var13);
               this.aw.write(this.aj, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.as = var2;
               return;
            }
         }

         synchronized(this) {
            this.ai = (this.ai * 14368043 + var1) % (this.ak * -1968288813) * 1870042119;
         }
      } while(!this.ap((byte)70));

   }

   boolean aj() {
      if (this.ae) {
         try {
            this.aw.close();
            if (null == this.as) {
               this.as = new IOException("");
            }
         } catch (IOException var2) {
            if (this.as == null) {
               this.as = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean ap(byte var1) {
      try {
         if (!this.ae) {
            return false;
         } else if (var1 <= 3) {
            throw new IllegalStateException();
         } else {
            try {
               this.aw.close();
               if (null == this.as) {
                  if (var1 <= 3) {
                     throw new IllegalStateException();
                  }

                  this.as = new IOException("");
               }
            } catch (IOException var3) {
               if (this.as == null) {
                  if (var1 <= 3) {
                     throw new IllegalStateException();
                  }

                  this.as = new IOException(var3);
               }
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "sn.ap(" + ')');
      }
   }

   boolean ay() {
      if (this.ae) {
         try {
            this.aw.close();
            if (null == this.as) {
               this.as = new IOException("");
            }
         } catch (IOException var2) {
            if (this.as == null) {
               this.as = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void as(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if (null != this.as) {
               throw new IOException(this.as.toString());
            } else {
               int var5;
               if (-1422109407 * this.ai <= this.ay * 1953641395) {
                  var5 = this.ai * -1422109407 + (-755573005 * this.ak - 1953641395 * this.ay) - 1;
               } else {
                  var5 = -1422109407 * this.ai - 1953641395 * this.ay - 1;
               }

               if (var5 < var3) {
                  throw new IOException("");
               } else {
                  if (this.ay * 1953641395 + var3 <= -755573005 * this.ak) {
                     System.arraycopy(var1, var2, this.aj, 1953641395 * this.ay, var3);
                  } else {
                     int var6 = -755573005 * this.ak - this.ay * 1953641395;
                     System.arraycopy(var1, var2, this.aj, this.ay * 1953641395, var6);
                     System.arraycopy(var1, var6 + var2, this.aj, 0, var3 - var6);
                  }

                  this.ay = (var3 + 1953641395 * this.ay) % (this.ak * -755573005) * -6704261;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   boolean ai() {
      if (this.ae) {
         try {
            this.aw.close();
            if (null == this.as) {
               this.as = new IOException("");
            }
         } catch (IOException var2) {
            if (this.as == null) {
               this.as = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void am() {
      synchronized(this) {
         this.ae = true;
         this.notifyAll();
      }

      try {
         this.ap.join();
      } catch (InterruptedException var3) {
      }

   }
}
