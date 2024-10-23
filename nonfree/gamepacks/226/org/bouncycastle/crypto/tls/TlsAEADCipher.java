package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

public class TlsAEADCipher implements TlsCipher {
   public int record_iv_length;
   static final int NONCE_DRAFT_CHACHA20_POLY1305 = 2;
   public static final int NONCE_RFC5288 = 1;
   public int macSize;
   public AEADBlockCipher decryptCipher;
   public AEADBlockCipher encryptCipher;
   public TlsContext context;
   public byte[] encryptImplicitNonce;
   public byte[] decryptImplicitNonce;
   public int nonceMode;

   public byte[] getAdditionalData(long var1, short var3, int var4) throws IOException {
      byte[] var5 = new byte[13];
      TlsUtils.writeUint64(var1, var5, 0);
      TlsUtils.writeUint8((short)var3, var5, 8);
      TlsUtils.writeVersion(this.context.getServerVersion(), var5, 9);
      TlsUtils.writeUint16(var4, var5, 11);
      return var5;
   }

   public byte[] decodeCiphertext(long var1, short var3, byte[] var4, int var5, int var6) throws IOException {
      if (this.getPlaintextLimit(var6) < 0) {
         throw new TlsFatalAlert((short)50);
      } else {
         byte[] var7;
         int var8;
         var7 = new byte[this.decryptImplicitNonce.length + this.record_iv_length];
         label33:
         switch(this.nonceMode) {
         case 1:
            System.arraycopy(this.decryptImplicitNonce, 0, var7, 0, this.decryptImplicitNonce.length);
            System.arraycopy(var4, var5, var7, var7.length - this.record_iv_length, this.record_iv_length);
            break;
         case 2:
            TlsUtils.writeUint64(var1, var7, var7.length - 8);
            var8 = 0;

            while(true) {
               if (var8 >= this.decryptImplicitNonce.length) {
                  break label33;
               }

               var7[var8] ^= this.decryptImplicitNonce[var8];
               ++var8;
            }
         default:
            throw new TlsFatalAlert((short)80);
         }

         var8 = var5 + this.record_iv_length;
         int var9 = var6 - this.record_iv_length;
         int var10 = this.decryptCipher.getOutputSize(var9);
         byte[] var11 = new byte[var10];
         byte var12 = 0;
         byte[] var13 = this.getAdditionalData(var1, var3, var10);
         AEADParameters var14 = new AEADParameters((KeyParameter)null, 8 * this.macSize, var7, var13);

         int var17;
         try {
            this.decryptCipher.init(false, var14);
            var17 = var12 + this.decryptCipher.processBytes(var4, var8, var9, var11, var12);
            var17 += this.decryptCipher.doFinal(var11, var17);
         } catch (Exception var16) {
            throw new TlsFatalAlert((short)20, var16);
         }

         if (var17 != var11.length) {
            throw new TlsFatalAlert((short)80);
         } else {
            return var11;
         }
      }
   }

   TlsAEADCipher(TlsContext var1, AEADBlockCipher var2, AEADBlockCipher var3, int var4, int var5, int var6) throws IOException {
      if (!TlsUtils.isTLSv12(var1)) {
         throw new TlsFatalAlert((short)80);
      } else {
         this.nonceMode = var6;
         byte var7;
         switch(var6) {
         case 1:
            var7 = 4;
            this.record_iv_length = 8;
            break;
         case 2:
            var7 = 12;
            this.record_iv_length = 0;
            break;
         default:
            throw new TlsFatalAlert((short)80);
         }

         this.context = var1;
         this.macSize = var5;
         int var8 = 2 * var4 + 2 * var7;
         byte[] var9 = TlsUtils.calculateKeyBlock(var1, var8);
         byte var10 = 0;
         KeyParameter var11 = new KeyParameter(var9, var10, var4);
         int var18 = var10 + var4;
         KeyParameter var12 = new KeyParameter(var9, var18, var4);
         var18 += var4;
         byte[] var13 = Arrays.copyOfRange(var9, var18, var18 + var7);
         var18 += var7;
         byte[] var14 = Arrays.copyOfRange(var9, var18, var18 + var7);
         var18 += var7;
         if (var18 != var8) {
            throw new TlsFatalAlert((short)80);
         } else {
            KeyParameter var15;
            KeyParameter var16;
            if (var1.isServer()) {
               this.encryptCipher = var3;
               this.decryptCipher = var2;
               this.encryptImplicitNonce = var14;
               this.decryptImplicitNonce = var13;
               var15 = var12;
               var16 = var11;
            } else {
               this.encryptCipher = var2;
               this.decryptCipher = var3;
               this.encryptImplicitNonce = var13;
               this.decryptImplicitNonce = var14;
               var15 = var11;
               var16 = var12;
            }

            byte[] var17 = new byte[var7 + this.record_iv_length];
            this.encryptCipher.init(true, new AEADParameters(var15, 8 * var5, var17));
            this.decryptCipher.init(false, new AEADParameters(var16, 8 * var5, var17));
         }
      }
   }

   public byte[] encodePlaintext(long var1, short var3, byte[] var4, int var5, int var6) throws IOException {
      byte[] var7;
      int var8;
      var7 = new byte[this.encryptImplicitNonce.length + this.record_iv_length];
      label34:
      switch(this.nonceMode) {
      case 1:
         System.arraycopy(this.encryptImplicitNonce, 0, var7, 0, this.encryptImplicitNonce.length);
         TlsUtils.writeUint64(var1, var7, this.encryptImplicitNonce.length);
         break;
      case 2:
         TlsUtils.writeUint64(var1, var7, var7.length - 8);
         var8 = 0;

         while(true) {
            if (var8 >= this.encryptImplicitNonce.length) {
               break label34;
            }

            var7[var8] ^= this.encryptImplicitNonce[var8];
            ++var8;
         }
      default:
         throw new TlsFatalAlert((short)80);
      }

      var8 = var5;
      int var9 = var6;
      int var10 = this.encryptCipher.getOutputSize(var6);
      byte[] var11 = new byte[this.record_iv_length + var10];
      if (this.record_iv_length != 0) {
         System.arraycopy(var7, var7.length - this.record_iv_length, var11, 0, this.record_iv_length);
      }

      int var12 = this.record_iv_length;
      byte[] var13 = this.getAdditionalData(var1, var3, var6);
      AEADParameters var14 = new AEADParameters((KeyParameter)null, 8 * this.macSize, var7, var13);

      try {
         this.encryptCipher.init(true, var14);
         var12 += this.encryptCipher.processBytes(var4, var8, var9, var11, var12);
         var12 += this.encryptCipher.doFinal(var11, var12);
      } catch (Exception var16) {
         throw new TlsFatalAlert((short)80, var16);
      }

      if (var12 != var11.length) {
         throw new TlsFatalAlert((short)80);
      } else {
         return var11;
      }
   }

   public TlsAEADCipher(TlsContext var1, AEADBlockCipher var2, AEADBlockCipher var3, int var4, int var5) throws IOException {
      this(var1, var2, var3, var4, var5, 1);
   }

   public int getPlaintextLimit(int var1) {
      return var1 - this.macSize - this.record_iv_length;
   }
}
