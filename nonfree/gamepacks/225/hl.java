import java.util.Arrays;

public class hl extends tr {
   public static final int bn = 33;
   public static ml ae = new ml(64);
   public int ax;
   public int am;
   public static po ac;
   static final int[] aq = new int[32];
   static ek ar;
   static final int ab = 4;
   public int ag;
   static final int ah = 2;

   void ag(vf var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            if (var3 >= 890593256) {
               throw new IllegalStateException();
            }

            this.ag = var1.ct(-1507999591) * 248654955;
            this.am = var1.cv(952452697) * -1977677081;
            this.ax = var1.cv(952452697) * 186421323;
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "hl.ag(" + ')');
      }
   }

   public static void af() {
      ae.am();
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         aq[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public static void ax(po var0) {
      ac = var0;
   }

   public static void aq() {
      ae.am();
   }

   public void ae(vf var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cv(952452697);
            if (0 == var3) {
               return;
            }

            this.ag(var1, var3, -193468728);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "hl.ae(" + ')');
      }
   }

   public static void ao(int var0) {
      try {
         if.at.am();
         if.au.am();
         if.ar.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "hl.ao(" + ')');
      }
   }

   static void ks(dd var0, int var1) {
      try {
         int var2 = var0.ax * 754660757 / 8;
         int var3 = -1090907831 * var0.aq / 8;
         boolean var4 = false;
         kx.ka(false, -2096039582);
         var4 = true;

         int var5;
         for(var5 = 0; var5 < al.jh.length; ++var5) {
            if (var1 <= 1925815437) {
               throw new IllegalStateException();
            }

            if (-1 != ex.jp[var5]) {
               if (var1 <= 1925815437) {
                  throw new IllegalStateException();
               }

               if (null == al.jh[var5]) {
                  al.jh[var5] = qy.ff.bt(ex.jp[var5], 0, (byte)62);
                  if (al.jh[var5] == null) {
                     if (var1 <= 1925815437) {
                        throw new IllegalStateException();
                     }

                     var4 = false;
                  }
               }
            }

            if (-1 != rd.ji[var5]) {
               if (var1 <= 1925815437) {
                  throw new IllegalStateException();
               }

               if (ey.ja[var5] == null) {
                  if (var1 <= 1925815437) {
                     throw new IllegalStateException();
                  }

                  ey.ja[var5] = qy.ff.bq(rd.ji[var5], 0, cb.jg[var5], 716728030);
                  if (ey.ja[var5] == null) {
                     var4 = false;
                  }
               }
            }
         }

         if (var4) {
            kx.ka(false, -1577178279);
            var4 = true;

            for(var5 = 0; var5 < al.jh.length; ++var5) {
               if (var1 <= 1925815437) {
                  return;
               }

               byte[] var6 = ey.ja[var5];
               if (var6 != null) {
                  if (var1 <= 1925815437) {
                     throw new IllegalStateException();
                  }

                  byte var7 = 10;
                  byte var8 = 10;
                  var4 &= iq.at(var6, var7, var8, 1821169748);
               }
            }

            if (!var4) {
               if (var1 <= 1925815437) {
                  throw new IllegalStateException();
               }
            } else {
               int var19;
               for(var5 = 0; var5 < 4; ++var5) {
                  if (var1 <= 1925815437) {
                     throw new IllegalStateException();
                  }

                  for(var19 = 0; var19 < var0.al[var5].length; ++var19) {
                     Arrays.fill(var0.al[var5][var19], (byte)0);
                  }
               }

               pj.ip(814269094);
               eh.ac(-2092814920);
               ce.ac(-975128583);
               kx.ka(true, -2017503120);

               int var9;
               int var10;
               int var11;
               int var12;
               int var13;
               int var14;
               int var20;
               for(var5 = 0; var5 < 4; ++var5) {
                  if (var1 <= 1925815437) {
                     return;
                  }

                  pj.ip(814269094);

                  for(var19 = 0; var19 < var2; ++var19) {
                     if (var1 <= 1925815437) {
                        throw new IllegalStateException();
                     }

                     for(var20 = 0; var20 < var3; ++var20) {
                        if (var1 <= 1925815437) {
                           throw new IllegalStateException();
                        }

                        boolean var21 = false;
                        var9 = client.jn[var5][var19][var20];
                        if (-1 != var9) {
                           if (var1 <= 1925815437) {
                              throw new IllegalStateException();
                           }

                           var10 = var9 >> 24 & 3;
                           var11 = var9 >> 1 & 3;
                           var12 = var9 >> 14 & 1023;
                           var13 = var9 >> 3 & 2047;
                           var14 = var13 / 8 + (var12 / 8 << 8);

                           for(int var15 = 0; var15 < fq.jo.length; ++var15) {
                              if (var1 <= 1925815437) {
                                 return;
                              }

                              if (fq.jo[var15] == var14 && al.jh[var15] != null) {
                                 if (var1 <= 1925815437) {
                                    throw new IllegalStateException();
                                 }

                                 int var16 = (var12 - var19) * 8;
                                 int var17 = (var13 - var20) * 8;
                                 ll.ax(var0, al.jh[var15], var5, var19 * 8, var20 * 8, var10, (var12 & 7) * 8, 8 * (var13 & 7), var11, var16, var17, (byte)80);
                                 var21 = true;
                                 break;
                              }
                           }
                        }

                        if (!var21) {
                           if (var1 <= 1925815437) {
                              throw new IllegalStateException();
                           }

                           du.aq(var0.ar, var5, 8 * var19, var20 * 8, 2013358759);
                        }
                     }
                  }
               }

               for(var5 = 0; var5 < 13; ++var5) {
                  if (var1 <= 1925815437) {
                     throw new IllegalStateException();
                  }

                  for(var19 = 0; var19 < 13; ++var19) {
                     if (var1 <= 1925815437) {
                        return;
                     }

                     var20 = client.jn[0][var5][var19];
                     if (-1 == var20) {
                        if (var1 <= 1925815437) {
                           throw new IllegalStateException();
                        }

                        lr.ag(var0, 8 * var5, 8 * var19, 8, 8, 1984378844);
                     }
                  }
               }

               kx.ka(true, -1804283728);

               for(var5 = 0; var5 < 4; ++var5) {
                  if (var1 <= 1925815437) {
                     throw new IllegalStateException();
                  }

                  pj.ip(814269094);

                  for(var19 = 0; var19 < var2; ++var19) {
                     for(var20 = 0; var20 < var3; ++var20) {
                        if (var1 <= 1925815437) {
                           throw new IllegalStateException();
                        }

                        int var22 = client.jn[var5][var19][var20];
                        if (var22 != -1) {
                           if (var1 <= 1925815437) {
                              return;
                           }

                           var9 = var22 >> 24 & 3;
                           var10 = var22 >> 1 & 3;
                           var11 = var22 >> 14 & 1023;
                           var12 = var22 >> 3 & 2047;
                           var13 = (var11 / 8 << 8) + var12 / 8;

                           for(var14 = 0; var14 < fq.jo.length; ++var14) {
                              if (var1 <= 1925815437) {
                                 throw new IllegalStateException();
                              }

                              if (fq.jo[var14] == var13) {
                                 if (var1 <= 1925815437) {
                                    return;
                                 }

                                 if (null != ey.ja[var14]) {
                                    if (var1 <= 1925815437) {
                                       throw new IllegalStateException();
                                    }

                                    db.ar(var0, ey.ja[var14], var5, 8 * var19, var20 * 8, var9, 8 * (var11 & 7), 8 * (var12 & 7), var10);
                                    break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               kx.ka(true, -1630859456);
               pj.ip(814269094);
               bw.ad(var0, -1572171580);
               kx.ka(true, -1693004613);
               id.ax.am();
               pj.ip(814269094);
               ex.ae(-243702120);
               client.dv = false;
            }
         }
      } catch (RuntimeException var18) {
         throw vk.ae(var18, "hl.ks(" + ')');
      }
   }
}
