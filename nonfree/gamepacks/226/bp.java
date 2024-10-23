import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class bp {
   static final int cc = 5;
   static final int aw = 2;
   static final int ap = 1;
   static vc ao;
   static final int ai = 1;
   int as;
   static final int bb = 6;
   int ae;
   static final int ak = 3;
   public static final int av = 1;
   public static final int bh = 32768;

   boolean ak(bx var1) {
      if (var1 == null) {
         return false;
      } else {
         switch(-402768948 * this.as) {
         case 1:
            return var1.ap(this.ae * -1882105617, (byte)3);
         case 2:
            return var1.aw(this.ae * -1882105617, (byte)8);
         case 3:
            return var1.ak((char)(1185448633 * this.ae), -243955335);
         case 4:
            return var1.aj(1 == 1252134687 * this.ae, (byte)-126);
         default:
            return false;
         }
      }
   }

   bp(int var1, int var2) {
      try {
         super();
         this.as = 145327019 * var1;
         this.ae = var2 * 735893007;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bp.<init>(" + ')');
      }
   }

   boolean aw(bx var1) {
      if (var1 == null) {
         return false;
      } else {
         switch(1937071875 * this.as) {
         case 1:
            return var1.ap(this.ae * -1882105617, (byte)3);
         case 2:
            return var1.aw(this.ae * -1625450586, (byte)57);
         case 3:
            return var1.ak((char)(-1882105617 * this.ae), -243955335);
         case 4:
            return var1.aj(1 == 1037165845 * this.ae, (byte)-61);
         default:
            return false;
         }
      }
   }

   boolean ap(bx var1, int var2) {
      try {
         if (var1 == null) {
            if (var2 >= -604024779) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            switch(1937071875 * this.as) {
            case 1:
               return var1.ap(this.ae * -1882105617, (byte)3);
            case 2:
               return var1.aw(this.ae * -1882105617, (byte)19);
            case 3:
               return var1.ak((char)(-1882105617 * this.ae), -243955335);
            case 4:
               boolean var10001;
               if (1 == -1882105617 * this.ae) {
                  if (var2 >= -604024779) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               return var1.aj(var10001, (byte)-22);
            default:
               return false;
            }
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bp.ap(" + ')');
      }
   }

   boolean aj(bx var1) {
      if (var1 == null) {
         return false;
      } else {
         switch(1937071875 * this.as) {
         case 1:
            return var1.ap(this.ae * -1882105617, (byte)3);
         case 2:
            return var1.aw(this.ae * -1882105617, (byte)73);
         case 3:
            return var1.ak((char)(-1882105617 * this.ae), -243955335);
         case 4:
            return var1.aj(1 == -1882105617 * this.ae, (byte)-1);
         default:
            return false;
         }
      }
   }

   boolean ai(bx var1) {
      if (var1 == null) {
         return false;
      } else {
         switch(1937071875 * this.as) {
         case 1:
            return var1.ap(this.ae * -1882105617, (byte)3);
         case 2:
            return var1.aw(this.ae * -1882105617, (byte)59);
         case 3:
            return var1.ak((char)(-1882105617 * this.ae), -243955335);
         case 4:
            return var1.aj(1 == -1882105617 * this.ae, (byte)-87);
         default:
            return false;
         }
      }
   }

   static float[] au(JSONObject var0, String var1, byte var2) throws JSONException {
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
         throw tm.aw(var6, "bp.au(" + ')');
      }
   }
}
