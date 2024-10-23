public final class pt {
   static final int bh = 2;
   static final int bm = 6;

   pt() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "pt.<init>(" + ')');
      }
   }

   public static byte[] ae(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 > 127) {
            var2[var3] = (byte)335173035;
         } else {
            var2[var3] = (byte)var4;
         }
      }

      return var2;
   }
}
