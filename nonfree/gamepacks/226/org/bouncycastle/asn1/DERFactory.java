package org.bouncycastle.asn1;

class DERFactory {
   static final ASN1Sequence EMPTY_SEQUENCE = new DERSequence();
   static final ASN1Set EMPTY_SET = new DERSet();

   static ASN1Set createSet(ASN1EncodableVector var0) {
      return (ASN1Set)(var0.size() < 1 ? EMPTY_SET : new DLSet(var0));
   }

   static ASN1Sequence createSequence(ASN1EncodableVector var0) {
      return (ASN1Sequence)(var0.size() < 1 ? EMPTY_SEQUENCE : new DLSequence(var0));
   }
}
