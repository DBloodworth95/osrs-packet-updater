package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$9 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("03FFFFFFFFFFFFFFFFFFFDF64DE1151ADBB78F10A7", 16);
      BigInteger var2 = BigInteger.valueOf(2L);
      ECCurve$F2m var3 = new ECCurve$F2m(163, 1, 2, 8, new BigInteger("0108B39E77C4B108BED981ED0E890E117C511CF072", 16), new BigInteger("0667ACEB38AF4E488C407433FFAE4F1C811638DF20", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("030024266E4EB5106D0A964D92C4860E2671DB9B6CC5")), var1, var2, (byte[])null);
   }
}
