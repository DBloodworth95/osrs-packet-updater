import java.util.Calendar;
import java.util.Date;

public class hq implements ps {
   static final hq ag = new hq(2, 2);
   static final hq ae = new hq(0, 1);
   static final int as = 360;
   public final int am;
   final int ax;
   static final hq ac = new hq(1, 0);

   hq(int var1, int var2) {
      try {
         super();
         this.am = var1 * 1964591545;
         this.ax = 722220499 * var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "hq.<init>(" + ')');
      }
   }

   public int am() {
      return this.ax * -1192039845;
   }

   public int ae() {
      return this.ax * -1192039845;
   }

   public int ag() {
      return this.ax * 1823962386;
   }

   public int ac(int var1) {
      try {
         return this.ax * -1192039845;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "hq.ac(" + ')');
      }
   }

   static boolean ad(Date var0, byte var1) {
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
         throw vk.ae(var4, "hq.ad(" + ')');
      }
   }
}
