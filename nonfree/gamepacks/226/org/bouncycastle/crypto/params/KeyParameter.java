package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class KeyParameter implements CipherParameters {
   byte[] key;

   public KeyParameter(byte[] var1, int var2, int var3) {
      this.key = new byte[var3];
      System.arraycopy(var1, var2, this.key, 0, var3);
   }

   public KeyParameter(byte[] var1) {
      this(var1, 0, var1.length);
   }

   public byte[] getKey() {
      return this.key;
   }
}
