import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ib {
   Map aw;
   static int mk;
   int ak;
   static final ib aj = new ib();
   static final String ap = "osrs";

   public static dn ap(int var0, dy var1, int var2) {
      try {
         Iterator var3 = var1.iterator();

         while(var3.hasNext()) {
            if (var2 >= -1908999767) {
               throw new IllegalStateException();
            }

            dn var4 = (dn)var3.next();
            if (null != var4.an[var0]) {
               if (var2 >= -1908999767) {
                  throw new IllegalStateException();
               }

               if (var4.ap * -1948824391 != -1) {
                  if (var2 >= -1908999767) {
                     throw new IllegalStateException();
                  }

                  return var4;
               }
            }
         }

         return var1.aj(-1634950082);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ib.ap(" + ')');
      }
   }

   void aw(JSONObject var1, int var2, ex var3, int var4) {
      try {
         this.aw.clear();

         JSONObject var5;
         try {
            var5 = var1;
            this.ak = 457188623 * var2;
            var1.getLong("lastfullsyncat");
            var1.getLong("lastcardupdatedat");
         } catch (Exception var8) {
            return;
         }

         try {
            this.ak(var5.getJSONArray("crmcomponents"), this.ak * -1343084049, var3, -1270313536);
         } catch (Exception var7) {
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "ib.aw(" + ')');
      }
   }

   ik az(String var1) {
      return (ik)this.aw.get(var1);
   }

   Map aj(short var1) {
      try {
         HashMap var2 = new HashMap();
         ArrayList var3 = new ArrayList();
         var3.addAll(this.aw.entrySet());
         boolean var4 = false;

         while(!var4) {
            if (var1 != 179) {
               throw new IllegalStateException();
            }

            var4 = true;

            for(int var6 = 0; var6 < var3.size() - 1; ++var6) {
               if (((ik)((Entry)var3.get(var6)).getValue()).aw(-1558594739) > ((ik)((Entry)var3.get(var6 + 1)).getValue()).aw(-715795071)) {
                  Entry var5 = (Entry)var3.get(var6);
                  var3.set(var6, var3.get(1 + var6));
                  var3.set(1 + var6, var5);
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
         throw tm.aw(var8, "ib.aj(" + ')');
      }
   }

   static int ap(pe var0, pe var1, int var2) {
      try {
         int var3 = 0;
         String[] var4 = dq.dp;

         int var5;
         String var6;
         for(var5 = 0; var5 < var4.length; ++var5) {
            var6 = var4[var5];
            if (var0.cy(var6, "", 1888239096)) {
               ++var3;
            }
         }

         var4 = dq.dy;

         for(var5 = 0; var5 < var4.length; ++var5) {
            if (var2 <= -698810680) {
               throw new IllegalStateException();
            }

            var6 = var4[var5];
            if (var1.cy(var6, "", 1568427060)) {
               if (var2 <= -698810680) {
                  throw new IllegalStateException();
               }

               ++var3;
            }
         }

         var4 = dq.do;

         for(var5 = 0; var5 < var4.length; ++var5) {
            if (var2 <= -698810680) {
               throw new IllegalStateException();
            }

            var6 = var4[var5];
            if (var1.cf(var6, (byte)87) != -1) {
               if (var2 <= -698810680) {
                  throw new IllegalStateException();
               }

               if (var1.cy(var6, "", 281770322)) {
                  if (var2 <= -698810680) {
                     throw new IllegalStateException();
                  }

                  ++var3;
               }
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "ib.ap(" + ')');
      }
   }

   Map ab() {
      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      var2.addAll(this.aw.entrySet());
      boolean var3 = false;

      while(!var3) {
         var3 = true;

         for(int var5 = 0; var5 < var2.size() - 1; ++var5) {
            if (((ik)((Entry)var2.get(var5)).getValue()).aw(402709391) > ((ik)((Entry)var2.get(var5 + 1)).getValue()).aw(424776382)) {
               Entry var4 = (Entry)var2.get(var5);
               var2.set(var5, var2.get(1 + var5));
               var2.set(1 + var5, var4);
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

   static ib ay() {
      return aj;
   }

   static ib ae() {
      return aj;
   }

   void am(JSONObject var1, int var2, ex var3) {
      this.aw.clear();

      JSONObject var4;
      try {
         var4 = var1;
         this.ak = 24711587 * var2;
         var1.getLong("lastfullsyncat");
         var1.getLong("lastcardupdatedat");
      } catch (Exception var7) {
         return;
      }

      try {
         this.ak(var4.getJSONArray("crmcomponents"), this.ak * -1343084049, var3, -2003049514);
      } catch (Exception var6) {
      }
   }

   void at(JSONObject var1, int var2, ex var3) {
      this.aw.clear();

      JSONObject var4;
      try {
         var4 = var1;
         this.ak = -823236540 * var2;
         var1.getLong("lastfullsyncat");
         var1.getLong("lastcardupdatedat");
      } catch (Exception var7) {
         return;
      }

      try {
         this.ak(var4.getJSONArray("crmcomponents"), this.ak * -1486543225, var3, -1077185732);
      } catch (Exception var6) {
      }
   }

   void au(JSONObject var1, int var2, ex var3) {
      this.aw.clear();

      JSONObject var4;
      try {
         var4 = var1;
         this.ak = -330013807 * var2;
         var1.getLong("lastfullsyncat");
         var1.getLong("lastcardupdatedat");
      } catch (Exception var7) {
         return;
      }

      try {
         this.ak(var4.getJSONArray("crmcomponents"), this.ak * -1343084049, var3, -1134104082);
      } catch (Exception var6) {
      }
   }

   void an(JSONArray var1, int var2, ex var3) throws JSONException {
      if (var1 != null) {
         for(int var4 = 0; var4 < var1.length(); ++var4) {
            JSONObject var5 = var1.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
               String var6 = var5.getString("platform");
               if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                  ik var7 = new ik();

                  try {
                     var7.aj(var5, var2, var3, -1898122338);
                  } catch (Exception var9) {
                  }

                  if (!var7.as.isEmpty()) {
                     String var8 = var5.getString("location");
                     this.aw.put(var8, var7);
                  }
               }
            }
         }

         this.aw = this.aj((short)179);
         ck.ap(-1382846854);
      }
   }

   void ao(JSONArray var1, int var2, ex var3) throws JSONException {
      if (var1 != null) {
         for(int var4 = 0; var4 < var1.length(); ++var4) {
            JSONObject var5 = var1.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
               String var6 = var5.getString("platform");
               if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                  ik var7 = new ik();

                  try {
                     var7.aj(var5, var2, var3, -1517251090);
                  } catch (Exception var9) {
                  }

                  if (!var7.as.isEmpty()) {
                     String var8 = var5.getString("location");
                     this.aw.put(var8, var7);
                  }
               }
            }
         }

         this.aw = this.aj((short)179);
         ck.ap(-621517761);
      }
   }

   Map af() {
      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      var2.addAll(this.aw.entrySet());
      boolean var3 = false;

      while(!var3) {
         var3 = true;

         for(int var5 = 0; var5 < var2.size() - 1; ++var5) {
            if (((ik)((Entry)var2.get(var5)).getValue()).aw(111484271) > ((ik)((Entry)var2.get(var5 + 1)).getValue()).aw(983992341)) {
               Entry var4 = (Entry)var2.get(var5);
               var2.set(var5, var2.get(1 + var5));
               var2.set(1 + var5, var4);
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

   Map ar() {
      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      var2.addAll(this.aw.entrySet());
      boolean var3 = false;

      while(!var3) {
         var3 = true;

         for(int var5 = 0; var5 < var2.size() - 1; ++var5) {
            if (((ik)((Entry)var2.get(var5)).getValue()).aw(131415925) > ((ik)((Entry)var2.get(var5 + 1)).getValue()).aw(-1045191391)) {
               Entry var4 = (Entry)var2.get(var5);
               var2.set(var5, var2.get(1 + var5));
               var2.set(1 + var5, var4);
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

   void ak(JSONArray var1, int var2, ex var3, int var4) throws JSONException {
      try {
         if (var1 == null) {
            if (var4 >= -155270484) {
               throw new IllegalStateException();
            }
         } else {
            for(int var5 = 0; var5 < var1.length(); ++var5) {
               if (var4 >= -155270484) {
                  return;
               }

               JSONObject var6 = var1.getJSONObject(var5);
               if (!var6.getString("game").equals("osrs")) {
                  if (var4 >= -155270484) {
                     throw new IllegalStateException();
                  }
               } else if (var6.getBoolean("removed")) {
                  if (var4 >= -155270484) {
                     throw new IllegalStateException();
                  }
               } else {
                  String var7 = var6.getString("platform");
                  if (!var7.equals("mobile") && !var7.equals("android")) {
                     if (var4 >= -155270484) {
                        return;
                     }

                     if (var7.equals("ios")) {
                        if (var4 >= -155270484) {
                           throw new IllegalStateException();
                        }
                     } else {
                        ik var8 = new ik();

                        try {
                           var8.aj(var6, var2, var3, -1265006531);
                        } catch (Exception var10) {
                        }

                        if (!var8.as.isEmpty()) {
                           if (var4 >= -155270484) {
                              throw new IllegalStateException();
                           }

                           String var9 = var6.getString("location");
                           this.aw.put(var9, var8);
                        }
                     }
                  }
               }
            }

            this.aw = this.aj((short)179);
            ck.ap(-854386969);
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "ib.ak(" + ')');
      }
   }

   ib() {
      try {
         super();
         this.aw = new HashMap();
         this.ak = 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ib.<init>(" + ')');
      }
   }

   ik ag(String var1) {
      return (ik)this.aw.get(var1);
   }

   ik ai(String var1, byte var2) {
      try {
         return (ik)this.aw.get(var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ib.ai(" + ')');
      }
   }

   static ib as() {
      return aj;
   }

   static int am(int var0, int var1) {
      try {
         ce var2 = (ce)el.aw.ap((long)var0);
         if (var2 == null) {
            if (var1 != 1195419660) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return var2.ec == el.ak.ap ? -1 : ((ce)var2.ec).ap * -511622767;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ib.am(" + ')');
      }
   }
}
