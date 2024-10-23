public class hv extends tp {
   public int ay;
   static mi aw = new mi(64);
   public int ai;
   public int aj;
   int ak;
   static pe ap;
   public int as;
   public static final int dd = 101;

   void af() {
      this.ay(this.ak * 1957422015, 2072899369);
   }

   void ak(int var1) {
      try {
         this.ay(this.ak * 1957422015, 1814525666);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "hv.ak(" + ')');
      }
   }

   void ay(int var1, int var2) {
      try {
         double var3 = (double)(var1 >> 16 & 255) / 256.0D;
         double var5 = (double)(var1 >> 8 & 255) / 256.0D;
         double var7 = (double)(var1 & 255) / 256.0D;
         double var9 = var3;
         if (var5 < var3) {
            var9 = var5;
         }

         if (var7 < var9) {
            if (var2 <= 1370079947) {
               return;
            }

            var9 = var7;
         }

         double var11 = var3;
         if (var5 > var3) {
            var11 = var5;
         }

         if (var7 > var11) {
            if (var2 <= 1370079947) {
               throw new IllegalStateException();
            }

            var11 = var7;
         }

         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = (var9 + var11) / 2.0D;
         if (var11 != var9) {
            if (var2 <= 1370079947) {
               throw new IllegalStateException();
            }

            if (var17 < 0.5D) {
               if (var2 <= 1370079947) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (var11 + var9);
            }

            if (var17 >= 0.5D) {
               if (var2 <= 1370079947) {
                  return;
               }

               var15 = (var11 - var9) / (2.0D - var11 - var9);
            }

            if (var3 == var11) {
               var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
               if (var2 <= 1370079947) {
                  return;
               }

               var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var11 == var7) {
               if (var2 <= 1370079947) {
                  throw new IllegalStateException();
               }

               var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
         }

         var13 /= 6.0D;
         this.ai = (int)(256.0D * var15) * -1417843563;
         this.ay = (int)(var17 * 256.0D) * 1092683143;
         if (-767557955 * this.ai < 0) {
            if (var2 <= 1370079947) {
               throw new IllegalStateException();
            }

            this.ai = 0;
         } else if (this.ai * -767557955 > 255) {
            if (var2 <= 1370079947) {
               throw new IllegalStateException();
            }

            this.ai = -772855701;
         }

         if (this.ay * 1473097783 < 0) {
            this.ay = 0;
         } else if (this.ay * 1473097783 > 255) {
            if (var2 <= 1370079947) {
               return;
            }

            this.ay = -538672775;
         }

         if (var17 > 0.5D) {
            if (var2 <= 1370079947) {
               throw new IllegalStateException();
            }

            this.as = (int)((1.0D - var17) * var15 * 512.0D) * 1482463269;
         } else {
            this.as = 1482463269 * (int)(512.0D * var17 * var15);
         }

         if (613794733 * this.as < 1) {
            this.as = 1482463269;
         }

         this.aj = 1254502631 * (int)(var13 * (double)(this.as * 613794733));
      } catch (RuntimeException var19) {
         throw tm.aw(var19, "hv.ay(" + ')');
      }
   }

   void ai(vl var1, int var2, int var3, int var4) {
      try {
         if (var2 == 1) {
            this.ak = var1.cx((byte)-14) * -830862273;
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "hv.ai(" + ')');
      }
   }

   public static hv au(int var0) {
      hv var1 = (hv)aw.ap((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ap.bm(1, var0, 760850487);
         var1 = new hv();
         if (var2 != null) {
            var1.aj(new vl(var2), var0, -975668992);
         }

         var1.ak(1090149106);
         aw.ak(var1, (long)var0);
         return var1;
      }
   }

   public static void ae(pe var0) {
      ap = var0;
   }

   void ao() {
      this.ay(this.ak * 1957422015, 1733478247);
   }

   public static hv at(int var0) {
      hv var1 = (hv)aw.ap((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ap.bm(1, var0, 1464154379);
         var1 = new hv();
         if (var2 != null) {
            var1.aj(new vl(var2), var0, -943658653);
         }

         var1.ak(1733072300);
         aw.ak(var1, (long)var0);
         return var1;
      }
   }

   void ab() {
      this.ay(this.ak * 1957422015, 1614704557);
   }

   public static hv an(int var0) {
      hv var1 = (hv)aw.ap((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ap.bm(1, var0, 1229155829);
         var1 = new hv();
         if (var2 != null) {
            var1.aj(new vl(var2), var0, -1083221419);
         }

         var1.ak(1358479278);
         aw.ak(var1, (long)var0);
         return var1;
      }
   }

   public static void aa() {
      aw.aj();
   }

   void av(vl var1, int var2, int var3) {
      if (var2 == 1) {
         this.ak = var1.cx((byte)-51) * -830862273;
      }

   }

   void ar() {
      this.ay(this.ak * 1957422015, 1926344251);
   }

   hv() {
      try {
         super();
         this.ak = 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "hv.<init>(" + ')');
      }
   }

   void az() {
      this.ay(this.ak * 1957422015, 1973743009);
   }

   void ag(vl var1, int var2) {
      while(true) {
         int var3 = var1.cy((short)-26646);
         if (var3 == 0) {
            return;
         }

         this.ai(var1, var3, var2, 1775400951);
      }
   }

   void ad(vl var1, int var2, int var3) {
      if (var2 == 1) {
         this.ak = var1.cx((byte)-102) * -830862273;
      }

   }

   void ac(vl var1, int var2, int var3) {
      if (var2 == 1) {
         this.ak = var1.cx((byte)-74) * -830862273;
      }

   }

   void aj(vl var1, int var2, int var3) {
      try {
         while(true) {
            int var4 = var1.cy((short)-13517);
            if (var4 == 0) {
               if (var3 >= 401175467) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ai(var1, var4, var2, 1775400951);
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "hv.aj(" + ')');
      }
   }

   void ax(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & -1580527300) / 256.0D;
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
      double var16 = (var8 + var10) / 2.0D;
      if (var10 != var8) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if (var10 == var6) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.ai = (int)(256.0D * var14) * 1132220182;
      this.ay = (int)(var16 * 256.0D) * 2000095181;
      if (74178102 * this.ai < 0) {
         this.ai = 0;
      } else if (this.ai * -767557955 > 255) {
         this.ai = -772855701;
      }

      if (this.ay * 1140334503 < 0) {
         this.ay = 0;
      } else if (this.ay * 1473097783 > 255) {
         this.ay = -575956294;
      }

      if (var16 > 0.5D) {
         this.as = (int)((1.0D - var16) * var14 * 512.0D) * -1388766700;
      } else {
         this.as = 1482463269 * (int)(512.0D * var16 * var14);
      }

      if (-427119310 * this.as < 1) {
         this.as = 1482463269;
      }

      this.aj = 1254502631 * (int)(var12 * (double)(this.as * 637880314));
   }

   public static void aq() {
      aw.aj();
   }

   public static void al() {
      aw.aj();
   }

   public static void am(pe var0) {
      ap = var0;
   }

   public static int ap(int var0, int var1, int var2, byte var3) {
      try {
         var2 &= 3;
         if (0 == var2) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else if (1 == var2) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               return 7 - var0;
            }
         } else if (2 == var2) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               return 7 - var1;
            }
         } else {
            return var0;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "hv.ap(" + ')');
      }
   }
}
