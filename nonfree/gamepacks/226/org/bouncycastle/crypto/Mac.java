package org.bouncycastle.crypto;

public interface Mac {
   int getMacSize();

   String getAlgorithmName();

   void update(byte var1) throws IllegalStateException;

   void init(CipherParameters var1) throws IllegalArgumentException;

   void update(byte[] var1, int var2, int var3) throws DataLengthException, IllegalStateException;

   int doFinal(byte[] var1, int var2) throws DataLengthException, IllegalStateException;

   void reset();
}
