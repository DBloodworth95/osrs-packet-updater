public class mb {
   static pe aw;
   static int gc;
   public static final int ap = 256;
   static or fm;
   static int tr;

   mb() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "mb.<init>(" + ')');
      }
   }

   static void mr(ng var0, int var1, int var2, byte var3) {
      try {
         if (0 == 388874303 * var0.bp) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            var0.bs = var0.br * 62931931;
         } else if (1 == 388874303 * var0.bp) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            var0.bs = 1673539113 * (-1122739613 * var0.br + (var1 - var0.bo * 2013768333) / 2);
         } else if (388874303 * var0.bp == 2) {
            if (var3 != 0) {
               return;
            }

            var0.bs = (var1 - var0.bo * 2013768333 - var0.br * -1122739613) * 1673539113;
         } else if (var0.bp * 388874303 == 3) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            var0.bs = 1673539113 * (var0.br * -1122739613 * var1 >> 14);
         } else if (var0.bp * 388874303 == 4) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            var0.bs = 1673539113 * ((var1 - 2013768333 * var0.bo) / 2 + (var1 * -1122739613 * var0.br >> 14));
         } else {
            var0.bs = (var1 - 2013768333 * var0.bo - (var1 * var0.br * -1122739613 >> 14)) * 1673539113;
         }

         if (0 == -1770630253 * var0.bz) {
            if (var3 != 0) {
               return;
            }

            var0.bm = var0.bn * -1774507449;
         } else if (var0.bz * -1770630253 == 1) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            var0.bm = -203618419 * (var0.bn * -1906431453 + (var2 - -1662542495 * var0.bd) / 2);
         } else if (-1770630253 * var0.bz == 2) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            var0.bm = (var2 - -1662542495 * var0.bd - var0.bn * -1906431453) * -203618419;
         } else if (var0.bz * -1770630253 == 3) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            var0.bm = -203618419 * (var2 * -1906431453 * var0.bn >> 14);
         } else if (4 == -1770630253 * var0.bz) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            var0.bm = ((var2 * -1906431453 * var0.bn >> 14) + (var2 - var0.bd * -1662542495) / 2) * -203618419;
         } else {
            var0.bm = -203618419 * (var2 - -1662542495 * var0.bd - (var2 * -1906431453 * var0.bn >> 14));
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "mb.mr(" + ')');
      }
   }
}
