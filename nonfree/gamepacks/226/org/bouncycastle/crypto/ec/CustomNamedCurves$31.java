package org.bouncycastle.crypto.ec;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecT571R1Curve;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$31 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      byte[] var1 = Hex.decode("2AA058F73A0E33AB486B0F610410C53A7F132310");
      ECCurve var2 = CustomNamedCurves.access$000(new SecT571R1Curve());
      X9ECPoint var3 = new X9ECPoint(var2, Hex.decode("040303001D34B856296C16C0D40D3CD7750A93D1D2955FA80AA5F40FC8DB7B2ABDBDE53950F4C0D293CDD711A35B67FB1499AE60038614F1394ABFA3B4C850D927E1E7769C8EEC2D19037BF27342DA639B6DCCFFFEB73D69D78C6C27A6009CBBCA1980F8533921E8A684423E43BAB08A576291AF8F461BB2A8B3531D2F0485C19B16E2F1516E23DD3C1A4827AF1B8AC15B"));
      return new X9ECParameters(var2, var3, var2.getOrder(), var2.getCofactor(), var1);
   }
}
