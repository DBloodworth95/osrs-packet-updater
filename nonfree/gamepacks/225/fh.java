import java.util.concurrent.Callable;

class fh implements Callable {
   // $FF: synthetic field
   final int val$version;
   public static final int aa = 0;
   // $FF: synthetic field
   final fo this$0;
   // $FF: synthetic field
   final vf val$p;

   fh(fo var1, vf var2, int var3) {
      this.this$0 = var1;
      this.val$p = var2;
      this.val$version = var3;
   }

   public Object call() {
      try {
         this.this$0.ae(this.val$p, this.val$version, -143337670);
         return null;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "fh.call(" + ')');
      }
   }

   public Object ae() {
      this.this$0.ae(this.val$p, this.val$version, -1239219558);
      return null;
   }

   public Object ac() {
      this.this$0.ae(this.val$p, this.val$version, -1196002674);
      return null;
   }

   public Object ag() {
      this.this$0.ae(this.val$p, this.val$version, -1816154754);
      return null;
   }
}
