package org.bouncycastle.asn1;

import java.io.IOException;

public class DERSequenceParser implements ASN1SequenceParser {
   ASN1StreamParser _parser;

   public ASN1Primitive getLoadedObject() throws IOException {
      return new DERSequence(this._parser.readVector());
   }

   DERSequenceParser(ASN1StreamParser var1) {
      this._parser = var1;
   }

   public ASN1Encodable readObject() throws IOException {
      return this._parser.readObject();
   }

   public ASN1Primitive toASN1Primitive() {
      try {
         return this.getLoadedObject();
      } catch (IOException var2) {
         throw new IllegalStateException(var2.getMessage());
      }
   }
}
