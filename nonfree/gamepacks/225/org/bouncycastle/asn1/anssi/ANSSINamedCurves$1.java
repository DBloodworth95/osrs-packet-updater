package org.bouncycastle.asn1.anssi;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.util.encoders.Hex;

final class ANSSINamedCurves$1 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = ANSSINamedCurves.access$000("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
      BigInteger var2 = ANSSINamedCurves.access$000("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
      BigInteger var3 = ANSSINamedCurves.access$000("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
      Object var4 = null;
      BigInteger var5 = ANSSINamedCurves.access$000("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
      BigInteger var6 = BigInteger.valueOf(1L);
      ECCurve var7 = ANSSINamedCurves.access$100(new ECCurve$Fp(var1, var2, var3, var5, var6));
      X9ECPoint var8 = new X9ECPoint(var7, Hex.decode("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB"));
      return new X9ECParameters(var7, var8, var5, var6, (byte[])var4);
   }
}
