package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public interface BlockCipherPadding {
   int padCount(byte[] var1) throws InvalidCipherTextException;

   void init(SecureRandom var1) throws IllegalArgumentException;

   int addPadding(byte[] var1, int var2);

   String getPaddingName();
}
