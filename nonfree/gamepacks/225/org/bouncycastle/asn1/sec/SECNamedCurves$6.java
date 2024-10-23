package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$6 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = SECNamedCurves.access$000("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF");
      BigInteger var2 = SECNamedCurves.access$000("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC");
      BigInteger var3 = SECNamedCurves.access$000("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45");
      byte[] var4 = Hex.decode("1053CDE42C14D696E67687561517533BF3F83345");
      BigInteger var5 = SECNamedCurves.access$000("0100000000000000000001F4C8F927AED3CA752257");
      BigInteger var6 = BigInteger.valueOf(1L);
      ECCurve var7 = SECNamedCurves.access$100(new ECCurve$Fp(var1, var2, var3, var5, var6));
      X9ECPoint var8 = new X9ECPoint(var7, Hex.decode("044A96B5688EF573284664698968C38BB913CBFC8223A628553168947D59DCC912042351377AC5FB32"));
      return new X9ECParameters(var7, var8, var5, var6, var4);
   }
}
