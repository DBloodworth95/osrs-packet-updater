package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class SECNamedCurves$18 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      short var1 = 131;
      byte var2 = 2;
      byte var3 = 3;
      byte var4 = 8;
      BigInteger var5 = SECNamedCurves.access$000("07A11B09A76B562144418FF3FF8C2570B8");
      BigInteger var6 = SECNamedCurves.access$000("0217C05610884B63B9C6C7291678F9D341");
      byte[] var7 = Hex.decode("4D696E676875615175985BD3ADBADA21B43A97E2");
      BigInteger var8 = SECNamedCurves.access$000("0400000000000000023123953A9464B54D");
      BigInteger var9 = BigInteger.valueOf(2L);
      ECCurve var10 = SECNamedCurves.access$100(new ECCurve$F2m(var1, var2, var3, var4, var5, var6, var8, var9));
      X9ECPoint var11 = new X9ECPoint(var10, Hex.decode("040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150"));
      return new X9ECParameters(var10, var11, var8, var9, var7);
   }
}
