package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$23 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      short var1 = 193;
      byte var2 = 15;
      BigInteger var3 = SECNamedCurves.access$000("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01");
      BigInteger var4 = SECNamedCurves.access$000("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814");
      byte[] var5 = Hex.decode("103FAEC74D696E676875615175777FC5B191EF30");
      BigInteger var6 = SECNamedCurves.access$000("01000000000000000000000000C7F34A778F443ACC920EBA49");
      BigInteger var7 = BigInteger.valueOf(2L);
      ECCurve var8 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var6, var7));
      X9ECPoint var9 = new X9ECPoint(var8, Hex.decode("0401F481BC5F0FF84A74AD6CDF6FDEF4BF6179625372D8C0C5E10025E399F2903712CCF3EA9E3A1AD17FB0B3201B6AF7CE1B05"));
      return new X9ECParameters(var8, var9, var6, var7, var5);
   }
}
