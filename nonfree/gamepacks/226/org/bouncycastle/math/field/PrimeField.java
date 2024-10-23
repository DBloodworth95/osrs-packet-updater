package org.bouncycastle.math.field;

import java.math.BigInteger;

class PrimeField implements FiniteField {
   public final BigInteger characteristic;

   public BigInteger getCharacteristic() {
      return this.characteristic;
   }

   public int amb() {
      return this.characteristic.hashCode();
   }

   public int getDimension() {
      return 1;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof PrimeField)) {
         return false;
      } else {
         PrimeField var2 = (PrimeField)var1;
         return this.characteristic.equals(var2.characteristic);
      }
   }

   PrimeField(BigInteger var1) {
      this.characteristic = var1;
   }

   public boolean gj(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof PrimeField)) {
         return false;
      } else {
         PrimeField var2 = (PrimeField)var1;
         return this.characteristic.equals(var2.characteristic);
      }
   }

   public int ams() {
      return this.characteristic.hashCode();
   }

   public int amf() {
      return this.characteristic.hashCode();
   }

   public int aml() {
      return this.characteristic.hashCode();
   }

   public int amg() {
      return this.characteristic.hashCode();
   }

   public int hashCode() {
      return this.characteristic.hashCode();
   }
}
