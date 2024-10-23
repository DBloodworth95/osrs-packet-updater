package org.bouncycastle.asn1;

import java.util.Date;

public class DERGeneralizedTime extends ASN1GeneralizedTime {
   public DERGeneralizedTime(String var1) {
      super(var1);
   }

   public DERGeneralizedTime(Date var1) {
      super(var1);
   }

   DERGeneralizedTime(byte[] var1) {
      super(var1);
   }
}
