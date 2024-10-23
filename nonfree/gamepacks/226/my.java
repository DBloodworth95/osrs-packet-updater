public final class my {
   static long aw;
   static final int aj = 3;
   static long ap;
   static final int af = 8;

   my() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "my.<init>(" + ')');
      }
   }

   public static final synchronized long aw() {
      long var0 = System.currentTimeMillis();
      if (var0 < ap * 7913224161779004381L) {
         aw += -4214090096246073641L * (7913224161779004381L * ap - var0);
      }

      ap = var0 * 2680872237914569845L;
      return var0 + 3351958198102818023L * aw;
   }
}
