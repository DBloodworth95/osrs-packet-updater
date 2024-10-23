import java.util.Comparator;

public class vj implements Comparator {
   final boolean ac;
   static byte[][][] am;

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((ss)var1, (ss)var2, -2048021276);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vj.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vj.equals(" + ')');
      }
   }

   public vj(boolean var1) {
      try {
         super();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vj.<init>(" + ')');
      }
   }

   public boolean gn(Object var1) {
      return super.equals(var1);
   }

   public int ax(Object var1, Object var2) {
      return this.ac((ss)var1, (ss)var2, -2048021276);
   }

   public int aq(Object var1, Object var2) {
      return this.ac((ss)var1, (ss)var2, -2048021276);
   }

   public int af(Object var1, Object var2) {
      return this.ac((ss)var1, (ss)var2, -2048021276);
   }

   int ac(ss var1, ss var2, int var3) {
      try {
         int var10000;
         if (this.ac) {
            if (var3 != -2048021276) {
               throw new IllegalStateException();
            }

            var10000 = var1.bh((byte)-50).ax(var2.bh((byte)26), -1284531742);
         } else {
            var10000 = var2.bh((byte)41).ax(var1.bh((byte)27), -842769877);
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "vj.ac(" + ')');
      }
   }

   public boolean gg(Object var1) {
      return super.equals(var1);
   }
}
