public class tr extends uw {
   int aw;
   int ap;
   double ak;
   double aj;
   double ai;
   double ay;
   double as;
   static final int al = 24;

   public int ai() {
      double var1 = this.au(1527116850);
      double var3 = (this.as - this.ay) * var1 + this.ay;
      return (int)Math.round(this.ak + this.ai * Math.cos(var3));
   }

   public int ap(int var1) {
      try {
         double var2 = this.au(-1373898259);
         double var4 = (this.as - this.ay) * var2 + this.ay;
         return (int)Math.round(this.ak + this.ai * Math.cos(var4));
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "tr.ap(" + ')');
      }
   }

   public int aj() {
      double var1 = this.au(404315365);
      double var3 = (this.as - this.ay) * var1 + this.ay;
      return (int)Math.round(this.ak + this.ai * Math.cos(var3));
   }

   public int ak(int var1) {
      try {
         double var2 = this.au(1511320435);
         return (int)Math.round(var2 * (double)(-98146715 * this.aw - this.ap * 1179025705) + (double)(1179025705 * this.ap));
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "tr.ak(" + ')');
      }
   }

   public int ay() {
      double var1 = this.au(674273891);
      double var3 = this.ay + var1 * (this.as - this.ay);
      return (int)Math.round(this.aj + this.ai * Math.sin(var3));
   }

   public int aw(byte var1) {
      try {
         double var2 = this.au(1294203137);
         double var4 = this.ay + var2 * (this.as - this.ay);
         return (int)Math.round(this.aj + this.ai * Math.sin(var4));
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "tr.aw(" + ')');
      }
   }

   public int ae() {
      double var1 = this.au(1544878914);
      return (int)Math.round(var1 * (double)(-98146715 * this.aw - this.ap * 1179025705) + (double)(1179025705 * this.ap));
   }

   public int as() {
      double var1 = this.au(1832710248);
      double var3 = this.ay + var1 * (this.as - this.ay);
      return (int)Math.round(this.aj + this.ai * Math.sin(var3));
   }

   public tr(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      try {
         super(var9, var10);
         this.ap = 0;
         this.aw = 0;
         this.ak = 0.0D;
         this.aj = 0.0D;
         this.ai = 0.0D;
         this.ay = 0.0D;
         this.as = 0.0D;
         this.ap = -1409307879 * var3;
         this.aw = -738796691 * var6;
         if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
            this.ak = (double)var4;
            this.aj = (double)var5;
         } else {
            double var11 = (double)((float)(var1 + var7)) / 2.0D;
            double var13 = (double)((float)(var8 + var2)) / 2.0D;
            double var15 = (double)((float)(var7 + var4)) / 2.0D;
            double var17 = (double)((float)(var8 + var5)) / 2.0D;
            double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
            double var21 = -1.0D * (double)(var4 - var7) / (double)(var5 - var8);
            this.ak = (var17 + (var11 * var19 - var21 * var15) - var13) / (var19 - var21);
            this.aj = var19 * (this.ak - var11) + var13;
            this.ai = Math.sqrt(Math.pow(this.ak - (double)var1, 2.0D) + Math.pow(this.aj - (double)var2, 2.0D));
            this.ay = Math.atan2((double)var2 - this.aj, (double)var1 - this.ak);
            double var23 = Math.atan2((double)var8 - this.aj, (double)var7 - this.ak);
            this.as = Math.atan2((double)var5 - this.aj, (double)var4 - this.ak);
            boolean var25 = this.ay <= var23 && var23 <= this.as || this.as <= var23 && var23 <= this.ay;
            if (!var25) {
               this.as += 3.141592653589793D * (double)(this.ay - this.as > 0.0D ? 2 : -2);
            }

         }
      } catch (RuntimeException var26) {
         throw tm.aw(var26, "tr.<init>(" + ')');
      }
   }

   public int am() {
      double var1 = this.au(415512192);
      return (int)Math.round(var1 * (double)(-98146715 * this.aw - this.ap * 1179025705) + (double)(1179025705 * this.ap));
   }
}
