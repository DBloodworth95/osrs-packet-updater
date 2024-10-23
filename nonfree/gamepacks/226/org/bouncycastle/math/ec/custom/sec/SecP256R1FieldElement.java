package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

public class SecP256R1FieldElement extends ECFieldElement {
   public static final BigInteger Q;
   public int[] x;

   public String getFieldName() {
      return "SecP256R1Field";
   }

   public SecP256R1FieldElement() {
      this.x = Nat256.create();
   }

   public ECFieldElement subtract(ECFieldElement var1) {
      int[] var2 = Nat256.create();
      SecP256R1Field.subtract(this.x, ((SecP256R1FieldElement)var1).x, var2);
      return new SecP256R1FieldElement(var2);
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecP256R1FieldElement)) {
         return false;
      } else {
         SecP256R1FieldElement var2 = (SecP256R1FieldElement)var1;
         return Nat256.eq(this.x, var2.x);
      }
   }

   public boolean isOne() {
      return Nat256.isOne(this.x);
   }

   public int getFieldSize() {
      return Q.bitLength();
   }

   public BigInteger toBigInteger() {
      return Nat256.toBigInteger(this.x);
   }

   public ECFieldElement square() {
      int[] var1 = Nat256.create();
      SecP256R1Field.square(this.x, var1);
      return new SecP256R1FieldElement(var1);
   }

   public SecP256R1FieldElement(BigInteger var1) {
      if (var1 != null && var1.signum() >= 0 && var1.compareTo(Q) < 0) {
         this.x = SecP256R1Field.fromBigInteger(var1);
      } else {
         throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
      }
   }

   public ECFieldElement add(ECFieldElement var1) {
      int[] var2 = Nat256.create();
      SecP256R1Field.add(this.x, ((SecP256R1FieldElement)var1).x, var2);
      return new SecP256R1FieldElement(var2);
   }

   public ECFieldElement addOne() {
      int[] var1 = Nat256.create();
      SecP256R1Field.addOne(this.x, var1);
      return new SecP256R1FieldElement(var1);
   }

   public boolean testBitZero() {
      return Nat256.getBit(this.x, 0) == 1;
   }

   public ECFieldElement multiply(ECFieldElement var1) {
      int[] var2 = Nat256.create();
      SecP256R1Field.multiply(this.x, ((SecP256R1FieldElement)var1).x, var2);
      return new SecP256R1FieldElement(var2);
   }

   public ECFieldElement divide(ECFieldElement var1) {
      int[] var2 = Nat256.create();
      Mod.invert(SecP256R1Field.P, ((SecP256R1FieldElement)var1).x, var2);
      SecP256R1Field.multiply(var2, this.x, var2);
      return new SecP256R1FieldElement(var2);
   }

   public ECFieldElement negate() {
      int[] var1 = Nat256.create();
      SecP256R1Field.negate(this.x, var1);
      return new SecP256R1FieldElement(var1);
   }

   public int amb() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 8);
   }

   public ECFieldElement invert() {
      int[] var1 = Nat256.create();
      Mod.invert(SecP256R1Field.P, this.x, var1);
      return new SecP256R1FieldElement(var1);
   }

   public ECFieldElement sqrt() {
      int[] var1 = this.x;
      if (!Nat256.isZero(var1) && !Nat256.isOne(var1)) {
         int[] var2 = Nat256.create();
         int[] var3 = Nat256.create();
         SecP256R1Field.square(var1, var2);
         SecP256R1Field.multiply(var2, var1, var2);
         SecP256R1Field.squareN(var2, 2, var3);
         SecP256R1Field.multiply(var3, var2, var3);
         SecP256R1Field.squareN(var3, 4, var2);
         SecP256R1Field.multiply(var2, var3, var2);
         SecP256R1Field.squareN(var2, 8, var3);
         SecP256R1Field.multiply(var3, var2, var3);
         SecP256R1Field.squareN(var3, 16, var2);
         SecP256R1Field.multiply(var2, var3, var2);
         SecP256R1Field.squareN(var2, 32, var2);
         SecP256R1Field.multiply(var2, var1, var2);
         SecP256R1Field.squareN(var2, 96, var2);
         SecP256R1Field.multiply(var2, var1, var2);
         SecP256R1Field.squareN(var2, 94, var2);
         SecP256R1Field.square(var2, var3);
         return Nat256.eq(var1, var3) ? new SecP256R1FieldElement(var2) : null;
      } else {
         return this;
      }
   }

   public int aml() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 8);
   }

   public boolean gj(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecP256R1FieldElement)) {
         return false;
      } else {
         SecP256R1FieldElement var2 = (SecP256R1FieldElement)var1;
         return Nat256.eq(this.x, var2.x);
      }
   }

   static {
      Q = SecP256R1Curve.q;
   }

   public SecP256R1FieldElement(int[] var1) {
      this.x = var1;
   }

   public int ams() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 8);
   }

   public int amf() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 8);
   }

   public boolean isZero() {
      return Nat256.isZero(this.x);
   }

   public int amg() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 8);
   }

   public int hashCode() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 8);
   }
}
