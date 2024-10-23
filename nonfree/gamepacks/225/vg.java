public class vg implements ps {
   final int at;
   public static final vg ae = new vg(1, 2);
   static final vg ag = new vg(2, 5);
   static final vg am = new vg(4, 6);
   static final vg ax = new vg(5, 7);
   static final vg aq = new vg(0, 8);
   public static final vg ac = new vg(3, 0);
   final int af;

   public boolean aq() {
      return ae == this;
   }

   vg(int var1, int var2) {
      try {
         super();
         this.af = var1 * 1107547901;
         this.at = var2 * 1167644155;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vg.<init>(" + ')');
      }
   }

   public boolean ax(byte var1) {
      try {
         boolean var10000;
         if (ae == this) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vg.ax(" + ')');
      }
   }

   public int ac(int var1) {
      try {
         return this.at * 656207155;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vg.ac(" + ')');
      }
   }

   public int ae() {
      return this.at * 656207155;
   }

   public int am() {
      return this.at * 656207155;
   }

   public int ag() {
      return this.at * 656207155;
   }

   public boolean af() {
      return ae == this;
   }
}
