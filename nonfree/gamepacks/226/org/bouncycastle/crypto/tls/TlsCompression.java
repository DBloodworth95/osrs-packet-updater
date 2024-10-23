package org.bouncycastle.crypto.tls;

import java.io.OutputStream;

public interface TlsCompression {
   OutputStream compress(OutputStream var1);

   OutputStream decompress(OutputStream var1);
}
