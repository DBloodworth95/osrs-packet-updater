package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {
   Object getUserObject();

   SecureRandom getSecureRandom();

   ProtocolVersion getServerVersion();

   TlsSession getResumableSession();

   ProtocolVersion getClientVersion();

   boolean isServer();

   RandomGenerator getNonceRandomGenerator();

   void setUserObject(Object var1);

   SecurityParameters getSecurityParameters();

   byte[] exportKeyingMaterial(String var1, byte[] var2, int var3);
}
