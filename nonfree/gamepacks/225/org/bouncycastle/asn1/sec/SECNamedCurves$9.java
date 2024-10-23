package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$9 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = SECNamedCurves.access$000("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF");
      BigInteger var2 = SECNamedCurves.access$000("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC");
      BigInteger var3 = SECNamedCurves.access$000("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1");
      byte[] var4 = Hex.decode("3045AE6FC8422F64ED579528D38120EAE12196D5");
      BigInteger var5 = SECNamedCurves.access$000("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831");
      BigInteger var6 = BigInteger.valueOf(1L);
      ECCurve var7 = SECNamedCurves.access$100(new ECCurve$Fp(var1, var2, var3, var5, var6));
      X9ECPoint var8 = new X9ECPoint(var7, Hex.decode("04188DA80EB03090F67CBF20EB43A18800F4FF0AFD82FF101207192B95FFC8DA78631011ED6B24CDD573F977A11E794811"));
      return new X9ECParameters(var7, var8, var5, var6, var4);
   }
}
