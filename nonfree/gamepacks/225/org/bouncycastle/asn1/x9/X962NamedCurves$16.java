package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$16 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("2000000000000000000000000000000F4D42FFE1492A4993F1CAD666E447", 16);
      BigInteger var2 = BigInteger.valueOf(4L);
      ECCurve$F2m var3 = new ECCurve$F2m(239, 36, new BigInteger("32010857077C5431123A46B808906756F543423E8D27877578125778AC76", 16), new BigInteger("790408F2EEDAF392B012EDEFB3392F30F4327C0CA3F31FC383C422AA8C16", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("0257927098FA932E7C0A96D3FD5B706EF7E5F5C156E16B7E7C86038552E91D")), var1, var2, (byte[])null);
   }
}
