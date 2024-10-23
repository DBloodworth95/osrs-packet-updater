public class fs implements ff {
   static final int bh = 1;
   static final int ag = 1;
   static final int ay = 33554432;

   public static int am(long var0) {
      try {
         return (int)(var0 >>> 0 & 127L);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fs.am(" + ')');
      }
   }

   public static mq ac(mz var0, vd var1, byte var2) {
      try {
         mq var3;
         if (mq.aq * -2143578739 == 0) {
            var3 = new mq();
         } else {
            var3 = mq.ax[(mq.aq -= 486847813) * -2143578739];
         }

         var3.ac = var0;
         var3.ae = var0.dn * 1777682993;
         if (-1 == 2020497499 * var3.ae) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            var3.ag = new va(260);
         } else if (-2 == 2020497499 * var3.ae) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            var3.ag = new va(10000);
         } else if (var3.ae * 2020497499 <= 18) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            var3.ag = new va(20);
         } else if (2020497499 * var3.ae <= 98) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            var3.ag = new va(100);
         } else {
            var3.ag = new va(260);
         }

         var3.ag.ae(var1, -252822959);
         var3.ag.ag(497668497 * var3.ac.ds, (byte)-68);
         var3.am = 0;
         return var3;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "fs.ac(" + ')');
      }
   }
}
