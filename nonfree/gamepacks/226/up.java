import java.util.Iterator;

public class up implements Iterator {
   tw aj = null;
   tw aw;
   um ap;
   int ak;

   public tw ay() {
      this.ap();
      return (tw)this.next();
   }

   void aj() {
      this.aw = this.ap.aw[0].hf;
      this.ak = 1;
      this.aj = null;
   }

   public tw aw() {
      this.ap();
      return (tw)this.next();
   }

   public Object next() {
      tw var1;
      if (this.aw != this.ap.aw[this.ak - 1]) {
         var1 = this.aw;
         this.aw = var1.hf;
         this.aj = var1;
         return var1;
      } else {
         do {
            if (this.ak >= this.ap.ap) {
               return null;
            }

            var1 = this.ap.aw[this.ak++].hf;
         } while(var1 == this.ap.aw[this.ak - 1]);

         this.aw = var1.hf;
         this.aj = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if (this.aw != this.ap.aw[this.ak - 1]) {
         return true;
      } else {
         while(this.ak < this.ap.ap) {
            if (this.ap.aw[this.ak++].hf != this.ap.aw[this.ak - 1]) {
               this.aw = this.ap.aw[this.ak - 1].hf;
               return true;
            }

            this.aw = this.ap.aw[this.ak - 1];
         }

         return false;
      }
   }

   public void remove() {
      if (this.aj == null) {
         throw new IllegalStateException();
      } else {
         this.aj.kf();
         this.aj = null;
      }
   }

   public void ar() {
      if (this.aj == null) {
         throw new IllegalStateException();
      } else {
         this.aj.kf();
         this.aj = null;
      }
   }

   public Object au() {
      tw var1;
      if (this.aw != this.ap.aw[this.ak - 1]) {
         var1 = this.aw;
         this.aw = var1.hf;
         this.aj = var1;
         return var1;
      } else {
         do {
            if (this.ak >= this.ap.ap) {
               return null;
            }

            var1 = this.ap.aw[this.ak++].hf;
         } while(var1 == this.ap.aw[this.ak - 1]);

         this.aw = var1.hf;
         this.aj = var1;
         return var1;
      }
   }

   public boolean ao() {
      if (this.aw != this.ap.aw[this.ak - 1]) {
         return true;
      } else {
         while(this.ak < this.ap.ap) {
            if (this.ap.aw[this.ak++].hf != this.ap.aw[this.ak - 1]) {
               this.aw = this.ap.aw[this.ak - 1].hf;
               return true;
            }

            this.aw = this.ap.aw[this.ak - 1];
         }

         return false;
      }
   }

   public Object at() {
      tw var1;
      if (this.aw != this.ap.aw[this.ak - 1]) {
         var1 = this.aw;
         this.aw = var1.hf;
         this.aj = var1;
         return var1;
      } else {
         do {
            if (this.ak >= this.ap.ap) {
               return null;
            }

            var1 = this.ap.aw[this.ak++].hf;
         } while(var1 == this.ap.aw[this.ak - 1]);

         this.aw = var1.hf;
         this.aj = var1;
         return var1;
      }
   }

   public boolean af() {
      if (this.aw != this.ap.aw[this.ak - 1]) {
         return true;
      } else {
         while(this.ak < this.ap.ap) {
            if (this.ap.aw[this.ak++].hf != this.ap.aw[this.ak - 1]) {
               this.aw = this.ap.aw[this.ak - 1].hf;
               return true;
            }

            this.aw = this.ap.aw[this.ak - 1];
         }

         return false;
      }
   }

   public Object an() {
      tw var1;
      if (this.aw != this.ap.aw[this.ak - 1]) {
         var1 = this.aw;
         this.aw = var1.hf;
         this.aj = var1;
         return var1;
      } else {
         do {
            if (this.ak >= this.ap.ap) {
               return null;
            }

            var1 = this.ap.aw[this.ak++].hf;
         } while(var1 == this.ap.aw[this.ak - 1]);

         this.aw = var1.hf;
         this.aj = var1;
         return var1;
      }
   }

   public void ab() {
      if (this.aj == null) {
         throw new IllegalStateException();
      } else {
         this.aj.kf();
         this.aj = null;
      }
   }

   public void az() {
      if (this.aj == null) {
         throw new IllegalStateException();
      } else {
         this.aj.kf();
         this.aj = null;
      }
   }

   void ak() {
      this.aw = this.ap.aw[0].hf;
      this.ak = 1;
      this.aj = null;
   }

   public up(um var1) {
      this.ap = var1;
      this.ap();
   }

   void ai() {
      this.aw = this.ap.aw[0].hf;
      this.ak = 1;
      this.aj = null;
   }

   void ap() {
      this.aw = this.ap.aw[0].hf;
      this.ak = 1;
      this.aj = null;
   }
}
