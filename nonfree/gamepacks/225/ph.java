import java.util.Comparator;

final class ph implements Comparator {
   public static final int ay = 64;
   public static final int am = 5;

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((pv)var1, (pv)var2, -347192915);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ph.compare(" + ')');
      }
   }

   int ac(pv var1, pv var2, int var3) {
      try {
         byte var10000;
         if (5047651792030600117L * var1.ae < var2.ae * 5047651792030600117L) {
            var10000 = -1;
         } else if (var1.ae * 5047651792030600117L == var2.ae * 5047651792030600117L) {
            if (var3 <= -1856457959) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ph.ac(" + ')');
      }
   }

   public int ax(Object var1, Object var2) {
      return this.ac((pv)var1, (pv)var2, 2036923653);
   }

   public boolean gg(Object var1) {
      return super.equals(var1);
   }

   public int aq(Object var1, Object var2) {
      return this.ac((pv)var1, (pv)var2, 1592326054);
   }

   public int af(Object var1, Object var2) {
      return this.ac((pv)var1, (pv)var2, 1863357594);
   }

   public boolean gn(Object var1) {
      return super.equals(var1);
   }

   int am(pv var1, pv var2) {
      return 5047651792030600117L * var1.ae < var2.ae * 5047651792030600117L ? -1 : (var1.ae * 5047651792030600117L == var2.ae * 5047651792030600117L ? 0 : 1);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ph.equals(" + ')');
      }
   }

   int ag(pv var1, pv var2) {
      return 5047651792030600117L * var1.ae < var2.ae * 5047651792030600117L ? -1 : (var1.ae * 5047651792030600117L == var2.ae * 5047651792030600117L ? 0 : 1);
   }

   int ae(pv var1, pv var2) {
      return 5047651792030600117L * var1.ae < var2.ae * 5047651792030600117L ? -1 : (var1.ae * 5047651792030600117L == var2.ae * 5047651792030600117L ? 0 : 1);
   }
}
