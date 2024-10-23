public abstract class ug {
   int ae;
   static final int an = 27;
   double at;
   int au;
   int am;

   ug(int var1, int var2) {
      try {
         super();
         this.ae = 0;
         this.am = 0;
         this.at = 0.0D;
         this.au = 0;
         this.ae = 463603183 * var1;
         this.am = 0;
         this.au = (var2 >= 0 && var2 <= 27 ? var2 : 0) * 1256870521;
         this.at = ga.an(this.am * 1529757277, this.ae * -474494705, -345540663 * this.au, 2139356870);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ug.<init>(" + ')');
      }
   }

   public void at(int var1) {
      try {
         if (this.am * 1529757277 < -474494705 * this.ae) {
            if (var1 <= -989221825) {
               throw new IllegalStateException();
            }

            this.am += 976782837;
            this.at = ga.an(this.am * 1529757277, -474494705 * this.ae, -345540663 * this.au, 2125311534);
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ug.at(" + ')');
      }
   }

   double au(int var1) {
      try {
         return this.at;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ug.au(" + ')');
      }
   }

   public void ao() {
      if (this.am * -1351363613 < -1005215454 * this.ae) {
         this.am += -2000006251;
         this.at = ga.an(this.am * 1529757277, -767531653 * this.ae, -345540663 * this.au, 2124355598);
      }

   }

   public void af() {
      if (this.am * 1582287514 < -474494705 * this.ae) {
         this.am += 9324340;
         this.at = ga.an(this.am * -1993568670, -474494705 * this.ae, -1899451342 * this.au, 2124426764);
      }

   }

   static double ar(int var0, int var1, int var2) {
      double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D;
      if (!(var3 <= 0.0D) && !(var3 >= 1.0D)) {
         double var5;
         double var7;
         switch(var2) {
         case 0:
            return var3;
         case 1:
            return 1.0D - Math.cos(var3 * 3.141592653589793D / 2.0D);
         case 2:
            return Math.sin(var3 * 3.141592653589793D / 2.0D);
         case 3:
            return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D;
         case 4:
            return var3 * var3;
         case 5:
            return 1.0D - (1.0D - var3) * (1.0D - var3);
         case 6:
            return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(-2.0D * var3 + 2.0D, 2.0D) / 2.0D;
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
            return var3 < 0.5D ? var3 * var3 * var3 * var3 * 8.0D : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 4.0D) / 2.0D;
         case 13:
            return var3 * var3 * var3 * var3 * var3;
         case 14:
            return 1.0D - Math.pow(1.0D - var3, 5.0D);
         case 15:
            return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 5.0D) / 2.0D;
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
            return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(2.0D * var3, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(var3 * -2.0D + 2.0D, 2.0D)) + 1.0D) / 2.0D;
         case 22:
            var5 = 1.70158D;
            var7 = 2.70158D;
            return var3 * var3 * 2.70158D * var3 - var3 * 1.70158D * var3;
         case 23:
            var5 = 1.70158D;
            var7 = 2.70158D;
            return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D);
         case 24:
            var5 = 1.70158D;
            var7 = 2.5949095D;
            return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(var3 * 2.0D - 2.0D, 2.0D) * (3.5949095D * (2.0D * var3 - 2.0D) + 2.5949095D) + 2.0D) / 2.0D;
         case 25:
            var5 = 2.0943951023931953D;
            return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin((var3 * 10.0D - 10.75D) * 2.0943951023931953D);
         case 26:
            var5 = 2.0943951023931953D;
            return Math.pow(2.0D, var3 * -10.0D) * Math.sin((10.0D * var3 - 0.75D) * 2.0943951023931953D) + 1.0D;
         case 27:
            var5 = 1.3962634015954636D;
            var7 = Math.sin(1.3962634015954636D * (20.0D * var3 - 11.125D));
            return var3 < 0.5D ? -(Math.pow(2.0D, var3 * 20.0D - 10.0D) * var7) / 2.0D : Math.pow(2.0D, var3 * -20.0D + 10.0D) * var7 / 2.0D + 1.0D;
         default:
            return var3;
         }
      } else {
         return var3 <= 0.0D ? 0.0D : 1.0D;
      }
   }

   static double ab(int var0, int var1, int var2) {
      double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D;
      if (!(var3 <= 0.0D) && !(var3 >= 1.0D)) {
         double var5;
         double var7;
         switch(var2) {
         case 0:
            return var3;
         case 1:
            return 1.0D - Math.cos(var3 * 3.141592653589793D / 2.0D);
         case 2:
            return Math.sin(var3 * 3.141592653589793D / 2.0D);
         case 3:
            return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D;
         case 4:
            return var3 * var3;
         case 5:
            return 1.0D - (1.0D - var3) * (1.0D - var3);
         case 6:
            return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(-2.0D * var3 + 2.0D, 2.0D) / 2.0D;
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
            return var3 < 0.5D ? var3 * var3 * var3 * var3 * 8.0D : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 4.0D) / 2.0D;
         case 13:
            return var3 * var3 * var3 * var3 * var3;
         case 14:
            return 1.0D - Math.pow(1.0D - var3, 5.0D);
         case 15:
            return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 5.0D) / 2.0D;
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
            return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(2.0D * var3, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(var3 * -2.0D + 2.0D, 2.0D)) + 1.0D) / 2.0D;
         case 22:
            var5 = 1.70158D;
            var7 = 2.70158D;
            return var3 * var3 * 2.70158D * var3 - var3 * 1.70158D * var3;
         case 23:
            var5 = 1.70158D;
            var7 = 2.70158D;
            return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D);
         case 24:
            var5 = 1.70158D;
            var7 = 2.5949095D;
            return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(var3 * 2.0D - 2.0D, 2.0D) * (3.5949095D * (2.0D * var3 - 2.0D) + 2.5949095D) + 2.0D) / 2.0D;
         case 25:
            var5 = 2.0943951023931953D;
            return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin((var3 * 10.0D - 10.75D) * 2.0943951023931953D);
         case 26:
            var5 = 2.0943951023931953D;
            return Math.pow(2.0D, var3 * -10.0D) * Math.sin((10.0D * var3 - 0.75D) * 2.0943951023931953D) + 1.0D;
         case 27:
            var5 = 1.3962634015954636D;
            var7 = Math.sin(1.3962634015954636D * (20.0D * var3 - 11.125D));
            return var3 < 0.5D ? -(Math.pow(2.0D, var3 * 20.0D - 10.0D) * var7) / 2.0D : Math.pow(2.0D, var3 * -20.0D + 10.0D) * var7 / 2.0D + 1.0D;
         default:
            return var3;
         }
      } else {
         return var3 <= 0.0D ? 0.0D : 1.0D;
      }
   }
}
