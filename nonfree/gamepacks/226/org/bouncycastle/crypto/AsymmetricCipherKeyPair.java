package org.bouncycastle.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class AsymmetricCipherKeyPair {
   AsymmetricKeyParameter privateParam;
   AsymmetricKeyParameter publicParam;

   public AsymmetricKeyParameter getPublic() {
      return this.publicParam;
   }

   /** @deprecated */
   public AsymmetricCipherKeyPair(CipherParameters var1, CipherParameters var2) {
      this.publicParam = (AsymmetricKeyParameter)var1;
      this.privateParam = (AsymmetricKeyParameter)var2;
   }

   public AsymmetricKeyParameter getPrivate() {
      return this.privateParam;
   }

   public AsymmetricCipherKeyPair(AsymmetricKeyParameter var1, AsymmetricKeyParameter var2) {
      this.publicParam = var1;
      this.privateParam = var2;
   }
}
