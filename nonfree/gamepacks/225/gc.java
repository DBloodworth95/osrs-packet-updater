import java.io.DataInputStream;
import java.net.URL;

public class gc {
   static final int dp = 100;
   public static final int ag = 4;
   public static final int ax = 3;
   public static final int az = 0;
   public static final int ac = 2;
   static final int ar = 512;
   static final int cj = 73;

   gc() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "gc.<init>(" + ')');
      }
   }

   static void ac(int var0) {
      try {
         kj.au = new int[2000];
         int var1 = 0;
         int var2 = 240;

         int var4;
         for(byte var3 = 12; var1 < 16; var2 -= var3) {
            if (var0 != 294720589) {
               return;
            }

            var4 = bt.ac((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var1 * 0.425F / 16.0F));
            kj.au[var1] = var4;
            ++var1;
         }

         var2 = 48;

         for(int var7 = var2 / 6; var1 < kj.au.length; var2 -= var7) {
            if (var0 != 294720589) {
               throw new IllegalStateException();
            }

            var4 = 2 * var1;

            for(int var5 = bt.ac((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4; ++var1) {
               if (var0 != 294720589) {
                  return;
               }

               if (var1 >= kj.au.length) {
                  break;
               }

               if (var0 != 294720589) {
                  throw new IllegalStateException();
               }

               kj.au[var1] = var5;
            }
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "gc.ac(" + ')');
      }
   }

   public static void ac(String var0, Throwable var1, byte var2) {
      try {
         try {
            String var3 = "";
            if (null != var1) {
               var3 = sq.ag(var1, 1620575382);
            }

            if (var0 != null) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (var1 != null) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  var3 = var3 + " | ";
               }

               var3 = var3 + var0;
            }

            System.out.println("Error: " + var3);
            var3 = var3.replace(':', '.');
            var3 = var3.replace('@', '_');
            var3 = var3.replace('&', '_');
            var3 = var3.replace('#', '_');
            if (null == wc.ac) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               return;
            }

            URL var4 = new URL(wc.ac.getCodeBase(), "clienterror.ws?cv=" + -434996671 * rn.ag + "&cs=" + -1977807551 * lp.am + "&u=" + qc.ae + "&v1=" + ir.ac + "&v2=" + ir.ae + "&ct=" + ot.ax * -46119271 + "&e=" + var3);
            DataInputStream var5 = new DataInputStream(var4.openStream());
            var5.read();
            var5.close();
         } catch (Exception var6) {
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "gc.ac(" + ')');
      }
   }
}
