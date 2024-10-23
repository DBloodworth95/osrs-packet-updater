public class uy {
   public final Object ap;
   public final Object aw;

   public uy(Object var1, Object var2) {
      try {
         super();
         this.ap = var1;
         this.aw = var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uy.<init>(" + ')');
      }
   }

   public String toString() {
      try {
         return this.ap + ", " + this.aw;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "uy.toString(" + ')');
      }
   }

   public int aml() {
      int var1 = 0;
      if (null != this.ap) {
         var1 += this.ap.hashCode();
      }

      if (null != this.aw) {
         var1 += 31 * this.aw.hashCode();
      }

      return var1;
   }

   public int hashCode() {
      try {
         int var1 = 0;
         if (null != this.ap) {
            var1 += this.ap.hashCode();
         }

         if (null != this.aw) {
            var1 += 31 * this.aw.hashCode();
         }

         return var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uy.hashCode(" + ')');
      }
   }

   public boolean gj(Object var1) {
      if (null != var1 && var1 instanceof uy) {
         uy var2 = (uy)var1;
         if (null == this.ap) {
            if (var2.ap != null) {
               return false;
            }
         } else if (!this.ap.equals(var2.ap)) {
            return false;
         }

         if (null == this.aw) {
            if (null != var2.aw) {
               return false;
            }
         } else if (!this.aw.equals(var2.aw)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public int ams() {
      int var1 = 0;
      if (null != this.ap) {
         var1 += this.ap.hashCode();
      }

      if (null != this.aw) {
         var1 += 31 * this.aw.hashCode();
      }

      return var1;
   }

   public int amg() {
      int var1 = 0;
      if (null != this.ap) {
         var1 += this.ap.hashCode();
      }

      if (null != this.aw) {
         var1 += 328534183 * this.aw.hashCode();
      }

      return var1;
   }

   public int amb() {
      int var1 = 0;
      if (null != this.ap) {
         var1 += this.ap.hashCode();
      }

      if (null != this.aw) {
         var1 += 253997537 * this.aw.hashCode();
      }

      return var1;
   }

   public boolean equals(Object var1) {
      try {
         if (null != var1 && var1 instanceof uy) {
            uy var2 = (uy)var1;
            if (null == this.ap) {
               if (var2.ap != null) {
                  return false;
               }
            } else if (!this.ap.equals(var2.ap)) {
               return false;
            }

            if (null == this.aw) {
               if (null != var2.aw) {
                  return false;
               }
            } else if (!this.aw.equals(var2.aw)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uy.equals(" + ')');
      }
   }

   public int amf() {
      int var1 = 0;
      if (null != this.ap) {
         var1 += this.ap.hashCode();
      }

      if (null != this.aw) {
         var1 += 31 * this.aw.hashCode();
      }

      return var1;
   }

   public String amw() {
      return this.ap + ", " + this.aw;
   }

   public String amu() {
      return this.ap + ", " + this.aw;
   }
}
