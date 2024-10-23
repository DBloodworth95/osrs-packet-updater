public class tx implements tg {
   int aq;
   static final String ae = "\\.";
   int am;
   int ax;
   static final int ac = 0;

   void am(String var1, byte var2) {
      try {
         String[] var3 = var1.split("\\.");

         try {
            this.am = Integer.parseInt(var3[0]) * 2078828807;
            this.ax = Integer.parseInt(var3[1]) * -999230503;
            this.aq = Integer.parseInt(var3[2]) * 936920549;
         } catch (Exception var5) {
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "tx.am(" + ')');
      }
   }

   public tq ac(int var1) {
      try {
         byte var2;
         if (hr.ay.startsWith("win")) {
            if (var1 >= -133328350) {
               throw new IllegalStateException();
            }

            var2 = 1;
         } else if (hr.ay.startsWith("mac")) {
            if (var1 >= -133328350) {
               throw new IllegalStateException();
            }

            var2 = 2;
         } else if (hr.ay.startsWith("linux")) {
            var2 = 3;
         } else {
            var2 = 4;
         }

         String var3;
         try {
            var3 = System.getProperty("os.arch").toLowerCase();
         } catch (Exception var32) {
            var3 = "";
         }

         String var4;
         try {
            var4 = System.getProperty("os.version").toLowerCase();
         } catch (Exception var31) {
            var4 = "";
         }

         String var5 = "Unknown";
         String var6 = "1.1";

         try {
            var5 = System.getProperty("java.vendor");
            var6 = System.getProperty("java.version");
         } catch (Exception var30) {
         }

         boolean var7;
         label244: {
            if (!var3.startsWith("amd64")) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               if (!var3.startsWith("x86_64")) {
                  var7 = false;
                  break label244;
               }

               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }
            }

            var7 = true;
         }

         byte var8 = 0;
         if (1 == var2) {
            if (var1 >= -133328350) {
               throw new IllegalStateException();
            }

            if (var4.indexOf("4.0") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 1;
            } else if (var4.indexOf("4.1") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 2;
            } else if (var4.indexOf("4.9") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 3;
            } else if (var4.indexOf("5.0") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 4;
            } else if (var4.indexOf("5.1") != -1) {
               var8 = 5;
            } else if (var4.indexOf("5.2") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 8;
            } else if (var4.indexOf("6.0") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 6;
            } else if (var4.indexOf("6.1") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 7;
            } else if (var4.indexOf("6.2") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 9;
            } else if (var4.indexOf("6.3") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 10;
            } else if (var4.indexOf("10.0") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 11;
            }
         } else if (2 == var2) {
            if (var4.indexOf("10.4") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 20;
            } else if (var4.indexOf("10.5") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 21;
            } else if (var4.indexOf("10.6") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 22;
            } else if (var4.indexOf("10.7") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 23;
            } else if (var4.indexOf("10.8") != -1) {
               var8 = 24;
            } else if (var4.indexOf("10.9") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 25;
            } else if (var4.indexOf("10.10") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 26;
            } else if (var4.indexOf("10.11") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 27;
            } else if (var4.indexOf("10.12") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 28;
            } else if (var4.indexOf("10.13") != -1) {
               if (var1 >= -133328350) {
                  throw new IllegalStateException();
               }

               var8 = 29;
            }
         }

         byte var9;
         if (var5.toLowerCase().indexOf("sun") != -1) {
            if (var1 >= -133328350) {
               throw new IllegalStateException();
            }

            var9 = 1;
         } else if (var5.toLowerCase().indexOf("microsoft") != -1) {
            if (var1 >= -133328350) {
               throw new IllegalStateException();
            }

            var9 = 2;
         } else if (var5.toLowerCase().indexOf("apple") != -1) {
            if (var1 >= -133328350) {
               throw new IllegalStateException();
            }

            var9 = 3;
         } else if (var5.toLowerCase().indexOf("oracle") != -1) {
            if (var1 >= -133328350) {
               throw new IllegalStateException();
            }

            var9 = 5;
         } else {
            var9 = 4;
         }

         this.ae(var6, (byte)95);
         boolean var10 = false;
         int var11 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
         int var12;
         if (-136530761 * this.am > 3) {
            var12 = Runtime.getRuntime().availableProcessors();
         } else {
            var12 = 0;
         }

         byte var13 = 0;
         String var14 = "";
         String var15 = "";
         String var16 = "";
         String var17 = "";
         String var18 = "";
         String var19 = "";
         boolean var20 = false;
         boolean var21 = false;
         boolean var22 = false;
         boolean var23 = false;
         int[] var24 = new int[3];
         boolean var25 = false;
         String var26 = "";
         String var27 = "";
         String var28 = "";
         boolean var29 = false;
         return new tq(var2, var7, var8, var9, -136530761 * this.am, 1645894761 * this.ax, -184193043 * this.aq, false, var11, var12, var13, 0, var14, var15, var16, var17, 0, 0, 0, 0, var18, var19, var24, 0, "", "", var28);
      } catch (RuntimeException var33) {
         throw vk.ae(var33, "tx.ac(" + ')');
      }
   }

   void au(String var1) {
      if (var1.startsWith("1.")) {
         this.ag(var1, 2058790779);
      } else {
         this.am(var1, (byte)22);
      }

   }

   void ab(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.am = Integer.parseInt(var2[1]) * 2078828807;
         var2 = var2[2].split("_");
         this.ax = Integer.parseInt(var2[0]) * -999230503;
         this.aq = Integer.parseInt(var2[1]) * 936920549;
      } catch (Exception var4) {
      }

   }

   void ae(String var1, byte var2) {
      try {
         if (var1.startsWith("1.")) {
            if (var2 <= 12) {
               throw new IllegalStateException();
            }

            this.ag(var1, -1606680278);
         } else {
            this.am(var1, (byte)-39);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tx.ae(" + ')');
      }
   }

   public tq ax() {
      byte var1;
      if (hr.ay.startsWith("win")) {
         var1 = 1;
      } else if (hr.ay.startsWith("mac")) {
         var1 = 2;
      } else if (hr.ay.startsWith("linux")) {
         var1 = 3;
      } else {
         var1 = 4;
      }

      String var2;
      try {
         var2 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var31) {
         var2 = "";
      }

      String var3;
      try {
         var3 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var30) {
         var3 = "";
      }

      String var4 = "Unknown";
      String var5 = "1.1";

      try {
         var4 = System.getProperty("java.vendor");
         var5 = System.getProperty("java.version");
      } catch (Exception var29) {
      }

      boolean var6;
      if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
         var6 = false;
      } else {
         var6 = true;
      }

      byte var7 = 0;
      if (1 == var1) {
         if (var3.indexOf("4.0") != -1) {
            var7 = 1;
         } else if (var3.indexOf("4.1") != -1) {
            var7 = 2;
         } else if (var3.indexOf("4.9") != -1) {
            var7 = 3;
         } else if (var3.indexOf("5.0") != -1) {
            var7 = 4;
         } else if (var3.indexOf("5.1") != -1) {
            var7 = 5;
         } else if (var3.indexOf("5.2") != -1) {
            var7 = 8;
         } else if (var3.indexOf("6.0") != -1) {
            var7 = 6;
         } else if (var3.indexOf("6.1") != -1) {
            var7 = 7;
         } else if (var3.indexOf("6.2") != -1) {
            var7 = 9;
         } else if (var3.indexOf("6.3") != -1) {
            var7 = 10;
         } else if (var3.indexOf("10.0") != -1) {
            var7 = 11;
         }
      } else if (2 == var1) {
         if (var3.indexOf("10.4") != -1) {
            var7 = 20;
         } else if (var3.indexOf("10.5") != -1) {
            var7 = 21;
         } else if (var3.indexOf("10.6") != -1) {
            var7 = 22;
         } else if (var3.indexOf("10.7") != -1) {
            var7 = 23;
         } else if (var3.indexOf("10.8") != -1) {
            var7 = 24;
         } else if (var3.indexOf("10.9") != -1) {
            var7 = 25;
         } else if (var3.indexOf("10.10") != -1) {
            var7 = 26;
         } else if (var3.indexOf("10.11") != -1) {
            var7 = 27;
         } else if (var3.indexOf("10.12") != -1) {
            var7 = 28;
         } else if (var3.indexOf("10.13") != -1) {
            var7 = 29;
         }
      }

      byte var8;
      if (var4.toLowerCase().indexOf("sun") != -1) {
         var8 = 1;
      } else if (var4.toLowerCase().indexOf("microsoft") != -1) {
         var8 = 2;
      } else if (var4.toLowerCase().indexOf("apple") != -1) {
         var8 = 3;
      } else if (var4.toLowerCase().indexOf("oracle") != -1) {
         var8 = 5;
      } else {
         var8 = 4;
      }

      this.ae(var5, (byte)97);
      boolean var9 = false;
      int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var11;
      if (-136530761 * this.am > 3) {
         var11 = Runtime.getRuntime().availableProcessors();
      } else {
         var11 = 0;
      }

      byte var12 = 0;
      String var13 = "";
      String var14 = "";
      String var15 = "";
      String var16 = "";
      String var17 = "";
      String var18 = "";
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      boolean var22 = false;
      int[] var23 = new int[3];
      boolean var24 = false;
      String var25 = "";
      String var26 = "";
      String var27 = "";
      boolean var28 = false;
      return new tq(var1, var6, var7, var8, -136530761 * this.am, 1645894761 * this.ax, -184193043 * this.aq, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "", "", var27);
   }

   public tq aq() {
      byte var1;
      if (hr.ay.startsWith("win")) {
         var1 = 1;
      } else if (hr.ay.startsWith("mac")) {
         var1 = 2;
      } else if (hr.ay.startsWith("linux")) {
         var1 = 3;
      } else {
         var1 = 4;
      }

      String var2;
      try {
         var2 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var31) {
         var2 = "";
      }

      String var3;
      try {
         var3 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var30) {
         var3 = "";
      }

      String var4 = "Unknown";
      String var5 = "1.1";

      try {
         var4 = System.getProperty("java.vendor");
         var5 = System.getProperty("java.version");
      } catch (Exception var29) {
      }

      boolean var6;
      if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
         var6 = false;
      } else {
         var6 = true;
      }

      byte var7 = 0;
      if (1 == var1) {
         if (var3.indexOf("4.0") != -1) {
            var7 = 1;
         } else if (var3.indexOf("4.1") != -1) {
            var7 = 2;
         } else if (var3.indexOf("4.9") != -1) {
            var7 = 3;
         } else if (var3.indexOf("5.0") != -1) {
            var7 = 4;
         } else if (var3.indexOf("5.1") != -1) {
            var7 = 5;
         } else if (var3.indexOf("5.2") != -1) {
            var7 = 8;
         } else if (var3.indexOf("6.0") != -1) {
            var7 = 6;
         } else if (var3.indexOf("6.1") != -1) {
            var7 = 7;
         } else if (var3.indexOf("6.2") != -1) {
            var7 = 9;
         } else if (var3.indexOf("6.3") != -1) {
            var7 = 10;
         } else if (var3.indexOf("10.0") != -1) {
            var7 = 11;
         }
      } else if (2 == var1) {
         if (var3.indexOf("10.4") != -1) {
            var7 = 20;
         } else if (var3.indexOf("10.5") != -1) {
            var7 = 21;
         } else if (var3.indexOf("10.6") != -1) {
            var7 = 22;
         } else if (var3.indexOf("10.7") != -1) {
            var7 = 23;
         } else if (var3.indexOf("10.8") != -1) {
            var7 = 24;
         } else if (var3.indexOf("10.9") != -1) {
            var7 = 25;
         } else if (var3.indexOf("10.10") != -1) {
            var7 = 26;
         } else if (var3.indexOf("10.11") != -1) {
            var7 = 27;
         } else if (var3.indexOf("10.12") != -1) {
            var7 = 28;
         } else if (var3.indexOf("10.13") != -1) {
            var7 = 29;
         }
      }

      byte var8;
      if (var4.toLowerCase().indexOf("sun") != -1) {
         var8 = 1;
      } else if (var4.toLowerCase().indexOf("microsoft") != -1) {
         var8 = 2;
      } else if (var4.toLowerCase().indexOf("apple") != -1) {
         var8 = 3;
      } else if (var4.toLowerCase().indexOf("oracle") != -1) {
         var8 = 5;
      } else {
         var8 = 4;
      }

      this.ae(var5, (byte)68);
      boolean var9 = false;
      int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var11;
      if (-136530761 * this.am > 3) {
         var11 = Runtime.getRuntime().availableProcessors();
      } else {
         var11 = 0;
      }

      byte var12 = 0;
      String var13 = "";
      String var14 = "";
      String var15 = "";
      String var16 = "";
      String var17 = "";
      String var18 = "";
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      boolean var22 = false;
      int[] var23 = new int[3];
      boolean var24 = false;
      String var25 = "";
      String var26 = "";
      String var27 = "";
      boolean var28 = false;
      return new tq(var1, var6, var7, var8, -136530761 * this.am, 1645894761 * this.ax, -184193043 * this.aq, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "", "", var27);
   }

   public tq af() {
      byte var1;
      if (hr.ay.startsWith("win")) {
         var1 = 1;
      } else if (hr.ay.startsWith("mac")) {
         var1 = 2;
      } else if (hr.ay.startsWith("linux")) {
         var1 = 3;
      } else {
         var1 = 4;
      }

      String var2;
      try {
         var2 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var31) {
         var2 = "";
      }

      String var3;
      try {
         var3 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var30) {
         var3 = "";
      }

      String var4 = "Unknown";
      String var5 = "1.1";

      try {
         var4 = System.getProperty("java.vendor");
         var5 = System.getProperty("java.version");
      } catch (Exception var29) {
      }

      boolean var6;
      if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
         var6 = false;
      } else {
         var6 = true;
      }

      byte var7 = 0;
      if (1 == var1) {
         if (var3.indexOf("4.0") != -1) {
            var7 = 1;
         } else if (var3.indexOf("4.1") != -1) {
            var7 = 2;
         } else if (var3.indexOf("4.9") != -1) {
            var7 = 3;
         } else if (var3.indexOf("5.0") != -1) {
            var7 = 4;
         } else if (var3.indexOf("5.1") != -1) {
            var7 = 5;
         } else if (var3.indexOf("5.2") != -1) {
            var7 = 8;
         } else if (var3.indexOf("6.0") != -1) {
            var7 = 6;
         } else if (var3.indexOf("6.1") != -1) {
            var7 = 7;
         } else if (var3.indexOf("6.2") != -1) {
            var7 = 9;
         } else if (var3.indexOf("6.3") != -1) {
            var7 = 10;
         } else if (var3.indexOf("10.0") != -1) {
            var7 = 11;
         }
      } else if (2 == var1) {
         if (var3.indexOf("10.4") != -1) {
            var7 = 20;
         } else if (var3.indexOf("10.5") != -1) {
            var7 = 21;
         } else if (var3.indexOf("10.6") != -1) {
            var7 = 22;
         } else if (var3.indexOf("10.7") != -1) {
            var7 = 23;
         } else if (var3.indexOf("10.8") != -1) {
            var7 = 24;
         } else if (var3.indexOf("10.9") != -1) {
            var7 = 25;
         } else if (var3.indexOf("10.10") != -1) {
            var7 = 26;
         } else if (var3.indexOf("10.11") != -1) {
            var7 = 27;
         } else if (var3.indexOf("10.12") != -1) {
            var7 = 28;
         } else if (var3.indexOf("10.13") != -1) {
            var7 = 29;
         }
      }

      byte var8;
      if (var4.toLowerCase().indexOf("sun") != -1) {
         var8 = 1;
      } else if (var4.toLowerCase().indexOf("microsoft") != -1) {
         var8 = 2;
      } else if (var4.toLowerCase().indexOf("apple") != -1) {
         var8 = 3;
      } else if (var4.toLowerCase().indexOf("oracle") != -1) {
         var8 = 5;
      } else {
         var8 = 4;
      }

      this.ae(var5, (byte)84);
      boolean var9 = false;
      int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var11;
      if (350200315 * this.am > 3) {
         var11 = Runtime.getRuntime().availableProcessors();
      } else {
         var11 = 0;
      }

      byte var12 = 0;
      String var13 = "";
      String var14 = "";
      String var15 = "";
      String var16 = "";
      String var17 = "";
      String var18 = "";
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      boolean var22 = false;
      int[] var23 = new int[3];
      boolean var24 = false;
      String var25 = "";
      String var26 = "";
      String var27 = "";
      boolean var28 = false;
      return new tq(var1, var6, var7, var8, -136530761 * this.am, 1645894761 * this.ax, -184193043 * this.aq, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "", "", var27);
   }

   public tq at() {
      byte var1;
      if (hr.ay.startsWith("win")) {
         var1 = 1;
      } else if (hr.ay.startsWith("mac")) {
         var1 = 2;
      } else if (hr.ay.startsWith("linux")) {
         var1 = 3;
      } else {
         var1 = 4;
      }

      String var2;
      try {
         var2 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var31) {
         var2 = "";
      }

      String var3;
      try {
         var3 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var30) {
         var3 = "";
      }

      String var4 = "Unknown";
      String var5 = "1.1";

      try {
         var4 = System.getProperty("java.vendor");
         var5 = System.getProperty("java.version");
      } catch (Exception var29) {
      }

      boolean var6;
      if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
         var6 = false;
      } else {
         var6 = true;
      }

      byte var7 = 0;
      if (1 == var1) {
         if (var3.indexOf("4.0") != -1) {
            var7 = 1;
         } else if (var3.indexOf("4.1") != -1) {
            var7 = 2;
         } else if (var3.indexOf("4.9") != -1) {
            var7 = 3;
         } else if (var3.indexOf("5.0") != -1) {
            var7 = 4;
         } else if (var3.indexOf("5.1") != -1) {
            var7 = 5;
         } else if (var3.indexOf("5.2") != -1) {
            var7 = 8;
         } else if (var3.indexOf("6.0") != -1) {
            var7 = 6;
         } else if (var3.indexOf("6.1") != -1) {
            var7 = 7;
         } else if (var3.indexOf("6.2") != -1) {
            var7 = 9;
         } else if (var3.indexOf("6.3") != -1) {
            var7 = 10;
         } else if (var3.indexOf("10.0") != -1) {
            var7 = 11;
         }
      } else if (2 == var1) {
         if (var3.indexOf("10.4") != -1) {
            var7 = 20;
         } else if (var3.indexOf("10.5") != -1) {
            var7 = 21;
         } else if (var3.indexOf("10.6") != -1) {
            var7 = 22;
         } else if (var3.indexOf("10.7") != -1) {
            var7 = 23;
         } else if (var3.indexOf("10.8") != -1) {
            var7 = 24;
         } else if (var3.indexOf("10.9") != -1) {
            var7 = 25;
         } else if (var3.indexOf("10.10") != -1) {
            var7 = 26;
         } else if (var3.indexOf("10.11") != -1) {
            var7 = 27;
         } else if (var3.indexOf("10.12") != -1) {
            var7 = 28;
         } else if (var3.indexOf("10.13") != -1) {
            var7 = 29;
         }
      }

      byte var8;
      if (var4.toLowerCase().indexOf("sun") != -1) {
         var8 = 1;
      } else if (var4.toLowerCase().indexOf("microsoft") != -1) {
         var8 = 2;
      } else if (var4.toLowerCase().indexOf("apple") != -1) {
         var8 = 3;
      } else if (var4.toLowerCase().indexOf("oracle") != -1) {
         var8 = 5;
      } else {
         var8 = 4;
      }

      this.ae(var5, (byte)55);
      boolean var9 = false;
      int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var11;
      if (-1219711055 * this.am > 3) {
         var11 = Runtime.getRuntime().availableProcessors();
      } else {
         var11 = 0;
      }

      byte var12 = 0;
      String var13 = "";
      String var14 = "";
      String var15 = "";
      String var16 = "";
      String var17 = "";
      String var18 = "";
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      boolean var22 = false;
      int[] var23 = new int[3];
      boolean var24 = false;
      String var25 = "";
      String var26 = "";
      String var27 = "";
      boolean var28 = false;
      return new tq(var1, var6, var7, var8, -136530761 * this.am, 1645894761 * this.ax, -184193043 * this.aq, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "", "", var27);
   }

   void ad(String var1) {
      if (var1.startsWith("1.")) {
         this.ag(var1, 1035577395);
      } else {
         this.am(var1, (byte)60);
      }

   }

   void ar(String var1) {
      if (var1.startsWith("1.")) {
         this.ag(var1, -1404942442);
      } else {
         this.am(var1, (byte)6);
      }

   }

   void al(String var1) {
      if (var1.startsWith("1.")) {
         this.ag(var1, -1449582152);
      } else {
         this.am(var1, (byte)70);
      }

   }

   void ap(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.am = Integer.parseInt(var2[1]) * 2078828807;
         var2 = var2[2].split("_");
         this.ax = Integer.parseInt(var2[0]) * -999230503;
         this.aq = Integer.parseInt(var2[1]) * 936920549;
      } catch (Exception var4) {
      }

   }

   void ah(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.am = Integer.parseInt(var2[1]) * 2078828807;
         var2 = var2[2].split("_");
         this.ax = Integer.parseInt(var2[0]) * -999230503;
         this.aq = Integer.parseInt(var2[1]) * 936920549;
      } catch (Exception var4) {
      }

   }

   void ag(String var1, int var2) {
      try {
         String[] var3 = var1.split("\\.");

         try {
            this.am = Integer.parseInt(var3[1]) * 2078828807;
            var3 = var3[2].split("_");
            this.ax = Integer.parseInt(var3[0]) * -999230503;
            this.aq = Integer.parseInt(var3[1]) * 936920549;
         } catch (Exception var5) {
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "tx.ag(" + ')');
      }
   }

   void az(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.am = Integer.parseInt(var2[0]) * 2078828807;
         this.ax = Integer.parseInt(var2[1]) * -999230503;
         this.aq = Integer.parseInt(var2[2]) * 936920549;
      } catch (Exception var4) {
      }

   }

   void aa(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.am = Integer.parseInt(var2[0]) * 1467494271;
         this.ax = Integer.parseInt(var2[1]) * -999230503;
         this.aq = Integer.parseInt(var2[2]) * 936920549;
      } catch (Exception var4) {
      }

   }

   static void lg(ea var0, int var1) {
      try {
         var0.bw = var0.ac.at * 1315379239;
         var0.dy = var0.ac.by * -2027992663;
         var0.bb = 1429307313 * var0.ac.ap;
         var0.bi = 1603851417 * var0.ac.ab;
         var0.bg = var0.ac.az * 1827529877;
         var0.bl = var0.ac.aa * 1714859427;
         var0.bj = 166312247 * var0.ac.al;
         var0.bp = -1388655837 * var0.ac.ad;
         var0.by = 1989640693 * var0.ac.ah;
         var0.bz = 1587098743 * var0.ac.ai;
         var0.bu = -299059241 * var0.ac.ao;
         var0.br = 122448919 * var0.ac.as;
         var0.bo = -280384007 * var0.ac.ay;
         var0.bv = 1963234789 * var0.ac.aj;
         var0.bt = 1640633157 * var0.ac.av;
         var0.bq = 1737107423 * var0.ac.aw;
         var0.bk = var0.ac.an * -874651045;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tx.lg(" + ')');
      }
   }
}
