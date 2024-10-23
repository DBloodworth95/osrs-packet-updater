package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$16 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      byte var1 = 113;
      byte var2 = 9;
      BigInteger var3 = SECNamedCurves.access$000("003088250CA6E7C7FE649CE85820F7");
      BigInteger var4 = SECNamedCurves.access$000("00E8BEE4D3E2260744188BE0E9C723");
      byte[] var5 = Hex.decode("10E723AB14D696E6768756151756FEBF8FCB49A9");
      BigInteger var6 = SECNamedCurves.access$000("0100000000000000D9CCEC8A39E56F");
      BigInteger var7 = BigInteger.valueOf(2L);
      ECCurve var8 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var6, var7));
      X9ECPoint var9 = new X9ECPoint(var8, Hex.decode("04009D73616F35F4AB1407D73562C10F00A52830277958EE84D1315ED31886"));
      return new X9ECParameters(var8, var9, var6, var7, var5);
   }
}
