public class ro {
   public static final int aw = 1;
   public static final int ap = 0;
   static final int bx = 44;

   ro() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ro.<init>(" + ')');
      }
   }
}
