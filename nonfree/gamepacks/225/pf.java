import java.util.Iterator;

public class pf implements Iterator {
   tr ag = null;
   tr ae;
   pq ac;

   public void af() {
      if (this.ag == null) {
         throw new IllegalStateException();
      } else {
         this.ag.jz();
         this.ag = null;
      }
   }

   public Object ar() {
      tr var1 = this.ae;
      if (var1 == this.ac.ac) {
         var1 = null;
         this.ae = null;
      } else {
         this.ae = var1.ew;
      }

      this.ag = var1;
      return var1;
   }

   public void remove() {
      if (this.ag == null) {
         throw new IllegalStateException();
      } else {
         this.ag.jz();
         this.ag = null;
      }
   }

   pf(pq var1) {
      this.ac = var1;
      this.ae = this.ac.ac.ew;
      this.ag = null;
   }

   public boolean hasNext() {
      return this.ae != this.ac.ac;
   }

   public void aq() {
      if (this.ag == null) {
         throw new IllegalStateException();
      } else {
         this.ag.jz();
         this.ag = null;
      }
   }

   public Object next() {
      tr var1 = this.ae;
      if (var1 == this.ac.ac) {
         var1 = null;
         this.ae = null;
      } else {
         this.ae = var1.ew;
      }

      this.ag = var1;
      return var1;
   }

   public void at() {
      if (this.ag == null) {
         throw new IllegalStateException();
      } else {
         this.ag.jz();
         this.ag = null;
      }
   }

   public void au() {
      if (this.ag == null) {
         throw new IllegalStateException();
      } else {
         this.ag.jz();
         this.ag = null;
      }
   }

   public boolean ax() {
      return this.ae != this.ac.ac;
   }

   public Object al() {
      tr var1 = this.ae;
      if (var1 == this.ac.ac) {
         var1 = null;
         this.ae = null;
      } else {
         this.ae = var1.ew;
      }

      this.ag = var1;
      return var1;
   }
}
