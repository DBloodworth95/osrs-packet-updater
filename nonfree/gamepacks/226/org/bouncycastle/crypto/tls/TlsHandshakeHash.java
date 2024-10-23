package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {
   void sealHashAlgorithms();

   TlsHandshakeHash notifyPRFDetermined();

   void trackHashAlgorithm(short var1);

   Digest forkPRFHash();

   TlsHandshakeHash stopTracking();

   void init(TlsContext var1);

   byte[] getFinalHash(short var1);
}
