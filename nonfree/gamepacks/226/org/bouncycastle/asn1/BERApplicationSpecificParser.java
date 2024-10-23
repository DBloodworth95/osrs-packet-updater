package org.bouncycastle.asn1;

import java.io.IOException;

public class BERApplicationSpecificParser implements ASN1ApplicationSpecificParser {
   final int tag;
   final ASN1StreamParser parser;

   public ASN1Primitive toASN1Primitive() {
      try {
         return this.getLoadedObject();
      } catch (IOException var2) {
         throw new ASN1ParsingException(var2.getMessage(), var2);
      }
   }

   public ASN1Encodable readObject() throws IOException {
      return this.parser.readObject();
   }

   BERApplicationSpecificParser(int var1, ASN1StreamParser var2) {
      this.tag = var1;
      this.parser = var2;
   }

   public ASN1Primitive getLoadedObject() throws IOException {
      return new BERApplicationSpecific(this.tag, this.parser.readVector());
   }
}
