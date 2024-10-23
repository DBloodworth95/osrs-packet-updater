import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

public class rf {
   final Map am;
   public static final String ac = "Content-Type";
   static final int af = 7;
   final Map ax;
   final DecimalFormat aq;
   static final String ae = "Accept";

   public void ai(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         this.am.remove(var1);
      }

   }

   public void af(String var1, byte var2) {
      try {
         this.ax(rg.ae, var1, -1392249127);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "rf.af(" + ')');
      }
   }

   public Map ae(int var1) {
      try {
         return this.am;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "rf.ae(" + ')');
      }
   }

   public void ag(String var1, String var2, int var3) {
      try {
         if (var1 != null && !var1.isEmpty()) {
            if (var3 >= 524557037) {
               throw new IllegalStateException();
            }

            Map var10000 = this.am;
            String var10002;
            if (null != var2) {
               if (var3 >= 524557037) {
                  throw new IllegalStateException();
               }

               var10002 = var2;
            } else {
               var10002 = "";
            }

            var10000.put(var1, var10002);
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "rf.ag(" + ')');
      }
   }

   public void am(String var1, int var2) {
      try {
         if (null != var1) {
            if (var2 != -1347557672) {
               throw new IllegalStateException();
            }

            if (!var1.isEmpty()) {
               this.am.remove(var1);
            }
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "rf.am(" + ')');
      }
   }

   void ax(rg var1, String var2, int var3) {
      try {
         String var4 = String.format("%s %s", var1.ac((byte)-61), var2);
         this.ag("Authorization", var4, -1100298250);
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "rf.ax(" + ')');
      }
   }

   public void aq(String var1, int var2) {
      try {
         this.ax(rg.ac, var1, -1392249127);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "rf.aq(" + ')');
      }
   }

   void bf(te var1, float var2) {
      this.ax.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.ad(-1661900538);
   }

   public void au(byte var1) {
      try {
         this.am.remove("Content-Type");
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "rf.au(" + ')');
      }
   }

   public void aw(String var1) {
      this.ax(rg.ae, var1, -1392249127);
   }

   public void ar(te var1, int var2) {
      try {
         this.al(var1, 1.0F, (byte)-21);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "rf.ar(" + ')');
      }
   }

   void al(te var1, float var2, byte var3) {
      try {
         this.ax.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
         this.ad(1851215838);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "rf.al(" + ')');
      }
   }

   void ad(int var1) {
      try {
         this.am.remove("Accept");
         if (!this.ax.isEmpty()) {
            this.am.put("Accept", this.ah(1645946200));
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "rf.ad(" + ')');
      }
   }

   String ah(int var1) {
      try {
         ArrayList var2 = new ArrayList(this.ax.entrySet());
         Collections.sort(var2, new re(this));
         StringBuilder var3 = new StringBuilder();
         Iterator var4 = var2.iterator();

         while(var4.hasNext()) {
            if (var1 <= 1403806659) {
               throw new IllegalStateException();
            }

            Entry var5 = (Entry)var4.next();
            if (var3.length() > 0) {
               if (var1 <= 1403806659) {
                  throw new IllegalStateException();
               }

               var3.append(",");
            }

            var3.append(((te)var5.getKey()).ac(1075959671));
            float var6 = (Float)var5.getValue();
            if (var6 < 1.0F) {
               if (var1 <= 1403806659) {
                  throw new IllegalStateException();
               }

               String var7 = this.aq.format((double)var6);
               var3.append(";q=").append(var7);
            }
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "rf.ah(" + ')');
      }
   }

   public void ap(String var1, String var2) {
      if (var1 != null && !var1.isEmpty()) {
         this.am.put(var1, null != var2 ? var2 : "");
      }

   }

   public rf() {
      try {
         super();
         this.am = new HashMap();
         this.ax = new HashMap();
         this.aq = new DecimalFormat();
         this.aq.setMaximumFractionDigits(2);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "rf.<init>(" + ')');
      }
   }

   public void az(String var1, String var2) {
      if (var1 != null && !var1.isEmpty()) {
         this.am.put(var1, null != var2 ? var2 : "");
      }

   }

   public void aa(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         this.am.remove(var1);
      }

   }

   public void ac(HttpsURLConnection var1, byte var2) {
      try {
         Iterator var3 = this.am.entrySet().iterator();

         while(var3.hasNext()) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            Entry var4 = (Entry)var3.next();
            var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "rf.ac(" + ')');
      }
   }

   public void ao(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         this.am.remove(var1);
      }

   }

   void as(rg var1, String var2) {
      String var3 = String.format("%s %s", var1.ac((byte)103), var2);
      this.ag("Authorization", var3, -931730195);
   }

   void ay(rg var1, String var2) {
      String var3 = String.format("%s %s", var1.ac((byte)-53), var2);
      this.ag("Authorization", var3, -1767613631);
   }

   void aj(rg var1, String var2) {
      String var3 = String.format("%s %s", var1.ac((byte)-99), var2);
      this.ag("Authorization", var3, 411833538);
   }

   void av(rg var1, String var2) {
      String var3 = String.format("%s %s", var1.ac((byte)27), var2);
      this.ag("Authorization", var3, -775997800);
   }

   public void an(String var1) {
      this.ax(rg.ae, var1, -1392249127);
   }

   void bm(te var1, float var2) {
      this.ax.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.ad(-776555726);
   }

   public void at(te var1, short var2) {
      try {
         this.am.put("Content-Type", var1.ac(1075959671));
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "rf.at(" + ')');
      }
   }

   public void bn() {
      this.am.remove("Content-Type");
   }

   public void bh() {
      this.am.remove("Content-Type");
   }

   public void bd(te var1) {
      this.al(var1, 1.0F, (byte)-13);
   }

   public void bx(te var1) {
      this.al(var1, 1.0F, (byte)-48);
   }

   void ba() {
      this.am.remove("Accept");
      if (!this.ax.isEmpty()) {
         this.am.put("Accept", this.ah(1768966652));
      }

   }

   public void ak(te var1) {
      this.am.put("Content-Type", var1.ac(1075959671));
   }

   void bs() {
      this.am.remove("Accept");
      if (!this.ax.isEmpty()) {
         this.am.put("Accept", this.ah(1758580870));
      }

   }

   void bw() {
      this.am.remove("Accept");
      if (!this.ax.isEmpty()) {
         this.am.put("Accept", this.ah(1865999622));
      }

   }

   public void ab(String var1, String var2) {
      if (var1 != null && !var1.isEmpty()) {
         this.am.put(var1, null != var2 ? var2 : "");
      }

   }

   void bj() {
      this.am.remove("Accept");
      if (!this.ax.isEmpty()) {
         this.am.put("Accept", this.ah(1494352410));
      }

   }

   String bp() {
      ArrayList var1 = new ArrayList(this.ax.entrySet());
      Collections.sort(var1, new re(this));
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(((te)var4.getKey()).ac(1075959671));
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = this.aq.format((double)var5);
            var2.append(";q=").append(var6);
         }
      }

      return var2.toString();
   }
}
