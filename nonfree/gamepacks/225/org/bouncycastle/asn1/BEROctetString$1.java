package org.bouncycastle.asn1;

import java.util.Enumeration;

class BEROctetString$1 implements Enumeration {
   int counter;
   // $FF: synthetic field
   final BEROctetString this$0;

   public Object nextElement() {
      return BEROctetString.access$000(this.this$0)[this.counter++];
   }

   public boolean hasMoreElements() {
      return this.counter < BEROctetString.access$000(this.this$0).length;
   }

   BEROctetString$1(BEROctetString var1) {
      this.this$0 = var1;
      this.counter = 0;
   }
}
