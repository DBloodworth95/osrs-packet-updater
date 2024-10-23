package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsAuthentication {
   void aw(Certificate var1) throws IOException;

   TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException;

   void ap(Certificate var1) throws IOException;

   void notifyServerCertificate(Certificate var1) throws IOException;

   TlsCredentials ak(CertificateRequest var1) throws IOException;

   TlsCredentials aj(CertificateRequest var1) throws IOException;
}
