package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

public class TlsBlockCipher implements TlsCipher {
   public TlsMac readMac;
   public byte[] randomData;
   public boolean useExplicitIV;
   public boolean encryptThenMAC;
   public TlsMac writeMac;
   public BlockCipher decryptCipher;
   public BlockCipher encryptCipher;
   public TlsContext context;

   public TlsMac getReadMac() {
      return this.readMac;
   }

   public int chooseExtraPadBlocks(SecureRandom var1, int var2) {
      int var3 = var1.nextInt();
      int var4 = this.lowestBitSet(var3);
      return Math.min(var4, var2);
   }

   public TlsMac getWriteMac() {
      return this.writeMac;
   }

   public TlsBlockCipher(TlsContext var1, BlockCipher var2, BlockCipher var3, Digest var4, Digest var5, int var6) throws IOException {
      this.context = var1;
      this.randomData = new byte[256];
      var1.getNonceRandomGenerator().nextBytes(this.randomData);
      this.useExplicitIV = TlsUtils.isTLSv11(var1);
      this.encryptThenMAC = var1.getSecurityParameters().encryptThenMAC;
      int var7 = 2 * var6 + var4.getDigestSize() + var5.getDigestSize();
      if (!this.useExplicitIV) {
         var7 += var2.getBlockSize() + var3.getBlockSize();
      }

      byte[] var8 = TlsUtils.calculateKeyBlock(var1, var7);
      byte var9 = 0;
      TlsMac var10 = new TlsMac(var1, var4, var8, var9, var4.getDigestSize());
      int var18 = var9 + var4.getDigestSize();
      TlsMac var11 = new TlsMac(var1, var5, var8, var18, var5.getDigestSize());
      var18 += var5.getDigestSize();
      KeyParameter var12 = new KeyParameter(var8, var18, var6);
      var18 += var6;
      KeyParameter var13 = new KeyParameter(var8, var18, var6);
      var18 += var6;
      byte[] var14;
      byte[] var15;
      if (this.useExplicitIV) {
         var14 = new byte[var2.getBlockSize()];
         var15 = new byte[var3.getBlockSize()];
      } else {
         var14 = Arrays.copyOfRange(var8, var18, var18 + var2.getBlockSize());
         var18 += var2.getBlockSize();
         var15 = Arrays.copyOfRange(var8, var18, var18 + var3.getBlockSize());
         var18 += var3.getBlockSize();
      }

      if (var18 != var7) {
         throw new TlsFatalAlert((short)80);
      } else {
         ParametersWithIV var16;
         ParametersWithIV var17;
         if (var1.isServer()) {
            this.writeMac = var11;
            this.readMac = var10;
            this.encryptCipher = var3;
            this.decryptCipher = var2;
            var16 = new ParametersWithIV(var13, var15);
            var17 = new ParametersWithIV(var12, var14);
         } else {
            this.writeMac = var10;
            this.readMac = var11;
            this.encryptCipher = var2;
            this.decryptCipher = var3;
            var16 = new ParametersWithIV(var12, var14);
            var17 = new ParametersWithIV(var13, var15);
         }

         this.encryptCipher.init(true, var16);
         this.decryptCipher.init(false, var17);
      }
   }

   public byte[] encodePlaintext(long var1, short var3, byte[] var4, int var5, int var6) {
      int var7 = this.encryptCipher.getBlockSize();
      int var8 = this.writeMac.getSize();
      ProtocolVersion var9 = this.context.getServerVersion();
      int var10 = var6;
      if (!this.encryptThenMAC) {
         var10 = var6 + var8;
      }

      int var11 = var7 - 1 - var10 % var7;
      int var12;
      if (!var9.isDTLS() && !var9.isSSL()) {
         var12 = (255 - var11) / var7;
         int var13 = this.chooseExtraPadBlocks(this.context.getSecureRandom(), var12);
         var11 += var13 * var7;
      }

      var12 = var6 + var8 + var11 + 1;
      if (this.useExplicitIV) {
         var12 += var7;
      }

      byte[] var17 = new byte[var12];
      int var14 = 0;
      if (this.useExplicitIV) {
         byte[] var15 = new byte[var7];
         this.context.getNonceRandomGenerator().nextBytes(var15);
         this.encryptCipher.init(true, new ParametersWithIV((CipherParameters)null, var15));
         System.arraycopy(var15, 0, var17, var14, var7);
         var14 += var7;
      }

      int var18 = var14;
      System.arraycopy(var4, var5, var17, var14, var6);
      var14 += var6;
      byte[] var16;
      if (!this.encryptThenMAC) {
         var16 = this.writeMac.calculateMac(var1, var3, var4, var5, var6);
         System.arraycopy(var16, 0, var17, var14, var16.length);
         var14 += var16.length;
      }

      int var19;
      for(var19 = 0; var19 <= var11; ++var19) {
         var17[var14++] = (byte)var11;
      }

      for(var19 = var18; var19 < var14; var19 += var7) {
         this.encryptCipher.processBlock(var17, var19, var17, var19);
      }

      if (this.encryptThenMAC) {
         var16 = this.writeMac.calculateMac(var1, var3, var17, 0, var14);
         System.arraycopy(var16, 0, var17, var14, var16.length);
         int var10000 = var14 + var16.length;
      }

      return var17;
   }

