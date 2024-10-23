import java.util.concurrent.Callable;

public class fp implements Callable {
   static final byte bn = 127;
   final fg ae;
   final fu ag;
   final int am;
   public static final int an = 23;
   final fr ac;
   // $FF: synthetic field
   final fo this$0;
   public static final int bd = 32768;
   static final int ar = 7;

   static dt ag(int var0, int var1, byte var2) {
      try {
         dt var3 = (dt)dt.ac.ac((long)(var0 << 16));
         if (var3 != null) {
            if (var2 != 1) {
               throw new IllegalStateException();
            } else {
               return var3;
            }
         } else {
            String var4 = String.valueOf(var0);
            int var5 = hi.fg.cg(var4, (short)-25939);
            if (var5 == -1) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               byte[] var6 = hi.fg.ch(var5, (byte)77);
               if (var6 != null) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }

                  if (var6.length <= 1) {
                     if (var2 != 1) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  var3 = gb.am(var6, -2074661056);
                  if (var3 != null) {
                     if (var2 != 1) {
                        throw new IllegalStateException();
                     }

                     dt.ac.ag(var3, (long)(var0 << 16));
                     return var3;
                  }
               }

               return null;
            }
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "fp.ag(" + ')');
      }
   }

   public Object call() {
      try {
         this.ac.ae(-432810519);
         fr[][] var1;
         if (fg.ae == this.ae) {
            var1 = this.this$0.ag;
         } else {
            var1 = this.this$0.ae;
         }

         var1[-993785003 * this.am][this.ag.ax(-1352998537)] = this.ac;
         return null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fp.call(" + ')');
      }
   }

   public Object ac() {
      this.ac.ae(-432810519);
      fr[][] var1;
      if (fg.ae == this.ae) {
         var1 = this.this$0.ag;
      } else {
         var1 = this.this$0.ae;
      }

      var1[650968441 * this.am][this.ag.ax(-977644238)] = this.ac;
      return null;
   }

   fp(fo var1, fr var2, fg var3, fu var4, int var5) {
      try {
         this.this$0 = var1;
         super();
         this.ac = var2;
         this.ae = var3;
         this.ag = var4;
         this.am = -544237059 * var5;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "fp.<init>(" + ')');
      }
   }

   public Object ae() {
      this.ac.ae(-432810519);
      fr[][] var1;
      if (fg.ae == this.ae) {
         var1 = this.this$0.ag;
      } else {
         var1 = this.this$0.ae;
      }

      var1[-993785003 * this.am][this.ag.ax(-1191769852)] = this.ac;
      return null;
   }

   public Object ag() {
      this.ac.ae(-432810519);
      fr[][] var1;
      if (fg.ae == this.ae) {
         var1 = this.this$0.ag;
      } else {
         var1 = this.this$0.ae;
      }

      var1[-993785003 * this.am][this.ag.ax(-929235895)] = this.ac;
      return null;
   }
}
