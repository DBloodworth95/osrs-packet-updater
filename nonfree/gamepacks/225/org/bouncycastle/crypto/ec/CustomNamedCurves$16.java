package org.bouncycastle.crypto.ec;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecT131R1Curve;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$16 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      byte[] var1 = Hex.decode("4D696E676875615175985BD3ADBADA21B43A97E2");
      ECCurve var2 = CustomNamedCurves.access$000(new SecT131R1Curve());
      X9ECPoint var3 = new X9ECPoint(var2, Hex.decode("040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150"));
      return new X9ECParameters(var2, var3, var2.getOrder(), var2.getCofactor(), var1);
   }
}
