package org.bouncycastle.crypto;

public interface Digest {
   int getDigestSize();

   int doFinal(byte[] var1, int var2);

   void update(byte var1);

   void update(byte[] var1, int var2, int var3);

   void reset();

   String getAlgorithmName();
}
