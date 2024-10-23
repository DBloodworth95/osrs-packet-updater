import java.util.Comparator;

public class kd implements Comparator {
   public static final int ax = 20;
   static iz ip;
   static vv[] km;
   static ex ic;
   public static final int aj = 2;
   public static final int au = 13;

   public boolean gj(Object var1) {
      return super.equals(var1);
   }

   int ap(kl var1, kl var2, byte var3) {
      try {
         return var1.ap((byte)81) - var2.ap((byte)33);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "kd.ap(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((kl)var1, (kl)var2, (byte)-55);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "kd.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "kd.equals(" + ')');
      }
   }

   kd() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "kd.<init>(" + ')');
      }
   }

   public int as(Object var1, Object var2) {
      return this.ap((kl)var1, (kl)var2, (byte)-20);
   }

   int aw(kl var1, kl var2) {
      return var1.ap((byte)85) - var2.ap((byte)122);
   }

   public int am(Object var1, Object var2) {
      return this.ap((kl)var1, (kl)var2, (byte)-22);
   }

   public static int ak(int var0, int var1) {
      try {
         return ty.ao[var0 & 2047];
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "kd.ak(" + ')');
      }
   }

   public int ay(Object var1, Object var2) {
      return this.ap((kl)var1, (kl)var2, (byte)-30);
   }

   public int at(Object var1, Object var2) {
      return this.ap((kl)var1, (kl)var2, (byte)3);
   }

   int ak(kl var1, kl var2) {
      return var1.ap((byte)63) - var2.ap((byte)99);
   }

   public int ae(Object var1, Object var2) {
      return this.ap((kl)var1, (kl)var2, (byte)-3);
   }
}
