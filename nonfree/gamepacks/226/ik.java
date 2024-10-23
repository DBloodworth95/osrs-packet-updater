import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ik {
   ArrayList aj;
   int ak;
   String aw;
   ArrayList ai;
   ArrayList ay;
   String as;
   Map am;
   float[] ae;
   Map at;
   public static final int ar = 16384;
   static final int ao = 4096;

   int aw(int var1) {
      try {
         return this.ak * 317672541;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ik.aw(" + ')');
      }
   }

   String ap(int var1) {
      try {
         return this.aw;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ik.ap(" + ')');
      }
   }

   String ao() {
      return this.aw;
   }

   void ak(byte var1) {
      try {
         this.as = null;
         this.ae[0] = 0.0F;
         this.ae[1] = 0.0F;
         this.ae[2] = 1.0F;
         this.ae[3] = 1.0F;
         this.aj.clear();
         this.ai.clear();
         this.ay.clear();
         this.am.clear();
         this.at.clear();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ik.ak(" + ')');
      }
   }

   boolean aj(JSONObject var1, int var2, ex var3, int var4) {
      try {
         JSONObject var5 = var1;
         if (var2 < 2) {
            try {
               var5 = var5.getJSONObject("message");
            } catch (Exception var14) {
               this.ak((byte)67);
               return false;
            }

            try {
               this.ai(var5.getJSONArray("images"), var3, -52703290);
            } catch (Exception var13) {
               this.ai.clear();
            }

            try {
               this.as(var5.getJSONArray("labels"), (byte)0);
            } catch (Exception var12) {
               this.ay.clear();
            }
         } else {
            try {
               this.ay(var5.getJSONObject("image"), var3, (byte)13);
            } catch (Exception var11) {
               this.ai.clear();
            }

            try {
               this.ae(var5.getJSONObject("label"), 1709285856);
            } catch (Exception var10) {
               this.ay.clear();
            }
         }

         try {
            this.am(var5.getJSONObject("behaviour"), 1100670350);
         } catch (Exception var9) {
            this.as = null;
            this.ae[0] = 0.0F;
            this.ae[1] = 0.0F;
            this.ae[2] = 1.0F;
            this.ae[3] = 1.0F;
            this.aj.clear();
         }

         try {
            JSONObject var6 = var5.optJSONObject("meta");
            if (var6 != null) {
               if (var4 >= -603623627) {
                  throw new IllegalStateException();
               }

               this.at(var5.getJSONObject("meta"), (byte)13);
            }
         } catch (Exception var8) {
            this.am.clear();
            this.at.clear();
         }

         if (2 == var2) {
            if (var4 >= -603623627) {
               throw new IllegalStateException();
            }

            try {
               this.aw = var5.getString("id");
               this.ak = Integer.parseInt(var5.getString("priority")) * -1373313035;
            } catch (Exception var7) {
            }
         }

         return true;
      } catch (RuntimeException var15) {
         throw tm.aw(var15, "ik.aj(" + ')');
      }
   }

   static int by(String var0) {
      if (var0.equals("centre")) {
         return 1;
      } else {
         return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
      }
   }

   void aa(JSONArray var1) throws JSONException {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            ig var4 = new ig(this);
            var4.aj = var3.getString("text");
            var4.ay = rk.an(var3.getString("align_x"), 2023971881) * -1198962889;
            var4.as = rk.an(var3.getString("align_y"), 2023971881) * 1623718193;
            var4.ae = var3.getInt("font") * 605008357;
            var4.ai = bp.au(var3, "placement", (byte)-43);
            this.ay.add(var4);
         }

      }
   }

   void as(JSONArray var1, byte var2) throws JSONException {
      try {
         if (var1 != null) {
            for(int var3 = 0; var3 < var1.length(); ++var3) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               JSONObject var4 = var1.getJSONObject(var3);
               ig var5 = new ig(this);
               var5.aj = var4.getString("text");
               var5.ay = rk.an(var4.getString("align_x"), 2023971881) * -1198962889;
               var5.as = rk.an(var4.getString("align_y"), 2023971881) * 1623718193;
               var5.ae = var4.getInt("font") * 308915115;
               var5.ai = bp.au(var4, "placement", (byte)-87);
               this.ay.add(var5);
            }

         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ik.as(" + ')');
      }
   }

   void ae(JSONObject var1, int var2) throws JSONException {
      try {
         ig var3 = new ig(this);
         var3.aj = var1.optString("text");
         var3.ay = rk.an(var1.optString("align_x"), 2023971881) * -1198962889;
         var3.as = rk.an(var1.optString("align_y"), 2023971881) * 1623718193;
         var3.ae = var1.optInt("font") * 308915115;
         var3.ai = bp.au(var1, "placement", (byte)12);
         this.ay.add(var3);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ik.ae(" + ')');
      }
   }

   void am(JSONObject var1, int var2) throws JSONException {
      try {
         if (var1 == null) {
            if (var2 <= -151517066) {
               throw new IllegalStateException();
            }
         } else {
            this.ae = bp.au(var1, "clickbounds", (byte)4);
            this.as = var1.getString("endpoint");
            String[] var3 = JSONObject.getNames(var1);

            for(int var4 = 0; var4 < var1.length(); ++var4) {
               if (var2 <= -151517066) {
                  throw new IllegalStateException();
               }

               if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
                  if (var2 <= -151517066) {
                     return;
                  }

                  try {
                     int var5 = var1.getInt(var3[var4]);
                     this.aj.add(new iw(this, var3[var4], var5));
                  } catch (Exception var8) {
                     try {
                        String var6 = var1.getString(var3[var4]);
                        if (var6.equals("true")) {
                           this.aj.add(new iw(this, var3[var4], 1));
                        } else if (var6.equals("false")) {
                           if (var2 <= -151517066) {
                              throw new IllegalStateException();
                           }

                           this.aj.add(new iw(this, var3[var4], 0));
                        } else {
                           this.aj.add(new iy(this, var3[var4], var6));
                        }
                     } catch (Exception var7) {
                     }
                  }
               }
            }

         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "ik.am(" + ')');
      }
   }

   void at(JSONObject var1, byte var2) throws JSONException {
      try {
         String[] var3 = JSONObject.getNames(var1);

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            if (var2 != 13) {
               throw new IllegalStateException();
            }

            try {
               int var5 = var1.optInt(var3[var4]);
               this.am.put(var3[var4], var5);
            } catch (Exception var8) {
               try {
                  String var6 = var1.optString(var3[var4]);
                  if (var6.equals("true")) {
                     if (var2 != 13) {
                        throw new IllegalStateException();
                     }

                     this.am.put(var3[var4], 1);
                  } else if (var6.equals("false")) {
                     if (var2 != 13) {
                        throw new IllegalStateException();
                     }

                     this.am.put(var3[var4], 0);
                  } else {
                     this.at.put(var3[var4], var6);
                  }
               } catch (Exception var7) {
               }
            }
         }

      } catch (RuntimeException var9) {
         throw tm.aw(var9, "ik.at(" + ')');
      }
   }

   void al(JSONObject var1, ex var2) throws JSONException {
      try {
         ix var3 = new ix(this);
         var3.ap = var2.ai(new URL(var1.getString("src")), (short)326);
         var3.aw = bp.au(var1, "placement", (byte)-58);
         this.ai.add(var3);
      } catch (MalformedURLException var4) {
      }

   }

   String af() {
      return this.aw;
   }

   int ar() {
      return this.ak * 317672541;
   }

   void ab() {
      this.as = null;
      this.ae[0] = 0.0F;
      this.ae[1] = 0.0F;
      this.ae[2] = 1.0F;
      this.ae[3] = 1.0F;
      this.aj.clear();
      this.ai.clear();
      this.ay.clear();
      this.am.clear();
      this.at.clear();
   }

   static String oi(ng var0, int var1) {
      try {
         if (db.aw(gr.oa(var0, 239856762), (byte)2) == 0) {
            return null;
         } else {
            if (null != var0.eo) {
               if (var1 != -513487987) {
                  throw new IllegalStateException();
               }

               if (var0.eo.trim().length() != 0) {
                  return var0.eo;
               }

               if (var1 != -513487987) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ik.oi(" + ')');
      }
   }

   void ag() {
      this.as = null;
      this.ae[0] = 0.0F;
      this.ae[1] = 0.0F;
      this.ae[2] = 1.0F;
      this.ae[3] = 1.0F;
      this.aj.clear();
      this.ai.clear();
      this.ay.clear();
      this.am.clear();
      this.at.clear();
   }

   void ah(JSONArray var1) throws JSONException {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            ig var4 = new ig(this);
            var4.aj = var3.getString("text");
            var4.ay = rk.an(var3.getString("align_x"), 2023971881) * -1198962889;
            var4.as = rk.an(var3.getString("align_y"), 2023971881) * 1623718193;
            var4.ae = var3.getInt("font") * 459064979;
            var4.ai = bp.au(var3, "placement", (byte)-82);
            this.ay.add(var4);
         }

      }
   }

   boolean ac(JSONObject var1, int var2, ex var3) {
      JSONObject var4 = var1;
      if (var2 < 2) {
         try {
            var4 = var4.getJSONObject("message");
         } catch (Exception var13) {
            this.ak((byte)105);
            return false;
         }

         try {
            this.ai(var4.getJSONArray("images"), var3, -52703290);
         } catch (Exception var12) {
            this.ai.clear();
         }

         try {
            this.as(var4.getJSONArray("labels"), (byte)0);
         } catch (Exception var11) {
            this.ay.clear();
         }
      } else {
         try {
            this.ay(var4.getJSONObject("image"), var3, (byte)29);
         } catch (Exception var10) {
            this.ai.clear();
         }

         try {
            this.ae(var4.getJSONObject("label"), 1022678704);
         } catch (Exception var9) {
            this.ay.clear();
         }
      }

      try {
         this.am(var4.getJSONObject("behaviour"), 626819664);
      } catch (Exception var8) {
         this.as = null;
         this.ae[0] = 0.0F;
         this.ae[1] = 0.0F;
         this.ae[2] = 1.0F;
         this.ae[3] = 1.0F;
         this.aj.clear();
      }

      try {
         JSONObject var5 = var4.optJSONObject("meta");
         if (var5 != null) {
            this.at(var4.getJSONObject("meta"), (byte)13);
         }
      } catch (Exception var7) {
         this.am.clear();
         this.at.clear();
      }

      if (2 == var2) {
         try {
            this.aw = var4.getString("id");
            this.ak = Integer.parseInt(var4.getString("priority")) * -901848849;
         } catch (Exception var6) {
         }
      }

      return true;
   }

   void ad() {
      this.as = null;
      this.ae[0] = 0.0F;
      this.ae[1] = 0.0F;
      this.ae[2] = 1.0F;
      this.ae[3] = 1.0F;
      this.aj.clear();
      this.ai.clear();
      this.ay.clear();
      this.am.clear();
      this.at.clear();
   }

   void az() {
      this.as = null;
      this.ae[0] = 0.0F;
      this.ae[1] = 0.0F;
      this.ae[2] = 1.0F;
      this.ae[3] = 1.0F;
      this.aj.clear();
      this.ai.clear();
      this.ay.clear();
      this.am.clear();
      this.at.clear();
   }

   void aq(JSONObject var1, ex var2) throws JSONException {
      try {
         ix var3 = new ix(this);
         var3.ap = var2.ai(new URL(var1.getString("src")), (short)326);
         var3.aw = bp.au(var1, "placement", (byte)-66);
         this.ai.add(var3);
      } catch (MalformedURLException var4) {
      }

   }

   void bv(JSONObject var1) throws JSONException {
      if (var1 != null) {
         this.ae = bp.au(var1, "clickbounds", (byte)-92);
         this.as = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.aj.add(new iw(this, var2[var3], var4));
               } catch (Exception var7) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.aj.add(new iw(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.aj.add(new iw(this, var2[var3], 0));
                     } else {
                        this.aj.add(new iy(this, var2[var3], var5));
                     }
                  } catch (Exception var6) {
                  }
               }
            }
         }

      }
   }

   ik() {
      try {
         super();
         this.ak = 0;
         this.aj = new ArrayList();
         this.ai = new ArrayList();
         this.ay = new ArrayList();
         this.as = null;
         this.ae = new float[4];
         this.am = new HashMap();
         this.at = new HashMap();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ik.<init>(" + ')');
      }
   }

   void ai(JSONArray var1, ex var2, int var3) throws JSONException {
      try {
         if (var1 == null) {
            if (var3 == -52703290) {
               ;
            }
         } else {
            for(int var4 = 0; var4 < var1.length(); ++var4) {
               if (var3 != -52703290) {
                  throw new IllegalStateException();
               }

               try {
                  JSONObject var5 = var1.getJSONObject(var4);
                  ix var6 = new ix(this);
                  var6.ap = var2.ai(new URL(var5.getString("src")), (short)326);
                  var6.aw = bp.au(var5, "placement", (byte)10);
                  this.ai.add(var6);
               } catch (MalformedURLException var7) {
               }
            }

         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "ik.ai(" + ')');
      }
   }

   void bh(JSONArray var1) throws JSONException {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            ig var4 = new ig(this);
            var4.aj = var3.getString("text");
            var4.ay = rk.an(var3.getString("align_x"), 2023971881) * -1198962889;
            var4.as = rk.an(var3.getString("align_y"), 2023971881) * 1623718193;
            var4.ae = var3.getInt("font") * 308915115;
            var4.ai = bp.au(var3, "placement", (byte)-69);
            this.ay.add(var4);
         }

      }
   }

   void bj(JSONObject var1) throws JSONException {
      ig var2 = new ig(this);
      var2.aj = var1.optString("text");
      var2.ay = rk.an(var1.optString("align_x"), 2023971881) * -1198962889;
      var2.as = rk.an(var1.optString("align_y"), 2023971881) * 1623718193;
      var2.ae = var1.optInt("font") * 308915115;
      var2.ai = bp.au(var1, "placement", (byte)-86);
      this.ay.add(var2);
   }

   void ax(JSONArray var1, ex var2) throws JSONException {
      if (var1 != null) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               ix var5 = new ix(this);
               var5.ap = var2.ai(new URL(var4.getString("src")), (short)326);
               var5.aw = bp.au(var4, "placement", (byte)-120);
               this.ai.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   void bx(JSONObject var1) throws JSONException {
      if (var1 != null) {
         this.ae = bp.au(var1, "clickbounds", (byte)-30);
         this.as = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.aj.add(new iw(this, var2[var3], var4));
               } catch (Exception var7) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.aj.add(new iw(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.aj.add(new iw(this, var2[var3], 0));
                     } else {
                        this.aj.add(new iy(this, var2[var3], var5));
                     }
                  } catch (Exception var6) {
                  }
               }
            }
         }

      }
   }

   void bk(JSONObject var1) throws JSONException {
      if (var1 != null) {
         this.ae = bp.au(var1, "clickbounds", (byte)13);
         this.as = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.aj.add(new iw(this, var2[var3], var4));
               } catch (Exception var7) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.aj.add(new iw(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.aj.add(new iw(this, var2[var3], 0));
                     } else {
                        this.aj.add(new iy(this, var2[var3], var5));
                     }
                  } catch (Exception var6) {
                  }
               }
            }
         }

      }
   }

   void bb(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.optInt(var2[var3]);
            this.am.put(var2[var3], var4);
         } catch (Exception var7) {
            try {
               String var5 = var1.optString(var2[var3]);
               if (var5.equals("true")) {
                  this.am.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.am.put(var2[var3], 0);
               } else {
                  this.at.put(var2[var3], var5);
               }
            } catch (Exception var6) {
            }
         }
      }

   }

   void bq(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.optInt(var2[var3]);
            this.am.put(var2[var3], var4);
         } catch (Exception var7) {
            try {
               String var5 = var1.optString(var2[var3]);
               if (var5.equals("true")) {
                  this.am.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.am.put(var2[var3], 0);
               } else {
                  this.at.put(var2[var3], var5);
               }
            } catch (Exception var6) {
            }
         }
      }

   }

   void bp(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.optInt(var2[var3]);
            this.am.put(var2[var3], var4);
         } catch (Exception var7) {
            try {
               String var5 = var1.optString(var2[var3]);
               if (var5.equals("true")) {
                  this.am.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.am.put(var2[var3], 0);
               } else {
                  this.at.put(var2[var3], var5);
               }
            } catch (Exception var6) {
            }
         }
      }

   }

   static float[] bz(JSONObject var0, String var1) throws JSONException {
      float[] var2 = new float[4];

      try {
         JSONArray var3 = var0.getJSONArray(var1);
         var2[0] = (float)var3.optDouble(0, 0.0D);
         var2[1] = (float)var3.optDouble(1, 0.0D);
         var2[2] = (float)var3.optDouble(2, 1.0D);
         var2[3] = (float)var3.optDouble(3, 1.0D);
      } catch (JSONException var4) {
         var2[0] = 0.0F;
         var2[1] = 0.0F;
         var2[2] = 1.0F;
         var2[3] = 1.0F;
      }

      return var2;
   }

   static float[] bc(JSONObject var0, String var1) throws JSONException {
      float[] var2 = new float[4];

      try {
         JSONArray var3 = var0.getJSONArray(var1);
         var2[0] = (float)var3.optDouble(0, 0.0D);
         var2[1] = (float)var3.optDouble(1, 0.0D);
         var2[2] = (float)var3.optDouble(2, 1.0D);
         var2[3] = (float)var3.optDouble(3, 1.0D);
      } catch (JSONException var4) {
         var2[0] = 0.0F;
         var2[1] = 0.0F;
         var2[2] = 1.0F;
         var2[3] = 1.0F;
      }

      return var2;
   }

   void av(JSONArray var1, ex var2) throws JSONException {
      if (var1 != null) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               ix var5 = new ix(this);
               var5.ap = var2.ai(new URL(var4.getString("src")), (short)326);
               var5.aw = bp.au(var4, "placement", (byte)-70);
               this.ai.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   void ay(JSONObject var1, ex var2, byte var3) throws JSONException {
      try {
         try {
            ix var4 = new ix(this);
            var4.ap = var2.ai(new URL(var1.getString("src")), (short)326);
            var4.aw = bp.au(var1, "placement", (byte)-106);
            this.ai.add(var4);
         } catch (MalformedURLException var5) {
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ik.ay(" + ')');
      }
   }
}
