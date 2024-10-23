package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

class CombinedHash implements TlsHandshakeHash {
   public Digest sha1;
   public TlsContext context;
   public Digest md5;

   CombinedHash() {
      this.md5 = TlsUtils.createHash((short)1);
      this.sha1 = TlsUtils.createHash((short)2);
   }

   public byte[] getFinalHash(short var1) {
      throw new IllegalStateException("CombinedHash doesn't support multiple hashes");
   }

   public void init(TlsContext var1) {
      this.context = var1;
   }

   public int getDigestSize() {
      return this.md5.getDigestSize() + this.sha1.getDigestSize();
   }

   public void trackHashAlgorithm(short var1) {
      throw new IllegalStateException("CombinedHash only supports calculating the legacy PRF for handshake hash");
   }

   CombinedHash(CombinedHash var1) {
      this.context = var1.context;
      this.md5 = TlsUtils.cloneHash((short)1, var1.md5);
      this.sha1 = TlsUtils.cloneHash((short)2, var1.sha1);
   }

   public TlsHandshakeHash stopTracking() {
      return new CombinedHash(this);
   }

   public Digest forkPRFHash() {
      return new CombinedHash(this);
   }

   public TlsHandshakeHash notifyPRFDetermined() {
      return this;
   }

   public String getAlgorithmName() {
      return this.md5.getAlgorithmName() + " and " + this.sha1.getAlgorithmName();
   }

   public void sealHashAlgorithms() {
   }

   public void update(byte var1) {
      this.md5.update(var1);
      this.sha1.update(var1);
   }

   public void update(byte[] var1, int var2, int var3) {
      this.md5.update(var1, var2, var3);
      this.sha1.update(var1, var2, var3);
   }

   public int doFinal(byte[] var1, int var2) {
      if (this.context != null && TlsUtils.isSSL(this.context)) {
         this.ssl3Complete(this.md5, SSL3Mac.IPAD, SSL3Mac.OPAD, 48);
         this.ssl3Complete(this.sha1, SSL3Mac.IPAD, SSL3Mac.OPAD, 40);
      }

      int var3 = this.md5.doFinal(var1, var2);
      int var4 = this.sha1.doFinal(var1, var2 + var3);
      return var3 + var4;
   }

   public void reset() {
      this.md5.reset();
      this.sha1.reset();
   }

   public void ssl3Complete(Digest var1, byte[] var2, byte[] var3, int var4) {
      byte[] var5 = this.context.getSecurityParameters().masterSecret;
      var1.update(var5, 0, var5.length);
      var1.update(var2, 0, var4);
      byte[] var6 = new byte[var1.getDigestSize()];
      var1.doFinal(var6, 0);
      var1.update(var5, 0, var5.length);
      var1.update(var3, 0, var4);
      var1.update(var6, 0, var6.length);
   }
}
