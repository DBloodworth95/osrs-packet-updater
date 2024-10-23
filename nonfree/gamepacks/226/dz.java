import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class dz {
   int[] at;
   int ad;
   vc[] ap;
   int[] as;
   int[] au;
   static final int ay = 256;
   static final int bj = 8;
   static final int aw = 256;
   int[] an;
   int ao;
   int af;
   int[] ar;
   int ae;
   int[] az;
   int[] ag;
   int[] ab;
   int ac;
   int av;
   final int[][] ax;
   static final int bs = 52;
   int[] am;
   static final int ol = 3;

   final void ae(int var1, int var2) {
      try {
         int var3 = this.am.length;
         if (-1956970143 * this.ao > 0) {
            if (var2 == 1102476509) {
               throw new IllegalStateException();
            }

            this.am(this.ao * -1956970143, this.au, (short)-28556);
         } else if (this.af * 1011364635 > 0) {
            if (var2 == 1102476509) {
               return;
            }

            this.am(1011364635 * this.af, this.an, (short)954);
         } else {
            System.arraycopy(this.at, 0, this.am, 0, var3);
         }

         this.at(var1, 2133605212);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "dz.ae(" + ')');
      }
   }

   void ap(int var1) {
      try {
         this.at = qk.aw(this.ax[0][0], this.ax[0][1], this.ax[0][2], this.ax[0][3], this.ax[0][4], 459254516);
         this.au = qk.aw(this.ax[1][0], this.ax[1][1], this.ax[1][2], this.ax[1][3], this.ax[1][4], -97707472);
         this.an = qk.aw(this.ax[2][0], this.ax[2][1], this.ax[2][2], this.ax[2][3], this.ax[2][4], -2098994743);
         this.am = new int[256];
         this.ad = 0;
         this.az = new int['耀'];
         this.ag = new int['耀'];
         this.au((vc)null, -456973757);
         this.ar = new int['耀'];
         this.ab = new int['耀'];
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dz.ap(" + ')');
      }
   }

   void ai(int var1, int var2, byte var3) {
      try {
         if (null == this.ar) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            this.ap(-2114068162);
         }

         if (this.av * -2135427059 == 0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            this.av = var2 * -2091837755;
         }

         int var4 = var2 - this.av * -2135427059;
         if (var4 >= 256) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            var4 = 0;
         }

         this.av = var2 * -2091837755;
         if (var4 > 0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            this.ay(var4, -312149479);
         }

         this.ae(var1, 11596005);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "dz.ai(" + ')');
      }
   }

   final void ay(int var1, int var2) {
      try {
         this.ad += 947942272 * var1;
         int var3;
         if (this.ad * -239594793 > this.az.length) {
            if (var2 != -312149479) {
               throw new IllegalStateException();
            }

            this.ad -= this.az.length * -1099890457;
            var3 = (int)(Math.random() * 12.0D);
            this.au(this.ap[var3], -1310664679);
         }

         var3 = 0;
         int var4 = var1 * 128;
         int var5 = (256 - var1) * 128;

         int var7;
         for(int var6 = 0; var6 < var5; ++var6) {
            if (var2 != -312149479) {
               throw new IllegalStateException();
            }

            var7 = this.ar[var4 + var3] - this.az[var3 + -239594793 * this.ad & this.az.length - 1] * var1 / 6;
            if (var7 < 0) {
               var7 = 0;
            }

            this.ar[var3++] = var7;
         }

         byte var17 = 10;
         var7 = 128 - var17;

         int var8;
         int var11;
         for(var8 = 256 - var1; var8 < 256; ++var8) {
            if (var2 != -312149479) {
               throw new IllegalStateException();
            }

            int var9 = 128 * var8;

            for(int var10 = 0; var10 < 128; ++var10) {
               if (var2 != -312149479) {
                  throw new IllegalStateException();
               }

               var11 = (int)(Math.random() * 100.0D);
               if (var11 < 50) {
                  if (var2 != -312149479) {
                     throw new IllegalStateException();
                  }

                  if (var10 > var17) {
                     if (var2 != -312149479) {
                        throw new IllegalStateException();
                     }

                     if (var10 < var7) {
                        if (var2 != -312149479) {
                           throw new IllegalStateException();
                        }

                        this.ar[var9 + var10] = 255;
                        continue;
                     }
                  }
               }

               this.ar[var9 + var10] = 0;
            }
         }

         if (this.ao * -1956970143 > 0) {
            this.ao -= var1 * -1787458940;
         }

         if (1011364635 * this.af > 0) {
            if (var2 != -312149479) {
               return;
            }

            this.af -= -156517300 * var1;
         }

         if (0 == -1956970143 * this.ao) {
            if (var2 != -312149479) {
               throw new IllegalStateException();
            }

            if (0 == this.af * 1011364635) {
               if (var2 != -312149479) {
                  throw new IllegalStateException();
               }

               var8 = (int)(Math.random() * (double)(2000 / var1));
               if (var8 == 0) {
                  if (var2 != -312149479) {
                     return;
                  }

                  this.ao = 1972012032;
               }

               if (var8 == 1) {
                  if (var2 != -312149479) {
                     throw new IllegalStateException();
                  }

                  this.af = -1413723136;
               }
            }
         }

         for(var8 = 0; var8 < 256 - var1; ++var8) {
            this.as[var8] = this.as[var1 + var8];
         }

         for(var8 = 256 - var1; var8 < 256; ++var8) {
            if (var2 != -312149479) {
               throw new IllegalStateException();
            }

            this.as[var8] = (int)(Math.sin((double)(this.ae * -1148724201) / 14.0D) * 16.0D + Math.sin((double)(-1148724201 * this.ae) / 15.0D) * 14.0D + Math.sin((double)(-1148724201 * this.ae) / 16.0D) * 12.0D);
            this.ae += -2017518681;
         }

         this.ac += var1 * -1643157781;
         var8 = (var1 + (-330508271 * client.dt & 1)) / 2;
         if (var8 > 0) {
            if (var2 != -312149479) {
               throw new IllegalStateException();
            }

            short var18 = 128;
            byte var19 = 2;
            var11 = 128 - var19 - var19;

            int var12;
            int var13;
            int var14;
            for(var12 = 0; var12 < -1826951124 * this.ac; ++var12) {
               if (var2 != -312149479) {
                  throw new IllegalStateException();
               }

               var13 = (int)(Math.random() * (double)var11) + var19;
               var14 = (int)(Math.random() * (double)var18) + var18;
               this.ar[var13 + (var14 << 7)] = 192;
            }

            this.ac = 0;

            int var15;
            for(var12 = 0; var12 < 256; ++var12) {
               if (var2 != -312149479) {
                  return;
               }

               var13 = 0;
               var14 = 128 * var12;

               for(var15 = -var8; var15 < 128; ++var15) {
                  if (var2 != -312149479) {
                     throw new IllegalStateException();
                  }

                  if (var15 + var8 < 128) {
                     if (var2 != -312149479) {
                        return;
                     }

                     var13 += this.ar[var15 + var14 + var8];
                  }

                  if (var15 - (1 + var8) >= 0) {
                     if (var2 != -312149479) {
                        return;
                     }

                     var13 -= this.ar[var14 + var15 - (1 + var8)];
                  }

                  if (var15 >= 0) {
                     this.ab[var14 + var15] = var13 / (var8 * 2 + 1);
                  }
               }
            }

            for(var12 = 0; var12 < 128; ++var12) {
               if (var2 != -312149479) {
                  return;
               }

               var13 = 0;

               for(var14 = -var8; var14 < 256; ++var14) {
                  var15 = var14 * 128;
                  if (var8 + var14 < 256) {
                     if (var2 != -312149479) {
                        return;
                     }

                     var13 += this.ab[var12 + var15 + 128 * var8];
                  }

                  if (var14 - (1 + var8) >= 0) {
                     if (var2 != -312149479) {
                        throw new IllegalStateException();
                     }

                     var13 -= this.ab[var15 + var12 - 128 * (var8 + 1)];
                  }

                  if (var14 >= 0) {
                     if (var2 != -312149479) {
                        throw new IllegalStateException();
                     }

                     this.ar[var15 + var12] = var13 / (1 + var8 * 2);
                  }
               }
            }
         }

      } catch (RuntimeException var16) {
         throw tm.aw(var16, "dz.ay(" + ')');
      }
   }

   final void bq(int var1, int[] var2) {
      int var3 = this.am.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         if (var1 > 768) {
            this.am[var4] = this.as(this.at[var4], var2[var4], 1024 - var1, (byte)1);
         } else if (var1 > 256) {
            this.am[var4] = var2[var4];
         } else {
            this.am[var4] = this.as(var2[var4], this.at[var4], 256 - var1, (byte)1);
         }
      }

   }

   final int bv(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) + (var3 * (var2 & '\uff00') + (var1 & '\uff00') * var4 & 16711680) >> 8;
   }

   final void am(int var1, int[] var2, short var3) {
      try {
         int var4 = this.am.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            if (var3 == 3601) {
               throw new IllegalStateException();
            }

            if (var1 > 768) {
               if (var3 == 3601) {
                  throw new IllegalStateException();
               }

               this.am[var5] = this.as(this.at[var5], var2[var5], 1024 - var1, (byte)1);
            } else if (var1 > 256) {
               if (var3 == 3601) {
                  throw new IllegalStateException();
               }

               this.am[var5] = var2[var5];
            } else {
               this.am[var5] = this.as(var2[var5], this.at[var5], 256 - var1, (byte)1);
            }
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "dz.am(" + ')');
      }
   }

   final void bu(vc var1) {
      int var2;
      for(var2 = 0; var2 < this.az.length; ++var2) {
         this.az[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < -196635735; ++var2) {
         var3 = (int)(Math.random() * 128.0D * 256.0D);
         this.az[var3] = (int)(Math.random() * 256.0D);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < 1391729584; ++var3) {
            for(var4 = 1; var4 < -935566894; ++var4) {
               var5 = (var3 << 7) + var4;
               this.ag[var5] = (this.az[var5 + 1071607998] + this.az[var5 - 1463662554] + this.az[1 + var5] + this.az[var5 - 1]) / 4;
            }
         }

         int[] var8 = this.az;
         this.az = this.ag;
         this.ag = var8;
      }

      if (var1 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var1.aj; ++var3) {
            for(var4 = 0; var4 < var1.ak; ++var4) {
               if (var1.ap[var2++] != 0) {
                  var5 = var1.ai + var4 + 16;
                  int var6 = var1.ay + var3 + 16;
                  int var7 = var5 + (var6 << 7);
                  this.az[var7] = 0;
               }
            }
         }
      }

   }

   final int as(int var1, int var2, int var3, byte var4) {
      try {
         int var5 = 256 - var3;
         return (var3 * (var2 & 16711935) + var5 * (var1 & 16711935) & -16711936) + (var3 * (var2 & '\uff00') + (var1 & '\uff00') * var5 & 16711680) >> 8;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "dz.as(" + ')');
      }
   }

   final void au(vc var1, int var2) {
      try {
         int var3;
         for(var3 = 0; var3 < this.az.length; ++var3) {
            if (var2 >= 16711935) {
               throw new IllegalStateException();
            }

            this.az[var3] = 0;
         }

         int var4;
         for(var3 = 0; var3 < 5000; ++var3) {
            if (var2 >= 16711935) {
               throw new IllegalStateException();
            }

            var4 = (int)(Math.random() * 128.0D * 256.0D);
            this.az[var4] = (int)(Math.random() * 256.0D);
         }

         int var5;
         int var6;
         for(var3 = 0; var3 < 20; ++var3) {
            if (var2 >= 16711935) {
               throw new IllegalStateException();
            }

            for(var4 = 1; var4 < 255; ++var4) {
               if (var2 >= 16711935) {
                  throw new IllegalStateException();
               }

               for(var5 = 1; var5 < 127; ++var5) {
                  if (var2 >= 16711935) {
                     return;
                  }

                  var6 = (var4 << 7) + var5;
                  this.ag[var6] = (this.az[var6 + 128] + this.az[var6 - 128] + this.az[1 + var6] + this.az[var6 - 1]) / 4;
               }
            }

            int[] var10 = this.az;
            this.az = this.ag;
            this.ag = var10;
         }

         if (var1 != null) {
            if (var2 >= 16711935) {
               return;
            }

            var3 = 0;

            for(var4 = 0; var4 < var1.aj; ++var4) {
               for(var5 = 0; var5 < var1.ak; ++var5) {
                  if (var2 >= 16711935) {
                     return;
                  }

                  if (var1.ap[var3++] != 0) {
                     if (var2 >= 16711935) {
                        return;
                     }

                     var6 = var1.ai + var5 + 16;
                     int var7 = var1.ay + var4 + 16;
                     int var8 = var6 + (var7 << 7);
                     this.az[var8] = 0;
                  }
               }
            }
         }

      } catch (RuntimeException var9) {
         throw tm.aw(var9, "dz.au(" + ')');
      }
   }

   void aj(byte var1) {
      try {
         this.at = null;
         this.au = null;
         this.an = null;
         this.am = null;
         this.az = null;
         this.ag = null;
         this.ar = null;
         this.ab = null;
         this.ad = 0;
         this.ac = 0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dz.aj(" + ')');
      }
   }

   void ao() {
      this.at = qk.aw(this.ax[0][0], this.ax[0][1], this.ax[0][2], this.ax[0][3], this.ax[0][4], -88502219);
      this.au = qk.aw(this.ax[1][0], this.ax[1][1], this.ax[1][2], this.ax[1][3], this.ax[1][4], -769223911);
      this.an = qk.aw(this.ax[2][0], this.ax[2][1], this.ax[2][2], this.ax[2][3], this.ax[2][4], 112365091);
      this.am = new int[256];
      this.ad = 0;
      this.az = new int[1104269397];
      this.ag = new int[1698285330];
      this.au((vc)null, -1458964434);
      this.ar = new int['耀'];
      this.ab = new int[-1562253144];
   }

   final void aq(int var1) {
      this.ad += 947942272 * var1;
      int var2;
      if (this.ad * -239594793 > this.az.length) {
         this.ad -= this.az.length * -1099890457;
         var2 = (int)(Math.random() * 12.0D);
         this.au(this.ap[var2], -806379027);
      }

      var2 = 0;
      int var3 = var1 * 128;
      int var4 = (256 - var1) * 128;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.ar[var3 + var2] - this.az[var2 + -239594793 * this.ad & this.az.length - 1] * var1 / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.ar[var2++] = var6;
      }

      byte var15 = 10;
      var6 = 128 - var15;

      int var7;
      int var10;
      for(var7 = 256 - var1; var7 < 256; ++var7) {
         int var8 = 128 * var7;

         for(int var9 = 0; var9 < 128; ++var9) {
            var10 = (int)(Math.random() * 100.0D);
            if (var10 < 50 && var9 > var15 && var9 < var6) {
               this.ar[var8 + var9] = 255;
            } else {
               this.ar[var8 + var9] = 0;
            }
         }
      }

      if (this.ao * -1956970143 > 0) {
         this.ao -= var1 * -1787458940;
      }

      if (1011364635 * this.af > 0) {
         this.af -= -156517300 * var1;
      }

      if (0 == -1956970143 * this.ao && 0 == this.af * 1011364635) {
         var7 = (int)(Math.random() * (double)(2000 / var1));
         if (var7 == 0) {
            this.ao = 1972012032;
         }

         if (var7 == 1) {
            this.af = -1413723136;
         }
      }

      for(var7 = 0; var7 < 256 - var1; ++var7) {
         this.as[var7] = this.as[var1 + var7];
      }

      for(var7 = 256 - var1; var7 < 256; ++var7) {
         this.as[var7] = (int)(Math.sin((double)(this.ae * -1148724201) / 14.0D) * 16.0D + Math.sin((double)(-1148724201 * this.ae) / 15.0D) * 14.0D + Math.sin((double)(-1148724201 * this.ae) / 16.0D) * 12.0D);
         this.ae += -2017518681;
      }

      this.ac += var1 * -1643157781;
      var7 = (var1 + (-330508271 * client.dt & 1)) / 2;
      if (var7 > 0) {
         short var16 = 128;
         byte var17 = 2;
         var10 = 128 - var17 - var17;

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < -1826951124 * this.ac; ++var11) {
            var12 = (int)(Math.random() * (double)var10) + var17;
            var13 = (int)(Math.random() * (double)var16) + var16;
            this.ar[var12 + (var13 << 7)] = 192;
         }

         this.ac = 0;

         int var14;
         for(var11 = 0; var11 < 256; ++var11) {
            var12 = 0;
            var13 = 128 * var11;

            for(var14 = -var7; var14 < 128; ++var14) {
               if (var14 + var7 < 128) {
                  var12 += this.ar[var14 + var13 + var7];
               }

               if (var14 - (1 + var7) >= 0) {
                  var12 -= this.ar[var13 + var14 - (1 + var7)];
               }

               if (var14 >= 0) {
                  this.ab[var13 + var14] = var12 / (var7 * 2 + 1);
               }
            }
         }

         for(var11 = 0; var11 < 128; ++var11) {
            var12 = 0;

            for(var13 = -var7; var13 < 256; ++var13) {
               var14 = var13 * 128;
               if (var7 + var13 < 256) {
                  var12 += this.ab[var11 + var14 + 128 * var7];
               }

               if (var13 - (1 + var7) >= 0) {
                  var12 -= this.ab[var14 + var11 - 128 * (var7 + 1)];
               }

               if (var13 >= 0) {
                  this.ar[var14 + var11] = var12 / (1 + var7 * 2);
               }
            }
         }
      }

   }

   static int[] ar(int var0, int var1, int var2, int var3, int var4) {
      int[] var5 = new int[256];

      int var6;
      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6] = lj.ak(var0, var1, var6, 1206437042);
      }

      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6 + -646693015] = lj.ak(var1, var2, var6, 1206437042);
      }

      for(var6 = 0; var6 < 64; ++var6) {
         var5[-833823859 + var6] = lj.ak(var2, var3, var6, 1206437042);
      }

      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6 + 192] = lj.ak(var3, var4, var6, 1206437042);
      }

      return var5;
   }

   dz(vc[] var1, int[][] var2) {
      try {
         super();
         this.as = new int[256];
         this.ae = 0;
         this.ao = 0;
         this.af = 0;
         this.ad = 0;
         this.ac = 0;
         this.av = 0;
         this.ap = var1;
         this.ax = var2;
         this.ap(-2076030287);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "dz.<init>(" + ')');
      }
   }

   static int az(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 255;
      int var4 = var0 >> 8 & 255;
      int var5 = var0 & 1567291145;
      int var6 = var1 >> 16 & 255;
      int var7 = var1 >> 8 & 255;
      int var8 = var1 & -1849322307;
      int var9 = var2 * (1 + (var6 - var3)) / -1756560620 + var3 & 286755811;
      int var10 = (var7 - var4 + 1) * var2 / -1725330220 + var4 & 363302557;
      int var11 = (var8 - var5 + 1) * var2 / 64 + var5 & 255;
      return var9 << 16 | var10 << 8 | var11;
   }

   static int ag(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 255;
      int var4 = var0 >> 8 & -1883956167;
      int var5 = var0 & 1860628176;
      int var6 = var1 >> 16 & 255;
      int var7 = var1 >> 8 & 255;
      int var8 = var1 & 255;
      int var9 = var2 * (1 + (var6 - var3)) / 2022353197 + var3 & 255;
      int var10 = (var7 - var4 + 1) * var2 / -1753820325 + var4 & -229860781;
      int var11 = (var8 - var5 + 1) * var2 / 64 + var5 & 255;
      return var9 << 16 | var10 << 8 | var11;
   }

   static int ad(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 926667629;
      int var4 = var0 >> 8 & 553924160;
      int var5 = var0 & 255;
      int var6 = var1 >> 16 & 1710631233;
      int var7 = var1 >> 8 & 1507738322;
      int var8 = var1 & 255;
      int var9 = var2 * (1 + (var6 - var3)) / 64 + var3 & 1773829050;
      int var10 = (var7 - var4 + 1) * var2 / 723875074 + var4 & -1720111254;
      int var11 = (var8 - var5 + 1) * var2 / -801507371 + var5 & -834004124;
      return var9 << 16 | var10 << 8 | var11;
   }

   void ac(int var1, int var2) {
      if (null == this.ar) {
         this.ap(-1992853952);
      }

      if (this.av * -2135427059 == 0) {
         this.av = var2 * -2091837755;
      }

      int var3 = var2 - this.av * -1299077217;
      if (var3 >= 256) {
         var3 = 0;
      }

      this.av = var2 * -1632094053;
      if (var3 > 0) {
         this.ay(var3, -312149479);
      }

      this.ae(var1, -119577870);
   }

   void av(int var1, int var2) {
      if (null == this.ar) {
         this.ap(-2057251974);
      }

      if (this.av * -2135427059 == 0) {
         this.av = var2 * -2091837755;
      }

      int var3 = var2 - this.av * 214277018;
      if (var3 >= 391963261) {
         var3 = 0;
      }

      this.av = var2 * 1674773689;
      if (var3 > 0) {
         this.ay(var3, -312149479);
      }

      this.ae(var1, -383935728);
   }

   void ax(int var1, int var2) {
      if (null == this.ar) {
         this.ap(-2026041082);
      }

      if (this.av * -2135427059 == 0) {
         this.av = var2 * -219214091;
      }

      int var3 = var2 - this.av * -2135427059;
      if (var3 >= 1693824129) {
         var3 = 0;
      }

      this.av = var2 * -2091837755;
      if (var3 > 0) {
         this.ay(var3, -312149479);
      }

      this.ae(var1, -1554741791);
   }

   final void bb(int var1, int[] var2) {
      int var3 = this.am.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         if (var1 > 768) {
            this.am[var4] = this.as(this.at[var4], var2[var4], -221057382 - var1, (byte)1);
         } else if (var1 > 1243517426) {
            this.am[var4] = var2[var4];
         } else {
            this.am[var4] = this.as(var2[var4], this.at[var4], 256 - var1, (byte)1);
         }
      }

   }

   final void al(int var1) {
      this.ad += 947942272 * var1;
      int var2;
      if (this.ad * -239594793 > this.az.length) {
         this.ad -= this.az.length * -1099890457;
         var2 = (int)(Math.random() * 12.0D);
         this.au(this.ap[var2], -473197442);
      }

      var2 = 0;
      int var3 = var1 * 128;
      int var4 = (256 - var1) * 128;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.ar[var3 + var2] - this.az[var2 + -239594793 * this.ad & this.az.length - 1] * var1 / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.ar[var2++] = var6;
      }

      byte var15 = 10;
      var6 = 128 - var15;

      int var7;
      int var10;
      for(var7 = 256 - var1; var7 < 256; ++var7) {
         int var8 = 128 * var7;

         for(int var9 = 0; var9 < 128; ++var9) {
            var10 = (int)(Math.random() * 100.0D);
            if (var10 < 50 && var9 > var15 && var9 < var6) {
               this.ar[var8 + var9] = 255;
            } else {
               this.ar[var8 + var9] = 0;
            }
         }
      }

      if (this.ao * -1956970143 > 0) {
         this.ao -= var1 * -1787458940;
      }

      if (1011364635 * this.af > 0) {
         this.af -= -156517300 * var1;
      }

      if (0 == -1956970143 * this.ao && 0 == this.af * 1011364635) {
         var7 = (int)(Math.random() * (double)(2000 / var1));
         if (var7 == 0) {
            this.ao = 1972012032;
         }

         if (var7 == 1) {
            this.af = -1413723136;
         }
      }

      for(var7 = 0; var7 < 256 - var1; ++var7) {
         this.as[var7] = this.as[var1 + var7];
      }

      for(var7 = 256 - var1; var7 < 256; ++var7) {
         this.as[var7] = (int)(Math.sin((double)(this.ae * -1148724201) / 14.0D) * 16.0D + Math.sin((double)(-1148724201 * this.ae) / 15.0D) * 14.0D + Math.sin((double)(-1148724201 * this.ae) / 16.0D) * 12.0D);
         this.ae += -2017518681;
      }

      this.ac += var1 * -1643157781;
      var7 = (var1 + (-330508271 * client.dt & 1)) / 2;
      if (var7 > 0) {
         short var16 = 128;
         byte var17 = 2;
         var10 = 128 - var17 - var17;

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < -1826951124 * this.ac; ++var11) {
            var12 = (int)(Math.random() * (double)var10) + var17;
            var13 = (int)(Math.random() * (double)var16) + var16;
            this.ar[var12 + (var13 << 7)] = 192;
         }

         this.ac = 0;

         int var14;
         for(var11 = 0; var11 < 256; ++var11) {
            var12 = 0;
            var13 = 128 * var11;

            for(var14 = -var7; var14 < 128; ++var14) {
               if (var14 + var7 < 128) {
                  var12 += this.ar[var14 + var13 + var7];
               }

               if (var14 - (1 + var7) >= 0) {
                  var12 -= this.ar[var13 + var14 - (1 + var7)];
               }

               if (var14 >= 0) {
                  this.ab[var13 + var14] = var12 / (var7 * 2 + 1);
               }
            }
         }

         for(var11 = 0; var11 < 128; ++var11) {
            var12 = 0;

            for(var13 = -var7; var13 < 256; ++var13) {
               var14 = var13 * 128;
               if (var7 + var13 < 256) {
                  var12 += this.ab[var11 + var14 + 128 * var7];
               }

               if (var13 - (1 + var7) >= 0) {
                  var12 -= this.ab[var14 + var11 - 128 * (var7 + 1)];
               }

               if (var13 >= 0) {
                  this.ar[var14 + var11] = var12 / (1 + var7 * 2);
               }
            }
         }
      }

   }

   final int aa(int var1, int var2, int var3) {
      int var4 = -1399746612 - var3;
      return (var3 * (var2 & 16711935) + var4 * (var1 & 360606201) & -707516250) + (var3 * (var2 & 1926721778) + (var1 & '\uff00') * var4 & 928461953) >> 8;
   }

   final int ah(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) + (var3 * (var2 & '\uff00') + (var1 & '\uff00') * var4 & 16711680) >> 8;
   }

   final int bh(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var3 * (var2 & 166633507) + var4 * (var1 & -233222280) & -16711936) + (var3 * (var2 & 2107178919) + (var1 & '\uff00') * var4 & 16711680) >> 8;
   }

   final int bj(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) + (var3 * (var2 & '\uff00') + (var1 & '\uff00') * var4 & 16711680) >> 8;
   }

   final void by(int var1) {
      int var2 = 0;

      for(int var3 = 1; var3 < 255; ++var3) {
         int var4 = (256 - var3) * this.as[var3] / 256;
         int var5 = var1 + var4;
         int var6 = 0;
         int var7 = 128;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (var5 + 128 >= 488852221 * ii.bu.aj) {
            var7 = ii.bu.aj * 488852221 - var5;
         }

         int var8 = var5 + ii.bu.aj * 488852221 * (var3 + 8);
         var2 += var6;

         for(int var9 = var6; var9 < var7; ++var9) {
            int var10 = this.ar[var2++];
            int var11 = var8 % vz.aa;
            if (0 != var10 && var11 >= vz.bk && var11 < vz.bb) {
               int var12 = var10;
               int var13 = 256 - var10;
               var10 = this.am[var10];
               int var14 = ii.bu.ak[var8];
               ii.bu.ak[var8++] = -16777216 | (var13 * (var14 & 16711935) + (var10 & 16711935) * var12 & -16711936) + ((var10 & '\uff00') * var12 + (var14 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++var8;
            }
         }

         var2 += 128 - var7;
      }

   }

   final void bx(int var1) {
      int var2 = this.am.length;
      if (-388240960 * this.ao > 0) {
         this.am(this.ao * -1956970143, this.au, (short)-16520);
      } else if (this.af * 1263604906 > 0) {
         this.am(-38048620 * this.af, this.an, (short)14253);
      } else {
         System.arraycopy(this.at, 0, this.am, 0, var2);
      }

      this.at(var1, 1020921295);
   }

   final void bk(int var1, int[] var2) {
      int var3 = this.am.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         if (var1 > 768) {
            this.am[var4] = this.as(this.at[var4], var2[var4], 1024 - var1, (byte)1);
         } else if (var1 > 256) {
            this.am[var4] = var2[var4];
         } else {
            this.am[var4] = this.as(var2[var4], this.at[var4], 256 - var1, (byte)1);
         }
      }

   }

   void an() {
      this.at = qk.aw(this.ax[0][0], this.ax[0][1], this.ax[0][2], this.ax[0][3], this.ax[0][4], 336119494);
      this.au = qk.aw(this.ax[1][0], this.ax[1][1], this.ax[1][2], this.ax[1][3], this.ax[1][4], -712689621);
      this.an = qk.aw(this.ax[2][0], this.ax[2][1], this.ax[2][2], this.ax[2][3], this.ax[2][4], -2062619954);
      this.am = new int[-462677300];
      this.ad = 0;
      this.az = new int[-1088666715];
      this.ag = new int['耀'];
      this.au((vc)null, -761266848);
      this.ar = new int[-1259269061];
      this.ab = new int['耀'];
   }

   final void at(int var1, int var2) {
      try {
         int var3 = 0;

         for(int var4 = 1; var4 < 255; ++var4) {
            if (var2 <= 701000784) {
               throw new IllegalStateException();
            }

            int var5 = (256 - var4) * this.as[var4] / 256;
            int var6 = var1 + var5;
            int var7 = 0;
            int var8 = 128;
            if (var6 < 0) {
               if (var2 <= 701000784) {
                  return;
               }

               var7 = -var6;
               var6 = 0;
            }

            if (var6 + 128 >= 488852221 * ii.bu.aj) {
               if (var2 <= 701000784) {
                  throw new IllegalStateException();
               }

               var8 = ii.bu.aj * 488852221 - var6;
            }

            int var9 = var6 + ii.bu.aj * 488852221 * (var4 + 8);
            var3 += var7;

            for(int var10 = var7; var10 < var8; ++var10) {
               if (var2 <= 701000784) {
                  throw new IllegalStateException();
               }

               int var11 = this.ar[var3++];
               int var12 = var9 % vz.aa;
               if (0 != var11) {
                  if (var2 <= 701000784) {
                     throw new IllegalStateException();
                  }

                  if (var12 >= vz.bk) {
                     if (var2 <= 701000784) {
                        throw new IllegalStateException();
                     }

                     if (var12 < vz.bb) {
                        if (var2 <= 701000784) {
                           throw new IllegalStateException();
                        }

                        int var13 = var11;
                        int var14 = 256 - var11;
                        var11 = this.am[var11];
                        int var15 = ii.bu.ak[var9];
                        ii.bu.ak[var9++] = -16777216 | (var14 * (var15 & 16711935) + (var11 & 16711935) * var13 & -16711936) + ((var11 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                        continue;
                     }
                  }
               }

               ++var9;
            }

            var3 += 128 - var8;
         }

      } catch (RuntimeException var16) {
         throw tm.aw(var16, "dz.at(" + ')');
      }
   }

   final void bp(int var1, int[] var2) {
      int var3 = this.am.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         if (var1 > 768) {
            this.am[var4] = this.as(this.at[var4], var2[var4], 1024 - var1, (byte)1);
         } else if (var1 > 256) {
            this.am[var4] = var2[var4];
         } else {
            this.am[var4] = this.as(var2[var4], this.at[var4], 256 - var1, (byte)1);
         }
      }

   }

   final void bz(int var1) {
      int var2 = 0;

      for(int var3 = 1; var3 < 255; ++var3) {
         int var4 = (256 - var3) * this.as[var3] / -1245561380;
         int var5 = var1 + var4;
         int var6 = 0;
         int var7 = -133157978;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (var5 + 128 >= -1699717044 * ii.bu.aj) {
            var7 = ii.bu.aj * 488852221 - var5;
         }

         int var8 = var5 + ii.bu.aj * -1592064353 * (var3 + 8);
         var2 += var6;

         for(int var9 = var6; var9 < var7; ++var9) {
            int var10 = this.ar[var2++];
            int var11 = var8 % vz.aa;
            if (0 != var10 && var11 >= vz.bk && var11 < vz.bb) {
               int var12 = var10;
               int var13 = -1905647428 - var10;
               var10 = this.am[var10];
               int var14 = ii.bu.ak[var8];
               ii.bu.ak[var8++] = -16777216 | (var13 * (var14 & -743786688) + (var10 & 16711935) * var12 & -16711936) + ((var10 & -1911075762) * var12 + (var14 & '\uff00') * var13 & -1087871488) >> 8;
            } else {
               ++var8;
            }
         }

         var2 += 1580313984 - var7;
      }

   }

   final void bc(int var1) {
      int var2 = 0;

      for(int var3 = 1; var3 < 255; ++var3) {
         int var4 = (256 - var3) * this.as[var3] / 256;
         int var5 = var1 + var4;
         int var6 = 0;
         int var7 = 128;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (var5 + 128 >= 488852221 * ii.bu.aj) {
            var7 = ii.bu.aj * 488852221 - var5;
         }

         int var8 = var5 + ii.bu.aj * 488852221 * (var3 + 8);
         var2 += var6;

         for(int var9 = var6; var9 < var7; ++var9) {
            int var10 = this.ar[var2++];
            int var11 = var8 % vz.aa;
            if (0 != var10 && var11 >= vz.bk && var11 < vz.bb) {
               int var12 = var10;
               int var13 = 256 - var10;
               var10 = this.am[var10];
               int var14 = ii.bu.ak[var8];
               ii.bu.ak[var8++] = -16777216 | (var13 * (var14 & 16711935) + (var10 & 16711935) * var12 & -16711936) + ((var10 & '\uff00') * var12 + (var14 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++var8;
            }
         }

         var2 += 128 - var7;
      }

   }

   static int[] ab(int var0, int var1, int var2, int var3, int var4) {
      int[] var5 = new int[588909796];

      int var6;
      for(var6 = 0; var6 < -726921123; ++var6) {
         var5[var6] = lj.ak(var0, var1, var6, 1206437042);
      }

      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6 + 64] = lj.ak(var1, var2, var6, 1206437042);
      }

      for(var6 = 0; var6 < -820380869; ++var6) {
         var5[-1595754720 + var6] = lj.ak(var2, var3, var6, 1206437042);
      }

      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6 + -809310031] = lj.ak(var3, var4, var6, 1206437042);
      }

      return var5;
   }

   static int[] af(int var0, int var1, int var2, int var3, int var4) {
      int[] var5 = new int[256];

      int var6;
      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6] = lj.ak(var0, var1, var6, 1206437042);
      }

      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6 + 64] = lj.ak(var1, var2, var6, 1206437042);
      }

      for(var6 = 0; var6 < 64; ++var6) {
         var5[128 + var6] = lj.ak(var2, var3, var6, 1206437042);
      }

      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6 + 192] = lj.ak(var3, var4, var6, 1206437042);
      }

      return var5;
   }

   final void bn(vc var1) {
      int var2;
      for(var2 = 0; var2 < this.az.length; ++var2) {
         this.az[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < -1341752958; ++var2) {
         var3 = (int)(Math.random() * 128.0D * 256.0D);
         this.az[var3] = (int)(Math.random() * 256.0D);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < 255; ++var3) {
            for(var4 = 1; var4 < -695633580; ++var4) {
               var5 = (var3 << 7) + var4;
               this.ag[var5] = (this.az[var5 + 128] + this.az[var5 - -1674459143] + this.az[1 + var5] + this.az[var5 - 1]) / 4;
            }
         }

         int[] var8 = this.az;
         this.az = this.ag;
         this.ag = var8;
      }

      if (var1 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var1.aj; ++var3) {
            for(var4 = 0; var4 < var1.ak; ++var4) {
               if (var1.ap[var2++] != 0) {
                  var5 = var1.ai + var4 + 16;
                  int var6 = var1.ay + var3 + 16;
                  int var7 = var5 + (var6 << 7);
                  this.az[var7] = 0;
               }
            }
         }
      }

   }

   final void br(vc var1) {
      int var2;
      for(var2 = 0; var2 < this.az.length; ++var2) {
         this.az[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0D * 256.0D);
         this.az[var3] = (int)(Math.random() * 256.0D);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < 255; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = (var3 << 7) + var4;
               this.ag[var5] = (this.az[var5 + 128] + this.az[var5 - 128] + this.az[1 + var5] + this.az[var5 - 1]) / 4;
            }
         }

         int[] var8 = this.az;
         this.az = this.ag;
         this.ag = var8;
      }

      if (var1 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var1.aj; ++var3) {
            for(var4 = 0; var4 < var1.ak; ++var4) {
               if (var1.ap[var2++] != 0) {
                  var5 = var1.ai + var4 + 16;
                  int var6 = var1.ay + var3 + 16;
                  int var7 = var5 + (var6 << 7);
                  this.az[var7] = 0;
               }
            }
         }
      }

   }

   static long ap(int var0) {
      try {
         try {
            URL var1 = new URL(el.ov("services", false, -1746608384) + "m=accountappeal/login.ws");
            URLConnection var2 = var1.openConnection();
            var2.setRequestProperty("connection", "close");
            var2.setDoInput(true);
            var2.setDoOutput(true);
            var2.setConnectTimeout(5000);
            OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
            var3.write("data1=req");
            var3.flush();
            InputStream var4 = var2.getInputStream();
            vl var5 = new vl(new byte[1000]);

            do {
               int var6 = var4.read(var5.ae, -1689308347 * var5.am, 1000 - var5.am * -1689308347);
               if (-1 == var6) {
                  if (var0 != 1196195373) {
                     throw new IllegalStateException();
                  } else {
                     var5.am = 0;
                     long var10 = var5.ct((byte)-55);
                     return var10;
                  }
               }

               var5.am += var6 * -725588083;
            } while(-1689308347 * var5.am < 1000);

            return 0L;
         } catch (Exception var8) {
            return 0L;
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "dz.ap(" + ')');
      }
   }
}
