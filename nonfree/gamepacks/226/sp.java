import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class sp extends sv {
   sg ap;
   sg aw;

   void ac() {
      this.aw = sg.ap;
   }

   void ap(byte var1) {
      try {
         this.ap = sg.ap;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sp.ap(" + ')');
      }
   }

   sp() {
      try {
         super();
         this.ap = sg.ap;
         this.aw = sg.ap;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "sp.<init>(" + ')');
      }
   }

   void aj(int var1) {
      try {
         sg var10001;
         if (dk.vt.ai.bp(this.ak, -373937426)) {
            if (var1 >= -1059833359) {
               throw new IllegalStateException();
            }

            var10001 = sg.aw;
         } else {
            var10001 = sg.ak;
         }

         this.ap = var10001;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sp.aj(" + ')');
      }
   }

   void ai(int var1) {
      try {
         this.aw = sg.ap;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sp.ai(" + ')');
      }
   }

   void af() {
      this.ap = sg.ap;
   }

   void au(int var1) {
      try {
         sg var10001;
         if (dk.vt.ay.bp(this.ak, -2112882420)) {
            if (var1 != 465355241) {
               throw new IllegalStateException();
            }

            var10001 = sg.aw;
         } else {
            var10001 = sg.ak;
         }

         this.aw = var10001;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sp.au(" + ')');
      }
   }

   public final boolean av() {
      if (sg.ap == this.aw) {
         this.au(465355241);
      }

      return this.aw == sg.aw;
   }

   void ao() {
      this.ap = sg.ap;
   }

   void ad() {
      this.aw = sg.ap;
   }

   public final boolean ar() {
      if (this.ap == sg.ap) {
         this.aj(-1864607041);
      }

      return this.ap == sg.aw;
   }

   void ab() {
      this.ap = dk.vt.ai.bp(this.ak, 416720942) ? sg.aw : sg.ak;
   }

   public final boolean ak(byte var1) {
      try {
         if (this.ap == sg.ap) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            this.aj(-1139223647);
         }

         return this.ap == sg.aw;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sp.ak(" + ')');
      }
   }

   void ag() {
      this.aw = sg.ap;
   }

   void al() {
      this.aw = dk.vt.ay.bp(this.ak, -851842170) ? sg.aw : sg.ak;
   }

   void az() {
      this.aw = sg.ap;
   }

   public final boolean as(byte var1) {
      try {
         if (sg.ap == this.aw) {
            this.au(465355241);
         }

         return this.aw == sg.aw;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sp.as(" + ')');
      }
   }

   public final boolean ax() {
      if (sg.ap == this.aw) {
         this.au(465355241);
      }

      return this.aw == sg.aw;
   }

   void aq() {
      this.aw = dk.vt.ay.bp(this.ak, -2024662344) ? sg.aw : sg.ak;
   }

   void an() {
      this.ap = sg.ap;
   }

   public static final vv ap(byte[] var0, byte var1) {
      try {
         BufferedImage var2 = null;

         try {
            Class var3 = ImageIO.class;
            synchronized(ImageIO.class) {
               var2 = ImageIO.read(new ByteArrayInputStream(var0));
            }

            if (null != var2) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               int var11 = var2.getWidth();
               int var4 = var2.getHeight();
               int[] var5 = new int[var11 * var4];
               PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var11, var4, var5, 0, var11);
               var6.grabPixels();
               return new vv(var5, var11, var4);
            }
         } catch (IOException var8) {
         } catch (InterruptedException var9) {
         }

         return new vv(0, 0);
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "sp.ap(" + ')');
      }
   }

   public static int[] ak(byte[] var0, byte var1) {
      try {
         if (null != var0 && 0 != var0.length) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            if (var0.length <= 8) {
               int[] var2 = new int[var0.length];
               int var3 = 0;

               while(true) {
                  if (var3 >= var0.length) {
                     return var2;
                  }

                  if (var0[var3] < 0) {
                     break;
                  }

                  if (var1 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (var0[var3] >= wo.ap.length) {
                     if (var1 >= 1) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var2[var3] = wo.ap[var0[var3]];
                  ++var3;
               }

               return null;
            }

            if (var1 >= 1) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "sp.ak(" + ')');
      }
   }
}
