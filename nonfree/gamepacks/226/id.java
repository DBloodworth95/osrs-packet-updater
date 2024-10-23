public class id {
   static final int ah = 11;
   public static final int aw = 5;
   public static pe as;
   public static pe ay;
   static final int ak = 2;
   public static final int ap = 0;
   static final int aj = 4;
   static final int nx = 2;

   id() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "id.<init>(" + ')');
      }
   }

   public static ha ap(int var0, short var1) {
      try {
         ha var2 = (ha)ha.ak.ap((long)var0);
         if (var2 != null) {
            if (var1 >= 382) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = ha.ap.bm(33, var0, 1659019550);
            var2 = new ha();
            var2.ai = 1258046803 * var0;
            if (var3 != null) {
               if (var1 >= 382) {
                  throw new IllegalStateException();
               }

               var2.aw(new vl(var3), 1525604453);
            }

            ha.ak.ak(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "id.ap(" + ')');
      }
   }
}
