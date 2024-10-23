package org.bouncycastle.math.ec;

import java.math.BigInteger;

public class ECCurve$Fp extends ECCurve$AbstractFp {
   BigInteger r;
   BigInteger q;
   static final int FP_DEFAULT_COORDS = 4;
   ECPoint$Fp infinity;

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, boolean var3) {
      return new ECPoint$Fp(this, var1, var2, var3);
   }

   public ECCurve$Fp(BigInteger var1, BigInteger var2, BigInteger var3, BigInteger var4, BigInteger var5) {
      super(var1);
      this.q = var1;
      this.r = ECFieldElement$Fp.calculateResidue(var1);
      this.infinity = new ECPoint$Fp(this, (ECFieldElement)null, (ECFieldElement)null);
      this.a = this.fromBigInteger(var2);
      this.b = this.fromBigInteger(var3);
      this.order = var4;
      this.cofactor = var5;
      this.coord = 4;
   }

   public ECCurve$Fp(BigInteger var1, BigInteger var2, ECFieldElement var3, ECFieldElement var4) {
      this(var1, var2, var3, var4, (BigInteger)null, (BigInteger)null);
   }

   public ECFieldElement fromBigInteger(BigInteger var1) {
      return new ECFieldElement$Fp(this.q, this.r, var1);
   }

   public ECCurve cloneCurve() {
      return new ECCurve$Fp(this.q, this.r, this.a, this.b, this.order, this.cofactor);
   }

   public boolean supportsCoordinateSystem(int var1) {
      switch(var1) {
      case 0:
      case 1:
      case 2:
      case 4:
         return true;
      case 3:
      default:
         return false;
      }
   }

   public BigInteger getQ() {
      return this.q;
   }

   public ECPoint importPoint(ECPoint var1) {
      if (this != var1.getCurve() && this.getCoordinateSystem() == 2 && !var1.isInfinity()) {
         switch(var1.getCurve().getCoordinateSystem()) {
         case 2:
         case 3:
         case 4:
            return new ECPoint$Fp(this, this.fromBigInteger(var1.x.toBigInteger()), this.fromBigInteger(var1.y.toBigInteger()), new ECFieldElement[]{this.fromBigInteger(var1.zs[0].toBigInteger())}, var1.withCompression);
         }
      }

      return super.importPoint(var1);
   }

   public int getFieldSize() {
      return this.q.bitLength();
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, ECFieldElement[] var3, boolean var4) {
      return new ECPoint$Fp(this, var1, var2, var3, var4);
   }

   public ECCurve$Fp(BigInteger var1, BigInteger var2, ECFieldElement var3, ECFieldElement var4, BigInteger var5, BigInteger var6) {
      super(var1);
      this.q = var1;
      this.r = var2;
      this.infinity = new ECPoint$Fp(this, (ECFieldElement)null, (ECFieldElement)null);
      this.a = var3;
      this.b = var4;
      this.order = var5;
      this.cofactor = var6;
      this.coord = 4;
   }

   public ECCurve$Fp(BigInteger var1, BigInteger var2, BigInteger var3) {
      this(var1, var2, var3, (BigInteger)null, (BigInteger)null);
   }

   public ECPoint getInfinity() {
      return this.infinity;
   }
}
