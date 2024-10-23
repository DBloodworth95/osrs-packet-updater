import java.util.concurrent.Callable;

class fd implements Callable {
   public static final int an = 14;
   // $FF: synthetic field
   final int val$workEnd;
   static final int ah = 1076101384;
   // $FF: synthetic field
   final fr this$0;
   // $FF: synthetic field
   final int val$workStart;
   public static final int aw = 8388607;
   // $FF: synthetic field
   final fh[] val$curveLoadJobs;

   public static long at(int var0, int var1, int var2, boolean var3, int var4, int var5, byte var6) {
      try {
         long var7 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17 | ((long)var5 & 2047L) << 49;
         if (var3) {
            if (var6 >= 0) {
               throw new IllegalStateException();
            }

            var7 |= 65536L;
         }

         return var7;
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "fd.at(" + ')');
      }
   }

   public Object call() {
      try {
         for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
            this.val$curveLoadJobs[var1].call();
         }

         return null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fd.call(" + ')');
      }
   }

   public Object ap() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }

   public Object aw() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }

   public Object ak() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }

   public Object aj() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }

   fd(fr var1, int var2, int var3, fh[] var4) {
      this.this$0 = var1;
      this.val$workStart = var2;
      this.val$workEnd = var3;
      this.val$curveLoadJobs = var4;
   }

   static void ge(me var0, int var1) {
      try {
         var0.ak.ex(-417265355 * mb.fm.bq, -1946849721);
         var0.ak.ed(rc.fw.bq * -417265355, -1578132500);
         var0.ak.bw(-417265355 * dq.fn.bq, (byte)40);
         var0.ak.ed(-417265355 * fg.fd.bq, -776226716);
         var0.ak.ex(-417265355 * ir.fu.bq, -1911099764);
         var0.ak.bw(aw.fh.bq * -417265355, (byte)88);
         var0.ak.bw(-417265355 * bc.fa.bq, (byte)105);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fd.ge(" + ')');
      }
   }
}
