package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DigitallySigned {
   public byte[] signature;
   public SignatureAndHashAlgorithm algorithm;

   public static DigitallySigned parse(TlsContext var0, InputStream var1) throws IOException {
      SignatureAndHashAlgorithm var2 = null;
      if (TlsUtils.isTLSv12(var0)) {
         var2 = SignatureAndHashAlgorithm.parse(var1);
      }

      byte[] var3 = TlsUtils.readOpaque16(var1);
      return new DigitallySigned(var2, var3);
   }

   public SignatureAndHashAlgorithm getAlgorithm() {
      return this.algorithm;
   }

   public byte[] getSignature() {
      return this.signature;
   }

   public void encode(OutputStream var1) throws IOException {
      if (this.algorithm != null) {
         this.algorithm.encode(var1);
      }

      TlsUtils.writeOpaque16(this.signature, var1);
   }

   public DigitallySigned(SignatureAndHashAlgorithm var1, byte[] var2) {
      if (var2 == null) {
         throw new IllegalArgumentException("'signature' cannot be null");
      } else {
         this.algorithm = var1;
         this.signature = var2;
      }
   }
}
