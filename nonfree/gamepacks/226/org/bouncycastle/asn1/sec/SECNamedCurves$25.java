package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$25 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      short var1 = 233;
      byte var2 = 74;
      BigInteger var3 = ECConstants.ZERO;
      BigInteger var4 = BigInteger.valueOf(1L);
      Object var5 = null;
      BigInteger var6 = SECNamedCurves.access$000("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF");
      BigInteger var7 = BigInteger.valueOf(4L);
      ECCurve var8 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var6, var7));
      X9ECPoint var9 = new X9ECPoint(var8, Hex.decode("04017232BA853A7E731AF129F22FF4149563A419C26BF50A4C9D6EEFAD612601DB537DECE819B7F70F555A67C427A8CD9BF18AEB9B56E0C11056FAE6A3"));
      return new X9ECParameters(var8, var9, var6, var7, (byte[])var5);
   }
}
