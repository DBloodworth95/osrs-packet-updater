package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$AbstractFp;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecP192K1Curve extends ECCurve$AbstractFp {
   public static final BigInteger q = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));
   static final int SecP192K1_DEFAULT_COORDS = 2;
   public SecP192K1Point infinity = new SecP192K1Point(this, (ECFieldElement)null, (ECFieldElement)null);

   public ECPoint getInfinity() {
      return this.infinity;
   }

   public BigInteger getQ() {
      return q;
   }

   public boolean supportsCoordinateSystem(int var1) {
      switch(var1) {
      case 2:
         return true;
      default:
         return false;
      }
   }

   public ECFieldElement fromBigInteger(BigInteger var1) {
      return new SecP192K1FieldElement(var1);
   }

   public int getFieldSize() {
      return q.bitLength();
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, ECFieldElement[] var3, boolean var4) {
      return new SecP192K1Point(this, var1, var2, var3, var4);
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, boolean var3) {
      return new SecP192K1Point(this, var1, var2, var3);
   }

   public ECCurve cloneCurve() {
      return new SecP192K1Curve();
   }

   public SecP192K1Curve() {
      super(q);
      this.a = this.fromBigInteger(ECConstants.ZERO);
      this.b = this.fromBigInteger(BigInteger.valueOf(3L));
      this.order = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
      this.cofactor = BigInteger.valueOf(1L);
      this.coord = 2;
   }
}
