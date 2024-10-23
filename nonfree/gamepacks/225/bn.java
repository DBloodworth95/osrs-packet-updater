import java.applet.Applet;
import netscape.javascript.JSObject;

public class bn {
   bn() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bn.<init>(" + ')');
      }
   }

   public static Object ac(Applet var0, String var1, Object[] var2, int var3) throws Throwable {
      try {
         return JSObject.getWindow(var0).call(var1, var2);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "bn.ac(" + ')');
      }
   }

   public static Object ae(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }
}
