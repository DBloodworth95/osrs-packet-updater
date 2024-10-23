import java.util.Iterator;

public class cy {
   static final long bx = 4294967295L;
   int ae;
   int ag;
   static of fv;
   static final int cz = -117;
   byte[] ac;
   static int ai;

   int ax() {
      int var1 = this.ac[-734778521 * this.ae] >> this.ag * 68516875 & 1;
      this.ag += 1159833346;
      this.ae += -712458153 * (this.ag * 68516875 >> 3);
      this.ag = (601488529 * this.ag & 7) * -383504477;
      return var1;
   }

   int ac(int var1, int var2) {
      try {
         int var3 = 0;

         int var4;
         int var5;
         for(var4 = 0; var1 >= 8 - this.ag * 68516875; var1 -= var5) {
            if (var2 == -272963847) {
               throw new IllegalStateException();
            }

            var5 = 8 - this.ag * 68516875;
            int var6 = (1 << var5) - 1;
            var3 += (this.ac[this.ae * -734778521] >> 68516875 * this.ag & var6) << var4;
            this.ag = 0;
            this.ae += -712458153;
            var4 += var5;
         }

         if (var1 > 0) {
            if (var2 == -272963847) {
               throw new IllegalStateException();
            }

            var5 = (1 << var1) - 1;
            var3 += (this.ac[this.ae * -734778521] >> this.ag * 68516875 & var5) << var4;
            this.ag += var1 * -383504477;
         }

         return var3;
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "cy.ac(" + ')');
      }
   }

   int ae(int var1) {
      try {
         int var2 = this.ac[-734778521 * this.ae] >> this.ag * 68516875 & 1;
         this.ag += -383504477;
         this.ae += -712458153 * (this.ag * 68516875 >> 3);
         this.ag = (68516875 * this.ag & 7) * -383504477;
         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "cy.ae(" + ')');
      }
   }

   cy() {
      try {
         super();
         this.ac = null;
         this.ae = 0;
         this.ag = 0;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "cy.<init>(" + ')');
      }
   }

   public static void ab(int var0) {
      try {
         Iterator var1 = mm.aq.iterator();

         while(var1.hasNext()) {
            if (var0 != 1870578311) {
               throw new IllegalStateException();
            }

            ns var2 = (ns)var1.next();
            if (var2 == null) {
               if (var0 != 1870578311) {
                  throw new IllegalStateException();
               }
            } else {
               var2.al.ah(-667727505);
               var2.al.ar((byte)2);
               var2.al.ac(0, -1461844016);
               var2.al.bb = 0;
               ok.ag(1710436281 * var2.ae, 1578912913 * var2.ag, -161366658);
            }
         }

         mm.aq.clear();
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "cy.ab(" + ')');
      }
   }

   int af() {
      int var1 = this.ac[-734778521 * this.ae] >> this.ag * 68516875 & 1;
      this.ag += -383504477;
      this.ae += -712458153 * (this.ag * 68516875 >> 3);
      this.ag = (68516875 * this.ag & 7) * -383504477;
      return var1;
   }

   int aq() {
      int var1 = this.ac[-734778521 * this.ae] >> this.ag * 68516875 & 1;
      this.ag += -383504477;
      this.ae += -712458153 * (this.ag * 68516875 >> 3);
      this.ag = (68516875 * this.ag & 7) * -383504477;
      return var1;
   }

   int am(int var1) {
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var1 >= 8 - this.ag * 68516875; var1 -= var4) {
         var4 = 8 - this.ag * 68516875;
         int var5 = (1 << var4) - 1;
         var2 += (this.ac[this.ae * -734778521] >> 68516875 * this.ag & var5) << var3;
         this.ag = 0;
         this.ae += -712458153;
         var3 += var4;
      }

      if (var1 > 0) {
         var4 = (1 << var1) - 1;
         var2 += (this.ac[this.ae * -734778521] >> this.ag * 68516875 & var4) << var3;
         this.ag += var1 * -383504477;
      }

      return var2;
   }

   static int aj(int var0, dt var1, boolean var2, byte var3) {
      try {
         ny var4 = ir.ep.ac(cs.at[(mp.au -= -1856457959) * 844691753], -1549629399);
         if (2600 == var0) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.bk * 699342125;
               return 1;
            }
         } else if (2601 == var0) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.be * 1372468429;
               return 1;
            }
         } else if (2602 == var0) {
            cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4.dh;
            return 1;
         } else if (var0 == 2603) {
            cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.bc * 1096441855;
            return 1;
         } else if (2604 == var0) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = 2090701815 * var4.cn;
               return 1;
            }
         } else if (2605 == var0) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = 5443921 * var4.dl;
               return 1;
            }
         } else if (2606 == var0) {
            cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1523887835 * var4.dv;
            return 1;
         } else if (2607 == var0) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = 993428467 * var4.dk;
               return 1;
            }
         } else if (var0 == 2608) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.dt * -1927853495;
               return 1;
            }
         } else if (2609 == var0) {
            cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.ci * 601293795;
            return 1;
         } else if (var0 == 2610) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.cy * -1462108059;
               return 1;
            }
         } else if (var0 == 2611) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = 925761921 * var4.ch;
               return 1;
            }
         } else if (2612 == var0) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.cf * -670497933;
               return 1;
            }
         } else if (var0 == 2613) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.cx.ac(-350930589);
               return 1;
            }
         } else {
            byte var14;
            int[] var10000;
            int var10001;
            if (2614 == var0) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  var10000 = cs.at;
                  var10001 = (mp.au += -1856457959) * 844691753 - 1;
                  if (var4.dx) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     }

                     var14 = 1;
                  } else {
                     var14 = 0;
                  }

                  var10000[var10001] = var14;
                  return 1;
               }
            } else {
               ng var5;
               int var10002;
               if (2617 == var0) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  }

                  var5 = var4.by((byte)127);
                  var10000 = cs.at;
                  var10001 = (mp.au += -1856457959) * 844691753 - 1;
                  if (var5 != null) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     }

                     var10002 = -477664339 * var5.ac;
                  } else {
                     var10002 = 0;
                  }

                  var10000[var10001] = var10002;
               }

               if (2618 == var0) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var5 = var4.by((byte)127);
                     var10000 = cs.at;
                     var10001 = (mp.au += -1856457959) * 844691753 - 1;
                     if (null != var5) {
                        if (var3 == 1) {
                           throw new IllegalStateException();
                        }

                        var10002 = var5.ae * 1104524011;
                     } else {
                        var10002 = 0;
                     }

                     var10000[var10001] = var10002;
                     return 1;
                  }
               } else {
                  nn var10;
                  String[] var12;
                  String var13;
                  if (var0 == 2619) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bp(-1148851261);
                        var12 = cs.ar;
                        var10001 = (rt.al += -1975882559) * -515103935 - 1;
                        if (var10 != null) {
                           if (var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var13 = var10.be(-2011425237).aq(2049891759);
                        } else {
                           var13 = "";
                        }

                        var12[var10001] = var13;
                        return 1;
                     }
                  } else if (2620 == var0) {
                     var5 = var4.by((byte)127);
                     var10000 = cs.at;
                     var10001 = (mp.au += -1856457959) * 844691753 - 1;
                     if (var5 != null) {
                        if (var3 == 1) {
                           throw new IllegalStateException();
                        }

                        var10002 = 1226715139 * var5.ag;
                     } else {
                        var10002 = 0;
                     }

                     var10000[var10001] = var10002;
                     return 1;
                  } else if (var0 == 2621) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bp(971368744);
                        var10000 = cs.at;
                        var10001 = (mp.au += -1856457959) * 844691753 - 1;
                        if (null != var10) {
                           if (var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.cy(-137846393);
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     }
                  } else if (var0 == 2622) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bp(-72381721);
                        var10000 = cs.at;
                        var10001 = (mp.au += -1856457959) * 844691753 - 1;
                        if (var10 != null) {
                           if (var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.co(-198478463);
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     }
                  } else if (2623 == var0) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bp(1777336230);
                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = null != var10 ? var10.cv(-2087549703) : 0;
                        return 1;
                     }
                  } else if (2624 == var0) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        label422: {
                           var10 = var4.bp(-1785100302);
                           var10000 = cs.at;
                           var10001 = (mp.au += -1856457959) * 844691753 - 1;
                           if (null != var10) {
                              if (var3 == 1) {
                                 throw new IllegalStateException();
                              }

                              if (var10.cn(-1395233286)) {
                                 if (var3 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 var14 = 1;
                                 break label422;
                              }
                           }

                           var14 = 0;
                        }

                        var10000[var10001] = var14;
                        return 1;
                     }
                  } else if (var0 == 2625) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bp(-949223109);
                        var10000 = cs.at;
                        var10001 = (mp.au += -1856457959) * 844691753 - 1;
                        if (null != var10 && var10.ch(1597991474)) {
                           if (var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var14 = 1;
                        } else {
                           var14 = 0;
                        }

                        var10000[var10001] = var14;
                        return 1;
                     }
                  } else if (var0 == 2626) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bp(1731408535);
                        var12 = cs.ar;
                        var10001 = (rt.al += -1975882559) * -515103935 - 1;
                        if (var10 != null) {
                           if (var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var13 = var10.bc((byte)80).ac(-1291242775);
                        } else {
                           var13 = "";
                        }

                        var12[var10001] = var13;
                        return 1;
                     }
                  } else if (var0 == 2627) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bp(340035622);
                        int var11;
                        if (var10 != null) {
                           if (var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var11 = var10.cm((byte)-98);
                        } else {
                           var11 = 0;
                        }

                        int var6 = var11;
                        if (null != var10) {
                           if (var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var11 = var10.cu(-999654352);
                        } else {
                           var11 = 0;
                        }

                        int var7 = var11;
                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = Math.min(var6, var7);
                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = Math.max(var6, var7);
                        return 1;
                     }
                  } else if (2628 == var0) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bp(-1395504508);
                        var10000 = cs.at;
                        var10001 = (mp.au += -1856457959) * 844691753 - 1;
                        if (null != var10) {
                           if (var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.cu(-673626703);
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     }
                  } else if (var0 == 2629) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bp(2133338383);
                        var10000 = cs.at;
                        var10001 = (mp.au += -1856457959) * 844691753 - 1;
                        if (var10 != null) {
                           if (var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.ct((byte)-125);
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     }
                  } else if (var0 == 2630) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bp(-1571398017);
                        var10000 = cs.at;
                        var10001 = (mp.au += -1856457959) * 844691753 - 1;
                        if (null != var10) {
                           if (var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.cg(844606784);
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     }
                  } else if (2631 == var0) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bp(46272665);
                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = var10 != null ? var10.cq(-1424018507) : 0;
                        return 1;
                     }
                  } else if (2632 == var0) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bp(495520876);
                        var10000 = cs.at;
                        var10001 = (mp.au += -1856457959) * 844691753 - 1;
                        if (null != var10) {
                           if (var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.cc(-1464968799);
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     }
                  } else {
                     bh var9;
                     if (var0 == 2633) {
                        if (var3 == 1) {
                           throw new IllegalStateException();
                        } else {
                           var9 = var4.bb(-648136124);
                           var10000 = cs.at;
                           var10001 = 844691753 * mp.au - 1;
                           if (null != var9) {
                              if (var3 == 1) {
                                 throw new IllegalStateException();
                              }

                              var10002 = var9.ag(cs.at[mp.au * 844691753 - 1], -2138005081);
                           } else {
                              var10002 = 0;
                           }

                           var10000[var10001] = var10002;
                           return 1;
                        }
                     } else if (var0 == 2634) {
                        if (var3 == 1) {
                           throw new IllegalStateException();
                        } else {
                           var9 = var4.bb(-1761056250);
                           var10000 = cs.at;
                           var10001 = 844691753 * mp.au - 1;
                           if (var9 != null) {
                              if (var3 == 1) {
                                 throw new IllegalStateException();
                              }

                              var10002 = var9.am((char)cs.at[844691753 * mp.au - 1], 2121970212);
                           } else {
                              var10002 = 0;
                           }

                           var10000[var10001] = var10002;
                           return 1;
                        }
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "cy.aj(" + ')');
      }
   }

   void ag(byte[] var1, int var2, byte var3) {
      try {
         this.ac = var1;
         this.ae = var2 * -712458153;
         this.ag = 0;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "cy.ag(" + ')');
      }
   }

   public static double[] ag(double var0, double var2, int var4, int var5) {
      try {
         int var6 = 1 + 2 * var4;
         double[] var7 = new double[var6];
         int var8 = -var4;

         for(int var9 = 0; var8 <= var4; ++var9) {
            if (var5 == -1426751632) {
               throw new IllegalStateException();
            }

            var7[var9] = lv.ae((double)var8, var0, var2);
            ++var8;
         }

         return var7;
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "cy.ag(" + ')');
      }
   }

   static void am(int var0, int var1, int var2, int var3, byte var4) {
      try {
         de var5 = (de)de.ac.ac((long)var0);
         if (null == var5) {
            if (var4 >= 3) {
               return;
            }

            var5 = new de();
            de.ac.ag(var5, (long)var0);
         }

         if (var5.ae.length <= var1) {
            int[] var6 = new int[var1 + 1];
            int[] var7 = new int[var1 + 1];

            int var8;
            for(var8 = 0; var8 < var5.ae.length; ++var8) {
               if (var4 >= 3) {
                  return;
               }

               var6[var8] = var5.ae[var8];
               var7[var8] = var5.ag[var8];
            }

            for(var8 = var5.ae.length; var8 < var1; ++var8) {
               var6[var8] = -1;
               var7[var8] = 0;
            }

            var5.ae = var6;
            var5.ag = var7;
         }

         var5.ae[var1] = var2;
         var5.ag[var1] = var3;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "cy.am(" + ')');
      }
   }
}
