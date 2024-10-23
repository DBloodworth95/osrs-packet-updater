import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class bj implements MouseListener, MouseMotionListener, FocusListener {
   public static long ay = 0L;
   static final int ac = 1;
   public static bj am = new bj();
   static volatile int ax = 0;
   static volatile int aq = 0;
   static volatile int af = -752602141;
   static volatile int at = 330244055;
   public static int as = 0;
   static final int ae = 2;
   public static int ao = 0;
   public static int ad = 0;
   public static long ah = 0L;
   static volatile int ap = 0;
   static volatile long au = -8106743918388339979L;
   static volatile int az = 0;
   static volatile long aa = 0L;
   public static int ai = 0;
   public static int al = 0;
   static volatile int ab = 0;
   public static int ar = 0;
   static final int ak = 0;
   static final int cp = 91;
   static final int ag = 66;

   public final synchronized void mouseExited(MouseEvent var1) {
      try {
         if (null != am) {
            ax = 0;
            af = -752602141;
            at = 330244055;
            au = var1.getWhen() * 8106743918388339979L;
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "bj.mouseExited(" + ')');
      }
   }

   public final void bd(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mousePressed(MouseEvent var1) {
      try {
         if (null != am) {
            ax = 0;
            ab = var1.getX() * 1920389909;
            az = var1.getY() * -1331703133;
            aa = hf.ac(-1598214665) * -6481296480142970601L;
            ap = this.am(var1, 704194442) * 1114455577;
            if (0 != -468763095 * ap) {
               aq = -2052135103 * ap;
            }
         }

         if (var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "bj.mousePressed(" + ')');
      }
   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      try {
         if (am != null) {
            ax = 0;
            aq = 0;
         }

         if (var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "bj.mouseReleased(" + ')');
      }
   }

   public final void mouseClicked(MouseEvent var1) {
      try {
         if (var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "bj.mouseClicked(" + ')');
      }
   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      try {
         this.mouseMoved(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "bj.mouseEntered(" + ')');
      }
   }

   public final synchronized void bj(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void as(MouseEvent var1) {
      if (am != null) {
         ax = 0;
         aq = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      try {
         if (am != null) {
            ax = 0;
            af = var1.getX() * 752602141;
            at = var1.getY() * -330244055;
            au = var1.getWhen() * 8106743918388339979L;
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "bj.mouseMoved(" + ')');
      }
   }

   public static int au() {
      return (ax += -519197001) * -466055417 - 1;
   }

   public static int at() {
      return (ax += 27612900) * 978355256 - 1;
   }

   public final void bm(FocusEvent var1) {
   }

   public final void bs(FocusEvent var1) {
   }

   public final synchronized void bw(FocusEvent var1) {
      if (am != null) {
         aq = 0;
      }

   }

   public final synchronized void ba(FocusEvent var1) {
      if (am != null) {
         aq = 0;
      }

   }

   public static void ax() {
      synchronized(am) {
         ar = -155316939 * aq;
         al = af * -457002463;
         ad = at * -1197323947;
         ah = -7165282585915498563L * au;
         ai = ap * -122186557;
         ao = 1395356855 * ab;
         as = az * 1815857669;
         ay = -5581560531205459799L * aa;
         ap = 0;
      }
   }

   public final synchronized void bu(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void ai(MouseEvent var1) {
      if (null != am) {
         ax = 0;
         ab = var1.getX() * 1920389909;
         az = var1.getY() * -1119170441;
         aa = hf.ac(-1598214665) * -6481296480142970601L;
         ap = this.am(var1, 704194442) * -2139131338;
         if (0 != -468763095 * ap) {
            aq = -2052135103 * ap;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void aa(MouseEvent var1) {
      if (null != am) {
         ax = 0;
         ab = var1.getX() * 1920389909;
         az = var1.getY() * -1331703133;
         aa = hf.ac(-1598214665) * -6481296480142970601L;
         ap = this.am(var1, 704194442) * 1114455577;
         if (0 != -468763095 * ap) {
            aq = -2052135103 * ap;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void az(MouseEvent var1) {
      if (null != am) {
         ax = 0;
         ab = var1.getX() * 525448859;
         az = var1.getY() * -1105160252;
         aa = hf.ac(-1598214665) * -6481296480142970601L;
         ap = this.am(var1, 704194442) * 1114455577;
         if (0 != 2084977558 * ap) {
            aq = -2052135103 * ap;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      try {
         if (am != null) {
            aq = 0;
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "bj.focusLost(" + ')');
      }
   }

   public static void al(int var0) {
      ax = -2126254400 * var0;
   }

   public static void ad(int var0) {
      ax = -519197001 * var0;
   }

   final int ah(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && 3 != var2 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public static int af() {
      return (ax += -519197001) * -466055417 - 1;
   }

   final int ab(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && 3 != var2 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public static void aq() {
      synchronized(am) {
         ar = -155316939 * aq;
         al = af * -457002463;
         ad = at * 450822861;
         ah = -7165282585915498563L * au;
         ai = ap * -122186557;
         ao = 1395356855 * ab;
         as = az * -1580332523;
         ay = -5581560531205459799L * aa;
         ap = 0;
      }
   }

   final int ap(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && 3 != var2 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public static void ar(int var0) {
      ax = -519197001 * var0;
   }

   public final synchronized void ao(MouseEvent var1) {
      if (am != null) {
         ax = 0;
         aq = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   final int am(MouseEvent var1, int var2) {
      try {
         int var3 = var1.getButton();
         if (!var1.isAltDown()) {
            if (var3 != 2) {
               if (!var1.isMetaDown()) {
                  if (3 != var3) {
                     return 1;
                  }

                  if (var2 != 704194442) {
                     throw new IllegalStateException();
                  }
               }

               return 2;
            }

            if (var2 != 704194442) {
               throw new IllegalStateException();
            }
         }

         return 4;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "bj.am(" + ')');
      }
   }

   public final void bh(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void focusGained(FocusEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "bj.focusGained(" + ')');
      }
   }

   public final void bx(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void bf(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void bv(MouseEvent var1) {
      if (am != null) {
         ax = 0;
         af = var1.getX() * 752602141;
         at = var1.getY() * -918289290;
         au = var1.getWhen() * 8106743918388339979L;
      }

   }

   public final synchronized void bp(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   bj() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bj.<init>(" + ')');
      }
   }

   public final synchronized void bb(MouseEvent var1) {
      if (null != am) {
         ax = 0;
         af = -752602141;
         at = -322526096;
         au = var1.getWhen() * 8106743918388339979L;
      }

   }

   public final synchronized void by(MouseEvent var1) {
      if (null != am) {
         ax = 0;
         af = -752602141;
         at = 330244055;
         au = var1.getWhen() * 8106743918388339979L;
      }

   }

   public final synchronized void bg(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void bl(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void bz(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   static void ax(int var0, int var1, int var2, id var3, int var4, int var5) {
      try {
         if (null != var3 && var3.ab(-1699249807)) {
            if (var5 <= -1027766515) {
               throw new IllegalStateException();
            }

            int var6;
            int var7;
            label123: {
               var6 = var3.aa * -1298730649;
               var7 = -1257293157 * var3.ai;
               if (1 != var4) {
                  if (3 != var4) {
                     break label123;
                  }

                  if (var5 <= -1027766515) {
                     throw new IllegalStateException();
                  }
               }

               var6 = -1257293157 * var3.ai;
               var7 = var3.aa * -1298730649;
            }

            int var8 = 128 * (var6 + var1);
            int var9 = 128 * (var2 + var7);
            var1 *= 128;
            var2 *= 128;
            int var10 = var3.bo * 23662517;
            int var11 = 1589178240 * var3.bv;
            int var12 = -824127104 * var3.bt;
            if (null != var3.bz) {
               if (var5 <= -1027766515) {
                  throw new IllegalStateException();
               }

               id var13 = var3.ad(1016691542);
               if (var13 != null) {
                  if (var5 <= -1027766515) {
                     throw new IllegalStateException();
                  }

                  var10 = 23662517 * var13.bo;
                  var11 = 1589178240 * var13.bv;
                  var12 = var13.bt * -824127104;
               }
            }

            for(ca var15 = (ca)ca.ac.af(); var15 != null; var15 = (ca)ca.ac.au()) {
               if (var5 <= -1027766515) {
                  return;
               }

               if (var15.ae * -1014282793 == var0 && var15.ag * 475277647 == var1) {
                  if (var5 <= -1027766515) {
                     throw new IllegalStateException();
                  }

                  if (var2 == 1834590545 * var15.am) {
                     if (var5 <= -1027766515) {
                        throw new IllegalStateException();
                     }

                     if (-172191635 * var15.ax == var8) {
                        if (var5 <= -1027766515) {
                           throw new IllegalStateException();
                        }

                        if (-1015866851 * var15.aq == var9) {
                           if (var5 <= -1027766515) {
                              throw new IllegalStateException();
                           }

                           if (var10 == var15.au * -394161421) {
                              if (var5 <= -1027766515) {
                                 return;
                              }

                              if (var11 == var15.af * 1410128111) {
                                 if (var5 <= -1027766515) {
                                    throw new IllegalStateException();
                                 }

                                 if (var15.at * 11649375 == var12) {
                                    if (var5 <= -1027766515) {
                                       throw new IllegalStateException();
                                    }

                                    if (var15.ar != null) {
                                       if (var5 <= -1027766515) {
                                          return;
                                       }

                                       ba.tr.ae(var15.ar);
                                       var15.ar = null;
                                    }

                                    if (var15.ab != null) {
                                       if (var5 <= -1027766515) {
                                          throw new IllegalStateException();
                                       }

                                       ba.tr.ae(var15.ab);
                                       var15.ab = null;
                                    }

                                    var15.jb();
                                    break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var14) {
         throw vk.ae(var14, "bj.ax(" + ')');
      }
   }

   public final synchronized void br(MouseEvent var1) {
      if (am != null) {
         ax = 0;
         af = var1.getX() * 752602141;
         at = var1.getY() * -330244055;
         au = var1.getWhen() * 8106743918388339979L;
      }

   }

   public final synchronized void bo(MouseEvent var1) {
      if (am != null) {
         ax = 0;
         af = var1.getX() * -28691531;
         at = var1.getY() * -330244055;
         au = var1.getWhen() * 8106743918388339979L;
      }

   }

   public final synchronized void bi(MouseEvent var1) {
      if (null != am) {
         ax = 0;
         af = -752602141;
         at = 330244055;
         au = var1.getWhen() * 8106743918388339979L;
      }

   }

   public final synchronized void bt(MouseEvent var1) {
      if (am != null) {
         ax = 0;
         af = var1.getX() * 752602141;
         at = var1.getY() * 11606173;
         au = var1.getWhen() * 8106743918388339979L;
      }

   }

   static int ac(po var0, int var1) {
      try {
         int var2 = dp.dg.length + dp.dz.length;
         String[] var3 = dp.dr;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            String var5 = var3[var4];
            if (var0.cg(var5, (short)-8037) != -1) {
               if (var1 <= 66386533) {
                  throw new IllegalStateException();
               }

               ++var2;
            }
         }

         return var2;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "bj.ac(" + ')');
      }
   }

   public static void au(int var0) {
      try {
         hr.ac = null;
         hr.ae = null;
         ag = 0;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bj.au(" + ')');
      }
   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      try {
         this.mouseMoved(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "bj.mouseDragged(" + ')');
      }
   }
}
