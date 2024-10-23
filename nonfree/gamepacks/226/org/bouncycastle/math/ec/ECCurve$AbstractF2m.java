package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.FiniteFields;

public abstract class ECCurve$AbstractF2m extends ECCurve {
   BigInteger[] si = null;

   ECFieldElement solveQuadraticEquation(ECFieldElement var1) {
      if (var1.isZero()) {
         return var1;
      } else {
         ECFieldElement var4 = this.fromBigInteger(ECConstants.ZERO);
         int var5 = this.getFieldSize();
         Random var6 = new Random();

         ECFieldElement var2;
         ECFieldElement var3;
         do {
            ECFieldElement var7 = this.fromBigInteger(new BigInteger(var5, var6));
            var3 = var4;
            ECFieldElement var8 = var1;

            for(int var9 = 1; var9 < var5; ++var9) {
               ECFieldElement var10 = var8.square();
               var3 = var3.square().add(var10.multiply(var7));
               var8 = var10.add(var1);
            }

            if (!var8.isZero()) {
               return null;
            }

            var2 = var3.square().add(var3);
         } while(var2.isZero());

         return var3;
      }
   }

   static FiniteField buildField(int var0, int var1, int var2, int var3) {
      if (var1 == 0) {
         throw new IllegalArgumentException("k1 must be > 0");
      } else if (var2 == 0) {
         if (var3 != 0) {
            throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
         } else {
            return FiniteFields.getBinaryExtensionField(new int[]{0, var1, var0});
         }
      } else if (var2 <= var1) {
         throw new IllegalArgumentException("k2 must be > k1");
      } else if (var3 <= var2) {
         throw new IllegalArgumentException("k3 must be > k2");
      } else {
         return FiniteFields.getBinaryExtensionField(new int[]{0, var1, var2, var3, var0});
      }
   }

   public ECCurve$AbstractF2m(int var1, int var2, int var3, int var4) {
      super(buildField(var1, var2, var3, var4));
   }

   public ECPoint createPoint(BigInteger var1, BigInteger var2, boolean var3) {
      ECFieldElement var4 = this.fromBigInteger(var1);
      ECFieldElement var5 = this.fromBigInteger(var2);
      int var6 = this.getCoordinateSystem();
      switch(var6) {
      case 5:
      case 6:
         if (var4.isZero()) {
            if (!var5.square().equals(this.getB())) {
               throw new IllegalArgumentException();
            }
         } else {
            var5 = var5.divide(var4).add(var4);
         }
      default:
         return this.createRawPoint(var4, var5, var3);
      }
   }

   public static BigInteger inverse(int var0, int[] var1, BigInteger var2) {
      return (new LongArray(var2)).modInverse(var0, var1).toBigInteger();
   }

   public ECPoint decompressPoint(int var1, BigInteger var2) {
      ECFieldElement var3 = this.fromBigInteger(var2);
      ECFieldElement var4 = null;
      if (var3.isZero()) {
         var4 = this.getB().sqrt();
      } else {
         ECFieldElement var5 = var3.square().invert().multiply(this.getB()).add(this.getA()).add(var3);
         ECFieldElement var6 = this.solveQuadraticEquation(var5);
         if (var6 != null) {
            if (var6.testBitZero() != (var1 == 1)) {
               var6 = var6.addOne();
            }

            switch(this.getCoordinateSystem()) {
            case 5:
            case 6:
               var4 = var6.add(var3);
               break;
            default:
               var4 = var6.multiply(var3);
            }
         }
      }

      if (var4 == null) {
         throw new IllegalArgumentException("Invalid point compression");
      } else {
         return this.createRawPoint(var3, var4, true);
      }
   }

   public boolean isValidFieldElement(BigInteger var1) {
      return var1 != null && var1.signum() >= 0 && var1.bitLength() <= this.getFieldSize();
   }

   synchronized BigInteger[] getSi() {
      if (this.si == null) {
         this.si = Tnaf.getSi(this);
      }

      return this.si;
   }

   public boolean isKoblitz() {
      return this.order != null && this.cofactor != null && this.b.isOne() && (this.a.isZero() || this.a.isOne());
   }
}
