import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class pp {
   public static Comparator am;
   public static Comparator ae = new ph();
   public final List ac;
   public static int[] aq;
   public static Comparator ax;
   public static Comparator ag;

   public void am(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.ac, var1);
      } else {
         Collections.sort(this.ac, Collections.reverseOrder(var1));
      }

   }

   public pp(vf var1, boolean var2) {
      try {
         super();
         int var3 = var1.ct(-1598116229);
         boolean var4 = var1.cv(952452697) == 1;
         byte var5;
         if (var4) {
            var5 = 1;
         } else {
            var5 = 0;
         }

         int var6 = var1.ct(-2090499307);
         this.ac = new ArrayList(var6);

         for(int var7 = 0; var7 < var6; ++var7) {
            this.ac.add(new pv(var1, var5, var3));
         }

      } catch (RuntimeException var8) {
         throw vk.ae(var8, "pp.<init>(" + ')');
      }
   }

   static {
      new pd();
      ag = new pm();
      am = new pz();
      ax = new pe();
   }

   static int ba(int var0, dt var1, boolean var2, int var3) {
      try {
         String var4;
         int var11;
         if (var0 == 4100) {
            if (var3 == 712892376) {
               throw new IllegalStateException();
            } else {
               var4 = cs.ar[(rt.al -= -1975882559) * -515103935];
               var11 = cs.at[(mp.au -= -1856457959) * 844691753];
               cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4 + var11;
               return 1;
            }
         } else {
            String var5;
            if (var0 == 4101) {
               if (var3 == 712892376) {
                  throw new IllegalStateException();
               } else {
                  rt.al -= 343202178;
                  var4 = cs.ar[-515103935 * rt.al];
                  var5 = cs.ar[rt.al * -515103935 + 1];
                  cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4 + var5;
                  return 1;
               }
            } else if (var0 == 4102) {
               if (var3 == 712892376) {
                  throw new IllegalStateException();
               } else {
                  var4 = cs.ar[(rt.al -= -1975882559) * -515103935];
                  var11 = cs.at[(mp.au -= -1856457959) * 844691753];
                  cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4 + go.aq(var11, true, 261268478);
                  return 1;
               }
            } else if (var0 == 4103) {
               if (var3 == 712892376) {
                  throw new IllegalStateException();
               } else {
                  var4 = cs.ar[(rt.al -= -1975882559) * -515103935];
                  cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4.toLowerCase();
                  return 1;
               }
            } else {
               int var7;
               int var13;
               if (4104 == var0) {
                  if (var3 == 712892376) {
                     throw new IllegalStateException();
                  } else {
                     var13 = cs.at[(mp.au -= -1856457959) * 844691753];
                     long var17 = 86400000L * (11745L + (long)var13);
                     cs.ao.setTime(new Date(var17));
                     var7 = cs.ao.get(5);
                     int var19 = cs.ao.get(2);
                     int var9 = cs.ao.get(1);
                     cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var7 + "-" + cs.as[var19] + "-" + var9;
                     return 1;
                  }
               } else if (var0 == 4105) {
                  if (var3 == 712892376) {
                     throw new IllegalStateException();
                  } else {
                     rt.al -= 343202178;
                     var4 = cs.ar[rt.al * -515103935];
                     var5 = cs.ar[1 + rt.al * -515103935];
                     if (null != qm.mm.ae) {
                        if (var3 == 712892376) {
                           throw new IllegalStateException();
                        }

                        if (0 != qm.mm.ae.ax * 2024464609) {
                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var5;
                           return 1;
                        }
                     }

                     cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4;
                     return 1;
                  }
               } else if (4106 == var0) {
                  var13 = cs.at[(mp.au -= -1856457959) * 844691753];
                  cs.ar[(rt.al += -1975882559) * -515103935 - 1] = Integer.toString(var13);
                  return 1;
               } else if (4107 == var0) {
                  if (var3 == 712892376) {
                     throw new IllegalStateException();
                  } else {
                     rt.al -= 343202178;
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = as.ab(bp.ac(cs.ar[-515103935 * rt.al], cs.ar[rt.al * -515103935 + 1], dn.cy, 976716409), (byte)45);
                     return 1;
                  }
               } else {
                  int var14;
                  byte[] var16;
                  qu var18;
                  if (4108 == var0) {
                     if (var3 == 712892376) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cs.ar[(rt.al -= -1975882559) * -515103935];
                        mp.au -= 582051378;
                        var11 = cs.at[844691753 * mp.au];
                        var14 = cs.at[mp.au * 844691753 + 1];
                        var16 = ec.fu.bt(var14, 0, (byte)62);
                        var18 = new qu(var16);
                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = var18.ab(var4, var11);
                        return 1;
                     }
                  } else if (var0 == 4109) {
                     if (var3 == 712892376) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cs.ar[(rt.al -= -1975882559) * -515103935];
                        mp.au -= 582051378;
                        var11 = cs.at[844691753 * mp.au];
                        var14 = cs.at[844691753 * mp.au + 1];
                        var16 = ec.fu.bt(var14, 0, (byte)114);
                        var18 = new qu(var16);
                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = var18.ap(var4, var11);
                        return 1;
                     }
                  } else if (var0 == 4110) {
                     if (var3 == 712892376) {
                        throw new IllegalStateException();
                     } else {
                        rt.al -= 343202178;
                        var4 = cs.ar[rt.al * -515103935];
                        var5 = cs.ar[1 + rt.al * -515103935];
                        if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                           if (var3 == 712892376) {
                              throw new IllegalStateException();
                           }

                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4;
                        } else {
                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var5;
                        }

                        return 1;
                     }
                  } else if (var0 == 4111) {
                     if (var3 == 712892376) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cs.ar[(rt.al -= -1975882559) * -515103935];
                        cs.ar[(rt.al += -1975882559) * -515103935 - 1] = qk.az(var4);
                        return 1;
                     }
                  } else if (var0 == 4112) {
                     var4 = cs.ar[(rt.al -= -1975882559) * -515103935];
                     var11 = cs.at[(mp.au -= -1856457959) * 844691753];
                     cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4 + (char)var11;
                     return 1;
                  } else {
                     int[] var10000;
                     int var10001;
                     byte var20;
                     if (4113 == var0) {
                        if (var3 == 712892376) {
                           throw new IllegalStateException();
                        } else {
                           var13 = cs.at[(mp.au -= -1856457959) * 844691753];
                           var10000 = cs.at;
                           var10001 = (mp.au += -1856457959) * 844691753 - 1;
                           if (br.ap((char)var13, -1634953732)) {
                              if (var3 == 712892376) {
                                 throw new IllegalStateException();
                              }

                              var20 = 1;
                           } else {
                              var20 = 0;
                           }

                           var10000[var10001] = var20;
                           return 1;
                        }
                     } else if (var0 == 4114) {
                        if (var3 == 712892376) {
                           throw new IllegalStateException();
                        } else {
                           var13 = cs.at[(mp.au -= -1856457959) * 844691753];
                           var10000 = cs.at;
                           var10001 = (mp.au += -1856457959) * 844691753 - 1;
                           if (fi.ar((char)var13, 16711935)) {
                              if (var3 == 712892376) {
                                 throw new IllegalStateException();
                              }

                              var20 = 1;
                           } else {
                              var20 = 0;
                           }

                           var10000[var10001] = var20;
                           return 1;
                        }
                     } else if (var0 == 4115) {
                        if (var3 == 712892376) {
                           throw new IllegalStateException();
                        } else {
                           var13 = cs.at[(mp.au -= -1856457959) * 844691753];
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = nj.at((char)var13, (byte)8) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 4116) {
                        if (var3 == 712892376) {
                           throw new IllegalStateException();
                        } else {
                           var13 = cs.at[(mp.au -= -1856457959) * 844691753];
                           var10000 = cs.at;
                           var10001 = (mp.au += -1856457959) * 844691753 - 1;
                           if (ds.au((char)var13, 1009513020)) {
                              if (var3 == 712892376) {
                                 throw new IllegalStateException();
                              }

                              var20 = 1;
                           } else {
                              var20 = 0;
                           }

                           var10000[var10001] = var20;
                           return 1;
                        }
                     } else if (var0 == 4117) {
                        if (var3 == 712892376) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cs.ar[(rt.al -= -1975882559) * -515103935];
                           if (null != var4) {
                              if (var3 == 712892376) {
                                 throw new IllegalStateException();
                              }

                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.length();
                           } else {
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                           }

                           return 1;
                        }
                     } else if (var0 == 4118) {
                        if (var3 == 712892376) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cs.ar[(rt.al -= -1975882559) * -515103935];
                           mp.au -= 582051378;
                           var11 = cs.at[mp.au * 844691753];
                           var14 = cs.at[1 + 844691753 * mp.au];
                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4.substring(var11, var14);
                           return 1;
                        }
                     } else if (var0 == 4119) {
                        if (var3 == 712892376) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cs.ar[(rt.al -= -1975882559) * -515103935];
                           StringBuilder var12 = new StringBuilder(var4.length());
                           boolean var15 = false;

                           for(var7 = 0; var7 < var4.length(); ++var7) {
                              char var8 = var4.charAt(var7);
                              if (var8 == '<') {
                                 if (var3 == 712892376) {
                                    throw new IllegalStateException();
                                 }

                                 var15 = true;
                              } else if (var8 == '>') {
                                 if (var3 == 712892376) {
                                    throw new IllegalStateException();
                                 }

                                 var15 = false;
                              } else if (!var15) {
                                 var12.append(var8);
                              }
                           }

                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var12.toString();
                           return 1;
                        }
                     } else if (4120 == var0) {
                        if (var3 == 712892376) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cs.ar[(rt.al -= -1975882559) * -515103935];
                           var11 = cs.at[(mp.au -= -1856457959) * 844691753];
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.indexOf(var11);
                           return 1;
                        }
                     } else if (var0 == 4121) {
                        rt.al -= 343202178;
                        var4 = cs.ar[-515103935 * rt.al];
                        var5 = cs.ar[-515103935 * rt.al + 1];
                        var14 = cs.at[(mp.au -= -1856457959) * 844691753];
                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = var4.indexOf(var5, var14);
                        return 1;
                     } else if (var0 == 4122) {
                        var4 = cs.ar[(rt.al -= -1975882559) * -515103935];
                        cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4.toUpperCase();
                        return 1;
                     } else if (var0 == 4123) {
                        if (var3 == 712892376) {
                           throw new IllegalStateException();
                        } else {
                           rt.al -= -1632680381;
                           var4 = cs.ar[-515103935 * rt.al];
                           var5 = cs.ar[rt.al * -515103935 + 1];
                           String var6 = cs.ar[2 + -515103935 * rt.al];
                           if (null == qm.mm.ae) {
                              if (var3 == 712892376) {
                                 throw new IllegalStateException();
                              } else {
                                 cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var6;
                                 return 1;
                              }
                           } else {
                              switch(qm.mm.ae.am * 1161513301) {
                              case 0:
                                 cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var4;
                                 break;
                              case 1:
                                 cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var5;
                                 break;
                              case 2:
                              default:
                                 cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var6;
                              }

                              return 1;
                           }
                        }
                     } else if (var0 == 4124) {
                        if (var3 == 712892376) {
                           throw new IllegalStateException();
                        } else {
                           var10000 = cs.at;
                           var10001 = (mp.au += -1856457959) * 844691753 - 1;
                           int var10002;
                           if (qm.mm.ae != null) {
                              if (var3 == 712892376) {
                                 throw new IllegalStateException();
                              }

                              var10002 = qm.mm.ae.am * 1161513301;
                           } else {
                              var10002 = -1;
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
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "pp.ba(" + ')');
      }
   }

   public void ag(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.ac, var1);
      } else {
         Collections.sort(this.ac, Collections.reverseOrder(var1));
      }

   }

   public void ae(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.ac, var1);
      } else {
         Collections.sort(this.ac, Collections.reverseOrder(var1));
      }

   }

   public void ac(Comparator var1, boolean var2, byte var3) {
      try {
         if (var2) {
            Collections.sort(this.ac, var1);
         } else {
            Collections.sort(this.ac, Collections.reverseOrder(var1));
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "pp.ac(" + ')');
      }
   }
}
