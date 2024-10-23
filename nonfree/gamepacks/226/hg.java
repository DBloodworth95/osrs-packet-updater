public class hg extends tp {
   public static mi aw = new mi(64);
   public static pe ap;
   public int ak;
   public int aj;
   static final int bh = 3;
   static final int[] ay = new int[32];
   public int ai;
   static dn jr;
   static int[] jx;
   static final int bm = 53;
   public static String av;

   void af(vl var1, int var2) {
      if (1 == var2) {
         this.ak = var1.ce(119853018) * -1560713675;
         this.aj = var1.cy((short)-32412) * 1858467247;
         this.ai = var1.cy((short)-2072) * -1808097369;
      }

   }

   void ao(vl var1, int var2) {
      if (1 == var2) {
         this.ak = var1.ce(1737939625) * -1560713675;
         this.aj = var1.cy((short)-9244) * 274580419;
         this.ai = var1.cy((short)-30136) * -1808097369;
      }

   }

   void ak(vl var1, int var2, int var3) {
      try {
         if (1 == var2) {
            if (var3 >= 449300961) {
               throw new IllegalStateException();
            }

            this.ak = var1.ce(1840489143) * -1560713675;
            this.aj = var1.cy((short)-3416) * 1858467247;
            this.ai = var1.cy((short)-28985) * -1808097369;
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "hg.ak(" + ')');
      }
   }

   public static void ai(pe var0) {
      ap = var0;
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         ay[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public static void as(pe var0) {
      ap = var0;
   }

   public static void ae(pe var0) {
      ap = var0;
   }

   public void am(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-12598);
         if (var2 == 0) {
            return;
         }

         this.ak(var1, var2, 4254059);
      }
   }

   public void at(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-13657);
         if (var2 == 0) {
            return;
         }

         this.ak(var1, var2, -1050551924);
      }
   }

   public static void ay(pe var0) {
      ap = var0;
   }

   void an(vl var1, int var2) {
      if (1 == var2) {
         this.ak = var1.ce(231656694) * -1560713675;
         this.aj = var1.cy((short)-18186) * 1858467247;
         this.ai = var1.cy((short)-5109) * -1808097369;
      }

   }

   static void ow(int var0, int var1) {
      try {
         client.lh = -788280931 * var0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "hg.ow(" + ')');
      }
   }

   public static void az() {
      aw.aj();
   }

   void ar(vl var1, int var2) {
      if (1 == var2) {
         this.ak = var1.ce(650139402) * 1922597465;
         this.aj = var1.cy((short)-3023) * 1858467247;
         this.ai = var1.cy((short)-20912) * -1808097369;
      }

   }

   public static void ab() {
      aw.aj();
   }

   public void au(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-12641);
         if (var2 == 0) {
            return;
         }

         this.ak(var1, var2, -1656306209);
      }
   }

   public static void ag() {
      aw.aj();
   }

   static vd pg(int var0, int var1) {
      try {
         vd var2 = (vd)client.wc.ap((long)var0);
         if (var2 == null) {
            var2 = new vd(gd.fe, var0);
         }

         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "hg.pg(" + ')');
      }
   }

   static final void kw(dn var0, dv var1, int var2, int var3, kk var4, int var5) {
      try {
         int var6 = var1.dz[0];
         int var7 = var1.di[0];
         int var8 = var1.al((byte)78);
         ko var9 = var0.ak[var0.aj * 86027145];
         if (var6 >= var8) {
            if (var5 == -262120093) {
               return;
            }

            if (var6 < -243983003 * var9.by - var8 && var7 >= var8) {
               if (var5 == -262120093) {
                  throw new IllegalStateException();
               }

               if (var7 < var9.br * -870096139 - var8) {
                  if (var2 >= var8) {
                     if (var5 == -262120093) {
                        throw new IllegalStateException();
                     }

                     if (var2 < -243983003 * var9.by - var8) {
                        if (var5 == -262120093) {
                           throw new IllegalStateException();
                        }

                        if (var3 >= var8) {
                           if (var5 == -262120093) {
                              throw new IllegalStateException();
                           }

                           if (var3 < var9.br * -870096139 - var8) {
                              int var10 = client.wi.aw(var6, var7, var1.al((byte)40), nm.ks(var2, var3, 2061517924), var9, true, client.xe, client.xg, 1085425138);
                              if (var10 < 1) {
                                 if (var5 == -262120093) {
                                    return;
                                 }

                                 return;
                              }

                              for(int var11 = 0; var11 < var10 - 1; ++var11) {
                                 if (var5 == -262120093) {
                                    return;
                                 }

                                 var1.bh(client.xe[var11], client.xg[var11], var4, (byte)-112);
                              }

                              return;
                           }

                           if (var5 == -262120093) {
                              return;
                           }
                        }
                     }
                  }

                  return;
               }

               if (var5 == -262120093) {
                  throw new IllegalStateException();
               }
            }
         }

      } catch (RuntimeException var12) {
         throw tm.aw(var12, "hg.kw(" + ')');
      }
   }

   static void aj(int var0, int[] var1, int var2, byte var3) {
      try {
         for(int var4 = 0; var4 < 390907811 * hu.ak; ++var4) {
            if (var3 == 1) {
               throw new IllegalStateException();
            }

            hu var6 = (hu)hu.aj.ap((long)var4);
            hu var5;
            if (null != var6) {
               var5 = var6;
            } else if (null == pq.ap) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               var5 = null;
            } else {
               byte[] var7 = pq.ap.bm(3, var4, 1490152747);
               var6 = new hu();
               if (null != var7) {
                  if (var3 == 1) {
                     return;
                  }

                  var6.ak(new vl(var7), 286456945);
               }

               hu.aj.ak(var6, (long)var4);
               var5 = var6;
            }

            if (var5 != null) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               if (!var5.an) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var5.ai(var2, var0, 1402801839)) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     }

                     var1[hx.ap(var2, 1028837680)] = 256 + var4;
                     break;
                  }
               }
            }
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "hg.aj(" + ')');
      }
   }

   public void aw(vl var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cy((short)-24488);
            if (var3 == 0) {
               if (var2 >= -673336012) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ak(var1, var3, -1966667889);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "hg.aw(" + ')');
      }
   }
}
