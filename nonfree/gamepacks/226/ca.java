public final class ca extends jv {
   int ai;
   int ay;
   int ak;
   int aj;
   int am;
   int ap;
   iu as;
   int ae;
   int aw;
   boolean at;
   static vv[] ki;
   public static final int bl = 1012;
   public static final int aa = 2048;

   final void aw(int var1) {
      if (!this.at) {
         this.am += var1 * 796322691;
         if (!this.as.au((byte)101)) {
            while(-304088277 * this.am > this.as.az[-630248333 * this.ae]) {
               this.am -= 796322691 * this.as.az[this.ae * -630248333];
               this.ae += 179394747;
               if (-630248333 * this.ae >= this.as.ar.length) {
                  this.at = true;
                  break;
               }

               lw.hi(this.as, -630248333 * this.ae, 373231719 * this.aj, 234359759 * this.ai, false, (byte)1);
            }
         } else {
            this.ae += 179394747 * var1;
            if (-630248333 * this.ae >= this.as.an((byte)23)) {
               this.at = true;
            } else {
               lw.hi(this.as, -630248333 * this.ae, 373231719 * this.aj, 234359759 * this.ai, false, (byte)1);
            }
         }

      }
   }

   final void ap(int var1, byte var2) {
      try {
         if (this.at) {
            if (var2 == 62) {
               throw new IllegalStateException();
            }
         } else {
            this.am += var1 * 796322691;
            if (!this.as.au((byte)61)) {
               if (var2 == 62) {
                  throw new IllegalStateException();
               }

               while(-304088277 * this.am > this.as.az[-630248333 * this.ae]) {
                  if (var2 == 62) {
                     throw new IllegalStateException();
                  }

                  this.am -= 796322691 * this.as.az[this.ae * -630248333];
                  this.ae += 179394747;
                  if (-630248333 * this.ae >= this.as.ar.length) {
                     if (var2 == 62) {
                        throw new IllegalStateException();
                     }

                     this.at = true;
                     break;
                  }

                  lw.hi(this.as, -630248333 * this.ae, 373231719 * this.aj, 234359759 * this.ai, false, (byte)1);
               }
            } else {
               this.ae += 179394747 * var1;
               if (-630248333 * this.ae >= this.as.an((byte)29)) {
                  if (var2 == 62) {
                     return;
                  }

                  this.at = true;
               } else {
                  lw.hi(this.as, -630248333 * this.ae, 373231719 * this.aj, 234359759 * this.ai, false, (byte)1);
               }
            }

         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ca.ap(" + ')');
      }
   }

   protected final jy au(int var1) {
      try {
         hj var2 = nl.ap(this.ap * -1795290967, -969055728);
         jy var3;
         if (!this.at) {
            if (var1 != 1885718735) {
               throw new IllegalStateException();
            }

            var3 = var2.aj(this.ae * -630248333, -107768152);
         } else {
            var3 = var2.aj(-1, 1713213602);
         }

         if (var3 == null) {
            if (var1 != 1885718735) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return var3;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ca.au(" + ')');
      }
   }

   protected final jy ao() {
      hj var1 = nl.ap(this.ap * -1795290967, -230442560);
      jy var2;
      if (!this.at) {
         var2 = var1.aj(this.ae * 732706315, 837020249);
      } else {
         var2 = var1.aj(-1, -141946372);
      }

      return var2 == null ? null : var2;
   }

   static int ac(int var0, da var1, boolean var2, int var3) {
      try {
         ng var4;
         if (1927 != var0) {
            if (var3 != 30289876) {
               throw new IllegalStateException();
            }

            if (var0 != 2927) {
               int var11;
               if (var0 == 1928) {
                  var4 = var2 ? vx.ar : ac.af;
                  var11 = cm.ae[(dp.am -= -1450976103) * -158156887];
                  if (var11 >= 1) {
                     if (var3 != 30289876) {
                        throw new IllegalStateException();
                     }

                     if (var11 <= 10) {
                        ez var12 = new ez(var11, -1736739607 * var4.bj, var4.bv * 597146807, -2104795295 * var4.go);
                        cm.al.add(var12);
                        return 1;
                     }
                  }

                  throw new RuntimeException();
               }

               if (var0 == 2928) {
                  if (var3 != 30289876) {
                     throw new IllegalStateException();
                  }

                  dp.am -= -57961013;
                  int var10 = cm.ae[-158156887 * dp.am];
                  var11 = cm.ae[1 + dp.am * -158156887];
                  int var6 = cm.ae[2 + -158156887 * dp.am];
                  if (var6 >= 1) {
                     if (var3 != 30289876) {
                        throw new IllegalStateException();
                     }

                     if (var6 <= 10) {
                        ng var7 = qk.ek.aw(var10, var11, (byte)-16);
                        if (null == var7) {
                           if (var3 != 30289876) {
                              throw new IllegalStateException();
                           }

                           throw new RuntimeException();
                        }

                        ez var8 = new ez(var6, var10, var11, -2104795295 * var7.go);
                        cm.al.add(var8);
                        return 1;
                     }

                     if (var3 != 30289876) {
                        throw new IllegalStateException();
                     }
                  }

                  throw new RuntimeException();
               }

               return 2;
            }

            if (var3 != 30289876) {
               throw new IllegalStateException();
            }
         }

         if (cm.aa * 1233505853 >= 10) {
            if (var3 != 30289876) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            if (var0 >= 2000) {
               if (var3 != 30289876) {
                  throw new IllegalStateException();
               }

               var4 = qk.ek.ap(cm.ae[(dp.am -= -1450976103) * -158156887], 281713510);
            } else {
               ng var10000;
               if (var2) {
                  if (var3 != 30289876) {
                     throw new IllegalStateException();
                  }

                  var10000 = vx.ar;
               } else {
                  var10000 = ac.af;
               }

               var4 = var10000;
            }

            if (var4.gy == null) {
               if (var3 != 30289876) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            } else {
               dt var5 = new dt();
               var5.ak = var4;
               var5.ap = var4.gy;
               var5.an = 138494467 + cm.aa * -1590025033;
               client.qb.aw(var5);
               return 1;
            }
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "ca.ac(" + ')');
      }
   }

   ca(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         super();
         this.ae = 0;
         this.am = 0;
         this.at = false;
         this.ap = var1 * -1173677159;
         this.ak = 546639805 * var2;
         this.aj = var3 * 1772375;
         this.ai = -1323754705 * var4;
         this.ay = -1378408139 * var5;
         this.aw = 735056301 * (var7 + var6);
         int var8 = nl.ap(-1795290967 * this.ap, -618868708).as * -347425453;
         if (var8 != -1) {
            this.at = false;
            this.as = ng.ap(var8, (short)-20253);
         } else {
            this.at = true;
         }

      } catch (RuntimeException var9) {
         throw tm.aw(var9, "ca.<init>(" + ')');
      }
   }

   static void aw(dt var0, int var1, int var2, int var3) {
      try {
         Object[] var4 = var0.ap;
         da var5;
         if (kk.ap(-983047605 * var0.ao, -39824382)) {
            if (var3 != -2113529759) {
               throw new IllegalStateException();
            }

            qh.av = (lj)var4[0];
            hc var6 = ar.aw(qh.av.ap * -1102307627, 1810210726);
            var5 = us.aw(-983047605 * var0.ao, var6.ai * -1268897243, 1418002937 * var6.aa, 1570207647);
         } else {
            int var8 = (Integer)var4[0];
            var5 = ly.ap(var8, (short)2047);
         }

         if (var5 != null) {
            if (var3 != -2113529759) {
               throw new IllegalStateException();
            }

            tt.ak(var0, var5, var1, var2, (byte)-113);
         }

      } catch (RuntimeException var7) {
         throw tm.aw(var7, "ca.aw(" + ')');
      }
   }

   protected final jy an() {
      hj var1 = nl.ap(this.ap * -1795290967, -1456468803);
      jy var2;
      if (!this.at) {
         var2 = var1.aj(this.ae * -630248333, 822298444);
      } else {
         var2 = var1.aj(-1, 918622606);
      }

      return var2 == null ? null : var2;
   }
}
