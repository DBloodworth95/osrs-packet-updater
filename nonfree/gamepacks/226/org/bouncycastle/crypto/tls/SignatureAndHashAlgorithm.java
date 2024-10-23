package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SignatureAndHashAlgorithm {
   public short signature;
   public short hash;

   public boolean equals(Object var1) {
      if (!(var1 instanceof SignatureAndHashAlgorithm)) {
         return false;
      } else {
         SignatureAndHashAlgorithm var2 = (SignatureAndHashAlgorithm)var1;
         return var2.getHash() == this.getHash() && var2.getSignature() == this.getSignature();
      }
   }

   public void encode(OutputStream var1) throws IOException {
      TlsUtils.writeUint8(this.getHash(), var1);
      TlsUtils.writeUint8(this.getSignature(), var1);
   }

   public short getSignature() {
      return this.signature;
   }

   public static SignatureAndHashAlgorithm parse(InputStream var0) throws IOException {
      short var1 = TlsUtils.readUint8(var0);
      short var2 = TlsUtils.readUint8(var0);
      return new SignatureAndHashAlgorithm(var1, var2);
   }

   public int hashCode() {
      return this.getHash() << 16 | this.getSignature();
   }

   public int amb() {
      return this.getHash() << 16 | this.getSignature();
   }

   public SignatureAndHashAlgorithm(short var1, short var2) {
      if (!TlsUtils.isValidUint8(var1)) {
         throw new IllegalArgumentException("'hash' should be a uint8");
      } else if (!TlsUtils.isValidUint8(var2)) {
         throw new IllegalArgumentException("'signature' should be a uint8");
      } else if (var2 == 0) {
         throw new IllegalArgumentException("'signature' MUST NOT be \"anonymous\"");
      } else {
         this.hash = var1;
         this.signature = var2;
      }
   }

   public boolean gj(Object var1) {
      if (!(var1 instanceof SignatureAndHashAlgorithm)) {
         return false;
      } else {
         SignatureAndHashAlgorithm var2 = (SignatureAndHashAlgorithm)var1;
         return var2.getHash() == this.getHash() && var2.getSignature() == this.getSignature();
      }
   }

   public int ams() {
      return this.getHash() << 16 | this.getSignature();
   }

   public short getHash() {
      return this.hash;
   }

   public int amf() {
      return this.getHash() << 16 | this.getSignature();
   }

   public int amg() {
      return this.getHash() << 16 | this.getSignature();
   }

   public int aml() {
      return this.getHash() << 16 | this.getSignature();
   }
}
