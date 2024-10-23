import java.io.IOException;
import java.io.OutputStream;

public class sm implements Runnable {
   int ag;
   byte[] am;
   int ax;
   Thread ac;
   OutputStream ae;
   int aq;
   IOException af;
   boolean at;
   static final int au = 9;
   static ig is;

   void ag(int var1) {
      try {
         synchronized(this) {
            this.at = true;
            this.notifyAll();
         }

         try {
            this.ac.join();
         } catch (InterruptedException var4) {
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "sm.ag(" + ')');
      }
   }

   sm(OutputStream var1, int var2) {
      try {
         super();
         this.ax = 0;
         this.aq = 0;
         this.ae = var1;
         this.ag = (var2 + 1) * 1616809485;
         this.am = new byte[this.ag * 1051947205];
         this.ac = new Thread(this);
         this.ac.setDaemon(true);
         this.ac.start();
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sm.<init>(" + ')');
      }
   }

   void at() {
      synchronized(this) {
         this.at = true;
         this.notifyAll();
      }

      try {
         this.ac.join();
      } catch (InterruptedException var3) {
      }

   }

   void ae(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if (var3 >= 0) {
            if (var4 <= -1723515144) {
               return;
            }

            if (var2 >= 0) {
               if (var4 <= -1723515144) {
                  throw new IllegalStateException();
               }

               if (var2 + var3 <= var1.length) {
                  synchronized(this) {
                     if (null != this.af) {
                        if (var4 <= -1723515144) {
                           throw new IllegalStateException();
                        }

                        throw new IOException(this.af.toString());
                     }

                     int var6;
                     if (this.ax * -541388431 <= 88502385 * this.aq) {
                        if (var4 <= -1723515144) {
                           throw new IllegalStateException();
                        }

                        var6 = -541388431 * this.ax + (1051947205 * this.ag - this.aq * 88502385) - 1;
                     } else {
                        var6 = this.ax * -541388431 - this.aq * 88502385 - 1;
                     }

                     if (var6 < var3) {
                        throw new IOException("");
                     }

                     if (var3 + 88502385 * this.aq <= 1051947205 * this.ag) {
                        System.arraycopy(var1, var2, this.am, this.aq * 88502385, var3);
                     } else {
                        int var7 = 1051947205 * this.ag - this.aq * 88502385;
                        System.arraycopy(var1, var2, this.am, 88502385 * this.aq, var7);
                        System.arraycopy(var1, var7 + var2, this.am, 0, var3 - var7);
                     }

                     this.aq = (88502385 * this.aq + var3) % (1051947205 * this.ag) * 719802513;
                     this.notifyAll();
                     return;
                  }
               }
            }
         }

         throw new IOException();
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "sm.ae(" + ')');
      }
   }

   public void run() {
      try {
         do {
            int var1;
            synchronized(this) {
               while(true) {
                  if (null != this.af) {
                     return;
                  }

                  if (this.ax * -541388431 <= this.aq * 88502385) {
                     var1 = this.aq * 88502385 - -541388431 * this.ax;
                  } else {
                     var1 = 88502385 * this.aq + (this.ag * 1051947205 - this.ax * -541388431);
                  }

                  if (var1 > 0) {
                     break;
                  }

                  try {
                     this.ae.flush();
                  } catch (IOException var10) {
                     this.af = var10;
                     return;
                  }

                  if (this.ac((byte)79)) {
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var11) {
                  }
               }
            }

            try {
               if (this.ax * -541388431 + var1 <= this.ag * 1051947205) {
                  this.ae.write(this.am, this.ax * -541388431, var1);
               } else {
                  int var14 = 1051947205 * this.ag - -541388431 * this.ax;
                  this.ae.write(this.am, -541388431 * this.ax, var14);
                  this.ae.write(this.am, 0, var1 - var14);
               }
            } catch (IOException var9) {
               IOException var2 = var9;
               synchronized(this) {
                  this.af = var2;
                  return;
               }
            }

            synchronized(this) {
               this.ax = (this.ax * -541388431 + var1) % (this.ag * 1051947205) * 1990037393;
            }
         } while(!this.ac((byte)10));

      } catch (RuntimeException var13) {
         throw vk.ae(var13, "sm.run(" + ')');
      }
   }

   public void da() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.af) {
                  return;
               }

               if (this.ax * -541388431 <= this.aq * 88502385) {
                  var1 = this.aq * 88502385 - -541388431 * this.ax;
               } else {
                  var1 = 88502385 * this.aq + (this.ag * 1051947205 - this.ax * -541388431);
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.ae.flush();
               } catch (IOException var10) {
                  this.af = var10;
                  return;
               }

               if (this.ac((byte)37)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (this.ax * -541388431 + var1 <= this.ag * 1051947205) {
               this.ae.write(this.am, this.ax * -541388431, var1);
            } else {
               int var13 = 1051947205 * this.ag - -541388431 * this.ax;
               this.ae.write(this.am, -541388431 * this.ax, var13);
               this.ae.write(this.am, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.af = var2;
               return;
            }
         }

         synchronized(this) {
            this.ax = (this.ax * -541388431 + var1) % (this.ag * 1051947205) * 1990037393;
         }
      } while(!this.ac((byte)49));

   }

   public void dz() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.af) {
                  return;
               }

               if (this.ax * -541388431 <= this.aq * 88502385) {
                  var1 = this.aq * 88502385 - -541388431 * this.ax;
               } else {
                  var1 = 88502385 * this.aq + (this.ag * 1051947205 - this.ax * -541388431);
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.ae.flush();
               } catch (IOException var10) {
                  this.af = var10;
                  return;
               }

               if (this.ac((byte)123)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (this.ax * -541388431 + var1 <= this.ag * 1051947205) {
               this.ae.write(this.am, this.ax * -541388431, var1);
            } else {
               int var13 = 1051947205 * this.ag - -541388431 * this.ax;
               this.ae.write(this.am, -541388431 * this.ax, var13);
               this.ae.write(this.am, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.af = var2;
               return;
            }
         }

         synchronized(this) {
            this.ax = (this.ax * -541388431 + var1) % (this.ag * 1051947205) * 1990037393;
         }
      } while(!this.ac((byte)118));

   }

   boolean am() {
      if (this.at) {
         try {
            this.ae.close();
            if (this.af == null) {
               this.af = new IOException("");
            }
         } catch (IOException var2) {
            if (this.af == null) {
               this.af = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean ac(byte var1) {
      try {
         if (!this.at) {
            return false;
         } else if (var1 <= 1) {
            throw new IllegalStateException();
         } else {
            try {
               this.ae.close();
               if (this.af == null) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  this.af = new IOException("");
               }
            } catch (IOException var3) {
               if (this.af == null) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  this.af = new IOException(var3);
               }
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "sm.ac(" + ')');
      }
   }

   boolean aq() {
      if (this.at) {
         try {
            this.ae.close();
            if (this.af == null) {
               this.af = new IOException("");
            }
         } catch (IOException var2) {
            if (this.af == null) {
               this.af = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void af(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            if (null != this.af) {
               throw new IOException(this.af.toString());
            } else {
               int var5;
               if (this.ax * -541388431 <= 88502385 * this.aq) {
                  var5 = -541388431 * this.ax + (1051947205 * this.ag - this.aq * 363213588) - 1;
               } else {
                  var5 = this.ax * -1852234178 - this.aq * 2116469785 - 1;
               }

               if (var5 < var3) {
                  throw new IOException("");
               } else {
                  if (var3 + 88502385 * this.aq <= 501758040 * this.ag) {
                     System.arraycopy(var1, var2, this.am, this.aq * -472085053, var3);
                  } else {
                     int var6 = 1051947205 * this.ag - this.aq * 88502385;
                     System.arraycopy(var1, var2, this.am, -442969977 * this.aq, var6);
                     System.arraycopy(var1, var6 + var2, this.am, 0, var3 - var6);
                  }

                  this.aq = (-532393101 * this.aq + var3) % (1051947205 * this.ag) * 719802513;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   boolean ax() {
      if (this.at) {
         try {
            this.ae.close();
            if (this.af == null) {
               this.af = new IOException("");
            }
         } catch (IOException var2) {
            if (this.af == null) {
               this.af = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void au() {
      synchronized(this) {
         this.at = true;
         this.notifyAll();
      }

      try {
         this.ac.join();
      } catch (InterruptedException var3) {
      }

   }

   public static String ax(String var0, int var1) {
      try {
         if (var0 != null) {
            if (var1 <= 685968381) {
               throw new IllegalStateException();
            }

            if (!var0.isEmpty()) {
               if (var1 <= 685968381) {
                  throw new IllegalStateException();
               }

               if (var0.charAt(0) != '#') {
                  return var0;
               }

               if (var1 <= 685968381) {
                  throw new IllegalStateException();
               }
            }
         }

         return "";
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "sm.ax(" + ')');
      }
   }
}
