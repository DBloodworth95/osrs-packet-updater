package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$AbstractF2m;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecT163R2Curve extends ECCurve$AbstractF2m {
   static final int SecT163R2_DEFAULT_COORDS = 6;
   public SecT163R2Point infinity = new SecT163R2Point(this, (ECFieldElement)null, (ECFieldElement)null);

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, ECFieldElement[] var3, boolean var4) {
      return new SecT163R2Point(this, var1, var2, var3, var4);
   }

   public boolean supportsCoordinateSystem(int var1) {
      switch(var1) {
      case 6:
         return true;
      default:
         return false;
      }
   }

   public int getFieldSize() {
      return 163;
   }

   public SecT163R2Curve() {
      super(163, 3, 6, 7);
      this.a = this.fromBigInteger(BigInteger.valueOf(1L));
      this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("020A601907B8C953CA1481EB10512F78744A3205FD")));
      this.order = new BigInteger(1, Hex.decode("040000000000000000000292FE77E70C12A4234C33"));
      this.cofactor = BigInteger.valueOf(2L);
      this.coord = 6;
   }

   public ECFieldElement fromBigInteger(BigInteger var1) {
      return new SecT163FieldElement(var1);
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, boolean var3) {
      return new SecT163R2Point(this, var1, var2, var3);
   }

   public int getK2() {
      return 6;
   }

   public ECPoint getInfinity() {
      return this.infinity;
   }

   public ECCurve cloneCurve() {
      return new SecT163R2Curve();
   }

   public int getM() {
      return 163;
   }

   public boolean isTrinomial() {
      return false;
   }

   public int getK1() {
      return 3;
   }

   public boolean isKoblitz() {
      return false;
   }

   public int getK3() {
      return 7;
   }
}
