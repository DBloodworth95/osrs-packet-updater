import java.util.concurrent.Callable;

class fb implements Callable {
   static final int ak = 128;
   // $FF: synthetic field
   final int val$version;
   // $FF: synthetic field
   final fr this$0;
   // $FF: synthetic field
   final vl val$p;

   static final void av(String var0, int var1, int var2) {
      try {
         me var3 = ef.ap(mm.ck, client.in.ai, (byte)97);
         var3.ak.bo(ct.bl(var0, 1968041274) + 1, 668566184);
         var3.ak.dv(var1, (byte)1);
         var3.ak.be(var0, (byte)39);
         client.in.ak(var3, (short)486);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "fb.av(" + ')');
      }
   }

   fb(fr var1, vl var2, int var3) {
      this.this$0 = var1;
      this.val$p = var2;
      this.val$version = var3;
   }

   public Object ap() {
      this.this$0.aw(this.val$p, this.val$version, (byte)7);
      return null;
   }

   public Object call() {
      try {
         this.this$0.aw(this.val$p, this.val$version, (byte)7);
         return null;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "fb.call(" + ')');
      }
   }

   public Object ak() {
      this.this$0.aw(this.val$p, this.val$version, (byte)7);
      return null;
   }

   public Object aj() {
      this.this$0.aw(this.val$p, this.val$version, (byte)7);
      return null;
   }

   public static void ap(pe var0, pe var1, boolean var2, qi var3, int var4) {
      try {
         ip.as = var0;
         qs.ae = var1;
         rv.am = var2;
         ip.at = ip.as.cq(10, 644499801) * 1613672925;
         ht.af = var3;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "fb.ap(" + ')');
      }
   }

   public Object aw() {
      this.this$0.aw(this.val$p, this.val$version, (byte)7);
      return null;
   }
}
