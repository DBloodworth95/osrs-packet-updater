import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class bk {
   static final int bu = 60;
   public static final int cr = 98;
   static final int ar = 17;
   public static final int bk = 31;
   public static final int bj = 127;
   static final int ae = 2;

   public static final vv ak(byte[] var0) {
      BufferedImage var1 = null;

      try {
         Class var2 = ImageIO.class;
         synchronized(ImageIO.class) {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         if (null != var1) {
            int var9 = var1.getWidth();
            int var3 = var1.getHeight();
            int[] var4 = new int[var9 * var3];
            PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var9, var3, var4, 0, var9);
            var5.grabPixels();
            return new vv(var4, var9, var3);
         }
      } catch (IOException var7) {
      } catch (InterruptedException var8) {
      }

      return new vv(0, 0);
   }

   bk() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "bk.<init>(" + ')');
      }
   }

   public static final vv aw(byte[] var0) {
      BufferedImage var1 = null;

      try {
         Class var2 = ImageIO.class;
         synchronized(ImageIO.class) {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         if (null != var1) {
            int var9 = var1.getWidth();
            int var3 = var1.getHeight();
            int[] var4 = new int[var9 * var3];
            PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var9, var3, var4, 0, var9);
            var5.grabPixels();
            return new vv(var4, var9, var3);
         }
      } catch (IOException var7) {
      } catch (InterruptedException var8) {
      }

      return new vv(0, 0);
   }

   public static final vv aj(byte[] var0) {
      BufferedImage var1 = null;

      try {
         Class var2 = ImageIO.class;
         synchronized(ImageIO.class) {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         if (null != var1) {
            int var9 = var1.getWidth();
            int var3 = var1.getHeight();
            int[] var4 = new int[var9 * var3];
            PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var9, var3, var4, 0, var9);
            var5.grabPixels();
            return new vv(var4, var9, var3);
         }
      } catch (IOException var7) {
      } catch (InterruptedException var8) {
      }

      return new vv(0, 0);
   }

   static Object[] aj(vl var0, int[] var1, int var2) {
      try {
         int var3 = var0.dq(-806265131);
         Object[] var4 = new Object[var1.length * var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            for(int var6 = 0; var6 < var1.length; ++var6) {
               if (var2 != 767532376) {
                  throw new IllegalStateException();
               }

               int var7 = var1.length * var5 + var6;
               ui var8 = iq.aw(var1[var6], (byte)-5);
               var4[var7] = var8.ay(var0, (byte)1);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "bk.aj(" + ')');
      }
   }

   static {
      ImageIO.setUseCache(false);
   }
}
