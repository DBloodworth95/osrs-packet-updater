import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

public abstract class ba extends Applet implements Runnable, FocusListener, WindowListener {
   static final int ad = 32;
   static int au = -1178732809;
   int an;
   static long am = 0L;
   static boolean ax = false;
   boolean aq;
   static int af;
   protected static ir ac;
   aj bg;
   protected static int ar = 0;
   protected boolean bh;
   static long[] ah = new long[32];
   static ba ae = null;
   protected int ai;
   protected int ao;
   int as;
   static int ag = 0;
   volatile long by;
   Canvas bm;
   int ak;
   int bn;
   Clipboard bl;
   Frame bf;
   int aw;
   volatile boolean bs;
   static int ba = 1082839796;
   boolean bj;
   volatile boolean bp;
   protected static int at = -428042156;
   static volatile boolean bu = true;
   static long[] ab = new long[32];
   final EventQueue bz;
   int ay;
   protected static ak bo = new ak();
   static long bt = 3695766873395466925L;
   static long bq = -6745007813743822991L;
   static bb tr;

   protected final void ad(int var1) {
      try {
         if (ir.ac.toLowerCase().indexOf("microsoft") != -1) {
            if (var1 <= -1693425234) {
               throw new IllegalStateException();
            }

            bd.dw[186] = 57;
            bd.dw[187] = 27;
            bd.dw[188] = 71;
            bd.dw[189] = 26;
            bd.dw[190] = 72;
            bd.dw[191] = 73;
            bd.dw[192] = 58;
            bd.dw[219] = 42;
            bd.dw[220] = 74;
            bd.dw[221] = 43;
            bd.dw[222] = 59;
            bd.dw[223] = 28;
         } else {
            bd.dw[44] = 71;
            bd.dw[45] = 26;
            bd.dw[46] = 72;
            bd.dw[47] = 73;
            bd.dw[59] = 57;
            bd.dw[61] = 27;
            bd.dw[91] = 42;
            bd.dw[92] = 74;
            bd.dw[93] = 43;
            bd.dw[192] = 28;
            bd.dw[222] = 58;
            bd.dw[520] = 59;
         }

         bo.ag(this.bm, (byte)-54);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.ad(" + ')');
      }
   }

   protected final void dy() {
      this.bs = true;
   }

   final void af(Object var1, int var2) {
      try {
         if (null == this.bz) {
            if (var2 == 2044639153) {
               throw new IllegalStateException();
            }
         } else {
            for(int var3 = 0; var3 < 50; ++var3) {
               if (var2 == 2044639153) {
                  throw new IllegalStateException();
               }

               if (this.bz.peekEvent() == null) {
                  break;
               }

               if (var2 == 2044639153) {
                  throw new IllegalStateException();
               }

               iv.ac(1L);
            }

            if (null != var1) {
               if (var2 == 2044639153) {
                  throw new IllegalStateException();
               }

               this.bz.postEvent(new ActionEvent(var1, 1001, "dummy"));
            }

         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ba.af(" + ')');
      }
   }

   protected iw at(int var1) {
      try {
         if (null == this.bg) {
            if (var1 != -1691698710) {
               throw new IllegalStateException();
            }

            this.bg = new aj();
            this.bg.ac(this.bm, (byte)-57);
         }

         return this.bg;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.at(" + ')');
      }
   }

   protected void au(byte var1) {
      try {
         this.bl = this.getToolkit().getSystemClipboard();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.au(" + ')');
      }
   }

   protected abstract void dp();

   protected Clipboard al(int var1) {
      try {
         return this.bl;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.al(" + ')');
      }
   }

   protected abstract void gh();

   protected final void ah(int var1) {
      try {
         bo.ax((short)128);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.ah(" + ')');
      }
   }

   protected void ap(bx var1, int var2, int var3) {
      try {
         bo.ac(var1, var2, (byte)3);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ba.ap(" + ')');
      }
   }

   protected final void ab(int var1) {
      try {
         Canvas var2 = this.bm;
         var2.addMouseListener(bj.am);
         var2.addMouseMotionListener(bj.am);
         var2.addFocusListener(bj.am);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ba.ab(" + ')');
      }
   }

   final void az(int var1) {
      try {
         Container var2 = this.bl(1036457443);
         if (null == var2) {
            if (var1 < 1529236907) {
               ;
            }
         } else {
            qy var3 = this.bz(632884702);
            this.ai = Math.max(392803297 * var3.ag, this.aw * 1419115339) * -1093885937;
            this.ao = Math.max(var3.am * -1728093045, 237520649 * this.an) * 1483219361;
            if (this.ai * -2068951313 <= 0) {
               this.ai = -1093885937;
            }

            if (this.ao * 1531445857 <= 0) {
               if (var1 >= 1529236907) {
                  throw new IllegalStateException();
               }

               this.ao = 1483219361;
            }

            fa.aj = Math.min(this.ai * -2068951313, -1034899477 * this.ak) * 543790185;
            en.av = Math.min(1531445857 * this.ao, this.bn * 1029994813) * 415699555;
            this.as = 522652521 * ((-2068951313 * this.ai - -1991951399 * fa.aj) / 2);
            this.ay = 0;
            this.bm.setSize(-1991951399 * fa.aj, en.av * 608173899);
            lj.bi = new bs(fa.aj * -1991951399, en.av * 608173899, this.bm, this.bh);
            if (var2 == this.bf) {
               if (var1 >= 1529236907) {
                  throw new IllegalStateException();
               }

               Insets var4 = this.bf.getInsets();
               this.bm.setLocation(var4.left + 942027993 * this.as, var4.top + 737340793 * this.ay);
            } else {
               this.bm.setLocation(942027993 * this.as, 737340793 * this.ay);
            }

            this.bs = true;
            this.aa(1968536005);
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ba.az(" + ')');
      }
   }

   protected abstract void aa(int var1);

   public final void windowDeactivated(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.windowDeactivated(" + ')');
      }
   }

   public final void ei() {
      if (this == ae && !ax) {
         am = hf.ac(-1598214665) * 7381919034238975995L;
         iv.ac(5000L);
         this.bd(-1478818645);
      }
   }

   final synchronized void do() {
      Container var1 = this.bl(1036457443);
      if (this.bm != null) {
         this.bm.removeFocusListener(this);
         var1.remove(this.bm);
      }

      fa.aj = Math.max(var1.getWidth(), -1986200510 * this.aw) * 543790185;
      en.av = Math.max(var1.getHeight(), this.an * -395390761) * 415699555;
      Insets var2;
      if (this.bf != null) {
         var2 = this.bf.getInsets();
         fa.aj -= 543790185 * (var2.left + var2.right);
         en.av -= 1542352209 * (var2.bottom + var2.top);
      }

      this.bm = new aw(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.bm);
      this.bm.setSize(fa.aj * -1991951399, en.av * -740586573);
      this.bm.setVisible(true);
      this.bm.setBackground(Color.BLACK);
      if (var1 == this.bf) {
         var2 = this.bf.getInsets();
         this.bm.setLocation(var2.left + this.as * -801814687, 1750224609 * this.ay + var2.top);
      } else {
         this.bm.setLocation(-333961174 * this.as, 737340793 * this.ay);
      }

      this.bm.addFocusListener(this);
      this.bm.requestFocus();
      this.bs = true;
      if (lj.bi != null && lj.bi.am * 1693052814 == -619667347 * fa.aj && -551279691 * lj.bi.ax == en.av * 1975477402) {
         ((bs)lj.bi).ac(this.bm, -1562504192);
         lj.bi.ae(0, 0, 131201232);
      } else {
         lj.bi = new bs(fa.aj * 237496104, en.av * 1210132472, this.bm, this.bh);
      }

      this.bp = false;
      this.by = hf.ac(-1598214665) * 5431261067880832809L;
   }

   final synchronized void ay(int var1) {
      try {
         Container var2 = this.bl(1036457443);
         if (this.bm != null) {
            if (var1 == 640554434) {
               throw new IllegalStateException();
            }

            this.bm.removeFocusListener(this);
            var2.remove(this.bm);
         }

         fa.aj = Math.max(var2.getWidth(), 1419115339 * this.aw) * 543790185;
         en.av = Math.max(var2.getHeight(), this.an * 237520649) * 415699555;
         Insets var3;
         if (this.bf != null) {
            if (var1 == 640554434) {
               throw new IllegalStateException();
            }

            var3 = this.bf.getInsets();
            fa.aj -= 543790185 * (var3.left + var3.right);
            en.av -= 415699555 * (var3.bottom + var3.top);
         }

         this.bm = new aw(this);
         var2.setBackground(Color.BLACK);
         var2.setLayout((LayoutManager)null);
         var2.add(this.bm);
         this.bm.setSize(fa.aj * -1991951399, en.av * 608173899);
         this.bm.setVisible(true);
         this.bm.setBackground(Color.BLACK);
         if (var2 == this.bf) {
            if (var1 == 640554434) {
               throw new IllegalStateException();
            }

            var3 = this.bf.getInsets();
            this.bm.setLocation(var3.left + this.as * 942027993, 737340793 * this.ay + var3.top);
         } else {
            this.bm.setLocation(942027993 * this.as, 737340793 * this.ay);
         }

         label60: {
            this.bm.addFocusListener(this);
            this.bm.requestFocus();
            this.bs = true;
            if (lj.bi != null) {
               if (var1 == 640554434) {
                  throw new IllegalStateException();
               }

               if (lj.bi.am * 1441925673 == -1991951399 * fa.aj && -551279691 * lj.bi.ax == en.av * 608173899) {
                  if (var1 == 640554434) {
                     throw new IllegalStateException();
                  }

                  ((bs)lj.bi).ac(this.bm, -917060222);
                  lj.bi.ae(0, 0, 131201232);
                  break label60;
               }
            }

            lj.bi = new bs(fa.aj * -1991951399, en.av * 608173899, this.bm, this.bh);
         }

         this.bp = false;
         this.by = hf.ac(-1598214665) * 5431261067880832809L;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ba.ay(" + ')');
      }
   }

   protected void aj(boolean var1, int var2) {
      try {
         if (this.bh != var1) {
            if (var2 <= 1455003290) {
               throw new IllegalStateException();
            }

            this.bh = var1;
            lj.bi.ab(var1, -1740604000);
            lj.bi.ap(1414136209);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ba.aj(" + ')');
      }
   }

   protected iw cf() {
      if (null == this.bg) {
         this.bg = new aj();
         this.bg.ac(this.bm, (byte)67);
      }

      return this.bg;
   }

   public void run() {
      try {
         try {
            if (ir.ac != null) {
               String var1 = ir.ac.toLowerCase();
               if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                  String var2 = ir.ae;
                  if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                     this.bg("wrongjava", -2037102880);
                     return;
                  }

                  if (var2.startsWith("1.6.0_")) {
                     int var3;
                     for(var3 = 6; var3 < var2.length() && ds.au(var2.charAt(var3), -467912855); ++var3) {
                     }

                     String var4 = var2.substring(6, var3);
                     if (ii.ae(var4, 1834373449) && ir.ag(var4, 1473180947) < 10) {
                        this.bg("wrongjava", -1485232340);
                        return;
                     }
                  }

                  au = -1598696749;
               }
            }

            this.setFocusCycleRoot(true);
            this.ay(-390318936);
            this.bf(-31153294);

            Object var8;
            try {
               var8 = new iz();
            } catch (Throwable var5) {
               var8 = new io();
            }

            ng.al = (im)var8;

            while(am * -6217032821805485261L == 0L || hf.ac(-1598214665) < am * -6217032821805485261L) {
               af = ng.al.ae(at * -405381583, 890481351 * au, 497587420) * 1179842735;

               for(int var9 = 0; var9 < af * 2004573775; ++var9) {
                  this.aw(-1084529758);
               }

               this.ak(1812461338);
               this.af(this.bm, -1502275980);
            }
         } catch (Exception var6) {
            gc.ac((String)null, var6, (byte)-15);
            this.bg("crash", -1746407845);
         }

         this.bd(-1961173819);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ba.run(" + ')');
      }
   }

   void aw(int var1) {
      try {
         long var2 = hf.ac(-1598214665);
         long var4 = ab[-1547070923 * nn.az];
         ab[-1547070923 * nn.az] = var2;
         nn.az = 1003401245 * (-1547070923 * nn.az + 1 & 31);
         if (0L != var4) {
            if (var1 <= -1568924943) {
               return;
            }

            if (var2 > var4 && var1 <= -1568924943) {
               throw new IllegalStateException();
            }
         }

         synchronized(this) {
            gk.br = bu;
         }

         this.bj(124564403);
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "ba.aw(" + ')');
      }
   }

   public final void stop() {
      try {
         if (this == ae && !ax) {
            am = (hf.ac(-1598214665) + 4000L) * 7381919034238975995L;
         }
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ba.stop(" + ')');
      }
   }

   final void bc(Object var1) {
      if (null != this.bz) {
         for(int var2 = 0; var2 < 50 && this.bz.peekEvent() != null; ++var2) {
            iv.ac(1L);
         }

         if (null != var1) {
            this.bz.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   final void bn(byte var1) {
      try {
         qy var2 = this.bz(-357750770);
         if (392803297 * var2.ag == -2068951313 * this.ai) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            if (-1728093045 * var2.am == this.ao * 1531445857) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               if (!this.bj) {
                  return;
               }
            }
         }

         this.az(-212787553);
         this.bj = false;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ba.bn(" + ')');
      }
   }

   final void bq(Object var1) {
      if (null != this.bz) {
         for(int var2 = 0; var2 < 50 && this.bz.peekEvent() != null; ++var2) {
            iv.ac(1L);
         }

         if (null != var1) {
            this.bz.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   final synchronized void bd(int var1) {
      try {
         if (ax) {
            if (var1 == -1050448665) {
               throw new IllegalStateException();
            }
         } else {
            ax = true;

            try {
               this.bm.removeFocusListener(this);
            } catch (Exception var6) {
            }

            try {
               this.by(-1112351068);
            } catch (Exception var5) {
            }

            if (null != this.bf) {
               try {
                  System.exit(0);
               } catch (Throwable var4) {
               }
            }

            if (ac != null) {
               try {
                  ac.ac(-267520593);
               } catch (Exception var3) {
               }
            }

            this.bo(1505119794);
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ba.bd(" + ')');
      }
   }

   public final synchronized void paint(Graphics var1) {
      try {
         if (ae == this && !ax) {
            this.bs = true;
            if (hf.ac(-1598214665) - 1106739762442726681L * this.by > 1000L) {
               Rectangle var2 = var1.getClipBounds();
               if (var2 == null || var2.width >= fa.aj * -1991951399 && var2.height >= 608173899 * en.av) {
                  this.bp = true;
               }
            }

         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ba.paint(" + ')');
      }
   }

   protected abstract void fi(boolean var1);

   public final void destroy() {
      try {
         if (this == ae && !ax) {
            am = hf.ac(-1598214665) * 7381919034238975995L;
            iv.ac(5000L);
            this.bd(-31816190);
         }
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ba.destroy(" + ')');
      }
   }

   final void ao(int var1) {
      try {
         bo.am(this.bm, (byte)34);
         Canvas var2 = this.bm;
         var2.removeMouseListener(bj.am);
         var2.removeMouseMotionListener(bj.am);
         var2.removeFocusListener(bj.am);
         bj.aq = 0;
         if (this.bg != null) {
            if (var1 <= 405615743) {
               throw new IllegalStateException();
            }

            this.bg.ae(this.bm, -1119220019);
         }

         this.ay(823309324);
         bo.ag(this.bm, (byte)-18);
         Canvas var3 = this.bm;
         var3.addMouseListener(bj.am);
         var3.addMouseMotionListener(bj.am);
         var3.addFocusListener(bj.am);
         if (this.bg != null) {
            if (var1 <= 405615743) {
               return;
            }

            this.bg.ac(this.bm, (byte)-7);
         }

         this.bh((byte)-37);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ba.ao(" + ')');
      }
   }

   protected void ar(String var1, int var2) {
      try {
         this.bl.setContents(new StringSelection(var1), (ClipboardOwner)null);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ba.ar(" + ')');
      }
   }

   public final void focusGained(FocusEvent var1) {
      try {
         bu = true;
         this.bs = true;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.focusGained(" + ')');
      }
   }

   public final void focusLost(FocusEvent var1) {
      try {
         bu = false;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.focusLost(" + ')');
      }
   }

   public final void windowActivated(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.windowActivated(" + ')');
      }
   }

   protected final void an(byte var1) {
      try {
         this.bs = true;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.an(" + ')');
      }
   }

   public final void windowClosing(WindowEvent var1) {
      try {
         this.destroy();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.windowClosing(" + ')');
      }
   }

   protected final boolean av(int var1) {
      try {
         String var2 = this.getDocumentBase().getHost().toLowerCase();
         if (!var2.equals("jagex.com")) {
            if (var1 >= 929189960) {
               throw new IllegalStateException();
            }

            if (!var2.endsWith(".jagex.com")) {
               if (!var2.equals("runescape.com")) {
                  if (!var2.endsWith(".runescape.com")) {
                     if (var2.endsWith("127.0.0.1")) {
                        if (var1 >= 929189960) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     while(var2.length() > 0) {
                        if (var1 >= 929189960) {
                           throw new IllegalStateException();
                        }

                        if (var2.charAt(var2.length() - 1) < '0') {
                           break;
                        }

                        if (var1 >= 929189960) {
                           throw new IllegalStateException();
                        }

                        if (var2.charAt(var2.length() - 1) > '9') {
                           break;
                        }

                        var2 = var2.substring(0, var2.length() - 1);
                     }

                     if (var2.endsWith("192.168.1.")) {
                        if (var1 >= 929189960) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     this.bg("invalidhost", -1846651431);
                     return false;
                  }

                  if (var1 >= 929189960) {
                     throw new IllegalStateException();
                  }
               }

               return true;
            }

            if (var1 >= 929189960) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ba.av(" + ')');
      }
   }

   public final void ee(WindowEvent var1) {
      this.destroy();
   }

   public final void windowOpened(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.windowOpened(" + ')');
      }
   }

   protected final void cc() {
      if (ir.ac.toLowerCase().indexOf("microsoft") != -1) {
         bd.dw[186] = 57;
         bd.dw[187] = 27;
         bd.dw[188] = 71;
         bd.dw[189] = 26;
         bd.dw[190] = 72;
         bd.dw[191] = 73;
         bd.dw[192] = 58;
         bd.dw[219] = 42;
         bd.dw[220] = 74;
         bd.dw[221] = 43;
         bd.dw[222] = 59;
         bd.dw[223] = 28;
      } else {
         bd.dw[44] = 71;
         bd.dw[45] = 26;
         bd.dw[46] = 72;
         bd.dw[47] = 73;
         bd.dw[59] = 57;
         bd.dw[61] = 27;
         bd.dw[91] = 42;
         bd.dw[92] = 74;
         bd.dw[93] = 43;
         bd.dw[192] = 28;
         bd.dw[222] = 58;
         bd.dw[520] = 59;
      }

      bo.ag(this.bm, (byte)-106);
   }

   public abstract void init();

   public final void eo() {
      if (this == ae && !ax) {
         am = hf.ac(-1598214665) * 7381919034238975995L;
         iv.ac(5000L);
         this.bd(421367982);
      }
   }

   protected abstract void bj(int var1);

   protected abstract void bp(boolean var1, int var2);

   protected abstract void by(int var1);

   protected final void bb(int var1, String var2, boolean var3, boolean var4, int var5) {
      try {
         try {
            Graphics var6 = this.bm.getGraphics();
            if (null == ei.bd) {
               if (var5 != -689634830) {
                  throw new IllegalStateException();
               }

               ei.bd = new Font("Helvetica", 1, 13);
               fr.bx = this.bm.getFontMetrics(ei.bd);
            }

            if (var3) {
               if (var5 != -689634830) {
                  throw new IllegalStateException();
               }

               if (!var4) {
                  if (var5 != -689634830) {
                     throw new IllegalStateException();
                  }

                  var6.setColor(Color.black);
                  var6.fillRect(0, 0, -1991951399 * fa.aj, 608173899 * en.av);
               }
            }

            Color var7 = new Color(140, 17, 17);

            try {
               if (gz.bw == null) {
                  if (var5 != -689634830) {
                     throw new IllegalStateException();
                  }

                  gz.bw = this.bm.createImage(304, 34);
               }

               Graphics var8 = gz.bw.getGraphics();
               var8.setColor(var7);
               var8.drawRect(0, 0, 303, 33);
               var8.fillRect(2, 2, 3 * var1, 30);
               var8.setColor(Color.black);
               var8.drawRect(1, 1, 301, 31);
               var8.fillRect(2 + 3 * var1, 2, 300 - var1 * 3, 30);
               var8.setFont(ei.bd);
               var8.setColor(Color.white);
               var8.drawString(var2, (304 - fr.bx.stringWidth(var2)) / 2, 22);
               Image var10001 = gz.bw;
               int var10002 = fa.aj * -1991951399 / 2 - 152;
               int var10003 = en.av * 608173899 / 2;
               byte var10004;
               if (var4) {
                  if (var5 != -689634830) {
                     throw new IllegalStateException();
                  }

                  var10004 = 50;
               } else {
                  var10004 = -18;
               }

               var6.drawImage(var10001, var10002, var10003 + var10004, (ImageObserver)null);
            } catch (Exception var11) {
               int var9 = fa.aj * -1991951399 / 2 - 152;
               int var10 = 608173899 * en.av / 2 - 18;
               var6.setColor(var7);
               var6.drawRect(var9, var10, 303, 33);
               var6.fillRect(var9 + 2, 2 + var10, 3 * var1, 30);
               var6.setColor(Color.black);
               var6.drawRect(var9 + 1, 1 + var10, 301, 31);
               var6.fillRect(var9 + 2 + 3 * var1, 2 + var10, 300 - 3 * var1, 30);
               var6.setFont(ei.bd);
               var6.setColor(Color.white);
               var6.drawString(var2, var9 + (304 - fr.bx.stringWidth(var2)) / 2, var10 + 22);
            }
         } catch (Exception var12) {
            this.bm.repaint();
         }

      } catch (RuntimeException var13) {
         throw vk.ae(var13, "ba.bb(" + ')');
      }
   }

   protected final boolean bu(byte var1) {
      try {
         boolean var10000;
         if (null != this.bf) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.bu(" + ')');
      }
   }

   protected abstract void fj();

   final void dc() {
      bo.am(this.bm, (byte)-124);
      Canvas var1 = this.bm;
      var1.removeMouseListener(bj.am);
      var1.removeMouseMotionListener(bj.am);
      var1.removeFocusListener(bj.am);
      bj.aq = 0;
      if (this.bg != null) {
         this.bg.ae(this.bm, -1119220019);
      }

      this.ay(2024071452);
      bo.ag(this.bm, (byte)2);
      Canvas var2 = this.bm;
      var2.addMouseListener(bj.am);
      var2.addMouseMotionListener(bj.am);
      var2.addFocusListener(bj.am);
      if (this.bg != null) {
         this.bg.ac(this.bm, (byte)-7);
      }

      this.bh((byte)-45);
   }

   qy bz(int var1) {
      try {
         Container var2 = this.bl(1036457443);
         int var3 = Math.max(var2.getWidth(), 1419115339 * this.aw);
         int var4 = Math.max(var2.getHeight(), this.an * 237520649);
         if (this.bf != null) {
            Insets var5 = this.bf.getInsets();
            var3 -= var5.right + var5.left;
            var4 -= var5.top + var5.bottom;
         }

         return new qy(var3, var4);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ba.bz(" + ')');
      }
   }

   public final void fv(WindowEvent var1) {
   }

   protected abstract void bo(int var1);

   public final void ac(Graphics var1) {
      this.paint(var1);
   }

   public final void windowDeiconified(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.windowDeiconified(" + ')');
      }
   }

   public final synchronized void ag(Graphics var1) {
      if (ae == this && !ax) {
         this.bs = true;
         if (hf.ac(-1598214665) - 1106739762442726681L * this.by > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= fa.aj * 151113918 && var2.height >= 608173899 * en.av) {
               this.bp = true;
            }
         }

      }
   }

   public final synchronized void am(Graphics var1) {
      if (ae == this && !ax) {
         this.bs = true;
         if (hf.ac(-1598214665) - 1106739762442726681L * this.by > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= fa.aj * -1991951399 && var2.height >= 608173899 * en.av) {
               this.bp = true;
            }
         }

      }
   }

   public final void em(WindowEvent var1) {
   }

   protected static int gq() {
      int var0 = 0;
      if (null == dh.bv || !dh.bv.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  dh.bv = var2;
                  bq = -6745007813743822991L;
                  bt = 3695766873395466925L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (null != dh.bv) {
         long var10 = hf.ac(-1598214665);
         long var3 = dh.bv.getCollectionTime();
         if (-1L != bt * 3153517625685270235L) {
            long var5 = var3 - 3153517625685270235L * bt;
            long var7 = var10 - 3270838277370336879L * bq;
            if (0L != var7) {
               var0 = (int)(var5 * 100L / var7);
            }
         }

         bt = var3 * -3695766873395466925L;
         bq = 6745007813743822991L * var10;
      }

      return var0;
   }

   protected abstract void gk();

   public final void bw(FocusEvent var1) {
      bu = false;
   }

   public final void ba(FocusEvent var1) {
      bu = false;
   }

   protected final void bv(int var1, int var2) {
      if (-1034899477 * this.ak != var1 || var2 != this.bn * 2130781905) {
         this.bh((byte)-12);
      }

      this.ak = 976391013 * var1;
      this.bn = -33610219 * var2;
   }

   protected final void bt(int var1, int var2) {
      if (-17732556 * this.ak != var1 || var2 != this.bn * -1582723021) {
         this.bh((byte)-111);
      }

      this.ak = 78104279 * var1;
      this.bn = -33610219 * var2;
   }

   final void db() {
      bo.am(this.bm, (byte)44);
      Canvas var1 = this.bm;
      var1.removeMouseListener(bj.am);
      var1.removeMouseMotionListener(bj.am);
      var1.removeFocusListener(bj.am);
      bj.aq = 0;
      if (this.bg != null) {
         this.bg.ae(this.bm, -1119220019);
      }

      this.ay(-1882964717);
      bo.ag(this.bm, (byte)70);
      Canvas var2 = this.bm;
      var2.addMouseListener(bj.am);
      var2.addMouseMotionListener(bj.am);
      var2.addFocusListener(bj.am);
      if (this.bg != null) {
         this.bg.ac(this.bm, (byte)-65);
      }

      this.bh((byte)-70);
   }

   qy gm() {
      Container var1 = this.bl(1036457443);
      int var2 = Math.max(var1.getWidth(), 655863037 * this.aw);
      int var3 = Math.max(var1.getHeight(), this.an * -540779032);
      if (this.bf != null) {
         Insets var4 = this.bf.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.top + var4.bottom;
      }

      return new qy(var2, var3);
   }

   final void be(Object var1) {
      if (null != this.bz) {
         for(int var2 = 0; var2 < 50 && this.bz.peekEvent() != null; ++var2) {
            iv.ac(1L);
         }

         if (null != var1) {
            this.bz.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   protected abstract void bf(int var1);

   protected void gu(String var1) {
      if (!this.aq) {
         this.aq = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   protected iw ch() {
      if (null == this.bg) {
         this.bg = new aj();
         this.bg.ac(this.bm, (byte)56);
      }

      return this.bg;
   }

   protected final void cb() {
      Canvas var1 = this.bm;
      var1.addMouseListener(bj.am);
      var1.addMouseMotionListener(bj.am);
      var1.addFocusListener(bj.am);
   }

   protected iw cu() {
      if (null == this.bg) {
         this.bg = new aj();
         this.bg.ac(this.bm, (byte)-79);
      }

      return this.bg;
   }

   protected final void as(int var1, int var2, int var3, int var4, int var5) {
      try {
         try {
            if (null != ae) {
               if (var5 <= 1910207268) {
                  throw new IllegalStateException();
               }

               ag += 635116883;
               if (ag * 1718824667 >= 3) {
                  if (var5 <= 1910207268) {
                     return;
                  }

                  this.bg("alreadyloaded", -1511130554);
                  return;
               }

               this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
               return;
            }

            ae = this;
            fa.aj = 543790185 * var1;
            en.av = 415699555 * var2;
            rn.ag = var3 * 745182657;
            lp.am = var4 * 1641972417;
            wc.ac = this;
            if (ac == null) {
               if (var5 <= 1910207268) {
                  return;
               }

               ac = new ir();
            }

            ac.am(this, 1, -744752794);
         } catch (Exception var7) {
            gc.ac((String)null, var7, (byte)-115);
            this.bg("crash", -1766479010);
         }

      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ba.as(" + ')');
      }
   }

   protected final boolean dq() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if (var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= -384241679) {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if (var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.bg("invalidhost", -1940059625);
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   protected void cx() {
      this.bl = this.getToolkit().getSystemClipboard();
   }

   protected void ci(String var1) {
      this.bl.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   protected void cy(String var1) {
      this.bl.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   public final void ae(Graphics var1) {
      this.paint(var1);
   }

   void ai(int var1) {
      try {
         int var2 = 942027993 * this.as;
         int var3 = this.ay * 737340793;
         int var4 = this.ai * -2068951313 - fa.aj * -1991951399 - var2;
         int var5 = 1531445857 * this.ao - 608173899 * en.av - var3;
         if (var2 <= 0 && var4 <= 0) {
            if (var1 == 1904298223) {
               throw new IllegalStateException();
            }

            if (var3 <= 0) {
               if (var1 == 1904298223) {
                  throw new IllegalStateException();
               }

               if (var5 <= 0) {
                  return;
               }

               if (var1 == 1904298223) {
                  throw new IllegalStateException();
               }
            }
         }

         try {
            Container var6 = this.bl(1036457443);
            int var7 = 0;
            int var8 = 0;
            if (var6 == this.bf) {
               if (var1 == 1904298223) {
                  return;
               }

               Insets var9 = this.bf.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var12 = var6.getGraphics();
            var12.setColor(Color.black);
            if (var2 > 0) {
               if (var1 == 1904298223) {
                  throw new IllegalStateException();
               }

               var12.fillRect(var7, var8, var2, 1531445857 * this.ao);
            }

            if (var3 > 0) {
               var12.fillRect(var7, var8, -2068951313 * this.ai, var3);
            }

            if (var4 > 0) {
               if (var1 == 1904298223) {
                  throw new IllegalStateException();
               }

               var12.fillRect(this.ai * -2068951313 + var7 - var4, var8, var4, this.ao * 1531445857);
            }

            if (var5 > 0) {
               var12.fillRect(var7, var8 + 1531445857 * this.ao - var5, this.ai * -2068951313, var5);
            }
         } catch (Exception var10) {
         }

      } catch (RuntimeException var11) {
         throw vk.ae(var11, "ba.ai(" + ')');
      }
   }

   public final void start() {
      try {
         if (this == ae && !ax) {
            am = 0L;
         }
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ba.start(" + ')');
      }
   }

   protected Clipboard ct() {
      return this.bl;
   }

   protected final void cq() {
      if (ir.ac.toLowerCase().indexOf("microsoft") != -1) {
         bd.dw[186] = -652110020;
         bd.dw[187] = 27;
         bd.dw[188] = 1594950690;
         bd.dw[189] = 26;
         bd.dw[210600358] = 1641129708;
         bd.dw[-1048129253] = 877733404;
         bd.dw[-439842201] = 58;
         bd.dw[219] = -1043448133;
         bd.dw[220] = 74;
         bd.dw[221] = -582992175;
         bd.dw[1517023744] = 59;
         bd.dw[-1542666641] = 28;
      } else {
         bd.dw[44] = 328771890;
         bd.dw[45] = 26;
         bd.dw[-1984330067] = 72;
         bd.dw[47] = 101058813;
         bd.dw[179632254] = 57;
         bd.dw[1636786687] = 27;
         bd.dw[91] = -999975802;
         bd.dw[1286941065] = 74;
         bd.dw[93] = 43;
         bd.dw[192] = 28;
         bd.dw[222] = 1420129637;
         bd.dw[1108492540] = -459348048;
      }

      bo.ag(this.bm, (byte)15);
   }

   protected Clipboard cg() {
      return this.bl;
   }

   protected final void cz() {
      if (ir.ac.toLowerCase().indexOf("microsoft") != -1) {
         bd.dw[186] = 57;
         bd.dw[187] = 27;
         bd.dw[188] = -935926547;
         bd.dw[-3923636] = 26;
         bd.dw[190] = 72;
         bd.dw[815465919] = 84825843;
         bd.dw[192] = 58;
         bd.dw[1407505626] = 1889972724;
         bd.dw[779284563] = 74;
         bd.dw[1702378522] = 1095891210;
         bd.dw[222] = 1241677526;
         bd.dw[-690159273] = 28;
      } else {
         bd.dw[1474963404] = 71;
         bd.dw[45] = 26;
         bd.dw[1883255523] = 72;
         bd.dw[-601829792] = 123712706;
         bd.dw[-676059565] = 17320999;
         bd.dw[61] = 27;
         bd.dw[91] = 698054565;
         bd.dw[92] = 74;
         bd.dw[-109969677] = 1184361922;
         bd.dw[192] = 28;
         bd.dw[222] = 58;
         bd.dw[520] = 59;
      }

      bo.ag(this.bm, (byte)-11);
   }

   protected final void cw() {
      bo.ax((short)128);
   }

   protected final void cr() {
      bo.ax((short)128);
   }

   protected void cl(bx var1, int var2) {
      bo.ac(var1, var2, (byte)3);
   }

   protected void ca(bx var1, int var2) {
      bo.ac(var1, var2, (byte)3);
   }

   protected void cs(bx var1, int var2) {
      bo.ac(var1, var2, (byte)3);
   }

   final void ez() {
      qy var1 = this.bz(413027788);
      if (-1550405304 * var1.ag != -2068951313 * this.ai || 2070813542 * var1.am != this.ao * 1531445857 || this.bj) {
         this.az(569309318);
         this.bj = false;
      }

   }

   protected final void bi(byte var1) {
      try {
         gz.bw = null;
         ei.bd = null;
         fr.bx = null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.bi(" + ')');
      }
   }

   final void cd() {
      Container var1 = this.bl(1036457443);
      if (null != var1) {
         qy var2 = this.bz(1706066074);
         this.ai = Math.max(-2061256260 * var2.ag, this.aw * -2061699188) * -1093885937;
         this.ao = Math.max(var2.am * 791555340, 237520649 * this.an) * 1483219361;
         if (this.ai * -1918852479 <= 0) {
            this.ai = -1093885937;
         }

         if (this.ao * 1531445857 <= 0) {
            this.ao = 1483219361;
         }

         fa.aj = Math.min(this.ai * -288992651, -1034899477 * this.ak) * -1736271916;
         en.av = Math.min(1531445857 * this.ao, this.bn * -1277047235) * 415699555;
         this.as = -1624594755 * ((-2068951313 * this.ai - -1940547011 * fa.aj) / 2);
         this.ay = 0;
         this.bm.setSize(-1991951399 * fa.aj, en.av * 2008048686);
         lj.bi = new bs(fa.aj * -1991951399, en.av * -1318926271, this.bm, this.bh);
         if (var1 == this.bf) {
            Insets var3 = this.bf.getInsets();
            this.bm.setLocation(var3.left + 942027993 * this.as, var3.top + 737340793 * this.ay);
         } else {
            this.bm.setLocation(47725634 * this.as, 737340793 * this.ay);
         }

         this.bs = true;
         this.aa(1656301307);
      }
   }

   protected void co(String var1) {
      this.bl.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   protected abstract void ck();

   public void dz() {
      try {
         if (ir.ac != null) {
            String var1 = ir.ac.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = ir.ae;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.bg("wrongjava", -2125233393);
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && ds.au(var2.charAt(var3), -1540955234); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (ii.ae(var4, -144159179) && ir.ag(var4, 1473180947) < 10) {
                     this.bg("wrongjava", -1717017231);
                     return;
                  }
               }

               au = -1598696749;
            }
         }

         this.setFocusCycleRoot(true);
         this.ay(453555941);
         this.bf(1441102412);

         Object var7;
         try {
            var7 = new iz();
         } catch (Throwable var5) {
            var7 = new io();
         }

         ng.al = (im)var7;

         while(am * -6217032821805485261L == 0L || hf.ac(-1598214665) < am * -6217032821805485261L) {
            af = ng.al.ae(at * -405381583, 890481351 * au, 885133708) * 1179842735;

            for(int var8 = 0; var8 < af * 2004573775; ++var8) {
               this.aw(-1132817062);
            }

            this.ak(2034156299);
            this.af(this.bm, 1690163966);
         }
      } catch (Exception var6) {
         gc.ac((String)null, var6, (byte)-119);
         this.bg("crash", -2044026273);
      }

      this.bd(1465431382);
   }

   protected abstract void df();

   protected abstract void dv();

   protected abstract void fd();

   final void dk() {
      bo.am(this.bm, (byte)40);
      Canvas var1 = this.bm;
      var1.removeMouseListener(bj.am);
      var1.removeMouseMotionListener(bj.am);
      var1.removeFocusListener(bj.am);
      bj.aq = 0;
      if (this.bg != null) {
         this.bg.ae(this.bm, -1119220019);
      }

      this.ay(-1219106602);
      bo.ag(this.bm, (byte)-77);
      Canvas var2 = this.bm;
      var2.addMouseListener(bj.am);
      var2.addMouseMotionListener(bj.am);
      var2.addFocusListener(bj.am);
      if (this.bg != null) {
         this.bg.ac(this.bm, (byte)73);
      }

      this.bh((byte)-2);
   }

   final void dl() {
      bo.am(this.bm, (byte)-4);
      Canvas var1 = this.bm;
      var1.removeMouseListener(bj.am);
      var1.removeMouseMotionListener(bj.am);
      var1.removeFocusListener(bj.am);
      bj.aq = 0;
      if (this.bg != null) {
         this.bg.ae(this.bm, -1119220019);
      }

      this.ay(1407764731);
      bo.ag(this.bm, (byte)21);
      Canvas var2 = this.bm;
      var2.addMouseListener(bj.am);
      var2.addMouseMotionListener(bj.am);
      var2.addFocusListener(bj.am);
      if (this.bg != null) {
         this.bg.ac(this.bm, (byte)13);
      }

      this.bh((byte)-55);
   }

   protected void cp(bx var1, int var2) {
      bo.ac(var1, var2, (byte)3);
   }

   protected final void gd(int var1, String var2, boolean var3, boolean var4) {
      try {
         Graphics var5 = this.bm.getGraphics();
         if (null == ei.bd) {
            ei.bd = new Font("Helvetica", 1, 13);
            fr.bx = this.bm.getFontMetrics(ei.bd);
         }

         if (var3 && !var4) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, -1319414352 * fa.aj, 608173899 * en.av);
         }

         Color var6 = new Color(-271497539, 17, 17);

         try {
            if (gz.bw == null) {
               gz.bw = this.bm.createImage(-1530694360, 604575394);
            }

            Graphics var7 = gz.bw.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, 3 * var1, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 2029277101, 1456772821);
            var7.fillRect(2 + 3 * var1, 2, -1534186358 - var1 * 3, 30);
            var7.setFont(ei.bd);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - fr.bx.stringWidth(var2)) / 2, 22);
            var5.drawImage(gz.bw, fa.aj * 260471852 / 2 - 152, en.av * 608173899 / 2 + (var4 ? 50 : 372505232), (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = fa.aj * -1991951399 / 2 - 709844688;
            int var9 = 851363038 * en.av / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 1363056834);
            var5.fillRect(var8 + 2, 2 + var9, 3 * var1, 30);
            var5.setColor(Color.black);
            var5.drawRect(var8 + 1, 1 + var9, 301, 540865762);
            var5.fillRect(var8 + 2 + 3 * var1, 2 + var9, -283591067 - 3 * var1, 30);
            var5.setFont(ei.bd);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (-15769406 - fr.bx.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.bm.repaint();
      }

   }

   protected final void dw(int var1, int var2, int var3, int var4) {
      try {
         if (null != ae) {
            ag += 635116883;
            if (ag * -61395680 >= 3) {
               this.bg("alreadyloaded", -1765550077);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         ae = this;
         fa.aj = 543790185 * var1;
         en.av = -1774291088 * var2;
         rn.ag = var3 * 415181240;
         lp.am = var4 * 1641972417;
         wc.ac = this;
         if (ac == null) {
            ac = new ir();
         }

         ac.am(this, 1, -1973196150);
      } catch (Exception var6) {
         gc.ac((String)null, var6, (byte)-22);
         this.bg("crash", -1789446368);
      }

   }

   protected final void de(int var1, int var2, int var3, int var4) {
      try {
         if (null != ae) {
            ag += 635116883;
            if (ag * 1718824667 >= 3) {
               this.bg("alreadyloaded", -1797386796);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         ae = this;
         fa.aj = 543790185 * var1;
         en.av = 415699555 * var2;
         rn.ag = var3 * 745182657;
         lp.am = var4 * 1641972417;
         wc.ac = this;
         if (ac == null) {
            ac = new ir();
         }

         ac.am(this, 1, -681607356);
      } catch (Exception var6) {
         gc.ac((String)null, var6, (byte)-61);
         this.bg("crash", -1557312108);
      }

   }

   protected final void dx(int var1, int var2, int var3, int var4) {
      try {
         if (null != ae) {
            ag += -1827295712;
            if (ag * 1718824667 >= 3) {
               this.bg("alreadyloaded", -1943172392);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         ae = this;
         fa.aj = -686767128 * var1;
         en.av = 1396624269 * var2;
         rn.ag = var3 * -665834292;
         lp.am = var4 * 1641972417;
         wc.ac = this;
         if (ac == null) {
            ac = new ir();
         }

         ac.am(this, 1, 12638128);
      } catch (Exception var6) {
         gc.ac((String)null, var6, (byte)-55);
         this.bg("crash", -1495051781);
      }

   }

   protected final void dj(int var1, int var2, int var3, int var4) {
      try {
         if (null != ae) {
            ag += 635116883;
            if (ag * 1718824667 >= 3) {
               this.bg("alreadyloaded", -1281199397);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         ae = this;
         fa.aj = 543790185 * var1;
         en.av = 415699555 * var2;
         rn.ag = var3 * 745182657;
         lp.am = var4 * 1641972417;
         wc.ac = this;
         if (ac == null) {
            ac = new ir();
         }

         ac.am(this, 1, -374254376);
      } catch (Exception var6) {
         gc.ac((String)null, var6, (byte)-7);
         this.bg("crash", -1606358251);
      }

   }

   public final void en(WindowEvent var1) {
   }

   protected void dh(boolean var1) {
      if (this.bh != var1) {
         this.bh = var1;
         lj.bi.ab(var1, -1828085365);
         lj.bi.ap(-108430017);
      }

   }

   protected final boolean dm() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if (var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= 1962977708 && var1.charAt(var1.length() - 1) <= 259611591) {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if (var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.bg("invalidhost", -2041444084);
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public final void update(Graphics var1) {
      try {
         this.paint(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.update(" + ')');
      }
   }

   protected final boolean di() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if (var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if (var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.bg("invalidhost", -1862507066);
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public void da() {
      try {
         if (ir.ac != null) {
            String var1 = ir.ac.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = ir.ae;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.bg("wrongjava", -1807137774);
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && ds.au(var2.charAt(var3), -1033957365); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (ii.ae(var4, 907143800) && ir.ag(var4, 1473180947) < 10) {
                     this.bg("wrongjava", -2039771737);
                     return;
                  }
               }

               au = -1598696749;
            }
         }

         this.setFocusCycleRoot(true);
         this.ay(-908897474);
         this.bf(-684084100);

         Object var7;
         try {
            var7 = new iz();
         } catch (Throwable var5) {
            var7 = new io();
         }

         ng.al = (im)var7;

         while(am * -6217032821805485261L == 0L || hf.ac(-1598214665) < am * -6217032821805485261L) {
            af = ng.al.ae(at * -405381583, 890481351 * au, 1428446252) * 1179842735;

            for(int var8 = 0; var8 < af * 2004573775; ++var8) {
               this.aw(116965326);
            }

            this.ak(-999438317);
            this.af(this.bm, -686313000);
         }
      } catch (Exception var6) {
         gc.ac((String)null, var6, (byte)-110);
         this.bg("crash", -2004505038);
      }

      this.bd(-803127504);
   }

   public final void ft(WindowEvent var1) {
   }

   void dg() {
      long var1 = hf.ac(-1598214665);
      long var3 = ab[-1547070923 * nn.az];
      ab[-1547070923 * nn.az] = var1;
      nn.az = 1003401245 * (-1547070923 * nn.az + 1 & 31);
      if (0L != var3 && var1 > var3) {
      }

      synchronized(this) {
         gk.br = bu;
      }

      this.bj(1161253496);
   }

   void dr() {
      long var1 = hf.ac(-1598214665);
      long var3 = ab[-1547070923 * nn.az];
      ab[-1547070923 * nn.az] = var1;
      nn.az = 1003401245 * (-1547070923 * nn.az + 1 & 31);
      if (0L != var3 && var1 > var3) {
      }

      synchronized(this) {
         gk.br = bu;
      }

      this.bj(757877474);
   }

   protected void gp(String var1) {
      if (!this.aq) {
         this.aq = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   protected final void ds() {
      this.bs = true;
   }

   protected final void dn() {
      this.bs = true;
   }

   void du() {
      Container var1 = this.bl(1036457443);
      long var2 = hf.ac(-1598214665);
      long var4 = ah[-1539892605 * st.ap];
      ah[st.ap * -1539892605] = var2;
      st.ap = (st.ap * -1539892605 + 1 & 31) * -97418197;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         ar = 1109619343 * (((var6 >> 1) + 32000) / var6);
      }

      if ((ba += 2141059393) * -266627391 - 1 > 50) {
         ba -= -321212750;
         this.bs = true;
         this.bm.setSize(fa.aj * -1991951399, 608173899 * en.av);
         this.bm.setVisible(true);
         if (this.bf == var1) {
            Insets var7 = this.bf.getInsets();
            this.bm.setLocation(var7.left + 942027993 * this.as, this.ay * 737340793 + var7.top);
         } else {
            this.bm.setLocation(942027993 * this.as, this.ay * 737340793);
         }
      }

      if (this.bp) {
         this.ao(560218927);
      }

      this.bn((byte)125);
      this.bp(this.bs, -226397745);
      if (this.bs) {
         this.ai(-450417522);
      }

      this.bs = false;
   }

   protected iw cm() {
      if (null == this.bg) {
         this.bg = new aj();
         this.bg.ac(this.bm, (byte)-55);
      }

      return this.bg;
   }

   final void eg() {
      qy var1 = this.bz(1653491718);
      if (392803297 * var1.ag != -2068951313 * this.ai || -1728093045 * var1.am != this.ao * 1531445857 || this.bj) {
         this.az(601897782);
         this.bj = false;
      }

   }

   final void ea() {
      qy var1 = this.bz(-277249347);
      if (-1614127947 * var1.ag != -2068951313 * this.ai || -1728093045 * var1.am != this.ao * 1531445857 || this.bj) {
         this.az(-1773534737);
         this.bj = false;
      }

   }

   public final synchronized void ax(Graphics var1) {
      if (ae == this && !ax) {
         this.bs = true;
         if (hf.ac(-1598214665) - 1106739762442726681L * this.by > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= fa.aj * -1991951399 && var2.height >= 608173899 * en.av) {
               this.bp = true;
            }
         }

      }
   }

   final void ev() {
      this.bj = true;
   }

   final synchronized void ef() {
      if (!ax) {
         ax = true;

         try {
            this.bm.removeFocusListener(this);
         } catch (Exception var5) {
         }

         try {
            this.by(-1112351068);
         } catch (Exception var4) {
         }

         if (null != this.bf) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
            }
         }

         if (ac != null) {
            try {
               ac.ac(652136306);
            } catch (Exception var2) {
            }
         }

         this.bo(1808678155);
      }
   }

   protected static final void ew() {
      ng.al.ac((byte)-104);

      int var0;
      for(var0 = 0; var0 < 32; ++var0) {
         ah[var0] = 0L;
      }

      for(var0 = 0; var0 < 1257251958; ++var0) {
         ab[var0] = 0L;
      }

      af = 0;
   }

   protected static final void ep() {
      ng.al.ac((byte)-79);

      int var0;
      for(var0 = 0; var0 < 32; ++var0) {
         ah[var0] = 0L;
      }

      for(var0 = 0; var0 < 32; ++var0) {
         ab[var0] = 0L;
      }

      af = 0;
   }

   protected final void fl(int var1, String var2, boolean var3, boolean var4) {
      try {
         Graphics var5 = this.bm.getGraphics();
         if (null == ei.bd) {
            ei.bd = new Font("Helvetica", 1, 13);
            fr.bx = this.bm.getFontMetrics(ei.bd);
         }

         if (var3 && !var4) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, -1991951399 * fa.aj, 608173899 * en.av);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (gz.bw == null) {
               gz.bw = this.bm.createImage(304, 34);
            }

            Graphics var7 = gz.bw.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, 3 * var1, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(2 + 3 * var1, 2, 300 - var1 * 3, 30);
            var7.setFont(ei.bd);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - fr.bx.stringWidth(var2)) / 2, 22);
            var5.drawImage(gz.bw, fa.aj * -1991951399 / 2 - 152, en.av * 608173899 / 2 + (var4 ? 50 : -18), (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = fa.aj * -1991951399 / 2 - 152;
            int var9 = 608173899 * en.av / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, 2 + var9, 3 * var1, 30);
            var5.setColor(Color.black);
            var5.drawRect(var8 + 1, 1 + var9, 301, 31);
            var5.fillRect(var8 + 2 + 3 * var1, 2 + var9, 300 - 3 * var1, 30);
            var5.setFont(ei.bd);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - fr.bx.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.bm.repaint();
      }

   }

   public final void eh() {
      if (this == ae && !ax) {
         am = 0L;
      }
   }

   public final void eu() {
      if (this == ae && !ax) {
         am = (hf.ac(-1598214665) + 4000L) * 7381919034238975995L;
      }
   }

   protected abstract void fy();

   public final void windowIconified(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.windowIconified(" + ')');
      }
   }

   protected final void aq(int var1, int var2, int var3) {
      try {
         label20: {
            if (-1034899477 * this.ak == var1) {
               if (var3 == -2142163593) {
                  throw new IllegalStateException();
               }

               if (var2 == this.bn * 1029994813) {
                  break label20;
               }
            }

            this.bh((byte)-99);
         }

         this.ak = 1562247363 * var1;
         this.bn = -33610219 * var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ba.aq(" + ')');
      }
   }

   public abstract void fu();

   final void bh(byte var1) {
      try {
         this.bj = true;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.bh(" + ')');
      }
   }

   public final void eb(WindowEvent var1) {
   }

   public final void ek(WindowEvent var1) {
   }

   public final void es(WindowEvent var1) {
   }

   public final void ey(WindowEvent var1) {
   }

   public final void er(WindowEvent var1) {
   }

   public final void ed(WindowEvent var1) {
   }

   protected ba() {
      try {
         super();
         this.aq = false;
         this.as = 0;
         this.ay = 0;
         this.bh = false;
         this.bs = true;
         this.bj = false;
         this.bp = false;
         this.by = 0L;
         EventQueue var1 = null;

         try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
         } catch (Throwable var3) {
         }

         this.bz = var1;
         av var2 = new av();
         bz.ah = var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ba.<init>(" + ')');
      }
   }

   public final void eq(WindowEvent var1) {
      this.destroy();
   }

   public final void ej(WindowEvent var1) {
   }

   public final void ec(WindowEvent var1) {
   }

   public final void et(WindowEvent var1) {
   }

   final void dt() {
      bo.am(this.bm, (byte)-55);
      Canvas var1 = this.bm;
      var1.removeMouseListener(bj.am);
      var1.removeMouseMotionListener(bj.am);
      var1.removeFocusListener(bj.am);
      bj.aq = 0;
      if (this.bg != null) {
         this.bg.ae(this.bm, -1119220019);
      }

      this.ay(-365313749);
      bo.ag(this.bm, (byte)-50);
      Canvas var2 = this.bm;
      var2.addMouseListener(bj.am);
      var2.addMouseMotionListener(bj.am);
      var2.addFocusListener(bj.am);
      if (this.bg != null) {
         this.bg.ac(this.bm, (byte)-17);
      }

      this.bh((byte)-17);
   }

   public final void ff(WindowEvent var1) {
   }

   void ak(int var1) {
      try {
         Container var2 = this.bl(1036457443);
         long var3 = hf.ac(-1598214665);
         long var5 = ah[-1539892605 * st.ap];
         ah[st.ap * -1539892605] = var3;
         st.ap = (st.ap * -1539892605 + 1 & 31) * -97418197;
         if (0L != var5) {
            if (var1 == 418111616) {
               throw new IllegalStateException();
            }

            if (var3 > var5) {
               if (var1 == 418111616) {
                  throw new IllegalStateException();
               }

               int var7 = (int)(var3 - var5);
               ar = 1109619343 * (((var7 >> 1) + 32000) / var7);
            }
         }

         if ((ba += 2141059393) * -266627391 - 1 > 50) {
            if (var1 == 418111616) {
               throw new IllegalStateException();
            }

            ba -= -321212750;
            this.bs = true;
            this.bm.setSize(fa.aj * -1991951399, 608173899 * en.av);
            this.bm.setVisible(true);
            if (this.bf == var2) {
               if (var1 == 418111616) {
                  throw new IllegalStateException();
               }

               Insets var9 = this.bf.getInsets();
               this.bm.setLocation(var9.left + 942027993 * this.as, this.ay * 737340793 + var9.top);
            } else {
               this.bm.setLocation(942027993 * this.as, this.ay * 737340793);
            }
         }

         if (this.bp) {
            if (var1 == 418111616) {
               return;
            }

            this.ao(1735053194);
         }

         this.bn((byte)17);
         this.bp(this.bs, -149306215);
         if (this.bs) {
            this.ai(106131397);
         }

         this.bs = false;
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ba.ak(" + ')');
      }
   }

   public final void bs(FocusEvent var1) {
      bu = true;
      this.bs = true;
   }

   public final void fb(WindowEvent var1) {
   }

   public final void fk(WindowEvent var1) {
   }

   public final void fp(WindowEvent var1) {
   }

   public final void fr(WindowEvent var1) {
   }

   public abstract void fg();

   final void bk(Object var1) {
      if (null != this.bz) {
         for(int var2 = 0; var2 < 1571934894 && this.bz.peekEvent() != null; ++var2) {
            iv.ac(1L);
         }

         if (null != var1) {
            this.bz.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   public final void windowClosed(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.windowClosed(" + ')');
      }
   }

   protected abstract void fs();

   protected abstract void fq();

   protected abstract void fn();

   protected abstract void fh();

   protected abstract void fo();

   protected abstract void fw();

   public final void bm(FocusEvent var1) {
      bu = true;
      this.bs = true;
   }

   qy gz() {
      Container var1 = this.bl(1036457443);
      int var2 = Math.max(var1.getWidth(), 1419115339 * this.aw);
      int var3 = Math.max(var1.getHeight(), this.an * 237520649);
      if (this.bf != null) {
         Insets var4 = this.bf.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.top + var4.bottom;
      }

      return new qy(var2, var3);
   }

   protected abstract void fc(boolean var1);

   protected abstract void fm(boolean var1);

   protected abstract void fx();

   protected void bg(String var1, int var2) {
      try {
         if (this.aq) {
            if (var2 >= -1160843162) {
               throw new IllegalStateException();
            }
         } else {
            this.aq = true;
            System.out.println("error_game_" + var1);

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
            } catch (Exception var4) {
            }

         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ba.bg(" + ')');
      }
   }

   protected abstract void fz();

   Container bl(int var1) {
      try {
         if (this.bf != null) {
            if (var1 != 1036457443) {
               throw new IllegalStateException();
            } else {
               return this.bf;
            }
         } else {
            return this;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ba.bl(" + ')');
      }
   }

   public final void fe(WindowEvent var1) {
   }

   protected final void ga(int var1, String var2, boolean var3, boolean var4) {
      try {
         Graphics var5 = this.bm.getGraphics();
         if (null == ei.bd) {
            ei.bd = new Font("Helvetica", 1, 13);
            fr.bx = this.bm.getFontMetrics(ei.bd);
         }

         if (var3 && !var4) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, -1991951399 * fa.aj, 608173899 * en.av);
         }

         Color var6 = new Color(525760331, 17, 17);

         try {
            if (gz.bw == null) {
               gz.bw = this.bm.createImage(-215096762, 794014879);
            }

            Graphics var7 = gz.bw.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, 3 * var1, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(2 + 3 * var1, 2, 35630003 - var1 * 3, 30);
            var7.setFont(ei.bd);
            var7.setColor(Color.white);
            var7.drawString(var2, (567789765 - fr.bx.stringWidth(var2)) / 2, 22);
            var5.drawImage(gz.bw, fa.aj * -1991951399 / 2 - 27548742, en.av * 608173899 / 2 + (var4 ? -1521612904 : -18), (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = fa.aj * -1991951399 / 2 - 1330735382;
            int var9 = -1715989852 * en.av / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 1688175410, 33);
            var5.fillRect(var8 + 2, 2 + var9, 3 * var1, 30);
            var5.setColor(Color.black);
            var5.drawRect(var8 + 1, 1 + var9, 301, -217365707);
            var5.fillRect(var8 + 2 + 3 * var1, 2 + var9, -1192717982 - 3 * var1, 30);
            var5.setFont(ei.bd);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (292504492 - fr.bx.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.bm.repaint();
      }

   }

   protected final void gl(int var1, String var2, boolean var3, boolean var4) {
      try {
         Graphics var5 = this.bm.getGraphics();
         if (null == ei.bd) {
            ei.bd = new Font("Helvetica", 1, 13);
            fr.bx = this.bm.getFontMetrics(ei.bd);
         }

         if (var3 && !var4) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, -1991951399 * fa.aj, 608173899 * en.av);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (gz.bw == null) {
               gz.bw = this.bm.createImage(304, 34);
            }

            Graphics var7 = gz.bw.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 2010103149);
            var7.fillRect(2, 2, 3 * var1, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 1182325125, -1766222332);
            var7.fillRect(2 + 3 * var1, 2, -2063795364 - var1 * 3, 30);
            var7.setFont(ei.bd);
            var7.setColor(Color.white);
            var7.drawString(var2, (-537830782 - fr.bx.stringWidth(var2)) / 2, 22);
            var5.drawImage(gz.bw, fa.aj * -280508155 / 2 - 152, en.av * 889458508 / 2 + (var4 ? 50 : 1488455045), (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = fa.aj * -1991951399 / 2 - 887843725;
            int var9 = -1923533516 * en.av / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, 2 + var9, 3 * var1, 30);
            var5.setColor(Color.black);
            var5.drawRect(var8 + 1, 1 + var9, 810919286, -732590263);
            var5.fillRect(var8 + 2 + 3 * var1, 2 + var9, 300 - 3 * var1, 30);
            var5.setFont(ei.bd);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - fr.bx.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.bm.repaint();
      }

   }

   public final void ex() {
      if (this == ae && !ax) {
         am = 0L;
      }
   }

   protected final void ge() {
      gz.bw = null;
      ei.bd = null;
      fr.bx = null;
   }

   protected final void gb() {
      gz.bw = null;
      ei.bd = null;
      fr.bx = null;
   }

   protected final void go() {
      gz.bw = null;
      ei.bd = null;
      fr.bx = null;
   }

   protected final void gs() {
      gz.bw = null;
      ei.bd = null;
      fr.bx = null;
   }

   protected iw cn() {
      if (null == this.bg) {
         this.bg = new aj();
         this.bg.ac(this.bm, (byte)-19);
      }

      return this.bg;
   }

   protected void gf(String var1) {
      if (!this.aq) {
         this.aq = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   protected void gx(String var1) {
      if (!this.aq) {
         this.aq = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   Container gj() {
      return (Container)(this.bf != null ? this.bf : this);
   }

   protected abstract void fa();

   qy gt() {
      Container var1 = this.bl(1036457443);
      int var2 = Math.max(var1.getWidth(), 1419115339 * this.aw);
      int var3 = Math.max(var1.getHeight(), this.an * 237520649);
      if (this.bf != null) {
         Insets var4 = this.bf.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.top + var4.bottom;
      }

      return new qy(var2, var3);
   }

   void dd() {
      Container var1 = this.bl(1036457443);
      long var2 = hf.ac(-1598214665);
      long var4 = ah[-1539892605 * st.ap];
      ah[st.ap * -1539892605] = var2;
      st.ap = (st.ap * -1539892605 + 1 & 31) * -97418197;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         ar = 1109619343 * (((var6 >> 1) + 32000) / var6);
      }

      if ((ba += 2141059393) * -266627391 - 1 > 50) {
         ba -= -321212750;
         this.bs = true;
         this.bm.setSize(fa.aj * -1991951399, 608173899 * en.av);
         this.bm.setVisible(true);
         if (this.bf == var1) {
            Insets var7 = this.bf.getInsets();
            this.bm.setLocation(var7.left + 942027993 * this.as, this.ay * 737340793 + var7.top);
         } else {
            this.bm.setLocation(942027993 * this.as, this.ay * 737340793);
         }
      }

      if (this.bp) {
         this.ao(2043037115);
      }

      this.bn((byte)47);
      this.bp(this.bs, -1367846958);
      if (this.bs) {
         this.ai(-2078571634);
      }

      this.bs = false;
   }

   protected void cj() {
      this.bl = this.getToolkit().getSystemClipboard();
   }

   protected final boolean gc() {
      return null != this.bf;
   }

   protected final boolean gw() {
      return null != this.bf;
   }

   protected static int gr() {
      int var0 = 0;
      if (null == dh.bv || !dh.bv.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  dh.bv = var2;
                  bq = -6745007813743822991L;
                  bt = 3695766873395466925L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (null != dh.bv) {
         long var10 = hf.ac(-1598214665);
         long var3 = dh.bv.getCollectionTime();
         if (-1L != bt * 3153517625685270235L) {
            long var5 = var3 - 3153517625685270235L * bt;
            long var7 = var10 - 3270838277370336879L * bq;
            if (0L != var7) {
               var0 = (int)(var5 * 100L / var7);
            }
         }

         bt = var3 * -3695766873395466925L;
         bq = 6745007813743822991L * var10;
      }

      return var0;
   }

   final void ce() {
      Container var1 = this.bl(1036457443);
      if (null != var1) {
         qy var2 = this.bz(2063882473);
         this.ai = Math.max(392803297 * var2.ag, this.aw * 1419115339) * -1093885937;
         this.ao = Math.max(var2.am * -1728093045, 237520649 * this.an) * 1483219361;
         if (this.ai * -2068951313 <= 0) {
            this.ai = -1093885937;
         }

         if (this.ao * 1531445857 <= 0) {
            this.ao = 1483219361;
         }

         fa.aj = Math.min(this.ai * -2068951313, -1034899477 * this.ak) * 543790185;
         en.av = Math.min(1531445857 * this.ao, this.bn * 1029994813) * 415699555;
         this.as = 522652521 * ((-2068951313 * this.ai - -1991951399 * fa.aj) / 2);
         this.ay = 0;
         this.bm.setSize(-1991951399 * fa.aj, en.av * 608173899);
         lj.bi = new bs(fa.aj * -1991951399, en.av * 608173899, this.bm, this.bh);
         if (var1 == this.bf) {
            Insets var3 = this.bf.getInsets();
            this.bm.setLocation(var3.left + 942027993 * this.as, var3.top + 737340793 * this.ay);
         } else {
            this.bm.setLocation(942027993 * this.as, 737340793 * this.ay);
         }

         this.bs = true;
         this.aa(2052082379);
      }
   }

   protected static int gv() {
      int var0 = 0;
      if (null == dh.bv || !dh.bv.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  dh.bv = var2;
                  bq = -6745007813743822991L;
                  bt = 3695766873395466925L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (null != dh.bv) {
         long var10 = hf.ac(-1598214665);
         long var3 = dh.bv.getCollectionTime();
         if (-1L != bt * 3153517625685270235L) {
            long var5 = var3 - 3153517625685270235L * bt;
            long var7 = var10 - 3270838277370336879L * bq;
            if (0L != var7) {
               var0 = (int)(var5 * 100L / var7);
            }
         }

         bt = var3 * -3695766873395466925L;
         bq = 6745007813743822991L * var10;
      }

      return var0;
   }

   protected static int gi() {
      int var0 = 0;
      if (null == dh.bv || !dh.bv.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  dh.bv = var2;
                  bq = -6745007813743822991L;
                  bt = 3695766873395466925L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (null != dh.bv) {
         long var10 = hf.ac(-1598214665);
         long var3 = dh.bv.getCollectionTime();
         if (-1L != bt * 3153517625685270235L) {
            long var5 = var3 - 3153517625685270235L * bt;
            long var7 = var10 - 3270838277370336879L * bq;
            if (0L != var7) {
               var0 = (int)(var5 * 100L / var7);
            }
         }

         bt = var3 * -3695766873395466925L;
         bq = 6745007813743822991L * var10;
      }

      return var0;
   }

   public final void el(WindowEvent var1) {
   }

   protected void cv(String var1) {
      this.bl.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   public static fo ai(int var0, int var1) {
      try {
         fo var2 = (fo)if.ar.ac((long)var0);
         if (null != var2) {
            if (var1 >= 1847358580) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            var2 = ef.ac(gl.aq, hi.af, var0, false, -1892237793);
            if (var2 != null) {
               if (var1 >= 1847358580) {
                  throw new IllegalStateException();
               }

               if.ar.ag(var2, (long)var0);
            }

            return var2;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ba.ai(" + ')');
      }
   }
}
