import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ah implements KeyListener, FocusListener {
   boolean[] ai;
   Collection aw;
   Collection ak;
   bx[] aj;
   static final int ab = 13;
   volatile int ay;
   static final int dq = 1000;
   public static final int bx = 4096;
   static final int ap = 100;

   void ao() {
      this.ay += -515760607;
      this.ay(1735923679);
      Iterator var1 = this.ak.iterator();

      while(var1.hasNext()) {
         bp var2 = (bp)var1.next();

         for(int var3 = 0; var3 < this.aj.length && !var2.ap(this.aj[var3], -645011540); ++var3) {
         }
      }

      this.ak.clear();
   }

   void ap(bx var1, int var2, short var3) {
      try {
         this.aj[var2] = var1;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ah.ap(" + ')');
      }
   }

   public int aw(int var1) {
      try {
         return this.ay * -2114918943;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ah.aw(" + ')');
      }
   }

   void ab() {
      this.ay += -515760607;
      this.ay(1735923679);
      Iterator var1 = this.ak.iterator();

      while(var1.hasNext()) {
         bp var2 = (bp)var1.next();

         for(int var3 = 0; var3 < this.aj.length && !var2.ap(this.aj[var3], -1110337688); ++var3) {
         }
      }

      this.ak.clear();
   }

   synchronized void aj(Component var1, int var2) {
      try {
         var1.removeKeyListener(this);
         var1.removeFocusListener(this);
         synchronized(this) {
            this.aw.add(new bp(4, 0));
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ah.aj(" + ')');
      }
   }

   synchronized void aq() {
      Collection var1 = this.ak;
      this.ak = this.aw;
      this.aw = var1;
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      try {
         int var2 = var1.getKeyCode();
         if (var2 >= 0 && var2 < dy.aw((byte)14)) {
            var2 = iu.ap(var2, (byte)27);
            boolean var3 = (var2 & 128) != 0;
            if (var3) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if (var2 >= 0) {
            if (!this.ai[var2]) {
               this.ay = 0;
            }

            this.ai[var2] = true;
            this.aw.add(new bp(1, var2));
         }

         var1.consume();
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ah.keyPressed(" + ')');
      }
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      try {
         int var2 = var1.getKeyCode();
         if (var2 >= 0 && var2 < dy.aw((byte)14)) {
            var2 = iu.ap(var2, (byte)52) & -129;
         } else {
            var2 = -1;
         }

         if (var2 >= 0) {
            this.ai[var2] = false;
            this.aw.add(new bp(2, var2));
         }

         var1.consume();
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ah.keyReleased(" + ')');
      }
   }

   public final synchronized void keyTyped(KeyEvent var1) {
      try {
         char var2 = var1.getKeyChar();
         if (0 != var2 && '\uffff' != var2 && ly.aw(var2, 1283755408)) {
            this.aw.add(new bp(3, var2));
         }

         var1.consume();
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ah.keyTyped(" + ')');
      }
   }

   synchronized void ay(int var1) {
      try {
         Collection var2 = this.ak;
         this.ak = this.aw;
         this.aw = var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ah.ay(" + ')');
      }
   }

   public final synchronized void focusGained(FocusEvent var1) {
      try {
         this.aw.add(new bp(4, 1));
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ah.focusGained(" + ')');
      }
   }

   public final synchronized void focusLost(FocusEvent var1) {
      try {
         for(int var2 = 0; var2 < 112; ++var2) {
            if (this.ai[var2]) {
               this.ai[var2] = false;
               this.aw.add(new bp(2, var2));
            }
         }

         this.aw.add(new bp(4, 0));
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ah.focusLost(" + ')');
      }
   }

   void as(bx var1, int var2) {
      this.aj[var2] = var1;
   }

   public int ae() {
      return this.ay * -2114918943;
   }

   void am(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   void at(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   void ar() {
      this.ay += 403780967;
      this.ay(1735923679);
      Iterator var1 = this.ak.iterator();

      while(var1.hasNext()) {
         bp var2 = (bp)var1.next();

         for(int var3 = 0; var3 < this.aj.length && !var2.ap(this.aj[var3], -1951208934); ++var3) {
         }
      }

      this.ak.clear();
   }

   public final synchronized void ah(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.ai[var2]) {
            this.ai[var2] = false;
            this.aw.add(new bp(2, var2));
         }
      }

      this.aw.add(new bp(4, 0));
   }

   public final synchronized void ag(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < dy.aw((byte)14)) {
         var2 = iu.ap(var2, (byte)126) & -129;
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         this.ai[var2] = false;
         this.aw.add(new bp(2, var2));
      }

      var1.consume();
   }

   void af() {
      this.ay += -2073038068;
      this.ay(1735923679);
      Iterator var1 = this.ak.iterator();

      while(var1.hasNext()) {
         bp var2 = (bp)var1.next();

         for(int var3 = 0; var3 < this.aj.length && !var2.ap(this.aj[var3], -2145287243); ++var3) {
         }
      }

      this.ak.clear();
   }

   public final synchronized void ac(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < dy.aw((byte)14)) {
         var2 = iu.ap(var2, (byte)14) & -1060508348;
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         this.ai[var2] = false;
         this.aw.add(new bp(2, var2));
      }

      var1.consume();
   }

   synchronized void ax() {
      Collection var1 = this.ak;
      this.ak = this.aw;
      this.aw = var1;
   }

   public final synchronized void az(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < dy.aw((byte)14)) {
         var2 = iu.ap(var2, (byte)94);
         boolean var3 = (var2 & 128) != 0;
         if (var3) {
            var2 = -1;
         }
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         if (!this.ai[var2]) {
            this.ay = 0;
         }

         this.ai[var2] = true;
         this.aw.add(new bp(1, var2));
      }

      var1.consume();
   }

   ah() {
      try {
         super();
         this.aj = new bx[3];
         this.ai = new boolean[112];
         this.ay = 0;
         this.aw = new ArrayList(100);
         this.ak = new ArrayList(100);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ah.<init>(" + ')');
      }
   }

   public final synchronized void ad(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < dy.aw((byte)14)) {
         var2 = iu.ap(var2, (byte)68) & -129;
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         this.ai[var2] = false;
         this.aw.add(new bp(2, var2));
      }

      var1.consume();
   }

   synchronized void an(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.aw.add(new bp(4, 0));
      }
   }

   public final synchronized void av(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (0 != var2 && '\uffff' != var2 && ly.aw(var2, 333896405)) {
         this.aw.add(new bp(3, var2));
      }

      var1.consume();
   }

   void ak(Component var1, int var2) {
      try {
         var1.setFocusTraversalKeysEnabled(false);
         var1.addKeyListener(this);
         var1.addFocusListener(this);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ah.ak(" + ')');
      }
   }

   void ai(int var1) {
      try {
         this.ay += -515760607;
         this.ay(1735923679);
         Iterator var2 = this.ak.iterator();

         label39:
         do {
            while(var2.hasNext()) {
               if (var1 >= 2142203295) {
                  throw new IllegalStateException();
               }

               bp var3 = (bp)var2.next();

               for(int var4 = 0; var4 < this.aj.length; ++var4) {
                  if (var3.ap(this.aj[var4], -1989448184)) {
                     continue label39;
                  }
               }
            }

            this.ak.clear();
            return;
         } while(var1 < 2142203295);

         throw new IllegalStateException();
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ah.ai(" + ')');
      }
   }

   public final synchronized void al(FocusEvent var1) {
      this.aw.add(new bp(4, 1));
   }

   public final synchronized void aa(FocusEvent var1) {
      this.aw.add(new bp(4, 1));
   }

   static long ha(byte var0) {
      try {
         return 3448758816422147141L * client.mp;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ah.ha(" + ')');
      }
   }

   public final synchronized void bh(FocusEvent var1) {
      for(int var2 = 0; var2 < 224962860; ++var2) {
         if (this.ai[var2]) {
            this.ai[var2] = false;
            this.aw.add(new bp(2, var2));
         }
      }

      this.aw.add(new bp(4, 0));
   }

   public static String ap(CharSequence[] var0, int var1, int var2, byte var3) {
      try {
         if (var2 == 0) {
            return "";
         } else if (1 == var2) {
            if (var3 <= 32) {
               throw new IllegalStateException();
            } else {
               CharSequence var10 = var0[var1];
               if (var10 == null) {
                  if (var3 <= 32) {
                     throw new IllegalStateException();
                  } else {
                     return "null";
                  }
               } else {
                  return var10.toString();
               }
            }
         } else {
            int var4 = var1 + var2;
            int var5 = 0;

            for(int var6 = var1; var6 < var4; ++var6) {
               if (var3 <= 32) {
                  throw new IllegalStateException();
               }

               CharSequence var7 = var0[var6];
               if (var7 == null) {
                  var5 += 4;
               } else {
                  var5 += var7.length();
               }
            }

            StringBuilder var11 = new StringBuilder(var5);

            for(int var12 = var1; var12 < var4; ++var12) {
               if (var3 <= 32) {
                  throw new IllegalStateException();
               }

               CharSequence var8 = var0[var12];
               if (var8 == null) {
                  if (var3 <= 32) {
                     throw new IllegalStateException();
                  }

                  var11.append("null");
               } else {
                  var11.append(var8);
               }
            }

            return var11.toString();
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "ah.ap(" + ')');
      }
   }

   public final synchronized void bv(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.ai[var2]) {
            this.ai[var2] = false;
            this.aw.add(new bp(2, var2));
         }
      }

      this.aw.add(new bp(4, 0));
   }

   synchronized void au(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.aw.add(new bp(4, 0));
      }
   }

   public final synchronized void bj(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.ai[var2]) {
            this.ai[var2] = false;
            this.aw.add(new bp(2, var2));
         }
      }

      this.aw.add(new bp(4, 0));
   }

   static int ay(ct var0, ct var1, int var2, boolean var3, int var4, boolean var5, int var6) {
      try {
         int var7 = oh.as(var0, var1, var2, var3, 1987327554);
         if (var7 != 0) {
            if (var6 >= 16843780) {
               throw new IllegalStateException();
            } else if (var3) {
               if (var6 >= 16843780) {
                  throw new IllegalStateException();
               } else {
                  return -var7;
               }
            } else {
               return var7;
            }
         } else if (var4 == -1) {
            if (var6 >= 16843780) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            int var8 = oh.as(var0, var1, var4, var5, 2016346056);
            if (var5) {
               if (var6 >= 16843780) {
                  throw new IllegalStateException();
               } else {
                  return -var8;
               }
            } else {
               return var8;
            }
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "ah.ay(" + ')');
      }
   }
}
