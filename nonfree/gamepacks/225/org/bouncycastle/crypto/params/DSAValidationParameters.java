package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

public class DSAValidationParameters {
   byte[] seed;
   int usageIndex;
   int counter;

   public int getUsageIndex() {
      return this.usageIndex;
   }

   public DSAValidationParameters(byte[] var1, int var2, int var3) {
      this.seed = var1;
      this.counter = var2;
      this.usageIndex = var3;
   }

   public int getCounter() {
      return this.counter;
   }

   public byte[] getSeed() {
      return this.seed;
   }

   public DSAValidationParameters(byte[] var1, int var2) {
      this(var1, var2, -1);
   }

   public int hashCode() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof DSAValidationParameters)) {
         return false;
      } else {
         DSAValidationParameters var2 = (DSAValidationParameters)var1;
         return var2.counter != this.counter ? false : Arrays.areEqual(this.seed, var2.seed);
      }
   }

   public int amy() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }

   public boolean gn(Object var1) {
      if (!(var1 instanceof DSAValidationParameters)) {
         return false;
      } else {
         DSAValidationParameters var2 = (DSAValidationParameters)var1;
         return var2.counter != this.counter ? false : Arrays.areEqual(this.seed, var2.seed);
      }
   }

   public boolean gg(Object var1) {
      if (!(var1 instanceof DSAValidationParameters)) {
         return false;
      } else {
         DSAValidationParameters var2 = (DSAValidationParameters)var1;
         return var2.counter != this.counter ? false : Arrays.areEqual(this.seed, var2.seed);
      }
   }

   public int amd() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }
}
