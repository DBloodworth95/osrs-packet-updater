import java.util.Iterator;

public class pa implements Iterator {
   to ae;
   to ag = null;
   pr ac;

   void am() {
      this.ae = this.ac != null ? this.ac.ac.hy : null;
      this.ag = null;
   }

   public void aq() {
      if (this.ag == null) {
         throw new IllegalStateException();
      } else {
         this.ag.jb();
         this.ag = null;
      }
   }

   void ac(pr var1) {
      this.ac = var1;
      this.ae();
   }

   void ae() {
      this.ae = this.ac != null ? this.ac.ac.hy : null;
      this.ag = null;
   }

   public boolean hasNext() {
      return this.ae != this.ac.ac && this.ae != null;
   }

   public void remove() {
      if (this.ag == null) {
         throw new IllegalStateException();
      } else {
         this.ag.jb();
         this.ag = null;
      }
   }

   void ag(pr var1) {
      this.ac = var1;
      this.ae();
   }

   public void af() {
      if (this.ag == null) {
         throw new IllegalStateException();
      } else {
         this.ag.jb();
         this.ag = null;
      }
   }

   public boolean ax() {
      return this.ae != this.ac.ac && this.ae != null;
   }

   pa(pr var1) {
      this.ac(var1);
   }

   public Object next() {
      to var1 = this.ae;
      if (var1 == this.ac.ac) {
         var1 = null;
         this.ae = null;
      } else {
         this.ae = var1.hy;
      }

      this.ag = var1;
      return var1;
   }

   public void at() {
      if (this.ag == null) {
         throw new IllegalStateException();
      } else {
         this.ag.jb();
         this.ag = null;
      }
   }

   public void au() {
      if (this.ag == null) {
         throw new IllegalStateException();
      } else {
         this.ag.jb();
         this.ag = null;
      }
   }

   public Object ar() {
      to var1 = this.ae;
      if (var1 == this.ac.ac) {
         var1 = null;
         this.ae = null;
      } else {
         this.ae = var1.hy;
      }

      this.ag = var1;
      return var1;
   }

   public Object al() {
      to var1 = this.ae;
      if (var1 == this.ac.ac) {
         var1 = null;
         this.ae = null;
      } else {
         this.ae = var1.hy;
      }

      this.ag = var1;
      return var1;
   }
}
