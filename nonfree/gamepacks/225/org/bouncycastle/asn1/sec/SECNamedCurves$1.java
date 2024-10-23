package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$1 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = SECNamedCurves.access$000("DB7C2ABF62E35E668076BEAD208B");
      BigInteger var2 = SECNamedCurves.access$000("DB7C2ABF62E35E668076BEAD2088");
      BigInteger var3 = SECNamedCurves.access$000("659EF8BA043916EEDE8911702B22");
      byte[] var4 = Hex.decode("00F50B028E4D696E676875615175290472783FB1");
      BigInteger var5 = SECNamedCurves.access$000("DB7C2ABF62E35E7628DFAC6561C5");
      BigInteger var6 = BigInteger.valueOf(1L);
      ECCurve var7 = SECNamedCurves.access$100(new ECCurve$Fp(var1, var2, var3, var5, var6));
      X9ECPoint var8 = new X9ECPoint(var7, Hex.decode("0409487239995A5EE76B55F9C2F098A89CE5AF8724C0A23E0E0FF77500"));
      return new X9ECParameters(var7, var8, var5, var6, var4);
   }
}
