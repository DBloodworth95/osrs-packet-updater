import java.security.SecureRandom;

public class mv implements mt {
   static final mv ae = new mv(27, 0);
   public static final mv aw = new mv(15, 20);
   public static final mv aj = new mv(18, -2);
   public static final mv ay = new mv(20, 58);
   public static final mv ap = new mv(14, 0);
   public static final mv ak = new mv(16, -2);
   public static final mv as = new mv(21, 37);
   public static final mv ai = new mv(19, -2);
   public final int am;
   public final int at;
   static final mv[] au = new mv[32];

   static {
      mv[] var0 = new mv[]{ai, aw, aj, ap, ak, as, ae, ay};
      mv[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         au[1270591485 * var1[var2].am] = var1[var2];
      }

   }

   mv(int var1, int var2) {
      try {
         super();
         this.am = var1 * -236247723;
         this.at = -1104193211 * var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "mv.<init>(" + ')');
      }
   }

   static SecureRandom ai(int var0) {
      try {
         SecureRandom var1 = new SecureRandom();
         var1.nextInt();
         return var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "mv.ai(" + ')');
      }
   }

   public static void ap(int var0) {
      try {
         ru.av.clear();
         ru.av.add(100);
         ru.av.add(5000);
         ru.av.add(10000);
         ru.av.add(30000);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "mv.ap(" + ')');
      }
   }
}
