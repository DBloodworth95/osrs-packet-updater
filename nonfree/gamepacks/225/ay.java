import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

public class ay {
   final int ac;
   final Map ae;
   public static final int at = 6;
   public static final int aa = 1;
   final String ag;

   public String al() {
      return this.ag;
   }

   ay(String var1) {
      try {
         super();
         this.ac = 402067952;
         this.ae = null;
         this.ag = "";
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ay.<init>(" + ')');
      }
   }

   public int ac(int var1) {
      try {
         return this.ac * -458633273;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ay.ac(" + ')');
      }
   }

   static dt ac(int var0, int var1) {
      try {
         dt var2 = (dt)dt.ac.ac((long)var0);
         if (var2 != null) {
            if (var1 != 1222515241) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = hi.fg.bt(var0, 0, (byte)77);
            if (var3 == null) {
               if (var1 != 1222515241) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var2 = gb.am(var3, -1882934958);
               dt.ac.ag(var2, (long)var0);
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ay.ac(" + ')');
      }
   }

   public String ag(int var1) {
      try {
         return this.ag;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ay.ag(" + ')');
      }
   }

   public int am() {
      return this.ac * -458633273;
   }

   public int ax() {
      return this.ac * 1502534513;
   }

   public Map ae(int var1) {
      try {
         return this.ae;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ay.ae(" + ')');
      }
   }

   ay(HttpURLConnection var1) throws IOException {
      try {
         super();
         this.ac = var1.getResponseCode() * 945897975;
         var1.getResponseMessage();
         this.ae = var1.getHeaderFields();
         StringBuilder var2 = new StringBuilder();
         InputStream var3 = -458633273 * this.ac >= 300 ? var1.getErrorStream() : var1.getInputStream();
         if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);

            String var6;
            while((var6 = var5.readLine()) != null) {
               var2.append(var6);
            }

            var3.close();
         }

         this.ag = var2.toString();
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ay.<init>(" + ')');
      }
   }

   public Map at() {
      return this.ae;
   }

   public Map au() {
      return this.ae;
   }

   public String ar() {
      return this.ag;
   }

   public int aq() {
      return this.ac * -458633273;
   }

   public String ad() {
      return this.ag;
   }

   public int af() {
      return this.ac * -458633273;
   }
}
