import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class sm implements Runnable {
   int ay;
   InputStream aw;
   int ak;
   byte[] aj;
   int ai;
   Thread ap;
   IOException as;

   void ar() {
      synchronized(this) {
         if (this.as == null) {
            this.as = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.ap.join();
      } catch (InterruptedException var3) {
      }

   }

   boolean ap(int var1, int var2) throws IOException {
      try {
         if (var1 == 0) {
            if (var2 != 344978588) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (var1 > 0) {
               if (var2 != 344978588) {
                  throw new IllegalStateException();
               }

               if (var1 < this.ak * -510019779) {
                  synchronized(this) {
                     int var4;
                     if (-1475103487 * this.ai <= this.ay * 1069069207) {
                        var4 = this.ay * 1069069207 - -1475103487 * this.ai;
                     } else {
                        var4 = this.ak * -510019779 - -1475103487 * this.ai + this.ay * 1069069207;
                     }

                     if (var4 < var1) {
                        if (var2 != 344978588) {
                           throw new IllegalStateException();
                        }

                        if (this.as != null) {
                           if (var2 != 344978588) {
                              throw new IllegalStateException();
                           }

                           throw new IOException(this.as.toString());
                        }

                        this.notifyAll();
                        return false;
                     }

                     return true;
                  }
               }

               if (var2 != 344978588) {
                  throw new IllegalStateException();
               }
            }

            throw new IOException();
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "sm.ap(" + ')');
      }
   }

   sm(InputStream var1, int var2) {
      try {
         super();
         this.ai = 0;
         this.ay = 0;
         this.aw = var1;
         this.ak = (1 + var2) * 594761749;
         this.aj = new byte[this.ak * -510019779];
         this.ap = new Thread(this);
         this.ap.setDaemon(true);
         this.ap.start();
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sm.<init>(" + ')');
      }
   }

   int aw(int var1) throws IOException {
      try {
         synchronized(this) {
            int var3;
            if (-1475103487 * this.ai <= this.ay * 1069069207) {
               if (var1 == -456724838) {
                  throw new IllegalStateException();
               }

               var3 = this.ay * 1069069207 - this.ai * -1475103487;
            } else {
               var3 = this.ay * 1069069207 + (-510019779 * this.ak - -1475103487 * this.ai);
            }

            if (var3 <= 0) {
               if (var1 == -456724838) {
                  throw new IllegalStateException();
               }

               if (null != this.as) {
                  if (var1 == -456724838) {
                     throw new IllegalStateException();
                  }

                  throw new IOException(this.as.toString());
               }
            }

            this.notifyAll();
            return var3;
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "sm.aw(" + ')');
      }
   }

   int ak(int var1) throws IOException {
      try {
         synchronized(this) {
            if (-1475103487 * this.ai == 1069069207 * this.ay) {
               if (this.as != null) {
                  if (var1 != 1477006988) {
                     throw new IllegalStateException();
                  } else {
                     throw new IOException(this.as.toString());
                  }
               } else {
                  return -1;
               }
            } else {
               int var3 = this.aj[-1475103487 * this.ai] & 255;
               this.ai = (1 + -1475103487 * this.ai) % (this.ak * -510019779) * -1461368063;
               this.notifyAll();
               return var3;
            }
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "sm.ak(" + ')');
      }
   }

   int aj(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
            synchronized(this) {
               int var6;
               if (this.ai * -1475103487 <= 1069069207 * this.ay) {
                  var6 = this.ay * 1069069207 - -1475103487 * this.ai;
               } else {
                  var6 = -510019779 * this.ak - -1475103487 * this.ai + this.ay * 1069069207;
               }

               if (var3 > var6) {
                  var3 = var6;
               }

               if (0 == var3) {
                  if (var4 <= 1526212885) {
                     throw new IllegalStateException();
                  }

                  if (this.as != null) {
                     if (var4 <= 1526212885) {
                        throw new IllegalStateException();
                     }

                     throw new IOException(this.as.toString());
                  }
               }

               if (this.ai * -1475103487 + var3 <= this.ak * -510019779) {
                  if (var4 <= 1526212885) {
                     throw new IllegalStateException();
                  }

                  System.arraycopy(this.aj, -1475103487 * this.ai, var1, var2, var3);
               } else {
                  int var7 = -510019779 * this.ak - this.ai * -1475103487;
                  System.arraycopy(this.aj, this.ai * -1475103487, var1, var2, var7);
                  System.arraycopy(this.aj, 0, var1, var7 + var2, var3 - var7);
               }

               this.ai = -1461368063 * ((this.ai * -1475103487 + var3) % (this.ak * -510019779));
               this.notifyAll();
               return var3;
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "sm.aj(" + ')');
      }
   }

   void ai(byte var1) {
      try {
         synchronized(this) {
            if (this.as == null) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               this.as = new IOException("");
            }

            this.notifyAll();
         }

         try {
            this.ap.join();
         } catch (InterruptedException var4) {
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "sm.ai(" + ')');
      }
   }

   public void dk() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.as != null) {
                  return;
               }

               if (-603213357 * this.ai == 0) {
                  var1 = this.ak * -510019779 - this.ay * 1069069207 - 1;
               } else if (this.ai * -1475103487 <= -1745387674 * this.ay) {
                  var1 = this.ak * -644436369 - this.ay * 1947224716;
               } else {
                  var1 = this.ai * -1475103487 - 1933276379 * this.ay - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         int var2;
         try {
            var2 = this.aw.read(this.aj, this.ay * 1069069207, var1);
            if (-1 == var2) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.as = var3;
               return;
            }
         }

         synchronized(this) {
            this.ay = (var2 + 2065245941 * this.ay) % (this.ak * 909983888) * 1225587751;
         }
      }
   }

   int ay() throws IOException {
      synchronized(this) {
         int var2;
         if (-888370289 * this.ai <= this.ay * 547391053) {
            var2 = this.ay * 1069069207 - this.ai * 314396799;
         } else {
            var2 = this.ay * 758215866 + (1526345535 * this.ak - 929196226 * this.ai);
         }

         if (var2 <= 0 && null != this.as) {
            throw new IOException(this.as.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   int as() throws IOException {
      synchronized(this) {
         int var2;
         if (-1475103487 * this.ai <= this.ay * 1069069207) {
            var2 = this.ay * 1983660421 - this.ai * -1475103487;
         } else {
            var2 = this.ay * 1069069207 + (-887271950 * this.ak - -92772877 * this.ai);
         }

         if (var2 <= 0 && null != this.as) {
            throw new IOException(this.as.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   public void run() {
      try {
         while(true) {
            int var1;
            synchronized(this) {
               while(true) {
                  if (this.as != null) {
                     return;
                  }

                  if (-1475103487 * this.ai == 0) {
                     var1 = this.ak * -510019779 - this.ay * 1069069207 - 1;
                  } else if (this.ai * -1475103487 <= 1069069207 * this.ay) {
                     var1 = this.ak * -510019779 - this.ay * 1069069207;
                  } else {
                     var1 = this.ai * -1475103487 - 1069069207 * this.ay - 1;
                  }

                  if (var1 > 0) {
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var9) {
                  }
               }
            }

            int var2;
            try {
               var2 = this.aw.read(this.aj, this.ay * 1069069207, var1);
               if (-1 == var2) {
                  throw new EOFException();
               }
            } catch (IOException var10) {
               IOException var3 = var10;
               synchronized(this) {
                  this.as = var3;
                  return;
               }
            }

            synchronized(this) {
               this.ay = (var2 + 1069069207 * this.ay) % (this.ak * -510019779) * 1225587751;
            }
         }
      } catch (RuntimeException var12) {
         throw tm.aw(var12, "sm.run(" + ')');
      }
   }

   void ao() {
      synchronized(this) {
         if (this.as == null) {
            this.as = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.ap.join();
      } catch (InterruptedException var3) {
      }

   }

   int at(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var5;
            if (this.ai * 442552864 <= -2021888511 * this.ay) {
               var5 = this.ay * 1069069207 - -1475103487 * this.ai;
            } else {
               var5 = 1442211456 * this.ak - -1475103487 * this.ai + this.ay * 1328997702;
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (0 == var3 && this.as != null) {
               throw new IOException(this.as.toString());
            } else {
               if (this.ai * 1285151065 + var3 <= this.ak * -510019779) {
                  System.arraycopy(this.aj, -1475103487 * this.ai, var1, var2, var3);
               } else {
                  int var6 = -510019779 * this.ak - this.ai * -1475103487;
                  System.arraycopy(this.aj, this.ai * -1475103487, var1, var2, var6);
                  System.arraycopy(this.aj, 0, var1, var6 + var2, var3 - var6);
               }

               this.ai = -1461368063 * ((this.ai * -1475103487 + var3) % (this.ak * -510019779));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int au(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var5;
            if (this.ai * -1475103487 <= 1069069207 * this.ay) {
               var5 = this.ay * 1069069207 - -1475103487 * this.ai;
            } else {
               var5 = -510019779 * this.ak - -1475103487 * this.ai + this.ay * 1069069207;
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (0 == var3 && this.as != null) {
               throw new IOException(this.as.toString());
            } else {
               if (this.ai * -1475103487 + var3 <= this.ak * -510019779) {
                  System.arraycopy(this.aj, -1475103487 * this.ai, var1, var2, var3);
               } else {
                  int var6 = -510019779 * this.ak - this.ai * -1475103487;
                  System.arraycopy(this.aj, this.ai * -1475103487, var1, var2, var6);
                  System.arraycopy(this.aj, 0, var1, var6 + var2, var3 - var6);
               }

               this.ai = -1461368063 * ((this.ai * -1475103487 + var3) % (this.ak * -510019779));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int an(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var5;
            if (this.ai * -1475103487 <= 1069069207 * this.ay) {
               var5 = this.ay * 1069069207 - -1475103487 * this.ai;
            } else {
               var5 = -510019779 * this.ak - -1475103487 * this.ai + this.ay * 1069069207;
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (0 == var3 && this.as != null) {
               throw new IOException(this.as.toString());
            } else {
               if (this.ai * -1475103487 + var3 <= this.ak * -510019779) {
                  System.arraycopy(this.aj, -1475103487 * this.ai, var1, var2, var3);
               } else {
                  int var6 = -510019779 * this.ak - this.ai * -1475103487;
                  System.arraycopy(this.aj, this.ai * -1475103487, var1, var2, var6);
                  System.arraycopy(this.aj, 0, var1, var6 + var2, var3 - var6);
               }

               this.ai = -1461368063 * ((this.ai * -1475103487 + var3) % (this.ak * -510019779));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int ae() throws IOException {
      synchronized(this) {
         int var2;
         if (-1475103487 * this.ai <= this.ay * 1069069207) {
            var2 = this.ay * 1069069207 - this.ai * -1475103487;
         } else {
            var2 = this.ay * 1069069207 + (-510019779 * this.ak - -1475103487 * this.ai);
         }

         if (var2 <= 0 && null != this.as) {
            throw new IOException(this.as.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   void af() {
      synchronized(this) {
         if (this.as == null) {
            this.as = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.ap.join();
      } catch (InterruptedException var3) {
      }

   }

   int am() throws IOException {
      synchronized(this) {
         if (1128482446 * this.ai == 1069069207 * this.ay) {
            if (this.as != null) {
               throw new IOException(this.as.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.aj[-1549116727 * this.ai] & 255;
            this.ai = (1 + -1475103487 * this.ai) % (this.ak * 1368714477) * -1461368063;
            this.notifyAll();
            return var2;
         }
      }
   }
}
