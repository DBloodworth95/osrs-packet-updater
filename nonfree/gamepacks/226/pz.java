import java.util.Iterator;

public class pz implements Iterator {
   ps ap;
   tw aw;
   tw ak = null;

   public boolean ao() {
      return this.aw != this.ap.ap && this.aw != null;
   }

   void ap(ps var1) {
      this.ap = var1;
      this.aw();
   }

   void aw() {
      this.aw = this.ap != null ? this.ap.ap.hf : null;
      this.ak = null;
   }

   public Object next() {
      tw var1 = this.aw;
      if (var1 == this.ap.ap) {
         var1 = null;
         this.aw = null;
      } else {
         this.aw = var1.hf;
      }

      this.ak = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.aw != this.ap.ap && this.aw != null;
   }

   public void ar() {
      if (this.ak == null) {
         throw new IllegalStateException();
      } else {
         this.ak.kf();
         this.ak = null;
      }
   }

   void ak(ps var1) {
      this.ap = var1;
      this.aw();
   }

   pz(ps var1) {
      this.ap(var1);
   }

   void ai(ps var1) {
      this.ap = var1;
      this.aw();
   }

   void ay(ps var1) {
      this.ap = var1;
      this.aw();
   }

   void as() {
      this.aw = this.ap != null ? this.ap.ap.hf : null;
      this.ak = null;
   }

   void aj(ps var1) {
      this.ap = var1;
      this.aw();
   }

   void am() {
      this.aw = this.ap != null ? this.ap.ap.hf : null;
      this.ak = null;
   }

   public Object at() {
      tw var1 = this.aw;
      if (var1 == this.ap.ap) {
         var1 = null;
         this.aw = null;
      } else {
         this.aw = var1.hf;
      }

      this.ak = var1;
      return var1;
   }

   public boolean af() {
      return this.aw != this.ap.ap && this.aw != null;
   }

   public Object an() {
      tw var1 = this.aw;
      if (var1 == this.ap.ap) {
         var1 = null;
         this.aw = null;
      } else {
         this.aw = var1.hf;
      }

      this.ak = var1;
      return var1;
   }

   void ae() {
      this.aw = this.ap != null ? this.ap.ap.hf : null;
      this.ak = null;
   }

   public Object au() {
      tw var1 = this.aw;
      if (var1 == this.ap.ap) {
         var1 = null;
         this.aw = null;
      } else {
         this.aw = var1.hf;
      }

      this.ak = var1;
      return var1;
   }

   public void remove() {
      if (this.ak == null) {
         throw new IllegalStateException();
      } else {
         this.ak.kf();
         this.ak = null;
      }
   }

   public void ab() {
      if (this.ak == null) {
         throw new IllegalStateException();
      } else {
         this.ak.kf();
         this.ak = null;
      }
   }

   public void az() {
      if (this.ak == null) {
         throw new IllegalStateException();
      } else {
         this.ak.kf();
         this.ak = null;
      }
   }
}
