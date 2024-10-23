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

public abstract class bz extends Applet implements Runnable, FocusListener, WindowListener {
   static bz aw = null;
   final EventQueue bm;
   static int ak = 0;
   static long aj = 0L;
   static boolean ai = false;
   static int bz = -944143444;
   int av;
   static int am = -535663139;
   protected static int at = 0;
   static ie au;
   static long[] ao = new long[32];
   protected int ag;
   static int gb;
   protected int ad;
   int ac;
   Canvas bb;
   int al;
   volatile long br;
   int ah;
   protected static ah ba = new ah();
   protected boolean bj;
   boolean ay;
   protected static int ae = -1015880268;
   volatile boolean bq;
   static Image bp;
   static long[] ar = new long[32];
   boolean bc;
   volatile boolean by;
   protected static io ap;
   ax bt;
   Clipboard bs;
   Frame bk;
   static volatile boolean bo = true;
   int aa;
   static long bi = -6462716048878562559L;
   static long bf = 105761223344251675L;
   int bh;
   static cz mx;

   protected final void ag(int var1, int var2, int var3, int var4, int var5) {
      try {
         try {
            if (null != aw) {
               if (var5 == -1038142635) {
                  throw new IllegalStateException();
               }

               ak += -70977557;
               if (-1224509245 * ak >= 3) {
                  if (var5 == -1038142635) {
                     throw new IllegalStateException();
                  }

                  this.bt("alreadyloaded", 623255149);
                  return;
               }

               this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
               return;
            }

            aw = this;
            ac.ax = 245766511 * var1;
            ki.aq = -1908196411 * var2;
            ts.ak = var3 * -1528705681;
            wa.aj = 658961421 * var4;
            wa.ap = this;
            if (null == ap) {
               if (var5 == -1038142635) {
                  throw new IllegalStateException();
               }

               ap = new io();
            }

            ap.aj(this, 1, -725588083);
         } catch (Exception var7) {
            rl.ap((String)null, var7, (byte)-14);
            this.bt("crash", 623255149);
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "bz.ag(" + ')');
      }
   }

