import java.io.File;

public class mw {
   public static final int ap = 1;
   public static final int av = 19;

   mw() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "mw.<init>(" + ')');
      }
   }

   static void ap(File var0, int var1) {
      try {
         ac.aw = var0;
         if (!ac.aw.exists()) {
            throw new RuntimeException("");
         } else {
            if.ap = true;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "mw.ap(" + ')');
      }
   }

   public static void ap(pe var0, pe var1, boolean var2, int var3) {
      try {
         gf.aw = var0;
         di.ak = var1;
         ir.ap = var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "mw.ap(" + ')');
      }
   }
}
