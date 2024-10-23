package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class DERExternal extends ASN1Primitive {
   ASN1Primitive dataValueDescriptor;
   ASN1Integer indirectReference;
   ASN1ObjectIdentifier directReference;
   int encoding;
   ASN1Primitive externalContent;

   ASN1Primitive getObjFromVector(ASN1EncodableVector var1, int var2) {
      if (var1.size() <= var2) {
         throw new IllegalArgumentException("too few objects in input vector");
      } else {
         return var1.get(var2).toASN1Primitive();
      }
   }

   int encodedLength() throws IOException {
      return this.getEncoded().length;
   }

   void setDirectReference(ASN1ObjectIdentifier var1) {
      this.directReference = var1;
   }

   public DERExternal(ASN1ObjectIdentifier var1, ASN1Integer var2, ASN1Primitive var3, int var4, ASN1Primitive var5) {
      this.setDirectReference(var1);
      this.setIndirectReference(var2);
      this.setDataValueDescriptor(var3);
      this.setEncoding(var4);
      this.setExternalContent(var5.toASN1Primitive());
   }

   public int hashCode() {
      int var1 = 0;
      if (this.directReference != null) {
         var1 = this.directReference.hashCode();
      }

      if (this.indirectReference != null) {
         var1 ^= this.indirectReference.hashCode();
      }

      if (this.dataValueDescriptor != null) {
         var1 ^= this.dataValueDescriptor.hashCode();
      }

      var1 ^= this.externalContent.hashCode();
      return var1;
   }

   boolean isConstructed() {
      return true;
   }

   public int amf() {
      int var1 = 0;
      if (this.directReference != null) {
         var1 = this.directReference.hashCode();
      }

      if (this.indirectReference != null) {
         var1 ^= this.indirectReference.hashCode();
      }

      if (this.dataValueDescriptor != null) {
         var1 ^= this.dataValueDescriptor.hashCode();
      }

      var1 ^= this.externalContent.hashCode();
      return var1;
   }

   void encode(ASN1OutputStream var1) throws IOException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      if (this.directReference != null) {
         var2.write(this.directReference.getEncoded("DER"));
      }

      if (this.indirectReference != null) {
         var2.write(this.indirectReference.getEncoded("DER"));
      }

      if (this.dataValueDescriptor != null) {
         var2.write(this.dataValueDescriptor.getEncoded("DER"));
      }

      DERTaggedObject var3 = new DERTaggedObject(true, this.encoding, this.externalContent);
      var2.write(var3.getEncoded("DER"));
      var1.writeEncoded(32, 8, var2.toByteArray());
   }

   boolean asn1Equals(ASN1Primitive var1) {
      if (!(var1 instanceof DERExternal)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         DERExternal var2 = (DERExternal)var1;
         if (this.directReference == null || var2.directReference != null && var2.directReference.equals(this.directReference)) {
            if (this.indirectReference != null && (var2.indirectReference == null || !var2.indirectReference.equals(this.indirectReference))) {
               return false;
            } else {
               return this.dataValueDescriptor == null || var2.dataValueDescriptor != null && var2.dataValueDescriptor.equals(this.dataValueDescriptor) ? this.externalContent.equals(var2.externalContent) : false;
            }
         } else {
            return false;
         }
      }
   }

   public ASN1Primitive getDataValueDescriptor() {
      return this.dataValueDescriptor;
   }

   public ASN1ObjectIdentifier getDirectReference() {
      return this.directReference;
   }

   public int getEncoding() {
      return this.encoding;
   }

   public int ams() {
      int var1 = 0;
      if (this.directReference != null) {
         var1 = this.directReference.hashCode();
      }

      if (this.indirectReference != null) {
         var1 ^= this.indirectReference.hashCode();
      }

      if (this.dataValueDescriptor != null) {
         var1 ^= this.dataValueDescriptor.hashCode();
      }

      var1 ^= this.externalContent.hashCode();
      return var1;
   }

   void setEncoding(int var1) {
      if (var1 >= 0 && var1 <= 2) {
         this.encoding = var1;
      } else {
         throw new IllegalArgumentException("invalid encoding value: " + var1);
      }
   }

   void setDataValueDescriptor(ASN1Primitive var1) {
      this.dataValueDescriptor = var1;
   }

   public ASN1Primitive getExternalContent() {
      return this.externalContent;
   }

   public ASN1Integer getIndirectReference() {
      return this.indirectReference;
   }

   public DERExternal(ASN1EncodableVector var1) {
      int var2 = 0;
      ASN1Primitive var3 = this.getObjFromVector(var1, var2);
      if (var3 instanceof ASN1ObjectIdentifier) {
         this.directReference = (ASN1ObjectIdentifier)var3;
         ++var2;
         var3 = this.getObjFromVector(var1, var2);
      }

      if (var3 instanceof ASN1Integer) {
         this.indirectReference = (ASN1Integer)var3;
         ++var2;
         var3 = this.getObjFromVector(var1, var2);
      }

      if (!(var3 instanceof ASN1TaggedObject)) {
         this.dataValueDescriptor = var3;
         ++var2;
         var3 = this.getObjFromVector(var1, var2);
      }

      if (var1.size() != var2 + 1) {
         throw new IllegalArgumentException("input vector too large");
      } else if (!(var3 instanceof ASN1TaggedObject)) {
         throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
      } else {
         ASN1TaggedObject var4 = (ASN1TaggedObject)var3;
         this.setEncoding(var4.getTagNo());
         this.externalContent = var4.getObject();
      }
   }

   void setIndirectReference(ASN1Integer var1) {
      this.indirectReference = var1;
   }

   void setExternalContent(ASN1Primitive var1) {
      this.externalContent = var1;
   }

   public DERExternal(ASN1ObjectIdentifier var1, ASN1Integer var2, ASN1Primitive var3, DERTaggedObject var4) {
      this(var1, var2, var3, var4.getTagNo(), var4.toASN1Primitive());
   }

   public int amb() {
      int var1 = 0;
      if (this.directReference != null) {
         var1 = this.directReference.hashCode();
      }

      if (this.indirectReference != null) {
         var1 ^= this.indirectReference.hashCode();
      }

      if (this.dataValueDescriptor != null) {
         var1 ^= this.dataValueDescriptor.hashCode();
      }

      var1 ^= this.externalContent.hashCode();
      return var1;
   }

   public int amg() {
      int var1 = 0;
      if (this.directReference != null) {
         var1 = this.directReference.hashCode();
      }

      if (this.indirectReference != null) {
         var1 ^= this.indirectReference.hashCode();
      }

      if (this.dataValueDescriptor != null) {
         var1 ^= this.dataValueDescriptor.hashCode();
      }

      var1 ^= this.externalContent.hashCode();
      return var1;
   }

   public int aml() {
      int var1 = 0;
      if (this.directReference != null) {
         var1 = this.directReference.hashCode();
      }

      if (this.indirectReference != null) {
         var1 ^= this.indirectReference.hashCode();
      }

      if (this.dataValueDescriptor != null) {
         var1 ^= this.dataValueDescriptor.hashCode();
      }

      var1 ^= this.externalContent.hashCode();
      return var1;
   }
}
