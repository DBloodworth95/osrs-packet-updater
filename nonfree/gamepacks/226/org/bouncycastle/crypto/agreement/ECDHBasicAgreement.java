package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECPoint;

public class ECDHBasicAgreement implements BasicAgreement {
   ECPrivateKeyParameters key;

   public int getFieldSize() {
      return (this.key.getParameters().getCurve().getFieldSize() + 7) / 8;
   }

   public void init(CipherParameters var1) {
      this.key = (ECPrivateKeyParameters)var1;
   }

   public BigInteger calculateAgreement(CipherParameters var1) {
      ECPublicKeyParameters var2 = (ECPublicKeyParameters)var1;
      if (!var2.getParameters().equals(this.key.getParameters())) {
         throw new IllegalStateException("ECDH public key has wrong domain parameters");
      } else {
         ECPoint var3 = var2.getQ().multiply(this.key.getD()).normalize();
         if (var3.isInfinity()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECDH");
         } else {
            return var3.getAffineXCoord().toBigInteger();
         }
      }
   }
}
