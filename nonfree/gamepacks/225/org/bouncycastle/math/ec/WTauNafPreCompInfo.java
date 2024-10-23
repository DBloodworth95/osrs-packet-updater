package org.bouncycastle.math.ec;

public class WTauNafPreCompInfo implements PreCompInfo {
   public ECPoint$AbstractF2m[] preComp = null;

   public void setPreComp(ECPoint$AbstractF2m[] var1) {
      this.preComp = var1;
   }

   public ECPoint$AbstractF2m[] getPreComp() {
      return this.preComp;
   }
}
