package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$3 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = SECNamedCurves.access$000("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF");
      BigInteger var2 = SECNamedCurves.access$000("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC");
      BigInteger var3 = SECNamedCurves.access$000("E87579C11079F43DD824993C2CEE5ED3");
      byte[] var4 = Hex.decode("000E0D4D696E6768756151750CC03A4473D03679");
      BigInteger var5 = SECNamedCurves.access$000("FFFFFFFE0000000075A30D1B9038A115");
      BigInteger var6 = BigInteger.valueOf(1L);
      ECCurve var7 = SECNamedCurves.access$100(new ECCurve$Fp(var1, var2, var3, var5, var6));
      X9ECPoint var8 = new X9ECPoint(var7, Hex.decode("04161FF7528B899B2D0C28607CA52C5B86CF5AC8395BAFEB13C02DA292DDED7A83"));
      return new X9ECParameters(var7, var8, var5, var6, var4);
   }
}
