package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$AbstractFp;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecP128R1Curve extends ECCurve$AbstractFp {
   public SecP128R1Point infinity = new SecP128R1Point(this, (ECFieldElement)null, (ECFieldElement)null);
   public static final BigInteger q = new BigInteger(1, Hex.decode("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
   static final int SecP128R1_DEFAULT_COORDS = 2;

   public ECFieldElement fromBigInteger(BigInteger var1) {
      return new SecP128R1FieldElement(var1);
   }

   public ECCurve cloneCurve() {
      return new SecP128R1Curve();
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, boolean var3) {
      return new SecP128R1Point(this, var1, var2, var3);
   }

   public BigInteger getQ() {
      return q;
   }

   public int getFieldSize() {
      return q.bitLength();
   }

   public boolean supportsCoordinateSystem(int var1) {
      switch(var1) {
      case 2:
         return true;
      default:
         return false;
      }
   }

   public SecP128R1Curve() {
      super(q);
      this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
      this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("E87579C11079F43DD824993C2CEE5ED3")));
      this.order = new BigInteger(1, Hex.decode("FFFFFFFE0000000075A30D1B9038A115"));
      this.cofactor = BigInteger.valueOf(1L);
      this.coord = 2;
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, ECFieldElement[] var3, boolean var4) {
      return new SecP128R1Point(this, var1, var2, var3, var4);
   }

   public ECPoint getInfinity() {
      return this.infinity;
   }
}
