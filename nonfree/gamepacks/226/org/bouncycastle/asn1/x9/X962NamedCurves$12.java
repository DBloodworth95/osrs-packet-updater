package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$12 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("40000000000000000000000004A20E90C39067C893BBB9A5", 16);
      BigInteger var2 = BigInteger.valueOf(2L);
      ECCurve$F2m var3 = new ECCurve$F2m(191, 9, new BigInteger("2866537B676752636A68F56554E12640276B649EF7526267", 16), new BigInteger("2E45EF571F00786F67B0081B9495A3D95462F5DE0AA185EC", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("0236B3DAF8A23206F9C4F299D7B21A9C369137F2C84AE1AA0D")), var1, var2, Hex.decode("4E13CA542744D696E67687561517552F279A8C84"));
   }
}
