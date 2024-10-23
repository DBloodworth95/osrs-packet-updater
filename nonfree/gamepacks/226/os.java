public class os {
   public final int ay;
   public static final os aw = new os("BUILDLIVE", 3);
   public static final os ap = new os("LIVE", 0);
   public static final os ak = new os("RC", 1);
   public final String ai;
   public static final os aj = new os("WIP", 2);

   os(String var1, int var2) {
      try {
         super();
         this.ai = var1;
         this.ay = 1833807987 * var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "os.<init>(" + ')');
      }
   }

   public static vn aw(int var0, int var1) {
      try {
         vn var2 = (vn)vn.aw.ap((long)var0);
         if (var2 != null) {
            if (var1 >= 1810015952) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = vn.ap.bm(39, var0, 1833192537);
            var2 = new vn();
            if (null != var3) {
               if (var1 >= 1810015952) {
                  throw new IllegalStateException();
               }

               var2.ak(new vl(var3), (byte)-29);
            }

            var2.ai((byte)-15);
            vn.aw.ak(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "os.aw(" + ')');
      }
   }

   static void ls(int var0, int var1, int var2) {
      try {
         me var3 = ef.ap(mm.cd, client.in.ai, (byte)6);
         var3.ak.ep(var0, 1946732522);
         var3.ak.bd(var1, (byte)1);
         client.in.ak(var3, (short)486);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "os.ls(" + ')');
      }
   }
}
