package org.bouncycastle.crypto;

public interface AsymmetricBlockCipher {
   int getOutputBlockSize();

   int getInputBlockSize();

   void init(boolean var1, CipherParameters var2);

   byte[] processBlock(byte[] var1, int var2, int var3) throws InvalidCipherTextException;
}
