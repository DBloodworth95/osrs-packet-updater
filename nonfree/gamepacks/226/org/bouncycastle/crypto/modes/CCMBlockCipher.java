package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

public class CCMBlockCipher implements AEADBlockCipher {
   CCMBlockCipher$EBAOutStream associatedText = new CCMBlockCipher$EBAOutStream(this);
   int blockSize;
   CCMBlockCipher$EBAOutStream data = new CCMBlockCipher$EBAOutStream(this);
   byte[] nonce;
   byte[] initialAssociatedText;
   boolean forEncryption;
   CipherParameters keyParam;
   byte[] macBlock;
   int macSize;
   BlockCipher cipher;

   public BlockCipher getUnderlyingCipher() {
      return this.cipher;
   }

   public byte[] getMac() {
      byte[] var1 = new byte[this.macSize];
      System.arraycopy(this.macBlock, 0, var1, 0, var1.length);
      return var1;
   }

   public CCMBlockCipher(BlockCipher var1) {
      this.cipher = var1;
      this.blockSize = var1.getBlockSize();
      this.macBlock = new byte[this.blockSize];
      if (this.blockSize != 16) {
         throw new IllegalArgumentException("cipher required with a block size of 16.");
      }
   }

   public String getAlgorithmName() {
      return this.cipher.getAlgorithmName() + "/CCM";
   }

   public void processAADByte(byte var1) {
      this.associatedText.write(var1);
   }

   public int processBytes(byte[] var1, int var2, int var3, byte[] var4, int var5) throws DataLengthException, IllegalStateException {
      if (var1.length < var2 + var3) {
         throw new DataLengthException("Input buffer too short");
      } else {
         this.data.write(var1, var2, var3);
         return 0;
      }
   }

   public int processByte(byte var1, byte[] var2, int var3) throws DataLengthException, IllegalStateException {
      this.data.write(var1);
      return 0;
   }

   boolean hasAssociatedText() {
      return this.getAssociatedTextLength() > 0;
   }

   public int doFinal(byte[] var1, int var2) throws IllegalStateException, InvalidCipherTextException {
      int var3 = this.processPacket(this.data.getBuffer(), 0, this.data.size(), var1, var2);
      this.reset();
      return var3;
   }

   public void reset() {
      this.cipher.reset();
      this.associatedText.reset();
      this.data.reset();
   }

   public void processAADBytes(byte[] var1, int var2, int var3) {
      this.associatedText.write(var1, var2, var3);
   }

   public int processPacket(byte[] var1, int var2, int var3, byte[] var4, int var5) throws IllegalStateException, InvalidCipherTextException, DataLengthException {
      if (this.keyParam == null) {
         throw new IllegalStateException("CCM cipher unitialized.");
      } else {
         int var6 = this.nonce.length;
         int var7 = 15 - var6;
         if (var7 < 4) {
            int var8 = 1 << 8 * var7;
            if (var3 >= var8) {
               throw new IllegalStateException("CCM packet too large for choice of q.");
            }
         }

         byte[] var15 = new byte[this.blockSize];
         var15[0] = (byte)(var7 - 1 & 7);
         System.arraycopy(this.nonce, 0, var15, 1, this.nonce.length);
         SICBlockCipher var9 = new SICBlockCipher(this.cipher);
         var9.init(this.forEncryption, new ParametersWithIV(this.keyParam, var15));
         int var11 = var2;
         int var12 = var5;
         int var10;
         byte[] var13;
         byte[] var14;
         if (this.forEncryption) {
            var10 = var3 + this.macSize;
            if (var4.length < var10 + var5) {
               throw new OutputLengthException("Output buffer too short.");
            }

            this.calculateMac(var1, var2, var3, this.macBlock);
            var13 = new byte[this.blockSize];
            var9.processBlock(this.macBlock, 0, var13, 0);

            while(var11 < var2 + var3 - this.blockSize) {
               var9.processBlock(var1, var11, var4, var12);
               var12 += this.blockSize;
               var11 += this.blockSize;
            }

            var14 = new byte[this.blockSize];
            System.arraycopy(var1, var11, var14, 0, var3 + var2 - var11);
            var9.processBlock(var14, 0, var14, 0);
            System.arraycopy(var14, 0, var4, var12, var3 + var2 - var11);
            System.arraycopy(var13, 0, var4, var5 + var3, this.macSize);
         } else {
            if (var3 < this.macSize) {
               throw new InvalidCipherTextException("data too short");
            }

            var10 = var3 - this.macSize;
            if (var4.length < var10 + var5) {
               throw new OutputLengthException("Output buffer too short.");
            }

            System.arraycopy(var1, var2 + var10, this.macBlock, 0, this.macSize);
            var9.processBlock(this.macBlock, 0, this.macBlock, 0);

            for(int var16 = this.macSize; var16 != this.macBlock.length; ++var16) {
               this.macBlock[var16] = 0;
            }

            while(var11 < var2 + var10 - this.blockSize) {
               var9.processBlock(var1, var11, var4, var12);
               var12 += this.blockSize;
               var11 += this.blockSize;
            }

            var13 = new byte[this.blockSize];
            System.arraycopy(var1, var11, var13, 0, var10 - (var11 - var2));
            var9.processBlock(var13, 0, var13, 0);
            System.arraycopy(var13, 0, var4, var12, var10 - (var11 - var2));
            var14 = new byte[this.blockSize];
            this.calculateMac(var4, var5, var10, var14);
            if (!Arrays.constantTimeAreEqual(this.macBlock, var14)) {
               throw new InvalidCipherTextException("mac check in CCM failed");
            }
         }

         return var10;
      }
   }

