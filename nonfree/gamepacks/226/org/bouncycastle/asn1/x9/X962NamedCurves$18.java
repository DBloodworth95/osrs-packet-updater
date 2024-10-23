package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$18 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("0CCCCCCCCCCCCCCCCCCCCCCCCCCCCCAC4912D2D9DF903EF9888B8A0E4CFF", 16);
      BigInteger var2 = BigInteger.valueOf(10L);
      ECCurve$F2m var3 = new ECCurve$F2m(239, 36, new BigInteger("01238774666A67766D6676F778E676B66999176666E687666D8766C66A9F", 16), new BigInteger("6A941977BA9F6A435199ACFC51067ED587F519C5ECB541B8E44111DE1D40", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("0370F6E9D04D289C4E89913CE3530BFDE903977D42B146D539BF1BDE4E9C92")), var1, var2, (byte[])null);
   }
}
