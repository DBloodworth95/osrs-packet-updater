package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;

class ASN1ObjectIdentifier$OidHandle {
   final byte[] enc;
   final int key;

   public int ams() {
      return this.key;
   }

   public int hashCode() {
      return this.key;
   }

   public int aml() {
      return this.key;
   }

   public int amb() {
      return this.key;
   }

   public boolean equals(Object var1) {
      return var1 instanceof ASN1ObjectIdentifier$OidHandle ? Arrays.areEqual(this.enc, ((ASN1ObjectIdentifier$OidHandle)var1).enc) : false;
   }

   public int amf() {
      return this.key;
   }

   ASN1ObjectIdentifier$OidHandle(byte[] var1) {
      this.key = Arrays.hashCode(var1);
      this.enc = var1;
   }

   public int amg() {
      return this.key;
   }

   public boolean gj(Object var1) {
      return var1 instanceof ASN1ObjectIdentifier$OidHandle ? Arrays.areEqual(this.enc, ((ASN1ObjectIdentifier$OidHandle)var1).enc) : false;
   }
}
