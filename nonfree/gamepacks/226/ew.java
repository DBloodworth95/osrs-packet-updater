import java.util.Comparator;

public class ew implements Comparator {
   public static final int el = 4;
   final boolean ap;
   static final int bw = 25;

   public int ay(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)11);
   }

   public int as(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)44);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((sv)var1, (sv)var2, (byte)125);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ew.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ew.equals(" + ')');
      }
   }

   public int ae(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)98);
   }

   int ap(sv var1, sv var2, byte var3) {
      try {
         return this.ap ? -1071937363 * var1.ay - -1071937363 * var2.ay : -1071937363 * var2.ay - -1071937363 * var1.ay;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ew.ap(" + ')');
      }
   }

   public ew(boolean var1) {
      try {
         super();
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ew.<init>(" + ')');
      }
   }

   public int am(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)34);
   }

   public int at(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)107);
   }

   public boolean gj(Object var1) {
      return super.equals(var1);
   }
}
