package org.bouncycastle.crypto;

public interface SkippingCipher {
   long getPosition();

   long skip(long var1);

   long seekTo(long var1);
}
