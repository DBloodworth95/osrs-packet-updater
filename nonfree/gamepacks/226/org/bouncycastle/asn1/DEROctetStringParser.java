package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

public class DEROctetStringParser implements ASN1OctetStringParser {
   DefiniteLengthInputStream stream;

   public ASN1Primitive toASN1Primitive() {
      try {
         return this.getLoadedObject();
      } catch (IOException var2) {
         throw new ASN1ParsingException("IOException converting stream to byte array: " + var2.getMessage(), var2);
      }
   }

   public InputStream getOctetStream() {
      return this.stream;
   }

   public ASN1Primitive getLoadedObject() throws IOException {
      return new DEROctetString(this.stream.toByteArray());
   }

   DEROctetStringParser(DefiniteLengthInputStream var1) {
      this.stream = var1;
   }
}
