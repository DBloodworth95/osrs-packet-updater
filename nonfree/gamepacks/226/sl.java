import java.io.EOFException;
import java.io.IOException;

public final class sl {
   int aj;
   uj aw;
   uj ak;
   int ai;
   static byte[] ap = new byte[520];
   static int lg;

   boolean af(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.aw) {
         try {
            int var6;
            boolean var10000;
            if (var4) {
               if (this.ak.ak((byte)-57) < (long)(6 * var1 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.ak.aw((long)(var1 * 6));
               this.ak.ai(ap, 0, 6, 535608739);
               var6 = ((ap[3] & 255) << 16) + ((ap[4] & 255) << 8) + (ap[5] & 255);
               if (var6 <= 0 || (long)var6 > this.aw.ak((byte)-53) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.aw.ak((byte)-90) + 519L) / 520L);
               if (var6 == 0) {
                  var6 = 1;
               }
            }

            ap[0] = (byte)(var3 >> 16);
            ap[1] = (byte)(var3 >> 8);
            ap[2] = (byte)var3;
            ap[3] = (byte)(var6 >> 16);
            ap[4] = (byte)(var6 >> 8);
            ap[5] = (byte)var6;
            this.ak.aw((long)(var1 * 6));
            this.ak.as(ap, 0, 6, -309555947);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if (var7 < var3) {
                  label154: {
                     int var9 = 0;
                     int var10;
                     if (var4) {
                        this.aw.aw(520L * (long)var6);
                        int var11;
                        int var12;
                        if (var1 > 65535) {
                           try {
                              this.aw.ai(ap, 0, 10, 535608739);
                           } catch (EOFException var16) {
                              break label154;
                           }

                           var10 = ((ap[2] & 255) << 8) + ((ap[0] & 255) << 24) + ((ap[1] & 255) << 16) + (ap[3] & 255);
                           var11 = (ap[5] & 255) + ((ap[4] & 255) << 8);
                           var9 = (ap[8] & 255) + ((ap[7] & 255) << 8) + ((ap[6] & 255) << 16);
                           var12 = ap[9] & 255;
                        } else {
                           try {
                              this.aw.ai(ap, 0, 8, 535608739);
                           } catch (EOFException var15) {
                              break label154;
                           }

                           var10 = (ap[1] & 255) + ((ap[0] & 255) << 8);
                           var11 = (ap[3] & 255) + ((ap[2] & 255) << 8);
                           var9 = ((ap[5] & 255) << 8) + ((ap[4] & 255) << 16) + (ap[6] & 255);
                           var12 = ap[7] & 255;
                        }

                        if (var10 != var1 || var11 != var8 || var12 != -677148337 * this.aj) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var9 < 0 || (long)var9 > this.aw.ak((byte)-78) / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (var9 == 0) {
                        var4 = false;
                        var9 = (int)((this.aw.ak((byte)-16) + 519L) / 520L);
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

                        ap[0] = (byte)(var1 >> 24);
                        ap[1] = (byte)(var1 >> 16);
                        ap[2] = (byte)(var1 >> 8);
                        ap[3] = (byte)var1;
                        ap[4] = (byte)(var8 >> 8);
                        ap[5] = (byte)var8;
                        ap[6] = (byte)(var9 >> 16);
                        ap[7] = (byte)(var9 >> 8);
                        ap[8] = (byte)var9;
                        ap[9] = (byte)(-677148337 * this.aj);
                        this.aw.aw(520L * (long)var6);
                        this.aw.as(ap, 0, 10, -309555947);
                        var10 = var3 - var7;
                        if (var10 > 510) {
                           var10 = 510;
                        }

                        this.aw.as(var2, var7, var10, -309555947);
                        var7 += var10;
                     } else {
                        if (var3 - var7 <= 512) {
                           var9 = 0;
                        }

                        ap[0] = (byte)(var1 >> 8);
                        ap[1] = (byte)var1;
                        ap[2] = (byte)(var8 >> 8);
                        ap[3] = (byte)var8;
                        ap[4] = (byte)(var9 >> 16);
                        ap[5] = (byte)(var9 >> 8);
                        ap[6] = (byte)var9;
                        ap[7] = (byte)(this.aj * -677148337);
                        this.aw.aw(520L * (long)var6);
                        this.aw.as(ap, 0, 8, -309555947);
                        var10 = var3 - var7;
                        if (var10 > 512) {
                           var10 = 512;
                        }

                        this.aw.as(var2, var7, var10, -309555947);
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

   public boolean aw(int var1, byte[] var2, int var3, int var4) {
      try {
         synchronized(this.aw) {
            if (var3 >= 0) {
               if (var3 <= this.ai * -2063708619) {
                  boolean var6 = this.ak(var1, var2, var3, true, 1360935114);
                  if (!var6) {
                     if (var4 != 15625632) {
                        throw new IllegalStateException();
                     }

                     var6 = this.ak(var1, var2, var3, false, 1661677726);
                  }

                  return var6;
               }

               if (var4 != 15625632) {
                  throw new IllegalStateException();
               }
            }

            throw new IllegalArgumentException("" + this.aj * -677148337 + ',' + var1 + ',' + var3);
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "sl.aw(" + ')');
      }
   }

   boolean an(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.aw) {
         try {
            int var6;
            boolean var10000;
            if (var4) {
               if (this.ak.ak((byte)-105) < (long)(6 * var1 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.ak.aw((long)(var1 * 6));
               this.ak.ai(ap, 0, 6, 535608739);
               var6 = ((ap[3] & 255) << 16) + ((ap[4] & 255) << 8) + (ap[5] & 255);
               if (var6 <= 0 || (long)var6 > this.aw.ak((byte)-37) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.aw.ak((byte)-57) + 519L) / 520L);
               if (var6 == 0) {
                  var6 = 1;
               }
            }

            ap[0] = (byte)(var3 >> 16);
            ap[1] = (byte)(var3 >> 8);
            ap[2] = (byte)var3;
            ap[3] = (byte)(var6 >> 16);
            ap[4] = (byte)(var6 >> 8);
            ap[5] = (byte)var6;
            this.ak.aw((long)(var1 * 6));
            this.ak.as(ap, 0, 6, -309555947);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if (var7 < var3) {
                  label154: {
                     int var9 = 0;
                     int var10;
                     if (var4) {
                        this.aw.aw(520L * (long)var6);
                        int var11;
                        int var12;
                        if (var1 > 65535) {
                           try {
                              this.aw.ai(ap, 0, 10, 535608739);
                           } catch (EOFException var16) {
                              break label154;
                           }

                           var10 = ((ap[2] & 255) << 8) + ((ap[0] & 255) << 24) + ((ap[1] & 255) << 16) + (ap[3] & 255);
                           var11 = (ap[5] & 255) + ((ap[4] & 255) << 8);
                           var9 = (ap[8] & 255) + ((ap[7] & 255) << 8) + ((ap[6] & 255) << 16);
                           var12 = ap[9] & 255;
                        } else {
                           try {
                              this.aw.ai(ap, 0, 8, 535608739);
                           } catch (EOFException var15) {
                              break label154;
                           }

                           var10 = (ap[1] & 255) + ((ap[0] & 255) << 8);
                           var11 = (ap[3] & 255) + ((ap[2] & 255) << 8);
                           var9 = ((ap[5] & 255) << 8) + ((ap[4] & 255) << 16) + (ap[6] & 255);
                           var12 = ap[7] & 255;
                        }

                        if (var10 != var1 || var11 != var8 || var12 != -677148337 * this.aj) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var9 < 0 || (long)var9 > this.aw.ak((byte)-20) / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (var9 == 0) {
                        var4 = false;
                        var9 = (int)((this.aw.ak((byte)-41) + 519L) / 520L);
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

                        ap[0] = (byte)(var1 >> 24);
                        ap[1] = (byte)(var1 >> 16);
                        ap[2] = (byte)(var1 >> 8);
                        ap[3] = (byte)var1;
                        ap[4] = (byte)(var8 >> 8);
                        ap[5] = (byte)var8;
                        ap[6] = (byte)(var9 >> 16);
                        ap[7] = (byte)(var9 >> 8);
                        ap[8] = (byte)var9;
                        ap[9] = (byte)(-677148337 * this.aj);
                        this.aw.aw(520L * (long)var6);
                        this.aw.as(ap, 0, 10, -309555947);
                        var10 = var3 - var7;
                        if (var10 > 510) {
                           var10 = 510;
                        }

                        this.aw.as(var2, var7, var10, -309555947);
                        var7 += var10;
                     } else {
                        if (var3 - var7 <= 512) {
                           var9 = 0;
                        }

                        ap[0] = (byte)(var1 >> 8);
                        ap[1] = (byte)var1;
                        ap[2] = (byte)(var8 >> 8);
                        ap[3] = (byte)var8;
                        ap[4] = (byte)(var9 >> 16);
                        ap[5] = (byte)(var9 >> 8);
                        ap[6] = (byte)var9;
                        ap[7] = (byte)(this.aj * -677148337);
                        this.aw.aw(520L * (long)var6);
                        this.aw.as(ap, 0, 8, -309555947);
                        var10 = var3 - var7;
                        if (var10 > 512) {
                           var10 = 512;
                        }

                        this.aw.as(var2, var7, var10, -309555947);
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

   boolean ak(int var1, byte[] var2, int var3, boolean var4, int var5) {
      try {
         synchronized(this.aw) {
            boolean var10000;
            try {
               int var7;
               if (var4) {
                  label240: {
                     if (var5 <= -453086217) {
                        throw new IllegalStateException();
                     }

                     if (this.ak.ak((byte)-21) < (long)(6 * var1 + 6)) {
                        if (var5 <= -453086217) {
                           throw new IllegalStateException();
                        }

                        var10000 = false;
                        return var10000;
                     }

                     this.ak.aw((long)(var1 * 6));
                     this.ak.ai(ap, 0, 6, 535608739);
                     var7 = ((ap[3] & 255) << 16) + ((ap[4] & 255) << 8) + (ap[5] & 255);
                     if (var7 > 0) {
                        if ((long)var7 <= this.aw.ak((byte)-74) / 520L) {
                           break label240;
                        }

                        if (var5 <= -453086217) {
                           throw new IllegalStateException();
                        }
                     }

                     var10000 = false;
                     return var10000;
                  }
               } else {
                  var7 = (int)((this.aw.ak((byte)-68) + 519L) / 520L);
                  if (var7 == 0) {
                     if (var5 <= -453086217) {
                        throw new IllegalStateException();
                     }

                     var7 = 1;
                  }
               }

               ap[0] = (byte)(var3 >> 16);
               ap[1] = (byte)(var3 >> 8);
               ap[2] = (byte)var3;
               ap[3] = (byte)(var7 >> 16);
               ap[4] = (byte)(var7 >> 8);
               ap[5] = (byte)var7;
               this.ak.aw((long)(var1 * 6));
               this.ak.as(ap, 0, 6, -309555947);
               int var8 = 0;
               int var9 = 0;

               while(true) {
                  if (var8 < var3) {
                     label243: {
                        if (var5 <= -453086217) {
                           throw new IllegalStateException();
                        }

                        label220: {
                           int var10 = 0;
                           int var11;
                           if (var4) {
                              if (var5 <= -453086217) {
                                 throw new IllegalStateException();
                              }

                              this.aw.aw(520L * (long)var7);
                              int var12;
                              int var13;
                              if (var1 > 65535) {
                                 if (var5 <= -453086217) {
                                    throw new IllegalStateException();
                                 }

                                 try {
                                    this.aw.ai(ap, 0, 10, 535608739);
                                 } catch (EOFException var17) {
                                    break label243;
                                 }

                                 var11 = ((ap[2] & 255) << 8) + ((ap[0] & 255) << 24) + ((ap[1] & 255) << 16) + (ap[3] & 255);
                                 var12 = (ap[5] & 255) + ((ap[4] & 255) << 8);
                                 var10 = (ap[8] & 255) + ((ap[7] & 255) << 8) + ((ap[6] & 255) << 16);
                                 var13 = ap[9] & 255;
                              } else {
                                 try {
                                    this.aw.ai(ap, 0, 8, 535608739);
                                 } catch (EOFException var16) {
                                    break label243;
                                 }

                                 var11 = (ap[1] & 255) + ((ap[0] & 255) << 8);
                                 var12 = (ap[3] & 255) + ((ap[2] & 255) << 8);
                                 var10 = ((ap[5] & 255) << 8) + ((ap[4] & 255) << 16) + (ap[6] & 255);
                                 var13 = ap[7] & 255;
                              }

                              if (var11 != var1) {
                                 break label220;
                              }

                              if (var5 <= -453086217) {
                                 throw new IllegalStateException();
                              }

                              if (var12 != var9) {
                                 break label220;
                              }

                              if (var5 <= -453086217) {
                                 throw new IllegalStateException();
                              }

                              if (var13 != -677148337 * this.aj) {
                                 if (var5 <= -453086217) {
                                    throw new IllegalStateException();
                                 }
                                 break label220;
                              }

                              if (var10 < 0) {
                                 break;
                              }

                              if (var5 <= -453086217) {
                                 throw new IllegalStateException();
                              }

                              if ((long)var10 > this.aw.ak((byte)-126) / 520L) {
                                 if (var5 <= -453086217) {
                                    throw new IllegalStateException();
                                 }
                                 break;
                              }
                           }

                           if (var10 == 0) {
                              if (var5 <= -453086217) {
                                 throw new IllegalStateException();
                              }

                              var4 = false;
                              var10 = (int)((this.aw.ak((byte)-93) + 519L) / 520L);
                              if (var10 == 0) {
                                 if (var5 <= -453086217) {
                                    throw new IllegalStateException();
                                 }

                                 ++var10;
                              }

                              if (var7 == var10) {
                                 ++var10;
                              }
                           }

                           if (var1 > 65535) {
                              if (var5 <= -453086217) {
                                 throw new IllegalStateException();
                              }

                              if (var3 - var8 <= 510) {
                                 var10 = 0;
                              }

                              ap[0] = (byte)(var1 >> 24);
                              ap[1] = (byte)(var1 >> 16);
                              ap[2] = (byte)(var1 >> 8);
                              ap[3] = (byte)var1;
                              ap[4] = (byte)(var9 >> 8);
                              ap[5] = (byte)var9;
                              ap[6] = (byte)(var10 >> 16);
                              ap[7] = (byte)(var10 >> 8);
                              ap[8] = (byte)var10;
                              ap[9] = (byte)(-677148337 * this.aj);
                              this.aw.aw(520L * (long)var7);
                              this.aw.as(ap, 0, 10, -309555947);
                              var11 = var3 - var8;
                              if (var11 > 510) {
                                 if (var5 <= -453086217) {
                                    throw new IllegalStateException();
                                 }

                                 var11 = 510;
                              }

                              this.aw.as(var2, var8, var11, -309555947);
                              var8 += var11;
                           } else {
                              if (var3 - var8 <= 512) {
                                 if (var5 <= -453086217) {
                                    throw new IllegalStateException();
                                 }

                                 var10 = 0;
                              }

                              ap[0] = (byte)(var1 >> 8);
                              ap[1] = (byte)var1;
                              ap[2] = (byte)(var9 >> 8);
                              ap[3] = (byte)var9;
                              ap[4] = (byte)(var10 >> 16);
                              ap[5] = (byte)(var10 >> 8);
                              ap[6] = (byte)var10;
                              ap[7] = (byte)(this.aj * -677148337);
                              this.aw.aw(520L * (long)var7);
                              this.aw.as(ap, 0, 8, -309555947);
                              var11 = var3 - var8;
                              if (var11 > 512) {
                                 if (var5 <= -453086217) {
                                    throw new IllegalStateException();
                                 }

                                 var11 = 512;
                              }

                              this.aw.as(var2, var8, var11, -309555947);
                              var8 += var11;
                           }

                           var7 = var10;
                           ++var9;
                           continue;
                        }

                        var10000 = false;
                        return var10000;
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
         throw tm.aw(var20, "sl.ak(" + ')');
      }
   }

   public String toString() {
      try {
         return "" + this.aj * -677148337;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "sl.toString(" + ')');
      }
   }

   public byte[] ai(int var1) {
      synchronized(this.aw) {
         Object var10000;
         try {
            if (this.ak.ak((byte)-72) < (long)(6 * var1 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this.ak.aw((long)(var1 * 6));
            this.ak.ai(ap, 0, 6, 535608739);
            int var3 = (ap[2] & 255) + ((ap[0] & 255) << 16) + ((ap[1] & 255) << 8);
            int var4 = (ap[5] & 255) + ((ap[3] & 255) << 16) + ((ap[4] & 255) << 8);
            if (var3 < 0 || var3 > -2063708619 * this.ai) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var4 > 0 && (long)var4 <= this.aw.ak((byte)-32) / 520L) {
               byte[] var5 = new byte[var3];
               int var6 = 0;
               int var7 = 0;

               while(var6 < var3) {
                  if (0 == var4) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this.aw.aw(520L * (long)var4);
                  int var8 = var3 - var6;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  byte var13;
                  if (var1 > 65535) {
                     if (var8 > 510) {
                        var8 = 510;
                     }

                     var13 = 10;
                     this.aw.ai(ap, 0, var13 + var8, 535608739);
                     var9 = (ap[3] & 255) + ((ap[1] & 255) << 16) + ((ap[0] & 255) << 24) + ((ap[2] & 255) << 8);
                     var10 = (ap[5] & 255) + ((ap[4] & 255) << 8);
                     var11 = (ap[8] & 255) + ((ap[7] & 255) << 8) + ((ap[6] & 255) << 16);
                     var12 = ap[9] & 255;
                  } else {
                     if (var8 > 512) {
                        var8 = 512;
                     }

                     var13 = 8;
                     this.aw.ai(ap, 0, var13 + var8, 535608739);
                     var9 = ((ap[0] & 255) << 8) + (ap[1] & 255);
                     var10 = ((ap[2] & 255) << 8) + (ap[3] & 255);
                     var11 = ((ap[5] & 255) << 8) + ((ap[4] & 255) << 16) + (ap[6] & 255);
                     var12 = ap[7] & 255;
                  }

                  if (var9 == var1 && var10 == var7 && this.aj * -677148337 == var12) {
                     if (var11 >= 0 && (long)var11 <= this.aw.ak((byte)-76) / 520L) {
                        int var14 = var13 + var8;

                        for(int var15 = var13; var15 < var14; ++var15) {
                           var5[var6++] = ap[var15];
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

   public String amu() {
      return "" + this.aj * -677148337;
   }

   public byte[] aj(int var1) {
      synchronized(this.aw) {
         Object var10000;
         try {
            if (this.ak.ak((byte)-119) < (long)(6 * var1 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this.ak.aw((long)(var1 * 6));
            this.ak.ai(ap, 0, 6, 535608739);
            int var3 = (ap[2] & 255) + ((ap[0] & 255) << 16) + ((ap[1] & 255) << 8);
            int var4 = (ap[5] & 255) + ((ap[3] & 255) << 16) + ((ap[4] & 255) << 8);
            if (var3 < 0 || var3 > -2063708619 * this.ai) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var4 > 0 && (long)var4 <= this.aw.ak((byte)-33) / 520L) {
               byte[] var5 = new byte[var3];
               int var6 = 0;
               int var7 = 0;

               while(var6 < var3) {
                  if (0 == var4) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this.aw.aw(520L * (long)var4);
                  int var8 = var3 - var6;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  byte var13;
                  if (var1 > 65535) {
                     if (var8 > 510) {
                        var8 = 510;
                     }

                     var13 = 10;
                     this.aw.ai(ap, 0, var13 + var8, 535608739);
                     var9 = (ap[3] & 255) + ((ap[1] & 255) << 16) + ((ap[0] & 255) << 24) + ((ap[2] & 255) << 8);
                     var10 = (ap[5] & 255) + ((ap[4] & 255) << 8);
                     var11 = (ap[8] & 255) + ((ap[7] & 255) << 8) + ((ap[6] & 255) << 16);
                     var12 = ap[9] & 255;
                  } else {
                     if (var8 > 512) {
                        var8 = 512;
                     }

                     var13 = 8;
                     this.aw.ai(ap, 0, var13 + var8, 535608739);
                     var9 = ((ap[0] & 255) << 8) + (ap[1] & 255);
                     var10 = ((ap[2] & 255) << 8) + (ap[3] & 255);
                     var11 = ((ap[5] & 255) << 8) + ((ap[4] & 255) << 16) + (ap[6] & 255);
                     var12 = ap[7] & 255;
                  }

                  if (var9 == var1 && var10 == var7 && this.aj * -677148337 == var12) {
                     if (var11 >= 0 && (long)var11 <= this.aw.ak((byte)-113) / 520L) {
                        int var14 = var13 + var8;

                        for(int var15 = var13; var15 < var14; ++var15) {
                           var5[var6++] = ap[var15];
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

   public String amw() {
      return "" + this.aj * -677148337;
   }

   public byte[] ay(int var1) {
      synchronized(this.aw) {
         Object var10000;
         try {
            if (this.ak.ak((byte)-5) < (long)(6 * var1 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this.ak.aw((long)(var1 * 6));
            this.ak.ai(ap, 0, 6, 535608739);
            int var3 = (ap[2] & -444516973) + ((ap[0] & 255) << 16) + ((ap[1] & 255) << 8);
            int var4 = (ap[5] & 255) + ((ap[3] & 1794383621) << 16) + ((ap[4] & 255) << 8);
            if (var3 < 0 || var3 > 1077760571 * this.ai) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var4 > 0 && (long)var4 <= this.aw.ak((byte)1) / 520L) {
               byte[] var5 = new byte[var3];
               int var6 = 0;
               int var7 = 0;

               while(var6 < var3) {
                  if (0 == var4) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this.aw.aw(520L * (long)var4);
                  int var8 = var3 - var6;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  byte var13;
                  if (var1 > 1946682132) {
                     if (var8 > 29329146) {
                        var8 = 510;
                     }

                     var13 = 10;
                     this.aw.ai(ap, 0, var13 + var8, 535608739);
                     var9 = (ap[3] & 255) + ((ap[1] & 590611404) << 16) + ((ap[0] & 255) << 24) + ((ap[2] & -1637367900) << 8);
                     var10 = (ap[5] & 255) + ((ap[4] & 895318069) << 8);
                     var11 = (ap[8] & -1585281647) + ((ap[7] & 2070646868) << 8) + ((ap[6] & -1699323701) << 16);
                     var12 = ap[9] & 441246001;
                  } else {
                     if (var8 > -56188093) {
                        var8 = -1909564821;
                     }

                     var13 = 8;
                     this.aw.ai(ap, 0, var13 + var8, 535608739);
                     var9 = ((ap[0] & 255) << 8) + (ap[1] & 255);
                     var10 = ((ap[2] & 255) << 8) + (ap[3] & 1807313627);
                     var11 = ((ap[5] & -1405385693) << 8) + ((ap[4] & 802414231) << 16) + (ap[6] & 255);
                     var12 = ap[7] & -1074299632;
                  }

                  if (var9 == var1 && var10 == var7 && this.aj * -677148337 == var12) {
                     if (var11 >= 0 && (long)var11 <= this.aw.ak((byte)-108) / 520L) {
                        int var14 = var13 + var8;

                        for(int var15 = var13; var15 < var14; ++var15) {
                           var5[var6++] = ap[var15];
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

   public byte[] as(int var1) {
      synchronized(this.aw) {
         Object var10000;
         try {
            if (this.ak.ak((byte)-9) < (long)(6 * var1 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this.ak.aw((long)(var1 * 6));
            this.ak.ai(ap, 0, 6, 535608739);
            int var3 = (ap[2] & 255) + ((ap[0] & 255) << 16) + ((ap[1] & 255) << 8);
            int var4 = (ap[5] & 255) + ((ap[3] & 255) << 16) + ((ap[4] & 255) << 8);
            if (var3 < 0 || var3 > -2063708619 * this.ai) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var4 > 0 && (long)var4 <= this.aw.ak((byte)-23) / 520L) {
               byte[] var5 = new byte[var3];
               int var6 = 0;
               int var7 = 0;

               while(var6 < var3) {
                  if (0 == var4) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this.aw.aw(520L * (long)var4);
                  int var8 = var3 - var6;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  byte var13;
                  if (var1 > 65535) {
                     if (var8 > 510) {
                        var8 = 510;
                     }

                     var13 = 10;
                     this.aw.ai(ap, 0, var13 + var8, 535608739);
                     var9 = (ap[3] & 255) + ((ap[1] & 255) << 16) + ((ap[0] & 255) << 24) + ((ap[2] & 255) << 8);
                     var10 = (ap[5] & 255) + ((ap[4] & 255) << 8);
                     var11 = (ap[8] & 255) + ((ap[7] & 255) << 8) + ((ap[6] & 255) << 16);
                     var12 = ap[9] & 255;
                  } else {
                     if (var8 > 512) {
                        var8 = 512;
                     }

                     var13 = 8;
                     this.aw.ai(ap, 0, var13 + var8, 535608739);
                     var9 = ((ap[0] & 255) << 8) + (ap[1] & 255);
                     var10 = ((ap[2] & 255) << 8) + (ap[3] & 255);
                     var11 = ((ap[5] & 255) << 8) + ((ap[4] & 255) << 16) + (ap[6] & 255);
                     var12 = ap[7] & 255;
                  }

                  if (var9 == var1 && var10 == var7 && this.aj * -677148337 == var12) {
                     if (var11 >= 0 && (long)var11 <= this.aw.ak((byte)-70) / 520L) {
                        int var14 = var13 + var8;

                        for(int var15 = var13; var15 < var14; ++var15) {
                           var5[var6++] = ap[var15];
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

   public byte[] ap(int var1, int var2) {
      try {
         synchronized(this.aw) {
            try {
               Object var10000;
               if (this.ak.ak((byte)-10) < (long)(6 * var1 + 6)) {
                  if (var2 != -1776249852) {
                     throw new IllegalStateException();
                  } else {
                     var10000 = null;
                     return (byte[])var10000;
                  }
               } else {
                  this.ak.aw((long)(var1 * 6));
                  this.ak.ai(ap, 0, 6, 535608739);
                  int var4 = (ap[2] & 255) + ((ap[0] & 255) << 16) + ((ap[1] & 255) << 8);
                  int var5 = (ap[5] & 255) + ((ap[3] & 255) << 16) + ((ap[4] & 255) << 8);
                  if (var4 >= 0) {
                     if (var2 != -1776249852) {
                        throw new IllegalStateException();
                     }

                     if (var4 <= -2063708619 * this.ai) {
                        if (var5 > 0) {
                           if (var2 != -1776249852) {
                              throw new IllegalStateException();
                           }

                           if ((long)var5 <= this.aw.ak((byte)-105) / 520L) {
                              byte[] var6 = new byte[var4];
                              int var7 = 0;
                              int var8 = 0;

                              while(true) {
                                 if (var7 < var4) {
                                    if (var2 != -1776249852) {
                                       throw new IllegalStateException();
                                    }

                                    if (0 == var5) {
                                       if (var2 != -1776249852) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = null;
                                       return (byte[])var10000;
                                    }

                                    this.aw.aw(520L * (long)var5);
                                    int var9 = var4 - var7;
                                    int var10;
                                    int var11;
                                    int var12;
                                    int var13;
                                    byte var14;
                                    if (var1 > 65535) {
                                       if (var2 != -1776249852) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 > 510) {
                                          var9 = 510;
                                       }

                                       var14 = 10;
                                       this.aw.ai(ap, 0, var14 + var9, 535608739);
                                       var10 = (ap[3] & 255) + ((ap[1] & 255) << 16) + ((ap[0] & 255) << 24) + ((ap[2] & 255) << 8);
                                       var11 = (ap[5] & 255) + ((ap[4] & 255) << 8);
                                       var12 = (ap[8] & 255) + ((ap[7] & 255) << 8) + ((ap[6] & 255) << 16);
                                       var13 = ap[9] & 255;
                                    } else {
                                       if (var9 > 512) {
                                          var9 = 512;
                                       }

                                       var14 = 8;
                                       this.aw.ai(ap, 0, var14 + var9, 535608739);
                                       var10 = ((ap[0] & 255) << 8) + (ap[1] & 255);
                                       var11 = ((ap[2] & 255) << 8) + (ap[3] & 255);
                                       var12 = ((ap[5] & 255) << 8) + ((ap[4] & 255) << 16) + (ap[6] & 255);
                                       var13 = ap[7] & 255;
                                    }

                                    if (var10 != var1) {
                                       break;
                                    }

                                    if (var2 != -1776249852) {
                                       throw new IllegalStateException();
                                    }

                                    if (var11 != var8 || this.aj * -677148337 != var13) {
                                       break;
                                    }

                                    if (var12 >= 0) {
                                       if (var2 != -1776249852) {
                                          throw new IllegalStateException();
                                       }

                                       if ((long)var12 <= this.aw.ak((byte)-2) / 520L) {
                                          int var15 = var14 + var9;

                                          for(int var16 = var14; var16 < var15; ++var16) {
                                             if (var2 != -1776249852) {
                                                throw new IllegalStateException();
                                             }

                                             var6[var7++] = ap[var16];
                                          }

                                          var5 = var12;
                                          ++var8;
                                          continue;
                                       }

                                       if (var2 != -1776249852) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    var10000 = null;
                                    return (byte[])var10000;
                                 }

                                 byte[] var21 = var6;
                                 return var21;
                              }

                              var10000 = null;
                              return (byte[])var10000;
                           }
                        }

                        var10000 = null;
                        return (byte[])var10000;
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
         throw tm.aw(var20, "sl.ap(" + ')');
      }
   }

   public boolean am(int var1, byte[] var2, int var3) {
      synchronized(this.aw) {
         if (var3 >= 0 && var3 <= this.ai * -2063708619) {
            boolean var5 = this.ak(var1, var2, var3, true, 646194355);
            if (!var5) {
               var5 = this.ak(var1, var2, var3, false, -51586017);
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + this.aj * -677148337 + ',' + var1 + 1611484099 + var3);
         }
      }
   }

   public boolean at(int var1, byte[] var2, int var3) {
      synchronized(this.aw) {
         if (var3 >= 0 && var3 <= this.ai * 922288811) {
            boolean var5 = this.ak(var1, var2, var3, true, -32678975);
            if (!var5) {
               var5 = this.ak(var1, var2, var3, false, -198683366);
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + this.aj * -1250675905 + ',' + var1 + ',' + var3);
         }
      }
   }

   public boolean au(int var1, byte[] var2, int var3) {
      synchronized(this.aw) {
         if (var3 >= 0 && var3 <= this.ai * 1429891965) {
            boolean var5 = this.ak(var1, var2, var3, true, 2038410769);
            if (!var5) {
               var5 = this.ak(var1, var2, var3, false, 630110221);
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + this.aj * 1670229673 + ',' + var1 + ',' + var3);
         }
      }
   }

   boolean ao(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.aw) {
         try {
            int var6;
            boolean var10000;
            if (var4) {
               if (this.ak.ak((byte)-44) < (long)(6 * var1 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.ak.aw((long)(var1 * 6));
               this.ak.ai(ap, 0, 6, 535608739);
               var6 = ((ap[3] & 255) << 16) + ((ap[4] & 255) << 8) + (ap[5] & 255);
               if (var6 <= 0 || (long)var6 > this.aw.ak((byte)-109) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.aw.ak((byte)-75) + 519L) / 520L);
               if (var6 == 0) {
                  var6 = 1;
               }
            }

            ap[0] = (byte)(var3 >> 16);
            ap[1] = (byte)(var3 >> 8);
            ap[2] = (byte)var3;
            ap[3] = (byte)(var6 >> 16);
            ap[4] = (byte)(var6 >> 8);
            ap[5] = (byte)var6;
            this.ak.aw((long)(var1 * 6));
            this.ak.as(ap, 0, 6, -309555947);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if (var7 < var3) {
                  label154: {
                     int var9 = 0;
                     int var10;
                     if (var4) {
                        this.aw.aw(520L * (long)var6);
                        int var11;
                        int var12;
                        if (var1 > 65535) {
                           try {
                              this.aw.ai(ap, 0, 10, 535608739);
                           } catch (EOFException var16) {
                              break label154;
                           }

                           var10 = ((ap[2] & 255) << 8) + ((ap[0] & 255) << 24) + ((ap[1] & 255) << 16) + (ap[3] & 255);
                           var11 = (ap[5] & 255) + ((ap[4] & 255) << 8);
                           var9 = (ap[8] & 255) + ((ap[7] & 255) << 8) + ((ap[6] & 255) << 16);
                           var12 = ap[9] & 255;
                        } else {
                           try {
                              this.aw.ai(ap, 0, 8, 535608739);
                           } catch (EOFException var15) {
                              break label154;
                           }

                           var10 = (ap[1] & 255) + ((ap[0] & 255) << 8);
                           var11 = (ap[3] & 255) + ((ap[2] & 255) << 8);
                           var9 = ((ap[5] & 255) << 8) + ((ap[4] & 255) << 16) + (ap[6] & 255);
                           var12 = ap[7] & 255;
                        }

                        if (var10 != var1 || var11 != var8 || var12 != -677148337 * this.aj) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var9 < 0 || (long)var9 > this.aw.ak((byte)-86) / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (var9 == 0) {
                        var4 = false;
                        var9 = (int)((this.aw.ak((byte)-71) + 519L) / 520L);
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

                        ap[0] = (byte)(var1 >> 24);
                        ap[1] = (byte)(var1 >> 16);
                        ap[2] = (byte)(var1 >> 8);
                        ap[3] = (byte)var1;
                        ap[4] = (byte)(var8 >> 8);
                        ap[5] = (byte)var8;
                        ap[6] = (byte)(var9 >> 16);
                        ap[7] = (byte)(var9 >> 8);
                        ap[8] = (byte)var9;
                        ap[9] = (byte)(-677148337 * this.aj);
                        this.aw.aw(520L * (long)var6);
                        this.aw.as(ap, 0, 10, -309555947);
                        var10 = var3 - var7;
                        if (var10 > 510) {
                           var10 = 510;
                        }

                        this.aw.as(var2, var7, var10, -309555947);
                        var7 += var10;
                     } else {
                        if (var3 - var7 <= 512) {
                           var9 = 0;
                        }

                        ap[0] = (byte)(var1 >> 8);
                        ap[1] = (byte)var1;
                        ap[2] = (byte)(var8 >> 8);
                        ap[3] = (byte)var8;
                        ap[4] = (byte)(var9 >> 16);
                        ap[5] = (byte)(var9 >> 8);
                        ap[6] = (byte)var9;
                        ap[7] = (byte)(this.aj * -677148337);
                        this.aw.aw(520L * (long)var6);
                        this.aw.as(ap, 0, 8, -309555947);
                        var10 = var3 - var7;
                        if (var10 > 512) {
                           var10 = 512;
                        }

                        this.aw.as(var2, var7, var10, -309555947);
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

   public byte[] ae(int var1) {
      synchronized(this.aw) {
         Object var10000;
         try {
            if (this.ak.ak((byte)-80) < (long)(6 * var1 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this.ak.aw((long)(var1 * 6));
            this.ak.ai(ap, 0, 6, 535608739);
            int var3 = (ap[2] & 667791318) + ((ap[0] & -45609478) << 16) + ((ap[1] & 255) << 8);
            int var4 = (ap[5] & 155056402) + ((ap[3] & 255) << 16) + ((ap[4] & 1558833349) << 8);
            if (var3 < 0 || var3 > -796134721 * this.ai) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var4 > 0 && (long)var4 <= this.aw.ak((byte)-30) / 520L) {
               byte[] var5 = new byte[var3];
               int var6 = 0;
               int var7 = 0;

               while(var6 < var3) {
                  if (0 == var4) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this.aw.aw(520L * (long)var4);
                  int var8 = var3 - var6;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  byte var13;
                  if (var1 > 65535) {
                     if (var8 > 510) {
                        var8 = -1653105535;
                     }

                     var13 = 10;
                     this.aw.ai(ap, 0, var13 + var8, 535608739);
                     var9 = (ap[3] & 597274961) + ((ap[1] & 855756827) << 16) + ((ap[0] & -988095769) << 24) + ((ap[2] & 1735398193) << 8);
                     var10 = (ap[5] & 255) + ((ap[4] & 255) << 8);
                     var11 = (ap[8] & 519502210) + ((ap[7] & 255) << 8) + ((ap[6] & 255) << 16);
                     var12 = ap[9] & 255;
                  } else {
                     if (var8 > 512) {
                        var8 = -1416006400;
                     }

                     var13 = 8;
                     this.aw.ai(ap, 0, var13 + var8, 535608739);
                     var9 = ((ap[0] & 255) << 8) + (ap[1] & 255);
                     var10 = ((ap[2] & -2068023861) << 8) + (ap[3] & -1984858867);
                     var11 = ((ap[5] & 255) << 8) + ((ap[4] & 1456703158) << 16) + (ap[6] & 1748787084);
                     var12 = ap[7] & 627033664;
                  }

                  if (var9 == var1 && var10 == var7 && this.aj * 772776865 == var12) {
                     if (var11 >= 0 && (long)var11 <= this.aw.ak((byte)-125) / 520L) {
                        int var14 = var13 + var8;

                        for(int var15 = var13; var15 < var14; ++var15) {
                           var5[var6++] = ap[var15];
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

   public sl(int var1, uj var2, uj var3, int var4) {
      try {
         super();
         this.aw = null;
         this.ak = null;
         this.ai = -2133138616;
         this.aj = -642126417 * var1;
         this.aw = var2;
         this.ak = var3;
         this.ai = var4 * -1822354403;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "sl.<init>(" + ')');
      }
   }
}
