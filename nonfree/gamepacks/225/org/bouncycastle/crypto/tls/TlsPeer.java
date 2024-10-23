package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsPeer {
   TlsCompression getCompression() throws IOException;

   void notifySecureRenegotiation(boolean var1) throws IOException;

   boolean shouldUseGMTUnixTime();

   TlsCipher getCipher() throws IOException;

   void notifyAlertRaised(short var1, short var2, String var3, Throwable var4);

   void notifyAlertReceived(short var1, short var2);

   void notifyHandshakeComplete() throws IOException;
}
