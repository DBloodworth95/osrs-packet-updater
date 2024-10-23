package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

class LazyConstructionEnumeration implements Enumeration {
   Object nextObj;
   ASN1InputStream aIn;

   Object readObject() {
      try {
         return this.aIn.readObject();
      } catch (IOException var2) {
         throw new ASN1ParsingException("malformed DER construction: " + var2, var2);
      }
   }

   public boolean hasMoreElements() {
      return this.nextObj != null;
   }

   public Object nextElement() {
      Object var1 = this.nextObj;
      this.nextObj = this.readObject();
      return var1;
   }

   public LazyConstructionEnumeration(byte[] var1) {
      this.aIn = new ASN1InputStream(var1, true);
      this.nextObj = this.readObject();
   }
}
