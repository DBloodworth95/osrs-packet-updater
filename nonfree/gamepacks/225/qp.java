public class qp extends RuntimeException {
   static final int ai = 18;
   static final int am = 4;

   public qp(String var1, Object[] var2) {
      try {
         super(String.format(var1, var2));
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qp.<init>(" + ')');
      }
   }
}
