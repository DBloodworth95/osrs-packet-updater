package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$7 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = SECNamedCurves.access$000("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73");
      BigInteger var2 = SECNamedCurves.access$000("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70");
      BigInteger var3 = SECNamedCurves.access$000("B4E134D3FB59EB8BAB57274904664D5AF50388BA");
      byte[] var4 = Hex.decode("B99B99B099B323E02709A4D696E6768756151751");
      BigInteger var5 = SECNamedCurves.access$000("0100000000000000000000351EE786A818F3A1A16B");
      BigInteger var6 = BigInteger.valueOf(1L);
      ECCurve var7 = SECNamedCurves.access$100(new ECCurve$Fp(var1, var2, var3, var5, var6));
      X9ECPoint var8 = new X9ECPoint(var7, Hex.decode("0452DCB034293A117E1F4FF11B30F7199D3144CE6DFEAFFEF2E331F296E071FA0DF9982CFEA7D43F2E"));
      return new X9ECParameters(var7, var8, var5, var6, var4);
   }
}
