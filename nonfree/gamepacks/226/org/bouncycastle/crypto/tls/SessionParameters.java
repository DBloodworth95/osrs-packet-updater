package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.util.Arrays;

public final class SessionParameters {
   int cipherSuite;
   Certificate peerCertificate;
   byte[] masterSecret;
   byte[] encodedServerExtensions;
   byte[] pskIdentity;
   byte[] srpIdentity;
   short compressionAlgorithm;

   public byte[] getMasterSecret() {
      return this.masterSecret;
   }

   public void clear() {
      if (this.masterSecret != null) {
         Arrays.fill((byte[])this.masterSecret, (byte)0);
      }

   }

   public SessionParameters copy() {
      return new SessionParameters(this.cipherSuite, this.compressionAlgorithm, this.masterSecret, this.peerCertificate, this.pskIdentity, this.srpIdentity, this.encodedServerExtensions);
   }

   SessionParameters(int var1, short var2, byte[] var3, Certificate var4, byte[] var5, byte[] var6, byte[] var7) {
      this.pskIdentity = null;
      this.srpIdentity = null;
      this.cipherSuite = var1;
      this.compressionAlgorithm = var2;
      this.masterSecret = Arrays.clone(var3);
      this.peerCertificate = var4;
      this.pskIdentity = Arrays.clone(var5);
      this.srpIdentity = Arrays.clone(var6);
      this.encodedServerExtensions = var7;
   }

   public int getCipherSuite() {
      return this.cipherSuite;
   }

   /** @deprecated */
   public byte[] getPskIdentity() {
      return this.pskIdentity;
   }

   public Certificate getPeerCertificate() {
      return this.peerCertificate;
   }

   public byte[] getSRPIdentity() {
      return this.srpIdentity;
   }

   public byte[] getPSKIdentity() {
      return this.pskIdentity;
   }

   public short getCompressionAlgorithm() {
      return this.compressionAlgorithm;
   }

   public Hashtable readServerExtensions() throws IOException {
      if (this.encodedServerExtensions == null) {
         return null;
      } else {
         ByteArrayInputStream var1 = new ByteArrayInputStream(this.encodedServerExtensions);
         return TlsProtocol.readExtensions(var1);
      }
   }

   // $FF: synthetic method
   SessionParameters(int var1, short var2, byte[] var3, Certificate var4, byte[] var5, byte[] var6, byte[] var7, SessionParameters$1 var8) {
      this(var1, var2, var3, var4, var5, var6, var7);
   }
}
