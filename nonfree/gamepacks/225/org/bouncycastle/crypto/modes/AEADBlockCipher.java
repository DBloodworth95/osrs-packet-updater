package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

public interface AEADBlockCipher {
   int getUpdateOutputSize(int var1);

   String getAlgorithmName();

   int processByte(byte var1, byte[] var2, int var3) throws DataLengthException;

   int doFinal(byte[] var1, int var2) throws IllegalStateException, InvalidCipherTextException;

   void processAADBytes(byte[] var1, int var2, int var3);

   BlockCipher getUnderlyingCipher();

   int processBytes(byte[] var1, int var2, int var3, byte[] var4, int var5) throws DataLengthException;

   void init(boolean var1, CipherParameters var2) throws IllegalArgumentException;

   byte[] getMac();

   int getOutputSize(int var1);

   void processAADByte(byte var1);

   void reset();
}
