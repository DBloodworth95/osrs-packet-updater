package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

class TlsProtocol$HandshakeMessage extends ByteArrayOutputStream {
   // $FF: synthetic field
   final TlsProtocol this$0;

   TlsProtocol$HandshakeMessage(TlsProtocol var1, short var2) throws IOException {
      this(var1, var2, 60);
   }

   TlsProtocol$HandshakeMessage(TlsProtocol var1, short var2, int var3) throws IOException {
      super(var3 + 4);
      this.this$0 = var1;
      TlsUtils.writeUint8((short)var2, this);
      this.count += 3;
   }

   void writeToRecordStream() throws IOException {
      int var1 = this.count - 4;
      TlsUtils.checkUint24(var1);
      TlsUtils.writeUint24(var1, this.buf, 1);
      this.this$0.writeHandshakeMessage(this.buf, 0, this.count);
      this.buf = null;
   }
}
