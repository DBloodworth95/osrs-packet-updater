import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class tb implements tz {
   static final int am = 256;
   static final String ac = "arrayValues";
   JSONObject ae;
   static String cv;

   void ad(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.au(var2, -1669259869);
   }

   public te am() {
      return te.ac;
   }

   public byte[] ae(int var1) throws UnsupportedEncodingException {
      try {
         if (this.ae == null) {
            if (var1 != -115375452) {
               throw new IllegalStateException();
            } else {
               return new byte[0];
            }
         } else {
            return this.ae.toString().getBytes("UTF-8");
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tb.ae(" + ')');
      }
   }

   public te ac(int var1) {
      try {
         return te.ac;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tb.ac(" + ')');
      }
   }

   void at(byte[] var1, int var2) throws UnsupportedEncodingException {
      try {
         String var3 = new String(var1, "UTF-8");
         this.au(var3, -2088129841);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "tb.at(" + ')');
      }
   }

   void au(String var1, int var2) throws UnsupportedEncodingException {
      try {
         try {
            if (var1.charAt(0) == '{') {
               if (var2 >= -1221389451) {
                  throw new IllegalStateException();
               }

               this.ae = new JSONObject(var1);
            } else {
               if (var1.charAt(0) != '[') {
                  throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
               }

               if (var2 >= -1221389451) {
                  return;
               }

               JSONArray var3 = new JSONArray(var1);
               this.ae = new JSONObject();
               this.ae.put("arrayValues", (Object)var3);
            }

         } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "tb.au(" + ')');
      }
   }

   public JSONObject ar(int var1) {
      try {
         return this.ae;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tb.ar(" + ')');
      }
   }

   public tb(String var1) throws UnsupportedEncodingException {
      try {
         super();
         this.au(var1, -1369648131);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tb.<init>(" + ')');
      }
   }

   public te ag() {
      return te.ac;
   }

   public byte[] af() throws UnsupportedEncodingException {
      return this.ae == null ? new byte[0] : this.ae.toString().getBytes("UTF-8");
   }

   public byte[] ax() throws UnsupportedEncodingException {
      return this.ae == null ? new byte[0] : this.ae.toString().getBytes("UTF-8");
   }

   public byte[] aq() throws UnsupportedEncodingException {
      return this.ae == null ? new byte[0] : this.ae.toString().getBytes("UTF-8");
   }

   public tb(byte[] var1) throws UnsupportedEncodingException {
      try {
         super();
         this.at(var1, -1417826306);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tb.<init>(" + ')');
      }
   }

   void al(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.au(var2, -1618210596);
   }

   public tb(JSONObject var1) {
      try {
         super();
         this.ae = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tb.<init>(" + ')');
      }
   }

   void ah(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.ae = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.ae = new JSONObject();
            this.ae.put("arrayValues", (Object)var2);
         }

      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   void ap(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.ae = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != 1717698841) {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.ae = new JSONObject();
            this.ae.put("arrayValues", (Object)var2);
         }

      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   void ab(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == -1326559284) {
            this.ae = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != -303415876) {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.ae = new JSONObject();
            this.ae.put("arrayValues", (Object)var2);
         }

      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   void az(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.ae = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.ae = new JSONObject();
            this.ae.put("arrayValues", (Object)var2);
         }

      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   public JSONObject aa() {
      return this.ae;
   }

   public static boolean au(po var0, int var1, int var2, short var3) {
      try {
         byte[] var4 = var0.bt(var1, var2, (byte)-63);
         if (var4 == null) {
            if (var3 != 180) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            uy.ar(var4, -2143578739);
            return true;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "tb.au(" + ')');
      }
   }
}
