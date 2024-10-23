public class qx {
   float ad;
   float at;
   float ag;
   float am;
   float ax;
   float aq;
   float af;
   float ar;
   float au;
   float ac;
   float al;
   float ae;

   public void au(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.ac;
      float var5 = this.am;
      float var6 = this.af;
      float var7 = this.ar;
      this.ac = var2 * var4 + var3 * this.ag;
      this.ag = this.ag * var2 - var4 * var3;
      this.am = var3 * this.aq + var2 * var5;
      this.aq = this.aq * var2 - var3 * var5;
      this.af = this.au * var3 + var6 * var2;
      this.au = var2 * this.au - var6 * var3;
      this.ar = this.ad * var3 + var7 * var2;
      this.ad = var2 * this.ad - var7 * var3;
   }

   public void af(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.ae;
      float var5 = this.ax;
      float var6 = this.at;
      float var7 = this.al;
      this.ae = var2 * var4 - this.ag * var3;
      this.ag = var3 * var4 + this.ag * var2;
      this.ax = var5 * var2 - var3 * this.aq;
      this.aq = var2 * this.aq + var5 * var3;
      this.at = var6 * var2 - this.au * var3;
      this.au = var2 * this.au + var3 * var6;
      this.al = var7 * var2 - var3 * this.ad;
      this.ad = this.ad * var2 + var7 * var3;
   }

   public void ae(float var1, byte var2) {
      try {
         float var3 = (float)Math.cos((double)var1);
         float var4 = (float)Math.sin((double)var1);
         float var5 = this.ae;
         float var6 = this.ax;
         float var7 = this.at;
         float var8 = this.al;
         this.ae = var3 * var5 - this.ag * var4;
         this.ag = var4 * var5 + this.ag * var3;
         this.ax = var6 * var3 - var4 * this.aq;
         this.aq = var3 * this.aq + var6 * var4;
         this.at = var7 * var3 - this.au * var4;
         this.au = var3 * this.au + var4 * var7;
         this.al = var8 * var3 - var4 * this.ad;
         this.ad = this.ad * var3 + var8 * var4;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "qx.ae(" + ')');
      }
   }

   public void ag(float var1, int var2) {
      try {
         float var3 = (float)Math.cos((double)var1);
         float var4 = (float)Math.sin((double)var1);
         float var5 = this.ac;
         float var6 = this.am;
         float var7 = this.af;
         float var8 = this.ar;
         this.ac = var3 * var5 + var4 * this.ag;
         this.ag = this.ag * var3 - var5 * var4;
         this.am = var4 * this.aq + var3 * var6;
         this.aq = this.aq * var3 - var4 * var6;
         this.af = this.au * var4 + var7 * var3;
         this.au = var3 * this.au - var7 * var4;
         this.ar = this.ad * var4 + var8 * var3;
         this.ad = var3 * this.ad - var8 * var4;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "qx.ag(" + ')');
      }
   }

   void am(float var1, byte var2) {
      try {
         float var3 = (float)Math.cos((double)var1);
         float var4 = (float)Math.sin((double)var1);
         float var5 = this.ac;
         float var6 = this.am;
         float var7 = this.af;
         float var8 = this.ar;
         this.ac = var3 * var5 - this.ae * var4;
         this.ae = this.ae * var3 + var4 * var5;
         this.am = var3 * var6 - this.ax * var4;
         this.ax = var4 * var6 + this.ax * var3;
         this.af = var3 * var7 - this.at * var4;
         this.at = var4 * var7 + this.at * var3;
         this.ar = var3 * var8 - var4 * this.al;
         this.al = this.al * var3 + var8 * var4;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "qx.am(" + ')');
      }
   }

   public qx() {
      try {
         super();
         this.ac(-2031995469);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qx.<init>(" + ')');
      }
   }

   public String toString() {
      try {
         return this.ac + "," + this.am + "," + this.af + "," + this.ar + "\n" + this.ae + "," + this.ax + "," + this.at + "," + this.al + "\n" + this.ag + "," + this.aq + "," + this.au + "," + this.ad;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qx.toString(" + ')');
      }
   }

   void ac(int var1) {
      try {
         this.ad = 0.0F;
         this.al = 0.0F;
         this.ar = 0.0F;
         this.at = 0.0F;
         this.af = 0.0F;
         this.aq = 0.0F;
         this.am = 0.0F;
         this.ag = 0.0F;
         this.ae = 0.0F;
         this.au = 1.0F;
         this.ax = 1.0F;
         this.ac = 1.0F;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qx.ac(" + ')');
      }
   }

   static {
      new qx();
   }

   public String amp() {
      return this.ac + "," + this.am + "," + this.af + "," + this.ar + "\n" + this.ae + "," + this.ax + "," + this.at + "," + this.al + "\n" + this.ag + "," + this.aq + "," + this.au + "," + this.ad;
   }

   public String ame() {
      return this.ac + "," + this.am + "," + this.af + "," + this.ar + "\n" + this.ae + "," + this.ax + "," + this.at + "," + this.al + "\n" + this.ag + "," + this.aq + "," + this.au + "," + this.ad;
   }

   public void aq(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.ae;
      float var5 = this.ax;
      float var6 = this.at;
      float var7 = this.al;
      this.ae = var2 * var4 - this.ag * var3;
      this.ag = var3 * var4 + this.ag * var2;
      this.ax = var5 * var2 - var3 * this.aq;
      this.aq = var2 * this.aq + var5 * var3;
      this.at = var6 * var2 - this.au * var3;
      this.au = var2 * this.au + var3 * var6;
      this.al = var7 * var2 - var3 * this.ad;
      this.ad = this.ad * var2 + var7 * var3;
   }

   public void ax(float var1, float var2, float var3, int var4) {
      try {
         this.ar += var1;
         this.al += var2;
         this.ad += var3;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qx.ax(" + ')');
      }
   }

   public void at(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.ac;
      float var5 = this.am;
      float var6 = this.af;
      float var7 = this.ar;
      this.ac = var2 * var4 + var3 * this.ag;
      this.ag = this.ag * var2 - var4 * var3;
      this.am = var3 * this.aq + var2 * var5;
      this.aq = this.aq * var2 - var3 * var5;
      this.af = this.au * var3 + var6 * var2;
      this.au = var2 * this.au - var6 * var3;
      this.ar = this.ad * var3 + var7 * var2;
      this.ad = var2 * this.ad - var7 * var3;
   }

   public void ab(float var1, float var2, float var3) {
      this.ar += var1;
      this.al += var2;
      this.ad += var3;
   }

   public void ar(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.ac;
      float var5 = this.am;
      float var6 = this.af;
      float var7 = this.ar;
      this.ac = var2 * var4 + var3 * this.ag;
      this.ag = this.ag * var2 - var4 * var3;
      this.am = var3 * this.aq + var2 * var5;
      this.aq = this.aq * var2 - var3 * var5;
      this.af = this.au * var3 + var6 * var2;
      this.au = var2 * this.au - var6 * var3;
      this.ar = this.ad * var3 + var7 * var2;
      this.ad = var2 * this.ad - var7 * var3;
   }

   void al(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.ac;
      float var5 = this.am;
      float var6 = this.af;
      float var7 = this.ar;
      this.ac = var2 * var4 - this.ae * var3;
      this.ae = this.ae * var2 + var3 * var4;
      this.am = var2 * var5 - this.ax * var3;
      this.ax = var3 * var5 + this.ax * var2;
      this.af = var2 * var6 - this.at * var3;
      this.at = var3 * var6 + this.at * var2;
      this.ar = var2 * var7 - var3 * this.al;
      this.al = this.al * var2 + var7 * var3;
   }

   void ad(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.ac;
      float var5 = this.am;
      float var6 = this.af;
      float var7 = this.ar;
      this.ac = var2 * var4 - this.ae * var3;
      this.ae = this.ae * var2 + var3 * var4;
      this.am = var2 * var5 - this.ax * var3;
      this.ax = var3 * var5 + this.ax * var2;
      this.af = var2 * var6 - this.at * var3;
      this.at = var3 * var6 + this.at * var2;
      this.ar = var2 * var7 - var3 * this.al;
      this.al = this.al * var2 + var7 * var3;
   }

   void ah(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.ac;
      float var5 = this.am;
      float var6 = this.af;
      float var7 = this.ar;
      this.ac = var2 * var4 - this.ae * var3;
      this.ae = this.ae * var2 + var3 * var4;
      this.am = var2 * var5 - this.ax * var3;
      this.ax = var3 * var5 + this.ax * var2;
      this.af = var2 * var6 - this.at * var3;
      this.at = var3 * var6 + this.at * var2;
      this.ar = var2 * var7 - var3 * this.al;
      this.al = this.al * var2 + var7 * var3;
   }

   void ap(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.ac;
      float var5 = this.am;
      float var6 = this.af;
      float var7 = this.ar;
      this.ac = var2 * var4 - this.ae * var3;
      this.ae = this.ae * var2 + var3 * var4;
      this.am = var2 * var5 - this.ax * var3;
      this.ax = var3 * var5 + this.ax * var2;
      this.af = var2 * var6 - this.at * var3;
      this.at = var3 * var6 + this.at * var2;
      this.ar = var2 * var7 - var3 * this.al;
      this.al = this.al * var2 + var7 * var3;
   }

   public String aml() {
      return this.ac + "," + this.am + "," + this.af + "," + this.ar + "\n" + this.ae + "," + this.ax + "," + this.at + "," + this.al + "\n" + this.ag + "," + this.aq + "," + this.au + "," + this.ad;
   }

   public void az(float var1, float var2, float var3) {
      this.ar += var1;
      this.al += var2;
      this.ad += var3;
   }
}
