package org.bouncycastle.crypto.ec;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecT571K1Curve;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$30 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      Object var1 = null;
      ECCurve var2 = CustomNamedCurves.access$000(new SecT571K1Curve());
      X9ECPoint var3 = new X9ECPoint(var2, Hex.decode("04026EB7A859923FBC82189631F8103FE4AC9CA2970012D5D46024804801841CA44370958493B205E647DA304DB4CEB08CBBD1BA39494776FB988B47174DCA88C7E2945283A01C89720349DC807F4FBF374F4AEADE3BCA95314DD58CEC9F307A54FFC61EFC006D8A2C9D4979C0AC44AEA74FBEBBB9F772AEDCB620B01A7BA7AF1B320430C8591984F601CD4C143EF1C7A3"));
      return new X9ECParameters(var2, var3, var2.getOrder(), var2.getCofactor(), (byte[])var1);
   }
}
