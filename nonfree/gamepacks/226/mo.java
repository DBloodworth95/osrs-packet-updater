import java.lang.ref.SoftReference;

public class mo extends mf {
   SoftReference ap;

   boolean aj() {
      return true;
   }

   Object ap() {
      return this.ap.get();
   }

   boolean aw() {
      return true;
   }

   Object as() {
      return this.ap.get();
   }

   mo(Object var1, int var2) {
      super(var2);
      this.ap = new SoftReference(var1);
   }

   boolean ai() {
      return true;
   }

   boolean ak() {
      return true;
   }

   Object ay() {
      return this.ap.get();
   }

   Object ae() {
      return this.ap.get();
   }
}
