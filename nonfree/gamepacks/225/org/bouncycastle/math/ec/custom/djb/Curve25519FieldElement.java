package org.bouncycastle.math.ec.custom.djb;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

public class Curve25519FieldElement extends ECFieldElement {
   public int[] x;
   static final int[] PRECOMP_POW2;
   public static final BigInteger Q;

   public boolean gn(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Curve25519FieldElement)) {
         return false;
      } else {
         Curve25519FieldElement var2 = (Curve25519FieldElement)var1;
         return Nat256.eq(this.x, var2.x);
      }
   }

   static {
      Q = Curve25519.q;
      PRECOMP_POW2 = new int[]{1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
   }

   public Curve25519FieldElement(int[] var1) {
      this.x = var1;
   }

   public boolean isZero() {
      return Nat256.isZero(this.x);
   }

   public boolean testBitZero() {
      return Nat256.getBit(this.x, 0) == 1;
   }

   public ECFieldElement square() {
      int[] var1 = Nat256.create();
      Curve25519Field.square(this.x, var1);
      return new Curve25519FieldElement(var1);
   }

   public BigInteger toBigInteger() {
      return Nat256.toBigInteger(this.x);
   }

   public String getFieldName() {
      return "Curve25519Field";
   }

   public int getFieldSize() {
      return Q.bitLength();
   }

   public Curve25519FieldElement(BigInteger var1) {
      if (var1 != null && var1.signum() >= 0 && var1.compareTo(Q) < 0) {
         this.x = Curve25519Field.fromBigInteger(var1);
      } else {
         throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
      }
   }

   public ECFieldElement addOne() {
      int[] var1 = Nat256.create();
      Curve25519Field.addOne(this.x, var1);
      return new Curve25519FieldElement(var1);
   }

   public ECFieldElement subtract(ECFieldElement var1) {
      int[] var2 = Nat256.create();
      Curve25519Field.subtract(this.x, ((Curve25519FieldElement)var1).x, var2);
      return new Curve25519FieldElement(var2);
   }

   public ECFieldElement multiply(ECFieldElement var1) {
      int[] var2 = Nat256.create();
      Curve25519Field.multiply(this.x, ((Curve25519FieldElement)var1).x, var2);
      return new Curve25519FieldElement(var2);
   }

   public ECFieldElement divide(ECFieldElement var1) {
      int[] var2 = Nat256.create();
      Mod.invert(Curve25519Field.P, ((Curve25519FieldElement)var1).x, var2);
      Curve25519Field.multiply(var2, this.x, var2);
      return new Curve25519FieldElement(var2);
   }

   public ECFieldElement negate() {
      int[] var1 = Nat256.create();
      Curve25519Field.negate(this.x, var1);
      return new Curve25519FieldElement(var1);
   }

   public int amd() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 8);
   }

   public int hashCode() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 8);
   }

   public ECFieldElement sqrt() {
      int[] var1 = this.x;
      if (!Nat256.isZero(var1) && !Nat256.isOne(var1)) {
         int[] var2 = Nat256.create();
         Curve25519Field.square(var1, var2);
         Curve25519Field.multiply(var2, var1, var2);
         Curve25519Field.square(var2, var2);
         Curve25519Field.multiply(var2, var1, var2);
         int[] var4 = Nat256.create();
         Curve25519Field.square(var2, var4);
         Curve25519Field.multiply(var4, var1, var4);
         int[] var5 = Nat256.create();
         Curve25519Field.squareN(var4, 3, var5);
         Curve25519Field.multiply(var5, var2, var5);
         Curve25519Field.squareN(var5, 4, var2);
         Curve25519Field.multiply(var2, var4, var2);
         Curve25519Field.squareN(var2, 4, var5);
         Curve25519Field.multiply(var5, var4, var5);
         Curve25519Field.squareN(var5, 15, var4);
         Curve25519Field.multiply(var4, var5, var4);
         Curve25519Field.squareN(var4, 30, var5);
         Curve25519Field.multiply(var5, var4, var5);
         Curve25519Field.squareN(var5, 60, var4);
         Curve25519Field.multiply(var4, var5, var4);
         Curve25519Field.squareN(var4, 11, var5);
         Curve25519Field.multiply(var5, var2, var5);
         Curve25519Field.squareN(var5, 120, var2);
         Curve25519Field.multiply(var2, var4, var2);
         Curve25519Field.square(var2, var2);
         Curve25519Field.square(var2, var4);
         if (Nat256.eq(var1, var4)) {
            return new Curve25519FieldElement(var2);
         } else {
            Curve25519Field.multiply(var2, PRECOMP_POW2, var2);
            Curve25519Field.square(var2, var4);
            return Nat256.eq(var1, var4) ? new Curve25519FieldElement(var2) : null;
         }
      } else {
         return this;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Curve25519FieldElement)) {
         return false;
      } else {
         Curve25519FieldElement var2 = (Curve25519FieldElement)var1;
         return Nat256.eq(this.x, var2.x);
      }
   }

   public ECFieldElement add(ECFieldElement var1) {
      int[] var2 = Nat256.create();
      Curve25519Field.add(this.x, ((Curve25519FieldElement)var1).x, var2);
      return new Curve25519FieldElement(var2);
   }

   public ECFieldElement invert() {
      int[] var1 = Nat256.create();
      Mod.invert(Curve25519Field.P, this.x, var1);
      return new Curve25519FieldElement(var1);
   }

   public boolean isOne() {
      return Nat256.isOne(this.x);
   }

   public boolean gg(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Curve25519FieldElement)) {
         return false;
      } else {
         Curve25519FieldElement var2 = (Curve25519FieldElement)var1;
         return Nat256.eq(this.x, var2.x);
      }
   }

   public Curve25519FieldElement() {
      this.x = Nat256.create();
   }

   public int amy() {
      return Q.hashCode() ^ Arrays.hashCode((int[])this.x, 0, 8);
   }
}
