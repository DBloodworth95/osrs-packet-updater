package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$1 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("ffffffffffffffffffffffff99def836146bc9b1b4d22831", 16);
      BigInteger var2 = BigInteger.valueOf(1L);
      ECCurve$Fp var3 = new ECCurve$Fp(new BigInteger("6277101735386680763835789423207666416083908700390324961279"), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("64210519e59c80e70fa7e9ab72243049feb8deecc146b9b1", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("03188da80eb03090f67cbf20eb43a18800f4ff0afd82ff1012")), var1, var2, Hex.decode("3045AE6FC8422f64ED579528D38120EAE12196D5"));
   }
}
