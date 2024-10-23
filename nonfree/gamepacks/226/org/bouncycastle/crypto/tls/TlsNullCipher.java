package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;

public class TlsNullCipher implements TlsCipher {
   public TlsMac readMac;
   public TlsMac writeMac;
   public TlsContext context;

   public TlsNullCipher(TlsContext var1, Digest var2, Digest var3) throws IOException {
      if (var2 == null != (var3 == null)) {
         throw new TlsFatalAlert((short)80);
      } else {
         this.context = var1;
         TlsMac var4 = null;
         TlsMac var5 = null;
         if (var2 != null) {
            int var6 = var2.getDigestSize() + var3.getDigestSize();
            byte[] var7 = TlsUtils.calculateKeyBlock(var1, var6);
            byte var8 = 0;
            var4 = new TlsMac(var1, var2, var7, var8, var2.getDigestSize());
            int var9 = var8 + var2.getDigestSize();
            var5 = new TlsMac(var1, var3, var7, var9, var3.getDigestSize());
            var9 += var3.getDigestSize();
            if (var9 != var6) {
               throw new TlsFatalAlert((short)80);
            }
         }

         if (var1.isServer()) {
            this.writeMac = var5;
            this.readMac = var4;
         } else {
            this.writeMac = var4;
            this.readMac = var5;
         }

      }
   }

   public byte[] decodeCiphertext(long var1, short var3, byte[] var4, int var5, int var6) throws IOException {
      if (this.readMac == null) {
         return Arrays.copyOfRange(var4, var5, var5 + var6);
      } else {
         int var7 = this.readMac.getSize();
         if (var6 < var7) {
            throw new TlsFatalAlert((short)50);
         } else {
            int var8 = var6 - var7;
            byte[] var9 = Arrays.copyOfRange(var4, var5 + var8, var5 + var6);
            byte[] var10 = this.readMac.calculateMac(var1, var3, var4, var5, var8);
            if (!Arrays.constantTimeAreEqual(var9, var10)) {
               throw new TlsFatalAlert((short)20);
            } else {
               return Arrays.copyOfRange(var4, var5, var5 + var8);
            }
         }
      }
   }

   public int getPlaintextLimit(int var1) {
      int var2 = var1;
      if (this.writeMac != null) {
         var2 = var1 - this.writeMac.getSize();
      }

      return var2;
   }

   public byte[] encodePlaintext(long var1, short var3, byte[] var4, int var5, int var6) throws IOException {
      if (this.writeMac == null) {
         return Arrays.copyOfRange(var4, var5, var5 + var6);
      } else {
         byte[] var7 = this.writeMac.calculateMac(var1, var3, var4, var5, var6);
         byte[] var8 = new byte[var6 + var7.length];
         System.arraycopy(var4, var5, var8, 0, var6);
         System.arraycopy(var7, 0, var8, var6, var7.length);
         return var8;
      }
   }

   public TlsNullCipher(TlsContext var1) {
      this.context = var1;
      this.writeMac = null;
      this.readMac = null;
   }
}
