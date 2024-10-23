package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$26 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      short var1 = 233;
      byte var2 = 74;
      BigInteger var3 = BigInteger.valueOf(1L);
      BigInteger var4 = SECNamedCurves.access$000("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD");
      byte[] var5 = Hex.decode("74D59FF07F6B413D0EA14B344B20A2DB049B50C3");
      BigInteger var6 = SECNamedCurves.access$000("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7");
      BigInteger var7 = BigInteger.valueOf(2L);
      ECCurve var8 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var6, var7));
      X9ECPoint var9 = new X9ECPoint(var8, Hex.decode("0400FAC9DFCBAC8313BB2139F1BB755FEF65BC391F8B36F8F8EB7371FD558B01006A08A41903350678E58528BEBF8A0BEFF867A7CA36716F7E01F81052"));
      return new X9ECParameters(var8, var9, var6, var7, var5);
   }
}
