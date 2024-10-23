package org.bouncycastle.asn1;

import java.io.IOException;

public interface ASN1TaggedObjectParser extends ASN1Encodable, InMemoryRepresentable {
   ASN1Encodable getObjectParser(int var1, boolean var2) throws IOException;

   int getTagNo();
}
