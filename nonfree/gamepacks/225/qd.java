public final class qd {
   static int ag;
   public static final int az = 21;
   static qd[] ac = new qd[0];
   float am;
   static int ae = 1006449284;
   float aq;
   float af;
   float ax;

   public void ae(int var1) {
      try {
         synchronized(ac) {
            if (-1298270997 * ag < 1930938489 * ae - 1) {
               if (var1 == -1278571291) {
                  throw new IllegalStateException();
               }

               ac[(ag += -1656548413) * -1298270997 - 1] = this;
            }

         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qd.ae(" + ')');
      }
   }

   qd() {
      try {
         super();
         this.aq(783933342);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qd.<init>(" + ')');
      }
   }

   public qd(float var1, float var2, float var3) {
      try {
         super();
         this.ax(var1, var2, var3, (byte)-107);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "qd.<init>(" + ')');
      }
   }

   void ag(float var1, float var2, float var3, float var4, int var5) {
      try {
         this.am = var1;
         this.ax = var2;
         this.aq = var3;
         this.af = var4;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "qd.ag(" + ')');
      }
   }

   final void aq(int var1) {
      try {
         this.aq = 0.0F;
         this.ax = 0.0F;
         this.am = 0.0F;
         this.af = 1.0F;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qd.aq(" + ')');
      }
   }

   public String amp() {
      return this.am + "," + this.ax + "," + this.aq + "," + this.af;
   }

   public String aml() {
      return this.am + "," + this.ax + "," + this.aq + "," + this.af;
   }

   public final void af(qd var1, byte var2) {
      try {
         this.ag(this.af * var1.am + this.am * var1.af + this.aq * var1.ax - var1.aq * this.ax, this.am * var1.aq + this.ax * var1.af - var1.am * this.aq + var1.ax * this.af, this.af * var1.aq + (this.ax * var1.am + this.aq * var1.af - this.am * var1.ax), this.af * var1.af - this.am * var1.am - this.ax * var1.ax - var1.aq * this.aq, 332808820);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qd.af(" + ')');
      }
   }

   public int amy() {
      int var1 = -1804473001;
      float var2 = 1.0F;
      var2 = 31.0F * var2 + this.am;
      var2 = this.ax + 31.0F * var2;
      var2 = this.aq + 31.0F * var2;
      var2 = this.af + var2 * 31.0F;
      return (int)var2;
   }

   public int hashCode() {
      try {
         boolean var1 = true;
         float var2 = 1.0F;
         var2 = 31.0F * var2 + this.am;
         var2 = this.ax + 31.0F * var2;
         var2 = this.aq + 31.0F * var2;
         var2 = this.af + var2 * 31.0F;
         return (int)var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qd.hashCode(" + ')');
      }
   }

   public String toString() {
      try {
         return this.am + "," + this.ax + "," + this.aq + "," + this.af;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qd.toString(" + ')');
      }
   }

   static {
      ac = new qd[100];
      ag = 0;
      new qd();
   }

   public void ab(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.sin((double)(var4 * 0.5F));
      float var6 = (float)Math.cos((double)(var4 * 0.5F));
      this.am = var5 * var1;
      this.ax = var2 * var5;
      this.aq = var5 * var3;
      this.af = var6;
   }

   public boolean gg(Object var1) {
      if (!(var1 instanceof qd)) {
         return false;
      } else {
         qd var2 = (qd)var1;
         return this.am == var2.am && var2.ax == this.ax && this.aq == var2.aq && this.af == var2.af;
      }
   }

   public void am(float var1, float var2, float var3, float var4, int var5) {
      try {
         float var6 = (float)Math.sin((double)(var4 * 0.5F));
         float var7 = (float)Math.cos((double)(var4 * 0.5F));
         this.am = var6 * var1;
         this.ax = var2 * var6;
         this.aq = var6 * var3;
         this.af = var7;
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "qd.am(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof qd)) {
            return false;
         } else {
            qd var2 = (qd)var1;
            return this.am == var2.am && var2.ax == this.ax && this.aq == var2.aq && this.af == var2.af;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qd.equals(" + ')');
      }
   }

   public int amd() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = 31.0F * var2 + this.am;
      var2 = this.ax + 31.0F * var2;
      var2 = this.aq + 31.0F * var2;
      var2 = this.af + var2 * 31.0F;
      return (int)var2;
   }

   void ah(float var1, float var2, float var3, float var4) {
      this.am = var1;
      this.ax = var2;
      this.aq = var3;
      this.af = var4;
   }

   public String ame() {
      return this.am + "," + this.ax + "," + this.aq + "," + this.af;
   }

   public static qd at() {
      synchronized(ac) {
         if (-1298270997 * ag == 0) {
            return new qd();
         } else {
            ac[(ag -= -1656548413) * -1298270997].aq(783933342);
            return ac[ag * -1298270997];
         }
      }
   }

   public static qd au() {
      synchronized(ac) {
         if (-1298270997 * ag == 0) {
            return new qd();
         } else {
            ac[(ag -= -1656548413) * -1298270997].aq(783933342);
            return ac[ag * -1298270997];
         }
      }
   }

   public static qd ar() {
      synchronized(ac) {
         if (-1298270997 * ag == 0) {
            return new qd();
         } else {
            ac[(ag -= -1656548413) * -1298270997].aq(783933342);
            return ac[ag * -1298270997];
         }
      }
   }

   public static qd al() {
      synchronized(ac) {
         if (-1298270997 * ag == 0) {
            return new qd();
         } else {
            ac[(ag -= -1656548413) * -1298270997].aq(783933342);
            return ac[ag * -256834792];
         }
      }
   }

   public void ad() {
      synchronized(ac) {
         if (-1298270997 * ag < -197673325 * ae - 1) {
            ac[(ag += -1656548413) * -1085088054 - 1] = this;
         }

      }
   }

   public boolean gn(Object var1) {
      if (!(var1 instanceof qd)) {
         return false;
      } else {
         qd var2 = (qd)var1;
         return this.am == var2.am && var2.ax == this.ax && this.aq == var2.aq && this.af == var2.af;
      }
   }

   public void ap(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.sin((double)(var4 * 0.5F));
      float var6 = (float)Math.cos((double)(var4 * 0.5F));
      this.am = var5 * var1;
      this.ax = var2 * var5;
      this.aq = var5 * var3;
      this.af = var6;
   }

   public void ax(float var1, float var2, float var3, byte var4) {
      try {
         this.am(0.0F, 1.0F, 0.0F, var1, 304724460);
         qd var5 = gd.ac(1635635966);
         var5.am(1.0F, 0.0F, 0.0F, var2, 818800132);
         this.af(var5, (byte)63);
         var5.am(0.0F, 0.0F, 1.0F, var3, 1379838079);
         this.af(var5, (byte)103);
         var5.ae(711558212);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "qd.ax(" + ')');
      }
   }

   final void az() {
      this.aq = 0.0F;
      this.ax = 0.0F;
      this.am = 0.0F;
      this.af = 1.0F;
   }

   final void aa() {
      this.aq = 0.0F;
      this.ax = 0.0F;
      this.am = 0.0F;
      this.af = 1.0F;
   }

   final void ai() {
      this.aq = 0.0F;
      this.ax = 0.0F;
      this.am = 0.0F;
      this.af = 1.0F;
   }

   public final void ao(qd var1) {
      this.ag(this.af * var1.am + this.am * var1.af + this.aq * var1.ax - var1.aq * this.ax, this.am * var1.aq + this.ax * var1.af - var1.am * this.aq + var1.ax * this.af, this.af * var1.aq + (this.ax * var1.am + this.aq * var1.af - this.am * var1.ax), this.af * var1.af - this.am * var1.am - this.ax * var1.ax - var1.aq * this.aq, 332808820);
   }

   public final void as(qd var1) {
      this.ag(this.af * var1.am + this.am * var1.af + this.aq * var1.ax - var1.aq * this.ax, this.am * var1.aq + this.ax * var1.af - var1.am * this.aq + var1.ax * this.af, this.af * var1.aq + (this.ax * var1.am + this.aq * var1.af - this.am * var1.ax), this.af * var1.af - this.am * var1.am - this.ax * var1.ax - var1.aq * this.aq, 332808820);
   }
}