   public int getOutputSize(int var1) {
      int var2 = var1 + this.data.size();
      if (this.forEncryption) {
         return var2 + this.macSize;
      } else {
         return var2 < this.macSize ? 0 : var2 - this.macSize;
      }
   }

   public byte[] processPacket(byte[] var1, int var2, int var3) throws IllegalStateException, InvalidCipherTextException {
      byte[] var4;
      if (this.forEncryption) {
         var4 = new byte[var3 + this.macSize];
      } else {
         if (var3 < this.macSize) {
            throw new InvalidCipherTextException("data too short");
         }

         var4 = new byte[var3 - this.macSize];
      }

      this.processPacket(var1, var2, var3, var4, 0);
      return var4;
   }

   int getAssociatedTextLength() {
      return this.associatedText.size() + (this.initialAssociatedText == null ? 0 : this.initialAssociatedText.length);
   }

   int calculateMac(byte[] var1, int var2, int var3, byte[] var4) {
      CBCBlockCipherMac var5 = new CBCBlockCipherMac(this.cipher, this.macSize * 8);
      var5.init(this.keyParam);
      byte[] var6 = new byte[16];
      if (this.hasAssociatedText()) {
         var6[0] = (byte)(var6[0] | 64);
      }

      var6[0] = (byte)(var6[0] | ((var5.getMacSize() - 2) / 2 & 7) << 3);
      var6[0] = (byte)(var6[0] | 15 - this.nonce.length - 1 & 7);
      System.arraycopy(this.nonce, 0, var6, 1, this.nonce.length);
      int var7 = var3;

      for(int var8 = 1; var7 > 0; ++var8) {
         var6[var6.length - var8] = (byte)(var7 & 255);
         var7 >>>= 8;
      }

      var5.update(var6, 0, var6.length);
      if (this.hasAssociatedText()) {
         int var10 = this.getAssociatedTextLength();
         byte var9;
         if (var10 < 65280) {
            var5.update((byte)(var10 >> 8));
            var5.update((byte)var10);
            var9 = 2;
         } else {
            var5.update((byte)-1);
            var5.update((byte)-2);
            var5.update((byte)(var10 >> 24));
            var5.update((byte)(var10 >> 16));
            var5.update((byte)(var10 >> 8));
            var5.update((byte)var10);
            var9 = 6;
         }

         if (this.initialAssociatedText != null) {
            var5.update(this.initialAssociatedText, 0, this.initialAssociatedText.length);
         }

         if (this.associatedText.size() > 0) {
            var5.update(this.associatedText.getBuffer(), 0, this.associatedText.size());
         }

         int var12 = (var9 + var10) % 16;
         if (var12 != 0) {
            for(int var11 = var12; var11 != 16; ++var11) {
               var5.update((byte)0);
            }
         }
      }

      var5.update(var1, var2, var3);
      return var5.doFinal(var4, 0);
   }

   public int getUpdateOutputSize(int var1) {
      return 0;
   }

   public void init(boolean var1, CipherParameters var2) throws IllegalArgumentException {
      this.forEncryption = var1;
      Object var3;
      if (var2 instanceof AEADParameters) {
         AEADParameters var4 = (AEADParameters)var2;
         this.nonce = var4.getNonce();
         this.initialAssociatedText = var4.getAssociatedText();
         this.macSize = var4.getMacSize() / 8;
         var3 = var4.getKey();
      } else {
         if (!(var2 instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("invalid parameters passed to CCM: " + var2.getClass().getName());
         }

         ParametersWithIV var5 = (ParametersWithIV)var2;
         this.nonce = var5.getIV();
         this.initialAssociatedText = null;
         this.macSize = this.macBlock.length / 2;
         var3 = var5.getParameters();
      }

      if (var3 != null) {
         this.keyParam = (CipherParameters)var3;
      }

      if (this.nonce != null && this.nonce.length >= 7 && this.nonce.length <= 13) {
         this.reset();
      } else {
         throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
      }
   }
}
