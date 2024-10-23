package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

public interface Encoder {
   int encode(byte[] var1, int var2, int var3, OutputStream var4) throws IOException;

   int decode(byte[] var1, int var2, int var3, OutputStream var4) throws IOException;

   int decode(String var1, OutputStream var2) throws IOException;
}
