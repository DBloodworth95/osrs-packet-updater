package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;

class CCMBlockCipher$EBAOutStream extends ByteArrayOutputStream {
   // $FF: synthetic field
   final CCMBlockCipher this$0;

   public byte[] getBuffer() {
      return this.buf;
   }

   public CCMBlockCipher$EBAOutStream(CCMBlockCipher var1) {
      this.this$0 = var1;
   }
}
