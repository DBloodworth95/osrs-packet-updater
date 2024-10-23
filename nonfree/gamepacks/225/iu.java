import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class iu {
   int ag;
   Map ae;
   static final int ad = 9;
   static final iu am = new iu();
   static final int bd = 1076101600;
   static final String ac = "osrs";
   static ei qz;
   public static final int ce = 98;
   public static final int ax = 7;

   Map ad() {
      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      var2.addAll(this.ae.entrySet());
      boolean var3 = false;

      while(!var3) {
         var3 = true;

         for(int var5 = 0; var5 < var2.size() - 1; ++var5) {
            if (((iy)((Entry)var2.get(var5)).getValue()).ae(-835776689) > ((iy)((Entry)var2.get(var5 + 1)).getValue()).ae(-1556280551)) {
               Entry var4 = (Entry)var2.get(var5);
               var2.set(var5, var2.get(1 + var5));
               var2.set(var5 + 1, var4);
               var3 = false;
            }
         }
      }

      Iterator var7 = var2.iterator();

      while(var7.hasNext()) {
         Entry var6 = (Entry)var7.next();
         var1.put(var6.getKey(), var6.getValue());
      }

      return var1;
   }

   void ae(JSONObject var1, int var2, en var3, byte var4) {
      try {
         this.ae.clear();

         JSONObject var5;
         try {
            var5 = var1;
            this.ag = 2079605207 * var2;
            var1.getLong("lastfullsyncat");
            var1.getLong("lastcardupdatedat");
         } catch (Exception var8) {
            return;
         }

         try {
            this.ag(var5.getJSONArray("crmcomponents"), this.ag * -1291370009, var3, -1465360902);
         } catch (Exception var7) {
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "iu.ae(" + ')');
      }
   }

   static iu aq() {
      return am;
   }

   void ag(JSONArray var1, int var2, en var3, int var4) throws JSONException {
      try {
         if (var1 == null) {
            if (var4 >= 386953646) {
               throw new IllegalStateException();
            }
         } else {
            for(int var5 = 0; var5 < var1.length(); ++var5) {
               if (var4 >= 386953646) {
                  throw new IllegalStateException();
               }

               JSONObject var6 = var1.getJSONObject(var5);
               if (!var6.getString("game").equals("osrs")) {
                  if (var4 >= 386953646) {
                     throw new IllegalStateException();
                  }
               } else if (var6.getBoolean("removed")) {
                  if (var4 >= 386953646) {
                     throw new IllegalStateException();
                  }
               } else {
                  String var7 = var6.getString("platform");
                  if (!var7.equals("mobile")) {
                     if (var4 >= 386953646) {
                        throw new IllegalStateException();
                     }

                     if (!var7.equals("android")) {
                        if (var4 >= 386953646) {
                           return;
                        }

                        if (!var7.equals("ios")) {
                           iy var8 = new iy();

                           try {
                              var8.am(var6, var2, var3, 159943738);
                           } catch (Exception var10) {
                           }

                           if (!var8.af.isEmpty()) {
                              if (var4 >= 386953646) {
                                 return;
                              }

                              String var9 = var6.getString("location");
                              this.ae.put(var9, var8);
                           }
                        }
                     }
                  }
               }
            }

            this.ae = this.am(2095021776);
            hf.ac(-1598214665);
         }
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "iu.ag(" + ')');
      }
   }

   iy ax(String var1, byte var2) {
      try {
         return (iy)this.ae.get(var1);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "iu.ax(" + ')');
      }
   }

   static iu af() {
      return am;
   }

   iy ab(String var1) {
      return (iy)this.ae.get(var1);
   }

   void at(JSONObject var1, int var2, en var3) {
      this.ae.clear();

      JSONObject var4;
      try {
         var4 = var1;
         this.ag = 2079605207 * var2;
         var1.getLong("lastfullsyncat");
         var1.getLong("lastcardupdatedat");
      } catch (Exception var7) {
         return;
      }

      try {
         this.ag(var4.getJSONArray("crmcomponents"), this.ag * -1291370009, var3, -888718294);
      } catch (Exception var6) {
      }
   }

   iy az(String var1) {
      return (iy)this.ae.get(var1);
   }

   void ar(JSONArray var1, int var2, en var3) throws JSONException {
      if (var1 != null) {
         for(int var4 = 0; var4 < var1.length(); ++var4) {
            JSONObject var5 = var1.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
               String var6 = var5.getString("platform");
               if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                  iy var7 = new iy();

                  try {
                     var7.am(var5, var2, var3, -1067744031);
                  } catch (Exception var9) {
                  }

                  if (!var7.af.isEmpty()) {
                     String var8 = var5.getString("location");
                     this.ae.put(var8, var7);
                  }
               }
            }
         }

         this.ae = this.am(1981442657);
         hf.ac(-1598214665);
      }
   }

   void al(JSONArray var1, int var2, en var3) throws JSONException {
      if (var1 != null) {
         for(int var4 = 0; var4 < var1.length(); ++var4) {
            JSONObject var5 = var1.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
               String var6 = var5.getString("platform");
               if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                  iy var7 = new iy();

                  try {
                     var7.am(var5, var2, var3, 374846725);
                  } catch (Exception var9) {
                  }

                  if (!var7.af.isEmpty()) {
                     String var8 = var5.getString("location");
                     this.ae.put(var8, var7);
                  }
               }
            }
         }

         this.ae = this.am(1816761227);
         hf.ac(-1598214665);
      }
   }

   Map am(int var1) {
      try {
         HashMap var2 = new HashMap();
         ArrayList var3 = new ArrayList();
         var3.addAll(this.ae.entrySet());
         boolean var4 = false;

         while(!var4) {
            if (var1 <= 1439046340) {
               throw new IllegalStateException();
            }

            var4 = true;

            for(int var6 = 0; var6 < var3.size() - 1; ++var6) {
               if (var1 <= 1439046340) {
                  throw new IllegalStateException();
               }

               if (((iy)((Entry)var3.get(var6)).getValue()).ae(-568209220) > ((iy)((Entry)var3.get(var6 + 1)).getValue()).ae(133885899)) {
                  if (var1 <= 1439046340) {
                     throw new IllegalStateException();
                  }

                  Entry var5 = (Entry)var3.get(var6);
                  var3.set(var6, var3.get(1 + var6));
                  var3.set(var6 + 1, var5);
                  var4 = false;
               }
            }
         }

         Iterator var9 = var3.iterator();

         while(var9.hasNext()) {
            Entry var7 = (Entry)var9.next();
            var2.put(var7.getKey(), var7.getValue());
         }

         return var2;
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "iu.am(" + ')');
      }
   }

   iu() {
      try {
         super();
         this.ae = new HashMap();
         this.ag = 0;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "iu.<init>(" + ')');
      }
   }

   Map ap() {
      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      var2.addAll(this.ae.entrySet());
      boolean var3 = false;

      while(!var3) {
         var3 = true;

         for(int var5 = 0; var5 < var2.size() - 1; ++var5) {
            if (((iy)((Entry)var2.get(var5)).getValue()).ae(-768148311) > ((iy)((Entry)var2.get(var5 + 1)).getValue()).ae(-1486062963)) {
               Entry var4 = (Entry)var2.get(var5);
               var2.set(var5, var2.get(1 + var5));
               var2.set(var5 + 1, var4);
               var3 = false;
            }
         }
      }

      Iterator var7 = var2.iterator();

      while(var7.hasNext()) {
         Entry var6 = (Entry)var7.next();
         var1.put(var6.getKey(), var6.getValue());
      }

      return var1;
   }

   void au(JSONObject var1, int var2, en var3) {
      this.ae.clear();

      JSONObject var4;
      try {
         var4 = var1;
         this.ag = 2079605207 * var2;
         var1.getLong("lastfullsyncat");
         var1.getLong("lastcardupdatedat");
      } catch (Exception var7) {
         return;
      }

      try {
         this.ag(var4.getJSONArray("crmcomponents"), this.ag * 2016947039, var3, -471990993);
      } catch (Exception var6) {
      }
   }

   Map ah() {
      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      var2.addAll(this.ae.entrySet());
      boolean var3 = false;

      while(!var3) {
         var3 = true;

         for(int var5 = 0; var5 < var2.size() - 1; ++var5) {
            if (((iy)((Entry)var2.get(var5)).getValue()).ae(1401747852) > ((iy)((Entry)var2.get(var5 + 1)).getValue()).ae(1139776501)) {
               Entry var4 = (Entry)var2.get(var5);
               var2.set(var5, var2.get(1 + var5));
               var2.set(var5 + 1, var4);
               var3 = false;
            }
         }
      }

      Iterator var7 = var2.iterator();

      while(var7.hasNext()) {
         Entry var6 = (Entry)var7.next();
         var1.put(var6.getKey(), var6.getValue());
      }

      return var1;
   }

   iy aa(String var1) {
      return (iy)this.ae.get(var1);
   }
}
