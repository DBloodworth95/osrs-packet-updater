package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.GenericSigner;
import org.bouncycastle.crypto.signers.RSADigestSigner;

public class TlsRSASigner extends AbstractTlsSigner {
   public boolean verifyRawSignature(SignatureAndHashAlgorithm var1, byte[] var2, AsymmetricKeyParameter var3, byte[] var4) throws CryptoException {
      Signer var5 = this.makeSigner(var1, true, false, var3);
      var5.update(var4, 0, var4.length);
      return var5.verifySignature(var2);
   }

   public byte[] generateRawSignature(SignatureAndHashAlgorithm var1, AsymmetricKeyParameter var2, byte[] var3) throws CryptoException {
      Signer var4 = this.makeSigner(var1, true, true, new ParametersWithRandom(var2, this.context.getSecureRandom()));
      var4.update(var3, 0, var3.length);
      return var4.generateSignature();
   }

   public Signer createVerifyer(SignatureAndHashAlgorithm var1, AsymmetricKeyParameter var2) {
      return this.makeSigner(var1, false, false, var2);
   }

   public Signer createSigner(SignatureAndHashAlgorithm var1, AsymmetricKeyParameter var2) {
      return this.makeSigner(var1, false, true, new ParametersWithRandom(var2, this.context.getSecureRandom()));
   }

   public boolean isValidPublicKey(AsymmetricKeyParameter var1) {
      return var1 instanceof RSAKeyParameters && !var1.isPrivate();
   }

   public Signer makeSigner(SignatureAndHashAlgorithm var1, boolean var2, boolean var3, CipherParameters var4) {
      if (var1 != null != TlsUtils.isTLSv12(this.context)) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.getSignature() != 1) {
         throw new IllegalStateException();
      } else {
         Object var5;
         if (var2) {
            var5 = new NullDigest();
         } else if (var1 == null) {
            var5 = new CombinedHash();
         } else {
            var5 = TlsUtils.createHash(var1.getHash());
         }

         Object var6;
         if (var1 != null) {
            var6 = new RSADigestSigner((Digest)var5, TlsUtils.getOIDForHashAlgorithm(var1.getHash()));
         } else {
            var6 = new GenericSigner(this.createRSAImpl(), (Digest)var5);
         }

         ((Signer)var6).init(var3, var4);
         return (Signer)var6;
      }
   }

   public AsymmetricBlockCipher createRSAImpl() {
      return new PKCS1Encoding(new RSABlindedEngine());
   }
}
