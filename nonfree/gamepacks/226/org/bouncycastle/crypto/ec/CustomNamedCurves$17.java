package org.bouncycastle.crypto.ec;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecT131R2Curve;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$17 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      byte[] var1 = Hex.decode("985BD3ADBAD4D696E676875615175A21B43A97E3");
      ECCurve var2 = CustomNamedCurves.access$000(new SecT131R2Curve());
      X9ECPoint var3 = new X9ECPoint(var2, Hex.decode("040356DCD8F2F95031AD652D23951BB366A80648F06D867940A5366D9E265DE9EB240F"));
      return new X9ECParameters(var2, var3, var2.getOrder(), var2.getCofactor(), var1);
   }
}
