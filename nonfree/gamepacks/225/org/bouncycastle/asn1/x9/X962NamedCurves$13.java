package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$13 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("20000000000000000000000050508CB89F652824E06B8173", 16);
      BigInteger var2 = BigInteger.valueOf(4L);
      ECCurve$F2m var3 = new ECCurve$F2m(191, 9, new BigInteger("401028774D7777C7B7666D1366EA432071274F89FF01E718", 16), new BigInteger("0620048D28BCBD03B6249C99182B7C8CD19700C362C46A01", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("023809B2B7CC1B28CC5A87926AAD83FD28789E81E2C9E3BF10")), var1, var2, (byte[])null);
   }
}
