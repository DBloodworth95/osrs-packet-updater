import java.util.Locale;

@pi
@nh
public class px implements ps {
   static final px af;
   static final px ae;
   public static final px ag;
   public static final px ac;
   static final px ax;
   public static final px aq;
   static final px am;
   public static final int ad = 1;
   final int ar;
   final String au;
   static final px[] al;
   static String ce;
   final String at;
   static final int bn = 1;
   static final String ao = ",";

   static px[] ar() {
      return new px[]{af, ac, ag, aq, am, ax, ae};
   }

   public String toString() {
      try {
         return this.aq(-1280956978).toLowerCase(Locale.ENGLISH);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "px.toString(" + ')');
      }
   }

   String aq(int var1) {
      try {
         return this.au;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "px.aq(" + ')');
      }
   }

   public int ac(int var1) {
      try {
         return 1433910639 * this.ar;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "px.ac(" + ')');
      }
   }

   public static px af(int var0, int var1) {
      try {
         if (var0 >= 0) {
            if (var0 < al.length) {
               return al[var0];
            }

            if (var1 <= 1819017324) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "px.af(" + ')');
      }
   }

   public static px aa(int var0) {
      return var0 >= 0 && var0 < al.length ? al[var0] : null;
   }

   static px[] al() {
      return new px[]{af, ac, ag, aq, am, ax, ae};
   }

   public int ae() {
      return 1433910639 * this.ar;
   }

   public int ag() {
      return 1433910639 * this.ar;
   }

   static px[] ax(int var0) {
      try {
         return new px[]{af, ac, ag, aq, am, ax, ae};
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "px.ax(" + ')');
      }
   }

   public int am() {
      return 1433910639 * this.ar;
   }

   public String amp() {
      return this.aq(-1414792767).toLowerCase(Locale.ENGLISH);
   }

   public String ame() {
      return this.aq(141351781).toLowerCase(Locale.ENGLISH);
   }

   static px[] at() {
      return new px[]{af, ac, ag, aq, am, ax, ae};
   }

   static px[] au() {
      return new px[]{af, ac, ag, aq, am, ax, ae};
   }

   px(String var1, String var2, String var3, pc var4, int var5, String var6) {
      try {
         super();
         this.at = var1;
         this.au = var2;
         this.ar = 1530675599 * var5;
         if (var6 != null) {
            new Locale(var2.substring(0, 2), var6);
         } else {
            new Locale(var2.substring(0, 2));
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "px.<init>(" + ')');
      }
   }

   public String aml() {
      return this.aq(271209032).toLowerCase(Locale.ENGLISH);
   }

   String ad() {
      return this.au;
   }

   String ah() {
      return this.au;
   }

   String ap() {
      return this.au;
   }

   String ab() {
      return this.au;
   }

   public static px az(int var0) {
      return var0 >= 0 && var0 < al.length ? al[var0] : null;
   }

   static {
      ac = new px("EN", "en", "English", pc.ac, 0, "GB");
      ae = new px("DE", "de", "German", pc.ac, 1, "DE");
      ag = new px("FR", "fr", "French", pc.ac, 2, "FR");
      am = new px("PT", "pt", "Portuguese", pc.ac, 3, "BR");
      ax = new px("NL", "nl", "Dutch", pc.am, 4, "NL");
      aq = new px("ES", "es", "Spanish", pc.am, 5, "ES");
      af = new px("ES_MX", "es-mx", "Spanish (Latin American)", pc.ac, 6, "MX");
      px[] var0 = ax(-419870162);
      al = new px[var0.length];
      px[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         px var3 = var1[var2];
         if (null != al[1433910639 * var3.ar]) {
            throw new IllegalStateException();
         }

         al[var3.ar * 1433910639] = var3;
      }

   }
}
