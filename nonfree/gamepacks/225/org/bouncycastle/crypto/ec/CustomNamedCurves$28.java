package org.bouncycastle.crypto.ec;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecT409K1Curve;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$28 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      Object var1 = null;
      ECCurve var2 = CustomNamedCurves.access$000(new SecT409K1Curve());
      X9ECPoint var3 = new X9ECPoint(var2, Hex.decode("040060F05F658F49C1AD3AB1890F7184210EFD0987E307C84C27ACCFB8F9F67CC2C460189EB5AAAA62EE222EB1B35540CFE902374601E369050B7C4E42ACBA1DACBF04299C3460782F918EA427E6325165E9EA10E3DA5F6C42E9C55215AA9CA27A5863EC48D8E0286B"));
      return new X9ECParameters(var2, var3, var2.getOrder(), var2.getCofactor(), (byte[])var1);
   }
}
