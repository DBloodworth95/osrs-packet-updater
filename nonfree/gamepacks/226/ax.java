import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class ax implements iv, MouseWheelListener {
   int ap;

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      try {
         this.ap += var1.getWheelRotation() * 1215037723;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ax.mouseWheelMoved(" + ')');
      }
   }

   void ap(Component var1, int var2) {
      try {
         var1.addMouseWheelListener(this);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ax.ap(" + ')');
      }
   }

   void aw(Component var1, int var2) {
      try {
         var1.removeMouseWheelListener(this);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ax.aw(" + ')');
      }
   }

   ax() {
      try {
         super();
         this.ap = 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ax.<init>(" + ')');
      }
   }

   public synchronized int ak(byte var1) {
      try {
         int var2 = 560820499 * this.ap;
         this.ap = 0;
         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ax.ak(" + ')');
      }
   }

   void ay(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   void aj(Component var1) {
      var1.addMouseWheelListener(this);
   }

   void ai(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   void as(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized int ae() {
      int var1 = 560820499 * this.ap;
      this.ap = 0;
      return var1;
   }

   public synchronized int am() {
      int var1 = 560820499 * this.ap;
      this.ap = 0;
      return var1;
   }
}
