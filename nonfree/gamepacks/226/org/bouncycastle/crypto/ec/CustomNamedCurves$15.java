package org.bouncycastle.crypto.ec;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecT113R2Curve;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$15 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      byte[] var1 = Hex.decode("10C0FB15760860DEF1EEF4D696E676875615175D");
      ECCurve var2 = CustomNamedCurves.access$000(new SecT113R2Curve());
      X9ECPoint var3 = new X9ECPoint(var2, Hex.decode("0401A57A6A7B26CA5EF52FCDB816479700B3ADC94ED1FE674C06E695BABA1D"));
      return new X9ECParameters(var2, var3, var2.getOrder(), var2.getCofactor(), var1);
   }
}
