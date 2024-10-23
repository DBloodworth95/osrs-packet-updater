package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$2 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = SECNamedCurves.access$000("DB7C2ABF62E35E668076BEAD208B");
      BigInteger var2 = SECNamedCurves.access$000("6127C24C05F38A0AAAF65C0EF02C");
      BigInteger var3 = SECNamedCurves.access$000("51DEF1815DB5ED74FCC34C85D709");
      byte[] var4 = Hex.decode("002757A1114D696E6768756151755316C05E0BD4");
      BigInteger var5 = SECNamedCurves.access$000("36DF0AAFD8B8D7597CA10520D04B");
      BigInteger var6 = BigInteger.valueOf(4L);
      ECCurve var7 = SECNamedCurves.access$100(new ECCurve$Fp(var1, var2, var3, var5, var6));
      X9ECPoint var8 = new X9ECPoint(var7, Hex.decode("044BA30AB5E892B4E1649DD0928643ADCD46F5882E3747DEF36E956E97"));
      return new X9ECParameters(var7, var8, var5, var6, var4);
   }
}
