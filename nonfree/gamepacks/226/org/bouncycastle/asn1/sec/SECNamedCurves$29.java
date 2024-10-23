package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$29 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      short var1 = 283;
      byte var2 = 5;
      byte var3 = 7;
      byte var4 = 12;
      BigInteger var5 = BigInteger.valueOf(1L);
      BigInteger var6 = SECNamedCurves.access$000("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5");
      byte[] var7 = Hex.decode("77E2B07370EB0F832A6DD5B62DFC88CD06BB84BE");
      BigInteger var8 = SECNamedCurves.access$000("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307");
      BigInteger var9 = BigInteger.valueOf(2L);
      ECCurve var10 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var5, var6, var8, var9));
      X9ECPoint var11 = new X9ECPoint(var10, Hex.decode("0405F939258DB7DD90E1934F8C70B0DFEC2EED25B8557EAC9C80E2E198F8CDBECD86B1205303676854FE24141CB98FE6D4B20D02B4516FF702350EDDB0826779C813F0DF45BE8112F4"));
      return new X9ECParameters(var10, var11, var8, var9, var7);
   }
}
