package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

class ASN1OutputStream$ImplicitOutStream extends ASN1OutputStream {
   boolean first;
   // $FF: synthetic field
   final ASN1OutputStream this$0;

   public ASN1OutputStream$ImplicitOutStream(ASN1OutputStream var1, OutputStream var2) {
      super(var2);
      this.this$0 = var1;
      this.first = true;
   }

   public void write(int var1) throws IOException {
      if (this.first) {
         this.first = false;
      } else {
         super.write(var1);
      }

   }
}
