package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.prng.DigestRandomGenerator;
import org.bouncycastle.crypto.prng.RandomGenerator;
import org.bouncycastle.util.Times;

abstract class AbstractTlsContext implements TlsContext {
   RandomGenerator nonceRandom;
   TlsSession session = null;
   static long counter = Times.nanoTime();
   SecurityParameters securityParameters;
   ProtocolVersion clientVersion = null;
   ProtocolVersion serverVersion = null;
   SecureRandom secureRandom;
   Object userObject = null;

   public byte[] exportKeyingMaterial(String var1, byte[] var2, int var3) {
      if (var2 != null && !TlsUtils.isValidUint16(var2.length)) {
         throw new IllegalArgumentException("'context_value' must have length less than 2^16 (or be null)");
      } else {
         SecurityParameters var4 = this.getSecurityParameters();
         byte[] var5 = var4.getClientRandom();
         byte[] var6 = var4.getServerRandom();
         int var7 = var5.length + var6.length;
         if (var2 != null) {
            var7 += 2 + var2.length;
         }

         byte[] var8 = new byte[var7];
         byte var9 = 0;
         System.arraycopy(var5, 0, var8, var9, var5.length);
         int var10 = var9 + var5.length;
         System.arraycopy(var6, 0, var8, var10, var6.length);
         var10 += var6.length;
         if (var2 != null) {
            TlsUtils.writeUint16(var2.length, var8, var10);
            var10 += 2;
            System.arraycopy(var2, 0, var8, var10, var2.length);
            var10 += var2.length;
         }

         if (var10 != var7) {
            throw new IllegalStateException("error in calculation of seed for export");
         } else {
            return TlsUtils.PRF(this, var4.getMasterSecret(), var1, var8, var3);
         }
      }
   }

   AbstractTlsContext(SecureRandom var1, SecurityParameters var2) {
      Digest var3 = TlsUtils.createHash((short)4);
      byte[] var4 = new byte[var3.getDigestSize()];
      var1.nextBytes(var4);
      this.nonceRandom = new DigestRandomGenerator(var3);
      this.nonceRandom.addSeedMaterial(nextCounterValue());
      this.nonceRandom.addSeedMaterial(Times.nanoTime());
      this.nonceRandom.addSeedMaterial(var4);
      this.secureRandom = var1;
      this.securityParameters = var2;
   }

   public TlsSession getResumableSession() {
      return this.session;
   }

   public SecureRandom getSecureRandom() {
      return this.secureRandom;
   }

   static synchronized long nextCounterValue() {
      return ++counter;
   }

   public ProtocolVersion getClientVersion() {
      return this.clientVersion;
   }

   void setClientVersion(ProtocolVersion var1) {
      this.clientVersion = var1;
   }

   public ProtocolVersion getServerVersion() {
      return this.serverVersion;
   }

   void setServerVersion(ProtocolVersion var1) {
      this.serverVersion = var1;
   }

   public Object getUserObject() {
      return this.userObject;
   }

   void setResumableSession(TlsSession var1) {
      this.session = var1;
   }

   public RandomGenerator getNonceRandomGenerator() {
      return this.nonceRandom;
   }

   public void setUserObject(Object var1) {
      this.userObject = var1;
   }

   public SecurityParameters getSecurityParameters() {
      return this.securityParameters;
   }
}
