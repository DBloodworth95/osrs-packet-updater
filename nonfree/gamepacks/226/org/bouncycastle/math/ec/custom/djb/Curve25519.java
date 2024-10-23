package org.bouncycastle.math.ec.custom.djb;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$AbstractFp;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.encoders.Hex;

public class Curve25519 extends ECCurve$AbstractFp {
   public Curve25519Point infinity = new Curve25519Point(this, (ECFieldElement)null, (ECFieldElement)null);
   static final int Curve25519_DEFAULT_COORDS = 4;
   public static final BigInteger q;

   public BigInteger getQ() {
      return q;
   }

   public ECCurve cloneCurve() {
      return new Curve25519();
   }

   public boolean supportsCoordinateSystem(int var1) {
      switch(var1) {
      case 4:
         return true;
      default:
         return false;
      }
   }

   public int getFieldSize() {
      return q.bitLength();
   }

   public ECFieldElement fromBigInteger(BigInteger var1) {
      return new Curve25519FieldElement(var1);
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, ECFieldElement[] var3, boolean var4) {
      return new Curve25519Point(this, var1, var2, var3, var4);
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, boolean var3) {
      return new Curve25519Point(this, var1, var2, var3);
   }

   public Curve25519() {
      super(q);
      this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
      this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
      this.order = new BigInteger(1, Hex.decode("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
      this.cofactor = BigInteger.valueOf(8L);
      this.coord = 4;
   }

   public ECPoint getInfinity() {
      return this.infinity;
   }

   static {
      q = Nat256.toBigInteger(Curve25519Field.P);
   }
}
