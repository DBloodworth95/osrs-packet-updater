import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ak implements KeyListener, FocusListener {
   Collection ag;
   public static final String jz = "";
   boolean[] ax;
   bx[] am;
   volatile int aq;
   static boolean dx;
   static of eq;
   static int iz;
   static of fs;
   Collection ae;
   public static final String jc = "Please try again later. If the problem ";

   synchronized void bf() {
      Collection var1 = this.ag;
      this.ag = this.ae;
      this.ae = var1;
   }

   void as() {
      this.aq += 928528449;
      this.aq(-1343573175);
      Iterator var1 = this.ag.iterator();

      while(var1.hasNext()) {
         bw var2 = (bw)var1.next();

         for(int var3 = 0; var3 < this.am.length && !var2.ac(this.am[var3], -1012412569); ++var3) {
         }
      }

      this.ag.clear();
   }

   public final synchronized void focusLost(FocusEvent var1) {
      try {
         for(int var2 = 0; var2 < 112; ++var2) {
            if (this.ax[var2]) {
               this.ax[var2] = false;
               this.ae.add(new bw(2, var2));
            }
         }

         this.ae.add(new bw(4, 0));
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ak.focusLost(" + ')');
      }
   }

   static final void ik(int var0) {
      try {
         if (du.js.am * 97097587 != -179610807 * client.sn) {
            if (var0 == -1776792799) {
               throw new IllegalStateException();
            }

            client.sn = du.js.am * 1027506395;
            lq.kt(97097587 * du.js.am, 639281147);
         }

      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ak.ik(" + ')');
      }
   }

   synchronized void am(Component var1, byte var2) {
      try {
         var1.removeKeyListener(this);
         var1.removeFocusListener(this);
         synchronized(this) {
            this.ae.add(new bw(4, 0));
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ak.am(" + ')');
      }
   }

   void ax(short var1) {
      try {
         this.aq += 928528449;
         this.aq(-1343573175);
         Iterator var2 = this.ag.iterator();

         label39:
         do {
            while(var2.hasNext()) {
               bw var3 = (bw)var2.next();

               for(int var4 = 0; var4 < this.am.length; ++var4) {
                  if (var1 != 128) {
                     throw new IllegalStateException();
                  }

                  if (var3.ac(this.am[var4], -1917026980)) {
                     continue label39;
                  }
               }
            }

            this.ag.clear();
            return;
         } while(var1 == 128);

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ak.ax(" + ')');
      }
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      try {
         int var2 = var1.getKeyCode();
         if (var2 >= 0 && var2 < la.ae((byte)12)) {
            int var3 = bd.dw[var2];
            var2 = var3;
            if (ci.ag(var3, (byte)64)) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if (var2 >= 0) {
            if (!this.ax[var2]) {
               this.aq = 0;
            }

            this.ax[var2] = true;
            this.ae.add(new bw(1, var2));
         }

         var1.consume();
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ak.keyPressed(" + ')');
      }
   }

   public final synchronized void bm(FocusEvent var1) {
      this.ae.add(new bw(4, 1));
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      try {
         int var2 = var1.getKeyCode();
         if (var2 >= 0 && var2 < la.ae((byte)12)) {
            var2 = et.ac(var2, -996746712) & -129;
         } else {
            var2 = -1;
         }

         if (var2 >= 0) {
            this.ax[var2] = false;
            this.ae.add(new bw(2, var2));
         }

         var1.consume();
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ak.keyReleased(" + ')');
      }
   }

   synchronized void aq(int var1) {
      try {
         Collection var2 = this.ag;
         this.ag = this.ae;
         this.ae = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ak.aq(" + ')');
      }
   }

   public final synchronized void bn(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (0 != var2 && '\uffff' != var2 && hr.ae(var2, (byte)-5)) {
         this.ae.add(new bw(3, var2));
      }

      var1.consume();
   }

   public int al() {
      return this.aq * -2021664831;
   }

   void ad(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   void at(bx var1, int var2) {
      this.am[var2] = var1;
   }

   void au(bx var1, int var2) {
      this.am[var2] = var1;
   }

   public final synchronized void keyTyped(KeyEvent var1) {
      try {
         char var2 = var1.getKeyChar();
         if (0 != var2 && '\uffff' != var2 && hr.ae(var2, (byte)35)) {
            this.ae.add(new bw(3, var2));
         }

         var1.consume();
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ak.keyTyped(" + ')');
      }
   }

   public final synchronized void aw(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < la.ae((byte)12)) {
         var2 = et.ac(var2, 378975119) & -129;
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         this.ax[var2] = false;
         this.ae.add(new bw(2, var2));
      }

      var1.consume();
   }

   synchronized void aa(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.ae.add(new bw(4, 0));
      }
   }

   void ah(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   void ap(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   synchronized void ab(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.ae.add(new bw(4, 0));
      }
   }

   synchronized void az(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.ae.add(new bw(4, 0));
      }
   }

   public int ar() {
      return this.aq * -691122162;
   }

   void ai() {
      this.aq += 928528449;
      this.aq(-1343573175);
      Iterator var1 = this.ag.iterator();

      while(var1.hasNext()) {
         bw var2 = (bw)var1.next();

         for(int var3 = 0; var3 < this.am.length && !var2.ac(this.am[var3], -1939099578); ++var3) {
         }
      }

      this.ag.clear();
   }

   void ao() {
      this.aq += 685509830;
      this.aq(-1343573175);
      Iterator var1 = this.ag.iterator();

      while(var1.hasNext()) {
         bw var2 = (bw)var1.next();

         for(int var3 = 0; var3 < this.am.length && !var2.ac(this.am[var3], -834007133); ++var3) {
         }
      }

      this.ag.clear();
   }

   ak() {
      try {
         super();
         this.am = new bx[3];
         this.ax = new boolean[112];
         this.aq = 0;
         this.ae = new ArrayList(100);
         this.ag = new ArrayList(100);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ak.<init>(" + ')');
      }
   }

   public final synchronized void ay(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < la.ae((byte)12)) {
         int var3 = bd.dw[var2];
         var2 = var3;
         if (ci.ag(var3, (byte)-14)) {
            var2 = -1;
         }
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         if (!this.ax[var2]) {
            this.aq = 0;
         }

         this.ax[var2] = true;
         this.ae.add(new bw(1, var2));
      }

      var1.consume();
   }

   public final synchronized void aj(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < la.ae((byte)12)) {
         int var3 = bd.dw[var2];
         var2 = var3;
         if (ci.ag(var3, (byte)103)) {
            var2 = -1;
         }
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         if (!this.ax[var2]) {
            this.aq = 0;
         }

         this.ax[var2] = true;
         this.ae.add(new bw(1, var2));
      }

      var1.consume();
   }

   void ac(bx var1, int var2, byte var3) {
      try {
         this.am[var2] = var1;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ak.ac(" + ')');
      }
   }

   void af(bx var1, int var2) {
      this.am[var2] = var1;
   }

   public final synchronized void an(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (0 != var2 && '\uffff' != var2 && hr.ae(var2, (byte)-27)) {
         this.ae.add(new bw(3, var2));
      }

      var1.consume();
   }

   public final synchronized void ak(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (0 != var2 && '\uffff' != var2 && hr.ae(var2, (byte)-67)) {
         this.ae.add(new bw(3, var2));
      }

      var1.consume();
   }

   void ag(Component var1, byte var2) {
      try {
         var1.setFocusTraversalKeysEnabled(false);
         var1.addKeyListener(this);
         var1.addFocusListener(this);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ak.ag(" + ')');
      }
   }

   synchronized void bh() {
      Collection var1 = this.ag;
      this.ag = this.ae;
      this.ae = var1;
   }

   synchronized void bd() {
      Collection var1 = this.ag;
      this.ag = this.ae;
      this.ae = var1;
   }

   synchronized void bx() {
      Collection var1 = this.ag;
      this.ag = this.ae;
      this.ae = var1;
   }

   public int ae(int var1) {
      try {
         return this.aq * -2021664831;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ak.ae(" + ')');
      }
   }

   public final synchronized void focusGained(FocusEvent var1) {
      try {
         this.ae.add(new bw(4, 1));
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ak.focusGained(" + ')');
      }
   }

   public final synchronized void bs(FocusEvent var1) {
      this.ae.add(new bw(4, 1));
   }

   public final synchronized void bw(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.ax[var2]) {
            this.ax[var2] = false;
            this.ae.add(new bw(2, var2));
         }
      }

      this.ae.add(new bw(4, 0));
   }

   public final synchronized void ba(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.ax[var2]) {
            this.ax[var2] = false;
            this.ae.add(new bw(2, var2));
         }
      }

      this.ae.add(new bw(4, 0));
   }

   static final void mm(int var0, int var1, int var2, boolean var3, int var4) {
      try {
         if (!ir.ep.ag(var0, (byte)32)) {
            if (var4 != 2045319622) {
               throw new IllegalStateException();
            }
         } else {
            oz.ms(ir.ep.aq[var0], -1, var1, var2, var3, 1226261446);
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ak.mm(" + ')');
      }
   }

   static final void im(int var0, int var1, int var2) {
      try {
         if (var0 < 128) {
            if (var2 <= -551006801) {
               throw new IllegalStateException();
            }

            var0 = 128;
         } else if (var0 > 383) {
            if (var2 <= -551006801) {
               return;
            }

            var0 = 383;
         }

         if (rp.ko * 322327291 < var0) {
            if (var2 <= -551006801) {
               throw new IllegalStateException();
            }

            rp.ko += (2028666475 * ar.uw + -1098610841 * ik.ub * (var0 - rp.ko * 322327291) / 1000) * -1848711117;
            if (322327291 * rp.ko > var0) {
               if (var2 <= -551006801) {
                  throw new IllegalStateException();
               }

               rp.ko = var0 * -1848711117;
            }
         } else if (rp.ko * 322327291 > var0) {
            if (var2 <= -551006801) {
               throw new IllegalStateException();
            }

            rp.ko -= (ik.ub * -1098610841 * (rp.ko * 322327291 - var0) / 1000 + ar.uw * 2028666475) * -1848711117;
            if (322327291 * rp.ko < var0) {
               if (var2 <= -551006801) {
                  throw new IllegalStateException();
               }

               rp.ko = var0 * -1848711117;
            }
         }

         var1 &= 2047;
         int var3 = var1 - -2112521381 * ki.kw;
         if (var3 > 1024) {
            var3 -= 2048;
         } else if (var3 < -1024) {
            if (var2 <= -551006801) {
               throw new IllegalStateException();
            }

            var3 += 2048;
         }

         if (var3 > 0) {
            if (var2 <= -551006801) {
               throw new IllegalStateException();
            }

            ki.kw += (var3 * ik.ub * -1098610841 / 1000 + 2028666475 * ar.uw) * -1245299501;
            ki.kw = (-2112521381 * ki.kw & 2047) * -1245299501;
         } else if (var3 < 0) {
            ki.kw -= (2028666475 * ar.uw + ik.ub * -1098610841 * -var3 / 1000) * -1245299501;
            ki.kw = (-2112521381 * ki.kw & 2047) * -1245299501;
         }

         int var4 = var1 - -2112521381 * ki.kw;
         if (var4 > 1024) {
            if (var2 <= -551006801) {
               throw new IllegalStateException();
            }

            var4 -= 2048;
         } else if (var4 < -1024) {
            if (var2 <= -551006801) {
               throw new IllegalStateException();
            }

            var4 += 2048;
         }

         label128: {
            if (var4 < 0) {
               if (var2 <= -551006801) {
                  return;
               }

               if (var3 > 0) {
                  break label128;
               }

               if (var2 <= -551006801) {
                  return;
               }
            }

            if (var4 <= 0) {
               return;
            }

            if (var2 <= -551006801) {
               throw new IllegalStateException();
            }

            if (var3 >= 0) {
               return;
            }

            if (var2 <= -551006801) {
               throw new IllegalStateException();
            }
         }

         ki.kw = var1 * -1245299501;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ak.im(" + ')');
      }
   }

   public final synchronized void av(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < la.ae((byte)12)) {
         var2 = et.ac(var2, -1769492607) & 1386190233;
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         this.ax[var2] = false;
         this.ae.add(new bw(2, var2));
      }

      var1.consume();
   }
}
