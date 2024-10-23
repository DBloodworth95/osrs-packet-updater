package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$32 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      short var1 = 571;
      byte var2 = 2;
      byte var3 = 5;
      byte var4 = 10;
      BigInteger var5 = ECConstants.ZERO;
      BigInteger var6 = BigInteger.valueOf(1L);
      Object var7 = null;
      BigInteger var8 = SECNamedCurves.access$000("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001");
      BigInteger var9 = BigInteger.valueOf(4L);
      ECCurve var10 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var5, var6, var8, var9));
      X9ECPoint var11 = new X9ECPoint(var10, Hex.decode("04026EB7A859923FBC82189631F8103FE4AC9CA2970012D5D46024804801841CA44370958493B205E647DA304DB4CEB08CBBD1BA39494776FB988B47174DCA88C7E2945283A01C89720349DC807F4FBF374F4AEADE3BCA95314DD58CEC9F307A54FFC61EFC006D8A2C9D4979C0AC44AEA74FBEBBB9F772AEDCB620B01A7BA7AF1B320430C8591984F601CD4C143EF1C7A3"));
      return new X9ECParameters(var10, var11, var8, var9, (byte[])var7);
   }
}
