package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class AttributeTypeAndValue extends ASN1Object {
   ASN1Encodable value;
   ASN1ObjectIdentifier type;

   public ASN1Primitive toASN1Primitive() {
      ASN1EncodableVector var1 = new ASN1EncodableVector();
      var1.add(this.type);
      var1.add(this.value);
      return new DERSequence(var1);
   }

   AttributeTypeAndValue(ASN1Sequence var1) {
      this.type = (ASN1ObjectIdentifier)var1.getObjectAt(0);
      this.value = var1.getObjectAt(1);
   }

   public AttributeTypeAndValue(ASN1ObjectIdentifier var1, ASN1Encodable var2) {
      this.type = var1;
      this.value = var2;
   }

   public static AttributeTypeAndValue getInstance(Object var0) {
      if (var0 instanceof AttributeTypeAndValue) {
         return (AttributeTypeAndValue)var0;
      } else if (var0 != null) {
         return new AttributeTypeAndValue(ASN1Sequence.getInstance(var0));
      } else {
         throw new IllegalArgumentException("null value in getInstance()");
      }
   }

   public ASN1Encodable getValue() {
      return this.value;
   }

   public ASN1ObjectIdentifier getType() {
      return this.type;
   }
}
