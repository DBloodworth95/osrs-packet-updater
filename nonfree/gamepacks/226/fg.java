import java.util.concurrent.ThreadFactory;

final class fg implements ThreadFactory {
   static int ok;
   static or fd;

   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS Maya Anim Load");
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fg.newThread(" + ')');
      }
   }

   public Thread ap(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   public Thread aw(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }
}
