package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DSAPrivateKeyParameters extends DSAKeyParameters {
   BigInteger x;

   public BigInteger getX() {
      return this.x;
   }

   public DSAPrivateKeyParameters(BigInteger var1, DSAParameters var2) {
      super(true, var2);
      this.x = var1;
   }
}
