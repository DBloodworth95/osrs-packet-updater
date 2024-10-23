import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ez {
   static String ag = "|";
   static String ae = ",";
   static String ax = ")";
   static String at = "</col>";
   static String am = " (";
   static String aq = "->";
   static String ac = "true";
   static String af = "<br>";

   static String ax(int var0) {
      return "<img=" + var0 + ">";
   }

   static String ag(int var0) {
      return "<img=" + var0 + ">";
   }

   static String am(int var0) {
      return "<img=" + var0 + ">";
   }

   static final void oj(byte var0) {
      try {
         client.qd = client.pf * -1860654767;
         gr.sk = true;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ez.oj(" + ')');
      }
   }

   static String aq(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   ez() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ez.<init>(" + ')');
      }
   }

   static String at(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   public static void ac(short var0) {
      try {
         hy.ac.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ez.ac(" + ')');
      }
   }

   static String af(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   public static final vv ac(byte[] var0, int var1) {
      try {
         BufferedImage var2 = null;

         try {
            Class var3 = ImageIO.class;
            synchronized(ImageIO.class) {
               var2 = ImageIO.read(new ByteArrayInputStream(var0));
            }

            if (null != var2) {
               if (var1 != 35301021) {
                  throw new IllegalStateException();
               }

               int var11 = var2.getWidth();
               int var4 = var2.getHeight();
               int[] var5 = new int[var4 * var11];
               PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var11, var4, var5, 0, var11);
               var6.grabPixels();
               return new vv(var5, var11, var4);
            }
         } catch (IOException var8) {
         } catch (InterruptedException var9) {
         }

         return new vv(0, 0);
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "ez.ac(" + ')');
      }
   }

   static void jn(int var0) {
      try {
         if (client.sz * 1311031545 == -1125889549 * qm.mm.bf >> 7) {
            if (var0 != -943629713) {
               throw new IllegalStateException();
            }

            if (client.si * -1317418145 == -1650600853 * qm.mm.bm >> 7) {
               if (var0 != -943629713) {
                  throw new IllegalStateException();
               }

               client.sz = 0;
            }
         }

      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ez.jn(" + ')');
      }
   }
}
