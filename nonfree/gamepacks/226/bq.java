import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class bq extends vq {
   Image aw;
   Component ap;

   public final void ak(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.ai(this.ap.getGraphics(), var1, var2, var3, var4, -1256952777);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "bq.ak(" + ')');
      }
   }

   final void ap(Component var1, int var2) {
      try {
         this.ap = var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bq.ap(" + ')');
      }
   }

   final void au(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.aw, var2, var3, this.ap);
      } catch (Exception var5) {
         this.ap.repaint();
      }

   }

   public final void aw(int var1, int var2, int var3) {
      try {
         this.aj(this.ap.getGraphics(), var1, var2, 69565682);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bq.aw(" + ')');
      }
   }

   final void aj(Graphics var1, int var2, int var3, int var4) {
      try {
         try {
            var1.drawImage(this.aw, var2, var3, this.ap);
         } catch (Exception var6) {
            this.ap.repaint();
         }

      } catch (RuntimeException var7) {
         throw tm.aw(var7, "bq.aj(" + ')');
      }
   }

   final void ai(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         try {
            Shape var7 = var1.getClip();
            var1.clipRect(var2, var3, var4, var5);
            var1.drawImage(this.aw, 0, 0, this.ap);
            var1.setClip(var7);
         } catch (Exception var8) {
            this.ap.repaint();
         }

      } catch (RuntimeException var9) {
         throw tm.aw(var9, "bq.ai(" + ')');
      }
   }

   final void ay(Component var1) {
      this.ap = var1;
   }

   public final void ae(int var1, int var2) {
      this.aj(this.ap.getGraphics(), var1, var2, 69565682);
   }

   final void an(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.aw, var2, var3, this.ap);
      } catch (Exception var5) {
         this.ap.repaint();
      }

   }

   public final void am(int var1, int var2) {
      this.aj(this.ap.getGraphics(), var1, var2, 69565682);
   }

   public final void at(int var1, int var2, int var3, int var4) {
      this.ai(this.ap.getGraphics(), var1, var2, var3, var4, 2050232844);
   }

   final void ao(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.aw, var2, var3, this.ap);
      } catch (Exception var5) {
         this.ap.repaint();
      }

   }

   bq(int var1, int var2, Component var3, boolean var4) {
      try {
         super();
         this.aj = 1868866133 * var1;
         this.ai = -76001771 * var2;
         this.ak = new int[var2 * var1 + 1];
         if (var4) {
            this.ay = new float[1 + var2 * var1];
         }

         DataBufferInt var5 = new DataBufferInt(this.ak, this.ak.length);
         DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
         WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(488852221 * this.aj, this.ai * 168694077), var5, (Point)null);
         this.aw = new BufferedImage(var6, var7, false, new Hashtable());
         this.ap(var3, -1248299550);
         this.az((byte)-63);
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "bq.<init>(" + ')');
      }
   }

   final void as(Component var1) {
      this.ap = var1;
   }

   final void af(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.aw, var2, var3, this.ap);
      } catch (Exception var5) {
         this.ap.repaint();
      }

   }

   final void ar(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.aw, var2, var3, this.ap);
      } catch (Exception var5) {
         this.ap.repaint();
      }

   }

   final void ab(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.aw, 0, 0, this.ap);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.ap.repaint();
      }

   }
}
