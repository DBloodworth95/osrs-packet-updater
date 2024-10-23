import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ts implements tg {
   JSONObject aw;
   static final String ap = "arrayValues";
   static final int ai = 2;
   public static int ak;

   public tz ai() {
      return tz.ap;
   }

   public ts(String var1) throws UnsupportedEncodingException {
      try {
         super();
         this.an(var1, -65962554);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ts.<init>(" + ')');
      }
   }

   public ts(byte[] var1) throws UnsupportedEncodingException {
      try {
         super();
         this.au(var1, (byte)32);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ts.<init>(" + ')');
      }
   }

   public tz ap(int var1) {
      try {
         return tz.ap;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ts.ap(" + ')');
      }
   }

   void au(byte[] var1, byte var2) throws UnsupportedEncodingException {
      try {
         String var3 = new String(var1, "UTF-8");
         this.an(var3, -1879177977);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ts.au(" + ')');
      }
   }

   void az(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.an(var2, -1961734395);
   }

   public tz ak() {
      return tz.ap;
   }

   public byte[] aw(byte var1) throws UnsupportedEncodingException {
      try {
         if (null == this.aw) {
            if (var1 <= 13) {
               throw new IllegalStateException();
            } else {
               return new byte[0];
            }
         } else {
            return this.aw.toString().getBytes("UTF-8");
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ts.aw(" + ')');
      }
   }

   void ad(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.aw = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.aw = new JSONObject();
            this.aw.put("arrayValues", (Object)var2);
         }

      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   public tz aj() {
      return tz.ap;
   }

   public JSONObject ao(int var1) {
      try {
         return this.aw;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ts.ao(" + ')');
      }
   }

   public tz ay() {
      return tz.ap;
   }

   public tz as() {
      return tz.ap;
   }

   public JSONObject aq() {
      return this.aw;
   }

   public byte[] am() throws UnsupportedEncodingException {
      return null == this.aw ? new byte[0] : this.aw.toString().getBytes("UTF-8");
   }

   public tz ae() {
      return tz.ap;
   }

   void af(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.an(var2, -438053659);
   }

   void ar(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.an(var2, -564502711);
   }

   void ab(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.an(var2, -1892822634);
   }

   public ts(JSONObject var1) {
      try {
         super();
         this.aw = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ts.<init>(" + ')');
      }
   }

   void ag(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.aw = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != -158683119) {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.aw = new JSONObject();
            this.aw.put("arrayValues", (Object)var2);
         }

      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   public JSONObject ac() {
      return this.aw;
   }

   void an(String var1, int var2) throws UnsupportedEncodingException {
      try {
         try {
            if (var1.charAt(0) == '{') {
               if (var2 >= 937182221) {
                  throw new IllegalStateException();
               }

               this.aw = new JSONObject(var1);
            } else {
               if (var1.charAt(0) != '[') {
                  throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
               }

               if (var2 >= 937182221) {
                  return;
               }

               JSONArray var3 = new JSONArray(var1);
               this.aw = new JSONObject();
               this.aw.put("arrayValues", (Object)var3);
            }

         } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ts.an(" + ')');
      }
   }

   public JSONObject av() {
      return this.aw;
   }

   public JSONObject ax() {
      return this.aw;
   }

   public byte[] at() throws UnsupportedEncodingException {
      return null == this.aw ? new byte[0] : this.aw.toString().getBytes("UTF-8");
   }
}
