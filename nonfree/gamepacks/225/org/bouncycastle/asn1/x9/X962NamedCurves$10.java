package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$10 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("03FFFFFFFFFFFFFFFFFFFE1AEE140F110AFF961309", 16);
      BigInteger var2 = BigInteger.valueOf(2L);
      ECCurve$F2m var3 = new ECCurve$F2m(163, 1, 2, 8, new BigInteger("07A526C63D3E25A256A007699F5447E32AE456B50E", 16), new BigInteger("03F7061798EB99E238FD6F1BF95B48FEEB4854252B", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("0202F9F87B7C574D0BDECF8A22E6524775F98CDEBDCB")), var1, var2, (byte[])null);
   }
}
