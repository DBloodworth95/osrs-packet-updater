public final class rt implements Comparable {
   Object ac;
   Object ae;
   long ag;
   long am;
   static final int ah = 2;
   static int al;

   public int am(Object var1) {
      return this.ac((rt)var1, (byte)-120);
   }

   int ac(rt var1, byte var2) {
      try {
         if (-5928809105467844723L * this.am < -5928809105467844723L * var1.am) {
            if (var2 == 0) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (this.am * -5928809105467844723L > -5928809105467844723L * var1.am) {
            if (var2 == 0) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "rt.ac(" + ')');
      }
   }

   public int compareTo(Object var1) {
      try {
         return this.ac((rt)var1, (byte)-3);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "rt.compareTo(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         if (var1 instanceof rt) {
            return this.ae.equals(((rt)var1).ae);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "rt.equals(" + ')');
      }
   }

   public int hashCode() {
      try {
         return this.ae.hashCode();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "rt.hashCode(" + ')');
      }
   }

   public boolean gn(Object var1) {
      if (var1 instanceof rt) {
         return this.ae.equals(((rt)var1).ae);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public boolean gg(Object var1) {
      if (var1 instanceof rt) {
         return this.ae.equals(((rt)var1).ae);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int amy() {
      return this.ae.hashCode();
   }

   public int amd() {
      return this.ae.hashCode();
   }

   int ag(rt var1) {
      if (-5928809105467844723L * this.am < -5928809105467844723L * var1.am) {
         return -1;
      } else {
         return this.am * -5928809105467844723L > -5928809105467844723L * var1.am ? 1 : 0;
      }
   }

   rt(Object var1, Object var2) {
      try {
         super();
         this.ac = var1;
         this.ae = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "rt.<init>(" + ')');
      }
   }

   int ae(rt var1) {
      if (-5928809105467844723L * this.am < -5928809105467844723L * var1.am) {
         return -1;
      } else {
         return this.am * -5928809105467844723L > -5928809105467844723L * var1.am ? 1 : 0;
      }
   }
}
