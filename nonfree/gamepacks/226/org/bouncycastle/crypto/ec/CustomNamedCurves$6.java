package org.bouncycastle.crypto.ec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecP192K1Curve;
import org.bouncycastle.math.ec.endo.GLVTypeBParameters;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$6 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      Object var1 = null;
      GLVTypeBParameters var2 = new GLVTypeBParameters(new BigInteger("bb85691939b869c1d087f601554b96b80cb4f55b35f433c2", 16), new BigInteger("3d84f26c12238d7b4f3d516613c1759033b1a5800175d0b1", 16), new BigInteger[]{new BigInteger("71169be7330b3038edb025f1", 16), new BigInteger("-b3fb3400dec5c4adceb8655c", 16)}, new BigInteger[]{new BigInteger("12511cfe811d0f4e6bc688b4d", 16), new BigInteger("71169be7330b3038edb025f1", 16)}, new BigInteger("71169be7330b3038edb025f1d0f9", 16), new BigInteger("b3fb3400dec5c4adceb8655d4c94", 16), 208);
      ECCurve var3 = CustomNamedCurves.access$100(new SecP192K1Curve(), var2);
      X9ECPoint var4 = new X9ECPoint(var3, Hex.decode("04DB4FF10EC057E9AE26B07D0280B7F4341DA5D1B1EAE06C7D9B2F2F6D9C5628A7844163D015BE86344082AA88D95E2F9D"));
      return new X9ECParameters(var3, var4, var3.getOrder(), var3.getCofactor(), (byte[])var1);
   }
}