   public byte[] decodeCiphertext(long var1, short var3, byte[] var4, int var5, int var6) throws IOException {
      int var7 = this.decryptCipher.getBlockSize();
      int var8 = this.readMac.getSize();
      int var9;
      if (this.encryptThenMAC) {
         var9 = var7 + var8;
      } else {
         var9 = Math.max(var7, var8 + 1);
      }

      if (this.useExplicitIV) {
         var9 += var7;
      }

      if (var6 < var9) {
         throw new TlsFatalAlert((short)50);
      } else {
         int var10 = var6;
         if (this.encryptThenMAC) {
            var10 = var6 - var8;
         }

         if (var10 % var7 != 0) {
            throw new TlsFatalAlert((short)21);
         } else {
            int var11;
            if (this.encryptThenMAC) {
               var11 = var5 + var6;
               byte[] var12 = Arrays.copyOfRange(var4, var11 - var8, var11);
               byte[] var13 = this.readMac.calculateMac(var1, var3, var4, var5, var6 - var8);
               boolean var14 = !Arrays.constantTimeAreEqual(var13, var12);
               if (var14) {
                  throw new TlsFatalAlert((short)20);
               }
            }

            if (this.useExplicitIV) {
               this.decryptCipher.init(false, new ParametersWithIV((CipherParameters)null, var4, var5, var7));
               var5 += var7;
               var10 -= var7;
            }

            for(var11 = 0; var11 < var10; var11 += var7) {
               this.decryptCipher.processBlock(var4, var5 + var11, var4, var5 + var11);
            }

            var11 = this.checkPaddingConstantTime(var4, var5, var10, var7, this.encryptThenMAC ? 0 : var8);
            boolean var18 = var11 == 0;
            int var19 = var10 - var11;
            if (!this.encryptThenMAC) {
               var19 -= var8;
               int var15 = var5 + var19;
               byte[] var16 = Arrays.copyOfRange(var4, var15, var15 + var8);
               byte[] var17 = this.readMac.calculateMacConstantTime(var1, var3, var4, var5, var19, var10 - var8, this.randomData);
               var18 |= !Arrays.constantTimeAreEqual(var17, var16);
            }

            if (var18) {
               throw new TlsFatalAlert((short)20);
            } else {
               return Arrays.copyOfRange(var4, var5, var5 + var19);
            }
         }
      }
   }

   public int checkPaddingConstantTime(byte[] var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 + var3;
      byte var7 = var1[var6 - 1];
      int var8 = var7 & 255;
      int var9 = var8 + 1;
      int var10 = 0;
      byte var11 = 0;
      if ((!TlsUtils.isSSL(this.context) || var9 <= var4) && var5 + var9 <= var3) {
         int var12 = var6 - var9;

         do {
            var11 = (byte)(var11 | var1[var12++] ^ var7);
         } while(var12 < var6);

         var10 = var9;
         if (var11 != 0) {
            var9 = 0;
         }
      } else {
         var9 = 0;
      }

      byte[] var13;
      for(var13 = this.randomData; var10 < 256; var11 = (byte)(var11 | var13[var10++] ^ var7)) {
      }

      var13[0] ^= var11;
      return var9;
   }

   public int getPlaintextLimit(int var1) {
      int var2 = this.encryptCipher.getBlockSize();
      int var3 = this.writeMac.getSize();
      int var4 = var1;
      if (this.useExplicitIV) {
         var4 = var1 - var2;
      }

      if (this.encryptThenMAC) {
         var4 -= var3;
         var4 -= var4 % var2;
      } else {
         var4 -= var4 % var2;
         var4 -= var3;
      }

      --var4;
      return var4;
   }

   public int lowestBitSet(int var1) {
      if (var1 == 0) {
         return 32;
      } else {
         int var2;
         for(var2 = 0; (var1 & 1) == 0; var1 >>= 1) {
            ++var2;
         }

         return var2;
      }
   }
}
