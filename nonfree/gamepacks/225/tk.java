import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class tk implements tz {
   public static final int ba = 262144;
   final Map ac;

   public String ar() throws UnsupportedEncodingException {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.ac.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
         String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
         var1.append(var4).append("=").append(var5).append("&");
      }

      if (var1.length() == 0) {
         return "";
      } else {
         var1.deleteCharAt(var1.length() - 1);
         var1.insert(0, "?");
         return var1.toString();
      }
   }

   public te ac(int var1) {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tk.ac(" + ')');
      }
   }

   public byte[] ae(int var1) throws UnsupportedEncodingException {
      try {
         return this.at((short)-10351).getBytes("UTF-8");
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tk.ae(" + ')');
      }
   }

   public byte[] af() throws UnsupportedEncodingException {
      return this.at((short)-15429).getBytes("UTF-8");
   }

   public te ag() {
      return null;
   }

   public te am() {
      return null;
   }

   public byte[] aq() throws UnsupportedEncodingException {
      return this.at((short)-31656).getBytes("UTF-8");
   }

   public String au() throws UnsupportedEncodingException {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.ac.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
         String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
         var1.append(var4).append("=").append(var5).append("&");
      }

      if (var1.length() == 0) {
         return "";
      } else {
         var1.deleteCharAt(var1.length() - 1);
         var1.insert(0, "?");
         return var1.toString();
      }
   }

   public String at(short var1) throws UnsupportedEncodingException {
      try {
         StringBuilder var2 = new StringBuilder();
         Iterator var3 = this.ac.entrySet().iterator();

         while(var3.hasNext()) {
            if (var1 >= 162) {
               throw new IllegalStateException();
            }

            Entry var4 = (Entry)var3.next();
            String var5 = URLEncoder.encode((String)var4.getKey(), "UTF-8");
            String var6 = URLEncoder.encode((String)var4.getValue(), "UTF-8");
            var2.append(var5).append("=").append(var6).append("&");
         }

         if (var2.length() == 0) {
            return "";
         } else {
            var2.deleteCharAt(var2.length() - 1);
            var2.insert(0, "?");
            return var2.toString();
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "tk.at(" + ')');
      }
   }

   public tk(Map var1) {
      try {
         super();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tk.<init>(" + ')');
      }
   }

   public byte[] ax() throws UnsupportedEncodingException {
      return this.at((short)-29665).getBytes("UTF-8");
   }

   public String al() throws UnsupportedEncodingException {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.ac.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
         String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
         var1.append(var4).append("=").append(var5).append("&");
      }

      if (var1.length() == 0) {
         return "";
      } else {
         var1.deleteCharAt(var1.length() - 1);
         var1.insert(0, "?");
         return var1.toString();
      }
   }

   public static int ae(int var0, int var1, int var2) {
      try {
         return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tk.ae(" + ')');
      }
   }
}
