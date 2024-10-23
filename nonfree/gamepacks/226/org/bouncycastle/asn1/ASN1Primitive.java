package org.bouncycastle.asn1;

import java.io.IOException;

public abstract class ASN1Primitive extends ASN1Object {
   abstract boolean isConstructed();

   public static ASN1Primitive fromByteArray(byte[] var0) throws IOException {
      ASN1InputStream var1 = new ASN1InputStream(var0);

      try {
         ASN1Primitive var2 = var1.readObject();
         if (var1.available() != 0) {
            throw new IOException("Extra data detected in stream");
         } else {
            return var2;
         }
      } catch (ClassCastException var3) {
         throw new IOException("cannot recognise object in stream");
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof ASN1Encodable && this.asn1Equals(((ASN1Encodable)var1).toASN1Primitive());
      }
   }

   public ASN1Primitive toASN1Primitive() {
      return this;
   }

   public abstract int ams();

   ASN1Primitive toDLObject() {
      return this;
   }

   ASN1Primitive toDERObject() {
      return this;
   }

   public abstract int amg();

   abstract int encodedLength() throws IOException;

   abstract void encode(ASN1OutputStream var1) throws IOException;

   abstract boolean asn1Equals(ASN1Primitive var1);

   public final boolean gj(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof ASN1Encodable && this.asn1Equals(((ASN1Encodable)var1).toASN1Primitive());
      }
   }

   public abstract int hashCode();

   public abstract int amf();

   public abstract int amb();

   ASN1Primitive() {
   }

   public abstract int aml();
}
