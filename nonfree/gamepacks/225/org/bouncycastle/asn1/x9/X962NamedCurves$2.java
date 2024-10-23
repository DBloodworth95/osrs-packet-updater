package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$2 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("fffffffffffffffffffffffe5fb1a724dc80418648d8dd31", 16);
      BigInteger var2 = BigInteger.valueOf(1L);
      ECCurve$Fp var3 = new ECCurve$Fp(new BigInteger("6277101735386680763835789423207666416083908700390324961279"), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("cc22d6dfb95c6b25e49c0d6364a4e5980c393aa21668d953", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("03eea2bae7e1497842f2de7769cfe9c989c072ad696f48034a")), var1, var2, Hex.decode("31a92ee2029fd10d901b113e990710f0d21ac6b6"));
   }
}
