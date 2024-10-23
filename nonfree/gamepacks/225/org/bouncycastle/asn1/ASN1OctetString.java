package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

public abstract class ASN1OctetString extends ASN1Primitive implements ASN1OctetStringParser {
   byte[] string;

   public String toString() {
      return "#" + Strings.fromByteArray(Hex.encode(this.string));
   }

   public static ASN1OctetString getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof ASN1OctetString)) {
         if (var0 instanceof byte[]) {
            try {
               return getInstance(ASN1Primitive.fromByteArray((byte[])((byte[])var0)));
            } catch (IOException var2) {
               throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + var2.getMessage());
            }
         } else {
            if (var0 instanceof ASN1Encodable) {
               ASN1Primitive var1 = ((ASN1Encodable)var0).toASN1Primitive();
               if (var1 instanceof ASN1OctetString) {
                  return (ASN1OctetString)var1;
               }
            }

            throw new IllegalArgumentException("illegal object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (ASN1OctetString)var0;
      }
   }

   public ASN1OctetString(byte[] var1) {
      if (var1 == null) {
         throw new NullPointerException("string cannot be null");
      } else {
         this.string = var1;
      }
   }

   public InputStream getOctetStream() {
      return new ByteArrayInputStream(this.string);
   }

   public ASN1OctetStringParser parser() {
      return this;
   }

   public byte[] getOctets() {
      return this.string;
   }

   public static ASN1OctetString getInstance(ASN1TaggedObject var0, boolean var1) {
      ASN1Primitive var2 = var0.getObject();
      return (ASN1OctetString)(!var1 && !(var2 instanceof ASN1OctetString) ? BEROctetString.fromSequence(ASN1Sequence.getInstance(var2)) : getInstance(var2));
   }

   boolean asn1Equals(ASN1Primitive var1) {
      if (!(var1 instanceof ASN1OctetString)) {
         return false;
      } else {
         ASN1OctetString var2 = (ASN1OctetString)var1;
         return Arrays.areEqual(this.string, var2.string);
      }
   }

   public ASN1Primitive getLoadedObject() {
      return this.toASN1Primitive();
   }

   public int hashCode() {
      return Arrays.hashCode(this.getOctets());
   }

   ASN1Primitive toDLObject() {
      return new DEROctetString(this.string);
   }

   abstract void encode(ASN1OutputStream var1) throws IOException;

   public int amy() {
      return Arrays.hashCode(this.getOctets());
   }

   ASN1Primitive toDERObject() {
      return new DEROctetString(this.string);
   }

   public int amd() {
      return Arrays.hashCode(this.getOctets());
   }

   public String aml() {
      return "#" + Strings.fromByteArray(Hex.encode(this.string));
   }

   public String amp() {
      return "#" + Strings.fromByteArray(Hex.encode(this.string));
   }

   public String ame() {
      return "#" + Strings.fromByteArray(Hex.encode(this.string));
   }
}
