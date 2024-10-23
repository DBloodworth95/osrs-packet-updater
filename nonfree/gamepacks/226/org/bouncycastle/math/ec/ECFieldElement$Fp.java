package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;

public class ECFieldElement$Fp extends ECFieldElement {
   BigInteger q;
   BigInteger r;
   BigInteger x;

   public ECFieldElement multiply(ECFieldElement var1) {
      return new ECFieldElement$Fp(this.q, this.r, this.modMult(this.x, var1.toBigInteger()));
   }

   /** @deprecated */
   public ECFieldElement$Fp(BigInteger var1, BigInteger var2) {
      this(var1, calculateResidue(var1), var2);
   }

   ECFieldElement$Fp(BigInteger var1, BigInteger var2, BigInteger var3) {
      if (var3 != null && var3.signum() >= 0 && var3.compareTo(var1) < 0) {
         this.q = var1;
         this.r = var2;
         this.x = var3;
      } else {
         throw new IllegalArgumentException("x value invalid in Fp field element");
      }
   }

   public BigInteger toBigInteger() {
      return this.x;
   }

   public BigInteger modDouble(BigInteger var1) {
      BigInteger var2 = var1.shiftLeft(1);
      if (var2.compareTo(this.q) >= 0) {
         var2 = var2.subtract(this.q);
      }

      return var2;
   }

   public int getFieldSize() {
      return this.q.bitLength();
   }

   public BigInteger getQ() {
      return this.q;
   }

   public ECFieldElement add(ECFieldElement var1) {
      return new ECFieldElement$Fp(this.q, this.r, this.modAdd(this.x, var1.toBigInteger()));
   }

   public ECFieldElement square() {
      return new ECFieldElement$Fp(this.q, this.r, this.modMult(this.x, this.x));
   }

   public int ams() {
      return this.q.hashCode() ^ this.x.hashCode();
   }

