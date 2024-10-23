package org.bouncycastle.crypto.ec;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecT113R1Curve;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$14 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      byte[] var1 = Hex.decode("10E723AB14D696E6768756151756FEBF8FCB49A9");
      ECCurve var2 = CustomNamedCurves.access$000(new SecT113R1Curve());
      X9ECPoint var3 = new X9ECPoint(var2, Hex.decode("04009D73616F35F4AB1407D73562C10F00A52830277958EE84D1315ED31886"));
      return new X9ECParameters(var2, var3, var2.getOrder(), var2.getCofactor(), var1);
   }
}