   protected final void aj(int var1, int var2, int var3) {
      try {
         label23: {
            if (var1 == this.ah * 693217755) {
               if (var3 != -1758246031) {
                  throw new IllegalStateException();
               }

               if (35839199 * this.bh == var2) {
                  break label23;
               }

               if (var3 != -1758246031) {
                  throw new IllegalStateException();
               }
            }

            this.bb(-2038238338);
         }

         this.ah = var1 * -1569183149;
         this.bh = 197123871 * var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bz.aj(" + ')');
      }
   }

   public final void ef(WindowEvent var1) {
   }

   final void ai(Object var1, int var2) {
      try {
         if (this.bm == null) {
            if (var2 >= 602512318) {
               throw new IllegalStateException();
            }
         } else {
            for(int var3 = 0; var3 < 50; ++var3) {
               if (var2 >= 602512318) {
                  throw new IllegalStateException();
               }

               if (this.bm.peekEvent() == null) {
                  break;
               }

               if (var2 >= 602512318) {
                  throw new IllegalStateException();
               }

               ct.ap(1L);
            }

            if (null != var1) {
               if (var2 >= 602512318) {
                  throw new IllegalStateException();
               }

               this.bm.postEvent(new ActionEvent(var1, 1001, "dummy"));
            }

         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bz.ai(" + ')');
      }
   }

   public final void ei(WindowEvent var1) {
   }

   protected void ae(String var1, int var2) {
      try {
         this.bs.setContents(new StringSelection(var1), (ClipboardOwner)null);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bz.ae(" + ')');
      }
   }

   protected Clipboard am(byte var1) {
      try {
         return this.bs;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.am(" + ')');
      }
   }

   protected final void at(int var1) {
      try {
         if (io.ap.toLowerCase().indexOf("microsoft") != -1) {
            if (var1 <= 794977052) {
               throw new IllegalStateException();
            }

            bv.du[186] = 57;
            bv.du[187] = 27;
            bv.du[188] = 71;
            bv.du[189] = 26;
            bv.du[190] = 72;
            bv.du[191] = 73;
            bv.du[192] = 58;
            bv.du[219] = 42;
            bv.du[220] = 74;
            bv.du[221] = 43;
            bv.du[222] = 59;
            bv.du[223] = 28;
         } else {
            bv.du[44] = 71;
            bv.du[45] = 26;
            bv.du[46] = 72;
            bv.du[47] = 73;
            bv.du[59] = 57;
            bv.du[61] = 27;
            bv.du[91] = 42;
            bv.du[92] = 74;
            bv.du[93] = 43;
            bv.du[192] = 28;
            bv.du[222] = 58;
            bv.du[520] = 59;
         }

         ba.ak(this.bb, -1759530482);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.at(" + ')');
      }
   }

   protected final void au(int var1) {
      try {
         ba.ai(455142985);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.au(" + ')');
      }
   }

   public final synchronized void paint(Graphics var1) {
      try {
         if (aw == this && !ai) {
            this.bq = true;
            if (ck.ap(-1684308193) - this.br * -1204627423140406151L > 1000L) {
               Rectangle var2 = var1.getClipBounds();
               if (null == var2 || var2.width >= ac.ax * 1816225167 && var2.height >= ki.aq * -121992435) {
                  this.by = true;
               }
            }

         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bz.paint(" + ')');
      }
   }

   qg fr() {
      Container var1 = this.bs((byte)-86);
      int var2 = Math.max(var1.getWidth(), this.al * 2023971881);
      int var3 = Math.max(var1.getHeight(), this.aa * -726727417);
      if (null != this.bk) {
         Insets var4 = this.bk.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.bottom + var4.top;
      }

      return new qg(var2, var3);
   }

   qg fb() {
      Container var1 = this.bs((byte)8);
      int var2 = Math.max(var1.getWidth(), this.al * 2023971881);
      int var3 = Math.max(var1.getHeight(), this.aa * -1053610053);
      if (null != this.bk) {
         Insets var4 = this.bk.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.bottom + var4.top;
      }

      return new qg(var2, var3);
   }

   protected abstract void ar(int var1);

   void ab(int var1) {
      try {
         int var2 = 559571575 * this.ac;
         int var3 = 14626319 * this.av;
         int var4 = -28526951 * this.ag - 1816225167 * ac.ax - var2;
         int var5 = this.ad * -2081679351 - ki.aq * -121992435 - var3;
         if (var2 <= 0) {
            if (var1 >= 1501656693) {
               throw new IllegalStateException();
            }

            if (var4 <= 0) {
               if (var1 >= 1501656693) {
                  throw new IllegalStateException();
               }

               if (var3 <= 0) {
                  if (var1 >= 1501656693) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 0) {
                     return;
                  }

                  if (var1 >= 1501656693) {
                     return;
                  }
               }
            }
         }

         try {
            Container var6 = this.bs((byte)-12);
            int var7 = 0;
            int var8 = 0;
            if (this.bk == var6) {
               if (var1 >= 1501656693) {
                  throw new IllegalStateException();
               }

               Insets var9 = this.bk.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var12 = var6.getGraphics();
            var12.setColor(Color.black);
            if (var2 > 0) {
               if (var1 >= 1501656693) {
                  throw new IllegalStateException();
               }

               var12.fillRect(var7, var8, var2, this.ad * -2081679351);
            }

            if (var3 > 0) {
               if (var1 >= 1501656693) {
                  throw new IllegalStateException();
               }

               var12.fillRect(var7, var8, -28526951 * this.ag, var3);
            }

            if (var4 > 0) {
               if (var1 >= 1501656693) {
                  throw new IllegalStateException();
               }

               var12.fillRect(-28526951 * this.ag + var7 - var4, var8, var4, -2081679351 * this.ad);
            }

            if (var5 > 0) {
               if (var1 >= 1501656693) {
                  return;
               }

               var12.fillRect(var7, this.ad * -2081679351 + var8 - var5, this.ag * -28526951, var5);
            }
         } catch (Exception var10) {
         }

      } catch (RuntimeException var11) {
         throw tm.aw(var11, "bz.ab(" + ')');
      }
   }

   final void az(int var1) {
      try {
         ba.aj(this.bb, -2052216250);
         nz.ap(this.bb, (byte)42);
         if (null != this.bt) {
            if (var1 == -1357435614) {
               return;
            }

            this.bt.aw(this.bb, 1983097211);
         }

         this.ad(2002210163);
         ba.ak(this.bb, -598323427);
         Canvas var2 = this.bb;
         var2.addMouseListener(bc.aj);
         var2.addMouseMotionListener(bc.aj);
         var2.addFocusListener(bc.aj);
         if (null != this.bt) {
            this.bt.ap(this.bb, 151039694);
         }

         this.bb(-312268750);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bz.az(" + ')');
      }
   }

   void dx() {
      Container var1 = this.bs((byte)-79);
      long var2 = ck.ap(-1255243584);
      long var4 = ao[-965595385 * gl.af];
      ao[gl.af * -965595385] = var2;
      gl.af = (-965595385 * gl.af + 1 & 31) * -1975382345;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         at = ((var6 >> 1) + 32000) / var6 * -87835905;
      }

      if ((bz += 1621609351) * 1644169783 - 1 > 50) {
         bz -= -523911074;
         this.bq = true;
         this.bb.setSize(ac.ax * 1816225167, -121992435 * ki.aq);
         this.bb.setVisible(true);
         if (this.bk == var1) {
            Insets var7 = this.bk.getInsets();
            this.bb.setLocation(var7.left + this.ac * 559571575, 14626319 * this.av + var7.top);
         } else {
            this.bb.setLocation(559571575 * this.ac, this.av * 14626319);
         }
      }

      if (this.by) {
         this.az(-1900949678);
      }

      this.bk((byte)-119);
      this.by(this.bq, 1760879817);
      if (this.bq) {
         this.ab(266452885);
      }

      this.bq = false;
   }

   public abstract void eq();

   public final void ev() {
      if (this == aw && !ai) {
         aj = (ck.ap(-798054038) + 4000L) * 6587260579507547971L;
      }
   }

   protected final boolean av(int var1) {
      try {
         String var2 = this.getDocumentBase().getHost().toLowerCase();
         if (!var2.equals("jagex.com")) {
            if (var1 <= 1089698000) {
               throw new IllegalStateException();
            }

            if (!var2.endsWith(".jagex.com")) {
               if (!var2.equals("runescape.com")) {
                  if (var1 <= 1089698000) {
                     throw new IllegalStateException();
                  }

                  if (!var2.endsWith(".runescape.com")) {
                     if (var2.endsWith("127.0.0.1")) {
                        if (var1 <= 1089698000) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     while(var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0') {
                        if (var1 <= 1089698000) {
                           throw new IllegalStateException();
                        }

                        if (var2.charAt(var2.length() - 1) > '9') {
                           break;
                        }

                        var2 = var2.substring(0, var2.length() - 1);
                     }

                     if (var2.endsWith("192.168.1.")) {
                        if (var1 <= 1089698000) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     this.bt("invalidhost", 623255149);
                     return false;
                  }

                  if (var1 <= 1089698000) {
                     throw new IllegalStateException();
                  }
               }

               return true;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bz.av(" + ')');
      }
   }

   public void run() {
      try {
         try {
            if (null != io.ap) {
               String var1 = io.ap.toLowerCase();
               if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                  String var2 = io.aw;
                  if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                     this.bt("wrongjava", 623255149);
                     return;
                  }

                  if (var2.startsWith("1.6.0_")) {
                     int var3;
                     for(var3 = 6; var3 < var2.length() && hj.an(var2.charAt(var3), -637608028); ++var3) {
                     }

                     String var4 = var2.substring(6, var3);
                     if (ly.aw(var4, -1192975141) && bj.aj(var4, -1481777132) < 10) {
                        this.bt("wrongjava", 623255149);
                        return;
                     }
                  }

                  am = 1616651601;
               }
            }

            this.setFocusCycleRoot(true);
            this.ad(-33383967);
            this.bz((byte)109);
            au = ch.at(1976033991);

            while(aj * 6778075864510125419L == 0L || ck.ap(-524753351) < aj * 6778075864510125419L) {
               jb.as = au.aw(ae * 730077689, am * 1396658805, (byte)-120) * -1571272871;

               for(int var7 = 0; var7 < -435318551 * jb.as; ++var7) {
                  this.ax(-945724812);
               }

               this.bx((byte)94);
               this.ai(this.bb, -782585259);
            }
         } catch (Exception var5) {
            rl.ap((String)null, var5, (byte)-23);
            this.bt("crash", 623255149);
         }

         this.bq(1592607784);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "bz.run(" + ')');
      }
   }

   void ax(int var1) {
      try {
         long var2 = ck.ap(-1670048957);
         long var4 = ar[-1985232299 * po.ab];
         ar[po.ab * -1985232299] = var2;
         po.ab = -1427952899 * (1 + po.ab * -1985232299 & 31);
         if (var4 != 0L) {
            if (var1 >= 1046024002) {
               throw new IllegalStateException();
            }

            if (var2 > var4 && var1 >= 1046024002) {
               throw new IllegalStateException();
            }
         }

         synchronized(this) {
            lj.bd = bo;
         }

         this.bc(-680789048);
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "bz.ax(" + ')');
      }
   }

   protected final void aq(byte var1) {
      try {
         this.bq = true;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.aq(" + ')');
      }
   }

   protected final void dm() {
      this.bq = true;
   }

   final synchronized void dd() {
      Container var1 = this.bs((byte)14);
      if (null != this.bb) {
         this.bb.removeFocusListener(this);
         var1.remove(this.bb);
      }

      ac.ax = Math.max(var1.getWidth(), this.al * 2023971881) * 245766511;
      ki.aq = Math.max(var1.getHeight(), 1594221307 * this.aa) * -1908196411;
      Insets var2;
      if (null != this.bk) {
         var2 = this.bk.getInsets();
         ac.ax -= (var2.left + var2.right) * 245766511;
         ki.aq -= (var2.top + var2.bottom) * -1908196411;
      }

      this.bb = new al(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.bb);
      this.bb.setSize(1816225167 * ac.ax, -121992435 * ki.aq);
      this.bb.setVisible(true);
      this.bb.setBackground(Color.BLACK);
      if (var1 == this.bk) {
         var2 = this.bk.getInsets();
         this.bb.setLocation(var2.left + this.ac * 559571575, this.av * 14626319 + var2.top);
      } else {
         this.bb.setLocation(559571575 * this.ac, this.av * 14626319);
      }

      this.bb.addFocusListener(this);
      this.bb.requestFocus();
      this.bq = true;
      if (null != ii.bu && ii.bu.aj * 488852221 == 1816225167 * ac.ax && -121992435 * ki.aq == ii.bu.ai * 168694077) {
         ((bq)ii.bu).ap(this.bb, -1285009387);
         ii.bu.aw(0, 0, 650206340);
      } else {
         ii.bu = new bq(1816225167 * ac.ax, -121992435 * ki.aq, this.bb, this.bj);
      }

      this.by = false;
      this.br = ck.ap(-1916921774) * -2514994559493730871L;
   }

   void dl() {
      long var1 = ck.ap(-1347445768);
      long var3 = ar[1627042892 * po.ab];
      ar[po.ab * -946723312] = var1;
      po.ab = -1427952899 * (1 + po.ab * -1985232299 & -2062584217);
      if (var3 != 0L && var1 > var3) {
      }

      synchronized(this) {
         lj.bd = bo;
      }

      this.bc(-680789048);
   }

   public final void start() {
      try {
         if (aw == this && !ai) {
            aj = 0L;
         }
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "bz.start(" + ')');
      }
   }

   protected void fp(String var1) {
      if (!this.ay) {
         this.ay = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   public final void destroy() {
      try {
         if (this == aw && !ai) {
            aj = ck.ap(-1578608782) * 6587260579507547971L;
            ct.ap(5000L);
            this.bq(1738672307);
         }
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "bz.destroy(" + ')');
      }
   }

   public final void update(Graphics var1) {
      try {
         this.paint(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.update(" + ')');
      }
   }

   protected void as(byte var1) {
      try {
         this.bs = this.getToolkit().getSystemClipboard();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.as(" + ')');
      }
   }

   protected static final void de() {
      au.ap(555753729);

      int var0;
      for(var0 = 0; var0 < 32; ++var0) {
         ao[var0] = 0L;
      }

      for(var0 = 0; var0 < 32; ++var0) {
         ar[var0] = 0L;
      }

      jb.as = 0;
   }

   public final void focusLost(FocusEvent var1) {
      try {
         bo = false;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.focusLost(" + ')');
      }
   }

   void bx(byte var1) {
      try {
         Container var2 = this.bs((byte)-89);
         long var3 = ck.ap(-1408189281);
         long var5 = ao[-965595385 * gl.af];
         ao[gl.af * -965595385] = var3;
         gl.af = (-965595385 * gl.af + 1 & 31) * -1975382345;
         if (0L != var5) {
            if (var1 <= 1) {
               return;
            }

            if (var3 > var5) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               int var7 = (int)(var3 - var5);
               at = ((var7 >> 1) + 32000) / var7 * -87835905;
            }
         }

         if ((bz += 1621609351) * 1644169783 - 1 > 50) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            bz -= -523911074;
            this.bq = true;
            this.bb.setSize(ac.ax * 1816225167, -121992435 * ki.aq);
            this.bb.setVisible(true);
            if (this.bk == var2) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               Insets var9 = this.bk.getInsets();
               this.bb.setLocation(var9.left + this.ac * 559571575, 14626319 * this.av + var9.top);
            } else {
               this.bb.setLocation(559571575 * this.ac, this.av * 14626319);
            }
         }

         if (this.by) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            this.az(-668985647);
         }

         this.bk((byte)-126);
         this.by(this.bq, 2088333438);
         if (this.bq) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            this.ab(-2058827014);
         }

         this.bq = false;
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "bz.bx(" + ')');
      }
   }

   public final void windowClosed(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.windowClosed(" + ')');
      }
   }

   public final void windowClosing(WindowEvent var1) {
      try {
         this.destroy();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.windowClosing(" + ')');
      }
   }

   public final void windowDeactivated(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.windowDeactivated(" + ')');
      }
   }

   public final void er(WindowEvent var1) {
      this.destroy();
   }

   public final void windowIconified(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.windowIconified(" + ')');
      }
   }

   public final void windowOpened(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.windowOpened(" + ')');
      }
   }

   protected abstract void ea();

   protected void cq() {
      this.bs = this.getToolkit().getSystemClipboard();
   }

   final void db() {
      qg var1 = this.bm(-1448188363);
      if (var1.ak * 136484119 != -28526951 * this.ag || -559180302 * this.ad != var1.aj * -615213727 || this.bc) {
         this.af(-1923383222);
         this.bc = false;
      }

   }

   protected abstract void by(boolean var1, int var2);

   protected abstract void br(int var1);

   protected final void bn(int var1, String var2, boolean var3, boolean var4, byte var5) {
      try {
         try {
            Graphics var6 = this.bb.getGraphics();
            if (en.bv == null) {
               if (var5 != 0) {
                  return;
               }

               en.bv = new Font("Helvetica", 1, 13);
               ek.bx = this.bb.getFontMetrics(en.bv);
            }

            if (var3 && !var4) {
               if (var5 != 0) {
                  throw new IllegalStateException();
               }

               var6.setColor(Color.black);
               var6.fillRect(0, 0, 1816225167 * ac.ax, ki.aq * -121992435);
            }

            Color var7 = new Color(140, 17, 17);

            try {
               if (bp == null) {
                  bp = this.bb.createImage(304, 34);
               }

               Graphics var8 = bp.getGraphics();
               var8.setColor(var7);
               var8.drawRect(0, 0, 303, 33);
               var8.fillRect(2, 2, var1 * 3, 30);
               var8.setColor(Color.black);
               var8.drawRect(1, 1, 301, 31);
               var8.fillRect(2 + 3 * var1, 2, 300 - var1 * 3, 30);
               var8.setFont(en.bv);
               var8.setColor(Color.white);
               var8.drawString(var2, (304 - ek.bx.stringWidth(var2)) / 2, 22);
               Image var10001 = bp;
               int var10002 = ac.ax * 1816225167 / 2 - 152;
               byte var10003;
               if (var4) {
                  if (var5 != 0) {
                     throw new IllegalStateException();
                  }

                  var10003 = 50;
               } else {
                  var10003 = -18;
               }

               var6.drawImage(var10001, var10002, var10003 + ki.aq * -121992435 / 2, (ImageObserver)null);
            } catch (Exception var11) {
               int var9 = ac.ax * 1816225167 / 2 - 152;
               int var10 = ki.aq * -121992435 / 2 - 18;
               var6.setColor(var7);
               var6.drawRect(var9, var10, 303, 33);
               var6.fillRect(var9 + 2, var10 + 2, var1 * 3, 30);
               var6.setColor(Color.black);
               var6.drawRect(1 + var9, var10 + 1, 301, 31);
               var6.fillRect(2 + var9 + var1 * 3, var10 + 2, 300 - 3 * var1, 30);
               var6.setFont(en.bv);
               var6.setColor(Color.white);
               var6.drawString(var2, var9 + (304 - ek.bx.stringWidth(var2)) / 2, var10 + 22);
            }
         } catch (Exception var12) {
            this.bb.repaint();
         }

      } catch (RuntimeException var13) {
         throw tm.aw(var13, "bz.bn(" + ')');
      }
   }

   protected final void bu(int var1) {
      try {
         bp = null;
         en.bv = null;
         ek.bx = null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.bu(" + ')');
      }
   }

   void cj() {
      int var1 = 559571575 * this.ac;
      int var2 = 14626319 * this.av;
      int var3 = -28526951 * this.ag - 1816225167 * ac.ax - var1;
      int var4 = this.ad * -2081679351 - ki.aq * -121992435 - var2;
      if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.bs((byte)-84);
            int var6 = 0;
            int var7 = 0;
            if (this.bk == var5) {
               Insets var8 = this.bk.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
               var10.fillRect(var6, var7, var1, this.ad * -2081679351);
            }

            if (var2 > 0) {
               var10.fillRect(var6, var7, -28526951 * this.ag, var2);
            }

            if (var3 > 0) {
               var10.fillRect(-28526951 * this.ag + var6 - var3, var7, var3, -2081679351 * this.ad);
            }

            if (var4 > 0) {
               var10.fillRect(var6, this.ad * -2081679351 + var7 - var4, this.ag * -28526951, var4);
            }
         } catch (Exception var9) {
         }
      }

   }

   Container bs(byte var1) {
      try {
         if (null != this.bk) {
            if (var1 >= 20) {
               throw new IllegalStateException();
            } else {
               return this.bk;
            }
         } else {
            return this;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.bs(" + ')');
      }
   }

   qg bm(int var1) {
      try {
         Container var2 = this.bs((byte)-34);
         int var3 = Math.max(var2.getWidth(), this.al * 2023971881);
         int var4 = Math.max(var2.getHeight(), this.aa * 1594221307);
         if (null != this.bk) {
            if (var1 >= -1383839188) {
               throw new IllegalStateException();
            }

            Insets var5 = this.bk.getInsets();
            var3 -= var5.right + var5.left;
            var4 -= var5.bottom + var5.top;
         }

         return new qg(var3, var4);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "bz.bm(" + ')');
      }
   }

   protected final boolean bo(int var1) {
      try {
         boolean var10000;
         if (this.bk != null) {
            if (var1 == -1894996331) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.bo(" + ')');
      }
   }

   protected abstract void ba(int var1);

   protected void fv(String var1) {
      if (!this.ay) {
         this.ay = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   public final void ap(Graphics var1) {
      this.paint(var1);
   }

   public final synchronized void aw(Graphics var1) {
      if (aw == this && !ai) {
         this.bq = true;
         if (ck.ap(-1468328846) - this.br * -1204627423140406151L > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (null == var2 || var2.width >= ac.ax * 1816225167 && var2.height >= ki.aq * -121992435) {
               this.by = true;
            }
         }

      }
   }

   static final int af(int var0, int var1, int var2, short var3) {
      try {
         int var4 = var0 / var2;
         int var5 = var0 & var2 - 1;
         int var6 = var1 / var2;
         int var7 = var1 & var2 - 1;
         int var8 = su.ab(var4, var6, (short)22234);
         int var9 = su.ab(var4 + 1, var6, (short)18265);
         int var10 = su.ab(var4, var6 + 1, (short)3940);
         int var11 = su.ab(var4 + 1, var6 + 1, (short)19554);
         int var12 = ic.ar(var8, var9, var5, var2, 951099002);
         int var13 = ic.ar(var10, var11, var5, var2, 767235744);
         return ic.ar(var12, var13, var7, var2, -914318305);
      } catch (RuntimeException var14) {
         throw tm.aw(var14, "bz.af(" + ')');
      }
   }

   public final void al(FocusEvent var1) {
      bo = true;
      this.bq = true;
   }

   public final void aa(FocusEvent var1) {
      bo = true;
      this.bq = true;
   }

   protected final void bw(int var1, int var2) {
      if (var1 != this.ah * 693217755 || 35839199 * this.bh != var2) {
         this.bb(502966279);
      }

      this.ah = var1 * -1569183149;
      this.bh = 197123871 * var2;
   }

   protected final void bi(int var1, int var2) {
      if (var1 != this.ah * 693217755 || -2127930197 * this.bh != var2) {
         this.bb(733780813);
      }

      this.ah = var1 * -1569183149;
      this.bh = 1925051584 * var2;
   }

   protected Clipboard co() {
      return this.bs;
   }

   protected final void bg(int var1, int var2) {
      if (var1 != this.ah * 693217755 || 35839199 * this.bh != var2) {
         this.bb(-936644172);
      }

      this.ah = var1 * -1569183149;
      this.bh = 197123871 * var2;
   }

   protected iv bl() {
      if (null == this.bt) {
         this.bt = new ax();
         this.bt.ap(this.bb, -1422504772);
      }

      return this.bt;
   }

   protected iv be() {
      if (null == this.bt) {
         this.bt = new ax();
         this.bt.ap(this.bb, 1528619791);
      }

      return this.bt;
   }

   public final void dn() {
      if (aw == this && !ai) {
         aj = 0L;
      }
   }

   protected void cb() {
      this.bs = this.getToolkit().getSystemClipboard();
   }

   protected void cd(String var1) {
      this.bs.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   protected Clipboard ci() {
      return this.bs;
   }

   protected Clipboard cn() {
      return this.bs;
   }

   final void bk(byte var1) {
      try {
         qg var2 = this.bm(-1791793778);
         if (var2.ak * 1187820279 == -28526951 * this.ag) {
            if (var1 >= 0) {
               return;
            }

            if (-2081679351 * this.ad == var2.aj * -615213727 && !this.bc) {
               return;
            }
         }

         this.af(-1988623681);
         this.bc = false;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bz.bk(" + ')');
      }
   }

   protected final void cf() {
      if (io.ap.toLowerCase().indexOf("microsoft") != -1) {
         bv.du[-1240693063] = 230860448;
         bv.du[187] = 27;
         bv.du[188] = 1776483391;
         bv.du[-1279232518] = 26;
         bv.du[190] = 72;
         bv.du[191] = -1264800397;
         bv.du[192] = 58;
         bv.du[346000261] = 42;
         bv.du[-1783340512] = -2138187156;
         bv.du[-806657490] = 43;
         bv.du[-83820139] = 59;
         bv.du[223] = 28;
      } else {
         bv.du[44] = -2023909632;
         bv.du[-232328569] = 26;
         bv.du[46] = -1363623935;
         bv.du[47] = 220394177;
         bv.du[59] = 57;
         bv.du[61] = 27;
         bv.du[-1143323986] = 42;
         bv.du[1398692363] = -1848269510;
         bv.du[-195201703] = 43;
         bv.du[192] = 28;
         bv.du[222] = 58;
         bv.du[1356779235] = -1116945410;
      }

      ba.ak(this.bb, -2042374899);
   }

   protected final void cl() {
      ba.ai(-1636950526);
   }

   protected final void cp() {
      ba.ai(1073052550);
   }

   protected void cv(bx var1, int var2) {
      ba.ap(var1, var2, (short)-10798);
   }

   protected bz() {
      try {
         super();
         this.ay = false;
         this.ac = 0;
         this.av = 0;
         this.bj = false;
         this.bq = true;
         this.bc = false;
         this.by = false;
         this.br = 0L;
         EventQueue var1 = null;

         try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
         } catch (Throwable var3) {
         }

         this.bm = var1;
         aq var2 = new aq();
         bm.ao = var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bz.<init>(" + ')');
      }
   }

   protected final void cu() {
      Canvas var1 = this.bb;
      var1.addMouseListener(bc.aj);
      var1.addMouseMotionListener(bc.aj);
      var1.addFocusListener(bc.aj);
   }

   protected iv ay(int var1) {
      try {
         if (null == this.bt) {
            if (var1 == -2046431787) {
               throw new IllegalStateException();
            }

            this.bt = new ax();
            this.bt.ap(this.bb, -51301881);
         }

         return this.bt;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.ay(" + ')');
      }
   }

   protected final void cg() {
      Canvas var1 = this.bb;
      var1.addMouseListener(bc.aj);
      var1.addMouseMotionListener(bc.aj);
      var1.addFocusListener(bc.aj);
   }

   protected final void bf(int var1, int var2) {
      if (var1 != this.ah * 693217755 || 462790820 * this.bh != var2) {
         this.bb(-615291384);
      }

      this.ah = var1 * -1569183149;
      this.bh = -1322813462 * var2;
   }

   final void cz() {
      Container var1 = this.bs((byte)-24);
      if (null != var1) {
         qg var2 = this.bm(-1611960152);
         this.ag = Math.max(1187820279 * var2.ak, 2023971881 * this.al) * 859913641;
         this.ad = Math.max(-615213727 * var2.aj, this.aa * 1594221307) * -1339623879;
         if (this.ag * -28526951 <= 0) {
            this.ag = 859913641;
         }

         if (-2081679351 * this.ad <= 0) {
            this.ad = -1339623879;
         }

         ac.ax = Math.min(this.ag * -28526951, 693217755 * this.ah) * 245766511;
         ki.aq = Math.min(this.ad * -2081679351, 35839199 * this.bh) * -1908196411;
         this.ac = -1491462329 * ((-28526951 * this.ag - ac.ax * 1816225167) / 2);
         this.av = 0;
         this.bb.setSize(1816225167 * ac.ax, -121992435 * ki.aq);
         ii.bu = new bq(ac.ax * 1816225167, -121992435 * ki.aq, this.bb, this.bj);
         if (var1 == this.bk) {
            Insets var3 = this.bk.getInsets();
            this.bb.setLocation(this.ac * 559571575 + var3.left, this.av * 14626319 + var3.top);
         } else {
            this.bb.setLocation(559571575 * this.ac, this.av * 14626319);
         }

         this.bq = true;
         this.ar(925912487);
      }
   }

   final void ch() {
      Container var1 = this.bs((byte)-11);
      if (null != var1) {
         qg var2 = this.bm(-1992222559);
         this.ag = Math.max(1187820279 * var2.ak, 2023971881 * this.al) * 859913641;
         this.ad = Math.max(-615213727 * var2.aj, this.aa * 1594221307) * -1339623879;
         if (this.ag * -28526951 <= 0) {
            this.ag = 859913641;
         }

         if (-2081679351 * this.ad <= 0) {
            this.ad = -1339623879;
         }

         ac.ax = Math.min(this.ag * -28526951, 693217755 * this.ah) * 245766511;
         ki.aq = Math.min(this.ad * -2081679351, 35839199 * this.bh) * -1908196411;
         this.ac = -1491462329 * ((-28526951 * this.ag - ac.ax * 1816225167) / 2);
         this.av = 0;
         this.bb.setSize(1816225167 * ac.ax, -121992435 * ki.aq);
         ii.bu = new bq(ac.ax * 1816225167, -121992435 * ki.aq, this.bb, this.bj);
         if (var1 == this.bk) {
            Insets var3 = this.bk.getInsets();
            this.bb.setLocation(this.ac * 559571575 + var3.left, this.av * 14626319 + var3.top);
         } else {
            this.bb.setLocation(559571575 * this.ac, this.av * 14626319);
         }

         this.bq = true;
         this.ar(1607365273);
      }
   }

   protected abstract void ct();

   void cc() {
      int var1 = 559571575 * this.ac;
      int var2 = 14626319 * this.av;
      int var3 = -28526951 * this.ag - 1816225167 * ac.ax - var1;
      int var4 = this.ad * -2081679351 - ki.aq * -121992435 - var2;
      if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.bs((byte)-84);
            int var6 = 0;
            int var7 = 0;
            if (this.bk == var5) {
               Insets var8 = this.bk.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
               var10.fillRect(var6, var7, var1, this.ad * -2081679351);
            }

            if (var2 > 0) {
               var10.fillRect(var6, var7, -28526951 * this.ag, var2);
            }

            if (var3 > 0) {
               var10.fillRect(-28526951 * this.ag + var6 - var3, var7, var3, -2081679351 * this.ad);
            }

            if (var4 > 0) {
               var10.fillRect(var6, this.ad * -2081679351 + var7 - var4, this.ag * -28526951, var4);
            }
         } catch (Exception var9) {
         }
      }

   }

   protected void dg(boolean var1) {
      if (var1 != this.bj) {
         this.bj = var1;
         ii.bu.ag(var1, 1012312027);
         ii.bu.az((byte)-76);
      }

   }

   final void cm() {
      ba.aj(this.bb, -1990239516);
      nz.ap(this.bb, (byte)88);
      if (null != this.bt) {
         this.bt.aw(this.bb, 1503061673);
      }

      this.ad(1615395537);
      ba.ak(this.bb, 2062121381);
      Canvas var1 = this.bb;
      var1.addMouseListener(bc.aj);
      var1.addMouseMotionListener(bc.aj);
      var1.addFocusListener(bc.aj);
      if (null != this.bt) {
         this.bt.ap(this.bb, -29436496);
      }

      this.bb(2011738295);
   }

   final void cw() {
      ba.aj(this.bb, -2013887952);
      nz.ap(this.bb, (byte)50);
      if (null != this.bt) {
         this.bt.aw(this.bb, 769646316);
      }

      this.ad(1239988695);
      ba.ak(this.bb, 1283633592);
      Canvas var1 = this.bb;
      var1.addMouseListener(bc.aj);
      var1.addMouseMotionListener(bc.aj);
      var1.addFocusListener(bc.aj);
      if (null != this.bt) {
         this.bt.ap(this.bb, 1817973497);
      }

      this.bb(-56611323);
   }

   final void ca() {
      ba.aj(this.bb, -2136484093);
      nz.ap(this.bb, (byte)39);
      if (null != this.bt) {
         this.bt.aw(this.bb, 1677719069);
      }

      this.ad(735749464);
      ba.ak(this.bb, 759389716);
      Canvas var1 = this.bb;
      var1.addMouseListener(bc.aj);
      var1.addMouseMotionListener(bc.aj);
      var1.addFocusListener(bc.aj);
      if (null != this.bt) {
         this.bt.ap(this.bb, -555182125);
      }

      this.bb(-2053976899);
   }

   final void cs() {
      ba.aj(this.bb, -2012798773);
      nz.ap(this.bb, (byte)25);
      if (null != this.bt) {
         this.bt.aw(this.bb, 589721736);
      }

      this.ad(1433171364);
      ba.ak(this.bb, 1246338863);
      Canvas var1 = this.bb;
      var1.addMouseListener(bc.aj);
      var1.addMouseMotionListener(bc.aj);
      var1.addFocusListener(bc.aj);
      if (null != this.bt) {
         this.bt.ap(this.bb, 1812593374);
      }

      this.bb(-1407052745);
   }

   protected final void cr(int var1, int var2, int var3, int var4) {
      try {
         if (null != aw) {
            ak += -1641507392;
            if (516322520 * ak >= 3) {
               this.bt("alreadyloaded", 623255149);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         aw = this;
         ac.ax = 245766511 * var1;
         ki.aq = 1669391864 * var2;
         ts.ak = var3 * -1528705681;
         wa.aj = -674926178 * var4;
         wa.ap = this;
         if (null == ap) {
            ap = new io();
         }

         ap.aj(this, 1, -725588083);
      } catch (Exception var6) {
         rl.ap((String)null, var6, (byte)-118);
         this.bt("crash", 623255149);
      }

   }

   final synchronized void ck() {
      Container var1 = this.bs((byte)-79);
      if (null != this.bb) {
         this.bb.removeFocusListener(this);
         var1.remove(this.bb);
      }

      ac.ax = Math.max(var1.getWidth(), this.al * 2023971881) * 245766511;
      ki.aq = Math.max(var1.getHeight(), -569116782 * this.aa) * -1669888166;
      Insets var2;
      if (null != this.bk) {
         var2 = this.bk.getInsets();
         ac.ax -= (var2.left + var2.right) * -961480719;
         ki.aq -= (var2.top + var2.bottom) * -528535178;
      }

      this.bb = new al(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.bb);
      this.bb.setSize(1816225167 * ac.ax, -121992435 * ki.aq);
      this.bb.setVisible(true);
      this.bb.setBackground(Color.BLACK);
      if (var1 == this.bk) {
         var2 = this.bk.getInsets();
         this.bb.setLocation(var2.left + this.ac * 559571575, this.av * 2002114938 + var2.top);
      } else {
         this.bb.setLocation(1248814220 * this.ac, this.av * -1541659715);
      }

      this.bb.addFocusListener(this);
      this.bb.requestFocus();
      this.bq = true;
      if (null != ii.bu && ii.bu.aj * 236319736 == 1867927381 * ac.ax && 336601124 * ki.aq == ii.bu.ai * 1606057754) {
         ((bq)ii.bu).ap(this.bb, -1552167336);
         ii.bu.aw(0, 0, 922052756);
      } else {
         ii.bu = new bq(-428762578 * ac.ax, -121992435 * ki.aq, this.bb, this.bj);
      }

      this.by = false;
      this.br = ck.ap(-861369871) * -2514994559493730871L;
   }

   final synchronized void dq() {
      Container var1 = this.bs((byte)-39);
      if (null != this.bb) {
         this.bb.removeFocusListener(this);
         var1.remove(this.bb);
      }

      ac.ax = Math.max(var1.getWidth(), this.al * 2023971881) * 245766511;
      ki.aq = Math.max(var1.getHeight(), 1594221307 * this.aa) * -1908196411;
      Insets var2;
      if (null != this.bk) {
         var2 = this.bk.getInsets();
         ac.ax -= (var2.left + var2.right) * 245766511;
         ki.aq -= (var2.top + var2.bottom) * -1908196411;
      }

      this.bb = new al(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.bb);
      this.bb.setSize(1816225167 * ac.ax, -121992435 * ki.aq);
      this.bb.setVisible(true);
      this.bb.setBackground(Color.BLACK);
      if (var1 == this.bk) {
         var2 = this.bk.getInsets();
         this.bb.setLocation(var2.left + this.ac * 559571575, this.av * 14626319 + var2.top);
      } else {
         this.bb.setLocation(559571575 * this.ac, this.av * 14626319);
      }

      this.bb.addFocusListener(this);
      this.bb.requestFocus();
      this.bq = true;
      if (null != ii.bu && ii.bu.aj * 488852221 == 1816225167 * ac.ax && -121992435 * ki.aq == ii.bu.ai * 168694077) {
         ((bq)ii.bu).ap(this.bb, -1666115284);
         ii.bu.aw(0, 0, 596601776);
      } else {
         ii.bu = new bq(1816225167 * ac.ax, -121992435 * ki.aq, this.bb, this.bj);
      }

      this.by = false;
      this.br = ck.ap(-920535371) * -2514994559493730871L;
   }

   protected void dr(boolean var1) {
      if (var1 != this.bj) {
         this.bj = var1;
         ii.bu.ag(var1, 1499440581);
         ii.bu.az((byte)-18);
      }

   }

   final synchronized void dc() {
      Container var1 = this.bs((byte)18);
      if (null != this.bb) {
         this.bb.removeFocusListener(this);
         var1.remove(this.bb);
      }

      ac.ax = Math.max(var1.getWidth(), this.al * 716659471) * 245766511;
      ki.aq = Math.max(var1.getHeight(), 1594221307 * this.aa) * -1908196411;
      Insets var2;
      if (null != this.bk) {
         var2 = this.bk.getInsets();
         ac.ax -= (var2.left + var2.right) * -760225327;
         ki.aq -= (var2.top + var2.bottom) * -1908196411;
      }

      this.bb = new al(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.bb);
      this.bb.setSize(-927883424 * ac.ax, 119790774 * ki.aq);
      this.bb.setVisible(true);
      this.bb.setBackground(Color.BLACK);
      if (var1 == this.bk) {
         var2 = this.bk.getInsets();
         this.bb.setLocation(var2.left + this.ac * -1009150599, this.av * 14626319 + var2.top);
      } else {
         this.bb.setLocation(559571575 * this.ac, this.av * 14626319);
      }

      this.bb.addFocusListener(this);
      this.bb.requestFocus();
      this.bq = true;
      if (null != ii.bu && ii.bu.aj * 1142222236 == 2096525170 * ac.ax && -121992435 * ki.aq == ii.bu.ai * -2020192176) {
         ((bq)ii.bu).ap(this.bb, -1250257715);
         ii.bu.aw(0, 0, 437574025);
      } else {
         ii.bu = new bq(1816225167 * ac.ax, -121992435 * ki.aq, this.bb, this.bj);
      }

      this.by = false;
      this.br = ck.ap(-1234092542) * -2514994559493730871L;
   }

   protected void da(boolean var1) {
      if (var1 != this.bj) {
         this.bj = var1;
         ii.bu.ag(var1, 1030201859);
         ii.bu.az((byte)-111);
      }

   }

   protected abstract void bz(byte var1);

   protected void dh(boolean var1) {
      if (var1 != this.bj) {
         this.bj = var1;
         ii.bu.ag(var1, 2131949905);
         ii.bu.az((byte)-30);
      }

   }

   protected void an(bx var1, int var2, int var3) {
      try {
         ba.ap(var1, var2, (short)-7014);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bz.an(" + ')');
      }
   }

   protected final boolean df() {
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
                  this.bt("invalidhost", 623255149);
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

   protected final boolean du() {
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
                  this.bt("invalidhost", 623255149);
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

   public final void em(WindowEvent var1) {
   }

   public void dk() {
      try {
         if (null != io.ap) {
            String var1 = io.ap.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = io.aw;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.bt("wrongjava", 623255149);
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && hj.an(var2.charAt(var3), -996194741); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (ly.aw(var4, 781121769) && bj.aj(var4, -1481777132) < 10) {
                     this.bt("wrongjava", 623255149);
                     return;
                  }
               }

               am = 1616651601;
            }
         }

         this.setFocusCycleRoot(true);
         this.ad(-71507338);
         this.bz((byte)110);
         au = ch.at(1976033991);

         while(aj * 6778075864510125419L == 0L || ck.ap(-1817074194) < aj * 6778075864510125419L) {
            jb.as = au.aw(ae * 730077689, am * 1396658805, (byte)-7) * -1571272871;

            for(int var6 = 0; var6 < -435318551 * jb.as; ++var6) {
               this.ax(691418179);
            }

            this.bx((byte)35);
            this.ai(this.bb, -839743428);
         }
      } catch (Exception var5) {
         rl.ap((String)null, var5, (byte)-23);
         this.bt("crash", 623255149);
      }

      this.bq(247563088);
   }

   final synchronized void bq(int var1) {
      try {
         if (!ai) {
            ai = true;

            try {
               this.bb.removeFocusListener(this);
            } catch (Exception var6) {
            }

            try {
               this.br(-1821954389);
            } catch (Exception var5) {
            }

            if (null != this.bk) {
               try {
                  System.exit(0);
               } catch (Throwable var4) {
               }
            }

            if (null != ap) {
               try {
                  ap.ap((byte)56);
               } catch (Exception var3) {
               }
            }

            this.ba(888034615);
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "bz.bq(" + ')');
      }
   }

   void dt() {
      Container var1 = this.bs((byte)-47);
      long var2 = ck.ap(-541723568);
      long var4 = ao[-834013823 * gl.af];
      ao[gl.af * -2117573399] = var2;
      gl.af = (1347415845 * gl.af + 1 & 31) * -58795171;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         at = ((var6 >> 1) + 32000) / var6 * 1176834170;
      }

      if ((bz += 1199167156) * 1644169783 - 1 > 50) {
         bz -= -523911074;
         this.bq = true;
         this.bb.setSize(ac.ax * -1993090009, -121992435 * ki.aq);
         this.bb.setVisible(true);
         if (this.bk == var1) {
            Insets var7 = this.bk.getInsets();
            this.bb.setLocation(var7.left + this.ac * 1453657647, 470201162 * this.av + var7.top);
         } else {
            this.bb.setLocation(559571575 * this.ac, this.av * -1735985396);
         }
      }

      if (this.by) {
         this.az(320855654);
      }

      this.bk((byte)-117);
      this.by(this.bq, 1954718426);
      if (this.bq) {
         this.ab(147204615);
      }

      this.bq = false;
   }

   final void bb(int var1) {
      try {
         this.bc = true;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.bb(" + ')');
      }
   }

   void ds() {
      Container var1 = this.bs((byte)-128);
      long var2 = ck.ap(-655666291);
      long var4 = ao[-965595385 * gl.af];
      ao[gl.af * -965595385] = var2;
      gl.af = (-965595385 * gl.af + 1 & 31) * -1975382345;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         at = ((var6 >> 1) + 32000) / var6 * -87835905;
      }

      if ((bz += 1621609351) * 1644169783 - 1 > 50) {
         bz -= -523911074;
         this.bq = true;
         this.bb.setSize(ac.ax * 1816225167, -121992435 * ki.aq);
         this.bb.setVisible(true);
         if (this.bk == var1) {
            Insets var7 = this.bk.getInsets();
            this.bb.setLocation(var7.left + this.ac * 559571575, 14626319 * this.av + var7.top);
         } else {
            this.bb.setLocation(559571575 * this.ac, this.av * 14626319);
         }
      }

      if (this.by) {
         this.az(-366235938);
      }

      this.bk((byte)-77);
      this.by(this.bq, 1974855277);
      if (this.bq) {
         this.ab(-660033657);
      }

      this.bq = false;
   }

   final synchronized void do() {
      if (!ai) {
         ai = true;

         try {
            this.bb.removeFocusListener(this);
         } catch (Exception var5) {
         }

         try {
            this.br(2081279446);
         } catch (Exception var4) {
         }

         if (null != this.bk) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
            }
         }

         if (null != ap) {
            try {
               ap.ap((byte)95);
            } catch (Exception var2) {
            }
         }

         this.ba(-1087360279);
      }
   }

   final void dv() {
      qg var1 = this.bm(-1945627961);
      if (var1.ak * 1187820279 != -28526951 * this.ag || -2081679351 * this.ad != var1.aj * 1922760573 || this.bc) {
         this.af(-1620317760);
         this.bc = false;
      }

   }

   final void dj() {
      this.bc = true;
   }

   final void dp() {
      this.bc = true;
   }

   public final void eh() {
      if (this == aw && !ai) {
         aj = (ck.ap(-1579533619) + 4000L) * 6587260579507547971L;
      }
   }

   public final void windowActivated(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.windowActivated(" + ')');
      }
   }

   protected static final void dw() {
      au.ap(555753729);

      int var0;
      for(var0 = 0; var0 < 32; ++var0) {
         ao[var0] = 0L;
      }

      for(var0 = 0; var0 < 32; ++var0) {
         ar[var0] = 0L;
      }

      jb.as = 0;
   }

   public final void ep(WindowEvent var1) {
   }

   Container fm() {
      return (Container)(null != this.bk ? this.bk : this);
   }

   public final void di() {
      if (aw == this && !ai) {
         aj = 0L;
      }
   }

   final void af(int var1) {
      try {
         Container var2 = this.bs((byte)-58);
         if (null != var2) {
            qg var3 = this.bm(-1676716466);
            this.ag = Math.max(1187820279 * var3.ak, 2023971881 * this.al) * 859913641;
            this.ad = Math.max(-615213727 * var3.aj, this.aa * 1594221307) * -1339623879;
            if (this.ag * -28526951 <= 0) {
               if (var1 >= -1586447854) {
                  throw new IllegalStateException();
               }

               this.ag = 859913641;
            }

            if (-2081679351 * this.ad <= 0) {
               if (var1 >= -1586447854) {
                  throw new IllegalStateException();
               }

               this.ad = -1339623879;
            }

            ac.ax = Math.min(this.ag * -28526951, 693217755 * this.ah) * 245766511;
            ki.aq = Math.min(this.ad * -2081679351, 35839199 * this.bh) * -1908196411;
            this.ac = -1491462329 * ((-28526951 * this.ag - ac.ax * 1816225167) / 2);
            this.av = 0;
            this.bb.setSize(1816225167 * ac.ax, -121992435 * ki.aq);
            ii.bu = new bq(ac.ax * 1816225167, -121992435 * ki.aq, this.bb, this.bj);
            if (var2 == this.bk) {
               if (var1 >= -1586447854) {
                  throw new IllegalStateException();
               }

               Insets var4 = this.bk.getInsets();
               this.bb.setLocation(this.ac * 559571575 + var4.left, this.av * 14626319 + var4.top);
            } else {
               this.bb.setLocation(559571575 * this.ac, this.av * 14626319);
            }

            this.bq = true;
            this.ar(-586512412);
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "bz.af(" + ')');
      }
   }

   public final void stop() {
      try {
         if (this == aw && !ai) {
            aj = (ck.ap(-797667244) + 4000L) * 6587260579507547971L;
         }
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "bz.stop(" + ')');
      }
   }

   protected final void ao(int var1) {
      try {
         Canvas var2 = this.bb;
         var2.addMouseListener(bc.aj);
         var2.addMouseMotionListener(bc.aj);
         var2.addFocusListener(bc.aj);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bz.ao(" + ')');
      }
   }

   protected final void cy() {
      Canvas var1 = this.bb;
      var1.addMouseListener(bc.aj);
      var1.addMouseMotionListener(bc.aj);
      var1.addFocusListener(bc.aj);
   }

   public final void ez() {
      if (this == aw && !ai) {
         aj = (ck.ap(-1316105287) + 4000L) * 6587260579507547971L;
      }
   }

   public final void ey() {
      if (this == aw && !ai) {
         aj = ck.ap(-1762522196) * 6587260579507547971L;
         ct.ap(5000L);
         this.bq(199080633);
      }
   }

   public final void ec() {
      if (this == aw && !ai) {
         aj = ck.ap(-584687545) * 6587260579507547971L;
         ct.ap(5000L);
         this.bq(1812271144);
      }
   }

   public final void ah(FocusEvent var1) {
      bo = false;
   }

   public final void bh(FocusEvent var1) {
      bo = false;
   }

   public final void bj(FocusEvent var1) {
      bo = false;
   }

   public final void bv(FocusEvent var1) {
      bo = false;
   }

   public final void ek(WindowEvent var1) {
   }

   final synchronized void dy() {
      if (!ai) {
         ai = true;

         try {
            this.bb.removeFocusListener(this);
         } catch (Exception var5) {
         }

         try {
            this.br(-2114152992);
         } catch (Exception var4) {
         }

         if (null != this.bk) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
            }
         }

         if (null != ap) {
            try {
               ap.ap((byte)104);
            } catch (Exception var2) {
            }
         }

         this.ba(1834691602);
      }
   }

   public final void en(WindowEvent var1) {
   }

   protected void bt(String var1, int var2) {
      try {
         if (!this.ay) {
            this.ay = true;
            System.out.println("error_game_" + var1);

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
            } catch (Exception var4) {
            }

         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "bz.bt(" + ')');
      }
   }

   protected final void ce() {
      Canvas var1 = this.bb;
      var1.addMouseListener(bc.aj);
      var1.addMouseMotionListener(bc.aj);
      var1.addFocusListener(bc.aj);
   }

   public final void el(WindowEvent var1) {
   }

   public final void ed(WindowEvent var1) {
   }

   protected abstract void bc(int var1);

   public final void ex(WindowEvent var1) {
   }

   public final void ej(WindowEvent var1) {
   }

   protected static final void dz() {
      au.ap(555753729);

      int var0;
      for(var0 = 0; var0 < -2113009852; ++var0) {
         ao[var0] = 0L;
      }

      for(var0 = 0; var0 < -1129522606; ++var0) {
         ar[var0] = 0L;
      }

      jb.as = 0;
   }

   public final void ew(WindowEvent var1) {
   }

   public final void eu(WindowEvent var1) {
   }

   final void cx() {
      Container var1 = this.bs((byte)-120);
      if (null != var1) {
         qg var2 = this.bm(-1496809368);
         this.ag = Math.max(1187820279 * var2.ak, 2023971881 * this.al) * 859913641;
         this.ad = Math.max(-615213727 * var2.aj, this.aa * 1594221307) * -1339623879;
         if (this.ag * -28526951 <= 0) {
            this.ag = 859913641;
         }

         if (-2081679351 * this.ad <= 0) {
            this.ad = -1339623879;
         }

         ac.ax = Math.min(this.ag * -28526951, 693217755 * this.ah) * 245766511;
         ki.aq = Math.min(this.ad * -2081679351, 35839199 * this.bh) * -1908196411;
         this.ac = -1491462329 * ((-28526951 * this.ag - ac.ax * 1816225167) / 2);
         this.av = 0;
         this.bb.setSize(1816225167 * ac.ax, -121992435 * ki.aq);
         ii.bu = new bq(ac.ax * 1816225167, -121992435 * ki.aq, this.bb, this.bj);
         if (var1 == this.bk) {
            Insets var3 = this.bk.getInsets();
            this.bb.setLocation(this.ac * 559571575 + var3.left, this.av * 14626319 + var3.top);
         } else {
            this.bb.setLocation(559571575 * this.ac, this.av * 14626319);
         }

         this.bq = true;
         this.ar(151041652);
      }
   }

   public abstract void eb();

   public abstract void es();

   protected abstract void eo();

   protected void ac(boolean var1, int var2) {
      try {
         if (var1 != this.bj) {
            this.bj = var1;
            ii.bu.ag(var1, 481145533);
            ii.bu.az((byte)-93);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bz.ac(" + ')');
      }
   }

   public final synchronized void ak(Graphics var1) {
      if (aw == this && !ai) {
         this.bq = true;
         if (ck.ap(-1603756826) - this.br * -1204627423140406151L > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (null == var2 || var2.width >= ac.ax * 1816225167 && var2.height >= ki.aq * -121992435) {
               this.by = true;
            }
         }

      }
   }

   protected abstract void et(boolean var1);

   protected abstract void fu(boolean var1);

   protected abstract void fo(boolean var1);

   protected abstract void fa(boolean var1);

   protected final void fj(int var1, String var2, boolean var3, boolean var4) {
      try {
         Graphics var5 = this.bb.getGraphics();
         if (en.bv == null) {
            en.bv = new Font("Helvetica", 1, 13);
            ek.bx = this.bb.getFontMetrics(en.bv);
         }

         if (var3 && !var4) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, 1816225167 * ac.ax, ki.aq * -121992435);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (bp == null) {
               bp = this.bb.createImage(304, 34);
            }

            Graphics var7 = bp.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(2 + 3 * var1, 2, 300 - var1 * 3, 30);
            var7.setFont(en.bv);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - ek.bx.stringWidth(var2)) / 2, 22);
            var5.drawImage(bp, ac.ax * 1816225167 / 2 - 152, (var4 ? 50 : -18) + ki.aq * -121992435 / 2, (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = ac.ax * 1816225167 / 2 - 152;
            int var9 = ki.aq * -121992435 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(1 + var8, var9 + 1, 301, 31);
            var5.fillRect(2 + var8 + var1 * 3, var9 + 2, 300 - 3 * var1, 30);
            var5.setFont(en.bv);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - ek.bx.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.bb.repaint();
      }

   }

   protected final void fw() {
      bp = null;
      en.bv = null;
      ek.bx = null;
   }

   public final void eg() {
      if (this == aw && !ai) {
         aj = (ck.ap(-2113665458) + 4000L) * 6587260579507547971L;
      }
   }

   protected void fh(String var1) {
      if (!this.ay) {
         this.ay = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   protected abstract void ee();

   protected void fl(String var1) {
      if (!this.ay) {
         this.ay = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   protected void fn(String var1) {
      if (!this.ay) {
         this.ay = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   Container fd() {
      return (Container)(null != this.bk ? this.bk : this);
   }

   public final void focusGained(FocusEvent var1) {
      try {
         bo = true;
         this.bq = true;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.focusGained(" + ')');
      }
   }

   Container fg() {
      return (Container)(null != this.bk ? this.bk : this);
   }

   qg fc() {
      Container var1 = this.bs((byte)-117);
      int var2 = Math.max(var1.getWidth(), this.al * -1521063359);
      int var3 = Math.max(var1.getHeight(), this.aa * 530401443);
      if (null != this.bk) {
         Insets var4 = this.bk.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.bottom + var4.top;
      }

      return new qg(var2, var3);
   }

   public final void windowDeiconified(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.windowDeiconified(" + ')');
      }
   }

   public abstract void init();

   protected final boolean fe() {
      return this.bk != null;
   }

   protected static int ft() {
      int var0 = 0;
      if (null == et.bw || !et.bw.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  et.bw = var2;
                  bf = 105761223344251675L;
                  bi = -6462716048878562559L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (null != et.bw) {
         long var10 = ck.ap(-897553427);
         long var3 = et.bw.getCollectionTime();
         if (-1L != 570468221949809407L * bi) {
            long var5 = var3 - 570468221949809407L * bi;
            long var7 = var10 - bf * 596686757248778477L;
            if (var7 != 0L) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         bi = 6462716048878562559L * var3;
         bf = -105761223344251675L * var10;
      }

      return var0;
   }

   protected static int ff() {
      int var0 = 0;
      if (null == et.bw || !et.bw.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  et.bw = var2;
                  bf = 105761223344251675L;
                  bi = -6462716048878562559L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (null != et.bw) {
         long var10 = ck.ap(-1884883399);
         long var3 = et.bw.getCollectionTime();
         if (-1L != 570468221949809407L * bi) {
            long var5 = var3 - 570468221949809407L * bi;
            long var7 = var10 - bf * 596686757248778477L;
            if (var7 != 0L) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         bi = 6462716048878562559L * var3;
         bf = -105761223344251675L * var10;
      }

      return var0;
   }

   protected abstract void fx();

   protected abstract void fq();

   protected abstract void fk();

   static void cn(int var0, nn var1, boolean var2, int var3) {
      try {
         kp var4 = gd.fz((byte)-108).bk(var0, -908739311);
         int var5 = nw.mc.al * 901808959;
         int var6 = (-1517174943 * nw.mc.bk >> 7) + -2014668603 * hx.jf.as;
         int var7 = (nw.mc.bb * 669935203 >> 7) + 1601580509 * hx.jf.ae;
         nn var8 = new nn(var5, var6, var7);
         gd.fz((byte)-44).ag(var4, var8, var1, var2, (byte)-11);
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "bz.cn(" + ')');
      }
   }

   final synchronized void ad(int var1) {
      try {
         Container var2 = this.bs((byte)-101);
         if (null != this.bb) {
            if (var1 <= -2028929779) {
               throw new IllegalStateException();
            }

            this.bb.removeFocusListener(this);
            var2.remove(this.bb);
         }

         ac.ax = Math.max(var2.getWidth(), this.al * 2023971881) * 245766511;
         ki.aq = Math.max(var2.getHeight(), 1594221307 * this.aa) * -1908196411;
         Insets var3;
         if (null != this.bk) {
            if (var1 <= -2028929779) {
               return;
            }

            var3 = this.bk.getInsets();
            ac.ax -= (var3.left + var3.right) * 245766511;
            ki.aq -= (var3.top + var3.bottom) * -1908196411;
         }

         this.bb = new al(this);
         var2.setBackground(Color.BLACK);
         var2.setLayout((LayoutManager)null);
         var2.add(this.bb);
         this.bb.setSize(1816225167 * ac.ax, -121992435 * ki.aq);
         this.bb.setVisible(true);
         this.bb.setBackground(Color.BLACK);
         if (var2 == this.bk) {
            if (var1 <= -2028929779) {
               return;
            }

            var3 = this.bk.getInsets();
            this.bb.setLocation(var3.left + this.ac * 559571575, this.av * 14626319 + var3.top);
         } else {
            this.bb.setLocation(559571575 * this.ac, this.av * 14626319);
         }

         label68: {
            this.bb.addFocusListener(this);
            this.bb.requestFocus();
            this.bq = true;
            if (null != ii.bu) {
               if (var1 <= -2028929779) {
                  throw new IllegalStateException();
               }

               if (ii.bu.aj * 488852221 == 1816225167 * ac.ax) {
                  if (var1 <= -2028929779) {
                     return;
                  }

                  if (-121992435 * ki.aq == ii.bu.ai * 168694077) {
                     if (var1 <= -2028929779) {
                        return;
                     }

                     ((bq)ii.bu).ap(this.bb, -2086780634);
                     ii.bu.aw(0, 0, 805573506);
                     break label68;
                  }
               }
            }

            ii.bu = new bq(1816225167 * ac.ax, -121992435 * ki.aq, this.bb, this.bj);
         }

         this.by = false;
         this.br = ck.ap(-1799616094) * -2514994559493730871L;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bz.ad(" + ')');
      }
   }

   static final int hp(int var0, int var1) {
      try {
         return Math.min(Math.max(var0, 128), 383);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bz.hp(" + ')');
      }
   }
}
