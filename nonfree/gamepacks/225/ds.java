public class ds extends to {
   int ag;
   int ae;
   int am;
   static final int ct = 40;
   static int ms;
   int ac;

   ds(int var1, int var2, int var3, int var4) {
      try {
         super();
         this.ac = var1 * -294520165;
         this.ae = var2 * 328891017;
         this.ag = -330616287 * var3;
         this.am = 1274064541 * var4;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ds.<init>(" + ')');
      }
   }

   void ac(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.ac = -294520165 * var1;
         this.ae = 328891017 * var2;
         this.ag = -330616287 * var3;
         this.am = 1274064541 * var4;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ds.ac(" + ')');
      }
   }

   void ae(int var1, int var2, int var3, int var4) {
      this.ac = -294520165 * var1;
      this.ae = 328891017 * var2;
      this.ag = -330616287 * var3;
      this.am = 1274064541 * var4;
   }

   public static if ae(int var0, int var1) {
      try {
         if var2 = (if)if.at.ac((long)var0);
         if (null != var2) {
            if (var1 != -683358200) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = if.ax.bt(12, var0, (byte)7);
            var2 = new if();
            if (null != var3) {
               if (var1 != -683358200) {
                  throw new IllegalStateException();
               }

               var2.ag(new vf(var3), 283342224);
            }

            var2.ax(1129515892);
            if.at.ag(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ds.ae(" + ')');
      }
   }

   static int ch(int var0, dt var1, boolean var2, byte var3) {
      try {
         if (var0 == 7900) {
            if (var3 == 0) {
               throw new IllegalStateException();
            } else {
               int var4 = cs.at[(mp.au -= -1856457959) * 844691753];
               client.wj = Math.max(var4, 0) * 1983063627;
               return 1;
            }
         } else if (var0 == 7901) {
            if (var3 == 0) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = client.wj * -1220676765;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ds.ch(" + ')');
      }
   }

   public static boolean au(char var0, int var1) {
      try {
         boolean var10000;
         if (var0 >= '0') {
            if (var1 == 144019275) {
               throw new IllegalStateException();
            }

            if (var0 <= '9') {
               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ds.au(" + ')');
      }
   }
}
