package org.bouncycastle.crypto;

public interface Digest {
   void update(byte[] var1, int var2, int var3);

   int getDigestSize();

   String getAlgorithmName();

   void update(byte var1);

   int doFinal(byte[] var1, int var2);

   void reset();
}
