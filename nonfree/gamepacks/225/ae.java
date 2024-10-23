import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

public class ae implements Callable {
   // $FF: synthetic field
   final at this$0;
   final am ae;
   final vf ac;
   static client be;
   static int tp;

   public Object ae() {
      return this.ae.ac(this.ac);
   }

   public Object call() {
      try {
         return this.ae.ac(this.ac);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ae.call(" + ')');
      }
   }

   static void ad(ArrayList var0, boolean var1, int var2) {
      try {
         if (!var1) {
            if (var2 != 408900827) {
               throw new IllegalStateException();
            }

            mm.af.clear();
         }

         Iterator var3 = var0.iterator();

         while(var3.hasNext()) {
            if (var2 != 408900827) {
               throw new IllegalStateException();
            }

            ns var4 = (ns)var3.next();
            if (1710436281 * var4.ae != -1) {
               if (var2 != 408900827) {
                  throw new IllegalStateException();
               }

               if (1578912913 * var4.ag != -1) {
                  if (!var1) {
                     if (var2 != 408900827) {
                        throw new IllegalStateException();
                     }

                     mm.af.add(var4);
                  }

                  mm.ax.add(var4);
               }
            }
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ae.ad(" + ')');
      }
   }

   public Object ac() {
      return this.ae.ac(this.ac);
   }

   ae(at var1, vf var2, am var3) {
      try {
         this.this$0 = var1;
         super();
         this.ac = var2;
         this.ae = var3;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ae.<init>(" + ')');
      }
   }

   public Object ag() {
      return this.ae.ac(this.ac);
   }
}
