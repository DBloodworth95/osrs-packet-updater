package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

public class SecT193FieldElement extends ECFieldElement {
   public long[] x;

   public int getFieldSize() {
      return 193;
   }

   public BigInteger toBigInteger() {
      return Nat256.toBigInteger64(this.x);
   }

   public SecT193FieldElement(long[] var1) {
      this.x = var1;
   }

   public ECFieldElement negate() {
      return this;
   }

   public boolean isZero() {
      return Nat256.isZero64(this.x);
   }

   public boolean testBitZero() {
      return (this.x[0] & 1L) != 0L;
   }

   public boolean isOne() {
      return Nat256.isOne64(this.x);
   }

   public String getFieldName() {
      return "SecT193Field";
   }

   public SecT193FieldElement(BigInteger var1) {
      if (var1 != null && var1.signum() >= 0 && var1.bitLength() <= 193) {
         this.x = SecT193Field.fromBigInteger(var1);
      } else {
         throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
      }
   }

   public int getK3() {
      return 0;
   }

   public ECFieldElement addOne() {
      long[] var1 = Nat256.create64();
      SecT193Field.addOne(this.x, var1);
      return new SecT193FieldElement(var1);
   }

   public ECFieldElement subtract(ECFieldElement var1) {
      return this.add(var1);
   }

   public ECFieldElement multiply(ECFieldElement var1) {
      long[] var2 = Nat256.create64();
      SecT193Field.multiply(this.x, ((SecT193FieldElement)var1).x, var2);
      return new SecT193FieldElement(var2);
   }

   public ECFieldElement multiplyMinusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      return this.multiplyPlusProduct(var1, var2, var3);
   }

   public ECFieldElement multiplyPlusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      long[] var4 = this.x;
      long[] var5 = ((SecT193FieldElement)var1).x;
      long[] var6 = ((SecT193FieldElement)var2).x;
      long[] var7 = ((SecT193FieldElement)var3).x;
      long[] var8 = Nat256.createExt64();
      SecT193Field.multiplyAddToExt(var4, var5, var8);
      SecT193Field.multiplyAddToExt(var6, var7, var8);
      long[] var9 = Nat256.create64();
      SecT193Field.reduce(var8, var9);
      return new SecT193FieldElement(var9);
   }

   public ECFieldElement divide(ECFieldElement var1) {
      return this.multiply(var1.invert());
   }

   public int amg() {
      return 1930015 ^ Arrays.hashCode((long[])this.x, 0, 4);
   }

   public ECFieldElement square() {
      long[] var1 = Nat256.create64();
      SecT193Field.square(this.x, var1);
      return new SecT193FieldElement(var1);
   }

   public SecT193FieldElement() {
      this.x = Nat256.create64();
   }

   public ECFieldElement squarePlusProduct(ECFieldElement var1, ECFieldElement var2) {
      long[] var3 = this.x;
      long[] var4 = ((SecT193FieldElement)var1).x;
      long[] var5 = ((SecT193FieldElement)var2).x;
      long[] var6 = Nat256.createExt64();
      SecT193Field.squareAddToExt(var3, var6);
      SecT193Field.multiplyAddToExt(var4, var5, var6);
      long[] var7 = Nat256.create64();
      SecT193Field.reduce(var6, var7);
      return new SecT193FieldElement(var7);
   }

   public ECFieldElement add(ECFieldElement var1) {
      long[] var2 = Nat256.create64();
      SecT193Field.add(this.x, ((SecT193FieldElement)var1).x, var2);
      return new SecT193FieldElement(var2);
   }

   public ECFieldElement invert() {
      long[] var1 = Nat256.create64();
      SecT193Field.invert(this.x, var1);
      return new SecT193FieldElement(var1);
   }

   public ECFieldElement sqrt() {
      long[] var1 = Nat256.create64();
      SecT193Field.sqrt(this.x, var1);
      return new SecT193FieldElement(var1);
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecT193FieldElement)) {
         return false;
      } else {
         SecT193FieldElement var2 = (SecT193FieldElement)var1;
         return Nat256.eq64(this.x, var2.x);
      }
   }

   public int getM() {
      return 193;
   }

   public ECFieldElement squareMinusProduct(ECFieldElement var1, ECFieldElement var2) {
      return this.squarePlusProduct(var1, var2);
   }

   public int getK2() {
      return 0;
   }

   public ECFieldElement squarePow(int var1) {
      if (var1 < 1) {
         return this;
      } else {
         long[] var2 = Nat256.create64();
         SecT193Field.squareN(this.x, var1, var2);
         return new SecT193FieldElement(var2);
      }
   }

   public int getRepresentation() {
      return 2;
   }

   public int hashCode() {
      return 1930015 ^ Arrays.hashCode((long[])this.x, 0, 4);
   }

   public boolean gj(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecT193FieldElement)) {
         return false;
      } else {
         SecT193FieldElement var2 = (SecT193FieldElement)var1;
         return Nat256.eq64(this.x, var2.x);
      }
   }

   public int ams() {
      return 1644277577 ^ Arrays.hashCode((long[])this.x, 0, 4);
   }

   public int amf() {
      return 1930015 ^ Arrays.hashCode((long[])this.x, 0, 4);
   }

   public int amb() {
      return 1930015 ^ Arrays.hashCode((long[])this.x, 0, 4);
   }

   public int aml() {
      return 1930015 ^ Arrays.hashCode((long[])this.x, 0, 4);
   }

   public int getK1() {
      return 15;
   }
}
