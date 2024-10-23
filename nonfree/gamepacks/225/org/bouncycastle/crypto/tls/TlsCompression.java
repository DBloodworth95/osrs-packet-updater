package org.bouncycastle.crypto.tls;

import java.io.OutputStream;

public interface TlsCompression {
   OutputStream decompress(OutputStream var1);

   OutputStream compress(OutputStream var1);
}
