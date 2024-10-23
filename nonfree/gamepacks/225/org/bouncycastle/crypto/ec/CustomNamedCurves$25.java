package org.bouncycastle.crypto.ec;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecT239K1Curve;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$25 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      Object var1 = null;
      ECCurve var2 = CustomNamedCurves.access$000(new SecT239K1Curve());
      X9ECPoint var3 = new X9ECPoint(var2, Hex.decode("0429A0B6A887A983E9730988A68727A8B2D126C44CC2CC7B2A6555193035DC76310804F12E549BDB011C103089E73510ACB275FC312A5DC6B76553F0CA"));
      return new X9ECParameters(var2, var3, var2.getOrder(), var2.getCofactor(), (byte[])var1);
   }
}
