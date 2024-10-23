import java.util.concurrent.Callable;

class fj implements Callable {
   // $FF: synthetic field
   final fp[] val$curveLoadJobs;
   // $FF: synthetic field
   final int val$workEnd;
   public static final int av = 8;
   // $FF: synthetic field
   final fo this$0;
   static int pk;
   // $FF: synthetic field
   final int val$workStart;
   static final int ae = 1;

   public Object call() {
      try {
         for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
            this.val$curveLoadJobs[var1].call();
         }

         return null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fj.call(" + ')');
      }
   }

   public Object ag() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }

   public Object ac() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }

   fj(fo var1, int var2, int var3, fp[] var4) {
      this.this$0 = var1;
      this.val$workStart = var2;
      this.val$workEnd = var3;
      this.val$curveLoadJobs = var4;
   }

   public Object ae() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }
}
