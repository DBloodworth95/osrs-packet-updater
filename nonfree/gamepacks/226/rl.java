import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

public class rl {
   static final int aa = 27;
   final Map aj;
   final Map ai;
   public static final String ap = "Content-Type";
   final DecimalFormat ay;

   void bu() {
      this.aj.remove("Accept");
      if (!this.ai.isEmpty()) {
         this.aj.put("Accept", this.ao((byte)-98));
      }

   }

   public void ap(HttpsURLConnection var1, int var2) {
      try {
         Iterator var3 = this.aj.entrySet().iterator();

         while(var3.hasNext()) {
            if (var2 >= 16711680) {
               throw new IllegalStateException();
            }

            Entry var4 = (Entry)var3.next();
            var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "rl.ap(" + ')');
      }
   }

   public Map aw(int var1) {
      try {
         return this.aj;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rl.aw(" + ')');
      }
   }

   public void ak(String var1, String var2, int var3) {
      try {
         if (null != var1) {
            if (var3 == 1343002564) {
               throw new IllegalStateException();
            }

            if (!var1.isEmpty()) {
               Map var10000 = this.aj;
               String var10002;
               if (null != var2) {
                  if (var3 == 1343002564) {
                     throw new IllegalStateException();
                  }

                  var10002 = var2;
               } else {
                  var10002 = "";
               }

               var10000.put(var1, var10002);
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "rl.ak(" + ')');
      }
   }

   public void aj(String var1, int var2) {
      try {
         if (var1 != null && !var1.isEmpty()) {
            this.aj.remove(var1);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rl.aj(" + ')');
      }
   }

   void ai(rv var1, String var2, int var3) {
      try {
         String var4 = String.format("%s %s", var1.ap(-1562318103), var2);
         this.ak("Authorization", var4, 932573492);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "rl.ai(" + ')');
      }
   }

   void bh(rv var1, String var2) {
      String var3 = String.format("%s %s", var1.ap(-1380008424), var2);
      this.ak("Authorization", var3, -941076213);
   }

   public void as(String var1, int var2) {
      try {
         this.ai(rv.aw, var1, -1155135705);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rl.as(" + ')');
      }
   }

   public void ae(tz var1, int var2) {
      try {
         this.aj.put("Content-Type", var1.ap(199545867));
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rl.ae(" + ')');
      }
   }

   void bv(rv var1, String var2) {
      String var3 = String.format("%s %s", var1.ap(2023742858), var2);
      this.ak("Authorization", var3, 1729422598);
   }

   public void at(tz var1, byte var2) {
      try {
         this.au(var1, 1.0F, (byte)6);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rl.at(" + ')');
      }
   }

   public void bq(tz var1) {
      this.aj.put("Content-Type", var1.ap(-150581516));
   }

   public void bx(String var1) {
      this.ai(rv.ap, var1, -1987406717);
   }

   public void av(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.aj.put(var1, null != var2 ? var2 : "");
      }

   }

   public void af(HttpsURLConnection var1) {
      Iterator var2 = this.aj.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }

   }

   public Map az() {
      return this.aj;
   }

   public Map ab() {
      return this.aj;
   }

   void au(tz var1, float var2, byte var3) {
      try {
         this.ai.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
         this.an(-880771308);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "rl.au(" + ')');
      }
   }

   String bs() {
      ArrayList var1 = new ArrayList(this.ai.entrySet());
      Collections.sort(var1, new rp(this));
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(((tz)var4.getKey()).ap(-1040164880));
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = this.ay.format((double)var5);
            var2.append(";q=").append(var6);
         }
      }

      return var2.toString();
   }

   void bj(rv var1, String var2) {
      String var3 = String.format("%s %s", var1.ap(-1100605716), var2);
      this.ak("Authorization", var3, 1592786074);
   }

   public void ac(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.aj.put(var1, null != var2 ? var2 : "");
      }

   }

