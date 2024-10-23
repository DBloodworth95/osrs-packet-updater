public class cj {
   static final int cn = 68;
   static final int ae = 7;
   int ax;
   static final int ac = 14;
   int[][] aq;
   static final int ab = 7;
   int am;
   static final int nb = 8;
   static final int tl = 1536;

   static int ap(int var0, dt var1, boolean var2, int var3) {
      try {
         ny var10000;
         if (var2) {
            if (var3 >= 550578868) {
               throw new IllegalStateException();
            }

            var10000 = cs.ab;
         } else {
            var10000 = ry.ap;
         }

         ny var4 = var10000;
         if (var0 == 1500) {
            if (var3 >= 550578868) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.bl * 1930080551;
               return 1;
            }
         } else if (1501 == var0) {
            cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.bz * 688753001;
            return 1;
         } else if (1502 == var0) {
            if (var3 >= 550578868) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.bu * -1339552805;
               return 1;
            }
         } else if (var0 == 1503) {
            if (var3 >= 550578868) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.br * 1036386215;
               return 1;
            }
         } else if (var0 == 1504) {
            if (var3 >= 550578868) {
               throw new IllegalStateException();
            } else {
               int[] var6 = cs.at;
               int var10001 = (mp.au += -1856457959) * 844691753 - 1;
               byte var10002;
               if (var4.bq) {
                  if (var3 >= 550578868) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var6[var10001] = var10002;
               return 1;
            }
         } else if (var0 == 1505) {
            if (var3 >= 550578868) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1678119623 * var4.bt;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "cj.ap(" + ')');
      }
   }

   byte[] ax(byte[] var1) {
      if (null != this.aq) {
         int var2 = 14 + (int)((long)(this.ax * -1843473643) * (long)var1.length / (long)(this.am * -442594109));
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.aq[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var9 + var4] += var7 * var8[var9];
            }

            var5 += -1843473643 * this.ax;
            var9 = var5 / (this.am * -442594109);
            var4 += var9;
            var5 -= -442594109 * this.am * var9;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = '耀' + var3[var6] >> 16;
            if (var10 < -128) {
               var1[var6] = -128;
            } else if (var10 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   int ad(int var1) {
      if (this.aq != null) {
         var1 = (int)((long)(this.ax * -470929795) * (long)var1 / (long)(-613119538 * this.am)) + 6;
      }

      return var1;
   }

   int ag(int var1, int var2) {
      try {
         if (this.aq != null) {
            if (var2 != 1670289500) {
               throw new IllegalStateException();
            }

            var1 = (int)((long)(this.ax * -1843473643) * (long)var1 / (long)(-442594109 * this.am)) + 6;
         }

         return var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "cj.ag(" + ')');
      }
   }

   byte[] am(byte[] var1) {
      if (null != this.aq) {
         int var2 = 14 + (int)((long)(this.ax * -1932652968) * (long)var1.length / (long)(this.am * 1563820497));
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.aq[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var9 + var4] += var7 * var8[var9];
            }

            var5 += -2044291938 * this.ax;
            var9 = var5 / (this.am * -442594109);
            var4 += var9;
            var5 -= -442594109 * this.am * var9;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = -979713606 + var3[var6] >> 16;
            if (var10 < 1831750464) {
               var1[var6] = -128;
            } else if (var10 > 127) {
               var1[var6] = (byte)1403749656;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   public cj(int var1, int var2) {
      try {
         super();
         if (var2 != var1) {
            int var4 = var1;
            int var5 = var2;
            if (var2 > var1) {
               var4 = var2;
               var5 = var1;
            }

            while(0 != var5) {
               int var6 = var4 % var5;
               var4 = var5;
               var5 = var6;
            }

            var1 /= var4;
            var2 /= var4;
            this.am = 1913619435 * var1;
            this.ax = var2 * -28974019;
            this.aq = new int[var1][14];

            for(int var7 = 0; var7 < var1; ++var7) {
               int[] var8 = this.aq[var7];
               double var9 = (double)var7 / (double)var1 + 6.0D;
               int var11 = (int)Math.floor(var9 - 7.0D + 1.0D);
               if (var11 < 0) {
                  var11 = 0;
               }

               int var12 = (int)Math.ceil(7.0D + var9);
               if (var12 > 14) {
                  var12 = 14;
               }

               for(double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
                  double var15 = 3.141592653589793D * ((double)var11 - var9);
                  double var17 = var13;
                  if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
                     var17 = var13 * (Math.sin(var15) / var15);
                  }

                  var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9));
                  var8[var11] = (int)Math.floor(0.5D + 65536.0D * var17);
               }
            }

         }
      } catch (RuntimeException var19) {
         throw vk.ae(var19, "cj.<init>(" + ')');
      }
   }

   byte[] aq(byte[] var1) {
      if (null != this.aq) {
         int var2 = 14 + (int)((long)(this.ax * -1843473643) * (long)var1.length / (long)(this.am * -442594109));
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.aq[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var9 + var4] += var7 * var8[var9];
            }

            var5 += -1843473643 * this.ax;
            var9 = var5 / (this.am * -442594109);
            var4 += var9;
            var5 -= -442594109 * this.am * var9;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = '耀' + var3[var6] >> 16;
            if (var10 < -128) {
               var1[var6] = -128;
            } else if (var10 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   int af(int var1) {
      if (this.aq != null) {
         var1 = (int)((long)(this.ax * -1843473643) * (long)var1 / (long)(this.am * -442594109));
      }

      return var1;
   }

   int at(int var1) {
      if (this.aq != null) {
         var1 = (int)((long)(this.ax * 75882234) * (long)var1 / (long)(this.am * -442594109));
      }

      return var1;
   }

   int au(int var1) {
      if (this.aq != null) {
         var1 = (int)((long)(this.ax * -757964399) * (long)var1 / (long)(this.am * -442594109));
      }

      return var1;
   }

   int ar(int var1) {
      if (this.aq != null) {
         var1 = (int)((long)(this.ax * -1843473643) * (long)var1 / (long)(-442594109 * this.am)) + 6;
      }

      return var1;
   }

   byte[] ac(byte[] var1, int var2) {
      try {
         if (null != this.aq) {
            int var3 = 14 + (int)((long)(this.ax * -1843473643) * (long)var1.length / (long)(this.am * -442594109));
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;

            int var7;
            for(var7 = 0; var7 < var1.length; ++var7) {
               if (var2 >= 1638304523) {
                  throw new IllegalStateException();
               }

               byte var8 = var1[var7];
               int[] var9 = this.aq[var6];

               int var10;
               for(var10 = 0; var10 < 14; ++var10) {
                  if (var2 >= 1638304523) {
                     throw new IllegalStateException();
                  }

                  var4[var10 + var5] += var8 * var9[var10];
               }

               var6 += -1843473643 * this.ax;
               var10 = var6 / (this.am * -442594109);
               var5 += var10;
               var6 -= -442594109 * this.am * var10;
            }

            var1 = new byte[var3];

            for(var7 = 0; var7 < var3; ++var7) {
               if (var2 >= 1638304523) {
                  throw new IllegalStateException();
               }

               int var12 = '耀' + var4[var7] >> 16;
               if (var12 < -128) {
                  if (var2 >= 1638304523) {
                     throw new IllegalStateException();
                  }

                  var1[var7] = -128;
               } else if (var12 > 127) {
                  if (var2 >= 1638304523) {
                     throw new IllegalStateException();
                  }

                  var1[var7] = 127;
               } else {
                  var1[var7] = (byte)var12;
               }
            }
         }

         return var1;
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "cj.ac(" + ')');
      }
   }

   int al(int var1) {
      if (this.aq != null) {
         var1 = (int)((long)(this.ax * -1843473643) * (long)var1 / (long)(-442594109 * this.am)) + 6;
      }

      return var1;
   }

   static final void ob(int var0) {
      try {
         client.qf = 158525509 * client.pf;
         af.sw = true;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "cj.ob(" + ')');
      }
   }

   int ae(int var1, int var2) {
      try {
         if (this.aq != null) {
            if (var2 == 757872459) {
               throw new IllegalStateException();
            }

            var1 = (int)((long)(this.ax * -1843473643) * (long)var1 / (long)(this.am * -442594109));
         }

         return var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "cj.ae(" + ')');
      }
   }

   static void js(dd var0, int var1, boolean var2, short var3) {
      try {
         di var4 = var0.ad[var1];
         if (var4 != null) {
            if (var3 >= 4032) {
               return;
            }

            if (var4.bx(236444332)) {
               if (var3 >= 4032) {
                  throw new IllegalStateException();
               }

               if (!var4.aj) {
                  if (var3 >= 4032) {
                     throw new IllegalStateException();
                  }

                  int var5;
                  label120: {
                     label131: {
                        var5 = var4.av * 1019353099;
                        var4.as = false;
                        if (client.ci) {
                           if (var3 >= 4032) {
                              throw new IllegalStateException();
                           }

                           if (-396152079 * client.jl.at > 50) {
                              break label131;
                           }

                           if (var3 >= 4032) {
                              throw new IllegalStateException();
                           }
                        }

                        if (client.jl.at * -396152079 <= 200) {
                           break label120;
                        }

                        if (var3 >= 4032) {
                           return;
                        }
                     }

                     if (var2) {
                        if (var3 >= 4032) {
                           throw new IllegalStateException();
                        }

                        if (var4.ca * -1002586171 == var4.bj * 26734717) {
                           if (var3 >= 4032) {
                              return;
                           }

                           var4.as = true;
                        }
                     }
                  }

                  int var6 = -1125889549 * var4.bf >> 7;
                  int var7 = -1650600853 * var4.bm >> 7;
                  if (0 <= var6) {
                     if (var3 >= 4032) {
                        return;
                     }

                     if (var6 < 104) {
                        if (var3 >= 4032) {
                           throw new IllegalStateException();
                        }

                        if (0 <= var7) {
                           if (var3 >= 4032) {
                              throw new IllegalStateException();
                           }

                           if (var7 < 104) {
                              if (var3 >= 4032) {
                                 throw new IllegalStateException();
                              }

                              long var8 = kf.ar(0, 0, 0, false, 2036704335 * var4.aw, var0.ac * 1011931441, (byte)36);
                              if (var4.ab != null) {
                                 if (var3 >= 4032) {
                                    return;
                                 }

                                 if (1472813913 * client.do >= var4.ar * 1307930885 && 1472813913 * client.do < var4.al * -1542756869) {
                                    if (var3 >= 4032) {
                                       throw new IllegalStateException();
                                    }

                                    var4.as = false;
                                    var4.au = he.ki(var0, var4.bf * -1125889549, var4.bm * -1650600853, var5, 1364598893) * -1576011305;
                                    var4.ba = -200135019 * client.do;
                                    var0.ae.aa(var5, -1125889549 * var4.bf, -1650600853 * var4.bm, var4.au * -218428953, 60, var4, var4.bs * 898237617, var8, 633273673 * var4.az, var4.aa * 741953663, var4.ai * -1485432659, 564670867 * var4.ao);
                                    return;
                                 }
                              }

                              if ((var4.bf * -1125889549 & 127) == 64 && (var4.bm * -1650600853 & 127) == 64) {
                                 if (var3 >= 4032) {
                                    throw new IllegalStateException();
                                 }

                                 if (var0.au[var6][var7] == 1902076515 * client.mc) {
                                    return;
                                 }

                                 var0.au[var6][var7] = client.mc * 1902076515;
                              }

                              var4.au = he.ki(var0, var4.bf * -1125889549, var4.bm * -1650600853, var5, 1364598893) * -1576011305;
                              var4.ba = client.do * -200135019;
                              var0.ae.az(var5, var4.bf * -1125889549, -1650600853 * var4.bm, -218428953 * var4.au, 60, var4, 898237617 * var4.bs, var8, var4.an);
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var10) {
         throw vk.ae(var10, "cj.js(" + ')');
      }
   }

   static int av(int var0, dt var1, boolean var2, int var3) {
      try {
         ny var4;
         if (2700 == var0) {
            var4 = ir.ep.ac(cs.at[(mp.au -= -1856457959) * 844691753], -1341700520);
            cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.gz * 1679475031;
            return 1;
         } else if (var0 == 2701) {
            if (var3 != -221225379) {
               throw new IllegalStateException();
            } else {
               var4 = ir.ep.ac(cs.at[(mp.au -= -1856457959) * 844691753], -1586291162);
               if (var4.gz * 1679475031 != -1) {
                  if (var3 != -221225379) {
                     throw new IllegalStateException();
                  }

                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = 1333335699 * var4.gm;
               } else {
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 2702) {
            if (var3 != -221225379) {
               throw new IllegalStateException();
            } else {
               int var7 = cs.at[(mp.au -= -1856457959) * 844691753];
               dj var5 = (dj)client.ol.ac((long)var7);
               if (var5 != null) {
                  if (var3 != -221225379) {
                     throw new IllegalStateException();
                  }

                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = 1;
               } else {
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
               }

               return 1;
            }
         } else if (2706 == var0) {
            if (var3 != -221225379) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = client.ok * 250910895;
               return 1;
            }
         } else if (var0 == 2707) {
            if (var3 != -221225379) {
               throw new IllegalStateException();
            } else {
               var4 = ir.ep.ac(cs.at[(mp.au -= -1856457959) * 844691753], -1338481734);
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.an(273813282) ? 1 : 0;
               return 1;
            }
         } else if (2708 == var0) {
            var4 = ir.ep.ac(cs.at[(mp.au -= -1856457959) * 844691753], -1498532591);
            return iv.aa(var4, 1980649782);
         } else if (2709 == var0) {
            if (var3 != -221225379) {
               throw new IllegalStateException();
            } else {
               var4 = ir.ep.ac(cs.at[(mp.au -= -1856457959) * 844691753], -1547262502);
               return pm.ai(var4, -1939003577);
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "cj.av(" + ')');
      }
   }
}
