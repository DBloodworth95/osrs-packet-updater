public class ue {
   public final Object ac;
   public final Object ae;

   public boolean gn(Object var1) {
      if (null != var1 && var1 instanceof ue) {
         ue var2 = (ue)var1;
         if (this.ac == null) {
            if (var2.ac != null) {
               return false;
            }
         } else if (!this.ac.equals(var2.ac)) {
            return false;
         }

         if (this.ae == null) {
            if (var2.ae != null) {
               return false;
            }
         } else if (!this.ae.equals(var2.ae)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public String aml() {
      return this.ac + ", " + this.ae;
   }

   public boolean equals(Object var1) {
      try {
         if (null != var1 && var1 instanceof ue) {
            ue var2 = (ue)var1;
            if (this.ac == null) {
               if (var2.ac != null) {
                  return false;
               }
            } else if (!this.ac.equals(var2.ac)) {
               return false;
            }

            if (this.ae == null) {
               if (var2.ae != null) {
                  return false;
               }
            } else if (!this.ae.equals(var2.ae)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ue.equals(" + ')');
      }
   }

   public int amd() {
      int var1 = 0;
      if (null != this.ac) {
         var1 += this.ac.hashCode();
      }

      if (null != this.ae) {
         var1 += 31 * this.ae.hashCode();
      }

      return var1;
   }

   public ue(Object var1, Object var2) {
      try {
         super();
         this.ac = var1;
         this.ae = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ue.<init>(" + ')');
      }
   }

   public boolean gg(Object var1) {
      if (null != var1 && var1 instanceof ue) {
         ue var2 = (ue)var1;
         if (this.ac == null) {
            if (var2.ac != null) {
               return false;
            }
         } else if (!this.ac.equals(var2.ac)) {
            return false;
         }

         if (this.ae == null) {
            if (var2.ae != null) {
               return false;
            }
         } else if (!this.ae.equals(var2.ae)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public int amy() {
      int var1 = 0;
      if (null != this.ac) {
         var1 += this.ac.hashCode();
      }

      if (null != this.ae) {
         var1 += 1566078473 * this.ae.hashCode();
      }

      return var1;
   }

   public String toString() {
      try {
         return this.ac + ", " + this.ae;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ue.toString(" + ')');
      }
   }

   public int hashCode() {
      try {
         int var1 = 0;
         if (null != this.ac) {
            var1 += this.ac.hashCode();
         }

         if (null != this.ae) {
            var1 += 31 * this.ae.hashCode();
         }

         return var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ue.hashCode(" + ')');
      }
   }

   public String amp() {
      return this.ac + ", " + this.ae;
   }

   public String ame() {
      return this.ac + ", " + this.ae;
   }
}
