package org.bouncycastle.asn1;

import java.io.IOException;

public class BERTaggedObjectParser implements ASN1TaggedObjectParser {
   boolean _constructed;
   int _tagNumber;
   ASN1StreamParser _parser;

   public int getTagNo() {
      return this._tagNumber;
   }

   public ASN1Primitive toASN1Primitive() {
      try {
         return this.getLoadedObject();
      } catch (IOException var2) {
         throw new ASN1ParsingException(var2.getMessage());
      }
   }

   public ASN1Primitive getLoadedObject() throws IOException {
      return this._parser.readTaggedObject(this._constructed, this._tagNumber);
   }

   public ASN1Encodable getObjectParser(int var1, boolean var2) throws IOException {
      if (var2) {
         if (!this._constructed) {
            throw new IOException("Explicit tags must be constructed (see X.690 8.14.2)");
         } else {
            return this._parser.readObject();
         }
      } else {
         return this._parser.readImplicit(this._constructed, var1);
      }
   }

   public boolean isConstructed() {
      return this._constructed;
   }

   BERTaggedObjectParser(boolean var1, int var2, ASN1StreamParser var3) {
      this._constructed = var1;
      this._tagNumber = var2;
      this._parser = var3;
   }
}
