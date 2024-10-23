import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class sg implements Runnable {
   Thread ac;
   InputStream ae;
   int ax;
   byte[] am;
   int ag;
   int aq;
   IOException af;

   int aa(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var5;
            if (this.ax * -1722159009 <= this.aq * -362928595) {
               var5 = this.aq * -1223770531 - -1890440558 * this.ax;
            } else {
               var5 = this.ag * -729898229 - this.ax * 846994407 + this.aq * -1196912618;
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (0 == var3 && this.af != null) {
               throw new IOException(this.af.toString());
            } else {
               if (var3 + this.ax * 504649544 <= this.ag * -729898229) {
                  System.arraycopy(this.am, this.ax * -1722159009, var1, var2, var3);
               } else {
                  int var6 = this.ag * -729898229 - -589991907 * this.ax;
                  System.arraycopy(this.am, this.ax * -1722159009, var1, var2, var6);
                  System.arraycopy(this.am, 0, var1, var2 + var6, var3 - var6);
               }

               this.ax = -975934561 * ((this.ax * -1722159009 + var3) % (-729898229 * this.ag));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   public void run() {
      try {
         while(true) {
            int var1;
            synchronized(this) {
               while(true) {
                  if (null != this.af) {
                     return;
                  }

                  if (0 == -1722159009 * this.ax) {
                     var1 = -729898229 * this.ag - this.aq * -1223770531 - 1;
                  } else if (-1722159009 * this.ax <= this.aq * -1223770531) {
                     var1 = -729898229 * this.ag - -1223770531 * this.aq;
                  } else {
                     var1 = this.ax * -1722159009 - -1223770531 * this.aq - 1;
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
               var2 = this.ae.read(this.am, this.aq * -1223770531, var1);
               if (-1 == var2) {
                  throw new EOFException();
               }
            } catch (IOException var10) {
               IOException var3 = var10;
               synchronized(this) {
                  this.af = var3;
                  return;
               }
            }

            synchronized(this) {
               this.aq = (-1223770531 * this.aq + var2) % (this.ag * -729898229) * 1327236597;
            }
         }
      } catch (RuntimeException var12) {
         throw vk.ae(var12, "sg.run(" + ')');
      }
   }

   public void dz() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.af) {
                  return;
               }

               if (0 == -1722159009 * this.ax) {
                  var1 = -729898229 * this.ag - this.aq * -1223770531 - 1;
               } else if (-1722159009 * this.ax <= this.aq * -1223770531) {
                  var1 = -729898229 * this.ag - -1223770531 * this.aq;
               } else {
                  var1 = this.ax * -1722159009 - -1223770531 * this.aq - 1;
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
            var2 = this.ae.read(this.am, this.aq * -1223770531, var1);
            if (-1 == var2) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.af = var3;
               return;
            }
         }

         synchronized(this) {
            this.aq = (-1223770531 * this.aq + var2) % (this.ag * -729898229) * 1327236597;
         }
      }
   }

   int ae(int var1) throws IOException {
      try {
         synchronized(this) {
            int var3;
            if (-1722159009 * this.ax <= this.aq * -1223770531) {
               var3 = this.aq * -1223770531 - -1722159009 * this.ax;
            } else {
               var3 = -729898229 * this.ag - -1722159009 * this.ax + this.aq * -1223770531;
            }

            if (var3 <= 0 && this.af != null) {
               if (var1 <= 23029149) {
                  throw new IllegalStateException();
               } else {
                  throw new IOException(this.af.toString());
               }
            } else {
               this.notifyAll();
               return var3;
            }
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "sg.ae(" + ')');
      }
   }

   int ag(int var1) throws IOException {
      try {
         synchronized(this) {
            if (this.aq * -1223770531 == this.ax * -1722159009) {
               if (var1 != 526151610) {
                  throw new IllegalStateException();
               } else if (this.af != null) {
                  if (var1 != 526151610) {
                     throw new IllegalStateException();
                  } else {
                     throw new IOException(this.af.toString());
                  }
               } else {
                  return -1;
               }
            } else {
               int var3 = this.am[-1722159009 * this.ax] & 255;
               this.ax = -975934561 * ((-1722159009 * this.ax + 1) % (-729898229 * this.ag));
               this.notifyAll();
               return var3;
            }
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "sg.ag(" + ')');
      }
   }

   int am(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if (var3 >= 0) {
            if (var4 >= -1856457959) {
               throw new IllegalStateException();
            }

            if (var2 >= 0) {
               if (var4 >= -1856457959) {
                  throw new IllegalStateException();
               }

               if (var3 + var2 <= var1.length) {
                  synchronized(this) {
                     int var6;
                     if (this.ax * -1722159009 <= this.aq * -1223770531) {
                        if (var4 >= -1856457959) {
                           throw new IllegalStateException();
                        }

                        var6 = this.aq * -1223770531 - -1722159009 * this.ax;
                     } else {
                        var6 = this.ag * -729898229 - this.ax * -1722159009 + this.aq * -1223770531;
                     }

                     if (var3 > var6) {
                        var3 = var6;
                     }

                     if (0 == var3 && this.af != null) {
                        if (var4 >= -1856457959) {
                           throw new IllegalStateException();
                        }

                        throw new IOException(this.af.toString());
                     }

                     if (var3 + this.ax * -1722159009 <= this.ag * -729898229) {
                        System.arraycopy(this.am, this.ax * -1722159009, var1, var2, var3);
                     } else {
                        int var7 = this.ag * -729898229 - -1722159009 * this.ax;
                        System.arraycopy(this.am, this.ax * -1722159009, var1, var2, var7);
                        System.arraycopy(this.am, 0, var1, var2 + var7, var3 - var7);
                     }

                     this.ax = -975934561 * ((this.ax * -1722159009 + var3) % (-729898229 * this.ag));
                     this.notifyAll();
                     return var3;
                  }
               }

               if (var4 >= -1856457959) {
                  throw new IllegalStateException();
               }
            }
         }

         throw new IOException();
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "sg.am(" + ')');
      }
   }

   void ax(int var1) {
      try {
         synchronized(this) {
            if (null == this.af) {
               if (var1 >= 1209060343) {
                  throw new IllegalStateException();
               }

               this.af = new IOException("");
            }

            this.notifyAll();
         }

         try {
            this.ac.join();
         } catch (InterruptedException var4) {
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "sg.ax(" + ')');
      }
   }

   boolean at(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < -729898229 * this.ag) {
         synchronized(this) {
            int var3;
            if (-1722159009 * this.ax <= -1223770531 * this.aq) {
               var3 = this.aq * -1223770531 - this.ax * -1722159009;
            } else {
               var3 = this.aq * -1223770531 + (this.ag * -729898229 - -1722159009 * this.ax);
            }

            if (var3 < var1) {
               if (this.af != null) {
                  throw new IOException(this.af.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   sg(InputStream var1, int var2) {
      try {
         super();
         this.ax = 0;
         this.aq = 0;
         this.ae = var1;
         this.ag = (var2 + 1) * -1342664541;
         this.am = new byte[this.ag * -729898229];
         this.ac = new Thread(this);
         this.ac.setDaemon(true);
         this.ac.start();
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sg.<init>(" + ')');
      }
   }

   boolean aq(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < -435099277 * this.ag) {
         synchronized(this) {
            int var3;
            if (1019842031 * this.ax <= -1223770531 * this.aq) {
               var3 = this.aq * 447347635 - this.ax * -1591442354;
            } else {
               var3 = this.aq * 1841636723 + (this.ag * 2084737510 - -1722159009 * this.ax);
            }

            if (var3 < var1) {
               if (this.af != null) {
                  throw new IOException(this.af.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   boolean af(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < -729898229 * this.ag) {
         synchronized(this) {
            int var3;
            if (-1722159009 * this.ax <= -1223770531 * this.aq) {
               var3 = this.aq * -1223770531 - this.ax * -1722159009;
            } else {
               var3 = this.aq * -1223770531 + (this.ag * -729898229 - -1722159009 * this.ax);
            }

            if (var3 < var1) {
               if (this.af != null) {
                  throw new IOException(this.af.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   boolean ac(int var1, int var2) throws IOException {
      try {
         if (var1 == 0) {
            if (var2 == -709850565) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (var1 > 0) {
               if (var1 < -729898229 * this.ag) {
                  synchronized(this) {
                     int var4;
                     if (-1722159009 * this.ax <= -1223770531 * this.aq) {
                        if (var2 == -709850565) {
                           throw new IllegalStateException();
                        }

                        var4 = this.aq * -1223770531 - this.ax * -1722159009;
                     } else {
                        var4 = this.aq * -1223770531 + (this.ag * -729898229 - -1722159009 * this.ax);
                     }

                     if (var4 < var1) {
                        if (var2 == -709850565) {
                           throw new IllegalStateException();
                        }

                        if (this.af != null) {
                           if (var2 == -709850565) {
                              throw new IllegalStateException();
                           }

                           throw new IOException(this.af.toString());
                        }

                        this.notifyAll();
                        return false;
                     }

                     return true;
                  }
               }

               if (var2 == -709850565) {
                  throw new IllegalStateException();
               }
            }

            throw new IOException();
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "sg.ac(" + ')');
      }
   }

   public void da() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.af) {
                  return;
               }

               if (0 == -296649003 * this.ax) {
                  var1 = -729898229 * this.ag - this.aq * 284328971 - 1;
               } else if (-1722159009 * this.ax <= this.aq * -1223770531) {
                  var1 = -729898229 * this.ag - 2045591991 * this.aq;
               } else {
                  var1 = this.ax * -1994228712 - -1223770531 * this.aq - 1;
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
            var2 = this.ae.read(this.am, this.aq * 676502549, var1);
            if (-1 == var2) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.af = var3;
               return;
            }
         }

         synchronized(this) {
            this.aq = (1865991877 * this.aq + var2) % (this.ag * -729898229) * 1327236597;
         }
      }
   }

   int ar() throws IOException {
      synchronized(this) {
         int var2;
         if (-1939192601 * this.ax <= this.aq * -2058987110) {
            var2 = this.aq * -667004118 - -1722159009 * this.ax;
         } else {
            var2 = -729898229 * this.ag - -1722159009 * this.ax + this.aq * -1223770531;
         }

         if (var2 <= 0 && this.af != null) {
            throw new IOException(this.af.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   int al() throws IOException {
      synchronized(this) {
         int var2;
         if (-1722159009 * this.ax <= this.aq * -1223770531) {
            var2 = this.aq * -1223770531 - -1722159009 * this.ax;
         } else {
            var2 = -729898229 * this.ag - -1722159009 * this.ax + this.aq * -1223770531;
         }

         if (var2 <= 0 && this.af != null) {
            throw new IOException(this.af.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   boolean au(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < -729898229 * this.ag) {
         synchronized(this) {
            int var3;
            if (-1722159009 * this.ax <= -1223770531 * this.aq) {
               var3 = this.aq * -1223770531 - this.ax * -1722159009;
            } else {
               var3 = this.aq * -1223770531 + (this.ag * -729898229 - -1722159009 * this.ax);
            }

            if (var3 < var1) {
               if (this.af != null) {
                  throw new IOException(this.af.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int ah() throws IOException {
      synchronized(this) {
         if (this.aq * -1223770531 == this.ax * -1722159009) {
            if (this.af != null) {
               throw new IOException(this.af.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.am[-1722159009 * this.ax] & 255;
            this.ax = -975934561 * ((-1722159009 * this.ax + 1) % (-729898229 * this.ag));
            this.notifyAll();
            return var2;
         }
      }
   }

   int ap() throws IOException {
      synchronized(this) {
         if (this.aq * -1223770531 == this.ax * -1722159009) {
            if (this.af != null) {
               throw new IOException(this.af.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.am[-1722159009 * this.ax] & 255;
            this.ax = -975934561 * ((-1722159009 * this.ax + 1) % (-729898229 * this.ag));
            this.notifyAll();
            return var2;
         }
      }
   }

   int ab() throws IOException {
      synchronized(this) {
         if (this.aq * -1223770531 == this.ax * 2137674327) {
            if (this.af != null) {
               throw new IOException(this.af.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.am[-1722159009 * this.ax] & -245195418;
            this.ax = -899351027 * ((-1722159009 * this.ax + 1) % (-611662991 * this.ag));
            this.notifyAll();
            return var2;
         }
      }
   }

   int az() throws IOException {
      synchronized(this) {
         if (this.aq * 1386041659 == this.ax * -1422466433) {
            if (this.af != null) {
               throw new IOException(this.af.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.am[-2102524350 * this.ax] & 255;
            this.ax = -975934561 * ((-44703728 * this.ax + 1) % (-729898229 * this.ag));
            this.notifyAll();
            return var2;
         }
      }
   }

   int ad() throws IOException {
      synchronized(this) {
         int var2;
         if (168981698 * this.ax <= this.aq * -1223770531) {
            var2 = this.aq * -1223770531 - -1722159009 * this.ax;
         } else {
            var2 = -729898229 * this.ag - 74621067 * this.ax + this.aq * 413320506;
         }

         if (var2 <= 0 && this.af != null) {
            throw new IOException(this.af.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   void ai() {
      synchronized(this) {
         if (null == this.af) {
            this.af = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.ac.join();
      } catch (InterruptedException var3) {
      }

   }

   void ao() {
      synchronized(this) {
         if (null == this.af) {
            this.af = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.ac.join();
      } catch (InterruptedException var3) {
      }

   }

   static int ag(int var0, int var1, int var2, int var3) {
      try {
         int var4 = var0 >> 16 & 255;
         int var5 = var0 >> 8 & 255;
         int var6 = var0 & 255;
         int var7 = var1 >> 16 & 255;
         int var8 = var1 >> 8 & 255;
         int var9 = var1 & 255;
         int var10 = (1 + (var7 - var4)) * var2 / 64 + var4 & 255;
         int var11 = var2 * (var8 - var5 + 1) / 64 + var5 & 255;
         int var12 = var6 + (1 + (var9 - var6)) * var2 / 64 & 255;
         return var10 << 16 | var11 << 8 | var12;
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "sg.ag(" + ')');
      }
   }
}
