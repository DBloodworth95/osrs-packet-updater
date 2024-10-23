public final class rw implements Comparable {
   Object ap;
   Object aw;
   static final int ab = 32768;
   long aj;
   long ak;
   static final int by = 12;

   public int aml() {
      return this.aw.hashCode();
   }

   int ap(rw var1, int var2) {
      try {
         if (-1350957852148844265L * this.aj < var1.aj * -1350957852148844265L) {
            if (var2 == 2099539222) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (this.aj * -1350957852148844265L > var1.aj * -1350957852148844265L) {
            if (var2 == 2099539222) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rw.ap(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         if (var1 instanceof rw) {
            return this.aw.equals(((rw)var1).aw);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rw.equals(" + ')');
      }
   }

   public int hashCode() {
      try {
         return this.aw.hashCode();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "rw.hashCode(" + ')');
      }
   }

   int aw(rw var1) {
      if (-1350957852148844265L * this.aj < var1.aj * -1350957852148844265L) {
         return -1;
      } else {
         return this.aj * -1350957852148844265L > var1.aj * -1350957852148844265L ? 1 : 0;
      }
   }

   public boolean gj(Object var1) {
      if (var1 instanceof rw) {
         return this.aw.equals(((rw)var1).aw);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int ams() {
      return this.aw.hashCode();
   }

   public int amf() {
      return this.aw.hashCode();
   }

   public int compareTo(Object var1) {
      try {
         return this.ap((rw)var1, 1460852809);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rw.compareTo(" + ')');
      }
   }

   int ak(rw var1) {
      if (-1350957852148844265L * this.aj < var1.aj * -1350957852148844265L) {
         return -1;
      } else {
         return this.aj * -1350957852148844265L > var1.aj * -1350957852148844265L ? 1 : 0;
      }
   }

   rw(Object var1, Object var2) {
      try {
         super();
         this.ap = var1;
         this.aw = var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rw.<init>(" + ')');
      }
   }

   public int amg() {
      return this.aw.hashCode();
   }

   public int ay(Object var1) {
      return this.ap((rw)var1, 1534734398);
   }

   int aj(rw var1) {
      if (-1350957852148844265L * this.aj < var1.aj * -1350957852148844265L) {
         return -1;
      } else {
         return this.aj * -1350957852148844265L > var1.aj * -1350957852148844265L ? 1 : 0;
      }
   }

   int ai(rw var1) {
      if (-1350957852148844265L * this.aj < var1.aj * -1350957852148844265L) {
         return -1;
      } else {
         return this.aj * -1350957852148844265L > var1.aj * -1350957852148844265L ? 1 : 0;
      }
   }

   public int amb() {
      return this.aw.hashCode();
   }
}
