package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface TlsKeyExchange {
   void processClientCertificate(Certificate var1) throws IOException;

   void skipServerCredentials() throws IOException;

   byte[] generatePremasterSecret() throws IOException;

   void processServerCertificate(Certificate var1) throws IOException;

   byte[] generateServerKeyExchange() throws IOException;

   boolean requiresServerKeyExchange();

   void skipServerKeyExchange() throws IOException;

   void processServerKeyExchange(InputStream var1) throws IOException;

   void validateCertificateRequest(CertificateRequest var1) throws IOException;

   void skipClientCredentials() throws IOException;

   void processClientCredentials(TlsCredentials var1) throws IOException;

   void init(TlsContext var1);

   void generateClientKeyExchange(OutputStream var1) throws IOException;

   void processClientKeyExchange(InputStream var1) throws IOException;

   void processServerCredentials(TlsCredentials var1) throws IOException;
}
