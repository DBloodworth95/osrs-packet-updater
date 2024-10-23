package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.LongDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

public class TlsMac {
   public TlsContext context;
   public Mac mac;
   public byte[] secret;
   public int digestBlockSize;
   public int digestOverhead;
   public int macLength;

   public byte[] truncate(byte[] var1) {
      return var1.length <= this.macLength ? var1 : Arrays.copyOf(var1, this.macLength);
   }

   public TlsMac(TlsContext var1, Digest var2, byte[] var3, int var4, int var5) {
      this.context = var1;
      KeyParameter var6 = new KeyParameter(var3, var4, var5);
      this.secret = Arrays.clone(var6.getKey());
      if (var2 instanceof LongDigest) {
         this.digestBlockSize = 128;
         this.digestOverhead = 16;
      } else {
         this.digestBlockSize = 64;
         this.digestOverhead = 8;
      }

      if (TlsUtils.isSSL(var1)) {
         this.mac = new SSL3Mac(var2);
         if (var2.getDigestSize() == 20) {
            this.digestOverhead = 4;
         }
      } else {
         this.mac = new HMac(var2);
      }

      this.mac.init(var6);
      this.macLength = this.mac.getMacSize();
      if (var1.getSecurityParameters().truncatedHMac) {
         this.macLength = Math.min(this.macLength, 10);
      }

   }

   public int getSize() {
      return this.macLength;
   }

   public byte[] calculateMac(long var1, short var3, byte[] var4, int var5, int var6) {
      ProtocolVersion var7 = this.context.getServerVersion();
      boolean var8 = var7.isSSL();
      byte[] var9 = new byte[var8 ? 11 : 13];
      TlsUtils.writeUint64(var1, var9, 0);
      TlsUtils.writeUint8((short)var3, var9, 8);
      if (!var8) {
         TlsUtils.writeVersion(var7, var9, 9);
      }

      TlsUtils.writeUint16(var6, var9, var9.length - 2);
      this.mac.update(var9, 0, var9.length);
      this.mac.update(var4, var5, var6);
      byte[] var10 = new byte[this.mac.getMacSize()];
      this.mac.doFinal(var10, 0);
      return this.truncate(var10);
   }

   public byte[] calculateMacConstantTime(long var1, short var3, byte[] var4, int var5, int var6, int var7, byte[] var8) {
      byte[] var9 = this.calculateMac(var1, var3, var4, var5, var6);
      int var10 = TlsUtils.isSSL(this.context) ? 11 : 13;
      int var11 = this.getDigestBlockCount(var10 + var7) - this.getDigestBlockCount(var10 + var6);

      while(true) {
         --var11;
         if (var11 < 0) {
            this.mac.update(var8[0]);
            this.mac.reset();
            return var9;
         }

         this.mac.update(var8, 0, this.digestBlockSize);
      }
   }

   public int getDigestBlockCount(int var1) {
      return (var1 + this.digestOverhead) / this.digestBlockSize;
   }

   public byte[] getMACSecret() {
      return this.secret;
   }
}
