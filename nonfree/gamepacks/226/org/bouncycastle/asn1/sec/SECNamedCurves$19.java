package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$19 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      short var1 = 131;
      byte var2 = 2;
      byte var3 = 3;
      byte var4 = 8;
      BigInteger var5 = SECNamedCurves.access$000("03E5A88919D7CAFCBF415F07C2176573B2");
      BigInteger var6 = SECNamedCurves.access$000("04B8266A46C55657AC734CE38F018F2192");
      byte[] var7 = Hex.decode("985BD3ADBAD4D696E676875615175A21B43A97E3");
      BigInteger var8 = SECNamedCurves.access$000("0400000000000000016954A233049BA98F");
      BigInteger var9 = BigInteger.valueOf(2L);
      ECCurve var10 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var5, var6, var8, var9));
      X9ECPoint var11 = new X9ECPoint(var10, Hex.decode("040356DCD8F2F95031AD652D23951BB366A80648F06D867940A5366D9E265DE9EB240F"));
      return new X9ECParameters(var10, var11, var8, var9, var7);
   }
}
