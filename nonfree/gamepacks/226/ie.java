public abstract class ie {
   static final int ac = 360;
   static or fb;
   static boolean sy;

   public abstract void ak();

   public abstract void ap(int var1);

   ie() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ie.<init>(" + ')');
      }
   }

   public abstract void ai();

   public abstract void aj();

   static long ap(int var0, int var1, int var2, int var3) {
      try {
         return (long)(var2 << 16 | var0 << 8 | var1);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ie.ap(" + ')');
      }
   }

   public abstract void ay();

   public abstract int as(int var1, int var2);

   public abstract int ae(int var1, int var2);

   public abstract int am(int var1, int var2);

   public static ie au() {
      try {
         return new ia();
      } catch (Throwable var1) {
         return new il();
      }
   }

   public static ie an() {
      try {
         return new ia();
      } catch (Throwable var1) {
         return new il();
      }
   }

   public abstract int aw(int var1, int var2, byte var3);
}
