package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

public class DHValidationParameters {
   byte[] seed;
   int counter;

   public int amy() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }

   public int hashCode() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }

   public byte[] getSeed() {
      return this.seed;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof DHValidationParameters)) {
         return false;
      } else {
         DHValidationParameters var2 = (DHValidationParameters)var1;
         return var2.counter != this.counter ? false : Arrays.areEqual(this.seed, var2.seed);
      }
   }

   public DHValidationParameters(byte[] var1, int var2) {
      this.seed = var1;
      this.counter = var2;
   }

   public boolean gn(Object var1) {
      if (!(var1 instanceof DHValidationParameters)) {
         return false;
      } else {
         DHValidationParameters var2 = (DHValidationParameters)var1;
         return var2.counter != this.counter ? false : Arrays.areEqual(this.seed, var2.seed);
      }
   }

   public boolean gg(Object var1) {
      if (!(var1 instanceof DHValidationParameters)) {
         return false;
      } else {
         DHValidationParameters var2 = (DHValidationParameters)var1;
         return var2.counter != this.counter ? false : Arrays.areEqual(this.seed, var2.seed);
      }
   }

   public int getCounter() {
      return this.counter;
   }

   public int amd() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }
}
