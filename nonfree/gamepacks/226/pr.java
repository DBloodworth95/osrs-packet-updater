import java.util.Comparator;

final class pr implements Comparator {
   static final int ai = 4;

   public int as(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, -7998461);
   }

   int ak(pv var1, pv var2) {
      return var1.ap * 1544889383 < 147797101 * var2.ap ? -1 : (1849865104 * var1.ap == var2.ap * 147797101 ? 0 : 1);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "pr.equals(" + ')');
      }
   }

   public int ay(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, -7998461);
   }

   public int ae(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, -7998461);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((pv)var1, (pv)var2, -7998461);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pr.compare(" + ')');
      }
   }

   int ap(pv var1, pv var2, int var3) {
      try {
         byte var10000;
         if (var1.ap * 147797101 < 147797101 * var2.ap) {
            if (var3 != -7998461) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else if (147797101 * var1.ap == var2.ap * 147797101) {
            if (var3 != -7998461) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pr.ap(" + ')');
      }
   }

   public int at(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, -7998461);
   }

   public boolean gj(Object var1) {
      return super.equals(var1);
   }

   int aw(pv var1, pv var2) {
      return var1.ap * 147797101 < 147797101 * var2.ap ? -1 : (147797101 * var1.ap == var2.ap * 147797101 ? 0 : 1);
   }

   public int am(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, -7998461);
   }
}
