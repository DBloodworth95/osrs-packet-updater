package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$21 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      short var1 = 163;
      byte var2 = 3;
      byte var3 = 6;
      byte var4 = 7;
      BigInteger var5 = SECNamedCurves.access$000("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2");
      BigInteger var6 = SECNamedCurves.access$000("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9");
      byte[] var7 = Hex.decode("24B7B137C8A14D696E6768756151756FD0DA2E5C");
      BigInteger var8 = SECNamedCurves.access$000("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B");
      BigInteger var9 = BigInteger.valueOf(2L);
      ECCurve var10 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var5, var6, var8, var9));
      X9ECPoint var11 = new X9ECPoint(var10, Hex.decode("040369979697AB43897789566789567F787A7876A65400435EDB42EFAFB2989D51FEFCE3C80988F41FF883"));
      return new X9ECParameters(var10, var11, var8, var9, var7);
   }
}
