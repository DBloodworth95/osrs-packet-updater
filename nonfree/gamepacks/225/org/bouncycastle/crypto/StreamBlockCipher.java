package org.bouncycastle.crypto;

public abstract class StreamBlockCipher implements BlockCipher, StreamCipher {
   final BlockCipher cipher;

   public final byte returnByte(byte var1) {
      return this.calculateByte(var1);
   }

   public BlockCipher getUnderlyingCipher() {
      return this.cipher;
   }

   public int processBytes(byte[] var1, int var2, int var3, byte[] var4, int var5) throws DataLengthException {
      if (var5 + var3 > var4.length) {
         throw new DataLengthException("output buffer too short");
      } else if (var2 + var3 > var1.length) {
         throw new DataLengthException("input buffer too small");
      } else {
         int var6 = var2;
         int var7 = var2 + var3;

         for(int var8 = var5; var6 < var7; var4[var8++] = this.calculateByte(var1[var6++])) {
         }

         return var3;
      }
   }

   public StreamBlockCipher(BlockCipher var1) {
      this.cipher = var1;
   }

   public abstract byte calculateByte(byte var1);
}
