package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$14 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("155555555555555555555555610C0B196812BFB6288A3EA3", 16);
      BigInteger var2 = BigInteger.valueOf(6L);
      ECCurve$F2m var3 = new ECCurve$F2m(191, 9, new BigInteger("6C01074756099122221056911C77D77E77A777E7E7E77FCB", 16), new BigInteger("71FE1AF926CF847989EFEF8DB459F66394D90F32AD3F15E8", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("03375D4CE24FDE434489DE8746E71786015009E66E38A926DD")), var1, var2, (byte[])null);
   }
}
