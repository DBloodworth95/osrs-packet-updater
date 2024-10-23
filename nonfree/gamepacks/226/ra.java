public abstract class ra {
   String ai;
   ra ak;
   String aj;
   boolean ay;
   boolean as;

   public boolean an() {
      return this.ay;
   }

   public boolean as(int var1) {
      try {
         return this.ay;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ra.as(" + ')');
      }
   }

   public ra ag() {
      return this.ak;
   }

   public String am(int var1) {
      try {
         return "Error in task: " + this.ai + ", Error message: " + this.aj;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ra.am(" + ')');
      }
   }

   ra(ra var1) {
      try {
         super();
         this.ak = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ra.<init>(" + ')');
      }
   }

   public ra at(int var1) {
      try {
         return this.ak;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ra.at(" + ')');
      }
   }

   void au(String var1, int var2) {
      try {
         this.ay = true;
         this.aj = var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ra.au(" + ')');
      }
   }

   public abstract boolean ak();

   public abstract boolean aj();

   public String ab() {
      return "Error in task: " + this.ai + ", Error message: " + this.aj;
   }

   public boolean ao() {
      return this.ay;
   }

   public boolean af() {
      return this.ay;
   }

   public boolean ar() {
      return this.as;
   }

   public boolean ae(byte var1) {
      try {
         return this.as;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ra.ae(" + ')');
      }
   }

   public ra az() {
      return this.ak;
   }

   public abstract boolean ap(int var1);
}
