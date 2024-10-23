package org.bouncycastle.math.field;

import org.bouncycastle.util.Arrays;

class GF2Polynomial implements Polynomial {
   public final int[] exponents;

   public int getDegree() {
      return this.exponents[this.exponents.length - 1];
   }

   public boolean gj(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GF2Polynomial)) {
         return false;
      } else {
         GF2Polynomial var2 = (GF2Polynomial)var1;
         return Arrays.areEqual(this.exponents, var2.exponents);
      }
   }

   public int[] getExponentsPresent() {
      return Arrays.clone(this.exponents);
   }

   public int amg() {
      return Arrays.hashCode(this.exponents);
   }

   public int hashCode() {
      return Arrays.hashCode(this.exponents);
   }

   GF2Polynomial(int[] var1) {
      this.exponents = Arrays.clone(var1);
   }

   public int ams() {
      return Arrays.hashCode(this.exponents);
   }

   public int amf() {
      return Arrays.hashCode(this.exponents);
   }

   public int amb() {
      return Arrays.hashCode(this.exponents);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GF2Polynomial)) {
         return false;
      } else {
         GF2Polynomial var2 = (GF2Polynomial)var1;
         return Arrays.areEqual(this.exponents, var2.exponents);
      }
   }

   public int aml() {
      return Arrays.hashCode(this.exponents);
   }
}
