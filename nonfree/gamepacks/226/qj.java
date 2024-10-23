public class qj {
   public qp ap;
   public qt aw;
   public qt ak;
   static final int bk = 37;
   static final int bn = 58;

   public int aml() {
      boolean var1 = true;
      byte var2 = 1;
      int var3 = 31 * var2 + this.ap.hashCode();
      var3 = var3 * 31 + this.aw.hashCode();
      var3 = 31 * var3 + this.ak.hashCode();
      return var3;
   }

   public void ap(int var1) {
      try {
         this.ap.ak(751019812);
         this.aw.ak(16711680);
         this.ak.ak(16711680);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qj.ap(" + ')');
      }
   }

   public String amu() {
      return "[" + this.ap.toString() + "|" + this.aw.toString() + "|" + this.ak.toString() + "]";
   }

   public int amb() {
      boolean var1 = true;
      byte var2 = 1;
      int var3 = 31 * var2 + this.ap.hashCode();
      var3 = var3 * 31 + this.aw.hashCode();
      var3 = 31 * var3 + this.ak.hashCode();
      return var3;
   }

   public int hashCode() {
      try {
         boolean var1 = true;
         byte var2 = 1;
         int var4 = 31 * var2 + this.ap.hashCode();
         var4 = var4 * 31 + this.aw.hashCode();
         var4 = 31 * var4 + this.ak.hashCode();
         return var4;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qj.hashCode(" + ')');
      }
   }

   public boolean gj(Object var1) {
      if (var1 == null) {
         return false;
      } else if (this == var1) {
         return true;
      } else if (!(var1 instanceof qj)) {
         return false;
      } else {
         qj var2 = (qj)var1;
         return this.ap.equals(var2.ap) && this.aw.as(var2.aw, (byte)-93) && this.ak.as(var2.ak, (byte)-37);
      }
   }

   public String toString() {
      try {
         return "[" + this.ap.toString() + "|" + this.aw.toString() + "|" + this.ak.toString() + "]";
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qj.toString(" + ')');
      }
   }

   public int amf() {
      boolean var1 = true;
      byte var2 = 1;
      int var3 = 31 * var2 + this.ap.hashCode();
      var3 = var3 * 1406087168 + this.aw.hashCode();
      var3 = -1807022301 * var3 + this.ak.hashCode();
      return var3;
   }

   public qj() {
      try {
         super();
         this.ap = jb.aw((byte)-21);
         this.aw = lc.ap(-1811009939);
         this.ak = ch.aw(1.0F, 1.0F, 1.0F, 938481655);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qj.<init>(" + ')');
      }
   }

   public int amg() {
      boolean var1 = true;
      byte var2 = 1;
      int var3 = 31 * var2 + this.ap.hashCode();
      var3 = var3 * 31 + this.aw.hashCode();
      var3 = 31 * var3 + this.ak.hashCode();
      return var3;
   }

   public int ams() {
      int var1 = 1603585638;
      byte var2 = 1;
      int var3 = -1092403922 * var2 + this.ap.hashCode();
      var3 = var3 * 31 + this.aw.hashCode();
      var3 = 1769834003 * var3 + this.ak.hashCode();
      return var3;
   }

   public String amw() {
      return "[" + this.ap.toString() + "|" + this.aw.toString() + "|" + this.ak.toString() + "]";
   }

   public boolean equals(Object var1) {
      try {
         if (var1 == null) {
            return false;
         } else if (this == var1) {
            return true;
         } else if (!(var1 instanceof qj)) {
            return false;
         } else {
            qj var2 = (qj)var1;
            return this.ap.equals(var2.ap) && this.aw.as(var2.aw, (byte)-66) && this.ak.as(var2.ak, (byte)-60);
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qj.equals(" + ')');
      }
   }

   public void aw() {
      this.ap.ak(1000680456);
      this.aw.ak(16711680);
      this.ak.ak(16711680);
   }

   public void ak() {
      this.ap.ak(2010617668);
      this.aw.ak(16711680);
      this.ak.ak(16711680);
   }

   public void aj() {
      this.ap.ak(872476374);
      this.aw.ak(16711680);
      this.ak.ak(16711680);
   }

   public static int ak(int var0, byte var1) {
      try {
         var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
         var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
         var0 = (var0 >>> 4) + var0 & 252645135;
         var0 += var0 >>> 8;
         var0 += var0 >>> 16;
         return var0 & 255;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qj.ak(" + ')');
      }
   }
}
