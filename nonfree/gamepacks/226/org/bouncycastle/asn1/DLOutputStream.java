package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

public class DLOutputStream extends ASN1OutputStream {
   public void writeObject(ASN1Encodable var1) throws IOException {
      if (var1 != null) {
         var1.toASN1Primitive().toDLObject().encode(this);
      } else {
         throw new IOException("null object detected");
      }
   }

   public DLOutputStream(OutputStream var1) {
      super(var1);
   }
}
