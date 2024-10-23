package org.bouncycastle.crypto.ec;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecT163R1Curve;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$19 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      byte[] var1 = Hex.decode("24B7B137C8A14D696E6768756151756FD0DA2E5C");
      ECCurve var2 = CustomNamedCurves.access$000(new SecT163R1Curve());
      X9ECPoint var3 = new X9ECPoint(var2, Hex.decode("040369979697AB43897789566789567F787A7876A65400435EDB42EFAFB2989D51FEFCE3C80988F41FF883"));
      return new X9ECParameters(var2, var3, var2.getOrder(), var2.getCofactor(), var1);
   }
}
