package org.bouncycastle.crypto;

public class CryptoException extends Exception {
   Throwable cause;

   public CryptoException() {
   }

   public CryptoException(String var1) {
      super(var1);
   }

   public Throwable getCause() {
      return this.cause;
   }

   public CryptoException(String var1, Throwable var2) {
      super(var1);
      this.cause = var2;
   }
}
