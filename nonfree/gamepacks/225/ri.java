public abstract class ri {
   boolean af;
   String am;
   String ax;
   ri ag;
   boolean aq;

   public ri ar(int var1) {
      try {
         return this.ag;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ri.ar(" + ')');
      }
   }

   void ay(String var1) {
      this.aq = true;
      this.am = var1;
   }

   public boolean af(short var1) {
      try {
         return this.aq;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ri.af(" + ')');
      }
   }

   public boolean at(byte var1) {
      try {
         return this.af;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ri.at(" + ')');
      }
   }

   public String au(byte var1) {
      try {
         return "Error in task: " + this.ax + ", Error message: " + this.am;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ri.au(" + ')');
      }
   }

   public ri as() {
      return this.ag;
   }

   public boolean ad() {
      return this.aq;
   }

   public abstract boolean ag();

   public String az() {
      return "Error in task: " + this.ax + ", Error message: " + this.am;
   }

   public boolean ah() {
      return this.aq;
   }

   public boolean ap() {
      return this.af;
   }

   public boolean ab() {
      return this.af;
   }

   void al(String var1, int var2) {
      try {
         this.aq = true;
         this.am = var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ri.al(" + ')');
      }
   }

   public String aa() {
      return "Error in task: " + this.ax + ", Error message: " + this.am;
   }

   public ri ai() {
      return this.ag;
   }

   public ri ao() {
      return this.ag;
   }

   void aj(String var1) {
      this.aq = true;
      this.am = var1;
   }

   public abstract boolean ac(int var1);

   ri(ri var1) {
      try {
         super();
         this.ag = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ri.<init>(" + ')');
      }
   }

   void av(String var1) {
      this.aq = true;
      this.am = var1;
   }
}
