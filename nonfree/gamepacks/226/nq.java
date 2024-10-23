import java.util.Comparator;

public class nq implements Comparator {
   static dn jn;
   static final byte bv = 125;

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "nq.equals(" + ')');
      }
   }

   int ap(mx var1, mx var2, byte var3) {
      try {
         return 1650939479 * var1.ap - 1650939479 * var2.ap;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "nq.ap(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((mx)var1, (mx)var2, (byte)15);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "nq.compare(" + ')');
      }
   }

   public int at(Object var1, Object var2) {
      return this.ap((mx)var1, (mx)var2, (byte)-75);
   }

   public int ay(Object var1, Object var2) {
      return this.ap((mx)var1, (mx)var2, (byte)90);
   }

   public int as(Object var1, Object var2) {
      return this.ap((mx)var1, (mx)var2, (byte)20);
   }

   public int ae(Object var1, Object var2) {
      return this.ap((mx)var1, (mx)var2, (byte)60);
   }

   public int am(Object var1, Object var2) {
      return this.ap((mx)var1, (mx)var2, (byte)-42);
   }

   int aw(mx var1, mx var2) {
      return 1650939479 * var1.ap - 1650939479 * var2.ap;
   }

   public boolean gj(Object var1) {
      return super.equals(var1);
   }

   int ak(mx var1, mx var2) {
      return -459037831 * var1.ap - -1606305015 * var2.ap;
   }

   nq() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "nq.<init>(" + ')');
      }
   }
}
