import java.util.ArrayList;

public class ui implements ph {
   static tk ql;
   public static final ui aw = new ui(0, 1, Long.class, new ua());
   public static final ui ak = new ui(1, 2, String.class, new uk());
   public final int aj;
   public final int ai;
   final uo as;
   public static final ui ap = new ui(2, 0, Integer.class, new uf());
   public final Class ay;
   static final int bh = 1;
   static final int bn = 14;
   static vv at;

   public static ui ak(Class var0, int var1) {
      try {
         ui[] var2 = ap((byte)41);

         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var1 <= -252105840) {
               throw new IllegalStateException();
            }

            ui var4 = var2[var3];
            if (var0 == var4.ay) {
               if (var1 <= -252105840) {
                  throw new IllegalStateException();
               }

               return var4;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ui.ak(" + ')');
      }
   }

   public Object ac(vl var1) {
      return this.as.aw(var1, (short)-3942);
   }

   public Object ad(vl var1) {
      return this.as.aw(var1, (short)688);
   }

   public static void aj(Object var0, vl var1, int var2) {
      try {
         uo var3 = ai(var0.getClass(), -805336762);
         var3.ap(var0, var1, (byte)-55);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ui.aj(" + ')');
      }
   }

   static uo ai(Class var0, int var1) {
      try {
         ui var2 = ak(var0, 1944308342);
         if (null == var2) {
            if (var1 <= -1413589627) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            return var2.as;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ui.ai(" + ')');
      }
   }

   public static ui[] at() {
      return new ui[]{ak, ap, aw};
   }

   public Object ay(vl var1, byte var2) {
      try {
         return this.as.aw(var1, (short)-9735);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ui.ay(" + ')');
      }
   }

   public int as() {
      return this.ai * -561719529;
   }

   public static ui[] ae() {
      return new ui[]{ak, ap, aw};
   }

   public static ui[] am() {
      return new ui[]{ak, ap, aw};
   }

   public static int aw(int var0, int var1, byte var2) {
      try {
         return var1 + (-3 - var0 << 8);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ui.aw(" + ')');
      }
   }

   public static ui[] ap(byte var0) {
      try {
         return new ui[]{ak, ap, aw};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ui.ap(" + ')');
      }
   }

   public int aw(int var1) {
      try {
         return this.ai * -561719529;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ui.aw(" + ')');
      }
   }

   public static ui ao(Class var0) {
      ui[] var1 = ap((byte)57);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         ui var3 = var1[var2];
         if (var0 == var3.ay) {
            return var3;
         }
      }

      return null;
   }

   public static void af(Object var0, vl var1) {
      uo var2 = ai(var0.getClass(), -421861155);
      var2.ap(var0, var1, (byte)-36);
   }

   public static ui an(Class var0) {
      ui[] var1 = ap((byte)19);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         ui var3 = var1[var2];
         if (var0 == var3.ay) {
            return var3;
         }
      }

      return null;
   }

   static uo ab(Class var0) {
      ui var1 = ak(var0, 1240142168);
      if (null == var1) {
         throw new IllegalArgumentException();
      } else {
         return var1.as;
      }
   }

   static uo az(Class var0) {
      ui var1 = ak(var0, -152039582);
      if (null == var1) {
         throw new IllegalArgumentException();
      } else {
         return var1.as;
      }
   }

   public Object ag(vl var1) {
      return this.as.aw(var1, (short)-26608);
   }

   public static ui au(Class var0) {
      ui[] var1 = ap((byte)121);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         ui var3 = var1[var2];
         if (var0 == var3.ay) {
            return var3;
         }
      }

      return null;
   }

   public static void ar(Object var0, vl var1) {
      uo var2 = ai(var0.getClass(), 1688408468);
      var2.ap(var0, var1, (byte)-52);
   }

   static ct ae(byte var0) {
      try {
         ct.as = 0;
         return ge.am((byte)-116);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ui.ae(" + ')');
      }
   }

   ui(int var1, int var2, Class var3, uo var4) {
      try {
         super();
         this.aj = var1 * 729675899;
         this.ai = var2 * -919351129;
         this.ay = var3;
         this.as = var4;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ui.<init>(" + ')');
      }
   }

   static fn[] ap(int var0) {
      try {
         return new fn[]{fn.ap, fn.aw, fn.ak, fn.aj, fn.ai, fn.ay, fn.as, fn.ae, fn.am, fn.at, fn.au, fn.an, fn.ao, fn.af, fn.ar, fn.ab, fn.az};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ui.ap(" + ')');
      }
   }

   static int ah(int var0, da var1, boolean var2, int var3) {
      try {
         if (3200 == var0) {
            if (var3 <= -246135301) {
               throw new IllegalStateException();
            } else {
               dp.am -= -57961013;
               aw.hn(cm.ae[dp.am * -158156887], cm.ae[1 + dp.am * -158156887], cm.ae[dp.am * -158156887 + 2], 2017095857);
               return 1;
            }
         } else {
            int var6;
            int var7;
            int var8;
            int var14;
            int var17;
            if (var0 == 3201) {
               if (var3 <= -246135301) {
                  throw new IllegalStateException();
               } else {
                  dp.am -= 1335054077;
                  var14 = cm.ae[-158156887 * dp.am];
                  var17 = cm.ae[1 + -158156887 * dp.am];
                  var6 = cm.ae[-158156887 * dp.am + 2];
                  var7 = cm.ae[-158156887 * dp.am + 3];
                  var8 = cm.ae[dp.am * -158156887 + 4];
                  ArrayList var16 = new ArrayList();
                  var16.add(var14);
                  lf.hk(var16, var17, var6, var7, var8, (byte)102);
                  return 1;
               }
            } else if (var0 == 3202) {
               if (var3 <= -246135301) {
                  throw new IllegalStateException();
               } else {
                  dp.am -= 1393015090;
                  ha.hm(cm.ae[dp.am * -158156887], cm.ae[dp.am * -158156887 + 1], (byte)90);
                  return 1;
               }
            } else {
               db var4;
               ds var5;
               String var12;
               if (var0 != 3212) {
                  if (var3 <= -246135301) {
                     throw new IllegalStateException();
                  }

                  if (var0 != 3213) {
                     if (var3 <= -246135301) {
                        throw new IllegalStateException();
                     }

                     if (var0 != 3209) {
                        if (var3 <= -246135301) {
                           throw new IllegalStateException();
                        }

                        if (var0 != 3181) {
                           if (var3 <= -246135301) {
                              throw new IllegalStateException();
                           }

                           if (3203 != var0) {
                              if (var3 <= -246135301) {
                                 throw new IllegalStateException();
                              }

                              if (var0 != 3205 && var0 != 3207) {
                                 boolean var13;
                                 byte var23;
                                 if (var0 != 3214) {
                                    if (var3 <= -246135301) {
                                       throw new IllegalStateException();
                                    }

                                    if (var0 != 3215) {
                                       if (var3 <= -246135301) {
                                          throw new IllegalStateException();
                                       }

                                       if (3210 != var0) {
                                          if (var3 <= -246135301) {
                                             throw new IllegalStateException();
                                          }

                                          if (3182 != var0 && var0 != 3204) {
                                             if (var3 <= -246135301) {
                                                throw new IllegalStateException();
                                             }

                                             if (3206 != var0) {
                                                if (var3 <= -246135301) {
                                                   throw new IllegalStateException();
                                                }

                                                if (var0 != 3208) {
                                                   if (3211 == var0) {
                                                      return 1;
                                                   }

                                                   byte var18;
                                                   if (3216 == var0) {
                                                      if (var3 <= -246135301) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var14 = cm.ae[(dp.am -= -1450976103) * -158156887];
                                                      var18 = 0;
                                                      db var22 = (db)gu.ap(eq.ap(1819674309), var14, -1875781163);
                                                      if (null != var22) {
                                                         if (var3 <= -246135301) {
                                                            throw new IllegalStateException();
                                                         }

                                                         if (db.ap != var22) {
                                                            if (var3 <= -246135301) {
                                                               throw new IllegalStateException();
                                                            }

                                                            var23 = 1;
                                                         } else {
                                                            var23 = 0;
                                                         }

                                                         var18 = var23;
                                                      }

                                                      cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var18;
                                                      return 1;
                                                   }

                                                   if (var0 == 3218) {
                                                      var14 = cm.ae[(dp.am -= -1450976103) * -158156887];
                                                      var18 = 0;
                                                      ds var21 = (ds)gu.ap(iu.ap(-1114059793), var14, -1875781163);
                                                      if (var21 != null) {
                                                         if (var3 <= -246135301) {
                                                            throw new IllegalStateException();
                                                         }

                                                         if (ds.ap != var21) {
                                                            if (var3 <= -246135301) {
                                                               throw new IllegalStateException();
                                                            }

                                                            var23 = 1;
                                                         } else {
                                                            var23 = 0;
                                                         }

                                                         var18 = var23;
                                                      }

                                                      cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var18;
                                                      return 1;
                                                   }

                                                   if (var0 != 3217) {
                                                      if (var3 <= -246135301) {
                                                         throw new IllegalStateException();
                                                      }

                                                      if (var0 != 3219) {
                                                         if (3220 == var0) {
                                                            if (var3 <= -246135301) {
                                                               throw new IllegalStateException();
                                                            }

                                                            dp.am -= 1393015090;
                                                            var14 = cm.ae[dp.am * -158156887];
                                                            var17 = cm.ae[1 + -158156887 * dp.am];
                                                            gg.aj(var14, var17, -827812379);
                                                            return 1;
                                                         }

                                                         if (var0 == 3221) {
                                                            if (var3 <= -246135301) {
                                                               throw new IllegalStateException();
                                                            }

                                                            dp.am -= -115922026;
                                                            var14 = cm.ae[-158156887 * dp.am];
                                                            var17 = cm.ae[dp.am * -158156887 + 1];
                                                            var6 = cm.ae[2 + -158156887 * dp.am];
                                                            var7 = cm.ae[3 + dp.am * -158156887];
                                                            var8 = cm.ae[4 + dp.am * -158156887];
                                                            int var9 = cm.ae[-158156887 * dp.am + 5];
                                                            ArrayList var10 = new ArrayList();
                                                            var10.add(var14);
                                                            var10.add(var17);
                                                            lf.hk(var10, var6, var7, var8, var9, (byte)-118);
                                                            return 1;
                                                         }

                                                         if (3222 == var0) {
                                                            if (var3 <= -246135301) {
                                                               throw new IllegalStateException();
                                                            }

                                                            dp.am -= -1508937116;
                                                            var14 = cm.ae[dp.am * -158156887];
                                                            var17 = cm.ae[-158156887 * dp.am + 1];
                                                            var6 = cm.ae[2 + -158156887 * dp.am];
                                                            var7 = cm.ae[dp.am * -158156887 + 3];
                                                            lp.ay(var14, var17, var6, var7, (byte)-95);
                                                            return 1;
                                                         }

                                                         return 2;
                                                      }

                                                      if (var3 <= -246135301) {
                                                         throw new IllegalStateException();
                                                      }
                                                   }

                                                   var4 = db.ap;
                                                   var5 = ds.ap;
                                                   var13 = true;
                                                   boolean var20 = true;
                                                   if (3217 == var0) {
                                                      var8 = cm.ae[(dp.am -= -1450976103) * -158156887];
                                                      var4 = (db)gu.ap(eq.ap(1218020212), var8, -1875781163);
                                                      if (null == var4) {
                                                         if (var3 <= -246135301) {
                                                            throw new IllegalStateException();
                                                         }

                                                         throw new RuntimeException(String.format("Unrecognized device option %d", var8));
                                                      }
                                                   }

                                                   if (3219 == var0) {
                                                      if (var3 <= -246135301) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var8 = cm.ae[(dp.am -= -1450976103) * -158156887];
                                                      var5 = (ds)gu.ap(iu.ap(-385858005), var8, -1875781163);
                                                      if (null == var5) {
                                                         if (var3 <= -246135301) {
                                                            throw new IllegalStateException();
                                                         }

                                                         throw new RuntimeException(String.format("Unrecognized game option %d", var8));
                                                      }
                                                   }

                                                   String var15;
                                                   byte var19;
                                                   if (var5 == ds.ap) {
                                                      if (var3 <= -246135301) {
                                                         throw new IllegalStateException();
                                                      }

                                                      switch(var4.as * -730926097) {
                                                      case 1:
                                                      case 2:
                                                      case 3:
                                                         var19 = 0;
                                                         var7 = 1;
                                                         break;
                                                      case 4:
                                                         var19 = 0;
                                                         var7 = Integer.MAX_VALUE;
                                                         break;
                                                      case 5:
                                                         var19 = 0;
                                                         var7 = 100;
                                                         break;
                                                      default:
                                                         var15 = String.format("Unkown device option: %s.", var4.toString());
                                                         throw new RuntimeException(var15);
                                                      }
                                                   } else {
                                                      switch(1504516419 * var5.ay) {
                                                      case 1:
                                                         var19 = 0;
                                                         var7 = 1;
                                                         break;
                                                      case 2:
                                                      case 3:
                                                      case 4:
                                                         var19 = 0;
                                                         var7 = 100;
                                                         break;
                                                      default:
                                                         var15 = String.format("Unkown game option: %s.", var5.toString());
                                                         throw new RuntimeException(var15);
                                                      }
                                                   }

                                                   cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var19;
                                                   cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var7;
                                                   return 1;
                                                }

                                                if (var3 <= -246135301) {
                                                   throw new IllegalStateException();
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }

                                 var4 = db.ap;
                                 var5 = ds.ap;
                                 var13 = false;
                                 if (var0 == 3214) {
                                    if (var3 <= -246135301) {
                                       throw new IllegalStateException();
                                    }

                                    var7 = cm.ae[(dp.am -= -1450976103) * -158156887];
                                    var4 = (db)gu.ap(eq.ap(692543732), var7, -1875781163);
                                    if (null == var4) {
                                       if (var3 <= -246135301) {
                                          throw new IllegalStateException();
                                       }

                                       throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                                    }
                                 }

                                 if (3215 == var0) {
                                    var7 = cm.ae[(dp.am -= -1450976103) * -158156887];
                                    var5 = (ds)gu.ap(iu.ap(-1176938884), var7, -1875781163);
                                    if (var5 == null) {
                                       throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                                    }
                                 }

                                 if (var0 == 3210) {
                                    if (var3 <= -246135301) {
                                       throw new IllegalStateException();
                                    }

                                    var7 = cm.ae[(dp.am -= -1450976103) * -158156887];
                                    var4 = (db)gu.ap(eq.ap(1873391416), var7, -1875781163);
                                    if (var4 == null) {
                                       if (var3 <= -246135301) {
                                          throw new IllegalStateException();
                                       }

                                       var5 = (ds)gu.ap(iu.ap(200125908), var7, -1875781163);
                                       if (null == var5) {
                                          if (var3 <= -246135301) {
                                             throw new IllegalStateException();
                                          }

                                          throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                                       }
                                    }
                                 } else if (3182 == var0) {
                                    var4 = db.ay;
                                 } else if (var0 == 3204) {
                                    if (var3 <= -246135301) {
                                       throw new IllegalStateException();
                                    }

                                    var5 = ds.ak;
                                 } else if (var0 == 3206) {
                                    if (var3 <= -246135301) {
                                       throw new IllegalStateException();
                                    }

                                    var5 = ds.aj;
                                 } else if (var0 == 3208) {
                                    if (var3 <= -246135301) {
                                       throw new IllegalStateException();
                                    }

                                    var5 = ds.ai;
                                 }

                                 if (var5 == ds.ap) {
                                    switch(var4.as * -730926097) {
                                    case 1:
                                       if (io.vx.as(2113848072)) {
                                          if (var3 <= -246135301) {
                                             throw new IllegalStateException();
                                          }

                                          var23 = 1;
                                       } else {
                                          var23 = 0;
                                       }

                                       var6 = var23;
                                       break;
                                    case 2:
                                       if (io.vx.am(2127692587)) {
                                          if (var3 <= -246135301) {
                                             throw new IllegalStateException();
                                          }

                                          var23 = 1;
                                       } else {
                                          var23 = 0;
                                       }

                                       var6 = var23;
                                       break;
                                    case 3:
                                       var6 = io.vx.an(1252159327) ? 1 : 0;
                                       break;
                                    case 4:
                                       var6 = io.vx.af(-1627200970);
                                       break;
                                    case 5:
                                       var6 = av.nf(1255685348);
                                       break;
                                    default:
                                       var12 = String.format("Unkown device option: %s.", var4.toString());
                                       throw new RuntimeException(var12);
                                    }
                                 } else {
                                    switch(var5.ay * 1504516419) {
                                    case 1:
                                       if (io.vx.ai(453243522)) {
                                          if (var3 <= -246135301) {
                                             throw new IllegalStateException();
                                          }

                                          var23 = 1;
                                       } else {
                                          var23 = 0;
                                       }

                                       var6 = var23;
                                       break;
                                    case 2:
                                       var7 = io.vx.ag((byte)65);
                                       var6 = Math.round((float)(var7 * 100) / 255.0F);
                                       break;
                                    case 3:
                                       var7 = io.vx.ac(1754467493);
                                       var6 = Math.round((float)(100 * var7) / 127.0F);
                                       break;
                                    case 4:
                                       var7 = io.vx.ax(-355338081);
                                       var6 = Math.round((float)(100 * var7) / 127.0F);
                                       break;
                                    default:
                                       var12 = String.format("Unkown game option: %s.", var5.toString());
                                       throw new RuntimeException(var12);
                                    }
                                 }

                                 cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var6;
                                 return 1;
                              }
                           }
                        }
                     }
                  }
               }

               var4 = db.ap;
               var5 = ds.ap;
               var6 = cm.ae[(dp.am -= -1450976103) * -158156887];
               if (var0 == 3212) {
                  if (var3 <= -246135301) {
                     throw new IllegalStateException();
                  }

                  var7 = cm.ae[(dp.am -= -1450976103) * -158156887];
                  var4 = (db)gu.ap(eq.ap(1220862804), var7, -1875781163);
                  if (null == var4) {
                     if (var3 <= -246135301) {
                        throw new IllegalStateException();
                     }

                     throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                  }
               }

               if (3213 == var0) {
                  var7 = cm.ae[(dp.am -= -1450976103) * -158156887];
                  var5 = (ds)gu.ap(iu.ap(659131672), var7, -1875781163);
                  if (var5 == null) {
                     throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                  }
               }

               if (3209 == var0) {
                  if (var3 <= -246135301) {
                     throw new IllegalStateException();
                  }

                  var7 = cm.ae[(dp.am -= -1450976103) * -158156887];
                  var4 = (db)gu.ap(eq.ap(515191634), var7, -1875781163);
                  if (null == var4) {
                     var5 = (ds)gu.ap(iu.ap(678414488), var7, -1875781163);
                     if (var5 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                     }
                  }
               } else if (var0 == 3181) {
                  if (var3 <= -246135301) {
                     throw new IllegalStateException();
                  }

                  var4 = db.ay;
               } else if (3203 == var0) {
                  if (var3 <= -246135301) {
                     throw new IllegalStateException();
                  }

                  var5 = ds.ak;
               } else if (3205 == var0) {
                  if (var3 <= -246135301) {
                     throw new IllegalStateException();
                  }

                  var5 = ds.aj;
               } else if (3207 == var0) {
                  if (var3 <= -246135301) {
                     throw new IllegalStateException();
                  }

                  var5 = ds.ai;
               }

               if (var5 == ds.ap) {
                  di var10000;
                  boolean var10001;
                  switch(-730926097 * var4.as) {
                  case 1:
                     var10000 = io.vx;
                     if (1 == var6) {
                        if (var3 <= -246135301) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     var10000.ay(var10001, 291357996);
                     break;
                  case 2:
                     var10000 = io.vx;
                     if (1 == var6) {
                        if (var3 <= -246135301) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     var10000.ae(var10001, 2004617824);
                     break;
                  case 3:
                     var10000 = io.vx;
                     if (var6 == 1) {
                        if (var3 <= -246135301) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     var10000.at(var10001, 215890300);
                     break;
                  case 4:
                     if (var6 < 0) {
                        var6 = 0;
                     }

                     io.vx.ao(var6, -114988147);
                     break;
                  case 5:
                     gh.nh(var6, -318251261);
                     break;
                  default:
                     var12 = String.format("Unkown device option: %s.", var4.toString());
                     throw new RuntimeException(var12);
                  }
               } else {
                  switch(1504516419 * var5.ay) {
                  case 1:
                     io.vx.aj(1 == var6, -1322188838);
                     break;
                  case 2:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     var7 = Math.round((float)(var6 * 255) / 100.0F);
                     qd.nv(var7, (byte)-25);
                     break;
                  case 3:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     var7 = Math.round((float)(127 * var6) / 100.0F);
                     ne.nx(var7, (byte)0);
                     break;
                  case 4:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     var7 = Math.round((float)(127 * var6) / 100.0F);
                     hr.nq(var7, 785677358);
                     break;
                  default:
                     var12 = String.format("Unkown game option: %s.", var5.toString());
                     throw new RuntimeException(var12);
                  }
               }

               return 1;
            }
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "ui.ah(" + ')');
      }
   }

   static void ai(float[] var0, int[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            if (var4 != -1450976103) {
               throw new IllegalStateException();
            }

            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            float var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for(int var9 = var2; var9 < var3; ++var9) {
               if (var4 != -1450976103) {
                  throw new IllegalStateException();
               }

               if (var0[var9] < var7) {
                  float var10 = var0[var9];
                  var0[var9] = var0[var6];
                  var0[var6] = var10;
                  int var11 = var1[var9];
                  var1[var9] = var1[var6];
                  var1[var6++] = var11;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            ai(var0, var1, var2, var6 - 1, -1450976103);
            ai(var0, var1, var6 + 1, var3, -1450976103);
         }

      } catch (RuntimeException var12) {
         throw tm.aw(var12, "ui.ai(" + ')');
      }
   }
}
