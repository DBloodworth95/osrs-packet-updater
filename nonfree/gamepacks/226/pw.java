import java.util.Comparator;

final class pw implements Comparator {
   static final int ab = 10;
   public static pe ak;
   static final int sz = 128;
   public static pe aw;
   public static final int aj = 65536;
   static final int am = 4;
   static final int wn = 12;

   int ap(pv var1, pv var2, byte var3) {
      try {
         byte var10000;
         if (var1.ak.aj * -334196055 < -334196055 * var2.ak.aj) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else if (var2.ak.aj * -334196055 == -334196055 * var1.ak.aj) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pw.ap(" + ')');
      }
   }

   public boolean gj(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((pv)var1, (pv)var2, (byte)-48);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pw.compare(" + ')');
      }
   }

   public int am(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, (byte)-25);
   }

   public int ay(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, (byte)-2);
   }

   public int as(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, (byte)-121);
   }

   public int ae(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, (byte)-1);
   }

   public int at(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, (byte)-62);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "pw.equals(" + ')');
      }
   }

   int aw(pv var1, pv var2) {
      return var1.ak.aj * -334196055 < -334196055 * var2.ak.aj ? -1 : (var2.ak.aj * -334196055 == -334196055 * var1.ak.aj ? 0 : 1);
   }

   static final void kl(dn var0, int var1, int var2, byte var3) {
      try {
         iy.kj(var0, var0.aj * 86027145, var1, var2, 80789922);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pw.kl(" + ')');
      }
   }
}
