package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$AbstractFp;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecP224R1Curve extends ECCurve$AbstractFp {
   static final int SecP224R1_DEFAULT_COORDS = 2;
   public static final BigInteger q = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));
   public SecP224R1Point infinity = new SecP224R1Point(this, (ECFieldElement)null, (ECFieldElement)null);

   public ECPoint getInfinity() {
      return this.infinity;
   }

   public ECCurve cloneCurve() {
      return new SecP224R1Curve();
   }

   public SecP224R1Curve() {
      super(q);
      this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
      this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
      this.order = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
      this.cofactor = BigInteger.valueOf(1L);
      this.coord = 2;
   }

   public ECFieldElement fromBigInteger(BigInteger var1) {
      return new SecP224R1FieldElement(var1);
   }

   public boolean supportsCoordinateSystem(int var1) {
      switch(var1) {
      case 2:
         return true;
      default:
         return false;
      }
   }

   public int getFieldSize() {
      return q.bitLength();
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, boolean var3) {
      return new SecP224R1Point(this, var1, var2, var3);
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, ECFieldElement[] var3, boolean var4) {
      return new SecP224R1Point(this, var1, var2, var3, var4);
   }

   public BigInteger getQ() {
      return q;
   }
}
