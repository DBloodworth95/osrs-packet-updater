package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class ECKeyGenerationParameters extends KeyGenerationParameters {
   ECDomainParameters domainParams;

   public ECDomainParameters getDomainParameters() {
      return this.domainParams;
   }

   public ECKeyGenerationParameters(ECDomainParameters var1, SecureRandom var2) {
      super(var2, var1.getN().bitLength());
      this.domainParams = var1;
   }
}
