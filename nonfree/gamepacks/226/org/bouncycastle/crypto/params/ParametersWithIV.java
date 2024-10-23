package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class ParametersWithIV implements CipherParameters {
   byte[] iv;
   CipherParameters parameters;

   public ParametersWithIV(CipherParameters var1, byte[] var2, int var3, int var4) {
      this.iv = new byte[var4];
      this.parameters = var1;
      System.arraycopy(var2, var3, this.iv, 0, var4);
   }

   public CipherParameters getParameters() {
      return this.parameters;
   }

   public byte[] getIV() {
      return this.iv;
   }

   public ParametersWithIV(CipherParameters var1, byte[] var2) {
      this(var1, var2, 0, var2.length);
   }
}
