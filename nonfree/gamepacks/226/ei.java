import java.net.URL;

public class ei {
   public static final String kh = "Please ensure date follows the format";
   volatile int aj;
   static int ak = -1279386158;
   static int aw = -1805480663;
   volatile byte[] ai;
   final URL ap;

   public static ir aw(int var0, int var1) {
      try {
         ir var2 = (ir)ir.aj.ap((long)var0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = gf.aw.bm(6, var0, 828478369);
            var2 = new ir();
            var2.am = var0 * -1620641583;
            if (null != var3) {
               if (var1 != 888461382) {
                  throw new IllegalStateException();
               }

               var2.aj(new vl(var3), (short)22211);
            }

            var2.ak(1418886514);
            if (var2.bt) {
               if (var1 != 888461382) {
                  throw new IllegalStateException();
               }

               var2.ad = 0;
               var2.ac = false;
            }

            ir.aj.ak(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ei.aw(" + ')');
      }
   }

   public boolean ap(int var1) {
      try {
         boolean var10000;
         if (-78082391 * this.aj != aw * 1311875303) {
            if (var1 == -1664015410) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ei.ap(" + ')');
      }
   }

   public byte[] aw(byte var1) {
      try {
         return this.ai;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ei.aw(" + ')');
      }
   }

   public String ak(int var1) {
      try {
         return this.ap.toString();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ei.ak(" + ')');
      }
   }

   public boolean aj() {
      return -78082391 * this.aj != aw * 1311875303;
   }

   static final int an(int var0) {
      try {
         return jr.aw * 1947001953;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ei.an(" + ')');
      }
   }

   public byte[] ay() {
      return this.ai;
   }

   static void ap(byte var0) {
      try {
         dg.ap = 1111963987;
         dg.aw = new short[4][104][104];
         dg.ak = new short[4][104][104];
         dg.aj = new byte[4][104][104];
         dg.ai = new byte[4][104][104];
         ua.ao = new int[4][105][105];
         dg.ay = new byte[4][105][105];
         dg.as = new int[105][105];
         dg.ae = new int[104];
         dg.am = new int[104];
         wk.at = new int[104];
         cr.au = new int[104];
         dg.an = new int[104];
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ei.ap(" + ')');
      }
   }

   ei(URL var1) {
      try {
         super();
         this.aj = -892650225 * aw;
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ei.<init>(" + ')');
      }
   }

   public String am() {
      return this.ap.toString();
   }

   public String at() {
      return this.ap.toString();
   }

   public String au() {
      return this.ap.toString();
   }

   public byte[] as() {
      return this.ai;
   }

   static void ay(pe var0, int var1, byte var2) {
      try {
         if ((var1 & vo.bx.aw(1837624059)) != 0) {
            if (var2 == 0) {
               return;
            }

            sg.au = ey.ai(var0, "logo_deadman_mode", "", -1770095722);
         } else if ((var1 & vo.bk.aw(1837624059)) != 0) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            sg.au = ey.ai(var0, "logo_seasonal_mode", "", -1770095722);
         } else if ((var1 & vo.am.aw(1837624059)) != 0) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            sg.au = ey.ai(var0, "logo_speedrunning", "", -1770095722);
         } else {
            sg.au = ey.ai(var0, "logo", "", -1770095722);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ei.ay(" + ')');
      }
   }

   static final void au(dn var0, int var1, int var2, int var3, int var4, int var5, int var6, ko var7, int var8) {
      try {
         if (client.cl && 0 == (var0.au[0][var2][var3] & 2)) {
            if (var8 <= -273358927) {
               throw new IllegalStateException();
            }

            if ((var0.au[var1][var2][var3] & 16) != 0) {
               if (var8 <= -273358927) {
                  return;
               }

               return;
            }
         }

         if (var1 < dg.ap * -213423439) {
            dg.ap = 1659805265 * var1;
         }

         ir var9;
         int var10;
         int var11;
         label861: {
            var9 = aw(var4, 888461382);
            if (1 != var5) {
               if (var8 <= -273358927) {
                  return;
               }

               if (3 != var5) {
                  var10 = -347110081 * var9.az;
                  var11 = var9.ag * -109800991;
                  break label861;
               }

               if (var8 <= -273358927) {
                  throw new IllegalStateException();
               }
            }

            var10 = -109800991 * var9.ag;
            var11 = -347110081 * var9.az;
         }

         int var12;
         int var13;
         if (var2 + var10 <= 1587254913 * var0.ai) {
            if (var8 <= -273358927) {
               throw new IllegalStateException();
            }

            var12 = var2 + (var10 >> 1);
            var13 = (1 + var10 >> 1) + var2;
         } else {
            var12 = var2;
            var13 = 1 + var2;
         }

         int var14;
         int var15;
         if (var3 + var11 <= var0.ay * -1000264093) {
            if (var8 <= -273358927) {
               throw new IllegalStateException();
            }

            var14 = var3 + (var11 >> 1);
            var15 = (1 + var11 >> 1) + var3;
         } else {
            var14 = var3;
            var15 = var3 + 1;
         }

         int[][] var16 = var0.at[var1];
         int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
         int var18 = (var2 << 7) + (var10 << 6);
         int var19 = (var11 << 6) + (var3 << 7);
         boolean var10003;
         if (var9.av * 266535841 == 0) {
            if (var8 <= -273358927) {
               throw new IllegalStateException();
            }

            var10003 = true;
         } else {
            var10003 = false;
         }

         long var20 = fd.at(var2, var3, 2, var10003, var4, -1948824391 * var0.ap, (byte)-113);
         int var22 = (var5 << 6) + var6;
         if (1 == 531867923 * var9.bs) {
            if (var8 <= -273358927) {
               throw new IllegalStateException();
            }

            var22 += 256;
         }

         if (var9.ab(-759597315)) {
            if (var8 <= -273358927) {
               throw new IllegalStateException();
            }

            fl.aj(var1, var2, var3, var9, var5, (byte)30);
         }

         ji var23 = var0.aw;
         Object var24;
         if (var6 == 22) {
            if (var8 > -273358927) {
               if (client.cl) {
                  if (var8 <= -273358927) {
                     return;
                  }

                  if (0 == 266535841 * var9.av) {
                     if (var8 <= -273358927) {
                        throw new IllegalStateException();
                     }

                     if (var9.ad * -1552861337 != 1) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        if (!var9.bu) {
                           if (var8 <= -273358927) {
                              return;
                           }

                           return;
                        }
                     }
                  }
               }

               label717: {
                  if (-1 == 1515763081 * var9.aa) {
                     if (var8 <= -273358927) {
                        throw new IllegalStateException();
                     }

                     if (null == var9.bm) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        var24 = var9.ae(22, var5, var16, var18, var17, var19, -1847806509);
                        break label717;
                     }
                  }

                  var24 = new dr(var0, var4, 22, var5, var1, var2, var3, 1515763081 * var9.aa, var9.be, (jv)null);
               }

               var23.as(var1, var2, var3, var17, (jv)var24, var20, var22);
               if (1 == var9.ad * -1552861337) {
                  if (var8 <= -273358927) {
                     return;
                  }

                  if (var7 != null) {
                     if (var8 <= -273358927) {
                        throw new IllegalStateException();
                     }

                     var7.ai(var2, var3, -1903749260);
                  }
               }

            }
         } else {
            int var25;
            if (10 != var6) {
               if (var8 <= -273358927) {
                  throw new IllegalStateException();
               }

               if (11 != var6) {
                  int[] var10000;
                  if (var6 >= 12) {
                     label728: {
                        if (var9.aa * 1515763081 == -1) {
                           if (var8 <= -273358927) {
                              return;
                           }

                           if (var9.bm == null) {
                              if (var8 <= -273358927) {
                                 return;
                              }

                              var24 = var9.ae(var6, var5, var16, var18, var17, var19, -2145931838);
                              break label728;
                           }
                        }

                        var24 = new dr(var0, var4, var6, var5, var1, var2, var3, 1515763081 * var9.aa, var9.be, (jv)null);
                     }

                     var23.af(var1, var2, var3, var17, 1, 1, (jv)var24, 0, var20, var22);
                     if (var6 >= 12 && var6 <= 17) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        if (13 != var6) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           if (var1 > 0) {
                              if (var8 <= -273358927) {
                                 throw new IllegalStateException();
                              }

                              var10000 = ua.ao[var1][var2];
                              var10000[var3] |= 2340;
                           }
                        }
                     }

                     if (var9.ad * -1552861337 != 0) {
                        if (var8 <= -273358927) {
                           return;
                        }

                        if (var7 != null) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           var7.ak(var2, var3, var10, var11, var9.ac, (byte)-20);
                        }
                     }

                     return;
                  }

                  if (0 == var6) {
                     if (var8 <= -273358927) {
                        throw new IllegalStateException();
                     }

                     label735: {
                        if (-1 == 1515763081 * var9.aa) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           if (null == var9.bm) {
                              if (var8 <= -273358927) {
                                 throw new IllegalStateException();
                              }

                              var24 = var9.ae(0, var5, var16, var18, var17, var19, -1797824223);
                              break label735;
                           }
                        }

                        var24 = new dr(var0, var4, 0, var5, var1, var2, var3, 1515763081 * var9.aa, var9.be, (jv)null);
                     }

                     var23.am(var1, var2, var3, var17, (jv)var24, (jv)null, dg.az[var5], 0, var20, var22);
                     if (0 == var5) {
                        if (var8 <= -273358927) {
                           return;
                        }

                        if (var9.bq) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           dg.ay[var1][var2][var3] = 50;
                           dg.ay[var1][var2][var3 + 1] = 50;
                        }

                        if (var9.al) {
                           if (var8 <= -273358927) {
                              return;
                           }

                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 585;
                        }
                     } else if (var5 == 1) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        if (var9.bq) {
                           dg.ay[var1][var2][var3 + 1] = 50;
                           dg.ay[var1][var2 + 1][1 + var3] = 50;
                        }

                        if (var9.al) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           var10000 = ua.ao[var1][var2];
                           var10000[1 + var3] |= 1170;
                        }
                     } else if (var5 == 2) {
                        if (var9.bq) {
                           if (var8 <= -273358927) {
                              return;
                           }

                           dg.ay[var1][var2 + 1][var3] = 50;
                           dg.ay[var1][var2 + 1][var3 + 1] = 50;
                        }

                        if (var9.al) {
                           var10000 = ua.ao[var1][var2 + 1];
                           var10000[var3] |= 585;
                        }
                     } else if (var5 == 3) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        if (var9.bq) {
                           if (var8 <= -273358927) {
                              return;
                           }

                           dg.ay[var1][var2][var3] = 50;
                           dg.ay[var1][var2 + 1][var3] = 50;
                        }

                        if (var9.al) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 1170;
                        }
                     }

                     if (0 != var9.ad * -1552861337) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        if (null != var7) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           var7.aw(var2, var3, var6, var5, var9.ac, (byte)-127);
                        }
                     }

                     if (16 != var9.ah * -1497041743) {
                        var23.ac(var1, var2, var3, var9.ah * -1497041743);
                     }

                     return;
                  }

                  if (1 == var6) {
                     if (var8 <= -273358927) {
                        throw new IllegalStateException();
                     }

                     label744: {
                        if (-1 == 1515763081 * var9.aa) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           if (var9.bm == null) {
                              if (var8 <= -273358927) {
                                 throw new IllegalStateException();
                              }

                              var24 = var9.ae(1, var5, var16, var18, var17, var19, -2123996684);
                              break label744;
                           }
                        }

                        var24 = new dr(var0, var4, 1, var5, var1, var2, var3, 1515763081 * var9.aa, var9.be, (jv)null);
                     }

                     var23.am(var1, var2, var3, var17, (jv)var24, (jv)null, dg.ag[var5], 0, var20, var22);
                     if (var9.bq) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        if (0 == var5) {
                           if (var8 <= -273358927) {
                              return;
                           }

                           dg.ay[var1][var2][1 + var3] = 50;
                        } else if (var5 == 1) {
                           if (var8 <= -273358927) {
                              return;
                           }

                           dg.ay[var1][var2 + 1][var3 + 1] = 50;
                        } else if (2 == var5) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           dg.ay[var1][1 + var2][var3] = 50;
                        } else if (var5 == 3) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           dg.ay[var1][var2][var3] = 50;
                        }
                     }

                     if (0 != -1552861337 * var9.ad) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        if (null != var7) {
                           var7.aw(var2, var3, var6, var5, var9.ac, (byte)-64);
                        }
                     }

                     return;
                  }

                  int var31;
                  if (var6 == 2) {
                     if (var8 <= -273358927) {
                        throw new IllegalStateException();
                     }

                     Object var33;
                     Object var34;
                     label753: {
                        var31 = 1 + var5 & 3;
                        if (var9.aa * 1515763081 == -1) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           if (var9.bm == null) {
                              if (var8 <= -273358927) {
                                 return;
                              }

                              var34 = var9.ae(2, 4 + var5, var16, var18, var17, var19, -1967796124);
                              var33 = var9.ae(2, var31, var16, var18, var17, var19, -2130434913);
                              break label753;
                           }
                        }

                        var34 = new dr(var0, var4, 2, var5 + 4, var1, var2, var3, var9.aa * 1515763081, var9.be, (jv)null);
                        var33 = new dr(var0, var4, 2, var31, var1, var2, var3, var9.aa * 1515763081, var9.be, (jv)null);
                     }

                     var23.am(var1, var2, var3, var17, (jv)var34, (jv)var33, dg.az[var5], dg.az[var31], var20, var22);
                     if (var9.al) {
                        if (var5 == 0) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 585;
                           var10000 = ua.ao[var1][var2];
                           var10000[var3 + 1] |= 1170;
                        } else if (var5 == 1) {
                           var10000 = ua.ao[var1][var2];
                           var10000[var3 + 1] |= 1170;
                           var10000 = ua.ao[var1][1 + var2];
                           var10000[var3] |= 585;
                        } else if (var5 == 2) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           var10000 = ua.ao[var1][var2 + 1];
                           var10000[var3] |= 585;
                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 1170;
                        } else if (3 == var5) {
                           if (var8 <= -273358927) {
                              return;
                           }

                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 1170;
                           var10000 = ua.ao[var1][var2];
                           var10000[var3] |= 585;
                        }
                     }

                     if (0 != var9.ad * -1552861337) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        if (null != var7) {
                           var7.aw(var2, var3, var6, var5, var9.ac, (byte)-45);
                        }
                     }

                     if (16 != var9.ah * -1497041743) {
                        var23.ac(var1, var2, var3, -1497041743 * var9.ah);
                     }

                     return;
                  }

                  if (var6 == 3) {
                     if (var8 <= -273358927) {
                        return;
                     }

                     if (1515763081 * var9.aa == -1 && null == var9.bm) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        var24 = var9.ae(3, var5, var16, var18, var17, var19, -2101282825);
                     } else {
                        var24 = new dr(var0, var4, 3, var5, var1, var2, var3, 1515763081 * var9.aa, var9.be, (jv)null);
                     }

                     var23.am(var1, var2, var3, var17, (jv)var24, (jv)null, dg.ag[var5], 0, var20, var22);
                     if (var9.bq) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        if (var5 == 0) {
                           if (var8 <= -273358927) {
                              return;
                           }

                           dg.ay[var1][var2][1 + var3] = 50;
                        } else if (var5 == 1) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           dg.ay[var1][1 + var2][1 + var3] = 50;
                        } else if (var5 == 2) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           dg.ay[var1][var2 + 1][var3] = 50;
                        } else if (var5 == 3) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           dg.ay[var1][var2][var3] = 50;
                        }
                     }

                     if (-1552861337 * var9.ad != 0) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        if (null != var7) {
                           if (var8 <= -273358927) {
                              return;
                           }

                           var7.aw(var2, var3, var6, var5, var9.ac, (byte)-51);
                        }
                     }

                     return;
                  }

                  if (9 == var6) {
                     if (var8 <= -273358927) {
                        throw new IllegalStateException();
                     }

                     label770: {
                        if (var9.aa * 1515763081 == -1) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           if (var9.bm == null) {
                              if (var8 <= -273358927) {
                                 throw new IllegalStateException();
                              }

                              var24 = var9.ae(var6, var5, var16, var18, var17, var19, -2089492072);
                              break label770;
                           }
                        }

                        var24 = new dr(var0, var4, var6, var5, var1, var2, var3, 1515763081 * var9.aa, var9.be, (jv)null);
                     }

                     var23.af(var1, var2, var3, var17, 1, 1, (jv)var24, 0, var20, var22);
                     if (0 != -1552861337 * var9.ad) {
                        if (var8 <= -273358927) {
                           return;
                        }

                        if (null != var7) {
                           var7.ak(var2, var3, var10, var11, var9.ac, (byte)51);
                        }
                     }

                     if (var9.ah * -1497041743 != 16) {
                        var23.ac(var1, var2, var3, var9.ah * -1497041743);
                     }

                     return;
                  }

                  if (4 == var6) {
                     if (-1 == var9.aa * 1515763081 && null == var9.bm) {
                        if (var8 <= -273358927) {
                           return;
                        }

                        var24 = var9.ae(4, var5, var16, var18, var17, var19, -1805653335);
                     } else {
                        var24 = new dr(var0, var4, 4, var5, var1, var2, var3, 1515763081 * var9.aa, var9.be, (jv)null);
                     }

                     var23.at(var1, var2, var3, var17, (jv)var24, (jv)null, dg.az[var5], 0, 0, 0, var20, var22);
                     return;
                  }

                  long var32;
                  Object var35;
                  if (var6 == 5) {
                     if (var8 <= -273358927) {
                        throw new IllegalStateException();
                     }

                     var31 = 16;
                     var32 = var23.bx(var1, var2, var3);
                     if (0L != var32) {
                        var31 = aw(la.ae(var32), 888461382).ah * -1497041743;
                     }

                     label786: {
                        if (1515763081 * var9.aa == -1) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           if (null == var9.bm) {
                              if (var8 <= -273358927) {
                                 throw new IllegalStateException();
                              }

                              var35 = var9.ae(4, var5, var16, var18, var17, var19, -1772688877);
                              break label786;
                           }
                        }

                        var35 = new dr(var0, var4, 4, var5, var1, var2, var3, var9.aa * 1515763081, var9.be, (jv)null);
                     }

                     var23.at(var1, var2, var3, var17, (jv)var35, (jv)null, dg.az[var5], 0, var31 * dg.ad[var5], dg.ac[var5] * var31, var20, var22);
                     return;
                  }

                  if (6 == var6) {
                     if (var8 <= -273358927) {
                        throw new IllegalStateException();
                     }

                     var31 = 8;
                     var32 = var23.bx(var1, var2, var3);
                     if (var32 != 0L) {
                        if (var8 <= -273358927) {
                           return;
                        }

                        var31 = aw(la.ae(var32), 888461382).ah * -1497041743 / 2;
                     }

                     label797: {
                        if (1515763081 * var9.aa == -1) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           if (var9.bm == null) {
                              if (var8 <= -273358927) {
                                 throw new IllegalStateException();
                              }

                              var35 = var9.ae(4, 4 + var5, var16, var18, var17, var19, -1742984955);
                              break label797;
                           }
                        }

                        var35 = new dr(var0, var4, 4, 4 + var5, var1, var2, var3, var9.aa * 1515763081, var9.be, (jv)null);
                     }

                     var23.at(var1, var2, var3, var17, (jv)var35, (jv)null, 256, var5, var31 * dg.av[var5], var31 * dg.ax[var5], var20, var22);
                     return;
                  }

                  if (7 == var6) {
                     if (var8 <= -273358927) {
                        return;
                     }

                     label808: {
                        var25 = 2 + var5 & 3;
                        if (var9.aa * 1515763081 == -1) {
                           if (var8 <= -273358927) {
                              return;
                           }

                           if (var9.bm == null) {
                              if (var8 <= -273358927) {
                                 throw new IllegalStateException();
                              }

                              var24 = var9.ae(4, 4 + var25, var16, var18, var17, var19, -1880387923);
                              break label808;
                           }
                        }

                        var24 = new dr(var0, var4, 4, var25 + 4, var1, var2, var3, 1515763081 * var9.aa, var9.be, (jv)null);
                     }

                     var23.at(var1, var2, var3, var17, (jv)var24, (jv)null, 256, var25, 0, 0, var20, var22);
                     return;
                  }

                  if (8 != var6) {
                     return;
                  }

                  if (var8 <= -273358927) {
                     throw new IllegalStateException();
                  }

                  var31 = 8;
                  var32 = var23.bx(var1, var2, var3);
                  if (0L != var32) {
                     var31 = aw(la.ae(var32), 888461382).ah * -1497041743 / 2;
                  }

                  Object var28;
                  label815: {
                     int var29 = var5 + 2 & 3;
                     if (-1 == 1515763081 * var9.aa) {
                        if (var8 <= -273358927) {
                           return;
                        }

                        if (var9.bm == null) {
                           var35 = var9.ae(4, var5 + 4, var16, var18, var17, var19, -1983051672);
                           var28 = var9.ae(4, 4 + var29, var16, var18, var17, var19, -1833433771);
                           break label815;
                        }
                     }

                     var35 = new dr(var0, var4, 4, var5 + 4, var1, var2, var3, 1515763081 * var9.aa, var9.be, (jv)null);
                     var28 = new dr(var0, var4, 4, var29 + 4, var1, var2, var3, 1515763081 * var9.aa, var9.be, (jv)null);
                  }

                  var23.at(var1, var2, var3, var17, (jv)var35, (jv)var28, 256, var5, var31 * dg.av[var5], dg.ax[var5] * var31, var20, var22);
                  return;
               }

               if (var8 <= -273358927) {
                  return;
               }
            }

            if (1515763081 * var9.aa == -1 && null == var9.bm) {
               if (var8 <= -273358927) {
                  throw new IllegalStateException();
               }

               var24 = var9.ae(10, var5, var16, var18, var17, var19, -2134648394);
            } else {
               var24 = new dr(var0, var4, 10, var5, var1, var2, var3, var9.aa * 1515763081, var9.be, (jv)null);
            }

            if (var24 != null) {
               if (var8 <= -273358927) {
                  throw new IllegalStateException();
               }

               short var10008;
               if (var6 == 11) {
                  if (var8 <= -273358927) {
                     throw new IllegalStateException();
                  }

                  var10008 = 256;
               } else {
                  var10008 = 0;
               }

               if (var23.af(var1, var2, var3, var17, var10, var11, (jv)var24, var10008, var20, var22) && var9.bq) {
                  if (var8 <= -273358927) {
                     return;
                  }

                  var25 = 15;
                  if (var24 instanceof jy) {
                     if (var8 <= -273358927) {
                        throw new IllegalStateException();
                     }

                     var25 = ((jy)var24).af() / 4;
                     if (var25 > 30) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        var25 = 30;
                     }
                  }

                  for(int var26 = 0; var26 <= var10; ++var26) {
                     for(int var27 = 0; var27 <= var11; ++var27) {
                        if (var8 <= -273358927) {
                           throw new IllegalStateException();
                        }

                        if (var25 > dg.ay[var1][var26 + var2][var27 + var3]) {
                           if (var8 <= -273358927) {
                              throw new IllegalStateException();
                           }

                           dg.ay[var1][var26 + var2][var27 + var3] = (byte)var25;
                        }
                     }
                  }
               }
            }

            if (var9.ad * -1552861337 != 0) {
               if (var8 <= -273358927) {
                  throw new IllegalStateException();
               }

               if (null != var7) {
                  if (var8 <= -273358927) {
                     throw new IllegalStateException();
                  }

                  var7.ak(var2, var3, var10, var11, var9.ac, (byte)-4);
               }
            }

         }
      } catch (RuntimeException var30) {
         throw tm.aw(var30, "ei.au(" + ')');
      }
   }

   public boolean ai() {
      return -78082391 * this.aj != aw * 1904839450;
   }

   public byte[] ae() {
      return this.ai;
   }
}
