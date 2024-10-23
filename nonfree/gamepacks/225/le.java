import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class le implements ps {
   static final le ac = new le(3, (byte)0);
   static final le ae = new le(0, (byte)1);
   static final le ag = new le(2, (byte)2);
   static final le am = new le(1, (byte)3);
   final int ax;
   final byte aq;
   static go so;

   static float[] al(JSONObject var0, String var1, byte var2) throws JSONException {
      try {
         float[] var3 = new float[4];

         try {
            JSONArray var4 = var0.getJSONArray(var1);
            var3[0] = (float)var4.optDouble(0, 0.0D);
            var3[1] = (float)var4.optDouble(1, 0.0D);
            var3[2] = (float)var4.optDouble(2, 1.0D);
            var3[3] = (float)var4.optDouble(3, 1.0D);
         } catch (JSONException var5) {
            var3[0] = 0.0F;
            var3[1] = 0.0F;
            var3[2] = 1.0F;
            var3[3] = 1.0F;
         }

         return var3;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "le.al(" + ')');
      }
   }

   le(int var1, byte var2) {
      try {
         super();
         this.ax = -210393387 * var1;
         this.aq = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "le.<init>(" + ')');
      }
   }

   static le[] ax(int var0) {
      try {
         return new le[]{am, ae, ac, ag};
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "le.ax(" + ')');
      }
   }

   public int ac(int var1) {
      try {
         return this.aq;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "le.ac(" + ')');
      }
   }

   public int ae() {
      return this.aq;
   }

   public int ag() {
      return this.aq;
   }

   public int am() {
      return this.aq;
   }

   static le[] aq() {
      return new le[]{am, ae, ac, ag};
   }

   static le[] af() {
      return new le[]{am, ae, ac, ag};
   }

   static final void bh(bk var0, int var1) {
      try {
         var0.ao = false;
         if (var0.ai != null) {
            if (var1 != -1935308761) {
               throw new IllegalStateException();
            }

            var0.ai.aq = 0;
         }

         for(bk var2 = var0.aq(); var2 != null; var2 = var0.af()) {
            if (var1 != -1935308761) {
               return;
            }

            bh(var2, -1935308761);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "le.bh(" + ')');
      }
   }
}
