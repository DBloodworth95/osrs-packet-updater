package org.bouncycastle.crypto.ec;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Curve;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$4 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      byte[] var1 = Hex.decode("1053CDE42C14D696E67687561517533BF3F83345");
      ECCurve var2 = CustomNamedCurves.access$000(new SecP160R1Curve());
      X9ECPoint var3 = new X9ECPoint(var2, Hex.decode("044A96B5688EF573284664698968C38BB913CBFC8223A628553168947D59DCC912042351377AC5FB32"));
      return new X9ECParameters(var2, var3, var2.getOrder(), var2.getCofactor(), var1);
   }
}
