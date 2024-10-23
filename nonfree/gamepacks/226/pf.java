import java.util.Iterator;

public class pf implements Iterable {
   tp aw;
   public tp ap = new tp();

   public void am(tp var1) {
      if (var1.ek != null) {
         var1.kg();
      }

      var1.ek = this.ap.ek;
      var1.ec = this.ap;
      var1.ek.ec = var1;
      var1.ec.ek = var1;
   }

   public tp aj() {
      tp var1 = this.ap.ec;
      if (var1 == this.ap) {
         return null;
      } else {
         var1.kg();
         return var1;
      }
   }

   public void aw(tp var1) {
      if (var1.ek != null) {
         var1.kg();
      }

      var1.ek = this.ap.ek;
      var1.ec = this.ap;
      var1.ek.ec = var1;
      var1.ec.ek = var1;
   }

   public static void ak(tp var0, tp var1) {
      if (var0.ek != null) {
         var0.kg();
      }

      var0.ek = var1;
      var0.ec = var1.ec;
      var0.ek.ec = var0;
      var0.ec.ek = var0;
   }

   public tp as() {
      tp var1 = this.aw;
      if (var1 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var1.ec;
         return var1;
      }
   }

   public tp ai() {
      return this.ay((tp)null);
   }

   tp ay(tp var1) {
      tp var2;
      if (var1 == null) {
         var2 = this.ap.ec;
      } else {
         var2 = var1;
      }

      if (var2 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var2.ec;
         return var2;
      }
   }

   public pf() {
      this.ap.ec = this.ap;
      this.ap.ek = this.ap;
   }

   public tp ac() {
      tp var1 = this.aw;
      if (var1 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var1.ec;
         return var1;
      }
   }

   public Iterator bq() {
      return new pb(this);
   }

   public Iterator bp() {
      return new pb(this);
   }

   public Iterator bz() {
      return new pb(this);
   }

   public void ae() {
      while(this.ap.ec != this.ap) {
         this.ap.ec.kg();
      }

   }

   public tp an() {
      tp var1 = this.ap.ec;
      if (var1 == this.ap) {
         return null;
      } else {
         var1.kg();
         return var1;
      }
   }

   public static void at(tp var0, tp var1) {
      if (var0.ek != null) {
         var0.kg();
      }

      var0.ek = var1;
      var0.ec = var1.ec;
      var0.ek.ec = var0;
      var0.ec.ek = var0;
   }

   public static void au(tp var0, tp var1) {
      if (var0.ek != null) {
         var0.kg();
      }

      var0.ek = var1;
      var0.ec = var1.ec;
      var0.ek.ec = var0;
      var0.ec.ek = var0;
   }

   public tp ar() {
      return this.ay((tp)null);
   }

   public tp ao() {
      return this.ay((tp)null);
   }

   public tp af() {
      return this.ay((tp)null);
   }

   tp ab(tp var1) {
      tp var2;
      if (var1 == null) {
         var2 = this.ap.ec;
      } else {
         var2 = var1;
      }

      if (var2 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var2.ec;
         return var2;
      }
   }

   public tp av() {
      tp var1 = this.aw;
      if (var1 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var1.ec;
         return var1;
      }
   }

   tp az(tp var1) {
      tp var2;
      if (var1 == null) {
         var2 = this.ap.ec;
      } else {
         var2 = var1;
      }

      if (var2 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var2.ec;
         return var2;
      }
   }

   tp ag(tp var1) {
      tp var2;
      if (var1 == null) {
         var2 = this.ap.ec;
      } else {
         var2 = var1;
      }

      if (var2 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var2.ec;
         return var2;
      }
   }

   public tp ad() {
      tp var1 = this.aw;
      if (var1 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var1.ec;
         return var1;
      }
   }

   public Iterator iterator() {
      return new pb(this);
   }

   public void ap() {
      while(this.ap.ec != this.ap) {
         this.ap.ec.kg();
      }

   }
}
