package org.bouncycastle.asn1;

import java.util.Enumeration;

class BEROctetString$1 implements Enumeration {
   // $FF: synthetic field
   final BEROctetString this$0;
   int counter;

   public Object nextElement() {
      return BEROctetString.access$000(this.this$0)[this.counter++];
   }

   BEROctetString$1(BEROctetString var1) {
      this.this$0 = var1;
      this.counter = 0;
   }

   public boolean hasMoreElements() {
      return this.counter < BEROctetString.access$000(this.this$0).length;
   }
}
