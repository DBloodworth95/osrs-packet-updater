import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class wc extends RuntimeException {
   String aq;
   Throwable af;
   public static Applet ac;
   public static int au;

   public static wc au(Throwable var0, String var1) {
      wc var2;
      if (var0 instanceof wc) {
         var2 = (wc)var0;
         var2.aq = var2.aq + ' ' + var1;
      } else {
         var2 = new wc(var0, var1);
      }

      return var2;
   }

   public static void am(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (null != var1) {
            var2 = sq.ag(var1, -1917018387);
         }

         if (var0 != null) {
            if (var1 != null) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace(':', '.');
         var2 = var2.replace('@', '_');
         var2 = var2.replace('&', '_');
         var2 = var2.replace('#', '_');
         if (null == ac) {
            return;
         }

         URL var3 = new URL(ac.getCodeBase(), "clienterror.ws?cv=" + -434996671 * rn.ag + "&cs=" + -1977807551 * lp.am + "&u=" + qc.ae + "&v1=" + ir.ac + "&v2=" + ir.ae + "&ct=" + ot.ax * -46119271 + "&e=" + var2);
         DataInputStream var4 = new DataInputStream(var3.openStream());
         var4.read();
         var4.close();
      } catch (Exception var5) {
      }

   }

   public static void ax(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (null != var1) {
            var2 = sq.ag(var1, -1046675332);
         }

         if (var0 != null) {
            if (var1 != null) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace(':', (char)1085910266);
         var2 = var2.replace('@', '_');
         var2 = var2.replace((char)-84239852, (char)242368631);
         var2 = var2.replace((char)-1191661540, '_');
         if (null == ac) {
            return;
         }

         URL var3 = new URL(ac.getCodeBase(), "clienterror.ws?cv=" + -434996671 * rn.ag + "&cs=" + -1977807551 * lp.am + "&u=" + qc.ae + "&v1=" + ir.ac + "&v2=" + ir.ae + "&ct=" + ot.ax * -857464446 + "&e=" + var2);
         DataInputStream var4 = new DataInputStream(var3.openStream());
         var4.read();
         var4.close();
      } catch (Exception var5) {
      }

   }

   public static wc at(Throwable var0, String var1) {
      wc var2;
      if (var0 instanceof wc) {
         var2 = (wc)var0;
         var2.aq = var2.aq + ' ' + var1;
      } else {
         var2 = new wc(var0, var1);
      }

      return var2;
   }

   public static wc af(Throwable var0, String var1) {
      wc var2;
      if (var0 instanceof wc) {
         var2 = (wc)var0;
         var2.aq = var2.aq + ' ' + var1;
      } else {
         var2 = new wc(var0, var1);
      }

      return var2;
   }

   public static void aq(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (null != var1) {
            var2 = sq.ag(var1, -1870415480);
         }

         if (var0 != null) {
            if (var1 != null) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace(':', '.');
         var2 = var2.replace('@', '_');
         var2 = var2.replace('&', '_');
         var2 = var2.replace('#', '_');
         if (null == ac) {
            return;
         }

         URL var3 = new URL(ac.getCodeBase(), "clienterror.ws?cv=" + -434996671 * rn.ag + "&cs=" + -1977807551 * lp.am + "&u=" + qc.ae + "&v1=" + ir.ac + "&v2=" + ir.ae + "&ct=" + ot.ax * -46119271 + "&e=" + var2);
         DataInputStream var4 = new DataInputStream(var3.openStream());
         var4.read();
         var4.close();
      } catch (Exception var5) {
      }

   }

   public static wc ar(Throwable var0, String var1) {
      wc var2;
      if (var0 instanceof wc) {
         var2 = (wc)var0;
         var2.aq = var2.aq + ' ' + var1;
      } else {
         var2 = new wc(var0, var1);
      }

      return var2;
   }

   static String al(Throwable var0) throws IOException {
      String var1;
      if (var0 instanceof wc) {
         wc var2 = (wc)var0;
         var1 = var2.aq + " | ";
         var0 = var2.af;
      } else {
         var1 = "";
      }

      StringWriter var12 = new StringWriter();
      PrintWriter var3 = new PrintWriter(var12);
      var0.printStackTrace(var3);
      var3.close();
      String var4 = var12.toString();
      BufferedReader var5 = new BufferedReader(new StringReader(var4));
      String var6 = var5.readLine();

      while(true) {
         while(true) {
            String var7 = var5.readLine();
            if (var7 == null) {
               var1 = var1 + "| " + var6;
               return var1;
            }

            int var8 = var7.indexOf(40);
            int var9 = var7.indexOf(41, 1 + var8);
            if (var8 >= 0 && var9 >= 0) {
               String var10 = var7.substring(1 + var8, var9);
               int var11 = var10.indexOf(".java:");
               if (var11 >= 0) {
                  var10 = var10.substring(0, var11) + var10.substring(5 + var11);
                  var1 = var1 + var10 + ' ';
                  continue;
               }

               var7 = var7.substring(0, var8);
            }

            var7 = var7.trim();
            var7 = var7.substring(var7.lastIndexOf(32) + 1);
            var7 = var7.substring(var7.lastIndexOf(9) + 1);
            var1 = var1 + var7 + ' ';
         }
      }
   }

   wc(Throwable var1, String var2) {
      try {
         super();
         this.aq = var2;
         this.af = var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "wc.<init>(" + ')');
      }
   }

   static String ad(Throwable var0) throws IOException {
      String var1;
      if (var0 instanceof wc) {
         wc var2 = (wc)var0;
         var1 = var2.aq + " | ";
         var0 = var2.af;
      } else {
         var1 = "";
      }

      StringWriter var12 = new StringWriter();
      PrintWriter var3 = new PrintWriter(var12);
      var0.printStackTrace(var3);
      var3.close();
      String var4 = var12.toString();
      BufferedReader var5 = new BufferedReader(new StringReader(var4));
      String var6 = var5.readLine();

      while(true) {
         while(true) {
            String var7 = var5.readLine();
            if (var7 == null) {
               var1 = var1 + "| " + var6;
               return var1;
            }

            int var8 = var7.indexOf(40);
            int var9 = var7.indexOf(41, 1 + var8);
            if (var8 >= 0 && var9 >= 0) {
               String var10 = var7.substring(1 + var8, var9);
               int var11 = var10.indexOf(".java:");
               if (var11 >= 0) {
                  var10 = var10.substring(0, var11) + var10.substring(5 + var11);
                  var1 = var1 + var10 + -215754112;
                  continue;
               }

               var7 = var7.substring(0, var8);
            }

            var7 = var7.trim();
            var7 = var7.substring(var7.lastIndexOf(32) + 1);
            var7 = var7.substring(var7.lastIndexOf(9) + 1);
            var1 = var1 + var7 + ' ';
         }
      }
   }

   static String ah(Throwable var0) throws IOException {
      String var1;
      if (var0 instanceof wc) {
         wc var2 = (wc)var0;
         var1 = var2.aq + " | ";
         var0 = var2.af;
      } else {
         var1 = "";
      }

      StringWriter var12 = new StringWriter();
      PrintWriter var3 = new PrintWriter(var12);
      var0.printStackTrace(var3);
      var3.close();
      String var4 = var12.toString();
      BufferedReader var5 = new BufferedReader(new StringReader(var4));
      String var6 = var5.readLine();

      while(true) {
         while(true) {
            String var7 = var5.readLine();
            if (var7 == null) {
               var1 = var1 + "| " + var6;
               return var1;
            }

            int var8 = var7.indexOf(40);
            int var9 = var7.indexOf(41, 1 + var8);
            if (var8 >= 0 && var9 >= 0) {
               String var10 = var7.substring(1 + var8, var9);
               int var11 = var10.indexOf(".java:");
               if (var11 >= 0) {
                  var10 = var10.substring(0, var11) + var10.substring(5 + var11);
                  var1 = var1 + var10 + ' ';
                  continue;
               }

               var7 = var7.substring(0, var8);
            }

            var7 = var7.trim();
            var7 = var7.substring(var7.lastIndexOf(32) + 1);
            var7 = var7.substring(var7.lastIndexOf(9) + 1);
            var1 = var1 + var7 + ' ';
         }
      }
   }
}
