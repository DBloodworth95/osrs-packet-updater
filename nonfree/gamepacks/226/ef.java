public class ef {
   static final ef ae = new ef(7);
   static final int br = 49;
   static final ef at = new ef(9);
   static final ef aj = new ef(3);
   static final ef aw = new ef(1);
   int az;
   static final ef ap = new ef(0);
   static final ef ak = new ef(2);
   static final ef am = new ef(8);
   static final ef ai = new ef(4);
   static final ef au = new ef(10);
   static final ef an = new ef(11);
   static final ef ao = new ef(12);
   static final ef af = new ef(13);
   static final ef ar = new ef(14);
   static final ef ab = new ef(15);
   static final ef as = new ef(6);
   static final ef ay = new ef(5);

   ef(int var1) {
      try {
         super();
         this.az = 742114003 * var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ef.<init>(" + ')');
      }
   }

   public static me ap(mm var0, wh var1, byte var2) {
      try {
         me var3;
         if (me.ay * -330622723 == 0) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var3 = new me();
         } else {
            var3 = me.ai[(me.ay -= -228866987) * -330622723];
         }

         var3.ap = var0;
         var3.aw = 1848259847 * var0.di;
         if (-1 == var3.aw * 1532461933) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var3.ak = new vm(260);
         } else if (var3.aw * 1532461933 == -2) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var3.ak = new vm(10000);
         } else if (1532461933 * var3.aw <= 18) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var3.ak = new vm(20);
         } else if (var3.aw * 1532461933 <= 98) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var3.ak = new vm(100);
         } else {
            var3.ak = new vm(260);
         }

         var3.ak.aw(var1, -1890762928);
         var3.ak.ak(var3.ap.dz * 669283137, 231578805);
         var3.aj = 0;
         return var3;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ef.ap(" + ')');
      }
   }
}
