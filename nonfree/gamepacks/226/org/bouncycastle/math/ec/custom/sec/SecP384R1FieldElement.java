package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;

public class SecP384R1FieldElement extends ECFieldElement {
   public int[] x;
   public static final BigInteger Q;

   public int ams() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 12);
   }

   public SecP384R1FieldElement() {
      this.x = Nat.create(12);
   }

   public SecP384R1FieldElement(int[] var1) {
      this.x = var1;
   }

   public ECFieldElement sqrt() {
      int[] var1 = this.x;
      if (!Nat.isZero(12, var1) && !Nat.isOne(12, var1)) {
         int[] var2 = Nat.create(12);
         int[] var3 = Nat.create(12);
         int[] var4 = Nat.create(12);
         int[] var5 = Nat.create(12);
         SecP384R1Field.square(var1, var2);
         SecP384R1Field.multiply(var2, var1, var2);
         SecP384R1Field.squareN(var2, 2, var3);
         SecP384R1Field.multiply(var3, var2, var3);
         SecP384R1Field.square(var3, var3);
         SecP384R1Field.multiply(var3, var1, var3);
         SecP384R1Field.squareN(var3, 5, var4);
         SecP384R1Field.multiply(var4, var3, var4);
         SecP384R1Field.squareN(var4, 5, var5);
         SecP384R1Field.multiply(var5, var3, var5);
         SecP384R1Field.squareN(var5, 15, var3);
         SecP384R1Field.multiply(var3, var5, var3);
         SecP384R1Field.squareN(var3, 2, var4);
         SecP384R1Field.multiply(var2, var4, var2);
         SecP384R1Field.squareN(var4, 28, var4);
         SecP384R1Field.multiply(var3, var4, var3);
         SecP384R1Field.squareN(var3, 60, var4);
         SecP384R1Field.multiply(var4, var3, var4);
         SecP384R1Field.squareN(var4, 120, var3);
         SecP384R1Field.multiply(var3, var4, var3);
         SecP384R1Field.squareN(var3, 15, var3);
         SecP384R1Field.multiply(var3, var5, var3);
         SecP384R1Field.squareN(var3, 33, var3);
         SecP384R1Field.multiply(var3, var2, var3);
         SecP384R1Field.squareN(var3, 64, var3);
         SecP384R1Field.multiply(var3, var1, var3);
         SecP384R1Field.squareN(var3, 30, var2);
         SecP384R1Field.square(var2, var3);
         return Nat.eq(12, var1, var3) ? new SecP384R1FieldElement(var2) : null;
      } else {
         return this;
      }
   }

   public boolean isOne() {
      return Nat.isOne(12, this.x);
   }

   public boolean testBitZero() {
      return Nat.getBit(this.x, 0) == 1;
   }

   public String getFieldName() {
      return "SecP384R1Field";
   }

   public SecP384R1FieldElement(BigInteger var1) {
      if (var1 != null && var1.signum() >= 0 && var1.compareTo(Q) < 0) {
         this.x = SecP384R1Field.fromBigInteger(var1);
      } else {
         throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
      }
   }

   public int getFieldSize() {
      return Q.bitLength();
   }

   static {
      Q = SecP384R1Curve.q;
   }

   public int amb() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 12);
   }

   public ECFieldElement subtract(ECFieldElement var1) {
      int[] var2 = Nat.create(12);
      SecP384R1Field.subtract(this.x, ((SecP384R1FieldElement)var1).x, var2);
      return new SecP384R1FieldElement(var2);
   }

   public ECFieldElement multiply(ECFieldElement var1) {
      int[] var2 = Nat.create(12);
      SecP384R1Field.multiply(this.x, ((SecP384R1FieldElement)var1).x, var2);
      return new SecP384R1FieldElement(var2);
   }

   public ECFieldElement divide(ECFieldElement var1) {
      int[] var2 = Nat.create(12);
      Mod.invert(SecP384R1Field.P, ((SecP384R1FieldElement)var1).x, var2);
      SecP384R1Field.multiply(var2, this.x, var2);
      return new SecP384R1FieldElement(var2);
   }

   public ECFieldElement negate() {
      int[] var1 = Nat.create(12);
      SecP384R1Field.negate(this.x, var1);
      return new SecP384R1FieldElement(var1);
   }

   public ECFieldElement square() {
      int[] var1 = Nat.create(12);
      SecP384R1Field.square(this.x, var1);
      return new SecP384R1FieldElement(var1);
   }

   public ECFieldElement invert() {
      int[] var1 = Nat.create(12);
      Mod.invert(SecP384R1Field.P, this.x, var1);
      return new SecP384R1FieldElement(var1);
   }

   public ECFieldElement add(ECFieldElement var1) {
      int[] var2 = Nat.create(12);
      SecP384R1Field.add(this.x, ((SecP384R1FieldElement)var1).x, var2);
      return new SecP384R1FieldElement(var2);
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecP384R1FieldElement)) {
         return false;
      } else {
         SecP384R1FieldElement var2 = (SecP384R1FieldElement)var1;
         return Nat.eq(12, this.x, var2.x);
      }
   }

   public int hashCode() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 12);
   }

   public ECFieldElement addOne() {
      int[] var1 = Nat.create(12);
      SecP384R1Field.addOne(this.x, var1);
      return new SecP384R1FieldElement(var1);
   }

   public boolean gj(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecP384R1FieldElement)) {
         return false;
      } else {
         SecP384R1FieldElement var2 = (SecP384R1FieldElement)var1;
         return Nat.eq(12, this.x, var2.x);
      }
   }

   public boolean isZero() {
      return Nat.isZero(12, this.x);
   }

   public BigInteger toBigInteger() {
      return Nat.toBigInteger(12, this.x);
   }

   public int amf() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 12);
   }

   public int amg() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 12);
   }

   public int aml() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 12);
   }
}
