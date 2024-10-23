package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$20 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      short var1 = 163;
      byte var2 = 3;
      byte var3 = 6;
      byte var4 = 7;
      BigInteger var5 = BigInteger.valueOf(1L);
      BigInteger var6 = BigInteger.valueOf(1L);
      Object var7 = null;
      BigInteger var8 = SECNamedCurves.access$000("04000000000000000000020108A2E0CC0D99F8A5EF");
      BigInteger var9 = BigInteger.valueOf(2L);
      ECCurve var10 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var5, var6, var8, var9));
      X9ECPoint var11 = new X9ECPoint(var10, Hex.decode("0402FE13C0537BBC11ACAA07D793DE4E6D5E5C94EEE80289070FB05D38FF58321F2E800536D538CCDAA3D9"));
      return new X9ECParameters(var10, var11, var8, var9, (byte[])var7);
   }
}
