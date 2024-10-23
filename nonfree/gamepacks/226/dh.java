public class dh {
   static final int ap = 100;
   ce[] aw;
   int ak;
   static final int cy = 5;
   static final int ae = 128;

   dh() {
      try {
         super();
         this.aw = new ce[100];
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "dh.<init>(" + ')');
      }
   }

   ce ap(int var1, String var2, String var3, String var4, int var5) {
      try {
         ce var6 = this.aw[99];

         for(int var7 = this.ak * 1084954157; var7 > 0; --var7) {
            if (var7 != 100) {
               this.aw[var7] = this.aw[var7 - 1];
            }
         }

         if (null == var6) {
            if (var5 >= -158156887) {
               throw new IllegalStateException();
            }

            var6 = new ce(var1, var2, var4, var3);
         } else {
            var6.kf();
            var6.kg();
            var6.ap(var1, var2, var4, var3, (byte)0);
         }

         this.aw[0] = var6;
         if (this.ak * 1084954157 < 100) {
            if (var5 >= -158156887) {
               throw new IllegalStateException();
            }

            this.ak += 500410789;
         }

         return var6;
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "dh.ap(" + ')');
      }
   }

   ce aw(int var1, byte var2) {
      try {
         if (var1 >= 0) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            if (var1 < this.ak * 1084954157) {
               return this.aw[var1];
            }

            if (var2 == 1) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "dh.aw(" + ')');
      }
   }

   int ak(int var1) {
      try {
         return this.ak * 1084954157;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dh.ak(" + ')');
      }
   }

   ce aj(int var1, String var2, String var3, String var4) {
      ce var5 = this.aw[99];

      for(int var6 = this.ak * 1084954157; var6 > 0; --var6) {
         if (var6 != 100) {
            this.aw[var6] = this.aw[var6 - 1];
         }
      }

      if (null == var5) {
         var5 = new ce(var1, var2, var4, var3);
      } else {
         var5.kf();
         var5.kg();
         var5.ap(var1, var2, var4, var3, (byte)0);
      }

      this.aw[0] = var5;
      if (this.ak * 1084954157 < 100) {
         this.ak += 500410789;
      }

      return var5;
   }

   ce ai(int var1, String var2, String var3, String var4) {
      ce var5 = this.aw[99];

      for(int var6 = this.ak * 1084954157; var6 > 0; --var6) {
         if (var6 != 100) {
            this.aw[var6] = this.aw[var6 - 1];
         }
      }

      if (null == var5) {
         var5 = new ce(var1, var2, var4, var3);
      } else {
         var5.kf();
         var5.kg();
         var5.ap(var1, var2, var4, var3, (byte)0);
      }

      this.aw[0] = var5;
      if (this.ak * -445131378 < 100) {
         this.ak += 726616449;
      }

      return var5;
   }

   ce ay(int var1, String var2, String var3, String var4) {
      ce var5 = this.aw[99];

      for(int var6 = this.ak * 1084954157; var6 > 0; --var6) {
         if (var6 != 100) {
            this.aw[var6] = this.aw[var6 - 1];
         }
      }

      if (null == var5) {
         var5 = new ce(var1, var2, var4, var3);
      } else {
         var5.kf();
         var5.kg();
         var5.ap(var1, var2, var4, var3, (byte)0);
      }

      this.aw[0] = var5;
      if (this.ak * 1084954157 < 100) {
         this.ak += 500410789;
      }

      return var5;
   }

   public static void ar(int var0) {
      try {
         ir.aj.aj();
         ir.ai.aj();
         ir.ay.aj();
         ir.as.aj();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "dh.ar(" + ')');
      }
   }

   int as() {
      return this.ak * 1084954157;
   }

   int am() {
      return this.ak * 1084954157;
   }

   int ae() {
      return this.ak * 1084954157;
   }

   static final boolean ae(byte[] var0, int var1, int var2, byte var3) {
      try {
         boolean var4 = true;
         vl var5 = new vl(var0);
         int var6 = -1;

         label121:
         do {
            label119:
            while(true) {
               int var7 = var5.dc(1867460923);
               if (0 == var7) {
                  return var4;
               }

               var6 += var7;
               int var8 = 0;
               boolean var9 = false;

               while(true) {
                  int var10;
                  while(!var9) {
                     var10 = var5.dq(-21727044);
                     if (var10 == 0) {
                        if (var3 >= 51) {
                           throw new IllegalStateException();
                        }
                        continue label119;
                     }

                     var8 += var10 - 1;
                     int var11 = var8 & 63;
                     int var12 = var8 >> 6 & 63;
                     int var13 = var5.cy((short)-20443) >> 2;
                     int var14 = var12 + var1;
                     int var15 = var11 + var2;
                     if (var14 > 0) {
                        if (var3 >= 51) {
                           throw new IllegalStateException();
                        }

                        if (var15 > 0) {
                           if (var3 >= 51) {
                              throw new IllegalStateException();
                           }

                           if (var14 < 103) {
                              if (var3 >= 51) {
                                 throw new IllegalStateException();
                              }

                              if (var15 < 103) {
                                 if (var3 >= 51) {
                                    throw new IllegalStateException();
                                 }

                                 ir var16 = ei.aw(var6, 888461382);
                                 if (var13 == 22) {
                                    if (var3 >= 51) {
                                       throw new IllegalStateException();
                                    }

                                    if (client.cl) {
                                       if (var3 >= 51) {
                                          throw new IllegalStateException();
                                       }

                                       if (0 == var16.av * 266535841) {
                                          if (var3 >= 51) {
                                             throw new IllegalStateException();
                                          }

                                          if (1 != var16.ad * -1552861337) {
                                             if (var3 >= 51) {
                                                throw new IllegalStateException();
                                             }

                                             if (!var16.bu) {
                                                continue;
                                             }
                                          }
                                       }
                                    }
                                 }

                                 if (!var16.as((byte)10)) {
                                    client.ie += 2075954535;
                                    var4 = false;
                                 }

                                 var9 = true;
                              }
                           }
                        }
                     }
                  }

                  if (var3 >= 51) {
                     throw new IllegalStateException();
                  }

                  var10 = var5.dq(443803847);
                  if (var10 == 0) {
                     continue label121;
                  }

                  var5.cy((short)-28569);
               }
            }
         } while(var3 < 51);

         throw new IllegalStateException();
      } catch (RuntimeException var17) {
         throw tm.aw(var17, "dh.ae(" + ')');
      }
   }
}
