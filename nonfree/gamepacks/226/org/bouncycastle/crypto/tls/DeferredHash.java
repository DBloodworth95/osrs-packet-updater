package org.bouncycastle.crypto.tls;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Shorts;

class DeferredHash implements TlsHandshakeHash {
   public TlsContext context;
   Short prfHashAlgorithm;
   DigestInputBuffer buf;
   public static final int BUFFERING_HASH_LIMIT = 4;
   Hashtable hashes;

   public void reset() {
      if (this.buf != null) {
         this.buf.reset();
      } else {
         Enumeration var1 = this.hashes.elements();

         while(var1.hasMoreElements()) {
            Digest var2 = (Digest)var1.nextElement();
            var2.reset();
         }

      }
   }

   DeferredHash(Short var1, Digest var2) {
      this.buf = null;
      this.hashes = new Hashtable();
      this.prfHashAlgorithm = var1;
      this.hashes.put(var1, var2);
   }

   public void init(TlsContext var1) {
      this.context = var1;
   }

   public TlsHandshakeHash notifyPRFDetermined() {
      int var1 = this.context.getSecurityParameters().getPrfAlgorithm();
      if (var1 == 0) {
         CombinedHash var2 = new CombinedHash();
         var2.init(this.context);
         this.buf.updateDigest(var2);
         return var2.notifyPRFDetermined();
      } else {
         this.prfHashAlgorithm = Shorts.valueOf(TlsUtils.getHashAlgorithmForPRFAlgorithm(var1));
         this.checkTrackingHash(this.prfHashAlgorithm);
         return this;
      }
   }

   public void checkTrackingHash(Short var1) {
      if (!this.hashes.containsKey(var1)) {
         Digest var2 = TlsUtils.createHash(var1);
         this.hashes.put(var1, var2);
      }

   }

   DeferredHash() {
      this.buf = new DigestInputBuffer();
      this.hashes = new Hashtable();
      this.prfHashAlgorithm = null;
   }

   public TlsHandshakeHash stopTracking() {
      Digest var1 = TlsUtils.cloneHash(this.prfHashAlgorithm, (Digest)this.hashes.get(this.prfHashAlgorithm));
      if (this.buf != null) {
         this.buf.updateDigest(var1);
      }

      DeferredHash var2 = new DeferredHash(this.prfHashAlgorithm, var1);
      var2.init(this.context);
      return var2;
   }

   public Digest forkPRFHash() {
      this.checkStopBuffering();
      if (this.buf != null) {
         Digest var1 = TlsUtils.createHash(this.prfHashAlgorithm);
         this.buf.updateDigest(var1);
         return var1;
      } else {
         return TlsUtils.cloneHash(this.prfHashAlgorithm, (Digest)this.hashes.get(this.prfHashAlgorithm));
      }
   }

   public byte[] getFinalHash(short var1) {
      Digest var2 = (Digest)this.hashes.get(Shorts.valueOf(var1));
      if (var2 == null) {
         throw new IllegalStateException("HashAlgorithm." + HashAlgorithm.getText(var1) + " is not being tracked");
      } else {
         var2 = TlsUtils.cloneHash(var1, var2);
         if (this.buf != null) {
            this.buf.updateDigest(var2);
         }

         byte[] var3 = new byte[var2.getDigestSize()];
         var2.doFinal(var3, 0);
         return var3;
      }
   }

   public String getAlgorithmName() {
      throw new IllegalStateException("Use fork() to get a definite Digest");
   }

   public int getDigestSize() {
      throw new IllegalStateException("Use fork() to get a definite Digest");
   }

   public void update(byte var1) {
      if (this.buf != null) {
         this.buf.write(var1);
      } else {
         Enumeration var2 = this.hashes.elements();

         while(var2.hasMoreElements()) {
            Digest var3 = (Digest)var2.nextElement();
            var3.update(var1);
         }

      }
   }

   public void update(byte[] var1, int var2, int var3) {
      if (this.buf != null) {
         this.buf.write(var1, var2, var3);
      } else {
         Enumeration var4 = this.hashes.elements();

         while(var4.hasMoreElements()) {
            Digest var5 = (Digest)var4.nextElement();
            var5.update(var1, var2, var3);
         }

      }
   }

   public int doFinal(byte[] var1, int var2) {
      throw new IllegalStateException("Use fork() to get a definite Digest");
   }

   public void sealHashAlgorithms() {
      this.checkStopBuffering();
   }

   public void checkStopBuffering() {
      if (this.buf != null && this.hashes.size() <= 4) {
         Enumeration var1 = this.hashes.elements();

         while(var1.hasMoreElements()) {
            Digest var2 = (Digest)var1.nextElement();
            this.buf.updateDigest(var2);
         }

         this.buf = null;
      }

   }

   public void trackHashAlgorithm(short var1) {
      if (this.buf == null) {
         throw new IllegalStateException("Too late to track more hash algorithms");
      } else {
         this.checkTrackingHash(Shorts.valueOf(var1));
      }
   }
}
