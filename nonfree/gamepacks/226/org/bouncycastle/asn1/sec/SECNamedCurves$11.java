package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$11 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = SECNamedCurves.access$000("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001");
      BigInteger var2 = SECNamedCurves.access$000("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE");
      BigInteger var3 = SECNamedCurves.access$000("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4");
      byte[] var4 = Hex.decode("BD71344799D5C7FCDC45B59FA3B9AB8F6A948BC5");
      BigInteger var5 = SECNamedCurves.access$000("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D");
      BigInteger var6 = BigInteger.valueOf(1L);
      ECCurve var7 = SECNamedCurves.access$100(new ECCurve$Fp(var1, var2, var3, var5, var6));
      X9ECPoint var8 = new X9ECPoint(var7, Hex.decode("04B70E0CBD6BB4BF7F321390B94A03C1D356C21122343280D6115C1D21BD376388B5F723FB4C22DFE6CD4375A05A07476444D5819985007E34"));
      return new X9ECParameters(var7, var8, var5, var6, var4);
   }
}
