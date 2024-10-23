package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;

public final class SessionParameters$Builder {
   byte[] srpIdentity = null;
   short compressionAlgorithm = -1;
   byte[] masterSecret = null;
   Certificate peerCertificate = null;
   byte[] pskIdentity = null;
   int cipherSuite = -1;
   byte[] encodedServerExtensions = null;

   public SessionParameters$Builder setCipherSuite(int var1) {
      this.cipherSuite = var1;
      return this;
   }

   public SessionParameters$Builder setCompressionAlgorithm(short var1) {
      this.compressionAlgorithm = var1;
      return this;
   }

   public SessionParameters build() {
      this.validate(this.cipherSuite >= 0, "cipherSuite");
      this.validate(this.compressionAlgorithm >= 0, "compressionAlgorithm");
      this.validate(this.masterSecret != null, "masterSecret");
      return new SessionParameters(this.cipherSuite, this.compressionAlgorithm, this.masterSecret, this.peerCertificate, this.pskIdentity, this.srpIdentity, this.encodedServerExtensions, (SessionParameters$1)null);
   }

   public SessionParameters$Builder setMasterSecret(byte[] var1) {
      this.masterSecret = var1;
      return this;
   }

   public SessionParameters$Builder setPeerCertificate(Certificate var1) {
      this.peerCertificate = var1;
      return this;
   }

   /** @deprecated */
   public SessionParameters$Builder setPskIdentity(byte[] var1) {
      this.pskIdentity = var1;
      return this;
   }

   public SessionParameters$Builder setPSKIdentity(byte[] var1) {
      this.pskIdentity = var1;
      return this;
   }

   public SessionParameters$Builder setSRPIdentity(byte[] var1) {
      this.srpIdentity = var1;
      return this;
   }

   public SessionParameters$Builder setServerExtensions(Hashtable var1) throws IOException {
      if (var1 == null) {
         this.encodedServerExtensions = null;
      } else {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         TlsProtocol.writeExtensions(var2, var1);
         this.encodedServerExtensions = var2.toByteArray();
      }

      return this;
   }

   void validate(boolean var1, String var2) {
      if (!var1) {
         throw new IllegalStateException("Required session parameter '" + var2 + "' not configured");
      }
   }
}
