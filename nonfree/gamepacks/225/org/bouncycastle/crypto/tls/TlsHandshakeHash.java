package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {
   void init(TlsContext var1);

   void trackHashAlgorithm(short var1);

   TlsHandshakeHash notifyPRFDetermined();

   void sealHashAlgorithms();

   TlsHandshakeHash stopTracking();

   Digest forkPRFHash();

   byte[] getFinalHash(short var1);
}
