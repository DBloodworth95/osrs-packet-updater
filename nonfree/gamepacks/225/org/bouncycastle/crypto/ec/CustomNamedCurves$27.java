package org.bouncycastle.crypto.ec;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecT283R1Curve;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$27 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      byte[] var1 = Hex.decode("77E2B07370EB0F832A6DD5B62DFC88CD06BB84BE");
      ECCurve var2 = CustomNamedCurves.access$000(new SecT283R1Curve());
      X9ECPoint var3 = new X9ECPoint(var2, Hex.decode("0405F939258DB7DD90E1934F8C70B0DFEC2EED25B8557EAC9C80E2E198F8CDBECD86B1205303676854FE24141CB98FE6D4B20D02B4516FF702350EDDB0826779C813F0DF45BE8112F4"));
      return new X9ECParameters(var2, var3, var2.getOrder(), var2.getCofactor(), var1);
   }
}
