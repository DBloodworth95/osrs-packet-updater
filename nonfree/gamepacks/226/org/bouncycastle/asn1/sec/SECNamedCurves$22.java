package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$22 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      short var1 = 163;
      byte var2 = 3;
      byte var3 = 6;
      byte var4 = 7;
      BigInteger var5 = BigInteger.valueOf(1L);
      BigInteger var6 = SECNamedCurves.access$000("020A601907B8C953CA1481EB10512F78744A3205FD");
      byte[] var7 = Hex.decode("85E25BFE5C86226CDB12016F7553F9D0E693A268");
      BigInteger var8 = SECNamedCurves.access$000("040000000000000000000292FE77E70C12A4234C33");
      BigInteger var9 = BigInteger.valueOf(2L);
      ECCurve var10 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var5, var6, var8, var9));
      X9ECPoint var11 = new X9ECPoint(var10, Hex.decode("0403F0EBA16286A2D57EA0991168D4994637E8343E3600D51FBC6C71A0094FA2CDD545B11C5C0C797324F1"));
      return new X9ECParameters(var10, var11, var8, var9, var7);
   }
}
