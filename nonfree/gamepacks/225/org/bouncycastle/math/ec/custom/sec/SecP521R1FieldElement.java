package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;

public class SecP521R1FieldElement extends ECFieldElement {
   public int[] x;
   public static final BigInteger Q;

   public boolean gg(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecP521R1FieldElement)) {
         return false;
      } else {
         SecP521R1FieldElement var2 = (SecP521R1FieldElement)var1;
         return Nat.eq(17, this.x, var2.x);
      }
   }

   public SecP521R1FieldElement() {
      this.x = Nat.create(17);
   }

   public BigInteger toBigInteger() {
      return Nat.toBigInteger(17, this.x);
   }

   public boolean isZero() {
      return Nat.isZero(17, this.x);
   }

   public boolean isOne() {
      return Nat.isOne(17, this.x);
   }

   public boolean testBitZero() {
      return Nat.getBit(this.x, 0) == 1;
   }

   public int hashCode() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 17);
   }

   public String getFieldName() {
      return "SecP521R1Field";
   }

   public int getFieldSize() {
      return Q.bitLength();
   }

   public ECFieldElement add(ECFieldElement var1) {
      int[] var2 = Nat.create(17);
      SecP521R1Field.add(this.x, ((SecP521R1FieldElement)var1).x, var2);
      return new SecP521R1FieldElement(var2);
   }

   public ECFieldElement addOne() {
      int[] var1 = Nat.create(17);
      SecP521R1Field.addOne(this.x, var1);
      return new SecP521R1FieldElement(var1);
   }

   public ECFieldElement subtract(ECFieldElement var1) {
      int[] var2 = Nat.create(17);
      SecP521R1Field.subtract(this.x, ((SecP521R1FieldElement)var1).x, var2);
      return new SecP521R1FieldElement(var2);
   }

   public ECFieldElement multiply(ECFieldElement var1) {
      int[] var2 = Nat.create(17);
      SecP521R1Field.multiply(this.x, ((SecP521R1FieldElement)var1).x, var2);
      return new SecP521R1FieldElement(var2);
   }

   public ECFieldElement divide(ECFieldElement var1) {
      int[] var2 = Nat.create(17);
      Mod.invert(SecP521R1Field.P, ((SecP521R1FieldElement)var1).x, var2);
      SecP521R1Field.multiply(var2, this.x, var2);
      return new SecP521R1FieldElement(var2);
   }

   public ECFieldElement negate() {
      int[] var1 = Nat.create(17);
      SecP521R1Field.negate(this.x, var1);
      return new SecP521R1FieldElement(var1);
   }

   public boolean gn(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecP521R1FieldElement)) {
         return false;
      } else {
         SecP521R1FieldElement var2 = (SecP521R1FieldElement)var1;
         return Nat.eq(17, this.x, var2.x);
      }
   }

   public int amd() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 17);
   }

   public ECFieldElement sqrt() {
      int[] var1 = this.x;
      if (!Nat.isZero(17, var1) && !Nat.isOne(17, var1)) {
         int[] var2 = Nat.create(17);
         int[] var3 = Nat.create(17);
         SecP521R1Field.squareN(var1, 519, var2);
         SecP521R1Field.square(var2, var3);
         return Nat.eq(17, var1, var3) ? new SecP521R1FieldElement(var2) : null;
      } else {
         return this;
      }
   }

   static {
      Q = SecP521R1Curve.q;
   }

   public SecP521R1FieldElement(BigInteger var1) {
      if (var1 != null && var1.signum() >= 0 && var1.compareTo(Q) < 0) {
         this.x = SecP521R1Field.fromBigInteger(var1);
      } else {
         throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
      }
   }

   public SecP521R1FieldElement(int[] var1) {
      this.x = var1;
   }

   public ECFieldElement invert() {
      int[] var1 = Nat.create(17);
      Mod.invert(SecP521R1Field.P, this.x, var1);
      return new SecP521R1FieldElement(var1);
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SecP521R1FieldElement)) {
         return false;
      } else {
         SecP521R1FieldElement var2 = (SecP521R1FieldElement)var1;
         return Nat.eq(17, this.x, var2.x);
      }
   }

   public int amy() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 17);
   }

   public ECFieldElement square() {
      int[] var1 = Nat.create(17);
      SecP521R1Field.square(this.x, var1);
      return new SecP521R1FieldElement(var1);
   }
}
