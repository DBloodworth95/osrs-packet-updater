package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;

public class RC4Engine implements StreamCipher {
   byte[] engineState = null;
   int x = 0;
   static final int STATE_LENGTH = 256;
   int y = 0;
   byte[] workingKey = null;

   void setKey(byte[] var1) {
      this.workingKey = var1;
      this.x = 0;
      this.y = 0;
      if (this.engineState == null) {
         this.engineState = new byte[256];
      }

      int var2;
      for(var2 = 0; var2 < 256; ++var2) {
         this.engineState[var2] = (byte)var2;
      }

      var2 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < 256; ++var4) {
         var3 = (var1[var2] & 255) + this.engineState[var4] + var3 & 255;
         byte var5 = this.engineState[var4];
         this.engineState[var4] = this.engineState[var3];
         this.engineState[var3] = var5;
         var2 = (var2 + 1) % var1.length;
      }

   }

   public void init(boolean var1, CipherParameters var2) {
      if (var2 instanceof KeyParameter) {
         this.workingKey = ((KeyParameter)var2).getKey();
         this.setKey(this.workingKey);
      } else {
         throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + var2.getClass().getName());
      }
   }

   public String getAlgorithmName() {
      return "RC4";
   }

   public byte returnByte(byte var1) {
      this.x = this.x + 1 & 255;
      this.y = this.engineState[this.x] + this.y & 255;
      byte var2 = this.engineState[this.x];
      this.engineState[this.x] = this.engineState[this.y];
      this.engineState[this.y] = var2;
      return (byte)(var1 ^ this.engineState[this.engineState[this.x] + this.engineState[this.y] & 255]);
   }

   public void reset() {
      this.setKey(this.workingKey);
   }

   public int processBytes(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      if (var2 + var3 > var1.length) {
         throw new DataLengthException("input buffer too short");
      } else if (var5 + var3 > var4.length) {
         throw new OutputLengthException("output buffer too short");
      } else {
         for(int var6 = 0; var6 < var3; ++var6) {
            this.x = this.x + 1 & 255;
            this.y = this.engineState[this.x] + this.y & 255;
            byte var7 = this.engineState[this.x];
            this.engineState[this.x] = this.engineState[this.y];
            this.engineState[this.y] = var7;
            var4[var6 + var5] = (byte)(var1[var6 + var2] ^ this.engineState[this.engineState[this.x] + this.engineState[this.y] & 255]);
         }

         return var3;
      }
   }
}
