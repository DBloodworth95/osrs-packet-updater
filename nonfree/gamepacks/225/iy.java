import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class iy {
   String af;
   String ae;
   int ag;
   ArrayList am;
   static final int ac = 2;
   ArrayList aq;
   ArrayList ax;
   float[] at;
   Map au;
   Map ar;

   void af(JSONArray var1, int var2) throws JSONException {
      try {
         if (null != var1) {
            for(int var3 = 0; var3 < var1.length(); ++var3) {
               if (var2 <= 1347950664) {
                  throw new IllegalStateException();
               }

               JSONObject var4 = var1.getJSONObject(var3);
               ih var5 = new ih(this);
               var5.am = var4.getString("text");
               var5.aq = il.ad(var4.getString("align_x"), 1233153724) * 156581945;
               var5.af = il.ad(var4.getString("align_y"), -1121170685) * 1073939701;
               var5.at = var4.getInt("font") * 1302513123;
               var5.ax = le.al(var4, "placement", (byte)-92);
               this.aq.add(var5);
            }

         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "iy.af(" + ')');
      }
   }

   static iu ac(byte var0) {
      try {
         return iu.am;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "iy.ac(" + ')');
      }
   }

   int ae(int var1) {
      try {
         return -1734312339 * this.ag;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "iy.ae(" + ')');
      }
   }

   void ag(byte var1) {
      try {
         this.af = null;
         this.at[0] = 0.0F;
         this.at[1] = 0.0F;
         this.at[2] = 1.0F;
         this.at[3] = 1.0F;
         this.am.clear();
         this.ax.clear();
         this.aq.clear();
         this.au.clear();
         this.ar.clear();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "iy.ag(" + ')');
      }
   }

   boolean am(JSONObject var1, int var2, en var3, int var4) {
      try {
         JSONObject var5 = var1;
         if (var2 < 2) {
            if (var4 >= 616356373) {
               throw new IllegalStateException();
            }

            try {
               var5 = var5.getJSONObject("message");
            } catch (Exception var14) {
               this.ag((byte)25);
               return false;
            }

            try {
               this.ax(var5.getJSONArray("images"), var3, 2009493505);
            } catch (Exception var13) {
               this.ax.clear();
            }

            try {
               this.af(var5.getJSONArray("labels"), 1580188755);
            } catch (Exception var12) {
               this.aq.clear();
            }
         } else {
            try {
               this.aq(var5.getJSONObject("image"), var3, 1003725143);
            } catch (Exception var11) {
               this.ax.clear();
            }

            try {
               this.at(var5.getJSONObject("label"), (byte)30);
            } catch (Exception var10) {
               this.aq.clear();
            }
         }

         try {
            this.au(var5.getJSONObject("behaviour"), (byte)0);
         } catch (Exception var9) {
            this.af = null;
            this.at[0] = 0.0F;
            this.at[1] = 0.0F;
            this.at[2] = 1.0F;
            this.at[3] = 1.0F;
            this.am.clear();
         }

         try {
            JSONObject var6 = var5.optJSONObject("meta");
            if (var6 != null) {
               if (var4 >= 616356373) {
                  throw new IllegalStateException();
               }

               this.ar(var5.getJSONObject("meta"), 952411922);
            }
         } catch (Exception var8) {
            this.au.clear();
            this.ar.clear();
         }

         if (var2 == 2) {
            if (var4 >= 616356373) {
               throw new IllegalStateException();
            }

            try {
               this.ae = var5.getString("id");
               this.ag = Integer.parseInt(var5.getString("priority")) * 1456946021;
            } catch (Exception var7) {
            }
         }

         return true;
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "iy.am(" + ')');
      }
   }

   void ax(JSONArray var1, en var2, int var3) throws JSONException {
      try {
         if (null != var1) {
            for(int var4 = 0; var4 < var1.length(); ++var4) {
               if (var3 <= -289381187) {
                  throw new IllegalStateException();
               }

               try {
                  JSONObject var5 = var1.getJSONObject(var4);
                  ix var6 = new ix(this);
                  var6.ac = var2.ax(new URL(var5.getString("src")), 1519379132);
                  var6.ae = le.al(var5, "placement", (byte)-24);
                  this.ax.add(var6);
               } catch (MalformedURLException var7) {
               }
            }

         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "iy.ax(" + ')');
      }
   }

   void aq(JSONObject var1, en var2, int var3) throws JSONException {
      try {
         try {
            ix var4 = new ix(this);
            var4.ac = var2.ax(new URL(var1.getString("src")), -105368257);
            var4.ae = le.al(var1, "placement", (byte)-42);
            this.ax.add(var4);
         } catch (MalformedURLException var5) {
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "iy.aq(" + ')');
      }
   }

   static int bz(String var0) {
      if (var0.equals("centre")) {
         return 1;
      } else {
         return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
      }
   }

   boolean ao(JSONObject var1, int var2, en var3) {
      JSONObject var4 = var1;
      if (var2 < 2) {
         try {
            var4 = var4.getJSONObject("message");
         } catch (Exception var13) {
            this.ag((byte)25);
            return false;
         }

         try {
            this.ax(var4.getJSONArray("images"), var3, 1228044171);
         } catch (Exception var12) {
            this.ax.clear();
         }

         try {
            this.af(var4.getJSONArray("labels"), 1645654560);
         } catch (Exception var11) {
            this.aq.clear();
         }
      } else {
         try {
            this.aq(var4.getJSONObject("image"), var3, 1150469714);
         } catch (Exception var10) {
            this.ax.clear();
         }

         try {
            this.at(var4.getJSONObject("label"), (byte)92);
         } catch (Exception var9) {
            this.aq.clear();
         }
      }

      try {
         this.au(var4.getJSONObject("behaviour"), (byte)0);
      } catch (Exception var8) {
         this.af = null;
         this.at[0] = 0.0F;
         this.at[1] = 0.0F;
         this.at[2] = 1.0F;
         this.at[3] = 1.0F;
         this.am.clear();
      }

      try {
         JSONObject var5 = var4.optJSONObject("meta");
         if (var5 != null) {
            this.ar(var4.getJSONObject("meta"), 952411922);
         }
      } catch (Exception var7) {
         this.au.clear();
         this.ar.clear();
      }

      if (var2 == 2) {
         try {
            this.ae = var4.getString("id");
            this.ag = Integer.parseInt(var4.getString("priority")) * 1456946021;
         } catch (Exception var6) {
         }
      }

      return true;
   }

   void au(JSONObject var1, byte var2) throws JSONException {
      try {
         if (var1 == null) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }
         } else {
            this.at = le.al(var1, "clickbounds", (byte)-16);
            this.af = var1.getString("endpoint");
            String[] var3 = JSONObject.getNames(var1);

            for(int var4 = 0; var4 < var1.length(); ++var4) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               if (!var3[var4].equals("clickbounds")) {
                  if (var2 != 0) {
                     throw new IllegalStateException();
                  }

                  if (!var3[var4].equals("endpoint")) {
                     if (var2 != 0) {
                        return;
                     }

                     try {
                        int var5 = var1.getInt(var3[var4]);
                        this.am.add(new ij(this, var3[var4], var5));
                     } catch (Exception var8) {
                        try {
                           String var6 = var1.getString(var3[var4]);
                           if (var6.equals("true")) {
                              this.am.add(new ij(this, var3[var4], 1));
                           } else if (var6.equals("false")) {
                              if (var2 != 0) {
                                 return;
                              }

                              this.am.add(new ij(this, var3[var4], 0));
                           } else {
                              this.am.add(new ik(this, var3[var4], var6));
                           }
                        } catch (Exception var7) {
                        }
                     }
                  }
               }
            }

         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "iy.au(" + ')');
      }
   }

   void ar(JSONObject var1, int var2) throws JSONException {
      try {
         String[] var3 = JSONObject.getNames(var1);

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            if (var2 != 952411922) {
               throw new IllegalStateException();
            }

            try {
               int var5 = var1.optInt(var3[var4]);
               this.au.put(var3[var4], var5);
            } catch (Exception var8) {
               try {
                  String var6 = var1.optString(var3[var4]);
                  if (var6.equals("true")) {
                     if (var2 != 952411922) {
                        throw new IllegalStateException();
                     }

                     this.au.put(var3[var4], 1);
                  } else if (var6.equals("false")) {
                     if (var2 != 952411922) {
                        throw new IllegalStateException();
                     }

                     this.au.put(var3[var4], 0);
                  } else {
                     this.ar.put(var3[var4], var6);
                  }
               } catch (Exception var7) {
               }
            }
         }

      } catch (RuntimeException var9) {
         throw vk.ae(var9, "iy.ar(" + ')');
      }
   }

   void bm(JSONObject var1) throws JSONException {
      if (var1 != null) {
         this.at = le.al(var1, "clickbounds", (byte)-40);
         this.af = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.am.add(new ij(this, var2[var3], var4));
               } catch (Exception var7) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.am.add(new ij(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.am.add(new ij(this, var2[var3], 0));
                     } else {
                        this.am.add(new ik(this, var2[var3], var5));
                     }
                  } catch (Exception var6) {
                  }
               }
            }
         }

      }
   }

   void ba(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.optInt(var2[var3]);
            this.au.put(var2[var3], var4);
         } catch (Exception var7) {
            try {
               String var5 = var1.optString(var2[var3]);
               if (var5.equals("true")) {
                  this.au.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.au.put(var2[var3], 0);
               } else {
                  this.ar.put(var2[var3], var5);
               }
            } catch (Exception var6) {
            }
         }
      }

   }

   String ab() {
      return this.ae;
   }

   void aw(JSONArray var1, en var2) throws JSONException {
      if (null != var1) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               ix var5 = new ix(this);
               var5.ac = var2.ax(new URL(var4.getString("src")), -1029695928);
               var5.ae = le.al(var4, "placement", (byte)72);
               this.ax.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   iy() {
      try {
         super();
         this.ag = 0;
         this.am = new ArrayList();
         this.ax = new ArrayList();
         this.aq = new ArrayList();
         this.af = null;
         this.at = new float[4];
         this.au = new HashMap();
         this.ar = new HashMap();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "iy.<init>(" + ')');
      }
   }

   void ai() {
      this.af = null;
      this.at[0] = 0.0F;
      this.at[1] = 0.0F;
      this.at[2] = 1.0F;
      this.at[3] = 1.0F;
      this.am.clear();
      this.ax.clear();
      this.aq.clear();
      this.au.clear();
      this.ar.clear();
   }

   String ac(int var1) {
      try {
         return this.ae;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "iy.ac(" + ')');
      }
   }

   int az() {
      return -581097877 * this.ag;
   }

   void ay(JSONArray var1, en var2) throws JSONException {
      if (null != var1) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               ix var5 = new ix(this);
               var5.ac = var2.ax(new URL(var4.getString("src")), 817757407);
               var5.ae = le.al(var4, "placement", (byte)-16);
               this.ax.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   void aj(JSONArray var1, en var2) throws JSONException {
      if (null != var1) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               ix var5 = new ix(this);
               var5.ac = var2.ax(new URL(var4.getString("src")), 258343390);
               var5.ae = le.al(var4, "placement", (byte)76);
               this.ax.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   int aa() {
      return 237431233 * this.ag;
   }

   void av(JSONArray var1, en var2) throws JSONException {
      if (null != var1) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               ix var5 = new ix(this);
               var5.ac = var2.ax(new URL(var4.getString("src")), 1908590946);
               var5.ae = le.al(var4, "placement", (byte)-15);
               this.ax.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   void an(JSONObject var1, en var2) throws JSONException {
      try {
         ix var3 = new ix(this);
         var3.ac = var2.ax(new URL(var1.getString("src")), -527217718);
         var3.ae = le.al(var1, "placement", (byte)-28);
         this.ax.add(var3);
      } catch (MalformedURLException var4) {
      }

   }

   void ak(JSONObject var1, en var2) throws JSONException {
      try {
         ix var3 = new ix(this);
         var3.ac = var2.ax(new URL(var1.getString("src")), 587075963);
         var3.ae = le.al(var1, "placement", (byte)4);
         this.ax.add(var3);
      } catch (MalformedURLException var4) {
      }

   }

   void bn(JSONArray var1) throws JSONException {
      if (null != var1) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            ih var4 = new ih(this);
            var4.am = var3.getString("text");
            var4.aq = il.ad(var3.getString("align_x"), -275922520) * 156581945;
            var4.af = il.ad(var3.getString("align_y"), 345556291) * 1073939701;
            var4.at = var3.getInt("font") * 1302513123;
            var4.ax = le.al(var3, "placement", (byte)-39);
            this.aq.add(var4);
         }

      }
   }

   void bh(JSONArray var1) throws JSONException {
      if (null != var1) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            ih var4 = new ih(this);
            var4.am = var3.getString("text");
            var4.aq = il.ad(var3.getString("align_x"), -824443882) * 156581945;
            var4.af = il.ad(var3.getString("align_y"), 1536738436) * 1073939701;
            var4.at = var3.getInt("font") * 1302513123;
            var4.ax = le.al(var3, "placement", (byte)54);
            this.aq.add(var4);
         }

      }
   }

   void bs(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.optInt(var2[var3]);
            this.au.put(var2[var3], var4);
         } catch (Exception var7) {
            try {
               String var5 = var1.optString(var2[var3]);
               if (var5.equals("true")) {
                  this.au.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.au.put(var2[var3], 0);
               } else {
                  this.ar.put(var2[var3], var5);
               }
            } catch (Exception var6) {
            }
         }
      }

   }

   void bx(JSONObject var1) throws JSONException {
      if (var1 != null) {
         this.at = le.al(var1, "clickbounds", (byte)-14);
         this.af = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.am.add(new ij(this, var2[var3], var4));
               } catch (Exception var7) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.am.add(new ij(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.am.add(new ij(this, var2[var3], 0));
                     } else {
                        this.am.add(new ik(this, var2[var3], var5));
                     }
                  } catch (Exception var6) {
                  }
               }
            }
         }

      }
   }

   void bf(JSONObject var1) throws JSONException {
      if (var1 != null) {
         this.at = le.al(var1, "clickbounds", (byte)30);
         this.af = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.am.add(new ij(this, var2[var3], var4));
               } catch (Exception var7) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.am.add(new ij(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.am.add(new ij(this, var2[var3], 0));
                     } else {
                        this.am.add(new ik(this, var2[var3], var5));
                     }
                  } catch (Exception var6) {
                  }
               }
            }
         }

      }
   }

   static int bi(String var0) {
      if (var0.equals("centre")) {
         return 1;
      } else {
         return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
      }
   }

   void at(JSONObject var1, byte var2) throws JSONException {
      try {
         ih var3 = new ih(this);
         var3.am = var1.optString("text");
         String var6 = var1.optString("align_x");
         byte var5;
         if (var6.equals("centre")) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            var5 = 1;
         } else {
            label33: {
               if (!var6.equals("bottom")) {
                  if (!var6.equals("right")) {
                     var5 = 0;
                     break label33;
                  }

                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }
               }

               var5 = 2;
            }
         }

         var3.aq = 156581945 * var5;
         var3.af = il.ad(var1.optString("align_y"), -1109590455) * 1073939701;
         var3.at = var1.optInt("font") * 1302513123;
         var3.ax = le.al(var1, "placement", (byte)-111);
         this.aq.add(var3);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "iy.at(" + ')');
      }
   }

   void bw(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.optInt(var2[var3]);
            this.au.put(var2[var3], var4);
         } catch (Exception var7) {
            try {
               String var5 = var1.optString(var2[var3]);
               if (var5.equals("true")) {
                  this.au.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.au.put(var2[var3], 0);
               } else {
                  this.ar.put(var2[var3], var5);
               }
            } catch (Exception var6) {
            }
         }
      }

   }

   String ah() {
      return this.ae;
   }

   static float[] bj(JSONObject var0, String var1) throws JSONException {
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

   static float[] bp(JSONObject var0, String var1) throws JSONException {
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

   static float[] by(JSONObject var0, String var1) throws JSONException {
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

   static int bb(String var0) {
      if (var0.equals("centre")) {
         return 1;
      } else {
         return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
      }
   }

   void bd(JSONObject var1) throws JSONException {
      ih var2 = new ih(this);
      var2.am = var1.optString("text");
      String var5 = var1.optString("align_x");
      byte var4;
      if (var5.equals("centre")) {
         var4 = 1;
      } else if (!var5.equals("bottom") && !var5.equals("right")) {
         var4 = 0;
      } else {
         var4 = 2;
      }

      var2.aq = 156581945 * var4;
      var2.af = il.ad(var1.optString("align_y"), 1091617214) * 1073939701;
      var2.at = var1.optInt("font") * 1302513123;
      var2.ax = le.al(var1, "placement", (byte)41);
      this.aq.add(var2);
   }

   static int bg(String var0) {
      if (var0.equals("centre")) {
         return 1;
      } else {
         return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
      }
   }

   static int bl(String var0) {
      if (var0.equals("centre")) {
         return 1;
      } else {
         return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
      }
   }

   boolean as(JSONObject var1, int var2, en var3) {
      JSONObject var4 = var1;
      if (var2 < 2) {
         try {
            var4 = var4.getJSONObject("message");
         } catch (Exception var13) {
            this.ag((byte)25);
            return false;
         }

         try {
            this.ax(var4.getJSONArray("images"), var3, 216404908);
         } catch (Exception var12) {
            this.ax.clear();
         }

         try {
            this.af(var4.getJSONArray("labels"), 1797067791);
         } catch (Exception var11) {
            this.aq.clear();
         }
      } else {
         try {
            this.aq(var4.getJSONObject("image"), var3, 1828683145);
         } catch (Exception var10) {
            this.ax.clear();
         }

         try {
            this.at(var4.getJSONObject("label"), (byte)48);
         } catch (Exception var9) {
            this.aq.clear();
         }
      }

      try {
         this.au(var4.getJSONObject("behaviour"), (byte)0);
      } catch (Exception var8) {
         this.af = null;
         this.at[0] = 0.0F;
         this.at[1] = 0.0F;
         this.at[2] = 1.0F;
         this.at[3] = 1.0F;
         this.am.clear();
      }

      try {
         JSONObject var5 = var4.optJSONObject("meta");
         if (var5 != null) {
            this.ar(var4.getJSONObject("meta"), 952411922);
         }
      } catch (Exception var7) {
         this.au.clear();
         this.ar.clear();
      }

      if (var2 == 2) {
         try {
            this.ae = var4.getString("id");
            this.ag = Integer.parseInt(var4.getString("priority")) * -1410170335;
         } catch (Exception var6) {
         }
      }

      return true;
   }

   String ap() {
      return this.ae;
   }

   static int af(cr var0, cr var1, int var2, boolean var3, byte var4) {
      try {
         if (var2 == 1) {
            if (var4 != 12) {
               throw new IllegalStateException();
            } else {
               int var5 = var0.ah * -1508153235;
               int var6 = -1508153235 * var1.ah;
               if (!var3) {
                  if (var4 != 12) {
                     throw new IllegalStateException();
                  }

                  if (-1 == var5) {
                     if (var4 != 12) {
                        throw new IllegalStateException();
                     }

                     var5 = 2001;
                  }

                  if (-1 == var6) {
                     if (var4 != 12) {
                        throw new IllegalStateException();
                     }

                     var6 = 2001;
                  }
               }

               return var5 - var6;
            }
         } else if (var2 == 2) {
            if (var4 != 12) {
               throw new IllegalStateException();
            } else {
               return -1651324629 * var0.az - var1.az * -1651324629;
            }
         } else if (var2 == 3) {
            if (var4 != 12) {
               throw new IllegalStateException();
            } else if (var0.ab.equals("-")) {
               if (var1.ab.equals("-")) {
                  if (var4 != 12) {
                     throw new IllegalStateException();
                  } else {
                     return 0;
                  }
               } else {
                  return var3 ? -1 : 1;
               }
            } else if (var1.ab.equals("-")) {
               return var3 ? 1 : -1;
            } else {
               return var0.ab.compareTo(var1.ab);
            }
         } else {
            byte var8;
            if (var2 == 4) {
               if (var4 != 12) {
                  throw new IllegalStateException();
               } else {
                  if (var0.ap(-2131423672)) {
                     if (var1.ap(826917628)) {
                        if (var4 != 12) {
                           throw new IllegalStateException();
                        }

                        var8 = 0;
                     } else {
                        var8 = 1;
                     }
                  } else if (var1.ap(784728617)) {
                     if (var4 != 12) {
                        throw new IllegalStateException();
                     }

                     var8 = -1;
                  } else {
                     var8 = 0;
                  }

                  return var8;
               }
            } else {
               int var10000;
               if (var2 == 5) {
                  if (var0.ad((short)158)) {
                     if (var1.ad((short)158)) {
                        if (var4 != 12) {
                           throw new IllegalStateException();
                        }

                        var10000 = 0;
                     } else {
                        var10000 = 1;
                     }
                  } else {
                     var10000 = var1.ad((short)158) ? -1 : 0;
                  }

                  return var10000;
               } else if (6 == var2) {
                  if (var4 != 12) {
                     throw new IllegalStateException();
                  } else {
                     if (var0.ah(-555215806)) {
                        if (var4 != 12) {
                           throw new IllegalStateException();
                        }

                        if (var1.ah(1424435964)) {
                           if (var4 != 12) {
                              throw new IllegalStateException();
                           }

                           var8 = 0;
                        } else {
                           var8 = 1;
                        }
                     } else if (var1.ah(1067439620)) {
                        if (var4 != 12) {
                           throw new IllegalStateException();
                        }

                        var8 = -1;
                     } else {
                        var8 = 0;
                     }

                     return var8;
                  }
               } else if (7 == var2) {
                  if (var4 != 12) {
                     throw new IllegalStateException();
                  } else {
                     if (var0.ar((byte)8)) {
                        if (var4 != 12) {
                           throw new IllegalStateException();
                        }

                        if (var1.ar((byte)8)) {
                           if (var4 != 12) {
                              throw new IllegalStateException();
                           }

                           var10000 = 0;
                        } else {
                           var10000 = 1;
                        }
                     } else {
                        var10000 = var1.ar((byte)8) ? -1 : 0;
                     }

                     return var10000;
                  }
               } else {
                  return var0.al * -2102573495 - var1.al * -2102573495;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "iy.af(" + ')');
      }
   }
}
