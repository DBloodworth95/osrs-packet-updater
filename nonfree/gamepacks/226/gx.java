import java.util.Date;

public class gx extends fq {
   static final int aa = 27;
   public static final int ak = 0;
   static final int ai = 16;
   static final int as = 0;
   public static final int av = 39;
   // $FF: synthetic field
   final fz this$0;
   int ap;

   void aw(gy var1, int var2) {
      try {
         var1.ao(this.ap * 1705241893, (byte)0);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gx.aw(" + ')');
      }
   }

   void ap(vl var1, int var2) {
      try {
         this.ap = var1.ce(79370639) * -1173592403;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gx.ap(" + ')');
      }
   }

   void ak(vl var1) {
      this.ap = var1.ce(253555678) * 788047734;
   }

   void ai(gy var1) {
      var1.ao(this.ap * -2115266530, (byte)0);
   }

   void aj(vl var1) {
      this.ap = var1.ce(62892725) * -1785540260;
   }

   gx(fz var1) {
      try {
         this.this$0 = var1;
         super();
         this.ap = 1173592403;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "gx.<init>(" + ')');
      }
   }

   void ay(gy var1) {
      var1.ao(this.ap * 1705241893, (byte)0);
   }

   static int bz(int var0, da var1, boolean var2, int var3) {
      try {
         String var4;
         int var11;
         if (var0 == 4100) {
            if (var3 >= 1069462693) {
               throw new IllegalStateException();
            } else {
               var4 = cm.at[(ih.au -= 746573637) * -114988147];
               var11 = cm.ae[(dp.am -= -1450976103) * -158156887];
               cm.at[(ih.au += 746573637) * -114988147 - 1] = var4 + var11;
               return 1;
            }
         } else {
            String var5;
            if (var0 == 4101) {
               if (var3 >= 1069462693) {
                  throw new IllegalStateException();
               } else {
                  ih.au -= 1493147274;
                  var4 = cm.at[ih.au * -114988147];
                  var5 = cm.at[1 + -114988147 * ih.au];
                  cm.at[(ih.au += 746573637) * -114988147 - 1] = var4 + var5;
                  return 1;
               }
            } else if (4102 == var0) {
               var4 = cm.at[(ih.au -= 746573637) * -114988147];
               var11 = cm.ae[(dp.am -= -1450976103) * -158156887];
               cm.at[(ih.au += 746573637) * -114988147 - 1] = var4 + el.as(var11, true, (byte)86);
               return 1;
            } else if (var0 == 4103) {
               if (var3 >= 1069462693) {
                  throw new IllegalStateException();
               } else {
                  var4 = cm.at[(ih.au -= 746573637) * -114988147];
                  cm.at[(ih.au += 746573637) * -114988147 - 1] = var4.toLowerCase();
                  return 1;
               }
            } else {
               int var7;
               int var13;
               if (4104 == var0) {
                  if (var3 >= 1069462693) {
                     throw new IllegalStateException();
                  } else {
                     var13 = cm.ae[(dp.am -= -1450976103) * -158156887];
                     long var17 = ((long)var13 + 11745L) * 86400000L;
                     cm.ad.setTime(new Date(var17));
                     var7 = cm.ad.get(5);
                     int var19 = cm.ad.get(2);
                     int var9 = cm.ad.get(1);
                     cm.at[(ih.au += 746573637) * -114988147 - 1] = var7 + "-" + cm.ac[var19] + "-" + var9;
                     return 1;
                  }
               } else if (4105 == var0) {
                  if (var3 >= 1069462693) {
                     throw new IllegalStateException();
                  } else {
                     ih.au -= 1493147274;
                     var4 = cm.at[ih.au * -114988147];
                     var5 = cm.at[-114988147 * ih.au + 1];
                     if (nw.mc.aw != null) {
                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        }

                        if (0 != nw.mc.aw.ai * -1480159417) {
                           cm.at[(ih.au += 746573637) * -114988147 - 1] = var5;
                           return 1;
                        }

                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        }
                     }

                     cm.at[(ih.au += 746573637) * -114988147 - 1] = var4;
                     return 1;
                  }
               } else if (var0 == 4106) {
                  var13 = cm.ae[(dp.am -= -1450976103) * -158156887];
                  cm.at[(ih.au += 746573637) * -114988147 - 1] = Integer.toString(var13);
                  return 1;
               } else if (var0 == 4107) {
                  if (var3 >= 1069462693) {
                     throw new IllegalStateException();
                  } else {
                     ih.au -= 1493147274;
                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = hn.az(ka.ap(cm.at[ih.au * -114988147], cm.at[1 + ih.au * -114988147], lc.cp, (byte)59), -1170097408);
                     return 1;
                  }
               } else {
                  int var14;
                  byte[] var16;
                  qi var18;
                  if (var0 == 4108) {
                     if (var3 >= 1069462693) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cm.at[(ih.au -= 746573637) * -114988147];
                        dp.am -= 1393015090;
                        var11 = cm.ae[-158156887 * dp.am];
                        var14 = cm.ae[-158156887 * dp.am + 1];
                        var16 = dq.fn.bm(var14, 0, 2068206400);
                        var18 = new qi(var16);
                        cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var18.ao(var4, var11);
                        return 1;
                     }
                  } else if (4109 == var0) {
                     if (var3 >= 1069462693) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cm.at[(ih.au -= 746573637) * -114988147];
                        dp.am -= 1393015090;
                        var11 = cm.ae[dp.am * -158156887];
                        var14 = cm.ae[-158156887 * dp.am + 1];
                        var16 = dq.fn.bm(var14, 0, 941327780);
                        var18 = new qi(var16);
                        cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var18.an(var4, var11);
                        return 1;
                     }
                  } else if (4110 == var0) {
                     if (var3 >= 1069462693) {
                        throw new IllegalStateException();
                     } else {
                        ih.au -= 1493147274;
                        var4 = cm.at[-114988147 * ih.au];
                        var5 = cm.at[-114988147 * ih.au + 1];
                        if (cm.ae[(dp.am -= -1450976103) * -158156887] == 1) {
                           if (var3 >= 1069462693) {
                              throw new IllegalStateException();
                           }

                           cm.at[(ih.au += 746573637) * -114988147 - 1] = var4;
                        } else {
                           cm.at[(ih.au += 746573637) * -114988147 - 1] = var5;
                        }

                        return 1;
                     }
                  } else if (var0 == 4111) {
                     if (var3 >= 1069462693) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cm.at[(ih.au -= 746573637) * -114988147];
                        cm.at[(ih.au += 746573637) * -114988147 - 1] = qa.af(var4);
                        return 1;
                     }
                  } else if (4112 == var0) {
                     if (var3 >= 1069462693) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cm.at[(ih.au -= 746573637) * -114988147];
                        var11 = cm.ae[(dp.am -= -1450976103) * -158156887];
                        cm.at[(ih.au += 746573637) * -114988147 - 1] = var4 + (char)var11;
                        return 1;
                     }
                  } else {
                     int[] var10000;
                     int var10001;
                     byte var20;
                     if (var0 == 4113) {
                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        } else {
                           var13 = cm.ae[(dp.am -= -1450976103) * -158156887];
                           var10000 = cm.ae;
                           var10001 = (dp.am += -1450976103) * -158156887 - 1;
                           if (eu.ab((char)var13, (byte)0)) {
                              if (var3 >= 1069462693) {
                                 throw new IllegalStateException();
                              }

                              var20 = 1;
                           } else {
                              var20 = 0;
                           }

                           var10000[var10001] = var20;
                           return 1;
                        }
                     } else if (4114 == var0) {
                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        } else {
                           var13 = cm.ae[(dp.am -= -1450976103) * -158156887];
                           var10000 = cm.ae;
                           var10001 = (dp.am += -1450976103) * -158156887 - 1;
                           if (pv.ao((char)var13, 672445899)) {
                              if (var3 >= 1069462693) {
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
                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        } else {
                           var13 = cm.ae[(dp.am -= -1450976103) * -158156887];
                           var10000 = cm.ae;
                           var10001 = (dp.am += -1450976103) * -158156887 - 1;
                           if (li.au((char)var13, 1316379276)) {
                              if (var3 >= 1069462693) {
                                 throw new IllegalStateException();
                              }

                              var20 = 1;
                           } else {
                              var20 = 0;
                           }

                           var10000[var10001] = var20;
                           return 1;
                        }
                     } else if (var0 == 4116) {
                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        } else {
                           var13 = cm.ae[(dp.am -= -1450976103) * -158156887];
                           var10000 = cm.ae;
                           var10001 = (dp.am += -1450976103) * -158156887 - 1;
                           if (hj.an((char)var13, -1653446096)) {
                              if (var3 >= 1069462693) {
                                 throw new IllegalStateException();
                              }

                              var20 = 1;
                           } else {
                              var20 = 0;
                           }

                           var10000[var10001] = var20;
                           return 1;
                        }
                     } else if (4117 == var0) {
                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cm.at[(ih.au -= 746573637) * -114988147];
                           if (null != var4) {
                              if (var3 >= 1069462693) {
                                 throw new IllegalStateException();
                              }

                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.length();
                           } else {
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                           }

                           return 1;
                        }
                     } else if (var0 == 4118) {
                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cm.at[(ih.au -= 746573637) * -114988147];
                           dp.am -= 1393015090;
                           var11 = cm.ae[-158156887 * dp.am];
                           var14 = cm.ae[1 + -158156887 * dp.am];
                           cm.at[(ih.au += 746573637) * -114988147 - 1] = var4.substring(var11, var14);
                           return 1;
                        }
                     } else if (4119 == var0) {
                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cm.at[(ih.au -= 746573637) * -114988147];
                           StringBuilder var12 = new StringBuilder(var4.length());
                           boolean var15 = false;

                           for(var7 = 0; var7 < var4.length(); ++var7) {
                              char var8 = var4.charAt(var7);
                              if ('<' == var8) {
                                 if (var3 >= 1069462693) {
                                    throw new IllegalStateException();
                                 }

                                 var15 = true;
                              } else if (var8 == '>') {
                                 var15 = false;
                              } else if (!var15) {
                                 if (var3 >= 1069462693) {
                                    throw new IllegalStateException();
                                 }

                                 var12.append(var8);
                              }
                           }

                           cm.at[(ih.au += 746573637) * -114988147 - 1] = var12.toString();
                           return 1;
                        }
                     } else if (4120 == var0) {
                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cm.at[(ih.au -= 746573637) * -114988147];
                           var11 = cm.ae[(dp.am -= -1450976103) * -158156887];
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.indexOf(var11);
                           return 1;
                        }
                     } else if (var0 == 4121) {
                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        } else {
                           ih.au -= 1493147274;
                           var4 = cm.at[ih.au * -114988147];
                           var5 = cm.at[1 + ih.au * -114988147];
                           var14 = cm.ae[(dp.am -= -1450976103) * -158156887];
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.indexOf(var5, var14);
                           return 1;
                        }
                     } else if (var0 == 4122) {
                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cm.at[(ih.au -= 746573637) * -114988147];
                           cm.at[(ih.au += 746573637) * -114988147 - 1] = var4.toUpperCase();
                           return 1;
                        }
                     } else if (4123 == var0) {
                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        } else {
                           ih.au -= -2055246385;
                           var4 = cm.at[ih.au * -114988147];
                           var5 = cm.at[1 + ih.au * -114988147];
                           String var6 = cm.at[ih.au * -114988147 + 2];
                           if (nw.mc.aw == null) {
                              if (var3 >= 1069462693) {
                                 throw new IllegalStateException();
                              } else {
                                 cm.at[(ih.au += 746573637) * -114988147 - 1] = var6;
                                 return 1;
                              }
                           } else {
                              switch(nw.mc.aw.aj * -1465710415) {
                              case 0:
                                 cm.at[(ih.au += 746573637) * -114988147 - 1] = var4;
                                 break;
                              case 1:
                                 cm.at[(ih.au += 746573637) * -114988147 - 1] = var5;
                                 break;
                              case 2:
                              default:
                                 cm.at[(ih.au += 746573637) * -114988147 - 1] = var6;
                              }

                              return 1;
                           }
                        }
                     } else if (var0 == 4124) {
                        if (var3 >= 1069462693) {
                           throw new IllegalStateException();
                        } else {
                           var10000 = cm.ae;
                           var10001 = (dp.am += -1450976103) * -158156887 - 1;
                           int var10002;
                           if (nw.mc.aw != null) {
                              if (var3 >= 1069462693) {
                                 throw new IllegalStateException();
                              }

                              var10002 = nw.mc.aw.aj * -1465710415;
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
         throw tm.aw(var10, "gx.bz(" + ')');
      }
   }

   public static int aj(int var0, int var1, int var2, byte var3) {
      try {
         int var4 = cr.aw(var2 - var1 + 1, 107021418);
         var4 <<= var1;
         return var0 & ~var4;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "gx.aj(" + ')');
      }
   }
}
