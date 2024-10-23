import java.util.Calendar;
import java.util.Date;

public class ke {
   static final int ax = 3;
   static final int ae = 1;
   static final int ag = 2;
   static vt[] kj;
   static final int ah = 10;
   static String co;
   static final int ac = 0;

   ke() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ke.<init>(" + ')');
      }
   }

   static Date al(int var0) {
      try {
         Calendar var1 = Calendar.getInstance();
         var1.set(2, 0);
         var1.set(5, 1);
         var1.set(1, 1900);
         return var1.getTime();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ke.al(" + ')');
      }
   }
}
