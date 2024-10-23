public class rx {
   public static final int ap = 226;
   public static final int aw = 1;

   rx() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "rx.<init>(" + ')');
      }
   }
}
