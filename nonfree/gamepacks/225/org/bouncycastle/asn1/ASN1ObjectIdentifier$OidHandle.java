package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;

class ASN1ObjectIdentifier$OidHandle {
   final byte[] enc;
   final int key;

   public int amy() {
      return this.key;
   }

   public int hashCode() {
      return this.key;
   }

   public boolean equals(Object var1) {
      return var1 instanceof ASN1ObjectIdentifier$OidHandle ? Arrays.areEqual(this.enc, ((ASN1ObjectIdentifier$OidHandle)var1).enc) : false;
   }

   public boolean gn(Object var1) {
      return var1 instanceof ASN1ObjectIdentifier$OidHandle ? Arrays.areEqual(this.enc, ((ASN1ObjectIdentifier$OidHandle)var1).enc) : false;
   }

   public boolean gg(Object var1) {
      return var1 instanceof ASN1ObjectIdentifier$OidHandle ? Arrays.areEqual(this.enc, ((ASN1ObjectIdentifier$OidHandle)var1).enc) : false;
   }

   ASN1ObjectIdentifier$OidHandle(byte[] var1) {
      this.key = Arrays.hashCode(var1);
      this.enc = var1;
   }

   public int amd() {
      return this.key;
   }
}
