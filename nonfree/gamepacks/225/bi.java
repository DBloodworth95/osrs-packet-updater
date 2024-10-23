public class bi {
   static final int ac = 22050;
   co[] ae = new co[10];
   int am;
   int ag;

   final byte[] am() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.ae[var2] != null && this.ae[var2].az + this.ae[var2].aa > var1) {
            var1 = this.ae[var2].az + this.ae[var2].aa;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.ae[var4] != null) {
               int var5 = this.ae[var4].az * 22050 / 1000;
               int var6 = this.ae[var4].aa * 22050 / 1000;
               int[] var7 = this.ae[var4].ac(var5, this.ae[var4].az);

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

   bi(vf var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.cv(952452697);
         if (var3 != 0) {
            var1.au -= -1864458299;
            this.ae[var2] = new co();
            this.ae[var2].ag(var1);
         }
      }

      this.ag = var1.ct(-2139409766);
      this.am = var1.ct(-1771543046);
   }

   public bg ae() {
      byte[] var1 = this.am();
      return new bg(22050, var1, 22050 * this.ag / 1000, 22050 * this.am / 1000);
   }

   public final int ag() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.ae[var2] != null && this.ae[var2].aa / 20 < var1) {
            var1 = this.ae[var2].aa / 20;
         }
      }

      if (this.ag < this.am && this.ag / 20 < var1) {
         var1 = this.ag / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.ae[var2] != null) {
               co var10000 = this.ae[var2];
               var10000.aa -= var1 * 20;
            }
         }

         if (this.ag < this.am) {
            this.ag -= var1 * 20;
            this.am -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public static bi ac(po var0, int var1, int var2) {
      byte[] var3 = var0.bt(var1, var2, (byte)11);
      return var3 == null ? null : new bi(new vf(var3));
   }

   public bg ax() {
      byte[] var1 = this.am();
      return new bg(22050, var1, 22050 * this.ag / 1000, 22050 * this.am / 1000);
   }

   public final int af() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.ae[var2] != null && this.ae[var2].aa / 20 < var1) {
            var1 = this.ae[var2].aa / 20;
         }
      }

      if (this.ag < this.am && this.ag / 20 < var1) {
         var1 = this.ag / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.ae[var2] != null) {
               co var10000 = this.ae[var2];
               var10000.aa -= var1 * 20;
            }
         }

         if (this.ag < this.am) {
            this.ag -= var1 * 20;
            this.am -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public final int at() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.ae[var2] != null && this.ae[var2].aa / 20 < var1) {
            var1 = this.ae[var2].aa / 20;
         }
      }

      if (this.ag < this.am && this.ag / 20 < var1) {
         var1 = this.ag / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.ae[var2] != null) {
               co var10000 = this.ae[var2];
               var10000.aa -= var1 * 20;
            }
         }

         if (this.ag < this.am) {
            this.ag -= var1 * 20;
            this.am -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public final int aq() {
      int var1 = 111942130;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.ae[var2] != null && this.ae[var2].aa / 20 < var1) {
            var1 = this.ae[var2].aa / 20;
         }
      }

      if (this.ag < this.am && this.ag / 20 < var1) {
         var1 = this.ag / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.ae[var2] != null) {
               co var10000 = this.ae[var2];
               var10000.aa -= var1 * 20;
            }
         }

         if (this.ag < this.am) {
            this.ag -= var1 * 20;
            this.am -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] au() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.ae[var2] != null && this.ae[var2].az + this.ae[var2].aa > var1) {
            var1 = this.ae[var2].az + this.ae[var2].aa;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.ae[var4] != null) {
               int var5 = this.ae[var4].az * 22050 / 1000;
               int var6 = this.ae[var4].aa * 22050 / 1000;
               int[] var7 = this.ae[var4].ac(var5, this.ae[var4].az);

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

   final byte[] ar() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.ae[var2] != null && this.ae[var2].az + this.ae[var2].aa > var1) {
            var1 = this.ae[var2].az + this.ae[var2].aa;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = -1582356715 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.ae[var4] != null) {
               int var5 = this.ae[var4].az * 22050 / 1000;
               int var6 = this.ae[var4].aa * 22050 / -1834416644;
               int[] var7 = this.ae[var4].ac(var5, this.ae[var4].az);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + -2134835368 & -256) != 0) {
                     var9 = var9 >> 1938320064 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }
}
