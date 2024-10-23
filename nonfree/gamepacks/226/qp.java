public final class qp {
   float ai;
   static int ak;
   static qp[] ap = new qp[0];
   float ay;
   float aj;
   float as;

   public boolean gj(Object var1) {
      if (!(var1 instanceof qp)) {
         return false;
      } else {
         qp var2 = (qp)var1;
         return this.aj == var2.aj && this.ai == var2.ai && this.ay == var2.ay && this.as == var2.as;
      }
   }

   qp() {
      try {
         super();
         this.as((byte)-13);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qp.<init>(" + ')');
      }
   }

   public qp(float var1, float var2, float var3) {
      try {
         super();
         this.ay(var1, var2, var3, -1153819212);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "qp.<init>(" + ')');
      }
   }

   void aj(float var1, float var2, float var3, float var4, int var5) {
      try {
         this.aj = var1;
         this.ai = var2;
         this.ay = var3;
         this.as = var4;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "qp.aj(" + ')');
      }
   }

   public int hashCode() {
      try {
         boolean var1 = true;
         float var2 = 1.0F;
         var2 = this.aj + var2 * 31.0F;
         var2 = var2 * 31.0F + this.ai;
         var2 = 31.0F * var2 + this.ay;
         var2 = this.as + var2 * 31.0F;
         return (int)var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qp.hashCode(" + ')');
      }
   }

   public String amu() {
      return this.aj + "," + this.ai + "," + this.ay + "," + this.as;
   }

   final void as(byte var1) {
      try {
         this.ay = 0.0F;
         this.ai = 0.0F;
         this.aj = 0.0F;
         this.as = 1.0F;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qp.as(" + ')');
      }
   }

   public int ams() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = this.aj + var2 * 31.0F;
      var2 = var2 * 31.0F + this.ai;
      var2 = 31.0F * var2 + this.ay;
      var2 = this.as + var2 * 31.0F;
      return (int)var2;
   }

   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof qp)) {
            return false;
         } else {
            qp var2 = (qp)var1;
            return this.aj == var2.aj && this.ai == var2.ai && this.ay == var2.ay && this.as == var2.as;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qp.equals(" + ')');
      }
   }

   public final void ae(qp var1, byte var2) {
      try {
         this.aj(this.aj * var1.as + var1.aj * this.as + var1.ai * this.ay - this.ai * var1.ay, this.as * var1.ai + (this.ai * var1.as - this.ay * var1.aj) + this.aj * var1.ay, this.ay * var1.as + this.ai * var1.aj - var1.ai * this.aj + var1.ay * this.as, this.as * var1.as - this.aj * var1.aj - this.ai * var1.ai - this.ay * var1.ay, 962218821);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qp.ae(" + ')');
      }
   }

   final void av() {
      this.ay = 0.0F;
      this.ai = 0.0F;
      this.aj = 0.0F;
      this.as = 1.0F;
   }

   static {
      pj.ap(100, (byte)35);
      new qp();
   }

   public void ak(int var1) {
      try {
         synchronized(ap) {
            if (ak * -858242687 < sc.aw * 2045988499 - 1) {
               if (var1 <= 545999929) {
                  throw new IllegalStateException();
               }

               ap[(ak += 680132225) * -858242687 - 1] = this;
            }

         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qp.ak(" + ')');
      }
   }

   public int amf() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = this.aj + var2 * 31.0F;
      var2 = var2 * 31.0F + this.ai;
      var2 = 31.0F * var2 + this.ay;
      var2 = this.as + var2 * 31.0F;
      return (int)var2;
   }

   public void ai(float var1, float var2, float var3, float var4, byte var5) {
      try {
         float var6 = (float)Math.sin((double)(0.5F * var4));
         float var7 = (float)Math.cos((double)(var4 * 0.5F));
         this.aj = var6 * var1;
         this.ai = var6 * var2;
         this.ay = var3 * var6;
         this.as = var7;
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "qp.ai(" + ')');
      }
   }

   public int amb() {
      int var1 = 168822403;
      float var2 = 1.0F;
      var2 = this.aj + var2 * 31.0F;
      var2 = var2 * 31.0F + this.ai;
      var2 = 31.0F * var2 + this.ay;
      var2 = this.as + var2 * 31.0F;
      return (int)var2;
   }

   public int amg() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = this.aj + var2 * 31.0F;
      var2 = var2 * 31.0F + this.ai;
      var2 = 31.0F * var2 + this.ay;
      var2 = this.as + var2 * 31.0F;
      return (int)var2;
   }

   public int aml() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = this.aj + var2 * 31.0F;
      var2 = var2 * 31.0F + this.ai;
      var2 = 31.0F * var2 + this.ay;
      var2 = this.as + var2 * 31.0F;
      return (int)var2;
   }

   public String amw() {
      return this.aj + "," + this.ai + "," + this.ay + "," + this.as;
   }

   public void ay(float var1, float var2, float var3, int var4) {
      try {
         this.ai(0.0F, 1.0F, 0.0F, var1, (byte)-89);
         qp var5 = jb.aw((byte)-55);
         var5.ai(1.0F, 0.0F, 0.0F, var2, (byte)-46);
         this.ae(var5, (byte)44);
         var5.ai(0.0F, 0.0F, 1.0F, var3, (byte)-51);
         this.ae(var5, (byte)111);
         var5.ak(1716326497);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "qp.ay(" + ')');
      }
   }

   static void am(int var0) {
      sc.aw = 751869206 * var0;
      ap = new qp[var0];
      ak = 0;
   }

   static void at(int var0) {
      sc.aw = -1882587237 * var0;
      ap = new qp[var0];
      ak = 0;
   }

   public static qp au() {
      synchronized(ap) {
         if (ak * 1302514616 == 0) {
            return new qp();
         } else {
            ap[(ak -= -1971220808) * 1671643830].as((byte)-10);
            return ap[ak * -858242687];
         }
      }
   }

   public void an() {
      synchronized(ap) {
         if (ak * -858242687 < sc.aw * 2045988499 - 1) {
            ap[(ak += 680132225) * -858242687 - 1] = this;
         }

      }
   }

   public void ao() {
      synchronized(ap) {
         if (ak * -858242687 < sc.aw * 2045988499 - 1) {
            ap[(ak += 680132225) * -858242687 - 1] = this;
         }

      }
   }

   public void af() {
      synchronized(ap) {
         if (ak * -858242687 < sc.aw * -752675236 - 1) {
            ap[(ak += 632206618) * 1278430673 - 1] = this;
         }

      }
   }

   void ar(float var1, float var2, float var3, float var4) {
      this.aj = var1;
      this.ai = var2;
      this.ay = var3;
      this.as = var4;
   }

   void ab(float var1, float var2, float var3, float var4) {
      this.aj = var1;
      this.ai = var2;
      this.ay = var3;
      this.as = var4;
   }

   void az(float var1, float var2, float var3, float var4) {
      this.aj = var1;
      this.ai = var2;
      this.ay = var3;
      this.as = var4;
   }

   public void ag(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.sin((double)(0.5F * var4));
      float var6 = (float)Math.cos((double)(var4 * 0.5F));
      this.aj = var5 * var1;
      this.ai = var5 * var2;
      this.ay = var3 * var5;
      this.as = var6;
   }

   public void ad(float var1, float var2, float var3) {
      this.ai(0.0F, 1.0F, 0.0F, var1, (byte)-114);
      qp var4 = jb.aw((byte)-14);
      var4.ai(1.0F, 0.0F, 0.0F, var2, (byte)-85);
      this.ae(var4, (byte)65);
      var4.ai(0.0F, 0.0F, 1.0F, var3, (byte)-99);
      this.ae(var4, (byte)41);
      var4.ak(1374624578);
   }

   public void ac(float var1, float var2, float var3) {
      this.ai(0.0F, 1.0F, 0.0F, var1, (byte)-42);
      qp var4 = jb.aw((byte)-54);
      var4.ai(1.0F, 0.0F, 0.0F, var2, (byte)-2);
      this.ae(var4, (byte)93);
      var4.ai(0.0F, 0.0F, 1.0F, var3, (byte)-9);
      this.ae(var4, (byte)102);
      var4.ak(1439943226);
   }

   public String toString() {
      try {
         return this.aj + "," + this.ai + "," + this.ay + "," + this.as;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qp.toString(" + ')');
      }
   }

   final void ax() {
      this.ay = 0.0F;
      this.ai = 0.0F;
      this.aj = 0.0F;
      this.as = 1.0F;
   }

   public final void aq(qp var1) {
      this.aj(this.aj * var1.as + var1.aj * this.as + var1.ai * this.ay - this.ai * var1.ay, this.as * var1.ai + (this.ai * var1.as - this.ay * var1.aj) + this.aj * var1.ay, this.ay * var1.as + this.ai * var1.aj - var1.ai * this.aj + var1.ay * this.as, this.as * var1.as - this.aj * var1.aj - this.ai * var1.ai - this.ay * var1.ay, 962218821);
   }
}
