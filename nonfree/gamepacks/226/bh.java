import java.applet.Applet;
import netscape.javascript.JSObject;

public class bh {
   public static Object aw(Applet var0, String var1, Object[] var2, int var3) throws Throwable {
      try {
         return JSObject.getWindow(var0).call(var1, var2);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bh.aw(" + ')');
      }
   }

   bh() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "bh.<init>(" + ')');
      }
   }

   public static Object as(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   public static Object ak(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

   public static Object aj(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   public static Object ai(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   public static Object ay(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   public static Object ap(Applet var0, String var1, int var2) throws Throwable {
      try {
         return JSObject.getWindow(var0).call(var1, (Object[])null);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bh.ap(" + ')');
      }
   }
}
