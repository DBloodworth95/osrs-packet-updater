package org.bouncycastle.crypto.params;

public class ECKeyParameters extends AsymmetricKeyParameter {
   ECDomainParameters params;

   public ECKeyParameters(boolean var1, ECDomainParameters var2) {
      super(var1);
      this.params = var2;
   }

   public ECDomainParameters getParameters() {
      return this.params;
   }
}
