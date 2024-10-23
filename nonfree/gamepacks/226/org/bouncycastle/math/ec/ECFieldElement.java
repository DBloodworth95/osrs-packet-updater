package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.util.BigIntegers;

public abstract class ECFieldElement implements ECConstants {
   public abstract String getFieldName();

   public abstract BigInteger toBigInteger();

   public abstract int getFieldSize();

   public abstract ECFieldElement square();

   public abstract ECFieldElement invert();

   public abstract ECFieldElement negate();

   public abstract ECFieldElement multiply(ECFieldElement var1);

   public abstract ECFieldElement divide(ECFieldElement var1);

   public abstract ECFieldElement addOne();

   public abstract ECFieldElement subtract(ECFieldElement var1);

   public String toString() {
      return this.toBigInteger().toString(16);
   }

   public abstract ECFieldElement sqrt();

   public int bitLength() {
      return this.toBigInteger().bitLength();
   }

   public boolean isOne() {
      return this.bitLength() == 1;
   }

   public boolean isZero() {
      return 0 == this.toBigInteger().signum();
   }

   public ECFieldElement multiplyMinusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      return this.multiply(var1).subtract(var2.multiply(var3));
   }

   public ECFieldElement multiplyPlusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      return this.multiply(var1).add(var2.multiply(var3));
   }

   public ECFieldElement squareMinusProduct(ECFieldElement var1, ECFieldElement var2) {
      return this.square().subtract(var1.multiply(var2));
   }

   public ECFieldElement squarePlusProduct(ECFieldElement var1, ECFieldElement var2) {
      return this.square().add(var1.multiply(var2));
   }

   public ECFieldElement squarePow(int var1) {
      ECFieldElement var2 = this;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = var2.square();
      }

      return var2;
   }

   public boolean testBitZero() {
      return this.toBigInteger().testBit(0);
   }

   public abstract ECFieldElement add(ECFieldElement var1);

   public byte[] getEncoded() {
      return BigIntegers.asUnsignedByteArray((this.getFieldSize() + 7) / 8, this.toBigInteger());
   }

   public String amw() {
      return this.toBigInteger().toString(16);
   }

   public String amu() {
      return this.toBigInteger().toString(16);
   }
}
