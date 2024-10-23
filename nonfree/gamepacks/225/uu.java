public final class uu {
   to[] ae;
   to am;
   to ag;
   int ac;
   int ax = 0;

   public to aq(long var1) {
      to var3 = this.ae[(int)(var1 & (long)(this.ac - 1))];

      for(this.ag = var3.hy; this.ag != var3; this.ag = this.ag.hy) {
         if (this.ag.hk == var1) {
            to var4 = this.ag;
            this.ag = this.ag.hy;
            return var4;
         }
      }

      this.ag = null;
      return null;
   }

   public to ac(long var1) {
      to var3 = this.ae[(int)(var1 & (long)(this.ac - 1))];

      for(this.ag = var3.hy; this.ag != var3; this.ag = this.ag.hy) {
         if (this.ag.hk == var1) {
            to var4 = this.ag;
            this.ag = this.ag.hy;
            return var4;
         }
      }

      this.ag = null;
      return null;
   }

   public int ae() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.ac; ++var2) {
         to var3 = this.ae[var2];

         for(to var4 = var3.hy; var4 != var3; var4 = var4.hy) {
            ++var1;
         }
      }

      return var1;
   }

   public void ag(to var1, long var2) {
      if (var1.hd != null) {
         var1.jb();
      }

      to var4 = this.ae[(int)(var2 & (long)(this.ac - 1))];
      var1.hd = var4.hd;
      var1.hy = var4;
      var1.hd.hy = var1;
      var1.hy.hd = var1;
      var1.hk = var2;
   }

   public to am() {
      this.ax = 0;
      return this.ax();
   }

   public to ax() {
      to var1;
      if (this.ax > 0 && this.am != this.ae[this.ax - 1]) {
         var1 = this.am;
         this.am = var1.hy;
         return var1;
      } else {
         do {
            if (this.ax >= this.ac) {
               return null;
            }

            var1 = this.ae[this.ax++].hy;
         } while(var1 == this.ae[this.ax - 1]);

         this.am = var1.hy;
         return var1;
      }
   }

   public to ad() {
      to var1;
      if (this.ax > 0 && this.am != this.ae[this.ax - 1]) {
         var1 = this.am;
         this.am = var1.hy;
         return var1;
      } else {
         do {
            if (this.ax >= this.ac) {
               return null;
            }

            var1 = this.ae[this.ax++].hy;
         } while(var1 == this.ae[this.ax - 1]);

         this.am = var1.hy;
         return var1;
      }
   }

   public to af(long var1) {
      to var3 = this.ae[(int)(var1 & (long)(this.ac - 1))];

      for(this.ag = var3.hy; this.ag != var3; this.ag = this.ag.hy) {
         if (this.ag.hk == var1) {
            to var4 = this.ag;
            this.ag = this.ag.hy;
            return var4;
         }
      }

      this.ag = null;
      return null;
   }

   public to ah() {
      to var1;
      if (this.ax > 0 && this.am != this.ae[this.ax - 1]) {
         var1 = this.am;
         this.am = var1.hy;
         return var1;
      } else {
         do {
            if (this.ax >= this.ac) {
               return null;
            }

            var1 = this.ae[this.ax++].hy;
         } while(var1 == this.ae[this.ax - 1]);

         this.am = var1.hy;
         return var1;
      }
   }

   public void au(to var1, long var2) {
      if (var1.hd != null) {
         var1.jb();
      }

      to var4 = this.ae[(int)(var2 & (long)(this.ac - 1))];
      var1.hd = var4.hd;
      var1.hy = var4;
      var1.hd.hy = var1;
      var1.hy.hd = var1;
      var1.hk = var2;
   }

   public void ar(to var1, long var2) {
      if (var1.hd != null) {
         var1.jb();
      }

      to var4 = this.ae[(int)(var2 & (long)(this.ac - 1))];
      var1.hd = var4.hd;
      var1.hy = var4;
      var1.hd.hy = var1;
      var1.hy.hd = var1;
      var1.hk = var2;
   }

   public to al() {
      this.ax = 0;
      return this.ax();
   }

   public uu(int var1) {
      this.ac = var1;
      this.ae = new to[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         to var3 = this.ae[var2] = new to();
         var3.hy = var3;
         var3.hd = var3;
      }

   }

   public to ap() {
      to var1;
      if (this.ax > 0 && this.am != this.ae[this.ax - 1]) {
         var1 = this.am;
         this.am = var1.hy;
         return var1;
      } else {
         do {
            if (this.ax >= this.ac) {
               return null;
            }

            var1 = this.ae[this.ax++].hy;
         } while(var1 == this.ae[this.ax - 1]);

         this.am = var1.hy;
         return var1;
      }
   }

   public int at() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.ac; ++var2) {
         to var3 = this.ae[var2];

         for(to var4 = var3.hy; var4 != var3; var4 = var4.hy) {
            ++var1;
         }
      }

      return var1;
   }
}
