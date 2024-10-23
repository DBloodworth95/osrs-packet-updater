public class re {
   public static final int ap = 40000;
   public static final int aw = 5000;

   re() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "re.<init>(" + ')');
      }
   }
}
