import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class bm {
   public static final int az = 91;
   public static String ae = "";
   static final int bh = 3;
   static final int ax = 2;
   static final int aq = 3;
   public static Applet ac = null;
   static final int wl = -2;
   static final int ag = 0;
   public static final int aa = 33;

   static void al(String var0, boolean var1, String var2, boolean var3) {
      if (var1) {
         if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
            }
         }

         if (ae.startsWith("win") && !var3) {
            fe.ag(var0, 0, "openjs", (short)148);
            return;
         }

         if (ae.startsWith("mac")) {
            fe.ag(var0, 1, var2, (short)148);
            return;
         }

         fe.ag(var0, 2, "openjs", (short)148);
      } else {
         fe.ag(var0, 3, "openjs", (short)148);
      }

   }

   static void ar(String var0, boolean var1, String var2, boolean var3) {
      if (var1) {
         if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
            }
         }

         if (ae.startsWith("win") && !var3) {
            fe.ag(var0, 0, "openjs", (short)148);
            return;
         }

         if (ae.startsWith("mac")) {
            fe.ag(var0, 1, var2, (short)148);
            return;
         }

         fe.ag(var0, 2, "openjs", (short)148);
      } else {
         fe.ag(var0, 3, "openjs", (short)148);
      }

   }

   bm() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bm.<init>(" + ')');
      }
   }

   public static void ax(String var0, boolean var1, boolean var2) {
      bo.ae(var0, var1, "openjs", var2, -1793205079);
   }

   public static void aq(String var0, boolean var1, boolean var2) {
      bo.ae(var0, var1, "openjs", var2, -2085446292);
   }

   static void af(String var0, boolean var1, String var2, boolean var3) {
      if (var1) {
         if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
            }
         }

         if (ae.startsWith("win") && !var3) {
            fe.ag(var0, 0, "openjs", (short)148);
            return;
         }

         if (ae.startsWith("mac")) {
            fe.ag(var0, 1, var2, (short)148);
            return;
         }

         fe.ag(var0, 2, "openjs", (short)148);
      } else {
         fe.ag(var0, 3, "openjs", (short)148);
      }

   }

   static void at(String var0, boolean var1, String var2, boolean var3) {
      if (var1) {
         if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
            }
         }

         if (ae.startsWith("win") && !var3) {
            fe.ag(var0, 0, "openjs", (short)148);
            return;
         }

         if (ae.startsWith("mac")) {
            fe.ag(var0, 1, var2, (short)148);
            return;
         }

         fe.ag(var0, 2, "openjs", (short)148);
      } else {
         fe.ag(var0, 3, "openjs", (short)148);
      }

   }

   static void au(String var0, boolean var1, String var2, boolean var3) {
      if (var1) {
         if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
            }
         }

         if (ae.startsWith("win") && !var3) {
            fe.ag(var0, 0, "openjs", (short)148);
            return;
         }

         if (ae.startsWith("mac")) {
            fe.ag(var0, 1, var2, (short)148);
            return;
         }

         fe.ag(var0, 2, "openjs", (short)148);
      } else {
         fe.ag(var0, 3, "openjs", (short)148);
      }

   }

   public static void am(String var0, boolean var1, boolean var2) {
      bo.ae(var0, var1, "openjs", var2, -1859094685);
   }

   public static final void lt(int var0, int var1, int var2, int var3, byte var4) {
      try {
         for(int var5 = 0; var5 < client.rc * -1513272411; ++var5) {
            if (var4 == 40) {
               throw new IllegalStateException();
            }

            if (client.rv[var5] + client.rq[var5] > var0 && client.rq[var5] < var2 + var0) {
               if (var4 == 40) {
                  return;
               }

               if (client.rn[var5] + client.rx[var5] > var1) {
                  if (var4 == 40) {
                     throw new IllegalStateException();
                  }

                  if (client.rx[var5] < var3 + var1) {
                     if (var4 == 40) {
                        throw new IllegalStateException();
                     }

                     client.ru[var5] = true;
                  }
               }
            }
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "bm.lt(" + ')');
      }
   }
}
