package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$3 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("ffffffffffffffffffffffff7a62d031c83f4294f640ec13", 16);
      BigInteger var2 = BigInteger.valueOf(1L);
      ECCurve$Fp var3 = new ECCurve$Fp(new BigInteger("6277101735386680763835789423207666416083908700390324961279"), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("22123dc2395a05caa7423daeccc94760a7d462256bd56916", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("027d29778100c65a1da1783716588dce2b8b4aee8e228f1896")), var1, var2, Hex.decode("c469684435deb378c4b65ca9591e2a5763059a2e"));
   }
}
