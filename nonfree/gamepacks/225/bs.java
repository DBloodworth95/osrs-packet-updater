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

public final class bs extends vw {
   Image ae;
   Component ac;

   final void ad(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.ae, var2, var3, this.ac);
      } catch (Exception var5) {
         this.ac.repaint();
      }

   }

   final void ac(Component var1, int var2) {
      try {
         this.ac = var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "bs.ac(" + ')');
      }
   }

   final void ax(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         try {
            Shape var7 = var1.getClip();
            var1.clipRect(var2, var3, var4, var5);
            var1.drawImage(this.ae, 0, 0, this.ac);
            var1.setClip(var7);
         } catch (Exception var8) {
            this.ac.repaint();
         }

      } catch (RuntimeException var9) {
         throw vk.ae(var9, "bs.ax(" + ')');
      }
   }

   public final void ag(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.ax(this.ac.getGraphics(), var1, var2, var3, var4, -1041318121);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "bs.ag(" + ')');
      }
   }

   final void am(Graphics var1, int var2, int var3, byte var4) {
      try {
         try {
            var1.drawImage(this.ae, var2, var3, this.ac);
         } catch (Exception var6) {
            this.ac.repaint();
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "bs.am(" + ')');
      }
   }

   public final void al(int var1, int var2, int var3, int var4) {
      this.ax(this.ac.getGraphics(), var1, var2, var3, var4, -1655750801);
   }

   bs(int var1, int var2, Component var3, boolean var4) {
      try {
         super();
         this.am = var1 * 1215902233;
         this.ax = 266465949 * var2;
         this.ag = new int[var1 * var2 + 1];
         if (var4) {
            this.aq = new float[1 + var1 * var2];
         }

         DataBufferInt var5 = new DataBufferInt(this.ag, this.ag.length);
         DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
         WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(1441925673 * this.am, this.ax * -551279691), var5, (Point)null);
         this.ae = new BufferedImage(var6, var7, false, new Hashtable());
         this.ac(var3, -1532308211);
         this.ap(1426865107);
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "bs.<init>(" + ')');
      }
   }

   final void af(Component var1) {
      this.ac = var1;
   }

   final void aq(Component var1) {
      this.ac = var1;
   }

   public final void au(int var1, int var2) {
      this.am(this.ac.getGraphics(), var1, var2, (byte)13);
   }

   public final void ar(int var1, int var2, int var3, int var4) {
      this.ax(this.ac.getGraphics(), var1, var2, var3, var4, -389102821);
   }

   public final void ae(int var1, int var2, int var3) {
      try {
         this.am(this.ac.getGraphics(), var1, var2, (byte)-23);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "bs.ae(" + ')');
      }
   }

   final void at(Component var1) {
      this.ac = var1;
   }

   final void ah(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.ae, 0, 0, this.ac);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.ac.repaint();
      }

   }
}
