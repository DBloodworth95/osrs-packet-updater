import java.util.Iterator;

public class us implements Iterator {
   to ae;
   ui ac;
   int ag;
   to am = null;

   public boolean ax() {
      if (this.ae != this.ac.ae[this.ag - 1]) {
         return true;
      } else {
         while(this.ag < this.ac.ac) {
            if (this.ac.ae[this.ag++].hy != this.ac.ae[this.ag - 1]) {
               this.ae = this.ac.ae[this.ag - 1].hy;
               return true;
            }

            this.ae = this.ac.ae[this.ag - 1];
         }

         return false;
      }
   }

   void ac() {
      this.ae = this.ac.ae[0].hy;
      this.ag = 1;
      this.am = null;
   }

   public void remove() {
      if (this.am == null) {
         throw new IllegalStateException();
      } else {
         this.am.jb();
         this.am = null;
      }
   }

   public Object next() {
      to var1;
      if (this.ae != this.ac.ae[this.ag - 1]) {
         var1 = this.ae;
         this.ae = var1.hy;
         this.am = var1;
         return var1;
      } else {
         do {
            if (this.ag >= this.ac.ac) {
               return null;
            }

            var1 = this.ac.ae[this.ag++].hy;
         } while(var1 == this.ac.ae[this.ag - 1]);

         this.ae = var1.hy;
         this.am = var1;
         return var1;
      }
   }

   void am() {
      this.ae = this.ac.ae[0].hy;
      this.ag = 1;
      this.am = null;
   }

   public void af() {
      if (this.am == null) {
         throw new IllegalStateException();
      } else {
         this.am.jb();
         this.am = null;
      }
   }

   public us(ui var1) {
      this.ac = var1;
      this.ac();
   }

   public void aq() {
      if (this.am == null) {
         throw new IllegalStateException();
      } else {
         this.am.jb();
         this.am = null;
      }
   }

   void ah() {
      this.ae = this.ac.ae[0].hy;
      this.ag = 1;
      this.am = null;
   }

   public void at() {
      if (this.am == null) {
         throw new IllegalStateException();
      } else {
         this.am.jb();
         this.am = null;
      }
   }

   public to ae() {
      this.ac();
      return (to)this.next();
   }

   public Object ar() {
      to var1;
      if (this.ae != this.ac.ae[this.ag - 1]) {
         var1 = this.ae;
         this.ae = var1.hy;
         this.am = var1;
         return var1;
      } else {
         do {
            if (this.ag >= this.ac.ac) {
               return null;
            }

            var1 = this.ac.ae[this.ag++].hy;
         } while(var1 == this.ac.ae[this.ag - 1]);

         this.ae = var1.hy;
         this.am = var1;
         return var1;
      }
   }

   public Object al() {
      to var1;
      if (this.ae != this.ac.ae[this.ag - 1]) {
         var1 = this.ae;
         this.ae = var1.hy;
         this.am = var1;
         return var1;
      } else {
         do {
            if (this.ag >= this.ac.ac) {
               return null;
            }

            var1 = this.ac.ae[this.ag++].hy;
         } while(var1 == this.ac.ae[this.ag - 1]);

         this.ae = var1.hy;
         this.am = var1;
         return var1;
      }
   }

   void ag() {
      this.ae = this.ac.ae[0].hy;
      this.ag = 1;
      this.am = null;
   }

   public void au() {
      if (this.am == null) {
         throw new IllegalStateException();
      } else {
         this.am.jb();
         this.am = null;
      }
   }

   void ad() {
      this.ae = this.ac.ae[0].hy;
      this.ag = 1;
      this.am = null;
   }

   public boolean hasNext() {
      if (this.ae != this.ac.ae[this.ag - 1]) {
         return true;
      } else {
         while(this.ag < this.ac.ac) {
            if (this.ac.ae[this.ag++].hy != this.ac.ae[this.ag - 1]) {
               this.ae = this.ac.ae[this.ag - 1].hy;
               return true;
            }

            this.ae = this.ac.ae[this.ag - 1];
         }

         return false;
      }
   }

   public to ap() {
      this.ac();
      return (to)this.next();
   }

   public to ab() {
      this.ac();
      return (to)this.next();
   }

   public to az() {
      this.ac();
      return (to)this.next();
   }
}
