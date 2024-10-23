package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.signers.DSASigner;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;

public class TlsDSSSigner extends TlsDSASigner {
   public short getSignatureAlgorithm() {
      return 2;
   }

   public boolean isValidPublicKey(AsymmetricKeyParameter var1) {
      return var1 instanceof DSAPublicKeyParameters;
   }

   public DSA createDSAImpl(short var1) {
      return new DSASigner(new HMacDSAKCalculator(TlsUtils.createHash(var1)));
   }
}
