package org.bouncycastle.crypto.ec;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.djb.Curve25519;
import org.bouncycastle.util.encoders.Hex;

final class CustomNamedCurves$1 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      Object var1 = null;
      ECCurve var2 = CustomNamedCurves.access$000(new Curve25519());
      X9ECPoint var3 = new X9ECPoint(var2, Hex.decode("042AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD245A20AE19A1B8A086B4E01EDD2C7748D14C923D4D7E6D7C61B229E9C5A27ECED3D9"));
      return new X9ECParameters(var2, var3, var2.getOrder(), var2.getCofactor(), (byte[])var1);
   }
}
