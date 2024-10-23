import java.util.Iterator;

public class pb implements Iterator {
   pf ap;
   tp aw;
   tp ak = null;

   public Object at() {
      tp var1 = this.aw;
      if (var1 == this.ap.ap) {
         var1 = null;
         this.aw = null;
      } else {
         this.aw = var1.ec;
      }

      this.ak = var1;
      return var1;
   }

   public Object next() {
      tp var1 = this.aw;
      if (var1 == this.ap.ap) {
         var1 = null;
         this.aw = null;
      } else {
         this.aw = var1.ec;
      }

      this.ak = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.aw != this.ap.ap;
   }

   public void remove() {
      if (this.ak == null) {
         throw new IllegalStateException();
      } else {
         this.ak.kg();
         this.ak = null;
      }
   }

   public Object au() {
      tp var1 = this.aw;
      if (var1 == this.ap.ap) {
         var1 = null;
         this.aw = null;
      } else {
         this.aw = var1.ec;
      }

      this.ak = var1;
      return var1;
   }

   public void ar() {
      if (this.ak == null) {
         throw new IllegalStateException();
      } else {
         this.ak.kg();
         this.ak = null;
      }
   }

   public Object an() {
      tp var1 = this.aw;
      if (var1 == this.ap.ap) {
         var1 = null;
         this.aw = null;
      } else {
         this.aw = var1.ec;
      }

      this.ak = var1;
      return var1;
   }

   public boolean ao() {
      return this.aw != this.ap.ap;
   }

   pb(pf var1) {
      this.ap = var1;
      this.aw = this.ap.ap.ec;
      this.ak = null;
   }

   public boolean af() {
      return this.aw != this.ap.ap;
   }

   public void ab() {
      if (this.ak == null) {
         throw new IllegalStateException();
      } else {
         this.ak.kg();
         this.ak = null;
      }
   }

   public void az() {
      if (this.ak == null) {
         throw new IllegalStateException();
      } else {
         this.ak.kg();
         this.ak = null;
      }
   }
}
