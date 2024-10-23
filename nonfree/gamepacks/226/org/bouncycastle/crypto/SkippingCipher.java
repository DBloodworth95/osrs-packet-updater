package org.bouncycastle.crypto;

public interface SkippingCipher {
   long seekTo(long var1);

   long skip(long var1);

   long getPosition();
}
