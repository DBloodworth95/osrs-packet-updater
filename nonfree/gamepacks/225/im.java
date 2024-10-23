public abstract class im {
   static final int ab = 256;
   static final String at = "main_file_cache.idx";
   static final int cw = 24;

   public abstract void ac(byte var1);

   public abstract int aq(int var1, int var2);

   public abstract void am();

   public abstract void ag();

   im() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "im.<init>(" + ')');
      }
   }

   public abstract int ax(int var1, int var2);

   public abstract int af(int var1, int var2);

   public abstract int ae(int var1, int var2, int var3);

   static void py(vf var0, int var1, int var2) {
      try {
         ia.po(var0.at, var1, 950249480);
         hs.ag(var0, var1, (short)20012);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "im.py(" + ')');
      }
   }
}
