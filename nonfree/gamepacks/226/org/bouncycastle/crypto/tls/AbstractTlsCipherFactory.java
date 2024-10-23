package org.bouncycastle.crypto.tls;

import java.io.IOException;

public class AbstractTlsCipherFactory implements TlsCipherFactory {
   public TlsCipher createCipher(TlsContext var1, int var2, int var3) throws IOException {
      throw new TlsFatalAlert((short)80);
   }
}
