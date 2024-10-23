package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$24 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      short var1 = 193;
      byte var2 = 15;
      BigInteger var3 = SECNamedCurves.access$000("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B");
      BigInteger var4 = SECNamedCurves.access$000("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE");
      byte[] var5 = Hex.decode("10B7B4D696E676875615175137C8A16FD0DA2211");
      BigInteger var6 = SECNamedCurves.access$000("010000000000000000000000015AAB561B005413CCD4EE99D5");
      BigInteger var7 = BigInteger.valueOf(2L);
      ECCurve var8 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var6, var7));
      X9ECPoint var9 = new X9ECPoint(var8, Hex.decode("0400D9B67D192E0367C803F39E1A7E82CA14A651350AAE617E8F01CE94335607C304AC29E7DEFBD9CA01F596F927224CDECF6C"));
      return new X9ECParameters(var8, var9, var6, var7, var5);
   }
}
