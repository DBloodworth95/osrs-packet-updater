package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface TlsKeyExchange {
   byte[] generateServerKeyExchange() throws IOException;

   void skipClientCredentials() throws IOException;

   void processServerCredentials(TlsCredentials var1) throws IOException;

   void processServerKeyExchange(InputStream var1) throws IOException;

   void skipServerKeyExchange() throws IOException;

   boolean requiresServerKeyExchange();

   byte[] generatePremasterSecret() throws IOException;

   void skipServerCredentials() throws IOException;

   void validateCertificateRequest(CertificateRequest var1) throws IOException;

   void init(TlsContext var1);

   void processClientCredentials(TlsCredentials var1) throws IOException;

   void processClientCertificate(Certificate var1) throws IOException;

   void generateClientKeyExchange(OutputStream var1) throws IOException;

   void processClientKeyExchange(InputStream var1) throws IOException;

   void processServerCertificate(Certificate var1) throws IOException;
}
