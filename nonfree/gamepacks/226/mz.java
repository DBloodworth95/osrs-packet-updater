import java.awt.datatransfer.Clipboard;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@ns
public final class mz {
   public static final int aa = 7;
   static final int ev = 3;
   static final HashMap ak = new HashMap();
   static final int ck = 50;
   public static final int ap = 11745;
   public static final long aw = 86400000L;

   static {
      TimeZone var0;
      synchronized(ak) {
         TimeZone var2 = (TimeZone)ak.get("Europe/London");
         if (var2 == null) {
            var2 = TimeZone.getTimeZone("Europe/London");
            ak.put("Europe/London", var2);
         }

         var0 = var2;
      }

      Calendar.getInstance(var0);
   }

   static final void ox(int var0, int var1, boolean var2, byte var3) {
      try {
         if (null == client.sw[var0]) {
            if (var3 != 8) {
               throw new IllegalStateException();
            }
         } else {
            if (var1 >= 0) {
               if (var3 != 8) {
                  throw new IllegalStateException();
               }

               if (var1 < client.sw[var0].aj(693564415)) {
                  fs var4 = (fs)client.sw[var0].ak.get(var1);
                  me var5 = ef.ap(mm.dk, client.in.ai, (byte)45);
                  var5.ak.bo(4 + ct.bl(var4.ak.ap(-494933196), 879605432), -488959516);
                  var5.ak.bo(var0, -1037664553);
                  var5.ak.bd(var1, (byte)-44);
                  var5.ak.bg(var2, 1445337563);
                  var5.ak.be(var4.ak.ap(97909538), (byte)63);
                  client.in.ak(var5, (short)486);
                  return;
               }

               if (var3 != 8) {
                  return;
               }
            }

         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "mz.ox(" + ')');
      }
   }

   mz() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "mz.<init>(" + ')');
      }
   }

   static final void bx(bg var0, int var1) {
      try {
         var0.ad = false;
         if (var0.ag != null) {
            if (var1 <= 453371919) {
               throw new IllegalStateException();
            }

            var0.ag.ay = 0;
         }

         for(bg var2 = var0.ay(); null != var2; var2 = var0.as()) {
            if (var1 <= 453371919) {
               throw new IllegalStateException();
            }

            bx(var2, 1916334283);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "mz.bx(" + ')');
      }
   }

   public static Clipboard pe(int var0) {
      try {
         return dd.bl.am((byte)1);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "mz.pe(" + ')');
      }
   }
}
