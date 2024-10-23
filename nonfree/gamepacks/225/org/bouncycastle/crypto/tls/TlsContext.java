package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {
   ProtocolVersion getServerVersion();

   SecureRandom getSecureRandom();

   Object getUserObject();

   boolean isServer();

   RandomGenerator getNonceRandomGenerator();

   SecurityParameters getSecurityParameters();

   TlsSession getResumableSession();

   ProtocolVersion getClientVersion();

   void setUserObject(Object var1);

   byte[] exportKeyingMaterial(String var1, byte[] var2, int var3);
}
