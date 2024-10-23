package org.bouncycastle.crypto;

public interface Signer {
   byte[] generateSignature() throws CryptoException, DataLengthException;

   void update(byte var1);

   void update(byte[] var1, int var2, int var3);

   boolean verifySignature(byte[] var1);

   void init(boolean var1, CipherParameters var2);

   void reset();
}
