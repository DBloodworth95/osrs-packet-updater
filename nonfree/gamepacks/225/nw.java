import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

class nw implements Callable {
   static final int ac = -1;
   // $FF: synthetic field
   final ms this$0;
   // $FF: synthetic field
   final AtomicBoolean val$cancelled;
   public static po af;
   static final int bj = 42;

   public Object ac() {
      PriorityQueue var1 = this.this$0.bj;

      while(true) {
         nt var2 = null;
         synchronized(var1) {
            if (var1.isEmpty() || this.val$cancelled.get()) {
               return null;
            }

            var2 = (nt)var1.remove();
         }

         var2.ae.ae(-757681851);
      }
   }

   nw(ms var1, AtomicBoolean var2) {
      this.this$0 = var1;
      this.val$cancelled = var2;
   }

   public Object call() {
      try {
         PriorityQueue var1 = this.this$0.bj;

         while(true) {
            nt var2 = null;
            synchronized(var1) {
               if (var1.isEmpty() || this.val$cancelled.get()) {
                  return null;
               }

               var2 = (nt)var1.remove();
            }

            var2.ae.ae(1067628177);
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "nw.call(" + ')');
      }
   }

   public Object ae() {
      PriorityQueue var1 = this.this$0.bj;

      while(true) {
         nt var2 = null;
         synchronized(var1) {
            if (var1.isEmpty() || this.val$cancelled.get()) {
               return null;
            }

            var2 = (nt)var1.remove();
         }

         var2.ae.ae(1048165347);
      }
   }

   public Object ag() {
      PriorityQueue var1 = this.this$0.bj;

      while(true) {
         nt var2 = null;
         synchronized(var1) {
            if (var1.isEmpty() || this.val$cancelled.get()) {
               return null;
            }

            var2 = (nt)var1.remove();
         }

         var2.ae.ae(2005103853);
      }
   }
}
