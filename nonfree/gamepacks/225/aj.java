import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class aj implements iw, MouseWheelListener {
   int ac;

   void ae(Component var1, int var2) {
      try {
         var1.removeMouseWheelListener(this);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "aj.ae(" + ')');
      }
   }

   void ac(Component var1, byte var2) {
      try {
         var1.addMouseWheelListener(this);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "aj.ac(" + ')');
      }
   }

   aj() {
      try {
         super();
         this.ac = 0;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "aj.<init>(" + ')');
      }
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      try {
         this.ac += var1.getWheelRotation() * -1483716275;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "aj.mouseWheelMoved(" + ')');
      }
   }

   public synchronized int ag(int var1) {
      try {
         int var2 = this.ac * 256120709;
         this.ac = 0;
         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "aj.ag(" + ')');
      }
   }

   void am(Component var1) {
      var1.addMouseWheelListener(this);
   }

   void ax(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized int aq() {
      int var1 = this.ac * 256120709;
      this.ac = 0;
      return var1;
   }
}
