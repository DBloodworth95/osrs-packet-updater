package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

public class ECFieldElement$F2m extends ECFieldElement {
   public static final int TPB = 2;
   public static final int GNB = 1;
   public static final int PPB = 3;
   int[] ks;
   int m;
   int representation;
   LongArray x;

   public boolean gn(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ECFieldElement$F2m)) {
         return false;
      } else {
         ECFieldElement$F2m var2 = (ECFieldElement$F2m)var1;
         return this.m == var2.m && this.representation == var2.representation && Arrays.areEqual(this.ks, var2.ks) && this.x.equals(var2.x);
      }
   }

   /** @deprecated */
   public ECFieldElement$F2m(int var1, int var2, BigInteger var3) {
      this(var1, var2, 0, 0, var3);
   }

   public int amy() {
      return this.x.hashCode() ^ this.m ^ Arrays.hashCode(this.ks);
   }

   public int getM() {
      return this.m;
   }

   public ECFieldElement squarePlusProduct(ECFieldElement var1, ECFieldElement var2) {
      LongArray var3 = this.x;
      LongArray var4 = ((ECFieldElement$F2m)var1).x;
      LongArray var5 = ((ECFieldElement$F2m)var2).x;
      LongArray var6 = var3.square(this.m, this.ks);
      LongArray var7 = var4.multiply(var5, this.m, this.ks);
      if (var6 == var3) {
         var6 = (LongArray)var6.clone();
      }

      var6.addShiftedByWords(var7, 0);
      var6.reduce(this.m, this.ks);
      return new ECFieldElement$F2m(this.m, this.ks, var6);
   }

   public boolean isZero() {
      return this.x.isZero();
   }

   public ECFieldElement squareMinusProduct(ECFieldElement var1, ECFieldElement var2) {
      return this.squarePlusProduct(var1, var2);
   }

   public BigInteger toBigInteger() {
      return this.x.toBigInteger();
   }

   public String getFieldName() {
      return "F2m";
   }

   public int getFieldSize() {
      return this.m;
   }

   public static void checkFieldElements(ECFieldElement var0, ECFieldElement var1) {
      if (var0 instanceof ECFieldElement$F2m && var1 instanceof ECFieldElement$F2m) {
         ECFieldElement$F2m var2 = (ECFieldElement$F2m)var0;
         ECFieldElement$F2m var3 = (ECFieldElement$F2m)var1;
         if (var2.representation != var3.representation) {
            throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
         } else if (var2.m != var3.m || !Arrays.areEqual(var2.ks, var3.ks)) {
            throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
         }
      } else {
         throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
      }
   }

   public ECFieldElement add(ECFieldElement var1) {
      LongArray var2 = (LongArray)this.x.clone();
      ECFieldElement$F2m var3 = (ECFieldElement$F2m)var1;
      var2.addShiftedByWords(var3.x, 0);
      return new ECFieldElement$F2m(this.m, this.ks, var2);
   }

   public ECFieldElement addOne() {
      return new ECFieldElement$F2m(this.m, this.ks, this.x.addOne());
   }

   public ECFieldElement subtract(ECFieldElement var1) {
      return this.add(var1);
   }

   public ECFieldElement multiply(ECFieldElement var1) {
      return new ECFieldElement$F2m(this.m, this.ks, this.x.modMultiply(((ECFieldElement$F2m)var1).x, this.m, this.ks));
   }

   public ECFieldElement negate() {
      return this;
   }

   public boolean testBitZero() {
      return this.x.testBitZero();
   }

   public ECFieldElement invert() {
      return new ECFieldElement$F2m(this.m, this.ks, this.x.modInverse(this.m, this.ks));
   }

   /** @deprecated */
   public ECFieldElement$F2m(int var1, int var2, int var3, int var4, BigInteger var5) {
      if (var5 != null && var5.signum() >= 0 && var5.bitLength() <= var1) {
         if (var3 == 0 && var4 == 0) {
            this.representation = 2;
            this.ks = new int[]{var2};
         } else {
            if (var3 >= var4) {
               throw new IllegalArgumentException("k2 must be smaller than k3");
            }

            if (var3 <= 0) {
               throw new IllegalArgumentException("k2 must be larger than 0");
            }

            this.representation = 3;
            this.ks = new int[]{var2, var3, var4};
         }

         this.m = var1;
         this.x = new LongArray(var5);
      } else {
         throw new IllegalArgumentException("x value invalid in F2m field element");
      }
   }

   public ECFieldElement square() {
      return new ECFieldElement$F2m(this.m, this.ks, this.x.modSquare(this.m, this.ks));
   }

   public ECFieldElement divide(ECFieldElement var1) {
      ECFieldElement var2 = var1.invert();
      return this.multiply(var2);
   }

   ECFieldElement$F2m(int var1, int[] var2, LongArray var3) {
      this.m = var1;
      this.representation = var2.length == 1 ? 2 : 3;
      this.ks = var2;
      this.x = var3;
   }

   public ECFieldElement squarePow(int var1) {
      return var1 < 1 ? this : new ECFieldElement$F2m(this.m, this.ks, this.x.modSquareN(var1, this.m, this.ks));
   }

   public boolean isOne() {
      return this.x.isOne();
   }

   public ECFieldElement sqrt() {
      return (ECFieldElement)(!this.x.isZero() && !this.x.isOne() ? this.squarePow(this.m - 1) : this);
   }

   public int getRepresentation() {
      return this.representation;
   }

   public ECFieldElement multiplyPlusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      LongArray var4 = this.x;
      LongArray var5 = ((ECFieldElement$F2m)var1).x;
      LongArray var6 = ((ECFieldElement$F2m)var2).x;
      LongArray var7 = ((ECFieldElement$F2m)var3).x;
      LongArray var8 = var4.multiply(var5, this.m, this.ks);
      LongArray var9 = var6.multiply(var7, this.m, this.ks);
      if (var8 == var4 || var8 == var5) {
         var8 = (LongArray)var8.clone();
      }

      var8.addShiftedByWords(var9, 0);
      var8.reduce(this.m, this.ks);
      return new ECFieldElement$F2m(this.m, this.ks, var8);
   }

   public int getK1() {
      return this.ks[0];
   }

   public int getK2() {
      return this.ks.length >= 2 ? this.ks[1] : 0;
   }

   public ECFieldElement multiplyMinusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      return this.multiplyPlusProduct(var1, var2, var3);
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ECFieldElement$F2m)) {
         return false;
      } else {
         ECFieldElement$F2m var2 = (ECFieldElement$F2m)var1;
         return this.m == var2.m && this.representation == var2.representation && Arrays.areEqual(this.ks, var2.ks) && this.x.equals(var2.x);
      }
   }

   public int hashCode() {
      return this.x.hashCode() ^ this.m ^ Arrays.hashCode(this.ks);
   }

   public int bitLength() {
      return this.x.degree();
   }

   public boolean gg(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ECFieldElement$F2m)) {
         return false;
      } else {
         ECFieldElement$F2m var2 = (ECFieldElement$F2m)var1;
         return this.m == var2.m && this.representation == var2.representation && Arrays.areEqual(this.ks, var2.ks) && this.x.equals(var2.x);
      }
   }

   public int getK3() {
      return this.ks.length >= 3 ? this.ks[2] : 0;
   }

   public int amd() {
      return this.x.hashCode() ^ this.m ^ Arrays.hashCode(this.ks);
   }
}
