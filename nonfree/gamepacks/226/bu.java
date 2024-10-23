public class bu {
   cv[] aw = new cv[10];
   static final int ap = 22050;
   int ak;
   int aj;

   final byte[] ag() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.aw[var2] != null && this.aw[var2].ab + this.aw[var2].az > var1) {
            var1 = this.aw[var2].ab + this.aw[var2].az;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = -1525107195 * var1 / -1236774545;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.aw[var4] != null) {
               int var5 = this.aw[var4].ab * 1487320907 / -854869599;
               int var6 = this.aw[var4].az * -471601294 / 1000;
               int[] var7 = this.aw[var4].ap(var5, this.aw[var4].ab);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public final int ao() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.aw[var2] != null && this.aw[var2].az / 20 < var1) {
            var1 = this.aw[var2].az / 20;
         }
      }

      if (this.ak < this.aj && this.ak / 20 < var1) {
         var1 = this.ak / 20;
      }

      if (var1 != 764260223 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.aw[var2] != null) {
               cv var10000 = this.aw[var2];
               var10000.az -= var1 * 20;
            }
         }

         if (this.ak < this.aj) {
            this.ak -= var1 * 20;
            this.aj -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public bt aw() {
      byte[] var1 = this.aj();
      return new bt(22050, var1, 22050 * this.ak / 1000, 22050 * this.aj / 1000);
   }

   public final int an() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.aw[var2] != null && this.aw[var2].az / 20 < var1) {
            var1 = this.aw[var2].az / 20;
         }
      }

      if (this.ak < this.aj && this.ak / 20 < var1) {
         var1 = this.ak / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.aw[var2] != null) {
               cv var10000 = this.aw[var2];
               var10000.az -= var1 * 20;
            }
         }

         if (this.ak < this.aj) {
            this.ak -= var1 * 20;
            this.aj -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] aj() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.aw[var2] != null && this.aw[var2].ab + this.aw[var2].az > var1) {
            var1 = this.aw[var2].ab + this.aw[var2].az;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.aw[var4] != null) {
               int var5 = this.aw[var4].ab * 22050 / 1000;
               int var6 = this.aw[var4].az * 22050 / 1000;
               int[] var7 = this.aw[var4].ap(var5, this.aw[var4].ab);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public static bu ai(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 1499072154);
      return var3 == null ? null : new bu(new vl(var3));
   }

   public static bu ay(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 1302887358);
      return var3 == null ? null : new bu(new vl(var3));
   }

   public static bu as(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 1144919821);
      return var3 == null ? null : new bu(new vl(var3));
   }

   public static bu ae(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 824665841);
      return var3 == null ? null : new bu(new vl(var3));
   }

   public bt am() {
      byte[] var1 = this.aj();
      return new bt(22050, var1, 22050 * this.ak / 1000, 22050 * this.aj / 1000);
   }

   bu(vl var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.cy((short)-31810);
         if (var3 != 0) {
            var1.am -= -725588083;
            this.aw[var2] = new cv();
            this.aw[var2].ak(var1);
         }
      }

      this.ak = var1.ce(1814711209);
      this.aj = var1.ce(1837253079);
   }

   public final int au() {
      int var1 = 2083283808;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.aw[var2] != null && this.aw[var2].az / 20 < var1) {
            var1 = this.aw[var2].az / 20;
         }
      }

      if (this.ak < this.aj && this.ak / 20 < var1) {
         var1 = this.ak / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.aw[var2] != null) {
               cv var10000 = this.aw[var2];
               var10000.az -= var1 * 20;
            }
         }

         if (this.ak < this.aj) {
            this.ak -= var1 * 20;
            this.aj -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] az() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.aw[var2] != null && this.aw[var2].ab + this.aw[var2].az > var1) {
            var1 = this.aw[var2].ab + this.aw[var2].az;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = -910109237 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.aw[var4] != null) {
               int var5 = this.aw[var4].ab * 22050 / -919030473;
               int var6 = this.aw[var4].az * -2146318230 / -1811771371;
               int[] var7 = this.aw[var4].ap(var5, this.aw[var4].ab);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & 1386441885) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   final byte[] ar() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.aw[var2] != null && this.aw[var2].ab + this.aw[var2].az > var1) {
            var1 = this.aw[var2].ab + this.aw[var2].az;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.aw[var4] != null) {
               int var5 = this.aw[var4].ab * 22050 / 1000;
               int var6 = this.aw[var4].az * 22050 / 1000;
               int[] var7 = this.aw[var4].ap(var5, this.aw[var4].ab);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public final int af() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.aw[var2] != null && this.aw[var2].az / 20 < var1) {
            var1 = this.aw[var2].az / 20;
         }
      }

      if (this.ak < this.aj && this.ak / 20 < var1) {
         var1 = this.ak / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.aw[var2] != null) {
               cv var10000 = this.aw[var2];
               var10000.az -= var1 * 20;
            }
         }

         if (this.ak < this.aj) {
            this.ak -= var1 * 20;
            this.aj -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public final int ak() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.aw[var2] != null && this.aw[var2].az / 20 < var1) {
            var1 = this.aw[var2].az / 20;
         }
      }

      if (this.ak < this.aj && this.ak / 20 < var1) {
         var1 = this.ak / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.aw[var2] != null) {
               cv var10000 = this.aw[var2];
               var10000.az -= var1 * 20;
            }
         }

         if (this.ak < this.aj) {
            this.ak -= var1 * 20;
            this.aj -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] ab() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.aw[var2] != null && this.aw[var2].ab + this.aw[var2].az > var1) {
            var1 = this.aw[var2].ab + this.aw[var2].az;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.aw[var4] != null) {
               int var5 = this.aw[var4].ab * 22050 / 1000;
               int var6 = this.aw[var4].az * 22050 / 1000;
               int[] var7 = this.aw[var4].ap(var5, this.aw[var4].ab);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public static bu ap(pe var0, int var1, int var2) {
      byte[] var3 = var0.bm(var1, var2, 1571363608);
      return var3 == null ? null : new bu(new vl(var3));
   }

   public bt at() {
      byte[] var1 = this.aj();
      return new bt(22050, var1, 22050 * this.ak / -337175157, 22050 * this.aj / 1000);
   }
}
