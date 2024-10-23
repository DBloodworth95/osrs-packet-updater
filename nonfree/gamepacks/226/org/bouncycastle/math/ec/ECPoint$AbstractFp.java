package org.bouncycastle.math.ec;

public abstract class ECPoint$AbstractFp extends ECPoint {
   public boolean getCompressionYTilde() {
      return this.getAffineYCoord().testBitZero();
   }

   public ECPoint$AbstractFp(ECCurve var1, ECFieldElement var2, ECFieldElement var3) {
      super(var1, var2, var3);
   }

   public boolean satisfiesCurveEquation() {
      ECFieldElement var1 = this.x;
      ECFieldElement var2 = this.y;
      ECFieldElement var3 = this.curve.getA();
      ECFieldElement var4 = this.curve.getB();
      ECFieldElement var5 = var2.square();
      ECFieldElement var6;
      ECFieldElement var7;
      ECFieldElement var8;
      switch(this.getCurveCoordinateSystem()) {
      case 0:
         break;
      case 1:
         var6 = this.zs[0];
         if (!var6.isOne()) {
            var7 = var6.square();
            var8 = var6.multiply(var7);
            var5 = var5.multiply(var6);
            var3 = var3.multiply(var7);
            var4 = var4.multiply(var8);
         }
         break;
      case 2:
      case 3:
      case 4:
         var6 = this.zs[0];
         if (!var6.isOne()) {
            var7 = var6.square();
            var8 = var7.square();
            ECFieldElement var9 = var7.multiply(var8);
            var3 = var3.multiply(var8);
            var4 = var4.multiply(var9);
         }
         break;
      default:
         throw new IllegalStateException("unsupported coordinate system");
      }

      var6 = var1.square().add(var3).multiply(var1).add(var4);
      return var5.equals(var6);
   }

   public ECPoint$AbstractFp(ECCurve var1, ECFieldElement var2, ECFieldElement var3, ECFieldElement[] var4) {
      super(var1, var2, var3, var4);
   }

   public ECPoint subtract(ECPoint var1) {
      return (ECPoint)(var1.isInfinity() ? this : this.add(var1.negate()));
   }
}
