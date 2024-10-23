import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class bc implements MouseListener, MouseMotionListener, FocusListener {
   public static int au = 0;
   static final int aw = 2;
   public static int ag = 0;
   public static int an = 0;
   public static volatile int ai = 0;
   static volatile int ay = 0;
   static volatile int as = 2071378615;
   public static long ao = 0L;
   static volatile int af = 0;
   public static int at = 0;
   static or fa;
   static final int ak = 4;
   static final int ap = 1;
   static volatile int ae = -920860393;
   static volatile long am = -588490052731697891L;
   static volatile int ab = 0;
   static volatile long az = 0L;
   static bc aj = new bc();
   public static int ad = 0;
   public static int ac = 0;
   public static long av = 0L;
   static volatile int ar = 0;
   public static final int ep = 4;
   static final int ch = 0;

   public final synchronized void mouseDragged(MouseEvent var1) {
      try {
         this.mouseMoved(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bc.mouseDragged(" + ')');
      }
   }

   final int aj(MouseEvent var1, int var2) {
      try {
         int var3 = var1.getButton();
         if (!var1.isAltDown()) {
            if (var3 != 2) {
               if (!var1.isMetaDown()) {
                  if (var2 != -397380741) {
                     throw new IllegalStateException();
                  }

                  if (var3 != 3) {
                     return 1;
                  }

                  if (var2 != -397380741) {
                     throw new IllegalStateException();
                  }
               }

               return 2;
            }

            if (var2 != -397380741) {
               throw new IllegalStateException();
            }
         }

         return 4;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bc.aj(" + ')');
      }
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      try {
         if (aj != null) {
            ai = 0;
            ar = var1.getX() * -387716065;
            ab = var1.getY() * -545616445;
            az = ck.ap(-755460989) * 28055428358902907L;
            af = this.aj(var1, -397380741) * 330387557;
            if (af * 351854957 != 0) {
               ay = af * 999619713;
            }
         }

         if (var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bc.mousePressed(" + ')');
      }
   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      try {
         if (aj != null) {
            ai = 0;
            ay = 0;
         }

         if (var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bc.mouseReleased(" + ')');
      }
   }

   public final synchronized void bh(FocusEvent var1) {
      if (aj != null) {
         ay = 0;
      }

   }

   public final synchronized void bt(MouseEvent var1) {
      if (null != aj) {
         ai = 0;
         as = var1.getX() * -2071378615;
         ae = var1.getY() * 920860393;
         am = var1.getWhen() * 588490052731697891L;
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      try {
         if (null != aj) {
            ai = 0;
            as = 2071378615;
            ae = -920860393;
            am = var1.getWhen() * 588490052731697891L;
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bc.mouseExited(" + ')');
      }
   }

   bc() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "bc.<init>(" + ')');
      }
   }

   public final void mouseClicked(MouseEvent var1) {
      try {
         if (var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bc.mouseClicked(" + ')');
      }
   }

   public final void focusGained(FocusEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bc.focusGained(" + ')');
      }
   }

   public final synchronized void focusLost(FocusEvent var1) {
      try {
         if (aj != null) {
            ay = 0;
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bc.focusLost(" + ')');
      }
   }

   public final synchronized void ah(FocusEvent var1) {
      if (aj != null) {
         ay = 0;
      }

   }

   public final void al(FocusEvent var1) {
   }

   public final void aa(FocusEvent var1) {
   }

   public final synchronized void bx(MouseEvent var1) {
      if (aj != null) {
         ai = 0;
         ay = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public static void as() {
      if (null != aj) {
         synchronized(aj) {
            aj = null;
         }
      }

   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      try {
         if (null != aj) {
            ai = 0;
            as = var1.getX() * -2071378615;
            ae = var1.getY() * 920860393;
            am = var1.getWhen() * 588490052731697891L;
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bc.mouseMoved(" + ')');
      }
   }

   public final synchronized void ab(MouseEvent var1) {
      if (aj != null) {
         ai = 0;
         ar = var1.getX() * -510104956;
         ab = var1.getY() * -545616445;
         az = ck.ap(-1480014847) * 28055428358902907L;
         af = this.aj(var1, -397380741) * -1966711839;
         if (af * 351854957 != 0) {
            ay = af * 1323312987;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   static void ai(Component var0) {
      var0.removeMouseListener(aj);
      var0.removeMouseMotionListener(aj);
      var0.removeFocusListener(aj);
      ay = 0;
   }

   static void ay(Component var0) {
      var0.removeMouseListener(aj);
      var0.removeMouseMotionListener(aj);
      var0.removeFocusListener(aj);
      ay = 0;
   }

   public static void ae() {
      synchronized(aj) {
         at = ay * 1101203633;
         au = -411137497 * as;
         an = ae * -481538989;
         ao = -4378454333020051293L * am;
         ag = -1058340435 * af;
         ad = ar * -1976495895;
         ac = 625295833 * ab;
         av = -6656553948820646249L * az;
         af = 0;
      }
   }

   public static void am() {
      synchronized(aj) {
         at = ay * 1101203633;
         au = -411137497 * as;
         an = ae * -481538989;
         ao = -4378454333020051293L * am;
         ag = -1058340435 * af;
         ad = ar * -1976495895;
         ac = 625295833 * ab;
         av = -6656553948820646249L * az;
         af = 0;
      }
   }

   public static void at() {
      synchronized(aj) {
         at = ay * 2016031658;
         au = -411137497 * as;
         an = ae * 1136767738;
         ao = -4378454333020051293L * am;
         ag = -1058340435 * af;
         ad = ar * -1976495895;
         ac = 625295833 * ab;
         av = -6656553948820646249L * az;
         af = 0;
      }
   }

   final int au(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   final int an(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void ao(MouseEvent var1) {
      if (aj != null) {
         ai = 0;
         ar = var1.getX() * -387716065;
         ab = var1.getY() * -545616445;
         az = ck.ap(-2095606022) * 28055428358902907L;
         af = this.aj(var1, -397380741) * 330387557;
         if (af * 351854957 != 0) {
            ay = af * 999619713;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void ax(MouseEvent var1) {
      if (aj != null) {
         ai = 0;
         ay = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void ar(MouseEvent var1) {
      if (aj != null) {
         ai = 0;
         ar = var1.getX() * 1769711717;
         ab = var1.getY() * -545616445;
         az = ck.ap(-1013595692) * 28055428358902907L;
         af = this.aj(var1, -397380741) * 330387557;
         if (af * 351854957 != 0) {
            ay = af * 999619713;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void bv(FocusEvent var1) {
      if (aj != null) {
         ay = 0;
      }

   }

   static final void av(dn var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ko var9, int var10) {
      try {
         ir var11 = ei.aw(var5, 888461382);
         int var10000;
         if (var8 >= 0) {
            if (var10 >= -2087938237) {
               return;
            }

            var10000 = var8;
         } else {
            var10000 = 1515763081 * var11.aa;
         }

         int var12;
         int var13;
         int var14;
         label524: {
            var12 = var10000;
            if (var6 != 1) {
               if (var10 >= -2087938237) {
                  throw new IllegalStateException();
               }

               if (var6 != 3) {
                  var13 = -347110081 * var11.az;
                  var14 = -109800991 * var11.ag;
                  break label524;
               }
            }

            var13 = var11.ag * -109800991;
            var14 = -347110081 * var11.az;
         }

         int var15;
         int var16;
         if (var3 + var13 <= var0.ai * 1587254913) {
            if (var10 >= -2087938237) {
               throw new IllegalStateException();
            }

            var15 = var3 + (var13 >> 1);
            var16 = var3 + (var13 + 1 >> 1);
         } else {
            var15 = var3;
            var16 = var3 + 1;
         }

         int var17;
         int var18;
         if (var14 + var4 <= -1000264093 * var0.ay) {
            if (var10 >= -2087938237) {
               throw new IllegalStateException();
            }

            var17 = (var14 >> 1) + var4;
            var18 = var4 + (var14 + 1 >> 1);
         } else {
            var17 = var4;
            var18 = var4 + 1;
         }

         int[][] var19 = var0.at[var2];
         int var20 = var19[var16][var18] + var19[var15][var17] + var19[var16][var17] + var19[var15][var18] >> 2;
         int var21 = (var3 << 7) + (var13 << 6);
         int var22 = (var4 << 7) + (var14 << 6);
         ji var23 = var0.aw;
         long var24 = fd.at(var3, var4, 2, var11.av * 266535841 == 0, var5, var0.ap * -1948824391, (byte)-44);
         int var26 = (var6 << 6) + var7;
         if (var11.bs * 531867923 == 1) {
            if (var10 >= -2087938237) {
               throw new IllegalStateException();
            }

            var26 += 256;
         }

         Object var27;
         if (var7 == 22) {
            label409: {
               if (var12 == -1) {
                  if (var10 >= -2087938237) {
                     throw new IllegalStateException();
                  }

                  if (null == var11.bm) {
                     if (var10 >= -2087938237) {
                        throw new IllegalStateException();
                     }

                     var27 = var11.am(22, var6, var19, var21, var20, var22, (byte)27);
                     break label409;
                  }
               }

               var27 = new dr(var0, var5, 22, var6, var2, var3, var4, var12, var11.be, (jv)null);
            }

            var23.as(var1, var3, var4, var20, (jv)var27, var24, var26);
            if (1 == var11.ad * -1552861337) {
               if (var10 >= -2087938237) {
                  throw new IllegalStateException();
               }

               if (var9 != null) {
                  var9.ai(var3, var4, -1109978527);
               }
            }

         } else {
            if (10 != var7) {
               if (var10 >= -2087938237) {
                  return;
               }

               if (11 != var7) {
                  if (var7 >= 12) {
                     if (var10 >= -2087938237) {
                        throw new IllegalStateException();
                     }

                     label417: {
                        if (-1 == var12) {
                           if (var10 >= -2087938237) {
                              throw new IllegalStateException();
                           }

                           if (var11.bm == null) {
                              if (var10 >= -2087938237) {
                                 return;
                              }

                              var27 = var11.am(var7, var6, var19, var21, var20, var22, (byte)41);
                              break label417;
                           }
                        }

                        var27 = new dr(var0, var5, var7, var6, var2, var3, var4, var12, var11.be, (jv)null);
                     }

                     var23.af(var1, var3, var4, var20, 1, 1, (jv)var27, 0, var24, var26);
                     if (0 != var11.ad * -1552861337) {
                        if (var10 >= -2087938237) {
                           throw new IllegalStateException();
                        }

                        if (var9 != null) {
                           var9.ak(var3, var4, var13, var14, var11.ac, (byte)17);
                        }
                     }

                     return;
                  }

                  if (var7 == 0) {
                     if (var12 == -1 && null == var11.bm) {
                        if (var10 >= -2087938237) {
                           throw new IllegalStateException();
                        }

                        var27 = var11.am(0, var6, var19, var21, var20, var22, (byte)-32);
                     } else {
                        var27 = new dr(var0, var5, 0, var6, var2, var3, var4, var12, var11.be, (jv)null);
                     }

                     var23.am(var1, var3, var4, var20, (jv)var27, (jv)null, dg.az[var6], 0, var24, var26);
                     if (0 != var11.ad * -1552861337) {
                        if (var10 >= -2087938237) {
                           throw new IllegalStateException();
                        }

                        if (null != var9) {
                           var9.aw(var3, var4, var7, var6, var11.ac, (byte)-39);
                        }
                     }

                     return;
                  }

                  if (1 == var7) {
                     if (var10 >= -2087938237) {
                        throw new IllegalStateException();
                     }

                     label432: {
                        if (var12 == -1) {
                           if (var10 >= -2087938237) {
                              throw new IllegalStateException();
                           }

                           if (null == var11.bm) {
                              var27 = var11.am(1, var6, var19, var21, var20, var22, (byte)-68);
                              break label432;
                           }
                        }

                        var27 = new dr(var0, var5, 1, var6, var2, var3, var4, var12, var11.be, (jv)null);
                     }

                     var23.am(var1, var3, var4, var20, (jv)var27, (jv)null, dg.ag[var6], 0, var24, var26);
                     if (0 != -1552861337 * var11.ad) {
                        if (var10 >= -2087938237) {
                           return;
                        }

                        if (var9 != null) {
                           if (var10 >= -2087938237) {
                              throw new IllegalStateException();
                           }

                           var9.aw(var3, var4, var7, var6, var11.ac, (byte)-2);
                        }
                     }

                     return;
                  }

                  int var34;
                  if (2 == var7) {
                     if (var10 >= -2087938237) {
                        throw new IllegalStateException();
                     }

                     var34 = 1 + var6 & 3;
                     Object var29;
                     Object var36;
                     if (var12 == -1 && null == var11.bm) {
                        if (var10 >= -2087938237) {
                           return;
                        }

                        var36 = var11.am(2, 4 + var6, var19, var21, var20, var22, (byte)105);
                        var29 = var11.am(2, var34, var19, var21, var20, var22, (byte)88);
                     } else {
                        var36 = new dr(var0, var5, 2, var6 + 4, var2, var3, var4, var12, var11.be, (jv)null);
                        var29 = new dr(var0, var5, 2, var34, var2, var3, var4, var12, var11.be, (jv)null);
                     }

                     var23.am(var1, var3, var4, var20, (jv)var36, (jv)var29, dg.az[var6], dg.az[var34], var24, var26);
                     if (0 != var11.ad * -1552861337) {
                        if (var10 >= -2087938237) {
                           throw new IllegalStateException();
                        }

                        if (var9 != null) {
                           if (var10 >= -2087938237) {
                              throw new IllegalStateException();
                           }

                           var9.aw(var3, var4, var7, var6, var11.ac, (byte)-102);
                        }
                     }

                     return;
                  }

                  if (var7 == 3) {
                     if (var10 >= -2087938237) {
                        throw new IllegalStateException();
                     }

                     if (var12 == -1 && null == var11.bm) {
                        if (var10 >= -2087938237) {
                           throw new IllegalStateException();
                        }

                        var27 = var11.am(3, var6, var19, var21, var20, var22, (byte)-18);
                     } else {
                        var27 = new dr(var0, var5, 3, var6, var2, var3, var4, var12, var11.be, (jv)null);
                     }

                     var23.am(var1, var3, var4, var20, (jv)var27, (jv)null, dg.ag[var6], 0, var24, var26);
                     if (-1552861337 * var11.ad != 0 && null != var9) {
                        if (var10 >= -2087938237) {
                           throw new IllegalStateException();
                        }

                        var9.aw(var3, var4, var7, var6, var11.ac, (byte)-97);
                     }

                     return;
                  }

                  if (var7 == 9) {
                     if (var10 >= -2087938237) {
                        return;
                     }

                     if (var12 == -1 && null == var11.bm) {
                        if (var10 >= -2087938237) {
                           throw new IllegalStateException();
                        }

                        var27 = var11.am(var7, var6, var19, var21, var20, var22, (byte)7);
                     } else {
                        var27 = new dr(var0, var5, var7, var6, var2, var3, var4, var12, var11.be, (jv)null);
                     }

                     var23.af(var1, var3, var4, var20, 1, 1, (jv)var27, 0, var24, var26);
                     if (0 != -1552861337 * var11.ad) {
                        if (var10 >= -2087938237) {
                           throw new IllegalStateException();
                        }

                        if (null != var9) {
                           if (var10 >= -2087938237) {
                              throw new IllegalStateException();
                           }

                           var9.ak(var3, var4, var13, var14, var11.ac, (byte)32);
                        }
                     }

                     return;
                  }

                  if (4 == var7) {
                     label465: {
                        if (-1 == var12) {
                           if (var10 >= -2087938237) {
                              throw new IllegalStateException();
                           }

                           if (null == var11.bm) {
                              if (var10 >= -2087938237) {
                                 return;
                              }

                              var27 = var11.am(4, var6, var19, var21, var20, var22, (byte)48);
                              break label465;
                           }
                        }

                        var27 = new dr(var0, var5, 4, var6, var2, var3, var4, var12, var11.be, (jv)null);
                     }

                     var23.at(var1, var3, var4, var20, (jv)var27, (jv)null, dg.az[var6], 0, 0, 0, var24, var26);
                     return;
                  }

                  long var28;
                  Object var30;
                  if (5 == var7) {
                     if (var10 >= -2087938237) {
                        throw new IllegalStateException();
                     }

                     var34 = 16;
                     var28 = var23.bx(var1, var3, var4);
                     if (0L != var28) {
                        if (var10 >= -2087938237) {
                           throw new IllegalStateException();
                        }

                        var34 = ei.aw(la.ae(var28), 888461382).ah * -1497041743;
                     }

                     label473: {
                        if (var12 == -1) {
                           if (var10 >= -2087938237) {
                              throw new IllegalStateException();
                           }

                           if (null == var11.bm) {
                              if (var10 >= -2087938237) {
                                 return;
                              }

                              var30 = var11.am(4, var6, var19, var21, var20, var22, (byte)95);
                              break label473;
                           }
                        }

                        var30 = new dr(var0, var5, 4, var6, var2, var3, var4, var12, var11.be, (jv)null);
                     }

                     var23.at(var1, var3, var4, var20, (jv)var30, (jv)null, dg.az[var6], 0, var34 * dg.ad[var6], var34 * dg.ac[var6], var24, var26);
                     return;
                  }

                  if (6 == var7) {
                     var34 = 8;
                     var28 = var23.bx(var1, var3, var4);
                     if (0L != var28) {
                        if (var10 >= -2087938237) {
                           return;
                        }

                        var34 = ei.aw(la.ae(var28), 888461382).ah * -1497041743 / 2;
                     }

                     label484: {
                        if (var12 == -1) {
                           if (var10 >= -2087938237) {
                              throw new IllegalStateException();
                           }

                           if (var11.bm == null) {
                              var30 = var11.am(4, 4 + var6, var19, var21, var20, var22, (byte)-76);
                              break label484;
                           }
                        }

                        var30 = new dr(var0, var5, 4, 4 + var6, var2, var3, var4, var12, var11.be, (jv)null);
                     }

                     var23.at(var1, var3, var4, var20, (jv)var30, (jv)null, 256, var6, var34 * dg.av[var6], var34 * dg.ax[var6], var24, var26);
                     return;
                  }

                  if (7 == var7) {
                     if (var10 >= -2087938237) {
                        return;
                     }

                     int var35 = 2 + var6 & 3;
                     if (-1 == var12 && var11.bm == null) {
                        if (var10 >= -2087938237) {
                           throw new IllegalStateException();
                        }

                        var27 = var11.am(4, 4 + var35, var19, var21, var20, var22, (byte)-60);
                     } else {
                        var27 = new dr(var0, var5, 4, 4 + var35, var2, var3, var4, var12, var11.be, (jv)null);
                     }

                     var23.at(var1, var3, var4, var20, (jv)var27, (jv)null, 256, var35, 0, 0, var24, var26);
                     return;
                  }

                  if (var7 != 8) {
                     return;
                  }

                  if (var10 >= -2087938237) {
                     return;
                  }

                  var34 = 8;
                  var28 = var23.bx(var1, var3, var4);
                  if (var28 != 0L) {
                     if (var10 >= -2087938237) {
                        throw new IllegalStateException();
                     }

                     var34 = ei.aw(la.ae(var28), 888461382).ah * -1497041743 / 2;
                  }

                  Object var31;
                  label499: {
                     int var32 = var6 + 2 & 3;
                     if (-1 == var12) {
                        if (var10 >= -2087938237) {
                           throw new IllegalStateException();
                        }

                        if (null == var11.bm) {
                           if (var10 >= -2087938237) {
                              throw new IllegalStateException();
                           }

                           var30 = var11.am(4, var6 + 4, var19, var21, var20, var22, (byte)12);
                           var31 = var11.am(4, var32 + 4, var19, var21, var20, var22, (byte)-38);
                           break label499;
                        }
                     }

                     var30 = new dr(var0, var5, 4, var6 + 4, var2, var3, var4, var12, var11.be, (jv)null);
                     var31 = new dr(var0, var5, 4, var32 + 4, var2, var3, var4, var12, var11.be, (jv)null);
                  }

                  var23.at(var1, var3, var4, var20, (jv)var30, (jv)var31, 256, var6, var34 * dg.av[var6], var34 * dg.ax[var6], var24, var26);
                  return;
               }

               if (var10 >= -2087938237) {
                  return;
               }
            }

            label517: {
               if (-1 == var12) {
                  if (var10 >= -2087938237) {
                     throw new IllegalStateException();
                  }

                  if (null == var11.bm) {
                     var27 = var11.am(10, var6, var19, var21, var20, var22, (byte)-26);
                     break label517;
                  }
               }

               var27 = new dr(var0, var5, 10, var6, var2, var3, var4, var12, var11.be, (jv)null);
            }

            if (var27 != null) {
               if (var10 >= -2087938237) {
                  return;
               }

               short var10008;
               if (11 == var7) {
                  if (var10 >= -2087938237) {
                     throw new IllegalStateException();
                  }

                  var10008 = 256;
               } else {
                  var10008 = 0;
               }

               var23.af(var1, var3, var4, var20, var13, var14, (jv)var27, var10008, var24, var26);
            }

            if (-1552861337 * var11.ad != 0) {
               if (var10 >= -2087938237) {
                  return;
               }

               if (var9 != null) {
                  if (var10 >= -2087938237) {
                     throw new IllegalStateException();
                  }

                  var9.ak(var3, var4, var13, var14, var11.ac, (byte)1);
               }
            }

         }
      } catch (RuntimeException var33) {
         throw tm.aw(var33, "bc.av(" + ')');
      }
   }

   public final synchronized void aq(MouseEvent var1) {
      if (aj != null) {
         ai = 0;
         ay = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      try {
         this.mouseMoved(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bc.mouseEntered(" + ')');
      }
   }

   public final void bk(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void bb(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void bq(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void bp(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void bz(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void bc(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void by(MouseEvent var1) {
      if (null != aj) {
         ai = 0;
         as = 2071378615;
         ae = -920860393;
         am = var1.getWhen() * 588490052731697891L;
      }

   }

   public final synchronized void br(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void bj(FocusEvent var1) {
      if (aj != null) {
         ay = 0;
      }

   }

   public final synchronized void bu(MouseEvent var1) {
      if (null != aj) {
         ai = 0;
         as = var1.getX() * 1842968735;
         ae = var1.getY() * 1102098184;
         am = var1.getWhen() * 588490052731697891L;
      }

   }

   public final synchronized void af(MouseEvent var1) {
      if (aj != null) {
         ai = 0;
         ar = var1.getX() * 1250564303;
         ab = var1.getY() * -1230780205;
         az = ck.ap(-835244154) * 28055428358902907L;
         af = this.aj(var1, -397380741) * 1535288269;
         if (af * 807271618 != 0) {
            ay = af * 604529184;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void bn(MouseEvent var1) {
      if (null != aj) {
         ai = 0;
         as = var1.getX() * -2071378615;
         ae = var1.getY() * 920860393;
         am = var1.getWhen() * 588490052731697891L;
      }

   }
}
