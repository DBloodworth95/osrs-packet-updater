package org.bouncycastle.crypto.ec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecP160K1Curve;
import org.bouncycastle.math.ec.endo.GLVTypeBParameters;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$3 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      Object var1 = null;
      GLVTypeBParameters var2 = new GLVTypeBParameters(new BigInteger("9ba48cba5ebcb9b6bd33b92830b2a2e0e192f10a", 16), new BigInteger("c39c6c3b3a36d7701b9c71a1f5804ae5d0003f4", 16), new BigInteger[]{new BigInteger("9162fbe73984472a0a9e", 16), new BigInteger("-96341f1138933bc2f505", 16)}, new BigInteger[]{new BigInteger("127971af8721782ecffa3", 16), new BigInteger("9162fbe73984472a0a9e", 16)}, new BigInteger("9162fbe73984472a0a9d0590", 16), new BigInteger("96341f1138933bc2f503fd44", 16), 176);
      ECCurve var3 = CustomNamedCurves.access$100(new SecP160K1Curve(), var2);
      X9ECPoint var4 = new X9ECPoint(var3, Hex.decode("043B4C382CE37AA192A4019E763036F4F5DD4D7EBB938CF935318FDCED6BC28286531733C3F03C4FEE"));
      return new X9ECParameters(var3, var4, var3.getOrder(), var3.getCofactor(), (byte[])var1);
   }
}
