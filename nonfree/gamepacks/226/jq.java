public class jq extends jz {
   int aw;
   int ap;
   int aj;
   int au;
   int ai;
   int ay;
   int as;
   int ae;
   int ak;
   int at;
   int am;

   void am(ji var1, js var2, int var3, int var4) {
      int var5 = var2.ap.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.ap[var6] - 280474237 * this.ap;
         int var8 = var2.aw[var6] - -1972146501 * this.aw;
         int var9 = var2.ak[var6] - 1360372297 * this.ak;
         int var10 = var9 * this.ae * 1762594603 + var7 * -1012244489 * this.am >> 16;
         var9 = var9 * -1012244489 * this.am - var7 * 1762594603 * this.ae >> 16;
         var7 = var10;
         var10 = var8 * this.as * 1902355461 - var9 * this.ay * -1550738849 >> 16;
         var9 = var8 * this.ay * -1550738849 + this.as * 1902355461 * var9 >> 16;
         if (var9 < 50) {
            return;
         }

         if (var2.at != null) {
            js.ad[var6] = var7;
            js.ac[var6] = var10;
            js.av[var6] = var9;
         }

         js.ab[var6] = jm.as() + var7 * jm.ao() / var9;
         js.az[var6] = jm.ae() + var10 * jm.ao() / var9;
         js.ag[var6] = hl.ak(var9, 1261288518);
      }

      this.ao(var1, var2, var3, var4, -1708951828);
   }

   void ap(jv var1, int var2, int var3, int var4, int var5, long var6) {
      try {
         var1.el(var2, 919856549 * this.aj, this.ai * 2105978325, var3, var4, var5, 280474237 * this.ap, this.aw * -1972146501, this.ak * 1360372297, var6, this.at * -74775619, this.au * -1650200083, false);
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "jq.ap(" + ')');
      }
   }

   jq(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         super();
         this.ap = 369415893 * var1;
         this.aw = -746019213 * var2;
         this.ak = 1138487289 * var3;
         this.aj = 990935597 * var4;
         this.ai = 1695884157 * var5;
         this.ay = jm.aj[var4] * -369016417;
         this.as = -1690859315 * jm.ai[var4];
         this.ae = 1989883779 * jm.aj[var5];
         this.am = -279965241 * jm.ai[var5];
         this.at = -1192898667 * var6;
         this.au = var7 * -1166797851;
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "jq.<init>(" + ')');
      }
   }

   void ak(ji var1, js var2, int var3, int var4, byte var5) {
      try {
         int var6 = var2.ap.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            if (var5 <= 75) {
               return;
            }

            int var8 = var2.ap[var7] - 280474237 * this.ap;
            int var9 = var2.aw[var7] - -1972146501 * this.aw;
            int var10 = var2.ak[var7] - 1360372297 * this.ak;
            int var11 = var10 * this.ae * 1762594603 + var8 * -1012244489 * this.am >> 16;
            var10 = var10 * -1012244489 * this.am - var8 * 1762594603 * this.ae >> 16;
            var8 = var11;
            var11 = var9 * this.as * 1902355461 - var10 * this.ay * -1550738849 >> 16;
            var10 = var9 * this.ay * -1550738849 + this.as * 1902355461 * var10 >> 16;
            if (var10 < 50) {
               return;
            }

            if (var2.at != null) {
               if (var5 <= 75) {
                  throw new IllegalStateException();
               }

               js.ad[var7] = var8;
               js.ac[var7] = var11;
               js.av[var7] = var10;
            }

            js.ab[var7] = jm.as() + var8 * jm.ao() / var10;
            js.az[var7] = jm.ae() + var11 * jm.ao() / var10;
            js.ag[var7] = hl.ak(var10, 1261288518);
         }

         this.ao(var1, var2, var3, var4, -1584699506);
      } catch (RuntimeException var12) {
         throw tm.aw(var12, "jq.ak(" + ')');
      }
   }

   void aj(jv var1, int var2, int var3, int var4, int var5, long var6) {
      var1.el(var2, 919856549 * this.aj, this.ai * 2105978325, var3, var4, var5, 280474237 * this.ap, this.aw * -1972146501, this.ak * 1360372297, var6, this.at * -74775619, this.au * -1650200083, false);
   }

   void ai(jv var1, int var2, int var3, int var4, int var5, long var6) {
      var1.el(var2, 919856549 * this.aj, this.ai * -63528281, var3, var4, var5, -1930460524 * this.ap, this.aw * -1972146501, this.ak * 705689146, var6, this.at * 1217820086, this.au * -2027626311, false);
   }

   void ay(ji var1, jp var2, int var3, int var4, int var5) {
      int var6;
      int var7 = var6 = (var4 << 7) - 280474237 * this.ap;
      int var8;
      int var9 = var8 = (var5 << 7) - 1360372297 * this.ak;
      int var10;
      int var11 = var10 = 128 + var7;
      int var12;
      int var13 = var12 = var9 + 128;
      int var14 = var1.as[var3][var4][var5] - -1972146501 * this.aw;
      int var15 = var1.as[var3][var4 + 1][var5] - this.aw * -1972146501;
      int var16 = var1.as[var3][var4 + 1][var5 + 1] - this.aw * -1972146501;
      int var17 = var1.as[var3][var4][1 + var5] - this.aw * -1972146501;
      int var18 = this.ae * 1762594603 * var9 + var7 * this.am * -1012244489 >> 16;
      var9 = var9 * this.am * -1012244489 - var7 * 1762594603 * this.ae >> 16;
      var7 = var18;
      var18 = var14 * this.as * 1902355461 - -1550738849 * this.ay * var9 >> 16;
      var9 = var14 * this.ay * -1550738849 + 1902355461 * this.as * var9 >> 16;
      var14 = var18;
      if (var9 >= 50) {
         var18 = var8 * this.ae * 1762594603 + var11 * -1012244489 * this.am >> 16;
         var8 = var8 * -1012244489 * this.am - this.ae * 1762594603 * var11 >> 16;
         var11 = var18;
         var18 = var15 * 1902355461 * this.as - var8 * -1550738849 * this.ay >> 16;
         var8 = this.as * 1902355461 * var8 + var15 * -1550738849 * this.ay >> 16;
         var15 = var18;
         if (var8 >= 50) {
            var18 = this.ae * 1762594603 * var13 + var10 * -1012244489 * this.am >> 16;
            var13 = var13 * this.am * -1012244489 - 1762594603 * this.ae * var10 >> 16;
            var10 = var18;
            var18 = var16 * 1902355461 * this.as - var13 * -1550738849 * this.ay >> 16;
            var13 = var16 * -1550738849 * this.ay + var13 * 1902355461 * this.as >> 16;
            var16 = var18;
            if (var13 >= 50) {
               var18 = 1762594603 * this.ae * var12 + var6 * this.am * -1012244489 >> 16;
               var12 = this.am * -1012244489 * var12 - var6 * 1762594603 * this.ae >> 16;
               var6 = var18;
               var18 = var17 * 1902355461 * this.as - var12 * -1550738849 * this.ay >> 16;
               var12 = this.ay * -1550738849 * var17 + var12 * 1902355461 * this.as >> 16;
               if (var12 >= 50) {
                  this.an(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12, 1941313100);
               }
            }
         }
      }
   }

   void as(ji var1, jp var2, int var3, int var4, int var5) {
      int var6;
      int var7 = var6 = (var4 << 7) - 280474237 * this.ap;
      int var8;
      int var9 = var8 = (var5 << 7) - 1360372297 * this.ak;
      int var10;
      int var11 = var10 = 128 + var7;
      int var12;
      int var13 = var12 = var9 + 128;
      int var14 = var1.as[var3][var4][var5] - -1972146501 * this.aw;
      int var15 = var1.as[var3][var4 + 1][var5] - this.aw * -1972146501;
      int var16 = var1.as[var3][var4 + 1][var5 + 1] - this.aw * -1972146501;
      int var17 = var1.as[var3][var4][1 + var5] - this.aw * -1972146501;
      int var18 = this.ae * 1762594603 * var9 + var7 * this.am * -1012244489 >> 16;
      var9 = var9 * this.am * -1012244489 - var7 * 1762594603 * this.ae >> 16;
      var7 = var18;
      var18 = var14 * this.as * 1902355461 - -1550738849 * this.ay * var9 >> 16;
      var9 = var14 * this.ay * -1550738849 + 1902355461 * this.as * var9 >> 16;
      var14 = var18;
      if (var9 >= 50) {
         var18 = var8 * this.ae * 1762594603 + var11 * -1012244489 * this.am >> 16;
         var8 = var8 * -1012244489 * this.am - this.ae * 1762594603 * var11 >> 16;
         var11 = var18;
         var18 = var15 * 1902355461 * this.as - var8 * -1550738849 * this.ay >> 16;
         var8 = this.as * 1902355461 * var8 + var15 * -1550738849 * this.ay >> 16;
         var15 = var18;
         if (var8 >= 50) {
            var18 = this.ae * 1762594603 * var13 + var10 * -1012244489 * this.am >> 16;
            var13 = var13 * this.am * -1012244489 - 1762594603 * this.ae * var10 >> 16;
            var10 = var18;
            var18 = var16 * 1902355461 * this.as - var13 * -1550738849 * this.ay >> 16;
            var13 = var16 * -1550738849 * this.ay + var13 * 1902355461 * this.as >> 16;
            var16 = var18;
            if (var13 >= 50) {
               var18 = 1762594603 * this.ae * var12 + var6 * this.am * -1012244489 >> 16;
               var12 = this.am * -1012244489 * var12 - var6 * 1762594603 * this.ae >> 16;
               var6 = var18;
               var18 = var17 * 1902355461 * this.as - var12 * -1550738849 * this.ay >> 16;
               var12 = this.ay * -1550738849 * var17 + var12 * 1902355461 * this.as >> 16;
               if (var12 >= 50) {
                  this.an(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12, 1618336677);
               }
            }
         }
      }
   }

   void ae(ji var1, js var2, int var3, int var4) {
      int var5 = var2.ap.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.ap[var6] - -1795945340 * this.ap;
         int var8 = var2.aw[var6] - 629304939 * this.aw;
         int var9 = var2.ak[var6] - -1549240998 * this.ak;
         int var10 = var9 * this.ae * 1762594603 + var7 * -1012244489 * this.am >> 16;
         var9 = var9 * -1364147253 * this.am - var7 * -891494730 * this.ae >> 16;
         var7 = var10;
         var10 = var8 * this.as * -244831002 - var9 * this.ay * -1125522657 >> 16;
         var9 = var8 * this.ay * -647391915 + this.as * 1902355461 * var9 >> 16;
         if (var9 < 799525671) {
            return;
         }

         if (var2.at != null) {
            js.ad[var6] = var7;
            js.ac[var6] = var10;
            js.av[var6] = var9;
         }

         js.ab[var6] = jm.as() + var7 * jm.ao() / var9;
         js.az[var6] = jm.ae() + var10 * jm.ao() / var9;
         js.ag[var6] = hl.ak(var9, 1261288518);
      }

      this.ao(var1, var2, var3, var4, 997076571);
   }

   void aw(ji var1, jp var2, int var3, int var4, int var5, int var6) {
      try {
         int var7;
         int var8 = var7 = (var4 << 7) - 280474237 * this.ap;
         int var9;
         int var10 = var9 = (var5 << 7) - 1360372297 * this.ak;
         int var11;
         int var12 = var11 = 128 + var8;
         int var13;
         int var14 = var13 = var10 + 128;
         int var15 = var1.as[var3][var4][var5] - -1972146501 * this.aw;
         int var16 = var1.as[var3][var4 + 1][var5] - this.aw * -1972146501;
         int var17 = var1.as[var3][var4 + 1][var5 + 1] - this.aw * -1972146501;
         int var18 = var1.as[var3][var4][1 + var5] - this.aw * -1972146501;
         int var19 = this.ae * 1762594603 * var10 + var8 * this.am * -1012244489 >> 16;
         var10 = var10 * this.am * -1012244489 - var8 * 1762594603 * this.ae >> 16;
         var8 = var19;
         var19 = var15 * this.as * 1902355461 - -1550738849 * this.ay * var10 >> 16;
         var10 = var15 * this.ay * -1550738849 + 1902355461 * this.as * var10 >> 16;
         var15 = var19;
         if (var10 < 50) {
            if (var6 == 300903290) {
               throw new IllegalStateException();
            }
         } else {
            var19 = var9 * this.ae * 1762594603 + var12 * -1012244489 * this.am >> 16;
            var9 = var9 * -1012244489 * this.am - this.ae * 1762594603 * var12 >> 16;
            var12 = var19;
            var19 = var16 * 1902355461 * this.as - var9 * -1550738849 * this.ay >> 16;
            var9 = this.as * 1902355461 * var9 + var16 * -1550738849 * this.ay >> 16;
            var16 = var19;
            if (var9 >= 50) {
               var19 = this.ae * 1762594603 * var14 + var11 * -1012244489 * this.am >> 16;
               var14 = var14 * this.am * -1012244489 - 1762594603 * this.ae * var11 >> 16;
               var11 = var19;
               var19 = var17 * 1902355461 * this.as - var14 * -1550738849 * this.ay >> 16;
               var14 = var17 * -1550738849 * this.ay + var14 * 1902355461 * this.as >> 16;
               var17 = var19;
               if (var14 >= 50) {
                  var19 = 1762594603 * this.ae * var13 + var7 * this.am * -1012244489 >> 16;
                  var13 = this.am * -1012244489 * var13 - var7 * 1762594603 * this.ae >> 16;
                  var7 = var19;
                  var19 = var18 * 1902355461 * this.as - var13 * -1550738849 * this.ay >> 16;
                  var13 = this.ay * -1550738849 * var18 + var13 * 1902355461 * this.as >> 16;
                  if (var13 >= 50) {
                     this.an(var1, var2, var4, var5, var8, var12, var11, var7, var15, var16, var17, var19, var10, var9, var14, var13, -29113637);
                  }
               }
            }
         }
      } catch (RuntimeException var20) {
         throw tm.aw(var20, "jq.aw(" + ')');
      }
   }

   void at(ji var1, js var2, int var3, int var4) {
      int var5 = var2.ap.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.ap[var6] - 280474237 * this.ap;
         int var8 = var2.aw[var6] - -1972146501 * this.aw;
         int var9 = var2.ak[var6] - 1360372297 * this.ak;
         int var10 = var9 * this.ae * 1762594603 + var7 * -1012244489 * this.am >> 16;
         var9 = var9 * -1012244489 * this.am - var7 * 1762594603 * this.ae >> 16;
         var7 = var10;
         var10 = var8 * this.as * 1902355461 - var9 * this.ay * -1550738849 >> 16;
         var9 = var8 * this.ay * -1550738849 + this.as * 1902355461 * var9 >> 16;
         if (var9 < 50) {
            return;
         }

         if (var2.at != null) {
            js.ad[var6] = var7;
            js.ac[var6] = var10;
            js.av[var6] = var9;
         }

         js.ab[var6] = jm.as() + var7 * jm.ao() / var9;
         js.az[var6] = jm.ae() + var10 * jm.ao() / var9;
         js.ag[var6] = hl.ak(var9, 1261288518);
      }

      this.ao(var1, var2, var3, var4, -705038461);
   }

   void au(ji var1, js var2, int var3, int var4) {
      int var5 = var2.ap.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.ap[var6] - 280474237 * this.ap;
         int var8 = var2.aw[var6] - 1572596809 * this.aw;
         int var9 = var2.ak[var6] - -418421579 * this.ak;
         int var10 = var9 * this.ae * -383529515 + var7 * 1302380717 * this.am >> 16;
         var9 = var9 * -1012244489 * this.am - var7 * -1763462697 * this.ae >> 16;
         var7 = var10;
         var10 = var8 * this.as * 1902355461 - var9 * this.ay * -1467073153 >> 16;
         var9 = var8 * this.ay * -1550738849 + this.as * 1438572962 * var9 >> 16;
         if (var9 < 50) {
            return;
         }

         if (var2.at != null) {
            js.ad[var6] = var7;
            js.ac[var6] = var10;
            js.av[var6] = var9;
         }

         js.ab[var6] = jm.as() + var7 * jm.ao() / var9;
         js.az[var6] = jm.ae() + var10 * jm.ao() / var9;
         js.ag[var6] = hl.ak(var9, 1261288518);
      }

      this.ao(var1, var2, var3, var4, 548190357);
   }

   public static int ap(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6, int var7) {
      try {
         float var8 = 0.0F;

         for(int var9 = 0; var9 < 1 + var1; ++var9) {
            var8 += Math.abs(var0[var9]);
         }

         float var43 = (Math.abs(var2) + Math.abs(var4)) * (float)(1 + var1) * fj.aj;
         if (var8 <= var43) {
            if (var7 != 1350563286) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            float[] var10 = new float[var1 + 1];

            int var11;
            for(var11 = 0; var11 < 1 + var1; ++var11) {
               if (var7 != 1350563286) {
                  throw new IllegalStateException();
               }

               var10[var11] = 1.0F / var8 * var0[var11];
            }

            while(Math.abs(var10[var1]) < var43) {
               if (var7 != 1350563286) {
                  throw new IllegalStateException();
               }

               --var1;
            }

            var11 = 0;
            if (0 == var1) {
               if (var7 != 1350563286) {
                  throw new IllegalStateException();
               } else {
                  return var11;
               }
            } else {
               boolean var48;
               if (1 == var1) {
                  if (var7 != 1350563286) {
                     throw new IllegalStateException();
                  } else {
                     var6[0] = -var10[0] / var10[1];
                     if (var3) {
                        if (var7 != 1350563286) {
                           throw new IllegalStateException();
                        }

                        if (var2 < var6[0] + var43) {
                           if (var7 != 1350563286) {
                              throw new IllegalStateException();
                           }

                           var48 = true;
                        } else {
                           var48 = false;
                        }
                     } else if (var2 < var6[0] - var43) {
                        if (var7 != 1350563286) {
                           throw new IllegalStateException();
                        }

                        var48 = true;
                     } else {
                        var48 = false;
                     }

                     boolean var44 = var48;
                     if (var5) {
                        if (var7 != 1350563286) {
                           throw new IllegalStateException();
                        }

                        if (var4 > var6[0] - var43) {
                           if (var7 != 1350563286) {
                              throw new IllegalStateException();
                           }

                           var48 = true;
                        } else {
                           var48 = false;
                        }
                     } else if (var4 > var43 + var6[0]) {
                        if (var7 != 1350563286) {
                           throw new IllegalStateException();
                        }

                        var48 = true;
                     } else {
                        var48 = false;
                     }

                     byte var49;
                     label370: {
                        boolean var45 = var48;
                        if (var44) {
                           if (var7 != 1350563286) {
                              throw new IllegalStateException();
                           }

                           if (var45) {
                              if (var7 != 1350563286) {
                                 throw new IllegalStateException();
                              }

                              var49 = 1;
                              break label370;
                           }
                        }

                        var49 = 0;
                     }

                     byte var46 = var49;
                     if (var46 > 0) {
                        if (var3) {
                           if (var7 != 1350563286) {
                              throw new IllegalStateException();
                           }

                           if (var6[0] < var2) {
                              if (var7 != 1350563286) {
                                 throw new IllegalStateException();
                              }

                              var6[0] = var2;
                              return var46;
                           }
                        }

                        if (var5) {
                           if (var7 != 1350563286) {
                              throw new IllegalStateException();
                           }

                           if (var6[0] > var4) {
                              if (var7 != 1350563286) {
                                 throw new IllegalStateException();
                              }

                              var6[0] = var4;
                           }
                        }
                     }

                     return var46;
                  }
               } else {
                  qc var12 = new qc(var10, var1);
                  float[] var13 = new float[1 + var1];

                  for(int var14 = 1; var14 <= var1; ++var14) {
                     if (var7 != 1350563286) {
                        throw new IllegalStateException();
                     }

                     var13[var14 - 1] = (float)var14 * var10[var14];
                  }

                  float[] var47 = new float[var1 + 1];
                  int var15 = ap(var13, var1 - 1, var2, false, var4, false, var47, 1350563286);
                  if (var15 == -1) {
                     if (var7 != 1350563286) {
                        throw new IllegalStateException();
                     } else {
                        return 0;
                     }
                  } else {
                     boolean var16 = false;
                     float var18 = 0.0F;
                     float var19 = 0.0F;
                     float var20 = 0.0F;

                     for(int var21 = 0; var21 <= var15; ++var21) {
                        if (var11 > var1) {
                           if (var7 != 1350563286) {
                              throw new IllegalStateException();
                           }

                           return var11;
                        }

                        float var17;
                        if (0 == var21) {
                           if (var7 != 1350563286) {
                              throw new IllegalStateException();
                           }

                           var17 = var2;
                           var19 = dm.aw(var10, var1, var2, 1795742702);
                           if (Math.abs(var19) <= var43) {
                              if (var7 != 1350563286) {
                                 throw new IllegalStateException();
                              }

                              if (var3) {
                                 if (var7 != 1350563286) {
                                    throw new IllegalStateException();
                                 }

                                 var6[var11++] = var2;
                              }
                           }
                        } else {
                           var17 = var20;
                           var19 = var18;
                        }

                        if (var15 == var21) {
                           var20 = var4;
                           var16 = false;
                        } else {
                           var20 = var47[var21];
                        }

                        var18 = dm.aw(var10, var1, var20, 2044020331);
                        if (var16) {
                           if (var7 != 1350563286) {
                              throw new IllegalStateException();
                           }

                           var16 = false;
                        } else if (Math.abs(var18) < var43) {
                           if (var7 != 1350563286) {
                              throw new IllegalStateException();
                           }

                           if (var21 == var15) {
                              if (var7 != 1350563286) {
                                 throw new IllegalStateException();
                              }

                              if (!var5) {
                                 continue;
                              }

                              if (var7 != 1350563286) {
                                 throw new IllegalStateException();
                              }
                           }

                           var6[var11++] = var20;
                           var16 = true;
                        } else {
                           label474: {
                              if (var19 < 0.0F) {
                                 if (var7 != 1350563286) {
                                    throw new IllegalStateException();
                                 }

                                 if (var18 > 0.0F) {
                                    break label474;
                                 }

                                 if (var7 != 1350563286) {
                                    throw new IllegalStateException();
                                 }
                              }

                              if (!(var19 > 0.0F)) {
                                 continue;
                              }

                              if (var7 != 1350563286) {
                                 throw new IllegalStateException();
                              }

                              if (!(var18 < 0.0F)) {
                                 continue;
                              }

                              if (var7 != 1350563286) {
                                 throw new IllegalStateException();
                              }
                           }

                           int var23 = var11++;
                           float var25 = var17;
                           float var26 = var20;
                           float var27 = dm.aw(var12.ap, var12.aw * -1448224687, var17, -2126317731);
                           float var24;
                           if (Math.abs(var27) < fj.aj) {
                              if (var7 != 1350563286) {
                                 throw new IllegalStateException();
                              }

                              var24 = var17;
                           } else {
                              float var28 = dm.aw(var12.ap, -1448224687 * var12.aw, var20, -1839310334);
                              if (Math.abs(var28) < fj.aj) {
                                 if (var7 != 1350563286) {
                                    throw new IllegalStateException();
                                 }

                                 var24 = var20;
                              } else {
                                 float var29 = 0.0F;
                                 float var30 = 0.0F;
                                 float var31 = 0.0F;
                                 float var36 = 0.0F;
                                 boolean var37 = true;
                                 boolean var38 = false;

                                 do {
                                    var38 = false;
                                    if (var37) {
                                       if (var7 != 1350563286) {
                                          throw new IllegalStateException();
                                       }

                                       var29 = var25;
                                       var36 = var27;
                                       var30 = var26 - var25;
                                       var31 = var30;
                                       var37 = false;
                                    }

                                    if (Math.abs(var36) < Math.abs(var28)) {
                                       var25 = var26;
                                       var26 = var29;
                                       var29 = var25;
                                       var27 = var28;
                                       var28 = var36;
                                       var36 = var27;
                                    }

                                    float var39;
                                    float var40;
                                    label401: {
                                       var39 = fj.ai * Math.abs(var26) + 0.0F;
                                       var40 = 0.5F * (var29 - var26);
                                       if (Math.abs(var40) > var39) {
                                          if (var7 != 1350563286) {
                                             throw new IllegalStateException();
                                          }

                                          if (var28 != 0.0F) {
                                             if (var7 != 1350563286) {
                                                throw new IllegalStateException();
                                             }

                                             var48 = true;
                                             break label401;
                                          }
                                       }

                                       var48 = false;
                                    }

                                    boolean var41 = var48;
                                    if (var41) {
                                       if (var7 != 1350563286) {
                                          throw new IllegalStateException();
                                       }

                                       label417: {
                                          if (!(Math.abs(var31) < var39)) {
                                             if (var7 != 1350563286) {
                                                throw new IllegalStateException();
                                             }

                                             if (!(Math.abs(var27) <= Math.abs(var28))) {
                                                float var35 = var28 / var27;
                                                float var32;
                                                float var33;
                                                if (var29 == var25) {
                                                   if (var7 != 1350563286) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var32 = 2.0F * var40 * var35;
                                                   var33 = 1.0F - var35;
                                                } else {
                                                   var33 = var27 / var36;
                                                   float var34 = var28 / var36;
                                                   var32 = var35 * ((var33 - var34) * var33 * var40 * 2.0F - (var34 - 1.0F) * (var26 - var25));
                                                   var33 = (var34 - 1.0F) * (var33 - 1.0F) * (var35 - 1.0F);
                                                }

                                                if ((double)var32 > 0.0D) {
                                                   var33 = -var33;
                                                } else {
                                                   var32 = -var32;
                                                }

                                                var35 = var31;
                                                var31 = var30;
                                                if (2.0F * var32 < var33 * 3.0F * var40 - Math.abs(var33 * var39)) {
                                                   if (var7 != 1350563286) {
                                                      throw new IllegalStateException();
                                                   }

                                                   if (var32 < Math.abs(0.5F * var35 * var33)) {
                                                      if (var7 != 1350563286) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var30 = var32 / var33;
                                                      break label417;
                                                   }
                                                }

                                                var30 = var40;
                                                var31 = var40;
                                                break label417;
                                             }
                                          }

                                          var30 = var40;
                                          var31 = var40;
                                       }

                                       var25 = var26;
                                       var27 = var28;
                                       if (Math.abs(var30) > var39) {
                                          if (var7 != 1350563286) {
                                             throw new IllegalStateException();
                                          }

                                          var26 += var30;
                                       } else if ((double)var40 > 0.0D) {
                                          if (var7 != 1350563286) {
                                             throw new IllegalStateException();
                                          }

                                          var26 += var39;
                                       } else {
                                          var26 -= var39;
                                       }

                                       var28 = dm.aw(var12.ap, var12.aw * -1448224687, var26, 1759686581);
                                       if ((double)(var28 * (var36 / Math.abs(var36))) > 0.0D) {
                                          var37 = true;
                                          var38 = true;
                                       } else {
                                          var38 = true;
                                       }
                                    }
                                 } while(var38);

                                 if (var7 != 1350563286) {
                                    throw new IllegalStateException();
                                 }

                                 var24 = var26;
                              }
                           }

                           var6[var23] = var24;
                           if (var11 > 1) {
                              if (var7 != 1350563286) {
                                 throw new IllegalStateException();
                              }

                              if (var6[var11 - 2] >= var6[var11 - 1] - var43) {
                                 if (var7 != 1350563286) {
                                    throw new IllegalStateException();
                                 }

                                 var6[var11 - 2] = (var6[var11 - 1] + var6[var11 - 2]) * 0.5F;
                                 --var11;
                              }
                           }
                        }
                     }

                     return var11;
                  }
               }
            }
         }
      } catch (RuntimeException var42) {
         throw tm.aw(var42, "jq.ap(" + ')');
      }
   }

   static void as(float[] var0, int var1) {
      try {
         var0[1] = 1.0F - var0[1];
         if (var0[0] < 0.0F) {
            if (var1 >= 14518062) {
               throw new IllegalStateException();
            }

            var0[0] = 0.0F;
         }

         if (var0[1] < 0.0F) {
            if (var1 >= 14518062) {
               return;
            }

            var0[1] = 0.0F;
         }

         label40: {
            if (!(var0[0] > 1.0F)) {
               if (!(var0[1] > 1.0F)) {
                  break label40;
               }

               if (var1 >= 14518062) {
                  throw new IllegalStateException();
               }
            }

            float var2 = var0[0] * (var0[1] + (var0[0] - 2.0F)) + var0[1] * (var0[1] - 2.0F) + 1.0F;
            if (var2 + fj.aj > 0.0F) {
               if (var1 >= 14518062) {
                  throw new IllegalStateException();
               }

               ac.ay(var0, 1542623997);
            }
         }

         var0[1] = 1.0F - var0[1];
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "jq.as(" + ')');
      }
   }
}
