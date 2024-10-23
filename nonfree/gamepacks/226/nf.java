import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

class nf implements Callable {
   public static final int ab = 91;
   // $FF: synthetic field
   final mn this$0;
   public static short[][] af;
   // $FF: synthetic field
   final AtomicBoolean val$cancelled;
   public static final int an = 8192;
   static final int tk = 48;
   public static final int ai = 5000;

   public Object aj() {
      PriorityQueue var1 = this.this$0.bc;

      while(true) {
         mx var2 = null;
         synchronized(var1) {
            if (var1.isEmpty() || this.val$cancelled.get()) {
               return null;
            }

            var2 = (mx)var1.remove();
         }

         var2.aw.aw(-1965519380);
      }
   }

   public Object call() {
      try {
         PriorityQueue var1 = this.this$0.bc;

         while(true) {
            mx var2 = null;
            synchronized(var1) {
               if (var1.isEmpty() || this.val$cancelled.get()) {
                  return null;
               }

               var2 = (mx)var1.remove();
            }

            var2.aw.aw(-1846771592);
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "nf.call(" + ')');
      }
   }

   nf(mn var1, AtomicBoolean var2) {
      this.this$0 = var1;
      this.val$cancelled = var2;
   }

   public Object aw() {
      PriorityQueue var1 = this.this$0.bc;

      while(true) {
         mx var2 = null;
         synchronized(var1) {
            if (var1.isEmpty() || this.val$cancelled.get()) {
               return null;
            }

            var2 = (mx)var1.remove();
         }

         var2.aw.aw(1437410655);
      }
   }

   public Object ak() {
      PriorityQueue var1 = this.this$0.bc;

      while(true) {
         mx var2 = null;
         synchronized(var1) {
            if (var1.isEmpty() || this.val$cancelled.get()) {
               return null;
            }

            var2 = (mx)var1.remove();
         }

         var2.aw.aw(1607228155);
      }
   }

   public Object ap() {
      PriorityQueue var1 = this.this$0.bc;

      while(true) {
         mx var2 = null;
         synchronized(var1) {
            if (var1.isEmpty() || this.val$cancelled.get()) {
               return null;
            }

            var2 = (mx)var1.remove();
         }

         var2.aw.aw(617682247);
      }
   }
}
