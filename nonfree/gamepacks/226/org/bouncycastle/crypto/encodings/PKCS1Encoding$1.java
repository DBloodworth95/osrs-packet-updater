package org.bouncycastle.crypto.encodings;

import java.security.PrivilegedAction;

class PKCS1Encoding$1 implements PrivilegedAction {
   // $FF: synthetic field
   final PKCS1Encoding this$0;

   PKCS1Encoding$1(PKCS1Encoding var1) {
      this.this$0 = var1;
   }

   public Object run() {
      return System.getProperty("org.bouncycastle.pkcs1.strict");
   }
}
