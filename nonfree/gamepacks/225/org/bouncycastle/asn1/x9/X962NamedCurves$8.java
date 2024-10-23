package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$8 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("0400000000000000000001E60FC8821CC74DAEAFC1", 16);
      BigInteger var2 = BigInteger.valueOf(2L);
      ECCurve$F2m var3 = new ECCurve$F2m(163, 1, 2, 8, new BigInteger("072546B5435234A422E0789675F432C89435DE5242", 16), new BigInteger("00C9517D06D5240D3CFF38C74B20B6CD4D6F9DD4D9", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("0307AF69989546103D79329FCC3D74880F33BBE803CB")), var1, var2, Hex.decode("D2C0FB15760860DEF1EEF4D696E6768756151754"));
   }
}
