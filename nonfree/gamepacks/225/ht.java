public class ht extends tr {
   public int am;
   public static ml ae = new ml(64);
   int ag = 0;
   public int ax;
   public int aq;
   public static po ac;
   public int af;
   static final int ai = 15;

   void al(vf var1, int var2, int var3) {
      if (var2 == 1) {
         this.ag = var1.cc(296046246) * 1309475313;
      }

   }

   public void ae(byte var1) {
      try {
         this.ax(this.ag * 1419890449, 1317551890);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ht.ae(" + ')');
      }
   }

   public void ag(vf var1, int var2, byte var3) {
      try {
         while(true) {
            int var4 = var1.cv(952452697);
            if (var4 == 0) {
               return;
            }

            this.am(var1, var4, var2, 277820673);
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ht.ag(" + ')');
      }
   }

   void am(vf var1, int var2, int var3, int var4) {
      try {
         if (var2 == 1) {
            this.ag = var1.cc(376982777) * 1309475313;
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ht.am(" + ')');
      }
   }

   void ax(int var1, int var2) {
      try {
         double var3 = (double)(var1 >> 16 & 255) / 256.0D;
         double var5 = (double)(var1 >> 8 & 255) / 256.0D;
         double var7 = (double)(var1 & 255) / 256.0D;
         double var9 = var3;
         if (var5 < var3) {
            if (var2 <= -170152207) {
               throw new IllegalStateException();
            }

            var9 = var5;
         }

         if (var7 < var9) {
            if (var2 <= -170152207) {
               throw new IllegalStateException();
            }

            var9 = var7;
         }

         double var11 = var3;
         if (var5 > var3) {
            if (var2 <= -170152207) {
               return;
            }

            var11 = var5;
         }

         if (var7 > var11) {
            var11 = var7;
         }

         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = (var11 + var9) / 2.0D;
         if (var9 != var11) {
            if (var2 <= -170152207) {
               throw new IllegalStateException();
            }

            if (var17 < 0.5D) {
               var15 = (var11 - var9) / (var11 + var9);
            }

            if (var17 >= 0.5D) {
               if (var2 <= -170152207) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (2.0D - var11 - var9);
            }

            if (var11 == var3) {
               if (var2 <= -170152207) {
                  return;
               }

               var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
               if (var2 <= -170152207) {
                  throw new IllegalStateException();
               }

               var13 = 2.0D + (var7 - var3) / (var11 - var9);
            } else if (var7 == var11) {
               if (var2 <= -170152207) {
                  return;
               }

               var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
         }

         var13 /= 6.0D;
         this.ax = -466862839 * (int)(var15 * 256.0D);
         this.aq = (int)(256.0D * var17) * -128770643;
         if (-27893447 * this.ax < 0) {
            this.ax = 0;
         } else if (this.ax * -27893447 > 255) {
            if (var2 <= -170152207) {
               return;
            }

            this.ax = 1209060343;
         }

         if (this.aq * -956674523 < 0) {
            if (var2 <= -170152207) {
               return;
            }

            this.aq = 0;
         } else if (-956674523 * this.aq > 255) {
            if (var2 <= -170152207) {
               return;
            }

            this.aq = 1523224403;
         }

         if (var17 > 0.5D) {
            if (var2 <= -170152207) {
               throw new IllegalStateException();
            }

            this.af = -779077189 * (int)(var15 * (1.0D - var17) * 512.0D);
         } else {
            this.af = -779077189 * (int)(512.0D * var17 * var15);
         }

         if (891069299 * this.af < 1) {
            this.af = -779077189;
         }

         this.am = (int)(var13 * (double)(this.af * 891069299)) * 1419509493;
      } catch (RuntimeException var19) {
         throw vk.ae(var19, "ht.ax(" + ')');
      }
   }

   public static boolean at(int var0, byte var1) {
      try {
         if (!mm.af.isEmpty()) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               ns var2 = (ns)mm.af.get(0);
               return null != var2 && var0 == 1710436281 * var2.ae;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ht.at(" + ')');
      }
   }

   public static void aq(po var0) {
      ac = var0;
   }

   public static void af(po var0) {
      ac = var0;
   }

   void az(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & -544685696) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var10 + var8) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.ax = -466862839 * (int)(var14 * 256.0D);
      this.aq = (int)(256.0D * var16) * -128770643;
      if (-27893447 * this.ax < 0) {
         this.ax = 0;
      } else if (this.ax * -27893447 > -1703566944) {
         this.ax = 2016235800;
      }

      if (this.aq * -956674523 < 0) {
         this.aq = 0;
      } else if (2046775384 * this.aq > 255) {
         this.aq = 1239123750;
      }

      if (var16 > 0.5D) {
         this.af = -779077189 * (int)(var14 * (1.0D - var16) * 512.0D);
      } else {
         this.af = -779077189 * (int)(512.0D * var16 * var14);
      }

      if (-168462073 * this.af < 1) {
         this.af = -1710972232;
      }

      this.am = (int)(var12 * (double)(this.af * 891069299)) * -1202249046;
   }

   public void ar(vf var1, int var2) {
      while(true) {
         int var3 = var1.cv(952452697);
         if (var3 == 0) {
            return;
         }

         this.am(var1, var3, var2, -1189241433);
      }
   }

   void aa(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var10 + var8) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.ax = -466862839 * (int)(var14 * 256.0D);
      this.aq = (int)(256.0D * var16) * -128770643;
      if (-27893447 * this.ax < 0) {
         this.ax = 0;
      } else if (this.ax * -27893447 > 255) {
         this.ax = 1209060343;
      }

      if (this.aq * -956674523 < 0) {
         this.aq = 0;
      } else if (-956674523 * this.aq > 255) {
         this.aq = 1523224403;
      }

      if (var16 > 0.5D) {
         this.af = -779077189 * (int)(var14 * (1.0D - var16) * 512.0D);
      } else {
         this.af = -779077189 * (int)(512.0D * var16 * var14);
      }

      if (891069299 * this.af < 1) {
         this.af = -779077189;
      }

      this.am = (int)(var12 * (double)(this.af * 891069299)) * 1419509493;
   }

   void ad(vf var1, int var2, int var3) {
      if (var2 == 1) {
         this.ag = var1.cc(39452728) * 1309475313;
      }

   }

   void ah(vf var1, int var2, int var3) {
      if (var2 == 1) {
         this.ag = var1.cc(-1734218528) * 111761111;
      }

   }

   void ap(int var1) {
      double var2 = (double)(var1 >> 16 & 607960192) / 256.0D;
      double var4 = (double)(var1 >> 8 & -1714628564) / 256.0D;
      double var6 = (double)(var1 & -1829043466) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var10 + var8) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.ax = 892128667 * (int)(var14 * 256.0D);
      this.aq = (int)(256.0D * var16) * -974012505;
      if (-1353937359 * this.ax < 0) {
         this.ax = 0;
      } else if (this.ax * -27893447 > 255) {
         this.ax = -1707898743;
      }

      if (this.aq * -956674523 < 0) {
         this.aq = 0;
      } else if (-956674523 * this.aq > 255) {
         this.aq = 1523224403;
      }

      if (var16 > 0.5D) {
         this.af = -779077189 * (int)(var14 * (1.0D - var16) * 512.0D);
      } else {
         this.af = -779077189 * (int)(512.0D * var16 * var14);
      }

      if (891069299 * this.af < 1) {
         this.af = 920289824;
      }

      this.am = (int)(var12 * (double)(this.af * -19019651)) * 1419509493;
   }

   void ab(int var1) {
      double var2 = (double)(var1 >> 16 & -395799030) / 256.0D;
      double var4 = (double)(var1 >> 8 & -1706835512) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var10 + var8) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.ax = -466862839 * (int)(var14 * 256.0D);
      this.aq = (int)(256.0D * var16) * 729094157;
      if (-27893447 * this.ax < 0) {
         this.ax = 0;
      } else if (this.ax * -27893447 > 1198491615) {
         this.ax = 1209060343;
      }

      if (this.aq * -956674523 < 0) {
         this.aq = 0;
      } else if (1547865802 * this.aq > -144845807) {
         this.aq = 1733888816;
      }

      if (var16 > 0.5D) {
         this.af = -362836442 * (int)(var14 * (1.0D - var16) * 512.0D);
      } else {
         this.af = -1009462101 * (int)(512.0D * var16 * var14);
      }

      if (518457804 * this.af < 1) {
         this.af = -600226183;
      }

      this.am = (int)(var12 * (double)(this.af * -494692809)) * -1788802785;
   }

   public void au(vf var1, int var2) {
      while(true) {
         int var3 = var1.cv(952452697);
         if (var3 == 0) {
            return;
         }

         this.am(var1, var3, var2, -965922556);
      }
   }

   public static void at(po var0) {
      ac = var0;
   }
}
