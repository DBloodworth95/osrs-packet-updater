package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;

public interface DSAKCalculator {
   BigInteger nextK();

   boolean isDeterministic();

   void init(BigInteger var1, BigInteger var2, byte[] var3);

   void init(BigInteger var1, SecureRandom var2);
}
