package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

public class BEROctetStringParser implements ASN1OctetStringParser {
   ASN1StreamParser _parser;

   public InputStream getOctetStream() {
      return new ConstructedOctetStream(this._parser);
   }

   public ASN1Primitive getLoadedObject() throws IOException {
      return new BEROctetString(Streams.readAll(this.getOctetStream()));
   }

   BEROctetStringParser(ASN1StreamParser var1) {
      this._parser = var1;
   }

   public ASN1Primitive toASN1Primitive() {
      try {
         return this.getLoadedObject();
      } catch (IOException var2) {
         throw new ASN1ParsingException("IOException converting stream to byte array: " + var2.getMessage(), var2);
      }
   }
}
