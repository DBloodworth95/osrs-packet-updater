package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$28 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      short var1 = 283;
      byte var2 = 5;
      byte var3 = 7;
      byte var4 = 12;
      BigInteger var5 = ECConstants.ZERO;
      BigInteger var6 = BigInteger.valueOf(1L);
      Object var7 = null;
      BigInteger var8 = SECNamedCurves.access$000("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61");
      BigInteger var9 = BigInteger.valueOf(4L);
      ECCurve var10 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var5, var6, var8, var9));
      X9ECPoint var11 = new X9ECPoint(var10, Hex.decode("040503213F78CA44883F1A3B8162F188E553CD265F23C1567A16876913B0C2AC245849283601CCDA380F1C9E318D90F95D07E5426FE87E45C0E8184698E45962364E34116177DD2259"));
      return new X9ECParameters(var10, var11, var8, var9, (byte[])var7);
   }
}
