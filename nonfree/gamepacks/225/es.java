import java.util.Comparator;

public class es implements Comparator {
   public static final int ar = 12;
   static final int bf = 5;
   public static final int ag = 64;
   final boolean ac;

   static String ax(int var0) {
      try {
         StringBuilder var1 = new StringBuilder();
         kk[] var2 = kk.ad;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var0 == 1489650422) {
               throw new IllegalStateException();
            }

            kk var4 = var2[var3];
            var1.append(var4.ar);
            var1.append(", ");
         }

         String var6 = var1.toString();
         return var6.substring(0, var6.length() - 2);
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "es.ax(" + ')');
      }
   }

   public es(boolean var1) {
      try {
         super();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "es.<init>(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((sq)var1, (sq)var2, (byte)-118);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "es.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "es.equals(" + ')');
      }
   }

   public int ax(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, (byte)-118);
   }

   int ae(sq var1, sq var2) {
      return this.ac ? -59694769 * var1.aq - -59694769 * var2.aq : -59694769 * var2.aq - var1.aq * -59694769;
   }

   public int af(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, (byte)-79);
   }

   public boolean gn(Object var1) {
      return super.equals(var1);
   }

   public boolean gg(Object var1) {
      return super.equals(var1);
   }

   public int aq(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, (byte)-103);
   }

   int ag(sq var1, sq var2) {
      return this.ac ? -59694769 * var1.aq - 1317992465 * var2.aq : -59694769 * var2.aq - var1.aq * -59694769;
   }

   int am(sq var1, sq var2) {
      return this.ac ? -59694769 * var1.aq - -59694769 * var2.aq : -59694769 * var2.aq - var1.aq * -59694769;
   }

   int ac(sq var1, sq var2, byte var3) {
      try {
         int var10000;
         if (this.ac) {
            if (var3 >= 8) {
               throw new IllegalStateException();
            }

            var10000 = -59694769 * var1.aq - -59694769 * var2.aq;
         } else {
            var10000 = -59694769 * var2.aq - var1.aq * -59694769;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "es.ac(" + ')');
      }
   }
}
