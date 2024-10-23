package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$AbstractFp;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecP256K1Curve extends ECCurve$AbstractFp {
   static final int SECP256K1_DEFAULT_COORDS = 2;
   public SecP256K1Point infinity = new SecP256K1Point(this, (ECFieldElement)null, (ECFieldElement)null);
   public static final BigInteger q = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

   public boolean supportsCoordinateSystem(int var1) {
      switch(var1) {
      case 2:
         return true;
      default:
         return false;
      }
   }

   public ECCurve cloneCurve() {
      return new SecP256K1Curve();
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, boolean var3) {
      return new SecP256K1Point(this, var1, var2, var3);
   }

   public ECFieldElement fromBigInteger(BigInteger var1) {
      return new SecP256K1FieldElement(var1);
   }

   public int getFieldSize() {
      return q.bitLength();
   }

   public BigInteger getQ() {
      return q;
   }

   public SecP256K1Curve() {
      super(q);
      this.a = this.fromBigInteger(ECConstants.ZERO);
      this.b = this.fromBigInteger(BigInteger.valueOf(7L));
      this.order = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
      this.cofactor = BigInteger.valueOf(1L);
      this.coord = 2;
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, ECFieldElement[] var3, boolean var4) {
      return new SecP256K1Point(this, var1, var2, var3, var4);
   }

   public ECPoint getInfinity() {
      return this.infinity;
   }
}
