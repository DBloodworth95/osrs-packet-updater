package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$4 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = SECNamedCurves.access$000("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF");
      BigInteger var2 = SECNamedCurves.access$000("D6031998D1B3BBFEBF59CC9BBFF9AEE1");
      BigInteger var3 = SECNamedCurves.access$000("5EEEFCA380D02919DC2C6558BB6D8A5D");
      byte[] var4 = Hex.decode("004D696E67687561517512D8F03431FCE63B88F4");
      BigInteger var5 = SECNamedCurves.access$000("3FFFFFFF7FFFFFFFBE0024720613B5A3");
      BigInteger var6 = BigInteger.valueOf(4L);
      ECCurve var7 = SECNamedCurves.access$100(new ECCurve$Fp(var1, var2, var3, var5, var6));
      X9ECPoint var8 = new X9ECPoint(var7, Hex.decode("047B6AA5D85E572983E6FB32A7CDEBC14027B6916A894D3AEE7106FE805FC34B44"));
      return new X9ECParameters(var7, var8, var5, var6, var4);
   }
}
