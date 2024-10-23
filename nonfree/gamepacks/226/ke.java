public abstract class ke {
   static final String as = "main_file_cache.dat2";
   public int aj;
   public int ak;
   public int ap;
   static final int af = 14;
   public int aw;

   static final int ap(ur var0, byte var1) {
      try {
         if (var0 == null) {
            return 12;
         } else {
            switch(var0.at * -588432431) {
            case 7:
               return 20;
            default:
               return 12;
            }
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ke.ap(" + ')');
      }
   }

   protected ke() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ke.<init>(" + ')');
      }
   }

   protected abstract boolean aw(int var1, int var2, int var3, ko var4);

   protected abstract boolean ak(int var1, int var2, int var3, ko var4);

   public static Object ap(byte[] var0, boolean var1, int var2) {
      try {
         if (null == var0) {
            return null;
         } else if (var0.length > 136) {
            if (var2 == 1801777373) {
               throw new IllegalStateException();
            } else {
               oa var3 = new oa();
               var3.aj(var0, 1596326651);
               return var3;
            }
         } else if (var1) {
            if (var2 == 1801777373) {
               throw new IllegalStateException();
            } else {
               int var4 = var0.length;
               byte[] var5 = new byte[var4];
               System.arraycopy(var0, 0, var5, 0, var4);
               return var5;
            }
         } else {
            return var0;
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ke.ap(" + ')');
      }
   }

   protected abstract boolean ap(int var1, int var2, int var3, ko var4, int var5);
}