   public void al(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         this.aj.remove(var1);
      }

   }

   public void ax(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.aj.put(var1, null != var2 ? var2 : "");
      }

   }

   public void am(int var1) {
      try {
         this.aj.remove("Content-Type");
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rl.am(" + ')');
      }
   }

   public void ar(HttpsURLConnection var1) {
      Iterator var2 = this.aj.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }

   }

   public void aa(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         this.aj.remove(var1);
      }

   }

   public void ah(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         this.aj.remove(var1);
      }

   }

   String ao(byte var1) {
      try {
         ArrayList var2 = new ArrayList(this.ai.entrySet());
         Collections.sort(var2, new rp(this));
         StringBuilder var3 = new StringBuilder();
         Iterator var4 = var2.iterator();

         while(var4.hasNext()) {
            if (var1 >= 5) {
               throw new IllegalStateException();
            }

            Entry var5 = (Entry)var4.next();
            if (var3.length() > 0) {
               if (var1 >= 5) {
                  throw new IllegalStateException();
               }

               var3.append(",");
            }

            var3.append(((tz)var5.getKey()).ap(-430688124));
            float var6 = (Float)var5.getValue();
            if (var6 < 1.0F) {
               if (var1 >= 5) {
                  throw new IllegalStateException();
               }

               String var7 = this.ay.format((double)var6);
               var3.append(";q=").append(var7);
            }
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "rl.ao(" + ')');
      }
   }

   public void ay(String var1, byte var2) {
      try {
         this.ai(rv.ap, var1, -1665761326);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rl.ay(" + ')');
      }
   }

   void an(int var1) {
      try {
         this.aj.remove("Accept");
         if (!this.ai.isEmpty()) {
            this.aj.put("Accept", this.ao((byte)-46));
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rl.an(" + ')');
      }
   }

   public void aq(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.aj.put(var1, null != var2 ? var2 : "");
      }

   }

   public void bk(String var1) {
      this.ai(rv.ap, var1, -1495810647);
   }

   public void bb(String var1) {
      this.ai(rv.aw, var1, -1026902678);
   }

   public Map ag() {
      return this.aj;
   }

   public void bp() {
      this.aj.remove("Content-Type");
   }

   public void bz() {
      this.aj.remove("Content-Type");
   }

   public void bc(tz var1) {
      this.au(var1, 1.0F, (byte)6);
   }

   public void by(tz var1) {
      this.au(var1, 1.0F, (byte)6);
   }

   void br(tz var1, float var2) {
      this.ai.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.an(-880771308);
   }

   void bn() {
      this.aj.remove("Accept");
      if (!this.ai.isEmpty()) {
         this.aj.put("Accept", this.ao((byte)-96));
      }

   }

   public void ad(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.aj.put(var1, null != var2 ? var2 : "");
      }

   }

   void bt() {
      this.aj.remove("Accept");
      if (!this.ai.isEmpty()) {
         this.aj.put("Accept", this.ao((byte)-22));
      }

   }

   public rl() {
      try {
         super();
         this.aj = new HashMap();
         this.ai = new HashMap();
         this.ay = new DecimalFormat();
         this.ay.setMaximumFractionDigits(2);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "rl.<init>(" + ')');
      }
   }

   String bm() {
      ArrayList var1 = new ArrayList(this.ai.entrySet());
      Collections.sort(var1, new rp(this));
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(((tz)var4.getKey()).ap(780423815));
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = this.ay.format((double)var5);
            var2.append(";q=").append(var6);
         }
      }

      return var2.toString();
   }

   String bo() {
      ArrayList var1 = new ArrayList(this.ai.entrySet());
      Collections.sort(var1, new rp(this));
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(((tz)var4.getKey()).ap(-1113692834));
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = this.ay.format((double)var5);
            var2.append(";q=").append(var6);
         }
      }

      return var2.toString();
   }

   static void pk(int var0, byte var1) {
      try {
         iu var2 = ng.ap(var0, (short)119);
         if (!var2.au((byte)68)) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }
         } else {
            if (fu.af(1773066635 * var2.au, (byte)4) == 2) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               client.wa.add(1773066635 * var2.au);
            }

         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rl.pk(" + ')');
      }
   }

   public static void ap(String var0, Throwable var1, byte var2) {
      try {
         try {
            String var3 = "";
            if (null != var1) {
               Throwable var5 = var1;
               String var6;
               if (var1 instanceof wa) {
                  if (var2 >= 1) {
                     return;
                  }

                  wa var7 = (wa)var1;
                  var6 = var7.ay + " | ";
                  var5 = var7.as;
               } else {
                  var6 = "";
               }

               StringWriter var20 = new StringWriter();
               PrintWriter var8 = new PrintWriter(var20);
               var5.printStackTrace(var8);
               var8.close();
               String var9 = var20.toString();
               BufferedReader var10 = new BufferedReader(new StringReader(var9));
               String var11 = var10.readLine();

               while(true) {
                  String var12 = var10.readLine();
                  if (var12 == null) {
                     if (var2 >= 1) {
                        throw new IllegalStateException();
                     }

                     var6 = var6 + "| " + var11;
                     var3 = var6;
                     break;
                  }

                  int var13 = var12.indexOf(40);
                  int var14 = var12.indexOf(41, var13 + 1);
                  if (var13 >= 0) {
                     if (var2 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (var14 >= 0) {
                        if (var2 >= 1) {
                           throw new IllegalStateException();
                        }

                        String var15 = var12.substring(1 + var13, var14);
                        int var16 = var15.indexOf(".java:");
                        if (var16 >= 0) {
                           var15 = var15.substring(0, var16) + var15.substring(5 + var16);
                           var6 = var6 + var15 + ' ';
                           continue;
                        }

                        var12 = var12.substring(0, var13);
                     }
                  }

                  var12 = var12.trim();
                  var12 = var12.substring(var12.lastIndexOf(32) + 1);
                  var12 = var12.substring(var12.lastIndexOf(9) + 1);
                  var6 = var6 + var12 + ' ';
               }
            }

            if (var0 != null) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               if (null != var1) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  var3 = var3 + " | ";
               }

               var3 = var3 + var0;
            }

            System.out.println("Error: " + var3);
            var3 = var3.replace(':', '.');
            var3 = var3.replace('@', '_');
            var3 = var3.replace('&', '_');
            var3 = var3.replace('#', '_');
            if (wa.ap == null) {
               if (var2 >= 1) {
                  return;
               }

               return;
            }

            URL var4 = new URL(wa.ap.getCodeBase(), "clienterror.ws?cv=" + ts.ak * -1120652913 + "&cs=" + -797410619 * wa.aj + "&u=" + mh.aw + "&v1=" + io.ap + "&v2=" + io.aw + "&ct=" + -259692903 * eg.ai + "&e=" + var3);
            DataInputStream var19 = new DataInputStream(var4.openStream());
            var19.read();
            var19.close();
         } catch (Exception var17) {
         }

      } catch (RuntimeException var18) {
         throw tm.aw(var18, "rl.ap(" + ')');
      }
   }
}
