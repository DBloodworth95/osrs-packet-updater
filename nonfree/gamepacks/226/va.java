public class va {
   public final int ap;
   public Object aw;

   public int amf() {
      return super.hashCode();
   }

   public va(int var1, Object var2) {
      try {
         super();
         this.ap = var1 * -2095104131;
         this.aw = var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "va.<init>(" + ')');
      }
   }

   public int hashCode() {
      try {
         return super.hashCode();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "va.hashCode(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof va)) {
            return false;
         } else {
            va var2 = (va)var1;
            if (null == var2.aw && this.aw != null) {
               return false;
            } else if (this.aw == null && var2.aw != null) {
               return false;
            } else {
               return this.ap * -1593675307 == var2.ap * -1593675307 && var2.aw.equals(this.aw);
            }
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "va.equals(" + ')');
      }
   }

   public va(int var1) {
      try {
         super();
         this.ap = -2095104131 * var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "va.<init>(" + ')');
      }
   }

   public int ams() {
      return super.hashCode();
   }

   public int amb() {
      return super.hashCode();
   }

   public int aml() {
      return super.hashCode();
   }

   public int amg() {
      return super.hashCode();
   }

   public boolean gj(Object var1) {
      if (!(var1 instanceof va)) {
         return false;
      } else {
         va var2 = (va)var1;
         if (null == var2.aw && this.aw != null) {
            return false;
         } else if (this.aw == null && var2.aw != null) {
            return false;
         } else {
            return this.ap * -1593675307 == var2.ap * -1593675307 && var2.aw.equals(this.aw);
         }
      }
   }
}
