package org.bouncycastle.crypto;

import java.math.BigInteger;

public interface DSA {
   BigInteger[] generateSignature(byte[] var1);

   boolean verifySignature(byte[] var1, BigInteger var2, BigInteger var3);

   void init(boolean var1, CipherParameters var2);
}
