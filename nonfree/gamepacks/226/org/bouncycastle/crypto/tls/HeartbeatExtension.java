package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class HeartbeatExtension {
   public short mode;

   public HeartbeatExtension(short var1) {
      if (!HeartbeatMode.isValid(var1)) {
         throw new IllegalArgumentException("'mode' is not a valid HeartbeatMode value");
      } else {
         this.mode = var1;
      }
   }

   public short getMode() {
      return this.mode;
   }

   public void encode(OutputStream var1) throws IOException {
      TlsUtils.writeUint8(this.mode, var1);
   }

   public static HeartbeatExtension parse(InputStream var0) throws IOException {
      short var1 = TlsUtils.readUint8(var0);
      if (!HeartbeatMode.isValid(var1)) {
         throw new TlsFatalAlert((short)47);
      } else {
         return new HeartbeatExtension(var1);
      }
   }
}
