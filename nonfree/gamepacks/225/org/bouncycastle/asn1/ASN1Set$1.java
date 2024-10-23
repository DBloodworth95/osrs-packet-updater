package org.bouncycastle.asn1;

import java.io.IOException;

class ASN1Set$1 implements ASN1SetParser {
   final int max;
   int index;
   // $FF: synthetic field
   final ASN1Set val$outer;
   // $FF: synthetic field
   final ASN1Set this$0;

   public ASN1Encodable readObject() throws IOException {
      if (this.index == this.max) {
         return null;
      } else {
         ASN1Encodable var1 = this.this$0.getObjectAt(this.index++);
         if (var1 instanceof ASN1Sequence) {
            return ((ASN1Sequence)var1).parser();
         } else {
            return (ASN1Encodable)(var1 instanceof ASN1Set ? ((ASN1Set)var1).parser() : var1);
         }
      }
   }

   public ASN1Primitive getLoadedObject() {
      return this.val$outer;
   }

   ASN1Set$1(ASN1Set var1, ASN1Set var2) {
      this.this$0 = var1;
      this.val$outer = var2;
      this.max = this.this$0.size();
   }

   public ASN1Primitive toASN1Primitive() {
      return this.val$outer;
   }
}
