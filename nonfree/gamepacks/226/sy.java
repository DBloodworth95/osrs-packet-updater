public abstract class sy {
   sy() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "sy.<init>(" + ')');
      }
   }

   static float af(int var0, int var1, int var2) {
      return (float)(var0 - var1) / (float)(var2 - var1);
   }

   abstract void ak(int var1, int var2, int var3);

   abstract void as(kt var1, sb var2, int var3);

   abstract void ai(kt var1, sb var2, int var3);

   abstract void ay(kt var1, sb var2, int var3);

   abstract void ap(kt var1, sb var2, int var3, int var4);

   abstract boolean ae(kt var1, int var2, int var3);

   abstract boolean am(kt var1, int var2, int var3);

   abstract boolean at(kt var1, int var2, int var3);

   abstract void au(int var1, int var2);

   abstract void an(int var1, int var2);

   static float ao(int var0, int var1, int var2) {
      return (float)(var0 - var1) / (float)(var2 - var1);
   }

   abstract boolean aw(kt var1, int var2, int var3, byte var4);
}
