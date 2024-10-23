package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

public class TlsStreamCipher implements TlsCipher {
   public StreamCipher encryptCipher;
   public boolean usesNonce;
   public StreamCipher decryptCipher;
   public TlsMac writeMac;
   public TlsMac readMac;
   public TlsContext context;

   public byte[] encodePlaintext(long var1, short var3, byte[] var4, int var5, int var6) {
      if (this.usesNonce) {
         this.updateIV(this.encryptCipher, true, var1);
      }

      byte[] var7 = new byte[var6 + this.writeMac.getSize()];
      this.encryptCipher.processBytes(var4, var5, var6, var7, 0);
      byte[] var8 = this.writeMac.calculateMac(var1, var3, var4, var5, var6);
      this.encryptCipher.processBytes(var8, 0, var8.length, var7, var6);
      return var7;
   }

   public byte[] decodeCiphertext(long var1, short var3, byte[] var4, int var5, int var6) throws IOException {
      if (this.usesNonce) {
         this.updateIV(this.decryptCipher, false, var1);
      }

      int var7 = this.readMac.getSize();
      if (var6 < var7) {
         throw new TlsFatalAlert((short)50);
      } else {
         int var8 = var6 - var7;
         byte[] var9 = new byte[var6];
         this.decryptCipher.processBytes(var4, var5, var6, var9, 0);
         this.checkMAC(var1, var3, var9, var8, var6, var9, 0, var8);
         return Arrays.copyOfRange((byte[])var9, 0, var8);
      }
   }

   public int getPlaintextLimit(int var1) {
      return var1 - this.writeMac.getSize();
   }

   public TlsStreamCipher(TlsContext var1, StreamCipher var2, StreamCipher var3, Digest var4, Digest var5, int var6, boolean var7) throws IOException {
      boolean var8 = var1.isServer();
      this.context = var1;
      this.usesNonce = var7;
      this.encryptCipher = var2;
      this.decryptCipher = var3;
      int var9 = 2 * var6 + var4.getDigestSize() + var5.getDigestSize();
      byte[] var10 = TlsUtils.calculateKeyBlock(var1, var9);
      byte var11 = 0;
      TlsMac var12 = new TlsMac(var1, var4, var10, var11, var4.getDigestSize());
      int var19 = var11 + var4.getDigestSize();
      TlsMac var13 = new TlsMac(var1, var5, var10, var19, var5.getDigestSize());
      var19 += var5.getDigestSize();
      KeyParameter var14 = new KeyParameter(var10, var19, var6);
      var19 += var6;
      KeyParameter var15 = new KeyParameter(var10, var19, var6);
      var19 += var6;
      if (var19 != var9) {
         throw new TlsFatalAlert((short)80);
      } else {
         Object var16;
         Object var17;
         if (var8) {
            this.writeMac = var13;
            this.readMac = var12;
            this.encryptCipher = var3;
            this.decryptCipher = var2;
            var16 = var15;
            var17 = var14;
         } else {
            this.writeMac = var12;
            this.readMac = var13;
            this.encryptCipher = var2;
            this.decryptCipher = var3;
            var16 = var14;
            var17 = var15;
         }

         if (var7) {
            byte[] var18 = new byte[8];
            var16 = new ParametersWithIV((CipherParameters)var16, var18);
            var17 = new ParametersWithIV((CipherParameters)var17, var18);
         }

         this.encryptCipher.init(true, (CipherParameters)var16);
         this.decryptCipher.init(false, (CipherParameters)var17);
      }
   }

   public void checkMAC(long var1, short var3, byte[] var4, int var5, int var6, byte[] var7, int var8, int var9) throws IOException {
      byte[] var10 = Arrays.copyOfRange(var4, var5, var6);
      byte[] var11 = this.readMac.calculateMac(var1, var3, var7, var8, var9);
      if (!Arrays.constantTimeAreEqual(var10, var11)) {
         throw new TlsFatalAlert((short)20);
      }
   }

   public void updateIV(StreamCipher var1, boolean var2, long var3) {
      byte[] var5 = new byte[8];
      TlsUtils.writeUint64(var3, var5, 0);
      var1.init(var2, new ParametersWithIV((CipherParameters)null, var5));
   }
}
