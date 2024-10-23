package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Arrays;

public class SecT163FieldElement extends ECFieldElement {
   public long[] x;

   public ECFieldElement square() {
      long[] var1 = Nat192.create64();
      SecT163Field.square(this.x, var1);
      return new SecT163FieldElement(var1);
   }

   public SecT163FieldElement() {
      this.x = Nat192.create64();
   }

   public SecT163FieldElement(long[] var1) {
      this.x = var1;
   }

   public ECFieldElement squareMinusProduct(ECFieldElement var1, ECFieldElement var2) {
      return this.squarePlusProduct(var1, var2);
   }

   public int getFieldSize() {
      return 163;
   }

   public BigInteger toBigInteger() {
      return Nat192.toBigInteger64(this.x);
   }

   public int getK2() {
      return 6;
   }

   public String getFieldName() {
      return "SecT163Field";
   }

   public SecT163FieldElement(BigInteger var1) {
      if (var1 != null && var1.signum() >= 0 && var1.bitLength() <= 163) {
         this.x = SecT163Field.fromBigInteger(var1);
      } else {
         throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
      }
   }

   public ECFieldElement add(ECFieldElement var1) {
      long[] var2 = Nat192.create64();
      SecT163Field.add(this.x, ((SecT163FieldElement)var1).x, var2);
      return new SecT163FieldElement(var2);
   }

   public boolean testBitZero() {
      return (this.x[0] & 1L) != 0L;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecT163FieldElement)) {
         return false;
      } else {
         SecT163FieldElement var2 = (SecT163FieldElement)var1;
         return Nat192.eq64(this.x, var2.x);
      }
   }

   public ECFieldElement multiply(ECFieldElement var1) {
      long[] var2 = Nat192.create64();
      SecT163Field.multiply(this.x, ((SecT163FieldElement)var1).x, var2);
      return new SecT163FieldElement(var2);
   }

   public ECFieldElement multiplyMinusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      return this.multiplyPlusProduct(var1, var2, var3);
   }

   public ECFieldElement multiplyPlusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      long[] var4 = this.x;
      long[] var5 = ((SecT163FieldElement)var1).x;
      long[] var6 = ((SecT163FieldElement)var2).x;
      long[] var7 = ((SecT163FieldElement)var3).x;
      long[] var8 = Nat192.createExt64();
      SecT163Field.multiplyAddToExt(var4, var5, var8);
      SecT163Field.multiplyAddToExt(var6, var7, var8);
      long[] var9 = Nat192.create64();
      SecT163Field.reduce(var8, var9);
      return new SecT163FieldElement(var9);
   }

   public ECFieldElement divide(ECFieldElement var1) {
      return this.multiply(var1.invert());
   }

   public ECFieldElement negate() {
      return this;
   }

   public boolean gg(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecT163FieldElement)) {
         return false;
      } else {
         SecT163FieldElement var2 = (SecT163FieldElement)var1;
         return Nat192.eq64(this.x, var2.x);
      }
   }

   public ECFieldElement addOne() {
      long[] var1 = Nat192.create64();
      SecT163Field.addOne(this.x, var1);
      return new SecT163FieldElement(var1);
   }

   public ECFieldElement squarePlusProduct(ECFieldElement var1, ECFieldElement var2) {
      long[] var3 = this.x;
      long[] var4 = ((SecT163FieldElement)var1).x;
      long[] var5 = ((SecT163FieldElement)var2).x;
      long[] var6 = Nat192.createExt64();
      SecT163Field.squareAddToExt(var3, var6);
      SecT163Field.multiplyAddToExt(var4, var5, var6);
      long[] var7 = Nat192.create64();
      SecT163Field.reduce(var6, var7);
      return new SecT163FieldElement(var7);
   }

   public ECFieldElement squarePow(int var1) {
      if (var1 < 1) {
         return this;
      } else {
         long[] var2 = Nat192.create64();
         SecT163Field.squareN(this.x, var1, var2);
         return new SecT163FieldElement(var2);
      }
   }

   public ECFieldElement invert() {
      long[] var1 = Nat192.create64();
      SecT163Field.invert(this.x, var1);
      return new SecT163FieldElement(var1);
   }

   public ECFieldElement sqrt() {
      long[] var1 = Nat192.create64();
      SecT163Field.sqrt(this.x, var1);
      return new SecT163FieldElement(var1);
   }

   public ECFieldElement subtract(ECFieldElement var1) {
      return this.add(var1);
   }

   public int getM() {
      return 163;
   }

   public int getK1() {
      return 3;
   }

   public int getRepresentation() {
      return 3;
   }

   public boolean isOne() {
      return Nat192.isOne64(this.x);
   }

   public boolean isZero() {
      return Nat192.isZero64(this.x);
   }

   public int hashCode() {
      return 163763 ^ Arrays.hashCode((long[])this.x, 0, 3);
   }

   public boolean gn(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecT163FieldElement)) {
         return false;
      } else {
         SecT163FieldElement var2 = (SecT163FieldElement)var1;
         return Nat192.eq64(this.x, var2.x);
      }
   }

   public int getK3() {
      return 7;
   }

   public int amy() {
      return 163763 ^ Arrays.hashCode((long[])this.x, 0, 3);
   }

   public int amd() {
      return 163763 ^ Arrays.hashCode((long[])this.x, 0, 3);
   }
}
