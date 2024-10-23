package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

public class CBCBlockCipher implements BlockCipher {
   byte[] IV;
   byte[] cbcNextV;
   BlockCipher cipher = null;
   int blockSize;
   byte[] cbcV;
   boolean encrypting;

   public String getAlgorithmName() {
      return this.cipher.getAlgorithmName() + "/CBC";
   }

   public BlockCipher getUnderlyingCipher() {
      return this.cipher;
   }

   public void init(boolean var1, CipherParameters var2) throws IllegalArgumentException {
      boolean var3 = this.encrypting;
      this.encrypting = var1;
      if (var2 instanceof ParametersWithIV) {
         ParametersWithIV var4 = (ParametersWithIV)var2;
         byte[] var5 = var4.getIV();
         if (var5.length != this.blockSize) {
            throw new IllegalArgumentException("initialisation vector must be the same length as block size");
         }

         System.arraycopy(var5, 0, this.IV, 0, var5.length);
         this.reset();
         if (var4.getParameters() != null) {
            this.cipher.init(var1, var4.getParameters());
         } else if (var3 != var1) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
         }
      } else {
         this.reset();
         if (var2 != null) {
            this.cipher.init(var1, var2);
         } else if (var3 != var1) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
         }
      }

   }

   public void reset() {
      System.arraycopy(this.IV, 0, this.cbcV, 0, this.IV.length);
      Arrays.fill((byte[])this.cbcNextV, (byte)0);
      this.cipher.reset();
   }

   public int getBlockSize() {
      return this.cipher.getBlockSize();
   }

   public CBCBlockCipher(BlockCipher var1) {
      this.cipher = var1;
      this.blockSize = var1.getBlockSize();
      this.IV = new byte[this.blockSize];
      this.cbcV = new byte[this.blockSize];
      this.cbcNextV = new byte[this.blockSize];
   }

   int encryptBlock(byte[] var1, int var2, byte[] var3, int var4) throws DataLengthException, IllegalStateException {
      if (var2 + this.blockSize > var1.length) {
         throw new DataLengthException("input buffer too short");
      } else {
         int var5;
         for(var5 = 0; var5 < this.blockSize; ++var5) {
            byte[] var10000 = this.cbcV;
            var10000[var5] ^= var1[var2 + var5];
         }

         var5 = this.cipher.processBlock(this.cbcV, 0, var3, var4);
         System.arraycopy(var3, var4, this.cbcV, 0, this.cbcV.length);
         return var5;
      }
   }

   public int processBlock(byte[] var1, int var2, byte[] var3, int var4) throws DataLengthException, IllegalStateException {
      return this.encrypting ? this.encryptBlock(var1, var2, var3, var4) : this.decryptBlock(var1, var2, var3, var4);
   }

   int decryptBlock(byte[] var1, int var2, byte[] var3, int var4) throws DataLengthException, IllegalStateException {
      if (var2 + this.blockSize > var1.length) {
         throw new DataLengthException("input buffer too short");
      } else {
         System.arraycopy(var1, var2, this.cbcNextV, 0, this.blockSize);
         int var5 = this.cipher.processBlock(var1, var2, var3, var4);

         for(int var6 = 0; var6 < this.blockSize; ++var6) {
            var3[var4 + var6] ^= this.cbcV[var6];
         }

         byte[] var7 = this.cbcV;
         this.cbcV = this.cbcNextV;
         this.cbcNextV = var7;
         return var5;
      }
   }
}
