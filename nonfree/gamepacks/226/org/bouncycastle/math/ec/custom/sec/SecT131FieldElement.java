package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Arrays;

public class SecT131FieldElement extends ECFieldElement {
   public long[] x;

   public int getK2() {
      return 3;
   }

   public SecT131FieldElement() {
      this.x = Nat192.create64();
   }

   public SecT131FieldElement(long[] var1) {
      this.x = var1;
   }

   public ECFieldElement multiplyMinusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      return this.multiplyPlusProduct(var1, var2, var3);
   }

   public boolean isZero() {
      return Nat192.isZero64(this.x);
   }

   public ECFieldElement squarePlusProduct(ECFieldElement var1, ECFieldElement var2) {
      long[] var3 = this.x;
      long[] var4 = ((SecT131FieldElement)var1).x;
      long[] var5 = ((SecT131FieldElement)var2).x;
      long[] var6 = Nat.create64(5);
      SecT131Field.squareAddToExt(var3, var6);
      SecT131Field.multiplyAddToExt(var4, var5, var6);
      long[] var7 = Nat192.create64();
      SecT131Field.reduce(var6, var7);
      return new SecT131FieldElement(var7);
   }

   public BigInteger toBigInteger() {
      return Nat192.toBigInteger64(this.x);
   }

   public String getFieldName() {
      return "SecT131Field";
   }

   public int getFieldSize() {
      return 131;
   }

   public boolean isOne() {
      return Nat192.isOne64(this.x);
   }

   public ECFieldElement add(ECFieldElement var1) {
      long[] var2 = Nat192.create64();
      SecT131Field.add(this.x, ((SecT131FieldElement)var1).x, var2);
      return new SecT131FieldElement(var2);
   }

   public int amf() {
      return 131832 ^ Arrays.hashCode((long[])this.x, 0, 3);
   }

   public ECFieldElement multiply(ECFieldElement var1) {
      long[] var2 = Nat192.create64();
      SecT131Field.multiply(this.x, ((SecT131FieldElement)var1).x, var2);
      return new SecT131FieldElement(var2);
   }

   public int getRepresentation() {
      return 3;
   }

   public ECFieldElement multiplyPlusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      long[] var4 = this.x;
      long[] var5 = ((SecT131FieldElement)var1).x;
      long[] var6 = ((SecT131FieldElement)var2).x;
      long[] var7 = ((SecT131FieldElement)var3).x;
      long[] var8 = Nat.create64(5);
      SecT131Field.multiplyAddToExt(var4, var5, var8);
      SecT131Field.multiplyAddToExt(var6, var7, var8);
      long[] var9 = Nat192.create64();
      SecT131Field.reduce(var8, var9);
      return new SecT131FieldElement(var9);
   }

   public ECFieldElement divide(ECFieldElement var1) {
      return this.multiply(var1.invert());
   }

   public ECFieldElement negate() {
      return this;
   }

   public ECFieldElement square() {
      long[] var1 = Nat192.create64();
      SecT131Field.square(this.x, var1);
      return new SecT131FieldElement(var1);
   }

   public ECFieldElement squareMinusProduct(ECFieldElement var1, ECFieldElement var2) {
      return this.squarePlusProduct(var1, var2);
   }

   public int getK1() {
      return 2;
   }

   public ECFieldElement squarePow(int var1) {
      if (var1 < 1) {
         return this;
      } else {
         long[] var2 = Nat192.create64();
         SecT131Field.squareN(this.x, var1, var2);
         return new SecT131FieldElement(var2);
      }
   }

   public SecT131FieldElement(BigInteger var1) {
      if (var1 != null && var1.signum() >= 0 && var1.bitLength() <= 131) {
         this.x = SecT131Field.fromBigInteger(var1);
      } else {
         throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
      }
   }

   public ECFieldElement sqrt() {
      long[] var1 = Nat192.create64();
      SecT131Field.sqrt(this.x, var1);
      return new SecT131FieldElement(var1);
   }

   public ECFieldElement subtract(ECFieldElement var1) {
      return this.add(var1);
   }

   public int getM() {
      return 131;
   }

   public boolean testBitZero() {
      return (this.x[0] & 1L) != 0L;
   }

   public ECFieldElement addOne() {
      long[] var1 = Nat192.create64();
      SecT131Field.addOne(this.x, var1);
      return new SecT131FieldElement(var1);
   }

   public int getK3() {
      return 8;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecT131FieldElement)) {
         return false;
      } else {
         SecT131FieldElement var2 = (SecT131FieldElement)var1;
         return Nat192.eq64(this.x, var2.x);
      }
   }

   public int hashCode() {
      return 131832 ^ Arrays.hashCode((long[])this.x, 0, 3);
   }

   public boolean gj(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecT131FieldElement)) {
         return false;
      } else {
         SecT131FieldElement var2 = (SecT131FieldElement)var1;
         return Nat192.eq64(this.x, var2.x);
      }
   }

   public int ams() {
      return 131832 ^ Arrays.hashCode((long[])this.x, 0, 3);
   }

   public ECFieldElement invert() {
      long[] var1 = Nat192.create64();
      SecT131Field.invert(this.x, var1);
      return new SecT131FieldElement(var1);
   }

   public int amb() {
      return 131832 ^ Arrays.hashCode((long[])this.x, 0, 3);
   }

   public int amg() {
      return -572933266 ^ Arrays.hashCode((long[])this.x, 0, 3);
   }

   public int aml() {
      return 131832 ^ Arrays.hashCode((long[])this.x, 0, 3);
   }
}
