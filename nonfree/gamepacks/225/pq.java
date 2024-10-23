import java.util.Iterator;

public class pq implements Iterable {
   tr ae;
   public tr ac = new tr();

   public tr af() {
      tr var1 = this.ae;
      if (var1 == this.ac) {
         this.ae = null;
         return null;
      } else {
         this.ae = var1.ew;
         return var1;
      }
   }

   public tr ao() {
      return this.aq((tr)null);
   }

   public void ae(tr var1) {
      if (var1.ep != null) {
         var1.jz();
      }

      var1.ep = this.ac.ep;
      var1.ew = this.ac;
      var1.ep.ew = var1;
      var1.ew.ep = var1;
   }

   public static void ag(tr var0, tr var1) {
      if (var0.ep != null) {
         var0.jz();
      }

      var0.ep = var1;
      var0.ew = var1.ew;
      var0.ep.ew = var0;
      var0.ew.ep = var0;
   }

   public Iterator ah() {
      return new pf(this);
   }

   public void al(tr var1) {
      if (var1.ep != null) {
         var1.jz();
      }

      var1.ep = this.ac.ep;
      var1.ew = this.ac;
      var1.ep.ew = var1;
      var1.ew.ep = var1;
   }

   tr aq(tr var1) {
      tr var2;
      if (var1 == null) {
         var2 = this.ac.ew;
      } else {
         var2 = var1;
      }

      if (var2 == this.ac) {
         this.ae = null;
         return null;
      } else {
         this.ae = var2.ew;
         return var2;
      }
   }

   public static void az(tr var0, tr var1) {
      if (var0.ep != null) {
         var0.jz();
      }

      var0.ep = var1;
      var0.ew = var1.ew;
      var0.ep.ew = var0;
      var0.ew.ep = var0;
   }

   public Iterator iterator() {
      return new pf(this);
   }

   public tr am() {
      tr var1 = this.ac.ew;
      if (var1 == this.ac) {
         return null;
      } else {
         var1.jz();
         return var1;
      }
   }

   public Iterator ap() {
      return new pf(this);
   }

   public void ac() {
      while(this.ac.ew != this.ac) {
         this.ac.ew.jz();
      }

   }

   public void at() {
      while(this.ac.ew != this.ac) {
         this.ac.ew.jz();
      }

   }

   public void au() {
      while(this.ac.ew != this.ac) {
         this.ac.ew.jz();
      }

   }

   public void ar(tr var1) {
      if (var1.ep != null) {
         var1.jz();
      }

      var1.ep = this.ac.ep;
      var1.ew = this.ac;
      var1.ep.ew = var1;
      var1.ew.ep = var1;
   }

   public Iterator ab() {
      return new pf(this);
   }

   public static void ad(tr var0, tr var1) {
      if (var0.ep != null) {
         var0.jz();
      }

      var0.ep = var1;
      var0.ew = var1.ew;
      var0.ep.ew = var0;
      var0.ew.ep = var0;
   }

   public pq() {
      this.ac.ew = this.ac;
      this.ac.ep = this.ac;
   }

   public static void aa(tr var0, tr var1) {
      if (var0.ep != null) {
         var0.jz();
      }

      var0.ep = var1;
      var0.ew = var1.ew;
      var0.ep.ew = var0;
      var0.ew.ep = var0;
   }

   public tr ai() {
      tr var1 = this.ac.ew;
      if (var1 == this.ac) {
         return null;
      } else {
         var1.jz();
         return var1;
      }
   }

   public tr ax() {
      return this.aq((tr)null);
   }

   public tr as() {
      return this.aq((tr)null);
   }

   public tr ay() {
      return this.aq((tr)null);
   }

   tr aj(tr var1) {
      tr var2;
      if (var1 == null) {
         var2 = this.ac.ew;
      } else {
         var2 = var1;
      }

      if (var2 == this.ac) {
         this.ae = null;
         return null;
      } else {
         this.ae = var2.ew;
         return var2;
      }
   }

   public tr av() {
      tr var1 = this.ae;
      if (var1 == this.ac) {
         this.ae = null;
         return null;
      } else {
         this.ae = var1.ew;
         return var1;
      }
   }
}
