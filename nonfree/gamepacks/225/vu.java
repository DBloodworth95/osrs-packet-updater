public class vu {
   public final int ac;
   public Object ae;

   public vu(int var1) {
      try {
         super();
         this.ac = var1 * 2094660761;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vu.<init>(" + ')');
      }
   }

   public vu(int var1, Object var2) {
      try {
         super();
         this.ac = var1 * 2094660761;
         this.ae = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vu.<init>(" + ')');
      }
   }

   public int hashCode() {
      try {
         return super.hashCode();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "vu.hashCode(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof vu)) {
            return false;
         } else {
            vu var2 = (vu)var1;
            if (var2.ae == null && null != this.ae) {
               return false;
            } else if (this.ae == null && null != var2.ae) {
               return false;
            } else {
               return 1730844585 * var2.ac == 1730844585 * this.ac && var2.ae.equals(this.ae);
            }
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vu.equals(" + ')');
      }
   }

   public boolean gn(Object var1) {
      if (!(var1 instanceof vu)) {
         return false;
      } else {
         vu var2 = (vu)var1;
         if (var2.ae == null && null != this.ae) {
            return false;
         } else if (this.ae == null && null != var2.ae) {
            return false;
         } else {
            return 114633508 * var2.ac == 1730844585 * this.ac && var2.ae.equals(this.ae);
         }
      }
   }

   public boolean gg(Object var1) {
      if (!(var1 instanceof vu)) {
         return false;
      } else {
         vu var2 = (vu)var1;
         if (var2.ae == null && null != this.ae) {
            return false;
         } else if (this.ae == null && null != var2.ae) {
            return false;
         } else {
            return 1730844585 * var2.ac == 1730844585 * this.ac && var2.ae.equals(this.ae);
         }
      }
   }

   public int amy() {
      return super.hashCode();
   }

   public int amd() {
      return super.hashCode();
   }
}
