package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.OutputStream;

public class ByteQueueOutputStream extends OutputStream {
   ByteQueue buffer = new ByteQueue();

   public void write(int var1) throws IOException {
      this.buffer.addData(new byte[]{(byte)var1}, 0, 1);
   }

   public ByteQueue getBuffer() {
      return this.buffer;
   }

   public void write(byte[] var1, int var2, int var3) throws IOException {
      this.buffer.addData(var1, var2, var3);
   }
}
