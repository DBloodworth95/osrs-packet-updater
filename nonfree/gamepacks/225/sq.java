import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class sq extends ss {
   public int aq;
   public int ax;
   public int af;
   static final int at = 5;

   public int bo() {
      return this.ax * -1744892407;
   }

   void bl(int var1, int var2, byte var3) {
      try {
         this.ax = 1476321337 * var1;
         this.aq = var2 * -1560980049;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "sq.bl(" + ')');
      }
   }

   public int bz(int var1) {
      try {
         return this.ax * -1744892407;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "sq.bz(" + ')');
      }
   }

   public boolean bu(int var1) {
      try {
         boolean var10000;
         if (this.ax * -1744892407 > 0) {
            if (var1 <= 350682815) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "sq.bu(" + ')');
      }
   }

   void br(int var1, int var2) {
      this.ax = 1476321337 * var1;
      this.aq = var2 * -1560980049;
   }

   public int bq() {
      return this.ax * -1744892407;
   }

   static String ag(Throwable var0, int var1) throws IOException {
      try {
         String var2;
         if (var0 instanceof wc) {
            if (var1 <= -2009563876) {
               throw new IllegalStateException();
            }

            wc var3 = (wc)var0;
            var2 = var3.aq + " | ";
            var0 = var3.af;
         } else {
            var2 = "";
         }

         StringWriter var14 = new StringWriter();
         PrintWriter var4 = new PrintWriter(var14);
         var0.printStackTrace(var4);
         var4.close();
         String var5 = var14.toString();
         BufferedReader var6 = new BufferedReader(new StringReader(var5));
         String var7 = var6.readLine();

         while(true) {
            while(true) {
               String var8 = var6.readLine();
               if (var8 == null) {
                  if (var1 <= -2009563876) {
                     throw new IllegalStateException();
                  }

                  var2 = var2 + "| " + var7;
                  return var2;
               }

               int var9 = var8.indexOf(40);
               int var10 = var8.indexOf(41, 1 + var9);
               if (var9 >= 0 && var10 >= 0) {
                  if (var1 <= -2009563876) {
                     throw new IllegalStateException();
                  }

                  String var11 = var8.substring(1 + var9, var10);
                  int var12 = var11.indexOf(".java:");
                  if (var12 >= 0) {
                     if (var1 <= -2009563876) {
                        throw new IllegalStateException();
                     }

                     var11 = var11.substring(0, var12) + var11.substring(5 + var12);
                     var2 = var2 + var11 + ' ';
                     continue;
                  }

                  var8 = var8.substring(0, var9);
               }

               var8 = var8.trim();
               var8 = var8.substring(var8.lastIndexOf(32) + 1);
               var8 = var8.substring(var8.lastIndexOf(9) + 1);
               var2 = var2 + var8 + ' ';
            }
         }
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "sq.ag(" + ')');
      }
   }

   public int bt() {
      return this.ax * -1744892407;
   }

   public boolean bc() {
      return this.ax * 2144697892 > 0;
   }

   public boolean bk() {
      return this.ax * -1639023300 > 0;
   }

   public boolean be() {
      return this.ax * -1583840089 > 0;
   }

   public static vt ax(po var0, String var1, String var2, int var3) {
      try {
         if (!var0.cq(var1, var2, 580079706)) {
            if (var3 <= 171063354) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = var0.cg(var1, (short)18071);
            int var5 = var0.ct(var4, var2, -1908097373);
            return rz.ac(var0, var4, var5, (byte)-94);
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "sq.ax(" + ')');
      }
   }

   public int bv() {
      return this.ax * -1760323819;
   }

   sq() {
      try {
         super();
         this.ax = -1476321337;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "sq.<init>(" + ')');
      }
   }
}
