package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class AEADParameters implements CipherParameters {
   byte[] nonce;
   KeyParameter key;
   int macSize;
   byte[] associatedText;

   public byte[] getNonce() {
      return this.nonce;
   }

   public int getMacSize() {
      return this.macSize;
   }

   public KeyParameter getKey() {
      return this.key;
   }

   public AEADParameters(KeyParameter var1, int var2, byte[] var3) {
      this(var1, var2, var3, (byte[])null);
   }

   public AEADParameters(KeyParameter var1, int var2, byte[] var3, byte[] var4) {
      this.key = var1;
      this.nonce = var3;
      this.macSize = var2;
      this.associatedText = var4;
   }

   public byte[] getAssociatedText() {
      return this.associatedText;
   }
}
