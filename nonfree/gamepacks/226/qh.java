public class qh {
   float au;
   float aw;
   float aj;
   float ap;
   float ai;
   float ay;
   float as;
   float ae;
   float am;
   float at;
   float ak;
   float an;
   static lj av;

   static tj[] ap(byte var0) {
      try {
         return new tj[]{tj.aj, tj.aw, tj.ak, tj.ap};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qh.ap(" + ')');
      }
   }

   public void ai(float var1, float var2, float var3, int var4) {
      try {
         this.at += var1;
         this.au += var2;
         this.an += var3;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qh.ai(" + ')');
      }
   }

   public void aw(float var1, int var2) {
      try {
         float var3 = (float)Math.cos((double)var1);
         float var4 = (float)Math.sin((double)var1);
         float var5 = this.aw;
         float var6 = this.ai;
         float var7 = this.ae;
         float var8 = this.au;
         this.aw = var3 * var5 - this.ak * var4;
         this.ak = var5 * var4 + var3 * this.ak;
         this.ai = var3 * var6 - var4 * this.ay;
         this.ay = var3 * this.ay + var6 * var4;
         this.ae = var3 * var7 - var4 * this.am;
         this.am = var3 * this.am + var4 * var7;
         this.au = var3 * var8 - this.an * var4;
         this.an = var8 * var4 + var3 * this.an;
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "qh.aw(" + ')');
      }
   }

   public void ak(float var1, int var2) {
      try {
         float var3 = (float)Math.cos((double)var1);
         float var4 = (float)Math.sin((double)var1);
         float var5 = this.ap;
         float var6 = this.aj;
         float var7 = this.as;
         float var8 = this.at;
         this.ap = var4 * this.ak + var3 * var5;
         this.ak = var3 * this.ak - var5 * var4;
         this.aj = this.ay * var4 + var6 * var3;
         this.ay = this.ay * var3 - var6 * var4;
         this.as = this.am * var4 + var3 * var7;
         this.am = var3 * this.am - var7 * var4;
         this.at = var4 * this.an + var3 * var8;
         this.an = var3 * this.an - var8 * var4;
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "qh.ak(" + ')');
      }
   }

   void aj(float var1, int var2) {
      try {
         float var3 = (float)Math.cos((double)var1);
         float var4 = (float)Math.sin((double)var1);
         float var5 = this.ap;
         float var6 = this.aj;
         float var7 = this.as;
         float var8 = this.at;
         this.ap = var5 * var3 - var4 * this.aw;
         this.aw = var3 * this.aw + var5 * var4;
         this.aj = var6 * var3 - var4 * this.ai;
         this.ai = var6 * var4 + this.ai * var3;
         this.as = var7 * var3 - this.ae * var4;
         this.ae = var3 * this.ae + var7 * var4;
         this.at = var3 * var8 - this.au * var4;
         this.au = var3 * this.au + var8 * var4;
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "qh.aj(" + ')');
      }
   }

   public void af(float var1, float var2, float var3) {
      this.at += var1;
      this.au += var2;
      this.an += var3;
   }

   public String toString() {
      try {
         return this.ap + "," + this.aj + "," + this.as + "," + this.at + "\n" + this.aw + "," + this.ai + "," + this.ae + "," + this.au + "\n" + this.ak + "," + this.ay + "," + this.am + "," + this.an;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qh.toString(" + ')');
      }
   }

   static {
      new qh();
   }

   public void at(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.ap;
      float var5 = this.aj;
      float var6 = this.as;
      float var7 = this.at;
      this.ap = var3 * this.ak + var2 * var4;
      this.ak = var2 * this.ak - var4 * var3;
      this.aj = this.ay * var3 + var5 * var2;
      this.ay = this.ay * var2 - var5 * var3;
      this.as = this.am * var3 + var2 * var6;
      this.am = var2 * this.am - var6 * var3;
      this.at = var3 * this.an + var2 * var7;
      this.an = var2 * this.an - var7 * var3;
   }

   public String amu() {
      return this.ap + "," + this.aj + "," + this.as + "," + this.at + "\n" + this.aw + "," + this.ai + "," + this.ae + "," + this.au + "\n" + this.ak + "," + this.ay + "," + this.am + "," + this.an;
   }

   void ay() {
      this.an = 0.0F;
      this.au = 0.0F;
      this.at = 0.0F;
      this.ae = 0.0F;
      this.as = 0.0F;
      this.ay = 0.0F;
      this.aj = 0.0F;
      this.ak = 0.0F;
      this.aw = 0.0F;
      this.am = 1.0F;
      this.ai = 1.0F;
      this.ap = 1.0F;
   }

   void as() {
      this.an = 0.0F;
      this.au = 0.0F;
      this.at = 0.0F;
      this.ae = 0.0F;
      this.as = 0.0F;
      this.ay = 0.0F;
      this.aj = 0.0F;
      this.ak = 0.0F;
      this.aw = 0.0F;
      this.am = 1.0F;
      this.ai = 1.0F;
      this.ap = 1.0F;
   }

   public void ae(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.aw;
      float var5 = this.ai;
      float var6 = this.ae;
      float var7 = this.au;
      this.aw = var2 * var4 - this.ak * var3;
      this.ak = var4 * var3 + var2 * this.ak;
      this.ai = var2 * var5 - var3 * this.ay;
      this.ay = var2 * this.ay + var5 * var3;
      this.ae = var2 * var6 - var3 * this.am;
      this.am = var2 * this.am + var3 * var6;
      this.au = var2 * var7 - this.an * var3;
      this.an = var7 * var3 + var2 * this.an;
   }

   public void am(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.aw;
      float var5 = this.ai;
      float var6 = this.ae;
      float var7 = this.au;
      this.aw = var2 * var4 - this.ak * var3;
      this.ak = var4 * var3 + var2 * this.ak;
      this.ai = var2 * var5 - var3 * this.ay;
      this.ay = var2 * this.ay + var5 * var3;
      this.ae = var2 * var6 - var3 * this.am;
      this.am = var2 * this.am + var3 * var6;
      this.au = var2 * var7 - this.an * var3;
      this.an = var7 * var3 + var2 * this.an;
   }

   void ap(int var1) {
      try {
         this.an = 0.0F;
         this.au = 0.0F;
         this.at = 0.0F;
         this.ae = 0.0F;
         this.as = 0.0F;
         this.ay = 0.0F;
         this.aj = 0.0F;
         this.ak = 0.0F;
         this.aw = 0.0F;
         this.am = 1.0F;
         this.ai = 1.0F;
         this.ap = 1.0F;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qh.ap(" + ')');
      }
   }

   public void au(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.ap;
      float var5 = this.aj;
      float var6 = this.as;
      float var7 = this.at;
      this.ap = var3 * this.ak + var2 * var4;
      this.ak = var2 * this.ak - var4 * var3;
      this.aj = this.ay * var3 + var5 * var2;
      this.ay = this.ay * var2 - var5 * var3;
      this.as = this.am * var3 + var2 * var6;
      this.am = var2 * this.am - var6 * var3;
      this.at = var3 * this.an + var2 * var7;
      this.an = var2 * this.an - var7 * var3;
   }

   public qh() {
      try {
         super();
         this.ap(1301023560);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qh.<init>(" + ')');
      }
   }

   void ao(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.ap;
      float var5 = this.aj;
      float var6 = this.as;
      float var7 = this.at;
      this.ap = var4 * var2 - var3 * this.aw;
      this.aw = var2 * this.aw + var4 * var3;
      this.aj = var5 * var2 - var3 * this.ai;
      this.ai = var5 * var3 + this.ai * var2;
      this.as = var6 * var2 - this.ae * var3;
      this.ae = var2 * this.ae + var6 * var3;
      this.at = var2 * var7 - this.au * var3;
      this.au = var2 * this.au + var7 * var3;
   }

   void an(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.ap;
      float var5 = this.aj;
      float var6 = this.as;
      float var7 = this.at;
      this.ap = var4 * var2 - var3 * this.aw;
      this.aw = var2 * this.aw + var4 * var3;
      this.aj = var5 * var2 - var3 * this.ai;
      this.ai = var5 * var3 + this.ai * var2;
      this.as = var6 * var2 - this.ae * var3;
      this.ae = var2 * this.ae + var6 * var3;
      this.at = var2 * var7 - this.au * var3;
      this.au = var2 * this.au + var7 * var3;
   }

   public void ar(float var1, float var2, float var3) {
      this.at += var1;
      this.au += var2;
      this.an += var3;
   }

   public String amw() {
      return this.ap + "," + this.aj + "," + this.as + "," + this.at + "\n" + this.aw + "," + this.ai + "," + this.ae + "," + this.au + "\n" + this.ak + "," + this.ay + "," + this.am + "," + this.an;
   }
}
