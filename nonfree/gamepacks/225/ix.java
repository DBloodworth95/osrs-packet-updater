public class ix {
   public float[] ae;
   public ek ac;
   // $FF: synthetic field
   final iy this$0;

   ix(iy var1) {
      try {
         this.this$0 = var1;
         super();
         this.ae = new float[4];
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ix.<init>(" + ')');
      }
   }

   static final int ae(int var0, int var1, int var2, int var3, int var4) {
      try {
         return var0 * var2 - var1 * var3 >> 16;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ix.ae(" + ')');
      }
   }
}
