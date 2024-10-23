package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

public class SecP256K1FieldElement extends ECFieldElement {
   public int[] x;
   public static final BigInteger Q;

   public boolean isOne() {
      return Nat256.isOne(this.x);
   }

   public SecP256K1FieldElement() {
      this.x = Nat256.create();
   }

   public ECFieldElement multiply(ECFieldElement var1) {
      int[] var2 = Nat256.create();
      SecP256K1Field.multiply(this.x, ((SecP256K1FieldElement)var1).x, var2);
      return new SecP256K1FieldElement(var2);
   }

   static {
      Q = SecP256K1Curve.q;
   }

   public int getFieldSize() {
      return Q.bitLength();
   }

   public boolean testBitZero() {
      return Nat256.getBit(this.x, 0) == 1;
   }

   public BigInteger toBigInteger() {
      return Nat256.toBigInteger(this.x);
   }

   public ECFieldElement add(ECFieldElement var1) {
      int[] var2 = Nat256.create();
      SecP256K1Field.add(this.x, ((SecP256K1FieldElement)var1).x, var2);
      return new SecP256K1FieldElement(var2);
   }

   public String getFieldName() {
      return "SecP256K1Field";
   }

   public SecP256K1FieldElement(BigInteger var1) {
      if (var1 != null && var1.signum() >= 0 && var1.compareTo(Q) < 0) {
         this.x = SecP256K1Field.fromBigInteger(var1);
      } else {
         throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
      }
   }

   public ECFieldElement addOne() {
      int[] var1 = Nat256.create();
      SecP256K1Field.addOne(this.x, var1);
      return new SecP256K1FieldElement(var1);
   }

   public ECFieldElement subtract(ECFieldElement var1) {
      int[] var2 = Nat256.create();
      SecP256K1Field.subtract(this.x, ((SecP256K1FieldElement)var1).x, var2);
      return new SecP256K1FieldElement(var2);
   }

   public boolean isZero() {
      return Nat256.isZero(this.x);
   }

   public ECFieldElement divide(ECFieldElement var1) {
      int[] var2 = Nat256.create();
      Mod.invert(SecP256K1Field.P, ((SecP256K1FieldElement)var1).x, var2);
      SecP256K1Field.multiply(var2, this.x, var2);
      return new SecP256K1FieldElement(var2);
   }

   public ECFieldElement negate() {
      int[] var1 = Nat256.create();
      SecP256K1Field.negate(this.x, var1);
      return new SecP256K1FieldElement(var1);
   }

   public ECFieldElement square() {
      int[] var1 = Nat256.create();
      SecP256K1Field.square(this.x, var1);
      return new SecP256K1FieldElement(var1);
   }

   public ECFieldElement invert() {
      int[] var1 = Nat256.create();
      Mod.invert(SecP256K1Field.P, this.x, var1);
      return new SecP256K1FieldElement(var1);
   }

   public SecP256K1FieldElement(int[] var1) {
      this.x = var1;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecP256K1FieldElement)) {
         return false;
      } else {
         SecP256K1FieldElement var2 = (SecP256K1FieldElement)var1;
         return Nat256.eq(this.x, var2.x);
      }
   }

   public int hashCode() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 8);
   }

   public ECFieldElement sqrt() {
      int[] var1 = this.x;
      if (!Nat256.isZero(var1) && !Nat256.isOne(var1)) {
         int[] var2 = Nat256.create();
         SecP256K1Field.square(var1, var2);
         SecP256K1Field.multiply(var2, var1, var2);
         int[] var3 = Nat256.create();
         SecP256K1Field.square(var2, var3);
         SecP256K1Field.multiply(var3, var1, var3);
         int[] var4 = Nat256.create();
         SecP256K1Field.squareN(var3, 3, var4);
         SecP256K1Field.multiply(var4, var3, var4);
         SecP256K1Field.squareN(var4, 3, var4);
         SecP256K1Field.multiply(var4, var3, var4);
         SecP256K1Field.squareN(var4, 2, var4);
         SecP256K1Field.multiply(var4, var2, var4);
         int[] var7 = Nat256.create();
         SecP256K1Field.squareN(var4, 11, var7);
         SecP256K1Field.multiply(var7, var4, var7);
         SecP256K1Field.squareN(var7, 22, var4);
         SecP256K1Field.multiply(var4, var7, var4);
         int[] var9 = Nat256.create();
         SecP256K1Field.squareN(var4, 44, var9);
         SecP256K1Field.multiply(var9, var4, var9);
         int[] var10 = Nat256.create();
         SecP256K1Field.squareN(var9, 88, var10);
         SecP256K1Field.multiply(var10, var9, var10);
         SecP256K1Field.squareN(var10, 44, var9);
         SecP256K1Field.multiply(var9, var4, var9);
         SecP256K1Field.squareN(var9, 3, var4);
         SecP256K1Field.multiply(var4, var3, var4);
         SecP256K1Field.squareN(var4, 23, var4);
         SecP256K1Field.multiply(var4, var7, var4);
         SecP256K1Field.squareN(var4, 6, var4);
         SecP256K1Field.multiply(var4, var2, var4);
         SecP256K1Field.squareN(var4, 2, var4);
         SecP256K1Field.square(var4, var2);
         return Nat256.eq(var1, var2) ? new SecP256K1FieldElement(var4) : null;
      } else {
         return this;
      }
   }

   public boolean gn(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecP256K1FieldElement)) {
         return false;
      } else {
         SecP256K1FieldElement var2 = (SecP256K1FieldElement)var1;
         return Nat256.eq(this.x, var2.x);
      }
   }

   public boolean gg(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecP256K1FieldElement)) {
         return false;
      } else {
         SecP256K1FieldElement var2 = (SecP256K1FieldElement)var1;
         return Nat256.eq(this.x, var2.x);
      }
   }

   public int amy() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 8);
   }

   public int amd() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 8);
   }
}
