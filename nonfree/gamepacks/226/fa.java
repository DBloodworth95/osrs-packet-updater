public class fa {
   float ay;
   int ap;
   fa as;
   float aj;
   float aw;
   float ak;
   float ai;
   public static final int bz = 131072;
   public static final int bj = 26;

   void ak(vl var1, int var2) {
      this.ap = var1.cg(-742002312) * -475473929;
      this.aw = var1.cc(2013990356);
      this.ak = var1.cc(9831912);
      this.aj = var1.cc(980449068);
      this.ai = var1.cc(1623191934);
      this.ay = var1.cc(737970866);
   }

   void ap(vl var1, int var2, int var3) {
      try {
         this.ap = var1.cg(-2140084476) * -475473929;
         this.aw = var1.cc(993585548);
         this.ak = var1.cc(813873663);
         this.aj = var1.cc(178507666);
         this.ai = var1.cc(843741975);
         this.ay = var1.cc(1932996211);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "fa.ap(" + ')');
      }
   }

   fa() {
      try {
         super();
         this.ak = Float.MAX_VALUE;
         this.aj = Float.MAX_VALUE;
         this.ai = Float.MAX_VALUE;
         this.ay = Float.MAX_VALUE;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "fa.<init>(" + ')');
      }
   }

   void ay(vl var1, int var2) {
      this.ap = var1.cg(333930030) * -475473929;
      this.aw = var1.cc(505161567);
      this.ak = var1.cc(1380221410);
      this.aj = var1.cc(-184726254);
      this.ai = var1.cc(2145663403);
      this.ay = var1.cc(147395513);
   }

   void aj(vl var1, int var2) {
      this.ap = var1.cg(-69414610) * -475473929;
      this.aw = var1.cc(1721333826);
      this.ak = var1.cc(1102480021);
      this.aj = var1.cc(1113099995);
      this.ai = var1.cc(-285281782);
      this.ay = var1.cc(1604561709);
   }

   void ai(vl var1, int var2) {
      this.ap = var1.cg(-610820136) * -475473929;
      this.aw = var1.cc(356682398);
      this.ak = var1.cc(1378974054);
      this.aj = var1.cc(208076679);
      this.ai = var1.cc(1537317814);
      this.ay = var1.cc(298182788);
   }

   static final void at(ng var0, int var1, byte[] var2, byte[] var3, int var4) {
      try {
         if (var0.ec == null) {
            if (null == var2) {
               return;
            }

            if (var4 >= 1335553179) {
               throw new IllegalStateException();
            }

            var0.ec = new byte[11][];
            var0.ek = new byte[11][];
            var0.er = new int[11];
            var0.en = new int[11];
         }

         var0.ec[var1] = var2;
         if (var2 != null) {
            if (var4 >= 1335553179) {
               throw new IllegalStateException();
            }

            var0.ey = true;
         } else {
            var0.ey = false;

            for(int var5 = 0; var5 < var0.ec.length; ++var5) {
               if (var4 >= 1335553179) {
                  return;
               }

               if (var0.ec[var5] != null) {
                  if (var4 >= 1335553179) {
                     throw new IllegalStateException();
                  }

                  var0.ey = true;
                  break;
               }
            }
         }

         var0.ek[var1] = var3;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "fa.at(" + ')');
      }
   }

   static void ad(String var0, String var1, String var2, int var3) {
      try {
         dq.cd = var0;
         dq.ci = var1;
         dq.cn = var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "fa.ad(" + ')');
      }
   }

   static void ak(ct[] var0, int var1, int var2, int[] var3, int[] var4, int var5) {
      try {
         if (var1 < var2) {
            if (var5 != 2033471635) {
               throw new IllegalStateException();
            }

            int var6 = var1 - 1;
            int var7 = 1 + var2;
            int var8 = (var1 + var2) / 2;
            ct var9 = var0[var8];
            var0[var8] = var0[var1];
            var0[var1] = var9;

            while(true) {
               if (var6 >= var7) {
                  ak(var0, var1, var7, var3, var4, 2033471635);
                  ak(var0, 1 + var7, var2, var3, var4, 2033471635);
                  break;
               }

               if (var5 != 2033471635) {
                  return;
               }

               boolean var10 = true;

               int var11;
               int var12;
               int var13;
               byte var10000;
               do {
                  --var7;

                  for(var11 = 0; var11 < 4; ++var11) {
                     if (var3[var11] == 2) {
                        if (var5 != 2033471635) {
                           throw new IllegalStateException();
                        }

                        var12 = var0[var7].az * -1277016429;
                        var13 = -1277016429 * var9.az;
                     } else if (var3[var11] == 1) {
                        if (var5 != 2033471635) {
                           throw new IllegalStateException();
                        }

                        var12 = var0[var7].ao * -770215649;
                        var13 = -770215649 * var9.ao;
                        if (var12 == -1) {
                           if (var5 != 2033471635) {
                              throw new IllegalStateException();
                           }

                           if (var4[var11] == 1) {
                              if (var5 != 2033471635) {
                                 throw new IllegalStateException();
                              }

                              var12 = 2001;
                           }
                        }

                        if (var13 == -1) {
                           if (var5 != 2033471635) {
                              return;
                           }

                           if (1 == var4[var11]) {
                              if (var5 != 2033471635) {
                                 throw new IllegalStateException();
                              }

                              var13 = 2001;
                           }
                        }
                     } else if (3 == var3[var11]) {
                        if (var0[var7].at(353504895)) {
                           if (var5 != 2033471635) {
                              throw new IllegalStateException();
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var12 = var10000;
                        if (var9.at(2089068044)) {
                           if (var5 != 2033471635) {
                              throw new IllegalStateException();
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var13 = var10000;
                     } else {
                        var12 = var0[var7].au * 2073291263;
                        var13 = var9.au * 2073291263;
                     }

                     if (var12 != var13) {
                        if (var4[var11] == 1) {
                           if (var5 != 2033471635) {
                              throw new IllegalStateException();
                           }

                           if (var12 > var13) {
                              if (var5 != 2033471635) {
                                 return;
                              }
                              break;
                           }
                        }

                        if (0 == var4[var11]) {
                           if (var5 != 2033471635) {
                              throw new IllegalStateException();
                           }

                           if (var12 < var13) {
                              if (var5 != 2033471635) {
                                 return;
                              }
                              break;
                           }
                        }

                        var10 = false;
                        break;
                     }

                     if (var5 != 2033471635) {
                        throw new IllegalStateException();
                     }

                     if (3 == var11) {
                        if (var5 != 2033471635) {
                           throw new IllegalStateException();
                        }

                        var10 = false;
                     }
                  }
               } while(var10);

               var10 = true;

               do {
                  ++var6;

                  for(var11 = 0; var11 < 4; ++var11) {
                     if (var5 != 2033471635) {
                        throw new IllegalStateException();
                     }

                     if (var3[var11] == 2) {
                        if (var5 != 2033471635) {
                           return;
                        }

                        var12 = var0[var6].az * -1277016429;
                        var13 = -1277016429 * var9.az;
                     } else if (var3[var11] == 1) {
                        if (var5 != 2033471635) {
                           return;
                        }

                        var12 = var0[var6].ao * -770215649;
                        var13 = -770215649 * var9.ao;
                        if (-1 == var12) {
                           if (var5 != 2033471635) {
                              return;
                           }

                           if (1 == var4[var11]) {
                              if (var5 != 2033471635) {
                                 throw new IllegalStateException();
                              }

                              var12 = 2001;
                           }
                        }

                        if (-1 == var13) {
                           if (var5 != 2033471635) {
                              throw new IllegalStateException();
                           }

                           if (1 == var4[var11]) {
                              var13 = 2001;
                           }
                        }
                     } else if (3 == var3[var11]) {
                        if (var5 != 2033471635) {
                           return;
                        }

                        if (var0[var6].at(-295240162)) {
                           if (var5 != 2033471635) {
                              throw new IllegalStateException();
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var12 = var10000;
                        if (var9.at(1415467091)) {
                           if (var5 != 2033471635) {
                              throw new IllegalStateException();
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var13 = var10000;
                     } else {
                        var12 = 2073291263 * var0[var6].au;
                        var13 = 2073291263 * var9.au;
                     }

                     if (var12 != var13) {
                        if (var4[var11] == 1 && var12 < var13) {
                           if (var5 != 2033471635) {
                              return;
                           }
                           break;
                        }

                        if (0 == var4[var11]) {
                           if (var5 != 2033471635) {
                              throw new IllegalStateException();
                           }

                           if (var12 > var13) {
                              if (var5 != 2033471635) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }
                        }

                        var10 = false;
                        break;
                     }

                     if (var5 != 2033471635) {
                        return;
                     }

                     if (var11 == 3) {
                        if (var5 != 2033471635) {
                           throw new IllegalStateException();
                        }

                        var10 = false;
                     }
                  }
               } while(var10);

               if (var5 != 2033471635) {
                  throw new IllegalStateException();
               }

               if (var6 < var7) {
                  if (var5 != 2033471635) {
                     throw new IllegalStateException();
                  }

                  ct var15 = var0[var6];
                  var0[var6] = var0[var7];
                  var0[var7] = var15;
               }
            }
         }

      } catch (RuntimeException var14) {
         throw tm.aw(var14, "fa.ak(" + ')');
      }
   }

   void aw(vl var1, int var2) {
      this.ap = var1.cg(-506392191) * -475473929;
      this.aw = var1.cc(830977414);
      this.ak = var1.cc(2052806771);
      this.aj = var1.cc(1734372240);
      this.ai = var1.cc(1286271555);
      this.ay = var1.cc(1023140177);
   }

   static int ap(int var0, int var1, int var2) {
      try {
         in var4 = (in)in.aw.ap((long)var0);
         in var3;
         if (null != var4) {
            if (var2 >= -1553842313) {
               throw new IllegalStateException();
            }

            var3 = var4;
         } else {
            byte[] var5 = in.ap.bm(4, var0, 1446438252);
            var4 = new in();
            if (var5 != null) {
               if (var2 >= -1553842313) {
                  throw new IllegalStateException();
               }

               var4.ak(new vl(var5), var0, (byte)-80);
            }

            var4.aw((byte)30);
            in.aw.ak(var4, (long)var0);
            var3 = var4;
         }

         if (null == var3) {
            if (var2 >= -1553842313) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else {
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            if (-1742760383 * var3.ay >= 0) {
               if (var2 >= -1553842313) {
                  throw new IllegalStateException();
               } else {
                  var6 = -1693258293 * var3.at;
                  var7 = var3.au * -42789891;
                  var8 = var3.an * -1789961391;
                  if (var8 > 179) {
                     if (var2 >= -1553842313) {
                        throw new IllegalStateException();
                     }

                     var7 /= 2;
                  }

                  if (var8 > 192) {
                     if (var2 >= -1553842313) {
                        throw new IllegalStateException();
                     }

                     var7 /= 2;
                  }

                  if (var8 > 217) {
                     var7 /= 2;
                  }

                  if (var8 > 243) {
                     var7 /= 2;
                  }

                  var9 = (var7 / 32 << 7) + (var6 / 4 << 10) + var8 / 2;
                  var10 = lm.aw(var9, 96, 1648223209);
                  return jm.ap[var10] | -16777216;
               }
            } else if (var3.aj * -1814161031 >= 0) {
               if (var2 >= -1553842313) {
                  throw new IllegalStateException();
               } else {
                  int var12 = lm.aw(jm.as.as.aj(-1814161031 * var3.aj, (byte)-26), 96, 1594419364);
                  return jm.ap[var12] | -16777216;
               }
            } else if (16711935 == -265762545 * var3.ak) {
               if (var2 >= -1553842313) {
                  throw new IllegalStateException();
               } else {
                  return var1;
               }
            } else {
               var6 = var3.as * -1283114581;
               var7 = -1450197231 * var3.ae;
               var8 = var3.am * -1077160877;
               if (var8 > 179) {
                  if (var2 >= -1553842313) {
                     throw new IllegalStateException();
                  }

                  var7 /= 2;
               }

               if (var8 > 192) {
                  if (var2 >= -1553842313) {
                     throw new IllegalStateException();
                  }

                  var7 /= 2;
               }

               if (var8 > 217) {
                  if (var2 >= -1553842313) {
                     throw new IllegalStateException();
                  }

                  var7 /= 2;
               }

               if (var8 > 243) {
                  if (var2 >= -1553842313) {
                     throw new IllegalStateException();
                  }

                  var7 /= 2;
               }

               var9 = (var7 / 32 << 7) + (var6 / 4 << 10) + var8 / 2;
               var10 = lm.aw(var9, 96, 1585346059);
               return jm.ap[var10] | -16777216;
            }
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "fa.ap(" + ')');
      }
   }
}
