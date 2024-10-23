import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class bf {
   static int gl;
   public static final int ae = 1;
   static final int bi = 4;
   static final int nw = 1;
   static final int te = 48;
   static sk if;

   public static void ac(int var0) {
      try {
         ha.ac.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bf.ac(" + ')');
      }
   }

   static {
      ImageIO.setUseCache(false);
   }

   public static final vv ae(byte[] var0) {
      BufferedImage var1 = null;

      try {
         Class var2 = ImageIO.class;
         synchronized(ImageIO.class) {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         if (null != var1) {
            int var9 = var1.getWidth();
            int var3 = var1.getHeight();
            int[] var4 = new int[var3 * var9];
            PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var9, var3, var4, 0, var9);
            var5.grabPixels();
            return new vv(var4, var9, var3);
         }
      } catch (IOException var7) {
      } catch (InterruptedException var8) {
      }

      return new vv(0, 0);
   }

   bf() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bf.<init>(" + ')');
      }
   }

   static final int ih(int var0, int var1) {
      try {
         return Math.min(Math.max(var0, 128), 383);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "bf.ih(" + ')');
      }
   }

   public static void ac(short var0) {
      try {
         gn.ac.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bf.ac(" + ')');
      }
   }

   public static final vv ag(byte[] var0) {
      BufferedImage var1 = null;

      try {
         Class var2 = ImageIO.class;
         synchronized(ImageIO.class) {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         if (null != var1) {
            int var9 = var1.getWidth();
            int var3 = var1.getHeight();
            int[] var4 = new int[var3 * var9];
            PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var9, var3, var4, 0, var9);
            var5.grabPixels();
            return new vv(var4, var9, var3);
         }
      } catch (IOException var7) {
      } catch (InterruptedException var8) {
      }

      return new vv(0, 0);
   }

   static void at(int var0) {
      try {
         dp.cj = dp.cj.trim();
         if (dp.cj.length() == 0) {
            dp.aa(ok.ey, ok.er, ok.ed, (byte)56);
         } else if (dp.cx.length() == 0) {
            if (var0 <= 1592496391) {
               throw new IllegalStateException();
            } else {
               dp.aa(ok.ee, ok.eq, ok.ej, (byte)-113);
            }
         } else {
            dp.aa(ok.im, ok.in, ok.ic, (byte)14);
            gs.iz(false, (byte)1);
            ry.hp(20, 1249151769);
         }
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bf.at(" + ')');
      }
   }
}
