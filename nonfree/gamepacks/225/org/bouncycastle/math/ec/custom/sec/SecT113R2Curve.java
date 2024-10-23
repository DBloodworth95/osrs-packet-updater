package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$AbstractF2m;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecT113R2Curve extends ECCurve$AbstractF2m {
   static final int SecT113R2_DEFAULT_COORDS = 6;
   public SecT113R2Point infinity = new SecT113R2Point(this, (ECFieldElement)null, (ECFieldElement)null);

   public SecT113R2Curve() {
      super(113, 9, 0, 0);
      this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("00689918DBEC7E5A0DD6DFC0AA55C7")));
      this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("0095E9A9EC9B297BD4BF36E059184F")));
      this.order = new BigInteger(1, Hex.decode("010000000000000108789B2496AF93"));
      this.cofactor = BigInteger.valueOf(2L);
      this.coord = 6;
   }

   public int getFieldSize() {
      return 113;
   }

   public boolean supportsCoordinateSystem(int var1) {
      switch(var1) {
      case 6:
         return true;
      default:
         return false;
      }
   }

   public boolean isKoblitz() {
      return false;
   }

   public int getK1() {
      return 9;
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, boolean var3) {
      return new SecT113R2Point(this, var1, var2, var3);
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, ECFieldElement[] var3, boolean var4) {
      return new SecT113R2Point(this, var1, var2, var3, var4);
   }

   public ECPoint getInfinity() {
      return this.infinity;
   }

   public ECFieldElement fromBigInteger(BigInteger var1) {
      return new SecT113FieldElement(var1);
   }

   public ECCurve cloneCurve() {
      return new SecT113R2Curve();
   }

   public boolean isTrinomial() {
      return true;
   }

   public int getK3() {
      return 0;
   }

   public int getK2() {
      return 0;
   }

   public int getM() {
      return 113;
   }
}
