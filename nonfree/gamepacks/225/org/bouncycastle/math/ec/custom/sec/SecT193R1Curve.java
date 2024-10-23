package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$AbstractF2m;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecT193R1Curve extends ECCurve$AbstractF2m {
   static final int SecT193R1_DEFAULT_COORDS = 6;
   public SecT193R1Point infinity = new SecT193R1Point(this, (ECFieldElement)null, (ECFieldElement)null);

   public int getFieldSize() {
      return 193;
   }

   public int getK1() {
      return 15;
   }

   public boolean supportsCoordinateSystem(int var1) {
      switch(var1) {
      case 6:
         return true;
      default:
         return false;
      }
   }

   public ECFieldElement fromBigInteger(BigInteger var1) {
      return new SecT193FieldElement(var1);
   }

   public ECCurve cloneCurve() {
      return new SecT193R1Curve();
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, boolean var3) {
      return new SecT193R1Point(this, var1, var2, var3);
   }

   public SecT193R1Curve() {
      super(193, 15, 0, 0);
      this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
      this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
      this.order = new BigInteger(1, Hex.decode("01000000000000000000000000C7F34A778F443ACC920EBA49"));
      this.cofactor = BigInteger.valueOf(2L);
      this.coord = 6;
   }

   public ECPoint getInfinity() {
      return this.infinity;
   }

   public boolean isKoblitz() {
      return false;
   }

   public int getM() {
      return 193;
   }

   public boolean isTrinomial() {
      return true;
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, ECFieldElement[] var3, boolean var4) {
      return new SecT193R1Point(this, var1, var2, var3, var4);
   }

   public int getK2() {
      return 0;
   }

   public int getK3() {
      return 0;
   }
}
