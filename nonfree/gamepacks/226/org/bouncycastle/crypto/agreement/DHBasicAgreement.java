package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class DHBasicAgreement implements BasicAgreement {
   DHParameters dhParams;
   DHPrivateKeyParameters key;
   static final BigInteger ONE = BigInteger.valueOf(1L);

   public void init(CipherParameters var1) {
      AsymmetricKeyParameter var2;
      if (var1 instanceof ParametersWithRandom) {
         ParametersWithRandom var3 = (ParametersWithRandom)var1;
         var2 = (AsymmetricKeyParameter)var3.getParameters();
      } else {
         var2 = (AsymmetricKeyParameter)var1;
      }

      if (!(var2 instanceof DHPrivateKeyParameters)) {
         throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
      } else {
         this.key = (DHPrivateKeyParameters)var2;
         this.dhParams = this.key.getParameters();
      }
   }

   public int getFieldSize() {
      return (this.key.getParameters().getP().bitLength() + 7) / 8;
   }

   public BigInteger calculateAgreement(CipherParameters var1) {
      DHPublicKeyParameters var2 = (DHPublicKeyParameters)var1;
      if (!var2.getParameters().equals(this.dhParams)) {
         throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
      } else {
         BigInteger var3 = var2.getY().modPow(this.key.getX(), this.dhParams.getP());
         if (var3.compareTo(ONE) == 0) {
            throw new IllegalStateException("Shared key can't be 1");
         } else {
            return var3;
         }
      }
   }
}
