public abstract class tf {
   int at;
   int au;
   double ar;
   int al;

   static double ay(int var0, int var1, int var2) {
      double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D;
      if (!(var3 <= 0.0D) && !(var3 >= 1.0D)) {
         double var5;
         double var7;
         switch(var2) {
         case 0:
            return var3;
         case 1:
            return 1.0D - Math.cos(3.141592653589793D * var3 / 2.0D);
         case 2:
            return Math.sin(var3 * 3.141592653589793D / 2.0D);
         case 3:
            return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D;
         case 4:
            return var3 * var3;
         case 5:
            return 1.0D - (1.0D - var3) * (1.0D - var3);
         case 6:
            return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 2.0D) / 2.0D;
         case 7:
            return var3 * var3 * var3;
         case 8:
            return 1.0D - Math.pow(1.0D - var3, 3.0D);
         case 9:
            return var3 < 0.5D ? var3 * var3 * 4.0D * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 3.0D) / 2.0D;
         case 10:
            return var3 * var3 * var3 * var3;
         case 11:
            return 1.0D - Math.pow(1.0D - var3, 4.0D);
         case 12:
            return var3 < 0.5D ? var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 4.0D) / 2.0D;
         case 13:
            return var3 * var3 * var3 * var3 * var3;
         case 14:
            return 1.0D - Math.pow(1.0D - var3, 5.0D);
         case 15:
            return var3 < 0.5D ? var3 * var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 5.0D) / 2.0D;
         case 16:
            return Math.pow(2.0D, 10.0D * var3 - 10.0D);
         case 17:
            return 1.0D - Math.pow(2.0D, var3 * -10.0D);
         case 18:
            return var3 < 0.5D ? Math.pow(2.0D, 20.0D * var3 + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, var3 * -20.0D + 10.0D)) / 2.0D;
         case 19:
            return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D));
         case 20:
            return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D));
         case 21:
            return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var3 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D)) + 1.0D) / 2.0D;
         case 22:
            var5 = 1.70158D;
            var7 = 2.70158D;
            return var3 * 2.70158D * var3 * var3 - var3 * 1.70158D * var3;
         case 23:
            var5 = 1.70158D;
            var7 = 2.70158D;
            return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D);
         case 24:
            var5 = 1.70158D;
            var7 = 2.5949095D;
            return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(var3 * 2.0D - 2.0D, 2.0D) * (2.5949095D + (var3 * 2.0D - 2.0D) * 3.5949095D) + 2.0D) / 2.0D;
         case 25:
            var5 = 2.0943951023931953D;
            return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin((10.0D * var3 - 10.75D) * 2.0943951023931953D);
         case 26:
            var5 = 2.0943951023931953D;
            return Math.pow(2.0D, -10.0D * var3) * Math.sin((10.0D * var3 - 0.75D) * 2.0943951023931953D) + 1.0D;
         case 27:
            var5 = 1.3962634015954636D;
            var7 = Math.sin((20.0D * var3 - 11.125D) * 1.3962634015954636D);
            return var3 < 0.5D ? -(Math.pow(2.0D, var3 * 20.0D - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + var3 * -20.0D) * var7 / 2.0D + 1.0D;
         default:
            return var3;
         }
      } else {
         return var3 <= 0.0D ? 0.0D : 1.0D;
      }
   }

   public void ad(int var1) {
      try {
         if (this.au * -985757321 < this.at * -698067003) {
            if (var1 <= -2145910082) {
               throw new IllegalStateException();
            }

            this.au += 395255879;
            this.ar = ia.ap(-985757321 * this.au, this.at * -698067003, 96895019 * this.al, -769892069);
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tf.ad(" + ')');
      }
   }

   double ah(int var1) {
      try {
         return this.ar;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tf.ah(" + ')');
      }
   }

   tf(int var1, int var2) {
      try {
         super();
         this.at = 0;
         this.au = 0;
         this.ar = 0.0D;
         this.al = 0;
         this.at = var1 * 1978076941;
         this.au = 0;
         this.al = (var2 >= 0 && var2 <= 27 ? var2 : 0) * -702136701;
         this.ar = ia.ap(this.au * -985757321, -698067003 * this.at, this.al * 96895019, 1572782799);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tf.<init>(" + ')');
      }
   }

   public void az() {
      if (this.au * -985757321 < this.at * -698067003) {
         this.au += 395255879;
         this.ar = ia.ap(-985757321 * this.au, this.at * -698067003, 96895019 * this.al, -669952901);
      }

   }

   double aa() {
      return this.ar;
   }

   double ai() {
      return this.ar;
   }

   double ao() {
      return this.ar;
   }

   static double as(int var0, int var1, int var2) {
      double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D;
      if (!(var3 <= 0.0D) && !(var3 >= 1.0D)) {
         double var5;
         double var7;
         switch(var2) {
         case 0:
            return var3;
         case 1:
            return 1.0D - Math.cos(3.141592653589793D * var3 / 2.0D);
         case 2:
            return Math.sin(var3 * 3.141592653589793D / 2.0D);
         case 3:
            return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D;
         case 4:
            return var3 * var3;
         case 5:
            return 1.0D - (1.0D - var3) * (1.0D - var3);
         case 6:
            return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 2.0D) / 2.0D;
         case 7:
            return var3 * var3 * var3;
         case 8:
            return 1.0D - Math.pow(1.0D - var3, 3.0D);
         case 9:
            return var3 < 0.5D ? var3 * var3 * 4.0D * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 3.0D) / 2.0D;
         case 10:
            return var3 * var3 * var3 * var3;
         case 11:
            return 1.0D - Math.pow(1.0D - var3, 4.0D);
         case 12:
            return var3 < 0.5D ? var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 4.0D) / 2.0D;
         case 13:
            return var3 * var3 * var3 * var3 * var3;
         case 14:
            return 1.0D - Math.pow(1.0D - var3, 5.0D);
         case 15:
            return var3 < 0.5D ? var3 * var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 5.0D) / 2.0D;
         case 16:
            return Math.pow(2.0D, 10.0D * var3 - 10.0D);
         case 17:
            return 1.0D - Math.pow(2.0D, var3 * -10.0D);
         case 18:
            return var3 < 0.5D ? Math.pow(2.0D, 20.0D * var3 + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, var3 * -20.0D + 10.0D)) / 2.0D;
         case 19:
            return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D));
         case 20:
            return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D));
         case 21:
            return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var3 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D)) + 1.0D) / 2.0D;
         case 22:
            var5 = 1.70158D;
            var7 = 2.70158D;
            return var3 * 2.70158D * var3 * var3 - var3 * 1.70158D * var3;
         case 23:
            var5 = 1.70158D;
            var7 = 2.70158D;
            return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D);
         case 24:
            var5 = 1.70158D;
            var7 = 2.5949095D;
            return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(var3 * 2.0D - 2.0D, 2.0D) * (2.5949095D + (var3 * 2.0D - 2.0D) * 3.5949095D) + 2.0D) / 2.0D;
         case 25:
            var5 = 2.0943951023931953D;
            return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin((10.0D * var3 - 10.75D) * 2.0943951023931953D);
         case 26:
            var5 = 2.0943951023931953D;
            return Math.pow(2.0D, -10.0D * var3) * Math.sin((10.0D * var3 - 0.75D) * 2.0943951023931953D) + 1.0D;
         case 27:
            var5 = 1.3962634015954636D;
            var7 = Math.sin((20.0D * var3 - 11.125D) * 1.3962634015954636D);
            return var3 < 0.5D ? -(Math.pow(2.0D, var3 * 20.0D - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + var3 * -20.0D) * var7 / 2.0D + 1.0D;
         default:
            return var3;
         }
      } else {
         return var3 <= 0.0D ? 0.0D : 1.0D;
      }
   }

   public void ab() {
      if (this.au * -985757321 < this.at * -698067003) {
         this.au += 395255879;
         this.ar = ia.ap(-985757321 * this.au, this.at * -698067003, 96895019 * this.al, 1929990011);
      }

   }
}
