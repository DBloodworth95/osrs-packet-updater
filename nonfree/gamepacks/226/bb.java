import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

public class bb {
   public static String aw = "";
   public static Applet ap = null;
   static final int ak = 0;
   static final int aj = 1;
   static final int ai = 2;
   static final int ay = 3;
   static final int da = 8;
   static final String ht = "JX_SESSION_ID";
   static final int ah = 26;

   public static void as(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var4) {
            }
         }

         if (aw.startsWith("win") && !var2) {
            ds.aw(var0, 0, (byte)14);
         } else if (aw.startsWith("mac")) {
            ad.ak(var0, 1, "openjs", -1381696483);
         } else {
            ds.aw(var0, 2, (byte)14);
         }
      } else {
         ds.aw(var0, 3, (byte)14);
      }

   }

   public static void aj(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var4) {
            }
         }

         if (aw.startsWith("win") && !var2) {
            ds.aw(var0, 0, (byte)14);
         } else if (aw.startsWith("mac")) {
            ad.ak(var0, 1, "openjs", -1381696483);
         } else {
            ds.aw(var0, 2, (byte)14);
         }
      } else {
         ds.aw(var0, 3, (byte)14);
      }

   }

   public static void ai(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var4) {
            }
         }

         if (aw.startsWith("win") && !var2) {
            ds.aw(var0, 0, (byte)14);
         } else if (aw.startsWith("mac")) {
            ad.ak(var0, 1, "openjs", -1381696483);
         } else {
            ds.aw(var0, 2, (byte)14);
         }
      } else {
         ds.aw(var0, 3, (byte)14);
      }

   }

   static boolean at(String var0, int var1) {
      return ad.ak(var0, var1, "openjs", -1381696483);
   }

   public static void ay(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var4) {
            }
         }

         if (aw.startsWith("win") && !var2) {
            ds.aw(var0, 0, (byte)14);
         } else if (aw.startsWith("mac")) {
            ad.ak(var0, 1, "openjs", -1381696483);
         } else {
            ds.aw(var0, 2, (byte)14);
         }
      } else {
         ds.aw(var0, 3, (byte)14);
      }

   }

   static boolean ae(String var0, int var1) {
      return ad.ak(var0, var1, "openjs", -1381696483);
   }

   static boolean an(String var0, int var1, String var2) {
      if (0 == var1) {
         try {
            if (!aw.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if (var11.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if (1 == var1) {
         try {
            Object var10 = bh.aw(ap, var2, new Object[]{(new URL(ap.getCodeBase(), var0)).toString()}, -1875719022);
            return var10 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            ap.getAppletContext().showDocument(new URL(ap.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if (3 == var1) {
         try {
            Applet var3 = ap;
            JSObject.getWindow(var3).call("loggedout", (Object[])null);
         } catch (Throwable var9) {
         }

         try {
            ap.getAppletContext().showDocument(new URL(ap.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static boolean am(String var0, int var1) {
      return ad.ak(var0, var1, "openjs", -1381696483);
   }

   static boolean au(String var0, int var1, String var2) {
      if (0 == var1) {
         try {
            if (!aw.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if (var11.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if (1 == var1) {
         try {
            Object var10 = bh.aw(ap, var2, new Object[]{(new URL(ap.getCodeBase(), var0)).toString()}, -2126511928);
            return var10 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            ap.getAppletContext().showDocument(new URL(ap.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if (3 == var1) {
         try {
            Applet var3 = ap;
            JSObject.getWindow(var3).call("loggedout", (Object[])null);
         } catch (Throwable var9) {
         }

         try {
            ap.getAppletContext().showDocument(new URL(ap.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   bb() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "bb.<init>(" + ')');
      }
   }
}
