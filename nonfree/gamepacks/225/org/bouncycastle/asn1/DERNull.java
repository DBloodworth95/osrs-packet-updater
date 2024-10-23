package org.bouncycastle.asn1;

import java.io.IOException;

public class DERNull extends ASN1Null {
   public static final DERNull INSTANCE = new DERNull();
   static final byte[] zeroBytes = new byte[0];

   void encode(ASN1OutputStream var1) throws IOException {
      var1.writeEncoded(5, zeroBytes);
   }

   boolean isConstructed() {
      return false;
   }

   int encodedLength() {
      return 2;
   }
}
