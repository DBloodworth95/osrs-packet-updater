package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsCipher {
   byte[] decodeCiphertext(long var1, short var3, byte[] var4, int var5, int var6) throws IOException;

   int getPlaintextLimit(int var1);

   byte[] encodePlaintext(long var1, short var3, byte[] var4, int var5, int var6) throws IOException;
}
