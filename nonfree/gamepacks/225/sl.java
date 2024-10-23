import java.io.EOFException;
import java.io.IOException;

public final class sl {
   int am;
   ua ae;
   static byte[] ac = new byte[520];
   int ax;
   ua ag;

   boolean af(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.ae) {
         try {
            int var6;
            boolean var10000;
            if (var4) {
               if (this.ag.ag(2058210947) < (long)(var1 * 6 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.ag.ae((long)(6 * var1));
               this.ag.ax(ac, 0, 6, (byte)90);
               var6 = ((ac[4] & 255) << 8) + ((ac[3] & 255) << 16) + (ac[5] & 255);
               if (var6 <= 0 || (long)var6 > this.ae.ag(865504311) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.ae.ag(465607437) + 519L) / 520L);
               if (0 == var6) {
                  var6 = 1;
               }
            }

            ac[0] = (byte)(var3 >> 16);
            ac[1] = (byte)(var3 >> 8);
            ac[2] = (byte)var3;
            ac[3] = (byte)(var6 >> 16);
            ac[4] = (byte)(var6 >> 8);
            ac[5] = (byte)var6;
            this.ag.ae((long)(6 * var1));
            this.ag.af(ac, 0, 6, (byte)1);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if (var7 < var3) {
                  label154: {
                     int var9 = 0;
                     int var10;
                     if (var4) {
                        this.ae.ae(520L * (long)var6);
                        int var11;
                        int var12;
                        if (var1 > 65535) {
                           try {
                              this.ae.ax(ac, 0, 10, (byte)38);
                           } catch (EOFException var16) {
                              break label154;
                           }

                           var10 = ((ac[2] & 255) << 8) + ((ac[0] & 255) << 24) + ((ac[1] & 255) << 16) + (ac[3] & 255);
                           var11 = (ac[5] & 255) + ((ac[4] & 255) << 8);
                           var9 = ((ac[7] & 255) << 8) + ((ac[6] & 255) << 16) + (ac[8] & 255);
                           var12 = ac[9] & 255;
                        } else {
                           try {
                              this.ae.ax(ac, 0, 8, (byte)118);
                           } catch (EOFException var15) {
                              break label154;
                           }

                           var10 = (ac[1] & 255) + ((ac[0] & 255) << 8);
                           var11 = ((ac[2] & 255) << 8) + (ac[3] & 255);
                           var9 = ((ac[4] & 255) << 16) + ((ac[5] & 255) << 8) + (ac[6] & 255);
                           var12 = ac[7] & 255;
                        }

                        if (var10 != var1 || var11 != var8 || 1877769341 * this.am != var12) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var9 < 0 || (long)var9 > this.ae.ag(928671198) / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (0 == var9) {
                        var4 = false;
                        var9 = (int)((this.ae.ag(1224337589) + 519L) / 520L);
                        if (var9 == 0) {
                           ++var9;
                        }

                        if (var6 == var9) {
                           ++var9;
                        }
                     }

                     if (var1 > 65535) {
                        if (var3 - var7 <= 510) {
                           var9 = 0;
                        }

                        ac[0] = (byte)(var1 >> 24);
                        ac[1] = (byte)(var1 >> 16);
                        ac[2] = (byte)(var1 >> 8);
                        ac[3] = (byte)var1;
                        ac[4] = (byte)(var8 >> 8);
                        ac[5] = (byte)var8;
                        ac[6] = (byte)(var9 >> 16);
                        ac[7] = (byte)(var9 >> 8);
                        ac[8] = (byte)var9;
                        ac[9] = (byte)(1877769341 * this.am);
                        this.ae.ae((long)var6 * 520L);
                        this.ae.af(ac, 0, 10, (byte)1);
                        var10 = var3 - var7;
                        if (var10 > 510) {
                           var10 = 510;
                        }

                        this.ae.af(var2, var7, var10, (byte)1);
                        var7 += var10;
                     } else {
                        if (var3 - var7 <= 512) {
                           var9 = 0;
                        }

                        ac[0] = (byte)(var1 >> 8);
                        ac[1] = (byte)var1;
                        ac[2] = (byte)(var8 >> 8);
                        ac[3] = (byte)var8;
                        ac[4] = (byte)(var9 >> 16);
                        ac[5] = (byte)(var9 >> 8);
                        ac[6] = (byte)var9;
                        ac[7] = (byte)(this.am * 1877769341);
                        this.ae.ae(520L * (long)var6);
                        this.ae.af(ac, 0, 8, (byte)1);
                        var10 = var3 - var7;
                        if (var10 > 512) {
                           var10 = 512;
                        }

                        this.ae.af(var2, var7, var10, (byte)1);
                        var7 += var10;
                     }

                     var6 = var9;
                     ++var8;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var17) {
            return false;
         }
      }
   }

   public byte[] ac(int var1, short var2) {
      try {
         synchronized(this.ae) {
            try {
               Object var10000;
               if (this.ag.ag(1026227441) < (long)(6 + var1 * 6)) {
                  if (var2 == 1408) {
                     throw new IllegalStateException();
                  } else {
                     var10000 = null;
                     return (byte[])var10000;
                  }
               } else {
                  this.ag.ae((long)(6 * var1));
                  this.ag.ax(ac, 0, 6, (byte)93);
                  int var4 = ((ac[0] & 255) << 16) + ((ac[1] & 255) << 8) + (ac[2] & 255);
                  int var5 = ((ac[4] & 255) << 8) + ((ac[3] & 255) << 16) + (ac[5] & 255);
                  if (var4 >= 0) {
                     if (var2 == 1408) {
                        throw new IllegalStateException();
                     }

                     if (var4 <= -1713404797 * this.ax) {
                        label225: {
                           if (var5 > 0) {
                              if (var2 == 1408) {
                                 throw new IllegalStateException();
                              }

                              if ((long)var5 <= this.ae.ag(746009819) / 520L) {
                                 byte[] var6 = new byte[var4];
                                 int var7 = 0;
                                 int var8 = 0;

                                 while(true) {
                                    if (var7 < var4) {
                                       if (var2 == 1408) {
                                          throw new IllegalStateException();
                                       }

                                       if (0 == var5) {
                                          if (var2 == 1408) {
                                             throw new IllegalStateException();
                                          }

                                          var10000 = null;
                                          return (byte[])var10000;
                                       }

                                       this.ae.ae(520L * (long)var5);
                                       int var9 = var4 - var7;
                                       int var10;
                                       int var11;
                                       int var12;
                                       int var13;
                                       byte var14;
                                       if (var1 > 65535) {
                                          if (var9 > 510) {
                                             if (var2 == 1408) {
                                                throw new IllegalStateException();
                                             }

                                             var9 = 510;
                                          }

                                          var14 = 10;
                                          this.ae.ax(ac, 0, var14 + var9, (byte)109);
                                          var10 = (ac[3] & 255) + ((ac[2] & 255) << 8) + ((ac[0] & 255) << 24) + ((ac[1] & 255) << 16);
                                          var11 = ((ac[4] & 255) << 8) + (ac[5] & 255);
                                          var12 = (ac[8] & 255) + ((ac[6] & 255) << 16) + ((ac[7] & 255) << 8);
                                          var13 = ac[9] & 255;
                                       } else {
                                          if (var9 > 512) {
                                             if (var2 == 1408) {
                                                throw new IllegalStateException();
                                             }

                                             var9 = 512;
                                          }

                                          var14 = 8;
                                          this.ae.ax(ac, 0, var9 + var14, (byte)21);
                                          var10 = ((ac[0] & 255) << 8) + (ac[1] & 255);
                                          var11 = ((ac[2] & 255) << 8) + (ac[3] & 255);
                                          var12 = (ac[6] & 255) + ((ac[4] & 255) << 16) + ((ac[5] & 255) << 8);
                                          var13 = ac[7] & 255;
                                       }

                                       if (var1 != var10) {
                                          break label225;
                                       }

                                       if (var2 == 1408) {
                                          throw new IllegalStateException();
                                       }

                                       if (var11 != var8) {
                                          break label225;
                                       }

                                       if (var2 == 1408) {
                                          throw new IllegalStateException();
                                       }

                                       if (var13 != 1877769341 * this.am) {
                                          if (var2 == 1408) {
                                             throw new IllegalStateException();
                                          }
                                          break label225;
                                       }

                                       if (var12 >= 0) {
                                          if (var2 == 1408) {
                                             throw new IllegalStateException();
                                          }

                                          if ((long)var12 <= this.ae.ag(1339895702) / 520L) {
                                             int var15 = var9 + var14;

                                             for(int var16 = var14; var16 < var15; ++var16) {
                                                if (var2 == 1408) {
                                                   throw new IllegalStateException();
                                                }

                                                var6[var7++] = ac[var16];
                                             }

                                             var5 = var12;
                                             ++var8;
                                             continue;
                                          }

                                          if (var2 == 1408) {
                                             throw new IllegalStateException();
                                          }
                                       }

                                       var10000 = null;
                                       return (byte[])var10000;
                                    }

                                    byte[] var21 = var6;
                                    return var21;
                                 }
                              }

                              if (var2 == 1408) {
                                 throw new IllegalStateException();
                              }
                           }

                           var10000 = null;
                           return (byte[])var10000;
                        }

                        var10000 = null;
                        return (byte[])var10000;
                     }

                     if (var2 == 1408) {
                        throw new IllegalStateException();
                     }
                  }

                  var10000 = null;
                  return (byte[])var10000;
               }
            } catch (IOException var18) {
               return null;
            }
         }
      } catch (RuntimeException var20) {
         throw vk.ae(var20, "sl.ac(" + ')');
      }
   }

   public boolean ae(int var1, byte[] var2, int var3, int var4) {
      try {
         synchronized(this.ae) {
            if (var3 >= 0) {
               if (var4 == 338011240) {
                  throw new IllegalStateException();
               }

               if (var3 <= this.ax * -1713404797) {
                  boolean var6 = this.ag(var1, var2, var3, true, (byte)119);
                  if (!var6) {
                     if (var4 == 338011240) {
                        throw new IllegalStateException();
                     }

                     var6 = this.ag(var1, var2, var3, false, (byte)67);
                  }

                  return var6;
               }

               if (var4 == 338011240) {
                  throw new IllegalStateException();
               }
            }

            throw new IllegalArgumentException("" + this.am * 1877769341 + ',' + var1 + ',' + var3);
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "sl.ae(" + ')');
      }
   }

   boolean ag(int var1, byte[] var2, int var3, boolean var4, byte var5) {
      try {
         synchronized(this.ae) {
            boolean var10000;
            try {
               int var7;
               if (var4) {
                  label228: {
                     if (var5 <= 4) {
                        throw new IllegalStateException();
                     }

                     if (this.ag.ag(859287903) < (long)(var1 * 6 + 6)) {
                        if (var5 <= 4) {
                           throw new IllegalStateException();
                        }

                        var10000 = false;
                        return var10000;
                     }

                     this.ag.ae((long)(6 * var1));
                     this.ag.ax(ac, 0, 6, (byte)104);
                     var7 = ((ac[4] & 255) << 8) + ((ac[3] & 255) << 16) + (ac[5] & 255);
                     if (var7 > 0) {
                        if ((long)var7 <= this.ae.ag(1794792639) / 520L) {
                           break label228;
                        }

                        if (var5 <= 4) {
                           throw new IllegalStateException();
                        }
                     }

                     var10000 = false;
                     return var10000;
                  }
               } else {
                  var7 = (int)((this.ae.ag(488837021) + 519L) / 520L);
                  if (0 == var7) {
                     if (var5 <= 4) {
                        throw new IllegalStateException();
                     }

                     var7 = 1;
                  }
               }

               ac[0] = (byte)(var3 >> 16);
               ac[1] = (byte)(var3 >> 8);
               ac[2] = (byte)var3;
               ac[3] = (byte)(var7 >> 16);
               ac[4] = (byte)(var7 >> 8);
               ac[5] = (byte)var7;
               this.ag.ae((long)(6 * var1));
               this.ag.af(ac, 0, 6, (byte)1);
               int var8 = 0;
               int var9 = 0;

               while(true) {
                  if (var8 < var3) {
                     label215: {
                        int var10 = 0;
                        int var11;
                        if (var4) {
                           label231: {
                              if (var5 <= 4) {
                                 throw new IllegalStateException();
                              }

                              this.ae.ae(520L * (long)var7);
                              int var12;
                              int var13;
                              if (var1 > 65535) {
                                 if (var5 <= 4) {
                                    throw new IllegalStateException();
                                 }

                                 try {
                                    this.ae.ax(ac, 0, 10, (byte)119);
                                 } catch (EOFException var17) {
                                    break label215;
                                 }

                                 var11 = ((ac[2] & 255) << 8) + ((ac[0] & 255) << 24) + ((ac[1] & 255) << 16) + (ac[3] & 255);
                                 var12 = (ac[5] & 255) + ((ac[4] & 255) << 8);
                                 var10 = ((ac[7] & 255) << 8) + ((ac[6] & 255) << 16) + (ac[8] & 255);
                                 var13 = ac[9] & 255;
                              } else {
                                 try {
                                    this.ae.ax(ac, 0, 8, (byte)36);
                                 } catch (EOFException var16) {
                                    break label215;
                                 }

                                 var11 = (ac[1] & 255) + ((ac[0] & 255) << 8);
                                 var12 = ((ac[2] & 255) << 8) + (ac[3] & 255);
                                 var10 = ((ac[4] & 255) << 16) + ((ac[5] & 255) << 8) + (ac[6] & 255);
                                 var13 = ac[7] & 255;
                              }

                              if (var11 == var1) {
                                 if (var5 <= 4) {
                                    throw new IllegalStateException();
                                 }

                                 if (var12 == var9) {
                                    if (var5 <= 4) {
                                       throw new IllegalStateException();
                                    }

                                    if (1877769341 * this.am == var13) {
                                       if (var10 < 0) {
                                          break;
                                       }

                                       if ((long)var10 > this.ae.ag(1545194472) / 520L) {
                                          if (var5 <= 4) {
                                             throw new IllegalStateException();
                                          }
                                          break;
                                       }
                                       break label231;
                                    }

                                    if (var5 <= 4) {
                                       throw new IllegalStateException();
                                    }
                                 }
                              }

                              var10000 = false;
                              return var10000;
                           }
                        }

                        if (0 == var10) {
                           var4 = false;
                           var10 = (int)((this.ae.ag(1716520883) + 519L) / 520L);
                           if (var10 == 0) {
                              if (var5 <= 4) {
                                 throw new IllegalStateException();
                              }

                              ++var10;
                           }

                           if (var7 == var10) {
                              ++var10;
                           }
                        }

                        if (var1 > 65535) {
                           if (var5 <= 4) {
                              throw new IllegalStateException();
                           }

                           if (var3 - var8 <= 510) {
                              if (var5 <= 4) {
                                 throw new IllegalStateException();
                              }

                              var10 = 0;
                           }

                           ac[0] = (byte)(var1 >> 24);
                           ac[1] = (byte)(var1 >> 16);
                           ac[2] = (byte)(var1 >> 8);
                           ac[3] = (byte)var1;
                           ac[4] = (byte)(var9 >> 8);
                           ac[5] = (byte)var9;
                           ac[6] = (byte)(var10 >> 16);
                           ac[7] = (byte)(var10 >> 8);
                           ac[8] = (byte)var10;
                           ac[9] = (byte)(1877769341 * this.am);
                           this.ae.ae((long)var7 * 520L);
                           this.ae.af(ac, 0, 10, (byte)1);
                           var11 = var3 - var8;
                           if (var11 > 510) {
                              var11 = 510;
                           }

                           this.ae.af(var2, var8, var11, (byte)1);
                           var8 += var11;
                        } else {
                           if (var3 - var8 <= 512) {
                              if (var5 <= 4) {
                                 throw new IllegalStateException();
                              }

                              var10 = 0;
                           }

                           ac[0] = (byte)(var1 >> 8);
                           ac[1] = (byte)var1;
                           ac[2] = (byte)(var9 >> 8);
                           ac[3] = (byte)var9;
                           ac[4] = (byte)(var10 >> 16);
                           ac[5] = (byte)(var10 >> 8);
                           ac[6] = (byte)var10;
                           ac[7] = (byte)(this.am * 1877769341);
                           this.ae.ae(520L * (long)var7);
                           this.ae.af(ac, 0, 8, (byte)1);
                           var11 = var3 - var8;
                           if (var11 > 512) {
                              if (var5 <= 4) {
                                 throw new IllegalStateException();
                              }

                              var11 = 512;
                           }

                           this.ae.af(var2, var8, var11, (byte)1);
                           var8 += var11;
                        }

                        var7 = var10;
                        ++var9;
                        continue;
                     }
                  }

                  var10000 = true;
                  return var10000;
               }

               var10000 = false;
            } catch (IOException var18) {
               return false;
            }

            return var10000;
         }
      } catch (RuntimeException var20) {
         throw vk.ae(var20, "sl.ag(" + ')');
      }
   }

   public String toString() {
      try {
         return "" + 1877769341 * this.am;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "sl.toString(" + ')');
      }
   }

   public String aml() {
      return "" + 1877769341 * this.am;
   }

   public sl(int var1, ua var2, ua var3, int var4) {
      try {
         super();
         this.ae = null;
         this.ag = null;
         this.ax = -1818708488;
         this.am = var1 * 1528159445;
         this.ae = var2;
         this.ag = var3;
         this.ax = var4 * 138930731;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "sl.<init>(" + ')');
      }
   }

   boolean aq(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.ae) {
         try {
            int var6;
            boolean var10000;
            if (var4) {
               if (this.ag.ag(1463347458) < (long)(var1 * 6 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.ag.ae((long)(6 * var1));
               this.ag.ax(ac, 0, 6, (byte)55);
               var6 = ((ac[4] & 255) << 8) + ((ac[3] & 255) << 16) + (ac[5] & 255);
               if (var6 <= 0 || (long)var6 > this.ae.ag(1869756214) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.ae.ag(1436715857) + 519L) / 520L);
               if (0 == var6) {
                  var6 = 1;
               }
            }

            ac[0] = (byte)(var3 >> 16);
            ac[1] = (byte)(var3 >> 8);
            ac[2] = (byte)var3;
            ac[3] = (byte)(var6 >> 16);
            ac[4] = (byte)(var6 >> 8);
            ac[5] = (byte)var6;
            this.ag.ae((long)(6 * var1));
            this.ag.af(ac, 0, 6, (byte)1);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if (var7 < var3) {
                  label154: {
                     int var9 = 0;
                     int var10;
                     if (var4) {
                        this.ae.ae(520L * (long)var6);
                        int var11;
                        int var12;
                        if (var1 > 65535) {
                           try {
                              this.ae.ax(ac, 0, 10, (byte)13);
                           } catch (EOFException var16) {
                              break label154;
                           }

                           var10 = ((ac[2] & 255) << 8) + ((ac[0] & 255) << 24) + ((ac[1] & 255) << 16) + (ac[3] & 255);
                           var11 = (ac[5] & 255) + ((ac[4] & 255) << 8);
                           var9 = ((ac[7] & 255) << 8) + ((ac[6] & 255) << 16) + (ac[8] & 255);
                           var12 = ac[9] & 255;
                        } else {
                           try {
                              this.ae.ax(ac, 0, 8, (byte)12);
                           } catch (EOFException var15) {
                              break label154;
                           }

                           var10 = (ac[1] & 255) + ((ac[0] & 255) << 8);
                           var11 = ((ac[2] & 255) << 8) + (ac[3] & 255);
                           var9 = ((ac[4] & 255) << 16) + ((ac[5] & 255) << 8) + (ac[6] & 255);
                           var12 = ac[7] & 255;
                        }

                        if (var10 != var1 || var11 != var8 || 1877769341 * this.am != var12) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var9 < 0 || (long)var9 > this.ae.ag(1467095482) / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (0 == var9) {
                        var4 = false;
                        var9 = (int)((this.ae.ag(311337228) + 519L) / 520L);
                        if (var9 == 0) {
                           ++var9;
                        }

                        if (var6 == var9) {
                           ++var9;
                        }
                     }

                     if (var1 > 65535) {
                        if (var3 - var7 <= 510) {
                           var9 = 0;
                        }

                        ac[0] = (byte)(var1 >> 24);
                        ac[1] = (byte)(var1 >> 16);
                        ac[2] = (byte)(var1 >> 8);
                        ac[3] = (byte)var1;
                        ac[4] = (byte)(var8 >> 8);
                        ac[5] = (byte)var8;
                        ac[6] = (byte)(var9 >> 16);
                        ac[7] = (byte)(var9 >> 8);
                        ac[8] = (byte)var9;
                        ac[9] = (byte)(1877769341 * this.am);
                        this.ae.ae((long)var6 * 520L);
                        this.ae.af(ac, 0, 10, (byte)1);
                        var10 = var3 - var7;
                        if (var10 > 510) {
                           var10 = 510;
                        }

                        this.ae.af(var2, var7, var10, (byte)1);
                        var7 += var10;
                     } else {
                        if (var3 - var7 <= 512) {
                           var9 = 0;
                        }

                        ac[0] = (byte)(var1 >> 8);
                        ac[1] = (byte)var1;
                        ac[2] = (byte)(var8 >> 8);
                        ac[3] = (byte)var8;
                        ac[4] = (byte)(var9 >> 16);
                        ac[5] = (byte)(var9 >> 8);
                        ac[6] = (byte)var9;
                        ac[7] = (byte)(this.am * 1877769341);
                        this.ae.ae(520L * (long)var6);
                        this.ae.af(ac, 0, 8, (byte)1);
                        var10 = var3 - var7;
                        if (var10 > 512) {
                           var10 = 512;
                        }

                        this.ae.af(var2, var7, var10, (byte)1);
                        var7 += var10;
                     }

                     var6 = var9;
                     ++var8;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var17) {
            return false;
         }
      }
   }

   public String ame() {
      return "" + 1550631805 * this.am;
   }

   public byte[] am(int var1) {
      synchronized(this.ae) {
         Object var10000;
         try {
            if (this.ag.ag(1055405605) < (long)(6 + var1 * 6)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this.ag.ae((long)(6 * var1));
            this.ag.ax(ac, 0, 6, (byte)109);
            int var3 = ((ac[0] & 255) << 16) + ((ac[1] & 1678187703) << 8) + (ac[2] & 255);
            int var4 = ((ac[4] & 255) << 8) + ((ac[3] & 255) << 16) + (ac[5] & 120192681);
            if (var3 < 0 || var3 > 685031885 * this.ax) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var4 > 0 && (long)var4 <= this.ae.ag(542278025) / 520L) {
               byte[] var5 = new byte[var3];
               int var6 = 0;
               int var7 = 0;

               while(var6 < var3) {
                  if (0 == var4) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this.ae.ae(520L * (long)var4);
                  int var8 = var3 - var6;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  byte var13;
                  if (var1 > 65535) {
                     if (var8 > 510) {
                        var8 = 760859206;
                     }

                     var13 = 10;
                     this.ae.ax(ac, 0, var13 + var8, (byte)40);
                     var9 = (ac[3] & -431308699) + ((ac[2] & 1530418905) << 8) + ((ac[0] & 403356098) << 24) + ((ac[1] & 936152812) << 16);
                     var10 = ((ac[4] & 84426892) << 8) + (ac[5] & 255);
                     var11 = (ac[8] & -1168994517) + ((ac[6] & -1502516797) << 16) + ((ac[7] & 255) << 8);
                     var12 = ac[9] & 255;
                  } else {
                     if (var8 > 512) {
                        var8 = 512;
                     }

                     var13 = 8;
                     this.ae.ax(ac, 0, var8 + var13, (byte)83);
                     var9 = ((ac[0] & -860269443) << 8) + (ac[1] & 826911417);
                     var10 = ((ac[2] & 255) << 8) + (ac[3] & -1026099919);
                     var11 = (ac[6] & 1227281781) + ((ac[4] & 255) << 16) + ((ac[5] & 255) << 8);
                     var12 = ac[7] & 255;
                  }

                  if (var1 == var9 && var10 == var7 && var12 == 1877769341 * this.am) {
                     if (var11 >= 0 && (long)var11 <= this.ae.ag(1042587203) / 520L) {
                        int var14 = var8 + var13;

                        for(int var15 = var13; var15 < var14; ++var15) {
                           var5[var6++] = ac[var15];
                        }

                        var4 = var11;
                        ++var7;
                        continue;
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  var10000 = null;
                  return (byte[])var10000;
               }

               byte[] var19 = var5;
               return var19;
            }

            var10000 = null;
         } catch (IOException var17) {
            return null;
         }

         return (byte[])var10000;
      }
   }

   public boolean ax(int var1, byte[] var2, int var3) {
      synchronized(this.ae) {
         if (var3 >= 0 && var3 <= this.ax * -1713404797) {
            boolean var5 = this.ag(var1, var2, var3, true, (byte)84);
            if (!var5) {
               var5 = this.ag(var1, var2, var3, false, (byte)70);
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + this.am * 1877769341 + ',' + var1 + ',' + var3);
         }
      }
   }

   boolean at(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.ae) {
         try {
            int var6;
            boolean var10000;
            if (var4) {
               if (this.ag.ag(940573515) < (long)(var1 * 6 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.ag.ae((long)(6 * var1));
               this.ag.ax(ac, 0, 6, (byte)67);
               var6 = ((ac[4] & 255) << 8) + ((ac[3] & 255) << 16) + (ac[5] & 255);
               if (var6 <= 0 || (long)var6 > this.ae.ag(54460870) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.ae.ag(1384112124) + 519L) / 520L);
               if (0 == var6) {
                  var6 = 1;
               }
            }

            ac[0] = (byte)(var3 >> 16);
            ac[1] = (byte)(var3 >> 8);
            ac[2] = (byte)var3;
            ac[3] = (byte)(var6 >> 16);
            ac[4] = (byte)(var6 >> 8);
            ac[5] = (byte)var6;
            this.ag.ae((long)(6 * var1));
            this.ag.af(ac, 0, 6, (byte)1);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if (var7 < var3) {
                  label154: {
                     int var9 = 0;
                     int var10;
                     if (var4) {
                        this.ae.ae(520L * (long)var6);
                        int var11;
                        int var12;
                        if (var1 > 65535) {
                           try {
                              this.ae.ax(ac, 0, 10, (byte)20);
                           } catch (EOFException var16) {
                              break label154;
                           }

                           var10 = ((ac[2] & 255) << 8) + ((ac[0] & 255) << 24) + ((ac[1] & 255) << 16) + (ac[3] & 255);
                           var11 = (ac[5] & 255) + ((ac[4] & 255) << 8);
                           var9 = ((ac[7] & 255) << 8) + ((ac[6] & 255) << 16) + (ac[8] & 255);
                           var12 = ac[9] & 255;
                        } else {
                           try {
                              this.ae.ax(ac, 0, 8, (byte)30);
                           } catch (EOFException var15) {
                              break label154;
                           }

                           var10 = (ac[1] & 255) + ((ac[0] & 255) << 8);
                           var11 = ((ac[2] & 255) << 8) + (ac[3] & 255);
                           var9 = ((ac[4] & 255) << 16) + ((ac[5] & 255) << 8) + (ac[6] & 255);
                           var12 = ac[7] & 255;
                        }

                        if (var10 != var1 || var11 != var8 || 1877769341 * this.am != var12) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var9 < 0 || (long)var9 > this.ae.ag(896755992) / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (0 == var9) {
                        var4 = false;
                        var9 = (int)((this.ae.ag(2019795903) + 519L) / 520L);
                        if (var9 == 0) {
                           ++var9;
                        }

                        if (var6 == var9) {
                           ++var9;
                        }
                     }

                     if (var1 > 65535) {
                        if (var3 - var7 <= 510) {
                           var9 = 0;
                        }

                        ac[0] = (byte)(var1 >> 24);
                        ac[1] = (byte)(var1 >> 16);
                        ac[2] = (byte)(var1 >> 8);
                        ac[3] = (byte)var1;
                        ac[4] = (byte)(var8 >> 8);
                        ac[5] = (byte)var8;
                        ac[6] = (byte)(var9 >> 16);
                        ac[7] = (byte)(var9 >> 8);
                        ac[8] = (byte)var9;
                        ac[9] = (byte)(1877769341 * this.am);
                        this.ae.ae((long)var6 * 520L);
                        this.ae.af(ac, 0, 10, (byte)1);
                        var10 = var3 - var7;
                        if (var10 > 510) {
                           var10 = 510;
                        }

                        this.ae.af(var2, var7, var10, (byte)1);
                        var7 += var10;
                     } else {
                        if (var3 - var7 <= 512) {
                           var9 = 0;
                        }

                        ac[0] = (byte)(var1 >> 8);
                        ac[1] = (byte)var1;
                        ac[2] = (byte)(var8 >> 8);
                        ac[3] = (byte)var8;
                        ac[4] = (byte)(var9 >> 16);
                        ac[5] = (byte)(var9 >> 8);
                        ac[6] = (byte)var9;
                        ac[7] = (byte)(this.am * 1877769341);
                        this.ae.ae(520L * (long)var6);
                        this.ae.af(ac, 0, 8, (byte)1);
                        var10 = var3 - var7;
                        if (var10 > 512) {
                           var10 = 512;
                        }

                        this.ae.af(var2, var7, var10, (byte)1);
                        var7 += var10;
                     }

                     var6 = var9;
                     ++var8;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var17) {
            return false;
         }
      }
   }

   public String amp() {
      return "" + 1877769341 * this.am;
   }
}