   public ECFieldElement sqrt() {
      if (!this.isZero() && !this.isOne()) {
         if (!this.q.testBit(0)) {
            throw new RuntimeException("not done yet");
         } else {
            BigInteger var1;
            if (this.q.testBit(1)) {
               var1 = this.q.shiftRight(2).add(ECConstants.ONE);
               return this.checkSqrt(new ECFieldElement$Fp(this.q, this.r, this.x.modPow(var1, this.q)));
            } else {
               BigInteger var2;
               BigInteger var3;
               BigInteger var4;
               BigInteger var5;
               if (this.q.testBit(2)) {
                  var1 = this.x.modPow(this.q.shiftRight(3), this.q);
                  var2 = this.modMult(var1, this.x);
                  var3 = this.modMult(var2, var1);
                  if (var3.equals(ECConstants.ONE)) {
                     return this.checkSqrt(new ECFieldElement$Fp(this.q, this.r, var2));
                  } else {
                     var4 = ECConstants.TWO.modPow(this.q.shiftRight(2), this.q);
                     var5 = this.modMult(var2, var4);
                     return this.checkSqrt(new ECFieldElement$Fp(this.q, this.r, var5));
                  }
               } else {
                  var1 = this.q.shiftRight(1);
                  if (!this.x.modPow(var1, this.q).equals(ECConstants.ONE)) {
                     return null;
                  } else {
                     var2 = this.x;
                     var3 = this.modDouble(this.modDouble(var2));
                     var4 = var1.add(ECConstants.ONE);
                     var5 = this.q.subtract(ECConstants.ONE);
                     Random var8 = new Random();

                     while(true) {
                        BigInteger var9;
                        do {
                           var9 = new BigInteger(this.q.bitLength(), var8);
                        } while(var9.compareTo(this.q) >= 0);

                        if (this.modReduce(var9.multiply(var9).subtract(var3)).modPow(var1, this.q).equals(var5)) {
                           BigInteger[] var10 = this.lucasSequence(var9, var2, var4);
                           BigInteger var6 = var10[0];
                           BigInteger var7 = var10[1];
                           if (this.modMult(var7, var7).equals(var3)) {
                              return new ECFieldElement$Fp(this.q, this.r, this.modHalfAbs(var7));
                           }

                           if (!var6.equals(ECConstants.ONE) && !var6.equals(var5)) {
                              return null;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         return this;
      }
   }

   public ECFieldElement multiplyMinusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      BigInteger var4 = this.x;
      BigInteger var5 = var1.toBigInteger();
      BigInteger var6 = var2.toBigInteger();
      BigInteger var7 = var3.toBigInteger();
      BigInteger var8 = var4.multiply(var5);
      BigInteger var9 = var6.multiply(var7);
      return new ECFieldElement$Fp(this.q, this.r, this.modReduce(var8.subtract(var9)));
   }

   public ECFieldElement multiplyPlusProduct(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3) {
      BigInteger var4 = this.x;
      BigInteger var5 = var1.toBigInteger();
      BigInteger var6 = var2.toBigInteger();
      BigInteger var7 = var3.toBigInteger();
      BigInteger var8 = var4.multiply(var5);
      BigInteger var9 = var6.multiply(var7);
      return new ECFieldElement$Fp(this.q, this.r, this.modReduce(var8.add(var9)));
   }

   public ECFieldElement divide(ECFieldElement var1) {
      return new ECFieldElement$Fp(this.q, this.r, this.modMult(this.x, this.modInverse(var1.toBigInteger())));
   }

   public ECFieldElement addOne() {
      BigInteger var1 = this.x.add(ECConstants.ONE);
      if (var1.compareTo(this.q) == 0) {
         var1 = ECConstants.ZERO;
      }

      return new ECFieldElement$Fp(this.q, this.r, var1);
   }

   public boolean gj(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ECFieldElement$Fp)) {
         return false;
      } else {
         ECFieldElement$Fp var2 = (ECFieldElement$Fp)var1;
         return this.q.equals(var2.q) && this.x.equals(var2.x);
      }
   }

   public ECFieldElement squareMinusProduct(ECFieldElement var1, ECFieldElement var2) {
      BigInteger var3 = this.x;
      BigInteger var4 = var1.toBigInteger();
      BigInteger var5 = var2.toBigInteger();
      BigInteger var6 = var3.multiply(var3);
      BigInteger var7 = var4.multiply(var5);
      return new ECFieldElement$Fp(this.q, this.r, this.modReduce(var6.subtract(var7)));
   }

   public int amg() {
      return this.q.hashCode() ^ this.x.hashCode();
   }

   public ECFieldElement negate() {
      return this.x.signum() == 0 ? this : new ECFieldElement$Fp(this.q, this.r, this.q.subtract(this.x));
   }

   public ECFieldElement subtract(ECFieldElement var1) {
      return new ECFieldElement$Fp(this.q, this.r, this.modSubtract(this.x, var1.toBigInteger()));
   }

   ECFieldElement checkSqrt(ECFieldElement var1) {
      return var1.square().equals(this) ? var1 : null;
   }

   BigInteger[] lucasSequence(BigInteger var1, BigInteger var2, BigInteger var3) {
      int var4 = var3.bitLength();
      int var5 = var3.getLowestSetBit();
      BigInteger var6 = ECConstants.ONE;
      BigInteger var7 = ECConstants.TWO;
      BigInteger var8 = var1;
      BigInteger var9 = ECConstants.ONE;
      BigInteger var10 = ECConstants.ONE;

      int var11;
      for(var11 = var4 - 1; var11 >= var5 + 1; --var11) {
         var9 = this.modMult(var9, var10);
         if (var3.testBit(var11)) {
            var10 = this.modMult(var9, var2);
            var6 = this.modMult(var6, var8);
            var7 = this.modReduce(var8.multiply(var7).subtract(var1.multiply(var9)));
            var8 = this.modReduce(var8.multiply(var8).subtract(var10.shiftLeft(1)));
         } else {
            var10 = var9;
            var6 = this.modReduce(var6.multiply(var7).subtract(var9));
            var8 = this.modReduce(var8.multiply(var7).subtract(var1.multiply(var9)));
            var7 = this.modReduce(var7.multiply(var7).subtract(var9.shiftLeft(1)));
         }
      }

      var9 = this.modMult(var9, var10);
      var10 = this.modMult(var9, var2);
      var6 = this.modReduce(var6.multiply(var7).subtract(var9));
      var7 = this.modReduce(var8.multiply(var7).subtract(var1.multiply(var9)));
      var9 = this.modMult(var9, var10);

      for(var11 = 1; var11 <= var5; ++var11) {
         var6 = this.modMult(var6, var7);
         var7 = this.modReduce(var7.multiply(var7).subtract(var9.shiftLeft(1)));
         var9 = this.modMult(var9, var9);
      }

      return new BigInteger[]{var6, var7};
   }

   public BigInteger modAdd(BigInteger var1, BigInteger var2) {
      BigInteger var3 = var1.add(var2);
      if (var3.compareTo(this.q) >= 0) {
         var3 = var3.subtract(this.q);
      }

      return var3;
   }

   public ECFieldElement invert() {
      return new ECFieldElement$Fp(this.q, this.r, this.modInverse(this.x));
   }

   public BigInteger modHalf(BigInteger var1) {
      if (var1.testBit(0)) {
         var1 = this.q.add(var1);
      }

      return var1.shiftRight(1);
   }

   public BigInteger modHalfAbs(BigInteger var1) {
      if (var1.testBit(0)) {
         var1 = this.q.subtract(var1);
      }

      return var1.shiftRight(1);
   }

   public BigInteger modInverse(BigInteger var1) {
      int var2 = this.getFieldSize();
      int var3 = var2 + 31 >> 5;
      int[] var4 = Nat.fromBigInteger(var2, this.q);
      int[] var5 = Nat.fromBigInteger(var2, var1);
      int[] var6 = Nat.create(var3);
      Mod.invert(var4, var5, var6);
      return Nat.toBigInteger(var3, var6);
   }

   static BigInteger calculateResidue(BigInteger var0) {
      int var1 = var0.bitLength();
      if (var1 >= 96) {
         BigInteger var2 = var0.shiftRight(var1 - 64);
         if (var2.longValue() == -1L) {
            return ONE.shiftLeft(var1).subtract(var0);
         }
      }

      return null;
   }

   public BigInteger modReduce(BigInteger var1) {
      if (this.r != null) {
         boolean var2 = var1.signum() < 0;
         if (var2) {
            var1 = var1.abs();
         }

         int var3 = this.q.bitLength();

         BigInteger var5;
         BigInteger var6;
         for(boolean var4 = this.r.equals(ECConstants.ONE); var1.bitLength() > var3 + 1; var1 = var5.add(var6)) {
            var5 = var1.shiftRight(var3);
            var6 = var1.subtract(var5.shiftLeft(var3));
            if (!var4) {
               var5 = var5.multiply(this.r);
            }
         }

         while(var1.compareTo(this.q) >= 0) {
            var1 = var1.subtract(this.q);
         }

         if (var2 && var1.signum() != 0) {
            var1 = this.q.subtract(var1);
         }
      } else {
         var1 = var1.mod(this.q);
      }

      return var1;
   }

   public BigInteger modSubtract(BigInteger var1, BigInteger var2) {
      BigInteger var3 = var1.subtract(var2);
      if (var3.signum() < 0) {
         var3 = var3.add(this.q);
      }

      return var3;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ECFieldElement$Fp)) {
         return false;
      } else {
         ECFieldElement$Fp var2 = (ECFieldElement$Fp)var1;
         return this.q.equals(var2.q) && this.x.equals(var2.x);
      }
   }

   public BigInteger modMult(BigInteger var1, BigInteger var2) {
      return this.modReduce(var1.multiply(var2));
   }

   public String getFieldName() {
      return "Fp";
   }

   public int hashCode() {
      return this.q.hashCode() ^ this.x.hashCode();
   }

   public int amf() {
      return this.q.hashCode() ^ this.x.hashCode();
   }

   public int amb() {
      return this.q.hashCode() ^ this.x.hashCode();
   }

   public ECFieldElement squarePlusProduct(ECFieldElement var1, ECFieldElement var2) {
      BigInteger var3 = this.x;
      BigInteger var4 = var1.toBigInteger();
      BigInteger var5 = var2.toBigInteger();
      BigInteger var6 = var3.multiply(var3);
      BigInteger var7 = var4.multiply(var5);
      return new ECFieldElement$Fp(this.q, this.r, this.modReduce(var6.add(var7)));
   }

   public int aml() {
      return this.q.hashCode() ^ this.x.hashCode();
   }
}
