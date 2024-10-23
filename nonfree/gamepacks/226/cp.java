public class cp {
   int aw;
   public static final int ao = 44;
   byte[] ap;
   static final String at = "random.dat";
   int ak;

   int aw(int var1) {
      try {
         int var2 = this.ap[this.aw * 1635093337] >> this.ak * 1830272323 & 1;
         this.ak += -50088085;
         this.aw += (this.ak * 1830272323 >> 3) * 836504809;
         this.ak = (1830272323 * this.ak & 7) * -50088085;
         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "cp.aw(" + ')');
      }
   }

   void an(byte[] var1, int var2) {
      this.ap = var1;
      this.aw = 836504809 * var2;
      this.ak = 0;
   }

   static int ad(int var0, da var1, boolean var2, short var3) {
      try {
         ng var10000;
         if (var2) {
            if (var3 >= 128) {
               throw new IllegalStateException();
            }

            var10000 = vx.ar;
         } else {
            var10000 = ac.af;
         }

         ng var4 = var10000;
         if (1800 == var0) {
            if (var3 >= 128) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = db.aw(gr.oa(var4, 1740283048), (byte)2);
               return 1;
            }
         } else if (1801 == var0) {
            if (var3 >= 128) {
               throw new IllegalStateException();
            } else {
               int var5 = cm.ae[(dp.am -= -1450976103) * -158156887];
               --var5;
               if (var4.ej != null) {
                  if (var3 >= 128) {
                     throw new IllegalStateException();
                  }

                  if (var5 < var4.ej.length) {
                     if (var3 >= 128) {
                        throw new IllegalStateException();
                     }

                     if (var4.ej[var5] != null) {
                        cm.at[(ih.au += 746573637) * -114988147 - 1] = var4.ej[var5];
                        return 1;
                     }
                  }
               }

               cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
               return 1;
            }
         } else if (1802 == var0) {
            if (null == var4.ex) {
               if (var3 >= 128) {
                  throw new IllegalStateException();
               }

               cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
            } else {
               cm.at[(ih.au += 746573637) * -114988147 - 1] = var4.ex;
            }

            return 1;
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "cp.ad(" + ')');
      }
   }

   int as() {
      int var1 = this.ap[this.aw * 717611878] >> this.ak * -360183874 & 1;
      this.ak += -50088085;
      this.aw += (this.ak * 1830272323 >> 3) * 836504809;
      this.ak = (-424009709 * this.ak & 7) * 318583824;
      return var1;
   }

   int aj(int var1) {
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var1 >= 8 - this.ak * 1830272323; var1 -= var4) {
         var4 = 8 - this.ak * 1830272323;
         int var5 = (1 << var4) - 1;
         var2 += (this.ap[this.aw * 1635093337] >> this.ak * 1830272323 & var5) << var3;
         this.ak = 0;
         this.aw += 836504809;
         var3 += var4;
      }

      if (var1 > 0) {
         var4 = (1 << var1) - 1;
         var2 += (this.ap[this.aw * 1635093337] >> 1830272323 * this.ak & var4) << var3;
         this.ak += -50088085 * var1;
      }

      return var2;
   }

   int ai(int var1) {
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var1 >= 8 - this.ak * 1830272323; var1 -= var4) {
         var4 = 8 - this.ak * 1830272323;
         int var5 = (1 << var4) - 1;
         var2 += (this.ap[this.aw * -1846330487] >> this.ak * 1830272323 & var5) << var3;
         this.ak = 0;
         this.aw += -1752985050;
         var3 += var4;
      }

      if (var1 > 0) {
         var4 = (1 << var1) - 1;
         var2 += (this.ap[this.aw * 1635093337] >> -1610659195 * this.ak & var4) << var3;
         this.ak += -50088085 * var1;
      }

      return var2;
   }

   int ay(int var1) {
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var1 >= 8 - this.ak * -770807422; var1 -= var4) {
         var4 = 8 - this.ak * 1739955519;
         int var5 = (1 << var4) - 1;
         var2 += (this.ap[this.aw * -113200573] >> this.ak * 1830272323 & var5) << var3;
         this.ak = 0;
         this.aw += 836504809;
         var3 += var4;
      }

      if (var1 > 0) {
         var4 = (1 << var1) - 1;
         var2 += (this.ap[this.aw * -1232294992] >> 512113707 * this.ak & var4) << var3;
         this.ak += -1347504883 * var1;
      }

      return var2;
   }

   int at() {
      int var1 = this.ap[this.aw * 1646125881] >> this.ak * 1091218979 & 1;
      this.ak += -50088085;
      this.aw += (this.ak * 1830272323 >> 3) * 650880406;
      this.ak = (1024696362 * this.ak & 7) * -754544294;
      return var1;
   }

   int ae() {
      int var1 = this.ap[this.aw * 1635093337] >> this.ak * 1830272323 & 1;
      this.ak += -50088085;
      this.aw += (this.ak * 1830272323 >> 3) * 836504809;
      this.ak = (1830272323 * this.ak & 7) * -50088085;
      return var1;
   }

   int am() {
      int var1 = this.ap[this.aw * 1635093337] >> this.ak * -1952700910 & 1;
      this.ak += -1434632838;
      this.aw += (this.ak * 1830272323 >> 3) * 1883310139;
      this.ak = (1830272323 * this.ak & 7) * -1980125708;
      return var1;
   }

   int ap(int var1, byte var2) {
      try {
         int var3 = 0;

         int var4;
         int var5;
         for(var4 = 0; var1 >= 8 - this.ak * 1830272323; var1 -= var5) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            var5 = 8 - this.ak * 1830272323;
            int var6 = (1 << var5) - 1;
            var3 += (this.ap[this.aw * 1635093337] >> this.ak * 1830272323 & var6) << var4;
            this.ak = 0;
            this.aw += 836504809;
            var4 += var5;
         }

         if (var1 > 0) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            var5 = (1 << var1) - 1;
            var3 += (this.ap[this.aw * 1635093337] >> 1830272323 * this.ak & var5) << var4;
            this.ak += -50088085 * var1;
         }

         return var3;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "cp.ap(" + ')');
      }
   }

   void au(byte[] var1, int var2) {
      this.ap = var1;
      this.aw = 836504809 * var2;
      this.ak = 0;
   }

   void ak(byte[] var1, int var2, int var3) {
      try {
         this.ap = var1;
         this.aw = 836504809 * var2;
         this.ak = 0;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "cp.ak(" + ')');
      }
   }

   void ao(byte[] var1, int var2) {
      this.ap = var1;
      this.aw = 836504809 * var2;
      this.ak = 0;
   }

   cp() {
      try {
         super();
         this.ap = null;
         this.aw = 0;
         this.ak = 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "cp.<init>(" + ')');
      }
   }
}
