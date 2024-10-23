package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsSignerCredentials extends TlsCredentials {
   SignatureAndHashAlgorithm getSignatureAndHashAlgorithm();

   byte[] generateCertificateSignature(byte[] var1) throws IOException;
}
