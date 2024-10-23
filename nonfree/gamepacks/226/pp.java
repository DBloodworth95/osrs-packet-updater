import java.util.Comparator;

final class pp implements Comparator {
   public static final int ap = 1;
   static final int aj = 418;

   public int am(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, (byte)57);
   }

   int ap(pv var1, pv var2, byte var3) {
      try {
         byte var10000;
         if (467394427 * var1.ak.ak < 467394427 * var2.ak.ak) {
            var10000 = -1;
         } else if (var1.ak.ak * 467394427 == var2.ak.ak * 467394427) {
            if (var3 <= 8) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pp.ap(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((pv)var1, (pv)var2, (byte)47);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pp.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "pp.equals(" + ')');
      }
   }

   public int ay(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, (byte)122);
   }

   public boolean gj(Object var1) {
      return super.equals(var1);
   }

   public int ae(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, (byte)44);
   }

   public int at(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, (byte)52);
   }

   public static sf[] ap(int var0) {
      try {
         return new sf[]{sf.ap, sf.aw, sf.ak};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "pp.ap(" + ')');
      }
   }

   public int as(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, (byte)67);
   }

   int ak(pv var1, pv var2) {
      return 467394427 * var1.ak.ak < 467394427 * var2.ak.ak ? -1 : (var1.ak.ak * 467394427 == var2.ak.ak * 467394427 ? 0 : 1);
   }

   int aw(pv var1, pv var2) {
      return 467394427 * var1.ak.ak < 467394427 * var2.ak.ak ? -1 : (var1.ak.ak * 467394427 == var2.ak.ak * 467394427 ? 0 : 1);
   }
}
