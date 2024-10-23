package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsCipherFactory {
   TlsCipher createCipher(TlsContext var1, int var2, int var3) throws IOException;
}
