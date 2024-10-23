import java.util.Calendar;
import java.util.Date;

public class iw extends ij {
   public static final String jz = "Please enter your date of birth (DD/MM/YYYY)";
   // $FF: synthetic field
   final ik this$0;
   static int[] ju;
   int ap;

   public int ak() {
      return 0;
   }

   public int ap(int var1) {
      try {
         return 0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "iw.ap(" + ')');
      }
   }

   public int aw(int var1) {
      try {
         return this.ap * -2122351177;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "iw.aw(" + ')');
      }
   }

   public int as() {
      return this.ap * -410638587;
   }

   public int aj() {
      return 0;
   }

   public int ay() {
      return 0;
   }

   iw(ik var1, String var2, int var3) {
      try {
         this.this$0 = var1;
         super(var1, var2);
         this.ap = var3 * 228126727;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "iw.<init>(" + ')');
      }
   }

   public int ai() {
      return 0;
   }

   public int ae() {
      return this.ap * -2122351177;
   }

   static boolean ao(Date var0, int var1) {
      try {
         Calendar var2 = Calendar.getInstance();
         var2.set(1, var2.get(1) - 13);
         var2.set(5, var2.get(5) + 1);
         var2.set(11, 0);
         var2.set(12, 0);
         var2.set(13, 0);
         var2.set(14, 0);
         Date var3 = var2.getTime();
         return var0.before(var3);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "iw.ao(" + ')');
      }
   }
}
