package org.bouncycastle.asn1;

import java.io.IOException;

public class ASN1Exception extends IOException {
   Throwable cause;

   public Throwable getCause() {
      return this.cause;
   }

   ASN1Exception(String var1, Throwable var2) {
      super(var1);
      this.cause = var2;
   }

   ASN1Exception(String var1) {
      super(var1);
   }
}
