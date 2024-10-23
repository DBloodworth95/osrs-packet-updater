package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$27 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      short var1 = 239;
      short var2 = 158;
      BigInteger var3 = ECConstants.ZERO;
      BigInteger var4 = BigInteger.valueOf(1L);
      Object var5 = null;
      BigInteger var6 = SECNamedCurves.access$000("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5");
      BigInteger var7 = BigInteger.valueOf(4L);
      ECCurve var8 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var6, var7));
      X9ECPoint var9 = new X9ECPoint(var8, Hex.decode("0429A0B6A887A983E9730988A68727A8B2D126C44CC2CC7B2A6555193035DC76310804F12E549BDB011C103089E73510ACB275FC312A5DC6B76553F0CA"));
      return new X9ECParameters(var8, var9, var6, var7, (byte[])var5);
   }
}
