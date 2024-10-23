package org.bouncycastle.crypto;

public interface AsymmetricBlockCipher {
   int getOutputBlockSize();

   int getInputBlockSize();

   byte[] processBlock(byte[] var1, int var2, int var3) throws InvalidCipherTextException;

   void init(boolean var1, CipherParameters var2);
}
