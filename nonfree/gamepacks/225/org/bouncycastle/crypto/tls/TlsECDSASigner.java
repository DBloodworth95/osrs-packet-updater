package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;

public class TlsECDSASigner extends TlsDSASigner {
   public DSA createDSAImpl(short var1) {
      return new ECDSASigner(new HMacDSAKCalculator(TlsUtils.createHash(var1)));
   }

   public boolean isValidPublicKey(AsymmetricKeyParameter var1) {
      return var1 instanceof ECPublicKeyParameters;
   }

   public short getSignatureAlgorithm() {
      return 3;
   }
}
