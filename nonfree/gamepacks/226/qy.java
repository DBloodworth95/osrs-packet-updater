public class qy extends RuntimeException {
   public qy(String var1, Object[] var2) {
      try {
         super(String.format(var1, var2));
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qy.<init>(" + ')');
      }
   }
}
