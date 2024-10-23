public class ta extends tt {
   double am;
   public static final int ay = 19;
   double ag;
   double af;
   double ax;
   double aq;
   int ac;
   int ae;

   public int aq() {
      double var1 = this.ah(1583608635);
      double var3 = this.aq + (this.af - this.aq) * var1;
      return (int)Math.round(this.am + this.ax * Math.sin(var3));
   }

   public int ac(int var1) {
      try {
         double var2 = this.ah(1017011228);
         double var4 = var2 * (this.af - this.aq) + this.aq;
         return (int)Math.round(this.ag + this.ax * Math.cos(var4));
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ta.ac(" + ')');
      }
   }

   public int am() {
      double var1 = this.ah(2108184104);
      double var3 = var1 * (this.af - this.aq) + this.aq;
      return (int)Math.round(this.ag + this.ax * Math.cos(var3));
   }

   public ta(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      try {
         super(var9, var10);
         this.ac = 0;
         this.ae = 0;
         this.ag = 0.0D;
         this.am = 0.0D;
         this.ax = 0.0D;
         this.aq = 0.0D;
         this.af = 0.0D;
         this.ac = 66063063 * var3;
         this.ae = var6 * -894666687;
         if ((var5 - var8) * (var7 - var1) == (var8 - var2) * (var4 - var7)) {
            this.ag = (double)var4;
            this.am = (double)var5;
         } else {
            double var11 = (double)((float)(var7 + var1)) / 2.0D;
            double var13 = (double)((float)(var8 + var2)) / 2.0D;
            double var15 = (double)((float)(var4 + var7)) / 2.0D;
            double var17 = (double)((float)(var5 + var8)) / 2.0D;
            double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
            double var21 = -1.0D * (double)(var4 - var7) / (double)(var5 - var8);
            this.ag = (var17 + (var11 * var19 - var15 * var21) - var13) / (var19 - var21);
            this.am = (this.ag - var11) * var19 + var13;
            this.ax = Math.sqrt(Math.pow(this.ag - (double)var1, 2.0D) + Math.pow(this.am - (double)var2, 2.0D));
            this.aq = Math.atan2((double)var2 - this.am, (double)var1 - this.ag);
            double var23 = Math.atan2((double)var8 - this.am, (double)var7 - this.ag);
            this.af = Math.atan2((double)var5 - this.am, (double)var4 - this.ag);
            boolean var25 = this.aq <= var23 && var23 <= this.af || this.af <= var23 && var23 <= this.aq;
            if (!var25) {
               this.af += (double)(this.aq - this.af > 0.0D ? 2 : -2) * 3.141592653589793D;
            }

         }
      } catch (RuntimeException var26) {
         throw vk.ae(var26, "ta.<init>(" + ')');
      }
   }

   public int ae(byte var1) {
      try {
         double var2 = this.ah(1050372437);
         double var4 = this.aq + (this.af - this.aq) * var2;
         return (int)Math.round(this.am + this.ax * Math.sin(var4));
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ta.ae(" + ')');
      }
   }

   public int ag(byte var1) {
      try {
         double var2 = this.ah(1407646395);
         return (int)Math.round((double)(-1476622105 * this.ac) + var2 * (double)(-1102342207 * this.ae - this.ac * -1476622105));
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ta.ag(" + ')');
      }
   }

   public int ax() {
      double var1 = this.ah(1096771894);
      double var3 = this.aq + (this.af - this.aq) * var1;
      return (int)Math.round(this.am + this.ax * Math.sin(var3));
   }

   public int af() {
      double var1 = this.ah(1653969597);
      return (int)Math.round((double)(-1476622105 * this.ac) + var1 * (double)(-1102342207 * this.ae - this.ac * -1476622105));
   }

   public int at() {
      double var1 = this.ah(2060524715);
      return (int)Math.round((double)(-113143387 * this.ac) + var1 * (double)(-1478221433 * this.ae - this.ac * 310137663));
   }

   public int au() {
      double var1 = this.ah(1315893259);
      return (int)Math.round((double)(-1476622105 * this.ac) + var1 * (double)(-1102342207 * this.ae - this.ac * -1476622105));
   }

   public int ar() {
      double var1 = this.ah(1600010440);
      return (int)Math.round((double)(-1476622105 * this.ac) + var1 * (double)(-1102342207 * this.ae - this.ac * -1476622105));
   }

   public int al() {
      double var1 = this.ah(1667212307);
      return (int)Math.round((double)(-1476622105 * this.ac) + var1 * (double)(1181992112 * this.ae - this.ac * -1476622105));
   }
}
