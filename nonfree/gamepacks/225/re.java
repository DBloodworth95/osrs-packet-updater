import java.util.Comparator;
import java.util.Map.Entry;

class re implements Comparator {
   public static final int au = 1024;
   static final int am = 1;
   static du vt;
   // $FF: synthetic field
   final rf this$0;

   public boolean gn(Object var1) {
      return super.equals(var1);
   }

   int ac(Entry var1, Entry var2, int var3) {
      try {
         return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "re.ac(" + ')');
      }
   }

   re(rf var1) {
      this.this$0 = var1;
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "re.equals(" + ')');
      }
   }

   public int ax(Object var1, Object var2) {
      return this.ac((Entry)var1, (Entry)var2, 1310910238);
   }

   public int aq(Object var1, Object var2) {
      return this.ac((Entry)var1, (Entry)var2, 1309249662);
   }

   int ag(Entry var1, Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   public int af(Object var1, Object var2) {
      return this.ac((Entry)var1, (Entry)var2, 1546550488);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((Entry)var1, (Entry)var2, 1902441751);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "re.compare(" + ')');
      }
   }

   public boolean gg(Object var1) {
      return super.equals(var1);
   }

   int ae(Entry var1, Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }
}
