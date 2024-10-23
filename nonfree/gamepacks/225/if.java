import java.util.HashMap;
import java.util.Map;

public class if extends tr {
   public int bh;
   static boolean ac = false;
   int ap;
   int ah;
   static ml at = new ml(64);
   static ml au = new ml(100);
   public static final int ae = 0;
   int[] az;
   public Map ad;
   boolean[] ay;
   public static final int af = 5;
   public int[] ab;
   static ml ar = new ml(100);
   public int[] aa;
   public ie[] ai;
   public int ao;
   int[] as;
   static final int dq = 20;
   public boolean aj;
   public int av;
   public int aw;
   public static final int am = 2;
   public int ak;
   public boolean bn;
   static po ax;
   public int bd;
   public int bx;
   public static final int ex = 4;
   public int al;
   public int an;
   static final byte aq = 0;

   void bf(vf var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.ct(-1624477993);
         this.aa = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.aa[var4] = var1.ct(-1625006392);
         }

         this.ab = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] = var1.ct(-1344208185);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] += var1.ct(-2055581196) << 16;
         }
      } else if (var2 == 2) {
         this.ao = var1.ct(-1955927124) * -418448949;
      } else if (var2 == 3) {
         var3 = var1.cv(952452697);
         this.as = new int[1 + var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.as[var4] = var1.cv(952452697);
         }

         this.as[var3] = 9999999;
      } else if (var2 == 4) {
         this.aj = true;
      } else if (5 == var2) {
         this.av = var1.cv(952452697) * 508526453;
      } else if (var2 == 6) {
         this.aw = var1.ct(-1396628508) * 1404179519;
      } else if (7 == var2) {
         this.an = var1.ct(-1605539341) * 1497944937;
      } else if (var2 == 8) {
         this.ak = var1.cv(952452697) * -1746233695;
         this.bn = true;
      } else if (9 == var2) {
         this.bh = var1.cv(952452697) * -1364442453;
      } else if (10 == var2) {
         this.bd = var1.cv(952452697) * 919301087;
      } else if (11 == var2) {
         this.bx = var1.cv(952452697) * -513476203;
      } else if (12 == var2) {
         var3 = var1.cv(952452697);
         this.az = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.az[var4] = var1.ct(-1463723324);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.az[var4] += var1.ct(-1538587981) << 16;
         }
      } else {
         boolean var8;
         boolean var9;
         boolean var10;
         int var14;
         int var16;
         int var17;
         if (13 == var2) {
            var3 = var1.cv(952452697);
            this.ai = new ie[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               ie[] var5;
               ie var7;
               label199: {
                  var5 = this.ai;
                  if (null != var1) {
                     var8 = false;
                     var9 = false;
                     var10 = false;
                     boolean var11 = false;
                     var14 = var1.ct(-1775141467);
                     var16 = var1.cv(952452697);
                     var17 = var1.cv(952452697);
                     int var18 = var1.cv(952452697);
                     if (var14 >= 1 && var16 >= 1 && var17 >= 0 && var18 >= 0) {
                        var7 = new ie(var14, var16, var17, var18);
                        break label199;
                     }
                  }

                  var7 = null;
               }

               var5[var4] = var7;
            }
         } else if (14 == var2) {
            this.al = var1.cz(-1734056172) * 606473933;
         } else if (15 == var2) {
            var3 = var1.ct(-1469103733);
            this.ad = new HashMap();

            for(var4 = 0; var4 < var3; ++var4) {
               ie var6;
               int var12;
               label156: {
                  var12 = var1.ct(-1589676293);
                  if (null != var1) {
                     boolean var13 = false;
                     var8 = false;
                     var9 = false;
                     var10 = false;
                     int var15 = var1.ct(-1739842883);
                     var14 = var1.cv(952452697);
                     var16 = var1.cv(952452697);
                     var17 = var1.cv(952452697);
                     if (var15 >= 1 && var14 >= 1 && var16 >= 0 && var17 >= 0) {
                        var6 = new ie(var15, var14, var16, var17);
                        break label156;
                     }
                  }

                  var6 = null;
               }

               this.ad.put(var12, var6);
            }
         } else if (var2 == 16) {
            this.ah = var1.ct(-1392837391) * -295629933;
            this.ap = var1.ct(-1980377224) * -865111057;
         } else if (17 == var2) {
            this.ay = new boolean[256];

            for(var3 = 0; var3 < this.ay.length; ++var3) {
               this.ay[var3] = false;
            }

            var3 = var1.cv(952452697);

            for(var4 = 0; var4 < var3; ++var4) {
               this.ay[var1.cv(952452697)] = true;
            }
         }
      }

   }

   void ag(vf var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cv(952452697);
            if (0 == var3) {
               if (var2 == 1723330881) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.am(var1, var3, (byte)-76);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "if.ag(" + ')');
      }
   }

   void am(vf var1, int var2, byte var3) {
      try {
         int var4;
         int var5;
         if (var2 == 1) {
            if (var3 >= 1) {
               return;
            }

            var4 = var1.ct(-1618695735);
            this.aa = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               this.aa[var5] = var1.ct(-1842214453);
            }

            this.ab = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               this.ab[var5] = var1.ct(-1319420821);
            }

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 >= 1) {
                  return;
               }

               this.ab[var5] += var1.ct(-1804721697) << 16;
            }
         } else if (var2 == 2) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            this.ao = var1.ct(-2005458268) * -418448949;
         } else if (var2 == 3) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var4 = var1.cv(952452697);
            this.as = new int[1 + var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.as[var5] = var1.cv(952452697);
            }

            this.as[var4] = 9999999;
         } else if (var2 == 4) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            this.aj = true;
         } else if (5 == var2) {
            if (var3 >= 1) {
               return;
            }

            this.av = var1.cv(952452697) * 508526453;
         } else if (var2 == 6) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            this.aw = var1.ct(-2078686766) * 1404179519;
         } else if (7 == var2) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            this.an = var1.ct(-1997622711) * 1497944937;
         } else if (var2 == 8) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            this.ak = var1.cv(952452697) * -1746233695;
            this.bn = true;
         } else if (9 == var2) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            this.bh = var1.cv(952452697) * -1364442453;
         } else if (10 == var2) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            this.bd = var1.cv(952452697) * 919301087;
         } else if (11 == var2) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            this.bx = var1.cv(952452697) * -513476203;
         } else if (12 == var2) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var4 = var1.cv(952452697);
            this.az = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               this.az[var5] = var1.ct(-1955025669);
            }

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               this.az[var5] += var1.ct(-1510423481) << 16;
            }
         } else {
            boolean var9;
            boolean var10;
            boolean var11;
            int var16;
            int var18;
            int var19;
            if (13 == var2) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               var4 = var1.cv(952452697);
               this.ai = new ie[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  ie[] var6;
                  ie var8;
                  label294: {
                     var6 = this.ai;
                     if (null != var1) {
                        if (var3 >= 1) {
                           return;
                        }

                        var9 = false;
                        var10 = false;
                        var11 = false;
                        boolean var12 = false;
                        var16 = var1.ct(-1490095178);
                        var18 = var1.cv(952452697);
                        var19 = var1.cv(952452697);
                        int var20 = var1.cv(952452697);
                        if (var16 >= 1) {
                           if (var3 >= 1) {
                              throw new IllegalStateException();
                           }

                           if (var18 >= 1) {
                              if (var3 >= 1) {
                                 throw new IllegalStateException();
                              }

                              if (var19 >= 0) {
                                 if (var3 >= 1) {
                                    throw new IllegalStateException();
                                 }

                                 if (var20 >= 0) {
                                    if (var3 >= 1) {
                                       return;
                                    }

                                    var8 = new ie(var16, var18, var19, var20);
                                    break label294;
                                 }
                              }
                           }
                        }
                     }

                     var8 = null;
                  }

                  var6[var5] = var8;
               }
            } else if (14 == var2) {
               this.al = var1.cz(-1734056172) * 606473933;
            } else if (15 == var2) {
               if (var3 >= 1) {
                  return;
               }

               var4 = var1.ct(-2074011639);
               this.ad = new HashMap();

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  ie var7;
                  int var14;
                  label263: {
                     var14 = var1.ct(-1585131417);
                     if (null != var1) {
                        if (var3 >= 1) {
                           throw new IllegalStateException();
                        }

                        boolean var15 = false;
                        var9 = false;
                        var10 = false;
                        var11 = false;
                        int var17 = var1.ct(-1585648116);
                        var16 = var1.cv(952452697);
                        var18 = var1.cv(952452697);
                        var19 = var1.cv(952452697);
                        if (var17 >= 1) {
                           if (var3 >= 1) {
                              throw new IllegalStateException();
                           }

                           if (var16 >= 1) {
                              if (var3 >= 1) {
                                 throw new IllegalStateException();
                              }

                              if (var18 >= 0) {
                                 if (var3 >= 1) {
                                    throw new IllegalStateException();
                                 }

                                 if (var19 >= 0) {
                                    var7 = new ie(var17, var16, var18, var19);
                                    break label263;
                                 }
                              }
                           }
                        }
                     }

                     var7 = null;
                  }

                  this.ad.put(var14, var7);
               }
            } else if (var2 == 16) {
               this.ah = var1.ct(-1655031359) * -295629933;
               this.ap = var1.ct(-1461165460) * -865111057;
            } else if (17 == var2) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               this.ay = new boolean[256];

               for(var4 = 0; var4 < this.ay.length; ++var4) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  this.ay[var4] = false;
               }

               var4 = var1.cv(952452697);

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 >= 1) {
                     return;
                  }

                  this.ay[var1.cv(952452697)] = true;
               }
            }
         }

      } catch (RuntimeException var13) {
         throw vk.ae(var13, "if.am(" + ')');
      }
   }

   void bh(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.am(var1, var2, (byte)-40);
      }
   }

   public jm aq(jm var1, int var2, int var3) {
      try {
         jm var5;
         if (!this.ad(-1857337532)) {
            if (var3 != 181956277) {
               throw new IllegalStateException();
            } else {
               var2 = this.ab[var2];
               jk var7 = gb.ap(var2 >> 16, -830039348);
               var2 &= 65535;
               if (null == var7) {
                  if (var3 != 181956277) {
                     throw new IllegalStateException();
                  } else {
                     return var1.ax(true);
                  }
               } else {
                  var5 = var1.ax(!var7.ac(var2, 466876774));
                  var5.aa(var7, var2);
                  return var5;
               }
            }
         } else {
            fo var4 = ex.aa(this.al * -1824748027, -1270007656);
            if (null == var4) {
               if (var3 != 181956277) {
                  throw new IllegalStateException();
               } else {
                  return var1.ax(true);
               }
            } else {
               boolean var10001;
               if (!var4.ax(-1837013714)) {
                  if (var3 != 181956277) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var5 = var1.ax(var10001);
               var5.ai(var4, var2);
               return var5;
            }
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "if.aq(" + ')');
      }
   }

   jm af(jm var1, int var2, int var3, int var4) {
      try {
         boolean var10001;
         jm var6;
         if (!this.ad(-1522456342)) {
            if (var4 >= -1416562378) {
               throw new IllegalStateException();
            } else {
               var2 = this.ab[var2];
               jk var8 = gb.ap(var2 >> 16, -830039348);
               var2 &= 65535;
               if (var8 == null) {
                  return var1.ax(true);
               } else {
                  if (!var8.ac(var2, 776330878)) {
                     if (var4 >= -1416562378) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var6 = var1.ax(var10001);
                  var3 &= 3;
                  if (1 == var3) {
                     if (var4 >= -1416562378) {
                        throw new IllegalStateException();
                     }

                     var6.bn();
                  } else if (2 == var3) {
                     if (var4 >= -1416562378) {
                        throw new IllegalStateException();
                     }

                     var6.ak();
                  } else if (var3 == 3) {
                     if (var4 >= -1416562378) {
                        throw new IllegalStateException();
                     }

                     var6.an();
                  }

                  var6.aa(var8, var2);
                  if (1 == var3) {
                     if (var4 >= -1416562378) {
                        throw new IllegalStateException();
                     }

                     var6.an();
                  } else if (var3 == 2) {
                     if (var4 >= -1416562378) {
                        throw new IllegalStateException();
                     }

                     var6.ak();
                  } else if (var3 == 3) {
                     if (var4 >= -1416562378) {
                        throw new IllegalStateException();
                     }

                     var6.bn();
                  }

                  return var6;
               }
            }
         } else {
            fo var5 = ex.aa(this.al * -1824748027, 1237496358);
            if (null == var5) {
               if (var4 >= -1416562378) {
                  throw new IllegalStateException();
               } else {
                  return var1.ax(true);
               }
            } else {
               if (!var5.ax(-1768321366)) {
                  if (var4 >= -1416562378) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var6 = var1.ax(var10001);
               var3 &= 3;
               if (1 == var3) {
                  if (var4 >= -1416562378) {
                     throw new IllegalStateException();
                  }

                  var6.bn();
               } else if (2 == var3) {
                  if (var4 >= -1416562378) {
                     throw new IllegalStateException();
                  }

                  var6.ak();
               } else if (var3 == 3) {
                  if (var4 >= -1416562378) {
                     throw new IllegalStateException();
                  }

                  var6.an();
               }

               var6.ai(var5, var2);
               if (1 == var3) {
                  if (var4 >= -1416562378) {
                     throw new IllegalStateException();
                  }

                  var6.an();
               } else if (var3 == 2) {
                  if (var4 >= -1416562378) {
                     throw new IllegalStateException();
                  }

                  var6.ak();
               } else if (var3 == 3) {
                  if (var4 >= -1416562378) {
                     throw new IllegalStateException();
                  }

                  var6.bn();
               }

               return var6;
            }
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "if.af(" + ')');
      }
   }

   jm at(jm var1, int var2, int var3) {
      try {
         boolean var10001;
         jm var5;
         if (!this.ad(-2137425944)) {
            if (var3 == 1865046077) {
               throw new IllegalStateException();
            } else {
               var2 = this.ab[var2];
               jk var7 = gb.ap(var2 >> 16, -830039348);
               var2 &= 65535;
               if (var7 == null) {
                  if (var3 == 1865046077) {
                     throw new IllegalStateException();
                  } else {
                     return var1.aq(true);
                  }
               } else {
                  if (!var7.ac(var2, -195001073)) {
                     if (var3 == 1865046077) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var5 = var1.aq(var10001);
                  var5.aa(var7, var2);
                  return var5;
               }
            }
         } else {
            fo var4 = ex.aa(-1824748027 * this.al, 1263265429);
            if (null == var4) {
               if (var3 == 1865046077) {
                  throw new IllegalStateException();
               } else {
                  return var1.aq(true);
               }
            } else {
               if (!var4.ax(-1905121822)) {
                  if (var3 == 1865046077) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var5 = var1.aq(var10001);
               var5.ai(var4, var2);
               return var5;
            }
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "if.at(" + ')');
      }
   }

   public jm au(jm var1, int var2, if var3, int var4, int var5) {
      try {
         if (ac) {
            if (var5 == 1857713850) {
               throw new IllegalStateException();
            }

            if (!this.ad(-1840317238)) {
               if (var5 == 1857713850) {
                  throw new IllegalStateException();
               }

               if (!var3.ad(-2136762727)) {
                  if (var5 == 1857713850) {
                     throw new IllegalStateException();
                  }

                  return this.ar(var1, var2, var3, var4, (byte)127);
               }
            }
         }

         jm var6;
         jk var8;
         label169: {
            var6 = var1.ax(false);
            boolean var7 = false;
            var8 = null;
            jg var9 = null;
            fo var10;
            if (this.ad(-1897935785)) {
               var10 = this.az(-820155515);
               if (null == var10) {
                  if (var5 == 1857713850) {
                     throw new IllegalStateException();
                  }

                  return var6;
               }

               if (var3.ad(-2114708176) && this.ay == null) {
                  if (var5 == 1857713850) {
                     throw new IllegalStateException();
                  }

                  var6.ai(var10, var2);
                  return var6;
               }

               var9 = var10.am;
               boolean[] var10004 = this.ay;
               boolean var10006;
               if (!var3.ad(-1775846593)) {
                  if (var5 == 1857713850) {
                     throw new IllegalStateException();
                  }

                  var10006 = true;
               } else {
                  var10006 = false;
               }

               var6.aj(var9, var10, var2, var10004, false, var10006);
            } else {
               label171: {
                  var2 = this.ab[var2];
                  var8 = gb.ap(var2 >> 16, -830039348);
                  var2 &= 65535;
                  if (null == var8) {
                     if (var5 == 1857713850) {
                        throw new IllegalStateException();
                     }

                     return var3.aq(var1, var4, 181956277);
                  }

                  if (!var3.ad(-1801655338)) {
                     if (var5 == 1857713850) {
                        throw new IllegalStateException();
                     }

                     if (this.as == null) {
                        break label169;
                     }

                     if (var5 == 1857713850) {
                        throw new IllegalStateException();
                     }

                     if (-1 == var4) {
                        break label169;
                     }
                  }

                  if (this.as != null) {
                     if (var5 == 1857713850) {
                        throw new IllegalStateException();
                     }

                     if (-1 != var4) {
                        var7 = var3.ad(-1814856635);
                        if (!var7) {
                           if (var5 == 1857713850) {
                              throw new IllegalStateException();
                           }

                           var6.av(var8, var2, this.as, false);
                        }
                        break label171;
                     }
                  }

                  var6.aa(var8, var2);
                  return var6;
               }
            }

            if (var3.ad(-1781406379)) {
               if (var5 == 1857713850) {
                  throw new IllegalStateException();
               }

               var10 = var3.az(-2127810438);
               if (null == var10) {
                  if (var5 == 1857713850) {
                     throw new IllegalStateException();
                  }

                  return var6;
               }

               if (var9 == null) {
                  if (var5 == 1857713850) {
                     throw new IllegalStateException();
                  }

                  var9 = var10.am;
               }

               var6.aj(var9, var10, var4, this.ay, true, true);
            } else {
               var4 = var3.ab[var4];
               jk var12 = gb.ap(var4 >> 16, -830039348);
               var4 &= 65535;
               if (null == var12) {
                  return this.aq(var1, var2, 181956277);
               }

               var6.av(var12, var4, this.as, true);
            }

            if (var7) {
               if (var5 == 1857713850) {
                  throw new IllegalStateException();
               }

               if (var8 != null) {
                  if (var5 == 1857713850) {
                     throw new IllegalStateException();
                  }

                  var6.av(var8, var2, this.as, false);
               }
            }

            var6.az();
            return var6;
         }

         var6.aa(var8, var2);
         return var6;
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "if.au(" + ')');
      }
   }

   jm ar(jm var1, int var2, if var3, int var4, byte var5) {
      try {
         var2 = this.ab[var2];
         jk var6 = gb.ap(var2 >> 16, -830039348);
         var2 &= 65535;
         if (null == var6) {
            if (var5 <= 6) {
               throw new IllegalStateException();
            } else {
               return var3.aq(var1, var4, 181956277);
            }
         } else {
            var4 = var3.ab[var4];
            jk var7 = gb.ap(var4 >> 16, -830039348);
            var4 &= 65535;
            boolean var10001;
            jm var8;
            if (null == var7) {
               if (var5 <= 6) {
                  throw new IllegalStateException();
               } else {
                  if (!var6.ac(var2, 126143253)) {
                     if (var5 <= 6) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var8 = var1.ax(var10001);
                  var8.aa(var6, var2);
                  return var8;
               }
            } else {
               var10001 = !var6.ac(var2, -528518165);
               boolean var10002;
               if (!var7.ac(var4, -852896700)) {
                  if (var5 <= 6) {
                     throw new IllegalStateException();
                  }

                  var10002 = true;
               } else {
                  var10002 = false;
               }

               var8 = var1.ax(var10001 & var10002);
               var8.ay(var6, var2, var7, var4, this.as);
               return var8;
            }
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "if.ar(" + ')');
      }
   }

   public jm al(jm var1, int var2, int var3) {
      try {
         if (!this.ad(-1659496530)) {
            int var4 = this.ab[var2];
            jk var5 = gb.ap(var4 >> 16, -830039348);
            var4 &= 65535;
            if (null == var5) {
               if (var3 == 1179871107) {
                  throw new IllegalStateException();
               } else {
                  return var1.ax(true);
               }
            } else {
               jk var6 = null;
               int var7 = 0;
               if (this.az != null) {
                  if (var3 == 1179871107) {
                     throw new IllegalStateException();
                  }

                  if (var2 < this.az.length) {
                     var7 = this.az[var2];
                     var6 = gb.ap(var7 >> 16, -830039348);
                     var7 &= 65535;
                  }
               }

               boolean var10001;
               jm var8;
               if (null != var6) {
                  if (var3 == 1179871107) {
                     throw new IllegalStateException();
                  }

                  if (65535 != var7) {
                     if (!var5.ac(var4, -697729811)) {
                        if (var3 == 1179871107) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     var8 = var1.ax(var10001 & !var6.ac(var7, 1857552512));
                     var8.aa(var5, var4);
                     var8.aa(var6, var7);
                     return var8;
                  }
               }

               if (!var5.ac(var4, 955807801)) {
                  if (var3 == 1179871107) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var8 = var1.ax(var10001);
               var8.aa(var5, var4);
               return var8;
            }
         } else {
            return this.aq(var1, var2, 181956277);
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "if.al(" + ')');
      }
   }

   public boolean ad(int var1) {
      try {
         boolean var10000;
         if (this.al * -1824748027 >= 0) {
            if (var1 >= -1435583273) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "if.ad(" + ')');
      }
   }

   static jk bk(int var0) {
      jk var1 = (jk)au.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         po var3 = gl.aq;
         po var4 = hi.af;
         boolean var5 = true;
         int[] var6 = var3.cm(var0, -782850507);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.cf(var0, var6[var7], (byte)1);
            if (var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & 255) << 8 | var8[1] & 324427232;
               byte[] var10 = var4.cf(var9, 0, (byte)1);
               if (var10 == null) {
                  var5 = false;
               }
            }
         }

         jk var2;
         if (!var5) {
            var2 = null;
         } else {
            try {
               var2 = new jk(var3, var4, var0, false);
            } catch (Exception var11) {
               var2 = null;
            }
         }

         if (null != var2) {
            au.ag(var2, (long)var0);
         }

         return var2;
      }
   }

   fo az(int var1) {
      try {
         if (this.ad(-1820026851)) {
            if (var1 >= 332445237) {
               throw new IllegalStateException();
            } else {
               return ex.aa(this.al * -1824748027, 1321079060);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "if.az(" + ')');
      }
   }

   public static void as(po var0, po var1, po var2) {
      ax = var0;
      gl.aq = var1;
      hi.af = var2;
   }

   public static void ay(po var0, po var1, po var2) {
      ax = var0;
      gl.aq = var1;
      hi.af = var2;
   }

   public static int cn(int var0) {
      fo var1 = ba.ai(var0, -893490299);
      if (var1 == null) {
         return 2;
      } else {
         return var1.ag(-2100723664) ? 0 : 1;
      }
   }

   public static if av(int var0) {
      if var1 = (if)at.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ax.bt(12, var0, (byte)-84);
         var1 = new if();
         if (null != var2) {
            var1.ag(new vf(var2), 249526180);
         }

         var1.ax(1606483733);
         at.ag(var1, (long)var0);
         return var1;
      }
   }

   public boolean bo() {
      return this.al * -1824748027 >= 0;
   }

   public boolean bu() {
      return this.al * -1648158484 >= 0;
   }

   void ak(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.am(var1, var2, (byte)-22);
      }
   }

   void bn(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.am(var1, var2, (byte)-77);
      }
   }

   static jk be(int var0) {
      jk var1 = (jk)au.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         po var3 = gl.aq;
         po var4 = hi.af;
         boolean var5 = true;
         int[] var6 = var3.cm(var0, 1086716978);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.cf(var0, var6[var7], (byte)1);
            if (var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & 1731818138) << 8 | var8[1] & 138162502;
               byte[] var10 = var4.cf(var9, 0, (byte)1);
               if (var10 == null) {
                  var5 = false;
               }
            }
         }

         jk var2;
         if (!var5) {
            var2 = null;
         } else {
            try {
               var2 = new jk(var3, var4, var0, false);
            } catch (Exception var11) {
               var2 = null;
            }
         }

         if (null != var2) {
            au.ag(var2, (long)var0);
         }

         return var2;
      }
   }

   void bd(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.am(var1, var2, (byte)-12);
      }
   }

   void bs() {
      if (this.bh * -516016696 == -1) {
         if (null == this.as && null == this.ay) {
            this.bh = 0;
         } else {
            this.bh = 2060706863;
         }
      }

      if (-174815485 * this.bd == -1) {
         if (this.as == null && this.ay == null) {
            this.bd = 0;
         } else {
            this.bd = 1838602174;
         }
      }

   }

   static fo ct(int var0) {
      return et.ab(var0, (byte)-84) != 0 ? null : ba.ai(var0, -408777030);
   }

   void bm(vf var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.ct(-1500149331);
         this.aa = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.aa[var4] = var1.ct(-1945629225);
         }

         this.ab = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] = var1.ct(-2099945559);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] += var1.ct(-1904949401) << 16;
         }
      } else if (var2 == 2) {
         this.ao = var1.ct(-1615246182) * -418448949;
      } else if (var2 == 3) {
         var3 = var1.cv(952452697);
         this.as = new int[1 + var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.as[var4] = var1.cv(952452697);
         }

         this.as[var3] = 9999999;
      } else if (var2 == 4) {
         this.aj = true;
      } else if (5 == var2) {
         this.av = var1.cv(952452697) * 508526453;
      } else if (var2 == 6) {
         this.aw = var1.ct(-1468826583) * 1404179519;
      } else if (7 == var2) {
         this.an = var1.ct(-1643247321) * 1497944937;
      } else if (var2 == 8) {
         this.ak = var1.cv(952452697) * -1746233695;
         this.bn = true;
      } else if (9 == var2) {
         this.bh = var1.cv(952452697) * -1364442453;
      } else if (10 == var2) {
         this.bd = var1.cv(952452697) * 919301087;
      } else if (11 == var2) {
         this.bx = var1.cv(952452697) * -513476203;
      } else if (12 == var2) {
         var3 = var1.cv(952452697);
         this.az = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.az[var4] = var1.ct(-2017287103);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.az[var4] += var1.ct(-1577152903) << 16;
         }
      } else {
         boolean var8;
         boolean var9;
         boolean var10;
         int var14;
         int var16;
         int var17;
         if (13 == var2) {
            var3 = var1.cv(952452697);
            this.ai = new ie[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               ie[] var5;
               ie var7;
               label172: {
                  var5 = this.ai;
                  if (null != var1) {
                     var8 = false;
                     var9 = false;
                     var10 = false;
                     boolean var11 = false;
                     var14 = var1.ct(-1900294535);
                     var16 = var1.cv(952452697);
                     var17 = var1.cv(952452697);
                     int var18 = var1.cv(952452697);
                     if (var14 >= 1 && var16 >= 1 && var17 >= 0 && var18 >= 0) {
                        var7 = new ie(var14, var16, var17, var18);
                        break label172;
                     }
                  }

                  var7 = null;
               }

               var5[var4] = var7;
            }
         } else if (14 == var2) {
            this.al = var1.cz(-1734056172) * 606473933;
         } else if (15 == var2) {
            var3 = var1.ct(-2079550826);
            this.ad = new HashMap();

            for(var4 = 0; var4 < var3; ++var4) {
               ie var6;
               int var12;
               label157: {
                  var12 = var1.ct(-1513245122);
                  if (null != var1) {
                     boolean var13 = false;
                     var8 = false;
                     var9 = false;
                     var10 = false;
                     int var15 = var1.ct(-1789901035);
                     var14 = var1.cv(952452697);
                     var16 = var1.cv(952452697);
                     var17 = var1.cv(952452697);
                     if (var15 >= 1 && var14 >= 1 && var16 >= 0 && var17 >= 0) {
                        var6 = new ie(var15, var14, var16, var17);
                        break label157;
                     }
                  }

                  var6 = null;
               }

               this.ad.put(var12, var6);
            }
         } else if (var2 == 16) {
            this.ah = var1.ct(-1596464683) * -295629933;
            this.ap = var1.ct(-2028612079) * -865111057;
         } else if (17 == var2) {
            this.ay = new boolean[256];

            for(var3 = 0; var3 < this.ay.length; ++var3) {
               this.ay[var3] = false;
            }

            var3 = var1.cv(952452697);

            for(var4 = 0; var4 < var3; ++var4) {
               this.ay[var1.cv(952452697)] = true;
            }
         }
      }

   }

   public static void cl() {
      at.am();
      au.am();
      ar.am();
   }

   void bw() {
      if (this.bh * 1890691075 == -1) {
         if (null == this.as && null == this.ay) {
            this.bh = 0;
         } else {
            this.bh = 1566082390;
         }
      }

      if (761270303 * this.bd == -1) {
         if (this.as == null && this.ay == null) {
            this.bd = 0;
         } else {
            this.bd = 1318357170;
         }
      }

   }

   if() {
      try {
         super();
         this.al = -606473933;
         this.ah = 0;
         this.ap = 0;
         this.ao = 418448949;
         this.aj = false;
         this.av = -1752335031;
         this.aw = -1404179519;
         this.an = -1497944937;
         this.ak = -1078443965;
         this.bn = false;
         this.bh = 1364442453;
         this.bd = -919301087;
         this.bx = -1026952406;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "if.<init>(" + ')');
      }
   }

   jm bj(jm var1, int var2, int var3) {
      jm var5;
      if (!this.ad(-2144976128)) {
         var2 = this.ab[var2];
         jk var6 = gb.ap(var2 >> 16, -830039348);
         var2 &= 65535;
         if (var6 == null) {
            return var1.ax(true);
         } else {
            var5 = var1.ax(!var6.ac(var2, 2055607070));
            var3 &= 3;
            if (1 == var3) {
               var5.bn();
            } else if (2 == var3) {
               var5.ak();
            } else if (var3 == 3) {
               var5.an();
            }

            var5.aa(var6, var2);
            if (1 == var3) {
               var5.an();
            } else if (var3 == 2) {
               var5.ak();
            } else if (var3 == 3) {
               var5.bn();
            }

            return var5;
         }
      } else {
         fo var4 = ex.aa(this.al * -1824748027, -753164242);
         if (null == var4) {
            return var1.ax(true);
         } else {
            var5 = var1.ax(!var4.ax(-724608239));
            var3 &= 3;
            if (1 == var3) {
               var5.bn();
            } else if (2 == var3) {
               var5.ak();
            } else if (var3 == 3) {
               var5.an();
            }

            var5.ai(var4, var2);
            if (1 == var3) {
               var5.an();
            } else if (var3 == 2) {
               var5.ak();
            } else if (var3 == 3) {
               var5.bn();
            }

            return var5;
         }
      }
   }

   jm bp(jm var1, int var2, int var3) {
      jm var5;
      if (!this.ad(-2063300449)) {
         var2 = this.ab[var2];
         jk var6 = gb.ap(var2 >> 16, -830039348);
         var2 &= 65535;
         if (var6 == null) {
            return var1.ax(true);
         } else {
            var5 = var1.ax(!var6.ac(var2, -98907665));
            var3 &= 3;
            if (1 == var3) {
               var5.bn();
            } else if (2 == var3) {
               var5.ak();
            } else if (var3 == 3) {
               var5.an();
            }

            var5.aa(var6, var2);
            if (1 == var3) {
               var5.an();
            } else if (var3 == 2) {
               var5.ak();
            } else if (var3 == 3) {
               var5.bn();
            }

            return var5;
         }
      } else {
         fo var4 = ex.aa(this.al * -1824748027, -140324186);
         if (null == var4) {
            return var1.ax(true);
         } else {
            var5 = var1.ax(!var4.ax(-694000522));
            var3 &= 3;
            if (1 == var3) {
               var5.bn();
            } else if (2 == var3) {
               var5.ak();
            } else if (var3 == 3) {
               var5.an();
            }

            var5.ai(var4, var2);
            if (1 == var3) {
               var5.an();
            } else if (var3 == 2) {
               var5.ak();
            } else if (var3 == 3) {
               var5.bn();
            }

            return var5;
         }
      }
   }

   jm by(jm var1, int var2) {
      jm var4;
      if (!this.ad(-1579979033)) {
         var2 = this.ab[var2];
         jk var5 = gb.ap(var2 >> 16, -830039348);
         var2 &= 65535;
         if (var5 == null) {
            return var1.aq(true);
         } else {
            var4 = var1.aq(!var5.ac(var2, -798666018));
            var4.aa(var5, var2);
            return var4;
         }
      } else {
         fo var3 = ex.aa(-1824748027 * this.al, -827966862);
         if (null == var3) {
            return var1.aq(true);
         } else {
            var4 = var1.aq(!var3.ax(891506153));
            var4.ai(var3, var2);
            return var4;
         }
      }
   }

   static void ac(int var0, byte var1) {
      try {
         qf.ag = -305952625 * var0;
         qf.ae = new qf[var0];
         am = 0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "if.ac(" + ')');
      }
   }

   public static fo cw(int var0) {
      fo var1 = (fo)ar.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         var1 = ef.ac(gl.aq, hi.af, var0, false, -1892237793);
         if (var1 != null) {
            ar.ag(var1, (long)var0);
         }

         return var1;
      }
   }

   public jm bb(jm var1, int var2, if var3, int var4) {
      if (ac && !this.ad(-1442888540) && !var3.ad(-1976488378)) {
         return this.ar(var1, var2, var3, var4, (byte)64);
      } else {
         jm var5 = var1.ax(false);
         boolean var6 = false;
         jk var7 = null;
         jg var8 = null;
         fo var9;
         if (this.ad(-1918298355)) {
            var9 = this.az(-798322813);
            if (null == var9) {
               return var5;
            }

            if (var3.ad(-2112901551) && this.ay == null) {
               var5.ai(var9, var2);
               return var5;
            }

            var8 = var9.am;
            var5.aj(var8, var9, var2, this.ay, false, !var3.ad(-1553933449));
         } else {
            var2 = this.ab[var2];
            var7 = gb.ap(var2 >> 16, -830039348);
            var2 &= 65535;
            if (null == var7) {
               return var3.aq(var1, var4, 181956277);
            }

            if (!var3.ad(-1568550466) && (this.as == null || -1 == var4)) {
               var5.aa(var7, var2);
               return var5;
            }

            if (this.as == null || -1 == var4) {
               var5.aa(var7, var2);
               return var5;
            }

            var6 = var3.ad(-1785438433);
            if (!var6) {
               var5.av(var7, var2, this.as, false);
            }
         }

         if (var3.ad(-1776913363)) {
            var9 = var3.az(-574537916);
            if (null == var9) {
               return var5;
            }

            if (var8 == null) {
               var8 = var9.am;
            }

            var5.aj(var8, var9, var4, this.ay, true, true);
         } else {
            var4 = var3.ab[var4];
            jk var10 = gb.ap(var4 >> 16, -830039348);
            var4 &= -1063176646;
            if (null == var10) {
               return this.aq(var1, var2, 181956277);
            }

            var5.av(var10, var4, this.as, true);
         }

         if (var6 && var7 != null) {
            var5.av(var7, var2, this.as, false);
         }

         var5.az();
         return var5;
      }
   }

   public jm bl(jm var1, int var2) {
      if (!this.ad(-1995602666)) {
         int var3 = this.ab[var2];
         jk var4 = gb.ap(var3 >> 16, -830039348);
         var3 &= 65535;
         if (null == var4) {
            return var1.ax(true);
         } else {
            jk var5 = null;
            int var6 = 0;
            if (this.az != null && var2 < this.az.length) {
               var6 = this.az[var2];
               var5 = gb.ap(var6 >> 16, -830039348);
               var6 &= 65535;
            }

            jm var7;
            if (null != var5 && 65535 != var6) {
               var7 = var1.ax(!var4.ac(var3, -996087719) & !var5.ac(var6, 706527918));
               var7.aa(var4, var3);
               var7.aa(var5, var6);
               return var7;
            } else {
               var7 = var1.ax(!var4.ac(var3, -969953969));
               var7.aa(var4, var3);
               return var7;
            }
         }
      } else {
         return this.aq(var1, var2, 181956277);
      }
   }

   public static fo cc(int var0) {
      fo var1 = (fo)ar.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         var1 = ef.ac(gl.aq, hi.af, var0, false, -1892237793);
         if (var1 != null) {
            ar.ag(var1, (long)var0);
         }

         return var1;
      }
   }

   static fo cv(int var0) {
      return et.ab(var0, (byte)-112) != 0 ? null : ba.ai(var0, -1057476990);
   }

   public boolean br() {
      return this.al * -1824748027 >= 0;
   }

   public static void aj(po var0, po var1, po var2) {
      ax = var0;
      gl.aq = var1;
      hi.af = var2;
   }

   public int bv() {
      return this.ap * -1985864945 - this.ah * -1326134629;
   }

   public int bt() {
      return this.ap * -1985864945 - this.ah * -1326134629;
   }

   public int bq() {
      return this.ap * -1985864945 - this.ah * -1326134629;
   }

   void bx(vf var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.ct(-1863874390);
         this.aa = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.aa[var4] = var1.ct(-1528292889);
         }

         this.ab = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] = var1.ct(-1961674132);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] += var1.ct(-2086701185) << 16;
         }
      } else if (var2 == 2) {
         this.ao = var1.ct(-1936430614) * -418448949;
      } else if (var2 == 3) {
         var3 = var1.cv(952452697);
         this.as = new int[1 + var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.as[var4] = var1.cv(952452697);
         }

         this.as[var3] = 9999999;
      } else if (var2 == 4) {
         this.aj = true;
      } else if (5 == var2) {
         this.av = var1.cv(952452697) * 508526453;
      } else if (var2 == 6) {
         this.aw = var1.ct(-1676598792) * 1404179519;
      } else if (7 == var2) {
         this.an = var1.ct(-1662024267) * 1497944937;
      } else if (var2 == 8) {
         this.ak = var1.cv(952452697) * -1746233695;
         this.bn = true;
      } else if (9 == var2) {
         this.bh = var1.cv(952452697) * -1364442453;
      } else if (10 == var2) {
         this.bd = var1.cv(952452697) * 919301087;
      } else if (11 == var2) {
         this.bx = var1.cv(952452697) * -513476203;
      } else if (12 == var2) {
         var3 = var1.cv(952452697);
         this.az = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.az[var4] = var1.ct(-1971361805);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.az[var4] += var1.ct(-1509659406) << 16;
         }
      } else {
         boolean var8;
         boolean var9;
         boolean var10;
         int var14;
         int var16;
         int var17;
         if (13 == var2) {
            var3 = var1.cv(952452697);
            this.ai = new ie[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               ie[] var5;
               ie var7;
               label177: {
                  var5 = this.ai;
                  if (null != var1) {
                     var8 = false;
                     var9 = false;
                     var10 = false;
                     boolean var11 = false;
                     var14 = var1.ct(-1564950402);
                     var16 = var1.cv(952452697);
                     var17 = var1.cv(952452697);
                     int var18 = var1.cv(952452697);
                     if (var14 >= 1 && var16 >= 1 && var17 >= 0 && var18 >= 0) {
                        var7 = new ie(var14, var16, var17, var18);
                        break label177;
                     }
                  }

                  var7 = null;
               }

               var5[var4] = var7;
            }
         } else if (14 == var2) {
            this.al = var1.cz(-1734056172) * 606473933;
         } else if (15 == var2) {
            var3 = var1.ct(-2052077815);
            this.ad = new HashMap();

            for(var4 = 0; var4 < var3; ++var4) {
               ie var6;
               int var12;
               label162: {
                  var12 = var1.ct(-1988669240);
                  if (null != var1) {
                     boolean var13 = false;
                     var8 = false;
                     var9 = false;
                     var10 = false;
                     int var15 = var1.ct(-1882467159);
                     var14 = var1.cv(952452697);
                     var16 = var1.cv(952452697);
                     var17 = var1.cv(952452697);
                     if (var15 >= 1 && var14 >= 1 && var16 >= 0 && var17 >= 0) {
                        var6 = new ie(var15, var14, var16, var17);
                        break label162;
                     }
                  }

                  var6 = null;
               }

               this.ad.put(var12, var6);
            }
         } else if (var2 == 16) {
            this.ah = var1.ct(-1696942839) * -295629933;
            this.ap = var1.ct(-2146210216) * -865111057;
         } else if (17 == var2) {
            this.ay = new boolean[256];

            for(var3 = 0; var3 < this.ay.length; ++var3) {
               this.ay[var3] = false;
            }

            var3 = var1.cv(952452697);

            for(var4 = 0; var4 < var3; ++var4) {
               this.ay[var1.cv(952452697)] = true;
            }
         }
      }

   }

   static fo co(int var0) {
      return et.ab(var0, (byte)-107) != 0 ? null : ba.ai(var0, 1022307634);
   }

   public static int bc(int var0) {
      fo var1 = ba.ai(var0, -797331071);
      if (var1 == null) {
         return 2;
      } else {
         return var1.ag(-1517027260) ? 0 : 1;
      }
   }

   fo ci() {
      return this.ad(-1811754082) ? ex.aa(this.al * -1824748027, -769339512) : null;
   }

   public static int ch(int var0) {
      fo var1 = ba.ai(var0, 249051080);
      if (var1 == null) {
         return 2;
      } else {
         return var1.ag(-1956736468) ? 0 : 1;
      }
   }

   public static int cf(int var0) {
      fo var1 = ba.ai(var0, -1764222700);
      if (var1 == null) {
         return 2;
      } else {
         return var1.ag(-1967723264) ? 0 : 1;
      }
   }

   public static int cu(int var0) {
      fo var1 = ba.ai(var0, -1718859391);
      if (var1 == null) {
         return 2;
      } else {
         return var1.ag(-1708065794) ? 0 : 1;
      }
   }

   static int cn(int var0, dt var1, boolean var2, byte var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "if.cn(" + ')');
      }
   }

   fo cj() {
      return this.ad(-1522113131) ? ex.aa(this.al * -1824748027, -146637101) : null;
   }

   fo cx() {
      return this.ad(-1487806284) ? ex.aa(this.al * -1824748027, 1154837496) : null;
   }

   jm ba(jm var1, int var2, int var3) {
      jm var5;
      if (!this.ad(-1645196810)) {
         var2 = this.ab[var2];
         jk var6 = gb.ap(var2 >> 16, -830039348);
         var2 &= 65535;
         if (var6 == null) {
            return var1.ax(true);
         } else {
            var5 = var1.ax(!var6.ac(var2, -1069261856));
            var3 &= 3;
            if (1 == var3) {
               var5.bn();
            } else if (2 == var3) {
               var5.ak();
            } else if (var3 == 3) {
               var5.an();
            }

            var5.aa(var6, var2);
            if (1 == var3) {
               var5.an();
            } else if (var3 == 2) {
               var5.ak();
            } else if (var3 == 3) {
               var5.bn();
            }

            return var5;
         }
      } else {
         fo var4 = ex.aa(this.al * -1824748027, 552053372);
         if (null == var4) {
            return var1.ax(true);
         } else {
            var5 = var1.ax(!var4.ax(742900432));
            var3 &= 3;
            if (1 == var3) {
               var5.bn();
            } else if (2 == var3) {
               var5.ak();
            } else if (var3 == 3) {
               var5.an();
            }

            var5.ai(var4, var2);
            if (1 == var3) {
               var5.an();
            } else if (var3 == 2) {
               var5.ak();
            } else if (var3 == 3) {
               var5.bn();
            }

            return var5;
         }
      }
   }

   public static if aw(int var0) {
      if var1 = (if)at.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ax.bt(12, var0, (byte)-75);
         var1 = new if();
         if (null != var2) {
            var1.ag(new vf(var2), 1275197954);
         }

         var1.ax(663095843);
         at.ag(var1, (long)var0);
         return var1;
      }
   }

   public jm bi(jm var1, int var2, if var3, int var4) {
      if (ac && !this.ad(-1740320404) && !var3.ad(-1808621950)) {
         return this.ar(var1, var2, var3, var4, (byte)27);
      } else {
         jm var5 = var1.ax(false);
         boolean var6 = false;
         jk var7 = null;
         jg var8 = null;
         fo var9;
         if (this.ad(-1555359803)) {
            var9 = this.az(-2100082087);
            if (null == var9) {
               return var5;
            }

            if (var3.ad(-1558089745) && this.ay == null) {
               var5.ai(var9, var2);
               return var5;
            }

            var8 = var9.am;
            var5.aj(var8, var9, var2, this.ay, false, !var3.ad(-1865722142));
         } else {
            var2 = this.ab[var2];
            var7 = gb.ap(var2 >> 16, -830039348);
            var2 &= 65535;
            if (null == var7) {
               return var3.aq(var1, var4, 181956277);
            }

            if (!var3.ad(-1486912077) && (this.as == null || -1 == var4)) {
               var5.aa(var7, var2);
               return var5;
            }

            if (this.as == null || -1 == var4) {
               var5.aa(var7, var2);
               return var5;
            }

            var6 = var3.ad(-1817661866);
            if (!var6) {
               var5.av(var7, var2, this.as, false);
            }
         }

         if (var3.ad(-1634729085)) {
            var9 = var3.az(-757308034);
            if (null == var9) {
               return var5;
            }

            if (var8 == null) {
               var8 = var9.am;
            }

            var5.aj(var8, var9, var4, this.ay, true, true);
         } else {
            var4 = var3.ab[var4];
            jk var10 = gb.ap(var4 >> 16, -830039348);
            var4 &= 65535;
            if (null == var10) {
               return this.aq(var1, var2, 181956277);
            }

            var5.av(var10, var4, this.as, true);
         }

         if (var6 && var7 != null) {
            var5.av(var7, var2, this.as, false);
         }

         var5.az();
         return var5;
      }
   }

   public int ah(int var1) {
      try {
         return this.ap * -1985864945 - this.ah * -1326134629;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "if.ah(" + ')');
      }
   }

   static fo cg(int var0) {
      return et.ab(var0, (byte)-81) != 0 ? null : ba.ai(var0, 797913293);
   }

   void ax(int var1) {
      try {
         if (this.bh * 1890691075 == -1) {
            if (var1 <= 9210691) {
               throw new IllegalStateException();
            }

            if (null == this.as && null == this.ay) {
               this.bh = 0;
            } else {
               this.bh = 1566082390;
            }
         }

         if (761270303 * this.bd == -1) {
            if (this.as == null) {
               if (var1 <= 9210691) {
                  return;
               }

               if (this.ay == null) {
                  this.bd = 0;
                  return;
               }

               if (var1 <= 9210691) {
                  throw new IllegalStateException();
               }
            }

            this.bd = 1838602174;
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "if.ax(" + ')');
      }
   }

   public static fo cq(int var0) {
      fo var1 = (fo)ar.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         var1 = ef.ac(gl.aq, hi.af, var0, false, -1892237793);
         if (var1 != null) {
            ar.ag(var1, (long)var0);
         }

         return var1;
      }
   }

   fo cy() {
      return this.ad(-2098609605) ? ex.aa(this.al * -1824748027, 731350053) : null;
   }

   public static fo cz(int var0) {
      fo var1 = (fo)ar.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         var1 = ef.ac(gl.aq, hi.af, var0, false, -1892237793);
         if (var1 != null) {
            ar.ag(var1, (long)var0);
         }

         return var1;
      }
   }

   void an(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.am(var1, var2, (byte)-30);
      }
   }

   public static void cr() {
      at.am();
      au.am();
      ar.am();
   }

   public jm bz(jm var1, int var2) {
      if (!this.ad(-1613843798)) {
         int var3 = this.ab[var2];
         jk var4 = gb.ap(var3 >> 16, -830039348);
         var3 &= 65535;
         if (null == var4) {
            return var1.ax(true);
         } else {
            jk var5 = null;
            int var6 = 0;
            if (this.az != null && var2 < this.az.length) {
               var6 = this.az[var2];
               var5 = gb.ap(var6 >> 16, -830039348);
               var6 &= 65535;
            }

            jm var7;
            if (null != var5 && 65535 != var6) {
               var7 = var1.ax(!var4.ac(var3, 1122837161) & !var5.ac(var6, -2073615937));
               var7.aa(var4, var3);
               var7.aa(var5, var6);
               return var7;
            } else {
               var7 = var1.ax(!var4.ac(var3, -467896495));
               var7.aa(var4, var3);
               return var7;
            }
         }
      } else {
         return this.aq(var1, var2, 181956277);
      }
   }

   jm bg(jm var1, int var2, if var3, int var4) {
      var2 = this.ab[var2];
      jk var5 = gb.ap(var2 >> 16, -830039348);
      var2 &= 65535;
      if (null == var5) {
         return var3.aq(var1, var4, 181956277);
      } else {
         var4 = var3.ab[var4];
         jk var6 = gb.ap(var4 >> 16, -830039348);
         var4 &= 65535;
         jm var7;
         if (null == var6) {
            var7 = var1.ax(!var5.ac(var2, 1137926397));
            var7.aa(var5, var2);
            return var7;
         } else {
            var7 = var1.ax(!var5.ac(var2, -2074887040) & !var6.ac(var4, -1638900722));
            var7.ay(var5, var2, var6, var4, this.as);
            return var7;
         }
      }
   }

   fo cm() {
      return this.ad(-1899342524) ? ex.aa(this.al * -1824748027, 1482724989) : null;
   }
}
