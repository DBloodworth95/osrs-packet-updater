package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.util.BigIntegers;

public abstract class ECFieldElement implements ECConstants {
   public String amp() {
      return this.toBigInteger().toString(16);
   }

   public ECFieldElement multiplyMinusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      return this.multiply(var1).subtract(var2.multiply(var3));
   }

   public abstract String getFieldName();

   public abstract int getFieldSize();

   public ECFieldElement squarePlusProduct(ECFieldElement var1, ECFieldElement var2) {
      return this.square().add(var1.multiply(var2));
   }

   public abstract ECFieldElement addOne();

   public abstract ECFieldElement subtract(ECFieldElement var1);

   public abstract ECFieldElement multiply(ECFieldElement var1);

   public abstract ECFieldElement divide(ECFieldElement var1);

   public abstract ECFieldElement square();

   public abstract ECFieldElement negate();

   public abstract ECFieldElement invert();

   public abstract ECFieldElement sqrt();

   public abstract BigInteger toBigInteger();

   public int bitLength() {
      return this.toBigInteger().bitLength();
   }

   public abstract ECFieldElement add(ECFieldElement var1);

   public boolean testBitZero() {
      return this.toBigInteger().testBit(0);
   }

   public ECFieldElement multiplyPlusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      return this.multiply(var1).add(var2.multiply(var3));
   }

   public ECFieldElement squareMinusProduct(ECFieldElement var1, ECFieldElement var2) {
      return this.square().subtract(var1.multiply(var2));
   }

   public byte[] getEncoded() {
      return BigIntegers.asUnsignedByteArray((this.getFieldSize() + 7) / 8, this.toBigInteger());
   }

   public ECFieldElement squarePow(int var1) {
      ECFieldElement var2 = this;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = var2.square();
      }

      return var2;
   }

   public String toString() {
      return this.toBigInteger().toString(16);
   }

   public boolean isZero() {
      return 0 == this.toBigInteger().signum();
   }

   public String aml() {
      return this.toBigInteger().toString(16);
   }

   public boolean isOne() {
      return this.bitLength() == 1;
   }

   public String ame() {
      return this.toBigInteger().toString(16);
   }
}
