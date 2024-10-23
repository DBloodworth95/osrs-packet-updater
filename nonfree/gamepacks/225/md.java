import java.lang.ref.SoftReference;

public class md extends mb {
   SoftReference ac;

   boolean af() {
      return true;
   }

   md(Object var1, int var2) {
      super(var2);
      this.ac = new SoftReference(var1);
   }

   boolean ae() {
      return true;
   }

   Object ag() {
      return this.ac.get();
   }

   Object ac() {
      return this.ac.get();
   }

   boolean am() {
      return true;
   }

   boolean aq() {
      return true;
   }

   boolean ax() {
      return true;
   }
}
