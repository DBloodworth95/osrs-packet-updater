package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class ECPrivateKeyParameters extends ECKeyParameters {
   BigInteger d;

   public ECPrivateKeyParameters(BigInteger var1, ECDomainParameters var2) {
      super(true, var2);
      this.d = var1;
   }

   public BigInteger getD() {
      return this.d;
   }
}
