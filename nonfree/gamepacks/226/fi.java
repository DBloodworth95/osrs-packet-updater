public class fi extends fq {
   int ap;
   int aj;
   int aw;
   int ak;
   // $FF: synthetic field
   final fz this$0;
   static final int rp = 7680;

   void ai(gy var1) {
      var1.az(this.ap * -1598109083, -1883879947 * this.aj, this.aw * 1054887253, this.ak * -883988327, (byte)109);
   }

   static int aw(int var0, int var1, int var2) {
      try {
         dk var3 = (dk)dk.ap.ap((long)var0);
         if (var3 == null) {
            return 0;
         } else {
            if (var1 >= 0) {
               if (var1 < var3.ak.length) {
                  return var3.ak[var1];
               }

               if (var2 != 295471145) {
                  throw new IllegalStateException();
               }
            }

            return 0;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "fi.aw(" + ')');
      }
   }

   void aw(gy var1, int var2) {
      try {
         var1.az(this.ap * -1598109083, -1883879947 * this.aj, this.aw * 1054887253, this.ak * -883988327, (byte)91);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fi.aw(" + ')');
      }
   }

   void ap(vl var1, int var2) {
      try {
         this.ap = var1.ch(1203709469) * 244701037;
         this.aj = var1.ch(1203709469) * -1330479523;
         this.aw = var1.cy((short)-1536) * 1398622205;
         this.ak = var1.cy((short)-20471) * 876374953;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fi.ap(" + ')');
      }
   }

   void aj(vl var1) {
      this.ap = var1.ch(1203709469) * 244701037;
      this.aj = var1.ch(1203709469) * -1330479523;
      this.aw = var1.cy((short)-17717) * 1398622205;
      this.ak = var1.cy((short)-13197) * 876374953;
   }

   fi(fz var1) {
      try {
         this.this$0 = var1;
         super();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fi.<init>(" + ')');
      }
   }

   void ay(gy var1) {
      var1.az(this.ap * 1535038128, 545528859 * this.aj, this.aw * 1054887253, this.ak * -1867278944, (byte)86);
   }

   static void ou(int var0) {
      try {
         if (1 == -870579019 * client.lh) {
            if (var0 == -724634854) {
               return;
            }

            client.lx = true;
         }

      } catch (RuntimeException var1) {
         throw tm.aw(var1, "fi.ou(" + ')');
      }
   }

   void ak(vl var1) {
      this.ap = var1.ch(1203709469) * 244701037;
      this.aj = var1.ch(1203709469) * -1330479523;
      this.aw = var1.cy((short)-23869) * 1398622205;
      this.ak = var1.cy((short)-8210) * 876374953;
   }

   static int ai(int var0, da var1, boolean var2, byte var3) {
      try {
         int var4;
         int var5;
         ng var7;
         if (100 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               dp.am -= -57961013;
               var4 = cm.ae[dp.am * -158156887];
               var5 = cm.ae[1 + -158156887 * dp.am];
               int var14 = cm.ae[dp.am * -158156887 + 2];
               if (var5 == 0) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException();
                  }
               } else {
                  var7 = qk.ek.ap(var4, 1816109503);
                  if (null == var7.gu) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     var7.gu = new ng[var14 + 1];
                  }

                  if (var7.gu.length <= var14) {
                     ng[] var15 = new ng[1 + var14];

                     for(int var17 = 0; var17 < var7.gu.length; ++var17) {
                        var15[var17] = var7.gu[var17];
                     }

                     var7.gu = var15;
                  }

                  if (var14 > 0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     if (null == var7.gu[var14 - 1]) {
                        throw new RuntimeException("" + (var14 - 1));
                     }
                  }

                  ng var16 = new ng();
                  var16.bk = -12450247 * var5;
                  var16.bi = (var16.bj = var7.bj * 1) * -1044073689;
                  var16.bv = var14 * 49012999;
                  var16.bh = true;
                  if (12 == var5) {
                     lw.cl(var16, -1334786950);
                  }

                  var7.gu[var14] = var16;
                  if (var2) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     vx.ar = var16;
                  } else {
                     ac.af = var16;
                  }

                  ek.mp(var7, 1677241623);
                  return 1;
               }
            }
         } else {
            ng var12;
            if (101 == var0) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  var12 = var2 ? vx.ar : ac.af;
                  ng var13 = qk.ek.ap(-1736739607 * var12.bj, 1858693104);
                  var13.gu[var12.bv * 597146807] = null;
                  ek.mp(var13, 1887456171);
                  return 1;
               }
            } else if (102 == var0) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  var12 = qk.ek.ap(cm.ae[(dp.am -= -1450976103) * -158156887], -2031541312);
                  var12.gu = null;
                  ek.mp(var12, 1892878569);
                  return 1;
               }
            } else {
               ng var6;
               if (var0 == 105) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= 1393015090;
                     var4 = cm.ae[dp.am * -158156887];
                     var5 = cm.ae[1 + dp.am * -158156887];
                     var6 = qk.ek.ap(var4, 62168150);
                     var7 = qk.ek.aw(var4, var5, (byte)-34);
                     if (var6 == null) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        } else {
                           throw new RuntimeException("");
                        }
                     } else if (var5 < 0) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        } else {
                           throw new RuntimeException("");
                        }
                     } else if (var7 == null) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        } else {
                           throw new RuntimeException("");
                        }
                     } else if (var6.gu == null) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        } else {
                           throw new RuntimeException("");
                        }
                     } else {
                        int var8 = var6.gu.length;
                        ng[] var9 = new ng[var8 + 1];
                        System.arraycopy(var6.gu, 0, var9, 0, var6.gu.length);
                        var6.gu = var9;
                        ng var10 = new ng(var7, var8);
                        if (-1973680119 * var7.bk == 12) {
                           lw.cl(var10, -2007030246);
                        }

                        var6.gu[var8] = var10;
                        if (var2) {
                           vx.ar = var10;
                        } else {
                           ac.af = var10;
                        }

                        ek.mp(var6, 2109381037);
                        return 1;
                     }
                  }
               } else if (200 != var0) {
                  if (201 == var0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     } else {
                        var12 = qk.ek.ap(cm.ae[(dp.am -= -1450976103) * -158156887], -884687943);
                        if (var12 != null) {
                           if (var3 != 0) {
                              throw new IllegalStateException();
                           }

                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 1;
                           if (var2) {
                              if (var3 != 0) {
                                 throw new IllegalStateException();
                              }

                              vx.ar = var12;
                           } else {
                              ac.af = var12;
                           }
                        } else {
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               } else {
                  dp.am -= 1393015090;
                  var4 = cm.ae[dp.am * -158156887];
                  var5 = cm.ae[1 + -158156887 * dp.am];
                  var6 = qk.ek.aw(var4, var5, (byte)-49);
                  if (var6 != null) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     if (var5 != -1) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        }

                        cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 1;
                        if (var2) {
                           vx.ar = var6;
                        } else {
                           ac.af = var6;
                        }

                        return 1;
                     }
                  }

                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                  return 1;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "fi.ai(" + ')');
      }
   }
}
