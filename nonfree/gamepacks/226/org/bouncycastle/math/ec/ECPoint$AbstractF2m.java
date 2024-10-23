package org.bouncycastle.math.ec;

public abstract class ECPoint$AbstractF2m extends ECPoint {
   public ECPoint$AbstractF2m(ECCurve var1, ECFieldElement var2, ECFieldElement var3) {
      super(var1, var2, var3);
   }

   public ECPoint$AbstractF2m(ECCurve var1, ECFieldElement var2, ECFieldElement var3, ECFieldElement[] var4) {
      super(var1, var2, var3, var4);
   }

   public ECPoint$AbstractF2m tauPow(int var1) {
      if (this.isInfinity()) {
         return this;
      } else {
         ECCurve var2 = this.getCurve();
         int var3 = var2.getCoordinateSystem();
         ECFieldElement var4 = this.x;
         ECFieldElement var5;
         switch(var3) {
         case 0:
         case 5:
            var5 = this.y;
            return (ECPoint$AbstractF2m)var2.createRawPoint(var4.squarePow(var1), var5.squarePow(var1), this.withCompression);
         case 1:
         case 6:
            var5 = this.y;
            ECFieldElement var6 = this.zs[0];
            return (ECPoint$AbstractF2m)var2.createRawPoint(var4.squarePow(var1), var5.squarePow(var1), new ECFieldElement[]{var6.squarePow(var1)}, this.withCompression);
         case 2:
         case 3:
         case 4:
         default:
            throw new IllegalStateException("unsupported coordinate system");
         }
      }
   }

   public ECPoint scaleX(ECFieldElement var1) {
      if (this.isInfinity()) {
         return this;
      } else {
         int var2 = this.getCurveCoordinateSystem();
         ECFieldElement var3;
         ECFieldElement var4;
         ECFieldElement var5;
         ECFieldElement var6;
         switch(var2) {
         case 5:
            var3 = this.getRawXCoord();
            var4 = this.getRawYCoord();
            var5 = var3.multiply(var1);
            var6 = var4.add(var3).divide(var1).add(var5);
            return this.getCurve().createRawPoint(var3, var6, this.getRawZCoords(), this.withCompression);
         case 6:
            var3 = this.getRawXCoord();
            var4 = this.getRawYCoord();
            var5 = this.getRawZCoords()[0];
            var6 = var3.multiply(var1.square());
            ECFieldElement var7 = var4.add(var3).add(var6);
            ECFieldElement var8 = var5.multiply(var1);
            return this.getCurve().createRawPoint(var6, var7, new ECFieldElement[]{var8}, this.withCompression);
         default:
            return super.scaleX(var1);
         }
      }
   }

   public ECPoint scaleY(ECFieldElement var1) {
      if (this.isInfinity()) {
         return this;
      } else {
         int var2 = this.getCurveCoordinateSystem();
         switch(var2) {
         case 5:
         case 6:
            ECFieldElement var3 = this.getRawXCoord();
            ECFieldElement var4 = this.getRawYCoord();
            ECFieldElement var5 = var4.add(var3).multiply(var1).add(var3);
            return this.getCurve().createRawPoint(var3, var5, this.getRawZCoords(), this.withCompression);
         default:
            return super.scaleY(var1);
         }
      }
   }

   public ECPoint subtract(ECPoint var1) {
      return (ECPoint)(var1.isInfinity() ? this : this.add(var1.negate()));
   }

   public ECPoint$AbstractF2m tau() {
      if (this.isInfinity()) {
         return this;
      } else {
         ECCurve var1 = this.getCurve();
         int var2 = var1.getCoordinateSystem();
         ECFieldElement var3 = this.x;
         ECFieldElement var4;
         switch(var2) {
         case 0:
         case 5:
            var4 = this.y;
            return (ECPoint$AbstractF2m)var1.createRawPoint(var3.square(), var4.square(), this.withCompression);
         case 1:
         case 6:
            var4 = this.y;
            ECFieldElement var5 = this.zs[0];
            return (ECPoint$AbstractF2m)var1.createRawPoint(var3.square(), var4.square(), new ECFieldElement[]{var5.square()}, this.withCompression);
         case 2:
         case 3:
         case 4:
         default:
            throw new IllegalStateException("unsupported coordinate system");
         }
      }
   }

   public boolean satisfiesCurveEquation() {
      ECCurve var1 = this.getCurve();
      ECFieldElement var2 = this.x;
      ECFieldElement var3 = var1.getA();
      ECFieldElement var4 = var1.getB();
      int var5 = var1.getCoordinateSystem();
      ECFieldElement var6;
      ECFieldElement var8;
      ECFieldElement var9;
      ECFieldElement var10;
      if (var5 == 6) {
         var6 = this.zs[0];
         boolean var14 = var6.isOne();
         if (var2.isZero()) {
            var8 = this.y;
            var9 = var8.square();
            var10 = var4;
            if (!var14) {
               var10 = var4.multiply(var6.square());
            }

            return var9.equals(var10);
         } else {
            var8 = this.y;
            var9 = var2.square();
            ECFieldElement var11;
            if (var14) {
               var10 = var8.square().add(var8).add(var3);
               var11 = var9.square().add(var4);
            } else {
               ECFieldElement var12 = var6.square();
               ECFieldElement var13 = var12.square();
               var10 = var8.add(var6).multiplyPlusProduct(var8, var3, var12);
               var11 = var9.squarePlusProduct(var4, var13);
            }

            var10 = var10.multiply(var9);
            return var10.equals(var11);
         }
      } else {
         var6 = this.y;
         ECFieldElement var7 = var6.add(var2).multiply(var6);
         switch(var5) {
         case 1:
            var8 = this.zs[0];
            if (!var8.isOne()) {
               var9 = var8.square();
               var10 = var8.multiply(var9);
               var7 = var7.multiply(var8);
               var3 = var3.multiply(var8);
               var4 = var4.multiply(var10);
            }
         case 0:
            var8 = var2.add(var3).multiply(var2.square()).add(var4);
            return var7.equals(var8);
         default:
            throw new IllegalStateException("unsupported coordinate system");
         }
      }
   }
}
