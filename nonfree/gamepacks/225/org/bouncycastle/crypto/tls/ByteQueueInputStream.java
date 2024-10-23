package org.bouncycastle.crypto.tls;

import java.io.InputStream;

public class ByteQueueInputStream extends InputStream {
   ByteQueue buffer = new ByteQueue();

   public int read(byte[] var1, int var2, int var3) {
      int var4 = Math.min(this.buffer.available(), var3);
      this.buffer.removeData(var1, var2, var4, 0);
      return var4;
   }

   public int peek(byte[] var1) {
      int var2 = Math.min(this.buffer.available(), var1.length);
      this.buffer.read(var1, 0, var2, 0);
      return var2;
   }

   public void addBytes(byte[] var1) {
      this.buffer.addData(var1, 0, var1.length);
   }

   public int read() {
      return this.buffer.available() == 0 ? -1 : this.buffer.removeData(1, 0)[0] & 255;
   }

   public int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   public long skip(long var1) {
      int var3 = Math.min((int)var1, this.buffer.available());
      this.buffer.removeData(var3);
      return (long)var3;
   }

   public int available() {
      return this.buffer.available();
   }

   public void close() {
   }
}
