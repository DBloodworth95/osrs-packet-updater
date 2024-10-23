import java.util.concurrent.ThreadFactory;

class mk implements ThreadFactory {
   // $FF: synthetic field
   final mn this$0;
   public static final int bt = 51;
   public static final int as = 768;
   static final int ef = 1;

   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS WAV Load");
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "mk.newThread(" + ')');
      }
   }

   public Thread aw(Runnable var1) {
      return new Thread(var1, "OSRS WAV Load");
   }

   public Thread ap(Runnable var1) {
      return new Thread(var1, "OSRS WAV Load");
   }

   mk(mn var1) {
      this.this$0 = var1;
   }
}
