public class to implements tu {
   static final int ap = 0;
   static final String aw = "\\.";
   int aj;
   int ai;
   int ay;
   static vc dl;

   void ao(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.aj = Integer.parseInt(var2[0]) * 1454796429;
         this.ai = Integer.parseInt(var2[1]) * 217031183;
         this.ay = Integer.parseInt(var2[2]) * -110382583;
      } catch (Exception var4) {
      }

   }

   public ta ap(int var1) {
      try {
         byte var2;
         if (hg.av.startsWith("win")) {
            if (var1 >= 209530664) {
               throw new IllegalStateException();
            }

            var2 = 1;
         } else if (hg.av.startsWith("mac")) {
            var2 = 2;
         } else if (hg.av.startsWith("linux")) {
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
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               if (!var3.startsWith("x86_64")) {
                  var7 = false;
                  break label244;
               }

               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }
            }

            var7 = true;
         }

         byte var8 = 0;
         if (var2 == 1) {
            if (var1 >= 209530664) {
               throw new IllegalStateException();
            }

            if (var4.indexOf("4.0") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 1;
            } else if (var4.indexOf("4.1") != -1) {
               var8 = 2;
            } else if (var4.indexOf("4.9") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 3;
            } else if (var4.indexOf("5.0") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 4;
            } else if (var4.indexOf("5.1") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 5;
            } else if (var4.indexOf("5.2") != -1) {
               var8 = 8;
            } else if (var4.indexOf("6.0") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 6;
            } else if (var4.indexOf("6.1") != -1) {
               var8 = 7;
            } else if (var4.indexOf("6.2") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 9;
            } else if (var4.indexOf("6.3") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 10;
            } else if (var4.indexOf("10.0") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 11;
            }
         } else if (var2 == 2) {
            if (var1 >= 209530664) {
               throw new IllegalStateException();
            }

            if (var4.indexOf("10.4") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 20;
            } else if (var4.indexOf("10.5") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 21;
            } else if (var4.indexOf("10.6") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 22;
            } else if (var4.indexOf("10.7") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 23;
            } else if (var4.indexOf("10.8") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 24;
            } else if (var4.indexOf("10.9") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 25;
            } else if (var4.indexOf("10.10") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 26;
            } else if (var4.indexOf("10.11") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 27;
            } else if (var4.indexOf("10.12") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 28;
            } else if (var4.indexOf("10.13") != -1) {
               if (var1 >= 209530664) {
                  throw new IllegalStateException();
               }

               var8 = 29;
            }
         }

         byte var9;
         if (var5.toLowerCase().indexOf("sun") != -1) {
            if (var1 >= 209530664) {
               throw new IllegalStateException();
            }

            var9 = 1;
         } else if (var5.toLowerCase().indexOf("microsoft") != -1) {
            if (var1 >= 209530664) {
               throw new IllegalStateException();
            }

            var9 = 2;
         } else if (var5.toLowerCase().indexOf("apple") != -1) {
            if (var1 >= 209530664) {
               throw new IllegalStateException();
            }

            var9 = 3;
         } else if (var5.toLowerCase().indexOf("oracle") != -1) {
            if (var1 >= 209530664) {
               throw new IllegalStateException();
            }

            var9 = 5;
         } else {
            var9 = 4;
         }

         this.aw(var6, 131584372);
         boolean var10 = false;
         int var11 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
         int var12;
         if (302122053 * this.aj > 3) {
            if (var1 >= 209530664) {
               throw new IllegalStateException();
            }

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
         return new ta(var2, var7, var8, var9, this.aj * 302122053, 660671727 * this.ai, 1958837305 * this.ay, false, var11, var12, var13, 0, var14, var15, var16, var17, 0, 0, 0, 0, var18, var19, var24, 0, "", "", var28);
      } catch (RuntimeException var33) {
         throw tm.aw(var33, "to.ap(" + ')');
      }
   }

   void aw(String var1, int var2) {
      try {
         if (var1.startsWith("1.")) {
            if (var2 != 131584372) {
               throw new IllegalStateException();
            }

            this.ak(var1, (byte)116);
         } else {
            this.aj(var1, (byte)-44);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "to.aw(" + ')');
      }
   }

   void ak(String var1, byte var2) {
      try {
         String[] var3 = var1.split("\\.");

         try {
            this.aj = Integer.parseInt(var3[1]) * 1454796429;
            var3 = var3[2].split("_");
            this.ai = Integer.parseInt(var3[0]) * 217031183;
            this.ay = Integer.parseInt(var3[1]) * -110382583;
         } catch (Exception var5) {
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "to.ak(" + ')');
      }
   }

   void aj(String var1, byte var2) {
      try {
         String[] var3 = var1.split("\\.");

         try {
            this.aj = Integer.parseInt(var3[0]) * 1454796429;
            this.ai = Integer.parseInt(var3[1]) * 217031183;
            this.ay = Integer.parseInt(var3[2]) * -110382583;
         } catch (Exception var5) {
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "to.aj(" + ')');
      }
   }

   public ta ai() {
      byte var1;
      if (hg.av.startsWith("win")) {
         var1 = 1;
      } else if (hg.av.startsWith("mac")) {
         var1 = 2;
      } else if (hg.av.startsWith("linux")) {
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
      if (var1 == 1) {
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
      } else if (var1 == 2) {
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

      this.aw(var5, 131584372);
      boolean var9 = false;
      int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var11;
      if (302122053 * this.aj > 3) {
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
      return new ta(var1, var6, var7, var8, this.aj * 302122053, 943445587 * this.ai, -115827336 * this.ay, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "", "", var27);
   }

   public ta ay() {
      byte var1;
      if (hg.av.startsWith("win")) {
         var1 = 1;
      } else if (hg.av.startsWith("mac")) {
         var1 = 2;
      } else if (hg.av.startsWith("linux")) {
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
      if (var1 == 1) {
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
      } else if (var1 == 2) {
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

      this.aw(var5, 131584372);
      boolean var9 = false;
      int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var11;
      if (302122053 * this.aj > 3) {
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
      return new ta(var1, var6, var7, var8, this.aj * 302122053, 660671727 * this.ai, 1958837305 * this.ay, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "", "", var27);
   }

   void af(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.aj = Integer.parseInt(var2[0]) * 1454796429;
         this.ai = Integer.parseInt(var2[1]) * 217031183;
         this.ay = Integer.parseInt(var2[2]) * -110382583;
      } catch (Exception var4) {
      }

   }

   void ae(String var1) {
      if (var1.startsWith("1.")) {
         this.ak(var1, (byte)93);
      } else {
         this.aj(var1, (byte)-85);
      }

   }

   void am(String var1) {
      if (var1.startsWith("1.")) {
         this.ak(var1, (byte)126);
      } else {
         this.aj(var1, (byte)24);
      }

   }

   void an(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.aj = Integer.parseInt(var2[1]) * 1454796429;
         var2 = var2[2].split("_");
         this.ai = Integer.parseInt(var2[0]) * 217031183;
         this.ay = Integer.parseInt(var2[1]) * -110382583;
      } catch (Exception var4) {
      }

   }

   void as(String var1) {
      if (var1.startsWith("1.")) {
         this.ak(var1, (byte)118);
      } else {
         this.aj(var1, (byte)-40);
      }

   }

   void au(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.aj = Integer.parseInt(var2[1]) * 1454796429;
         var2 = var2[2].split("_");
         this.ai = Integer.parseInt(var2[0]) * 217031183;
         this.ay = Integer.parseInt(var2[1]) * -110382583;
      } catch (Exception var4) {
      }

   }

   void at(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.aj = Integer.parseInt(var2[1]) * -289127744;
         var2 = var2[2].split("_");
         this.ai = Integer.parseInt(var2[0]) * 217031183;
         this.ay = Integer.parseInt(var2[1]) * 150536387;
      } catch (Exception var4) {
      }

   }
}