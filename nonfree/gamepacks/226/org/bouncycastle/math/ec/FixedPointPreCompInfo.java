package org.bouncycastle.math.ec;

public class FixedPointPreCompInfo implements PreCompInfo {
   public int width = -1;
   public ECPoint[] preComp = null;

   public void setWidth(int var1) {
      this.width = var1;
   }

   public int getWidth() {
      return this.width;
   }

   public void setPreComp(ECPoint[] var1) {
      this.preComp = var1;
   }

   public ECPoint[] getPreComp() {
      return this.preComp;
   }
}
