package org.bouncycastle.asn1;

import java.io.IOException;

public class BERSequenceParser implements ASN1SequenceParser {
   ASN1StreamParser _parser;

   BERSequenceParser(ASN1StreamParser var1) {
      this._parser = var1;
   }

   public ASN1Primitive toASN1Primitive() {
      try {
         return this.getLoadedObject();
      } catch (IOException var2) {
         throw new IllegalStateException(var2.getMessage());
      }
   }

   public ASN1Primitive getLoadedObject() throws IOException {
      return new BERSequence(this._parser.readVector());
   }

   public ASN1Encodable readObject() throws IOException {
      return this._parser.readObject();
   }
}
