import java.util.Comparator;
import java.util.List;

final class pd implements Comparator {
   static final int ak = 0;
   static List wf;
   public static final int bl = 65;

   int am(pv var1, pv var2) {
      return 227775 * var1.ac < var2.ac * 227775 ? -1 : (var2.ac * 227775 == var1.ac * 227775 ? 0 : 1);
   }

   int ac(pv var1, pv var2, byte var3) {
      try {
         return 227775 * var1.ac < var2.ac * 227775 ? -1 : (var2.ac * 227775 == var1.ac * 227775 ? 0 : 1);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "pd.ac(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((pv)var1, (pv)var2, (byte)54);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "pd.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "pd.equals(" + ')');
      }
   }

   public int aq(Object var1, Object var2) {
      return this.ac((pv)var1, (pv)var2, (byte)56);
   }

   public int af(Object var1, Object var2) {
      return this.ac((pv)var1, (pv)var2, (byte)37);
   }

   public boolean gn(Object var1) {
      return super.equals(var1);
   }

   int ae(pv var1, pv var2) {
      return -2090791189 * var1.ac < var2.ac * -1443601297 ? -1 : (var2.ac * 227775 == var1.ac * 227775 ? 0 : 1);
   }

   public boolean gg(Object var1) {
      return super.equals(var1);
   }

   public int ax(Object var1, Object var2) {
      return this.ac((pv)var1, (pv)var2, (byte)-2);
   }

   int ag(pv var1, pv var2) {
      return 227775 * var1.ac < var2.ac * 227775 ? -1 : (var2.ac * 1601611730 == var1.ac * 227775 ? 0 : 1);
   }

   public static byte[] ae(int var0, int var1) {
      try {
         return gm.ac(var0, false, -2029916541);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "pd.ae(" + ')');
      }
   }
}
