package org.bouncycastle.crypto.ec;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecT233K1Curve;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$23 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      Object var1 = null;
      ECCurve var2 = CustomNamedCurves.access$000(new SecT233K1Curve());
      X9ECPoint var3 = new X9ECPoint(var2, Hex.decode("04017232BA853A7E731AF129F22FF4149563A419C26BF50A4C9D6EEFAD612601DB537DECE819B7F70F555A67C427A8CD9BF18AEB9B56E0C11056FAE6A3"));
      return new X9ECParameters(var2, var3, var2.getOrder(), var2.getCofactor(), (byte[])var1);
   }
}
