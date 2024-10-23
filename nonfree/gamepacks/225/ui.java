import java.util.Iterator;

public final class ui implements Iterable {
   to ag;
   to[] ae;
   int ac;
   to am;
   int ax = 0;

   public to aj() {
      this.ax = 0;
      return this.ax();
   }

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

   public void ae(to var1, long var2) {
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

   public void ag() {
      for(int var1 = 0; var1 < this.ac; ++var1) {
         to var2 = this.ae[var1];

         while(true) {
            to var3 = var2.hy;
            if (var3 == var2) {
               break;
            }

            var3.jb();
         }
      }

      this.ag = null;
      this.am = null;
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

   public Iterator iterator() {
      return new us(this);
   }

   public to ar(long var1) {
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

   public to at(long var1) {
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

   public ui(int var1) {
      this.ac = var1;
      this.ae = new to[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         to var3 = this.ae[var2] = new to();
         var3.hy = var3;
         var3.hd = var3;
      }

   }

   public to am() {
      this.ax = 0;
      return this.ax();
   }

   public Iterator ab() {
      return new us(this);
   }

   public to ai() {
      this.ax = 0;
      return this.ax();
   }

   public to au(long var1) {
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

   public void az() {
      for(int var1 = 0; var1 < this.ac; ++var1) {
         to var2 = this.ae[var1];

         while(true) {
            to var3 = var2.hy;
            if (var3 == var2) {
               break;
            }

            var3.jb();
         }
      }

      this.ag = null;
      this.am = null;
   }

   public void al(to var1, long var2) {
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

   public void ad(to var1, long var2) {
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

   public Iterator ap() {
      return new us(this);
   }

   public void aa() {
      for(int var1 = 0; var1 < this.ac; ++var1) {
         to var2 = this.ae[var1];

         while(true) {
            to var3 = var2.hy;
            if (var3 == var2) {
               break;
            }

            var3.jb();
         }
      }

      this.ag = null;
      this.am = null;
   }

   public Iterator ah() {
      return new us(this);
   }

   public to ao() {
      this.ax = 0;
      return this.ax();
   }

   public to as() {
      this.ax = 0;
      return this.ax();
   }

   public to ay() {
      this.ax = 0;
      return this.ax();
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

   public to av() {
      this.ax = 0;
      return this.ax();
   }

   public to aw() {
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

   public to an() {
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

   public to ak() {
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
}
