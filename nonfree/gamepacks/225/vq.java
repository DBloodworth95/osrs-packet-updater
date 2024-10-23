import java.util.Comparator;

public class vq implements Comparator {
   final boolean ac;
   static final String ag = "Authorization";
   static final int eh = 0;

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vq.equals(" + ')');
      }
   }

   int ac(ss var1, ss var2, int var3) {
      try {
         return this.ac ? var1.ae(var2, (short)151) : var2.ae(var1, (short)151);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "vq.ac(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((ss)var1, (ss)var2, 1835164566);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vq.compare(" + ')');
      }
   }

   public int af(Object var1, Object var2) {
      return this.ac((ss)var1, (ss)var2, 1835164566);
   }

   public int ax(Object var1, Object var2) {
      return this.ac((ss)var1, (ss)var2, 1835164566);
   }

   public int aq(Object var1, Object var2) {
      return this.ac((ss)var1, (ss)var2, 1835164566);
   }

   int ag(ss var1, ss var2) {
      return this.ac ? var1.ae(var2, (short)151) : var2.ae(var1, (short)151);
   }

   public boolean gn(Object var1) {
      return super.equals(var1);
   }

   public boolean gg(Object var1) {
      return super.equals(var1);
   }

   public vq(boolean var1) {
      try {
         super();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vq.<init>(" + ')');
      }
   }

   int ae(ss var1, ss var2) {
      return this.ac ? var1.ae(var2, (short)151) : var2.ae(var1, (short)151);
   }

   int am(ss var1, ss var2) {
      return this.ac ? var1.ae(var2, (short)151) : var2.ae(var1, (short)151);
   }
}
