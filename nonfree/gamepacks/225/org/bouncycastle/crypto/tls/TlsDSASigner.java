package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.DSADigestSigner;

public abstract class TlsDSASigner extends AbstractTlsSigner {
   public Signer createSigner(SignatureAndHashAlgorithm var1, AsymmetricKeyParameter var2) {
      return this.makeSigner(var1, false, true, var2);
   }

   public byte[] generateRawSignature(SignatureAndHashAlgorithm var1, AsymmetricKeyParameter var2, byte[] var3) throws CryptoException {
      Signer var4 = this.makeSigner(var1, true, true, new ParametersWithRandom(var2, this.context.getSecureRandom()));
      if (var1 == null) {
         var4.update(var3, 16, 20);
      } else {
         var4.update(var3, 0, var3.length);
      }

      return var4.generateSignature();
   }

   public abstract short getSignatureAlgorithm();

   public Signer createVerifyer(SignatureAndHashAlgorithm var1, AsymmetricKeyParameter var2) {
      return this.makeSigner(var1, false, false, var2);
   }

   public abstract DSA createDSAImpl(short var1);

   public Signer makeSigner(SignatureAndHashAlgorithm var1, boolean var2, boolean var3, CipherParameters var4) {
      if (var1 != null != TlsUtils.isTLSv12(this.context)) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.getSignature() != this.getSignatureAlgorithm()) {
         throw new IllegalStateException();
      } else {
         short var5 = var1 == null ? 2 : var1.getHash();
         Object var6 = var2 ? new NullDigest() : TlsUtils.createHash(var5);
         DSADigestSigner var7 = new DSADigestSigner(this.createDSAImpl(var5), (Digest)var6);
         var7.init(var3, this.makeInitParameters(var3, var4));
         return var7;
      }
   }

   public CipherParameters makeInitParameters(boolean var1, CipherParameters var2) {
      return var2;
   }

   public boolean verifyRawSignature(SignatureAndHashAlgorithm var1, byte[] var2, AsymmetricKeyParameter var3, byte[] var4) throws CryptoException {
      Signer var5 = this.makeSigner(var1, true, false, var3);
      if (var1 == null) {
         var5.update(var4, 16, 20);
      } else {
         var5.update(var4, 0, var4.length);
      }

      return var5.verifySignature(var2);
   }
}
