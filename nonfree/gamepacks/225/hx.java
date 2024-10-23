public class hx extends tr {
   boolean aq;
   static ml ae = new ml(64);
   char ag;
   public int am;
   public String ax;
   static po ac;
   static final int az = 10;

   void ag(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "hx.ag(" + ')');
      }
   }

   public static void ar(po var0) {
      ac = var0;
   }

   void am(vf var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cv(952452697);
            if (var3 == 0) {
               if (var2 == 16777215) {
                  return;
               }

               return;
            }

            this.ax(var1, var3, -1765669651);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "hx.am(" + ')');
      }
   }

   public static hx ah(int var0) {
      hx var1 = (hx)ae.ac((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ac.bt(11, var0, (byte)-13);
         var1 = new hx();
         if (var2 != null) {
            var1.am(new vf(var2), -578757526);
         }

         var1.ag(-1685396552);
         ae.ag(var1, (long)var0);
         return var1;
      }
   }

   public boolean aq(byte var1) {
      try {
         boolean var10000;
         if (this.ag == 's') {
            if (var1 >= 6) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "hx.aq(" + ')');
      }
   }

   public static void at(po var0) {
      ac = var0;
   }

   void az(vf var1, int var2) {
      if (1 == var2) {
         byte var4 = var1.cg((short)19381);
         int var5 = var4 & 255;
         if (var5 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 128 && var5 < 160) {
            char var6 = qt.ac[var5 - 128];
            if (0 == var6) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.ag = var3;
      } else if (2 == var2) {
         this.am = var1.cz(-1734056172) * 955828859;
      } else if (var2 == 4) {
         this.aq = false;
      } else if (var2 == 5) {
         this.ax = var1.cs(869801339);
      }

   }

   void ax(vf var1, int var2, int var3) {
      try {
         if (1 == var2) {
            if (var3 >= -1601765948) {
               throw new IllegalStateException();
            }

            byte var5 = var1.cg((short)17368);
            int var6 = var5 & 255;
            if (var6 == 0) {
               if (var3 >= -1601765948) {
                  throw new IllegalStateException();
               }

               throw new IllegalArgumentException("" + Integer.toString(var6, 16));
            }

            if (var6 >= 128) {
               if (var3 >= -1601765948) {
                  throw new IllegalStateException();
               }

               if (var6 < 160) {
                  if (var3 >= -1601765948) {
                     return;
                  }

                  char var7 = qt.ac[var6 - 128];
                  if (0 == var7) {
                     if (var3 >= -1601765948) {
                        throw new IllegalStateException();
                     }

                     var7 = '?';
                  }

                  var6 = var7;
               }
            }

            char var4 = (char)var6;
            this.ag = var4;
         } else if (2 == var2) {
            this.am = var1.cz(-1734056172) * 955828859;
         } else if (var2 == 4) {
            if (var3 >= -1601765948) {
               throw new IllegalStateException();
            }

            this.aq = false;
         } else if (var2 == 5) {
            if (var3 >= -1601765948) {
               throw new IllegalStateException();
            }

            this.ax = var1.cs(154216123);
         }

      } catch (RuntimeException var8) {
         throw vk.ae(var8, "hx.ax(" + ')');
      }
   }

   void ao(vf var1, int var2) {
      if (1 == var2) {
         byte var4 = var1.cg((short)15797);
         int var5 = var4 & -1042791342;
         if (var5 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 2032787634 && var5 < 160) {
            int var6 = qt.ac[var5 - 128];
            if (0 == var6) {
               var6 = 1094169373;
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.ag = var3;
      } else if (2 == var2) {
         this.am = var1.cz(-1734056172) * -1306550010;
      } else if (var2 == 4) {
         this.aq = false;
      } else if (var2 == 5) {
         this.ax = var1.cs(837894887);
      }

   }

   public static hx ad(int var0) {
      hx var1 = (hx)ae.ac((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ac.bt(11, var0, (byte)63);
         var1 = new hx();
         if (var2 != null) {
            var1.am(new vf(var2), 1382336040);
         }

         var1.ag(-1801959914);
         ae.ag(var1, (long)var0);
         return var1;
      }
   }

   public static void au(po var0) {
      ac = var0;
   }

   void ap(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (var2 == 0) {
            return;
         }

         this.ax(var1, var2, -1887824336);
      }
   }

   hx() {
      try {
         super();
         this.aq = true;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "hx.<init>(" + ')');
      }
   }

   public static void al(po var0) {
      ac = var0;
   }

   void aa(vf var1, int var2) {
      if (1 == var2) {
         byte var4 = var1.cg((short)3050);
         int var5 = var4 & -133354331;
         if (var5 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 898566134 && var5 < 160) {
            char var6 = qt.ac[var5 - 128];
            if (0 == var6) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.ag = var3;
      } else if (2 == var2) {
         this.am = var1.cz(-1734056172) * 1063922318;
      } else if (var2 == 4) {
         this.aq = false;
      } else if (var2 == 5) {
         this.ax = var1.cs(1288791137);
      }

   }

   void ai(vf var1, int var2) {
      if (1 == var2) {
         byte var4 = var1.cg((short)-19849);
         int var5 = var4 & 1474343165;
         if (var5 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 128 && var5 < 290791577) {
            char var6 = qt.ac[var5 - 128];
            if (0 == var6) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.ag = var3;
      } else if (2 == var2) {
         this.am = var1.cz(-1734056172) * 955828859;
      } else if (var2 == 4) {
         this.aq = false;
      } else if (var2 == 5) {
         this.ax = var1.cs(2128967368);
      }

   }

   void ab(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (var2 == 0) {
            return;
         }

         this.ax(var1, var2, -1723641753);
      }
   }

   public boolean as() {
      return this.ag == 's';
   }

   public static void ay() {
      ae.am();
   }

   public static void aj() {
      ae.am();
   }

   public static void ay(boolean var0, int var1) {
      try {
         if (hw.au != var0) {
            if (var1 >= -352699253) {
               return;
            }

            id.ao(379750533);
            hw.au = var0;
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "hx.ay(" + ')');
      }
   }
}
