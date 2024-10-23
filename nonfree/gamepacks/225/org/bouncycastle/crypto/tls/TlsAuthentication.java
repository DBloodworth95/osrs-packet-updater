package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsAuthentication {
   void ac(Certificate var1) throws IOException;

   void ag(Certificate var1) throws IOException;

   void notifyServerCertificate(Certificate var1) throws IOException;

   void ae(Certificate var1) throws IOException;

   TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException;

   TlsCredentials am(CertificateRequest var1) throws IOException;

   TlsCredentials ax(CertificateRequest var1) throws IOException;
}
