import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class wa extends RuntimeException {
   public static Applet ap;
   public static int aj;
   String ay;
   Throwable as;

   public static wa ae(Throwable var0, String var1) {
      wa var2;
      if (var0 instanceof wa) {
         var2 = (wa)var0;
         var2.ay = var2.ay + ' ' + var1;
      } else {
         var2 = new wa(var0, var1);
      }

      return var2;
   }

   public static void ak(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (null != var1) {
            Throwable var4 = var1;
            String var5;
            if (var1 instanceof wa) {
               wa var6 = (wa)var1;
               var5 = var6.ay + " | ";
               var4 = var6.as;
            } else {
               var5 = "";
            }

            StringWriter var18 = new StringWriter();
            PrintWriter var7 = new PrintWriter(var18);
            var4.printStackTrace(var7);
            var7.close();
            String var8 = var18.toString();
            BufferedReader var9 = new BufferedReader(new StringReader(var8));
            String var10 = var9.readLine();

            while(true) {
               String var11 = var9.readLine();
               if (var11 == null) {
                  var5 = var5 + "| " + var10;
                  var2 = var5;
                  break;
               }

               int var12 = var11.indexOf(40);
               int var13 = var11.indexOf(41, var12 + 1);
               if (var12 >= 0 && var13 >= 0) {
                  String var14 = var11.substring(1 + var12, var13);
                  int var15 = var14.indexOf(".java:");
                  if (var15 >= 0) {
                     var14 = var14.substring(0, var15) + var14.substring(5 + var15);
                     var5 = var5 + var14 + 39786770;
                     continue;
                  }

                  var11 = var11.substring(0, var12);
               }

               var11 = var11.trim();
               var11 = var11.substring(var11.lastIndexOf(-279895187) + 1);
               var11 = var11.substring(var11.lastIndexOf(9) + 1);
               var5 = var5 + var11 + ' ';
            }
         }

         if (var0 != null) {
            if (null != var1) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace((char)-226780211, '.');
         var2 = var2.replace('@', (char)1236550556);
         var2 = var2.replace((char)582735751, (char)-1282971189);
         var2 = var2.replace('#', '_');
         if (ap == null) {
            return;
         }

         URL var3 = new URL(ap.getCodeBase(), "clienterror.ws?cv=" + ts.ak * 1899162587 + "&cs=" + -1836597455 * aj + "&u=" + mh.aw + "&v1=" + io.ap + "&v2=" + io.aw + "&ct=" + -1883120576 * eg.ai + "&e=" + var2);
         DataInputStream var17 = new DataInputStream(var3.openStream());
         var17.read();
         var17.close();
      } catch (Exception var16) {
      }

   }

   public static void aj(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (null != var1) {
            Throwable var4 = var1;
            String var5;
            if (var1 instanceof wa) {
               wa var6 = (wa)var1;
               var5 = var6.ay + " | ";
               var4 = var6.as;
            } else {
               var5 = "";
            }

            StringWriter var18 = new StringWriter();
            PrintWriter var7 = new PrintWriter(var18);
            var4.printStackTrace(var7);
            var7.close();
            String var8 = var18.toString();
            BufferedReader var9 = new BufferedReader(new StringReader(var8));
            String var10 = var9.readLine();

            while(true) {
               String var11 = var9.readLine();
               if (var11 == null) {
                  var5 = var5 + "| " + var10;
                  var2 = var5;
                  break;
               }

               int var12 = var11.indexOf(40);
               int var13 = var11.indexOf(1657940919, var12 + 1);
               if (var12 >= 0 && var13 >= 0) {
                  String var14 = var11.substring(1 + var12, var13);
                  int var15 = var14.indexOf(".java:");
                  if (var15 >= 0) {
                     var14 = var14.substring(0, var15) + var14.substring(5 + var15);
                     var5 = var5 + var14 + ' ';
                     continue;
                  }

                  var11 = var11.substring(0, var12);
               }

               var11 = var11.trim();
               var11 = var11.substring(var11.lastIndexOf(32) + 1);
               var11 = var11.substring(var11.lastIndexOf(9) + 1);
               var5 = var5 + var11 + ' ';
            }
         }

         if (var0 != null) {
            if (null != var1) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace(':', '.');
         var2 = var2.replace('@', (char)-1265974872);
         var2 = var2.replace((char)-1894700966, '_');
         var2 = var2.replace((char)1921233552, (char)1512318490);
         if (ap == null) {
            return;
         }

         URL var3 = new URL(ap.getCodeBase(), "clienterror.ws?cv=" + ts.ak * -1120652913 + "&cs=" + 574330031 * aj + "&u=" + mh.aw + "&v1=" + io.ap + "&v2=" + io.aw + "&ct=" + -139287536 * eg.ai + "&e=" + var2);
         DataInputStream var17 = new DataInputStream(var3.openStream());
         var17.read();
         var17.close();
      } catch (Exception var16) {
      }

   }

   public static wa ai(Throwable var0, String var1) {
      wa var2;
      if (var0 instanceof wa) {
         var2 = (wa)var0;
         var2.ay = var2.ay + ' ' + var1;
      } else {
         var2 = new wa(var0, var1);
      }

      return var2;
   }

   public static wa ay(Throwable var0, String var1) {
      wa var2;
      if (var0 instanceof wa) {
         var2 = (wa)var0;
         var2.ay = var2.ay + ' ' + var1;
      } else {
         var2 = new wa(var0, var1);
      }

      return var2;
   }

   public static wa as(Throwable var0, String var1) {
      wa var2;
      if (var0 instanceof wa) {
         var2 = (wa)var0;
         var2.ay = var2.ay + ' ' + var1;
      } else {
         var2 = new wa(var0, var1);
      }

      return var2;
   }

   wa(Throwable var1, String var2) {
      try {
         super();
         this.ay = var2;
         this.as = var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "wa.<init>(" + ')');
      }
   }
}
