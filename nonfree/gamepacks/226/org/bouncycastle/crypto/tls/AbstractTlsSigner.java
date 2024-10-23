package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public abstract class AbstractTlsSigner implements TlsSigner {
   public TlsContext context;

   public Signer createVerifyer(AsymmetricKeyParameter var1) {
      return this.createVerifyer((SignatureAndHashAlgorithm)null, var1);
   }

   public void init(TlsContext var1) {
      this.context = var1;
   }

   public boolean verifyRawSignature(byte[] var1, AsymmetricKeyParameter var2, byte[] var3) throws CryptoException {
      return this.verifyRawSignature((SignatureAndHashAlgorithm)null, var1, var2, var3);
   }

   public byte[] generateRawSignature(AsymmetricKeyParameter var1, byte[] var2) throws CryptoException {
      return this.generateRawSignature((SignatureAndHashAlgorithm)null, var1, var2);
   }

   public Signer createSigner(AsymmetricKeyParameter var1) {
      return this.createSigner((SignatureAndHashAlgorithm)null, var1);
   }
}
