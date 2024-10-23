package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$17 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      byte var1 = 113;
      byte var2 = 9;
      BigInteger var3 = SECNamedCurves.access$000("00689918DBEC7E5A0DD6DFC0AA55C7");
      BigInteger var4 = SECNamedCurves.access$000("0095E9A9EC9B297BD4BF36E059184F");
      byte[] var5 = Hex.decode("10C0FB15760860DEF1EEF4D696E676875615175D");
      BigInteger var6 = SECNamedCurves.access$000("010000000000000108789B2496AF93");
      BigInteger var7 = BigInteger.valueOf(2L);
      ECCurve var8 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var6, var7));
      X9ECPoint var9 = new X9ECPoint(var8, Hex.decode("0401A57A6A7B26CA5EF52FCDB816479700B3ADC94ED1FE674C06E695BABA1D"));
      return new X9ECParameters(var8, var9, var6, var7, var5);
   }
}
