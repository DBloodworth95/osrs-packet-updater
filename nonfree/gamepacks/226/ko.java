public class ko {
   static final int am = 256;
   static final int aw = 2;
   static final int ak = 4;
   static final int ap = 1;
   static final int ay = 32;
   public static final int an = 14;
   static final int ws = 2;
   static final int bk = 1076101603;
   int bz;
   static final int aj = 8;
   static final int as = 64;
   public int br;
   public int[][] bn;
   int bc;
   static final int bj = 34;
   public int by;

   void bq(int var1, int var2, int var3) {
      int[] var10000 = this.bn[var1];
      var10000[var2] &= ~var3;
   }

   void ay(int var1, int var2, int var3, int var4) {
      try {
         int[] var10000 = this.bn[var1];
         var10000[var2] |= var3;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ko.ay(" + ')');
      }
   }

   public void aw(int var1, int var2, int var3, int var4, boolean var5, byte var6) {
      try {
         var1 -= this.bz * 321668887;
         var2 -= -346318203 * this.bc;
         if (0 == var3) {
            if (var4 == 0) {
               if (var6 >= 0) {
                  throw new IllegalStateException();
               }

               this.ay(var1, var2, 128, 108175169);
               this.ay(var1 - 1, var2, 8, 108175169);
            }

            if (var4 == 1) {
               if (var6 >= 0) {
                  throw new IllegalStateException();
               }

               this.ay(var1, var2, 2, 108175169);
               this.ay(var1, var2 + 1, 32, 108175169);
            }

            if (2 == var4) {
               this.ay(var1, var2, 8, 108175169);
               this.ay(var1 + 1, var2, 128, 108175169);
            }

            if (var4 == 3) {
               if (var6 >= 0) {
                  throw new IllegalStateException();
               }

               this.ay(var1, var2, 32, 108175169);
               this.ay(var1, var2 - 1, 2, 108175169);
            }
         }

         label271: {
            if (1 != var3) {
               if (var6 >= 0) {
                  throw new IllegalStateException();
               }

               if (var3 != 3) {
                  break label271;
               }

               if (var6 >= 0) {
                  throw new IllegalStateException();
               }
            }

            if (0 == var4) {
               if (var6 >= 0) {
                  throw new IllegalStateException();
               }

               this.ay(var1, var2, 1, 108175169);
               this.ay(var1 - 1, var2 + 1, 16, 108175169);
            }

            if (1 == var4) {
               this.ay(var1, var2, 4, 108175169);
               this.ay(1 + var1, var2 + 1, 64, 108175169);
            }

            if (2 == var4) {
               if (var6 >= 0) {
                  throw new IllegalStateException();
               }

               this.ay(var1, var2, 16, 108175169);
               this.ay(1 + var1, var2 - 1, 1, 108175169);
            }

            if (3 == var4) {
               if (var6 >= 0) {
                  throw new IllegalStateException();
               }

               this.ay(var1, var2, 64, 108175169);
               this.ay(var1 - 1, var2 - 1, 4, 108175169);
            }
         }

         if (var3 == 2) {
            if (var6 >= 0) {
               throw new IllegalStateException();
            }

            if (var4 == 0) {
               if (var6 >= 0) {
                  return;
               }

               this.ay(var1, var2, 130, 108175169);
               this.ay(var1 - 1, var2, 8, 108175169);
               this.ay(var1, 1 + var2, 32, 108175169);
            }

            if (1 == var4) {
               if (var6 >= 0) {
                  throw new IllegalStateException();
               }

               this.ay(var1, var2, 10, 108175169);
               this.ay(var1, var2 + 1, 32, 108175169);
               this.ay(1 + var1, var2, 128, 108175169);
            }

            if (2 == var4) {
               if (var6 >= 0) {
                  return;
               }

               this.ay(var1, var2, 40, 108175169);
               this.ay(var1 + 1, var2, 128, 108175169);
               this.ay(var1, var2 - 1, 2, 108175169);
            }

            if (3 == var4) {
               if (var6 >= 0) {
                  throw new IllegalStateException();
               }

               this.ay(var1, var2, 160, 108175169);
               this.ay(var1, var2 - 1, 2, 108175169);
               this.ay(var1 - 1, var2, 8, 108175169);
            }
         }

         if (var5) {
            if (var6 >= 0) {
               throw new IllegalStateException();
            }

            if (0 == var3) {
               if (var4 == 0) {
                  if (var6 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.ay(var1, var2, 65536, 108175169);
                  this.ay(var1 - 1, var2, 4096, 108175169);
               }

               if (var4 == 1) {
                  if (var6 >= 0) {
                     return;
                  }

                  this.ay(var1, var2, 1024, 108175169);
                  this.ay(var1, var2 + 1, 16384, 108175169);
               }

               if (var4 == 2) {
                  if (var6 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.ay(var1, var2, 4096, 108175169);
                  this.ay(var1 + 1, var2, 65536, 108175169);
               }

               if (var4 == 3) {
                  if (var6 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.ay(var1, var2, 16384, 108175169);
                  this.ay(var1, var2 - 1, 1024, 108175169);
               }
            }

            label276: {
               if (var3 != 1) {
                  if (var6 >= 0) {
                     return;
                  }

                  if (var3 != 3) {
                     break label276;
                  }

                  if (var6 >= 0) {
                     return;
                  }
               }

               if (var4 == 0) {
                  if (var6 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.ay(var1, var2, 512, 108175169);
                  this.ay(var1 - 1, var2 + 1, 8192, 108175169);
               }

               if (var4 == 1) {
                  if (var6 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.ay(var1, var2, 2048, 108175169);
                  this.ay(var1 + 1, 1 + var2, 32768, 108175169);
               }

               if (var4 == 2) {
                  if (var6 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.ay(var1, var2, 8192, 108175169);
                  this.ay(var1 + 1, var2 - 1, 512, 108175169);
               }

               if (var4 == 3) {
                  if (var6 >= 0) {
                     return;
                  }

                  this.ay(var1, var2, 32768, 108175169);
                  this.ay(var1 - 1, var2 - 1, 2048, 108175169);
               }
            }

            if (var3 == 2) {
               if (var6 >= 0) {
                  throw new IllegalStateException();
               }

               if (0 == var4) {
                  if (var6 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.ay(var1, var2, 66560, 108175169);
                  this.ay(var1 - 1, var2, 4096, 108175169);
                  this.ay(var1, 1 + var2, 16384, 108175169);
               }

               if (var4 == 1) {
                  if (var6 >= 0) {
                     return;
                  }

                  this.ay(var1, var2, 5120, 108175169);
                  this.ay(var1, 1 + var2, 16384, 108175169);
                  this.ay(1 + var1, var2, 65536, 108175169);
               }

               if (2 == var4) {
                  if (var6 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.ay(var1, var2, 20480, 108175169);
                  this.ay(1 + var1, var2, 65536, 108175169);
                  this.ay(var1, var2 - 1, 1024, 108175169);
               }

               if (var4 == 3) {
                  if (var6 >= 0) {
                     return;
                  }

                  this.ay(var1, var2, 81920, 108175169);
                  this.ay(var1, var2 - 1, 1024, 108175169);
                  this.ay(var1 - 1, var2, 4096, 108175169);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw tm.aw(var7, "ko.aw(" + ')');
      }
   }

   public void ak(int var1, int var2, int var3, int var4, boolean var5, byte var6) {
      try {
         int var7 = 256;
         if (var5) {
            if (var6 == 61) {
               throw new IllegalStateException();
            }

            var7 += 131072;
         }

         var1 -= 321668887 * this.bz;
         var2 -= this.bc * -346318203;

         for(int var8 = var1; var8 < var3 + var1; ++var8) {
            if (var6 == 61) {
               throw new IllegalStateException();
            }

            if (var8 >= 0) {
               if (var6 == 61) {
                  throw new IllegalStateException();
               }

               if (var8 < this.by * -243983003) {
                  if (var6 == 61) {
                     return;
                  }

                  for(int var9 = var2; var9 < var2 + var4; ++var9) {
                     if (var6 == 61) {
                        throw new IllegalStateException();
                     }

                     if (var9 >= 0) {
                        if (var6 == 61) {
                           throw new IllegalStateException();
                        }

                        if (var9 < this.br * -870096139) {
                           this.ay(var8, var9, var7, 108175169);
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var10) {
         throw tm.aw(var10, "ko.ak(" + ')');
      }
   }

   public void aj(int var1, int var2, byte var3) {
      try {
         var1 -= 321668887 * this.bz;
         var2 -= -346318203 * this.bc;
         int[] var10000 = this.bn[var1];
         var10000[var2] |= 2097152;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ko.aj(" + ')');
      }
   }

   public void ai(int var1, int var2, int var3) {
      try {
         var1 -= this.bz * 321668887;
         var2 -= -346318203 * this.bc;
         int[] var10000 = this.bn[var1];
         var10000[var2] |= 262144;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ko.ai(" + ')');
      }
   }

   public void an() {
      for(int var1 = 0; var1 < -243983003 * this.by; ++var1) {
         for(int var2 = 0; var2 < -870096139 * this.br; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 < this.by * -243983003 - 5 && var2 < this.br * -870096139 - 5) {
               this.bn[var1][var2] = 1073741824;
            } else {
               this.bn[var1][var2] = 16777215;
            }
         }
      }

   }

   public void ao() {
      for(int var1 = 0; var1 < -480489071 * this.by; ++var1) {
         for(int var2 = 0; var2 < 86799155 * this.br; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 < this.by * 888315521 - 5 && var2 < this.br * -1971547044 - 5) {
               this.bn[var1][var2] = 1073741824;
            } else {
               this.bn[var1][var2] = 334552931;
            }
         }
      }

   }

   public void ae(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         int var8 = 33554688;
         if (var6) {
            if (var7 == -1433642266) {
               throw new IllegalStateException();
            }

            var8 += 131072;
         }

         int var9;
         label70: {
            var1 -= 321668887 * this.bz;
            var2 -= -346318203 * this.bc;
            if (var5 != 1) {
               if (var7 == -1433642266) {
                  throw new IllegalStateException();
               }

               if (3 != var5) {
                  break label70;
               }

               if (var7 == -1433642266) {
                  throw new IllegalStateException();
               }
            }

            var9 = var3;
            var3 = var4;
            var4 = var9;
         }

         for(var9 = var1; var9 < var3 + var1; ++var9) {
            if (var9 >= 0 && var9 < -243983003 * this.by) {
               for(int var10 = var2; var10 < var2 + var4; ++var10) {
                  if (var7 == -1433642266) {
                     return;
                  }

                  if (var10 >= 0 && var10 < this.br * -870096139) {
                     this.am(var9, var10, var8, (byte)-39);
                  }
               }
            }
         }

      } catch (RuntimeException var11) {
         throw tm.aw(var11, "ko.ae(" + ')');
      }
   }

   void am(int var1, int var2, int var3, byte var4) {
      try {
         int[] var10000 = this.bn[var1];
         var10000[var2] &= ~var3;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ko.am(" + ')');
      }
   }

   static final boolean nn(ng var0, byte var1) {
      try {
         int var2 = 542190393 * var0.bq;
         if (205 == var2) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               client.ii = 118346718;
               return true;
            }
         } else {
            int var3;
            int var4;
            if (var2 >= 300 && var2 <= 313) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               var3 = (var2 - 300) / 2;
               var4 = var2 & 1;
               client.vk.ai(var3, 1 == var4, -751502758);
            }

            if (var2 >= 314) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               if (var2 <= 323) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  var3 = (var2 - 314) / 2;
                  var4 = var2 & 1;
                  ne var10000 = client.vk;
                  boolean var10002;
                  if (var4 == 1) {
                     if (var1 >= 0) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  var10000.ay(var3, var10002, 729654427);
               }
            }

            if (324 == var2) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               client.vk.as(0, 1480036266);
            }

            if (325 == var2) {
               client.vk.as(1, 1480036266);
            }

            if (326 == var2) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               } else {
                  mm var7;
                  if (vw.ap * -1964001905 >= 224) {
                     if (var1 >= 0) {
                        throw new IllegalStateException();
                     }

                     var7 = mm.ap;
                  } else {
                     var7 = mm.aw;
                  }

                  me var6 = ef.ap(var7, client.in.ai, (byte)80);
                  client.vk.ae(var6.ak, 1501095833);
                  client.in.ak(var6, (short)486);
                  return true;
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ko.nn(" + ')');
      }
   }

   public void av(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if (var5) {
         var6 += -1760335864;
      }

      var1 -= -698879120 * this.bz;
      var2 -= this.bc * -346318203;

      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         if (var7 >= 0 && var7 < this.by * -1490347086) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if (var8 >= 0 && var8 < this.br * 441650526) {
                  this.ay(var7, var8, var6, 108175169);
               }
            }
         }
      }

   }

   void bj(int var1, int var2, int var3) {
      int[] var10000 = this.bn[var1];
      var10000[var2] |= var3;
   }

   public void ap(int var1) {
      try {
         for(int var2 = 0; var2 < -243983003 * this.by; ++var2) {
            if (var1 >= 560383344) {
               throw new IllegalStateException();
            }

            for(int var3 = 0; var3 < -870096139 * this.br; ++var3) {
               if (var1 >= 560383344) {
                  throw new IllegalStateException();
               }

               if (var2 != 0) {
                  if (var1 >= 560383344) {
                     return;
                  }

                  if (var3 != 0 && var2 < this.by * -243983003 - 5) {
                     if (var1 >= 560383344) {
                        throw new IllegalStateException();
                     }

                     if (var3 < this.br * -870096139 - 5) {
                        this.bn[var2][var3] = 1073741824;
                        continue;
                     }

                     if (var1 >= 560383344) {
                        return;
                     }
                  }
               }

               this.bn[var2][var3] = 16777215;
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ko.ap(" + ')');
      }
   }

   void ah(int var1, int var2, int var3) {
      int[] var10000 = this.bn[var1];
      var10000[var2] |= var3;
   }

   void bp(int var1, int var2, int var3) {
      int[] var10000 = this.bn[var1];
      var10000[var2] &= ~var3;
   }

   public void ab(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.bz * 321668887;
      var2 -= 1826790764 * this.bc;
      if (0 == var3) {
         if (var4 == 0) {
            this.ay(var1, var2, 128, 108175169);
            this.ay(var1 - 1, var2, 8, 108175169);
         }

         if (var4 == 1) {
            this.ay(var1, var2, 2, 108175169);
            this.ay(var1, var2 + 1, -319304159, 108175169);
         }

         if (2 == var4) {
            this.ay(var1, var2, 8, 108175169);
            this.ay(var1 + 1, var2, -520627964, 108175169);
         }

         if (var4 == 3) {
            this.ay(var1, var2, 32, 108175169);
            this.ay(var1, var2 - 1, 2, 108175169);
         }
      }

      if (1 == var3 || var3 == 3) {
         if (0 == var4) {
            this.ay(var1, var2, 1, 108175169);
            this.ay(var1 - 1, var2 + 1, 16, 108175169);
         }

         if (1 == var4) {
            this.ay(var1, var2, 4, 108175169);
            this.ay(1 + var1, var2 + 1, 64, 108175169);
         }

         if (2 == var4) {
            this.ay(var1, var2, 16, 108175169);
            this.ay(1 + var1, var2 - 1, 1, 108175169);
         }

         if (3 == var4) {
            this.ay(var1, var2, 64, 108175169);
            this.ay(var1 - 1, var2 - 1, 4, 108175169);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.ay(var1, var2, 130, 108175169);
            this.ay(var1 - 1, var2, 8, 108175169);
            this.ay(var1, 1 + var2, -1511905644, 108175169);
         }

         if (1 == var4) {
            this.ay(var1, var2, 10, 108175169);
            this.ay(var1, var2 + 1, 1059570033, 108175169);
            this.ay(1 + var1, var2, 1418845171, 108175169);
         }

         if (2 == var4) {
            this.ay(var1, var2, -1237620365, 108175169);
            this.ay(var1 + 1, var2, 205627809, 108175169);
            this.ay(var1, var2 - 1, 2, 108175169);
         }

         if (3 == var4) {
            this.ay(var1, var2, -1917856100, 108175169);
            this.ay(var1, var2 - 1, 2, 108175169);
            this.ay(var1 - 1, var2, 8, 108175169);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               this.ay(var1, var2, -1030661264, 108175169);
               this.ay(var1 - 1, var2, -2131106954, 108175169);
            }

            if (var4 == 1) {
               this.ay(var1, var2, 1024, 108175169);
               this.ay(var1, var2 + 1, 16384, 108175169);
            }

            if (var4 == 2) {
               this.ay(var1, var2, 4096, 108175169);
               this.ay(var1 + 1, var2, -436522606, 108175169);
            }

            if (var4 == 3) {
               this.ay(var1, var2, 16384, 108175169);
               this.ay(var1, var2 - 1, 1024, 108175169);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.ay(var1, var2, -163452650, 108175169);
               this.ay(var1 - 1, var2 + 1, 8192, 108175169);
            }

            if (var4 == 1) {
               this.ay(var1, var2, 2048, 108175169);
               this.ay(var1 + 1, 1 + var2, -1830312349, 108175169);
            }

            if (var4 == 2) {
               this.ay(var1, var2, 1866368991, 108175169);
               this.ay(var1 + 1, var2 - 1, 1084506528, 108175169);
            }

            if (var4 == 3) {
               this.ay(var1, var2, -285474749, 108175169);
               this.ay(var1 - 1, var2 - 1, -384230725, 108175169);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.ay(var1, var2, 66560, 108175169);
               this.ay(var1 - 1, var2, 4096, 108175169);
               this.ay(var1, 1 + var2, 1580197268, 108175169);
            }

            if (var4 == 1) {
               this.ay(var1, var2, -1067599494, 108175169);
               this.ay(var1, 1 + var2, 1954822268, 108175169);
               this.ay(1 + var1, var2, 65536, 108175169);
            }

            if (2 == var4) {
               this.ay(var1, var2, -916412249, 108175169);
               this.ay(1 + var1, var2, 65536, 108175169);
               this.ay(var1, var2 - 1, 887902828, 108175169);
            }

            if (var4 == 3) {
               this.ay(var1, var2, 81920, 108175169);
               this.ay(var1, var2 - 1, -1025599226, 108175169);
               this.ay(var1 - 1, var2, 4096, 108175169);
            }
         }
      }

   }

   public void ar(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.bz * 321668887;
      var2 -= -346318203 * this.bc;
      if (0 == var3) {
         if (var4 == 0) {
            this.ay(var1, var2, 128, 108175169);
            this.ay(var1 - 1, var2, 8, 108175169);
         }

         if (var4 == 1) {
            this.ay(var1, var2, 2, 108175169);
            this.ay(var1, var2 + 1, 32, 108175169);
         }

         if (2 == var4) {
            this.ay(var1, var2, 8, 108175169);
            this.ay(var1 + 1, var2, 128, 108175169);
         }

         if (var4 == 3) {
            this.ay(var1, var2, 32, 108175169);
            this.ay(var1, var2 - 1, 2, 108175169);
         }
      }

      if (1 == var3 || var3 == 3) {
         if (0 == var4) {
            this.ay(var1, var2, 1, 108175169);
            this.ay(var1 - 1, var2 + 1, 16, 108175169);
         }

         if (1 == var4) {
            this.ay(var1, var2, 4, 108175169);
            this.ay(1 + var1, var2 + 1, 64, 108175169);
         }

         if (2 == var4) {
            this.ay(var1, var2, 16, 108175169);
            this.ay(1 + var1, var2 - 1, 1, 108175169);
         }

         if (3 == var4) {
            this.ay(var1, var2, 64, 108175169);
            this.ay(var1 - 1, var2 - 1, 4, 108175169);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.ay(var1, var2, 130, 108175169);
            this.ay(var1 - 1, var2, 8, 108175169);
            this.ay(var1, 1 + var2, 32, 108175169);
         }

         if (1 == var4) {
            this.ay(var1, var2, 10, 108175169);
            this.ay(var1, var2 + 1, 32, 108175169);
            this.ay(1 + var1, var2, 128, 108175169);
         }

         if (2 == var4) {
            this.ay(var1, var2, 40, 108175169);
            this.ay(var1 + 1, var2, 128, 108175169);
            this.ay(var1, var2 - 1, 2, 108175169);
         }

         if (3 == var4) {
            this.ay(var1, var2, 160, 108175169);
            this.ay(var1, var2 - 1, 2, 108175169);
            this.ay(var1 - 1, var2, 8, 108175169);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               this.ay(var1, var2, 65536, 108175169);
               this.ay(var1 - 1, var2, 4096, 108175169);
            }

            if (var4 == 1) {
               this.ay(var1, var2, 1024, 108175169);
               this.ay(var1, var2 + 1, 16384, 108175169);
            }

            if (var4 == 2) {
               this.ay(var1, var2, 4096, 108175169);
               this.ay(var1 + 1, var2, 65536, 108175169);
            }

            if (var4 == 3) {
               this.ay(var1, var2, 16384, 108175169);
               this.ay(var1, var2 - 1, 1024, 108175169);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.ay(var1, var2, 512, 108175169);
               this.ay(var1 - 1, var2 + 1, 8192, 108175169);
            }

            if (var4 == 1) {
               this.ay(var1, var2, 2048, 108175169);
               this.ay(var1 + 1, 1 + var2, 32768, 108175169);
            }

            if (var4 == 2) {
               this.ay(var1, var2, 8192, 108175169);
               this.ay(var1 + 1, var2 - 1, 512, 108175169);
            }

            if (var4 == 3) {
               this.ay(var1, var2, 32768, 108175169);
               this.ay(var1 - 1, var2 - 1, 2048, 108175169);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.ay(var1, var2, 66560, 108175169);
               this.ay(var1 - 1, var2, 4096, 108175169);
               this.ay(var1, 1 + var2, 16384, 108175169);
            }

            if (var4 == 1) {
               this.ay(var1, var2, 5120, 108175169);
               this.ay(var1, 1 + var2, 16384, 108175169);
               this.ay(1 + var1, var2, 65536, 108175169);
            }

            if (2 == var4) {
               this.ay(var1, var2, 20480, 108175169);
               this.ay(1 + var1, var2, 65536, 108175169);
               this.ay(var1, var2 - 1, 1024, 108175169);
            }

            if (var4 == 3) {
               this.ay(var1, var2, 81920, 108175169);
               this.ay(var1, var2 - 1, 1024, 108175169);
               this.ay(var1 - 1, var2, 4096, 108175169);
            }
         }
      }

   }

   public void ag(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.bz * 415820465;
      var2 -= -143489325 * this.bc;
      if (0 == var3) {
         if (var4 == 0) {
            this.ay(var1, var2, 1887177655, 108175169);
            this.ay(var1 - 1, var2, 8, 108175169);
         }

         if (var4 == 1) {
            this.ay(var1, var2, 2, 108175169);
            this.ay(var1, var2 + 1, 32, 108175169);
         }

         if (2 == var4) {
            this.ay(var1, var2, 8, 108175169);
            this.ay(var1 + 1, var2, 128, 108175169);
         }

         if (var4 == 3) {
            this.ay(var1, var2, 32, 108175169);
            this.ay(var1, var2 - 1, 2, 108175169);
         }
      }

      if (1 == var3 || var3 == 3) {
         if (0 == var4) {
            this.ay(var1, var2, 1, 108175169);
            this.ay(var1 - 1, var2 + 1, 16, 108175169);
         }

         if (1 == var4) {
            this.ay(var1, var2, 4, 108175169);
            this.ay(1 + var1, var2 + 1, 421580345, 108175169);
         }

         if (2 == var4) {
            this.ay(var1, var2, 16, 108175169);
            this.ay(1 + var1, var2 - 1, 1, 108175169);
         }

         if (3 == var4) {
            this.ay(var1, var2, 1668982143, 108175169);
            this.ay(var1 - 1, var2 - 1, 4, 108175169);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.ay(var1, var2, 1352931436, 108175169);
            this.ay(var1 - 1, var2, 8, 108175169);
            this.ay(var1, 1 + var2, 109227865, 108175169);
         }

         if (1 == var4) {
            this.ay(var1, var2, 10, 108175169);
            this.ay(var1, var2 + 1, 32, 108175169);
            this.ay(1 + var1, var2, 128, 108175169);
         }

         if (2 == var4) {
            this.ay(var1, var2, 40, 108175169);
            this.ay(var1 + 1, var2, -1757085855, 108175169);
            this.ay(var1, var2 - 1, 2, 108175169);
         }

         if (3 == var4) {
            this.ay(var1, var2, 160, 108175169);
            this.ay(var1, var2 - 1, 2, 108175169);
            this.ay(var1 - 1, var2, 8, 108175169);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               this.ay(var1, var2, 65536, 108175169);
               this.ay(var1 - 1, var2, 4096, 108175169);
            }

            if (var4 == 1) {
               this.ay(var1, var2, -664810582, 108175169);
               this.ay(var1, var2 + 1, 335594720, 108175169);
            }

            if (var4 == 2) {
               this.ay(var1, var2, 4096, 108175169);
               this.ay(var1 + 1, var2, 1366968171, 108175169);
            }

            if (var4 == 3) {
               this.ay(var1, var2, 16384, 108175169);
               this.ay(var1, var2 - 1, 1024, 108175169);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.ay(var1, var2, -964539402, 108175169);
               this.ay(var1 - 1, var2 + 1, 8192, 108175169);
            }

            if (var4 == 1) {
               this.ay(var1, var2, 2048, 108175169);
               this.ay(var1 + 1, 1 + var2, 1316223346, 108175169);
            }

            if (var4 == 2) {
               this.ay(var1, var2, 8192, 108175169);
               this.ay(var1 + 1, var2 - 1, 1436541300, 108175169);
            }

            if (var4 == 3) {
               this.ay(var1, var2, 32768, 108175169);
               this.ay(var1 - 1, var2 - 1, -1529364745, 108175169);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.ay(var1, var2, 66560, 108175169);
               this.ay(var1 - 1, var2, -1437004541, 108175169);
               this.ay(var1, 1 + var2, -1674412200, 108175169);
            }

            if (var4 == 1) {
               this.ay(var1, var2, -791878186, 108175169);
               this.ay(var1, 1 + var2, -25703618, 108175169);
               this.ay(1 + var1, var2, 65536, 108175169);
            }

            if (2 == var4) {
               this.ay(var1, var2, 1174176174, 108175169);
               this.ay(1 + var1, var2, 65536, 108175169);
               this.ay(var1, var2 - 1, 1024, 108175169);
            }

            if (var4 == 3) {
               this.ay(var1, var2, 81920, 108175169);
               this.ay(var1, var2 - 1, 1712144314, 108175169);
               this.ay(var1 - 1, var2, 1815655542, 108175169);
            }
         }
      }

   }

   public void ad(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if (var5) {
         var6 += 131072;
      }

      var1 -= 321668887 * this.bz;
      var2 -= this.bc * -346318203;

      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         if (var7 >= 0 && var7 < this.by * -243983003) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if (var8 >= 0 && var8 < this.br * -870096139) {
                  this.ay(var7, var8, var6, 108175169);
               }
            }
         }
      }

   }

   public void ac(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if (var5) {
         var6 += 131072;
      }

      var1 -= 321668887 * this.bz;
      var2 -= this.bc * -346318203;

      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         if (var7 >= 0 && var7 < this.by * -243983003) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if (var8 >= 0 && var8 < this.br * -870096139) {
                  this.ay(var7, var8, var6, 108175169);
               }
            }
         }
      }

   }

   void bz(int var1, int var2, int var3) {
      int[] var10000 = this.bn[var1];
      var10000[var2] &= ~var3;
   }

   public void ax(int var1, int var2) {
      var1 -= 321668887 * this.bz;
      var2 -= -346318203 * this.bc;
      int[] var10000 = this.bn[var1];
      var10000[var2] |= 2097152;
   }

   public void aq(int var1, int var2) {
      var1 -= 321668887 * this.bz;
      var2 -= -346318203 * this.bc;
      int[] var10000 = this.bn[var1];
      var10000[var2] |= 1722988292;
   }

   public void al(int var1, int var2) {
      var1 -= this.bz * 321668887;
      var2 -= -346318203 * this.bc;
      int[] var10000 = this.bn[var1];
      var10000[var2] |= 262144;
   }

   public void aa(int var1, int var2) {
      var1 -= this.bz * -1147965341;
      var2 -= -1379251815 * this.bc;
      int[] var10000 = this.bn[var1];
      var10000[var2] |= 428316805;
   }

   public ko(int var1, int var2) {
      try {
         super();
         this.bz = 0;
         this.bc = 0;
         this.by = 1853803629 * var1;
         this.br = var2 * 14334301;
         this.bn = new int[this.by * -243983003][-870096139 * this.br];
         this.ap(-1482247764);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ko.<init>(" + ')');
      }
   }

   void bh(int var1, int var2, int var3) {
      int[] var10000 = this.bn[var1];
      var10000[var2] |= var3;
   }

   public void au() {
      for(int var1 = 0; var1 < -243983003 * this.by; ++var1) {
         for(int var2 = 0; var2 < -870096139 * this.br; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 < this.by * -243983003 - 5 && var2 < this.br * -870096139 - 5) {
               this.bn[var1][var2] = 1073741824;
            } else {
               this.bn[var1][var2] = 16777215;
            }
         }
      }

   }

   public void bv(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.bz * 321668887;
      var2 -= this.bc * -346318203;
      if (0 == var3) {
         if (0 == var4) {
            this.am(var1, var2, 128, (byte)-62);
            this.am(var1 - 1, var2, 8, (byte)-118);
         }

         if (1 == var4) {
            this.am(var1, var2, 2, (byte)-44);
            this.am(var1, 1 + var2, -1461858622, (byte)-91);
         }

         if (2 == var4) {
            this.am(var1, var2, 8, (byte)-88);
            this.am(var1 + 1, var2, 128, (byte)-71);
         }

         if (3 == var4) {
            this.am(var1, var2, 216076625, (byte)-58);
            this.am(var1, var2 - 1, 2, (byte)-123);
         }
      }

      if (var3 == 1 || 3 == var3) {
         if (0 == var4) {
            this.am(var1, var2, 1, (byte)12);
            this.am(var1 - 1, var2 + 1, 16, (byte)-12);
         }

         if (1 == var4) {
            this.am(var1, var2, 4, (byte)2);
            this.am(var1 + 1, var2 + 1, 1548329926, (byte)-28);
         }

         if (2 == var4) {
            this.am(var1, var2, 16, (byte)-119);
            this.am(var1 + 1, var2 - 1, 1, (byte)-36);
         }

         if (3 == var4) {
            this.am(var1, var2, 64, (byte)-82);
            this.am(var1 - 1, var2 - 1, 4, (byte)-122);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.am(var1, var2, 130, (byte)-53);
            this.am(var1 - 1, var2, 8, (byte)-8);
            this.am(var1, var2 + 1, 32, (byte)-28);
         }

         if (var4 == 1) {
            this.am(var1, var2, 10, (byte)-84);
            this.am(var1, 1 + var2, -2028547122, (byte)-57);
            this.am(var1 + 1, var2, 128, (byte)-63);
         }

         if (var4 == 2) {
            this.am(var1, var2, -1100720369, (byte)-126);
            this.am(1 + var1, var2, 1768756642, (byte)-96);
            this.am(var1, var2 - 1, 2, (byte)-62);
         }

         if (3 == var4) {
            this.am(var1, var2, 160, (byte)-89);
            this.am(var1, var2 - 1, 2, (byte)-123);
            this.am(var1 - 1, var2, 8, (byte)-39);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (0 == var4) {
               this.am(var1, var2, 861793178, (byte)-12);
               this.am(var1 - 1, var2, 4096, (byte)9);
            }

            if (var4 == 1) {
               this.am(var1, var2, -643202799, (byte)-44);
               this.am(var1, var2 + 1, 859845091, (byte)-92);
            }

            if (2 == var4) {
               this.am(var1, var2, 4096, (byte)-96);
               this.am(var1 + 1, var2, -723740128, (byte)-54);
            }

            if (3 == var4) {
               this.am(var1, var2, 1351696746, (byte)-5);
               this.am(var1, var2 - 1, -1612808401, (byte)-59);
            }
         }

         if (var3 == 1 || 3 == var3) {
            if (0 == var4) {
               this.am(var1, var2, 512, (byte)-16);
               this.am(var1 - 1, var2 + 1, -1082052252, (byte)-78);
            }

            if (var4 == 1) {
               this.am(var1, var2, -1171210179, (byte)-105);
               this.am(1 + var1, var2 + 1, 117989203, (byte)-27);
            }

            if (var4 == 2) {
               this.am(var1, var2, -1811156905, (byte)-125);
               this.am(var1 + 1, var2 - 1, 203559118, (byte)-63);
            }

            if (var4 == 3) {
               this.am(var1, var2, 2129732507, (byte)-69);
               this.am(var1 - 1, var2 - 1, 2108045888, (byte)-80);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.am(var1, var2, 66560, (byte)-12);
               this.am(var1 - 1, var2, -2106436738, (byte)-18);
               this.am(var1, 1 + var2, 16384, (byte)-41);
            }

            if (var4 == 1) {
               this.am(var1, var2, -385264943, (byte)-31);
               this.am(var1, 1 + var2, 16384, (byte)-28);
               this.am(1 + var1, var2, 65536, (byte)11);
            }

            if (2 == var4) {
               this.am(var1, var2, 20480, (byte)-104);
               this.am(1 + var1, var2, 65536, (byte)-89);
               this.am(var1, var2 - 1, 1024, (byte)-124);
            }

            if (var4 == 3) {
               this.am(var1, var2, 81920, (byte)9);
               this.am(var1, var2 - 1, 1235642388, (byte)-90);
               this.am(var1 - 1, var2, 4096, (byte)-127);
            }
         }
      }

   }

   public void bx(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.bz * 321668887;
      var2 -= this.bc * -346318203;
      if (0 == var3) {
         if (0 == var4) {
            this.am(var1, var2, 128, (byte)-24);
            this.am(var1 - 1, var2, 8, (byte)-117);
         }

         if (1 == var4) {
            this.am(var1, var2, 2, (byte)-108);
            this.am(var1, 1 + var2, 1719070043, (byte)-31);
         }

         if (2 == var4) {
            this.am(var1, var2, 8, (byte)-11);
            this.am(var1 + 1, var2, 128, (byte)-106);
         }

         if (3 == var4) {
            this.am(var1, var2, 1979079063, (byte)13);
            this.am(var1, var2 - 1, 2, (byte)-43);
         }
      }

      if (var3 == 1 || 3 == var3) {
         if (0 == var4) {
            this.am(var1, var2, 1, (byte)-42);
            this.am(var1 - 1, var2 + 1, 16, (byte)4);
         }

         if (1 == var4) {
            this.am(var1, var2, 4, (byte)-22);
            this.am(var1 + 1, var2 + 1, 320504816, (byte)-111);
         }

         if (2 == var4) {
            this.am(var1, var2, 16, (byte)-50);
            this.am(var1 + 1, var2 - 1, 1, (byte)-13);
         }

         if (3 == var4) {
            this.am(var1, var2, 1036988296, (byte)-27);
            this.am(var1 - 1, var2 - 1, 4, (byte)-23);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.am(var1, var2, -1031646397, (byte)10);
            this.am(var1 - 1, var2, 8, (byte)14);
            this.am(var1, var2 + 1, 2079871532, (byte)4);
         }

         if (var4 == 1) {
            this.am(var1, var2, 10, (byte)-118);
            this.am(var1, 1 + var2, 32, (byte)-32);
            this.am(var1 + 1, var2, 1418698295, (byte)10);
         }

         if (var4 == 2) {
            this.am(var1, var2, -2013161906, (byte)-82);
            this.am(1 + var1, var2, 128, (byte)-104);
            this.am(var1, var2 - 1, 2, (byte)5);
         }

         if (3 == var4) {
            this.am(var1, var2, 160, (byte)-16);
            this.am(var1, var2 - 1, 2, (byte)-126);
            this.am(var1 - 1, var2, 8, (byte)-105);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (0 == var4) {
               this.am(var1, var2, 1364790818, (byte)-77);
               this.am(var1 - 1, var2, 983345755, (byte)-36);
            }

            if (var4 == 1) {
               this.am(var1, var2, 1024, (byte)-47);
               this.am(var1, var2 + 1, 16384, (byte)10);
            }

            if (2 == var4) {
               this.am(var1, var2, 4096, (byte)18);
               this.am(var1 + 1, var2, 65536, (byte)-30);
            }

            if (3 == var4) {
               this.am(var1, var2, 16384, (byte)-36);
               this.am(var1, var2 - 1, 1024, (byte)-97);
            }
         }

         if (var3 == 1 || 3 == var3) {
            if (0 == var4) {
               this.am(var1, var2, 26253534, (byte)-110);
               this.am(var1 - 1, var2 + 1, 8192, (byte)-126);
            }

            if (var4 == 1) {
               this.am(var1, var2, -2000374988, (byte)5);
               this.am(1 + var1, var2 + 1, 18981397, (byte)-1);
            }

            if (var4 == 2) {
               this.am(var1, var2, -216086886, (byte)-91);
               this.am(var1 + 1, var2 - 1, 512, (byte)-83);
            }

            if (var4 == 3) {
               this.am(var1, var2, 32768, (byte)-105);
               this.am(var1 - 1, var2 - 1, 2048, (byte)-35);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.am(var1, var2, 66560, (byte)-48);
               this.am(var1 - 1, var2, -1060267545, (byte)1);
               this.am(var1, 1 + var2, -1662456739, (byte)-94);
            }

            if (var4 == 1) {
               this.am(var1, var2, 5120, (byte)-9);
               this.am(var1, 1 + var2, 16384, (byte)-73);
               this.am(1 + var1, var2, 65536, (byte)-78);
            }

            if (2 == var4) {
               this.am(var1, var2, -1656435388, (byte)-90);
               this.am(1 + var1, var2, 65536, (byte)-85);
               this.am(var1, var2 - 1, 1024, (byte)-37);
            }

            if (var4 == 3) {
               this.am(var1, var2, -281579364, (byte)-92);
               this.am(var1, var2 - 1, -894018909, (byte)-87);
               this.am(var1 - 1, var2, -1272329548, (byte)1);
            }
         }
      }

   }

   public void bk(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.bz * 1125398105;
      var2 -= this.bc * -346318203;
      if (0 == var3) {
         if (0 == var4) {
            this.am(var1, var2, 128, (byte)-78);
            this.am(var1 - 1, var2, 8, (byte)8);
         }

         if (1 == var4) {
            this.am(var1, var2, 2, (byte)-93);
            this.am(var1, 1 + var2, 32, (byte)-71);
         }

         if (2 == var4) {
            this.am(var1, var2, 8, (byte)-33);
            this.am(var1 + 1, var2, -756628813, (byte)3);
         }

         if (3 == var4) {
            this.am(var1, var2, 252964449, (byte)-86);
            this.am(var1, var2 - 1, 2, (byte)-123);
         }
      }

      if (var3 == 1 || 3 == var3) {
         if (0 == var4) {
            this.am(var1, var2, 1, (byte)-58);
            this.am(var1 - 1, var2 + 1, 16, (byte)-47);
         }

         if (1 == var4) {
            this.am(var1, var2, 4, (byte)-2);
            this.am(var1 + 1, var2 + 1, 64, (byte)-9);
         }

         if (2 == var4) {
            this.am(var1, var2, 16, (byte)-50);
            this.am(var1 + 1, var2 - 1, 1, (byte)-100);
         }

         if (3 == var4) {
            this.am(var1, var2, 64, (byte)-58);
            this.am(var1 - 1, var2 - 1, 4, (byte)16);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.am(var1, var2, 1491690890, (byte)-111);
            this.am(var1 - 1, var2, 8, (byte)11);
            this.am(var1, var2 + 1, -1919207154, (byte)-71);
         }

         if (var4 == 1) {
            this.am(var1, var2, 10, (byte)13);
            this.am(var1, 1 + var2, 1737758221, (byte)1);
            this.am(var1 + 1, var2, 128, (byte)-75);
         }

         if (var4 == 2) {
            this.am(var1, var2, 40, (byte)-111);
            this.am(1 + var1, var2, 128, (byte)-99);
            this.am(var1, var2 - 1, 2, (byte)-90);
         }

         if (3 == var4) {
            this.am(var1, var2, -62482604, (byte)-96);
            this.am(var1, var2 - 1, 2, (byte)-20);
            this.am(var1 - 1, var2, 8, (byte)-110);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (0 == var4) {
               this.am(var1, var2, 170551144, (byte)-64);
               this.am(var1 - 1, var2, 4096, (byte)-87);
            }

            if (var4 == 1) {
               this.am(var1, var2, 1024, (byte)-81);
               this.am(var1, var2 + 1, -1620171531, (byte)-61);
            }

            if (2 == var4) {
               this.am(var1, var2, 4096, (byte)12);
               this.am(var1 + 1, var2, 65536, (byte)-61);
            }

            if (3 == var4) {
               this.am(var1, var2, -1664973908, (byte)-123);
               this.am(var1, var2 - 1, 1024, (byte)-16);
            }
         }

         if (var3 == 1 || 3 == var3) {
            if (0 == var4) {
               this.am(var1, var2, 512, (byte)-42);
               this.am(var1 - 1, var2 + 1, 8192, (byte)-82);
            }

            if (var4 == 1) {
               this.am(var1, var2, 2048, (byte)13);
               this.am(1 + var1, var2 + 1, -1015457097, (byte)-79);
            }

            if (var4 == 2) {
               this.am(var1, var2, 8192, (byte)-102);
               this.am(var1 + 1, var2 - 1, -1452219235, (byte)-64);
            }

            if (var4 == 3) {
               this.am(var1, var2, 32768, (byte)16);
               this.am(var1 - 1, var2 - 1, 677313312, (byte)-72);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.am(var1, var2, -1105644749, (byte)12);
               this.am(var1 - 1, var2, 4096, (byte)-5);
               this.am(var1, 1 + var2, 981585041, (byte)-93);
            }

            if (var4 == 1) {
               this.am(var1, var2, 1063626216, (byte)-69);
               this.am(var1, 1 + var2, -241256848, (byte)-48);
               this.am(1 + var1, var2, -1923366956, (byte)-100);
            }

            if (2 == var4) {
               this.am(var1, var2, -1109636211, (byte)-6);
               this.am(1 + var1, var2, 65536, (byte)-3);
               this.am(var1, var2 - 1, -315093001, (byte)-55);
            }

            if (var4 == 3) {
               this.am(var1, var2, -1462389884, (byte)-73);
               this.am(var1, var2 - 1, 664334708, (byte)-18);
               this.am(var1 - 1, var2, -2106407524, (byte)-103);
            }
         }
      }

   }

   public void bb(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 199040596;
      if (var6) {
         var7 += -145333086;
      }

      var1 -= 321668887 * this.bz;
      var2 -= -1567770228 * this.bc;
      int var8;
      if (var5 == 1 || 3 == var5) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var3 + var1; ++var8) {
         if (var8 >= 0 && var8 < -243983003 * this.by) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.br * -870096139) {
                  this.am(var8, var9, var7, (byte)-116);
               }
            }
         }
      }

   }

   public void as(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         var1 -= this.bz * 321668887;
         var2 -= this.bc * -346318203;
         if (0 == var3) {
            if (var6 == -1435335300) {
               return;
            }

            if (0 == var4) {
               if (var6 == -1435335300) {
                  throw new IllegalStateException();
               }

               this.am(var1, var2, 128, (byte)8);
               this.am(var1 - 1, var2, 8, (byte)-1);
            }

            if (1 == var4) {
               if (var6 == -1435335300) {
                  throw new IllegalStateException();
               }

               this.am(var1, var2, 2, (byte)-7);
               this.am(var1, 1 + var2, 32, (byte)-104);
            }

            if (2 == var4) {
               if (var6 == -1435335300) {
                  return;
               }

               this.am(var1, var2, 8, (byte)-55);
               this.am(var1 + 1, var2, 128, (byte)-16);
            }

            if (3 == var4) {
               if (var6 == -1435335300) {
                  throw new IllegalStateException();
               }

               this.am(var1, var2, 32, (byte)-7);
               this.am(var1, var2 - 1, 2, (byte)-19);
            }
         }

         label263: {
            if (var3 != 1) {
               if (var6 == -1435335300) {
                  throw new IllegalStateException();
               }

               if (3 != var3) {
                  break label263;
               }

               if (var6 == -1435335300) {
                  return;
               }
            }

            if (0 == var4) {
               if (var6 == -1435335300) {
                  throw new IllegalStateException();
               }

               this.am(var1, var2, 1, (byte)-35);
               this.am(var1 - 1, var2 + 1, 16, (byte)-90);
            }

            if (1 == var4) {
               if (var6 == -1435335300) {
                  throw new IllegalStateException();
               }

               this.am(var1, var2, 4, (byte)-20);
               this.am(var1 + 1, var2 + 1, 64, (byte)-40);
            }

            if (2 == var4) {
               this.am(var1, var2, 16, (byte)-49);
               this.am(var1 + 1, var2 - 1, 1, (byte)-29);
            }

            if (3 == var4) {
               if (var6 == -1435335300) {
                  return;
               }

               this.am(var1, var2, 64, (byte)-8);
               this.am(var1 - 1, var2 - 1, 4, (byte)-108);
            }
         }

         if (var3 == 2) {
            if (var6 == -1435335300) {
               throw new IllegalStateException();
            }

            if (var4 == 0) {
               if (var6 == -1435335300) {
                  throw new IllegalStateException();
               }

               this.am(var1, var2, 130, (byte)-39);
               this.am(var1 - 1, var2, 8, (byte)18);
               this.am(var1, var2 + 1, 32, (byte)-66);
            }

            if (var4 == 1) {
               this.am(var1, var2, 10, (byte)-125);
               this.am(var1, 1 + var2, 32, (byte)-26);
               this.am(var1 + 1, var2, 128, (byte)-63);
            }

            if (var4 == 2) {
               this.am(var1, var2, 40, (byte)4);
               this.am(1 + var1, var2, 128, (byte)-44);
               this.am(var1, var2 - 1, 2, (byte)-97);
            }

            if (3 == var4) {
               if (var6 == -1435335300) {
                  throw new IllegalStateException();
               }

               this.am(var1, var2, 160, (byte)-8);
               this.am(var1, var2 - 1, 2, (byte)-1);
               this.am(var1 - 1, var2, 8, (byte)-34);
            }
         }

         if (var5) {
            if (var6 == -1435335300) {
               return;
            }

            if (var3 == 0) {
               if (var6 == -1435335300) {
                  return;
               }

               if (0 == var4) {
                  if (var6 == -1435335300) {
                     return;
                  }

                  this.am(var1, var2, 65536, (byte)-57);
                  this.am(var1 - 1, var2, 4096, (byte)-29);
               }

               if (var4 == 1) {
                  this.am(var1, var2, 1024, (byte)-11);
                  this.am(var1, var2 + 1, 16384, (byte)-127);
               }

               if (2 == var4) {
                  if (var6 == -1435335300) {
                     throw new IllegalStateException();
                  }

                  this.am(var1, var2, 4096, (byte)-91);
                  this.am(var1 + 1, var2, 65536, (byte)-90);
               }

               if (3 == var4) {
                  this.am(var1, var2, 16384, (byte)-73);
                  this.am(var1, var2 - 1, 1024, (byte)-109);
               }
            }

            label268: {
               if (var3 != 1) {
                  if (var6 == -1435335300) {
                     throw new IllegalStateException();
                  }

                  if (3 != var3) {
                     break label268;
                  }
               }

               if (0 == var4) {
                  if (var6 == -1435335300) {
                     throw new IllegalStateException();
                  }

                  this.am(var1, var2, 512, (byte)3);
                  this.am(var1 - 1, var2 + 1, 8192, (byte)-26);
               }

               if (var4 == 1) {
                  if (var6 == -1435335300) {
                     throw new IllegalStateException();
                  }

                  this.am(var1, var2, 2048, (byte)17);
                  this.am(1 + var1, var2 + 1, 32768, (byte)11);
               }

               if (var4 == 2) {
                  if (var6 == -1435335300) {
                     throw new IllegalStateException();
                  }

                  this.am(var1, var2, 8192, (byte)-69);
                  this.am(var1 + 1, var2 - 1, 512, (byte)7);
               }

               if (var4 == 3) {
                  if (var6 == -1435335300) {
                     throw new IllegalStateException();
                  }

                  this.am(var1, var2, 32768, (byte)-98);
                  this.am(var1 - 1, var2 - 1, 2048, (byte)-123);
               }
            }

            if (var3 == 2) {
               if (var6 == -1435335300) {
                  throw new IllegalStateException();
               }

               if (0 == var4) {
                  if (var6 == -1435335300) {
                     return;
                  }

                  this.am(var1, var2, 66560, (byte)-123);
                  this.am(var1 - 1, var2, 4096, (byte)-76);
                  this.am(var1, 1 + var2, 16384, (byte)-80);
               }

               if (var4 == 1) {
                  if (var6 == -1435335300) {
                     throw new IllegalStateException();
                  }

                  this.am(var1, var2, 5120, (byte)-19);
                  this.am(var1, 1 + var2, 16384, (byte)-112);
                  this.am(1 + var1, var2, 65536, (byte)-14);
               }

               if (2 == var4) {
                  if (var6 == -1435335300) {
                     return;
                  }

                  this.am(var1, var2, 20480, (byte)-59);
                  this.am(1 + var1, var2, 65536, (byte)15);
                  this.am(var1, var2 - 1, 1024, (byte)-101);
               }

               if (var4 == 3) {
                  if (var6 == -1435335300) {
                     return;
                  }

                  this.am(var1, var2, 81920, (byte)-14);
                  this.am(var1, var2 - 1, 1024, (byte)7);
                  this.am(var1 - 1, var2, 4096, (byte)-89);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw tm.aw(var7, "ko.as(" + ')');
      }
   }

   public void af() {
      for(int var1 = 0; var1 < -243983003 * this.by; ++var1) {
         for(int var2 = 0; var2 < -870096139 * this.br; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 < this.by * -243983003 - 5 && var2 < this.br * 807947670 - 5) {
               this.bn[var1][var2] = 1073741824;
            } else {
               this.bn[var1][var2] = -1407793384;
            }
         }
      }

   }

   public void at(int var1, int var2, int var3) {
      try {
         var1 -= this.bz * 321668887;
         var2 -= -346318203 * this.bc;
         int[] var10000 = this.bn[var1];
         var10000[var2] &= -262145;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ko.at(" + ')');
      }
   }

   public void az(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.bz * 321668887;
      var2 -= -346318203 * this.bc;
      if (0 == var3) {
         if (var4 == 0) {
            this.ay(var1, var2, 128, 108175169);
            this.ay(var1 - 1, var2, 8, 108175169);
         }

         if (var4 == 1) {
            this.ay(var1, var2, 2, 108175169);
            this.ay(var1, var2 + 1, 32, 108175169);
         }

         if (2 == var4) {
            this.ay(var1, var2, 8, 108175169);
            this.ay(var1 + 1, var2, 128, 108175169);
         }

         if (var4 == 3) {
            this.ay(var1, var2, 32, 108175169);
            this.ay(var1, var2 - 1, 2, 108175169);
         }
      }

      if (1 == var3 || var3 == 3) {
         if (0 == var4) {
            this.ay(var1, var2, 1, 108175169);
            this.ay(var1 - 1, var2 + 1, 16, 108175169);
         }

         if (1 == var4) {
            this.ay(var1, var2, 4, 108175169);
            this.ay(1 + var1, var2 + 1, 64, 108175169);
         }

         if (2 == var4) {
            this.ay(var1, var2, 16, 108175169);
            this.ay(1 + var1, var2 - 1, 1, 108175169);
         }

         if (3 == var4) {
            this.ay(var1, var2, 64, 108175169);
            this.ay(var1 - 1, var2 - 1, 4, 108175169);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.ay(var1, var2, 130, 108175169);
            this.ay(var1 - 1, var2, 8, 108175169);
            this.ay(var1, 1 + var2, 32, 108175169);
         }

         if (1 == var4) {
            this.ay(var1, var2, 10, 108175169);
            this.ay(var1, var2 + 1, 32, 108175169);
            this.ay(1 + var1, var2, 128, 108175169);
         }

         if (2 == var4) {
            this.ay(var1, var2, 40, 108175169);
            this.ay(var1 + 1, var2, 128, 108175169);
            this.ay(var1, var2 - 1, 2, 108175169);
         }

         if (3 == var4) {
            this.ay(var1, var2, 160, 108175169);
            this.ay(var1, var2 - 1, 2, 108175169);
            this.ay(var1 - 1, var2, 8, 108175169);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               this.ay(var1, var2, 65536, 108175169);
               this.ay(var1 - 1, var2, 4096, 108175169);
            }

            if (var4 == 1) {
               this.ay(var1, var2, 1024, 108175169);
               this.ay(var1, var2 + 1, 16384, 108175169);
            }

            if (var4 == 2) {
               this.ay(var1, var2, 4096, 108175169);
               this.ay(var1 + 1, var2, 65536, 108175169);
            }

            if (var4 == 3) {
               this.ay(var1, var2, 16384, 108175169);
               this.ay(var1, var2 - 1, 1024, 108175169);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.ay(var1, var2, 512, 108175169);
               this.ay(var1 - 1, var2 + 1, 8192, 108175169);
            }

            if (var4 == 1) {
               this.ay(var1, var2, 2048, 108175169);
               this.ay(var1 + 1, 1 + var2, 32768, 108175169);
            }

            if (var4 == 2) {
               this.ay(var1, var2, 8192, 108175169);
               this.ay(var1 + 1, var2 - 1, 512, 108175169);
            }

            if (var4 == 3) {
               this.ay(var1, var2, 32768, 108175169);
               this.ay(var1 - 1, var2 - 1, 2048, 108175169);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.ay(var1, var2, 66560, 108175169);
               this.ay(var1 - 1, var2, 4096, 108175169);
               this.ay(var1, 1 + var2, 16384, 108175169);
            }

            if (var4 == 1) {
               this.ay(var1, var2, 5120, 108175169);
               this.ay(var1, 1 + var2, 16384, 108175169);
               this.ay(1 + var1, var2, 65536, 108175169);
            }

            if (2 == var4) {
               this.ay(var1, var2, 20480, 108175169);
               this.ay(1 + var1, var2, 65536, 108175169);
               this.ay(var1, var2 - 1, 1024, 108175169);
            }

            if (var4 == 3) {
               this.ay(var1, var2, 81920, 108175169);
               this.ay(var1, var2 - 1, 1024, 108175169);
               this.ay(var1 - 1, var2, 4096, 108175169);
            }
         }
      }

   }
}
