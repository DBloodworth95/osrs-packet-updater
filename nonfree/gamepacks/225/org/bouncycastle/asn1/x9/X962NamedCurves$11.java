package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$11 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("010092537397ECA4F6145799D62B0A19CE06FE26AD", 16);
      BigInteger var2 = BigInteger.valueOf(65390L);
      ECCurve$F2m var3 = new ECCurve$F2m(176, 1, 2, 43, new BigInteger("00E4E6DB2995065C407D9D39B8D0967B96704BA8E9C90B", 16), new BigInteger("005DDA470ABE6414DE8EC133AE28E9BBD7FCEC0AE0FFF2", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("038D16C2866798B600F9F08BB4A8E860F3298CE04A5798")), var1, var2, (byte[])null);
   }
}
