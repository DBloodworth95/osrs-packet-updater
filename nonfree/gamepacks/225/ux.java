public class ux implements ps {
   public final int am;
   public static final ux ag = new ux(1, 2, String.class, new ur());
   public static final ux ac = new ux(2, 0, Integer.class, new uc());
   public static final ux ae = new ux(0, 1, Long.class, new uo());
   public final int ax;
   public final Class aq;
   final ut af;
   static final int ab = 12;
   static final int bx = 1076101504;
   static final int at = 6;
   static final int az = 10;

   static final void af(dd var0, vf var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         int[][][] var9 = var0.ar;
         byte[][][] var10 = var0.al;
         int var11;
         if (var2 >= 0 && var2 < 4) {
            if (var8 <= -804498304) {
               throw new IllegalStateException();
            }

            if (var3 >= 0) {
               if (var8 <= -804498304) {
                  throw new IllegalStateException();
               }

               if (var3 < var9[0].length - 1) {
                  if (var8 <= -804498304) {
                     throw new IllegalStateException();
                  }

                  if (var4 >= 0) {
                     if (var8 <= -804498304) {
                        throw new IllegalStateException();
                     }

                     if (var4 < var9[0][0].length - 1) {
                        if (var8 <= -804498304) {
                           throw new IllegalStateException();
                        }

                        var10[var2][var3][var4] = 0;

                        while(true) {
                           var11 = var1.ct(-2069273457);
                           if (var11 == 0) {
                              if (var8 <= -804498304) {
                                 throw new IllegalStateException();
                              }

                              if (0 == var2) {
                                 if (var8 <= -804498304) {
                                    throw new IllegalStateException();
                                 }

                                 int[] var19 = var9[0][var3];
                                 int var15 = var5 + 932731;
                                 int var16 = 556238 + var6;
                                 int var17 = eh.ah(var15 + '넵', 91923 + var16, 4, 581694528) - 128 + (eh.ah(var15 + 10294, '鎽' + var16, 2, 1535098685) - 128 >> 1) + (eh.ah(var15, var16, 1, 1746660060) - 128 >> 2);
                                 var17 = 35 + (int)((double)var17 * 0.3D);
                                 if (var17 < 10) {
                                    if (var8 <= -804498304) {
                                       throw new IllegalStateException();
                                    }

                                    var17 = 10;
                                 } else if (var17 > 60) {
                                    var17 = 60;
                                 }

                                 var19[var4] = 8 * -var17;
                              } else {
                                 var9[var2][var3][var4] = var9[var2 - 1][var3][var4] - 240;
                              }

                              return;
                           }

                           if (1 == var11) {
                              int var12 = var1.cv(952452697);
                              if (1 == var12) {
                                 if (var8 <= -804498304) {
                                    throw new IllegalStateException();
                                 }

                                 var12 = 0;
                              }

                              if (var2 == 0) {
                                 if (var8 <= -804498304) {
                                    throw new IllegalStateException();
                                 }

                                 var9[0][var3][var4] = 8 * -var12;
                              } else {
                                 var9[var2][var3][var4] = var9[var2 - 1][var3][var4] - var12 * 8;
                              }

                              return;
                           }

                           if (var11 <= 49) {
                              if (var8 <= -804498304) {
                                 return;
                              }

                              oe.ag[var2][var3][var4] = (short)var1.cq(-1073564475);
                              vj.am[var2][var3][var4] = (byte)((var11 - 2) / 4);
                              db.ax[var2][var3][var4] = (byte)(var11 - 2 + var7 & 3);
                           } else if (var11 <= 81) {
                              if (var8 <= -804498304) {
                                 throw new IllegalStateException();
                              }

                              var10[var2][var3][var4] = (byte)(var11 - 49);
                           } else {
                              rl.ae[var2][var3][var4] = (short)(var11 - 81);
                           }
                        }
                     }
                  }
               }
            }
         }

         while(true) {
            var11 = var1.ct(-1469747793);
            if (0 == var11) {
               break;
            }

            if (var11 == 1) {
               var1.cv(952452697);
               break;
            }

            if (var11 <= 49) {
               var1.cq(-854622441);
            }
         }

      } catch (RuntimeException var18) {
         throw vk.ae(var18, "ux.af(" + ')');
      }
   }

   public static ux aq(Class var0, int var1) {
      try {
         ux[] var2 = ax(2048758935);

         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var1 == 945441671) {
               throw new IllegalStateException();
            }

            ux var4 = var2[var3];
            if (var4.aq == var0) {
               if (var1 == 945441671) {
                  throw new IllegalStateException();
               }

               return var4;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ux.aq(" + ')');
      }
   }

   public static void af(Object var0, vf var1, int var2) {
      try {
         Class var4 = var0.getClass();
         ux var5 = aq(var4, -2043430973);
         if (var5 == null) {
            if (var2 == -729898229) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            ut var3 = var5.af;
            var3.ac(var0, var1, (byte)51);
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ux.af(" + ')');
      }
   }

   public int ac(int var1) {
      try {
         return -266704093 * this.ax;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ux.ac(" + ')');
      }
   }

   public Object at(vf var1, int var2) {
      try {
         return this.af.ae(var1, 173380129);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ux.at(" + ')');
      }
   }

   public static void ap(Object var0, vf var1) {
      Class var3 = var0.getClass();
      ux var4 = aq(var3, -303976829);
      if (var4 == null) {
         throw new IllegalArgumentException();
      } else {
         ut var2 = var4.af;
         var2.ac(var0, var1, (byte)48);
      }
   }

   public int ae() {
      return -266704093 * this.ax;
   }

   public int ag() {
      return -266704093 * this.ax;
   }

   public int am() {
      return -505167594 * this.ax;
   }

   public static ux[] au() {
      return new ux[]{ae, ac, ag};
   }

   public static ux[] ar() {
      return new ux[]{ae, ac, ag};
   }

   public static ux al(Class var0) {
      ux[] var1 = ax(1140519103);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         ux var3 = var1[var2];
         if (var3.aq == var0) {
            return var3;
         }
      }

      return null;
   }

   public static ux ad(Class var0) {
      ux[] var1 = ax(1015134925);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         ux var3 = var1[var2];
         if (var3.aq == var0) {
            return var3;
         }
      }

      return null;
   }

   public static void ag(int var0, byte var1) {
      try {
         ax = -519197001 * var0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ux.ag(" + ')');
      }
   }

   static final void nc(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         il.kh[0].ag(var0, var1);
         il.kh[1].ag(var0, var3 + var1 - 16);
         vr.fr(var0, var1 + 16, 16, var3 - 32, -925961083 * client.kx);
         int var6 = var3 * (var3 - 32) / var4;
         if (var6 < 8) {
            if (var5 >= 0) {
               throw new IllegalStateException();
            }

            var6 = 8;
         }

         int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
         vr.fr(var0, var7 + var1 + 16, 16, var6, client.ka * 102650921);
         vr.fo(var0, 16 + var1 + var7, var6, client.ks * 1202215799);
         vr.fo(1 + var0, 16 + var1 + var7, var6, 1202215799 * client.ks);
         vr.fn(var0, var7 + var1 + 16, 16, client.ks * 1202215799);
         vr.fn(var0, var1 + 17 + var7, 16, client.ks * 1202215799);
         vr.fo(15 + var0, 16 + var1 + var7, var6, client.kf * -913688389);
         vr.fo(14 + var0, var1 + 17 + var7, var6 - 1, -913688389 * client.kf);
         vr.fn(var0, 15 + var1 + var7 + var6, 16, -913688389 * client.kf);
         vr.fn(var0 + 1, var6 + 14 + var1 + var7, 15, -913688389 * client.kf);
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ux.nc(" + ')');
      }
   }

   public Object aa(vf var1) {
      return this.af.ae(var1, 173380129);
   }

   public Object az(vf var1) {
      return this.af.ae(var1, 173380129);
   }

   public static ux[] ax(int var0) {
      try {
         return new ux[]{ae, ac, ag};
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ux.ax(" + ')');
      }
   }

   static long is(byte var0) {
      try {
         return -1783228074382635555L * client.mw;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ux.is(" + ')');
      }
   }

   static final void lp(int var0, int var1, int var2, int var3) {
      try {
         eo.lc(gs.jj, var0, var1, var2, 1677644046);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ux.lp(" + ')');
      }
   }

   public static void pz(int var0, int var1, int var2, boolean var3, byte var4) {
      try {
         mq var5 = fs.ac(mz.bs, client.ia.ax, (byte)-30);
         va var10000 = var5.ag;
         int var10001;
         if (var3) {
            if (var4 >= 4) {
               throw new IllegalStateException();
            }

            var10001 = 1992677881 * client.lm;
         } else {
            var10001 = 0;
         }

         var10000.eo(var10001, 2033815900);
         var5.ag.dh(var2, 1039028824);
         var5.ag.ds(var0, 1413397581);
         var5.ag.ds(var1, -411482830);
         client.ia.ag(var5, -1414945096);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ux.pz(" + ')');
      }
   }

   public static void ab(Object var0, vf var1) {
      Class var3 = var0.getClass();
      ux var4 = aq(var3, 1469000516);
      if (var4 == null) {
         throw new IllegalArgumentException();
      } else {
         ut var2 = var4.af;
         var2.ac(var0, var1, (byte)112);
      }
   }

   static final boolean ac(int var0, int var1) {
      try {
         boolean var10000;
         label46: {
            if (var0 != 14) {
               if (var1 <= 82836308) {
                  throw new IllegalStateException();
               }

               if (var0 != 15) {
                  if (var1 <= 82836308) {
                     throw new IllegalStateException();
                  }

                  if (var0 < 44) {
                     break label46;
                  }

                  if (var1 <= 82836308) {
                     throw new IllegalStateException();
                  }

                  if (var0 > 51) {
                     break label46;
                  }

                  if (var1 <= 82836308) {
                     throw new IllegalStateException();
                  }
               }
            }

            var10000 = true;
            return var10000;
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ux.ac(" + ')');
      }
   }

   public static ux ah(Class var0) {
      ux[] var1 = ax(-724476925);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         ux var3 = var1[var2];
         if (var3.aq == var0) {
            return var3;
         }
      }

      return null;
   }

   static final int mn(byte var0) {
      try {
         return 2098117423 * client.nn.ae - 1;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ux.mn(" + ')');
      }
   }

   ux(int var1, int var2, Class var3, ut var4) {
      try {
         super();
         this.am = var1 * 2005729171;
         this.ax = 1632640139 * var2;
         this.aq = var3;
         this.af = var4;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ux.<init>(" + ')');
      }
   }
}
